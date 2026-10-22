package com.tgyou.mods;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

/** The last lines each mod logged, so errors can be read (and sent) from the app. */
public final class ModLog {

    private static final int MAX = 200;
    private static final Map<String, ArrayDeque<String>> LINES = new HashMap<>();

    private ModLog() {
    }

    public static synchronized void add(String modId, String line) {
        ArrayDeque<String> q = LINES.get(modId);
        if (q == null) {
            LINES.put(modId, q = new ArrayDeque<>());
        }
        if (q.size() >= MAX) {
            q.removeFirst();
        }
        q.addLast(new java.text.SimpleDateFormat("HH:mm:ss", java.util.Locale.US).format(new java.util.Date()) + "  " + line);
    }

    public static synchronized String text(String modId) {
        ArrayDeque<String> q = LINES.get(modId);
        return q == null ? "" : String.join("\n", q);
    }
}
