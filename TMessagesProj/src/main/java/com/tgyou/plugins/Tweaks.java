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

    private static void spoil(TLRPC.InputMedia media) {
        if (media instanceof TLRPC.TL_inputMediaUploadedPhoto) {
            ((TLRPC.TL_inputMediaUploadedPhoto) media).spoiler = true;
        } else if (media instanceof TLRPC.TL_inputMediaPhoto) {
            ((TLRPC.TL_inputMediaPhoto) media).spoiler = true;
        }
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
                new Tweak("keep_draft", "Не удалять черновик на сервере",
                        "Облачный черновик чата не стирается при отправке. Поле ввода всё равно очищается.",
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
                new Tweak("no_cloud_drafts", "Черновики только на устройстве",
                        "Недописанный текст не отправляется на сервер Telegram и не появляется на других устройствах.",
                        Section.PRIVACY, false, r -> r instanceof TLRPC.TL_messages_saveDraft),
                new Tweak("no_top_peers", "Не копить «частые контакты»",
                        "Не сообщает серверу, кому вы пишете чаще всего, поэтому список недавних не меняется.",
                        Section.PRIVACY, false, r -> r instanceof TLRPC.TL_contacts_resetTopPeerRating),
                new Tweak("invert_media", "Медиа над текстом",
                        "Подпись отправляется под вложением: ссылки показывают превью над текстом.",
                        Section.MESSAGES, false, r -> {
                    if (r instanceof TLRPC.TL_messages_sendMessage) {
                        ((TLRPC.TL_messages_sendMessage) r).invert_media = true;
                    } else if (r instanceof TLRPC.TL_messages_sendMedia) {
                        ((TLRPC.TL_messages_sendMedia) r).invert_media = true;
                    }
                    return false;
                }),
                new Tweak("no_contact_sync", "Не загружать контакты на сервер",
                        "Приложение не отправляет вашу адресную книгу в Telegram.",
                        Section.PRIVACY, false, r -> r instanceof TLRPC.TL_contacts_importContacts),
                new Tweak("no_recent_stickers", "Не запоминать недавние стикеры",
                        "Отправка стикера не добавляет его в список недавних.",
                        Section.PRIVACY, false, r -> r instanceof TLRPC.TL_messages_saveRecentSticker),
                new Tweak("delete_for_all", "Удалять у всех по умолчанию",
                        "Удаление сообщений и переписки в личных чатах всегда идёт «и у собеседника», даже если галочку не ставили.",
                        Section.MESSAGES, false, r -> {
                    if (r instanceof TLRPC.TL_messages_deleteMessages) {
                        ((TLRPC.TL_messages_deleteMessages) r).revoke = true;
                    } else if (r instanceof TLRPC.TL_messages_deleteHistory) {
                        ((TLRPC.TL_messages_deleteHistory) r).revoke = true;
                    }
                    return false;
                }),
                new Tweak("spoiler_photo", "Фото под спойлером",
                        "Отправляемые фото скрыты размытием, пока собеседник не нажмёт. Видео и файлы не затрагиваются.",
                        Section.MESSAGES, false, r -> {
                    if (r instanceof TLRPC.TL_messages_sendMedia) {
                        spoil(((TLRPC.TL_messages_sendMedia) r).media);
                    } else if (r instanceof TLRPC.TL_messages_sendMultiMedia) {
                        for (TLRPC.TL_inputSingleMedia item : ((TLRPC.TL_messages_sendMultiMedia) r).multi_media) {
                            spoil(item.media);
                        }
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
