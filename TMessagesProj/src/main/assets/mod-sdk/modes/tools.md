# РЕЖИМ: ИНСТРУМЕНТЫ, ИИ И АВТОМАТИЗАЦИЯ

Пользователь хочет полезный инструмент: расшифровка и перевод, запросы к внешним API и нейросетям, автоответы, напоминания, статистика, утилиты. Делай мод с категорией `tools` или `ai`.

Главные инструменты:
- `import requests` (единственный сторонний пакет): запросы к API ТОЛЬКО в фоновом потоке `threading.Thread(daemon=True)`, `timeout=10`, ключи — в `settings` с типом `secret`.
- Вывод результата: `api.toast(текст)` из любого потока (безопасно), либо через `AndroidUtilities.runOnUIThread` для изменения интерфейса; длинные результаты — на страницу мода `api.add_page`.
- Вход в мод: `message.menu` (действие над выбранным сообщением: перевести, пересказать, в заметку), `api.add_button(...)` (кнопка на экране), `api.addMenuAction(...)` (пункт на странице TgYou), `settings` с `button` (запуск по нажатию).
- Данные: настройки (`getString/putString`), для списков — JSON в строке настройки или `sqlite3` в каталоге `context.getFilesDir()`.
- События приложения: `app.event` (`app_start`, `app_resume`, `app_pause`, `app_stop`) — для периодических задач (но таймеры в фоне не держи без нужды).

Правила режима:
- Отправляя текст сообщений во внешний сервис, делай это ТОЛЬКО по явному действию пользователя (нажатие пункта меню/кнопки) и скажи об этом в `description`.
- Показывай состояние: «Загрузка…» через toast, ошибки — понятным текстом на русском, исключения в `api.log`.
- Не храни ключи в коде; не отправляй ничего без ключа/настройки: если ключ пуст — покажи toast «Укажите ключ в настройках мода».

Заготовка TO-1 — перевод выбранного сообщения через внешний API по нажатию в меню (адрес API и ключ — в настройках):
=== manifest.json ===
{"id":"ask_ai","name":"Спросить ИИ","version":"1.0.0","api_version":1,"description":"Пункт «Спросить ИИ» в меню сообщения: отправляет текст сообщения по нажатию на ваш OpenAI-совместимый адрес и показывает ответ.","category":"ai","author":"TgYou","entry":"main.py","settings":[{"type":"header","title":"API"},{"type":"text","key":"url","title":"Адрес (…/v1/chat/completions)","default":""},{"type":"secret","key":"key","title":"Ключ API"},{"type":"text","key":"model","title":"Модель","default":""}]}
=== main.py ===
import threading

import requests


def on_load(api):
    def ask(text):
        try:
            url = (api.getString("url", "") or "").strip()
            key = (api.getString("key", "") or "").strip()
            model = (api.getString("model", "") or "").strip()
            if not url or not key or not model:
                api.toast("Укажите адрес, ключ и модель в настройках мода")
                return
            api.toast("Спрашиваю ИИ…")
            r = requests.post(url, timeout=30,
                              headers={"Authorization": "Bearer " + key},
                              json={"model": model, "messages": [{"role": "user", "content": text}]})
            data = r.json()
            api.toast(str(data["choices"][0]["message"]["content"])[:400])
        except Exception as e:
            api.log("ask: %s" % e)
            api.toast("Ошибка запроса: %s" % e)

    def menu(m):
        def tap():
            text = str(m.message.messageText or "")
            threading.Thread(target=ask, args=(text,), daemon=True).start()
        m.add("Спросить ИИ", api.icon("bot"), tap)

    api.hook("message.menu", menu)
