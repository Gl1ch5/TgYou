package com.tgyou.ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tgyou.core.TgYouColors;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

/** Title with the current color and a scrollable row of swatches; a second tap on the chosen one resets it. */
final class ColorRow extends LinearLayout {

    private final TgYouColors.Entry entry;
    private final Runnable changed;
    private final Runnable askHex;
    private final TextView title;
    private final LinearLayout dots;

    ColorRow(Context context, TgYouColors.Entry entry, Runnable changed, Runnable askHex) {
        super(context);
        this.entry = entry;
        this.changed = changed;
        this.askHex = askHex;
        setOrientation(VERTICAL);
        int pad = AndroidUtilities.dp(20);
        setPadding(pad, AndroidUtilities.dp(10), pad, AndroidUtilities.dp(10));
        title = new TextView(context);
        title.setTextSize(16);
        title.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        addView(title, new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        HorizontalScrollView scroll = new HorizontalScrollView(context);
        scroll.setHorizontalScrollBarEnabled(false);
        dots = new LinearLayout(context);
        dots.setGravity(Gravity.CENTER_VERTICAL);
        scroll.addView(dots);
        LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        lp.topMargin = AndroidUtilities.dp(8);
        addView(scroll, lp);
        sync();
    }

    private View dot(int fill, boolean selected, String label, Runnable click) {
        TextView v = new TextView(getContext());
        v.setGravity(Gravity.CENTER);
        v.setTextSize(13);
        v.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText));
        v.setText(label);
        GradientDrawable d = new GradientDrawable();
        d.setShape(GradientDrawable.OVAL);
        d.setColor(fill);
        int line = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText);
        d.setStroke(AndroidUtilities.dp(selected ? 3 : 1), selected ? Theme.getColor(Theme.key_windowBackgroundWhiteBlackText) : (line & 0x00FFFFFF | 0x55000000));
        v.setBackground(d);
        v.setOnClickListener(x -> click.run());
        LayoutParams lp = new LayoutParams(AndroidUtilities.dp(32), AndroidUtilities.dp(32));
        lp.rightMargin = AndroidUtilities.dp(8);
        dots.addView(v, lp);
        return v;
    }

    void sync() {
        int cur = TgYouColors.get(entry);
        title.setText(entry.title + (cur == 0 ? "" : "  #" + String.format("%06X", cur & 0xFFFFFF)));
        dots.removeAllViews();
        dot(0x00000000, cur == 0, "∅", () -> {
            TgYouColors.set(entry, 0);
            changed.run();
        });
        boolean custom = cur != 0;
        for (int color : TgYouColors.PALETTE) {
            boolean sel = cur != 0 && (cur & 0xFFFFFF) == (color & 0xFFFFFF);
            custom &= !sel;
            dot(color, sel, "", () -> {
                TgYouColors.set(entry, sel ? 0 : color);
                changed.run();
            });
        }
        dot(custom ? cur | 0xFF000000 : 0x00000000, custom, "#", askHex);
    }
}
