package com.tgyou.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.graphics.ColorUtils;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

import java.util.List;

/** A mod card: title and version, author line, description and a row of action buttons. */
final class ModCell extends LinearLayout {

    enum Style {PRIMARY, SECONDARY, DANGER}

    static final class Button {
        final String label;
        final Style style;
        final Runnable action;

        Button(String label, Style style, Runnable action) {
            this.label = label;
            this.style = style;
            this.action = action;
        }
    }

    private final TextView title;
    private final TextView version;
    private final TextView meta;
    private final TextView description;
    private final TextView status;
    private final LinearLayout buttons;

    ModCell(Context context) {
        super(context);
        setOrientation(VERTICAL);
        setPadding(AndroidUtilities.dp(16), AndroidUtilities.dp(14), AndroidUtilities.dp(16), AndroidUtilities.dp(14));

        LinearLayout top = new LinearLayout(context);
        top.setGravity(Gravity.CENTER_VERTICAL);
        title = text(context, 17, Theme.key_windowBackgroundWhiteBlackText, true);
        title.setSingleLine();
        title.setEllipsize(TextUtils.TruncateAt.END);
        top.addView(title, LayoutHelper.createLinear(0, LayoutHelper.WRAP_CONTENT, 1f));
        version = text(context, 12, Theme.key_windowBackgroundWhiteGrayText2, false);
        top.addView(version, LayoutHelper.createLinear(LayoutHelper.WRAP_CONTENT, LayoutHelper.WRAP_CONTENT, 0f, 0, 0, 0, 0));
        addView(top, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT));

        meta = text(context, 12, Theme.key_windowBackgroundWhiteGrayText2, false);
        addView(meta, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 2, 0, 0));

        description = text(context, 14, Theme.key_windowBackgroundWhiteBlackText, false);
        description.setMaxLines(3);
        description.setEllipsize(TextUtils.TruncateAt.END);
        addView(description, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 8, 0, 0));

        status = text(context, 12, Theme.key_text_RedBold, false);
        addView(status, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 6, 0, 0));

        buttons = new LinearLayout(context);
        buttons.setOrientation(HORIZONTAL);
        addView(buttons, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 12, 0, 0));
    }

    private static TextView text(Context context, int sp, int colorKey, boolean bold) {
        TextView view = new TextView(context);
        view.setTextSize(TypedValue.COMPLEX_UNIT_SP, sp);
        view.setTextColor(Theme.getColor(colorKey));
        if (bold) {
            view.setTypeface(AndroidUtilities.bold());
        }
        return view;
    }

    void set(String name, String ver, String metaLine, String desc, String problem, List<Button> list) {
        setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        title.setText(name);
        version.setText(ver);
        meta.setText(metaLine);
        description.setText(desc);
        description.setVisibility(desc == null || desc.isEmpty() ? GONE : VISIBLE);
        status.setText(problem);
        status.setVisibility(problem == null || problem.isEmpty() ? GONE : VISIBLE);
        buttons.removeAllViews();
        for (Button b : list) {
            TextView view = new TextView(getContext());
            view.setText(b.label);
            view.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
            view.setTypeface(AndroidUtilities.bold());
            view.setGravity(Gravity.CENTER);
            view.setPadding(AndroidUtilities.dp(14), 0, AndroidUtilities.dp(14), 0);
            int accent = Theme.getColor(Theme.key_featuredStickers_addButton);
            int text;
            int bg;
            if (b.style == Style.PRIMARY) {
                bg = accent;
                text = Theme.getColor(Theme.key_featuredStickers_buttonText);
            } else if (b.style == Style.DANGER) {
                text = Theme.getColor(Theme.key_text_RedBold);
                bg = ColorUtils.setAlphaComponent(text, 28);
            } else {
                text = accent;
                bg = ColorUtils.setAlphaComponent(accent, 28);
            }
            view.setTextColor(text);
            view.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(10), bg, ColorUtils.setAlphaComponent(text, 60)));
            view.setOnClickListener((View v) -> b.action.run());
            buttons.addView(view, LayoutHelper.createLinear(LayoutHelper.WRAP_CONTENT, 36, 0, 0, 8, 0));
        }
    }
}
