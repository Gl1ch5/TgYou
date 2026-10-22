package com.tgyou.icons;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import java.util.concurrent.ConcurrentHashMap;

/** Resources that swap drawables for the ones of the active icon pack; everything else is untouched. */
@SuppressWarnings("deprecation")
final class PackResources extends Resources {

    private static final String NONE = "";
    private static final ConcurrentHashMap<Integer, String> names = new ConcurrentHashMap<>();

    private final Resources base;

    PackResources(Resources base) {
        super(base.getAssets(), base.getDisplayMetrics(), base.getConfiguration());
        this.base = base;
    }

    static void forgetNames() {
        names.clear();
    }

    @Override
    public Drawable getDrawable(int id, Theme theme) throws NotFoundException {
        return swap(id, super.getDrawable(id, theme));
    }

    @Override
    public Drawable getDrawableForDensity(int id, int density, Theme theme) {
        return swap(id, super.getDrawableForDensity(id, density, theme));
    }

    private Drawable swap(int id, Drawable original) {
        String name = names.get(id);
        if (name == null) {
            try {
                String type = getResourceTypeName(id);
                name = "drawable".equals(type) || "mipmap".equals(type) ? getResourceEntryName(id) : NONE;
            } catch (Throwable t) {
                name = NONE;
            }
            names.put(id, name);
        }
        if (name == NONE || name.isEmpty() || !IconPacks.has(name)) {
            return original;
        }
        Drawable replaced = IconPacks.replacement(this, name, original);
        return replaced != null ? replaced : original;
    }

    @Override
    public android.content.res.Configuration getConfiguration() {
        return base.getConfiguration();
    }

    @Override
    public android.util.DisplayMetrics getDisplayMetrics() {
        return base.getDisplayMetrics();
    }
}
