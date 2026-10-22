package com.tgyou.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Plugin-owned storage kept apart from Telegram's own database: messages the server deleted
 * and the previous texts of edited messages.
 *
 * <p>Dialog keys: a channel message is keyed by {@code -channelId}; messages of private chats
 * and basic groups by {@code 0}, because their ids are unique per account.
 */
public final class TgYouDb extends SQLiteOpenHelper {

    public static final class Edit {
        public final String text;
        public final int date;

        Edit(String text, int date) {
            this.text = text;
            this.date = date;
        }
    }

    private static TgYouDb instance;

    private final Set<String> deleted = new HashSet<>();
    private final Map<String, Integer> editCounts = new HashMap<>();

    public static synchronized TgYouDb get() {
        if (instance == null) {
            Context context = ApplicationLoader.applicationContext;
            instance = new TgYouDb(context);
            instance.loadCaches();
        }
        return instance;
    }

    private TgYouDb(Context context) {
        super(context, "tgyou.db", null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE deleted (account INTEGER, dialog INTEGER, msg INTEGER, date INTEGER, PRIMARY KEY (account, dialog, msg))");
        db.execSQL("CREATE TABLE edits (account INTEGER, dialog INTEGER, msg INTEGER, version INTEGER, text TEXT, date INTEGER,"
                + " PRIMARY KEY (account, dialog, msg, version))");
        createReads(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 2) {
            createReads(db);
        }
    }

    private static void createReads(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS reads (account INTEGER, dialog INTEGER, max_id INTEGER, date INTEGER)");
    }

    private void loadCaches() {
        try {
            SQLiteDatabase db = getReadableDatabase();
            try (Cursor c = db.rawQuery("SELECT account, dialog, msg FROM deleted", null)) {
                while (c.moveToNext()) {
                    deleted.add(key(c.getInt(0), c.getLong(1), c.getInt(2)));
                }
            }
            try (Cursor c = db.rawQuery("SELECT account, dialog, msg, COUNT(*) FROM edits GROUP BY account, dialog, msg", null)) {
                while (c.moveToNext()) {
                    editCounts.put(key(c.getInt(0), c.getLong(1), c.getInt(2)), c.getInt(3));
                }
            }
        } catch (Throwable t) {
            FileLog.e("tgyou: failed to load caches", t);
        }
    }

    private static String key(int account, long dialog, int msg) {
        return account + ":" + dialog + ":" + msg;
    }

    /** The dialog key under which a message is stored. */
    public static long dialogKey(TLRPC.Message message) {
        return message.peer_id != null && message.peer_id.channel_id != 0 ? -message.peer_id.channel_id : 0;
    }

    public static long dialogKey(MessageObject message) {
        return dialogKey(message.messageOwner);
    }

    public synchronized boolean hasDeleted() {
        return !deleted.isEmpty();
    }

    public synchronized boolean isDeleted(int account, long dialogKey, int msg) {
        return deleted.contains(key(account, dialogKey, msg));
    }

    public synchronized void markDeleted(int account, long dialogKey, List<Integer> ids, int date) {
        try {
            SQLiteDatabase db = getWritableDatabase();
            db.beginTransaction();
            try {
                for (int id : ids) {
                    if (deleted.add(key(account, dialogKey, id))) {
                        ContentValues values = new ContentValues();
                        values.put("account", account);
                        values.put("dialog", dialogKey);
                        values.put("msg", id);
                        values.put("date", date);
                        db.insertWithOnConflict("deleted", null, values, SQLiteDatabase.CONFLICT_IGNORE);
                    }
                }
                db.setTransactionSuccessful();
            } finally {
                db.endTransaction();
            }
        } catch (Throwable t) {
            FileLog.e("tgyou: markDeleted failed", t);
        }
    }

    public synchronized int editCount(int account, long dialogKey, int msg) {
        Integer count = editCounts.get(key(account, dialogKey, msg));
        return count == null ? 0 : count;
    }

    /** Saves a previous version of a message, skipping a text identical to the last saved one. */
    public synchronized void addEdit(int account, long dialogKey, int msg, String text, int date) {
        try {
            List<Edit> existing = edits(account, dialogKey, msg);
            if (!existing.isEmpty() && existing.get(existing.size() - 1).text.equals(text)) {
                return;
            }
            ContentValues values = new ContentValues();
            values.put("account", account);
            values.put("dialog", dialogKey);
            values.put("msg", msg);
            values.put("version", existing.size());
            values.put("text", text);
            values.put("date", date);
            getWritableDatabase().insertWithOnConflict("edits", null, values, SQLiteDatabase.CONFLICT_IGNORE);
            editCounts.put(key(account, dialogKey, msg), existing.size() + 1);
        } catch (Throwable t) {
            FileLog.e("tgyou: addEdit failed", t);
        }
    }

    public synchronized List<Edit> edits(int account, long dialogKey, int msg) {
        List<Edit> result = new ArrayList<>();
        try (Cursor c = getReadableDatabase().rawQuery(
                "SELECT text, date FROM edits WHERE account = ? AND dialog = ? AND msg = ? ORDER BY version",
                new String[]{String.valueOf(account), String.valueOf(dialogKey), String.valueOf(msg)})) {
            while (c.moveToNext()) {
                result.add(new Edit(c.getString(0), c.getInt(1)));
            }
        } catch (Throwable t) {
            FileLog.e("tgyou: edits failed", t);
        }
        return result;
    }

    // ---- read dates (kept locally in case Telegram does not give one) ----------------------

    /** Remembers that the other side has read everything up to {@code maxId} of the dialog just now. */
    public synchronized void addRead(int account, long dialogId, int maxId, int date) {
        try {
            ContentValues values = new ContentValues();
            values.put("account", account);
            values.put("dialog", dialogId);
            values.put("max_id", maxId);
            values.put("date", date);
            getWritableDatabase().insert("reads", null, values);
        } catch (Throwable t) {
            FileLog.e("tgyou: addRead failed", t);
        }
    }

    /** @return the earliest recorded moment when the message was known to be read, or 0 */
    public synchronized int readDate(int account, long dialogId, int msg) {
        try (Cursor c = getReadableDatabase().rawQuery(
                "SELECT MIN(date) FROM reads WHERE account = ? AND dialog = ? AND max_id >= ?",
                new String[]{String.valueOf(account), String.valueOf(dialogId), String.valueOf(msg)})) {
            if (c.moveToFirst()) {
                return c.getInt(0);
            }
        } catch (Throwable t) {
            FileLog.e("tgyou: readDate failed", t);
        }
        return 0;
    }

    // ---- maintenance ---------------------------------------------------------------------

    public static File file(Context context) {
        return context.getDatabasePath("tgyou.db");
    }

    /** Removes every saved deleted message, edit and read date. */
    public synchronized void clearAll() {
        try {
            SQLiteDatabase db = getWritableDatabase();
            db.delete("deleted", null, null);
            db.delete("edits", null, null);
            db.delete("reads", null, null);
            deleted.clear();
            editCounts.clear();
        } catch (Throwable t) {
            FileLog.e("tgyou: clearAll failed", t);
        }
    }

    /** Copies the database file to {@code target}. */
    public synchronized void exportTo(File target) throws java.io.IOException {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("PRAGMA wal_checkpoint(FULL)");
        try (java.io.InputStream in = new java.io.FileInputStream(file(ApplicationLoader.applicationContext));
             java.io.OutputStream out = new java.io.FileOutputStream(target)) {
            byte[] buffer = new byte[16 * 1024];
            int n;
            while ((n = in.read(buffer)) > 0) {
                out.write(buffer, 0, n);
            }
        }
    }

    /** Replaces the database with the file read from {@code in}; the next {@link #get()} reopens it. */
    public static synchronized void importFrom(java.io.InputStream in) throws java.io.IOException {
        Context context = ApplicationLoader.applicationContext;
        if (instance != null) {
            instance.close();
            instance = null;
        }
        File db = file(context);
        File tmp = new File(db.getPath() + ".import");
        try (java.io.OutputStream out = new java.io.FileOutputStream(tmp)) {
            byte[] buffer = new byte[16 * 1024];
            int n;
            while ((n = in.read(buffer)) > 0) {
                out.write(buffer, 0, n);
            }
        }
        new File(db.getPath() + "-wal").delete();
        new File(db.getPath() + "-shm").delete();
        new File(db.getPath() + "-journal").delete();
        if (!tmp.renameTo(db)) {
            throw new java.io.IOException("не удалось заменить базу");
        }
    }
}
