package com.tgyou.core;

import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * Краткая сводка текста через Groq (чат-модель) с ключом пользователя из плагина «Распознавание
 * голосовых»: тот же ключ и тот же адрес API, только путь /chat/completions.
 */
public final class TgYouAi {

    public static final String MODEL = "ai.chat_model";
    public static final String DEFAULT_MODEL = "llama-3.3-70b-versatile";
    private static final String WHISPER_ID = "whisper_transcribe";
    private static final String DEFAULT_ENDPOINT = "https://grzxk.ru/tgyou/groq/openai/v1/audio/transcriptions";

    private TgYouAi() {
    }

    private static PluginSettings whisperSettings() {
        PluginHost host = PluginHost.get();
        Plugin plugin = host == null ? null : host.find(WHISPER_ID);
        return plugin == null ? null : host.settingsOf(plugin);
    }

    public static boolean hasKey() {
        PluginSettings s = whisperSettings();
        return s != null && !s.getString("api_key", "").trim().isEmpty();
    }

    public static void summarize(BaseFragment fragment, String text) {
        PluginSettings s = whisperSettings();
        String key = s == null ? "" : s.getString("api_key", "").trim();
        if (key.isEmpty()) {
            Toast.makeText(ApplicationLoader.applicationContext, "Укажите API-ключ Groq: Настройки TgYou, раздел ИИ", Toast.LENGTH_LONG).show();
            return;
        }
        if (text == null || text.trim().isEmpty()) {
            return;
        }
        String endpoint = s.getString("endpoint", DEFAULT_ENDPOINT).trim();
        if (endpoint.isEmpty()) {
            endpoint = DEFAULT_ENDPOINT;
        }
        final String url = endpoint.contains("/audio/transcriptions") ? endpoint.replace("/audio/transcriptions", "/chat/completions") : endpoint;
        final String model = TgYouPrefs.str(MODEL, DEFAULT_MODEL).trim().isEmpty() ? DEFAULT_MODEL : TgYouPrefs.str(MODEL, DEFAULT_MODEL).trim();
        final AlertDialog progress = fragment != null && fragment.getParentActivity() != null ? new AlertDialog(fragment.getParentActivity(), AlertDialog.ALERT_TYPE_SPINNER) : null;
        if (progress != null) {
            progress.setCanCancel(true);
            progress.showDelayed(150);
        }
        final String input = text.length() > 12000 ? text.substring(0, 12000) : text;
        Utilities.globalQueue.postRunnable(() -> {
            String result;
            String error = null;
            try {
                result = request(url, key, model, input);
            } catch (Throwable t) {
                FileLog.e("tgyou: ai summary failed", t);
                result = null;
                error = t.getMessage();
            }
            final String shown = result;
            final String failed = error;
            AndroidUtilities.runOnUIThread(() -> {
                if (progress != null) {
                    progress.dismiss();
                }
                if (shown == null) {
                    Toast.makeText(ApplicationLoader.applicationContext, "Не удалось получить сводку: " + failed, Toast.LENGTH_LONG).show();
                } else if (fragment != null && fragment.getParentActivity() != null) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(fragment.getParentActivity());
                    builder.setTitle("Краткая сводка");
                    builder.setMessage(shown);
                    builder.setPositiveButton("OK", null);
                    fragment.showDialog(builder.create());
                }
            });
        });
    }

    private static String request(String endpoint, String key, String model, String text) throws Exception {
        JSONObject system = new JSONObject().put("role", "system").put("content",
                "Кратко перескажи текст на языке оригинала в 2-4 предложениях. Только суть, без вступлений.");
        JSONObject user = new JSONObject().put("role", "user").put("content", text);
        JSONObject body = new JSONObject().put("model", model).put("temperature", 0.3).put("messages", new JSONArray().put(system).put(user));
        HttpURLConnection connection = (HttpURLConnection) new URL(endpoint).openConnection();
        try {
            connection.setConnectTimeout(15000);
            connection.setReadTimeout(60000);
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setRequestProperty("Authorization", "Bearer " + key);
            connection.setRequestProperty("Content-Type", "application/json");
            try (OutputStream out = connection.getOutputStream()) {
                out.write(body.toString().getBytes(StandardCharsets.UTF_8));
            }
            int code = connection.getResponseCode();
            InputStream stream = code >= 200 && code < 300 ? connection.getInputStream() : connection.getErrorStream();
            String response = readAll(stream);
            if (code < 200 || code >= 300) {
                String message = "HTTP " + code;
                try {
                    message = new JSONObject(response).getJSONObject("error").getString("message");
                } catch (Throwable ignore) {
                }
                throw new Exception(message);
            }
            return new JSONObject(response).getJSONArray("choices").getJSONObject(0).getJSONObject("message").getString("content").trim();
        } finally {
            connection.disconnect();
        }
    }

    private static String readAll(InputStream stream) throws Exception {
        if (stream == null) {
            return "";
        }
        try (InputStream in = stream; ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[4096];
            int read;
            while ((read = in.read(buffer)) != -1) {
                out.write(buffer, 0, read);
            }
            return out.toString("UTF-8");
        }
    }
}
