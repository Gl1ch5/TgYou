package com.tgyou.core;

import android.os.Bundle;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.DialogsActivity;

import java.util.ArrayList;

/** Chat-list tweaks: archive, title, stories, floating button, search bar. */
public final class TgYouListTweaks {

    public static final String HIDE_ARCHIVE = "basic.hide_archive";
    public static final String PULL_ARCHIVE = "basic.pull_archive";
    public static final String NO_SWIPE_BACK = "basic.no_swipe_back";
    public static final String TITLE_TEXT = "look.title_text";
    public static final String GHOST_STATUS = "custom.ghost_status";
    public static final String HIDE_STORIES = "look.hide_stories";
    public static final String HIDE_FAB = "look.hide_fab";
    public static final String HIDE_SEARCH = "look.hide_search";

    private TgYouListTweaks() {
    }

    public static ArrayList<TLRPC.Dialog> dialogList(ArrayList<TLRPC.Dialog> dialogs, int folderId) {
        if (dialogs == null || folderId != 0 || !TgYouPrefs.bool(HIDE_ARCHIVE, false)) {
            return dialogs;
        }
        boolean has = false;
        for (int i = 0; i < dialogs.size(); i++) {
            if (DialogObject.isFolderDialogId(dialogs.get(i).id)) {
                has = true;
                break;
            }
        }
        if (!has) {
            return dialogs;
        }
        ArrayList<TLRPC.Dialog> copy = new ArrayList<>(dialogs.size());
        for (TLRPC.Dialog d : dialogs) {
            if (!DialogObject.isFolderDialogId(d.id)) {
                copy.add(d);
            }
        }
        return copy;
    }

    public static void pullOpenArchive(DialogsActivity fragment) {
        if (fragment == null || !TgYouPrefs.bool(PULL_ARCHIVE, false)) {
            return;
        }
        Bundle args = new Bundle();
        args.putInt("folderId", 1);
        fragment.presentFragment(new DialogsActivity(args));
    }

    public static boolean noSwipeBack() {
        return TgYouPrefs.bool(NO_SWIPE_BACK, false);
    }

    public static String dialogsTitle(String stock) {
        String custom = TgYouPrefs.str(TITLE_TEXT, "");
        String title = custom == null || custom.trim().isEmpty() ? stock : custom.trim();
        if (TgYouPrefs.bool(GHOST_STATUS, false) && com.tgyou.plugins.GhostModePlugin.active()) {
            title = "👻 " + title;
        }
        return title;
    }

    public static boolean hideStories() {
        return TgYouPrefs.bool(HIDE_STORIES, false);
    }

    public static boolean hideFab() {
        return TgYouPrefs.bool(HIDE_FAB, false);
    }

    public static void searchField(android.view.View field, boolean onlySelect) {
        if (field != null && !onlySelect && TgYouPrefs.bool(HIDE_SEARCH, false)) {
            field.setVisibility(android.view.View.GONE);
        }
    }
}
