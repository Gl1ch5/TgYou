package com.tgyou.plugins;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.PluginSettings;
import com.tgyou.core.Section;
import com.tgyou.core.SettingField;

import org.telegram.messenger.MessageObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/** Скрывает входящие сообщения с заданными словами и сообщения от заблокированных ботов-спамеров по словам. */
public final class MessageFilterPlugin implements Plugin {

    private static final String WORDS = "words";
    private static final String ONLY_INCOMING = "only_incoming";

    private PluginSettings settings;
    private String cachedRaw = "";
    private List<String> cachedWords = new ArrayList<>();

    @Override
    public String id() {
        return "message_filter";
    }

    @Override
    public String name() {
        return "Фильтр сообщений";
    }

    @Override
    public String description() {
        return "Скрывает в чатах сообщения, в которых встречаются заданные слова или фразы (через запятую, без учёта регистра).";
    }

    @Override
    public Section section() {
        return Section.FILTERS;
    }

    @Override
    public List<SettingField> fields() {
        return Arrays.asList(
                SettingField.text(WORDS, "Слова и фразы через запятую", ""),
                SettingField.toggle(ONLY_INCOMING, "Только входящие", true)
        );
    }

    @Override
    public void onLoad(PluginContext context) {
        settings = context.settings();
        context.on(Hooks.MESSAGE_VISIBLE, (message, visible) -> visible && !matches(message));
    }

    private synchronized List<String> words() {
        String raw = settings.getString(WORDS, "");
        if (!raw.equals(cachedRaw)) {
            cachedRaw = raw;
            List<String> list = new ArrayList<>();
            for (String part : raw.split(",")) {
                String w = part.trim().toLowerCase(Locale.ROOT);
                if (!w.isEmpty()) {
                    list.add(w);
                }
            }
            cachedWords = list;
        }
        return cachedWords;
    }

    private boolean matches(MessageObject message) {
        List<String> words = words();
        if (words.isEmpty() || message == null || message.messageOwner == null) {
            return false;
        }
        if (settings.getBoolean(ONLY_INCOMING, true) && message.isOut()) {
            return false;
        }
        String text = message.messageOwner.message;
        if (text == null || text.isEmpty()) {
            return false;
        }
        text = text.toLowerCase(Locale.ROOT);
        for (String w : words) {
            if (text.contains(w)) {
                return true;
            }
        }
        return false;
    }
}
