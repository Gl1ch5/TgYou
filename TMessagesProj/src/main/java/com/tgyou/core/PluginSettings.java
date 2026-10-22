package com.tgyou.core;

import android.content.SharedPreferences;

/** Key/value storage scoped to one plugin. */
public final class PluginSettings {

    private final SharedPreferences prefs;
    private final String prefix;

    PluginSettings(SharedPreferences prefs, String pluginId) {
        this.prefs = prefs;
        this.prefix = pluginId + ".";
    }

    public String getString(String key, String def) {
        return prefs.getString(prefix + key, def);
    }

    public void putString(String key, String value) {
        prefs.edit().putString(prefix + key, value).apply();
    }

    public boolean getBoolean(String key, boolean def) {
        return prefs.getBoolean(prefix + key, def);
    }

    public void putBoolean(String key, boolean value) {
        prefs.edit().putBoolean(prefix + key, value).apply();
    }
}
