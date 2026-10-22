package com.tgyou.core;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/** The three-dots menu of a chat or a profile as seen by plugins. */
public final class ItemMenu {

    public static final String CHAT = "chat_action_menu";
    public static final String PROFILE = "profile_action_menu";

    public static final class Entry {
        public final String title;
        public final int icon;
        public final Runnable action;

        Entry(String title, int icon, Runnable action) {
            this.title = title;
            this.icon = icon;
            this.action = action;
        }
    }

    public final String type;
    public final BaseFragment fragment;
    public final long dialogId;
    public final TLRPC.User user;
    public final TLRPC.Chat chat;
    final List<Entry> entries = new ArrayList<>();

    ItemMenu(String type, BaseFragment fragment, long dialogId, TLRPC.User user, TLRPC.Chat chat) {
        this.type = type;
        this.fragment = fragment;
        this.dialogId = dialogId;
        this.user = user;
        this.chat = chat;
    }

    public void add(String title, int icon, Runnable action) {
        entries.add(new Entry(title, icon, action));
    }
}
