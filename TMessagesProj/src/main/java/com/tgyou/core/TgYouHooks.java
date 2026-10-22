package com.tgyou.core;

import android.util.SparseArray;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * The only entry points the Telegram sources call. Every call site is a single line, so
 * upstream merges stay cheap.
 */
public final class TgYouHooks {

    /** Option ids at or above this belong to plugin menu entries. */
    private static final int MENU_OPTION_BASE = 1000;
    private static final SparseArray<Runnable> menuActions = new SparseArray<>();

    private TgYouHooks() {
    }

    public static boolean isPremium(boolean real) {
        PluginHost host = PluginHost.get();
        return host == null ? real : host.dispatch(Hooks.PREMIUM_CHECK, null, real);
    }

    public static boolean transcribeAvailable(MessageObject message) {
        PluginHost host = PluginHost.get();
        return host != null && host.dispatch(Hooks.TRANSCRIBE_AVAILABLE, message, false);
    }

    /** @return true when a plugin took over the transcription and the stock request must be skipped */
    public static boolean transcribeRequest(MessageObject message) {
        PluginHost host = PluginHost.get();
        return host != null && host.dispatch(Hooks.TRANSCRIBE_REQUEST, message, false);
    }

    /**
     * @return true when a plugin dropped the request; it never reaches the network and the caller
     * gets a "TGYOU_BLOCKED" error asynchronously, like any failed request
     */
    public static boolean interceptRequest(TLObject request, RequestDelegate onComplete, RequestDelegateTimestamp onCompleteTimestamp) {
        PluginHost host = PluginHost.get();
        if (host == null || !host.dispatch(Hooks.OUTGOING_REQUEST, request, false)) {
            return false;
        }
        if (onComplete != null || onCompleteTimestamp != null) {
            final TLRPC.TL_error error = new TLRPC.TL_error();
            error.code = 400;
            error.text = "TGYOU_BLOCKED";
            Utilities.stageQueue.postRunnable(() -> {
                if (onComplete != null) {
                    onComplete.run(null, error);
                } else {
                    onCompleteTimestamp.run(null, error, 0);
                }
            });
        }
        return true;
    }

    /** @return true when a plugin cancelled the outgoing message */
    public static boolean beforeSend(org.telegram.messenger.SendMessagesHelper.SendMessageParams params) {
        PluginHost host = PluginHost.get();
        return host != null && params != null && host.dispatch(Hooks.SEND_MESSAGE, params, false);
    }

    /** @return the messages that may be shown; the same list when nothing is hidden */
    public static java.util.ArrayList<MessageObject> filterMessages(java.util.ArrayList<MessageObject> messages) {
        PluginHost host = PluginHost.get();
        if (host == null || messages == null || messages.isEmpty()) {
            return messages;
        }
        java.util.ArrayList<MessageObject> kept = null;
        for (int i = 0; i < messages.size(); i++) {
            MessageObject m = messages.get(i);
            boolean visible = host.dispatch(Hooks.MESSAGE_VISIBLE, m, true);
            if (!visible && kept == null) {
                kept = new java.util.ArrayList<>(messages.subList(0, i));
            } else if (visible && kept != null) {
                kept.add(m);
            }
        }
        return kept == null ? messages : kept;
    }

    public static float messageAlpha(MessageObject message) {
        PluginHost host = PluginHost.get();
        return host == null || message == null ? 1f : host.dispatch(Hooks.MESSAGE_ALPHA, message, 1f);
    }

    /** @return true when the "restrict saving content" flag must be ignored */
    public static boolean allowCopy() {
        PluginHost host = PluginHost.get();
        return host != null && host.dispatch(Hooks.ALLOW_COPY, null, false);
    }

    public static boolean keepTtlMedia() {
        PluginHost host = PluginHost.get();
        return host != null && host.dispatch(Hooks.KEEP_TTL_MEDIA, null, false);
    }

    public static boolean keepKicked(TLRPC.Chat chat) {
        PluginHost host = PluginHost.get();
        return host != null && chat != null && (chat.kicked || chat instanceof TLRPC.TL_channelForbidden || chat instanceof TLRPC.TL_chatForbidden)
                && host.dispatch(Hooks.KEEP_KICKED_CHAT, chat, false);
    }

    /** @return true when the screenshot notice must not be sent */
    public static boolean blockScreenshotNotice() {
        PluginHost host = PluginHost.get();
        return host != null && host.dispatch(Hooks.SCREENSHOT_NOTICE, null, false);
    }

    public static boolean flagSecure(boolean real) {
        PluginHost host = PluginHost.get();
        return host == null ? real : host.dispatch(Hooks.FLAG_SECURE, null, real);
    }

    /** @return the ids that must really be deleted locally; the rest are kept */
    public static List<Integer> filterDeleted(int account, long dialogKey, List<Integer> ids) {
        PluginHost host = PluginHost.get();
        if (host == null) {
            return ids;
        }
        return host.dispatch(Hooks.MESSAGES_DELETED, new Hooks.DeletedMessages(account, dialogKey, ids), ids);
    }

    public static void messageEdited(int account, TLRPC.Message message) {
        PluginHost host = PluginHost.get();
        if (host != null) {
            host.dispatch(Hooks.MESSAGE_EDITED, new Hooks.EditedMessage(account, message), null);
        }
    }

    public static CharSequence messageTime(MessageObject message, CharSequence time) {
        PluginHost host = PluginHost.get();
        return host == null ? time : host.dispatch(Hooks.MESSAGE_TIME, message, time);
    }

    /** Lets plugins add entries to a message's long-press menu (parallel lists of the stock menu). */
    public static void extendMessageMenu(BaseFragment fragment, MessageObject message,
                                         List<CharSequence> items, List<Integer> options, List<Integer> icons) {
        menuActions.clear();
        PluginHost host = PluginHost.get();
        if (host == null || message == null) {
            return;
        }
        MessageMenu menu = new MessageMenu(fragment, message);
        host.dispatch(Hooks.MESSAGE_MENU, menu, null);
        int id = MENU_OPTION_BASE;
        for (MessageMenu.Entry entry : new ArrayList<>(menu.entries)) {
            items.add(entry.title);
            options.add(id);
            icons.add(entry.icon);
            menuActions.put(id++, entry.action);
        }
    }

    /** @return true when the chosen option was a plugin menu entry and has been run */
    public static boolean menuOption(int option) {
        Runnable action = menuActions.get(option);
        if (action == null) {
            return false;
        }
        try {
            action.run();
        } catch (Throwable t) {
            org.telegram.messenger.FileLog.e("tgyou: menu action failed", t);
        }
        return true;
    }
}
