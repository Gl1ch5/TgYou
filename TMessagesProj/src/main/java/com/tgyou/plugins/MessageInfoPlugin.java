package com.tgyou.plugins;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.Section;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MessageObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/** Пункты в меню сообщения: подробности (ID, дата, правка) и копирование ID. */
public final class MessageInfoPlugin implements Plugin {

    @Override
    public String id() {
        return "message_info";
    }

    @Override
    public String name() {
        return "Информация о сообщении";
    }

    @Override
    public String description() {
        return "В меню сообщения появляется пункт «Подробности»: ID, точная дата, время правки, пересылка. Нажатие копирует ID.";
    }

    @Override
    public Section section() {
        return Section.MESSAGES;
    }

    @Override
    public void onLoad(PluginContext context) {
        context.on(Hooks.MESSAGE_MENU, (menu, ignored) -> {
            MessageObject m = menu.message;
            if (m == null || m.messageOwner == null) {
                return null;
            }
            menu.add("Подробности сообщения", org.telegram.messenger.R.drawable.msg_info, () -> show(m));
            return null;
        });
    }

    private static void show(MessageObject m) {
        SimpleDateFormat f = new SimpleDateFormat("d MMM yyyy, HH:mm:ss", Locale.getDefault());
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(m.getId());
        sb.append("\nОтправлено: ").append(f.format(new Date(m.messageOwner.date * 1000L)));
        if (m.messageOwner.edit_date != 0) {
            sb.append("\nИзменено: ").append(f.format(new Date(m.messageOwner.edit_date * 1000L)));
        }
        if (m.messageOwner.fwd_from != null) {
            sb.append("\nПересланное");
        }
        Context context = ApplicationLoader.applicationContext;
        ClipboardManager cm = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        if (cm != null) {
            cm.setPrimaryClip(ClipData.newPlainText("message id", String.valueOf(m.getId())));
        }
        Toast.makeText(context, sb + "\n(ID скопирован)", Toast.LENGTH_LONG).show();
    }
}
