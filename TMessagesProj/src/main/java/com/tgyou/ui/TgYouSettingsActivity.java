package com.tgyou.ui;

import android.content.Context;
import android.view.View;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;


import com.tgyou.core.Plugin;
import com.tgyou.core.PluginHost;
import com.tgyou.core.Section;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.IconBackgroundColors;
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

        build(context, true);
        return fragmentView;
    }

    private static int iconFor(Section section) {
        switch (section) {
            case PRIVACY:
                return R.drawable.settings_privacy;
            case MESSAGES:
                return R.drawable.settings_chat;
            case FILTERS:
                return R.drawable.settings_folders;
            case INTERFACE:
                return R.drawable.settings_devices;
            case AI:
                return R.drawable.settings_features;
            default:
                return R.drawable.settings_data;
        }
    }

    private static IconBackgroundColors colorsFor(Section section) {
        switch (section) {
            case PRIVACY:
                return IconBackgroundColors.GREEN;
            case MESSAGES:
                return IconBackgroundColors.ORANGE;
            case FILTERS:
                return IconBackgroundColors.BLUE_ALT;
            case INTERFACE:
                return IconBackgroundColors.CYAN;
            case AI:
                return IconBackgroundColors.PURPLE;
            default:
                return IconBackgroundColors.GRAY;
        }
    }

    private void build(Context context, boolean animate) {
        content.removeAllViews();
        PluginHost host = PluginHost.get();
        if (host == null) {
            return;
        }
        int index = 0;
        addBanners(context);
        group(context, "Настройки");
        addWide(context, R.drawable.settings_privacy, IconBackgroundColors.GREEN, "Режим Призрака", "не читать, не печатать, офлайн, отложка", animate ? index++ : -1, () -> presentFragment(new GhostScreen()));
        addWide(context, R.drawable.settings_folders, IconBackgroundColors.BLUE, "Фильтры сообщений", "слова, теневой бан", animate ? index++ : -1, () -> presentFragment(new FiltersScreen()));
        addWide(context, R.drawable.settings_devices, IconBackgroundColors.PURPLE, "Шпион", "удалённые, правки, прочтения, вложения", animate ? index++ : -1, () -> presentFragment(new SpyScreen()));
        addWide(context, R.drawable.settings_data, IconBackgroundColors.ORANGE, "Основные", "скорость, профиль, архив, хранилище", animate ? index++ : -1, () -> presentFragment(new BasicScreen()));
        addWide(context, R.drawable.settings_chat, IconBackgroundColors.CYAN, "Чаты", "текст, стикеры, поле ввода", animate ? index++ : -1, () -> presentFragment(new ChatsScreen()));
        group(context, "Функции по разделам");

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
            TgYouTile tile = new TgYouTile(context, iconFor(section), colorsFor(section), section.title, enabled + " из " + total + " включено", false);
            tile.setOnClickListener(v -> presentFragment(new TgYouSectionActivity(section)));
            if (animate) {
                tile.enter(index++);
            }
            rowLayout.addView(tile, LayoutHelper.createLinear(0, LayoutHelper.WRAP_CONTENT, 1f, inRow == 0 ? 0 : 5, 0, inRow == 0 ? 5 : 0, 0));
            inRow = (inRow + 1) % 2;
        }
        if (inRow == 1) {
            rowLayout.addView(new View(context), LayoutHelper.createLinear(0, 1, 1f, 5, 0, 0, 0));
        }

        group(context, "Оформление");
        addWide(context, R.drawable.settings_folders, IconBackgroundColors.CYAN, "Внешний вид", "прозрачность, скругление, размер текста", animate ? index++ : -1, () -> presentFragment(new AppearanceScreen()));
        addWide(context, R.drawable.settings_folders, IconBackgroundColors.PURPLE, "Иконки", "наборы .icons с предпросмотром", animate ? index++ : -1, () -> presentFragment(new IconPacksActivity()));
        addWide(context, R.drawable.settings_gift, IconBackgroundColors.RED, "Иконка приложения", "TgYou, Telegram и другие", animate ? index++ : -1, () -> presentFragment(new TgYouIconsActivity()));

        group(context, "Расширения");
        addWide(context, R.drawable.settings_features, IconBackgroundColors.ORANGE_DEEP, "Моды", "маркетплейс, установленные, создать мод", animate ? index++ : -1, () -> presentFragment(new ModsActivity()));
        for (com.tgyou.mods.ModPages.Page page : com.tgyou.mods.ModPages.all()) {
            addWide(context, R.drawable.settings_calls, IconBackgroundColors.GREEN, page.title, "страница мода", animate ? index++ : -1, () -> presentFragment(new ModPageActivity(page)));
        }

        for (com.tgyou.mods.ModPages.Action action : com.tgyou.mods.ModPages.actions()) {
            addWide(context, R.drawable.settings_features, IconBackgroundColors.ORANGE_DEEP, action.title, "действие мода", animate ? index++ : -1, () -> org.telegram.messenger.AndroidUtilities.runOnUIThread(action.run));
        }

        group(context, "Приложение");
        addWide(context, R.drawable.settings_ask, IconBackgroundColors.BLUE, "Обновления", "новые версии из релизов GitHub", animate ? index++ : -1, () -> presentFragment(new TgYouUpdateActivity()));
        addWide(context, R.drawable.settings_faq, IconBackgroundColors.GRAY, "Все функции", host.plugins().size() + " плагинов и модов", animate ? index++ : -1, () -> presentFragment(new TgYouSectionActivity((Section) null)));
    }

    private void group(Context context, String title) {
        TextView t = new TextView(context);
        t.setText(title.toUpperCase());
        t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
        t.setTypeface(AndroidUtilities.bold());
        t.setTextColor(org.telegram.ui.ActionBar.Theme.getColor(org.telegram.ui.ActionBar.Theme.key_windowBackgroundWhiteBlueHeader));
        content.addView(t, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 6, 10, 6, 8));
    }

    private static final String[][] BANNERS = {
            {"Telegram You", null, "0xFF1CA5ED", "0xFF7C5CFF"},
            {"Что нового", null, "0xFF55CA47", "0xFF1D9CC6"},
            {"Моды", "Каталог на сервере: ставьте в одно нажатие, пишите свои на Python. Полная свобода, без песочницы.", "0xFFF28B31", "0xFFE0455F"},
            {"Приватность", "Режим призрака, скрытые просмотры, сохранение удалённых сообщений, скрытые скриншоты.", "0xFFC46EF4", "0xFF4F85F6"},
    };

    private ViewPager pager;
    private final Runnable rotate = new Runnable() {
        @Override
        public void run() {
            if (pager != null && pager.getAdapter() != null && pager.getAdapter().getCount() > 1) {
                pager.setCurrentItem((pager.getCurrentItem() + 1) % pager.getAdapter().getCount(), true);
            }
            AndroidUtilities.runOnUIThread(this, 5000);
        }
    };

    private String bannerText(int i) {
        if (i == 0) {
            return BuildVars.BUILD_VERSION_STRING + ". Плагины, моды и обновления прямо в приложении.";
        }
        if (i == 1) {
            com.tgyou.update.Updater.Release r = com.tgyou.update.UpdateManager.release();
            String notes = r != null && r.notes != null ? r.notes.replace("**", "").trim() : "";
            return notes.isEmpty() ? "Автообновление раз в минуту, карточка сверху и кружок загрузки у поиска. Новые функции: тихая отправка, пересылка без автора, инструменты сообщения." : notes;
        }
        return BANNERS[i][1];
    }

    private void addBanners(Context context) {
        pager = new ViewPager(context);
        pager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return BANNERS.length;
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                String[] b = BANNERS[position];
                LinearLayout page = new LinearLayout(context);
                page.setOrientation(LinearLayout.VERTICAL);
                page.setGravity(Gravity.CENTER_VERTICAL);
                int p = AndroidUtilities.dp(20);
                page.setPadding(p, p, p, p);
                GradientDrawable bg = new GradientDrawable(GradientDrawable.Orientation.TL_BR,
                        new int[]{(int) Long.decode(b[2]).longValue(), (int) Long.decode(b[3]).longValue()});
                bg.setCornerRadius(AndroidUtilities.dp(16));
                page.setBackground(bg);
                TextView title = new TextView(context);
                title.setText(b[0]);
                title.setTextSize(TypedValue.COMPLEX_UNIT_SP, 22);
                title.setTypeface(AndroidUtilities.bold());
                title.setTextColor(0xFFFFFFFF);
                page.addView(title);
                TextView text = new TextView(context);
                text.setText(bannerText(position));
                text.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
                text.setTextColor(0xEEFFFFFF);
                text.setMaxLines(4);
                text.setEllipsize(android.text.TextUtils.TruncateAt.END);
                page.addView(text, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 6, 0, 0));
                FrameLayout wrap = new FrameLayout(context);
                wrap.addView(page, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.MATCH_PARENT, Gravity.NO_GRAVITY, 0, 0, 8, 0));
                container.addView(wrap);
                return wrap;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView((View) object);
            }
        });
        pager.setPageMargin(0);
        content.addView(pager, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, 140, 0, 4, 0, 6));

        LinearLayout dots = new LinearLayout(context);
        dots.setGravity(Gravity.CENTER);
        View[] dot = new View[BANNERS.length];
        for (int i = 0; i < dot.length; i++) {
            dot[i] = new View(context);
            dots.addView(dot[i], LayoutHelper.createLinear(6, 6, 3, 0, 3, 0));
        }
        Runnable paint = () -> {
            for (int i = 0; i < dot.length; i++) {
                GradientDrawable d = new GradientDrawable();
                d.setShape(GradientDrawable.OVAL);
                d.setColor(i == pager.getCurrentItem() ? 0xFF1CA5ED : 0x55999999);
                dot[i].setBackground(d);
            }
        };
        paint.run();
        pager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                paint.run();
            }
        });
        content.addView(dots, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 0, 0, 10));
        AndroidUtilities.cancelRunOnUIThread(rotate);
        AndroidUtilities.runOnUIThread(rotate, 5000);
    }

    private void addWide(Context context, int icon, IconBackgroundColors accent, String title, String subtitle, int index, Runnable action) {
        TgYouTile tile = new TgYouTile(context, icon, accent, title, subtitle, true);
        tile.setOnClickListener(v -> action.run());
        if (index >= 0) {
            tile.enter(index);
        }
        content.addView(tile, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 0, 0, 10));
    }

    private boolean firstResume = true;

    @Override
    public void onResume() {
        super.onResume();
        if (firstResume) {
            firstResume = false;
            return;
        }
        if (content != null && getParentActivity() != null) {
            build(getParentActivity(), false);
        }
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(rotate);
    }
}
