package com.tgyou.core;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

import java.util.List;

/** Catalogue of hook points exposed to plugins. This is the stable contract of the core. */
public final class Hooks {

    private Hooks() {
    }

    /** Input: unused. Value: whether the account should be treated as Premium on the client. */
    public static final HookPoint<Void, Boolean> PREMIUM_CHECK = new HookPoint<>("premium.check");

    /** Input: the voice message. Value: whether a plugin offers voice-to-text for it. */
    public static final HookPoint<MessageObject, Boolean> TRANSCRIBE_AVAILABLE = new HookPoint<>("transcribe.available");

    /** Input: the voice message. Value: true once a plugin has taken over the transcription. */
    public static final HookPoint<MessageObject, Boolean> TRANSCRIBE_REQUEST = new HookPoint<>("transcribe.request");

    /**
     * Input: a request about to be sent to Telegram. Value: true to drop it; the caller then
     * gets a "TGYOU_BLOCKED" error instead of a server response.
     */
    public static final HookPoint<TLObject, Boolean> OUTGOING_REQUEST = new HookPoint<>("request.outgoing");

    /** Input: unused. Value: whether the window must be hidden from screenshots and screen capture. */
    public static final HookPoint<Void, Boolean> FLAG_SECURE = new HookPoint<>("window.secure");

    /**
     * Input: messages the server says were deleted. Value: the ids that must really be removed
     * from the local copy; handlers drop the ids they want to keep.
     */
    public static final HookPoint<DeletedMessages, List<Integer>> MESSAGES_DELETED = new HookPoint<>("messages.deleted");

    /** Input: the new version of an edited message, before it replaces the stored one. */
    public static final HookPoint<EditedMessage, Void> MESSAGE_EDITED = new HookPoint<>("messages.edited");

    /** Input: a message. Value: the time/status text shown in its bubble. */
    public static final HookPoint<MessageObject, CharSequence> MESSAGE_TIME = new HookPoint<>("message.time");

    /** Input: the long-press menu of a message; handlers add entries. */
    public static final HookPoint<MessageMenu, Void> MESSAGE_MENU = new HookPoint<>("message.menu");

    /** Input: a message about to be shown in a chat. Value: false to hide it. */
    public static final HookPoint<MessageObject, Boolean> MESSAGE_VISIBLE = new HookPoint<>("message.visible");

    /** Input: a chat the user is no longer in (kicked or banned). Value: true to keep it in the dialog list. */
    public static final HookPoint<TLRPC.Chat, Boolean> KEEP_KICKED_CHAT = new HookPoint<>("chat.keep_kicked");

    /** Input: unused. Value: true to not tell the other side about a screenshot in a secret chat. */
    public static final HookPoint<Void, Boolean> SCREENSHOT_NOTICE = new HookPoint<>("secret.screenshot_notice");

    public static final class DeletedMessages {
        public final int account;
        /** Negative channel id for channels, 0 for private chats and basic groups (ids are global there). */
        public final long dialogKey;
        public final List<Integer> ids;

        public DeletedMessages(int account, long dialogKey, List<Integer> ids) {
            this.account = account;
            this.dialogKey = dialogKey;
            this.ids = ids;
        }
    }

    public static final class EditedMessage {
        public final int account;
        public final TLRPC.Message message;

        public EditedMessage(int account, TLRPC.Message message) {
            this.account = account;
            this.message = message;
        }
    }
}
