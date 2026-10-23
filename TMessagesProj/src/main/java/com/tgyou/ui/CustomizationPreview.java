package com.tgyou.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;

import com.tgyou.core.TgYouAppearance;
import com.tgyou.core.TgYouGlass;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

/**
 * Live miniature of the interface: header, one chat-list row, two bubbles and the input panel. Everything is drawn
 * with Theme.getColor, so own colors, transparency, rounding and the glass outline show up immediately.
 */
final class CustomizationPreview extends View {

    private final Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final Paint text = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final RectF rect = new RectF();

    CustomizationPreview(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(MeasureSpec.getSize(widthMeasureSpec), AndroidUtilities.dp(330));
    }

    private int c(int key) {
        return Theme.getColor(key);
    }

    private void label(Canvas canvas, String s, float x, float y, float size, int color, boolean bold) {
        text.setTextSize(AndroidUtilities.dp(size));
        text.setColor(color);
        text.setTypeface(bold ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        canvas.drawText(s, x, y, text);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int w = getWidth();
        int pad = AndroidUtilities.dp(16);
        float r = AndroidUtilities.dp(18);

        // outer card on the gray background
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(c(Theme.key_windowBackgroundGray));
        canvas.drawRect(0, 0, w, getHeight(), paint);
        rect.set(pad, AndroidUtilities.dp(8), w - pad, getHeight() - AndroidUtilities.dp(8));
        canvas.save();
        android.graphics.Path clip = new android.graphics.Path();
        clip.addRoundRect(rect, r, r, android.graphics.Path.Direction.CW);
        canvas.clipPath(clip);

        float left = rect.left;
        float right = rect.right;
        float top = rect.top;

        // header
        paint.setColor(c(Theme.key_actionBarDefault));
        canvas.drawRect(left, top, right, top + AndroidUtilities.dp(44), paint);
        label(canvas, "Чаты", left + AndroidUtilities.dp(16), top + AndroidUtilities.dp(29), 18, c(Theme.key_actionBarDefaultTitle), true);

        // chat list row
        float rowTop = top + AndroidUtilities.dp(44);
        paint.setColor(c(Theme.key_windowBackgroundWhite));
        canvas.drawRect(left, rowTop, right, rowTop + AndroidUtilities.dp(66), paint);
        paint.setColor(c(Theme.key_avatar_backgroundActionBarBlue));
        canvas.drawCircle(left + AndroidUtilities.dp(36), rowTop + AndroidUtilities.dp(33), AndroidUtilities.dp(22), paint);
        label(canvas, "Anna", left + AndroidUtilities.dp(70), rowTop + AndroidUtilities.dp(28), 16, c(Theme.key_chats_name), true);
        label(canvas, "Увидимся вечером?", left + AndroidUtilities.dp(70), rowTop + AndroidUtilities.dp(50), 14, c(Theme.key_chats_message), false);
        float bx = right - AndroidUtilities.dp(28);
        paint.setColor(c(Theme.key_chats_unreadCounter));
        rect.set(bx - AndroidUtilities.dp(11), rowTop + AndroidUtilities.dp(36), bx + AndroidUtilities.dp(11), rowTop + AndroidUtilities.dp(56));
        canvas.drawRoundRect(rect, AndroidUtilities.dp(10), AndroidUtilities.dp(10), paint);
        label(canvas, "3", bx - AndroidUtilities.dp(3.5f), rowTop + AndroidUtilities.dp(51), 12, 0xFFFFFFFF, true);
        paint.setColor(c(Theme.key_chats_unreadCounterMuted));
        canvas.drawCircle(bx - AndroidUtilities.dp(36), rowTop + AndroidUtilities.dp(46), AndroidUtilities.dp(6), paint);

        // chat area
        float chatTop = rowTop + AndroidUtilities.dp(66);
        paint.setColor(c(Theme.key_windowBackgroundGray));
        canvas.drawRect(left, chatTop, right, rect.bottom, paint);
        float radius = Math.max(AndroidUtilities.dp(2), AndroidUtilities.dp(TgYouAppearance.bubbleRadius()));

        String in = "Привет! Как дела?";
        text.setTextSize(AndroidUtilities.dp(15));
        float inW = text.measureText(in) + AndroidUtilities.dp(28);
        paint.setColor(c(Theme.key_chat_inBubble));
        rect.set(left + AndroidUtilities.dp(10), chatTop + AndroidUtilities.dp(10), left + AndroidUtilities.dp(10) + inW, chatTop + AndroidUtilities.dp(48));
        canvas.drawRoundRect(rect, radius, radius, paint);
        label(canvas, in, rect.left + AndroidUtilities.dp(14), rect.top + AndroidUtilities.dp(24), 15, c(Theme.key_chat_messageTextIn), false);

        String out = "Отлично, спасибо!";
        float outW = text.measureText(out) + AndroidUtilities.dp(60);
        paint.setColor(c(Theme.key_chat_outBubble));
        rect.set(right - AndroidUtilities.dp(10) - outW, chatTop + AndroidUtilities.dp(56), right - AndroidUtilities.dp(10), chatTop + AndroidUtilities.dp(94));
        canvas.drawRoundRect(rect, radius, radius, paint);
        label(canvas, out, rect.left + AndroidUtilities.dp(14), rect.top + AndroidUtilities.dp(24), 15, c(Theme.key_chat_messageTextOut), false);
        label(canvas, "✓✓", rect.right - AndroidUtilities.dp(30), rect.top + AndroidUtilities.dp(33), 11, c(Theme.key_chat_outSentCheckRead), true);

        // link
        label(canvas, "telegram.org", left + AndroidUtilities.dp(14), chatTop + AndroidUtilities.dp(120), 14, c(Theme.key_chat_messageLinkIn), false);

        // input panel (glass outline when enabled)
        float panelBottom = getHeight() - AndroidUtilities.dp(18);
        rect.set(left + AndroidUtilities.dp(10), panelBottom - AndroidUtilities.dp(40), right - AndroidUtilities.dp(10), panelBottom);
        paint.setColor(c(Theme.key_chat_messagePanelBackground));
        canvas.drawRoundRect(rect, AndroidUtilities.dp(20), AndroidUtilities.dp(20), paint);
        if (TgYouGlass.stroke()) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(1));
            paint.setColor(0x55FFFFFF);
            canvas.drawRoundRect(rect, AndroidUtilities.dp(20), AndroidUtilities.dp(20), paint);
            paint.setStyle(Paint.Style.FILL);
        }
        label(canvas, "Сообщение", rect.left + AndroidUtilities.dp(16), rect.top + AndroidUtilities.dp(25), 15, c(Theme.key_chats_message), false);

        // floating button
        paint.setColor(c(Theme.key_chats_actionBackground));
        canvas.drawCircle(right - AndroidUtilities.dp(34), chatTop + AndroidUtilities.dp(112), AndroidUtilities.dp(20), paint);
        canvas.restore();
    }
}
