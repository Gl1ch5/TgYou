package com.tgyou.ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.IconBackgroundColors;
import org.telegram.ui.Components.LayoutHelper;

/** A rounded tile of the TgYou home screen: tinted icon bubble, title, subtitle; presses with a soft squeeze. */
final class TgYouTile extends LinearLayout {

    TgYouTile(Context context, int icon, IconBackgroundColors colors, String title, String subtitle, boolean wide) {
        this(context, icon, colors.top, colors.bottom, title, subtitle, wide);
    }

    TgYouTile(Context context, int icon, int top, int bottom, String title, String subtitle, boolean wide) {
        super(context);
        setOrientation(wide ? HORIZONTAL : VERTICAL);
        setGravity(wide ? Gravity.CENTER_VERTICAL : Gravity.TOP);
        int pad = AndroidUtilities.dp(16);
        setPadding(pad, pad, pad, pad);

        GradientDrawable bg = new GradientDrawable();
        bg.setCornerRadius(AndroidUtilities.dp(16));
        bg.setColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        setBackground(bg);

        FrameLayout bubble = new FrameLayout(context);
        GradientDrawable square = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{top, bottom});
        square.setCornerRadius(AndroidUtilities.dp(10));
        bubble.setBackground(square);
        ImageView image = new ImageView(context);
        image.setImageResource(icon);
        image.setColorFilter(0xFFFFFFFF);
        bubble.addView(image, LayoutHelper.createFrame(26, 26, Gravity.CENTER));
        addView(bubble, wide ? LayoutHelper.createLinear(40, 40, 0, 0, 14, 0) : LayoutHelper.createLinear(40, 40));

        LinearLayout texts = new LinearLayout(context);
        texts.setOrientation(VERTICAL);
        TextView t = new TextView(context);
        t.setText(title);
        t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        t.setTypeface(AndroidUtilities.bold());
        t.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        t.setSingleLine();
        t.setEllipsize(TextUtils.TruncateAt.END);
        texts.addView(t, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT));
        if (subtitle != null && !subtitle.isEmpty()) {
            TextView s = new TextView(context);
            s.setText(subtitle);
            s.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13);
            s.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2));
            s.setSingleLine();
            s.setEllipsize(TextUtils.TruncateAt.END);
            texts.addView(s, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 2, 0, 0));
        }
        if (wide) {
            addView(texts, LayoutHelper.createLinear(0, LayoutHelper.WRAP_CONTENT, 1f));
        } else {
            addView(texts, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 14, 0, 0));
        }
        setClickable(true);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getActionMasked();
        if (action == MotionEvent.ACTION_DOWN) {
            animate().scaleX(0.95f).scaleY(0.95f).setDuration(110).start();
        } else if (action == MotionEvent.ACTION_UP || action == MotionEvent.ACTION_CANCEL) {
            animate().scaleX(1f).scaleY(1f).setDuration(220).setInterpolator(new android.view.animation.OvershootInterpolator(2f)).start();
        }
        return super.onTouchEvent(event);
    }

    /** Fades and lifts the tile in, {@code index} steps after the first one. */
    void enter(int index) {
        setAlpha(0f);
        setTranslationY(AndroidUtilities.dp(18));
        animate().alpha(1f).translationY(0).setStartDelay(index * 45L).setDuration(320)
                .setInterpolator(new android.view.animation.DecelerateInterpolator(1.6f)).start();
    }
}
