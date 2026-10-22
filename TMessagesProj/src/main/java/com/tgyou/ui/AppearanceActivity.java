package com.tgyou.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.tgyou.core.TgYouAppearance;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SeekBarView;

/** «Внешний вид»: прозрачность и скругление пузырей, размер текста — с живым предпросмотром. */
public class AppearanceActivity extends BaseFragment {

    private LinearLayout content;
    private Preview preview;

    @Override
    public View createView(Context context) {
        actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        actionBar.setAllowOverlayTitle(true);
        actionBar.setTitle("Внешний вид");
        actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int id) {
                if (id == -1) {
                    finishFragment();
                }
            }
        });
        FrameLayout frame = new FrameLayout(context);
        frame.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        fragmentView = frame;
        ScrollView scroll = new ScrollView(context);
        content = new LinearLayout(context);
        content.setOrientation(LinearLayout.VERTICAL);
        int side = AndroidUtilities.dp(12);
        content.setPadding(side, AndroidUtilities.dp(8), side, AndroidUtilities.dp(32));
        scroll.addView(content, new ScrollView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        frame.addView(scroll, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.MATCH_PARENT));
        build(context);
        return fragmentView;
    }

    private void build(Context context) {
        content.removeAllViews();

        header(context, "Предпросмотр");
        preview = new Preview(context);
        content.addView(preview, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, 190, 0, 0, 0, 6));
        note(context, "Изменения видны сразу и применяются ко всем чатам без перезапуска.");

        header(context, "Прозрачность");
        LinearLayout transparency = card(context);
        slider(context, transparency, "Входящие сообщения", "%", 10, 100, TgYouAppearance.inAlpha(), false,
                v -> TgYouAppearance.set(v, TgYouAppearance.outAlpha(), TgYouAppearance.panelAlpha()));
        slider(context, transparency, "Исходящие сообщения", "%", 10, 100, TgYouAppearance.outAlpha(), false,
                v -> TgYouAppearance.set(TgYouAppearance.inAlpha(), v, TgYouAppearance.panelAlpha()));
        slider(context, transparency, "Панель ввода", "%", 10, 100, TgYouAppearance.panelAlpha(), false,
                v -> TgYouAppearance.set(TgYouAppearance.inAlpha(), TgYouAppearance.outAlpha(), v));
        note(context, "Чем ниже значение, тем лучше сквозь пузырь виден фон чата. Шапка и списки остаются непрозрачными: за ними нет обоев.");

        header(context, "Форма");
        LinearLayout shape = card(context);
        slider(context, shape, "Скругление пузырей", "", 0, 24, TgYouAppearance.bubbleRadius(), true, TgYouAppearance::setBubbleRadius);
        slider(context, shape, "Размер текста в чатах", "", 12, 30, SharedConfig.fontSize, true, this::setFontSize);

        header(context, "Ещё");
        LinearLayout more = card(context);
        row(context, more, "Иконки", "наборы .icons, предпросмотр, применение сразу", () -> presentFragment(new IconPacksActivity()));
        row(context, more, "Иконка приложения", "TgYou, Telegram и другие", () -> presentFragment(new TgYouIconsActivity()));
        row(context, more, "Тема Telegram", "цвета, обои, ночной режим", () -> presentFragment(new org.telegram.ui.ThemeActivity(org.telegram.ui.ThemeActivity.THEME_TYPE_BASIC)));
        row(context, more, "Сбросить внешний вид", "прозрачность 100%, скругление 17", () -> {
            TgYouAppearance.reset();
            TgYouAppearance.reloadUi();
            build(context);
        });
    }

    private void setFontSize(int size) {
        if (size == SharedConfig.fontSize) {
            return;
        }
        SharedConfig.fontSize = size;
        SharedConfig.fontSizeIsDefault = false;
        SharedPreferences preferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", Context.MODE_PRIVATE);
        preferences.edit().putInt("fons_size", size).commit();
    }

    private interface IntSetter {
        void set(int value);
    }

    private void slider(Context context, LinearLayout parent, String title, String unit, int min, int max, int value, boolean reload, IntSetter setter) {
        LinearLayout box = new LinearLayout(context);
        box.setOrientation(LinearLayout.VERTICAL);
        TextView label = new TextView(context);
        label.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
        label.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        label.setText(title + ": " + value + unit);
        box.addView(label, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 16, 10, 16, 0));
        SeekBarView bar = new SeekBarView(context);
        bar.setReportChanges(true);
        bar.setProgress((value - min) / (float) (max - min));
        bar.setDelegate(new SeekBarView.SeekBarViewDelegate() {
            @Override
            public void onSeekBarDrag(boolean stop, float progress) {
                int v = Math.round(min + (max - min) * progress);
                label.setText(title + ": " + v + unit);
                setter.set(v);
                preview.invalidate();
                if (reload) {
                    TgYouAppearance.reloadUi();
                } else {
                    TgYouAppearance.apply();
                }
            }
        });
        box.addView(bar, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, 38, 6, 0, 6, 4));
        parent.addView(box);
    }

    private void row(Context context, LinearLayout parent, String title, String subtitle, Runnable action) {
        LinearLayout row = new LinearLayout(context);
        row.setOrientation(LinearLayout.VERTICAL);
        row.setPadding(AndroidUtilities.dp(16), AndroidUtilities.dp(12), AndroidUtilities.dp(16), AndroidUtilities.dp(12));
        TextView t = new TextView(context);
        t.setText(title);
        t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        t.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        row.addView(t);
        TextView s = new TextView(context);
        s.setText(subtitle);
        s.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13);
        s.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText));
        row.addView(s);
        row.setBackground(Theme.getSelectorDrawable(false));
        row.setOnClickListener(v -> action.run());
        parent.addView(row);
    }

    private LinearLayout card(Context context) {
        LinearLayout card = new LinearLayout(context);
        card.setOrientation(LinearLayout.VERTICAL);
        GradientDrawable bg = new GradientDrawable();
        bg.setCornerRadius(AndroidUtilities.dp(16));
        bg.setColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        card.setBackground(bg);
        card.setPadding(0, 0, 0, AndroidUtilities.dp(4));
        content.addView(card, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 0, 0, 6));
        return card;
    }

    private void header(Context context, String text) {
        TextView t = new TextView(context);
        t.setText(text.toUpperCase());
        t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
        t.setTypeface(AndroidUtilities.bold());
        t.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader));
        content.addView(t, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 8, 14, 8, 6));
    }

    private void note(Context context, String text) {
        TextView t = new TextView(context);
        t.setText(text);
        t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13);
        t.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText));
        content.addView(t, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 8, 0, 8, 4));
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        TgYouAppearance.reloadUi();
    }

    /** Sample chat: wallpaper, two bubbles and an input panel drawn with the live values. */
    private static final class Preview extends View {
        private final Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        private final Paint textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        private final RectF rect = new RectF();

        Preview(Context context) {
            super(context);
            textPaint.setTextSize(AndroidUtilities.dp(15));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float w = getWidth();
            float h = getHeight();
            paint.setShader(new LinearGradient(0, 0, w, h, 0xFFE8736B, 0xFF4F85F6, Shader.TileMode.CLAMP));
            rect.set(0, 0, w, h);
            float corner = AndroidUtilities.dp(16);
            canvas.drawRoundRect(rect, corner, corner, paint);
            paint.setShader(null);
            for (int i = 0; i < 12; i++) {
                paint.setColor(0x22FFFFFF);
                canvas.drawCircle(w * ((i * 37) % 100) / 100f, h * ((i * 53) % 100) / 100f, AndroidUtilities.dp(14 + i % 3 * 6), paint);
            }
            float r = AndroidUtilities.dp(TgYouAppearance.bubbleRadius());
            bubble(canvas, "Привет! Как тебе новый вид?", AndroidUtilities.dp(12), AndroidUtilities.dp(14), false, r);
            bubble(canvas, "Выглядит круто, всё видно сразу", w - AndroidUtilities.dp(12), AndroidUtilities.dp(72), true, r);
            float ph = AndroidUtilities.dp(42);
            paint.setColor(Theme.getColor(Theme.key_chat_messagePanelBackground));
            rect.set(0, h - ph, w, h);
            canvas.drawRect(rect, paint);
            textPaint.setColor(0xAAFFFFFF);
            canvas.drawText("Сообщение", AndroidUtilities.dp(16), h - ph / 2 + AndroidUtilities.dp(5), textPaint);
        }

        private void bubble(Canvas canvas, String text, float anchor, float top, boolean out, float radius) {
            textPaint.setColor(out ? 0xFFFFFFFF : 0xFF000000);
            float pad = AndroidUtilities.dp(12);
            float tw = textPaint.measureText(text);
            float bh = AndroidUtilities.dp(40);
            float left = out ? anchor - tw - pad * 2 : anchor;
            rect.set(left, top, left + tw + pad * 2, top + bh);
            paint.setColor(Theme.getColor(out ? Theme.key_chat_outBubble : Theme.key_chat_inBubble));
            float rr = Math.min(radius, bh / 2);
            canvas.drawRoundRect(rect, rr, rr, paint);
            canvas.drawText(text, left + pad, top + bh / 2 + AndroidUtilities.dp(5), textPaint);
        }
    }
}
