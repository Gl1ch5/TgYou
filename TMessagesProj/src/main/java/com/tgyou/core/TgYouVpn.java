package com.tgyou.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;

/**
 * «Не использовать прокси при VPN»: пока активна VPN-сеть, прокси Telegram временно отключается,
 * а после выключения VPN включается обратно. Настройка прокси пользователя не меняется.
 */
public final class TgYouVpn {

    public static final String KEY = "net.no_proxy_on_vpn";

    private static boolean started;
    private static boolean vpn;
    private static boolean suspended;

    private TgYouVpn() {
    }

    public static synchronized void start(Context context) {
        if (started) {
            return;
        }
        started = true;
        try {
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            vpn = isVpn(cm, cm.getActiveNetwork());
            cm.registerDefaultNetworkCallback(new ConnectivityManager.NetworkCallback() {
                @Override
                public void onCapabilitiesChanged(Network network, NetworkCapabilities caps) {
                    update(caps.hasTransport(NetworkCapabilities.TRANSPORT_VPN));
                }

                @Override
                public void onLost(Network network) {
                    update(false);
                }
            });
        } catch (Throwable t) {
            FileLog.e("tgyou: vpn watcher failed", t);
        }
        AndroidUtilities.runOnUIThread(TgYouVpn::apply, 1500);
    }

    private static boolean isVpn(ConnectivityManager cm, Network network) {
        NetworkCapabilities caps = network == null ? null : cm.getNetworkCapabilities(network);
        return caps != null && caps.hasTransport(NetworkCapabilities.TRANSPORT_VPN);
    }

    private static void update(boolean value) {
        synchronized (TgYouVpn.class) {
            if (vpn == value) {
                return;
            }
            vpn = value;
        }
        AndroidUtilities.runOnUIThread(TgYouVpn::apply);
    }

    /** Re-evaluates the state; call after the setting changes. */
    public static void refresh() {
        AndroidUtilities.runOnUIThread(TgYouVpn::apply);
    }

    /** True while the proxy is switched off because a VPN is active. */
    public static synchronized boolean suspended() {
        return suspended;
    }

    private static synchronized void apply() {
        try {
            boolean wantOff = TgYouPrefs.bool(KEY, false) && vpn;
            if (wantOff && !suspended && SharedConfig.isProxyEnabled()) {
                suspended = true;
                ConnectionsManager.setProxySettings(false, null);
            } else if (!wantOff && suspended) {
                suspended = false;
                if (SharedConfig.isProxyEnabled()) {
                    ConnectionsManager.setProxySettings(true, SharedConfig.currentProxy.settings);
                }
            }
        } catch (Throwable t) {
            FileLog.e("tgyou: vpn proxy switch failed", t);
        }
    }
}
