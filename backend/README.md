# TgYou Marketplace

Бэкенд каталога плагинов для Telegram You. FastAPI + SQLite, без внешних сервисов.

## Запуск

```bash
export MARKET_ADMIN_TOKEN="$(python3 -c 'import secrets;print(secrets.token_urlsafe(32))')"
export MARKET_DATA_DIR=./data
uvicorn app.asgi:app --host 127.0.0.1 --port 8830
```

| Переменная | Назначение |
|---|---|
| `MARKET_ADMIN_TOKEN` | обязательна, минимум 24 символа |
| `MARKET_DATA_DIR` | база и пакеты (по умолчанию `./data`) |
| `MARKET_AUTO_APPROVE` | `1` — публиковать без модерации (по умолчанию `0`) |

## Формат плагина

ZIP с `manifest.json` и Python-файлом:

```json
{
  "id": "ghost_mode",
  "name": "Режим призрака",
  "version": "1.0.0",
  "api_version": 1,
  "description": "Не отправлять «прочитано» и «печатает»",
  "category": "privacy",
  "entry": "main.py"
}
```

Категории: `privacy`, `chat`, `media`, `ui`, `tools`, `ai`, `other`. Лимиты: 2 МБ архив, 10 МБ распакованный, 50 файлов.

## API

Публичное:
- `GET /api/v1/plugins?q=&category=&sort=downloads|updated|name&page=&per_page=`
- `GET /api/v1/plugins/{id}`
- `GET /api/v1/plugins/{id}/download?version=` — заголовок `X-Package-SHA256`
- `POST /api/v1/plugins/{id}/rating` — `{device_id, stars, review}`

Разработчик (`Authorization: Bearer <токен разработчика>`):
- `POST /api/v1/plugins` — multipart, поле `file`

Админ (`Authorization: Bearer <MARKET_ADMIN_TOKEN>`):
- `POST /api/v1/admin/developers` — `{name}`, вернёт токен один раз
- `GET /api/v1/admin/pending`
- `POST /api/v1/admin/plugins/{id}/versions/{version}/approve|reject`

Клиент обязан сверять SHA-256 скачанного пакета с полем `latest.sha256` из каталога.

## Тесты

```bash
pip install -r requirements.txt httpx pytest
pytest
```
