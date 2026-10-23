# Модинг TgYou

Всё, что нужно для разработки модов, в одном месте. Исходники самой системы модов остаются в
`TMessagesProj/src/main/java/com/tgyou/mods/` (их собирает Gradle, поэтому они не переезжают сюда).

| Что | Где |
|---|---|
| Что такое мод, формат `.mod`, установка | [docs/MODS.md](../docs/MODS.md) |
| Полный промпт для нейросети (бандлится в приложение) | `TMessagesProj/src/main/assets/mod-sdk/AI_PROMPT.md` |
| Готовые именованные хуки и каталог мест для новых | [hooks/HOOKS_CATALOG.md](hooks/HOOKS_CATALOG.md) |
| **Готовый полный каталог** (44 476 методов, json + по категориям) | [hooks/catalog/README.md](hooks/catalog/README.md) |
| Сканер мест для хуков | [hooks/hook_scan.py](hooks/hook_scan.py) |
| Справочник `api` | [API.md](API.md) |
| Примеры модов | [examples/](examples/) |

## Быстро

```
python3 modding/hooks/hook_scan.py --summary
python3 modding/hooks/hook_scan.py --kind visual --cat chat --find onDraw
python3 modding/hooks/hook_scan.py --markdown modding/hooks/HOOKS_CATALOG.md   # обновить сводку
python3 modding/hooks/hook_scan.py --catalog modding/hooks/catalog               # пересобрать полный каталог (после обновления Telegram)
```

Пример мода: заархивируй `examples/buttons_everywhere/` (manifest.json + main.py в корне архива) в `.mod`
и установи из раздела «Моды».

## Что дальше развивать

- Хуки: ставить именованные хуки по каталогу, отдельно для визуала и для логики.
- Кнопки: сейчас плавающие и в шапке; позже пункты в меню шапки и строки в списках.
- Страницы мода: сейчас список «название — значение»; нужны переключатели, ползунки, выбор.
