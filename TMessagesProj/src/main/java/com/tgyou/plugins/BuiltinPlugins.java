package com.tgyou.plugins;

import com.tgyou.core.Plugin;

import java.util.Arrays;
import java.util.List;

public final class BuiltinPlugins {

    private BuiltinPlugins() {
    }

    public static List<Plugin> create() {
        return Arrays.asList(
                new GhostModePlugin(),
                new ScreenPrivacyPlugin(),
                new AntiRecallPlugin(),
                new AdBlockPlugin(),
                new MessageFilterPlugin(),
                new SavedChatsPlugin(),
                new TtlMediaPlugin(),
                new ScreenshotNoticePlugin(),
                new LocalPremiumPlugin(),
                new WhisperTranscribePlugin()
        );
    }
}
