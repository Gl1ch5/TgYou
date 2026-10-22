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


class MenuItemType:
    MESSAGE_CONTEXT_MENU = "MESSAGE_CONTEXT_MENU"
    DRAWER_MENU = "DRAWER_MENU"
    CHAT_ACTION_MENU = "CHAT_ACTION_MENU"
    PROFILE_ACTION_MENU = "PROFILE_ACTION_MENU"
    CHAT_MENU = "CHAT_ACTION_MENU"
    PROFILE_MENU = "PROFILE_ACTION_MENU"


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
        self._hooks = []
        self._tl_installed = False
        self._menu_items = []
        self._menu_installed = False

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
        self._hooks.append((str(name), bool(match_substring)))
        rt.install_tl_hooks(self)

    def remove_hook(self, name):
        self._hooks = [h for h in self._hooks if h[0] != str(name)]

    def add_menu_item(self, item):
        self._menu_items.append(item)
        rt.install_menu(self)

    def remove_menu_item(self, item_id):
        self._menu_items = [i for i in self._menu_items if getattr(i, "item_id", None) != item_id]

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
