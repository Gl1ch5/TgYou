package com.tgyou.plugins;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.Section;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/** Время в пузыре сообщения с секундами. */
public final class ExactTimePlugin implements Plugin {

    private final SimpleDateFormat seconds = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());

    @Override
    public String id() {
        return "seconds_time";
    }

    @Override
    public String name() {
        return "Время с секундами";
    }

    @Override
    public String description() {
        return "Показывает в пузыре сообщения точное время: 14:05:32 вместо 14:05.";
    }

    @Override
    public Section section() {
        return Section.INTERFACE;
    }

    @Override
    public boolean enabledByDefault() {
        return true;
    }

    @Override
    public void onLoad(PluginContext context) {
        context.on(Hooks.MESSAGE_TIME, (message, time) -> {
            if (!com.tgyou.core.TgYouPrefs.bool(com.tgyou.core.TgYouTweaks.SECONDS, false) || time == null || message == null || message.messageOwner == null) {
                return time;
            }
            String text = time.toString();
            String exact = seconds.format(new Date(message.messageOwner.date * 1000L));
            String replaced = text.replaceFirst("\\d{1,2}:\\d{2}", exact);
            return replaced;
        });
    }
}
