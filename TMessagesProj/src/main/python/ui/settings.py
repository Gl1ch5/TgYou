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
    _order = ("key", "text", "default", "items", "icon", "on_change", "on_long_click", "link_alias")


class Input(_Item):
    kind = "input"
    _order = ("key", "text", "default", "subtext", "icon", "on_change", "on_long_click", "link_alias")


class Text(_Item):
    kind = "text"
    _order = ("text", "subtext", "icon", "accent", "red", "on_click", "create_sub_fragment", "on_long_click", "link_alias")


class Header(_Item):
    kind = "header"
    _order = ("text",)


class Divider(_Item):
    kind = "divider"
    _order = ("text",)


class EditText(Input):
    kind = "input"
    _order = ("key", "hint", "default", "multiline", "max_length", "mask", "on_change")

    def __init__(self, *args, **kw):
        super().__init__(*args, **kw)
        self.text = kw.get("text") or self.__dict__.get("hint") or self.key


class Custom(_Item):
    kind = "custom"
    _order = ("item", "view", "factory", "factory_args", "on_click", "on_long_click", "create_sub_fragment", "link_alias")


class SimpleSettingFactory:
    def __init__(self, create_view=None, bind_view=None, **kw):
        self.create_view = create_view
        self.bind_view = bind_view
        self.__dict__.update(kw)
        self.instance = self

    def __call__(self, *args, **kw):
        return Custom(factory=self, factory_args=args)
