package com.tgyou.update;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

import androidx.core.content.FileProvider;

import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.Utilities;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/** Looks for newer TgYou builds in GitHub releases, downloads the APK and hands it to the system installer. */
public final class Updater {

    private static final String RELEASES = "https://api.github.com/repos/Gl1ch5/TgYou/releases?per_page=10";

    public static final class Release {
        public String tag;
        public String name;
        public String notes;
        public String apkUrl;
        public long size;
    }

    public interface CheckCallback {
        /** release is null when nothing newer exists; error is non-null on failure. */
        void done(Release release, boolean isNewer, String error);
    }

    public interface DownloadCallback {
        void progress(int percent);

        void done(File apk, String error);
    }

    private Updater() {
    }

    public static String installedTag() {
        return BuildConfig.TG_RELEASE_TAG;
    }

    public static void check(CheckCallback callback) {
        Utilities.globalQueue.postRunnable(() -> {
            Release found = null;
            String error = null;
            try {
                HttpURLConnection c = (HttpURLConnection) new URL(RELEASES).openConnection();
                c.setConnectTimeout(15000);
                c.setReadTimeout(20000);
                c.setRequestProperty("Accept", "application/vnd.github+json");
                if (c.getResponseCode() != 200) {
                    throw new IllegalStateException("GitHub ответил " + c.getResponseCode());
                }
                JSONArray list = new JSONArray(readAll(c.getInputStream()));
                for (int i = 0; i < list.length() && found == null; i++) {
                    JSONObject r = list.getJSONObject(i);
                    if (r.optBoolean("draft")) {
                        continue;
                    }
                    JSONArray assets = r.optJSONArray("assets");
                    for (int j = 0; assets != null && j < assets.length(); j++) {
                        JSONObject a = assets.getJSONObject(j);
                        if (a.optString("name").endsWith(".apk")) {
                            Release rel = new Release();
                            rel.tag = r.optString("tag_name");
                            rel.name = r.optString("name", rel.tag);
                            rel.notes = r.optString("body");
                            rel.apkUrl = a.optString("browser_download_url");
                            rel.size = a.optLong("size");
                            found = rel;
                            break;
                        }
                    }
                }
            } catch (Throwable t) {
                error = t.getMessage() != null ? t.getMessage() : t.toString();
            }
            Release result = found;
            boolean newer = result != null && !result.tag.equals(installedTag());
            String err = error;
            AndroidUtilities.runOnUIThread(() -> callback.done(result, newer, err));
        });
    }

    public static void download(Context context, Release release, DownloadCallback callback) {
        Utilities.globalQueue.postRunnable(() -> {
            File out = new File(new File(context.getFilesDir(), "cache"), "tgyou-update.apk");
            String error = null;
            try {
                out.getParentFile().mkdirs();
                HttpURLConnection c = (HttpURLConnection) new URL(release.apkUrl).openConnection();
                c.setConnectTimeout(15000);
                c.setReadTimeout(30000);
                if (c.getResponseCode() != 200) {
                    throw new IllegalStateException("Скачивание: " + c.getResponseCode());
                }
                long total = c.getContentLengthLong() > 0 ? c.getContentLengthLong() : release.size;
                try (InputStream in = c.getInputStream(); FileOutputStream fos = new FileOutputStream(out)) {
                    byte[] buf = new byte[64 * 1024];
                    long got = 0;
                    int last = -1;
                    int n;
                    while ((n = in.read(buf)) > 0) {
                        fos.write(buf, 0, n);
                        got += n;
                        int pct = total > 0 ? (int) (got * 100 / total) : 0;
                        if (pct != last) {
                            last = pct;
                            AndroidUtilities.runOnUIThread(() -> callback.progress(pct));
                        }
                    }
                }
            } catch (Throwable t) {
                error = t.getMessage() != null ? t.getMessage() : t.toString();
                out.delete();
            }
            String err = error;
            AndroidUtilities.runOnUIThread(() -> callback.done(err == null ? out : null, err));
        });
    }

    /** Opens the system installer; asks for the "install unknown apps" permission first when it is missing. */
    public static void install(Context context, File apk) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && !context.getPackageManager().canRequestPackageInstalls()) {
            Intent settings = new Intent(Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES, Uri.parse("package:" + context.getPackageName()));
            settings.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(settings);
            return;
        }
        Uri uri = FileProvider.getUriForFile(context, context.getPackageName() + ".provider", apk);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(uri, "application/vnd.android.package-archive");
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    private static String readAll(InputStream in) throws Exception {
        try (InputStream is = in; java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream()) {
            byte[] buf = new byte[8192];
            int n;
            while ((n = is.read(buf)) > 0) {
                bos.write(buf, 0, n);
            }
            return bos.toString("UTF-8");
        }
    }
}
