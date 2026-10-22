"""exteraGram ui.settings: declarative settings items. TgYou renders Switch/Selector/Input natively."""


class _Item:
    kind = "item"

    def __init__(self, *args, **kw):
        names = self._order
        for n, v in zip(names, args):
            kw.setdefault(n, v)
        self.__dict__.update(kw)
        self.key = kw.get("key")


class Switch(_Item):
    kind = "switch"
    _order = ("key", "text", "default", "subtext", "icon", "on_change", "on_long_click", "link_alias")


class Selector(_Item):
    kind = "selector"
    _order = ("key", "text", "default", "items", "icon", "on_change")


class Input(_Item):
    kind = "input"
    _order = ("key", "text", "default", "subtext", "icon", "on_change", "link_alias")


class Text(_Item):
    kind = "text"
    _order = ("text", "icon", "accent", "red", "on_click", "create_sub_fragment", "link_alias")


class Header(_Item):
    kind = "header"
    _order = ("text",)


class Divider(_Item):
    kind = "divider"
    _order = ("text",)


class EditText(Input):
    pass
