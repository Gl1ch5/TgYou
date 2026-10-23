# function / dialogs (27 методов)

## `org.telegram.ui.Adapters.DialogsAdapter`
- `canClickButtonInside()` -> `boolean`

## `org.telegram.ui.Adapters.DialogsAdapter$DialogsPreloader`
- `add(long dialog_id)` -> `void`
- `isReady(long currentDialogId)` -> `boolean`
- `remove(long currentDialogId)` -> `void`

## `org.telegram.ui.Adapters.DialogsAdapter$ItemInternal`
- `hashCode()` -> `int`

## `org.telegram.ui.Adapters.FiltersView$MediaFilterData`
- `isMedia()` -> `boolean`
- `isSameType(MediaFilterData filterData)` -> `boolean`
- `setUser(TLObject chat)` -> `void`

## `org.telegram.ui.CachedMediaLayout$DialogsAdapter`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.Cells.DialogCell`
- `checkCurrentDialogIndex(boolean frozen)` -> `boolean`
- `checkHeight()` -> `void`
- `hasTags()` -> `boolean`
- `requestLayout()` -> `void`

## `org.telegram.ui.Components.DialogCellTags`
- `isEmpty()` -> `boolean`

## `org.telegram.ui.Components.ShareAlert$ShareDialogsAdapter`
- `fetchDialogs()` -> `void`

## `org.telegram.ui.DialogsActivity`
- `addOrRemoveSelectedDialog(long did, View cell)` -> `boolean`
- `canBeginSlide()` -> `boolean`
- `canParentTabsSlide(MotionEvent ev, boolean forward)` -> `boolean`
- `hasHiddenArchive()` -> `boolean`
- `hasSharedMediaEntries()` -> `boolean`
- `static loadDialogs(AccountInstance accountInstance)` -> `void`
- `onPanTranslationUpdate(float y)` -> `void`

## `org.telegram.ui.DialogsActivity$ContentView`
- `checkTabsAnimationInProgress()` -> `boolean`
- `requestDisallowInterceptTouchEvent(boolean disallowIntercept)` -> `void`

## `org.telegram.ui.DialogsActivity$DialogsActivityDelegate`
- `canSelectStories()` -> `default boolean`

## `org.telegram.ui.DialogsActivity$DialogsRecyclerView`
- `addView(View child, int index, ViewGroup.LayoutParams params)` -> `void`
- `requestLayout()` -> `void`
