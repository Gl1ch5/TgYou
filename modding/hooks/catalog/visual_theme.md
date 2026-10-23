# visual / theme (2710 методов)

## `org.telegram.messenger.MessagesController$PeerColor`
- `getColor(int i, Theme.ResourcesProvider resourcesProvider)` -> `int`

## `org.telegram.messenger.MessagesController$PeerColors`
- `getColor(int colorId)` -> `PeerColor`

## `org.telegram.ui.ActionBar.ActionBar`
- `actionModeIsExist(String tag)` -> `boolean`
- `alwaysApplyColorFilterToBackButton()` -> `void`
- `beginDelayedTransition()` -> `void`
- `centerTitle()` -> `void`
- `clearSearchFilters()` -> `void`
- `closeSearchField()` -> `void`
- `closeSearchField(boolean closeKeyboard)` -> `void`
- `createActionMode()` -> `ActionBarMenu`
- `createActionMode(boolean needTop, String tag)` -> `ActionBarMenu`
- `createAdditionalSubTitleOverlayContainer()` -> `FrameLayout`
- `createAdditionalSubtitleTextView()` -> `void`
- `createMenu()` -> `ActionBarMenu`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `static findChildUnder(ViewGroup parent, float x, float y, View exclude)` -> `View`
- `getActionBarMenuOnItemClick()` -> `ActionBarMenuOnItemClick`
- `getActionMode()` -> `ActionBarMenu`
- `getActionModeFactor()` -> `float`
- `getAdditionalSubTitleOverlayContainer()` -> `FrameLayout`
- `getAdditionalSubtitleTextView()` -> `SimpleTextView`
- `getBackButton()` -> `ImageView`
- `getBackButtonDrawable()` -> `Drawable`
- `getBackButtonState()` -> `INavigationLayout.BackButtonState`
- `getBackgroundColor()` -> `int`
- `getCastShadows()` -> `boolean`
- `static getCurrentActionBarHeight()` -> `int`
- `getOccupyStatusBar()` -> `boolean`
- `getSearchAvatarImageView()` -> `BackupImageView`
- `getShadowAlpha()` -> `int`
- `getSubtitle()` -> `String`
- `getSubtitleTextView()` -> `SimpleTextView`
- `getTitle()` -> `String`
- `getTitleFontMetricsInt()` -> `Paint.FontMetricsInt`
- `getTitleTextView()` -> `SimpleTextView`
- `getTitleTextView2()` -> `SimpleTextView`
- `getTitlesContainer()` -> `FrameLayout`
- `hideActionMode()` -> `void`
- `isActionModeShowed()` -> `boolean`
- `isActionModeShowed(String tag)` -> `boolean`
- `isSearchFieldVisible()` -> `boolean`
- `listenToBackgroundUpdate(Runnable invalidate)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDrawCrossfadeContent(Canvas canvas, boolean front, boolean hideBackDrawable, float progress)` -> `void`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onMenuButtonPressed()` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onSearchChangedIgnoreTitles()` -> `boolean`
- `onSearchFieldVisibilityChanged(boolean visible)` -> `void`
- `onSearchPressed()` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `onViewAdded(View child)` -> `void`
- `openSearchField(String text, boolean animated)` -> `void`
- `openSearchField(boolean animated)` -> `void`
- `setActionBarMenuOnItemClick(ActionBarMenuOnItemClick listener)` -> `void`
- `setActionModeColor(int color)` -> `void`
- `setActionModeOverrideColor(int color)` -> `void`
- `setActionModeTopColor(int color)` -> `void`
- `setAdaptiveBackground(RecyclerView list)` -> `void`
- `setAdaptiveBackground(RecyclerView list, boolean hideTitle)` -> `void`
- `setAdaptiveBackground(RecyclerView list, boolean hideTitle, final int topColorKey, final int lowerColorKey)` -> `void`
- `setAdaptiveBackground(SectionsScrollView list)` -> `void`
- `setAdaptiveBackground(SectionsScrollView list, final int topColorKey, final int lowerColorKey)` -> `void`
- `setAddToContainer(boolean value)` -> `void`
- `setAdditionalTextLeft(int x)` -> `void`
- `setAllowOverlayTitle(boolean value)` -> `void`
- `setBackButtonContentDescription(CharSequence description)` -> `void`
- `setBackButtonDrawable(Drawable drawable)` -> `void`
- `setBackButtonImage(int resource)` -> `void`
- `setBackgroundColor(int color)` -> `void`
- `setCastShadows(boolean value)` -> `void`
- `setChatAvatarContainer(ChatAvatarContainer chatAvatarContainer)` -> `void`
- `setClipContent(boolean value)` -> `void`
- `setDrawBackButton(boolean b)` -> `void`
- `setDrawBlurBackground(SizeNotifierFrameLayout contentView)` -> `void`
- `setDrawGlassTitle(boolean draw)` -> `void`
- `setEnabled(boolean enabled)` -> `void`
- `setExtraHeight(int value)` -> `void`
- `setForceSkipTouches(boolean forceSkipTouches)` -> `void`
- `setForcedMenuMinWidth(int width)` -> `void`
- `setForcedMenuWidth(int width)` -> `void`
- `setGlassOnlyBack()` -> `void`
- `setInterceptTouchEventListener(View.OnTouchListener listener)` -> `void`
- `setInterceptTouches(boolean value)` -> `void`
- `setItemsBackgroundColor(int color, boolean isActionMode)` -> `void`
- `setItemsColor(int color, boolean isActionMode)` -> `void`
- `setMenuOffsetSuppressed(boolean menuOffsetSuppressed)` -> `void`
- `setOccupyStatusBar(boolean value)` -> `void`
- `setOnActionModeFactorChangeListener(Runnable listener)` -> `void`
- `setOverlayTitleAnimation(boolean ovelayTitleAnimation)` -> `void`
- `setPopupBackgroundColor(int color, boolean forActionMode)` -> `void`
- `setPopupItemsColor(int color, boolean icon, boolean forActionMode)` -> `void`
- `setPopupItemsSelectorColor(int color, boolean forActionMode)` -> `void`
- `setRightDrawableOnClick(OnClickListener onClickListener)` -> `void`
- `setSearchAvatarImageView(BackupImageView backupImageView)` -> `void`
- `setSearchCursorColor(int color)` -> `void`
- `setSearchFactor(float factor)` -> `void`
- `setSearchFieldText(String text)` -> `void`
- `setSearchFilter(FiltersView.MediaFilterData filter)` -> `void`
- `setSearchTextColor(int color, boolean placeholder)` -> `void`
- `setShadowAlpha(int alpha)` -> `void`
- `setSkipDrawChild(boolean skip)` -> `void`
- `setSubtitle(CharSequence value)` -> `void`
- `setSubtitleColor(int color)` -> `void`
- `setSupportsHolidayImage(boolean value)` -> `void`
- `setTitle(CharSequence value)` -> `void`
- `setTitle(CharSequence value, Drawable rightDrawable)` -> `void`
- `setTitleActionRunnable(Runnable action)` -> `void`
- `setTitleAnimated(CharSequence title, boolean fromBottom, long duration)` -> `void`
- `setTitleAnimated(CharSequence title, boolean fromBottom, long duration, Interpolator interpolator)` -> `void`
- `setTitleColor(int color)` -> `void`
- `setTitleOverlayText(String title, int titleId, Runnable action)` -> `void`
- `setTitleRightMargin(int value)` -> `void`
- `setTitleScrollNonFitText(boolean b)` -> `void`
- `setTranslationY(float translationY)` -> `void`
- `setUseContainerForTitles()` -> `void`
- `setupGlass(BlurredBackgroundDrawableViewFactory factory, BlurredBackgroundColorProvider colorProvider)` -> `void`
- `setupGlass(BlurredBackgroundDrawableViewFactory factory, BlurredBackgroundColorProvider colorProvider, boolean isForum)` -> `void`
- `shouldClipChild(View child)` -> `boolean`
- `showActionMode()` -> `void`
- `showActionMode(boolean animated)` -> `void`
- `showActionMode(boolean animated, View extraView, View showingView, View[] hidingViews, boolean[] hideView, View translationView, int translation)` -> `void`
- `showActionModeTop()` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.ActionBar.ActionBar$ActionBarMenuOnItemClick`
- `onItemClick(int id)` -> `void`

## `org.telegram.ui.ActionBar.ActionBarAnimatedSubtitleOverlayContainer`
- `getTotalVisibility()` -> `float`
- `onItemChanged(ReplaceAnimator<?> animator)` -> `void`
- `setText(CharSequence text, boolean animated)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.ActionBar.ActionBarAnimatedSubtitleOverlayContainer$SimpleTextViewReplaceable`
- `performDestroy()` -> `void`

## `org.telegram.ui.ActionBar.ActionBarLayout`
- `allowSwipe()` -> `boolean`
- `animateThemedValues(ThemeAnimationSettings settings, Runnable onDone)` -> `void`
- `bringToFront(int i)` -> `void`
- `closeLastFragment(boolean animated)` -> `void`
- `closeLastFragment(boolean animated, boolean forceNoAnimation)` -> `void`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `dispatchKeyEventPreIme(KeyEvent event)` -> `boolean`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `drawCurrentPreviewFragment(Canvas canvas, Drawable foregroundDrawable)` -> `void`
- `drawHeaderShadow(Canvas canvas, int alpha, int y)` -> `void`
- `expandPreviewFragment()` -> `void`
- `extendActionMode(Menu menu)` -> `boolean`
- `static findScrollingChild(ViewGroup parent, float x, float y)` -> `View`
- `finishPreviewFragment()` -> `void`
- `getBottomSheetTabs()` -> `BottomSheetTabs`
- `getBottomTabsHeight(boolean animated)` -> `int`
- `getCurrentPreviewFragmentAlpha()` -> `float`
- `getDrawerLayoutContainer()` -> `DrawerLayoutContainer`
- `getFragmentStack()` -> `List<BaseFragment>`
- `getInnerTranslationX()` -> `float`
- `getLastFragment()` -> `BaseFragment`
- `getLastFragmentIncludeMainTabs()` -> `BaseFragment`
- `getMessageDrawableOutMediaStart()` -> `MessageDrawable`
- `getMessageDrawableOutStart()` -> `MessageDrawable`
- `getOverlayContainerView()` -> `FrameLayout`
- `getPulledDialogs()` -> `List<BackButtonMenu.PulledDialog>`
- `getSheetFragment()` -> `EmptyBaseFragment`
- `getSheetFragment(boolean create)` -> `EmptyBaseFragment`
- `getThemeAnimationValue()` -> `float`
- `getWindow()` -> `Window`
- `isInBubbleMode()` -> `boolean`
- `isInPassivePreviewMode()` -> `boolean`
- `isInPreviewMenuMode()` -> `boolean`
- `isInPreviewMode()` -> `boolean`
- `isLayersLayout()` -> `boolean`
- `isPreviewOpenAnimationInProgress()` -> `boolean`
- `isRightLayout()` -> `boolean`
- `isSheet()` -> `boolean`
- `isSwipeInProgress()` -> `boolean`
- `isTransitionAnimationInProgress()` -> `boolean`
- `measureKeyboardHeight()` -> `int`
- `movePreviewFragment(float dy)` -> `void`
- `onActionModeFinished(Object mode)` -> `void`
- `onActionModeStarted(Object mode)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onBackCancelled()` -> `void`
- `onBackInvoked()` -> `void`
- `onBackPressed()` -> `void`
- `onBackProgress(float t)` -> `void`
- `onBackStarted(float touchX, float touchY)` -> `boolean`
- `onConfigurationChanged(android.content.res.Configuration newConfig)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onGetDebugItems()` -> `List<FloatingDebugController.DebugItem>`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onKeyUp(int keyCode, KeyEvent event)` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onLowMemory()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `onUserLeaveHint()` -> `void`
- `parentDraw(View parent, Canvas canvas)` -> `void`
- `presentFragment(NavigationParams params)` -> `boolean`
- `rebuildAllFragmentViews(boolean last, boolean showLastAfter)` -> `void`
- `rebuildLogout()` -> `void`
- `relayout()` -> `void`
- `resumeDelayedFragmentAnimation()` -> `void`
- `setBackgroundView(View view)` -> `void`
- `setDelegate(INavigationLayoutDelegate INavigationLayoutDelegate)` -> `void`
- `setDrawerLayoutContainer(DrawerLayoutContainer layout)` -> `void`
- `setFragmentPanTranslationOffset(int offset)` -> `void`
- `setFragmentStack(List<BaseFragment> stack)` -> `void`
- `setFragmentStackChangedListener(Runnable onFragmentStackChanged)` -> `void`
- `setHighlightActionButtons(boolean highlightActionButtons)` -> `void`
- `setInBubbleMode(boolean value)` -> `void`
- `setInnerTranslationX(float value)` -> `void`
- `setIsLayersLayout()` -> `void`
- `setIsRightLayout()` -> `void`
- `setIsSheet(boolean isSheet)` -> `void`
- `setNavigationBarColor(int color)` -> `void`
- `setOverrideWidthOffset(int overrideWidthOffset)` -> `void`
- `setPulledDialogs(List<BackButtonMenu.PulledDialog> pulledDialogs)` -> `void`
- `setRemoveActionBarExtraHeight(boolean value)` -> `void`
- `setThemeAnimationValue(float value)` -> `void`
- `setTitleOverlayText(String title, int titleId, Runnable action)` -> `void`
- `setUseAlphaAnimations(boolean value)` -> `void`
- `setWindow(Window window)` -> `void`
- `showLastFragment()` -> `void`
- `startActivityForResult(final Intent intent, final int requestCode)` -> `void`
- `storyViewerAttached()` -> `boolean`
- `updateTitleOverlay()` -> `void`

## `org.telegram.ui.ActionBar.ActionBarLayout$LayoutContainer`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `hasOverlappingRendering()` -> `boolean`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onViewAdded(View child)` -> `void`
- `onViewRemoved(View child)` -> `void`
- `setDrawNavigationBar(boolean drawNavigationBar)` -> `void`
- `setFragmentPanTranslationOffset(int fragmentPanTranslationOffset)` -> `void`
- `setShouldHandleBottomInsets(EdgeToEdgeSupportMode edgeToEdgeSupportMode)` -> `void`

## `org.telegram.ui.ActionBar.ActionBarMenu`
- `clearItems()` -> `void`
- `clearSearchFilters()` -> `void`
- `closeSearchField(boolean closeKeyboard)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `getItem(int id)` -> `ActionBarMenuItem`
- `getItemsMeasuredWidth(boolean ignoreAlpha)` -> `int`
- `getItemsWidth()` -> `int`
- `getVisibleItemsMeasuredWidth()` -> `int`
- `getVisibleItemsMeasuredWidthWithAlpha()` -> `int`
- `hideAllPopupMenus()` -> `void`
- `lazilyAddItem(int id, int icon, Theme.ResourcesProvider resourcesProvider)` -> `LazyItem`
- `lazilyAddItem(int id, Drawable drawable, Theme.ResourcesProvider resourcesProvider)` -> `LazyItem`
- `lazilyAddItem(int id, int icon, CharSequence text, int backgroundColor, Drawable drawable, int width, CharSequence title, Theme.ResourcesProvider resourcesProvider)` -> `LazyItem`
- `onItemClick(int id)` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onMenuButtonPressed()` -> `void`
- `onSearchPressed()` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `openSearchField(boolean toggle, boolean showKeyboard, String text, boolean animated)` -> `void`
- `redrawPopup(int color)` -> `void`
- `searchFieldVisible()` -> `boolean`
- `setEnabled(boolean enabled)` -> `void`
- `setFilter(FiltersView.MediaFilterData filter)` -> `void`
- `setGlassMode(boolean glassMode)` -> `void`
- `setItemVisibility(int id, int visibility)` -> `void`
- `setOnLayoutListener(Runnable listener)` -> `void`
- `setPopupItemsColor(int color, boolean icon)` -> `void`
- `setPopupItemsSelectorColor(int color)` -> `void`
- `setSearchCursorColor(int color)` -> `void`
- `setSearchFieldText(String text)` -> `void`
- `setSearchTextColor(int color, boolean placeholder)` -> `void`
- `translateXItems(float offset)` -> `void`
- `updateItemsBackgroundColor()` -> `void`
- `updateItemsColor()` -> `void`

## `org.telegram.ui.ActionBar.ActionBarMenu$LazyItem`
- `createView()` -> `ActionBarMenuItem`
- `getTag()` -> `Object`
- `getView()` -> `ActionBarMenuItem`
- `getVisibility()` -> `int`
- `onView(Utilities.Callback<ActionBarMenuItem> onView)` -> `void`
- `setActionBarMenuItemSearchListener(ActionBarMenuItem.ActionBarMenuItemSearchListener listener)` -> `void`
- `setAllowCloseAnimation(boolean value)` -> `void`
- `setAlpha(float alpha)` -> `void`
- `setContentDescription(CharSequence contentDescription)` -> `void`
- `setIsSearchField(boolean value)` -> `void`
- `setOverrideMenuClick(boolean value)` -> `void`
- `setSearchFieldHint(CharSequence searchFieldHint)` -> `void`
- `setTag(Object tag)` -> `void`
- `setVisibility(int visibility)` -> `void`

## `org.telegram.ui.ActionBar.ActionBarMenuItem`
- `clearFocusOnSearchView()` -> `void`
- `clearSearchFilters()` -> `void`
- `clearSearchText()` -> `void`
- `closeSubMenu()` -> `void`
- `collapseSearchFilters()` -> `void`
- `draw(Canvas canvas)` -> `void`
- `forceUpdatePopupPosition()` -> `void`
- `getContentView()` -> `View`
- `getIconView()` -> `RLottieImageView`
- `getOnClickListener()` -> `OnClickListener`
- `getPopupLayout()` -> `ActionBarPopupWindow.ActionBarPopupWindowLayout`
- `getSearchClearButton()` -> `ImageView`
- `getSearchContainer()` -> `FrameLayout`
- `getSearchField()` -> `EditTextBoldCursor`
- `getSubItem(int id)` -> `View`
- `getTextView()` -> `TextView`
- `getVisibleSubItemsCount()` -> `int`
- `hideAllSubItems()` -> `void`
- `hideSubItem(int id)` -> `void`
- `isSearchField()` -> `boolean`
- `isSearchFieldVisible()` -> `boolean`
- `isSearchFieldVisible2()` -> `boolean`
- `isSubItemVisible(int id)` -> `boolean`
- `isSubMenuShowing()` -> `boolean`
- `lazilyAddColoredGap()` -> `Item`
- `lazilyAddSubItem(int id, int icon, CharSequence text)` -> `Item`
- `lazilyAddSubItem(int id, Drawable iconDrawable, CharSequence text)` -> `Item`
- `lazilyAddSubItem(int id, int icon, Drawable iconDrawable, CharSequence text, boolean dismiss, boolean needCheck)` -> `Item`
- `lazilyAddSwipeBackItem(int icon, Drawable iconDrawable, String text, View viewToSwipeBack)` -> `Item`
- `lazilyAddSwipeBackItem(int icon, Drawable iconDrawable, String text, Utilities.Callback0Return<View> viewFactory)` -> `Item`
- `lazilyAddText(CharSequence text, int textSizeDp)` -> `Item`
- `onDismiss()` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onSearchPressed()` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `openSearch(boolean openKeyboard)` -> `void`
- `redrawPopup(int color)` -> `void`
- `setActionBarMenuItemSearchListener(ActionBarMenuItemSearchListener actionBarMenuItemSearchListener)` -> `ActionBarMenuItem`
- `setAdditionalXOffset(int value)` -> `void`
- `setAdditionalYOffset(int value)` -> `void`
- `setAllowCloseAnimation(boolean value)` -> `ActionBarMenuItem`
- `setBlurredBackgroundFactory(BlurredBackgroundDrawableViewFactory subMenuFactory, BlurredBackgroundProvider subMenuProvider)` -> `void`
- `setDelegate(ActionBarMenuItemDelegate actionBarMenuItemDelegate)` -> `void`
- `setDimMenu(float dimAmount)` -> `void`
- `setFitSubItems(boolean fit)` -> `void`
- `setFixBackground(boolean fixBackground)` -> `void`
- `setForceSmoothKeyboard(boolean value)` -> `void`
- `setIcon(Drawable drawable)` -> `void`
- `setIcon(int resId)` -> `void`
- `setIcon(int resId, boolean animated)` -> `void`
- `setIconColor(int color)` -> `void`
- `setIgnoreOnTextChange()` -> `void`
- `setIsSearchField(boolean value)` -> `ActionBarMenuItem`
- `setIsSearchField(boolean value, boolean wrapInScrollView)` -> `ActionBarMenuItem`
- `setLayoutInScreen(boolean value)` -> `void`
- `setLongClickEnabled(boolean value)` -> `void`
- `setMenuXOffset(int offset)` -> `void`
- `setMenuYOffset(int offset)` -> `void`
- `setOnClickListener(@Nullable OnClickListener l)` -> `void`
- `setOnMenuDismiss(Utilities.Callback<Boolean> onMenuDismiss)` -> `void`
- `setOverrideMenuClick(boolean value)` -> `ActionBarMenuItem`
- `setPopupAnimationEnabled(boolean value)` -> `void`
- `setPopupItemsColor(int color, boolean icon)` -> `void`
- `setPopupItemsSelectorColor(int color)` -> `void`
- `setSearchAdditionalButton(View searchAdditionalButton)` -> `void`
- `setSearchFieldCaption(CharSequence caption)` -> `void`
- `setSearchFieldHint(CharSequence hint)` -> `void`
- `setSearchFieldText(CharSequence text, boolean animated)` -> `void`
- `setSearchPaddingStart(int padding)` -> `void`
- `setShowSearchProgress(boolean show)` -> `void`
- `setShowSubmenuByMove(boolean value)` -> `void`
- `setShowedFromBottom(boolean value)` -> `void`
- `setSubItemShown(int id, boolean show)` -> `void`
- `setSubMenuDelegate(ActionBarSubMenuItemDelegate actionBarSubMenuItemDelegate)` -> `void`
- `setSubMenuOpenSide(int side)` -> `void`
- `setText(CharSequence text)` -> `void`
- `setTransitionOffset(float offset)` -> `void`
- `setTranslationX(float translationX)` -> `void`
- `setupPopupRadialSelectors(int color)` -> `void`
- `showSubItem(int id)` -> `void`
- `showSubItem(int id, boolean animated)` -> `void`
- `toggleSearch(boolean openKeyboard)` -> `boolean`
- `toggleSubMenu(View topView, View fromView)` -> `void`
- `toggleSubMenu()` -> `void`
- `updateColor()` -> `void`

## `org.telegram.ui.ActionBar.ActionBarMenuItem$ActionBarMenuItemSearchListener`
- `forceShowClear()` -> `boolean`
- `getCustomToggleTransition()` -> `Animator`
- `onCaptionCleared()` -> `void`
- `onLayout(int l, int t, int r, int b)` -> `void`
- `onPreToggleSearch()` -> `void`
- `onSearchCollapse()` -> `void`
- `onSearchExpand()` -> `void`
- `onSearchFilterCleared(FiltersView.MediaFilterData filterData)` -> `void`
- `onSearchPressed(EditText editText)` -> `void`
- `onTextChanged(EditText editText)` -> `void`
- `showClearForCaption()` -> `boolean`

## `org.telegram.ui.ActionBar.ActionBarMenuItem$Item`
- `openSwipeBack()` -> `void`
- `setColors(int textColor, int iconColor)` -> `void`
- `setIcon(int icon)` -> `void`
- `setOnClickListener(View.OnClickListener onClickListener)` -> `void`
- `setRightIconVisibility(int visibility)` -> `void`
- `setText(CharSequence text)` -> `void`
- `setVisibility(int visibility)` -> `void`

## `org.telegram.ui.ActionBar.ActionBarMenuItem$ReactionFilterView`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setData(FiltersView.MediaFilterData data)` -> `void`

## `org.telegram.ui.ActionBar.ActionBarMenuItem$SearchFilterView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `getFilter()` -> `FiltersView.MediaFilterData`
- `getThemedColor(int key)` -> `int`
- `isSelectedForDelete()` -> `boolean`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setData(FiltersView.MediaFilterData data)` -> `void`
- `setExpanded(boolean expanded)` -> `void`
- `setGlass()` -> `void`
- `setSelectedForDelete(boolean select)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.ActionBar.ActionBarMenuSlider`
- `getColorValue(float value)` -> `int`
- `getLeftStringValue(float value)` -> `String`
- `getRightStringValue(float value)` -> `String`
- `getValue()` -> `float`
- `invalidateBlur()` -> `void`
- `invalidateBlur(boolean isInChat)` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBackgroundColor(int color)` -> `void`
- `setDrawBlur(boolean draw)` -> `void`
- `setDrawShadow(boolean draw)` -> `void`
- `setOnValueChange(Utilities.Callback2<Float, Boolean> onValueChange)` -> `void`
- `setRoundRadiusDp(float roundRadiusDp)` -> `void`
- `setStops(float[] stops)` -> `void`
- `setTextColor(int color)` -> `void`
- `setValue(float value, boolean animated)` -> `void`

## `org.telegram.ui.ActionBar.ActionBarMenuSlider$SpeedSlider`
- `getColorValue(float value)` -> `int`
- `getLeftStringValue(float value)` -> `String`
- `getRightStringValue(float value)` -> `String`
- `getSpeed(float value)` -> `float`
- `getSpeed()` -> `float`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `performAccessibilityAction(int action, Bundle arguments)` -> `boolean`
- `setLabel(String s)` -> `void`
- `setSpeed(float speed, boolean animated)` -> `void`
- `setStops(float[] stops)` -> `void`

## `org.telegram.ui.ActionBar.ActionBarMenuSubItem`
- `getCheckView()` -> `CheckBox2`
- `getIconResId()` -> `int`
- `getImageView()` -> `ImageView`
- `getRightIcon()` -> `ImageView`
- `getTextView()` -> `AnimatedEmojiSpan.TextViewEmojis`
- `makeCheckView(int needCheck)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onItemShown()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `openSwipeBack()` -> `void`
- `setAnimatedIcon(int resId)` -> `void`
- `setCheckColor(int colorKey)` -> `void`
- `setChecked(boolean checked)` -> `void`
- `setColors(int textColor, int iconColor)` -> `ActionBarMenuSubItem`
- `setEmojiCacheType(int cacheType)` -> `void`
- `setEnabledByColor(boolean enabled, int colorDisabled, int colorEnabled)` -> `void`
- `setEnabledByColor(boolean enabled, int textColorDisabled, int iconColorDisabled, int colorEnabled)` -> `void`
- `setIcon(int resId)` -> `void`
- `setIcon(Drawable drawable)` -> `void`
- `setIconColor(int iconColor)` -> `void`
- `setIconColor(int iconColor, PorterDuff.Mode mode)` -> `void`
- `setIconColorImage(int iconColor)` -> `void`
- `setImageSize(int widthDp, int heightDp)` -> `void`
- `setItemHeight(int itemHeight)` -> `void`
- `setMultiline()` -> `void`
- `setMultiline(boolean changeSize)` -> `void`
- `setRightIcon(int icon)` -> `void`
- `setSelectorColor(int selectorColor)` -> `void`
- `setSubtext(CharSequence text)` -> `void`
- `setSubtextColor(int color)` -> `void`
- `setText(CharSequence text)` -> `void`
- `setTextAndIcon(CharSequence text, int icon)` -> `void`
- `setTextAndIcon(CharSequence text, int icon, Drawable iconDrawable)` -> `void`
- `setTextAndIcon(CharSequence text, ImageLocation imageLocation, String imageFilter, Drawable thumb, Object parentObject)` -> `void`
- `setTextColor(int textColor)` -> `void`
- `updateBackground()` -> `void`
- `updateSelectorBackground(boolean top, boolean bottom)` -> `void`
- `updateSelectorBackground(boolean top, boolean bottom, int selectorRad)` -> `void`

## `org.telegram.ui.ActionBar.ActionBarPopupWindow`
- `dimBehind()` -> `void`
- `dimBehind(float amount)` -> `void`
- `dismiss()` -> `void`
- `dismiss(boolean animated)` -> `void`
- `setAnimationEnabled(boolean value)` -> `void`
- `setDismissAnimationDuration(int value)` -> `void`
- `setEmptyOutAnimation(long time)` -> `void`
- `setFocusableFlag(boolean enable)` -> `void`
- `setLayoutInScreen(boolean value)` -> `void`
- `setPauseNotifications(boolean value)` -> `void`
- `setScaleOut(boolean b)` -> `void`
- `showAsDropDown(View anchor, int xoff, int yoff)` -> `void`
- `showAtLocation(View parent, int gravity, int x, int y)` -> `void`
- `static startAnimation(ActionBarPopupWindowLayout content)` -> `AnimatorSet`
- `startAnimation()` -> `void`
- `update(View anchor, int xoff, int yoff, int width, int height)` -> `void`
- `update(View anchor, int width, int height)` -> `void`

## `org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchKeyEvent(KeyEvent event)` -> `boolean`
- `getBackAlpha()` -> `int`
- `getBackScaleX()` -> `float`
- `getBackScaleY()` -> `float`
- `getBackgroundColor()` -> `int`
- `getBackgroundDrawable()` -> `Drawable`
- `getItemAt(int index)` -> `View`
- `getItemsCount()` -> `int`
- `getPadding()` -> `Rect`
- `getSwipeBack()` -> `PopupSwipeBackLayout`
- `getThemedColor(int key)` -> `int`
- `getViewsCount()` -> `int`
- `getVisibleHeight()` -> `int`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `precalculateHeight()` -> `int`
- `scrollToTop()` -> `void`
- `setAnimationEnabled(boolean value)` -> `void`
- `setBackAlpha(int value)` -> `void`
- `setBackScaleX(float value)` -> `void`
- `setBackScaleY(float value)` -> `void`
- `setBackgroundColor(int color)` -> `void`
- `setBackgroundDrawable(Drawable drawable)` -> `void`
- `setDispatchKeyEventListener(OnDispatchKeyEventListener listener)` -> `void`
- `setFitItems(boolean value)` -> `void`
- `setOnSizeChangedListener(ActionBarPopupWindow.onSizeChangedListener onSizeChangedListener)` -> `void`
- `setParentWindow(ActionBarPopupWindow popupWindow)` -> `void`
- `setReactionsTransitionProgress(float transitionEnterProgress)` -> `void`
- `setShownFromBottom(boolean value)` -> `void`
- `setSwipeBackForegroundColor(int color)` -> `void`
- `setTopView(View topView)` -> `void`
- `setupRadialSelectors(int color)` -> `void`
- `updateRadialSelectors()` -> `void`

## `org.telegram.ui.ActionBar.ActionBarPopupWindow$GapView`
- `onDraw(Canvas canvas)` -> `void`
- `setColor(int color)` -> `void`

## `org.telegram.ui.ActionBar.AdjustPanLayoutHelper`
- `OnPanTranslationUpdate(float y, float progress, boolean keyboardVisible)` -> `void`
- `OnTransitionEnd()` -> `void`
- `OnTransitionStart(boolean keyboardVisible, int contentHeight)` -> `void`
- `animationInProgress()` -> `boolean`
- `applyTranslation()` -> `boolean`
- `delayAnimation()` -> `void`
- `getAdjustingContentView()` -> `View`
- `getAdjustingParent()` -> `View`
- `getViewsToSetHeight(View parent)` -> `void`
- `heightAnimationEnabled()` -> `boolean`
- `ignoreOnce()` -> `void`
- `onAttach()` -> `void`
- `onDetach()` -> `void`
- `onTransitionEnd()` -> `void`
- `onTransitionStart(boolean keyboardVisible, int previousHeight, int contentHeight)` -> `void`
- `onTransitionStart(boolean keyboardVisible, int contentHeight)` -> `void`
- `runDelayedAnimation()` -> `void`
- `setCheckHierarchyHeight(boolean checkHierarchyHeight)` -> `void`
- `setEnabled(boolean value)` -> `void`
- `setResizableView(FrameLayout windowView)` -> `void`
- `setViewHeight(int height)` -> `void`
- `startOffset()` -> `int`
- `startTransition(int previousHeight, int contentHeight, boolean isKeyboardVisible)` -> `void`
- `stopTransition()` -> `void`
- `stopTransition(float t, boolean isKeyboardVisible)` -> `void`
- `updateTransition(float t)` -> `void`

## `org.telegram.ui.ActionBar.AlertDialog`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `dismissUnless(long minDuration)` -> `void`
- `getButton(int type)` -> `View`
- `getButtonsLayout()` -> `ViewGroup`
- `getContainerView()` -> `AlertDialogView`
- `getFullscreenContainerView()` -> `FrameLayout`
- `getItemsCount()` -> `int`
- `getMessageTextView()` -> `TextView`
- `getStarsBalanceCloud()` -> `BalanceCloud`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `getThemedColor(int key)` -> `int`
- `inflateContent(boolean setContent)` -> `View`
- `invalidateDrawable(Drawable who)` -> `void`
- `isDismissed()` -> `boolean`
- `makeButtonLoading(int type)` -> `Browser.Progress`
- `makeButtonLoading(int type, boolean dismissWhenEnd, boolean clearDismissDialogByButtons)` -> `Browser.Progress`
- `makeRed(int btn)` -> `void`
- `onBackPressed()` -> `void`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `redPositive()` -> `void`
- `scheduleDrawable(Drawable who, Runnable what, long when)` -> `void`
- `setBackgroundColor(int color)` -> `void`
- `setBlurParams(float blurAlpha, boolean blurBehind, boolean blurBackground)` -> `void`
- `setButton(int type, CharSequence text, final OnButtonClickListener listener)` -> `void`
- `setCanCancel(boolean value)` -> `void`
- `setCancelDialog(boolean enable)` -> `void`
- `setCanceledOnTouchOutside(boolean cancel)` -> `void`
- `setDismissDialogByButtons(boolean value)` -> `void`
- `setFocusable(boolean value)` -> `void`
- `setItemColor(int item, int color, int icon)` -> `void`
- `setMessage(CharSequence text)` -> `void`
- `setMessageLineSpacing(float spaceDp)` -> `void`
- `setMessageTextViewClickable(boolean value)` -> `void`
- `setNegativeButton(CharSequence text, final OnButtonClickListener listener)` -> `void`
- `setNeutralButton(CharSequence text, final OnButtonClickListener listener)` -> `void`
- `setOnCancelListener(OnCancelListener listener)` -> `void`
- `setPositiveButton(CharSequence text, final OnButtonClickListener listener)` -> `void`
- `setPositiveButtonListener(final OnButtonClickListener listener)` -> `void`
- `setProgress(int progress)` -> `void`
- `setSecondTitle(CharSequence text)` -> `void`
- `setShowStarsBalance(boolean show)` -> `AlertDialog`
- `setTextColor(int color)` -> `void`
- `setTextSize(int titleSizeDp, int messageSizeDp)` -> `void`
- `setTitle(CharSequence text)` -> `void`
- `setTopAnimation(int resId, int backgroundColor)` -> `void`
- `setTopAnimation(int resId, int size, int backgroundColor)` -> `void`
- `setTopHeight(int value)` -> `void`
- `setTopImage(int resId, int backgroundColor)` -> `void`
- `setTopImage(Drawable drawable, int backgroundColor)` -> `void`
- `show()` -> `void`
- `showCancelAlert()` -> `void`
- `showDelayed(long delay)` -> `void`
- `supportsNativeBlur()` -> `boolean`
- `unscheduleDrawable(Drawable who, Runnable what)` -> `void`

## `org.telegram.ui.ActionBar.AlertDialog$AlertDialogView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `draw(Canvas canvas)` -> `void`
- `hasOverlappingRendering()` -> `boolean`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `requestLayout()` -> `void`

## `org.telegram.ui.ActionBar.AlertDialog$Builder`
- `aboveMessageView(View view)` -> `Builder`
- `create()` -> `AlertDialog`
- `createAlertDialog(Context context, int progressViewStyle, Theme.ResourcesProvider resourcesProvider)` -> `AlertDialog`
- `forceVerticalButtons()` -> `Builder`
- `getContext()` -> `Context`
- `getDismissRunnable()` -> `Runnable`
- `makeCustomMaxHeight()` -> `Builder`
- `makeRed(int button)` -> `Builder`
- `notDrawBackgroundOnTopView(boolean b)` -> `void`
- `overrideDismissListener(Utilities.Callback<Runnable> overridenDissmissListener)` -> `Builder`
- `setAdditionalHorizontalPadding(int padding)` -> `Builder`
- `setBlurredBackground(boolean b)` -> `Builder`
- `setButton(int button, CharSequence text, final OnButtonClickListener listener)` -> `Builder`
- `setButtonsVertical(boolean vertical)` -> `void`
- `setCheckFocusable(boolean value)` -> `Builder`
- `setCustomViewOffset(int offset)` -> `Builder`
- `setDialogButtonColorKey(int key)` -> `Builder`
- `setDimAlpha(float dimAlpha)` -> `Builder`
- `setDimEnabled(boolean dimEnabled)` -> `Builder`
- `setItems(CharSequence[] items, final OnClickListener onClickListener)` -> `Builder`
- `setItems(CharSequence[] items, int[] icons, final OnClickListener onClickListener)` -> `Builder`
- `setNegativeButton(CharSequence text, final OnButtonClickListener listener)` -> `Builder`
- `setNeutralButton(CharSequence text, final OnButtonClickListener listener)` -> `Builder`
- `setOnBackButtonListener(final OnButtonClickListener listener)` -> `Builder`
- `setOnCancelListener(OnCancelListener listener)` -> `Builder`
- `setOnDismissListener(OnDismissListener onDismissListener)` -> `Builder`
- `setOnPreDismissListener(OnDismissListener onDismissListener)` -> `Builder`
- `setPositiveButton(CharSequence text, final OnButtonClickListener listener)` -> `Builder`
- `setSubtitle(CharSequence subtitle)` -> `Builder`
- `setTitle(CharSequence title)` -> `Builder`
- `setTopAnimation(int resId, int size, boolean autoRepeat, int backgroundColor)` -> `Builder`
- `setTopAnimation(int resId, int size, boolean autoRepeat, int backgroundColor, Map<String, Integer> layerColors)` -> `Builder`
- `setTopAnimation(int resId, int backgroundColor)` -> `Builder`
- `setTopAnimationIsNew(boolean isNew)` -> `Builder`
- `setTopImage(int resId, int backgroundColor)` -> `Builder`
- `setTopImage(Drawable drawable, int backgroundColor)` -> `Builder`
- `setTopView(View view)` -> `Builder`
- `setTopViewAspectRatio(float aspectRatio)` -> `void`
- `setView(View view)` -> `Builder`
- `setView(View view, int height)` -> `Builder`
- `setWidth(int width)` -> `Builder`
- `show()` -> `AlertDialog`
- `twoRowsButtonsWhenNeeded()` -> `Builder`

## `org.telegram.ui.ActionBar.AlertDialogDecor`
- `dismiss()` -> `void`
- `isShowing()` -> `boolean`
- `setOnDismissListener(@Nullable OnDismissListener listener)` -> `void`
- `setOnShowListener(@Nullable OnShowListener listener)` -> `void`
- `show()` -> `void`
- `showDelayed(long delay)` -> `void`
- `supportsNativeBlur()` -> `boolean`

## `org.telegram.ui.ActionBar.AlertDialogDecor$Builder`
- `createAlertDialog(Context context, int progressViewStyle, Theme.ResourcesProvider resourcesProvider)` -> `AlertDialog`

## `org.telegram.ui.ActionBar.BackDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `getRotation()` -> `float`
- `setAlpha(int alpha)` -> `void`
- `setAnimationTime(float value)` -> `void`
- `setArrowRotation(int angle)` -> `void`
- `setColor(int value)` -> `void`
- `setColorFilter(ColorFilter cf)` -> `void`
- `setRotated(boolean value)` -> `void`
- `setRotatedColor(int value)` -> `void`
- `setRotation(float rotation, boolean animated)` -> `void`

## `org.telegram.ui.ActionBar.BaseFragment`
- `allowFinishFragmentInsteadOfRemoveFromStack()` -> `boolean`
- `allowPresentFragment()` -> `boolean`
- `attachSheets(ActionBarLayout.LayoutContainer parentLayout)` -> `void`
- `clearSheets()` -> `void`
- `clearViews()` -> `void`
- `closeLastFragment()` -> `boolean`
- `closeSheet()` -> `boolean`
- `createActionBar(Context context)` -> `ActionBar`
- `createArticleViewer(boolean forceRecreate)` -> `ArticleViewer`
- `createOverlayStoryViewer()` -> `StoryViewer`
- `createView(Context context)` -> `View`
- `detachSheets()` -> `void`
- `dismissCurrentDialog()` -> `void`
- `dismissDialogOnPause(Dialog dialog)` -> `boolean`
- `drawEdgeNavigationBar()` -> `boolean`
- `dumpCanvas()` -> `void`
- `extendActionMode(Menu menu)` -> `boolean`
- `finishFragment()` -> `void`
- `finishFragment(boolean animated)` -> `boolean`
- `finishPreviewFragment()` -> `void`
- `getAccountInstance()` -> `AccountInstance`
- `getActionBar()` -> `ActionBar`
- `getArguments()` -> `Bundle`
- `getArticleViewer()` -> `ArticleViewer`
- `getBackButtonState()` -> `INavigationLayout.BackButtonState`
- `getBottomInset()` -> `int`
- `getBulletinDelegate()` -> `Bulletin.Delegate`
- `getBulletinLayoutContainer()` -> `FrameLayout`
- `getClassGuid()` -> `int`
- `getConnectionsManager()` -> `ConnectionsManager`
- `getContactsController()` -> `ContactsController`
- `getContext()` -> `Context`
- `getCurrentAccount()` -> `int`
- `getCustomSlideTransition(boolean topFragment, boolean backAnimation, float distanceToMove)` -> `Animator`
- `getDownloadController()` -> `DownloadController`
- `getEdgeToEdgeSupportMode()` -> `EdgeToEdgeSupportMode`
- `getFileLoader()` -> `FileLoader`
- `getFragmentBeginToShow()` -> `boolean`
- `getFragmentForAlert(int offset)` -> `BaseFragment`
- `getFragmentView()` -> `View`
- `getGiftAuctionsController()` -> `GiftAuctionController`
- `getInPassivePreviewMode()` -> `boolean`
- `getLastSheet()` -> `AttachedSheet`
- `getLastStoryViewer()` -> `StoryViewer`
- `getLayoutContainer()` -> `FrameLayout`
- `getLocationController()` -> `LocationController`
- `getMediaController()` -> `MediaController`
- `getMediaDataController()` -> `MediaDataController`
- `getNavigationBarColor()` -> `int`
- `getNotificationCenter()` -> `NotificationCenter`
- `getNotificationsController()` -> `NotificationsController`
- `getNotificationsSettings()` -> `SharedPreferences`
- `getOrCreateStoryViewer()` -> `StoryViewer`
- `getOrCreateStoryViewer(int account)` -> `StoryViewer`
- `getParentActivity()` -> `Activity`
- `getParentLayout()` -> `INavigationLayout`
- `getPreviewHeight()` -> `int`
- `getResourceProvider()` -> `Theme.ResourcesProvider`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `getThemedColor(int key)` -> `int`
- `getThemedDrawable(String key)` -> `Drawable`
- `getThemedPaint(String paintKey)` -> `Paint`
- `hideKeyboardOnShow()` -> `boolean`
- `movePreviewFragment(float dy)` -> `void`
- `needDelayOpenAnimation()` -> `boolean`
- `onActivityResultFragment(int requestCode, int resultCode, Intent data)` -> `void`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onBecomeFullyHidden()` -> `void`
- `onBecomeFullyVisible()` -> `void`
- `onBeginSlide()` -> `void`
- `onBottomSheetCreated()` -> `void`
- `onConfigurationChanged(android.content.res.Configuration newConfig)` -> `void`
- `onCustomTransitionAnimation(boolean isOpen, Runnable callback)` -> `AnimatorSet`
- `onDialogDismiss(Dialog dialog)` -> `void`
- `onFragmentClosed()` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onInsetsInternal(@NonNull View view, @NonNull WindowInsetsCompat windowInsets)` -> `WindowInsetsCompat`
- `onLowMemory()` -> `void`
- `onPanTransitionEnd()` -> `void`
- `onPanTransitionStart()` -> `void`
- `onPause()` -> `void`
- `onPreviewOpenAnimationEnd()` -> `void`
- `onRemoveFromParent()` -> `void`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `onSlideProgress(boolean isOpen, float progress)` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `onTransitionAnimationProgress(boolean isOpen, float progress)` -> `void`
- `onTransitionAnimationStart(boolean isOpen, boolean backward)` -> `void`
- `onUserLeaveHint()` -> `void`
- `onViewCreated(View view)` -> `void`
- `performCreateView(Context context)` -> `View`
- `prepareFragmentToSlide(boolean topFragment, boolean beginSlide)` -> `void`
- `presentFragment(BaseFragment fragment)` -> `boolean`
- `presentFragment(BaseFragment fragment, boolean removeLast)` -> `boolean`
- `presentFragment(BaseFragment fragment, boolean removeLast, boolean forceWithoutAnimation)` -> `boolean`
- `presentFragment(INavigationLayout.NavigationParams params)` -> `boolean`
- `presentFragmentAsPreview(BaseFragment fragment)` -> `boolean`
- `presentFragmentAsPreviewWithMenu(BaseFragment fragment, ActionBarPopupWindow.ActionBarPopupWindowLayout menu)` -> `boolean`
- `resetFragment()` -> `void`
- `restoreSelfArgs(Bundle args)` -> `void`
- `resumeDelayedFragmentAnimation()` -> `void`
- `setBulletinDelegate(Bulletin.Delegate bulletinDelegate)` -> `void`
- `setCurrentAccount(int account)` -> `void`
- `setFinishing(boolean finishing)` -> `void`
- `setFragmentPanTranslationOffset(int offset)` -> `void`
- `setFragmentView(View fragmentView)` -> `void`
- `setHasOwnBackground(boolean hasOwnBackground)` -> `void`
- `setInBubbleMode(boolean value)` -> `void`
- `setInMenuMode(boolean value)` -> `void`
- `setInPreviewMode(boolean value)` -> `void`
- `setKeyboardHeightFromParent(int keyboardHeight)` -> `void`
- `setNavigationBarColor(int color)` -> `void`
- `setParentActivityTitle(CharSequence title)` -> `void`
- `setParentFragment(BaseFragment fragment)` -> `void`
- `setParentLayout(INavigationLayout layout)` -> `void`
- `setPaused(boolean paused)` -> `void`
- `setPreviewDelegate(PreviewDelegate previewDelegate)` -> `void`
- `setPreviewOpenedProgress(float progress)` -> `void`
- `setPreviewReplaceProgress(float progress)` -> `void`
- `setRemovingFromStack(boolean b)` -> `void`
- `setResourceProvider(Theme.ResourcesProvider resourceProvider)` -> `void`
- `setTitleOverlayText(String title, int titleId, Runnable action)` -> `void`
- `setTitleOverlayTextIfActionBarAttached(String title, int titleId, Runnable action)` -> `void`
- `setVisibleDialog(Dialog dialog)` -> `void`
- `showAsSheet(BaseFragment fragment)` -> `INavigationLayout[]`
- `showAsSheet(BaseFragment fragment, BottomSheetParams params)` -> `INavigationLayout[]`
- `showDialog(Dialog dialog)` -> `Dialog`
- `showDialog(Dialog dialog, Dialog.OnDismissListener onDismissListener)` -> `Dialog`
- `showDialog(Dialog dialog, boolean allowInTransition, final Dialog.OnDismissListener onDismissListener)` -> `Dialog`
- `startActivityForResult(final Intent intent, final int requestCode)` -> `void`
- `updateSheetsVisibility()` -> `void`
- `whenFullyVisible(Runnable callback)` -> `void`

## `org.telegram.ui.ActionBar.BaseFragment$AttachedSheet`
- `dismiss(boolean tabs)` -> `default void`
- `setLastVisible(boolean lastVisible)` -> `default void`

## `org.telegram.ui.ActionBar.BottomSheet`
- `appendOpenAnimator(boolean opening, ArrayList<Animator> animators)` -> `void`
- `attachedToParent()` -> `boolean`
- `dismiss()` -> `void`
- `dismiss(boolean tabs)` -> `void`
- `dismissInternal()` -> `void`
- `dismissWithButtonClick(final int item)` -> `void`
- `dispatchKeyEvent(@NonNull KeyEvent event)` -> `boolean`
- `dispatchTouchEvent(@NonNull MotionEvent ev)` -> `boolean`
- `fixNavigationBar()` -> `void`
- `fixNavigationBar(int bgColor)` -> `void`
- `forceKeyboardOnDismiss()` -> `void`
- `getBackDrawable()` -> `Drawable`
- `getBackgroundPaddingLeft()` -> `int`
- `getBackgroundPaddingTop()` -> `int`
- `getBottomInset()` -> `int`
- `getBottomSheetWidth(boolean isPortrait, int width,int height)` -> `int`
- `getBulletinFactory()` -> `BulletinFactory`
- `getContainer()` -> `ContainerView`
- `getContainerView()` -> `ViewGroup`
- `getContainerViewHeight()` -> `int`
- `getCurrentAccount()` -> `int`
- `getItemViews()` -> `ArrayList<BottomSheetCell>`
- `getLeftInset()` -> `int`
- `getNavigationBarColor(int color)` -> `int`
- `getResourcesProvider()` -> `Theme.ResourcesProvider`
- `getRightInset()` -> `int`
- `getSheetAnimationType()` -> `int`
- `getSheetContainer()` -> `ViewGroup`
- `getStatusBarHeight()` -> `int`
- `getSystemBottomInset()` -> `int`
- `getTag()` -> `int`
- `getTargetOpenTranslationY()` -> `int`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `getThemedColor(int key)` -> `int`
- `getTitleView()` -> `TextView`
- `getWindowView()` -> `View`
- `isAttachedLightStatusBar()` -> `boolean`
- `isDismissed()` -> `boolean`
- `isFocusable()` -> `boolean`
- `isFullyVisible()` -> `boolean`
- `isKeyboardVisible()` -> `boolean`
- `isShown()` -> `boolean`
- `isTouchOutside(float x, float y)` -> `boolean`
- `mainContainerDispatchDraw(Canvas canvas)` -> `void`
- `makeAttached(BaseFragment fragment)` -> `void`
- `obtainWindowVisibilityController()` -> `WindowVisibilityManager.Controller`
- `onApplyWindowInsetsToRoot(@NonNull View v, @NonNull WindowInsetsCompat insets)` -> `WindowInsetsCompat`
- `onAttachedBackPressed()` -> `boolean`
- `onBackPressed()` -> `void`
- `onConfigurationChanged(android.content.res.Configuration newConfig)` -> `void`
- `onContainerDraw(Canvas canvas)` -> `void`
- `onContainerLayout(int l, int t, int r, int b)` -> `void`
- `onContainerTouchEvent(MotionEvent event)` -> `boolean`
- `onContainerTranslationYChanged(float translationY)` -> `void`
- `onContainerViewTranslation()` -> `void`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `onCustomCloseAnimation()` -> `boolean`
- `onCustomLayout(View view, int left, int top, int right, int bottom)` -> `boolean`
- `onCustomMeasure(View view, int width, int height)` -> `boolean`
- `onCustomOpenAnimation()` -> `boolean`
- `onDismissAnimationStart()` -> `void`
- `onDismissWithTouchOutside()` -> `void`
- `onInsetsChanged()` -> `void`
- `onOpenAnimationEnd()` -> `void`
- `onScrollUp(float translationY)` -> `boolean`
- `onScrollUpBegin(float translationY)` -> `void`
- `onScrollUpEnd(float translationY)` -> `void`
- `onSmoothContainerViewLayout(float ty)` -> `void`
- `onStart()` -> `void`
- `onSwipeStarts()` -> `void`
- `release()` -> `void`
- `setAllowNestedScroll(boolean value)` -> `void`
- `setApplyBottomPadding(boolean value)` -> `void`
- `setApplyTopPadding(boolean value)` -> `void`
- `setBackgroundColor(int color)` -> `void`
- `setCalcMandatoryInsets(boolean value)` -> `void`
- `setCanDismissWithSwipe(boolean value)` -> `void`
- `setCanDismissWithTouchOutside(boolean value)` -> `void`
- `setCurrentPanTranslationY(float currentPanTranslationY)` -> `void`
- `setCustomView(View view)` -> `void`
- `setDelegate(BottomSheetDelegateInterface bottomSheetDelegate)` -> `void`
- `setDimBehind(boolean value)` -> `BottomSheet`
- `setDimBehindAlpha(int value)` -> `void`
- `setDisableScroll(boolean b)` -> `void`
- `setFocusable(boolean value)` -> `void`
- `setHideSystemVerticalInsets(boolean hideSystemVerticalInsets)` -> `void`
- `setImageReceiverNumLevel(int playingImages, int onShowing)` -> `void`
- `setItemColor(int item, int color, int icon)` -> `void`
- `setItemText(int item, CharSequence text)` -> `void`
- `setItems(CharSequence[] i, int[] icons, final OnClickListener listener)` -> `void`
- `setKeyboardHeightFromParent(int keyboardHeight)` -> `void`
- `setOnDismissListener(Runnable onDismiss)` -> `void`
- `setOnDismissListener(@Nullable OnDismissListener listener)` -> `void`
- `setOnHideListener(OnDismissListener listener)` -> `void`
- `setOpenNoDelay(boolean openNoDelay)` -> `void`
- `setOverlayNavBarColor(int color)` -> `void`
- `setShowWithoutAnimation(boolean value)` -> `void`
- `setTitle(CharSequence value)` -> `void`
- `setTitle(CharSequence value, boolean big)` -> `void`
- `setTitleColor(int color)` -> `void`
- `setUseLightStatusBar(boolean value)` -> `void`
- `show()` -> `void`
- `showDialog(Dialog dialog)` -> `boolean`
- `skipDismissAnimation()` -> `void`
- `smoothContainerViewLayout()` -> `void`
- `transitionFromRight(boolean transitionFromRight)` -> `void`

## `org.telegram.ui.ActionBar.BottomSheet$BottomSheetCell`
- `getImageView()` -> `ImageView`
- `getTextView()` -> `AnimatedEmojiSpan.TextViewEmojis`
- `getThemedColor(int key)` -> `int`
- `isChecked()` -> `boolean`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked)` -> `void`
- `setGravity(int gravity)` -> `void`
- `setIconColor(int color)` -> `void`
- `setTextAndIcon(CharSequence text, int icon)` -> `void`
- `setTextAndIcon(CharSequence text, Drawable icon)` -> `void`
- `setTextAndIcon(CharSequence text, int icon, Drawable drawable, boolean bigTitle)` -> `void`
- `setTextColor(int color)` -> `void`

## `org.telegram.ui.ActionBar.BottomSheet$BottomSheetDelegate`
- `onOpenAnimationEnd()` -> `void`
- `onOpenAnimationStart()` -> `void`

## `org.telegram.ui.ActionBar.BottomSheet$Builder`
- `create()` -> `BottomSheet`
- `getCustomView()` -> `View`
- `getDismissRunnable()` -> `Runnable`
- `selectedPos(Integer pos)` -> `Builder`
- `setApplyBottomPadding(boolean value)` -> `Builder`
- `setApplyTopPadding(boolean value)` -> `Builder`
- `setCellType(int cellType)` -> `Builder`
- `setCustomView(View view)` -> `Builder`
- `setCustomView(View view, int gravity)` -> `Builder`
- `setDelegate(BottomSheetDelegate delegate)` -> `Builder`
- `setDimBehind(boolean value)` -> `BottomSheet`
- `setItems(CharSequence[] items, final OnClickListener onClickListener)` -> `Builder`
- `setItems(CharSequence[] items, int[] icons, final OnClickListener onClickListener)` -> `Builder`
- `setOnPreDismissListener(OnDismissListener onDismissListener)` -> `Builder`
- `setTag(int tag)` -> `Builder`
- `setTitle(CharSequence title)` -> `Builder`
- `setTitle(CharSequence title, boolean big)` -> `Builder`
- `setTitleMultipleLines(boolean allowMultipleLines)` -> `Builder`
- `setUseFullWidth(boolean value)` -> `BottomSheet`
- `setUseFullscreen(boolean value)` -> `BottomSheet`
- `setUseHardwareLayer(boolean value)` -> `Builder`
- `show()` -> `BottomSheet`

## `org.telegram.ui.ActionBar.BottomSheet$ContainerView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `drawNavigationBar(Canvas canvas, float alpha)` -> `void`
- `getNestedScrollAxes()` -> `int`
- `hasOverlappingRendering()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent event)` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onNestedFling(@NonNull View target, float velocityX, float velocityY, boolean consumed)` -> `boolean`
- `onNestedPreFling(@NonNull View target, float velocityX, float velocityY)` -> `boolean`
- `onNestedPreScroll(@NonNull View target, int dx, int dy, @NonNull int[] consumed)` -> `void`
- `onNestedScroll(@NonNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed)` -> `void`
- `onNestedScrollAccepted(@NonNull View child, @NonNull View target, int nestedScrollAxes)` -> `void`
- `onStartNestedScroll(@NonNull View child, @NonNull View target, int nestedScrollAxes)` -> `boolean`
- `onStopNestedScroll(@NonNull View target)` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `requestDisallowInterceptTouchEvent(boolean disallowIntercept)` -> `void`

## `org.telegram.ui.ActionBar.BottomSheet$SheetBackDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getAlpha()` -> `int`
- `getOpacity()` -> `int`
- `onBoundsChange(@NonNull Rect bounds)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setBackgroundInsets(int l, int t, int r, int b)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.ActionBar.BottomSheetTabDialog`
- `attach()` -> `void`
- `detach()` -> `void`
- `dismiss()` -> `void`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `updateNavigationBarColor()` -> `void`

## `org.telegram.ui.ActionBar.BottomSheetTabDialog$WindowView`
- `drawInto(Canvas canvas, RectF finalRect, float progress, RectF clipRect, float alpha, boolean opening)` -> `float`
- `getRect()` -> `RectF`
- `setDrawingFromOverlay(boolean value)` -> `void`

## `org.telegram.ui.ActionBar.BottomSheetTabs`
- `click()` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchHoverEvent(MotionEvent event)` -> `boolean`
- `findTabDrawable(WebTabData tab)` -> `TabDrawable`
- `getBackgroundPaint()` -> `Paint`
- `getExpandedHeight()` -> `int`
- `getHeight(boolean animated)` -> `int`
- `getTabBounds(RectF rect, float position)` -> `void`
- `getTabDrawables()` -> `ArrayList<TabDrawable>`
- `getTabDrawables(int currentAccount)` -> `ArrayList<TabDrawable>`
- `getTabs()` -> `ArrayList<WebTabData>`
- `getTabs(int currentAccount)` -> `ArrayList<WebTabData>`
- `isExpanded()` -> `boolean`
- `listen(Runnable invalidate, Runnable relayout)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `openTab(WebTabData tab)` -> `void`
- `pushTab(WebTabData tab)` -> `TabDrawable`
- `setCurrentAccount(int account)` -> `void`
- `setNavigationBarColor(int color)` -> `void`
- `setNavigationBarColor(int color, boolean animated)` -> `void`
- `setupTab(TabDrawable drawable)` -> `void`
- `stopListening(Runnable invalidate, Runnable relayout)` -> `void`
- `touchEvent(int action, float x, float y)` -> `boolean`
- `tryRemoveTabWith(ArticleViewer articleViewer)` -> `boolean`
- `tryReopenTab(WebViewRequestProps props)` -> `WebTabData`
- `tryReopenTab(String url)` -> `WebTabData`
- `tryReopenTab(TLRPC.WebPage webpage)` -> `WebTabData`
- `tryReopenTab(MessageObject messageObject)` -> `WebTabData`
- `updateCurrentAccount()` -> `void`
- `updateVisibility(boolean animated)` -> `void`
- `static urlWithoutFragment(String url)` -> `String`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.ActionBar.BottomSheetTabs$ClipTools`
- `clip(Canvas canvas, boolean withShadow, boolean isKeyboardVisible, int width, int height, float visible)` -> `void`

## `org.telegram.ui.ActionBar.BottomSheetTabs$TabDrawable`
- `draw(Canvas canvas, RectF bounds, float r, float alpha, float contentAlpha)` -> `void`
- `getAlpha()` -> `float`
- `getPosition()` -> `float`
- `setBackgroundColor(int color, boolean isDark)` -> `void`
- `setExpandProgress(float expandProgress)` -> `void`
- `setOnCloseClick(Runnable listener)` -> `void`
- `setOnExpandClick(Runnable listener)` -> `void`
- `setOverrideTitle(CharSequence title)` -> `void`

## `org.telegram.ui.ActionBar.BottomSheetTabs$TabsAccessibilityHelper`
- `getVirtualViewAt(float x, float y)` -> `int`
- `getVisibleVirtualViews(List<Integer> list)` -> `void`
- `onPerformActionForVirtualView(int id, int action, @Nullable Bundle args)` -> `boolean`
- `onPopulateNodeForVirtualView(int id, @NonNull AccessibilityNodeInfoCompat info)` -> `void`

## `org.telegram.ui.ActionBar.BottomSheetTabs$WebTabData`
- `destroy()` -> `void`
- `getBotId()` -> `long`
- `getTitle()` -> `String`

## `org.telegram.ui.ActionBar.BottomSheetTabsOverlay`
- `closeTabsView()` -> `void`
- `computeScroll()` -> `void`
- `dismissSheet(Sheet sheet)` -> `boolean`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `dispatchHoverEvent(MotionEvent event)` -> `boolean`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `getScrollMax()` -> `float`
- `getScrollMax(boolean animated)` -> `float`
- `getScrollMin()` -> `float`
- `getScrollMin(boolean animated)` -> `float`
- `getScrollOffset()` -> `float`
- `getScrollRange()` -> `float`
- `getScrollRange(boolean animated)` -> `float`
- `getScrollWindow()` -> `float`
- `getScrollWindow(boolean animated)` -> `float`
- `isOpened()` -> `boolean`
- `onBackPressed()` -> `boolean`
- `openSheet(Sheet sheet, BottomSheetTabs.WebTabData tab, Runnable whenOpened)` -> `boolean`
- `openTabsView()` -> `void`
- `static renderHardwareViewToBitmap(View view, float offsetY, Utilities.Callback<Bitmap> whenBitmapDone)` -> `void`
- `static renderNodeToBitmap(RenderNode renderNode, Utilities.Callback<Bitmap> whenBitmapDone)` -> `void`
- `setScrollOffset(float offset)` -> `void`
- `setSlowerDismiss(boolean slowerDismiss)` -> `void`
- `setTabsView(BottomSheetTabs tabsView)` -> `void`
- `stopAnimations()` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.ActionBar.BottomSheetTabsOverlay$OverlayAccessibilityHelper`
- `getVirtualViewAt(float x, float y)` -> `int`
- `getVisibleVirtualViews(List<Integer> list)` -> `void`
- `onPerformActionForVirtualView(int id, int action, @Nullable Bundle args)` -> `boolean`
- `onPopulateNodeForVirtualView(int id, @NonNull AccessibilityNodeInfoCompat info)` -> `void`

## `org.telegram.ui.ActionBar.BottomSheetTabsOverlay$Sheet`
- `hadDialog()` -> `default boolean`
- `setLastVisible(boolean lastVisible)` -> `default void`

## `org.telegram.ui.ActionBar.BottomSheetTabsOverlay$TabPreview`
- `animateDismiss(float dismissTo)` -> `void`
- `draw(Canvas canvas, RectF bounds, boolean simple, float alpha, float expandProgress, float openingProgress, float contentAlpha)` -> `void`
- `setPressed(boolean pressed)` -> `void`

## `org.telegram.ui.ActionBar.DarkAlertDialog`
- `getThemedColor(int key)` -> `int`

## `org.telegram.ui.ActionBar.DrawerLayoutContainer`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `getInternalNavbarPaint()` -> `Paint`
- `hasOverlappingRendering()` -> `boolean`
- `isDrawCurrentPreviewFragmentAbove()` -> `boolean`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `setActionBarLayout(ActionBarLayout actionBarLayout)` -> `void`
- `setInternalNavigationBarColor(int color)` -> `void`
- `setParentActionBarLayout(INavigationLayout layout)` -> `void`

## `org.telegram.ui.ActionBar.EmojiThemes`
- `static createChatThemesDefault(int currentAccount)` -> `EmojiThemes`
- `static createChatThemesRemoved(int currentAccount)` -> `EmojiThemes`
- `createColors(int currentAccount, int index)` -> `SparseIntArray`
- `static createHomePreviewTheme(int currentAccount)` -> `EmojiThemes`
- `static createHomeQrTheme(int currentAccount)` -> `EmojiThemes`
- `static createPreviewCustom(int currentAccount)` -> `EmojiThemes`
- `static createPreviewFullTheme(int currentAccount, TLRPC.TL_theme tl_theme)` -> `EmojiThemes`
- `static fillTlTheme(Theme.ThemeInfo themeInfo)` -> `void`
- `getAccentId(int themeIndex)` -> `int`
- `static getDefaultThemeInfo(boolean isDark)` -> `Theme.ThemeInfo`
- `getEmojiAnimatedSticker()` -> `TLRPC.Document`
- `getEmoticon()` -> `String`
- `getEmoticonOrSlug()` -> `String`
- `getITheme(int index)` -> `ITheme`
- `getPreviewColors(int currentAccount, int index)` -> `SparseIntArray`
- `static getPreviewColors(Theme.ThemeInfo themeInfo)` -> `SparseIntArray`
- `getSettingsIndex(int index)` -> `int`
- `getThemeGift()` -> `TL_stars.TL_starGiftUnique`
- `getThemeId(int index)` -> `long`
- `getThemeInfo(int index)` -> `Theme.ThemeInfo`
- `getThemeItem(int index)` -> `ThemeItem`
- `getThemeKey()` -> `ThemeKey`
- `getTlTheme(int index)` -> `TLRPC.TL_theme`
- `getWallpaper(int index)` -> `TLRPC.WallPaper`
- `getWallpaperLink(int index)` -> `String`
- `initColors()` -> `void`
- `preloadWallpaper()` -> `void`

## `org.telegram.ui.ActionBar.EmojiThemes$ThemeItem`
- `getThemeId()` -> `long`
- `getThemeSettings(int settingsIndex)` -> `TLRPC.ThemeSettings`
- `getThemeWallPaper(int settingsIndex)` -> `TLRPC.WallPaper`

## `org.telegram.ui.ActionBar.FloatingActionMode`
- `finish()` -> `void`
- `getCustomView()` -> `View`
- `getMenu()` -> `Menu`
- `getMenuInflater()` -> `MenuInflater`
- `getSubtitle()` -> `CharSequence`
- `getTitle()` -> `CharSequence`
- `hide(long duration)` -> `void`
- `invalidate()` -> `void`
- `invalidateContentRect()` -> `void`
- `onWindowFocusChanged(boolean hasWindowFocus)` -> `void`
- `setCustomView(View view)` -> `void`
- `setOutsideTouchable(boolean outsideTouchable, PopupWindow.OnDismissListener onDismiss)` -> `void`
- `setSubtitle(CharSequence subtitle)` -> `void`
- `setSubtitle(int resId)` -> `void`
- `setTitle(CharSequence title)` -> `void`
- `setTitle(int resId)` -> `void`
- `updateViewLocationInWindow()` -> `void`

## `org.telegram.ui.ActionBar.FloatingActionMode$FloatingToolbarVisibilityHelper`
- `activate()` -> `void`
- `deactivate()` -> `void`
- `setHideRequested(boolean hide)` -> `void`
- `setMoving(boolean moving)` -> `void`
- `setOutOfBounds(boolean outOfBounds)` -> `void`
- `setWindowFocused(boolean windowFocused)` -> `void`
- `updateToolbarVisibility()` -> `void`

## `org.telegram.ui.ActionBar.FloatingToolbar`
- `dismiss()` -> `void`
- `hide()` -> `void`
- `setContentRect(Rect rect)` -> `FloatingToolbar`
- `setMenu(Menu menu)` -> `FloatingToolbar`
- `setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItemClickListener)` -> `FloatingToolbar`
- `setOnPremiumLockClick(Runnable listener)` -> `void`
- `setOutsideTouchable(boolean outsideTouchable, PopupWindow.OnDismissListener onDismiss)` -> `void`
- `setQuoteShowVisible(Utilities.Callback0Return<Boolean> callback)` -> `void`
- `setSuggestedWidth(int suggestedWidth)` -> `FloatingToolbar`
- `show()` -> `FloatingToolbar`
- `updateLayout()` -> `FloatingToolbar`

## `org.telegram.ui.ActionBar.FloatingToolbar$FloatingToolbarPopup`
- `dismiss()` -> `void`
- `hide()` -> `void`
- `layoutMainPanelItems(List<MenuItem> menuItems, final int toolbarWidth)` -> `List<MenuItem>`
- `layoutMenuItems(List<MenuItem> menuItems, MenuItem.OnMenuItemClickListener menuItemClickListener, int suggestedWidth)` -> `void`
- `layoutStyleItems(List<Integer> buttons)` -> `void`
- `setOutsideTouchable(boolean outsideTouchable, PopupWindow.OnDismissListener onDismiss)` -> `boolean`
- `show(Rect contentRectOnScreen)` -> `void`
- `updateCoordinates(Rect contentRectOnScreen)` -> `void`

## `org.telegram.ui.ActionBar.FloatingToolbar$FloatingToolbarPopup$LogAccelerateInterpolator`
- `getInterpolation(float t)` -> `float`

## `org.telegram.ui.ActionBar.FloatingToolbar$FloatingToolbarPopup$OverflowPanel`
- `awakenScrollBars()` -> `boolean`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`

## `org.telegram.ui.ActionBar.FloatingToolbar$FloatingToolbarPopup$OverflowPanelViewHelper`
- `calculateWidth(MenuItem menuItem)` -> `int`
- `getView(MenuItem menuItem, int minimumWidth, View convertView)` -> `View`

## `org.telegram.ui.ActionBar.INavigationLayout`
- `animateThemedValues(Theme.ThemeInfo theme, int accentId, boolean nightTheme, boolean instant)` -> `default void`
- `animateThemedValues(Theme.ThemeInfo theme, int accentId, boolean nightTheme, boolean instant, Runnable onDone)` -> `default void`
- `bringToFront(int i)` -> `default void`
- `closeLastFragment()` -> `default void`
- `closeLastFragment(boolean animated)` -> `default void`
- `dismissDialogs()` -> `default void`
- `drawHeaderShadow(Canvas canvas, int y)` -> `default void`
- `getBackgroundFragment()` -> `default BaseFragment`
- `getBottomSheet()` -> `default BottomSheet`
- `getBottomSheetTabs()` -> `default BottomSheetTabs`
- `getBottomTabsHeight(boolean animated)` -> `default int`
- `getLastFragment()` -> `default BaseFragment`
- `getParentActivity()` -> `default Activity`
- `getSafeLastFragment()` -> `default BaseFragment`
- `getView()` -> `default ViewGroup`
- `getWindow()` -> `default Window`
- `init(List<BaseFragment> stack)` -> `default void`
- `static newLayout(Context context, boolean main)` -> `INavigationLayout`
- `static newLayout(Context context, boolean main, Supplier<BottomSheet> supplier)` -> `INavigationLayout`
- `presentFragment(BaseFragment fragment)` -> `default boolean`
- `presentFragment(BaseFragment fragment, boolean removeLast)` -> `default boolean`
- `presentFragment(BaseFragment fragment, boolean removeLast, boolean forceWithoutAnimation, boolean check, boolean preview)` -> `default boolean`
- `presentFragment(BaseFragment fragment, boolean removeLast, boolean forceWithoutAnimation, boolean check, boolean preview, ActionBarPopupWindow.ActionBarPopupWindowLayout menuView)` -> `default boolean`
- `presentFragmentAsPreview(BaseFragment fragment)` -> `default boolean`
- `presentFragmentAsPreviewWithMenu(BaseFragment fragment, ActionBarPopupWindow.ActionBarPopupWindowLayout menuView)` -> `default boolean`
- `rebuildAllFragmentViews(boolean last, boolean showLastAfter)` -> `default void`
- `rebuildFragments(int flags)` -> `default void`
- `rebuildLogout()` -> `default void`
- `setBackgroundView(View backgroundView)` -> `default void`
- `setFragmentStack(List<BaseFragment> stack)` -> `default void`
- `setUseAlphaAnimations(boolean useAlphaAnimations)` -> `default void`
- `showLastFragment()` -> `default void`

## `org.telegram.ui.ActionBar.INavigationLayout$INavigationLayoutDelegate`
- `needAddFragmentToStack(BaseFragment fragment, INavigationLayout layout)` -> `default boolean`
- `needCloseLastFragment(INavigationLayout layout)` -> `default boolean`
- `needPresentFragment(INavigationLayout layout, NavigationParams params)` -> `default boolean`
- `needPresentFragment(BaseFragment fragment, boolean removeLast, boolean forceWithoutAnimation, INavigationLayout layout)` -> `default boolean`
- `onMeasureOverride(int[] measureSpec)` -> `default void`
- `onPreIme()` -> `default boolean`
- `onRebuildAllFragments(INavigationLayout layout, boolean last)` -> `default void`
- `onThemeProgress(float progress)` -> `default void`

## `org.telegram.ui.ActionBar.INavigationLayout$NavigationParams`
- `forceRightLayout()` -> `NavigationParams`
- `setCheckPresentFromDelegate(boolean checkPresentFromDelegate)` -> `NavigationParams`
- `setMenuView(ActionBarPopupWindow.ActionBarPopupWindowLayout menuView)` -> `NavigationParams`
- `setNeedDelayWithoutAnimation(boolean needDelayWithoutAnimation)` -> `NavigationParams`
- `setNoAnimation(boolean noAnimation)` -> `NavigationParams`
- `setPreview(boolean preview)` -> `NavigationParams`
- `setRemoveLast(boolean removeLast)` -> `NavigationParams`

## `org.telegram.ui.ActionBar.INavigationLayout$StartColorsProvider`
- `getColor(int key)` -> `int`
- `getCurrentColor(int key)` -> `int`

## `org.telegram.ui.ActionBar.MenuDrawable`
- `draw(Canvas canvas)` -> `void`
- `getCurrentRotation()` -> `float`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setBackColor(int backColor)` -> `void`
- `setColorFilter(ColorFilter cf)` -> `void`
- `setIconColor(int iconColor)` -> `void`
- `setMiniIcon(boolean miniIcon)` -> `void`
- `setRotateToBack(boolean value)` -> `void`
- `setRotation(float rotation, boolean animated)` -> `void`
- `setRoundCap()` -> `void`
- `setType(int value, boolean animated)` -> `void`
- `setUpdateDownloadProgress(float value, boolean animated)` -> `void`

## `org.telegram.ui.ActionBar.MessageDrawable`
- `applyMatrixScale()` -> `void`
- `draw(Canvas canvas)` -> `void`
- `draw(Canvas canvas, Paint paintToUse)` -> `void`
- `drawCached(Canvas canvas, PathDrawParams patchDrawCacheParams, Paint paintToUse)` -> `void`
- `drawCached(Canvas canvas, PathDrawParams patchDrawCacheParams)` -> `void`
- `finalize()` -> `void`
- `getBackgroundDrawable()` -> `Drawable`
- `getColor(int key)` -> `int`
- `getCurrentColor(int key)` -> `int`
- `getGradientShader()` -> `Shader`
- `getMatrix()` -> `Matrix`
- `getMotionBackgroundDrawable()` -> `MotionBackgroundDrawable`
- `getOpacity()` -> `int`
- `getPaint()` -> `Paint`
- `getPath()` -> `Path`
- `getShadowDrawable()` -> `Drawable`
- `getShadowDrawables()` -> `Drawable[]`
- `getTopY()` -> `int`
- `getTransitionDrawable(int color)` -> `Drawable`
- `makePath()` -> `Path`
- `makePath(PathDrawParams pathDrawCacheParams)` -> `Path`
- `setAlpha(int alpha)` -> `void`
- `setBotButtonsBottom(boolean botButtonsBottom)` -> `void`
- `setBounds(int left, int top, int right, int bottom)` -> `void`
- `setColorFilter(int color, PorterDuff.Mode mode)` -> `void`
- `setColorFilter(ColorFilter colorFilter)` -> `void`
- `setDrawFullBubble(boolean drawFullBuble)` -> `void`
- `setResourceProvider(Theme.ResourcesProvider resourcesProvider)` -> `void`
- `setRoundRadius(int radius)` -> `void`
- `setRoundingRadius(float rounding)` -> `void`
- `setTop(int top, int backgroundWidth, int backgroundHeight, boolean topNear, boolean bottomNear)` -> `void`
- `setTop(int top, int backgroundWidth, int backgroundHeight, int heightOffset, int blurredViewTopOffset, int blurredViewBottomOffset, boolean topNear, boolean bottomNear)` -> `void`
- `setTopBottomNear(boolean topNear, boolean bottomNear)` -> `void`

## `org.telegram.ui.ActionBar.MessageDrawable$PathDrawParams`
- `getPath()` -> `Path`
- `invalidatePath(Rect bounds, boolean drawFullBottom, boolean drawFullTop)` -> `boolean`

## `org.telegram.ui.ActionBar.OKLCH`
- `static adapt(int baseColor, int hueColor)` -> `int`
- `static adapt(int color, double c, double l)` -> `int`
- `static oklab2oklch(double[] lab)` -> `double[]`
- `static oklab2xyz(double[] lab)` -> `double[]`
- `static oklch2oklab(double[] lch)` -> `double[]`
- `static oklch2rgb(double[] lch)` -> `double[]`
- `static rgb(int color)` -> `double[]`
- `static rgb(double[] color)` -> `int`
- `static rgb2oklch(double[] rgb)` -> `double[]`
- `static rgb2srgbLinear(double[] rgb)` -> `double[]`
- `static rgbLinear2xyz(double[] rgb)` -> `double[]`
- `static srgbLinear2rgb(double[] rgbLinear)` -> `double[]`
- `static xyz2oklab(double[] xyz)` -> `double[]`
- `static xyz2rgbLinear(double[] xyz)` -> `double[]`

## `org.telegram.ui.ActionBar.RoundVideoShadow`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.ActionBar.SimpleTextView`
- `copyScrolling(SimpleTextView textView)` -> `void`
- `createLayout(int width)` -> `boolean`
- `getBackground()` -> `Drawable`
- `getExactWidth()` -> `float`
- `getExactWidthIncludeDrawables()` -> `float`
- `getFullAlpha()` -> `float`
- `getLayout()` -> `Layout`
- `getLayoutX()` -> `float`
- `getLayoutY()` -> `float`
- `getLeftDrawable()` -> `Drawable`
- `getLineCount()` -> `int`
- `getMaxTextWidth()` -> `int`
- `getPaint()` -> `TextPaint`
- `getRightDrawable()` -> `Drawable`
- `getRightDrawable2()` -> `Drawable`
- `getRightDrawableOutside()` -> `boolean`
- `getRightDrawableWidth()` -> `int`
- `getRightDrawableX()` -> `int`
- `getRightDrawableY()` -> `int`
- `getSideDrawablesSize()` -> `int`
- `getText()` -> `CharSequence`
- `getTextColor()` -> `int`
- `getTextHeight()` -> `int`
- `getTextPaint()` -> `TextPaint`
- `getTextStartX()` -> `int`
- `getTextStartY()` -> `int`
- `getTextWidth()` -> `int`
- `invalidateDrawable(Drawable who)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `replaceTextWithDrawable(Drawable drawable, String replacedText)` -> `void`
- `resetScrolling()` -> `void`
- `setAlignment(Layout.Alignment alignment)` -> `void`
- `setBackgroundDrawable(Drawable background)` -> `void`
- `setBuildFullLayout(boolean value)` -> `void`
- `setCanHideRightDrawable(boolean b)` -> `void`
- `setDrawablePadding(int value)` -> `void`
- `setEllipsizeByGradient(boolean value)` -> `void`
- `setEllipsizeByGradient(int value)` -> `void`
- `setEllipsizeByGradient(boolean value, Boolean forceLeft)` -> `void`
- `setEllipsizeByGradient(int value, Boolean forceLeft)` -> `void`
- `setEmojiCacheType(int cacheType)` -> `void`
- `setEmojiColor(int color)` -> `void`
- `setFullAlpha(float value)` -> `void`
- `setFullLayoutAdditionalWidth(int fullLayoutAdditionalWidth, int fullLayoutLeftOffset)` -> `void`
- `setFullTextMaxLines(int fullTextMaxLines)` -> `void`
- `setGravity(int value)` -> `void`
- `setLeftDrawable(int resId)` -> `void`
- `setLeftDrawable(Drawable drawable)` -> `void`
- `setLeftDrawableOutside(boolean outside)` -> `void`
- `setLeftDrawableTopPadding(int value)` -> `void`
- `setLinkTextColor(int color)` -> `void`
- `setMaxLines(int value)` -> `void`
- `setMinWidth(int width)` -> `void`
- `setMinusWidth(int value)` -> `void`
- `setRightDrawable(int resId)` -> `void`
- `setRightDrawable(Drawable drawable)` -> `boolean`
- `setRightDrawable2(Drawable drawable)` -> `boolean`
- `setRightDrawableInside(boolean inside)` -> `void`
- `setRightDrawableOnClick(OnClickListener onClickListener)` -> `void`
- `setRightDrawableOutside(boolean outside)` -> `void`
- `setRightDrawableScale(float scale)` -> `void`
- `setRightDrawableTopPadding(int value)` -> `void`
- `setRightPadding(int padding)` -> `void`
- `setScrollNonFitText(boolean value)` -> `void`
- `setSideDrawablesColor(int color)` -> `void`
- `setText(CharSequence value)` -> `boolean`
- `setText(CharSequence value, boolean force)` -> `boolean`
- `setTextColor(int color)` -> `void`
- `setTextSize(int sizeInDp)` -> `void`
- `setTextSizePx(int newSize)` -> `void`
- `setTypeface(Typeface typeface)` -> `void`
- `setWidthWrapContent(boolean value)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.ActionBar.TextViewWithLoading`
- `isLoading()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `setLoading(boolean loading, boolean animated)` -> `void`
- `setTextColor(int color)` -> `void`

## `org.telegram.ui.ActionBar.Theme`
- `static adaptHSV(int color, float sat, float val)` -> `int`
- `static adaptHue(int color, int hueFromColor)` -> `int`
- `static applyChatMessageSelectedBackgroundColor()` -> `void`
- `static applyChatMessageSelectedBackgroundColor(Drawable wallpaperOverride)` -> `void`
- `static applyChatMessageSelectedBackgroundColor(Drawable wallpaperOverride, Drawable currentWallpaper)` -> `void`
- `static applyChatServiceMessageColor()` -> `void`
- `static applyChatServiceMessageColor(int[] custom, Drawable wallpaperOverride)` -> `void`
- `static applyChatServiceMessageColor(int[] custom, Drawable wallpaperOverride, Drawable currentWallpaper)` -> `void`
- `static applyChatTheme(boolean fontsOnly, boolean bg)` -> `void`
- `static applyCommonTheme()` -> `void`
- `static applyDayNightThemeMaybe(boolean night)` -> `void`
- `static applyDefaultShadow(Paint paint)` -> `void`
- `static applyDialogsTheme()` -> `void`
- `static applyPreviousTheme()` -> `void`
- `static applyProfileTheme()` -> `void`
- `static applyServiceShaderMatrix(int w, int h, float translationX, float translationY)` -> `void`
- `static applyServiceShaderMatrix(Bitmap bitmap, BitmapShader shader, Matrix matrix, int w, int h, float translationX, float translationY)` -> `void`
- `static applyServiceShaderMatrixForView(View view, View background)` -> `void`
- `static applyServiceShaderMatrixForView(View view, View background, ResourcesProvider resourcesProvider)` -> `void`
- `static applyTheme(ThemeInfo themeInfo)` -> `void`
- `static applyTheme(ThemeInfo themeInfo, boolean nightTheme)` -> `void`
- `static applyTheme(ThemeInfo themeInfo, boolean save, boolean nightTheme)` -> `void`
- `static applyThemeFile(File file, String themeName, TLRPC.TL_theme theme, boolean temporary)` -> `ThemeInfo`
- `static applyThemeInBackground(ThemeInfo themeInfo, boolean nightTheme, Runnable onDone)` -> `void`
- `static applyThemeTemporary(ThemeInfo themeInfo, boolean accent)` -> `void`
- `static blendOver(int A, int B)` -> `int`
- `static capAlpha(int color, float maxAlpha)` -> `int`
- `static changeColorAccent(int themeBaseAccent, int accent, int color, boolean isDark)` -> `int`
- `static changeColorAccent(int themeBaseAccent, int accent, int color, boolean isDark, int fallback)` -> `int`
- `static changeColorAccent(ThemeInfo themeInfo, int accent, int color)` -> `int`
- `static changeColorAccent(int color)` -> `int`
- `static changeColorAccent(float[] baseHsv, float[] accentHsv, int color, boolean isDarkTheme, int fallback)` -> `int`
- `static clearPreviousTheme()` -> `void`
- `static createBackgroundDrawable(ThemeInfo currentTheme, SparseIntArray currentColors, String wallpaperLink, int prevoiusPhase, boolean local)` -> `BackgroundDrawableSettings`
- `static createBackgroundDrawable(ThemeInfo currentTheme, OverrideWallpaperInfo overrideWallpaper, SparseIntArray currentColors, File wallpaperFile, String themedWallpaperLink, int themedWallpaperFileOffset, int intensity, int previousPhase, boolean defaultTheme, boolean hasPreviousTheme, boolean isApplyingAccent, boolean wallpaperMotion, TLRPC.Document wallpaperDocument, boolean local)` -> `BackgroundDrawableSettings`
- `static createChatResources(Context context, boolean fontsOnly)` -> `void`
- `static createCircleDrawable(int size, int color)` -> `ShapeDrawable`
- `static createCircleDrawable(int size, int colorTop, int colorBottom)` -> `ShapeDrawable`
- `static createCircleDrawableWithIcon(int size, int iconRes)` -> `CombinedDrawable`
- `static createCircleDrawableWithIcon(int size, int iconRes, int stroke)` -> `CombinedDrawable`
- `static createCircleDrawableWithIcon(int size, Drawable drawable, int stroke)` -> `CombinedDrawable`
- `static createCircleSelectorDrawable(int color, int leftInset, int rightInset)` -> `Drawable`
- `static createCommonChatResources()` -> `void`
- `static createCommonDialogResources(Context context)` -> `void`
- `static createCommonMessageResources()` -> `void`
- `static createCommonResources(Context context)` -> `void`
- `static createDefaultWallpaper()` -> `Drawable`
- `static createDefaultWallpaper(int w, int h)` -> `Drawable`
- `static createDialogsResources(Context context)` -> `void`
- `static createEditTextDrawable(Context context, boolean alert)` -> `Drawable`
- `static createEditTextDrawable(Context context, int color, int colorActivated)` -> `Drawable`
- `static createEmojiIconSelectorDrawable(Context context, int resource, int defaultColor, int pressedColor)` -> `Drawable`
- `static createInsetRoundRectDrawable(int color, float radius, int inset)` -> `Drawable`
- `static createInsetRoundRectDrawable(int color, float radius, int insetW, int insetH)` -> `Drawable`
- `static createInsetRoundRectDrawable(int color, float radius, int insetL, int insetT, int insetR, int insetB)` -> `Drawable`
- `static createNewTheme(String name)` -> `ThemeInfo`
- `static createOutlineCircleDrawable(int size, int color, int strokeWidth)` -> `Drawable`
- `static createProfileResources(Context context)` -> `void`
- `static createRadSelectorDrawable(int color, int topRad, int bottomRad)` -> `Drawable`
- `static createRadSelectorDrawable(int color, int rippleColor, int topRad, int bottomRad)` -> `Drawable`
- `static createRadSelectorDrawable(int color, int topLeftRad, int topRightRad, int bottomRightRad, int bottomLeftRad)` -> `Drawable`
- `static createRoundRectDrawable(int rad, int defaultColor)` -> `ShapeDrawable`
- `static createRoundRectDrawable(int topLeftRed, int topRightRad, int bottomRightRad, int bottomLeftRad, int defaultColor)` -> `ShapeDrawable`
- `static createRoundRectDrawable(int topRad, int bottomRad, int defaultColor)` -> `ShapeDrawable`
- `static createRoundRectDrawableShadowed(int rad, int defaultColor)` -> `InsetDrawable`
- `static createRoundRectDrawableWithIcon(int rad, int iconRes)` -> `Drawable`
- `static createRoundRectGradientDrawable(int rad, int topColor, int bottomColor)` -> `GradientDrawable`
- `static createSelectorDrawable(int color)` -> `Drawable`
- `static createSelectorDrawable(int color, int maskType)` -> `Drawable`
- `static createSelectorDrawable(int color, int maskType, int radius)` -> `Drawable`
- `static createSelectorDrawableFromDrawables(Drawable normal, Drawable pressed)` -> `Drawable`
- `static createSelectorWithBackgroundDrawable(int backgroundColor, int color)` -> `Drawable`
- `static createServiceDrawable(int rad, View view, View containerView)` -> `Drawable`
- `static createServiceDrawable(int rad, View view, View containerView, Paint backgroundPaint)` -> `Drawable`
- `static createServiceDrawable(int rad, View view, View containerView, Theme.ResourcesProvider resourcesProvider)` -> `Drawable`
- `static createServiceDrawable(int rad, View view, View containerView, Paint backgroundPaint, Theme.ResourcesProvider resourcesProvider)` -> `Drawable`
- `static createSimpleSelectorCircleDrawable(int size, int defaultColor, int pressedColor)` -> `Drawable`
- `static createSimpleSelectorDrawable(Context context, int resource, int defaultColor, int pressedColor)` -> `Drawable`
- `static createSimpleSelectorRoundRectDrawable(int rad, int defaultColor, int pressedColor)` -> `Drawable`
- `static createSimpleSelectorRoundRectDrawable(int rad, int defaultColor, int pressedColor, int maskColor)` -> `Drawable`
- `static createSimpleSelectorRoundRectDrawable(int leftTop, int rightTop, int rightBottom, int leftBottom, int defaultColor, int pressedColor, int maskColor)` -> `Drawable`
- `static createThemePreviewImage(String pathToFile, String wallpaperPath, Theme.ThemeAccent accent)` -> `String`
- `static destroyResources()` -> `void`
- `static fillThemeValues(File file, String themeName, TLRPC.TL_theme theme)` -> `ThemeInfo`
- `static fillingPaint(int color)` -> `Paint`
- `static getActiveTheme()` -> `ThemeInfo`
- `static getAnimatedEmojiColorFilter(ResourcesProvider resourcesProvider)` -> `ColorFilter`
- `static getAnimatedOutAudioVisualizerDrawable(MessageObject messageObject)` -> `AudioVisualizerDrawable`
- `static getAssetFile(String assetName)` -> `File`
- `static getBaseThemeByKey(String key)` -> `TLRPC.BaseTheme`
- `static getBaseThemeKey(TLRPC.ThemeSettings settings)` -> `String`
- `static getCachedWallpaper()` -> `Drawable`
- `static getCachedWallpaperNonBlocking()` -> `Drawable`
- `static getColor(int key, ResourcesProvider provider)` -> `int`
- `static getColor(int key)` -> `int`
- `static getColor(int key, boolean[] isDefault)` -> `int`
- `static getColor(int key, boolean[] isDefault, boolean ignoreAnimation)` -> `int`
- `static getCurrentAudiVisualizerDrawable()` -> `AudioVisualizerDrawable`
- `static getCurrentColor(int key)` -> `int`
- `static getCurrentGradientWallpaper()` -> `BackgroundGradientDrawable`
- `static getCurrentHolidayDrawable()` -> `Drawable`
- `static getCurrentHolidayDrawableXOffset()` -> `int`
- `static getCurrentHolidayDrawableYOffset()` -> `int`
- `static getCurrentNightTheme()` -> `ThemeInfo`
- `static getCurrentNightThemeName()` -> `String`
- `static getCurrentTheme()` -> `ThemeInfo`
- `static getCurrentThemeName()` -> `String`
- `static getDefaultAccentColor(int key)` -> `int`
- `static getDefaultColor(int key)` -> `int`
- `static getDefaultColors()` -> `int[]`
- `static getEventType()` -> `int`
- `static getFallbackKey(int key)` -> `int`
- `static getFallbackKeys()` -> `SparseIntArray`
- `static getFragmentContextViewWavesDrawable()` -> `FragmentContextViewWavesDrawable`
- `static getNonAnimatedColor(int key)` -> `int`
- `static getPreviewColor(SparseIntArray colors, int key)` -> `int`
- `static getPreviousTheme()` -> `ThemeInfo`
- `static getRadialSeekbarShadowDrawable()` -> `RoundVideoProgressShadow`
- `static getRoundRectSelectorDrawable(int color)` -> `Drawable`
- `static getRoundRectSelectorDrawable(int corners, int color)` -> `Drawable`
- `static getSelectedBackgroundSlug()` -> `String`
- `static getSelectorDrawable(boolean whiteBackground)` -> `Drawable`
- `static getSelectorDrawable(boolean whiteBackground, ResourcesProvider resourcesProvider)` -> `Drawable`
- `static getSelectorDrawable(int color, boolean whiteBackground)` -> `Drawable`
- `static getSelectorDrawable(int color, int backgroundColor)` -> `Drawable`
- `static getSelectorDrawable(int color, int backgroundColor, Theme.ResourcesProvider resourcesProvider)` -> `Drawable`
- `static getShareColorFilter(int color, boolean selected)` -> `ColorFilter`
- `static getTempHsv(int num)` -> `float[]`
- `static getTheme(String key)` -> `ThemeInfo`
- `static getThemeDrawable(String drawableKey)` -> `Drawable`
- `static getThemeDrawable(String key, Theme.ResourcesProvider resourcesProvider)` -> `Drawable`
- `static getThemeDrawableColorKey(String drawableKey)` -> `int`
- `static getThemeDrawablesMap()` -> `Map<String, Drawable>`
- `static getThemeFileValues(File file, String assetName, String[] wallpaperLink)` -> `SparseIntArray`
- `static getThemeFileValuesInBackground(File file, String assetName, String[] wallpaperLink, Utilities.Callback<SparseIntArray> onDone)` -> `void`
- `static getThemeIntensity(float value)` -> `float`
- `static getThemePaint(String key, ResourcesProvider resourcesProvider)` -> `Paint`
- `static getThemePaint(String paintKey)` -> `Paint`
- `static getThemePaintColorKey(String paintKey)` -> `int`
- `static getThemePaintsMap()` -> `Map<String, Paint>`
- `static getThemedDrawable(Context context, int resId, int color)` -> `Drawable`
- `static getThemedDrawableByKey(Context context, int resId, int key, Theme.ResourcesProvider resourcesProvider)` -> `Drawable`
- `static getThemedDrawableByKey(Context context, int resId, int key)` -> `Drawable`
- `static getThemedWallpaper(boolean thumb, View ownerView)` -> `Drawable`
- `static getWallpaperColor(int color)` -> `int`
- `static multAlpha(int color, float multiply)` -> `int`
- `static percentSV(int color1, int color2, float satT, float valT)` -> `int`
- `static refreshThemeColors()` -> `void`
- `static refreshThemeColors(boolean bg, boolean messages)` -> `void`
- `static reloadAllResources(Context context)` -> `void`
- `static reloadWallpaper(boolean async)` -> `void`
- `static resetCustomWallpaper(boolean temporary)` -> `void`
- `static reverseBlendOver(float ax, int y, int z)` -> `int`
- `static setAnimatedColor(int key, int value)` -> `void`
- `static setAnimatingColor(boolean animating)` -> `void`
- `static setChangingWallpaper(boolean value)` -> `void`
- `static setColor(int key, int color, boolean useDefault)` -> `void`
- `static setCombinedDrawableColor(Drawable combinedDrawable, int color, boolean isIcon)` -> `void`
- `static setCurrentNightTheme(ThemeInfo theme)` -> `void`
- `static setDefaultColor(int key, int color)` -> `void`
- `static setDrawableColor(Drawable drawable, int color)` -> `void`
- `static setDrawableColorByKey(Drawable drawable, int key)` -> `void`
- `static setEmojiDrawableColor(Drawable drawable, int color, boolean selected)` -> `void`
- `static setMaskDrawableRad(Drawable rippleDrawable, int top, int bottom)` -> `void`
- `static setMaskDrawableRad(Drawable rippleDrawable, float topLeftRad, float topRightRad, float bottomRightRad, float bottomLeftRad)` -> `void`
- `static setRippleDrawableForceSoftware(RippleDrawable drawable)` -> `void`
- `static setSelectorDrawableColor(Drawable drawable, int color, boolean selected)` -> `boolean`
- `static setThemeFileReference(TLRPC.TL_theme info)` -> `void`
- `static setThemeUploadInfo(ThemeInfo theme, ThemeAccent accent, TLRPC.TL_theme info, int account, boolean update)` -> `void`
- `static setThemeWallpaper(ThemeInfo themeInfo, Bitmap bitmap, File path)` -> `void`
- `static turnOffAutoNight(@NonNull BaseFragment fragment)` -> `void`
- `static turnOffAutoNight(BulletinFactory bulletinFactory, Runnable openSettings)` -> `void`
- `static unrefAudioVisualizeDrawable(MessageObject messageObject)` -> `void`

## `org.telegram.ui.ActionBar.Theme$AdaptiveRipple`
- `static calcRippleColor(int backgroundColor)` -> `int`
- `static circle()` -> `Drawable`
- `static circle(int backgroundColor)` -> `Drawable`
- `static circle(int backgroundColor, float radius)` -> `Drawable`
- `static circleByKey(int backgroundColorKey)` -> `Drawable`
- `static circleByKey(int backgroundColorKey, float radius)` -> `Drawable`
- `static createRect(int rippleColor, float ...radii)` -> `Drawable`
- `static createRect(int backgroundColor, int rippleColor, float ...radii)` -> `Drawable`
- `static filledCircle()` -> `Drawable`
- `static filledCircle(Drawable background)` -> `Drawable`
- `static filledCircle(Drawable background, int backgroundColorKey)` -> `Drawable`
- `static filledCircle(int backgroundColor)` -> `Drawable`
- `static filledCircle(int backgroundColor, float radius)` -> `Drawable`
- `static filledCircle(Drawable background, int backgroundColor, float radius)` -> `Drawable`
- `static filledCircleByKey(int backgroundColorKey)` -> `Drawable`
- `static filledCircleByKey(int backgroundColorKey, float radius)` -> `Drawable`
- `static filledCircleByKey(Drawable background, int backgroundColorKey, float radius)` -> `Drawable`
- `static filledRect()` -> `Drawable`
- `static filledRect(Drawable background)` -> `Drawable`
- `static filledRect(int backgroundColor)` -> `Drawable`
- `static filledRect(int backgroundColor, float ...radii)` -> `Drawable`
- `static filledRect(Drawable background, int backgroundColor, float ...radii)` -> `Drawable`
- `static filledRectByKey(int backgroundColorKey)` -> `Drawable`
- `static filledRectByKey(Drawable background, int backgroundColorKey)` -> `Drawable`
- `static filledRectByKey(int backgroundColorKey, float ...radii)` -> `Drawable`
- `static filledRectByKey(Drawable background, int backgroundColorKey, float ...radii)` -> `Drawable`
- `static rect()` -> `Drawable`
- `static rect(int backgroundColor)` -> `Drawable`
- `static rect(int backgroundColor, float ...radii)` -> `Drawable`
- `static rectByKey(int backgroundColorKey)` -> `Drawable`
- `static rectByKey(int backgroundColorKey, float ...radii)` -> `Drawable`

## `org.telegram.ui.ActionBar.Theme$AdaptiveRipple$CircleDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int i)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.ActionBar.Theme$Colorable`
- `getColorKeys()` -> `default int[]`

## `org.telegram.ui.ActionBar.Theme$IvButtonColors`
- `getBackgroundKey(boolean out)` -> `int`
- `getBackgroundPressedKey(boolean out)` -> `int`
- `getTextKey(boolean out)` -> `int`
- `static of(TL_keyboard.RichButtonStyle style)` -> `IvButtonColors`

## `org.telegram.ui.ActionBar.Theme$PatternsLoader`
- `static createLoader(boolean force)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`

## `org.telegram.ui.ActionBar.Theme$ResourcesProvider`
- `applyServiceShaderMatrix(int w, int h, float translationX, float translationY)` -> `default void`
- `getAnimatedEmojiColorFilter()` -> `default ColorFilter`
- `getColorOrDefault(int key)` -> `default int`
- `getCurrentColor(int key)` -> `default int`
- `getDrawable(String drawableKey)` -> `default Drawable`
- `getPaint(String paintKey)` -> `default Paint`
- `setAnimatedColor(int key, int color)` -> `default void`

## `org.telegram.ui.ActionBar.Theme$RippleRadMaskDrawable`
- `draw(Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `onBoundsChange(Rect bounds)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(ColorFilter colorFilter)` -> `void`
- `setRadius(float top, float bottom)` -> `void`
- `setRadius(float topLeft, float topRight, float bottomRight, float bottomLeft)` -> `void`

## `org.telegram.ui.ActionBar.Theme$ThemeAccent`
- `fillAccentColors(SparseIntArray currentColorsNoAccent, SparseIntArray currentColors)` -> `boolean`
- `getPathToWallpaper()` -> `File`
- `resetAccentColorsForMyMessagesGiftThemeLight(SparseIntArray currentColors)` -> `void`

## `org.telegram.ui.ActionBar.Theme$ThemeInfo`
- `static accentEquals(ThemeAccent accent, TLRPC.ThemeSettings settings)` -> `boolean`
- `createBackground(File file, String toPath)` -> `boolean`
- `createNewAccent(TLRPC.ThemeSettings settings)` -> `ThemeAccent`
- `createNewAccent(TLRPC.TL_theme info, int account)` -> `ThemeAccent`
- `createNewAccent(TLRPC.TL_theme info, int account, boolean ignoreThemeInfoId, int settingsIndex)` -> `ThemeAccent`
- `createNewAccent(long themeId, TLRPC.ThemeSettings settings, TLRPC.TL_theme info, int account, boolean ignoreThemeInfoId)` -> `ThemeAccent`
- `static createWithJson(JSONObject object)` -> `ThemeInfo`
- `static createWithString(String string)` -> `ThemeInfo`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static fillAccentValues(ThemeAccent themeAccent, TLRPC.ThemeSettings settings)` -> `void`
- `generateWallpaperName(ThemeAccent accent, boolean original)` -> `String`
- `getAccent(boolean createNew)` -> `ThemeAccent`
- `getAccentColor(int id)` -> `int`
- `getKey()` -> `String`
- `getName()` -> `String`
- `getPreviewBackgroundColor()` -> `int`
- `getPreviewInColor()` -> `int`
- `getPreviewOutColor()` -> `int`
- `getSaveJson()` -> `JSONObject`
- `setCurrentAccentId(int id)` -> `void`
- `setOverrideWallpaper(OverrideWallpaperInfo info)` -> `void`
- `setPreviewBackgroundColor(int color)` -> `void`
- `setPreviewInColor(int color)` -> `void`
- `setPreviewOutColor(int color)` -> `void`

## `org.telegram.ui.ActionBar.ThemeColors`
- `static createColorKeysMap()` -> `SparseArray<String>`
- `static createDefaultColors()` -> `int[]`
- `static getStringName(int currentKey)` -> `String`
- `static stringKeyToInt(String key)` -> `int`

## `org.telegram.ui.ActionBar.ThemeDescription`
- `getCurrentColor()` -> `int`
- `getCurrentKey()` -> `int`
- `getSetColor()` -> `int`
- `getTitle()` -> `String`
- `setAnimatedColor(int color)` -> `void`
- `setColor(int color, boolean useDefault)` -> `void`
- `setColor(int color, boolean useDefault, boolean save)` -> `void`
- `setDefaultColor()` -> `void`
- `setDelegateDisabled()` -> `ThemeDescriptionDelegate`
- `setPreviousColor()` -> `void`
- `startEditing()` -> `void`

## `org.telegram.ui.ActionBar.ThemeDescription$ThemeDescriptionDelegate`
- `onAnimationProgress(float progress)` -> `default void`

## `org.telegram.ui.ActionBar.theme.ThemeKey`
- `equals(@Nullable Object obj)` -> `boolean`
- `static equals(@Nullable ThemeKey key1, @Nullable ThemeKey key2)` -> `boolean`
- `static fromSavedString(String string)` -> `ThemeKey`
- `static of(TLRPC.TL_theme theme)` -> `ThemeKey`
- `static of(TLRPC.ChatTheme theme)` -> `ThemeKey`
- `static of(TLRPC.InputChatTheme theme)` -> `ThemeKey`
- `static ofEmoticon(String emoji)` -> `ThemeKey`
- `static ofGiftSlug(String slug)` -> `ThemeKey`
- `static toInputTheme(ThemeKey key)` -> `TLRPC.InputChatTheme`
- `toSavedString()` -> `String`

## `org.telegram.ui.Cells.RadioColorCell`
- `isChecked()` -> `boolean`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setCheckColor(int color1, int color2)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setTextAndText2AndValue(CharSequence text, CharSequence text2, boolean checked)` -> `void`
- `setTextAndValue(CharSequence text, boolean checked)` -> `void`

## `org.telegram.ui.Cells.TextColorCell`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setEnabled(boolean value, ArrayList<Animator> animators)` -> `void`
- `setTextAndColor(String text, int color, boolean divider)` -> `void`

## `org.telegram.ui.Cells.TextColorThemeCell`
- `getAlpha()` -> `float`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAlpha(float value)` -> `void`
- `setTextAndColor(CharSequence text, int color)` -> `void`

## `org.telegram.ui.Cells.ThemeCell`
- `getCurrentThemeInfo()` -> `Theme.ThemeInfo`
- `getTextView()` -> `TextView`
- `onAttachedToWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setOnOptionsClick(OnClickListener listener)` -> `void`
- `setTextColor(int color)` -> `void`
- `setTheme(Theme.ThemeInfo themeInfo, boolean divider)` -> `void`
- `updateCurrentThemeCheck()` -> `void`

## `org.telegram.ui.Cells.ThemePreviewMessagesCell`
- `dispatchSetPressed(boolean pressed)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `getCells()` -> `ChatMessageCell[]`
- `invalidate()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setOverrideBackground(Drawable drawable)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Cells.ThemeTypeCell`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setTypeChecked(boolean value)` -> `void`
- `setValue(String name, boolean checked, boolean divider)` -> `void`

## `org.telegram.ui.Cells.ThemesHorizontalListCell`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `notifyDataSetChanged(int width)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent e)` -> `boolean`
- `scrollToCurrentTheme(int width, boolean animated)` -> `void`
- `selectTheme(Theme.ThemeInfo themeInfo)` -> `void`
- `setBackgroundColor(int color)` -> `void`
- `setDrawDivider(boolean draw)` -> `void`
- `showOptionsForTheme(Theme.ThemeInfo themeInfo)` -> `void`
- `updateRows()` -> `void`

## `org.telegram.ui.Cells.ThemesHorizontalListCell$InnerThemeView`
- `getAccentState()` -> `float`
- `onAttachedToWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setAccentState(float state)` -> `void`
- `setTheme(Theme.ThemeInfo theme, boolean last, boolean first)` -> `void`
- `updateColors(boolean animate)` -> `void`
- `updateCurrentThemeCheck()` -> `void`

## `org.telegram.ui.Cells.ThemesHorizontalListCell$ThemesListAdapter`
- `getItemCount()` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.ChannelColorActivity`
- `createListView()` -> `void`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `findChildAt(int position)` -> `View`
- `getCustomWallpaperLevelMin()` -> `int`
- `getEmojiPackInfoStrRes()` -> `int`
- `getEmojiPackStrRes()` -> `int`
- `getEmojiStatusInfoStrRes()` -> `int`
- `getEmojiStatusLevelMin()` -> `int`
- `getEmojiStatusStrRes()` -> `int`
- `getEmojiStickersLevelMin()` -> `int`
- `getMessagePreviewType()` -> `int`
- `getProfileIconLevelMin()` -> `int`
- `getProfileInfoStrRes()` -> `int`
- `getStickerPackInfoStrRes()` -> `int`
- `getStickerPackStrRes()` -> `int`
- `getWallpaper2InfoStrRes()` -> `int`
- `getWallpaperLevelMin()` -> `int`
- `getWallpaperStrRes()` -> `int`
- `isForum()` -> `boolean`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `minLevelRequired()` -> `int`
- `needBoostInfoSection()` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `openBoostDialog(int type)` -> `void`
- `seesLoading()` -> `boolean`
- `setForceDark(boolean isDark, boolean playAnimation)` -> `void`
- `setOnApplied(BaseFragment bulletinFragment)` -> `ChannelColorActivity`
- `setResourceProvider(Theme.ResourcesProvider resourceProvider)` -> `void`
- `showSelectStatusDialog(EmojiCell cell, long documentId, boolean emojiStatus, Utilities.Callback3<Long, Integer, TL_stars.TL_starGiftUnique> onSet, int accentColor)` -> `void`
- `toggleTheme()` -> `void`
- `updateButton(boolean animated)` -> `void`
- `updateColors(boolean onlyActionBar)` -> `void`
- `updateMessagesPreview(boolean animated)` -> `void`
- `updateProfilePreview(boolean animated)` -> `void`
- `updateRows()` -> `void`
- `updateThemeColors()` -> `void`

## `org.telegram.ui.ChannelColorActivity$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.ChannelColorActivity$EmojiCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getColor()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAdaptiveEmojiColor(int currentAccount, int colorId, boolean isReply)` -> `void`
- `setAdaptiveEmojiColor(MessagesController.PeerColor peerColor)` -> `void`
- `setDivider(boolean divider)` -> `void`
- `setEmoji(long documentId, boolean isCollectible, boolean animated)` -> `void`
- `setEmoji(TLRPC.Document document, boolean isCollectible, boolean animated)` -> `void`
- `setLockLevel(int lvl)` -> `void`
- `setText(CharSequence text)` -> `void`
- `updateColors()` -> `void`
- `updateImageBounds()` -> `void`

## `org.telegram.ui.ChannelColorActivity$PeerColorPicker`
- `getColorId()` -> `int`
- `onInterceptTouchEvent(MotionEvent e)` -> `boolean`
- `setSelected(int color, boolean animated)` -> `void`
- `setSelectedPosition(int position, boolean animated)` -> `void`
- `toColorId(int position)` -> `int`
- `toPosition(final int colorId)` -> `int`
- `updateColors()` -> `void`

## `org.telegram.ui.ChannelColorActivity$PeerColorPicker$ColorCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(int color)` -> `void`
- `set(int color1, int color2)` -> `void`
- `set(MessagesController.PeerColor color)` -> `void`
- `setBackgroundColor(int backgroundColor)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `setSelected(boolean selected, boolean animated)` -> `void`

## `org.telegram.ui.ChannelColorActivity$ThemeChooser`
- `isDark()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setGalleryWallpaper(TLRPC.WallPaper wallPaper)` -> `void`
- `setOnEmoticonSelected(Utilities.Callback<String> callback)` -> `void`
- `setSelectedEmoticon(String emoticon, boolean animated)` -> `void`
- `setWithRemovedStub(boolean withRemovedStub)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.ChannelColorActivity$ThemeDelegate`
- `getColor(int key)` -> `int`
- `getDrawable(String drawableKey)` -> `Drawable`
- `getPaint(String paintKey)` -> `Paint`
- `toggle()` -> `void`

## `org.telegram.ui.Components.AnimatedColor`
- `force(int mustBeColor)` -> `int`
- `get()` -> `int`
- `getTransitionProgress()` -> `float`
- `getTransitionProgressInterpolated()` -> `float`
- `set(int mustBeColor)` -> `int`
- `set(int mustBeColor, boolean force)` -> `int`
- `setParent(View parent)` -> `void`

## `org.telegram.ui.Components.BlurBehindDrawable`
- `clear()` -> `void`
- `draw(Canvas canvas)` -> `void`
- `invalidate()` -> `void`
- `onPanTranslationUpdate(float y)` -> `void`
- `setAnimateAlpha(boolean animateAlpha)` -> `void`
- `show(boolean show)` -> `void`

## `org.telegram.ui.Components.BlurBehindDrawable$BlurBackgroundTask`
- `run()` -> `void`

## `org.telegram.ui.Components.BluredView`
- `fullyDrawing()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `update()` -> `void`

## `org.telegram.ui.Components.BlurredFrameLayout`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setBackgroundColor(int color)` -> `void`
- `setTranslationY(float translationY)` -> `void`

## `org.telegram.ui.Components.BlurredLinearLayout`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setBackgroundColor(int color)` -> `void`

## `org.telegram.ui.Components.BlurredRecyclerView`
- `capture(Canvas canvas, RectF position)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `measureBlurTopPadding()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onMeasure(int widthSpec, int heightSpec)` -> `void`
- `requestLayout()` -> `void`
- `setPadding(int left, int top, int right, int bottom)` -> `void`

## `org.telegram.ui.Components.BlurringShader`
- `draw(float[] oesMatrix, int texture, int textureWidth, int textureHeight)` -> `void`
- `getBitmap()` -> `Bitmap`
- `getTexture()` -> `int`
- `invalidate()` -> `void`
- `resetBitmap()` -> `void`
- `setBlurManager(BlurManager manager)` -> `void`
- `setup(float aspectRatio, boolean needsUiBitmap, int padding)` -> `boolean`
- `updateGradient(int top, int bottom)` -> `void`
- `updateTransform(Matrix matrix, int w, int h)` -> `void`
- `updateTransform(Matrix matrix)` -> `void`

## `org.telegram.ui.Components.BlurringShader$BlurManager`
- `acquiredContext(EGLContext newContext)` -> `void`
- `attach(StoryBlurDrawer holder)` -> `void`
- `attach(Runnable invalidate)` -> `void`
- `destroyedContext(EGLContext oldContext)` -> `void`
- `detach(StoryBlurDrawer holder)` -> `void`
- `detach(Runnable invalidate)` -> `void`
- `getBitmap()` -> `Bitmap`
- `getParentContext()` -> `EGLContext`
- `getTexture()` -> `int`
- `getTextureLock()` -> `Object`
- `invalidate()` -> `void`
- `resetBitmap()` -> `void`
- `setFallbackBlur(Bitmap bitmap, int orientation)` -> `void`
- `setFallbackBlur(Bitmap bitmap, int orientation, boolean recycleAfter)` -> `void`
- `setRenderNode(View view, Object renderNode)` -> `void`
- `setRenderNode(View view, Object renderNode, int bgColor)` -> `void`
- `setShader(BlurringShader shader)` -> `void`

## `org.telegram.ui.Components.BlurringShader$StoryBlurDrawer`
- `adapt(boolean isDark)` -> `StoryBlurDrawer`
- `drawRect(Canvas canvas)` -> `void`
- `drawRect(Canvas canvas, float tx, float ty, float alpha)` -> `void`
- `drawRect(Canvas canvas, float tx, float ty, float alpha, boolean clip)` -> `void`
- `getPaint(float alpha)` -> `Paint`
- `getPaint(float alpha, float tx, float ty)` -> `Paint`
- `getPaints(float alpha, float tx, float ty)` -> `Paint[]`
- `makeDrawable(float offsetX, float offsetY, Drawable base, float r)` -> `Drawable`
- `setBounds(float left, float top, float right, float bottom)` -> `void`
- `setBounds(RectF bounds)` -> `void`
- `setOffset(float ox, float oy)` -> `StoryBlurDrawer`

## `org.telegram.ui.Components.BlurringShader$ThumbBlurer`
- `destroy()` -> `void`
- `getBitmap(Bitmap bitmap, String key, int orientation, int invert, boolean recycleAfter)` -> `Bitmap`
- `getBitmap(ImageReceiver imageReceiver)` -> `Bitmap`
- `getBitmap(ImageReceiver.BitmapHolder bitmapHolder)` -> `Bitmap`

## `org.telegram.ui.Components.ChatThemeBottomSheet`
- `close()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onBackPressed()` -> `void`
- `onContainerTouchEvent(MotionEvent event)` -> `boolean`
- `onContainerTranslationYChanged(float y)` -> `void`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `static openGalleryForBackground(Activity activity, BaseFragment fragment, long dialogId, Theme.ResourcesProvider resourcesProvider, Utilities.Callback<TLRPC.WallPaper> onSet, ThemePreviewActivity.DayNightSwitchDelegate toggleTheme, TL_stories.TL_premium_boostsStatus cachedBoostsStatus)` -> `void`
- `setupLightDarkTheme(boolean isDark)` -> `void`

## `org.telegram.ui.Components.ChatThemeBottomSheet$Adapter`
- `getItemCount()` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `setItems(List<ChatThemeItem> newItems)` -> `void`
- `setSelectedItem(int position)` -> `void`

## `org.telegram.ui.Components.ChatThemeBottomSheet$ChatThemeItem`
- `getEmoticon()` -> `String`

## `org.telegram.ui.Components.ColorPicker`
- `static generateGradientColors(int color)` -> `int`
- `getColor()` -> `int`
- `hideKeyboard()` -> `void`
- `invalidate()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onSizeChanged(int width, int height, int oldw, int oldh)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `provideThemeDescriptions(List<ThemeDescription> arrayList)` -> `void`
- `setColor(int color, int num)` -> `void`
- `setHasChanges(boolean value)` -> `void`
- `setMaxBrightness(float limit)` -> `void`
- `setMinBrightness(float limit)` -> `void`
- `setResourcesProvider(Theme.ResourcesProvider resourcesProvider)` -> `void`
- `setType(int resetType, boolean hasChanges, int maxColorsCount, int newColorsCount, boolean myMessages, int angle, boolean animated)` -> `void`

## `org.telegram.ui.Components.ColorPicker$ColorPickerDelegate`
- `getDefaultColor(int num)` -> `default int`
- `openThemeCreate(boolean share)` -> `default void`
- `rotateColors()` -> `default void`

## `org.telegram.ui.Components.ColorPicker$RadioButton`
- `getCheckedState()` -> `float`
- `getColor()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean value, boolean animated)` -> `void`
- `setCheckedState(float state)` -> `void`
- `setColor(int color)` -> `void`
- `updateCheckedState(boolean animate)` -> `void`

## `org.telegram.ui.Components.ColorSpanUnderline`
- `updateDrawState(TextPaint ds)` -> `void`

## `org.telegram.ui.Components.ColoredImageSpan`
- `draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, @NonNull Paint paint)` -> `void`
- `getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i1, @Nullable Paint.FontMetricsInt fm)` -> `int`
- `rotate(float r)` -> `void`
- `setAlpha(float v)` -> `void`
- `setCheckColorDelegate(Runnable checkColorDelegate)` -> `void`
- `setColorKey(int colorKey)` -> `ColoredImageSpan`
- `setOverrideColor(int red)` -> `ColoredImageSpan`
- `setRelativeSize(Paint.FontMetricsInt fontMetricsInt)` -> `void`
- `setScale(float sx)` -> `ColoredImageSpan`
- `setScale(float sx, float sy)` -> `ColoredImageSpan`
- `setSize(int size)` -> `void`
- `setTopOffset(int topOffset)` -> `void`
- `setTranslateX(float tx)` -> `void`
- `setTranslateY(float ty)` -> `void`
- `setWidth(int width)` -> `void`
- `translate(float tx, float ty)` -> `ColoredImageSpan`

## `org.telegram.ui.Components.EmojiColorPickerWindow`
- `static create(Context context, Theme.ResourcesProvider resourcesProvider)` -> `EmojiColorPickerWindow`
- `dismiss()` -> `void`
- `getPopupHeight()` -> `int`
- `getPopupWidth()` -> `int`
- `getSelection()` -> `int`
- `getSkinTone(int side)` -> `String`
- `onTouchMove(int x)` -> `void`
- `setEmoji(String emoji)` -> `void`
- `setOnSelectionUpdateListener(Utilities.Callback2<Integer, Integer> onSelectionUpdateListener)` -> `void`
- `setSelection(int value)` -> `void`
- `setupArrow(int arrowX)` -> `void`
- `showAsDropDown(View anchor, int xoff, int yoff)` -> `void`
- `showAtLocation(View parent, int gravity, int x, int y)` -> `void`
- `update(View anchor, int xoff, int yoff, int width, int height)` -> `void`
- `update(View anchor, int width, int height)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.EmojiColorPickerWindow$EmojiColorPickerView`
- `getEmoji()` -> `String`
- `getSelection(int side)` -> `int`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setArrowX(int arrowX)` -> `void`
- `setEmoji(boolean compound, String emoji)` -> `void`
- `setOnSelectionUpdateListener(Utilities.Callback2<Integer, Integer> onSelectionUpdateListener)` -> `void`
- `setSelection(int side, int position)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.FilterShaders$BlurProgram`
- `create()` -> `boolean`
- `destroy()` -> `void`

## `org.telegram.ui.Components.ForegroundColorSpanThemable`
- `setAlpha(float alpha)` -> `void`
- `setColorKey(int colorKey)` -> `void`
- `updateDrawState(@NonNull TextPaint textPaint)` -> `void`

## `org.telegram.ui.Components.MessagePreviewView$ActionBar`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAnimationForward(boolean forward)` -> `void`
- `setSubtitle(CharSequence text, boolean animated)` -> `void`
- `setTitle(CharSequence text, boolean animated)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Components.MotionBackgroundPaint$ShaderImpl$ColorShaderState`
- `setup(int color)` -> `boolean`

## `org.telegram.ui.Components.OverlayActionBarLayoutDialog`
- `needAddFragmentToStack(BaseFragment fragment, INavigationLayout layout)` -> `boolean`
- `needCloseLastFragment(INavigationLayout layout)` -> `boolean`
- `needPresentFragment(BaseFragment fragment, boolean removeLast, boolean forceWithoutAnimation, INavigationLayout layout)` -> `boolean`
- `onBackPressed()` -> `void`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `onMeasureOverride(int[] measureSpec)` -> `void`
- `onPreIme()` -> `boolean`
- `onRebuildAllFragments(INavigationLayout layout, boolean last)` -> `void`
- `onStart()` -> `void`
- `onStop()` -> `void`

## `org.telegram.ui.Components.OverlayActionBarLayoutDialog$EmptyFragment`
- `createView(Context context)` -> `View`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`

## `org.telegram.ui.Components.Paint.Brush$Blurer`
- `getAlpha()` -> `float`
- `getDefaultWeight()` -> `float`
- `getIconRes()` -> `int`
- `getPreviewScale()` -> `float`
- `getShaderName(int paintType)` -> `String`

## `org.telegram.ui.Components.Paint.ColorPickerBottomSheet`
- `dismiss()` -> `void`
- `setColor(int color)` -> `ColorPickerBottomSheet`
- `setColorListener(Consumer<Integer> colorListener)` -> `ColorPickerBottomSheet`
- `setPipetteDelegate(PipetteDelegate pipetteDelegate)` -> `ColorPickerBottomSheet`
- `show()` -> `void`

## `org.telegram.ui.Components.Paint.ColorPickerBottomSheet$AlphaPickerView`
- `onDraw(Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setColor(int mColor)` -> `void`

## `org.telegram.ui.Components.Paint.ColorPickerBottomSheet$ColorSliderView`
- `invalidateColor()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setMode(int mode)` -> `void`

## `org.telegram.ui.Components.Paint.ColorPickerBottomSheet$GradientPickerView`
- `onDraw(Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setColor(int color, boolean updatePosition)` -> `void`

## `org.telegram.ui.Components.Paint.ColorPickerBottomSheet$GridPickerView`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setCurrentColor(int color)` -> `void`
- `setCurrentColor(int x, int y)` -> `void`

## `org.telegram.ui.Components.Paint.ColorPickerBottomSheet$SliderCell`
- `bind(int mode)` -> `void`
- `invalidateColor()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Components.Paint.ColorPickerBottomSheet$SlidersPickerView`
- `invalidateColor()` -> `void`

## `org.telegram.ui.Components.Paint.PersistColorPalette`
- `cleanup()` -> `void`
- `getColor(int index)` -> `int`
- `getCurrentAlignment()` -> `int`
- `getCurrentBrush()` -> `int`
- `getCurrentColor()` -> `int`
- `getCurrentColorPosition()` -> `int`
- `getCurrentTextType()` -> `int`
- `getCurrentTypeface()` -> `String`
- `getCurrentWeight()` -> `float`
- `getFillShapes()` -> `boolean`
- `static getInstance(int currentAccount)` -> `PersistColorPalette`
- `getWeight(String key, float defaultWeight)` -> `float`
- `resetCurrentColor()` -> `void`
- `selectColor(int color)` -> `void`
- `selectColor(int color, boolean updateBrush)` -> `void`
- `setCurrentAlignment(int currentAlignment)` -> `void`
- `setCurrentBrush(int currentBrush)` -> `void`
- `setCurrentBrush(int currentBrush, boolean saveBrush)` -> `void`
- `setCurrentBrushColorByColorIndex(int index)` -> `void`
- `setCurrentTextType(int currentTextType)` -> `void`
- `setCurrentTypeface(String currentTypeface)` -> `void`
- `setCurrentWeight(float currentWeight)` -> `void`
- `setInTextMode(boolean inTextMode)` -> `void`
- `setWeight(String key, float weight)` -> `void`
- `toggleFillShapes()` -> `void`

## `org.telegram.ui.Components.Paint.Views.ColorPicker`
- `colorForLocation(float location)` -> `int`
- `getDraggingFactor()` -> `float`
- `getSettingsButton()` -> `View`
- `getSwatch()` -> `Swatch`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setDelegate(ColorPickerDelegate colorPickerDelegate)` -> `void`
- `setLocation(float value)` -> `void`
- `setSettingsButtonImage(int resId)` -> `void`
- `setSwatch(Swatch swatch)` -> `void`
- `setUndoEnabled(boolean enabled)` -> `void`
- `setWeight(float value)` -> `void`

## `org.telegram.ui.Components.Paint.Views.PaintColorsListView`
- `static drawCheckerboard(Canvas canvas, RectF bounds, int checkerboardSize)` -> `void`
- `static drawColorCircle(Canvas canvas, float cx, float cy, float rad, int color)` -> `void`
- `getSelectedColorIndex()` -> `int`
- `setColorListener(Consumer<Integer> colorListener)` -> `void`
- `setColorPalette(PersistColorPalette colorPalette)` -> `void`
- `setProgress(float progress, boolean toShow)` -> `void`
- `setSelectedColorIndex(int selectedColorIndex)` -> `void`

## `org.telegram.ui.Components.Paint.Views.PaintColorsListView$ColorView`
- `onDraw(Canvas canvas)` -> `void`
- `setColor(int color)` -> `void`
- `setSelected(boolean selected, boolean animate)` -> `void`

## `org.telegram.ui.Components.PasscodeView$BlurBackground`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.PhotoFilterBlurControl`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setActualAreaSize(float width, float height)` -> `void`
- `setDelegate(PhotoFilterLinearBlurControlDelegate delegate)` -> `void`
- `setType(int blurType)` -> `void`

## `org.telegram.ui.Components.PorterDuffColorFilterState`
- `get(int color, PorterDuff.Mode mode)` -> `ColorFilter`

## `org.telegram.ui.Components.PostsSearchContainer$ForegroundColorAlphaSpan`
- `updateDrawState(TextPaint tp)` -> `void`

## `org.telegram.ui.Components.SimpleThemeDescription`
- `static createThemeDescription(ThemeDescription.ThemeDescriptionDelegate del, int key)` -> `ThemeDescription`
- `static createThemeDescriptions(ThemeDescription.ThemeDescriptionDelegate del, int... keys)` -> `ArrayList<ThemeDescription>`

## `org.telegram.ui.Components.SizeNotifierFrameLayout$BlurBackgroundTask`
- `run()` -> `void`

## `org.telegram.ui.Components.SizeNotifierFrameLayout$BlurBitmap`
- `recycle()` -> `void`

## `org.telegram.ui.Components.StarRatingView$Colors`
- `reset()` -> `void`
- `setParentExpanded(float parentExpanded)` -> `void`
- `update(MessagesController.PeerColor peerColor)` -> `void`

## `org.telegram.ui.Components.ThemeEditorView`
- `close()` -> `void`
- `destroy()` -> `void`
- `static getInstance()` -> `ThemeEditorView`
- `getX()` -> `int`
- `getY()` -> `int`
- `onActivityResult(int requestCode, int resultCode, Intent data)` -> `void`
- `onConfigurationChanged()` -> `void`
- `setX(int value)` -> `void`
- `setY(int value)` -> `void`
- `show(Activity activity, final Theme.ThemeInfo theme)` -> `void`

## `org.telegram.ui.Components.ThemeEditorView$EditorAlert`
- `dismissInternal()` -> `void`
- `getScrollOffsetY()` -> `int`
- `setScrollOffsetY(int value)` -> `void`

## `org.telegram.ui.Components.ThemeEditorView$EditorAlert$ColorPicker`
- `getColor()` -> `int`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onSizeChanged(int width, int height, int oldw, int oldh)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setColor(int color)` -> `void`

## `org.telegram.ui.Components.ThemeEditorView$EditorAlert$ListAdapter`
- `getItem(int i)` -> `ArrayList<ThemeDescription>`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.ThemeEditorView$EditorAlert$SearchAdapter`
- `generateSearchName(String name, String q)` -> `CharSequence`
- `getItem(int i)` -> `ArrayList<ThemeDescription>`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `searchDialogs(final String query)` -> `void`

## `org.telegram.ui.Components.ThemeEditorView$EditorAlert$SearchField`
- `hideKeyboard()` -> `void`
- `requestDisallowInterceptTouchEvent(boolean disallowIntercept)` -> `void`
- `showKeyboard()` -> `void`

## `org.telegram.ui.Components.ThemePreviewDrawable`
- `getThemeDocument()` -> `DocumentObject.ThemeDocument`

## `org.telegram.ui.Components.ThemeSmallPreviewView`
- `cancelAnimation()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `noThemeString()` -> `String`
- `noThemeStringTextSize()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `playEmojiAnimation()` -> `void`
- `setBackgroundColor(int color)` -> `void`
- `setFallbackWallpaper(TLRPC.WallPaper wallPaper)` -> `void`
- `setItem(ChatThemeBottomSheet.ChatThemeItem item, boolean animated)` -> `void`
- `setItem(ChatThemeBottomSheet.ChatThemeItem item, long parentDialogId, boolean animated)` -> `void`
- `setSelected(boolean selected, boolean animated)` -> `void`
- `updatePreviewBackground(ThemeDrawable themeDrawable)` -> `void`

## `org.telegram.ui.Components.ThemeSmallPreviewView$ThemeDrawable`
- `draw(Canvas canvas, float alpha)` -> `void`
- `drawBackground(Canvas canvas, float alpha)` -> `void`

## `org.telegram.ui.Components.blur3.Blur3HashImpl`
- `get()` -> `long`
- `start()` -> `void`
- `unsupported()` -> `void`

## `org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory`
- `create()` -> `BlurredBackgroundDrawable`
- `create(View view)` -> `BlurredBackgroundDrawable`
- `create(View view, boolean multiwindow)` -> `BlurredBackgroundDrawable`
- `create(View view, BlurredBackgroundColorProvider provider)` -> `BlurredBackgroundDrawable`
- `create(View view, BlurredBackgroundColorProvider provider, boolean multiwindow)` -> `BlurredBackgroundDrawable`
- `invalidateAllLinkedViews()` -> `void`
- `setGlassEngine(GlassEngine engine)` -> `void`
- `setLinkedDrawablesRef(@Nullable ReferenceList<BlurredBackgroundDrawable> linkedDrawables)` -> `void`
- `setLinkedViewsRef(@Nullable ReferenceList<View> linkedViews)` -> `void`
- `setLiquidGlassEffectAllowed(boolean liquidGlassEffectAllowed)` -> `void`
- `setOutset(int outset)` -> `void`
- `setOutset(int dx, int dy)` -> `void`
- `setSourceRootView(ViewPositionWatcher watcher, ViewGroup parent)` -> `void`

## `org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `static fillAlphaGradientColors(int[] outColors, int baseColor, int alphaStart, int alphaEnd, Interpolator interpolator)` -> `void`
- `getAlpha()` -> `int`
- `getOpacity()` -> `int`
- `onBoundsChange(@NonNull Rect bounds)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setFadeHeight(int fadeHeight, boolean opacity)` -> `void`
- `setIgnoreFastWay(boolean ignoreFastWay)` -> `void`

## `org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor`
- `static convertRadiusToSigma(float radius)` -> `float`
- `static convertSigmaToRadius(float sigma)` -> `float`
- `static downscaleRadius(float radius, float scale)` -> `float`
- `draw(Canvas canvas, int index)` -> `void`
- `drawDebugPositions(Canvas canvas)` -> `void`
- `drawInline(Canvas canvas, int index)` -> `void`
- `getRenderNodesCount()` -> `int`
- `invalidateResultRenderNodes(IBlur3Capture capture, int width, int height)` -> `boolean`
- `onScrolled(float dx, float dy)` -> `void`
- `static roundUp(float value, int N)` -> `int`
- `setupRenderNodes(GlassPositionsArray positions)` -> `void`
- `setupRenderNodes(List<RectF> positions, int count)` -> `void`

## `org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor$DownscaledRenderNode`
- `invalidateRenderNodes(RenderNode renderNode)` -> `void`
- `onScrolled(float dx, float dy)` -> `void`
- `setPrimaryEffect(RenderEffect renderEffect)` -> `void`
- `setPrimaryEffectBlur(float radius)` -> `void`
- `setPrimaryEffectBlur(float radius, RenderEffect secondEffect)` -> `void`
- `setScale(int scaleX, int scaleY)` -> `void`
- `setSecondaryEffect(int index, RenderEffect renderEffect)` -> `void`

## `org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor$SourcePart`
- `invalidate()` -> `void`

## `org.telegram.ui.Components.blur3.LiquidGlassEffect`
- `update(float left, float top, float right, float bottom, float radiusLeftTop, float radiusRightTop, float radiusRightBottom, float radiusLeftBottom, float thickness, float intensity, float index, int foregroundColor)` -> `void`

## `org.telegram.ui.Components.blur3.RenderNodeWithHash`
- `invalidate()` -> `void`
- `updateDisplayListIfNeeded()` -> `void`

## `org.telegram.ui.Components.blur3.RenderNodeWithHash$Renderer`
- `renderNodeCalculateHash(IBlur3Hash hash)` -> `default void`

## `org.telegram.ui.Components.blur3.StrokeDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int i)` -> `void`
- `setBackgroundColor(int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setColorProvider(BlurredBackgroundColorProvider colorProvider)` -> `void`
- `setPadding(int padding)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.blur3.ViewGroupPartRenderer`
- `capture(Canvas canvas, RectF position)` -> `void`
- `captureCalculateHash(IBlur3Hash builder, RectF position)` -> `void`

## `org.telegram.ui.Components.blur3.capture.IBlur3Capture`
- `captureCalculateHash(IBlur3Hash builder, RectF position)` -> `default void`

## `org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable`
- `drawSource(Canvas canvas, BlurredBackgroundSource source)` -> `void`
- `static drawStroke(Canvas canvas, float left, float top, float right, float bottom, float[] radii, float strokeWidth, boolean isTop, Paint paint)` -> `void`
- `static drawStroke(Canvas canvas, RectF rect, float radii, float strokeWidth, boolean isTop, Paint paint)` -> `void`
- `static drawStroke(Canvas canvas, float left, float top, float right, float bottom, float radii, float strokeWidth, boolean isTop, Paint paint)` -> `void`
- `enableInAppKeyboardOptimization()` -> `void`
- `getAlpha()` -> `int`
- `getOpacity()` -> `int`
- `getOutline(@NonNull Outline outline)` -> `void`
- `static getOutline(Outline outline, Rect rect, float[] radii)` -> `void`
- `getOutsetX()` -> `int`
- `getOutsetY()` -> `int`
- `getPaddedBounds()` -> `Rect`
- `getPadding(@NonNull Rect padding)` -> `boolean`
- `getPath()` -> `Path`
- `getPositionRelativeSource(RectF position)` -> `void`
- `getSourceOffsetX()` -> `float`
- `getSourceOffsetY()` -> `float`
- `getUnwrappedSource()` -> `BlurredBackgroundSource`
- `getViewOutlineProvider()` -> `ViewOutlineProvider`
- `onBoundPropsChanged()` -> `void`
- `onBoundsChange(@NonNull Rect bounds)` -> `void`
- `onSourceOffsetChange(float sourceOffsetX, float sourceOffsetY)` -> `void`
- `onSourceRelativePositionChanged(RectF position)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setClipToOutline(boolean clipToOutline)` -> `BlurredBackgroundDrawable`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setColorProvider(BlurredBackgroundColorProvider colorProvider)` -> `BlurredBackgroundDrawable`
- `setHasPadding(boolean hasPadding)` -> `BlurredBackgroundDrawable`
- `setIntensity(float intensity)` -> `void`
- `setOutset(int dx, int dy)` -> `BlurredBackgroundDrawable`
- `setPadding(int padding)` -> `BlurredBackgroundDrawable`
- `setRadius(float radius)` -> `BlurredBackgroundDrawable`
- `setRadius(float topLeft, float topRight, float bottomRight, float bottomLeft)` -> `BlurredBackgroundDrawable`
- `setRadius(float topLeft, float topRight, float bottomRight, float bottomLeft, boolean forceBottomZero)` -> `void`
- `setShadowAlpha(float alpha)` -> `void`
- `setShadowParams(float radius, float dx, float dy)` -> `void`
- `setSourceOffset(float sourceOffsetX, float sourceOffsetY)` -> `void`
- `setStrokeWidth(float strokeWidthTop, float strokeWidthBottom)` -> `void`
- `setThickness(int thickness)` -> `BlurredBackgroundDrawable`
- `updateColors()` -> `void`
- `updateDisplayList()` -> `void`

## `org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable$Props`
- `build()` -> `void`
- `draw(Canvas canvas, Paint paint)` -> `void`
- `drawShadows(Canvas canvas, Paint paint, boolean useInAppKeyboardOptimization)` -> `void`

## `org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableRenderNode`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getSource()` -> `BlurredBackgroundSource`
- `hasDisplayList()` -> `boolean`
- `invalidateDisplayList()` -> `void`
- `onBoundPropsChanged()` -> `void`
- `onSourceOffsetChange(float sourceOffsetX, float sourceOffsetY)` -> `void`
- `onSourceRelativePositionChanged(RectF position)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setClipToOutline(boolean clipToOutline)` -> `BlurredBackgroundDrawable`
- `setLiquidGlassEffectAllowed()` -> `void`
- `updateColors()` -> `void`
- `updateDisplayList()` -> `void`

## `org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableSource`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getSource()` -> `BlurredBackgroundSource`

## `org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed`
- `getBackgroundColor()` -> `int`
- `getShadowColor()` -> `int`
- `getStrokeColorBottom()` -> `int`
- `getStrokeColorTop()` -> `int`
- `setAlpha(float alpha)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder`
- `build()` -> `BlurredBackgroundProvider`
- `getBackgroundColor()` -> `int`
- `getShadowColor()` -> `int`
- `getShadowDx()` -> `float`
- `getShadowDy()` -> `float`
- `getShadowRadius()` -> `float`
- `getStrokeColorBottom()` -> `int`
- `getStrokeColorTop()` -> `int`
- `getStrokeWidthBottom()` -> `float`
- `getStrokeWidthTop()` -> `float`
- `setBackgroundColor(ColorProvider colorProvider)` -> `BlurredBackgroundProviderBuilder`
- `setShadowColor(@ColorInt int light, @ColorInt int dark)` -> `BlurredBackgroundProviderBuilder`
- `setShadowColor(ColorProvider colorProvider)` -> `BlurredBackgroundProviderBuilder`
- `setShadowLayer(float radius, float dx, float dy)` -> `BlurredBackgroundProviderBuilder`
- `setStrokeColorBottom(@ColorInt int light, @ColorInt int dark)` -> `BlurredBackgroundProviderBuilder`
- `setStrokeColorBottom(ColorProvider colorProvider)` -> `BlurredBackgroundProviderBuilder`
- `setStrokeColorTop(@ColorInt int light, @ColorInt int dark)` -> `BlurredBackgroundProviderBuilder`
- `setStrokeColorTop(ColorProvider colorProvider)` -> `BlurredBackgroundProviderBuilder`
- `setStrokeWidth(float top, float bottom)` -> `BlurredBackgroundProviderBuilder`

## `org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl`
- `static attachMenuSearch(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`
- `static bottomPanelChatActivity(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`
- `static bulletin(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`
- `static counterMini(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`
- `static emojiViewButton(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`
- `static inputFieldDialogActivity(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`
- `static inputFieldShareAlert(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`
- `static mainTabs(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`
- `static messageMenuBackground(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`
- `static messageMenuReactionsBackground(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`
- `static photoViewer(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`
- `static photoViewerMenu(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`
- `static premiumButton(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`
- `static scrimMenuBackground(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`
- `static searchFloatingDate(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`
- `static shadow(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`
- `static solveSrcColor(int bgColor, int outColor, float alpha)` -> `int`
- `static tabsPanelNoShadow(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`
- `static topPanel(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`
- `static topPanelChatActivity(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`
- `static topPanelChatActivitySearchListBg(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`
- `static topPanelChatActivityTags(Theme.ResourcesProvider resourcesProvider)` -> `BlurredBackgroundProvider`

## `org.telegram.ui.Components.blur3.source.BlurredBackgroundSource`
- `dispatchOnDrawablesRelativePositionChange()` -> `default void`

## `org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap`
- `beginRecording(int width, int height)` -> `Canvas`
- `beginRecording(int width, int height, float scale)` -> `Canvas`
- `createDrawable()` -> `BlurredBackgroundDrawable`
- `draw(Canvas canvas, float left, float top, float right, float bottom)` -> `void`
- `endRecording()` -> `void`
- `getMatrix()` -> `Matrix`
- `inRecording()` -> `boolean`
- `setBitmap(Bitmap bitmap)` -> `void`
- `setMatrix(Matrix matrix)` -> `void`
- `setParentSize(int width, int height, int actionBarHeight)` -> `void`

## `org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor`
- `createDrawable()` -> `BlurredBackgroundDrawable`
- `draw(Canvas canvas, float left, float top, float right, float bottom)` -> `void`
- `getColor()` -> `int`
- `setColor(int color)` -> `void`

## `org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode`
- `beginRecording(int width, int height)` -> `RecordingCanvas`
- `createDrawable()` -> `BlurredBackgroundDrawable`
- `dispatchOnDrawablesRelativePositionChange()` -> `void`
- `draw(Canvas canvas, float left, float top, float right, float bottom)` -> `void`
- `endRecording()` -> `void`
- `getFallbackSource()` -> `BlurredBackgroundSource`
- `getVisiblePositions(List<RectF> positions, int index, int expand)` -> `int`
- `inRecording()` -> `boolean`
- `invalidateDisplayListForDrawables()` -> `void`
- `isRecordingCanvas(Canvas canvas)` -> `boolean`
- `needUpdateDisplayList(int width, int height)` -> `boolean`
- `noClip()` -> `void`
- `setBlur(float radius)` -> `void`
- `setBlur(float radius, RenderEffect effect)` -> `void`
- `setOnDrawablesRelativePositionChangeListener(Runnable callback)` -> `void`
- `setScrollableNoiseSuppressor(DownscaleScrollableNoiseSuppressor scrollableNoiseSuppressor, int index)` -> `void`
- `setSize(int width, int height)` -> `void`
- `setUnderSource(BlurredBackgroundSource underSource)` -> `void`
- `setupRenderer(RenderNodeWithHash.Renderer renderer)` -> `void`
- `updateDisplayListIfNeeded()` -> `void`

## `org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceWrapped`
- `createDrawable()` -> `BlurredBackgroundDrawable`
- `draw(Canvas canvas, float left, float top, float right, float bottom)` -> `void`
- `getSource()` -> `BlurredBackgroundSource`
- `setSource(BlurredBackgroundSource sourceInternal)` -> `void`

## `org.telegram.ui.Components.blur3.utils.BitmapChangeTracker`
- `invalidate()` -> `void`
- `set(Bitmap bitmap)` -> `void`

## `org.telegram.ui.Components.blur3.utils.BitmapMemoizedMetadata`
- `get(Bitmap bitmap)` -> `T`

## `org.telegram.ui.Components.blur3.utils.Blur3Utils`
- `static captureRelativeParent(IBlur3Capture capture, Canvas canvas, RectF position, View view, ViewGroup parent)` -> `void`
- `static captureRelativeParent(IBlur3Capture capture, Canvas canvas, RectF position, View view, ViewGroup parent, int alpha)` -> `void`
- `static wrapCenteredDrawable(Drawable drawable, int w, int h)` -> `Drawable`

## `org.telegram.ui.Components.blur3.utils.NinePatchBuilder`
- `static createNinePatch(Bitmap[] bitmapRef, int fillColor, float[] radii, float shadowRadiusPx, int shadowColor, float shadowDxPx, float shadowDyPx, int centralColorHint)` -> `NinePatchDrawable`
- `static createNinePatch(Bitmap[] bitmapRef, float[] radii, float shadowRadiusPx, float shadowDxPx, float shadowDyPx, int centralColorHint, NinePathRenderer renderer)` -> `NinePatchDrawable`
- `static createNinePatch(Bitmap bitmap, Rect padding, int centerX, int centerY)` -> `NinePatchDrawable`
- `static createNinePatchChunk(int x1, int x2, int y1, int y2, int padLeft, int padTop, int padRight, int padBottom, int centralColorHint)` -> `ByteBuffer`

## `org.telegram.ui.Components.glass.GlassTabView`
- `static createAttachBotTab(Context context, Theme.ResourcesProvider resourcesProvider)` -> `GlassTabView`
- `static createAttachTab(Context context, Theme.ResourcesProvider resourcesProvider)` -> `GlassTabView`
- `static createAvatar(Context context, Theme.ResourcesProvider resourcesProvider, int currentAccount, @StringRes int stringRes)` -> `GlassTabView`
- `static createMainTab(Context context, Theme.ResourcesProvider resourcesProvider, TabAnimation tabAnimation, @StringRes int stringRes)` -> `GlassTabView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `getBackupImageView()` -> `BackupImageView`
- `isTabSelected()` -> `boolean`
- `measureAttachTabWidth()` -> `float`
- `measureTextWidth()` -> `float`
- `measureTextWidth(float textSizeDp)` -> `float`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onPreBind()` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `setAdditionalWidth(int additionalWidth)` -> `void`
- `setAttachBot(TLRPC.User user, TLRPC.TL_attachMenuBot bot, int currentAccount)` -> `void`
- `setAttachBotUser(TLRPC.User user, int currentAccount)` -> `void`
- `setAttachScale(float scale)` -> `void`
- `setCounter(String text, boolean isError, boolean animated)` -> `void`
- `setGestureSelectedOverride(float gestureSelectedOverride, boolean allow)` -> `void`
- `setPremiumBadge(boolean usePremiumBadge)` -> `void`
- `setSelected(boolean selected, boolean animated)` -> `void`
- `setSkipDrawSelector(boolean skipDrawSelector)` -> `void`
- `setTabAnimation(TabAnimation animation)` -> `void`
- `setText(CharSequence text)` -> `void`
- `setTextSizeDp(float textSizeDp)` -> `void`
- `setVisualWidth(float width)` -> `void`
- `updateColorsLottie()` -> `void`
- `updateUserAvatar(int currentAccount)` -> `void`

## `org.telegram.ui.Components.glass.GlassTabsView`
- `setLensBounds(int l, int t, int r, int b)` -> `void`
- `setLensColor(int lensBackgroundColor, int lensForegroundColor)` -> `void`
- `setLensVisibility(float visibility)` -> `void`

## `org.telegram.ui.Components.quickforward.BlurVisibilityDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getAlpha()` -> `int`
- `getOpacity()` -> `int`
- `recycle()` -> `void`
- `render(int width, int height, int blurRadius, float bitmapScale)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setBounds(int left, int top, int right, int bottom)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.DefaultThemesPreviewCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `selectTheme(Theme.ThemeInfo themeInfo)` -> `void`
- `setBackgroundColor(int color)` -> `void`
- `updateColors()` -> `void`
- `updateDayNightMode()` -> `void`
- `updateLayoutManager()` -> `void`

## `org.telegram.ui.FilterCreateActivity$ColorImageSpan`
- `draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, @NonNull Paint paint)` -> `void`

## `org.telegram.ui.FilterCreateActivity$HeaderCellColorPreview`
- `getPreviewTextPaint()` -> `TextPaint`
- `setPreviewColor(int colorId, boolean animated)` -> `void`
- `setPreviewText(CharSequence text, boolean animated)` -> `void`

## `org.telegram.ui.GroupColorActivity`
- `createListView()` -> `void`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getCustomWallpaperLevelMin()` -> `int`
- `getEmojiPackInfoStrRes()` -> `int`
- `getEmojiPackStrRes()` -> `int`
- `getEmojiStatusInfoStrRes()` -> `int`
- `getEmojiStatusLevelMin()` -> `int`
- `getEmojiStatusStrRes()` -> `int`
- `getEmojiStickersLevelMin()` -> `int`
- `getProfileIconLevelMin()` -> `int`
- `getProfileInfoStrRes()` -> `int`
- `getStickerPackInfoStrRes()` -> `int`
- `getStickerPackStrRes()` -> `int`
- `getWallpaper2InfoStrRes()` -> `int`
- `getWallpaperLevelMin()` -> `int`
- `getWallpaperStrRes()` -> `int`
- `needBoostInfoSection()` -> `boolean`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `openBoostDialog(int type)` -> `void`
- `updateButton(boolean animated)` -> `void`
- `updateColors(boolean onlyActionBar)` -> `void`
- `updateRows()` -> `void`

## `org.telegram.ui.PeerColorActivity`
- `static adaptProfileEmojiColor(int color)` -> `int`
- `buy(TL_stars.TL_starGiftUnique gift, Utilities.Callback<Boolean> bought)` -> `void`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `drawEdgeNavigationBar()` -> `boolean`
- `static eq(TLRPC.EmojiStatus emoji_status, TLRPC.TL_emojiStatusCollectible b)` -> `boolean`
- `static eq(TLRPC.TL_peerColorCollectible a, TLRPC.TL_peerColorCollectible b)` -> `boolean`
- `getCurrentPage()` -> `Page`
- `getEdgeToEdgeSupportMode()` -> `EdgeToEdgeSupportMode`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isLightStatusBar()` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFragmentClosed()` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `setForceDark(boolean isDark, boolean playAnimation)` -> `void`
- `setOnApplied(BaseFragment bulletinFragment)` -> `PeerColorActivity`
- `setResourceProvider(Theme.ResourcesProvider resourceProvider)` -> `void`
- `startOnProfile()` -> `PeerColorActivity`
- `toggleTheme()` -> `void`
- `updateLightStatusBar()` -> `void`
- `updateThemeColors()` -> `void`
- `static withLevelLock(CharSequence text, int lvl)` -> `CharSequence`

## `org.telegram.ui.PeerColorActivity$ChangeNameColorCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(TLRPC.Chat chat, boolean divider)` -> `void`
- `set(TLRPC.User user)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.PeerColorActivity$ColoredActionBar`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getActionBarButtonColor()` -> `int`
- `getColor()` -> `int`
- `getTabsViewBackgroundColor()` -> `int`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onUpdateColor()` -> `void`
- `setColor(int currentAccount, int colorId, boolean animated)` -> `void`
- `setColor(MessagesController.PeerColor peerColor, boolean animated)` -> `void`
- `setProgressToGradient(float progress)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.PeerColorActivity$GiftCell$Factory`
- `static asGiftCell(TL_stars.SavedStarGift gift)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `GiftCell`

## `org.telegram.ui.PeerColorActivity$LevelLock`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.PeerColorActivity$Page`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `premiumChanged()` -> `void`
- `seesLoading()` -> `boolean`
- `setupValues()` -> `void`
- `showSelectStatusDialog(SetReplyIconCell cell)` -> `void`
- `update()` -> `void`
- `updateButton(boolean animated)` -> `void`
- `updateColors()` -> `void`
- `updateProfilePreview(boolean animated)` -> `void`
- `updateSelectedGift()` -> `void`

## `org.telegram.ui.PeerColorActivity$Page$EmptyView`
- `updateColors()` -> `void`

## `org.telegram.ui.PeerColorActivity$Page$SetReplyIconCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getColor()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `update(boolean animated)` -> `void`
- `updateColors()` -> `void`
- `updateImageBounds()` -> `void`

## `org.telegram.ui.PeerColorActivity$PeerColorDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `static from(TLRPC.TL_peerColorCollectible peerColorCollectible)` -> `PeerColorDrawable`
- `static from(TLRPC.TL_emojiStatusCollectible emojiStatus)` -> `PeerColorDrawable`
- `static from(int currentAccount, int colorId)` -> `PeerColorDrawable`
- `static from(MessagesController.PeerColor peerColor, boolean fromProfile)` -> `PeerColorDrawable`
- `static fromProfile(int currentAccount, int colorId)` -> `PeerColorDrawable`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setRadius(float r)` -> `PeerColorDrawable`
- `setView(View view)` -> `PeerColorDrawable`
- `stroke(float width, int color)` -> `PeerColorDrawable`

## `org.telegram.ui.PeerColorActivity$PeerColorGrid`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `getColorId()` -> `int`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setCloseAsLock(boolean lock)` -> `void`
- `setDivider(boolean needDivider)` -> `void`
- `setOnColorClick(Utilities.Callback<Integer> onColorClick)` -> `void`
- `setSelected(int colorId, boolean animated)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.PeerColorActivity$PeerColorGrid$ColorButton`
- `draw(Canvas canvas)` -> `void`
- `layout(RectF bounds)` -> `void`
- `layoutClickBounds(RectF bounds)` -> `void`
- `set(int color)` -> `void`
- `set(int color1, int color2)` -> `void`
- `set(MessagesController.PeerColor color)` -> `void`
- `setClose(boolean close)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `setSelected(boolean selected, boolean animated)` -> `void`

## `org.telegram.ui.PeerColorActivity$PeerColorSpan`
- `draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, @NonNull Paint paint)` -> `void`
- `getSize(@NonNull Paint paint, CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm)` -> `int`
- `setSize(int sz)` -> `PeerColorSpan`

## `org.telegram.ui.PeerColorActivity$Tabs`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `set(int id, ArrayList<CharSequence> tabs, int selected, Utilities.Callback<Integer> whenTabSelected)` -> `void`
- `setColors(int backgroundColor, int selectedColor, int textColor, int selectedTextColor)` -> `void`
- `setDrawInList(boolean drawInList)` -> `void`
- `setExternalInvalidate(Runnable externalInvalidate)` -> `void`
- `setSelected(int selected, boolean animated)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.QrActivity$ThemeListViewController`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onCreate()` -> `void`
- `onDataLoaded()` -> `void`
- `onDestroy()` -> `void`
- `onItemClicked(View view, int position)` -> `void`
- `setDarkTheme(boolean isDark)` -> `void`
- `setForceDark(boolean isDark, boolean playAnimation)` -> `void`
- `setItemSelectedListener(OnItemSelectedListener itemSelectedListener)` -> `void`
- `setSelectedPosition(int selectedPosition)` -> `void`

## `org.telegram.ui.QrActivity$ThemeResourcesProvider`
- `getColor(int key)` -> `int`
- `initColors(EmojiThemes theme, boolean isDark)` -> `void`

## `org.telegram.ui.Stories.DarkThemeResourceProvider`
- `appendColors()` -> `void`
- `getAnimatedEmojiColorFilter()` -> `ColorFilter`
- `getColor(int key)` -> `int`
- `getDrawable(String drawableKey)` -> `Drawable`
- `getPaint(String paintKey)` -> `Paint`

## `org.telegram.ui.Stories.recorder.DominantColors`
- `static getColors(boolean smart, Bitmap bitmap, boolean themeIsDark, Utilities.Callback<int[]> callback)` -> `void`
- `static getColorsSync(boolean smart, Bitmap bitmap, boolean themeIsDark)` -> `int[]`

## `org.telegram.ui.Stories.recorder.StoryThemeSheet`
- `dismiss()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `open(StoryEntry entry)` -> `void`
- `updateColors()` -> `void`
- `updateWallpaper()` -> `void`

## `org.telegram.ui.ThemePreviewActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getObserverTag()` -> `int`
- `getResourceProvider()` -> `Theme.ResourcesProvider`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `getThemeDescriptionsInternal()` -> `ArrayList<ThemeDescription>`
- `insideBottomSheet()` -> `boolean`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onBottomSheetCreated()` -> `void`
- `onFailedDownload(String fileName, boolean canceled)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onProgressDownload(String fileName, long downloadedSize, long totalSize)` -> `void`
- `onProgressUpload(String fileName, long uploadedSize, long totalSize, boolean isEncrypted)` -> `void`
- `onResume()` -> `void`
- `onSuccessDownload(String fileName)` -> `void`
- `onTransitionAnimationStart(boolean isOpen, boolean backward)` -> `void`
- `setDelegate(WallpaperActivityDelegate wallpaperActivityDelegate)` -> `void`
- `setDialogId(long dialogId)` -> `void`
- `setForceDark(boolean isDark, boolean playAnimation)` -> `void`
- `setInitialModes(boolean blur, boolean motion, float dim)` -> `void`
- `setOnSwitchDayNightDelegate(DayNightSwitchDelegate delegate)` -> `void`
- `setPatterns(ArrayList<Object> arrayList)` -> `void`
- `setResourceProvider(Theme.ResourcesProvider resourceProvider)` -> `void`
- `static showFor(ChatActivity chatActivity, MessageObject message)` -> `void`
- `toggleTheme()` -> `void`

## `org.telegram.ui.ThemePreviewActivity$BackgroundView`
- `getBackground()` -> `Drawable`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setBackground(Drawable drawable)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.ThemePreviewActivity$BlurButton`
- `getText()` -> `CharSequence`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setLoading(boolean loading)` -> `void`
- `setSubText(CharSequence subtext, boolean animated)` -> `void`
- `setText(CharSequence text)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.ThemePreviewActivity$MessageDrawable`
- `setTop(int top, int backgroundWidth, int backgroundHeight, boolean topNear, boolean bottomNear)` -> `void`
- `setTop(int top, int backgroundWidth, int backgroundHeight, int heightOffset, int blurredViewTopOffset, int blurredViewBottomOffset, boolean topNear, boolean bottomNear)` -> `void`

## `org.telegram.ui.ThemePreviewActivity$MessagesAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup viewGroup, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.ThemePreviewActivity$PatternsAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.ThemePreviewActivity$ThemeDelegate`
- `applyChatServiceMessageColor()` -> `void`
- `applyChatServiceMessageColor(int[] custom, Drawable wallpaperOverride, Drawable currentWallpaper, Float overrideIntensity)` -> `void`
- `applyServiceShaderMatrix(int w, int h, float translationX, float translationY)` -> `void`
- `getColor(int key)` -> `int`
- `getCurrentColor(int key)` -> `int`
- `getDrawable(String drawableKey)` -> `Drawable`
- `getPaint(String paintKey)` -> `Paint`

## `org.telegram.ui.ThemeSetUrlActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`

## `org.telegram.ui.ThemeSetUrlActivity$LinkMovementMethodMy`
- `onTouchEvent(TextView widget, Spannable buffer, MotionEvent event)` -> `boolean`

## `org.telegram.ui.ThemeSetUrlActivity$LinkSpan`
- `onClick(View widget)` -> `void`
- `updateDrawState(TextPaint ds)` -> `void`

## `org.telegram.ui.WallpapersListActivity$ColorCell`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setColor(int value)` -> `void`

## `org.telegram.ui.WallpapersListActivity$ColorWallpaper`
- `getHash()` -> `String`
- `getUrl()` -> `String`

## `org.telegram.ui.bots.AffiliateProgramFragment$ColorfulTextCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(int color, int iconResId, CharSequence title, CharSequence text)` -> `void`
- `setPercent(CharSequence percent)` -> `void`

## `org.telegram.ui.bots.BotWebViewMenuContainer$ActionBarColorsAnimating`
- `getColor(int key)` -> `int`
- `setFrom(int actionBarColor, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `setTo(int actionBarColor, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `updateActionBar(ActionBar actionBar, float progress)` -> `void`

## `org.telegram.ui.web.WebActionBar`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawBackground(Canvas canvas, float h, float alpha, float shadowalpha, boolean withShadow)` -> `void`
- `getBackgroundColor(int i)` -> `int`
- `getBackgroundColor()` -> `int`
- `getInstantViewLoader()` -> `WebInstantView.Loader`
- `getTextColor()` -> `int`
- `getTitle()` -> `String`
- `hideKeyboard()` -> `void`
- `isAddressing()` -> `boolean`
- `isBackButton()` -> `boolean`
- `isSearching()` -> `boolean`
- `occupyStatusBar(boolean occupyStatusBar)` -> `void`
- `onAddressColorsChanged(int backgroundColor, int textColor)` -> `void`
- `onAddressingProgress(float progress)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onOpenedMenu()` -> `void`
- `onScrolledProgress(float delta)` -> `void`
- `setBackButton(boolean show)` -> `void`
- `setBackButtonCached(boolean show)` -> `void`
- `setBackgroundColor(int i, int backgroundColor)` -> `void`
- `setColors(int backgroundColor, boolean animated)` -> `void`
- `setColors(int backgroundColor, float dark, boolean animated)` -> `void`
- `setHasForward(boolean value)` -> `void`
- `setHeight(int h)` -> `void`
- `setIsDangerous(int i, boolean isDangerous, boolean animated)` -> `void`
- `setIsLoaded(boolean value)` -> `void`
- `setIsLocal(boolean local)` -> `void`
- `setIsTonsite(boolean value)` -> `void`
- `setMenuColors(int backgroundColor)` -> `void`
- `setMenuListener(Utilities.Callback<Integer> menuListener)` -> `void`
- `setMenuType(int type)` -> `void`
- `setProgress(float progress)` -> `void`
- `setProgress(int i, float progress)` -> `void`
- `setSubtitle(String subtitle, boolean animated)` -> `void`
- `setSubtitle(int i, String subtitle, boolean animated)` -> `void`
- `setTitle(String title, boolean animated)` -> `void`
- `setTitle(int i, String title, boolean animated)` -> `void`
- `setTransitionProgress(float progress)` -> `void`
- `showAddress(String currentUrl, Utilities.Callback<String> urlCallback)` -> `void`
- `showAddress(boolean show, boolean animated)` -> `void`
- `showSearch(boolean show, boolean animated)` -> `void`
- `swap()` -> `void`
- `topPadding()` -> `int`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.web.WebActionBar$ForwardDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setState(boolean state)` -> `void`

## `org.telegram.ui.web.WebActionBar$Title`
- `draw(Canvas canvas, float w, float h, float alpha)` -> `void`

## `org.telegram.utils.glass.GlassEngine`
- `invalidate()` -> `void`
