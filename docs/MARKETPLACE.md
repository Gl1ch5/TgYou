# Маркетплейс плагинов

Адрес: `https://grzxk.ru/tgyou/` (nginx проксирует `/tgyou/` на `127.0.0.1:8830`). Сервис: `tgyou-market.service` (systemd, пользователь `claudemcp`, запуск `~/tgyou-market/run.sh`, данные в `~/tgyou-market/data`).

Проверка: `curl https://grzxk.ru/tgyou/health` → `{"ok":true,"api_version":1}`.

Формат пакета, лимиты, модерация и все методы API описаны в [backend/README.md](../backend/README.md). Кратко:
- плагин — ZIP с `manifest.json` и Python-файлом (`entry`);
- публикация создаёт версию в статусе `pending`; администратор одобряет её токеном `MARKET_ADMIN_TOKEN`;
- клиент обязан сверять SHA-256 скачанного пакета с `latest.sha256` каталога (заголовок `X-Package-SHA256`).

## Конфигурация nginx

В `/etc/nginx/sites-available/grzxk.ru` добавлен блок `location /tgyou/` (копия до правки: `grzxk.ru.bak-tgyou`). Остальные `location` не тронуты.

## Статус

Сервер работает и покрыт тестами (`backend/tests`). Клиента маркетплейса и запуска Python-плагинов в приложении пока нет: ждёт интеграции Chaquopy (см. AGENTS.md).
