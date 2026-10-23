# visual / dialogs (401 методов)

## `org.telegram.ui.ActionBar.AlertDialog$AlertDialogCell`
- `getThemedColor(int key)` -> `int`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setGravity(int gravity)` -> `void`
- `setTextAndIcon(CharSequence text, int icon)` -> `void`
- `setTextColor(int color)` -> `void`

## `org.telegram.ui.Adapters.DialogsAdapter`
- `dialogsEmptyType()` -> `int`
- `didDatabaseCleared()` -> `void`
- `findDialogPosition(long dialogId)` -> `int`
- `fixPosition(int position)` -> `int`
- `fixScrollGap(RecyclerListView animationSupportListView, int p, int offset, boolean hasHiddenArchive, boolean hasStories, boolean hasTabs, boolean oppened)` -> `int`
- `getArchiveHintCellPager()` -> `ViewPager`
- `getChatlistUpdate()` -> `TL_chatlists.TL_chatlists_chatlistUpdates`
- `getCurrentCount()` -> `int`
- `getDialogsCount()` -> `int`
- `getDialogsListIsFrozen()` -> `boolean`
- `getDialogsType()` -> `int`
- `getItem(int i)` -> `Object`
- `getItemCount()` -> `int`
- `getItemHeight(int position)` -> `int`
- `getItemId(int position)` -> `long`
- `getItemViewType(int i)` -> `int`
- `isAllowForwardAsStories()` -> `boolean`
- `isDataSetChanged()` -> `boolean`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `moveDialogs(RecyclerListView recyclerView, int fromPosition, int toPosition)` -> `void`
- `notifyDataSetChanged()` -> `void`
- `notifyItemMoved(int fromPosition, int toPosition)` -> `void`
- `onArchiveSettingsClick()` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int i)` -> `void`
- `onButtonClicked(DialogCell dialogCell)` -> `void`
- `onButtonLongPress(DialogCell dialogCell)` -> `void`
- `onCreateGroupForThisClick()` -> `void`
- `onCreateViewHolder(ViewGroup viewGroup, int viewType)` -> `RecyclerView.ViewHolder`
- `onOpenBot(TLRPC.User user)` -> `void`
- `onReorderStateChanged(boolean reordering)` -> `void`
- `onViewAttachedToWindow(RecyclerView.ViewHolder holder)` -> `void`
- `openHiddenStories()` -> `void`
- `openStory(DialogCell dialogCell, Runnable onDone)` -> `void`
- `pause()` -> `void`
- `resume()` -> `void`
- `setAllowForwardAsStories(boolean allowForwardAsStories)` -> `void`
- `setArchivedPullDrawable(PullForegroundDrawable drawable)` -> `void`
- `setCollapsedView(boolean collapsedView, RecyclerListView listView)` -> `void`
- `setDialogsListFrozen(boolean frozen)` -> `void`
- `setDialogsType(int type)` -> `void`
- `setForceShowEmptyCell(boolean forceShowEmptyCell)` -> `void`
- `setForceUpdatingContacts(boolean forceUpdatingContacts)` -> `void`
- `setIsTransitionSupport()` -> `void`
- `setOpenedDialogId(long id)` -> `void`
- `setRecyclerListView(RecyclerListView recyclerListView)` -> `void`
- `showChatPreview(DialogCell cell)` -> `void`
- `showOpenBotButton()` -> `boolean`
- `sortOnlineContacts(boolean notify)` -> `void`
- `updateHasHints()` -> `void`
- `updateList(Runnable saveScrollPosition)` -> `void`

## `org.telegram.ui.Adapters.DialogsAdapter$DialogsPreloader`
- `clear()` -> `void`
- `pause()` -> `void`
- `preloadedError(long currendDialogId)` -> `boolean`
- `resume()` -> `void`
- `updateList()` -> `void`

## `org.telegram.ui.Adapters.DialogsAdapter$ItemInternal`
- `compare(ItemInternal itemInternal)` -> `boolean`

## `org.telegram.ui.Adapters.DialogsAdapter$LastEmptyView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Adapters.FiltersView`
- `static fillTipDates(String query, ArrayList<DateData> dates)` -> `void`
- `static getDayOfWeek(String q)` -> `int`
- `getFilterAt(int i)` -> `MediaFilterData`
- `static getMonth(String q)` -> `int`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `static isValidFormat(String format, String value, Locale locale)` -> `boolean`
- `onDraw(Canvas c)` -> `void`
- `onInterceptTouchEvent(MotionEvent e)` -> `boolean`
- `onTouchEvent(MotionEvent e)` -> `boolean`
- `setUsersAndDates(ArrayList<Object> localUsers, ArrayList<DateData> dates, boolean archive)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Adapters.FiltersView$Adapter`
- `getItemCount()` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `ViewHolder`

## `org.telegram.ui.Adapters.FiltersView$FilterView`
- `getThemedColor(int key)` -> `int`
- `setData(MediaFilterData data)` -> `void`

## `org.telegram.ui.Adapters.FiltersView$MediaFilterData`
- `getTitle()` -> `String`
- `setDate(DateData dateData)` -> `void`

## `org.telegram.ui.Adapters.FiltersView$UpdateCallback`
- `onChanged(int position, int count, @Nullable Object payload)` -> `void`
- `onInserted(int position, int count)` -> `void`
- `onMoved(int fromPosition, int toPosition)` -> `void`
- `onRemoved(int position, int count)` -> `void`

## `org.telegram.ui.CachedMediaLayout$DialogsAdapter`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `update()` -> `void`

## `org.telegram.ui.Cells.DialogCell`
- `allowBotOpenButton(boolean allow, Utilities.Callback<TLRPC.User> onOpenClick)` -> `DialogCell`
- `animateArchiveAvatar()` -> `void`
- `buildLayout()` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawAvatarOverlays(Canvas canvas)` -> `boolean`
- `drawLock2()` -> `boolean`
- `getClipProgress()` -> `float`
- `getCurrentDialogFolderId()` -> `int`
- `getDialogId()` -> `long`
- `getHasUnread()` -> `boolean`
- `getIsMuted()` -> `boolean`
- `getIsPinned()` -> `boolean`
- `getMessage()` -> `MessageObject`
- `getMessageId()` -> `int`
- `getMessageNameString()` -> `String`
- `getMessageStringFormatted(int messageFormatType, String restrictionReason, CharSequence messageNameString, boolean applyThumbs)` -> `SpannableStringBuilder`
- `getStarsPrice()` -> `long`
- `getTranslationX()` -> `float`
- `invalidate()` -> `void`
- `invalidate(int l, int t, int r, int b)` -> `void`
- `invalidateDrawable(Drawable who)` -> `void`
- `isBlocked()` -> `boolean`
- `isDialogCommunity()` -> `boolean`
- `isDialogFolder()` -> `boolean`
- `isDrawArchive()` -> `boolean`
- `isFolderCell()` -> `boolean`
- `isForumCell()` -> `boolean`
- `isMoving()` -> `boolean`
- `isPointInsideAvatar(float x, float y)` -> `boolean`
- `isUnread()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onPopulateAccessibilityEvent(AccessibilityEvent event)` -> `void`
- `onReorderStateChanged(boolean reordering, boolean animated)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `performAccessibilityAction(int action, Bundle arguments)` -> `boolean`
- `resetPinnedArchiveState()` -> `void`
- `separateMessageNameLine()` -> `boolean`
- `setArchivedPullAnimation(PullForegroundDrawable drawable)` -> `void`
- `setBottomClip(int value)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setClipProgress(float value)` -> `void`
- `setCurrentDialogId(long dialogId)` -> `void`
- `setCustomMessage(String message)` -> `void`
- `setCustomMessageWithoutRebuild(String message)` -> `void`
- `setDialog(TLRPC.Dialog dialog, int type, int folder)` -> `void`
- `setDialog(CustomDialog dialog)` -> `void`
- `setDialog(long dialog_id, MessageObject messageObject, int date, boolean useMe, boolean animated)` -> `void`
- `setDialog(long dialog_id, MessageObject messageObject, ArrayList<MessageObject> groupMessageObject, int date, boolean useMe, boolean animated)` -> `void`
- `setDialogCellDelegate(DialogCellDelegate delegate)` -> `void`
- `setDialogSelected(boolean value)` -> `void`
- `setForumTopic(TLRPC.TL_forumTopic topic, long dialog_id, MessageObject messageObject, boolean showTopicIconInName, boolean animated)` -> `void`
- `setIsShareToStoryCell()` -> `void`
- `setIsTransitionSupport(boolean isTransitionSupport)` -> `void`
- `setMoving(boolean moving)` -> `void`
- `setOpenBotButton(boolean show)` -> `void`
- `setPinForced(boolean value)` -> `void`
- `setPreloader(DialogsAdapter.DialogsPreloader preloader)` -> `void`
- `setRightFragmentOpenedProgress(float rightFragmentOpenedProgress)` -> `void`
- `setSliding(boolean value)` -> `void`
- `setTitleOverride(String s)` -> `void`
- `setTopClip(int value)` -> `void`
- `setTranslationX(float value)` -> `void`
- `setVisible(boolean visibleOnScreen)` -> `void`
- `showPremiumBlocked(boolean show)` -> `void`
- `startOutAnimation()` -> `void`
- `update(int mask)` -> `boolean`
- `update(int mask, boolean animated)` -> `boolean`
- `updateColors()` -> `void`
- `updateMessageThumbs()` -> `void`

## `org.telegram.ui.Cells.DialogCell$BounceInterpolator`
- `getInterpolation(float t)` -> `float`

## `org.telegram.ui.Cells.DialogCell$DialogUpdateHelper`
- `update()` -> `boolean`
- `updateAnimationValues()` -> `void`

## `org.telegram.ui.Cells.DialogCell$FixedWidthSpan`
- `draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint)` -> `void`
- `getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm)` -> `int`

## `org.telegram.ui.Cells.HintDialogCell`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getDialogId()` -> `long`
- `isBlocked()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setColors(int textColorKey, int backgroundColorKey)` -> `void`
- `setDialog(long uid, boolean counter, CharSequence name)` -> `void`
- `showPremiumBlocked()` -> `void`
- `update(int mask)` -> `void`
- `update()` -> `void`

## `org.telegram.ui.Cells.ShareDialogCell`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getCurrentDialog()` -> `long`
- `getImageView()` -> `BackupImageView`
- `getStarsPrice()` -> `long`
- `isBlocked()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `repostToCustomName()` -> `String`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setDialog(long uid, boolean checked, CharSequence name)` -> `void`
- `setTopic(TLRPC.TL_forumTopic topic, boolean animate)` -> `void`
- `setTopic(TLRPC.TL_forumTopic topic, boolean mono, boolean animate)` -> `void`

## `org.telegram.ui.Cells.ShareDialogCell$RepostStoryDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.DialogCellTags`
- `clear()` -> `void`
- `draw(Canvas canvas, int width)` -> `void`
- `update(int currentAccount, int dialogsType, long dialogId)` -> `boolean`

## `org.telegram.ui.Components.DialogCellTags$Tag`
- `static asMore(View view, int n)` -> `Tag`
- `draw(Canvas canvas)` -> `void`
- `static fromFilter(View view, int currentAccount, MessagesController.DialogFilter filter)` -> `Tag`

## `org.telegram.ui.Components.DialogsActivityStatusLayout`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.DialogsActivityTopBubblesFadeView`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `setColor(int color)` -> `void`
- `setPosition(float fadeStart, float fadeHeight)` -> `void`

## `org.telegram.ui.Components.DialogsActivityTopPanelLayout`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `onItemsChanged()` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `setBlurredBackground(BlurredBackgroundDrawable background)` -> `void`
- `setCallFragmentContextView(FragmentContextView fragmentContextView)` -> `void`
- `setDefaultRadiusDp(int defaultRadius)` -> `void`
- `updateColors()` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Components.ShareAlert$ShareDialogsAdapter`
- `getItem(int position)` -> `TLRPC.Dialog`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.SharedMediaLayout$SavedDialogsAdapter`
- `getItemCount()` -> `int`
- `getItemId(int position)` -> `long`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `select(View view)` -> `void`
- `unselectAll()` -> `void`
- `update(boolean notify)` -> `void`

## `org.telegram.ui.DialogsActivity`
- `accountView(int account, boolean selected)` -> `LinearLayout`
- `animateContactsAlpha(float alpha)` -> `void`
- `clickSelectsDialog()` -> `boolean`
- `closeLastFragment()` -> `boolean`
- `closeSearching()` -> `void`
- `createActionBar(Context context)` -> `ActionBar`
- `createSearchViewPager()` -> `void`
- `createUndoView()` -> `void`
- `createView(final Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `didSelectResult(final long dialogId, long topicId, boolean useAlert, final boolean param)` -> `void`
- `didSelectResult(final long dialogId, long topicId, boolean useAlert, final boolean param, TopicsFragment topicsFragment)` -> `void`
- `dismissDialogOnPause(Dialog dialog)` -> `boolean`
- `drawEdgeNavigationBar()` -> `boolean`
- `finishFragment()` -> `void`
- `getAllowGlobalSearch()` -> `boolean`
- `getBackButtonState()` -> `INavigationLayout.BackButtonState`
- `getCommunityId()` -> `long`
- `getContactsAlpha()` -> `float`
- `getCustomSlideTransition(boolean topFragment, boolean backAnimation, float distanceToMove)` -> `Animator`
- `getDialogsArray(int currentAccount, int dialogsType, int folderId, boolean frozen)` -> `ArrayList<TLRPC.Dialog>`
- `getGlassSource()` -> `BlurredBackgroundSourceRenderNode`
- `getListView()` -> `RecyclerListView`
- `getOpenedDialogId()` -> `MessagesStorage.TopicKey`
- `getSearchListView()` -> `RecyclerListView`
- `getSharedMediaCaption()` -> `CharSequence`
- `getSharedMediaEntries()` -> `ArrayList<MediaController.PhotoEntry>`
- `getSharedWebPage()` -> `TLRPC.WebPage`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `getTopPanelAnimatedHeight()` -> `float`
- `getTopPanelAnimatedHeight(int padding)` -> `float`
- `getTopPanelVisibility()` -> `float`
- `getType()` -> `int`
- `getUndoView()` -> `UndoView`
- `static highlightFoundQuote(ChatActivity chatActivity, MessageObject message)` -> `ChatActivity`
- `isArchive()` -> `boolean`
- `isCommunity()` -> `boolean`
- `isLightStatusBar()` -> `boolean`
- `isMainDialogList()` -> `boolean`
- `isPremiumChristmasHintVisible()` -> `boolean`
- `isPremiumHintVisible()` -> `boolean`
- `isPremiumRestoreHintVisible()` -> `boolean`
- `isStarsSubscriptionHintVisible()` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`
- `isWebPagePreviewEnabled()` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onBecomeFullyHidden()` -> `void`
- `onBecomeFullyVisible()` -> `void`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onDialogDismiss(Dialog dialog)` -> `void`
- `onFactorChangeFinished(int id, float finalFactor, FactorAnimator callee)` -> `void`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onGetDebugItems()` -> `List<FloatingDebugController.DebugItem>`
- `onParentScrollToTop()` -> `void`
- `onPause()` -> `void`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `onSlideProgress(boolean isOpen, float progress)` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `onTransitionAnimationProgress(boolean isOpen, float progress)` -> `void`
- `onlyDialogsAdapter()` -> `boolean`
- `openSetAvatar()` -> `void`
- `prepareFragmentToSlide(boolean topFragment, boolean beginSlide)` -> `void`
- `presentFragment(BaseFragment fragment)` -> `boolean`
- `scrollToFolder(int fid)` -> `void`
- `scrollToTop(boolean animated, boolean expandStories)` -> `void`
- `search(String query, boolean animated)` -> `void`
- `setContactsAlpha(float alpha)` -> `void`
- `setDelegate(DialogsActivityDelegate dialogsActivityDelegate)` -> `void`
- `setInPreviewMode(boolean isInPreviewMode)` -> `void`
- `setInitialSearchString(String initialSearchString)` -> `void`
- `setInitialSearchType(int type)` -> `void`
- `setMainTabsActivityController(MainTabsActivityController controller)` -> `void`
- `setOpenedDialogId(long dialogId, long topicId)` -> `void`
- `setPanTranslationOffset(float y)` -> `void`
- `setScrollDisabled(boolean disable)` -> `void`
- `setSearchString(String string)` -> `void`
- `setSharedLink(String url, CharSequence initialCaption)` -> `void`
- `setSharedMedia(ArrayList<MediaController.PhotoEntry> entries, CharSequence initialCaption)` -> `void`
- `setSharedText(CharSequence text, CharSequence initialCaption)` -> `void`
- `setShowSearch(String query, int i)` -> `void`
- `setTitleOverlayText(String title, int titleId, Runnable action)` -> `void`
- `showChatPreview(DialogCell cell)` -> `boolean`
- `showSelectStatusDialog()` -> `void`
- `switchToCurrentSelectedMode(boolean animated)` -> `void`
- `updateSpeedItem(boolean visibleByPosition)` -> `void`
- `updateStatus(TLRPC.User user, boolean animated)` -> `void`
- `updateStoriesVisibility(boolean animated)` -> `void`

## `org.telegram.ui.DialogsActivity$ContentView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawBlurRect(Canvas canvas, float y, Rect rectTmp, Paint blurScrimPaint, boolean top)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `drawList(Canvas blurCanvas, boolean top, ArrayList<IViewWithInvalidateCallback> views)` -> `void`
- `getActionBarFullHeight()` -> `int`
- `getActionBarTop()` -> `int`
- `hasOverlappingRendering()` -> `boolean`
- `invalidateBlur()` -> `void`
- `invalidateOptimized()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(final int widthMeasureSpec, final int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`

## `org.telegram.ui.DialogsActivity$DialogsActivityDelegate`
- `didSelectStories(DialogsActivity fragment)` -> `default boolean`

## `org.telegram.ui.DialogsActivity$DialogsRecyclerView`
- `allowSelectChildAtPosition(View child)` -> `boolean`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getViewOffset()` -> `float`
- `measureBlurTopPadding()` -> `int`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent e)` -> `boolean`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthSpec, int heightSpec)` -> `void`
- `onTouchEvent(MotionEvent e)` -> `boolean`
- `prepareSelectorForAnimation()` -> `void`
- `removeView(View view)` -> `void`
- `setAdapter(RecyclerView.Adapter adapter)` -> `void`
- `setAnimationSupportView(RecyclerListView animationSupportListView, float scrollOffset, boolean opened, boolean backward)` -> `void`
- `setOpenRightFragmentProgress(float progress)` -> `void`
- `setViewsOffset(float viewOffset)` -> `void`
- `updateClip(int[] clip)` -> `void`
- `updateEmptyViewAnimated()` -> `boolean`

## `org.telegram.ui.DialogsActivity$SwipeController`
- `convertToAbsoluteDirection(int flags, int layoutDirection)` -> `int`
- `getAnimationDuration(@NonNull RecyclerView recyclerView, int animationType, float animateDx, float animateDy)` -> `long`
- `getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder)` -> `int`
- `getSwipeEscapeVelocity(float defaultValue)` -> `float`
- `getSwipeThreshold(RecyclerView.ViewHolder viewHolder)` -> `float`
- `getSwipeVelocityThreshold(float defaultValue)` -> `float`
- `onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder source, RecyclerView.ViewHolder target)` -> `boolean`
- `onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState)` -> `void`
- `onSwiped(RecyclerView.ViewHolder viewHolder, int direction)` -> `void`

## `org.telegram.ui.DialogsActivity$ViewPage`
- `isDefaultDialogType()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setTranslationX(float translationX)` -> `void`
- `setTranslationY(float translationY)` -> `void`
- `updateList(boolean animated)` -> `void`

## `org.telegram.ui.ThemePreviewActivity$DialogsAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i)` -> `void`
- `onCreateViewHolder(ViewGroup viewGroup, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.TopicsFragment$TopicDialogCell`
- `buildLayout()` -> `void`
- `drawLock2()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `setAnimatedEmojiDrawable(AnimatedEmojiDrawable animatedEmojiDrawable)` -> `void`
- `setForumIcon(Drawable drawable)` -> `void`
- `setTopicIcon(TLRPC.TL_forumTopic topic)` -> `void`

## `org.telegram.ui.community.CommunityUtils$DialogCellFactory`
- `static asCell(MessagesController.CommunityPeerDialog peerDialog, DialogCell.DialogCellDelegate delegate)` -> `UItem`
- `static asCell(TLRPC.User user, DialogCell.DialogCellDelegate delegate)` -> `UItem`
- `static asCell(TLRPC.Chat chat, DialogCell.DialogCellDelegate delegate)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `contentsEquals(UItem a, UItem b)` -> `boolean`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `DialogCell`
- `equals(UItem a, UItem b)` -> `boolean`
