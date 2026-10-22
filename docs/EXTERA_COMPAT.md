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
| `Header`, `Text(on_click)` | заголовок и строка-кнопка в настройках мода; клик вызывает `on_click` на UI-потоке (компилируется, на устройстве не проверено) |
| `Divider` | принимается, не показывается |
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
| `on_change` у `Switch/Selector/Input` | вызывается после смены значения (switch → bool, selector → индекс, input → строка) |
| `Text.create_sub_fragment` | подпункты разворачиваются в тот же экран под заголовком (вызов один раз при установке) |
| `Custom`, `SimpleSettingFactory` | принимаются, **не отображаются** |
| Модули `plugins_manager`, `settings`; `MethodReplacement`, `HookFilter`, `client_utils.log/show_*_bulletin/download_file`, `android_utils.dp/get_string` | заглушки/простая реализация, чтобы плагины импортировались |
| Журнал мода | кнопка «Журнал» на карточке мода: последние 200 строк `log` и ошибок, можно скопировать |
| `CHAT_ACTION_MENU`, `PROFILE_ACTION_MENU` | есть (хук `menu.item`, трёхточечное меню чата и профиля; на устройстве не проверено) |
| `DRAWER_MENU`, `MAIN_MENU` | в Telegram 13 бокового меню нет: пункты показываются на главном экране TgYou в группе «Расширения» |
| `hook_method`, `hook_all_methods`, `hook_all_constructors`, `unhook_method`, `MethodHook`, `MethodReplacement`, `XposedHook` | реализованы на Pine (`top.canyie.pine:core:0.3.0`, `PineHooks.java`): before/after/replace, `param.args/thisObject/setResult/getResult`. Pine заявляет поддержку до Android 14–15, на Android 16 **не проверено**; при сбое инициализации хук возвращает None и пишет причину в «Журнал» мода |
| Intents, файловые хуки, `extera_utils.classes` (`java_subclass`) | **не поддерживаются**: вызов пишется в лог (в 81 проверенном плагине не встречаются) |
| `__requirements__` (pip), `.eaf` (ElyxBuilder) | нет |

Неподдержанный метод API не роняет плагин: вызов записывается в лог и игнорируется.

## Проверка
Статический проверщик `python3 -I tools/extera_check.py *.plugin` (ничего не запускает) разбирает плагины как AST: импорты, имена API, вызовы `add_/hook_*`. На 81 реальном плагине с GitHub: 25 не проходили, после этого шага — 13 (остаются `hook_method`/Xposed, `audioop`, `zwylib`, `hook_*_ref`). Запуск плагинов на устройстве не проверен.

Новые хуки (запросы, ответы, апдейты, меню) только компилируются, в работе не проверены. Слой проверен только на синтетическом плагине: разбор метаданных и настроек (`describe`). Java компилируется. Установка и работа на устройстве, а также реальные плагины (например Google Search с командами `.g` и `.gi`) пока **не проверены**. «Полная» совместимость недостижима одним шагом: API exteraGram большой, поддержка будет расширяться по реальным плагинам.
