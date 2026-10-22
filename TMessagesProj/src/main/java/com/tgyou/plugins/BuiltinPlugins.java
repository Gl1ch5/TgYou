package com.tgyou.plugins;

import com.tgyou.core.Plugin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class BuiltinPlugins {

    private BuiltinPlugins() {
    }

    public static List<Plugin> create() {
        List<Plugin> all = new ArrayList<>(Arrays.asList(
                new GhostModePlugin(),
                new ScreenPrivacyPlugin(),
                new AntiRecallPlugin(),
                new AdBlockPlugin(),
                new MessageFilterPlugin(),
                new SavedChatsPlugin(),
                new TtlMediaPlugin(),
                new AllowCopyPlugin(),
                new HideBlockedPlugin(),
                new FontsPlugin(),
                new SmartTypographyPlugin(),
                new ScreenshotNoticePlugin(),
                new ExtraPrivacyPlugin(),
                new ExactTimePlugin(),
                new MessageInfoPlugin(),
                new LocalPremiumPlugin(),
                new WhisperTranscribePlugin(),
                new MessageToolsPlugin(),
                new ChatExtrasPlugin()
        ));
        all.addAll(Tweaks.create());
        return all;
    }
}
