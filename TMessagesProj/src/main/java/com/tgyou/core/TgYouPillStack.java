package com.tgyou.core;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.GradientDrawable;
import android.os.BatteryManager;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.tgyou.plugins.GhostModePlugin;
import com.tgyou.ui.PillStackScreen;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.LaunchActivity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Pill Stack: маленькие «таблетки» с информацией в строке поиска списка чатов. Нажатие листает
 * включённые таблетки по кругу, долгое нажатие открывает настройки.
 */
public final class TgYouPillStack {

    public static final String PILLS = "pill.items";

    public static final String[] IDS = {"time", "date", "battery", "memory", "weather", "proxy", "ping", "ghost"};
    public static final String[] TITLES = {"Время", "Дата", "Заряд батареи", "Память приложения", "Погода", "Прокси", "Пинг прокси", "Режим призрака"};

    private TgYouPillStack() {
    }

    public static List<String> enabled() {
        List<String> result = new ArrayList<>();
        for (String id : TgYouPrefs.list(PILLS)) {
            for (String known : IDS) {
                if (known.equals(id)) {
                    result.add(id);
                }
            }
        }
        return result;
    }

    public static String text(String id) {
        Context context = ApplicationLoader.applicationContext;
        switch (id) {
            case "time":
                return new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            case "date":
                return new SimpleDateFormat("d MMM", Locale.getDefault()).format(new Date());
            case "battery": {
                Intent i = context.registerReceiver(null, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
                if (i == null) {
                    return "Заряд ?";
                }
                int level = i.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
                int scale = i.getIntExtra(BatteryManager.EXTRA_SCALE, 100);
                return level < 0 ? "Заряд ?" : (level * 100 / Math.max(1, scale)) + "%";
            }
            case "memory": {
                Runtime r = Runtime.getRuntime();
                return ((r.totalMemory() - r.freeMemory()) / 1024 / 1024) + " МБ";
            }
            case "proxy":
                return SharedConfig.isProxyEnabled() ? "Прокси вкл." : "Без прокси";
            case "weather":
                loadWeather();
                return weather;
            case "ping": {
                SharedConfig.ProxyInfo p = SharedConfig.currentProxy;
                return SharedConfig.isProxyEnabled() && p != null && p.available ? p.ping + " мс" : "Без прокси";
            }
            case "ghost":
                return GhostModePlugin.active() ? "Призрак вкл." : "Призрак выкл.";
            default:
                return "";
        }
    }

    private static volatile String weather = "Погода…";
    private static volatile long weatherTime;
    private static volatile boolean weatherLoading;

    /** Weather from public keyless APIs: ipwho.is (place by IP, no permission needed) + Open-Meteo. Cached for 30 minutes. */
    private static void loadWeather() {
        if (weatherLoading || System.currentTimeMillis() - weatherTime < 30 * 60 * 1000L) {
            return;
        }
        weatherLoading = true;
        new Thread(() -> {
            try {
                org.json.JSONObject place = new org.json.JSONObject(get("https://ipwho.is/?fields=latitude,longitude,success"));
                String url = "https://api.open-meteo.com/v1/forecast?current=temperature_2m,weather_code&latitude="
                        + place.getDouble("latitude") + "&longitude=" + place.getDouble("longitude");
                org.json.JSONObject cur = new org.json.JSONObject(get(url)).getJSONObject("current");
                int code = cur.getInt("weather_code");
                String sky = code == 0 ? "☀️" : code <= 3 ? "⛅" : code <= 48 ? "☁️" : code <= 67 || (code >= 80 && code <= 82) ? "🌧" : code <= 77 || code >= 85 && code <= 86 ? "❄️" : "⛈";
                weather = sky + " " + Math.round(cur.getDouble("temperature_2m")) + "°C";
                weatherTime = System.currentTimeMillis();
            } catch (Throwable t) {
                weather = "Погода ?";
                weatherTime = System.currentTimeMillis() - 25 * 60 * 1000L;
            } finally {
                weatherLoading = false;
            }
        }, "tgyou-weather").start();
    }

    private static String get(String address) throws java.io.IOException {
        java.net.HttpURLConnection c = (java.net.HttpURLConnection) new java.net.URL(address).openConnection();
        c.setConnectTimeout(8000);
        c.setReadTimeout(8000);
        try (java.io.InputStream in = c.getInputStream(); java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream()) {
            byte[] buf = new byte[4096];
            for (int n; (n = in.read(buf)) > 0; ) {
                out.write(buf, 0, n);
            }
            return out.toString("UTF-8");
        } finally {
            c.disconnect();
        }
    }

    /** Small shield with a tick, drawn by hand: the stock bitmaps are oversized for a pill. */
    private static final class ShieldDrawable extends android.graphics.drawable.Drawable {
        private final android.graphics.Paint fill = new android.graphics.Paint(android.graphics.Paint.ANTI_ALIAS_FLAG);
        private final android.graphics.Paint tick = new android.graphics.Paint(android.graphics.Paint.ANTI_ALIAS_FLAG);
        private final android.graphics.Path shield = new android.graphics.Path();
        private final android.graphics.Path mark = new android.graphics.Path();

        ShieldDrawable(int color, int tickColor) {
            fill.setColor(color);
            tick.setColor(tickColor);
            tick.setStyle(android.graphics.Paint.Style.STROKE);
            tick.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            tick.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        }

        @Override
        public void draw(android.graphics.Canvas c) {
            android.graphics.Rect r = getBounds();
            float w = r.width(), h = r.height(), x = r.left, y = r.top;
            shield.reset();
            shield.moveTo(x + w * 0.5f, y);
            shield.lineTo(x + w * 0.92f, y + h * 0.16f);
            shield.lineTo(x + w * 0.92f, y + h * 0.5f);
            shield.quadTo(x + w * 0.92f, y + h * 0.84f, x + w * 0.5f, y + h);
            shield.quadTo(x + w * 0.08f, y + h * 0.84f, x + w * 0.08f, y + h * 0.5f);
            shield.lineTo(x + w * 0.08f, y + h * 0.16f);
            shield.close();
            c.drawPath(shield, fill);
            tick.setStrokeWidth(w * 0.11f);
            mark.reset();
            mark.moveTo(x + w * 0.3f, y + h * 0.5f);
            mark.lineTo(x + w * 0.45f, y + h * 0.65f);
            mark.lineTo(x + w * 0.72f, y + h * 0.35f);
            c.drawPath(mark, tick);
        }

        @Override
        public void setAlpha(int alpha) {
        }

        @Override
        public void setColorFilter(android.graphics.ColorFilter filter) {
        }

        @Override
        public int getOpacity() {
            return android.graphics.PixelFormat.TRANSLUCENT;
        }
    }

    /** Adds the pill to the search field; does nothing when no pill is enabled. */
    public static void attach(org.telegram.ui.Components.FragmentSearchField field) {
        if (field == null || enabled().isEmpty()) {
            return;
        }
        Context context = field.getContext();
        final int[] index = {0};
        TextView pill = new TextView(context) {
            private final Runnable tick = new Runnable() {
                @Override
                public void run() {
                    update();
                    AndroidUtilities.runOnUIThread(this, weatherLoading ? 2500 : 30000);
                }
            };

            void update() {
                List<String> list = enabled();
                if (list.isEmpty()) {
                    setVisibility(GONE);
                    return;
                }
                setVisibility(VISIBLE);
                boolean dark = Theme.isCurrentThemeDark();
                ((GradientDrawable) getBackground()).setColor(dark ? Theme.multAlpha(0xFF000000, 0.28f)
                        : Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText), 0.08f));
                String id = list.get(index[0] % list.size());
                setText(text(id));
                boolean shieldIcon = "proxy".equals(id) || "ping".equals(id);
                int color = "ping".equals(id) && SharedConfig.isProxyEnabled() ? 0xFF4CAF50 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText);
                setTextColor(color);
                android.graphics.drawable.Drawable d = null;
                if (shieldIcon) {
                    d = new ShieldDrawable(color, Theme.isCurrentThemeDark() ? 0xFF1C1C1E : 0xFFFFFFFF);
                    d.setBounds(0, 0, AndroidUtilities.dp(16), AndroidUtilities.dp(18));
                }
                setCompoundDrawables(d, null, null, null);
            }

            @Override
            protected void onMeasure(int widthSpec, int heightSpec) {
                // Адаптивность: таблетка занимает не больше 45% поля, остальное — подсказка поиска.
                View parent = (View) getParent();
                View field2 = parent == null ? null : (View) parent.getParent();
                int max = field2 == null || field2.getWidth() == 0 ? AndroidUtilities.dp(140) : (int) (field2.getWidth() * 0.45f);
                super.onMeasure(MeasureSpec.makeMeasureSpec(Math.min(MeasureSpec.getSize(widthSpec), max), MeasureSpec.AT_MOST), heightSpec);
            }

            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                tick.run();
            }

            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(tick);
            }

            @Override
            public boolean performClick() {
                index[0]++;
                update();
                return super.performClick();
            }
        };
        pill.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
        pill.setTypeface(AndroidUtilities.bold());
        pill.setGravity(Gravity.CENTER);
        pill.setSingleLine(true);
        pill.setEllipsize(android.text.TextUtils.TruncateAt.END);
        pill.setCompoundDrawablePadding(AndroidUtilities.dp(6));
        pill.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        GradientDrawable bg = new GradientDrawable();
        bg.setCornerRadius(AndroidUtilities.dp(16));
        pill.setBackground(bg);
        pill.setPadding(AndroidUtilities.dp(12), 0, AndroidUtilities.dp(14), 0);
        pill.setOnClickListener(v -> { });
        pill.setOnLongClickListener(v -> {
            BaseFragment fragment = LaunchActivity.getSafeLastFragment();
            if (fragment != null) {
                fragment.presentFragment(new PillStackScreen());
            }
            return true;
        });
        android.widget.LinearLayout.LayoutParams lp = new android.widget.LinearLayout.LayoutParams(android.view.ViewGroup.LayoutParams.WRAP_CONTENT, AndroidUtilities.dp(32));
        lp.gravity = Gravity.CENTER_VERTICAL;
        lp.rightMargin = AndroidUtilities.dp(2);
        pill.setLayoutParams(lp);
        field.addAdditionalIcon(pill);
    }
}
