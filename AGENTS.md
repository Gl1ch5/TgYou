# Telegram You (TgYou) — руководство для агента

Читай этот файл целиком перед работой. Он хранит всё, что нужно, чтобы продолжить проект без расспросов. Язык общения с владельцем — русский.

## Что это
Форк официального Android-клиента Telegram (`DrKLO/Telegram`, версия 13.0.3) под названием **Telegram You**, `applicationId = com.tgyou.app`. Цель: клиент с системой плагинов, где **всё — плагины** (встроенные на Java и внешние на Python), плюс маркетплейс плагинов и функции из AyuGram и exteraGram. Владелец тестирует на **OnePlus 15R (arm64-v8a)**.

Репозиторий: `Gl1ch5/TgYou` (GitHub). Рабочая ветка: `ccr-baf0fc46-m69tv7`. Ветки `main` в репозитории **нет** (репо создавался пустым), поэтому PR открыть было нельзя — спроси владельца, создавать ли `main`.

## Решения владельца (не пересматривать без причины)
- Всё реализуется плагинами; «официальные» функции — те же плагины, только встроенные (Java, `com.tgyou.plugins`).
- Внешние плагины **только на Python**, **полная свобода**: без песочницы и без системы прав. Допустимы только: предупреждение при установке, изоляция падений плагина, безопасный режим, ограничение частоты запросов к Telegram в ядре (защита единственного `api_id`).
- Ключи ИИ (Groq/Whisper) вводит **каждый пользователь сам**, на нашей стороне ключей и сервера для этого нет.
- Сборки только под **arm64-v8a** (для бет). Все четыре ABI не помещаются в лимит 2 часа CI.
- Ядро и фичи: повторить функции AyuGram и exteraGram (список ниже).
- Код не менять без запроса, когда владелец просит «подумать» (было такое для архитектуры).

## Секреты и безопасность — важно
- `api_id`/`api_hash` Telegram **никогда не коммитить** и не печатать. В коде они читаются из `System.getenv("TG_API_ID")`/`TG_API_HASH` в `TMessagesProj/build.gradle` → `BuildConfig.TG_API_ID/TG_API_HASH` → `BuildVars`. В CI лежат в **Environment** `TG_API_ID` (секреты `TG_API_ID`, `TG_API_HASH`), job подключён через `environment: TG_API_ID`. Значения знает владелец. `api_hash` всё равно попадает в APK (как у любого клиента); владельцу это объяснено.
- Подпись APK сейчас — публичный ключ апстрима `TMessagesProj/config/release.keystore` (пароль `android`). Для настоящего релиза нужен свой ключ (в секреты). Это открытая задача.
- Токен админа маркетплейса лежит только на сервере в `~/tgyou-market/.env` (права 600). В репозиторий не класть.

## Структура репозитория
- `TMessagesProj/`, `TMessagesProj_App/`, … — исходники Telegram (апстрим). Пакеты `org.telegram.*` **не переименованы** (иначе ломается нативный код).
- `TMessagesProj/src/main/java/com/tgyou/` — **наш код**:
  - `core/` — ядро плагинов: `Plugin`, `PluginHost` (реестр + шина хуков), `PluginContext`, `PluginSettings`, `SettingField`, `Hooks` (каталог хуков), `TgYouHooks` (единственная точка входа для кода Telegram).
  - `plugins/` — встроенные плагины (`BuiltinPlugins.create()` — список): `LocalPremiumPlugin`, `WhisperTranscribePlugin`.
  - `ui/TgYouSettingsActivity` — экран настроек «TgYou» (пункт в `SettingsActivity`, row id 100).
- `backend/` — бэкенд маркетплейса (FastAPI + SQLite), см. `backend/README.md`.
- `.github/workflows/` — `build-beta.yml` (полная сборка + релиз), `compile-check.yml` (только javac, ~4 мин).
- Подмодули (19 шт., `.gitmodules` как в апстриме) — gitlink-и на те же коммиты, что в апстриме. Для Java нужны только `TMessagesProj_Modules/media` и `TMessagesProj/lib/jlatexmath`; остальные — C++.

## Принцип интеграции с кодом Telegram (главное правило)
Чтобы мержить обновления апстрима без боли, в файлах Telegram допускаются **только однострочные хуки** вида `com.tgyou.core.TgYouHooks.xxx(...)`. Вся логика — в `com/tgyou/**`. Не копируй и не переписывай крупные куски кода Telegram.

Текущие точки (все — вызовы `TgYouHooks`):
- `UserConfig.isPremium()` → `TgYouHooks.isPremium(real)` (хук `Hooks.PREMIUM_CHECK`).
- `TranscribeButton.isFreeTranscribeInChat()` → `transcribeAvailable(message)` (`TRANSCRIBE_AVAILABLE`).
- `TranscribeButton.transcribePressed()` → `transcribeRequest(message)` (`TRANSCRIBE_REQUEST`).
- `SettingsActivity` — пункт «TgYou».

Шина: `PluginHost.dispatch(HookPoint<I,O>, input, initial)` прогоняет значение через обработчики включённых плагинов; ошибка в обработчике логируется и не доходит до вызывающего.

## Статус функций
Готово и проверено на телефоне: локальный Premium; распознавание голосовых через Whisper на Groq (свой ключ); экран «TgYou» с переключателями и полями.

Написано, но НЕ проверено на устройстве (в CI проходит только компиляция): вкладки TgYou (`TgYouSettingsActivity` → `TgYouSectionActivity`), режим призрака (`GhostModePlugin`, хук `ConnectionsManager`), сохранение удалённых/правок (`AntiRecallPlugin`, `TgYouDb`, хуки в `MessagesController`, `ChatMessageCell`, меню `ChatActivity`), блок рекламы (`AdBlockPlugin`), скриншоты/стример (`ScreenPrivacyPlugin`, хук `FlagSecureReason`), иконки TgYou + экран выбора (`TgYouIconsActivity`, `LauncherIconController`, алиасы в `AndroidManifest.xml`, ресурсы `icon_tgyou*`, `ic_tgyou*`). Иконка по умолчанию — TgYou, оригинальная Telegram доступна как `TelegramIcon`.

Хуки в файлах Telegram (однострочные): `ConnectionsManager.sendRequestInternal` → `interceptRequest`; `FlagSecureReason.invalidate` → `flagSecure`; `MessagesController` (удаления ×2 → `filterDeleted`, правка → `messageEdited`); `ChatMessageCell` → `messageTime`; `ChatActivity` меню → `extendMessageMenu`/`menuOption`.

План (задачи в порядке приоритета):
1. Каркас вкладок TgYou: главный экран = список разделов (как в AyuGram: Приватность, Сообщения, Фильтры, Интерфейс, ИИ, Плагины, Маркетплейс, О приложении), каждый раздел — отдельный экран. Плагин объявляет свой раздел и типизированные поля (переключатель/текст/секрет).
2. Ghost mode: единый хук в `ConnectionsManager.sendRequestInternal` (блок исходящих запросов по типу: `messages.readHistory`, `channels.readHistory`, `messages.setTyping`, `account.updateStatus`, чтение историй/контента); блокированный запрос получает ответ-ошибку `TGYOU_BLOCKED` в `stageQueue`.
3. Anti-recall + история правок + настраиваемые пометки «удалено»/«изменено» (локальная БД, хуки при обработке `updateDeleteMessages`/`updateDeleteChannelMessages`/`updateEditMessage`).
4. Фильтры сообщений и блок рекламы (спонсорские сообщения).
5. Сохранение чатов после бана/кика, кнопка досрочного сгорания TTL-медиа, скриншоты в секретных чатах, без детекта эмулятора.
6. Из exteraGram/AyuGram: Material You, настраиваемая камера, переработанный плеер, ускорение загрузки, режим стримера, шрифты.
7. Внешние Python-плагины (Chaquopy) + экран маркетплейса в приложении (сверка SHA-256).
8. Перебазировать репозиторий на историю апстрима (сейчас история не общая с `DrKLO/Telegram`, первый мерж даст конфликты везде) и настроить автосинк с апстримом через CI (апстрим публикуется пакетом на релиз).

### Эталон функций (по README, источники проверены)
AyuGram: ghost mode (онлайн, «прочитано», набор), история сообщений, anti-recall, фильтры (реклама), свои пометки изменено/удалено, локальный Premium, сохранение чатов после бана/кика, кнопка сгорания TTL, скриншоты в секретных чатах, без рекламы и без детекта эмулятора, AyuSync (свой сервер), шрифты, режим стримера, переводчик.
exteraGram: много настроек, переработанный плеер, настройки интерфейса, Material You, Material 3, экспериментальное ускорение загрузки, встроенная камера, Python-плагины (вызов Java, запросы, изменение UI). Список хуков их API **не подтверждён** — нужна документация plugins.exteragram.app/docs.

## Сборка и CI
- Полная сборка: `./gradlew :TMessagesProj_App:assembleAfatRelease` (нужны переменные `TG_API_ID`, `TG_API_HASH`). Переменные окружения-переключатели: `TG_ABIS` (по умолчанию все 4 ABI; CI ставит `arm64-v8a`), `TG_FAST=1` (без R8), `TG_PREBUILT_JNI=<dir>` (готовые `<abi>/libtmessages.49.so`, пропускает C++), `TG_CCACHE=1`.
- `build-beta.yml`: нативная библиотека кэшируется (`actions/cache`, ключ — хэш `git ls-tree` для `TMessagesProj/jni`). **Холодная** сборка ~1 час, **с кэшем** должна занимать минуты (оценка, замерить!). Новые пуши не отменяют идущую сборку (`cancel-in-progress: false`), а встают в очередь; релизные запуски (`release_tag`) имеют отдельную группу.
- Релиз: тег пушить с этой среды **нельзя** (прокси даёт 403), поэтому релиз делается запуском workflow вручную с входом `release_tag` (например `v0.1.0-beta1`) через `actions_run_trigger run_workflow`. Релиз `v0.1.0-beta1` ещё не опубликован (первый запуск был отменён моим же пушем).
- APK скачивать из артефакта запуска `telegram-you-beta` (Actions → запуск → Artifacts).
- Локальная проверка Java (быстрая петля): Android SDK ставится в `/home/user/android-sdk` (cmdline-tools → `platforms;android-36`, `build-tools;36.0.0`), подмодули: `git submodule update --init TMessagesProj_Modules/media TMessagesProj/lib/jlatexmath`, затем `ANDROID_HOME=… TG_API_ID=1 TG_API_HASH=x TG_PREBUILT_JNI=/nonexistent TG_FAST=1 ./gradlew :TMessagesProj_App:compileAfatReleaseJavaWithJavac`. Maven Central через прокси иногда отвечает 429 — повторять с паузой (`/home/user/dl/compile.sh`). Среда эфемерная: SDK пропадёт, если контейнер пересоздан.

## Бэкенд маркетплейса и сервер
- Код `backend/`, тесты `pytest` (16 проходят). Формат плагина: zip с `manifest.json` (`id`, `name`, `version`, `api_version`, `description`, `category`, `entry`) и `.py`. Модерация: новые версии `pending`, одобряет админ (`MARKET_AUTO_APPROVE=0`).
- Развёрнут на общем сервере (Ubuntu 24.04, `Server.play2go.cloud`, доступен через MCP-инструменты `mcp__Server__*`), папка `~/tgyou-market/` (клон репозитория в `src/`, `.env`, `run.sh`, данные в `data/`), слушает **только `127.0.0.1:8830`**. Запущен фоново, **не переживает перезагрузку**.
- На сервере чужие сервисы (nginx на 80/443, redis, uvicorn, xray и др.). **Не трогать их.** Для публикации наружу нужны решения владельца: домен/поддомен и разрешение на vhost nginx + systemd-сервис (sudo). Эти вопросы заданы владельцу, ответа пока нет.

## Подводные камни
- Не печатай и не коммить секреты (см. выше).
- `git push` тегов блокируется прокси (403) — не пытайся обойти.
- Нативная часть собирается только в CI (локально нет NDK/CMake/места).
- Хуки в чужих файлах — одна строка, иначе мержи апстрима превратятся в боль.
- Всё, что видит пользователь в настройках, держи в `com/tgyou/ui`, а не в файлах Telegram.
- Новые действия на общем сервере и публикации наружу согласуй с владельцем.
