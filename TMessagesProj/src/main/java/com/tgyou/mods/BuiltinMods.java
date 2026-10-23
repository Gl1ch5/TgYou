package com.tgyou.mods;

import android.content.Context;

import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/** Mods shipped inside the app (assets/market/<id>/), shown first in the marketplace and installable offline. */
public final class BuiltinMods {

    private static final String DIR = "market";

    private BuiltinMods() {
    }

    public static List<MarketClient.Item> list(Context context) {
        List<MarketClient.Item> items = new ArrayList<>();
        try {
            String[] ids = context.getAssets().list(DIR);
            for (String id : ids == null ? new String[0] : ids) {
                JSONObject o = new JSONObject(new String(read(context, DIR + "/" + id + "/manifest.json"), "UTF-8"));
                MarketClient.Item item = new MarketClient.Item();
                item.id = o.getString("id");
                item.name = o.getString("name");
                item.description = o.optString("description");
                item.category = o.optString("category");
                item.author = o.optString("author", "TgYou");
                item.version = o.getString("version");
                item.builtin = true;
                items.add(item);
            }
        } catch (Throwable t) {
            org.telegram.messenger.FileLog.e("tgyou: builtin mods", t);
        }
        return items;
    }

    public static byte[] pack(Context context, String id) throws Exception {
        String base = DIR + "/" + id + "/";
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (ZipOutputStream zip = new ZipOutputStream(bos)) {
            String[] files = context.getAssets().list(DIR + "/" + id);
            for (String name : files == null ? new String[0] : files) {
                zip.putNextEntry(new ZipEntry(name));
                zip.write(read(context, base + name));
                zip.closeEntry();
            }
        }
        return bos.toByteArray();
    }

    private static byte[] read(Context context, String path) throws Exception {
        try (InputStream in = context.getAssets().open(path)) {
            return ModStore.readAll(in);
        }
    }
}
