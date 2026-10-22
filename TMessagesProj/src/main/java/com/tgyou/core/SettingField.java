package com.tgyou.core;

/** A user-editable string setting a plugin shows on its settings screen. */
public final class SettingField {

    public final String key;
    public final String title;
    public final String defaultValue;
    /** Secret values are masked on screen. */
    public final boolean secret;

    public SettingField(String key, String title, String defaultValue, boolean secret) {
        this.key = key;
        this.title = title;
        this.defaultValue = defaultValue;
        this.secret = secret;
    }
}
