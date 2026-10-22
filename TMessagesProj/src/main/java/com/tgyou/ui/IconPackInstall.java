package com.tgyou.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.OpenableColumns;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.tgyou.icons.IconPacks;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;

import java.io.InputStream;

/** Opening a .icons file from a file manager offers to install (and apply) the pack right away. */
public final class IconPackInstall {

    private IconPackInstall() {
    }

    /** @return true when the intent is a .icons file; the install offer is shown asynchronously */
    public static boolean handle(Activity activity, Intent intent) {
        if (intent == null || !Intent.ACTION_VIEW.equals(intent.getAction())) {
            return false;
        }
        Uri uri = intent.getData();
        if (uri == null || !displayName(activity, uri).toLowerCase().endsWith(".icons")) {
            return false;
        }
        offer(activity, uri);
        return true;
    }

    static String displayName(Context context, Uri uri) {
        if ("content".equals(uri.getScheme())) {
            try (Cursor c = context.getContentResolver().query(uri, new String[]{OpenableColumns.DISPLAY_NAME}, null, null, null)) {
                if (c != null && c.moveToFirst()) {
                    String name = c.getString(0);
                    if (name != null) {
                        return name;
                    }
                }
            } catch (Throwable ignore) {
            }
        }
        String last = uri.getLastPathSegment();
        return last == null ? "" : last;
    }

    public static void offer(Activity activity, Uri uri) {
        Utilities.globalQueue.postRunnable(() -> {
            try (InputStream in = activity.getContentResolver().openInputStream(uri)) {
                byte[] bytes = com.tgyou.mods.ModStore.readAll(in);
                offer(activity, bytes, null);
            } catch (Throwable t) {
                FileLog.e(t);
                AndroidUtilities.runOnUIThread(() -> Toast.makeText(activity, "Не удалось прочитать файл иконок", Toast.LENGTH_LONG).show());
            }
        });
    }

    /** Shows the install dialog with a preview; {@code done} runs on the UI thread after a successful install. */
    public static void offer(Context context, byte[] bytes, Runnable done) {
        try {
            if (!IconPacks.isPack(bytes)) {
                AndroidUtilities.runOnUIThread(() -> Toast.makeText(context, "Это не иконпак: нет metadata.json", Toast.LENGTH_LONG).show());
                return;
            }
            IconPacks.Preview preview = IconPacks.previewZip(context, bytes, 12, AndroidUtilities.dp(40));
            AndroidUtilities.runOnUIThread(() -> {
                LinearLayout box = new LinearLayout(context);
                box.setOrientation(LinearLayout.VERTICAL);
                box.addView(IconPackViews.centered(context, IconPackViews.grid(context, preview.icons, 4, 52)));
                String meta = (preview.pack.author.isEmpty() ? "" : preview.pack.author + " · ") + preview.pack.icons + " иконок"
                        + (preview.pack.version.isEmpty() ? "" : " · v" + preview.pack.version);
                AlertDialog.Builder b = new AlertDialog.Builder(context);
                b.setTitle("Установить иконки «" + preview.pack.name + "»?");
                b.setMessage(meta);
                b.setView(box);
                b.setPositiveButton("Установить и включить", (d, w) -> install(context, bytes, true, done));
                b.setNeutralButton("Только установить", (d, w) -> install(context, bytes, false, done));
                b.setNegativeButton("Отмена", null);
                b.show();
            });
        } catch (Throwable t) {
            FileLog.e(t);
            AndroidUtilities.runOnUIThread(() -> Toast.makeText(context, "Иконпак не установлен: " + t.getMessage(), Toast.LENGTH_LONG).show());
        }
    }

    private static void install(Context context, byte[] bytes, boolean apply, Runnable done) {
        Utilities.globalQueue.postRunnable(() -> {
            try {
                IconPacks.Pack pack = IconPacks.install(context, bytes);
                if (apply) {
                    IconPacks.activate(context, pack.id);
                }
                AndroidUtilities.runOnUIThread(() -> {
                    Toast.makeText(context, apply ? "Иконки применены. Перезапустите приложение для полного эффекта" : "Иконпак установлен", Toast.LENGTH_LONG).show();
                    if (done != null) {
                        done.run();
                    }
                });
            } catch (Throwable t) {
                FileLog.e(t);
                AndroidUtilities.runOnUIThread(() -> Toast.makeText(context, "Не удалось установить: " + t.getMessage(), Toast.LENGTH_LONG).show());
            }
        });
    }
}
