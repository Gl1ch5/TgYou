package com.tgyou.plugins;

import android.text.TextUtils;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.TgYouPrefs;
import com.tgyou.core.Section;
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

    public static final String KEEP_DELETED = "spy.keep_deleted";
    public static final String KEEP_EDITS = "spy.keep_edits";
    public static final String MARK_DELETED = "spy.mark_deleted";
    public static final String MARK_EDITED = "spy.mark_edited";
    public static final String DIM = "spy.dim";
    public static final String KEEP_READS = "spy.keep_reads";
    public static final String EXCEPTIONS = "spy.exceptions";

    private static final String[] MARKS = {"значок", "текст", "нет"};

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
    public boolean enabledByDefault() {
        return true;
    }

    @Override
    public void onLoad(PluginContext context) {
        com.tgyou.core.TgYouSpy.start();

        context.on(Hooks.MESSAGES_DELETED, (deleted, ids) -> {
            if (!TgYouPrefs.bool(KEEP_DELETED, true) || ids.isEmpty() || TgYouPrefs.listHasLong(EXCEPTIONS, deleted.dialogKey)) {
                return ids;
            }
            // only messages we actually have are worth keeping
            TgYouDb.get().markDeleted(deleted.account, deleted.dialogKey, deleted.ids, (int) (System.currentTimeMillis() / 1000));
            return Collections.emptyList();
        });

        context.on(Hooks.MESSAGE_EDITED, (edited, ignored) -> {
            if (!TgYouPrefs.bool(KEEP_EDITS, true) || TgYouPrefs.listHasLong(EXCEPTIONS, MessageObject.getDialogId(edited.message))) {
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
                result = TextUtils.concat(mark(MARKS[Math.max(0, Math.min(2, TgYouPrefs.integer(MARK_DELETED, 0)))],
                        org.telegram.messenger.R.drawable.tgyou_deleted, "удалено"), " ", result);
            }
            int edits = db.editCount(account, key, message.getId());
            if (edits > 0) {
                result = TextUtils.concat(mark(MARKS[Math.max(0, Math.min(2, TgYouPrefs.integer(MARK_EDITED, 0)))],
                        org.telegram.messenger.R.drawable.tgyou_edited, "ред."), edits > 1 ? edits + " " : " ", result);
            }
            return result;
        });

        context.on(Hooks.MESSAGE_ALPHA, (message, alpha) -> {
            if (message == null || message.messageOwner == null || !TgYouDb.get().hasDeleted()
                    || !TgYouDb.get().isDeleted(message.currentAccount, TgYouDb.dialogKey(message), message.getId())) {
                return alpha;
            }
            return TgYouPrefs.bool(DIM, true) ? 0.5f : alpha;
        });

        context.on(Hooks.MESSAGE_MENU, (menu, ignored) -> {
            MessageObject message = menu.message;
            if (message.messageOwner == null) {
                return null;
            }
            int account = message.currentAccount;
            long key = TgYouDb.dialogKey(message);
            int count = TgYouDb.get().editCount(account, key, message.getId());
            if (TgYouPrefs.bool(KEEP_READS, true) && message.isOut()) {
                int date = TgYouDb.get().readDate(account, message.getDialogId(), message.getId());
                if (date > 0) {
                    String when = LocaleController.formatDateChat(date) + ", " + LocaleController.getInstance().getFormatterDay().format((long) date * 1000);
                    menu.add("Прочитано: " + when, org.telegram.messenger.R.drawable.msg_seen, () -> { });
                }
            }
            if (count > 0) {
                menu.add("История правок (" + count + ")", org.telegram.messenger.R.drawable.msg_edit,
                        () -> showHistory(menu, account, key, message));
            }
            return null;
        });
    }

    /** The vector icon, plain text or nothing, depending on the chosen style. */
    private static CharSequence mark(String style, int icon, String text) {
        if (style.equals("нет")) {
            return "";
        }
        if (style.equals("текст")) {
            return text;
        }
        android.graphics.drawable.Drawable d = ApplicationLoader.applicationContext.getResources().getDrawable(icon).mutate();
        int size = org.telegram.messenger.AndroidUtilities.dp(12);
        d.setBounds(0, 0, size, size);
        android.text.SpannableString span = new android.text.SpannableString(" ");
        span.setSpan(new android.text.style.ImageSpan(d, android.text.style.ImageSpan.ALIGN_BOTTOM), 0, 1, android.text.Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return span;
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
