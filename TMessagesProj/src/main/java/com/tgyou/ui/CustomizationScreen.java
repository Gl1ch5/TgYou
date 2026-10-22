package com.tgyou.ui;

import com.tgyou.core.Plugin;
import com.tgyou.core.PluginHost;
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
        choice(AntiRecallPlugin.MARK_EDITED, "Метка изменённых", null, 0, "Значок", "Текст", "Нет");
        gap();

        header("Ссылки");
        link(R.drawable.settings_folders, IconBackgroundColors.PURPLE, "Pill Stack", "таблетки в строке поиска", () -> presentFragment(new PillStackScreen()));
        link(R.drawable.settings_privacy, IconBackgroundColors.GREEN, "Режим Призрака", "не читать, не печатать, офлайн", () -> presentFragment(new GhostScreen()));
        link(R.drawable.settings_data, IconBackgroundColors.ORANGE, "Основные", "жест возврата, архив, профиль", () -> presentFragment(new BasicScreen()));
        gap();

        header("Полезные функции");
        pluginToggle("local_premium", "Локальный Premium", "Открывает интерфейсные функции Premium на этом устройстве. Серверные функции не включаются.");
        pluginToggle("ad_block", "Отключить рекламу", "Спонсорские сообщения не показываются.");
        toggle(TgYouListTweaks.GHOST_STATUS, "Статус призрака в списке чатов", "Перед заголовком списка чатов показывается значок, когда включён режим призрака.", false);
        gap();
    }
}
