package com.tgyou.plugins;

import com.tgyou.core.Plugin;
import com.tgyou.core.Section;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

import java.util.Arrays;
import java.util.List;

/** Small switches that change how messages are sent or what the app tells the server. */
final class Tweaks {

    private Tweaks() {
    }

    static List<Plugin> create() {
        return Arrays.asList(
                new Tweak("no_link_preview", "Без превью при наборе",
                        "Не запрашивает у сервера превью ссылок, пока вы печатаете: адрес не уходит Telegram до отправки.",
                        Section.PRIVACY, false, r -> r instanceof TL_account.getWebPagePreview),
                new Tweak("no_telemetry", "Без телеметрии и своих обновлений Telegram",
                        "Блокирует отправку журналов приложения и проверку обновлений Telegram: обновляет только TgYou.",
                        Section.PRIVACY, true, r -> r instanceof TLRPC.TL_help_saveAppLog || r instanceof TLRPC.TL_help_getAppUpdate),
                new Tweak("protect_sent", "Запретить пересылку моих сообщений",
                        "Все ваши сообщения отправляются с защитой от пересылки и сохранения.",
                        Section.PRIVACY, false, r -> {
                    if (r instanceof TLRPC.TL_messages_sendMessage) {
                        ((TLRPC.TL_messages_sendMessage) r).noforwards = true;
                    } else if (r instanceof TLRPC.TL_messages_sendMedia) {
                        ((TLRPC.TL_messages_sendMedia) r).noforwards = true;
                    }
                    return false;
                }),
                new Tweak("no_read_mentions", "Не отмечать упоминания и реакции прочитанными",
                        "Прочитав упоминания и реакции у себя, вы не сообщаете об этом серверу.",
                        Section.PRIVACY, false, r -> r instanceof TLRPC.TL_messages_readMentions || r instanceof TLRPC.TL_messages_readReactions),
                new Tweak("silent_send", "Отправлять без звука",
                        "Все сообщения и пересылки уходят «тихо»: у получателя не звучит уведомление.",
                        Section.MESSAGES, false, r -> {
                    if (r instanceof TLRPC.TL_messages_sendMessage) {
                        ((TLRPC.TL_messages_sendMessage) r).silent = true;
                    } else if (r instanceof TLRPC.TL_messages_sendMedia) {
                        ((TLRPC.TL_messages_sendMedia) r).silent = true;
                    } else if (r instanceof TLRPC.TL_messages_sendMultiMedia) {
                        ((TLRPC.TL_messages_sendMultiMedia) r).silent = true;
                    } else if (r instanceof TLRPC.TL_messages_forwardMessages) {
                        ((TLRPC.TL_messages_forwardMessages) r).silent = true;
                    }
                    return false;
                }),
                new Tweak("no_webpage_send", "Отправлять без превью ссылок",
                        "Сообщения со ссылками уходят без карточки предпросмотра.",
                        Section.MESSAGES, false, r -> {
                    if (r instanceof TLRPC.TL_messages_sendMessage) {
                        ((TLRPC.TL_messages_sendMessage) r).no_webpage = true;
                    }
                    return false;
                }),
                new Tweak("forward_no_author", "Пересылать без автора",
                        "Пересланные сообщения не показывают, от кого они.",
                        Section.MESSAGES, false, r -> {
                    if (r instanceof TLRPC.TL_messages_forwardMessages) {
                        ((TLRPC.TL_messages_forwardMessages) r).drop_author = true;
                    }
                    return false;
                }),
                new Tweak("forward_no_caption", "Пересылать без подписей к медиа",
                        "У пересылаемых фото и видео убирается подпись.",
                        Section.MESSAGES, false, r -> {
                    if (r instanceof TLRPC.TL_messages_forwardMessages) {
                        ((TLRPC.TL_messages_forwardMessages) r).drop_media_captions = true;
                    }
                    return false;
                }),
                new Tweak("keep_draft", "Не стирать черновик после отправки",
                        "Текст остаётся в поле ввода после отправки сообщения.",
                        Section.MESSAGES, false, r -> {
                    if (r instanceof TLRPC.TL_messages_sendMessage) {
                        ((TLRPC.TL_messages_sendMessage) r).clear_draft = false;
                    }
                    return false;
                }),
                new Tweak("keep_sticker_order", "Не переставлять наборы стикеров",
                        "Отправка стикера не двигает его набор в начало списка.",
                        Section.MESSAGES, false, r -> {
                    if (r instanceof TLRPC.TL_messages_sendMedia) {
                        ((TLRPC.TL_messages_sendMedia) r).update_stickersets_order = false;
                    }
                    return false;
                }),
                new Tweak("big_reactions", "Всегда большие реакции",
                        "Реакции отправляются с большой анимацией.",
                        Section.MESSAGES, false, r -> {
                    if (r instanceof TLRPC.TL_messages_sendReaction) {
                        ((TLRPC.TL_messages_sendReaction) r).big = true;
                    }
                    return false;
                }),
                new Tweak("keep_recent_reactions", "Не менять недавние реакции",
                        "Поставленная реакция не попадает в список недавних.",
                        Section.MESSAGES, false, r -> {
                    if (r instanceof TLRPC.TL_messages_sendReaction) {
                        ((TLRPC.TL_messages_sendReaction) r).add_to_recent = false;
                    }
                    return false;
                }),
                new Tweak("silent_pin", "Закреплять без уведомления",
                        "Закрепление сообщения не будит участников чата.",
                        Section.MESSAGES, false, r -> {
                    if (r instanceof TLRPC.TL_messages_updatePinnedMessage && !((TLRPC.TL_messages_updatePinnedMessage) r).unpin) {
                        ((TLRPC.TL_messages_updatePinnedMessage) r).silent = true;
                    }
                    return false;
                })
        );
    }
}
