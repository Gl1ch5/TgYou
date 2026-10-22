import tgyou_extera_rt as rt
from client_utils import run_on_ui_thread  # noqa: F401
from java import jclass


def log(message):
    if rt.current_api is not None:
        rt.current_api.log(str(message))


def copy_to_clipboard(text):
    app = jclass("org.telegram.messenger.ApplicationLoader").applicationContext
    cm = app.getSystemService("clipboard")
    cm.setPrimaryClip(jclass("android.content.ClipData").newPlainText("text", str(text)))


class OnClickListener:
    def __init__(self, fn):
        self.fn = fn

    def __call__(self, *a):
        return self.fn(*a)


OnLongClickListener = OnClickListener
