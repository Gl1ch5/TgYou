package com.tgyou.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

import com.tgyou.update.UpdateManager;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.Theme;

/** Round download-style indicator next to the search button: shows update progress, tap to see or install it. */
public final class UpdateIndicator extends View implements UpdateManager.Listener {

    private final Paint ring = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final Paint arrow = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final RectF oval = new RectF();
    private final Path path = new Path();
    private ActionBarMenuItem item;
    private float shownProgress;

    /** Adds the indicator to the chat-list action bar; invisible until an update exists. */
    public static void attach(ActionBarMenu menu, Context context) {
        UpdateIndicator view = new UpdateIndicator(context);
        ActionBarMenuItem item = menu.addItem(77, new android.graphics.drawable.ColorDrawable(android.graphics.Color.TRANSPARENT));
        item.addView(view, new android.widget.FrameLayout.LayoutParams(AndroidUtilities.dp(48), AndroidUtilities.dp(48)));
        item.setContentDescription("Обновление");
        item.setOnClickListener(v -> {
            if (UpdateManager.isDownloading()) {
                return;
            }
            UpdateManager.download();
        });
        view.item = item;
        item.setVisibility(UpdateManager.hasUpdate() ? VISIBLE : GONE);
    }

    private UpdateIndicator(Context context) {
        super(context);
        ring.setStyle(Paint.Style.STROKE);
        ring.setStrokeCap(Paint.Cap.ROUND);
        ring.setStrokeWidth(AndroidUtilities.dp(2.5f));
        arrow.setStyle(Paint.Style.STROKE);
        arrow.setStrokeCap(Paint.Cap.ROUND);
        arrow.setStrokeJoin(Paint.Join.ROUND);
        arrow.setStrokeWidth(AndroidUtilities.dp(2f));
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        UpdateManager.addListener(this);
        onUpdateChanged();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        UpdateManager.removeListener(this);
    }

    @Override
    public void onUpdateChanged() {
        if (item != null) {
            boolean show = UpdateManager.hasUpdate();
            if (show && item.getVisibility() != VISIBLE) {
                item.setVisibility(VISIBLE);
                item.setScaleX(0f);
                item.setScaleY(0f);
                item.animate().scaleX(1f).scaleY(1f).setDuration(350)
                        .setInterpolator(new android.view.animation.OvershootInterpolator(2.2f)).start();
            } else if (!show) {
                item.setVisibility(GONE);
            }
        }
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float cx = getWidth() / 2f;
        float cy = getHeight() / 2f;
        float radius = AndroidUtilities.dp(11);
        oval.set(cx - radius, cy - radius, cx + radius, cy + radius);
        int icon = Theme.getColor(Theme.key_actionBarDefaultIcon);
        boolean downloading = UpdateManager.isDownloading();
        boolean ready = UpdateManager.downloaded() != null;
        float target = ready ? 1f : Math.max(UpdateManager.progress(), 0) / 100f;
        shownProgress += (target - shownProgress) * 0.2f;

        ring.setColor((icon & 0x00FFFFFF) | 0x44000000);
        canvas.drawArc(oval, 0, 360, false, ring);
        if (downloading || ready) {
            ring.setColor(ready ? 0xFF3DBE8B : 0xFF2FA4E7);
            canvas.drawArc(oval, -90, 360 * shownProgress, false, ring);
        } else {
            ring.setColor(0xFF2FA4E7);
            canvas.drawArc(oval, 0, 360, false, ring);
        }

        arrow.setColor(ready ? 0xFF3DBE8B : icon);
        float bob = downloading ? (float) Math.sin(System.currentTimeMillis() / 220.0) * AndroidUtilities.dp(1.2f) : 0;
        float s = AndroidUtilities.dp(4.5f);
        path.reset();
        path.moveTo(cx, cy - s + bob);
        path.lineTo(cx, cy + s + bob);
        path.moveTo(cx - s, cy + bob);
        path.lineTo(cx, cy + s + bob);
        path.lineTo(cx + s, cy + bob);
        canvas.drawPath(path, arrow);

        if (downloading || Math.abs(target - shownProgress) > 0.005f) {
            postInvalidateOnAnimation();
        }
    }
}
