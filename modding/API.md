# Справочник `api` (Python-моды)

Объект приходит в `on_load(api)`. Статус: скомпилировано, на устройстве не проверено.

| Метод | Что делает |
|---|---|
| `api.hook(имя, fn)` | подписка на именованный хук (список: `ModApi.on`, каталог в hooks/) |
| `api.add_page(title, fn)` | страница в разделе TgYou; `fn()` возвращает список `(название, значение)` |
| `api.add_button(screen, title, fn, icon="add", position="bottom_right")` | кнопка на любом экране, см. ниже |
| `api.settings_get/put`, `getBool/putBool` | настройки мода |
| `api.toast(text)`, `api.log(text)` | сообщение и запись в журнал мода |
| `api.icon(name)` | id иконки меню по короткому имени (`"info"`, `"stats"`) |
| `api.hookMethod(member, before, after, replace)` | Xposed-подобный хук одного метода (Pine) |
| `api.hook_by_name(класс, regexp_имени, before, after, replace)` | хук всех методов класса с подходящим именем; вернёт число захваченных. Есть вариант с числом параметров: `hook_by_name(класс, имя, n, before, after, replace)` |

## `api.add_button`

- `screen`: простое имя класса экрана (`"ChatActivity"`, `"DialogsActivity"`, `"ProfileActivity"` …) или `"*"` для всех экранов.
- `position`: `top_left`, `top_right`, `center_left`, `center_right`, `bottom_left`, `bottom_right` (плавающая круглая кнопка) или `action_bar` (внутри шапки слева от стандартных кнопок).
- `fn()` вызывается в UI-потоке; исключения пишутся в журнал мода.
- Кнопка появляется на экранах, открытых после загрузки мода (уже открытый экран не перерисовывается).
- Работает только на экранах, корень которых `FrameLayout`; на остальных кнопка пропускается с записью в журнал.
- Позиции и отступы подобраны на глаз: в шапке кнопка может перекрыть стандартные значки, плавающая — элементы экрана. На устройстве не проверено.

## Именованные хуки (`api.hook(имя, fn)`)

| Имя | Вызов `fn` | Что вернуть |
|---|---|---|
| `request.outgoing` | `(имя_класса, запрос)` | истина: отбросить запрос |
| `request.response` | `(account, запрос, ответ, ошибка)` | другой ответ или `None` |
| `updates.incoming` | `(updates)` | истина: отбросить |
| `message.send` | `(account, params)` | истина: отменить отправку |
| `message.time` | `(message, текст)` | новый текст или `None` |
| `message.menu` | `(menu)` | `menu.add(название, иконка, действие)` |
| `message.visible` | `(message)` | ложь: скрыть сообщение |
| `message.alpha` | `(message, alpha)` | новая прозрачность или `None` |
| `message.edited` | `(account, message)` | — |
| `messages.deleted` | `(account, dialogKey, ids)` | список id, которые правда удалить, или `None` |
| `menu.item`, `app.event` | `(menu)`, `(событие)` | — |
| `fragment.created` | `(fragment, view)` | — (вызывается для каждого созданного экрана, так можно менять любое вью) |
| `chat.keep_kicked` | `(chat)` | истина: оставить чат в списке |
| `secret.screenshot_notice` | `()` | истина: не сообщать о скриншоте |
| `content.allow_copy`, `media.keep_ttl`, `premium.check` | `()` | истина: включить |
| `window.secure` | `(secure)` | новое значение или `None` |
| `transcribe.available`, `transcribe.request` | `(message)` | истина |

Всё остальное (любой метод любого класса Telegram) доступно через `hook_by_name` и `hookMethod`; где что искать — в [hooks/HOOKS_CATALOG.md](hooks/HOOKS_CATALOG.md) и `hooks/hook_scan.py`.
Статус: скомпилировано в CI (проверяется), на устройстве не проверено.
