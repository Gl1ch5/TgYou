import tgyou_extera_rt as rt


def _toast(text):
    if rt.current_api is not None:
        rt.current_api.toast(str(text))


class BulletinHelper:
    DURATION_SHORT = 1500
    DURATION_LONG = 2750
    DURATION_PROLONG = 5000

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
    def show_simple(text, icon_res_id=None, fragment=None):
        _toast(text)

    @staticmethod
    def show_two_line(title, subtitle, icon_res_id=None, fragment=None):
        _toast(str(title) + "\n" + str(subtitle))

    @staticmethod
    def show_with_button(text, icon_res_id=None, button_text="", on_click=None, fragment=None, duration=2750):
        _toast(text)

    @staticmethod
    def show_undo(text, on_undo=None, on_action=None, subtitle=None, fragment=None):
        _toast(text)

    @staticmethod
    def show_copied_to_clipboard(message=None, fragment=None):
        _toast(message or "Скопировано")

    @staticmethod
    def show_link_copied(is_private_link_info=False, fragment=None):
        _toast("Ссылка скопирована")

    @staticmethod
    def show_file_saved_to_gallery(is_video=False, amount=1, fragment=None):
        _toast("Сохранено в галерею")

    @staticmethod
    def show_file_saved_to_downloads(file_type_enum_name="UNKNOWN", amount=1, fragment=None):
        _toast("Сохранено в загрузки")
