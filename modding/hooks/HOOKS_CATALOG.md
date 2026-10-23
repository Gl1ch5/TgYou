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

## Сводка найденных мест

```
Всего методов с телом: 54353 (публичных/пакетных: 44476)

visual: 28226
   other          14750
   theme          2698
   media          2560
   chat           2150
   stories        2016
   emoji          1383
   call           878
   profile        615
   dialogs        399
   settings       361
   login          252
   network        100
   notifications  64
function: 16250
   network        6357
   other          5285
   media          1673
   chat           755
   call           653
   theme          419
   settings       322
   stories        284
   emoji          161
   notifications  160
   profile        90
   login          64
   dialogs        27

Готовых именованных хуков (Hooks.java): 20
```

Полный список: `python3 modding/hooks/hook_scan.py --json build/hook_catalog.json` или поиск `--find` / `--kind` / `--cat`.
