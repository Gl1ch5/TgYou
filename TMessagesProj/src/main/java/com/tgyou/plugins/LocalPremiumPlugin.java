package com.tgyou.plugins;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;

/**
 * Makes the client behave as if the account had Premium. This only unlocks what the app
 * itself gates; limits and features enforced by Telegram's servers are unaffected.
 */
public final class LocalPremiumPlugin implements Plugin {

    @Override
    public String id() {
        return "local_premium";
    }

    @Override
    public String name() {
        return "Локальный Premium";
    }

    @Override
    public String description() {
        return "Включает в клиенте функции, которые приложение закрывает за Premium. "
                + "Серверные лимиты и функции Telegram это не меняет.";
    }

    @Override
    public void onLoad(PluginContext context) {
        context.on(Hooks.PREMIUM_CHECK, (input, current) -> true);
    }
}
