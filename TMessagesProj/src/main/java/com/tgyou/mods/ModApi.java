package com.tgyou.mods;

import android.widget.Toast;

import com.chaquo.python.PyObject;
import com.tgyou.core.HookPoint;
import com.tgyou.core.Hooks;
import com.tgyou.core.MessageMenu;
import com.tgyou.core.PluginContext;
import com.tgyou.core.PluginSettings;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

import java.util.ArrayList;
import java.util.List;

/**
 * The object a Python mod receives in {@code on_load(api)}. Python has the whole app at hand
 * through {@code from java import jclass}; this class only adds the convenient entry points.
 *
 * <p>Hook names: request.outgoing, message.time, message.menu, message.edited, messages.deleted,
 * premium.check, window.secure. See docs/MODS.md.
 */
public final class ModApi {

    private final String modId;
    private final PluginContext context;

    ModApi(String modId, PluginContext context) {
        this.modId = modId;
        this.context = context;
    }

    public String modId() {
        return modId;
    }

    public String appVersion() {
        return BuildVars.BUILD_VERSION_STRING;
    }

    public int apiVersion() {
        return ModManifest.API_VERSION;
    }

    /** Subscribes a Python callable to a hook. Unknown names raise IllegalArgumentException. */
    @SuppressWarnings("unchecked")
    public void on(String hook, PyObject fn) {
        switch (hook) {
            case "request.outgoing":
                context.on(Hooks.OUTGOING_REQUEST, (request, blocked) -> {
                    PyObject r = fn.call(request.getClass().getSimpleName(), request);
                    return blocked || truthy(r);
                });
                break;
            case "menu.item":
                context.on(Hooks.ITEM_MENU, (menu, ignored) -> {
                    fn.call(menu);
                    return false;
                });
                break;
            case "app.event":
                context.on(Hooks.APP_EVENT, (event, ignored) -> {
                    fn.call(event);
                    return false;
                });
                break;
            case "request.response":
                context.on(Hooks.RESPONSE, (in, response) -> {
                    PyObject r = fn.call(in[0], in[1], response, in[2]);
                    if (r == null || isNone(r)) {
                        return response;
                    }
                    org.telegram.tgnet.TLObject replaced = r.toJava(org.telegram.tgnet.TLObject.class);
                    return replaced == null ? response : replaced;
                });
                break;
            case "updates.incoming":
                context.on(Hooks.UPDATES, (updates, dropped) -> dropped || truthy(fn.call(updates)));
                break;
            case "message.send":
                context.on(Hooks.SEND_MESSAGE, (params, cancelled) -> {
                    PyObject r = fn.call(org.telegram.messenger.UserConfig.selectedAccount, params);
                    return cancelled || truthy(r);
                });
                break;
            case "message.time":
                context.on(Hooks.MESSAGE_TIME, (message, time) -> {
                    PyObject r = fn.call(message, time == null ? "" : time.toString());
                    return r == null || isNone(r) ? time : r.toString();
                });
                break;
            case "message.menu":
                context.on(Hooks.MESSAGE_MENU, (menu, ignored) -> {
                    fn.call(menu);
                    return null;
                });
                break;
            case "message.edited":
                context.on(Hooks.MESSAGE_EDITED, (edited, ignored) -> {
                    fn.call(edited.account, edited.message);
                    return null;
                });
                break;
            case "messages.deleted":
                context.on(Hooks.MESSAGES_DELETED, (deleted, ids) -> {
                    PyObject r = fn.call(deleted.account, deleted.dialogKey, ids);
                    if (r == null || isNone(r)) {
                        return ids;
                    }
                    List<Integer> result = new ArrayList<>();
                    for (PyObject item : r.asList()) {
                        result.add(item.toJava(Integer.class));
                    }
                    return result;
                });
                break;
            case "premium.check":
                context.on(Hooks.PREMIUM_CHECK, (input, current) -> current || truthy(fn.call()));
                break;
            case "window.secure":
                context.on(Hooks.FLAG_SECURE, (input, secure) -> {
                    PyObject r = fn.call(secure);
                    return isNone(r) ? secure : truthy(r);
                });
                break;
            default:
                throw new IllegalArgumentException("unknown hook: " + hook);
        }
    }

    /** Adds a page to the TgYou settings; fn() returns a list of (title, value) pairs. */
    public void addPage(String title, PyObject fn) {
        ModPages.add(modId, title, () -> {
            List<String[]> rows = new ArrayList<>();
            try {
                for (PyObject row : fn.call().asList()) {
                    List<PyObject> pair = row.asList();
                    rows.add(new String[]{pair.get(0).toString(), pair.size() > 1 ? pair.get(1).toString() : ""});
                }
            } catch (Throwable t) {
                FileLog.e("tgyou: mod page " + modId, t);
                rows.add(new String[]{"Ошибка мода", String.valueOf(t.getMessage())});
            }
            return rows;
        });
    }

    /** Python-style names used by mods (api.hook, api.add_page, api.settings_get ...). */
    public void hook(String name, PyObject fn) {
        on(name, fn);
    }

    /** Callback of a settings button ("key") or of a changed value ("change:key"); fn(value_as_text). */
    public void action(String key, PyObject fn) {
        ModActions.register(modId, key, fn);
    }

    /** Xposed-style hook; before/after/replace are Python callables taking one Param (or None). Returns a handle or null. */
    public Object hookMethod(Object member, PyObject before, PyObject after, PyObject replace) {
        return PineHooks.hook(modId, context, (java.lang.reflect.Member) member, before, after, replace);
    }

    public void unhookMethod(Object handle) {
        PineHooks.unhook(handle);
    }

    /** An entry for the drawer/main menu of exteraGram plugins; it appears on the TgYou screen. */
    public void addMenuAction(String title, PyObject fn) {
        ModPages.addAction(modId, title, () -> {
            try {
                fn.call();
            } catch (Throwable t) {
                ModLog.add(modId, "menu " + title + ": " + t);
            }
        });
    }

    public void add_page(String title, PyObject fn) {
        addPage(title, fn);
    }

    public String settings_get(String key, String def) {
        return getString(key, def);
    }

    public void settings_put(String key, String value) {
        putString(key, value);
    }

    public String getString(String key, String def) {
        return settings().getString(key, def);
    }

    public void putString(String key, String value) {
        settings().putString(key, value);
    }

    public boolean getBool(String key, boolean def) {
        return settings().getBoolean(key, def);
    }

    public void putBool(String key, boolean value) {
        settings().putBoolean(key, value);
    }

    public void toast(String text) {
        AndroidUtilities.runOnUIThread(() ->
                Toast.makeText(ApplicationLoader.applicationContext, text, Toast.LENGTH_SHORT).show());
    }

    public void log(String text) {
        FileLog.d("tgyou mod " + modId + ": " + text);
        ModLog.add(modId, text);
    }

    /** Resource id of a menu icon by short name, e.g. "info" -> R.drawable.msg_info; 0 if unknown. */
    public int icon(String name) {
        try {
            return R.drawable.class.getField("msg_" + name).getInt(null);
        } catch (Throwable t) {
            return 0;
        }
    }

    private PluginSettings settings() {
        return context.settings();
    }

    private static boolean isNone(PyObject o) {
        return o == null || o.toJava(Object.class) == null;
    }

    private static boolean truthy(PyObject o) {
        return !isNone(o) && o.toBoolean();
    }
}
