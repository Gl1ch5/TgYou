package com.tgyou.mods;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.chaquo.python.PyObject;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Buttons that mods put on any screen ({@code api.add_button}). A button is described by the simple class
 * name of the screen ("ChatActivity", "DialogsActivity", "ProfileActivity", or "*" for every screen)
 * and a position: top_left, top_right, center_left, center_right, bottom_left, bottom_right or action_bar.
 */
public final class ModButtons {

    private static final String TAG = "tgyou_mod_button";

    static final class Button {
        final String modId;
        final String screen;
        final String position;
        final String title;
        final int icon;
        final PyObject fn;

        Button(String modId, String screen, String position, String title, int icon, PyObject fn) {
            this.modId = modId;
            this.screen = screen;
            this.position = position;
            this.title = title;
            this.icon = icon;
            this.fn = fn;
        }
    }

    private static final List<Button> buttons = new CopyOnWriteArrayList<>();

    private ModButtons() {
    }

    static void add(String modId, String screen, String position, String title, int icon, PyObject fn) {
        buttons.add(new Button(modId, screen, position, title, icon, fn));
    }

    static void removeAll(String modId) {
        for (Button b : buttons) {
            if (b.modId.equals(modId)) {
                buttons.remove(b);
            }
        }
    }

    /** Names of the positions, for docs and error messages. */
    public static final String POSITIONS = "top_left, top_right, center_left, center_right, bottom_left, bottom_right, action_bar";

    /** Called for every created screen view. Buttons appear on screens opened after the mod was loaded. */
    public static void attach(BaseFragment fragment, View view) {
        if (buttons.isEmpty() || fragment == null) {
            return;
        }
        String name = fragment.getClass().getSimpleName();
        List<Button> mine = new ArrayList<>();
        for (Button b : buttons) {
            if (b.screen.equals("*") || b.screen.equals(name)) {
                mine.add(b);
            }
        }
        if (mine.isEmpty()) {
            return;
        }
        int slot = 0;
        for (Button b : mine) {
            try {
                if ("action_bar".equals(b.position)) {
                    ActionBar bar = fragment.getActionBar();
                    if (bar != null) {
                        bar.addView(create(view.getContext(), b), LayoutHelper.createFrame(40, 40, Gravity.END | Gravity.CENTER_VERTICAL, 0, 0, 56 + slot * 40, 0));
                        slot++;
                    }
                } else if (view instanceof FrameLayout) {
                    ((FrameLayout) view).addView(create(view.getContext(), b), floating(b.position));
                } else {
                    ModLog.add(b.modId, "кнопка «" + b.title + "»: экран " + name + " не FrameLayout, пропущена");
                }
            } catch (Throwable t) {
                FileLog.e("tgyou: mod button " + b.modId, t);
                ModLog.add(b.modId, "кнопка «" + b.title + "»: " + t);
            }
        }
    }

    private static FrameLayout.LayoutParams floating(String position) {
        int gravity;
        switch (position == null ? "" : position) {
            case "top_left":
                gravity = Gravity.TOP | Gravity.START;
                break;
            case "top_right":
                gravity = Gravity.TOP | Gravity.END;
                break;
            case "center_left":
                gravity = Gravity.CENTER_VERTICAL | Gravity.START;
                break;
            case "center_right":
                gravity = Gravity.CENTER_VERTICAL | Gravity.END;
                break;
            case "bottom_left":
                gravity = Gravity.BOTTOM | Gravity.START;
                break;
            default:
                gravity = Gravity.BOTTOM | Gravity.END;
                break;
        }
        boolean top = (gravity & Gravity.TOP) == Gravity.TOP;
        boolean bottom = (gravity & Gravity.BOTTOM) == Gravity.BOTTOM;
        return LayoutHelper.createFrame(44, 44, gravity, 12, top ? 72 : 0, 12, bottom ? 84 : 0);
    }

    private static View create(android.content.Context context, Button b) {
        ImageView v = new ImageView(context);
        v.setTag(TAG);
        v.setScaleType(ImageView.ScaleType.CENTER);
        v.setImageResource(b.icon != 0 ? b.icon : org.telegram.messenger.R.drawable.msg_add);
        v.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chats_actionIcon), PorterDuff.Mode.MULTIPLY));
        v.setBackground(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(44), Theme.getColor(Theme.key_chats_actionBackground), Theme.getColor(Theme.key_chats_actionPressedBackground)));
        v.setContentDescription(b.title);
        v.setOnClickListener(x -> {
            try {
                b.fn.call();
            } catch (Throwable t) {
                FileLog.e("tgyou: mod button " + b.modId, t);
                ModLog.add(b.modId, "кнопка «" + b.title + "»: " + t);
            }
        });
        return v;
    }
}
