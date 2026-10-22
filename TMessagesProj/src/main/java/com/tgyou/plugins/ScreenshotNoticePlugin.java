package com.tgyou.plugins;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.Section;

import org.telegram.tgnet.TLRPC;

/** Собеседник не узнает о скриншоте: ни в секретных, ни в обычных чатах. */
public final class ScreenshotNoticePlugin implements Plugin {

    @Override
    public String id() {
        return "screenshot_notice";
    }

    @Override
    public String name() {
        return "Скрывать скриншоты";
    }

    @Override
    public String description() {
        return "Не отправляет собеседнику уведомление о снятом скриншоте (секретные чаты и чаты с таймером).";
    }

    @Override
    public Section section() {
        return Section.PRIVACY;
    }

    @Override
    public boolean enabledByDefault() {
        return true;
    }

    @Override
    public void onLoad(PluginContext context) {
        context.on(Hooks.SCREENSHOT_NOTICE, (ignored, blocked) -> true);
        context.on(Hooks.OUTGOING_REQUEST, (request, blocked) -> blocked || request instanceof TLRPC.TL_messages_sendScreenshotNotification);
    }
}
