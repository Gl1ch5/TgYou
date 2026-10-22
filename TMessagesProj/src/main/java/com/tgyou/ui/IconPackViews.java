package com.tgyou.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

import java.util.List;

/** Small preview widgets for icon packs: a grid of sample icons on rounded chips. */
final class IconPackViews {

    private IconPackViews() {
    }

    static View grid(Context context, List<Bitmap> icons, int columns, int cellDp) {
        GridLayout grid = new GridLayout(context);
        grid.setColumnCount(columns);
        grid.setUseDefaultMargins(false);
        int gap = AndroidUtilities.dp(4);
        for (Bitmap bitmap : icons) {
            ImageView chip = new ImageView(context);
            chip.setImageBitmap(bitmap);
            chip.setScaleType(ImageView.ScaleType.FIT_CENTER);
            int pad = AndroidUtilities.dp(cellDp / 5f);
            chip.setPadding(pad, pad, pad, pad);
            GradientDrawable bg = new GradientDrawable();
            bg.setCornerRadius(AndroidUtilities.dp(10));
            bg.setColor(Theme.getColor(Theme.key_windowBackgroundGray));
            chip.setBackground(bg);
            GridLayout.LayoutParams lp = new GridLayout.LayoutParams();
            lp.width = AndroidUtilities.dp(cellDp);
            lp.height = AndroidUtilities.dp(cellDp);
            lp.setMargins(gap, gap, gap, gap);
            grid.addView(chip, lp);
        }
        return grid;
    }

    static View centered(Context context, View child) {
        LinearLayout box = new LinearLayout(context);
        box.setGravity(Gravity.CENTER_HORIZONTAL);
        box.addView(child, LayoutHelper.createLinear(LayoutHelper.WRAP_CONTENT, LayoutHelper.WRAP_CONTENT));
        return box;
    }
}
