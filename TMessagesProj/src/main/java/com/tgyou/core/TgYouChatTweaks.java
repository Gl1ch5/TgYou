package com.tgyou.core;

/** Настройки экрана «Чаты», которые читают точки входа в чат. */
public final class TgYouChatTweaks {

    public static final String STICKER_SCALE = "chats.sticker_scale";
    public static final String HIDE_KEYBOARD_SCROLL = "chats.hide_keyboard_scroll";
    public static final String MENTION_COMMA = "chats.mention_comma";
    public static final String HIDE_SEND_AS = "chats.hide_send_as";
    public static final String HIDE_GREETING = "chats.hide_greeting";

    public static final String[] STICKER_LABELS = {"50%", "75%", "100%", "125%", "150%"};
    private static final float[] SCALES = {0.5f, 0.75f, 1f, 1.25f, 1.5f};

    private TgYouChatTweaks() {
    }

    public static float stickerScale() {
        int i = TgYouPrefs.integer(STICKER_SCALE, 2);
        return SCALES[Math.max(0, Math.min(SCALES.length - 1, i))];
    }

    public static boolean hideKeyboardOnScroll() {
        return TgYouPrefs.bool(HIDE_KEYBOARD_SCROLL, false);
    }

    public static String mentionTail() {
        return TgYouPrefs.bool(MENTION_COMMA, false) ? ", " : " ";
    }

    public static boolean hideSendAs() {
        return TgYouPrefs.bool(HIDE_SEND_AS, false);
    }

    public static boolean hideGreeting() {
        return TgYouPrefs.bool(HIDE_GREETING, false);
    }
}
