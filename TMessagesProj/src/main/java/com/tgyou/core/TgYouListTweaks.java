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
    public static final String AVATAR_ROUND = "look.avatar_round";
    public static final String CENTER_TITLE = "look.center_title";
    public static final String SNOW = "look.snow";

    public static final String[] ROUND_LABELS = {"0%", "25%", "50%", "75%", "100%"};
    private static final java.util.WeakHashMap<android.view.View, org.telegram.ui.Components.SnowflakesEffect> SNOW_EFFECTS = new java.util.WeakHashMap<>();

    /** Scales big round radii (avatars) to the chosen rounding; small radii of ordinary pictures stay untouched. */
    public static int[] avatarRadius(int[] radius) {
        int level = TgYouPrefs.integer(AVATAR_ROUND, 4);
        if (level >= 4 || radius == null || radius.length < 4) {
            return radius;
        }
        int min = org.telegram.messenger.AndroidUtilities.dp(14);
        int[] result = null;
        for (int i = 0; i < 4; i++) {
            if (radius[i] >= min) {
                if (result == null) {
                    result = radius.clone();
                }
                result[i] = Math.max(0, radius[i] * level / 4);
            }
        }
        return result == null ? radius : result;
    }

    /** Draws falling snow over the title bar of the chat list when forced from settings. */
    public static void snow(android.view.View bar, boolean eligible, android.graphics.Canvas canvas) {
        if (!eligible || !TgYouPrefs.bool(SNOW, false)) {
            return;
        }
        org.telegram.ui.Components.SnowflakesEffect effect = SNOW_EFFECTS.get(bar);
        if (effect == null) {
            effect = new org.telegram.ui.Components.SnowflakesEffect(0);
            SNOW_EFFECTS.put(bar, effect);
        }
        effect.onDraw(bar, canvas);
    }

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
        if (field instanceof org.telegram.ui.Components.FragmentSearchField && !onlySelect) {
            TgYouPillStack.attach((org.telegram.ui.Components.FragmentSearchField) field);
        }
    }

    /** Search bar height of the chat list: 0 when the bar is hidden, so no empty gap is left. */
    public static void searchHeight(DialogsActivity fragment, android.view.View root, boolean onlySelect, boolean active) {
        int h = active && !onlySelect && TgYouPrefs.bool(HIDE_SEARCH, false) ? 0 : 48;
        if (DialogsActivity.SEARCH_FIELD_HEIGHT != h) {
            DialogsActivity.SEARCH_FIELD_HEIGHT = h;
            if (root != null) {
                root.requestLayout();
            }
        }
    }

    public static boolean centerTitle(int folderId, long communityId, boolean onlySelect) {
        return folderId == 0 && communityId == 0 && !onlySelect && TgYouPrefs.bool(CENTER_TITLE, false);
    }

    public static final String STICKY_AVATAR = "look.sticky_avatar";

    public static boolean stickyAvatar() {
        return TgYouPrefs.bool(STICKY_AVATAR, true);
    }
}
