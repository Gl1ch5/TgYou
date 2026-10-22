# Совместимость с плагинами exteraGram

Файл `.plugin` (один Python-файл) ставится так же, как мод: **TgYou → Моды → установить из файла**. Приложение определяет формат само: ZIP — обычный мод, иначе — плагин exteraGram.

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
| `add_hook` по именам TL-запросов, `hook_method`, `add_menu_item`, обработчики кадров/обновлений | **не поддерживаются**: вызов только пишется в лог |
| Собственные экраны плагина (`create_sub_fragment`) | нет |

Неподдержанный метод API не роняет плагин: вызов записывается в лог и игнорируется.

## Проверка
Слой проверен только на синтетическом плагине: разбор метаданных и настроек (`describe`). Java компилируется. Установка и работа на устройстве, а также реальные плагины (например Google Search с командами `.g` и `.gi`) пока **не проверены**. «Полная» совместимость недостижима одним шагом: API exteraGram большой, поддержка будет расширяться по реальным плагинам.
