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

    public static File folder() {
        File base = ApplicationLoader.applicationContext.getExternalFilesDir(null);
        if (base == null) {
            base = ApplicationLoader.applicationContext.getFilesDir();
        }
        File dir = new File(base, "Saved Attachments");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
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
            if (limit > 0 && usedBytes() + file.length() > limit) {
                return;
            }
            File target = new File(dir, name);
            if (target.exists()) {
                return;
            }
            try (InputStream in = new FileInputStream(file); OutputStream out = new FileOutputStream(target)) {
                byte[] buffer = new byte[64 * 1024];
                int n;
                while ((n = in.read(buffer)) > 0) {
                    out.write(buffer, 0, n);
                }
            }
        } catch (Throwable t) {
            FileLog.e("tgyou: save attachment failed", t);
        }
    }

    private static long limitBytes() {
        int i = Math.max(0, Math.min(LIMITS.length - 1, TgYouPrefs.integer(LIMIT, 1)));
        return LIMITS[i] * 1024L * 1024L;
    }
}
