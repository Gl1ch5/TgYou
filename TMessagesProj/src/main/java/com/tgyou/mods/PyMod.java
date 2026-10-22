package com.tgyou.mods;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.Section;
import com.tgyou.core.SettingField;

import org.telegram.messenger.FileLog;

import java.io.File;
import java.util.List;

/** A Python mod from {@code files/mods/<id>/} run as an ordinary plugin. */
public final class PyMod implements Plugin {

    public final ModManifest manifest;
    private final File dir;
    private volatile String error;

    public PyMod(ModManifest manifest, File dir) {
        this.manifest = manifest;
        this.dir = dir;
    }

    /** Null when the mod loaded fine. */
    public String error() {
        return error;
    }

    @Override
    public String id() {
        return manifest.id;
    }

    @Override
    public String name() {
        return manifest.name;
    }

    @Override
    public String description() {
        return manifest.description;
    }

    @Override
    public Section section() {
        return Section.MISC;
    }

    @Override
    public boolean isMod() {
        return true;
    }

    @Override
    public boolean enabledByDefault() {
        return true;
    }

    @Override
    public List<SettingField> fields() {
        return manifest.settings;
    }

    @Override
    public void onLoad(PluginContext context) {
        ModPages.removeAll(manifest.id);
        try {
            Python py = Python.getInstance();
            PyObject sys = py.getModule("sys");
            sys.get("path").callAttr("insert", 0, dir.getAbsolutePath());
            PyObject util = py.getModule("importlib.util");
            PyObject spec = util.callAttr("spec_from_file_location", "tgyou_mod_" + manifest.id,
                    new File(dir, manifest.entry).getAbsolutePath());
            PyObject module = util.callAttr("module_from_spec", spec);
            spec.get("loader").callAttr("exec_module", module);
            module.callAttr("on_load", new ModApi(manifest.id, context));
        } catch (Throwable t) {
            error = String.valueOf(t.getMessage());
            FileLog.e("tgyou: mod " + manifest.id + " failed", t);
        }
    }
}
