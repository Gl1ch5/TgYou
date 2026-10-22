package com.tgyou.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;


import com.tgyou.core.Plugin;
import com.tgyou.core.PluginHost;
import com.tgyou.core.Section;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;


/** Main TgYou screen: a list of tabs, each opening {@link TgYouSectionActivity}. */
public class TgYouSettingsActivity extends BaseFragment {

    private LinearLayout content;

    @Override
    public View createView(Context context) {
        actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        actionBar.setAllowOverlayTitle(true);
        actionBar.setTitle("TgYou");
        actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
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
        scroll.setVerticalScrollBarEnabled(false);
        content = new LinearLayout(context);
        content.setOrientation(LinearLayout.VERTICAL);
        int side = AndroidUtilities.dp(14);
        content.setPadding(side, AndroidUtilities.dp(8), side, AndroidUtilities.dp(28));
        scroll.addView(content, new ScrollView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        frame.addView(scroll, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.MATCH_PARENT));

        build(context);
        return fragmentView;
    }

    private static int iconFor(Section section) {
        switch (section) {
            case PRIVACY:
                return R.drawable.msg_secret;
            case MESSAGES:
                return R.drawable.msg_discussion;
            case FILTERS:
                return R.drawable.msg_block;
            case INTERFACE:
                return R.drawable.msg_theme;
            case AI:
                return R.drawable.msg_voicechat;
            default:
                return R.drawable.msg_settings;
        }
    }

    private static int accentFor(Section section) {
        switch (section) {
            case PRIVACY:
                return 0xFF7C5CFF;
            case MESSAGES:
                return 0xFF2FA4E7;
            case FILTERS:
                return 0xFFE8883A;
            case INTERFACE:
                return 0xFFE05A9B;
            case AI:
                return 0xFF3DBE8B;
            default:
                return 0xFF8E9AA8;
        }
    }

    private void build(Context context) {
        content.removeAllViews();
        PluginHost host = PluginHost.get();
        if (host == null) {
            return;
        }
        int index = 0;

        LinearLayout hero = new LinearLayout(context);
        hero.setOrientation(LinearLayout.VERTICAL);
        int hp = AndroidUtilities.dp(22);
        hero.setPadding(hp, hp, hp, hp);
        GradientDrawable heroBg = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{0xFF7C5CFF, 0xFF3B8BFF});
        heroBg.setCornerRadius(AndroidUtilities.dp(28));
        hero.setBackground(heroBg);
        TextView name = new TextView(context);
        name.setText("Telegram You");
        name.setTextSize(TypedValue.COMPLEX_UNIT_SP, 26);
        name.setTypeface(AndroidUtilities.bold());
        name.setTextColor(0xFFFFFFFF);
        hero.addView(name, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT));
        int enabledAll = 0;
        int modsOn = 0;
        for (Plugin plugin : host.plugins()) {
            if (host.isEnabled(plugin)) {
                if (plugin.isMod()) {
                    modsOn++;
                } else {
                    enabledAll++;
                }
            }
        }
        TextView sub = new TextView(context);
        sub.setText(BuildVars.BUILD_VERSION_STRING + "  ·  функций включено: " + enabledAll + "  ·  модов: " + modsOn);
        sub.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13);
        sub.setTextColor(0xCCFFFFFF);
        hero.addView(sub, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 6, 0, 0));
        content.addView(hero, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 4, 0, 14));
        hero.setAlpha(0f);
        hero.animate().alpha(1f).setDuration(350).start();

        LinearLayout rowLayout = null;
        int inRow = 0;
        for (Section section : Section.values()) {
            int total = 0;
            int enabled = 0;
            for (Plugin plugin : host.plugins()) {
                if (!plugin.isMod() && plugin.section() == section) {
                    total++;
                    if (host.isEnabled(plugin)) {
                        enabled++;
                    }
                }
            }
            if (total == 0) {
                continue;
            }
            if (inRow == 0) {
                rowLayout = new LinearLayout(context);
                content.addView(rowLayout, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 0, 0, 10));
            }
            TgYouTile tile = new TgYouTile(context, iconFor(section), accentFor(section), section.title, enabled + " из " + total + " включено", false);
            tile.setOnClickListener(v -> presentFragment(new TgYouSectionActivity(section)));
            tile.enter(index++);
            rowLayout.addView(tile, LayoutHelper.createLinear(0, LayoutHelper.WRAP_CONTENT, 1f, inRow == 0 ? 0 : 5, 0, inRow == 0 ? 5 : 0, 0));
            inRow = (inRow + 1) % 2;
        }
        if (inRow == 1) {
            rowLayout.addView(new View(context), LayoutHelper.createLinear(0, 1, 1f, 5, 0, 0, 0));
        }

        addWide(context, R.drawable.msg_customize, 0xFF9B59E8, "Моды", "маркетплейс, установленные, создать мод", index++, () -> presentFragment(new ModsActivity()));
        for (com.tgyou.mods.ModPages.Page page : com.tgyou.mods.ModPages.all()) {
            addWide(context, R.drawable.msg_stats, 0xFF3DBE8B, page.title, "страница мода", index++, () -> presentFragment(new ModPageActivity(page)));
        }
        addWide(context, R.drawable.msg_download, 0xFF2FA4E7, "Обновления", "новые версии из релизов GitHub", index++, () -> presentFragment(new TgYouUpdateActivity()));
        addWide(context, R.drawable.msg_photos, 0xFFE05A9B, "Иконка приложения", "TgYou, Telegram и другие", index++, () -> presentFragment(new TgYouIconsActivity()));
        addWide(context, R.drawable.msg_list, 0xFF8E9AA8, "Все функции", host.plugins().size() + " плагинов и модов", index++, () -> presentFragment(new TgYouSectionActivity((Section) null)));
    }

    private void addWide(Context context, int icon, int accent, String title, String subtitle, int index, Runnable action) {
        TgYouTile tile = new TgYouTile(context, icon, accent, title, subtitle, true);
        tile.setOnClickListener(v -> action.run());
        tile.enter(index);
        content.addView(tile, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 0, 0, 10));
    }

    @Override
    public void onResume() {
        super.onResume();
        if (content != null && getParentActivity() != null) {
            build(getParentActivity());
        }
    }
}
