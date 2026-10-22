import tgyou_extera_rt as rt


class AlertDialogBuilder:
    """Minimal stand-in: shows the message as a toast."""

    def __init__(self, *args, **kw):
        self._title = ""
        self._message = ""

    def set_title(self, title):
        self._title = title
        return self

    def set_message(self, message):
        self._message = message
        return self

    def set_positive_button(self, *a, **k):
        return self

    def set_negative_button(self, *a, **k):
        return self

    def set_neutral_button(self, *a, **k):
        return self

    def show(self):
        if rt.current_api is not None:
            rt.current_api.toast(str(self._title or self._message))
        return self

    def dismiss(self):
        pass
