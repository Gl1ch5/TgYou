package com.tgyou.ui;

import android.content.Context;

import com.tgyou.core.TgYouAppearance;
import com.tgyou.core.TgYouGlass;
import com.tgyou.core.TgYouListTweaks;
import com.tgyou.core.TgYouPrefs;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.IconBackgroundColors;
import org.telegram.ui.ThemeActivity;

/** «Внешний вид». */
public class AppearanceScreen extends TgYouScreen {

    @Override
    protected String screenTitle() {
        return "Внешний вид";
    }

    @Override
    protected void build() {
        header("Скругление аватаров");
        slider(TgYouListTweaks.AVATAR_ROUND, 4, v -> TgYouAppearance.reloadUi(), TgYouListTweaks.ROUND_LABELS);
        info("100% даёт круглые аватары, 0% квадратные. Пока картинка грузится, заглушка остаётся круглой.");
        gap();

        header("Список чатов");
        toggle(TgYouListTweaks.SNOW, "Снег", "Падающий снег в шапке списка чатов в любое время года.", false);
        value("Заголовок", () -> TgYouPrefs.str(TgYouListTweaks.TITLE_TEXT, "").isEmpty() ? "Telegram You" : TgYouPrefs.str(TgYouListTweaks.TITLE_TEXT, ""),
                () -> askText("Заголовок списка чатов", TgYouPrefs.str(TgYouListTweaks.TITLE_TEXT, ""), false, text -> {
                    TgYouPrefs.setStr(TgYouListTweaks.TITLE_TEXT, text);
                    refresh();
                }));
        toggle(TgYouListTweaks.HIDE_STORIES, "Скрыть истории", "Лента историй над списком чатов не показывается.", false);
        toggle(TgYouListTweaks.HIDE_FAB, "Скрыть кнопку нового сообщения", "Плавающая кнопка «написать» пропадает.", false);
        toggle(TgYouListTweaks.HIDE_SEARCH, "Скрыть поиск", "Строка поиска в списке чатов скрыта, место под ней остаётся.", false);
        gap();

        header("Оформление");
        toggle("look.system_emoji", "Системные эмодзи", "Эмодзи рисует система, а не набор Telegram.", SharedConfig.useSystemEmoji, v -> {
            SharedConfig.useSystemEmoji = Boolean.TRUE.equals(v);
            ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", Context.MODE_PRIVATE).edit().putBoolean("useSystemEmoji", SharedConfig.useSystemEmoji).apply();
            TgYouAppearance.reloadUi();
        });
        toggle("look.glass", "Жидкое стекло", "Нативный эффект Liquid Glass Telegram на панелях.", false, v -> TgYouGlass.configure(Boolean.TRUE.equals(v), 1f, 1f, 1f));
        value("Скругление пузырей", () -> String.valueOf(TgYouAppearance.bubbleRadius()), () -> askText("Скругление (0-24)", String.valueOf(TgYouAppearance.bubbleRadius()), true, text -> {
            try {
                TgYouAppearance.setBubbleRadius(Integer.parseInt(text));
                TgYouAppearance.reloadUi();
                refresh();
            } catch (NumberFormatException e) {
                toast("Нужно число");
            }
        }));
        gap();

        header("Ещё");
        link(R.drawable.settings_folders, IconBackgroundColors.CYAN, "Прозрачность пузырей", "предпросмотр, скругление, размер текста", () -> presentFragment(new AppearanceActivity()));
        link(R.drawable.settings_folders, IconBackgroundColors.PURPLE, "Pill Stack", "таблетки в строке поиска", () -> presentFragment(new PillStackScreen()));
        link(R.drawable.settings_folders, IconBackgroundColors.ORANGE, "Иконки", "наборы .icons", () -> presentFragment(new IconPacksActivity()));
        link(R.drawable.settings_gift, IconBackgroundColors.RED, "Иконка приложения", "TgYou, Telegram и другие", () -> presentFragment(new TgYouIconsActivity()));
        link(R.drawable.settings_chat, IconBackgroundColors.BLUE, "Тема Telegram", "цвета, обои, ночной режим", () -> presentFragment(new ThemeActivity(ThemeActivity.THEME_TYPE_BASIC)));
        gap();
    }
}
