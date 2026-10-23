package com.tgyou.ui;

import com.tgyou.core.TgYouPrefs;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.DialogsActivity;

import java.util.List;

/** Редактируемый список из настроек: слова (ввод текстом) или пользователи (выбор из чатов). */
public class ListEditScreen extends TgYouScreen {

    private final String title;
    private final String key;
    private final boolean users;
    private final String hint;

    public ListEditScreen(String title, String key, boolean users, String hint) {
        this.title = title;
        this.key = key;
        this.users = users;
        this.hint = hint;
    }

    @Override
    protected String screenTitle() {
        return title;
    }

    private String label(String item) {
        if (!users) {
            return item;
        }
        try {
            long id = Long.parseLong(item);
            int account = getCurrentAccount();
            TLRPC.User user = MessagesController.getInstance(account).getUser(id);
            if (user != null) {
                return org.telegram.messenger.UserObject.getUserName(user) + " (" + id + ")";
            }
            TLRPC.Chat chat = MessagesController.getInstance(account).getChat(-id);
            if (chat != null) {
                return chat.title + " (" + id + ")";
            }
        } catch (Throwable ignore) {
        }
        return item;
    }

    @Override
    protected void build() {
        info(hint);
        button(users ? "Добавить пользователя" : "Добавить фильтр", false, () -> {
            if (users) {
                pickChat(DialogsActivity.DIALOGS_TYPE_USERS_ONLY, id -> TgYouPrefs.listAdd(key, String.valueOf(id)));
            } else {
                askText("Новый фильтр", "", false, text -> {
                    if (text.startsWith("re:")) {
                        try {
                            java.util.regex.Pattern.compile(text.substring(3));
                        } catch (Throwable e) {
                            toast("Некорректное регулярное выражение");
                            return;
                        }
                        if (text.length() > 203) {
                            toast("Выражение слишком длинное (до 200 символов)");
                            return;
                        }
                    }
                    if (!text.isEmpty()) {
                        TgYouPrefs.listAdd(key, text);
                        refresh();
                    }
                });
            }
        });
        List<String> items = TgYouPrefs.list(key);
        if (!items.isEmpty()) {
            header("Список: " + items.size());
        }
        for (String item : items) {
            value(label(item), () -> "Удалить", () -> confirm("Удалить?", label(item), "Удалить", () -> {
                TgYouPrefs.listRemove(key, item);
                refresh();
            }));
        }
        gap();
    }
}
