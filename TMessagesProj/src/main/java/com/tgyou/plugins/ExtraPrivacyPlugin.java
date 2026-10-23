package com.tgyou.plugins;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.PluginSettings;
import com.tgyou.core.Section;
import com.tgyou.core.SettingField;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

import java.util.Arrays;
import java.util.List;

/** Не засчитывает ваши просмотры постов и историй. Запросы правятся или отбрасываются до отправки. */
public final class ExtraPrivacyPlugin implements Plugin {

    private static final String NO_VIEWS = "no_views";
    private static final String NO_STORY_VIEWS = "no_story_views";

    private PluginSettings settings;

    @Override
    public boolean enabledByDefault() {
        return true;
    }

    @Override
    public String id() {
        return "extra_privacy";
    }

    @Override
    public String name() {
        return "Скрытые просмотры";
    }

    @Override
    public String description() {
        return "Не увеличивает счётчик просмотров постов в каналах и просмотров историй, когда вы их открываете.";
    }

    @Override
    public Section section() {
        return Section.PRIVACY;
    }

    @Override
    public List<SettingField> fields() {
        return Arrays.asList(
                SettingField.toggle(NO_VIEWS, "Не считать просмотры постов", true),
                SettingField.toggle(NO_STORY_VIEWS, "Не считать просмотры историй", true)
        );
    }

    @Override
    public void onLoad(PluginContext context) {
        settings = context.settings();
        context.on(Hooks.OUTGOING_REQUEST, (TLObject request, Boolean blocked) -> {
            if (request instanceof TLRPC.TL_messages_getMessagesViews && settings.getBoolean(NO_VIEWS, true)) {
                ((TLRPC.TL_messages_getMessagesViews) request).increment = false;
            }
            if (request instanceof TL_stories.TL_stories_incrementStoryViews && settings.getBoolean(NO_STORY_VIEWS, true)) {
                return true;
            }
            return blocked;
        });
    }
}
