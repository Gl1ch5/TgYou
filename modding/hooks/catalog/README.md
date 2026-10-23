# Полный каталог мест для хуков

Сгенерировано `hook_scan.py --catalog`. Каждый метод можно перехватить: `api.hook_by_name(класс, имя, before, after, replace)`.
Для вложенных классов имя через `$` (так его понимает Java). Приватные методы не включены. Классификация эвристическая.

Машинный вид: [hooks.json](hooks.json) (поля: class, method, params, returns, kind, category, static).

| Вид | Категория | Методов | Файл |
|---|---|---|---|
| function | call | 653 | [function_call.md](function_call.md) |
| function | chat | 755 | [function_chat.md](function_chat.md) |
| function | dialogs | 27 | [function_dialogs.md](function_dialogs.md) |
| function | emoji | 161 | [function_emoji.md](function_emoji.md) |
| function | login | 64 | [function_login.md](function_login.md) |
| function | media | 1673 | [function_media.md](function_media.md) |
| function | network | 6357 | [function_network.md](function_network.md) |
| function | notifications | 160 | [function_notifications.md](function_notifications.md) |
| function | other | 5285 | [function_other.md](function_other.md) |
| function | profile | 90 | [function_profile.md](function_profile.md) |
| function | settings | 322 | [function_settings.md](function_settings.md) |
| function | stories | 284 | [function_stories.md](function_stories.md) |
| function | theme | 419 | [function_theme.md](function_theme.md) |
| visual | call | 878 | [visual_call.md](visual_call.md) |
| visual | chat | 2150 | [visual_chat.md](visual_chat.md) |
| visual | dialogs | 399 | [visual_dialogs.md](visual_dialogs.md) |
| visual | emoji | 1383 | [visual_emoji.md](visual_emoji.md) |
| visual | login | 252 | [visual_login.md](visual_login.md) |
| visual | media | 2560 | [visual_media.md](visual_media.md) |
| visual | network | 100 | [visual_network.md](visual_network.md) |
| visual | notifications | 64 | [visual_notifications.md](visual_notifications.md) |
| visual | other | 14750 | [visual_other.md](visual_other.md) |
| visual | profile | 615 | [visual_profile.md](visual_profile.md) |
| visual | settings | 361 | [visual_settings.md](visual_settings.md) |
| visual | stories | 2016 | [visual_stories.md](visual_stories.md) |
| visual | theme | 2698 | [visual_theme.md](visual_theme.md) |
