package com.tgyou.ui;

import android.content.Context;

import com.tgyou.core.Plugin;
import com.tgyou.core.PluginHost;
import com.tgyou.core.TgYouAppearance;
import com.tgyou.core.TgYouChatTweaks;
import com.tgyou.core.TgYouFolders;
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

    private static boolean systemFont() {
        PluginHost host = PluginHost.get();
        Plugin p = host == null ? null : host.find("fonts");
        return p != null && host.isEnabled(p) && "Системный".equals(host.settingsOf(p).getString("family", "Системный"));
    }

    private static void setSystemFont(boolean on) {
        PluginHost host = PluginHost.get();
        Plugin p = host == null ? null : host.find("fonts");
        if (p == null) {
            return;
        }
        if (on) {
            host.settingsOf(p).putString("family", "Системный");
        }
        host.setEnabled(p, on);
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
        toggle(TgYouListTweaks.HIDE_SEARCH, "Скрыть поиск", "Строка поиска в списке чатов скрыта, список поднимается на её место.", false);
        toggle(TgYouListTweaks.CENTER_TITLE, "Заголовок по центру", "Заголовок списка чатов выравнивается по центру шапки.", false);
        gap();

        header("Папки");
        choice(TgYouFolders.TITLE_MODE, "Заголовки папок", "Иконка — это эмодзи в начале названия папки.", 0, TgYouFolders.TITLE_LABELS);
        choice(TgYouFolders.COUNTER_MODE, "Счётчик уведомлений на папках", null, 0, TgYouFolders.COUNTER_LABELS);
        toggle(TgYouFolders.HIDE_ALL, "Скрыть вкладку «Все чаты»", "Вкладка не показывается; при открытии выбирается первая папка. Свайпом влево её всё ещё можно открыть.", false);
        gap();

        header("Material Design 3");
        master("m3", "Material Design 3", TgYouAppearance.M3_KEYS, new String[]{
                "Скругление пузырей 20",
                "Тональная панель ввода",
                "Тональные входящие пузыри",
                "Тональная шапка",
                "Тонированный фон списков",
                "Без разделителей"}, null, v -> TgYouAppearance.m3Changed());
        info("Оттенки берутся из акцентного цвета темы. Каждый пункт работает отдельно.");
        gap();

        header("Размытие");
        choice(TgYouGlass.STROKE, "Обводка стекла", "Светлая окантовка размытых панелей.", 0, v -> TgYouAppearance.reloadUi(), TgYouGlass.STROKE_LABELS);
        toggle(TgYouGlass.MENU, "Стеклянное меню сообщения", "Меню по долгому нажатию на сообщение становится полупрозрачным.", false);
        toggle(TgYouGlass.FORCE_BLUR, "Принудительное размытие", "Игнорировать серверный запрет размытия в светлой и тёмной теме.", false, v -> TgYouAppearance.reloadUi());
        gap();

        header("Оформление");
        toggle(TgYouChatTweaks.CHAT_THEMES, "Различные темы в чатах", "Показывать темы, которые собеседники ставят в чате. Выключено: везде ваша тема.", true);
        toggle(TgYouListTweaks.STICKY_AVATAR, "Липкая анимация аватарок", "Аватарка в профиле уменьшается и прилипает к шапке при прокрутке. Выключено: остаётся крупной.", true);
        toggle("look.system_font", "Системные шрифты", "Жирный и курсивный текст рисует системный шрифт вместо шрифтов Telegram. Применяется после перезапуска.", systemFont(), v -> setSystemFont(Boolean.TRUE.equals(v)));
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
