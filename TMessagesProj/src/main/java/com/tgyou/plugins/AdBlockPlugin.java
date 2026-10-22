package com.tgyou.plugins;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.PluginSettings;
import com.tgyou.core.Section;
import com.tgyou.core.SettingField;

import org.telegram.tgnet.TLRPC;

import java.util.Arrays;
import java.util.List;

/** Реклама: the requests that fetch sponsored messages and sponsored search results are dropped. */
public final class AdBlockPlugin implements Plugin {

    private static final String CHATS = "chats";
    private static final String SEARCH = "search";

    private PluginSettings settings;

    @Override
    public String id() {
        return "ad_block";
    }

    @Override
    public String name() {
        return "Блокировка рекламы";
    }

    @Override
    public String description() {
        return "Не загружает спонсорские сообщения в каналах и рекламу в поиске.";
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
    public List<SettingField> fields() {
        return Arrays.asList(
                SettingField.toggle(CHATS, "Спонсорские сообщения в каналах", true),
                SettingField.toggle(SEARCH, "Реклама в поиске", true)
        );
    }

    @Override
    public void onLoad(PluginContext context) {
        settings = context.settings();
        context.on(Hooks.OUTGOING_REQUEST, (request, blocked) -> {
            if (blocked) {
                return true;
            }
            if (request instanceof TLRPC.TL_messages_getSponsoredMessages) {
                return settings.getBoolean(CHATS, true);
            }
            if (request instanceof TLRPC.TL_contacts_getSponsoredPeers) {
                return settings.getBoolean(SEARCH, true);
            }
            return false;
        });
    }
}
