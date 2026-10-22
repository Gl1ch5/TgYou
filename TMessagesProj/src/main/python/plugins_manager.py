"""exteraGram plugins_manager: only what other plugins need to find their neighbours."""


class PluginsManager:
    plugins = {}

    @classmethod
    def get_plugin(cls, plugin_id):
        return cls.plugins.get(plugin_id)

    @classmethod
    def is_plugin_enabled(cls, plugin_id):
        return plugin_id in cls.plugins

    @classmethod
    def get_plugins(cls):
        return dict(cls.plugins)


PluginsController = PluginsManager
