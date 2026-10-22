"""Runtime of the exteraGram compatibility layer: settings storage, hook dispatch, logging."""
import json
import threading

current_api = None


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
