package com.tgyou.core;

/** Настройки экрана «Чаты», которые читают точки входа в чат. */
public final class TgYouChatTweaks {

    public static final String STICKER_SCALE = "chats.sticker_scale";
    public static final String HIDE_KEYBOARD_SCROLL = "chats.hide_keyboard_scroll";
    public static final String MENTION_COMMA = "chats.mention_comma";
    public static final String HIDE_SEND_AS = "chats.hide_send_as";
    public static final String HIDE_GREETING = "chats.hide_greeting";

    public static final String REPLY_NO_HIGHLIGHT = "chats.reply_no_highlight";
    public static final String REPLY_NO_QUOTE = "chats.reply_no_quote";
    public static final String REPLY_MENTION = "chats.reply_mention";
    public static final String[] REPLY_KEYS = {REPLY_NO_HIGHLIGHT, REPLY_NO_QUOTE, REPLY_MENTION};
    public static final String WIDE_CHANNELS = "chats.wide_channels";
    public static final String WIDE_FEED = "chats.wide_feed";
    public static final String[] WIDE_KEYS = {WIDE_CHANNELS, WIDE_FEED};
    public static final String AI_EDITOR = "chats.ai_editor";
    public static final String AI_SUMMARY = "chats.ai_summary";
    public static final String AI_IV = "chats.ai_iv";
    public static final String[] AI_KEYS = {AI_EDITOR, AI_SUMMARY, AI_IV};
    public static final String ADMIN_DELBAN = "chats.admin_delban";
    public static final String ADMIN_MUTE = "chats.admin_mute";
    public static final String[] ADMIN_KEYS = {ADMIN_DELBAN, ADMIN_MUTE};
    public static final String ADMIN_MUTE_TERM = "chats.admin_mute_term";
    public static final String CALC = "chats.calc";

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

    // ---- ответы --------------------------------------------------------------------------

    public static boolean noReplyHighlight() {
        return TgYouPrefs.bool(REPLY_NO_HIGHLIGHT, false);
    }

    /** Ответ без цитаты: выделенный фрагмент отбрасывается. */
    public static org.telegram.ui.ChatActivity.ReplyQuote dropQuote(org.telegram.ui.ChatActivity.ReplyQuote quote) {
        return TgYouPrefs.bool(REPLY_NO_QUOTE, false) ? null : quote;
    }

    /** После ответа в группе подставляет @упоминание автора, если поле пустое. */
    public static void replyMention(org.telegram.ui.ChatActivity fragment, org.telegram.messenger.MessageObject message) {
        try {
            if (!TgYouPrefs.bool(REPLY_MENTION, false) || fragment == null || message == null || message.messageOwner == null) {
                return;
            }
            org.telegram.tgnet.TLRPC.Chat chat = fragment.getCurrentChat();
            org.telegram.ui.Components.ChatActivityEnterView view = fragment.getChatActivityEnterView();
            if (chat == null || view == null || view.getFieldText() != null && view.getFieldText().length() > 0) {
                return;
            }
            long from = message.getFromChatId();
            if (from <= 0 || from == org.telegram.messenger.UserConfig.getInstance(message.currentAccount).getClientUserId()) {
                return;
            }
            org.telegram.tgnet.TLRPC.User user = org.telegram.messenger.MessagesController.getInstance(message.currentAccount).getUser(from);
            String username = user == null ? null : org.telegram.messenger.UserObject.getPublicUsername(user);
            if (username != null && !username.isEmpty()) {
                view.setFieldText("@" + username + " ");
            }
        } catch (Throwable ignore) {
        }
    }

    // ---- широкие посты -------------------------------------------------------------------

    /** Сколько пикселей добавить к ширине текста поста канала. */
    public static int widePost(org.telegram.messenger.MessageObject message) {
        try {
            if (message == null || message.messageOwner == null) {
                return 0;
            }
            boolean channels = TgYouPrefs.bool(WIDE_CHANNELS, false);
            boolean feed = TgYouPrefs.bool(WIDE_FEED, false);
            if (!channels && !feed) {
                return 0;
            }
            if (message.isForwardedChannelPost()) {
                return feed ? org.telegram.messenger.AndroidUtilities.dp(56) : 0;
            }
            return channels && message.isFromChannel() ? org.telegram.messenger.AndroidUtilities.dp(56) : 0;
        } catch (Throwable t) {
            return 0;
        }
    }

    // ---- ИИ ------------------------------------------------------------------------------

    public static boolean aiEditor() {
        return TgYouPrefs.bool(AI_EDITOR, true);
    }

    public static boolean aiSummary() {
        return TgYouPrefs.bool(AI_SUMMARY, true);
    }

    public static final String CHAT_THEMES = "chats.chat_themes";

    /** False when themes set by the other side of a chat must be ignored. */
    public static boolean chatThemes() {
        return TgYouPrefs.bool(CHAT_THEMES, true);
    }
}
