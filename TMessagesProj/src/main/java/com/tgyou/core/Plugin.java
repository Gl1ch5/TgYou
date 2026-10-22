package com.tgyou.core;

import java.util.Collections;
import java.util.List;

/**
 * A unit of functionality. Built-in features are plugins too: they go through the same API
 * as third-party ones.
 */
public interface Plugin {

    String id();

    String name();

    String description();

    /** The settings tab the plugin appears in. */
    default Section section() {
        return Section.MISC;
    }

    /** True for Python mods installed by the user; they live in the Mods window, not in the settings tabs. */
    default boolean isMod() {
        return false;
    }

    /** Whether the plugin is on before the user touches its switch. */
    default boolean enabledByDefault() {
        return false;
    }

    default List<SettingField> fields() {
        return Collections.emptyList();
    }

    /** Called once; register hook handlers here. Handlers only run while the plugin is enabled. */
    void onLoad(PluginContext context);
}
