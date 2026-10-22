# Архитектура

## Принцип

Клиент — форк DrKLO/Telegram 13.0.3. Пакеты `org.telegram.*` не переименованы, чтобы обновления оригинала сливались без конфликтов. Весь наш код лежит в `TMessagesProj/src/main/java/com/tgyou/`. В файлах Telegram допустимы только **однострочные вызовы `TgYouHooks.*`**; логика живёт у нас.

```
com.tgyou
├── core/     ядро: PluginHost, Plugin, Hooks, настройки, база tgyou.db, TgYouHooks (мост из кода Telegram)
├── plugins/  встроенные плагины (на Java)
├── ui/       экраны настроек TgYou
└── update/   обновление из релизов GitHub
```

## Поток данных

```
код Telegram ──TgYouHooks.xxx(...)──► PluginHost.dispatch(HookPoint, input, initial)
                                         │  идёт по включённым плагинам в порядке регистрации
                                         ▼
                                   HookHandler.handle(input, value) → новое value
```

- `dispatch` передаёт значение по цепочке обработчиков; результат последнего возвращается вызывающему коду.
- Исключение в обработчике логируется (`FileLog`) и пропускается: плагин не может уронить Telegram.
- Выключенный плагин не получает вызовов, его обработчики остаются зарегистрированными.
- `PluginHost.get()` создаётся лениво из `ApplicationLoader.applicationContext` и возвращает `null`, пока контекста нет. Поэтому `TgYouHooks` при `null` возвращает исходное значение.

## Настройки

`SharedPreferences` с именем `tgyou_plugins`. Ключи: `<id>.enabled` и `<id>.<key>`. Доступ плагина — через `PluginSettings` (`getString/putString/getBoolean/putBoolean`), область видимости ограничена префиксом `<id>.`.

## Точки врезки в код Telegram

Каждая — одна строка. При слиянии оригинала проверяйте именно их.

| Файл | Место | Вызов | Хук |
|---|---|---|---|
| `tgnet/ConnectionsManager.java` | `sendRequestInternal`, до отправки | `TgYouHooks.interceptRequest` | `OUTGOING_REQUEST` |
| `ui/Components/FlagSecureReason.java` | `invalidate` | `TgYouHooks.flagSecure` | `FLAG_SECURE` |
| `messenger/MessagesController.java` | обработка `updateDeleteMessages` и `updateDeleteChannelMessages` перед `deletedMessages.addAll` | `TgYouHooks.filterDeleted` | `MESSAGES_DELETED` |
| `messenger/MessagesController.java` | после `MessageObject.getDialogId(message);` в обработке правки | `TgYouHooks.messageEdited` | `MESSAGE_EDITED` |
| `ui/Cells/ChatMessageCell.java` | перед вычислением `timeTextWidth` | `TgYouHooks.messageTime` | `MESSAGE_TIME` |
| `ui/ChatActivity.java` | перед `scrimPopupWindowItems = new ActionBarMenuSubItem[...]` | `TgYouHooks.extendMessageMenu` | `MESSAGE_MENU` |
| `ui/ChatActivity.java` | начало `processSelectedOption` | `TgYouHooks.menuOption` | выполняет пункт меню плагина |
| `messenger/UserConfig.java` | `isPremium` | `TgYouHooks.isPremium` | `PREMIUM_CHECK` |
| `ui/Components/TranscribeButton.java` | проверка доступности и запуск | `TgYouHooks.transcribeAvailable/transcribeRequest` | `TRANSCRIBE_*` |
| `ui/SettingsActivity.java` | строка 100 списка | открывает `TgYouSettingsActivity` | — |

### Заблокированный запрос

Если плагин вернул `true` из `OUTGOING_REQUEST`, запрос не уходит в сеть. Если у запроса был колбэк, он получает `TL_error{code=400, text="TGYOU_BLOCKED"}` через `Utilities.stageQueue`, как при обычной ошибке.

## Своя база `tgyou.db`

`TgYouDb` хранит то, чего нет в базе Telegram. Таблицы:
- `deleted` — сообщения, удалённые сервером, но сохранённые у нас;
- `edits` — прежние тексты изменённых сообщений.

**Ключ диалога:** `-channelId` для каналов, `0` для личных чатов и обычных групп (идентификаторы сообщений там уникальны в пределах аккаунта).

## Экраны

- `TgYouSettingsActivity` — список разделов (`Section`), «Обновления», «Иконка приложения», «Все плагины».
- `TgYouSectionActivity(Section|null)` — плагины раздела; `null` показывает все. Строит переключатели и поля по `Plugin.fields()`.
- `TgYouIconsActivity` — выбор значка запуска (`LauncherIconController`, все значки доступны без Premium).
- `TgYouUpdateActivity` — обновление, см. [UPDATER.md](UPDATER.md).

## Значки запуска

Реализованы как `activity-alias` в `AndroidManifest.xml` + enum `LauncherIcon`. Имя компонента: `ComponentName(packageName, "org.telegram.messenger." + ключ)`. По умолчанию включён `DefaultIcon` (TgYou); `TgYouDarkIcon` — тёмный вариант; `TelegramIcon` и остальные — оригинальные.

## Сборка и CI

Подробности в [AGENTS.md](../AGENTS.md). Коротко: `build-beta.yml` собирает arm64-v8a, нативная часть кэшируется по хешу `TMessagesProj/jni` и `.gitmodules`; `compile-check.yml` проверяет только Java (≈4 минуты). `api_id`/`api_hash` берутся из секретов окружения `TG_API_ID`, в репозиторий не попадают.
