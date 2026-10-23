package com.tgyou.core;

import android.util.SparseIntArray;

import org.telegram.ui.ActionBar.Theme;

/**
 * Own colors for parts of the interface. Each entry replaces the RGB of one or more theme keys and keeps their alpha,
 * so bubble transparency and gradients still work. 0 in the prefs means "theme default". Read from the single
 * Theme.getColor hook through {@link TgYouAppearance#color(int, int)}.
 */
public final class TgYouColors {

    public static final class Entry {
        public final String id;
        public final String title;
        public final int[] keys;

        Entry(String id, String title, int... keys) {
            this.id = id;
            this.title = title;
            this.keys = keys;
        }

        public String pref() {
            return "color." + id;
        }
    }

    public static final String AMOLED = "look.amoled";

    /** Ready-made swatches shown under every color row. */
    public static final int[] PALETTE = {
            0xFFE53935, 0xFFFB8C00, 0xFFFDD835, 0xFF43A047, 0xFF00ACC1, 0xFF1E88E5,
            0xFF8E24AA, 0xFFEC407A, 0xFFFFFFFF, 0xFF9E9E9E, 0xFF212121, 0xFF000000
    };

    public static final Entry[] ENTRIES = {
            new Entry("out_bubble", "Исходящие пузыри", Theme.key_chat_outBubble, Theme.key_chat_outBubbleSelected,
                    Theme.key_chat_outBubbleGradient1, Theme.key_chat_outBubbleGradient2, Theme.key_chat_outBubbleGradient3),
            new Entry("in_bubble", "Входящие пузыри", Theme.key_chat_inBubble, Theme.key_chat_inBubbleSelected),
            new Entry("out_text", "Текст исходящих", Theme.key_chat_messageTextOut),
            new Entry("in_text", "Текст входящих", Theme.key_chat_messageTextIn),
            new Entry("out_link", "Ссылки в исходящих", Theme.key_chat_messageLinkOut),
            new Entry("in_link", "Ссылки во входящих", Theme.key_chat_messageLinkIn),
            new Entry("checks", "Галочки «прочитано»", Theme.key_chat_outSentCheckRead, Theme.key_chat_outSentCheckReadSelected),
            new Entry("panel", "Панель ввода", Theme.key_chat_messagePanelBackground),
            new Entry("bar", "Шапка", Theme.key_actionBarDefault),
            new Entry("bar_title", "Заголовок шапки", Theme.key_actionBarDefaultTitle),
            new Entry("list_bg", "Фон списков", Theme.key_windowBackgroundWhite),
            new Entry("gray_bg", "Фон между блоками", Theme.key_windowBackgroundGray),
            new Entry("badge", "Счётчик непрочитанных", Theme.key_chats_unreadCounter),
            new Entry("badge_muted", "Счётчик в заглушённых", Theme.key_chats_unreadCounterMuted),
            new Entry("fab", "Кнопка «написать»", Theme.key_chats_actionBackground),
            new Entry("chat_name", "Имена в списке чатов", Theme.key_chats_name),
            new Entry("chat_msg", "Превью в списке чатов", Theme.key_chats_message),
            new Entry("pinned", "Значок закрепа", Theme.key_chats_pinnedIcon),
    };

    private static final int[] AMOLED_KEYS = {
            Theme.key_windowBackgroundWhite, Theme.key_windowBackgroundGray, Theme.key_chat_messagePanelBackground,
            Theme.key_dialogBackground, Theme.key_dialogBackgroundGray
    };

    private static final SparseIntArray map = new SparseIntArray();
    private static boolean loaded;
    private static boolean amoled;

    private TgYouColors() {
    }

    public static synchronized void reload() {
        map.clear();
        for (Entry e : ENTRIES) {
            int color = TgYouPrefs.integer(e.pref(), 0);
            if (color != 0) {
                for (int key : e.keys) {
                    map.put(key, color);
                }
            }
        }
        amoled = TgYouPrefs.bool(AMOLED, false);
        loaded = true;
    }

    public static int get(Entry e) {
        return TgYouPrefs.integer(e.pref(), 0);
    }

    public static void set(Entry e, int color) {
        TgYouPrefs.setInt(e.pref(), color);
        reload();
        TgYouAppearance.apply();
    }

    public static void reset() {
        for (Entry e : ENTRIES) {
            TgYouPrefs.setInt(e.pref(), 0);
        }
        TgYouPrefs.setBool(AMOLED, false);
        reload();
        TgYouAppearance.apply();
    }

    /** Hook for Theme.getColor. */
    public static int apply(int key, int color) {
        if (!loaded) {
            reload();
        }
        if (amoled && Theme.isCurrentThemeDark()) {
            for (int k : AMOLED_KEYS) {
                if (k == key) {
                    color = color & 0xFF000000;
                    break;
                }
            }
        }
        int custom = map.get(key, 0);
        if (custom == 0) {
            return color;
        }
        int alpha = color >>> 24;
        if (alpha == 0) {
            return color;
        }
        return (alpha << 24) | (custom & 0xFFFFFF);
    }
}
