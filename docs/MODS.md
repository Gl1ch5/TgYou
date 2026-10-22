# Моды

Мод — Python-плагин (Chaquopy 17, Python 3.13) из ZIP: `manifest.json` + `main.py` с функцией `on_load(api)`.
Полный доступ к приложению, без песочницы и разрешений.

Окно «Моды» (TgYou → Моды): вкладки «Маркетплейс» (установить / обновить / удалить / настройки, тап — описание),
«Установленные» (вкл/выкл, настройки, удалить), «Создать мод» (документация, архив SDK для ИИ-агента, установка из ZIP).

Код: `com.tgyou.mods` (`ModManifest`, `ModStore`, `ModRuntime`, `PyMod`, `ModApi`, `ModPages`, `MarketClient`),
UI: `ui/ModsActivity`, `ui/ModPageActivity`, `ui/ModCell`. Моды лежат в `files/mods/<id>/`.
Тестовый мод `stats` (assets/mods/stats) — страница «Статистика» и пункт меню сообщения.
Справка по API и шаблон: `TMessagesProj/src/main/assets/mod-sdk/` (отдаётся кнопкой «Скачать архив для агента»).
Маркетплейс: см. MARKETPLACE.md.
