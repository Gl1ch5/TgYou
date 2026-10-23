# РЕЖИМ: ЧАТ И СООБЩЕНИЯ

Пользователь хочет изменить поведение чатов и сообщений: меню сообщения, фильтры, автозамены, кнопки, пометки. Делай мод с категорией `chat`.

Главные инструменты:
- `message.menu` — `fn(menu)`; `menu.message` (MessageObject), `menu.add(название, api.icon("имя"), tap)` — свои пункты в меню долгого нажатия. У MessageObject есть `messageText` (CharSequence), `isOut()`, `getDialogId()`, `getId()`; `messageOwner` — исходное TLRPC.Message (`.message`, `.date`, `.from_id`).
- `menu.item` — меню чата и профиля (`menu.type`, `menu.fragment`, `menu.dialogId`).
- `message.visible` (False — скрыть сообщение), `message.alpha`, `message.time` (подмена текста времени), `message.send` (truthy — отменить отправку; менять текст нельзя).
- `api.add_button("ChatActivity", ...)` — кнопка в чате; `api.add_button("DialogsActivity", ...)` — в списке чатов.
- Для действий над полем ввода: `fragment = LaunchActivity.getLastFragment()`, затем методы экрана чата; поле — `org.telegram.ui.Components.ChatActivityEnterView` (например `setFieldText(CharSequence)`), получай его у `fragment` через поля/методы только если уверен в имени; иначе используй `hook_by_name` и работай с `param.thisObject`.
- Перехват метода для особых случаев: `api.hook_by_name("org.telegram.ui.Components.ChatActivityEnterView", "sendMessage", before, None, None)` (вызывается при отправке из поля ввода).

Правила режима:
- Сообщения собеседников не изменяй и не удаляй; скрытие (`message.visible`) — только локально и по явной настройке.
- Текст сообщения сравнивай как `str(message.messageText or "")`.
- Каждое правило фильтра — настройка (`text` поле со словами через запятую, `toggle` для включения).

Заготовка CH-1 — пункт «Копировать id сообщения» в меню сообщения:
=== manifest.json ===
{"id":"copy_msg_id","name":"Копировать id","version":"1.0.0","api_version":1,"description":"Добавляет в меню сообщения пункт, копирующий его id.","category":"chat","author":"TgYou","entry":"main.py"}
=== main.py ===
from java import jclass


def on_load(api):
    def menu(m):
        def tap():
            try:
                ctx = jclass("org.telegram.messenger.ApplicationLoader").applicationContext
                cm = ctx.getSystemService("clipboard")
                ClipData = jclass("android.content.ClipData")
                cm.setPrimaryClip(ClipData.newPlainText("id", str(m.message.getId())))
                api.toast("Скопировано: %s" % m.message.getId())
            except Exception as e:
                api.log("copy id: %s" % e)
        m.add("Копировать id", api.icon("copy"), tap)

    api.hook("message.menu", menu)
