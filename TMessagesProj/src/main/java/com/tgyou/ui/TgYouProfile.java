package com.tgyou.ui;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/** Profile extras: the user ID / data center row and the developer badge. */
public final class TgYouProfile {

    private static final String DEVELOPER_USERNAME = "grzxk";

    private static Drawable badge;

    private TgYouProfile() {
    }

    public static boolean isDeveloper(TLRPC.User user) {
        return user != null && DEVELOPER_USERNAME.equalsIgnoreCase(user.username);
    }

    public static String idValue(TLRPC.User user) {
        return String.valueOf(user.id);
    }

    /** "DC 2" for the data center that stores the profile photo; Telegram gives no DC for users without one. */
    public static String dcValue(TLRPC.User user) {
        int dc = user.photo != null ? user.photo.dc_id : 0;
        return dc != 0 ? "DC " + dc : "DC неизвестен (нет фото)";
    }

    public static String rowTitle(TLRPC.User user) {
        return "ID " + idValue(user) + " · " + dcValue(user);
    }

    public static Drawable badge() {
        if (badge == null) {
            badge = new BadgeDrawable();
        }
        return badge;
    }

    private static final class BadgeDrawable extends Drawable {
        private final Paint fill = new Paint(Paint.ANTI_ALIAS_FLAG);
        private final Paint text = new Paint(Paint.ANTI_ALIAS_FLAG);
        private final Paint glow = new Paint(Paint.ANTI_ALIAS_FLAG);
        private final RectF rect = new RectF();
        private final String label = "DEV";
        private final int w;
        private final int h;

        BadgeDrawable() {
            h = AndroidUtilities.dp(16);
            text.setColor(Color.WHITE);
            text.setTypeface(Typeface.create("sans-serif-black", Typeface.NORMAL));
            text.setTextSize(AndroidUtilities.dp(9.5f));
            text.setLetterSpacing(0.08f);
            w = (int) (text.measureText(label) + AndroidUtilities.dp(14));
            glow.setStyle(Paint.Style.STROKE);
            glow.setStrokeWidth(AndroidUtilities.dp(1));
            glow.setColor(0x66FFFFFF);
        }

        @Override
        public void draw(Canvas canvas) {
            android.graphics.Rect b = getBounds();
            rect.set(b.left, b.top, b.right, b.bottom);
            fill.setShader(new LinearGradient(rect.left, rect.top, rect.right, rect.bottom,
                    0xFF8E5CFF, 0xFF1FB6FF, Shader.TileMode.CLAMP));
            float r = rect.height() / 2f;
            canvas.drawRoundRect(rect, r, r, fill);
            rect.inset(AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f));
            canvas.drawRoundRect(rect, r, r, glow);
            float tw = text.measureText(label);
            float y = b.centerY() - (text.descent() + text.ascent()) / 2f;
            canvas.drawText(label, b.centerX() - tw / 2f, y, text);
        }

        @Override
        public int getIntrinsicWidth() {
            return w;
        }

        @Override
        public int getIntrinsicHeight() {
            return h;
        }

        @Override
        public void setAlpha(int alpha) {
            fill.setAlpha(alpha);
            text.setAlpha(alpha);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        @Override
        public int getOpacity() {
            return PixelFormat.TRANSLUCENT;
        }
    }
}
