package com.tgyou.core;

import android.graphics.Canvas;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Cells.DialogCell;

import java.util.WeakHashMap;

/** Small avatar of the last message's sender in front of the preview text of group chats in the chat list. */
public final class TgYouMiniAvatars {

    public static final String KEY = "look.mini_avatars";

    private static final class State {
        final ImageReceiver image = new ImageReceiver();
        final AvatarDrawable drawable = new AvatarDrawable();
        boolean active;
        boolean attached;
        int size;
        int shift;
    }

    private static final WeakHashMap<DialogCell, State> STATES = new WeakHashMap<>();

    private TgYouMiniAvatars() {
    }

    /** Returns the horizontal space (px) the preview text has to give way, 0 when the avatar is not shown. */
    public static int prepare(DialogCell cell, int account, MessageObject message, TLRPC.Chat chat, boolean senderShown, boolean twoLines) {
        State state = STATES.get(cell);
        boolean ok = TgYouPrefs.bool(KEY, false) && twoLines && senderShown && message != null && chat != null
                && !ChatObject.isChannelAndNotMegaGroup(chat) && !org.telegram.messenger.LocaleController.isRTL;
        long from = ok ? message.getFromChatId() : 0;
        if (ok && from <= 0) {
            ok = false;
        }
        if (!ok) {
            if (state != null) {
                state.active = false;
            }
            return 0;
        }
        TLRPC.User user = MessagesController.getInstance(account).getUser(from);
        if (user == null) {
            if (state != null) {
                state.active = false;
            }
            return 0;
        }
        if (state == null) {
            state = new State();
            state.image.setParentView(cell);
            STATES.put(cell, state);
        }
        state.size = AndroidUtilities.dp(16);
        state.shift = AndroidUtilities.dp(20);
        state.image.setRoundRadius(state.size / 2);
        state.drawable.setInfo(account, user);
        state.image.setForUserOrChat(user, state.drawable);
        state.active = true;
        if (state.attached) {
            state.image.onAttachedToWindow();
        }
        return state.shift;
    }

    /** Called with the canvas already translated to the top left corner of the preview text. */
    public static void draw(DialogCell cell, Canvas canvas, float hideProgress) {
        State state = STATES.get(cell);
        if (state == null || !state.active) {
            return;
        }
        state.image.setAlpha(1f - hideProgress);
        state.image.setImageCoords(-state.shift, AndroidUtilities.dp(1.5f), state.size, state.size);
        state.image.draw(canvas);
    }

    public static void attach(DialogCell cell, boolean attached) {
        State state = STATES.get(cell);
        if (state == null) {
            return;
        }
        state.attached = attached;
        if (attached) {
            state.image.onAttachedToWindow();
        } else {
            state.image.onDetachedFromWindow();
        }
    }
}
