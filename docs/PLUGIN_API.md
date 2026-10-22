# API плагина

Встроенные плагины используют тот же API, что и будущие внешние. Внешние плагины будут на Python (Chaquopy); их API повторит этот каталог хуков (см. [MARKETPLACE.md](MARKETPLACE.md)).

## Интерфейс `Plugin`

```java
public interface Plugin {
    String id();                         // [a-z][a-z0-9_]{2,39}, неизменный: от него зависят ключи настроек
    String name();                       // название в списке
    String description();                // описание под названием
    default Section section()            // вкладка: PRIVACY, MESSAGES, FILTERS, INTERFACE, AI, MISC
    default boolean enabledByDefault()   // включён ли до первого касания переключателя (false)
    default List<SettingField> fields()  // настройки плагина
    void onLoad(PluginContext context);  // один раз при создании PluginHost: регистрация обработчиков
}
```

## Настройки

| Фабрика | Что показывает | Значение |
|---|---|---|
| `SettingField.toggle(key, title, default)` | переключатель | `getBoolean` |
| `SettingField.text(key, title, default)` | поле ввода | `getString` |
| `SettingField.secret(key, title)` | поле с маской для ключей | `getString` |
| `SettingField.choice(key, title, default, options...)` | выбор из списка | `getString` |

Чтение: `context.settings().getBoolean("key", def)`. Значения хранятся в `tgyou_plugins` под ключом `<id>.<key>`.

## Регистрация обработчика

```java
context.on(Hooks.OUTGOING_REQUEST, (request, blocked) -> blocked || shouldBlock(request));
```

Лямбда принимает `(input, value)` и возвращает новое `value`. Её вызывают только пока плагин включён. Верните `value` без изменений, если плагин не касается этого случая.

## Каталог хуков (`Hooks`)

| Хук | Вход | Значение (по умолчанию → результат) | Смысл |
|---|---|---|---|
| `PREMIUM_CHECK` | — | `Boolean` | считать ли аккаунт Premium на клиенте |
| `TRANSCRIBE_AVAILABLE` | `MessageObject` | `Boolean` | предлагает ли плагин расшифровку голосового |
| `TRANSCRIBE_REQUEST` | `MessageObject` | `Boolean` | плагин взял расшифровку на себя (`true`) |
| `OUTGOING_REQUEST` | `TLObject` | `Boolean` (`false`) | `true` — не отправлять запрос в Telegram |
| `FLAG_SECURE` | — | `Boolean` | скрывать ли окно от скриншотов и записи |
| `MESSAGES_DELETED` | `DeletedMessages{account, dialogKey, ids}` | `List<Integer>` | какие id реально удалить локально; остальные остаются |
| `MESSAGE_EDITED` | `EditedMessage{account, message}` | — | новая версия правки до замены сохранённой |
| `MESSAGE_TIME` | `MessageObject` | `CharSequence` | текст времени и статуса в пузыре |
| `MESSAGE_MENU` | `MessageMenu{fragment, message}` | — | добавьте пункты через `menu.add(title, icon, Runnable)` |

Правила написания обработчика:
1. Не блокируйте основной поток. `OUTGOING_REQUEST` вызывается на потоке отправки, `MESSAGE_TIME` — при отрисовке пузыря, поэтому делайте их быстрыми.
2. Не бросайте исключения ради логики: они логируются и пропускаются, значение останется прежним.
3. `OUTGOING_REQUEST`: проверяйте тип запроса по классу (`request instanceof TLRPC.TL_messages_readHistory`). Класс запроса — единственное, что нужно для блокировки.
4. Пункты `MESSAGE_MENU` получают номера с 1000 и выше, не пересекаются со стандартными.

## Пример: свой плагин

```java
public final class HelloPlugin implements Plugin {
    public String id() { return "hello"; }
    public String name() { return "Привет"; }
    public String description() { return "Добавляет пункт в меню сообщения."; }
    public Section section() { return Section.MISC; }

    public void onLoad(PluginContext context) {
        context.on(Hooks.MESSAGE_MENU, (menu, ignored) -> {
            menu.add("Привет", org.telegram.messenger.R.drawable.msg_info,
                     () -> android.widget.Toast.makeText(menu.fragment.getParentActivity(), "Привет", android.widget.Toast.LENGTH_SHORT).show());
            return null;
        });
    }
}
```

Затем добавьте `new HelloPlugin()` в `BuiltinPlugins.create()`.

## Как добавить новый хук

1. Объявите `HookPoint` в `Hooks` с комментарием о входе и значении.
2. Добавьте метод-мост в `TgYouHooks` (получает `PluginHost.get()`, вызывает `dispatch`, при `null` возвращает исходное значение).
3. Вставьте в файл Telegram **одну строку** с вызовом моста.
4. Занесите точку врезки в таблицу [ARCHITECTURE.md](ARCHITECTURE.md) и хук в этот каталог.
