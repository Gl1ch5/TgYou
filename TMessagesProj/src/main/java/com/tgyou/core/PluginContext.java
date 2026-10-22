package com.tgyou.core;

/** Handed to a plugin on load; the plugin registers its hook handlers through it. */
public final class PluginContext {

    private final PluginHost host;
    private final Plugin plugin;
    private final PluginSettings settings;

    PluginContext(PluginHost host, Plugin plugin, PluginSettings settings) {
        this.host = host;
        this.plugin = plugin;
        this.settings = settings;
    }

    public PluginSettings settings() {
        return settings;
    }

    public boolean isEnabled() {
        return host.isEnabled(plugin);
    }

    public <I, O> void on(HookPoint<I, O> point, HookHandler<I, O> handler) {
        host.addHandler(plugin, point, handler);
    }
}
