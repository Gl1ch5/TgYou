package com.tgyou.core;

import android.content.Context;
import android.content.SharedPreferences;

import org.json.JSONArray;
import org.telegram.messenger.ApplicationLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Static preference store for the TgYou settings screens. Usable from Telegram hooks without a
 * plugin context; SharedPreferences keeps the values in memory so reads are cheap.
 */
public final class TgYouPrefs {

    private static final String NAME = "tgyou_prefs";
    private static volatile SharedPreferences prefs;
    private static final java.util.Map<String, Object[]> cache = new java.util.concurrent.ConcurrentHashMap<>();

    private TgYouPrefs() {
    }

    private static SharedPreferences sp() {
        SharedPreferences local = prefs;
        if (local == null) {
            Context context = ApplicationLoader.applicationContext;
            if (context == null) {
                return null;
            }
            local = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
            prefs = local;
        }
        return local;
    }

    public static boolean bool(String key, boolean def) {
        SharedPreferences p = sp();
        return p == null ? def : p.getBoolean(key, def);
    }

    public static void setBool(String key, boolean value) {
        SharedPreferences p = sp();
        if (p != null) {
            p.edit().putBoolean(key, value).apply();
        }
    }

    public static int integer(String key, int def) {
        SharedPreferences p = sp();
        return p == null ? def : p.getInt(key, def);
    }

    public static void setInt(String key, int value) {
        SharedPreferences p = sp();
        if (p != null) {
            p.edit().putInt(key, value).apply();
        }
    }

    public static long number(String key, long def) {
        SharedPreferences p = sp();
        return p == null ? def : p.getLong(key, def);
    }

    public static void setLong(String key, long value) {
        SharedPreferences p = sp();
        if (p != null) {
            p.edit().putLong(key, value).apply();
        }
    }

    public static String str(String key, String def) {
        SharedPreferences p = sp();
        return p == null ? def : p.getString(key, def);
    }

    public static void setStr(String key, String value) {
        SharedPreferences p = sp();
        if (p != null) {
            p.edit().putString(key, value).apply();
        }
    }

    /** A list of strings stored as a JSON array. */
    @SuppressWarnings("unchecked")
    public static List<String> list(String key) {
        String raw = str(key, "");
        Object[] hit = cache.get(key);
        if (hit != null && hit[0].equals(raw)) {
            return new ArrayList<>((List<String>) hit[1]);
        }
        List<String> result = new ArrayList<>();
        if (raw == null || raw.isEmpty()) {
            return result;
        }
        try {
            JSONArray array = new JSONArray(raw);
            for (int i = 0; i < array.length(); i++) {
                result.add(array.getString(i));
            }
        } catch (Throwable ignore) {
        }
        cache.put(key, new Object[]{raw, new ArrayList<>(result)});
        return result;
    }

    public static void setList(String key, List<String> values) {
        JSONArray array = new JSONArray();
        for (String v : values) {
            array.put(v);
        }
        setStr(key, array.toString());
    }

    public static synchronized boolean listAdd(String key, String value) {
        List<String> list = list(key);
        if (list.contains(value)) {
            return false;
        }
        list.add(value);
        setList(key, list);
        return true;
    }

    public static synchronized void listRemove(String key, String value) {
        List<String> list = list(key);
        if (list.remove(value)) {
            setList(key, list);
        }
    }

    public static boolean listHas(String key, String value) {
        return list(key).contains(value);
    }

    public static boolean listHasLong(String key, long value) {
        return listHas(key, String.valueOf(value));
    }
}
