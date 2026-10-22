package com.tgyou.ui;

import com.tgyou.core.TgYouPrefs;
import com.tgyou.plugins.MessageFilterPlugin;

import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.IconBackgroundColors;

import org.telegram.messenger.R;

/** «Фильтры сообщений». */
public class FiltersScreen extends TgYouScreen {

    @Override
    protected String screenTitle() {
        return "Фильтры сообщений";
    }

    private static String count(int n) {
        int m = n % 100;
        int d = n % 10;
        String word = m >= 11 && m <= 14 ? "фильтров" : d == 1 ? "фильтр" : d >= 2 && d <= 4 ? "фильтра" : "фильтров";
        return n + " " + word;
    }

    @Override
    protected void build() {
        toggle(MessageFilterPlugin.ENABLED, "Включить фильтры", "Скрывает сообщения, подходящие под фильтры, прямо в чатах.", true);
        gap();
        link(R.drawable.settings_chat, IconBackgroundColors.BLUE, "Общие фильтры", count(TgYouPrefs.list(MessageFilterPlugin.WORDS).size()),
                () -> presentFragment(new ListEditScreen("Общие фильтры", MessageFilterPlugin.WORDS, false,
                        "Сообщение скрывается, если содержит слово или фразу из списка (без учёта регистра). Регулярное выражение начинается с «re:», например re:\\bспам\\b.")));
        link(R.drawable.settings_privacy, IconBackgroundColors.RED, "Теневой бан", count(TgYouPrefs.list(MessageFilterPlugin.SHADOW).size()),
                () -> presentFragment(new ListEditScreen("Теневой бан", MessageFilterPlugin.SHADOW, true,
                        "Сообщения этих пользователей скрыты во всех чатах. Для них вы не заблокированы, они ничего не узнают.")));
        gap();
        toggle(MessageFilterPlugin.IN_CHATS, "Включить общие фильтры в чатах", "Если выключено, общие фильтры действуют только в личных диалогах.", true);
        toggle(MessageFilterPlugin.ONLY_INCOMING, "Только входящие", "Ваши собственные сообщения не фильтруются.", true);
        toggle(MessageFilterPlugin.HIDE_BLOCKED, "Скрывать заблокированных", "Сообщения людей из чёрного списка пропадают из групп, а не сворачиваются.", true);
        gap();
    }
}
