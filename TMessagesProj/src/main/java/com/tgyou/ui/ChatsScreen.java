package com.tgyou.ui;

import android.app.Activity;
import android.content.SharedPreferences;

import com.tgyou.core.TgYouAi;
import com.tgyou.core.TgYouChatTweaks;
import com.tgyou.core.TgYouGestures;
import com.tgyou.core.TgYouPrefs;
import com.tgyou.plugins.ChatExtrasPlugin;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.Theme;

/** «Чаты». */
public class ChatsScreen extends TgYouScreen {

    @Override
    protected String screenTitle() {
        return "Чаты";
    }

    private void setFontSize(int size) {
        size = Math.max(10, Math.min(40, size));
        SharedConfig.fontSize = size;
        SharedConfig.fontSizeIsDefault = false;
        SharedPreferences preferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", Activity.MODE_PRIVATE);
        preferences.edit().putInt("fons_size", size).commit();
        Theme.createCommonMessageResources();
        refresh();
    }

    @Override
    protected void build() {
        header("Сообщения");
        value("Размер текста", () -> String.valueOf(SharedConfig.fontSize), () -> askText("Размер текста (10-40)", String.valueOf(SharedConfig.fontSize), true, text -> {
            try {
                setFontSize(Integer.parseInt(text));
            } catch (NumberFormatException e) {
                toast("Нужно число");
            }
        }));
        header("Размер стикеров");
        slider(TgYouChatTweaks.STICKER_SCALE, 2, null, TgYouChatTweaks.STICKER_LABELS);
        info("Применяется к стикерам и эмодзи-анимациям, которые вы увидите после повторного открытия чата.");
        gap();

        header("Поле ввода");
        toggle(TgYouChatTweaks.HIDE_KEYBOARD_SCROLL, "Скрывать клавиатуру при прокрутке", "Клавиатура закрывается, когда вы листаете историю чата.", false);
        toggle(TgYouChatTweaks.MENTION_COMMA, "Запятая после упоминания", "После выбора @упоминания вставляется «, » вместо пробела.", false);
        toggle(TgYouChatTweaks.HIDE_SEND_AS, "Скрыть «Отправить как...»", "Убирает кнопку выбора отправителя в группах и каналах.", false);
        gap();

        header("Пустой чат");
        toggle(TgYouChatTweaks.HIDE_GREETING, "Скрыть приветственный стикер", "В пустом личном чате не показывается стикер-приветствие.", false);
        gap();

        header("Поле ввода: вычисления");
        toggle(TgYouChatTweaks.CALC, "Результаты вычислений", "После «=» в конце выражения (2+2=) подставляется результат. Поддерживаются + - * / ^ %, скобки.", false);
        gap();

        header("Ответы");
        master("replies", "Ответы", TgYouChatTweaks.REPLY_KEYS, new String[]{
                "Без подсветки при переходе к ответу",
                "Ответ без цитаты",
                "Упоминать автора при ответе"}, null);
        info("Подсветка: сообщение не мигает после перехода по ответу. Без цитаты: выделенный фрагмент не прикрепляется. Упоминание: в группах в пустое поле ввода подставляется @имя автора.");
        gap();

        header("Посты");
        master("wide", "Широкие посты", TgYouChatTweaks.WIDE_KEYS, new String[]{
                "Каналы",
                "Лента (посты каналов в обсуждениях)"}, null);
        info("Текст постов занимает почти всю ширину экрана. Применяется к сообщениям, загруженным после включения (переоткройте чат).");
        gap();

        header("ИИ-функции");
        master("ai", "ИИ-функции", TgYouChatTweaks.AI_KEYS, new String[]{
                "Редактор",
                "Краткие сводки",
                "Сводки в Instant View"}, new boolean[]{true, true, true});
        info("Редактор: кнопка ИИ рядом с полем ввода. Краткие сводки: кнопка в длинных сообщениях. Сводки в Instant View: пункт «Краткая сводка страницы» в меню сообщения со ссылкой, делается через Groq с ключом из раздела «ИИ».");
        value("Модель для сводок", () -> TgYouPrefs.str(TgYouAi.MODEL, TgYouAi.DEFAULT_MODEL), () -> askText("Модель Groq", TgYouPrefs.str(TgYouAi.MODEL, TgYouAi.DEFAULT_MODEL), false, text -> {
            TgYouPrefs.setStr(TgYouAi.MODEL, text.isEmpty() ? TgYouAi.DEFAULT_MODEL : text);
            refresh();
        }));
        gap();

        header("Админ");
        master("admin", "Быстрые админ-действия", TgYouChatTweaks.ADMIN_KEYS, new String[]{
                "Удалить и забанить",
                "Заглушить"}, null);
        choice(TgYouChatTweaks.ADMIN_MUTE_TERM, "Срок заглушения", null, 1, ChatExtrasPlugin.MUTE_LABELS);
        info("Пункты появляются в меню сообщения пользователя в группе, если у вас есть право блокировать участников. Заглушение работает в супергруппах.");
        gap();

        header("Жесты");
        master("swipe", "Быстрый переход свайпом", TgYouGestures.SWIPE_KEYS, new String[]{
                "Свайп по пузырю: ответ",
                "Свайп по пузырю: в избранное"}, new boolean[]{true, false});
        info("Если включены оба пункта, свайп по чужому сообщению отвечает, а по своему отправляет в Избранное. Остальные жесты: Кастомизация, Жесты.");
        gap();
    }
}
