package com.tgyou.plugins;

import android.widget.Toast;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.PluginSettings;
import com.tgyou.core.Section;
import com.tgyou.core.SettingField;

import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.TranscribeButton;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * Replaces Telegram's Premium voice-to-text with Whisper on Groq, using the user's own API key.
 * The voice file is uploaded to Groq; nothing goes through any server of ours.
 */
public final class WhisperTranscribePlugin implements Plugin {

    private static final String ENDPOINT = "https://api.groq.com/openai/v1/audio/transcriptions";
    private static final String KEY_API = "api_key";
    private static final String KEY_MODEL = "model";
    private static final String KEY_LANGUAGE = "language";

    private final Set<String> inFlight = new HashSet<>();
    private PluginSettings settings;

    @Override
    public String id() {
        return "whisper_transcribe";
    }

    @Override
    public String name() {
        return "Распознавание голосовых (Whisper)";
    }

    @Override
    public String description() {
        return "Расшифровка голосовых через Whisper на Groq вместо Premium-функции Telegram. "
                + "Нужен свой API-ключ Groq. Голосовое отправляется в Groq.";
    }

    @Override
    public Section section() {
        return Section.AI;
    }

    @Override
    public List<SettingField> fields() {
        return Arrays.asList(
                SettingField.secret(KEY_API, "API-ключ Groq"),
                SettingField.text(KEY_MODEL, "Модель", "whisper-large-v3-turbo"),
                SettingField.text(KEY_LANGUAGE, "Язык (ru, en…, пусто — авто)", "")
        );
    }

    @Override
    public void onLoad(PluginContext context) {
        settings = context.settings();
        context.on(Hooks.TRANSCRIBE_AVAILABLE, (message, current) -> current || message != null && message.isVoice());
        context.on(Hooks.TRANSCRIBE_REQUEST, (message, current) -> {
            if (current || message == null) {
                return current;
            }
            start(message);
            return true;
        });
    }

    private void start(MessageObject message) {
        String apiKey = settings.getString(KEY_API, "").trim();
        if (apiKey.isEmpty()) {
            toast("Укажите API-ключ Groq: Настройки → TgYou");
            fail(message);
            return;
        }
        File file = FileLoader.getInstance(message.currentAccount).getPathToMessage(message.messageOwner);
        if (file == null || !file.exists()) {
            toast("Голосовое ещё не загружено, нажмите на него и повторите");
            fail(message);
            return;
        }
        final String id = message.currentAccount + "_" + message.getDialogId() + "_" + message.getId();
        synchronized (inFlight) {
            if (!inFlight.add(id)) {
                return;
            }
        }
        final String model = settings.getString(KEY_MODEL, "whisper-large-v3-turbo").trim();
        final String language = settings.getString(KEY_LANGUAGE, "").trim();
        Utilities.globalQueue.postRunnable(() -> {
            try {
                String text = transcribe(file, apiKey, model, language);
                done(message, text);
            } catch (Throwable t) {
                FileLog.e("tgyou: whisper failed", t);
                toast("Не удалось распознать: " + t.getMessage());
                fail(message);
            } finally {
                synchronized (inFlight) {
                    inFlight.remove(id);
                }
            }
        });
    }

    private static String transcribe(File file, String apiKey, String model, String language) throws Exception {
        String boundary = "tgyou" + UUID.randomUUID().toString().replace("-", "");
        HttpURLConnection connection = (HttpURLConnection) new URL(ENDPOINT).openConnection();
        try {
            connection.setConnectTimeout(15000);
            connection.setReadTimeout(60000);
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setRequestProperty("Authorization", "Bearer " + apiKey);
            connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
            try (OutputStream out = connection.getOutputStream()) {
                writeField(out, boundary, "model", model.isEmpty() ? "whisper-large-v3-turbo" : model);
                writeField(out, boundary, "response_format", "json");
                if (!language.isEmpty()) {
                    writeField(out, boundary, "language", language);
                }
                out.write(("--" + boundary + "\r\nContent-Disposition: form-data; name=\"file\"; filename=\"voice.ogg\"\r\n"
                        + "Content-Type: audio/ogg\r\n\r\n").getBytes(StandardCharsets.UTF_8));
                try (InputStream in = new FileInputStream(file)) {
                    byte[] buffer = new byte[16 * 1024];
                    int read;
                    while ((read = in.read(buffer)) != -1) {
                        out.write(buffer, 0, read);
                    }
                }
                out.write(("\r\n--" + boundary + "--\r\n").getBytes(StandardCharsets.UTF_8));
            }
            int code = connection.getResponseCode();
            InputStream stream = code >= 200 && code < 300 ? connection.getInputStream() : connection.getErrorStream();
            String body = readAll(stream);
            if (code < 200 || code >= 300) {
                String message = "HTTP " + code;
                try {
                    message = new JSONObject(body).getJSONObject("error").getString("message");
                } catch (Throwable ignore) {
                }
                throw new Exception(message);
            }
            return new JSONObject(body).getString("text").trim();
        } finally {
            connection.disconnect();
        }
    }

    private static void writeField(OutputStream out, String boundary, String name, String value) throws Exception {
        out.write(("--" + boundary + "\r\nContent-Disposition: form-data; name=\"" + name + "\"\r\n\r\n"
                + value + "\r\n").getBytes(StandardCharsets.UTF_8));
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

    private static void done(MessageObject message, String text) {
        int account = message.currentAccount;
        TranscribeButton.openVideoTranscription(message);
        message.messageOwner.voiceTranscriptionOpen = true;
        message.messageOwner.voiceTranscriptionFinal = true;
        MessagesStorage.getInstance(account).updateMessageVoiceTranscription(message.getDialogId(), message.getId(), text, message.messageOwner);
        TranscribeButton.finishTranscription(message, 0, text);
    }

    private static void fail(MessageObject message) {
        AndroidUtilities.runOnUIThread(() -> {
            NotificationCenter.getInstance(message.currentAccount).postNotificationName(NotificationCenter.voiceTranscriptionUpdate, message);
            NotificationCenter.getInstance(message.currentAccount).postNotificationName(NotificationCenter.updateTranscriptionLock);
        });
    }

    private static void toast(String text) {
        AndroidUtilities.runOnUIThread(() -> Toast.makeText(ApplicationLoader.applicationContext, text, Toast.LENGTH_LONG).show());
    }
}
