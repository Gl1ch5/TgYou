package com.tgyou.ui;

import com.tgyou.core.TgYouPillStack;
import com.tgyou.core.TgYouPrefs;

/** Pill Stack: какие таблетки показывать в строке поиска. */
public class PillStackScreen extends TgYouScreen {

    @Override
    protected String screenTitle() {
        return "Pill Stack";
    }

    @Override
    protected void build() {
        info("Таблетки появляются в строке поиска списка чатов. Нажмите на таблетку, чтобы пролистать остальные по кругу, зажмите её, чтобы вернуться в эти настройки. Порядок такой, в каком вы их включали.");
        header("Таблетки");
        for (int i = 0; i < TgYouPillStack.IDS.length; i++) {
            String id = TgYouPillStack.IDS[i];
            boolean on = TgYouPrefs.listHas(TgYouPillStack.PILLS, id);
            value(TgYouPillStack.TITLES[i], () -> TgYouPrefs.listHas(TgYouPillStack.PILLS, id) ? "Вкл. · " + TgYouPillStack.text(id) : "Выкл.", () -> {
                if (TgYouPrefs.listHas(TgYouPillStack.PILLS, id)) {
                    TgYouPrefs.listRemove(TgYouPillStack.PILLS, id);
                } else {
                    TgYouPrefs.listAdd(TgYouPillStack.PILLS, id);
                }
                refresh();
            });
        }
        info("Погода и курсы валют требуют сетевых запросов к сторонним сервисам и не добавлены. Изменения видны после повторного открытия списка чатов.");
    }
}
