"""Runtime of the exteraGram compatibility layer: settings storage, hook dispatch, logging."""
import json
import threading

current_api = None
hook_account = None


def log(plugin, message):
    api = getattr(plugin, "_api", None) or current_api
    if api is not None:
        api.log(str(message))


def _spec(plugin, key):
    return plugin._schema.get(key)


def get_setting(plugin, key, default=None):
    api = plugin._api
    spec = _spec(plugin, key)
    kind = spec[0] if spec else None
    if default is None and spec:
        default = spec[2]
    if api is None:
        return default
    try:
        if kind == "switch":
            return api.getBool(key, bool(default))
        if kind == "selector":
            items = spec[3]
            stored = api.getString(key, "")
            if stored in items:
                return items.index(stored)
            return default
        stored = api.getString(key, "\u0000")
        if stored == "\u0000":
            return default
        if kind == "input":
            return stored
        try:
            return json.loads(stored)
        except Exception:
            return stored
    except Exception as e:
        log(plugin, "get_setting " + key + ": " + str(e))
        return default


def set_setting(plugin, key, value):
    api = plugin._api
    if api is None:
        return
    spec = _spec(plugin, key)
    kind = spec[0] if spec else None
    if kind == "switch":
        api.putBool(key, bool(value))
    elif kind == "selector":
        items = spec[3]
        api.putString(key, items[int(value)] if 0 <= int(value) < len(items) else str(value))
    elif kind == "input":
        api.putString(key, str(value))
    else:
        api.putString(key, value if isinstance(value, str) else json.dumps(value))


class SendParams:
    """Wraps SendMessageParams so a plugin can read and edit message/peer/..."""

    def __init__(self, java):
        object.__setattr__(self, "_java", java)

    def __getattr__(self, name):
        return getattr(object.__getattribute__(self, "_java"), name)

    def __setattr__(self, name, value):
        setattr(object.__getattribute__(self, "_java"), name, value)


def dispatch_send(plugin, account, java_params):
    from base_plugin import HookStrategy
    handler = getattr(plugin, "on_send_message_hook", None)
    if handler is None:
        return False
    wrapped = SendParams(java_params)
    global hook_account
    hook_account = account
    try:
        result = handler(account, wrapped)
    except Exception as e:
        log(plugin, "on_send_message_hook: " + repr(e))
        return False
    if result is None:
        return False
    strategy = getattr(result, "strategy", None)
    if strategy == HookStrategy.CANCEL:
        return True
    modified = getattr(result, "params", None)
    if strategy in (HookStrategy.MODIFY, HookStrategy.MODIFY_FINAL) and modified is not None and modified is not wrapped:
        try:
            java_params.message = modified.message
        except Exception as e:
            log(plugin, "modify: " + repr(e))
    return False


def run_async(fn, delay=0):
    def body():
        try:
            fn()
        except Exception as e:
            if current_api is not None:
                current_api.log("async: " + repr(e))

    if delay:
        t = threading.Timer(delay / 1000.0, body)
    else:
        t = threading.Thread(target=body)
    t.daemon = True
    t.start()


# --- TL request / response / update hooks ---------------------------------------

def _short(java_obj):
    name = java_obj.getClass().getSimpleName()
    return name


def _norm(n):
    return n[3:] if n.startswith("TL_") else n


def _match(plugin, name):
    for hook, sub in plugin._hooks:
        if hook == name or _norm(hook) == _norm(name) or (sub and hook in name):
            return True
    return False


def _is_cancel(result):
    from base_plugin import HookStrategy
    return result is not None and getattr(result, "strategy", None) == HookStrategy.CANCEL


def _account():
    from java import jclass
    return jclass("org.telegram.messenger.UserConfig").selectedAccount


def install_tl_hooks(plugin):
    api = plugin._api
    if plugin._tl_installed or api is None:
        return
    plugin._tl_installed = True

    def pre(name, request):
        handler = getattr(plugin, "pre_request_hook", None)
        if handler is None or not _match(plugin, name):
            return False
        global hook_account
        hook_account = _account()
        try:
            result = handler(name, _account(), request)
        except Exception as e:
            log(plugin, "pre_request_hook: " + repr(e))
            return False
        if _is_cancel(result):
            return True
        new = getattr(result, "request", None) if result is not None else None
        if new is not None and new is not request:
            _copy_fields(new, request)
        return False

    def post(account, request, response, error):
        handler = getattr(plugin, "post_request_hook", None)
        name = _short(request)
        if handler is None or not _match(plugin, name):
            return None
        global hook_account
        hook_account = account
        try:
            result = handler(name, account, response, error)
        except Exception as e:
            log(plugin, "post_request_hook: " + repr(e))
            return None
        new = getattr(result, "response", None) if result is not None else None
        return new if new is not None and new is not response else None

    def updates(container):
        dropped = False
        h_all = getattr(plugin, "on_updates_hook", None)
        h_one = getattr(plugin, "on_update_hook", None)
        account = _account()
        global hook_account
        hook_account = account
        cname = _short(container)
        if h_all is not None and _match(plugin, cname):
            try:
                if _is_cancel(h_all(cname, account, container)):
                    return True
            except Exception as e:
                log(plugin, "on_updates_hook: " + repr(e))
        if h_one is None:
            return False
        singles = []
        try:
            lst = container.updates
            for i in range(lst.size()):
                singles.append(lst.get(i))
        except Exception:
            pass
        try:
            if container.update is not None:
                singles.append(container.update)
        except Exception:
            pass
        for upd in singles:
            uname = _short(upd)
            if not _match(plugin, uname):
                continue
            try:
                result = h_one(uname, account, upd)
            except Exception as e:
                log(plugin, "on_update_hook: " + repr(e))
                continue
            if _is_cancel(result):
                try:
                    container.updates.remove(upd)
                except Exception:
                    dropped = dropped or False
        return dropped

    api.hook("request.outgoing", pre)
    api.hook("request.response", post)
    api.hook("updates.incoming", updates)


def _copy_fields(src, dst):
    """A plugin returned a different request object: copy its public fields onto the original."""
    try:
        for f in src.getClass().getFields():
            if not f.getModifiers() & 8:
                f.set(dst, f.get(src))
    except Exception as e:
        if current_api is not None:
            current_api.log("request copy: " + repr(e))


def _icon_res(icon):
    """Drawable name (msg_info) or resource id -> resource id; 0 when unknown."""
    if isinstance(icon, int):
        return icon
    if not icon:
        return 0
    try:
        from java import jclass
        app = jclass("org.telegram.messenger.ApplicationLoader").applicationContext
        return int(app.getResources().getIdentifier(str(icon), "drawable", app.getPackageName()))
    except Exception:
        return 0


# --- menu items -------------------------------------------------------------------

def install_menu(plugin):
    api = plugin._api
    if plugin._menu_installed or api is None:
        return
    plugin._menu_installed = True

    def message_menu(menu):
        for item in sorted(plugin._menu_items, key=lambda i: -(getattr(i, "priority", 0) or 0)):
            if getattr(item, "menu_type", None) != "message_context_menu":
                continue
            ctx = {
                "account": _account(),
                "message": menu.message,
                "messageObject": menu.message,
                "fragment": menu.fragment,
                "dialog_id": menu.message.getDialogId(),
                "dialogId": menu.message.getDialogId(),
            }
            try:
                cond = getattr(item, "condition", None)
                if cond is not None and not cond(ctx):
                    continue
            except Exception as e:
                log(plugin, "menu condition: " + repr(e))
                continue

            def action(item=item, ctx=ctx):
                try:
                    if item.on_click is not None:
                        item.on_click(ctx)
                except Exception as e:
                    log(plugin, "menu click: " + repr(e))

            from client_utils import runnable
            menu.add(str(item.text), _icon_res(item.icon), runnable(action))

    def item_menu(menu):
        for item in sorted(plugin._menu_items, key=lambda i: -(getattr(i, "priority", 0) or 0)):
            if getattr(item, "menu_type", None) != menu.type:
                continue
            user, chat = menu.user, menu.chat
            ctx = {
                "account": _account(),
                "fragment": menu.fragment,
                "dialog_id": menu.dialogId,
                "dialogId": menu.dialogId,
                "user": user,
                "chat": chat,
                "userId": user.id if user is not None else 0,
                "chatId": chat.id if chat is not None else 0,
            }
            try:
                cond = getattr(item, "condition", None)
                if cond is not None and not cond(ctx):
                    continue
            except Exception as e:
                log(plugin, "menu condition: " + repr(e))
                continue

            def action(item=item, ctx=ctx):
                try:
                    if item.on_click is not None:
                        item.on_click(ctx)
                except Exception as e:
                    log(plugin, "menu click: " + repr(e))

            from client_utils import runnable
            menu.add(str(item.text), _icon_res(item.icon), runnable(action))

    api.hook("message.menu", message_menu)
    api.hook("menu.item", item_menu)


def dispatch_app_event(plugin, event):
    handler = getattr(plugin, "on_app_event", None)
    if handler is None:
        return
    try:
        handler(event)
    except Exception as e:
        log(plugin, "on_app_event: " + repr(e))


def button_action(plugin, item):
    def run(_value):
        try:
            item.on_click(None)
        except TypeError:
            item.on_click()
        except Exception as e:
            log(plugin, "on_click: " + repr(e))
    return run


def change_action(plugin, item):
    def run(value):
        try:
            if item.kind == "switch":
                value = value == "true"
            elif item.kind == "selector":
                opts = [str(x) for x in (getattr(item, "items", None) or [])]
                value = opts.index(value) if value in opts else value
            item.on_change(value)
        except Exception as e:
            log(plugin, "on_change " + str(item.key) + ": " + repr(e))
    return run


def add_drawer_item(plugin, item):
    api = plugin._api

    def run():
        if item.on_click is not None:
            item.on_click({"account": _account()})
    api.addMenuAction(str(item.text), run)
