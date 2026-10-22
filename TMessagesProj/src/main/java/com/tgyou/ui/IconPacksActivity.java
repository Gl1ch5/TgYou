package com.tgyou.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.tgyou.icons.IconPacks;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

import java.io.InputStream;
import java.util.List;

/** Icon packs (exteraGram .icons): tiles with a live preview; tap for details, apply, remove. */
public class IconPacksActivity extends BaseFragment {

    private static final int REQUEST_PICK = 4712;
    private static final int MENU_ADD = 1;
    private static final int PREVIEW_ICONS = 6;

    private LinearLayout content;

    @Override
    public View createView(Context context) {
        actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        actionBar.setAllowOverlayTitle(true);
        actionBar.setTitle("Иконки");
        actionBar.createMenu().addItem(MENU_ADD, R.drawable.msg_add);
        actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int id) {
                if (id == -1) {
                    finishFragment();
                } else if (id == MENU_ADD) {
                    pick();
                }
            }
        });
        FrameLayout frame = new FrameLayout(context);
        frame.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        fragmentView = frame;
        ScrollView scroll = new ScrollView(context);
        content = new LinearLayout(context);
        content.setOrientation(LinearLayout.VERTICAL);
        int side = AndroidUtilities.dp(12);
        content.setPadding(side, AndroidUtilities.dp(8), side, AndroidUtilities.dp(28));
        scroll.addView(content, new ScrollView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        frame.addView(scroll, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.MATCH_PARENT));
        build(context);
        return fragmentView;
    }

    private void build(Context context) {
        content.removeAllViews();
        TextView hint = new TextView(context);
        hint.setText("Наборы иконок в формате exteraGram (.icons). Откройте файл .icons в любом файловом менеджере или нажмите «+», чтобы добавить набор.");
        hint.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
        hint.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText));
        content.addView(hint, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 4, 4, 4, 12));

        String active = IconPacks.active(context);
        List<IconPacks.Pack> packs = IconPacks.list(context);
        LinearLayout row = null;
        int count = packs.size() + 1;
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                row = new LinearLayout(context);
                content.addView(row, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 0, 0, 10));
            }
            View tile = i == 0 ? defaultTile(context, active.isEmpty()) : packTile(context, packs.get(i - 1), packs.get(i - 1).id.equals(active));
            row.addView(tile, LayoutHelper.createLinear(0, LayoutHelper.MATCH_PARENT, 1f, i % 2 == 0 ? 0 : 5, 0, i % 2 == 0 ? 5 : 0, 0));
        }
        if (count % 2 == 1) {
            row.addView(new View(context), LayoutHelper.createLinear(0, 1, 1f, 5, 0, 0, 0));
        }
    }

    private LinearLayout card(Context context, boolean selected) {
        LinearLayout card = new LinearLayout(context);
        card.setOrientation(LinearLayout.VERTICAL);
        int pad = AndroidUtilities.dp(14);
        card.setPadding(pad, pad, pad, pad);
        GradientDrawable bg = new GradientDrawable();
        bg.setCornerRadius(AndroidUtilities.dp(16));
        bg.setColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        if (selected) {
            bg.setStroke(AndroidUtilities.dp(2), Theme.getColor(Theme.key_windowBackgroundWhiteBlueText));
        }
        card.setBackground(bg);
        return card;
    }

    private TextView text(Context context, String value, int sp, boolean bold, int colorKey) {
        TextView t = new TextView(context);
        t.setText(value);
        t.setTextSize(TypedValue.COMPLEX_UNIT_SP, sp);
        if (bold) {
            t.setTypeface(AndroidUtilities.bold());
        }
        t.setTextColor(Theme.getColor(colorKey));
        t.setSingleLine();
        t.setEllipsize(TextUtils.TruncateAt.END);
        return t;
    }

    private View defaultTile(Context context, boolean selected) {
        LinearLayout card = card(context, selected);
        card.addView(text(context, "Стандартные", 16, true, Theme.key_windowBackgroundWhiteBlackText));
        card.addView(text(context, "Иконки Telegram", 13, false, Theme.key_windowBackgroundWhiteGrayText));
        TextView mark = text(context, selected ? "Включены" : "Выбрать", 13, true, Theme.key_windowBackgroundWhiteBlueText);
        card.addView(mark, LayoutHelper.createLinear(LayoutHelper.WRAP_CONTENT, LayoutHelper.WRAP_CONTENT, Gravity.START, 0, 72, 0, 0));
        card.setOnClickListener(v -> {
            IconPacks.activate(context, "");
            toast("Стандартные иконки вернутся после перезапуска приложения");
            build(context);
        });
        return card;
    }

    private View packTile(Context context, IconPacks.Pack pack, boolean selected) {
        LinearLayout card = card(context, selected);
        card.addView(text(context, pack.name, 16, true, Theme.key_windowBackgroundWhiteBlackText));
        card.addView(text(context, (pack.author.isEmpty() ? "" : pack.author + " · ") + pack.icons + " иконок", 13, false, Theme.key_windowBackgroundWhiteGrayText));
        LinearLayout previewHolder = new LinearLayout(context);
        card.addView(previewHolder, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 8, 0, 8));
        card.addView(text(context, selected ? "Включён" : "Подробнее", 13, true, Theme.key_windowBackgroundWhiteBlueText));
        Utilities.globalQueue.postRunnable(() -> {
            List<Bitmap> icons = IconPacks.preview(context, pack.id, PREVIEW_ICONS, AndroidUtilities.dp(36));
            AndroidUtilities.runOnUIThread(() -> previewHolder.addView(IconPackViews.grid(context, icons, 3, 36)));
        });
        card.setOnClickListener(v -> showDetails(context, pack, selected));
        return card;
    }

    private void showDetails(Context context, IconPacks.Pack pack, boolean selected) {
        LinearLayout box = new LinearLayout(context);
        box.setGravity(Gravity.CENTER_HORIZONTAL);
        Utilities.globalQueue.postRunnable(() -> {
            List<Bitmap> icons = IconPacks.preview(context, pack.id, 24, AndroidUtilities.dp(40));
            AndroidUtilities.runOnUIThread(() -> box.addView(IconPackViews.grid(context, icons, 4, 52)));
        });
        AlertDialog.Builder b = new AlertDialog.Builder(context);
        b.setTitle(pack.name);
        b.setMessage((pack.author.isEmpty() ? "" : pack.author + " · ") + pack.icons + " иконок" + (pack.version.isEmpty() ? "" : " · v" + pack.version));
        b.setView(box);
        b.setPositiveButton(selected ? "Выключить" : "Применить", (d, w) -> {
            IconPacks.activate(context, selected ? "" : pack.id);
            toast(selected ? "Стандартные иконки вернутся после перезапуска" : "Иконки применены. Перезапустите приложение для полного эффекта");
            build(context);
        });
        b.setNeutralButton("Удалить", (d, w) -> {
            IconPacks.remove(context, pack.id);
            build(context);
        });
        b.setNegativeButton("Закрыть", null);
        showDialog(b.create());
    }

    private void toast(String text) {
        if (getParentActivity() != null) {
            android.widget.Toast.makeText(getParentActivity(), text, android.widget.Toast.LENGTH_LONG).show();
        }
    }

    private void pick() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("*/*");
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(Intent.createChooser(intent, "Файл .icons"), REQUEST_PICK);
    }

    @Override
    public void onActivityResultFragment(int requestCode, int resultCode, Intent data) {
        if (requestCode != REQUEST_PICK || resultCode != Activity.RESULT_OK || data == null || data.getData() == null) {
            return;
        }
        Uri uri = data.getData();
        Context context = getParentActivity();
        Utilities.globalQueue.postRunnable(() -> {
            try (InputStream in = context.getContentResolver().openInputStream(uri)) {
                byte[] bytes = com.tgyou.mods.ModStore.readAll(in);
                IconPackInstall.offer(context, bytes, () -> build(context));
            } catch (Throwable t) {
                AndroidUtilities.runOnUIThread(() -> toast("Не удалось прочитать файл"));
            }
        });
    }
}
