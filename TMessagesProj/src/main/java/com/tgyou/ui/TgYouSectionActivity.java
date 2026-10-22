package com.tgyou.ui;

import android.content.Context;
import android.text.InputType;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tgyou.core.Plugin;
import com.tgyou.core.PluginHost;
import com.tgyou.core.PluginSettings;
import com.tgyou.core.Section;
import com.tgyou.core.SettingField;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;

import java.util.ArrayList;
import java.util.List;

/**
 * One tab of the TgYou settings: every plugin of a {@link Section} with its switch and fields.
 * With a null section it lists all plugins with just their switches.
 */
public class TgYouSectionActivity extends BaseFragment {

    private static final int TYPE_HEADER = 0;
    private static final int TYPE_SWITCH = 1;
    private static final int TYPE_VALUE = 2;
    private static final int TYPE_INFO = 3;
    private static final int TYPE_FIELD_HEADER = 4;

    private static final class Row {
        final int type;
        final Plugin plugin;
        final SettingField field;

        Row(int type, Plugin plugin, SettingField field) {
            this.type = type;
            this.plugin = plugin;
            this.field = field;
        }
    }

    private final Section section;
    private final Plugin single;
    private final List<Row> rows = new ArrayList<>();
    private RecyclerListView.SelectionAdapter adapter;

    public TgYouSectionActivity(Section section) {
        this.section = section;
        this.single = null;
    }

    /** Settings of one plugin or mod. */
    public TgYouSectionActivity(Plugin single) {
        this.section = null;
        this.single = single;
    }

    @Override
    public View createView(Context context) {
        actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        actionBar.setAllowOverlayTitle(true);
        actionBar.setTitle(single != null ? single.name() : section == null ? "Все функции" : section.title);
        actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int id) {
                if (id == -1) {
                    finishFragment();
                }
            }
        });

        buildRows();

        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        fragmentView = frameLayout;

        RecyclerListView listView = new RecyclerListView(context);
        listView.setSections();
        actionBar.setAdaptiveBackground(listView);
        listView.setLayoutManager(new LinearLayoutManager(context));
        listView.setVerticalScrollBarEnabled(false);
        listView.setAdapter(adapter = new ListAdapter(context));
        listView.setOnItemClickListener((view, position) -> onRowClicked(position));
        frameLayout.addView(listView, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.MATCH_PARENT));
        return fragmentView;
    }

    private void buildRows() {
        rows.clear();
        PluginHost host = PluginHost.get();
        if (host == null) {
            return;
        }
        for (Plugin plugin : host.plugins()) {
            if (single != null ? plugin != single : (plugin.isMod() || section != null && plugin.section() != section)) {
                continue;
            }
            rows.add(new Row(TYPE_HEADER, plugin, null));
            rows.add(new Row(TYPE_SWITCH, plugin, null));
            if (section != null || single != null) {
                for (SettingField field : plugin.fields()) {
                    int type = field.kind == SettingField.Kind.TOGGLE ? TYPE_SWITCH
                            : field.kind == SettingField.Kind.HEADER ? TYPE_FIELD_HEADER : TYPE_VALUE;
                    rows.add(new Row(type, plugin, field));
                }
            }
            rows.add(new Row(TYPE_INFO, plugin, null));
        }
    }

    private void onRowClicked(int position) {
        Row row = rows.get(position);
        PluginHost host = PluginHost.get();
        if (host == null) {
            return;
        }
        if (row.type == TYPE_SWITCH) {
            if (row.field == null) {
                host.setEnabled(row.plugin, !host.isEnabled(row.plugin));
            } else {
                PluginSettings settings = host.settingsOf(row.plugin);
                boolean now = !settings.getBoolean(row.field.key, Boolean.parseBoolean(row.field.defaultValue));
                settings.putBoolean(row.field.key, now);
                com.tgyou.mods.ModActions.fire(row.plugin.id(), "change:" + row.field.key, String.valueOf(now));
            }
            adapter.notifyDataSetChanged();
        } else if (row.type == TYPE_VALUE) {
            PluginSettings settings = host.settingsOf(row.plugin);
            if (row.field.kind == SettingField.Kind.BUTTON) {
                com.tgyou.mods.ModActions.fire(row.plugin.id(), row.field.key, "");
            } else if (row.field.kind == SettingField.Kind.CHOICE) {
                showChoiceDialog(row.plugin, settings, row.field);
            } else {
                showEditDialog(row.plugin, settings, row.field);
            }
        }
    }

    private void showChoiceDialog(Plugin plugin, PluginSettings settings, SettingField field) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(field.title);
        builder.setItems(field.options, (dialog, which) -> {
            settings.putString(field.key, field.options[which]);
            com.tgyou.mods.ModActions.fire(plugin.id(), "change:" + field.key, field.options[which]);
            adapter.notifyDataSetChanged();
        });
        showDialog(builder.create());
    }

    private void showEditDialog(Plugin plugin, PluginSettings settings, SettingField field) {
        if (getParentActivity() == null) {
            return;
        }
        EditText input = new EditText(getParentActivity());
        input.setSingleLine(true);
        input.setText(settings.getString(field.key, field.defaultValue));
        if (field.kind == SettingField.Kind.SECRET) {
            input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }
        input.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
        input.setPadding(AndroidUtilities.dp(24), AndroidUtilities.dp(8), AndroidUtilities.dp(24), AndroidUtilities.dp(8));

        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(field.title);
        builder.setView(input);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), (dialog, which) -> {
            settings.putString(field.key, input.getText().toString().trim());
            com.tgyou.mods.ModActions.fire(plugin.id(), "change:" + field.key, input.getText().toString().trim());
            adapter.notifyDataSetChanged();
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.create());
    }

    private String valueLabel(Row row) {
        PluginHost host = PluginHost.get();
        if (row.field.kind == SettingField.Kind.BUTTON) {
            return row.field.defaultValue;
        }
        String value = host == null ? "" : host.settingsOf(row.plugin).getString(row.field.key, row.field.defaultValue);
        if (value.isEmpty()) {
            return "не задано";
        }
        if (row.field.kind == SettingField.Kind.SECRET) {
            return "••••••••";
        }
        // Long values (URLs) would run over the title: cut to what fits next to it.
        int max = row.field.title.length() > 22 ? 12 : 24;
        return value.length() > max ? value.substring(0, max) + "…" : value;
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
            return type == TYPE_SWITCH || type == TYPE_VALUE;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view;
            if (viewType == TYPE_HEADER || viewType == TYPE_FIELD_HEADER) {
                view = new HeaderCell(context);
            } else if (viewType == TYPE_SWITCH) {
                view = new TextCheckCell(context);
            } else if (viewType == TYPE_VALUE) {
                view = new TextSettingsCell(context);
            } else {
                view = new TextInfoPrivacyCell(context);
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT));
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            Row row = rows.get(position);
            PluginHost host = PluginHost.get();
            if (row.type == TYPE_FIELD_HEADER) {
                ((HeaderCell) holder.itemView).setText(row.field.title);
            } else if (row.type == TYPE_HEADER) {
                ((HeaderCell) holder.itemView).setText(row.plugin.name());
            } else if (row.type == TYPE_SWITCH) {
                boolean checked;
                String title;
                if (row.field == null) {
                    checked = host != null && host.isEnabled(row.plugin);
                    title = "Включено";
                } else {
                    checked = host != null && host.settingsOf(row.plugin).getBoolean(row.field.key, Boolean.parseBoolean(row.field.defaultValue));
                    title = row.field.title;
                }
                ((TextCheckCell) holder.itemView).setTextAndCheck(title, checked, false);
            } else if (row.type == TYPE_VALUE) {
                ((TextSettingsCell) holder.itemView).setTextAndValue(row.field.title, valueLabel(row), false);
            } else {
                ((TextInfoPrivacyCell) holder.itemView).setText(row.plugin.description());
            }
        }

        @Override
        public int getItemViewType(int position) {
            return rows.get(position).type;
        }
    }
}
