package com.tgyou.plugins;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.Section;

import org.telegram.messenger.MessagesController;

/** Сообщения заблокированных пользователей в группах и каналах не показываются. */
public final class HideBlockedPlugin implements Plugin {

    @Override
    public String id() {
        return "hide_blocked";
    }

    @Override
    public String name() {
        return "Скрывать заблокированных";
    }

    @Override
    public String description() {
        return "Сообщения людей из вашего чёрного списка полностью пропадают из групп и обсуждений, а не сворачиваются в «заблокированное сообщение».";
    }

    @Override
    public Section section() {
        return Section.FILTERS;
    }

    @Override
    public boolean enabledByDefault() {
        return true;
    }

    @Override
    public void onLoad(PluginContext context) {
        context.on(Hooks.MESSAGE_VISIBLE, (message, visible) -> {
            if (!visible || !com.tgyou.core.TgYouPrefs.bool(MessageFilterPlugin.HIDE_BLOCKED, true) || message == null || message.messageOwner == null || message.isOut()) {
                return visible;
            }
            long from = message.getFromChatId();
            return from == 0 || MessagesController.getInstance(message.currentAccount).blockePeers.indexOfKey(from) < 0;
        });
    }
}
