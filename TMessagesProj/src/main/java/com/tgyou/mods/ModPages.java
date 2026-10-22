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

    static void removeAll(String modId) {
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
