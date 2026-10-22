"""exteraGram client_utils: helpers that reach into the Telegram client."""
import tgyou_extera_rt as rt
from java import jclass, dynamic_proxy

_Runnable = jclass("java.lang.Runnable")


STAGE_QUEUE = "stageQueue"
GLOBAL_QUEUE = "globalQueue"
CACHE_CLEAR_QUEUE = "cacheClearQueue"
SEARCH_QUEUE = "searchQueue"
PHONE_BOOK_QUEUE = "phoneBookQueue"
THEME_QUEUE = "themeQueue"
EXTERNAL_NETWORK_QUEUE = "externalNetworkQueue"
PLUGINS_QUEUE = "pluginsQueue"


def get_queue_by_name(name):
    return name


def run_on_queue(fn, queue_name=PLUGINS_QUEUE, delay=0):
    if isinstance(queue_name, (int, float)):  # old call style run_on_queue(fn, delay)
        delay = queue_name
    rt.run_async(fn, delay)


def run_on_ui_thread(fn, delay=0):
    class R(dynamic_proxy(_Runnable)):
        def run(self):
            try:
                fn()
            except Exception as e:
                if rt.current_api is not None:
                    rt.current_api.log("ui: " + repr(e))

    if delay:
        jclass("org.telegram.messenger.AndroidUtilities").runOnUIThread(R(), int(delay))
    else:
        jclass("org.telegram.messenger.AndroidUtilities").runOnUIThread(R())


def runnable(fn):
    class R(dynamic_proxy(_Runnable)):
        def run(self):
            fn()
    return R()


def get_selected_account():
    return jclass("org.telegram.messenger.UserConfig").selectedAccount


def get_hook_account():
    acc = getattr(rt, "hook_account", None)
    return get_selected_account() if acc is None else acc


class account_scope:
    def __init__(self, account):
        self.account = account
        self.prev = None

    def __enter__(self):
        self.prev = getattr(rt, "hook_account", None)
        rt.hook_account = self.account
        return self

    def __exit__(self, *a):
        rt.hook_account = self.prev
        return False


def _account(account=None):
    return get_hook_account() if account is None else account


class _SendHelper:
    def __init__(self, account=None):
        self._java = jclass("org.telegram.messenger.SendMessagesHelper").getInstance(_account(account))

    def generatePhotoSizes(self, path, uri=None):
        photo = self._java.generatePhotoSizes(path, uri)
        _paths.append((photo, path))
        return photo

    def __getattr__(self, name):
        return getattr(self._java, name)


_paths = []


def _entities(text, parse_mode, caption=False):
    from extera_utils.text_formatting import parse_text
    r = parse_text(text, parse_mode, caption)
    return r["caption" if caption else "message"], r["entities"]


def send_message(params, parse_mode=None, *, account=None):
    """params: dict with message, peer and optionally photos, replyToMsg, replyToTopMsg, entities."""
    helper_cls = jclass("org.telegram.messenger.SendMessagesHelper")
    P = jclass("org.telegram.messenger.SendMessagesHelper$SendMessageParams")
    acc = _account(account)
    peer = int(params["peer"])
    text = params.get("message") or params.get("caption") or ""
    entities = params.get("entities")
    if parse_mode and text:
        text, entities = _entities(text, parse_mode)
    reply = params.get("replyToMsg")
    top = params.get("replyToTopMsg")
    markup = params.get("replyMarkup")
    extra = params.get("params")
    notify = bool(params.get("notify", True))
    schedule = int(params.get("scheduleDate", 0) or 0)
    ttl = int(params.get("ttl", 0) or 0)
    jobs = []
    photos = params.get("photos") or ([params["photo"]] if params.get("photo") is not None else [])
    if photos:
        for i, photo in enumerate(photos):
            path = params.get("path")
            for p, pth in _paths:
                if p is photo:
                    path = pth
            jobs.append(P.of(photo, path, peer, reply, top, text if i == 0 else None, entities if i == 0 else None, markup, extra, notify, schedule, 0, ttl, None, False))
    elif text:
        jobs.append(P.of(text, peer, reply, top, None, True, entities, markup, extra, notify, schedule, 0, None, False))

    def go():
        for job in jobs:
            helper_cls.getInstance(acc).sendMessage(job)

    run_on_ui_thread(go)


def send_text(peer, text, *, account=None, parse_mode=None, **kwargs):
    d = {"peer": peer, "message": text}
    d.update(kwargs)
    send_message(d, parse_mode, account=account)


def send_photo(peer, file_path, caption="", high_quality=False, *, account=None, parse_mode=None, **kwargs):
    acc = _account(account)
    photo = jclass("org.telegram.messenger.SendMessagesHelper").getInstance(acc).generatePhotoSizes(file_path, None)
    _paths.append((photo, file_path))
    d = {"peer": peer, "photos": [photo], "message": caption, "path": file_path}
    d.update(kwargs)
    send_message(d, parse_mode, account=account)


def _send_file(peer, file_path, caption, account, parse_mode, reply=None):
    acc = _account(account)
    text, entities = (caption, None)
    if parse_mode and caption:
        text, entities = _entities(caption, parse_mode, True)
    AccountInstance = jclass("org.telegram.messenger.AccountInstance")
    helper = jclass("org.telegram.messenger.SendMessagesHelper")

    def go():
        helper.prepareSendingDocument(AccountInstance.getInstance(acc), file_path, file_path, None, text, None, int(peer), reply, None, None, None, None, True, 0, None, None, False)

    run_on_ui_thread(go)


def send_document(peer, file_path, caption="", *, account=None, parse_mode=None, **kwargs):
    _send_file(peer, file_path, caption, account, parse_mode, kwargs.get("replyToMsg"))


def send_video(peer, file_path, caption="", *, account=None, parse_mode=None, **kwargs):
    _send_file(peer, file_path, caption, account, parse_mode, kwargs.get("replyToMsg"))


def send_audio(peer, file_path, caption="", *, account=None, parse_mode=None, **kwargs):
    _send_file(peer, file_path, caption, account, parse_mode, kwargs.get("replyToMsg"))


def edit_message(message_obj, text=None, file_path=None, with_spoiler=False, *, account=None, parse_mode=None, **kwargs):
    acc = _account(account)
    entities = None
    if text is not None and parse_mode:
        text, entities = _entities(text, parse_mode)
    fragment = get_last_fragment()

    def go():
        jclass("org.telegram.messenger.SendMessagesHelper").getInstance(acc).editMessage(message_obj, text, False, fragment, entities, 0, 0)

    run_on_ui_thread(go)


class RequestCallback:
    def __init__(self, fn, account=None):
        self.fn = fn
        self.account = account


def send_request(request, fn, *, account=None):
    acc = _account(account)
    Delegate = jclass("org.telegram.tgnet.RequestDelegate")

    class D(dynamic_proxy(Delegate)):
        def run(self, response, error):
            try:
                fn(response, error)
            except Exception as e:
                if rt.current_api is not None:
                    rt.current_api.log("send_request: " + repr(e))

    return jclass("org.telegram.tgnet.ConnectionsManager").getInstance(acc).sendRequest(request, D())


class NotificationCenterDelegate:
    def didReceivedNotification(self, id, account, args):
        pass


_GETTERS = {
    "get_account_instance": None,
    "get_messages_controller": "getMessagesController",
    "get_contacts_controller": "getContactsController",
    "get_media_data_controller": "getMediaDataController",
    "get_connections_manager": "getConnectionsManager",
    "get_location_controller": "getLocationController",
    "get_notifications_controller": "getNotificationsController",
    "get_messages_storage": "getMessagesStorage",
    "get_file_loader": "getFileLoader",
    "get_secret_chat_helper": "getSecretChatHelper",
    "get_download_controller": "getDownloadController",
    "get_notifications_settings": "getNotificationsSettings",
    "get_notification_center": "getNotificationCenter",
    "get_user_config": "getUserConfig",
}


def _make_getter(method):
    def getter(account=None):
        inst = jclass("org.telegram.messenger.AccountInstance").getInstance(_account(account))
        return inst if method is None else getattr(inst, method)()
    return getter


for _name, _method in _GETTERS.items():
    globals()[_name] = _make_getter(_method)


def get_send_messages_helper(account=None):
    return _SendHelper(account)


def get_media_controller():
    return jclass("org.telegram.messenger.MediaController").getInstance()


class AccountClient:
    def __init__(self, account):
        self.account = account

    def __getattr__(self, name):
        fn = globals().get(name)
        if fn is None:
            raise AttributeError(name)

        def bound(*a, **kw):
            if name in _GETTERS:
                return fn(self.account)
            kw.setdefault("account", self.account)
            return fn(*a, **kw)
        return bound


def get_client(account=None):
    return AccountClient(_account(account))


def get_last_fragment():
    return jclass("org.telegram.ui.LaunchActivity").getLastFragment()


def get_account_instance():
    return jclass("org.telegram.messenger.AccountInstance").getInstance(_account())


def get_messages_controller():
    return jclass("org.telegram.messenger.MessagesController").getInstance(_account())


def get_user_config():
    return jclass("org.telegram.messenger.UserConfig").getInstance(_account())


def get_connections_manager():
    return jclass("org.telegram.tgnet.ConnectionsManager").getInstance(_account())


def get_media_data_controller():
    return jclass("org.telegram.messenger.MediaDataController").getInstance(_account())


def get_notifications_controller():
    return jclass("org.telegram.messenger.NotificationsController").getInstance(_account())


def get_contacts_controller():
    return jclass("org.telegram.messenger.ContactsController").getInstance(_account())


def get_file_loader():
    return jclass("org.telegram.messenger.FileLoader").getInstance(_account())


def get_messages_storage():
    return jclass("org.telegram.messenger.MessagesStorage").getInstance(_account())


def get_notification_center():
    return jclass("org.telegram.messenger.NotificationCenter").getInstance(_account())


def get_location_controller():
    return jclass("org.telegram.messenger.LocationController").getInstance(_account())


def get_secret_chat_helper():
    return jclass("org.telegram.messenger.SecretChatHelper").getInstance(_account())


def get_user(user_id):
    return get_messages_controller().getUser(int(user_id))


def get_chat(chat_id):
    return get_messages_controller().getChat(int(chat_id))
