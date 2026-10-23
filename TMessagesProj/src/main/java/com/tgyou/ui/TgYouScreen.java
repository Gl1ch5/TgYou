package com.tgyou.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tgyou.core.TgYouPrefs;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SlideChooseView;
import org.telegram.ui.DialogsActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Declarative settings screen: a subclass lists rows in {@link #build()} (header, switch with a
 * caption, value row, slider, expandable master switch, link, text, button, custom view) and the
 * base class renders them with the stock Telegram cells and keeps them in {@link TgYouPrefs}.
 */
public abstract class TgYouScreen extends BaseFragment {

    private static final int T_HEADER = 0;
    private static final int T_TOGGLE = 1;
    private static final int T_VALUE = 2;
    private static final int T_SLIDER = 3;
    private static final int T_MASTER = 4;
    private static final int T_LINK = 5;
    private static final int T_INFO = 6;
    private static final int T_GAP = 7;
    private static final int T_BUTTON = 8;
    private static final int T_OPTION = 9;
    private static final int T_TAB = 10;
    private static final int T_CUSTOM = 1000;

    public interface Setter<T> {
        void set(T value);
    }

    public interface Getter<T> {
        T get();
    }

    public interface Factory {
        View create(Context context);
    }

    public interface Binder {
        void bind(View view);
    }

    /** One line of a screen. Build with the helper methods of {@link TgYouScreen}. */
    public static final class Row {
        int type;
        String key;
        String title;
        String sub;
        boolean def;
        int defInt;
        String[] opts;
        Runnable action;
        Setter<Object> onChange;
        Getter<String> value;
        Getter<Boolean> checked;
        int icon;
        int color;
        int color2;
        boolean red;
        String[] keys;
        boolean[] defs;
        String[] titles;
        String masterId;
        Factory factory;
        Binder binder;
        String customId;
        boolean divider = true;
    }

    protected final List<Row> rows = new ArrayList<>();
    private final java.util.Set<String> expanded = new java.util.HashSet<>();
    protected RecyclerListView listView;
    private final List<String> tabNames = new ArrayList<>();
    private int selectedTab;
    private ListAdapter adapter;

    protected abstract String screenTitle();

    /** Fills {@link #rows}; called on every refresh. */
    protected abstract void build();

    @Override
    public View createView(Context context) {
        actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        actionBar.setAllowOverlayTitle(true);
        actionBar.setTitle(screenTitle());
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

        rebuildRows();
        listView = new RecyclerListView(context);
        listView.setSections();
        actionBar.setAdaptiveBackground(listView);
        listView.setLayoutManager(new LinearLayoutManager(context));
        listView.setVerticalScrollBarEnabled(false);
        listView.setAdapter(adapter = new ListAdapter(context));
        listView.setOnItemClickListener((RecyclerListView.OnItemClickListenerExtended) (view, position, x, y) -> onClick(view, position, x));
        listView.setOnItemLongClickListener((view, position) -> onLongClick(position));
        if (tabNames.isEmpty()) {
            frame.addView(listView, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.MATCH_PARENT));
        } else {
            android.widget.LinearLayout column = new android.widget.LinearLayout(context);
            column.setOrientation(android.widget.LinearLayout.VERTICAL);
            column.addView(tabStrip(context), new android.widget.LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, AndroidUtilities.dp(44)));
            column.addView(listView, new android.widget.LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f));
            frame.addView(column, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.MATCH_PARENT));
        }
        return fragmentView;
    }

    private void rebuildRows() {
        rows.clear();
        tabNames.clear();
        build();
        if (tabNames.isEmpty()) {
            return;
        }
        if (selectedTab >= tabNames.size()) {
            selectedTab = 0;
        }
        // keep the rows before the first tab() and the rows of the selected tab only
        List<Row> kept = new ArrayList<>();
        int current = -1;
        for (Row r : rows) {
            if (r.type == T_TAB) {
                current++;
            } else if (current < 0 || current == selectedTab) {
                kept.add(r);
            }
        }
        rows.clear();
        rows.addAll(kept);
    }

    /** Starts a tab: the rows added after it, up to the next tab(), show only while it is selected. */
    protected void tab(String title) {
        tabNames.add(title);
        add(T_TAB);
    }

    private android.view.View tabStrip(Context context) {
        android.widget.HorizontalScrollView scroll = new android.widget.HorizontalScrollView(context);
        scroll.setHorizontalScrollBarEnabled(false);
        scroll.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        android.widget.LinearLayout strip = new android.widget.LinearLayout(context);
        strip.setOrientation(android.widget.LinearLayout.HORIZONTAL);
        strip.setPadding(AndroidUtilities.dp(8), 0, AndroidUtilities.dp(8), 0);
        scroll.addView(strip, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, AndroidUtilities.dp(44)));
        List<android.widget.TextView> labels = new ArrayList<>();
        for (int i = 0; i < tabNames.size(); i++) {
            final int index = i;
            android.widget.TextView t = new android.widget.TextView(context);
            t.setText(tabNames.get(i));
            t.setTextSize(15);
            t.setGravity(android.view.Gravity.CENTER);
            t.setPadding(AndroidUtilities.dp(14), 0, AndroidUtilities.dp(14), 0);
            t.setOnClickListener(v -> {
                if (selectedTab == index) {
                    return;
                }
                selectedTab = index;
                styleTabs(labels);
                refresh();
                if (listView != null) {
                    listView.scrollToPosition(0);
                }
            });
            labels.add(t);
            strip.addView(t, new android.widget.LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));
        }
        styleTabs(labels);
        return scroll;
    }

    private void styleTabs(List<android.widget.TextView> labels) {
        int accent = Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader);
        int plain = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText);
        for (int i = 0; i < labels.size(); i++) {
            android.widget.TextView t = labels.get(i);
            boolean on = i == selectedTab;
            t.setTextColor(on ? accent : plain);
            t.setTypeface(on ? AndroidUtilities.bold() : android.graphics.Typeface.DEFAULT);
            if (on) {
                android.graphics.drawable.GradientDrawable line = new android.graphics.drawable.GradientDrawable();
                line.setColor(accent);
                line.setCornerRadii(new float[]{AndroidUtilities.dp(3), AndroidUtilities.dp(3), AndroidUtilities.dp(3), AndroidUtilities.dp(3), 0, 0, 0, 0});
                t.setBackground(new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{line}) {
                    @Override
                    public void draw(android.graphics.Canvas canvas) {
                        android.graphics.Rect b = getBounds();
                        line.setBounds(b.left + AndroidUtilities.dp(10), b.bottom - AndroidUtilities.dp(3), b.right - AndroidUtilities.dp(10), b.bottom);
                        line.draw(canvas);
                    }
                });
            } else {
                t.setBackground(null);
            }
        }
    }

    /** Rebuilds the rows and redraws the list. */
    protected void refresh() {
        rebuildRows();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (adapter != null) {
            refresh();
        }
    }

    // ---- row builders -------------------------------------------------------------------

    private Row add(int type) {
        Row row = new Row();
        row.type = type;
        rows.add(row);
        return row;
    }

    protected Row header(String title) {
        Row r = add(T_HEADER);
        r.title = title;
        return r;
    }

    /** A gray gap that closes a section. */
    protected void gap() {
        add(T_GAP);
    }

    /** Gray caption under a section. */
    protected void info(String text) {
        Row r = add(T_INFO);
        r.title = text;
    }

    protected Row toggle(String key, String title, String sub, boolean def) {
        Row r = add(T_TOGGLE);
        r.key = key;
        r.title = title;
        r.sub = sub;
        r.def = def;
        return r;
    }

    protected Row toggle(String key, String title, String sub, boolean def, Setter<Object> onChange) {
        Row r = toggle(key, title, sub, def);
        r.onChange = onChange;
        return r;
    }

    /** Value row backed by an int pref: tap opens a list of {@code options}. */
    protected Row choice(String key, String title, String sub, int def, String... options) {
        Row r = add(T_VALUE);
        r.key = key;
        r.title = title;
        r.sub = sub;
        r.defInt = def;
        r.opts = options;
        return r;
    }

    protected Row choice(String key, String title, String sub, int def, Setter<Object> onChange, String... options) {
        Row r = choice(key, title, sub, def, options);
        r.onChange = onChange;
        return r;
    }

    /** Value row with free content: shows {@code value}, runs {@code action} on tap. */
    protected Row value(String title, Getter<String> value, Runnable action) {
        Row r = add(T_VALUE);
        r.title = title;
        r.value = value;
        r.action = action;
        return r;
    }

    /** Discrete slider with captions under the notches, backed by an int pref (index). */
    protected Row slider(String key, int def, Setter<Object> onChange, String... labels) {
        Row r = add(T_SLIDER);
        r.key = key;
        r.defInt = def;
        r.opts = labels;
        r.onChange = onChange;
        return r;
    }

    protected Row link(int icon, org.telegram.ui.Components.IconBackgroundColors color, String title, String value, Runnable action) {
        Row r = add(T_LINK);
        r.icon = icon;
        r.color = color.top;
        r.color2 = color.bottom;
        r.title = title;
        r.sub = value;
        r.action = action;
        return r;
    }

    /** Row with a plain outline icon and a blue value on the right (AyuGram style). */
    protected Row item(int icon, String title, String value, Runnable action) {
        Row r = add(T_LINK);
        r.icon = icon;
        r.title = title;
        r.sub = value;
        r.action = action;
        return r;
    }

    protected Row button(String title, boolean red, Runnable action) {
        Row r = add(T_BUTTON);
        r.title = title;
        r.red = red;
        r.action = action;
        return r;
    }

    protected Row custom(String id, Factory factory, Binder binder) {
        Row r = add(T_CUSTOM);
        r.customId = id;
        r.factory = factory;
        r.binder = binder;
        return r;
    }

    /**
     * Expandable master switch ("Режим призрака 2/5"): the switch flips every option that is not
     * locked, a tap elsewhere folds the list, a long press on an option locks its value.
     */
    protected void master(String id, String title, String[] keys, String[] titles, boolean[] defs) {
        master(id, title, keys, titles, defs, null);
    }

    protected void master(String id, String title, String[] keys, String[] titles, boolean[] defs, Setter<Object> onChange) {
        Row m = add(T_MASTER);
        m.onChange = onChange;
        m.masterId = id;
        m.title = title;
        m.keys = keys;
        m.defs = defs;
        m.titles = titles;
        if (expanded.contains(id)) {
            for (int i = 0; i < keys.length; i++) {
                Row o = add(T_OPTION);
                o.key = keys[i];
                o.title = titles[i];
                o.def = defs != null && defs[i];
                o.masterId = id;
                o.onChange = onChange;
            }
        }
    }

    // ---- state helpers ------------------------------------------------------------------

    private static boolean lockedOn(String key) {
        return TgYouPrefs.bool("lock." + key, false);
    }

    private int countOn(Row master) {
        int n = 0;
        for (int i = 0; i < master.keys.length; i++) {
            if (TgYouPrefs.bool(master.keys[i], master.defs != null && master.defs[i])) {
                n++;
            }
        }
        return n;
    }

    private void fire(Row row, Object value) {
        if (row.onChange != null) {
            try {
                row.onChange.set(value);
            } catch (Throwable t) {
                org.telegram.messenger.FileLog.e("tgyou: setting callback failed", t);
            }
        }
    }

    private void onClick(View view, int position, float x) {
        if (position < 0 || position >= rows.size()) {
            return;
        }
        Row row = rows.get(position);
        switch (row.type) {
            case T_TOGGLE: {
                boolean now = !TgYouPrefs.bool(row.key, row.def);
                TgYouPrefs.setBool(row.key, now);
                fire(row, now);
                if (view instanceof TextCheckCell) {
                    ((TextCheckCell) view).setChecked(now);
                }
                break;
            }
            case T_OPTION: {
                if (lockedOn(row.key)) {
                    toast("Значение зафиксировано. Зажмите, чтобы снять фиксацию.");
                    break;
                }
                boolean now = !TgYouPrefs.bool(row.key, row.def);
                TgYouPrefs.setBool(row.key, now);
                fire(row, now);
                refresh();
                break;
            }
            case T_MASTER: {
                if (x > view.getMeasuredWidth() - AndroidUtilities.dp(76)) {
                    boolean now = countOn(row) == 0;
                    for (String key : row.keys) {
                        if (!lockedOn(key)) {
                            TgYouPrefs.setBool(key, now);
                        }
                    }
                    fire(row, now);
                } else if (!expanded.remove(row.masterId)) {
                    expanded.add(row.masterId);
                }
                refresh();
                break;
            }
            case T_VALUE: {
                if (row.action != null) {
                    row.action.run();
                } else {
                    showChoice(row);
                }
                break;
            }
            case T_LINK:
            case T_BUTTON: {
                if (row.action != null) {
                    row.action.run();
                }
                break;
            }
            default:
                break;
        }
    }

    private boolean onLongClick(int position) {
        if (position < 0 || position >= rows.size()) {
            return false;
        }
        Row row = rows.get(position);
        if (row.type != T_OPTION) {
            return false;
        }
        boolean now = !lockedOn(row.key);
        TgYouPrefs.setBool("lock." + row.key, now);
        toast(now ? "Значение зафиксировано: главный переключатель его не изменит." : "Фиксация снята.");
        refresh();
        return true;
    }

    protected void toast(String text) {
        if (getParentActivity() != null) {
            Toast.makeText(getParentActivity(), text, Toast.LENGTH_SHORT).show();
        }
    }

    private void showChoice(Row row) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(row.title);
        builder.setItems(row.opts, (dialog, which) -> {
            TgYouPrefs.setInt(row.key, which);
            fire(row, which);
            refresh();
        });
        showDialog(builder.create());
    }

    /** Text prompt; the callback gets the trimmed text. */
    protected void askText(String title, String initial, boolean numbers, Setter<String> done) {
        if (getParentActivity() == null) {
            return;
        }
        EditText input = new EditText(getParentActivity());
        input.setSingleLine(true);
        input.setText(initial);
        if (numbers) {
            input.setInputType(InputType.TYPE_CLASS_NUMBER);
        }
        input.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
        input.setPadding(AndroidUtilities.dp(24), AndroidUtilities.dp(8), AndroidUtilities.dp(24), AndroidUtilities.dp(8));
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(title);
        builder.setView(input);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), (d, w) -> done.set(input.getText().toString().trim()));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.create());
    }

    protected void confirm(String title, String message, String positive, Runnable yes) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton(positive, (d, w) -> yes.run());
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.create());
    }

    /** Opens the chat picker; {@code type} is a DialogsActivity.DIALOGS_TYPE_* constant. */
    protected void pickChat(int type, Setter<Long> picked) {
        Bundle args = new Bundle();
        args.putBoolean("onlySelect", true);
        args.putBoolean("checkCanWrite", false);
        args.putInt("dialogsType", type);
        args.putBoolean("allowGlobalSearch", true);
        DialogsActivity activity = new DialogsActivity(args);
        activity.setDelegate((fragment, dids, message, param, notify, scheduleDate, scheduleRepeatPeriod, topicsFragment) -> {
            activity.finishFragment();
            for (int i = 0; i < dids.size(); i++) {
                picked.set(dids.get(i).dialogId);
            }
            refresh();
            return true;
        });
        presentFragment(activity);
    }

    // ---- adapter ------------------------------------------------------------------------

    private class ListAdapter extends RecyclerListView.SelectionAdapter {
        private final Context context;

        ListAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getItemCount() {
            return rows.size();
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder holder) {
            int type = holder.getItemViewType();
            return type == T_TOGGLE || type == T_VALUE || type == T_LINK || type == T_BUTTON
                    || type == T_TOGGLE + 100 + T_MASTER || type == T_TOGGLE + 100 + T_OPTION;
        }

        @Override
        public int getItemViewType(int position) {
            Row row = rows.get(position);
            if (row.type == T_CUSTOM) {
                return T_CUSTOM + 1 + (row.customId.hashCode() & 0xFFFFF);
            }
            return row.type == T_MASTER || row.type == T_OPTION ? T_TOGGLE + 100 + row.type : row.type;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view;
            if (viewType > T_CUSTOM) {
                view = null;
                for (Row row : rows) {
                    if (row.type == T_CUSTOM && T_CUSTOM + 1 + (row.customId.hashCode() & 0xFFFFF) == viewType) {
                        view = row.factory.create(context);
                        break;
                    }
                }
                if (view == null) {
                    view = new View(context);
                }
            } else if (viewType == T_TOGGLE + 100 + T_MASTER || viewType == T_TOGGLE + 100 + T_OPTION || viewType == T_TOGGLE) {
                view = new TextCheckCell(context);
            } else if (viewType == T_HEADER) {
                view = new HeaderCell(context);
            } else if (viewType == T_VALUE) {
                view = new TextSettingsCell(context);
            } else if (viewType == T_SLIDER) {
                SlideChooseView slide = new SlideChooseView(context);
                FrameLayout box = new FrameLayout(context);
                box.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                box.addView(slide, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 0, 6, 0, 6));
                view = box;
            } else if (viewType == T_LINK || viewType == T_BUTTON) {
                view = new TextCell(context);
            } else if (viewType == T_GAP) {
                view = new ShadowSectionCell(context);
            } else {
                view = new TextInfoPrivacyCell(context);
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT));
            return new RecyclerListView.Holder(view);
        }

        private boolean dividerAfter(int position) {
            if (position + 1 >= rows.size()) {
                return false;
            }
            int next = rows.get(position + 1).type;
            return next != T_GAP && next != T_INFO;
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            Row row = rows.get(position);
            View view = holder.itemView;
            boolean divider = dividerAfter(position);
            switch (row.type) {
                case T_HEADER:
                    ((HeaderCell) view).setText(row.title);
                    break;
                case T_TOGGLE: {
                    boolean checked = TgYouPrefs.bool(row.key, row.def);
                    TextCheckCell cell = (TextCheckCell) view;
                    if (row.sub != null && !row.sub.isEmpty()) {
                        cell.setTextAndValueAndCheck(row.title, row.sub, checked, true, divider);
                    } else {
                        cell.setTextAndCheck(row.title, checked, divider);
                    }
                    break;
                }
                case T_MASTER: {
                    int on = countOn(row);
                    TextCheckCell cell = (TextCheckCell) view;
                    cell.setTextAndValueAndCheck(row.title, on + "/" + row.keys.length + (expanded.contains(row.masterId) ? "  ˄" : "  ˅"),
                            on > 0, false, divider);
                    break;
                }
                case T_OPTION: {
                    TextCheckCell cell = (TextCheckCell) view;
                    boolean locked = lockedOn(row.key);
                    cell.setTextAndValueAndCheck(row.title, locked ? "Зафиксировано" : "", TgYouPrefs.bool(row.key, row.def), false, divider);
                    break;
                }
                case T_VALUE: {
                    String value;
                    if (row.value != null) {
                        value = row.value.get();
                    } else {
                        int idx = TgYouPrefs.integer(row.key, row.defInt);
                        value = row.opts[Math.max(0, Math.min(row.opts.length - 1, idx))];
                    }
                    ((TextSettingsCell) view).setTextAndValue(row.title, value, divider);
                    break;
                }
                case T_SLIDER: {
                    SlideChooseView slide = (SlideChooseView) ((FrameLayout) view).getChildAt(0);
                    int idx = Math.max(0, Math.min(row.opts.length - 1, TgYouPrefs.integer(row.key, row.defInt)));
                    slide.setOptions(idx, row.opts);
                    slide.setCallback(index -> {
                        TgYouPrefs.setInt(row.key, index);
                        fire(row, index);
                    });
                    break;
                }
                case T_LINK: {
                    TextCell cell = (TextCell) view;
                    if (row.color == 0 && row.color2 == 0) {
                        cell.setTextAndValueAndIcon(row.title, row.sub, row.icon, divider);
                    } else {
                        cell.setTextAndValueAndColorfulIcon(row.title, row.sub, false, row.icon, row.color, row.color2, divider);
                    }
                    break;
                }
                case T_BUTTON: {
                    TextCell cell = (TextCell) view;
                    cell.setText(row.title, divider);
                    cell.setTextColor(Theme.getColor(row.red ? Theme.key_text_RedBold : Theme.key_windowBackgroundWhiteBlueText4));
                    break;
                }
                case T_INFO: {
                    TextInfoPrivacyCell cell = (TextInfoPrivacyCell) view;
                    cell.setText(row.title);
                    cell.setBackground(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                    break;
                }
                case T_GAP:
                    break;
                default:
                    if (row.binder != null) {
                        row.binder.bind(view);
                    }
                    break;
            }
        }
    }
}
