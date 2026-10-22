package com.tgyou.core;

import android.content.Context;
import android.content.SharedPreferences;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LiteMode;

/** Параметры нативного Liquid Glass Telegram; настраиваются модом «Liquid Glass». */
public final class TgYouGlass {
    private static final String PREFS = "tgyou_glass";

    private static float thickness = 1f;
    private static float intensity = 1f;
    private static float index = 1f;
    private static boolean loaded;

    private TgYouGlass() {}

    private static synchronized void load() {
        if (loaded) return;
        loaded = true;
        try {
            SharedPreferences p = ApplicationLoader.applicationContext.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
            thickness = p.getFloat("thickness", 1f);
            intensity = p.getFloat("intensity", 1f);
            index = p.getFloat("index", 1f);
        } catch (Throwable ignore) {}
    }

    /** Множители 0.2..3; enabled включает флаг Liquid Glass в «Режиме энергосбережения». */
    public static synchronized void configure(boolean enabled, float thick, float inten, float idx) {
        loaded = true;
        thickness = clamp(thick);
        intensity = clamp(inten);
        index = clamp(idx);
        try {
            ApplicationLoader.applicationContext.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit()
                .putFloat("thickness", thickness).putFloat("intensity", intensity).putFloat("index", index).apply();
            LiteMode.toggleFlag(LiteMode.FLAG_LIQUID_GLASS, enabled);
        } catch (Throwable ignore) {}
    }

    private static float clamp(float v) {
        return Math.max(0.2f, Math.min(3f, v));
    }

    public static float thickness(float v) { load(); return v * thickness; }
    public static float intensity(float v) { load(); return v * intensity; }
    public static float index(float v) { load(); return v * index; }
}
