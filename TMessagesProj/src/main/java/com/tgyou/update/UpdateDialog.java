package com.tgyou.update;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.LaunchActivity;

import java.util.Locale;

/** A card that slides down from the top of the screen: new version, changelog, install / later. */
final class UpdateDialog {

    private UpdateDialog() {
    }

    static void show(Updater.Release release) {
        Activity activity = LaunchActivity.instance;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

        LinearLayout card = new LinearLayout(activity);
        card.setOrientation(LinearLayout.VERTICAL);
        GradientDrawable cardBg = new GradientDrawable();
        cardBg.setCornerRadius(AndroidUtilities.dp(28));
        cardBg.setColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        card.setBackground(cardBg);

        LinearLayout head = new LinearLayout(activity);
        head.setOrientation(LinearLayout.VERTICAL);
        int hp = AndroidUtilities.dp(20);
        head.setPadding(hp, hp, hp, hp);
        GradientDrawable headBg = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{0xFF2FA4E7, 0xFF7C5CFF});
        float r = AndroidUtilities.dp(28);
        headBg.setCornerRadii(new float[]{r, r, r, r, 0, 0, 0, 0});
        head.setBackground(headBg);
        TextView title = new TextView(activity);
        title.setText("Доступно обновление");
        title.setTextSize(TypedValue.COMPLEX_UNIT_SP, 21);
        title.setTypeface(AndroidUtilities.bold());
        title.setTextColor(0xFFFFFFFF);
        head.addView(title);
        TextView sub = new TextView(activity);
        String size = release.size > 0 ? String.format(Locale.US, " · %.0f МБ", release.size / 1048576.0) : "";
        sub.setText(release.tag + size);
        sub.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
        sub.setTextColor(0xD9FFFFFF);
        head.addView(sub, LayoutHelper.createLinear(LayoutHelper.WRAP_CONTENT, LayoutHelper.WRAP_CONTENT, 0, 4, 0, 0));
        card.addView(head, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT));

        TextView notes = new TextView(activity);
        notes.setText(cleanNotes(release.notes));
        notes.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
        notes.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        notes.setPadding(hp, hp, hp, AndroidUtilities.dp(8));
        ScrollView scroll = new ScrollView(activity);
        scroll.addView(notes);
        card.addView(scroll, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT));

        LinearLayout buttons = new LinearLayout(activity);
        buttons.setPadding(AndroidUtilities.dp(14), AndroidUtilities.dp(6), AndroidUtilities.dp(14), AndroidUtilities.dp(14));
        TextView later = button(activity, "Позже", Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2), 0x00000000);
        later.setOnClickListener(v -> dialog.dismiss());
        TextView install = button(activity, "Установить", 0xFFFFFFFF, 0xFF2FA4E7);
        install.setOnClickListener(v -> {
            UpdateManager.download();
            dialog.dismiss();
        });
        buttons.addView(later, LayoutHelper.createLinear(0, 50, 1f, 0, 0, 6, 0));
        buttons.addView(install, LayoutHelper.createLinear(0, 50, 1.4f, 6, 0, 0, 0));
        card.addView(buttons, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT));

        int margin = AndroidUtilities.dp(12);
        LinearLayout root = new LinearLayout(activity);
        root.setPadding(margin, margin, margin, 0);
        root.addView(card, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        dialog.setContentView(root);

        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            window.setGravity(Gravity.TOP);
            window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            window.setDimAmount(0.35f);
            window.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        }
        card.setTranslationY(-AndroidUtilities.dp(300));
        card.setAlpha(0f);
        dialog.show();
        card.animate().translationY(0).alpha(1f).setDuration(380)
                .setInterpolator(new android.view.animation.OvershootInterpolator(0.9f)).start();
    }

    private static String cleanNotes(String raw) {
        StringBuilder out = new StringBuilder();
        if (raw != null) {
            for (String line : raw.split("\n")) {
                String t = line.trim();
                if (t.isEmpty() || t.toLowerCase(Locale.ROOT).contains("full changelog")) {
                    continue;
                }
                out.append(t.replace("**", "").replaceFirst("^#+\\s*", "").replaceFirst("^[*-]\\s+", "• ")).append('\n');
            }
        }
        String text = out.toString().trim();
        return text.isEmpty() ? "Улучшения и исправления." : text;
    }

    private static TextView button(Activity activity, String text, int textColor, int bgColor) {
        TextView b = new TextView(activity);
        b.setText(text);
        b.setGravity(Gravity.CENTER);
        b.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
        b.setTypeface(AndroidUtilities.bold());
        b.setTextColor(textColor);
        GradientDrawable bg = new GradientDrawable();
        bg.setCornerRadius(AndroidUtilities.dp(18));
        bg.setColor(bgColor);
        b.setBackground(bg);
        b.setOnTouchListener((v, e) -> {
            if (e.getActionMasked() == MotionEvent.ACTION_DOWN) {
                v.animate().scaleX(0.95f).scaleY(0.95f).setDuration(100).start();
            } else if (e.getActionMasked() == MotionEvent.ACTION_UP || e.getActionMasked() == MotionEvent.ACTION_CANCEL) {
                v.animate().scaleX(1f).scaleY(1f).setDuration(200).start();
            }
            return false;
        });
        return b;
    }
}
