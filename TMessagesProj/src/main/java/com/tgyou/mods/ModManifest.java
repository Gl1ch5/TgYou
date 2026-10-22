package com.tgyou.mods;

import com.tgyou.core.SettingField;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/** manifest.json of a mod. The same file is validated by the marketplace server. */
public final class ModManifest {

    public static final int API_VERSION = 1;
    private static final Pattern ID = Pattern.compile("^[a-z][a-z0-9_]{2,39}$");
    private static final Pattern VERSION = Pattern.compile("^\\d+\\.\\d+\\.\\d+(-[0-9A-Za-z.]+)?$");

    public final String id;
    public final String name;
    public final String version;
    public final int apiVersion;
    public final String description;
    public final String author;
    public final String category;
    public final String entry;
    public final List<SettingField> settings;

    private ModManifest(JSONObject o) throws Exception {
        id = o.getString("id");
        if (!ID.matcher(id).matches()) {
            throw new IllegalArgumentException("id: ^[a-z][a-z0-9_]{2,39}$");
        }
        name = o.getString("name");
        version = o.getString("version");
        if (!VERSION.matcher(version).matches()) {
            throw new IllegalArgumentException("version: 1.2.3");
        }
        apiVersion = o.getInt("api_version");
        if (apiVersion > API_VERSION) {
            throw new IllegalArgumentException("мод требует более новое API (" + apiVersion + "), в приложении " + API_VERSION);
        }
        description = o.optString("description");
        author = o.optString("author");
        category = o.optString("category", "other");
        entry = o.optString("entry", "main.py");
        if (entry.contains("..") || entry.startsWith("/") || !entry.endsWith(".py")) {
            throw new IllegalArgumentException("entry: относительный путь к .py");
        }
        List<SettingField> fields = new ArrayList<>();
        JSONArray array = o.optJSONArray("settings");
        for (int i = 0; array != null && i < array.length(); i++) {
            JSONObject f = array.getJSONObject(i);
            String key = f.getString("key");
            String title = f.getString("title");
            String def = f.optString("default", "");
            switch (f.optString("type", "text")) {
                case "toggle":
                    fields.add(SettingField.toggle(key, title, f.optBoolean("default", false)));
                    break;
                case "secret":
                    fields.add(SettingField.secret(key, title));
                    break;
                case "choice": {
                    JSONArray opts = f.getJSONArray("options");
                    String[] options = new String[opts.length()];
                    for (int j = 0; j < options.length; j++) {
                        options[j] = opts.getString(j);
                    }
                    fields.add(SettingField.choice(key, title, def.isEmpty() ? options[0] : def, options));
                    break;
                }
                default:
                    fields.add(SettingField.text(key, title, def));
            }
        }
        settings = fields;
    }

    public static ModManifest parse(String json) throws Exception {
        return new ModManifest(new JSONObject(json));
    }
}
