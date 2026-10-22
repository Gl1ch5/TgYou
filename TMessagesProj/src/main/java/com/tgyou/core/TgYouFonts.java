package com.tgyou.core;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;

import org.telegram.messenger.ApplicationLoader;

import java.io.File;

/** Подмена жирных и курсивных шрифтов Telegram; выбор делается в плагине «Шрифты». */
public final class TgYouFonts {
    private static final String PREFS = "tgyou_plugins";

    private static boolean loaded;
    private static Typeface bold;
    private static Typeface italic;

    private TgYouFonts() {}

    private static synchronized void load() {
        if (loaded) return;
        if (ApplicationLoader.applicationContext == null) return;
        loaded = true;
        try {
            android.content.SharedPreferences p = ApplicationLoader.applicationContext.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
            if (!p.getBoolean("fonts.enabled", false)) return;
            String family = p.getString("fonts.family", "Системный");
            Typeface base;
            switch (family) {
                case "С засечками": base = Typeface.SERIF; break;
                case "Рукописный": base = Typeface.create("casual", Typeface.NORMAL); break;
                case "Узкий": base = Typeface.create("sans-serif-condensed", Typeface.NORMAL); break;
                case "Моноширинный": base = Typeface.MONOSPACE; break;
                case "Свой файл": {
                    File f = new File(p.getString("fonts.path", ""));
                    base = f.isFile() ? Typeface.createFromFile(f) : null;
                    break;
                }
                default: base = Typeface.DEFAULT;
            }
            if (base == null) return;
            if (Build.VERSION.SDK_INT >= 28) {
                bold = Typeface.create(base, 600, false);
                italic = Typeface.create(base, 400, true);
            } else {
                bold = Typeface.create(base, Typeface.BOLD);
                italic = Typeface.create(base, Typeface.ITALIC);
            }
        } catch (Throwable ignore) {}
    }

    /** @return замена для шрифта из assets Telegram или null, если оставить как есть */
    public static Typeface override(String assetPath) {
        load();
        if (assetPath == null || bold == null) return null;
        if (assetPath.contains("italic")) return italic;
        if (assetPath.contains("medium") || assetPath.contains("bold") || assetPath.contains("rextrabold")) return bold;
        return null;
    }
}
