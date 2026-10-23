package com.tgyou.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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

import com.tgyou.update.UpdateManager;
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
public class TgYouUpdateActivity extends BaseFragment implements UpdateManager.Listener {

    private TextView titleView;
    private TextView subtitleView;
    private LinearLayout history;
    private LinearLayout hero;
    private GradientDrawable heroBg;
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

        hero = new LinearLayout(context) {
            private final Paint dots = new Paint(Paint.ANTI_ALIAS_FLAG);

            @Override
            protected void dispatchDraw(Canvas canvas) {
                dots.setColor(0x22FFFFFF);
                canvas.drawCircle(getWidth() - AndroidUtilities.dp(30), AndroidUtilities.dp(10), AndroidUtilities.dp(90), dots);
                dots.setColor(0x16FFFFFF);
                canvas.drawCircle(getWidth() - AndroidUtilities.dp(110), getHeight() + AndroidUtilities.dp(10), AndroidUtilities.dp(70), dots);
                canvas.drawCircle(AndroidUtilities.dp(20), getHeight() * 0.9f, AndroidUtilities.dp(46), dots);
                super.dispatchDraw(canvas);
            }
        };
        hero.setWillNotDraw(false);
        hero.setOrientation(LinearLayout.VERTICAL);
        int hp = AndroidUtilities.dp(24);
        hero.setPadding(hp, hp, hp, hp);
        heroBg = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{0xFF2FA4E7, 0xFF7C5CFF});
        heroBg.setCornerRadius(AndroidUtilities.dp(30));
        hero.setBackground(heroBg);
        hero.setClipToOutline(true);
        TextView chip = new TextView(context);
        chip.setText("TELEGRAM YOU");
        chip.setTextSize(TypedValue.COMPLEX_UNIT_SP, 11);
        chip.setTypeface(AndroidUtilities.bold());
        chip.setLetterSpacing(0.12f);
        chip.setTextColor(0xFFFFFFFF);
        chip.setPadding(AndroidUtilities.dp(10), AndroidUtilities.dp(4), AndroidUtilities.dp(10), AndroidUtilities.dp(4));
        GradientDrawable chipBg = new GradientDrawable();
        chipBg.setCornerRadius(AndroidUtilities.dp(12));
        chipBg.setColor(0x33FFFFFF);
        chip.setBackground(chipBg);
        hero.addView(chip, LayoutHelper.createLinear(LayoutHelper.WRAP_CONTENT, LayoutHelper.WRAP_CONTENT, 0, 0, 0, 14));
        titleView = new TextView(context);
        titleView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 28);
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

        TextView historyTitle = new TextView(context);
        historyTitle.setText("История версий");
        historyTitle.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
        historyTitle.setTypeface(AndroidUtilities.bold());
        historyTitle.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader));
        historyTitle.setPadding(AndroidUtilities.dp(6), AndroidUtilities.dp(6), 0, AndroidUtilities.dp(8));
        column.addView(historyTitle, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT));
        history = new LinearLayout(context);
        history.setOrientation(LinearLayout.VERTICAL);
        column.addView(history, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT));

        ScrollView scroll = new ScrollView(context);
        scroll.setVerticalScrollBarEnabled(false);
        scroll.addView(column);
        frame.addView(scroll, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.MATCH_PARENT));

        UpdateManager.addListener(this);
        onUpdateChanged();
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
        int[] colors;
        if (release != null && downloaded != null) {
            colors = new int[]{0xFF1FB67A, 0xFF2FA4E7};
        } else if (release != null) {
            colors = new int[]{0xFF7C5CFF, 0xFFE2559C};
        } else {
            colors = new int[]{0xFF2FA4E7, 0xFF7C5CFF};
        }
        heroBg.setColors(colors);
        hero.invalidate();
        if (release == null && !busy) {
            subtitleView.setText(status + "\nУстановлена: " + installedLabel());
        }
        rebuildHistory();
    }

    // ---- history of versions ------------------------------------------------------------

    private void rebuildHistory() {
        Context context = history.getContext();
        history.removeAllViews();
        java.util.List<Updater.Release> all = Updater.history();
        if (all.isEmpty()) {
            TextView empty = new TextView(context);
            empty.setText("Список версий загружается…");
            empty.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
            empty.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2));
            empty.setPadding(AndroidUtilities.dp(6), 0, 0, 0);
            history.addView(empty);
            return;
        }
        for (int i = 0; i < all.size(); i++) {
            history.addView(releaseCard(context, all.get(i), i == 0), LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 0, 0, 10));
        }
    }

    private static String beta(String tag) {
        java.util.regex.Matcher m = java.util.regex.Pattern.compile("beta(\\d+)").matcher(tag == null ? "" : tag);
        return m.find() ? "beta " + m.group(1) : tag;
    }

    private static String date(String iso) {
        try {
            java.text.SimpleDateFormat in = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
            in.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
            return new java.text.SimpleDateFormat("d MMM yyyy, HH:mm", new Locale("ru")).format(in.parse(iso));
        } catch (Throwable t) {
            return "";
        }
    }

    private TextView chip(Context context, String text, int color) {
        TextView t = new TextView(context);
        t.setText(text);
        t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 11);
        t.setTypeface(AndroidUtilities.bold());
        t.setTextColor(0xFFFFFFFF);
        t.setPadding(AndroidUtilities.dp(8), AndroidUtilities.dp(2), AndroidUtilities.dp(8), AndroidUtilities.dp(2));
        GradientDrawable bg = new GradientDrawable();
        bg.setCornerRadius(AndroidUtilities.dp(10));
        bg.setColor(color);
        t.setBackground(bg);
        return t;
    }

    private View releaseCard(Context context, Updater.Release r, boolean newest) {
        boolean installed = r.tag.equals(Updater.installedTag());
        LinearLayout card = new LinearLayout(context);
        card.setOrientation(LinearLayout.VERTICAL);
        int pad = AndroidUtilities.dp(16);
        card.setPadding(pad, pad - AndroidUtilities.dp(2), pad, pad);
        GradientDrawable bg = new GradientDrawable();
        bg.setCornerRadius(AndroidUtilities.dp(22));
        bg.setColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        if (installed) {
            bg.setStroke(AndroidUtilities.dp(1.5f), 0xFF3DBE8B);
        }
        card.setBackground(bg);

        LinearLayout head = new LinearLayout(context);
        head.setGravity(Gravity.CENTER_VERTICAL);
        TextView name = new TextView(context);
        name.setText(beta(r.tag));
        name.setTextSize(TypedValue.COMPLEX_UNIT_SP, 19);
        name.setTypeface(AndroidUtilities.bold());
        name.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        head.addView(name);
        if (installed) {
            head.addView(chip(context, "установлена", 0xFF3DBE8B), LayoutHelper.createLinear(LayoutHelper.WRAP_CONTENT, LayoutHelper.WRAP_CONTENT, 8, 0, 0, 0));
        } else if (newest && release != null && r.tag.equals(release.tag)) {
            head.addView(chip(context, "новая", 0xFF7C5CFF), LayoutHelper.createLinear(LayoutHelper.WRAP_CONTENT, LayoutHelper.WRAP_CONTENT, 8, 0, 0, 0));
        }
        card.addView(head, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT));
        String when = date(r.date);
        if (!when.isEmpty()) {
            TextView d = new TextView(context);
            d.setText(when);
            d.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
            d.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2));
            card.addView(d, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 2, 0, 8));
        }
        fillNotes(context, card, r);
        return card;
    }

    private static final int COLLAPSED_ROWS = 5;

    /** Turns GitHub release markdown into short bullet rows; the auto «Full Changelog» line becomes a compare link. */
    private void fillNotes(Context context, LinearLayout card, Updater.Release r) {
        String compare = "";
        int rows = 0;
        java.util.List<View> extra = new java.util.ArrayList<>();
        String body = r.notes == null ? "" : r.notes;
        for (String raw : body.split("\\r?\\n")) {
            String line = raw.trim();
            if (line.isEmpty() || line.equals("---")) {
                continue;
            }
            java.util.regex.Matcher link = java.util.regex.Pattern.compile("(https://github\\.com/\\S+/compare/\\S+)").matcher(line);
            if (line.toLowerCase(Locale.ROOT).contains("full changelog")) {
                if (link.find()) {
                    compare = link.group(1);
                }
                continue;
            }
            String text = line.replaceAll("\\[([^\\]]+)\\]\\([^)]*\\)", "$1").replace("**", "").replace("`", "");
            text = text.replaceAll("\\s+by @\\S+ in \\S+$", "").trim();
            if (text.equalsIgnoreCase("What's Changed") || text.equalsIgnoreCase("## What's Changed")) {
                continue;
            }
            boolean heading = text.startsWith("#");
            boolean bullet = text.startsWith("- ") || text.startsWith("* ");
            if (heading) {
                text = text.replaceAll("^#+\\s*", "");
            } else if (bullet) {
                text = text.substring(2).trim();
            }
            if (text.isEmpty()) {
                continue;
            }
            rows++;
            TextView row = new TextView(context);
            row.setTextSize(TypedValue.COMPLEX_UNIT_SP, heading ? 13 : 14);
            row.setLineSpacing(AndroidUtilities.dp(2), 1f);
            if (heading) {
                row.setText(text.toUpperCase(new Locale("ru")));
                row.setTypeface(AndroidUtilities.bold());
                row.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader));
            } else {
                row.setText((bullet ? "\u2022  " : "") + text);
                row.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            }
            card.addView(row, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, heading ? 6 : 3, 0, 0));
            if (rows > COLLAPSED_ROWS) {
                row.setVisibility(View.GONE);
                extra.add(row);
            }
        }
        if (!extra.isEmpty()) {
            TextView toggle = new TextView(context);
            toggle.setText("Показать весь ченджлог (ещё " + extra.size() + ") \u25BE");
            toggle.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13);
            toggle.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText));
            toggle.setPadding(0, AndroidUtilities.dp(8), 0, 0);
            boolean[] open = {false};
            toggle.setOnClickListener(v -> {
                open[0] = !open[0];
                for (View e : extra) {
                    e.setVisibility(open[0] ? View.VISIBLE : View.GONE);
                }
                toggle.setText(open[0] ? "Свернуть \u25B4" : "Показать весь ченджлог (ещё " + extra.size() + ") \u25BE");
            });
            card.addView(toggle);
        }
        if (rows == 0) {
            TextView row = new TextView(context);
            row.setText("Улучшения и исправления.");
            row.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
            row.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2));
            card.addView(row);
        }
        if (!compare.isEmpty()) {
            String url = compare;
            TextView more = new TextView(context);
            more.setText("Все изменения на GitHub \u203a");
            more.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13);
            more.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText));
            more.setPadding(0, AndroidUtilities.dp(10), 0, 0);
            more.setOnClickListener(v -> org.telegram.messenger.browser.Browser.openUrl(getParentActivity(), url));
            card.addView(more);
        }
    }

    private void check() {
        UpdateManager.check(false);
    }

    private void installOrDownload() {
        UpdateManager.download();
    }

    @Override
    public void onUpdateChanged() {
        release = UpdateManager.release();
        downloaded = UpdateManager.downloaded();
        busy = UpdateManager.isChecking() || UpdateManager.isDownloading();
        if (UpdateManager.isDownloading()) {
            titleView.setText("Скачиваю…");
            subtitleView.setText(release.tag + " · " + UpdateManager.progress() + "%");
            progress.setVisibility(View.VISIBLE);
            progress.setProgress(UpdateManager.progress());
            return;
        }
        if (release != null) {
            render("");
        } else {
            render(UpdateManager.isChecking() ? "Проверяю релизы на GitHub…" : "У вас последняя версия. Проверка идёт автоматически каждую минуту.");
        }
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        UpdateManager.removeListener(this);
    }
}
