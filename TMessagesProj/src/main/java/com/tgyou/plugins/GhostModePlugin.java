package com.tgyou.plugins;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.TgYouPrefs;
import com.tgyou.core.Section;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/**
 * Режим призрака: Telegram не узнаёт, что вы прочитали сообщение, печатаете или в сети.
 * Запросы отбрасываются до отправки в сеть. Настройки — экран «Режим призрака» (TgYouPrefs, ключи ghost.*).
 */
public final class GhostModePlugin implements Plugin {

    public static final String NO_READ = "ghost.read";
    public static final String NO_STORY = "ghost.story";
    public static final String NO_ONLINE = "ghost.online";
    public static final String NO_TYPING = "ghost.typing";
    public static final String AUTO_OFFLINE = "ghost.offline";
    public static final String READ_ON_ACTION = "ghost.read_on_action";
    public static final String DELAY = "ghost.delay";
    public static final String SILENT = "ghost.silent";
    public static final String STORY_SUGGEST = "ghost.story_suggest";

    public static final String[] OPTION_KEYS = {NO_READ, NO_STORY, NO_ONLINE, NO_TYPING, AUTO_OFFLINE};

    private static final Set<Object> bypass = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap<>()));

    /** True when at least one of the five ghost options is on. */
    public static boolean active() {
        for (String key : OPTION_KEYS) {
            if (TgYouPrefs.bool(key, false)) {
                return true;
            }
        }
        return false;
    }

    private static boolean storyAllowed;

    /**
     * Before a story opens: if the owner asked for it and stories are not hidden yet, offers to turn the
     * ghost mode on. Returns true when the opening is postponed until the choice is made.
     */
    public static boolean suggestForStory(android.content.Context context, Runnable proceed) {
        if (storyAllowed) {
            storyAllowed = false;
            return false;
        }
        if (!TgYouPrefs.bool(STORY_SUGGEST, false) || TgYouPrefs.bool(NO_STORY, false) || !(context instanceof android.app.Activity)) {
            return false;
        }
        org.telegram.ui.ActionBar.AlertDialog.Builder builder = new org.telegram.ui.ActionBar.AlertDialog.Builder(context);
        builder.setTitle("Открыть историю?");
        builder.setMessage("Автор увидит, что вы посмотрели историю. Включить режим призрака, чтобы остаться незамеченным?");
        builder.setPositiveButton("Включить призрака", (d, w) -> {
            TgYouPrefs.setBool(NO_STORY, true);
            storyAllowed = true;
            proceed.run();
        });
        builder.setNegativeButton("Открыть так", (d, w) -> {
            storyAllowed = true;
            proceed.run();
        });
        builder.show();
        return true;
    }

    @Override
    public String id() {
        return "ghost_mode";
    }

    @Override
    public String name() {
        return "Режим призрака";
    }

    @Override
    public String description() {
        return "Скрывает от собеседников, что вы прочитали сообщение, печатаете или находитесь в сети. "
                + "На вашем телефоне чат выглядит прочитанным, на сервере остаётся непрочитанным. "
                + "Настройки: TgYou → Режим призрака.";
    }

    @Override
    public Section section() {
        return Section.PRIVACY;
    }

    @Override
    public boolean enabledByDefault() {
        return true;
    }

    @Override
    public void onLoad(PluginContext context) {
        context.on(Hooks.OUTGOING_REQUEST, (request, blocked) -> {
            if (bypass.remove(request)) {
                return blocked;
            }
            prepareSend(request);
            return blocked || shouldBlock(request);
        });
    }

    private static boolean on(String key) {
        return TgYouPrefs.bool(key, false);
    }

    private void prepareSend(TLObject request) {
        boolean ghost = active();
        int silent = TgYouPrefs.integer(SILENT, 0);
        boolean silentNow = silent == 1 || silent == 2 && ghost;
        if (request instanceof TLRPC.TL_messages_sendMessage) {
            TLRPC.TL_messages_sendMessage r = (TLRPC.TL_messages_sendMessage) request;
            if (silentNow) {
                r.silent = true;
            }
            if (on(DELAY) && r.schedule_date == 0) {
                r.flags |= 1024;
                r.schedule_date = now() + 12;
            }
            readOnAction(r.peer);
        } else if (request instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.TL_messages_sendMedia r = (TLRPC.TL_messages_sendMedia) request;
            if (silentNow) {
                r.silent = true;
            }
            if (on(DELAY) && r.schedule_date == 0) {
                r.flags |= 1024;
                r.schedule_date = now() + 12;
            }
            readOnAction(r.peer);
        } else if (request instanceof TLRPC.TL_messages_sendMultiMedia) {
            if (silentNow) {
                ((TLRPC.TL_messages_sendMultiMedia) request).silent = true;
            }
            readOnAction(((TLRPC.TL_messages_sendMultiMedia) request).peer);
        } else if (request instanceof TLRPC.TL_messages_forwardMessages) {
            if (silentNow) {
                ((TLRPC.TL_messages_forwardMessages) request).silent = true;
            }
        } else if (request instanceof TLRPC.TL_messages_sendReaction) {
            readOnAction(((TLRPC.TL_messages_sendReaction) request).peer);
        }
    }

    private static int now() {
        return org.telegram.tgnet.ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
    }

    /** «Читать при действиях»: sending or reacting reads the chat although reading is blocked. */
    private void readOnAction(TLRPC.InputPeer peer) {
        if (peer == null || !on(READ_ON_ACTION) || !on(NO_READ)) {
            return;
        }
        int account = UserConfig.selectedAccount;
        MessagesController controller = MessagesController.getInstance(account);
        long dialogId;
        TLObject read;
        if (peer instanceof TLRPC.TL_inputPeerChannel) {
            dialogId = -peer.channel_id;
            TLRPC.TL_channels_readHistory r = new TLRPC.TL_channels_readHistory();
            r.channel = MessagesController.getInputChannel(peer);
            r.max_id = maxId(controller, dialogId);
            read = r;
        } else if (peer instanceof TLRPC.TL_inputPeerUser || peer instanceof TLRPC.TL_inputPeerChat) {
            dialogId = peer instanceof TLRPC.TL_inputPeerUser ? peer.user_id : -peer.chat_id;
            TLRPC.TL_messages_readHistory r = new TLRPC.TL_messages_readHistory();
            r.peer = peer;
            r.max_id = maxId(controller, dialogId);
            read = r;
        } else {
            return;
        }
        bypass.add(read);
        org.telegram.tgnet.ConnectionsManager.getInstance(account).sendRequest(read, (response, error) -> {
        });
    }

    private static int maxId(MessagesController controller, long dialogId) {
        TLRPC.Dialog d = controller.dialogs_dict.get(dialogId);
        return d != null && d.top_message > 0 ? d.top_message : Integer.MAX_VALUE;
    }

    private boolean shouldBlock(TLObject request) {
        if (request instanceof TLRPC.TL_messages_readHistory
                || request instanceof TLRPC.TL_channels_readHistory
                || request instanceof TLRPC.TL_messages_readDiscussion
                || request instanceof TLRPC.TL_messages_readSavedHistory
                || request instanceof TLRPC.TL_messages_readEncryptedHistory
                || request instanceof TLRPC.TL_messages_readMessageContents
                || request instanceof TLRPC.TL_channels_readMessageContents) {
            return on(NO_READ);
        }
        if (request instanceof TLRPC.TL_messages_setTyping || request instanceof TLRPC.TL_messages_setEncryptedTyping) {
            return on(NO_TYPING);
        }
        if (request instanceof TL_account.updateStatus) {
            if (on(NO_ONLINE)) {
                return true;
            }
            if (on(AUTO_OFFLINE)) {
                ((TL_account.updateStatus) request).offline = true;
            }
            return false;
        }
        if (request instanceof TL_stories.TL_stories_readStories) {
            return on(NO_STORY);
        }
        return false;
    }
}
