package com.tgyou.mods;

import android.content.Context;
import android.content.SharedPreferences;

import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginHost;

import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

import java.io.File;
import java.io.InputStream;

/** Starts the embedded Python and loads installed mods into the {@link PluginHost}. */
public final class ModRuntime {

    private static final String BUNDLED = "mods/";
    /** Mods shipped inside the APK; they are installed once and can be removed by the user. */
    private static final String[] BUNDLED_MODS = {"stats"};

    private static final String PREFS = "tgyou_mods";
    private static final String KEY_LOADING = "loading";
    private static final String KEY_QUARANTINE = "quarantine";

    private static ModStore store;
    private static volatile boolean started;

    private ModRuntime() {
    }

    public static synchronized ModStore store(Context context) {
        if (store == null) {
            store = new ModStore(context.getApplicationContext());
        }
        return store;
    }

    /** Called by the host after the built-in plugins are registered. Runs in the background. */
    public static void loadAll(PluginHost host, Context context) {
        Utilities.globalQueue.postRunnable(() -> {
            try {
                installCrashGuard(context);
                SharedPreferences prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
                String crashed = prefs.getString(KEY_LOADING, "");
                if (!crashed.isEmpty()) {
                    quarantine(context, crashed);
                    prefs.edit().remove(KEY_LOADING).commit();
                }
                installBundled(context);
                ensurePython(context);
                for (ModManifest manifest : store(context).installed()) {
                    try {
                        host.registerMod(guarded(context, manifest));
                    } catch (Throwable t) {
                        FileLog.e("tgyou: mod " + manifest.id + " skipped", t);
                    }
                }
            } catch (Throwable t) {
                FileLog.e("tgyou: mods failed to load", t);
            }
        });
    }

    public static synchronized void ensurePython(Context context) {
        if (!started) {
            if (!Python.isStarted()) {
                Python.start(new AndroidPlatform(context.getApplicationContext()));
            }
            started = true;
        }
    }

    /** Installs (or reloads) one mod and registers it right away. */
    public static PyMod activate(Context context, ModManifest manifest) {
        ensurePython(context);
        release(context, manifest.id);
        PyMod mod = guarded(context, manifest);
        PluginHost host = PluginHost.get();
        if (host != null) {
            host.registerMod(mod);
        }
        return mod;
    }

    private static PyMod guarded(Context context, ModManifest manifest) {
        return new PyMod(manifest, store(context).dirOf(manifest.id));
    }

    /** The marker survives a crash during on_load; the next start quarantines that mod. */
    static void markLoading(Context context, String id) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit().putString(KEY_LOADING, id).commit();
    }

    static void markLoaded(Context context) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit().remove(KEY_LOADING).commit();
    }

    static boolean isQuarantined(Context context, String id) {
        return context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getStringSet(KEY_QUARANTINE, java.util.Collections.emptySet()).contains(id);
    }

    private static void quarantine(Context context, String id) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
        java.util.Set<String> set = new java.util.HashSet<>(prefs.getStringSet(KEY_QUARANTINE, java.util.Collections.emptySet()));
        set.add(id);
        prefs.edit().putStringSet(KEY_QUARANTINE, set).commit();
    }

    private static void release(Context context, String id) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
        java.util.Set<String> set = new java.util.HashSet<>(prefs.getStringSet(KEY_QUARANTINE, java.util.Collections.emptySet()));
        if (set.remove(id)) {
            prefs.edit().putStringSet(KEY_QUARANTINE, set).commit();
        }
    }

    /** A Java crash whose stack passes through mod code quarantines every mod, so the app starts again. */
    private static void installCrashGuard(Context context) {
        final Thread.UncaughtExceptionHandler previous = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler((thread, error) -> {
            try {
                boolean fromMod = false;
                for (Throwable t = error; t != null && !fromMod; t = t.getCause()) {
                    for (StackTraceElement e : t.getStackTrace()) {
                        String c = e.getClassName();
                        if (c.startsWith("com.tgyou.mods.") || c.startsWith("com.chaquo.") || c.contains("tgyou_mod_")) {
                            fromMod = true;
                            break;
                        }
                    }
                }
                if (fromMod) {
                    for (ModManifest m : store(context).installed()) {
                        quarantine(context, m.id);
                    }
                }
            } catch (Throwable ignore) {
            }
            if (previous != null) {
                previous.uncaughtException(thread, error);
            }
        });
    }

    public static void uninstall(Context context, String id) {
        PluginHost host = PluginHost.get();
        if (host != null) {
            host.unregister(id);
        }
        ModPages.removeAll(id);
        store(context).remove(id);
    }

    public static Plugin find(String id) {
        PluginHost host = PluginHost.get();
        return host == null ? null : host.find(id);
    }

    private static void installBundled(Context context) throws Exception {
        SharedPreferences prefs = context.getSharedPreferences("tgyou_mods", Context.MODE_PRIVATE);
        for (String id : BUNDLED_MODS) {
            if (prefs.getBoolean("bundled." + id, false)) {
                continue;
            }
            File dir = store(context).dirOf(id);
            dir.mkdirs();
            for (String file : new String[]{"manifest.json", "main.py"}) {
                try (InputStream in = context.getAssets().open(BUNDLED + id + "/" + file)) {
                    java.nio.file.Files.write(new File(dir, file).toPath(), ModStore.readAll(in));
                }
            }
            prefs.edit().putBoolean("bundled." + id, true).apply();
        }
    }
}
