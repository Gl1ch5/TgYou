package com.tgyou.core;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ChatActivity;

import java.util.ArrayList;

/** Жесты в чате: свайп по пузырю и двойной тап. Читаются хуками в ChatActivity. */
public final class TgYouGestures {

    public static final String SWIPE_REPLY = "gest.swipe_reply";
    public static final String SWIPE_SAVED = "gest.swipe_saved";
    public static final String[] SWIPE_KEYS = {SWIPE_REPLY, SWIPE_SAVED};
    public static final String DOUBLE_OTHER = "gest.double_other";
    public static final String DOUBLE_OWN = "gest.double_own";
    public static final String[] DOUBLE_LABELS = {"Реакция", "Ответить", "В избранное", "Копировать текст", "Изменить (свои)", "Ничего"};

    private TgYouGestures() {
    }

    /** True when both swipe actions are off: the bubble should not slide at all. */
    public static boolean swipeNone() {
        return !TgYouPrefs.bool(SWIPE_REPLY, true) && !TgYouPrefs.bool(SWIPE_SAVED, false);
    }

    /** @return true when the swipe has been handled here and the stock reply must be skipped */
    public static boolean swipe(ChatActivity fragment, MessageObject message) {
        boolean reply = TgYouPrefs.bool(SWIPE_REPLY, true);
        boolean saved = TgYouPrefs.bool(SWIPE_SAVED, false);
        if (message == null) {
            return false;
        }
        if (reply && (!saved || !message.isOutOwner())) {
            return false;
        }
        if (saved) {
            toSaved(message);
        }
        return true;
    }

    /** @return true when the double tap has been handled here and the stock reaction must be skipped */
    public static boolean doubleTap(ChatActivity fragment, MessageObject message) {
        if (fragment == null || message == null) {
            return false;
        }
        int action = TgYouPrefs.integer(message.isOutOwner() ? DOUBLE_OWN : DOUBLE_OTHER, 0);
        switch (action) {
            case 1:
                if (fragment.getCurrentChat() == null || ChatObject.canSendMessages(fragment.getCurrentChat())) {
                    fragment.showFieldPanelForReply(message);
                }
                return true;
            case 2:
                toSaved(message);
                return true;
            case 3: {
                CharSequence text = message.messageText;
                if (message.messageOwner != null && message.messageOwner.message != null && !message.messageOwner.message.isEmpty()) {
                    text = message.messageOwner.message;
                }
                if (text != null && text.length() > 0) {
                    Context context = ApplicationLoader.applicationContext;
                    ClipboardManager cm = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
                    if (cm != null) {
                        cm.setPrimaryClip(ClipData.newPlainText("text", text));
                        Toast.makeText(context, "Скопировано", Toast.LENGTH_SHORT).show();
                    }
                }
                return true;
            }
            case 4:
                if (!message.isOutOwner()) {
                    return false;
                }
                if (message.canEditMessage(fragment.getCurrentChat())) {
                    fragment.showFieldPanelForEdit(true, message);
                }
                return true;
            case 5:
                return true;
            default:
                return false;
        }
    }

    private static void toSaved(MessageObject message) {
        try {
            ArrayList<MessageObject> list = new ArrayList<>();
            list.add(message);
            long me = UserConfig.getInstance(message.currentAccount).getClientUserId();
            SendMessagesHelper.getInstance(message.currentAccount).sendMessage(list, me, false, false, true, 0, 0);
            Toast.makeText(ApplicationLoader.applicationContext, "Сохранено в Избранное", Toast.LENGTH_SHORT).show();
        } catch (Throwable ignore) {
        }
    }
}
