# РЕЖИМ: СЕТЬ, ЗАПРОСЫ И ОБНОВЛЕНИЯ

Пользователь хочет наблюдать или менять обмен с сервером Telegram: логировать запросы, фильтровать обновления, подменять ответы. Делай мод с категорией `tools` (или `privacy`, если мод про скрытие).

Главные инструменты:
- `request.outgoing` — `fn(class_name, request)`: truthy блокирует запрос. `request.response` — `fn(account, request, response, error)`: вернуть подменённый TLObject или None. `updates.incoming` — `fn(updates)`: truthy отбрасывает пакет обновлений.
- Перехват методов: `api.hook_by_name("org.telegram.tgnet.ConnectionsManager", "sendRequest", before, after, None)` (методы `sendRequest(TLObject, RequestDelegate[, flags[, connectionType]])`), `sendRequestTyped`. Для обработки новых сообщений: `org.telegram.messenger.NotificationsController.processNewMessages`.
- Свои запросы к серверу Telegram: `ConnectionsManager.getInstance(acc).sendRequest(req, callback)`; делай их только если точно знаешь класс запроса `org.telegram.tgnet.TLRPC$TL_...` и его поля (проверь в каталоге/по именам). При сомнении ограничься наблюдением.

Правила режима:
- Блокировка и подмена — самый опасный приём. Блокируй только по точному имени класса запроса, по `toggle`, и пиши в `description`, что именно перестанет работать. Не блокируй запросы авторизации, получения обновлений и подтверждения доставки.
- Логируй редко и коротко (`api.log`), только имена классов; не пиши в журнал содержимое сообщений и номера телефонов.
- Внутри хуков запросов — никакой сети и `sleep`; журнал/статистику копи в память и показывай через `api.add_page`.

Заготовка NE-1 — страница со статистикой исходящих запросов:
=== manifest.json ===
{"id":"req_stats","name":"Статистика запросов","version":"1.0.0","api_version":1,"description":"Считает исходящие запросы по типам и показывает топ на странице мода.","category":"tools","author":"TgYou","entry":"main.py"}
=== main.py ===
counts = {}


def rows():
    top = sorted(counts.items(), key=lambda kv: -kv[1])[:30]
    return [(name, str(n)) for name, n in top] or [("Пока нет данных", "")]


def on_load(api):
    def outgoing(class_name, request):
        try:
            counts[class_name] = counts.get(class_name, 0) + 1
        except Exception:
            pass
        return False

    api.hook("request.outgoing", outgoing)
    api.add_page("Запросы", rows)
