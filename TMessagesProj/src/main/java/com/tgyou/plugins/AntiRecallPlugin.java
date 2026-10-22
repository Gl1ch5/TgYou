package com.tgyou.plugins;

import android.text.TextUtils;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.PluginSettings;
import com.tgyou.core.Section;
import com.tgyou.core.SettingField;
import com.tgyou.core.TgYouDb;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Сохранение удалённых сообщений и истории правок. Messages the other side deletes stay in the
 * chat with a mark; every previous text of an edited message is kept and can be opened from the
 * message menu.
 */
public final class AntiRecallPlugin implements Plugin {

    private static final String KEEP_DELETED = "keep_deleted";
    private static final String KEEP_EDITS = "keep_edits";
    private static final String MARK_DELETED = "mark_deleted";
    private static final String MARK_EDITED = "mark_edited";

    private static final String[] DELETED_MARKS = {"🗑", "удалено", "deleted", "нет"};
    private static final String[] EDITED_MARKS = {"✎", "ред.", "нет"};

    private PluginSettings settings;

    @Override
    public String id() {
        return "anti_recall";
    }

    @Override
    public String name() {
        return "Удалённые и изменённые сообщения";
    }

    @Override
    public String description() {
        return "Сообщения, которые собеседник удалил, остаются в чате с пометкой. Прежние тексты "
                + "изменённых сообщений сохраняются, их можно открыть из меню сообщения.";
    }

    @Override
    public Section section() {
        return Section.MESSAGES;
    }

    @Override
    public List<SettingField> fields() {
        return Arrays.asList(
                SettingField.toggle(KEEP_DELETED, "Сохранять удалённые сообщения", true),
                SettingField.toggle(KEEP_EDITS, "Сохранять историю правок", true),
                SettingField.choice(MARK_DELETED, "Пометка удалённых", DELETED_MARKS[0], DELETED_MARKS),
                SettingField.choice(MARK_EDITED, "Пометка изменённых", EDITED_MARKS[0], EDITED_MARKS)
        );
    }

    @Override
    public void onLoad(PluginContext context) {
        settings = context.settings();

        context.on(Hooks.MESSAGES_DELETED, (deleted, ids) -> {
            if (!settings.getBoolean(KEEP_DELETED, true) || ids.isEmpty()) {
                return ids;
            }
            // only messages we actually have are worth keeping
            TgYouDb.get().markDeleted(deleted.account, deleted.dialogKey, deleted.ids, (int) (System.currentTimeMillis() / 1000));
            return Collections.emptyList();
        });

        context.on(Hooks.MESSAGE_EDITED, (edited, ignored) -> {
            if (!settings.getBoolean(KEEP_EDITS, true)) {
                return null;
            }
            TLRPC.Message now = edited.message;
            long key = TgYouDb.dialogKey(now);
            long dialogId = MessageObject.getDialogId(now);
            TLRPC.Message old = MessagesStorage.getInstance(edited.account).getMessage(dialogId, now.id);
            if (old != null && old.message != null && !old.message.equals(now.message)) {
                TgYouDb.get().addEdit(edited.account, key, now.id, old.message, old.edit_date != 0 ? old.edit_date : old.date);
            }
            return null;
        });

        context.on(Hooks.MESSAGE_TIME, (message, time) -> {
            if (message == null || message.messageOwner == null) {
                return time;
            }
            TgYouDb db = TgYouDb.get();
            int account = message.currentAccount;
            long key = TgYouDb.dialogKey(message);
            CharSequence result = time;
            if (db.isDeleted(account, key, message.getId())) {
                String mark = settings.getString(MARK_DELETED, DELETED_MARKS[0]);
                if (!mark.equals("нет")) {
                    result = TextUtils.concat(mark, " ", result);
                }
            }
            int edits = db.editCount(account, key, message.getId());
            if (edits > 0) {
                String mark = settings.getString(MARK_EDITED, EDITED_MARKS[0]);
                if (!mark.equals("нет")) {
                    result = TextUtils.concat(mark + edits + " ", result);
                }
            }
            return result;
        });

        context.on(Hooks.MESSAGE_MENU, (menu, ignored) -> {
            MessageObject message = menu.message;
            if (message.messageOwner == null) {
                return null;
            }
            int account = message.currentAccount;
            long key = TgYouDb.dialogKey(message);
            int count = TgYouDb.get().editCount(account, key, message.getId());
            if (count > 0) {
                menu.add("История правок (" + count + ")", org.telegram.messenger.R.drawable.msg_edit,
                        () -> showHistory(menu, account, key, message));
            }
            return null;
        });
    }

    private void showHistory(com.tgyou.core.MessageMenu menu, int account, long key, MessageObject message) {
        if (menu.fragment.getParentActivity() == null) {
            return;
        }
        List<TgYouDb.Edit> edits = TgYouDb.get().edits(account, key, message.getId());
        List<CharSequence> parts = new ArrayList<>();
        for (int i = 0; i < edits.size(); i++) {
            TgYouDb.Edit edit = edits.get(i);
            parts.add((i + 1) + ". " + LocaleController.formatDateChat(edit.date) + ", "
                    + LocaleController.getInstance().getFormatterDay().format((long) edit.date * 1000) + "\n" + edit.text);
        }
        parts.add("Сейчас:\n" + (message.messageOwner.message == null ? "" : message.messageOwner.message));
        AlertDialog.Builder builder = new AlertDialog.Builder(menu.fragment.getParentActivity());
        builder.setTitle("История правок");
        builder.setMessage(TextUtils.join("\n\n", parts));
        builder.setPositiveButton(LocaleController.getString(org.telegram.messenger.R.string.OK), null);
        menu.fragment.showDialog(builder.create());
    }
}
