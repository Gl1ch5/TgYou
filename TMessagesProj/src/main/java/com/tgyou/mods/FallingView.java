package com.tgyou.mods;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import org.telegram.messenger.AndroidUtilities;

import java.util.Random;

/**
 * A transparent layer of falling leaves or snow for mods. It never takes touches, stops animating
 * when detached and is added once per screen: {@code FallingView.attach(root, "leaves", 40, 1.0f)}.
 */
public final class FallingView extends View {

    private static final String TAG = "tgyou_falling";
    private static final int[] LEAVES = {0xFFD9822B, 0xFFC0392B, 0xFFE5B73B, 0xFF8E5B2F, 0xFFB5651D, 0xFFA6BF3C, 0xFFE67E22};

    private final boolean snow;
    private final float speed;
    private final float[] x;
    private final float[] y;
    private final float[] size;
    private final float[] fall;
    private final float[] phase;
    private final float[] sway;
    private final float[] spin;
    private final int[] color;
    private final Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final Path leaf = new Path();
    private final Random random = new Random();
    private long last;

    /** mode: "leaves" or "snow"; count 5..200; speed 0.3..3. Does nothing when the view already has a layer. */
    public static void attach(ViewGroup root, String mode, int count, float speed) {
        if (!(root instanceof FrameLayout) || root.findViewWithTag(TAG) != null) {
            return;
        }
        FallingView view = new FallingView(root.getContext(), "snow".equals(mode), Math.max(5, Math.min(count, 200)), Math.max(0.3f, Math.min(speed, 3f)));
        view.setTag(TAG);
        root.addView(view, new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    }

    private FallingView(Context context, boolean snow, int count, float speed) {
        super(context);
        this.snow = snow;
        this.speed = speed;
        x = new float[count];
        y = new float[count];
        size = new float[count];
        fall = new float[count];
        phase = new float[count];
        sway = new float[count];
        spin = new float[count];
        color = new int[count];
        setWillNotDraw(false);
        setClickable(false);
        setFocusable(false);
        setImportantForAccessibility(IMPORTANT_FOR_ACCESSIBILITY_NO);
        for (int i = 0; i < count; i++) {
            reset(i, true);
        }
    }

    private void reset(int i, boolean anywhere) {
        int w = Math.max(getWidth(), AndroidUtilities.displaySize.x);
        int h = Math.max(getHeight(), AndroidUtilities.displaySize.y);
        x[i] = random.nextFloat() * w;
        y[i] = anywhere ? random.nextFloat() * h : -AndroidUtilities.dp(20) - random.nextFloat() * h * 0.3f;
        size[i] = snow ? AndroidUtilities.dp(1.5f + random.nextFloat() * 3.5f) : AndroidUtilities.dp(6 + random.nextFloat() * 8);
        fall[i] = AndroidUtilities.dp(snow ? 40 + random.nextFloat() * 90 : 30 + random.nextFloat() * 60);
        phase[i] = random.nextFloat() * 6.28f;
        sway[i] = AndroidUtilities.dp(snow ? 10 + random.nextFloat() * 20 : 25 + random.nextFloat() * 35);
        spin[i] = random.nextFloat() * 360f;
        color[i] = snow ? 0xFFFFFFFF : LEAVES[random.nextInt(LEAVES.length)];
    }

    @Override
    protected void onDraw(Canvas canvas) {
        long now = System.nanoTime();
        float dt = last == 0 ? 0.016f : Math.min((now - last) / 1e9f, 0.05f);
        last = now;
        int h = getHeight();
        for (int i = 0; i < x.length; i++) {
            y[i] += fall[i] * speed * dt;
            phase[i] += dt * (snow ? 1.2f : 1.8f) * speed;
            spin[i] += dt * 90f * speed;
            float px = x[i] + (float) Math.sin(phase[i]) * sway[i];
            if (y[i] > h + size[i]) {
                reset(i, false);
                continue;
            }
            paint.setColor(color[i]);
            if (snow) {
                paint.setAlpha(230);
                canvas.drawCircle(px, y[i], size[i], paint);
            } else {
                canvas.save();
                canvas.translate(px, y[i]);
                canvas.rotate(spin[i]);
                leaf.reset();
                leaf.moveTo(0, -size[i]);
                leaf.quadTo(size[i] * 0.9f, -size[i] * 0.2f, 0, size[i]);
                leaf.quadTo(-size[i] * 0.9f, -size[i] * 0.2f, 0, -size[i]);
                canvas.drawPath(leaf, paint);
                canvas.restore();
            }
        }
        postInvalidateOnAnimation();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        last = 0;
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent event) {
        return false;
    }
}
