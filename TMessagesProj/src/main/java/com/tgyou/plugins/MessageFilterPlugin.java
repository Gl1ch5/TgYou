package com.tgyou.plugins;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.Section;
import com.tgyou.core.TgYouPrefs;

import org.telegram.messenger.MessageObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 * Фильтры сообщений: общие (слова, фразы или регулярные выражения «re:...») и «теневой бан»
 * (сообщения выбранных пользователей скрыты везде). Настраивается на экране «Фильтры сообщений».
 */
public final class MessageFilterPlugin implements Plugin {

    public static final String ENABLED = "filters.enabled";
    public static final String WORDS = "filters.words";
    public static final String SHADOW = "filters.shadow";
    public static final String IN_CHATS = "filters.in_chats";
    public static final String ONLY_INCOMING = "filters.only_incoming";
    public static final String HIDE_BLOCKED = "filters.hide_blocked";

    private List<String> cachedSource = null;
    private final List<Object> compiled = new ArrayList<>();

    @Override
    public String id() {
        return "message_filter";
    }

    @Override
    public String name() {
        return "Фильтры сообщений";
    }

    @Override
    public String description() {
        return "Скрывает сообщения со словами из фильтров и сообщения пользователей из «теневого бана». Настройки: Настройки TgYou, «Фильтры сообщений».";
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
        context.on(Hooks.MESSAGE_VISIBLE, (message, visible) -> visible && !hidden(message));
    }

    private synchronized List<Object> filters() {
        List<String> raw = TgYouPrefs.list(WORDS);
        if (cachedSource == null || !cachedSource.equals(raw)) {
            cachedSource = new ArrayList<>(raw);
            compiled.clear();
            for (String w : raw) {
                String t = w.trim();
                if (t.isEmpty()) {
                    continue;
                }
                if (t.startsWith("re:")) {
                    try {
                        compiled.add(Pattern.compile(t.substring(3), Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE));
                    } catch (Throwable ignore) {
                    }
                } else {
                    compiled.add(t.toLowerCase(Locale.ROOT));
                }
            }
        }
        return compiled;
    }

    private boolean hidden(MessageObject message) {
        if (message == null || message.messageOwner == null || !TgYouPrefs.bool(ENABLED, true)) {
            return false;
        }
        long from = message.getFromChatId();
        if (from != 0 && !message.isOut() && TgYouPrefs.listHasLong(SHADOW, from)) {
            return true;
        }
        if (TgYouPrefs.bool(ONLY_INCOMING, true) && message.isOut()) {
            return false;
        }
        if (!TgYouPrefs.bool(IN_CHATS, true) && message.getDialogId() < 0) {
            return false;
        }
        List<Object> list = filters();
        String text = message.messageOwner.message;
        if (list.isEmpty() || text == null || text.isEmpty()) {
            return false;
        }
        String lower = text.toLowerCase(Locale.ROOT);
        for (Object f : list) {
            if (f instanceof Pattern ? ((Pattern) f).matcher(text).find() : lower.contains((String) f)) {
                return true;
            }
        }
        return false;
    }
}
