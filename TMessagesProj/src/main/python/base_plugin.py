"""exteraGram plugin API compatibility layer (base_plugin)."""
import tgyou_extera_rt as rt


class HookStrategy:
    DEFAULT = "DEFAULT"
    CANCEL = "CANCEL"
    MODIFY = "MODIFY"
    MODIFY_FINAL = "MODIFY_FINAL"


class HookResult:
    def __init__(self, strategy=HookStrategy.DEFAULT, request=None, response=None, update=None, updates=None, error=None, params=None, **kw):
        if strategy is True:  # tolerate HookResult(True, params) used by sloppy plugins
            strategy = HookStrategy.MODIFY
        self.strategy = strategy
        self.request = request
        self.response = response
        self.update = update
        self.updates = updates
        self.error = error
        self.params = params
        self.__dict__.update(kw)


class PluginError(Exception):
    def __init__(self, message="", plugin_id=None):
        super().__init__(message)
        self.plugin_id = plugin_id


class IntentHookType:
    BEFORE = 0
    AFTER = 1


class MenuItemType:
    MESSAGE_CONTEXT_MENU = "message_context_menu"
    DRAWER_MENU = "drawer_menu"
    MAIN_MENU = "main_menu"
    CHAT_ACTION_MENU = "chat_action_menu"
    PROFILE_ACTION_MENU = "profile_action_menu"


class MenuItemData:
    def __init__(self, menu_type=None, text="", on_click=None, item_id=None, icon=None, subtext=None, condition=None, priority=0, **kw):
        self.menu_type = menu_type
        self.text = text
        self.on_click = on_click
        self.item_id = item_id
        self.icon = icon
        self.subtext = subtext
        self.condition = condition
        self.priority = priority
        self.__dict__.update(kw)


class AppEvent:
    START = "app_start"
    STOP = "app_stop"
    PAUSE = "app_pause"
    RESUME = "app_resume"


class MethodHook:
    def before_hooked_method(self, param):
        pass

    def after_hooked_method(self, param):
        pass


class MethodReplacement(MethodHook):
    """Xposed-style hook that replaces the method; the Xposed layer is not available in TgYou."""

    def replace_hooked_method(self, param):
        return None


class HookFilter:
    def __init__(self, *args, **kw):
        self.args = args
        self.__dict__.update(kw)


class XposedHook(MethodHook):
    pass


class BasePlugin:
    id = None
    name = None

    def __init__(self):
        self._api = None
        self._schema = {}
        self._send_hooked = False
        self._hooks = []
        self._tl_installed = False
        self._menu_items = []
        self._menu_installed = False
        self._app_installed = False

    # --- settings -------------------------------------------------------
    def get_setting(self, key, default=None):
        return rt.get_setting(self, key, default)

    def set_setting(self, key, value, reload_settings=False):
        rt.set_setting(self, key, value)

    # --- hooks ----------------------------------------------------------
    def add_on_send_message_hook(self, priority=0):
        if self._send_hooked or self._api is None:
            return
        self._send_hooked = True
        self._api.hook("message.send", lambda account, params: rt.dispatch_send(self, account, params))

    def remove_on_send_message_hook(self):
        pass

    def add_hook(self, name, match_substring=False, priority=0):
        """Subscribes to a TL request/response/update by class name (e.g. TL_messages_sendMessage)."""
        if name == "send_message_hook":
            self.add_on_send_message_hook(priority)
            return
        self._hooks.append((str(name), bool(match_substring)))
        rt.install_tl_hooks(self)

    def remove_hook(self, name):
        self._hooks = [h for h in self._hooks if h[0] != str(name)]

    def add_menu_item(self, item):
        self._menu_items.append(item)
        rt.install_menu(self)

    def remove_menu_item(self, item_id):
        before = len(self._menu_items)
        self._menu_items = [i for i in self._menu_items if getattr(i, "item_id", None) != item_id]
        return len(self._menu_items) != before

    def client(self, account=None):
        from client_utils import get_client
        return get_client(account)

    def export_settings(self):
        out = {}
        for key in self._schema:
            out[key] = self.get_setting(key)
        return out

    def import_settings(self, settings, reload_settings=True):
        for key, value in (settings or {}).items():
            self.set_setting(key, value)

    # --- app events / intents / xposed (partial) -------------------------------
    def _install_app_events(self):
        if self._app_installed or self._api is None:
            return
        self._app_installed = True
        self._api.hook("app.event", lambda event: rt.dispatch_app_event(self, event))

    def add_intent_hook(self, info, type=IntentHookType.BEFORE):
        rt.log(self, "intent-хуки пока не поддерживаются")
        return None

    def remove_intent_hook(self, handler_id):
        pass

    def add_file_hook(self, file_info):
        rt.log(self, "файловые хуки пока не поддерживаются")
        return None

    def remove_file_hook(self, ext, secret):
        pass

    def hook_method(self, *args, **kwargs):
        rt.log(self, "hook_method (Xposed) не поддерживается в TgYou")
        return None

    hook_all_methods = hook_method
    hook_all_constructors = hook_method

    def unhook_method(self, unhook):
        pass

    def unhook_objects(self, *args, **kwargs):
        pass

    def hook_filters(self, *args, **kwargs):
        rt.log(self, "hook_filters (Xposed) не поддерживается в TgYou")
        return None

    def add_source(self, *args, **kwargs):
        rt.log(self, "add_source не поддерживается в TgYou")
        return None

    def log(self, message):
        rt.log(self, message)

    # --- lifecycle (overridden by plugins) ---------------------------------
    def on_plugin_load(self):
        pass

    def on_plugin_unload(self):
        pass

    def create_settings(self):
        return type(self).settings() if hasattr(type(self), "settings") else []

    def __getattr__(self, name):
        # Methods of the exteraGram API that are not supported yet: log and do nothing.
        if name.startswith(("add_", "remove_", "hook_", "unhook_", "on_", "set_", "show_")):
            def unsupported(*args, **kwargs):
                rt.log(self, "не поддерживается в TgYou: " + name)
            return unsupported
        raise AttributeError(name)
