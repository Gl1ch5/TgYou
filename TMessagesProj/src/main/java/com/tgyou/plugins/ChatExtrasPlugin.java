package com.tgyou.plugins;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.Section;
import com.tgyou.core.TgYouAi;
import com.tgyou.core.TgYouChatTweaks;
import com.tgyou.core.TgYouPrefs;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

import java.util.ArrayList;

/**
 * Пункты меню сообщения из экрана «Чаты»: быстрые админ-действия (удалить и забанить, заглушить)
 * и краткая сводка страницы со ссылки (Instant View) через Groq.
 */
public final class ChatExtrasPlugin implements Plugin {

    private static final int[] MUTE_SECONDS = {3600, 86400, 7 * 86400, 0};
    public static final String[] MUTE_LABELS = {"1 час", "1 день", "7 дней", "Навсегда"};

    @Override
    public String id() {
        return "chat_extras";
    }

    @Override
    public String name() {
        return "Дополнения чата";
    }

    @Override
    public String description() {
        return "Быстрые действия администратора в меню сообщения и краткая сводка страницы по ссылке. Настраивается в экране «Чаты».";
    }

    @Override
    public boolean enabledByDefault() {
        return true;
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
            admin(menu, m);
            if (TgYouPrefs.bool(TgYouChatTweaks.AI_IV, true)) {
                String page = pageText(m);
                if (page != null) {
                    menu.add("Краткая сводка страницы", R.drawable.msg_log, () -> TgYouAi.summarize(menu.fragment, page));
                }
            }
            return null;
        });
    }

    private static String pageText(MessageObject m) {
        TLRPC.MessageMedia media = MessageObject.getMedia(m.messageOwner);
        if (!(media instanceof TLRPC.TL_messageMediaWebPage) || !(media.webpage instanceof TLRPC.TL_webPage)) {
            return null;
        }
        TLRPC.TL_webPage page = (TLRPC.TL_webPage) media.webpage;
        if (page.cached_page == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (page.title != null) {
            sb.append(page.title).append("\n");
        }
        if (page.description != null) {
            sb.append(page.description);
        }
        return sb.length() < 40 ? null : sb.toString();
    }

    private void admin(com.tgyou.core.MessageMenu menu, MessageObject m) {
        boolean delBan = TgYouPrefs.bool(TgYouChatTweaks.ADMIN_DELBAN, false);
        boolean mute = TgYouPrefs.bool(TgYouChatTweaks.ADMIN_MUTE, false);
        if (!delBan && !mute) {
            return;
        }
        long dialogId = m.getDialogId();
        if (dialogId >= 0 || m.messageOwner.from_id == null || m.messageOwner.from_id.user_id == 0 || m.isOutOwner()) {
            return;
        }
        int account = m.currentAccount;
        MessagesController controller = MessagesController.getInstance(account);
        TLRPC.Chat chat = controller.getChat(-dialogId);
        TLRPC.User user = controller.getUser(m.messageOwner.from_id.user_id);
        if (chat == null || user == null || user.id == UserConfig.getInstance(account).getClientUserId() || !ChatObject.canBlockUsers(chat)) {
            return;
        }
        if (delBan) {
            menu.add("Удалить и забанить", R.drawable.msg_block2, () -> {
                ArrayList<Integer> ids = new ArrayList<>();
                ids.add(m.getId());
                if (ChatObject.canUserDoAction(chat, ChatObject.ACTION_DELETE_MESSAGES)) {
                    controller.deleteMessages(ids, null, null, dialogId, 0, true, 0);
                }
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_chatBannedRights rights = new TLRPC.TL_chatBannedRights();
                    rights.view_messages = true;
                    rights.until_date = 0;
                    controller.setParticipantBannedRole(chat.id, user, null, rights, true, menu.fragment);
                } else {
                    controller.deleteParticipantFromChat(chat.id, user);
                }
            });
        }
        if (mute && ChatObject.isChannel(chat)) {
            menu.add("Заглушить", R.drawable.msg_mute, () -> {
                int term = MUTE_SECONDS[Math.max(0, Math.min(MUTE_SECONDS.length - 1, TgYouPrefs.integer(TgYouChatTweaks.ADMIN_MUTE_TERM, 1)))];
                TLRPC.TL_chatBannedRights rights = new TLRPC.TL_chatBannedRights();
                rights.send_messages = true;
                rights.send_media = true;
                rights.send_stickers = true;
                rights.send_gifs = true;
                rights.send_games = true;
                rights.send_inline = true;
                rights.send_polls = true;
                rights.embed_links = true;
                rights.until_date = term == 0 ? 0 : (int) (System.currentTimeMillis() / 1000) + term;
                controller.setParticipantBannedRole(chat.id, user, null, rights, true, menu.fragment);
                AndroidUtilities.runOnUIThread(() -> android.widget.Toast.makeText(ApplicationLoader.applicationContext, "Пользователь заглушён", android.widget.Toast.LENGTH_SHORT).show());
            });
        }
    }
}
