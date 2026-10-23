package com.tgyou.core;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.LaunchActivity;

/**
 * Debug mode for developers and mod authors. A small panel floats above the app; "Выбрать" lets you
 * tap any element and see what it is (class, id, text, who handles the click, the data of a chat or
 * message cell) and copy it, together with the text to put into a mod. Dialog windows (separate
 * Android windows) are not covered: only what lives in the main window is inspectable.
 */
public final class TgYouDebug {

    public static final String PREF = "dev.debug";
    public static final String BOUNDS = "dev.bounds";
    private static final String TAG = "tgyou_debug";

    private static DebugLayer layer;

    private TgYouDebug() {
    }

    public static boolean enabled() {
        return TgYouPrefs.bool(PREF, false);
    }

    public static void set(boolean on) {
        TgYouPrefs.setBool(PREF, on);
        AndroidUtilities.runOnUIThread(TgYouDebug::sync);
    }

    /** Called when the app comes to the foreground. */
    public static void onResume() {
        AndroidUtilities.runOnUIThread(TgYouDebug::sync);
    }

    /** The class name of the screen on top, for the panel and the developer screen. */
    public static String currentScreen() {
        try {
            BaseFragment f = LaunchActivity.getLastFragment();
            return f == null ? "—" : f.getClass().getSimpleName();
        } catch (Throwable t) {
            return "—";
        }
    }

    private static void sync() {
        Activity activity = LaunchActivity.instance;
        if (activity == null) {
            return;
        }
        ViewGroup decor = (ViewGroup) activity.getWindow().getDecorView();
        View old = decor.findViewWithTag(TAG);
        if (!enabled()) {
            if (old != null) {
                decor.removeView(old);
            }
            layer = null;
            return;
        }
        if (old != null) {
            return;
        }
        layer = new DebugLayer(activity);
        layer.setTag(TAG);
        decor.addView(layer, new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    }

    private static void copy(Context context, String label, String text) {
        try {
            ((ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText(label, text));
            Toast.makeText(context, "Скопировано", Toast.LENGTH_SHORT).show();
        } catch (Throwable ignore) {
        }
    }

    // ---- inspecting a view ----------------------------------------------------------------

    private static String idName(View v) {
        try {
            return v.getId() == View.NO_ID ? "" : v.getResources().getResourceEntryName(v.getId());
        } catch (Throwable t) {
            return "#" + v.getId();
        }
    }

    private static String clickHandler(View v) {
        try {
            java.lang.reflect.Method get = View.class.getDeclaredMethod("getListenerInfo");
            get.setAccessible(true);
            Object info = get.invoke(v);
            if (info == null) {
                return "";
            }
            java.lang.reflect.Field f = info.getClass().getDeclaredField("mOnClickListener");
            f.setAccessible(true);
            Object l = f.get(info);
            return l == null ? "" : l.getClass().getName();
        } catch (Throwable t) {
            return "";
        }
    }

    /** The text a mod author wants: what to hide or hook for this element. */
    static String modPattern(View v) {
        String id = idName(v);
        if (!id.isEmpty() && !id.startsWith("#")) {
            return id;
        }
        CharSequence desc = v.getContentDescription();
        if (desc != null && desc.length() > 0) {
            return desc.toString();
        }
        return v.getClass().getSimpleName();
    }

    static String describe(View v) {
        StringBuilder sb = new StringBuilder();
        sb.append("Экран: ").append(currentScreen()).append('\n');
        sb.append("Класс: ").append(v.getClass().getName()).append('\n');
        Class<?> c = v.getClass().getSuperclass();
        StringBuilder chain = new StringBuilder();
        for (int i = 0; c != null && i < 4 && c != Object.class; i++, c = c.getSuperclass()) {
            chain.append(i == 0 ? "" : " < ").append(c.getSimpleName());
        }
        if (chain.length() > 0) {
            sb.append("Наследует: ").append(chain).append('\n');
        }
        String id = idName(v);
        sb.append("id: ").append(id.isEmpty() ? "нет" : id).append('\n');
        sb.append("Размер: ").append(Math.round(v.getWidth() / AndroidUtilities.density)).append(" x ")
                .append(Math.round(v.getHeight() / AndroidUtilities.density)).append(" dp\n");
        int[] loc = new int[2];
        v.getLocationOnScreen(loc);
        sb.append("Позиция: ").append(Math.round(loc[0] / AndroidUtilities.density)).append(", ")
                .append(Math.round(loc[1] / AndroidUtilities.density)).append(" dp\n");
        sb.append("Видимость: ").append(v.getVisibility() == View.VISIBLE ? "виден" : v.getVisibility() == View.INVISIBLE ? "невидим" : "скрыт")
                .append(", alpha ").append(v.getAlpha()).append(", enabled ").append(v.isEnabled()).append('\n');
        sb.append("Нажимается: ").append(v.isClickable()).append(", долгое: ").append(v.isLongClickable()).append('\n');
        String handler = clickHandler(v);
        if (!handler.isEmpty()) {
            sb.append("Обработчик нажатия: ").append(handler).append('\n');
        }
        if (v instanceof TextView) {
            sb.append("Текст: ").append(((TextView) v).getText()).append('\n');
        }
        if (v.getContentDescription() != null) {
            sb.append("Подпись (contentDescription): ").append(v.getContentDescription()).append('\n');
        }
        if (v.getTag() != null) {
            sb.append("tag: ").append(v.getTag()).append('\n');
        }
        Drawable bg = v.getBackground();
        if (bg != null) {
            sb.append("Фон: ").append(bg.getClass().getSimpleName());
            if (bg instanceof ColorDrawable) {
                sb.append(String.format(" #%08X", ((ColorDrawable) bg).getColor()));
            }
            sb.append('\n');
        }
        try {
            if (v instanceof ChatMessageCell) {
                org.telegram.messenger.MessageObject m = ((ChatMessageCell) v).getMessageObject();
                if (m != null) {
                    sb.append("Сообщение: id ").append(m.getId()).append(", чат ").append(m.getDialogId())
                            .append(m.isOut() ? ", исходящее" : ", входящее").append('\n');
                    if (m.messageText != null) {
                        sb.append("Текст сообщения: ").append(m.messageText).append('\n');
                    }
                }
            } else if (v instanceof DialogCell) {
                sb.append("Чат (dialogId): ").append(((DialogCell) v).getDialogId()).append('\n');
            }
        } catch (Throwable ignore) {
        }
        StringBuilder path = new StringBuilder();
        View p = v;
        for (int i = 0; p != null && i < 8; i++) {
            path.insert(0, p.getClass().getSimpleName() + (i == 0 ? "" : " > "));
            p = p.getParent() instanceof View ? (View) p.getParent() : null;
        }
        sb.append("Путь: ").append(path).append('\n');
        sb.append("\nДля мода «Скрыть кнопки» впишите: ").append(modPattern(v)).append('\n');
        sb.append("Для Python-мода: view_class=\"").append(v.getClass().getName()).append("\"");
        return sb.toString();
    }

    // ---- the overlay ----------------------------------------------------------------------

    private static final class DebugLayer extends FrameLayout {

        private final LinearLayout panel;
        private final TextView title;
        private TextView pickButton;
        private TextView boundsButton;
        private final FrameLayout card;
        private final TextView cardText;
        private final Paint stroke = new Paint(Paint.ANTI_ALIAS_FLAG);
        private final Rect picked = new Rect();
        private final java.util.ArrayList<Rect> boxes = new java.util.ArrayList<>();
        private boolean picking;
        private boolean bounds = TgYouPrefs.bool(BOUNDS, false);
        private View target;
        private float downX;
        private float downY;
        private final Runnable refresh = new Runnable() {
            @Override
            public void run() {
                title.setText("DEBUG · " + currentScreen());
                if (bounds) {
                    collectBoxes();
                    invalidate();
                }
                postDelayed(this, 800);
            }
        };

        DebugLayer(Context context) {
            super(context);
            setWillNotDraw(false);
            stroke.setStyle(Paint.Style.STROKE);
            stroke.setStrokeWidth(AndroidUtilities.dp(1.5f));

            panel = new LinearLayout(context);
            panel.setOrientation(LinearLayout.HORIZONTAL);
            panel.setGravity(Gravity.CENTER_VERTICAL);
            panel.setBackground(round(0xE61C1C22, 18));
            panel.setPadding(AndroidUtilities.dp(10), AndroidUtilities.dp(6), AndroidUtilities.dp(6), AndroidUtilities.dp(6));
            title = label(context, "DEBUG", 0xFFFFB454);
            panel.addView(title);
            pickButton = button(context, "Выбрать", () -> setPicking(!picking));
            panel.addView(pickButton);
            boundsButton = button(context, "Границы", () -> {
                bounds = !bounds;
                TgYouPrefs.setBool(BOUNDS, bounds);
                collectBoxes();
                invalidate();
                boundsButton.setTextColor(bounds ? 0xFF7CFC9A : 0xFFFFFFFF);
            });
            boundsButton.setTextColor(bounds ? 0xFF7CFC9A : 0xFFFFFFFF);
            panel.addView(boundsButton);
            panel.addView(button(context, "Выкл", () -> set(false)));
            LayoutParams pl = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.TOP | Gravity.CENTER_HORIZONTAL);
            pl.topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(56);
            addView(panel, pl);
            panel.setOnTouchListener(new OnTouchListener() {
                float dx;
                float dy;

                @Override
                public boolean onTouch(View v, MotionEvent e) {
                    if (e.getAction() == MotionEvent.ACTION_DOWN) {
                        dx = v.getX() - e.getRawX();
                        dy = v.getY() - e.getRawY();
                    } else if (e.getAction() == MotionEvent.ACTION_MOVE) {
                        v.setX(e.getRawX() + dx);
                        v.setY(e.getRawY() + dy);
                    }
                    return false;
                }
            });

            card = new FrameLayout(context);
            card.setBackground(round(0xF2101015, 16));
            card.setVisibility(GONE);
            ScrollView scroll = new ScrollView(context);
            cardText = new TextView(context);
            cardText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
            cardText.setTypeface(Typeface.MONOSPACE);
            cardText.setTextColor(0xFFEDEDED);
            cardText.setPadding(AndroidUtilities.dp(14), AndroidUtilities.dp(12), AndroidUtilities.dp(14), AndroidUtilities.dp(56));
            scroll.addView(cardText);
            card.addView(scroll, new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            LinearLayout actions = new LinearLayout(context);
            actions.setOrientation(LinearLayout.HORIZONTAL);
            actions.setBackground(round(0xFF22222B, 14));
            actions.addView(button(context, "Копировать", () -> copy(getContext(), "view", cardText.getText().toString())));
            actions.addView(button(context, "Родитель", () -> {
                if (target != null && target.getParent() instanceof View && !(target.getParent() instanceof DebugLayer)) {
                    show((View) target.getParent());
                }
            }));
            actions.addView(button(context, "Скрыть", () -> {
                if (target != null) {
                    target.setVisibility(View.GONE);
                    closeCard();
                }
            }));
            actions.addView(button(context, "Закрыть", this::closeCard));
            LayoutParams al = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL);
            al.bottomMargin = AndroidUtilities.dp(8);
            card.addView(actions, al);
            LayoutParams cl = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, AndroidUtilities.dp(330), Gravity.BOTTOM);
            cl.leftMargin = AndroidUtilities.dp(8);
            cl.rightMargin = AndroidUtilities.dp(8);
            cl.bottomMargin = AndroidUtilities.dp(24);
            addView(card, cl);
        }

        private android.graphics.drawable.GradientDrawable round(int color, int radius) {
            android.graphics.drawable.GradientDrawable d = new android.graphics.drawable.GradientDrawable();
            d.setColor(color);
            d.setCornerRadius(AndroidUtilities.dp(radius));
            return d;
        }

        private TextView label(Context context, String text, int color) {
            TextView t = new TextView(context);
            t.setText(text);
            t.setTextColor(color);
            t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
            t.setTypeface(AndroidUtilities.bold());
            t.setPadding(0, 0, AndroidUtilities.dp(8), 0);
            return t;
        }

        private TextView button(Context context, String text, Runnable action) {
            TextView t = new TextView(context);
            t.setText(text);
            t.setTextColor(0xFFFFFFFF);
            t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13);
            t.setPadding(AndroidUtilities.dp(10), AndroidUtilities.dp(7), AndroidUtilities.dp(10), AndroidUtilities.dp(7));
            t.setOnClickListener(v -> action.run());
            return t;
        }

        private void setPicking(boolean on) {
            picking = on;
            pickButton.setTextColor(on ? 0xFF7CFC9A : 0xFFFFFFFF);
            pickButton.setText(on ? "Тапните элемент" : "Выбрать");
            if (!on) {
                picked.setEmpty();
                invalidate();
            }
        }

        private void closeCard() {
            card.setVisibility(GONE);
            target = null;
            picked.setEmpty();
            invalidate();
        }

        private void show(View v) {
            target = v;
            int[] loc = new int[2];
            v.getLocationOnScreen(loc);
            int[] mine = new int[2];
            getLocationOnScreen(mine);
            picked.set(loc[0] - mine[0], loc[1] - mine[1], loc[0] - mine[0] + v.getWidth(), loc[1] - mine[1] + v.getHeight());
            cardText.setText(describe(v));
            card.setVisibility(VISIBLE);
            invalidate();
        }

        /** Touches go to the overlay only while picking; otherwise the app works as usual. */
        @Override
        public boolean dispatchTouchEvent(MotionEvent e) {
            if (!picking) {
                return super.dispatchTouchEvent(e);
            }
            boolean onUi = inside(panel, e) || (card.getVisibility() == VISIBLE && inside(card, e));
            if (onUi) {
                return super.dispatchTouchEvent(e);
            }
            switch (e.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    downX = e.getRawX();
                    downY = e.getRawY();
                    preview(e);
                    break;
                case MotionEvent.ACTION_MOVE:
                    preview(e);
                    break;
                case MotionEvent.ACTION_UP:
                    View v = hit(e.getRawX(), e.getRawY());
                    if (v != null) {
                        setPicking(false);
                        show(v);
                    }
                    break;
                default:
                    break;
            }
            return true;
        }

        private boolean inside(View v, MotionEvent e) {
            Rect r = new Rect();
            v.getGlobalVisibleRect(r);
            return v.getVisibility() == VISIBLE && r.contains((int) e.getRawX(), (int) e.getRawY());
        }

        private void preview(MotionEvent e) {
            View v = hit(e.getRawX(), e.getRawY());
            if (v != null) {
                int[] loc = new int[2];
                v.getLocationOnScreen(loc);
                int[] mine = new int[2];
                getLocationOnScreen(mine);
                picked.set(loc[0] - mine[0], loc[1] - mine[1], loc[0] - mine[0] + v.getWidth(), loc[1] - mine[1] + v.getHeight());
                invalidate();
            }
        }

        private View hit(float x, float y) {
            ViewGroup decor = (ViewGroup) getParent();
            View best = null;
            for (int i = decor.getChildCount() - 1; i >= 0 && best == null; i--) {
                View child = decor.getChildAt(i);
                if (child != this) {
                    best = deepest(child, x, y);
                }
            }
            return best;
        }

        private View deepest(View v, float x, float y) {
            if (v.getVisibility() != VISIBLE) {
                return null;
            }
            Rect r = new Rect();
            if (!v.getGlobalVisibleRect(r) || !r.contains((int) x, (int) y)) {
                return null;
            }
            if (v instanceof ViewGroup) {
                ViewGroup g = (ViewGroup) v;
                for (int i = g.getChildCount() - 1; i >= 0; i--) {
                    View found = deepest(g.getChildAt(i), x, y);
                    if (found != null) {
                        return found;
                    }
                }
                // an empty transparent container (a PiP or overlay layer) hides what lies under it: look further down
                if (g.getBackground() == null && !g.isClickable()) {
                    return null;
                }
            }
            return v;
        }

        private void collectBoxes() {
            boxes.clear();
            if (!bounds || getParent() == null) {
                return;
            }
            ViewGroup decor = (ViewGroup) getParent();
            int[] mine = new int[2];
            getLocationOnScreen(mine);
            for (int i = 0; i < decor.getChildCount(); i++) {
                if (decor.getChildAt(i) != this) {
                    gather(decor.getChildAt(i), mine);
                }
            }
        }

        private void gather(View v, int[] mine) {
            if (v.getVisibility() != VISIBLE || boxes.size() > 1500) {
                return;
            }
            if (v instanceof ViewGroup) {
                ViewGroup g = (ViewGroup) v;
                for (int i = 0; i < g.getChildCount(); i++) {
                    gather(g.getChildAt(i), mine);
                }
                if (g.getChildCount() > 0) {
                    return;
                }
            }
            Rect r = new Rect();
            if (v.getGlobalVisibleRect(r)) {
                r.offset(-mine[0], -mine[1]);
                boxes.add(r);
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (bounds) {
                stroke.setColor(0x99FF5FA2);
                for (Rect r : boxes) {
                    canvas.drawRect(r, stroke);
                }
            }
            if (!picked.isEmpty()) {
                stroke.setColor(0xFF7CFC9A);
                stroke.setStrokeWidth(AndroidUtilities.dp(2.5f));
                canvas.drawRect(picked, stroke);
                stroke.setStrokeWidth(AndroidUtilities.dp(1.5f));
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            post(refresh);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            removeCallbacks(refresh);
        }
    }
}
