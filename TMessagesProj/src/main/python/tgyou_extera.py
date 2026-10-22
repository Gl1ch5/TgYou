"""Loads exteraGram .plugin files (single Python file) as TgYou mods."""
import importlib.util
import json
import re
import sys

import tgyou_extera_rt as rt


def _exec(path, name):
    spec = importlib.util.spec_from_file_location(name, path)
    module = importlib.util.module_from_spec(spec)
    sys.modules[name] = module
    spec.loader.exec_module(module)
    return module


def _plugin_class(module):
    from base_plugin import BasePlugin
    for value in vars(module).values():
        if isinstance(value, type) and issubclass(value, BasePlugin) and value is not BasePlugin:
            return value
    return None


def _flatten(items, depth=0):
    """Settings in display order. Text items with create_sub_fragment are expanded under their own header."""
    out = []
    for it in items or []:
        k = getattr(it, "kind", None)
        sub = getattr(it, "create_sub_fragment", None)
        if k == "text" and callable(sub) and depth < 2:
            out.append(_Header(str(getattr(it, "text", ""))))
            try:
                out.extend(_flatten(sub(), depth + 1))
            except Exception as e:
                rt.log(None, "create_sub_fragment: " + repr(e))
            continue
        out.append(it)
    return out


class _Header:
    kind = "header"
    key = None

    def __init__(self, text):
        self.text = text


def _name_buttons(items):
    n = 0
    for it in items:
        if getattr(it, "kind", None) == "text" and callable(getattr(it, "on_click", None)):
            it._tg_key = "_btn%d" % n
            n += 1


def _schema(items):
    schema = {}
    for it in _flatten(items):
        if getattr(it, "kind", None) in ("switch", "selector", "input") and it.key:
            schema[it.key] = (it.kind, getattr(it, "text", it.key), getattr(it, "default", None), [str(x) for x in (getattr(it, "items", None) or [])])
    return schema


def _items(cls):
    try:
        if hasattr(cls, "settings"):
            return list(cls.settings())
    except Exception:
        pass
    try:
        return list(cls().create_settings())
    except Exception:
        return []


def _version(v):
    nums = re.findall(r"\d+", str(v))[:3]
    while len(nums) < 3:
        nums.append("0")
    return ".".join(nums)


def _mod_id(raw):
    s = re.sub(r"[^a-z0-9_]", "_", str(raw).lower())
    s = "ext_" + s
    return s[:40]


def describe(path):
    """Returns manifest.json text for a .plugin file."""
    module = _exec(path, "extera_describe")
    raw_id = getattr(module, "__id__", None) or "plugin"
    settings = []
    cls = _plugin_class(module)
    items = _flatten(_items(cls) if cls else [])
    _name_buttons(items)
    for it in items:
        k = getattr(it, "kind", None)
        if k == "header" and getattr(it, "text", ""):
            settings.append({"type": "header", "title": str(it.text)})
        elif k == "text" and getattr(it, "_tg_key", None):
            settings.append({"key": it._tg_key, "title": str(getattr(it, "text", "")), "type": "button", "default": str(getattr(it, "subtext", "") or "")})
        elif k == "switch" and it.key:
            settings.append({"key": it.key, "title": str(getattr(it, "text", it.key)), "type": "toggle", "default": bool(getattr(it, "default", False))})
        elif k == "selector" and it.key and getattr(it, "items", None):
            opts = [str(x) for x in it.items]
            d = getattr(it, "default", 0)
            settings.append({"key": it.key, "title": str(getattr(it, "text", it.key)), "type": "choice", "options": opts, "default": opts[d] if isinstance(d, int) and 0 <= d < len(opts) else opts[0]})
        elif k == "input" and it.key:
            settings.append({"key": it.key, "title": str(getattr(it, "text", it.key)), "type": "text", "default": str(getattr(it, "default", "") or "")})
    return json.dumps({
        "id": _mod_id(raw_id),
        "name": str(getattr(module, "__name__", raw_id)) if getattr(module, "__name__", "").find("extera_describe") < 0 else str(raw_id),
        "version": _version(getattr(module, "__version__", "1.0")),
        "api_version": 1,
        "description": str(getattr(module, "__description__", "")),
        "author": str(getattr(module, "__author__", "")),
        "category": "other",
        "entry": "main.py",
        "settings": settings,
    })


def load(api, path):
    rt.current_api = api
    module = _exec(path, "extera_plugin_" + api.modId())
    cls = _plugin_class(module)
    if cls is None:
        raise RuntimeError("в файле нет класса, наследующего BasePlugin")
    plugin = cls()
    plugin._api = api
    items = _flatten(_items(cls))
    plugin._schema = _schema(items)
    _name_buttons(items)
    _register_actions(api, plugin, items)
    plugin._install_app_events()
    plugin.on_plugin_load()


def _register_actions(api, plugin, items):
    for it in items:
        k = getattr(it, "kind", None)
        if k == "text" and getattr(it, "_tg_key", None):
            api.action(it._tg_key, rt.button_action(plugin, it))
        elif k in ("switch", "selector", "input") and it.key and callable(getattr(it, "on_change", None)):
            api.action("change:" + it.key, rt.change_action(plugin, it))
