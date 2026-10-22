package com.tgyou.ui;

import com.tgyou.core.Plugin;
import com.tgyou.core.PluginHost;
import com.tgyou.core.TgYouBackground;
import com.tgyou.core.TgYouListTweaks;
import com.tgyou.plugins.AntiRecallPlugin;

import org.telegram.messenger.R;
import org.telegram.ui.Components.IconBackgroundColors;

/** «Кастомизация». */
public class CustomizationScreen extends TgYouScreen {

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
        toggle("custom.plugin." + id, title, sub, host.isEnabled(p), v -> host.setEnabled(p, Boolean.TRUE.equals(v)));
    }

    @Override
    protected void build() {
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
