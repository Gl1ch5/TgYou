package com.tgyou.core;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * «Шпион»: сохранение вложений при загрузке и запись момента прочтения. Подписки на
 * NotificationCenter ставятся один раз при загрузке плагина.
 */
public final class TgYouSpy implements NotificationCenter.NotificationCenterDelegate {

    public static final String SAVE_ATTACHMENTS = "spy.save_attachments";
    public static final String LIMIT = "spy.limit";
    public static final String SAVE_LAST_ONLINE = "spy.last_online";
    public static final String KEEP_READS = "spy.keep_reads";

    /** Selectable folder size limits, in megabytes; 0 means unlimited. */
    public static final long[] LIMITS = {300, 1024, 2048, 5120, 16384, 0};
    public static final String[] LIMIT_LABELS = {"300 МБ", "1 ГБ", "2 ГБ", "5 ГБ", "16 ГБ", "∞"};

    private static TgYouSpy instance;

    public static synchronized void start() {
        if (instance != null) {
            return;
        }
        instance = new TgYouSpy();
        org.telegram.messenger.AndroidUtilities.runOnUIThread(() -> {
            for (int a = 0; a < UserConfig.MAX_ACCOUNT_COUNT; a++) {
                NotificationCenter center = NotificationCenter.getInstance(a);
                center.addObserver(instance, NotificationCenter.fileLoaded);
                center.addObserver(instance, NotificationCenter.messagesRead);
            }
        });
    }

    /** Закрытая папка во внутреннем хранилище приложения: файловые менеджеры, галерея и «Загрузки» её не видят. */
    /** fileName -> true, если файл грузится из личного чата (вызывается однострочным хуком из FileLoader). */
    private static final java.util.Map<String, Boolean> SOURCES = java.util.Collections.synchronizedMap(
            new java.util.LinkedHashMap<String, Boolean>(64, 0.75f, true) {
                @Override
                protected boolean removeEldestEntry(java.util.Map.Entry<String, Boolean> eldest) {
                    return size() > 3000;
                }
            });

    public static void note(String fileName, Object parent) {
        try {
            if (fileName != null && parent instanceof org.telegram.messenger.MessageObject && TgYouPrefs.bool(SAVE_ATTACHMENTS, false)) {
                SOURCES.put(fileName, ((org.telegram.messenger.MessageObject) parent).getDialogId() > 0);
            }
        } catch (Throwable ignore) {
        }
    }

    public static final String PRIVATE_PREFIX = "p_";

    /** Сохранённые файлы, новые сверху. */
    public static java.util.List<File> files() {
        File[] files = folder().listFiles();
        java.util.List<File> list = new java.util.ArrayList<>();
        if (files != null) {
            java.util.Collections.addAll(list, files);
        }
        java.util.Collections.sort(list, (a, b) -> Long.compare(b.lastModified(), a.lastModified()));
        return list;
    }

    public static boolean isPrivate(File f) {
        return f.getName().startsWith(PRIVATE_PREFIX);
    }

    public static String displayName(File f) {
        String n = f.getName();
        return isPrivate(f) ? n.substring(PRIVATE_PREFIX.length()) : n;
    }

    /** Удаляет самые старые файлы, пока не освободится need байт под лимит; личные удаляются только если allowPrivate. */
    private static boolean makeRoom(long need, long limit, boolean allowPrivate) {
        if (limit <= 0) {
            return true;
        }
        java.util.List<File> list = files();
        long used = usedBytes();
        for (int pass = 0; pass < 2 && used + need > limit; pass++) {
            if (pass == 1 && !allowPrivate) {
                break;
            }
            for (int i = list.size() - 1; i >= 0 && used + need > limit; i--) {
                File f = list.get(i);
                if (pass == 0 && isPrivate(f)) {
                    continue;
                }
                long len = f.length();
                if (f.delete()) {
                    used -= len;
                }
            }
        }
        return used + need <= limit;
    }

    public static File folder() {
        File dir = new File(ApplicationLoader.applicationContext.getFilesDir(), "tgyou_saved");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        migrateOld(dir);
        return dir;
    }

    private static boolean migrated;

    /** Переносит файлы из прежней папки (Android/data/…/files/Saved Attachments) во внутреннюю и удаляет её. */
    private static synchronized void migrateOld(File dir) {
        if (migrated) {
            return;
        }
        migrated = true;
        try {
            File base = ApplicationLoader.applicationContext.getExternalFilesDir(null);
            if (base == null) {
                return;
            }
            File old = new File(base, "Saved Attachments");
            File[] files = old.listFiles();
            if (files != null) {
                for (File f : files) {
                    File target = new File(dir, f.getName());
                    if (target.exists() || !f.renameTo(target)) {
                        if (!target.exists()) {
                            try (InputStream in = new FileInputStream(f); OutputStream out = new FileOutputStream(target)) {
                                byte[] buffer = new byte[64 * 1024];
                                int n;
                                while ((n = in.read(buffer)) > 0) {
                                    out.write(buffer, 0, n);
                                }
                            }
                        }
                        f.delete();
                    }
                }
            }
            old.delete();
            new File(base, "tgyou-backup.db").delete();
        } catch (Throwable t) {
            FileLog.e("tgyou: migrate saved attachments failed", t);
        }
    }

    public static long usedBytes() {
        long total = 0;
        File[] files = folder().listFiles();
        if (files != null) {
            for (File f : files) {
                total += f.length();
            }
        }
        return total;
    }

    public static void clearFolder() {
        File[] files = folder().listFiles();
        if (files != null) {
            for (File f : files) {
                f.delete();
            }
        }
    }

    @Override
    public void didReceivedNotification(int id, int account, Object... args) {
        if (id == NotificationCenter.fileLoaded) {
            if (TgYouPrefs.bool(SAVE_ATTACHMENTS, false) && args.length >= 2 && args[1] instanceof File) {
                File file = (File) args[1];
                Utilities.globalQueue.postRunnable(() -> save(file));
            }
        } else if (id == NotificationCenter.messagesRead) {
            if (!TgYouPrefs.bool(KEEP_READS, true) || args.length < 2 || !(args[1] instanceof org.telegram.messenger.support.LongSparseIntArray)) {
                return;
            }
            org.telegram.messenger.support.LongSparseIntArray outbox = (org.telegram.messenger.support.LongSparseIntArray) args[1];
            int now = (int) (System.currentTimeMillis() / 1000);
            for (int i = 0; i < outbox.size(); i++) {
                TgYouDb.get().addRead(account, outbox.keyAt(i), outbox.valueAt(i), now);
            }
        }
    }

    private static void save(File file) {
        try {
            if (file == null || !file.exists() || file.length() < 16 * 1024) {
                return;
            }
            // only real attachments live in the document/video/audio/image cache; avatars, stickers and thumbs are skipped
            String path = file.getAbsolutePath();
            String name = file.getName();
            if (name.endsWith(".tgs") || name.endsWith(".webp") || name.endsWith(".temp") || path.contains("/stickers")) {
                return;
            }
            long limit = limitBytes();
            File dir = folder();
            boolean priv = Boolean.TRUE.equals(SOURCES.get(name));
            File target = new File(dir, (priv ? PRIVATE_PREFIX : "") + name);
            if (target.exists() || new File(dir, PRIVATE_PREFIX + name).exists()) {
                return;
            }
            // из личных чатов сохраняем всё: старые файлы (сначала из групп) удаляются, пока не освободится место
            if (!makeRoom(file.length(), limit, priv)) {
                return;
            }
            try (InputStream in = new FileInputStream(file); OutputStream out = new FileOutputStream(target)) {
                byte[] buffer = new byte[64 * 1024];
                int n;
                while ((n = in.read(buffer)) > 0) {
                    out.write(buffer, 0, n);
                }
            }
            target.setLastModified(System.currentTimeMillis());
        } catch (Throwable t) {
            FileLog.e("tgyou: save attachment failed", t);
        }
    }

    private static long limitBytes() {
        int i = Math.max(0, Math.min(LIMITS.length - 1, TgYouPrefs.integer(LIMIT, 1)));
        return LIMITS[i] * 1024L * 1024L;
    }
}
