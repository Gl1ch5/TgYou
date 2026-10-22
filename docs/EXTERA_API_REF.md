# Справочник по Python-API плагинов exteraGram

Цель: чтобы другой инженер мог переписать слой совместимости. Здесь только то, что удалось подтвердить по источникам (раздел 0). Домены, которых нет в источниках, помечены как пробелы (раздел 17).

## 0. Источники и пометки

Официальный сайт https://plugins.exteragram.app/docs/ во время работы отдавал HTTP 522 (curl и WebFetch, повторы не помогли), web.archive.org недоступен. Поэтому содержимое собрано из:

| Код | Источник | Надёжность |
|---|---|---|
| **[docs]** | (а) документация-производный навык `makarworld/exteragram-plugin-skill` (SKILL.md + reference/*.md, пересказ официальных docs, SDK 1.4.4.3); (б) официальные заглушки SDK `*.pyi` 1.4.5.0-beta (`exteraSquad/plugins-pysdk-builds`, взяты из `Primeevokak/PrimeGram/plugins-sdk-reference`) | высокая, но не сам сайт |
| **[engine]** | исходники хоста: `Keeperorowner/NagramXF` (Java: `PluginsController`, `PythonPluginsEngine`, `Plugin`, `EventHookRecord`, `MenuItemRecord`, `MenuContextBuilder`, места вызова в `ConnectionsManager`, `SendMessagesHelper`, `MessagesController`; Python-реализация SDK в `sdk_pysrc/`) | это сторонний форк/клон, поведение близко, но не гарантировано идентично официальному |
| **[code]** | реальные плагины (раздел 16) | подтверждает, что API реально вызывают; не подтверждает семантику |
| **[port]** | сторонний порт `exteraless` (формат `.icons`) | не официальный |

Пометка у пункта: **confirmed in docs** = есть в [docs]; **seen in plugin code only** = только [engine]/[code]/[port].

Расхождения между источниками перечислены в разделе 15. Ничего из скачанного не запускалось, только читалось.

## 1. Что такое плагин

- Один Python-файл. В репозиториях расширение `.plugin`, на устройстве `/data/user/0/com.exteragram.messenger/files/plugins/<id>.py`. confirmed in docs.
- Рантайм: Chaquopy, Python 3.11; хуки в стиле Xposed (Aliucord). confirmed in docs.
- SDK 1.4.4.3 (навык) / 1.4.5.0-beta (заглушки). Мульти-аккаунтные помощники требуют SDK >= 1.4.5.0, Elyx >= 1.4.5.3, минимум приложения 12.5.1. Intents требуют приложения 12.6.4 (build 66999). Свои имена `java_subclass` требуют кода приложения >= 66690. confirmed in docs.
- Загрузчик читает метаданные через AST из литеральных констант верхнего уровня (код плагина для этого не исполняется). confirmed in docs (`extera_utils.metadata_parser`) и [engine].
- Предустановленные библиотеки: beautifulsoup4, debugpy, lxml, packaging, pillow, requests, PyYAML. Через `__requirements__` ставятся только чистые pure-Python `none-any` колёса (PEP 508). confirmed in docs.
- Модули SDK, которые обязана предоставлять платформа: `_sdk_version`, `base_plugin`, `plugin_settings` (`PythonPluginsEngine.SDK_REQUIRED_MODULES`); `_sdk_version.__start__()` должен вернуть истину. seen in plugin code only ([engine]).

## 2. Метаданные `.plugin` (переменные верхнего уровня)

Таблица ключей (`extera_utils.metadata_parser._ATTR_MAP`). confirmed in docs для ключей; детали хоста [engine].

| Переменная | Тип | Значение |
|---|---|---|
| `__id__` | str | идентификатор, имя файла `<id>.py`. Elyx: 2-32 ASCII буквы/цифры/`_` |
| `__name__` | str | отображаемое имя |
| `__version__` | str | версия, по умолчанию `"1.0"` |
| `__author__` | str | автор |
| `__description__` | str | описание, markdown |
| `__icon__` | str | **ссылка на стикерпак `ShortName/index`**, не имя ресурса (см. 2.1) |
| `__app_version__` | str | требование к версии приложения с операторами: `>`, `>=`, `<`, `<=`, `==`, `!=`, через запятую (напр. `">=12.5.1"`) |
| `__sdk_version__` | str | то же для версии SDK (напр. `">=1.4.3.3"`) |
| `__requirements__` | list[str] или str | PEP 508; хост склеивает через запятую |
| `__min_version__` | str | устаревший: «версия приложения >= значения» (`versionBiggerOrEqual`) |

Хост ([engine], `PythonPluginsEngine` ~1553): `app_version` сопоставляется операторами; `min_version` через `versionBiggerOrEqual`; `sdk_version` сверяется с `SDK_VERSION`. Java-сторона хранит icon, min_version, app_version, sdk_version, requirements. Заглушка `PluginMetadata` (1.4.5.0-beta) перечисляет только: id, name, description, author, version, icon, min_version, requirements; то есть `__app_version__` / `__sdk_version__` в ней нет (заглушка, видимо, отстаёт; в реальных плагинах они есть). `metadata_parser` экспортирует `get_plugin_id()` и `get_metadata(file_path)`. Для совместимости парсить все ключи; `min_version` и `app_version` понимать оба.

Практика (раздел 16): `__min_version__` встречается в ~380 из 511 плагинов, `__app_version__` в ~101, `__sdk_version__` в ~88, `__requirements__` в ~16 (значения: `"yt-dlp"`, `"requests"`, `"mutagen"`, `"tinydb"`).

### 2.1 `__icon__`: что это и чем НЕ является

- Формат: `"<StickerPackShortName>/<index>"`, regex `^[a-zA-Z][a-zA-Z0-9_]*/\d+$` (`Plugin.java`). Примеры из практики: `"exteraPlugins/1"`, `"exteraPlugins/0"`, `"Animasha26/22"`, `"ColorfulMessages/28"`. Допустима пустая строка (иконки нет). seen in plugin code only ([engine]+[code]); сам ключ `__icon__` confirmed in docs.
- Хост хранит pack и index раздельно; `InstallPluginBottomSheet` грузит набор запросом `TL_inputStickerSetShortName(short_name=pack)` и берёт стикер по индексу.
- Это НЕ ссылка на пак `.icons` (раздел 11) и НЕ имя drawable.
- `icon="msg_settings"` в элементах настроек и меню (`Switch(icon=...)`, `MenuItemData(icon=...)`) это имя drawable-ресурса приложения: `getResources().getIdentifier(name, "drawable", pkg)` ([engine], `MenuItemRecord`). Самые частые в плагинах: `msg_*` (например `msg_settings`, `msg_info`). Паки `.icons` как раз подменяют такие drawable.

## 3. `base_plugin`

### 3.1 Классы и перечисления

`HookStrategy` (enum, confirmed in docs): `CANCEL`, `MODIFY`, `DEFAULT`, `MODIFY_FINAL`.

`HookResult` (dataclass, confirmed in docs, заглушка):

```python
HookResult(strategy: HookStrategy = HookStrategy.DEFAULT,
           request=None, response=None, update=None, updates=None,
           error=None, params=None)
```
Порядок позиционных полей в [engine]-реализации: `strategy, request, response, update, updates, params, error` (NagramXF); в заглушке `error` перед `params`. Передавать только по ключевым словам. В плагинах встречается и `HookResult(True, params)` / `HookResult(strategy=...)` ([code], нестрогое использование).

`AppEvent` (confirmed in docs): `START="app_start"`, `STOP="app_stop"`, `PAUSE="app_pause"`, `RESUME="app_resume"`. В [code] чаще всего `AppEvent.RESUME` (23 файла), `START` (18), `PAUSE` (4), `STOP` (2).

`MenuItemType` (confirmed in docs): `MESSAGE_CONTEXT_MENU="message_context_menu"`, `DRAWER_MENU="drawer_menu"`, `MAIN_MENU="main_menu"`, `CHAT_ACTION_MENU="chat_action_menu"`, `PROFILE_ACTION_MENU="profile_action_menu"`. [engine]: при поиске для `MAIN_MENU` в выборку входят и `DRAWER_MENU`-пункты. В [code]: `CHAT_ACTION_MENU` 107 использований, `DRAWER_MENU` 63, `MESSAGE_CONTEXT_MENU` 41, `PROFILE_ACTION_MENU` 14; `MAIN_MENU` нет.

`IntentHookType` (confirmed in docs, заглушка): `BEFORE=0`, `AFTER=1`.

`PluginError(message, plugin_id)` исключение (confirmed in docs, заглушка).

`MenuItemData` (confirmed in docs):
```python
MenuItemData(menu_type: MenuItemType, text: str, on_click: Callable[[dict], None],
             item_id: str|None=None, icon: str|None=None, subtext: str|None=None,
             condition: str|None=None,   # выражение MVEL, true = показать
             priority: int=0)
```
Обязательны `menu_type`, `text`, `on_click`, иначе `IllegalArgumentException` ([engine]). Сортировка по `priority` по убыванию ([engine]). Без `item_id` генерируется UUID.

### 3.2 `BasePlugin` (confirmed in docs)

Атрибуты (заполняет загрузчик): `id, name, description, author, min_version, version, requirements, icon, error_message, enabled, initialized`.

Жизненный цикл и UI, переопределяются плагином:

| Метод | Подпись | Семантика |
|---|---|---|
| `on_plugin_load` | `(self) -> None` | вызывается при загрузке/включении; здесь регистрируют хуки и меню |
| `on_plugin_unload` | `(self) -> None` | при выгрузке/выключении; хуки и пункты меню снимаются хостом автоматически ([engine]) |
| `create_settings` | `(self) -> list` | список элементов `ui.settings` |
| `on_app_event` | `(self, event_type: AppEvent) -> None` | START/STOP/PAUSE/RESUME |

Колбэки хуков (переопределяются; активируются регистрацией через `add_hook` / `add_on_send_message_hook`):

| Метод | Подпись |
|---|---|
| `pre_request_hook` | `(self, request_name: str, account: int, request) -> HookResult` |
| `post_request_hook` | `(self, request_name: str, account: int, response, error) -> HookResult` |
| `on_update_hook` | `(self, update_name: str, account: int, update) -> HookResult` |
| `on_updates_hook` | `(self, container_name: str, account: int, updates) -> HookResult` |
| `on_send_message_hook` | `(self, account: int, params) -> HookResult` |

Регистрация (final, не переопределять):

| Метод | Подпись | Семантика |
|---|---|---|
| `add_hook` | `(name: str, match_substring: bool=False, priority: int=0)` | подписка по имени класса TL-запроса/обновления/контейнера, либо спец-имя `"send_message_hook"`; см. раздел 4 |
| `add_on_send_message_hook` | `(priority: int=0)` | эквивалент `add_hook("send_message_hook", False, priority)` ([engine]) |
| `remove_hook` | `(name: str)` | снимает подписку с таким именем |
| `add_file_hook` | `(file_info: FileInfo) -> secret` | раздел 9.3 |
| `remove_file_hook` | `(ext: str, secret: str)` | |
| `add_intent_hook` | `(info, type: IntentHookType) -> handler_id` | раздел 10 |
| `remove_intent_hook` | `(handler_id)` | |
| `add_menu_item` | `(data: MenuItemData) -> str|None` | id пункта; `None` при неудаче |
| `remove_menu_item` | `(item_id: str) -> bool` | пункты снимаются и при выгрузке |

Настройки:

| Метод | Подпись |
|---|---|
| `get_setting` | `(key: str, default=None)` |
| `set_setting` | `(key: str, value, reload_settings: bool=False)` |
| `export_settings` | `() -> dict` |
| `import_settings` | `(settings: dict, reload_settings: bool=True)` |

`plugin_settings` (confirmed in docs, заглушка): `init`, `get_setting`, `set_setting`, `clear_settings`, `get_all_settings`, `set_all_settings`. Хранилище в NagramXF: JSON `<plugins_dir>/<id>/settings.json` ([engine]); у официального приложения формат хранения не подтверждён.

Xposed (final, confirmed in docs):

| Метод | Подпись | Возврат |
|---|---|---|
| `hook_method` | `(method_or_constructor, xposed_hook=None, priority=None, *, before=None, after=None, before_filters=None, after_filters=None)` | `Unhook` или `None` |
| `hook_all_methods` | `(hook_class, method_name, ...те же параметры)` | `list[Unhook]` |
| `hook_all_constructors` | `(hook_class, ...)` | `list[Unhook]` |
| `unhook_method` | `(unhook)` | |

Прочее: `log(message)`, `client(account=None) -> AccountClient`.

Классы хуков Xposed: `XposedHook`, `MethodHook` (`before_hooked_method(param)`, `after_hooked_method(param)`), `MethodReplacement` (`replace_hooked_method(param)`), `BaseHook`, `HookFilterData`, декоратор `hook_filters(*filters)` и `fn_hook_filters`. `param` это `XC_MethodHook.MethodHookParam`: `thisObject`, `args`, `method`, `getResult()`, `setResult(v)`; `setResult` в before-хуке пропускает оригинальный метод. Фильтры `HookFilter`: `RESULT_IS_NULL, RESULT_IS_TRUE, RESULT_IS_FALSE, RESULT_NOT_NULL, ResultIsInstanceOf, ResultEqual, ResultNotEqual, ArgumentIsNull, ArgumentIsTrue, ArgumentIsFalse, ArgumentNotNull, ArgumentIsInstanceOf, ArgumentEqual, ArgumentNotEqual, Condition(condition, object=None)` (MVEL), `Or(*filters)`. Строковые типы фильтров лежат в `PluginsConstants` ([engine]), например `"result_is_null"`, `"argument_equal"`.

## 4. Хуки: имена, стратегии, поля

### 4.1 Имя хука

- Для запроса: `request.getClass().getSimpleName()`, напр. `"TL_messages_sendMessage"`, `"TL_account_getAuthorizations"`. Для обновления: имя класса обновления (`"TL_updateNewMessage"`, `"TL_updateNewChannelMessage"`); для контейнеров `"TL_updates"`, `"TL_updateShortMessage"` и т. п. ([engine]). Имена приводятся в [code] с префиксом `TL_` (самые частые: `TL_updateNewMessage` 7, `TL_messages_forwardMessages` 6, `TL_updateNewChannelMessage` 2, `TL_messages_sendMedia`, `TL_messages_sendMessage`, `TL_payments_*`).
- Сопоставление ([engine], `EventHookRecord`): при `match_substring=False` строгое `hookName.equals(registered)`; при `True` проверка `registered.contains`-подстрокой (непустая подстрока), поэтому `add_hook("NewMessage", match_substring=True)` ловит и `TL_updateNewMessage`, и `TL_updateNewChannelMessage`-подобные. В [code] так и используют (`"ShortMessage"`, `"getAuthorizations"`).
- Какой именно колбэк вызывается: хост вызывает `pre_request_hook` / `post_request_hook` / `on_update_hook` / `on_updates_hook` у каждого плагина, чья подписка подошла; плагин в теле сам различает `request_name`.

### 4.2 Точки вызова ([engine])

- `ConnectionsManager.sendRequest`: pre-hook перед отправкой. `CANCEL` пишет в лог и **возвращается без вызова callback** (по исходнику NagramXF); сторонний PrimeGram-док утверждает, что отдаётся ошибка с кодом -2000. post-hook вызывается до исходного callback; `CANCEL` отбрасывает ответ. post-hook может вернуть изменённые `response` или `error`.
- `MessagesController.processUpdates` -> `on_updates_hook` (контейнер); `processUpdateArray` -> `on_update_hook` (по каждому обновлению).
- `SendMessagesHelper.sendMessage(SendMessageParams)`: в начале вызывается send-хук; `CANCEL` возвращает `null` (отправка прерывается).

### 4.3 Порядок и обработка результата ([engine], `executeHook`)

- Плагины сортируются по максимальному `priority` их подписок по убыванию (больший приоритет раньше), при равенстве по `id`. Вызываются только включённые плагины без ошибок.
- `CANCEL`: результат null, `cancel=true`, цепочка прерывается.
- `MODIFY` / `MODIFY_FINAL`: берётся полезная нагрузка из `HookResult` по ключу (`request` / `response` / `update` / `updates` / `params` / `error`) и подставляется для следующих; `MODIFY_FINAL` дополнительно останавливает цепочку.
- `DEFAULT` или `None`: продолжить без изменений.
- Исключения в плагине ловятся и логируются.
- Аккаунт хука выставляется через `client_utils._set_hook_account`; помощники без `account=` внутри хука используют его.

### 4.4 Параметры `on_send_message_hook(account, params)`

`params` это `SendMessagesHelper.SendMessageParams` (Java-объект, поля читаются/пишутся атрибутами). Список из форка (надмножество); поля отправки: `message` (str; `None` для медиа), `caption`, `location`, `photo`, `videoEditedInfo`, `user`, `document`, `game`, `poll`, `pollSendParams`, `pollIndex`, `todo`, `invoice`, `mediaWebPage`, `cover`, `peer` (long, dialog id), `path`, `replyToMsg`, `replyToTopMsg`, `webPage`, `searchLinks`, `retryMessageObject`, `entities` (ArrayList<MessageEntity>), `replyMarkup`, `params` (HashMap<String,String>), `notify`, `scheduleDate`, `scheduleRepeatPeriod`, `ttl`, `parentObject`, `sendAnimationData`, `updateStickersOrder`, `hasMediaSpoilers`, `replyToStoryItem`, `sendingStory`, `replyQuote`, `sendMessageChatArguments`, `invert_media`, `quick_reply_shortcut`, `quick_reply_shortcut_id`, `effect_id`, `stars`, `payStars`, `monoForumPeer`, `sendingHighQuality`, `suggestionParams`. seen in plugin code only ([engine]: набор зависит от версии приложения). Реально используют в плагинах (счёт обращений): `params.message` 614, `entities` 140, `peer` 133, `replyToMsg` 90, `caption` 56, `replyToTopMsg` 38, `document` 16.

Типичное изменение текста: `params.message = new`; для форматирования парсить Markdown/HTML (раздел 8) и записывать `params.message` + `params.entities`; вернуть `HookResult(strategy=HookStrategy.MODIFY, params=params)`. Отмена: `HookResult(strategy=HookStrategy.CANCEL)`.

### 4.5 Остальные хуки

- Хуки запросов/ответов: `pre_request_hook` получает объект TL-запроса (изменяемый), `post_request_hook` получает ответ и ошибку. Доступ к полям TL-объектов идёт через Java-рефлексию Chaquopy (`obj.message`, `obj.peer`...). confirmed in docs (концептуально).
- Файловые и intent-хуки: разделы 9.3, 10.

## 5. Настройки (`ui.settings`)

Все элементы это dataclass'ы с неинициализируемым полем `type`; константы типа: `switch`, `selector`, `input`, `text`, `header`, `divider`, `edit_text`, `custom`. Подписи confirmed in docs (заглушки + навык).

| Класс | Конструктор |
|---|---|
| `Switch` | `(key, text, default: bool, subtext="", icon="", on_change: Callable[[bool],None]=None, on_long_click: Callable[[View],bool]=None, link_alias="")` |
| `Selector` | `(key, text, default: int, items: list[str], icon="", on_change: Callable[[int],None]=None, on_long_click=None, link_alias="")` |
| `Input` | `(key, text, default="", subtext="", icon="", on_change: Callable[[str],None]=None, on_long_click=None, link_alias="")` |
| `Text` | `(text, subtext="", icon="", accent: bool=False, red: bool=False, on_click: Callable[[View],None]=None, create_sub_fragment: Callable[[],list]=None, on_long_click=None, link_alias="")` |
| `Header` | `(text)` |
| `Divider` | `(text="")` |
| `EditText` | `(key, hint, default="", multiline=False, max_length=256, mask=None, on_change=None)` (seen in plugin code only: в заглушке/навыке нет; максимум 256 по умолчанию из [engine]; разбирается только при наличии `key` и `hint`) |
| `Custom` | `(item=None, view=None, factory=None, factory_args=None, on_click=None, on_long_click=None, create_sub_fragment=None, link_alias="")`; приоритет: `factory`, затем `item`, затем `view` |
| `SimpleSettingFactory` | `(create_view, bind_view, *, is_clickable=False, is_shadow=False, create_item=None, on_click=None, on_long_click=None, attached_view=None, equals=None, content_equals=None)`; атрибут `.instance` (в `Custom(factory=...)` передавать `.instance.java`); вызов `factory(*args, create_sub_fragment=None, link_alias=None)` создаёт элемент |

Подписи колбэков фабрики: `create_view(context, list_view, current_account, class_guid, resources_provider)`, `bind_view(view, item, divider, adapter, list_view)`, `create_item(plugin, setting, args)`, `on_click(plugin, item, view)`, `on_long_click(plugin, item, view) -> bool`, `attached_view(list_view, view, item)`, `equals(a, b)`, `content_equals(a, b)`.

Семантика:
- `key` это ключ для `get_setting` / `set_setting`; при смене значения UI пишет настройку сам и затем вызывает `on_change`.
- `Switch`: нужны `key`, `text`, `default`; `Selector`: непустой `items`; элементы без обязательных полей хост молча пропускает ([engine]).
- `Text.create_sub_fragment` возвращает список элементов вложенного экрана; `link_alias` позволяет открыть пункт deep-link'ом.
- `icon` это имя drawable (см. 2.1).
- Частота именованных аргументов в [code]: `text=` 3032, `key=` 1053, `default=` 649, `icon=` 527, `subtext=` 203, `on_change=` 134, `on_click=` 109, `items=` 85, `create_sub_fragment=` 62, `accent=` 53, `red=` 29, `link_alias=` 19.

## 6. Меню

`add_menu_item(MenuItemData(...))` (раздел 3.1). Колбэк `on_click(context: dict)` получает контекст ([engine], `MenuContextBuilder`): ключи `account`, `context`, `fragment`, `encryptedChat`, `chat`, `chatId`, `chatFull`, `user`, `userId`, `userFull`, `botInfo`, `dialog_id`, `message`, `groupedMessages` плюс пользовательские. Набор ключей зависит от типа меню (для `MESSAGE_CONTEXT_MENU` есть `message`; для `CHAT_ACTION_MENU` `dialog_id`; для `PROFILE_ACTION_MENU` `user`/`chat`). confirmed in docs (MenuItemData/Type); состав ключей seen in plugin code only. В [code] читают: `dialog_id` (32), `message` (18), `fragment` (10), `user` (9), `chat` (6), `chatId` (2), `account` (2).

`condition` это строка MVEL, вычисляется над теми же ключами контекста. Иконка по имени drawable (`icon="msg_info"`). Из DRAWER_MENU пункты попадают в боковое меню. `remove_menu_item(id) -> bool`.

## 7. События приложения

`on_app_event(self, event_type: AppEvent)` с значениями `app_start`, `app_stop`, `app_pause`, `app_resume` (раздел 3.1). В [code] реализуют лишь ~27 плагинов; в некоторых встречается и регистрация через `add_hook(ON_APP_EVENT)` (локальная константа плагина, не API). confirmed in docs для значений; точные моменты вызова (START при запуске процесса, RESUME при выходе на передний план) seen in plugin code only.

## 8. Форматирование текста

`extera_utils.text_formatting` (confirmed in docs):
- `parse_text(text: str, parse_mode: str='HTML', is_caption: bool=False) -> {"message"|"caption": str, "entities": list}`.
- `TLEntityType`: `CODE, PRE, STRIKETHROUGH, TEXT_LINK, BOLD, ITALIC, UNDERLINE, SPOILER, CUSTOM_EMOJI, BLOCKQUOTE`.
- `RawEntity(type, offset, length, language=None, url=None, document_id=None, collapsed=False)`.
- `HTML.parse/unparse`, `Markdown.parse/unparse`.
- HTML-теги: `b/strong`, `i/em`, `u`, `s/del/strike`, `a href`, `code`, `pre language=`, `spoiler`/`tg-spoiler`, `blockquote` (атрибуты expandable/collapsed), `emoji id=`.
- Markdown: `*bold*`, `_italic_`, `__underline__`, `~strike~`, `||spoiler||`, `` `code` ``, ```` ``` ```` блоки, `[text](url)`, `![alt](tg://emoji?id=ID)`, `> quote`, `**> expandable quote`.

`markdown_utils` (confirmed in docs, заглушка): `parse_markdown(markdown: str) -> ParsedMessage(text, entities)`. В [code] используется заметно чаще (53 файла), чем `parse_text` (3).

## 9. Утилиты

### 9.1 `client_utils` (confirmed in docs)

Очереди: `STAGE_QUEUE="stageQueue"`, `GLOBAL_QUEUE="globalQueue"`, `CACHE_CLEAR_QUEUE="cacheClearQueue"`, `SEARCH_QUEUE="searchQueue"`, `PHONE_BOOK_QUEUE="phoneBookQueue"`, `THEME_QUEUE="themeQueue"`, `EXTERNAL_NETWORK_QUEUE="externalNetworkQueue"`, `PLUGINS_QUEUE="pluginsQueue"` (по умолчанию).

| Функция | Подпись |
|---|---|
| `get_selected_account` | `() -> int` (аккаунт, выбранный в UI) |
| `get_hook_account` | `() -> int` (аккаунт текущего хука) |
| `account_scope` | `(account)` контекстный менеджер |
| `get_queue_by_name` | `(name)` |
| `run_on_queue` | `(fn, queue_name=PLUGINS_QUEUE, delay=0)` |
| `RequestCallback` | `(fn, account=None)`; `fn(response, error)` |
| `send_request` | `(request, fn, *, account=None) -> int` (id запроса), `fn(response, error)` |
| `get_last_fragment` | `() -> BaseFragment|None` |
| `get_account_instance`, `get_messages_controller`, `get_contacts_controller`, `get_media_data_controller`, `get_connections_manager`, `get_location_controller`, `get_notifications_controller`, `get_messages_storage`, `get_send_messages_helper`, `get_file_loader`, `get_secret_chat_helper`, `get_download_controller`, `get_notifications_settings`, `get_notification_center`, `get_user_config` | `(account=None)` |
| `get_media_controller` | `()` без аккаунта |
| `send_message` | `(params: dict, parse_mode=None, *, account=None)` |
| `send_text` | `(peer, text, *, account=None, parse_mode=None, **kwargs)` |
| `send_photo` | `(peer, file_path, caption='', high_quality=False, ...)` |
| `send_document` / `send_video` / `send_audio` | `(peer, file_path, caption='')` |
| `edit_message` | `(message_obj, text=None, file_path=None, with_spoiler=False, *, account=None, parse_mode=None, **kwargs)` |
| `AccountClient(account)` | те же методы без `account=`; `get_client(account=None) -> AccountClient` |
| `NotificationCenterDelegate` | `didReceivedNotification(id, account, args)` |

Ключи словаря `send_message`: `peer, message, caption, photo, document, path, replyToMsg, replyMarkup, params, notify, scheduleDate, ttl, hasMediaSpoilers, sendingHighQuality`. Правило мульти-аккаунта: каждый хук получает `account`; помощники без `account=` берут аккаунт UI и один раз пишут предупреждение.

### 9.2 `android_utils`, `hook_utils`, `file_utils` (confirmed in docs)

- `android_utils`: `run_on_ui_thread(func, delay=0)`, `log(data)`, `copy_to_clipboard(text)`, `R(fn)` (Runnable-прокси), `OnClickListener(fn)`, `OnLongClickListener(fn)` (fn возвращает bool).
- `hook_utils`: `find_class(name) -> Class|None`, `get_private_field(obj, name)`, `set_private_field(obj, name, value) -> bool`, `get_static_private_field(clazz, name)`, `set_static_private_field(clazz, name, value) -> bool`.
- `file_utils`: `get_plugins_dir`, `get_cache_dir`, `get_files_dir`, `get_images_dir`, `get_videos_dir`, `get_audios_dir`, `get_documents_dir`; `read_file`, `read_file_bytes`, `write_file`, `write_file_bytes`, `delete_file -> bool`, `ensure_dir_exists`, `list_dir(path, recursive=False, include_files=True, include_dirs=False, extensions=None)`.

### 9.3 Файловые хуки (`file_utils.FilesController`, confirmed in docs)

`Place` enum: `UNKNOWN=1, ChatActivity=2, FilteredSearchView=3, SharedMediaLayout=4, SearchDownloadsContainer=5, ChannelAdminLogActivity=6`. `FileInfo(ext, on_click, *, whitelist_places, blacklist_places, get_icon)`; `OnClickArgs(place, file, file_name, message, activity, parent_fragment)`; `register(file_info) -> secret`; `unregister(ext, secret)`; исключения `ExtensionAlreadyRegistered`, `ExtensionNotRegistered`, `SecretInvalid`. Константы `SUPPORT_ICONS`, `DIRECT_FILE_ICONS`. Через плагин: `add_file_hook(info)`, `remove_file_hook(ext, secret)`.

## 10. Intents (confirmed in docs; приложение >= 12.6.4)

Форма из docs/навыка:
```python
IntentsManager.new_global_before_handler(callback, scheme=None, host=None, path=None,
    required_path_args_names=None, action=None, type=None, categories=None,
    whitelist_flags=None, blacklist_flags=None, priority=0)
IntentsManager.new_global_after_handler(...)   # те же параметры
HandlerHandle(handler_id).unhandle();  IntentsManager.unhandle(handler_id);  IntentsManager.parse(url) -> dict
```
Исключение `HandlerNotRegistered`. Колбэк получает только те параметры, которые назвал в сигнатуре: `intent, scheme, host, path, query_args, action, flags, type, categories`, а также query-аргументы и переменные шаблона пути. `True` из before-обработчика останавливает дальнейшую обработку. Меньший `priority` выполняется раньше (обратно хукам, см. раздел 15). Заглушка 1.4.5.0-beta вместо kwargs принимает один объект `HandlerInfo(callback, scheme, host, path, required_path_args_names, priority=0, action, whitelist_flags, blacklist_flags, type, categories)` как `info` в `BasePlugin.add_intent_hook(info, type)`. В [code] только 2 файла используют `IntentsManager`.

## 11. Паки иконок `.icons`

Источник: порт `exteraless` (`IconPack`, `IconPackStorage`), не официальный: seen in plugin code only ([port]). Официальной документации формата получить не удалось.

- Контейнер: ZIP-архив с расширением `.icons`. Корень содержит `metadata.json` (до 256 КБ), либо один вложенный каталог верхнего уровня с ним.
- `metadata.json`:
```json
{"schemaVersion":1,"packId":"my_pack","packName":"My pack","author":"...","version":"1.0",
 "icons":{"msg_delete":"icons/delete.png"}}
```
- `packName` обязателен и непуст. `packId` допустим, если непуст, без `/`, `\`, NUL, не `.`/`..`. `version` по умолчанию `"1.0"`.
- Ключи `icons` это имена drawable-ресурсов приложения (`[A-Za-z0-9_]`, напр. `msg_delete`); значения это относительные пути внутри пака, выходить за корень нельзя.
- Лимиты: не более 3000 записей, 100 МБ суммарно распакованных, 10 МБ на файл, степень сжатия не более 250, архив не более 100 МБ; запрещены `..` и абсолютные пути (защита от zip-slip).
- Плагины паки иконок напрямую не ссылаются. Связь только косвенная: плагин указывает `icon="msg_*"` в настройках/меню, а пак подменяет этот drawable на уровне приложения. `__icon__` относится к стикерам (2.1).

## 12. Уведомления и диалоги (`ui.bulletin`, `ui.alert`)

`BulletinHelper` (confirmed in docs; методы классовые). Длительности: `DURATION_SHORT=1500`, `DURATION_LONG=2750`, `DURATION_PROLONG=5000` мс.

| Метод | Подпись |
|---|---|
| `show_info` / `show_error` / `show_success` | `(message, fragment=None)` |
| `show_simple` | `(text, icon_res_id, fragment=None)` |
| `show_two_line` | `(title, subtitle, icon_res_id, fragment=None)` |
| `show_with_button` | `(text, icon_res_id, button_text, on_click, fragment=None, duration=DURATION_LONG)` |
| `show_undo` | `(text, on_undo, on_action=None, subtitle=None, fragment=None)` |
| `show_copied_to_clipboard` | `(message=None, fragment=None)` |
| `show_link_copied` | `(is_private_link_info=False, fragment=None)` |
| `show_file_saved_to_gallery` | `(is_video=False, amount=1, fragment=None)` |
| `show_file_saved_to_downloads` | `(file_type_enum_name='UNKNOWN', amount=1, fragment=None)` |

`AlertDialogBuilder(context, progress_style=ALERT_TYPE_MESSAGE, resources_provider=None)` (confirmed in docs). Константы: `ALERT_TYPE_MESSAGE`, `ALERT_TYPE_LOADING`, `ALERT_TYPE_SPINNER`; `BUTTON_POSITIVE`, `BUTTON_NEGATIVE`, `BUTTON_NEUTRAL`. Цепочечные методы: `get_context`, `set_title`, `set_message`, `set_message_text_view_clickable`, `set_view(view, height=-2)`, `set_items(items, listener, icons)`, `set_positive_button/set_negative_button/set_neutral_button(text, listener(builder, which))`, `make_button_red`, `set_on_back_button_listener`, `set_on_dismiss_listener`, `set_on_cancel_listener`, `set_top_image`, `set_top_drawable`, `set_top_animation(res_id, size, auto_repeat, background_color, layer_colors)`, `set_top_animation_is_new`, `set_dim_enabled`, `set_dialog_button_color_key`, `set_blurred_background(blur, blur_behind_if_possible=True)`, `create`, `show`, `dismiss`, `get_dialog`, `get_button`, `set_progress`, `set_cancelable`, `set_canceled_on_touch_outside`.

## 13. `extera_utils.classes` (прокси классов Java)

confirmed in docs (reference/class-proxy.md); детали подписей не вычитаны полностью (заглушка `classes.pyi` на 202 строки не прочитана целиком). Экспорт: `Base`, `java_subclass(cls, *interfaces, custom_name=None)`, декораторы `joverride`, `joverload`, `jmethod`, `jfield`, `jconstructor`, `jpreconstructor`, `jMVELmethod`, `jMVELoverride`, `jclassbuilder`, `jgetmethod`, `jsetmethod`; функции `bind`, `java_class`, `new_instance(init_args=)`, `new_java_instance`, `from_java`; свойства `.java`, `.this`; модификаторы `JA/JNA/JGS/JNGS/JIR/JNIR/JS/JNS`, `JNone`. Построено на DexMaker; собственное имя класса (`custom_name`) требует приложения с кодом >= 66690. В [code] используют ~14 файлов (`java_subclass`) и 6 `from extera_utils.classes import Base, java_subclass, joverride`.

Прямое использование Chaquopy: `from java import jclass, dynamic_proxy, jarray, jint ...` (в ~150-170 файлах) для вызова Java-классов приложения (`org.telegram.messenger.*`, `org.telegram.ui.*`, `android.*`).

## 14. Формат Elyx (`.elyx`, `.eaf`)

confirmed in docs (reference/elyx.md); ядро NagramXF `_plugin_engine` ([engine]) лишь слабая реимплементация. Требует SDK >= 1.4.5.3.

- Пакет: ZIP-совместимый, расширения `.elyx`, `.eaf`, `.elyx.zip`, `.eaf.zip`, файлы лежат в корне архива (без обёртки-каталога). Хост NagramXF принимает `.plzip`, `.zip`, `.eaf`, `.elyx`.
- `refmap.yml` (также `.yaml` / `.json`): ключи `metainfo`, `main` (по умолчанию `main.py`), `assets`, `strings`, `wheels`.
- `metainfo.yml`: `id` (2-32 ASCII буквы/цифры/`_`), `name`, `description` (поддерживает плейсхолдеры `{locale_key}`), `author`, `version`, `icon`, `app_version`, `sdk_version`, `requirements` (строка через запятую), `requires` (словарь `id -> "(min_version)" -> ссылка на скачивание`), `min_version` (устар.).
- Публичный API `from elyx import ...`: `Asset, AssetNotFoundException, Assets, AssetsDirNotFoundException, Callback, Callback2, Callback3, CallbackReturn, LazyDict, OnClickListener, Runnable, SettingsController, Strings, gen, gen2, get_environment, import_module, mvel_execute` и динамические `assets, metainfo, refmap, settings, strings`.
- `Assets`: доступ как атрибут / `[]` / `get`; методы `content_bytes/string/json/yaml/content`, `to_drawable`, `to_image_location`, `to_bitmap_drawable`, `to_svg_drawable`, `to_svg_bitmap`, `to_lottie_drawable`, `to_svg_thumb`; `Asset.from_path`, `Asset.temp_asset_from_url`.
- `Strings`: файлы `strings_<locale>.yml` (локаль = часть после последнего `_`), форматы yaml/yml/json/py; откат: локаль -> `en` -> ключ; есть `pluralize`, `get_with_locale`.
- `SettingsController`: `get_setting`, `set_setting`, `get_settings`, `clear_settings`, доступ как у словаря.
- Зарезервированные корни модулей (нельзя использовать в пакете плагина): `android, androidx, base_plugin, client_utils, com, de, elyx, hook_utils, importlib, java, org, ui`. Пространство имён плагина `ElyxPlugins.<id>`.
- ElyxBuilder (`pip install ElyxBuilder`): `elyb new [-g -n NAME -a AUTHOR --zipformat elyx]`, `elyb build --ast|--compile N -v -nf`, `elyb watch N --args`, `elyb add-ignore` / `del-ignore`, `elyb stats`; результат в `builds/`, последняя сборка `builds/latest.eaf`.
- Dev-сервер: `127.0.0.1:42690`, JSON с полями `"@"` (команда) и `"#"` (id запроса). Команды: `ping, get_plugins, enable_plugin, disable_plugin, reload_plugin, write_plugin, remove_plugin, start_debugger, stop_debugger` (platform `vscode`/`pycharm`), для Elyx `elyx_ping, get_elyx_plugins, elyx_compare_folder, elyx_changes`. Заглушка `DevServer.start_server/stop_server/setup_remote_debugging`.

## 15. Расхождения между источниками

1. `__app_version__` / `__sdk_version__`: есть в документах/плагинах/движке, но нет в `PluginMetadata` заглушки; README PrimeGram утверждает, что читается только `min_version`. Поддерживайте оба.
2. Intents: kwargs (docs) против `HandlerInfo` (заглушка 1.4.5.0-beta).
3. Приоритеты: хуки сортируются по убыванию (больший первым); для intents меньший `priority` первым.
4. `CANCEL` pre-request: молча без callback ([engine]) против ошибки -2000 (PrimeGram-док).
5. Порядок полей `HookResult`: см. раздел 3.1.
6. Версия SDK: 1.4.4.3 (навык) против 1.4.5.0-beta (заглушки).
7. `__icon__` часто путают с паками `.icons`; это разные вещи (2.1, 11).

## 16. Топ-40 самых частых вызовов API

Корпус: 511 уникальных (по md5) Python-файлов, импортирующих `base_plugin`, из репозиториев: packit-repos/packit-testovoe (основная масса, 341 до дедупликации), fan-world-me/extragram_plugins, shareui/packit и packit-source, FonarikApp, makarworld/awesome-telegram-plugins, cryptexctl/psiphon, corerudo/for-vibecoders, lyaaz, The-MoonTg-project, Miracle-Studios/MSLib, MKultra6969 (2), Th3Nekit, mr-Vestr, repinek/LegacyGram, 0x11DFE, AlexeiCrystal. Исключены: документация-навык, заглушки, реимплементации SDK (NagramXF, exteraless). Репозитории AyugramTop/Plugins и ageekapple не содержат кода плагинов. Часть файлов в packit-testovoe это разные версии/форки одних и тех же плагинов, поэтому места в рейтинге смещены в сторону «пакитовых» плагинов. Метрика: число файлов, где встречается; в скобках общее число упоминаний. Метаданные (`__id__`, `__name__` и т. п.) не считаются вызовами и вынесены в раздел 2.

| # | Вызов / символ | Файлов (всего упоминаний) |
|---|---|---|
| 1 | `BasePlugin` (наследование) | 488 (1028) |
| 2 | `on_plugin_load` | 481 (483) |
| 3 | `log(...)` (`android_utils.log` / `self.log`) | 373 (6061) |
| 4 | `create_settings` | 366 (370) |
| 5 | `get_setting(...)` | 346 (4563) |
| 6 | `ui.settings.Header` | 330 (1190) |
| 7 | `run_on_ui_thread` | 326 (3405) |
| 8 | `on_plugin_unload` | 316 |
| 9 | `get_last_fragment` | 311 (1499) |
| 10 | `BulletinHelper` | 289 (3492) |
| 11 | `ui.settings.Divider` | 278 (1202) |
| 12 | `ui.settings.Switch` | 252 (1240) |
| 13 | `hook_utils.find_class` | 250 (2433) |
| 14 | `MethodHook` | 236 (1117) |
| 15 | `ui.settings.Text` | 228 (1331) |
| 16 | `BulletinHelper.show_error` | 219 (1618) |
| 17 | `set_setting(...)` | 203 (1401) |
| 18 | `hook_method(...)` | 199 (837) |
| 19 | `HookResult(...)` | 195 (1322) |
| 20 | `BulletinHelper.show_info` | 187 (877) |
| 21 | `ui.settings.Input` | 186 (812) |
| 22 | `on_send_message_hook` | 180 |
| 23 | `add_on_send_message_hook(...)` | 173 (174) |
| 24 | `dynamic_proxy` (Chaquopy) | 173 (1028) |
| 25 | `AlertDialogBuilder` | 168 (896) |
| 26 | `MenuItemData` / `MenuItemType` | 153 (377 / 381) |
| 27 | `BulletinHelper.show_success` | 152 (625) |
| 28 | `jclass` (Chaquopy) | 150 (2095) |
| 29 | `add_menu_item(...)` | 147 (222) |
| 30 | `HookStrategy.CANCEL` | 140 (453) |
| 31 | `hook_utils.get_private_field` | 139 (1468) |
| 32 | `ui.settings.Selector` | 138 (431) |
| 33 | `client_utils.run_on_queue` | 125 (345) |
| 34 | `unhook_method(...)` | 117 (245) |
| 35 | `hook_all_methods(...)` | 107 (383) |
| 36 | `get_messages_controller()` | 94 (336) |
| 37 | `HookStrategy.MODIFY` | 88 (205) |
| 38 | `OnClickListener(...)` | 82 (504) |
| 39 | `client_utils.send_message(...)` | 77 (201) |
| 40 | `send_request(...)` / `RequestCallback` | 57 (143) / 36 (84) |

Ниже границы (для ориентира): `EditText` 57, `create_sub_fragment` 57, `parse_markdown` 53, `get_user_config` 46, `set_private_field` 46, `copy_to_clipboard` 46, `MethodReplacement` 38, `get_send_messages_helper` 36, `add_hook` 34, `OnLongClickListener` 33, `on_app_event` 27, `get_account_instance` 26, `on_update_hook` 20, `Custom` 15, `post_request_hook` 13, `pre_request_hook` 12, `hook_all_constructors` 12, `on_updates_hook` 9, `IntentsManager` 2 (файла).

Прочее по [code]: наиболее часто ищут через `find_class`: `java.lang.Boolean` (100), `AndroidUtilities` (58), `ChatActivity` (49), `Theme` (48), `ApplicationLoader` (48), `LaunchActivity` (46), `MessagesController` (40), `PluginSettingsActivity` (36). Самые частые Java-импорты: `org.telegram.messenger` (721), `android.view` (307), `android.widget` (293), `java.lang` (252), `org.telegram.ui.ActionBar` (250), `com.exteragram.messenger.plugins` (119).

## 17. Пробелы и непроверенное

- Сам сайт docs недоступен; всё помечено «confirmed in docs» через навык-пересказ и заглушки 1.4.5.0-beta, а не по оригинальным страницам.
- Формат `.icons` взят из стороннего порта; официальная схема может отличаться. Как хост подставляет иконку пака в UI, не проверено.
- Точная раскладка хранилища настроек официального приложения и точный набор ключей контекста меню по типам не подтверждены (взяты из NagramXF).
- Поля `SendMessageParams` взяты из исходников форков, в реальных версиях приложения набор может отличаться.
- `extera_utils.classes` и часть `elyx_runtime` описаны по краткому референсу; полный разбор `classes.pyi` и реализации `exteraless` не завершён.
- Заглушки `*.pyi` могут отставать от реальных (пример: `__app_version__`).
- Рейтинг частоты искажён дублирующимися версиями в `packit-testovoe` и отсутствием крупных официальных коллекций.
