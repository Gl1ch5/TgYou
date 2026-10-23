# Каталог мест для хуков

Сгенерировано `modding/hooks/hook_scan.py` (эвристика по regexp, не компилятор: категории и сигнатуры могут быть неточными).
Любой метод из каталога доступен модам через `hook_method(класс, метод)` (Pine). Готовые именованные хуки — в разделе ниже.

## Готовые именованные хуки (`Hooks.java`)

- `premium.check`
- `transcribe.available`
- `transcribe.request`
- `message.send`
- `request.response`
- `updates.incoming`
- `menu.item`
- `app.event`
- `request.outgoing`
- `window.secure`
- `messages.deleted`
- `messages.edited`
- `message.time`
- `message.menu`
- `message.visible`
- `chat.keep_kicked`
- `secret.screenshot_notice`
- `message.alpha`
- `content.allow_copy`
- `media.keep_ttl`
- `fragment.created`

## Сводка найденных мест

```
Всего методов с телом: 54825 (публичных/пакетных: 44781)

visual: 28447
   other          14917
   theme          2710
   media          2575
   chat           2158
   stories        2021
   emoji          1384
   call           882
   profile        617
   dialogs        401
   settings       365
   login          253
   network        100
   notifications  64
function: 16334
   network        6363
   other          5339
   media          1685
   chat           758
   call           653
   theme          421
   settings       322
   stories        286
   emoji          162
   notifications  160
   profile        90
   login          68
   dialogs        27

Готовых именованных хуков (Hooks.java): 21
```

Полный список: `python3 modding/hooks/hook_scan.py --json build/hook_catalog.json` или поиск `--find` / `--kind` / `--cat`.
