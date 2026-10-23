package com.tgyou.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tgyou.core.Plugin;
import com.tgyou.core.PluginHost;
import com.tgyou.mods.MarketClient;
import com.tgyou.mods.ModManifest;
import com.tgyou.mods.ModRuntime;
import com.tgyou.mods.PyMod;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/** The Mods window: marketplace, installed mods and a "create a mod" kit. */
public class ModsActivity extends BaseFragment {

    private static final String DOCS_URL = "https://github.com/Gl1ch5/TgYou/blob/ccr-baf0fc46-m69tv7/docs/MODS.md";
    private static final int REQUEST_PICK_ZIP = 4711;

    private static final int T_HEADER = 0;
    private static final int T_INFO = 1;
    private static final int T_ACTION = 2;
    private static final int T_MOD = 3;
    private static final int T_AI = 4;

    private static final String[] TABS = {"Маркетплейс", "Установленные", "Создать мод"};

    private static final class Row {
        int type;
        String title;
        String value;
        Runnable action;
        ModCell.Style dummy;
        String name;
        String version;
        String meta;
        String description;
        String problem;
        int icon;
        int color;
        List<ModCell.Button> buttons;
    }

    private final List<Row> rows = new ArrayList<>();
    private final List<TextView> tabViews = new ArrayList<>();
    private final List<View> tabLines = new ArrayList<>();
    private int tab = 0;
    private RecyclerListView.SelectionAdapter adapter;
    private List<MarketClient.Item> market;
    private String marketStatus = "Загрузка каталога…";
    private final java.util.Set<String> busy = new java.util.HashSet<>();

    @Override
    public View createView(Context context) {
        actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        actionBar.setAllowOverlayTitle(true);
        actionBar.setTitle("Моды");
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
        column.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));

        LinearLayout tabs = new LinearLayout(context);
        tabs.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        for (int i = 0; i < TABS.length; i++) {
            final int index = i;
            LinearLayout cell = new LinearLayout(context);
            cell.setOrientation(LinearLayout.VERTICAL);
            TextView label = new TextView(context);
            label.setText(TABS[i]);
            label.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
            label.setTypeface(AndroidUtilities.bold());
            label.setGravity(Gravity.CENTER);
            cell.addView(label, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, 44));
            View line = new View(context);
            cell.addView(line, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, 3));
            cell.setOnClickListener(v -> selectTab(index));
            tabViews.add(label);
            tabLines.add(line);
            tabs.addView(cell, LayoutHelper.createLinear(0, LayoutHelper.WRAP_CONTENT, 1f));
        }
        column.addView(tabs, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT));

        RecyclerListView listView = new RecyclerListView(context);
        listView.setLayoutManager(new LinearLayoutManager(context));
        listView.setVerticalScrollBarEnabled(false);
        listView.setAdapter(adapter = new ListAdapter(context));
        listView.setOnItemClickListener((RecyclerListView.OnItemClickListenerExtended) (view, position, x, y) -> {
            // RecyclerListView takes the tap before the cell's buttons see it, so route button taps here.
            if (view instanceof ModCell) {
                Runnable button = ((ModCell) view).actionAt(x, y);
                if (button != null) {
                    button.run();
                    return;
                }
            }
            Row row = rows.get(position);
            if (row.action != null) {
                row.action.run();
            }
        });
        column.addView(listView, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, 0, 1f));

        fragmentView = column;
        selectTab(0);
        loadMarket();
        return fragmentView;
    }

    private void selectTab(int index) {
        tab = index;
        for (int i = 0; i < tabViews.size(); i++) {
            boolean active = i == index;
            tabViews.get(i).setTextColor(Theme.getColor(active ? Theme.key_actionBarTabActiveText : Theme.key_actionBarTabUnactiveText));
            tabLines.get(i).setBackgroundColor(active ? Theme.getColor(Theme.key_actionBarTabLine) : 0);
        }
        rebuild();
    }

    private void loadMarket() {
        marketStatus = "Загрузка каталога…";
        MarketClient.list(getParentActivity(), "", (items, error) -> {
            if (error != null) {
                market = null;
                marketStatus = "Каталог недоступен: " + error;
            } else {
                market = items;
                marketStatus = items.isEmpty() ? "В каталоге пока нет модов." : "";
            }
            rebuild();
        });
    }

    private void rebuild() {
        rows.clear();
        if (tab == 0) {
            buildMarket();
        } else if (tab == 1) {
            buildInstalled();
        } else {
            buildCreate();
        }
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    private Row simple(int type, String title, String value, Runnable action) {
        Row r = new Row();
        r.type = type;
        r.title = title;
        r.value = value;
        r.action = action;
        rows.add(r);
        return r;
    }

    private PyMod installedMod(String id) {
        Plugin p = ModRuntime.find(id);
        return p instanceof PyMod ? (PyMod) p : null;
    }

    private void buildMarket() {
        if (market == null || market.isEmpty()) {
            simple(T_INFO, marketStatus, null, null);
            simple(T_ACTION, "Обновить каталог", "", this::loadMarket);
            return;
        }
        for (MarketClient.Item item : market) {
            PyMod local = installedMod(item.id);
            boolean update = local != null && !local.manifest.version.equals(item.version);
            List<ModCell.Button> buttons = new ArrayList<>();
            if (busy.contains(item.id)) {
                buttons.add(new ModCell.Button("Устанавливаю…", ModCell.Style.SECONDARY, () -> {
                }));
            } else if (local == null) {
                buttons.add(new ModCell.Button("Установить", ModCell.Style.PRIMARY, () -> install(item)));
            } else {
                if (update) {
                    buttons.add(new ModCell.Button("Обновить", ModCell.Style.PRIMARY, () -> install(item)));
                }
                if (!local.manifest.settings.isEmpty()) {
                    buttons.add(new ModCell.Button("Настройки", ModCell.Style.SECONDARY, () -> presentFragment(new TgYouSectionActivity(local))));
                }
                buttons.add(new ModCell.Button("Удалить", ModCell.Style.DANGER, () -> confirmRemove(local)));
            }
            Row r = new Row();
            r.type = T_MOD;
            r.name = item.name;
            r.version = "v" + item.version;
            r.meta = (item.author.isEmpty() ? "" : item.author + " · ") + item.category + " · "
                    + String.format(Locale.US, "%.0f КБ", Math.max(1, item.size / 1024.0)) + " · " + item.downloads + " загрузок";
            r.description = item.description;
            r.buttons = buttons;
            r.action = () -> showDetails(item.name, item.version, item.author, item.description, item.changelog);
            rows.add(r);
        }
    }

    private void buildInstalled() {
        PluginHost host = PluginHost.get();
        int count = 0;
        if (host != null) {
            for (Plugin plugin : host.plugins()) {
                if (!plugin.isMod() || !(plugin instanceof PyMod)) {
                    continue;
                }
                PyMod mod = (PyMod) plugin;
                count++;
                boolean on = host.isEnabled(mod);
                List<ModCell.Button> buttons = new ArrayList<>();
                buttons.add(new ModCell.Button(on ? "Выключить" : "Включить", on ? ModCell.Style.SECONDARY : ModCell.Style.PRIMARY, () -> {
                    host.setEnabled(mod, !on);
                    rebuild();
                }));
                if (!mod.manifest.settings.isEmpty()) {
                    buttons.add(new ModCell.Button("Настройки", ModCell.Style.SECONDARY, () -> presentFragment(new TgYouSectionActivity(mod))));
                }
                buttons.add(new ModCell.Button("Журнал", ModCell.Style.SECONDARY, () -> showLog(mod)));
                buttons.add(new ModCell.Button("Поделиться", ModCell.Style.SECONDARY, () -> shareMod(mod)));
                buttons.add(new ModCell.Button("Удалить", ModCell.Style.DANGER, () -> confirmRemove(mod)));
                Row r = new Row();
                r.type = T_MOD;
                r.name = mod.manifest.name;
                r.version = "v" + mod.manifest.version;
                r.meta = (mod.manifest.author.isEmpty() ? "" : mod.manifest.author + " · ") + mod.manifest.category
                        + (on ? " · включён" : " · выключен");
                r.description = mod.manifest.description;
                r.problem = mod.error() == null ? null : "Ошибка загрузки: " + mod.error();
                r.buttons = buttons;
                r.action = () -> showDetails(mod.manifest.name, mod.manifest.version, mod.manifest.author, mod.manifest.description, null);
                rows.add(r);
            }
        }
        buildIconPacks();
        if (count == 0) {
            simple(T_INFO, "Модов пока нет. Загляните в «Маркетплейс» или установите свой из файла на вкладке «Создать мод».", null, null);
        }
    }

    private void buildIconPacks() {
        Context context = getParentActivity();
        if (context == null) {
            return;
        }
        List<com.tgyou.icons.IconPacks.Pack> packs = com.tgyou.icons.IconPacks.list(context);
        if (packs.isEmpty()) {
            return;
        }
        simple(T_HEADER, "Иконпаки", null, null);
        String active = com.tgyou.icons.IconPacks.active(context);
        for (com.tgyou.icons.IconPacks.Pack pack : packs) {
            boolean on = pack.id.equals(active);
            List<ModCell.Button> buttons = new ArrayList<>();
            buttons.add(new ModCell.Button(on ? "Выключить" : "Включить", on ? ModCell.Style.SECONDARY : ModCell.Style.PRIMARY, () -> {
                com.tgyou.icons.IconPacks.activate(context, on ? "" : pack.id);
                toast("Иконки применятся на новых экранах; для полного эффекта перезапустите приложение");
                rebuild();
            }));
            buttons.add(new ModCell.Button("Удалить", ModCell.Style.DANGER, () -> {
                com.tgyou.icons.IconPacks.remove(context, pack.id);
                rebuild();
            }));
            Row r = new Row();
            r.type = T_MOD;
            r.name = pack.name;
            r.version = pack.version.isEmpty() ? "" : "v" + pack.version;
            r.meta = (pack.author.isEmpty() ? "" : pack.author + " · ") + pack.icons + " иконок" + (on ? " · включён" : "");
            r.description = "";
            r.buttons = buttons;
            rows.add(r);
        }
    }

    private void buildCreate() {
        simple(T_HEADER, "Мод с помощью нейросети", null, null);
        simple(T_ACTION, "Режим промпта", com.tgyou.mods.AiPrompt.title(), this::pickPromptMode);
        Row copy = simple(T_AI, "Скопировать промпт для нейросети", "Режим: " + com.tgyou.mods.AiPrompt.title() + ". Вставьте его в нейросеть и опишите нужный мод", this::copyPrompt);
        copy.icon = R.drawable.msg_bot;
        copy.color = 0xFF8C58F6;
        Row paste = simple(T_AI, "Вставить мод из буфера", "Готовый файл от нейросети — одним нажатием", this::pasteMod);
        paste.icon = R.drawable.msg_copy;
        paste.color = 0xFF3FB950;
        simple(T_INFO, "1. Нажмите «Скопировать промпт» и вставьте его в ChatGPT, Claude или другую нейросеть.\n"
                + "2. В конце промпта после «ЗАДАЧА:» опишите, какой мод нужен, и отправьте.\n"
                + "3. Скопируйте весь ответ нейросети целиком и нажмите «Вставить мод из буфера» — мод установится после подтверждения.", null, null);
        simple(T_HEADER, "Свой мод", null, null);
        simple(T_INFO, "Мод — это папка с manifest.json и Python-файлом. Он получает доступ ко всему приложению: "
                + "подписывается на события, добавляет пункты меню и страницы в TgYou, читает и пишет настройки. "
                + "Никаких ограничений и запросов разрешений нет.", null, null);
        simple(T_ACTION, "Документация", "GitHub", () -> org.telegram.messenger.browser.Browser.openUrl(getParentActivity(), DOCS_URL));
        simple(T_ACTION, "Скачать архив для агента", "ZIP", this::shareSdk);
        simple(T_INFO, "В архиве лежит всё, что нужно ИИ-агенту: описание API и хуков, шаблон мода, готовый пример со статистикой и "
                + "инструкция по упаковке. Отправьте его агенту и опишите, какой мод нужен.", null, null);
        simple(T_HEADER, "Установка", null, null);
        simple(T_ACTION, "Установить из файла", ".mod / .plugin / .icons", this::pickZip);
        simple(T_INFO, "Файл .mod — это ZIP с manifest.json в корне (подойдёт и обычный .zip). Мод запустится сразу, без перезапуска приложения.", null, null);
    }

    private void showDetails(String name, String version, String author, String description, String changelog) {
        if (getParentActivity() == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Версия ").append(version);
        if (author != null && !author.isEmpty()) {
            sb.append("\nАвтор: ").append(author);
        }
        if (description != null && !description.isEmpty()) {
            sb.append("\n\n").append(description);
        }
        if (changelog != null && !changelog.isEmpty()) {
            sb.append("\n\nЧто нового:\n").append(changelog);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(name);
        builder.setMessage(sb.toString());
        builder.setPositiveButton("OK", null);
        showDialog(builder.create());
    }

    private void install(MarketClient.Item item) {
        busy.add(item.id);
        rebuild();
        MarketClient.install(getParentActivity(), item, (manifest, error) -> {
            busy.remove(item.id);
            if (error != null) {
                toast("Не удалось установить: " + error);
            } else {
                toast("Установлено: " + manifest.name);
            }
            rebuild();
        });
    }

    private void confirmRemove(PyMod mod) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle("Удалить «" + mod.manifest.name + "»?");
        builder.setMessage("Файлы мода будут удалены. Его настройки останутся на случай переустановки.");
        builder.setPositiveButton("Удалить", (d, w) -> {
            ModRuntime.uninstall(getParentActivity(), mod.manifest.id);
            rebuild();
        });
        builder.setNegativeButton("Отмена", null);
        showDialog(builder.create());
    }

    private void toast(String text) {
        if (getParentActivity() != null) {
            Toast.makeText(getParentActivity(), text, Toast.LENGTH_LONG).show();
        }
    }

    private void pickPromptMode() {
        if (getParentActivity() == null) {
            return;
        }
        String[][] modes = com.tgyou.mods.AiPrompt.MODES;
        CharSequence[] items = new CharSequence[modes.length];
        for (int i = 0; i < modes.length; i++) {
            items[i] = modes[i][1] + " — " + modes[i][2];
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle("Режим промпта");
        builder.setItems(items, (d, which) -> {
            com.tgyou.mods.AiPrompt.select(which);
            rebuild();
        });
        builder.setNegativeButton("Отмена", null);
        showDialog(builder.create());
    }

    private void copyPrompt() {
        Context context = getParentActivity();
        try {
            String text = com.tgyou.mods.AiPrompt.build(context);
            android.content.ClipboardManager cm = (android.content.ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
            cm.setPrimaryClip(android.content.ClipData.newPlainText("TgYou prompt", text));
            toast("Промпт (" + com.tgyou.mods.AiPrompt.title() + ") скопирован. Вставьте его в нейросеть и допишите задачу после «ЗАДАЧА:»");
        } catch (Throwable t) {
            toast("Не удалось скопировать промпт: " + t.getMessage());
        }
    }

    private void pasteMod() {
        Context context = getParentActivity();
        CharSequence clip = null;
        try {
            android.content.ClipboardManager cm = (android.content.ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
            if (cm.hasPrimaryClip() && cm.getPrimaryClip().getItemCount() > 0) {
                clip = cm.getPrimaryClip().getItemAt(0).coerceToText(context);
            }
        } catch (Throwable ignore) {
        }
        if (clip == null || clip.toString().trim().isEmpty()) {
            toast("Буфер обмена пуст. Скопируйте ответ нейросети целиком");
            return;
        }
        final String text = clip.toString();
        org.telegram.messenger.Utilities.globalQueue.postRunnable(() -> {
            try {
                byte[] bytes = com.tgyou.mods.ModBundle.build(text);
                if (bytes == null) {
                    bytes = text.getBytes("UTF-8");
                }
                ModInstall.offer(context, bytes, this::rebuild);
            } catch (Throwable t) {
                AndroidUtilities.runOnUIThread(() -> toast("Не удалось разобрать ответ: " + t.getMessage()));
            }
        });
    }

    private void pickZip() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("*/*");
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(Intent.createChooser(intent, "Мод (.mod), плагин exteraGram (.plugin) или иконки (.icons)"), REQUEST_PICK_ZIP);
    }

    @Override
    public void onActivityResultFragment(int requestCode, int resultCode, Intent data) {
        if (requestCode != REQUEST_PICK_ZIP || resultCode != Activity.RESULT_OK || data == null || data.getData() == null) {
            return;
        }
        Uri uri = data.getData();
        Context context = getParentActivity();
        org.telegram.messenger.Utilities.globalQueue.postRunnable(() -> {
            try (InputStream in = context.getContentResolver().openInputStream(uri)) {
                ModInstall.offer(context, com.tgyou.mods.ModStore.readAll(in), this::rebuild);
            } catch (Throwable t) {
                AndroidUtilities.runOnUIThread(() -> toast("Не удалось прочитать файл"));
            }
        });
    }

    /** Packs an installed mod into a .mod file and offers it to the share sheet. */
    private void showLog(PyMod mod) {
        if (getParentActivity() == null) {
            return;
        }
        String text = com.tgyou.mods.ModLog.text(mod.id());
        if (mod.error() != null) {
            text = "Ошибка: " + mod.error() + "\n" + text;
        }
        final String shown = text.isEmpty() ? "Журнал пуст" : text;
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle("Журнал: " + mod.name());
        builder.setMessage(shown);
        builder.setPositiveButton("Копировать", (d, w) -> {
            android.content.ClipboardManager cm = (android.content.ClipboardManager) getParentActivity().getSystemService(android.content.Context.CLIPBOARD_SERVICE);
            cm.setPrimaryClip(android.content.ClipData.newPlainText("log", shown));
        });
        builder.setNegativeButton("Закрыть", null);
        showDialog(builder.create());
    }

    private void shareMod(PyMod mod) {
        Context context = getParentActivity();
        org.telegram.messenger.Utilities.globalQueue.postRunnable(() -> {
            try {
                File out = new File(new File(context.getFilesDir(), "cache"), mod.manifest.id + ".mod");
                out.getParentFile().mkdirs();
                try (java.io.FileOutputStream fos = new java.io.FileOutputStream(out)) {
                    fos.write(ModRuntime.store(context).pack(mod.manifest.id));
                }
                Uri uri = FileProvider.getUriForFile(context, context.getPackageName() + ".provider", out);
                AndroidUtilities.runOnUIThread(() -> {
                    Intent send = new Intent(Intent.ACTION_SEND);
                    send.setType("application/octet-stream");
                    send.putExtra(Intent.EXTRA_STREAM, uri);
                    send.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                    context.startActivity(Intent.createChooser(send, "Мод " + mod.manifest.name));
                });
            } catch (Throwable t) {
                AndroidUtilities.runOnUIThread(() -> toast("Не удалось упаковать мод: " + t.getMessage()));
            }
        });
    }

    /** Packs assets/mod-sdk into one ZIP and offers it to the share sheet. */
    private void shareSdk() {
        Context context = getParentActivity();
        org.telegram.messenger.Utilities.globalQueue.postRunnable(() -> {
            try {
                File out = new File(new File(context.getFilesDir(), "cache"), "tgyou-mod-sdk.zip");
                out.getParentFile().mkdirs();
                try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(out))) {
                    addAssets(context, "mod-sdk", "tgyou-mod-sdk", zip);
                }
                Uri uri = FileProvider.getUriForFile(context, context.getPackageName() + ".provider", out);
                AndroidUtilities.runOnUIThread(() -> {
                    Intent send = new Intent(Intent.ACTION_SEND);
                    send.setType("application/zip");
                    send.putExtra(Intent.EXTRA_STREAM, uri);
                    send.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                    context.startActivity(Intent.createChooser(send, "Архив для агента"));
                });
            } catch (Throwable t) {
                AndroidUtilities.runOnUIThread(() -> toast("Не удалось собрать архив: " + t.getMessage()));
            }
        });
    }

    private static void addAssets(Context context, String assetDir, String zipDir, ZipOutputStream zip) throws Exception {
        String[] names = context.getAssets().list(assetDir);
        for (String name : names == null ? new String[0] : names) {
            String path = assetDir + "/" + name;
            String[] children = context.getAssets().list(path);
            if (children != null && children.length > 0) {
                addAssets(context, path, zipDir + "/" + name, zip);
            } else {
                zip.putNextEntry(new ZipEntry(zipDir + "/" + name));
                try (InputStream in = context.getAssets().open(path)) {
                    zip.write(com.tgyou.mods.ModStore.readAll(in));
                }
                zip.closeEntry();
            }
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        rebuild();
    }

    private class ListAdapter extends RecyclerListView.SelectionAdapter {
        private final Context context;

        private ListAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getItemCount() {
            return rows.size();
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder holder) {
            int type = holder.getItemViewType();
            return type == T_ACTION || type == T_MOD || type == T_AI;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view;
            if (viewType == T_HEADER) {
                view = new HeaderCell(context);
            } else if (viewType == T_ACTION) {
                view = new TextSettingsCell(context);
            } else if (viewType == T_AI) {
                view = new TextCell(context);
            } else if (viewType == T_MOD) {
                view = new ModCell(context);
            } else {
                view = new TextInfoPrivacyCell(context);
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT));
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            Row row = rows.get(position);
            if (row.type == T_HEADER) {
                ((HeaderCell) holder.itemView).setText(row.title);
            } else if (row.type == T_ACTION) {
                holder.itemView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                ((TextSettingsCell) holder.itemView).setTextAndValue(row.title, row.value, false);
            } else if (row.type == T_AI) {
                holder.itemView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                ((TextCell) holder.itemView).setTextAndValueAndColorfulIcon(row.title, row.value, false, row.icon, row.color, row.color, false);
            } else if (row.type == T_MOD) {
                ((ModCell) holder.itemView).set(row.name, row.version, row.meta, row.description, row.problem, row.buttons);
            } else {
                ((TextInfoPrivacyCell) holder.itemView).setText(row.title);
            }
        }

        @Override
        public int getItemViewType(int position) {
            return rows.get(position).type;
        }
    }
}
