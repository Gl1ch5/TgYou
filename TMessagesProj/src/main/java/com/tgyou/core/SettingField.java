package com.tgyou.core;

/** A setting a plugin shows on its settings tab. Build with the static factories. */
public final class SettingField {

    public enum Kind {TEXT, SECRET, TOGGLE, CHOICE, HEADER, BUTTON}

    public final Kind kind;
    public final String key;
    public final String title;
    /** For TOGGLE: "true" or "false". */
    public final String defaultValue;
    /** For CHOICE: the selectable values. */
    public final String[] options;

    private SettingField(Kind kind, String key, String title, String defaultValue, String[] options) {
        this.kind = kind;
        this.key = key;
        this.title = title;
        this.defaultValue = defaultValue;
        this.options = options;
    }

    public static SettingField text(String key, String title, String defaultValue) {
        return new SettingField(Kind.TEXT, key, title, defaultValue, null);
    }

    /** A non-interactive section title. */
    public static SettingField header(String title) {
        return new SettingField(Kind.HEADER, "", title, "", null);
    }

    /** A row that runs the mod's action registered under {@code key}; defaultValue is the subtitle. */
    public static SettingField button(String key, String title, String subtitle) {
        return new SettingField(Kind.BUTTON, key, title, subtitle, null);
    }

    public static SettingField secret(String key, String title) {
        return new SettingField(Kind.SECRET, key, title, "", null);
    }

    public static SettingField toggle(String key, String title, boolean defaultValue) {
        return new SettingField(Kind.TOGGLE, key, title, String.valueOf(defaultValue), null);
    }

    public static SettingField choice(String key, String title, String defaultValue, String... options) {
        return new SettingField(Kind.CHOICE, key, title, defaultValue, options);
    }
}
