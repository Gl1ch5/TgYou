# visual / profile (615 методов)

## `org.telegram.tgnet.tl.TL_keyboard$TL_inlineButtonTypeUserProfile`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inputInlineButtonTypeUserProfile`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inputKeyboardButtonUserProfile_layer223`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inputKeyboardButtonUserProfile_layer228`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonUserProfile_layer223`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonUserProfile_layer228`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.ui.Business.ProfileHoursCell`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `set(TL_account.TL_businessWorkHours value, boolean expanded, boolean showInMyTimezone, boolean divider)` -> `void`
- `setOnTimezoneSwitchClick(View.OnClickListener onClickListener)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Business.ProfileHoursCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `contentsEquals(UItem a, UItem b)` -> `boolean`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `ProfileHoursCell`
- `equals(UItem a, UItem b)` -> `boolean`
- `static of(int id, TL_account.TL_businessWorkHours value, boolean expanded, boolean showInMyTimezone, View.OnClickListener onTimezoneClick)` -> `UItem`

## `org.telegram.ui.Business.ProfileLocationCell`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `static openLocation(Activity activity, TLRPC.TL_businessLocation location)` -> `void`
- `set(TLRPC.TL_businessLocation value, boolean divider)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Business.ProfileLocationCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `ProfileLocationCell`
- `static of(int id, TLRPC.TL_businessLocation value)` -> `UItem`

## `org.telegram.ui.CacheControlActivity$UserCell`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getImageView()` -> `BackupImageView`
- `getTextView()` -> `TextView`
- `getValueTextView()` -> `AnimatedTextView`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setCanDisable(boolean value)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setEnabled(boolean value, ArrayList<Animator> animators)` -> `void`
- `setEnabled(boolean value)` -> `void`
- `setText(CharSequence text, boolean divider)` -> `void`
- `setTextAndValue(CharSequence text, CharSequence value, boolean divider)` -> `void`
- `setTextAndValue(CharSequence text, CharSequence value, boolean animated, boolean divider)` -> `void`
- `setTextColor(int color)` -> `void`
- `setTextValueColor(int color)` -> `void`

## `org.telegram.ui.Cells.CheckBoxUserCell`
- `getCheckBox()` -> `Switch`
- `getCurrentUser()` -> `TLRPC.User`
- `getTextView()` -> `SimpleTextView`
- `isChecked()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setTextColor(int color)` -> `void`
- `setUser(TLRPC.User user, boolean checked, boolean divider)` -> `void`

## `org.telegram.ui.Cells.GroupCreateUserCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getCheckBox()` -> `CheckBox2`
- `getObject()` -> `Object`
- `getStatusTextView()` -> `SimpleTextView`
- `isBlocked()` -> `boolean`
- `isChecked()` -> `boolean`
- `static makeMiniAppsDrawable(Context context, boolean small)` -> `Drawable`
- `static makePremiumUsersDrawable(Context context, boolean small)` -> `Drawable`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `overridePremiumBlocked(TL_account.RequirementToContact blocked, boolean animated)` -> `void`
- `recycle()` -> `void`
- `setCheckBoxEnabled(boolean enabled)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setDrawDivider(boolean value)` -> `void`
- `setForbiddenCheck(boolean forbidden)` -> `void`
- `setMiniapps()` -> `void`
- `setObject(TLObject object, CharSequence name, CharSequence status, boolean drawDivider)` -> `void`
- `setObject(Object object, CharSequence name, CharSequence status)` -> `void`
- `setPremium()` -> `void`
- `showPremiumBlocked()` -> `GroupCreateUserCell`
- `update(int mask)` -> `void`

## `org.telegram.ui.Cells.InviteUserCell`
- `getContact()` -> `ContactsController.Contact`
- `recycle()` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setUser(ContactsController.Contact contact, CharSequence name)` -> `void`
- `update(int mask)` -> `void`

## `org.telegram.ui.Cells.JoinSheetUserCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setCount(int count)` -> `void`
- `setUser(TLRPC.User user)` -> `void`

## `org.telegram.ui.Cells.ManageChatUserCell`
- `getAvatarImageView()` -> `BackupImageView`
- `getCurrentObject()` -> `Object`
- `getStoryAvatarParams()` -> `StoriesUtilities.AvatarStoryParams`
- `getStoryItem()` -> `TL_stories.StoryItem`
- `getUserId()` -> `long`
- `hasOverlappingRendering()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `recycle()` -> `void`
- `setCustomImageVisible(boolean visible)` -> `void`
- `setCustomRightImage(int resId)` -> `void`
- `setData(Object object, CharSequence name, CharSequence status, boolean divider)` -> `void`
- `setDelegate(ManageChatUserCellDelegate manageChatUserCellDelegate)` -> `void`
- `setDividerColor(int key)` -> `void`
- `setIsAdmin(boolean value)` -> `void`
- `setNameColor(int color)` -> `void`
- `setStatusColors(int color, int onlineColor)` -> `void`
- `setStoryItem(TL_stories.StoryItem storyItem, OnClickListener listener)` -> `void`
- `setUsernameSubtitle()` -> `void`
- `update(int mask)` -> `void`

## `org.telegram.ui.Cells.ProfileChannelCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(TLRPC.Chat channel, ArrayList<MessageObject> messageObjects)` -> `void`
- `updateColors()` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Cells.ProfileChannelCell$ChannelMessageFetcher`
- `subscribe(Runnable callback)` -> `void`

## `org.telegram.ui.Cells.ProfileSearchCell`
- `allowBotOpenButton(boolean allow, Utilities.Callback<TLRPC.User> onOpenClick)` -> `ProfileSearchCell`
- `buildLayout()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getChat()` -> `TLRPC.Chat`
- `getDialogId()` -> `long`
- `getUser()` -> `TLRPC.User`
- `isBlocked()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setAd(TLRPC.TL_sponsoredPeer sponsoredPeer)` -> `void`
- `setAllowEmojiStatus(boolean allowEmojiStatus)` -> `void`
- `setCallCellStyle()` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setData(Object object, TLRPC.EncryptedChat ec, CharSequence n, CharSequence s, boolean needCount, boolean saved)` -> `void`
- `setException(NotificationsSettingsActivity.NotificationException exception, CharSequence name)` -> `void`
- `setOnSponsoredOptionsClick(Utilities.Callback2<ProfileSearchCell, TLRPC.TL_sponsoredPeer> onOptionsClick)` -> `void`
- `setOpenBotButton(boolean show)` -> `void`
- `setRectangularAvatar(boolean value)` -> `void`
- `setSubLabel(CharSequence subLabel)` -> `void`
- `setSublabelOffset(int x, int y)` -> `void`
- `showPremiumBlock(boolean show)` -> `ProfileSearchCell`
- `update(int mask)` -> `void`
- `updateColors()` -> `void`
- `updateStatus(boolean verified, TLRPC.User user, TLRPC.Chat chat, boolean animated)` -> `void`
- `useCustomPaints()` -> `ProfileSearchCell`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Cells.UserCell`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getCurrentObject()` -> `Object`
- `getDialogId()` -> `long`
- `getName()` -> `CharSequence`
- `hasOverlappingRendering()` -> `boolean`
- `invalidate()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `openStory(long dialogId, Runnable runnable)` -> `void`
- `setAddButtonVisible(boolean value)` -> `void`
- `setAdminRole(String role, boolean isAdmin, boolean isOwner, boolean canAddTag, View.OnClickListener onClick)` -> `void`
- `setAvatarPadding(int padding)` -> `void`
- `setAvatarPadding(int padding, int paddingText)` -> `void`
- `setCallCellStyle(int padding)` -> `void`
- `setCheckDisabled(boolean disabled)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setCloseIcon(View.OnClickListener onClick)` -> `void`
- `setCurrentId(int id)` -> `void`
- `setData(Object object, CharSequence name, CharSequence status, int resId)` -> `void`
- `setData(Object object, CharSequence name, CharSequence status, int resId, boolean divider)` -> `void`
- `setData(Object object, TLRPC.EncryptedChat ec, CharSequence name, CharSequence status, int resId, boolean divider)` -> `void`
- `setException(NotificationsSettingsActivity.NotificationException exception, CharSequence name, boolean divider)` -> `void`
- `setFromUItem(int currentAccount, UItem item, boolean divider)` -> `void`
- `setNameTypeface(Typeface typeface)` -> `void`
- `setQuery(String query)` -> `void`
- `setRightPadding(int pad, boolean top, boolean bottom)` -> `void`
- `setSelfAsSavedMessages(boolean value)` -> `void`
- `setStatusColors(int color, int onlineColor)` -> `void`
- `update(int mask)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Cells.UserCell2`
- `invalidate()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setCheckDisabled(boolean disabled)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setCurrentId(int id)` -> `void`
- `setData(TLObject object, CharSequence name, CharSequence status, int resId)` -> `void`
- `setNameTypeface(Typeface typeface)` -> `void`
- `setStatusColors(int color, int onlineColor)` -> `void`
- `update(int mask)` -> `void`

## `org.telegram.ui.ChannelColorActivity$ProfilePreview`
- `setColor(int colorId, boolean animated)` -> `void`
- `setColor(MessagesController.PeerColor peerColor, boolean animated)` -> `void`
- `setEmoji(long emojiId, boolean isCollectible, boolean animated)` -> `void`
- `setEmojiStatus(TLRPC.EmojiStatus emojiStatus, boolean animated)` -> `void`
- `setTitleSize()` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.InviteLinkBottomSheet$RevenueUserCell`
- `setRevenue(TL_stars.TL_starsSubscriptionPricing pricing, int joined_date)` -> `void`

## `org.telegram.ui.Components.PollVotesAlert$UserCell`
- `getPlaceholderAlpha()` -> `float`
- `hasOverlappingRendering()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setData(TLObject object, int date, int num, boolean divider)` -> `void`
- `setPlaceholderAlpha(float value)` -> `void`
- `update(int mask)` -> `void`

## `org.telegram.ui.Components.Premium.ProfilePremiumCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell`
- `static buildCountDownTime(long diff)` -> `String`
- `getBoost()` -> `TL_stories.TL_myBoost`
- `getChat()` -> `TLRPC.Chat`
- `getUser()` -> `TLRPC.User`
- `needCheck()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setBoost(TL_stories.TL_myBoost boost)` -> `void`
- `setCallButtons(View.OnClickListener audio, View.OnClickListener video)` -> `void`
- `setCallButtonsVisible(boolean visible, boolean animated)` -> `void`
- `setChat(TLRPC.Chat chat, int participants_count)` -> `void`
- `setCheckboxAlpha(float alpha, boolean animated)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setCustomUser(Drawable icon, CharSequence title, CharSequence subtitle)` -> `void`
- `setOptions(View.OnClickListener listener)` -> `void`
- `setUser(TLRPC.User user)` -> `void`
- `updateTimer()` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `SelectorUserCell`
- `static make(TLRPC.User user)` -> `UItem`

## `org.telegram.ui.Components.ProfileActionsView`
- `beginApplyingActions()` -> `void`
- `commitActions()` -> `void`
- `drawingBlur(boolean drawing)` -> `void`
- `drawingBlur(RenderNode renderNode, ProfileActivity.AvatarImageView avatarView, float scale, float dy)` -> `void`
- `getAccessibilityNodeProvider()` -> `AccessibilityNodeProvider`
- `getRoundRadius()` -> `float`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `set(int key, boolean enabled)` -> `void`
- `setActionsColor(int color, boolean hasColorById)` -> `void`
- `setNotifications(boolean enabled)` -> `void`
- `setOnActionClickListener(OnActionClickListener onActionClickListener)` -> `void`
- `setParentExpanded(float expanded)` -> `void`
- `startAnimatedActions()` -> `void`
- `startCameraAnimation()` -> `void`
- `stopLoading(int key)` -> `void`
- `supportsEditInfo()` -> `boolean`
- `updatePosition(float y, float newHeight)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Components.ProfileActionsView$Action`
- `getAlpha()` -> `float`
- `getScale()` -> `float`
- `setBounds(int l, int t, int r, int b)` -> `void`
- `setText(CharSequence cs)` -> `void`
- `update(boolean animated, int drawableRes, int textRes)` -> `void`
- `update(ActionButton button)` -> `void`
- `updateDrawable(boolean animated, int drawableRes)` -> `void`
- `updateDrawable(@RawRes int animatedRes, @DrawableRes int filledRes, @DrawableRes int outlineRes)` -> `void`
- `updatePosition()` -> `void`

## `org.telegram.ui.Components.ProfileGooeyView`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getAvatarEndScale()` -> `float`
- `getEndOffset(boolean occupyStatusBar, float avatarScale)` -> `float`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `setBlurIntensity(float intensity)` -> `void`
- `setGooeyEnabled(boolean enabled)` -> `void`
- `setIntensity(float intensity)` -> `void`
- `setPullProgress(float pullProgress)` -> `void`

## `org.telegram.ui.Components.ProfileGooeyView$CPUImpl`
- `draw(Drawer drawer, Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h)` -> `void`

## `org.telegram.ui.Components.ProfileGooeyView$GPUImpl`
- `draw(Drawer drawer, @NonNull Canvas canvas)` -> `void`
- `setBlurIntensity(float blurIntensity)` -> `void`
- `setIntensity(float intensity)` -> `void`

## `org.telegram.ui.Components.ProfileGooeyView$Impl`
- `onSizeChanged(int w, int h)` -> `default void`
- `setBlurIntensity(float intensity)` -> `default void`
- `setIntensity(float intensity)` -> `default void`

## `org.telegram.ui.Components.ProfileMetaballView`
- `captureBackward()` -> `void`
- `destroy()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `setFrameBackgroundColor(int color)` -> `void`
- `setVisibility(int visibility)` -> `void`
- `updateBackward(float fraction)` -> `void`

## `org.telegram.ui.Components.ProfileMetaballView$BlurBitmapHolder`
- `clear()` -> `void`
- `lock()` -> `void`
- `recycle()` -> `void`
- `unlock()` -> `void`

## `org.telegram.ui.Components.ProfileMusicView`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `drawingBlur(boolean drawing)` -> `void`
- `drawingBlur(RenderNode renderNode, ProfileActivity.AvatarImageView avatarView, float scale, float dy)` -> `void`
- `static getAuthor(TLRPC.Document document)` -> `CharSequence`
- `static getTitle(TLRPC.Document document)` -> `CharSequence`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setColor(MessagesController.PeerColor peerColor)` -> `void`
- `setMusicDocument(TLRPC.Document document)` -> `void`
- `setParentExpanded(float expanded)` -> `void`
- `setText(CharSequence author, CharSequence title)` -> `void`
- `updatePosition(float y, float newHeight)` -> `void`

## `org.telegram.ui.Components.ProfileSuggestionView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawingBlur(boolean drawing)` -> `void`
- `drawingBlur(RenderNode renderNode, ProfileActivity.AvatarImageView avatarView, float scale, float dy)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `updatePosition(float y, float newHeight)` -> `void`

## `org.telegram.ui.MessageSeenView$UserCell`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setUser(TLObject object, int date)` -> `void`
- `setUser(TLObject object, int date, boolean isVote)` -> `void`

## `org.telegram.ui.PeerColorActivity$ProfilePreview`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `overrideAvatarColor(int colorId)` -> `void`
- `setColor(int colorId, boolean animated)` -> `void`
- `setColor(MessagesController.PeerColor peerColor, boolean animated)` -> `void`
- `setEmoji(long docId, boolean isCollectible, boolean animated)` -> `void`
- `setForum(boolean forum)` -> `void`
- `setStatusEmoji(long docId, boolean isCollectible, boolean animated)` -> `void`

## `org.telegram.ui.ProfileActivity`
- `calculatePositionsOnFirstLoad()` -> `void`
- `clearViews()` -> `void`
- `createActionBar(Context context)` -> `ActionBar`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, final Object... args)` -> `void`
- `didSelectDialogs(DialogsActivity fragment, ArrayList<MessagesStorage.TopicKey> dids, CharSequence message, boolean param, boolean notify, int scheduleDate, int scheduleRepeatPeriod, TopicsFragment topicsFragment)` -> `boolean`
- `didStartUpload(boolean fromAvatarConstructor, boolean isVideo)` -> `void`
- `didUploadPhoto(final TLRPC.InputFile photo, final TLRPC.InputFile video, double videoStartTimestamp, String videoPath, TLRPC.PhotoSize bigSize, final TLRPC.PhotoSize smallSize, boolean isVideo, TLRPC.VideoSize emojiMarkup)` -> `void`
- `dismissCurrentDialog()` -> `void`
- `dismissDialogOnPause(Dialog dialog)` -> `boolean`
- `drawEdgeNavigationBar()` -> `boolean`
- `getAvatarAnimationProgress()` -> `float`
- `getChatInfo()` -> `TLRPC.ChatFull`
- `getCurrentChat()` -> `TLRPC.Chat`
- `getDialogId()` -> `long`
- `getEmojiStatusLocation(Rect rect)` -> `void`
- `getGlassSource()` -> `BlurredBackgroundSourceRenderNode`
- `getInternalTranslationX()` -> `float`
- `getInternalVisibility()` -> `float`
- `getLink(String username, int topicId)` -> `String`
- `getListView()` -> `RecyclerListView`
- `getResourceProvider()` -> `Theme.ResourcesProvider`
- `getShowStatusButton()` -> `ShowDrawable`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `getThemedColor(int key)` -> `int`
- `getThemedDrawable(String drawableKey)` -> `Drawable`
- `getTopicId()` -> `long`
- `getUndoView()` -> `UndoView`
- `getUserInfo()` -> `TLRPC.UserFull`
- `goToForum()` -> `void`
- `isActionBarCrossfadeEnabled()` -> `boolean`
- `isChat()` -> `boolean`
- `isFragmentOpened()` -> `boolean`
- `isLightStatusBar()` -> `boolean`
- `isPeerNoForwards()` -> `boolean`
- `isSettings()` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `mediaCountUpdated()` -> `void`
- `needDelayOpenAnimation()` -> `boolean`
- `static of(long dialogId)` -> `ProfileActivity`
- `onActivityResultFragment(int requestCode, int resultCode, Intent data)` -> `void`
- `onBackPressed()` -> `boolean`
- `onBecomeFullyHidden()` -> `void`
- `onBecomeFullyVisible()` -> `void`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onCustomTransitionAnimation(final boolean isOpen, final Runnable callback)` -> `AnimatorSet`
- `onDialogDismiss(Dialog dialog)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onMemberClick(TLRPC.ChatParticipant participant, boolean isLong, View view)` -> `boolean`
- `onMemberClick(TLRPC.ChatParticipant participant, boolean isLong, boolean resultOnly)` -> `boolean`
- `onMemberClick(TLRPC.ChatParticipant participant, boolean isLong, boolean resultOnly, View view)` -> `boolean`
- `onParentScrollToTop()` -> `void`
- `onPause()` -> `void`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `onTransitionAnimationProgress(boolean isOpen, float progress)` -> `void`
- `onTransitionAnimationStart(boolean isOpen, boolean backward)` -> `void`
- `onUploadProgressChanged(float progress)` -> `void`
- `prepareBlurBitmap()` -> `void`
- `restoreSelfArgs(Bundle args)` -> `void`
- `scrollToSharedMedia()` -> `void`
- `scrollToSharedMedia(boolean animated)` -> `void`
- `setAvatarAnimationProgress(float progress)` -> `void`
- `setChatInfo(TLRPC.ChatFull value)` -> `void`
- `setCollectibleGiftStatus(TLRPC.TL_emojiStatusCollectible status)` -> `void`
- `setLoadingSpan(CharacterStyle span)` -> `void`
- `setParentLayout(INavigationLayout layout)` -> `void`
- `setPlayProfileAnimation(int type)` -> `void`
- `showStatusSelect()` -> `void`
- `startTabsReorder()` -> `void`
- `updateCollectibleHint()` -> `void`
- `updateListAnimated(boolean updateOnlineCount)` -> `void`
- `updateSelectedMediaTabText()` -> `void`

## `org.telegram.ui.ProfileActivity$AvatarImageView`
- `clearForeground()` -> `void`
- `createBlurEffect(int actionsSize)` -> `void`
- `drawForeground(boolean drawForeground)` -> `void`
- `getForegroundAlpha()` -> `float`
- `getPrevFragment()` -> `ChatActivityInterface`
- `getRoundRadiusForExpand()` -> `int`
- `invalidate()` -> `void`
- `invalidate(Rect dirty)` -> `void`
- `invalidate(int l, int t, int r, int b)` -> `void`
- `listenInvalidate(Runnable callback)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `setAnimateFromImageReceiver(ImageReceiver imageReceiver)` -> `void`
- `setAvatarsViewPager(ProfileGalleryView avatarsViewPager)` -> `void`
- `setBlurRadiusProgressForExpand(float value, float avatarScale, boolean isPulledDown)` -> `void`
- `setCrossfadeProgress(float crossfadeProgress)` -> `void`
- `setForegroundAlpha(float value)` -> `void`
- `setForegroundImage(ImageLocation imageLocation, String imageFilter, Drawable thumb)` -> `void`
- `setForegroundImageDrawable(ImageReceiver.BitmapHolder holder)` -> `void`
- `setHasStories(boolean hasStories)` -> `void`
- `setProgressToExpand(float animatedFracture)` -> `void`
- `setProgressToStoriesInsets(float progressToInsets)` -> `void`
- `setRoundRadius(int value)` -> `void`
- `setRoundRadiusCollapse(int roundRadiusCollapse)` -> `void`
- `setRoundRadiusForExpand(int value)` -> `void`

## `org.telegram.ui.ProfileActivity$ClippedListView`
- `updateClip(int[] clip)` -> `void`

## `org.telegram.ui.ProfileActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `makeUsernameLinkSpan(TLRPC.TL_username usernameObj)` -> `ClickableSpan`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(RecyclerView.ViewHolder holder)` -> `void`
- `onViewDetachedFromWindow(RecyclerView.ViewHolder holder)` -> `void`
- `onViewRecycled(@NonNull RecyclerView.ViewHolder holder)` -> `void`
- `setBackground(View view, int viewType)` -> `void`

## `org.telegram.ui.ProfileActivity$NestedFrameLayout`
- `drawList(Canvas blurCanvas, boolean top, ArrayList<IViewWithInvalidateCallback> views)` -> `void`
- `onNestedPreFling(View target, float velocityX, float velocityY)` -> `boolean`
- `onNestedPreScroll(View target, int dx, int dy, int[] consumed, int type)` -> `void`
- `onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed)` -> `void`
- `onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type)` -> `void`
- `onNestedScrollAccepted(View child, View target, int axes, int type)` -> `void`
- `onStartNestedScroll(View child, View target, int axes, int type)` -> `boolean`
- `onStopNestedScroll(View target, int type)` -> `void`
- `onStopNestedScroll(View child)` -> `void`

## `org.telegram.ui.ProfileActivity$OverlaysView`
- `isOverlaysVisible()` -> `boolean`
- `onDown(boolean left)` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onPhotosLoaded()` -> `void`
- `onRelease()` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `onVideoSet()` -> `void`
- `setAlphaValue(float value, boolean self)` -> `void`
- `setOverlaysVisible()` -> `void`
- `setOverlaysVisible(boolean overlaysVisible, float durationFactor)` -> `void`

## `org.telegram.ui.ProfileActivity$PagerIndicatorView`
- `isIndicatorFullyVisible()` -> `boolean`
- `isIndicatorVisible()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `refreshVisibility(float durationFactor)` -> `void`
- `setIndicatorVisible(boolean indicatorVisible, float durationFactor)` -> `void`

## `org.telegram.ui.ProfileActivity$SearchAdapter`
- `clearRecent()` -> `void`
- `fillItems(ArrayList<UItem> items)` -> `void`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `isSearchWas()` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `search(String text)` -> `void`

## `org.telegram.ui.ProfileActivity$SearchAdapter$SearchResult`
- `equals(Object obj)` -> `boolean`
- `open(INavigationLayout parentLayout)` -> `void`
- `toString()` -> `String`
- `withLink(String link)` -> `SearchResult`

## `org.telegram.ui.ProfileActivity$ShowDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getAlpha()` -> `int`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `isPressed()` -> `boolean`
- `setAlpha(int alpha)` -> `void`
- `setAlpha2(float alpha)` -> `void`
- `setBackgroundColor(int backgroundColor)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `setTextColor(int textColor)` -> `void`
- `setView(View view)` -> `void`

## `org.telegram.ui.ProfileActivity$TextView2`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.ProfileActivity$TopView`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `setBackgroundColor(int color)` -> `void`
- `setBackgroundColorId(MessagesController.PeerColor peerColor, boolean animated)` -> `void`
- `setBackgroundEmojiId(long emojiId, boolean isCollectible, boolean animated)` -> `void`

## `org.telegram.ui.ProfileActivity2`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `drawBackground(Canvas canvas)` -> `void`
- `drawBackgroundRect(Canvas canvas, RectF rect, float r, float alpha)` -> `void`
- `drawEdgeNavigationBar()` -> `boolean`
- `getCurrentChat()` -> `TLRPC.Chat`
- `getDialogId()` -> `long`
- `getListView()` -> `RecyclerListView`
- `getTopicId()` -> `long`
- `isFragmentOpened()` -> `boolean`
- `isSelf()` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`
- `makeUsernameLinkSpan(TLRPC.TL_username usernameObj)` -> `ClickableSpan`
- `mediaCountUpdated()` -> `void`
- `static of(long dialogId)` -> `ProfileActivity2`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onMemberClick(TLRPC.ChatParticipant participant, boolean b, boolean resultOnly, View view)` -> `boolean`
- `onTransitionAnimationStart(boolean isOpen, boolean backward)` -> `void`
- `scrollToSharedMedia()` -> `void`
- `setLoadingSpan(CharacterStyle span)` -> `void`
- `updateAvatar()` -> `void`
- `updateAvatar(boolean reload)` -> `void`
- `updateColors()` -> `void`
- `updateInfo()` -> `void`
- `updateSelectedMediaTabText()` -> `void`

## `org.telegram.ui.ProfileActivity2$AvatarImage`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setExpandedHeight(float expandedHeight)` -> `void`
- `setRelativeScrollTop(float relativeTop)` -> `void`

## `org.telegram.ui.ProfileActivity2$ContainerView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `drawList(Canvas blurCanvas, boolean top, ArrayList<IViewWithInvalidateCallback> views)` -> `void`
- `onNestedPreFling(View target, float velocityX, float velocityY)` -> `boolean`
- `onNestedPreScroll(View target, int dx, int dy, int[] consumed, int type)` -> `void`
- `onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed)` -> `void`
- `onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type)` -> `void`
- `onNestedScrollAccepted(View child, View target, int axes, int type)` -> `void`
- `onStartNestedScroll(View child, View target, int axes, int type)` -> `boolean`
- `onStopNestedScroll(View target, int type)` -> `void`
- `onStopNestedScroll(View child)` -> `void`

## `org.telegram.ui.ProfileBirthdayEffect`
- `hide()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `start()` -> `boolean`
- `updateFetcher(BirthdayEffectFetcher fetcher)` -> `void`

## `org.telegram.ui.ProfileBirthdayEffect$BirthdayEffectFetcher`
- `detach(boolean force)` -> `void`
- `static of(int currentAccount, TLRPC.UserFull userInfo)` -> `BirthdayEffectFetcher`
- `static of(int currentAccount, TLRPC.UserFull userInfo, BirthdayEffectFetcher old)` -> `BirthdayEffectFetcher`
- `subscribe(Runnable callback)` -> `void`

## `org.telegram.ui.ProfileBirthdayEffect$ImageReceiverAsset`
- `setEmoji(TLRPC.Document document, String filter, TLRPC.TL_messages_stickerSet set, Runnable whenDone)` -> `void`

## `org.telegram.ui.ProfileNotificationsActivity`
- `createView(final Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getResourceProvider()` -> `Theme.ResourcesProvider`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSupportEdgeToEdge()` -> `boolean`
- `onActivityResultFragment(int requestCode, int resultCode, Intent data)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `setDelegate(ProfileNotificationsActivityDelegate profileNotificationsActivityDelegate)` -> `void`

## `org.telegram.ui.ProfileNotificationsActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.ProfileNotificationsActivity$ProfileNotificationsActivityDelegate`
- `didRemoveException(long dialog_id)` -> `default void`

## `org.telegram.ui.ProfileStoriesCollectionTabs`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `getCurrentAlbumId()` -> `int`
- `getNextAlbumId(boolean forward)` -> `int`
- `getVisibilityFactor()` -> `float`
- `getVisualHeight()` -> `float`
- `isReordering()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onVisibilityChange(float factor)` -> `void`
- `resetReordering()` -> `void`
- `scrollToAlbumId(int albumId)` -> `void`
- `selectTabWithId(int albumId, float progress)` -> `void`
- `setInitialTabId(int albumId)` -> `void`
- `setReorderingAlbums(boolean reordering)` -> `void`
- `updatedReordering(boolean reordering)` -> `void`

## `org.telegram.ui.ProfileStoriesCollectionTabs$Adapter`
- `applyReorder(ArrayList<Integer> itemIds)` -> `void`
- `bindView(View view, int position, int viewType)` -> `void`
- `createView(int viewType)` -> `View`
- `getItemCount()` -> `int`
- `getItemId(int position)` -> `int`
- `getItemPosition(int albumId)` -> `int`
- `getItemTitle(int position)` -> `CharSequence`
- `getItemViewType(int position)` -> `int`

## `org.telegram.ui.Stories.ProfileStoriesView`
- `animateNewStory()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getFragmentTransitionProgress()` -> `float`
- `isEmpty()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLongPress()` -> `void`
- `onTap(StoryViewer.PlaceProvider provider)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setActionBarActionMode(float progress)` -> `void`
- `setBounds(float left, float right, float cy, boolean animated)` -> `void`
- `setExpandCoords(float right, boolean rightPadded, float y)` -> `void`
- `setExpandProgress(float progress)` -> `void`
- `setFragmentTransitionProgress(float fragmentTransitionProgress)` -> `void`
- `setProgressToStoriesInsets(float progressToInsets)` -> `void`
- `setStories(TL_stories.PeerStories peerStories)` -> `void`
- `update()` -> `void`
- `updateColors()` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Stories.ProfileStoriesView$StoryCircle`
- `apply()` -> `void`
- `destroy()` -> `void`
- `getIndex()` -> `float`

## `org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$UserCell`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(Object object)` -> `void`
- `setChat(TLRPC.Chat chat, int participants_count)` -> `void`
- `setCheckboxAlpha(float alpha, boolean animated)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setDivider(boolean divider)` -> `void`
- `setIsSendAs(boolean isSendAs, boolean needsCheck)` -> `void`
- `setRedCheckbox(boolean red)` -> `void`
- `setType(int type, int count, TLRPC.User singleUser)` -> `void`
- `setUser(TLRPC.User user)` -> `void`
