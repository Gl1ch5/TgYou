package com.tgyou.mods;

import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/** Client of the mod marketplace (backend/). */
public final class MarketClient {

    public static final String BASE = "https://grzxk.ru/tgyou";

    public static final class Item {
        public String id;
        public String name;
        public String description;
        public String category;
        public String author;
        public String version;
        public String sha256;
        public String changelog;
        public long size;
        public int downloads;
    }

    public interface ListCallback {
        void done(List<Item> items, String error);
    }

    public interface InstallCallback {
        void done(ModManifest manifest, String error);
    }

    private MarketClient() {
    }

    public static void list(String query, ListCallback callback) {
        Utilities.globalQueue.postRunnable(() -> {
            List<Item> items = new ArrayList<>();
            String error = null;
            try {
                String url = BASE + "/api/v1/plugins?per_page=50&q=" + URLEncoder.encode(query == null ? "" : query, "UTF-8");
                JSONArray array = new JSONObject(new String(get(url), "UTF-8")).getJSONArray("items");
                for (int i = 0; i < array.length(); i++) {
                    JSONObject o = array.getJSONObject(i);
                    JSONObject latest = o.optJSONObject("latest");
                    if (latest == null) {
                        continue;
                    }
                    Item item = new Item();
                    item.id = o.getString("id");
                    item.name = o.getString("name");
                    item.description = o.optString("description");
                    item.category = o.optString("category");
                    item.author = o.optString("author");
                    item.downloads = o.optInt("downloads");
                    item.version = latest.getString("version");
                    item.sha256 = latest.getString("sha256");
                    item.size = latest.optLong("size");
                    item.changelog = latest.optString("changelog");
                    items.add(item);
                }
            } catch (Throwable t) {
                error = t.getMessage() != null ? t.getMessage() : t.toString();
            }
            String err = error;
            AndroidUtilities.runOnUIThread(() -> callback.done(items, err));
        });
    }

    /** Downloads, verifies the SHA-256 from the catalogue, unpacks and activates the mod. */
    public static void install(android.content.Context context, Item item, InstallCallback callback) {
        Utilities.globalQueue.postRunnable(() -> {
            ModManifest manifest = null;
            String error = null;
            try {
                byte[] zip = get(BASE + "/api/v1/plugins/" + item.id + "/download?version=" + URLEncoder.encode(item.version, "UTF-8"));
                manifest = ModRuntime.store(context).install(zip, item.sha256);
                ModRuntime.activate(context, manifest);
            } catch (Throwable t) {
                error = t.getMessage() != null ? t.getMessage() : t.toString();
            }
            ModManifest result = manifest;
            String err = error;
            AndroidUtilities.runOnUIThread(() -> callback.done(result, err));
        });
    }

    private static byte[] get(String url) throws Exception {
        HttpURLConnection c = (HttpURLConnection) new URL(url).openConnection();
        c.setConnectTimeout(15000);
        c.setReadTimeout(30000);
        if (c.getResponseCode() != 200) {
            throw new IllegalStateException("Сервер ответил " + c.getResponseCode());
        }
        return ModStore.readAll(c.getInputStream());
    }
}
