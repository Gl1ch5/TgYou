# visual / call (882 методов)

## `org.telegram.tgnet.tl.TL_keyboard$TL_inlineButtonTypeCallback`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonCallback_layer117`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonCallback_layer223`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonCallback_layer228`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.ui.CallLogActivity`
- `createActionBar(Context context)` -> `ActionBar`
- `static createCallLink(Context context, int currentAccount, Theme.ResourcesProvider resourceProvider, Runnable done)` -> `void`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getGlassSource()` -> `BlurredBackgroundSourceRenderNode`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSupportEdgeToEdge()` -> `boolean`
- `needDelayOpenAnimation()` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onBecomeFullyVisible()` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onParentScrollToTop()` -> `void`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationStart(boolean isOpen, boolean backward)` -> `void`
- `static openCreateCall(BaseFragment parent)` -> `void`
- `static showCallLinkSheet(Context context, int currentAccount, TLRPC.InputGroupCall inputGroupCall, String link, Theme.ResourcesProvider resourcesProvider, boolean withJoinButton, boolean creator)` -> `void`

## `org.telegram.ui.CallLogActivity$CallCell`
- `set(CallLogRow row, View.OnClickListener imageOnClick)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`

## `org.telegram.ui.CallLogActivity$CallCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `CallCell`
- `static of(CallLogRow row, View.OnClickListener onImageClick)` -> `UItem`

## `org.telegram.ui.CallLogActivity$EmptyTextProgressView`
- `showProgress()` -> `void`
- `showTextView()` -> `void`

## `org.telegram.ui.CallLogActivity$GroupCallCell`
- `setChat(TLRPC.Chat chat, View.OnClickListener onJoinClick)` -> `void`

## `org.telegram.ui.CallLogActivity$GroupCallCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `GroupCallCell`
- `static of(TLRPC.Chat chat, View.OnClickListener onJoinClick)` -> `UItem`

## `org.telegram.ui.Cells.GroupCallInvitedCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getName()` -> `CharSequence`
- `getUser()` -> `TLRPC.User`
- `hasOverlappingRendering()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setData(int account, Long uid, boolean calling, boolean isShadyJoin, boolean isShadyLeft)` -> `void`
- `setDrawDivider(boolean draw)` -> `void`
- `setGrayIconColor(int key, int value)` -> `void`

## `org.telegram.ui.Cells.GroupCallTextCell`
- `getTextView()` -> `SimpleTextView`
- `getValueImageView()` -> `ImageView`
- `getValueTextView()` -> `SimpleTextView`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setColors(int icon, int text)` -> `void`
- `setColorsByKey(int icon, int text)` -> `void`
- `setOffsetFromImage(int value)` -> `void`
- `setText(String text, boolean divider)` -> `void`
- `setTextAndIcon(String text, int resId, boolean divider)` -> `void`
- `setTextAndIcon(String text, Drawable drawable, boolean divider)` -> `void`
- `setTextAndValue(String text, String value, boolean divider)` -> `void`
- `setTextAndValueAndIcon(String text, String value, int resId, boolean divider)` -> `void`
- `setTextAndValueDrawable(String text, Drawable drawable, boolean divider)` -> `void`
- `setTextColor(int color)` -> `void`

## `org.telegram.ui.Cells.GroupCallUserCell`
- `applyParticipantChanges(boolean animated)` -> `void`
- `clickMuteButton()` -> `boolean`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getAvatarImageView()` -> `BackupImageView`
- `getAvatarPosition(int[] pos)` -> `void`
- `getAvatarWavesDrawable()` -> `AvatarWavesDrawable`
- `getClipHeight()` -> `int`
- `getName()` -> `CharSequence`
- `getParticipant()` -> `TLRPC.GroupCallParticipant`
- `getPeerId()` -> `long`
- `hasOverlappingRendering()` -> `boolean`
- `isHandRaised()` -> `boolean`
- `isSelfUser()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onMuteClick(GroupCallUserCell cell)` -> `void`
- `setAboutVisible(boolean visible)` -> `void`
- `setAboutVisibleProgress(int color, float progress)` -> `void`
- `setAmplitude(double value)` -> `void`
- `setData(AccountInstance account, TLRPC.GroupCallParticipant groupCallParticipant, ChatObject.Call call, long self, TLRPC.FileLocation uploadingAvatar, boolean animated)` -> `void`
- `setDrawAvatar(boolean draw)` -> `void`
- `setDrawDivider(boolean draw)` -> `void`
- `setGrayIconColor(int key, int value)` -> `void`
- `setProgressToAvatarPreview(float progressToAvatarPreview)` -> `void`
- `setUploadProgress(float progress, boolean animated)` -> `void`

## `org.telegram.ui.Cells.GroupCallUserCell$AvatarWavesDrawable`
- `draw(Canvas canvas, float cx, float cy, View parentView)` -> `void`
- `getAvatarScale()` -> `float`
- `setAmplitude(double value)` -> `void`
- `setColor(int color)` -> `void`
- `setMuted(int status, boolean animated)` -> `void`
- `setShowWaves(boolean show, View parentView)` -> `void`
- `update()` -> `void`

## `org.telegram.ui.Cells.GroupCallUserCell$VerifiedDrawable`
- `draw(Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Cells.TextSelectionHelper$Callback`
- `onStateChanged(boolean isSelected)` -> `void`
- `onTextCopied()` -> `void`

## `org.telegram.ui.ChangeUsernameActivity$TouchHelperCallback`
- `clearView(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder)` -> `void`
- `getMovementFlags(@NonNull RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder)` -> `int`
- `onChildDraw(@NonNull Canvas c, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive)` -> `void`
- `onMove(@NonNull RecyclerView recyclerView, RecyclerView.ViewHolder source, RecyclerView.ViewHolder target)` -> `boolean`
- `onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState)` -> `void`
- `onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction)` -> `void`

## `org.telegram.ui.ChannelAdminLogActivity$ChatScrollCallback`
- `onEndAnimation()` -> `void`
- `onStartAnimation()` -> `void`
- `recycleView(View view)` -> `void`

## `org.telegram.ui.ChatEditTypeActivity$UsernamesListView$TouchHelperCallback`
- `clearView(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder)` -> `void`
- `getMovementFlags(@NonNull RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder)` -> `int`
- `onChildDraw(@NonNull Canvas c, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive)` -> `void`
- `onMove(@NonNull RecyclerView recyclerView, RecyclerView.ViewHolder source, RecyclerView.ViewHolder target)` -> `boolean`
- `onSelectedChanged(ViewHolder viewHolder, int actionState)` -> `void`
- `onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction)` -> `void`

## `org.telegram.ui.ChatUsersActivity$DiffCallback`
- `areContentsTheSame(int oldItemPosition, int newItemPosition)` -> `boolean`
- `areItemsTheSame(int oldItemPosition, int newItemPosition)` -> `boolean`
- `fillPositions(SparseIntArray sparseIntArray)` -> `void`
- `getNewListSize()` -> `int`
- `getOldListSize()` -> `int`

## `org.telegram.ui.Components.AutoDeletePopupWrapper$Callback`
- `showGlobalAutoDeleteScreen()` -> `default void`

## `org.telegram.ui.Components.Bulletin$Layout$Callback`
- `onAttach(@NonNull Layout layout, @NonNull Bulletin bulletin)` -> `default void`
- `onDetach(@NonNull Layout layout)` -> `default void`
- `onEnterTransitionEnd(@NonNull Layout layout)` -> `default void`
- `onEnterTransitionStart(@NonNull Layout layout)` -> `default void`
- `onExitTransitionEnd(@NonNull Layout layout)` -> `default void`
- `onExitTransitionStart(@NonNull Layout layout)` -> `default void`
- `onHide(@NonNull Layout layout)` -> `default void`
- `onShow(@NonNull Layout layout)` -> `default void`

## `org.telegram.ui.Components.ChatNotificationsPopupWrapper$Callback`
- `dismiss()` -> `default void`
- `openExceptions()` -> `default void`

## `org.telegram.ui.Components.CreateGroupCallBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `dismissInternal()` -> `void`
- `getTitle()` -> `CharSequence`
- `static show(ArrayList<TLRPC.Peer> peers, BaseFragment fragment, long dialogId, JoinCallAlert.JoinCallAlertDelegate joinCallDelegate)` -> `void`

## `org.telegram.ui.Components.EditTextBoldCursor$ActionModeCallback2Wrapper`
- `onActionItemClicked(ActionMode mode, MenuItem item)` -> `boolean`
- `onCreateActionMode(ActionMode mode, Menu menu)` -> `boolean`
- `onDestroyActionMode(ActionMode mode)` -> `void`
- `onGetContentRect(ActionMode mode, View view, Rect outRect)` -> `void`
- `onPrepareActionMode(ActionMode mode, Menu menu)` -> `boolean`

## `org.telegram.ui.Components.FilterTabsView$TouchHelperCallback`
- `clearView(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder)` -> `void`
- `getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder)` -> `int`
- `onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder source, @NonNull RecyclerView.ViewHolder target)` -> `boolean`
- `onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState)` -> `void`
- `onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction)` -> `void`

## `org.telegram.ui.Components.FragmentContextView$CallMessageItem`
- `performDestroy()` -> `void`

## `org.telegram.ui.Components.GroupCallFullscreenAdapter`
- `getItemCount()` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `scrollTo(ChatObject.VideoParticipant videoParticipant, RecyclerListView fullscreenUsersListView)` -> `void`
- `setGroupCall(ChatObject.Call groupCall)` -> `void`
- `setRenderersPool(ArrayList<GroupCallMiniTextureView> attachedRenderers, GroupCallRenderersContainer renderersContainer)` -> `void`
- `setVisibility(RecyclerListView listView, boolean visibility)` -> `void`
- `update(boolean animated, RecyclerListView listView)` -> `void`

## `org.telegram.ui.Components.GroupCallFullscreenAdapter$GroupCallUserCell`
- `attachRenderer(boolean attach)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `drawOverlays(Canvas canvas)` -> `void`
- `getAvatarImageView()` -> `BackupImageView`
- `getParticipant()` -> `TLRPC.GroupCallParticipant`
- `getPeerId()` -> `long`
- `getProgressToFullscreen()` -> `float`
- `getRenderer()` -> `GroupCallMiniTextureView`
- `getVideoParticipant()` -> `ChatObject.VideoParticipant`
- `invalidate()` -> `void`
- `isRemoving(RecyclerListView listView)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onStatusChanged()` -> `void`
- `setAlpha(float alpha)` -> `void`
- `setAmplitude(double value)` -> `void`
- `setParticipant(ChatObject.VideoParticipant videoParticipant, TLRPC.GroupCallParticipant participant)` -> `void`
- `setProgressToFullscreen(float progress)` -> `void`
- `setRenderer(GroupCallMiniTextureView renderer)` -> `void`
- `updateState(boolean animated)` -> `void`

## `org.telegram.ui.Components.GroupCallRecordAlert`
- `onStartRecord(@ChatObject.Call.RecordType int type)` -> `void`

## `org.telegram.ui.Components.GroupCallRecordAlert$Adapter`
- `destroyItem(ViewGroup container, int position, Object object)` -> `void`
- `getCount()` -> `int`
- `instantiateItem(ViewGroup container, int position)` -> `Object`
- `restoreState(Parcelable arg0, ClassLoader arg1)` -> `void`
- `setPrimaryItem(ViewGroup container, int position, Object object)` -> `void`
- `unregisterDataSetObserver(DataSetObserver observer)` -> `void`

## `org.telegram.ui.Components.GroupVoipInviteAlert`
- `onSearchViewTouched(MotionEvent ev, EditTextBoldCursor searchEditText)` -> `void`
- `search(String text)` -> `void`
- `setDelegate(GroupVoipInviteAlertDelegate groupVoipInviteAlertDelegate)` -> `void`
- `updateColorKeys()` -> `void`

## `org.telegram.ui.Components.GroupVoipInviteAlert$ListAdapter`
- `getItem(int position)` -> `TLObject`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewRecycled(RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.Components.GroupVoipInviteAlert$SearchAdapter`
- `getItem(int i)` -> `TLObject`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewRecycled(RecyclerView.ViewHolder holder)` -> `void`
- `searchUsers(final String query)` -> `void`

## `org.telegram.ui.Components.JoinCallAlert`
- `dismissInternal()` -> `void`
- `static open(Context context, long did, AccountInstance accountInstance, BaseFragment fragment, int type, TLRPC.Peer scheduledPeer, JoinCallAlertDelegate delegate)` -> `void`
- `static resetCache()` -> `void`

## `org.telegram.ui.Components.JoinCallAlert$BottomSheetCell`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setText(CharSequence text, boolean animated)` -> `void`

## `org.telegram.ui.Components.JoinCallAlert$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.Components.JoinCallByUrlAlert`
- `dismissInternal()` -> `void`
- `onJoin()` -> `void`

## `org.telegram.ui.Components.JoinCallByUrlAlert$BottomSheetCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setText(CharSequence text)` -> `void`

## `org.telegram.ui.Components.ListView.AdapterWithDiffUtils$DiffUtilsCallback`
- `areContentsTheSame(int oldItemPosition, int newItemPosition)` -> `boolean`
- `areItemsTheSame(int oldItemPosition, int newItemPosition)` -> `boolean`
- `getNewListSize()` -> `int`
- `getOldListSize()` -> `int`
- `setItems(ArrayList<? extends Item> oldItems, ArrayList<? extends Item> newItems)` -> `void`

## `org.telegram.ui.Components.RecyclerAnimationScrollHelper$AnimationCallback`
- `ignoreView(View view, boolean ignore)` -> `void`
- `onEndAnimation()` -> `void`
- `onPreAnimation()` -> `void`
- `onStartAnimation()` -> `void`
- `recycleView(View view)` -> `void`

## `org.telegram.ui.Components.SearchDownloadsContainer$TouchHelperCallback`
- `clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder)` -> `void`
- `getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder)` -> `int`
- `onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive)` -> `void`
- `onMove(RecyclerView recyclerView, RecyclerView.ViewHolder source, RecyclerView.ViewHolder target)` -> `boolean`
- `onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState)` -> `void`
- `onSwiped(RecyclerView.ViewHolder viewHolder, int direction)` -> `void`

## `org.telegram.ui.Components.SlideChooseView$Callback`
- `onTouchEnd()` -> `default void`

## `org.telegram.ui.Components.UniversalRecyclerView$TouchHelperCallback`
- `clearView(@NonNull RecyclerView recyclerView, @NonNull ViewHolder viewHolder)` -> `void`
- `getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull ViewHolder viewHolder)` -> `int`
- `onChildDraw(@NonNull Canvas c, @NonNull RecyclerView recyclerView, @NonNull ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive)` -> `void`
- `onMove(@NonNull RecyclerView recyclerView, @NonNull ViewHolder viewHolder, @NonNull ViewHolder target)` -> `boolean`
- `onMoved(@NonNull RecyclerView recyclerView, @NonNull ViewHolder viewHolder, int fromPos, @NonNull ViewHolder target, int toPos, int x, int y)` -> `void`
- `onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState)` -> `void`
- `onSwiped(@NonNull ViewHolder viewHolder, int direction)` -> `void`

## `org.telegram.ui.Components.conference.GroupCallActivityButtonsLayout`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setButtonEnabled(VoIPToggleButton view, boolean enabled, boolean animated)` -> `void`
- `setButtonVisibility(VoIPToggleButton view, boolean visible, boolean animated)` -> `void`

## `org.telegram.ui.Components.conference.GroupCallActivityButtonsLayout$ButtonHolder`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`

## `org.telegram.ui.Components.conference.message.GroupCallMessageCell`
- `static concat(CharSequence name, CharSequence message)` -> `CharSequence`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `getReactionCenterX()` -> `float`
- `isInsideBubble(float x, float y)` -> `boolean`
- `needClickAt(View view, float x, float y)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onClickAt(View view, float x, float y)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `set(GroupCallMessage message)` -> `void`
- `setBackgroundColor(int color)` -> `void`
- `setDelegate(@Nullable Delegate delegate)` -> `void`
- `setRenderNode(View blurRoot, RenderNode renderNode, float scale)` -> `void`
- `setSingleLine()` -> `void`

## `org.telegram.ui.Components.conference.message.GroupCallMessageCell$Delegate`
- `didClickAvatar(GroupCallMessageCell cell, GroupCallMessage message, float x, float y)` -> `default void`
- `didClickSenderName(GroupCallMessageCell cell, GroupCallMessage message)` -> `default void`

## `org.telegram.ui.Components.conference.message.GroupCallMessageCell$Layout`
- `static build(int width, int paddingLeft, int paddingRight, SpoilersTextView textView, ReactionsLayoutInBubble.VisibleReaction reaction)` -> `Layout`

## `org.telegram.ui.Components.conference.message.GroupCallMessagesAdapter`
- `attach()` -> `void`
- `detach()` -> `void`
- `getItemCount()` -> `int`
- `getMessage(int position)` -> `GroupCallMessage`
- `onBindViewHolder(@NonNull GroupCallMessageCell.VH holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `GroupCallMessageCell.VH`
- `onNewGroupCallMessage(long callId, GroupCallMessage message)` -> `void`
- `onPopGroupCallMessage()` -> `void`
- `setGroupCall(int currentAccount, TLRPC.InputGroupCall call)` -> `void`

## `org.telegram.ui.Components.conference.message.GroupCallMessagesListView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setBlurRoot(View blurRoot)` -> `void`
- `setClickCellDelegate(GroupCallMessageCell.Delegate delegate)` -> `void`
- `setDelegate(Delegate delegate)` -> `void`
- `setGroupCall(int currentAccount, TLRPC.InputGroupCall call)` -> `void`
- `setRenderNode(RenderNode renderNode, float scale)` -> `void`
- `setTranslationY(float translationY)` -> `void`
- `setVisibleHeight(int visibleHeight)` -> `void`

## `org.telegram.ui.Components.voip.AcceptDeclineView`
- `drawableStateChanged()` -> `void`
- `getAccessibilityNodeProvider()` -> `AccessibilityNodeProvider`
- `jumpDrawablesToCurrentState()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onHoverEvent(MotionEvent event)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setListener(Listener listener)` -> `void`
- `setRetryMod(boolean retryMod)` -> `void`
- `stopAnimations()` -> `void`
- `verifyDrawable(@NonNull Drawable drawable)` -> `boolean`

## `org.telegram.ui.Components.voip.AcceptDeclineView$AcceptDeclineAccessibilityNodeProvider`
- `createAccessibilityNodeInfo(int virtualViewId)` -> `AccessibilityNodeInfo`
- `onHoverEvent(MotionEvent event)` -> `boolean`
- `performAction(int virtualViewId, int action, Bundle arguments)` -> `boolean`

## `org.telegram.ui.Components.voip.CallSwipeView`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onPopulateAccessibilityEvent(AccessibilityEvent ev)` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `reset()` -> `void`
- `setColor(int color)` -> `void`
- `setListener(Listener listener)` -> `void`
- `setViewToDrag(View viewToDrag, boolean dragFromRight)` -> `void`
- `startAnimatingArrows()` -> `void`
- `stopAnimatingArrows()` -> `void`

## `org.telegram.ui.Components.voip.CallSwipeView$ArrowAnimWrapper`
- `getArrowAlpha()` -> `int`
- `setArrowAlpha(int value)` -> `void`

## `org.telegram.ui.Components.voip.CellFlickerDrawable`
- `draw(Canvas canvas, RectF rectF, float rad, View view)` -> `void`
- `draw(Canvas canvas, Path path, View view)` -> `void`
- `draw(Canvas canvas, GroupCallMiniTextureView view)` -> `void`
- `getDrawableInterface(View parentView, SvgHelper.SvgDrawable drawable)` -> `DrawableInterface`
- `getProgress()` -> `float`
- `setAlpha(int alpha)` -> `void`
- `setColors(int color)` -> `void`
- `setColors(int color, int alpha1, int alpha2)` -> `void`
- `setOnRestartCallback(Runnable runnable)` -> `void`
- `setParentWidth(int parentWidth)` -> `void`
- `setProgress(float progress)` -> `void`
- `setStrokeWidth(float width)` -> `void`

## `org.telegram.ui.Components.voip.CellFlickerDrawable$DrawableInterface`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.voip.CheckableImageView`
- `isChecked()` -> `boolean`
- `onCreateDrawableState(final int extraSpace)` -> `int[]`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `setChecked(final boolean checked)` -> `void`
- `toggle()` -> `void`

## `org.telegram.ui.Components.voip.EmojiRationalLayout`
- `dispatchDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.Components.voip.EndCloseLayout`
- `getEndCloseView()` -> `EndCloseView`
- `switchToClose(OnClickListener onClickListener, boolean animate)` -> `void`

## `org.telegram.ui.Components.voip.EndCloseLayout$EndCloseView`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawableStateChanged()` -> `void`
- `jumpDrawablesToCurrentState()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `verifyDrawable(@NonNull Drawable drawable)` -> `boolean`

## `org.telegram.ui.Components.voip.FabBackgroundDrawable`
- `draw(Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `getPadding(Rect padding)` -> `boolean`
- `onBoundsChange(Rect bounds)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.voip.GroupCallGridCell`
- `getItemHeight()` -> `float`
- `getParticipant()` -> `ChatObject.VideoParticipant`
- `getRenderer()` -> `GroupCallMiniTextureView`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setData(AccountInstance accountInstance, ChatObject.VideoParticipant participant, ChatObject.Call call, long selfPeerId)` -> `void`
- `setRenderer(GroupCallMiniTextureView renderer)` -> `void`

## `org.telegram.ui.Components.voip.GroupCallMiniTextureView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `forceDetach(boolean removeSink)` -> `void`
- `getName()` -> `String`
- `static getOrCreate(ArrayList<GroupCallMiniTextureView> attachedRenderers, GroupCallRenderersContainer renderersContainer, GroupCallGridCell primaryView, GroupCallFullscreenAdapter.GroupCallUserCell secondaryView, GroupCallGridCell tabletGridView, ChatObject.VideoParticipant participant, ChatObject.Call call, GroupCallActivity activity)` -> `GroupCallMiniTextureView`
- `getPrimaryView()` -> `GroupCallGridCell`
- `getRenderBufferBitmap(GlGenericDrawer.TextureCallback callback)` -> `void`
- `invalidate()` -> `void`
- `isAttached()` -> `boolean`
- `isFullyVisible()` -> `boolean`
- `isInsideStopScreenButton(float x, float y)` -> `boolean`
- `isVisible()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onStatusChanged()` -> `void`
- `release()` -> `void`
- `runDelayedAnimations()` -> `void`
- `runOnFrameRendered(Runnable runnable)` -> `void`
- `setAmplitude(double value)` -> `void`
- `setFullscreenMode(boolean fullscreenMode, boolean animated)` -> `void`
- `setPrimaryView(GroupCallGridCell primaryView)` -> `void`
- `setSecondaryView(GroupCallFullscreenAdapter.GroupCallUserCell secondaryView)` -> `void`
- `setShowingAsScrimView(boolean showing, boolean animated)` -> `void`
- `setShowingInFullscreen(boolean showing, boolean animated)` -> `void`
- `setSwipeToBack(boolean swipeToBack, float swipeToBackDy)` -> `void`
- `setTabletGridView(GroupCallGridCell tabletGridView)` -> `void`
- `setViews(GroupCallGridCell primaryView, GroupCallFullscreenAdapter.GroupCallUserCell secondaryView, GroupCallGridCell tabletGrid)` -> `void`
- `setVisibility(int visibility)` -> `void`
- `setZoom(boolean inPinchToZoom, float pinchScale, float pinchCenterX, float pinchCenterY, float pinchTranslationX, float pinchTranslationY)` -> `void`
- `startFlipAnimation()` -> `void`
- `updateAttachState(boolean animated)` -> `void`
- `updateInfo()` -> `void`
- `updatePosition(ViewGroup listView, ViewGroup tabletGridListView, RecyclerListView fullscreenListView, GroupCallRenderersContainer renderersContainer)` -> `void`
- `updateSize(int collapseSize)` -> `void`

## `org.telegram.ui.Components.voip.GroupCallMiniTextureView$NoVideoStubLayout`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAmplitude(double value)` -> `void`

## `org.telegram.ui.Components.voip.GroupCallRenderersContainer`
- `attach(GroupCallMiniTextureView view)` -> `void`
- `autoPinEnabled()` -> `boolean`
- `delayHideUi()` -> `void`
- `detach(GroupCallMiniTextureView view)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getUndoView()` -> `UndoView`
- `hideUi()` -> `void`
- `isAnimating()` -> `boolean`
- `isUiVisible()` -> `boolean`
- `isVisible(TLRPC.GroupCallParticipant participant)` -> `boolean`
- `onBackPressed()` -> `void`
- `onFullScreenModeChanged(boolean startAnimaion)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `onUiVisibilityChanged()` -> `void`
- `setAmplitude(TLRPC.GroupCallParticipant participant, float v)` -> `void`
- `setGroupCall(ChatObject.Call call)` -> `void`
- `setIsTablet(boolean tablet)` -> `void`
- `setProgressToHideUi(float progressToHideUi)` -> `void`
- `setVisibleParticipant(boolean animated)` -> `void`
- `update()` -> `void`

## `org.telegram.ui.Components.voip.GroupCallStatusIcon`
- `setAmplitude(double value)` -> `void`
- `setCallback(Callback callback)` -> `void`
- `setImageView(RLottieImageView iconView)` -> `void`
- `setParticipant(TLRPC.GroupCallParticipant participant, boolean animated)` -> `void`
- `updateIcon(boolean animated)` -> `void`

## `org.telegram.ui.Components.voip.HideEmojiTextView`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.Components.voip.ImageWithWavesView`
- `onConnected()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onNeedRating()` -> `void`
- `setAmplitude(double value)` -> `void`
- `setImage(ImageLocation imageLocation, String imageFilter, String ext, Drawable thumb, Object parentObject)` -> `void`
- `setImage(ImageLocation imageLocation, String imageFilter, Drawable thumb, Object parentObject)` -> `void`
- `setMute(boolean isMuted, boolean isFast)` -> `void`
- `setRoundRadius(int value)` -> `void`
- `setShowWaves(boolean showWaves)` -> `void`

## `org.telegram.ui.Components.voip.ImageWithWavesView$AvatarWavesDrawable`
- `draw(Canvas canvas, float cx, float cy, View parentView)` -> `void`
- `setAmplitude(double value)` -> `void`
- `setMuteToStatic(boolean mute, boolean isFast, View parentView)` -> `void`
- `setShowWaves(boolean show, View parentView)` -> `void`
- `update()` -> `void`

## `org.telegram.ui.Components.voip.PrivateVideoPreviewDialog`
- `dismiss(boolean screencast, boolean apply)` -> `void`
- `getBackgroundColor()` -> `int`
- `invalidate()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onCameraFirstFrameAvailable()` -> `void`
- `onCameraSwitch(boolean isFrontFace)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDismiss(boolean screencast, boolean apply)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBottomPadding(int padding)` -> `void`
- `update()` -> `void`

## `org.telegram.ui.Components.voip.PrivateVideoPreviewDialog$Adapter`
- `destroyItem(ViewGroup container, int position, Object object)` -> `void`
- `getCount()` -> `int`
- `instantiateItem(ViewGroup container, int position)` -> `Object`
- `restoreState(Parcelable arg0, ClassLoader arg1)` -> `void`
- `setPrimaryItem(ViewGroup container, int position, Object object)` -> `void`
- `unregisterDataSetObserver(DataSetObserver observer)` -> `void`

## `org.telegram.ui.Components.voip.PrivateVideoPreviewDialogNew`
- `afterOpened()` -> `void`
- `beforeClosed()` -> `void`
- `dismiss(boolean screencast, boolean apply)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getFloatingViewLocation()` -> `int[]`
- `isHasVideoOnMainScreen()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onCameraFirstFrameAvailable()` -> `void`
- `onCameraSwitch(boolean isFrontFace)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDismiss(boolean screencast, boolean apply)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBottomPadding(int padding)` -> `void`
- `update()` -> `void`

## `org.telegram.ui.Components.voip.RateCallLayout`
- `show(OnRateSelected onRateSelected)` -> `void`

## `org.telegram.ui.Components.voip.RateCallLayout$RateCallContainer`
- `dispatchDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.Components.voip.RateCallLayout$StarContainer`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `drawableStateChanged()` -> `void`
- `jumpDrawablesToCurrentState()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `setAllStarsProvider(AllStarsProvider allStarsProvider)` -> `void`
- `setOnSelectedStar(OnSelectedStar onSelectedStar, int pos)` -> `void`
- `verifyDrawable(@NonNull Drawable drawable)` -> `boolean`

## `org.telegram.ui.Components.voip.VoIPBackgroundProvider`
- `attach(View view)` -> `void`
- `detach(View view)` -> `void`
- `getDarkCanvas()` -> `Canvas`
- `getDarkPaint()` -> `Paint`
- `getDarkPaint(boolean ignoreShader)` -> `Paint`
- `getDegree()` -> `int`
- `getLightCanvas()` -> `Canvas`
- `getLightPaint()` -> `Paint`
- `getRevealCanvas()` -> `Canvas`
- `getRevealDarkPaint()` -> `Paint`
- `getRevealDrakCanvas()` -> `Canvas`
- `getRevealPaint()` -> `Paint`
- `getTotalHeight()` -> `int`
- `getTotalWidth()` -> `int`
- `invalidateViews()` -> `void`
- `isReveal()` -> `boolean`
- `setDarkTranslation(float x, float y)` -> `void`
- `setDegree(int degree)` -> `void`
- `setHasVideo(boolean hasVideo)` -> `void`
- `setLightTranslation(float x, float y)` -> `void`
- `setReveal(boolean clipping)` -> `void`
- `setTotalHeight(int totalHeight)` -> `void`
- `setTotalSize(int totalWidth, int totalHeight)` -> `void`

## `org.telegram.ui.Components.voip.VoIPButtonsLayout`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChildSize(int childSize)` -> `void`
- `setUseStartPadding(boolean startPadding)` -> `void`

## `org.telegram.ui.Components.voip.VoIPEllipsizeSpan`
- `draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, @NonNull Paint paint)` -> `void`
- `getSize(@NonNull Paint paint, CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm)` -> `int`

## `org.telegram.ui.Components.voip.VoIPFloatingLayout`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `restoreRelativePosition()` -> `void`
- `setBottomOffset(int bottomOffset, boolean animated)` -> `void`
- `setCornerRadius(float cornerRadius)` -> `void`
- `setDelegate(VoIPFloatingLayoutDelegate voIPFloatingLayoutDelegate)` -> `void`
- `setFloatingMode(boolean show, boolean animated)` -> `void`
- `setInsets(WindowInsets lastInsets)` -> `void`
- `setIsActive(boolean b)` -> `void`
- `setMuted(boolean muted, boolean animated)` -> `void`
- `setOnTapListener(OnClickListener tapListener)` -> `void`
- `setRelativePosition(float x, float y)` -> `void`
- `setRelativePosition(VoIPFloatingLayout fromLayout)` -> `void`
- `setUiVisible(boolean uiVisible)` -> `void`

## `org.telegram.ui.Components.voip.VoIPHelper`
- `static getDataSavingDefault()` -> `int`
- `static getLogFilePath(String name)` -> `String`
- `static getLogFilePath(String callId, boolean stats)` -> `String`
- `static getLogsDir()` -> `File`
- `static joinConference(Activity activity, int account, TLRPC.InputGroupCall inputGroupCall, boolean videoCall, TLRPC.GroupCall preloadedCall)` -> `void`
- `static joinConference(Activity activity, int account, TLRPC.InputGroupCall inputGroupCall, boolean videoCall, TLRPC.GroupCall preloadedCall, HashSet<Long> inviteUsers)` -> `void`
- `static permissionDenied(final Activity activity, final Runnable onFinish, int code)` -> `void`
- `static showCallDebugSettings(final Context context)` -> `void`
- `static showGroupCallAlert(BaseFragment fragment, TLRPC.Chat currentChat, TLRPC.InputPeer peer, boolean recreate, AccountInstance accountInstance)` -> `void`
- `static showRateAlert(Context context, TLRPC.TL_messageActionPhoneCall call)` -> `void`
- `static showRateAlert(final Context context, final Runnable onDismiss, boolean isVideo, final long callID, final long accessHash, final int account, final boolean userInitiative)` -> `void`
- `static startCall(TLRPC.User user, boolean videoCall, boolean canVideoCall, final Activity activity, TLRPC.UserFull userFull, AccountInstance accountInstance)` -> `void`
- `static startCall(TLRPC.Chat chat, TLRPC.InputPeer peer, String hash, boolean createCall, Activity activity, BaseFragment fragment, AccountInstance accountInstance)` -> `void`
- `static startCall(TLRPC.Chat chat, TLRPC.InputPeer peer, String hash, boolean createCall, Boolean checkJoiner, Activity activity, BaseFragment fragment, AccountInstance accountInstance)` -> `void`

## `org.telegram.ui.Components.voip.VoIPNotificationsLayout`
- `animateLayoutChanges()` -> `void`
- `beforeLayoutChanges()` -> `void`
- `ellipsize(CharSequence text)` -> `CharSequence`
- `getChildsHight()` -> `int`
- `setOnViewsUpdated(Runnable onViewsUpdated)` -> `void`

## `org.telegram.ui.Components.voip.VoIPNotificationsLayout$NotificationView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `setText(CharSequence text)` -> `void`
- `startAnimation()` -> `void`

## `org.telegram.ui.Components.voip.VoIPOverlayBackground`
- `onDraw(Canvas canvas)` -> `void`
- `setBackground(final ImageReceiver.BitmapHolder src)` -> `void`
- `setShowBlackout(boolean showBlackout, boolean animated)` -> `void`

## `org.telegram.ui.Components.voip.VoIPStatusTextView`
- `setDrawCallIcon()` -> `void`
- `setSignalBarCount(int count)` -> `void`
- `setText(String text, boolean ellipsis, boolean animated)` -> `void`
- `showBadConnection(boolean showBadConnection, boolean animated)` -> `void`
- `showReconnect(boolean showReconnecting, boolean animated)` -> `void`
- `showTimer(boolean animated)` -> `void`

## `org.telegram.ui.Components.voip.VoIPTextureView`
- `animateToLayout()` -> `void`
- `attachBackgroundRenderer()` -> `void`
- `detachBackgroundRenderer()` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getPlaceholderView()` -> `View`
- `isInAnimation()` -> `boolean`
- `onFirstFrameRendered()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `reattachBackgroundRenderer()` -> `void`
- `setAnimateNextDuration(long animateNextDuration)` -> `void`
- `setAnimateWithParent(boolean b)` -> `void`
- `setCliping(float horizontalClip, float verticalClip)` -> `void`
- `setIsScreencast(boolean value)` -> `void`
- `setRoundCorners(float radius)` -> `void`
- `setScreenshareMiniProgress(float progress, boolean value)` -> `void`
- `setStub(VoIPTextureView from)` -> `void`
- `setThumb(Bitmap thumb)` -> `void`
- `synchOrRunAnimation(Animator animator)` -> `void`
- `updateRendererSize()` -> `void`
- `updateRotation()` -> `void`

## `org.telegram.ui.Components.voip.VoIPTimerView`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setDrawCallIcon()` -> `void`
- `setSignalBarCount(int count)` -> `void`
- `setVisibility(int visibility)` -> `void`
- `updateTimer()` -> `void`

## `org.telegram.ui.Components.voip.VoIPToggleButton`
- `drawableStateChanged()` -> `void`
- `getTextView()` -> `View`
- `isChecked()` -> `boolean`
- `jumpDrawablesToCurrentState()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `setBackgroundColor(int backgroundColor, int backgroundColorChecked)` -> `void`
- `setCheckable(boolean checkable)` -> `void`
- `setChecked(boolean value, boolean animated)` -> `void`
- `setCrossOffset(float crossOffset)` -> `void`
- `setData(int iconRes, int iconColor, int backgroundColor, String text, boolean cross, boolean animated)` -> `void`
- `setData(int iconRes, int iconColor, int backgroundColor, float selectorAlpha, boolean recreateRipple, String text, boolean cross, boolean animated)` -> `void`
- `setDrawBackground(boolean value)` -> `void`
- `setDrawRipple(boolean value)` -> `void`
- `setPressedBtn(boolean pressed)` -> `void`
- `setTextSize(int size)` -> `void`
- `shakeView()` -> `void`
- `showText(boolean show, boolean animated)` -> `void`
- `verifyDrawable(@NonNull Drawable drawable)` -> `boolean`

## `org.telegram.ui.Components.voip.VoIPWindowView`
- `createWindowLayoutParams()` -> `WindowManager.LayoutParams`
- `finish()` -> `void`
- `finish(long animDuration)` -> `void`
- `finishImmediate()` -> `void`
- `isLockOnScreen()` -> `boolean`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setLockOnScreen(boolean lock)` -> `void`
- `startEnterTransition()` -> `void`

## `org.telegram.ui.Components.voip.VoIpBitmapTextView`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Components.voip.VoIpCoverView`
- `onAttachedToWindow()` -> `void`
- `onConnected()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onEmojiExpanded(boolean expanded)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `setState(boolean isPaused)` -> `void`

## `org.telegram.ui.Components.voip.VoIpGradientLayout`
- `hideBadConnection()` -> `void`
- `isConnectedCalled()` -> `boolean`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `pause()` -> `void`
- `resume()` -> `void`
- `showToBadConnection()` -> `void`
- `switchToCallConnected(int x, int y)` -> `void`
- `switchToCallConnected(int x, int y, boolean animated)` -> `void`
- `switchToCalling()` -> `void`

## `org.telegram.ui.Components.voip.VoIpGradientLayout$PureColorDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.voip.VoIpHintView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawBgPath(Canvas canvas, float alpha)` -> `void`

## `org.telegram.ui.Components.voip.VoIpSnowView`
- `onDraw(Canvas canvas)` -> `void`
- `setState(boolean isPaused)` -> `void`

## `org.telegram.ui.Components.voip.VoIpSwitchLayout`
- `setOnBtnClickedListener(VoIpButtonView.OnBtnClickedListener onBtnClickedListener)` -> `void`
- `setType(Type newType, boolean isSelected)` -> `void`
- `setType(Type newType, boolean isSelected, boolean fast)` -> `void`

## `org.telegram.ui.Components.voip.VoIpSwitchLayout$VoIpButtonView`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setOnBtnClickedListener(OnBtnClickedListener onBtnClickedListener)` -> `void`
- `setSelectedState(boolean selectedState, boolean animate, Type type)` -> `void`

## `org.telegram.ui.Components.voip.VoipBlobDrawable`
- `generateBlob(float[] radius, float[] angle, int i, float muteToStaticProgress)` -> `void`
- `update(float amplitude, float speedScale, float muteToStaticProgress)` -> `void`

## `org.telegram.ui.Components.voip.VoipCoverEmoji`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(int width, int height)` -> `void`
- `setPosition(int x, int y)` -> `void`

## `org.telegram.ui.CreateGroupCallSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `getTitle()` -> `CharSequence`

## `org.telegram.ui.EditWidgetActivity$TouchHelperCallback`
- `clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder)` -> `void`
- `getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder)` -> `int`
- `onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive)` -> `void`
- `onMove(RecyclerView recyclerView, RecyclerView.ViewHolder source, RecyclerView.ViewHolder target)` -> `boolean`
- `onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState)` -> `void`
- `onSwiped(RecyclerView.ViewHolder viewHolder, int direction)` -> `void`

## `org.telegram.ui.FiltersSetupActivity$TouchHelperCallback`
- `clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder)` -> `void`
- `getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder)` -> `int`
- `onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive)` -> `void`
- `onMove(RecyclerView recyclerView, RecyclerView.ViewHolder source, RecyclerView.ViewHolder target)` -> `boolean`
- `onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState)` -> `void`
- `onSwiped(RecyclerView.ViewHolder viewHolder, int direction)` -> `void`

## `org.telegram.ui.GroupCallActivity`
- `static create(LaunchActivity activity, AccountInstance account, TLRPC.Chat scheduleChat, TLRPC.InputPeer schedulePeer, boolean hasFewPeers, String scheduledHash)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `dismissInternal()` -> `void`
- `dispatchKeyEvent(@NonNull KeyEvent event)` -> `boolean`
- `enableCamera()` -> `void`
- `fullscreenFor(ChatObject.VideoParticipant videoParticipant)` -> `void`
- `getAudioOutputActive(int value)` -> `boolean`
- `getAudioOutputIcon(int value)` -> `int`
- `getAudioOutputName(int value)` -> `String`
- `getAudioOutputToastIcon(int value)` -> `int`
- `getAudioOutputToastText(int value)` -> `String`
- `getAudioOutputValue()` -> `int`
- `getChatId()` -> `long`
- `getMenuItemsContainer()` -> `LinearLayout`
- `getNextAudioOutputValue()` -> `int`
- `getParentActivity()` -> `LaunchActivity`
- `getScrimView()` -> `View`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `getUndoView()` -> `UndoView`
- `invalidateActionBarAlpha()` -> `void`
- `invalidateScrollOffsetY()` -> `void`
- `isConference()` -> `boolean`
- `static isGradientState(int state)` -> `boolean`
- `isRtmpLandscapeMode()` -> `boolean`
- `isRtmpStream()` -> `boolean`
- `makeFocusable(BottomSheet bottomSheet, AlertDialog alertDialog, EditTextBoldCursor editText, boolean showKeyboard)` -> `void`
- `onAudioSettingsChanged()` -> `void`
- `onBackPressed()` -> `void`
- `onCameraSwitch(boolean isFrontFace)` -> `void`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `onCustomOpenAnimation()` -> `boolean`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `static onLeaveClick(Context context, Runnable onLeave, boolean fromOverlayWindow)` -> `void`
- `static onLeaveClick(Context context, Runnable onLeave, boolean fromOverlayWindow, boolean doNotAsk)` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onStateChanged(int state)` -> `void`
- `openShareConferenceLink()` -> `void`
- `setAudioOutputValue(int value)` -> `void`
- `setOldRows(int encryptionRow, int addMemberRow, int usersStartRow, int usersEndRow, int invitedStartRow, int invitedEndRow, int shadyJoinStartRow, int shadyJoinEndRow, int shadyLeftStartRow, int shadyLeftEndRow, int usersVideoStartRow, int usersVideoEndRow, int videoDividerRow, int videoNotAvailableRow, int conferenceAddPeopleRow, int conferenceShareLinkRow)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.GroupCallActivity$AvatarUpdaterDelegate`
- `didStartUpload(boolean fromAvatarConstructor, boolean isVideo)` -> `void`
- `didUploadPhoto(TLRPC.InputFile photo, TLRPC.InputFile video, double videoStartTimestamp, String videoPath, TLRPC.PhotoSize bigSize, TLRPC.PhotoSize smallSize, boolean isVideo, TLRPC.VideoSize emojiMarkup)` -> `void`
- `onUploadProgressChanged(float progress)` -> `void`
- `updateAvatarUploadingProgress(float progress)` -> `void`

## `org.telegram.ui.GroupCallActivity$CallEncryptionCell`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.GroupCallActivity$CallEncryptionCell$EncryptionCallDialog`
- `dismiss()` -> `void`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.GroupCallActivity$CallEncryptionCellDrawable`
- `draw(Canvas canvas, final float totalWidth, float alertProgress)` -> `boolean`
- `resetParentView(View parentView)` -> `void`
- `setEmojis(String[] emojis)` -> `void`
- `setParentView(View parentView)` -> `void`

## `org.telegram.ui.GroupCallActivity$EmojiSlot`
- `attach(View parent)` -> `void`
- `detach(View parent)` -> `void`
- `draw(Canvas canvas, RectF bounds, float alertProgress)` -> `boolean`
- `set(String emoji)` -> `void`

## `org.telegram.ui.GroupCallActivity$GroupCallItemAnimator`
- `endAnimations()` -> `void`
- `runPendingAnimations()` -> `void`
- `updateBackgroundBeforeAnimation()` -> `void`

## `org.telegram.ui.GroupCallActivity$LightningView`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `setNewColors(int[] colors)` -> `void`
- `setShadowOffset(int offset)` -> `void`

## `org.telegram.ui.GroupCallActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `notifyItemChanged(int position)` -> `void`
- `notifyItemChanged(int position, @Nullable Object payload)` -> `void`
- `notifyItemInserted(int position)` -> `void`
- `notifyItemMoved(int fromPosition, int toPosition)` -> `void`
- `notifyItemRangeChanged(int positionStart, int itemCount)` -> `void`
- `notifyItemRangeChanged(int positionStart, int itemCount, @Nullable Object payload)` -> `void`
- `notifyItemRangeInserted(int positionStart, int itemCount)` -> `void`
- `notifyItemRangeRemoved(int positionStart, int itemCount)` -> `void`
- `notifyItemRemoved(int position)` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.GroupCallActivity$RecordCallDrawable`
- `draw(Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `isRecording()` -> `boolean`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(ColorFilter colorFilter)` -> `void`
- `setParentView(View view)` -> `void`
- `setRecording(boolean value)` -> `void`

## `org.telegram.ui.GroupCallActivity$SmallRecordCallDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.GroupCallActivity$UpdateCallback`
- `onChanged(int position, int count, @Nullable Object payload)` -> `void`
- `onInserted(int position, int count)` -> `void`
- `onMoved(int fromPosition, int toPosition)` -> `void`
- `onRemoved(int position, int count)` -> `void`

## `org.telegram.ui.GroupCallActivity$VolumeSlider`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouch(MotionEvent ev)` -> `boolean`
- `onTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.ui.GroupCallActivity$WatchersView`
- `setWatchersCount(int count)` -> `void`

## `org.telegram.ui.GroupCallActivity$WeavingState`
- `update(int top, int left, int size, long dt, float amplitude)` -> `void`

## `org.telegram.ui.GroupCallSheet`
- `static show(Context context, int currentAccount, long dialogId, String slug, Browser.Progress progress)` -> `void`
- `static show(Context context, int currentAccount, long dialogId, TLRPC.InputGroupCall inputGroupCall, Browser.Progress progress)` -> `void`
- `static show(Context context, int currentAccount, long dialogId, TLRPC.InputGroupCall inputGroupCall, TLRPC.GroupCall groupCall, ArrayList<TLRPC.GroupCallParticipant> participants)` -> `void`

## `org.telegram.ui.GroupCallSheet$UserView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(long did)` -> `void`

## `org.telegram.ui.GroupCallSheet$UserView$Factory`
- `static asUser(long did)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `UserView`

## `org.telegram.ui.GroupCallTabletGridAdapter`
- `getItemCount()` -> `int`
- `getItemHeight(int position)` -> `int`
- `getSpanCount(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `scrollToPeerId(long peerId, RecyclerListView fullscreenUsersListView)` -> `void`
- `setGroupCall(ChatObject.Call groupCall)` -> `void`
- `setRenderersPool(ArrayList<GroupCallMiniTextureView> attachedRenderers, GroupCallRenderersContainer renderersContainer)` -> `void`
- `setVisibility(RecyclerListView listView, boolean visibility, boolean updateAttach)` -> `void`
- `update(boolean animated, RecyclerListView listView)` -> `void`

## `org.telegram.ui.ManageLinksActivity$DiffCallback`
- `areContentsTheSame(int oldItemPosition, int newItemPosition)` -> `boolean`
- `areItemsTheSame(int oldItemPosition, int newItemPosition)` -> `boolean`
- `fillPositions(SparseIntArray sparseIntArray)` -> `void`
- `getNewListSize()` -> `int`
- `getOldListSize()` -> `int`

## `org.telegram.ui.PinchToZoomHelper$Callback`
- `getCurrentTextureView()` -> `default TextureView`
- `onZoomFinished(MessageObject messageObject)` -> `default void`
- `onZoomStarted(MessageObject messageObject)` -> `default void`

## `org.telegram.ui.PollCreateActivity$TouchHelperCallback`
- `clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder)` -> `void`
- `getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder)` -> `int`
- `onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive)` -> `void`
- `onMove(RecyclerView recyclerView, RecyclerView.ViewHolder source, RecyclerView.ViewHolder target)` -> `boolean`
- `onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState)` -> `void`
- `onSwiped(RecyclerView.ViewHolder viewHolder, int direction)` -> `void`

## `org.telegram.ui.PrivacyControlActivity$DiffCallback`
- `areContentsTheSame(int oldItemPosition, int newItemPosition)` -> `boolean`
- `areItemsTheSame(int oldItemPosition, int newItemPosition)` -> `boolean`
- `fillPositions(SparseIntArray sparseIntArray)` -> `void`
- `getNewListSize()` -> `int`
- `getOldListSize()` -> `int`

## `org.telegram.ui.ProfileActivity$DiffCallback`
- `areContentsTheSame(int oldItemPosition, int newItemPosition)` -> `boolean`
- `areItemsTheSame(int oldItemPosition, int newItemPosition)` -> `boolean`
- `fillPositions(SparseIntArray sparseIntArray)` -> `void`
- `getNewListSize()` -> `int`
- `getOldListSize()` -> `int`

## `org.telegram.ui.StatisticActivity$DiffUtilsCallback`
- `areContentsTheSame(int oldItemPosition, int newItemPosition)` -> `boolean`
- `areItemsTheSame(int oldItemPosition, int newItemPosition)` -> `boolean`
- `getNewListSize()` -> `int`
- `getOldListSize()` -> `int`
- `update()` -> `void`

## `org.telegram.ui.TopicsFragment$TouchHelperCallback`
- `clearView(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder)` -> `void`
- `getMovementFlags(@NonNull RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder)` -> `int`
- `onChildDraw(@NonNull Canvas c, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive)` -> `void`
- `onMove(@NonNull RecyclerView recyclerView, RecyclerView.ViewHolder source, RecyclerView.ViewHolder target)` -> `boolean`
- `onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState)` -> `void`
- `onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction)` -> `void`

## `org.telegram.ui.VoIPFeedbackActivity`
- `finish()` -> `void`
- `onCreate(Bundle savedInstanceState)` -> `void`

## `org.telegram.ui.VoIPFragment`
- `static clearInstance()` -> `void`
- `createPiPTransition(boolean enter)` -> `Animator`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `finish()` -> `void`
- `static getInstance()` -> `VoIPFragment`
- `onAudioSettingsChanged()` -> `void`
- `onCameraSwitch(boolean isFrontFace)` -> `void`
- `static onPause()` -> `void`
- `onPauseInternal()` -> `void`
- `static onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `static onResume()` -> `void`
- `onResumeInternal()` -> `void`
- `onScreenCastStart()` -> `void`
- `onScreenOnChange(boolean screenOn)` -> `void`
- `onSignalBarsCountChanged(int count)` -> `void`
- `onStateChanged(int state)` -> `void`
- `onVideoAvailableChange(boolean isAvailable)` -> `void`
- `pipCreatePictureInPictureView()` -> `View`
- `pipCreatePictureInPictureViewBitmap()` -> `Bitmap`
- `pipCreatePrimaryWindowViewBitmap()` -> `Bitmap`
- `pipHidePrimaryWindowView(Runnable firstFrameCallback)` -> `void`
- `pipRenderBackground(Canvas canvas)` -> `void`
- `pipShowPrimaryWindowView(Runnable firstFrameCallback)` -> `void`
- `replaceEmojiToLottieFrame(CharSequence text, int[] emojiOnly)` -> `TLRPC.Document`
- `static show(Activity activity, int account)` -> `void`
- `startTransitionFromPiP()` -> `void`
- `switchToPip()` -> `void`

## `org.telegram.ui.VoIPFragment$ConferenceParticipantsView`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(int currentAccount, long dialogId, ArrayList<TLRPC.GroupCallParticipant> participants, int totalCount)` -> `void`

## `org.telegram.ui.VoIPPermissionActivity`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults)` -> `void`

## `org.telegram.ui.Wallet.WalletEngine2$SendCallbacks`
- `dispatch(SendPhase phase, String error, String transactionHash)` -> `void`
- `failed(String error)` -> `void`
- `state(int nativePhase, String error, String transactionHash)` -> `void`
