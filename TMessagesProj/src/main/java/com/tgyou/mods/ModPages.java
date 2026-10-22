package com.tgyou.mods;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/** Pages that mods add to the TgYou settings screen (see {@code api.add_page} in Python). */
public final class ModPages {

    public interface Source {
        /** Rows as {title, value} pairs; may be called on every refresh. */
        List<String[]> rows();
    }

    public static final class Page {
        public final String modId;
        public final String title;
        public final Source source;

        Page(String modId, String title, Source source) {
            this.modId = modId;
            this.title = title;
            this.source = source;
        }
    }

    private static final List<Page> pages = new CopyOnWriteArrayList<>();

    private ModPages() {
    }

    static void add(String modId, String title, Source source) {
        pages.add(new Page(modId, title, source));
    }

    /** A menu entry a mod wanted in the side/main menu; shown on the TgYou screen because Telegram 13 has no side menu. */
    public static final class Action {
        public final String modId;
        public final String title;
        public final Runnable run;

        Action(String modId, String title, Runnable run) {
            this.modId = modId;
            this.title = title;
            this.run = run;
        }
    }

    private static final List<Action> actions = new CopyOnWriteArrayList<>();

    static void addAction(String modId, String title, Runnable run) {
        actions.add(new Action(modId, title, run));
    }

    public static List<Action> actions() {
        return new ArrayList<>(actions);
    }

    static void removeAll(String modId) {
        for (Action a : actions) {
            if (a.modId.equals(modId)) {
                actions.remove(a);
            }
        }
        for (Page page : pages) {
            if (page.modId.equals(modId)) {
                pages.remove(page);
            }
        }
    }

    public static List<Page> all() {
        return new ArrayList<>(pages);
    }
}
