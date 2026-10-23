# visual / stories (2021 методов)

## `org.telegram.ui.Adapters.MessagesSearchAdapter$StoriesView`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(StoriesController.SearchStoriesList list)` -> `boolean`
- `setMessages(int messagesCount, String hashtag, String username)` -> `void`
- `transition(boolean stories)` -> `void`

## `org.telegram.ui.Cells.ExpiredStoryView`
- `draw(Canvas canvas, ChatMessageCell parent)` -> `void`
- `measure(ChatMessageCell parent)` -> `void`

## `org.telegram.ui.Components.ClearHistoryAlert`
- `setDelegate(ClearHistoryAlertDelegate clearHistoryAlertDelegate)` -> `void`

## `org.telegram.ui.Components.ClearHistoryAlert$BottomSheetCell`
- `getThemedColor(int key)` -> `int`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setText(CharSequence text)` -> `void`

## `org.telegram.ui.Components.ClearHistoryAlert$ClearHistoryAlertDelegate`
- `onAutoDeleteHistory(int ttl, int action)` -> `default void`
- `onClearHistory(boolean revoke)` -> `default void`

## `org.telegram.ui.Components.HashtagHistoryView`
- `setOnHashtagClickListener(Utilities.Callback<String> onClickListener)` -> `void`
- `setOnScrollListener(RecyclerView.OnScrollListener onScrollListener)` -> `void`
- `setTopBottomPadding(int top, int bottom)` -> `void`
- `update()` -> `void`

## `org.telegram.ui.Components.MediaActivity$StoriesTabsView`
- `createTabs()` -> `Tab[]`

## `org.telegram.ui.Components.Paint.Views.StoryLinkPreviewDialog`
- `dismiss()` -> `void`
- `isShowing()` -> `boolean`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `set(LinkPreview.WebPagePreview link, Utilities.Callback<LinkPreview.WebPagePreview> whenDone)` -> `void`
- `setStoryPreviewView(PreviewView previewView)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.Components.SharedMediaLayout$StoriesAdapter`
- `columnsCount()` -> `int`
- `destroy()` -> `void`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `getLetter(int position)` -> `String`
- `getPositionForIndex(int i)` -> `int`
- `getTopOffset()` -> `int`
- `getTotalItemsCount()` -> `int`
- `makeSupporting()` -> `StoriesAdapter`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onFastScrollSingleTap()` -> `void`
- `reorderDone()` -> `void`
- `setInAlbumStoriesReorder(boolean reorder)` -> `void`
- `swapElements(int fromPosition, int toPosition)` -> `boolean`

## `org.telegram.ui.SelectStoriesBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getTitle()` -> `CharSequence`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`

## `org.telegram.ui.Stories.ChannelBoostUtilities`
- `static createLink(int currentAccount, long dialogId)` -> `String`

## `org.telegram.ui.Stories.CloseFriendsBadge`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.Stories.CommentButton`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `setCollapsed(boolean collapsed, boolean animated)` -> `void`
- `setCount(int count)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Stories.DialogStoriesCell`
- `afterNextLayout(Runnable r)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `findStoryCell(long dialogId)` -> `StoryCell`
- `static getAvatarRight(int width, float progressToCollapsed)` -> `float`
- `getCollapsedProgress()` -> `float`
- `getOverScrollCoef()` -> `float`
- `getPremiumHint()` -> `HintView2`
- `isExpanded()` -> `boolean`
- `isFullExpanded()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onMiniListClicked()` -> `void`
- `onResume()` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `onUserLongPressed(View view, long dialogId)` -> `void`
- `openOverscrollSelectedStory()` -> `boolean`
- `openSelfStories()` -> `void`
- `openStoryForCell(StoryCell cell)` -> `void`
- `openStoryRecorder()` -> `void`
- `openStoryRecorder(long dialogId)` -> `void`
- `overscrollProgress()` -> `float`
- `scrollTo(long currentDialogId)` -> `boolean`
- `scrollToFirst()` -> `boolean`
- `scrollToFirstCell()` -> `void`
- `setActionBar(ActionBar actionBar)` -> `void`
- `setClipTop(int clipTop)` -> `void`
- `setMenuItemsOffset(float menuItemsOffset)` -> `void`
- `setOverscroll(float storiesOverscroll)` -> `void`
- `setProgressToCollapse(float progress)` -> `void`
- `setProgressToCollapse(float progress, boolean animated)` -> `void`
- `setTitleOverlayText(String titleOverlayText, int textId)` -> `void`
- `setTranslationY(float translationY)` -> `void`
- `showPremiumHint()` -> `void`
- `updateColors()` -> `void`
- `updateItems(boolean animated, boolean force)` -> `void`
- `updateStatus(TLRPC.User user, boolean animated)` -> `void`

## `org.telegram.ui.Stories.DialogStoriesCell$Adapter`
- `getItemCount()` -> `int`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Stories.DialogStoriesCell$Item`
- `equals(Object o)` -> `boolean`

## `org.telegram.ui.Stories.DialogStoriesCell$StoryCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawFail(Canvas canvas, float cx, float cy, float alpha)` -> `void`
- `drawPlus(Canvas canvas, float cx, float cy, float alpha)` -> `void`
- `getCy()` -> `float`
- `invalidate()` -> `void`
- `invalidate(int l, int t, int r, int b)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setCrossfadeTo(long dialogId)` -> `void`
- `setDialogId(long dialogId)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `setProgressToCollapsed(float progressToCollapsed, float progressToCollapsed2, float overscrollProgress, boolean selectedForOverscroll)` -> `void`

## `org.telegram.ui.Stories.HighlightMessageSheet`
- `static getDefaultTiers()` -> `int[]`
- `static getMaxLength(int currentAccount)` -> `int`
- `static getTierOption(int currentAccount, int stars, int option)` -> `int`
- `static open(Context context, int currentAccount, long dialogId, String dialogName, TLRPC.TL_textWithEntities text, long minStars, long currentStars, Utilities.Callback<Long> onStarsSelected, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static parseTiers(TLRPC.TL_jsonArray arr)` -> `int[]`
- `static parseTiersString(String str)` -> `int[]`
- `static tiersEqual(int[] a, int[] b)` -> `boolean`
- `static tiersToString(int[] tiers)` -> `String`

## `org.telegram.ui.Stories.HighlightMessageSheet$TierValueView`
- `set(CharSequence title)` -> `void`

## `org.telegram.ui.Stories.HwAvatarsImageView`
- `invalidate()` -> `void`
- `invalidate(int l, int t, int r, int b)` -> `void`

## `org.telegram.ui.Stories.HwFrameLayout`
- `disableHwAcceleration()` -> `void`
- `enableHwAcceleration()` -> `void`
- `invalidate()` -> `void`
- `invalidate(int l, int t, int r, int b)` -> `void`

## `org.telegram.ui.Stories.HwPeerStoriesView`
- `invalidate()` -> `void`
- `invalidate(int l, int t, int r, int b)` -> `void`

## `org.telegram.ui.Stories.HwStoriesViewPager`
- `invalidate()` -> `void`
- `invalidate(int l, int t, int r, int b)` -> `void`

## `org.telegram.ui.Stories.HwTextureView`
- `invalidate()` -> `void`
- `invalidate(int l, int t, int r, int b)` -> `void`

## `org.telegram.ui.Stories.LiveCommentsView`
- `areSendingStars()` -> `boolean`
- `clear()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `didSendStars()` -> `boolean`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `findComment(int messageId)` -> `LiveCommentView`
- `getDefaultSendAs()` -> `TLRPC.Peer`
- `getListViewContentTop()` -> `int`
- `getMessagesCount()` -> `int`
- `getStarsCount()` -> `long`
- `getUnreadMessagesCount()` -> `int`
- `isAdmin()` -> `boolean`
- `isCollapsed()` -> `boolean`
- `isMe(long dialogId)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onCancelledStarReaction(long dialogId)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onStarReaction(long dialogId, int totalStars, int stars)` -> `void`
- `onStarsButtonCancelled()` -> `void`
- `onStarsButtonPressed(long sendingStars, boolean withEffects)` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `static openDeleteMessage(Context context, long dialogId, Utilities.Callback3<Boolean, Boolean, Boolean> done)` -> `void`
- `openStarsSheet(boolean disabledPaidFeatures)` -> `void`
- `push(int date, int id, boolean fromAdmin, long dialogId, TLRPC.TL_textWithEntities text, long stars, boolean isHistory)` -> `void`
- `setAllowTouches(boolean allowTouches)` -> `void`
- `setCollapsed(boolean collapsed, boolean animated)` -> `void`
- `setKeyboardOffset(float t, float offset, float finalOffset)` -> `void`
- `setLivePlayer(LivePlayer livePlayer)` -> `void`
- `setup(long dialogId, final TLRPC.InputGroupCall inputCall)` -> `boolean`
- `top()` -> `float`
- `updatedMinStars()` -> `void`

## `org.telegram.ui.Stories.LiveCommentsView$CrownDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getAlpha()` -> `int`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int i)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Stories.LiveCommentsView$LiveCommentView`
- `drawScrim(Canvas canvas, float progress)` -> `void`
- `getStarLocation(RectF out)` -> `void`
- `highlight()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(Message message)` -> `void`
- `setDrawStar(boolean drawStar)` -> `void`

## `org.telegram.ui.Stories.LiveCommentsView$LiveCommentView$AlphaSpan`
- `updateDrawState(TextPaint textPaint)` -> `void`

## `org.telegram.ui.Stories.LiveCommentsView$LiveCommentView$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `LiveCommentView`
- `equals(UItem a, UItem b)` -> `boolean`
- `static of(Message message)` -> `UItem`

## `org.telegram.ui.Stories.LiveCommentsView$LiveTopSenderView`
- `set(TopSender sender)` -> `void`

## `org.telegram.ui.Stories.LiveCommentsView$LiveTopSenderView$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `LiveTopSenderView`
- `equals(UItem a, UItem b)` -> `boolean`
- `static of(TopSender sender)` -> `UItem`

## `org.telegram.ui.Stories.LiveCommentsView$TopSender`
- `expiresAfter(int now)` -> `int`
- `getProgress()` -> `float`
- `getProgress(int now)` -> `float`
- `getStars()` -> `int`
- `getStars(int now)` -> `int`
- `updateLastSentDate()` -> `void`
- `updateLastSentDate(int now)` -> `void`

## `org.telegram.ui.Stories.LivePlayer`
- `areMessagesEnabled()` -> `boolean`
- `commentsDisabled()` -> `boolean`
- `continueStreaming()` -> `void`
- `destroy()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `end()` -> `void`
- `equals(TLRPC.InputGroupCall call)` -> `boolean`
- `getCallId()` -> `long`
- `getDefaultSendAs()` -> `TLRPC.Peer`
- `getDisplaySink()` -> `VideoSink`
- `getWatchersCount()` -> `int`
- `onAudioFocusChange(int focusChange)` -> `void`
- `setDefaultSendAs(TLRPC.Peer peer)` -> `void`
- `setDisplaySink(VideoSink sink)` -> `void`
- `setEmptyStream(boolean isEmpty)` -> `void`
- `setMuted(boolean muted)` -> `void`
- `setVolume(float volume)` -> `void`
- `storyDeleted()` -> `void`
- `switchCamera()` -> `void`

## `org.telegram.ui.Stories.MessageMediaStoryFull`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.ui.Stories.MessageMediaStoryFull_old`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.ui.Stories.MuteButton`
- `setConnected(boolean connected, boolean animated)` -> `void`
- `setMuted(boolean muted, boolean animated)` -> `void`

## `org.telegram.ui.Stories.PaidReactionButton`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `playEffect(long sendingStars)` -> `void`
- `setCount(int stars)` -> `void`
- `setFilled(boolean filled)` -> `void`
- `stopEffects()` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Stories.PaidReactionButton$PaidReactionButtonEffectsView`
- `clearEffects()` -> `void`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `focusTo(float dst, Runnable whenDone)` -> `void`
- `hide()` -> `void`
- `playEffect()` -> `void`
- `pushChip(long dialogId, int totalStars, int stars)` -> `void`
- `show()` -> `void`
- `showCounter(long stars)` -> `void`
- `updatePosition(PaidReactionButton btn)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Stories.PaidReactionButton$PaidReactionButtonEffectsView$Chip`
- `detach()` -> `void`
- `draw(Canvas canvas)` -> `boolean`
- `kill()` -> `void`

## `org.telegram.ui.Stories.PeerStoriesView`
- `animateOut(boolean out)` -> `void`
- `closeKeyboardOrEmoji()` -> `boolean`
- `createBlurredBitmap(Canvas canvas, Bitmap bitmap)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `drawPlayingBitmap(int w, int h, Canvas canvas)` -> `void`
- `findClickableView(ViewGroup container, float x, float y, boolean swipeToDissmiss)` -> `boolean`
- `getCurrentDay()` -> `ArrayList<Integer>`
- `getCurrentPeer()` -> `long`
- `getListPosition()` -> `int`
- `getPlayingBitmap()` -> `Bitmap`
- `getSelectedPosition()` -> `int`
- `getStoriesController()` -> `StoriesController`
- `getStoriesCount()` -> `int`
- `static getStoryId(TL_stories.StoryItem storyItem, StoriesController.UploadingStory uploadingStory)` -> `int`
- `getStoryItems()` -> `ArrayList<TL_stories.StoryItem>`
- `isSelectedPeer()` -> `boolean`
- `needEnterText()` -> `boolean`
- `onActionDown(MotionEvent ev)` -> `void`
- `onActivityResult(int requestCode, int resultCode, Intent data)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `preloadMainImage(long dialogId)` -> `void`
- `progressToDismissUpdated()` -> `void`
- `reset()` -> `void`
- `selectPosition(int position)` -> `void`
- `setAccount(int currentAccount)` -> `void`
- `setActive(boolean active)` -> `void`
- `setActive(long t, boolean active)` -> `void`
- `setDay(long dialogId, ArrayList<Integer> day, int selectedPosition)` -> `void`
- `setDelegate(Delegate delegate)` -> `void`
- `setDialogId(long dialogId, int selectedPosition)` -> `void`
- `setIsVisible(boolean visible)` -> `void`
- `setLongpressed(boolean isLongpressed)` -> `void`
- `setOffset(float position)` -> `void`
- `setPaused(boolean paused)` -> `void`
- `setViewsThumbImageReceiver(float alpha, float scale, float pivotY, SelfStoriesPreviewView.ImageHolder viewsThumbImageReceiver)` -> `void`
- `showKeyboard()` -> `boolean`
- `showNoSoundHint(boolean nosound)` -> `void`
- `stopPlaying(boolean stop)` -> `void`
- `switchToNext(boolean forward)` -> `boolean`
- `updatePosition()` -> `void`
- `useSurfaceInViewPagerWorkAround()` -> `boolean`
- `viewsAllowed()` -> `boolean`

## `org.telegram.ui.Stories.PeerStoriesView$PeerHeaderView`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawUploadingProgress(Canvas canvas, RectF rect, boolean allowDraw, float progressToOpen)` -> `void`
- `setOnSubtitleClick(View.OnClickListener listener)` -> `void`
- `setSubtitle(CharSequence text)` -> `void`
- `setSubtitle(CharSequence text, boolean animated)` -> `void`

## `org.telegram.ui.Stories.PeerStoriesView$SharedResources`
- `setIconMuted(boolean muted, boolean animated)` -> `void`

## `org.telegram.ui.Stories.PeerStoriesView$StoryItemHolder`
- `allowScreenshots()` -> `boolean`
- `clear()` -> `void`
- `createLink()` -> `String`
- `forCloseFriends()` -> `boolean`
- `getLocalPath()` -> `String`
- `getMusic()` -> `StoryCaptionView.Panel`
- `getPath()` -> `File`
- `getReply()` -> `StoryCaptionView.Panel`
- `set(TL_stories.StoryItem storyItem)` -> `void`
- `set(StoriesController.UploadingStory uploadingStory)` -> `void`
- `updateCaption()` -> `void`

## `org.telegram.ui.Stories.PublicStoriesList`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onMessagesClick()` -> `void`
- `setQuery(String username, String query)` -> `void`
- `setStoriesList(StoriesController.StoriesList list)` -> `void`
- `setTabs(boolean tabs)` -> `void`
- `updateTopView()` -> `void`

## `org.telegram.ui.Stories.RoundRectOutlineProvider`
- `getOutline(View view, Outline outline)` -> `void`

## `org.telegram.ui.Stories.SelfStoriesPreviewView`
- `abortScroll()` -> `void`
- `getCenteredImageReciever()` -> `ImageHolder`
- `getClosestPosition()` -> `int`
- `getFinalHeight()` -> `float`
- `onAttachedToWindow()` -> `void`
- `onCenteredImageTap()` -> `void`
- `onClosestPositionChanged(int lastClosestPosition)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `scrollToPosition(int p, boolean animated, boolean force)` -> `void`
- `scrollToPositionWithOffset(int position, float positionOffset)` -> `void`
- `setItems(ArrayList<SelfStoryViewsView.StoryItemInternal> storyItems, int position)` -> `void`
- `setProgressToOpen(float progressToOpen)` -> `void`
- `update()` -> `void`

## `org.telegram.ui.Stories.SelfStoriesPreviewView$ImageHolder`
- `draw(Canvas canvas, float alpha, float scale, int x, int y, int width, int height)` -> `void`
- `onBind(int position)` -> `void`
- `onDetach()` -> `void`
- `update()` -> `void`

## `org.telegram.ui.Stories.SelfStoryViewsPage`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getTopOffset()` -> `float`
- `onAttachedToWindow()` -> `void`
- `onBackPressed()` -> `boolean`
- `onDataRecieved(ViewsModel model)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onKeyboardShown()` -> `void`
- `onTopOffsetChanged(int paddingTop)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `static preload(int currentAccount, long dialogId, TL_stories.StoryItem storyItem)` -> `void`
- `scrollToRepostCell(long dialogId, int storyId)` -> `boolean`
- `setListBottomPadding(float bottomPadding)` -> `void`
- `setShadowDrawable(Drawable shadowDrawable)` -> `void`
- `setStoryItem(long dialogId, SelfStoryViewsView.StoryItemInternal storyItem)` -> `void`
- `updateSharedState()` -> `void`

## `org.telegram.ui.Stories.SelfStoryViewsPage$FiltersState`
- `equals(Object o)` -> `boolean`
- `set(FiltersState state)` -> `void`

## `org.telegram.ui.Stories.SelfStoryViewsPage$HeaderView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `setState(boolean contactsOnly, boolean animate)` -> `void`

## `org.telegram.ui.Stories.SelfStoryViewsPage$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `updateRows()` -> `void`

## `org.telegram.ui.Stories.SelfStoryViewsPage$RecyclerListViewInner`
- `updateClip(int[] clip)` -> `void`

## `org.telegram.ui.Stories.SelfStoryViewsPage$ViewsModel`
- `getCount()` -> `int`
- `release()` -> `void`
- `reloadIfNeed(FiltersState state, boolean showContactsFilter, boolean showReactionsSort)` -> `void`

## `org.telegram.ui.Stories.SelfStoryViewsView`
- `getCrossfadeToImage()` -> `SelfStoriesPreviewView.ImageHolder`
- `getCurrentPage()` -> `SelfStoryViewsPage`
- `getSelectedStory()` -> `TL_stories.StoryItem`
- `onBackPressed()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setItems(long dialogId, ArrayList<TL_stories.StoryItem> storyItems, int selectedPosition)` -> `void`
- `setKeyboardHeight(int keyboardHeight)` -> `void`
- `setOffset(float selfStoriesViewsOffset)` -> `void`

## `org.telegram.ui.Stories.SelfStoryViewsView$ContainerView`
- `onNestedPreScroll(@NonNull View target, int dx, int dy, @NonNull int[] consumed, int type)` -> `void`
- `onNestedScroll(@NonNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type)` -> `void`
- `onNestedScroll(@NonNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, @NonNull int[] consumed)` -> `void`
- `onNestedScrollAccepted(@NonNull View child, @NonNull View target, int axes, int type)` -> `void`
- `onStartNestedScroll(@NonNull View child, @NonNull View target, int axes, int type)` -> `boolean`
- `onStopNestedScroll(@NonNull View target, int type)` -> `void`

## `org.telegram.ui.Stories.SelfStoryViewsView$ViewPagerInner`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onTouchEvent(MotionEvent ev)` -> `boolean`

## `org.telegram.ui.Stories.StealthModeAlert`
- `setListener(Listener listener)` -> `void`
- `static showStealthModeEnabledBulletin()` -> `void`

## `org.telegram.ui.Stories.StoriesController`
- `static applyStoryUpdate(TL_stories.StoryItem oldStoryItem, TL_stories.StoryItem newStoryItem)` -> `TL_stories.StoryItem`
- `applyStoryViewsBlocked(TL_stories.StoryViewsList res)` -> `void`
- `cleanup()` -> `void`
- `createAlbum(long dialogId, String name)` -> `void`
- `createAlbum(long dialogId, String name, Utilities.Callback<StoryAlbum> onCreate)` -> `void`
- `destroyStoryList(StoriesList list)` -> `void`
- `fillMessagesWithStories(LongSparseArray<ArrayList<MessageObject>> messagesWithUnknownStories, Runnable callback, int classGuid, Timer timer)` -> `void`
- `findEditingStory(long dialogId, TL_stories.StoryItem storyItem)` -> `UploadingStory`
- `findStory(long dialogId, int storyId)` -> `TL_stories.StoryItem`
- `getAlbumName(long dialogId, int albumId)` -> `String`
- `getBlocklistCount()` -> `int`
- `getDraftsController()` -> `DraftsController`
- `getEditingStory(long dialogId)` -> `UploadingStory`
- `getHiddenList()` -> `ArrayList<TL_stories.PeerStories>`
- `getMaxStoriesReadId(long dialogId)` -> `int`
- `getMyStoriesCount()` -> `int`
- `getSelfStoriesCount()` -> `int`
- `getStealthMode()` -> `TL_stories.TL_storiesStealthMode`
- `getStories(long peerId)` -> `TL_stories.PeerStories`
- `getStoriesFromFullPeer(long dialogId)` -> `TL_stories.PeerStories`
- `getStoriesList(long dialogId, int type)` -> `StoriesList`
- `getStoriesList(long dialogId, int type, int albumId)` -> `StoriesList`
- `getStoriesStorage()` -> `StoriesStorage`
- `getStoryAlbumsList(long dialogId)` -> `StoriesCollections`
- `getTotalStoriesCount(boolean hidden)` -> `int`
- `getUnreadState(long dialogId)` -> `int`
- `getUnreadState(long dialogId, int storyId)` -> `int`
- `getUnreadStoriesCount(long dialogId)` -> `int`
- `getUploadingAndEditingStories(long dialogId)` -> `ArrayList<UploadingStory>`
- `getUploadingStories(long dialogId)` -> `ArrayList<UploadingStory>`
- `invalidateStoryLimit()` -> `void`
- `onPremiumChanged()` -> `void`
- `pollViewsForSelfStories(long dialogId, boolean start)` -> `void`
- `preloadUserStories(TL_stories.PeerStories userStories)` -> `void`
- `renameAlbum(long dialogId, int albumId, String name)` -> `void`
- `resolveLiveStoryLink(long peerId, Utilities.Callback<TL_stories.StoryItem> consumer)` -> `void`
- `resolveStoryAlbumLink(long peerId, int storyAlbumId, Utilities.Callback<TL_stories.TL_storyAlbum> consumer)` -> `void`
- `resolveStoryLink(long peerId, int storyId, Utilities.Callback<TL_stories.StoryItem> consumer)` -> `void`
- `scheduleSort()` -> `void`
- `setLoading(long dialogId, boolean loading)` -> `void`
- `setStealthMode(TL_stories.TL_storiesStealthMode stealthMode)` -> `void`
- `setStoryReaction(long dialogId, TL_stories.StoryItem storyItem, ReactionsLayoutInBubble.VisibleReaction visibleReaction)` -> `void`
- `sortHiddenStories()` -> `void`
- `stopAllPollers()` -> `void`
- `toggleHidden(long dialogId, boolean hide, boolean request, boolean notify)` -> `void`
- `updateBlockUser(long did, boolean block)` -> `void`
- `updateBlockUser(long did, boolean block, boolean request)` -> `void`
- `updateBlockedUsers(HashSet<Long> ids, Runnable done)` -> `void`
- `updateDeletedStoriesInLists(long dialogId, List<TL_stories.StoryItem> storyItems)` -> `void`
- `updateStoriesFromFullPeer(long dialogId, TL_stories.PeerStories stories)` -> `void`
- `updateStoriesInLists(long dialogId, List<TL_stories.StoryItem> storyItems)` -> `void`
- `updateStoriesInLists(long dialogId, List<TL_stories.StoryItem> storyItems, boolean force)` -> `void`
- `updateStoriesPinned(long dialogId, ArrayList<TL_stories.StoryItem> storyItems, boolean pinned, Utilities.Callback<Boolean> whenDone)` -> `void`
- `updateStoryItem(long dialogId, TL_stories.StoryItem storyItem, boolean edited)` -> `void`
- `updateStoryItem(long dialogId, TL_stories.StoryItem storyItem, boolean force, boolean edited)` -> `void`
- `updateStoryReaction(long dialogId, int storyId, TLRPC.Reaction reaction)` -> `void`
- `uploadStory(StoryEntry entry, boolean count)` -> `void`

## `org.telegram.ui.Stories.StoriesController$BotPreviewsList`
- `findMessageObject(int id)` -> `MessageObject`
- `getCount()` -> `int`
- `getDays()` -> `ArrayList<ArrayList<Integer>>`
- `getLoadedCount()` -> `int`
- `invalidateCache()` -> `void`
- `notifyUpdate()` -> `void`
- `preloadCache()` -> `void`
- `push(TL_bots.botPreviewMedia media)` -> `void`
- `reload(Runnable callback)` -> `void`
- `updatePinnedOrder(ArrayList<Integer> ids, boolean apply)` -> `void`

## `org.telegram.ui.Stories.StoriesController$SearchStoriesList`
- `findMessageObject(int id)` -> `MessageObject`
- `getCount()` -> `int`
- `getDays()` -> `ArrayList<ArrayList<Integer>>`
- `getLoadedCount()` -> `int`
- `invalidateCache()` -> `void`
- `preloadCache()` -> `void`

## `org.telegram.ui.Stories.StoriesController$StoriesCollections`
- `createCollection(String title, Utilities.Callback<StoryAlbum> created)` -> `void`
- `findById(int id)` -> `StoryAlbum`
- `indexOf(int id)` -> `int`
- `invalidate(boolean load)` -> `void`
- `renameCollection(int id, String newName)` -> `void`
- `reorderComplete(boolean notify)` -> `void`
- `reorderStep(ArrayList<Integer> collectionIds)` -> `void`

## `org.telegram.ui.Stories.StoriesController$StoriesList`
- `static day(MessageObject messageObject)` -> `long`
- `equal(TL_stories.StoryItem a, TL_stories.StoryItem b)` -> `boolean`
- `fill(boolean notify)` -> `void`
- `fill(ArrayList<MessageObject> arrayList, boolean showPhotos, boolean showVideos)` -> `void`
- `findMessageObject(int storyId)` -> `MessageObject`
- `firstLoadedId()` -> `int`
- `getCount()` -> `int`
- `getDays()` -> `ArrayList<ArrayList<Integer>>`
- `getLoadedCount()` -> `int`
- `invalidateCache()` -> `void`
- `lastLoadedId()` -> `int`
- `link()` -> `int`
- `preloadCache()` -> `void`
- `reload()` -> `void`
- `resetCanLoad()` -> `void`
- `showPhotos()` -> `boolean`
- `showVideos()` -> `boolean`
- `unlink(int id)` -> `void`
- `updateDeletedStories(List<TL_stories.StoryItem> storyItems)` -> `void`
- `updateFilters(boolean photos, boolean videos)` -> `void`
- `updateOrderInAlbum(List<Integer> ids, boolean apply)` -> `void`
- `updatePinned(ArrayList<Integer> ids, boolean pin)` -> `boolean`
- `updatePinnedOrder(ArrayList<Integer> ids, boolean apply)` -> `void`
- `updateStories(List<TL_stories.StoryItem> storyItems, boolean force)` -> `void`
- `updateStoryItemsAlbums(int albumId, List<Integer> stories, boolean remove)` -> `void`
- `updateStoryViews(List<Integer> ids, ArrayList<TL_stories.StoryViews> storyViews)` -> `void`

## `org.telegram.ui.Stories.StoriesController$StoryAlbum`
- `static from(TL_stories.TL_storyAlbum album)` -> `StoryAlbum`
- `toTl()` -> `TL_stories.TL_storyAlbum`

## `org.telegram.ui.Stories.StoriesController$StoryLimit`
- `active(int currentAccount)` -> `boolean`
- `active(int currentAccount, int count)` -> `boolean`
- `getLimitReachedType()` -> `int`

## `org.telegram.ui.Stories.StoriesController$StoryRepostsList`
- `append(ArrayList<TL_stories.StoryItem> stories)` -> `int`
- `findMessageObject(int id)` -> `MessageObject`
- `getCount()` -> `int`
- `getDays()` -> `ArrayList<ArrayList<Integer>>`
- `getLoadedCount()` -> `int`
- `invalidateCache()` -> `void`
- `preloadCache()` -> `void`

## `org.telegram.ui.Stories.StoriesController$UploadingStory`
- `cleanup()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `start()` -> `void`
- `tryAgain()` -> `void`

## `org.telegram.ui.Stories.StoriesGradientTools`
- `updateBounds()` -> `void`

## `org.telegram.ui.Stories.StoriesIntro`
- `startAnimation(boolean delay)` -> `void`
- `stopAnimation()` -> `void`

## `org.telegram.ui.Stories.StoriesIntro$StoriesIntroItemView`
- `getLottieAnimationDuration()` -> `long`
- `getRequiredWidth()` -> `int`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setProgress(float progress)` -> `void`
- `startAnimation()` -> `void`
- `startIconAnimation()` -> `void`
- `stopAnimation()` -> `void`

## `org.telegram.ui.Stories.StoriesLikeButton`
- `animateVisibleReaction()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `prepareAnimateReaction(ReactionsLayoutInBubble.VisibleReaction reaction)` -> `void`
- `setAllowDrawReaction(boolean b)` -> `void`
- `setReaction(ReactionsLayoutInBubble.VisibleReaction visibleReaction)` -> `void`

## `org.telegram.ui.Stories.StoriesListPlaceProvider`
- `findView(long dialogId, int messageId, int storyId, int type, StoryViewer.TransitionViewHolder holder)` -> `boolean`
- `static of(RecyclerListView recyclerListView)` -> `StoriesListPlaceProvider`
- `static of(RecyclerListView recyclerListView, boolean hiddenArchive)` -> `StoriesListPlaceProvider`
- `static of(ProfileChannelCell profileChannelCell)` -> `StoriesListPlaceProvider`
- `preLayout(long currentDialogId, int messageId, Runnable r)` -> `void`
- `setPaginationParaments(boolean hiddedStories, boolean onlyUnreadStories, boolean onlySelfStories)` -> `StoryViewer.PlaceProvider`
- `with(LoadNextInterface loadNextInterface)` -> `StoriesListPlaceProvider`

## `org.telegram.ui.Stories.StoriesStorage`
- `static applyStory(int currentAccount, long dialogId, MessageObject messageObject, TL_stories.StoryItem storyItem)` -> `void`
- `fillMessagesWithStories(LongSparseArray<ArrayList<MessageObject>> messagesWithUnknownStories, Runnable runnable, int classGuid, Timer timer)` -> `void`
- `fillMessagesWithStories(LongSparseArray<ArrayList<MessageObject>> messagesWithUnknownStories, Runnable runnable, int classGuid, boolean updateDatabase, Timer timer)` -> `void`
- `getAllStories(Utilities.Callback<TL_stories.TL_stories_allStories> consumer)` -> `void`
- `getMaxReadIds(Utilities.Callback<LongSparseIntArray> consumer)` -> `void`
- `getStories(long dialogId, Utilities.Callback<TL_stories.PeerStories> consumer)` -> `void`
- `updateMaxReadId(long dialogId, int max_read_id)` -> `void`
- `updateMessagesWithStories(List<MessageObject> updatedMessages)` -> `void`
- `updateStories(TL_stories.PeerStories currentStories)` -> `void`
- `updateStoryItem(long dialogId, TL_stories.StoryItem storyItem)` -> `void`

## `org.telegram.ui.Stories.StoriesUtilities`
- `static applyUploadingStr(SimpleTextView textView, boolean medium, boolean edit)` -> `void`
- `static applyUploadingStr(AnimatedTextView textView, boolean medium, boolean animated)` -> `void`
- `static applyViewedUser(TL_stories.StoryItem storyItem, TLRPC.User currentUser)` -> `void`
- `static createExpiredStoryString()` -> `CharSequence`
- `static createExpiredStoryString(boolean useScale, int strRes, Object... args)` -> `CharSequence`
- `static createReplyStoryString()` -> `CharSequence`
- `static drawArcExcludeArc(Canvas canvas, RectF rect, Paint paint, float startAngle, float endAngle, float excludeStartAngle, float excludeAndAngle)` -> `void`
- `static drawAvatarWithStory(long dialogId, Canvas canvas, ImageReceiver avatarImage, AvatarStoryParams params)` -> `void`
- `static drawAvatarWithStory(long dialogId, Canvas canvas, ImageReceiver avatarImage, boolean hasStories, AvatarStoryParams params)` -> `void`
- `static drawLive(Canvas canvas, RectF rect, float alpha, boolean drawText, float large)` -> `void`
- `static ensureStoryFileLoaded(TL_stories.PeerStories stories, Runnable onDoneOrTimeout)` -> `EnsureStoryFileLoadedObject`
- `static getCloseFriendsPaint(ImageReceiver avatarImage)` -> `Paint`
- `static getErrorPaint(ImageReceiver avatarImage)` -> `Paint`
- `static getErrorPaint(RectF rect)` -> `Paint`
- `static getExpiredStoryDrawable()` -> `Drawable`
- `static getInset(int currentState, int unreadState)` -> `int`
- `static getLivePaint(ImageReceiver avatarImage)` -> `Paint`
- `static getPredictiveUnreadState(StoriesController storiesController, long dialogId)` -> `int`
- `static getStoryImageFilter()` -> `String`
- `static getUnreadCirclePaint(ImageReceiver avatarImage, boolean isDialogCell)` -> `Paint`
- `static getUnreadCirclePaint(RectF bounds, boolean isDialogCell)` -> `Paint`
- `static getUploadingStr(TextView textView, boolean medium, boolean edit)` -> `CharSequence`
- `static setImage(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem)` -> `void`
- `static setImage(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem, String filter)` -> `void`
- `static setImage(ImageReceiver imageReceiver, StoriesController.UploadingStory uploadingStory)` -> `void`
- `static setStoryMiniImage(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem)` -> `void`
- `static setThumbImage(AvatarDrawable avatarDrawable, ImageReceiver imageReceiver, TL_stories.StoryItem storyItem, int w, int h)` -> `void`
- `static updateColors()` -> `void`

## `org.telegram.ui.Stories.StoriesUtilities$AvatarStoryParams`
- `getScale()` -> `float`
- `onAvatarClick(View view, long dialogId)` -> `boolean`
- `onDetachFromWindow()` -> `void`
- `onLongPress()` -> `void`
- `openStory(long dialogId, Runnable onDone)` -> `void`
- `reset()` -> `void`

## `org.telegram.ui.Stories.StoriesUtilities$StoryGradientTools`
- `getPaint(RectF bounds)` -> `Paint`
- `setColor(MessagesController.PeerColor peerColor, boolean animated)` -> `void`
- `setColorId(int colorId, boolean animated)` -> `void`

## `org.telegram.ui.Stories.StoriesViewPager`
- `enableTouch(boolean enable)` -> `void`
- `static eq(ArrayList<Integer> a, ArrayList<Integer> b)` -> `boolean`
- `getCurrentDialogId()` -> `long`
- `getCurrentPeerView()` -> `PeerStoriesView`
- `getDialogIds()` -> `ArrayList<Long>`
- `lockTouchEvent(long duration)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onNextIdle(Runnable runnable)` -> `void`
- `onStateChanged()` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `setCurrentDate(long day, int storyId)` -> `void`
- `setDays(long dialogId, ArrayList<ArrayList<Integer>> days, int currentAccount)` -> `void`
- `setDelegate(PeerStoriesView.Delegate delegate)` -> `void`
- `setHorizontalProgressToDismiss(float position)` -> `void`
- `setKeyboardHeight(int realKeyboardHeight)` -> `void`
- `setPaused(boolean paused)` -> `void`
- `setPeerIds(ArrayList<Long> peerIds, int currentAccount, int position)` -> `void`
- `switchToNext(boolean forward)` -> `boolean`
- `useSurfaceInViewPagerWorkAround()` -> `boolean`

## `org.telegram.ui.Stories.StoriesViewPager$PageLayout`
- `dispatchDraw(Canvas canvas)` -> `void`
- `setVisible(boolean visible)` -> `void`

## `org.telegram.ui.Stories.StoriesVolumeControl`
- `hide()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onKeyDown(int keyCode, KeyEvent event)` -> `boolean`
- `unmute()` -> `void`

## `org.telegram.ui.Stories.StoryCaptionView`
- `allowInterceptTouchEvent(float x, float y)` -> `boolean`
- `applyPendingTopMargin()` -> `void`
- `calculateNewContainerMarginTop(int width, int height)` -> `int`
- `checkCancelTextSelection()` -> `void`
- `collapse()` -> `void`
- `computeScroll()` -> `void`
- `disableDraw(boolean disableDraw)` -> `void`
- `dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow, int type)` -> `boolean`
- `dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, @Nullable int[] offsetInWindow, int type, @NonNull int[] consumed)` -> `void`
- `draw(Canvas canvas)` -> `void`
- `drawScrim(Canvas canvas, float progress)` -> `void`
- `expand()` -> `void`
- `expand(boolean force)` -> `void`
- `fling(int velocityY)` -> `void`
- `getBottomFadingEdgeStrength()` -> `float`
- `getBounds(RectF bounds)` -> `void`
- `getMaxTop()` -> `float`
- `getPendingMarginTopDiff()` -> `int`
- `getProgressToBlackout()` -> `float`
- `getTextTop()` -> `float`
- `getTopFadingEdgeStrength()` -> `float`
- `invalidate()` -> `void`
- `isTouched()` -> `boolean`
- `onEmojiClick(AnimatedEmojiSpan span)` -> `void`
- `onInterceptTouchEvent(@NonNull MotionEvent ev)` -> `boolean`
- `onLinkClick(CharacterStyle span, View spoilersTextView)` -> `void`
- `onLinkLongPress(URLSpan span, View spoilersTextView, Runnable done)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onReplyClick(View view, Panel panel)` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `reset()` -> `void`
- `scrollBy(int x, int y)` -> `void`
- `startNestedScroll(int axes, int type)` -> `boolean`
- `stopNestedScroll(int type)` -> `void`
- `stopScrolling()` -> `void`
- `updateTopMargin()` -> `void`

## `org.telegram.ui.Stories.StoryCaptionView$Panel`
- `draw(Canvas canvas, float width)` -> `void`
- `static from(TLRPC.Document music)` -> `Panel`
- `static from(int currentAccount, TL_stories.StoryItem storyItem)` -> `Panel`
- `static from(StoriesController.UploadingStory uploadingStory)` -> `Panel`
- `height()` -> `int`
- `listen(View view, Runnable whenLoaded)` -> `void`
- `static musicSpan()` -> `CharSequence`
- `static musicSpan(int a)` -> `CharSequence`
- `setPressed(boolean pressed, float x, float y)` -> `void`
- `width()` -> `int`

## `org.telegram.ui.Stories.StoryCaptionView$StoryCaptionTextView`
- `animateUpdate()` -> `void`
- `collapsedTextHeight(int height)` -> `int`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `getAnimatedHeight()` -> `float`
- `getPaint()` -> `Paint`
- `getStaticTextLayout()` -> `Layout`
- `getText()` -> `CharSequence`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setPressed(boolean pressed)` -> `void`
- `setText(CharSequence text, Panel panel, Panel panel2, boolean translating, boolean animated)` -> `void`
- `setTranslationY(float translationY)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Stories.StoryCaptionView$StoryCaptionTextView$TextState`
- `collapsedTextHeight(int height)` -> `int`
- `detach()` -> `void`
- `draw(Canvas canvas, float alpha)` -> `void`
- `measure(int width)` -> `void`
- `setup(CharSequence text, Panel panel, Panel panel2)` -> `void`
- `touch(MotionEvent event)` -> `boolean`

## `org.telegram.ui.Stories.StoryContainsEmojiButton`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getAlert()` -> `EmojiPacksAlert`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setText(CharSequence text)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Stories.StoryCustomParamsHelper`
- `static copyParams(TL_stories.StoryItem fromStory, TL_stories.StoryItem toStory)` -> `void`
- `static writeLocalParams(TL_stories.StoryItem storyItem)` -> `NativeByteBuffer`

## `org.telegram.ui.Stories.StoryCustomParamsHelper$Params_v1`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.ui.Stories.StoryFailView`
- `onDraw(Canvas canvas)` -> `void`
- `set(TLRPC.TL_error error)` -> `void`
- `setOnClickListener(@Nullable OnClickListener l)` -> `void`

## `org.telegram.ui.Stories.StoryLinesDrawable`
- `draw(Canvas canvas, int fullWidth, int index, float progress, int count, float hideInterfaceAlpha, float alpha, boolean buffering, boolean zoom, float zoomProgress)` -> `void`

## `org.telegram.ui.Stories.StoryMediaAreasView`
- `closeHint()` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `static getMediaAreasFor(StoryEntry entry)` -> `ArrayList<TL_stories.MediaArea>`
- `getPlayingBitmap()` -> `Bitmap`
- `onClick(View v)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onHintVisible(boolean hintVisible)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `presentFragment(BaseFragment fragment)` -> `void`
- `static rgbaToArgb(int rgba)` -> `int`
- `set(TL_stories.StoryItem storyItem, EmojiAnimationsOverlay animationsOverlay)` -> `void`
- `set(TL_stories.StoryItem storyItem, ArrayList<TL_stories.MediaArea> mediaAreas, EmojiAnimationsOverlay animationsOverlay)` -> `void`
- `shine()` -> `void`
- `showEffect(StoryReactionWidgetView v)` -> `void`

## `org.telegram.ui.Stories.StoryMediaAreasView$AreaView`
- `customDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `drawAbove(Canvas canvas)` -> `void`
- `getInnerRadius()` -> `float`
- `onDraw(Canvas canvas)` -> `void`
- `shine()` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Stories.StoryMediaAreasView$FitViewWidget`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Stories.StoryPositionView`
- `draw(Canvas canvas, float alpha, int linesPosition, int linesCount, FrameLayout container, PeerStoriesView.PeerHeaderView headerView)` -> `void`

## `org.telegram.ui.Stories.StoryPrivacyButton`
- `getCenterX()` -> `float`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(boolean mine, TL_stories.StoryItem storyItem, boolean animated)` -> `boolean`
- `set(boolean mine, StoriesController.UploadingStory uploadingStory, boolean animated)` -> `boolean`
- `setPressed(boolean pressed)` -> `void`

## `org.telegram.ui.Stories.StoryReactionWidgetBackground`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `isDarkStyle()` -> `boolean`
- `nextStyle()` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setMirror(boolean mirror, boolean animate)` -> `void`
- `updateShadowLayer(float scale)` -> `void`

## `org.telegram.ui.Stories.StoryReactionWidgetView`
- `customDraw(Canvas canvas)` -> `void`
- `getAnimatedEmojiDrawable()` -> `AnimatedEmojiDrawable`
- `invalidate()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `playAnimation()` -> `void`
- `setScaleX(float scaleX)` -> `void`
- `setViews(TL_stories.StoryViews storyViews, boolean animated)` -> `void`

## `org.telegram.ui.Stories.StoryViewer`
- `allowScreenshots(boolean allowScreenshots)` -> `void`
- `attachedToParent()` -> `boolean`
- `clearDraft(long dialogId, TL_stories.StoryItem storyItem)` -> `void`
- `close(boolean backAnimation)` -> `void`
- `static closeGlobalInstances()` -> `void`
- `closeKeyboardOrEmoji()` -> `boolean`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `dismissVisibleDialogs()` -> `void`
- `dispatchKeyEvent(KeyEvent event)` -> `void`
- `doOnAnimationReady(Runnable runnable)` -> `void`
- `getContainerForBulletin()` -> `FrameLayout`
- `getContainerView()` -> `FrameLayout`
- `getCurrentPeerView()` -> `PeerStoriesView`
- `getDraft(long dialogId, TL_stories.StoryItem storyItem)` -> `CharSequence`
- `getNavigationBarColor(int currentColor)` -> `int`
- `getProgressToSelfViews()` -> `float`
- `getResourceProvider()` -> `Theme.ResourcesProvider`
- `getStoryRect(RectF rectF)` -> `boolean`
- `getWindowView()` -> `View`
- `instantClose()` -> `void`
- `listenToAttachedSheet(BaseFragment.AttachedSheet sheet)` -> `boolean`
- `onActivityResult(int requestCode, int resultCode, Intent data)` -> `void`
- `onAttachedBackPressed()` -> `boolean`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `open(Context context, TL_stories.StoryItem storyItem, PlaceProvider placeProvider)` -> `void`
- `open(int account, Context context, TL_stories.StoryItem storyItem, PlaceProvider placeProvider)` -> `void`
- `open(Context context, long dialogId, PlaceProvider placeProvider)` -> `void`
- `open(Context context, int startStoryId, StoriesController.StoriesList storiesList, PlaceProvider placeProvider)` -> `void`
- `open(Context context, TL_stories.PeerStories userStories, PlaceProvider placeProvider)` -> `void`
- `open(Context context, TL_stories.StoryItem storyItem, int startStoryId, StoriesController.StoriesList storiesList, boolean reversed, PlaceProvider placeProvider)` -> `void`
- `open(Context context, TL_stories.StoryItem storyItem, ArrayList<Long> peerIds, int position, StoriesController.StoriesList storiesList, TL_stories.PeerStories userStories, PlaceProvider placeProvider, boolean reversed)` -> `void`
- `open(int account, Context context, TL_stories.StoryItem storyItem, ArrayList<Long> peerIds, int position, StoriesController.StoriesList storiesList, TL_stories.PeerStories userStories, PlaceProvider placeProvider, boolean reversed)` -> `void`
- `openFor(BaseFragment fragment, RecyclerListView recyclerListView, ChatActionCell cell)` -> `void`
- `openViews()` -> `void`
- `pipCreatePictureInPictureView()` -> `View`
- `pipCreatePictureInPictureViewBitmap()` -> `Bitmap`
- `pipCreatePrimaryWindowViewBitmap()` -> `Bitmap`
- `pipHidePrimaryWindowView(Runnable firstFrameCallback)` -> `void`
- `pipIsAvailable()` -> `boolean`
- `pipShowPrimaryWindowView(Runnable firstFrameCallback)` -> `void`
- `presentFragment(BaseFragment fragment)` -> `void`
- `release()` -> `void`
- `setKeyboardHeightFromParent(int keyboardHeight)` -> `void`
- `setOnCloseListener(Runnable listener)` -> `void`
- `setOnDismissListener(Runnable onDismiss)` -> `void`
- `setOverlayVisible(boolean visible)` -> `void`
- `setSelfStoriesViewsOffset(float currentTranslation)` -> `void`
- `setSpeed(float speed)` -> `void`
- `showDialog(Dialog dialog)` -> `boolean`
- `showViewsAfterOpening()` -> `void`
- `soundEnabled()` -> `boolean`
- `startActivityForResult(Intent photoPickerIntent, int code)` -> `void`
- `switchByTap(boolean forward)` -> `void`
- `switchToPip()` -> `void`
- `toggleSilentMode()` -> `void`
- `updatePlayingMode()` -> `void`

## `org.telegram.ui.Stories.StoryViewer$PlaceProvider`
- `loadNext(boolean forward)` -> `default void`
- `preLayout(long currentDialogId, int messageId, Runnable o)` -> `default void`

## `org.telegram.ui.Stories.StoryViewer$TransitionViewHolder`
- `clear()` -> `void`
- `getAvatarImageRoundRadius()` -> `Integer`

## `org.telegram.ui.Stories.StoryWaveEffectView`
- `static launch(Context context, float cx, float cy, float r)` -> `StoryWaveEffectView`
- `onSurfaceTextureAvailable(@NonNull SurfaceTexture surface, int width, int height)` -> `void`
- `onSurfaceTextureDestroyed(@NonNull SurfaceTexture surface)` -> `boolean`
- `onSurfaceTextureSizeChanged(@NonNull SurfaceTexture surface, int width, int height)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `prepare()` -> `StoryWaveEffectView`
- `start()` -> `StoryWaveEffectView`

## `org.telegram.ui.Stories.StoryWaveEffectView$RenderingThread`
- `finish()` -> `void`
- `run()` -> `void`

## `org.telegram.ui.Stories.StoryWidgetsImageDecorator`
- `onAttachedToWindow(ImageReceiver imageReceiver)` -> `void`
- `onDetachedFromWidnow()` -> `void`
- `onDraw(Canvas canvas, ImageReceiver imageReceiver)` -> `void`

## `org.telegram.ui.Stories.StoryWidgetsImageDecorator$ReactionWidget`
- `draw(Canvas canvas, ImageReceiver imageReceiver, float alpha)` -> `void`
- `onAttachedToWindow(boolean attached)` -> `void`
- `setParent(View parentView)` -> `void`

## `org.telegram.ui.Stories.StoryWidgetsImageDecorator$WeatherWidget`
- `draw(Canvas canvas, ImageReceiver imageReceiver, float alpha)` -> `void`
- `onAttachedToWindow(boolean attached)` -> `void`
- `setParent(View parentView)` -> `void`

## `org.telegram.ui.Stories.UploadingDotsSpannable`
- `draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint)` -> `void`
- `getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm)` -> `int`
- `static replace(CharSequence text, View parent)` -> `CharSequence`
- `static replace(CharSequence text, View parent, boolean isMediumTypeface)` -> `CharSequence`
- `setParent(View parent, boolean isMediumTypeface)` -> `void`

## `org.telegram.ui.Stories.UserListPoller`
- `static getInstance(int account)` -> `UserListPoller`

## `org.telegram.ui.Stories.ViewsForPeerStoriesRequester`
- `getStoryIds(ArrayList<Integer> ids)` -> `void`
- `start(boolean start)` -> `void`
- `updateStories(ArrayList<Integer> reqIds, TL_stories.TL_stories_storyViews storyViews)` -> `boolean`

## `org.telegram.ui.Stories.bots.BotPreviewsEditContainer`
- `createStory(final String lang_code)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getBotPreviewsSubtitle()` -> `String`
- `getCurrentLang()` -> `String`
- `getCurrentList()` -> `StoriesController.BotPreviewsList`
- `getCurrentListView()` -> `RecyclerListView`
- `getItemsCount()` -> `int`
- `getStartedTrackingX()` -> `int`
- `isActionModeShowed()` -> `boolean`
- `isSelected(MessageObject messageObject)` -> `boolean`
- `isSelectedAll()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onSelectedTabChanged()` -> `void`
- `static push(int currentAccount, long did, String lang_code, TL_bots.botPreviewMedia media)` -> `void`
- `select(MessageObject messageObject)` -> `boolean`
- `selectAll()` -> `void`
- `setVisibleHeight(int height)` -> `void`
- `unselect(MessageObject messageObject)` -> `boolean`
- `unselectAll()` -> `void`
- `updateSelection(boolean animated)` -> `void`

## `org.telegram.ui.Stories.bots.BotPreviewsEditContainer$BotPreviewsEditLangContainer`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getNextMediaColumnsCount(int mediaColumnsCount, boolean up)` -> `int`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setList(StoriesController.BotPreviewsList list)` -> `void`
- `setVisibleHeight(int height)` -> `void`
- `updateSelection(boolean animated)` -> `void`

## `org.telegram.ui.Stories.bots.BotPreviewsEditContainer$BotPreviewsEditLangContainer$FooterView`
- `set(CharSequence text, CharSequence buttonText, Runnable buttonListener)` -> `void`
- `set(CharSequence text, CharSequence buttonText, Runnable buttonListener, CharSequence button2Text, Runnable button2Listener)` -> `void`

## `org.telegram.ui.Stories.bots.BotPreviewsEditContainer$BotPreviewsEditLangContainer$StoriesAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `getLetter(int position)` -> `String`
- `getPositionForScrollProgress(RecyclerListView listView, float progress, int[] position)` -> `void`
- `getTotalItemsCount()` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `makeSupporting()` -> `StoriesAdapter`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onFastScrollSingleTap()` -> `void`
- `reorderDone()` -> `void`
- `setList(StoriesController.StoriesList list)` -> `void`
- `swapElements(int fromPosition, int toPosition)` -> `boolean`

## `org.telegram.ui.Stories.bots.BotPreviewsEditContainer$ChooseLanguageSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `getTitle()` -> `CharSequence`

## `org.telegram.ui.Stories.bots.BotPreviewsEditContainer$ChooseLanguageSheet$LanguageView`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(TranslateController.Language lng, boolean divider)` -> `void`

## `org.telegram.ui.Stories.bots.BotPreviewsEditContainer$ChooseLanguageSheet$LanguageView$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `LanguageView`
- `static of(TranslateController.Language l)` -> `UItem`

## `org.telegram.ui.Stories.recorder.AlbumButton`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Stories.recorder.ButtonWithCounterView`
- `calculateCounterWidth(float width, float percent)` -> `float`
- `disableRippleView()` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getTextPaint()` -> `TextPaint`
- `isEnabled()` -> `boolean`
- `isLoading()` -> `boolean`
- `isSubTextVisible()` -> `boolean`
- `isTimerActive()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setColor(int color)` -> `void`
- `setCount(int count, boolean animated)` -> `void`
- `setCount(String count, boolean animated)` -> `void`
- `setCountFilled(boolean filled)` -> `void`
- `setCounterColor(int color)` -> `void`
- `setEnabled(boolean enabled)` -> `void`
- `setFilled(boolean filled)` -> `void`
- `setFlickeringLoading(boolean flickeringLoading)` -> `void`
- `setGlobalAlpha(float v)` -> `void`
- `setLoading(boolean loading)` -> `void`
- `setMinWidth(int px)` -> `void`
- `setNeutral()` -> `ButtonWithCounterView`
- `setRound()` -> `ButtonWithCounterView`
- `setRoundRadius(int radiusDp)` -> `void`
- `setShowZero(boolean showZero)` -> `void`
- `setSubText(CharSequence newText, boolean animated)` -> `void`
- `setSubTextHacks(boolean splitByWords, boolean preserveIndex, boolean startFromEnd, boolean enforceByLetter)` -> `void`
- `setText(CharSequence newText)` -> `void`
- `setText(CharSequence newText, boolean animated)` -> `void`
- `setText(CharSequence newText, boolean animated, boolean moveDown)` -> `void`
- `setTextAlpha(float v)` -> `void`
- `setTextColor(int color)` -> `void`
- `setTextHacks(boolean splitByWords, boolean preserveIndex, boolean startFromEnd, boolean enforceByLetter)` -> `void`
- `setTimer(int seconds, Runnable whenTimerUp)` -> `void`
- `setUseWrapContent(boolean useWrapContent)` -> `void`
- `subTextSplitToWords()` -> `boolean`
- `updateColors(Theme.ResourcesProvider resourcesProvider)` -> `void`
- `updateColors()` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`
- `withCounterIcon()` -> `void`
- `wrapContentDynamic()` -> `void`

## `org.telegram.ui.Stories.recorder.CaptionContainerView`
- `afterUpdateShownKeyboard(boolean show)` -> `void`
- `beforeUpdateShownKeyboard(boolean show)` -> `void`
- `captionLimitToast()` -> `boolean`
- `clear()` -> `void`
- `clearFocus()` -> `void`
- `clipChild(View child)` -> `boolean`
- `closeKeyboard()` -> `void`
- `customBlur()` -> `boolean`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `done()` -> `void`
- `drawBlur(BlurringShader.StoryBlurDrawer blur, Canvas canvas, RectF rect, float r, boolean text, float ox, float oy, boolean thisView, float alpha)` -> `void`
- `drawBlurBitmap(Bitmap bitmap, float amount)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `drawOver(Canvas canvas, RectF bounds)` -> `void`
- `drawOver2(Canvas canvas, RectF bounds, float alpha)` -> `void`
- `drawOver2FromParent()` -> `boolean`
- `forceRound()` -> `float`
- `getBounds()` -> `RectF`
- `getCaptionDefaultLimit()` -> `int`
- `getCaptionLimit()` -> `int`
- `getCaptionPremiumLimit()` -> `int`
- `getCodePointCount()` -> `int`
- `getEditTextHeight()` -> `int`
- `getEditTextHeightClosedKeyboard()` -> `int`
- `getEditTextLeft()` -> `int`
- `getEditTextStyle()` -> `int`
- `getOver2Alpha()` -> `float`
- `getSelectionLength()` -> `int`
- `getText()` -> `CharSequence`
- `ignoreTouches(float x, float y)` -> `boolean`
- `invalidateBlur()` -> `void`
- `invalidateDrawOver2()` -> `void`
- `isAtTop()` -> `boolean`
- `isCaptionOverLimit()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onBackPressed()` -> `boolean`
- `onCaptionLimitUpdate(boolean overLimit)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onEditHeightChange(int height)` -> `void`
- `onLineCountChanged(int oldLineCount, int newLineCount)` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onTextChange()` -> `void`
- `setAccount(int currentAccount)` -> `void`
- `setBlurredBackgroundDrawableForMentions(BlurredBackgroundDrawableViewFactory factoryForMentions)` -> `void`
- `setCollapsed(boolean collapsed, int cx)` -> `void`
- `setDialogId(long dialogId)` -> `void`
- `setOnHeightUpdate(Utilities.Callback<Integer> onHeightUpdate)` -> `void`
- `setOnKeyboardOpen(Utilities.Callback<Boolean> onKeyboardOpen)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `setReply(CharSequence title, CharSequence text)` -> `void`
- `setText(CharSequence text)` -> `void`
- `setUiBlurBitmap(Utilities.CallbackVoidReturn<Bitmap> get)` -> `void`
- `setupMentionContainer()` -> `void`
- `updateColors(Theme.ResourcesProvider resourcesProvider)` -> `void`
- `updateEditTextLeft()` -> `void`
- `updateKeyboard(int keyboardHeight)` -> `void`
- `updateMentionsLayoutPosition()` -> `void`

## `org.telegram.ui.Stories.recorder.CaptionContainerView$BounceableImageView`
- `draw(Canvas canvas)` -> `void`
- `setPressed(boolean pressed)` -> `void`

## `org.telegram.ui.Stories.recorder.CaptionContainerView$PeriodDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `draw(@NonNull Canvas canvas, float alpha)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setBounds(@NonNull Rect bounds)` -> `void`
- `setBounds(int left, int top, int right, int bottom)` -> `void`
- `setCenterXY(float x, float y)` -> `void`
- `setClear(boolean clear)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setTextSize(float dp)` -> `void`
- `setValue(int num, boolean fill, boolean animated)` -> `void`
- `updateColors(int strokeColor, int fillColor, int activeTextColor)` -> `void`

## `org.telegram.ui.Stories.recorder.CaptionStory`
- `afterUpdateShownKeyboard(boolean show)` -> `void`
- `beforeUpdateShownKeyboard(boolean show)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawOver(Canvas canvas, RectF bounds)` -> `void`
- `drawOver2(Canvas canvas, RectF bounds, float alpha)` -> `void`
- `getCaptionDefaultLimit()` -> `int`
- `getCaptionPremiumLimit()` -> `int`
- `getTimelineHeight()` -> `int`
- `hidePeriodPopup()` -> `void`
- `isRecording()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `removeRound()` -> `void`
- `setAmplitude(double value)` -> `void`
- `setHasRoundVideo(boolean hasRoundVideo)` -> `void`
- `setOnPeriodUpdate(Utilities.Callback<Integer> listener)` -> `void`
- `setOnPremiumHint(Utilities.Callback<Integer> listener)` -> `void`
- `setPeriod(int period)` -> `void`
- `setPeriod(int period, boolean animated)` -> `void`
- `setPeriodVisible(boolean visible)` -> `void`
- `showRemoveRoundAlert()` -> `void`
- `stopRecording()` -> `boolean`

## `org.telegram.ui.Stories.recorder.CaptionStory$RecordDot`
- `attach()` -> `void`
- `detach()` -> `void`
- `draw(Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `playDeleteAnimation()` -> `void`
- `reset()` -> `void`
- `resetAlpha()` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Stories.recorder.CollageLayout`
- `equals(@Nullable Object obj)` -> `boolean`
- `static getLayouts()` -> `ArrayList<CollageLayout>`
- `static getMaxCount()` -> `int`
- `static of(int count)` -> `CollageLayout`
- `toString()` -> `String`

## `org.telegram.ui.Stories.recorder.CollageLayout$Part`
- `b(float h)` -> `float`
- `bounds(RectF rect, float w, float h)` -> `void`
- `h(float h)` -> `float`
- `l(float w)` -> `float`
- `r(float w)` -> `float`
- `t(float h)` -> `float`
- `w(float w)` -> `float`

## `org.telegram.ui.Stories.recorder.CollageLayoutButton$CollageLayoutDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Stories.recorder.CollageLayoutButton$CollageLayoutListView`
- `isVisible()` -> `boolean`
- `setBounds(float left, float right)` -> `void`
- `setOnLayoutClick(Utilities.Callback<CollageLayout> onLayoutClick)` -> `void`
- `setSelected(CollageLayout layout)` -> `void`
- `setVisible(final boolean visible, boolean animated)` -> `void`

## `org.telegram.ui.Stories.recorder.CollageLayoutView2`
- `clear(boolean destroy)` -> `void`
- `dispatchDraw(@NonNull Canvas c)` -> `void`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `drawScrim(Canvas canvas, float progress)` -> `void`
- `forceNotRestorePosition()` -> `void`
- `getBlurRenderNode()` -> `Object`
- `getBounds(RectF bounds)` -> `void`
- `getContent()` -> `ArrayList<StoryEntry>`
- `getCurrent()` -> `Part`
- `getDuration()` -> `long`
- `getFilledCount()` -> `int`
- `getFilledProgress()` -> `float`
- `getLayout()` -> `CollageLayout`
- `getMainPart()` -> `Part`
- `getNext()` -> `Part`
- `getOrder()` -> `ArrayList<Integer>`
- `getPartAt(float x, float y)` -> `Part`
- `getPartIndexAt(float x, float y)` -> `int`
- `getPosition()` -> `long`
- `getPositionWithOffset()` -> `long`
- `getTotalCount()` -> `int`
- `highlight(int i)` -> `void`
- `isPlaying()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `push(StoryEntry content)` -> `boolean`
- `retake(Part part)` -> `void`
- `seekTo(long progress)` -> `void`
- `seekTo(long progress, boolean fast)` -> `void`
- `set(StoryEntry entry, boolean animated)` -> `void`
- `setCameraNeedsBlur(boolean needsBlur)` -> `void`
- `setCameraThumb(Drawable cameraThumbDrawable)` -> `void`
- `setCameraThumbVisible(boolean cameraThumbVisible)` -> `void`
- `setCameraView(CameraView cameraView)` -> `void`
- `setCancelGestures(Runnable cancelGestures)` -> `void`
- `setLayout(CollageLayout layout, boolean animated)` -> `void`
- `setMuted(boolean muted)` -> `void`
- `setOnCameraThumbClick(Runnable listener)` -> `void`
- `setPlaying(boolean playing)` -> `void`
- `setPreview(boolean preview)` -> `void`
- `setPreviewView(PreviewView previewView)` -> `void`
- `setResetState(Runnable onResetState)` -> `void`
- `setTimelineView(TimelineView timelineView)` -> `void`
- `swap(int from, int to)` -> `void`
- `swap(Part a, Part b)` -> `boolean`
- `updateCameraNeedsBlur()` -> `void`
- `updatePartsState()` -> `void`

## `org.telegram.ui.Stories.recorder.CollageLayoutView2$Part`
- `destroyContent()` -> `void`
- `setContent(StoryEntry entry)` -> `void`
- `setCurrent(boolean current)` -> `void`
- `setPart(CollageLayout.Part part, boolean animated)` -> `void`

## `org.telegram.ui.Stories.recorder.CropEditor`
- `apply()` -> `void`
- `close()` -> `void`
- `disappearStarts()` -> `void`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `getAppearProgress()` -> `float`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `setAppearProgress(float appearProgress)` -> `void`
- `setEntry(StoryEntry entry)` -> `void`
- `stop()` -> `void`

## `org.telegram.ui.Stories.recorder.CropEditor$ContentView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `drawImage(Canvas canvas, boolean fromPreview)` -> `void`

## `org.telegram.ui.Stories.recorder.CropInlineEditor`
- `apply()` -> `void`
- `close()` -> `void`
- `disappearStarts()` -> `void`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `getAppearProgress()` -> `float`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `set(PhotoView photoView)` -> `void`
- `setAppearProgress(float appearProgress)` -> `void`
- `stop()` -> `void`

## `org.telegram.ui.Stories.recorder.CropInlineEditor$ContentView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`

## `org.telegram.ui.Stories.recorder.DownloadButton`
- `setEntry(StoryEntry entry)` -> `void`
- `showFailedVideo()` -> `void`
- `showToast(int resId, CharSequence text)` -> `void`

## `org.telegram.ui.Stories.recorder.DownloadButton$BuildingVideo`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `start()` -> `void`
- `stop(boolean cancel)` -> `void`

## `org.telegram.ui.Stories.recorder.DownloadButton$PreparingVideoToast`
- `hide()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setDone(int resId, CharSequence text, int delay)` -> `void`
- `setOnCancelListener(Runnable onCancel)` -> `void`
- `setProgress(float progress)` -> `void`
- `show()` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Stories.recorder.DraftSavedHint`
- `dispatchDraw(Canvas canvas)` -> `void`
- `hide(boolean animated)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `show(boolean show, boolean animated)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.Stories.recorder.DraftsController`
- `append(StoryEntry entry)` -> `void`
- `cleanup()` -> `void`
- `getForEdit(long dialogId, TL_stories.StoryItem storyItem)` -> `StoryEntry`

## `org.telegram.ui.Stories.recorder.DraftsController$StoryDraft`
- `getObjectSize()` -> `int`
- `toEntry()` -> `StoryEntry`
- `toStream(AbstractSerializedData stream)` -> `void`

## `org.telegram.ui.Stories.recorder.EmojiBottomSheet`
- `closeKeyboard()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `static getCacheType(boolean stickers)` -> `int`
- `getContainerViewHeight()` -> `int`
- `setBlurDelegate(Utilities.Callback2<Bitmap, Float> drawBlurBitmap)` -> `void`
- `showPremiumBulletin(String text)` -> `void`
- `whenDocumentSelected(Utilities.Callback3Return<Object, TLRPC.Document, Boolean, Boolean> listener)` -> `EmojiBottomSheet`
- `whenPlusSelected(Runnable listener)` -> `EmojiBottomSheet`
- `whenWidgetSelected(Utilities.CallbackReturn<Integer, Boolean> listener)` -> `EmojiBottomSheet`

## `org.telegram.ui.Stories.recorder.EmojiBottomSheet$ContainerView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `onDetachedFromWindow()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setTranslationY(float translationY)` -> `void`

## `org.telegram.ui.Stories.recorder.EmojiBottomSheet$EmojiListView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `setBounds(float topBound, float bottomBound)` -> `void`
- `setLayoutManager(@Nullable LayoutManager layout)` -> `void`

## `org.telegram.ui.Stories.recorder.EmojiBottomSheet$EmojiListView$DrawingInBackgroundLine`
- `draw(Canvas canvas, long time, int w, int h, float alpha)` -> `void`
- `drawInBackground(Canvas canvas)` -> `void`
- `drawInUiThread(Canvas canvas, float palpha)` -> `void`
- `onFrameReady()` -> `void`
- `prepareDraw(long time)` -> `void`

## `org.telegram.ui.Stories.recorder.EmojiBottomSheet$EmojiListView$EmojiImageView`
- `getScale()` -> `float`
- `invalidate()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setDrawable(Drawable drawable)` -> `void`
- `setEmoji(TLRPC.Document document, boolean isSticker)` -> `void`
- `setEmojiId(long documentId, boolean isSticker)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `setSticker(TLRPC.Document document)` -> `void`
- `update(long time)` -> `void`

## `org.telegram.ui.Stories.recorder.EmojiBottomSheet$IPage`
- `bind(int type)` -> `void`
- `top()` -> `float`
- `updateTops()` -> `void`

## `org.telegram.ui.Stories.recorder.EmojiBottomSheet$NoEmojiView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `update(int i)` -> `void`
- `update()` -> `void`

## `org.telegram.ui.Stories.recorder.EmojiBottomSheet$Page`
- `atTop()` -> `boolean`
- `bind(int type)` -> `void`
- `lockTop()` -> `float`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `top()` -> `float`
- `updateTops()` -> `void`

## `org.telegram.ui.Stories.recorder.EmojiBottomSheet$Page$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `update()` -> `void`

## `org.telegram.ui.Stories.recorder.EmojiBottomSheet$SearchField`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setOnSearchQuery(Utilities.Callback2<String, Integer> onSearchQuery)` -> `void`
- `showProgress(boolean progress)` -> `void`

## `org.telegram.ui.Stories.recorder.EmojiBottomSheet$StoryWidgetsCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setOnButtonClickListener(Utilities.Callback<Integer> listener)` -> `void`

## `org.telegram.ui.Stories.recorder.EmojiBottomSheet$StoryWidgetsCell$BaseWidget`
- `onAttachToWindow(boolean attached)` -> `void`

## `org.telegram.ui.Stories.recorder.EmojiBottomSheet$StoryWidgetsCell$Button`
- `draw(Canvas canvas, float left, float top)` -> `void`
- `needsPremium()` -> `Button`
- `setText(CharSequence text)` -> `void`

## `org.telegram.ui.Stories.recorder.EmojiBottomSheet$StoryWidgetsCell$ReactionWidget`
- `draw(Canvas canvas, float left, float top)` -> `void`
- `onAttachToWindow(boolean attached)` -> `void`

## `org.telegram.ui.Stories.recorder.EmojiBottomSheet$TabsView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setOnTypeSelected(Utilities.Callback<Integer> listener)` -> `void`
- `setType(float type)` -> `void`

## `org.telegram.ui.Stories.recorder.FlashViews`
- `drawGradient(Canvas canvas, boolean bg)` -> `void`
- `flash(Utilities.Callback<Utilities.Callback<Runnable>> takePicture)` -> `void`
- `flashIn(Runnable done)` -> `void`
- `flashOut()` -> `void`
- `static getColor(float warmth)` -> `int`
- `previewEnd()` -> `void`
- `previewStart()` -> `void`
- `setIntensity(float intensity)` -> `void`
- `setWarmth(float warmth)` -> `void`

## `org.telegram.ui.Stories.recorder.FlashViews$ImageViewInvertable`
- `setInvert(float invert)` -> `void`

## `org.telegram.ui.Stories.recorder.HintTextView`
- `draw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setInvert(float invert)` -> `void`
- `setText(CharSequence text, boolean animated)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Stories.recorder.HintView2`
- `allowBlur()` -> `HintView2`
- `allowBlur(boolean allow)` -> `HintView2`
- `containsTouch(MotionEvent ev, float ox, float oy)` -> `boolean`
- `static cutInFancyHalf(CharSequence text, TextPaint paint)` -> `int`
- `static cutInFancyHalfText(CharSequence text, TextPaint paint)` -> `CharSequence`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawBgPath(Canvas canvas, float alpha)` -> `void`
- `getText()` -> `CharSequence`
- `getTextPaint()` -> `TextPaint`
- `hide()` -> `void`
- `hide(boolean animated)` -> `void`
- `static measureCorrectly(CharSequence text, Paint paint)` -> `float`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `pause()` -> `void`
- `setAnimatedTextHacks(boolean splitByWords, boolean preserveIndex, boolean startFromEnd)` -> `HintView2`
- `setArrowSize(float halfWidthDp, float heightDp)` -> `HintView2`
- `setBgColor(int color)` -> `HintView2`
- `setBounce(boolean enable)` -> `HintView2`
- `setCloseButton(boolean show)` -> `HintView2`
- `setCloseButtonMargin(int marginDp)` -> `HintView2`
- `setDirection(int direction)` -> `HintView2`
- `setDuration(long duration)` -> `HintView2`
- `setFlicker(float lineWidthDp, int color)` -> `HintView2`
- `setHideByTouch(boolean enable)` -> `HintView2`
- `setIcon(int resId)` -> `HintView2`
- `setIcon(Drawable icon)` -> `HintView2`
- `setIconMargin(int marginDp)` -> `HintView2`
- `setIconTranslate(float iconTx, float iconTy)` -> `HintView2`
- `setInnerPadding(float leftDp, float topDp, float rightDp, float bottomDp)` -> `HintView2`
- `setJoint(float joint, float jointTranslateDp)` -> `HintView2`
- `setJointPx(float joint, float jointTranslatePx)` -> `HintView2`
- `setMaxWidth(float widthDp)` -> `HintView2`
- `setMaxWidthPx(int widthPx)` -> `HintView2`
- `setMultilineText(boolean enable)` -> `HintView2`
- `setOnHiddenListener(Runnable listener)` -> `HintView2`
- `setRounding(float roundingDp)` -> `HintView2`
- `setRoundingWithCornerEffect(boolean enable)` -> `HintView2`
- `setSelectorColor(int selectorColor)` -> `HintView2`
- `setShadow(float radius, float dx, float dy, int color)` -> `HintView2`
- `setText(CharSequence text)` -> `HintView2`
- `setText(CharSequence text, boolean animated)` -> `HintView2`
- `setTextAlign(Layout.Alignment alignment)` -> `HintView2`
- `setTextColor(int color)` -> `HintView2`
- `setTextSize(float sizeDp)` -> `HintView2`
- `setTextTypeface(Typeface typeface)` -> `HintView2`
- `show(boolean show)` -> `void`
- `show()` -> `HintView2`
- `shown()` -> `boolean`
- `unpause()` -> `void`
- `useScale(boolean enable)` -> `HintView2`
- `useTranslate(boolean enable)` -> `HintView2`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Stories.recorder.KeyboardNotifier`
- `awaitKeyboard()` -> `void`
- `fire()` -> `void`
- `getKeyboardHeight()` -> `int`
- `ignore(boolean ignore)` -> `void`
- `keyboardVisible()` -> `boolean`
- `useInsets()` -> `KeyboardNotifier`
- `useMinusNavbar()` -> `KeyboardNotifier`

## `org.telegram.ui.Stories.recorder.LivePlayerView`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `draw(@NonNull Canvas canvas)` -> `void`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getBitmap()` -> `Bitmap`
- `getPlaceholderView()` -> `View`
- `getSink()` -> `VideoSink`
- `getTextureView()` -> `View`
- `isAvailable()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onFirstFrameRendered()` -> `void`
- `onFrameResolutionChanged(int videoWidth, int videoHeight, int rotation)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `release()` -> `void`
- `reset()` -> `void`
- `setAccount(int account)` -> `void`
- `setIsEmpty(boolean empty, Runnable continueRunnable)` -> `void`
- `setKeyboardOffset(float offset)` -> `void`
- `setOnFirstFrameCallback(Runnable firstFrameCallback)` -> `void`
- `setScope(long dialogId, VideoPlayerSharedScope scope)` -> `void`
- `setSecure(boolean secure)` -> `void`
- `setTextureVisible(boolean visible, boolean animated)` -> `void`

## `org.telegram.ui.Stories.recorder.LivePlayerView$EmptyView`
- `setVisibility(int visibility)` -> `void`

## `org.telegram.ui.Stories.recorder.MultipleStoriesSelector`
- `customBlur()` -> `boolean`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `drawBlur(BlurringShader.StoryBlurDrawer blur, Canvas canvas, RectF rect, float r, boolean text, float ox, float oy, boolean thisView, float alpha)` -> `void`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `onBackPressed()` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onSwitchToStory(int index, StoryEntry entry)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `set(ArrayList<StoryEntry> stories, ArrayList<Integer> selectedOrder, ArrayList<Integer> selectedStories)` -> `void`
- `setSelected(int selectedStory)` -> `void`
- `showHint()` -> `void`
- `showList(boolean show, boolean animated)` -> `void`
- `update()` -> `void`

## `org.telegram.ui.Stories.recorder.MultipleStoriesSelector$EntryView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `set(int id, int position, StoryEntry entry)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setOnCheckboxClick(View.OnClickListener listener)` -> `void`
- `setPosition(int position)` -> `void`
- `setSelected(boolean selected, boolean animated)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Stories.recorder.MultipleStoriesSelector$EntryView$Factory`
- `static asStoryEntry(int id, int position, StoryEntry entry)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `EntryView`

## `org.telegram.ui.Stories.recorder.PaintView`
- `adjustPanLayoutHelperProgress()` -> `float`
- `allowInteraction(EntityView entityView)` -> `boolean`
- `appearAnimation(View view)` -> `void`
- `static argb2Rgba(int argb)` -> `int`
- `clearAll()` -> `void`
- `clearSelection()` -> `void`
- `createEmojiView()` -> `void`
- `createMessage(ArrayList<MessageObject> messageObjects, boolean select, boolean hasVideo)` -> `MessageEntityView`
- `createPhoto(String path, boolean select)` -> `PhotoView`
- `createPhoto(TLObject obj, boolean select)` -> `PhotoView`
- `createRound(String thumbPath, boolean select)` -> `RoundView`
- `destroy()` -> `void`
- `didSetAnimatedSticker(RLottieDrawable drawable)` -> `void`
- `dismiss()` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `findMessageView()` -> `MessageEntityView`
- `findRoundView()` -> `RoundView`
- `getAdditionalBottom()` -> `int`
- `getAdditionalTop()` -> `int`
- `getBitmap(ArrayList<VideoEditedInfo.MediaEntity> entities, Bitmap[] thumbBitmap)` -> `Bitmap`
- `getBitmap(ArrayList<VideoEditedInfo.MediaEntity> entities, int resultWidth, int resultHeight, boolean drawPaint, boolean drawEntities, boolean drawMessage, boolean drawBlur, StoryEntry entry)` -> `Bitmap`
- `getBlurBitmap()` -> `Bitmap`
- `getBottomLayout()` -> `View`
- `getCancelView()` -> `View`
- `getCenterLocation(EntityView entityView)` -> `int[]`
- `getCropRotation()` -> `float`
- `getDoneView()` -> `View`
- `getEmojiPadding(boolean panned)` -> `int`
- `getEntitiesView()` -> `View`
- `getLcm()` -> `long`
- `getMasks()` -> `List<TLRPC.InputDocument>`
- `getOffsetTranslationY()` -> `float`
- `getPreviewViews()` -> `List<View>`
- `getRenderInputView()` -> `View`
- `getRenderView()` -> `RenderView`
- `getSelectedEntity()` -> `EntityView`
- `getSelectionEntitiesView()` -> `View`
- `getTextDimView()` -> `View`
- `getTopLayout()` -> `View`
- `getTransformedTouch(float rawX, float rawY, float[] output)` -> `void`
- `getWeightChooserView()` -> `View`
- `init()` -> `void`
- `isEntityDeletable()` -> `boolean`
- `isEntityDeletable(EntityView entityView)` -> `boolean`
- `static isVideoStickerDocument(TLRPC.Document document)` -> `boolean`
- `maybeDismiss(Activity parentActivity, Runnable okRunnable)` -> `void`
- `maybeShowDismissalAlert(PhotoViewer photoViewer, Activity parentActivity, Runnable okRunnable)` -> `void`
- `measureKeyboardHeight()` -> `int`
- `onAddButtonPressed(View btn)` -> `void`
- `onAnimationStateChanged(boolean isStart)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onAudioSelect(MessageObject document)` -> `void`
- `onBackPressed()` -> `boolean`
- `onBrushSelected(Brush brush)` -> `void`
- `onCleanupEntities()` -> `void`
- `onColorPickerSelected()` -> `void`
- `onCreateRound(RoundView roundView)` -> `void`
- `onDeleteRound()` -> `void`
- `onDeselectRound(RoundView roundView)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onEmojiButtonClick()` -> `void`
- `onEntityDragEnd(boolean delete)` -> `void`
- `onEntityDragStart()` -> `void`
- `onEntityLongClicked(EntityView entityView)` -> `boolean`
- `onEntitySelected(EntityView entityView)` -> `boolean`
- `onGalleryClick()` -> `void`
- `onGetPalette()` -> `PersistColorPalette`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onNewTextSelected()` -> `void`
- `onOpenCloseStickersAlert(boolean open)` -> `void`
- `onParentPreDraw()` -> `void`
- `onPhotoEntityCropClick(PhotoView photoView)` -> `void`
- `onResume()` -> `void`
- `onSelectRound(RoundView roundView)` -> `void`
- `onSizeChanged(int height, boolean isWidthGreater)` -> `void`
- `onSwitchSegmentedAnimation(PhotoView photoView)` -> `void`
- `onTextAdd()` -> `void`
- `onTextAlignmentSelected(int align)` -> `void`
- `onTextOutlineSelected(View v)` -> `void`
- `onTouch(MotionEvent ev)` -> `boolean`
- `onTryDeleteRound()` -> `void`
- `onTypefaceButtonClicked()` -> `void`
- `onTypefaceSelected(PaintTypeface typeface)` -> `void`
- `openPaint()` -> `void`
- `openStickers()` -> `void`
- `openText()` -> `void`
- `selectEntity(EntityView entityView)` -> `boolean`
- `setBlurManager(BlurringShader.BlurManager blurManager)` -> `void`
- `setCoverPreview(boolean isCoverPreview)` -> `void`
- `setCoverTime(long time)` -> `void`
- `setHasAudio(boolean audio)` -> `void`
- `setOffsetTranslationY(float y, float progress, int keyboardHeight, boolean isPan)` -> `void`
- `setOnCancelButtonClickedListener(Runnable callback)` -> `void`
- `setOnDoneButtonClickedListener(Runnable callback)` -> `void`
- `setTransform(float scale, float trX, float trY, float imageWidth, float imageHeight)` -> `void`
- `showReactionsLayout(boolean show)` -> `void`
- `shutdown()` -> `void`
- `updateColors()` -> `void`
- `updateZoom(boolean zoomedOut)` -> `void`
- `wouldBeVideo()` -> `boolean`

## `org.telegram.ui.Stories.recorder.PaintView$PopupButton`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `performClick()` -> `boolean`
- `setIcon(int resId)` -> `void`
- `setIcon(int resId, boolean fillup, boolean animated)` -> `void`
- `setSelected(boolean selected)` -> `void`
- `setText(CharSequence text)` -> `void`

## `org.telegram.ui.Stories.recorder.PaintView$PopupWindowLayout`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Stories.recorder.PhotoVideoSwitcherView`
- `allowTouch()` -> `boolean`
- `draw(Canvas canvas)` -> `void`
- `isScrolling()` -> `boolean`
- `isTouch()` -> `boolean`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `scrollX(float dx)` -> `void`
- `scrolledEnough()` -> `boolean`
- `setInvert(float invert)` -> `void`
- `setOnSwitchModeListener(Utilities.Callback<Integer> onSwitchModeListener)` -> `void`
- `setOnSwitchingModeListener(Utilities.Callback<Float> onSwitchingModeListener)` -> `void`
- `stopScroll(float velocityX)` -> `boolean`
- `switchMode(int newMode)` -> `void`

## `org.telegram.ui.Stories.recorder.PlayPauseButton`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Stories.recorder.PreviewButtons`
- `appear(boolean appear, boolean animated)` -> `void`
- `isShareEnabled()` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setButtonVisible(int btn, boolean visible)` -> `void`
- `setOnClickListener(Utilities.Callback<Integer> onClickListener)` -> `void`
- `setShareEnabled(boolean enabled)` -> `void`
- `setShareText(String text, boolean arrow)` -> `void`

## `org.telegram.ui.Stories.recorder.PreviewButtons$ButtonView`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Stories.recorder.PreviewButtons$ShareButtonView`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setPressed(boolean pressed)` -> `void`

## `org.telegram.ui.Stories.recorder.PreviewHighlightView`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `show(boolean topOrBottom, boolean show, View fadeView)` -> `void`
- `updateCaption(CharSequence caption)` -> `void`
- `updateCount()` -> `void`

## `org.telegram.ui.Stories.recorder.PreviewView`
- `applyMatrix()` -> `void`
- `attachRoundView(RoundView roundView)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawBackground(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `drawContent(Canvas canvas)` -> `void`
- `static getBackgroundDrawable(Drawable prevDrawable, int currentAccount, long dialogId, boolean isDark)` -> `Drawable`
- `static getBackgroundDrawable(Drawable prevDrawable, int currentAccount, TLRPC.WallPaper wallpaper, boolean isDark)` -> `Drawable`
- `static getBackgroundDrawableFromTheme(int currentAccount, String emoticon, boolean isDark)` -> `Drawable`
- `static getBackgroundDrawableFromTheme(int currentAccount, String emoticon, boolean isDark, boolean preview)` -> `Drawable`
- `static getBackgroundDrawableFromTheme(int currentAccount, EmojiThemes chatTheme, int prevPhase, boolean isDark)` -> `Drawable`
- `static getBackgroundDrawableFromTheme(int currentAccount, EmojiThemes chatTheme, int prevPhase, boolean isDark, boolean preview)` -> `Drawable`
- `getContentHeight()` -> `int`
- `getContentMatrix(Matrix matrix)` -> `void`
- `getContentWidth()` -> `int`
- `getCoverBitmap(Utilities.Callback<Bitmap> whenBitmapDone, View ...views)` -> `void`
- `getCurrentPosition()` -> `long`
- `getDuration()` -> `long`
- `getOrientation()` -> `int`
- `getPaintSize()` -> `Pair<Integer, Integer>`
- `getPhotoBitmap()` -> `Bitmap`
- `getTextureView()` -> `VideoEditTextureView`
- `invalidateTextureViewHolder()` -> `void`
- `isCollage()` -> `boolean`
- `isPlaying()` -> `boolean`
- `mute(boolean value)` -> `void`
- `onAudioChanged()` -> `void`
- `onEntityDragEnd(boolean delete)` -> `void`
- `onEntityDragStart()` -> `void`
- `onEntityDragTrash(boolean enter)` -> `void`
- `onEntityDraggedBottom(boolean value)` -> `void`
- `onEntityDraggedTop(boolean value)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onRoundRemove()` -> `void`
- `onRoundSelectChange(boolean selected)` -> `void`
- `onTimeDrag(boolean dragStart, long time, boolean dragEnd)` -> `void`
- `play(boolean play)` -> `void`
- `preset(StoryEntry entry)` -> `void`
- `release()` -> `long`
- `seek(long position)` -> `void`
- `seekTo(long position, boolean fast)` -> `void`
- `set(StoryEntry entry)` -> `void`
- `set(StoryEntry entry, Runnable whenReady, long seekTo)` -> `void`
- `setAllowCropping(boolean allow)` -> `void`
- `setCollageView(CollageLayoutView2 collage)` -> `void`
- `setCropEditorDrawing(CropEditor cropEditor)` -> `void`
- `setDraw(boolean draw)` -> `void`
- `setFilterTextureView(TextureView view, PhotoFilterView photoFilterView)` -> `void`
- `setOnTapListener(Runnable listener)` -> `void`
- `setTextureViewTransform(boolean applyRotation, TextureView view)` -> `void`
- `setVideoTimelineView(TimelineView timelineView)` -> `void`
- `setVisibility(int visibility)` -> `void`
- `setupAudio(StoryEntry entry, boolean animated)` -> `void`
- `setupAudio(MessageObject messageObject, boolean animated)` -> `void`
- `setupRound(StoryEntry entry, RoundView roundView, boolean animated)` -> `void`
- `setupVideoPlayer(StoryEntry entry, Runnable whenReady, long seekTo)` -> `void`
- `setupWallpaper(StoryEntry entry, boolean animated)` -> `void`
- `updateAudioPlayer(boolean updateSeek)` -> `void`
- `updatePauseReason(int reasonId, boolean pause)` -> `void`
- `updateRoundPlayer(boolean updateSeek)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`
- `whenError(Runnable listener)` -> `void`

## `org.telegram.ui.Stories.recorder.PreviewView$TextureViewHolder`
- `activateTextureView(int w, int h)` -> `void`
- `setTextureView(TextureView textureView)` -> `void`
- `takeTextureView(Utilities.Callback<TextureView> whenReceived, Utilities.Callback2<Integer, Integer> whenActive)` -> `void`

## `org.telegram.ui.Stories.recorder.QRScanner`
- `attach(CameraView cameraView)` -> `void`
- `destroy()` -> `void`
- `detach()` -> `void`
- `getDetected()` -> `Detected`
- `getMaxSide()` -> `int`
- `getTimeout()` -> `long`
- `setPaused(boolean pause)` -> `void`

## `org.telegram.ui.Stories.recorder.QRScanner$Detected`
- `equals(Detected d)` -> `boolean`

## `org.telegram.ui.Stories.recorder.QRScanner$QrRegionDrawer`
- `draw(Canvas canvas, RectF rect)` -> `void`
- `setQrDetected(QRScanner.Detected qrResult)` -> `void`

## `org.telegram.ui.Stories.recorder.QRScanner$QrRegionView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`

## `org.telegram.ui.Stories.recorder.RecordControl`
- `dispatchHoverEvent(MotionEvent event)` -> `boolean`
- `isRecording()` -> `boolean`
- `isTouch()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `rotateFlip(float angles)` -> `void`
- `setAmplitude(float amplitude, boolean animated)` -> `void`
- `setCollageProgress(float collageProgress, boolean animated)` -> `void`
- `setDelegate(Delegate delegate)` -> `void`
- `setDual(boolean active)` -> `void`
- `setInvert(float invert)` -> `void`
- `startAsVideo(boolean isVideo)` -> `void`
- `startAsVideoT(float isVideoT)` -> `void`
- `stopRecording()` -> `void`
- `stopRecordingLoading(boolean animated)` -> `void`
- `updateGalleryImage()` -> `void`

## `org.telegram.ui.Stories.recorder.RecordControl$Delegate`
- `getMaxVideoDuration()` -> `default long`
- `getMaxVisibleVideoDuration()` -> `default long`
- `showStoriesDrafts()` -> `default boolean`

## `org.telegram.ui.Stories.recorder.RecordControl$RecordControlAccessibilityHelper`
- `getVirtualViewAt(float x, float y)` -> `int`
- `getVisibleVirtualViews(List<Integer> list)` -> `void`
- `onPerformActionForVirtualView(int id, int action, Bundle args)` -> `boolean`
- `onPopulateNodeForVirtualView(int id, @NonNull AccessibilityNodeInfoCompat info)` -> `void`

## `org.telegram.ui.Stories.recorder.RoundVideoRecorder`
- `destroy(boolean instant)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `hideTo(RoundView roundView)` -> `void`
- `onDestroy(Runnable onDestroyCallback)` -> `RoundVideoRecorder`
- `onDone(Utilities.Callback3<File, String, Long> onDoneCallback)` -> `RoundVideoRecorder`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `receivedAmplitude(double amplitude)` -> `void`
- `sinceRecording()` -> `long`
- `sinceRecordingText()` -> `String`
- `stop()` -> `void`

## `org.telegram.ui.Stories.recorder.ScannedLinkPreview`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent e)` -> `boolean`
- `inTouch()` -> `boolean`
- `isResolved()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setBlurRenderNode(View renderNodeView, Object renderNode)` -> `void`
- `setLink(String link)` -> `void`
- `whenClicked(Utilities.Callback<Utilities.Callback<BaseFragment>> clickListener)` -> `void`

## `org.telegram.ui.Stories.recorder.ScannedLinkPreview$ResolvedLink`
- `static fromChat(String link, TLRPC.Chat chat)` -> `ResolvedLink`
- `static fromUser(String link, TLRPC.User user)` -> `ResolvedLink`
- `getSubtitle()` -> `String`
- `getTitle()` -> `String`
- `open(BaseFragment fragment)` -> `void`
- `static resolve(int currentAccount, String link, Utilities.Callback<ResolvedLink> whenResolved)` -> `Runnable`
- `setImage(ImageReceiver imageReceiver)` -> `boolean`

## `org.telegram.ui.Stories.recorder.SelectPeerView`
- `set(TLRPC.InputPeer peer)` -> `void`
- `setShowing(boolean show, boolean animated)` -> `void`

## `org.telegram.ui.Stories.recorder.SliderView`
- `animateValueTo(float volume)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setMinMax(float min, float max)` -> `SliderView`
- `setOnValueChange(Utilities.Callback<Float> listener)` -> `SliderView`
- `setValue(float volume)` -> `SliderView`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Stories.recorder.StoryEntry`
- `static asCollage(CollageLayout layout, ArrayList<StoryEntry> entries)` -> `StoryEntry`
- `buildBitmap(float scale, Bitmap mainFileBitmap)` -> `Bitmap`
- `buildPhoto(File dest)` -> `void`
- `static calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight)` -> `int`
- `clearFilter()` -> `void`
- `clearPaint()` -> `void`
- `copy()` -> `StoryEntry`
- `copy(boolean withFiles)` -> `StoryEntry`
- `cutIntoEntries()` -> `ArrayList<StoryEntry>`
- `decodeBounds(String path)` -> `void`
- `destroy(boolean draft)` -> `void`
- `detectHDR(Utilities.Callback<HDRInfo> whenDetected)` -> `void`
- `static drawBackgroundDrawable(Canvas canvas, Drawable drawable, int w, int h)` -> `void`
- `static fromMedia(ArrayList<SendMessagesHelper.SendingMediaInfo> photoPathes)` -> `StoryEntry`
- `static fromPhotoEntry(MediaController.PhotoEntry photoEntry)` -> `StoryEntry`
- `static fromPhotoShoot(File file, int rotate)` -> `StoryEntry`
- `static fromStoryItem(File file, TL_stories.StoryItem storyItem)` -> `StoryEntry`
- `static fromVideoShoot(File file, String thumbPath, long duration)` -> `StoryEntry`
- `static getCoverTime(TL_stories.StoryItem storyItem)` -> `long`
- `getOriginalFile()` -> `File`
- `static getScaledBitmap(DecodeBitmap decode, int maxWidth, int maxHeight, boolean allowBlur, boolean scale)` -> `Bitmap`
- `static getScaledBitmap(DecodeBitmap decode, int maxWidth, int maxHeight, int orientation, boolean allowBlur, boolean scale)` -> `Bitmap`
- `getTotalCount()` -> `int`
- `getVideoEditedInfo(@NonNull Utilities.Callback<VideoEditedInfo> whenDone)` -> `void`
- `static isAnimated(TLRPC.Document document, String path)` -> `boolean`
- `static makeCacheFile(final int account, boolean video)` -> `File`
- `static makeCacheFile(final int account, String ext)` -> `File`
- `static repostMessage(ArrayList<MessageObject> messageObjects)` -> `StoryEntry`
- `static repostStoryItem(File file, TL_stories.StoryItem storyItem)` -> `StoryEntry`
- `setupGradient(Runnable done)` -> `void`
- `setupMatrix()` -> `void`
- `setupMatrix(Matrix matrix, int rotate)` -> `void`
- `setupMultipleStoriesSelector()` -> `void`
- `static setupScale(BitmapFactory.Options options, int reqWidth, int reqHeight)` -> `void`
- `updateFilter(PhotoFilterView filterView, Runnable whenDone)` -> `void`
- `static useForwardForRepost(MessageObject messageObject)` -> `Boolean`
- `wouldBeVideo()` -> `boolean`
- `wouldBeVideo(ArrayList<VideoEditedInfo.MediaEntity> mediaEntities)` -> `boolean`

## `org.telegram.ui.Stories.recorder.StoryEntry$HDRInfo`
- `getHDRType()` -> `int`

## `org.telegram.ui.Stories.recorder.StoryLinkSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTitle()` -> `CharSequence`
- `static isPreviewEmpty(TLRPC.MessageMedia media)` -> `boolean`
- `static isPreviewEmpty(TLRPC.WebPage webpage)` -> `boolean`
- `set(LinkPreview.WebPagePreview settings)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.Stories.recorder.StoryLinkSheet$WebpagePreviewView`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(TLRPC.WebPage webpage, View.OnClickListener onCloseClick, boolean animated)` -> `void`

## `org.telegram.ui.Stories.recorder.StoryLinkSheet$WebpagePreviewView$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `WebpagePreviewView`
- `static item(TLRPC.WebPage webpage, View.OnClickListener onClose)` -> `UItem`

## `org.telegram.ui.Stories.recorder.StoryModeTabs`
- `allowTouch()` -> `boolean`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `invalidate()` -> `void`
- `setInvert(float invert)` -> `void`
- `setOnSwitchModeListener(Utilities.Callback<Integer> onSwitchModeListener)` -> `void`
- `setOnSwitchingModeListener(Utilities.Callback<Float> onSwitchingModeListener)` -> `void`
- `switchMode(int newMode)` -> `void`

## `org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet`
- `allowCover(boolean allowCover)` -> `StoryPrivacyBottomSheet`
- `allowSmallChats(boolean allowSmallChats)` -> `StoryPrivacyBottomSheet`
- `closeKeyboard()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `dismissInternal()` -> `void`
- `enableSharing(boolean enable)` -> `StoryPrivacyBottomSheet`
- `getStoriesController()` -> `StoriesController`
- `isEdit(boolean isEdit)` -> `StoryPrivacyBottomSheet`
- `onBackPressed()` -> `void`
- `set(boolean allowComments, boolean allowScreenshots, boolean keepOnMyPage, int price)` -> `StoryPrivacyBottomSheet`
- `setCanChangePeer(boolean canChangePeer)` -> `StoryPrivacyBottomSheet`
- `setCount(int storiesCount)` -> `StoryPrivacyBottomSheet`
- `setCover(Bitmap cover, Runnable whenClicked)` -> `StoryPrivacyBottomSheet`
- `setCover(Bitmap cover)` -> `StoryPrivacyBottomSheet`
- `setLive(boolean live)` -> `StoryPrivacyBottomSheet`
- `setLiveSettings(boolean liveSettings)` -> `StoryPrivacyBottomSheet`
- `setPeer(TLRPC.InputPeer inputPeer)` -> `StoryPrivacyBottomSheet`
- `setValue(StoryPrivacy privacy)` -> `StoryPrivacyBottomSheet`
- `setWarnUsers(ArrayList<String> users)` -> `StoryPrivacyBottomSheet`
- `whenDismiss(Utilities.Callback<StoryPrivacy> listener)` -> `StoryPrivacyBottomSheet`
- `whenSelectedAlbums(Utilities.Callback<HashSet<Integer>> onSelectedAlbums)` -> `StoryPrivacyBottomSheet`
- `whenSelectedPeer(Utilities.Callback<TLRPC.InputPeer> onSelectedPeer)` -> `StoryPrivacyBottomSheet`
- `whenSelectedRules(DoneCallback onDone, boolean whenDismiss)` -> `StoryPrivacyBottomSheet`

## `org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$ChoosePeerSheet`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`

## `org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$ChoosePeerSheet$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$ContainerView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$HeaderCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setBackImage(int resId)` -> `void`
- `setCloseImageVisible(boolean visible)` -> `void`
- `setOnCloseClickListener(Runnable onCloseClickListener)` -> `void`
- `setText(CharSequence text)` -> `void`

## `org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$HeaderCell2`
- `setText(CharSequence title, CharSequence subtitle)` -> `void`

## `org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$ItemInner`
- `static asButton(int id, CharSequence text, CharSequence text2)` -> `ItemInner`
- `static asButton(int id, CharSequence text, Drawable drawable)` -> `ItemInner`
- `static asChat(TLRPC.Chat chat, boolean checked)` -> `ItemInner`
- `static asCheck(CharSequence text, int id, boolean checked)` -> `ItemInner`
- `static asHeader()` -> `ItemInner`
- `static asHeader2(CharSequence title, CharSequence subtitle)` -> `ItemInner`
- `static asHeader3(CharSequence title)` -> `ItemInner`
- `static asHeaderCell(CharSequence text)` -> `ItemInner`
- `static asNoUsers()` -> `ItemInner`
- `static asPad()` -> `ItemInner`
- `static asPad(int subtractHeight)` -> `ItemInner`
- `static asPadding(int padHeight)` -> `ItemInner`
- `static asSearchField()` -> `ItemInner`
- `static asSection()` -> `ItemInner`
- `asSendAs()` -> `ItemInner`
- `static asShadow(CharSequence text)` -> `ItemInner`
- `static asSlider(int id)` -> `ItemInner`
- `static asType(int type, boolean checked)` -> `ItemInner`
- `static asType(int type, boolean checked, int count)` -> `ItemInner`
- `static asUser(TLRPC.User user, boolean checked, boolean halfChecked)` -> `ItemInner`
- `equals(Object o)` -> `boolean`
- `red(boolean red)` -> `ItemInner`

## `org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$Page`
- `applyBlocklist(boolean notify)` -> `void`
- `atBottom()` -> `boolean`
- `atTop()` -> `boolean`
- `bind(int pageType)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getTypeOn(MotionEvent e)` -> `int`
- `onAttachedToWindow()` -> `void`
- `onClick(View v)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onSearch(String text)` -> `void`
- `scrollToTop()` -> `void`
- `scrollToTopSmoothly()` -> `void`
- `top()` -> `float`
- `updateButton(boolean animated)` -> `void`
- `updateCheckboxes(boolean animated)` -> `void`
- `updateItems(boolean animated)` -> `void`
- `updateItems(boolean animated, boolean notify)` -> `void`
- `updateLastSeen()` -> `void`
- `updateTops()` -> `void`

## `org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$Page$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$Page$ButtonContainer`
- `dispatchDraw(Canvas canvas)` -> `void`
- `hide(boolean hide, boolean animated)` -> `void`
- `setTranslationY(float translationY)` -> `void`
- `translateY(float from, float to)` -> `void`

## `org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$SearchUsersCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchKeyEvent(KeyEvent event)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `scrollToBottom()` -> `void`
- `setContainerHeight(float value)` -> `void`
- `setOnSearchTextChange(Utilities.Callback<String> listener)` -> `void`
- `setText(CharSequence text)` -> `void`

## `org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$SearchUsersCell$SpansContainer`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `updateSpans(ArrayList<GroupCreateSpan> toDelete, ArrayList<GroupCreateSpan> toAdd, boolean animated)` -> `void`

## `org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$StoryPrivacy`
- `containsUser(TLRPC.User user)` -> `boolean`
- `static toInput(int currentAccount, ArrayList<TLRPC.PrivacyRule> rules)` -> `ArrayList<TLRPC.InputPrivacyRule>`
- `static toOutput(ArrayList<TLRPC.InputPrivacyRule> rules)` -> `ArrayList<TLRPC.PrivacyRule>`
- `toString()` -> `String`
- `toValue()` -> `ArrayList<TLRPC.PrivacyRule>`

## `org.telegram.ui.Stories.recorder.StoryPrivacySelector`
- `static applySaved(int currentAccount, StoryEntry entry)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getStoryPrivacy()` -> `StoryPrivacyBottomSheet.StoryPrivacy`
- `isEdited()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onPopupClose()` -> `void`
- `onPopupOpen(Runnable after)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `open()` -> `void`
- `set(StoryEntry entry, boolean animated)` -> `void`
- `setStoryPeriod(int period)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Stories.recorder.StoryPrivacySelector$StoryPrivacyHint`
- `draw(Canvas canvas)` -> `void`
- `hide()` -> `void`
- `static neverShow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `show(boolean force)` -> `void`

## `org.telegram.ui.Stories.recorder.StoryRecorder`
- `static cameraBtnSpan(Context context)` -> `CharSequence`
- `close(boolean animated)` -> `void`
- `closeToWhenSent(ClosingViewProvider closingSourceProvider)` -> `StoryRecorder`
- `createCropEditor()` -> `void`
- `createCropInlineEditor()` -> `void`
- `static destroyInstance()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getContext()` -> `Context`
- `static getInstance(Activity activity, int currentAccount)` -> `StoryRecorder`
- `getThanosEffect()` -> `ThanosEffect`
- `getThemeButton()` -> `ImageView`
- `invalidateBlur()` -> `void`
- `navigateTo(int page, boolean animated)` -> `void`
- `navigateToPreviewWithPlayerAwait(Runnable open, long seekTo)` -> `void`
- `navigateToPreviewWithPlayerAwait(Runnable open, long seekTo, long ms)` -> `void`
- `onBackPressed()` -> `boolean`
- `static onPause()` -> `void`
- `static onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `static onResume()` -> `void`
- `open(SourceView sourceView)` -> `void`
- `open(SourceView sourceView, boolean animated)` -> `void`
- `openBot(long botId, String lang_code, SourceView sourceView)` -> `void`
- `openBotEntry(long botId, String lang_code, StoryEntry entry, SourceView sourceView)` -> `void`
- `openEdit(SourceView sourceView, StoryEntry entry, long time, boolean animated)` -> `void`
- `openForward(SourceView sourceView, StoryEntry entry, long time, boolean animated)` -> `void`
- `openRepost(SourceView sourceView, StoryEntry entry)` -> `void`
- `replaceSourceView(SourceView sourceView)` -> `void`
- `selectedPeerId(long dialogId)` -> `StoryRecorder`
- `setActionBarButtonVisible(View view, boolean visible, boolean animated)` -> `void`
- `setIconMuted(boolean muted, boolean animated)` -> `void`
- `setMode(int mode)` -> `StoryRecorder`
- `setOnCloseListener(Runnable listener)` -> `void`
- `setOnFullyOpenListener(Runnable listener)` -> `void`
- `setOnPrepareCloseListener(Utilities.Callback4<Long, Runnable, Boolean, Long> listener)` -> `void`
- `switchToEditMode(int editMode, boolean animated)` -> `void`
- `switchToEditMode(int editMode, boolean force, boolean animated)` -> `void`
- `toggleTheme()` -> `void`
- `updateThemeButtonDrawable(boolean animated)` -> `void`
- `whenSent(Runnable listener)` -> `StoryRecorder`

## `org.telegram.ui.Stories.recorder.StoryRecorder$ContainerView`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getTranslationY1()` -> `float`
- `getTranslationY2()` -> `float`
- `invalidate()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setTranslationY(float translationY)` -> `void`
- `setTranslationY2(float translationY2)` -> `void`
- `updateBackground()` -> `void`

## `org.telegram.ui.Stories.recorder.StoryRecorder$SourceView`
- `drawAbove(Canvas canvas, float alpha)` -> `void`
- `static fromAvatarImage(ProfileActivity.AvatarImageView avatarImage, boolean isForum)` -> `SourceView`
- `static fromFloatingButton(FrameLayout floatingButton)` -> `SourceView`
- `static fromShareCell(ShareDialogCell shareDialogCell)` -> `SourceView`
- `static fromStoryCell(DialogStoriesCell.StoryCell storyCell)` -> `SourceView`
- `static fromStoryViewer(StoryViewer storyViewer)` -> `SourceView`
- `hide()` -> `void`
- `show(boolean sent)` -> `void`

## `org.telegram.ui.Stories.recorder.StoryRecorder$WindowView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchKeyEventPreIme(KeyEvent event)` -> `boolean`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawBlurBitmap(Bitmap bitmap, float amount)` -> `void`
- `getBottomPadding()` -> `int`
- `getBottomPadding2()` -> `int`
- `getPaddingUnderContainer()` -> `int`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Stories.recorder.StoryRecorder$WindowView$GestureListener`
- `onDoubleTap(MotionEvent e)` -> `boolean`
- `onDoubleTapEvent(MotionEvent e)` -> `boolean`
- `onDown(@NonNull MotionEvent e)` -> `boolean`
- `onFling(@NonNull MotionEvent e1, @NonNull MotionEvent e2, float velocityX, float velocityY)` -> `boolean`
- `onLongPress(@NonNull MotionEvent e)` -> `void`
- `onScroll(@NonNull MotionEvent e1, @NonNull MotionEvent e2, float distanceX, float distanceY)` -> `boolean`
- `onShowPress(@NonNull MotionEvent e)` -> `void`
- `onSingleTapConfirmed(MotionEvent e)` -> `boolean`
- `onSingleTapUp(@NonNull MotionEvent e)` -> `boolean`

## `org.telegram.ui.Stories.recorder.StoryRecorder$WindowView$ScaleListener`
- `onScale(ScaleGestureDetector detector)` -> `boolean`
- `onScaleBegin(@NonNull ScaleGestureDetector detector)` -> `boolean`
- `onScaleEnd(@NonNull ScaleGestureDetector detector)` -> `void`

## `org.telegram.ui.Stories.recorder.StoryUploadingService`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onBind(Intent intent)` -> `IBinder`
- `onDestroy()` -> `void`
- `onStartCommand(Intent intent, int flags, int startId)` -> `int`

## `org.telegram.ui.Stories.recorder.TimelineView`
- `computeScroll()` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getContentHeight()` -> `int`
- `getMaxCount()` -> `int`
- `getMaxScrollDuration()` -> `long`
- `getTimelineHeight()` -> `int`
- `static heightDp()` -> `int`
- `isDragging()` -> `boolean`
- `normalizeScrollByVideo()` -> `void`
- `onBackPressed()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `selectRound(boolean select)` -> `void`
- `setAudio(String audioPath, String audioAuthorText, String audioTitleText, long duration, long offset, float left, float right, float volume, boolean animated)` -> `void`
- `setCollage(ArrayList<StoryEntry> entries)` -> `void`
- `setCover()` -> `void`
- `setCoverVideo(long videoStart, long videoEnd)` -> `void`
- `setDelegate(TimelineDelegate delegate)` -> `void`
- `setMaxCount(int maxCount)` -> `void`
- `setOnHeightChange(Runnable listener)` -> `void`
- `setOnTimelineClick(Runnable click)` -> `void`
- `setOpen(boolean open, boolean animated)` -> `void`
- `setProgress(long progress)` -> `void`
- `setRound(String roundPath, long roundDuration, long offset, float left, float right, float volume, boolean animated)` -> `void`
- `setRoundNull(boolean animated)` -> `void`
- `setVideo(boolean isRound, String videoPath, long videoDuration, float videoVolume)` -> `void`
- `setVideoLeft(float left)` -> `void`
- `setVideoRight(float right)` -> `void`
- `sortCollage()` -> `void`

## `org.telegram.ui.Stories.recorder.TimelineView$TimelineDelegate`
- `onAudioLeftChange(float left)` -> `default void`
- `onAudioOffsetChange(long offset)` -> `default void`
- `onAudioRemove()` -> `default void`
- `onAudioRightChange(float right)` -> `default void`
- `onAudioVolumeChange(float volume)` -> `default void`
- `onProgressChange(long progress, boolean fast)` -> `default void`
- `onProgressDragChange(boolean dragging)` -> `default void`
- `onRoundLeftChange(float left)` -> `default void`
- `onRoundOffsetChange(long offset)` -> `default void`
- `onRoundRemove()` -> `default void`
- `onRoundRightChange(float right)` -> `default void`
- `onRoundSelectChange(boolean selected)` -> `default void`
- `onRoundVolumeChange(float volume)` -> `default void`
- `onVideoLeftChange(boolean released, float left)` -> `default void`
- `onVideoLeftChange(int i, float left)` -> `default void`
- `onVideoOffsetChange(int i, long offset)` -> `default void`
- `onVideoRightChange(boolean released, float right)` -> `default void`
- `onVideoRightChange(int i, float right)` -> `default void`
- `onVideoSelected(int i)` -> `default void`
- `onVideoVolumeChange(float volume)` -> `default void`
- `onVideoVolumeChange(int i, float volume)` -> `default void`

## `org.telegram.ui.Stories.recorder.TimelineView$VideoThumbsLoader`
- `destroy()` -> `void`
- `getCount()` -> `int`
- `getDuration()` -> `long`
- `getFrameAt(int index)` -> `BitmapFrame`
- `getFrameWidth()` -> `int`
- `getLoadedCount()` -> `int`
- `load()` -> `void`

## `org.telegram.ui.Stories.recorder.TimelineView$VideoThumbsLoader$BitmapFrame`
- `getAlpha()` -> `float`

## `org.telegram.ui.Stories.recorder.TimelineView$WaveformPath`
- `static getMaxBar(ArrayList<AudioWaveformLoader> waveforms)` -> `int`
- `static getMaxLoadedCount(ArrayList<AudioWaveformLoader> waveforms)` -> `int`

## `org.telegram.ui.Stories.recorder.ToggleButton`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `setInvert(float invert)` -> `void`
- `setValue(boolean value)` -> `void`

## `org.telegram.ui.Stories.recorder.ToggleButton2`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setDrawable(int iconRes)` -> `void`
- `setDrawable(Drawable drawable)` -> `void`
- `setIcon(int iconRes, boolean animated)` -> `void`
- `setIcon(Drawable iconDrawable, boolean animated)` -> `void`
- `setInvert(float invert)` -> `void`
- `setSelected(boolean selected)` -> `void`
- `setSelected(boolean selected, boolean animated)` -> `void`

## `org.telegram.ui.Stories.recorder.TrashView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onDragInfo(boolean dragged, boolean deleted)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Stories.recorder.VideoTimeView`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setTime(long time, boolean animated)` -> `void`
- `show(boolean show, boolean animated)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Stories.recorder.VideoTimerView`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setDuration(long duration, boolean animated)` -> `void`
- `setInvert(float invert)` -> `void`
- `setRecording(boolean value, boolean animated)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Stories.recorder.Weather`
- `static getCached()` -> `State`

## `org.telegram.ui.Stories.recorder.Weather$State`
- `static TLdeserialize(AbstractSerializedData stream)` -> `Weather.State`
- `getEmoji()` -> `String`
- `getTemperature()` -> `String`
- `getTemperature(boolean celsius)` -> `String`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.ui.StoryCellFactory`
- `static asStory(int tab, MessageObject story, int parentColumns, boolean checkable)` -> `UItem`
- `attachedView(RecyclerListView listView, View view, UItem item)` -> `void`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `SharedPhotoVideoCell2`
- `equals(UItem a, UItem b)` -> `boolean`

## `org.telegram.ui.Wallet.WalletCardFrameHistory`
- `clear()` -> `void`
- `record(long timestamp, long revision)` -> `void`
- `revisionAt(long timestamp)` -> `long`

## `org.telegram.ui.iv.RichEditorHistory`
- `flush()` -> `void`
- `onBeforeChange(int removed, int added)` -> `void`
- `onTyping()` -> `void`
- `record()` -> `void`
- `redo()` -> `void`
- `resetBaseline()` -> `void`
- `undo()` -> `void`

## `org.telegram.ui.web.BrowserHistory`
- `static clearHistory()` -> `void`
- `static getHistory()` -> `ArrayList<BrowserHistory.Entry>`
- `static getHistory(Utilities.Callback<ArrayList<BrowserHistory.Entry>> loaded)` -> `ArrayList<BrowserHistory.Entry>`
- `static getHistoryFile()` -> `File`
- `static preloadHistory()` -> `void`
- `static pushHistory(BrowserHistory.Entry entry)` -> `void`

## `org.telegram.ui.web.BrowserHistory$Entry`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.ui.web.HistoryFragment`
- `clickSelect(UItem item, View view)` -> `void`
- `createView(Context context)` -> `View`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTitle()` -> `CharSequence`
- `static matches(String src, String q)` -> `boolean`
- `onClick(UItem item, View view, int position, float x, float y)` -> `void`
- `onLongClick(UItem item, View view, int position, float x, float y)` -> `boolean`
- `setSelected(MessageObject msg, boolean select)` -> `void`
