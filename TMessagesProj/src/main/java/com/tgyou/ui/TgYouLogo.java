package com.tgyou.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;

import org.telegram.messenger.AndroidUtilities;

/** Text "Telegram You" in place of the vector Telegram wordmark in the collapsed stories header. */
public final class TgYouLogo extends Drawable {

    private static final String TEXT = "Telegram You";
    private final Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public TgYouLogo() {
        paint.setColor(0xFFFFFFFF);
        paint.setTypeface(AndroidUtilities.bold());
        paint.setTextSize(AndroidUtilities.dp(20));
    }

    public static int widthDp() {
        return 135;
    }

    @Override
    public void draw(Canvas canvas) {
        float y = getBounds().centerY() - (paint.ascent() + paint.descent()) / 2f;
        canvas.drawText(TEXT, getBounds().left, y, paint);
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(widthDp());
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(22);
    }

    @Override
    public void setAlpha(int alpha) {
        paint.setAlpha(alpha);
    }

    @Override
    public void setColorFilter(ColorFilter filter) {
        paint.setColorFilter(filter);
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }
}
