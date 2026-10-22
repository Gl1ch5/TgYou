package com.tgyou.core;

import android.content.Context;
import android.content.SharedPreferences;

import com.tgyou.plugins.BuiltinPlugins;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Plugin registry and hook bus. A failing handler is logged and skipped, it never reaches
 * the caller.
 */
public final class PluginHost {

    private static final String PREFS = "tgyou_plugins";

    private static volatile PluginHost instance;

    private final SharedPreferences prefs;
    private final List<Plugin> plugins = new CopyOnWriteArrayList<>();
    private final Map<String, Boolean> enabled = new HashMap<>();
    private final Map<String, PluginSettings> settings = new java.util.concurrent.ConcurrentHashMap<>();
    private final Map<HookPoint<?, ?>, List<Registration<?, ?>>> handlers = new HashMap<>();

    private static final class Registration<I, O> {
        final Plugin plugin;
        final HookHandler<I, O> handler;

        Registration(Plugin plugin, HookHandler<I, O> handler) {
            this.plugin = plugin;
            this.handler = handler;
        }
    }

    private PluginHost(Context context) {
        prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
    }

    /** Returns null until the application context exists. */
    public static PluginHost get() {
        PluginHost local = instance;
        if (local != null) {
            return local;
        }
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return null;
        }
        synchronized (PluginHost.class) {
            if (instance == null) {
                PluginHost host = new PluginHost(context);
                for (Plugin plugin : BuiltinPlugins.create()) {
                    host.register(plugin);
                }
                instance = host;
                com.tgyou.mods.ModRuntime.loadAll(host, context);
            }
            return instance;
        }
    }

    /** Adds a plugin after startup (an installed mod). Replaces a plugin with the same id. */
    public void registerMod(Plugin plugin) {
        unregister(plugin.id());
        register(plugin);
    }

    public void unregister(String id) {
        Plugin old = find(id);
        if (old == null) {
            return;
        }
        plugins.remove(old);
        synchronized (handlers) {
            for (List<Registration<?, ?>> list : handlers.values()) {
                for (Registration<?, ?> r : list) {
                    if (r.plugin == old) {
                        list.remove(r);
                    }
                }
            }
        }
    }

    public Plugin find(String id) {
        for (Plugin plugin : plugins) {
            if (plugin.id().equals(id)) {
                return plugin;
            }
        }
        return null;
    }

    private void register(Plugin plugin) {
        PluginSettings pluginSettings = new PluginSettings(prefs, plugin.id());
        settings.put(plugin.id(), pluginSettings);
        synchronized (enabled) {
            enabled.put(plugin.id(), prefs.getBoolean(plugin.id() + ".enabled", plugin.enabledByDefault()));
        }
        plugins.add(plugin);
        try {
            plugin.onLoad(new PluginContext(this, plugin, pluginSettings));
        } catch (Throwable t) {
            FileLog.e("tgyou: plugin " + plugin.id() + " failed to load", t);
        }
    }

    <I, O> void addHandler(Plugin plugin, HookPoint<I, O> point, HookHandler<I, O> handler) {
        synchronized (handlers) {
            List<Registration<?, ?>> list = handlers.get(point);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                handlers.put(point, list);
            }
            list.add(new Registration<>(plugin, handler));
        }
    }

    public List<Plugin> plugins() {
        return Collections.unmodifiableList(new ArrayList<>(plugins));
    }

    public boolean isEnabled(Plugin plugin) {
        synchronized (enabled) {
            Boolean value = enabled.get(plugin.id());
            return value != null && value;
        }
    }

    public void setEnabled(Plugin plugin, boolean value) {
        synchronized (enabled) {
            enabled.put(plugin.id(), value);
        }
        prefs.edit().putBoolean(plugin.id() + ".enabled", value).apply();
    }

    public PluginSettings settingsOf(Plugin plugin) {
        return settings.get(plugin.id());
    }

    /** Runs the handlers of enabled plugins in registration order, threading the value through. */
    @SuppressWarnings("unchecked")
    public <I, O> O dispatch(HookPoint<I, O> point, I input, O initial) {
        List<Registration<?, ?>> list;
        synchronized (handlers) {
            list = handlers.get(point);
        }
        if (list == null) {
            return initial;
        }
        O value = initial;
        for (Registration<?, ?> raw : list) {
            Registration<I, O> registration = (Registration<I, O>) raw;
            if (!isEnabled(registration.plugin)) {
                continue;
            }
            try {
                value = registration.handler.handle(input, value);
            } catch (Throwable t) {
                FileLog.e("tgyou: plugin " + registration.plugin.id() + " failed in " + point, t);
            }
        }
        return value;
    }
}
