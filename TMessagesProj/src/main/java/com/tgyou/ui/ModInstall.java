package com.tgyou.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import com.tgyou.mods.ModManifest;
import com.tgyou.mods.ModRuntime;
import com.tgyou.mods.ModStore;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;

import java.io.InputStream;

/** Opening a .mod (TgYou) or .plugin (exteraGram) file offers to install it right away. */
public final class ModInstall {

    private ModInstall() {
    }

    /** @return true when the intent is a .mod / .plugin file; the install offer is shown asynchronously */
    public static boolean handle(Activity activity, Intent intent) {
        if (intent == null || !Intent.ACTION_VIEW.equals(intent.getAction())) {
            return false;
        }
        Uri uri = intent.getData();
        if (uri == null) {
            return false;
        }
        String name = IconPackInstall.displayName(activity, uri).toLowerCase();
        if (!name.endsWith(".mod") && !name.endsWith(".plugin")) {
            return false;
        }
        Utilities.globalQueue.postRunnable(() -> {
            try (InputStream in = activity.getContentResolver().openInputStream(uri)) {
                offer(activity, ModStore.readAll(in), null);
            } catch (Throwable t) {
                FileLog.e(t);
                AndroidUtilities.runOnUIThread(() -> Toast.makeText(activity, "Не удалось прочитать файл", Toast.LENGTH_LONG).show());
            }
        });
        return true;
    }

    /** Hook for AndroidUtilities.openForView: a downloaded .mod / .plugin / .icons opens the installer instead of "open with". */
    public static boolean interceptFile(Activity activity, java.io.File file, String fileName) {
        if (activity == null || file == null || fileName == null || !file.isFile()) {
            return false;
        }
        String name = fileName.toLowerCase();
        if (!name.endsWith(".mod") && !name.endsWith(".plugin") && !name.endsWith(".icons")) {
            return false;
        }
        Utilities.globalQueue.postRunnable(() -> {
            try (InputStream in = new java.io.FileInputStream(file)) {
                offer(activity, ModStore.readAll(in), null);
            } catch (Throwable t) {
                FileLog.e(t);
                AndroidUtilities.runOnUIThread(() -> Toast.makeText(activity, "Не удалось прочитать файл", Toast.LENGTH_LONG).show());
            }
        });
        return true;
    }

    /** Call off the UI thread. Shows the install dialog; {@code done} runs on the UI thread after a successful install. */
    public static void offer(Context context, byte[] bytes, Runnable done) {
        try {
            ModRuntime.ensurePython(context);
            boolean zip = bytes.length > 3 && bytes[0] == 'P' && bytes[1] == 'K';
            if (zip && com.tgyou.icons.IconPacks.isPack(bytes)) {
                IconPackInstall.offer(context, bytes, done);
                return;
            }
            ModManifest manifest = zip ? ModStore.peek(bytes) : ModRuntime.store(context).peekPlugin(bytes);
            boolean installed = ModRuntime.find(manifest.id) != null;
            AndroidUtilities.runOnUIThread(() -> {
                AlertDialog.Builder b = new AlertDialog.Builder(context);
                b.setTitle((installed ? "Обновить мод" : "Установить мод"));
                b.setView(card(context, manifest, zip ? "Мод TgYou" : "Плагин exteraGram"));
                b.setPositiveButton(installed ? "Обновить" : "Установить", (d, w) -> install(context, bytes, zip, done));
                b.setNegativeButton("Отмена", null);
                b.show();
            });
        } catch (Throwable t) {
            FileLog.e(t);
            AndroidUtilities.runOnUIThread(() -> Toast.makeText(context, "Не удалось прочитать мод: " + t.getMessage(), Toast.LENGTH_LONG).show());
        }
    }

    private static android.view.View card(Context context, ModManifest manifest, String kind) {
        android.widget.LinearLayout root = new android.widget.LinearLayout(context);
        root.setOrientation(android.widget.LinearLayout.VERTICAL);
        int pad = AndroidUtilities.dp(24);
        root.setPadding(pad, AndroidUtilities.dp(4), pad, 0);

        android.widget.LinearLayout head = new android.widget.LinearLayout(context);
        head.setGravity(android.view.Gravity.CENTER_VERTICAL);
        android.widget.TextView tile = new android.widget.TextView(context);
        String letter = manifest.name.isEmpty() ? "?" : manifest.name.substring(0, 1).toUpperCase();
        tile.setText(letter);
        tile.setGravity(android.view.Gravity.CENTER);
        tile.setTextSize(android.util.TypedValue.COMPLEX_UNIT_SP, 24);
        tile.setTypeface(AndroidUtilities.bold());
        tile.setTextColor(0xFFFFFFFF);
        android.graphics.drawable.GradientDrawable bg = new android.graphics.drawable.GradientDrawable(
                android.graphics.drawable.GradientDrawable.Orientation.TL_BR,
                new int[]{0xFF8E7CF0, 0xFF5B6CF0});
        bg.setCornerRadius(AndroidUtilities.dp(14));
        tile.setBackground(bg);
        head.addView(tile, new android.widget.LinearLayout.LayoutParams(AndroidUtilities.dp(56), AndroidUtilities.dp(56)));

        android.widget.LinearLayout names = new android.widget.LinearLayout(context);
        names.setOrientation(android.widget.LinearLayout.VERTICAL);
        android.widget.TextView name = new android.widget.TextView(context);
        name.setText(manifest.name);
        name.setTextSize(android.util.TypedValue.COMPLEX_UNIT_SP, 18);
        name.setTypeface(AndroidUtilities.bold());
        name.setTextColor(org.telegram.ui.ActionBar.Theme.getColor(org.telegram.ui.ActionBar.Theme.key_dialogTextBlack));
        names.addView(name);
        android.widget.TextView meta = new android.widget.TextView(context);
        meta.setText((manifest.author.isEmpty() ? "" : manifest.author + " · ") + "v" + manifest.version + " · " + kind);
        meta.setTextSize(android.util.TypedValue.COMPLEX_UNIT_SP, 13);
        meta.setTextColor(org.telegram.ui.ActionBar.Theme.getColor(org.telegram.ui.ActionBar.Theme.key_dialogTextGray2));
        names.addView(meta);
        android.widget.LinearLayout.LayoutParams np = new android.widget.LinearLayout.LayoutParams(0, android.view.ViewGroup.LayoutParams.WRAP_CONTENT, 1f);
        np.leftMargin = AndroidUtilities.dp(14);
        head.addView(names, np);
        root.addView(head);

        if (!manifest.description.isEmpty()) {
            android.widget.TextView desc = new android.widget.TextView(context);
            desc.setText(manifest.description);
            desc.setTextSize(android.util.TypedValue.COMPLEX_UNIT_SP, 15);
            desc.setTextColor(org.telegram.ui.ActionBar.Theme.getColor(org.telegram.ui.ActionBar.Theme.key_dialogTextBlack));
            desc.setPadding(0, AndroidUtilities.dp(14), 0, 0);
            root.addView(desc);
        }
        android.widget.TextView warn = new android.widget.TextView(context);
        warn.setText("Мод получает доступ ко всему приложению. Устанавливайте только то, чему доверяете.");
        warn.setTextSize(android.util.TypedValue.COMPLEX_UNIT_SP, 12);
        warn.setTextColor(org.telegram.ui.ActionBar.Theme.getColor(org.telegram.ui.ActionBar.Theme.key_text_RedBold));
        warn.setPadding(0, AndroidUtilities.dp(14), 0, AndroidUtilities.dp(4));
        root.addView(warn);
        return root;
    }

    private static void install(Context context, byte[] bytes, boolean zip, Runnable done) {
        Utilities.globalQueue.postRunnable(() -> {
            String error = null;
            ModManifest manifest = null;
            try {
                manifest = zip ? ModRuntime.store(context).install(bytes, null) : ModRuntime.store(context).installPlugin(bytes);
                ModRuntime.activate(context, manifest);
            } catch (Throwable t) {
                FileLog.e(t);
                error = t.getMessage() != null ? t.getMessage() : t.toString();
            }
            String err = error;
            ModManifest installed = manifest;
            AndroidUtilities.runOnUIThread(() -> {
                Toast.makeText(context, err != null ? "Не удалось установить: " + err : "Установлено: " + installed.name, Toast.LENGTH_LONG).show();
                if (err == null && done != null) {
                    done.run();
                }
            });
        });
    }
}
