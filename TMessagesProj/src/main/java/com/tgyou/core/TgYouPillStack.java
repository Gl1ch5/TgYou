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

    public static final String[] IDS = {"time", "date", "battery", "memory", "proxy", "ghost"};
    public static final String[] TITLES = {"Время", "Дата", "Заряд батареи", "Память приложения", "Прокси", "Режим призрака"};

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
            case "ghost":
                return GhostModePlugin.active() ? "Призрак вкл." : "Призрак выкл.";
            default:
                return "";
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
                setText(text(list.get(index[0] % list.size())));
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
        pill.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
        pill.setTypeface(AndroidUtilities.bold());
        pill.setGravity(Gravity.CENTER);
        pill.setSingleLine(true);
        pill.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
        GradientDrawable bg = new GradientDrawable();
        bg.setCornerRadius(AndroidUtilities.dp(12));
        bg.setColor(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4), 0.15f));
        pill.setBackground(bg);
        pill.setPadding(AndroidUtilities.dp(8), AndroidUtilities.dp(3), AndroidUtilities.dp(8), AndroidUtilities.dp(3));
        pill.setOnClickListener(v -> { });
        pill.setOnLongClickListener(v -> {
            BaseFragment fragment = LaunchActivity.getSafeLastFragment();
            if (fragment != null) {
                fragment.presentFragment(new PillStackScreen());
            }
            return true;
        });
        field.addAdditionalIcon(pill);
    }
}
