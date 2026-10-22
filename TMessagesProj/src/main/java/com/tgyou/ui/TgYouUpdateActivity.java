package com.tgyou.ui;

import android.content.Context;
import android.view.View;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.tgyou.update.Updater;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

import java.io.File;
import java.util.Locale;

/** Checks GitHub releases for a newer build and installs it from inside the app. */
public class TgYouUpdateActivity extends BaseFragment {

    private TextView titleView;
    private TextView subtitleView;
    private TextView notesCard;
    private TextView checkButton;
    private TextView installButton;
    private ProgressBar progress;

    private Updater.Release release;
    private File downloaded;
    private boolean busy;

    @Override
    public View createView(Context context) {
        actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        actionBar.setAllowOverlayTitle(true);
        actionBar.setTitle("Обновления");
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
        int side = AndroidUtilities.dp(14);

        LinearLayout column = new LinearLayout(context);
        column.setOrientation(LinearLayout.VERTICAL);
        column.setPadding(side, AndroidUtilities.dp(8), side, AndroidUtilities.dp(24));

        LinearLayout hero = new LinearLayout(context);
        hero.setOrientation(LinearLayout.VERTICAL);
        int hp = AndroidUtilities.dp(22);
        hero.setPadding(hp, hp, hp, hp);
        GradientDrawable heroBg = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{0xFF2FA4E7, 0xFF7C5CFF});
        heroBg.setCornerRadius(AndroidUtilities.dp(28));
        hero.setBackground(heroBg);
        titleView = new TextView(context);
        titleView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        titleView.setTypeface(AndroidUtilities.bold());
        titleView.setTextColor(0xFFFFFFFF);
        hero.addView(titleView, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT));
        subtitleView = new TextView(context);
        subtitleView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
        subtitleView.setTextColor(0xD9FFFFFF);
        hero.addView(subtitleView, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 6, 0, 0));
        progress = new ProgressBar(context, null, android.R.attr.progressBarStyleHorizontal);
        progress.setMax(100);
        progress.setProgressTintList(android.content.res.ColorStateList.valueOf(0xFFFFFFFF));
        progress.setProgressBackgroundTintList(android.content.res.ColorStateList.valueOf(0x55FFFFFF));
        progress.setVisibility(View.GONE);
        hero.addView(progress, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, 6, 0, 14, 0, 0));
        column.addView(hero, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 4, 0, 12));

        LinearLayout buttons = new LinearLayout(context);
        checkButton = button(context, "Проверить", 0xFF2FA4E7, v -> check());
        installButton = button(context, "Скачать", 0xFF3DBE8B, v -> installOrDownload());
        buttons.addView(checkButton, LayoutHelper.createLinear(0, 52, 1f, 0, 0, 5, 0));
        buttons.addView(installButton, LayoutHelper.createLinear(0, 52, 1f, 5, 0, 0, 0));
        column.addView(buttons, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 0, 0, 12));

        notesCard = new TextView(context);
        notesCard.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
        notesCard.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2));
        int np = AndroidUtilities.dp(16);
        notesCard.setPadding(np, np, np, np);
        GradientDrawable notesBg = new GradientDrawable();
        notesBg.setCornerRadius(AndroidUtilities.dp(20));
        notesBg.setColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        notesCard.setBackground(notesBg);
        column.addView(notesCard, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT));

        ScrollView scroll = new ScrollView(context);
        scroll.setVerticalScrollBarEnabled(false);
        scroll.addView(column);
        frame.addView(scroll, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.MATCH_PARENT));

        render("Установлена: " + installedLabel());
        check();
        return fragmentView;
    }

    private String installedLabel() {
        String tag = Updater.installedTag();
        return tag.isEmpty() ? "сборка из ветки (без номера релиза)" : tag;
    }

    private TextView button(Context context, String text, int color, View.OnClickListener click) {
        TextView b = new TextView(context);
        b.setText(text);
        b.setGravity(Gravity.CENTER);
        b.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
        b.setTypeface(AndroidUtilities.bold());
        b.setTextColor(0xFFFFFFFF);
        GradientDrawable bg = new GradientDrawable();
        bg.setCornerRadius(AndroidUtilities.dp(18));
        bg.setColor(color);
        b.setBackground(bg);
        b.setOnClickListener(click);
        b.setOnTouchListener((v, e) -> {
            if (e.getActionMasked() == MotionEvent.ACTION_DOWN) {
                v.animate().scaleX(0.95f).scaleY(0.95f).setDuration(100).start();
            } else if (e.getActionMasked() == MotionEvent.ACTION_UP || e.getActionMasked() == MotionEvent.ACTION_CANCEL) {
                v.animate().scaleX(1f).scaleY(1f).setDuration(200).start();
            }
            return false;
        });
        return b;
    }

    private void render(String status) {
        checkButton.setAlpha(busy ? 0.5f : 1f);
        if (release != null && downloaded != null) {
            titleView.setText("Готово к установке");
            subtitleView.setText(release.tag + " скачана");
            installButton.setText("Установить");
            installButton.setVisibility(View.VISIBLE);
        } else if (release != null) {
            String size = release.size > 0 ? String.format(Locale.US, " · %.0f МБ", release.size / 1048576.0) : "";
            titleView.setText("Доступно обновление");
            subtitleView.setText(release.tag + size + "  (у вас " + installedLabel() + ")");
            installButton.setText("Скачать");
            installButton.setVisibility(View.VISIBLE);
        } else {
            titleView.setText(busy ? "Проверяю…" : "Telegram You");
            subtitleView.setText("Установлена: " + installedLabel());
            installButton.setVisibility(View.GONE);
        }
        progress.setVisibility(busy && release != null ? View.VISIBLE : View.GONE);
        notesCard.setText(status);
    }

    private void check() {
        if (busy) {
            return;
        }
        busy = true;
        render("Проверяю релизы на GitHub…");
        Updater.check((rel, isNewer, error) -> {
            busy = false;
            if (error != null) {
                release = null;
                render("Не удалось проверить: " + error);
            } else if (rel == null) {
                release = null;
                render("В релизах пока нет APK.");
            } else if (!isNewer) {
                release = null;
                render("У вас последняя версия: " + installedLabel());
            } else {
                release = rel;
                downloaded = null;
                String notes = rel.notes == null ? "" : rel.notes.trim();
                render("Доступна " + rel.tag + " (у вас " + installedLabel() + ")" + (notes.isEmpty() ? "" : "\n\n" + notes));
            }
        });
    }

    private void installOrDownload() {
        if (release == null || busy) {
            return;
        }
        Context context = getParentActivity();
        if (downloaded != null) {
            Updater.install(context, downloaded);
            return;
        }
        busy = true;
        Updater.download(context, release, new Updater.DownloadCallback() {
            @Override
            public void progress(int percent) {
                titleView.setText("Скачиваю…");
                subtitleView.setText(release.tag + " · " + percent + "%");
                progress.setVisibility(View.VISIBLE);
                progress.setProgress(percent);
            }

            @Override
            public void done(File apk, String error) {
                busy = false;
                if (error != null) {
                    render("Не удалось скачать: " + error);
                } else {
                    downloaded = apk;
                    render("Система спросит подтверждение, данные сохранятся.");
                    Updater.install(context, apk);
                }
            }
        });
    }
}
