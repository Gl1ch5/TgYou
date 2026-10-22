"""exteraGram plugin API compatibility layer (base_plugin)."""
import tgyou_extera_rt as rt


class HookStrategy:
    DEFAULT = "DEFAULT"
    CANCEL = "CANCEL"
    MODIFY = "MODIFY"
    MODIFY_FINAL = "MODIFY_FINAL"


class HookResult:
    def __init__(self, strategy=HookStrategy.DEFAULT, request=None, response=None, params=None, update=None, updates=None, message=None, **kw):
        self.strategy = strategy
        self.request = request
        self.response = response
        self.params = params
        self.update = update
        self.updates = updates
        self.message = message
        self.__dict__.update(kw)


class MenuItemData:
    def __init__(self, *args, **kw):
        self.__dict__.update(kw)


class AppEvent:
    START = "START"
    STOP = "STOP"
    PAUSE = "PAUSE"
    RESUME = "RESUME"


class MethodHook:
    def before_hooked_method(self, param):
        pass

    def after_hooked_method(self, param):
        pass


class BasePlugin:
    id = None
    name = None

    def __init__(self):
        self._api = None
        self._schema = {}
        self._send_hooked = False

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
