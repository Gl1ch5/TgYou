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

    public static final String[] IDS = {"time", "date", "battery", "memory", "proxy", "ping", "ghost"};
    public static final String[] TITLES = {"Время", "Дата", "Заряд батареи", "Память приложения", "Прокси", "Пинг прокси", "Режим призрака"};

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

    private static int icon(String id) {
        switch (id) {
            case "date":
                return org.telegram.messenger.R.drawable.msg_calendar2;
            case "proxy":
            case "ping":
                return org.telegram.messenger.R.drawable.proxy_check;
            case "ghost":
                return org.telegram.messenger.R.drawable.msg_secret;
            default:
                return 0;
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
                    AndroidUtilities.runOnUIThread(this, 30000);
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
                int res = icon(id);
                android.graphics.drawable.Drawable d = res == 0 ? null : getContext().getResources().getDrawable(res).mutate();
                if (d != null) {
                    int color = "ping".equals(id) && SharedConfig.isProxyEnabled() ? 0xFF4CAF50 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText);
                    d.setColorFilter(new android.graphics.PorterDuffColorFilter(color, android.graphics.PorterDuff.Mode.MULTIPLY));
                    d.setBounds(0, 0, AndroidUtilities.dp(20), AndroidUtilities.dp(20));
                    setTextColor(color);
                } else {
                    setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
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
