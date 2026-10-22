package com.tgyou.update;

import android.app.Activity;
import android.content.Context;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/** Keeps the update state of the app: checks releases every minute while the app is open, downloads on request. */
public final class UpdateManager {

    private static final long INTERVAL = 60_000L;

    public interface Listener {
        void onUpdateChanged();
    }

    private static Updater.Release release;
    private static File downloaded;
    private static int progress = -1;
    private static boolean checking;
    private static boolean running;
    private static String promptedTag = "";
    private static final List<Listener> listeners = new ArrayList<>();

    private static final Runnable tick = UpdateManager::tickNow;

    private static void tickNow() {
        if (!running) {
            return;
        }
        check(false);
        AndroidUtilities.runOnUIThread(tick, INTERVAL);
    }

    private UpdateManager() {
    }

    public static Updater.Release release() {
        return release;
    }

    public static boolean hasUpdate() {
        return release != null;
    }

    public static boolean isDownloading() {
        return progress >= 0 && downloaded == null;
    }

    public static int progress() {
        return progress;
    }

    public static File downloaded() {
        return downloaded;
    }

    public static boolean isChecking() {
        return checking;
    }

    public static void addListener(Listener l) {
        listeners.add(l);
    }

    public static void removeListener(Listener l) {
        listeners.remove(l);
    }

    private static void notifyChanged() {
        for (Listener l : new ArrayList<>(listeners)) {
            l.onUpdateChanged();
        }
    }

    /** Called when the app comes to the foreground: checks at once and then every minute. */
    public static void onResume(Activity activity) {
        if (running) {
            return;
        }
        running = true;
        check(true);
        AndroidUtilities.runOnUIThread(tick, INTERVAL);
    }

    public static void onPause() {
        running = false;
        AndroidUtilities.cancelRunOnUIThread(tick);
    }

    public static void check(boolean prompt) {
        if (checking || isDownloading()) {
            return;
        }
        checking = true;
        notifyChanged();
        Updater.check((rel, isNewer, error) -> {
            checking = false;
            if (error == null) {
                Updater.Release before = release;
                release = isNewer ? rel : null;
                if (before == null || release == null || !before.tag.equals(release.tag)) {
                    downloaded = null;
                    progress = -1;
                }
                // builds from the branch have no release tag and are not nagged
                if (release != null && !Updater.installedTag().isEmpty() && !release.tag.equals(promptedTag)) {
                    promptedTag = release.tag;
                    UpdateDialog.show(release);
                }
            }
            notifyChanged();
        });
    }

    public static void download() {
        if (release == null || isDownloading()) {
            return;
        }
        Context context = ApplicationLoader.applicationContext;
        if (downloaded != null) {
            Updater.install(context, downloaded);
            return;
        }
        progress = 0;
        notifyChanged();
        Updater.download(context, release, new Updater.DownloadCallback() {
            @Override
            public void progress(int percent) {
                progress = percent;
                notifyChanged();
            }

            @Override
            public void done(File apk, String error) {
                if (error != null) {
                    progress = -1;
                    downloaded = null;
                } else {
                    downloaded = apk;
                    progress = 100;
                    Updater.install(context, apk);
                }
                notifyChanged();
            }
        });
    }
}
