package com.tgyou.ui;

import android.app.Activity;
import android.content.SharedPreferences;

import com.tgyou.core.TgYouChatTweaks;

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
    }
}
