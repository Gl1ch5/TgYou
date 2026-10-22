package com.tgyou.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tgyou.core.Plugin;
import com.tgyou.core.PluginHost;
import com.tgyou.core.Section;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;

import java.util.ArrayList;
import java.util.List;

/** Main TgYou screen: a list of tabs, each opening {@link TgYouSectionActivity}. */
public class TgYouSettingsActivity extends BaseFragment {

    private static final int TYPE_HEADER = 0;
    private static final int TYPE_ITEM = 1;
    private static final int TYPE_INFO = 2;

    private static final int ACTION_SECTION = 0;
    private static final int ACTION_ALL_PLUGINS = 1;
    private static final int ACTION_ICONS = 2;
    private static final int ACTION_UPDATES = 3;

    private static final class Row {
        final int type;
        final Section section;
        final String title;
        final String value;
        final int action;

        Row(int type, Section section, String title, String value, int action) {
            this.type = type;
            this.section = section;
            this.title = title;
            this.value = value;
            this.action = action;
        }
    }

    private final List<Row> rows = new ArrayList<>();

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

        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        fragmentView = frameLayout;

        RecyclerListView listView = new RecyclerListView(context);
        listView.setSections();
        actionBar.setAdaptiveBackground(listView);
        listView.setLayoutManager(new LinearLayoutManager(context));
        listView.setVerticalScrollBarEnabled(false);
        listView.setAdapter(new ListAdapter(context));
        listView.setOnItemClickListener((view, position) -> onRowClicked(rows.get(position)));
        frameLayout.addView(listView, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.MATCH_PARENT));

        buildRows();
        return fragmentView;
    }

    private void buildRows() {
        rows.clear();
        PluginHost host = PluginHost.get();
        if (host == null) {
            return;
        }
        rows.add(new Row(TYPE_HEADER, null, "Разделы", null, ACTION_SECTION));
        for (Section section : Section.values()) {
            int total = 0;
            int enabled = 0;
            for (Plugin plugin : host.plugins()) {
                if (plugin.section() == section) {
                    total++;
                    if (host.isEnabled(plugin)) {
                        enabled++;
                    }
                }
            }
            if (total > 0) {
                rows.add(new Row(TYPE_ITEM, section, section.title, enabled + " из " + total, ACTION_SECTION));
            }
        }
        rows.add(new Row(TYPE_HEADER, null, "Управление", null, ACTION_SECTION));
        rows.add(new Row(TYPE_ITEM, null, "Обновления", "GitHub", ACTION_UPDATES));
        rows.add(new Row(TYPE_ITEM, null, "Иконка приложения", "", ACTION_ICONS));
        rows.add(new Row(TYPE_ITEM, null, "Все плагины", String.valueOf(host.plugins().size()), ACTION_ALL_PLUGINS));
        rows.add(new Row(TYPE_INFO, null, "Telegram You " + BuildVars.BUILD_VERSION_STRING
                + "\nВсе функции работают как плагины: их можно включать и выключать по отдельности.", null, ACTION_SECTION));
    }

    private void onRowClicked(Row row) {
        if (row.type != TYPE_ITEM) {
            return;
        }
        if (row.action == ACTION_UPDATES) {
            presentFragment(new TgYouUpdateActivity());
        } else if (row.action == ACTION_ICONS) {
            presentFragment(new TgYouIconsActivity());
        } else {
            presentFragment(new TgYouSectionActivity(row.action == ACTION_ALL_PLUGINS ? null : row.section));
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        buildRows();
        if (fragmentView != null) {
            RecyclerListView list = (RecyclerListView) ((FrameLayout) fragmentView).getChildAt(0);
            if (list.getAdapter() != null) {
                list.getAdapter().notifyDataSetChanged();
            }
        }
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
            return holder.getItemViewType() == TYPE_ITEM;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view;
            if (viewType == TYPE_HEADER) {
                view = new HeaderCell(context);
            } else if (viewType == TYPE_ITEM) {
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
            if (row.type == TYPE_HEADER) {
                ((HeaderCell) holder.itemView).setText(row.title);
            } else if (row.type == TYPE_ITEM) {
                ((TextSettingsCell) holder.itemView).setTextAndValue(row.title, row.value, false);
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
