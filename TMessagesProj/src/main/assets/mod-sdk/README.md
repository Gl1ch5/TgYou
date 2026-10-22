# TgYou mod SDK
A mod = ZIP with `manifest.json` (id `^[a-z][a-z0-9_]{2,39}$`, name, version x.y.z, api_version 1,
description, category privacy|chat|media|ui|tools|ai|other, entry `main.py`) and Python code defining `on_load(api)`.
Python 3.13 (Chaquopy), full access to the app: no sandbox, no permissions.

## api
- `api.hook(name, fn)` names:
  - `request.outgoing` fn(class_name, request) -> truthy blocks the request
  - `message.time` fn(message, time_str) -> str|None
  - `message.menu` fn(menu) ; `menu.add(title, icon, fn)`
  - `message.edited` fn(account, message)
  - `messages.deleted` fn(account, dialog_key, ids) -> ids to keep-delete
  - `premium.check`, `window.secure`
- `api.add_page(title, fn)` fn() -> [(title, value), ...] shown under TgYou -> Mods
- `api.settings_get(key, default)`, `api.settings_put(key, value)`
- `api.toast(text)`, `api.log(text)`, `api.icon(name)`
Java classes are reachable through `from java import jclass`.
See `example_stats/`. Pack: zip the files with manifest.json at the zip root.
