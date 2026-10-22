package com.tgyou.mods;

import android.content.Context;

import org.telegram.messenger.FileLog;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/** Mods on disk: {@code files/mods/<id>/} with manifest.json and the Python sources. */
public final class ModStore {

    private static final int MAX_FILES = 50;
    private static final long MAX_UNPACKED = 10L * 1024 * 1024;

    private final File root;

    public ModStore(Context context) {
        root = new File(context.getFilesDir(), "mods");
        root.mkdirs();
    }

    public File dirOf(String id) {
        return new File(root, id);
    }

    public List<ModManifest> installed() {
        List<ModManifest> result = new ArrayList<>();
        File[] dirs = root.listFiles();
        if (dirs == null) {
            return result;
        }
        for (File dir : dirs) {
            try {
                result.add(ModManifest.parse(readText(new File(dir, "manifest.json"))));
            } catch (Throwable t) {
                FileLog.e("tgyou: broken mod in " + dir.getName(), t);
            }
        }
        return result;
    }

    /** Unpacks a mod archive over any previous version and returns its manifest. */
    public ModManifest install(byte[] zip, String expectedSha256) throws Exception {
        if (expectedSha256 != null) {
            String actual = sha256(zip);
            if (!actual.equalsIgnoreCase(expectedSha256)) {
                throw new SecurityException("SHA-256 не совпадает: пакет повреждён или подменён");
            }
        }
        File staging = new File(root, ".staging-" + System.nanoTime());
        try {
            unpack(zip, staging);
            ModManifest manifest = ModManifest.parse(readText(new File(staging, "manifest.json")));
            if (!new File(staging, manifest.entry).isFile()) {
                throw new IllegalArgumentException("нет файла " + manifest.entry);
            }
            File target = dirOf(manifest.id);
            deleteRecursively(target);
            if (!staging.renameTo(target)) {
                throw new IllegalStateException("не удалось сохранить мод");
            }
            return manifest;
        } finally {
            deleteRecursively(staging);
        }
    }

    /** Installs an exteraGram .plugin (one Python file) by wrapping it into an ordinary mod. */
    public ModManifest installPlugin(byte[] source) throws Exception {
        File tmp = new File(root, ".import-" + System.nanoTime() + ".py");
        try {
            java.nio.file.Files.write(tmp.toPath(), source);
            com.chaquo.python.Python py = com.chaquo.python.Python.getInstance();
            String manifest = py.getModule("tgyou_extera").callAttr("describe", tmp.getAbsolutePath()).toString();
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            try (java.util.zip.ZipOutputStream zip = new java.util.zip.ZipOutputStream(bos)) {
                put(zip, "manifest.json", manifest.getBytes("UTF-8"));
                put(zip, "plugin.py", source);
                put(zip, "main.py", ("import os\nfrom tgyou_extera import load\n\n\ndef on_load(api):\n"
                        + "    load(api, os.path.join(os.path.dirname(__file__), \"plugin.py\"))\n").getBytes("UTF-8"));
            }
            return install(bos.toByteArray(), null);
        } finally {
            tmp.delete();
        }
    }

    private static void put(java.util.zip.ZipOutputStream zip, String name, byte[] data) throws Exception {
        zip.putNextEntry(new ZipEntry(name));
        zip.write(data);
        zip.closeEntry();
    }

    public void remove(String id) {
        deleteRecursively(dirOf(id));
    }

    private static void unpack(byte[] zip, File into) throws Exception {
        String base = into.getCanonicalPath() + File.separator;
        int files = 0;
        long total = 0;
        try (ZipInputStream in = new ZipInputStream(new java.io.ByteArrayInputStream(zip))) {
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
                    throw new IllegalArgumentException("в архиве больше " + MAX_FILES + " файлов");
                }
                out.getParentFile().mkdirs();
                try (FileOutputStream fos = new FileOutputStream(out)) {
                    byte[] buf = new byte[16 * 1024];
                    int n;
                    while ((n = in.read(buf)) > 0) {
                        total += n;
                        if (total > MAX_UNPACKED) {
                            throw new IllegalArgumentException("архив слишком большой после распаковки");
                        }
                        fos.write(buf, 0, n);
                    }
                }
            }
        }
        if (files == 0) {
            throw new IllegalArgumentException("пустой архив");
        }
    }

    public static String sha256(byte[] data) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (byte b : MessageDigest.getInstance("SHA-256").digest(data)) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    public static byte[] readAll(InputStream in) throws Exception {
        try (InputStream is = in; ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            byte[] buf = new byte[16 * 1024];
            int n;
            while ((n = is.read(buf)) > 0) {
                bos.write(buf, 0, n);
            }
            return bos.toByteArray();
        }
    }

    private static String readText(File file) throws Exception {
        return new String(readAll(new java.io.FileInputStream(file)), "UTF-8");
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
