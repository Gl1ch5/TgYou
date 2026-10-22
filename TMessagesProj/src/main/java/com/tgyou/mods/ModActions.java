package com.tgyou.mods;

import com.chaquo.python.PyObject;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

import java.util.concurrent.ConcurrentHashMap;

/** Python callbacks of a mod's settings: button clicks ("key") and value changes ("change:key"). */
public final class ModActions {

    private static final ConcurrentHashMap<String, PyObject> ACTIONS = new ConcurrentHashMap<>();

    private ModActions() {
    }

    static void register(String modId, String key, PyObject fn) {
        ACTIONS.put(modId + "/" + key, fn);
    }

    public static void clear(String modId) {
        ACTIONS.keySet().removeIf(k -> k.startsWith(modId + "/"));
    }

    /** Runs the callback on the UI thread, as exteraGram does. */
    public static void fire(String modId, String key, String value) {
        PyObject fn = ACTIONS.get(modId + "/" + key);
        if (fn == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(() -> {
            try {
                fn.call(value);
            } catch (Throwable t) {
                FileLog.e("tgyou: mod " + modId + " action " + key, t);
                ModLog.add(modId, "ошибка " + key + ": " + t);
            }
        });
    }
}
