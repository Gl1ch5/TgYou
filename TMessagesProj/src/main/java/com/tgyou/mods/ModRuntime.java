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
                installBundled(context);
                ensurePython(context);
                for (ModManifest manifest : store(context).installed()) {
                    host.registerMod(new PyMod(manifest, store(context).dirOf(manifest.id)));
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
        PyMod mod = new PyMod(manifest, store(context).dirOf(manifest.id));
        PluginHost host = PluginHost.get();
        if (host != null) {
            host.registerMod(mod);
        }
        return mod;
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
