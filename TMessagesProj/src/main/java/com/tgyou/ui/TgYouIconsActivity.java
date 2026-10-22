package com.tgyou.ui;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.LauncherIconController;
import org.telegram.ui.LauncherIconController.LauncherIcon;

/** Every launcher icon of the app, including the original Telegram ones. Nothing is locked. */
public class TgYouIconsActivity extends BaseFragment {

    private static final int COLUMNS = 3;

    private RecyclerListView listView;

    @Override
    public View createView(Context context) {
        actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        actionBar.setAllowOverlayTitle(true);
        actionBar.setTitle("Иконка приложения");
        actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int id) {
                if (id == -1) {
                    finishFragment();
                }
            }
        });

        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        fragmentView = frameLayout;

        listView = new RecyclerListView(context);
        listView.setLayoutManager(new GridLayoutManager(context, COLUMNS));
        listView.setPadding(AndroidUtilities.dp(8), AndroidUtilities.dp(12), AndroidUtilities.dp(8), AndroidUtilities.dp(12));
        listView.setClipToPadding(false);
        listView.setAdapter(new IconsAdapter(context));
        listView.setOnItemClickListener((view, position) -> {
            LauncherIcon icon = LauncherIcon.values()[position];
            LauncherIconController.setIcon(icon);
            listView.getAdapter().notifyDataSetChanged();
            Toast.makeText(context, "Иконка изменится через несколько секунд", Toast.LENGTH_SHORT).show();
        });
        frameLayout.addView(listView, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.MATCH_PARENT));
        return fragmentView;
    }

    private static final class IconCell extends LinearLayout {
        private final ImageView image;
        private final TextView label;

        IconCell(Context context) {
            super(context);
            setOrientation(VERTICAL);
            setGravity(Gravity.CENTER_HORIZONTAL);
            setPadding(0, AndroidUtilities.dp(8), 0, AndroidUtilities.dp(8));

            image = new ImageView(context);
            image.setScaleType(ImageView.ScaleType.FIT_XY);
            image.setClipToOutline(true);
            image.setOutlineProvider(new ViewOutlineProvider() {
                @Override
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(16));
                }
            });
            addView(image, LayoutHelper.createLinear(72, 72, Gravity.CENTER_HORIZONTAL));

            label = new TextView(context);
            label.setTextSize(13);
            label.setGravity(Gravity.CENTER);
            label.setTypeface(Typeface.DEFAULT_BOLD);
            addView(label, LayoutHelper.createLinear(LayoutHelper.WRAP_CONTENT, LayoutHelper.WRAP_CONTENT, Gravity.CENTER_HORIZONTAL, 4, 8, 4, 0));
        }

        void bind(Context context, LauncherIcon icon) {
            LayerDrawable layers = new LayerDrawable(new android.graphics.drawable.Drawable[]{
                    ContextCompat.getDrawable(context, icon.background),
                    ContextCompat.getDrawable(context, icon.foreground)
            });
            image.setImageDrawable(layers);
            label.setText(LocaleController.getString(icon.title));
            boolean selected = LauncherIconController.isEnabled(icon);
            label.setTextColor(Theme.getColor(selected ? Theme.key_windowBackgroundWhiteBlueText : Theme.key_windowBackgroundWhiteBlackText));
            GradientDrawable frame = new GradientDrawable();
            frame.setCornerRadius(AndroidUtilities.dp(20));
            if (selected) {
                frame.setStroke(AndroidUtilities.dp(2), Theme.getColor(Theme.key_windowBackgroundWhiteBlueText));
            }
            setBackground(frame);
        }
    }

    private class IconsAdapter extends RecyclerListView.SelectionAdapter {
        private final Context context;

        private IconsAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getItemCount() {
            return LauncherIcon.values().length;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder holder) {
            return true;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            IconCell cell = new IconCell(context);
            cell.setLayoutParams(new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT));
            return new RecyclerListView.Holder(cell);
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            ((IconCell) holder.itemView).bind(context, LauncherIcon.values()[position]);
        }
    }
}
