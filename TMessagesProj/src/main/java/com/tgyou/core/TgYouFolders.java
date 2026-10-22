package com.tgyou.core;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

import java.util.ArrayList;

/** Folder tabs of the chat list: title style, unread counter mode, hiding of the "All chats" tab. */
public final class TgYouFolders {

    public static final String TITLE_MODE = "look.folder_titles";
    public static final String COUNTER_MODE = "look.folder_counter";
    public static final String HIDE_ALL = "look.hide_all_tab";

    public static final String[] TITLE_LABELS = {"Названия и иконки", "Только названия", "Только иконки"};
    public static final String[] COUNTER_LABELS = {"Все чаты", "Только неотключённые", "Отключён"};

    private static String lastSignature = "";

    private TgYouFolders() {
    }

    public static boolean hideAll() {
        return TgYouPrefs.bool(HIDE_ALL, false);
    }

    /** True once after any of the folder settings changed since the tabs were built. */
    public static boolean changed() {
        String sig = TgYouPrefs.integer(TITLE_MODE, 0) + "/" + TgYouPrefs.integer(COUNTER_MODE, 0) + "/" + hideAll();
        if (sig.equals(lastSignature)) {
            return false;
        }
        lastSignature = sig;
        return true;
    }

    private static boolean isEmojiPart(int cp) {
        return cp >= 0x1F000 || (cp >= 0x2190 && cp <= 0x2BFF) || cp == 0x200D || cp == 0xFE0F || cp == 0x20E3
                || (cp >= 0x2300 && cp <= 0x23FF) || cp == 0x00A9 || cp == 0x00AE || cp == 0x203C || cp == 0x2049 || cp == 0x2122;
    }

    /** Length (in chars) of the leading icon of a folder name: a custom emoji at offset 0 or ordinary emoji. */
    private static int iconLength(String name, ArrayList<TLRPC.MessageEntity> entities) {
        if (name == null || name.isEmpty()) {
            return 0;
        }
        if (entities != null) {
            for (TLRPC.MessageEntity e : entities) {
                if (e instanceof TLRPC.TL_messageEntityCustomEmoji && e.offset == 0) {
                    return Math.min(e.length, name.length());
                }
            }
        }
        int i = 0;
        while (i < name.length()) {
            int cp = name.codePointAt(i);
            if (!isEmojiPart(cp)) {
                break;
            }
            i += Character.charCount(cp);
        }
        return i;
    }

    public static String title(String name, boolean isDefault, String stockDefault) {
        int mode = TgYouPrefs.integer(TITLE_MODE, 0);
        if (isDefault) {
            if (hideAll()) {
                return "";
            }
            return mode == 2 ? "💬" : stockDefault;
        }
        if (mode == 0 || name == null) {
            return name;
        }
        int icon = iconLength(name, null);
        if (icon == 0) {
            return name;
        }
        if (mode == 1) {
            String rest = name.substring(icon).trim();
            return rest.isEmpty() ? name : rest;
        }
        return name.substring(0, icon);
    }

    /** Entities matching {@link #title}: custom emoji are shifted or dropped together with the text. */
    public static ArrayList<TLRPC.MessageEntity> entities(String name, ArrayList<TLRPC.MessageEntity> entities, boolean isDefault) {
        int mode = TgYouPrefs.integer(TITLE_MODE, 0);
        if (isDefault || mode == 0 || name == null || entities == null || entities.isEmpty()) {
            return isDefault ? null : entities;
        }
        int icon = iconLength(name, entities);
        if (icon == 0) {
            return entities;
        }
        ArrayList<TLRPC.MessageEntity> result = new ArrayList<>();
        if (mode == 2) {
            for (TLRPC.MessageEntity e : entities) {
                if (e.offset + e.length <= icon) {
                    result.add(e);
                }
            }
            return result;
        }
        String rest = name.substring(icon);
        int shift = icon + (rest.length() - rest.replaceFirst("^\\s+", "").length());
        if (rest.trim().isEmpty()) {
            return entities;
        }
        for (TLRPC.MessageEntity e : entities) {
            if (e instanceof TLRPC.TL_messageEntityCustomEmoji && e.offset >= shift) {
                TLRPC.TL_messageEntityCustomEmoji copy = new TLRPC.TL_messageEntityCustomEmoji();
                copy.document_id = ((TLRPC.TL_messageEntityCustomEmoji) e).document_id;
                copy.offset = e.offset - shift;
                copy.length = e.length;
                result.add(copy);
            }
        }
        return result;
    }

    /** Applies the counter mode to the value Telegram computed. */
    public static int counter(int account, int stock, boolean isDefault, MessagesController.DialogFilter filter) {
        int mode = TgYouPrefs.integer(COUNTER_MODE, 0);
        if (isDefault && hideAll()) {
            return 0;
        }
        if (mode == 0) {
            return stock;
        }
        if (mode == 2) {
            return 0;
        }
        MessagesController controller = MessagesController.getInstance(account);
        ArrayList<TLRPC.Dialog> list = isDefault || filter == null ? controller.getAllDialogs() : filter.dialogs;
        if (list == null) {
            return stock;
        }
        int count = 0;
        try {
            for (int i = 0, n = list.size(); i < n; i++) {
                TLRPC.Dialog d = list.get(i);
                if (d == null || (isDefault && d.folder_id != 0)) {
                    continue;
                }
                if ((d.unread_count > 0 || d.unread_mark) && !controller.isDialogMuted(d.id, 0)) {
                    count++;
                }
            }
        } catch (Throwable ignore) {
            return stock;
        }
        return count;
    }

    /** With the "All chats" tab hidden, returns the index of the first other folder, else -1. */
    public static int firstOther(ArrayList<MessagesController.DialogFilter> filters) {
        if (!hideAll() || filters == null) {
            return -1;
        }
        for (int i = 0; i < filters.size(); i++) {
            if (!filters.get(i).isDefault()) {
                return i;
            }
        }
        return -1;
    }
}
