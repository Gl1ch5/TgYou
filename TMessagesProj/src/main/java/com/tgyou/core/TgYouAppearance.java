package com.tgyou.core;

import android.content.Context;
import android.content.SharedPreferences;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.LaunchActivity;

/**
 * Живые настройки оформления: прозрачность пузырей и панели ввода, скругление пузырей.
 * Прозрачность накладывается в {@link #color(int, int)} (один хук в Theme.getColor).
 */
public final class TgYouAppearance {
    private static final String PREFS = "tgyou_appearance";

    private static int inAlpha = 100;
    private static int outAlpha = 100;
    private static int panelAlpha = 100;
    private static boolean loaded;

    private static final Runnable APPLY = TgYouAppearance::applyNow;
    private static final Runnable RELOAD = TgYouAppearance::reloadNow;

    private TgYouAppearance() {
    }

    private static synchronized void load() {
        if (loaded) {
            return;
        }
        loaded = true;
        try {
            SharedPreferences p = ApplicationLoader.applicationContext.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
            inAlpha = p.getInt("in", 100);
            outAlpha = p.getInt("out", 100);
            panelAlpha = p.getInt("panel", 100);
        } catch (Throwable ignore) {
        }
    }

    public static int inAlpha() {
        load();
        return inAlpha;
    }

    public static int outAlpha() {
        load();
        return outAlpha;
    }

    public static int panelAlpha() {
        load();
        return panelAlpha;
    }

    public static void set(int in, int out, int panel) {
        load();
        inAlpha = clamp(in);
        outAlpha = clamp(out);
        panelAlpha = clamp(panel);
        try {
            ApplicationLoader.applicationContext.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit()
                    .putInt("in", inAlpha).putInt("out", outAlpha).putInt("panel", panelAlpha).apply();
        } catch (Throwable ignore) {
        }
    }

    private static int clamp(int v) {
        return Math.max(10, Math.min(100, v));
    }

    /** Hook for Theme.getColor: scales the alpha channel of the keys we make translucent. */
    public static final String M3_RADIUS = "m3.radius";
    public static final String M3_PANEL = "m3.panel";
    public static final String M3_IN = "m3.in";
    public static final String M3_BAR = "m3.bar";
    public static final String M3_LIST = "m3.list";
    public static final String M3_DIV = "m3.div";
    public static final String[] M3_KEYS = {M3_RADIUS, M3_PANEL, M3_IN, M3_BAR, M3_LIST, M3_DIV};
    private static final String M3_PREV_RADIUS = "m3.prev_radius";
    private static final int M3_RADIUS_VALUE = 20;
    private static boolean m3Panel, m3In, m3Bar, m3List, m3Div, m3Any, m3Loaded;

    private static void m3Load() {
        m3Panel = TgYouPrefs.bool(M3_PANEL, false);
        m3In = TgYouPrefs.bool(M3_IN, false);
        m3Bar = TgYouPrefs.bool(M3_BAR, false);
        m3List = TgYouPrefs.bool(M3_LIST, false);
        m3Div = TgYouPrefs.bool(M3_DIV, false);
        m3Any = m3Panel || m3In || m3Bar || m3List || m3Div;
        m3Loaded = true;
    }

    /** Called when any Material Design 3 switch changed: applies the radius and repaints. */
    public static void m3Changed() {
        m3Load();
        boolean radius = TgYouPrefs.bool(M3_RADIUS, false);
        if (radius) {
            if (bubbleRadius() != M3_RADIUS_VALUE) {
                TgYouPrefs.setInt(M3_PREV_RADIUS, bubbleRadius());
                setBubbleRadius(M3_RADIUS_VALUE);
            }
        } else if (bubbleRadius() == M3_RADIUS_VALUE && TgYouPrefs.integer(M3_PREV_RADIUS, -1) >= 0) {
            setBubbleRadius(TgYouPrefs.integer(M3_PREV_RADIUS, 17));
        }
        apply();
        reloadUi();
    }

    private static int tonal(int color, float amount) {
        int accent = Theme.getColor(Theme.key_featuredStickers_addButton);
        return androidx.core.graphics.ColorUtils.blendARGB(color, accent | 0xFF000000, amount) & 0xFFFFFF | (color & 0xFF000000);
    }

    private static int m3(int key, int color) {
        if (key == Theme.key_chat_messagePanelBackground) {
            return m3Panel ? tonal(color, 0.10f) : color;
        } else if (key == Theme.key_chat_inBubble || key == Theme.key_chat_inBubbleSelected) {
            return m3In ? tonal(color, 0.10f) : color;
        } else if (key == Theme.key_actionBarDefault) {
            return m3Bar ? tonal(color, 0.12f) : color;
        } else if (key == Theme.key_windowBackgroundWhite) {
            return m3List ? tonal(color, 0.04f) : color;
        } else if (key == Theme.key_windowBackgroundGray) {
            return m3List ? tonal(color, 0.06f) : color;
        } else if (key == Theme.key_divider) {
            return m3Div ? color & 0xFFFFFF : color;
        }
        return color;
    }

    public static int color(int key, int color) {
        if (!loaded) {
            load();
        }
        if (!m3Loaded) {
            m3Load();
        }
        if (m3Any) {
            color = m3(key, color);
        }
        color = TgYouColors.apply(key, color);
        int percent;
        if (key == Theme.key_chat_inBubble || key == Theme.key_chat_inBubbleSelected) {
            percent = inAlpha;
        } else if (key == Theme.key_chat_outBubble || key == Theme.key_chat_outBubbleSelected
                || key == Theme.key_chat_outBubbleGradient1 || key == Theme.key_chat_outBubbleGradient2 || key == Theme.key_chat_outBubbleGradient3) {
            percent = outAlpha;
        } else if (key == Theme.key_chat_messagePanelBackground) {
            percent = panelAlpha;
        } else {
            return color;
        }
        if (percent >= 100) {
            return color;
        }
        int a = (color >>> 24) * percent / 100;
        return (a << 24) | (color & 0xFFFFFF);
    }

    public static int bubbleRadius() {
        return SharedConfig.bubbleRadius;
    }

    public static void setBubbleRadius(int radius) {
        SharedConfig.bubbleRadius = Math.max(0, Math.min(24, radius));
        try {
            MessagesController.getGlobalMainSettings().edit().putInt("bubbleRadius", SharedConfig.bubbleRadius).apply();
        } catch (Throwable ignore) {
        }
    }

    /** Re-reads theme colors in every open screen (debounced, safe to call while a slider is dragged). */
    public static void apply() {
        AndroidUtilities.cancelRunOnUIThread(APPLY);
        AndroidUtilities.runOnUIThread(APPLY, 200);
    }

    private static void applyNow() {
        try {
            Theme.refreshThemeColors(false, true);
        } catch (Throwable ignore) {
        }
    }

    /** Rebuilds all open screens: new radius, new icon pack, new fonts — no app restart needed. */
    public static void reloadUi() {
        AndroidUtilities.cancelRunOnUIThread(RELOAD);
        AndroidUtilities.runOnUIThread(RELOAD, 250);
    }

    private static void reloadNow() {
        try {
            if (LaunchActivity.instance != null) {
                Theme.reloadAllResources(LaunchActivity.instance);
            }
            Theme.createCommonMessageResources();
            Theme.refreshThemeColors(false, true);
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.reloadInterface);
        } catch (Throwable ignore) {
        }
    }

    public static void reset() {
        set(100, 100, 100);
        for (String key : M3_KEYS) {
            TgYouPrefs.setBool(key, false);
        }
        setBubbleRadius(17);
        m3Changed();
    }
}
