package com.tgyou.core;

import android.view.View;
import android.view.ViewGroup;

import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

import java.util.Locale;

/** Logic behind the «Основные» screen; Telegram code reaches it only through {@link TgYouHooks}. */
public final class TgYouTweaks {

    public static final String NO_ROUND = "basic.no_round";
    public static final String SECONDS = "basic.seconds";
    public static final String VIBRATION = "basic.vibration";
    public static final String NO_NOTIFY_DELAY = "basic.no_notify_delay";
    public static final String ZALGO = "basic.zalgo";
    public static final String DOWNLOAD_BOOST = "basic.download_boost";
    public static final String UPLOAD_BOOST = "basic.upload_boost";
    public static final String SAVE_FOLDER = "basic.save_folder";
    public static final String RELATIVE_ONLINE = "basic.relative_online";
    public static final String HIDE_PHONE = "basic.hide_phone";
    public static final String SHOW_ID = "basic.show_id";
    public static final String SAVE_LAST_ONLINE = "spy.last_online";

    private TgYouTweaks() {
    }

    public static String fullNumber(int number, int[] rounded) {
        if (rounded != null) {
            rounded[0] = number;
        }
        return String.format(Locale.US, "%,d", number);
    }

    // ---- last seen ----------------------------------------------------------------------

    public static void userStatusUpdated(long userId, TLRPC.UserStatus status) {
        if (status == null || !TgYouPrefs.bool(SAVE_LAST_ONLINE, false) || status.expires <= 0) {
            return;
        }
        int now = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        TgYouPrefs.setLong("ls." + userId, Math.min(status.expires, now));
    }

    public static String relative(long seconds) {
        if (seconds < 60) {
            return "только что";
        }
        if (seconds < 3600) {
            return (seconds / 60) + " мин. назад";
        }
        if (seconds < 86400) {
            return (seconds / 3600) + " ч. назад";
        }
        return (seconds / 86400) + " дн. назад";
    }

    /** @return the status line to show instead of the stock one, or null to keep it */
    public static String userStatus(int account, TLRPC.User user, boolean[] isOnline) {
        if (user == null || user.status == null || user.bot) {
            return null;
        }
        boolean saveLast = TgYouPrefs.bool(SAVE_LAST_ONLINE, false);
        boolean relative = TgYouPrefs.bool(RELATIVE_ONLINE, false);
        if (!saveLast && !relative) {
            return null;
        }
        int now = ConnectionsManager.getInstance(account).getCurrentTime();
        int expires = user.status.expires;
        if (expires > now || org.telegram.messenger.MessagesController.getInstance(account).onlinePrivacy.containsKey(user.id)) {
            return null;
        }
        if (expires > 0) {
            return relative ? "был(а) " + relative(now - expires) : null;
        }
        if (saveLast) {
            long seen = TgYouPrefs.number("ls." + user.id, 0);
            if (seen > 0) {
                return "был(а) примерно " + relative(Math.max(0, now - seen)) + " (сохранено)";
            }
        }
        return null;
    }

    // ---- speed --------------------------------------------------------------------------

    public static int notificationDelay(int ms) {
        return TgYouPrefs.bool(NO_NOTIFY_DELAY, false) ? 0 : ms;
    }

    public static int downloadRequests(int n) {
        int level = TgYouPrefs.integer(DOWNLOAD_BOOST, 0);
        return level == 1 ? Math.max(n, 8) : level >= 2 ? Math.max(n, 16) : n;
    }

    public static int downloadChunk(int size) {
        return TgYouPrefs.integer(DOWNLOAD_BOOST, 0) >= 1 ? Math.max(size, 512 * 1024) : size;
    }

    public static int uploadRequests(int n, boolean slowNetwork) {
        int level = TgYouPrefs.integer(UPLOAD_BOOST, 0);
        if (slowNetwork || level == 0) {
            return n;
        }
        return level == 1 ? n * 2 : n * 4;
    }

    // ---- text ---------------------------------------------------------------------------

    private static boolean isZalgoMark(char c) {
        return c >= 0x0300 && c <= 0x036F || c >= 0x0483 && c <= 0x0489 || c >= 0x1AB0 && c <= 0x1AFF
                || c >= 0x1DC0 && c <= 0x1DFF || c >= 0x20D0 && c <= 0x20FF && c != 0x20E3 || c >= 0xFE20 && c <= 0xFE2F;
    }

    /**
     * Message text: marks beyond the second in a row become zero-width spaces, so the length and
     * the offsets of formatting entities stay the same.
     */
    public static CharSequence zalgo(CharSequence text) {
        if (!(text instanceof String) || !TgYouPrefs.bool(ZALGO, false)) {
            return text;
        }
        String s = (String) text;
        char[] chars = null;
        int run = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isZalgoMark(c)) {
                if (++run > 2) {
                    if (chars == null) {
                        chars = s.toCharArray();
                    }
                    chars[i] = '​';
                }
            } else {
                run = 0;
            }
        }
        return chars == null ? text : new String(chars);
    }

    /** Names: the marks are simply removed. */
    public static String zalgo(String name) {
        if (name == null || !TgYouPrefs.bool(ZALGO, false)) {
            return name;
        }
        StringBuilder sb = null;
        int run = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (isZalgoMark(c) && ++run > 2) {
                if (sb == null) {
                    sb = new StringBuilder(name.substring(0, i));
                }
            } else {
                if (!isZalgoMark(c)) {
                    run = 0;
                }
                if (sb != null) {
                    sb.append(c);
                }
            }
        }
        return sb == null ? name : sb.toString();
    }

    public static String phone(String formatted) {
        if (formatted == null || !TgYouPrefs.bool(HIDE_PHONE, false)) {
            return formatted;
        }
        return "+\u2022\u2022\u2022 \u2022\u2022\u2022 \u2022\u2022 \u2022\u2022";
    }

    public static String saveFolder() {
        String name = TgYouPrefs.str(SAVE_FOLDER, "TgYou");
        name = name == null ? "" : name.replaceAll("[\\\\/:*?\"<>|]", "").trim();
        return name.isEmpty() ? "TgYou" : name;
    }

    // ---- vibration ----------------------------------------------------------------------

    public static boolean vibrationAllowed() {
        return TgYouPrefs.bool(VIBRATION, true);
    }

    private static final ViewGroup.OnHierarchyChangeListener QUIET = new ViewGroup.OnHierarchyChangeListener() {
        @Override
        public void onChildViewAdded(View parent, View child) {
            silence(child);
        }

        @Override
        public void onChildViewRemoved(View parent, View child) {
        }
    };

    private static void silence(View view) {
        view.setHapticFeedbackEnabled(false);
        if (view instanceof ViewGroup) {
            ViewGroup group = (ViewGroup) view;
            group.setOnHierarchyChangeListener(QUIET);
            for (int i = 0; i < group.getChildCount(); i++) {
                silence(group.getChildAt(i));
            }
        }
    }

    public static void viewCreated(View view) {
        if (view != null && !vibrationAllowed()) {
            silence(view);
        }
    }
}
