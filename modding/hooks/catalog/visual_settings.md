# visual / settings (365 методов)

## `org.telegram.messenger.SharedConfig`
- `static measureDevicePerformanceClass()` -> `int`
- `static updateDayNightThemeSwitchHintCount(int count)` -> `void`

## `org.telegram.ui.ArchiveSettingsActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `isSupportEdgeToEdge()` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`

## `org.telegram.ui.ArchiveSettingsActivity$ItemInner`
- `equals(Object o)` -> `boolean`

## `org.telegram.ui.ArchiveSettingsActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.BlurSettingsBottomSheet`
- `static onThemeApplyed()` -> `void`
- `static show(BaseFragment fragment)` -> `void`

## `org.telegram.ui.Cells.EditTextSettingsCell`
- `getText()` -> `String`
- `getTextView()` -> `EditTextBoldCursor`
- `length()` -> `int`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setEnabled(boolean value, ArrayList<Animator> animators)` -> `void`
- `setText(String text, boolean divider)` -> `void`
- `setTextAndHint(String text, String hint, boolean divider)` -> `void`
- `setTextColor(int color)` -> `void`

## `org.telegram.ui.Cells.SettingsSearchCell`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setTextAndValue(CharSequence text, String[] value, boolean faq, boolean divider)` -> `void`
- `setTextAndValueAndIcon(CharSequence text, String[] value, int icon, boolean divider)` -> `void`

## `org.telegram.ui.Cells.SettingsSearchCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `SettingsSearchCell`
- `static of(CharSequence text, Object obj)` -> `UItem`
- `static of(CharSequence text, ProfileActivity.SearchAdapter.SearchResult r)` -> `UItem`
- `static of(CharSequence text, MessagesController.FaqSearchResult faq)` -> `UItem`

## `org.telegram.ui.Cells.SettingsSearchCell$VerticalImageSpan`
- `draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint)` -> `void`
- `getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fontMetricsInt)` -> `int`

## `org.telegram.ui.Cells.SettingsSuggestionCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onNoClick(int type)` -> `void`
- `onYesClick(int type)` -> `void`
- `setType(int type)` -> `void`

## `org.telegram.ui.Cells.TextDetailSettingsCell`
- `getTextView()` -> `TextView`
- `getValueTextView()` -> `TextView`
- `invalidate()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setMultilineDetail(boolean value)` -> `void`
- `setTextAndValue(CharSequence text, CharSequence value, boolean divider)` -> `void`
- `setTextAndValueAndIcon(String text, CharSequence value, int resId, boolean divider)` -> `void`
- `setTextWithEmojiAnd21Value(String text, CharSequence value, boolean divider)` -> `void`
- `setValue(CharSequence value)` -> `void`

## `org.telegram.ui.Cells.TextSettingsCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getTextView()` -> `TextView`
- `getValueBackupImageView()` -> `BackupImageView`
- `getValueImageView()` -> `ImageView`
- `getValueTextView()` -> `AnimatedTextView`
- `onDetachedFromWindow()` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setBetterLayout(boolean betterLayout)` -> `void`
- `setCanDisable(boolean value)` -> `void`
- `setColorfulIcon(int resId, int color)` -> `void`
- `setDrawLoading(boolean drawLoading, int size, boolean animated)` -> `void`
- `setEnabled(boolean value, ArrayList<Animator> animators)` -> `void`
- `setEnabled(boolean value)` -> `void`
- `setIcon(int resId)` -> `void`
- `setText(CharSequence text, boolean divider)` -> `void`
- `setTextAndIcon(CharSequence text, int resId, boolean divider)` -> `void`
- `setTextAndValue(CharSequence text, CharSequence value, boolean divider)` -> `void`
- `setTextAndValue(CharSequence text, CharSequence value, boolean animated, boolean divider)` -> `void`
- `setTextColor(int color)` -> `void`
- `setTextValueColor(int color)` -> `void`
- `setValue(CharSequence value, boolean animated)` -> `void`
- `updateRTL()` -> `void`

## `org.telegram.ui.Components.JoinToSendSettingsView`
- `getBottomInfoMargin()` -> `float`
- `onJoinRequestToggle(boolean newValue, Runnable cancel)` -> `boolean`
- `onJoinToSendToggle(boolean newValue, Runnable cancel)` -> `boolean`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChat(TLRPC.Chat chat)` -> `void`
- `setFullInfo(BaseFragment fragment, TLRPC.ChatFull chatFull)` -> `void`
- `setJoinRequest(boolean newJoinRequest)` -> `void`
- `setJoinToSend(boolean newJoinToSend)` -> `void`
- `showJoinToSend(boolean show)` -> `void`

## `org.telegram.ui.Components.RoundVideoSettings`
- `static getVideoBitrate()` -> `int`
- `static setCameraResolution(@NonNull RoundVideoSession.CameraResolution value)` -> `void`
- `static setCompositionEnabled(boolean enabled)` -> `void`
- `static setEnabled(boolean enabled)` -> `void`
- `static setFrameRate(@NonNull RoundVideoSession.FrameRate value)` -> `void`
- `static setLastCameraFacing(@NonNull RoundVideoSession.CameraFacing value)` -> `void`
- `static setOutputResolution(@NonNull RoundVideoSession.OutputResolution value)` -> `void`
- `static setVideoBitrate(int value)` -> `void`

## `org.telegram.ui.Components.SwipeGestureSettingsView`
- `getIcon(int i)` -> `RLottieDrawable`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityEvent(AccessibilityEvent event)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setBackgroundColor(int color)` -> `void`
- `updateColors()` -> `void`
- `updateIconColor(int i)` -> `void`

## `org.telegram.ui.DataSettingsActivity`
- `createView(Context context)` -> `View`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSupportEdgeToEdge()` -> `boolean`
- `onDialogDismiss(Dialog dialog)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onResume()` -> `void`

## `org.telegram.ui.DataSettingsActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `isRowEnabled(int position)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.LiteModeSettingsActivity`
- `createView(Context context)` -> `View`
- `isSupportEdgeToEdge()` -> `boolean`
- `onBecomeFullyHidden()` -> `void`
- `onBecomeFullyVisible()` -> `void`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `scrollToFlags(int flags)` -> `void`
- `scrollToType(int type)` -> `void`
- `setExpanded(int flags, boolean expand)` -> `void`

## `org.telegram.ui.LiteModeSettingsActivity$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.LiteModeSettingsActivity$Item`
- `static asCheckbox(CharSequence text, int flags)` -> `Item`
- `static asHeader(CharSequence text)` -> `Item`
- `static asInfo(CharSequence text)` -> `Item`
- `static asSlider()` -> `Item`
- `static asSwitch(int iconResId, CharSequence text, int flags)` -> `Item`
- `static asSwitch(CharSequence text, int type)` -> `Item`
- `equals(Object o)` -> `boolean`
- `getFlagsCount()` -> `int`

## `org.telegram.ui.LiteModeSettingsActivity$PowerSaverSlider`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onPopulateAccessibilityEvent(AccessibilityEvent event)` -> `void`
- `performAccessibilityAction(int action, @Nullable Bundle arguments)` -> `boolean`
- `update()` -> `void`

## `org.telegram.ui.LiteModeSettingsActivity$SwitchCell`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(Item item, boolean divider)` -> `void`
- `setDisabled(boolean disabled, boolean animated)` -> `void`
- `update(Item item)` -> `void`

## `org.telegram.ui.NotificationsCustomSettingsActivity`
- `static areStoriesNotMuted(int currentAccount, long did)` -> `boolean`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSupportEdgeToEdge()` -> `boolean`
- `onActivityResultFragment(int requestCode, int resultCode, Intent data)` -> `void`
- `onBecomeFullyVisible()` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `toggleShowAutoExceptions()` -> `void`
- `updateRows(boolean animated)` -> `void`

## `org.telegram.ui.NotificationsCustomSettingsActivity$ExpandView`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(CharSequence text, boolean expand, boolean divider)` -> `void`
- `setArrow(boolean expand, boolean animated)` -> `void`

## `org.telegram.ui.NotificationsCustomSettingsActivity$ItemInner`
- `static asButton(int id, int resId, CharSequence text)` -> `ItemInner`
- `static asCheck(int id, CharSequence text, boolean checked)` -> `ItemInner`
- `static asCheck2(int id, int icon, CharSequence text, CharSequence subtext, boolean checked)` -> `ItemInner`
- `static asColor(CharSequence text, int color)` -> `ItemInner`
- `static asException(NotificationsSettingsActivity.NotificationException exception)` -> `ItemInner`
- `static asExpand(CharSequence text, boolean expand)` -> `ItemInner`
- `static asHeader(CharSequence text)` -> `ItemInner`
- `static asSetting(int id, CharSequence text, CharSequence value)` -> `ItemInner`
- `static asShadow(int id, CharSequence text)` -> `ItemInner`
- `contentsEquals(AdapterWithDiffUtils.Item o)` -> `boolean`
- `equals(Object o)` -> `boolean`

## `org.telegram.ui.NotificationsCustomSettingsActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.NotificationsCustomSettingsActivity$SearchAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `getObject(int position)` -> `Object`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `searchDialogs(final String query)` -> `void`

## `org.telegram.ui.NotificationsSettingsActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSupportEdgeToEdge()` -> `boolean`
- `makeNotificationsCustomSettingsActivity(int type)` -> `NotificationsCustomSettingsActivity`
- `onActivityResultFragment(int requestCode, int resultCode, Intent data)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onResume()` -> `void`

## `org.telegram.ui.NotificationsSettingsActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.PrivacySettingsActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static formatRulesString(AccountInstance accountInstance, int rulesType)` -> `String`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSupportEdgeToEdge()` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onResume()` -> `void`
- `setCurrentPassword(TL_account.Password currentPassword)` -> `PrivacySettingsActivity`
- `updateRows(boolean notify)` -> `void`

## `org.telegram.ui.PrivacySettingsActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.ProxySettingsActivity`
- `createView(Context context)` -> `View`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`

## `org.telegram.ui.ProxySettingsActivity$TypeCell`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setTypeChecked(boolean value)` -> `void`
- `setValue(String name, boolean checked, boolean divider)` -> `void`

## `org.telegram.ui.QuickRepliesSettingsActivity`
- `createView(Context context)` -> `View`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onResume()` -> `void`

## `org.telegram.ui.QuickRepliesSettingsActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.RoundVideoSettingsActivity`
- `createView(Context context)` -> `View`

## `org.telegram.ui.RoundVideoSettingsActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.SettingsActivity`
- `clearViews()` -> `void`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `didStartUpload(boolean fromAvatarConstructor, boolean isVideo)` -> `void`
- `didUploadPhoto(final TLRPC.InputFile photo, final TLRPC.InputFile video, double videoStartTimestamp, String videoPath, TLRPC.PhotoSize bigSize, final TLRPC.PhotoSize smallSize, boolean isVideo, TLRPC.VideoSize emojiMarkup)` -> `void`
- `drawEdgeNavigationBar()` -> `boolean`
- `getGlassSource()` -> `BlurredBackgroundSourceRenderNode`
- `getVersionName()` -> `String`
- `isSupportEdgeToEdge()` -> `boolean`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onParentScrollToTop()` -> `void`
- `onUploadProgressChanged(float progress)` -> `void`
- `openDebugMenu()` -> `void`
- `setInfo()` -> `void`
- `setInfo(TLRPC.User user)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.SettingsActivity$AccountCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(int account)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.SettingsActivity$AccountCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `contentsEquals(UItem a, UItem b)` -> `boolean`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `AccountCell`
- `equals(UItem a, UItem b)` -> `boolean`
- `static of(int id, int account)` -> `UItem`

## `org.telegram.ui.SettingsActivity$SettingCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(int iconColorTop, int iconColorBottom, int icon, CharSequence title, CharSequence subtitle, CharSequence value)` -> `void`
- `setValue(CharSequence value)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.SettingsActivity$SettingCell$Background`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColor(int topColor, int bottomColor)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setDrawBorder(boolean drawBorder)` -> `void`

## `org.telegram.ui.SettingsActivity$SettingCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `SettingCell`
- `static of(int id, int iconColorTop, int iconColorBottom, int icon, CharSequence title)` -> `UItem`
- `static of(int id, int iconColorTop, int iconColorBottom, int icon, CharSequence title, CharSequence subtitle)` -> `UItem`
- `static of(int id, int iconColorTop, int iconColorBottom, int icon, CharSequence title, CharSequence subtitle, CharSequence value)` -> `UItem`
- `static ofBot(TLRPC.TL_attachMenuBot attachMenuBot, int iconColorTop, int iconColorBottom, int icon)` -> `UItem`

## `org.telegram.ui.SettingsActivity$SuggestionCell`
- `set(CharSequence title, CharSequence text, CharSequence noText, View.OnClickListener noListener, CharSequence yesText, View.OnClickListener yesListener)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.SettingsActivity$SuggestionCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `SuggestionCell`
- `isClickable()` -> `boolean`
- `static of(CharSequence title, CharSequence text, CharSequence noText, View.OnClickListener noListener, CharSequence yesText, View.OnClickListener yesListener)` -> `UItem`

## `org.telegram.ui.ThemeActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `highlightSensitiveRow()` -> `ThemeActivity`
- `isSupportEdgeToEdge()` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `static verifyAge(Context context, int currentAccount, Utilities.Callback<Boolean> done, Theme.ResourcesProvider resourcesProvider)` -> `void`

## `org.telegram.ui.ThemeActivity$BubbleRadiusCell`
- `invalidate()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `performAccessibilityAction(int action, Bundle arguments)` -> `boolean`

## `org.telegram.ui.ThemeActivity$GpsLocationListener`
- `onLocationChanged(Location location)` -> `void`
- `onProviderDisabled(String provider)` -> `void`
- `onProviderEnabled(String provider)` -> `void`
- `onStatusChanged(String provider, int status, Bundle extras)` -> `void`

## `org.telegram.ui.ThemeActivity$InnerAccentView`
- `getCheckedState()` -> `float`
- `onAttachedToWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setCheckedState(float state)` -> `void`
- `setThemeAndColor(Theme.ThemeInfo themeInfo, Theme.ThemeAccent accent)` -> `void`
- `updateCheckedState(boolean animate)` -> `void`

## `org.telegram.ui.ThemeActivity$InnerCustomAccentView`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.ThemeActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.ThemeActivity$TextSizeCell`
- `invalidate()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `performAccessibilityAction(int action, Bundle arguments)` -> `boolean`

## `org.telegram.ui.ThemeActivity$ThemeAccentsListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.TopicsNotifySettingsFragments`
- `createView(Context context)` -> `View`
- `onFragmentCreate()` -> `boolean`
- `setExceptions(HashSet<Integer> notificationsExceptionTopics)` -> `void`

## `org.telegram.ui.TopicsNotifySettingsFragments$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.TopicsNotifySettingsFragments$Item`
- `equals(Object o)` -> `boolean`

## `org.telegram.ui.bots.BotBiometrySettings`
- `createView(Context context)` -> `View`

## `org.telegram.ui.bots.BotWebViewAttachedSheet$MainButtonSettings`
- `static of(boolean isVisible, boolean isActive, String text, int color, int textColor, boolean isProgressVisible)` -> `MainButtonSettings`

## `org.telegram.ui.web.WebBrowserSettings`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTitle()` -> `CharSequence`
- `onClick(UItem item, View view, int position, float x, float y)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onLongClick(UItem item, View view, int position, float x, float y)` -> `boolean`

## `org.telegram.ui.web.WebBrowserSettings$WebsiteView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(CharSequence title, String domain, long favicon, boolean divider)` -> `void`

## `org.telegram.ui.web.WebBrowserSettings$WebsiteView$Factory`
- `static as(String domain, String title, long favicon)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `WebsiteView`
