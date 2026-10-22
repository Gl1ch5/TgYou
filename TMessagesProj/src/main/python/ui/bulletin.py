import tgyou_extera_rt as rt


def _toast(text):
    if rt.current_api is not None:
        rt.current_api.toast(str(text))


class BulletinHelper:
    @staticmethod
    def show_info(message, fragment=None):
        _toast(message)

    @staticmethod
    def show_error(message, fragment=None):
        _toast(message)

    @staticmethod
    def show_success(message, fragment=None):
        _toast(message)

    @staticmethod
    def show_simple(message, icon=None, fragment=None):
        _toast(message)

    @staticmethod
    def show_with_button(message, icon=None, button_text="", on_click=None, fragment=None):
        _toast(message)

    @staticmethod
    def show_copied_to_clipboard(fragment=None):
        _toast("Скопировано")
