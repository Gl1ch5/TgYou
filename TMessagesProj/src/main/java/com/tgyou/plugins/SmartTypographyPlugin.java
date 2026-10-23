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

/** Исправляет типографику исходящего текста: тире, многоточие, кавычки-«ёлочки». Только сообщения без форматирования. */
public final class SmartTypographyPlugin implements Plugin {

    private static final String QUOTES = "quotes";
    private PluginSettings settings;

    @Override
    public boolean enabledByDefault() {
        return true;
    }

    @Override
    public String id() {
        return "smart_typography";
    }

    @Override
    public String name() {
        return "Умная типографика";
    }

    @Override
    public String description() {
        return "В отправляемом тексте меняет « -- » на «—», «...» на «…» и при желании \"кавычки\" на «ёлочки». "
                + "Сообщения с форматированием, ссылками и кодом не трогает.";
    }

    @Override
    public Section section() {
        return Section.MESSAGES;
    }

    @Override
    public List<SettingField> fields() {
        return Arrays.asList(SettingField.toggle(QUOTES, "Заменять кавычки на «ёлочки»", true));
    }

    @Override
    public void onLoad(PluginContext context) {
        settings = context.settings();
        context.on(Hooks.OUTGOING_REQUEST, (request, blocked) -> {
            if (request instanceof TLRPC.TL_messages_sendMessage) {
                TLRPC.TL_messages_sendMessage r = (TLRPC.TL_messages_sendMessage) request;
                if (r.entities == null || r.entities.isEmpty()) {
                    r.message = fix(r.message);
                }
            }
            return blocked;
        });
    }

    private String fix(String text) {
        if (text == null || text.isEmpty() || text.startsWith("/") || text.contains("://") || text.contains("`")) {
            return text;
        }
        String s = text.replace(" -- ", " — ").replace("...", "…");
        if (settings.getBoolean(QUOTES, true) && s.indexOf('"') >= 0) {
            StringBuilder b = new StringBuilder(s.length());
            boolean open = true;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '"') {
                    b.append(open ? '«' : '»');
                    open = !open;
                } else {
                    b.append(c);
                }
            }
            s = b.toString();
        }
        return s;
    }
}
