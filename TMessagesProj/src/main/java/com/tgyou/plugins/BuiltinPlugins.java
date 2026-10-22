package com.tgyou.plugins;

import com.tgyou.core.Plugin;

import java.util.Arrays;
import java.util.List;

public final class BuiltinPlugins {

    private BuiltinPlugins() {
    }

    public static List<Plugin> create() {
        return Arrays.asList(
                new LocalPremiumPlugin(),
                new WhisperTranscribePlugin()
        );
    }
}
