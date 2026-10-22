package com.tgyou.plugins;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.PluginSettings;
import com.tgyou.core.Section;
import com.tgyou.core.SettingField;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;

import java.util.Arrays;
import java.util.List;

/**
 * Режим призрака: Telegram не узнаёт, что вы прочитали сообщение, печатаете или в сети.
 * The requests are dropped before they reach the network.
 */
public final class GhostModePlugin implements Plugin {

    private static final String NO_READ = "no_read";
    private static final String NO_TYPING = "no_typing";
    private static final String NO_ONLINE = "no_online";
    private static final String NO_CONTENT = "no_content";
    private static final String NO_STORY = "no_story";

    private PluginSettings settings;

    @Override
    public String id() {
        return "ghost_mode";
    }

    @Override
    public String name() {
        return "Режим призрака";
    }

    @Override
    public String description() {
        return "Скрывает от собеседников, что вы прочитали сообщение, печатаете или находитесь в сети. "
                + "На вашем телефоне чат выглядит прочитанным, на сервере остаётся непрочитанным.";
    }

    @Override
    public Section section() {
        return Section.PRIVACY;
    }

    @Override
    public List<SettingField> fields() {
        return Arrays.asList(
                SettingField.toggle(NO_READ, "Не отправлять «прочитано»", true),
                SettingField.toggle(NO_TYPING, "Не отправлять «печатает» и «записывает»", true),
                SettingField.toggle(NO_ONLINE, "Не отправлять статус «в сети»", true),
                SettingField.toggle(NO_CONTENT, "Не отмечать голосовые и видео прослушанными", false),
                SettingField.toggle(NO_STORY, "Не отмечать просмотр историй", true)
        );
    }

    @Override
    public void onLoad(PluginContext context) {
        settings = context.settings();
        context.on(Hooks.OUTGOING_REQUEST, (request, blocked) -> blocked || shouldBlock(request));
    }

    private boolean on(String key, boolean def) {
        return settings.getBoolean(key, def);
    }

    private boolean shouldBlock(TLObject request) {
        if (request instanceof TLRPC.TL_messages_readHistory
                || request instanceof TLRPC.TL_channels_readHistory
                || request instanceof TLRPC.TL_messages_readDiscussion
                || request instanceof TLRPC.TL_messages_readSavedHistory
                || request instanceof TLRPC.TL_messages_readEncryptedHistory) {
            return on(NO_READ, true);
        }
        if (request instanceof TLRPC.TL_messages_setTyping || request instanceof TLRPC.TL_messages_setEncryptedTyping) {
            return on(NO_TYPING, true);
        }
        if (request instanceof TL_account.updateStatus) {
            return on(NO_ONLINE, true);
        }
        if (request instanceof TLRPC.TL_messages_readMessageContents || request instanceof TLRPC.TL_channels_readMessageContents) {
            return on(NO_CONTENT, false);
        }
        if (request instanceof TL_stories.TL_stories_readStories) {
            return on(NO_STORY, true);
        }
        return false;
    }
}
