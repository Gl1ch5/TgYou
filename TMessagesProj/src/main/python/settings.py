"""exteraGram `settings` module stub: a few plugins read app-wide flags from it."""
import tgyou_extera_rt as rt


def get(key, default=None):
    api = rt.current_api
    return default if api is None else api.getString("app_" + str(key), "" if default is None else str(default))
