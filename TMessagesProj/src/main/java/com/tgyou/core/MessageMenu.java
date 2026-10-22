package com.tgyou.core;

import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/** The long-press menu of a chat message as seen by plugins. */
public final class MessageMenu {

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

    public final BaseFragment fragment;
    public final MessageObject message;
    final List<Entry> entries = new ArrayList<>();

    MessageMenu(BaseFragment fragment, MessageObject message) {
        this.fragment = fragment;
        this.message = message;
    }

    public void add(String title, int icon, Runnable action) {
        entries.add(new Entry(title, icon, action));
    }
}
