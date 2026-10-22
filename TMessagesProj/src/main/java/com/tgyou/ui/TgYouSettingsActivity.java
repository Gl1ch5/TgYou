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

/** Lists every plugin with its switch and settings fields. */
public class TgYouSettingsActivity extends BaseFragment {

    private static final int TYPE_HEADER = 0;
    private static final int TYPE_CHECK = 1;
    private static final int TYPE_VALUE = 2;
    private static final int TYPE_INFO = 3;

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

    private final List<Row> rows = new ArrayList<>();
    private ListAdapter adapter;

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
            rows.add(new Row(TYPE_HEADER, plugin, null));
            rows.add(new Row(TYPE_CHECK, plugin, null));
            for (SettingField field : plugin.fields()) {
                rows.add(new Row(TYPE_VALUE, plugin, field));
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
        if (row.type == TYPE_CHECK) {
            host.setEnabled(row.plugin, !host.isEnabled(row.plugin));
            adapter.notifyDataSetChanged();
        } else if (row.type == TYPE_VALUE) {
            showEditDialog(host.settingsOf(row.plugin), row.field);
        }
    }

    private void showEditDialog(PluginSettings settings, SettingField field) {
        if (getParentActivity() == null) {
            return;
        }
        EditText input = new EditText(getParentActivity());
        input.setSingleLine(true);
        input.setText(settings.getString(field.key, field.defaultValue));
        if (field.secret) {
            input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }
        input.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
        input.setPadding(AndroidUtilities.dp(24), AndroidUtilities.dp(8), AndroidUtilities.dp(24), AndroidUtilities.dp(8));

        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(field.title);
        builder.setView(input);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), (dialog, which) -> {
            settings.putString(field.key, input.getText().toString().trim());
            adapter.notifyDataSetChanged();
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.create());
    }

    private String valueLabel(Row row) {
        PluginHost host = PluginHost.get();
        String value = host == null ? "" : host.settingsOf(row.plugin).getString(row.field.key, row.field.defaultValue);
        if (value.isEmpty()) {
            return "не задано";
        }
        return row.field.secret ? "••••••••" : value;
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
            return type == TYPE_CHECK || type == TYPE_VALUE;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view;
            if (viewType == TYPE_HEADER) {
                view = new HeaderCell(context);
            } else if (viewType == TYPE_CHECK) {
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
            if (row.type == TYPE_HEADER) {
                ((HeaderCell) holder.itemView).setText(row.plugin.name());
            } else if (row.type == TYPE_CHECK) {
                ((TextCheckCell) holder.itemView).setTextAndCheck("Включено", host != null && host.isEnabled(row.plugin), false);
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
