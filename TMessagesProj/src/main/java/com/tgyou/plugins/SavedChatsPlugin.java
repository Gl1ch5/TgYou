package com.tgyou.plugins;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.Section;

/** Чаты, из которых вас исключили или где вам закрыли доступ, остаются в списке диалогов с кэшированной перепиской. */
public final class SavedChatsPlugin implements Plugin {

    @Override
    public String id() {
        return "saved_chats";
    }

    @Override
    public String name() {
        return "Сохранять чаты после бана";
    }

    @Override
    public String description() {
        return "Если вас исключили из группы или канала, чат не пропадает из списка, а сохранённая переписка остаётся доступной.";
    }

    @Override
    public Section section() {
        return Section.MESSAGES;
    }

    @Override
    public void onLoad(PluginContext context) {
        context.on(Hooks.KEEP_KICKED_CHAT, (chat, keep) -> true);
    }
}
