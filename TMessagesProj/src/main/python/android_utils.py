import tgyou_extera_rt as rt
from client_utils import run_on_ui_thread  # noqa: F401
from java import jclass, dynamic_proxy


def log(data=""):
    if rt.current_api is not None:
        rt.current_api.log(str(data))


def copy_to_clipboard(text):
    def go():
        app = jclass("org.telegram.messenger.ApplicationLoader").applicationContext
        cm = app.getSystemService("clipboard")
        cm.setPrimaryClip(jclass("android.content.ClipData").newPlainText("text", str(text)))
        return True
    run_on_ui_thread(go)
    return True


def R(fn):
    from client_utils import runnable
    return runnable(fn)


def OnClickListener(fn):
    class L(dynamic_proxy(jclass("android.view.View$OnClickListener"))):
        def onClick(self, view):
            fn(view)
    return L()


def OnLongClickListener(fn):
    class L(dynamic_proxy(jclass("android.view.View$OnLongClickListener"))):
        def onLongClick(self, view):
            return bool(fn(view))
    return L()
