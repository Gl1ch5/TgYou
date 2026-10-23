# Документация Telegram You

| Документ | О чём |
|---|---|
| [ARCHITECTURE.md](ARCHITECTURE.md) | как устроен клиент: ядро плагинов, точки врезки в код Telegram, потоки данных |
| [PLUGIN_API.md](PLUGIN_API.md) | как написать плагин: интерфейс, настройки, каталог хуков |
| [BUILTIN_PLUGINS.md](BUILTIN_PLUGINS.md) | каждый встроенный плагин: что делает, настройки, как работает, ограничения |
| [SETTINGS_SCREENS.md](SETTINGS_SCREENS.md) | экраны «Режим Призрака», «Фильтры», «Шпион», «Основные», «Чаты», «Внешний вид», «Кастомизация», Pill Stack |
| [APPEARANCE.md](APPEARANCE.md) | внешний вид: прозрачность, скругление, быстрая перезагрузка |
| [MODS.md](MODS.md), [ICON_PACKS.md](ICON_PACKS.md), [EXTERA_COMPAT.md](EXTERA_COMPAT.md) | моды (.mod), наборы иконок, совместимость с exteraGram |
| [HOOKS_CATALOG.md](HOOKS_CATALOG.md) | каталог мест для хуков: сканер `tools/hook_scan.py`, готовые хуки, сводка visual/function |
| [UPDATER.md](UPDATER.md) | обновление из релизов GitHub внутри приложения |
| [MARKETPLACE.md](MARKETPLACE.md) | маркетплейс плагинов: сервер, формат пакета, API |
| [../AGENTS.md](../AGENTS.md) | руководство для разработчика и агента: CI, сборка, сервер, подводные камни |

**Правило проекта:** новый плагин, хук или экран не считается готовым, пока он не описан здесь. Статус «проверено на устройстве» указывается явно.
