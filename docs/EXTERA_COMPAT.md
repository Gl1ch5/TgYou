# Совместимость с плагинами exteraGram

Файл `.plugin` (один Python-файл) ставится так же, как мод: **TgYou → Моды → установить из файла**. Приложение определяет формат само: ZIP (`.mod`) — обычный мод, иначе — плагин exteraGram. Тап по файлу `.plugin` в файловом менеджере сразу предлагает установку.

## Как работает
- `ModStore.installPlugin` запускает `tgyou_extera.describe(файл)`, получает `__id__`, `__name__`, `__version__`, `__description__`, `__author__` и список настроек, строит `manifest.json` и упаковывает плагин как обычный мод (id получает префикс `ext_`).
- При загрузке `tgyou_extera.load(api, путь)` находит класс-наследник `BasePlugin`, создаёт его и вызывает `on_plugin_load()`.
- Слой совместимости лежит в `src/main/python/`: `base_plugin`, `client_utils`, `android_utils`, `hook_utils`, `ui.settings`, `ui.bulletin`, `ui.alert`; в сборку добавлен `requests`.
- Новая точка расширения `message.send` (Java: `Hooks.SEND_MESSAGE`, одна строка в `SendMessagesHelper.sendMessage`) — аналог `on_send_message_hook`. Плагин может изменить `params.message` или отменить отправку (`HookStrategy.CANCEL`).

## Что поддерживается
| Возможность | Статус |
|---|---|
| `BasePlugin`, `HookResult`, `HookStrategy`, `on_plugin_load` | есть |
| `add_on_send_message_hook` / `on_send_message_hook` (CANCEL, MODIFY) | есть |
| `get_setting` / `set_setting` | есть, значения общие с экраном настроек TgYou |
| `Switch`, `Selector`, `Input` | показываются в настройках мода |
| `Header`, `Divider`, `Text` | принимаются, не показываются |
| `client_utils.send_message` (текст и фото), `run_on_queue`, `run_on_ui_thread`, `get_*` контроллеры | есть |
| `BulletinHelper`, `AlertDialogBuilder` | упрощённо: показываются как всплывающий текст |
| `android_utils`, `hook_utils` (поля через рефлексию) | базово |
| `add_hook(имя, match_substring)` + `pre_request_hook` (CANCEL, правка полей запроса) | есть (`request.outgoing`, имя = простое имя класса, `TL_` необязателен) |
| `post_request_hook` (подмена ответа через `HookResult(MODIFY, response=...)`) | есть (`request.response`, одна строка в `ConnectionsManager`) |
| `on_update_hook` / `on_updates_hook` (CANCEL убирает апдейт) | есть (`updates.incoming`, одна строка в `MessagesController.processUpdates`) |
| `add_menu_item(MenuItemData(MESSAGE_CONTEXT_MENU …))`, `condition`, `on_click(context)` | есть для меню сообщения; меню чата/профиля/шторки — пока нет |
| Иконпаки `.icons` | есть, см. [ICON_PACKS.md](ICON_PACKS.md) |
| `on_app_event` (`app_start/resume/pause/stop`) | есть (`app.event`, вызовы в `LaunchActivity.onResume/onPause/onDestroy`) |
| `extera_utils.text_formatting.parse_text` (HTML/Markdown → текст + entities, смещения в UTF-16), `markdown_utils.parse_markdown` | есть; проверено на обычном Python (смещения), в приложении не проверено |
| `client_utils`: `send_text/photo/document/video/audio` (video и audio уходят как документ), `edit_message`, `send_request`, `get_*` контроллеры, `get_client`/`AccountClient`, `account_scope`, очереди | есть |
| `file_utils`, `android_utils` (`R`, `OnClickListener`, `copy_to_clipboard`), `hook_utils` (static-поля) | есть |
| `BasePlugin.client()`, `export_settings`/`import_settings`, `add_hook("send_message_hook")` | есть |
| `AlertDialogBuilder` | настоящий диалог Telegram (заголовок, текст, кнопки); остальные методы цепочки принимаются без эффекта |
| `Custom`, `SimpleSettingFactory`, `Text.create_sub_fragment`, `on_change` | принимаются, **не отображаются** и не вызываются |
| Меню чата/профиля/шторки (`CHAT_ACTION_MENU`, `PROFILE_ACTION_MENU`, `DRAWER_MENU`) | пока нет |
| Intents, файловые хуки, `hook_method` (Xposed), `extera_utils.classes` (`java_subclass`) | **не поддерживаются**: вызов пишется в лог |
| `__requirements__` (pip), `.eaf` (ElyxBuilder) | нет |
| Собственные экраны плагина (`create_sub_fragment`) | нет |

Неподдержанный метод API не роняет плагин: вызов записывается в лог и игнорируется.

## Проверка
Новые хуки (запросы, ответы, апдейты, меню) только компилируются, в работе не проверены. Слой проверен только на синтетическом плагине: разбор метаданных и настроек (`describe`). Java компилируется. Установка и работа на устройстве, а также реальные плагины (например Google Search с командами `.g` и `.gi`) пока **не проверены**. «Полная» совместимость недостижима одним шагом: API exteraGram большой, поддержка будет расширяться по реальным плагинам.
