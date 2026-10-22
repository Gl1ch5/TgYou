import tgyou_extera_rt as rt
from java import jclass


class AlertDialogBuilder:
    """Native Telegram AlertDialog behind exteraGram's builder API (common subset)."""

    ALERT_TYPE_MESSAGE = 0
    ALERT_TYPE_LOADING = 3
    ALERT_TYPE_SPINNER = 2
    BUTTON_POSITIVE = -1
    BUTTON_NEGATIVE = -2
    BUTTON_NEUTRAL = -3

    def __init__(self, context=None, progress_style=0, resources_provider=None):
        self._context = context
        self._cls = jclass("org.telegram.ui.ActionBar.AlertDialog$Builder")
        ctx = context if context is not None else self._ctx()
        self._b = self._cls(ctx)
        self._dialog = None
        self._fallback = {"title": "", "message": ""}

    @staticmethod
    def _ctx():
        frag = jclass("org.telegram.ui.LaunchActivity").getLastFragment()
        return frag.getParentActivity() if frag is not None else None

    def get_context(self):
        return self._context or self._ctx()

    def set_title(self, title):
        self._b.setTitle(str(title))
        self._fallback["title"] = str(title)
        return self

    def set_message(self, message):
        self._b.setMessage(str(message))
        self._fallback["message"] = str(message)
        return self

    def set_view(self, view, height=-2):
        self._b.setView(view, height)
        return self

    def _button(self, setter, text, listener):
        from client_utils import runnable
        L = jclass("android.content.DialogInterface$OnClickListener")
        from java import dynamic_proxy

        class P(dynamic_proxy(L)):
            def onClick(this, dialog, which):
                if listener is not None:
                    try:
                        listener(self, which)
                    except Exception as e:
                        if rt.current_api is not None:
                            rt.current_api.log("alert: " + repr(e))
        getattr(self._b, setter)(str(text), P())
        return self

    def set_positive_button(self, text, listener=None):
        return self._button("setPositiveButton", text, listener)

    def set_negative_button(self, text, listener=None):
        return self._button("setNegativeButton", text, listener)

    def set_neutral_button(self, text, listener=None):
        return self._button("setNeutralButton", text, listener)

    def create(self):
        if self._dialog is None:
            self._dialog = self._b.create()
        return self

    def show(self):
        from client_utils import run_on_ui_thread

        def go():
            self.create()
            self._dialog.show()
        run_on_ui_thread(go)
        return self

    def dismiss(self):
        if self._dialog is not None:
            self._dialog.dismiss()

    def get_dialog(self):
        return self._dialog

    def set_cancelable(self, value):
        self.create()._dialog.setCancelable(bool(value))
        return self

    def __getattr__(self, name):
        if name.startswith("set_") or name.startswith("make_"):
            return lambda *a, **k: self
        raise AttributeError(name)
