package com.tgyou.ui;

import android.content.Context;
import android.graphics.Outline;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tgyou.core.Plugin;
import com.tgyou.core.PluginHost;
import com.tgyou.core.Section;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

/**
 * Main TgYou screen in the AyuGram style: the app icon, name and version on top, then one list of
 * categories and a list of links. Everything TgYou has lives here, there are no tiles or banners.
 */
public class TgYouSettingsActivity extends TgYouScreen {

    @Override
    protected String screenTitle() {
        return "TgYou";
    }

    @Override
    protected void build() {
        PluginHost host = PluginHost.get();

        custom("hero", this::createHero, v -> {});

        header("Категории");
        item(R.drawable.tgy_ghost, "Режим Призрака", null, () -> presentFragment(new GhostScreen()));
        item(R.drawable.tgy_spy, "Шпион", null, () -> presentFragment(new SpyScreen()));
        item(R.drawable.tgy_filters, "Фильтры", null, () -> presentFragment(new FiltersScreen()));
        item(R.drawable.tgy_basic, "Основные", null, () -> presentFragment(new BasicScreen()));
        item(R.drawable.tgy_chats, "Чаты", null, () -> presentFragment(new ChatsScreen()));
        item(R.drawable.tgy_palette, "Кастомизация", null, () -> presentFragment(new CustomizationScreen()));
        item(R.drawable.tgy_star, "Иконки", null, () -> presentFragment(new IconPacksActivity()));
        item(R.drawable.tgy_phone, "Иконка приложения", null, () -> presentFragment(new TgYouIconsActivity()));
        item(R.drawable.tgy_mods, "Моды", null, () -> presentFragment(new ModsActivity()));
        item(R.drawable.tgy_code, "Для разработчиков", com.tgyou.core.TgYouDebug.enabled() ? "отладка включена" : null, () -> presentFragment(new DeveloperScreen()));
        if (host != null) {
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
                if (total > 0) {
                    item(R.drawable.tgy_list, section.title, enabled + "/" + total, () -> presentFragment(new TgYouSectionActivity(section)));
                }
            }
        }
        for (com.tgyou.mods.ModPages.Page page : com.tgyou.mods.ModPages.all()) {
            item(R.drawable.tgy_mods, page.title, null, () -> presentFragment(new ModPageActivity(page)));
        }
        for (com.tgyou.mods.ModPages.Action action : com.tgyou.mods.ModPages.actions()) {
            item(R.drawable.tgy_bolt, action.title, null, () -> AndroidUtilities.runOnUIThread(action.run));
        }
        gap();

        header("Ссылки");
        item(R.drawable.tgy_update, "Обновления", "GitHub", () -> presentFragment(new TgYouUpdateActivity()));
        if (host != null) {
            item(R.drawable.tgy_list, "Все функции", String.valueOf(host.plugins().size()), () -> presentFragment(new TgYouSectionActivity((Section) null)));
        }
        item(R.drawable.tgy_code, "Исходный код", "Gl1ch5/TgYou", () -> org.telegram.messenger.browser.Browser.openUrl(getParentActivity(), "https://github.com/Gl1ch5/TgYou"));
        item(R.drawable.tgy_globe, "Веб-сайт", "telegram-you.ru", () -> org.telegram.messenger.browser.Browser.openUrl(getParentActivity(), "https://telegram-you.ru"));
        gap();
    }

    private View createHero(Context context) {
        LinearLayout box = new LinearLayout(context);
        box.setOrientation(LinearLayout.VERTICAL);
        box.setGravity(Gravity.CENTER_HORIZONTAL);
        box.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        box.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        ImageView icon = new ImageView(context);
        icon.setImageResource(R.drawable.tgyou_logo);
        icon.setScaleType(ImageView.ScaleType.CENTER_CROP);
        icon.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(22));
            }
        });
        icon.setClipToOutline(true);
        box.addView(icon, LayoutHelper.createLinear(90, 90, Gravity.CENTER_HORIZONTAL, 0, 12, 0, 0));

        TextView name = new TextView(context);
        name.setText("TgYou");
        name.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        name.setTypeface(AndroidUtilities.bold());
        name.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        box.addView(name, LayoutHelper.createLinear(LayoutHelper.WRAP_CONTENT, LayoutHelper.WRAP_CONTENT, Gravity.CENTER_HORIZONTAL, 0, 16, 0, 0));

        TextView version = new TextView(context);
        version.setText(TgYouVersion.beta() + " \u00b7 на базе Telegram " + BuildVars.BUILD_VERSION_STRING.replaceAll("-tgyou.*$", ""));
        version.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        version.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText));
        box.addView(version, LayoutHelper.createLinear(LayoutHelper.WRAP_CONTENT, LayoutHelper.WRAP_CONTENT, Gravity.CENTER_HORIZONTAL, 0, 4, 0, 18));
        return box;
    }
}
