"""exteraGram client_utils: helpers that reach into the Telegram client."""
import tgyou_extera_rt as rt
from java import jclass, dynamic_proxy

_Runnable = jclass("java.lang.Runnable")


def run_on_queue(fn, delay=0):
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


def _account():
    return jclass("org.telegram.messenger.UserConfig").selectedAccount


class _SendHelper:
    def __init__(self):
        self._java = jclass("org.telegram.messenger.SendMessagesHelper").getInstance(_account())

    def generatePhotoSizes(self, path, uri=None):
        photo = self._java.generatePhotoSizes(path, uri)
        _paths.append((photo, path))
        return photo

    def __getattr__(self, name):
        return getattr(self._java, name)


_paths = []


def get_send_messages_helper():
    return _SendHelper()


def send_message(params):
    """params: dict with message, peer and optionally photos, replyToMsg, replyToTopMsg."""
    helper_cls = jclass("org.telegram.messenger.SendMessagesHelper")
    P = jclass("org.telegram.messenger.SendMessagesHelper$SendMessageParams")
    acc = _account()
    peer = int(params["peer"])
    text = params.get("message") or params.get("caption") or ""
    reply = params.get("replyToMsg")
    top = params.get("replyToTopMsg")
    jobs = []
    photos = params.get("photos") or []
    if photos:
        for i, photo in enumerate(photos):
            path = None
            for p, pth in _paths:
                if p is photo:
                    path = pth
            jobs.append(P.of(photo, path, peer, reply, top, text if i == 0 else None, None, None, None, True, 0, 0, 0, None, False))
    elif text:
        jobs.append(P.of(text, peer, reply, top, None, True, None, None, None, True, 0, 0, None, False))

    def go():
        for job in jobs:
            helper_cls.getInstance(acc).sendMessage(job)

    run_on_ui_thread(go)


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
