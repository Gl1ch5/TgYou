package com.tgyou.plugins;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.PluginSettings;
import com.tgyou.core.Section;
import com.tgyou.core.SettingField;

import java.util.Arrays;
import java.util.List;

/**
 * Скриншоты и режим стримера. Telegram marks secret chats and protected content as
 * non-capturable; this plugin can lift that, or do the opposite and hide the whole app from
 * screen capture. Takes effect the next time a screen is opened or the app is resumed.
 */
public final class ScreenPrivacyPlugin implements Plugin {

    private static final String ALLOW = "allow_screenshots";
    private static final String STREAMER = "streamer";

    private PluginSettings settings;

    @Override
    public String id() {
        return "screen_privacy";
    }

    @Override
    public String name() {
        return "Скриншоты и режим стримера";
    }

    @Override
    public String description() {
        return "Разрешает скриншоты там, где Telegram их запрещает (секретные чаты, защищённый контент), "
                + "либо наоборот скрывает всё приложение от записи экрана. Применяется при следующем открытии экрана.";
    }

    @Override
    public Section section() {
        return Section.PRIVACY;
    }

    @Override
    public List<SettingField> fields() {
        return Arrays.asList(
                SettingField.toggle(ALLOW, "Разрешить скриншоты везде", true),
                SettingField.toggle(STREAMER, "Режим стримера: скрывать приложение при записи экрана", false)
        );
    }

    @Override
    public void onLoad(PluginContext context) {
        settings = context.settings();
        context.on(Hooks.FLAG_SECURE, (ignored, secure) -> {
            if (settings.getBoolean(STREAMER, false)) {
                return true;
            }
            return settings.getBoolean(ALLOW, true) ? false : secure;
        });
    }
}
