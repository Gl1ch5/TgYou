# visual / other (14750 методов)

## `org.telegram.SQLite.SQLitePreparedStatement`
- `bindByteBuffer(int index, ByteBuffer value)` -> `void`
- `bindByteBuffer(int index, NativeByteBuffer value)` -> `void`
- `bindDouble(int index, double value)` -> `void`
- `bindInteger(int index, int value)` -> `void`
- `bindLong(int index, long value)` -> `void`
- `bindNull(int index)` -> `void`
- `bindString(int index, String value)` -> `void`
- `bindTlObject(int index, TLObject object)` -> `void`

## `org.telegram.messenger.AiTonesController`
- `invalidate()` -> `void`

## `org.telegram.messenger.AndroidUtilities`
- `static applyColorMatrix(Bitmap bitmap, ColorMatrix matrix)` -> `Bitmap`
- `static drawNavigationBarProtection(Canvas canvas, View view, int color, int navigationBarHeight)` -> `void`
- `static drawNavigationBarProtection(Canvas canvas, View view, int color, int navigationBarHeight, float alpha)` -> `void`
- `static drawStroke(Canvas canvas, RectF rect, float radius)` -> `void`
- `static drawStroke(Canvas canvas, RectF rect, float radius, float alpha)` -> `void`
- `static dumpCanvas(View v)` -> `void`
- `static getNavigationBarThirdButtonsFactor(int height)` -> `float`
- `static getNavigationBarThirdButtonsFactor(float min, float max, int height)` -> `float`
- `static getSafeString(String str)` -> `String`
- `static makeBlurBitmap(View view)` -> `Bitmap`
- `static makeBlurBitmap(View view, float downscale, int maxRadius)` -> `Bitmap`
- `static setNavigationBarColor(Dialog dialog, int color)` -> `void`
- `static setNavigationBarColor(Dialog dialog, int color, boolean animated)` -> `void`
- `static setNavigationBarColor(Dialog dialog, int color, boolean animated, IntColorCallback onUpdate)` -> `void`
- `static setNavigationBarColor(Activity activity, int color)` -> `void`
- `static setNavigationBarColor(Activity activity, int color, boolean animated)` -> `void`
- `static setScrollViewEdgeEffectColor(HorizontalScrollView scrollView, int color)` -> `void`
- `static setScrollViewEdgeEffectColor(ScrollView scrollView, int color)` -> `void`
- `static setViewPagerEdgeEffectColor(ViewPager viewPager, int color)` -> `void`
- `static snapshotView(View v)` -> `Bitmap`
- `static updateImageViewImageAnimated(ImageView imageView, int newIcon)` -> `void`
- `static updateImageViewImageAnimated(ImageView imageView, Drawable newIcon)` -> `void`
- `static updateViewLayout(WindowManager windowManager, View view, ViewGroup.LayoutParams params)` -> `void`
- `static updateViewShow(View view, boolean show)` -> `void`
- `static updateViewShow(View view, boolean show, boolean scale, boolean animated)` -> `void`
- `static updateViewShow(View view, boolean show, boolean scale, boolean animated, Runnable onDone)` -> `void`
- `static updateViewShow(View view, boolean show, boolean scale, float translate, boolean animated, Runnable onDone)` -> `void`
- `static updateViewVisibilityAnimated(View view, boolean show)` -> `void`
- `static updateViewVisibilityAnimated(View view, boolean show, float scaleFactor, boolean animated)` -> `void`
- `static updateViewVisibilityAnimated(View view, boolean show, float scaleFactor, boolean goneOnHide, boolean animated)` -> `void`
- `static updateViewVisibilityAnimated(View view, boolean show, float scaleFactor, boolean goneOnHide, float maxAlpha, boolean animated, ValueAnimator.AnimatorUpdateListener onUpdate)` -> `void`
- `static withLearnMore(CharSequence text, Runnable onClick)` -> `CharSequence`

## `org.telegram.messenger.BotForumHelper$BotDraftAnimationsPool`
- `bind(int pendingMessageId, int messageId)` -> `void`

## `org.telegram.messenger.BotFullscreenButtons`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBack(boolean enable)` -> `void`
- `setBack(boolean enable, boolean animated)` -> `void`
- `setDownloading(boolean downloading)` -> `void`
- `setInsets(RectF rect)` -> `void`
- `setInsets(Rect rect)` -> `void`
- `setName(String name, boolean verified)` -> `void`
- `setOnCloseClickListener(Runnable listener)` -> `void`
- `setOnCollapseClickListener(Runnable listener)` -> `void`
- `setOnMenuClickListener(Runnable listener)` -> `void`
- `setParentRenderNode(Object renderNode)` -> `void`
- `setPreview(boolean preview, boolean animated)` -> `void`
- `setWebView(WebView webView)` -> `void`

## `org.telegram.messenger.BotFullscreenButtons$OptionsIcon`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setDownloading(boolean downloading)` -> `void`

## `org.telegram.messenger.BotInlineKeyboard$Button`
- `getColor()` -> `BackgroundColor`

## `org.telegram.messenger.BotInlineKeyboard$ButtonBot`
- `getColor()` -> `BackgroundColor`
- `getIconEmoji()` -> `long`
- `getText()` -> `String`

## `org.telegram.messenger.BotInlineKeyboard$ButtonCustom`
- `getIconRes()` -> `int`
- `getText()` -> `String`

## `org.telegram.messenger.ChatsWidgetService`
- `onGetViewFactory(Intent intent)` -> `RemoteViewsFactory`

## `org.telegram.messenger.ContactsWidgetService`
- `onGetViewFactory(Intent intent)` -> `RemoteViewsFactory`

## `org.telegram.messenger.ExtendedBitmapDrawable`
- `getInvert()` -> `int`
- `getOrientation()` -> `int`
- `invertHorizontally()` -> `boolean`
- `invertVertically()` -> `boolean`

## `org.telegram.messenger.FeedWidgetService`
- `onGetViewFactory(Intent intent)` -> `RemoteViewsFactory`

## `org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet`
- `dismiss()` -> `void`
- `migrateOldFolder()` -> `void`

## `org.telegram.messenger.FlagSecureReason`
- `invalidate()` -> `void`

## `org.telegram.messenger.GoogleMapsProvider$GoogleMapImpl`
- `animateCamera(ICameraUpdate update)` -> `void`
- `animateCamera(ICameraUpdate update, ICancelableCallback callback)` -> `void`
- `animateCamera(ICameraUpdate update, int duration, ICancelableCallback callback)` -> `void`

## `org.telegram.messenger.GoogleMapsProvider$GoogleMapImpl$GoogleCircle`
- `setFillColor(int color)` -> `void`
- `setStrokeColor(int color)` -> `void`

## `org.telegram.messenger.ImageReceiver`
- `draw(Canvas canvas)` -> `boolean`
- `draw(Canvas canvas, BackgroundThreadDrawHolder backgroundThreadDrawHolder)` -> `boolean`
- `drawDrawable(Canvas canvas, Drawable drawable, int alpha, BitmapShader shader, int orientation, int invert, int isPressed, BackgroundThreadDrawHolder backgroundThreadDrawHolder)` -> `void`
- `invalidate()` -> `void`
- `setAlpha(float value)` -> `void`
- `setColorFilter(ColorFilter filter)` -> `void`
- `setCrossfadeAlpha(byte value)` -> `void`
- `setCurrentAlpha(float value)` -> `void`
- `setUseRoundForThumbDrawable(boolean value)` -> `void`
- `skipDraw()` -> `void`

## `org.telegram.messenger.Intro`
- `static setBackgroundColor(int color)` -> `void`

## `org.telegram.messenger.RichMessageLayout`
- `draw(Canvas canvas, int padLeft, int padRight, ChatMessageCell.TransitionParams tp)` -> `void`
- `draw(Canvas canvas, int padLeft, int padRight, ChatMessageCell.TransitionParams tp, float clipTop, float clipBottom)` -> `void`
- `drawOverlay(Canvas canvas)` -> `boolean`
- `drawOverlay(Canvas canvas, ColorFilter colorFilter)` -> `boolean`
- `layout(RichMessageLayout prev)` -> `void`

## `org.telegram.messenger.RichMessageLayout$MediaCell`
- `draw(Canvas canvas)` -> `void`

## `org.telegram.messenger.RichMessageLayout$PreviewView`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `set(TL_iv.RichMessage rich_message)` -> `void`
- `setAllowActions(boolean allow)` -> `void`
- `setMaxHeight(int maxHeight)` -> `void`
- `setMinHeight(int minHeight)` -> `void`
- `setPadding(int left, int top, int right, int bottom)` -> `void`
- `setResourcesProvider(Theme.ResourcesProvider resourcesProvider)` -> `void`
- `setTextSelectionHelper(TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper)` -> `void`
- `setTranslationLoading(boolean loading)` -> `void`

## `org.telegram.messenger.RichMessageLayout$PreviewView$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `contentsEquals(UItem a, UItem b)` -> `boolean`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `PreviewView`
- `equals(UItem a, UItem b)` -> `boolean`
- `isClickable()` -> `boolean`
- `static of(TL_iv.RichMessage richMessage)` -> `UItem`

## `org.telegram.messenger.RichMessageLayout$RichBlock`
- `collectAnimatorBlocks(List<MultiLayoutTypingAnimator.Block> out)` -> `void`
- `draw(Canvas canvas)` -> `void`
- `draw(Canvas canvas, int lineIndex, float xPosition)` -> `void`
- `drawOverlay(Canvas canvas)` -> `boolean`
- `drawOverlay(Canvas canvas, ColorFilter colorFilter)` -> `boolean`
- `drawWithTyping(Canvas canvas)` -> `void`
- `forcesTimeToNewLine()` -> `boolean`
- `getBackgroundScale()` -> `float`
- `getHeight()` -> `int`
- `getLastLineWidth()` -> `int`
- `getMinWidth()` -> `int`
- `onDraw(Canvas canvas)` -> `void`
- `onDrawFaded(Canvas canvas, int lineIndex, float xPosition)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichButton`
- `draw(Canvas canvas)` -> `void`
- `getMinWidth()` -> `int`
- `getPreferredWidth()` -> `int`
- `setTextColorKey(int colorKey)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichButtonRowBlock`
- `draw(Canvas canvas)` -> `void`
- `onDetachedFromWindow()` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichButtonSpan`
- `draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, @NonNull Paint paint)` -> `void`
- `getButton()` -> `RichButton`

## `org.telegram.messenger.RichMessageLayout$RichCaptionBlock`
- `forcesTimeToNewLine()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichCollageBlock`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichDetailsBlock`
- `isOpen()` -> `boolean`
- `onBlockAccessibilityElementClick(int element, View host)` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichDividerBlock`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichMapBlock`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichMathBlock`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichMediaBlock`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichPreformattedBlock`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichSlideshowBlock`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichTableBlock`
- `collectAnimatorBlocks(List<MultiLayoutTypingAnimator.Block> out)` -> `void`
- `drawOverlay(Canvas canvas, ColorFilter colorFilter)` -> `boolean`
- `drawWithTyping(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichTextBlock`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichTextBlockQuote`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichThinkingBlock`
- `appendAccessibilityText(SpannableStringBuilder sb)` -> `void`
- `drawOverlay(Canvas canvas, ColorFilter colorFilter)` -> `boolean`
- `getText()` -> `TextSelectionHelper.TextLayoutBlock[]`
- `onDraw(Canvas canvas)` -> `void`
- `placeTexts(int blockX, int blockY, int row)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichUnsupportedBlock`
- `draw(Canvas canvas)` -> `void`
- `getHeight()` -> `int`
- `invalidateDrawable(@NonNull Drawable who)` -> `void`

## `org.telegram.messenger.RichMessageLayout$StyleSpan`
- `updateMeasureState(@NonNull TextPaint paint)` -> `void`

## `org.telegram.messenger.RichMessageLayout$Text`
- `draw(Canvas canvas)` -> `void`
- `draw(Canvas canvas, View viewArg)` -> `void`
- `drawFade(Canvas canvas, int lineIndex, float xPosition)` -> `void`
- `drawLeft()` -> `int`
- `getBaseline()` -> `int`
- `getEmojiOnlyCount()` -> `int`

## `org.telegram.messenger.SvgHelper`
- `static getBitmapByPathOnly(String pathString, int svgWidth, int svgHeight, int width, int height)` -> `Bitmap`

## `org.telegram.messenger.SvgHelper$SvgDrawable`
- `clone()` -> `SvgDrawable`
- `copyCommandFromPosition(int position)` -> `void`
- `draw(Canvas canvas)` -> `void`
- `drawInternal(Canvas canvas, boolean drawInBackground, int threadIndex, long time, float x, float y, float w, float h)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `getScale(int viewWidth, int viewHeight)` -> `float`
- `overrideWidthAndHeight(int w, int h)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setAspectCenter(boolean value)` -> `void`
- `setAspectFill(boolean value)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(ColorFilter colorFilter)` -> `void`
- `setColorKey(int colorKey)` -> `void`
- `setColorKey(int colorKey, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `setPaint(Paint paint)` -> `void`
- `setPaint(Paint paint, int position)` -> `void`
- `setParent(ImageReceiver imageReceiver)` -> `void`
- `setupGradient(int colorKey, float alpha, boolean drawInBackground)` -> `void`
- `setupGradient(int colorKey, Theme.ResourcesProvider resourcesProvider, float alpha, boolean drawInBackground)` -> `void`
- `static updateLiteValues()` -> `void`

## `org.telegram.messenger.TelegramQRCodeWriter`
- `static drawSideQuads(Canvas canvas, float xOffset, float yOffset, Paint blackPaint, float sideQuadSize, float multiple, int padding, float size, float radiusFactor, float[] radii, boolean isTransparentBackground)` -> `void`
- `static drawSideQuadsGradient(Canvas canvas, Paint blackPaint, GradientDrawable rect, float sideQuadSize, float multiple, int padding, float size, float radiusFactor, float[] radii, int backgroundColor, int color)` -> `void`
- `setCenterDrawable(Drawable drawable)` -> `void`

## `org.telegram.messenger.TopicsController`
- `getTopicIconName(TLRPC.Chat chat, MessageObject message, TextPaint paint)` -> `CharSequence`
- `updateTopicInUi(long dialogId, TLRPC.TL_forumTopic forumTopic, int flags)` -> `void`

## `org.telegram.messenger.TranslateController`
- `static invalidateSuggestedLanguageCodes()` -> `void`
- `invalidateTranslation(MessageObject messageObject)` -> `void`

## `org.telegram.messenger.Utilities`
- `static stackBlurBitmapMax(Bitmap bitmap)` -> `Bitmap`
- `static stackBlurBitmapMax(Bitmap bitmap, boolean round)` -> `Bitmap`
- `static stackBlurBitmapWithScaleFactor(Bitmap bitmap, float scaleFactor)` -> `Bitmap`

## `org.telegram.messenger.browser.Browser`
- `static bindCustomTabsService(Activity activity)` -> `void`

## `org.telegram.messenger.postdrawcompat.ViewOnPostDraw`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`

## `org.telegram.messenger.support.customtabs.CustomTabsIntent$Builder`
- `setSecondaryToolbarColor(@ColorInt int color)` -> `Builder`
- `setToolbarColor(@ColorInt int color)` -> `Builder`

## `org.telegram.messenger.support.customtabs.PostMessageServiceConnection`
- `bindSessionToPostMessageService(Context context, String packageName)` -> `boolean`

## `org.telegram.messenger.utils.DebugRecordingCanvas`
- `drawBitmap(@NonNull Bitmap bitmap, float left, float top, @Nullable Paint paint)` -> `void`
- `drawBitmap(@NonNull Bitmap bitmap, @Nullable Rect src, @NonNull RectF dst, @Nullable Paint paint)` -> `void`
- `drawBitmap(@NonNull Bitmap bitmap, @Nullable Rect src, @NonNull Rect dst, @Nullable Paint paint)` -> `void`
- `drawBitmap(@NonNull Bitmap bitmap, @NonNull Matrix matrix, @Nullable Paint paint)` -> `void`
- `drawCircle(float cx, float cy, float radius, @NonNull Paint paint)` -> `void`
- `drawColor(int color)` -> `void`
- `drawColor(int color, @NonNull PorterDuff.Mode mode)` -> `void`
- `drawLine(float startX, float startY, float stopX, float stopY, @NonNull Paint paint)` -> `void`
- `drawLines(@NonNull float[] pts, int offset, int count, @NonNull Paint paint)` -> `void`
- `drawLines(@NonNull float[] pts, @NonNull Paint paint)` -> `void`
- `drawOval(@NonNull RectF oval, @NonNull Paint paint)` -> `void`
- `drawOval(float left, float top, float right, float bottom, @NonNull Paint paint)` -> `void`
- `drawPaint(@NonNull Paint paint)` -> `void`
- `drawPatch(@NonNull NinePatch patch, @NonNull Rect dst, @Nullable Paint paint)` -> `void`
- `drawPatch(@NonNull NinePatch patch, @NonNull RectF dst, @Nullable Paint paint)` -> `void`
- `drawPath(@NonNull Path path, @NonNull Paint paint)` -> `void`
- `drawPicture(@NonNull Picture picture)` -> `void`
- `drawPicture(@NonNull Picture picture, @NonNull RectF dst)` -> `void`
- `drawPicture(@NonNull Picture picture, @NonNull Rect dst)` -> `void`
- `drawPoint(float x, float y, @NonNull Paint paint)` -> `void`
- `drawPoints(@NonNull float[] pts, int offset, int count, @NonNull Paint paint)` -> `void`
- `drawPoints(@NonNull float[] pts, @NonNull Paint paint)` -> `void`
- `drawRect(@NonNull RectF rect, @NonNull Paint paint)` -> `void`
- `drawRect(@NonNull Rect r, @NonNull Paint paint)` -> `void`
- `drawRect(float left, float top, float right, float bottom, @NonNull Paint paint)` -> `void`
- `drawRoundRect(@NonNull RectF rect, float rx, float ry, @NonNull Paint paint)` -> `void`
- `drawText(@NonNull String text, float x, float y, @NonNull Paint paint)` -> `void`
- `save()` -> `int`
- `saveLayer(@Nullable RectF bounds, @Nullable Paint paint)` -> `int`
- `saveLayer(@Nullable RectF bounds, @Nullable Paint paint, int saveFlags)` -> `int`

## `org.telegram.messenger.utils.DebugRecordingCanvas$GetClipBoundsCmd`
- `wasClipEmpty()` -> `boolean`

## `org.telegram.messenger.utils.DebugRecordingCanvas$QuickRejectCmd`
- `wasRejected()` -> `boolean`

## `org.telegram.messenger.utils.DrawableUtils`
- `static drawCommunityCardDrawable(Canvas canvas, Drawable drawable, float cx, float cy, float size)` -> `void`
- `static drawWithScale(Canvas canvas, Drawable drawable, float scale)` -> `void`
- `static getCommunityCardDrawableRadius(int size)` -> `int`

## `org.telegram.messenger.utils.FrameMetricsOverlayView`
- `detach()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int w, int h)` -> `void`
- `setObservedView(@Nullable View view)` -> `void`

## `org.telegram.messenger.utils.GradientProtectionDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `static fillColors(Interpolator interpolator, int color, int[] colors)` -> `void`
- `getAlpha()` -> `int`
- `getOpacity()` -> `int`
- `onBoundsChange(@NonNull Rect bounds)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColor(@ColorInt int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setInsets(int left, int top, int right, int bottom)` -> `void`
- `setSide(@WindowInsetsCompat.Side.InsetsSide int side)` -> `void`

## `org.telegram.messenger.utils.OnPostDrawView`
- `bringToFrontIfNeeded()` -> `void`
- `invalidate(int flags)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onPreDraw()` -> `boolean`

## `org.telegram.messenger.utils.ViewOutlineProviderImpl`
- `static drawViewWithOutline(Canvas canvas, View view, Utilities.Callback<Canvas> draw)` -> `void`

## `org.telegram.messenger.video.OutputSurface`
- `drawImage(long time)` -> `void`

## `org.telegram.messenger.video.TextureRenderer`
- `drawFrame(SurfaceTexture st, long time)` -> `void`

## `org.telegram.messenger.video.VideoAds$AdLayout`
- `getAccessibilityText()` -> `CharSequence`
- `hideImage()` -> `void`
- `onShow()` -> `void`

## `org.telegram.messenger.video.VideoAds$AdOptionsDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.messenger.video.VideoAds$CloseDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `isCrossAvailable()` -> `boolean`
- `setAlpha(int alpha)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setPaused(boolean paused)` -> `void`

## `org.telegram.messenger.video.VideoFramesRewinder`
- `draw(Canvas canvas, int w, int h)` -> `void`

## `org.telegram.messenger.video.WebmEncoder$FrameDrawer`
- `draw(Canvas canvas, int frame)` -> `void`

## `org.telegram.ui.AccountFrozenAlert`
- `static show(int currentAccount)` -> `void`
- `static show(Context context, int currentAccount, Theme.ResourcesProvider resourcesProvider)` -> `void`

## `org.telegram.ui.ActionIntroActivity`
- `createView(Context context)` -> `View`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `getType()` -> `int`
- `isLightStatusBar()` -> `boolean`
- `onLocationAddressAvailable(String address, String displayAddress, TLRPC.TL_messageMediaVenue city, TLRPC.TL_messageMediaVenue street, Location location)` -> `void`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `setGroupCreateAddress(String address, String displayAddress, Location location)` -> `void`
- `setOnOpenedSettings(Runnable openedSettings)` -> `void`
- `setQrLoginDelegate(ActionIntroQRLoginDelegate actionIntroQRLoginDelegate)` -> `void`
- `setShowingAsBottomSheet(boolean showingAsBottomSheet)` -> `void`

## `org.telegram.ui.Adapters.BaseLocationAdapter`
- `destroy()` -> `void`
- `getLastSearchString()` -> `String`
- `notifyStartSearch(boolean wasSearching, int oldItemCount, boolean animated)` -> `void`
- `searchDelayed(final String query, final Location coordinate)` -> `void`
- `searchPlacesWithQuery(final String query, final Location coordinate, boolean searchUser)` -> `void`
- `searchPlacesWithQuery(final String query, final Location coordinate, boolean searchUser, boolean animated)` -> `void`
- `setDelegate(long did, BaseLocationAdapterDelegate delegate)` -> `void`
- `update(boolean animated)` -> `void`

## `org.telegram.ui.Adapters.ContactsAdapter`
- `getCountForSection(int section)` -> `int`
- `getHash(int section, int position)` -> `int`
- `getItem(int section, int position)` -> `Object`
- `getItemViewType(int section, int position)` -> `int`
- `getLetter(int position)` -> `String`
- `getPositionForScrollProgress(RecyclerListView listView, float progress, int[] position)` -> `void`
- `getSectionCount()` -> `int`
- `getSectionHeaderView(int section, View view)` -> `View`
- `isEmpty()` -> `boolean`
- `isEnabled(RecyclerView.ViewHolder holder, int section, int row)` -> `boolean`
- `onBindViewHolder(int section, int position, RecyclerView.ViewHolder holder)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `setDisableSections(boolean value)` -> `void`
- `setSortType(int value, boolean force)` -> `void`
- `sortOnlineContacts()` -> `void`

## `org.telegram.ui.Adapters.DialogsSearchAdapter`
- `clearRecentHashtags()` -> `void`
- `static clearRecentSearch(int currentAccount)` -> `void`
- `clearRecentSearch()` -> `void`
- `clickedSponsoredPeer(TLRPC.TL_sponsoredPeer sponsoredPeer)` -> `void`
- `filterRecent(String query)` -> `void`
- `getCurrentItemCount()` -> `int`
- `getInnerListView()` -> `RecyclerListView`
- `getItem(int i)` -> `Object`
- `getItemCount()` -> `int`
- `getItemId(int i)` -> `long`
- `getItemViewType(int i)` -> `int`
- `getLastSearchString()` -> `String`
- `getRecentItemsCount()` -> `int`
- `getRecentResultsCount()` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `isGlobalSearch(int i)` -> `boolean`
- `isHashtagSearch()` -> `boolean`
- `isMessagesSearchEndReached()` -> `boolean`
- `isRecentSearchDisplayed()` -> `boolean`
- `isSearchWas()` -> `boolean`
- `isSearching()` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `openBotApp(TLRPC.User bot)` -> `void`
- `openPublicPosts()` -> `void`
- `openSponsoredOptions(ProfileSearchCell cell, TLRPC.TL_sponsoredPeer sponsoredPeer)` -> `void`
- `resetFilter()` -> `void`
- `searchDialogs(String text, int folderId, boolean allowPublicPosts)` -> `void`
- `seenSponsoredPeer(TLRPC.TL_sponsoredPeer sponsoredPeer)` -> `void`
- `setDelegate(DialogsSearchAdapterDelegate delegate)` -> `void`
- `setFilterDialogIds(ArrayList<Long> filterDialogIds)` -> `void`
- `setFiltersDelegate(FilteredSearchView.Delegate filtersDelegate, boolean update)` -> `void`

## `org.telegram.ui.Adapters.DialogsSearchAdapter$CategoryAdapterRecycler`
- `getItemCount()` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `setIndex(int value)` -> `void`

## `org.telegram.ui.Adapters.DialogsSearchAdapter$EmptyLayout`
- `setQuery(String query)` -> `void`

## `org.telegram.ui.Adapters.LocationActivityAdapter`
- `getAddressName()` -> `String`
- `getItem(int i)` -> `Object`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onDirectionClick()` -> `void`
- `onLocationAddressAvailable(String address, String displayAddress, TLRPC.TL_messageMediaVenue city, TLRPC.TL_messageMediaVenue street, Location location)` -> `void`
- `setAddressNameOverride(String address)` -> `void`
- `setCustomLocation(Location location)` -> `void`
- `setGpsLocation(Location location)` -> `void`
- `setLiveLocations(ArrayList<LocationActivity.LiveLocation> liveLocations)` -> `void`
- `setMyLocationDenied(boolean myLocationDenied, boolean askingForLocation)` -> `void`
- `setOverScrollHeight(int value)` -> `void`
- `setSharedMediaLayout(SharedMediaLayout layout)` -> `void`
- `setSharedMediaLayoutVisible(boolean sharedMediaLayoutVisible)` -> `boolean`
- `setUpdateRunnable(Runnable runnable)` -> `void`
- `updateLiveLocationCell()` -> `void`
- `updateLiveLocations()` -> `void`

## `org.telegram.ui.Adapters.LocationActivitySearchAdapter`
- `getItem(int position)` -> `TLRPC.TL_messageMediaVenue`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `notifyStartSearch(boolean wasSearching, int oldItemCount, boolean animated)` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `setMyLocationDenied(boolean myLocationDenied)` -> `void`

## `org.telegram.ui.Adapters.MentionsAdapter`
- `clear(boolean safe)` -> `void`
- `clearRecentHashtags()` -> `void`
- `didReceivedNotification(int id, int account, final Object... args)` -> `void`
- `doSomeStickersAction()` -> `void`
- `getBotCaption()` -> `String`
- `getBotContextSwitch()` -> `TLRPC.TL_inlineBotSwitchPM`
- `getBotWebViewSwitch()` -> `TLRPC.TL_inlineBotWebView`
- `getContextBotId()` -> `long`
- `getContextBotName()` -> `String`
- `getContextBotUser()` -> `TLRPC.User`
- `getFoundContextBot()` -> `TLRPC.User`
- `getHashtagHint()` -> `String`
- `getItem(int i)` -> `Object`
- `getItemCount()` -> `int`
- `getItemCountInternal()` -> `int`
- `getItemParent(int i)` -> `Object`
- `getItemPosition(int i)` -> `int`
- `getItemViewType(int position)` -> `int`
- `getLastItemCount()` -> `int`
- `getResultLength()` -> `int`
- `getResultStartPosition()` -> `int`
- `getSearchResultBotContext()` -> `ArrayList<TLRPC.BotInlineResult>`
- `isBannedInline()` -> `boolean`
- `isBotCommands()` -> `boolean`
- `isBotContext()` -> `boolean`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `isGlobalHashtagHint(int position)` -> `boolean`
- `isLocalHashtagHint(int position)` -> `boolean`
- `isLongClickEnabled()` -> `boolean`
- `isMediaLayout()` -> `boolean`
- `isStickers()` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onDestroy()` -> `void`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `searchForContextBotForNextOffset()` -> `void`
- `searchUsernameOrHashtag(CharSequence charSequence, int position, ArrayList<MessageObject> messageObjects, boolean usernameOnly, boolean forSearch)` -> `void`
- `setAllowBots(boolean allowBots)` -> `void`
- `setAllowChats(boolean allowChats)` -> `void`
- `setAllowStickers(boolean allowStickers)` -> `void`
- `setBotInfo(LongSparseArray<TL_bots.BotInfo> info)` -> `void`
- `setBotsCount(int count)` -> `void`
- `setChatInfo(TLRPC.ChatFull chatInfo)` -> `void`
- `setDialogId(long dialogId)` -> `void`
- `setIsReversed(boolean isReversed)` -> `void`
- `setNeedBotContext(boolean value)` -> `void`
- `setNeedUsernames(boolean value)` -> `void`
- `setParentFragment(ChatActivity fragment)` -> `void`
- `setSearchInDialogs(boolean searchInDailogs)` -> `void`
- `setSearchingMentions(boolean value)` -> `void`
- `setUserOrChat(TLRPC.User user, TLRPC.Chat chat)` -> `void`

## `org.telegram.ui.Adapters.MentionsAdapter$HashtagHint`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(int type, String hashtag, TLRPC.Chat chat)` -> `void`

## `org.telegram.ui.Adapters.MessagesSearchAdapter`
- `attach()` -> `void`
- `detach()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getItem(int i)` -> `Object`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `searchStories(String query, boolean instant)` -> `void`
- `setStoriesList(StoriesController.SearchStoriesList storiesList)` -> `void`

## `org.telegram.ui.Adapters.MessagesSearchAdapter$StoriesView$Factory`
- `static asStoriesList(StoriesController.SearchStoriesList list)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `StoriesView`

## `org.telegram.ui.Adapters.PaddedListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `getPadding()` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `setPadding(int padding)` -> `void`
- `setPadding(GetPaddingRunnable getPaddingRunnable)` -> `void`

## `org.telegram.ui.Adapters.SearchAdapter`
- `getItem(int i)` -> `Object`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `isGlobalSearch(int i)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onSearchProgressChanged()` -> `void`
- `searchDialogs(final String query)` -> `void`
- `searchInProgress()` -> `boolean`
- `setUseUserCell(boolean value)` -> `void`

## `org.telegram.ui.Adapters.SearchAdapterHelper`
- `clear()` -> `void`
- `clearRecentHashtags()` -> `void`
- `filter(TLObject obj)` -> `boolean`
- `getGlobalSearch()` -> `ArrayList<TLObject>`
- `getGroupSearch()` -> `ArrayList<TLObject>`
- `getHashtags()` -> `ArrayList<HashtagObject>`
- `getLastFoundChannel()` -> `String`
- `getLocalServerSearch()` -> `ArrayList<TLObject>`
- `getPhoneSearch()` -> `ArrayList<Object>`
- `mergeExcludeResults()` -> `void`
- `mergeResults(ArrayList<Object> localResults)` -> `void`
- `mergeResults(ArrayList<Object> localResults, ArrayList<DialogsSearchAdapter.RecentSearchObject> recentResults)` -> `void`
- `queryServerSearch(String query, boolean allowUsername, boolean allowChats, boolean allowBots, boolean allowSelf, boolean canAddGroupsOnly, long channelId, boolean phoneNumbers, int type, int searchId)` -> `void`
- `queryServerSearch(String query, boolean allowUsername, boolean allowChats, boolean allowBots, boolean allowSelf, boolean canAddGroupsOnly, long channelId, boolean phoneNumbers, int type, int searchId, long exceptDialogId)` -> `void`
- `queryServerSearch(String query, boolean allowUsername, boolean allowChats, boolean allowBots, boolean allowSelf, boolean canAddGroupsOnly, long channelId, boolean phoneNumbers, int type, int searchId, long exceptDialogId, Runnable onEnd)` -> `void`
- `setAllowGlobalResults(boolean value)` -> `void`
- `setDelegate(SearchAdapterHelperDelegate searchAdapterHelperDelegate)` -> `void`
- `setHashtags(ArrayList<HashtagObject> arrayList, HashMap<String, HashtagObject> hashMap)` -> `void`
- `unloadRecentHashtags()` -> `void`

## `org.telegram.ui.Adapters.SearchAdapterHelper$SearchAdapterHelperDelegate`
- `getExcludeCallParticipants()` -> `default LongSparseArray<TLRPC.GroupCallParticipant>`
- `onSetHashtags(ArrayList<HashtagObject> arrayList, HashMap<String, HashtagObject> hashMap)` -> `default void`

## `org.telegram.ui.ArticleViewer`
- `allowTouches()` -> `boolean`
- `static appendA11yLabel(CharSequence content, int labelResId)` -> `CharSequence`
- `static buildAccessibilityText(IArticleViewer parent, WebpageAdapter adapter, DrawingText layout)` -> `CharSequence`
- `close(boolean byBackPress, boolean force)` -> `void`
- `static createLayoutForText(IArticleViewer parent, View parentView, CharSequence plainText, TL_iv.RichText richText, int width, int textY, TL_iv.PageBlock parentBlock, WebpageAdapter parentAdapter)` -> `DrawingText`
- `static createLayoutForText(IArticleViewer parent, View parentView, CharSequence plainText, TL_iv.RichText richText, int width, int textY, TL_iv.PageBlock parentBlock, Layout.Alignment align, int maxLines, WebpageAdapter parentAdapter)` -> `DrawingText`
- `static createPaint(IArticleViewer parent, boolean update)` -> `void`
- `destroy()` -> `void`
- `destroyArticleViewer()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static drawQuoteLines(Canvas canvas, IArticleViewer parent, TL_iv.PageBlock block, int height)` -> `void`
- `static drawTextSelection(IArticleViewer parent, Canvas canvas, TextSelectionHelper.ArticleSelectableView view)` -> `void`
- `static drawTextSelection(IArticleViewer parent, Canvas canvas, TextSelectionHelper.ArticleSelectableView view, int i)` -> `void`
- `getAdapter()` -> `WebpageAdapter`
- `getCurrentAccount()` -> `int`
- `getCurrentPageLayout()` -> `PageLayout`
- `getGrayTextColor()` -> `int`
- `static getInstance()` -> `ArticleViewer`
- `static getLastRichText(TL_iv.RichText richText)` -> `TL_iv.RichText`
- `getLastWebView()` -> `BotWebViewContainer.MyWebView`
- `getLinkTextColor()` -> `int`
- `static getPlainText(TL_iv.RichText richText)` -> `CharSequence`
- `getResources()` -> `Resources`
- `getResourcesProvider()` -> `Theme.ResourcesProvider`
- `static getText(IArticleViewer parent, WebpageAdapter adapter, View parentView, TL_iv.RichText parentRichText, TL_iv.RichText richText, TL_iv.PageBlock parentBlock, int maxWidth)` -> `CharSequence`
- `getTextColor()` -> `int`
- `static getTextFlags(TL_iv.RichText richText)` -> `int`
- `getTextSelectionHelper(View view)` -> `TextSelectionHelper.ArticleTextSelectionHelper`
- `getThemedColor(int key)` -> `int`
- `static getUrl(TL_iv.RichText richText)` -> `String`
- `handleLinkClick(WebpageAdapter adapter, TextPaintUrlSpan span)` -> `void`
- `isFirstArticle()` -> `boolean`
- `static isHeadingBlock(TL_iv.PageBlock block)` -> `boolean`
- `isLastArticle()` -> `boolean`
- `static isListItemBlock(TL_iv.PageBlock block)` -> `boolean`
- `isVisible()` -> `boolean`
- `static joinChannel(int currentAccount, final BlockChannelCell cell, final TLRPC.Chat channel)` -> `void`
- `static makeSheet(BaseFragment fragment)` -> `ArticleViewer`
- `open(MessageObject messageObject)` -> `boolean`
- `open(MessageObject messageObject, TLRPC.WebPage webpage)` -> `boolean`
- `open(TLRPC.TL_webPage webpage, String url)` -> `boolean`
- `open(String url)` -> `boolean`
- `open(String url, Browser.Progress progress)` -> `boolean`
- `openBookmark(String link)` -> `void`
- `openHistoryEntry(BrowserHistory.Entry entry)` -> `void`
- `openPhoto(TL_iv.PageBlock block, WebpageAdapter adapter)` -> `boolean`
- `openWebSettings()` -> `void`
- `openWebpageUrl(String url, String anchor, Browser.Progress progress)` -> `void`
- `scrollToAnchor(String anchor, boolean animated)` -> `boolean`
- `setOpener(BotWebViewContainer.MyWebView webView)` -> `void`
- `setParentActivity(Activity activity, BaseFragment fragment)` -> `void`
- `showDialog(Dialog dialog)` -> `void`
- `showSearchPanel(boolean show)` -> `void`
- `startCheckLongPress(float x, float y, View parentView)` -> `void`
- `updatePages()` -> `void`
- `static updatePaintColors(IArticleViewer parent)` -> `void`
- `updateThemeColors(float progress)` -> `void`
- `updateTitle(boolean animated)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockBlockquoteCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `getBoundLeft()` -> `int`
- `getBoundRight()` -> `int`
- `getLastLineBoundRight()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_iv.pageBlockBlockquote block)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockChannelCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_iv.pageBlockChannel block)` -> `void`
- `setState(int state, boolean animated)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockCollageCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_iv.pageBlockCollage block)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockCollageCell$GroupedMessages`
- `calculate()` -> `void`

## `org.telegram.ui.ArticleViewer$BlockDetailsBottomCell`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockDetailsCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `invalidateDrawable(Drawable drawable)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `scheduleDrawable(Drawable drawable, Runnable runnable, long l)` -> `void`
- `setBlock(TL_iv.pageBlockDetails block)` -> `void`
- `unscheduleDrawable(Drawable drawable, Runnable runnable)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockDividerCell`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockEmbedCell`
- `destroyWebView(boolean completely)` -> `void`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_iv.pageBlockEmbed block)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockEmbedCell$TelegramWebviewProxy`
- `postEvent(final String eventName, final String eventData)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockEmbedCell$TouchyWebView`
- `onTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.ui.ArticleViewer$BlockEmbedPostCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_iv.pageBlockEmbedPost block)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockFooterCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `getBoundLeft()` -> `int`
- `getBoundRight()` -> `int`
- `getLastLineBoundRight()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_iv.pageBlockFooter block)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockHeaderCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `getBoundLeft()` -> `int`
- `getBoundRight()` -> `int`
- `getLastLineBoundRight()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_iv.PageBlock block)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockKickerCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `getBoundLeft()` -> `int`
- `getBoundRight()` -> `int`
- `getLastLineBoundRight()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_iv.pageBlockKicker block)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockListItemCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `getBoundLeft()` -> `int`
- `getBoundRight()` -> `int`
- `getLastLineBoundRight()` -> `int`
- `invalidate()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_pageBlockListItem block)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockMapCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_iv.pageBlockMap block, boolean first, boolean last)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockMathCell`
- `getBoundLeft()` -> `int`
- `getBoundRight()` -> `int`
- `getLastLineBoundRight()` -> `int`
- `getMinWidth()` -> `int`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setBlock(TL_iv.pageBlockMath block)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.ArticleViewer$BlockOrderedListItemCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `getBoundLeft()` -> `int`
- `getBoundRight()` -> `int`
- `getLastLineBoundRight()` -> `int`
- `invalidate()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_pageBlockOrderedListItem block)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockParagraphCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `getBoundLeft()` -> `int`
- `getBoundRight()` -> `int`
- `getLastLineBoundRight()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_iv.pageBlockParagraph block)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockPhotoCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `getChannelCell()` -> `View`
- `getCurrentBlock()` -> `TL_iv.pageBlockPhoto`
- `getCurrentPage()` -> `TLObject`
- `getImageView()` -> `ImageReceiver`
- `getObserverTag()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onFailedDownload(String fileName, boolean canceled)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onProgressDownload(String fileName, long downloadSize, long totalSize)` -> `void`
- `onProgressUpload(String fileName, long uploadedSize, long totalSize, boolean isEncrypted)` -> `void`
- `onSuccessDownload(String fileName)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_iv.pageBlockPhoto block, TLObject page, Object parentObject, boolean calcHeight, boolean first)` -> `void`
- `setParentBlock(TL_iv.PageBlock block)` -> `void`
- `updateButtonState(boolean animated)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockPreformattedCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `getBoundLeft()` -> `int`
- `getBoundRight()` -> `int`
- `getLastLineBoundRight()` -> `int`
- `invalidate()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setBlock(TL_iv.pageBlockPreformatted block)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockPullquoteCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `getBoundLeft()` -> `int`
- `getBoundRight()` -> `int`
- `getLastLineBoundRight()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_iv.pageBlockPullquote block)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockRelatedArticlesCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setBlock(TL_pageBlockRelatedArticlesChild block, TLObject page)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockRelatedArticlesHeaderCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `getBoundLeft()` -> `int`
- `getBoundRight()` -> `int`
- `getLastLineBoundRight()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_iv.pageBlockRelatedArticles block)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockRelatedArticlesShadowCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockSlideshowCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_iv.pageBlockSlideshow block)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockSubheaderCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `getBoundLeft()` -> `int`
- `getBoundRight()` -> `int`
- `getLastLineBoundRight()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_iv.pageBlockSubheader block)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockSubtitleCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `getBoundLeft()` -> `int`
- `getBoundRight()` -> `int`
- `getLastLineBoundRight()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_iv.pageBlockSubtitle block)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockTableCell`
- `createTextLayout(TL_iv.pageTableCell cell, int maxWidth)` -> `DrawingText`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `getHalfLinePaint()` -> `Paint`
- `getHeaderPaint()` -> `Paint`
- `getLinePaint()` -> `Paint`
- `getStripPaint()` -> `Paint`
- `invalidate()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onLayoutChild(TableLayout.CellText text, int x, int y)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_iv.pageBlockTable block)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockTitleCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `getBoundLeft()` -> `int`
- `getBoundRight()` -> `int`
- `getLastLineBoundRight()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_iv.pageBlockTitle block)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockVideoCell`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `getChannelCell()` -> `View`
- `getCurrentBlock()` -> `TL_iv.pageBlockVideo`
- `getImageView()` -> `ImageReceiver`
- `getObserverTag()` -> `int`
- `getTextureView()` -> `TextureView`
- `isFirstFrameRendered()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onFailedDownload(String fileName, boolean canceled)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onProgressDownload(String fileName, long downloadSize, long totalSize)` -> `void`
- `onProgressUpload(String fileName, long uploadedSize, long totalSize, boolean isEncrypted)` -> `void`
- `onSuccessDownload(String fileName)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_iv.pageBlockVideo block, BlockVideoCellState state, boolean calcHeight, boolean first, boolean last)` -> `void`
- `setBlock(TL_iv.pageBlockVideo block, TLObject page, BlockVideoCellState state, boolean calcHeight, boolean first, boolean last)` -> `void`
- `setParentBlock(TL_iv.pageBlockChannel channelBlock, TL_iv.PageBlock block)` -> `void`
- `setState(BlockVideoCellState newState)` -> `BlockVideoCellState`
- `setVisibility(int visibility)` -> `void`
- `updateButtonState(boolean animated)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockVideoCellState`
- `static fromPlayer(VideoPlayerHolderBase player, BlockVideoCell videoCell)` -> `BlockVideoCellState`
- `static fromPlayer(VideoPlayer player, BlockVideoCell videoCell, TextureView textureView)` -> `BlockVideoCellState`
- `static fromPlayer(VideoPlayer player, BlockVideoCell videoCell, SurfaceView surfaceView)` -> `BlockVideoCellState`

## `org.telegram.ui.ArticleViewer$CachedWeb`
- `attach(PageLayout pageLayout)` -> `void`
- `detach(PageLayout pageLayout)` -> `void`
- `enrich(PageLayout pageLayout)` -> `void`
- `getTitle()` -> `String`

## `org.telegram.ui.ArticleViewer$CheckForLongPress`
- `run()` -> `void`

## `org.telegram.ui.ArticleViewer$CheckForTap`
- `run()` -> `void`

## `org.telegram.ui.ArticleViewer$DrawingText`
- `attach(View view)` -> `void`
- `detach(View view)` -> `void`
- `draw(Canvas canvas, View view)` -> `void`
- `getBoundLeft()` -> `int`
- `getBoundRight()` -> `int`
- `getHeight()` -> `int`
- `getLastLineBoundRight()` -> `int`
- `getLayout()` -> `Layout`
- `getLineAscent(int line)` -> `int`
- `getLineCount()` -> `int`
- `getLineLeft(int line)` -> `float`
- `getLineWidth(int line)` -> `float`
- `getParentView()` -> `View`
- `getPrefix()` -> `CharSequence`
- `getRow()` -> `int`
- `getText()` -> `CharSequence`
- `getWidth()` -> `int`
- `getX()` -> `int`
- `getY()` -> `int`
- `invalidateParent()` -> `void`
- `isAttached()` -> `boolean`
- `setRow(int row)` -> `void`
- `setX(int x)` -> `void`
- `setY(int y)` -> `void`

## `org.telegram.ui.ArticleViewer$ErrorContainer`
- `set(String botName, String description)` -> `void`
- `set(String url, int code, String description)` -> `void`
- `setDark(boolean dark, boolean animated)` -> `void`
- `setVisibility(int visibility)` -> `void`

## `org.telegram.ui.ArticleViewer$FontCell`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `select(boolean value, boolean animated)` -> `void`
- `setTextAndTypeface(String text, Typeface typeface)` -> `void`

## `org.telegram.ui.ArticleViewer$IBlock`
- `getMinWidth()` -> `default int`

## `org.telegram.ui.ArticleViewer$PageLayout`
- `back()` -> `void`
- `cleanup()` -> `void`
- `createErrorContainer()` -> `ErrorContainer`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getActionBarColor()` -> `int`
- `getAdapter()` -> `WebpageAdapter`
- `getBackgroundColor()` -> `int`
- `getListTop()` -> `float`
- `getListView()` -> `RecyclerListView`
- `getProgress()` -> `float`
- `getSubtitle()` -> `String`
- `getTitle()` -> `String`
- `getWebContainer()` -> `BotWebViewContainer`
- `getWebView()` -> `BotWebViewContainer.MyWebView`
- `isArticle()` -> `boolean`
- `isAtTop()` -> `boolean`
- `isLocal()` -> `boolean`
- `isTonsite()` -> `boolean`
- `isWeb()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `pause()` -> `void`
- `resume()` -> `void`
- `scrollToTop(boolean smooth)` -> `void`
- `setLastVisible(boolean lastVisible)` -> `void`
- `setTranslationX(float translationX)` -> `void`
- `setType(int type)` -> `void`
- `setWeb(CachedWeb web)` -> `void`
- `updateWeb()` -> `void`

## `org.telegram.ui.ArticleViewer$RealPageBlocksAdapter`
- `get(int index)` -> `TL_iv.PageBlock`
- `getAll()` -> `List<TL_iv.PageBlock>`
- `getCaption(int index)` -> `CharSequence`
- `getFile(int index)` -> `File`
- `getFileLocation(TLObject media, int[] size)` -> `TLRPC.PhotoSize`
- `getFileName(int index)` -> `String`
- `getItemsCount()` -> `int`
- `getMedia(int index)` -> `TLObject`
- `getParentObject()` -> `Object`
- `updateSlideshowCell(TL_iv.PageBlock currentPageBlock)` -> `void`

## `org.telegram.ui.ArticleViewer$ReportCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setViews(int count)` -> `void`

## `org.telegram.ui.ArticleViewer$Resources`
- `updatePaintColors(IArticleViewer parent)` -> `void`
- `updatePaintFonts(int selectedFont)` -> `void`

## `org.telegram.ui.ArticleViewer$ScrollEvaluator`
- `evaluate(float fraction, Integer startValue, Integer endValue)` -> `Integer`

## `org.telegram.ui.ArticleViewer$Sheet`
- `animateBackProgressTo(float to)` -> `ValueAnimator`
- `animateDismiss(boolean dismiss, boolean animated, Runnable callback)` -> `void`
- `animateOpen(boolean open, boolean animated, Runnable callback)` -> `void`
- `attachInternal(BaseFragment fragment)` -> `void`
- `attachedToParent()` -> `boolean`
- `dismiss()` -> `void`
- `dismiss(boolean tabs)` -> `void`
- `dismissInstant()` -> `void`
- `getActionBarColor()` -> `int`
- `getArticleViewer()` -> `ArticleViewer`
- `getBackProgress()` -> `float`
- `getBackgroundColor()` -> `int`
- `getBulletinFactory()` -> `BulletinFactory`
- `getEmptyPadding()` -> `int`
- `getNavigationBarColor(int color)` -> `int`
- `getWindowView()` -> `WindowView`
- `hadDialog()` -> `boolean`
- `halfSize()` -> `boolean`
- `onAttachedBackPressed()` -> `boolean`
- `release()` -> `void`
- `reset()` -> `void`
- `restoreState(BaseFragment fragment, BottomSheetTabs.WebTabData tab)` -> `boolean`
- `setBackProgress(float progress)` -> `void`
- `setContainerView(View containerView)` -> `void`
- `setDialog(BottomSheetTabDialog dialog)` -> `boolean`
- `setKeyboardHeightFromParent(int keyboardHeight)` -> `void`
- `setLastVisible(boolean lastVisible)` -> `void`
- `setOnDismissListener(Runnable onDismiss)` -> `void`
- `show()` -> `void`
- `showDialog(Dialog dialog)` -> `boolean`
- `updateLastVisible()` -> `void`
- `updateTranslation()` -> `void`

## `org.telegram.ui.ArticleViewer$Sheet$WindowView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawInto(Canvas canvas, RectF finalRect, float progress, RectF clipRect, float alpha, boolean opening)` -> `float`
- `getRect()` -> `RectF`
- `isVisible()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onNestedFling(View target, float velocityX, float velocityY, boolean consumed)` -> `boolean`
- `onNestedPreFling(View target, float velocityX, float velocityY)` -> `boolean`
- `onNestedPreScroll(View target, int dx, int dy, int[] consumed)` -> `void`
- `onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed)` -> `void`
- `onNestedScrollAccepted(View child, View target, int axes)` -> `void`
- `onStartNestedScroll(View child, View target, int nestedScrollAxes)` -> `boolean`
- `onStopNestedScroll(View child)` -> `void`
- `setDrawingFromOverlay(boolean value)` -> `void`

## `org.telegram.ui.ArticleViewer$TextSizeCell`
- `invalidate()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.ArticleViewer$WebPageUtils`
- `static getDocumentWithId(TLObject page, long id)` -> `TLRPC.Document`
- `static getDocumentWithId(TL_iv.RichMessage richMessage, long id)` -> `TLRPC.Document`
- `static getDocumentWithId(TLRPC.WebPage page, long id)` -> `TLRPC.Document`
- `static getMedia(TLObject page, TL_iv.PageBlock block)` -> `TLObject`
- `static getMedia(TL_iv.RichMessage page, TL_iv.PageBlock block)` -> `TLObject`
- `static getMedia(TLRPC.WebPage page, TL_iv.PageBlock block)` -> `TLObject`
- `static getMediaFile(TLObject page, TL_iv.PageBlock block)` -> `File`
- `static getMediaFile(TLRPC.WebPage page, TL_iv.PageBlock block)` -> `File`
- `static getMediaFile(TL_iv.RichMessage page, TL_iv.PageBlock block)` -> `File`
- `static getPhotoWithId(TLObject page, long id)` -> `TLRPC.Photo`
- `static getPhotoWithId(TL_iv.RichMessage page, long id)` -> `TLRPC.Photo`
- `static getPhotoWithId(TL_iv.Page page, long id)` -> `TLRPC.Photo`
- `static getPhotoWithId(TLRPC.WebPage page, long id)` -> `TLRPC.Photo`

## `org.telegram.ui.ArticleViewer$WebpageAdapter`
- `calculateContentHeight()` -> `void`
- `getItem(int position)` -> `TL_iv.PageBlock`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `notifyItemChanged(int position)` -> `void`
- `notifyItemChanged(int position, Object payload)` -> `void`
- `notifyItemInserted(int position)` -> `void`
- `notifyItemMoved(int fromPosition, int toPosition)` -> `void`
- `notifyItemRangeChanged(int positionStart, int itemCount)` -> `void`
- `notifyItemRangeChanged(int positionStart, int itemCount, Object payload)` -> `void`
- `notifyItemRangeInserted(int positionStart, int itemCount)` -> `void`
- `notifyItemRangeRemoved(int positionStart, int itemCount)` -> `void`
- `notifyItemRemoved(int position)` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(RecyclerView.ViewHolder holder)` -> `void`
- `resetCachedHeights()` -> `void`

## `org.telegram.ui.ArticleViewer$WebpageListView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent e)` -> `boolean`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onScrolled(int dx, int dy)` -> `void`
- `onTouchEvent(MotionEvent e)` -> `boolean`

## `org.telegram.ui.ArticleViewer$WindowView`
- `dispatchApplyWindowInsets(WindowInsets insets)` -> `WindowInsets`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchKeyEventPreIme(KeyEvent event)` -> `boolean`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getAlpha()` -> `float`
- `getInnerTranslationX()` -> `float`
- `handleTouchEvent(MotionEvent event)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setAlpha(float value)` -> `void`
- `setInnerTranslationX(float value)` -> `void`

## `org.telegram.ui.AspectRatioFrameLayout`
- `getAspectRatio()` -> `float`
- `getVideoRotation()` -> `int`
- `isDrawingReady()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAspectRatio(float widthHeightRatio, int rotation)` -> `void`
- `setAspectRatioListener(AspectRatioListener listener)` -> `void`
- `setDrawingReady(boolean value)` -> `void`
- `setResizeMode(@ResizeMode int resizeMode)` -> `void`

## `org.telegram.ui.AspectRatioFrameLayout$AspectRatioUpdateDispatcher`
- `run()` -> `void`

## `org.telegram.ui.AutoDeleteMessagesActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`

## `org.telegram.ui.AvatarPreviewPagerIndicator`
- `getProfileGalleryView()` -> `ProfileGalleryView`
- `onDown(boolean left)` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onPhotosLoaded()` -> `void`
- `onRelease()` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `onVideoSet()` -> `void`
- `setAlphaValue(float value, boolean self)` -> `void`
- `setProfileGalleryView(ProfileGalleryView profileGalleryView)` -> `void`

## `org.telegram.ui.AvatarPreviewer`
- `close()` -> `void`
- `static getInstance()` -> `AvatarPreviewer`
- `onTouchEvent(MotionEvent event)` -> `void`
- `show(ViewGroup parentContainer, Theme.ResourcesProvider resourcesProvider, Data data, Callback callback)` -> `void`

## `org.telegram.ui.AvatarPreviewer$AvatarView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `getShowProgress()` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `setImage(int currentAccount, ImageLocation mediaLocation, String mediaFilter, ImageLocation imageLocation, String imageFilter, ImageLocation thumbLocation, String thumbFilter, BitmapDrawable thumb, Object parentObject)` -> `void`
- `setProgress(float progress)` -> `void`
- `setShowProgress(boolean showProgress)` -> `void`

## `org.telegram.ui.AvatarPreviewer$ChatInfoLoadTask`
- `onReceiveNotification(Object... args)` -> `void`

## `org.telegram.ui.AvatarPreviewer$Data`
- `static of(TLRPC.User user, int classGuid, MenuItem... menuItems)` -> `Data`
- `static of(TLRPC.User user, TLRPC.UserFull userFull, MenuItem... menuItems)` -> `Data`
- `static of(TLRPC.Chat chat, int classGuid, MenuItem... menuItems)` -> `Data`
- `static of(TLRPC.Chat chat, TLRPC.ChatFull chatFull, MenuItem... menuItems)` -> `Data`

## `org.telegram.ui.AvatarPreviewer$InfoLoadTask`
- `onResult(B result)` -> `void`

## `org.telegram.ui.AvatarPreviewer$Layout`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchKeyEvent(KeyEvent event)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `recycle()` -> `void`
- `setData(Data data)` -> `void`

## `org.telegram.ui.AvatarPreviewer$UserInfoLoadTask`
- `onReceiveNotification(Object... args)` -> `void`

## `org.telegram.ui.AvatarSpan`
- `draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, @NonNull Paint paint)` -> `void`
- `getSize(@NonNull Paint paint, CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm)` -> `int`
- `setDialogId(long dialogId)` -> `void`
- `setImageDrawable(Drawable drawable)` -> `void`
- `setName(String name)` -> `void`
- `setObject(TLObject obj)` -> `void`
- `setParent(View parent)` -> `void`
- `setSize(float sz)` -> `void`
- `translate(float x, float y)` -> `void`

## `org.telegram.ui.BadWayToMakeButtonRound`
- `static round(View view)` -> `void`

## `org.telegram.ui.BasePermissionsActivity`
- `createPermissionErrorAlert(@RawRes int animationId, String message)` -> `AlertDialog`

## `org.telegram.ui.BoostsActivity`
- `createAdapter()` -> `RecyclerView.Adapter<?>`
- `createEmptyView(Context context)` -> `void`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `setBoostsStatus(TL_stories.TL_premium_boostsStatus boostsStatus)` -> `void`
- `updateRows(boolean animated)` -> `void`

## `org.telegram.ui.BoostsActivity$HeaderButtonView`
- `draw(Canvas canvas)` -> `void`
- `setTextAndIcon(CharSequence text, int icon)` -> `void`

## `org.telegram.ui.BoostsActivity$ItemInternal`
- `equals(Object o)` -> `boolean`

## `org.telegram.ui.BubbleActivity`
- `needCloseLastFragment(INavigationLayout layout)` -> `boolean`
- `onActivityResult(int requestCode, int resultCode, Intent data)` -> `void`
- `onBackPressed()` -> `void`
- `onConfigurationChanged(@NonNull android.content.res.Configuration newConfig)` -> `void`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `onDestroy()` -> `void`
- `onLowMemory()` -> `void`
- `onNewIntent(Intent intent)` -> `void`
- `onPause()` -> `void`
- `onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `presentFragment(BaseFragment fragment)` -> `void`
- `presentFragment(final BaseFragment fragment, final boolean removeLast, boolean forceWithoutAnimation)` -> `boolean`

## `org.telegram.ui.Business.AwayMessagesActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `isSupportEdgeToEdge()` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`

## `org.telegram.ui.Business.BusinessBotButton`
- `setLeftMargin(float leftMargin)` -> `void`

## `org.telegram.ui.Business.BusinessChatbotController`
- `static getInstance(int num)` -> `BusinessChatbotController`
- `getValue()` -> `TL_account.connectedBots`
- `invalidate(boolean reload)` -> `void`
- `notifyUpdate()` -> `void`

## `org.telegram.ui.Business.BusinessIntroActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTitle()` -> `CharSequence`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onClick(UItem item, View view, int position, float x, float y)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onLongClick(UItem item, View view, int position, float x, float y)` -> `boolean`

## `org.telegram.ui.Business.BusinessLinksActivity`
- `static closeRenameAlert(boolean invoked)` -> `boolean`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTitle()` -> `CharSequence`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onClick(UItem item, View view, int position, float x, float y)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onLongClick(UItem item, View view, int position, float x, float y)` -> `boolean`
- `static openRenameAlert(Context context, int currentAccount, TL_account.TL_businessChatLink link, Theme.ResourcesProvider resourcesProvider, boolean forceNotAdaptive)` -> `void`

## `org.telegram.ui.Business.BusinessLinksActivity$BusinessLinkView`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(BusinessLinkWrapper linkWrapper, boolean needDivider)` -> `void`

## `org.telegram.ui.Business.BusinessLinksActivity$BusinessLinkWrapper`
- `equals(Object o)` -> `boolean`

## `org.telegram.ui.Business.BusinessLinksController`
- `createEmptyLink()` -> `void`
- `findLink(String slug)` -> `TL_account.TL_businessChatLink`
- `static getInstance(int num)` -> `BusinessLinksController`
- `static stripHttps(String link)` -> `String`

## `org.telegram.ui.Business.BusinessRecipientsHelper`
- `doNotExcludeNewChats()` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter, boolean enabled)` -> `void`
- `getBotInputValue()` -> `TL_account.TL_inputBusinessBotRecipients`
- `getBotValue()` -> `TL_account.TL_businessBotRecipients`
- `getFlags()` -> `int`
- `getInputValue()` -> `TL_account.TL_inputBusinessRecipients`
- `getValue()` -> `TL_account.TL_businessRecipients`
- `onClick(UItem item)` -> `boolean`
- `setExclude(boolean value)` -> `void`
- `setValue(TL_account.TL_businessRecipients recipients)` -> `void`
- `setValue(TL_account.TL_businessBotRecipients recipients)` -> `void`
- `validate(UniversalRecyclerView listView)` -> `boolean`

## `org.telegram.ui.Business.ChatbotSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `getTitle()` -> `CharSequence`
- `onActionBarAlpha(float alpha)` -> `void`

## `org.telegram.ui.Business.ChatbotsActivity`
- `createView(Context context)` -> `View`
- `isSupportEdgeToEdge()` -> `boolean`
- `notSelectedBot()` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onInsets(int left, int top, int right, int bottom)` -> `void`

## `org.telegram.ui.Business.GreetMessagesActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `isSupportEdgeToEdge()` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`

## `org.telegram.ui.Business.LocationActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `isSupportEdgeToEdge()` -> `boolean`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`

## `org.telegram.ui.Business.OpeningHoursActivity`
- `static adaptWeeklyOpen(ArrayList<TL_account.TL_businessWeeklyOpen> hours, int utc_offset)` -> `ArrayList<TL_account.TL_businessWeeklyOpen>`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static fromDaysHours(ArrayList<Period>[] days)` -> `ArrayList<TL_account.TL_businessWeeklyOpen>`
- `static getDaysHours(ArrayList<TL_account.TL_businessWeeklyOpen> hours)` -> `ArrayList<Period>[]`
- `static is24x7(TL_account.TL_businessWorkHours hours)` -> `boolean`
- `static isFull(ArrayList<Period> periods)` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `static toString(int currentAccount, TLRPC.User user, TL_account.TL_businessWorkHours business_work_hours)` -> `String`

## `org.telegram.ui.Business.OpeningHoursActivity$Period`
- `static timeToString(int time)` -> `String`
- `static timeToString(int time, boolean includeNextDay)` -> `String`
- `toString()` -> `String`

## `org.telegram.ui.Business.OpeningHoursDayActivity`
- `createView(Context context)` -> `View`
- `onApplied(Runnable whenApplied)` -> `OpeningHoursDayActivity`
- `onBecomeFullyHidden()` -> `void`
- `onDone(Runnable whenDone)` -> `OpeningHoursDayActivity`
- `onFragmentDestroy()` -> `void`

## `org.telegram.ui.Business.QuickRepliesActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `isSupportEdgeToEdge()` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `static openRenameReplyAlert(Context context, int currentAccount, String currentName, QuickRepliesController.QuickReply currentReply, Theme.ResourcesProvider resourcesProvider, boolean forceNotAdaptive, Utilities.Callback<String> whenDone)` -> `void`

## `org.telegram.ui.Business.QuickRepliesActivity$LargeQuickReplyView`
- `invalidateEmojis()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(QuickRepliesController.QuickReply quickReply, boolean divider)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`

## `org.telegram.ui.Business.QuickRepliesActivity$MoreSpan`
- `draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, @NonNull Paint paint)` -> `void`
- `getSize()` -> `int`
- `getSize(@NonNull Paint paint, CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm)` -> `int`
- `static of(int count, int[] width)` -> `CharSequence`

## `org.telegram.ui.Business.QuickRepliesActivity$QuickReplyView`
- `invalidateEmojis()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(QuickRepliesController.QuickReply quickReply, String highlight, boolean divider)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setReorder(boolean reorder)` -> `void`

## `org.telegram.ui.Business.QuickRepliesController`
- `findLocalReply(long topicId)` -> `QuickReply`
- `findLocalReply(String name)` -> `QuickReply`
- `findReply(long topicId)` -> `QuickReply`
- `findReply(String name)` -> `QuickReply`
- `getFilteredReplies()` -> `ArrayList<QuickReply>`
- `static getInstance(int num)` -> `QuickRepliesController`
- `getTopicId(String quick_shortcut)` -> `long`
- `renameReply(int topicId, String name)` -> `void`
- `reorder()` -> `void`

## `org.telegram.ui.Business.QuickRepliesEmptyView$DotTextView`
- `dispatchDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.Business.TimezoneSelector`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `isSupportEdgeToEdge()` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `setValue(String timezoneKey)` -> `TimezoneSelector`
- `whenSelected(Utilities.Callback<String> selected)` -> `TimezoneSelector`

## `org.telegram.ui.Business.TimezonesController`
- `findTimezone(String id)` -> `TLRPC.TL_timezone`
- `static getInstance(int num)` -> `TimezonesController`
- `getSystemTimezoneId()` -> `String`
- `getTimezoneName(TLRPC.TL_timezone timezone, boolean withOffset)` -> `String`
- `getTimezoneName(String id, boolean withOffset)` -> `String`
- `getTimezoneOffsetName(TLRPC.TL_timezone timezone)` -> `String`
- `getTimezones()` -> `ArrayList<TLRPC.TL_timezone>`

## `org.telegram.ui.CacheChatsExceptionsFragment`
- `createView(Context context)` -> `View`
- `onFragmentCreate()` -> `boolean`
- `setExceptions(ArrayList<CacheByChatsController.KeepMediaException> notificationsExceptionTopics)` -> `void`
- `showPopupFor(CacheByChatsController.KeepMediaException newException)` -> `void`

## `org.telegram.ui.CacheChatsExceptionsFragment$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.CacheChatsExceptionsFragment$Item`
- `equals(Object o)` -> `boolean`

## `org.telegram.ui.CacheControlActivity`
- `static calculateTotalSize(Utilities.Callback<Long> onDone)` -> `void`
- `static cleanDirJava(String fileName, int docType, int[] p, Utilities.Callback<Float> onProgress)` -> `void`
- `static countDirJava(String fileName, int docType)` -> `int`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `fillDialogsEntitiesRecursive(final File fromFolder, int type, LongSparseArray<DialogFileEntities> dilogsFilesEntities, CacheModel cacheModel)` -> `void`
- `static getDeviceTotalSize(Utilities.Callback2<Long, Long> onDone)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isLightStatusBar()` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `needDelayOpenAnimation()` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationProgress(boolean isOpen, float progress)` -> `void`
- `static resetCalculatedTotalSIze()` -> `void`
- `scrollTo()` -> `void`
- `setCacheModel(CacheModel cacheModel)` -> `void`

## `org.telegram.ui.CacheControlActivity$CacheChartHeader`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setData(boolean hasCache, float percent, float usedPercent)` -> `void`

## `org.telegram.ui.CacheControlActivity$ClearCacheButton`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setDisabled(boolean disabled)` -> `void`
- `setSize(boolean allSelected, long size)` -> `void`

## `org.telegram.ui.CacheControlActivity$ClearCacheButtonInternal`
- `updateSize()` -> `void`

## `org.telegram.ui.CacheControlActivity$ClearingCacheView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setProgress(float t)` -> `void`

## `org.telegram.ui.CacheControlActivity$ClearingCacheView$ProgressView`
- `onDraw(Canvas canvas)` -> `void`
- `setProgress(float t)` -> `void`

## `org.telegram.ui.CacheControlActivity$DialogFileEntities`
- `createCacheModel()` -> `CacheModel`
- `merge(DialogFileEntities dialogEntities)` -> `void`

## `org.telegram.ui.CacheControlActivity$ItemInner`
- `static asCheckBox(CharSequence text, int index, long size, int colorKey)` -> `ItemInner`
- `static asCheckBox(CharSequence text, int index, long size, int colorKey, boolean last)` -> `ItemInner`
- `static asInfo(String text)` -> `ItemInner`
- `equals(Object o)` -> `boolean`

## `org.telegram.ui.CacheControlActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.CachedMediaLayout`
- `actionModeIsVisible()` -> `boolean`
- `static fileIsMedia(File file)` -> `boolean`
- `getListView()` -> `RecyclerListView`
- `isAttached()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setBottomPadding(int padding)` -> `void`
- `setCacheModel(CacheModel cacheModel)` -> `void`
- `setDelegate(Delegate delegate)` -> `void`
- `showActionMode(boolean show)` -> `void`
- `update()` -> `void`
- `updateVisibleRows()` -> `void`

## `org.telegram.ui.CachedMediaLayout$BaseAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `getPhotos()` -> `ArrayList<Object>`

## `org.telegram.ui.CachedMediaLayout$BaseFilesAdapter`
- `update()` -> `void`

## `org.telegram.ui.CachedMediaLayout$BasePlaceProvider`
- `getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int index, boolean needPreview, boolean closing)` -> `PhotoViewer.PlaceProviderObject`
- `setRecyclerListView(RecyclerListView recyclerListView)` -> `void`

## `org.telegram.ui.CachedMediaLayout$CacheCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onCheckBoxPressed()` -> `void`

## `org.telegram.ui.CachedMediaLayout$Delegate`
- `dismiss()` -> `default void`

## `org.telegram.ui.CachedMediaLayout$DocumentsAdapter`
- `getPhotos()` -> `ArrayList<Object>`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `update()` -> `void`

## `org.telegram.ui.CachedMediaLayout$ItemInner`
- `equals(Object o)` -> `boolean`

## `org.telegram.ui.CachedMediaLayout$MediaAdapter`
- `getPhotos()` -> `ArrayList<Object>`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `update()` -> `void`

## `org.telegram.ui.CachedMediaLayout$MusicAdapter`
- `createPlaylist()` -> `ArrayList<MessageObject>`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.CachedStaticLayout`
- `disableCache()` -> `CachedStaticLayout`
- `draw(Canvas canvas)` -> `void`
- `getHeight()` -> `int`
- `getLineBottom(int line)` -> `int`
- `getLineCount()` -> `int`
- `getLineEnd(int line)` -> `int`
- `getLineLeft(int line)` -> `float`
- `getLineRight(int line)` -> `float`
- `getLineStart(int line)` -> `int`
- `getLineTop(int line)` -> `int`
- `getLineWidth(int line)` -> `float`
- `getPaint()` -> `TextPaint`
- `getPrimaryHorizontal(int x)` -> `float`
- `getText()` -> `CharSequence`
- `getWidth()` -> `int`

## `org.telegram.ui.CalendarActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isLightStatusBar()` -> `boolean`
- `needDelayOpenAnimation()` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `onTransitionAnimationProgress(boolean isOpen, float progress)` -> `void`
- `onTransitionAnimationStart(boolean isOpen, boolean backward)` -> `void`
- `setCallback(Callback callback)` -> `void`
- `setChatActivity(ChatActivity chatActivity)` -> `void`

## `org.telegram.ui.CalendarActivity$CalendarAdapter`
- `getItemCount()` -> `int`
- `getItemId(int position)` -> `long`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.CalendarActivity$MonthView`
- `animateRow(int row, int startColumn, int endColumn, boolean appear, boolean animate)` -> `void`
- `dismissRowAnimations(boolean animate)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setDate(int year, int monthInYear, SparseArray<PeriodDay> messagesByDays, boolean animated)` -> `void`

## `org.telegram.ui.CastSync`
- `static doSyncVolume(boolean sync)` -> `void`
- `static getClient()` -> `RemoteMediaClient`
- `static getContext()` -> `Context`
- `static getDeviceVolume()` -> `float`
- `static getPosition()` -> `long`
- `static getSpeed()` -> `float`
- `static getVolume()` -> `float`
- `static seekTo(long position)` -> `void`
- `static setPlaying(boolean play)` -> `void`
- `static setSpeed(float speed)` -> `void`
- `static setVolume(float volume)` -> `void`
- `static stop()` -> `void`
- `static syncInterface()` -> `void`
- `static syncPosition(long position)` -> `void`

## `org.telegram.ui.Cells.AboutLinkCell`
- `didExtend()` -> `void`
- `didPressUrl(String url, Browser.Progress progress)` -> `void`
- `didResizeEnd()` -> `void`
- `didResizeStart()` -> `void`
- `draw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `onClick()` -> `boolean`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setMoreButtonDisabled(boolean moreButtonDisabled)` -> `void`
- `setText(String text, boolean parseLinks)` -> `void`
- `setTextAndValue(String text, String value, boolean parseLinks)` -> `void`
- `updateCollapse(boolean value, boolean animated)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Cells.AboutLinkCell$SpringInterpolator`
- `getValue(float deltaTime)` -> `float`

## `org.telegram.ui.Cells.AccountSelectCell`
- `getAccountNumber()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAccount(int account, boolean check)` -> `void`
- `setObject(TLObject object)` -> `void`

## `org.telegram.ui.Cells.AdminedChannelCell`
- `getCurrentChannel()` -> `TLRPC.Chat`
- `getDeleteButton()` -> `ImageView`
- `getNameTextView()` -> `SimpleTextView`
- `getStatusTextView()` -> `SimpleTextView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChannel(TLRPC.Chat channel, boolean last)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `update()` -> `void`

## `org.telegram.ui.Cells.AppIconsSelectorCell`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthSpec, int heightSpec)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`

## `org.telegram.ui.Cells.AppIconsSelectorCell$AdaptiveIconImageView`
- `draw(Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `setBackgroundOuterPadding(int backgroundOuterPadding)` -> `void`
- `setForeground(int res)` -> `void`
- `setOuterPadding(int outerPadding)` -> `void`
- `setPadding(int padding)` -> `void`

## `org.telegram.ui.Cells.AppIconsSelectorCell$IconHolderView`
- `draw(Canvas canvas)` -> `void`

## `org.telegram.ui.Cells.ArchiveHintCell`
- `getViewPager()` -> `ViewPager`
- `invalidate()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Cells.ArchiveHintCell$Adapter`
- `destroyItem(ViewGroup container, int position, Object object)` -> `void`
- `getCount()` -> `int`
- `instantiateItem(ViewGroup container, int position)` -> `Object`
- `restoreState(Parcelable arg0, ClassLoader arg1)` -> `void`
- `setPrimaryItem(ViewGroup container, int position, Object object)` -> `void`
- `unregisterDataSetObserver(DataSetObserver observer)` -> `void`

## `org.telegram.ui.Cells.BaseCell`
- `getBoundsLeft()` -> `int`
- `getBoundsRight()` -> `int`
- `invalidate()` -> `void`
- `invalidateLite()` -> `void`
- `listenInvalidate(Runnable callback)` -> `void`
- `onLongPress()` -> `boolean`
- `static setDrawableBounds(Drawable drawable, int x, int y)` -> `void`
- `static setDrawableBounds(Drawable drawable, float x, float y)` -> `void`
- `static setDrawableBounds(Drawable drawable, float x, float y, float h)` -> `float`
- `static setDrawableBounds(Drawable drawable, int x, int y, int w, int h)` -> `void`
- `static setDrawableBounds(Drawable drawable, float x, float y, int w, int h)` -> `void`
- `startCheckLongPress()` -> `void`

## `org.telegram.ui.Cells.BaseCell$CheckForLongPress`
- `run()` -> `void`

## `org.telegram.ui.Cells.BaseCell$CheckForTap`
- `run()` -> `void`

## `org.telegram.ui.Cells.BaseCell$RippleDrawableSafe`
- `draw(@NonNull Canvas canvas)` -> `void`

## `org.telegram.ui.Cells.BotAskCell`
- `getSideMenuWidth()` -> `int`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setDialogId(long dialogId)` -> `void`
- `setVisiblePart(float visibleTop, int parentH)` -> `void`

## `org.telegram.ui.Cells.BotAskCellDrawable`
- `draw(Canvas canvas)` -> `void`
- `getBubbleHeight()` -> `int`
- `getBubbleWidth()` -> `int`
- `getOpacity()` -> `int`
- `onBoundsChange(@NonNull Rect bounds)` -> `void`
- `set(long dialogId)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Cells.BotButton`
- `getPressScale()` -> `float`
- `setPressed(boolean pressed)` -> `void`

## `org.telegram.ui.Cells.BotHelpCell`
- `animating()` -> `boolean`
- `getSideMenuWidth()` -> `int`
- `getText()` -> `CharSequence`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setAnimating(boolean animating)` -> `void`
- `setDelegate(BotHelpCellDelegate botHelpCellDelegate)` -> `void`
- `setText(boolean bot, String text)` -> `void`
- `setText(boolean bot, long botId, String text, TLObject imageOrAnimation, TL_bots.BotInfo botInfo, String managerBotName)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Cells.BotHelpCell$BotIntroDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Cells.BotSwitchCell`
- `getTextView()` -> `TextView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setText(String text)` -> `void`

## `org.telegram.ui.Cells.BrightnessControlCell`
- `didChangedValue(float value)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `performAccessibilityAction(int action, Bundle arguments)` -> `boolean`
- `setProgress(float value)` -> `void`

## `org.telegram.ui.Cells.ChannelRecommendationsCell`
- `computeScroll()` -> `void`
- `didClickChannel(TLObject chat, boolean longPress)` -> `void`
- `didClickClose()` -> `void`
- `draw(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `update()` -> `void`

## `org.telegram.ui.Cells.ChannelRecommendationsCell$ChannelBlock`
- `attach()` -> `void`
- `static avatarSize()` -> `int`
- `detach()` -> `void`
- `draw(Canvas canvas, int width, float alpha)` -> `void`
- `drawText(Canvas canvas, int width, float alpha)` -> `void`
- `static fillPath(Path path, int width, float x)` -> `void`
- `static height()` -> `int`

## `org.telegram.ui.Cells.ChatActionCell`
- `animateWalletActionHighlight()` -> `void`
- `didPressReactionFromLayout(TLRPC.ReactionCount reaction, boolean longpress, float x, float y)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `drawBackground(Canvas canvas, boolean fromParent)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `drawOutboundsContent(Canvas canvas)` -> `void`
- `drawReactions(Canvas canvas, boolean fromParent, Integer only)` -> `void`
- `drawReactionsLayout(Canvas canvas, boolean fromParent, Integer only)` -> `void`
- `drawReactionsLayoutOverlay(Canvas canvas, boolean fromParent)` -> `void`
- `drawScrimReaction(Canvas canvas, Integer scrimViewReaction, float progress, boolean direction)` -> `void`
- `drawScrimReactionPreview(View view, Canvas canvas, int offset, Integer scrimViewReaction, float progress)` -> `void`
- `getBoundsLeft()` -> `int`
- `getBoundsRight()` -> `int`
- `getCustomDate()` -> `int`
- `getDelegate()` -> `ChatActionCellDelegate`
- `getDeltaBottom()` -> `float`
- `getDeltaLeft()` -> `float`
- `getDeltaRight()` -> `float`
- `getDeltaTop()` -> `float`
- `getMessageObject()` -> `MessageObject`
- `getObserverTag()` -> `int`
- `getPhotoImage()` -> `ImageReceiver`
- `getReactionButton(ReactionsLayoutInBubble.VisibleReaction visibleReaction)` -> `ReactionsLayoutInBubble.ReactionButton`
- `getReactionsLayout()` -> `ReactionsLayoutInBubble`
- `getThemedPaint(String paintKey)` -> `Paint`
- `getTransitionParams()` -> `TransitionParams`
- `getWalletSlidingOffset()` -> `float`
- `hasGradientService()` -> `boolean`
- `invalidate()` -> `void`
- `invalidate(Rect dirty)` -> `void`
- `invalidate(int l, int t, int r, int b)` -> `void`
- `invalidateOutbounds()` -> `void`
- `isCellAttachedToWindow()` -> `boolean`
- `isFloating()` -> `boolean`
- `measuredWidth()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onFailedDownload(String fileName, boolean canceled)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onLongPress()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onProgressDownload(String fileName, long downloadSize, long totalSize)` -> `void`
- `onProgressUpload(String fileName, long downloadSize, long totalSize, boolean isEncrypted)` -> `void`
- `onSuccessDownload(String fileName)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `playWalletReceiveAnimation(float visibleTop, float visibleBottom, Runnable onEnd)` -> `boolean`
- `setCustomDate(int date, boolean scheduled, boolean inLayout)` -> `void`
- `setCustomText(CharSequence text)` -> `void`
- `setDelegate(ChatActionCellDelegate delegate)` -> `void`
- `setInvalidateColors(boolean invalidate)` -> `void`
- `setInvalidateListener(Runnable listener)` -> `void`
- `setInvalidateWithParent(View viewToInvalidate)` -> `void`
- `setInvalidatesParent(boolean value)` -> `void`
- `setMessageObject(MessageObject messageObject)` -> `void`
- `setMessageObject(MessageObject messageObject, boolean force)` -> `void`
- `setOnActionClickListener(@Nullable OnClickListener l)` -> `void`
- `setOverrideColor(int background, int text)` -> `void`
- `setOverrideTextMaxWidth(int width)` -> `void`
- `setScrimReaction(Integer scrimViewReaction)` -> `void`
- `setShowTopic(boolean show)` -> `void`
- `setSpoilersSuppressed(boolean s)` -> `void`
- `setVisiblePart(float visibleTop, int parentH)` -> `void`
- `setVisiblePart(float visibleTop, float tx, int parentH, float dimAmount)` -> `void`
- `setWalletSlidingOffset(float offset)` -> `void`
- `showingCancelButton()` -> `boolean`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Cells.ChatActionCell$ChatActionCellDelegate`
- `didClickButton(ChatActionCell cell)` -> `default void`
- `didClickImage(ChatActionCell cell)` -> `default void`
- `didLongPress(ChatActionCell cell, float x, float y)` -> `default boolean`
- `didOpenPremiumGift(ChatActionCell cell, TLRPC.TL_premiumGiftOption giftOption, String slug, boolean animateConfetti)` -> `default void`
- `didOpenPremiumGiftChannel(ChatActionCell cell, String slug, boolean animateConfetti)` -> `default void`
- `didPressBotButton(MessageObject messageObject, TL_keyboard.KeyboardButtonProto button)` -> `default void`
- `didPressReaction(ChatActionCell cell, TLRPC.ReactionCount reaction, boolean longpress, float x, float y)` -> `default void`
- `didPressReplyMessage(ChatActionCell cell, int id)` -> `default void`
- `didPressTaskLink(ChatActionCell cell, int id, int taskId)` -> `default void`
- `forceUpdate(ChatActionCell cell, boolean anchorScroll)` -> `default void`
- `getBaseFragment()` -> `default BaseFragment`
- `getTopicId()` -> `default long`
- `needOpenInviteLink(TLRPC.TL_chatInviteExported invite)` -> `default void`
- `needOpenUserProfile(long uid)` -> `default void`
- `needShowEffectOverlay(ChatActionCell cell, TLRPC.Document document, TLRPC.VideoSize videoSize)` -> `default void`
- `onTopicClick(ChatActionCell cell)` -> `default void`

## `org.telegram.ui.Cells.ChatActionCell$TextLayout`
- `attach()` -> `void`
- `detach()` -> `void`
- `setText(CharSequence text, TextPaint textPaint, int width)` -> `void`

## `org.telegram.ui.Cells.ChatActionCell$TransitionParams`
- `animateChange()` -> `boolean`
- `onDetach()` -> `void`
- `recordDrawingState()` -> `void`
- `resetAnimation()` -> `void`
- `supportChangeAnimation()` -> `boolean`

## `org.telegram.ui.Cells.ChatListCell`
- `didSelectChatType(boolean threeLines)` -> `void`
- `invalidate()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Cells.ChatListCell$ListView`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`

## `org.telegram.ui.Cells.ChatLoadingCell`
- `applyServiceShaderMatrix()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setProgressVisible(boolean value)` -> `void`
- `setVisiblePart(float viewTop, int backgroundHeight)` -> `void`

## `org.telegram.ui.Cells.ChatMessageUnsupportedCell`
- `drawBackground(Canvas canvas)` -> `void`
- `getThemedPaint(String paintKey)` -> `Paint`
- `hasGradientService()` -> `boolean`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setDelegate(ChatMessageCell.ChatMessageCellDelegate delegate)` -> `void`
- `setVisiblePart(float viewTop, int parentH)` -> `void`
- `updateColors()` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Cells.ChatUnreadCell`
- `getBackgroundLayout()` -> `FrameLayout`
- `getImageView()` -> `ImageView`
- `getTextView()` -> `TextView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setText(String text)` -> `void`

## `org.telegram.ui.Cells.CheckBoxCell`
- `allowMultiline()` -> `void`
- `getAnimatedTextView()` -> `AnimatedTextView`
- `getCheckBoxRound()` -> `CheckBox2`
- `getCheckBoxView()` -> `View`
- `getTextView()` -> `TextView`
- `getValueTextView()` -> `TextView`
- `isCheckboxRound()` -> `boolean`
- `isChecked()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setCheckBoxColor(int background, int background1, int check)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setCollapseButton(boolean collapsed, CharSequence text, View.OnClickListener onClick)` -> `void`
- `setCollapsed(Boolean collapsed)` -> `void`
- `setEnabled(boolean enabled)` -> `void`
- `setIcon(int icon)` -> `void`
- `setMultiline(boolean value)` -> `void`
- `setNeedDivider(boolean needDivider)` -> `void`
- `setOnSectionsClickListener(OnClickListener onTextClick, OnClickListener onCheckboxClick)` -> `void`
- `setPad(int pad)` -> `void`
- `setSquareCheckBoxColor(int uncheckedColor, int checkedColor, int checkColor)` -> `void`
- `setText(CharSequence text, String value, boolean checked, boolean divider)` -> `void`
- `setText(CharSequence text, String value, boolean checked, boolean divider, boolean animated)` -> `void`
- `setTextColor(int color)` -> `void`
- `setUserOrChat(TLObject userOrChat)` -> `void`
- `updateTextColor()` -> `void`

## `org.telegram.ui.Cells.CheckBoxCell$CollapseButton`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(boolean collapsed, CharSequence text)` -> `void`

## `org.telegram.ui.Cells.CollapseTextCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(CharSequence text, boolean collapsed)` -> `void`
- `setColor(int colorKey)` -> `void`

## `org.telegram.ui.Cells.ContextLinkCell`
- `allowButtonBounce(boolean allow)` -> `void`
- `getBotInlineResult()` -> `TLRPC.BotInlineResult`
- `getDate()` -> `int`
- `getDocument()` -> `TLRPC.Document`
- `getInlineBot()` -> `TLRPC.User`
- `getMessageObject()` -> `MessageObject`
- `getObserverTag()` -> `int`
- `getParentObject()` -> `Object`
- `getPhotoImage()` -> `ImageReceiver`
- `getResult()` -> `TLRPC.BotInlineResult`
- `isCanPreviewGif()` -> `boolean`
- `isGif()` -> `boolean`
- `isSticker()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onFailedDownload(String fileName, boolean canceled)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onProgressDownload(String fileName, long downloadedSize, long totalSize)` -> `void`
- `onProgressUpload(String fileName, long uploadedSize, long totalSize, boolean isEncrypted)` -> `void`
- `onSuccessDownload(String fileName)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `performAccessibilityAction(int action, Bundle arguments)` -> `boolean`
- `setCanPreviewGif(boolean value)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setDelegate(ContextLinkCellDelegate contextLinkCellDelegate)` -> `void`
- `setGif(TLRPC.Document document, boolean divider)` -> `void`
- `setGif(TLRPC.Document document, Object parent, int date, boolean divider)` -> `void`
- `setIsKeyboard(boolean value)` -> `void`
- `setLink(TLRPC.BotInlineResult contextResult, TLRPC.User bot, boolean media, boolean divider, boolean shadow)` -> `void`
- `setLink(TLRPC.BotInlineResult contextResult, TLRPC.User bot, boolean media, boolean divider, boolean shadow, boolean forceGif)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `setScaled(boolean value)` -> `void`
- `showingBitmap()` -> `boolean`
- `updateButtonState(boolean ifSame, boolean animated)` -> `void`

## `org.telegram.ui.Cells.CreationTextCell`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setTextAndIcon(String text, Drawable icon, boolean divider)` -> `void`

## `org.telegram.ui.Cells.DialogMeUrlCell`
- `buildLayout()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setDialogSelected(boolean value)` -> `void`
- `setRecentMeUrl(TLRPC.RecentMeUrl url)` -> `void`

## `org.telegram.ui.Cells.DialogRadioCell`
- `isChecked()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setEnabled(boolean value, boolean animated)` -> `void`
- `setEnabled(boolean value, ArrayList<Animator> animators)` -> `void`
- `setText(CharSequence text, boolean checked, boolean divider)` -> `void`
- `setTextAndValue(CharSequence text, CharSequence value, boolean checked, boolean divider)` -> `void`
- `setTextColor(int color)` -> `void`

## `org.telegram.ui.Cells.DialogsEmptyCell`
- `isUtyanAnimationTriggered()` -> `boolean`
- `offsetTopAndBottom(int offset)` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setOnUtyanAnimationEndListener(Runnable onUtyanAnimationEndListener)` -> `void`
- `setOnUtyanAnimationUpdateListener(Consumer<Float> onUtyanAnimationUpdateListener)` -> `void`
- `setType(@EmptyType int value, boolean forward)` -> `void`
- `startUtyanCollapseAnimation(boolean changeContactsHelp)` -> `void`
- `startUtyanExpandAnimation()` -> `void`
- `updateLayout()` -> `void`

## `org.telegram.ui.Cells.DialogsHintCell`
- `clear()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setAvatars(int currentAccount, ArrayList<TLRPC.User> users)` -> `void`
- `setCompact(boolean compact)` -> `void`
- `setOnClickListener(@Nullable OnClickListener l)` -> `void`
- `setOnCloseListener(OnClickListener closeListener)` -> `void`
- `setText(CharSequence title, CharSequence subtitle)` -> `void`
- `setText(CharSequence title, CharSequence subtitle, boolean showChevron, boolean error)` -> `void`
- `showImage()` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Cells.DialogsRequestedEmptyCell`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onButtonClick()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `set(TLRPC.RequestPeerType requestPeerType)` -> `void`

## `org.telegram.ui.Cells.DividerCell`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setForceDarkTheme(boolean forceDarkTheme)` -> `void`

## `org.telegram.ui.Cells.EditTextCell`
- `getText()` -> `CharSequence`
- `getTextWithEntities()` -> `TLRPC.TL_textWithEntities`
- `hideKeyboardOnEnter()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onFocusChanged(boolean focused)` -> `void`
- `onTextChanged(CharSequence newText)` -> `void`
- `setDivider(boolean divider)` -> `void`
- `setLeftDrawable(Drawable drawable)` -> `ImageView`
- `setShowLimitOnFocus(boolean show)` -> `void`
- `setShowLimitWhenEmpty(boolean show)` -> `void`
- `setShowLimitWhenNear(int near)` -> `void`
- `setText(CharSequence text)` -> `void`
- `setText(TLRPC.TL_textWithEntities text)` -> `void`
- `validate()` -> `boolean`
- `whenHitEnter(Runnable whenEnter)` -> `void`

## `org.telegram.ui.Cells.EmptyCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setHeight(int height)` -> `void`

## `org.telegram.ui.Cells.FixedHeightEmptyCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Cells.GraySectionCell`
- `static createThemeDescriptions(List<ThemeDescription> descriptions, RecyclerListView listView)` -> `void`
- `getText()` -> `CharSequence`
- `getTextView()` -> `TextView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setLayerHeight(int dp)` -> `void`
- `setNoBackground(boolean no)` -> `void`
- `setRightText(CharSequence right)` -> `void`
- `setRightText(CharSequence right, boolean moveDown)` -> `void`
- `setRightText(CharSequence right, OnClickListener onClickListener)` -> `void`
- `setRightText(CharSequence right, boolean moveDown, OnClickListener onClickListener)` -> `void`
- `setRightTextMargin(int marginDp)` -> `void`
- `setText(CharSequence text)` -> `void`
- `setText(CharSequence left, CharSequence right, OnClickListener onClickListener)` -> `void`
- `setTextColor(int key)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Cells.GroupCreateSectionCell`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setText(String text)` -> `void`

## `org.telegram.ui.Cells.GroupMedia`
- `allVisible()` -> `boolean`
- `draw(Canvas canvas)` -> `void`
- `drawBlurRect(Canvas canvas, RectF rect, float r, float alpha)` -> `void`
- `drawBlurred(Canvas canvas, float alpha)` -> `void`
- `drawImages(Canvas canvas, boolean withSpoilers)` -> `void`
- `getHolderAt(float x, float y)` -> `MediaHolder`
- `getPhotoImage(int index)` -> `ImageReceiver`
- `getPhotoImage(TLRPC.FileLocation location)` -> `ImageReceiver`
- `isLoading()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onTouchEvent(MotionEvent e)` -> `boolean`
- `setOverrideWidth(int overrideWidth)` -> `void`
- `updateHolders(MessageObject messageObject)` -> `void`

## `org.telegram.ui.Cells.GroupMedia$GroupedMessages`
- `calculate()` -> `void`
- `findMediaWithFlags(int flags)` -> `TLRPC.MessageExtendedMedia`
- `getHeight()` -> `float`
- `getPosition(TLRPC.MessageExtendedMedia media)` -> `GroupedMessagePosition`
- `getWidth()` -> `int`

## `org.telegram.ui.Cells.GroupMedia$GroupedMessages$TransitionParams`
- `reset()` -> `void`

## `org.telegram.ui.Cells.GroupMedia$MediaHolder`
- `attach()` -> `void`
- `detach()` -> `void`
- `getObserverTag()` -> `int`
- `onFailedDownload(String fileName, boolean canceled)` -> `void`
- `onProgressDownload(String fileName, long downloadSize, long totalSize)` -> `void`
- `onProgressUpload(String fileName, long uploadedSize, long totalSize, boolean isEncrypted)` -> `void`
- `onSuccessDownload(String fileName)` -> `void`
- `setIcon(int icon)` -> `void`
- `setTime(int time)` -> `void`
- `updateMedia(TLRPC.MessageExtendedMedia media, MessageObject msg)` -> `void`

## `org.telegram.ui.Cells.HashtagSearchCell`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setNeedDivider(boolean value)` -> `void`

## `org.telegram.ui.Cells.HeaderCell`
- `getAnimatedWidth()` -> `float`
- `getTextView()` -> `TextView`
- `getTextView2()` -> `SimpleTextView`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setBottomMargin(int bottomMargin)` -> `void`
- `setEnabled(boolean value, boolean animated)` -> `void`
- `setEnabled(boolean value, ArrayList<Animator> animators)` -> `void`
- `setHeight(int value)` -> `void`
- `setOnWidthUpdateListener(Runnable listener)` -> `void`
- `setText(CharSequence text)` -> `void`
- `setText(CharSequence text, boolean animate)` -> `void`
- `setText2(CharSequence text)` -> `void`
- `setTextColor(int color)` -> `void`
- `setTextSize(float dip)` -> `void`
- `setTopMargin(int topMargin)` -> `void`

## `org.telegram.ui.Cells.IMessageCell`
- `didPressReactionFromLayout(TLRPC.ReactionCount reaction, boolean longpress, float x, float y)` -> `default void`
- `drawPinnedBottom()` -> `default boolean`
- `drawPinnedTop()` -> `default boolean`
- `getAvatarImage()` -> `default ImageReceiver`
- `getCheckBoxTranslation()` -> `default float`
- `getCurrentPosition()` -> `default MessageObject.GroupedMessagePosition`
- `getLayoutHeight()` -> `default int`
- `getReactionsLayout()` -> `default ReactionsLayoutInBubble`
- `getSlidingOffsetX()` -> `default float`
- `setAnimationRunning(boolean animationRunning, boolean willRemoved)` -> `default void`
- `willRemovedAfterAnimation()` -> `default boolean`

## `org.telegram.ui.Cells.LanguageCell`
- `getCurrentLocale()` -> `LocaleController.LocaleInfo`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setLanguage(LocaleController.LocaleInfo language, String desc, boolean divider)` -> `void`
- `setLanguageSelected(boolean value, boolean animated)` -> `void`
- `setValue(CharSequence name, CharSequence nameEnglish)` -> `void`

## `org.telegram.ui.Cells.LetterSectionCell`
- `setCellHeight(int height)` -> `void`
- `setLetter(String letter)` -> `void`

## `org.telegram.ui.Cells.LoadingCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Cells.LocationCell`
- `static getColorForIndex(int index)` -> `int`
- `getImageView()` -> `BackupImageView`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAllowTextAnimation(boolean allow)` -> `void`
- `setLocation(TLRPC.TL_messageMediaVenue location, int pos, boolean divider)` -> `void`
- `setLocation(TLRPC.TL_messageMediaVenue location, String label, int pos, boolean divider, boolean animated)` -> `void`

## `org.telegram.ui.Cells.LocationDirectionCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setOnButtonClick(OnClickListener onButtonClick)` -> `void`

## `org.telegram.ui.Cells.LocationLoadingCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setLoading(boolean value)` -> `void`

## `org.telegram.ui.Cells.LocationPoweredCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Cells.ManageChatTextCell`
- `getFullHeight()` -> `int`
- `getTextView()` -> `SimpleTextView`
- `getValueTextView()` -> `SimpleTextView`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setColors(int iconColorKey, int text)` -> `void`
- `setDividerColor(int key)` -> `void`
- `setText(String text, String value, int resId, boolean needDivider)` -> `void`
- `setText(String text, String value, int resId, int paddingTop, boolean needDivider)` -> `void`
- `setTextColor(int color)` -> `void`

## `org.telegram.ui.Cells.MaxFileSizeCell`
- `didChangedSizeValue(int value)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `getSize()` -> `long`
- `onDraw(Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setEnabled(boolean value, ArrayList<Animator> animators)` -> `void`
- `setSize(long size)` -> `void`
- `setText(String text)` -> `void`

## `org.telegram.ui.Cells.MemberRequestCell`
- `getAvatarImageView()` -> `BackupImageView`
- `getImporter()` -> `TLRPC.TL_chatInviteImporter`
- `getStatus()` -> `String`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setData(LongSparseArray<TLRPC.User> users, TLRPC.TL_chatInviteImporter importer, boolean isNeedDivider)` -> `void`

## `org.telegram.ui.Cells.MentionCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `invalidate()` -> `void`
- `invalidateEmojis()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `resetEmojiSuggestion()` -> `void`
- `setBotCommand(String command, String help, TLRPC.User user, boolean ephemeral)` -> `void`
- `setChat(TLRPC.Chat chat)` -> `void`
- `setDivider(boolean enabled)` -> `void`
- `setEmojiSuggestion(MediaDataController.KeywordResult suggestion)` -> `void`
- `setIsDarkTheme(boolean isDarkTheme)` -> `void`
- `setText(String text)` -> `void`
- `setUser(TLRPC.User user)` -> `void`

## `org.telegram.ui.Cells.PatternCell`
- `getObserverTag()` -> `int`
- `invalidate()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onFailedDownload(String fileName, boolean canceled)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onProgressDownload(String fileName, long downloadedSize, long totalSize)` -> `void`
- `onProgressUpload(String fileName, long uploadedSize, long totalSize, boolean isEncrypted)` -> `void`
- `onSuccessDownload(String fileName)` -> `void`
- `setPattern(TLRPC.TL_wallPaper wallPaper)` -> `void`
- `updateSelected(boolean animated)` -> `void`

## `org.telegram.ui.Cells.PaymentInfoCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setInfo(String title, String description, TLRPC.WebDocument photo, String botname, Object parentObject)` -> `void`
- `setInvoice(TLRPC.TL_messageMediaInvoice invoice, String botname)` -> `void`
- `setReceipt(TLRPC.PaymentReceipt receipt, String botname)` -> `void`

## `org.telegram.ui.Cells.PhotoAttachPermissionCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setItemSize(int size)` -> `void`
- `setType(int type)` -> `void`

## `org.telegram.ui.Cells.PhotoAttachPhotoCell`
- `callDelegate()` -> `void`
- `clearAnimation()` -> `void`
- `getCheckBox()` -> `CheckBox2`
- `getCheckFrame()` -> `FrameLayout`
- `getImageView()` -> `BackupImageView`
- `getPhotoEntry()` -> `MediaController.PhotoEntry`
- `getScale()` -> `float`
- `getThemedColor(int key)` -> `int`
- `getVideoInfoContainer()` -> `View`
- `isChecked()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `performAccessibilityAction(int action, Bundle arguments)` -> `boolean`
- `setChecked(int num, boolean checked, boolean animated)` -> `void`
- `setDelegate(PhotoAttachPhotoCellDelegate delegate)` -> `void`
- `setFastScrollDelegate(ParentFastScrollDelegate fastScrollDelegate)` -> `void`
- `setHasSpoiler(boolean hasSpoiler)` -> `void`
- `setHasSpoiler(boolean hasSpoiler, Float crossfadeDuration)` -> `void`
- `setHighQuality(boolean highQuality)` -> `void`
- `setIsVertical(boolean value)` -> `void`
- `setItemSize(int size)` -> `void`
- `setNum(int num)` -> `void`
- `setOnCheckClickListener(OnClickListener onCheckClickListener)` -> `void`
- `setPhotoEntry(MediaController.PhotoEntry entry, boolean selectedMultiple, boolean needCheckShow, boolean last, boolean allowLivePhotos)` -> `void`
- `setPhotoEntry(MediaController.SearchImage searchImage, boolean needCheckShow, boolean last)` -> `void`
- `setStarsPrice(long stars, boolean multiple)` -> `void`
- `showCheck(boolean show)` -> `void`
- `showImage()` -> `void`
- `startRevealMedia(float x, float y)` -> `void`

## `org.telegram.ui.Cells.PhotoEditRadioCell`
- `getCurrentColor()` -> `int`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setIconAndTextAndValue(String text, int type, int value)` -> `void`
- `setOnClickListener(OnClickListener l)` -> `void`

## `org.telegram.ui.Cells.PhotoEditToolCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setIconAndTextAndValue(String text, float value, int min, int max)` -> `void`
- `setSeekBarDelegate(final PhotoEditorSeekBar.PhotoEditorSeekBarDelegate photoEditorSeekBarDelegate)` -> `void`
- `setTag(Object tag)` -> `void`

## `org.telegram.ui.Cells.PhotoPickerAlbumsCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAlbum(int a, MediaController.AlbumEntry albumEntry)` -> `void`
- `setAlbumsCount(int count)` -> `void`
- `setDelegate(PhotoPickerAlbumsCellDelegate delegate)` -> `void`

## `org.telegram.ui.Cells.PhotoPickerAlbumsCell$AlbumView`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.ui.Cells.PhotoPickerPhotoCell`
- `onAttachedToWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(final int num, final boolean checked, final boolean animated)` -> `void`
- `setImage(MediaController.PhotoEntry photoEntry)` -> `void`
- `setImage(MediaController.SearchImage searchImage)` -> `void`
- `setItemWidth(int width, int extra)` -> `void`
- `setNum(int num)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Cells.PollCreateCheckCell`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `getCheckBox()` -> `Switch`
- `isChecked()` -> `boolean`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `setAnimationsEnabled(boolean animationsEnabled)` -> `void`
- `setChecked(boolean checked)` -> `void`
- `setDivider(boolean divider)` -> `void`
- `setTextAndValueAndIconAndCheck(CharSequence text, CharSequence value, IconBackgroundColors color, int iconResId, boolean checked)` -> `void`
- `setValue(CharSequence value)` -> `void`

## `org.telegram.ui.Cells.PollEditTextCell`
- `addTextWatcher(TextWatcher watcher)` -> `void`
- `callOnDelete()` -> `void`
- `createErrorTextView()` -> `void`
- `drawDivider()` -> `boolean`
- `getCheckBox()` -> `CheckBox2`
- `getEditField()` -> `EditTextBoldCursor`
- `getEditText()` -> `Editable`
- `getEmojiButton()` -> `ChatActivityEnterViewAnimatedIconView`
- `getFieldText()` -> `CharSequence`
- `getParentFragment()` -> `BaseFragment`
- `getText()` -> `String`
- `getTextView()` -> `EditTextBoldCursor`
- `getTextView2()` -> `SimpleTextView`
- `isChecked(PollEditTextCell editText)` -> `boolean`
- `length()` -> `int`
- `onActionModeStart(EditTextBoldCursor editText, ActionMode actionMode)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onCheckBoxClick(PollEditTextCell editText, boolean checked)` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onEditTextDraw(EditTextBoldCursor editText, Canvas canvas)` -> `void`
- `onEditTextFocusChanged(boolean focused)` -> `void`
- `onEmojiButtonClicked(PollEditTextCell cell)` -> `void`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onFieldTouchUp(EditTextBoldCursor editText)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onPastedMultipleLines(ArrayList<CharSequence> parts)` -> `boolean`
- `setCheckboxMultiselect(boolean multiselect, boolean animated)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setEmojiButtonVisibility(boolean visible)` -> `void`
- `setEnabled(boolean value, ArrayList<Animator> animators)` -> `void`
- `setFieldText(CharSequence text)` -> `void`
- `setIconsColor(int key)` -> `void`
- `setShowCheckBox(boolean show, boolean animated)` -> `void`
- `setShowNextButton(boolean value)` -> `void`
- `setText(CharSequence text, boolean divider)` -> `void`
- `setText2(String text)` -> `void`
- `setTextAndHint(CharSequence text, String hint, boolean divider)` -> `void`
- `setTextColor(int color)` -> `void`
- `setTextRight(int r)` -> `void`
- `supportMultiselect()` -> `void`

## `org.telegram.ui.Cells.RadioButtonCell`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setTextAndValue(String text, String value, boolean divider, boolean checked)` -> `void`

## `org.telegram.ui.Cells.RadioCell`
- `hideRadioButton()` -> `void`
- `isChecked()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setEnabled(boolean value, ArrayList<Animator> animators)` -> `void`
- `setRadioIcon(Drawable icon)` -> `void`
- `setText(CharSequence text, boolean checked, boolean divider)` -> `void`
- `setTextColor(int color)` -> `void`

## `org.telegram.ui.Cells.ReactedUserHolderView`
- `animateAlpha(float alpha, boolean animated)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getAlphaInternal()` -> `float`
- `getResourcesProvider()` -> `Theme.ResourcesProvider`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `openStory(long dialogId, Runnable onDone)` -> `void`
- `setObject(TLRPC.User user, long date, boolean b)` -> `void`
- `setUserReaction(TLRPC.User user, TLRPC.Chat chat, TLRPC.Reaction reaction, boolean like, long date, TL_stories.StoryItem storyItem, boolean isForward, boolean dateIsSeen, boolean animated)` -> `void`
- `setUserReaction(TLRPC.MessagePeerReaction reaction)` -> `void`

## `org.telegram.ui.Cells.RecurrentPaymentsAcceptCell`
- `getCheckBox()` -> `CheckBoxSquare`
- `getTextView()` -> `TextView`
- `onDraw(Canvas canvas)` -> `void`
- `setChecked(boolean checked)` -> `void`
- `setText(CharSequence text)` -> `void`

## `org.telegram.ui.Cells.RequestPeerRequirementsCell`
- `static rightsToString(TLRPC.TL_chatAdminRights rights, boolean isChannel)` -> `CharSequence`
- `set(TLRPC.RequestPeerType requestPeerType)` -> `void`

## `org.telegram.ui.Cells.Requirement`
- `static make(CharSequence text)` -> `Requirement`
- `static make(int pad, CharSequence text)` -> `Requirement`

## `org.telegram.ui.Cells.SendLocationCell`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setDialogId(long did)` -> `void`
- `setHasLocation(boolean value)` -> `void`
- `setText(String title, String text)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Cells.SessionCell`
- `static createDrawable(int sz, String platform)` -> `CombinedDrawable`
- `static createDrawable(int sz, TLRPC.TL_authorization session)` -> `CombinedDrawable`
- `isStub()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setSession(TLObject object, boolean divider)` -> `void`
- `showStub(FlickerLoadingView globalGradient)` -> `void`

## `org.telegram.ui.Cells.SessionCell$CircleGradientDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int i)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Cells.ShadowSectionCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setSize(int size)` -> `void`
- `setTopBottom(boolean top, boolean bottom)` -> `void`

## `org.telegram.ui.Cells.ShareTopicCell`
- `getCurrentDialog()` -> `long`
- `getCurrentTopic()` -> `long`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAsNewBotForumTopic(boolean canCreateNewTopic)` -> `void`
- `setTopic(TLRPC.Dialog dialog, TLRPC.TL_forumTopic topic, boolean checked, CharSequence name)` -> `void`

## `org.telegram.ui.Cells.SharedDocumentCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getImageView()` -> `BackupImageView`
- `getMessage()` -> `MessageObject`
- `getObserverTag()` -> `int`
- `isLoaded()` -> `boolean`
- `isLoading()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onFailedDownload(String name, boolean canceled)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onProgressDownload(String fileName, long downloadedSize, long totalSize)` -> `void`
- `onProgressUpload(String fileName, long uploadedSize, long totalSize, boolean isEncrypted)` -> `void`
- `onSuccessDownload(String name)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setDocument(MessageObject messageObject, boolean divider)` -> `void`
- `setDrawDownloadIcon(boolean value)` -> `void`
- `setEnterAnimationAlpha(float alpha)` -> `void`
- `setGlobalGradientView(FlickerLoadingView globalGradientView)` -> `void`
- `setPhoto(String path)` -> `void`
- `setPhotoEntry(MediaController.PhotoEntry entry)` -> `void`
- `setTextAndValueAndTypeAndThumb(String text, String value, String type, String thumb, int resId, boolean divider)` -> `void`
- `showReorderIcon(boolean show, boolean animated)` -> `void`
- `updateFileExistIcon(boolean animated)` -> `void`

## `org.telegram.ui.Cells.SharedLinkCell`
- `getLink(int num)` -> `String`
- `getLinkImageView()` -> `ImageReceiver`
- `getMessage()` -> `MessageObject`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `resetPressedLink()` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setDelegate(SharedLinkCellDelegate sharedLinkCellDelegate)` -> `void`
- `setLink(MessageObject messageObject, boolean divider)` -> `void`
- `startCheckLongPress()` -> `void`

## `org.telegram.ui.Cells.SharedLinkCell$CheckForLongPress`
- `run()` -> `void`

## `org.telegram.ui.Cells.SharedLinkCell$CheckForTap`
- `run()` -> `void`

## `org.telegram.ui.Cells.SharedMediaSectionCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setText(String text)` -> `void`

## `org.telegram.ui.Cells.SharedPhotoVideoCell`
- `getDelegate()` -> `SharedPhotoVideoCellDelegate`
- `getImageView(int a)` -> `BackupImageView`
- `getIndeces(int a)` -> `int`
- `static getItemSize(int itemsCount)` -> `int`
- `getMessageObject(int a)` -> `MessageObject`
- `getView(int a)` -> `PhotoVideoView`
- `invalidate()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(int a, boolean checked, boolean animated)` -> `void`
- `setDelegate(SharedPhotoVideoCellDelegate delegate)` -> `void`
- `setIsFirst(boolean first)` -> `void`
- `setItem(int a, int index, MessageObject messageObject)` -> `void`
- `setItemsCount(int count)` -> `void`
- `updateCheckboxColor()` -> `void`

## `org.telegram.ui.Cells.SharedPhotoVideoCell$PhotoVideoView`
- `clearAnimation()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setChecked(final boolean checked, boolean animated)` -> `void`
- `setMessageObject(MessageObject messageObject)` -> `void`

## `org.telegram.ui.Cells.SharedPhotoVideoCell2`
- `customDraw(View view, Canvas canvas, float width, float height, float progress)` -> `void`
- `drawAuthor(Canvas canvas, RectF bounds, float alpha)` -> `void`
- `drawCrossafadeImage(Canvas canvas)` -> `void`
- `drawDuration(Canvas canvas, RectF bounds, float alpha)` -> `void`
- `drawPrivacy(Canvas canvas, RectF bounds, float alpha)` -> `void`
- `drawViews(Canvas canvas, RectF bounds, float alpha)` -> `void`
- `getCrossfadeView()` -> `View`
- `getMessageId()` -> `int`
- `getMessageObject()` -> `MessageObject`
- `getStyle()` -> `int`
- `initFullSizeReceiver()` -> `void`
- `moveImageToFront()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onCheckBoxPressed()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setCheck2()` -> `void`
- `setChecked(final boolean checked, boolean animated)` -> `void`
- `setCrossfadeView(SharedPhotoVideoCell2 cell, float crossfadeProgress, int crossfadeToColumnsCount)` -> `void`
- `setGradientView(FlickerLoadingView globalGradientView)` -> `void`
- `setHighlightProgress(float p)` -> `void`
- `setImageAlpha(float alpha, boolean invalidate)` -> `void`
- `setImageScale(float scale, boolean invalidate)` -> `void`
- `setMessageObject(MessageObject messageObject, int parentColumnsCount)` -> `void`
- `setReorder(boolean value)` -> `void`
- `setReordering(boolean reordering, boolean animated)` -> `void`
- `setStyle(int style)` -> `void`
- `setVideoText(String videoText, boolean drawVideoIcon)` -> `void`
- `startHighlight()` -> `void`
- `startRevealMedia(float x, float y)` -> `void`
- `updateViews()` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`
- `viewsOnLeft(float width)` -> `boolean`

## `org.telegram.ui.Cells.SharedPhotoVideoCell2$SharedResources`
- `getFilterString(int width)` -> `String`
- `getPrivacyBitmap(Context context, int resId)` -> `Bitmap`
- `recycleAll()` -> `void`

## `org.telegram.ui.Cells.SharingLiveLocationCell`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setDialog(long dialogId, TLRPC.TL_channelLocation chatLocation)` -> `void`
- `setDialog(MessageObject messageObject, Location userLocation, boolean userLocationDenied)` -> `void`
- `setDialog(LocationActivity.LiveLocation info, Location userLocation)` -> `void`
- `setDialog(LocationController.SharingLocationInfo info)` -> `void`

## `org.telegram.ui.Cells.SlideIntChooseView`
- `static cut(int[] steps, int max)` -> `int[]`
- `getProgress(int value)` -> `float`
- `getStep(int value)` -> `int`
- `getValue(float progress)` -> `int`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setLabel(CharSequence label)` -> `void`
- `setMinValueAllowed(int value)` -> `void`
- `updateTexts(int value, boolean animated)` -> `void`

## `org.telegram.ui.Cells.SlideIntChooseView$Options`
- `getMax()` -> `int`
- `getMin()` -> `int`
- `getStepsCount()` -> `int`

## `org.telegram.ui.Cells.StatisticPostInfoCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getImageView()` -> `BackupImageView`
- `getPostInfo()` -> `StatisticActivity.RecentPostInfo`
- `getStoryAvatarParams()` -> `StoriesUtilities.AvatarStoryParams`
- `onDetachedFromWindow()` -> `void`
- `setData(StatisticActivity.RecentPostInfo postInfo, boolean isLast)` -> `void`
- `setData(StatisticActivity.MemberData memberData)` -> `void`
- `setImageViewAction(View.OnClickListener action)` -> `void`

## `org.telegram.ui.Cells.TextBlockCell`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setText(String text, boolean divider)` -> `void`
- `setTextColor(int color)` -> `void`

## `org.telegram.ui.Cells.TextCell`
- `static applyNewSpan(CharSequence str)` -> `CharSequence`
- `static applyNewSpan(CharSequence str, boolean usePaintAlpha)` -> `CharSequence`
- `static applyNewSpanTimed(CharSequence str, int since)` -> `CharSequence`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getCheckBox()` -> `Switch`
- `getImageView()` -> `RLottieImageView`
- `getOffsetFromImage(boolean colourful)` -> `int`
- `getTextView()` -> `SimpleTextView`
- `getValueImageView()` -> `ImageView`
- `getValueTextView()` -> `AnimatedTextView`
- `isChecked()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked)` -> `void`
- `setColorfulIcon(int color, int resId)` -> `void`
- `setColorfulIcon(int colorTop, int colorBottom, int resId)` -> `void`
- `setColors(int icon, int text)` -> `void`
- `setDrawLoading(boolean drawLoading, int size, boolean animated)` -> `void`
- `setEnabled(boolean enabled)` -> `void`
- `setEnabled(boolean enabled, boolean animated)` -> `void`
- `setImageLeft(int imageLeft)` -> `void`
- `setIsInDialogs()` -> `void`
- `setLockLevel(boolean plus, int level)` -> `void`
- `setNeedDivider(boolean needDivider)` -> `void`
- `setOffsetFromImage(int value)` -> `void`
- `setPrioritizeTitleOverValue(boolean prioritizeTitleOverValue)` -> `void`
- `setSubtitle(CharSequence charSequence)` -> `void`
- `setText(CharSequence text, boolean divider)` -> `void`
- `setTextAndCheck(CharSequence text, boolean checked, boolean divider)` -> `void`
- `setTextAndCheckAndColorfulIcon(CharSequence text, boolean checked, int resId, int color, boolean divider)` -> `void`
- `setTextAndCheckAndIcon(CharSequence text, boolean checked, int resId, boolean divider)` -> `void`
- `setTextAndCheckAndIcon(String text, boolean checked, Drawable resDrawable, boolean divider)` -> `void`
- `setTextAndColorfulIcon(CharSequence text, int resId, int color, boolean divider)` -> `void`
- `setTextAndIcon(CharSequence text, int resId, boolean divider)` -> `void`
- `setTextAndIcon(CharSequence text, Drawable drawable, boolean divider)` -> `void`
- `setTextAndSpoilersValueAndColorfulIcon(String text, CharSequence value, int resId, int color, boolean divider)` -> `void`
- `setTextAndSpoilersValueAndIcon(String text, CharSequence value, int resId, boolean divider)` -> `void`
- `setTextAndSticker(CharSequence text, TLRPC.Document document, boolean divider)` -> `void`
- `setTextAndSticker(CharSequence text, String localPath, boolean divider)` -> `void`
- `setTextAndValue(CharSequence text, CharSequence value, boolean divider)` -> `void`
- `setTextAndValue(CharSequence text, CharSequence value, boolean animated, boolean divider)` -> `void`
- `setTextAndValueAndColorfulIcon(String text, CharSequence value, boolean animated, int resId, int colorTop, int colorBottom, boolean divider)` -> `void`
- `setTextAndValueAndIcon(CharSequence text, CharSequence value, Drawable drawable, boolean divider)` -> `void`
- `setTextAndValueAndIcon(CharSequence text, CharSequence value, int resId, boolean divider)` -> `void`
- `setTextAndValueAndIcon(CharSequence text, CharSequence value, boolean animated, int resId, boolean divider)` -> `void`
- `setTextAndValueDrawable(CharSequence text, Drawable drawable, boolean divider)` -> `void`
- `setTextColor(int color)` -> `void`
- `setValue(CharSequence value, boolean animated)` -> `void`
- `setValueSticker(TLRPC.Document document)` -> `void`
- `setValueSticker(String path)` -> `void`
- `updateColors()` -> `void`
- `updateEmojiBounds()` -> `void`

## `org.telegram.ui.Cells.TextCheckBoxCell`
- `invalidate()` -> `void`
- `isChecked()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked)` -> `void`
- `setTextAndCheck(String text, boolean checked, boolean divider)` -> `void`

## `org.telegram.ui.Cells.TextCheckCell`
- `getCheckBox()` -> `Switch`
- `isChecked()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setAnimatingToThumbInsteadOfTouch(boolean animatingToThumbInsteadOfTouch)` -> `void`
- `setBackgroundColor(int color)` -> `void`
- `setBackgroundColorAnimated(boolean checked, int color)` -> `void`
- `setBackgroundColorAnimatedReverse(int color)` -> `void`
- `setCheckBoxIcon(int icon)` -> `void`
- `setChecked(boolean checked)` -> `void`
- `setColorfullIcon(int color, int resId)` -> `void`
- `setColors(int key, int switchKey, int switchKeyChecked, int switchThumb, int switchThumbChecked)` -> `void`
- `setDivider(boolean divider)` -> `void`
- `setDrawCheckRipple(boolean value)` -> `void`
- `setEnabled(boolean enabled)` -> `void`
- `setEnabled(boolean value, ArrayList<Animator> animators)` -> `void`
- `setHeight(int value)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `setTextAndCheck(CharSequence text, boolean checked, boolean divider)` -> `void`
- `setTextAndValue(String text, String value, boolean multiline, boolean divider)` -> `void`
- `setTextAndValueAndCheck(String text, String value, boolean checked, boolean multiline, boolean divider)` -> `void`
- `setTypeface(Typeface typeface)` -> `void`
- `updateRTL()` -> `void`

## `org.telegram.ui.Cells.TextCheckCell2`
- `getCheckBox()` -> `Switch`
- `hasIcon()` -> `boolean`
- `hideCollapseArrow()` -> `void`
- `isChecked()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked)` -> `void`
- `setCollapseArrow(String text, boolean collapsed, Runnable onCheckClick)` -> `void`
- `setEnabled(boolean value)` -> `void`
- `setEnabled(boolean value, boolean animated)` -> `void`
- `setIcon(int icon)` -> `void`
- `setTextAndCheck(String text, boolean checked, boolean divider)` -> `void`
- `setTextAndCheck(String text, boolean checked, boolean divider, boolean animated)` -> `void`
- `setTextAndValueAndCheck(CharSequence text, CharSequence value, boolean checked, boolean multiline, boolean divider)` -> `void`

## `org.telegram.ui.Cells.TextCheckbox2Cell`
- `isChecked()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBackgroundColor(int color)` -> `void`
- `setBackgroundColorAnimated(boolean checked, int color)` -> `void`
- `setCheckboxGravityTop()` -> `void`
- `setChecked(boolean checked)` -> `void`
- `setColors(int key, int switchKey, int switchKeyChecked, int switchThumb, int switchThumbChecked)` -> `void`
- `setEnabled(boolean value, ArrayList<Animator> animators)` -> `void`
- `setHeight(int value)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `setTextAndCheck(String text, boolean checked, boolean divider)` -> `void`
- `setTextAndValue(String text, String value, boolean multiline, boolean divider)` -> `void`
- `setTextAndValueAndCheck(String text, String value, boolean checked, boolean multiline, boolean divider)` -> `void`
- `setTypeface(Typeface typeface)` -> `void`

## `org.telegram.ui.Cells.TextDetailCell`
- `getImageView()` -> `ImageView`
- `invalidate()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `setContentDescriptionValueFirst(boolean contentDescriptionValueFirst)` -> `void`
- `setImage(Drawable drawable)` -> `void`
- `setImage(Drawable drawable, CharSequence imageContentDescription)` -> `void`
- `setImageClickListener(View.OnClickListener clickListener)` -> `void`
- `setTextAndValue(CharSequence text, CharSequence value, boolean divider)` -> `void`
- `setTextAndValue(CharSequence text, CharSequence value, CharSequence value2, boolean divider)` -> `void`
- `setTextWithEmojiAndValue(CharSequence text, CharSequence value, boolean divider)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Cells.TextDetailCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `TextDetailCell`
- `static of(int id, CharSequence title, CharSequence value)` -> `UItem`

## `org.telegram.ui.Cells.TextInfoCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setText(String text)` -> `void`

## `org.telegram.ui.Cells.TextInfoPrivacyCell`
- `afterTextDraw()` -> `void`
- `getFixedSize()` -> `int`
- `getText()` -> `CharSequence`
- `getTextView()` -> `LinkSpanDrawable.LinksTextView`
- `length()` -> `int`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTextDraw()` -> `void`
- `setBottomPadding(int value)` -> `void`
- `setEnabled(boolean value, ArrayList<Animator> animators)` -> `void`
- `setFixedSize(int size)` -> `void`
- `setLinkTextColorKey(int key)` -> `void`
- `setLinkTextRippleColor(Integer color)` -> `void`
- `setText(CharSequence text)` -> `void`
- `setTextColor(int color)` -> `void`
- `setTextColorByKey(int key)` -> `void`
- `setTextGravity(int gravity)` -> `void`
- `setTopPadding(int topPadding)` -> `void`
- `updateRTL()` -> `void`

## `org.telegram.ui.Cells.TextPriceCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setTextAndValue(String text, String value, boolean bold)` -> `void`
- `setTextColor(int color)` -> `void`
- `setTextValueColor(int color)` -> `void`

## `org.telegram.ui.Cells.TextRadioCell`
- `isChecked()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBackgroundColor(int color)` -> `void`
- `setBackgroundColorAnimated(boolean checked, int color)` -> `void`
- `setChecked(boolean checked)` -> `void`
- `setColors(int key, int switchKey, int switchKeyChecked, int switchThumb, int switchThumbChecked)` -> `void`
- `setEnabled(boolean value, ArrayList<Animator> animators)` -> `void`
- `setHeight(int value)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `setTextAndCheck(String text, boolean checked, boolean divider)` -> `void`
- `setTextAndValueAndCheck(String text, String value, boolean checked, boolean multiline, boolean divider)` -> `void`
- `setTypeface(Typeface typeface)` -> `void`
- `updateRTL()` -> `void`

## `org.telegram.ui.Cells.TextRightIconCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `setDivider(boolean needDivider)` -> `void`
- `setTextAndIcon(CharSequence text, int iconRes)` -> `void`

## `org.telegram.ui.Cells.TextSelectionHelper`
- `clear()` -> `void`
- `clear(boolean instant)` -> `void`
- `clipboardHasContent()` -> `boolean`
- `drawSelection(Canvas canvas, Layout layout, int selectionStart, int selectionEnd, boolean hasStart, boolean hasEnd, float minX)` -> `void`
- `fillLayoutForOffset(int offset, LayoutBlock layoutBlock)` -> `void`
- `finishOneTouchSelection()` -> `void`
- `forceShowSelectAll()` -> `boolean`
- `getOverlayView(Context context)` -> `TextSelectionOverlay`
- `getParentBottomPadding()` -> `int`
- `getParentTopPadding()` -> `int`
- `getResourcesProvider()` -> `Theme.ResourcesProvider`
- `getSelectedCell()` -> `Cell`
- `getSelectedText()` -> `CharSequence`
- `getThemedColor(int key)` -> `int`
- `hideActions()` -> `void`
- `hideActionsMenu()` -> `void`
- `invalidate()` -> `void`
- `static isInterruptedCharacter(char c)` -> `boolean`
- `jumpToLine(int newSelection, int nextWhitespace, boolean viewChanged, float newYoffset, float oldYoffset, Cell oldSelectedView)` -> `void`
- `offsetToCord(int offset)` -> `int[]`
- `onCopyOverride()` -> `boolean`
- `onCutAction()` -> `void`
- `onExitSelectionMode(boolean didAction)` -> `void`
- `onOffsetChanged()` -> `void`
- `onParentScrolled()` -> `void`
- `onPasteAction()` -> `void`
- `onQuoteClick(MessageObject messageObject, int start, int end, CharSequence text)` -> `void`
- `onSelectAllOverride()` -> `boolean`
- `onTapToDismiss(float rawX, float rawY)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `pickEndView()` -> `void`
- `pickStartView()` -> `void`
- `selectLayout(int x, int y)` -> `boolean`
- `setCallback(Callback listener)` -> `void`
- `setInvalidateParent()` -> `void`
- `setKeyboardSize(int keyboardSize)` -> `void`
- `setMaybeTextCord(int x, int y)` -> `void`
- `setOnTranslate(OnTranslateListener listener)` -> `void`
- `setParentView(ViewGroup view)` -> `void`
- `setScrollingParent(View scrollingParent)` -> `void`
- `setTopOffset(int topOffset)` -> `void`
- `showHandleViews()` -> `void`
- `stopScrolling()` -> `void`

## `org.telegram.ui.Cells.TextSelectionHelper$ArticleTextSelectionHelper`
- `cacheChildText(int pos, int childPos, CharSequence text)` -> `void`
- `cacheText(int pos, CharSequence text, CharSequence prefix)` -> `void`
- `clear(boolean instant)` -> `void`
- `draw(Canvas canvas, ArticleSelectableView view, int i)` -> `void`
- `expandSelectionToWholeCurrentBlock()` -> `boolean`
- `extendSelectionTo(ArticleSelectableView targetView, int targetOffset)` -> `boolean`
- `extendSelectionTo(ArticleSelectableView targetView, int targetChildPos, int targetOffset)` -> `boolean`
- `fillLayoutForOffset(int offset, LayoutBlock layoutBlock, boolean maybe)` -> `void`
- `getAnchorCell()` -> `int`
- `getAnchorChildPosition()` -> `int`
- `getAnchorOffset()` -> `int`
- `getCharOffsetFromCord(int x, int y, int offsetX, int offsetY, ArticleSelectableView view, boolean maybe)` -> `int`
- `getEndCell()` -> `int`
- `getEndChildPosition()` -> `int`
- `getEndOffset()` -> `int`
- `getLineHeight()` -> `int`
- `getSelectedText()` -> `CharSequence`
- `getSelectedTextPublic()` -> `CharSequence`
- `getStartCell()` -> `int`
- `getStartChildPosition()` -> `int`
- `getStartOffset()` -> `int`
- `getText(ArticleSelectableView view, boolean maybe)` -> `CharSequence`
- `invalidate()` -> `void`
- `isSelectable(View child)` -> `boolean`
- `jumpToLine(int newSelection, int nextWhitespace, boolean viewChanged, float newYoffset, float oldYoffset, ArticleSelectableView oldSelectedView)` -> `void`
- `onNewViewSelected(ArticleSelectableView oldView, ArticleSelectableView newView, int childPosition)` -> `void`
- `onOffsetChanged()` -> `void`
- `onTextSelected(ArticleSelectableView newView, ArticleSelectableView oldView)` -> `void`
- `pickEndView()` -> `void`
- `pickStartView()` -> `void`
- `selectAllBlocksRange(int firstPos, int lastPos)` -> `boolean`
- `selectAllBlocksRange(int firstPos, int lastPos, int lastChildPos, int lastEndOffset)` -> `boolean`
- `selectChildRange(ArticleSelectableView view, int startChild, int startOffset, int endChild, int endOffset)` -> `boolean`
- `selectLayout(int x, int y)` -> `boolean`
- `selectRangeOf(ArticleSelectableView view, int start, int end)` -> `boolean`
- `selectRangeOf(ArticleSelectableView view, int childPos, int start, int end)` -> `boolean`
- `setMaybeView(int x, int y, View parentView)` -> `void`
- `trySelect(View view)` -> `void`

## `org.telegram.ui.Cells.TextSelectionHelper$ChatListTextSelectionHelper`
- `clear(boolean instant)` -> `void`
- `draw(MessageObject messageObject, MessageObject.TextLayoutBlock block, Canvas canvas)` -> `void`
- `drawCaption(MessageObject messageObject, MessageObject.TextLayoutBlock block, Canvas canvas)` -> `void`
- `drawCaption(boolean isOut, StaticLayout captionLayout, Canvas canvas)` -> `void`
- `drawDescription(boolean isOut, StaticLayout layout, Canvas canvas)` -> `void`
- `drawFactCheck(boolean isOut, StaticLayout layout, Canvas canvas)` -> `void`
- `drawRich(MessageObject messageObject, RichMessageLayout layout, Canvas canvas)` -> `void`
- `fillLayoutForOffset(int offset, LayoutBlock layoutBlock, boolean maybe)` -> `void`
- `getCharOffsetFromCord(int x, int y, int offsetX, int offsetY, ChatMessageCell cell, boolean maybe)` -> `int`
- `getLineHeight()` -> `int`
- `getText(ChatMessageCell cell, boolean maybe)` -> `CharSequence`
- `getTextSelectionType(ChatMessageCell cell)` -> `int`
- `invalidate()` -> `void`
- `isMenuEmpty()` -> `boolean`
- `isTouched()` -> `boolean`
- `onChatMessageCellAttached(ChatMessageCell chatMessageCell)` -> `void`
- `onChatMessageCellDetached(ChatMessageCell chatMessageCell)` -> `void`
- `onCopyOverride()` -> `boolean`
- `onExitSelectionMode(boolean instant)` -> `void`
- `onTextSelected(ChatMessageCell newView, ChatMessageCell oldView)` -> `void`
- `select(ChatMessageCell cell, int start, int end)` -> `void`
- `setIsDescription(boolean b)` -> `void`
- `setIsFactCheck(boolean b)` -> `void`
- `setIsRich(boolean b)` -> `void`
- `setMessageObject(ChatMessageCell chatMessageCell)` -> `void`
- `updateTextPosition(int textX, int textY)` -> `void`

## `org.telegram.ui.Cells.TextSelectionHelper$PathCopyTo`
- `reset()` -> `void`

## `org.telegram.ui.Cells.TextSelectionHelper$PathWithSavedBottom`
- `reset()` -> `void`

## `org.telegram.ui.Cells.TextSelectionHelper$ScalablePath`
- `reset()` -> `void`

## `org.telegram.ui.Cells.TextSelectionHelper$SimpleTextSelectionHelper`
- `draw(Canvas canvas)` -> `void`
- `fillLayoutForOffset(int offset, LayoutBlock layoutBlock, boolean maybe)` -> `void`
- `getCharOffsetFromCord(int x, int y, int offsetX, int offsetY, SimpleSelectabeleView view, boolean maybe)` -> `int`
- `getLineHeight()` -> `int`
- `getText(SimpleSelectabeleView view, boolean maybe)` -> `CharSequence`
- `isCurrent(SimpleSelectabeleView view)` -> `boolean`
- `onTextSelected(SimpleSelectabeleView newView, SimpleSelectabeleView oldView)` -> `void`
- `setSelectabeleView(SimpleSelectabeleView selectabeleView)` -> `void`
- `update(float textX, float textY)` -> `void`

## `org.telegram.ui.Cells.TextSelectionHelper$TextLayoutBlock`
- `getPrefix()` -> `default CharSequence`
- `getSelectionBounds()` -> `default Rect`
- `getText()` -> `default CharSequence`

## `org.telegram.ui.Cells.TextSelectionHelper$TextSelectionOverlay`
- `applyPaddingAsOffset()` -> `void`
- `clearGestureExclusionRects()` -> `void`
- `invalidate()` -> `void`
- `isTouched()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.ui.Cells.TooManyCommunitiesHintCell`
- `setMessageText(String message)` -> `void`

## `org.telegram.ui.Cells.TopicExceptionCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setTopic(long dialogId, TLRPC.TL_forumTopic topic)` -> `void`

## `org.telegram.ui.Cells.TopicSearchCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getTopic()` -> `TLRPC.TL_forumTopic`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setTopic(TLRPC.TL_forumTopic topic)` -> `void`

## `org.telegram.ui.Cells.UserInfoCell`
- `animating()` -> `boolean`
- `applyServiceShaderMatrix()` -> `void`
- `applyServiceShaderMatrix(int measuredWidth, int backgroundHeight, float x, float viewTop)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static displayDate(String date)` -> `String`
- `static isEmpty(TLRPC.PeerSettings settings)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `set(long dialogId, TLRPC.PeerSettings settings)` -> `void`
- `setAnimating(boolean animating)` -> `void`
- `setVisiblePart(float visibleTop, int parentH)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Cells.WallpaperCell`
- `invalidate()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onWallpaperClick(Object wallPaper, int index)` -> `void`
- `onWallpaperLongClick(Object wallPaper, int index)` -> `boolean`
- `setChecked(int index, final boolean checked, final boolean animated)` -> `void`
- `setParams(int columns, boolean top, boolean bottom)` -> `void`
- `setSize(int itemSize)` -> `void`
- `setWallpaper(int type, int index, Object wallpaper, Object selectedWallpaper, Drawable themedWallpaper, boolean themed)` -> `void`

## `org.telegram.ui.Cells.WallpaperCell$WallpaperView`
- `clearAnimation()` -> `void`
- `invalidate()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setChecked(final boolean checked, boolean animated)` -> `void`
- `setWallpaper(Object object, Object selectedWallpaper, Drawable themedWallpaper, boolean themed)` -> `void`

## `org.telegram.ui.ChangeBioActivity`
- `createView(Context context)` -> `View`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`

## `org.telegram.ui.ChangeNameActivity`
- `createView(Context context)` -> `View`
- `getResourceProvider()` -> `Theme.ResourcesProvider`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`

## `org.telegram.ui.ChangeUsernameActivity`
- `createView(Context context)` -> `View`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `shakeIfOff()` -> `void`
- `toggleUsername(TLRPC.TL_username username, boolean newActive)` -> `void`
- `toggleUsername(TLRPC.TL_username username, boolean newActive, boolean shake)` -> `void`
- `toggleUsername(int position, boolean newActive)` -> `void`
- `toggleUsername(int position, boolean newActive, boolean shake)` -> `void`

## `org.telegram.ui.ChangeUsernameActivity$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `moveElement(int fromIndex, int toIndex)` -> `void`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `swapElements(int fromIndex, int toIndex)` -> `void`
- `updateSections()` -> `void`

## `org.telegram.ui.ChangeUsernameActivity$InputCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.ChangeUsernameActivity$LinkMovementMethodMy`
- `onTouchEvent(TextView widget, Spannable buffer, MotionEvent event)` -> `boolean`

## `org.telegram.ui.ChangeUsernameActivity$LinkSpan`
- `onClick(View widget)` -> `void`
- `updateDrawState(TextPaint ds)` -> `void`

## `org.telegram.ui.ChangeUsernameActivity$UsernameCell`
- `getUsernameEditable()` -> `String`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(TLRPC.TL_username username, boolean useDivider, boolean animated)` -> `void`
- `set(TLRPC.TL_username username, boolean useDivider, boolean animated, long botId)` -> `void`
- `setLoading(boolean loading)` -> `void`
- `update()` -> `void`
- `updateUsername(String username)` -> `void`

## `org.telegram.ui.ChangeUsernameActivity$UsernameHelpCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.ChannelAdminLogActivity`
- `applyScrolledPosition()` -> `void`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `drawEdgeNavigationBar()` -> `boolean`
- `static findDrawable(CharSequence messageText)` -> `ProfileActivity.ShowDrawable`
- `getCurrentChat()` -> `TLRPC.Chat`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isKeyboardVisible()` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`
- `onBecomeFullyHidden()` -> `void`
- `onConfigurationChanged(android.content.res.Configuration newConfig)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onRemoveFromParent()` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `onTransitionAnimationStart(boolean isOpen, boolean backward)` -> `void`
- `openVCard(TLRPC.User user, String vcard, String first_name, String last_name)` -> `void`
- `reloadLastMessages()` -> `void`
- `scrollToMessage(MessageObject object, boolean select)` -> `void`
- `showNoQuoteFound()` -> `void`
- `showOpenUrlAlert(final String url, boolean ask)` -> `void`

## `org.telegram.ui.ChannelAdminLogActivity$ChatListRecyclerView`
- `drawChatBackgroundElements(Canvas canvas)` -> `void`
- `drawChatBackgroundElements(Canvas canvas, @Nullable RectF position)` -> `void`
- `drawChatForegroundElements(Canvas canvas)` -> `void`
- `drawChatForegroundElements(Canvas canvas, @Nullable RectF position)` -> `void`

## `org.telegram.ui.ChannelBoostLayout`
- `createEmptyView(Context context)` -> `void`
- `updateRows(boolean animated)` -> `void`

## `org.telegram.ui.ChannelBoostLayout$ItemInternal`
- `equals(Object o)` -> `boolean`

## `org.telegram.ui.ChannelCreateActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `didStartUpload(boolean fromAvatarConstructor, boolean isVideo)` -> `void`
- `didUploadPhoto(final TLRPC.InputFile photo, final TLRPC.InputFile video, double videoStartTimestamp, String videoPath, final TLRPC.PhotoSize bigSize, final TLRPC.PhotoSize smallSize, boolean isVideo, TLRPC.VideoSize emojiMarkup)` -> `void`
- `dismissCurrentDialog()` -> `void`
- `dismissDialogOnPause(Dialog dialog)` -> `boolean`
- `getInitialSearchString()` -> `String`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onActivityResultFragment(int requestCode, int resultCode, Intent data)` -> `void`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `onUploadProgressChanged(float progress)` -> `void`
- `restoreSelfArgs(Bundle args)` -> `void`
- `setOnFinishListener(Utilities.Callback2<BaseFragment, Long> onFinishListener)` -> `void`

## `org.telegram.ui.ChannelMonetizationLayout`
- `static makeLearnSheet(Context context, boolean bots, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onNestedPreFling(View target, float velocityX, float velocityY)` -> `boolean`
- `onNestedPreScroll(View target, int dx, int dy, int[] consumed, int type)` -> `void`
- `onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed)` -> `void`
- `onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type)` -> `void`
- `onNestedScrollAccepted(@NonNull View child, @NonNull View target, int axes, int type)` -> `void`
- `onStartNestedScroll(@NonNull View child, @NonNull View target, int axes, int type)` -> `boolean`
- `onStopNestedScroll(@NonNull View target, int type)` -> `void`
- `onStopNestedScroll(@NonNull View child)` -> `void`
- `reloadTransactions()` -> `void`
- `static replaceTON(CharSequence text, TextPaint textPaint)` -> `CharSequence`
- `static replaceTON(CharSequence text, TextPaint textPaint, boolean large)` -> `CharSequence`
- `static replaceTON(CharSequence text, TextPaint textPaint, float scale, boolean large)` -> `CharSequence`
- `static replaceTON(CharSequence text, TextPaint textPaint, float scale, float translateY, boolean large)` -> `CharSequence`
- `setActionBar(ActionBar actionBar)` -> `void`
- `setupBalances(boolean ton, TLRPC.TL_starsRevenueStatus balances)` -> `void`
- `static showTransactionSheet(Context context, int currentAccount, TL_stats.BroadcastRevenueTransaction transaction, long dialogId, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `updateList()` -> `void`
- `static validateTONAddress(String address)` -> `boolean`

## `org.telegram.ui.ChannelMonetizationLayout$ChannelTransactionsView`
- `getCurrentListView()` -> `RecyclerListView`
- `reloadTransactions()` -> `void`

## `org.telegram.ui.ChannelMonetizationLayout$ChannelTransactionsView$Page`
- `isLoadingVisible()` -> `boolean`
- `onAttachedToWindow()` -> `void`

## `org.telegram.ui.ChannelMonetizationLayout$ChannelTransactionsView$PageAdapter`
- `bindView(View view, int position, int viewType)` -> `void`
- `createView(int viewType)` -> `View`
- `fill()` -> `void`
- `getItemCount()` -> `int`
- `getItemTitle(int position)` -> `String`
- `getItemViewType(int position)` -> `int`

## `org.telegram.ui.ChannelMonetizationLayout$FeatureCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.ChannelMonetizationLayout$ProceedOverview`
- `static as(String cryptoCurrency, CharSequence text)` -> `ProceedOverview`
- `static as(String cryptoCurrency, String cryptoCurrency2, CharSequence text)` -> `ProceedOverview`

## `org.telegram.ui.ChannelMonetizationLayout$ProceedOverviewCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(ProceedOverview value)` -> `void`

## `org.telegram.ui.ChannelMonetizationLayout$TransactionCell`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(TL_stats.BroadcastRevenueTransaction transaction, boolean divider)` -> `void`

## `org.telegram.ui.ChannelWallpaperActivity`
- `createView(Context context)` -> `View`
- `findChildAt(int position)` -> `View`
- `isDark()` -> `boolean`
- `setForceDark(boolean isDark, boolean playAnimation)` -> `void`
- `setOnSelectedWallpaperChange(Utilities.Callback3<TLRPC.WallPaper, TLRPC.WallPaper, TLRPC.WallPaper> listener)` -> `void`
- `setSelectedWallpaper(TLRPC.WallPaper wallpaper, TLRPC.WallPaper galleryWallpaper)` -> `void`
- `toggleTheme()` -> `void`
- `updateColors()` -> `void`
- `updateRows()` -> `void`

## `org.telegram.ui.ChannelWallpaperActivity$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.Charts.BarChartView`
- `createLineViewData(ChartData.Line line)` -> `BarViewData`
- `drawChart(Canvas canvas)` -> `void`
- `drawPickerChart(Canvas canvas)` -> `void`
- `drawSelection(Canvas canvas)` -> `void`
- `getMinDistance()` -> `float`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.Charts.BaseChartView`
- `animateLegend(boolean show)` -> `void`
- `clearSelection()` -> `void`
- `createAnimator(float f1, float f2, ValueAnimator.AnimatorUpdateListener l)` -> `ValueAnimator`
- `createHorizontalLinesData(long newMaxHeight, long newMinHeight, int formatter)` -> `ChartHorizontalLinesData`
- `createLegendView()` -> `LegendSignatureView`
- `drawBottomLine(Canvas canvas)` -> `void`
- `drawBottomSignature(Canvas canvas)` -> `void`
- `drawChart(Canvas canvas)` -> `void`
- `drawHorizontalLines(Canvas canvas, ChartHorizontalLinesData a)` -> `void`
- `drawPicker(Canvas canvas)` -> `void`
- `drawPickerChart(Canvas canvas)` -> `void`
- `drawSelection(Canvas canvas)` -> `void`
- `drawSignaturesToHorizontalLines(Canvas canvas, ChartHorizontalLinesData a)` -> `void`
- `fillTransitionParams(TransitionParams params)` -> `void`
- `findMaxValue(int startXIndex, int endXIndex)` -> `long`
- `findMinValue(int startXIndex, int endXIndex)` -> `long`
- `getEndDate()` -> `long`
- `getMinDistance()` -> `float`
- `getSelectedDate()` -> `long`
- `getStartDate()` -> `long`
- `init()` -> `void`
- `initPickerMaxHeight()` -> `void`
- `moveLegend(float offset)` -> `void`
- `moveLegend()` -> `void`
- `onActionUp()` -> `void`
- `onCheckChanged()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onPickerDataChanged()` -> `void`
- `onPickerDataChanged(boolean animated, boolean force, boolean useAniamtor)` -> `void`
- `onPickerJumpTo(float start, float end, boolean force)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `runSmoothHaptic()` -> `void`
- `selectDate(long activeZoom)` -> `void`
- `selectXOnChart(int x, int y)` -> `void`
- `setData(T chartData)` -> `boolean`
- `setDateSelectionListener(DateSelectionListener dateSelectionListener)` -> `void`
- `setHeader(ChartHeaderView chartHeaderView)` -> `void`
- `setLandscape(boolean b)` -> `void`
- `setMaxMinValue(long newMaxHeight, long newMinHeight, boolean animated, boolean force, boolean useAnimator)` -> `void`
- `tick()` -> `void`
- `updateColors()` -> `void`
- `updateIndexes()` -> `void`
- `updatePicker(ChartData chartData, long d)` -> `void`
- `updatePickerMinMaxHeight()` -> `void`

## `org.telegram.ui.Charts.BaseChartView$SharedUiComponents`
- `getPickerMaskBitmap(int h, int w)` -> `Bitmap`
- `invalidate()` -> `void`

## `org.telegram.ui.Charts.ChartPickerDelegate`
- `capture(int x, int y, int pointerIndex)` -> `boolean`
- `captured()` -> `boolean`
- `getLeftCaptured()` -> `CapturesData`
- `getMiddleCaptured()` -> `CapturesData`
- `getRightCaptured()` -> `CapturesData`
- `move(int x, int y, int pointer)` -> `boolean`
- `set(float start, float end)` -> `void`
- `uncapture(MotionEvent event, int pointerIndex)` -> `boolean`
- `uncapture()` -> `void`

## `org.telegram.ui.Charts.ChartPickerDelegate$CapturesData`
- `captured()` -> `void`
- `uncapture()` -> `void`

## `org.telegram.ui.Charts.DoubleLinearChartView`
- `createHorizontalLinesData(long newMaxHeight, long newMinHeight, int formatter)` -> `ChartHorizontalLinesData`
- `createLineViewData(ChartData.Line line)` -> `LineViewData`
- `drawChart(Canvas canvas)` -> `void`
- `drawPickerChart(Canvas canvas)` -> `void`
- `drawSelection(Canvas canvas)` -> `void`
- `drawSignaturesToHorizontalLines(Canvas canvas, ChartHorizontalLinesData a)` -> `void`
- `findMaxValue(int startXIndex, int endXIndex)` -> `long`
- `findMinValue(int startXIndex, int endXIndex)` -> `long`
- `init()` -> `void`
- `updatePickerMinMaxHeight()` -> `void`

## `org.telegram.ui.Charts.LinearBarChartView`
- `createLineViewData(ChartData.Line line)` -> `LineViewData`
- `drawChart(Canvas canvas)` -> `void`
- `drawPickerChart(Canvas canvas)` -> `void`
- `init()` -> `void`

## `org.telegram.ui.Charts.LinearChartView`
- `createLineViewData(ChartData.Line line)` -> `LineViewData`
- `drawChart(Canvas canvas)` -> `void`
- `drawPickerChart(Canvas canvas)` -> `void`
- `init()` -> `void`

## `org.telegram.ui.Charts.PieChartView`
- `createLegendView()` -> `LegendSignatureView`
- `createLineViewData(ChartData.Line line)` -> `PieChartViewData`
- `drawBottomLine(Canvas canvas)` -> `void`
- `drawBottomSignature(Canvas canvas)` -> `void`
- `drawChart(Canvas canvas)` -> `void`
- `drawHorizontalLines(Canvas canvas, ChartHorizontalLinesData a)` -> `void`
- `drawPickerChart(Canvas canvas)` -> `void`
- `drawSelection(Canvas canvas)` -> `void`
- `drawSignaturesToHorizontalLines(Canvas canvas, ChartHorizontalLinesData a)` -> `void`
- `fillTransitionParams(TransitionParams params)` -> `void`
- `onActionUp()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onPickerDataChanged(boolean animated, boolean force, boolean useAnimator)` -> `void`
- `onPickerJumpTo(float start, float end, boolean force)` -> `void`
- `selectXOnChart(int x, int y)` -> `void`
- `setData(StackLinearChartData chartData)` -> `boolean`
- `updatePicker(ChartData chartData, long d)` -> `void`

## `org.telegram.ui.Charts.StackBarChartView`
- `createLineViewData(ChartData.Line line)` -> `StackBarViewData`
- `drawChart(Canvas canvas)` -> `void`
- `drawPickerChart(Canvas canvas)` -> `void`
- `drawSelection(Canvas canvas)` -> `void`
- `findMaxValue(int startXIndex, int endXIndex)` -> `long`
- `getMinDistance()` -> `float`
- `initPickerMaxHeight()` -> `void`
- `onCheckChanged()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `selectXOnChart(int x, int y)` -> `void`
- `updatePickerMinMaxHeight()` -> `void`

## `org.telegram.ui.Charts.StackLinearChartView`
- `createLineViewData(ChartData.Line line)` -> `T`
- `drawChart(Canvas canvas)` -> `void`
- `drawPickerChart(Canvas canvas)` -> `void`
- `fillTransitionParams(TransitionParams params)` -> `void`
- `findMaxValue(int startXIndex, int endXIndex)` -> `long`
- `getMinDistance()` -> `float`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.Charts.data.ChartData`
- `findEndIndex(int left, float v)` -> `int`
- `findIndex(int left, int right, float v)` -> `int`
- `findStartIndex(float v)` -> `int`
- `getDayString(int i)` -> `String`
- `getFormatter(String value)` -> `int`
- `measure()` -> `void`

## `org.telegram.ui.Charts.data.DoubleLinearChartData`
- `measure()` -> `void`

## `org.telegram.ui.Charts.data.StackBarChartData`
- `findMax(int start, int end)` -> `long`
- `init()` -> `void`

## `org.telegram.ui.Charts.data.StackLinearChartData`
- `measure()` -> `void`

## `org.telegram.ui.Charts.view_data.BarViewData`
- `updateColors()` -> `void`

## `org.telegram.ui.Charts.view_data.ChartHeaderView`
- `recolor()` -> `void`
- `setDates(long start, long end)` -> `void`
- `setTitle(String s)` -> `void`
- `setUseWeekInterval(boolean useWeekInterval)` -> `void`
- `showDate(boolean b)` -> `void`
- `zoomOut(BaseChartView chartView, boolean animated)` -> `void`
- `zoomTo(BaseChartView chartView, long d, boolean animate)` -> `void`

## `org.telegram.ui.Charts.view_data.ChartHorizontalLinesData`
- `drawText(Canvas canvas, int a, int i, float x, float y, TextPaint paint)` -> `void`
- `format(int a, TextPaint paint, long v, int formatter)` -> `CharSequence`
- `static lookupHeight(long maxValue)` -> `long`

## `org.telegram.ui.Charts.view_data.LegendSignatureView`
- `formatWholeNumber(long v, int formatter, int formatterIndex, TextView textView, float k)` -> `CharSequence`
- `recolor()` -> `void`
- `setSize(int n)` -> `void`
- `setUseWeek(boolean useWeek)` -> `void`
- `showProgress(boolean show, boolean force)` -> `void`

## `org.telegram.ui.Charts.view_data.LineViewData`
- `updateColors()` -> `void`

## `org.telegram.ui.Charts.view_data.PieLegendView`
- `recolor()` -> `void`
- `setData(String name, int value, int color)` -> `void`
- `setData(int index, long date, ArrayList<LineViewData> lines)` -> `void`
- `setSize(int n)` -> `void`

## `org.telegram.ui.Charts.view_data.StackBarViewData`
- `updateColors()` -> `void`

## `org.telegram.ui.ChatBackgroundDrawable`
- `static createThumb(TLRPC.WallPaper wallPaper)` -> `Drawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getDimAmount()` -> `float`
- `getDrawable(boolean prioritizeThumb)` -> `Drawable`
- `getOpacity()` -> `int`
- `static getOrCreate(Drawable backgroundDrawable, TLRPC.WallPaper wallpaper, boolean themeIsDark)` -> `Drawable`
- `onAttachedToWindow(View view)` -> `void`
- `onDetachedFromWindow(View view)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setParent(View parent)` -> `void`

## `org.telegram.ui.ChatEditActivity`
- `static applyNewSpan(String str)` -> `CharSequence`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `didStartUpload(boolean fromAvatarConstructor, boolean isVideo)` -> `void`
- `didUploadPhoto(final TLRPC.InputFile photo, final TLRPC.InputFile video, double videoStartTimestamp, String videoPath, final TLRPC.PhotoSize bigSize, final TLRPC.PhotoSize smallSize, boolean isVideo, TLRPC.VideoSize emojiMarkup)` -> `void`
- `dismissCurrentDialog()` -> `void`
- `dismissDialogOnPause(Dialog dialog)` -> `boolean`
- `getInitialSearchString()` -> `String`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSupportEdgeToEdge()` -> `boolean`
- `onActivityResultFragment(int requestCode, int resultCode, Intent data)` -> `void`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onBecomeFullyHidden()` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onPause()` -> `void`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `onUploadProgressChanged(float progress)` -> `void`
- `openSetPhotoAlert()` -> `void`
- `restoreSelfArgs(Bundle args)` -> `void`
- `setInfo(TLRPC.UserFull userFull)` -> `void`
- `setInfo(TLRPC.ChatFull chatFull)` -> `void`
- `showConvertTooltip()` -> `void`
- `updateColorCell()` -> `void`
- `updateSuggestedCell(boolean animated)` -> `void`
- `updateSuggestedCell(Long forced, boolean animated)` -> `void`

## `org.telegram.ui.ChatEditTypeActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSupportEdgeToEdge()` -> `boolean`
- `onBecomeFullyVisible()` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onResume()` -> `void`
- `setInfo(TLRPC.ChatFull chatFull)` -> `void`

## `org.telegram.ui.ChatEditTypeActivity$UsernamesListView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthSpec, int heightSpec)` -> `void`
- `toggleUsername(TLRPC.TL_username username, boolean newActive)` -> `void`
- `toggleUsername(TLRPC.TL_username username, boolean newActive, boolean shake)` -> `void`
- `toggleUsername(int position, boolean newActive)` -> `void`
- `toggleUsername(int position, boolean newActive, boolean shake)` -> `void`

## `org.telegram.ui.ChatEditTypeActivity$UsernamesListView$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(ViewHolder holder)` -> `boolean`
- `moveElement(int fromIndex, int toIndex)` -> `void`
- `onBindViewHolder(@NonNull ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `ViewHolder`
- `swapElements(int fromIndex, int toIndex)` -> `void`

## `org.telegram.ui.ChatLinkActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onResume()` -> `void`
- `setInfo(TLRPC.ChatFull chatFull)` -> `void`

## `org.telegram.ui.ChatLinkActivity$EmptyView`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`

## `org.telegram.ui.ChatLinkActivity$HintInnerCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.ChatLinkActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewRecycled(RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.ChatLinkActivity$SearchAdapter`
- `getItem(int i)` -> `TLRPC.Chat`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewRecycled(RecyclerView.ViewHolder holder)` -> `void`
- `searchDialogs(final String query)` -> `void`

## `org.telegram.ui.ChatPullingDownDrawable`
- `animationIsRunning()` -> `boolean`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `draw(Canvas canvas, View parent, float progress, float alpha)` -> `void`
- `drawBottomPanel(Canvas canvas, int top, int bottom, int width)` -> `void`
- `getChatId()` -> `long`
- `getTopic()` -> `TLRPC.TL_forumTopic`
- `needDrawBottomPanel()` -> `boolean`
- `onAttach()` -> `void`
- `onDetach()` -> `void`
- `reset()` -> `void`
- `runOnAnimationFinish(Runnable runnable)` -> `void`
- `setWidth(int width)` -> `void`
- `updateDialog(TLRPC.Chat chat)` -> `void`
- `updateDialog()` -> `void`
- `updateTopic()` -> `void`

## `org.telegram.ui.ChatRightsEditActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static emptyAdminRights(boolean value)` -> `TLRPC.TL_chatAdminRights`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onResume()` -> `void`
- `static rightsOR(TLRPC.TL_chatAdminRights a, TLRPC.TL_chatAdminRights b)` -> `TLRPC.TL_chatAdminRights`
- `setDelegate(ChatRightsEditActivityDelegate channelRightsEditActivityDelegate)` -> `void`
- `setLoading(boolean newLoading)` -> `void`

## `org.telegram.ui.ChatRightsEditActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemId(int position)` -> `long`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(RecyclerView.ViewHolder holder)` -> `void`
- `onViewDetachedFromWindow(RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.ChatUsersActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static getChannelAdminParticipantType(TLObject participant)` -> `int`
- `getSelectType()` -> `int`
- `static getSendMediaSelectedCount(TLRPC.TL_chatBannedRights bannedRights)` -> `int`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSupportEdgeToEdge()` -> `boolean`
- `needDelayOpenAnimation()` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onBecomeFullyHidden()` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `setDelegate(ChatUsersActivityDelegate chatUsersActivityDelegate)` -> `void`
- `setIgnoresUsers(LongSparseArray<TLRPC.GroupCallParticipant> participants)` -> `void`
- `setInfo(TLRPC.ChatFull chatFull)` -> `void`
- `static sortAdmins(ArrayList<TLObject> participants)` -> `void`
- `updateListAnimated(DiffCallback savedState)` -> `void`

## `org.telegram.ui.ChatUsersActivity$ChatUsersActivityDelegate`
- `didAddParticipantToList(long uid, TLObject participant)` -> `default void`
- `didChangeOwner(TLRPC.User user)` -> `default void`
- `didKickParticipant(long userId)` -> `default void`
- `didSelectUser(long uid)` -> `default void`

## `org.telegram.ui.ChatUsersActivity$ListAdapter`
- `getItem(int position)` -> `TLObject`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewRecycled(RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.ChatUsersActivity$SearchAdapter`
- `getItem(int i)` -> `TLObject`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewRecycled(RecyclerView.ViewHolder holder)` -> `void`
- `searchUsers(final String query)` -> `void`

## `org.telegram.ui.ChatsWidgetConfigActivity`
- `handleIntent(Intent intent, boolean isNew, boolean restore, boolean fromPassword, int intentAccount, int state)` -> `boolean`

## `org.telegram.ui.ChooseDownloadQualityLayout`
- `update(MessageObject messageObject)` -> `boolean`

## `org.telegram.ui.ChooseQualityLayout`
- `update(VideoPlayer player)` -> `boolean`

## `org.telegram.ui.ChooseQualityLayout$QualityIcon`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setCasting(boolean casting, boolean animated)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setRotation(float rotation)` -> `void`

## `org.telegram.ui.ChooseSpeedLayout`
- `update(float currentVideoSpeed, boolean isFinal)` -> `void`

## `org.telegram.ui.CodeFieldContainer`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getCode()` -> `String`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setCode(String savedCode)` -> `void`
- `setNumbersCount(int length, int currentType)` -> `void`
- `setText(String code)` -> `void`
- `setText(String code, boolean fromPaste)` -> `void`

## `org.telegram.ui.CodeNumberField`
- `animateErrorProgress(float newProgress)` -> `void`
- `animateFocusedProgress(float newProgress)` -> `void`
- `animateSuccessProgress(float newProgress)` -> `void`
- `getErrorProgress()` -> `float`
- `getFocusedProgress()` -> `float`
- `getSuccessProgress()` -> `float`
- `getSuccessScaleProgress()` -> `float`
- `onDetachedFromWindow()` -> `void`
- `onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setShowSoftInputOnFocusCompat(boolean showSoftInputOnFocus)` -> `void`
- `startEnterAnimation(boolean replace)` -> `void`
- `startExitAnimation()` -> `void`

## `org.telegram.ui.Components.AIEditorAlert`
- `static copy(CharSequence c)` -> `CharSequence`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `static formatStyled(TL_iv.RichMessage richMessage)` -> `CharSequence`
- `getTitle()` -> `CharSequence`
- `onActionBarAlpha(float alpha)` -> `void`
- `onContainerViewTranslation()` -> `void`
- `setOnSend(long dialogId, boolean editing, Utilities.Callback4<CharSequence, Integer, Integer, Boolean> onSend)` -> `AIEditorAlert`
- `setOnSendRich(long dialogId, Utilities.Callback4<TL_iv.RichMessage, Integer, Integer, Boolean> onSend)` -> `AIEditorAlert`
- `setOnUse(Utilities.Callback<CharSequence> onUse)` -> `AIEditorAlert`
- `setOnUseRich(Utilities.Callback<TL_iv.RichMessage> onUseRich)` -> `AIEditorAlert`
- `setText(TL_iv.RichMessage richMessage)` -> `AIEditorAlert`
- `setText(String from_lang, CharSequence text)` -> `AIEditorAlert`
- `setText(CharSequence text)` -> `AIEditorAlert`
- `show()` -> `void`
- `static showStylesLimitToast(BulletinFactory bulletinFactory, int currentAccount)` -> `void`

## `org.telegram.ui.Components.AIEditorAlert$AiStyleAlert`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `getTitle()` -> `CharSequence`
- `onActionBarAlpha(float alpha)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.Components.AIEditorAlert$CreateAiStyleAlert`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `getTitle()` -> `CharSequence`
- `onSmoothContainerViewLayout(float ty)` -> `void`
- `setEditing(TL_aicompose.TL_aiComposeTone tone)` -> `CreateAiStyleAlert`
- `setOnToneCreated(Utilities.Callback<TL_aicompose.AiComposeTone> listener)` -> `CreateAiStyleAlert`
- `setOnToneEdited(Utilities.Callback<TL_aicompose.AiComposeTone> listener)` -> `CreateAiStyleAlert`

## `org.telegram.ui.Components.AIEditorAlert$LimitSpan`
- `draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, @NonNull Paint paint)` -> `void`
- `getSize(@NonNull Paint paint, CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm)` -> `int`

## `org.telegram.ui.Components.AIEditorAlert$Tabs`
- `clearTabs()` -> `void`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `getSelectedTab()` -> `int`
- `getSelectedTone()` -> `TL_aicompose.AiComposeTone`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `selectTab(int tab)` -> `void`
- `selectTab(int tab, boolean animated)` -> `void`
- `selectTone(TL_aicompose.AiComposeTone tone)` -> `void`
- `selectTone(TL_aicompose.AiComposeTone tone, boolean animated)` -> `void`
- `setDivider(boolean divider)` -> `void`
- `setOnItemLongClick(Utilities.CallbackReturn<Tab, Boolean> onLongClick)` -> `Tabs`
- `setPadding(int left, int top, int right, int bottom)` -> `void`
- `setRoundRadius(int roundRadiusDp)` -> `void`

## `org.telegram.ui.Components.AIEditorAlert$Tabs$Tab`
- `set(int iconResId, CharSequence text)` -> `void`
- `set(final String emoji, CharSequence text, Long documentId)` -> `void`
- `setRoundRadius(int roundRadiusDp)` -> `Tab`
- `updateColors()` -> `void`
- `updateSelected(float selected, boolean force)` -> `void`

## `org.telegram.ui.Components.ActivityWindowEmptyBackgroundDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getAlpha()` -> `int`
- `getColorFilter()` -> `ColorFilter`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.AdminLogFilterAlert2`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTitle()` -> `CharSequence`
- `onClick(UItem item, View view, float x)` -> `void`
- `onSmoothContainerViewLayout(float ty)` -> `void`
- `setAdminLogFilterAlertDelegate(AdminLogFilterAlertDelegate adminLogFilterAlertDelegate)` -> `void`
- `setCurrentAdmins(ArrayList<TLRPC.ChannelParticipant> admins)` -> `void`

## `org.telegram.ui.Components.AiButtonDrawable`
- `animate()` -> `void`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.AlertsCreator`
- `static createAccountSelectDialog(Activity parentActivity, final AccountSelectDelegate delegate)` -> `AlertDialog`
- `static createApkRestrictedDialog(Context ctx, Theme.ResourcesProvider resourcesProvider)` -> `Dialog`
- `static createAutoDeleteDatePickerDialog(Context context, int type, Theme.ResourcesProvider resourcesProvider, final ScheduleDatePickerDelegate datePickerDelegate)` -> `BottomSheet.Builder`
- `static createBackgroundActivityDialog(Context ctx)` -> `Dialog`
- `static createBackgroundLocationPermissionDialog(Activity activity, TLRPC.User selfUser, Runnable cancelRunnable, Theme.ResourcesProvider resourcesProvider)` -> `AlertDialog.Builder`
- `static createBlockDialogAlert(BaseFragment fragment, int count, boolean reportSpam, TLRPC.User user, BlockDialogCallback onProcessRunnable)` -> `void`
- `static createBotLaunchAlert(BaseFragment fragment, TLRPC.User user, Runnable onConfirm, Runnable onDismiss)` -> `void`
- `static createBotLaunchAlert(BaseFragment fragment, AtomicBoolean allowWrite, TLRPC.User user, Runnable loadBotSheet)` -> `void`
- `static createCalendarPickerDialog(Context context, long minDate, final MessagesStorage.IntCallback callback, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet.Builder`
- `static createCallDialogAlert(BaseFragment fragment, TLRPC.User user, boolean videoCall)` -> `void`
- `static createChangeBioAlert(String currentBio, long peerId, Context context, int currentAccount)` -> `void`
- `static createChangeNameAlert(long peerId, Context context, int currentAccount)` -> `void`
- `static createClearDaysDialogAlert(BaseFragment fragment, int days, TLRPC.User user, TLRPC.Chat chat, boolean canDeleteHistory, MessagesStorage.BooleanCallback onProcessRunnable, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static createClearOrDeleteDialogAlert(BaseFragment fragment, boolean clear, TLRPC.Chat chat, TLRPC.User user, boolean secret, boolean canDeleteHistory, MessagesStorage.BooleanCallback onProcessRunnable)` -> `void`
- `static createClearOrDeleteDialogAlert(BaseFragment fragment, boolean clear, TLRPC.Chat chat, TLRPC.User user, boolean secret, boolean checkDeleteForAll, boolean forceDeleteForAll, boolean canDeleteHistory, MessagesStorage.BooleanCallback onProcessRunnable)` -> `void`
- `static createClearOrDeleteDialogsAlert(BaseFragment fragment, boolean clear, boolean canDeleteHistory, int canClearCacheCount, int count, boolean hasDialogsToRevoke, MessagesStorage.BooleanCallback onProcessRunnable, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static createColorSelectDialog(Activity parentActivity, final long dialog_id, final int topicId, final int globalType, final Runnable onSelect)` -> `Dialog`
- `static createColorSelectDialog(Activity parentActivity, final long dialog_id, final long topicId, final int globalType, final Runnable onSelect, Theme.ResourcesProvider resourcesProvider)` -> `Dialog`
- `static createContactInviteDialog(BaseFragment parentFragment, String fisrtName, String lastName, String phone)` -> `void`
- `static createContactsPermissionDialog(Activity parentActivity, MessagesStorage.IntCallback callback)` -> `AlertDialog.Builder`
- `static createCustomPicker(Context context, String title, int selected, String[] positions, final Utilities.Callback<Integer> whenPicked)` -> `BottomSheet`
- `static createDatePickerDialog(Context context, int minYear, int maxYear, int currentYearDiff, int selectedDay, int selectedMonth, int selectedYear, String title, final boolean checkMinDate, final DatePickerDelegate datePickerDelegate)` -> `AlertDialog.Builder`
- `static createDatePickerDialog(Context context, String title, String button, long currentDate, final ScheduleDatePickerDelegate datePickerDelegate)` -> `BottomSheet.Builder`
- `static createDeleteMessagesAlert(BaseFragment fragment, TLRPC.User user, TLRPC.Chat chat, TLRPC.EncryptedChat encryptedChat, TLRPC.ChatFull chatInfo, long mergeDialogId, MessageObject selectedMessage, SparseArray<MessageObject>[] selectedMessages, MessageObject.GroupedMessages selectedGroup, int topicId, int mode, TLRPC.ChannelParticipant[] channelParticipants, Runnable onDelete, Runnable hideDim, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static createDrawOverlayGroupCallPermissionDialog(Context context)` -> `AlertDialog.Builder`
- `static createDrawOverlayPermissionDialog(Activity activity, AlertDialog.OnButtonClickListener onCancel)` -> `AlertDialog.Builder`
- `static createDrawOverlayPermissionDialog(Activity activity, AlertDialog.OnButtonClickListener onCancel, boolean allowPictureInPicture)` -> `AlertDialog.Builder`
- `static createForgotPasscodeDialog(Context ctx)` -> `Dialog`
- `static createFormattedDatePickerDialog(Context context, final FormattedDatePickerDelegate datePickerDelegate, final Runnable cancelRunnable, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet.Builder`
- `static createFreeSpaceDialog(final LaunchActivity parentActivity)` -> `Dialog`
- `static createGigagroupConvertAlert(Activity activity, AlertDialog.OnButtonClickListener onProcess, AlertDialog.OnButtonClickListener onCancel)` -> `AlertDialog.Builder`
- `static createImportDialogAlert(BaseFragment fragment, String title, String message, TLRPC.User user, TLRPC.Chat chat, Runnable onProcessRunnable)` -> `void`
- `static createLanguageAlert(LaunchActivity activity, final TLRPC.TL_langPackLanguage language)` -> `AlertDialog.Builder`
- `static createLocationRequiredDialog(Context ctx, boolean friends)` -> `Dialog`
- `static createLocationUpdateDialog(final Activity parentActivity, boolean expand, TLRPC.User user, final MessagesStorage.IntCallback callback, Theme.ResourcesProvider resourcesProvider)` -> `Dialog`
- `static createMuteAlert(BaseFragment fragment, final long dialog_id, long topicId, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet`
- `static createMuteAlert(BaseFragment fragment, ArrayList<Long> dialog_ids, int topicId, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet`
- `static createMuteForPickerDialog(Context context, Theme.ResourcesProvider resourcesProvider, final ScheduleDatePickerDelegate datePickerDelegate)` -> `BottomSheet.Builder`
- `static createNoAccessAlert(Context context, String title, String message, Theme.ResourcesProvider resourcesProvider)` -> `AlertDialog.Builder`
- `static createPollCloseDatePickerDialog(Context context, long currentDate, final ScheduleDatePickerDelegate datePickerDelegate, final Runnable cancelRunnable, final ScheduleDatePickerColors datePickerColors, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet.Builder`
- `static createPopupSelectDialog(Activity parentActivity, final int globalType, final Runnable onSelect)` -> `Dialog`
- `static createPrioritySelectDialog(Activity parentActivity, final long dialog_id, int topicId, final int globalType, final Runnable onSelect)` -> `Dialog`
- `static createPrioritySelectDialog(Activity parentActivity, final long dialog_id, long topicId, final int globalType, final Runnable onSelect, Theme.ResourcesProvider resourcesProvider)` -> `Dialog`
- `static createReportPhotoAlert(final int currentAccount, final Context context, final long dialog_id, TLRPC.Photo photo, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static createScheduleDatePickerDialog(Context context, long dialogId, final ScheduleDatePickerDelegate datePickerDelegate)` -> `BottomSheet.Builder`
- `static createScheduleDatePickerDialog(Context context, long dialogId, final ScheduleDatePickerDelegate datePickerDelegate, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet.Builder`
- `static createScheduleDatePickerDialog(Context context, long dialogId, final ScheduleDatePickerDelegate datePickerDelegate, final ScheduleDatePickerColors datePickerColors)` -> `BottomSheet.Builder`
- `static createScheduleDatePickerDialog(Context context, long dialogId, final ScheduleDatePickerDelegate datePickerDelegate, final Runnable cancelRunnable, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet.Builder`
- `static createScheduleDatePickerDialog(Context context, String forcedTitle, long dialogId, long currentDate, boolean doNotShowReminder, final ScheduleDatePickerDelegate datePickerDelegate, final Runnable cancelRunnable)` -> `BottomSheet.Builder`
- `static createScheduleDatePickerDialog(Context context, long dialogId, long currentDate, final ScheduleDatePickerDelegate datePickerDelegate, final Runnable cancelRunnable)` -> `BottomSheet.Builder`
- `static createScheduleDatePickerDialog(Context context, long dialogId, long currentDate, int currentRepeatPeriod, final ScheduleDatePickerDelegate datePickerDelegate, final Runnable cancelRunnable, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet.Builder`
- `static createScheduleDatePickerDialog(Context context, long dialogId, long currentDate, int currentRepeatPeriod, final ScheduleDatePickerDelegate datePickerDelegate, final Runnable cancelRunnable, final ScheduleDatePickerColors datePickerColors, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet.Builder`
- `static createScheduleDatePickerDialog(Context context, long dialogId, long currentDate, int currentRepeatPeriod, boolean doNotShowReminder, final ScheduleDatePickerDelegate datePickerDelegate, final Runnable cancelRunnable, final ScheduleDatePickerColors datePickerColors, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet.Builder`
- `static createScheduleDatePickerDialog(Context context, String forcedTitle, long dialogId, long currentDate, int currentRepeatPeriod, boolean doNotShowReminder, final ScheduleDatePickerDelegate datePickerDelegate, final Runnable cancelRunnable, final ScheduleDatePickerColors datePickerColors, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet.Builder`
- `static createSimpleAlert(Context context, final String text)` -> `AlertDialog.Builder`
- `static createSimpleAlert(Context context, final String title, final String text)` -> `AlertDialog.Builder`
- `static createSimpleAlert(Context context, final String title, final String text, Theme.ResourcesProvider resourcesProvider)` -> `AlertDialog.Builder`
- `static createSimpleAlert(Context context, final String title, final String text, String positiveButton, Runnable positive, Theme.ResourcesProvider resourcesProvider)` -> `AlertDialog.Builder`
- `static createSimpleConfirmAlert(Context context, Theme.ResourcesProvider resourcesProvider, final String title, final CharSequence text, final String confirm, final Runnable onConfirm)` -> `AlertDialog`
- `static createSimplePopup(BaseFragment fragment, View popupView, View anhcorView, float x, float y)` -> `ActionBarPopupWindow`
- `static createSimpleTextInputAlert(Context context, BaseFragment fragment, final String title, final String info, final String hint, final String name, int maxLength, String positiveButton, Theme.ResourcesProvider resourcesProvider, MessagesStorage.StringCallback whenDone)` -> `void`
- `static createSingleChoiceDialog(Activity parentActivity, final String[] options, final String title, final int selected, final DialogInterface.OnClickListener listener)` -> `Dialog`
- `static createSoundFrequencyPickerDialog(Context context, int notifyMaxCount, int notifyDelay, final SoundFrequencyDelegate delegate)` -> `BottomSheet.Builder`
- `static createSoundFrequencyPickerDialog(Context context, int notifyMaxCount, int notifyDelay, final SoundFrequencyDelegate delegate, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet.Builder`
- `static createStatusUntilDatePickerDialog(Context context, long currentDate, final StatusUntilDatePickerDelegate delegate)` -> `BottomSheet.Builder`
- `static createStoriesAlbumEnterName(Context context, BaseFragment fragment, final String title, final String info, final String hint, final String name, String positiveButton, Theme.ResourcesProvider resourcesProvider, MessagesStorage.StringCallback whenDone)` -> `void`
- `static createStoriesAlbumEnterNameForCreate(Context context, BaseFragment fragment, Theme.ResourcesProvider resourcesProvider, MessagesStorage.StringCallback whenDone)` -> `void`
- `static createStoriesAlbumEnterNameForRename(Context context, BaseFragment fragment, String oldName, Theme.ResourcesProvider resourcesProvider, MessagesStorage.StringCallback whenDone)` -> `void`
- `static createSuggestedMessageDatePickerDialog(Context context, long currentDate, final ScheduleDatePickerDelegate datePickerDelegate, Theme.ResourcesProvider resourcesProvider, int mode)` -> `BottomSheet.Builder`
- `static createSuggestedMessageDatePickerDialog(Context context, long currentDate, final ScheduleDatePickerDelegate datePickerDelegate, final Runnable cancelRunnable, final ScheduleDatePickerColors datePickerColors, Theme.ResourcesProvider resourcesProvider, int mode)` -> `BottomSheet.Builder`
- `static createSupportAlert(BaseFragment fragment, Theme.ResourcesProvider resourcesProvider)` -> `AlertDialog`
- `static createTTLAlert(final Context context, final TLRPC.EncryptedChat encryptedChat, Theme.ResourcesProvider resourcesProvider)` -> `AlertDialog.Builder`
- `static createThemeCreateDialog(BaseFragment fragment, int type, Theme.ThemeInfo switchToTheme, Theme.ThemeAccent switchToAccent)` -> `void`
- `static createTimePickerDialog(Context context, String title, int time, int minTime, int maxTime, final Utilities.Callback<Integer> whenPicked)` -> `BottomSheet`
- `static createTimezonePickerDialog(Context context, String title, String timezoneId, final Utilities.Callback<String> whenPicked)` -> `BottomSheet`
- `static createVibrationSelectDialog(Activity parentActivity, final long dialogId, long topicId, final boolean globalGroup, final boolean globalAll, final Runnable onSelect)` -> `Dialog`
- `static createVibrationSelectDialog(Activity parentActivity, final long dialogId, long topicId, final boolean globalGroup, final boolean globalAll, final Runnable onSelect, Theme.ResourcesProvider resourcesProvider)` -> `Dialog`
- `static createVibrationSelectDialog(Activity parentActivity, final long dialogId, long topicId, final String prefKeyPrefix, final Runnable onSelect)` -> `Dialog`
- `static createVibrationSelectDialog(Activity parentActivity, final long dialogId, long topicId, final String prefKeyPrefix, final Runnable onSelect, Theme.ResourcesProvider resourcesProvider)` -> `Dialog`
- `static createWebViewPermissionsRequestDialog(Context ctx, Theme.ResourcesProvider resourcesProvider, String[] systemPermissions, @RawRes int animationId, String title, String titleWithHint, Consumer<Boolean> callback)` -> `Dialog`
- `static ensurePaidMessageConfirmation(int currentAccount, long dialogId, int count, Utilities.Callback<Long> confirmedPrice)` -> `boolean`
- `static ensurePaidMessageConfirmation(int currentAccount, long dialogId, int count, Utilities.Callback<Long> confirmedPrice, long stars)` -> `boolean`
- `static ensurePaidMessagesMultiConfirmation(int currentAccount, ArrayList<Long> dialogIds, int messagesCount, Utilities.Callback<HashMap<Long, Long>> confirmed)` -> `boolean`
- `static ensurePaidMessagesMultiConfirmationTopicKeys(int currentAccount, ArrayList<MessagesStorage.TopicKey> topicKeys, int messagesCount, Utilities.Callback<HashMap<Long, Long>> confirmed)` -> `boolean`
- `static needsPaidMessageAlert(int currentAccount, long dialogId)` -> `boolean`
- `static showAddLinkToPoll(Context context, Theme.ResourcesProvider resourcesProvider, String existingUrl, TLRPC.WebPage webPage, Utilities.Callback<String> whenDone, @Nullable Runnable onDelete)` -> `void`
- `static showAddUserAlert(TLRPC.TL_error error, final BaseFragment fragment, boolean isChannel, boolean isCommunity, TLObject request)` -> `void`
- `static showAlertWithCheckbox(Context context, CharSequence title, CharSequence message, CharSequence check, CharSequence button, Utilities.Callback<Boolean> onAction, Theme.ResourcesProvider resourcesProvider)` -> `AlertDialog`
- `static showAlertWithCheckbox(Context context, CharSequence title, CharSequence message, CharSequence check, CharSequence button, Utilities.Callback<Boolean> onAction, Theme.ResourcesProvider resourcesProvider, boolean withBalance)` -> `AlertDialog`
- `static showAlertWithCheckboxWithBalance(Context context, CharSequence title, CharSequence message, CharSequence check, CharSequence button, Utilities.Callback<Boolean> onAction, Theme.ResourcesProvider resourcesProvider)` -> `AlertDialog`
- `static showBlockReportSpamAlert(BaseFragment fragment, long dialog_id, TLRPC.User currentUser, TLRPC.Chat currentChat, TLRPC.EncryptedChat encryptedChat, boolean isLocation, TLRPC.ChatFull chatInfo, MessagesStorage.IntCallback callback, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static showBlockReportSpamReplyAlert(ChatActivity fragment, MessageObject messageObject, long peerId, Theme.ResourcesProvider resourcesProvider, Runnable hideDim)` -> `void`
- `static showCallsForbidden(Context context, int currentAccount, long dialogId, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static showChatWithAdmin(BaseFragment fragment, TLRPC.User user, String chatWithAdmin, boolean isChannel, int chatWithAdminDate)` -> `void`
- `static showCustomNotificationsDialog(BaseFragment parentFragment, long did, int topicId, int globalType, ArrayList<NotificationsSettingsActivity.NotificationException> exceptions, ArrayList<NotificationsSettingsActivity.NotificationException> autoExceptions, int currentAccount, MessagesStorage.IntCallback callback)` -> `void`
- `static showCustomNotificationsDialog(BaseFragment parentFragment, long did, int topicId, int globalType, ArrayList<NotificationsSettingsActivity.NotificationException> exceptions, ArrayList<NotificationsSettingsActivity.NotificationException> autoExceptions, int currentAccount, MessagesStorage.IntCallback callback, MessagesStorage.IntCallback resultCallback)` -> `void`
- `static showDeclineSuggestedPostDialog(BaseFragment fragment, long author_did, boolean useDecor, Utilities.Callback<String> onDecline)` -> `void`
- `static showDisableSharingInfo(Context context, Theme.ResourcesProvider resourcesProvider, Runnable onClick)` -> `void`
- `static showDiscardTopicDialog(BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, Runnable onDiscard)` -> `void`
- `static showFloodWaitAlert(String error, final BaseFragment fragment)` -> `void`
- `static showGiftThemeApplyConfirm(Context context, Theme.ResourcesProvider resourcesProvider, int currentAccount, TL_stars.StarGift gift, long dialogId, Runnable onConfirm)` -> `void`
- `static showLeaveGroupWithFutureOwner(BaseFragment fragment, TLRPC.Chat chat, TLRPC.User futureCreator, Runnable onAppointNewOwner, Runnable onLeave)` -> `void`
- `static showOpenUrlAlert(BaseFragment fragment, String url, boolean punycode, boolean ask)` -> `void`
- `static showOpenUrlAlert(BaseFragment fragment, String url, boolean punycode, boolean ask, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static showOpenUrlAlert(BaseFragment fragment, String url, boolean punycode, boolean tryTelegraph, boolean ask, Browser.Progress progress, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static showOpenUrlAlert(BaseFragment fragment, String url, boolean punycode, boolean tryTelegraph, boolean ask, boolean forceNotInternalForApps, Browser.Progress progress, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static showOpenUrlAlert(Context context, String url, boolean punycode, boolean tryTelegraph, boolean ask, boolean forceNotInternalForApps, long inlineReturn, Browser.Progress progress, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static showOpenUrlAlert(BaseFragment fragment, String url, boolean punycode, boolean tryTelegraph, boolean ask, boolean forceNotInternalForApps, Browser.Progress progress, @Nullable TLRPC.WebPage webPage, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static showOpenUrlAlert(Context context, String url, boolean punycode, boolean tryTelegraph, boolean ask, boolean forceNotInternalForApps, long inlineReturn, Browser.Progress progress, @Nullable TLRPC.WebPage webPage, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static showPayForMessageAlert(int currentAccount, long dialogId, long stars, int messagesCount, Runnable confirmed)` -> `void`
- `static showPopupMenu(ActionBarPopupWindow.ActionBarPopupWindowLayout popupLayout, View anchorView, int offsetX, int offsetY)` -> `ActionBarPopupWindow`
- `static showSecretLocationAlert(Context context, int currentAccount, final Runnable onSelectRunnable, boolean inChat, Theme.ResourcesProvider resourcesProvider)` -> `AlertDialog`
- `static showSendMediaAlert(int result, final BaseFragment fragment, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static showSimpleAlert(BaseFragment baseFragment, final String text)` -> `Dialog`
- `static showSimpleAlert(BaseFragment baseFragment, final String title, final String text)` -> `Dialog`
- `static showSimpleAlert(BaseFragment baseFragment, final String title, final String text, Theme.ResourcesProvider resourcesProvider)` -> `Dialog`
- `static showSimpleConfirmAlert(Context context, Theme.ResourcesProvider resourcesProvider, final String title, final CharSequence text, final String confirm, final boolean confirmIsRed, final Runnable onConfirm)` -> `AlertDialog`
- `static showSimpleConfirmAlert(BaseFragment baseFragment, final String title, final CharSequence text, final String confirm, final boolean confirmIsRed, final Runnable onConfirm)` -> `AlertDialog`
- `static showSimpleToast(BaseFragment baseFragment, final String text)` -> `Toast`
- `static showUpdateAppAlert(final Context context, final String text, boolean updateApp)` -> `AlertDialog`

## `org.telegram.ui.Components.AnchorSpan`
- `getName()` -> `String`
- `updateDrawState(TextPaint tp)` -> `void`
- `updateMeasureState(TextPaint p)` -> `void`

## `org.telegram.ui.Components.AnimationProperties$FloatProperty`
- `set(T object, Float value)` -> `void`

## `org.telegram.ui.Components.AnimationProperties$IntProperty`
- `set(T object, Integer value)` -> `void`

## `org.telegram.ui.Components.ArchiveHelp`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Components.AttachBotIntroTopView`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `setAttachBot(TLRPC.TL_attachMenuBot bot)` -> `void`
- `setBackgroundColor(int color)` -> `void`
- `setColor(int color)` -> `void`

## `org.telegram.ui.Components.AttachableDrawable`
- `setParent(View view)` -> `default void`

## `org.telegram.ui.Components.AutoDeletePopupWrapper`
- `allowExtendedHint(int linkColor)` -> `void`
- `setType(int i)` -> `void`
- `updateItems(int ttl)` -> `void`

## `org.telegram.ui.Components.AvatarConstructorFragment`
- `createView(Context context)` -> `View`
- `isLightStatusBar()` -> `boolean`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onPreviewClick()` -> `void`
- `onResume()` -> `void`
- `setDelegate(Delegate delegate)` -> `void`
- `startFrom(AvatarConstructorPreviewCell previewCell)` -> `void`
- `startFrom(long docId, boolean forUser)` -> `void`
- `startFrom(TLRPC.VideoSize emojiMarkup)` -> `void`

## `org.telegram.ui.Components.AvatarConstructorFragment$BackgroundGradient`
- `colorsCount()` -> `int`
- `copy()` -> `BackgroundGradient`
- `equals(Object o)` -> `boolean`
- `getAverageColor()` -> `int`

## `org.telegram.ui.Components.AvatarConstructorFragment$BackgroundSelectView`
- `onMeasure(int widthSpec, int heightSpec)` -> `void`
- `selectGradient(BackgroundGradient gradient)` -> `void`

## `org.telegram.ui.Components.AvatarConstructorFragment$ContainerLayout`
- `getNestedScrollAxes()` -> `int`
- `onNestedFling(View target, float velocityX, float velocityY, boolean consumed)` -> `boolean`
- `onNestedPreFling(View target, float velocityX, float velocityY)` -> `boolean`
- `onNestedPreScroll(View target, int dx, int dy, int[] consumed)` -> `void`
- `onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed)` -> `void`
- `onNestedScrollAccepted(View child, View target, int nestedScrollAxes)` -> `void`
- `onStartNestedScroll(View child, View target, int nestedScrollAxes)` -> `boolean`
- `onStopNestedScroll(View target)` -> `void`

## `org.telegram.ui.Components.AvatarConstructorFragment$GradientSelectorView`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setCustom(boolean b)` -> `void`
- `setGradient(BackgroundGradient backgroundGradient)` -> `void`
- `setLocked(boolean locked)` -> `void`
- `setSelectedInternal(boolean selected, boolean animated)` -> `void`

## `org.telegram.ui.Components.AvatarConstructorFragment$PreviewView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getDuration()` -> `long`
- `getImageReceiver()` -> `ImageReceiver`
- `invalidate()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setExpanded(boolean expanded)` -> `void`
- `setGradient(BackgroundGradient backgroundGradient, boolean isCustom)` -> `void`

## `org.telegram.ui.Components.AvatarConstructorPreviewCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getAnimatedEmoji()` -> `AnimatedEmojiDrawable`
- `getBackgroundGradient()` -> `AvatarConstructorFragment.BackgroundGradient`
- `static getOrCreateEmojiList(int currentAccount, boolean forUser)` -> `TLRPC.TL_emojiList`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Components.AvatarDrawable`
- `static colorName(int color)` -> `String`
- `draw(Canvas canvas)` -> `void`
- `static getAvatarSymbols(String firstName, String lastName, String custom, StringBuilder result)` -> `void`
- `getAvatarType()` -> `int`
- `static getButtonColorForId(long id, Theme.ResourcesProvider resourcesProvider)` -> `int`
- `getColor()` -> `int`
- `getColor2()` -> `int`
- `static getColorForId(long id)` -> `int`
- `static getColorIndex(long id)` -> `int`
- `getCustomIcon()` -> `Drawable`
- `static getIconColorForId(long id, Theme.ResourcesProvider resourcesProvider)` -> `int`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `static getNameColorNameForId(long id)` -> `int`
- `getOpacity()` -> `int`
- `static getPeerColorIndex(int color)` -> `int`
- `static getProfileBackColorForId(long id, Theme.ResourcesProvider resourcesProvider)` -> `int`
- `static getProfileColorForId(long id, Theme.ResourcesProvider resourcesProvider)` -> `int`
- `static getProfileTextColorForId(long id, Theme.ResourcesProvider resourcesProvider)` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setArchivedAvatarHiddenProgress(float progress)` -> `void`
- `setAvatarType(int value)` -> `void`
- `setColor(int value)` -> `void`
- `setColor(int value, int value2)` -> `void`
- `setColorFilter(ColorFilter cf)` -> `void`
- `setCustomIcon(Drawable drawable)` -> `void`
- `setDrawAvatarBackground(boolean drawAvatarBackground)` -> `void`
- `setIconTranslation(int tx, int ty)` -> `void`
- `setInfo(TLRPC.User user)` -> `void`
- `setInfo(int currentAccount, TLRPC.User user)` -> `void`
- `setInfo(TLObject object)` -> `void`
- `setInfo(int currentAccount, TLObject object)` -> `void`
- `setInfo(TLRPC.Chat chat)` -> `void`
- `setInfo(int currentAccount, TLRPC.Chat chat)` -> `void`
- `setInfo(TLRPC.ChatInvite chat)` -> `void`
- `setInfo(int currentAccount, TLRPC.ChatInvite chat)` -> `void`
- `setInfo(long id, String firstName, String lastName)` -> `void`
- `setInfo(long id)` -> `void`
- `setInfo(long id, String firstName, String lastName, String custom)` -> `void`
- `setInfo(long id, String firstName, String lastName, String custom, Integer customColor, MessagesController.PeerColor profileColor)` -> `void`
- `setInfo(long id, String firstName, String lastName, String custom, Integer customColor, MessagesController.PeerColor profileColor, boolean advancedGradient)` -> `void`
- `setPeerColor(int id)` -> `void`
- `setProfile(boolean value)` -> `void`
- `setRoundRadius(int roundRadius)` -> `void`
- `setScaleSize(float value)` -> `void`
- `setText(String text)` -> `void`
- `setTextSize(int size)` -> `void`

## `org.telegram.ui.Components.AvatarsDrawable`
- `animateFromState(AvatarsDrawable avatarsDrawable, int currentAccount, boolean createAnimator)` -> `void`
- `commitTransition(boolean animated)` -> `void`
- `commitTransition(boolean animated, boolean createAnimator)` -> `void`
- `getMaxX()` -> `float`
- `getSize()` -> `int`
- `getUsedWidth()` -> `float`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `reset()` -> `void`
- `setAlpha(float alpha)` -> `void`
- `setAvatarsTextSize(int newTextSize)` -> `void`
- `setCentered(boolean centered)` -> `void`
- `setCount(int count)` -> `void`
- `setDelegate(Runnable delegate)` -> `void`
- `setObject(int index, int account, TLObject object)` -> `void`
- `setSize(int size)` -> `void`
- `setStepFactor(float factor)` -> `void`
- `setStyle(int currentStyle)` -> `void`
- `setTransitionProgress(float transitionProgress)` -> `void`
- `updateAfterTransitionEnd()` -> `void`

## `org.telegram.ui.Components.AvatarsImageView`
- `commitTransition(boolean animated)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `reset()` -> `void`
- `setAvatarsTextSize(int size)` -> `void`
- `setCentered(boolean centered)` -> `void`
- `setCount(int usersCount)` -> `void`
- `setDelegate(Runnable delegate)` -> `void`
- `setObject(int a, int currentAccount, TLObject object)` -> `void`
- `setPlus(int n, int bgColor)` -> `void`
- `setSize(int size)` -> `void`
- `setStepFactor(float factor)` -> `void`
- `setStyle(int style)` -> `void`
- `updateAfterTransitionEnd()` -> `void`

## `org.telegram.ui.Components.AvatarsListDrawable`
- `attach()` -> `void`
- `detach()` -> `void`
- `draw(@NonNull Canvas canvas)` -> `void`
- `draw(@NonNull Canvas canvas, @Nullable Paint paint)` -> `void`
- `getAlpha()` -> `int`
- `getAnimatedWidth()` -> `float`
- `getOpacity()` -> `int`
- `getTotalVisibility()` -> `float`
- `set(List<TLRPC.Peer> peers, boolean animated)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.AvatarsListDrawable$AvatarItem`
- `attach()` -> `void`
- `detach()` -> `void`
- `equals(@Nullable Object obj)` -> `boolean`
- `getHeight()` -> `int`
- `getSpacingStart(boolean isFirst)` -> `int`
- `getWidth()` -> `int`
- `performDestroy()` -> `void`
- `set(int currentAccount, long dialogId)` -> `void`

## `org.telegram.ui.Components.BackButtonMenu`
- `static clearPulledDialogs(BaseFragment thisFragment, int fromIndex)` -> `void`
- `static goToPulledDialog(BaseFragment fragment, PulledDialog dialog)` -> `void`
- `static show(BaseFragment thisFragment, View backButton, long currentDialogId, long topicId, Theme.ResourcesProvider resourcesProvider)` -> `ActionBarPopupWindow`

## `org.telegram.ui.Components.BackgroundGradientDrawable`
- `static createDitheredGradientBitmapDrawable(int angle, int[] colors, int width, int height)` -> `BitmapDrawable`
- `static createDitheredGradientBitmapDrawable(Orientation orientation, int[] colors, int width, int height)` -> `BitmapDrawable`
- `dispose()` -> `void`
- `draw(Canvas canvas)` -> `void`
- `drawExactBoundsSize(Canvas canvas, View ownerView)` -> `Disposable`
- `drawExactBoundsSize(Canvas canvas, View ownerView, float compressRatio)` -> `Disposable`
- `finalize()` -> `void`
- `getColorsList()` -> `int[]`
- `static getGradientOrientation(int gradientAngle)` -> `Orientation`
- `static getGradientPoints(Orientation orientation, int width, int height)` -> `Rect`
- `static getGradientPoints(int gradientAngle, int width, int height)` -> `Rect`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `startDithering(Sizes sizes, Listener listener)` -> `Disposable`
- `startDithering(Sizes sizes, Listener listener, long delay)` -> `Disposable`

## `org.telegram.ui.Components.BackgroundGradientDrawable$ListenerAdapter`
- `onAllSizesReady()` -> `void`
- `onSizeReady(int width, int height)` -> `void`

## `org.telegram.ui.Components.BackgroundGradientDrawable$Sizes`
- `static of(int width, int height, int... additionalSizes)` -> `Sizes`
- `static ofDeviceScreen()` -> `Sizes`
- `static ofDeviceScreen(float compressRatio)` -> `Sizes`
- `static ofDeviceScreen(Orientation orientation)` -> `Sizes`
- `static ofDeviceScreen(float compressRatio, Orientation orientation)` -> `Sizes`

## `org.telegram.ui.Components.BackupImageView`
- `animateToRoundRadius(int animateToRad)` -> `void`
- `clearImage()` -> `void`
- `createImageReciever()` -> `ImageReceiver`
- `drawBlurredText(Canvas canvas, float alpha)` -> `void`
- `getAnimatedEmojiDrawable()` -> `AnimatedEmojiDrawable`
- `getAvatarDrawable()` -> `AvatarDrawable`
- `getImageReceiver()` -> `ImageReceiver`
- `getRoundRadius()` -> `int[]`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onNewImageSet()` -> `void`
- `setAnimatedEmojiDrawable(AnimatedEmojiDrawable animatedEmojiDrawable)` -> `void`
- `setAspectFit(boolean value)` -> `void`
- `setBlurAllowed(boolean blurAllowed)` -> `void`
- `setBlurredText(CharSequence str)` -> `void`
- `setColorFilter(ColorFilter colorFilter)` -> `void`
- `setEmojiColorFilter(ColorFilter colorFilter)` -> `void`
- `setForUserOrChat(TLObject object, AvatarDrawable avatarDrawable)` -> `void`
- `setForUserOrChat(TLObject object, AvatarDrawable avatarDrawable, Object parent)` -> `void`
- `setHasBlur(boolean hasBlur)` -> `void`
- `setImage(SecureDocument secureDocument, String filter)` -> `void`
- `setImage(ImageLocation imageLocation, String imageFilter, String ext, Drawable thumb, Object parentObject)` -> `void`
- `setImage(ImageLocation imageLocation, String imageFilter, Drawable thumb, Object parentObject)` -> `void`
- `setImage(ImageLocation mediaLocation, String mediaFilter, ImageLocation imageLocation, String imageFilter, Drawable thumb, Object parentObject)` -> `void`
- `setImage(ImageLocation mediaLocation, String mediaFilter, ImageLocation imageLocation, String imageFilter, ImageLocation thumbLocation, String thumbFilter, Drawable thumb, Object parentObject)` -> `void`
- `setImage(ImageLocation imageLocation, String imageFilter, Bitmap thumb, Object parentObject)` -> `void`
- `setImage(ImageLocation imageLocation, String imageFilter, Drawable thumb, int size, Object parentObject)` -> `void`
- `setImage(ImageLocation imageLocation, String imageFilter, Bitmap thumbBitmap, int size, int cacheType, Object parentObject)` -> `void`
- `setImage(ImageLocation imageLocation, String imageFilter, ImageLocation thumbLocation, String thumbFilter, int size, Object parentObject)` -> `void`
- `setImage(String path, String filter, Drawable thumb)` -> `void`
- `setImage(String path, String filter, String thumbPath, String thumbFilter)` -> `void`
- `setImage(ImageLocation imageLocation, String imageFilter, ImageLocation thumbLocation, String thumbFilter, Drawable thumb, Bitmap thumbBitmap, String ext, int size, Object parentObject)` -> `void`
- `setImage(ImageLocation imageLocation, String imageFilter, ImageLocation thumbLocation, String thumbFilter, Drawable thumb, String ext, long size, int cacheType, Object parentObject)` -> `void`
- `setImage(ImageLocation mediaLocation, String mediaFilter, ImageLocation imageLocation, String imageFilter, ImageLocation thumbLocation, String thumbFilter, String ext, long size, int cacheType, Object parentObject)` -> `void`
- `setImage(ImageLocation imageLocation, String imageFilter, ImageLocation thumbLocation, String thumbFilter, String ext, long size, int cacheType, Object parentObject)` -> `void`
- `setImageBitmap(Bitmap bitmap)` -> `void`
- `setImageDrawable(Drawable drawable)` -> `void`
- `setImageMedia(ImageLocation mediaLocation, String mediaFilter, ImageLocation imageLocation, String imageFilter, Bitmap thumbBitmap, int size, int cacheType, Object parentObject)` -> `void`
- `setImageMedia(VectorAvatarThumbDrawable vectorAvatar, ImageLocation mediaLocation, String mediaFilter, ImageLocation imageLocation, String imageFilter, ImageLocation thumbLocation, String thumbFilter, String ext, int size, int cacheType, Object parentObject)` -> `void`
- `setImageResource(int resId)` -> `void`
- `setImageResource(int resId, int color)` -> `void`
- `setLayerNum(int value)` -> `void`
- `setOrientation(int angle, boolean center)` -> `void`
- `setOrientation(int angle, int invert, boolean center)` -> `void`
- `setRoundRadius(int value)` -> `void`
- `setRoundRadius(int tl, int tr, int bl, int br)` -> `void`
- `setSize(int w, int h)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Components.BadgeLevelDrawable`
- `debugUpdateStart()` -> `void`
- `debugUpdateStop()` -> `void`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `invalidateDrawable(@NonNull Drawable who)` -> `void`
- `onBoundsChange(@NonNull Rect bounds)` -> `void`
- `scheduleDrawable(@NonNull Drawable who, @NonNull Runnable what, long when)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setBadgeLevel(int level, boolean animated)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setInnerColor(int innerColor)` -> `void`
- `setOuterColor(int outerColor)` -> `void`
- `setTextColor(int textColor)` -> `void`
- `unscheduleDrawable(@NonNull Drawable who, @NonNull Runnable what)` -> `void`

## `org.telegram.ui.Components.BatchParticlesDrawHelper`
- `static createBatchParticlesPaint(Bitmap bitmap)` -> `Paint`
- `static draw(Canvas canvas, BatchParticlesBuffer buffer, int vertexCount, Paint paint)` -> `void`
- `static draw(Canvas canvas, BatchParticlesBuffer buffer, int vertexCount, int vertexOffset, Paint paint)` -> `void`
- `static isAvailable()` -> `boolean`

## `org.telegram.ui.Components.BatchParticlesDrawHelper$BatchParticlesBuffer`
- `fillParticleTextureCords(float left, float top, float right, float bottom)` -> `void`
- `setParticleColor(int index, int color)` -> `void`
- `setParticleTextureCords(int index, float left, float top, float right, float bottom)` -> `void`
- `setParticleVertexCords(int index, float left, float top, float right, float bottom)` -> `void`

## `org.telegram.ui.Components.BatteryDrawable`
- `colorFromPaint(Paint paintReference)` -> `void`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColor(int color)` -> `void`
- `setColor(int color, int fillColor)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setFillValue(float newValue, boolean animated)` -> `void`
- `setScale(float scale)` -> `void`
- `setTranslationY(float translateY)` -> `void`

## `org.telegram.ui.Components.BetterRatingView`
- `getRating()` -> `int`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setOnRatingChangeListener(OnRatingChangeListener l)` -> `void`

## `org.telegram.ui.Components.BitmapShaderTools`
- `getBitmap()` -> `Bitmap`
- `getCanvas()` -> `Canvas`
- `setBounds(RectF bounds)` -> `void`
- `setBounds(float left, float top, float right, float bottom)` -> `void`
- `setMatrix(float offsetX, float offsetY, float scale, float degrees)` -> `void`

## `org.telegram.ui.Components.BlobDrawable`
- `draw(float cX, float cY, Canvas canvas, Paint paint)` -> `void`
- `generateBlob(float[] radius, float[] angle, int i)` -> `void`
- `generateBlob()` -> `void`
- `setValue(float value)` -> `void`
- `setValue(float value, boolean isBig)` -> `void`
- `update(float amplitude, float speedScale)` -> `void`
- `updateAmplitude(long dt)` -> `void`

## `org.telegram.ui.Components.BlockingUpdateView`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `setVisibility(int visibility)` -> `void`
- `show(int account, TLRPC.TL_help_appUpdate update, boolean check)` -> `void`

## `org.telegram.ui.Components.BottomPagerTabs`
- `createTabs()` -> `Tab[]`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setOnTabClick(Utilities.Callback<Integer> listener)` -> `void`
- `setProgress(float progress)` -> `void`
- `setScrolling(boolean scrolling)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Components.BottomPagerTabs$Tab`
- `customFrameInvert()` -> `Tab`
- `setActive(boolean active, boolean animated)` -> `void`
- `setColor(int color)` -> `void`

## `org.telegram.ui.Components.BottomPagesView`
- `onDraw(Canvas canvas)` -> `void`
- `setColor(int key, int selectedKey)` -> `void`
- `setCurrentPage(int page)` -> `void`
- `setPageOffset(int position, float offset)` -> `void`

## `org.telegram.ui.Components.BottomSheetLayouted`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `createButton()` -> `void`
- `getTitle()` -> `CharSequence`
- `setTitle(CharSequence value)` -> `void`

## `org.telegram.ui.Components.BottomSheetLayouted$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.BottomSheetLayouted$SpaceView`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setHeight(int heightPx, int a)` -> `void`

## `org.telegram.ui.Components.BottomSheetWithRecyclerListView`
- `applyScrolledPosition()` -> `void`
- `applyScrolledPosition(boolean ignorePaddingView)` -> `void`
- `createRecyclerView(Context context)` -> `RecyclerListView`
- `getActionBarProgressHeight()` -> `int`
- `getBaseFragment()` -> `BaseFragment`
- `isAttachedLightStatusBar()` -> `boolean`
- `needPaddingShadow()` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onActionBarAlpha(float alpha)` -> `void`
- `onContainerViewTranslation()` -> `void`
- `onPreDraw(Canvas canvas, int top, float progressToFullView)` -> `void`
- `onPreMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onSheetTop(float top)` -> `void`
- `onViewCreated(FrameLayout containerView)` -> `void`
- `postDrawInternal(Canvas canvas, View parentView)` -> `void`
- `preDrawInternal(Canvas canvas, View parent)` -> `void`
- `resetAdapter(Context context)` -> `void`
- `setEditTextEmoji(EditTextEmoji editTextEmoji)` -> `void`
- `setShowHandle(boolean showHandle)` -> `void`
- `setShowShadow(boolean show)` -> `void`
- `setSlidingActionBar()` -> `void`
- `shouldDrawBackground()` -> `boolean`
- `updateTitle()` -> `void`
- `updateTitleAnimated()` -> `void`
- `updateTitleAnimated(boolean checkEquals)` -> `void`

## `org.telegram.ui.Components.BottomSheetWithRecyclerListView$PaddingView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setTranslationY(float translationY)` -> `void`

## `org.telegram.ui.Components.BottomSheetWithRecyclerListView$Params$Builder`
- `actionBarType(ActionBarType actionBarType)` -> `Builder`
- `build()` -> `Params`
- `edgeToEdge(EdgeToEdge edgeToEdge)` -> `Builder`
- `needFocus(boolean needFocus)` -> `Builder`
- `resourcesProvider(Theme.ResourcesProvider resourcesProvider)` -> `Builder`
- `stackFromEnd(boolean stackFromEnd)` -> `Builder`
- `useNested(boolean useNested)` -> `Builder`

## `org.telegram.ui.Components.BulletSpan`
- `getBulletRadius()` -> `int`
- `getColor()` -> `int`
- `getGapWidth()` -> `int`
- `getLeadingMargin(boolean first)` -> `int`

## `org.telegram.ui.Components.Bulletin`
- `allowBlur()` -> `Bulletin`
- `static find(@NonNull FrameLayout containerLayout)` -> `Bulletin`
- `getLayout()` -> `Layout`
- `static getVisibleBulletin()` -> `Bulletin`
- `static hide(@NonNull FrameLayout containerLayout)` -> `void`
- `static hide(@NonNull FrameLayout containerLayout, boolean animated)` -> `void`
- `hide()` -> `void`
- `hide(long duration)` -> `void`
- `hide(boolean animated, long duration)` -> `void`
- `hideAfterBottomSheet(boolean hide)` -> `Bulletin`
- `static hideVisible()` -> `void`
- `static hideVisible(ViewGroup container)` -> `void`
- `ignoreDetach()` -> `Bulletin`
- `static make(@NonNull FrameLayout containerLayout, @NonNull Layout contentLayout, int duration)` -> `Bulletin`
- `static make(@Nullable BaseFragment fragment, @NonNull Layout contentLayout, int duration)` -> `Bulletin`
- `onLoaded(CharSequence text)` -> `void`
- `setCanHide(boolean canHide)` -> `void`
- `setDuration(int duration)` -> `Bulletin`
- `setImageScale(float scale)` -> `Bulletin`
- `setOnClickListener(View.OnClickListener onClickListener)` -> `Bulletin`
- `setOnHideListener(Runnable listener)` -> `Bulletin`
- `setTag(int tag)` -> `Bulletin`
- `show()` -> `Bulletin`
- `show(boolean top)` -> `Bulletin`
- `skipShowAnimation()` -> `Bulletin`
- `static updateCurrentPosition()` -> `void`
- `updatePosition()` -> `void`
- `wrapContent()` -> `Bulletin`

## `org.telegram.ui.Components.Bulletin$BulletinWindow`
- `static make(Context context, Delegate delegate)` -> `BulletinWindowLayout`
- `static make(Context context)` -> `BulletinWindowLayout`
- `show()` -> `void`

## `org.telegram.ui.Components.Bulletin$BulletinWindow$BulletinWindowLayout`
- `getLayout()` -> `WindowManager.LayoutParams`
- `setTouchable(boolean touchable)` -> `void`
- `updateLayout()` -> `void`

## `org.telegram.ui.Components.Bulletin$Button`
- `onAttach(@NonNull Layout layout, @NonNull Bulletin bulletin)` -> `void`
- `onDetach(@NonNull Layout layout)` -> `void`
- `onEnterTransitionEnd(@NonNull Layout layout)` -> `void`
- `onEnterTransitionStart(@NonNull Layout layout)` -> `void`
- `onExitTransitionEnd(@NonNull Layout layout)` -> `void`
- `onExitTransitionStart(@NonNull Layout layout)` -> `void`
- `onHide(@NonNull Layout layout)` -> `void`
- `onShow(@NonNull Layout layout)` -> `void`

## `org.telegram.ui.Components.Bulletin$ButtonLayout`
- `getButton()` -> `Button`
- `measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setButton(Button button)` -> `void`
- `setTimer()` -> `void`
- `setWrapWidth()` -> `void`

## `org.telegram.ui.Components.Bulletin$Delegate`
- `allowLayoutChanges()` -> `default boolean`
- `bottomOffsetAnimated()` -> `default boolean`
- `clipWithGradient(int tag)` -> `default boolean`
- `getBottomOffset(int tag)` -> `default int`
- `getLeftPadding()` -> `default int`
- `getRightPadding()` -> `default int`
- `getTopOffset(int tag)` -> `default int`
- `onBottomOffsetChange(float offset)` -> `default void`
- `onHide(Bulletin bulletin)` -> `default void`
- `onShow(Bulletin bulletin)` -> `default void`

## `org.telegram.ui.Components.Bulletin$EmptyBulletin`
- `show()` -> `Bulletin`

## `org.telegram.ui.Components.Bulletin$Layout`
- `createTransition()` -> `Transition`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchDrawImpl(Canvas canvas, boolean fromBlurRender, int alpha)` -> `void`
- `dispatchDrawImplBlur(Canvas canvas, int alpha)` -> `void`
- `getAccessibilityText()` -> `CharSequence`
- `getBottomOffset()` -> `float`
- `getBulletin()` -> `Bulletin`
- `getMeasuredBackgroundHeight()` -> `int`
- `getThemedColor(int key)` -> `int`
- `getTopOffset()` -> `float`
- `isAttachedToBulletin()` -> `boolean`
- `isTransitionRunning()` -> `boolean`
- `onAttach(@NonNull Bulletin bulletin)` -> `void`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onDetach()` -> `void`
- `onEnterTransitionEnd()` -> `void`
- `onEnterTransitionStart()` -> `void`
- `onExitTransitionEnd()` -> `void`
- `onExitTransitionStart()` -> `void`
- `onHide()` -> `void`
- `onShow()` -> `void`
- `setBackground(int color)` -> `void`
- `setBackground(int color, int rounding)` -> `void`
- `setCustomBackground(Drawable drawable)` -> `void`
- `setOnClickListener(@Nullable OnClickListener l)` -> `void`
- `setTop(boolean top)` -> `void`
- `updatePosition()` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Components.Bulletin$Layout$DefaultTransition`
- `animateEnter(@NonNull Layout layout, @Nullable Runnable startAction, @Nullable Runnable endAction, @Nullable Consumer<Float> onUpdate, int bottomOffset)` -> `void`
- `animateExit(@NonNull Layout layout, @Nullable Runnable startAction, @Nullable Runnable endAction, @Nullable Consumer<Float> onUpdate, int bottomOffset)` -> `void`

## `org.telegram.ui.Components.Bulletin$Layout$SpringTransition`
- `animateEnter(@NonNull Layout layout, @Nullable Runnable startAction, @Nullable Runnable endAction, @Nullable Consumer<Float> onUpdate, int bottomOffset)` -> `void`
- `animateExit(@NonNull Layout layout, @Nullable Runnable startAction, @Nullable Runnable endAction, @Nullable Consumer<Float> onUpdate, int bottomOffset)` -> `void`

## `org.telegram.ui.Components.Bulletin$LoadingLottieLayout`
- `onTextLoaded(CharSequence text)` -> `void`
- `setTextColor(int textColor)` -> `void`

## `org.telegram.ui.Components.Bulletin$LottieLayout`
- `getAccessibilityText()` -> `CharSequence`
- `onShow()` -> `void`
- `setAnimation(int resId, String... layers)` -> `void`
- `setAnimation(int resId, int w, int h, String... layers)` -> `void`
- `setAnimation(TLRPC.Document document, int w, int h, String... layers)` -> `void`
- `setIconPaddingBottom(int paddingBottom)` -> `void`
- `setTextColor(int textColor)` -> `void`

## `org.telegram.ui.Components.Bulletin$MultiLineLayout`
- `getAccessibilityText()` -> `CharSequence`

## `org.telegram.ui.Components.Bulletin$ParentLayout`
- `onTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.ui.Components.Bulletin$ProgressLayout`
- `getAccessibilityText()` -> `CharSequence`
- `setProgress(float progress)` -> `void`
- `setTextColor(int textColor)` -> `void`

## `org.telegram.ui.Components.Bulletin$SimpleLayout`
- `getAccessibilityText()` -> `CharSequence`

## `org.telegram.ui.Components.Bulletin$TimerView`
- `onDraw(Canvas canvas)` -> `void`
- `setColor(int color)` -> `void`

## `org.telegram.ui.Components.Bulletin$TwoLineBackupLayout`
- `getAccessibilityText()` -> `CharSequence`
- `hideImage()` -> `void`

## `org.telegram.ui.Components.Bulletin$TwoLineLayout`
- `getAccessibilityText()` -> `CharSequence`
- `hideImage()` -> `void`

## `org.telegram.ui.Components.Bulletin$TwoLineLottieLayout`
- `getAccessibilityText()` -> `CharSequence`
- `hideImage()` -> `void`
- `onShow()` -> `void`
- `setAnimation(int resId, String... layers)` -> `void`
- `setAnimation(int resId, int w, int h, String... layers)` -> `void`
- `setAnimation(TLRPC.Document document, int w, int h, String... layers)` -> `void`

## `org.telegram.ui.Components.Bulletin$UndoButton`
- `getThemedColor(int key)` -> `int`
- `onAttach(@NonNull Layout layout, @NonNull Bulletin bulletin)` -> `void`
- `onDetach(@NonNull Layout layout)` -> `void`
- `setDelayedAction(Runnable delayedAction)` -> `UndoButton`
- `setText(CharSequence text)` -> `UndoButton`
- `setUndoAction(Runnable undoAction)` -> `UndoButton`
- `undo()` -> `void`

## `org.telegram.ui.Components.Bulletin$UsersLayout`
- `getAccessibilityText()` -> `CharSequence`
- `onShow()` -> `void`
- `setTextColor(int textColor)` -> `void`

## `org.telegram.ui.Components.BulletinFactory`
- `create(Bulletin.Layout layout, int duration)` -> `Bulletin`
- `createAdReportedBulletin(CharSequence text)` -> `Bulletin`
- `static createAddedAsAdminBulletin(BaseFragment fragment, String userFirstName)` -> `Bulletin`
- `static createBanBulletin(BaseFragment fragment, boolean banned)` -> `Bulletin`
- `createBanBulletin(boolean banned)` -> `Bulletin`
- `createCaptionLimitBulletin(int count, Runnable callback)` -> `Bulletin`
- `createChatsBulletin(List<TLObject> objects, CharSequence text, CharSequence subtitle)` -> `Bulletin`
- `createContainsEmojiBulletin(TLRPC.Document document, int type, Utilities.Callback<TLRPC.InputStickerSet> openSet)` -> `Bulletin`
- `createCopyBulletin(String message)` -> `Bulletin`
- `createCopyBulletin(String message, Theme.ResourcesProvider resourcesProvider)` -> `Bulletin`
- `createCopyLinkBulletin()` -> `Bulletin`
- `createCopyLinkBulletin(boolean isPrivate)` -> `Bulletin`
- `createCopyLinkBulletin(String text, Theme.ResourcesProvider resourcesProvider)` -> `Bulletin`
- `static createCopyLinkBulletin(BaseFragment fragment)` -> `Bulletin`
- `static createCopyLinkBulletin(FrameLayout containerView)` -> `Bulletin`
- `static createDeleteMessagesBulletin(BaseFragment fragment, int count, Theme.ResourcesProvider resourcesProvider)` -> `Bulletin`
- `static createDissableSharingBulletin(BaseFragment fragment, String pendingUsername, boolean sharingDisabled)` -> `Bulletin`
- `createDownloadBulletin(FileType fileType)` -> `Bulletin`
- `createDownloadBulletin(FileType fileType, Theme.ResourcesProvider resourcesProvider)` -> `Bulletin`
- `createDownloadBulletin(FileType fileType, int filesAmount, Theme.ResourcesProvider resourcesProvider)` -> `Bulletin`
- `createDownloadBulletin(FileType fileType, int filesAmount, int backgroundColor, int textColor)` -> `Bulletin`
- `createDownloadBulletin(FileType fileType, int filesAmount, int backgroundColor, int textColor, Theme.ResourcesProvider resourcesProvider)` -> `Bulletin`
- `createEmojiBulletin(long emoji_id, String text, String subtext)` -> `Bulletin`
- `createEmojiBulletin(String emoji, String text)` -> `Bulletin`
- `createEmojiBulletin(String emoji, String text, String button, Runnable onButtonClick)` -> `Bulletin`
- `createEmojiBulletin(TLRPC.Document document, CharSequence text)` -> `Bulletin`
- `createEmojiBulletin(TLRPC.Document document, CharSequence text, CharSequence subtext)` -> `Bulletin`
- `createEmojiBulletin(TLRPC.Document document, CharSequence text, CharSequence subtext, CharSequence buttonText, Runnable onButtonClick)` -> `Bulletin`
- `createEmojiBulletin(TLRPC.Document document, CharSequence text, CharSequence button, Runnable onButtonClick)` -> `Bulletin`
- `createEmojiLoadingBulletin(TLRPC.Document document, CharSequence text, CharSequence button, Runnable onButtonClick)` -> `Bulletin`
- `createErrorBulletin(CharSequence errorMessage)` -> `Bulletin`
- `createErrorBulletin(CharSequence errorMessage, Theme.ResourcesProvider resourcesProvider)` -> `Bulletin`
- `createErrorBulletinSubtitle(CharSequence errorMessage, CharSequence errorDescription, Theme.ResourcesProvider resourcesProvider)` -> `Bulletin`
- `static createForwardedBulletin(Context context, FrameLayout containerLayout, int dialogsCount, long did, int messagesCount, int backgroundColor, int textColor)` -> `Bulletin`
- `static createForwardedBulletin(Context context, BaseFragment fragment, FrameLayout containerLayout, int dialogsCount, long did, int messagesCount, int backgroundColor, int textColor, int duration)` -> `Bulletin`
- `static createForwardedBulletin(Context context, BaseFragment fragment, FrameLayout containerLayout, int dialogsCount, long did, int messagesCount, int backgroundColor, int textColor, int duration, Runnable undoAction, Runnable delayedAction)` -> `Bulletin`
- `static createForwardedBulletin(Context context, BaseFragment fragment, FrameLayout containerLayout, int dialogsCount, long did, int messagesCount, int backgroundColor, int textColor, int duration, boolean isSavedReminders, Runnable undoAction, Runnable delayedAction)` -> `Bulletin`
- `createImageBulletin(int iconRawId, CharSequence title)` -> `Bulletin`
- `static createInviteSentBulletin(Context context, FrameLayout containerLayout, int dialogsCount, long did, int messagesCount, int backgroundColor, int textColor)` -> `Bulletin`
- `createMessagesTaggedBulletin(int messagesCount, TLRPC.Document document, Runnable onViewButton)` -> `Bulletin`
- `static createMuteBulletin(BaseFragment fragment, int setting)` -> `Bulletin`
- `static createMuteBulletin(BaseFragment fragment, int setting, int timeInSeconds, Theme.ResourcesProvider resourcesProvider)` -> `Bulletin`
- `static createMuteBulletin(BaseFragment fragment, boolean mute, int chatsCount, Theme.ResourcesProvider resourcesProvider)` -> `Bulletin`
- `static createMuteBulletin(BaseFragment fragment, boolean muted, Theme.ResourcesProvider resourcesProvider)` -> `Bulletin`
- `static createPinMessageBulletin(BaseFragment fragment, Theme.ResourcesProvider resourcesProvider)` -> `Bulletin`
- `static createPromoteToAdminBulletin(BaseFragment fragment, String userFirstName)` -> `Bulletin`
- `static createRemoveFromChatBulletin(BaseFragment fragment, TLRPC.User user, String chatName)` -> `Bulletin`
- `createReportSent(Theme.ResourcesProvider resourcesProvider)` -> `Bulletin`
- `createRestrictVoiceMessagesPremiumBulletin()` -> `Bulletin`
- `static createSaveMediaToGalleryBulletin(FrameLayout containerLayout, int amount, boolean hasVideo, boolean hasPhoto, boolean hasLivePhoto, int backgroundColor, int textColor)` -> `Bulletin`
- `static createSaveToGalleryBulletin(BaseFragment fragment, boolean video, Theme.ResourcesProvider resourcesProvider)` -> `Bulletin`
- `static createSaveToGalleryBulletin(BaseFragment fragment, boolean video, boolean livePhoto, Theme.ResourcesProvider resourcesProvider)` -> `Bulletin`
- `static createSaveToGalleryBulletin(FrameLayout containerLayout, boolean video, Theme.ResourcesProvider resourcesProvider)` -> `Bulletin`
- `static createSaveToGalleryBulletin(FrameLayout containerLayout, boolean video, int backgroundColor, int textColor)` -> `Bulletin`
- `static createSaveToGalleryBulletin(FrameLayout containerLayout, boolean video, boolean livePhoto, int backgroundColor, int textColor)` -> `Bulletin`
- `static createSaveToGalleryBulletin(FrameLayout containerLayout, int amount, boolean video, int backgroundColor, int textColor)` -> `Bulletin`
- `static createSaveToGalleryBulletin(FrameLayout containerLayout, int amount, boolean video, boolean livePhoto, int backgroundColor, int textColor)` -> `Bulletin`
- `createSimpleBulletin(int iconRawId, CharSequence text)` -> `Bulletin`
- `createSimpleBulletin(TLRPC.MessageMedia media, CharSequence text)` -> `Bulletin`
- `createSimpleBulletin(TLRPC.Document document, CharSequence text)` -> `Bulletin`
- `createSimpleBulletin(TLRPC.Document document, CharSequence title, CharSequence text)` -> `Bulletin`
- `createSimpleBulletin(TLRPC.Photo photo, CharSequence text)` -> `Bulletin`
- `createSimpleBulletin(int iconRawId, CharSequence text, int maxLines)` -> `Bulletin`
- `createSimpleBulletin(int iconRawId, CharSequence text, int maxLines, int duration)` -> `Bulletin`
- `createSimpleBulletin(int iconRawId, CharSequence text, CharSequence subtext)` -> `Bulletin`
- `createSimpleBulletin(int iconRawId, CharSequence text, CharSequence button, Runnable onButtonClick)` -> `Bulletin`
- `createSimpleBulletin(int iconRawId, CharSequence text, CharSequence subtext, CharSequence button, Runnable onButtonClick)` -> `Bulletin`
- `createSimpleBulletin(int iconRawId, CharSequence text, CharSequence button, int duration, Runnable onButtonClick)` -> `Bulletin`
- `createSimpleBulletin(int iconRawId, CharSequence text, CharSequence button, int duration, boolean icon, Runnable onButtonClick)` -> `Bulletin`
- `createSimpleBulletin(Drawable drawable, CharSequence text, String button, Runnable onButtonClick)` -> `Bulletin`
- `createSimpleBulletin(Drawable drawable, CharSequence text)` -> `Bulletin`
- `createSimpleBulletin(Drawable drawable, CharSequence text, CharSequence subtitle)` -> `Bulletin`
- `createSimpleBulletin(CharSequence text, CharSequence subtitle)` -> `Bulletin`
- `createSimpleBulletin(Drawable drawable, CharSequence text, CharSequence subtitle, String button, Runnable onButtonClick)` -> `Bulletin`
- `createSimpleBulletin(CharSequence text, CharSequence subtitle, String button, Runnable onButtonClick)` -> `Bulletin`
- `createSimpleBulletinDetail(int iconRawId, CharSequence text)` -> `Bulletin`
- `createSimpleBulletinWithIconSize(int iconRawId, CharSequence text, int iconSize)` -> `Bulletin`
- `createSimpleLargeBulletin(int iconRawId, CharSequence title, CharSequence subtitle)` -> `Bulletin`
- `createSimpleMultiBulletin(TLRPC.Document document, CharSequence text)` -> `Bulletin`
- `static createSoundEnabledBulletin(BaseFragment fragment, int setting, Theme.ResourcesProvider resourcesProvider)` -> `Bulletin`
- `createStaticEmojiBulletin(TLRPC.Document document, CharSequence text)` -> `Bulletin`
- `createSuccessBulletin(CharSequence successMessage)` -> `Bulletin`
- `createSuccessBulletin(CharSequence successMessage, Theme.ResourcesProvider resourcesProvider)` -> `Bulletin`
- `createUndoBulletin(CharSequence text, Runnable onUndo, Runnable onAction)` -> `Bulletin`
- `createUndoBulletin(CharSequence text, boolean textAndIcon, Runnable onUndo, Runnable onAction)` -> `Bulletin`
- `createUndoBulletin(CharSequence text, CharSequence subtitle, Runnable onUndo, Runnable onAction)` -> `Bulletin`
- `createUndoBulletin(CharSequence text, CharSequence subtitle, boolean textAndIcon, Runnable onUndo, Runnable onAction)` -> `Bulletin`
- `static createUnpinAllMessagesBulletin(BaseFragment fragment, int count, boolean hide, Runnable undoAction, Runnable delayedAction, Theme.ResourcesProvider resourcesProvider)` -> `Bulletin`
- `static createUnpinMessageBulletin(BaseFragment fragment, Runnable undoAction, Runnable delayedAction, Theme.ResourcesProvider resourcesProvider)` -> `Bulletin`
- `createUsersAddedBulletin(ArrayList<TLRPC.User> users, TLRPC.Chat chat)` -> `Bulletin`
- `createUsersBulletin(List<? extends TLObject> users, CharSequence text)` -> `Bulletin`
- `createUsersBulletin(TLObject user, CharSequence text, CharSequence subtitle)` -> `Bulletin`
- `createUsersBulletin(TLObject user, CharSequence text)` -> `Bulletin`
- `createUsersBulletin(List<? extends TLObject> users, CharSequence text, CharSequence subtitle)` -> `Bulletin`
- `createUsersBulletin(List<? extends TLObject> users, CharSequence text, CharSequence subtitle, UndoObject undoObject)` -> `Bulletin`
- `getContext()` -> `Context`
- `getResourcesProvider()` -> `Theme.ResourcesProvider`
- `static global()` -> `BulletinFactory`
- `makeForError(TLRPC.TL_error error)` -> `Bulletin`
- `static of(BaseFragment fragment)` -> `BulletinFactory`
- `static of(FrameLayout containerLayout, Theme.ResourcesProvider resourcesProvider)` -> `BulletinFactory`
- `static showError(String error)` -> `void`
- `static showError(String error, FrameLayout topContainer, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static showError(TLRPC.TL_error error)` -> `void`
- `showForError(TLRPC.TL_error error)` -> `void`
- `showForError(TLRPC.TL_error error, boolean top)` -> `void`
- `showForError(String errorCode)` -> `void`
- `showForError(String errorCode, boolean top)` -> `void`
- `showForError(Throwable error)` -> `void`
- `showForError(Throwable error, boolean top)` -> `void`
- `showForwardedBulletinWithTag(long did, int messagesCount)` -> `boolean`

## `org.telegram.ui.Components.ButtonBounce`
- `bounce()` -> `void`
- `getScale(float diff)` -> `float`
- `getView()` -> `View`
- `invalidate()` -> `void`
- `setAdditionalInvalidate(Runnable additionalInvalidate)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `setReleaseDelay(long releaseDelay)` -> `ButtonBounce`
- `setView(View view)` -> `void`

## `org.telegram.ui.Components.ButtonSpan`
- `draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, @NonNull Paint paint)` -> `void`
- `getSize()` -> `int`
- `getSize(@NonNull Paint paint, CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm)` -> `int`
- `static make(CharSequence buttonText, Runnable onClick)` -> `CharSequence`
- `static make(CharSequence buttonText, Runnable onClick, Theme.ResourcesProvider resourcesProvider)` -> `CharSequence`
- `static make(CharSequence buttonText, Runnable onClick, Theme.ResourcesProvider resourcesProvider, Integer forcedColor)` -> `CharSequence`
- `setPressed(View view, boolean pressed)` -> `void`

## `org.telegram.ui.Components.ButtonSpan$TextViewButtons`
- `findSpan(float x, int y)` -> `ButtonSpan`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.ui.Components.CacheChart`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `heightDp()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onSectionClick(int index)` -> `void`
- `onSectionDown(int index, boolean down)` -> `void`
- `padInsideDp()` -> `int`
- `setInterceptTouch(boolean value)` -> `void`
- `setSegments(long totalSize, boolean animated, SegmentSize ...segments)` -> `void`
- `setSelected(int index)` -> `void`

## `org.telegram.ui.Components.CacheChart$SegmentSize`
- `static of(long size)` -> `SegmentSize`
- `static of(long size, boolean selected)` -> `SegmentSize`

## `org.telegram.ui.Components.CanvasButton`
- `draw(Canvas canvas)` -> `void`
- `rewind()` -> `void`
- `setColor(int color)` -> `void`
- `setColor(int color, int selectorColor)` -> `void`
- `setDelegate(Runnable delegate)` -> `void`
- `setLongPress(Runnable runnable)` -> `void`
- `setRect(RectF rectF)` -> `void`
- `setRect(int x, int y, int x1, int y1)` -> `void`
- `setRoundRadius(int radius)` -> `void`
- `setRounded(boolean rounded)` -> `void`

## `org.telegram.ui.Components.CapsuleBlobDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getAlpha()` -> `int`
- `getOpacity()` -> `int`
- `getRequiredInset()` -> `int`
- `isRunning()` -> `boolean`
- `onBoundsChange(@NonNull Rect bounds)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setAmplitude(float value)` -> `void`
- `setAmplitude(float value, boolean isBig)` -> `void`
- `setBreathing(float depthPx, float periodMs)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setCornerRadius(float radiusPx)` -> `void`
- `setCurvatureBoost(float boost)` -> `void`
- `setNeighborCoherence(float coherence)` -> `void`
- `setState(int state)` -> `void`
- `setState(int state, boolean animated)` -> `void`
- `setTargetSpacing(float spacingPx)` -> `void`
- `setWaveDepth(float depthPx)` -> `void`
- `start()` -> `void`
- `stop()` -> `void`
- `updateColors()` -> `void`
- `updateState(boolean animated)` -> `void`

## `org.telegram.ui.Components.CapsuleBlobDrawable$Layer`
- `applyColor()` -> `void`
- `static clamp(float v, float min, float max)` -> `float`
- `count()` -> `int`
- `next(int i)` -> `void`
- `resize(int newN)` -> `void`
- `setLayerAlpha(int alpha)` -> `void`
- `update(float amplitude)` -> `void`

## `org.telegram.ui.Components.CastMediaRouteButton`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `invalidate()` -> `void`
- `isConnected()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `setBackground(Drawable background)` -> `void`
- `stateUpdated(boolean connected)` -> `void`

## `org.telegram.ui.Components.CastMediaRouteButton$MyMediaRouteChooserDialogFragment`
- `onCreateChooserDialog(@NonNull Context context, @Nullable Bundle savedInstanceState)` -> `MediaRouteChooserDialog`
- `onStart()` -> `void`

## `org.telegram.ui.Components.CastMediaRouteButton$MyMediaRouteControllerDialogFragment`
- `onCreateControllerDialog(@NonNull Context context, @Nullable Bundle savedInstanceState)` -> `MediaRouteControllerDialog`

## `org.telegram.ui.Components.ChatAvatarContainer`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getAvatarImageView()` -> `BackupImageView`
- `getBotVerificationDrawable(long icon, boolean animated)` -> `AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable`
- `static getChatSubtitle(TLRPC.Chat chat, TLRPC.ChatFull info, int onlineCount)` -> `CharSequence`
- `getLastSubtitleColorKey()` -> `int`
- `getLeftPadding()` -> `int`
- `getSharedMediaPreloader()` -> `SharedMediaLayout.SharedMediaPreloader`
- `getSubtitlePaint()` -> `TextPaint`
- `getSubtitleTextView()` -> `View`
- `getTimeItem()` -> `ImageView`
- `getTitleTextView()` -> `SimpleTextView`
- `getVisualWidth()` -> `int`
- `hideSubtitle()` -> `void`
- `hideTimeItem(boolean animated)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onAvatarClick()` -> `boolean`
- `onDestroy()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `openProfile(boolean byAvatar)` -> `void`
- `openProfile(boolean byAvatar, boolean fromChatAnimation, boolean removeLast)` -> `void`
- `openSearch()` -> `void`
- `openSetTimer()` -> `boolean`
- `setActionBar(ActionBar actionBar)` -> `void`
- `setChatAvatar(TLRPC.Chat chat)` -> `void`
- `setCommunityItemVisible(boolean visible)` -> `void`
- `setGlassMode()` -> `void`
- `setLeftPadding(int value)` -> `void`
- `setOccupyStatusBar(boolean value)` -> `void`
- `setOverrideSubtitleColor(Integer overrideSubtitleColor)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `setRightAvatarPadding(int value)` -> `void`
- `setStars(boolean stars, boolean animated)` -> `void`
- `setStoriesForceState(Integer storiesForceState)` -> `void`
- `setSubtitle(CharSequence value)` -> `void`
- `setTime(int value, boolean animated)` -> `void`
- `setTitle(CharSequence value)` -> `void`
- `setTitle(CharSequence value, boolean scam, boolean fake, boolean verified, boolean premium, TLRPC.EmojiStatus emojiStatus, boolean animated)` -> `void`
- `setTitleColors(int title, int subtitle)` -> `void`
- `setTitleIcons(Drawable leftIcon, Drawable mutedIcon)` -> `void`
- `setUserAvatar(TLRPC.User user)` -> `void`
- `setUserAvatar(TLRPC.User user, boolean showSelf)` -> `void`
- `showTimeItem(boolean animated)` -> `void`
- `updateColors()` -> `void`
- `updateOnlineCount()` -> `void`
- `updateSubtitle()` -> `void`
- `updateSubtitle(boolean animated)` -> `void`
- `useAnimatedSubtitle()` -> `boolean`

## `org.telegram.ui.Components.ChatAvatarContainer$SimpleTextConnectedView`
- `setText(CharSequence value)` -> `boolean`
- `setTranslationY(float translationY)` -> `void`

## `org.telegram.ui.Components.ChatBigEmptyView`
- `setStatusText(CharSequence text)` -> `void`
- `setTextColor(int color)` -> `void`

## `org.telegram.ui.Components.ChatGreetingsView`
- `static createFilter(TLRPC.Document document)` -> `String`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `resetPremiumLock()` -> `void`
- `setBackground(Drawable background)` -> `void`
- `setListener(Listener listener)` -> `void`
- `setNextSticker(TLRPC.Document sticker, Runnable whenDone)` -> `void`
- `setPremiumLock(boolean lock, CharSequence text, CharSequence buttonText, View.OnClickListener onButtonClick)` -> `void`
- `setPremiumLock(boolean lock, boolean isSuggestion, CharSequence text, CharSequence buttonText, View.OnClickListener onButtonClick)` -> `void`
- `setPreview(CharSequence title, CharSequence message)` -> `void`
- `setSticker(TLRPC.Document sticker)` -> `void`
- `setSticker(String stickerPath)` -> `void`
- `setText(CharSequence title, CharSequence description)` -> `void`
- `setVisiblePart(float visibleTop, int parentH)` -> `void`
- `static showPremiumSheet(Context context, int currentAccount, long dialogId, Theme.ResourcesProvider resourcesProvider)` -> `void`

## `org.telegram.ui.Components.ChatReplyContainer`
- `current()` -> `Layout`
- `switchLayouts()` -> `void`
- `switchLayouts(boolean animated)` -> `void`

## `org.telegram.ui.Components.ChatReplyContainer$Layout`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.ChatScrimPopupContainerLayout`
- `applyViewBottom(FrameLayout bottomView)` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setExpandSize(float expandSize)` -> `void`
- `setMaxHeight(int maxHeight)` -> `void`
- `setPopupAlpha(float alpha)` -> `void`
- `setPopupWindowLayout(ActionBarPopupWindow.ActionBarPopupWindowLayout popupWindowLayout)` -> `void`
- `setReactionsLayout(ReactionsContainerLayout reactionsLayout)` -> `void`
- `setReactionsTransitionProgress(float v)` -> `void`

## `org.telegram.ui.Components.ChatSearchTabs`
- `getCurrentHeight()` -> `int`
- `isShown()` -> `boolean`
- `setShown(float shownT)` -> `void`
- `setTabs(ViewPagerFixed.TabsView tabs)` -> `void`
- `show(boolean show)` -> `void`
- `shown()` -> `boolean`

## `org.telegram.ui.Components.CheckBox`
- `getProgress()` -> `float`
- `isChecked()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `setBackgroundColor(int backgroundColor)` -> `void`
- `setCheckColor(int checkColor)` -> `void`
- `setCheckOffset(int value)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setChecked(int num, boolean checked, boolean animated)` -> `void`
- `setColor(int backgroundColor, int checkColor)` -> `void`
- `setDrawBackground(boolean value)` -> `void`
- `setHasBorder(boolean value)` -> `void`
- `setNum(int num)` -> `void`
- `setProgress(float value)` -> `void`
- `setSize(int size)` -> `void`
- `setStrokeWidth(int value)` -> `void`
- `setVisibility(int visibility)` -> `void`

## `org.telegram.ui.Components.CheckBox2`
- `getCheckBoxBase()` -> `CheckBoxBase`
- `getDrawUnchecked()` -> `boolean`
- `getProgress()` -> `float`
- `isChecked()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `setChecked(int num, boolean checked, boolean animated)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setCirclePaintProvider(GenericProvider<Void, Paint> circlePaintProvider)` -> `void`
- `setColor(int background, int background2, int check)` -> `void`
- `setDrawBackgroundAsArc(int type)` -> `void`
- `setDrawUnchecked(boolean value)` -> `void`
- `setDuration(long duration)` -> `void`
- `setEnabled(boolean enabled)` -> `void`
- `setForbidden(boolean forbidden)` -> `void`
- `setIcon(int icon)` -> `void`
- `setNum(int num)` -> `void`
- `setProgressDelegate(CheckBoxBase.ProgressDelegate delegate)` -> `void`

## `org.telegram.ui.Components.CheckBoxBase`
- `draw(Canvas canvas)` -> `void`
- `getDrawUnchecked()` -> `boolean`
- `getParentView()` -> `View`
- `getProgress()` -> `float`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setAlpha(float alpha)` -> `void`
- `setBackgroundAlpha(float alpha)` -> `void`
- `setBackgroundColor(int backgroundColor)` -> `void`
- `setBackgroundDrawable(MessageDrawable drawable)` -> `void`
- `setBackgroundType(int type)` -> `void`
- `setBounds(int x, int y, int width, int height)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setChecked(int num, boolean checked, boolean animated)` -> `void`
- `setCirclePaintProvider(GenericProvider<Void, Paint> circlePaintProvider)` -> `void`
- `setColor(int background, int background2, int check)` -> `void`
- `setCustomRadius(float customRadius)` -> `void`
- `setCustomRadiusFactor(float customRadiusFactor)` -> `void`
- `setCuttingCheck(boolean cutCheck)` -> `void`
- `setDrawUnchecked(boolean value)` -> `void`
- `setEnabled(boolean value)` -> `void`
- `setForbidden(boolean value)` -> `void`
- `setNum(int num)` -> `void`
- `setParentView(View view)` -> `void`
- `setProgress(float value)` -> `void`
- `setProgressDelegate(ProgressDelegate delegate)` -> `void`
- `setResourcesProvider(Theme.ResourcesProvider resourcesProvider)` -> `void`
- `setSize(float size)` -> `void`
- `setStrokeBackgroundColor(int key)` -> `void`
- `setStrokeBackgroundWidth(int width)` -> `void`
- `setUseDefaultCheck(boolean value)` -> `void`

## `org.telegram.ui.Components.CheckBoxSquare`
- `getProgress()` -> `float`
- `getThemedColor(int key)` -> `int`
- `isChecked()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setColors(int unchecked, int checked, int check)` -> `void`
- `setDisabled(boolean disabled)` -> `void`
- `setProgress(float value)` -> `void`

## `org.telegram.ui.Components.ChecksHintView`
- `getBaseTranslationY()` -> `float`
- `hide()` -> `void`
- `showForMessageCell(ChatMessageCell cell, boolean animated)` -> `boolean`

## `org.telegram.ui.Components.ChevronView`
- `onDraw(Canvas canvas)` -> `void`
- `setColor(int color)` -> `void`

## `org.telegram.ui.Components.CircleBezierDrawable`
- `calculateRandomAdditionals()` -> `void`
- `draw(float cX, float cY, Canvas canvas, Paint paint)` -> `void`
- `setAdditionals(int[] additionals)` -> `void`
- `setRandomAdditions(float randomK)` -> `void`

## `org.telegram.ui.Components.CircularProgressDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `static getSegments(float t, float[] segments)` -> `void`
- `reset()` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setAngleOffset(float angleOffset)` -> `void`
- `setBounds(int left, int top, int right, int bottom)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.CircularViewPager`
- `setAdapter(@Nullable PagerAdapter adapter)` -> `void`
- `setAdapter(Adapter adapter)` -> `void`

## `org.telegram.ui.Components.CircularViewPager$Adapter`
- `getRealPosition(int adapterPosition)` -> `int`

## `org.telegram.ui.Components.ClipRoundedDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getDrawable()` -> `Drawable`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int i)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setDrawable(Drawable newDrawable)` -> `void`
- `setPadding(float left, float top, float right, float bottom)` -> `ClipRoundedDrawable`
- `setRadii(float rx, float ry)` -> `ClipRoundedDrawable`
- `setRadii(float topLeft, float topRight, float bottomRight, float bottomLeft)` -> `ClipRoundedDrawable`
- `setRadii(float[] newRadii)` -> `void`
- `setRadius(float r)` -> `ClipRoundedDrawable`

## `org.telegram.ui.Components.ClippingImageView`
- `getAnimationProgress()` -> `float`
- `getBitmap()` -> `Bitmap`
- `getBitmapHolder()` -> `ImageReceiver.BitmapHolder`
- `getCenterX()` -> `float`
- `getCenterY()` -> `float`
- `getClipBottom()` -> `int`
- `getClipHorizontal()` -> `int`
- `getClipLeft()` -> `int`
- `getClipRight()` -> `int`
- `getClipTop()` -> `int`
- `getClippedVisibleRect(RectF rect)` -> `void`
- `getOrientation()` -> `int`
- `getRadius()` -> `int[]`
- `getTranslationY()` -> `float`
- `onDraw(Canvas canvas)` -> `void`
- `setAdditionalTranslationX(float value)` -> `void`
- `setAdditionalTranslationY(float value)` -> `void`
- `setAnimationProgress(float progress)` -> `void`
- `setAnimationValues(float[][] values, boolean in, boolean fade)` -> `void`
- `setClipBottom(int value)` -> `void`
- `setClipHorizontal(int value)` -> `void`
- `setClipLeft(int value)` -> `void`
- `setClipRight(int value)` -> `void`
- `setClipTop(int value)` -> `void`
- `setClipVertical(int value)` -> `void`
- `setImageBitmap(ImageReceiver.BitmapHolder bitmap)` -> `void`
- `setImageX(int value)` -> `void`
- `setImageY(int value)` -> `void`
- `setOrientation(int angle)` -> `void`
- `setOrientation(int angle, int invert)` -> `void`
- `setRadius(int[] value)` -> `void`
- `setTranslationY(float translationY)` -> `void`

## `org.telegram.ui.Components.CloseProgressDrawable`
- `draw(Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(ColorFilter cf)` -> `void`

## `org.telegram.ui.Components.CloseProgressDrawable2`
- `draw(Canvas canvas)` -> `void`
- `getCurrentColor()` -> `int`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `isAnimating()` -> `boolean`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(ColorFilter cf)` -> `void`
- `setSide(int value)` -> `void`
- `startAnimation()` -> `void`
- `stopAnimation()` -> `void`

## `org.telegram.ui.Components.CodepointsLengthInputFilter`
- `getMax()` -> `int`

## `org.telegram.ui.Components.CombinedDrawable`
- `draw(Canvas canvas)` -> `void`
- `getBackground()` -> `Drawable`
- `getBackgroundDrawable()` -> `Drawable`
- `getConstantState()` -> `ConstantState`
- `getIcon()` -> `Drawable`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getMinimumHeight()` -> `int`
- `getMinimumWidth()` -> `int`
- `getOpacity()` -> `int`
- `getState()` -> `int[]`
- `invalidateDrawable(@NonNull Drawable who)` -> `void`
- `isStateful()` -> `boolean`
- `jumpToCurrentState()` -> `void`
- `onStateChange(int[] state)` -> `boolean`
- `scheduleDrawable(@NonNull Drawable who, @NonNull Runnable what, long when)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setBackgroundDrawable(Drawable backgroundDrawable)` -> `void`
- `setCenter(boolean value)` -> `void`
- `setColorFilter(ColorFilter colorFilter)` -> `void`
- `setCustomSize(int width, int height)` -> `void`
- `setFullsize(boolean value)` -> `void`
- `setIconDrawable(Drawable iconDrawable)` -> `void`
- `setIconOffset(int x, int y)` -> `void`
- `setIconSize(int width, int height)` -> `void`
- `setState(int[] stateSet)` -> `boolean`
- `unscheduleDrawable(@NonNull Drawable who, @NonNull Runnable what)` -> `void`

## `org.telegram.ui.Components.CommunityAvatarDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.CompatDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedToWindow()` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.ContactsEmptyView`
- `onAttachedToWindow()` -> `void`
- `onInviteClick()` -> `void`
- `setColors()` -> `void`

## `org.telegram.ui.Components.ContextProgressView`
- `onAttachedToWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `setColors(int innerColor, int outerColor)` -> `void`
- `setVisibility(int visibility)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.CornerPath`
- `closeRects()` -> `void`
- `reset()` -> `void`
- `rewind()` -> `void`
- `setPadding(int padX, int padY)` -> `void`
- `setRectsUnionDiffDelta(float delta)` -> `void`
- `setUseCornerPathImplementation(boolean use)` -> `void`

## `org.telegram.ui.Components.CorrectlyMeasuringTextView`
- `onMeasure(int wms, int hms)` -> `void`

## `org.telegram.ui.Components.CounterView`
- `getEnterProgress()` -> `float`
- `isInOutAnimation()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setColors(int textKey, int circleKey)` -> `void`
- `setCount(int count, boolean animated)` -> `void`
- `setGravity(int gravity)` -> `void`
- `setReverse(boolean b)` -> `void`

## `org.telegram.ui.Components.CounterView$CounterDrawable`
- `draw(Canvas canvas)` -> `void`
- `getCenterX()` -> `float`
- `getCurrentWidth()` -> `int`
- `getThemedColor(int key)` -> `int`
- `getWidth()` -> `int`
- `setCount(int count, boolean animated)` -> `void`
- `setParent(View parent)` -> `void`
- `setSize(int h, int w)` -> `void`
- `setText(CharSequence text, boolean animated)` -> `void`
- `setText(CharSequence text, boolean animated, int count, boolean isText)` -> `void`
- `setType(int type)` -> `void`
- `updateBackgroundRect()` -> `void`

## `org.telegram.ui.Components.CreateRtmpStreamBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `dismissInternal()` -> `void`
- `getTitle()` -> `CharSequence`
- `static show(TLRPC.Peer peer, BaseFragment fragment, long dialogId, boolean hasFewPeers, JoinCallAlert.JoinCallAlertDelegate joinCallDelegate)` -> `void`

## `org.telegram.ui.Components.CreateRtmpStreamBottomSheet$TextDetailCellFactory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `TextDetailCell`
- `static of(CharSequence text, CharSequence value, boolean divider)` -> `UItem`

## `org.telegram.ui.Components.Crop.CropAreaView`
- `calculateRect(RectF rect, float cropAspectRatio)` -> `void`
- `fill(final RectF targetRect, Animator scaleAnimator, boolean animated)` -> `void`
- `getAspectRatio()` -> `float`
- `getCropBottom()` -> `float`
- `getCropCenterX()` -> `float`
- `getCropCenterY()` -> `float`
- `getCropHeight()` -> `float`
- `getCropLeft()` -> `float`
- `getCropRect(RectF rect)` -> `void`
- `getCropRight()` -> `float`
- `getCropTop()` -> `float`
- `getCropWidth()` -> `float`
- `getInterpolator()` -> `Interpolator`
- `getLockAspectRatio()` -> `float`
- `getTargetRectToFill()` -> `RectF`
- `getTargetRectToFill(float aspectRatio)` -> `RectF`
- `isDragging()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onLayout(boolean b, int i, int i1, int i2, int i3)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `resetAnimator()` -> `void`
- `setActualRect(float aspectRatio)` -> `void`
- `setActualRect(RectF rect)` -> `void`
- `setBitmap(int w, int h, boolean sideward, boolean fform)` -> `void`
- `setBottomPadding(float value)` -> `void`
- `setDimAlpha(float alpha)` -> `void`
- `setDimVisibility(boolean visible)` -> `void`
- `setFrameAlpha(float alpha)` -> `void`
- `setFrameVisibility(boolean visible, boolean animated)` -> `void`
- `setFreeform(boolean fform)` -> `void`
- `setGridType(GridType type, boolean animated)` -> `void`
- `setIsVideo(boolean value)` -> `void`
- `setListener(AreaViewListener l)` -> `void`
- `setLockedAspectRatio(float aspectRatio)` -> `void`
- `setRotationScaleTranslation(float rotate, float scale, float tx, float ty)` -> `void`
- `setSubtitle(String subtitle)` -> `void`
- `setTopPadding(float value)` -> `void`
- `updateStatusShow(boolean show)` -> `void`
- `updateTouchAreas()` -> `void`

## `org.telegram.ui.Components.Crop.CropGestureDetector`
- `getActiveX(MotionEvent ev)` -> `float`
- `getActiveY(MotionEvent ev)` -> `float`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `setOnGestureListener(CropGestureListener listener)` -> `void`

## `org.telegram.ui.Components.Crop.CropRotationWheel`
- `drawLine(Canvas canvas, int i, float delta, int width, int height, boolean center, Paint paint)` -> `void`
- `getRotation()` -> `float`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `reset(boolean resetMirror)` -> `void`
- `setAspectLock(boolean enabled)` -> `void`
- `setFreeform(boolean freeform)` -> `void`
- `setListener(RotationWheelListener listener)` -> `void`
- `setMirrored(boolean value)` -> `void`
- `setRotated(boolean value)` -> `void`
- `setRotation(float rotation, boolean animated)` -> `void`

## `org.telegram.ui.Components.Crop.CropState`
- `getConcatMatrix(Matrix toMatrix)` -> `void`
- `getHeight()` -> `float`
- `getMatrix()` -> `Matrix`
- `getRotation()` -> `float`
- `getScale()` -> `float`
- `getWidth()` -> `float`
- `getX()` -> `float`
- `getY()` -> `float`
- `rotate(float angle, float pivotX, float pivotY)` -> `void`
- `scale(float s, float pivotX, float pivotY)` -> `void`
- `translate(float x, float y)` -> `void`

## `org.telegram.ui.Components.Crop.CropTransform`
- `clone()` -> `CropTransform`
- `getCropAreaX()` -> `float`
- `getCropAreaY()` -> `float`
- `getCropPh()` -> `float`
- `getCropPw()` -> `float`
- `getCropPx()` -> `float`
- `getCropPy()` -> `float`
- `getMinScale()` -> `float`
- `getOrientation()` -> `int`
- `getRotation()` -> `float`
- `getScale()` -> `float`
- `getTrueCropScale()` -> `float`
- `setViewTransform(boolean set)` -> `void`
- `setViewTransform(boolean set, float px, float py, float rotate, int orientation, float scale, float cs, float ms, float pw, float ph, float cx, float cy, boolean mirrored)` -> `void`

## `org.telegram.ui.Components.Crop.CropView`
- `applyToCropState(MediaController.CropState cropState)` -> `void`
- `calculateBoundingBox(float w, float h, float rotation)` -> `RectF`
- `getActualRect()` -> `RectF`
- `static getCopy(String path)` -> `String`
- `getCropHeight()` -> `float`
- `getCropLeft()` -> `float`
- `getCropTop()` -> `float`
- `getCropWidth()` -> `float`
- `getCurrentHeight()` -> `int`
- `getCurrentWidth()` -> `int`
- `getStateFullOrientation()` -> `float`
- `getStateMirror()` -> `boolean`
- `getStateOrientation()` -> `float`
- `hide()` -> `void`
- `isMirrored()` -> `boolean`
- `isReady()` -> `boolean`
- `makeCrop(MediaController.MediaEditState editState)` -> `void`
- `maximize(boolean animated)` -> `void`
- `mirror()` -> `boolean`
- `onAreaChange()` -> `void`
- `onAreaChangeBegan()` -> `void`
- `onAreaChangeEnded()` -> `void`
- `onDrag(float dx, float dy)` -> `void`
- `onFling(float startX, float startY, float velocityX, float velocityY)` -> `void`
- `onHide()` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onRotationBegan()` -> `void`
- `onRotationEnded()` -> `void`
- `onScale(float scale, float x, float y)` -> `void`
- `onScrollChangeBegan()` -> `void`
- `onScrollChangeEnded()` -> `void`
- `onShow()` -> `void`
- `onTapUp()` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `reset()` -> `void`
- `reset(boolean force)` -> `void`
- `rotate(float angle)` -> `boolean`
- `scaleWidthToMaxSize(RectF sizeRect, RectF maxSizeRect)` -> `float`
- `setAspectRatio(float ratio)` -> `void`
- `setBitmap(Bitmap b, int rotation, boolean fform, boolean same, PaintingOverlay overlay, CropTransform transform, VideoEditTextureView videoView, MediaController.CropState restoreState)` -> `void`
- `setBottomPadding(float value)` -> `void`
- `setFreeform(boolean fform)` -> `void`
- `setListener(CropViewListener l)` -> `void`
- `setRotation(float angle)` -> `void`
- `setSubtitle(String subtitle)` -> `void`
- `setTopPadding(float value)` -> `void`
- `show()` -> `void`
- `showAspectRatioDialog()` -> `void`
- `start(int rotation, boolean fform, boolean same, CropTransform transform, MediaController.CropState restoreState)` -> `void`
- `stop()` -> `void`
- `updateLayout()` -> `void`
- `updateMatrix()` -> `void`
- `updateMatrix(boolean force)` -> `void`
- `willShow()` -> `void`

## `org.telegram.ui.Components.Crop.CropView$CropRectangle`
- `applyMatrix(Matrix m)` -> `void`
- `getRect(RectF rect)` -> `void`
- `setRect(RectF rect)` -> `void`

## `org.telegram.ui.Components.CrossOutDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `getProgress()` -> `float`
- `setAlpha(int i)` -> `void`
- `setBounds(int left, int top, int right, int bottom)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setColorKey(int colorKey)` -> `void`
- `setCrossOut(boolean cross, boolean animated)` -> `void`
- `setOffsets(float xOffset, float lenOffsetTop, float lenOffsetBottom)` -> `void`
- `setStrokeWidth(float w)` -> `void`

## `org.telegram.ui.Components.CrossfadeDrawable`
- `animateToProgress(float value)` -> `void`
- `draw(Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `getProgress()` -> `float`
- `onBoundsChange(Rect bounds)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(ColorFilter colorFilter)` -> `void`
- `setProgress(float value)` -> `void`

## `org.telegram.ui.Components.CubicBezierInterpolator`
- `getBezierCoordinateY(float time)` -> `float`
- `getInterpolation(float time)` -> `float`
- `getXForTime(float time)` -> `float`

## `org.telegram.ui.Components.CustomPhoneKeyboardView`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setDispatchBackWhenEmpty(boolean dispatchBackWhenEmpty)` -> `void`
- `setEditText(EditText editText)` -> `void`
- `setViewToFindFocus(View viewToFindFocus)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.CustomPhoneKeyboardView$NumberButtonView`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.Components.CustomPopupMenu`
- `dismiss()` -> `void`
- `show(View anchorView, int x, int y)` -> `void`

## `org.telegram.ui.Components.DeleteMessagesBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `dismiss()` -> `void`
- `getTitle()` -> `CharSequence`
- `onContainerLayout(int l, int t, int r, int b)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.Components.DeleteMessagesBottomSheet$Action`
- `areAllSelected()` -> `boolean`
- `collapseOrExpand()` -> `void`
- `first()` -> `TLObject`
- `forEach(Utilities.IndexedConsumer<TLObject> action)` -> `void`
- `forEachSelected(Utilities.IndexedConsumer<TLObject> action)` -> `void`
- `getCount()` -> `int`
- `setAllChecks(boolean value)` -> `void`
- `setAllChecks(boolean value, boolean notify)` -> `void`
- `setFilter(boolean[] filter)` -> `void`
- `toggleAllChecks()` -> `void`
- `toggleCheck(int index)` -> `void`
- `updateCounters()` -> `void`
- `updateTitle()` -> `void`

## `org.telegram.ui.Components.DialogsBotsAdapter`
- `atTop()` -> `boolean`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getObject(int position)` -> `Object`
- `getTopPeerObject(int position)` -> `Object`
- `hideKeyboard()` -> `void`
- `openBot(TLRPC.User user)` -> `void`
- `search(String query)` -> `void`
- `searchMore()` -> `void`
- `seesLoading()` -> `boolean`

## `org.telegram.ui.Components.DialogsChannelsAdapter`
- `atTop()` -> `boolean`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getNextChannels(int position)` -> `ArrayList<TLRPC.Chat>`
- `getObject(int position)` -> `Object`
- `hideKeyboard()` -> `void`
- `search(String query)` -> `void`
- `searchMore()` -> `void`
- `seesLoading()` -> `boolean`
- `toggleExpandedMyChannels(View view)` -> `void`
- `toggleExpandedSearchChannels(View view)` -> `void`
- `updateMyChannels()` -> `void`

## `org.telegram.ui.Components.DialogsItemAnimator`
- `animateAdd(final ViewHolder holder)` -> `boolean`
- `animateAddImpl(final ViewHolder holder)` -> `void`
- `animateChange(ViewHolder oldHolder, ViewHolder newHolder,ItemHolderInfo info, int fromX, int fromY, int toX, int toY)` -> `boolean`
- `animateChangeImpl(final ChangeInfo changeInfo)` -> `void`
- `animateMoveImpl(final ViewHolder holder, ItemHolderInfo info, int fromX, int fromY, int toX, int toY)` -> `void`
- `animateRemove(final ViewHolder holder, ItemHolderInfo info)` -> `boolean`
- `dispatchFinishedWhenDone()` -> `void`
- `endAnimation(ViewHolder item)` -> `void`
- `endAnimations()` -> `void`
- `listenToAnimationUpdates(Runnable listener)` -> `void`
- `onAllAnimationsDone()` -> `void`
- `onListScroll(int dy)` -> `void`
- `prepareForRemove()` -> `void`
- `runPendingAnimations()` -> `void`

## `org.telegram.ui.Components.DialogsItemAnimator$ChangeInfo`
- `toString()` -> `String`

## `org.telegram.ui.Components.DotDividerSpan`
- `draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, @NonNull Paint paint)` -> `void`
- `getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i1, @Nullable Paint.FontMetricsInt fontMetricsInt)` -> `int`
- `setSize(float size)` -> `void`
- `setTopPadding(int topPadding)` -> `void`

## `org.telegram.ui.Components.DownloadsInfoBottomSheet`
- `static show(Activity parentActivity, BaseFragment parentFragment)` -> `void`

## `org.telegram.ui.Components.DrawingInBackgroundThreadDrawable`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `draw(Canvas canvas, long time, int w, int h, float alpha)` -> `void`
- `drawBitmap(Canvas canvas, Bitmap bitmap, Paint paint)` -> `void`
- `drawInBackground(Canvas canvas)` -> `void`
- `drawInUiThread(Canvas nextRenderingCanvas, float alpha)` -> `void`
- `onAttachToWindow()` -> `void`
- `onDetachFromWindow()` -> `void`
- `onFrameReady()` -> `void`
- `onPaused()` -> `void`
- `onResume()` -> `void`
- `prepareDraw(long time)` -> `void`
- `reset()` -> `void`
- `setLayerNum(int value)` -> `void`

## `org.telegram.ui.Components.DrawingInBackgroundThreadDrawable$DispatchQueuePool`
- `getNextQueue()` -> `DispatchQueue`

## `org.telegram.ui.Components.EarListener`
- `attach()` -> `void`
- `attachPlayer(VideoPlayer player)` -> `void`
- `detach()` -> `void`
- `forbidRaiseToListen()` -> `boolean`
- `onAccuracyChanged(Sensor sensor, int accuracy)` -> `void`
- `onSensorChanged(SensorEvent event)` -> `void`
- `updateRaised()` -> `void`

## `org.telegram.ui.Components.EdgeEffectTrackerFactory`
- `getDistance(@EdgeDirection int direction)` -> `float`

## `org.telegram.ui.Components.EdgeEffectTrackerFactory$TrackingEdgeEffect`
- `draw(Canvas canvas)` -> `boolean`
- `finish()` -> `void`
- `onAbsorb(int velocity)` -> `void`
- `onPull(float deltaDistance)` -> `void`
- `onPull(float deltaDistance, float displacement)` -> `void`
- `onPullDistance(float deltaDistance, float displacement)` -> `float`
- `onRelease()` -> `void`
- `setSize(int width, int height)` -> `void`

## `org.telegram.ui.Components.EditCoverButton`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `setBlurredBackgroundDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable)` -> `void`
- `setImage(Bitmap bitmap)` -> `void`
- `setImage(TLRPC.Photo photo, Object parentObject)` -> `void`
- `setImage(String path)` -> `void`

## `org.telegram.ui.Components.EditTextBoldCursor`
- `dispatchTextWatchersTextChanged()` -> `void`
- `drawCursor(Canvas canvas, GradientDrawable drawable)` -> `void`
- `extendActionMode(ActionMode actionMode, Menu menu)` -> `void`
- `fixHandleView(boolean reset)` -> `void`
- `getActionModeStyle()` -> `int`
- `getAutofillType()` -> `int`
- `getErrorLayout(int width)` -> `StaticLayout`
- `getExtendedPaddingBottom()` -> `int`
- `getExtendedPaddingTop()` -> `int`
- `getHeaderAnimationProgress()` -> `float`
- `getHintLayoutEx()` -> `Layout`
- `getLineSpacingExtra()` -> `float`
- `getLineY()` -> `float`
- `getOnPremiumMenuLockClickListener()` -> `Runnable`
- `getResourcesProvider()` -> `Theme.ResourcesProvider`
- `getTextCursorDrawable()` -> `Drawable`
- `getTextSelectHandle()` -> `Drawable`
- `getTextSelectHandleLeft()` -> `Drawable`
- `getTextSelectHandleRight()` -> `Drawable`
- `hideActionMode()` -> `void`
- `invalidateForce()` -> `void`
- `isTextWatchersSuppressed()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onScrollChanged(int horiz, int vert, int oldHoriz, int oldVert)` -> `void`
- `onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `postDelayed(Runnable action, long delayMillis)` -> `boolean`
- `setAllowDrawCursor(boolean value)` -> `void`
- `setBlurredBackgroundDrawableViewFactory(BlurredBackgroundDrawableViewFactory factory)` -> `void`
- `setCursorColor(int color)` -> `void`
- `setCursorSize(int value)` -> `void`
- `setCursorWidth(float width)` -> `void`
- `setEllipsizeByGradient(boolean value)` -> `void`
- `setErrorLineColor(int error)` -> `void`
- `setErrorText(CharSequence text)` -> `void`
- `setForceCursorEnd(boolean cursorEnd)` -> `void`
- `setHandlesColor(int color)` -> `void`
- `setHeaderAnimationProgress(float value)` -> `void`
- `setHeaderHintColor(int value)` -> `void`
- `setHintColor(int value)` -> `void`
- `setHintRightOffset(int rightHintOffset)` -> `void`
- `setHintText(CharSequence text)` -> `void`
- `setHintText(CharSequence text, boolean animated)` -> `void`
- `setHintText(CharSequence text, boolean animated, TextPaint paint)` -> `void`
- `setHintText2(CharSequence text, boolean animated)` -> `void`
- `setHintVisible(boolean value, boolean animated)` -> `void`
- `setLineColors(int color, int active, int error)` -> `void`
- `setLineSpacing(float add, float mult)` -> `void`
- `setNextSetTextAnimated(boolean value)` -> `void`
- `setOnPremiumMenuLockClickListener(Runnable listener)` -> `void`
- `setSelection(int start, int stop)` -> `void`
- `setSelection(int index)` -> `void`
- `setSupportRtlHint(boolean value)` -> `void`
- `setText(CharSequence text, BufferType type)` -> `void`
- `setTextSelectHandle(@NonNull Drawable drawable)` -> `void`
- `setTextSelectHandleLeft(@NonNull Drawable drawable)` -> `void`
- `setTextSelectHandleRight(@NonNull Drawable drawable)` -> `void`
- `setTextSize(int unit, float size)` -> `void`
- `setTextWatchersSuppressed(boolean textWatchersSuppressed, boolean dispatchChanged)` -> `void`
- `setTransformHintToHeader(boolean value)` -> `void`
- `setTransformHintToHeaderOnFocus(boolean value)` -> `void`
- `setWindowView(View view)` -> `void`
- `startActionMode(ActionMode.Callback callback)` -> `ActionMode`
- `startActionMode(ActionMode.Callback callback, int type)` -> `ActionMode`
- `useAnimatedTextDrawable()` -> `void`

## `org.telegram.ui.Components.EditTextCaption`
- `closeCreationLinkDialog(boolean invoked)` -> `boolean`
- `createUrlSpan(String url)` -> `URLSpanReplacement`
- `getAllowTextEntitiesIntersection()` -> `boolean`
- `getCaption()` -> `String`
- `getCurrentStyle(int start, int end)` -> `int`
- `isNearRightCaption(int rightMargin)` -> `boolean`
- `makeSelectedBold()` -> `void`
- `makeSelectedDate()` -> `void`
- `makeSelectedItalic()` -> `void`
- `makeSelectedMono()` -> `void`
- `makeSelectedQuote()` -> `void`
- `makeSelectedQuote(boolean collapse)` -> `void`
- `makeSelectedRegular()` -> `void`
- `makeSelectedSpoiler()` -> `void`
- `makeSelectedStrike()` -> `void`
- `makeSelectedUnderline()` -> `void`
- `makeSelectedUrl()` -> `void`
- `makeSelectedUrl(Runnable onApplied)` -> `void`
- `notifySpansChanged()` -> `void`
- `onContextMenuClose()` -> `void`
- `onContextMenuOpen()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onLineCountChanged(int oldLineCount, int newLineCount)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTextContextMenuItem(int id)` -> `boolean`
- `onWindowFocusChanged(boolean hasWindowFocus)` -> `void`
- `performAccessibilityAction(int action, Bundle arguments)` -> `boolean`
- `performMenuAction(int itemId)` -> `boolean`
- `setAllowTextEntitiesIntersection(boolean value)` -> `void`
- `setCaption(String value)` -> `void`
- `setDelegate(EditTextCaptionDelegate editTextCaptionDelegate)` -> `void`
- `setHintColor(int value)` -> `void`
- `setRightText(CharSequence text)` -> `void`
- `setSelectionOverride(int start, int end)` -> `void`
- `startActionMode(final ActionMode.Callback callback, int type)` -> `ActionMode`
- `startActionMode(final ActionMode.Callback callback)` -> `ActionMode`
- `toggleStyleForSelection(int flag)` -> `void`
- `translateSelected()` -> `void`

## `org.telegram.ui.Components.EditTextEffects`
- `static allowHackingTextCanvas()` -> `boolean`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `emojiCacheType()` -> `int`
- `getOffsetY()` -> `float`
- `getTextToUse()` -> `CharSequence`
- `invalidateEffects()` -> `void`
- `invalidateQuotes(boolean force)` -> `void`
- `invalidateSpoilers()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onSelectionChanged(int selStart, int selEnd)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter)` -> `void`
- `recycleEmojis()` -> `void`
- `resetFontMetricsCache()` -> `void`
- `setClipToPadding(boolean clipToPadding)` -> `void`
- `setEmojiColor(Integer emojiColor)` -> `void`
- `setOffsetY(float offset)` -> `void`
- `setShouldRevealSpoilersByTouch(boolean shouldRevealSpoilersByTouch)` -> `void`
- `setSpoilersRevealed(boolean spoilersRevealed, boolean notifyEffects)` -> `void`
- `setText(CharSequence text, BufferType type)` -> `void`
- `setTextColor(int color)` -> `void`
- `updateAnimatedEmoji(boolean force)` -> `void`

## `org.telegram.ui.Components.EditTextSuggestionsFix`
- `afterTextChanged(Editable s)` -> `void`
- `beforeTextChanged(CharSequence charSequence, int start, int count, int after)` -> `void`
- `onTextChanged(CharSequence charSequence, int startIndex, int beforeCount, int afterCount)` -> `void`

## `org.telegram.ui.Components.EffectsTextView`
- `hit(int x, int y)` -> `ClickableSpan`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setDisablePaddingsOffset(boolean disablePaddingsOffset)` -> `void`
- `setDisablePaddingsOffsetX(boolean disablePaddingsOffsetX)` -> `void`
- `setDisablePaddingsOffsetY(boolean disablePaddingsOffsetY)` -> `void`
- `setText(CharSequence text, BufferType type)` -> `void`

## `org.telegram.ui.Components.EllipsizeSpanAnimator`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `reset()` -> `void`
- `wrap(SpannableString string, int start)` -> `void`

## `org.telegram.ui.Components.EllipsizeSpanAnimator$TextAlphaSpan`
- `setAlpha(int alpha)` -> `void`
- `updateDrawState(TextPaint tp)` -> `void`

## `org.telegram.ui.Components.EmbedBottomSheet`
- `destroy()` -> `void`
- `dismissInternal()` -> `void`
- `exitFromPip()` -> `void`
- `static getInstance()` -> `EmbedBottomSheet`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onContainerDraw(Canvas canvas)` -> `void`
- `onContainerTranslationYChanged(float translationY)` -> `void`
- `onCustomLayout(View view, int left, int top, int right, int bottom)` -> `boolean`
- `onCustomMeasure(View view, int width, int height)` -> `boolean`
- `pause()` -> `void`
- `static show(BaseFragment fragment, MessageObject message, PhotoViewer.PhotoViewerProvider photoViewerProvider, String title, String description, String originalUrl, final String url, int w, int h, boolean keyboardVisible)` -> `void`
- `static show(BaseFragment fragment, MessageObject message, PhotoViewer.PhotoViewerProvider photoViewerProvider, String title, String description, String originalUrl, final String url, int w, int h, int seekTime, boolean keyboardVisible)` -> `void`
- `updateTextureViewPosition()` -> `void`

## `org.telegram.ui.Components.EmbedBottomSheet$YoutubeProxy`
- `postEvent(final String eventName, final String eventData)` -> `void`

## `org.telegram.ui.Components.EmptyStubSpan`
- `draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, @NonNull Paint paint)` -> `void`
- `getSize(@NonNull Paint paint, CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm)` -> `int`

## `org.telegram.ui.Components.EmptyTextProgressView`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `setLottie(int resource, int w, int h)` -> `void`
- `setProgressBarColor(int color)` -> `void`
- `setShowAtCenter(boolean value)` -> `void`
- `setShowAtTop(boolean value)` -> `void`
- `setText(String text)` -> `void`
- `setTextColor(int color)` -> `void`
- `setTextSize(int size)` -> `void`
- `setTopImage(int resId)` -> `void`
- `showProgress()` -> `void`
- `showProgress(boolean animated)` -> `void`
- `showTextView()` -> `void`

## `org.telegram.ui.Components.ExtendedGridLayoutManager`
- `fixSize(Size size)` -> `Size`
- `getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)` -> `int`
- `getFlowItemCount()` -> `int`
- `getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)` -> `int`
- `getRowsCount(int width)` -> `int`
- `getSizeForItem(int i)` -> `Size`
- `getSpanSizeForItem(int i)` -> `int`
- `isFirstRow(int i)` -> `boolean`
- `isLastInRow(int i)` -> `boolean`
- `supportsPredictiveItemAnimations()` -> `boolean`

## `org.telegram.ui.Components.FadingTextViewLayout`
- `getCurrentView()` -> `TextView`
- `getNextView()` -> `TextView`
- `getStaticCharsCount()` -> `int`
- `getText()` -> `CharSequence`
- `onTextViewCreated(TextView textView)` -> `void`
- `setText(CharSequence text)` -> `void`
- `setText(CharSequence text, boolean animated)` -> `void`
- `setText(CharSequence text, boolean animated, boolean dontAnimateUnchangedStaticChars)` -> `void`

## `org.telegram.ui.Components.FillLastGridLayoutManager`
- `calcLastItemHeight()` -> `void`
- `measureChild(View view, int otherDirParentSpecMode, boolean alreadyMeasured)` -> `void`
- `onAdapterChanged(RecyclerView.Adapter oldAdapter, RecyclerView.Adapter newAdapter)` -> `void`
- `onItemsAdded(RecyclerView recyclerView, int positionStart, int itemCount)` -> `void`
- `onItemsChanged(RecyclerView recyclerView)` -> `void`
- `onItemsMoved(RecyclerView recyclerView, int from, int to, int itemCount)` -> `void`
- `onItemsRemoved(RecyclerView recyclerView, int positionStart, int itemCount)` -> `void`
- `onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int widthSpec, int heightSpec)` -> `void`
- `setAdditionalHeight(int value)` -> `void`
- `setBind(boolean bind)` -> `void`
- `setCanScrollVertically(boolean value)` -> `void`

## `org.telegram.ui.Components.FillLastLinearLayoutManager`
- `getLastItemHeight()` -> `int`
- `measureChildWithMargins(View child, int widthUsed, int heightUsed)` -> `void`
- `onAdapterChanged(RecyclerView.Adapter oldAdapter, RecyclerView.Adapter newAdapter)` -> `void`
- `onItemsAdded(RecyclerView recyclerView, int positionStart, int itemCount)` -> `void`
- `onItemsChanged(RecyclerView recyclerView)` -> `void`
- `onItemsMoved(RecyclerView recyclerView, int from, int to, int itemCount)` -> `void`
- `onItemsRemoved(RecyclerView recyclerView, int positionStart, int itemCount)` -> `void`
- `onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int widthSpec, int heightSpec)` -> `void`
- `setAdditionalHeight(int value)` -> `void`
- `setBind(boolean value)` -> `void`
- `setCanScrollVertically(boolean value)` -> `void`
- `setFixedLastItemHeight()` -> `void`
- `setMinimumLastViewHeight(int height)` -> `void`
- `setSetMeassuredHeightToLastItem(boolean setMeassuredHeightToLastItem)` -> `void`
- `setSkipFirstItem()` -> `void`

## `org.telegram.ui.Components.FilledTabsView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onTabSelected(Utilities.Callback<Integer> onTabClick)` -> `FilledTabsView`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBackgroundColor(int color)` -> `void`
- `setColors(int backgroundColor, int selectedColor, int textColor, int selectedTextColor)` -> `void`
- `setSelected(float tabIndex)` -> `void`
- `setSelectedColor(int color)` -> `void`
- `setSelectedTextColor(int color)` -> `void`
- `setTabs(CharSequence ...texts)` -> `void`
- `setTextColor(int color)` -> `void`

## `org.telegram.ui.Components.FilterGLThread`
- `finish()` -> `void`
- `getTexture()` -> `Bitmap`
- `getUiBlurBitmap()` -> `Bitmap`
- `run()` -> `void`
- `setFilterGLThreadDelegate(FilterShaders.FilterShadersDelegate filterShadersDelegate)` -> `void`
- `setSurfaceTextureSize(int width, int height)` -> `void`
- `setVideoSize(int width, int height)` -> `void`
- `shutdown()` -> `void`
- `updateHDRInfo(StoryEntry.HDRInfo hdrInfo)` -> `void`
- `updateUiBlurGradient(int top, int bottom)` -> `void`
- `updateUiBlurManager(BlurringShader.BlurManager manager)` -> `void`
- `updateUiBlurTransform(Matrix matrix, int w, int h)` -> `void`

## `org.telegram.ui.Components.FilterShaders`
- `create()` -> `boolean`
- `drawBlurPass()` -> `boolean`
- `drawBoxBlur()` -> `void`
- `drawCustomParamsPass()` -> `void`
- `drawEnhancePass()` -> `void`
- `drawOriginal()` -> `boolean`
- `drawSharpenPass()` -> `void`
- `drawSkinSmoothPass()` -> `boolean`
- `static getFilterShadersDelegate(MediaController.SavedFilterState lastState)` -> `FilterShadersDelegate`
- `getRenderBufferHeight()` -> `int`
- `getRenderBufferWidth()` -> `int`
- `getRenderFrameBuffer()` -> `int`
- `getRenderTexture(int index)` -> `int`
- `getTextureBuffer()` -> `FloatBuffer`
- `getVertexBuffer()` -> `FloatBuffer`
- `getVertexInvertBuffer()` -> `FloatBuffer`
- `setDelegate(FilterShadersDelegate filterShadersDelegate)` -> `void`
- `setRenderData(Bitmap currentBitmap, int orientation, int videoTex, int w, int h)` -> `void`
- `setScaleBitmap(boolean scale)` -> `void`
- `updateHDRInfo(StoryEntry.HDRInfo hdrInfo)` -> `void`

## `org.telegram.ui.Components.FilterShaders$ToneCurve`
- `getCurveTexture()` -> `int`

## `org.telegram.ui.Components.FilterTabsView`
- `animateColorsTo(int line, int active, int unactive, int selector, int background)` -> `void`
- `currentTabIsDefault()` -> `boolean`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `finishAddingTabs(boolean animated)` -> `void`
- `getCurrentTabId()` -> `int`
- `getCurrentTabStableId()` -> `int`
- `getDefaultTabId()` -> `int`
- `getFirstTabId()` -> `int`
- `getLastTabId()` -> `int`
- `getListView()` -> `RecyclerListView`
- `getNextPageId(boolean forward)` -> `int`
- `getSelectorColorKey()` -> `int`
- `getSelectorDrawable()` -> `Drawable`
- `getStableId(int selectedType)` -> `int`
- `getTab(int i)` -> `Tab`
- `getTabsContainer()` -> `RecyclerListView`
- `getTabsCount()` -> `int`
- `isAnimatingIndicator()` -> `boolean`
- `isEditing()` -> `boolean`
- `isEmpty()` -> `boolean`
- `isFirstTab()` -> `boolean`
- `isFirstTabSelected()` -> `boolean`
- `isLocked(int id)` -> `boolean`
- `notifyTabCounterChanged(int id)` -> `void`
- `onDefaultTabMoved()` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onPageScrolled(int position, int first)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `resetTabId()` -> `void`
- `scrollToTab(Tab tab, int position)` -> `void`
- `selectFirstTab()` -> `void`
- `selectLastTab()` -> `void`
- `selectTabWithId(int id, float progress)` -> `void`
- `selectTabWithStableId(int stableId)` -> `boolean`
- `setAnimationIdicatorProgress(float value)` -> `void`
- `setBlurredBackground(BlurredBackgroundDrawable drawable)` -> `void`
- `setColors(int line, int active, int unactive, int selector, int background)` -> `void`
- `setDelegate(FilterTabsViewDelegate filterTabsViewDelegate)` -> `void`
- `setIsEditing(boolean value)` -> `void`
- `shakeLock(int id)` -> `void`
- `stopAnimatingIndicator()` -> `void`
- `text(String t, ArrayList<TLRPC.MessageEntity> e)` -> `CharSequence`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.FilterTabsView$ListAdapter`
- `getItemCount()` -> `int`
- `getItemId(int position)` -> `long`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `moveElementToStart(int theIndex)` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `swapElements(int fromIndex, int toIndex)` -> `void`

## `org.telegram.ui.Components.FilterTabsView$Tab`
- `getWidth(boolean store)` -> `int`
- `setTitle(String newTitle, ArrayList<TLRPC.MessageEntity> newEntities, boolean noanimate)` -> `boolean`

## `org.telegram.ui.Components.FilterTabsView$TabView`
- `animateChange()` -> `boolean`
- `clearTransitionParams()` -> `void`
- `getId()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setTab(Tab tab, int position)` -> `void`
- `shakeLockIcon(float x, int num)` -> `void`

## `org.telegram.ui.Components.FiltersListBottomSheet`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `static getCanAddDialogFilters(BaseFragment fragment, ArrayList<Long> selectedDialogs)` -> `ArrayList<MessagesController.DialogFilter>`
- `static getDialogsCount(BaseFragment fragment, MessagesController.DialogFilter filter, ArrayList<Long> selectedDialogs, boolean always, boolean check)` -> `ArrayList<Long>`
- `setDelegate(FiltersListBottomSheetDelegate filtersListBottomSheetDelegate)` -> `void`

## `org.telegram.ui.Components.FiltersListBottomSheet$ListAdapter`
- `getItem(int position)` -> `MessagesController.DialogFilter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.FireworksEffect`
- `onDraw(View parent, Canvas canvas)` -> `void`

## `org.telegram.ui.Components.FireworksEffect$Particle`
- `draw(Canvas canvas)` -> `void`

## `org.telegram.ui.Components.FireworksOverlay`
- `isStarted()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onStop()` -> `void`
- `start(boolean withStars)` -> `void`
- `start()` -> `void`

## `org.telegram.ui.Components.FlatCheckBox`
- `denied()` -> `void`
- `draw(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `recolor(int c)` -> `void`
- `setChecked(boolean enabled)` -> `void`
- `setChecked(boolean enabled, boolean animate)` -> `void`
- `setText(String text)` -> `void`

## `org.telegram.ui.Components.FlickerLoadingView`
- `getAdditionalHeight()` -> `int`
- `getColumnsCount()` -> `int`
- `getPaint()` -> `Paint`
- `getViewType()` -> `int`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setColors(int key1, int key2, int key3)` -> `void`
- `setGlobalGradientView(FlickerLoadingView globalGradientView)` -> `void`
- `setIgnoreHeightCheck(boolean ignore)` -> `void`
- `setIsSingleCell(boolean b)` -> `void`
- `setItemsCount(int i)` -> `void`
- `setMemberRequestButton(boolean isChannel)` -> `void`
- `setPaddingLeft(int paddingLeft)` -> `void`
- `setPaddingTop(int t)` -> `void`
- `setParentSize(int parentWidth, int parentHeight, float parentXOffset)` -> `void`
- `setUseHeaderOffset(boolean useHeaderOffset)` -> `void`
- `setViewType(int type)` -> `void`
- `showDate(boolean showDate)` -> `void`
- `skipDrawItemsCount(int i)` -> `void`
- `updateColors()` -> `void`
- `updateGradient()` -> `void`

## `org.telegram.ui.Components.FloatSeekBarAccessibilityDelegate`
- `doScroll(View host, boolean backward)` -> `void`
- `getDelta()` -> `float`
- `getMaxValue()` -> `float`
- `getMinValue()` -> `float`
- `onInitializeAccessibilityNodeInfoInternal(@Nullable View host, AccessibilityNodeInfo info)` -> `void`
- `performAccessibilityActionInternal(@Nullable View host, int action, Bundle args)` -> `boolean`

## `org.telegram.ui.Components.FloatingDebug.FloatingDebugController`
- `static onBackPressed(boolean invoked)` -> `boolean`
- `static onDestroy()` -> `void`
- `static setActive(LaunchActivity activity, boolean active)` -> `void`
- `static setActive(LaunchActivity activity, boolean active, boolean saveConfig)` -> `void`

## `org.telegram.ui.Components.FloatingDebug.FloatingDebugView`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss(Runnable callback)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `showBigMenu(boolean show)` -> `void`
- `showFab()` -> `void`

## `org.telegram.ui.Components.FloatingDebug.FloatingDebugView$SeekBarCell`
- `invalidate()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `performAccessibilityAction(int action, Bundle arguments)` -> `boolean`

## `org.telegram.ui.Components.FolderBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `dismiss()` -> `void`
- `getTitle()` -> `CharSequence`
- `onViewCreated(FrameLayout containerView)` -> `void`
- `setOnDone(Utilities.Callback<Boolean> listener)` -> `void`
- `static showForDeletion(final BaseFragment fragment, final int filterId, final Utilities.Callback<Boolean> whenDone)` -> `void`
- `updateCount(boolean animated)` -> `void`

## `org.telegram.ui.Components.FolderBottomSheet$Button`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getTextPaint()` -> `TextPaint`
- `isLoading()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `setCount(int count, boolean animated)` -> `void`
- `setEmojiCacheType(int cacheType)` -> `void`
- `setEnabled(boolean enabled)` -> `void`
- `setLoading(boolean loading)` -> `void`
- `setText(CharSequence newText, boolean animated)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Components.FolderBottomSheet$HeaderCell`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAction(CharSequence text, Runnable onClick)` -> `void`
- `setText(CharSequence text, boolean animated)` -> `void`

## `org.telegram.ui.Components.FolderBottomSheet$TitleCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setSelectedCount(int count, boolean animated)` -> `void`

## `org.telegram.ui.Components.FolderBottomSheet$TitleCell$FoldersPreview`
- `onDraw(Canvas canvas)` -> `void`
- `setCount(int count, boolean animated)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Components.FolderDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setBounds(int left, int top, int right, int bottom)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `x(float x)` -> `int`
- `y(float x)` -> `int`

## `org.telegram.ui.Components.ForegroundDetector`
- `getForegroundActivity()` -> `Activity`
- `static getInstance()` -> `ForegroundDetector`
- `onActivityCreated(Activity activity, Bundle savedInstanceState)` -> `void`
- `onActivityDestroyed(Activity activity)` -> `void`
- `onActivityPaused(Activity activity)` -> `void`
- `onActivityResumed(Activity activity)` -> `void`
- `onActivitySaveInstanceState(Activity activity, Bundle outState)` -> `void`
- `onActivityStarted(Activity activity)` -> `void`
- `onActivityStopped(Activity activity)` -> `void`
- `resetBackgroundVar()` -> `void`

## `org.telegram.ui.Components.FormattedDateSpan`
- `static applyFormatedDateEntities(CharSequence text)` -> `CharSequence`
- `static getAllRelativeDates(CharSequence text)` -> `ArrayList<Integer>`
- `needReplaceText()` -> `boolean`
- `onClick(@NonNull View widget)` -> `void`
- `static restoreFormatedDateEntities(CharSequence text)` -> `CharSequence`
- `updateDrawState(@NonNull TextPaint p)` -> `void`

## `org.telegram.ui.Components.Forum.ForumBubbleDrawable`
- `colorDistance(int a, int b)` -> `int`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `invalidateSelf()` -> `void`
- `moveNexColor()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.Forum.ForumUtilities`
- `static applyTopic(ChatActivity chatActivity, MessagesStorage.TopicKey topicKey)` -> `void`
- `static applyTopicToMessage(MessageObject messageObject)` -> `void`
- `static createActionTextWithTopic(TLRPC.TL_forumTopic topic, MessageObject messageObject)` -> `CharSequence`
- `static createGeneralTopicDrawable(Context context, float scale, int color, boolean isDialog)` -> `GeneralTopicDrawable`
- `static createGeneralTopicDrawable(Context context, float scale, int color, boolean isDialog, boolean large)` -> `GeneralTopicDrawable`
- `static createSmallTopicDrawable(String text, int color)` -> `Drawable`
- `static createTopicDrawable(TLRPC.TL_forumTopic topic, boolean isDialog)` -> `Drawable`
- `static createTopicDrawable(String text)` -> `Drawable`
- `static createTopicDrawable(String text, int color, boolean isDialog)` -> `Drawable`
- `static filterMessagesByTopic(long threadMessageId, ArrayList<MessageObject> messageObjects)` -> `void`
- `static getMonoForumTitle(int currentAccount, long dialogId, boolean showChannelName)` -> `String`
- `static getMonoForumTitle(int currentAccount, TLRPC.Chat chat)` -> `String`
- `static getMonoForumTitle(int currentAccount, TLRPC.Chat chat, boolean showChannelName)` -> `String`
- `static getTopicSpannedName(TLRPC.ForumTopic topic, Paint paint, boolean isDialog)` -> `CharSequence`
- `static getTopicSpannedName(TLRPC.ForumTopic topic, Paint paint, Drawable[] drawableToSet, boolean isDialog)` -> `CharSequence`
- `static monoForumTopicIdToTopicId(long id)` -> `int`
- `static monoForumTopicToTopic(ArrayList<TLRPC.savedDialog> dialogs)` -> `ArrayList<TLRPC.TL_forumTopic>`
- `static monoForumTopicToTopic(TLRPC.TL_monoForumDialog tlMonoForumDialog)` -> `TLRPC.TL_forumTopic`
- `static openTopic(BaseFragment baseFragment, long chatId, TLRPC.TL_forumTopic topic, int fromMessageId)` -> `void`
- `static setMonoForumAvatar(int currentAccount, TLRPC.Chat chat, AvatarDrawable avatarDrawable, BackupImageView imageView)` -> `void`
- `static setMonoForumAvatar(int currentAccount, TLRPC.Chat chat, AvatarDrawable avatarDrawable, ImageReceiver imageView)` -> `void`
- `static setTopicIcon(BackupImageView backupImageView, TLRPC.TL_forumTopic forumTopic)` -> `void`
- `static setTopicIcon(BackupImageView backupImageView, TLRPC.TL_forumTopic forumTopic, boolean actionBar, boolean largeIcon, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static setTopicIcon(Context context, ImageReceiver imageReceiver, TLRPC.TL_forumTopic forumTopic, boolean actionBar, boolean largeIcon, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static switchAllFragmentsInStackToForum(long chatId, INavigationLayout actionBarLayout)` -> `void`

## `org.telegram.ui.Components.Forum.ForumUtilities$GeneralTopicDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int i)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.Forum.MessageTopicButton`
- `draw(Canvas canvas, float x, float y, float alpha)` -> `void`
- `drawOutbounds(Canvas canvas, float alpha)` -> `void`
- `height()` -> `int`
- `onAttached(ChatMessageCell cell)` -> `void`
- `onClick()` -> `void`
- `onDetached(ChatMessageCell cell)` -> `void`
- `resetClick()` -> `void`
- `set(ChatMessageCell cell, MessageObject messageObject, @NonNull TLObject userOrChat, int maxWidth)` -> `int`
- `set(ChatMessageCell cell, MessageObject messageObject, @NonNull TLRPC.TL_forumTopic topic, int maxWidth)` -> `int`
- `width()` -> `int`

## `org.telegram.ui.Components.ForwardBackground`
- `draw(Canvas canvas, boolean loading)` -> `void`
- `set(StaticLayout[] layout, boolean topLeftRad)` -> `void`
- `setColor(int color)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `setPressed(boolean pressed, float x, float y)` -> `void`

## `org.telegram.ui.Components.FragmentContextView`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `drawOverlayed()` -> `boolean`
- `getCapsuleBlobDrawable()` -> `CapsuleBlobDrawable`
- `getCurrentStyle()` -> `int`
- `getStyleHeight()` -> `int`
- `getTopPadding()` -> `float`
- `invalidate()` -> `void`
- `isCallStyle()` -> `boolean`
- `isCallTypeVisible()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onAudioSettingsChanged()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onNewGroupCallMessage(long callId, GroupCallMessage message)` -> `void`
- `onPopGroupCallMessage()` -> `void`
- `onStateChanged(int state)` -> `void`
- `setCollapseTransition(boolean show, float extraHeight, float progress)` -> `void`
- `setDelegate(FragmentContextViewDelegate fragmentContextViewDelegate)` -> `void`
- `setDrawOverlay(boolean drawOverlay)` -> `void`
- `setLeftMargin(float leftMargin)` -> `void`
- `setSpeedHintViewParent(ViewGroup viewParent)` -> `void`
- `setSupportsCalls(boolean value)` -> `void`
- `setTopPadding(float value)` -> `void`
- `setVisibility(int visibility)` -> `void`
- `toggleScheduledNotify()` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.FragmentContextViewWavesDrawable`
- `draw(float left, float top, float right, float bottom, Canvas canvas, FragmentContextView parentView, float progress)` -> `void`
- `getRippleFinishedDelay()` -> `long`
- `getState()` -> `int`
- `setAmplitude(float value)` -> `void`
- `updateState(boolean animated)` -> `void`

## `org.telegram.ui.Components.FragmentContextViewWavesDrawable$WeavingState`
- `setToPaint(Paint paint)` -> `void`
- `update(int height, int width, long dt, float amplitude)` -> `void`

## `org.telegram.ui.Components.FragmentFloatingButton`
- `static createDefaultLayoutParams()` -> `FrameLayout.LayoutParams`
- `static createDefaultLayoutParamsBig()` -> `FrameLayout.LayoutParams`
- `static createSubButtonLayoutParams()` -> `FrameLayout.LayoutParams`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getButtonVisible()` -> `boolean`
- `getProgressVisible()` -> `boolean`
- `getTranslationY()` -> `float`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `static setAnimatedVisibility(@Nullable View v, float f)` -> `void`
- `setAnimation(@RawRes int animation, int size)` -> `void`
- `setButtonVisible(boolean visible, boolean animated)` -> `void`
- `setImageResource(@DrawableRes int drawable)` -> `void`
- `setProgressVisible(boolean visible, boolean animated)` -> `void`
- `setTranslationY(float translationY)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.FragmentSearchField`
- `addAdditionalIcon(View icon)` -> `void`
- `clearSearchFilters()` -> `void`
- `clearSearchFiltersWithCallback()` -> `void`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setBlurredBackgroundVisibility(float visibility)` -> `void`
- `setCloseButtonOnClickListener(Runnable onCloseSearch)` -> `void`
- `setCloseButtonVisible(boolean visible)` -> `void`
- `setHintText(CharSequence text, boolean animated)` -> `void`
- `setSearchFiltersListener(SearchFiltersListener searchFiltersListener)` -> `void`
- `setSectionBackground()` -> `void`
- `setWhiteBackground()` -> `void`
- `setupBlurredBackground(BlurredBackgroundDrawable drawable)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.FragmentSpansContainer`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `endAnimation()` -> `void`
- `getSpansContainer()` -> `ViewGroup`
- `setDelegate(Delegate delegate)` -> `void`

## `org.telegram.ui.Components.FragmentSpansContainer$SpansContainer`
- `endAnimation()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Components.GestureDetector2`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `setIsLongpressEnabled(boolean isLongpressEnabled)` -> `void`
- `setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener)` -> `void`

## `org.telegram.ui.Components.GestureDetector2$GestureHandler`
- `handleMessage(Message msg)` -> `void`

## `org.telegram.ui.Components.GestureDetectorFixDoubleTap`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setIsLongpressEnabled(boolean enabled)` -> `void`
- `setLongpressDuration(long duration)` -> `void`
- `setOnDoubleTapListener(OnDoubleTapListener listener)` -> `void`

## `org.telegram.ui.Components.GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase`
- `dispatchLongPress()` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `setIsLongpressEnabled(boolean isLongpressEnabled)` -> `void`
- `setLongpressDuration(long duration)` -> `void`
- `setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener)` -> `void`

## `org.telegram.ui.Components.GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase$GestureHandler`
- `handleMessage(Message msg)` -> `void`

## `org.telegram.ui.Components.GigagroupConvertAlert`
- `onCancel()` -> `void`
- `onCovert()` -> `void`

## `org.telegram.ui.Components.GigagroupConvertAlert$BottomSheetCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setText(CharSequence text)` -> `void`

## `org.telegram.ui.Components.GradientTools`
- `getAverageColor()` -> `int`
- `setBounds(RectF bounds)` -> `void`
- `setBounds(float left, float top, float right, float bottom)` -> `void`
- `setColors(int color1, int color2)` -> `void`
- `setColors(int color1, int color2, int color3)` -> `void`
- `setColors(int color1, int color2, int color3, int color4)` -> `void`
- `updateBounds()` -> `void`

## `org.telegram.ui.Components.GroupCreateCheckBox`
- `getProgress()` -> `float`
- `isChecked()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `setCheckScale(float value)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setColorKeysOverrides(int check, int inner, int back)` -> `void`
- `setInnerRadDiff(int value)` -> `void`
- `setProgress(float value)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.GroupCreateSpan`
- `getContact()` -> `ContactsController.Contact`
- `getCountryIso2()` -> `String`
- `getKey()` -> `String`
- `getUid()` -> `long`
- `isDeleting()` -> `boolean`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `startDeleteAnimation()` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.GroupedPhotosListView`
- `clear()` -> `void`
- `fillList()` -> `void`
- `getCount()` -> `int`
- `getIndex()` -> `int`
- `isAnimationsEnabled()` -> `boolean`
- `onDown(MotionEvent e)` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY)` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onLongPress(MotionEvent e)` -> `void`
- `onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY)` -> `boolean`
- `onShowPress(MotionEvent e)` -> `void`
- `onSingleTapUp(MotionEvent e)` -> `boolean`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `reset()` -> `void`
- `setAnimateBackground(boolean animateBackground)` -> `void`
- `setAnimationsEnabled(boolean animationsEnabled)` -> `void`
- `setDelegate(GroupedPhotosListViewDelegate groupedPhotosListViewDelegate)` -> `void`
- `setMoveProgress(float progress)` -> `void`

## `org.telegram.ui.Components.GuardBotReplaceSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `getTitle()` -> `CharSequence`

## `org.telegram.ui.Components.HashtagActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `isLightStatusBar()` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`

## `org.telegram.ui.Components.HashtagsSearchAdapter`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getHashtag(String query)` -> `String`
- `getHashtag(String query, final boolean[] cashtag)` -> `String`
- `scrollToTop(boolean ifAtTop)` -> `void`
- `search(String query)` -> `void`
- `seesLoading()` -> `boolean`
- `setInitialData(String hashtag, ArrayList<MessageObject> messages, int messagesLastRate, int totalCount)` -> `void`

## `org.telegram.ui.Components.HideViewAfterAnimation`
- `onAnimationEnd(Animator animation)` -> `void`

## `org.telegram.ui.Components.HintEditText`
- `getHintText()` -> `String`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onPreDrawHintCharacter(int index, Canvas canvas, float pivotX, float pivotY)` -> `void`
- `onTextChange()` -> `void`
- `setHintText(String value)` -> `void`
- `setTextSize(int unit, float size)` -> `void`
- `shouldDrawBehindText(int index)` -> `boolean`

## `org.telegram.ui.Components.HintView`
- `createCloseButton()` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getBaseTranslationY()` -> `float`
- `getMessageCell()` -> `ChatMessageCell`
- `hide()` -> `void`
- `hide(boolean animate)` -> `void`
- `isShowing()` -> `boolean`
- `offsetCx()` -> `int`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setBackgroundColor(int background, int text)` -> `void`
- `setBottomOffset(int offset)` -> `void`
- `setExtraTranslationY(float value)` -> `void`
- `setOverrideText(String text)` -> `void`
- `setShowingDuration(long showingDuration)` -> `void`
- `setText(CharSequence text)` -> `void`
- `setUseScale(boolean useScale)` -> `void`
- `setVisibleListener(VisibilityListener visibleListener)` -> `void`
- `showForMessageCell(ChatMessageCell cell, boolean animated)` -> `boolean`
- `showForMessageCell(ChatMessageCell cell, Object object, int x, int y, boolean animated)` -> `boolean`
- `showForView(View view, boolean animated)` -> `boolean`
- `updatePosition()` -> `void`

## `org.telegram.ui.Components.HintView$Builder`
- `build()` -> `HintView`
- `setBackgroundColor(int color)` -> `Builder`
- `setDrawPath(boolean drawPath)` -> `Builder`
- `setTopArrow(boolean topArrow)` -> `Builder`
- `withCloseButton()` -> `Builder`

## `org.telegram.ui.Components.HintsController`
- `static resetAll()` -> `void`

## `org.telegram.ui.Components.HintsController$Hint`
- `doNotShowAgain()` -> `void`
- `increment()` -> `void`
- `reset()` -> `void`
- `show()` -> `boolean`

## `org.telegram.ui.Components.HorizontalRoundTabsLayout`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `setAccent(boolean accent)` -> `void`
- `setSelectedIndex(int selectedIndex, boolean animated)` -> `void`
- `setTabs(ArrayList<CharSequence> tabs, MessagesStorage.IntCallback onSelect)` -> `void`

## `org.telegram.ui.Components.HorizontalRoundTabsLayout$Factory`
- `static as(int selected, ArrayList<CharSequence> tabs, Utilities.Callback2<Integer, HorizontalRoundTabsLayout> onSelect)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `HorizontalRoundTabsLayout`

## `org.telegram.ui.Components.HorizontalRoundTabsLayout$RoundTabView`
- `draw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setText(Text text)` -> `void`

## `org.telegram.ui.Components.IPhotoPaintView`
- `getAdditionalBottom()` -> `default int`
- `getAdditionalTop()` -> `default int`
- `getMasks()` -> `default List<TLRPC.InputDocument>`
- `getView()` -> `default View`
- `onAnimationStateChanged(boolean isStart)` -> `default void`
- `onCleanupEntities()` -> `default void`
- `setOffsetTranslationX(float x)` -> `default void`

## `org.telegram.ui.Components.IdenticonDrawable`
- `draw(Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(ColorFilter cf)` -> `void`
- `setColors(int[] value)` -> `void`
- `setEncryptedChat(TLRPC.EncryptedChat encryptedChat)` -> `void`

## `org.telegram.ui.Components.ImageUpdater`
- `clear()` -> `void`
- `didFinishEdit(Bitmap bitmap)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismissCurrentDialog(Dialog dialog)` -> `boolean`
- `dismissDialogOnPause(Dialog dialog)` -> `boolean`
- `getCurrentImageProgress()` -> `float`
- `getPreviewBitmap()` -> `Bitmap`
- `getUploadingFilePath()` -> `String`
- `onActivityResult(int requestCode, int resultCode, Intent data)` -> `void`
- `onPause()` -> `void`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `openCamera()` -> `void`
- `openGallery()` -> `void`
- `openMenu(boolean hasAvatar, Runnable onDeleteAvatar, DialogInterface.OnDismissListener onDismiss, int type)` -> `void`
- `openPhotoForEdit(String path, String thumb, int orientation, boolean isVideo)` -> `void`
- `openPhotoForEdit(String path, String thumb, Pair<Integer, Integer> orientation, boolean isVideo)` -> `void`
- `openSearch()` -> `void`
- `openVideoCamera()` -> `void`
- `setCanSelectVideo(boolean canSelectVideo)` -> `void`
- `setDelegate(ImageUpdaterDelegate imageUpdaterDelegate)` -> `void`
- `setForceDarkTheme(boolean forceDarkTheme)` -> `void`
- `setOpenWithFrontfaceCamera(boolean value)` -> `void`
- `setSearchAvailable(boolean value)` -> `void`
- `setSearchAvailable(boolean value, boolean useAttachMenu)` -> `void`
- `setShowingFromDialog(boolean b)` -> `void`
- `setUploadAfterSelect(boolean value)` -> `void`
- `showAvatarConstructor(TLRPC.VideoSize emojiMarkup)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.ImageUpdater$ImageUpdaterDelegate`
- `didStartUpload(boolean fromAvatarConstructor, boolean isVideo)` -> `default void`
- `didUploadFailed()` -> `default void`
- `getCloseIntoObject()` -> `default PhotoViewer.PlaceProviderObject`
- `getInitialSearchString()` -> `default String`
- `onUploadProgressChanged(float progress)` -> `default void`
- `supportsBulletin()` -> `default boolean`

## `org.telegram.ui.Components.ImportingAlert`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismissInternal()` -> `void`
- `setCompleted()` -> `void`

## `org.telegram.ui.Components.ImportingAlert$BottomSheetCell`
- `getThemedColor(int key)` -> `int`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setGravity(int gravity)` -> `void`
- `setText(CharSequence text)` -> `void`
- `setTextColor(int color)` -> `void`

## `org.telegram.ui.Components.InfiniteProgress`
- `draw(Canvas canvas, float cx, float cy, float scale)` -> `void`
- `setAlpha(float alpha)` -> `void`
- `setColor(int color)` -> `void`

## `org.telegram.ui.Components.IntSeekBarAccessibilityDelegate`
- `doScroll(View host, boolean backward)` -> `void`
- `getDelta()` -> `int`
- `getMinValue()` -> `int`

## `org.telegram.ui.Components.IntSize`
- `equals(Object o)` -> `boolean`
- `set(int width, int height)` -> `void`
- `toString()` -> `String`

## `org.telegram.ui.Components.InviteLinkBottomSheet`
- `setCanEdit(boolean canEdit)` -> `void`
- `setInviteDelegate(InviteDelegate inviteDelegate)` -> `void`
- `show()` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.InviteLinkBottomSheet$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.InviteLinkBottomSheet$EmptyHintRow`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Components.InviteLinkBottomSheet$RevenueCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(TL_stars.TL_starsSubscriptionPricing pricing, int count)` -> `void`

## `org.telegram.ui.Components.InviteLinkBottomSheet$TimerPrivacyCell`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `runTimer()` -> `void`

## `org.telegram.ui.Components.InviteMembersBottomSheet`
- `createContainerView(Context context)` -> `ContainerView`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `dismissInternal()` -> `void`
- `onSearchViewTouched(MotionEvent ev, EditTextBoldCursor searchEditText)` -> `void`
- `search(String text)` -> `void`
- `setDelegate(GroupCreateActivity.ContactsAddActivityDelegate contactsAddActivityDelegate)` -> `void`
- `setDelegate(InviteMembersBottomSheetDelegate inviteMembersBottomSheetDelegate, ArrayList<Long> selectedDialogs)` -> `void`
- `setSelectedContacts(ArrayList<Long> dialogs)` -> `void`

## `org.telegram.ui.Components.InviteMembersBottomSheet$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `getObject(int position)` -> `TLObject`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.InviteMembersBottomSheet$SearchAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `searchDialogs(final String query)` -> `void`

## `org.telegram.ui.Components.InviteMembersBottomSheet$SpansContainer`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Components.ItemOptions`
- `allowCenter(boolean allow)` -> `ItemOptions`
- `allowMoveScrim()` -> `ItemOptions`
- `allowMoveScrimGravity(int gravity)` -> `ItemOptions`
- `allowShowingOnTopOfKeyboard()` -> `ItemOptions`
- `animateToSize(int w, int h)` -> `ItemOptions`
- `closeSwipeback()` -> `void`
- `cutTextInFancyHalf()` -> `ItemOptions`
- `dismiss()` -> `void`
- `dontDismiss()` -> `void`
- `dontFocus()` -> `ItemOptions`
- `followScrimView()` -> `ItemOptions`
- `forceBottom(boolean force)` -> `ItemOptions`
- `forceTop(boolean force)` -> `ItemOptions`
- `getContext()` -> `Context`
- `getItemAt(int index)` -> `View`
- `getItemsCount()` -> `int`
- `getLast()` -> `ActionBarMenuSubItem`
- `getLastView()` -> `View`
- `getLayout()` -> `ViewGroup`
- `getLinearLayout()` -> `LinearLayout`
- `getOffsetX()` -> `float`
- `getOffsetY()` -> `float`
- `static getPointOnScreen(View v, ViewGroup finalContainer, float[] point)` -> `void`
- `hideScrimUnder()` -> `ItemOptions`
- `ignoreX()` -> `ItemOptions`
- `makeMultiline(boolean changeSize)` -> `ItemOptions`
- `static makeOptions(@NonNull BaseFragment fragment, @NonNull View scrimView)` -> `ItemOptions`
- `static makeOptions(@NonNull BaseFragment fragment, @NonNull View scrimView, boolean swipeback)` -> `ItemOptions`
- `static makeOptions(@NonNull BaseFragment fragment, @NonNull View scrimView, boolean swipeback, boolean withoutScrollView)` -> `ItemOptions`
- `static makeOptions(@NonNull BaseFragment fragment, @NonNull View scrimView, boolean swipeback, boolean withoutScrollView, boolean shownFromBottom)` -> `ItemOptions`
- `static makeOptions(@NonNull ViewGroup container, @NonNull View scrimView)` -> `ItemOptions`
- `static makeOptions(@NonNull ViewGroup container, @Nullable Theme.ResourcesProvider resourcesProvider, @NonNull View scrimView)` -> `ItemOptions`
- `static makeOptions(@NonNull ViewGroup container, @Nullable Theme.ResourcesProvider resourcesProvider, @NonNull View scrimView, boolean swipeback)` -> `ItemOptions`
- `static makeOptions(@NonNull ViewGroup container, @Nullable Theme.ResourcesProvider resourcesProvider, @NonNull View scrimView, boolean swipeback, boolean shownFromBottom)` -> `ItemOptions`
- `static makeOptions(@NonNull ViewGroup container, @Nullable Theme.ResourcesProvider resourcesProvider, @NonNull View scrimView, boolean swipeback, boolean shownFromBottom, boolean useScrollView)` -> `ItemOptions`
- `makeSwipeback()` -> `ItemOptions`
- `needsFocus()` -> `ItemOptions`
- `offsetByContainer()` -> `ItemOptions`
- `openSwipeback(ItemOptions options)` -> `void`
- `reposition()` -> `void`
- `setBackgroundColor(int color)` -> `ItemOptions`
- `setBlur(boolean blur, boolean blurForMenu)` -> `ItemOptions`
- `setBlur(boolean b)` -> `ItemOptions`
- `setBlurBackground(BlurredBackgroundDrawableViewFactory factory, BlurredBackgroundProvider colorProvider, boolean multiwindow)` -> `ItemOptions`
- `setBlurBackground(BlurringShader.BlurManager blurManager, float ox, float oy)` -> `ItemOptions`
- `setBlurBackgroundForSwipeback(BlurredBackgroundDrawableViewFactory factory, BlurredBackgroundProvider colorProvider, boolean multiwindow)` -> `ItemOptions`
- `setColors(int textColor, int iconColor)` -> `ItemOptions`
- `setDimAlpha(int dimAlpha)` -> `ItemOptions`
- `setDismissWithButtons(boolean enable)` -> `ItemOptions`
- `setDrawScrim(boolean draw)` -> `ItemOptions`
- `setFixedWidth(int fixedWidthDp)` -> `ItemOptions`
- `static setGapBackgroundColor(ViewGroup viewGroup, int color)` -> `void`
- `setGapBackgroundColor(int color)` -> `ItemOptions`
- `setGravity(int gravity)` -> `ItemOptions`
- `setLongPressSelectionEnabled(boolean enabled)` -> `ItemOptions`
- `setMaxHeight(int px)` -> `ItemOptions`
- `setMinWidth(int minWidthDp)` -> `ItemOptions`
- `setOnDismiss(Runnable dismissListener)` -> `ItemOptions`
- `setOnTopOfScrim()` -> `ItemOptions`
- `setRoundRadius(int r)` -> `ItemOptions`
- `setRoundRadius(int r, int p)` -> `ItemOptions`
- `setScaleOut(boolean scaleOut)` -> `ItemOptions`
- `setScrimView(View view)` -> `ItemOptions`
- `setScrimViewBackground(Drawable drawable)` -> `ItemOptions`
- `setSelectorColor(int selectorColor)` -> `ItemOptions`
- `setSwipebackGravity(boolean right, boolean bottom)` -> `ItemOptions`
- `setTranslationY(float ty)` -> `void`
- `setViewAdditionalOffsets(int left, int top, int right, int bottom)` -> `ItemOptions`
- `setupSelectors()` -> `void`
- `show()` -> `ItemOptions`
- `static swipeback(ActionBarPopupWindow.ActionBarPopupWindowLayout parentLayout, Theme.ResourcesProvider resourcesProvider)` -> `ItemOptions`
- `translate(float x, float y)` -> `ItemOptions`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.ItemOptions$DimView`
- `onDraw(Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `setProgress(float progress)` -> `void`

## `org.telegram.ui.Components.ItemOptions$ScrimView`
- `drawScrim(Canvas canvas, float progress)` -> `default void`
- `getBounds(RectF bounds)` -> `default void`

## `org.telegram.ui.Components.JoinGroupAlert`
- `setBulletinFactory(BulletinFactory bulletinFactory)` -> `JoinGroupAlert`
- `static showBulletin(Context context, BaseFragment fragment, boolean isChannel)` -> `void`
- `static showBulletin(Context context, BaseFragment fragment, BulletinFactory bulletinFactory, boolean isChannel)` -> `void`

## `org.telegram.ui.Components.LatexInliner`
- `static inlineLatex(String source)` -> `String`

## `org.telegram.ui.Components.LayoutHelper`
- `static createFrame(int width, float height, int gravity, float leftMargin, float topMargin, float rightMargin, float bottomMargin)` -> `FrameLayout.LayoutParams`
- `static createFrame(int width, int height, int gravity)` -> `FrameLayout.LayoutParams`
- `static createFrame(int width, float height)` -> `FrameLayout.LayoutParams`
- `static createFrame(float width, float height, int gravity)` -> `FrameLayout.LayoutParams`
- `static createFrame(float width, float height, int gravity, float leftMargin, float topMargin, float rightMargin, float bottomMargin)` -> `FrameLayout.LayoutParams`
- `static createFrameMarginPx(int width, float height, int gravity, int leftMarginPx, int topMarginPx, int rightMarginPx, int bottomMarginPx)` -> `FrameLayout.LayoutParams`
- `static createFrameMatchParent()` -> `FrameLayout.LayoutParams`
- `static createFrameRelatively(float width, float height, int gravity, float startMargin, float topMargin, float endMargin, float bottomMargin)` -> `FrameLayout.LayoutParams`
- `static createFrameRelatively(float width, float height, int gravity)` -> `FrameLayout.LayoutParams`
- `static createLinear(int width, int height, float weight, int gravity, int leftMargin, int topMargin, int rightMargin, int bottomMargin)` -> `LinearLayout.LayoutParams`
- `static createLinear(int width, int height, float weight, int leftMargin, int topMargin, int rightMargin, int bottomMargin)` -> `LinearLayout.LayoutParams`
- `static createLinear(int width, int height, int gravity, int leftMargin, int topMargin, int rightMargin, int bottomMargin)` -> `LinearLayout.LayoutParams`
- `static createLinear(float width, float height, int gravity, float leftMargin, float topMargin, float rightMargin, float bottomMargin)` -> `LinearLayout.LayoutParams`
- `static createLinear(int width, int height, int gravity, float leftMargin, float topMargin, float rightMargin, float bottomMargin)` -> `LinearLayout.LayoutParams`
- `static createLinear(int width, float height, int gravity, int leftMargin, int topMargin, int rightMargin, int bottomMargin)` -> `LinearLayout.LayoutParams`
- `static createLinear(int width, int height, float leftMargin, float topMargin, float rightMargin, float bottomMargin)` -> `LinearLayout.LayoutParams`
- `static createLinear(int width, int height, float weight, int gravity)` -> `LinearLayout.LayoutParams`
- `static createLinear(int width, int height, int gravity)` -> `LinearLayout.LayoutParams`
- `static createLinear(float width, float height, int gravity)` -> `LinearLayout.LayoutParams`
- `static createLinear(int width, int height, float weight)` -> `LinearLayout.LayoutParams`
- `static createLinear(int width, int height)` -> `LinearLayout.LayoutParams`
- `static createLinear(float width, float height)` -> `LinearLayout.LayoutParams`
- `static createLinearRelatively(float width, float height, int gravity, float startMargin, float topMargin, float endMargin, float bottomMargin)` -> `LinearLayout.LayoutParams`
- `static createLinearRelatively(float width, float height, int gravity)` -> `LinearLayout.LayoutParams`
- `static createRelative(float width, float height, int leftMargin, int topMargin, int rightMargin, int bottomMargin, int alignParent, int alignRelative, int anchorRelative)` -> `RelativeLayout.LayoutParams`
- `static createRelative(int width, int height, int leftMargin, int topMargin, int rightMargin, int bottomMargin)` -> `RelativeLayout.LayoutParams`
- `static createRelative(int width, int height, int leftMargin, int topMargin, int rightMargin, int bottomMargin, int alignParent)` -> `RelativeLayout.LayoutParams`
- `static createRelative(float width, float height, int leftMargin, int topMargin, int rightMargin, int bottomMargin, int alignRelative, int anchorRelative)` -> `RelativeLayout.LayoutParams`
- `static createRelative(int width, int height, int alignParent, int alignRelative, int anchorRelative)` -> `RelativeLayout.LayoutParams`
- `static createRelative(int width, int height)` -> `RelativeLayout.LayoutParams`
- `static createRelative(int width, int height, int alignParent)` -> `RelativeLayout.LayoutParams`
- `static createRelative(int width, int height, int alignRelative, int anchorRelative)` -> `RelativeLayout.LayoutParams`
- `static createScroll(int width, int height, int gravity)` -> `ScrollView.LayoutParams`
- `static createScroll(int width, int height, int gravity, float leftMargin, float topMargin, float rightMargin, float bottomMargin)` -> `ScrollView.LayoutParams`
- `static getAbsoluteGravityEnd()` -> `int`
- `static getAbsoluteGravityStart()` -> `int`
- `static measureSpecExactly(int px)` -> `int`
- `static measureSpecExactlyDp(int dp)` -> `int`

## `org.telegram.ui.Components.LazyView`
- `forceView()` -> `View`
- `getVisibility()` -> `int`
- `makeView()` -> `View`
- `setVisibility(int visibility)` -> `void`
- `view()` -> `View`

## `org.telegram.ui.Components.LerpedLayoutParams`
- `apply(float t)` -> `void`

## `org.telegram.ui.Components.LetterDrawable`
- `draw(Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setBackgroundColor(int value)` -> `void`
- `setColor(int value)` -> `void`
- `setColorFilter(ColorFilter cf)` -> `void`
- `setTitle(String title)` -> `void`

## `org.telegram.ui.Components.LineBlobDrawable`
- `draw(float left, float top, float right, float bottom, Canvas canvas, Paint paint, float pinnedTop, float progressToPinned)` -> `void`
- `generateBlob()` -> `void`
- `update(float amplitude, float speedScale)` -> `void`

## `org.telegram.ui.Components.LineProgressView`
- `getCurrentProgress()` -> `float`
- `onDraw(Canvas canvas)` -> `void`
- `setBackColor(int color)` -> `void`
- `setProgress(float value, boolean animated)` -> `void`
- `setProgressColor(int color)` -> `void`

## `org.telegram.ui.Components.LinkActionView`
- `hideOptions()` -> `void`
- `hideRevokeOption(boolean b)` -> `void`
- `setCanEdit(boolean canEdit)` -> `void`
- `setDelegate(Delegate delegate)` -> `void`
- `setLink(String link)` -> `void`
- `setPermanent(boolean permanent)` -> `void`
- `setQrText(String text)` -> `void`
- `setRevoke(boolean revoked)` -> `void`
- `setUsers(int usersCount, ArrayList<TLRPC.User> importers)` -> `void`
- `setUsers(int usersCount, ArrayList<TLRPC.User> importers, boolean animated)` -> `void`
- `showBulletin(int resId, CharSequence str)` -> `void`
- `showOptions(boolean b)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.LinkActionView$Delegate`
- `showUsersForPermanentLink()` -> `default void`

## `org.telegram.ui.Components.LinkPath`
- `getBounds(RectF bounds)` -> `void`
- `static getRadius()` -> `int`
- `static getRoundedEffect()` -> `CornerPathEffect`
- `reset()` -> `void`
- `setAllowReset(boolean value)` -> `void`
- `setBaselineShift(int value)` -> `void`
- `setCurrentLayout(Layout layout, int start, float yOffset)` -> `void`
- `setCurrentLayout(Layout layout, int start, float xOffset, float yOffset)` -> `void`
- `setInset(float insetVert, float insetHoriz)` -> `void`
- `setUseRoundRect(boolean value)` -> `void`

## `org.telegram.ui.Components.LinkSpanDrawable`
- `draw(Canvas canvas)` -> `boolean`
- `getSpan()` -> `S`
- `obtainNewPath()` -> `LinkPath`
- `release()` -> `void`
- `reset()` -> `void`
- `setColor(int color)` -> `void`

## `org.telegram.ui.Components.LinkSpanDrawable$ClickableSmallTextView`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.ui.Components.LinkSpanDrawable$LinkCollector`
- `clear()` -> `void`
- `clear(boolean animated)` -> `void`
- `clearLoading(boolean animated)` -> `void`
- `draw(Canvas canvas)` -> `boolean`
- `draw(Canvas canvas, Object obj)` -> `boolean`
- `static makeLoading(Layout layout, CharacterStyle span)` -> `LoadingDrawable`
- `static makeLoading(Layout layout, CharacterStyle span, float yOffset)` -> `LoadingDrawable`
- `removeLinks(Object obj)` -> `void`
- `removeLinks(Object obj, boolean animated)` -> `void`
- `setAdditionalInvalidate(Runnable additionalInvalidate)` -> `void`
- `setParent(View parentView)` -> `void`

## `org.telegram.ui.Components.LinkSpanDrawable$LinksSimpleTextView`
- `hit(int x, int y)` -> `ClickableSpan`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.ui.Components.LinkSpanDrawable$LinksTextView`
- `clear()` -> `void`
- `emojiCacheType()` -> `int`
- `getTextPaddingTop()` -> `int`
- `hit(int x, int y)` -> `ClickableSpan`
- `invalidate()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `overrideColor()` -> `int`
- `resetEmojiColor()` -> `void`
- `setDisablePaddingsOffset(boolean disablePaddingsOffset)` -> `void`
- `setDisablePaddingsOffsetX(boolean disablePaddingsOffsetX)` -> `void`
- `setDisablePaddingsOffsetY(boolean disablePaddingsOffsetY)` -> `void`
- `setEmojiColor(int color)` -> `void`
- `setLoading(CharacterStyle span)` -> `void`
- `setMaxWidth(int maxPixels)` -> `void`
- `setOnLinkLongPressListener(OnLinkPress listener)` -> `void`
- `setOnLinkPressListener(OnLinkPress listener)` -> `void`
- `setText(CharSequence text, TextView.BufferType type)` -> `void`

## `org.telegram.ui.Components.ListView.AdapterWithDiffUtils`
- `setItems(ArrayList<? extends Item> oldItems, ArrayList<? extends Item> newItems)` -> `void`

## `org.telegram.ui.Components.ListView.AdapterWithDiffUtils$Item`
- `compare(Item item)` -> `boolean`
- `compareContents(Item item)` -> `boolean`
- `contentsEquals(Item item)` -> `boolean`

## `org.telegram.ui.Components.ListView.RecyclerListViewWithOverlayDraw`
- `captureChildren(Canvas canvas, RectF position, long drawingTime)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `invalidate()` -> `void`

## `org.telegram.ui.Components.LivePhotoButton`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setValue(boolean value, boolean animated)` -> `void`

## `org.telegram.ui.Components.LoadingDrawable`
- `disappear()` -> `void`
- `draw(@NonNull Canvas canvas)` -> `void`
- `drawContent(Canvas canvas, Path path)` -> `void`
- `getOpacity()` -> `int`
- `getPaintAlpha()` -> `int`
- `isDisappeared()` -> `boolean`
- `isDisappearing()` -> `boolean`
- `reset()` -> `void`
- `resetDisappear()` -> `void`
- `setAlpha(int i)` -> `void`
- `setAppearByGradient(boolean enabled)` -> `void`
- `setBackgroundColor(int backgroundColor)` -> `void`
- `setBounds(@NonNull RectF bounds)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setColors(int color1, int color2)` -> `void`
- `setColors(int color1, int color2, int strokeColor1, int strokeColor2)` -> `void`
- `setGradientScale(float scale)` -> `void`
- `setRadii(float all)` -> `void`
- `setRadii(float topLeft, float topRight, float bottomRight, float bottomLeft)` -> `void`
- `setRadii(float[] radii)` -> `void`
- `setRadiiDp(float allDp)` -> `void`
- `setRadiiDp(float topLeftDp, float topRightDp, float bottomRightDp, float bottomLeftDp)` -> `void`
- `setSingleCycleDuration(long duration)` -> `void`
- `setSpeed(float speed)` -> `void`
- `timeToDisappear()` -> `long`
- `updateBounds()` -> `void`
- `usePath(Path path)` -> `void`

## `org.telegram.ui.Components.LoadingSpan`
- `draw(@NonNull Canvas canvas, CharSequence charSequence, int start, int end, float x, int top, int y, int bottom, @NonNull Paint paint)` -> `void`
- `getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i1, @Nullable Paint.FontMetricsInt fm)` -> `int`
- `setAlpha(float alpha)` -> `LoadingSpan`
- `setColorKeys(int colorKey1, int colorKey2)` -> `void`
- `setColorKeys(int colorKey1, int colorKey2, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `setColors(int color1, int color2)` -> `void`
- `setFullWidth(boolean fullWidth)` -> `LoadingSpan`
- `setHeight(float height)` -> `LoadingSpan`
- `setScaleY(float scaleY)` -> `void`
- `setView(View view)` -> `void`

## `org.telegram.ui.Components.LocationMessageLoadingDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int i)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setRadii(float topLeft, float topRight, float bottomRight, float bottomLeft)` -> `void`

## `org.telegram.ui.Components.MapPlaceholderDrawable`
- `draw(Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(ColorFilter cf)` -> `void`

## `org.telegram.ui.Components.MarkdownParser`
- `static fromMarkdown(MessageObject messageObject)` -> `TLRPC.WebPage`
- `static parse(String source, ArrayList<TL_iv.PageBlock> blocks)` -> `String`
- `static richTextToString(TL_iv.RichText text)` -> `String`

## `org.telegram.ui.Components.MarkdownParser$BlockVisitor`
- `finish()` -> `void`
- `visit(Heading heading)` -> `void`
- `visit(Paragraph paragraph)` -> `void`
- `visit(BlockQuote blockQuote)` -> `void`
- `visit(ThematicBreak thematicBreak)` -> `void`
- `visit(FencedCodeBlock fencedCodeBlock)` -> `void`
- `visit(IndentedCodeBlock indentedCodeBlock)` -> `void`
- `visit(BulletList bulletList)` -> `void`
- `visit(OrderedList orderedList)` -> `void`
- `visit(HtmlBlock htmlBlock)` -> `void`
- `visit(CustomBlock customBlock)` -> `void`

## `org.telegram.ui.Components.MarkdownParser$RichTextParser`
- `getText()` -> `TL_iv.RichText`
- `visit(BlockQuote blockQuote)` -> `void`
- `visit(BulletList bulletList)` -> `void`
- `visit(OrderedList orderedList)` -> `void`
- `visit(ListItem listItem)` -> `void`
- `visit(Paragraph paragraph)` -> `void`
- `visit(Text text)` -> `void`
- `visit(Emphasis emphasis)` -> `void`
- `visit(StrongEmphasis strongEmphasis)` -> `void`
- `visit(Code code)` -> `void`
- `visit(Link link)` -> `void`
- `visit(Image image)` -> `void`
- `visit(HardLineBreak hardLineBreak)` -> `void`
- `visit(SoftLineBreak softLineBreak)` -> `void`
- `visit(HtmlInline htmlInline)` -> `void`
- `visit(CustomNode customNode)` -> `void`
- `visit(CustomBlock customBlock)` -> `void`

## `org.telegram.ui.Components.MarkdownParser$SingleDollarLatexInlineProcessor`
- `parse()` -> `org.commonmark.node.Node`

## `org.telegram.ui.Components.MarqueeTextView`
- `isNeedMarquee()` -> `boolean`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setCustomPaddingRight(int padding)` -> `void`
- `setText(CharSequence text, BufferType type)` -> `void`
- `setTextColor(int color)` -> `void`

## `org.telegram.ui.Components.MediaActionDrawable`
- `applyShaderMatrix(boolean path)` -> `void`
- `draw(Canvas canvas)` -> `void`
- `static getCircleValue(float value)` -> `float`
- `getColor()` -> `int`
- `getCurrentIcon()` -> `int`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getMinimumHeight()` -> `int`
- `getMinimumWidth()` -> `int`
- `getOpacity()` -> `int`
- `getPreviousIcon()` -> `int`
- `getProgress()` -> `float`
- `getProgressAlpha()` -> `float`
- `getTransitionProgress()` -> `float`
- `invalidateSelf()` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setBackColor(int value)` -> `void`
- `setBackgroundDrawable(MessageDrawable drawable)` -> `void`
- `setBackgroundGradientDrawable(LinearGradient drawable)` -> `void`
- `setBounds(int left, int top, int right, int bottom)` -> `void`
- `setColor(int value)` -> `void`
- `setColorFilter(ColorFilter colorFilter)` -> `void`
- `setDelegate(MediaActionDrawableDelegate mediaActionDrawableDelegate)` -> `void`
- `setHasOverlayImage(boolean value)` -> `void`
- `setIcon(int icon, boolean animated)` -> `boolean`
- `setMini(boolean value)` -> `void`
- `setOverrideAlpha(float alpha)` -> `void`
- `setProgress(float value, boolean animated)` -> `void`

## `org.telegram.ui.Components.MediaActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getDialogId()` -> `long`
- `getNavigationBarColor()` -> `int`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isLightStatusBar()` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `mediaCountUpdated()` -> `void`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onGetDebugItems()` -> `List<FloatingDebugController.DebugItem>`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `setChatInfo(TLRPC.ChatFull currentChatInfo)` -> `void`

## `org.telegram.ui.Components.MemberRequestsBottomSheet`
- `onBackPressed()` -> `void`
- `onSearchViewTouched(MotionEvent ev, EditTextBoldCursor searchEditText)` -> `void`
- `search(String text)` -> `void`
- `setTranslationY(int newOffset)` -> `void`
- `show()` -> `void`
- `updateLayout()` -> `void`

## `org.telegram.ui.Components.MentionsContainerView`
- `clipBottom()` -> `float`
- `clipTop()` -> `float`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `drawRoundRect(Canvas canvas, Rect rectTmp, float r)` -> `void`
- `getAdapter()` -> `MentionsAdapter`
- `getCurrentLayoutManager()` -> `LinearLayoutManager`
- `getListView()` -> `MentionsListView`
- `getNeededLayoutManager()` -> `LinearLayoutManager`
- `isOpen()` -> `boolean`
- `isReversed()` -> `boolean`
- `isStories()` -> `boolean`
- `onAnimationScroll()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onClose()` -> `void`
- `onContextClick(TLRPC.BotInlineResult result)` -> `void`
- `onContextSearch(boolean searching)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onOpen()` -> `void`
- `onPanTransitionEnd()` -> `void`
- `onPanTransitionStart()` -> `void`
- `onScrolled(boolean atTop, boolean atBottom)` -> `void`
- `setBackgroundDrawable(@NonNull BlurredBackgroundDrawable backgroundDrawable)` -> `void`
- `setDialogId(long dialogId)` -> `void`
- `setIgnoreLayout(boolean ignore)` -> `void`
- `setOverrideColor(int color)` -> `void`
- `setReversed(boolean reversed)` -> `void`
- `updateVisibility(boolean show)` -> `void`
- `withDelegate(Delegate delegate)` -> `void`

## `org.telegram.ui.Components.MentionsContainerView$Delegate`
- `onStickerSelected(TLRPC.TL_document document, String query, Object parent)` -> `default void`

## `org.telegram.ui.Components.MentionsContainerView$MentionsListView`
- `onInterceptTouchEvent(MotionEvent event)` -> `boolean`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthSpec, int heightSpec)` -> `void`
- `onScrolled(int dx, int dy)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setTranslationY(float translationY)` -> `void`

## `org.telegram.ui.Components.MenuToItemOptions`
- `clear()` -> `void`
- `close()` -> `void`
- `findItem(int id)` -> `MenuItem`
- `getItem(int index)` -> `MenuItem`
- `performIdentifierAction(int id, int flags)` -> `boolean`
- `performShortcut(int keyCode, KeyEvent event, int flags)` -> `boolean`
- `setGroupCheckable(int group, boolean checkable, boolean exclusive)` -> `void`
- `setGroupEnabled(int group, boolean enabled)` -> `void`
- `setGroupVisible(int group, boolean visible)` -> `void`
- `setQwertyMode(boolean isQwerty)` -> `void`
- `size()` -> `int`

## `org.telegram.ui.Components.MessageBackgroundDrawable`
- `draw(Canvas canvas)` -> `void`
- `getLastTouchTime()` -> `long`
- `getOpacity()` -> `int`
- `getTouchX()` -> `float`
- `getTouchY()` -> `float`
- `isAnimationInProgress()` -> `boolean`
- `setAlpha(int alpha)` -> `void`
- `setBounds(int left, int top, int right, int bottom)` -> `void`
- `setBounds(Rect bounds)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(ColorFilter colorFilter)` -> `void`
- `setCustomPaint(Paint paint)` -> `void`
- `setSelected(boolean selected, boolean animated)` -> `void`
- `setTouchCoords(float x, float y)` -> `void`
- `setTouchCoordsOverride(float x, float y)` -> `void`

## `org.telegram.ui.Components.MessagePreviewView`
- `didSendPressed()` -> `void`
- `dismiss(boolean canShowKeyboard)` -> `void`
- `isShowing()` -> `boolean`
- `isTouchedHandle()` -> `boolean`
- `onDismiss(boolean canShowKeyboard)` -> `void`
- `onFullDismiss(boolean canShowKeyboard)` -> `void`
- `onQuoteSelectedPart()` -> `void`
- `selectAnotherChat(boolean forward)` -> `void`
- `setSendAsPeer(TLRPC.Peer defPeer)` -> `void`
- `updateAll()` -> `void`
- `updateLink()` -> `void`

## `org.telegram.ui.Components.MessagePreviewView$Page`
- `bind()` -> `void`
- `getReplyMessage()` -> `MessageObject`
- `getReplyMessage(MessageObject fallback)` -> `MessageObject`
- `getReplyMessageCell()` -> `View`
- `isReplyMessageCell(ChatMessageCell cell)` -> `boolean`
- `isReplyToRichMessage()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `updateSelection()` -> `void`

## `org.telegram.ui.Components.MessagePreviewView$Page$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.Components.MessagePreviewView$TabsView`
- `containsTab(int id)` -> `boolean`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `getColor()` -> `int`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setBackground(Drawable background)` -> `void`
- `setOnTabClick(Utilities.Callback<Integer> onTabClick)` -> `void`
- `setSelectedTab(float position)` -> `void`

## `org.telegram.ui.Components.MessagePreviewView$ToggleButton`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getState()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setState(boolean state1, boolean animated)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Components.MessagePrivateSeenView`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `static showSheet(Context context, int currentAccount, long dialogId, boolean lastSeen, Runnable dismiss, Runnable updated, Theme.ResourcesProvider resourcesProvider)` -> `void`

## `org.telegram.ui.Components.MessageSeenCheckDrawable`
- `getSpanned(Context context, Theme.ResourcesProvider resourcesProvider)` -> `CharSequence`

## `org.telegram.ui.Components.MotionBackgroundDrawable`
- `draw(Canvas canvas)` -> `void`
- `generateNextGradient()` -> `void`
- `getBitmap()` -> `Bitmap`
- `getBitmapShader()` -> `BitmapShader`
- `getColors()` -> `int[]`
- `getIndeterminateSpeedScale()` -> `float`
- `getIntensity()` -> `int`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `getPatternBitmap()` -> `Bitmap`
- `static getPatternColor(int color1, int color2, int color3, int color4)` -> `int`
- `getPatternColor()` -> `int`
- `getPhase()` -> `int`
- `getPosAnimationProgress()` -> `float`
- `static isDark(int color1, int color2, int color3, int color4)` -> `boolean`
- `isIndeterminateAnimation()` -> `boolean`
- `isOneColor()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `rotatePreview(boolean back)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setAnimationProgressProvider(GenericProvider<MotionBackgroundDrawable, Float> animationProgressProvider)` -> `void`
- `setBackgroundAlpha(float alpha)` -> `void`
- `setColorFilter(ColorFilter colorFilter)` -> `void`
- `setColors(int c1, int c2, int c3, int c4)` -> `void`
- `setColors(int c1, int c2, int c3, int c4, Bitmap bitmap)` -> `void`
- `setColors(int c1, int c2, int c3, int c4, int rotation, boolean invalidate)` -> `void`
- `setFastRenderAllowed()` -> `void`
- `setGiftDrawable(TLRPC.Document document)` -> `void`
- `setGiftPatternBitmap(Bitmap bitmap)` -> `void`
- `setGiftPatternRandomSeed(long seed)` -> `void`
- `setIndeterminateAnimation(boolean isIndeterminateAnimation)` -> `void`
- `setIndeterminateSpeedScale(float indeterminateSpeedScale)` -> `void`
- `setParentView(View view)` -> `void`
- `setPatternAlpha(float alpha)` -> `void`
- `setPatternBitmap(int intensity)` -> `void`
- `setPatternBitmap(int intensity, Bitmap bitmap)` -> `void`
- `setPatternBitmap(int intensity, Bitmap bitmap, boolean doNotScale)` -> `void`
- `setPatternColorFilter(int color)` -> `void`
- `setPatternGiftPositions(List<WallpaperGiftPatternPosition> giftPositions)` -> `void`
- `setPhase(int value)` -> `void`
- `setPosAnimationProgress(float posAnimationProgress)` -> `void`
- `setPostInvalidateParent(boolean value)` -> `void`
- `setRoundRadius(int rad)` -> `void`
- `setTranslationY(int y)` -> `void`
- `switchToNextPosition()` -> `void`
- `switchToNextPosition(boolean fast)` -> `void`
- `switchToPrevPosition(boolean fast)` -> `void`
- `updateAnimation()` -> `void`

## `org.telegram.ui.Components.MotionBackgroundPaint`
- `applyGradientMatrix(RectF bounds)` -> `void`
- `applyPatternMatrix(RectF bounds)` -> `void`
- `applyPatternMatrix(Matrix matrix)` -> `void`
- `getPaint(@NonNull Bitmap gradient, @NonNull Bitmap pattern, final int patternColor, int patternAlpha, int intensity, boolean isHardwareAccelerated)` -> `Paint`

## `org.telegram.ui.Components.MotionBackgroundPaint$AgslImpl`
- `applyGradientMatrix(Matrix matrix)` -> `void`
- `applyPatternMatrix(Matrix matrix)` -> `void`
- `getPaint(@NonNull Bitmap gradient, @NonNull Bitmap patternAlphaBitmap, @Nullable Bitmap gradientSoftLight, int patternAlpha, int intensity)` -> `Paint`

## `org.telegram.ui.Components.MotionBackgroundPaint$AgslImpl$RuntimeShaderState`
- `setMiniMatrixGradient(float[] miniMatrix)` -> `void`
- `setMiniMatrixPattern(float[] miniMatrix)` -> `void`

## `org.telegram.ui.Components.MotionBackgroundPaint$BitmapMemoizedSoftLight`
- `get(@NonNull Bitmap bitmap, int color)` -> `Bitmap`

## `org.telegram.ui.Components.MotionBackgroundPaint$BitmapShaderState`
- `setLocalMatrix(Matrix m)` -> `void`
- `setUseNearestInterpolation(boolean useNearestInterpolation)` -> `void`
- `setup(Bitmap b)` -> `boolean`

## `org.telegram.ui.Components.MotionBackgroundPaint$ShaderImpl`
- `applyGradientMatrix(Matrix matrix)` -> `void`
- `applyPatternMatrix(Matrix matrix)` -> `void`
- `getPaint(@NonNull Bitmap gradient, @NonNull Bitmap patternAlphaBitmap, @Nullable Bitmap gradientSoftLight, int patternAlpha, int intensity)` -> `Paint`

## `org.telegram.ui.Components.MotionPhotoDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setDisabled(boolean disabled, boolean animated)` -> `void`

## `org.telegram.ui.Components.MsgClockDrawable`
- `draw(Canvas canvas)` -> `void`
- `getConstantState()` -> `ConstantState`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int i)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.MultilineTextCheckCell`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked)` -> `void`
- `setTextAndCheck(CharSequence title, boolean checked, boolean divider)` -> `void`
- `setTextAndSubtextAndCheck(CharSequence title, CharSequence subtitle, boolean checked, boolean divider)` -> `void`

## `org.telegram.ui.Components.MuteDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setMuted(boolean muted, boolean animated)` -> `void`

## `org.telegram.ui.Components.NestedSizeNotifierLayout`
- `isPinnedToTop()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onNestedPreFling(View target, float velocityX, float velocityY)` -> `boolean`
- `onNestedPreScroll(View target, int dx, int dy, int[] consumed, int type)` -> `void`
- `onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed)` -> `void`
- `onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type)` -> `void`
- `onNestedScrollAccepted(View child, View target, int axes, int type)` -> `void`
- `onStartNestedScroll(View child, View target, int axes, int type)` -> `boolean`
- `onStopNestedScroll(View target, int type)` -> `void`
- `onStopNestedScroll(View child)` -> `void`
- `setBottomSheetContainerView(BottomSheet.ContainerView bottomSheetContainerView)` -> `void`
- `setChildLayout(ChildLayout childLayout)` -> `void`
- `setChildLayout(ChildLayout childLayout, int maxTopPadding)` -> `void`
- `setTargetListView(View target)` -> `void`

## `org.telegram.ui.Components.NoClipCanvas`
- `clipOutPath(@NonNull Path path)` -> `boolean`
- `clipOutRect(float left, float top, float right, float bottom)` -> `boolean`
- `clipOutRect(int left, int top, int right, int bottom)` -> `boolean`
- `clipOutRect(@NonNull RectF rect)` -> `boolean`
- `clipOutRect(@NonNull Rect rect)` -> `boolean`
- `clipPath(@NonNull Path path)` -> `boolean`
- `clipPath(@NonNull Path path, @NonNull Region.Op op)` -> `boolean`
- `clipRect(float left, float top, float right, float bottom)` -> `boolean`
- `clipRect(@NonNull RectF rect)` -> `boolean`
- `clipRect(@NonNull Rect rect)` -> `boolean`
- `clipRect(int left, int top, int right, int bottom)` -> `boolean`
- `clipRect(@NonNull Rect rect, @NonNull Region.Op op)` -> `boolean`
- `clipRect(@NonNull RectF rect, @NonNull Region.Op op)` -> `boolean`
- `clipRect(float left, float top, float right, float bottom, @NonNull Region.Op op)` -> `boolean`
- `concat(@Nullable Matrix matrix)` -> `void`
- `disableZ()` -> `void`
- `drawARGB(int a, int r, int g, int b)` -> `void`
- `drawArc(@NonNull RectF oval, float startAngle, float sweepAngle, boolean useCenter, @NonNull Paint paint)` -> `void`
- `drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, @NonNull Paint paint)` -> `void`
- `drawBitmap(@NonNull Bitmap bitmap, @NonNull Matrix matrix, @Nullable Paint paint)` -> `void`
- `drawBitmap(@NonNull Bitmap bitmap, @Nullable Rect src, @NonNull Rect dst, @Nullable Paint paint)` -> `void`
- `drawBitmap(@NonNull int[] colors, int offset, int stride, float x, float y, int width, int height, boolean hasAlpha, @Nullable Paint paint)` -> `void`
- `drawBitmap(@NonNull int[] colors, int offset, int stride, int x, int y, int width, int height, boolean hasAlpha, @Nullable Paint paint)` -> `void`
- `drawBitmap(@NonNull Bitmap bitmap, @Nullable Rect src, @NonNull RectF dst, @Nullable Paint paint)` -> `void`
- `drawBitmap(@NonNull Bitmap bitmap, float left, float top, @Nullable Paint paint)` -> `void`
- `drawBitmapMesh(@NonNull Bitmap bitmap, int meshWidth, int meshHeight, @NonNull float[] verts, int vertOffset, @Nullable int[] colors, int colorOffset, @Nullable Paint paint)` -> `void`
- `drawCircle(float cx, float cy, float radius, @NonNull Paint paint)` -> `void`
- `drawColor(long color, @NonNull BlendMode mode)` -> `void`
- `drawColor(int color, @NonNull BlendMode mode)` -> `void`
- `drawColor(int color)` -> `void`
- `drawColor(int color, @NonNull PorterDuff.Mode mode)` -> `void`
- `drawColor(long color)` -> `void`
- `drawDoubleRoundRect(@NonNull RectF outer, @NonNull float[] outerRadii, @NonNull RectF inner, @NonNull float[] innerRadii, @NonNull Paint paint)` -> `void`
- `drawDoubleRoundRect(@NonNull RectF outer, float outerRx, float outerRy, @NonNull RectF inner, float innerRx, float innerRy, @NonNull Paint paint)` -> `void`
- `drawGlyphs(@NonNull int[] glyphIds, int glyphIdOffset, @NonNull float[] positions, int positionOffset, int glyphCount, @NonNull Font font, @NonNull Paint paint)` -> `void`
- `drawLine(float startX, float startY, float stopX, float stopY, @NonNull Paint paint)` -> `void`
- `drawLines(@NonNull float[] pts, int offset, int count, @NonNull Paint paint)` -> `void`
- `drawLines(@NonNull float[] pts, @NonNull Paint paint)` -> `void`
- `drawOval(@NonNull RectF oval, @NonNull Paint paint)` -> `void`
- `drawOval(float left, float top, float right, float bottom, @NonNull Paint paint)` -> `void`
- `drawPaint(@NonNull Paint paint)` -> `void`
- `drawPatch(@NonNull NinePatch patch, @NonNull RectF dst, @Nullable Paint paint)` -> `void`
- `drawPatch(@NonNull NinePatch patch, @NonNull Rect dst, @Nullable Paint paint)` -> `void`
- `drawPath(@NonNull Path path, @NonNull Paint paint)` -> `void`
- `drawPicture(@NonNull Picture picture, @NonNull RectF dst)` -> `void`
- `drawPicture(@NonNull Picture picture)` -> `void`
- `drawPicture(@NonNull Picture picture, @NonNull Rect dst)` -> `void`
- `drawPoint(float x, float y, @NonNull Paint paint)` -> `void`
- `drawPoints(float[] pts, int offset, int count, @NonNull Paint paint)` -> `void`
- `drawPoints(@NonNull float[] pts, @NonNull Paint paint)` -> `void`
- `drawPosText(@NonNull String text, @NonNull float[] pos, @NonNull Paint paint)` -> `void`
- `drawPosText(@NonNull char[] text, int index, int count, @NonNull float[] pos, @NonNull Paint paint)` -> `void`
- `drawRGB(int r, int g, int b)` -> `void`
- `drawRect(@NonNull Rect r, @NonNull Paint paint)` -> `void`
- `drawRect(@NonNull RectF rect, @NonNull Paint paint)` -> `void`
- `drawRect(float left, float top, float right, float bottom, @NonNull Paint paint)` -> `void`
- `drawRenderNode(@NonNull RenderNode renderNode)` -> `void`
- `drawRoundRect(@NonNull RectF rect, float rx, float ry, @NonNull Paint paint)` -> `void`
- `drawRoundRect(float left, float top, float right, float bottom, float rx, float ry, @NonNull Paint paint)` -> `void`
- `drawText(@NonNull String text, float x, float y, @NonNull Paint paint)` -> `void`
- `drawText(@NonNull String text, int start, int end, float x, float y, @NonNull Paint paint)` -> `void`
- `drawText(@NonNull char[] text, int index, int count, float x, float y, @NonNull Paint paint)` -> `void`
- `drawText(@NonNull CharSequence text, int start, int end, float x, float y, @NonNull Paint paint)` -> `void`
- `drawTextOnPath(@NonNull char[] text, int index, int count, @NonNull Path path, float hOffset, float vOffset, @NonNull Paint paint)` -> `void`
- `drawTextOnPath(@NonNull String text, @NonNull Path path, float hOffset, float vOffset, @NonNull Paint paint)` -> `void`
- `drawTextRun(@NonNull char[] text, int index, int count, int contextIndex, int contextCount, float x, float y, boolean isRtl, @NonNull Paint paint)` -> `void`
- `drawTextRun(@NonNull MeasuredText text, int start, int end, int contextStart, int contextEnd, float x, float y, boolean isRtl, @NonNull Paint paint)` -> `void`
- `drawTextRun(@NonNull CharSequence text, int start, int end, int contextStart, int contextEnd, float x, float y, boolean isRtl, @NonNull Paint paint)` -> `void`
- `drawVertices(@NonNull VertexMode mode, int vertexCount, @NonNull float[] verts, int vertOffset, @Nullable float[] texs, int texOffset, @Nullable int[] colors, int colorOffset, @Nullable short[] indices, int indexOffset, int indexCount, @NonNull Paint paint)` -> `void`
- `enableZ()` -> `void`
- `getClipBounds(@NonNull Rect bounds)` -> `boolean`
- `getDensity()` -> `int`
- `getDrawFilter()` -> `DrawFilter`
- `getHeight()` -> `int`
- `getMatrix(@NonNull Matrix ctm)` -> `void`
- `getMaximumBitmapHeight()` -> `int`
- `getMaximumBitmapWidth()` -> `int`
- `getSaveCount()` -> `int`
- `getWidth()` -> `int`
- `quickReject(float left, float top, float right, float bottom)` -> `boolean`
- `quickReject(@NonNull RectF rect)` -> `boolean`
- `quickReject(@NonNull Path path)` -> `boolean`
- `quickReject(@NonNull RectF rect, @NonNull EdgeType type)` -> `boolean`
- `quickReject(@NonNull Path path, @NonNull EdgeType type)` -> `boolean`
- `quickReject(float left, float top, float right, float bottom, @NonNull EdgeType type)` -> `boolean`
- `restore()` -> `void`
- `restoreToCount(int saveCount)` -> `void`
- `rotate(float degrees)` -> `void`
- `saveLayer(float left, float top, float right, float bottom, @Nullable Paint paint)` -> `int`
- `saveLayer(@Nullable RectF bounds, @Nullable Paint paint)` -> `int`
- `saveLayer(float left, float top, float right, float bottom, @Nullable Paint paint, int saveFlags)` -> `int`
- `saveLayerAlpha(@Nullable RectF bounds, int alpha)` -> `int`
- `scale(float sx, float sy)` -> `void`
- `setBitmap(@Nullable Bitmap bitmap)` -> `void`
- `setDensity(int density)` -> `void`
- `setDrawFilter(@Nullable DrawFilter filter)` -> `void`
- `setMatrix(@Nullable Matrix matrix)` -> `void`
- `skew(float sx, float sy)` -> `void`
- `translate(float dx, float dy)` -> `void`

## `org.telegram.ui.Components.NumberPicker`
- `changeValueByOne(boolean increment)` -> `void`
- `computeScroll()` -> `void`
- `computeVerticalScrollExtent()` -> `int`
- `computeVerticalScrollOffset()` -> `int`
- `computeVerticalScrollRange()` -> `int`
- `dispatchKeyEvent(KeyEvent event)` -> `boolean`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `dispatchTrackballEvent(MotionEvent event)` -> `boolean`
- `finishScroll()` -> `void`
- `getBottomFadingEdgeStrength()` -> `float`
- `getContentDescription(int value)` -> `CharSequence`
- `getDisplayedValues()` -> `String[]`
- `getItemsCount()` -> `int`
- `getMaxValue()` -> `int`
- `getMinValue()` -> `int`
- `getSolidColor()` -> `int`
- `getTopFadingEdgeStrength()` -> `float`
- `getValue()` -> `int`
- `getWrapSelectorWheel()` -> `boolean`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent event)` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `static resolveSizeAndState(int size, int measureSpec, int childMeasuredState)` -> `int`
- `scrollBy(int x, int y)` -> `void`
- `setAllItemsCount(int allItemsCount)` -> `void`
- `setContentDescriptionCallback(Utilities.CallbackReturn<Integer, CharSequence> contentDescriptionCallback)` -> `void`
- `setDisplayedValues(String[] displayedValues)` -> `void`
- `setDrawDividers(boolean drawDividers)` -> `void`
- `setEnabled(boolean enabled)` -> `void`
- `setFormatter(Formatter formatter)` -> `void`
- `setGravity(int gravity)` -> `void`
- `setItemCount(int count)` -> `void`
- `setMaxValue(int maxValue)` -> `void`
- `setMinValue(int minValue)` -> `void`
- `setOnLongPressUpdateInterval(long intervalMillis)` -> `void`
- `setOnScrollListener(OnScrollListener onScrollListener)` -> `void`
- `setOnValueChangedListener(OnValueChangeListener onValueChangedListener)` -> `void`
- `setSelectorColor(int color)` -> `void`
- `setTextColor(int color)` -> `void`
- `setTextOffset(int value)` -> `void`
- `setValue(int value)` -> `void`
- `setWrapSelectorWheel(boolean wrapSelectorWheel)` -> `void`

## `org.telegram.ui.Components.NumberPicker$ChangeCurrentByOneFromLongPressCommand`
- `run()` -> `void`

## `org.telegram.ui.Components.NumberPicker$PressedStateHelper`
- `buttonPressDelayed(int button)` -> `void`
- `buttonTapped(int button)` -> `void`
- `run()` -> `void`

## `org.telegram.ui.Components.NumberTextView`
- `getOldTextWidth()` -> `float`
- `getProgress()` -> `float`
- `getTextWidth()` -> `float`
- `onDraw(Canvas canvas)` -> `void`
- `setAddNumber()` -> `void`
- `setCenterAlign(boolean center)` -> `void`
- `setNumber(int number, boolean animated)` -> `void`
- `setOnTextWidthProgressChangedListener(OnTextWidthProgressChangedListener onTextWidthProgressChangedListener)` -> `void`
- `setProgress(float value)` -> `void`
- `setTextColor(int value)` -> `void`
- `setTextSize(int size)` -> `void`
- `setTypeface(Typeface typeface)` -> `void`

## `org.telegram.ui.Components.OptionsSpeedIconDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setSpeed(Float speed, boolean animated)` -> `void`

## `org.telegram.ui.Components.OtherDocumentPlaceholderDrawable`
- `draw(Canvas canvas)` -> `void`
- `getCurrentProgress()` -> `float`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getMinimumHeight()` -> `int`
- `getMinimumWidth()` -> `int`
- `getObserverTag()` -> `int`
- `getOpacity()` -> `int`
- `onFailedDownload(String name, boolean canceled)` -> `void`
- `onProgressDownload(String fileName, long downloadedSize, long totalSize)` -> `void`
- `onProgressUpload(String fileName, long uploadedSize, long totalSize, boolean isEncrypted)` -> `void`
- `onSuccessDownload(String name)` -> `void`
- `recycle()` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(ColorFilter colorFilter)` -> `void`
- `setProgress(float value, boolean animated)` -> `void`

## `org.telegram.ui.Components.OutlineEditText`
- `getEditText()` -> `EditTextBoldCursor`
- `setHint(String hint)` -> `void`

## `org.telegram.ui.Components.OutlineTextContainerView`
- `animateError(float newValue)` -> `void`
- `animateSelection(boolean selected)` -> `void`
- `animateSelection(float selected)` -> `void`
- `animateSelection(float selected, float title)` -> `void`
- `animateSelection(boolean selected, boolean title)` -> `void`
- `animateSelection(float selected, boolean animated)` -> `void`
- `animateSelection(boolean selected, boolean title, boolean animated)` -> `void`
- `animateSelection(float selected, float title, boolean animate)` -> `void`
- `attachEditText(EditText attachedEditText)` -> `void`
- `getAttachedEditText()` -> `EditText`
- `onDraw(Canvas canvas)` -> `void`
- `setForceForceUseCenter(boolean forceForceUseCenter)` -> `void`
- `setForceUseCenter(boolean forceUseCenter)` -> `void`
- `setForceUseCenter2(boolean forceUseCenter2)` -> `void`
- `setLeftPadding(float padding)` -> `void`
- `setText(@NonNull String text)` -> `void`
- `updateColor()` -> `void`

## `org.telegram.ui.Components.PacmanAnimation`
- `draw(Canvas canvas, int cy)` -> `void`
- `setFinishRunnable(Runnable onAnimationFinished)` -> `void`
- `start()` -> `void`

## `org.telegram.ui.Components.PagerSlidingTabStrip`
- `getDividerPadding()` -> `int`
- `getIndicatorColor()` -> `int`
- `getIndicatorHeight()` -> `int`
- `getScrollOffset()` -> `int`
- `getShouldExpand()` -> `boolean`
- `getTab(int position)` -> `View`
- `getTabPaddingLeftRight()` -> `int`
- `getUnderlineColor()` -> `int`
- `getUnderlineHeight()` -> `int`
- `notifyDataSetChanged()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)` -> `void`
- `setDividerPadding(int dividerPaddingPx)` -> `void`
- `setIndicatorColor(int indicatorColor)` -> `void`
- `setIndicatorColorResource(int resId)` -> `void`
- `setIndicatorHeight(int indicatorLineHeightPx)` -> `void`
- `setOnPageChangeListener(OnPageChangeListener listener)` -> `void`
- `setScrollOffset(int scrollOffsetPx)` -> `void`
- `setShouldExpand(boolean shouldExpand)` -> `void`
- `setTabPaddingLeftRight(int paddingPx)` -> `void`
- `setUnderlineColor(int underlineColor)` -> `void`
- `setUnderlineColorResource(int resId)` -> `void`
- `setUnderlineHeight(int underlineHeightPx)` -> `void`
- `setViewPager(ViewPager pager)` -> `void`

## `org.telegram.ui.Components.PagerSlidingTabStrip$PageListener`
- `onPageScrollStateChanged(int state)` -> `void`
- `onPageScrolled(int position, float positionOffset, int positionOffsetPixels)` -> `void`
- `onPageSelected(int position)` -> `void`

## `org.telegram.ui.Components.PagerSlidingTabStrip$TextTab`
- `onDraw(Canvas canvas)` -> `void`
- `setSelected(boolean selected)` -> `void`
- `setSelectedProgress(float progress)` -> `void`

## `org.telegram.ui.Components.Paint.Brush`
- `getAlpha()` -> `float`
- `getAngle()` -> `float`
- `getDefaultColor()` -> `int`
- `getDefaultWeight()` -> `float`
- `getIconRes()` -> `int`
- `getOverrideAlpha()` -> `float`
- `getPreviewScale()` -> `float`
- `getScale()` -> `float`
- `getShaderName(int paintType)` -> `String`
- `getSmoothThicknessRate()` -> `float`
- `getSpacing()` -> `float`
- `getStamp()` -> `Bitmap`
- `getStampResId()` -> `int`

## `org.telegram.ui.Components.Paint.Brush$Arrow`
- `getDefaultColor()` -> `int`
- `getDefaultWeight()` -> `float`
- `getIconRes()` -> `int`
- `getSmoothThicknessRate()` -> `float`

## `org.telegram.ui.Components.Paint.Brush$Elliptical`
- `getAlpha()` -> `float`
- `getAngle()` -> `float`
- `getDefaultColor()` -> `int`
- `getDefaultWeight()` -> `float`
- `getIconRes()` -> `int`
- `getOverrideAlpha()` -> `float`
- `getPreviewScale()` -> `float`
- `getScale()` -> `float`
- `getSpacing()` -> `float`
- `getStampResId()` -> `int`

## `org.telegram.ui.Components.Paint.Brush$Eraser`
- `getAlpha()` -> `float`
- `getDefaultWeight()` -> `float`
- `getIconRes()` -> `int`
- `getPreviewScale()` -> `float`
- `getShaderName(int paintType)` -> `String`

## `org.telegram.ui.Components.Paint.Brush$Neon`
- `getAlpha()` -> `float`
- `getDefaultColor()` -> `int`
- `getDefaultWeight()` -> `float`
- `getIconRes()` -> `int`
- `getPreviewScale()` -> `float`
- `getScale()` -> `float`
- `getShaderName(int paintType)` -> `String`
- `getSpacing()` -> `float`
- `getStampResId()` -> `int`

## `org.telegram.ui.Components.Paint.Brush$Radial`
- `getDefaultColor()` -> `int`
- `getIconRes()` -> `int`

## `org.telegram.ui.Components.Paint.Brush$Shape`
- `getAlpha()` -> `float`
- `getFilledIconRes()` -> `int`
- `getShaderName(int paintType)` -> `String`
- `getShapeName()` -> `String`
- `getShapeShaderType()` -> `int`
- `static make(int type)` -> `Brush.Shape`

## `org.telegram.ui.Components.Paint.Brush$Shape$Arrow`
- `getFilledIconRes()` -> `int`
- `getIconRes()` -> `int`
- `getShapeName()` -> `String`
- `getShapeShaderType()` -> `int`

## `org.telegram.ui.Components.Paint.Brush$Shape$Bubble`
- `getFilledIconRes()` -> `int`
- `getIconRes()` -> `int`
- `getShapeName()` -> `String`
- `getShapeShaderType()` -> `int`

## `org.telegram.ui.Components.Paint.Brush$Shape$Circle`
- `getFilledIconRes()` -> `int`
- `getIconRes()` -> `int`
- `getShapeName()` -> `String`
- `getShapeShaderType()` -> `int`

## `org.telegram.ui.Components.Paint.Brush$Shape$Rectangle`
- `getFilledIconRes()` -> `int`
- `getIconRes()` -> `int`
- `getShapeName()` -> `String`
- `getShapeShaderType()` -> `int`

## `org.telegram.ui.Components.Paint.Brush$Shape$Star`
- `getFilledIconRes()` -> `int`
- `getIconRes()` -> `int`
- `getShapeName()` -> `String`
- `getShapeShaderType()` -> `int`

## `org.telegram.ui.Components.Paint.GLMatrix`
- `static LoadGraphicsMatrix(Matrix matrix)` -> `float[]`
- `static LoadOrtho(float left, float right, float bottom, float top, float near, float far)` -> `float[]`
- `static MultiplyMat4f(float[] a, float[] b)` -> `float[]`

## `org.telegram.ui.Components.Paint.Input`
- `clear(Runnable onDone)` -> `void`
- `ignoreOnce()` -> `void`
- `setMatrix(Matrix m)` -> `void`

## `org.telegram.ui.Components.Paint.PaintTypeface`
- `static find(String key)` -> `PaintTypeface`
- `static get()` -> `List<PaintTypeface>`
- `getKey()` -> `String`
- `getName()` -> `String`
- `getTypeface()` -> `Typeface`
- `static parseFont(Font font)` -> `FontData`
- `supports(String text)` -> `boolean`

## `org.telegram.ui.Components.Paint.PaintTypeface$Family`
- `getBold()` -> `FontData`
- `getRegular()` -> `FontData`

## `org.telegram.ui.Components.Paint.PaintTypeface$FontData`
- `getName()` -> `String`

## `org.telegram.ui.Components.Paint.PaintTypeface$LazyTypeface`
- `get()` -> `Typeface`

## `org.telegram.ui.Components.Paint.Painting`
- `applyHelperShape()` -> `boolean`
- `asMask()` -> `Painting`
- `cleanResources(boolean recycle)` -> `void`
- `clearShape()` -> `void`
- `clearStroke()` -> `void`
- `clearStroke(Runnable action)` -> `void`
- `commitPath(final Path path, final int color)` -> `void`
- `commitPath(final Path path, final int color, final boolean registerUndo, Runnable action)` -> `void`
- `commitShape(Shape shape, final int color)` -> `void`
- `getBounds()` -> `RectF`
- `getPaintingData(RectF rect, boolean undo)` -> `PaintingData`
- `getPaintingData(RectF rect, boolean undo, boolean onlyBlur, boolean includeBlur)` -> `PaintingData`
- `getSize()` -> `Size`
- `onPause(final Runnable completionRunnable)` -> `void`
- `onResume()` -> `void`
- `paintShape(final Shape shape, Runnable action)` -> `void`
- `paintStroke(final Path path, final boolean clearBuffer, final boolean clearAll, final Runnable action)` -> `void`
- `render()` -> `void`
- `setBitmap(Bitmap bitmap)` -> `void`
- `setBitmap(Bitmap bitmap, Bitmap blurBitmap)` -> `void`
- `setBrush(Brush value)` -> `void`
- `setDelegate(PaintingDelegate paintingDelegate)` -> `void`
- `setHelperShape(Shape shape)` -> `void`
- `setRenderProjection(float[] proj)` -> `void`
- `setRenderView(RenderView view)` -> `void`
- `setupShaders()` -> `void`

## `org.telegram.ui.Components.Paint.Path`
- `getBaseWeight()` -> `float`
- `getBrush()` -> `Brush`
- `getColor()` -> `int`
- `getLength()` -> `int`
- `getPoints()` -> `Point[]`
- `setup(int color, float baseWeight, Brush brush)` -> `void`

## `org.telegram.ui.Components.Paint.PhotoFace`
- `getAngle()` -> `float`
- `getPointForAnchor(int anchor)` -> `PointF`
- `getWidthForAnchor(int anchor)` -> `float`

## `org.telegram.ui.Components.Paint.Point`
- `alteringAddMultiplication(Point point, double scalar)` -> `void`
- `equals(Object obj)` -> `boolean`
- `getDistanceTo(Point point)` -> `float`
- `getNormalized()` -> `Point`
- `multiplyAndAdd(double scalar, Point point)` -> `Point`
- `multiplyByScalar(double scalar)` -> `Point`
- `multiplySum(Point point, double scalar)` -> `Point`
- `substract(Point point)` -> `Point`
- `toPointF()` -> `PointF`

## `org.telegram.ui.Components.Paint.Render`
- `static RenderPath(Path path, RenderState state)` -> `RectF`
- `static RenderPath(Path path, RenderState state, boolean fullAlpha)` -> `RectF`

## `org.telegram.ui.Components.Paint.RenderState`
- `appendValuesCount(int count)` -> `void`
- `getCount()` -> `int`
- `prepare()` -> `void`
- `reset()` -> `void`
- `resizeBuffer()` -> `void`
- `setPosition(int position)` -> `void`

## `org.telegram.ui.Components.Paint.RenderView`
- `brushWeightForSize(float size)` -> `float`
- `clearAll()` -> `void`
- `clearShape()` -> `void`
- `getCurrentBrush()` -> `Brush`
- `getCurrentColor()` -> `int`
- `getCurrentWeight()` -> `float`
- `getPainting()` -> `Painting`
- `getResultBitmap(boolean blurTex, boolean includeBlur)` -> `Bitmap`
- `getUndoStore()` -> `UndoStore`
- `onBeganDrawing()` -> `void`
- `onDrawForInput(Canvas canvas)` -> `void`
- `onFillShapesToggle(Canvas canvas)` -> `void`
- `onFinishedDrawing(boolean moved)` -> `void`
- `onTouch(MotionEvent event)` -> `boolean`
- `performInContext(final Runnable action)` -> `void`
- `redraw()` -> `void`
- `resetBrush()` -> `void`
- `selectBrush(Brush brush)` -> `void`
- `setBrush(Brush value)` -> `void`
- `setBrushSize(float size)` -> `void`
- `setColor(int value)` -> `void`
- `setDelegate(RenderViewDelegate renderViewDelegate)` -> `void`
- `setQueue(DispatchQueue dispatchQueue)` -> `void`
- `setUndoStore(UndoStore store)` -> `void`
- `shutdown()` -> `void`

## `org.telegram.ui.Components.Paint.RenderView$CanvasInternal`
- `finish()` -> `void`
- `getTexture()` -> `Bitmap`
- `getTexture(final boolean onlyBlur, final boolean includeBlur)` -> `Bitmap`
- `run()` -> `void`
- `scheduleRedraw()` -> `void`
- `setBufferSize(int width, int height)` -> `void`
- `shutdown()` -> `void`

## `org.telegram.ui.Components.Paint.RenderView$RenderViewDelegate`
- `invalidateInputView()` -> `default void`

## `org.telegram.ui.Components.Paint.Shader`
- `static SetColorUniform(int location, int color)` -> `void`
- `cleanResources()` -> `void`
- `getUniform(String key)` -> `int`

## `org.telegram.ui.Components.Paint.ShaderSet`
- `static setup()` -> `Map<String, Shader>`

## `org.telegram.ui.Components.Paint.Shape`
- `getBounds(RectF rect)` -> `void`
- `getType()` -> `int`

## `org.telegram.ui.Components.Paint.ShapeDetector`
- `append(double x, double y, boolean cancel)` -> `void`
- `clear()` -> `void`
- `scheduleDetect(boolean cancel)` -> `void`
- `static setLearning(Context context, boolean enabled)` -> `void`

## `org.telegram.ui.Components.Paint.ShapeDetector$Point`
- `distance(double x, double y)` -> `double`
- `distance(Point p)` -> `double`
- `static distance(double x1, double y1, double x2, double y2)` -> `double`
- `set(double x, double y)` -> `void`

## `org.telegram.ui.Components.Paint.ShapeDetector$RectD`
- `toString()` -> `String`
- `union(double x, double y)` -> `void`

## `org.telegram.ui.Components.Paint.ShapeInput`
- `clear()` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onColorChange()` -> `void`
- `onWeightChange()` -> `void`
- `setMatrix(Matrix m)` -> `void`
- `start(int shapeType)` -> `void`
- `stop()` -> `void`

## `org.telegram.ui.Components.Paint.ShapeInput$CornerPoint`
- `set()` -> `void`
- `update(float x, float y)` -> `void`

## `org.telegram.ui.Components.Paint.ShapeInput$Point`
- `set()` -> `void`
- `set(float x, float y)` -> `void`
- `update(float x, float y)` -> `void`

## `org.telegram.ui.Components.Paint.Slice`
- `cleanResources()` -> `void`
- `getBounds()` -> `RectF`
- `getData()` -> `ByteBuffer`
- `getHeight()` -> `int`
- `getTexture()` -> `int`
- `getWidth()` -> `int`
- `getX()` -> `int`
- `getY()` -> `int`

## `org.telegram.ui.Components.Paint.Swatch`
- `clone()` -> `Swatch`

## `org.telegram.ui.Components.Paint.Texture`
- `cleanResources(boolean recycleBitmap)` -> `void`
- `static generateTexture(Size size)` -> `int`
- `static generateTexture(int width, int height)` -> `int`
- `texture()` -> `int`

## `org.telegram.ui.Components.Paint.UndoStore`
- `clear()` -> `void`
- `getDelegate()` -> `UndoStoreDelegate`
- `registerUndo(UUID uuid, Runnable undoRunnable)` -> `void`
- `reset()` -> `void`
- `setDelegate(UndoStoreDelegate undoStoreDelegate)` -> `void`
- `undo()` -> `void`
- `unregisterUndo(UUID uuid)` -> `void`

## `org.telegram.ui.Components.Paint.Utils`
- `static HasGLError()` -> `void`
- `static RectFIntegral(RectF rect)` -> `void`

## `org.telegram.ui.Components.Paint.Views.EditTextOutline`
- `onDraw(Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `onTextChanged(CharSequence text, int start, int before, int after)` -> `void`
- `onTextContextMenuItem(int id)` -> `boolean`
- `setFrameColor(int frameColor)` -> `void`
- `setGravity(int gravity)` -> `void`
- `setStrokeColor(int strokeColor)` -> `void`
- `setStrokeWidth(float strokeWidth)` -> `void`

## `org.telegram.ui.Components.Paint.Views.EntitiesContainerView`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `entitiesCount()` -> `int`
- `measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.ui.Components.Paint.Views.EntityView`
- `allowHaptic()` -> `boolean`
- `allowLongPressOnSelected()` -> `boolean`
- `createSelectionView()` -> `SelectionView`
- `deselect()` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getBounceScale()` -> `float`
- `getMaxScale()` -> `float`
- `getMinScale()` -> `float`
- `getPosition()` -> `PointF`
- `getPositionX()` -> `float`
- `getPositionY()` -> `float`
- `getScale()` -> `float`
- `getSelectionBounds()` -> `RectOld`
- `getStickyPaddingBottom()` -> `float`
- `getStickyPaddingLeft()` -> `float`
- `getStickyPaddingRight()` -> `float`
- `getStickyPaddingTop()` -> `float`
- `getStickyX()` -> `int`
- `getStickyY()` -> `int`
- `getUUID()` -> `UUID`
- `hadMultitouch()` -> `boolean`
- `isSelected()` -> `boolean`
- `isSelectedProgress()` -> `boolean`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `pan(float tx, float ty)` -> `void`
- `rotate(float angle)` -> `void`
- `scale(float scale)` -> `void`
- `select(ViewGroup selectionContainer)` -> `void`
- `setDelegate(EntityViewDelegate entityViewDelegate)` -> `void`
- `setIsVideo(boolean isVideo)` -> `void`
- `setPosition(PointF value)` -> `void`
- `setScale(float scale)` -> `void`
- `setSelectionVisibility(boolean visible)` -> `void`
- `setStickyX(int stickyX)` -> `void`
- `setStickyY(int stickyY)` -> `void`
- `trashCenter()` -> `boolean`
- `updatePosition()` -> `void`
- `updateSelectionView()` -> `void`

## `org.telegram.ui.Components.Paint.Views.EntityView$EntityViewDelegate`
- `onEntityDragEnd(boolean delete)` -> `default void`
- `onEntityDragMultitouchEnd()` -> `default void`
- `onEntityDragMultitouchStart()` -> `default void`
- `onEntityDragStart()` -> `default void`
- `onEntityDragTrash(boolean enter)` -> `default void`
- `onEntityDraggedBottom(boolean value)` -> `default void`
- `onEntityDraggedTop(boolean value)` -> `default void`
- `onEntityHandleTouched()` -> `default void`

## `org.telegram.ui.Components.Paint.Views.EntityView$SelectionView`
- `getShowAlpha()` -> `float`
- `hide(boolean hide)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `pointInsideHandle(float x, float y)` -> `int`
- `updatePosition()` -> `void`

## `org.telegram.ui.Components.Paint.Views.LPhotoPaintView`
- `adjustPanLayoutHelperProgress()` -> `float`
- `allowInteraction(EntityView entityView)` -> `boolean`
- `appearAnimation(View view)` -> `void`
- `createEmojiView()` -> `void`
- `createPhoto(String path, boolean select)` -> `PhotoView`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `didSetAnimatedSticker(RLottieDrawable drawable)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getAdditionalBottom()` -> `int`
- `getAdditionalTop()` -> `int`
- `getBitmap(ArrayList<VideoEditedInfo.MediaEntity> entities, Bitmap[] thumbBitmap)` -> `Bitmap`
- `getCancelView()` -> `View`
- `getCenterLocation(EntityView entityView)` -> `int[]`
- `getCropRotation()` -> `float`
- `getDoneView()` -> `View`
- `getEmojiPadding(boolean panned)` -> `int`
- `getLcm()` -> `long`
- `getMasks()` -> `List<TLRPC.InputDocument>`
- `getOffsetTranslationY()` -> `float`
- `getPKeyboardHeight()` -> `int`
- `getRenderView()` -> `RenderView`
- `getSelectedEntityBottom()` -> `float`
- `getThanosEffect()` -> `ThanosEffect`
- `getTransformedTouch(float x, float y, float[] output)` -> `void`
- `hasChanges()` -> `boolean`
- `init()` -> `void`
- `isCurrentText()` -> `boolean`
- `maybeShowDismissalAlert(PhotoViewer photoViewer, Activity parentActivity, Runnable okRunnable)` -> `void`
- `onAddButtonPressed(View btn)` -> `void`
- `onAnimationStateChanged(boolean isStart)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onBackPressed()` -> `boolean`
- `onBrushSelected(Brush brush)` -> `void`
- `onCleanupEntities()` -> `void`
- `onColorPickerSelected()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onEmojiButtonClick()` -> `void`
- `onEmojiViewCloseByClick()` -> `void`
- `onEntityLongClicked(EntityView entityView)` -> `boolean`
- `onEntitySelected(EntityView entityView)` -> `boolean`
- `onGetPalette()` -> `PersistColorPalette`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onNewTextSelected()` -> `void`
- `onOpenCloseStickersAlert(boolean open)` -> `void`
- `onResume()` -> `void`
- `onSizeChanged(int height, boolean isWidthGreater)` -> `void`
- `onSwitchSegmentedAnimation(PhotoView photoView)` -> `void`
- `onTextAdd()` -> `void`
- `onTextAlignmentSelected(int align)` -> `void`
- `onTextOutlineSelected(View v)` -> `void`
- `onTouch(MotionEvent ev)` -> `boolean`
- `onTypefaceButtonClicked()` -> `void`
- `onTypefaceSelected(PaintTypeface typeface)` -> `void`
- `setBlurredBackgroundDrawableForTools(BlurredBackgroundDrawable d)` -> `void`
- `setDrawShadow(boolean drawShadow)` -> `void`
- `setOffsetTranslationX(float x)` -> `void`
- `setOffsetTranslationY(float y, float progress, int keyboardHeight, boolean isPan)` -> `void`
- `setOnDoneButtonClickedListener(Runnable callback)` -> `void`
- `setTransform(float scale, float trX, float trY, float imageWidth, float imageHeight)` -> `void`
- `shutdown()` -> `void`
- `translateY(float ty)` -> `void`
- `updateColors()` -> `void`
- `updateEntitiesSelections()` -> `void`
- `updateKeyboard()` -> `void`
- `updatePlusEmojiKeyboardButton()` -> `void`
- `updateZoom(boolean zoomedOut)` -> `void`

## `org.telegram.ui.Components.Paint.Views.LPhotoPaintView$BottomLayout`
- `onDraw(Canvas canvas)` -> `void`
- `setTranslationY(float translationY)` -> `void`

## `org.telegram.ui.Components.Paint.Views.LPhotoPaintView$PopupButton`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `performClick()` -> `boolean`
- `setIcon(int resId)` -> `void`
- `setIcon(int resId, boolean fillup, boolean animated)` -> `void`
- `setSelected(boolean selected)` -> `void`
- `setText(CharSequence text)` -> `void`

## `org.telegram.ui.Components.Paint.Views.LinkPreview`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawInternal(Canvas canvas)` -> `void`
- `static fromUrl(String url)` -> `String`
- `static fromUrlWithoutSchema(String url)` -> `String`
- `getPhotoSide()` -> `int`
- `getPreviewType()` -> `int`
- `getRadius()` -> `float`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `pushPhotoToCache()` -> `void`
- `set(int currentAccount, WebPagePreview webpage)` -> `void`
- `set(int currentAccount, WebPagePreview webpage, boolean animated)` -> `void`
- `setMaxWidth(int maxWidth)` -> `void`
- `setPreviewType(int type)` -> `void`
- `setType(int type, int color)` -> `void`
- `setVideoTexture()` -> `void`
- `setupLayout()` -> `void`
- `withPreview()` -> `boolean`

## `org.telegram.ui.Components.Paint.Views.LinkPreview$WebPagePreview`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `WebPagePreview`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.ui.Components.Paint.Views.LinkView`
- `createSelectionView()` -> `TextViewSelectionView`
- `getColor()` -> `int`
- `getMaxScale()` -> `float`
- `getNextType()` -> `int`
- `getSelectionBounds()` -> `RectOld`
- `getStickyPaddingBottom()` -> `float`
- `getStickyPaddingLeft()` -> `float`
- `getStickyPaddingRight()` -> `float`
- `getStickyPaddingTop()` -> `float`
- `getType()` -> `int`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setColor(int color)` -> `void`
- `setLink(int currentAccount, LinkPreview.WebPagePreview link, TL_stories.MediaArea area)` -> `void`
- `setMaxWidth(int maxWidth)` -> `void`
- `setType(int type)` -> `void`

## `org.telegram.ui.Components.Paint.Views.LinkView$TextViewSelectionView`
- `onDraw(Canvas canvas)` -> `void`
- `pointInsideHandle(float x, float y)` -> `int`

## `org.telegram.ui.Components.Paint.Views.LocationMarker`
- `attachInternal()` -> `void`
- `detachInternal()` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawInternal(Canvas canvas)` -> `void`
- `forceEmoji()` -> `void`
- `getCodeEmojiDocument()` -> `TLRPC.Document`
- `getEmojiBounds(RectF b)` -> `void`
- `getHeightInternal()` -> `int`
- `getRadius()` -> `float`
- `getText()` -> `String`
- `getTypesCount()` -> `int`
- `getWidthInternal()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setCodeEmoji(int currentAccount, String emoji)` -> `void`
- `setIsVideo(boolean isVideo)` -> `void`
- `setMaxWidth(int maxWidth)` -> `void`
- `setText(String text)` -> `void`
- `setType(int type, int color)` -> `void`
- `setupLayout()` -> `void`

## `org.telegram.ui.Components.Paint.Views.LocationView`
- `createSelectionView()` -> `TextViewSelectionView`
- `static geo(double Lat, double Long)` -> `String`
- `getColor()` -> `int`
- `getMaxScale()` -> `float`
- `getSelectionBounds()` -> `RectOld`
- `getStickyPaddingBottom()` -> `float`
- `getStickyPaddingLeft()` -> `float`
- `getStickyPaddingRight()` -> `float`
- `getStickyPaddingTop()` -> `float`
- `getType()` -> `int`
- `getTypesCount()` -> `int`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setColor(int color)` -> `void`
- `setLocation(int currentAccount, TLRPC.MessageMedia location, TL_stories.MediaArea area)` -> `void`
- `setMaxWidth(int maxWidth)` -> `void`
- `setType(int type)` -> `void`

## `org.telegram.ui.Components.Paint.Views.LocationView$TextViewSelectionView`
- `onDraw(Canvas canvas)` -> `void`
- `pointInsideHandle(float x, float y)` -> `int`

## `org.telegram.ui.Components.Paint.Views.MaskPaintView`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getAdditionalBottom()` -> `int`
- `getAdditionalTop()` -> `int`
- `getBitmap()` -> `Bitmap`
- `getRenderView()` -> `RenderView`
- `init()` -> `void`
- `onDrawn()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouch(MotionEvent ev)` -> `boolean`
- `requestLayout()` -> `void`
- `setEraser(boolean eraser)` -> `void`
- `setTransform(float scale, float trX, float trY, float rotate, float imageWidth, float imageHeight)` -> `void`
- `shutdown()` -> `void`
- `undo()` -> `boolean`

## `org.telegram.ui.Components.Paint.Views.MessageEntityView`
- `copyMessage(TLRPC.Message msg)` -> `TLRPC.Message`
- `createSelectionView()` -> `SelectionView`
- `drawForBitmap()` -> `boolean`
- `getBounceScale()` -> `float`
- `getBubbleBounds(RectF rect)` -> `float`
- `getSelectionBounds()` -> `RectOld`
- `invalidateAll()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `prepareToDraw(boolean drawingToBitmap)` -> `void`
- `setupTheme(StoryEntry entry)` -> `void`
- `updatePosition()` -> `void`

## `org.telegram.ui.Components.Paint.Views.MessageEntityView$MessageEntityViewSelectionView`
- `onDraw(Canvas canvas)` -> `void`
- `pointInsideHandle(float x, float y)` -> `int`

## `org.telegram.ui.Components.Paint.Views.PaintCancelView`
- `onDraw(Canvas canvas)` -> `void`
- `setProgress(float progress)` -> `void`

## `org.telegram.ui.Components.Paint.Views.PaintDoneView`
- `onDraw(Canvas canvas)` -> `void`
- `setProgress(float progress)` -> `void`

## `org.telegram.ui.Components.Paint.Views.PaintTextOptionsView`
- `animatePlusToIcon(int icon)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getColorClickableView()` -> `View`
- `getEmojiButton()` -> `ChatActivityEnterViewAnimatedIconView`
- `getTypefaceCell()` -> `TypefaceCell`
- `getTypefaceCellBounds(RectF out)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAlignment(int align)` -> `void`
- `setAlignment(int align, boolean notify)` -> `void`
- `setDelegate(Delegate delegate)` -> `void`
- `setOutlineType(int type)` -> `void`
- `setOutlineType(int type, boolean animate)` -> `void`
- `setTypeface(String key)` -> `void`
- `setTypefaceListView(PaintTypefaceListView typefaceListView)` -> `void`

## `org.telegram.ui.Components.Paint.Views.PaintTextOptionsView$TypefaceCell`
- `bind(PaintTypeface typeface)` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `setCurrent(boolean current)` -> `void`

## `org.telegram.ui.Components.Paint.Views.PaintToolsView`
- `animatePlusToIcon(int icon)` -> `void`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `select(int index)` -> `void`
- `setDelegate(Delegate delegate)` -> `void`
- `setSelectedIndex(int selectedIndex)` -> `void`

## `org.telegram.ui.Components.Paint.Views.PaintTypefaceListView`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `draw(Canvas c)` -> `void`
- `getSelectorColor(int position)` -> `Integer`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthSpec, int heightSpec)` -> `void`
- `onTouchEvent(MotionEvent e)` -> `boolean`
- `setMaskProvider(Consumer<Path> maskProvider)` -> `void`

## `org.telegram.ui.Components.Paint.Views.PaintWeightChooserView`
- `onDraw(Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBrushWeight(float brushWeight)` -> `void`
- `setColorSwatch(Swatch colorSwatch)` -> `void`
- `setDrawCenter(boolean draw)` -> `void`
- `setMinMax(float min, float max)` -> `void`
- `setOnUpdate(Runnable onUpdate)` -> `void`
- `setRenderView(RenderView renderView)` -> `void`
- `setShowPreview(boolean showPreview)` -> `void`
- `setValueOverride(ValueOverride valueOverride)` -> `void`
- `setViewHidden(boolean isViewHidden)` -> `void`
- `startPanTransition(int fromContentHeight, int newContentHeight)` -> `void`
- `stopPanTransition()` -> `void`
- `updatePanTransition(float y, float progress)` -> `void`

## `org.telegram.ui.Components.Paint.Views.PhotoView`
- `createSelectionView()` -> `SelectionView`
- `drawContent(Canvas canvas)` -> `void`
- `getAnchor()` -> `int`
- `getBaseSize()` -> `Size`
- `getContentHeight()` -> `int`
- `getContentWidth()` -> `int`
- `getOrientation()` -> `int`
- `getPath(int currentAccount)` -> `String`
- `getSegmentedOutBitmap()` -> `Bitmap`
- `getSelectionBounds()` -> `RectOld`
- `highlightSegmented()` -> `void`
- `isMirrored()` -> `boolean`
- `isSegmented()` -> `boolean`
- `static isWaitingMlKitError(Exception e)` -> `boolean`
- `mirror()` -> `void`
- `mirror(boolean animated)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onSwitchSegmentedAnimationStarted(boolean thanos)` -> `void`
- `preloadSegmented(String path)` -> `void`
- `segmentImage(Bitmap source)` -> `void`
- `stickerDraw(Canvas canvas)` -> `void`
- `toggleSegmented(boolean animated)` -> `void`
- `updatePosition()` -> `void`

## `org.telegram.ui.Components.Paint.Views.PhotoView$FrameLayoutDrawer`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.Components.Paint.Views.PhotoView$PhotoViewSelectionView`
- `onDraw(Canvas canvas)` -> `void`
- `pointInsideHandle(float x, float y)` -> `int`

## `org.telegram.ui.Components.Paint.Views.RotationGestureDetector`
- `getAngle()` -> `float`
- `getStartAngle()` -> `float`
- `onTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.ui.Components.Paint.Views.RoundView`
- `createSelectionView()` -> `SelectionView`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getAnchor()` -> `int`
- `getBaseSize()` -> `Size`
- `getSelectionBounds()` -> `RectOld`
- `isMirrored()` -> `boolean`
- `mirror()` -> `void`
- `mirror(boolean animated)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `resizeTextureView(int w, int h)` -> `void`
- `setDraw(boolean draw)` -> `void`
- `setShown(boolean shown, boolean animated)` -> `void`
- `trashCenter()` -> `boolean`
- `updatePosition()` -> `void`

## `org.telegram.ui.Components.Paint.Views.RoundView$RoundViewSelectionView`
- `onDraw(Canvas canvas)` -> `void`
- `pointInsideHandle(float x, float y)` -> `int`

## `org.telegram.ui.Components.Paint.Views.TextPaintView`
- `beginEditing()` -> `void`
- `createSelectionView()` -> `TextViewSelectionView`
- `disableAutoresize(boolean disable)` -> `void`
- `endEditing()` -> `void`
- `getAlign()` -> `int`
- `getBaseFontSize()` -> `int`
- `getEditText()` -> `EditTextOutline`
- `getFocusedView()` -> `View`
- `getFontMetricsInt()` -> `Paint.FontMetricsInt`
- `getFontSize()` -> `float`
- `getSelectionBounds()` -> `RectOld`
- `getStickyPaddingBottom()` -> `float`
- `getStickyPaddingLeft()` -> `float`
- `getStickyPaddingRight()` -> `float`
- `getStickyPaddingTop()` -> `float`
- `getSwatch()` -> `Swatch`
- `getText()` -> `CharSequence`
- `getTextSize()` -> `int`
- `getType()` -> `int`
- `getTypeface()` -> `PaintTypeface`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAlign(int align)` -> `void`
- `setBaseFontSize(int baseFontSize)` -> `void`
- `setMaxWidth(int maxWidth)` -> `void`
- `setMinMaxFontSize(int min, int max, Runnable onFontChange)` -> `void`
- `setSwatch(Swatch swatch)` -> `void`
- `setText(CharSequence text)` -> `void`
- `setType(int type)` -> `void`
- `setTypeface(PaintTypeface typeface)` -> `void`
- `setTypeface(String key)` -> `void`
- `updateColor()` -> `void`
- `updateTypeface()` -> `void`

## `org.telegram.ui.Components.Paint.Views.TextPaintView$TextViewSelectionView`
- `onDraw(Canvas canvas)` -> `void`
- `pointInsideHandle(float x, float y)` -> `int`

## `org.telegram.ui.Components.Paint.Views.WeatherView`
- `createSelectionView()` -> `TextViewSelectionView`
- `getColor()` -> `int`
- `getMaxScale()` -> `float`
- `getSelectionBounds()` -> `RectOld`
- `getStickyPaddingBottom()` -> `float`
- `getStickyPaddingLeft()` -> `float`
- `getStickyPaddingRight()` -> `float`
- `getStickyPaddingTop()` -> `float`
- `getType()` -> `int`
- `getTypesCount()` -> `int`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setColor(int color)` -> `void`
- `setIsVideo(boolean isVideo)` -> `void`
- `setMaxWidth(int maxWidth)` -> `void`
- `setType(int type)` -> `void`
- `setWeather(int currentAccount, Weather.State weather)` -> `void`

## `org.telegram.ui.Components.Paint.Views.WeatherView$TextViewSelectionView`
- `onDraw(Canvas canvas)` -> `void`
- `pointInsideHandle(float x, float y)` -> `int`

## `org.telegram.ui.Components.PaintingOverlay`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getBitmap()` -> `Bitmap`
- `getThumb()` -> `Bitmap`
- `hideBitmap()` -> `void`
- `hideEntities()` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `reset()` -> `void`
- `setAlpha(float alpha)` -> `void`
- `setBitmap(Bitmap bitmap)` -> `void`
- `setData(String paintPath, ArrayList<VideoEditedInfo.MediaEntity> entities, boolean isVideo, boolean startAfterSet, boolean clip)` -> `void`
- `setEntities(ArrayList<VideoEditedInfo.MediaEntity> entities, boolean isVideo, boolean startAfterSet, boolean clip)` -> `void`
- `showAll()` -> `void`

## `org.telegram.ui.Components.PathAnimator`
- `draw(Canvas canvas, Paint paint, float time)` -> `void`
- `getDurationScale()` -> `float`

## `org.telegram.ui.Components.PermanentLinkBottomSheet`
- `dismiss()` -> `void`
- `dismissInternal()` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `show()` -> `void`

## `org.telegram.ui.Components.PermissionAlert`
- `static create()` -> `AlertDialog`

## `org.telegram.ui.Components.PermissionRequest`
- `static ensureAllPermissions(int iconResId, int stringResId, String[] permissions, Utilities.Callback<Boolean> whenDone)` -> `void`
- `static ensureAllPermissions(int iconResId, int stringResId, String[] checkPermissions, String[] requestPermissions, Utilities.Callback<Boolean> whenDone)` -> `void`
- `static ensureEitherPermission(int iconResId, int stringResId, String[] permissions, Utilities.Callback<Boolean> whenDone)` -> `void`
- `static ensureEitherPermission(int iconResId, int stringResId, String[] checkPermissions, String[] requestPermissions, Utilities.Callback<Boolean> whenDone)` -> `void`
- `static ensurePermission(int iconResId, int stringResId, String permission)` -> `void`
- `static ensurePermission(int iconResId, int stringResId, String permission, Utilities.Callback<Boolean> whenDone)` -> `void`
- `static showPermissionSettings(String permission)` -> `void`

## `org.telegram.ui.Components.PhonebookShareAlert`
- `onStart()` -> `void`
- `onStop()` -> `void`
- `setDelegate(ChatAttachAlertContactsLayout.PhonebookShareAlertDelegate phonebookShareAlertDelegate)` -> `void`

## `org.telegram.ui.Components.PhonebookShareAlert$ListAdapter`
- `createView(Context context, int position)` -> `View`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `onBindViewHolder(View itemView, int position, int type)` -> `void`

## `org.telegram.ui.Components.PhonebookShareAlert$TextCheckBoxCell`
- `invalidate()` -> `void`
- `isChecked()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked)` -> `void`
- `setVCardItem(AndroidUtilities.VcardItem item, int icon, boolean divider)` -> `void`

## `org.telegram.ui.Components.PhotoBubbleClip`
- `setBounds(int cx, int cy, int r)` -> `void`

## `org.telegram.ui.Components.PhotoCropView`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getRectSizeX()` -> `float`
- `getRectSizeY()` -> `float`
- `getRectX()` -> `float`
- `getRectY()` -> `float`
- `getVideoThumb()` -> `Bitmap`
- `invalidate()` -> `void`
- `isReady()` -> `boolean`
- `makeCrop(MediaController.MediaEditState editState)` -> `void`
- `mirror()` -> `boolean`
- `onAppear()` -> `void`
- `onAppeared()` -> `void`
- `onDisappear()` -> `void`
- `onHide()` -> `void`
- `onInterceptTouchEvent(MotionEvent event)` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onShow()` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `reset()` -> `void`
- `reset(boolean force)` -> `void`
- `rotate(float diff)` -> `boolean`
- `setAspectRatio(float ratio)` -> `void`
- `setBitmap(Bitmap bitmap, int rotation, boolean freeform, boolean update, PaintingOverlay paintingOverlay, CropTransform cropTransform, VideoEditTextureView videoView, MediaController.CropState state)` -> `void`
- `setDelegate(PhotoCropViewDelegate photoCropViewDelegate)` -> `void`
- `setFreeform(boolean freeform)` -> `void`
- `setSubtitle(String subtitle)` -> `void`
- `setVideoThumb(Bitmap bitmap, int orientation)` -> `void`
- `setVideoThumbFlashAlpha(float alpha)` -> `void`
- `setVideoThumbVisible(boolean visible)` -> `void`

## `org.telegram.ui.Components.PhotoEditorSeekBar`
- `getProgress()` -> `int`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setDelegate(PhotoEditorSeekBarDelegate delegate)` -> `void`
- `setMinMax(int min, int max)` -> `void`
- `setProgress(int progress)` -> `void`
- `setProgress(int progress, boolean notify)` -> `void`

## `org.telegram.ui.Components.PhotoFilterCurvesControl`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setActualArea(float x, float y, float width, float height)` -> `void`
- `setDelegate(PhotoFilterCurvesControlDelegate photoFilterCurvesControlDelegate)` -> `void`

## `org.telegram.ui.Components.PhotoFilterView`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `fillAndGetCurveBuffer()` -> `ByteBuffer`
- `getBitmap()` -> `Bitmap`
- `getBlurAngle()` -> `float`
- `getBlurControl()` -> `PhotoFilterBlurControl`
- `getBlurExcludeBlurSize()` -> `float`
- `getBlurExcludePoint()` -> `PointF`
- `getBlurExcludeSize()` -> `float`
- `getBlurType()` -> `int`
- `getCancelTextView()` -> `TextView`
- `getContrastValue()` -> `float`
- `getCurveControl()` -> `PhotoFilterCurvesControl`
- `getDoneTextView()` -> `TextView`
- `getEnhanceValue()` -> `float`
- `getExposureValue()` -> `float`
- `getFadeValue()` -> `float`
- `getGrainValue()` -> `float`
- `getHighlightsValue()` -> `float`
- `getMyTextureView()` -> `TextureView`
- `getSaturationValue()` -> `float`
- `getSavedFilterState()` -> `MediaController.SavedFilterState`
- `getShadowsValue()` -> `float`
- `getSharpenValue()` -> `float`
- `getSoftenSkinValue()` -> `float`
- `getTintHighlightsColor()` -> `int`
- `getTintHighlightsIntensityValue()` -> `float`
- `getTintShadowsColor()` -> `int`
- `getTintShadowsIntensityValue()` -> `float`
- `getToolsView()` -> `FrameLayout`
- `getUiBlurBitmap()` -> `Bitmap`
- `getVignetteValue()` -> `float`
- `getWarmthValue()` -> `float`
- `init()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouch(MotionEvent event)` -> `boolean`
- `setEnhanceValue(float value)` -> `void`
- `shutdown()` -> `void`
- `switchMode()` -> `void`
- `updateColors()` -> `void`
- `updateUiBlurGradient(int top, int bottom)` -> `void`

## `org.telegram.ui.Components.PhotoFilterView$CurvesToolValue`
- `fillBuffer()` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.ui.Components.PhotoFilterView$CurvesValue`
- `getDataPoints()` -> `float[]`
- `interpolateCurve()` -> `float[]`
- `restoreValues()` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.ui.Components.PhotoFilterView$EnhanceView`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouch(MotionEvent event)` -> `boolean`
- `setAllowTouch(boolean allow)` -> `void`
- `setFilterView(PhotoFilterView filterView)` -> `void`

## `org.telegram.ui.Components.PhotoFilterView$RecyclerListViewWithShadows`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onScrolled(int dx, int dy)` -> `void`

## `org.telegram.ui.Components.PhotoFilterView$ToolsAdapter`
- `getItemCount()` -> `int`
- `getItemId(int i)` -> `long`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int i)` -> `void`
- `onCreateViewHolder(ViewGroup viewGroup, int i)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.PickerBottomLayout`
- `updateSelectedCount(int count, boolean disable)` -> `void`

## `org.telegram.ui.Components.PickerBottomLayoutViewer`
- `updateSelectedCount(int count, boolean disable)` -> `void`

## `org.telegram.ui.Components.PinnedLineView`
- `onDraw(Canvas canvas)` -> `void`
- `set(int position, int totalCount, boolean animated)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.PlayPauseDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int i)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setDuration(int duration)` -> `void`
- `setParent(View parent)` -> `void`
- `setPause(boolean pause)` -> `void`
- `setPause(boolean pause, boolean animated)` -> `void`

## `org.telegram.ui.Components.PlayingGameDrawable`
- `draw(Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(ColorFilter cf)` -> `void`
- `setIsChat(boolean value)` -> `void`
- `start()` -> `void`
- `stop()` -> `void`

## `org.telegram.ui.Components.PollVotesAlert`
- `animateSectionUpdates(View view)` -> `void`
- `calcPercent(byte[] option)` -> `int`
- `dismissInternal()` -> `void`
- `getConnectionsManager()` -> `ConnectionsManager`
- `getMessagesController()` -> `MessagesController`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `static showForPoll(BaseFragment parentFragment, MessageObject messageObject)` -> `void`

## `org.telegram.ui.Components.PollVotesAlert$Adapter`
- `getCountForSection(int section)` -> `int`
- `getItem(int section, int position)` -> `Object`
- `getItemViewType(int section, int position)` -> `int`
- `getLetter(int position)` -> `String`
- `getPositionForScrollProgress(RecyclerListView listView, float progress, int[] position)` -> `void`
- `getSectionCount()` -> `int`
- `getSectionHeaderView(int section, View view)` -> `View`
- `isEnabled(RecyclerView.ViewHolder holder, int section, int row)` -> `boolean`
- `onBindViewHolder(int section, int position, RecyclerView.ViewHolder holder)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.Components.PollVotesAlert$SectionCell`
- `onCollapseClick()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setText(CharSequence left, ArrayList<TLRPC.MessageEntity> entities, int percent, int votesCount, int collapsed, boolean animated)` -> `void`

## `org.telegram.ui.Components.PollVotesAlert$VotesList`
- `getCollapsed()` -> `int`
- `getCount()` -> `int`

## `org.telegram.ui.Components.PopupSwipeBackLayout`
- `addOnSwipeBackProgressListener(OnSwipeBackProgressListener onSwipeBackProgressListener)` -> `void`
- `addView(View child, int index, ViewGroup.LayoutParams params)` -> `void`
- `closeForeground()` -> `void`
- `closeForeground(boolean animated)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `invalidateTransforms()` -> `void`
- `invalidateTransforms(boolean applyBackScaleY)` -> `void`
- `isForegroundOpen()` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `openForeground(int viewIndex)` -> `void`
- `setForegroundColor(int color)` -> `void`
- `setNewForegroundHeight(int index, int height, boolean animated)` -> `void`
- `setOnForegroundOpenFinished(Runnable listener)` -> `void`
- `setOnHeightUpdateListener(IntCallback onHeightUpdateListener)` -> `void`
- `setStickToRight(boolean right)` -> `void`
- `setSwipeBackDisallowed(boolean swipeBackDisallowed)` -> `void`

## `org.telegram.ui.Components.PostRunnableHolder`
- `clear()` -> `void`
- `post(Runnable runnable)` -> `void`
- `post(Runnable runnable, long delay)` -> `void`

## `org.telegram.ui.Components.PostsSearchContainer`
- `onAttachedToWindow()` -> `void`
- `search(String q)` -> `void`
- `setKeyboardHeight(int h)` -> `void`
- `setPagesPaddings(int top, int bottom)` -> `void`
- `setPagesPaddings(int top, int bottom, boolean doNotRequestLayout)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.Premium.BaseListPageView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `setOffset(float translationX)` -> `void`
- `setTopOffset(int topOffset)` -> `void`

## `org.telegram.ui.Components.Premium.CarouselView`
- `autoplayToNext()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `scheduleAutoscroll()` -> `void`
- `setAutoPlayEnabled(boolean autoPlayEnabled)` -> `void`
- `setFirstScrollEnabled(boolean b)` -> `void`
- `setOffset(float translationX)` -> `void`

## `org.telegram.ui.Components.Premium.CarouselView$DrawingObject`
- `draw(Canvas canvas, float cX, float cY, float scale)` -> `void`
- `hideAnimation()` -> `void`
- `onAttachToWindow(View parentView, int i)` -> `void`
- `onDetachFromWindow()` -> `void`
- `select()` -> `void`

## `org.telegram.ui.Components.Premium.DoubleLimitsPageView`
- `createAdapter()` -> `RecyclerView.Adapter`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Components.Premium.DoubledLimitsBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `getTitle()` -> `CharSequence`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `onPreDraw(Canvas canvas, int top, float progressToFullView)` -> `void`
- `onPreMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setParentFragment(PremiumPreviewFragment premiumPreviewFragment)` -> `void`

## `org.telegram.ui.Components.Premium.DoubledLimitsBottomSheet$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `measureGradient(Context context, int w, int h)` -> `void`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.Premium.DoubledLimitsBottomSheet$LimitCell`
- `setData(Limit limit)` -> `void`

## `org.telegram.ui.Components.Premium.FeaturesPageView`
- `createAdapter()` -> `RecyclerView.Adapter`

## `org.telegram.ui.Components.Premium.FeaturesPageView$HeaderView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Components.Premium.GLIcon.CoolDiamondIcon`
- `detach(View parent)` -> `void`
- `draw(Canvas canvas, Rect bounds, View parent)` -> `boolean`
- `draw(Canvas canvas, Rect bounds, View parent, boolean sending)` -> `boolean`
- `draw(Canvas canvas, Rect bounds, View parent, boolean custom, float yaw, float pitch)` -> `boolean`
- `static get(Context context)` -> `CoolDiamondIcon`
- `getIdlePitch()` -> `float`
- `getIdleYaw()` -> `float`
- `getRestingYaw(View parent, boolean sending)` -> `float`
- `setTilt(float yaw, float pitch)` -> `void`

## `org.telegram.ui.Components.Premium.GLIcon.DiamondProgram`
- `static create(Context context, String vertexSource, String fragmentSource)` -> `int`

## `org.telegram.ui.Components.Premium.GLIcon.DiamondRenderer`
- `destroy()` -> `void`
- `draw(int w, int h, float yaw, float pitch, float roll, float dt, float alpha, float white)` -> `void`
- `drawTexture(int w, int h, float alpha)` -> `void`
- `drawToTexture(int side, float yaw, float pitch, float dt)` -> `void`

## `org.telegram.ui.Components.Premium.GLIcon.DiamondSurfaceView`
- `doFrame(long frameTimeNanos)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onRenderError()` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `reserveRenderScale(float scale)` -> `void`
- `setIdleAnimationEnabled(boolean enabled)` -> `void`
- `setPaused(boolean value)` -> `void`
- `setRenderScale(float scale)` -> `void`
- `setStarParticlesView(StarParticlesView view)` -> `void`
- `stopThread()` -> `void`
- `surfaceCreated(SurfaceHolder holder)` -> `void`
- `surfaceDestroyed(SurfaceHolder holder)` -> `void`
- `surfaceRedrawNeededAsync(SurfaceHolder holder, Runnable finishDrawing)` -> `void`
- `whenReady(Runnable listener)` -> `void`

## `org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer`
- `onDrawFrame(GL10 glUnused)` -> `void`
- `onSurfaceChanged(GL10 glUnused, int width, int height)` -> `void`
- `onSurfaceCreated(GL10 glUnused, EGLConfig config)` -> `void`
- `setBackground(Bitmap gradientTextureBitmap)` -> `void`
- `setDeltaTime(float dt)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView`
- `getMaxFrameRate()` -> `int`
- `isPaused()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLongPress()` -> `void`
- `onRenderError()` -> `void`
- `onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height)` -> `void`
- `onSurfaceTextureDestroyed(SurfaceTexture surface)` -> `boolean`
- `onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `preferGles3()` -> `boolean`
- `renderFirstFrameWhilePaused()` -> `boolean`
- `scheduleIdleAnimation(long time)` -> `void`
- `setBackgroundBitmap(Bitmap gradientTextureBitmap)` -> `void`
- `setDialogVisible(boolean isVisible)` -> `void`
- `setDimensions(int width, int height)` -> `void`
- `setIdleAnimationEnabled(boolean enabled)` -> `void`
- `setPaused(boolean isPaused)` -> `void`
- `setRenderer(GLIconRenderer renderer)` -> `void`
- `setStarParticlesView(StarParticlesView starParticlesView)` -> `void`
- `startBackAnimation()` -> `void`
- `startEnterAnimation(int angle, long delay)` -> `void`
- `startIdleAnimation()` -> `void`
- `startThread(SurfaceTexture surface, int width, int height)` -> `void`
- `stopThread()` -> `void`
- `whenReady(Runnable whenReady)` -> `void`

## `org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView$RenderThread`
- `run()` -> `void`

## `org.telegram.ui.Components.Premium.GLIcon.Icon3D`
- `destroy()` -> `void`
- `draw(float[] mvpMatrix, float[] worldMatrix, int width, int height, float gradientStartX, float gradientScaleX, float gradientStartY, float gradientScaleY, float white, float golden, float dt)` -> `void`
- `static getBitmapFromAsset(Context context, String filePath)` -> `Bitmap`
- `setBackground(Bitmap gradientTextureBitmap)` -> `void`

## `org.telegram.ui.Components.Premium.GLIcon.WalletDiamondTextureView`
- `isReady()` -> `boolean`
- `onRenderError()` -> `void`
- `setPaused(boolean paused)` -> `void`
- `setPose(float yaw, float pitch, boolean custom, boolean enlarged)` -> `void`

## `org.telegram.ui.Components.Premium.GLIcon.WalletDiamondTextureView$Engine`
- `initialize()` -> `void`
- `release()` -> `void`
- `render()` -> `void`
- `renderer()` -> `DiamondRenderer`
- `swap(Target target)` -> `void`

## `org.telegram.ui.Components.Premium.HelloParticles$Drawable`
- `init()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `recycle()` -> `void`
- `resetPositions()` -> `void`

## `org.telegram.ui.Components.Premium.HelloParticles$Drawable$Particle`
- `draw(Canvas canvas, int index, long time)` -> `void`
- `genPosition(long time, int index, boolean reset)` -> `void`

## `org.telegram.ui.Components.Premium.LimitPreviewView`
- `animateStarRating(TL_stars.Tl_starsRating from, TL_stars.Tl_starsRating to)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `increaseCurrentValue(int boosts, int value, int maxValue)` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `setBagePosition(float position)` -> `void`
- `setBoosts(TL_stories.TL_premium_boostsStatus boosts, boolean boosted)` -> `void`
- `setDarkGradientProvider(DarkGradientProvider darkGradientProvider)` -> `void`
- `setDelayedAnimation()` -> `void`
- `setHideNegativeValues(boolean hideNegativeValues)` -> `void`
- `setIconScale(float iconScale)` -> `void`
- `setIconValue(int currentValue, boolean animated)` -> `void`
- `setIconValue(int currentValue, int totalValue, boolean allowShort, boolean animated)` -> `void`
- `setParentViewForGradien(ViewGroup containerView)` -> `void`
- `setPremiumLocked()` -> `void`
- `setStarRating(TL_stars.Tl_starsRating rating)` -> `void`
- `setStaticGradinet(PremiumGradient.PremiumGradientTools gradientTools)` -> `void`
- `setStatus(int currentLevel, int maxLevel, boolean animated)` -> `void`
- `setType(int type)` -> `void`
- `startDelayedAnimation()` -> `void`

## `org.telegram.ui.Components.Premium.LimitPreviewView$CounterView`
- `createAnimationLayouts()` -> `void`
- `createAnimationLayoutsDiff(CharSequence oldText)` -> `void`
- `getArrowCenter()` -> `float`
- `getText()` -> `CharSequence`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setArrowCenter(float v)` -> `void`
- `setText(CharSequence text, boolean animated)` -> `void`
- `setTranslationX(float translationX)` -> `void`

## `org.telegram.ui.Components.Premium.LimitPreviewView$TextViewHolder`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`

## `org.telegram.ui.Components.Premium.LimitReachedBottomSheet`
- `channelColorLevelMin()` -> `int`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getTitle()` -> `CharSequence`
- `static limitTypeToServerString(int type)` -> `String`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onViewCreated(FrameLayout containerView)` -> `void`
- `static openBoostsForPostingStories(BaseFragment baseFragment, long dialogId, ChannelBoostsController.CanApplyBoost canApplyBoost, TL_stories.TL_premium_boostsStatus boostsStatus, Runnable statisticAction)` -> `void`
- `static openBoostsForRemoveRestrictions(BaseFragment baseFragment, TL_stories.TL_premium_boostsStatus boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoos, long dialogId, boolean inFragment)` -> `LimitReachedBottomSheet`
- `static openBoostsForUsers(BaseFragment baseFragment, boolean isCurrentChat, long dialogId, ChannelBoostsController.CanApplyBoost canApplyBoost, TL_stories.TL_premium_boostsStatus boostsStatus, ChatMessageCell chatMessageCell)` -> `void`
- `setBoostsStats(TL_stories.TL_premium_boostsStatus boostsStatus, boolean isCurrentChat)` -> `void`
- `setCanApplyBoost(ChannelBoostsController.CanApplyBoost canApplyBoost)` -> `void`
- `setChatMessageCell(ChatMessageCell chatMessageCell)` -> `void`
- `setCurrentValue(int currentValue)` -> `void`
- `setDialogId(long dialogId)` -> `void`
- `setRequiredLvl(int requiredLvl)` -> `void`
- `setVeryLargeFile(boolean b)` -> `void`
- `showStatisticButtonInLink(Runnable runnable)` -> `void`
- `updatePremiumButtonText()` -> `void`

## `org.telegram.ui.Components.Premium.LimitReachedBottomSheet$BoostFeature`
- `static arraysEqual(ArrayList<BoostFeature> a, ArrayList<BoostFeature> b)` -> `boolean`
- `asIncremental()` -> `BoostFeature`
- `equals(BoostFeature that)` -> `boolean`
- `static of(int iconResId, int textKey)` -> `BoostFeature`
- `static of(int iconResId, int textKey, String count)` -> `BoostFeature`
- `static of(int iconResId, String textKeyPlural, int count)` -> `BoostFeature`

## `org.telegram.ui.Components.Premium.LimitReachedBottomSheet$BoostFeatureCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(BoostFeature boostFeature)` -> `void`

## `org.telegram.ui.Components.Premium.LimitReachedBottomSheet$HeaderView`
- `recreateTitleAndDescription()` -> `void`

## `org.telegram.ui.Components.Premium.MatrixParticlesDrawable`
- `init()` -> `void`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.Components.Premium.MatrixParticlesDrawable$MatrixTextParticle`
- `draw(Canvas canvas, float x, float y, long currentTime, float alpha)` -> `void`
- `init(long time)` -> `void`

## `org.telegram.ui.Components.Premium.MatrixParticlesDrawable$Particle`
- `init(int ny, long currentTime)` -> `void`
- `reset(long currentTime)` -> `void`

## `org.telegram.ui.Components.Premium.PremiumAppIconsPreviewView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setOffset(float translationX)` -> `void`

## `org.telegram.ui.Components.Premium.PremiumAppIconsPreviewView$AdaptiveIconImageView`
- `draw(Canvas canvas)` -> `void`

## `org.telegram.ui.Components.Premium.PremiumButtonView`
- `clearOverlayText()` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getIconView()` -> `RLottieImageView`
- `getTextView()` -> `AnimatedTextView`
- `hideIcon()` -> `void`
- `isEnabled()` -> `boolean`
- `isLoading()` -> `boolean`
- `isShowOverlay()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setButton(String text, View.OnClickListener clickListener)` -> `void`
- `setButton(String text, View.OnClickListener clickListener, boolean animated)` -> `void`
- `setEnabled(boolean enabled)` -> `void`
- `setFlickerDisabled(boolean flickerDisabled)` -> `void`
- `setIcon(int id)` -> `void`
- `setLoading(boolean loading)` -> `void`
- `setNonClickable()` -> `void`
- `setOverlayText(CharSequence text, boolean drawOverlayColor, boolean animated)` -> `void`

## `org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `getViewForPosition(Context context, int position)` -> `View`
- `hideButton()` -> `void`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `onCustomOpenAnimation()` -> `boolean`
- `setForceAbout()` -> `PremiumFeatureBottomSheet`
- `show()` -> `void`

## `org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet$ViewPage`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setFeatureDate(PremiumPreviewFragment.PremiumFeatureData featureData)` -> `void`

## `org.telegram.ui.Components.Premium.PremiumGradient`
- `createGradientDrawable(Drawable drawable)` -> `InternalDrawable`
- `createGradientDrawable(Drawable drawable, PremiumGradientTools gradient)` -> `InternalDrawable`
- `static getInstance()` -> `PremiumGradient`
- `getMainGradientPaint()` -> `Paint`
- `getPremiumLocakedPaint()` -> `Paint`
- `updateMainGradientMatrix(int x, int y, int width, int height, float xOffset, float yOffset)` -> `void`

## `org.telegram.ui.Components.Premium.PremiumGradient$InternalDrawable`
- `setColorFilter(ColorFilter colorFilter)` -> `void`
- `setColorFilter(int color, PorterDuff.Mode mode)` -> `void`

## `org.telegram.ui.Components.Premium.PremiumGradient$PremiumGradientTools`
- `getThemeColorByKey(int key)` -> `int`
- `gradientMatrix(Rect rect)` -> `void`
- `gradientMatrix(RectF rect)` -> `void`
- `gradientMatrix(int x, int y, int x1, int y1, float xOffset, float yOffset)` -> `void`
- `gradientMatrixLinear(float totalHeight, float offset)` -> `void`

## `org.telegram.ui.Components.Premium.PremiumLockIconView`
- `done()` -> `boolean`
- `getImageReceiver()` -> `ImageReceiver`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `play(int delay)` -> `void`
- `resetAnimation()` -> `void`
- `resetColor()` -> `void`
- `setAnimatedEmojiDrawable(AnimatedEmojiDrawable emojiDrawable)` -> `void`
- `setBlendWithColor(Integer color)` -> `void`
- `setColor(int color)` -> `void`
- `setImageReceiver(ImageReceiver imageReceiver)` -> `void`
- `setLocked(boolean locked)` -> `void`
- `setWaitingImage()` -> `void`

## `org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet`
- `afterCellCreated(int viewType, View view)` -> `void`
- `attachIconContainer(LinearLayout container)` -> `void`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `getAdditionItemViewType(int position)` -> `int`
- `getTitle()` -> `CharSequence`
- `isAdditionViewClickable(int viewType)` -> `boolean`
- `mainContainerDispatchDraw(Canvas canvas)` -> `void`
- `needDefaultPremiumBtn()` -> `boolean`
- `onAdditionItemClicked(View view)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onBindAdditionCell(View view, int pos)` -> `void`
- `onCreateAdditionCell(int viewType, Context context)` -> `View`
- `onCustomOpenAnimation()` -> `boolean`
- `onDetachedFromWindow()` -> `void`
- `onPreMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onViewCreated(FrameLayout containerView)` -> `void`
- `setAnimateConfetti(boolean animateConfetti)` -> `PremiumPreviewBottomSheet`
- `setAnimateConfettiWithStars(boolean animateConfettiWithStars)` -> `PremiumPreviewBottomSheet`
- `setOutboundGift(boolean outboundGift)` -> `PremiumPreviewBottomSheet`
- `setTitle(boolean animated)` -> `void`
- `show()` -> `void`
- `showDialog(Dialog dialog)` -> `boolean`
- `updateRows()` -> `void`

## `org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.Premium.PremiumTierCell`
- `bind(PremiumPreviewFragment.SubscriptionTier tier, boolean hasDivider)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getTier()` -> `PremiumPreviewFragment.SubscriptionTier`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked, boolean animate)` -> `void`
- `setCirclePaintProvider(GenericProvider<Void, Paint> circlePaintProvider)` -> `void`
- `setEnabled(boolean enabled)` -> `void`
- `setGlobalGradientView(PremiumTierCell globalGradientView)` -> `void`
- `setParentSize(int parentWidth, int parentHeight, float parentXOffset)` -> `void`
- `setParentXOffset(float parentXOffset)` -> `void`
- `setProgressDelegate(CheckBoxBase.ProgressDelegate delegate)` -> `void`
- `updateColors()` -> `void`
- `updateGradient()` -> `void`

## `org.telegram.ui.Components.Premium.SpeedLineParticles$Drawable`
- `init()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `resetPositions()` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.Premium.SpeedLineParticles$Drawable$Particle`
- `draw(Canvas canvas, int index, long time)` -> `void`
- `genPosition(long time, boolean reset)` -> `void`

## `org.telegram.ui.Components.Premium.StarParticlesView`
- `configure()` -> `void`
- `flingParticles(float sum)` -> `void`
- `getStarsRectWidth()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setClipWithGradient()` -> `void`
- `setPaused(boolean paused)` -> `void`

## `org.telegram.ui.Components.Premium.StarParticlesView$Drawable`
- `getPathColor(int i)` -> `int`
- `init()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onDraw(Canvas canvas, float alpha)` -> `void`
- `resetPositions()` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.Premium.StarParticlesView$Drawable$Particle`
- `draw(Canvas canvas, long time, float alpha)` -> `void`
- `genPosition(long time)` -> `void`
- `updatePoint()` -> `void`

## `org.telegram.ui.Components.Premium.VideoScreenPreview`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setOffset(float translationX)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.BoostCounterSpan`
- `static create(View parent, TextPaint paint, int count)` -> `Pair<SpannableString, BoostCounterSpan>`
- `draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float _x, int top, int _y, int bottom, @NonNull Paint paint)` -> `void`
- `getSize(@NonNull Paint paint, CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm)` -> `int`
- `getWidth()` -> `int`
- `setColor(int color)` -> `void`
- `setCount(int count, boolean animated)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.BoostCounterView`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setCount(int count, boolean animated)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.BoostDialogs`
- `static applyDialogStyle(AlertDialog dialog, boolean defaultMarginTop)` -> `void`
- `static getThreeDaysAfterToday()` -> `long`
- `static openGiveAwayStatusDialog(MessageObject messageObject, Browser.Progress progress, Context context, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static showAbout(boolean isChannel, String from, long msgDate, TLRPC.TL_payments_giveawayInfo giveawayInfo, TLRPC.TL_messageMediaGiveaway giveaway, Context context, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static showAboutEnd(boolean isChannel, String from, long msgDate, TLRPC.TL_payments_giveawayInfoResults giveawayInfo, TLRPC.TL_messageMediaGiveaway giveaway, Context context, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static showBulletin(FrameLayout container, Theme.ResourcesProvider resourcesProvider, final TLRPC.Chat chat, final boolean isGiveaway)` -> `void`
- `static showBulletin(final BaseFragment baseFragment, final TLRPC.Chat chat, final boolean isGiveaway)` -> `void`
- `static showBulletinAbout(MessageObject messageObject)` -> `void`
- `static showBulletinError(TLRPC.TL_error error)` -> `void`
- `static showDatePicker(Context context, long currentDate, final AlertsCreator.ScheduleDatePickerDelegate datePickerDelegate, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static showFloodWait(int time)` -> `void`
- `static showGiftLinkForwardedBulletin(long did)` -> `void`
- `static showMoreBoostsNeeded(long dialogId, BottomSheet bottomSheet)` -> `void`
- `static showPrivateChannelAlert(TLRPC.Chat chat, Context context, Theme.ResourcesProvider resourcesProvider, Runnable onCanceled, Runnable onAccepted)` -> `void`
- `static showStartGiveawayDialog(Runnable onStart)` -> `void`
- `static showToastError(Context context, TLRPC.TL_error error)` -> `void`
- `static showUnsavedChanges(int type, Context context, Theme.ResourcesProvider resourcesProvider, Runnable onApply, Runnable onDiscard)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.BoostPagerBottomSheet`
- `dismissInternal()` -> `void`
- `static getInstance()` -> `BoostPagerBottomSheet`
- `onBackPressed()` -> `void`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `static show(BaseFragment fragment, long dialogId, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static show(BaseFragment fragment, Theme.ResourcesProvider resourcesProvider, long dialogId, TL_stories.PrepaidGiveaway prepaidGiveaway)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.BoostRepository`
- `static applyBoost(long dialogId, List<Integer> slots, Utilities.Callback<TL_stories.TL_premium_myBoosts> onDone, Utilities.Callback<TLRPC.TL_error> onError)` -> `void`
- `static applyGiftCode(String slug, Utilities.Callback<Void> onDone, Utilities.Callback<TLRPC.TL_error> onError)` -> `void`
- `static boostsPerSentGift()` -> `int`
- `static filterGiftOptions(List<TLRPC.TL_premiumGiftCodeOption> list, int selected)` -> `List<TLRPC.TL_premiumGiftCodeOption>`
- `static filterGiftOptionsByBilling(List<TLRPC.TL_premiumGiftCodeOption> list)` -> `List<TLRPC.TL_premiumGiftCodeOption>`
- `static getCachedGiftOptions(int currentAccount)` -> `List<TLRPC.TL_premiumGiftCodeOption>`
- `static getGiveawayInfo(MessageObject messageObject, Utilities.Callback<TLRPC.payments_GiveawayInfo> onDone, Utilities.Callback<TLRPC.TL_error> onError)` -> `void`
- `static getMyBoosts(Utilities.Callback<TL_stories.TL_premium_myBoosts> onDone, Utilities.Callback<TLRPC.TL_error> onError)` -> `void`
- `static getMyChannels(long currentChatId)` -> `ArrayList<TLRPC.InputPeer>`
- `static giveawayAddPeersMax()` -> `long`
- `static giveawayBoostsPerPremium()` -> `int`
- `static giveawayCountriesMax()` -> `long`
- `static giveawayPeriodMax()` -> `long`
- `static invalidateGiftOptionsToCache(int currentAccount)` -> `void`
- `static payGiftCode(List<TLObject> users, TLRPC.TL_premiumGiftCodeOption option, TLRPC.Chat chat, TLRPC.TL_textWithEntities message, BaseFragment baseFragment, Utilities.Callback<Void> onSuccess, Utilities.Callback<TLRPC.TL_error> onError)` -> `void`
- `static payGiftCodeByGoogle(List<TLObject> users, TLRPC.TL_premiumGiftCodeOption option, TLRPC.Chat chat, TLRPC.TL_textWithEntities message, BaseFragment baseFragment, Utilities.Callback<Void> onSuccess, Utilities.Callback<TLRPC.TL_error> onError)` -> `void`
- `static payGiftCodeByInvoice(List<TLObject> users, TLRPC.TL_premiumGiftCodeOption option, TLRPC.Chat chat, TLRPC.TL_textWithEntities message, BaseFragment baseFragment, Utilities.Callback<Void> onSuccess, Utilities.Callback<TLRPC.TL_error> onError)` -> `void`
- `static prepareServerDate(long date)` -> `int`
- `static searchChats(long currentChatId, int guid, String query, int count, Utilities.Callback<List<TLRPC.InputPeer>> onDone)` -> `void`
- `static searchContacts(String query, boolean allowBots, Utilities.Callback<List<TLRPC.User>> onDone)` -> `int`
- `static searchContactsLocally(String query, boolean allowBots, Utilities.Callback<List<TLRPC.User>> onDone)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.DarkFragmentWrapper`
- `getParentActivity()` -> `Activity`
- `getResourceProvider()` -> `Theme.ResourcesProvider`
- `isLightStatusBar()` -> `boolean`
- `presentFragment(BaseFragment fragment)` -> `boolean`

## `org.telegram.ui.Components.Premium.boosts.DiscountSpan`
- `static applySpan(CharSequence str, int discount)` -> `CharSequence`
- `draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float _x, int top, int _y, int bottom, @NonNull Paint paint)` -> `void`
- `getSize(@NonNull Paint paint, CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm)` -> `int`
- `makeLayout()` -> `void`
- `setColor(int color)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.GradientButtonWithCounterView`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.ReassignBoostBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `getTitle()` -> `CharSequence`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onOpenAnimationEnd()` -> `void`
- `static show(BaseFragment fragment, TL_stories.TL_premium_myBoosts myBoosts, TLRPC.Chat currentChat)` -> `ReassignBoostBottomSheet`

## `org.telegram.ui.Components.Premium.boosts.ReassignBoostBottomSheet$AvatarHolderView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `setChat(TLRPC.Chat chat)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.ReassignBoostBottomSheet$BoostIconView`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.ReassignBoostBottomSheet$TopCell`
- `setData(TLRPC.Chat chat, BottomSheet bottomSheet)` -> `void`
- `showBoosts(List<TL_stories.TL_myBoost> selectedBoosts, TLRPC.Chat currentChat)` -> `void`
- `showChats(List<TLRPC.Chat> selectedChats, TLRPC.Chat currentChat)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `dismiss()` -> `void`
- `dismissInternal()` -> `void`
- `getTitle()` -> `CharSequence`
- `getTop()` -> `int`
- `static matchLocal(TLObject obj, String q)` -> `boolean`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onPreDraw(Canvas canvas, int top, float progressToFullView)` -> `void`
- `prepare(List<TLObject> selectedObjects, int type)` -> `void`
- `scrollToTop(boolean animate)` -> `void`
- `setOnCloseClick(Runnable onCloseClick)` -> `void`
- `setSelectedObjectsListener(SelectedObjectsListener selectedObjectsListener)` -> `void`
- `updateItems(boolean animated, boolean notify)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet$SelectedObjectsListener`
- `onShowToast(String text)` -> `default void`

## `org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `dismissInternal()` -> `void`
- `exceptUsers(long ...ids)` -> `UserSelectorBottomSheet`
- `exceptUsers(Collection<Long> ids)` -> `UserSelectorBottomSheet`
- `getLimit()` -> `int`
- `getTitle()` -> `CharSequence`
- `getType()` -> `int`
- `static handleIntent(Intent intent, Browser.Progress progress)` -> `boolean`
- `needChecks()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onPreDraw(Canvas canvas, int top, float progressToFullView)` -> `void`
- `static open()` -> `UserSelectorBottomSheet`
- `static open(long userId, BirthdayController.BirthdayState birthdayState)` -> `UserSelectorBottomSheet`
- `static open(int type, long userId, BirthdayController.BirthdayState birthdayState)` -> `UserSelectorBottomSheet`
- `openOptions(TLRPC.User user)` -> `View.OnClickListener`
- `scrollToTop(boolean animate)` -> `void`
- `setOnShareCallLinkListener(Runnable listener)` -> `UserSelectorBottomSheet`
- `setOnUserSelector(Utilities.Callback<Long> listener)` -> `void`
- `setOnUsersSelector(Utilities.Callback2<Boolean, HashSet<Long>> listener)` -> `UserSelectorBottomSheet`
- `setTitle(String title)` -> `void`
- `updateItems(boolean animated, boolean notify)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.adapters.BoostAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `notifyAdditionalPrizeItem(boolean checked)` -> `void`
- `notifyAllVisibleTextDividers()` -> `void`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `setItems(TLRPC.Chat currentChat, List<Item> items, RecyclerListView recyclerListView, SlideChooseView.Callback sliderCallback, ChatCell.ChatDeleteListener chatDeleteListener, EnterPrizeCell.AfterTextChangedListener afterTextChangedListener)` -> `void`
- `setPausedStars(boolean paused)` -> `void`
- `updateBoostCounter(int value)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.adapters.BoostAdapter$Item`
- `static asAddChannel()` -> `Item`
- `static asBoost(int subType, int count, Object user, int selectedSubType)` -> `Item`
- `static asChat(TLRPC.Chat chat, boolean removable, int count)` -> `Item`
- `static asDateEnd(long time)` -> `Item`
- `static asDivider()` -> `Item`
- `static asDivider(CharSequence text, boolean onlyTopDivider)` -> `Item`
- `static asDuration(Object code, int months, int count, long price, int selectedMonths, String currency, boolean needDivider)` -> `Item`
- `static asEnterPrize(int count)` -> `Item`
- `static asExpandOptions()` -> `Item`
- `static asHeader()` -> `Item`
- `static asHeader(boolean golden)` -> `Item`
- `static asOption(TL_stars.TL_starsGiveawayOption option, int index, long starsPerUser, boolean selected, boolean needDivider)` -> `Item`
- `static asParticipants(int subType, int selectedSubType, boolean needDivider, List<TLObject> countries)` -> `Item`
- `static asPeer(TLRPC.InputPeer peer, boolean removable, int count)` -> `Item`
- `static asSingleBoost(Object user)` -> `Item`
- `static asSlider(List<Integer> values, int selected)` -> `Item`
- `static asSubTitle(CharSequence text)` -> `Item`
- `static asSubTitleWithCounter(CharSequence text, int counter)` -> `Item`
- `static asSwitcher(CharSequence text, boolean isSelected, boolean needDivider, int subType)` -> `Item`
- `contentsEquals(AdapterWithDiffUtils.Item item)` -> `boolean`
- `static eq(List<Integer> a, List<Integer> b)` -> `boolean`
- `equals(Object o)` -> `boolean`

## `org.telegram.ui.Components.Premium.boosts.adapters.SelectorAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `getParticipantsCount(TLRPC.Chat chat)` -> `int`
- `notifyChangedLast()` -> `void`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder holder)` -> `void`
- `setCallButtonsVisible(boolean visible)` -> `void`
- `setData(List<Item> items, RecyclerListView listView)` -> `void`
- `setGreenSelector(boolean isGreenSelector)` -> `void`
- `setNeedChecks(boolean needChecks)` -> `void`
- `setNeedChecks2(boolean needChecks2)` -> `void`
- `setTopSectionClickListener(View.OnClickListener topSectionClickListener)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.adapters.SelectorAdapter$Item`
- `static asButton(int id, int resId, String text)` -> `Item`
- `static asChat(TLRPC.Chat chat, boolean checked)` -> `Item`
- `static asCountry(TLRPC.TL_help_country tlHelpCountry, boolean checked)` -> `Item`
- `static asCustom(View view)` -> `Item`
- `static asCustomUser(int id, Drawable icon, CharSequence title, CharSequence subtitle)` -> `Item`
- `static asLetter(String letter)` -> `Item`
- `static asNoUsers()` -> `Item`
- `static asPad(int padHeight)` -> `Item`
- `static asPeer(TLRPC.InputPeer peer, boolean checked)` -> `Item`
- `static asTopSection(CharSequence text)` -> `Item`
- `static asUser(TLRPC.User user, boolean checked)` -> `Item`
- `contentsEquals(AdapterWithDiffUtils.Item o)` -> `boolean`
- `equals(Object o)` -> `boolean`
- `withCall(View.OnClickListener onAudioCallListener, View.OnClickListener onVideoCallListener)` -> `Item`
- `withOptions(View.OnClickListener onClickListener)` -> `Item`
- `withRightText(String rightText, View.OnClickListener whenRightTextClicked)` -> `Item`

## `org.telegram.ui.Components.Premium.boosts.cells.ActionBtnCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `isLoading()` -> `boolean`
- `setActivateForFreeStyle()` -> `void`
- `setCloseStyle()` -> `void`
- `setCloseStyle(boolean needDivider)` -> `void`
- `setGiftPremiumStyle(int counter, boolean animated, boolean isEnabled)` -> `void`
- `setOkStyle(boolean isUsed)` -> `void`
- `setOnClickListener(@Nullable OnClickListener l)` -> `void`
- `setStartGiveAwayStyle(int counter, boolean animated)` -> `void`
- `updateCounter(int count)` -> `void`
- `updateLoading(boolean isLoading)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.AddChannelCell`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.BaseCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dividerPadding()` -> `int`
- `getFullHeight()` -> `int`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setDivider(boolean divider)` -> `void`
- `setSubtitle(CharSequence text)` -> `void`
- `updateLayouts()` -> `void`
- `withArrow(CharSequence text)` -> `CharSequence`

## `org.telegram.ui.Components.Premium.boosts.cells.BoostTypeCell`
- `getSelectedType()` -> `int`
- `needCheck()` -> `boolean`
- `setType(int type, int count, TLRPC.User singleUser, boolean isSelected)` -> `void`
- `updateLayouts()` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.BoostTypeSingleCell`
- `needCheck()` -> `boolean`
- `setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway)` -> `void`
- `updateLayouts()` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.ChatCell`
- `getChat()` -> `TLRPC.Chat`
- `needCheck()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChat(TLRPC.Chat chat, int boosts, boolean removable, int participants_count)` -> `void`
- `setChatDeleteListener(ChatDeleteListener chatDeleteListener)` -> `void`
- `setCounter(int count, int participants_count)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.DateEndCell`
- `getSelectedTime()` -> `long`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setDate(long time)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.DurationCell`
- `getGifCode()` -> `Object`
- `needCheck()` -> `boolean`
- `setDuration(Object code, int months, int count, long price, CharSequence currency, boolean needDivider, boolean selected)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.DurationWithDiscountCell`
- `getOption()` -> `TLRPC.TL_premiumGiftCodeOption`
- `needCheck()` -> `boolean`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setDuration(TLRPC.TL_premiumGiftCodeOption option, TLRPC.TL_premiumGiftCodeOption minOption, int usersCount, boolean needDivider, boolean selected)` -> `void`
- `updateLayouts()` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.EnterPrizeCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAfterTextChangedListener(AfterTextChangedListener afterTextChangedListener)` -> `void`
- `setCount(int count)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.HeaderCell`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setBoostViaGifsText(TLRPC.Chat currentChat)` -> `void`
- `setGiftLinkText()` -> `void`
- `setGiftLinkToUserText(long toUserId, Utilities.Callback<TLObject> onObjectClicked)` -> `void`
- `setPaused(boolean value)` -> `void`
- `setStars(boolean stars)` -> `void`
- `setUnclaimedText()` -> `void`
- `setUsedGiftLinkText()` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.LinkCell`
- `hideSlug(Runnable onHiddenLinkClicked)` -> `void`
- `setSlug(String slug)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.ParticipantsTypeCell`
- `getSelectedType()` -> `int`
- `needCheck()` -> `boolean`
- `setType(int type, boolean isSelected, boolean needDivider, List<TLRPC.TL_help_country> countries, TLRPC.Chat chat)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.SliderCell`
- `setCallBack(SlideChooseView.Callback callback)` -> `void`
- `setValues(List<Integer> values, int selected)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.StarGiveawayOptionCell`
- `getOption()` -> `TL_stars.TL_starsGiveawayOption`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setOption(TL_stars.TL_starsGiveawayOption option, int index, long per_user_stars, boolean selected, boolean needDivider)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.SubtitleWithCounterCell`
- `updateCounter(boolean animated, int count)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.SwitcherCell`
- `getType()` -> `int`
- `setData(CharSequence text, boolean checked, boolean divider, int type)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.TableCell`
- `setData(TLRPC.TL_payments_checkedGiftCode giftCode, Utilities.Callback<TLObject> onObjectClicked)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.TextInfoCell`
- `setBackground(boolean onlyTopDivider)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.msg.GiveawayMessageCell`
- `draw(Canvas canvas, int marginTop, int marginLeft, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `getMeasuredHeight()` -> `int`
- `getMeasuredWidth()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setButtonPressed(boolean pressed)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.msg.GiveawayResultsMessageCell`
- `draw(Canvas canvas, int marginTop, int marginLeft, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `getMeasuredHeight()` -> `int`
- `getMeasuredWidth()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setButtonPressed(boolean pressed)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorBtnCell`
- `dispatchDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorCountryCell`
- `dividerPadding()` -> `int`
- `getCountry()` -> `TLRPC.TL_help_country`
- `getFullHeight()` -> `int`
- `needCheck()` -> `boolean`
- `setCheckboxAlpha(float alpha, boolean animated)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setCountry(TLRPC.TL_help_country country, boolean divider)` -> `void`
- `updateLayouts()` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorCountryCell$SpaceDrawable`
- `draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, @NonNull Paint paint)` -> `void`
- `getSize(@NonNull Paint paint, CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm)` -> `int`

## `org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorHeaderCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getHeaderHeight()` -> `int`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setBackImage(int resId)` -> `void`
- `setCloseImageVisible(boolean visible)` -> `void`
- `setOnCloseClickListener(Runnable onCloseClickListener)` -> `void`
- `setText(CharSequence text)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorLetterCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setLetter(CharSequence letter)` -> `void`
- `setTextColor(int key)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorSearchCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `getContainerHeightAnimator(float newHeight)` -> `Animator`
- `getEditText()` -> `EditTextBoldCursor`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `scrollToBottom()` -> `void`
- `setContainerHeight(float value)` -> `void`
- `setHintText(String text, boolean animated)` -> `void`
- `setOnSearchTextChange(Utilities.Callback<String> listener)` -> `void`
- `setText(CharSequence text)` -> `void`
- `updateSpans(boolean animated, HashSet<Long> selectedIds, Runnable afterDelete, List<TLRPC.TL_help_country> countries)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorSearchCell$SpansContainer`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `updateSpans(ArrayList<GroupCreateSpan> toDelete, ArrayList<GroupCreateSpan> toAdd, boolean animated)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.statistics.CounterDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setText(String text)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.statistics.GiveawayCell`
- `getPrepaidGiveaway()` -> `TL_stories.PrepaidGiveaway`
- `onDraw(Canvas canvas)` -> `void`
- `setImage(TL_stories.PrepaidGiveaway prepaidGiveaway)` -> `void`

## `org.telegram.ui.Components.ProgressButton`
- `onDraw(Canvas canvas)` -> `void`
- `setBackgroundRoundRect(int backgroundColor, int pressedBackgroundColor)` -> `void`
- `setBackgroundRoundRect(int backgroundColor, int pressedBackgroundColor, float radius)` -> `void`
- `setDrawProgress(boolean drawProgress, boolean animated)` -> `void`
- `setProgressColor(int progressColor)` -> `void`

## `org.telegram.ui.Components.ProgressView`
- `draw(Canvas canvas)` -> `void`
- `setProgress(float progress)` -> `void`
- `setProgressColors(int innerColor, int outerColor)` -> `void`

## `org.telegram.ui.Components.ProximitySheet`
- `dismiss()` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `getCustomView()` -> `View`
- `getRadiusSet()` -> `boolean`
- `getValue()` -> `float`
- `onInterceptTouchEvent(MotionEvent event)` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `setRadiusSet()` -> `void`
- `show()` -> `void`
- `updateText(boolean move, boolean animated)` -> `void`

## `org.telegram.ui.Components.ProxyDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(ColorFilter cf)` -> `void`
- `setConnected(boolean enabled, boolean value, boolean animated)` -> `void`

## `org.telegram.ui.Components.PullForegroundDrawable`
- `colorize(boolean colorize)` -> `void`
- `destroyView()` -> `void`
- `doNotShow()` -> `void`
- `draw(Canvas canvas)` -> `void`
- `draw(Canvas canvas, boolean header)` -> `void`
- `drawOverScroll(Canvas canvas)` -> `void`
- `getBackgroundPaint()` -> `Paint`
- `static getMaxOverscroll()` -> `int`
- `getPullProgress()` -> `float`
- `getViewOffset()` -> `float`
- `resetText()` -> `void`
- `setCell(View view)` -> `void`
- `setColors(int background, int active)` -> `void`
- `setListView(RecyclerListView listView)` -> `void`
- `setPullProgress(float pullProgress)` -> `void`
- `setWillDraw(boolean b)` -> `void`
- `showHidden()` -> `void`
- `startOutAnimation()` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.PullForegroundDrawable$ArrowDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.QRCodeBottomSheet`
- `createQR(Context context, String key, Bitmap oldBitmap)` -> `Bitmap`
- `setCenterAnimation(int resId)` -> `void`
- `setCenterImage(int resId)` -> `void`
- `setCenterImage(Drawable drawable)` -> `void`
- `setCenterImage(Bitmap bitmap)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.QuoteCollapseButton`
- `draw(Canvas canvas, RectF bounds, float right, float bottom, int color, boolean collapsed, boolean visible)` -> `float`
- `height()` -> `int`
- `setPressed(boolean pressed)` -> `void`
- `verifyDrawable(Drawable who)` -> `boolean`
- `width()` -> `int`

## `org.telegram.ui.Components.QuoteHighlight`
- `done()` -> `boolean`
- `draw(Canvas canvas, float textX, float textY, android.graphics.Rect bounds, float alpha)` -> `void`
- `getT()` -> `float`

## `org.telegram.ui.Components.QuoteSpan`
- `drawLeadingMargin(Canvas c, Paint p, int x, int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout layout)` -> `void`
- `getLeadingMargin(boolean first)` -> `int`
- `getNewlineHack()` -> `SpannableString`
- `static mergeQuotes(SpannableStringBuilder text, ArrayList<TLRPC.MessageEntity> entities)` -> `void`
- `static normalizeQuotes(Editable text)` -> `void`
- `static normalizeQuotes(Spannable text)` -> `void`
- `static onTouch(MotionEvent ev, int scrollY, ArrayList<Block> blocks, Runnable updateQuotes)` -> `boolean`
- `setColor(int color)` -> `void`
- `static stripNewlineHacks(CharSequence cs)` -> `CharSequence`
- `static updateQuoteBlocks(View view, Layout layout, ArrayList<Block> blocks)` -> `ArrayList<Block>`
- `static updateQuoteBlocks(View view, Layout layout, ArrayList<Block> blocks, boolean[] updateLayout)` -> `ArrayList<Block>`
- `static updateQuoteBlocksSpanned(Layout layout, ArrayList<Block> blocks)` -> `ArrayList<Block>`

## `org.telegram.ui.Components.QuoteSpan$Block`
- `buttonWidth()` -> `int`
- `draw(Canvas canvas, float offsetY, int maxWidth, int color, float alpha, TextPaint paint)` -> `void`

## `org.telegram.ui.Components.QuoteSpan$ExpandDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setState(boolean expand)` -> `void`

## `org.telegram.ui.Components.QuoteSpan$QuoteButtonNewLineSpan`
- `updateDrawState(TextPaint tp)` -> `void`

## `org.telegram.ui.Components.QuoteSpan$QuoteCollapsedPart`
- `updateDrawState(TextPaint tp)` -> `void`

## `org.telegram.ui.Components.QuoteSpan$QuoteStyleSpan`
- `chooseHeight(CharSequence text, int start, int end, int spanstartv, int lineHeight, Paint.FontMetricsInt fm)` -> `void`
- `updateDrawState(TextPaint tp)` -> `void`
- `updateMeasureState(@NonNull TextPaint tp)` -> `void`

## `org.telegram.ui.Components.RLottieDiceDrawable`
- `afterLoadFrameImpl()` -> `void`
- `beforeLoadFrameImpl()` -> `int`
- `decodeFrameFinishedInternal()` -> `void`
- `ignoreScheduleNextGetFrame()` -> `boolean`
- `isDiceRevealed()` -> `boolean`
- `isHeavyDrawable()` -> `boolean`
- `recycle(boolean uiThread)` -> `void`
- `recycleNativePtr(boolean uiThread)` -> `void`
- `setBaseDice(File path)` -> `boolean`
- `setDiceNumber(File path, boolean instant)` -> `boolean`

## `org.telegram.ui.Components.RLottieDrawable`
- `afterLoadFrameImpl()` -> `void`
- `beforeLoadFrameImpl()` -> `int`
- `beginApplyLayerColors()` -> `void`
- `bothRenderingBitmapsAreNull()` -> `boolean`
- `commitApplyLayerColors()` -> `void`
- `static createCacheGenQueue()` -> `void`
- `decodeFrameFinishedInternal()` -> `void`
- `draw(Canvas canvas)` -> `void`
- `draw(Canvas canvas, Paint paint)` -> `void`
- `drawInBackground(Canvas canvas, float x, float y, float w, float h, int alpha, ColorFilter colorFilter, int threadIndex)` -> `void`
- `drawInternal(Canvas canvas, Paint overridePaint, boolean drawInBackground, long time, int threadIndex)` -> `void`
- `estimateSizeInCache()` -> `int`
- `finalize()` -> `void`
- `getAnimatedBitmap()` -> `Bitmap`
- `getCurrentFrame()` -> `int`
- `getCustomEndFrame()` -> `int`
- `getDuration()` -> `long`
- `getFramesCount()` -> `int`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getMinimumHeight()` -> `int`
- `getMinimumWidth()` -> `int`
- `getNextFrame(Bitmap bitmap)` -> `int`
- `getOpacity()` -> `int`
- `getProgress()` -> `float`
- `ignoreScheduleNextGetFrame()` -> `boolean`
- `invalidateInternal()` -> `void`
- `isGeneratingCache()` -> `boolean`
- `isHeavyDrawable()` -> `boolean`
- `isLastFrame()` -> `boolean`
- `isRunning()` -> `boolean`
- `multiplySpeed(float multiplier)` -> `void`
- `onBoundsChange(Rect bounds)` -> `void`
- `prepareForGenerateCache()` -> `void`
- `recycle(boolean uiThread)` -> `void`
- `recycleNativePtr(boolean uiThread)` -> `void`
- `recycleResources()` -> `void`
- `releaseForGenerateCache()` -> `void`
- `replaceColors(int[] colors)` -> `void`
- `resetVibrationAfterRestart(boolean value)` -> `void`
- `restart()` -> `boolean`
- `restart(boolean force)` -> `boolean`
- `scheduleNextGetFrame()` -> `boolean`
- `setAllowDecodeSingleFrame(boolean value)` -> `void`
- `setAllowDrawFramesWhileCacheGenerating(boolean allow)` -> `void`
- `setAllowVibration(boolean allow)` -> `void`
- `setAutoRepeat(int value)` -> `void`
- `setAutoRepeatCount(int count)` -> `void`
- `setAutoRepeatTimeout(long timeout)` -> `void`
- `setCurrentFrame(int frame)` -> `void`
- `setCurrentFrame(int frame, boolean async)` -> `void`
- `setCurrentFrame(int frame, boolean async, boolean resetFrame)` -> `void`
- `setCustomEndFrame(int frame)` -> `boolean`
- `setGeneratingFrame(int i)` -> `void`
- `setInvalidateOnProgressSet(boolean value)` -> `void`
- `setLayerColor(String layerName, int color)` -> `void`
- `setMasterParent(View parent)` -> `void`
- `setOnAnimationEndListener(Runnable onAnimationEndListener)` -> `void`
- `setOnFinishCallback(Runnable callback, int frame)` -> `void`
- `setPlayInDirectionOfCustomEndFrame(boolean value)` -> `void`
- `setProgress(float progress)` -> `void`
- `setProgress(float progress, boolean async)` -> `void`
- `setProgressMs(long ms)` -> `void`
- `setVibrationPattern(HashMap<Integer, Integer> pattern)` -> `void`
- `start()` -> `void`
- `stop()` -> `void`
- `updateCurrentFrame(long time, boolean updateInBackground)` -> `void`

## `org.telegram.ui.Components.RLottieImageView`
- `clearAnimationDrawable()` -> `void`
- `clearLayerColors()` -> `void`
- `getAnimatedDrawable()` -> `RLottieDrawable`
- `getImageReceiver()` -> `ImageReceiver`
- `isPlaying()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLoaded()` -> `void`
- `playAnimation()` -> `void`
- `replaceColors(int[] colors)` -> `void`
- `setAnimation(int resId, int w, int h)` -> `void`
- `setAnimation(int resId, int w, int h, int[] colorReplacement)` -> `void`
- `setAnimation(RLottieDrawable lottieDrawable)` -> `void`
- `setAnimation(TLRPC.Document document, int w, int h)` -> `void`
- `setAutoRepeat(boolean repeat)` -> `void`
- `setImageResource(int resId)` -> `void`
- `setLayerColor(String layer, int color)` -> `void`
- `setLayerNum(Integer layerNum)` -> `void`
- `setOnAnimationEndListener(Runnable r)` -> `void`
- `setOnlyLastFrame(boolean onlyLastFrame)` -> `void`
- `setProgress(float progress)` -> `void`
- `setReverse()` -> `void`
- `stopAnimation()` -> `void`

## `org.telegram.ui.Components.RLottieNative`
- `static createFromFile(String path)` -> `RLottieNative`
- `static createFromRawJson(String json)` -> `RLottieNative`
- `static createFromRawJson(String json, @Nullable int[] metaOut)` -> `RLottieNative`
- `finalize()` -> `void`
- `static getDuration(String src, String json)` -> `double`
- `getFps()` -> `int`
- `getFrame(int frame, Bitmap bitmap, boolean clear)` -> `int`
- `getFrameCount()` -> `int`
- `static getFramesCount(String src, String json)` -> `long`
- `recycle()` -> `void`

## `org.telegram.ui.Components.RadialProgress`
- `copyParams(RadialProgress radialProgressUpload)` -> `void`
- `disableUpdate(boolean disableUpdate)` -> `void`
- `draw(Canvas canvas)` -> `void`
- `getAlpha()` -> `float`
- `getAnimatedProgress()` -> `float`
- `getProgressRect()` -> `RectF`
- `setAlphaForMiniPrevious(boolean value)` -> `void`
- `setAlphaForPrevious(boolean value)` -> `void`
- `setBackground(Drawable drawable, boolean withRound, boolean animated)` -> `void`
- `setCheckBackground(boolean withRound, boolean animated)` -> `void`
- `setDiff(int value)` -> `void`
- `setHideCurrentDrawable(boolean value)` -> `void`
- `setMiniBackground(Drawable drawable, boolean withRound, boolean animated)` -> `void`
- `setMiniProgressBackgroundColor(int color)` -> `void`
- `setOverrideAlpha(float alpha)` -> `void`
- `setPaint(Paint paint)` -> `void`
- `setProgress(float value, boolean animated)` -> `void`
- `setProgressColor(int color)` -> `void`
- `setProgressRect(int left, int top, int right, int bottom)` -> `void`
- `setRotationTime(float rotationSpeed)` -> `void`
- `setRoundRectProgress(boolean roundRectProgress)` -> `void`
- `setStrokeWidth(int width)` -> `void`
- `swapBackground(Drawable drawable)` -> `boolean`
- `swapMiniBackground(Drawable drawable)` -> `boolean`

## `org.telegram.ui.Components.RadialProgress$CheckDrawable`
- `draw(Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `resetProgress(boolean animated)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(ColorFilter cf)` -> `void`
- `updateAnimation(long dt)` -> `boolean`

## `org.telegram.ui.Components.RadialProgress2`
- `draw(Canvas canvas)` -> `void`
- `getCircleColorKey()` -> `int`
- `getIcon()` -> `int`
- `getMiniIcon()` -> `int`
- `getOverrideAlpha()` -> `float`
- `getProgress()` -> `float`
- `getProgressRect()` -> `RectF`
- `getRadius()` -> `int`
- `getTransitionProgress()` -> `float`
- `getWholeAlpha()` -> `float`
- `initMiniIcons()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setAsMini()` -> `void`
- `setBackgroundDrawable(MessageDrawable drawable)` -> `void`
- `setBackgroundGradientDrawable(LinearGradient drawable)` -> `void`
- `setBackgroundStroke(int value)` -> `void`
- `setCircleCrossfadeColor(int color, float progress, float checkProgress)` -> `void`
- `setCircleRadius(int value)` -> `void`
- `setColorKeys(int circle, int circlePressed, int icon, int iconPressed)` -> `void`
- `setColors(int circle, int circlePressed, int icon, int iconPressed)` -> `void`
- `setDrawBackground(boolean value)` -> `void`
- `setIcon(int icon, boolean ifSame, boolean animated)` -> `void`
- `setImageOverlay(TLRPC.PhotoSize image, TLRPC.Document document, Object parentObject)` -> `void`
- `setImageOverlay(TLRPC.PhotoSize image, TLRPC.PhotoSize thumb, TLRPC.Document document, Object parentObject)` -> `void`
- `setImageOverlay(String url)` -> `void`
- `setImageOverlay(Bitmap bitmap)` -> `void`
- `setMaxIconSize(int maxSize)` -> `void`
- `setMiniIcon(int icon, boolean ifSame, boolean animated)` -> `void`
- `setMiniIconScale(float scale)` -> `void`
- `setMiniProgressBackgroundColor(int color)` -> `void`
- `setOverlayImageAlpha(float overlayImageAlpha)` -> `void`
- `setOverrideAlpha(float alpha)` -> `void`
- `setParent(View parent)` -> `void`
- `setPressed(boolean value, boolean mini)` -> `void`
- `setProgress(float value, boolean animated)` -> `void`
- `setProgressColor(int color)` -> `void`
- `setProgressRect(int left, int top, int right, int bottom)` -> `void`
- `setProgressRect(float left, float top, float right, float bottom)` -> `void`
- `setResourcesProvider(Theme.ResourcesProvider resourcesProvider)` -> `void`
- `swapIcon(int icon)` -> `boolean`

## `org.telegram.ui.Components.RadialProgressView`
- `draw(Canvas canvas, float cx, float cy)` -> `void`
- `isCircle()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `setAlpha(float alpha)` -> `void`
- `setNoProgress(boolean value)` -> `void`
- `setProgress(float value)` -> `void`
- `setProgressColor(int color)` -> `void`
- `setSize(int value)` -> `void`
- `setStrokeWidth(float value)` -> `void`
- `setUseSelfAlpha(boolean value)` -> `void`
- `sync(RadialProgressView from)` -> `void`
- `toCircle(boolean toCircle, boolean animated)` -> `void`

## `org.telegram.ui.Components.RadioButton`
- `getColor()` -> `int`
- `getProgress()` -> `float`
- `isChecked()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `setBackgroundColor(int color1)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setCheckedColor(int color2)` -> `void`
- `setColor(int color1, int color2)` -> `void`
- `setIcon(Drawable drawable)` -> `void`
- `setProgress(float value)` -> `void`
- `setSize(int value)` -> `void`

## `org.telegram.ui.Components.ReactedHeaderView`
- `getSeenUsers()` -> `List<UserSeen>`
- `onAttachedToWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setSeenCallback(Consumer<List<UserSeen>> seenCallback)` -> `void`

## `org.telegram.ui.Components.ReactedUsersListView`
- `onAttachedToWindow()` -> `void`
- `setOnCustomEmojiSelectedListener(OnCustomEmojiSelectedListener onCustomEmojiSelectedListener)` -> `ReactedUsersListView`
- `setOnHeightChangedListener(OnHeightChangedListener onHeightChangedListener)` -> `ReactedUsersListView`
- `setOnProfileLongSelectedListener(OnProfileSelectedListener onProfileSelectedListener)` -> `ReactedUsersListView`
- `setOnProfileSelectedListener(OnProfileSelectedListener onProfileSelectedListener)` -> `ReactedUsersListView`
- `setPredictiveCount(int predictiveCount)` -> `void`
- `setSeenUsers(List<ReactedHeaderView.UserSeen> users)` -> `ReactedUsersListView`

## `org.telegram.ui.Components.ReactedUsersListView$ContainerLinerLayout`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Components.RecordStatusDrawable`
- `draw(Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(ColorFilter cf)` -> `void`
- `setIsChat(boolean value)` -> `void`
- `start()` -> `void`
- `stop()` -> `void`

## `org.telegram.ui.Components.RecyclerAnimationScrollHelper`
- `getScrollDirection()` -> `int`
- `scrollToPosition(int position, int offset)` -> `void`
- `scrollToPosition(int position, int offset, boolean bottom)` -> `void`
- `scrollToPosition(int position, int offset, final boolean bottom, boolean smooth)` -> `void`
- `scrollToPosition(int position, int offset, final boolean bottom, boolean smooth, boolean waitForAnimations)` -> `void`
- `setAnimationCallback(AnimationCallback animationCallback)` -> `void`
- `setScrollDirection(int scrollDirection)` -> `void`
- `setScrollListener(ScrollListener listener)` -> `void`

## `org.telegram.ui.Components.RecyclerAnimationScrollHelper$AnimatableAdapter`
- `notifyDataSetChanged()` -> `void`
- `notifyItemChanged(int position)` -> `void`
- `notifyItemInserted(int position)` -> `void`
- `notifyItemRangeChanged(int positionStart, int itemCount)` -> `void`
- `notifyItemRangeInserted(int positionStart, int itemCount)` -> `void`
- `notifyItemRangeRemoved(int positionStart, int itemCount)` -> `void`
- `notifyItemRemoved(int position)` -> `void`
- `onAnimationEnd()` -> `void`
- `onAnimationStart()` -> `void`

## `org.telegram.ui.Components.RecyclerItemsEnterAnimator`
- `dispatchDraw()` -> `void`
- `getProgressView()` -> `View`
- `onDetached()` -> `void`
- `showItemsAnimated(int from)` -> `void`

## `org.telegram.ui.Components.RecyclerListView`
- `addEdgeEffectListener(EdgeEffectTrackerFactory.OnEdgeEffectListener listener)` -> `void`
- `allowSelectChildAtPosition(float x, float y)` -> `boolean`
- `allowSelectChildAtPosition(View child)` -> `boolean`
- `animate()` -> `ViewPropertyAnimator`
- `static bottom(View child)` -> `float`
- `capture(Canvas canvas, RectF position)` -> `void`
- `captureCalculateHash(IBlur3Hash builder, RectF position)` -> `void`
- `captureChildren(Canvas canvas, RectF position, long drawingTime)` -> `void`
- `clickItem(View item, int position)` -> `void`
- `disableSections()` -> `void`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow, int type)` -> `boolean`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `static drawBackgroundRect(Canvas canvas, RectF rect, float topRadius, float bottomRadius, float alpha, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `drawBackgroundRect(Canvas canvas, RectF rect, float topRadius, float bottomRadius, float alpha)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `drawItemBackground(Canvas canvas, int adapterPosition, int color)` -> `void`
- `drawItemBackground(Canvas canvas, int adapterPosition, int height, int color)` -> `void`
- `drawSectionBackground(Canvas canvas, int fromAdapterPosition, int toAdapterPosition, int color)` -> `void`
- `drawSectionBackground(Canvas canvas, int fromAdapterPosition, int toAdapterPosition, int color, int topMargin, int bottomMargin)` -> `void`
- `drawSectionsBackgrounds(Canvas canvas)` -> `void`
- `drawableStateChanged()` -> `void`
- `emptyViewIsVisible()` -> `boolean`
- `emptyViewUpdated(boolean shown, boolean animated)` -> `void`
- `findChildViewUnder(float x, float y)` -> `View`
- `findViewByPosition(int position)` -> `View`
- `getClipBackground(View child)` -> `Drawable`
- `getClipBackground(View child, boolean forceRound)` -> `Drawable`
- `getEdgeEffectDistance(@EdgeEffectFactory.EdgeDirection int direction)` -> `float`
- `getEmptyView()` -> `View`
- `getFastScroll()` -> `FastScroll`
- `getHeaders()` -> `ArrayList<View>`
- `getHeadersCache()` -> `ArrayList<View>`
- `getOnItemClickListener()` -> `OnItemClickListener`
- `getOnScrollListener()` -> `OnScrollListener`
- `getPinnedHeader()` -> `View`
- `getPressedChildView()` -> `View`
- `getResourceDeclareStyleableIntArray(String packageName, String name)` -> `int[]`
- `getSelectorColor(int position)` -> `Integer`
- `getSelectorDrawable()` -> `Drawable`
- `getSelectorRect()` -> `Rect`
- `getThemedColor(int key)` -> `int`
- `getThemedDrawable(String key)` -> `Drawable`
- `getThemedPaint(String paintKey)` -> `Paint`
- `getTouchParent()` -> `ViewParent`
- `hide()` -> `void`
- `hideSelector(boolean animated)` -> `void`
- `highlightRow(RecyclerListView.IntReturnCallback callback)` -> `void`
- `highlightRow(RecyclerListView.IntReturnCallback callback, int removeAfter)` -> `void`
- `invalidateViews()` -> `void`
- `isFastScrollAnimationRunning()` -> `boolean`
- `isInsideForcedSection(int position)` -> `boolean`
- `isMultiselect()` -> `boolean`
- `jumpDrawablesToCurrentState()` -> `void`
- `longClickItem(View item, int position)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onChildAttachedToWindow(View child)` -> `void`
- `onChildPressed(View child, float x, float y, boolean pressed)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onInterceptTouchEvent(MotionEvent e)` -> `boolean`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthSpec, int heightSpec)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `onTouchEvent(MotionEvent e)` -> `boolean`
- `relayoutPinnedHeader()` -> `void`
- `removeEdgeEffectListener(EdgeEffectTrackerFactory.OnEdgeEffectListener listener)` -> `void`
- `setAccessibilityEnabled(boolean accessibilityEnabled)` -> `void`
- `setAdapter(Adapter adapter)` -> `void`
- `setAdaptiveOverScroll()` -> `void`
- `setAllowItemsInteractionDuringAnimation(boolean value)` -> `void`
- `setAllowStopHeaveOperations(boolean allowStopHeaveOperations)` -> `void`
- `setAnimateEmptyView(boolean animate, int emptyViewAnimationType)` -> `void`
- `setCaptureSectionsDecoratorAllowed(boolean allowed)` -> `void`
- `setDisableHighlightState(boolean value)` -> `void`
- `setDisallowInterceptTouchEvents(boolean value)` -> `void`
- `setDrawSelection(boolean drawSelection)` -> `void`
- `setDrawSelectorBehind(boolean value)` -> `void`
- `setEmptyView(View view)` -> `void`
- `setFastScrollEnabled(int type)` -> `void`
- `setFastScrollVisible(boolean value)` -> `void`
- `setHideIfEmpty(boolean value)` -> `void`
- `setInstantClick(boolean value)` -> `void`
- `setItemAnimator(@Nullable ItemAnimator animator)` -> `void`
- `setItemSelectorColorProvider(GenericProvider<Integer, Integer> getSelectorColor)` -> `void`
- `setItemsEnterAnimator(RecyclerItemsEnterAnimator itemsEnterAnimator)` -> `void`
- `setListSelectorColor(Integer color)` -> `void`
- `setOnInterceptTouchListener(OnInterceptTouchListener listener)` -> `void`
- `setOnItemClickListener(OnItemClickListener listener)` -> `void`
- `setOnItemClickListener(OnItemClickListenerExtended listener)` -> `void`
- `setOnItemLongClickListener(OnItemLongClickListener listener)` -> `void`
- `setOnItemLongClickListener(OnItemLongClickListener listener, long duration)` -> `void`
- `setOnItemLongClickListener(OnItemLongClickListenerExtended listener)` -> `void`
- `setOnItemLongClickListener(OnItemLongClickListenerExtended listener, long duration)` -> `void`
- `setOnScrollListener(OnScrollListener listener)` -> `void`
- `setPadding(int left, int top, int right, int bottom, boolean doNotRequestLayout)` -> `void`
- `setPaddingWithoutRequestLayout(int left, int top, int right, int bottom)` -> `void`
- `setPinnedHeaderShadowDrawable(Drawable drawable)` -> `void`
- `setPinnedSectionOffsetY(int offset)` -> `void`
- `setResetSelectorOnChanged(boolean value)` -> `void`
- `setScrollEnabled(boolean value)` -> `void`
- `setSections()` -> `void`
- `setSections(boolean topPadding)` -> `void`
- `setSections(int padding, float roundRadius, boolean topPadding)` -> `void`
- `setSectionsType(@SectionsType int type)` -> `void`
- `setSelectorDrawableColor(int color)` -> `void`
- `setSelectorRadius(int radius)` -> `void`
- `setSelectorTransformer(Consumer<Canvas> transformer)` -> `void`
- `setSelectorType(int type)` -> `void`
- `setSkipDrawSection(boolean skipDrawSection)` -> `void`
- `setTopBottomSelectorRadius(int radius)` -> `void`
- `setTranslateSelector(boolean value)` -> `void`
- `setTranslateSelectorPosition(int position)` -> `void`
- `setTranslationY(float translationY)` -> `void`
- `setVerticalScrollBarEnabled(boolean verticalScrollBarEnabled)` -> `void`
- `setVisibility(int visibility)` -> `void`
- `shouldClipChildToSection(View child)` -> `boolean`
- `show()` -> `void`
- `startMultiselect(int positionFrom, boolean useRelativePositions, onMultiSelectionChanged multiSelectionListener)` -> `void`
- `stopScroll()` -> `void`
- `static top(View child)` -> `float`
- `updateEmptyViewAnimated()` -> `boolean`
- `updateFastScrollColors()` -> `void`
- `updateSelector()` -> `void`
- `verifyDrawable(Drawable drawable)` -> `boolean`

## `org.telegram.ui.Components.RecyclerListView$FastScroll`
- `fillDrawablesRect(RectF rect)` -> `boolean`
- `getAlpha()` -> `float`
- `getProgress()` -> `float`
- `getScrollBarY()` -> `int`
- `isPressed()` -> `boolean`
- `layout(int l, int t, int r, int b)` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setAlpha(float alpha)` -> `void`
- `setIsVisible(boolean visible)` -> `void`
- `setProgress(float value)` -> `void`
- `setVisibilityAlpha(float v)` -> `void`
- `showFloatingDate()` -> `void`

## `org.telegram.ui.Components.RecyclerListView$FastScrollAdapter`
- `fastScrollIsVisible(RecyclerListView listView)` -> `boolean`
- `getScrollProgress(RecyclerListView listView)` -> `float`
- `getTotalItemsCount()` -> `int`
- `onFastScrollSingleTap()` -> `void`
- `onFinishFastScroll(RecyclerListView listView)` -> `void`
- `onStartFastScroll()` -> `void`

## `org.telegram.ui.Components.RecyclerListView$FoucsableOnTouchListener`
- `onTouch(View v, MotionEvent event)` -> `boolean`

## `org.telegram.ui.Components.RecyclerListView$ListSectionsDecoration`
- `capture(Canvas canvas, RectF position)` -> `void`
- `onDraw(@NonNull Canvas c, @NonNull RecyclerView parent, @NonNull State state)` -> `void`

## `org.telegram.ui.Components.RecyclerListView$OnItemClickListenerExtended`
- `onDoubleTap(View view, int position, float x, float y)` -> `default void`

## `org.telegram.ui.Components.RecyclerListView$OnItemLongClickListenerExtended`
- `onLongClickRelease()` -> `default void`
- `onMove(float dx, float dy)` -> `default void`

## `org.telegram.ui.Components.RecyclerListView$RecyclerListViewItemClickListener`
- `onInterceptTouchEvent(RecyclerView view, MotionEvent event)` -> `boolean`
- `onRequestDisallowInterceptTouchEvent(boolean disallowIntercept)` -> `void`
- `onTouchEvent(RecyclerView view, MotionEvent event)` -> `void`

## `org.telegram.ui.Components.RecyclerListView$SectionsAdapter`
- `cleanupCache()` -> `void`
- `getHash(int section, int position)` -> `int`
- `getItem(int position)` -> `Object`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `getPositionInSectionForPosition(int position)` -> `int`
- `getSectionForPosition(int position)` -> `int`
- `notifyDataSetChanged()` -> `void`
- `notifySectionsChanged()` -> `void`
- `onBindViewHolder(ViewHolder holder, int position)` -> `void`
- `update(boolean diff)` -> `void`
- `updateHashes()` -> `void`

## `org.telegram.ui.Components.RecyclerListView$SelectionAdapter`
- `getSelectionBottomPadding(View view)` -> `int`

## `org.telegram.ui.Components.RecyclerViewItemRangeSelector`
- `onInterceptTouchEvent(RecyclerView rv, MotionEvent e)` -> `boolean`
- `onRequestDisallowInterceptTouchEvent(boolean disallowIntercept)` -> `void`
- `onTouchEvent(RecyclerView rv, MotionEvent e)` -> `void`
- `setIsActive(View view, boolean active, int selection, boolean select)` -> `boolean`

## `org.telegram.ui.Components.ReorderingBulletinLayout`
- `onEnterTransitionEnd()` -> `void`
- `onExitTransitionEnd()` -> `void`

## `org.telegram.ui.Components.ReorderingHintDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `onBoundsChange(Rect bounds)` -> `void`
- `resetAnimation()` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `startAnimation()` -> `void`

## `org.telegram.ui.Components.ReorderingHintDrawable$RectDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.ReplaceableIconDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIcon()` -> `Drawable`
- `getOpacity()` -> `int`
- `invalidateSelf()` -> `void`
- `onAnimationCancel(Animator animation)` -> `void`
- `onAnimationEnd(Animator animation)` -> `void`
- `onAnimationRepeat(Animator animation)` -> `void`
- `onAnimationStart(Animator animation)` -> `void`
- `onBoundsChange(Rect bounds)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setIcon(@DrawableRes int resId, boolean animated)` -> `void`
- `setIcon(Drawable drawable, boolean animated)` -> `void`

## `org.telegram.ui.Components.ReplyMessageLine`
- `drawBackground(Canvas canvas, RectF rect, float leftRad, float rightRad, float bottomRad, float alpha)` -> `void`
- `drawBackground(Canvas canvas, RectF rect, float leftRad, float rightRad, float bottomRad, float alpha, boolean hasQuote, boolean emojiOnly)` -> `void`
- `drawBackground(Canvas canvas, RectF rect, float alpha)` -> `void`
- `drawBackground(Canvas canvas, RectF rect, float alpha, boolean hasQuote, boolean emojiOnly)` -> `void`
- `drawLine(Canvas canvas, RectF rect)` -> `void`
- `drawLine(Canvas canvas, RectF rect, float alpha)` -> `void`
- `drawLoadingBackground(Canvas canvas, RectF rect, float leftRad, float rightRad, float bottomRad, float alpha)` -> `void`
- `getBackgroundColor()` -> `int`
- `getColor()` -> `int`
- `offsetEmoji(float ox, float oy)` -> `ReplyMessageLine`
- `resetAnimation()` -> `void`
- `setBackgroundColor(int backgroundColor)` -> `void`
- `setEmojiAlpha(float emojiAlpha)` -> `void`
- `setFactCheck(Theme.ResourcesProvider resourcesProvider)` -> `int`
- `setLoading(boolean loading)` -> `void`
- `setSimpleColor(int color, boolean dark)` -> `void`

## `org.telegram.ui.Components.ReportAlert`
- `onSend(int type, String message)` -> `void`

## `org.telegram.ui.Components.ReportAlert$BottomSheetCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setText(CharSequence text)` -> `void`

## `org.telegram.ui.Components.RoundStatusDrawable`
- `draw(Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(ColorFilter cf)` -> `void`
- `setIsChat(boolean value)` -> `void`
- `start()` -> `void`
- `stop()` -> `void`

## `org.telegram.ui.Components.RoundVideoPlayingDrawable`
- `draw(Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(ColorFilter cf)` -> `void`
- `setResourcesProvider(Theme.ResourcesProvider resourcesProvider)` -> `void`
- `start()` -> `void`
- `stop()` -> `void`

## `org.telegram.ui.Components.RoundVideoProgressView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getPaint()` -> `Paint`
- `setProgress(float progress)` -> `void`

## `org.telegram.ui.Components.ScaleStateListAnimator`
- `static apply(View view)` -> `void`
- `static apply(View view, float scale, float tension)` -> `void`
- `static reset(View view)` -> `void`

## `org.telegram.ui.Components.ScamDrawable`
- `draw(Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.ScrimOptions`
- `dismiss()` -> `void`
- `dismissFast()` -> `void`
- `getContainerView()` -> `FrameLayout`
- `getWindowView()` -> `FrameLayout`
- `isShowing()` -> `boolean`
- `layout()` -> `void`
- `static makeGlobalBlurBitmaps(Utilities.Callback2<Bitmap, Bitmap> bitmaps)` -> `void`
- `static makeGlobalBlurBitmaps(View cutToContainer, Utilities.Callback2<Bitmap, Bitmap> bitmaps)` -> `void`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `setItemOptions(ItemOptions options)` -> `void`
- `setOptionsAtCenter()` -> `void`
- `setScrim(ChatMessageCell cell)` -> `void`
- `setScrim(ChatMessageCell cell, CharacterStyle link, CharSequence replaceText)` -> `void`
- `setScrim(ChatMessageCell cell, CharacterStyle link, CharSequence replaceText, boolean explanation)` -> `void`
- `setScrimDrawable(Drawable drawable, int width, int height)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.Components.ScrollSlidingTabStrip`
- `beginUpdate(boolean animated)` -> `void`
- `commitUpdate()` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawOverlays(Canvas canvas)` -> `void`
- `expandStickers(float x, boolean expanded)` -> `void`
- `getCurrentPosition()` -> `int`
- `getExpandedOffset()` -> `float`
- `getType()` -> `Type`
- `invalidateOverlays()` -> `void`
- `invalidateTabs()` -> `void`
- `isDragging()` -> `boolean`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onPageScrolled(int position, int first)` -> `void`
- `onScrollChanged(int l, int t, int oldl, int oldt)` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `selectTab(int num)` -> `void`
- `setCurrentPosition(int currentPosition)` -> `void`
- `setDelegate(ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate)` -> `void`
- `setDragEnabled(boolean enabled)` -> `void`
- `setImageReceiversLayerNum(int playingImages)` -> `void`
- `setImages()` -> `void`
- `setIndicatorColor(int value)` -> `void`
- `setIndicatorHeight(int value)` -> `void`
- `setShouldExpand(boolean value)` -> `void`
- `setType(Type type)` -> `void`
- `setUnderlineColor(int value)` -> `void`
- `setUnderlineColorResource(int resId)` -> `void`
- `setUnderlineHeight(int value)` -> `void`
- `showSelected(boolean show)` -> `void`
- `stickerSetPositionChanged(int fromPosition, int toPosition)` -> `void`
- `updatePosition()` -> `void`
- `updateTabStyles()` -> `void`

## `org.telegram.ui.Components.ScrollSlidingTextTabStrip`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `finishAddingTabs()` -> `void`
- `getAnimationIdicatorProgress()` -> `float`
- `getCurrentPosition()` -> `int`
- `getCurrentTabId()` -> `int`
- `getFirstTabId()` -> `int`
- `getNextPageId(boolean forward)` -> `int`
- `getSelectorDrawable()` -> `Drawable`
- `getTabIds()` -> `ArrayList<Integer>`
- `getTabsContainer()` -> `ViewGroup`
- `getTabsCount()` -> `int`
- `isAnimatingIndicator()` -> `boolean`
- `isReordering()` -> `boolean`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onPageScrolled(int position, int first)` -> `void`
- `recordIndicatorParams()` -> `void`
- `resetTab()` -> `void`
- `scrollTo(int pageId, int position1, View v)` -> `void`
- `scrollTo(int pageId)` -> `void`
- `selectTabWithId(int id, float progress)` -> `void`
- `setAnimationIdicatorProgress(float value)` -> `void`
- `setBlurredBackground(BlurredBackgroundDrawable background)` -> `void`
- `setColors(int line, int active, int unactive, int selector)` -> `void`
- `setDelegate(ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate)` -> `void`
- `setEnabled(boolean enabled)` -> `void`
- `setInitialTabId(int id)` -> `void`
- `setOpen(boolean open)` -> `void`
- `setReordering(boolean reordering)` -> `void`
- `setUseMinimalWidth(boolean value)` -> `void`
- `setUseSameWidth(boolean value)` -> `void`
- `updateColors()` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Components.ScrollSlidingTextTabStrip$ScrollSlidingTabStripDelegate`
- `onSamePageSelected()` -> `default void`
- `showOptions(int page, View view)` -> `default boolean`

## `org.telegram.ui.Components.Scroller`
- `abortAnimation()` -> `void`
- `computeScrollOffset()` -> `boolean`
- `extendDuration(int extend)` -> `void`
- `forceFinished(boolean finished)` -> `void`
- `getCurrVelocity()` -> `float`
- `getCurrX()` -> `int`
- `getCurrY()` -> `int`
- `getDuration()` -> `int`
- `getFinalX()` -> `int`
- `getFinalY()` -> `int`
- `getStartX()` -> `int`
- `getStartY()` -> `int`
- `setFinalX(int newX)` -> `void`
- `setFinalY(int newY)` -> `void`
- `setFriction(float friction)` -> `void`
- `startScroll(int startX, int startY, int dx, int dy)` -> `void`
- `startScroll(int startX, int startY, int dx, int dy, int duration)` -> `void`
- `timePassed()` -> `int`

## `org.telegram.ui.Components.SearchCounterView`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setCount(String newStr, int count, boolean animated)` -> `void`
- `setGravity(int gravity)` -> `void`

## `org.telegram.ui.Components.SearchDownloadsContainer`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `search(String query)` -> `void`
- `setKeyboardHeight(int keyboardSize, boolean animated)` -> `void`
- `setPagesPaddings(int top, int bottom)` -> `void`
- `setPagesPaddings(int top, int bottom, boolean doNotRequestLayout)` -> `void`
- `setUiCallback(FilteredSearchView.UiCallback callback)` -> `void`
- `showPremiumFloodWaitBulletin(final boolean isUpload)` -> `void`
- `update(boolean animated)` -> `void`

## `org.telegram.ui.Components.SearchDownloadsContainer$Cell`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`

## `org.telegram.ui.Components.SearchDownloadsContainer$DownloadsAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.SearchField`
- `getProgressDrawable()` -> `CloseProgressDrawable2`
- `getSearchBackground()` -> `View`
- `getSearchEditText()` -> `EditTextBoldCursor`
- `getThemeDescriptions(List<ThemeDescription> descriptions)` -> `void`
- `hideKeyboard()` -> `void`
- `onFieldTouchUp(EditTextBoldCursor editText)` -> `void`
- `onTextChange(String text)` -> `void`
- `setHint(String text)` -> `void`

## `org.telegram.ui.Components.SearchStateDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setIconState(@State int state)` -> `void`
- `setIconState(@State int state, boolean animated)` -> `void`
- `setStrokeWidth(float strokeWidth)` -> `void`

## `org.telegram.ui.Components.SearchTagsList`
- `clear()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getCurrentHeight()` -> `int`
- `onAttachedToWindow()` -> `void`
- `static onBackPressedRenameTagAlert(boolean invoked)` -> `boolean`
- `onDetachedFromWindow()` -> `void`
- `static openRenameTagAlert(Context context, int currentAccount, TLRPC.Reaction reaction, Theme.ResourcesProvider resourcesProvider, boolean forceNotAdaptive)` -> `void`
- `setChosen(ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean notify)` -> `void`
- `setFilter(ReactionsLayoutInBubble.VisibleReaction reaction)` -> `boolean`
- `setShown(float shownT)` -> `void`
- `show(boolean show)` -> `void`
- `shown()` -> `boolean`
- `updateTags(boolean notify)` -> `void`

## `org.telegram.ui.Components.SearchTagsList$Adapter`
- `getItemCount()` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.Components.SearchTagsList$Item`
- `equals(@Nullable Object obj)` -> `boolean`
- `static get(ReactionsLayoutInBubble.VisibleReaction reaction, int count, String name)` -> `Item`

## `org.telegram.ui.Components.SearchTagsList$TagButton`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(Item item)` -> `void`
- `setChosen(boolean value, boolean animated)` -> `boolean`
- `startAnimate()` -> `void`

## `org.telegram.ui.Components.SearchViewPager`
- `actionModeShowing()` -> `boolean`
- `capture(Canvas canvas, RectF position)` -> `void`
- `clear()` -> `void`
- `collapsePublicPosts()` -> `void`
- `static createFragmentFromMessage(final int currentAccount, MessageObject messageObject)` -> `BaseFragment`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getActionMode()` -> `ActionBarMenu`
- `getCurrentSearchFilters()` -> `ArrayList<FiltersView.MediaFilterData>`
- `getDialogId(String query)` -> `long`
- `getDownloadsContainer()` -> `SearchDownloadsContainer`
- `getFolderId()` -> `int`
- `getManualScrollDuration()` -> `long`
- `getPositionForType(int initialSearchType)` -> `int`
- `getSpeedItem()` -> `ActionBarMenuItem`
- `getTabsView()` -> `TabsView`
- `getThemeDescriptions(ArrayList<ThemeDescription> arrayList)` -> `void`
- `goToMessage(MessageObject messageObject)` -> `void`
- `hideActionMode()` -> `void`
- `includeDownloads()` -> `boolean`
- `includeFolder()` -> `boolean`
- `invalidateBlur()` -> `void`
- `isDownloadsTab(int position)` -> `boolean`
- `isSelected(FilteredSearchView.MessageHashId messageHashId)` -> `boolean`
- `messagesDeleted(long channelId, ArrayList<Integer> markAsDeletedMessages)` -> `void`
- `onActionBarItemClick(int id)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onItemSelected(View currentPage, View oldPage, int position, int oldPosition)` -> `void`
- `onPageScrolled(int dx, int dy)` -> `void`
- `onResume()` -> `void`
- `onShown()` -> `void`
- `onTextChanged(String text)` -> `void`
- `reset()` -> `void`
- `runResultsEnterAnimation()` -> `void`
- `setBlurredBackgroundDrawableFactory(BlurredBackgroundDrawableViewFactory factory)` -> `void`
- `setFilteredSearchViewDelegate(FilteredSearchView.Delegate filteredSearchViewDelegate)` -> `void`
- `setKeyboardHeight(int keyboardSize)` -> `void`
- `setPagesPadding(int top, int bottom, boolean doNotRequestLayout)` -> `void`
- `setPosition(int position)` -> `void`
- `showActionMode()` -> `void`
- `showDownloads()` -> `void`
- `showOnlyDialogsAdapter(boolean showOnlyDialogsAdapter)` -> `void`
- `toggleItemSelection(MessageObject message, View view, int a)` -> `void`
- `updateColors()` -> `void`
- `updateTabs()` -> `void`
- `updateTabs(boolean animated)` -> `void`

## `org.telegram.ui.Components.SearchViewPager$ViewPagerAdapter`
- `bindView(View view, int position, int viewType)` -> `void`
- `createView(int viewType)` -> `View`
- `getItemCount()` -> `int`
- `getItemTitle(int position)` -> `CharSequence`
- `getItemViewType(int position)` -> `int`
- `updateItems()` -> `void`

## `org.telegram.ui.Components.SectionsScrollView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `static isSectionView(View view)` -> `boolean`
- `onScroll(Runnable listener)` -> `void`
- `onScrollChanged(int l, int t, int oldl, int oldt)` -> `void`

## `org.telegram.ui.Components.SectionsScrollView$SectionsLinearLayout`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`

## `org.telegram.ui.Components.SeekBar`
- `clearTimestamps()` -> `void`
- `draw(Canvas canvas)` -> `void`
- `getProgress()` -> `float`
- `getThumbX()` -> `int`
- `getWidth()` -> `int`
- `onTouch(int action, float x, float y)` -> `boolean`
- `setAlpha(float alpha)` -> `void`
- `setBufferedProgress(float value)` -> `void`
- `setColors(int background, int cache, int progress, int circle, int selected)` -> `void`
- `setDelegate(SeekBarDelegate seekBarDelegate)` -> `void`
- `setLineHeight(int value)` -> `void`
- `setParent(View parent)` -> `void`
- `setProgress(float progress)` -> `void`
- `setSelected(boolean value)` -> `void`
- `setSize(int w, int h)` -> `void`
- `updateTimestamps(MessageObject messageObject, Long videoDuration)` -> `void`

## `org.telegram.ui.Components.SeekBar$SeekBarDelegate`
- `isSeekBarDragAllowed()` -> `default boolean`
- `onSeekBarContinuousDrag(float progress)` -> `default void`
- `onSeekBarPressed()` -> `default void`
- `onSeekBarReleased()` -> `default void`
- `reverseWaveform()` -> `default boolean`

## `org.telegram.ui.Components.SeekBarAccessibilityDelegate`
- `getContentDescription(@Nullable View host)` -> `CharSequence`
- `onInitializeAccessibilityNodeInfo(@NonNull View host, AccessibilityNodeInfo info)` -> `void`
- `onInitializeAccessibilityNodeInfoInternal(@Nullable View host, AccessibilityNodeInfo info)` -> `void`
- `onInitializeAccessibilityNodeInfoInternal(AccessibilityNodeInfo info)` -> `void`
- `performAccessibilityAction(@NonNull View host, int action, Bundle args)` -> `boolean`
- `performAccessibilityActionInternal(@Nullable View host, int action, Bundle args)` -> `boolean`
- `performAccessibilityActionInternal(int action, Bundle args)` -> `boolean`

## `org.telegram.ui.Components.SeekBarView`
- `clearTimestamps()` -> `void`
- `getProgress()` -> `float`
- `getSeekBarAccessibilityDelegate()` -> `SeekBarAccessibilityDelegate`
- `isDragging()` -> `boolean`
- `isTwoSided()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouch(MotionEvent ev)` -> `boolean`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBufferedProgress(float progress)` -> `void`
- `setColors(int inner, int outer)` -> `void`
- `setDelegate(SeekBarViewDelegate seekBarViewDelegate)` -> `void`
- `setInnerColor(int color)` -> `void`
- `setLineWidth(int dp)` -> `void`
- `setMinProgress(float progress)` -> `void`
- `setOuterColor(int color)` -> `void`
- `setProgress(float progress)` -> `void`
- `setProgress(float progress, boolean animated)` -> `void`
- `setReportChanges(boolean value)` -> `void`
- `setSeparatorsCount(int separatorsCount)` -> `void`
- `setTwoSided(boolean value)` -> `void`
- `updateTimestamps(MessageObject messageObject, Long duration)` -> `void`
- `verifyDrawable(Drawable who)` -> `boolean`

## `org.telegram.ui.Components.SeekBarView$SeekBarViewDelegate`
- `getContentDescription()` -> `default CharSequence`
- `getStepsCount()` -> `default int`
- `needVisuallyDivideSteps()` -> `default boolean`
- `onSeekBarPressed(boolean pressed)` -> `default void`

## `org.telegram.ui.Components.SeekBarWaveform`
- `draw(Canvas canvas, View parentView)` -> `void`
- `explodeAt(float progress)` -> `void`
- `getProgress()` -> `float`
- `invalidate()` -> `void`
- `onTouch(int action, float x, float y)` -> `boolean`
- `setAlpha(float alpha)` -> `void`
- `setColors(int inner, int outer, int selected)` -> `void`
- `setDelegate(SeekBar.SeekBarDelegate seekBarDelegate)` -> `void`
- `setExplosionRate(float explosionRate)` -> `void`
- `setLoading(boolean loading)` -> `void`
- `setParentView(View view)` -> `void`
- `setProgress(float progress)` -> `void`
- `setProgress(float progress, boolean animated)` -> `void`
- `setSelected(boolean value)` -> `void`
- `setSent()` -> `void`
- `setSize(int w, int h)` -> `void`
- `setSize(int w, int h, int fromW, int toW)` -> `void`
- `setWaveScaling(float waveScaling)` -> `void`
- `setWaveform(byte[] waveform)` -> `void`
- `stopExploding()` -> `void`

## `org.telegram.ui.Components.SeekBarWaveform$Particles`
- `clear()` -> `void`
- `draw(Canvas canvas, float alpha)` -> `void`
- `setColor(int color)` -> `Particles`
- `setEmitArea(RectF emitArea)` -> `Particles`

## `org.telegram.ui.Components.SeekSpeedDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `isShown()` -> `boolean`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setShown(boolean shown, boolean animated)` -> `void`
- `setSpeed(float speed, boolean animated)` -> `void`

## `org.telegram.ui.Components.SenderSelectPopup`
- `dismiss()` -> `void`
- `showAtLocation(View parent, int gravity, int x, int y)` -> `void`
- `startDismissAnimation(SpringAnimation... animations)` -> `void`
- `startShowAnimation()` -> `void`

## `org.telegram.ui.Components.SenderSelectPopup$BackButtonFrameLayout`
- `dispatchKeyEvent(KeyEvent event)` -> `boolean`

## `org.telegram.ui.Components.SenderSelectView`
- `drawableStateChanged()` -> `void`
- `getProgress()` -> `float`
- `jumpDrawablesToCurrentState()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAvatar(TLObject obj)` -> `void`
- `setProgress(float progress)` -> `void`
- `setProgress(float progress, boolean animate)` -> `void`
- `setProgress(float progress, boolean animate, boolean useSpring)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Components.SendingFileDrawable`
- `draw(Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(ColorFilter cf)` -> `void`
- `setIsChat(boolean value)` -> `void`
- `start()` -> `void`
- `stop()` -> `void`

## `org.telegram.ui.Components.Shaker`
- `concat(Canvas canvas, float alpha)` -> `void`
- `concat(Canvas canvas, float alpha, float cx, float cy)` -> `void`

## `org.telegram.ui.Components.ShareAlert`
- `static createShareAlert(final Context context, MessageObject messageObject, final String text, boolean channel, final String copyLink, boolean fullScreen)` -> `ShareAlert`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `dismissInternal()` -> `void`
- `doSend(LongSparseArray<TLRPC.Dialog> dids, TLRPC.TL_forumTopic topic)` -> `boolean`
- `getContainerViewHeight()` -> `int`
- `onBackPressed()` -> `void`
- `onSend(LongSparseArray<TLRPC.Dialog> dids, int count, TLRPC.TL_forumTopic topic, boolean showToast)` -> `void`
- `onShareStory(View cell)` -> `void`
- `setDelegate(ShareAlertDelegate shareAlertDelegate)` -> `void`
- `setStoryToShare(TL_stories.StoryItem storyItem)` -> `void`
- `updateBottomOverlay()` -> `void`
- `updateSelectedCount(int animated)` -> `void`

## `org.telegram.ui.Components.ShareAlert$ShareAlertDelegate`
- `didCopy()` -> `default boolean`
- `didShare()` -> `default void`

## `org.telegram.ui.Components.ShareAlert$ShareSearchAdapter`
- `getItem(int position)` -> `TLRPC.Dialog`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `getSpanSize(int spanCount, int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `isSearching()` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `searchDialogs(final String query)` -> `void`

## `org.telegram.ui.Components.ShareAlert$ShareTopicsAdapter`
- `getItemCount()` -> `int`
- `getItemTopic(int position)` -> `TLRPC.TL_forumTopic`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.ShareAlert$SwitchView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTabSwitch(int num)` -> `void`

## `org.telegram.ui.Components.ShareLocationDrawable`
- `draw(Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(ColorFilter cf)` -> `void`

## `org.telegram.ui.Components.ShareTopView`
- `current()` -> `Layout`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismissWebPagePreview()` -> `void`
- `static extractFirstUrl(CharSequence text)` -> `String`
- `getLoadedWebPage()` -> `TLRPC.WebPage`
- `getMode()` -> `int`
- `getThumbView(int index)` -> `BackupImageView`
- `isPreviewEnabled()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onTextChanged(CharSequence text, boolean force)` -> `void`
- `setLayoutClickListener(OnClickListener listener)` -> `void`
- `setOnModeChangeListener(OnModeChangeListener listener)` -> `void`
- `setRecipients(int currentAccount, ArrayList<Long> selectedDialogs)` -> `void`
- `setSharedLink(int currentAccount, String url)` -> `void`
- `setSharedMedia(int currentAccount, ArrayList<MediaController.PhotoEntry> entries)` -> `void`
- `setSharedText(int currentAccount, CharSequence initialText)` -> `void`
- `startHintRotation(CharSequence hintText)` -> `void`
- `stopHintRotation()` -> `void`

## `org.telegram.ui.Components.SharedMediaFastScrollTooltip`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Components.SharedMediaFastScrollTooltip$TooltipDrawableView`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.Components.SharedMediaLayout`
- `animateSearchToOptions(boolean toOptions, boolean animated)` -> `void`
- `closeActionMode()` -> `boolean`
- `closeActionMode(boolean uncheckAnimated)` -> `boolean`
- `static createEmptyStubView(Context context, int currentType, long dialog_id, Theme.ResourcesProvider resourcesProvider)` -> `View`
- `customTabs()` -> `boolean`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `disableScroll(boolean disable)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchFastScrollEvent(MotionEvent ev)` -> `boolean`
- `drawBackgroundWithBlur(Canvas canvas, float y, Rect rectTmp2, Paint backgroundPaint)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `drawListForBlur(Canvas blurCanvas, ArrayList<SizeNotifierFrameLayout.IViewWithInvalidateCallback> views)` -> `void`
- `forceHasOverlappingRendering(boolean hasOverlappingRendering)` -> `void`
- `getActionModeSelected()` -> `SparseArray<MessageObject>`
- `getBotPreviewsSubtitle(boolean edit)` -> `String`
- `getBottomButtonStoriesVisibility()` -> `float`
- `getClosestTab()` -> `int`
- `getCurrentListView()` -> `RecyclerListView`
- `getInitialTab()` -> `int`
- `getNextMediaColumnsCount(int i, int mediaColumnsCount, boolean up)` -> `int`
- `getPhotoVideoOptionsAlpha(float progress)` -> `float`
- `getPhotosVideosTypeFilter()` -> `int`
- `getSaveItem()` -> `TextView`
- `getSearchAlpha(float progress)` -> `float`
- `getSearchItem()` -> `ActionBarMenuItem`
- `getSearchOptionsItem()` -> `RLottieImageView`
- `getSelectedTab()` -> `int`
- `getStoriesArea()` -> `TL_stories.MediaArea`
- `getStoriesCount(int tab)` -> `int`
- `getStoriesHashtag()` -> `String`
- `getStoriesHashtagUsername()` -> `String`
- `static getTab(int id, boolean isChannel)` -> `TLRPC.ProfileTab`
- `static getTabId(TLRPC.ProfileTab tab)` -> `int`
- `static getTabName(int id)` -> `String`
- `getTabProgress()` -> `float`
- `getTabTranslationX(int type, boolean includeSubtabs)` -> `float`
- `getTabVisibility(int type, boolean includeSubtabs)` -> `float`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `includeSavedDialogs()` -> `boolean`
- `includeStories()` -> `boolean`
- `initBlurCapture(ViewGroup parent)` -> `void`
- `invalidateBlur()` -> `void`
- `isActionModeShown()` -> `boolean`
- `isAnimatingForward()` -> `boolean`
- `static isAnyStoryPageType(int type)` -> `boolean`
- `isArchivedOnlyStoriesView()` -> `boolean`
- `isBot()` -> `boolean`
- `isCalendarItemVisible()` -> `boolean`
- `isCurrentTabFirst()` -> `boolean`
- `isInFastScroll()` -> `boolean`
- `isOptionsItemVisible()` -> `boolean`
- `isPinnedToTop()` -> `boolean`
- `isSearchItemVisible()` -> `boolean`
- `isSearchItemVisible(int type)` -> `boolean`
- `isSearchingStories()` -> `boolean`
- `isSelf()` -> `boolean`
- `isStoriesView()` -> `boolean`
- `static isStoryAlbumPageType(int type)` -> `boolean`
- `isSwipeBackEnabled()` -> `boolean`
- `isTabZoomable(int type)` -> `boolean`
- `mediaPageTopMargin()` -> `int`
- `onActionBarItemClick(View v, int id)` -> `void`
- `onBottomButtonVisibilityChange()` -> `void`
- `onButtonClicked(DialogCell dialogCell)` -> `void`
- `onButtonLongPress(DialogCell dialogCell)` -> `void`
- `onConfigurationChanged(android.content.res.Configuration newConfig)` -> `void`
- `onDestroy()` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onMemberClick(TLRPC.ChatParticipant participant, boolean isLong, View view)` -> `boolean`
- `onPageMediaProgress(float progress)` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onSearchStateChanged(boolean expanded)` -> `void`
- `onSelectedTabChanged()` -> `void`
- `onTabProgress(float progress)` -> `void`
- `onTabScroll(boolean scrolling)` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `openAddStoriesToAlbumSheet(BaseFragment fragment, long dialogId, int albumId)` -> `void`
- `openDeleteStoriesAlbumAlert(BaseFragment fragment, long dialogId, int albumId)` -> `void`
- `openHiddenStories()` -> `void`
- `openRenameStoriesAlbumAlert(BaseFragment fragment, long dialogId, int albumId)` -> `void`
- `openStory(DialogCell dialogCell, Runnable onDone)` -> `void`
- `openStoryAlbumPage(int albumId, boolean forward)` -> `void`
- `overrideColumnsCount()` -> `int`
- `scrollToPage(int page)` -> `void`
- `setChatInfo(TLRPC.ChatFull chatInfo)` -> `void`
- `setChatUsers(ArrayList<Integer> sortedUsers, TLRPC.ChatFull chatInfo)` -> `void`
- `setCommonGroupsCount(int count)` -> `void`
- `setForwardRestrictedHint(HintView hintView)` -> `void`
- `setMergeDialogId(long did)` -> `void`
- `setNewMediaCounts(int[] mediaCounts)` -> `void`
- `setPadding(int left, int top, int right, int bottom)` -> `void`
- `setPagesPaddingBottom(int pagesPaddingBottom)` -> `void`
- `setPinnedToTop(boolean pinnedToTop)` -> `void`
- `setStoriesFilter(boolean photos, boolean videos)` -> `void`
- `setUserInfo(TLRPC.UserFull userInfo)` -> `void`
- `setVisibleHeight(int height)` -> `void`
- `showActionMode(boolean show)` -> `void`
- `showChatPreview(DialogCell dialogCell)` -> `void`
- `showMediaCalendar(int page, boolean fromFastScroll)` -> `void`
- `showPremiumFloodWaitBulletin(final boolean isUpload)` -> `void`
- `startAlbumsReorder(int albumId)` -> `void`
- `storyAlbums_getAlbumIdByTabType(int type)` -> `int`
- `updateAdapters()` -> `void`
- `updateFastScrollVisibility(MediaPage mediaPage, boolean animated)` -> `void`
- `updateSearchItemIcon(float progress)` -> `void`
- `updateSearchItemIconAnimated()` -> `void`
- `updateStoriesList(StoriesController.StoriesList list)` -> `void`
- `updateTabs(boolean animated)` -> `void`
- `zoomIn()` -> `Boolean`
- `zoomIn(View mediaZoomInItem, View mediaZoomOutItem)` -> `Boolean`
- `zoomOut()` -> `Boolean`
- `zoomOut(View mediaZoomInItem, View mediaZoomOutItem)` -> `Boolean`

## `org.telegram.ui.Components.SharedMediaLayout$ChannelRecommendationsAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `openPreview(int position)` -> `void`
- `update(boolean notify)` -> `void`

## `org.telegram.ui.Components.SharedMediaLayout$ChatUsersAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `updateRank(long userId, String rank)` -> `void`

## `org.telegram.ui.Components.SharedMediaLayout$CommonGroupsAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.SharedMediaLayout$EmptyStubView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Components.SharedMediaLayout$GroupUsersSearchAdapter`
- `getItem(int i)` -> `TLObject`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewRecycled(RecyclerView.ViewHolder holder)` -> `void`
- `search(final String query, boolean animated)` -> `void`

## `org.telegram.ui.Components.SharedMediaLayout$InternalListView`
- `updateClip(int[] clip)` -> `void`

## `org.telegram.ui.Components.SharedMediaLayout$MediaPage`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`

## `org.telegram.ui.Components.SharedMediaLayout$MediaSearchAdapter`
- `getItem(int i)` -> `MessageObject`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `isGlobalSearch(int i)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `queryServerSearch(final String query, final int max_id, long did, long topicId)` -> `void`
- `search(final String query, boolean animated)` -> `void`

## `org.telegram.ui.Components.SharedMediaLayout$MoreRecommendationsCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Components.SharedMediaLayout$PollAdapter`
- `destroy()` -> `void`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onScrolled(RecyclerListView listView)` -> `void`
- `update(RecyclerListView listView, long pollId, TLRPC.TL_poll poll, TLRPC.PollResults results)` -> `void`

## `org.telegram.ui.Components.SharedMediaLayout$SavedMessagesSearchAdapter`
- `getItemCount()` -> `int`
- `getItemId(int position)` -> `long`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `search(String query, ReactionsLayoutInBubble.VisibleReaction reaction)` -> `void`

## `org.telegram.ui.Components.SharedMediaLayout$ScrollSlidingTextTabStripInner`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `drawBackground(Canvas canvas)` -> `void`
- `setBackgroundColor(int color)` -> `void`

## `org.telegram.ui.Components.SharedMediaLayout$SharedDocumentsAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `getLetter(int position)` -> `String`
- `getPositionForScrollProgress(RecyclerListView listView, float progress, int[] position)` -> `void`
- `getTotalItemsCount()` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onFinishFastScroll(RecyclerListView listView)` -> `void`
- `onStartFastScroll()` -> `void`

## `org.telegram.ui.Components.SharedMediaLayout$SharedLinksAdapter`
- `getCountForSection(int section)` -> `int`
- `getItem(int section, int position)` -> `Object`
- `getItemViewType(int section, int position)` -> `int`
- `getLetter(int position)` -> `String`
- `getPositionForScrollProgress(RecyclerListView listView, float progress, int[] position)` -> `void`
- `getSectionCount()` -> `int`
- `getSectionHeaderView(int section, View view)` -> `View`
- `isEnabled(RecyclerView.ViewHolder holder, int section, int row)` -> `boolean`
- `onBindViewHolder(int section, int position, RecyclerView.ViewHolder holder)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.SharedMediaLayout$SharedMediaData`
- `getEndLoadingStubs()` -> `int`
- `getStartOffset()` -> `int`
- `getTotalCount()` -> `int`
- `replaceMid(int loadIndex, int oldMid, int newMid)` -> `void`
- `setEndReached(int num, boolean value)` -> `void`
- `setListFrozen(boolean frozen)` -> `void`
- `setMaxId(int num, int value)` -> `void`
- `setTotalCount(int count)` -> `void`
- `setTotalCount(int num, int count)` -> `void`

## `org.telegram.ui.Components.SharedMediaLayout$SharedMediaListView`
- `checkHighlightCell(SharedPhotoVideoCell2 cell)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getAnimateToColumnsCount()` -> `int`
- `getChangeColumnsProgress()` -> `float`
- `getColumnsCount()` -> `int`
- `getMessageAlphaEnter()` -> `SparseArray<Float>`
- `getMovingAdapter()` -> `RecyclerListView.FastScrollAdapter`
- `getPinchCenterPosition()` -> `int`
- `getSupportingAdapter()` -> `RecyclerListView.FastScrollAdapter`
- `getSupportingListView()` -> `InternalListView`
- `isChangeColumnsAnimation()` -> `boolean`
- `isStories()` -> `boolean`
- `isThisListView()` -> `boolean`

## `org.telegram.ui.Components.SharedMediaLayout$SharedMediaPreloader`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getLastMediaCount()` -> `int[]`
- `getSharedMediaData()` -> `SharedMediaData[]`
- `getTopicId()` -> `long`
- `onDestroy(BaseFragment fragment)` -> `void`

## `org.telegram.ui.Components.SharedMediaLayout$SharedPhotoVideoAdapter`
- `fastScrollIsVisible(RecyclerListView listView)` -> `boolean`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `getLetter(int position)` -> `String`
- `getPositionForIndex(int i)` -> `int`
- `getPositionForScrollProgress(RecyclerListView listView, float progress, int[] position)` -> `void`
- `getScrollProgress(RecyclerListView listView)` -> `float`
- `getTopOffset()` -> `int`
- `getTotalItemsCount()` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onFastScrollSingleTap()` -> `void`
- `onFinishFastScroll(RecyclerListView listView)` -> `void`
- `onStartFastScroll()` -> `void`

## `org.telegram.ui.Components.SharingLocationsAlert`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`

## `org.telegram.ui.Components.SharingLocationsAlert$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.ShutterButton`
- `getDelegate()` -> `ShutterButtonDelegate`
- `getState()` -> `State`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent motionEvent)` -> `boolean`
- `setDelegate(ShutterButtonDelegate shutterButtonDelegate)` -> `void`
- `setScaleX(float scaleX)` -> `void`
- `setState(State value, boolean animated)` -> `void`

## `org.telegram.ui.Components.SimpleAvatarView`
- `isSelected()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `setAvatar(TLObject obj)` -> `void`
- `setHideAvatar(boolean h)` -> `void`
- `setSelected(boolean s, boolean animate)` -> `void`

## `org.telegram.ui.Components.SimpleFloatPropertyCompat`
- `getMultiplier()` -> `float`
- `getValue(T object)` -> `float`
- `setMultiplier(float multiplier)` -> `SimpleFloatPropertyCompat<T>`
- `setValue(T object, float value)` -> `void`

## `org.telegram.ui.Components.SizeNotifierFrameLayout`
- `DRAW_USING_RENDERNODE()` -> `boolean`
- `blurWasDrawn()` -> `boolean`
- `createAdjustPanLayoutHelper()` -> `AdjustPanLayoutHelper`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawBlurCircle(Canvas canvas, float viewY, float cx, float cy, float radius, Paint blurScrimPaint, boolean top)` -> `void`
- `drawBlurRect(Canvas canvas, float y, Rect rectTmp, Paint blurScrimPaint, boolean top)` -> `void`
- `drawBlurRect(Canvas canvas, float y, Rect rectTmp, Paint blurScrimPaint, boolean top, float alpha)` -> `void`
- `drawBlurRect(Canvas canvas, float y, Rect rectTmp, Paint blurScrimPaint, boolean top, int blurAlpha)` -> `void`
- `drawList(Canvas blurCanvas, boolean top, ArrayList<IViewWithInvalidateCallback> views)` -> `void`
- `getBackgroundImage()` -> `Drawable`
- `getBackgroundSizeY()` -> `int`
- `getBackgroundTranslationY()` -> `int`
- `static getBlurRadius()` -> `float`
- `getBlurRadiusInternal()` -> `float`
- `getBottomOffset()` -> `float`
- `getBottomPadding()` -> `int`
- `getBottomTranslation()` -> `float`
- `getHeightWithKeyboard()` -> `int`
- `getKeyboardHeight()` -> `int`
- `getListTranslationY()` -> `float`
- `getNewDrawable()` -> `Drawable`
- `getNewDrawableMotion()` -> `boolean`
- `static getRenderNodeScale()` -> `float`
- `getResourceProvider()` -> `Theme.ResourcesProvider`
- `getScrollOffset()` -> `int`
- `invalidateBackground()` -> `void`
- `invalidateBlur()` -> `void`
- `invalidateBlurredViews()` -> `void`
- `invalidateOptimized()` -> `boolean`
- `isActionBarVisible()` -> `boolean`
- `isStatusBarVisible()` -> `boolean`
- `measureKeyboardHeight()` -> `int`
- `notifyHeightChanged()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onBackgroundViewInvalidate()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `setBackgroundImage(Drawable bitmap, boolean motion)` -> `void`
- `setBackgroundTranslation(int translation)` -> `void`
- `setBottomClip(int value)` -> `void`
- `setDelegate(SizeNotifierFrameLayoutDelegate delegate)` -> `void`
- `setEmojiKeyboardHeight(int height)` -> `void`
- `setEmojiOffset(boolean animInProgress, float offset)` -> `void`
- `setOccupyStatusBar(boolean value)` -> `void`
- `setSkipBackgroundDrawing(boolean skipBackgroundDrawing)` -> `void`
- `startBlur()` -> `void`
- `updateBlurContent()` -> `void`
- `updateColors()` -> `void`
- `useRootView()` -> `boolean`
- `verifyDrawable(Drawable who)` -> `boolean`

## `org.telegram.ui.Components.SizeNotifierFrameLayout$BackgroundView`
- `invalidate()` -> `void`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.Components.SizeNotifierFrameLayout$SimplerCanvas`
- `clipPath(@NonNull Path path)` -> `boolean`
- `clipPath(@NonNull Path path, @NonNull Region.Op op)` -> `boolean`
- `drawText(@NonNull char[] text, int index, int count, float x, float y, @NonNull Paint paint)` -> `void`
- `drawText(@NonNull String text, int start, int end, float x, float y, @NonNull Paint paint)` -> `void`
- `drawText(@NonNull String text, float x, float y, @NonNull Paint paint)` -> `void`
- `drawText(@NonNull CharSequence text, int start, int end, float x, float y, @NonNull Paint paint)` -> `void`
- `drawTextOnPath(@NonNull char[] text, int index, int count, @NonNull Path path, float hOffset, float vOffset, @NonNull Paint paint)` -> `void`
- `drawTextOnPath(@NonNull String text, @NonNull Path path, float hOffset, float vOffset, @NonNull Paint paint)` -> `void`
- `drawTextRun(@NonNull CharSequence text, int start, int end, int contextStart, int contextEnd, float x, float y, boolean isRtl, @NonNull Paint paint)` -> `void`
- `drawTextRun(@NonNull MeasuredText text, int start, int end, int contextStart, int contextEnd, float x, float y, boolean isRtl, @NonNull Paint paint)` -> `void`
- `drawTextRun(@NonNull char[] text, int index, int count, int contextIndex, int contextCount, float x, float y, boolean isRtl, @NonNull Paint paint)` -> `void`

## `org.telegram.ui.Components.SizeNotifierFrameLayoutPhoto`
- `getKeyboardHeight()` -> `int`
- `measureKeyboardHeight()` -> `int`
- `notifyHeightChanged()` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `setActivity(Activity activity)` -> `void`
- `setWithoutWindow(boolean value)` -> `void`

## `org.telegram.ui.Components.SlideChooseView`
- `getSelectedIndex()` -> `int`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `performAccessibilityAction(int action, Bundle arguments)` -> `boolean`
- `setCallback(Callback callback)` -> `void`
- `setDashedFrom(int from)` -> `void`
- `setMinAllowedIndex(int index)` -> `void`
- `setOptions(int selected, String... options)` -> `void`
- `setOptions(int selected, Drawable[] leftDrawables, String... options)` -> `void`

## `org.telegram.ui.Components.SlideView`
- `getHeaderName()` -> `String`
- `needBackButton()` -> `boolean`
- `onBackPressed(boolean force)` -> `boolean`
- `onCancelPressed()` -> `void`
- `onDestroyActivity()` -> `void`
- `onHide()` -> `void`
- `onNextPressed(String code)` -> `void`
- `onResume()` -> `void`
- `onShow()` -> `void`
- `restoreStateParams(Bundle bundle)` -> `void`
- `setParams(Bundle params, boolean restore)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.SlidingTabView`
- `getSeletedTab()` -> `int`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `setDelegate(SlidingTabViewDelegate delegate)` -> `void`

## `org.telegram.ui.Components.SlotsDrawable`
- `afterLoadFrameImpl()` -> `void`
- `beforeLoadFrameImpl()` -> `int`
- `decodeFrameFinishedInternal()` -> `void`
- `recycle(boolean uiThread)` -> `void`
- `setBaseDice(ChatMessageCell messageCell, TLRPC.TL_messages_stickerSet stickerSet)` -> `boolean`
- `setDiceNumber(ChatMessageCell messageCell, int number, TLRPC.TL_messages_stickerSet stickerSet, boolean instant)` -> `boolean`

## `org.telegram.ui.Components.SmoothScroller`
- `calculateDyToMakeVisible(View view, int snapPreference)` -> `int`
- `calculateTimeForDeceleration(int dx)` -> `int`
- `calculateTimeForScrolling(int dx)` -> `int`
- `onEnd()` -> `void`
- `onTargetFound(View targetView, RecyclerView.State state, Action action)` -> `void`
- `setDurationScale(float scale)` -> `void`
- `setOffset(int offset)` -> `void`
- `updateActionForInterimTarget(Action action)` -> `void`

## `org.telegram.ui.Components.SnowflakesEffect`
- `onDraw(View parent, Canvas canvas)` -> `void`
- `setColorKey(int key)` -> `void`
- `setForcedColor(int forcedColor)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.SnowflakesEffect$Particle`
- `draw(Canvas canvas)` -> `void`

## `org.telegram.ui.Components.SpannableStringLight`
- `setSpanLight(Object what, int start, int end, int flags)` -> `void`
- `setSpansCount(int count)` -> `void`

## `org.telegram.ui.Components.SpeedIconDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `static formatNumber(float value)` -> `String`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setValue(float value, boolean animated)` -> `void`

## `org.telegram.ui.Components.SpoilersShowcase`
- `createView(Context context)` -> `View`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`

## `org.telegram.ui.Components.SquigglyLinesSpan`
- `draw(Canvas canvas, float y, float left, float right)` -> `void`
- `static drawOnText(Canvas canvas, Layout layout)` -> `void`
- `updateDrawState(TextPaint tp)` -> `void`

## `org.telegram.ui.Components.StableAnimator`
- `end()` -> `void`
- `getAnimatedValue()` -> `Object`
- `static ofFloat(float... values)` -> `StableAnimator`
- `setFloatValues(float[] floatValues)` -> `void`
- `start()` -> `void`

## `org.telegram.ui.Components.StarAppsSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `getTitle()` -> `CharSequence`

## `org.telegram.ui.Components.StarRatingView`
- `static getTabsViewBackgroundColor(Theme.ResourcesProvider resourcesProvider, int color1, int color2)` -> `int`
- `getVisibilityFactor()` -> `float`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `set(TL_stars.Tl_starsRating starsRating)` -> `void`
- `setDelegate(Delegate delegate)` -> `void`
- `setParentExpanded(float parentExpanded)` -> `void`
- `setResourcesProvider(Theme.ResourcesProvider resourcesProvider)` -> `void`
- `setVisibility(boolean isVisible)` -> `void`
- `updateColors(MessagesController.PeerColor peerColor)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Components.StaticLayoutEx`
- `static ALIGN_LEFT()` -> `Layout.Alignment`
- `static ALIGN_RIGHT()` -> `Layout.Alignment`
- `static createStaticLayout(CharSequence source, TextPaint paint, int width, Layout.Alignment align, float spacingmult, float spacingadd, boolean includepad, TextUtils.TruncateAt ellipsize, int ellipsisWidth, int maxLines)` -> `StaticLayout`
- `static createStaticLayout(CharSequence source, TextPaint paint, int outerWidth, Layout.Alignment align, float spacingMult, float spacingAdd, boolean includePad, TextUtils.TruncateAt ellipsize, int ellipsisWidth, int maxLines, boolean canContainUrl)` -> `StaticLayout`
- `static createStaticLayout2(CharSequence source, TextPaint paint, int width, Layout.Alignment align, float spacingmult, float spacingadd, boolean includepad, TextUtils.TruncateAt ellipsize, int ellipsisWidth, int maxLines)` -> `StaticLayout`
- `static init()` -> `void`

## `org.telegram.ui.Components.StatusBadgeComponent`
- `getDrawable()` -> `Drawable`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `updateDrawable(TLObject object, int colorFilter, boolean animated)` -> `Drawable`
- `updateDrawable(TLRPC.User user, TLRPC.Chat chat, int colorFilter, boolean animated)` -> `Drawable`

## `org.telegram.ui.Components.StatusDrawable`
- `invalidateLimited()` -> `void`

## `org.telegram.ui.Components.StorageDiagramView`
- `calculateSize()` -> `long`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onAvatarClick()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setCacheModel(CacheModel cacheModel)` -> `void`
- `setData(CacheModel cacheModel, ClearViewData[] data)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `update(boolean animate)` -> `void`
- `updateDescription()` -> `long`

## `org.telegram.ui.Components.StorageDiagramView$ClearViewData`
- `setClear(boolean clear)` -> `void`

## `org.telegram.ui.Components.StorageUsageView`
- `invalidate()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setStorageUsage(boolean calculating, long database, long totalSize, long totalDeviceFreeSize, long totalDeviceSize)` -> `void`

## `org.telegram.ui.Components.StorageUsageView$ProgressView`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Components.SubstringLayoutAnimator`
- `create(StaticLayout hintLayout, CharSequence hint, CharSequence text, TextPaint paint)` -> `void`
- `draw(Canvas canvas, TextPaint paint)` -> `void`

## `org.telegram.ui.Components.SuggestBirthdayActionLayout`
- `attach()` -> `void`
- `detach()` -> `void`
- `draw(Canvas canvas)` -> `void`
- `height()` -> `int`
- `onTouchEvent(MotionEvent e)` -> `boolean`
- `open()` -> `void`
- `set(MessageObject messageObject)` -> `void`
- `width()` -> `int`

## `org.telegram.ui.Components.SuggestionOffer`
- `draw(Canvas canvas, int parentWidth, float sideMenuWidth, float top, float bgAlpha, float alpha, boolean withCenter)` -> `void`
- `getHeight()` -> `int`
- `getThemedPaint(String paintKey)` -> `Paint`
- `getWidth()` -> `int`
- `update(MessageObject messageObject)` -> `void`

## `org.telegram.ui.Components.SuggestionOffer$Row`
- `getHeight()` -> `int`

## `org.telegram.ui.Components.SummaryIcon`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `set(boolean on)` -> `void`
- `set(boolean on, boolean animated)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.Switch`
- `getIconProgress()` -> `float`
- `getProgress()` -> `float`
- `hasIcon()` -> `boolean`
- `isChecked()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setChecked(boolean checked, int iconType, boolean animated)` -> `void`
- `setColors(int track, int trackChecked, int thumb, int thumbChecked)` -> `void`
- `setDrawIconType(int type)` -> `void`
- `setDrawIconType(int iconType, boolean animated)` -> `void`
- `setDrawRipple(boolean value)` -> `void`
- `setIcon(int icon)` -> `void`
- `setIconProgress(float value)` -> `void`
- `setIconVisible(boolean visible, boolean animated)` -> `void`
- `setOnCheckedChangeListener(OnCheckedChangeListener listener)` -> `void`
- `setOverrideColor(int override)` -> `void`
- `setOverrideColorProgress(float cx, float cy, float rad)` -> `void`
- `setProgress(float value)` -> `void`
- `verifyDrawable(Drawable who)` -> `boolean`

## `org.telegram.ui.Components.TableLayout`
- `static adjust(int measureSpec, int delta)` -> `int`
- `static append(T[] a, T[] b)` -> `T[]`
- `dispatchHoverEvent(MotionEvent event)` -> `boolean`
- `static getAlignment(int gravity, boolean horizontal)` -> `Alignment`
- `getAlignmentMode()` -> `int`
- `getChildAt(int index)` -> `Child`
- `getChildCount()` -> `int`
- `getColumnCount()` -> `int`
- `getMargin1(Child view, boolean horizontal, boolean leading)` -> `int`
- `getMeasurementIncludingMargin(Child c, boolean horizontal)` -> `int`
- `getOrientation()` -> `int`
- `getRenderHeight()` -> `int`
- `getRowCount()` -> `int`
- `getUseDefaultMargins()` -> `boolean`
- `isColumnOrderPreserved()` -> `boolean`
- `isRowOrderPreserved()` -> `boolean`
- `static max2(int[] a, int valueIfEmpty)` -> `int`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthSpec, int heightSpec)` -> `void`
- `setAlignmentMode(int alignmentMode)` -> `void`
- `setCellPadding(int horizontal, int top, int bottom)` -> `void`
- `setColumnCount(int columnCount)` -> `void`
- `setColumnOrderPreserved(boolean columnOrderPreserved)` -> `void`
- `setDrawLines(boolean value)` -> `void`
- `setFillWidth(boolean fillWidth)` -> `void`
- `setMinimumCellHeight(int value)` -> `void`
- `setOrientation(int orientation)` -> `void`
- `setRenderWidth(int width)` -> `void`
- `setRowCount(int rowCount)` -> `void`
- `setRowOrderPreserved(boolean rowOrderPreserved)` -> `void`
- `setRtl(boolean value)` -> `void`
- `setStriped(boolean value)` -> `void`
- `setUseDefaultMargins(boolean useDefaultMargins)` -> `void`
- `static spec(int start, int size, Alignment alignment, float weight)` -> `Spec`
- `static spec(int start, Alignment alignment, float weight)` -> `Spec`
- `static spec(int start, int size, float weight)` -> `Spec`
- `static spec(int start, float weight)` -> `Spec`
- `static spec(int start, int size, Alignment alignment)` -> `Spec`
- `static spec(int start, Alignment alignment)` -> `Spec`
- `static spec(int start, int size)` -> `Spec`
- `static spec(int start)` -> `Spec`

## `org.telegram.ui.Components.TableLayout$Alignment`
- `getBounds()` -> `Bounds`
- `getSizeInCell(Child view, int viewSize, int cellSize)` -> `int`

## `org.telegram.ui.Components.TableLayout$Assoc`
- `static of(Class<K> keyType, Class<V> valueType)` -> `Assoc<K, V>`
- `pack()` -> `PackedMap<K, V>`

## `org.telegram.ui.Components.TableLayout$Axis`
- `getArcs()` -> `Arc[]`
- `getCount()` -> `int`
- `getDeltas()` -> `int[]`
- `getGroupBounds()` -> `PackedMap<Spec, Bounds>`
- `getLeadingMargins()` -> `int[]`
- `getLocations()` -> `int[]`
- `getMeasure(int measureSpec)` -> `int`
- `getTrailingMargins()` -> `int[]`
- `groupArcsByFirstVertex(Arc[] arcs)` -> `Arc[][]`
- `invalidateStructure()` -> `void`
- `invalidateValues()` -> `void`
- `layout(int size)` -> `void`
- `setCount(int count)` -> `void`
- `setOrderPreserved(boolean orderPreserved)` -> `void`

## `org.telegram.ui.Components.TableLayout$Bounds`
- `getOffset(TableLayout gl, Child c, Alignment a, int size, boolean horizontal)` -> `int`
- `include(int before, int after)` -> `void`
- `include(TableLayout gl, Child c, Spec spec, Axis axis, int size)` -> `void`
- `reset()` -> `void`
- `size(boolean min)` -> `int`

## `org.telegram.ui.Components.TableLayout$CellText`
- `getEmojiOnlyCount()` -> `default int`
- `getText()` -> `default CharSequence`

## `org.telegram.ui.Components.TableLayout$Child`
- `draw(Canvas canvas, View view)` -> `void`
- `draw(Canvas canvas, View view, boolean drawText)` -> `void`
- `getLayoutParams()` -> `LayoutParams`
- `getMeasuredHeight()` -> `int`
- `getMeasuredWidth()` -> `int`
- `getRow()` -> `int`
- `getTextX()` -> `int`
- `getTextY()` -> `int`
- `layout(int left, int top, int right, int bottom)` -> `void`
- `measure(int width, int height, boolean first)` -> `void`
- `setFixedHeight(int value)` -> `void`
- `setSelectionIndex(int selectionIndex)` -> `void`
- `setTextLayout(CellText cellLayout)` -> `void`

## `org.telegram.ui.Components.TableLayout$Interval`
- `equals(Object that)` -> `boolean`
- `inverse()` -> `Interval`
- `size()` -> `int`

## `org.telegram.ui.Components.TableLayout$LayoutParams`
- `equals(Object o)` -> `boolean`
- `setColumnSpecSpan(Interval span)` -> `void`
- `setGravity(int gravity)` -> `void`
- `setRowSpecSpan(Interval span)` -> `void`

## `org.telegram.ui.Components.TableLayout$MutableInt`
- `reset()` -> `void`

## `org.telegram.ui.Components.TableLayout$PackedMap`
- `getValue(int i)` -> `V`

## `org.telegram.ui.Components.TableLayout$Spec`
- `copyWriteAlignment(Alignment alignment)` -> `Spec`
- `copyWriteSpan(Interval span)` -> `Spec`
- `equals(Object that)` -> `boolean`
- `getFlexibility()` -> `int`

## `org.telegram.ui.Components.TableLayout$TableA11yHelper`
- `getVirtualViewAt(float x, float y)` -> `int`
- `getVisibleVirtualViews(List<Integer> list)` -> `void`
- `onPerformActionForVirtualView(int id, int action, android.os.Bundle args)` -> `boolean`
- `onPopulateNodeForVirtualView(int id, @NonNull AccessibilityNodeInfoCompat info)` -> `void`

## `org.telegram.ui.Components.TableLayout$TableLayoutDelegate`
- `onLayoutChild(CellText text, int x, int y)` -> `default void`

## `org.telegram.ui.Components.TableView`
- `clear()` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`

## `org.telegram.ui.Components.TableView$TableRowContent`
- `onDraw(Canvas canvas)` -> `void`
- `setFirstLast(boolean first, boolean last)` -> `void`
- `setLeftRight(boolean left, boolean right)` -> `void`

## `org.telegram.ui.Components.TableView$TableRowFullContent`
- `onDraw(Canvas canvas)` -> `void`
- `setFilled(boolean filled)` -> `void`
- `setFirstLast(boolean first, boolean last)` -> `void`

## `org.telegram.ui.Components.TableView$TableRowTitle`
- `onDraw(Canvas canvas)` -> `void`
- `setFirstLast(boolean first, boolean last)` -> `void`

## `org.telegram.ui.Components.TagEditCell`
- `isOverLimit()` -> `boolean`
- `set(TLRPC.User user, String rank, boolean admin, boolean owner, Utilities.Callback<String> onRankEdited)` -> `void`
- `static showInfoSheet(Context context, int currentAccount, long dialogId, TLRPC.User user, String rank, boolean admin, boolean owner, boolean admin_can_edit, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static showSheet(Context context, int currentAccount, long dialogId, TLRPC.User user, String rank, boolean admin, boolean owner, Theme.ResourcesProvider resourcesProvider)` -> `void`

## `org.telegram.ui.Components.TagEditCell$LineSpan`
- `draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, @NonNull Paint paint)` -> `void`
- `getSize(@NonNull Paint paint, CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm)` -> `int`

## `org.telegram.ui.Components.TelegramRoundVideoUpload`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onOutputError(long outputId, @NonNull Exception error)` -> `void`
- `onOutputStarted(long outputId, @NonNull File file)` -> `void`
- `release(boolean cancelUploads)` -> `void`

## `org.telegram.ui.Components.TermsOfServiceView`
- `setDelegate(TermsOfServiceViewDelegate termsOfServiceViewDelegate)` -> `void`
- `show(int account, TLRPC.TL_help_termsOfService tos)` -> `void`

## `org.telegram.ui.Components.Text`
- `align(Layout.Alignment align)` -> `Text`
- `calculateRealWidth()` -> `float`
- `detach()` -> `void`
- `doNotSave()` -> `Text`
- `draw(Canvas canvas, int color)` -> `void`
- `draw(Canvas canvas, float x, float cy, int color, float alpha)` -> `void`
- `draw(Canvas canvas, float x, float cy)` -> `void`
- `draw(Canvas canvas, float x, float cy, float alpha)` -> `void`
- `draw(Canvas canvas)` -> `void`
- `ellipsize(float width)` -> `Text`
- `getCurrentWidth()` -> `float`
- `getFontMetricsInt()` -> `Paint.FontMetricsInt`
- `getHeight()` -> `float`
- `getLayout()` -> `Layout`
- `getLineCount()` -> `int`
- `getText()` -> `CharSequence`
- `getTextSize()` -> `float`
- `getWidth()` -> `float`
- `hackClipBounds()` -> `Text`
- `lineSpacing(float addPx)` -> `Text`
- `multiline(int maxLines)` -> `Text`
- `setAlpha(int alpha)` -> `Text`
- `setColor(int color)` -> `Text`
- `setEmojiCacheType(int cacheType)` -> `Text`
- `setMaxWidth(float maxWidth)` -> `Text`
- `setShadow(float shadowAlpha)` -> `Text`
- `setText(CharSequence text)` -> `void`
- `setTextSizePx(float px)` -> `Text`
- `setVerticalClipPadding(int pad)` -> `Text`
- `supportAnimatedEmojis(View view)` -> `Text`

## `org.telegram.ui.Components.TextHelper`
- `static makeLinkTextView(Context context, float textSizeDp, int colorKey, boolean bold)` -> `LinkSpanDrawable.LinksTextView`
- `static makeLinkTextView(Context context, float textSizeDp, int colorKey, boolean bold, Theme.ResourcesProvider resourcesProvider)` -> `LinkSpanDrawable.LinksTextView`
- `static makeLinkTextView(Context context, float textSizeDp, int colorKey, int linkColorKey, boolean bold)` -> `LinkSpanDrawable.LinksTextView`
- `static makeLinkTextView(Context context, float textSizeDp, int colorKey, int linkColorKey, boolean bold, Theme.ResourcesProvider resourcesProvider)` -> `LinkSpanDrawable.LinksTextView`
- `static makeTextView(Context context, float textSizeDp, int colorKey, boolean bold)` -> `TextView`
- `static makeTextView(Context context, float textSizeDp, int colorKey, boolean bold, Theme.ResourcesProvider resourcesProvider)` -> `TextView`

## `org.telegram.ui.Components.TextPaintImageReceiverSpan`
- `draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint)` -> `void`
- `getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm)` -> `int`

## `org.telegram.ui.Components.TextPaintMarkSpan`
- `getTextPaint()` -> `TextPaint`
- `updateDrawState(TextPaint p)` -> `void`
- `updateMeasureState(TextPaint p)` -> `void`

## `org.telegram.ui.Components.TextPaintSpan`
- `updateDrawState(TextPaint p)` -> `void`
- `updateMeasureState(TextPaint p)` -> `void`

## `org.telegram.ui.Components.TextPaintUrlSpan`
- `getTextPaint()` -> `TextPaint`
- `getUrl()` -> `String`
- `updateDrawState(TextPaint p)` -> `void`
- `updateMeasureState(TextPaint p)` -> `void`

## `org.telegram.ui.Components.TextSelectionHint`
- `getPrepareProgress()` -> `float`
- `hide()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.Components.TextStyleSpan`
- `getStyleFlags()` -> `int`
- `getTextStyleRun()` -> `TextStyleRun`
- `getTypeface()` -> `Typeface`
- `isBold()` -> `boolean`
- `isBoldItalic()` -> `boolean`
- `isItalic()` -> `boolean`
- `setColor(int value)` -> `void`
- `setSpoilerRevealed(boolean b)` -> `void`
- `updateDrawState(TextPaint p)` -> `void`
- `updateMeasureState(TextPaint p)` -> `void`

## `org.telegram.ui.Components.TextStyleSpan$TextStyleRun`
- `applyStyle(TextPaint p)` -> `void`
- `getTypeface()` -> `Typeface`
- `merge(TextStyleRun run)` -> `void`
- `replace(TextStyleRun run)` -> `void`

## `org.telegram.ui.Components.TextViewSwitcher`
- `getCurrentView()` -> `TextView`
- `getNextView()` -> `TextView`
- `invalidateViews()` -> `void`
- `setText(CharSequence text)` -> `void`
- `setText(CharSequence text, boolean animated)` -> `void`
- `setText(CharSequence text, boolean animated, boolean forceUpdate)` -> `boolean`

## `org.telegram.ui.Components.ThanosEffect`
- `animate(View view, Runnable whenDone)` -> `void`
- `animate(View view, float durationMultipier, Runnable whenDone)` -> `void`
- `animate(Matrix matrix, Bitmap bitmap, Runnable whenStarted, Runnable whenDone)` -> `void`
- `animateGroup(ArrayList<View> views, Runnable whenDone)` -> `void`
- `static ensureRunOnUIThread(Runnable runnable)` -> `void`
- `kill()` -> `void`
- `scroll(int dx, int dy)` -> `void`
- `static supports()` -> `boolean`

## `org.telegram.ui.Components.ThanosEffect$DrawingThread`
- `animate(View view, float durationMultipier, Runnable whenDone)` -> `void`
- `animate(Matrix matrix, Bitmap bitmap, Runnable whenStart, Runnable whenDone)` -> `void`
- `animateGroup(ArrayList<View> views, Runnable whenDone)` -> `void`
- `handleMessage(Message inputMessage)` -> `void`
- `kill()` -> `void`
- `resize(int width, int height)` -> `void`
- `run()` -> `void`
- `scroll(int dx, int dy)` -> `void`

## `org.telegram.ui.Components.ThanosEffect$DrawingThread$Animation`
- `calcParticlesGrid(float part)` -> `void`
- `done(boolean runCallback)` -> `void`
- `draw()` -> `void`

## `org.telegram.ui.Components.TimerDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `getTime()` -> `int`
- `static getTtlIcon(int ttl)` -> `TimerDrawable`
- `static getTtlIconForDialogs(int ttl)` -> `TimerDrawable`
- `setAlpha(int alpha)` -> `void`
- `setBackgroundColor(int currentActionBarColor)` -> `void`
- `setColorFilter(ColorFilter cf)` -> `void`
- `setTime(int value)` -> `void`

## `org.telegram.ui.Components.TimerParticles`
- `draw(Canvas canvas, Paint particlePaint, RectF rect, float radProgress, float alpha)` -> `void`

## `org.telegram.ui.Components.Tooltip`
- `hide()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `show(View anchor)` -> `void`

## `org.telegram.ui.Components.TopViewCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setEmoji(String setName, String emoji)` -> `void`
- `setEmoji(int iconResId)` -> `void`
- `setEmojiSize(int size)` -> `void`
- `setEmojiStatic(int iconResId)` -> `void`
- `setText(CharSequence text)` -> `void`
- `setText(CharSequence title, CharSequence text)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.TopicButton`
- `attach()` -> `void`
- `detach()` -> `void`
- `draw(Canvas canvas, float x, float y, float alpha)` -> `void`
- `getBackgroundColor(int iconColor)` -> `int`
- `getColor(int iconColor)` -> `int`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `update(MessageObject messageObject)` -> `boolean`

## `org.telegram.ui.Components.TopicSeparator`
- `attach()` -> `void`
- `detach()` -> `void`
- `draw(Canvas canvas, int parentWidth, float sideMenuWidth, float top, float bgAlpha, float alpha, boolean withCenter)` -> `void`
- `onTouchEvent(MotionEvent event, boolean removePadding)` -> `boolean`
- `setOnClickListener(Runnable listener)` -> `void`
- `setText(String text)` -> `void`
- `update(MessageObject messageObject)` -> `boolean`

## `org.telegram.ui.Components.TopicSeparator$Cell`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `set(MessageObject object)` -> `void`
- `setBackgroundHeight(int backgroundHeight)` -> `void`
- `setOnTopicClickListener(Utilities.Callback<Long> listener)` -> `void`

## `org.telegram.ui.Components.TopicsTabsView`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `doOnUpdateSideMenuPosition(Runnable runnable)` -> `void`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getCurrentTabsPosition()` -> `Position`
- `getSideMenuT()` -> `float`
- `getTabsVisibleSpaceWithPadding(Position position, float padding)` -> `float`
- `getTopic(long id)` -> `TLRPC.TL_forumTopic`
- `isSideMenuEnabled()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `selectTopic(long topicId, boolean fromMessage)` -> `void`
- `setAllTopicsHidden(boolean allTopicsHidden)` -> `void`
- `setCurrentTopic(long topicId)` -> `void`
- `setOnDialogSelected(Utilities.Callback2<Long, Boolean> listener)` -> `void`
- `setOnNewTopicSelected(Runnable listener)` -> `void`
- `setOnTopicSelected(Utilities.Callback2<Integer, Boolean> listener)` -> `void`
- `setSideMenuBackgroundDrawable(BlurredBackgroundDrawable sideMenuBackgroundDrawable)` -> `void`
- `setSideMenuBackgroundMarginBottom(float margin)` -> `void`
- `setSideMenuBackgroundMarginTop(float margin)` -> `void`
- `setTopMenuBackgroundDrawable(BlurredBackgroundDrawable sideMenuBackgroundDrawable)` -> `void`
- `updateSidemenuPosition()` -> `void`

## `org.telegram.ui.Components.TopicsTabsView$BotNewTopicDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `onBoundsChange(@NonNull Rect bounds)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.TopicsTabsView$HorizontalTabView`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getTopicId()` -> `long`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(long dialogId, TLRPC.TL_forumTopic topic, boolean selected)` -> `void`
- `setAdd()` -> `void`
- `setAll(boolean bot, boolean mono, boolean selected)` -> `void`
- `setLoading()` -> `void`
- `setMf(long chatDialogId, TLRPC.TL_forumTopic dialog, boolean selected)` -> `void`
- `setReorder(boolean value)` -> `void`
- `setSelected(boolean selected)` -> `void`

## `org.telegram.ui.Components.TopicsTabsView$HorizontalTabView$Factory`
- `static asAdd()` -> `UItem`
- `static asAll(boolean botforum, boolean monoforum)` -> `UItem`
- `static asLoading(int id)` -> `UItem`
- `static asTab(long dialogId, TLRPC.TL_forumTopic topic, boolean mono)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `HorizontalTabView`

## `org.telegram.ui.Components.TopicsTabsView$VerticalTabView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(long dialogId, TLRPC.TL_forumTopic topic, boolean selected)` -> `void`
- `setAdd(boolean mono, boolean selected)` -> `void`
- `setAll(boolean bot, boolean mono, boolean selected)` -> `void`
- `setLoading()` -> `void`
- `setMf(TLRPC.TL_forumTopic dialog, boolean selected)` -> `void`
- `setReorder(boolean value)` -> `void`
- `setSelected(boolean selected)` -> `void`

## `org.telegram.ui.Components.TopicsTabsView$VerticalTabView$Factory`
- `static asAdd(boolean monoforum)` -> `UItem`
- `static asAll(boolean botforum, boolean monoforum)` -> `UItem`
- `static asLoading(int id)` -> `UItem`
- `static asTab(long dialogId, TLRPC.TL_forumTopic topic, boolean mono)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `VerticalTabView`

## `org.telegram.ui.Components.TornEdge`
- `static bitmapHeight(Params p)` -> `int`
- `static createTearBitmap(Params p, int width, int seed)` -> `Bitmap`
- `static fragmentHeight(Params p)` -> `int`
- `static profile(Params p, int widthPx, int seed)` -> `float[]`

## `org.telegram.ui.Components.TornEdge$Params`
- `maxDeviationDp()` -> `float`
- `paddingPx()` -> `int`

## `org.telegram.ui.Components.TranscribeButton`
- `draw(Canvas canvas, float alpha)` -> `void`
- `drawGradientBackground(Canvas canvas, Rect bounds, float alpha)` -> `void`
- `static finishTranscription(MessageObject messageObject, long transcription_id, String text)` -> `boolean`
- `static getTranscribeTrialCount(int currentAccount)` -> `int`
- `height()` -> `int`
- `onOpen()` -> `void`
- `onTap()` -> `void`
- `onTouch(int action, float x, float y)` -> `boolean`
- `static openVideoTranscription(MessageObject messageObject)` -> `void`
- `static resetVideoTranscriptionsOpen()` -> `void`
- `setBounds(int x, int y, int w, int h, int r)` -> `void`
- `setColor(int color, int grayColor, boolean isOut, float bgBack)` -> `void`
- `setLoading(boolean loading, boolean animated)` -> `void`
- `setLock(boolean drawLock, boolean animated)` -> `void`
- `setOpen(boolean open, boolean animated)` -> `void`
- `static showOffTranscribe(MessageObject messageObject)` -> `void`
- `static showOffTranscribe(MessageObject messageObject, boolean notify)` -> `void`
- `static showTranscribeLock(MessageObject messageObject)` -> `boolean`
- `width()` -> `int`

## `org.telegram.ui.Components.TranscribeButton$LoadingPointsDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int i)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.TranscribeButton$LoadingPointsSpan`
- `updateDrawState(TextPaint textPaint)` -> `void`

## `org.telegram.ui.Components.TransitionExt`
- `static createSimpleTransition()` -> `Transition`

## `org.telegram.ui.Components.TranslateAlert2`
- `static alternativeTranslate(String text, String fromLng, String toLng, Utilities.Callback2<String, Boolean> done)` -> `void`
- `static capitalFirst(String text)` -> `String`
- `static capitalFirst(CharSequence text)` -> `CharSequence`
- `static cut(String encodedText, int maxLength)` -> `ArrayList<String>`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `dismissInternal()` -> `void`
- `static getToLanguage()` -> `String`
- `static languageName(String locale)` -> `String`
- `static languageName(String locale, boolean[] accusative)` -> `String`
- `static languageName(String locale, boolean[] accusative, boolean[] genitive)` -> `String`
- `static languageNameCapital(String locale)` -> `String`
- `static lowerFirst(String text)` -> `String`
- `static lowerFirst(CharSequence text)` -> `CharSequence`
- `static preprocess(TLRPC.TL_textWithEntities source, TLRPC.TL_textWithEntities received)` -> `TLRPC.TL_textWithEntities`
- `static preprocess(ArrayList<TLRPC.TL_textWithEntities> received)` -> `ArrayList<TLRPC.TL_textWithEntities>`
- `static resetToLanguage()` -> `void`
- `setFragment(BaseFragment fragment)` -> `void`
- `setNoforwards(boolean noforwards)` -> `void`
- `setOnLinkPress(Utilities.CallbackReturn<URLSpan, Boolean> onLinkPress)` -> `void`
- `static setToLanguage(String toLang)` -> `void`
- `show()` -> `void`
- `static showAlert(Context context, BaseFragment fragment, int currentAccount, TLRPC.InputPeer peer, int msgId, boolean sum, String fromLanguage, String toLanguage, CharSequence text, ArrayList<TLRPC.MessageEntity> entities, boolean noforwards, Utilities.CallbackReturn<URLSpan, Boolean> onLinkPress, Runnable onDismiss)` -> `TranslateAlert2`
- `static showAlert(Context context, BaseFragment fragment, int currentAccount, TLRPC.InputPeer peer, int msgId, String fromLanguage, String toLanguage, TL_iv.RichMessage richMessage, boolean noforwards, Utilities.CallbackReturn<URLSpan, Boolean> onLinkPress, Runnable onDismiss)` -> `TranslateAlert2`
- `static showAlert(Context context, BaseFragment fragment, int currentAccount, String fromLanguage, String toLanguage, CharSequence text, ArrayList<TLRPC.MessageEntity> entities, boolean noforwards, Utilities.CallbackReturn<URLSpan, Boolean> onLinkPress, Runnable onDismiss)` -> `TranslateAlert2`
- `static systemLanguageName(String langCode)` -> `String`
- `static systemLanguageName(String langCode, boolean inItsOwnLocale)` -> `String`
- `translate()` -> `void`

## `org.telegram.ui.Components.TranslateAlert2$ContainerView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setTranslationY(float translationY)` -> `void`

## `org.telegram.ui.Components.TranslateAlert2$HeaderView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `openLanguagesSelect()` -> `void`
- `setTranslationY(float translationY)` -> `void`

## `org.telegram.ui.Components.TranslateAlert2$LoadingTextView`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setText(CharSequence text, BufferType type)` -> `void`
- `setTextColor(int color)` -> `void`

## `org.telegram.ui.Components.TranslateAlert2$PaddedAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `updateMainView(View newMainView)` -> `void`

## `org.telegram.ui.Components.TranslateAlert3`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `getTitle()` -> `CharSequence`
- `onActionBarAlpha(float alpha)` -> `void`
- `onContainerViewTranslation()` -> `void`
- `setMessage(long dialogId, int messageId)` -> `TranslateAlert3`
- `setMessage(long dialogId, int messageId, boolean summarized)` -> `TranslateAlert3`
- `setNoforwards(boolean noforwards)` -> `TranslateAlert3`
- `setOnLinkPress(Utilities.CallbackReturn<URLSpan, Boolean> onLinkPress)` -> `TranslateAlert3`
- `setOnUse(Utilities.Callback<CharSequence> onUse)` -> `TranslateAlert3`
- `setText(String from_lang, CharSequence text)` -> `TranslateAlert3`
- `setText(CharSequence text)` -> `TranslateAlert3`
- `setToLanguage(String to_lang)` -> `TranslateAlert3`
- `show()` -> `void`

## `org.telegram.ui.Components.TranslateAlert3$Header`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(CharSequence text1, CharSequence text2, CharSequence text3, View.OnClickListener onText2Click, boolean emojify, View.OnClickListener onEmojifyClick, View.OnClickListener onAnotherExampleClick)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.TranslateAlert3$Header$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `contentsEquals(UItem a, UItem b)` -> `boolean`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `Header`
- `equals(UItem a, UItem b)` -> `boolean`

## `org.telegram.ui.Components.TranslateAlert3$Text`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(CharSequence _text, boolean collapsed, View.OnClickListener click, LinkSpanDrawable.LinksTextView.OnLinkPress onLinkPress, boolean noforwards, View.OnClickListener onCopyClick, boolean divider)` -> `void`
- `setHandlesColor(int color)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.TranslateAlert3$Text$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `contentsEquals(UItem a, UItem b)` -> `boolean`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `Text`
- `equals(UItem a, UItem b)` -> `boolean`
- `static of(int id, CharSequence text, boolean collapsed, boolean noforwards, View.OnClickListener uncollapse, LinkSpanDrawable.LinksTextView.OnLinkPress onLinkPress, View.OnClickListener onCopyClicked)` -> `UItem`

## `org.telegram.ui.Components.TranslateButton`
- `onButtonClick()` -> `void`
- `onCloseClick()` -> `void`
- `onMenuClick()` -> `void`
- `setLeftMargin(float leftMargin)` -> `void`
- `static showCocoonAlert(Context context, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `updateColors()` -> `void`
- `updateText()` -> `void`

## `org.telegram.ui.Components.TypefaceSpan`
- `getTypeface()` -> `Typeface`
- `isBold()` -> `boolean`
- `isItalic()` -> `boolean`
- `isMono()` -> `boolean`
- `setColor(int value)` -> `void`
- `updateDrawState(TextPaint tp)` -> `void`
- `updateMeasureState(TextPaint p)` -> `void`

## `org.telegram.ui.Components.TypingDotsDrawable`
- `draw(Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `isStarted()` -> `boolean`
- `setAlpha(int alpha)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(ColorFilter cf)` -> `void`
- `setIgnoreAnimationLocks()` -> `void`
- `setIsChat(boolean value)` -> `void`
- `start()` -> `void`
- `stop()` -> `void`

## `org.telegram.ui.Components.UItem`
- `accent()` -> `UItem`
- `static asAddChat(Long dialogId)` -> `UItem`
- `static asAddChat(Long dialogId, String query)` -> `UItem`
- `static asAnimatedHeader(int id, CharSequence text)` -> `UItem`
- `static asBlackHeader(CharSequence text)` -> `UItem`
- `static asBusinessChatLink(BusinessLinksActivity.BusinessLinkWrapper businessLink)` -> `UItem`
- `static asButton(int id, CharSequence text)` -> `UItem`
- `static asButton(int id, int iconResId, CharSequence text)` -> `UItem`
- `static asButton(int id, Drawable icon, CharSequence text)` -> `UItem`
- `static asButton(int id, CharSequence text, CharSequence value)` -> `UItem`
- `static asButton(int id, int iconResId, CharSequence text, CharSequence value)` -> `UItem`
- `static asButtonCheck(int id, CharSequence text, CharSequence subtext)` -> `UItem`
- `static asButtonLoadingValue(int id, CharSequence text)` -> `UItem`
- `static asCenterShadow(CharSequence text)` -> `UItem`
- `static asChart(int type, int stats_dc, StatisticActivity.ChartViewData data)` -> `UItem`
- `static asCheck(CharSequence text)` -> `UItem`
- `static asCheck(int id, CharSequence text)` -> `UItem`
- `static asCustom(int id, View view)` -> `UItem`
- `static asCustom(View view)` -> `UItem`
- `static asCustom(View view, int heightDp)` -> `UItem`
- `static asCustomShadow(int id, View view)` -> `UItem`
- `static asCustomShadow(View view)` -> `UItem`
- `static asCustomShadow(View view, boolean noclip)` -> `UItem`
- `static asCustomShadow(View view, int heightDp)` -> `UItem`
- `static asExpandableSwitch(int id, CharSequence text, CharSequence subText)` -> `UItem`
- `static asFilterChat(boolean include, long dialogId)` -> `UItem`
- `static asFilterChat(boolean include, CharSequence name, String chatType, int flags)` -> `UItem`
- `static asFlicker(int type)` -> `UItem`
- `static asFlicker(int id, int type)` -> `UItem`
- `static asFullscreenCustom(View view, int minusHeight)` -> `UItem`
- `static asFullscreenCustom(View view, int minusHeight, boolean minusPadding)` -> `UItem`
- `static asFullyCustom(View view)` -> `UItem`
- `static asGraySection(CharSequence text)` -> `UItem`
- `static asGraySection(CharSequence text, CharSequence button, View.OnClickListener onClickListener)` -> `UItem`
- `static asHeader(CharSequence text)` -> `UItem`
- `static asHeader(int id, CharSequence text)` -> `UItem`
- `static asLargeHeader(CharSequence text)` -> `UItem`
- `static asLargeQuickReply(QuickRepliesController.QuickReply quickReply)` -> `UItem`
- `static asLargeShadow(CharSequence text)` -> `UItem`
- `static asProceedOverview(ChannelMonetizationLayout.ProceedOverview value)` -> `UItem`
- `static asProfileCell(TLObject obj)` -> `UItem`
- `static asQuickReply(QuickRepliesController.QuickReply quickReply)` -> `UItem`
- `static asRadio(int id, CharSequence text)` -> `UItem`
- `static asRadio(int id, CharSequence text, CharSequence value)` -> `UItem`
- `static asRadio2(int id, CharSequence text, CharSequence value)` -> `UItem`
- `static asRadioUser(Object object)` -> `UItem`
- `static asRippleCheck(int id, CharSequence text)` -> `UItem`
- `static asRoundCheckbox(CharSequence text)` -> `UItem`
- `static asRoundCheckbox(int id, CharSequence text)` -> `UItem`
- `static asRoundGroupCheckbox(int id, CharSequence text, CharSequence subtext)` -> `UItem`
- `static asSearchMessage(MessageObject messageObject)` -> `UItem`
- `static asSearchMessage(int id, MessageObject messageObject)` -> `UItem`
- `static asSettingsCell(int id, int icon, CharSequence text)` -> `UItem`
- `static asSettingsCell(int id, CharSequence text, CharSequence value)` -> `UItem`
- `static asSettingsCell(int id, int icon, CharSequence text, CharSequence value)` -> `UItem`
- `static asShadow(CharSequence text)` -> `UItem`
- `static asShadow(int id, CharSequence text)` -> `UItem`
- `static asShadowCollapseButton(int id, CharSequence text)` -> `UItem`
- `static asSlideView(String[] choices, int chosen, Utilities.Callback<Integer> whenChose)` -> `UItem`
- `static asSpace(int height)` -> `UItem`
- `static asSpace(int tag, int height)` -> `UItem`
- `static asSpace(int tag, int height, int bg)` -> `UItem`
- `static asStickerButton(int id, CharSequence text, TLRPC.Document sticker)` -> `UItem`
- `static asStickerButton(int id, CharSequence text, String stickerPath)` -> `UItem`
- `static asSwitch(int id, CharSequence text)` -> `UItem`
- `static asSwitchNoIcon(int id, CharSequence text)` -> `UItem`
- `static asTopView(CharSequence title, CharSequence subtitle, String setName, String emoji)` -> `UItem`
- `static asTopView(CharSequence title, CharSequence subtitle, int emojiSize, String setName, String emoji)` -> `UItem`
- `static asTopView(CharSequence text, String setName, String emoji)` -> `UItem`
- `static asTopView(CharSequence title, CharSequence text, int lottieResId)` -> `UItem`
- `static asTopView(CharSequence text, int lottieResId)` -> `UItem`
- `static asTopViewStatic(CharSequence text, int iconResId)` -> `UItem`
- `static asTransaction(TL_stats.BroadcastRevenueTransaction transaction)` -> `UItem`
- `static asUserCheckbox(int id, TLObject user)` -> `UItem`
- `static asUserGroupCheckbox(int id, CharSequence text, CharSequence subtext)` -> `UItem`
- `contentsEquals(AdapterWithDiffUtils.Item o)` -> `boolean`
- `equals(Object o)` -> `boolean`
- `static findFactory(int viewType)` -> `UItemFactory<?>`
- `itemContentEquals(UItem item)` -> `boolean`
- `itemEquals(UItem item)` -> `boolean`
- `locked()` -> `UItem`
- `onBind(Utilities.Callback<View> bind)` -> `UItem`
- `pad()` -> `UItem`
- `red()` -> `UItem`
- `setChecked(boolean checked)` -> `UItem`
- `setClickCallback(View.OnClickListener clickCallback)` -> `UItem`
- `setClickCallback2(View.OnClickListener clickCallback)` -> `UItem`
- `setCloseIcon(View.OnClickListener onCloseClick)` -> `UItem`
- `setCollapsed(boolean collapsed)` -> `UItem`
- `setEnabled(boolean enabled)` -> `UItem`
- `setId(int id)` -> `UItem`
- `setLocked(boolean locked)` -> `UItem`
- `setMinSliderValue(int value)` -> `UItem`
- `setPad(int pad)` -> `UItem`
- `setReordering(boolean reordering)` -> `UItem`
- `setSpanCount(int spanCount)` -> `UItem`
- `withOpenButton(Utilities.Callback<TLRPC.User> onOpenButton)` -> `UItem`
- `withUsername(boolean value)` -> `UItem`

## `org.telegram.ui.Components.UItem$UItemFactory`
- `attachedView(RecyclerListView listView, View view, UItem item)` -> `void`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `contentsEquals(UItem a, UItem b)` -> `boolean`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `V`
- `equals(UItem a, UItem b)` -> `boolean`
- `getCached()` -> `V`
- `precache(BaseFragment fragment, int count)` -> `void`
- `precache(Context context, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider, int count)` -> `void`
- `static setup(UItemFactory factory)` -> `void`

## `org.telegram.ui.Components.URLSpanBotCommand`
- `updateDrawState(TextPaint p)` -> `void`

## `org.telegram.ui.Components.URLSpanBrowser`
- `getStyle()` -> `TextStyleSpan.TextStyleRun`
- `onClick(View widget)` -> `void`
- `updateDrawState(TextPaint p)` -> `void`

## `org.telegram.ui.Components.URLSpanCopyToClipboard`
- `onClick(View widget)` -> `void`

## `org.telegram.ui.Components.URLSpanMono`
- `copyToClipboard()` -> `void`
- `updateDrawState(TextPaint p)` -> `void`
- `updateMeasureState(TextPaint p)` -> `void`

## `org.telegram.ui.Components.URLSpanNoUnderline`
- `getObject()` -> `TLObject`
- `onClick(View widget)` -> `void`
- `setObject(TLObject spanObject)` -> `void`
- `updateDrawState(TextPaint p)` -> `void`

## `org.telegram.ui.Components.URLSpanNoUnderlineBold`
- `updateDrawState(TextPaint ds)` -> `void`

## `org.telegram.ui.Components.URLSpanReplacement`
- `getTextStyleRun()` -> `TextStyleSpan.TextStyleRun`
- `onClick(View widget)` -> `void`
- `setNavigateToPremiumBot(boolean navigateToPremiumBot)` -> `void`
- `updateDrawState(TextPaint p)` -> `void`

## `org.telegram.ui.Components.URLSpanUserMention`
- `onClick(View widget)` -> `void`
- `updateDrawState(TextPaint p)` -> `void`

## `org.telegram.ui.Components.UndoView`
- `didPressUrl(CharacterStyle span)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getBackground()` -> `Drawable`
- `getCurrentInfoObject()` -> `Object`
- `getEnterOffset()` -> `float`
- `hide(boolean apply, int animated)` -> `void`
- `invalidate()` -> `void`
- `isMultilineSubInfo()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onRemoveDialogAction(long currentDialogId, int action)` -> `void`
- `setAdditionalTranslationY(float value)` -> `void`
- `setColors(int background, int text)` -> `void`
- `setEnterOffset(float enterOffset)` -> `void`
- `setEnterOffsetMargin(int enterOffsetMargin)` -> `void`
- `setHideAnimationType(int hideAnimationType)` -> `void`
- `setInfoText(CharSequence text)` -> `void`
- `showWithAction(long did, int action, Runnable actionRunnable)` -> `void`
- `showWithAction(long did, int action, Object infoObject)` -> `void`
- `showWithAction(long did, int action, Runnable actionRunnable, Runnable cancelRunnable)` -> `void`
- `showWithAction(long did, int action, Object infoObject, Runnable actionRunnable, Runnable cancelRunnable)` -> `void`
- `showWithAction(long did, int action, Object infoObject, Object infoObject2, Runnable actionRunnable, Runnable cancelRunnable)` -> `void`
- `showWithAction(ArrayList<Long> dialogIds, int action, Object infoObject, Object infoObject2, Runnable actionRunnable, Runnable cancelRunnable)` -> `void`

## `org.telegram.ui.Components.UndoView$LinkMovementMethodMy`
- `onTouchEvent(TextView widget, Spannable buffer, MotionEvent event)` -> `boolean`

## `org.telegram.ui.Components.UniversalAdapter`
- `drawWhiteSections(Canvas canvas, RecyclerListView listView)` -> `void`
- `findItem(int itemId)` -> `UItem`
- `getItem(int position)` -> `UItem`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `getReorderSectionId(int position)` -> `int`
- `getThemedColor(int key)` -> `int`
- `listenReorder(Utilities.Callback2<Integer, ArrayList<UItem>> onReordered)` -> `void`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder holder)` -> `void`
- `reorderDone()` -> `void`
- `reorderSectionEnd()` -> `void`
- `reorderSectionStart()` -> `int`
- `setApplyBackground(boolean applyBackground)` -> `void`
- `swapElements(int fromPosition, int toPosition)` -> `void`
- `update(boolean animated)` -> `void`
- `updateReorder(boolean allowReorder)` -> `void`
- `updateReorder(RecyclerView.ViewHolder holder, boolean allowReorder)` -> `void`
- `updateWithoutNotify()` -> `void`
- `whiteSectionEnd()` -> `void`
- `whiteSectionStart()` -> `void`

## `org.telegram.ui.Components.UniversalAdapter$FullscreenCustomFrameLayout`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setMinusHeight(int minusHeight)` -> `void`
- `setMinusPadding(boolean minusPadding)` -> `void`

## `org.telegram.ui.Components.UniversalAdapter$Section`
- `contains(int position)` -> `boolean`

## `org.telegram.ui.Components.UniversalAdapter$SpaceView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setHeight(int height)` -> `void`

## `org.telegram.ui.Components.UniversalFragment`
- `applyScrolledPosition()` -> `void`
- `createView(Context context)` -> `View`

## `org.telegram.ui.Components.UniversalRecyclerView`
- `allowReorder(boolean allow)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `doNotDetachViews()` -> `void`
- `doNotDetachViews(boolean value)` -> `void`
- `findItemByItemId(int itemId)` -> `UItem`
- `findPositionByItemId(int itemId)` -> `int`
- `findViewByItemId(int itemId)` -> `View`
- `findViewByItemObject(Object object)` -> `View`
- `getSpanCount()` -> `int`
- `isReorderAllowed()` -> `boolean`
- `isReorderRemoving()` -> `boolean`
- `isReordering()` -> `boolean`
- `listenReorder(Utilities.Callback2<Integer, ArrayList<UItem>> onReordered)` -> `void`
- `makeHorizontal()` -> `void`
- `onReorderEnd(ViewHolder viewHolder)` -> `void`
- `onReorderMoved(ViewHolder viewHolder)` -> `void`
- `onReorderRemove(ViewHolder viewHolder)` -> `void`
- `onReorderStart(ViewHolder viewHolder)` -> `void`
- `setReorderLongPressEnabled(boolean enabled)` -> `void`
- `setSections()` -> `void`
- `setSections(boolean topPadding)` -> `void`
- `setSections(int padding, float roundRadius, boolean topPadding)` -> `void`
- `setSpanCount(int spanCount)` -> `void`
- `swappedElements()` -> `void`

## `org.telegram.ui.Components.UnreadCounterTextView`
- `drawableStateChanged()` -> `void`
- `getResourceProvider()` -> `Theme.ResourcesProvider`
- `getTopOffset()` -> `float`
- `jumpDrawablesToCurrentState()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `setCounter(int newCount)` -> `void`
- `setText(CharSequence text, boolean animatedFromBottom)` -> `void`
- `setText(CharSequence text)` -> `void`
- `setTextColorKey(int textColorKey)` -> `void`
- `setTextInfo(CharSequence text)` -> `void`
- `setTextInfo(Drawable icon, CharSequence text)` -> `void`
- `updateCounter()` -> `void`
- `verifyDrawable(Drawable drawable)` -> `boolean`

## `org.telegram.ui.Components.UnsupportedBlockDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `measure(int width)` -> `int`
- `onTouchEvent(View v, MotionEvent ev)` -> `boolean`
- `setAlpha(int alpha)` -> `void`
- `setButtonText(CharSequence text)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setOnClickListener(Runnable onClickListener)` -> `void`
- `setSubtitle(CharSequence subtitle)` -> `void`
- `setTitle(CharSequence title)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.UsersAlertBase`
- `createContainerView(Context context)` -> `ContainerView`
- `dismiss()` -> `void`
- `measurePadding(int availableHeight)` -> `int`
- `onSearchViewTouched(MotionEvent ev, EditTextBoldCursor searchEditText)` -> `void`
- `search(String text)` -> `void`
- `setColorProgress(float progress)` -> `void`
- `setTitle(CharSequence title)` -> `void`
- `setTranslationY(int newOffset)` -> `void`
- `showItemsAnimated(int from)` -> `void`
- `showSearch(boolean show)` -> `void`
- `updateColorKeys()` -> `void`
- `updateLayout()` -> `void`

## `org.telegram.ui.Components.UsersAlertBase$ContainerView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent e)` -> `boolean`
- `requestLayout()` -> `void`
- `setTranslationY(float translationY)` -> `void`

## `org.telegram.ui.Components.UsersAlertBase$SearchField`
- `closeSearch()` -> `void`
- `hideKeyboard()` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`

## `org.telegram.ui.Components.VectorAvatarThumbDrawable`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `draw(@NonNull Canvas canvas)` -> `void`
- `equals(Object o)` -> `boolean`
- `getOpacity()` -> `int`
- `invalidate()` -> `void`
- `onAttachedToWindow(ImageReceiver parent)` -> `void`
- `onDetachedFromWindow(ImageReceiver parent)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setParent(ImageReceiver imageReceiver)` -> `void`
- `setRoundRadius(float roundRadius)` -> `void`

## `org.telegram.ui.Components.VerticalPositionAutoAnimator`
- `static attach(View floatingButtonView)` -> `VerticalPositionAutoAnimator`
- `static attach(View floatingButtonView, float springStiffness)` -> `VerticalPositionAutoAnimator`
- `getOffsetY()` -> `float`
- `ignoreNextLayout()` -> `void`
- `setOffsetY(float offsetY)` -> `void`

## `org.telegram.ui.Components.VerticalPositionAutoAnimator$AnimatorLayoutChangeListener`
- `onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom)` -> `void`

## `org.telegram.ui.Components.VideoCompressButton`
- `dispatchDraw(Canvas canvas)` -> `void`
- `setPhotoState(boolean highQuality)` -> `void`
- `setState(boolean enabled, boolean muted, int mn)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Components.VideoEditTextureView`
- `containsPoint(float x, float y)` -> `boolean`
- `getUiBlurBitmap()` -> `Bitmap`
- `getVideoHeight()` -> `int`
- `getVideoWidth()` -> `int`
- `onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height)` -> `void`
- `onSurfaceTextureDestroyed(SurfaceTexture surface)` -> `boolean`
- `onSurfaceTextureSizeChanged(SurfaceTexture surface, final int width, final int height)` -> `void`
- `release()` -> `void`
- `setDelegate(VideoEditTextureViewDelegate videoEditTextureViewDelegate)` -> `void`
- `setHDRInfo(StoryEntry.HDRInfo hdrInfo)` -> `void`
- `setTransform(@Nullable Matrix transform)` -> `void`
- `setVideoSize(int width, int height)` -> `void`
- `setViewRect(float x, float y, float w, float h)` -> `void`
- `updateUiBlurGradient(int top, int bottom)` -> `void`
- `updateUiBlurManager(BlurringShader.BlurManager uiBlurManager)` -> `void`

## `org.telegram.ui.Components.VideoForwardDrawable`
- `draw(Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getMinimumHeight()` -> `int`
- `getMinimumWidth()` -> `int`
- `getOpacity()` -> `int`
- `isAnimating()` -> `boolean`
- `setAlpha(int alpha)` -> `void`
- `setColor(int value)` -> `void`
- `setColorFilter(ColorFilter colorFilter)` -> `void`
- `setDelegate(VideoForwardDrawableDelegate videoForwardDrawableDelegate)` -> `void`
- `setLeftSide(boolean value)` -> `void`
- `setOneShootAnimation(boolean isOneShootAnimation)` -> `void`
- `setPlayScaleFactor(float playScaleFactor)` -> `void`
- `setShowing(boolean showing)` -> `void`
- `setTime(long dt)` -> `void`
- `startAnimation()` -> `void`

## `org.telegram.ui.Components.VideoSeekBarView`
- `getProgress()` -> `float`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setDelegate(SeekBarDelegate seekBarDelegate)` -> `void`
- `setProgress(float progress)` -> `void`

## `org.telegram.ui.Components.VideoSeekPreviewImage`
- `close()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static findDocumentById(MessageObject messageObject, final long id)` -> `TLRPC.Document`
- `static findDocumentByMimeType(MessageObject messageObject, final String mimeType)` -> `TLRPC.Document`
- `isOpen()` -> `boolean`
- `isReady()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `open(MessageObject messageObject, VideoPlayer videoPlayer)` -> `void`
- `open(MessageObject messageObject, VideoPlayer.VideoUri qualityUri)` -> `void`
- `open(MessageObject messageObject, Uri uri)` -> `void`
- `parseStoryBoardMap(File file)` -> `void`
- `setProgress(MessageObject messageObject, float progress, int w)` -> `void`
- `setProgressForYouTube(PhotoViewerWebView webView, float progress, int w)` -> `void`

## `org.telegram.ui.Components.VideoTimelinePlayView`
- `clearFrames()` -> `void`
- `customBlur()` -> `boolean`
- `destroy()` -> `void`
- `drawBlur(Canvas canvas, RectF rect)` -> `void`
- `getLeftProgress()` -> `float`
- `getLength()` -> `long`
- `getProgress()` -> `float`
- `getProgressOf(int type)` -> `float`
- `getRightProgress()` -> `float`
- `invalidateBlur()` -> `void`
- `isDragging()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setDelegate(VideoTimelineViewDelegate delegate)` -> `void`
- `setLeftRightProgress(float left, float right)` -> `void`
- `setMaxProgressDiff(float value)` -> `void`
- `setMinProgressDiff(float value)` -> `void`
- `setMode(int mode)` -> `void`
- `setProgress(float value)` -> `void`
- `setRightProgress(float value)` -> `void`
- `setVideoPath(String path, long pathOffset, float left, float right, long livePhotoTimestampUs)` -> `void`

## `org.telegram.ui.Components.VideoTimelineView`
- `clearFrames()` -> `void`
- `destroy()` -> `void`
- `destroy(boolean recycle)` -> `void`
- `getLeftProgress()` -> `float`
- `getRightProgress()` -> `float`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setDelegate(VideoTimelineViewDelegate videoTimelineViewDelegate)` -> `void`
- `setKeyframes(ArrayList<Bitmap> keyframes)` -> `void`
- `setMaxProgressDiff(float value)` -> `void`
- `setMinProgressDiff(float value)` -> `void`
- `setRoundFrames(boolean value)` -> `void`
- `setTimeHintView(TimeHintView timeHintView)` -> `void`
- `setTrimProgress(float left, float right)` -> `void`
- `setVideoPath(String path)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.VideoTimelineView$TimeHintView`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setCx(float v)` -> `void`
- `setTime(int timeInSeconds)` -> `void`
- `show(boolean s)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.ViewHelper`
- `static getPaddingEnd(View view)` -> `int`
- `static getPaddingStart(View view)` -> `int`
- `static setPadding(View view, float padding)` -> `void`
- `static setPadding(View view, float left, float top, float right, float bottom)` -> `void`
- `static setPaddingRelative(View view, float start, float top, float end, float bottom)` -> `void`

## `org.telegram.ui.Components.ViewPagerFixed`
- `clearViews()` -> `void`
- `createTabsView(boolean hasStableIds, int selectorType)` -> `TabsView`
- `static distanceInfluenceForSnapDuration(float f)` -> `float`
- `drawForBlur(Canvas blurCanvas)` -> `void`
- `fillTabs(boolean animated)` -> `void`
- `getAvailableTranslationX()` -> `float`
- `getCurrentPosition()` -> `int`
- `getCurrentPositionAlpha()` -> `float`
- `getCurrentView()` -> `View`
- `getManualScrollDuration()` -> `long`
- `getNextPosition()` -> `int`
- `getNextPositionAlpha()` -> `float`
- `getPositionAnimated()` -> `float`
- `getPositionVisibility(int position)` -> `float`
- `getViewPages()` -> `View[]`
- `invalidateBlur()` -> `void`
- `isCurrentTabFirst()` -> `boolean`
- `isManualScrolling()` -> `boolean`
- `isTouch()` -> `boolean`
- `onBack()` -> `void`
- `onBackProgress(float progress)` -> `boolean`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onItemSelected(View currentPage, View oldPage, int position, int oldPosition)` -> `void`
- `onScrollEnd()` -> `void`
- `onStartTracking()` -> `void`
- `onTabPageSelected(int position, boolean forward)` -> `void`
- `onTabPageSelected(int position)` -> `void`
- `onTabScrollEnd(int position)` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `onTouchEventInternal(MotionEvent ev)` -> `boolean`
- `rebuild(boolean animated)` -> `void`
- `resetTouch()` -> `void`
- `scrollToPosition(int page)` -> `boolean`
- `setAdapter(Adapter adapter)` -> `void`
- `setAllowDisallowInterceptTouch(boolean allowDisallowInterceptTouch)` -> `void`
- `setPosition(int position)` -> `void`
- `setTranslationX(View view, float tx)` -> `void`
- `swapViews()` -> `void`
- `tabMarginDp()` -> `int`
- `translateAnimator(View view, float toTx)` -> `ValueAnimator`
- `updateCurrent()` -> `void`
- `updatePages()` -> `void`

## `org.telegram.ui.Components.ViewPagerFixed$Adapter`
- `applyReorder(ArrayList<Integer> itemIds)` -> `void`
- `getItemId(int position)` -> `int`
- `getItemTitle(int position)` -> `CharSequence`
- `getItemViewType(int position)` -> `int`
- `needsTab(int position)` -> `boolean`

## `org.telegram.ui.Components.ViewPagerFixed$TabsView`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `finishAddingTabs()` -> `void`
- `getAnimatingIndicatorProgress()` -> `float`
- `getCurrentPosition()` -> `int`
- `getCurrentTabId()` -> `int`
- `getFirstTabId()` -> `int`
- `getNextPageId(boolean forward)` -> `int`
- `getPageIdByPosition(int position)` -> `int`
- `getPreviousPosition()` -> `int`
- `getSelectorDrawable()` -> `Drawable`
- `getTabsContainer()` -> `RecyclerListView`
- `hide(boolean hide, boolean animated)` -> `void`
- `isAnimatingIndicator()` -> `boolean`
- `isEditing()` -> `boolean`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onPageScrolled(int position, int first)` -> `void`
- `scrollToTab(int id, int position)` -> `void`
- `selectTab(int currentPosition, int nextPosition, float progress)` -> `void`
- `selectTabWithId(int id, float progress)` -> `void`
- `setAnimationIdicatorProgress(float value)` -> `void`
- `setBlurredBackground(BlurredBackgroundDrawable drawable)` -> `void`
- `setDelegate(TabsViewDelegate filterTabsViewDelegate)` -> `void`
- `setIsEditing(boolean value)` -> `void`
- `setOnTabLongClick(Utilities.Callback2Return<Integer, View, Boolean> onTabLongClick)` -> `void`
- `setPreTabClick(Utilities.Callback2Return<Integer, Integer, Boolean> listener)` -> `void`
- `setReordering(boolean reordering)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.ViewPagerFixed$TabsView$ListAdapter`
- `getItemCount()` -> `int`
- `getItemId(int i)` -> `long`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.ViewPagerFixed$TabsView$Tab`
- `getWidth(boolean store, TextPaint textPaint)` -> `int`
- `setTitle(String newTitle)` -> `boolean`

## `org.telegram.ui.Components.ViewPagerFixed$TabsView$TabView`
- `getId()` -> `int`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setReordering(boolean reordering)` -> `void`
- `setTab(Tab tab, int position)` -> `void`

## `org.telegram.ui.Components.ViewPagerFixed$TabsView$TabsViewDelegate`
- `applyReorder(ArrayList<Integer> ids)` -> `default void`
- `invalidateBlur()` -> `default void`
- `needsTab(int page)` -> `default boolean`
- `onPageScrolled(float progress)` -> `default void`
- `onPageSelected(int page, boolean forward)` -> `default void`
- `onSamePageSelected()` -> `default void`

## `org.telegram.ui.Components.WallpaperCheckBoxView`
- `getTextPaint()` -> `TextPaint`
- `isChecked()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setColor(int index, int color)` -> `void`
- `setDimAmount(float dimAmount)` -> `void`
- `setText(String text, int current, int max)` -> `void`

## `org.telegram.ui.Components.WallpaperParallaxEffect`
- `getScale(int boundsWidth, int boundsHeight)` -> `float`
- `onAccuracyChanged(Sensor sensor, int accuracy)` -> `void`
- `onSensorChanged(SensorEvent event)` -> `void`
- `setCallback(Callback callback)` -> `void`
- `setEnabled(boolean enabled)` -> `void`

## `org.telegram.ui.Components.WallpaperUpdater`
- `cleanup()` -> `void`
- `getCurrentPicturePath()` -> `String`
- `onActivityResult(int requestCode, int resultCode, Intent data)` -> `void`
- `openGallery()` -> `void`
- `setCurrentPicturePath(String value)` -> `void`
- `showAlert(final boolean fromTheme)` -> `void`

## `org.telegram.ui.Components.WaveDrawable`
- `draw(float cx, float cy, float scale, Canvas canvas)` -> `void`
- `setCircleRadius(float radius)` -> `void`
- `setColor(int color, int alpha)` -> `void`
- `setValue(float value)` -> `void`
- `tick(float circleRadius)` -> `void`

## `org.telegram.ui.Components.WebPagePreviewView`
- `onDraw(Canvas canvas)` -> `void`
- `setWebPage(TLRPC.WebPage webPage)` -> `void`

## `org.telegram.ui.Components.WebPlayerView`
- `destroy()` -> `void`
- `downloadUrlContent(AsyncTask parentTask, String url)` -> `String`
- `downloadUrlContent(AsyncTask parentTask, String url, HashMap<String, String> headers, boolean tryGzip)` -> `String`
- `enterFullscreen()` -> `void`
- `exitFullscreen()` -> `void`
- `getAspectRatioView()` -> `View`
- `getControlsView()` -> `View`
- `getCoubId(String url)` -> `String`
- `getTextureImageView()` -> `ImageView`
- `getTextureView()` -> `TextureView`
- `static getYouTubeVideoId(String url)` -> `String`
- `getYoutubeId()` -> `String`
- `isInFullscreen()` -> `boolean`
- `isInitied()` -> `boolean`
- `isInline()` -> `boolean`
- `onAudioFocusChange(int focusChange)` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onError(VideoPlayer player, Exception e)` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onRenderedFirstFrame()` -> `void`
- `onStateChanged(boolean playWhenReady, int playbackState)` -> `void`
- `onSurfaceDestroyed(SurfaceTexture surfaceTexture)` -> `boolean`
- `onVideoSizeChanged(int width, int height, int unappliedRotationDegrees, float pixelWidthHeightRatio)` -> `void`
- `pause()` -> `void`
- `updateTextureImageView()` -> `void`
- `willHandle()` -> `void`

## `org.telegram.ui.Components.WebPlayerView$AparatVideoTask`
- `doInBackground(Void... voids)` -> `String`
- `onPostExecute(String result)` -> `void`

## `org.telegram.ui.Components.WebPlayerView$ControlsView`
- `onDraw(Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBufferedProgress(int position)` -> `void`
- `setDuration(int value)` -> `void`
- `setProgress(int value)` -> `void`
- `show(boolean value, boolean animated)` -> `void`

## `org.telegram.ui.Components.WebPlayerView$CoubVideoTask`
- `doInBackground(Void... voids)` -> `String`
- `onPostExecute(String result)` -> `void`

## `org.telegram.ui.Components.WebPlayerView$JavaScriptInterface`
- `returnResultToJava(String value)` -> `void`

## `org.telegram.ui.Components.WebPlayerView$TwitchClipVideoTask`
- `doInBackground(Void... voids)` -> `String`
- `onPostExecute(String result)` -> `void`

## `org.telegram.ui.Components.WebPlayerView$TwitchStreamVideoTask`
- `doInBackground(Void... voids)` -> `String`
- `onPostExecute(String result)` -> `void`

## `org.telegram.ui.Components.WebPlayerView$VimeoVideoTask`
- `doInBackground(Void... voids)` -> `String`
- `onPostExecute(String result)` -> `void`

## `org.telegram.ui.Components.WebPlayerView$YoutubeVideoTask`
- `doInBackground(Void... voids)` -> `String[]`
- `onPostExecute(String[] result)` -> `void`

## `org.telegram.ui.Components.ZoomControlView`
- `getZoom()` -> `float`
- `isTouch()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setDelegate(ZoomControlViewDelegate zoomControlViewDelegate)` -> `void`
- `setZoom(float value, boolean notify)` -> `void`

## `org.telegram.ui.Components.chat.ChatInputViewsContainer`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getFadeView()` -> `View`
- `getInAppKeyboardBubbleContainer()` -> `FrameLayout`
- `getInputBubbleBottom()` -> `float`
- `getInputBubbleHeight()` -> `float`
- `getInputBubbleTop()` -> `float`
- `getInputIslandBubbleContainer()` -> `FrameLayout`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBackgroundWithFadeDrawable(BlurredBackgroundWithFadeDrawable backgroundWithFadeDrawable)` -> `void`
- `setBlurredBottomHeight(float height)` -> `void`
- `setInputBubbleAlpha(int alpha)` -> `void`
- `setInputBubbleHeight(float height)` -> `void`
- `setInputBubbleOffsets(float left, float right)` -> `void`
- `setInputBubbleTranslationY(float translationY)` -> `void`
- `setInputIslandBubbleDrawable(BlurredBackgroundDrawable drawable)` -> `void`
- `setUnderKeyboardBackgroundDrawable(BlurredBackgroundDrawable drawable)` -> `void`
- `setWindowInsetsProvider(WindowInsetsProvider windowInsetsProvider)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.chat.ChatListViewPaddingsAnimator`
- `getCurrentAdditionalHeight()` -> `int`

## `org.telegram.ui.Components.chat.SendButtonBlockedByTypingView`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `setStopAllowed(boolean allowed, boolean animated)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Components.chat.ViewPositionWatcher`
- `clear()` -> `void`
- `static computeXCoordinateInParent(@NonNull View view, @NonNull ViewGroup parentView)` -> `float`
- `static computeYCoordinateInParent(@NonNull View view, @NonNull ViewGroup parentView)` -> `float`
- `onPreDraw()` -> `boolean`
- `onViewAttachedToWindow(@NonNull View v)` -> `void`
- `onViewDetachedFromWindow(@NonNull View v)` -> `void`
- `shutdown()` -> `void`
- `unsubscribe(@NonNull View view)` -> `void`

## `org.telegram.ui.Components.chat.ViewPositionWatcher$ViewOnPreDraw`
- `destroy()` -> `void`

## `org.telegram.ui.Components.chat.WallpaperBitmapProvider`
- `getNavigationBarColor(BlurredBackgroundSource source)` -> `int`
- `getStatusBarColor(BlurredBackgroundSource source)` -> `int`

## `org.telegram.ui.Components.inset.KeyboardState`
- `getState()` -> `State`
- `setKeyboardVisibility(boolean isVisible, boolean immediately, boolean notify)` -> `State`

## `org.telegram.ui.Components.inset.WindowInsetsProvider`
- `getCurrentNavigationBarInset()` -> `default int`

## `org.telegram.ui.Components.inset.WindowInsetsStateHolder`
- `filterInsets(@Nullable WindowInsetsCompat insets)` -> `WindowInsetsCompat`
- `getAnimatedImeBottomInset()` -> `float`
- `getAnimatedInsetsTargetView()` -> `View`
- `getAnimatedKeyboardVisibility()` -> `float`
- `getAnimatedMaxBottomInset()` -> `float`
- `getCurrentMaxBottomInset()` -> `int`
- `getCurrentNavigationBarInset()` -> `int`
- `getInAppKeyboardHeight()` -> `int`
- `getInAppKeyboardRecommendedViewHeight()` -> `int`
- `getInsets(int type)` -> `Insets`
- `inAppViewIsVisible()` -> `boolean`
- `onAnimatedInsetsChanged(View view, WindowInsetsCompat insets)` -> `void`
- `onAnimatedInsetsFinished()` -> `void`
- `onAnimatedInsetsStarted()` -> `void`
- `resetInAppKeyboardHeight(boolean waitKeyboardOpen)` -> `void`
- `setInsets(@Nullable WindowInsetsCompat insets)` -> `void`
- `setupAnimatedInsetsProvider(WindowAnimatedInsetsProvider provider, View target)` -> `void`

## `org.telegram.ui.Components.poll.FileState`
- `downloadCancel()` -> `void`
- `downloadStart()` -> `void`

## `org.telegram.ui.Components.poll.PollAddOptionFieldLayout`
- `doOnCancel(Runnable onCancel)` -> `void`
- `doOnEmojiClick(Runnable runnable)` -> `void`
- `drawInCell(Canvas canvas)` -> `void`
- `getAttachedMedia()` -> `PollAttachedMedia`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onPreDraw()` -> `boolean`
- `setAnimatedVisibility(float factor)` -> `void`
- `setCellToWatch(ChatMessageCell cellToWatch)` -> `void`
- `setColor(int color)` -> `void`
- `setEmojiKeyboardVisible(boolean isEmojiKeyboardVisible, boolean animated)` -> `void`
- `updateCell()` -> `void`

## `org.telegram.ui.Components.poll.PollAddOptionFieldLayout$ViewWrapper`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `drawInCell(Canvas canvas)` -> `void`

## `org.telegram.ui.Components.poll.PollAttachButton`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `setAttachedMedia(PollAttachedMedia media, boolean animated)` -> `void`

## `org.telegram.ui.Components.poll.PollAttachedMedia`
- `attach(View parent)` -> `void`
- `detach()` -> `void`
- `draw(Canvas canvas, int w, int h)` -> `void`

## `org.telegram.ui.Components.poll.PollAttachedMediaPack`
- `applyAllQuickMedia(TLRPC.TL_inputMediaPoll inputMediaPoll)` -> `void`
- `applyAllQuickMedia(TLRPC.TL_messageMediaPoll messageMediaPoll)` -> `void`
- `static findInputMedia(TLRPC.TL_inputMediaPoll inputMediaPoll, TLRPC.InputMedia inputMedia)` -> `int`
- `get(int index)` -> `PollAttachedMedia`
- `static getAttachPath(TLRPC.Message message, int index)` -> `String`
- `static getFirstInputMedia(TLRPC.TL_inputMediaPoll inputMediaPoll)` -> `TLRPC.InputMedia`
- `static getInputMedia(TLRPC.TL_inputMediaPoll inputMediaPoll, int index)` -> `TLRPC.InputMedia`
- `static getMedia(TLRPC.TL_messageMediaPoll inputMediaPoll, int index)` -> `TLRPC.MessageMedia`
- `static getOptionIdQueryParameter(Uri data, String name)` -> `byte[]`
- `set(int index, PollAttachedMedia media)` -> `void`
- `static setAttachPath(TLRPC.Message message, String attachPath, int index)` -> `void`
- `static setInputMedia(TLRPC.TL_inputMediaPoll inputMediaPoll, int index, TLRPC.InputMedia inputMedia)` -> `void`

## `org.telegram.ui.Components.poll.PollContentDrawable`
- `attach()` -> `void`
- `detach()` -> `void`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getAlpha()` -> `int`
- `getHeightForWidth(int width)` -> `int`
- `getImageReceiver()` -> `ImageReceiver`
- `getMedia()` -> `TLRPC.MessageMedia`
- `getObserverTag()` -> `int`
- `getOpacity()` -> `int`
- `isDraggingSeekBar()` -> `boolean`
- `isFile()` -> `boolean`
- `isHasMedia()` -> `boolean`
- `isMusic()` -> `boolean`
- `isPlaying()` -> `boolean`
- `miniButtonOnTouch(int action, float x, float y)` -> `boolean`
- `onFailedDownload(String fileName, boolean canceled)` -> `void`
- `onProgressDownload(String fileName, long downloadSize, long totalSize)` -> `void`
- `onProgressUpload(String fileName, long uploadedSize, long totalSize, boolean isEncrypted)` -> `void`
- `onSeekBarContinuousDrag(float progress)` -> `void`
- `onSeekBarDrag(float progress)` -> `void`
- `onSeekBarPressed()` -> `void`
- `onSeekBarReleased()` -> `void`
- `onSuccessDownload(String fileName)` -> `void`
- `seekBarOnTouch(int action, float x, float y)` -> `boolean`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setColors(int primary, int normal, int info, int file)` -> `void`
- `setMedia(MessageObject messageObject, TLRPC.MessageMedia media, Object parentObject, int targetWidth, String attachPath, boolean animated)` -> `void`
- `updatePlayingMessageProgress()` -> `void`

## `org.telegram.ui.Components.poll.PollUtils`
- `static getVoteRestrictedFlags(MessageObject messageObject)` -> `int`
- `static getVoteRestrictedToastText(MessageObject messageObject, int restrictedFlags)` -> `CharSequence`

## `org.telegram.ui.Components.poll.RecentVotersCell`
- `createListView(BaseFragment fragment, long dialogId, int msgId, byte[] option, int estimated, Utilities.Callback<Long> onClick)` -> `RecyclerListView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setRecentVoters(List<TLRPC.Peer> peers, boolean animated)` -> `void`
- `setText(String text)` -> `void`

## `org.telegram.ui.Components.poll.RecentVotersCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `contentsEquals(UItem a, UItem b)` -> `boolean`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `MessageSeenView.UserCell`
- `equals(UItem a, UItem b)` -> `boolean`
- `static of(TLObject user, long dialogId, int date, View.OnClickListener onImageClick)` -> `UItem`

## `org.telegram.ui.Components.poll.RecentVotersCell$FlickerFactory`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `FlickerLoadingView`
- `static of()` -> `UItem`

## `org.telegram.ui.Components.poll.RecentVotersCell$FlickerFactory2`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `FlickerLoadingView`
- `static of()` -> `UItem`

## `org.telegram.ui.Components.poll.RecentVotersCell$VotesList`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`

## `org.telegram.ui.Components.poll.WebPageLoader`
- `apply(LongSparseArray<TLRPC.WebPage> newPages)` -> `void`
- `get(String url, Utilities.Callback2<TLRPC.WebPage, TLObject> callback)` -> `void`
- `getWebPage(String url)` -> `TLRPC.WebPage`

## `org.telegram.ui.Components.poll.attached.PollAttachedMediaFile`
- `static createMessagePreviewDrawable(View view, String title, String subtitle, TLRPC.Document document, MessageObject messageObject)` -> `Drawable`
- `draw(Canvas canvas, int w, int h)` -> `void`

## `org.telegram.ui.Components.poll.attached.PollAttachedMediaFile$FileInfoDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getOpacity()` -> `int`
- `onBoundsChange(@NonNull Rect bounds)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setText(CharSequence title, CharSequence subtitle)` -> `void`

## `org.telegram.ui.Components.poll.attached.PollAttachedMediaLink`
- `attach(View parent)` -> `void`
- `detach()` -> `void`
- `draw(Canvas canvas, int w, int h)` -> `void`
- `getWebPage()` -> `TLRPC.WebPage`
- `invalidateDrawable(@NonNull Drawable who)` -> `void`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `scheduleDrawable(@NonNull Drawable who, @NonNull Runnable what, long when)` -> `void`
- `setWebPage(TLRPC.WebPage webPage, boolean progress, boolean animated)` -> `void`
- `unscheduleDrawable(@NonNull Drawable who, @NonNull Runnable what)` -> `void`

## `org.telegram.ui.Components.poll.attached.PollAttachedMediaLocation`
- `createMessagePreviewDrawable(View view)` -> `Drawable`
- `draw(Canvas canvas, int w, int h)` -> `void`

## `org.telegram.ui.Components.poll.attached.PollAttachedMediaMusic`
- `attach(View parent)` -> `void`
- `detach()` -> `void`
- `draw(Canvas canvas, int w, int h)` -> `void`

## `org.telegram.ui.Components.poll.buttons.PollAddButtonDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `onAlphaChanged(int alpha)` -> `void`
- `onBoundsChange(@NonNull Rect bounds)` -> `void`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `setIsEditEnabled(boolean isEditEnabled, boolean animated)` -> `void`
- `setTextColor(int color)` -> `void`

## `org.telegram.ui.Components.poll.buttons.PollButtonDrawable`
- `attach()` -> `void`
- `detach()` -> `void`
- `draw(@NonNull Canvas canvas)` -> `void`
- `draw(@NonNull Canvas canvas, @Nullable Paint avatarsPaint)` -> `void`
- `getImageReceiver()` -> `ImageReceiver`
- `getObserverTag()` -> `int`
- `getOpacity()` -> `int`
- `getVotersCountAnimatedWidth(float padding)` -> `float`
- `getVotersCountTargetWidth()` -> `float`
- `isHasMedia()` -> `boolean`
- `onFailedDownload(String fileName, boolean canceled)` -> `void`
- `onProgressDownload(String fileName, long downloadSize, long totalSize)` -> `void`
- `onProgressUpload(String fileName, long uploadedSize, long totalSize, boolean isEncrypted)` -> `void`
- `onSuccessDownload(String fileName)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setHasMediaPadding(boolean hasMediaPadding)` -> `void`
- `setMedia(MessageObject messageObject, TLRPC.MessageMedia media, Object parentObject, String attachPath, boolean animated)` -> `void`
- `setRecentVoters(List<TLRPC.Peer> recentVoters, boolean animated)` -> `void`
- `setVotersCount(int count, boolean animated)` -> `void`
- `setVotersCountTextColor(int color)` -> `void`
- `setVotersVisible(boolean visible, boolean animated)` -> `void`
- `verifyDrawable(Drawable who)` -> `boolean`

## `org.telegram.ui.Components.poll.buttons.PollButtonDrawableBase`
- `getAlpha()` -> `int`
- `getOpacity()` -> `int`
- `getSelectorDrawable()` -> `Drawable`
- `onAlphaChanged(int alpha)` -> `void`
- `onBoundsChange(@NonNull Rect bounds)` -> `void`
- `onSelectorColorChanged(int color)` -> `void`
- `resetSelectors()` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setSelectorsColor(int color)` -> `void`
- `setupCallbacks(Drawable.Callback callback)` -> `void`
- `verifyDrawable(Drawable who)` -> `boolean`

## `org.telegram.ui.Components.poll.buttons.PollInstantButtonDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getProgressFactor()` -> `float`
- `onAlphaChanged(int alpha)` -> `void`
- `onBoundsChange(@NonNull Rect bounds)` -> `void`
- `setButtonText(CharSequence text, boolean animated)` -> `void`
- `setButtonTextColor(int color)` -> `void`
- `setLoading(boolean loading, boolean animated)` -> `void`
- `setTextOffsetY(float offset)` -> `void`
- `setupCallbacks(Callback callback)` -> `void`
- `verifyDrawable(Drawable who)` -> `boolean`

## `org.telegram.ui.Components.poll.sheets.CountrySelectBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `getSelectedCountries()` -> `Set<String>`
- `getTitle()` -> `CharSequence`
- `onContainerLayout(int l, int t, int r, int b)` -> `void`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `prepare(List<String> selectedObjects)` -> `void`
- `setListener(Listener listener)` -> `void`

## `org.telegram.ui.Components.poll.sheets.CountrySelectBottomSheet$Factory`
- `static asCountry(TLRPC.TL_help_country country, boolean checked)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `contentsEquals(UItem a, UItem b)` -> `boolean`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `SelectorCountryCell`
- `equals(UItem a, UItem b)` -> `boolean`

## `org.telegram.ui.Components.poll.sheets.PollStatisticsBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `getTitle()` -> `CharSequence`

## `org.telegram.ui.Components.quickforward.QuickShareAvatarCell`
- `draw(Canvas c, float hardMinX, float hardMaxX, float softMinX, float softMaxX, float cx, float cy, float rad, float alpha, boolean withoutAvatar)` -> `void`
- `drawBlurredAvatar(Canvas c, float cx, float cy, float radius, float alpha)` -> `void`
- `recycle()` -> `void`
- `setFullVisible(boolean fullVisible, boolean animated)` -> `void`
- `setSelected(boolean selected, boolean animated)` -> `void`

## `org.telegram.ui.Components.quickforward.QuickShareSelectorDrawable`
- `applyBlurBitmapShader(float x, float y)` -> `boolean`
- `close(Bulletin bulletin)` -> `void`
- `destroy()` -> `void`
- `draw(@NonNull Canvas canvas)` -> `void`
- `draw(@NonNull Canvas canvas, int alphaValue, boolean renderToBlurBuffer)` -> `void`
- `getBlurBitmapPaint()` -> `Paint`
- `getBubbleWidth()` -> `int`
- `getOpacity()` -> `int`
- `getSelectedDialogId()` -> `long`
- `isActive()` -> `boolean`
- `isDestroyed()` -> `boolean`
- `onAnimationCancel(@NonNull Animator animation)` -> `void`
- `onAnimationEnd(@NonNull Animator animation)` -> `void`
- `onAnimationRepeat(@NonNull Animator animation)` -> `void`
- `onAnimationStart(@NonNull Animator animation)` -> `void`
- `onTouchMoveEvent(float touchX, float touchY)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.quickforward.QuickShareSelectorOverlayLayout`
- `close(ChatMessageCell cell, Bulletin bulletin)` -> `void`
- `getSelectedDialogId(ChatMessageCell cell)` -> `long`
- `getSelectedMessageObject(ChatMessageCell cell)` -> `MessageObject`
- `invalidateDrawable(@NonNull Drawable drawable)` -> `void`
- `isActive()` -> `boolean`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onTouchMoveEvent(ChatMessageCell cell, float x, float y)` -> `void`
- `open(ChatMessageCell cell)` -> `void`

## `org.telegram.ui.Components.spoilers.SpoilerEffect`
- `static clipOutCanvas(Canvas canvas, List<SpoilerEffect> spoilers)` -> `void`
- `draw(@NonNull Canvas canvas)` -> `void`
- `drawPoints(Canvas canvas, SpoilerEffectBitmapFactory.PointsBuffer[] buffers)` -> `void`
- `getMaxParticlesCount()` -> `int`
- `getOpacity()` -> `int`
- `getParentView()` -> `View`
- `getRipplePath(Path path)` -> `void`
- `getRippleProgress()` -> `float`
- `invalidateSelf()` -> `void`
- `static layoutDrawMaybe(Layout layout, Canvas canvas)` -> `void`
- `onBoundsChange(@NonNull Rect bounds)` -> `void`
- `static renderWithRipple(View v, boolean invalidateSpoilersParent, int spoilersColor, int verticalOffset, AtomicReference<Layout> patchedLayoutRef, int patchedLayoutType, Layout textLayout, List<SpoilerEffect> spoilers, Canvas canvas, boolean useParentWidth)` -> `void`
- `static renderWithRipple(View v, boolean invalidateSpoilersParent, int spoilersColor, int verticalOffset, AtomicReference<CachedStaticLayout> patchedLayoutRef, CachedStaticLayout textLayout, List<SpoilerEffect> spoilers, Canvas canvas, boolean useParentWidth)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setBounds(int left, int top, int right, int bottom)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setInvalidateParent(boolean invalidateParent)` -> `void`
- `setMaxParticlesCount(int maxParticles)` -> `void`
- `setOnRippleEndCallback(@Nullable Runnable onRippleEndCallback)` -> `void`
- `setParentView(View parentView)` -> `void`
- `setRippleInterpolator(@NonNull TimeInterpolator rippleInterpolator)` -> `void`
- `setRippleProgress(float rippleProgress)` -> `void`
- `setSize(int bitmapSize)` -> `void`
- `setSuppressUpdates(boolean suppressUpdates)` -> `void`
- `setVisibleBounds(float left, float top, float right, float bottom)` -> `void`
- `startRipple(float rX, float rY, float radMax)` -> `void`
- `startRipple(float rX, float rY, float radMax, boolean reverse)` -> `void`
- `updateMaxParticles()` -> `void`

## `org.telegram.ui.Components.spoilers.SpoilerEffect2`
- `attach(View view)` -> `void`
- `detach(View view)` -> `void`
- `draw(Canvas canvas, View view)` -> `void`
- `draw(Canvas canvas, View view, int w, int h)` -> `void`
- `draw(Canvas canvas, View view, int w, int h, float alpha)` -> `void`
- `draw(Canvas canvas, View view, int w, int h, float alpha, boolean toBitmap)` -> `void`
- `getAttachIndex(View view)` -> `int`
- `static getInstance(View view)` -> `SpoilerEffect2`
- `static getInstance(int type, View view)` -> `SpoilerEffect2`
- `static getInstance(int type, View view, ViewGroup rootView)` -> `SpoilerEffect2`
- `invalidate()` -> `void`
- `static pause(boolean pause)` -> `void`
- `static pause(int type, boolean pause)` -> `void`
- `reassignAttach(View view, int index)` -> `void`
- `static supports()` -> `boolean`

## `org.telegram.ui.Components.spoilers.SpoilerEffect2$SpoilerThread`
- `halt()` -> `void`
- `pause(boolean paused)` -> `void`
- `run()` -> `void`
- `updateSize(int width, int height)` -> `void`

## `org.telegram.ui.Components.spoilers.SpoilerEffectBitmapFactory`
- `static getInstance()` -> `SpoilerEffectBitmapFactory`
- `getPaint()` -> `Paint`

## `org.telegram.ui.Components.spoilers.SpoilerEffectBitmapFactory$PointsBuffer`
- `draw(Canvas canvas, Paint paint)` -> `void`
- `reset()` -> `void`

## `org.telegram.ui.Components.spoilers.SpoilersClickDetector`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `setAdditionalOffsets(int horizontalPadding, int verticalPadding)` -> `void`

## `org.telegram.ui.Components.spoilers.SpoilersTextView`
- `clearLinks()` -> `void`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `getStaticTextLayout()` -> `Layout`
- `hit(int x, int y)` -> `ClickableSpan`
- `invalidate()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter)` -> `void`
- `overrideLinkColor()` -> `int`
- `reveal()` -> `void`
- `setClearLinkOnLongPress(boolean clear)` -> `void`
- `setDisablePaddingsOffset(boolean disablePaddingsOffset)` -> `void`
- `setDisablePaddingsOffsetX(boolean disablePaddingsOffsetX)` -> `void`
- `setDisablePaddingsOffsetY(boolean disablePaddingsOffsetY)` -> `void`
- `setLoading(CharacterStyle span)` -> `void`
- `setOnLinkLongPressListener(LinkSpanDrawable.LinksTextView.OnLinkPress listener)` -> `void`
- `setOnLinkPressListener(LinkSpanDrawable.LinksTextView.OnLinkPress listener)` -> `void`
- `setText(CharSequence text, BufferType type)` -> `void`
- `setTextColor(int color)` -> `void`
- `setUseAlphaForEmoji(boolean useAlphaForEmoji)` -> `void`
- `updateAnimatedEmoji(boolean force)` -> `void`

## `org.telegram.ui.ComposeDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setIconTranslate(int tx, int ty)` -> `void`
- `setIconVisible(boolean visible)` -> `void`
- `setIconVisible(boolean visible, boolean animated)` -> `void`

## `org.telegram.ui.ContactAddActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `didStartUpload(boolean fromAvatarConstructor, boolean isVideo)` -> `void`
- `didUploadFailed()` -> `void`
- `didUploadPhoto(TLRPC.InputFile photo, TLRPC.InputFile video, double videoStartTimestamp, String videoPath, TLRPC.PhotoSize bigSize, TLRPC.PhotoSize smallSize, boolean isVideo, TLRPC.VideoSize emojiMarkup)` -> `void`
- `getInitialSearchString()` -> `String`
- `getResourceProvider()` -> `Theme.ResourcesProvider`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onUploadProgressChanged(float progress)` -> `void`
- `setDelegate(ContactAddActivityDelegate contactAddActivityDelegate)` -> `void`

## `org.telegram.ui.ContactsActivity`
- `createActionBar(Context context)` -> `ActionBar`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getAnimatedInsetsTargetView()` -> `View`
- `getGlassSource()` -> `BlurredBackgroundSourceRenderNode`
- `getListView()` -> `RecyclerListView`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSupportEdgeToEdge()` -> `boolean`
- `onAnimatedInsetsChanged(View view, WindowInsetsCompat insets)` -> `void`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onBecomeFullyVisible()` -> `void`
- `onDialogDismiss(Dialog dialog)` -> `void`
- `onFactorChangeFinished(int id, float finalFactor, FactorAnimator callee)` -> `void`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onParentScrollToTop()` -> `void`
- `onPause()` -> `void`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationProgress(boolean isOpen, float progress)` -> `void`
- `setDelegate(ContactsActivityDelegate delegate)` -> `void`
- `setIgnoreUsers(LongSparseArray<TLRPC.User> users)` -> `void`
- `setInitialSearchString(String initialSearchString)` -> `void`

## `org.telegram.ui.ContactsWidgetConfigActivity`
- `handleIntent(Intent intent, boolean isNew, boolean restore, boolean fromPassword, int intentAccount, int state)` -> `boolean`

## `org.telegram.ui.ContentPreviewViewer`
- `clearDelegate(ContentPreviewViewerDelegate contentPreviewViewerDelegate)` -> `void`
- `close()` -> `void`
- `closeWithMenu()` -> `void`
- `createMyStickerPacksListView()` -> `RecyclerListView`
- `destroy()` -> `void`
- `static getInstance()` -> `ContentPreviewViewer`
- `onInterceptTouchEvent(MotionEvent event, final RecyclerListView listView, final int height, ContentPreviewViewerDelegate contentPreviewViewerDelegate, Theme.ResourcesProvider resourcesProvider)` -> `boolean`
- `onTouch(MotionEvent event, final RecyclerListView listView, final int height, final Object listener, ContentPreviewViewerDelegate contentPreviewViewerDelegate, Theme.ResourcesProvider resourcesProvider)` -> `boolean`
- `open(TLRPC.Document document, SendMessagesHelper.ImportingSticker sticker, String emojiPath, String query, TLRPC.BotInlineResult botInlineResult, int contentType, boolean isRecent, Object parent, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `open(TLRPC.Document document, SendMessagesHelper.ImportingSticker sticker, String emojiPath, String query, TLRPC.BotInlineResult botInlineResult, int contentType, boolean isRecent, Object parent, Theme.ResourcesProvider resourcesProvider, int menuOpenDelay)` -> `void`
- `reset()` -> `void`
- `runSmoothHaptic()` -> `void`
- `setDelegate(ContentPreviewViewerDelegate contentPreviewViewerDelegate)` -> `void`
- `setFocusable(boolean focusable)` -> `void`
- `setKeyboardHeight(int height)` -> `void`
- `setParentActivity(Activity activity)` -> `void`
- `setStickerSetForCustomSticker(TLRPC.TL_messages_stickerSet stickerSetForCustomSticker)` -> `void`
- `showCustomStickerActions(String path, VideoEditedInfo videoEditedInfo, View view, ArrayList<String> selectedEmojis, ContentPreviewViewerDelegate delegate)` -> `void`
- `showMenuFor(View view)` -> `boolean`

## `org.telegram.ui.ContentPreviewViewer$ContentPreviewViewerDelegate`
- `can()` -> `default boolean`
- `copyEmoji(TLRPC.Document document)` -> `default void`
- `getCustomItemOptions(@NonNull ViewGroup container, @NonNull View scrimView)` -> `default ItemOptions`
- `getPoll()` -> `default TLRPC.TL_messageMediaPoll`
- `getPollAnswer()` -> `default TLRPC.PollAnswer`
- `getQuery(boolean isGif)` -> `default String`
- `gifAddedOrDeleted()` -> `default void`
- `needCopy(TLRPC.Document document)` -> `default boolean`
- `needMenu()` -> `default boolean`
- `needOpen()` -> `default boolean`
- `needRemove()` -> `default boolean`
- `needRemoveFromRecent(TLRPC.Document document)` -> `default boolean`
- `needSend(int contentType)` -> `default boolean`
- `newStickerPackSelected(CharSequence name, String emoji, Utilities.Callback<Boolean> whenDone)` -> `default void`
- `openSet(TLRPC.InputStickerSet set, boolean clearInputField)` -> `default void`
- `resetTouch()` -> `default void`
- `retractVote()` -> `default void`
- `sendVote()` -> `default void`
- `setAsEmojiStatus(TLRPC.Document document, Integer until)` -> `default void`
- `setIntroSticker(String emoji)` -> `default void`
- `stickerSetSelected(TLRPC.StickerSet set, String emoji)` -> `default void`

## `org.telegram.ui.ContentPreviewViewer$FrameLayoutDrawer`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.CountrySelectActivity`
- `createView(Context context)` -> `View`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isLightStatusBar()` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onResume()` -> `void`
- `setCountrySelectActivityDelegate(CountrySelectActivityDelegate delegate)` -> `void`
- `setDisableAnonymousNumbers(boolean disableAnonymousNumbers)` -> `void`

## `org.telegram.ui.CountrySelectActivity$Country`
- `equals(Object o)` -> `boolean`

## `org.telegram.ui.CountrySelectActivity$CountryAdapter`
- `getCountForSection(int section)` -> `int`
- `getCountries()` -> `HashMap<String, ArrayList<Country>>`
- `getItem(int section, int position)` -> `Country`
- `getItemViewType(int section, int position)` -> `int`
- `getLetter(int position)` -> `String`
- `getPositionForScrollProgress(RecyclerListView listView, float progress, int[] position)` -> `void`
- `getSectionCount()` -> `int`
- `getSectionHeaderView(int section, View view)` -> `View`
- `isEnabled(RecyclerView.ViewHolder holder, int section, int row)` -> `boolean`
- `onBindViewHolder(int section, int position, RecyclerView.ViewHolder holder)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.CountrySelectActivity$CountrySearchAdapter`
- `getItem(int i)` -> `Country`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `search(final String query)` -> `void`

## `org.telegram.ui.DataAutoDownloadActivity`
- `createView(Context context)` -> `View`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onFragmentCreate()` -> `boolean`
- `onPause()` -> `void`
- `onResume()` -> `void`

## `org.telegram.ui.DataAutoDownloadActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.DataUsage2Activity`
- `createView(Context context)` -> `View`
- `getResourceProvider()` -> `Theme.ResourcesProvider`
- `isLightStatusBar()` -> `boolean`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `onTransitionAnimationProgress(boolean isOpen, float progress)` -> `void`
- `scrollToReset()` -> `void`
- `selectTab(int tab)` -> `void`

## `org.telegram.ui.DataUsage2Activity$Cell`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setArrow(Boolean value)` -> `void`

## `org.telegram.ui.DataUsage2Activity$CustomCharacterSpan`
- `updateDrawState(TextPaint paint)` -> `void`
- `updateMeasureState(TextPaint paint)` -> `void`

## `org.telegram.ui.DataUsage2Activity$ItemInner`
- `static asCell(int index, int imageResId, int imageColorTop, int imageColorBottom, CharSequence text, CharSequence valueText)` -> `ItemInner`
- `static asCell(int index, int imageResId, int imageColor, CharSequence text, CharSequence valueText)` -> `ItemInner`
- `static asCell(String text, CharSequence valueText)` -> `ItemInner`
- `static asHeader(String text)` -> `ItemInner`
- `static asSeparator()` -> `ItemInner`
- `static asSeparator(String hint)` -> `ItemInner`
- `static asSubtitle(String text)` -> `ItemInner`
- `equals(Object object)` -> `boolean`

## `org.telegram.ui.DataUsage2Activity$ListView`
- `onMeasure(int widthSpec, int heightSpec)` -> `void`
- `scrollTo(int viewType)` -> `void`
- `setType(int type)` -> `void`

## `org.telegram.ui.DataUsage2Activity$ListView$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.DataUsage2Activity$PageAdapter`
- `bindView(View view, int position, int viewType)` -> `void`
- `createView(int viewType)` -> `View`
- `getItemCount()` -> `int`
- `getItemTitle(int position)` -> `String`

## `org.telegram.ui.DataUsage2Activity$RoundingCell`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setTop(boolean top)` -> `void`

## `org.telegram.ui.DataUsage2Activity$SubtitleCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setText(CharSequence text)` -> `void`

## `org.telegram.ui.DataUsageActivity`
- `createView(Context context)` -> `View`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `onResume()` -> `void`

## `org.telegram.ui.DataUsageActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.DebugRecordingCanvasReplayFragment`
- `createActionBar(Context context)` -> `ActionBar`
- `createView(Context context)` -> `View`
- `drawEdgeNavigationBar()` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`
- `onFragmentDestroy()` -> `void`

## `org.telegram.ui.Delegates.MemberRequestsDelegate`
- `getAdapter()` -> `Adapter`
- `getEmptyView()` -> `StickerEmptyView`
- `getLoadingView()` -> `FlickerLoadingView`
- `getRecyclerView()` -> `RecyclerListView`
- `getRootLayout()` -> `FrameLayout`
- `getSearchEmptyView()` -> `StickerEmptyView`
- `onAddClicked(TLRPC.TL_chatInviteImporter importer)` -> `void`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onDismissClicked(TLRPC.TL_chatInviteImporter importer)` -> `void`
- `onImportersChanged(String query, boolean fromCache, boolean fromHide)` -> `void`
- `onItemClick(View view, int position)` -> `void`
- `setAdapterItemsEnabled(boolean adapterItemsEnabled)` -> `void`
- `setQuery(String query)` -> `void`
- `setRecyclerView(RecyclerListView recyclerView)` -> `void`
- `setSearchExpanded(boolean isExpanded)` -> `void`
- `setShowLastItemDivider(boolean showLastItemDivider)` -> `void`

## `org.telegram.ui.Delegates.MemberRequestsDelegate$Adapter`
- `appendItems(List<TLRPC.TL_chatInviteImporter> newItems)` -> `void`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerListView.Holder`
- `setItems(List<TLRPC.TL_chatInviteImporter> newItems)` -> `void`

## `org.telegram.ui.Delegates.MemberRequestsDelegate$PreviewDialog`
- `dismiss()` -> `void`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `setImporter(TLRPC.TL_chatInviteImporter importer, BackupImageView imageView)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.DialogCacheBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `getTitle()` -> `CharSequence`
- `onViewCreated(FrameLayout containerView)` -> `void`

## `org.telegram.ui.DialogOrContactPickerActivity`
- `createView(Context context)` -> `View`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`

## `org.telegram.ui.DownloadProgressIcon`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAlpha(float alpha)` -> `void`
- `setVisibility(int visibility)` -> `void`
- `updateColors()` -> `void`
- `updateProgress()` -> `void`

## `org.telegram.ui.DownloadProgressIcon$ProgressObserver`
- `getObserverTag()` -> `int`
- `onFailedDownload(String fileName, boolean canceled)` -> `void`
- `onProgressDownload(String fileName, long downloadSize, long totalSize)` -> `void`
- `onProgressUpload(String fileName, long downloadSize, long totalSize, boolean isEncrypted)` -> `void`
- `onSuccessDownload(String fileName)` -> `void`

## `org.telegram.ui.EditWidgetActivity`
- `createView(Context context)` -> `View`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `setDelegate(EditWidgetActivityDelegate editWidgetActivityDelegate)` -> `void`

## `org.telegram.ui.EditWidgetActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(RecyclerView.ViewHolder holder)` -> `void`
- `swapElements(int fromIndex, int toIndex)` -> `boolean`

## `org.telegram.ui.EditWidgetActivity$WidgetPreviewCell`
- `dispatchSetPressed(boolean pressed)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `updateDialogs()` -> `void`

## `org.telegram.ui.EmptyBaseFragment`
- `createView(Context context)` -> `View`

## `org.telegram.ui.EnableTopicsActivity`
- `createView(Context context)` -> `View`
- `onFragmentCreate()` -> `boolean`
- `setOnForumChanged(boolean forum, boolean tabs, Utilities.Callback2<Boolean, Boolean> listener)` -> `void`

## `org.telegram.ui.EnableTopicsActivity$TopicsLayoutSwitcher`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`

## `org.telegram.ui.EnableTopicsActivity$TopicsLayoutSwitcher$Factory`
- `static asSwitcher(int id, View.OnClickListener leftClick, View.OnClickListener rightClick)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `TopicsLayoutSwitcher`

## `org.telegram.ui.ExternalActionActivity`
- `fixLayout()` -> `void`
- `handleIntent(final Intent intent, final boolean isNew, final boolean restore, final boolean fromPassword, final int intentAccount, int state)` -> `boolean`
- `needAddFragmentToStack(BaseFragment fragment, INavigationLayout layout)` -> `boolean`
- `needCloseLastFragment(INavigationLayout layout)` -> `boolean`
- `needLayout()` -> `void`
- `needPresentFragment(BaseFragment fragment, boolean removeLast, boolean forceWithoutAnimation, INavigationLayout layout)` -> `boolean`
- `onBackPressed()` -> `void`
- `onConfigurationChanged(@NonNull android.content.res.Configuration newConfig)` -> `void`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `onDestroy()` -> `void`
- `onFinishLogin()` -> `void`
- `onLowMemory()` -> `void`
- `onNewIntent(Intent intent)` -> `void`
- `onPause()` -> `void`
- `onPreIme()` -> `boolean`
- `onRebuildAllFragments(INavigationLayout layout, boolean last)` -> `void`
- `onResume()` -> `void`
- `presentFragment(BaseFragment fragment)` -> `void`
- `presentFragment(final BaseFragment fragment, final boolean removeLast, boolean forceWithoutAnimation)` -> `boolean`
- `switchToAccount(int account)` -> `void`

## `org.telegram.ui.FeedWidgetConfigActivity`
- `handleIntent(Intent intent, boolean isNew, boolean restore, boolean fromPassword, int intentAccount, int state)` -> `boolean`

## `org.telegram.ui.FilterChatlistActivity`
- `createView(Context context)` -> `View`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `setOnDelete(Utilities.Callback<TL_chatlists.TL_exportedChatlistInvite> onDelete)` -> `void`
- `setOnEdit(Utilities.Callback<TL_chatlists.TL_exportedChatlistInvite> onEdit)` -> `void`
- `updateRows()` -> `void`

## `org.telegram.ui.FilterChatlistActivity$HintInnerCell`
- `getSubtitleTextView()` -> `SpoilersTextView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setText(CharSequence text, boolean noanimate)` -> `void`

## `org.telegram.ui.FilterChatlistActivity$InviteLinkCell`
- `copy()` -> `void`
- `generate()` -> `void`
- `isRevoked()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `options()` -> `void`
- `qrcode()` -> `void`
- `revoke(boolean revoke)` -> `void`
- `setLink(String _url, boolean animated)` -> `void`
- `share()` -> `void`

## `org.telegram.ui.FilterChatlistActivity$InviteLinkCell$ButtonsBox`
- `onDraw(Canvas canvas)` -> `void`
- `setT(float t)` -> `void`

## `org.telegram.ui.FilterChatlistActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.FilterCreateActivity`
- `createView(Context context)` -> `View`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `getUndoView()` -> `UndoView`
- `static hideNew(int type)` -> `void`
- `isSupportEdgeToEdge()` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onResume()` -> `void`
- `static withNew(int type, CharSequence string, boolean outline)` -> `CharSequence`

## `org.telegram.ui.FilterCreateActivity$ButtonCell`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(int iconResId, CharSequence text, boolean divider)` -> `void`
- `setRed(boolean red)` -> `void`

## `org.telegram.ui.FilterCreateActivity$CreateLinkCell`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setDivider(boolean divider)` -> `void`
- `setEnabled(boolean enabled)` -> `void`
- `setText(String text)` -> `void`

## `org.telegram.ui.FilterCreateActivity$FilterInvitesBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `getTitle()` -> `CharSequence`
- `getTitle(TextView textView)` -> `CharSequence`
- `onViewCreated(FrameLayout containerView)` -> `void`
- `static show(BaseFragment fragment, MessagesController.DialogFilter filter, Runnable onLoaded)` -> `void`

## `org.telegram.ui.FilterCreateActivity$FilterInvitesBottomSheet$HeaderView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.FilterCreateActivity$HintInnerCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.FilterCreateActivity$ItemInner`
- `static asAnimatedHeader(CharSequence text, CharSequence rightText, View.OnClickListener onRightTextClick)` -> `ItemInner`
- `static asButton(int iconResId, CharSequence text, boolean red)` -> `ItemInner`
- `static asChat(boolean include, long did)` -> `ItemInner`
- `static asChat(boolean include, CharSequence name, String chatType, int flags)` -> `ItemInner`
- `static asCreateLink()` -> `ItemInner`
- `static asEdit()` -> `ItemInner`
- `static asHeader(CharSequence text)` -> `ItemInner`
- `static asHeader(CharSequence text, boolean newSpan)` -> `ItemInner`
- `static asLink(TL_chatlists.TL_exportedChatlistInvite invite)` -> `ItemInner`
- `static asShadow(CharSequence text)` -> `ItemInner`
- `equals(Object o)` -> `boolean`
- `whenClicked(View.OnClickListener onClickListener)` -> `ItemInner`

## `org.telegram.ui.FilterCreateActivity$LinkCell`
- `onDelete(TL_chatlists.TL_exportedChatlistInvite invite)` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `options()` -> `void`
- `qrcode()` -> `void`
- `reload()` -> `void`
- `setInvite(TL_chatlists.TL_exportedChatlistInvite invite, boolean divider)` -> `void`
- `setRevoked(boolean value, boolean animated)` -> `void`

## `org.telegram.ui.FilterCreateActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(RecyclerView.ViewHolder holder)` -> `void`
- `onViewDetachedFromWindow(RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.FilterCreateActivity$NewSpan`
- `draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float _x, int top, int _y, int bottom, @NonNull Paint paint)` -> `void`
- `getSize(@NonNull Paint paint, CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm)` -> `int`
- `makeLayout()` -> `StaticLayout`
- `setColor(int color)` -> `void`
- `setText(CharSequence text)` -> `void`
- `setTypeface(Typeface typeface)` -> `void`

## `org.telegram.ui.FilterCreateActivity$TextSpan`
- `draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float _x, int top, int _y, int bottom, @NonNull Paint paint)` -> `void`
- `getSize(@NonNull Paint paint, CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm)` -> `int`

## `org.telegram.ui.FilteredSearchView`
- `static createFromInfoString(MessageObject messageObject, int arrowType)` -> `CharSequence`
- `static createFromInfoString(MessageObject messageObject, boolean includeChat, int arrowType)` -> `CharSequence`
- `static createFromInfoString(MessageObject messageObject, boolean includeChat, int arrowType, TextPaint textPaint)` -> `CharSequence`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `messagesDeleted(long channelId, ArrayList<Integer> markAsDeletedMessages)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `search(long dialogId, long communityId, long minDate, long maxDate, FiltersView.MediaFilterData currentSearchFilter, boolean includeFolder, String query, boolean clearOldResults)` -> `void`
- `setBlurredBackgroundDrawableFactory(BlurredBackgroundDrawableViewFactory factory)` -> `void`
- `setChatPreviewDelegate(SearchViewPager.ChatPreviewDelegate chatPreviewDelegate)` -> `void`
- `setDelegate(Delegate delegate, boolean update)` -> `void`
- `setKeyboardHeight(int keyboardSize, boolean animated)` -> `void`
- `setPagesPaddings(int top, int bottom)` -> `void`
- `setPagesPaddings(int top, int bottom, boolean doNotRequestLayout)` -> `void`
- `setUiCallback(UiCallback callback)` -> `void`
- `setUseFromUserAsAvatar(boolean value)` -> `void`
- `update()` -> `void`

## `org.telegram.ui.FilteredSearchView$FloatingDateView`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `setBlurredBackgroundDrawable(BlurredBackgroundDrawable d)` -> `void`
- `setCustomDate(int date)` -> `void`
- `setCustomText(String text)` -> `void`
- `updateColors()` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.FilteredSearchView$MessageHashId`
- `equals(Object o)` -> `boolean`
- `set(int messageId, long dialogId)` -> `void`

## `org.telegram.ui.FilteredSearchView$OnlyUserFiltersAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.FilteredSearchView$SharedDocumentsAdapter`
- `getCountForSection(int section)` -> `int`
- `getItem(int section, int position)` -> `Object`
- `getItemViewType(int section, int position)` -> `int`
- `getLetter(int position)` -> `String`
- `getPositionForScrollProgress(RecyclerListView listView, float progress, int[] position)` -> `void`
- `getSectionCount()` -> `int`
- `getSectionHeaderView(int section, View view)` -> `View`
- `isEnabled(RecyclerView.ViewHolder holder, int section, int row)` -> `boolean`
- `onBindViewHolder(int section, int position, RecyclerView.ViewHolder holder)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.FilteredSearchView$SharedLinksAdapter`
- `getCountForSection(int section)` -> `int`
- `getItem(int section, int position)` -> `Object`
- `getItemViewType(int section, int position)` -> `int`
- `getLetter(int position)` -> `String`
- `getPositionForScrollProgress(RecyclerListView listView, float progress, int[] position)` -> `void`
- `getSectionCount()` -> `int`
- `getSectionHeaderView(int section, View view)` -> `View`
- `isEnabled(RecyclerView.ViewHolder holder, int section, int row)` -> `boolean`
- `onBindViewHolder(int section, int position, RecyclerView.ViewHolder holder)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.FilteredSearchView$SharedPhotoVideoAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.FiltersSetupActivity`
- `createFolder(INavigationLayout navigationLayout)` -> `void`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `getUndoView()` -> `UndoView`
- `highlightTags()` -> `FiltersSetupActivity`
- `isSupportEdgeToEdge()` -> `boolean`
- `onDefaultTabMoved()` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onResume()` -> `void`

## `org.telegram.ui.FiltersSetupActivity$FilterCell`
- `getCurrentFilter()` -> `MessagesController.DialogFilter`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setFilter(MessagesController.DialogFilter filter, boolean divider, int position)` -> `void`
- `setOnOptionsClick(OnClickListener listener)` -> `void`
- `setOnReorderButtonTouchListener(OnTouchListener listener)` -> `void`

## `org.telegram.ui.FiltersSetupActivity$HintInnerCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.FiltersSetupActivity$ItemInner`
- `static asButton(CharSequence text)` -> `ItemInner`
- `static asCheck(CharSequence text)` -> `ItemInner`
- `static asFilter(MessagesController.DialogFilter filter)` -> `ItemInner`
- `static asHeader(CharSequence text)` -> `ItemInner`
- `static asHint()` -> `ItemInner`
- `static asShadow(CharSequence text)` -> `ItemInner`
- `static asSuggested(TLRPC.TL_dialogFilterSuggested suggested)` -> `ItemInner`
- `equals(Object obj)` -> `boolean`

## `org.telegram.ui.FiltersSetupActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `moveElementToStart(int index)` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `swapElements(int fromPosition, int toPosition)` -> `void`

## `org.telegram.ui.FiltersSetupActivity$SuggestedFilterCell`
- `getSuggestedFilter()` -> `TLRPC.TL_dialogFilterSuggested`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAddOnClickListener(OnClickListener onClickListener)` -> `void`
- `setFilter(TLRPC.TL_dialogFilterSuggested filter, boolean divider)` -> `void`

## `org.telegram.ui.FiltersSetupActivity$TextCell`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setTextAndIcon(String text, Drawable icon, boolean divider)` -> `void`

## `org.telegram.ui.GradientClip`
- `clipOut(Canvas canvas, RectF rect, float alpha)` -> `void`
- `draw(Canvas canvas, RectF rect, boolean top, float alpha)` -> `void`
- `draw(Canvas canvas, RectF rect, int dir, float alpha)` -> `void`
- `getPaint(int dir, float alpha)` -> `Paint`

## `org.telegram.ui.GradientHeaderActivity`
- `applyScrolledPosition()` -> `void`
- `applyScrolledPosition(boolean ignorePaddingView)` -> `void`
- `configureHeader(CharSequence title, CharSequence subTitle, View aboveTitleView, View underSubTitleView)` -> `void`
- `createContentView()` -> `ContentView`
- `createParticlesView()` -> `StarParticlesView`
- `createView(Context context)` -> `View`
- `drawActionBarShadow()` -> `boolean`
- `getHeader(Context context)` -> `View`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isActionBarCrossfadeEnabled()` -> `boolean`
- `isLightStatusBar()` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `onDialogDismiss(Dialog dialog)` -> `void`
- `onHeaderCollapseProgress(float progress)` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `setDarkGradientLocation(float x, float y)` -> `Paint`
- `setMinusHeaderHeight(int h)` -> `void`
- `setWhiteBackground(boolean value)` -> `void`
- `showDialog(Dialog dialog)` -> `Dialog`
- `updateDialogVisibility(boolean isVisible)` -> `void`

## `org.telegram.ui.GradientHeaderActivity$BackgroundView`
- `setData(CharSequence title, CharSequence subTitle, View aboveTitleView, View underSubTitleView)` -> `void`

## `org.telegram.ui.GradientHeaderActivity$ContentView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.GroupCreateActivity`
- `createActionBar(Context context)` -> `ActionBar`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `drawEdgeNavigationBar()` -> `boolean`
- `getAnimatedInsetsTargetView()` -> `View`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSupportEdgeToEdge()` -> `boolean`
- `onAnimatedInsetsChanged(View view, WindowInsetsCompat insets)` -> `void`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onCallUsersSelected(HashSet<Long> users, boolean video)` -> `void`
- `onClick(View v)` -> `void`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `select(ArrayList<Long> ids, boolean premium, boolean miniApps)` -> `void`
- `setDelegate(GroupCreateActivityDelegate groupCreateActivityDelegate)` -> `void`
- `setDelegate2(ContactsAddActivityDelegate contactsAddActivityDelegate)` -> `void`
- `setIgnoreUsers(LongSparseArray<TLObject> users)` -> `void`
- `setInfo(TLRPC.ChatFull chatFull)` -> `void`
- `setShowDiscardConfirm(boolean show)` -> `void`
- `setTitle(String title)` -> `void`

## `org.telegram.ui.GroupCreateActivity$Comparator`
- `compare(TLObject o1, TLObject o2)` -> `int`

## `org.telegram.ui.GroupCreateActivity$ContactsAddActivityDelegate`
- `needAddBot(TLRPC.User user)` -> `default void`

## `org.telegram.ui.GroupCreateActivity$GroupCreateAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `getLetter(int position)` -> `String`
- `getPositionForScrollProgress(RecyclerListView listView, float progress, int[] position)` -> `void`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewRecycled(RecyclerView.ViewHolder holder)` -> `void`
- `searchDialogs(final String query)` -> `void`
- `setSearching(boolean value)` -> `void`

## `org.telegram.ui.GroupCreateFinalActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `didStartUpload(boolean fromAvatarConstructor, boolean isVideo)` -> `void`
- `didUploadPhoto(final TLRPC.InputFile photo, final TLRPC.InputFile video, double videoStartTimestamp, String videoPath, final TLRPC.PhotoSize bigSize, final TLRPC.PhotoSize smallSize, boolean isVideo, TLRPC.VideoSize emojiMarkup)` -> `void`
- `dismissCurrentDialog()` -> `void`
- `dismissDialogOnPause(Dialog dialog)` -> `boolean`
- `getInitialSearchString()` -> `String`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `hideKeyboardOnShow()` -> `boolean`
- `onActivityResultFragment(int requestCode, int resultCode, Intent data)` -> `void`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `onUploadProgressChanged(float progress)` -> `void`
- `restoreSelfArgs(Bundle args)` -> `void`
- `setDelegate(GroupCreateFinalActivityDelegate groupCreateFinalActivityDelegate)` -> `void`

## `org.telegram.ui.GroupCreateFinalActivity$GroupCreateAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewRecycled(RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.GroupInviteActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onResume()` -> `void`

## `org.telegram.ui.GroupInviteActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.HeaderShadowView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `isShadowVisible()` -> `boolean`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `setShadowVisible(boolean visible, boolean animated)` -> `void`

## `org.telegram.ui.IArticleViewer`
- `allowTouches()` -> `boolean`
- `getAdapter()` -> `ArticleViewer.WebpageAdapter`
- `handleLinkClick(ArticleViewer.WebpageAdapter adapter, TextPaintUrlSpan span)` -> `void`
- `openPhoto(TL_iv.PageBlock block, ArticleViewer.WebpageAdapter adapter)` -> `boolean`
- `openWebpageUrl(String url, String anchor, Browser.Progress progress)` -> `void`
- `padx()` -> `int`
- `pady()` -> `int`
- `reset()` -> `void`
- `scrollToAnchor(String anchor, boolean animated)` -> `boolean`

## `org.telegram.ui.IUpdateLayout`
- `createUpdateUI(int currentAccount)` -> `void`
- `updateAppUpdateViews(int currentAccount, boolean animated)` -> `void`
- `updateFileProgress(Object[] args)` -> `void`

## `org.telegram.ui.IdenticonActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onConfigurationChanged(android.content.res.Configuration newConfig)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`

## `org.telegram.ui.IdenticonActivity$LinkMovementMethodMy`
- `onTouchEvent(TextView widget, Spannable buffer, MotionEvent event)` -> `boolean`

## `org.telegram.ui.ImageReceiverSpan`
- `draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, @NonNull Paint paint)` -> `void`
- `enableShadow(boolean enable)` -> `void`
- `getSize(@NonNull Paint paint, CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm)` -> `int`
- `setParent(View parent)` -> `void`
- `setRoundRadius(float radiusDp)` -> `void`
- `setSize(float sz)` -> `void`
- `translate(float x, float y)` -> `void`

## `org.telegram.ui.IntroActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isLightStatusBar()` -> `boolean`
- `onCustomTransitionAnimation(boolean isOpen, Runnable callback)` -> `AnimatorSet`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `setOnLogout()` -> `IntroActivity`

## `org.telegram.ui.IntroActivity$EGLThread`
- `finish()` -> `void`
- `run()` -> `void`
- `setSurfaceTextureSize(int width, int height)` -> `void`
- `shutdown()` -> `void`
- `updatePowerfulTextures()` -> `void`
- `updateTelegramTextures()` -> `void`

## `org.telegram.ui.IntroActivity$IntroAdapter`
- `destroyItem(ViewGroup container, int position, @NonNull Object object)` -> `void`
- `getCount()` -> `int`
- `instantiateItem(ViewGroup container, int position)` -> `Object`
- `restoreState(Parcelable arg0, ClassLoader arg1)` -> `void`
- `setPrimaryItem(@NonNull ViewGroup container, int position, @NonNull Object object)` -> `void`
- `unregisterDataSetObserver(@NonNull DataSetObserver observer)` -> `void`

## `org.telegram.ui.InviteContactsActivity`
- `createActionBar(Context context)` -> `ActionBar`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getAnimatedInsetsTargetView()` -> `View`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSupportEdgeToEdge()` -> `boolean`
- `onAnimatedInsetsChanged(View view, WindowInsetsCompat insets)` -> `void`
- `onClick(View v)` -> `void`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`

## `org.telegram.ui.InviteContactsActivity$InviteAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewRecycled(RecyclerView.ViewHolder holder)` -> `void`
- `searchDialogs(final String query)` -> `void`
- `setSearching(boolean value)` -> `void`

## `org.telegram.ui.InviteContactsActivity$SearchField`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setSpansBounds(int spansCount, float height, float lastLineWidth, boolean over)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.InviteContactsActivity$SpansContainer`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.KeepMediaPopupView`
- `setCallback(Callback callback)` -> `void`
- `update(int type)` -> `void`
- `updateForDialog(boolean addedRecently)` -> `void`

## `org.telegram.ui.KeepMediaPopupView$ExceptionsView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.KeyboardHideHelper`
- `disableScrolling()` -> `boolean`
- `onTouch(AdjustPanLayoutHelper panLayoutHelper, View view, RecyclerListView listView, ChatActivityEnterView enterView, ChatActivity ca, MotionEvent ev)` -> `boolean`

## `org.telegram.ui.LNavigation.NavigationExt`
- `static backToFragment(BaseFragment fragment, FragmentConsumer consumer)` -> `boolean`

## `org.telegram.ui.LanguageSelectActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSupportEdgeToEdge()` -> `boolean`
- `onBecomeFullyVisible()` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onResume()` -> `void`
- `search(final String query)` -> `void`

## `org.telegram.ui.LanguageSelectActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.LaunchActivity`
- `allowShowFingerprintDialog(PasscodeView passcodeView)` -> `boolean`
- `animateNavigationBarColor(int toColor)` -> `void`
- `clearFragments()` -> `void`
- `didReceivedNotification(int id, final int account, Object... args)` -> `void`
- `didSelectDialogs(DialogsActivity dialogsFragment, ArrayList<MessagesStorage.TopicKey> dids, CharSequence message, boolean param, boolean _notify, int _scheduleDate, int scheduleRepeatPeriod, TopicsFragment topicsFragment)` -> `boolean`
- `didSelectStories(DialogsActivity dialogsFragment)` -> `boolean`
- `static dismissAllWeb()` -> `void`
- `dispatchKeyEvent(KeyEvent event)` -> `boolean`
- `static findFragment(Class<T> clazz)` -> `T`
- `getActionBarLayout()` -> `INavigationLayout`
- `getBottomSheetTabs()` -> `BottomSheetTabs`
- `getBottomSheetTabsOverlay()` -> `BottomSheetTabsOverlay`
- `getFireworksOverlay()` -> `FireworksOverlay`
- `getFrameLayout()` -> `FrameLayout`
- `static getLastFragment()` -> `BaseFragment`
- `static getLastFragmentIncludeMainTabs()` -> `BaseFragment`
- `getLayersActionBarLayout()` -> `INavigationLayout`
- `getMainContainerFrameLayout()` -> `FrameLayout`
- `getMainFragmentsCount()` -> `int`
- `getMainFragmentsStackSize()` -> `int`
- `getNavigationBarColor()` -> `int`
- `getPipController()` -> `PipActivityController`
- `getResources()` -> `android.content.res.Resources`
- `getRightActionBarLayout()` -> `INavigationLayout`
- `getRootAnimatedInsetsListener()` -> `WindowAnimatedInsetsProvider`
- `static getSafeLastFragment()` -> `BaseFragment`
- `static getTimestampFromLink(Uri data)` -> `int`
- `hideVisibleActionMode()` -> `void`
- `static makeRipple(float x, float y, float intensity)` -> `void`
- `needAddFragmentToStack(BaseFragment fragment, INavigationLayout layout)` -> `boolean`
- `needCloseLastFragment(INavigationLayout layout)` -> `boolean`
- `needPresentFragment(INavigationLayout layout, INavigationLayout.NavigationParams params)` -> `boolean`
- `static obtainActivityVisibilityController()` -> `WindowVisibilityManager.Controller`
- `onActionModeFinished(ActionMode mode)` -> `void`
- `onActionModeStarted(ActionMode mode)` -> `void`
- `onActivityResult(int requestCode, int resultCode, Intent data)` -> `void`
- `onBackPressed()` -> `void`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `onDestroy()` -> `void`
- `onKeyUp(int keyCode, KeyEvent event)` -> `boolean`
- `onLowMemory()` -> `void`
- `onMultiWindowModeChanged(boolean isInMultiWindowMode)` -> `void`
- `onNewIntent(Intent intent)` -> `void`
- `onNewIntent(Intent intent, Browser.Progress progress)` -> `void`
- `onPause()` -> `void`
- `onPictureInPictureModeChanged(boolean isInPictureInPictureMode, @NonNull Configuration newConfig)` -> `void`
- `onPictureInPictureRequested()` -> `boolean`
- `onPictureInPictureUiStateChanged(@NonNull PictureInPictureUiState pipState)` -> `void`
- `onPreIme()` -> `boolean`
- `onRebuildAllFragments(INavigationLayout layout, boolean last)` -> `void`
- `onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `onSaveInstanceState(Bundle outState)` -> `void`
- `onStart()` -> `void`
- `onStop()` -> `void`
- `onThemeProgress(float progress)` -> `void`
- `onUserInteraction()` -> `void`
- `onUserLeaveHint()` -> `void`
- `openEmailSettings(TL_account.Password currentPassword)` -> `void`
- `openMessage(long dialogId, int messageId, String quote, final Browser.Progress progress, int fromMessageId, final int quoteOffset, Integer task_id, byte[] pollOption)` -> `void`
- `presentFragment(INavigationLayout.NavigationParams params)` -> `void`
- `presentFragment(BaseFragment fragment)` -> `void`
- `presentFragment(final BaseFragment fragment, final boolean removeLast, boolean forceWithoutAnimation)` -> `boolean`
- `rebuildAllFragments(boolean last)` -> `void`
- `setNavigateToPremiumBot(boolean val)` -> `void`
- `setNavigateToPremiumGiftCallback(Runnable val)` -> `void`
- `setNavigationBarColor(int color)` -> `void`
- `setPictureInPictureParams(@NonNull PictureInPictureParams params)` -> `void`
- `showAlertDialog(AlertDialog.Builder builder)` -> `Dialog`
- `static showAttachMenuBot(LaunchActivity launchActivity, int currentAccount, TLRPC.TL_attachMenuBot attachMenuBot, String startApp, boolean sidemenu)` -> `void`
- `showBulletin(Function<BulletinFactory, Bulletin> createBulletin)` -> `void`
- `showPasscodeActivity(boolean fingerprint, boolean animated, int x, int y, Runnable onShow, Runnable onStart)` -> `void`
- `switchToAccount(int account, boolean removeAll)` -> `void`
- `switchToAccount(int account, boolean removeAll, GenericProvider<Void, MainTabsActivity> dialogsActivityProvider)` -> `void`
- `whenWebviewShareAPIDone(Utilities.Callback<Boolean> listener)` -> `void`

## `org.telegram.ui.LaunchActivity$ActivityContentLayout`
- `dispatchApplyWindowInsets(WindowInsets insets)` -> `WindowInsets`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`

## `org.telegram.ui.LaunchActivity$ActivityVisibilityController`
- `destroy()` -> `void`
- `hide()` -> `void`
- `setHidden(boolean hidden)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.LauncherIconController`
- `static setIcon(LauncherIcon icon)` -> `void`
- `static tryFixLauncherIconIfNeeded()` -> `void`

## `org.telegram.ui.LauncherIconController$LauncherIcon`
- `getComponentName(Context ctx)` -> `ComponentName`

## `org.telegram.ui.LinkEditActivity`
- `createView(Context context)` -> `View`
- `finishFragment()` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `setCallback(Callback callback)` -> `void`
- `setInviteToEdit(TLRPC.TL_chatInviteExported invite)` -> `void`

## `org.telegram.ui.LinkManager`
- `getConnectionsManager()` -> `ConnectionsManager`
- `handle(Uri uri)` -> `boolean`

## `org.telegram.ui.LocationActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `disablePermissionCheck()` -> `boolean`
- `finishFragment(boolean animated)` -> `boolean`
- `getAddressName()` -> `String`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isLightStatusBar()` -> `boolean`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onBecomeFullyHidden()` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onLowMemory()` -> `void`
- `onPause()` -> `void`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `searchStories(TL_stories.MediaArea area)` -> `LocationActivity`
- `setChatActivity(ChatActivity chatActivity)` -> `void`
- `setChatLocation(long chatId, TLRPC.TL_channelLocation location)` -> `void`
- `setDelegate(LocationActivityDelegate delegate)` -> `void`
- `setDialogId(long did)` -> `void`
- `setInitialLocation(TLRPC.TL_channelLocation location)` -> `void`
- `setInitialMaxZoom(boolean initialMaxZoom)` -> `void`
- `setMessageObject(MessageObject message)` -> `void`
- `setSharingAllowed(boolean allowed)` -> `void`

## `org.telegram.ui.LocationActivity$MapOverlayView`
- `updatePositions()` -> `void`

## `org.telegram.ui.LocationActivity$NestedFrameLayout`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `drawList(Canvas blurCanvas, boolean top, ArrayList<IViewWithInvalidateCallback> views)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onNestedPreFling(View target, float velocityX, float velocityY)` -> `boolean`
- `onNestedPreScroll(View target, int dx, int dy, int[] consumed, int type)` -> `void`
- `onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed)` -> `void`
- `onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type)` -> `void`
- `onNestedScrollAccepted(View child, View target, int axes, int type)` -> `void`
- `onStartNestedScroll(View child, View target, int axes, int type)` -> `boolean`
- `onStopNestedScroll(View target, int type)` -> `void`
- `onStopNestedScroll(View child)` -> `void`

## `org.telegram.ui.LocationActivity$SearchButton`
- `getTranslationX()` -> `float`
- `setTranslation(float value)` -> `void`
- `setTranslationX(float translationX)` -> `void`

## `org.telegram.ui.LogoutActivity`
- `createView(Context context)` -> `View`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onDialogDismiss(Dialog dialog)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onResume()` -> `void`
- `showLogOutDialog()` -> `void`
- `showLogOutDialog(long grams)` -> `void`

## `org.telegram.ui.LogoutActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.LongPressListenerWithMovingGesture`
- `onLongPress()` -> `void`
- `onTouch(View v, MotionEvent event)` -> `boolean`
- `setSubmenu(ActionBarPopupWindow actionBarPopupWindow)` -> `void`

## `org.telegram.ui.MainTabsActivity`
- `accountView(int account, boolean selected)` -> `LinearLayout`
- `createBaseFragmentAt(int position)` -> `BaseFragment`
- `createContentView(Context context)` -> `FrameLayout`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getCustomSlideTransition(boolean topFragment, boolean backAnimation, float distanceToMove)` -> `Animator`
- `getDialogsActivity()` -> `DialogsActivity`
- `getEdgeToEdgeSupportMode()` -> `EdgeToEdgeSupportMode`
- `getFragmentsCount()` -> `int`
- `getStartPosition()` -> `int`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onApplyWindowInsets(@NonNull View v, @NonNull WindowInsetsCompat insets)` -> `WindowInsetsCompat`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onBeginSlide()` -> `void`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onSlideProgress(boolean isOpen, float progress)` -> `void`
- `onViewPagerScrollEnd()` -> `void`
- `openAccountSelector(View button)` -> `boolean`
- `openCallsSelector(View anchor)` -> `boolean`
- `openContactsSelector(View anchor)` -> `boolean`
- `prepareDialogsActivity(Bundle bundle)` -> `DialogsActivity`
- `prepareFragmentToSlide(boolean topFragment, boolean beginSlide)` -> `void`
- `selectTab(int position, boolean animated)` -> `void`
- `setGestureSelectedOverride(float animatedPosition, boolean allow)` -> `void`
- `updateLayout()` -> `void`

## `org.telegram.ui.MainTabsActivity$FolderCounterSpan`
- `draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, @NonNull Paint paint)` -> `void`
- `getSize(@NonNull Paint paint, CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm)` -> `int`

## `org.telegram.ui.MainTabsActivity$MainTabsActivityControllerImpl`
- `setTabsVisible(boolean visible)` -> `void`

## `org.telegram.ui.MainTabsActivity$TabFragmentDelegate`
- `getGlassSource()` -> `default BlurredBackgroundSourceRenderNode`
- `onParentScrollToTop()` -> `default void`

## `org.telegram.ui.MainTabsLayout`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `static findChildUnder(ViewGroup parent, float x, float y)` -> `View`
- `onItemsChanged()` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChildVisibilityFactor(View view, float factor)` -> `void`
- `setMaxWidth(int maxWidthPx)` -> `void`
- `setScaleX(float scaleX)` -> `void`
- `setScaleY(float scaleY)` -> `void`
- `setTabSelected(View tab, boolean animated)` -> `void`

## `org.telegram.ui.MainTabsLayout$Tab`
- `measureTextWidth(float textSizeDp)` -> `default float`
- `setTextSizeDp(float textSizeDp)` -> `default void`

## `org.telegram.ui.ManageLinksActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `fixDate(TLRPC.TL_chatInviteExported edited)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `needDelayOpenAnimation()` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `onTransitionAnimationStart(boolean isOpen, boolean backward)` -> `void`
- `revokeLink(TLRPC.TL_chatInviteExported invite)` -> `void`
- `setInfo(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite invite)` -> `void`

## `org.telegram.ui.ManageLinksActivity$EmptyView`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`

## `org.telegram.ui.ManageLinksActivity$HintInnerCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.ManageLinksActivity$LinkCell`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setLink(TLRPC.TL_chatInviteExported invite, int position)` -> `void`

## `org.telegram.ui.ManageLinksActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewRecycled(RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.MemberRequestsActivity`
- `createView(Context context)` -> `View`
- `onBackPressed(boolean invoked)` -> `boolean`

## `org.telegram.ui.MessageEnterTransitionContainer`
- `addTransition(Transition transition)` -> `void`
- `isRunning()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `removeTransition(Transition transition)` -> `void`

## `org.telegram.ui.MessageSeenView`
- `createListView()` -> `RecyclerListView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.MessageSendPreview`
- `allowEffectSelector(BaseFragment fragment)` -> `void`
- `changeMessage(MessageObject messageObject)` -> `void`
- `changeMessageInternal(MessageObject messageObject)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss(boolean sent)` -> `void`
- `dismiss()` -> `void`
- `dismissInstant()` -> `void`
- `dismissInto(ChatMessageCell cell, float clipTop, float clipBottom)` -> `void`
- `drawStarsPrice(Canvas canvas, float l, float t, float r, float b)` -> `void`
- `getSelectedEffect()` -> `long`
- `hideEffectSelector()` -> `void`
- `isShowing()` -> `boolean`
- `makeFocusable()` -> `void`
- `onBackPressed()` -> `void`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `onEffectChange(long effectId)` -> `void`
- `scrollTo(boolean last)` -> `void`
- `setCameraTexture(TextureView textureView)` -> `void`
- `setEffectId(long effectId)` -> `void`
- `setItemOptions(ItemOptions options)` -> `void`
- `setMessageObjects(ArrayList<MessageObject> messageObjects)` -> `void`
- `setSendButton(ChatActivityEnterView.SendButton sendButton, boolean fillWhenClose, View.OnClickListener onClick)` -> `ChatActivityEnterView.SendButton`
- `setSendButtonWidth(int width)` -> `void`
- `setStars(long stars)` -> `void`
- `show()` -> `void`
- `showEffectSelector()` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.MessageSendPreview$MessageCell`
- `isPressed()` -> `boolean`
- `makeSpoilerEffect()` -> `SpoilerEffect2`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`

## `org.telegram.ui.MessageSendPreview$VisiblePart`
- `lerpTo(ChatMessageCell to, float t, ChatMessageCell dest)` -> `void`
- `static of(ChatMessageCell cell)` -> `VisiblePart`

## `org.telegram.ui.MessageStatisticActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isLightStatusBar()` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onResume()` -> `void`

## `org.telegram.ui.MessageStatisticActivity$ListAdapter`
- `getItem(int position)` -> `MessageObject`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewRecycled(RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.MessageStatisticActivity$OverviewCell`
- `setData()` -> `void`

## `org.telegram.ui.MultiContactsSelectorBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `dismiss()` -> `void`
- `dismissInternal()` -> `void`
- `getTitle()` -> `CharSequence`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onPreDraw(Canvas canvas, int top, float progressToFullView)` -> `void`
- `static open(Boolean bots, Boolean premium, int maxCount, SelectorListener selectorListener)` -> `MultiContactsSelectorBottomSheet`
- `scrollToTop(boolean animate)` -> `void`
- `updateItems(boolean animated, boolean notify)` -> `void`

## `org.telegram.ui.MultiLayoutTypingAnimator`
- `getBlockAlpha(Block block)` -> `float`
- `getCurrentBlockIndex()` -> `int`
- `getFadeLineIndex(Block block)` -> `int`
- `getFadeXPosition(Block block)` -> `float`
- `indexOf(Block block)` -> `int`
- `needDraw(Block block)` -> `boolean`
- `reset()` -> `void`
- `setBlocks(List<? extends Block> newBlocks)` -> `void`
- `setInvalidateTarget(View invalidateTarget)` -> `void`
- `setOnFinishListener(Runnable onFinishRunnable)` -> `void`
- `start()` -> `void`
- `stop()` -> `void`

## `org.telegram.ui.NewContactBottomSheet`
- `createView(Context context)` -> `View`
- `dismiss()` -> `void`
- `static getAllAccounts(Context context)` -> `ArrayList<AccountInfo>`
- `static getPhoneNumber(Context context, TLRPC.User user, String number, boolean withCoutryCode)` -> `String`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onItemSelected(AdapterView<?> adapterView, View view, int i, long l)` -> `void`
- `onNothingSelected(AdapterView<?> adapterView)` -> `void`
- `selectCountry(CountrySelectActivity.Country country)` -> `void`
- `setInitialName(String firstName, String lastName)` -> `void`
- `setInitialPhoneNumber(String value, boolean withCountryCode)` -> `NewContactBottomSheet`
- `show()` -> `void`

## `org.telegram.ui.NewContactBottomSheet$AccountInfo`
- `toString()` -> `String`

## `org.telegram.ui.PasskeysActivity`
- `createView(Context context)` -> `View`
- `isSupportEdgeToEdge()` -> `boolean`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `static showLearnSheet(Context context, int currentAccount, Theme.ResourcesProvider resourcesProvider, boolean withCreateButton)` -> `void`

## `org.telegram.ui.PasskeysActivity$PasskeyCell`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(TL_account.Passkey passkey, View.OnClickListener onOptions, boolean divider)` -> `void`

## `org.telegram.ui.PasskeysActivity$PasskeyCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `PasskeyCell`
- `static of(TL_account.Passkey passkey, View.OnClickListener options)` -> `UItem`

## `org.telegram.ui.PassportActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `didSelectFiles(ArrayList<String> files, String caption, boolean notify, int scheduleDate, long effectId, boolean invertMedia)` -> `void`
- `didSelectPhotos(ArrayList<SendMessagesHelper.SendingMediaInfo> photos, boolean notify, int scheduleDate)` -> `void`
- `dismissCurrentDialog()` -> `void`
- `dismissDialogOnPause(Dialog dialog)` -> `boolean`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `needHideProgress()` -> `void`
- `needShowProgress()` -> `void`
- `onActivityResultFragment(int requestCode, int resultCode, Intent data)` -> `void`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onDialogDismiss(Dialog dialog)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `restoreSelfArgs(Bundle args)` -> `void`
- `setNeedActivityResult(boolean needActivityResult)` -> `void`
- `setPage(int page, boolean animated, Bundle params)` -> `void`
- `startDocumentSelectActivity()` -> `void`

## `org.telegram.ui.PassportActivity$LinkSpan`
- `onClick(View widget)` -> `void`
- `updateDrawState(TextPaint ds)` -> `void`

## `org.telegram.ui.PassportActivity$PhoneConfirmationView`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `needBackButton()` -> `boolean`
- `onBackPressed(boolean force)` -> `boolean`
- `onCancelPressed()` -> `void`
- `onDestroyActivity()` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onNextPressed(String code)` -> `void`
- `onShow()` -> `void`
- `setParams(Bundle params, boolean restore)` -> `void`

## `org.telegram.ui.PassportActivity$ProgressView`
- `onDraw(Canvas canvas)` -> `void`
- `setProgress(float value)` -> `void`

## `org.telegram.ui.PassportActivity$SecureDocumentCell`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getObserverTag()` -> `int`
- `invalidate()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onFailedDownload(String fileName, boolean canceled)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onProgressDownload(String fileName, long downloadedSize, long totalSize)` -> `void`
- `onProgressUpload(String fileName, long uploadedSize, long totalSize, boolean isEncrypted)` -> `void`
- `onSuccessDownload(String fileName)` -> `void`
- `setTextAndValueAndImage(String text, CharSequence value, SecureDocument document)` -> `void`
- `setValue(CharSequence value)` -> `void`
- `updateButtonState(boolean animated)` -> `void`

## `org.telegram.ui.PassportActivity$TextDetailSecureCell`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked)` -> `void`
- `setNeedDivider(boolean value)` -> `void`
- `setTextAndValue(String text, CharSequence value, boolean divider)` -> `void`
- `setValue(CharSequence value)` -> `void`

## `org.telegram.ui.PaymentFormActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `fillNumber(String number)` -> `void`
- `getIsReadyToPayRequest()` -> `Optional<JSONObject>`
- `getOtherSameFragmentDiff()` -> `int`
- `getResourceProvider()` -> `Theme.ResourcesProvider`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `onActivityResultFragment(int requestCode, int resultCode, Intent data)` -> `void`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onBecomeFullyVisible()` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `presentFragment(BaseFragment fragment)` -> `boolean`
- `presentFragment(BaseFragment fragment, boolean removeLast)` -> `boolean`
- `setCustomAnyResultReceiver(Utilities.Callback<TLRPC.payments_PaymentResult> receiver)` -> `PaymentFormActivity`
- `setCustomErrorReceiver(Utilities.CallbackReturn<TLRPC.TL_error, Boolean> receiver)` -> `void`
- `setCustomResultReceiver(Utilities.Callback<TLRPC.TL_payments_paymentResult> receiver)` -> `PaymentFormActivity`
- `setPaymentFormCallback(PaymentFormCallback callback)` -> `void`
- `setResourcesProvider(Theme.ResourcesProvider provider)` -> `void`

## `org.telegram.ui.PaymentFormActivity$BottomFrameLayout`
- `onDraw(Canvas canvas)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`

## `org.telegram.ui.PaymentFormActivity$LinkSpan`
- `onClick(View widget)` -> `void`
- `updateDrawState(TextPaint ds)` -> `void`

## `org.telegram.ui.PaymentFormActivity$PaymentFormActivityDelegate`
- `currentPasswordUpdated(TL_account.Password password)` -> `default void`
- `didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo validateRequested)` -> `default void`
- `didSelectNewCard(String tokenJson, String card, boolean saveCard, TLRPC.TL_inputPaymentCredentialsGooglePay googlePay, TLRPC.TL_paymentSavedCredentialsCard credentialsCard)` -> `default boolean`
- `onFragmentDestroyed()` -> `default void`

## `org.telegram.ui.PaymentFormActivity$TelegramWebviewProxy`
- `postEvent(final String eventName, final String eventData)` -> `void`

## `org.telegram.ui.PhotoAlbumPickerActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onConfigurationChanged(android.content.res.Configuration newConfig)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `setAllowSearchImages(boolean value)` -> `void`
- `setDelegate(PhotoAlbumPickerActivityDelegate delegate)` -> `void`
- `setMaxSelectedPhotos(int value, boolean order)` -> `void`

## `org.telegram.ui.PhotoAlbumPickerActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.PhotoCropActivity`
- `createView(Context context)` -> `View`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `setDelegate(PhotoEditActivityDelegate delegate)` -> `void`

## `org.telegram.ui.PhotoCropActivity$PhotoCropView`
- `getBitmap()` -> `Bitmap`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`

## `org.telegram.ui.PhotoPickerActivity`
- `clearRecentSearch()` -> `void`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getListView()` -> `RecyclerListView`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isLightStatusBar()` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `setCaption(CharSequence text)` -> `void`
- `setDelegate(PhotoPickerActivityDelegate photoPickerActivityDelegate)` -> `void`
- `setDocumentsPicker(boolean value)` -> `void`
- `setInitialSearchString(String text)` -> `void`
- `setLayoutViews(FrameLayout f2, FrameLayout button, View count, View s, EditTextEmoji emoji)` -> `void`
- `setMaxSelectedPhotos(int value, boolean order)` -> `void`
- `setSearchDelegate(PhotoPickerActivitySearchDelegate photoPickerActivitySearchDelegate)` -> `void`
- `updatePhotosButton(int animated)` -> `void`

## `org.telegram.ui.PhotoPickerActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemId(int i)` -> `long`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.PhotoPickerActivity$PhotoPickerActivityDelegate`
- `onOpenInPressed()` -> `default void`

## `org.telegram.ui.PhotoPickerSearchActivity`
- `createView(Context context)` -> `View`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `onConfigurationChanged(android.content.res.Configuration newConfig)` -> `void`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `setCaption(CharSequence text)` -> `void`
- `setDelegate(PhotoPickerActivity.PhotoPickerActivityDelegate delegate)` -> `void`
- `setMaxSelectedPhotos(int value, boolean order)` -> `void`

## `org.telegram.ui.PinchToZoomHelper`
- `applyTransform(Canvas canvas)` -> `void`
- `clear()` -> `void`
- `drawOverlays(Canvas canvas, float alpha, float parentOffsetX, float parentOffsetY, float clipTop, float clipBottom)` -> `void`
- `finishZoom()` -> `void`
- `getChild()` -> `View`
- `getPhotoImage()` -> `ImageReceiver`
- `getVideoBitmap(int w, int h)` -> `Bitmap`
- `inOverlayMode()` -> `boolean`
- `invalidateViews()` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `setCallback(Callback callback)` -> `void`
- `setClipBoundsListener(ClipBoundsListener clipBoundsListener)` -> `void`
- `startZoom(View child, ImageReceiver image, View textureViewContainer, View textureView, MessageObject messageObject, int spoilerEffect2AttachIndex)` -> `void`
- `zoomEnabled(View child, ImageReceiver receiver)` -> `boolean`

## `org.telegram.ui.PinchToZoomHelper$ZoomOverlayView`
- `dispatchDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.PollCreateActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getEmojiPadding()` -> `int`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `hideEmojiView()` -> `void`
- `hideKeyboardOnShow()` -> `boolean`
- `isAnimatePopupClosing()` -> `boolean`
- `isLightStatusBar()` -> `boolean`
- `isPopupShowing()` -> `boolean`
- `isPopupVisible()` -> `boolean`
- `isWaitingForKeyboardOpen()` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onBecomeFullyVisible()` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onSizeChanged(int height, boolean isWidthGreater)` -> `void`
- `setDelegate(PollCreateActivityDelegate pollCreateActivityDelegate)` -> `void`
- `setEditing(TLRPC.MessageMedia media, boolean adding)` -> `void`
- `setEditing(TLRPC.MessageMedia media, boolean adding, int index)` -> `void`

## `org.telegram.ui.PollCreateActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(RecyclerView.ViewHolder holder)` -> `void`
- `onViewDetachedFromWindow(RecyclerView.ViewHolder holder)` -> `void`
- `swapElements(int fromIndex, int toIndex)` -> `void`

## `org.telegram.ui.PollItemMenu`
- `dismiss()` -> `void`
- `dismiss(boolean backIntoMessage)` -> `void`
- `isShown()` -> `boolean`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `setCell(BaseFragment fragment, ChatMessageCell messageCell, byte[] taskId)` -> `void`
- `setOnDismissListener(Runnable onDismiss)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.PostSuggestionsEditActivity`
- `createView(Context context)` -> `View`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `setOnApplied(MessagesStorage.LongCallback stars)` -> `PostSuggestionsEditActivity`

## `org.telegram.ui.PremiumFeatureCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setData(PremiumPreviewFragment.PremiumFeatureData data, boolean drawDivider)` -> `void`
- `setEmoji(long documentId, boolean animated)` -> `void`
- `updateImageBounds()` -> `void`

## `org.telegram.ui.PremiumFeatureCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `PremiumFeatureCell`
- `static of(PremiumPreviewFragment.PremiumFeatureData data)` -> `UItem`

## `org.telegram.ui.PremiumPreviewFragment`
- `static applyNewSpan(String str)` -> `CharSequence`
- `static applyNewSpan(String str, int fontSize)` -> `CharSequence`
- `static applyNewSpanTimed(CharSequence str, int since)` -> `CharSequence`
- `static buyPremium(BaseFragment fragment)` -> `void`
- `static buyPremium(BaseFragment fragment, String source)` -> `void`
- `static buyPremium(BaseFragment fragment, String source, boolean forcePremium)` -> `void`
- `static buyPremium(BaseFragment fragment, SubscriptionTier tier, String source)` -> `void`
- `static buyPremium(BaseFragment fragment, SubscriptionTier tier, String source, boolean forcePremium)` -> `void`
- `static buyPremium(BaseFragment fragment, SubscriptionTier tier, String source, boolean forcePremium, BillingFlowParams.SubscriptionUpdateParams updateParams)` -> `void`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `drawEdgeNavigationBar()` -> `boolean`
- `static featureTypeToServerString(int type)` -> `String`
- `static fillBusinessFeaturesList(ArrayList<PremiumFeatureData> premiumFeatures, int currentAccount, boolean additional)` -> `void`
- `static fillPremiumFeaturesList(ArrayList<PremiumFeatureData> premiumFeatures, int currentAccount, boolean all)` -> `void`
- `getEdgeToEdgeSupportMode()` -> `EdgeToEdgeSupportMode`
- `static getPremiumButtonText(int currentAccount, SubscriptionTier tier)` -> `String`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isActionBarCrossfadeEnabled()` -> `boolean`
- `isLightStatusBar()` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onDialogDismiss(Dialog dialog)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `static sentPremiumButtonClick()` -> `void`
- `static sentPremiumBuyCanceled()` -> `void`
- `static sentShowFeaturePreview(int currentAccount, int type)` -> `void`
- `static sentShowScreenStat(String source)` -> `void`
- `static serverStringToFeatureType(String s)` -> `int`
- `setForcePremium()` -> `PremiumPreviewFragment`
- `setSelectAnnualByDefault()` -> `PremiumPreviewFragment`
- `showDialog(Dialog dialog)` -> `Dialog`
- `showSelectStatusDialog(PremiumFeatureCell cell, Long documentId, Utilities.Callback2<Long, Integer> onSet)` -> `void`

## `org.telegram.ui.PremiumPreviewFragment$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.PremiumPreviewFragment$BackgroundView`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `updatePremiumTiers()` -> `void`
- `updateText()` -> `void`

## `org.telegram.ui.PremiumPreviewFragment$SubscriptionTier`
- `getCurrency()` -> `String`
- `getDiscount()` -> `int`
- `getFormattedPrice()` -> `String`
- `getFormattedPricePerMonth()` -> `String`
- `getFormattedPricePerYear()` -> `String`
- `getFormattedPricePerYearRegular()` -> `String`
- `getGooglePlayProductDetails()` -> `ProductDetails`
- `getMonths()` -> `int`
- `getOfferDetails()` -> `ProductDetails.SubscriptionOfferDetails`
- `getPrice()` -> `long`
- `getPricePerMonth()` -> `long`
- `getPricePerYear()` -> `long`
- `setGooglePlayProductDetails(ProductDetails googlePlayProductDetails)` -> `void`
- `setPricePerYearRegular(long pricePerYearRegular)` -> `void`

## `org.telegram.ui.PrivacyControlActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `didStartUpload(boolean fromAvatarConstructor, boolean isVideo)` -> `void`
- `didUploadPhoto(TLRPC.InputFile photo, TLRPC.InputFile video, double videoStartTimestamp, String videoPath, TLRPC.PhotoSize bigSize, TLRPC.PhotoSize smallSize, boolean isVideo, TLRPC.VideoSize emojiMarkup)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSupportEdgeToEdge()` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`

## `org.telegram.ui.PrivacyControlActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.PrivacyControlActivity$MessageCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchSetPressed(boolean pressed)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `invalidate()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.ui.PrivacyUsersActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSupportEdgeToEdge()` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onResume()` -> `void`
- `setDelegate(PrivacyActivityDelegate privacyActivityDelegate)` -> `void`

## `org.telegram.ui.PrivacyUsersActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.ProxyListActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onDialogDismiss(Dialog dialog)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onResume()` -> `void`

## `org.telegram.ui.ProxyListActivity$ListAdapter`
- `clearSelected()` -> `void`
- `getItemCount()` -> `int`
- `getItemId(int position)` -> `long`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position, @NonNull List payloads)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(RecyclerView.ViewHolder holder)` -> `void`
- `toggleSelected(int position)` -> `void`

## `org.telegram.ui.ProxyListActivity$TextDetailProxyCell`
- `onAttachedToWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked)` -> `void`
- `setItemSelected(boolean selected, boolean animated)` -> `void`
- `setProxy(SharedConfig.ProxyInfo proxyInfo)` -> `void`
- `setSelectionEnabled(boolean enabled, boolean animated)` -> `void`
- `setValue(CharSequence value)` -> `void`
- `updateStatus()` -> `void`

## `org.telegram.ui.QrActivity`
- `createView(Context context)` -> `View`
- `drawEdgeNavigationBar()` -> `boolean`
- `getEdgeToEdgeSupportMode()` -> `EdgeToEdgeSupportMode`
- `getResourceProvider()` -> `Theme.ResourcesProvider`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSupportEdgeToEdge()` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `static openCameraScanActivity(BaseFragment fragment)` -> `void`
- `performShare()` -> `void`

## `org.telegram.ui.QrActivity$QrView`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `setCenterChangedListener(QrCenterChangedListener centerChangedListener)` -> `void`
- `setColors(int c1, int c2, int c3, int c4)` -> `void`
- `setData(String link, String username, boolean isPhone, boolean isTimer)` -> `void`
- `setForShare(boolean enable)` -> `void`
- `setPosAnimationProgress(float progress)` -> `void`

## `org.telegram.ui.ReadAllMentionsMenu`
- `static show(int type, Activity activity, INavigationLayout navigationLayout, FrameLayout contentView, View mentionButton, Theme.ResourcesProvider resourcesProvider, Runnable onRead)` -> `ActionBarPopupWindow`

## `org.telegram.ui.RecyclerListViewScroller`
- `smoothScrollBy(int dy)` -> `void`
- `smoothScrollBy(int dy, long duration, Interpolator interpolator)` -> `void`

## `org.telegram.ui.ReportBottomSheet`
- `onBackPressed()` -> `void`

## `org.telegram.ui.ReportBottomSheet$ContainerView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.ReportBottomSheet$Listener`
- `onHidden()` -> `default void`
- `onPremiumRequired()` -> `default void`
- `onReported()` -> `default void`

## `org.telegram.ui.ReportBottomSheet$Page`
- `atTop()` -> `boolean`
- `bind(int pageType)` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `setHeaderText(CharSequence headerText)` -> `void`
- `setOption(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption option)` -> `void`
- `setOption(TLRPC.TL_reportResultChooseOption option)` -> `void`
- `setOption(TLRPC.TL_reportResultAddComment option)` -> `void`
- `top()` -> `float`
- `updateTops()` -> `void`

## `org.telegram.ui.ReportBottomSheet$Page$BigHeaderCell`
- `getText()` -> `CharSequence`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setCloseImageVisible(boolean visible)` -> `void`
- `setOnBackClickListener(Runnable onCloseClickListener)` -> `void`
- `setText(CharSequence text)` -> `void`

## `org.telegram.ui.RestrictedLanguagesSelectActivity`
- `static cleanup()` -> `void`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static getExtendedDoNotTranslate(Utilities.Callback<HashSet<String>> onDone)` -> `void`
- `static getRestrictedLanguages()` -> `HashSet<String>`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `static invalidateRestrictedLanguages()` -> `void`
- `isSupportEdgeToEdge()` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onResume()` -> `void`
- `search(final String query)` -> `void`
- `static toggleLanguage(String language, boolean doNotTranslate)` -> `boolean`
- `static updateRestrictedLanguages(HashSet<String> value, Boolean changed)` -> `void`

## `org.telegram.ui.RestrictedLanguagesSelectActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.RevenueSharingAdsInfoBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTitle()` -> `CharSequence`
- `static showAlert(Context context, BaseFragment fragment, boolean bot, Theme.ResourcesProvider resourcesProvider)` -> `RevenueSharingAdsInfoBottomSheet`
- `static showAlert(Context context, BaseFragment fragment, boolean bot, Theme.ResourcesProvider resourcesProvider, Utilities.Callback<ItemOptions> options)` -> `RevenueSharingAdsInfoBottomSheet`

## `org.telegram.ui.RightSlidingDialogContainer`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `finishPreview()` -> `void`
- `finishPreviewInernal()` -> `void`
- `getCurrentFragmetDialogId()` -> `long`
- `getFragment()` -> `BaseFragment`
- `getFragmentView()` -> `View`
- `static getRightPaddingSize()` -> `int`
- `isActionModeShowed()` -> `boolean`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `openAnimationFinished(boolean backward)` -> `void`
- `openAnimationStarted(boolean open)` -> `void`
- `presentFragment(INavigationLayout navigationLayout, BaseFragment fragment)` -> `void`
- `setCurrentTop(int top)` -> `void`
- `setFragmentViewPadding(int fragmentViewPadding)` -> `void`
- `setOpenProgress(float progress)` -> `void`
- `setTransitionPaddingBottom(int transitionPadding)` -> `void`
- `updateOpenAnimationProgress()` -> `void`

## `org.telegram.ui.RoundVideoProgressShadow`
- `draw(Canvas canvas, float cx, float cy, float radius, float alpha)` -> `void`

## `org.telegram.ui.SearchAdsInfoBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTitle()` -> `CharSequence`
- `static showAlert(Context context, BaseFragment fragment, boolean bot, Theme.ResourcesProvider resourcesProvider)` -> `RevenueSharingAdsInfoBottomSheet`
- `static showAlert(Context context, BaseFragment fragment, boolean bot, Theme.ResourcesProvider resourcesProvider, Utilities.Callback<ItemOptions> options)` -> `RevenueSharingAdsInfoBottomSheet`

## `org.telegram.ui.SearchTabsAndFiltersLayout`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `setBlurredBackground(BlurredBackgroundDrawable drawable)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.SecretMediaViewer`
- `closePhoto(boolean animated, boolean byDelete)` -> `boolean`
- `destroyPhotoViewer()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getAnimationValue()` -> `float`
- `getCloseTime()` -> `long`
- `static getInstance()` -> `SecretMediaViewer`
- `getOpenTime()` -> `long`
- `getVideoCrossfadeAlpha()` -> `float`
- `onDoubleTap(MotionEvent e)` -> `boolean`
- `onDoubleTapEvent(MotionEvent e)` -> `boolean`
- `onDown(MotionEvent e)` -> `boolean`
- `onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY)` -> `boolean`
- `onLongPress(MotionEvent e)` -> `void`
- `onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY)` -> `boolean`
- `onShowPress(MotionEvent e)` -> `void`
- `onSingleTapConfirmed(MotionEvent e)` -> `boolean`
- `onSingleTapUp(MotionEvent e)` -> `boolean`
- `openMedia(MessageObject messageObject, PhotoViewer.PhotoViewerProvider provider, Runnable onOpen, Runnable onClose)` -> `void`
- `setAnimationValue(float value)` -> `void`
- `setOnClose(Runnable onClose)` -> `void`
- `setParentActivity(Activity activity)` -> `void`
- `setVideoCrossfadeAlpha(float value)` -> `void`

## `org.telegram.ui.SecretMediaViewer$FrameLayoutDrawer`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.ui.SecretMediaViewer$PhotoBackgroundDrawable`
- `draw(Canvas canvas)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setBounds(int left, int top, int right, int bottom)` -> `void`
- `setBounds(@NonNull Rect bounds)` -> `void`

## `org.telegram.ui.SecretMediaViewer$SecretDeleteTimer`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.SelectChatUserSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `dismiss()` -> `void`
- `getTitle()` -> `CharSequence`

## `org.telegram.ui.SelectChatUserSheet$ParticipantsList`
- `attach()` -> `void`
- `clear()` -> `void`
- `detach()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `listen(Runnable onUpdate)` -> `ParticipantsList`
- `setFilter(TLRPC.ChannelParticipantsFilter filter)` -> `ParticipantsList`

## `org.telegram.ui.SessionBottomSheet`
- `show()` -> `void`

## `org.telegram.ui.SessionBottomSheet$ItemView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`

## `org.telegram.ui.SessionsActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getSessionsCount()` -> `int`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSupportEdgeToEdge()` -> `boolean`
- `onBecomeFullyHidden()` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onPause()` -> `void`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `setDelegate(Delegate delegate)` -> `void`
- `setHighlightLinkDesktopDevice()` -> `SessionsActivity`

## `org.telegram.ui.SessionsActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemId(int position)` -> `long`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.SessionsActivity$ScanQRCodeView`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.ShareActivity`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `onPause()` -> `void`

## `org.telegram.ui.SpeedButtonsLayout`
- `update(float currentVideoSpeed, boolean isFinal)` -> `void`

## `org.telegram.ui.StakedDiceSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `getTitle()` -> `CharSequence`
- `isTouchOutside(float x, float y)` -> `boolean`
- `onContainerTranslationYChanged(float translationY)` -> `void`
- `onDismissAnimationStart()` -> `void`
- `onOpenAnimationEnd()` -> `void`
- `static showStakeToast(BaseFragment fragment, int value, long stake, Utilities.Callback<Long> send)` -> `void`

## `org.telegram.ui.Stars.BagRandomizer`
- `getNext()` -> `T`
- `next()` -> `T`
- `reset()` -> `void`
- `setReshuffleIfEnd(boolean reshuffleIfEnd)` -> `void`

## `org.telegram.ui.Stars.BalanceCloud`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setCurrency(AmountUtils.Currency currency, boolean animated)` -> `void`

## `org.telegram.ui.Stars.BotStarsActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `isLightStatusBar()` -> `boolean`
- `isLoadingVisible()` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `static untilString(int t)` -> `String`

## `org.telegram.ui.Stars.BotStarsActivity$NestedFrameLayout`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onNestedPreFling(View target, float velocityX, float velocityY)` -> `boolean`
- `onNestedPreScroll(View target, int dx, int dy, int[] consumed, int type)` -> `void`
- `onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed)` -> `void`
- `onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type)` -> `void`
- `onNestedScrollAccepted(View child, View target, int axes, int type)` -> `void`
- `onStartNestedScroll(View child, View target, int axes, int type)` -> `boolean`
- `onStopNestedScroll(View target, int type)` -> `void`
- `onStopNestedScroll(View child)` -> `void`

## `org.telegram.ui.Stars.BotStarsController`
- `botHasStars(long did)` -> `boolean`
- `botHasTON(long did)` -> `boolean`
- `channelHasConnectedBots(long dialogId)` -> `boolean`
- `channelHasSuggestedBots(long dialogId)` -> `boolean`
- `didFullyLoadTransactions(long did, int type)` -> `boolean`
- `getAdmined()` -> `ArrayList<TLObject>`
- `getAdminedChannels()` -> `ArrayList<TLObject>`
- `getAvailableBalance(long did)` -> `long`
- `getBotStarsBalance(long did)` -> `TL_stars.StarsAmount`
- `getChannelConnectedBots(long dialogId)` -> `ChannelConnectedBots`
- `getChannelSuggestedBots(long dialogId)` -> `ChannelSuggestedBots`
- `getConnectedBot(Context context, long dialogId, long botId, Utilities.Callback<TL_payments.connectedBotStarRef> whenDone)` -> `void`
- `static getInstance(int num)` -> `BotStarsController`
- `getStarsRevenueStats(long did)` -> `TLRPC.TL_payments_starsRevenueStats`
- `getStarsRevenueStats(long did, boolean force)` -> `TLRPC.TL_payments_starsRevenueStats`
- `getTONBalance(long did)` -> `long`
- `getTONRevenueStats(long did, boolean force)` -> `TLRPC.TL_payments_starsRevenueStats`
- `getTransactions(long did, int type)` -> `ArrayList<TL_stars.StarsTransaction>`
- `invalidateStarsBalance(long did)` -> `void`
- `invalidateTransactions(long did, boolean load)` -> `void`
- `preloadStarsStats(long did)` -> `void`
- `preloadTonStats(long did)` -> `void`
- `preloadTransactions(long did)` -> `void`

## `org.telegram.ui.Stars.BotStarsController$ChannelConnectedBots`
- `apply(TL_payments.connectedStarRefBots res)` -> `void`
- `applyEdit(TL_payments.connectedStarRefBots res)` -> `void`
- `clear()` -> `void`

## `org.telegram.ui.Stars.BotStarsController$ChannelSuggestedBots`
- `clear()` -> `void`
- `getCount()` -> `int`
- `getSort()` -> `Sort`
- `reload()` -> `void`
- `setSort(Sort sort)` -> `void`

## `org.telegram.ui.Stars.ExplainStarsSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTitle()` -> `CharSequence`

## `org.telegram.ui.Stars.ExplainStarsSheet$FeatureCell`
- `set(int iconResId, CharSequence title, CharSequence text)` -> `void`
- `setSubtitle(CharSequence text)` -> `void`
- `setTitle(CharSequence text)` -> `void`

## `org.telegram.ui.Stars.ExplainStarsSheet$FeatureCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `FeatureCell`
- `static of(int iconResId, CharSequence title, CharSequence text)` -> `UItem`

## `org.telegram.ui.Stars.ISuperRipple`
- `animate(float cx, float cy, float intensity)` -> `void`

## `org.telegram.ui.Stars.MessageSuggestionOfferSheet`
- `static formatDateTime(long time)` -> `String`
- `isTouchOutside(float x, float y)` -> `boolean`
- `onContainerTranslationYChanged(float translationY)` -> `void`
- `onOpenAnimationEnd()` -> `void`
- `show()` -> `void`

## `org.telegram.ui.Stars.StarsController`
- `balanceAvailable()` -> `boolean`
- `beforeSendingFinalRequest(TLObject req, MessageObject msg, Runnable send)` -> `boolean`
- `beforeSendingFinalRequest(TLObject req, ArrayList<MessageObject> messages, Runnable send)` -> `boolean`
- `beforeSendingMessage(MessageObject msg)` -> `void`
- `buyGift(Activity activity, TL_stars.TL_starsGiftOption option, long user_id, Utilities.Callback2<Boolean, String> whenDone)` -> `void`
- `buyPremiumGift(long dialogId, Object option, TLRPC.TL_textWithEntities text, Utilities.Callback2<Boolean, String> whenDone)` -> `void`
- `buyResellingGift(TLRPC.TL_payments_paymentFormStarGift form, TL_stars.StarGift gift, long dialogId, Utilities.Callback2<Boolean, String> whenDone)` -> `void`
- `buyResellingGift(TLRPC.TL_payments_paymentFormStarGift form, TL_stars.StarGift gift, long dialogId, TLRPC.TL_textWithEntities message, boolean hideMyName, Utilities.Callback2<Boolean, String> whenDone)` -> `void`
- `buyStarGift(TL_stars.StarGift gift, boolean anonymous, boolean upgraded, long dialogId, TLRPC.TL_textWithEntities text, Utilities.Callback2<Boolean, String> whenDone)` -> `void`
- `commitPaidReaction()` -> `void`
- `didFullyLoadSubscriptions()` -> `boolean`
- `didFullyLoadTransactions(int type)` -> `boolean`
- `static eq(final TL_stars.SavedStarGift a, final TL_stars.SavedStarGift b)` -> `boolean`
- `static findAttribute(ArrayList<TL_stars.StarGiftAttribute> attributes, Class<T> clazz)` -> `T`
- `static findAttributes(ArrayList<TL_stars.StarGiftAttribute> attributes, Class<T> clazz)` -> `ArrayList<T>`
- `findUserStarGift(long collection_id)` -> `TL_stars.SavedStarGift`
- `static getAllowedPaidStars(TLObject req)` -> `long`
- `getBalance()` -> `TL_stars.StarsAmount`
- `getBalance(boolean withMinus)` -> `long`
- `getBalance(Runnable loaded)` -> `TL_stars.StarsAmount`
- `getBalance(boolean withMinus, Runnable loaded, boolean force)` -> `TL_stars.StarsAmount`
- `getBalanceAmount()` -> `AmountUtils.Amount`
- `getContext(BaseFragment fragment)` -> `Context`
- `static getFormStarsPrice(TLRPC.PaymentForm form)` -> `long`
- `getGiftOptions()` -> `ArrayList<TL_stars.TL_starsGiftOption>`
- `getGiftOptionsCached()` -> `ArrayList<TL_stars.TL_starsGiftOption>`
- `getGiveawayOptions()` -> `ArrayList<TL_stars.TL_starsGiveawayOption>`
- `getGiveawayOptionsCached()` -> `ArrayList<TL_stars.TL_starsGiveawayOption>`
- `static getInstance(int num)` -> `StarsController`
- `static getInstance(int num, AmountUtils.Currency currency)` -> `StarsController`
- `static getInstance(int num, boolean ton)` -> `StarsController`
- `getOptions()` -> `ArrayList<TL_stars.TL_starsTopupOption>`
- `getOptionsCached()` -> `ArrayList<TL_stars.TL_starsTopupOption>`
- `getPaidRevenue(long user_id, long parent_id, Utilities.Callback<Long> got)` -> `void`
- `static getPeer(TLObject req)` -> `long`
- `getPendingPaidReactions(MessageObject messageObject)` -> `long`
- `getPendingPaidReactions(long dialogId, int messageId)` -> `long`
- `getProfileGiftCollectionsList(long dialogId, boolean create)` -> `GiftsCollections`
- `getProfileGiftsList(long dialogId)` -> `GiftsList`
- `getProfileGiftsList(long dialogId, boolean create)` -> `GiftsList`
- `getResellingGiftForm(TL_stars.StarGift gift, long dialogId, Utilities.Callback<TLRPC.TL_payments_paymentFormStarGift> whenDone)` -> `void`
- `getResellingGiftForm(TL_stars.StarGift gift, long dialogId, TLRPC.TL_textWithEntities message, boolean hideMyName, Utilities.Callback<TLRPC.TL_payments_paymentFormStarGift> whenDone)` -> `void`
- `getResourceProvider()` -> `Theme.ResourcesProvider`
- `getStarGift(long gift_id)` -> `TL_stars.StarGift`
- `getStarGift(long gift_id, Utilities.Callback<TL_stars.StarGift> whenDone)` -> `Runnable`
- `getStarGiftPreview(long gift_id, Utilities.Callback<TL_stars.starGiftUpgradePreview> got)` -> `void`
- `static getTonInstance(int num)` -> `StarsController`
- `hidePaidMessageToast(MessageObject messageObject)` -> `void`
- `invalidateBalance()` -> `void`
- `invalidateBalance(Runnable loaded)` -> `void`
- `invalidateInsufficientSubscriptions(boolean load)` -> `void`
- `invalidateProfileGifts(long dialogId)` -> `void`
- `invalidateProfileGifts(TLRPC.UserFull userFull)` -> `void`
- `invalidateStarGifts()` -> `void`
- `invalidateSubscriptions(boolean load)` -> `void`
- `invalidateTransactions(boolean load)` -> `void`
- `makeStarGiftSoldOut(TL_stars.StarGift starGift)` -> `void`
- `openPaymentForm(MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars form, Runnable whenShown, Utilities.Callback<String> whenAllDone)` -> `void`
- `pay(MessageObject messageObject, Runnable whenShown)` -> `Runnable`
- `payAfterConfirmed(MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars form, Utilities.Callback<Boolean> whenDone)` -> `void`
- `preloadTransactions()` -> `void`
- `static showNoSupportDialog(Context context, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `showPriceChangedToast(List<MessageObject> msgs)` -> `void`
- `showStarsTopup(Activity activity, long amount, String purpose)` -> `void`
- `stopPaidMessages(long user_id, long parent_id, boolean refund, boolean stop)` -> `void`
- `subscribeTo(String hash, TLRPC.ChatInvite chatInvite, Utilities.Callback2<String, Long> whenAllDone)` -> `void`
- `undoPaidReaction()` -> `void`
- `updateBalance(TL_stars.StarsAmount balance)` -> `void`
- `updateMediaPrice(MessageObject msg, long price, Runnable done)` -> `void`

## `org.telegram.ui.Stars.StarsController$MessageId`
- `equals(@Nullable Object obj)` -> `boolean`
- `static from(long did, int mid)` -> `MessageId`
- `static from(MessageObject msg)` -> `MessageId`

## `org.telegram.ui.Stars.StarsController$PaidMessagesToast`
- `getSubtitle()` -> `CharSequence`
- `getTitle()` -> `CharSequence`
- `pop(int messageId)` -> `boolean`
- `push(MessageObject messageObject, long payStars, Utilities.Callback<HashSet<MessageObject>> undo, Runnable send, boolean needsUndo)` -> `boolean`
- `undo()` -> `void`

## `org.telegram.ui.Stars.StarsIntroActivity`
- `attachedTransactionsLayout()` -> `boolean`
- `createAdapter()` -> `RecyclerView.Adapter<?>`
- `createContentView()` -> `ContentView`
- `createParticlesView()` -> `StarParticlesView`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `drawActionBarShadow()` -> `boolean`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `static formatStarsAmount(TL_stars.StarsAmount starsAmount)` -> `CharSequence`
- `static formatStarsAmount(TL_stars.StarsAmount starsAmount, float relativeSize, char symbol)` -> `CharSequence`
- `static formatStarsAmountShort(TL_stars.StarsAmount starsAmount)` -> `CharSequence`
- `static formatStarsAmountShort(TL_stars.StarsAmount starsAmount, float relativeSize, char symbol)` -> `CharSequence`
- `static formatStarsAmountString(TL_stars.StarsAmount starsAmount)` -> `CharSequence`
- `static formatStarsAmountString(TL_stars.StarsAmount starsAmount, float relativeSize, char symbol)` -> `CharSequence`
- `static formatTON(long ton)` -> `String`
- `static getGiftStarsEmoji(long stars)` -> `String`
- `getHeader(Context context)` -> `View`
- `static getPremiumGiftMonthsEmoji(int months)` -> `String`
- `static getTonGiftEmoji(long nanotons)` -> `String`
- `static getTransactionTitle(int currentAccount, boolean bot, TL_stars.StarsTransaction t)` -> `CharSequence`
- `static makeParticlesView(Context context, int particlesCount, int type)` -> `StarParticlesView`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onItemClick(UItem item, int position)` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `static replaceDiamond(CharSequence cs)` -> `SpannableStringBuilder`
- `static replaceDiamond(CharSequence cs, final float scale)` -> `SpannableStringBuilder`
- `static replaceDiamond(CharSequence cs, final float scale, ColoredImageSpan[] cache, final float tx, final float ty, float sx)` -> `SpannableStringBuilder`
- `static replaceStars(TL_stars.StarsAmount amount, CharSequence cs)` -> `SpannableStringBuilder`
- `static replaceStars(boolean ton, CharSequence cs)` -> `SpannableStringBuilder`
- `static replaceStars(CharSequence cs)` -> `SpannableStringBuilder`
- `static replaceStars(boolean ton, CharSequence cs, final float scale)` -> `SpannableStringBuilder`
- `static replaceStars(TL_stars.StarsAmount amount, CharSequence cs, final float scale)` -> `SpannableStringBuilder`
- `static replaceStars(CharSequence cs, final float scale)` -> `SpannableStringBuilder`
- `static replaceStars(boolean ton, CharSequence cs, final float scale, ColoredImageSpan[] cache)` -> `SpannableStringBuilder`
- `static replaceStars(TL_stars.StarsAmount amount, CharSequence cs, final float scale, ColoredImageSpan[] cache)` -> `SpannableStringBuilder`
- `static replaceStars(CharSequence cs, final float scale, ColoredImageSpan[] cache)` -> `SpannableStringBuilder`
- `static replaceStars(CharSequence cs, final float scale, ColoredImageSpan[] cache, final float tx, final float ty, final float sx)` -> `SpannableStringBuilder`
- `static replaceStars(TL_stars.StarsAmount amount, CharSequence cs, final float scale, ColoredImageSpan[] cache, final float tx, final float ty, final float sx)` -> `SpannableStringBuilder`
- `static replaceStars(boolean ton, CharSequence cs, final float scale, ColoredImageSpan[] cache, final float tx, final float ty, final float sx)` -> `SpannableStringBuilder`
- `static replaceStars(CharSequence cs, ColoredImageSpan[] spanRef)` -> `SpannableStringBuilder`
- `static replaceStars(boolean ton, CharSequence cs, ColoredImageSpan[] spanRef)` -> `SpannableStringBuilder`
- `static replaceStarsWithPlain(CharSequence cs, float scale)` -> `SpannableStringBuilder`
- `static replaceStarsWithPlain(boolean ton, CharSequence cs, float scale)` -> `SpannableStringBuilder`
- `static replaceStarsWithPlain(TL_stars.StarsAmount amount, CharSequence cs, float scale)` -> `SpannableStringBuilder`
- `static replaceStarsWithPlain(CharSequence cs, float scale, ColoredImageSpan[] spanArr)` -> `SpannableStringBuilder`
- `static replaceStarsWithPlain(TL_stars.StarsAmount amount, CharSequence cs, float scale, ColoredImageSpan[] spanArr)` -> `SpannableStringBuilder`
- `static replaceStarsWithPlain(boolean ton, CharSequence cs, float scale, ColoredImageSpan[] spanArr)` -> `SpannableStringBuilder`
- `static setGiftImage(View view, ImageReceiver imageReceiver, long stars)` -> `Runnable`
- `static setGiftImage(View view, ImageReceiver imageReceiver, String emoji)` -> `Runnable`
- `static setGiftImage(View view, ImageReceiver imageReceiver, String emoji, boolean isTon)` -> `Runnable`
- `static setGiftImage(ImageReceiver imageReceiver, TLRPC.Document document, int size)` -> `void`
- `static setGiftImage(ImageReceiver imageReceiver, TL_stars.StarGift gift, int size)` -> `void`
- `static setPremiumGiftImage(View view, ImageReceiver imageReceiver, int months)` -> `Runnable`
- `static setTonGiftImage(View view, ImageReceiver imageReceiver, long nanotons)` -> `Runnable`
- `static showBoostsSheet(Context context, int currentAccount, long dialogId, TL_stories.Boost boost, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet`
- `static showGiftResellPriceSheet(Context context, int currentAccount, Utilities.Callback2<AmountUtils.Amount, Runnable> whenDone, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet`
- `static showGiftResellPriceSheet(Context context, int currentAccount, @Nullable TL_stars.StarGift gift, @Nullable AmountUtils.Amount price, Utilities.Callback2<AmountUtils.Amount, Runnable> whenDone, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet`
- `static showMediaPriceSheet(Context context, long stars, boolean allowClear, Utilities.Callback2<Long, Runnable> whenDone, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet`
- `static showSoldOutGiftSheet(Context context, int currentAccount, TL_stars.StarGift gift, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet`
- `static showSubscriptionSheet(Context context, int currentAccount, TL_stars.StarsSubscription subscription, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet`
- `static showTransactionSheet(Context context, int currentAccount, int date, TLRPC.Peer sent_by, TLRPC.Peer received_by, TLRPC.TL_messageActionPrizeStars action, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet`
- `static showTransactionSheet(Context context, int currentAccount, int date, TLRPC.Peer sent_by, TLRPC.Peer received_by, TLRPC.TL_messageActionGiftStars action, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet`
- `static showTransactionSheet(Context context, int currentAccount, int date, TLRPC.Peer sent_by, TLRPC.Peer received_by, TLRPC.TL_messageActionGiftTon action, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet`
- `static showTransactionSheet(Context context, int currentAccount, int date, TLRPC.TL_messageActionPaymentRefunded action, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet`
- `static showTransactionSheet(Context context, boolean bot, int currentAccount, TLRPC.TL_payments_paymentReceiptStars receipt, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet`
- `static showTransactionSheet(Context context, boolean bot, long dialogId, int currentAccount, TL_stars.StarsTransaction transaction, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet`

## `org.telegram.ui.Stars.StarsIntroActivity$ExpandView`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(UItem item, boolean divider)` -> `void`
- `set(String text, boolean collapsed, boolean accent, boolean divider)` -> `void`

## `org.telegram.ui.Stars.StarsIntroActivity$ExpandView$Factory`
- `static asExpand(int id, CharSequence text, boolean collapsed)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `ExpandView`

## `org.telegram.ui.Stars.StarsIntroActivity$NestedFrameLayout`
- `onNestedPreFling(View target, float velocityX, float velocityY)` -> `boolean`
- `onNestedPreScroll(View target, int dx, int dy, int[] consumed, int type)` -> `void`
- `onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed)` -> `void`
- `onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type)` -> `void`
- `onNestedScrollAccepted(View child, View target, int axes, int type)` -> `void`
- `onStartNestedScroll(View child, View target, int axes, int type)` -> `boolean`
- `onStopNestedScroll(View target, int type)` -> `void`
- `onStopNestedScroll(View child)` -> `void`

## `org.telegram.ui.Stars.StarsIntroActivity$StarTierView`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(int starsCount, CharSequence text1, CharSequence text2, boolean divider)` -> `void`

## `org.telegram.ui.Stars.StarsIntroActivity$StarTierView$Factory`
- `static asStarTier(int id, int index, TL_stars.TL_starsTopupOption option)` -> `UItem`
- `static asStarTier(int id, int index, TL_stars.TL_starsGiftOption option)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `contentsEquals(UItem a, UItem b)` -> `boolean`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `StarTierView`
- `equals(UItem a, UItem b)` -> `boolean`

## `org.telegram.ui.Stars.StarsIntroActivity$StarsBalanceView`
- `bounce()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setDialogId(long dialogId)` -> `void`
- `updateBalance(boolean animated)` -> `void`
- `withTon()` -> `void`

## `org.telegram.ui.Stars.StarsIntroActivity$StarsNeededSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `dismissInternal()` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTitle()` -> `CharSequence`
- `onItemClick(UItem item, UniversalAdapter adapter)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.Stars.StarsIntroActivity$StarsOptionsSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismissInternal()` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTitle()` -> `CharSequence`
- `onItemClick(UItem item, UniversalAdapter adapter)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.Stars.StarsIntroActivity$StarsSubscriptionView`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(TL_stars.StarsSubscription subscription, boolean divider)` -> `void`

## `org.telegram.ui.Stars.StarsIntroActivity$StarsSubscriptionView$Factory`
- `static asSubscription(TL_stars.StarsSubscription subscription)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `StarsSubscriptionView`
- `equals(UItem a, UItem b)` -> `boolean`

## `org.telegram.ui.Stars.StarsIntroActivity$StarsTransactionView`
- `static getPlatformDrawable(String platform)` -> `CombinedDrawable`
- `static getPlatformDrawable(String platform, int sz)` -> `CombinedDrawable`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(TL_stars.StarsTransaction transaction, boolean bot, boolean divider)` -> `void`
- `setLoading()` -> `void`

## `org.telegram.ui.Stars.StarsIntroActivity$StarsTransactionView$Factory`
- `static asLoading()` -> `UItem`
- `static asTransaction(TL_stars.StarsTransaction transaction, boolean bot)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `StarsTransactionView`

## `org.telegram.ui.Stars.StarsIntroActivity$StarsTransactionsLayout`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getCurrentListView()` -> `RecyclerListView`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`

## `org.telegram.ui.Stars.StarsIntroActivity$StarsTransactionsLayout$Page`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `isLoadingVisible()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`

## `org.telegram.ui.Stars.StarsIntroActivity$StarsTransactionsLayout$PageAdapter`
- `bindView(View view, int position, int viewType)` -> `void`
- `createView(int viewType)` -> `View`
- `fill()` -> `void`
- `getItemCount()` -> `int`
- `getItemTitle(int position)` -> `String`
- `getItemViewType(int position)` -> `int`

## `org.telegram.ui.Stars.StarsIntroActivity$Transaction`
- `static as(int date, String platform, int stars)` -> `Transaction`
- `static as(int date, long userId, int stars)` -> `Transaction`

## `org.telegram.ui.Stars.SuperRipple`
- `animate(float cx, float cy, float intensity)` -> `void`
- `static supports()` -> `boolean`

## `org.telegram.ui.Stars.SuperRippleFallback`
- `animate(float cx, float cy, float intensity)` -> `void`

## `org.telegram.ui.StatisticActivity`
- `static create(TLRPC.Chat chat)` -> `BaseFragment`
- `static create(TLRPC.Chat chat, boolean startFromBoosts)` -> `BaseFragment`
- `createActionBar(Context context)` -> `ActionBar`
- `static createChartData(JSONObject jsonObject, int graphType, boolean isLanguages)` -> `ChartData`
- `createView(Context context)` -> `View`
- `static createViewData(TL_stats.StatsGraph graph, String title, int graphType, boolean isLanguages)` -> `ChartViewData`
- `static createViewData(TL_stats.StatsGraph graph, String title, int graphType)` -> `ChartViewData`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isLightStatusBar()` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `selectTab(int position, boolean animated)` -> `void`
- `setGestureSelectedOverride(float animatedPosition, boolean allow)` -> `void`

## `org.telegram.ui.StatisticActivity$Adapter`
- `getItemCount()` -> `int`
- `getItemId(int position)` -> `long`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `update()` -> `void`

## `org.telegram.ui.StatisticActivity$BaseChartCell`
- `recolor()` -> `void`
- `updateData(ChartViewData viewData, boolean enterTransition)` -> `void`
- `zoomChart(boolean skipTransition)` -> `void`

## `org.telegram.ui.StatisticActivity$BaseChartCell$CheckBoxHolder`
- `recolor(int c)` -> `void`
- `setData(final LineViewData l)` -> `void`

## `org.telegram.ui.StatisticActivity$ChartCell`
- `onZoomed()` -> `void`
- `zoomCanceled()` -> `void`

## `org.telegram.ui.StatisticActivity$MemberData`
- `static find(long user_id, ArrayList<TLRPC.User> users)` -> `TLRPC.User`
- `static from(TL_stats.TL_statsGroupTopPoster poster, ArrayList<TLRPC.User> users)` -> `MemberData`
- `static from(TL_stats.TL_statsGroupTopAdmin admin, ArrayList<TLRPC.User> users)` -> `MemberData`
- `static from(TL_stats.TL_statsGroupTopInviter inviter, ArrayList<TLRPC.User> users)` -> `MemberData`
- `onClick(BaseFragment fragment)` -> `void`
- `onLongClick(TLRPC.ChatFull chat, StatisticActivity fragment, AlertDialog[] progressDialog)` -> `void`

## `org.telegram.ui.StatisticActivity$OverviewCell`
- `setData(OverviewChannelData data, TLRPC.ChatFull chatFull)` -> `void`
- `setData(OverviewChatData data)` -> `void`
- `setData(int index, String primary, String secondary, String title)` -> `void`

## `org.telegram.ui.StatisticActivity$RecentPostInfo`
- `getDate()` -> `long`
- `getForwards()` -> `int`
- `getId()` -> `int`
- `getReactions()` -> `int`
- `getViews()` -> `int`

## `org.telegram.ui.StatisticActivity$UniversalChartCell`
- `onZoomed()` -> `void`
- `set(int stats_dc, ChartViewData viewData, Utilities.Callback0Return<BaseChartCell> findCell)` -> `void`
- `zoomCanceled()` -> `void`

## `org.telegram.ui.Storage.CacheModel`
- `allFilesSelcetedByType(int type, boolean selected)` -> `void`
- `clearSelection()` -> `void`
- `getSelectedFiles()` -> `int`
- `getSelectedFilesSize()` -> `long`
- `getSelectedFilesSize(int type)` -> `long`
- `onFileDeleted(FileInfo fileInfo)` -> `void`
- `selectAllFiles()` -> `void`
- `setEntities(ArrayList<CacheControlActivity.DialogFileEntities> entities)` -> `void`
- `sortBySize()` -> `void`
- `toggleSelect(FileInfo fileInfo)` -> `void`
- `toggleSelect(CacheControlActivity.DialogFileEntities entities)` -> `void`

## `org.telegram.ui.SuggestClearDatabaseBottomSheet`
- `dismiss()` -> `void`
- `static dismissDialog()` -> `void`
- `static show(BaseFragment fragment)` -> `void`

## `org.telegram.ui.SuggestUserPhotoView`
- `draw(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setImages(TLObject setAvatarFor, View containerView, PhotoCropView photoCropView)` -> `void`

## `org.telegram.ui.TON.TONIntroActivity`
- `static allowTopUp()` -> `boolean`
- `attachedTransactionsLayout()` -> `boolean`
- `createAdapter()` -> `RecyclerView.Adapter<?>`
- `createContentView()` -> `ContentView`
- `createParticlesView()` -> `StarParticlesView`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `drawActionBarShadow()` -> `boolean`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getHeader(Context context)` -> `View`
- `getNavigationBarColor()` -> `int`
- `static makeParticlesView(Context context, int particlesCount, int type)` -> `StarParticlesView`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onHeaderCollapseProgress(float progress)` -> `void`
- `onItemClick(UItem item, int position)` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`

## `org.telegram.ui.TON.TONIntroActivity$NestedFrameLayout`
- `onNestedPreFling(View target, float velocityX, float velocityY)` -> `boolean`
- `onNestedPreScroll(View target, int dx, int dy, int[] consumed, int type)` -> `void`
- `onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed)` -> `void`
- `onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type)` -> `void`
- `onNestedScrollAccepted(View child, View target, int axes, int type)` -> `void`
- `onStartNestedScroll(View child, View target, int axes, int type)` -> `boolean`
- `onStopNestedScroll(View target, int type)` -> `void`
- `onStopNestedScroll(View child)` -> `void`

## `org.telegram.ui.TON.TONIntroActivity$StarsNeededSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `dismissInternal()` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTitle()` -> `CharSequence`
- `onItemClick(UItem item, UniversalAdapter adapter)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.TestActivity`
- `createView(Context context)` -> `View`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onResume()` -> `void`

## `org.telegram.ui.TextMessageEnterTransition`
- `onDraw(Canvas canvas)` -> `void`
- `start()` -> `void`

## `org.telegram.ui.TextureViewContainer`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`

## `org.telegram.ui.TodoItemMenu`
- `dismiss()` -> `void`
- `dismiss(boolean backIntoMessage)` -> `void`
- `isShown()` -> `boolean`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `setCell(ChatActivity chatActivity, ChatMessageCell messageCell, int taskId)` -> `void`
- `setOnDismissListener(Runnable onDismiss)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.TooManyCommunitiesActivity`
- `createView(Context context)` -> `View`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`

## `org.telegram.ui.TooManyCommunitiesActivity$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `updateRows()` -> `void`

## `org.telegram.ui.TooManyCommunitiesActivity$SearchAdapter`
- `getItemCount()` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `search(final String query)` -> `void`

## `org.telegram.ui.TopicCreateFragment`
- `static create(long chatId, long topicId)` -> `TopicCreateFragment`
- `createView(Context context)` -> `View`
- `onFragmentCreate()` -> `boolean`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `onTransitionAnimationStart(boolean isOpen, boolean backward)` -> `void`
- `setOpenInChatActivity(ChatActivity chatActivity)` -> `TopicCreateFragment`
- `showKeyboard()` -> `void`

## `org.telegram.ui.TopicsFragment`
- `allowFinishFragmentInsteadOfRemoveFromStack()` -> `boolean`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `drawEdgeNavigationBar()` -> `boolean`
- `getAvatarContainer()` -> `ChatAvatarContainer`
- `getContentView()` -> `SizeNotifierFrameLayout`
- `getCurrentChat()` -> `TLRPC.Chat`
- `getDialogId()` -> `long`
- `getFrostedGlassSource()` -> `BlurredBackgroundSourceRenderNode`
- `getFullscreenView()` -> `View`
- `getGlassSource()` -> `BlurredBackgroundSourceRenderNode`
- `getGroupCall()` -> `ChatObject.Call`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `static getTopicsOrChat(BaseFragment parentFragment, Bundle args)` -> `BaseFragment`
- `static getTopicsOrChat(LaunchActivity launchActivity, Bundle args)` -> `BaseFragment`
- `isLightStatusBar()` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onBecomeFullyHidden()` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onParentScrollToTop()` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onSlideProgress(boolean isOpen, float progress)` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `onTransitionAnimationProgress(boolean isOpen, float progress)` -> `void`
- `onTransitionAnimationStart(boolean isOpen, boolean backward)` -> `void`
- `prepareFragmentToSlide(boolean topFragment, boolean beginSlide)` -> `void`
- `static prepareToSwitchAnimation(ChatActivity chatActivity)` -> `void`
- `setExcludeTopics(HashSet<Integer> exceptionsTopics)` -> `void`
- `setForwardFromDialogFragment(DialogsActivity dialogsActivity)` -> `void`
- `setOnTopicSelectedListener(OnTopicSelectedListener listener)` -> `void`
- `setParentDialogsActivity(DialogsActivity parentDialogsActivity)` -> `void`
- `setPreviewOpenedProgress(float progress)` -> `void`
- `setPreviewReplaceProgress(float progress)` -> `void`
- `setTransitionPadding(int transitionPadding)` -> `void`
- `switchToChat(boolean removeFragment)` -> `void`
- `updateReordering()` -> `void`

## `org.telegram.ui.TopicsFragment$Adapter`
- `getArray()` -> `ArrayList<TopicsFragment.Item>`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `swapElements(int from, int to)` -> `void`

## `org.telegram.ui.TopicsFragment$EmptyViewContainer`
- `dispatchDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.TopicsFragment$Item`
- `equals(Object o)` -> `boolean`

## `org.telegram.ui.TopicsFragment$MessagesSearchContainer`
- `actionModeShowing()` -> `boolean`
- `getFolderId()` -> `int`
- `goToMessage(MessageObject messageObject)` -> `void`
- `isSelected(FilteredSearchView.MessageHashId messageHashId)` -> `boolean`
- `setSearchString(String searchString)` -> `void`
- `showActionMode()` -> `void`
- `toggleItemSelection(MessageObject item, View view, int a)` -> `void`

## `org.telegram.ui.TopicsFragment$MessagesSearchContainer$SearchAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.TopicsFragment$MessagesSearchContainer$ViewPagerAdapter`
- `bindView(View view, int position, int viewType)` -> `void`
- `createView(int viewType)` -> `View`
- `getItemCount()` -> `int`
- `getItemTitle(int position)` -> `String`
- `getItemViewType(int position)` -> `int`

## `org.telegram.ui.TopicsFragment$TopicsRecyclerView`
- `allowSelectChildAtPosition(View child)` -> `boolean`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getViewOffset()` -> `float`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent e)` -> `boolean`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthSpec, int heightSpec)` -> `void`
- `onTouchEvent(MotionEvent e)` -> `boolean`
- `removeView(View view)` -> `void`
- `setAdapter(RecyclerView.Adapter adapter)` -> `void`
- `setViewsOffset(float viewOffset)` -> `void`

## `org.telegram.ui.TwoStepVerificationActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `finishFragment()` -> `void`
- `getNewSrpPassword()` -> `TLRPC.TL_inputCheckPasswordSRP`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `static initPasswordNewAlgo(TL_account.Password password)` -> `void`
- `isLightStatusBar()` -> `boolean`
- `needHideProgress()` -> `void`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `preload(Runnable whenPreloaded)` -> `void`
- `setBlockingAlert(int otherwiseRelogin)` -> `void`
- `setCurrentPasswordInfo(byte[] hash, TL_account.Password password)` -> `void`
- `setCurrentPasswordParams(TL_account.Password password, byte[] passwordHash, long secretId, byte[] secret)` -> `void`
- `setDelegate(int a, TwoStepVerificationActivityDelegate twoStepVerificationActivityDelegate)` -> `void`
- `setDelegateString(String string)` -> `void`
- `setForgotPasswordOnShow()` -> `void`
- `setPassword(TL_account.Password password)` -> `void`

## `org.telegram.ui.TwoStepVerificationActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.TwoStepVerificationSetupActivity`
- `createView(Context context)` -> `View`
- `finishFragment(boolean animated)` -> `boolean`
- `finishFragment()` -> `void`
- `getNewSrpPassword()` -> `TLRPC.TL_inputCheckPasswordSRP`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `hideKeyboardOnShow()` -> `boolean`
- `isLightStatusBar()` -> `boolean`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `needHideProgress()` -> `void`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onReset()` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `setBlockingAlert(int otherwiseRelogin)` -> `void`
- `setCloseAfterSet(boolean value)` -> `void`
- `setCurrentEmailCode(String code)` -> `void`
- `setCurrentPasswordParams(byte[] passwordHash, long secretId, byte[] secret, boolean email)` -> `void`
- `setFromRegistration(boolean fromRegistration)` -> `void`
- `setOnOpenedSettings(Runnable openedSettings)` -> `void`

## `org.telegram.ui.UpdateLayoutWrapper`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `isUpdateLayoutVisible()` -> `boolean`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onViewAdded(View child)` -> `void`
- `setPadding(int left, int top, int right, int bottom)` -> `void`

## `org.telegram.ui.UserInfoActivity`
- `static birthdayString(TL_account.TL_birthday birthday)` -> `String`
- `static birthdaysEqual(TL_account.TL_birthday a, TL_account.TL_birthday b)` -> `boolean`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTitle()` -> `CharSequence`
- `onClick(UItem item, View view, int position, float x, float y)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onLongClick(UItem item, View view, int position, float x, float y)` -> `boolean`
- `onResume()` -> `void`

## `org.telegram.ui.UserInfoActivity$AdminedChannelsFetcher`
- `invalidate()` -> `void`
- `subscribe(Runnable whenDone)` -> `void`

## `org.telegram.ui.UserInfoActivity$ChooseChannelFragment`
- `createView(Context context)` -> `View`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTitle()` -> `CharSequence`
- `onClick(UItem item, View view, int position, float x, float y)` -> `void`
- `onLongClick(UItem item, View view, int position, float x, float y)` -> `boolean`
- `onResume()` -> `void`

## `org.telegram.ui.UserInfoActivity$InfoCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(int icon, CharSequence title, CharSequence subtitle, boolean accent, boolean red, int icon2)` -> `void`

## `org.telegram.ui.UserInfoActivity$InfoCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `InfoCell`
- `static of(int id, int icon, CharSequence title, CharSequence subtitle, int icon2)` -> `UItem`

## `org.telegram.ui.UsersSelectActivity`
- `asPrivateChats()` -> `UsersSelectActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getContainerHeight()` -> `int`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onClick(View v)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onResume()` -> `void`
- `setContainerHeight(int value)` -> `void`
- `setDelegate(FilterUsersActivityDelegate filterUsersActivityDelegate)` -> `void`
- `setTtlPeriod(int selectedTime)` -> `void`

## `org.telegram.ui.UsersSelectActivity$GroupCreateAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `getLetter(int position)` -> `String`
- `getPositionForScrollProgress(RecyclerListView listView, float progress, int[] position)` -> `void`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewRecycled(RecyclerView.ViewHolder holder)` -> `void`
- `searchDialogs(final String query)` -> `void`
- `setSearching(boolean value)` -> `void`

## `org.telegram.ui.UsersSelectActivity$ItemDecoration`
- `getItemOffsets(@NonNull android.graphics.Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state)` -> `void`
- `onDraw(@NonNull Canvas canvas, RecyclerView parent, @NonNull RecyclerView.State state)` -> `void`
- `setSingle(boolean value)` -> `void`

## `org.telegram.ui.UsersSelectActivity$SpansContainer`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.ViewPagerActivity`
- `clearAllHiddenFragments()` -> `void`
- `clearViews()` -> `void`
- `createActionBar(Context context)` -> `ActionBar`
- `createContentView(Context context)` -> `FrameLayout`
- `createView(Context context)` -> `View`
- `drawEdgeNavigationBar()` -> `boolean`
- `dropFragmentAtPosition(int position)` -> `void`
- `getCurrentVisibleFragment()` -> `BaseFragment`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isLightStatusBar()` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`
- `onApplyWindowInsets(@NonNull View v, @NonNull WindowInsetsCompat insets)` -> `WindowInsetsCompat`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onBecomeFullyHidden()` -> `void`
- `onBecomeFullyVisible()` -> `void`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationProgress(boolean isOpen, float progress)` -> `void`
- `onViewPagerScrollEnd()` -> `void`
- `setTitleOverlayText(String title, int titleId, Runnable action)` -> `void`
- `setTitleOverlayTextIfActionBarAttached(String title, int titleId, Runnable action)` -> `void`

## `org.telegram.ui.ViewPagerActivity$FragmentState`
- `setVisibility(float visibilityByViewPage, float visibilityByParent, boolean parentIsFullyVisible, boolean parentIsResumed)` -> `void`

## `org.telegram.ui.ViewPagerActivity$ViewPagerActivityPagerLayout`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `getAvailableTranslationX()` -> `float`
- `getManualScrollDuration()` -> `long`
- `onItemSelected(View currentPage, View oldPage, int position, int oldPosition)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onScrollEnd()` -> `void`
- `setLayoutParams(ViewGroup.LayoutParams params)` -> `void`
- `setTabletLayout(boolean tabletLayout)` -> `void`

## `org.telegram.ui.Wallet.CollectibleCell`
- `static getImage(TL_wallet.nftItem item, boolean small)` -> `ImageLocation`
- `onDraw(android.graphics.Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(TL_wallet.nftItem item, boolean divider)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Wallet.CollectibleCell$Factory`
- `contentsEquals(UItem first, UItem second)` -> `boolean`
- `equals(UItem first, UItem second)` -> `boolean`
- `static getCollectible(UItem item)` -> `TL_wallet.nftItem`
- `isClickable()` -> `boolean`
- `static of(TL_wallet.nftItem item)` -> `UItem`

## `org.telegram.ui.Wallet.CurrenciesController`
- `static capitalizeFirstLetter(String value, Locale locale)` -> `String`
- `getCurrencies()` -> `TL_wallet.currencyRates`
- `getCurrency()` -> `String`
- `getCurrencyRate()` -> `double`
- `getCurrencyTitle()` -> `String`
- `getHintCurrencies()` -> `ArrayList<TL_wallet.currencyRate>`
- `getSelectedCurrencyRate()` -> `TL_wallet.currencyRate`
- `setCurrency(String currency)` -> `void`

## `org.telegram.ui.Wallet.GramWallet`
- `static cleanup(int currentAccount)` -> `void`
- `createNewWallet(Utilities.Callback<String> whenDone)` -> `void`
- `static createRecipientPeer(TLRPC.User user, String address, String domain)` -> `TL_wallet.WalletTransactionPeer`
- `decryptTransactionComment(String encryptedComment, String senderAddress, Utilities.Callback2<String , String > whenDone)` -> `void`
- `disableBackup(PreparedDisableBackup prepared, Utilities.Callback<String> whenSent)` -> `void`
- `disableBackupWithoutUpdatingPhrase(Utilities.Callback<String> whenDone)` -> `void`
- `emulateDisableBackup(Utilities.Callback2<Long, String> whenDone)` -> `void`
- `emulateSend(String address, long amount, String comment, byte[] comment_recipient_public_key, Utilities.Callback2<TL_wallet.walletTransaction, String> whenDone)` -> `Runnable`
- `emulateSendNFT(String address, TL_wallet.nftItem collectible, Utilities.Callback2<TL_wallet.walletTransaction, String> whenDone)` -> `Runnable`
- `emulateSendNFT(String address, TL_wallet.nftItem collectible, String comment, Utilities.Callback2<TL_wallet.walletTransaction, String> whenDone)` -> `Runnable`
- `enableBackup(Utilities.Callback<String> whenDone)` -> `void`
- `static ensureLocalWalletBalances(int currentAccount, Runnable whenDone)` -> `void`
- `findTransaction(MessageObject msg)` -> `TL_wallet.walletTransaction`
- `formatCurrency(long nanogramsAmount)` -> `CharSequence`
- `formatCurrency(long nanogramsAmount, boolean manyZeros)` -> `CharSequence`
- `static formatGramCapital(long amount)` -> `CharSequence`
- `static formatGramCapital(long amount, boolean manyZeros)` -> `CharSequence`
- `static formatGramCapital(CharSequence formattedAmount)` -> `CharSequence`
- `static formatGrams(long amount)` -> `String`
- `static formatGrams(long amount, boolean manyZeros)` -> `String`
- `static formatGramsScaled(long amount)` -> `SpannableStringBuilder`
- `static formatGramsScaled(long amount, float scale)` -> `SpannableStringBuilder`
- `static formatGramsScaled(String value, float scale)` -> `SpannableStringBuilder`
- `static formatGramsWithUnit(long amount)` -> `CharSequence`
- `static formatGramsWithUnit(long amount, boolean manyZeros)` -> `CharSequence`
- `static formatGramsWithUnit(CharSequence formattedAmount)` -> `CharSequence`
- `getAddress()` -> `String`
- `getAddressBalanceAndPublicKey(String address)` -> `AddressInfo`
- `getAddressBalanceAndPublicKey(String address, Utilities.Callback<AddressInfo> whenDone)` -> `AddressInfo`
- `getBalance()` -> `long`
- `getBalanceOfPreviousWallets()` -> `long`
- `getCollectibles()` -> `CollectiblesList`
- `getGasless()` -> `TL_update.TL_updateWalletGaslessInfo`
- `static getInstance(int num)` -> `GramWallet`
- `getPreviousWallets()` -> `List<PreviousWallet>`
- `getPublicKey()` -> `byte[]`
- `getSecretPhrase(Utilities.Callback2<SecretPhrase , String > received)` -> `void`
- `getSecretPhrase(boolean sheet, boolean progress, Utilities.Callback2<SecretPhrase , String > received)` -> `void`
- `getTransaction(String id, Utilities.Callback<TL_wallet.walletTransaction> whenDone)` -> `void`
- `getTransactions()` -> `TransactionsList`
- `getWaltUrl()` -> `String`
- `importWallet(SecretPhrase phrase, Utilities.Callback<String > whenDone)` -> `void`
- `importWallet(boolean sheet, boolean progress, SecretPhrase phrase, Utilities.Callback<String> whenDone)` -> `void`
- `invalidateState()` -> `void`
- `listen()` -> `Runnable`
- `makeSureSecretPhraseBackedUpLocally(Utilities.Callback<String > whenDone)` -> `void`
- `makeSureSecretPhraseBackedUpLocally(boolean sheet, boolean progress, Utilities.Callback<String > whenDone)` -> `void`
- `static messageMatchesTransaction(MessageObject message, TL_wallet.walletTransaction transaction)` -> `boolean`
- `needsFingerprint()` -> `boolean`
- `needsPasscode()` -> `boolean`
- `notifyUpdate()` -> `void`
- `onEvent(JSONObject event)` -> `void`
- `prepareDisableBackup(Utilities.Callback2<PreparedDisableBackup, String > whenDone)` -> `void`
- `reset()` -> `void`
- `resolveWallet(TLRPC.User user, boolean force, Utilities.Callback2<TL_wallet.walletUserAddress, String > whenDone)` -> `void`
- `resolveWallet(String address, Utilities.Callback2<TL_wallet.walletUserAddress, String > whenDone)` -> `void`
- `static sameTransactionHash(String first, String second)` -> `boolean`
- `setNeedsFingerprint(boolean value, Utilities.Callback<Boolean> whenDone)` -> `void`
- `setNeedsPasscode(boolean value)` -> `void`
- `tonConnectEngine()` -> `WalletEngine2`
- `static transactionMatches(TL_wallet.walletTransaction a, TL_wallet.walletTransaction b)` -> `boolean`
- `updateState(TL_wallet.WalletState state)` -> `void`
- `whenReady(Runnable callback)` -> `void`
- `whenReadyGasless(Runnable callback)` -> `void`

## `org.telegram.ui.Wallet.GramWallet$CollectiblesList`
- `clear()` -> `void`
- `getError()` -> `String`
- `invalidate()` -> `void`
- `subscribe(Runnable listener)` -> `void`
- `unsubscribe(Runnable listener)` -> `void`

## `org.telegram.ui.Wallet.GramWallet$EmulationRequest`
- `run()` -> `void`
- `run()` -> `void`

## `org.telegram.ui.Wallet.GramWallet$PendingDisableBackup`
- `disableBackup()` -> `void`

## `org.telegram.ui.Wallet.GramWallet$SecretPhrase`
- `byteCount()` -> `int`
- `copy()` -> `SecretPhrase`
- `copyBytes()` -> `byte[]`
- `static deliver(SecretPhrase phrase, Utilities.Callback<SecretPhrase> callback)` -> `void`
- `firstWords(int count)` -> `SecretPhrase`
- `static fromWords(List<String> words)` -> `SecretPhrase`
- `toWordsForDisplay()` -> `ArrayList<String>`
- `wordCount()` -> `int`

## `org.telegram.ui.Wallet.GramWallet$TransactionsList`
- `clear()` -> `void`
- `invalidate()` -> `void`

## `org.telegram.ui.Wallet.GramWallet$WaitForBalances`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `run()` -> `void`

## `org.telegram.ui.Wallet.GramWalletDns`
- `static normalizeDomain(String value)` -> `String`
- `static parseWalletAddress(String domain, JSONObject response)` -> `String`
- `static resolve(int account, String domain, Utilities.Callback<String> callback)` -> `int`

## `org.telegram.ui.Wallet.GramWalletPolling`
- `start()` -> `void`
- `stop()` -> `void`

## `org.telegram.ui.Wallet.GramWalletStorage`
- `containsSecretPhrase(byte[] publicKey)` -> `boolean`
- `decrypt(Wallet wallet, String publicKey)` -> `byte[]`
- `static deviceHasFingerprint(Context context)` -> `boolean`
- `getAddress()` -> `String`
- `getLastError()` -> `Exception`
- `getLastUsage()` -> `int`
- `getPublicKeys()` -> `byte[][]`
- `getSecretPhrase(byte[] publicKey, Utilities.Callback<SecretPhrase> whenDone)` -> `void`
- `getSecretPhrase(byte[] publicKey, Utilities.Callback<SecretPhrase> whenDone, boolean markUsage)` -> `void`
- `static getWallets(Context context, long userId)` -> `ArrayList<String>`
- `init(long userId, byte[] publicKey, SecretPhrase input, Utilities.Callback<String> whenDone)` -> `void`
- `setProtectedByFingerprint(boolean protect)` -> `void`
- `setProtectedByFingerprint(boolean protect, Utilities.Callback<String> whenDone)` -> `void`
- `wipe()` -> `void`
- `wipeExcept(byte[] publicKey)` -> `void`
- `static wipeForUser(Context context, int currentAccount, long userId)` -> `void`

## `org.telegram.ui.Wallet.GramWalletStreaming`
- `start()` -> `void`
- `stop()` -> `void`

## `org.telegram.ui.Wallet.GramWalletTonConnect`
- `approveSession(ConnectRequest context, Utilities.Callback<String> whenDone)` -> `void`
- `decide(Pending request, boolean declined, Utilities.Callback<String> callback)` -> `void`
- `disconnectSession(TL_wallet.tonConnectSession session, Utilities.Callback<String > whenDone)` -> `void`
- `static exception(String operation, Throwable error)` -> `String`
- `static log(String operation, String message)` -> `void`
- `static parseRequest(String plaintext, TL_wallet.tonConnectSession session, String address, int now)` -> `JSONObject`
- `preview(Pending request, Utilities.Callback2<TL_wallet.walletTransaction, String> callback)` -> `void`
- `release(Pending request)` -> `void`
- `static rpc(String operation, TLRPC.TL_error error)` -> `String`
- `static sameIcon(TLRPC.WebDocument first, TLRPC.WebDocument second)` -> `boolean`
- `static supportedFeatures()` -> `JSONArray`

## `org.telegram.ui.Wallet.GramWalletTonConnect$Pending`
- `setOnProcessed(Runnable callback)` -> `void`

## `org.telegram.ui.Wallet.GramWalletTonConnect$Transaction`
- `fields()` -> `String[]`

## `org.telegram.ui.Wallet.NavBottomSheet`
- `closeKeyboard()` -> `void`
- `getCurrentPosition()` -> `int`
- `getPageCount()` -> `int`
- `getViewPager()` -> `ViewPagerFixed`
- `goBack()` -> `boolean`
- `onBackPressed()` -> `void`
- `openPage(int position)` -> `boolean`
- `setBackgroundOverride(int color)` -> `NavBottomSheet`
- `setFixedFooter(View footer)` -> `NavBottomSheet`
- `show()` -> `void`

## `org.telegram.ui.Wallet.NavBottomSheet$NavContainerView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Wallet.NavBottomSheet$NavPage`
- `update()` -> `default void`

## `org.telegram.ui.Wallet.NavBottomSheet$Page`
- `getContent()` -> `FrameLayout`
- `top()` -> `float`

## `org.telegram.ui.Wallet.NewBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `getSheetBackgroundColor()` -> `int`
- `getTitle()` -> `CharSequence`
- `mainContainerDispatchDraw(Canvas canvas)` -> `void`
- `onSheetTop(float top)` -> `void`
- `setOverlayNavBarColor(int color)` -> `void`
- `show()` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Wallet.PasswordRequest$RequestScope`
- `close()` -> `void`
- `passwordFragment()` -> `TwoStepVerificationActivity`

## `org.telegram.ui.Wallet.TransactionCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getPendingDiamond()` -> `WalletDiamondView`
- `holdForFlight(boolean hold)` -> `void`
- `isRaised()` -> `boolean`
- `matches(TL_wallet.walletTransaction transaction)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `playLanding(float velocityDpPerSecond)` -> `void`
- `set(TL_wallet.walletTransaction transaction, SmartWalletAddressFormatter addressFormatter, boolean divider)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Wallet.TransactionCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `contentsEquals(UItem a, UItem b)` -> `boolean`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `TransactionCell`
- `equals(UItem a, UItem b)` -> `boolean`
- `isClickable()` -> `boolean`
- `static of(TL_wallet.walletTransaction transaction, SmartWalletAddressFormatter addressFormatter)` -> `UItem`
- `static sameTransaction(TL_wallet.walletTransaction a, TL_wallet.walletTransaction b)` -> `boolean`
- `static sourceOf(TL_wallet.walletTransaction transaction)` -> `TL_wallet.walletTransaction`

## `org.telegram.ui.Wallet.TransactionCell$SmartWalletAddressFormatter`
- `clear()` -> `void`
- `done()` -> `void`
- `format(String address)` -> `String`

## `org.telegram.ui.Wallet.WalletActionLayout`
- `animateHighlight()` -> `void`
- `applyCardTransform(Canvas canvas, float x, float y)` -> `void`
- `draw(Canvas canvas)` -> `void`
- `getDiamondSurface()` -> `View`
- `getFlightPitch()` -> `float`
- `getFlightYaw()` -> `float`
- `getHeight()` -> `int`
- `getWidth()` -> `int`
- `holdDiamondForFlight(boolean hold)` -> `void`
- `onTouchEvent(float offsetX, float offsetY, MotionEvent event)` -> `boolean`
- `playLanding(float velocityDpPerSecond)` -> `void`
- `playReceiveAnimation(Runnable onEnd)` -> `boolean`
- `set(boolean out, TLRPC.TL_messageActionGramTransfer action)` -> `void`
- `set(boolean out, TLRPC.TL_messageActionGramTransfer action, String peerLink)` -> `void`
- `set(boolean out, TLRPC.TL_messageActionGramTransfer action, String peerLink, int sendState)` -> `void`
- `set(boolean out, TLRPC.TL_messageActionGramTransfer action, String peerLink, int sendState, boolean messageChanged)` -> `void`
- `set(boolean out, TLRPC.TL_messageActionGramTransfer action, String peerLink, int sendState, boolean messageChanged, boolean waitingForReceive)` -> `void`
- `setOnClickListener(Runnable onClick)` -> `void`
- `setSpoilersSuppressed(boolean suppressed)` -> `void`
- `setSurfaceEnabled(boolean enabled)` -> `void`
- `setSurfaceOrigin(float x, float y)` -> `void`

## `org.telegram.ui.Wallet.WalletActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `findSendLanding(TL_wallet.walletTransaction transaction)` -> `TransactionCell`
- `static formatTransactionAddress(String address, Runnable copy)` -> `CharSequence`
- `getTitle()` -> `CharSequence`
- `onBeginSlide()` -> `void`
- `onClick(UItem item, View view, int position, float x, float y)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onLongClick(UItem item, View view, int position, float x, float y)` -> `boolean`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `static openOnramp(int currentAccount, long amount, Utilities.Callback<String> whenDone)` -> `void`
- `static openWalletFirstGramsAlert(Context context, int currentAccount, Theme.ResourcesProvider resourceProvider)` -> `BottomSheet`
- `static openWalletHowItWorksAlert(Context context, Theme.ResourcesProvider resourceProvider)` -> `void`
- `static openWalletQRAlert(Context context, int currentAccount, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `prepareSendLanding(TL_wallet.walletTransaction transaction)` -> `void`
- `showTransactions()` -> `void`

## `org.telegram.ui.Wallet.WalletActivity$AddressRingView`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onSizeChanged(int width, int height, int oldWidth, int oldHeight)` -> `void`

## `org.telegram.ui.Wallet.WalletActivity$BalanceLabelSpan`
- `setColor(int color)` -> `void`
- `updateDrawState(TextPaint textPaint)` -> `void`

## `org.telegram.ui.Wallet.WalletActivity$LearnCell`
- `set(int icon, CharSequence header, CharSequence text)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Wallet.WalletActivity$LearnCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `LearnCell`
- `isClickable()` -> `boolean`
- `isShadow()` -> `boolean`
- `static of(int icon, CharSequence title, CharSequence text)` -> `UItem`

## `org.telegram.ui.Wallet.WalletActivity$TabsView`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `isTabVisible(int index)` -> `boolean`
- `setSelected(int selected)` -> `void`
- `setTabVisible(int index, boolean visible)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Wallet.WalletActivity$WalletHeaderSnapHelper`
- `attachToRecyclerView(RecyclerView recyclerView)` -> `void`
- `calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View targetView)` -> `int[]`
- `findSnapView(RecyclerView.LayoutManager layoutManager)` -> `View`
- `findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int velocityX, int velocityY)` -> `int`
- `onFling(int velocityX, int velocityY)` -> `boolean`
- `onNestedScrollStopped()` -> `void`
- `onTouchEvent(MotionEvent event)` -> `void`
- `onUserScroll()` -> `void`

## `org.telegram.ui.Wallet.WalletActivity$WalletNestedLayout`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `getNestedScrollAxes()` -> `int`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onNestedPreFling(View target, float velocityX, float velocityY)` -> `boolean`
- `onNestedPreScroll(View target, int dx, int dy, int[] consumed, int type)` -> `void`
- `onNestedScrollAccepted(View child, View target, int axes, int type)` -> `void`
- `onStartNestedScroll(View child, View target, int axes, int type)` -> `boolean`
- `onStopNestedScroll(View target, int type)` -> `void`

## `org.telegram.ui.Wallet.WalletActivity$WalletQrView`
- `setOnCopyAddressListener(Runnable listener)` -> `void`

## `org.telegram.ui.Wallet.WalletActivity$WalletSheetGradientDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `onBoundsChange(Rect bounds)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Wallet.WalletCard2DView`
- `applyRotation(float rotationX, float rotationY)` -> `void`
- `getCardRotationX()` -> `float`
- `getCardRotationY()` -> `float`
- `getFrontFace()` -> `FrameLayout`
- `getFrontFaceProjection(Matrix result)` -> `void`
- `onAccuracyChanged(Sensor sensor, int accuracy)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onSensorChanged(SensorEvent event)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `performClick()` -> `boolean`
- `setAdditionalTilt(float tilt)` -> `void`
- `setCardIcon(int drawableResId)` -> `void`
- `setEngravingBitmap(Bitmap bitmap)` -> `void`
- `setUseGyroscope(float t)` -> `void`

## `org.telegram.ui.Wallet.WalletCard2DView$CardSurface`
- `onDraw(Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `setCardIcon(int drawableResId)` -> `void`
- `setEngravingBitmap(Bitmap bitmap)` -> `void`
- `setTilt(float rotationX, float rotationY)` -> `void`

## `org.telegram.ui.Wallet.WalletCard2DView$GradientSurface`
- `onDraw(Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `setTilt(float rotationX, float rotationY)` -> `void`

## `org.telegram.ui.Wallet.WalletCard2DView$ProjectedCardLayout`
- `dispatchDraw(Canvas canvas)` -> `void`
- `setProjectedCorners(float[] corners)` -> `void`

## `org.telegram.ui.Wallet.WalletCard3D`
- `destroy()` -> `void`
- `static prepareTextures(Context context, int cardIconResId, int qrButtonRightPadding)` -> `void`
- `setCardIcon(Context context, int drawableResId, int qrButtonRightPadding)` -> `void`
- `setDiamondBounds(float[] bounds, float alpha)` -> `void`
- `setEngravingBitmap(Bitmap bitmap)` -> `void`
- `setFrontBitmap(Bitmap bitmap)` -> `void`

## `org.telegram.ui.Wallet.WalletCard3D$MaterialProgram`
- `setEngravingTexel(float x, float y)` -> `void`

## `org.telegram.ui.Wallet.WalletCard3D$Mesh`
- `destroy()` -> `void`

## `org.telegram.ui.Wallet.WalletCardComponent`
- `attachBalanceToCard()` -> `void`
- `createBalanceDiamondSpan()` -> `ColoredImageSpan`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static formatAddress(String address)` -> `String`
- `static formatBalance(long nanotons)` -> `SpannableStringBuilder`
- `static formatCardAddress(String formattedAddress)` -> `String`
- `getBalanceAnchor()` -> `View`
- `getBalanceLayout()` -> `LinearLayout`
- `getBalanceView()` -> `AnimatedTextView`
- `getCardHolderView()` -> `TextView`
- `getCardRotationX()` -> `float`
- `getCardRotationY()` -> `float`
- `getFrontFace()` -> `FrameLayout`
- `getFrontFaceTransform(View target, Matrix result)` -> `boolean`
- `getUsdBalanceView()` -> `AnimatedTextView`
- `isUse2D()` -> `boolean`
- `listen(int currentAccount, GramWallet wallet)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setAdditionalTilt(float tilt)` -> `void`
- `setBalanceDiamondTransform(Matrix faceToOverlay, Matrix balanceToOverlay)` -> `void`
- `setBalanceTransition(float progress, float actionBarWidth)` -> `void`
- `setCardHolder(CharSequence holder)` -> `void`
- `setCardIcon(int drawableResId)` -> `void`
- `setCardNumber(String formattedNumber)` -> `void`
- `setCardOnClickListener(OnClickListener listener)` -> `void`
- `setDiamondOnCard(boolean enabled)` -> `void`
- `setEngravingBitmap(Bitmap bitmap)` -> `void`
- `setOnFrontContentPresented(Runnable callback)` -> `void`
- `setUse2D(boolean use2D)` -> `void`
- `setUseGyroscope(float t)` -> `void`
- `update(GramWallet currentWallet)` -> `void`

## `org.telegram.ui.Wallet.WalletCardFlecks`
- `destroy()` -> `void`
- `draw(int position, int normal, int region, int corner)` -> `void`

## `org.telegram.ui.Wallet.WalletCardGLRenderer`
- `acquireFrontBitmap(int width, int height)` -> `Bitmap`
- `nextFrontRevision()` -> `long`
- `onDrawFrame(GL10 gl)` -> `void`
- `onSurfaceChanged(GL10 gl, int width, int height)` -> `void`
- `onSurfaceCreated(GL10 gl, EGLConfig config)` -> `void`
- `presentedFrontRevision(long timestamp)` -> `long`
- `setCardIcon(int drawableResId)` -> `void`
- `setDiamondAlpha(float alpha)` -> `void`
- `setDiamondBounds(float x, float y, float width, float height)` -> `void`
- `setEngravingBitmap(Bitmap bitmap)` -> `void`
- `setLightOrbitPaused(boolean paused)` -> `void`
- `setRotation(float rotationX, float rotationY)` -> `void`
- `submitFrontBitmap(Bitmap bitmap)` -> `void`

## `org.telegram.ui.Wallet.WalletCardGeometry`
- `static radiusX(float width)` -> `float`
- `static radiusY(float height)` -> `float`
- `static setFacePath(Path path, float width, float height)` -> `void`

## `org.telegram.ui.Wallet.WalletCardMotion`
- `detach(View view)` -> `void`
- `drawn(View view)` -> `void`
- `static get(Context context)` -> `WalletCardMotion`

## `org.telegram.ui.Wallet.WalletCardTiltBaseline`
- `getRotationX()` -> `float`
- `getRotationY()` -> `float`
- `reset()` -> `void`
- `setSensorRotation(float rotationX, float rotationY, long timestampNanos)` -> `void`
- `update(long frameTimeNanos)` -> `void`

## `org.telegram.ui.Wallet.WalletCardView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getBackFace()` -> `FrameLayout`
- `getCardRotationX()` -> `float`
- `getCardRotationY()` -> `float`
- `getFrontFace()` -> `FrameLayout`
- `getFrontFaceProjection(Matrix result)` -> `void`
- `isCardMaterialReady()` -> `boolean`
- `onAccuracyChanged(Sensor sensor, int accuracy)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onSensorChanged(SensorEvent event)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `onVisibilityChanged(View changedView, int visibility)` -> `void`
- `onWindowFocusChanged(boolean hasWindowFocus)` -> `void`
- `onWindowVisibilityChanged(int visibility)` -> `void`
- `setAdditionalTilt(float tilt)` -> `void`
- `setCardIcon(int drawableResId)` -> `void`
- `setDiamondAlpha(float alpha)` -> `void`
- `setDiamondBounds(float x, float y, float width, float height)` -> `void`
- `setEngravingBitmap(Bitmap bitmap)` -> `void`
- `setOnFrontContentPresented(Runnable callback)` -> `void`
- `setUseGyroscope(float t)` -> `void`

## `org.telegram.ui.Wallet.WalletCardView$ProjectedFaceLayout`
- `captureContent(WalletCardGLRenderer renderer)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getContent()` -> `FrameLayout`
- `invalidateChildInParent(int[] location, Rect dirty)` -> `ViewParent`
- `onDescendantInvalidated(View child, View target)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `setProjectedCorners(float[] corners)` -> `void`

## `org.telegram.ui.Wallet.WalletCardView$WalletCardTextureView`
- `getMaxFrameRate()` -> `int`
- `onDetachedFromWindow()` -> `void`
- `onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height)` -> `void`
- `onSurfaceTextureDestroyed(SurfaceTexture surface)` -> `boolean`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `performClick()` -> `boolean`
- `preferGles3()` -> `boolean`
- `renderFirstFrameWhilePaused()` -> `boolean`
- `setPaused(boolean paused)` -> `void`
- `startIdleAnimation()` -> `void`

## `org.telegram.ui.Wallet.WalletChatSendTransition`
- `animator()` -> `AnimatorSet`

## `org.telegram.ui.Wallet.WalletDiamondView`
- `copyRotationFrom(WalletDiamondView source)` -> `void`
- `getConversionWobble()` -> `float`
- `getFlightPitch()` -> `float`
- `getFlightYaw()` -> `float`
- `onAmountEdited(boolean added)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onInterceptTouchEvent(MotionEvent event)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `onVisibilityChanged(View changedView, int visibility)` -> `void`
- `onWindowFocusChanged(boolean hasWindowFocus)` -> `void`
- `onWindowVisibilityChanged(int visibility)` -> `void`
- `setContinuousRotation(float degreesPerSecond)` -> `void`
- `setConversionWobble(float degrees)` -> `void`
- `setEnabled(boolean enabled)` -> `void`
- `setHeaderTilt(float degrees)` -> `void`
- `setInputDrivenRotation()` -> `void`
- `setIntroProgress(float progress)` -> `void`
- `setPaused(boolean paused)` -> `void`
- `setStarParticlesView(StarParticlesView particlesView)` -> `void`
- `setSwipeProgress(float progress, boolean dragging)` -> `void`
- `whenReady(Runnable callback)` -> `void`

## `org.telegram.ui.Wallet.WalletEngine2`
- `close()` -> `void`
- `static createImportProof(SecretPhrase phrase, String domain, String payload, int timestamp)` -> `ImportedWalletProof`
- `static createOwnershipProof(SecretPhrase phrase, String domain, String payload, int timestamp)` -> `ImportedWalletProof`
- `static decryptComment(SecretPhrase secretPhrase, String senderAddress, String encryptedComment)` -> `String`
- `static encryptedCommentPayload(String body)` -> `String`
- `static getMnemonicWordlist()` -> `String[]`
- `getTransactionByHash(String tx_hash, Utilities.Callback<TL_wallet.walletTransaction> done)` -> `void`
- `previewSignMessage(GramWalletTonConnect.Transaction request, Utilities.Callback<String> callback)` -> `void`
- `previewTonConnect(GramWalletTonConnect.Transaction request, Utilities.Callback2<TL_wallet.walletTransaction, String> callback)` -> `void`
- `static sameTonConnectAddress(String first, String second)` -> `boolean`
- `static secretPhraseToAddress(SecretPhrase secretPhrase)` -> `String`
- `static secretPhraseToAnchorPublicKey(SecretPhrase secretPhrase)` -> `byte[]`
- `static secretPhraseToPublicKey(SecretPhrase secretPhrase)` -> `byte[]`
- `static textCommentFromBody(String body)` -> `String`
- `static toUserFriendlyAddress(String address)` -> `String`

## `org.telegram.ui.Wallet.WalletEngine2$HttpTransport`
- `close()` -> `void`
- `execute(long id, String url, boolean post, byte[] body, long timeoutMs)` -> `byte[]`

## `org.telegram.ui.Wallet.WalletEngine2$HttpTransport$Pending`
- `complete(byte[] body, HostException error)` -> `void`

## `org.telegram.ui.Wallet.WalletImportFragment`
- `createView(Context context)` -> `View`
- `static formatAddressTwoLines(String address)` -> `CharSequence`
- `isSupportEdgeToEdge()` -> `boolean`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onInsetsInternal(@NonNull View view, @NonNull WindowInsetsCompat windowInsets)` -> `WindowInsetsCompat`
- `setMatchPublicKey(byte[] publicKey)` -> `WalletImportFragment`
- `setWipe(boolean wipe)` -> `WalletImportFragment`

## `org.telegram.ui.Wallet.WalletKeysBackupFragment`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTitle()` -> `CharSequence`
- `static makeWordColumn(Context context, Theme.ResourcesProvider resourcesProvider, ArrayList<String> words, int from, int to)` -> `LinearLayout`
- `onClick(UItem item, View view, int position, float x, float y)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onLongClick(UItem item, View view, int position, float x, float y)` -> `boolean`
- `static showRecoveryPhraseAlert(Context context, ArrayList<String> words, Theme.ResourcesProvider resourcesProvider, Utilities.Callback<Utilities.Callback<String>> onImport, Runnable onDelete)` -> `void`
- `static showRecoveryPhraseLearnAlert(Context context, Theme.ResourcesProvider resourcesProvider, Utilities.Callback<Utilities.Callback<String>> onShow)` -> `void`

## `org.telegram.ui.Wallet.WalletKeysBackupFragment$LocalWalletCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(String address, long balance, int lastUsedDate, boolean outdated)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Wallet.WalletKeysBackupFragment$LocalWalletCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `LocalWalletCell`
- `static of(String address, long balance, int lastUsedDate, boolean outdated)` -> `UItem`

## `org.telegram.ui.Wallet.WalletRecipientView`
- `getContentBottom()` -> `float`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setRecipient(TLRPC.User user, String address)` -> `void`

## `org.telegram.ui.Wallet.WalletRecipientView$AddressView`
- `getAddressWidth()` -> `float`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onVisibilityChanged(View changedView, int visibility)` -> `void`
- `setAddress(String address, boolean restart)` -> `void`

## `org.telegram.ui.Wallet.WalletSecretPhraseFragment`
- `createView(Context context)` -> `View`
- `isSupportEdgeToEdge()` -> `boolean`
- `onContinuePressed()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onTested(Runnable onTested)` -> `WalletSecretPhraseFragment`
- `setCurrent()` -> `WalletSecretPhraseFragment`
- `setPhrase(SecretPhrase secretPhrase)` -> `WalletSecretPhraseFragment`

## `org.telegram.ui.Wallet.WalletSendEnterAmount`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getAddress()` -> `String`
- `getPublicKey()` -> `byte[]`
- `getTitle()` -> `CharSequence`
- `onClick(UItem item, View view, int position, float x, float y)` -> `void`
- `onCustomTransitionAnimation(boolean isOpen, Runnable callback)` -> `AnimatorSet`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onInsetsInternal(@NonNull View view, @NonNull WindowInsetsCompat windowInsets)` -> `WindowInsetsCompat`
- `onLongClick(UItem item, View view, int position, float x, float y)` -> `boolean`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `onTransitionAnimationStart(boolean isOpen, boolean backward)` -> `void`
- `setAmount(long nanos)` -> `WalletSendEnterAmount`
- `setComment(String comment, boolean encrypted)` -> `WalletSendEnterAmount`
- `setRecipientDomain(String domain)` -> `WalletSendEnterAmount`

## `org.telegram.ui.Wallet.WalletSendEnterAmount$AmountInputView`
- `getCurrencyView()` -> `AnimatedTextView`
- `getDiamondView()` -> `WalletDiamondView`
- `getEditText()` -> `EditTextBoldCursor`
- `onDetachedFromWindow()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAmountText(String text)` -> `void`
- `setCurrency(GramWallet wallet, boolean inCurrency)` -> `void`
- `setIntroProgress(float progress, float revealProgress, boolean finished)` -> `void`
- `setScaleProperty(float amplitude)` -> `void`

## `org.telegram.ui.Wallet.WalletSendEnterAmount$AmountInputView$AmountCharacterSpan`
- `getSize(@NonNull Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm)` -> `int`

## `org.telegram.ui.Wallet.WalletSendEnterAmount$AmountInputView$GlyphMotion`
- `draw(Canvas canvas, Paint paint, String glyph, float origin, int baseline)` -> `void`
- `snapshot()` -> `GlyphMotion`

## `org.telegram.ui.Wallet.WalletSendParticles`
- `burst(float x, float y)` -> `void`
- `celebrate(float x, float y)` -> `void`
- `clear()` -> `void`
- `draw(Canvas canvas)` -> `void`
- `isActive()` -> `boolean`
- `sent(float x, float y)` -> `void`
- `trail(float x, float y)` -> `void`

## `org.telegram.ui.Wallet.WalletSendSelectSender`
- `createView(Context context)` -> `View`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTitle()` -> `CharSequence`
- `onClick(UItem item, View view, int position, float x, float y)` -> `void`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onInsetsInternal(@NonNull View view, @NonNull WindowInsetsCompat windowInsets)` -> `WindowInsetsCompat`
- `onLongClick(UItem item, View view, int position, float x, float y)` -> `boolean`
- `onPause()` -> `void`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `setCollectible(TL_wallet.nftItem collectible)` -> `WalletSendSelectSender`

## `org.telegram.ui.Wallet.WalletSendTransition`
- `animator()` -> `AnimatorSet`
- `static bounds(View view, ViewGroup root)` -> `RectF`
- `static updateSourceBounds(View source, View outgoing, ViewGroup root, RectF result)` -> `void`

## `org.telegram.ui.Wallet.WalletTestPhraseFragment`
- `createView(Context context)` -> `View`
- `isSupportEdgeToEdge()` -> `boolean`
- `onInsets(int left, int top, int right, int bottom)` -> `void`

## `org.telegram.ui.Wallet.WalletTonConnectSessionsFragment`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTitle()` -> `CharSequence`
- `onClick(UItem item, View view, int position, float x, float y)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onLongClick(UItem item, View view, int position, float x, float y)` -> `boolean`
- `static openSessionSheet(Context context, TL_wallet.tonConnectSession session, Theme.ResourcesProvider resourcesProvider, Utilities.Callback<Utilities.Callback<String >> onDelete)` -> `void`

## `org.telegram.ui.Wallet.WalletTonConnectSessionsFragment$TONConnectionCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(TL_wallet.tonConnectSession session)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Wallet.WalletTonConnectSessionsFragment$TONConnectionCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `TONConnectionCell`
- `static of(TL_wallet.tonConnectSession session)` -> `UItem`

## `org.telegram.ui.Wallet.WalletTransactionAmountView`
- `getDiamond()` -> `WalletDiamondView`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthSpec, int heightSpec)` -> `void`
- `setAmount(CharSequence text, Drawable icon)` -> `void`
- `setColor(int color)` -> `void`
- `setFlying(boolean value)` -> `void`
- `setLandingPress(float value)` -> `void`
- `setPendingProgress(float value)` -> `void`

## `org.telegram.ui.Wallet.WalletWordCell`
- `getWord()` -> `String`
- `isEmpty()` -> `boolean`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setError(boolean hasError)` -> `void`
- `setOnErrorClearListener(Runnable listener)` -> `void`
- `setOnNextListener(Runnable listener)` -> `void`
- `setOnPasteListener(Runnable listener)` -> `void`
- `setOnTextChangedListener(Runnable listener)` -> `void`
- `setText(String text)` -> `void`

## `org.telegram.ui.WallpapersListActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static fillDefaultColors(ArrayList<Object> wallPapers, boolean isDark)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onActivityResultFragment(int requestCode, int resultCode, Intent data)` -> `void`
- `onConfigurationChanged(android.content.res.Configuration newConfig)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onResume()` -> `void`
- `restoreSelfArgs(Bundle args)` -> `void`

## `org.telegram.ui.WallpapersListActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.WallpapersListActivity$SearchAdapter`
- `clearColor()` -> `void`
- `getInnerListView()` -> `RecyclerListView`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onDestroy()` -> `void`

## `org.telegram.ui.WallpapersListActivity$SearchAdapter$CategoryAdapterRecycler`
- `getItemCount()` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.WebAppDisclaimerAlert`
- `static show(Context context, Utilities.Callback<Boolean> consumer, TLRPC.User withSendMessage, Runnable dismissed)` -> `void`

## `org.telegram.ui.WebviewActivity`
- `createView(Context context)` -> `View`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `static openGameInBrowser(String urlStr, MessageObject messageObject, Activity parentActivity, String short_name, String username)` -> `void`
- `static supportWebview()` -> `boolean`

## `org.telegram.ui.WebviewActivity$TelegramWebviewProxy`
- `postEvent(final String eventName, final String eventData)` -> `void`

## `org.telegram.ui.WrappedResourceProvider`
- `appendColors()` -> `void`
- `applyServiceShaderMatrix(int w, int h, float translationX, float translationY)` -> `void`
- `getAnimatedEmojiColorFilter()` -> `ColorFilter`
- `getColor(int key)` -> `int`
- `getColorOrDefault(int key)` -> `int`
- `getCurrentColor(int key)` -> `int`
- `getDrawable(String drawableKey)` -> `Drawable`
- `getPaint(String paintKey)` -> `Paint`
- `setAnimatedColor(int key, int color)` -> `void`

## `org.telegram.ui.bots.AffiliateProgramFragment`
- `createAdapter()` -> `RecyclerView.Adapter<?>`
- `createParticlesView()` -> `StarParticlesView`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getDefaultProgram()` -> `TL_payments.starRefProgram`
- `getHeader(Context context)` -> `View`
- `getNavigationBarColor()` -> `int`
- `static makeParticlesView(Context context, int particlesCount, int type)` -> `StarParticlesView`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `static percents(int commission)` -> `CharSequence`

## `org.telegram.ui.bots.AffiliateProgramFragment$BulletinTextView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`

## `org.telegram.ui.bots.AffiliateProgramFragment$ColorfulTextCell$Factory`
- `static as(int id, int color, int iconResId, CharSequence title, CharSequence text)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `ColorfulTextCell`

## `org.telegram.ui.bots.AffiliateProgramFragment$FeatureCell`
- `set(int iconResId, CharSequence title, CharSequence text)` -> `void`
- `setText(CharSequence text)` -> `void`

## `org.telegram.ui.bots.AffiliateProgramFragment$FeatureCell$Factory`
- `static as(int iconResId, CharSequence title, CharSequence text)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `FeatureCell`
- `isClickable()` -> `boolean`

## `org.telegram.ui.bots.BotAdView`
- `set(ChatActivity chatActivity, MessageObject messageObject, Runnable onRemoveListener, Runnable onCloseListener)` -> `void`

## `org.telegram.ui.bots.BotBiometry`
- `asked()` -> `boolean`
- `static clear()` -> `void`
- `static get(Context context, int currentAccount, long botId)` -> `BotBiometry`
- `static getAvailableType(Context context)` -> `String`
- `static getDeviceId(Context context, int currentAccount, long botId)` -> `String`
- `getStatus()` -> `JSONObject`
- `granted()` -> `boolean`
- `setGranted(boolean granted)` -> `void`
- `updateToken(String reason, String token, Utilities.Callback<Boolean> whenDone)` -> `void`

## `org.telegram.ui.bots.BotButtons`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `getAnimatedTotalHeight()` -> `float`
- `getTotalHeight()` -> `int`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBackgroundColor(int color, boolean animated)` -> `void`
- `setMainState(ButtonState newState, boolean animated)` -> `void`
- `setOnButtonClickListener(Utilities.Callback<Boolean> whenClicked)` -> `void`
- `setOnResizeListener(Runnable whenResized)` -> `void`
- `setSecondaryState(ButtonState newState, boolean animated)` -> `void`
- `setState(ButtonsState newState, boolean animated)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.bots.BotButtons$ButtonState`
- `static of(boolean visible, boolean active, boolean progress, boolean shine, String text, int color, int textColor)` -> `ButtonState`
- `static of(boolean visible, boolean active, boolean progress, boolean shine, String text, long emojiId, int color, int textColor)` -> `ButtonState`
- `static of(boolean visible, boolean active, boolean progress, boolean shine, String text, int color, int textColor, String position)` -> `ButtonState`
- `static of(boolean visible, boolean active, boolean progress, boolean shine, String text, long emojiId, int color, int textColor, String position)` -> `ButtonState`

## `org.telegram.ui.bots.BotCommandsMenuContainer`
- `clipBottom()` -> `float`
- `dismiss()` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `getListView()` -> `RecyclerListView`
- `getNestedScrollAxes()` -> `int`
- `onDismiss()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onNestedFling(View target, float velocityX, float velocityY, boolean consumed)` -> `boolean`
- `onNestedPreFling(View target, float velocityX, float velocityY)` -> `boolean`
- `onNestedPreScroll(View target, int dx, int dy, int[] consumed)` -> `void`
- `onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed)` -> `void`
- `onNestedScrollAccepted(View child, View target, int nestedScrollAxes)` -> `void`
- `onStartNestedScroll(View child, View target, int nestedScrollAxes)` -> `boolean`
- `onStopNestedScroll(View target)` -> `void`
- `setBackgroundDrawable(@NonNull BlurredBackgroundDrawable backgroundDrawable)` -> `void`
- `show()` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.bots.BotCommandsMenuView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawableStateChanged()` -> `void`
- `isOpened()` -> `boolean`
- `jumpDrawablesToCurrentState()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTranslationChanged(float translationX)` -> `void`
- `setDrawBackgroundDrawable(boolean drawBackgroundDrawable)` -> `void`
- `setExpanded(boolean expanded, boolean animated)` -> `void`
- `setMenuText(String menuText)` -> `boolean`
- `setOpened(boolean opened)` -> `void`
- `setWebView(boolean webView)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.bots.BotCommandsMenuView$BotCommandView`
- `getCommand()` -> `String`

## `org.telegram.ui.bots.BotCommandsMenuView$BotCommandsAdapter`
- `getItemCount()` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `setBotInfo(LongSparseArray<TL_bots.BotInfo> botInfo)` -> `void`

## `org.telegram.ui.bots.BotDownloads`
- `static clear()` -> `void`
- `download(String url, String file_name)` -> `FileDownload`
- `static get(Context context, int currentAccount, long botId)` -> `BotDownloads`
- `getCached(String url)` -> `FileDownload`
- `getCurrent()` -> `FileDownload`
- `static getExt(String mime)` -> `String`
- `getFiles()` -> `ArrayList<FileDownload>`
- `static getMimeAndSize(final String url, Utilities.Callback2<String, Long> whenDone)` -> `void`
- `static showAlert(Context context, String url, String file_name, String botname, Utilities.Callback<Boolean> whenDone)` -> `void`
- `static showAlert(Context context, String url, String file_name, String botname, Utilities.Callback<Boolean> whenDone, final long size, final String mime)` -> `AlertDialog`

## `org.telegram.ui.bots.BotDownloads$DownloadBulletin`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(FileDownload file)` -> `boolean`
- `setArrow(int rightMargin)` -> `void`

## `org.telegram.ui.bots.BotDownloads$DownloadBulletin$BackgroundDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setArrow(int rightMargin)` -> `void`
- `setColor(int color)` -> `BackgroundDrawable`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.bots.BotDownloads$DownloadBulletin$StatusDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `reset()` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setDone(boolean cancelled)` -> `void`
- `setProgress(Pair<Long, Long> progress)` -> `void`

## `org.telegram.ui.bots.BotDownloads$FileDownload`
- `getProgress()` -> `Pair<Long, Long>`
- `open()` -> `void`
- `toJSON()` -> `JSONObject`

## `org.telegram.ui.bots.BotKeyboardView`
- `applyInAppKeyboardAnimatedHeight(float height)` -> `void`
- `applyNavigationBarHeight(int height)` -> `void`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `getKeyboardHeight()` -> `int`
- `invalidateViews()` -> `void`
- `isFullSize()` -> `boolean`
- `onItemChanged(ReplaceAnimator<?> animato)` -> `void`
- `setButtons(TLRPC.TL_replyKeyboardMarkup buttons)` -> `void`
- `setDelegate(BotKeyboardViewDelegate botKeyboardViewDelegate)` -> `void`
- `setPanelHeight(int height)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.bots.BotKeyboardView$Button`
- `setPositionFlags(boolean isLeft, boolean isTop, boolean isRight, boolean isBottom)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.bots.BotKeyboardView$ButtonsLayout`
- `performDestroy()` -> `void`

## `org.telegram.ui.bots.BotLocation`
- `asked()` -> `boolean`
- `static clear()` -> `void`
- `static get(Context context, int currentAccount, long botId)` -> `BotLocation`
- `granted()` -> `boolean`
- `listen(Runnable grantedChanged)` -> `void`
- `setGranted(boolean granted, Runnable whenDone)` -> `void`
- `unlisten(Runnable grantedChanged)` -> `void`

## `org.telegram.ui.bots.BotLocation$BotUserLocationDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `onAttachedToWindow(ImageReceiver parent)` -> `void`
- `onDetachedFromWindow(ImageReceiver parent)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setParent(View view)` -> `void`

## `org.telegram.ui.bots.BotSensors`
- `attachWebView(BotWebViewContainer.MyWebView webView)` -> `void`
- `detachWebView(BotWebViewContainer.MyWebView webView)` -> `void`
- `pause()` -> `void`
- `resume()` -> `void`
- `startAccelerometer(long refresh_rate)` -> `boolean`
- `startGyroscope(long refresh_rate)` -> `boolean`
- `startOrientation(boolean absolute, long refresh_rate)` -> `boolean`
- `stopAccelerometer()` -> `boolean`
- `stopAll()` -> `void`
- `stopGyroscope()` -> `boolean`
- `stopOrientation()` -> `boolean`

## `org.telegram.ui.bots.BotShareSheet`
- `static convert(int currentAccount, long botId, TLRPC.BotInlineResult result, File file, TLRPC.WebPage webPage)` -> `MessageObject`
- `static convert(int currentAccount, long botId, TLRPC.BotInlineResult result, TLRPC.Photo photo, TLRPC.Document document, TLRPC.WebPage webPage)` -> `MessageObject`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `dismiss()` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTitle()` -> `CharSequence`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `static share(Context context, int currentAccount, long botId, String id, Theme.ResourcesProvider resourcesProvider, Runnable whenOpened, Utilities.Callback2<String, ArrayList<Long>> whenDone)` -> `void`

## `org.telegram.ui.bots.BotStorage`
- `clear()` -> `void`
- `static getDir()` -> `File`
- `getFile()` -> `File`
- `getKey(String key)` -> `Pair<String, Boolean>`
- `getStoragesWithKey(String key)` -> `List<StorageConfig>`
- `restoreFrom(String id)` -> `void`
- `setKey(String key, String value)` -> `void`
- `showChooseStorage(Context context, List<StorageConfig> storages, Utilities.Callback<String> whenDone)` -> `void`

## `org.telegram.ui.bots.BotStorage$StorageCell`
- `onDraw(Canvas canvas)` -> `void`
- `setChecked(boolean checked)` -> `void`

## `org.telegram.ui.bots.BotVerifySheet`
- `static openRemoveVerify(Context context, int currentAccount, long botId, long dialogId, TL_bots.BotVerifierSettings settings, Utilities.Callback<Boolean> whenSent)` -> `void`
- `static openSheet(Context context, int currentAccount, long botId, long dialogId, TL_bots.BotVerifierSettings settings, Utilities.Callback<Boolean> whenSent)` -> `void`
- `static openVerify(int currentAccount, long botId, TL_bots.BotVerifierSettings settings)` -> `void`

## `org.telegram.ui.bots.BotWebViewAttachedSheet`
- `attachInternal()` -> `void`
- `attachedToParent()` -> `boolean`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `dismiss(boolean intoTabs)` -> `void`
- `dismiss(boolean intoTabs, Runnable callback)` -> `void`
- `getBotId()` -> `long`
- `getBulletinFactory()` -> `BulletinFactory`
- `getContainerTop()` -> `float`
- `getContext()` -> `Context`
- `getNavigationBarColor(int color)` -> `int`
- `getWindowView()` -> `WindowView`
- `hadDialog()` -> `boolean`
- `isFullyVisible()` -> `boolean`
- `static makeThemeParams(Theme.ResourcesProvider resourcesProvider)` -> `JSONObject`
- `onAttachedBackPressed()` -> `boolean`
- `onCheckDismissByUser()` -> `boolean`
- `static openPrivacy(int currentAccount, long botId)` -> `boolean`
- `release()` -> `void`
- `restoreState(BaseFragment fragment, BottomSheetTabs.WebTabData tab)` -> `boolean`
- `setActionBarColor(int color, boolean isOverrideColor, boolean animated)` -> `void`
- `setBackgroundColor(int color, boolean animated)` -> `void`
- `setDefaultFullsize(boolean fullsize)` -> `void`
- `setDialog(BottomSheetTabDialog dialog)` -> `boolean`
- `setKeyboardHeightFromParent(int keyboardHeight)` -> `void`
- `setLastVisible(boolean lastVisible)` -> `void`
- `setNavigationBarColor(int color, boolean animated)` -> `void`
- `setNeedsContext(boolean needsContext)` -> `void`
- `setOnDismissListener(Runnable listener)` -> `void`
- `setParentActivity(Activity parentActivity)` -> `void`
- `setWasOpenedByBot(WebViewRequestProps props)` -> `void`
- `setWasOpenedByLinkIntent(boolean value)` -> `void`
- `show()` -> `void`
- `show(boolean lowBounce)` -> `void`
- `show(boolean lowBounce, boolean instant)` -> `void`
- `showDialog(Dialog dialog)` -> `boolean`
- `showJustAddedBulletin()` -> `void`

## `org.telegram.ui.bots.BotWebViewAttachedSheet$WindowView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `draw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `drawInto(Canvas canvas, RectF finalRect, float progress, RectF clipRect, float alpha, boolean opening)` -> `float`
- `getRect()` -> `RectF`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setDrawingFromOverlay(boolean drawingFromOverlay)` -> `void`

## `org.telegram.ui.bots.BotWebViewMenuContainer`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `dismiss(Runnable callback)` -> `void`
- `dismiss(boolean intoTabs)` -> `void`
- `dismiss(boolean intoTabs, Runnable callback)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `draw(Canvas canvas)` -> `void`
- `drawInto(Canvas canvas, RectF finalRect, float progress, RectF clipRect, float alpha, boolean opening)` -> `float`
- `getNavigationBarColor(int color)` -> `int`
- `getRect()` -> `RectF`
- `getWindowView()` -> `BottomSheetTabsOverlay.SheetView`
- `hadDialog()` -> `boolean`
- `isFullSize()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onBackPressed()` -> `boolean`
- `onCheckDismissByUser()` -> `boolean`
- `onDetachedFromWindow()` -> `void`
- `onDismiss()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onPanTransitionEnd()` -> `void`
- `onPanTransitionStart(boolean keyboardVisible, int contentHeight)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `release()` -> `void`
- `restoreState(BaseFragment fragment, BottomSheetTabs.WebTabData tab)` -> `boolean`
- `setDialog(BottomSheetTabDialog dialog)` -> `boolean`
- `setDrawingFromOverlay(boolean drawingFromOverlay)` -> `void`
- `setMainButton(BotWebViewAttachedSheet.MainButtonSettings s)` -> `void`
- `setOnDismissGlobalListener(Runnable callback)` -> `void`
- `show(int currentAccount, long botId, String botUrl)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.bots.BotWebViewSheet`
- `createErrorContainer()` -> `ArticleViewer.ErrorContainer`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss(boolean tabs)` -> `void`
- `dismiss()` -> `void`
- `dismiss(Runnable callback)` -> `void`
- `dismiss(boolean intoTabs, Runnable callback)` -> `void`
- `getActivity()` -> `Activity`
- `getBotId()` -> `long`
- `getBulletinFactory()` -> `BulletinFactory`
- `getNavigationBarColor(int color)` -> `int`
- `getWindowView()` -> `WindowView`
- `hadDialog()` -> `boolean`
- `isFullSize()` -> `boolean`
- `isGuardBotTab(long peerId, long queryId)` -> `boolean`
- `lockOrientation(boolean lock)` -> `void`
- `static makeThemeParams(Theme.ResourcesProvider resourcesProvider)` -> `JSONObject`
- `static makeThemeParams(Theme.ResourcesProvider resourcesProvider, boolean hexify)` -> `JSONObject`
- `static navigationBarColor(int actionBarColor)` -> `int`
- `onAttachedToWindow()` -> `void`
- `onBackPressed()` -> `void`
- `onCheckDismissByUser()` -> `boolean`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onStart()` -> `void`
- `onStop()` -> `void`
- `release()` -> `void`
- `restoreState(BaseFragment fragment, BottomSheetTabs.WebTabData tab)` -> `boolean`
- `setActionBarColor(int color, boolean isOverride, boolean animated)` -> `void`
- `setAttached(boolean b)` -> `void`
- `setBackgroundColor(int color, boolean isOverride, boolean animated)` -> `void`
- `setDefaultFullsize(boolean fullsize)` -> `void`
- `setDialog(BottomSheetTabDialog dialog)` -> `boolean`
- `setFullscreen(boolean fullscreen, boolean animated)` -> `void`
- `setFullscreen(boolean fullscreen, boolean animated, boolean blur)` -> `void`
- `setNavigationBarColor(int color, boolean animated)` -> `void`
- `setNeedsContext(boolean needsContext)` -> `void`
- `setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback)` -> `void`
- `setOpen(boolean opened)` -> `void`
- `setParentActivity(Activity parentActivity)` -> `void`
- `setWasOpenedByBot(WebViewRequestProps props)` -> `void`
- `setWasOpenedByLinkIntent(boolean value)` -> `void`
- `show()` -> `void`
- `showJustAddedBulletin()` -> `void`
- `updateFullscreenLayout()` -> `void`
- `updateWindowFlags()` -> `void`

## `org.telegram.ui.bots.BotWebViewSheet$WindowView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `draw(Canvas canvas)` -> `void`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `drawInto(Canvas canvas, RectF finalRect, float progress, RectF clipRect, float alpha, boolean opening)` -> `float`
- `getRect()` -> `RectF`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setDrawingFromOverlay(boolean drawingFromOverlay)` -> `void`

## `org.telegram.ui.bots.ChannelAffiliateProgramsFragment`
- `createAdapter()` -> `RecyclerView.Adapter<?>`
- `createParticlesView()` -> `StarParticlesView`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `static makeParticlesView(Context context, int particlesCount, int type)` -> `StarParticlesView`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `static showConnectAffiliateAlert(Context context, int currentAccount, TL_payments.starRefProgram bot, long dialogId, Theme.ResourcesProvider resourcesProvider, boolean forceOpenStats)` -> `void`
- `static showShareAffiliateAlert(Context context, int currentAccount, TL_payments.connectedBotStarRef bot, long dialogId, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet`

## `org.telegram.ui.bots.ChannelAffiliateProgramsFragment$BotCell`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(TL_payments.connectedBotStarRef bot, boolean showArrow, boolean needDivider)` -> `void`
- `set(TL_payments.starRefProgram bot, boolean showArrow, boolean needDivider)` -> `void`

## `org.telegram.ui.bots.ChannelAffiliateProgramsFragment$BotCell$Factory`
- `static as(Object obj)` -> `UItem`
- `static as(Object obj, boolean showArrow)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `BotCell`

## `org.telegram.ui.bots.ChannelAffiliateProgramsFragment$HeaderSortCell`
- `set(CharSequence text, CharSequence subtext)` -> `void`

## `org.telegram.ui.bots.ChannelAffiliateProgramsFragment$HeaderSortCell$Factory`
- `static as(CharSequence text, CharSequence sortText)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `HeaderSortCell`
- `isClickable()` -> `boolean`

## `org.telegram.ui.bots.SuggestedAffiliateProgramsFragment`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `isLightStatusBar()` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onItemClick(UItem item, View view, int position, float x, float y)` -> `void`

## `org.telegram.ui.bots.WebViewRequestProps`
- `applyResponse(TLObject response)` -> `void`
- `equals(@Nullable Object obj)` -> `boolean`

## `org.telegram.ui.community.CommunityArrowDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getAlpha()` -> `int`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `withCircle()` -> `CommunityArrowDrawable`

## `org.telegram.ui.community.CommunityCreateActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `isSupportEdgeToEdge()` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`

## `org.telegram.ui.community.CommunityCreateActivity$CommunityHeaderView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setSubtitle(CharSequence text)` -> `void`
- `setTitle(CharSequence text)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.community.CommunityEditActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `didStartUpload(boolean fromAvatarConstructor, boolean isVideo)` -> `void`
- `didUploadPhoto(final TLRPC.InputFile photo, final TLRPC.InputFile video, double videoStartTimestamp, String videoPath, final TLRPC.PhotoSize bigSize, final TLRPC.PhotoSize smallSize, boolean isVideo, TLRPC.VideoSize emojiMarkup)` -> `void`
- `dismissCurrentDialog()` -> `void`
- `dismissDialogOnPause(Dialog dialog)` -> `boolean`
- `drawEdgeNavigationBar()` -> `boolean`
- `getInitialSearchString()` -> `String`
- `isSupportEdgeToEdge()` -> `boolean`
- `onActivityResultFragment(int requestCode, int resultCode, Intent data)` -> `void`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `onUploadProgressChanged(float progress)` -> `void`
- `openSetPhotoAlert()` -> `void`
- `restoreSelfArgs(Bundle args)` -> `void`

## `org.telegram.ui.community.CommunityEditActivity$CommunityHeaderView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.community.CommunityEditActivity$EditTextCell`
- `getText()` -> `String`

## `org.telegram.ui.community.CommunityPendingRequestsActivity`
- `createView(Context context)` -> `View`
- `drawEdgeNavigationBar()` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`

## `org.telegram.ui.community.CommunitySheet`
- `canSwipeToBack(MotionEvent event)` -> `boolean`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismissInternal()` -> `void`
- `onBackPressed()` -> `void`
- `onButtonClicked(DialogCell dialogCell)` -> `void`
- `onButtonLongPress(DialogCell dialogCell)` -> `void`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `openHiddenStories()` -> `void`
- `openStory(DialogCell dialogCell, Runnable onDone)` -> `void`
- `showChatPreview(DialogCell dialogCell)` -> `void`

## `org.telegram.ui.community.CommunitySheet$ChatsToAddListPage`
- `top()` -> `float`
- `updateTops()` -> `void`

## `org.telegram.ui.community.CommunitySheet$CommunityPage`
- `top()` -> `float`
- `updateTops()` -> `void`

## `org.telegram.ui.community.CommunitySheet$ContainerView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.community.CommunitySheet$FadeView`
- `onDraw(@NonNull Canvas canvas)` -> `void`

## `org.telegram.ui.community.CommunitySheet$Page`
- `afterInit()` -> `void`
- `atBottom()` -> `boolean`
- `atTop()` -> `boolean`
- `bind(int pageType)` -> `void`
- `top()` -> `float`
- `updateTops()` -> `void`

## `org.telegram.ui.community.CommunityUtils`
- `static fillLinkedPeers(int currentAccount, ArrayList<UItem> items, DialogCell.DialogCellDelegate delegate, long communityId, boolean withGap)` -> `void`
- `static onCommunityLinkSuccess(BaseFragment baseFragment, long groupDialogId, int status)` -> `void`
- `static showChatsToAddToCommunity(AlertDialog[] progressDialog, BaseFragment baseFragment, int currentAccount, TLRPC.Chat community)` -> `void`
- `static showCommunityLinkSuccessToast(BulletinFactory bulletinFactory, int status, boolean isChannel)` -> `void`

## `org.telegram.ui.community.CommunityUtils$PendingRequests`
- `commit()` -> `void`
- `fillItems(ArrayList<UItem> items)` -> `void`
- `getPendingRequests()` -> `ArrayList<TL_communities.CommunityPeerRequest>`
- `getTotalCount()` -> `int`
- `getUnreadCount()` -> `int`
- `onClickApprove(long dialogId)` -> `void`
- `onClickDecline(long dialogId)` -> `void`
- `onClickGroupOwner(long dialogId)` -> `void`
- `onResolveAllJoinRequests(boolean add)` -> `void`
- `setDelegate(Delegate delegate)` -> `void`

## `org.telegram.ui.community.cells.CommunityLinkView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChat(int currentAccount, TLRPC.Chat chat)` -> `void`
- `setSubtitle(CharSequence text)` -> `void`
- `setTitle(CharSequence text)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.community.cells.CommunityLinkView2`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChat(int currentAccount, TLRPC.Chat chat)` -> `void`
- `setSubtitle(CharSequence text)` -> `void`
- `setTitle(CharSequence text)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.community.cells.CommunityPendingRequestCell`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.community.cells.CommunityPendingRequestCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `CommunityPendingRequestCell`
- `equals(UItem a, UItem b)` -> `boolean`

## `org.telegram.ui.community.cells.CommunityRequestsCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setTitle(CharSequence title)` -> `void`
- `setUnreadMode(boolean unreadMode)` -> `void`
- `setValue(CharSequence value)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.community.cells.CommunityRequestsCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `CommunityRequestsCell`
- `static of(int id, IconBackgroundColors iconColor, int icon, CharSequence title, CharSequence value, boolean valueAsUnread)` -> `UItem`

## `org.telegram.ui.community.sheet.CommunityAddOptionsSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `getTitle()` -> `CharSequence`

## `org.telegram.ui.community.sheet.CommunityInviteOnlySheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `getTitle()` -> `CharSequence`

## `org.telegram.ui.iv.BlockRow`
- `innermostQuote()` -> `RichContainer`

## `org.telegram.ui.iv.Latex`
- `static render(@NonNull String source, float textSizePx)` -> `Latex`
- `static render(@NonNull String source, float textSizePx, boolean needDepth)` -> `Latex`

## `org.telegram.ui.iv.MathSpan`
- `static create(String source, int color, float textSizePx)` -> `MathSpan`
- `draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint p)` -> `void`
- `getSize(Paint p, CharSequence text, int start, int end, Paint.FontMetricsInt fm)` -> `int`
- `static sourceAt(CharSequence cs, int from, int to)` -> `String`

## `org.telegram.ui.iv.RichAIComposeSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `dismiss()` -> `void`
- `getTitle()` -> `CharSequence`
- `show()` -> `void`

## `org.telegram.ui.iv.RichBlockCell`
- `bindBlockInset(BlockRow row)` -> `void`
- `blockInset()` -> `int`
- `nestedContentMargin()` -> `int`
- `onBlockInsetChanged(int px)` -> `void`
- `resyncBlockInset(boolean animated)` -> `void`
- `setBlockPadding(int left, int top, int right, int bottom)` -> `void`

## `org.telegram.ui.iv.RichBlockChrome`
- `static applyEditorQuoteColor(ReplyMessageLine line, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static applyInset(View cell, BlockRow row, int baseLeft, int baseTop, int baseRight, int baseBottom)` -> `void`
- `static applyInsetPx(View cell, int inset, int baseLeft, int baseTop, int baseRight, int baseBottom)` -> `void`
- `static applyInsetPx(View cell, int startInset, int endInset, int baseLeft, int baseTop, int baseRight, int baseBottom)` -> `void`
- `static insetEndFor(BlockRow row)` -> `int`
- `static insetFor(BlockRow row)` -> `int`
- `static insetForDepth(int depth)` -> `int`
- `static quoteBottomPad(BlockRow row)` -> `int`
- `static quoteDepth(BlockRow row)` -> `int`
- `static quoteEdgePad(int count)` -> `int`
- `static quoteInset(BlockRow row)` -> `int`
- `static quoteInsetEnd(BlockRow row)` -> `int`
- `static quoteTopPad(BlockRow row)` -> `int`
- `static rtl()` -> `boolean`

## `org.telegram.ui.iv.RichBlockInset`
- `apply(BlockRow row, Applier applier)` -> `void`
- `apply(BlockRow row, Applier applier, boolean animated)` -> `void`
- `current()` -> `int`

## `org.telegram.ui.iv.RichBlockSelection`
- `static of(int left, int top, int right, int bottom)` -> `TextSelectionHelper.TextLayoutBlock`

## `org.telegram.ui.iv.RichButtonRowCell`
- `bind(BlockRow row, Delegate delegate)` -> `void`
- `isPressOnButton(float localX, float localY)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.iv.RichButtonRowCell$ButtonView`
- `getContentHeight()` -> `int`
- `getMinWidth()` -> `int`
- `getPreferredWidth()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setButtonWidth(int width)` -> `void`

## `org.telegram.ui.iv.RichButtonRowCell$Factory`
- `isClickable()` -> `boolean`
- `static of(BlockRow row, Delegate delegate)` -> `UItem`

## `org.telegram.ui.iv.RichCaptionController`
- `applyColors()` -> `void`
- `bind()` -> `void`
- `drawSelection(Canvas canvas)` -> `void`
- `static ensureCaption(TL_iv.PageBlock block)` -> `void`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> out)` -> `void`
- `hideActionMode()` -> `void`
- `layout(int parentWidthPx, int top)` -> `void`
- `layout(int leftInset, int rightInset, int parentWidthPx, int top)` -> `void`
- `measure(int parentWidthPx)` -> `int`
- `measure(int leftInset, int rightInset, int parentWidthPx)` -> `int`
- `persist()` -> `void`
- `setLocked(boolean locked)` -> `void`

## `org.telegram.ui.iv.RichCommand`
- `static get()` -> `ArrayList<RichCommand>`
- `static match(String query)` -> `ArrayList<RichCommand>`
- `matches(String q)` -> `boolean`

## `org.telegram.ui.iv.RichCommand$View`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.iv.RichCommandSuggestions`
- `hide()` -> `void`
- `update(RichTextCell cell, String query)` -> `void`

## `org.telegram.ui.iv.RichContainer`
- `copy()` -> `RichContainer`
- `static details(long id, boolean open)` -> `RichContainer`
- `static list(long id, long itemId, boolean ordered, boolean checklist, boolean checked)` -> `RichContainer`
- `static newId()` -> `long`
- `static quote(long id)` -> `RichContainer`
- `sameInstance(RichContainer o)` -> `boolean`
- `sameItem(RichContainer o)` -> `boolean`

## `org.telegram.ui.iv.RichDetailsCell`
- `bind(BlockRow row, Delegate delegate)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> out)` -> `void`
- `getEditText()` -> `RichEditText`
- `getRow()` -> `BlockRow`
- `isPressOnArrow(int localX, int localY)` -> `boolean`
- `isPressOnEmptyEditText(int localX, int localY)` -> `boolean`
- `isPressOnText(int localX, int localY)` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setLocked(boolean locked)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.iv.RichDetailsCell$Delegate`
- `onLockedInsert(CharSequence text)` -> `default void`
- `onRequestWindowFocusable(RichEditText editText, boolean showKeyboard)` -> `default void`
- `onSelectAll(BlockRow row)` -> `default boolean`
- `onSpansChanged(BlockRow row)` -> `default void`
- `onTitleBackspace(BlockRow row)` -> `default void`
- `onTitleEnter(BlockRow row)` -> `default void`

## `org.telegram.ui.iv.RichDetailsCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `RichDetailsCell`
- `isClickable()` -> `boolean`
- `static of(BlockRow row, Delegate delegate)` -> `UItem`

## `org.telegram.ui.iv.RichDetailsEndCell`
- `bind(BlockRow row)` -> `void`
- `getRow()` -> `BlockRow`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.iv.RichDetailsEndCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `RichDetailsEndCell`
- `isClickable()` -> `boolean`
- `static of(BlockRow row)` -> `UItem`

## `org.telegram.ui.iv.RichDividerCell`
- `bind(BlockRow row, Delegate delegate)` -> `void`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> out)` -> `void`
- `getRow()` -> `BlockRow`
- `onBlockInsetChanged(int px)` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.iv.RichDividerCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `RichDividerCell`
- `isClickable()` -> `boolean`
- `static of(BlockRow row, Delegate delegate)` -> `UItem`

## `org.telegram.ui.iv.RichDocumentCell`
- `bind(BlockRow row, Delegate delegate)` -> `void`
- `refreshUploadState()` -> `void`
- `updateButtonState(boolean animated)` -> `void`

## `org.telegram.ui.iv.RichDocumentCell$Delegate`
- `getFileRefParentObject()` -> `default MessageObject`
- `onCaptionChanged(BlockRow row)` -> `default void`
- `onCaptionEnter(BlockRow row)` -> `default void`
- `onCaptionLockedInsert(CharSequence text)` -> `default void`
- `onCaptionSelectAll(BlockRow row)` -> `default boolean`
- `onCaptionSpansChanged(BlockRow row)` -> `default void`
- `onCaptionWillChange(BlockRow row, int removed, int added)` -> `default void`
- `onRequestWindowFocusable(RichEditText et, boolean showKeyboard)` -> `default void`

## `org.telegram.ui.iv.RichDocumentCell$Factory`
- `static of(BlockRow row, Delegate delegate)` -> `UItem`

## `org.telegram.ui.iv.RichEditText`
- `appendSilently(CharSequence text)` -> `void`
- `createUrlSpan(String url)` -> `URLSpanReplacement`
- `dispatchKeyEvent(KeyEvent event)` -> `boolean`
- `extendActionMode(ActionMode actionMode, Menu menu)` -> `void`
- `finishActionMode()` -> `void`
- `getCurrentStyle(int start, int end)` -> `int`
- `getResourcesProvider()` -> `Theme.ResourcesProvider`
- `isAutoBold()` -> `boolean`
- `notifyInlineContentChanged()` -> `void`
- `notifySpansChanged()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onKeyDown(int keyCode, KeyEvent event)` -> `boolean`
- `onSelectionChanged(int selStart, int selEnd)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `onTextContextMenuItem(int id)` -> `boolean`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setAccentHint(boolean enable)` -> `void`
- `setAllowNewlines(boolean allow)` -> `void`
- `setAutoBold(boolean enabled)` -> `void`
- `setBlock(TL_iv.PageBlock block)` -> `void`
- `setCenterEmptyHint(boolean enable)` -> `void`
- `setGravity(int gravity)` -> `void`
- `setInlineButtonClickListener(InlineButtonClickListener listener)` -> `void`
- `setInlineButtonContext(int currentAccount)` -> `void`
- `setInputType(int type)` -> `void`
- `setListener(Listener listener)` -> `void`
- `setLocked(boolean locked)` -> `void`
- `setSoftEnterNewline(boolean enable)` -> `void`
- `setTextColorKey(int textColorKey)` -> `void`
- `setTextSilently(CharSequence text)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.iv.RichEditText$Listener`
- `onBackspaceAtStart(RichEditText editText)` -> `default boolean`
- `onBackspaceOnEmpty(RichEditText editText)` -> `default void`
- `onEnterPressed(RichEditText editText)` -> `default void`
- `onLockedInsert(RichEditText editText, CharSequence text)` -> `default void`
- `onPaste(RichEditText editText)` -> `default boolean`
- `onRequestWindowFocusable(RichEditText editText, boolean showKeyboard)` -> `default void`
- `onSelectAll(RichEditText editText)` -> `default boolean`
- `onSelectionChanged(RichEditText editText, int selStart, int selEnd)` -> `default void`
- `onTab(RichEditText editText, boolean shift)` -> `default boolean`
- `onTextChanged(RichEditText editText, Editable text)` -> `default void`
- `onTextWillChange(RichEditText editText, int removed, int added)` -> `default void`

## `org.telegram.ui.iv.RichEditor`
- `animateFrom(ChatActivity chatActivity)` -> `RichEditor`
- `static blockButtonContentDescription(int flag)` -> `String`
- `convertToSimpleOnOpen()` -> `RichEditor`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static formattingButtonContentDescription(int styleFlag)` -> `String`
- `hideKeyboardOnShow()` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `onActivityResultFragment(int requestCode, int resultCode, Intent data)` -> `void`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onCustomTransitionAnimation(boolean isOpen, Runnable callback)` -> `AnimatorSet`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onInsetsInternal(@NonNull View view, @NonNull WindowInsetsCompat windowInsets)` -> `WindowInsetsCompat`
- `onTransitionAnimationStart(boolean isOpen, boolean backward)` -> `void`
- `static openConversionSheet(Context context, Runnable convert, Runnable openPremium, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet`
- `setChatActivity(ChatActivity chatActivity)` -> `RichEditor`
- `setEditing(MessageObject messageObject)` -> `RichEditor`
- `setHtmlSurrounding(CharSequence before, CharSequence after)` -> `RichEditor`
- `setInitialSelection(int start, int end)` -> `RichEditor`
- `setOnCleared(Runnable onClearedCallback)` -> `RichEditor`
- `setOnSent(Runnable onSentCallback)` -> `RichEditor`
- `static withShadow(Drawable inner)` -> `Drawable`
- `static withShadow(Drawable inner, float r, float x, float y, int color)` -> `Drawable`

## `org.telegram.ui.iv.RichEditor$Button`
- `resetIcon()` -> `void`
- `setAccent(boolean accent)` -> `Button`
- `setBackgroundColorKey(int key)` -> `Button`
- `setEnabled(boolean enabled)` -> `void`
- `setPremium()` -> `Button`
- `setPremiumLocked(boolean locked)` -> `void`
- `setRoundRadius(int roundRadius)` -> `Button`
- `setSelected(boolean selected)` -> `void`
- `updateColors()` -> `void`
- `updateIcon(int newIcon)` -> `void`

## `org.telegram.ui.iv.RichEditor$DraggingDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setDragging(boolean dragging)` -> `void`

## `org.telegram.ui.iv.RichEditor$RequiresPremiumDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setCutoutColorKey(int colorKey)` -> `RequiresPremiumDrawable`
- `setPremium(boolean premium)` -> `RequiresPremiumDrawable`

## `org.telegram.ui.iv.RichEditor$ShadowWrapperDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `invalidateDrawable(@NonNull Drawable who)` -> `void`
- `isStateful()` -> `boolean`
- `jumpToCurrentState()` -> `void`
- `onBoundsChange(Rect bounds)` -> `void`
- `onStateChange(int[] state)` -> `boolean`
- `scheduleDrawable(@NonNull Drawable who, @NonNull Runnable what, long when)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(ColorFilter colorFilter)` -> `void`
- `setHotspot(float x, float y)` -> `void`
- `setHotspotBounds(int left, int top, int right, int bottom)` -> `void`
- `unscheduleDrawable(@NonNull Drawable who, @NonNull Runnable what)` -> `void`

## `org.telegram.ui.iv.RichEditorLimits`
- `findExceeded(AppGlobalConfig config)` -> `int`
- `static measure(ArrayList<TL_iv.PageBlock> top, int mediaCount)` -> `RichEditorLimits`

## `org.telegram.ui.iv.RichEditorListView`
- `applyInitialSelection(int start, int end)` -> `void`
- `applyQuote(BlockRow row)` -> `void`
- `assignContainers()` -> `void`
- `attachAudio(MessageObject mo)` -> `void`
- `attachDocument(MessageObject mo)` -> `void`
- `attachDocument(String path)` -> `void`
- `attachDocument(Uri uri)` -> `void`
- `attachExternalMedia(Uri uri)` -> `void`
- `attachMedia(MediaController.PhotoEntry entry)` -> `void`
- `beginSelectionEdit()` -> `SelectionEdit`
- `buildDraftRichMessage()` -> `TL_iv.RichMessage`
- `captionEditText(int adapterPos)` -> `RichEditText`
- `clearContent()` -> `void`
- `collectDocuments()` -> `ArrayList<TLRPC.Document>`
- `collectPhotos()` -> `ArrayList<TLRPC.Photo>`
- `convertToSimple()` -> `void`
- `currentBlockRow()` -> `BlockRow`
- `deselectIfAny()` -> `boolean`
- `destroy()` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `enterCellSelectionMode(RichTableCell table, TL_iv.pageTableCell cell)` -> `void`
- `static expandBlockquoteBlocks(ArrayList<BlockRow> out, TL_iv.pageBlockBlockquoteBlocks src, Map<Long, TL_iv.RichText> authors)` -> `void`
- `findExceededLimit()` -> `int`
- `findFocusedEditText()` -> `RichEditText`
- `findFocusedRow()` -> `BlockRow`
- `findFocusedTableCell()` -> `RichTableCell`
- `static flattenBlocks(ArrayList<BlockRow> out, ArrayList<TL_iv.PageBlock> blocks)` -> `void`
- `static flattenBlocks(ArrayList<BlockRow> out, ArrayList<TL_iv.PageBlock> blocks, Map<Long, TL_iv.RichText> authors)` -> `void`
- `static flattenForCopy(TL_iv.RichMessage msg)` -> `ArrayList<BlockRow>`
- `static flattenForCopy(TL_iv.RichMessage msg, Map<Long, TL_iv.RichText> authors)` -> `ArrayList<BlockRow>`
- `flattenRowsToBlocks()` -> `ArrayList<TL_iv.PageBlock>`
- `focusForDraft()` -> `void`
- `focusedCellOf(RichTableCell table)` -> `TL_iv.pageTableCell`
- `static galleryItems(TL_iv.PageBlock b)` -> `ArrayList<TL_iv.PageBlock>`
- `getFocusedEditTextOrNull()` -> `RichEditText`
- `getMapDelegate()` -> `RichMapCell.Delegate`
- `getOverlayView()` -> `View`
- `getTextSelectionHelper()` -> `TextSelectionHelper.ArticleTextSelectionHelper`
- `handleKeyEvent(KeyEvent ev)` -> `boolean`
- `handleSelectionTouch(MotionEvent ev)` -> `boolean`
- `handleSlashCommand(BlockRow row, int command)` -> `void`
- `indentSelection(boolean outdent)` -> `boolean`
- `insertDetails()` -> `void`
- `isCaptionSelection()` -> `boolean`
- `isDateApplied(int sCell, int sOff, int eCell, int eOff)` -> `boolean`
- `static isDetailsHeader(BlockRow row)` -> `boolean`
- `static isGallery(TL_iv.PageBlock b)` -> `boolean`
- `static isHeading(TL_iv.PageBlock b)` -> `boolean`
- `isInSelectionMode()` -> `boolean`
- `isLinkApplied(int sCell, int sOff, int eCell, int eOff)` -> `boolean`
- `isLossy()` -> `boolean`
- `isQuoteAuthorSelection()` -> `boolean`
- `isReorderRemoving()` -> `boolean`
- `isSelectionAllHeadings()` -> `boolean`
- `isSelectionQuoted()` -> `boolean`
- `isSimpleConvertible()` -> `boolean`
- `isStyleFullyApplied(int flag, int sCell, int sOff, int eCell, int eOff)` -> `boolean`
- `isStyleFullyAppliedTable(int flag, int pos, int sChild, int sOff, int eChild, int eOff)` -> `boolean`
- `isTableSelection()` -> `boolean`
- `isWithinLimits()` -> `boolean`
- `static mediasOf(BlockRow r)` -> `List<MediaUploadState>`
- `static newBlockquote()` -> `TL_iv.pageBlockBlockquote`
- `static newPullquote()` -> `TL_iv.pageBlockPullquote`
- `onAttachedToWindow()` -> `void`
- `onCellIndent(BlockRow row, boolean outdent)` -> `boolean`
- `onDateClicked()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onFormattingClicked(int flag)` -> `void`
- `onInlineButtonClicked(View anchor)` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onLinkClicked()` -> `void`
- `onMathClicked()` -> `void`
- `onReorderEnd(RecyclerView.ViewHolder viewHolder)` -> `void`
- `onReorderMoved(RecyclerView.ViewHolder viewHolder)` -> `void`
- `onReorderRemove(RecyclerView.ViewHolder viewHolder)` -> `void`
- `onReorderStart(RecyclerView.ViewHolder viewHolder)` -> `void`
- `quoteAuthorEditText(int adapterPos)` -> `RichEditText`
- `redo()` -> `void`
- `resetHistoryBaseline()` -> `void`
- `rowForCell(int cellPos)` -> `BlockRow`
- `seedEmptyArticle()` -> `void`
- `selectionHasInlineFormattable()` -> `boolean`
- `setAdaptiveLinkDialogs(boolean adaptive)` -> `void`
- `setAllowTapAboveContent(boolean allow)` -> `void`
- `setFileRefParentObject(MessageObject messageObject)` -> `void`
- `setInitialText(CharSequence text)` -> `void`
- `setInsets(int bottomInset, int imeInset, int emojiPadding)` -> `void`
- `showTableCellMenu(RichTableCell table)` -> `void`
- `tableEditText(int adapterPos, int childPos)` -> `RichEditText`
- `toSimpleMessage()` -> `CharSequence`
- `toggleQuoteOnSelection()` -> `void`
- `turnInto(BlockRow row, TL_iv.PageBlock newBlock, int level, int num, boolean checkbox, boolean checked)` -> `void`
- `turnIntoKeepList(BlockRow row, TL_iv.PageBlock newBlock)` -> `void`
- `turnIntoList(BlockRow row, int kind)` -> `void`
- `undo()` -> `void`

## `org.telegram.ui.iv.RichEditorListView$BlockButtonEdit`
- `apply(String label, TL_keyboard.InlineButtonType type)` -> `void`
- `exists()` -> `boolean`
- `getLabel()` -> `String`
- `getType()` -> `TL_keyboard.InlineButtonType`

## `org.telegram.ui.iv.RichEditorListView$InlineButtonEdit`
- `apply(TL_keyboard.InlineButtonType type)` -> `void`
- `dismissSelectionUi()` -> `void`
- `getLabel()` -> `String`
- `getType()` -> `TL_keyboard.InlineButtonType`
- `hideSelectionUi()` -> `void`

## `org.telegram.ui.iv.RichEditorToolbar`
- `getAddButton()` -> `ImageView`
- `getBottomContainer()` -> `FrameLayout`
- `getBottomInnerContainer()` -> `FrameLayout`
- `getBottomPanel()` -> `LinearLayout`
- `getEmojiButton()` -> `View`
- `getSendButton()` -> `ChatActivityEnterView.SendButton`
- `onReorderEnd()` -> `void`
- `onReorderMove(float screenX, float screenY)` -> `boolean`
- `onReorderStart()` -> `void`
- `setBackVisible(boolean visible)` -> `void`
- `setBottomGradientTranslationY(float ty)` -> `void`
- `setEmojiOpened(boolean opened)` -> `void`
- `setHistoryEnabled(boolean canUndo, boolean canRedo)` -> `void`
- `setPremiumLocked(boolean locked)` -> `void`
- `setQuoteState(boolean quoted)` -> `void`
- `setSelectedBlockType(int type)` -> `void`
- `setSelectedBlockType(int type, int selectedIcon)` -> `void`
- `setSendEditing(boolean editing)` -> `void`
- `setSendEnabled(boolean enabled)` -> `void`
- `setSendLoading(boolean loading)` -> `void`
- `setTopButtonsOffset(int px)` -> `void`
- `setTopGradientVisible(boolean visible)` -> `void`
- `setTopPanelVisible(boolean visible)` -> `void`
- `showFormattingPanel(boolean formatting, boolean animated)` -> `void`

## `org.telegram.ui.iv.RichHtml`
- `static inlineToHtml(CharSequence styled)` -> `String`
- `static parse(String html)` -> `List<BlockRow>`
- `static parse(String html, Map<Long, TL_iv.RichText> outAuthors)` -> `List<BlockRow>`
- `static preToHtml(CharSequence styled, String language)` -> `String`
- `static serialize(List<BlockRow> rows, int from, int to, int sOff, int eOff)` -> `String`
- `static tableToHtml(TL_iv.pageBlockTable t)` -> `String`

## `org.telegram.ui.iv.RichHtml$ListState`
- `closeAll(StringBuilder out)` -> `void`
- `sync(StringBuilder out, int level, boolean ordered)` -> `void`

## `org.telegram.ui.iv.RichHtml$Node`
- `attr(String k)` -> `String`
- `static el(String t)` -> `Node`
- `has(String k)` -> `boolean`
- `static text(String t)` -> `Node`

## `org.telegram.ui.iv.RichHtml$Parser`
- `parse()` -> `List<Node>`

## `org.telegram.ui.iv.RichInlineButtonSpan`
- `bind(View view, int currentAccount, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `detach(View view)` -> `void`
- `getButton()` -> `TL_iv.textButton`
- `getSize(@NonNull Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm)` -> `int`
- `setPressed(boolean pressed)` -> `void`

## `org.telegram.ui.iv.RichMapCell`
- `bind(BlockRow row, Delegate delegate)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> out)` -> `void`
- `getCaptionEditText()` -> `RichEditText`
- `getRow()` -> `BlockRow`
- `isPressOnCaption(int localX, int localY)` -> `boolean`
- `nestedContentMargin()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `persistCaption()` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.iv.RichMapCell$Delegate`
- `onCaptionChanged(BlockRow row)` -> `default void`
- `onCaptionEnter(BlockRow row)` -> `default void`
- `onCaptionLockedInsert(CharSequence text)` -> `default void`
- `onCaptionSelectAll(BlockRow row)` -> `default boolean`
- `onCaptionSpansChanged(BlockRow row)` -> `default void`
- `onCaptionWillChange(BlockRow row, int removed, int added)` -> `default void`
- `onRequestWindowFocusable(RichEditText et, boolean showKeyboard)` -> `default void`

## `org.telegram.ui.iv.RichMapCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `RichMapCell`
- `isClickable()` -> `boolean`
- `static of(BlockRow row, Delegate delegate)` -> `UItem`

## `org.telegram.ui.iv.RichMathCell`
- `bind(BlockRow row, Delegate delegate)` -> `void`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> out)` -> `void`
- `getRow()` -> `BlockRow`
- `isPressOnMath(int localX, int localY)` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `rebuild()` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.iv.RichMathCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `RichMathCell`
- `isClickable()` -> `boolean`
- `static of(BlockRow row, Delegate delegate)` -> `UItem`

## `org.telegram.ui.iv.RichMediaCell`
- `bind(BlockRow row, Delegate delegate)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> out)` -> `void`
- `getCaptionEditText()` -> `RichEditText`
- `getRow()` -> `BlockRow`
- `isPressOnCaption(int localX, int localY)` -> `boolean`
- `nestedContentMargin()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onModeChanged()` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `persistCaption()` -> `void`
- `refresh()` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.iv.RichMediaCell$Delegate`
- `makeMenu(View anchor)` -> `default ItemOptions`
- `onCaptionChanged(BlockRow row)` -> `default void`
- `onCaptionEnter(BlockRow row)` -> `default void`
- `onCaptionLockedInsert(CharSequence text)` -> `default void`
- `onCaptionSelectAll(BlockRow row)` -> `default boolean`
- `onCaptionSpansChanged(BlockRow row)` -> `default void`
- `onCaptionWillChange(BlockRow row, int removed, int added)` -> `default void`
- `onDeleteMedia(BlockRow row, MediaUploadState media)` -> `default void`
- `onRequestWindowFocusable(RichEditText et, boolean showKeyboard)` -> `default void`
- `onSwitchMode(BlockRow row)` -> `default void`
- `onToggleSpoiler(BlockRow row, MediaUploadState media)` -> `default void`

## `org.telegram.ui.iv.RichMediaCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `contentsEquals(UItem a, UItem b)` -> `boolean`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `RichMediaCell`
- `equals(UItem a, UItem b)` -> `boolean`
- `isClickable()` -> `boolean`
- `static of(BlockRow row, Delegate delegate)` -> `UItem`

## `org.telegram.ui.iv.RichMediaClipboard`
- `static document(long id)` -> `TLRPC.Document`
- `static photo(long id)` -> `TLRPC.Photo`
- `static set(List<TLRPC.Photo> newPhotos, List<TLRPC.Document> newDocuments)` -> `void`

## `org.telegram.ui.iv.RichMediaConverter`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `start()` -> `void`

## `org.telegram.ui.iv.RichMediaConverter$Listener`
- `onProgress(float progress)` -> `default void`

## `org.telegram.ui.iv.RichMediaItem`
- `attach()` -> `void`
- `detach()` -> `void`
- `draw(Canvas canvas, RectF bounds)` -> `void`
- `drawBlurBackground(Canvas canvas, RectF fullBounds)` -> `void`
- `drawSpoiler(Canvas canvas, RectF bounds, SpoilerEffect2 effect, View holder)` -> `void`
- `getHeight()` -> `int`
- `getMedia()` -> `MediaUploadState`
- `getWidth()` -> `int`
- `setMedia(MediaUploadState media)` -> `void`
- `setRoundRadius(int tl, int tr, int br, int bl)` -> `void`

## `org.telegram.ui.iv.RichMediaUploader`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static forAudio(int currentAccount, String path, TLRPC.Document audioDocument, Listener listener)` -> `RichMediaUploader`
- `static forDocument(int currentAccount, String path, TLRPC.Document document, Listener listener)` -> `RichMediaUploader`
- `getPath()` -> `String`
- `start()` -> `void`

## `org.telegram.ui.iv.RichMediaUploader$Listener`
- `onAudioUploaded(TLRPC.Document document)` -> `default void`
- `onDocumentUploaded(TLRPC.Document document)` -> `default void`
- `onError()` -> `default void`
- `onPhotoUploaded(TLRPC.Photo photo)` -> `default void`
- `onProgress(float progress)` -> `default void`
- `onVideoUploaded(TLRPC.Document document)` -> `default void`
- `onWidthHeightResolved(int w, int h)` -> `default void`

## `org.telegram.ui.iv.RichMessageButtonUsers`
- `static collect(int currentAccount, ArrayList<TL_iv.PageBlock> blocks)` -> `ArrayList<TLRPC.InputUser>`

## `org.telegram.ui.iv.RichMessageConvert`
- `static blocksFromCharSequence(CharSequence text)` -> `ArrayList<TL_iv.PageBlock>`
- `static blocksToCharSequence(List<TL_iv.PageBlock> blocks)` -> `CharSequence`
- `static fromCharSequence(CharSequence text)` -> `TL_iv.RichMessage`
- `static rowsToCharSequence(List<BlockRow> rows)` -> `CharSequence`
- `static rowsToSimpleMessage(List<BlockRow> rows)` -> `CharSequence`
- `static toCharSequence(TL_iv.RichMessage msg)` -> `CharSequence`

## `org.telegram.ui.iv.RichTableCell`
- `allSelectedHeader()` -> `boolean`
- `anchorForChildPos(int childPos)` -> `TL_iv.pageTableCell`
- `applyBordered(boolean bordered)` -> `void`
- `applyCompact(boolean compact)` -> `void`
- `applyDeleteColumnsFromSelection()` -> `boolean`
- `applyDeleteRowsFromSelection()` -> `boolean`
- `applyDeleteToSelectedCells()` -> `void`
- `applyHeaderToggle(boolean header)` -> `void`
- `applyHorizontalAlign(int align)` -> `void`
- `applyInsertColumnFromSelection(boolean left)` -> `boolean`
- `applyInsertRowFromSelection(boolean above)` -> `boolean`
- `applyMergeFromSelection()` -> `boolean`
- `applyUnmergeFromSelection()` -> `boolean`
- `applyVerticalAlign(int valign)` -> `void`
- `bind(BlockRow row, Delegate delegate)` -> `void`
- `childCount()` -> `int`
- `childPosForAnchor(TL_iv.pageTableCell cell)` -> `int`
- `childTextLength(int childPos)` -> `int`
- `clearCellSelection()` -> `void`
- `colHandleEnd(int start)` -> `int`
- `commonHorizontalAlign()` -> `int`
- `commonVerticalAlign()` -> `int`
- `dispatchDraw(Canvas canvas)` -> `void`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> out)` -> `void`
- `findCellAt(int localX, int localY)` -> `TL_iv.pageTableCell`
- `findColHandleAt(int localX, int localY)` -> `int`
- `findHostContaining(View focused)` -> `RichTableCellHost`
- `findRowHandleAt(int localX, int localY)` -> `int`
- `focusEdgeCell(boolean last)` -> `boolean`
- `focusFirstCell()` -> `boolean`
- `getGrid()` -> `RichTableCellGrid`
- `getModel()` -> `TableModel`
- `getRow()` -> `BlockRow`
- `getSelectedCells()` -> `Set<TL_iv.pageTableCell>`
- `getTitleEditText()` -> `RichEditText`
- `hideActionModes()` -> `void`
- `invalidate()` -> `void`
- `isEmpty()` -> `boolean`
- `isPressOnText(int localX, int localY)` -> `boolean`
- `isPressOnTitle(int localX, int localY)` -> `boolean`
- `moveFocusByTab(RichTableCellHost from, boolean shift)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onBlockInsetChanged(int px)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `persistTitleFromEditor()` -> `void`
- `refreshAfterModelChange()` -> `void`
- `rowHandleEnd(int start)` -> `int`
- `selectCellRectangle(TL_iv.pageTableCell start, TL_iv.pageTableCell end)` -> `void`
- `selectWholeColumns(int first, int last)` -> `void`
- `selectWholeRows(int first, int last)` -> `void`
- `selectionContainsWholeColumns(int first, int last)` -> `boolean`
- `selectionContainsWholeRows(int first, int last)` -> `boolean`
- `setCellSelectionListener(CellSelectionListener l)` -> `void`
- `setLocked(boolean locked)` -> `void`
- `titleChildPos()` -> `int`
- `toggleCellSelection(TL_iv.pageTableCell cell)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.iv.RichTableCell$Delegate`
- `onLockedInsert(CharSequence text)` -> `default void`
- `onRequestWindowFocusable(RichEditText editText, boolean showKeyboard)` -> `default void`
- `onSelectAll(BlockRow row)` -> `default boolean`
- `onSpansChanged(BlockRow row)` -> `default void`
- `onTextWillChange(BlockRow row, int removed, int added)` -> `default void`

## `org.telegram.ui.iv.RichTableCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `RichTableCell`
- `isClickable()` -> `boolean`
- `static of(BlockRow row, Delegate delegate)` -> `UItem`

## `org.telegram.ui.iv.RichTableCell$ScrollContent`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.iv.RichTableCellGrid`
- `applyColors()` -> `void`
- `colHandleAtGrid(int gx, int gy)` -> `int`
- `colHandleEnd(int start)` -> `int`
- `columnStart(int c)` -> `int`
- `contentBottom()` -> `int`
- `contentRight()` -> `int`
- `dispatchDraw(Canvas canvas)` -> `void`
- `findFocusedCell()` -> `TL_iv.pageTableCell`
- `getModel()` -> `TableModel`
- `hostForAnchor(TL_iv.pageTableCell anchor)` -> `RichTableCellHost`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `rebindAfterModelChange()` -> `void`
- `refreshCompact()` -> `void`
- `rowHandleAtGrid(int gx, int gy)` -> `int`
- `rowHandleEnd(int start)` -> `int`
- `rowStart(int r)` -> `int`
- `setModel(TableModel model)` -> `void`
- `setSelectionProvider(CellSelectionProvider provider)` -> `void`

## `org.telegram.ui.iv.RichTableCellHost`
- `applyHeaderWithDefaultBold(boolean header)` -> `void`
- `bind(TL_iv.pageTableCell cell)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `refreshFromCell()` -> `void`
- `setCompact(boolean compact)` -> `void`
- `setLocked(boolean locked)` -> `void`

## `org.telegram.ui.iv.RichTextCell`
- `static applyStyledTextToBlock(TL_iv.PageBlock block, CharSequence styled)` -> `void`
- `static applyTextToBlock(TL_iv.PageBlock block, String text)` -> `void`
- `bind(BlockRow row, Delegate delegate, boolean forceHint)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `static ensureCaption(TL_iv.PageBlock block)` -> `void`
- `static extractCaption(TL_iv.PageBlock block)` -> `TL_iv.RichText`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> out)` -> `void`
- `finishActionModes()` -> `void`
- `focusAuthorEnd()` -> `void`
- `focusAuthorFromBody()` -> `void`
- `focusBodyFromAuthor()` -> `void`
- `getAuthorEditText()` -> `RichEditText`
- `getEditText()` -> `RichEditText`
- `getRow()` -> `BlockRow`
- `getStyleDelegate()` -> `FloatingToolbar.StyleDelegate`
- `hideActionModes()` -> `void`
- `isAuthorFocused()` -> `boolean`
- `isAuthorVisible()` -> `boolean`
- `isPressOnEmptyEditText(int localX, int localY)` -> `boolean`
- `isPressOnText(int localX, int localY)` -> `boolean`
- `static isQuoteBlock(TL_iv.PageBlock block)` -> `boolean`
- `static newBlockquote()` -> `TL_iv.pageBlockBlockquote`
- `static newEmptyTable(int rowsN, int colsN)` -> `TL_iv.pageBlockTable`
- `static newPullquote()` -> `TL_iv.pageBlockPullquote`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `persistAuthor()` -> `void`
- `persistStyle()` -> `void`
- `rebindInPlace()` -> `void`
- `refreshListVerticalPadding()` -> `void`
- `selectCommand(RichCommand cmd)` -> `void`
- `static setCaption(TL_iv.PageBlock block, TL_iv.RichText rt)` -> `void`
- `setLocked(boolean locked)` -> `void`
- `setShowCommandBackground(boolean show)` -> `void`
- `updateColors()` -> `void`
- `updateLanguage()` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.iv.RichTextCell$CheckBoxView`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`

## `org.telegram.ui.iv.RichTextCell$CollapsedTextPart`
- `updateDrawState(TextPaint tp)` -> `void`

## `org.telegram.ui.iv.RichTextCell$Delegate`
- `getListPaddingBottom(BlockRow row)` -> `default int`
- `getListPaddingTop(BlockRow row)` -> `default int`
- `getOrderedListMarkerWidth(BlockRow row, Paint paint)` -> `default int`
- `onBackspaceAtStart(BlockRow row)` -> `default boolean`
- `onCheckboxToggle(BlockRow row, boolean checked)` -> `default void`
- `onCommand(BlockRow row, int command)` -> `default void`
- `onIndent(BlockRow row, boolean outdent)` -> `default boolean`
- `onLanguageClick(BlockRow row, View button)` -> `default void`
- `onLockedInsert(CharSequence text)` -> `default void`
- `onPaste(BlockRow row, RichEditText editText)` -> `default boolean`
- `onQuoteAuthorEnter(BlockRow row)` -> `default void`
- `onRequestWindowFocusable(RichEditText editText, boolean showKeyboard)` -> `default void`
- `onSelectAll(BlockRow row)` -> `default boolean`
- `onSlashSuggest(RichTextCell cell, String query)` -> `default void`
- `onSpansChanged(BlockRow row)` -> `default void`
- `onTextWillChange(BlockRow row, int removed, int added)` -> `default void`

## `org.telegram.ui.iv.RichTextCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `RichTextCell`
- `isClickable()` -> `boolean`
- `static of(BlockRow row, Delegate delegate, boolean forceHint)` -> `UItem`

## `org.telegram.ui.iv.RichTextStyle`
- `static emojiOnlyCount(CharSequence text)` -> `int`
- `static fromSpannable(CharSequence cs)` -> `TL_iv.RichText`
- `static linkSpan(String url)` -> `URLSpanReplacement`
- `static plainOf(TL_iv.RichText rt)` -> `String`
- `static setStyle(Spannable sb, int from, int to, int flag, boolean add)` -> `void`
- `static setStyle(Spannable sb, int from, int to, int flag, boolean add, TL_iv.PageBlock block)` -> `void`
- `static stylesFullyCovering(CharSequence cs, int from, int to)` -> `int`
- `static toSimpleSpannable(TL_iv.RichText rt, TL_iv.PageBlock block)` -> `CharSequence`
- `static toSpannable(TL_iv.RichText rt)` -> `CharSequence`
- `static toSpannable(TL_iv.RichText rt, TL_iv.PageBlock block)` -> `CharSequence`

## `org.telegram.ui.iv.RichTextStyle$Run`
- `equals(Run o)` -> `boolean`

## `org.telegram.ui.iv.TableModel`
- `static alignOf(TL_iv.pageTableCell cell)` -> `int`
- `anchorAt(int flatIndex)` -> `TL_iv.pageTableCell`
- `anchorColOf(TL_iv.pageTableCell cell)` -> `int`
- `anchorRowOf(TL_iv.pageTableCell cell)` -> `int`
- `anchors()` -> `List<TL_iv.pageTableCell>`
- `static applyPlainText(TL_iv.pageTableCell cell, String text)` -> `void`
- `static applyStyledText(TL_iv.pageTableCell cell, CharSequence styled)` -> `void`
- `flatIndexOfAnchor(TL_iv.pageTableCell cell)` -> `int`
- `insertColumnAt(int idx)` -> `boolean`
- `insertRowAt(int idx)` -> `boolean`
- `mergeCells(Set<TL_iv.pageTableCell> sel)` -> `boolean`
- `static newEmptyCell()` -> `TL_iv.pageTableCell`
- `static normalizeForSend(TL_iv.pageBlockTable t)` -> `void`
- `rebuildFromBlock()` -> `void`
- `static setAlign(TL_iv.pageTableCell cell, int align)` -> `void`
- `static setHeader(TL_iv.pageTableCell cell, boolean header)` -> `void`
- `static setVAlign(TL_iv.pageTableCell cell, int valign)` -> `void`
- `static spanCol(TL_iv.pageTableCell cell)` -> `int`
- `static spanRow(TL_iv.pageTableCell cell)` -> `int`
- `unmergeCell(TL_iv.pageTableCell anchorCell)` -> `boolean`
- `static valignOf(TL_iv.pageTableCell cell)` -> `int`

## `org.telegram.ui.recyclerview.LinearSmoothScrollerCustom`
- `calculateDyToMakeVisible(View view)` -> `int`
- `calculateTimeForDeceleration(int dx)` -> `int`
- `calculateTimeForScrolling(int dx)` -> `int`
- `computeScrollVectorForPosition(int targetPosition)` -> `PointF`
- `onEnd()` -> `void`
- `onSeekTargetStep(int dx, int dy, RecyclerView.State state, Action action)` -> `void`
- `onStart()` -> `void`
- `onStop()` -> `void`
- `onTargetFound(View targetView, RecyclerView.State state, Action action)` -> `void`
- `setOffset(int offset)` -> `void`
- `updateActionForInterimTarget(Action action)` -> `void`

## `org.telegram.ui.recyclerview.LinearSmoothScrollerEnd`
- `calculateDxToMakeVisible(View view)` -> `int`
- `calculateTimeForDeceleration(int dx)` -> `int`
- `calculateTimeForScrolling(int dx)` -> `int`
- `computeScrollVectorForPosition(int targetPosition)` -> `PointF`
- `onSeekTargetStep(int dx, int dy, RecyclerView.State state, Action action)` -> `void`
- `onStart()` -> `void`
- `onStop()` -> `void`
- `onTargetFound(View targetView, RecyclerView.State state, Action action)` -> `void`
- `updateActionForInterimTarget(Action action)` -> `void`

## `org.telegram.ui.web.AddressBarList`
- `static clearRecentSearches(Context context)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `static getLink(MessageObject msg)` -> `String`
- `static getRecentSearches(Context context)` -> `ArrayList<String>`
- `itemClick(UItem item, View view, int position, float x, float y)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `static pushRecentSearch(Context context, String query)` -> `void`
- `setColors(int backgroundColor, int textColor)` -> `void`
- `setInput(String input)` -> `void`
- `setOpenProgress(float progress)` -> `void`
- `setOpened(boolean value)` -> `void`

## `org.telegram.ui.web.AddressBarList$Address2View`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(int type, String query, View.OnClickListener onInsertClick, boolean top, boolean bottom, AddressBarList parent, boolean divider)` -> `void`
- `setAsShowMore(AddressBarList parent)` -> `void`
- `setColors(int backgroundColor, int textColor)` -> `void`
- `setTopBottom(int grayBackgroundColor, int rippleColor, boolean top, boolean bottom)` -> `void`

## `org.telegram.ui.web.AddressBarList$Address2View$Factory`
- `static as(int type, String query, View.OnClickListener onInsertClick, boolean top, boolean bottom, AddressBarList parent)` -> `UItem`
- `static asMore()` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `Address2View`

## `org.telegram.ui.web.AddressBarList$BookmarkView`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(MessageObject messageObject, boolean withArrow, String query, boolean checked, boolean divider)` -> `void`
- `set(BrowserHistory.Entry entry, String query, boolean divider)` -> `void`
- `setChecked(boolean checked)` -> `void`
- `setColors(int backgroundColor, int textColor)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.web.AddressBarList$BookmarkView$Factory`
- `static as(int type, String query, boolean withArrow)` -> `UItem`
- `static as(MessageObject msg, boolean withArrow)` -> `UItem`
- `static as(MessageObject msg, boolean withArrow, String query)` -> `UItem`
- `static as(BrowserHistory.Entry historyEntry, String query)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `contentsEquals(UItem a, UItem b)` -> `boolean`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `BookmarkView`
- `equals(UItem a, UItem b)` -> `boolean`

## `org.telegram.ui.web.AddressBarList$BookmarksList`
- `attach()` -> `void`
- `detach()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`

## `org.telegram.ui.web.BookmarksFragment`
- `clickSelect(UItem item, View view)` -> `void`
- `createView(Context context)` -> `View`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTitle()` -> `CharSequence`
- `gotoMessage()` -> `void`
- `static matches(String src, String q)` -> `boolean`
- `onClick(UItem item, View view, int position, float x, float y)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onLongClick(UItem item, View view, int position, float x, float y)` -> `boolean`
- `setSelected(MessageObject msg, boolean select)` -> `void`

## `org.telegram.ui.web.BotWebViewContainer`
- `d(String s)` -> `void`
- `destroyWebView()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `evaluateJs(String script)` -> `void`
- `evaluateJs(String script, boolean create)` -> `void`
- `getBotProxy()` -> `BotWebViewProxy`
- `static getMainButtonRippleColor(int buttonColor)` -> `int`
- `static getMainButtonRippleDrawable(int buttonColor)` -> `Drawable`
- `getMinHeight()` -> `int`
- `getOriginHost()` -> `String`
- `static getOriginHost(String url)` -> `String`
- `getProxy()` -> `WebViewProxy`
- `getTrustedOrigin()` -> `String`
- `getUrlLoaded()` -> `String`
- `getWebView()` -> `MyWebView`
- `invalidateViewPortHeight()` -> `void`
- `invalidateViewPortHeight(boolean isStable)` -> `void`
- `invalidateViewPortHeight(boolean isStable, boolean force)` -> `void`
- `isBackButtonVisible()` -> `boolean`
- `isBridgeRestrictedToOrigin()` -> `boolean`
- `isPageLoaded()` -> `boolean`
- `static isTonsite(String url)` -> `boolean`
- `static isTonsite(Uri uri)` -> `boolean`
- `static magic2tonsite(String url)` -> `String`
- `notifyEmojiStatusAccess(String status)` -> `void`
- `notifyEvent(String event, JSONObject eventData)` -> `void`
- `notifyThemeChanged()` -> `void`
- `static obj()` -> `JSONObject`
- `static obj(String key1, Object value)` -> `JSONObject`
- `static obj(String key1, Object value, String key2, Object value2)` -> `JSONObject`
- `static obj(String key1, Object value, String key2, Object value2, String key3, Object value3)` -> `JSONObject`
- `static obj(String key1, Object value, String key2, Object value2, String key3, Object value3, String key4, Object value4)` -> `JSONObject`
- `onActivityResult(int requestCode, int resultCode, Intent data)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onBackPressed()` -> `boolean`
- `onDangerousTriggered(DangerousWebWarning warning)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onErrorShown(boolean shown, int errorCode, String description)` -> `void`
- `onFaviconChanged(Bitmap favicon)` -> `void`
- `onMainButtonPressed()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onSecondaryButtonPressed()` -> `void`
- `onSettingsButtonPressed()` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `onTitleChanged(String title)` -> `void`
- `onURLChanged(String url, boolean first, boolean last)` -> `void`
- `onWebViewCreated(MyWebView webView)` -> `void`
- `onWebViewDestroyed(MyWebView webView)` -> `void`
- `preserveWebView()` -> `void`
- `static proxyTON(WebResourceRequest req)` -> `WebResourceResponse`
- `static proxyTON(String method, String url, Map<String, String> headers)` -> `WebResourceResponse`
- `reload()` -> `void`
- `replaceWebView(int currentAccount, MyWebView webView, Object proxy, String url, boolean sameOrigin)` -> `void`
- `reportSafeInsets(Rect insets, int topContentMargin)` -> `void`
- `resetWebView()` -> `void`
- `restoreButtonData()` -> `void`
- `static rotateTONHost(String hostname)` -> `String`
- `setBotUser(TLRPC.User botUser)` -> `void`
- `setDelegate(Delegate delegate)` -> `void`
- `setFlickerViewColor(int bgColor)` -> `void`
- `setForceHeight(int height)` -> `void`
- `setIsBackButtonVisible(boolean visible)` -> `void`
- `setKeyboardFocusable(boolean focusable)` -> `void`
- `setOnCloseRequestedListener(Runnable listener)` -> `void`
- `setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback)` -> `void`
- `setOpener(MyWebView webView)` -> `void`
- `setPageLoaded(String url, boolean animated)` -> `void`
- `setParentActivity(Activity parentActivity)` -> `void`
- `setState(boolean loaded, String url)` -> `void`
- `setViewPortByMeasureSuppressed(boolean viewPortByMeasureSuppressed)` -> `void`
- `setViewPortHeightOffset(float viewPortHeightOffset)` -> `void`
- `setWasOpenedByBot(WebViewRequestProps props)` -> `void`
- `setWasOpenedByLinkIntent(boolean value)` -> `void`
- `setWebViewProgressListener(Consumer<Float> webViewProgressListener)` -> `void`
- `setWebViewScrollListener(WebViewScrollListener webViewScrollListener)` -> `void`
- `showLinkCopiedBulletin()` -> `void`
- `updateFlickerBackgroundColor(int backgroundColor)` -> `void`

## `org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy`
- `postEvent(String eventType, String eventData)` -> `void`
- `setContainer(BotWebViewContainer container)` -> `void`

## `org.telegram.ui.web.BotWebViewContainer$Delegate`
- `getBotSensors()` -> `default BotSensors`
- `getWebAppName()` -> `default String`
- `onCloseToTabs()` -> `default void`
- `onEmojiStatusGranted(boolean granted)` -> `default void`
- `onEmojiStatusSet(TLRPC.Document document)` -> `default void`
- `onFullscreenRequested(boolean fullscreen, boolean blur)` -> `default String`
- `onInstantClose()` -> `default void`
- `onLocationGranted(boolean granted)` -> `default void`
- `onOpenBackFromTabs()` -> `default void`
- `onOrientationLockChanged(boolean locked)` -> `default void`
- `onSendWebViewData(String data)` -> `default void`
- `onSharedTo(ArrayList<Long> dialogIds)` -> `default void`
- `onWebAppBackgroundChanged(boolean actionBarColor, int color)` -> `default void`
- `onWebAppReady()` -> `default void`
- `onWebAppSetNavigationBarColor(int color)` -> `default void`

## `org.telegram.ui.web.BotWebViewContainer$MyWebView`
- `applyCachedMeta(WebMetadataCache.WebMetadata meta)` -> `boolean`
- `clearHistory()` -> `void`
- `d(String s)` -> `void`
- `destroy()` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `draw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `evaluateJS(String script)` -> `void`
- `getFavicon()` -> `Bitmap`
- `getFavicon(String url)` -> `Bitmap`
- `getOpenURL()` -> `String`
- `getScrollProgress()` -> `float`
- `getSearchCount()` -> `int`
- `getSearchIndex()` -> `int`
- `getTitle()` -> `String`
- `getUrl()` -> `String`
- `goBack()` -> `void`
- `goForward()` -> `void`
- `isPageLoaded()` -> `boolean`
- `isUrlDangerous()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onCheckIsTextEditor()` -> `boolean`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onScrollChanged(int l, int t, int oldl, int oldt)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `pauseTimers()` -> `void`
- `postUrl(@NonNull String url, @NonNull byte[] postData)` -> `void`
- `reload()` -> `void`
- `resumeTimers()` -> `void`
- `search(String text, Runnable listener)` -> `void`
- `setCloseListener(Runnable closeListener)` -> `void`
- `setContainers(BotWebViewContainer botWebViewContainer, WebViewScrollListener webViewScrollListener)` -> `void`
- `setFocusable(int focusable)` -> `void`
- `setFocusable(boolean focusable)` -> `void`
- `setFocusableInTouchMode(boolean focusableInTouchMode)` -> `void`
- `setFocusedByDefault(boolean isFocusedByDefault)` -> `void`
- `setScrollProgress(float progress)` -> `void`
- `setScrollX(int value)` -> `void`
- `setScrollY(int value)` -> `void`
- `setTitle(String title)` -> `void`
- `stopLoading()` -> `void`
- `stopNestedScroll()` -> `void`
- `whenPageLoaded(Runnable runnable, long maxDelay)` -> `void`

## `org.telegram.ui.web.BotWebViewContainer$WebViewProxy`
- `postEvent(String type, String data)` -> `void`
- `resolveShare(String json, byte[] file, String fileName, String fileMimeType)` -> `void`
- `setContainer(BotWebViewContainer container)` -> `void`

## `org.telegram.ui.web.HttpGetBitmapTask`
- `doInBackground(String... params)` -> `Bitmap`
- `onPostExecute(Bitmap result)` -> `void`
- `setHeader(String key, String value)` -> `HttpGetBitmapTask`

## `org.telegram.ui.web.HttpGetFileTask`
- `doInBackground(String... params)` -> `File`
- `onPostExecute(File file)` -> `void`
- `setDestFile(File file)` -> `HttpGetFileTask`
- `setMaxSize(long max_size)` -> `HttpGetFileTask`
- `setOverrideExtension(String ext)` -> `HttpGetFileTask`

## `org.telegram.ui.web.HttpGetTask`
- `doInBackground(String... params)` -> `String`
- `onPostExecute(String result)` -> `void`
- `setHeader(String key, String value)` -> `HttpGetTask`

## `org.telegram.ui.web.HttpPostTask`
- `doInBackground(String... params)` -> `String`
- `onPostExecute(String result)` -> `void`
- `setHeader(String key, String value)` -> `HttpPostTask`

## `org.telegram.ui.web.MHTML$Entry`
- `getData()` -> `String`
- `getId()` -> `String`
- `getInputStream()` -> `InputStream`
- `getLocation()` -> `String`
- `getRawInputStream()` -> `InputStream`
- `getTransferEncoding()` -> `String`
- `getType()` -> `String`

## `org.telegram.ui.web.MHTML$HeaderValue`
- `static getProp(HeaderValue headerValue, String name)` -> `String`
- `static getValue(HeaderValue headerValue)` -> `String`

## `org.telegram.ui.web.SearchEngine`
- `extractSuggestions(String json)` -> `ArrayList<String>`
- `getAutocompleteURL(String query)` -> `String`
- `static getCurrent()` -> `SearchEngine`
- `getPrivacyPolicyURL()` -> `String`
- `static getSearchEngines()` -> `ArrayList<SearchEngine>`
- `getSearchURL(String query)` -> `String`

## `org.telegram.ui.web.WebInstantView`
- `static applyAnchor(TL_iv.RichText text, JSONObject tag)` -> `TL_iv.RichText`
- `static filterRecursiveAnchorLinks(TL_iv.RichText text, String url, String anchor)` -> `TL_iv.RichText`
- `static generate(WebView webView, boolean unsafe, Utilities.Callback<WebInstantView> whenDone)` -> `Runnable`
- `getHTML(WebView webView, boolean unsafe, Utilities.Callback<InputStream> whenDone)` -> `void`
- `parseDetails(String url, JSONObject details, TL_iv.TL_page page)` -> `TL_iv.pageBlockDetails`
- `parseFigure(JSONObject figure, TL_iv.TL_page page)` -> `TL_iv.pageBlockPhoto`
- `parseImage(JSONObject img, TL_iv.TL_page page)` -> `TL_iv.pageBlockPhoto`
- `parseInlineImage(JSONObject o, TL_iv.TL_page page)` -> `TL_iv.textImage`
- `parseJSON(String url, JSONObject root)` -> `TLRPC.TL_webPage`
- `parseList(String url, JSONObject json, TL_iv.TL_page page)` -> `TL_iv.PageBlock`
- `parsePage(String url, JSONObject parsed)` -> `TL_iv.TL_page`
- `parsePageBlocks(String url, JSONArray json, TL_iv.TL_page page)` -> `ArrayList<TL_iv.PageBlock>`
- `parseRichText(JSONObject tag, TL_iv.TL_page page)` -> `TL_iv.RichText`
- `parseRichText(JSONArray json, TL_iv.TL_page page)` -> `TL_iv.RichText`
- `static parseRichText(String str)` -> `TL_iv.RichText`
- `parseTable(String url, JSONObject json, TL_iv.TL_page page)` -> `TL_iv.pageBlockTable`
- `parseTableRow(String url, JSONObject tr_json, TL_iv.TL_page page)` -> `TL_iv.pageTableRow`
- `parseTableRows(String url, JSONArray table_content, TL_iv.TL_page page)` -> `ArrayList<TL_iv.pageTableRow>`
- `recycle()` -> `void`
- `static recycle(TLRPC.WebPage webPage)` -> `void`
- `static trim(TL_iv.RichText text)` -> `TL_iv.RichText`
- `static trimEnd(TL_iv.RichText text)` -> `TL_iv.RichText`
- `static trimStart(TL_iv.RichText text)` -> `TL_iv.RichText`

## `org.telegram.ui.web.WebInstantView$Loader`
- `getWebPage()` -> `TLRPC.WebPage`
- `listen(Runnable whenUpdated)` -> `Runnable`
- `recycle()` -> `void`
- `retryLocal(BotWebViewContainer.MyWebView webView)` -> `void`
- `start(BotWebViewContainer.MyWebView webView)` -> `void`

## `org.telegram.ui.web.WebMetadataCache`
- `clear()` -> `void`
- `get(String domain)` -> `WebMetadata`
- `getCacheFile()` -> `File`
- `static getInstance()` -> `WebMetadataCache`
- `scheduleSave()` -> `void`

## `org.telegram.ui.web.WebMetadataCache$MetadataFile`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.ui.web.WebMetadataCache$WebMetadata`
- `static from(BotWebViewContainer.MyWebView webView)` -> `WebMetadata`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.utils.code.highlight.CodeHighlighting$SyntaxFontSpan`
- `updateDrawState(TextPaint paint)` -> `void`
