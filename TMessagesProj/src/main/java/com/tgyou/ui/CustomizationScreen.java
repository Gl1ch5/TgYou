package com.tgyou.ui;

import com.tgyou.core.Plugin;
import com.tgyou.core.PluginHost;
import com.tgyou.core.TgYouAppearance;
import com.tgyou.core.TgYouBackground;
import com.tgyou.core.TgYouChatTweaks;
import com.tgyou.core.TgYouColors;
import com.tgyou.core.TgYouFolders;
import com.tgyou.core.TgYouGlass;
import com.tgyou.core.TgYouPrefs;
import com.tgyou.core.TgYouListTweaks;
import com.tgyou.plugins.AntiRecallPlugin;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.IconBackgroundColors;

/** «Кастомизация». */
public class CustomizationScreen extends TgYouScreen {

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
    protected String screenTitle() {
        return "Кастомизация";
    }

    private static Plugin plugin(String id) {
        PluginHost host = PluginHost.get();
        if (host != null) {
            for (Plugin p : host.plugins()) {
                if (p.id().equals(id)) {
                    return p;
                }
            }
        }
        return null;
    }

    private void pluginToggle(String id, String title, String sub) {
        Plugin p = plugin(id);
        if (p == null) {
            return;
        }
        PluginHost host = PluginHost.get();
        com.tgyou.core.TgYouPrefs.setBool("custom.plugin." + id, host.isEnabled(p));
        toggle("custom.plugin." + id, title, sub, host.isEnabled(p), v -> host.setEnabled(p, Boolean.TRUE.equals(v)));
    }

    private static final String GLASS_THICK = "look.glass_thick";
    private static final String GLASS_POWER = "look.glass_power";
    private static final String GLASS_REFRACT = "look.glass_refract";
    private static final float[] GLASS_STEPS = {0.4f, 0.7f, 1f, 1.5f, 2f, 3f};
    private static final String[] GLASS_LABELS = {"0.4×", "0.7×", "1×", "1.5×", "2×", "3×"};

    private CustomizationPreview preview;

    private void glassChanged() {
        TgYouGlass.configure(LiteMode.isEnabled(LiteMode.FLAG_LIQUID_GLASS),
                GLASS_STEPS[TgYouPrefs.integer(GLASS_THICK, 2)],
                GLASS_STEPS[TgYouPrefs.integer(GLASS_POWER, 2)],
                GLASS_STEPS[TgYouPrefs.integer(GLASS_REFRACT, 2)]);
        TgYouAppearance.reloadUi();
    }

    private void colorChanged() {
        if (preview != null) {
            preview.invalidate();
        }
        refresh();
    }

    private void askHex(TgYouColors.Entry e) {
        int cur = TgYouColors.get(e);
        askText(e.title + ": цвет HEX (например 8C58F6)", cur == 0 ? "" : String.format("%06X", cur & 0xFFFFFF), false, text -> {
            try {
                String t = text.trim().replace("#", "");
                if (t.length() != 6) {
                    throw new NumberFormatException();
                }
                TgYouColors.set(e, 0xFF000000 | Integer.parseInt(t, 16));
                colorChanged();
            } catch (NumberFormatException ex) {
                toast("Нужен цвет из 6 символов, например 8C58F6");
            }
        });
    }

    @Override
    protected void build() {
        header("Предпросмотр");
        custom("demo", context -> {
            preview = new CustomizationPreview(context);
            return preview;
        }, view -> view.invalidate());
        info("Миниатюра интерфейса: меняется сразу, как только вы выбираете цвет или стекло.");
        gap();

        header("Свои цвета");
        for (TgYouColors.Entry entry : TgYouColors.ENTRIES) {
            custom("color_" + entry.id, context -> new ColorRow(context, entry, this::colorChanged, () -> askHex(entry)), view -> ((ColorRow) view).sync());
        }
        info("∅ — цвет темы. Нажмите на выбранный кружок ещё раз, чтобы сбросить, «#» — ввести свой HEX. Прозрачность пузырей сохраняется.");
        toggle(TgYouColors.AMOLED, "Чёрный AMOLED-фон", "В тёмной теме фоны списков, панель ввода и диалоги становятся чисто чёрными.", false, v -> {
            TgYouColors.reload();
            TgYouAppearance.apply();
            colorChanged();
        });
        button("Сбросить все цвета", true, () -> confirm("Сбросить цвета", "Все свои цвета и AMOLED-режим будут отключены.", "Сбросить", () -> {
            TgYouColors.reset();
            colorChanged();
        }));
        gap();

        header("Стекло");
        slider(GLASS_THICK, 2, v -> glassChanged(), GLASS_LABELS);
        info("Толщина стекла.");
        slider(GLASS_POWER, 2, v -> glassChanged(), GLASS_LABELS);
        info("Сила эффекта.");
        slider(GLASS_REFRACT, 2, v -> glassChanged(), GLASS_LABELS);
        info("Преломление: насколько сильно стекло искажает то, что за ним. Меняет нативный Liquid Glass; панель включается переключателем ниже.");
        TgYouPrefs.setBool("look.glass", LiteMode.isEnabled(LiteMode.FLAG_LIQUID_GLASS));
        toggle("look.glass", "Жидкое стекло", "Нативный эффект Liquid Glass Telegram на панелях. Главная панель меняется после перезапуска.", false,
                v -> TgYouGlass.configure(Boolean.TRUE.equals(v), TgYouGlass.thickness(1f), TgYouGlass.intensity(1f), TgYouGlass.index(1f)));
        choice(TgYouGlass.STROKE, "Обводка стекла", "Светлая окантовка размытых панелей.", 0, v -> { TgYouAppearance.reloadUi(); colorChanged(); }, TgYouGlass.STROKE_LABELS);
        toggle(TgYouGlass.MENU, "Стеклянное меню сообщения", "Меню по долгому нажатию на сообщение становится полупрозрачным.", false);
        toggle(TgYouGlass.FORCE_BLUR, "Принудительное размытие", "Игнорировать серверный запрет размытия в светлой и тёмной теме.", false, v -> TgYouAppearance.reloadUi());
        gap();

        header("Аватары и список чатов");
        slider(TgYouListTweaks.AVATAR_ROUND, 4, v -> TgYouAppearance.reloadUi(), TgYouListTweaks.ROUND_LABELS);
        info("Скругление аватаров: 100% круглые, 0% квадратные.");
        toggle(TgYouListTweaks.SNOW, "Снег", "Падающий снег в шапке списка чатов в любое время года.", false);
        value("Заголовок", () -> TgYouPrefs.str(TgYouListTweaks.TITLE_TEXT, "").isEmpty() ? "Telegram You" : TgYouPrefs.str(TgYouListTweaks.TITLE_TEXT, ""),
                () -> askText("Заголовок списка чатов", TgYouPrefs.str(TgYouListTweaks.TITLE_TEXT, ""), false, text -> {
                    TgYouPrefs.setStr(TgYouListTweaks.TITLE_TEXT, text);
                    refresh();
                }));
        toggle(TgYouListTweaks.CENTER_TITLE, "Заголовок по центру", "Заголовок списка чатов выравнивается по центру шапки.", false);
        toggle(TgYouListTweaks.HIDE_STORIES, "Скрыть истории", "Лента историй над списком чатов не показывается.", false);
        toggle(TgYouListTweaks.HIDE_FAB, "Скрыть кнопку нового сообщения", "Плавающая кнопка «написать» пропадает.", false);
        toggle(TgYouListTweaks.HIDE_SEARCH, "Скрыть поиск", "Строка поиска в списке чатов скрыта, список поднимается на её место.", false);
        toggle(com.tgyou.core.TgYouMiniAvatars.KEY, "Мини-аватарки отправителей", "Маленькая аватарка автора последнего сообщения перед превью в группах. Работает в двухстрочном виде списка.", false, v -> TgYouAppearance.reloadUi());
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
                "Без разделителей"}, null, v -> { TgYouAppearance.m3Changed(); colorChanged(); });
        info("Оттенки берутся из акцентного цвета темы. Каждый пункт работает отдельно.");
        gap();

        header("Оформление");
        toggle(TgYouChatTweaks.CHAT_THEMES, "Различные темы в чатах", "Показывать темы, которые собеседники ставят в чате. Выключено: везде ваша тема.", true);
        toggle(TgYouListTweaks.STICKY_AVATAR, "Липкая анимация аватарок", "Аватарка в профиле уменьшается и прилипает к шапке при прокрутке. Выключено: остаётся крупной.", true);
        TgYouPrefs.setBool("look.system_font", systemFont());
        TgYouPrefs.setBool("look.system_emoji", SharedConfig.useSystemEmoji);
        toggle("look.system_font", "Системные шрифты", "Жирный и курсивный текст рисует системный шрифт вместо шрифтов Telegram. Применяется после перезапуска.", systemFont(), v -> setSystemFont(Boolean.TRUE.equals(v)));
        toggle("look.system_emoji", "Системные эмодзи", "Эмодзи рисует система, а не набор Telegram. Полностью применяется после перезапуска.", SharedConfig.useSystemEmoji, v -> {
            SharedConfig.useSystemEmoji = Boolean.TRUE.equals(v);
            ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", android.content.Context.MODE_PRIVATE).edit().putBoolean("useSystemEmoji", SharedConfig.useSystemEmoji).apply();
            TgYouAppearance.reloadUi();
        });
        value("Скругление пузырей", () -> String.valueOf(TgYouAppearance.bubbleRadius()), () -> askText("Скругление (0-24)", String.valueOf(TgYouAppearance.bubbleRadius()), true, text -> {
            try {
                TgYouAppearance.setBubbleRadius(Integer.parseInt(text));
                TgYouAppearance.reloadUi();
                colorChanged();
            } catch (NumberFormatException e) {
                toast("Нужно число");
            }
        }));
        gap();

        header("Удалённые сообщения");
        custom("preview", context -> {
            android.widget.TextView t = new android.widget.TextView(context);
            t.setText("Так выглядит сообщение, которое собеседник удалил");
            t.setTextSize(15);
            t.setPadding(org.telegram.messenger.AndroidUtilities.dp(20), org.telegram.messenger.AndroidUtilities.dp(16), org.telegram.messenger.AndroidUtilities.dp(20), org.telegram.messenger.AndroidUtilities.dp(16));
            t.setTextColor(org.telegram.ui.ActionBar.Theme.getColor(org.telegram.ui.ActionBar.Theme.key_windowBackgroundWhiteBlackText));
            return t;
        }, view -> {
            ((android.widget.TextView) view).setAlpha(com.tgyou.core.TgYouPrefs.bool(AntiRecallPlugin.DIM, true) ? 0.5f : 1f);
            int mark = com.tgyou.core.TgYouPrefs.integer(AntiRecallPlugin.MARK_DELETED, 0);
            ((android.widget.TextView) view).setText("Так выглядит сообщение, которое собеседник удалил"
                    + (mark == 0 ? "  [корзина]" : mark == 1 ? "  удалено" : ""));
        });
        toggle(AntiRecallPlugin.DIM, "Полупрозрачные удалёнки", "Удалённые сообщения затемняются.", true, v -> refresh());
        choice(AntiRecallPlugin.MARK_DELETED, "Метка удалёнок", null, 0, v -> refresh(), "Значок", "Текст", "Нет");
        custom("mark_colors", context -> new ColorDots(context), view -> ((ColorDots) view).sync());
        info("Цвет метки удалённых: нажмите на кружок, повторное нажатие сбрасывает цвет.");
        choice(AntiRecallPlugin.MARK_EDITED, "Метка изменённых", null, 0, "Значок", "Текст", "Нет");
        gap();

        header("Ссылки");
        link(R.drawable.settings_chat, IconBackgroundColors.BLUE, "Жесты", "свайп по сообщению, двойное касание", () -> presentFragment(new GesturesScreen()));
        link(R.drawable.settings_folders, IconBackgroundColors.PURPLE, "Pill Stack", "таблетки в строке поиска", () -> presentFragment(new PillStackScreen()));
        link(R.drawable.settings_privacy, IconBackgroundColors.GREEN, "Режим Призрака", "не читать, не печатать, офлайн", () -> presentFragment(new GhostScreen()));
        link(R.drawable.settings_folders, IconBackgroundColors.CYAN, "Прозрачность пузырей", "предпросмотр, размер текста", () -> presentFragment(new AppearanceActivity()));
        link(R.drawable.settings_folders, IconBackgroundColors.ORANGE, "Иконки", "наборы .icons", () -> presentFragment(new IconPacksActivity()));
        link(R.drawable.settings_gift, IconBackgroundColors.RED, "Иконка приложения", "TgYou, Telegram и другие", () -> presentFragment(new TgYouIconsActivity()));
        link(R.drawable.settings_chat, IconBackgroundColors.BLUE, "Тема Telegram", "цвета, обои, ночной режим", () -> presentFragment(new org.telegram.ui.ThemeActivity(org.telegram.ui.ThemeActivity.THEME_TYPE_BASIC)));
        link(R.drawable.settings_data, IconBackgroundColors.ORANGE, "Основные", "жест возврата, архив, профиль", () -> presentFragment(new BasicScreen()));
        gap();

        header("Полезные функции");
        pluginToggle("local_premium", "Локальный Premium", "Открывает интерфейсные функции Premium на этом устройстве. Серверные функции не включаются.");
        pluginToggle("ad_block", "Отключить рекламу", "Спонсорские сообщения не показываются.");
        toggle(TgYouListTweaks.GHOST_STATUS, "Статус призрака в списке чатов", "Перед заголовком списка чатов показывается значок, когда включён режим призрака.", false);
        toggle(TgYouBackground.KEY, "Работать в фоне", "Просит исключить TgYou из оптимизации батареи и держит постоянную службу уведомлений, чтобы сообщения приходили без задержек.", false,
                v -> TgYouBackground.set(getParentActivity(), Boolean.TRUE.equals(v)));
        gap();
    }

    /** Ряд из 8 цветных кружков для метки удалённых сообщений. */
    private static final class ColorDots extends android.widget.LinearLayout {
        private final android.view.View[] dots = new android.view.View[AntiRecallPlugin.MARK_COLORS.length];

        ColorDots(android.content.Context context) {
            super(context);
            setOrientation(HORIZONTAL);
            setGravity(android.view.Gravity.CENTER);
            int pad = org.telegram.messenger.AndroidUtilities.dp(8);
            setPadding(pad, pad, pad, pad);
            for (int i = 0; i < dots.length; i++) {
                final int index = i + 1;
                android.view.View dot = new android.view.View(context);
                dots[i] = dot;
                android.widget.LinearLayout.LayoutParams lp = new android.widget.LinearLayout.LayoutParams(org.telegram.messenger.AndroidUtilities.dp(28), org.telegram.messenger.AndroidUtilities.dp(28));
                lp.setMargins(pad / 2, 0, pad / 2, 0);
                addView(dot, lp);
                dot.setOnClickListener(v -> {
                    int now = com.tgyou.core.TgYouPrefs.integer(AntiRecallPlugin.MARK_COLOR, 0);
                    com.tgyou.core.TgYouPrefs.setInt(AntiRecallPlugin.MARK_COLOR, now == index ? 0 : index);
                    sync();
                });
            }
            sync();
        }

        void sync() {
            int selected = com.tgyou.core.TgYouPrefs.integer(AntiRecallPlugin.MARK_COLOR, 0);
            for (int i = 0; i < dots.length; i++) {
                android.graphics.drawable.GradientDrawable d = new android.graphics.drawable.GradientDrawable();
                d.setShape(android.graphics.drawable.GradientDrawable.OVAL);
                d.setColor(AntiRecallPlugin.MARK_COLORS[i]);
                if (selected == i + 1) {
                    d.setStroke(org.telegram.messenger.AndroidUtilities.dp(3), org.telegram.ui.ActionBar.Theme.getColor(org.telegram.ui.ActionBar.Theme.key_windowBackgroundWhiteBlackText));
                }
                dots[i].setBackground(d);
            }
        }
    }
}
