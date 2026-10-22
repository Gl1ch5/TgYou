package com.tgyou.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tgyou.mods.ModPages;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;

import java.util.ArrayList;
import java.util.List;

/** A page a mod added with {@code api.add_page}: a refreshable list of title/value rows. */
public class ModPageActivity extends BaseFragment {

    private final ModPages.Page page;
    private final List<String[]> rows = new ArrayList<>();
    private RecyclerListView.SelectionAdapter adapter;

    public ModPageActivity(ModPages.Page page) {
        this.page = page;
    }

    @Override
    public View createView(Context context) {
        actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        actionBar.setAllowOverlayTitle(true);
        actionBar.setTitle(page.title);
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

        RecyclerListView list = new RecyclerListView(context);
        list.setLayoutManager(new LinearLayoutManager(context));
        list.setAdapter(adapter = new RecyclerListView.SelectionAdapter() {
            @Override
            public boolean isEnabled(RecyclerView.ViewHolder holder) {
                return true;
            }

            @Override
            public int getItemCount() {
                return rows.size();
            }

            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                TextSettingsCell cell = new TextSettingsCell(context);
                cell.setLayoutParams(new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT));
                return new RecyclerListView.Holder(cell);
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
                holder.itemView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                String[] row = rows.get(position);
                ((TextSettingsCell) holder.itemView).setTextAndValue(row[0], row[1], position != rows.size() - 1);
            }
        });
        list.setOnItemClickListener((view, position) -> refresh());
        frame.addView(list, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.MATCH_PARENT));
        refresh();
        return fragmentView;
    }

    private void refresh() {
        Utilities.globalQueue.postRunnable(() -> {
            List<String[]> fresh = page.source.rows();
            AndroidUtilities.runOnUIThread(() -> {
                rows.clear();
                rows.addAll(fresh);
                rows.add(new String[]{"Нажмите на строку, чтобы обновить", ""});
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            });
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        refresh();
    }
}
