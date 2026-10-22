package com.tgyou.core;

import org.telegram.messenger.MessageObject;

/** Catalogue of hook points exposed to plugins. This is the stable contract of the core. */
public final class Hooks {

    private Hooks() {
    }

    /** Input: unused. Value: whether the account should be treated as Premium on the client. */
    public static final HookPoint<Void, Boolean> PREMIUM_CHECK = new HookPoint<>("premium.check");

    /** Input: the voice message. Value: whether a plugin offers voice-to-text for it. */
    public static final HookPoint<MessageObject, Boolean> TRANSCRIBE_AVAILABLE = new HookPoint<>("transcribe.available");

    /** Input: the voice message. Value: true once a plugin has taken over the transcription. */
    public static final HookPoint<MessageObject, Boolean> TRANSCRIBE_REQUEST = new HookPoint<>("transcribe.request");
}
