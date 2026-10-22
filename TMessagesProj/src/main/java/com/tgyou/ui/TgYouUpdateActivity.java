package com.tgyou.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.tgyou.update.Updater;

import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.LayoutHelper;

import java.io.File;
import java.util.Locale;

/** Checks GitHub releases for a newer build and installs it from inside the app. */
public class TgYouUpdateActivity extends BaseFragment {

    private TextInfoPrivacyCell statusCell;
    private TextSettingsCell checkCell;
    private TextSettingsCell installCell;

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

        LinearLayout column = new LinearLayout(context);
        column.setOrientation(LinearLayout.VERTICAL);

        checkCell = new TextSettingsCell(context);
        checkCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        checkCell.setOnClickListener(v -> check());
        column.addView(checkCell, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT));

        installCell = new TextSettingsCell(context);
        installCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        installCell.setOnClickListener(v -> installOrDownload());
        column.addView(installCell, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT));

        statusCell = new TextInfoPrivacyCell(context);
        column.addView(statusCell, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT));

        ScrollView scroll = new ScrollView(context);
        scroll.addView(column);
        FrameLayout frame = new FrameLayout(context);
        frame.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        frame.addView(scroll, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.MATCH_PARENT));
        fragmentView = frame;

        render("Установлена: " + installedLabel());
        check();
        return fragmentView;
    }

    private String installedLabel() {
        String tag = Updater.installedTag();
        return tag.isEmpty() ? "сборка из ветки (без номера релиза)" : tag;
    }

    private void render(String status) {
        checkCell.setTextAndValue("Проверить обновления", busy ? "…" : "", true);
        if (release != null && downloaded != null) {
            installCell.setTextAndValue("Установить " + release.tag, "", false);
            installCell.setVisibility(View.VISIBLE);
        } else if (release != null) {
            String size = release.size > 0 ? String.format(Locale.US, "%.0f МБ", release.size / 1048576.0) : "";
            installCell.setTextAndValue("Скачать " + release.tag, size, false);
            installCell.setVisibility(View.VISIBLE);
        } else {
            installCell.setVisibility(View.GONE);
        }
        statusCell.setText(status);
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
                installCell.setTextAndValue("Скачиваю " + release.tag, percent + "%", false);
            }

            @Override
            public void done(File apk, String error) {
                busy = false;
                if (error != null) {
                    render("Не удалось скачать: " + error);
                } else {
                    downloaded = apk;
                    render("Скачано. Нажмите «Установить»: система спросит подтверждение, данные сохранятся.");
                    Updater.install(context, apk);
                }
            }
        });
    }
}
