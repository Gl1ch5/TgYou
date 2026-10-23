# РЕЖИМ: КАСТОМИЗАЦИЯ ИНТЕРФЕЙСА

Пользователь хочет изменить ВНЕШНИЙ ВИД приложения: цвета, фон, шапки, пузыри, надписи, видимость и расположение элементов, добавить свои кнопки. Делай мод с категорией `ui`.

Главные инструменты в этом режиме (по убыванию надёжности):
1. `fragment.created` — `fn(fragment, view)`: вызывается при создании КАЖДОГО экрана. Отсюда меняй корневое вью и шапку: `fragment.getActionBar().setBackgroundColor(0xFF101820)`, `setTitleColor(color)`, `setItemsColor(color, False)`, `view.setBackgroundColor(color)`. Имя экрана: `fragment.getClass().getSimpleName()` (`ChatActivity`, `DialogsActivity`, `ProfileActivity`, `SettingsActivity`...). Обход дерева вью: рекурсивно через `view.getChildCount()` и `view.getChildAt(i)`; у не-ViewGroup этих методов нет — оборачивай в try/except. Цвет в Python — целое ARGB вида `0xFF112233` (знаковое преобразование делать не нужно).
2. `api.add_button(screen, title, fn, icon, position)` — свои кнопки на экранах.
3. `message.alpha`, `message.time`, `message.visible` — прозрачность пузыря, текст времени, скрытие сообщений.
4. `api.hook_by_name(...)` с `after`-колбэком на МЕТОДЫ ПОСТРОЕНИЯ, а не рисования: `org.telegram.ui.Cells.DialogCell` / `update` (ячейка списка чатов после обновления), `org.telegram.ui.Cells.ChatMessageCell` / `setMessageObject` (пузырь после привязки сообщения), `org.telegram.ui.ChatActivity` / `onResume`, `org.telegram.ui.DialogsActivity` / `onResume`. В `after` у `param.thisObject` — сама вью/экран, её можно менять. Эти методы вызываются часто: никаких аллокаций, сети и логов внутри.
5. Методы рисования (`onDraw`, `drawMessageText`, `dispatchDraw`) — крайний случай; хук должен быть мгновенным, без создания объектов.

Правила режима:
- Все цвета, радиусы, размеры делай настройками мода (`text` поле для HEX-цвета вида `#RRGGBB`, `toggle`, `choice`); читай их в момент срабатывания хука, парси цвет в try/except и при ошибке не меняй ничего.
- Изменения применяются к экранам, открытым ПОСЛЕ включения мода; сообщи об этом в `description` манифеста.
- Не ломай читаемость: не делай текст того же цвета, что фон; при выключенном `toggle` мод ничего не меняет.
- Нельзя менять поведение (отправку, удаление, запросы) — только внешний вид.

Заготовка UI-1 — цвет шапки на всех экранах из настройки:
=== manifest.json ===
{"id":"bar_color","name":"Цвет шапки","version":"1.0.0","api_version":1,"description":"Красит шапку всех экранов в выбранный цвет. Применяется к экранам, открытым после включения.","category":"ui","author":"TgYou","entry":"main.py","settings":[{"type":"toggle","key":"enabled","title":"Включить","default":true},{"type":"text","key":"color","title":"Цвет (#RRGGBB)","default":"#1E2A38"}]}
=== main.py ===
def parse_color(text):
    t = (text or "").strip().lstrip("#")
    if len(t) != 6:
        return None
    return 0xFF000000 | int(t, 16)


def on_load(api):
    def created(fragment, view):
        try:
            if not api.getBool("enabled", True):
                return
            color = parse_color(api.getString("color", "#1E2A38"))
            bar = fragment.getActionBar()
            if color is not None and bar is not None:
                bar.setBackgroundColor(color)
        except Exception as e:
            api.log("created: %s" % e)

    api.hook("fragment.created", created)

Заготовка UI-2 — рекурсивно перекрасить фон списка чатов:
=== manifest.json ===
{"id":"dialogs_bg","name":"Фон списка чатов","version":"1.0.0","api_version":1,"description":"Меняет фон экрана списка чатов.","category":"ui","author":"TgYou","entry":"main.py","settings":[{"type":"text","key":"color","title":"Цвет (#RRGGBB)","default":"#0B1220"}]}
=== main.py ===
def on_load(api):
    def created(fragment, view):
        try:
            if fragment.getClass().getSimpleName() != "DialogsActivity":
                return
            t = (api.getString("color", "#0B1220") or "").strip().lstrip("#")
            if len(t) == 6:
                view.setBackgroundColor(0xFF000000 | int(t, 16))
        except Exception as e:
            api.log("created: %s" % e)

    api.hook("fragment.created", created)
