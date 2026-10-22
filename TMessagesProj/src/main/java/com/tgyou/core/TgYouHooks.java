package com.tgyou.core;

import org.telegram.messenger.MessageObject;

/**
 * The only entry points the Telegram sources call. Every call site is a single line, so
 * upstream merges stay cheap.
 */
public final class TgYouHooks {

    private TgYouHooks() {
    }

    public static boolean isPremium(boolean real) {
        PluginHost host = PluginHost.get();
        return host == null ? real : host.dispatch(Hooks.PREMIUM_CHECK, null, real);
    }

    public static boolean transcribeAvailable(MessageObject message) {
        PluginHost host = PluginHost.get();
        return host != null && host.dispatch(Hooks.TRANSCRIBE_AVAILABLE, message, false);
    }

    /** @return true when a plugin took over the transcription and the stock request must be skipped */
    public static boolean transcribeRequest(MessageObject message) {
        PluginHost host = PluginHost.get();
        return host != null && host.dispatch(Hooks.TRANSCRIBE_REQUEST, message, false);
    }
}
