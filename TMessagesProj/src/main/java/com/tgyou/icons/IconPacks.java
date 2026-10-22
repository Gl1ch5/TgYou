package com.tgyou.icons;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.LruCache;

import com.caverock.androidsvg.SVG;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * exteraGram-compatible icon packs: a ZIP ({@code .icons}) with metadata.json that maps Telegram
 * drawable names (msg_delete, ic_ab_back ...) to SVG/PNG files. The active pack replaces drawables
 * through {@link PackResources}, which LaunchActivity and ApplicationLoader return from getResources().
 */
public final class IconPacks {

    private static final String PREFS = "tgyou_icons";
    private static final String KEY_ACTIVE = "active";
    private static final long MAX_UNPACKED = 80L * 1024 * 1024;
    private static final int MAX_FILES = 3000;

    public static final class Pack {
        public String id;
        public String name;
        public String author;
        public String version;
        public int icons;
    }

    private static volatile boolean loaded;
    private static volatile String activeId;
    private static volatile Map<String, String> activeMap = java.util.Collections.emptyMap();
    private static volatile File activeDir;
    private static final Map<Resources, PackResources> wrappers = new WeakHashMap<>();
    private static final LruCache<String, Bitmap> bitmaps = new LruCache<String, Bitmap>(24 * 1024 * 1024) {
        @Override
        protected int sizeOf(String key, Bitmap value) {
            return value.getByteCount();
        }
    };

    private IconPacks() {
    }

    private static File root(Context context) {
        File dir = new File(context.getFilesDir(), "iconpacks");
        dir.mkdirs();
        return dir;
    }

    private static synchronized void ensureLoaded(Context context) {
        if (loaded) {
            return;
        }
        loaded = true;
        String id = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getString(KEY_ACTIVE, "");
        applyActive(context, id);
    }

    private static void applyActive(Context context, String id) {
        bitmaps.evictAll();
        PackResources.forgetNames();
        activeId = null;
        activeMap = java.util.Collections.emptyMap();
        activeDir = null;
        if (id == null || id.isEmpty()) {
            return;
        }
        try {
            File dir = new File(root(context), id);
            JSONObject meta = new JSONObject(new String(readAll(new FileInputStream(new File(dir, "metadata.json"))), "UTF-8"));
            JSONObject icons = meta.getJSONObject("icons");
            Map<String, String> map = new HashMap<>();
            for (Iterator<String> it = icons.keys(); it.hasNext(); ) {
                String key = it.next();
                map.put(key, icons.getString(key));
            }
            activeDir = dir;
            activeMap = map;
            activeId = id;
        } catch (Throwable t) {
            FileLog.e("tgyou: icon pack " + id + " is broken", t);
        }
    }

    public static boolean isPack(byte[] zip) {
        boolean meta = false;
        boolean manifest = false;
        try (ZipInputStream in = new ZipInputStream(new ByteArrayInputStream(zip))) {
            ZipEntry e;
            while ((e = in.getNextEntry()) != null) {
                meta |= e.getName().equals("metadata.json");
                manifest |= e.getName().equals("manifest.json");
            }
        } catch (Throwable ignore) {
        }
        return meta && !manifest;
    }

    public static synchronized Pack install(Context context, byte[] zip) throws Exception {
        File staging = new File(root(context), ".staging-" + System.nanoTime());
        try {
            unpack(zip, staging);
            JSONObject meta = new JSONObject(new String(readAll(new FileInputStream(new File(staging, "metadata.json"))), "UTF-8"));
            if (!meta.has("icons")) {
                throw new IllegalArgumentException("в metadata.json нет списка icons");
            }
            String id = meta.optString("packId", meta.optString("packName", "pack")).replaceAll("[^A-Za-z0-9._-]", "_");
            if (id.isEmpty() || id.startsWith(".")) {
                id = "pack_" + System.currentTimeMillis();
            }
            File target = new File(root(context), id);
            deleteRecursively(target);
            if (!staging.renameTo(target)) {
                throw new IllegalStateException("не удалось сохранить иконпак");
            }
            if (id.equals(activeId)) {
                applyActive(context, id);
            }
            return describe(target);
        } finally {
            deleteRecursively(staging);
        }
    }

    private static Pack describe(File dir) throws Exception {
        JSONObject meta = new JSONObject(new String(readAll(new FileInputStream(new File(dir, "metadata.json"))), "UTF-8"));
        Pack p = new Pack();
        p.id = dir.getName();
        p.name = meta.optString("packName", p.id);
        p.author = meta.optString("author", "");
        p.version = meta.optString("version", "");
        p.icons = meta.getJSONObject("icons").length();
        return p;
    }

    public static List<Pack> list(Context context) {
        List<Pack> result = new ArrayList<>();
        File[] dirs = root(context).listFiles();
        for (File dir : dirs == null ? new File[0] : dirs) {
            if (dir.isDirectory() && !dir.getName().startsWith(".")) {
                try {
                    result.add(describe(dir));
                } catch (Throwable t) {
                    FileLog.e("tgyou: broken icon pack " + dir.getName(), t);
                }
            }
        }
        return result;
    }

    public static String active(Context context) {
        ensureLoaded(context);
        String id = activeId;
        return id == null ? "" : id;
    }

    /** Null or empty id switches back to the stock icons. Apps screens pick it up as they are re-created. */
    public static synchronized void activate(Context context, String id) {
        ensureLoaded(context);
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit().putString(KEY_ACTIVE, id == null ? "" : id).apply();
        applyActive(context, id);
    }

    public static synchronized void remove(Context context, String id) {
        if (id.equals(active(context))) {
            activate(context, "");
        }
        deleteRecursively(new File(root(context), id));
    }

    /** Called from getResources(): returns the base resources untouched while no pack is active. */
    public static Resources wrap(Context context, Resources base) {
        if (context == null || base == null) {
            return base;
        }
        ensureLoaded(context);
        if (activeId == null) {
            return base;
        }
        synchronized (wrappers) {
            PackResources w = wrappers.get(base);
            if (w == null) {
                w = new PackResources(base);
                wrappers.put(base, w);
            }
            return w;
        }
    }

    static boolean has(String name) {
        return activeMap.containsKey(name);
    }

    /** Builds the replacement for drawable {@code name} at the size of the original, or null. */
    static Drawable replacement(Resources res, String name, Drawable original) {
        String file = activeMap.get(name);
        File dir = activeDir;
        if (file == null || dir == null) {
            return null;
        }
        int w = original != null && original.getIntrinsicWidth() > 0 ? original.getIntrinsicWidth() : Math.round(24 * res.getDisplayMetrics().density);
        int h = original != null && original.getIntrinsicHeight() > 0 ? original.getIntrinsicHeight() : w;
        String key = name + "@" + w + "x" + h;
        Bitmap bitmap = bitmaps.get(key);
        if (bitmap == null) {
            try {
                bitmap = render(new File(dir, file), w, h);
            } catch (Throwable t) {
                FileLog.e("tgyou: icon " + name + " failed", t);
                activeMap.remove(name);
                return null;
            }
            bitmaps.put(key, bitmap);
        }
        return new BitmapDrawable(res, bitmap);
    }

    /** Metadata and sample icons of a pack that is not installed yet (the archive is unpacked to a temp dir). */
    public static final class Preview {
        public Pack pack;
        public List<Bitmap> icons = new ArrayList<>();
    }

    public static Preview previewZip(Context context, byte[] zip, int count, int sizePx) throws Exception {
        File staging = new File(root(context), ".preview-" + System.nanoTime());
        try {
            unpack(zip, staging);
            Preview p = new Preview();
            p.pack = describe(staging);
            p.icons = sampleIcons(staging, count, sizePx);
            return p;
        } finally {
            deleteRecursively(staging);
        }
    }

    /** Up to {@code count} icons of an installed pack, evenly spread over its sorted icon list. */
    public static List<Bitmap> preview(Context context, String id, int count, int sizePx) {
        try {
            return sampleIcons(new File(root(context), id), count, sizePx);
        } catch (Throwable t) {
            FileLog.e("tgyou: icon pack preview " + id, t);
            return new ArrayList<>();
        }
    }

    private static List<Bitmap> sampleIcons(File dir, int count, int sizePx) throws Exception {
        JSONObject icons = new JSONObject(new String(readAll(new FileInputStream(new File(dir, "metadata.json"))), "UTF-8")).getJSONObject("icons");
        List<String> keys = new ArrayList<>();
        for (Iterator<String> it = icons.keys(); it.hasNext(); ) {
            keys.add(it.next());
        }
        java.util.Collections.sort(keys);
        List<Bitmap> result = new ArrayList<>();
        if (keys.isEmpty()) {
            return result;
        }
        float step = Math.max(1f, keys.size() / (float) count);
        for (float i = 0; i < keys.size() && result.size() < count; i += step) {
            try {
                result.add(render(new File(dir, icons.getString(keys.get((int) i))), sizePx, sizePx));
            } catch (Throwable ignore) {
            }
        }
        return result;
    }

    private static Bitmap render(File file, int w, int h) throws Exception {
        if (file.getName().toLowerCase().endsWith(".svg")) {
            SVG svg = SVG.getFromInputStream(new FileInputStream(file));
            Bitmap out = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
            svg.renderToCanvas(new Canvas(out), new RectF(0, 0, w, h));
            return out;
        }
        BitmapFactory.Options bounds = new BitmapFactory.Options();
        bounds.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), bounds);
        BitmapFactory.Options opts = new BitmapFactory.Options();
        int sample = 1;
        while (bounds.outWidth / (sample * 2) >= w * 2 && bounds.outHeight / (sample * 2) >= h * 2) {
            sample *= 2;
        }
        opts.inSampleSize = sample;
        Bitmap decoded = BitmapFactory.decodeFile(file.getAbsolutePath(), opts);
        if (decoded == null) {
            throw new IllegalStateException("не удалось прочитать " + file.getName());
        }
        if (decoded.getWidth() == w && decoded.getHeight() == h) {
            return decoded;
        }
        return Bitmap.createScaledBitmap(decoded, w, h, true);
    }

    private static void unpack(byte[] zip, File into) throws Exception {
        String base = into.getCanonicalPath() + File.separator;
        int files = 0;
        long total = 0;
        try (ZipInputStream in = new ZipInputStream(new ByteArrayInputStream(zip))) {
            ZipEntry entry;
            while ((entry = in.getNextEntry()) != null) {
                File out = new File(into, entry.getName());
                if (!out.getCanonicalPath().startsWith(base)) {
                    throw new SecurityException("небезопасный путь в архиве: " + entry.getName());
                }
                if (entry.isDirectory()) {
                    out.mkdirs();
                    continue;
                }
                if (++files > MAX_FILES) {
                    throw new IllegalArgumentException("слишком много файлов в иконпаке");
                }
                out.getParentFile().mkdirs();
                try (FileOutputStream fos = new FileOutputStream(out)) {
                    byte[] buf = new byte[16 * 1024];
                    int n;
                    while ((n = in.read(buf)) > 0) {
                        total += n;
                        if (total > MAX_UNPACKED) {
                            throw new IllegalArgumentException("иконпак слишком большой");
                        }
                        fos.write(buf, 0, n);
                    }
                }
            }
        }
        if (!new File(into, "metadata.json").isFile()) {
            throw new IllegalArgumentException("нет metadata.json");
        }
    }

    private static byte[] readAll(InputStream in) throws Exception {
        try (InputStream is = in; ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            byte[] buf = new byte[16 * 1024];
            int n;
            while ((n = is.read(buf)) > 0) {
                bos.write(buf, 0, n);
            }
            return bos.toByteArray();
        }
    }

    private static void deleteRecursively(File file) {
        File[] children = file.listFiles();
        if (children != null) {
            for (File child : children) {
                deleteRecursively(child);
            }
        }
        file.delete();
    }
}
