package com.tgyou.plugins;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.PluginSettings;
import com.tgyou.core.Section;
import com.tgyou.core.SettingField;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

import java.util.Arrays;
import java.util.List;

/** Extra entries in the message menu: search, share, copy as quote, copy link. */
public final class MessageToolsPlugin implements Plugin {

    private PluginSettings settings;

    @Override
    public String id() {
        return "message_tools";
    }

    @Override
    public String name() {
        return "Инструменты сообщения";
    }

    @Override
    public String description() {
        return "Дополнительные пункты в меню сообщения: поиск в Google, поделиться текстом, копировать как цитату, копировать ссылку.";
    }

    @Override
    public Section section() {
        return Section.MESSAGES;
    }

    @Override
    public List<SettingField> fields() {
        return Arrays.asList(
                SettingField.toggle("google", "Найти в Google", true),
                SettingField.toggle("share", "Поделиться текстом", true),
                SettingField.toggle("quote", "Копировать как цитату", true),
                SettingField.toggle("link", "Копировать ссылку на сообщение", true)
        );
    }

    @Override
    public void onLoad(PluginContext context) {
        settings = context.settings();
        context.on(Hooks.MESSAGE_MENU, (menu, ignored) -> {
            MessageObject m = menu.message;
            if (m == null || m.messageOwner == null) {
                return null;
            }
            String text = m.messageOwner.message;
            boolean hasText = text != null && !text.trim().isEmpty();
            if (hasText && settings.getBoolean("google", true)) {
                menu.add("Найти в Google", R.drawable.msg_search, () -> open("https://www.google.com/search?q=" + Uri.encode(text)));
            }
            if (hasText && settings.getBoolean("share", true)) {
                menu.add("Поделиться текстом", R.drawable.msg_share, () -> share(text));
            }
            if (hasText && settings.getBoolean("quote", true)) {
                menu.add("Копировать как цитату", R.drawable.msg_copy, () -> copy("> " + text.replace("\n", "\n> ")));
            }
            if (settings.getBoolean("link", true)) {
                String link = link(m);
                if (link != null) {
                    menu.add("Копировать ссылку", R.drawable.msg_link, () -> copy(link));
                }
            }
            return null;
        });
    }

    private static String link(MessageObject m) {
        TLRPC.Peer peer = m.messageOwner.peer_id;
        if (peer == null || peer.channel_id == 0) {
            return null;
        }
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(peer.channel_id);
        if (chat != null && chat.username != null && !chat.username.isEmpty()) {
            return "https://t.me/" + chat.username + "/" + m.getId();
        }
        return "https://t.me/c/" + peer.channel_id + "/" + m.getId();
    }

    private static void copy(String text) {
        Context context = ApplicationLoader.applicationContext;
        ClipboardManager cm = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        if (cm != null) {
            cm.setPrimaryClip(ClipData.newPlainText("text", text));
            Toast.makeText(context, "Скопировано", Toast.LENGTH_SHORT).show();
        }
    }

    private static void open(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        ApplicationLoader.applicationContext.startActivity(intent);
    }

    private static void share(String text) {
        Intent send = new Intent(Intent.ACTION_SEND);
        send.setType("text/plain");
        send.putExtra(Intent.EXTRA_TEXT, text);
        Intent chooser = Intent.createChooser(send, null);
        chooser.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        ApplicationLoader.applicationContext.startActivity(chooser);
    }
}
