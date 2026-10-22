package com.tgyou.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/** «Работать в фоне»: исключение из оптимизации батареи и постоянная служба уведомлений Telegram. */
public final class TgYouBackground {

    public static final String KEY = "custom.background";
    private static final String PREV_PUSH = "custom.background.prev_push";
    private static final String PREV_KEEP = "custom.background.prev_keep";

    private TgYouBackground() {
    }

    public static boolean batteryExempt() {
        try {
            Context c = ApplicationLoader.applicationContext;
            PowerManager pm = (PowerManager) c.getSystemService(Context.POWER_SERVICE);
            return Build.VERSION.SDK_INT < 23 || pm.isIgnoringBatteryOptimizations(c.getPackageName());
        } catch (Throwable e) {
            return false;
        }
    }

    public static void set(Activity activity, boolean on) {
        try {
            SharedPreferences push = MessagesController.getGlobalNotificationsSettings();
            SharedPreferences main = MessagesController.getMainSettings(UserConfig.selectedAccount);
            if (on) {
                TgYouPrefs.setInt(PREV_PUSH, push.contains("pushService") ? (push.getBoolean("pushService", true) ? 1 : 0) : -1);
                TgYouPrefs.setInt(PREV_KEEP, main.getBoolean("keepAliveService", false) ? 1 : 0);
                push.edit().putBoolean("pushService", true).apply();
                main.edit().putBoolean("keepAliveService", true).apply();
                if (!batteryExempt() && Build.VERSION.SDK_INT >= 23) {
                    Intent intent = new Intent(Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS, Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    if (activity != null) {
                        activity.startActivity(intent);
                    } else {
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        ApplicationLoader.applicationContext.startActivity(intent);
                    }
                }
            } else {
                int prevPush = TgYouPrefs.integer(PREV_PUSH, -1);
                SharedPreferences.Editor e = push.edit();
                if (prevPush < 0) {
                    e.remove("pushService");
                } else {
                    e.putBoolean("pushService", prevPush == 1);
                }
                e.apply();
                main.edit().putBoolean("keepAliveService", TgYouPrefs.integer(PREV_KEEP, 0) == 1).apply();
            }
            ApplicationLoader.startPushService();
        } catch (Throwable ignore) {
        }
    }
}
