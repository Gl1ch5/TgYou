package com.tgyou.mods;

import android.content.Context;

import com.tgyou.core.TgYouPrefs;

import java.io.InputStream;

/** The prompt for the AI that writes mods: the base text plus an addendum for the mode picked by the user. */
public final class AiPrompt {

    public static final String PREF = "mods.ai_mode";

    /** id, title, short description; "universal" has no addendum file. */
    public static final String[][] MODES = {
            {"universal", "Универсальный", "Любой мод, все возможности сразу"},
            {"ui", "Кастомизация интерфейса", "Цвета, шапки, фоны, кнопки на экранах"},
            {"privacy", "Приватность", "Скрыть активность, сохранить удалённое"},
            {"chat", "Чат и сообщения", "Меню сообщений, фильтры, действия в чате"},
            {"media", "Медиа и видео", "Фото, видео, голосовые, плеер"},
            {"network", "Сеть и запросы", "Наблюдение и фильтры запросов к серверу"},
            {"tools", "Инструменты и ИИ", "Внешние API, нейросети, автоматизация"},
    };

    private AiPrompt() {
    }

    public static int index() {
        String id = TgYouPrefs.str(PREF, "universal");
        for (int i = 0; i < MODES.length; i++) {
            if (MODES[i][0].equals(id)) {
                return i;
            }
        }
        return 0;
    }

    public static void select(int index) {
        TgYouPrefs.setStr(PREF, MODES[Math.max(0, Math.min(index, MODES.length - 1))][0]);
    }

    public static String title() {
        return MODES[index()][1];
    }

    public static String build(Context context) throws Exception {
        String base = read(context, "mod-sdk/AI_PROMPT.md");
        String id = MODES[index()][0];
        String addendum = "";
        if (!"universal".equals(id)) {
            addendum = read(context, "mod-sdk/modes/" + id + ".md");
        }
        return base.replace("{{MODE}}", addendum);
    }

    private static String read(Context context, String path) throws Exception {
        try (InputStream in = context.getAssets().open(path)) {
            return new String(ModStore.readAll(in), "UTF-8");
        }
    }
}
