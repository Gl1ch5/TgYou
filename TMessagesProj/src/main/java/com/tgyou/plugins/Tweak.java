package com.tgyou.plugins;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.Section;

import org.telegram.tgnet.TLObject;

/** A one-switch plugin that edits or drops an outgoing request. */
final class Tweak implements Plugin {

    interface Handler {
        /** Edits the request in place; returns true to drop it. */
        boolean apply(TLObject request);
    }

    private final String id;
    private final String name;
    private final String description;
    private final Section section;
    private final boolean enabledByDefault;
    private final Handler handler;

    Tweak(String id, String name, String description, Section section, boolean enabledByDefault, Handler handler) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.section = section;
        this.enabledByDefault = enabledByDefault;
        this.handler = handler;
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public Section section() {
        return section;
    }

    @Override
    public boolean enabledByDefault() {
        return enabledByDefault;
    }

    @Override
    public void onLoad(PluginContext context) {
        context.on(Hooks.OUTGOING_REQUEST, (request, blocked) -> handler.apply(request) || blocked);
    }
}
