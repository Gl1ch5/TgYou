# visual / emoji (1383 методов)

## `org.telegram.messenger.CompoundEmoji`
- `static setPlaceholderColor(int color)` -> `void`

## `org.telegram.messenger.CompoundEmoji$CompoundEmojiDrawable`
- `draw(Canvas canvas)` -> `void`
- `getDrawRect()` -> `Rect`
- `getOpacity()` -> `int`
- `isLoaded()` -> `boolean`
- `preload()` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(ColorFilter cf)` -> `void`
- `update(int skinTone1, int skinTone2)` -> `void`

## `org.telegram.messenger.CompoundEmoji$DrawableInfo`
- `getBitmap()` -> `Bitmap`

## `org.telegram.messenger.Emoji`
- `static invalidateAll(View view)` -> `void`

## `org.telegram.messenger.Emoji$EmojiDrawable`
- `isLoaded()` -> `boolean`
- `preload()` -> `void`

## `org.telegram.messenger.Emoji$EmojiSpan`
- `draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint)` -> `void`
- `setMinimumLineHeight(int minimumLineHeight)` -> `EmojiSpan`
- `setPreserveFontMetrics(boolean preserveFontMetrics)` -> `EmojiSpan`

## `org.telegram.messenger.Emoji$SimpleEmojiDrawable`
- `draw(Canvas canvas)` -> `void`
- `getDrawRect()` -> `Rect`
- `getDrawableInfo()` -> `DrawableInfo`
- `getOpacity()` -> `int`
- `isLoaded()` -> `boolean`
- `preload()` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(ColorFilter cf)` -> `void`

## `org.telegram.ui.Cells.AnimatedStatusView`
- `animateChange(ReactionsLayoutInBubble.VisibleReaction react)` -> `void`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setColor(int color)` -> `void`
- `translate(float x, float y)` -> `void`
- `translateY2(float y)` -> `void`

## `org.telegram.ui.Cells.AvailableReactionCell`
- `bind(TLRPC.TL_availableReaction react, boolean checked, int currentAccount)` -> `void`
- `isChecked()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`

## `org.telegram.ui.Cells.EditEmojiTextCell`
- `emojiCacheType()` -> `int`
- `getText()` -> `CharSequence`
- `hideKeyboardOnEnter()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onFocusChanged(boolean focused)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTextChanged(CharSequence newText)` -> `void`
- `setAllowEntities(boolean allow)` -> `EditEmojiTextCell`
- `setDivider(boolean divider)` -> `void`
- `setEmojiViewCacheType(int cacheType)` -> `void`
- `setShowLimitOnFocus(boolean show)` -> `void`
- `setShowLimitWhenEmpty(boolean show)` -> `void`
- `setShowLimitWhenNear(int near)` -> `void`
- `setText(CharSequence text)` -> `void`
- `validate()` -> `boolean`
- `whenHitEnter(Runnable whenEnter)` -> `void`

## `org.telegram.ui.Cells.EmojiReplacementCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getEmoji()` -> `String`
- `invalidate()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setEmoji(String e, int side)` -> `void`

## `org.telegram.ui.ChatReactionsEditActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `setInfo(TLRPC.ChatFull info)` -> `void`

## `org.telegram.ui.Components.AnimatedArrowDrawable`
- `draw(Canvas c)` -> `void`
- `getAnimationProgress()` -> `float`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setAnimationProgress(float progress)` -> `void`
- `setAnimationProgressAnimated(float progress)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.AnimatedAvatarContainer`
- `getSubtitleTextView()` -> `AnimatedTextView`
- `getTitle()` -> `AnimatedTextView`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Components.AnimatedEmojiDrawable`
- `clear()` -> `void`
- `draw(@NonNull Canvas canvas)` -> `void`
- `draw(Canvas canvas, Rect drawableBounds, float alpha)` -> `void`
- `draw(Canvas canvas, ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder, boolean canTranslate)` -> `void`
- `static dropGlobalEmojiCache()` -> `void`
- `static findDocument(int account, long documentId)` -> `TLRPC.Document`
- `static findStickerSet(int account, long documentId)` -> `TLRPC.InputStickerSet`
- `getAlpha()` -> `int`
- `static getCacheTypeForEnterView()` -> `int`
- `getDocument()` -> `TLRPC.Document`
- `static getDocumentFetcher(int account)` -> `EmojiDocumentFetcher`
- `getDocumentId()` -> `long`
- `static getDominantColor(AnimatedEmojiDrawable yourDrawable)` -> `int`
- `getImageReceiver()` -> `ImageReceiver`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `invalidate()` -> `void`
- `isDefaultStatusEmoji()` -> `boolean`
- `static isDefaultStatusEmoji(Drawable drawable)` -> `boolean`
- `static isDefaultStatusEmoji(AnimatedEmojiDrawable drawable)` -> `boolean`
- `static make(int account, int cacheType, long documentId)` -> `AnimatedEmojiDrawable`
- `static make(int account, int cacheType, long documentId, String absolutePath)` -> `AnimatedEmojiDrawable`
- `static make(int account, int cacheType, @NonNull TLRPC.Document document)` -> `AnimatedEmojiDrawable`
- `preload()` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setTime(long time)` -> `void`
- `setupDocument(TLRPC.Document document)` -> `void`
- `setupEmojiThumb(String emoji)` -> `void`
- `toString()` -> `String`
- `static toggleAnimations(int currentAccount, boolean enabled)` -> `void`
- `update(long time)` -> `void`
- `static updateAll()` -> `void`
- `static updatePlaceholderPaintColor()` -> `void`

## `org.telegram.ui.Components.AnimatedEmojiDrawable$EmojiDocumentFetcher`
- `findStickerSet(long documentId)` -> `TLRPC.InputStickerSet`
- `setUiDbCallback(Runnable uiDbCallback)` -> `void`

## `org.telegram.ui.Components.AnimatedEmojiDrawable$SwapAnimatedEmojiDrawable`
- `attach()` -> `void`
- `detach()` -> `void`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getColor()` -> `Integer`
- `getDrawable()` -> `Drawable`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `invalidate()` -> `void`
- `isEmpty()` -> `boolean`
- `isNotEmpty()` -> `float`
- `isStable()` -> `boolean`
- `offset(int ox, int oy)` -> `void`
- `play()` -> `void`
- `resetAnimation()` -> `void`
- `set(long documentId, boolean animated)` -> `boolean`
- `set(long documentId, int cacheType, boolean animated)` -> `boolean`
- `set(TLRPC.Document document, boolean animated)` -> `void`
- `set(TLRPC.Document document, int cacheType, boolean animated)` -> `void`
- `set(Drawable drawable, boolean animated)` -> `void`
- `setAlpha(int i)` -> `void`
- `setColor(Integer color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setCurrentAccount(int account)` -> `void`
- `setParentView(View parentView)` -> `void`
- `setParticles(boolean show, boolean animated)` -> `void`
- `setResourcesProvider(Theme.ResourcesProvider resourcesProvider)` -> `void`
- `setSecondParent(View secondParent)` -> `void`

## `org.telegram.ui.Components.AnimatedEmojiDrawable$WrapSizeDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getDrawable()` -> `Drawable`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.AnimatedEmojiSpan`
- `applyFontMetrics(Paint.FontMetricsInt newMetrics, int cacheType)` -> `void`
- `applyFontMetrics(Paint.FontMetricsInt newMetrics)` -> `void`
- `static applyFontMetricsForString(CharSequence text, Paint textPaint)` -> `void`
- `static cloneSpan(AnimatedEmojiSpan span, Paint.FontMetricsInt fontMetricsInt)` -> `AnimatedEmojiSpan`
- `static cloneSpans(CharSequence text)` -> `CharSequence`
- `static cloneSpans(CharSequence text, int newCacheType)` -> `CharSequence`
- `static cloneSpans(CharSequence text, int newCacheType, Paint.FontMetricsInt fontMetricsInt)` -> `CharSequence`
- `static cloneSpans(CharSequence text, int newCacheType, Paint.FontMetricsInt fontMetricsInt, float scale)` -> `CharSequence`
- `draw(@NonNull Canvas canvas, CharSequence charSequence, int start, int end, float x, int top, int y, int bottom, @NonNull Paint paint)` -> `void`
- `static drawAnimatedEmojis(Canvas canvas, Layout layout, EmojiGroupedSpans stack, float offset, List<SpoilerEffect> spoilers, float boundTop, float boundBottom, float drawingYOffset, float alpha)` -> `void`
- `static drawAnimatedEmojis(Canvas canvas, Layout layout, EmojiGroupedSpans stack, float offset, List<SpoilerEffect> spoilers, float boundTop, float boundBottom, float drawingYOffset, float alpha, ColorFilter colorFilter)` -> `void`
- `getDocumentId()` -> `long`
- `getExtraScale()` -> `float`
- `getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm)` -> `int`
- `static onlyEmojiSpans(CharSequence text)` -> `CharSequence`
- `static release(View holder, LongSparseArray<AnimatedEmojiDrawable> arr)` -> `void`
- `static release(View holder, EmojiGroupedSpans spans)` -> `void`
- `replaceFontMetrics(Paint.FontMetricsInt newMetrics)` -> `void`
- `replaceFontMetrics(Paint.FontMetricsInt newMetrics, int newSize, int cacheType)` -> `void`
- `setAdded()` -> `void`
- `setAnimateChanges()` -> `void`
- `setMinimumLineHeight(int minimumLineHeight)` -> `AnimatedEmojiSpan`
- `setPreserveFontMetrics(boolean preserveFontMetrics)` -> `AnimatedEmojiSpan`
- `setRemoved(Runnable action)` -> `void`
- `setSize(int size)` -> `AnimatedEmojiSpan`
- `static update(int cacheType, View view, EmojiGroupedSpans prev, ArrayList<MessageObject.TextLayoutBlock> blockLayouts)` -> `EmojiGroupedSpans`
- `static update(int cacheType, View view, EmojiGroupedSpans prev, ArrayList<MessageObject.TextLayoutBlock> blockLayouts, boolean clone)` -> `EmojiGroupedSpans`
- `static update(int cacheType, View view, boolean invalidateParent, EmojiGroupedSpans prev, ArrayList<MessageObject.TextLayoutBlock> blockLayouts)` -> `EmojiGroupedSpans`
- `static update(int cacheType, View view, boolean invalidateParent, EmojiGroupedSpans prev, ArrayList<MessageObject.TextLayoutBlock> blockLayouts, boolean clone)` -> `EmojiGroupedSpans`
- `static update(int cacheType, View view, EmojiGroupedSpans prev, Layout... layouts)` -> `EmojiGroupedSpans`
- `static update(int cacheType, View view, boolean invalidateParent, EmojiGroupedSpans prev, Layout... layouts)` -> `EmojiGroupedSpans`
- `static update(int cacheType, View view, boolean invalidateParent, EmojiGroupedSpans prev, boolean clone, Layout... layouts)` -> `EmojiGroupedSpans`
- `static update(View holder, AnimatedEmojiSpan[] spans, LongSparseArray<AnimatedEmojiDrawable> prev)` -> `LongSparseArray<AnimatedEmojiDrawable>`
- `static update(int cacheType, View holder, AnimatedEmojiSpan[] spans, LongSparseArray<AnimatedEmojiDrawable> prev)` -> `LongSparseArray<AnimatedEmojiDrawable>`
- `static update(View holder, ArrayList<AnimatedEmojiSpan> spans, LongSparseArray<AnimatedEmojiDrawable> prev)` -> `LongSparseArray<AnimatedEmojiDrawable>`
- `static update(int cacheType, View holder, ArrayList<AnimatedEmojiSpan> spans, LongSparseArray<AnimatedEmojiDrawable> prev)` -> `LongSparseArray<AnimatedEmojiDrawable>`

## `org.telegram.ui.Components.AnimatedEmojiSpan$AnimatedEmojiHolder`
- `draw(Canvas canvas, long time, float boundTop, float boundBottom, float alpha, ColorFilter colorFilter)` -> `void`
- `invalidate()` -> `void`
- `outOfBounds(float boundTop, float boundBottom)` -> `boolean`
- `prepareForBackgroundDraw(long updateTime, int threadIndex)` -> `void`
- `releaseDrawInBackground(int threadIndex)` -> `void`

## `org.telegram.ui.Components.AnimatedEmojiSpan$EmojiGroupedSpans`
- `clearPositions()` -> `void`
- `recordPositions(boolean record)` -> `void`
- `release()` -> `void`
- `replaceLayout(Layout newText, Layout oldText)` -> `void`

## `org.telegram.ui.Components.AnimatedEmojiSpan$SpansChunk`
- `draw(Canvas canvas, List<SpoilerEffect> spoilers, long time, float boundTop, float boundBottom, float drawingYOffset, float alpha, ColorFilter colorFilter)` -> `void`
- `release()` -> `void`

## `org.telegram.ui.Components.AnimatedEmojiSpan$TextViewEmojis`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setCacheType(int cacheType)` -> `void`
- `setEmojiColor(int emojiColor)` -> `void`
- `setText(CharSequence text, TextView.BufferType type)` -> `void`

## `org.telegram.ui.Components.AnimatedFileBuffer`
- `getShader(int index)` -> `BitmapShader`
- `static of(int width, int height)` -> `AnimatedFileBuffer`
- `static of(Bitmap bitmap)` -> `AnimatedFileBuffer`
- `recycle()` -> `void`

## `org.telegram.ui.Components.AnimatedFileDrawable`
- `decoderFailed()` -> `boolean`
- `draw(Canvas canvas)` -> `void`
- `drawInBackground(Canvas canvas, float x, float y, float w, float h, int alpha, ColorFilter colorFilter, int threadIndex)` -> `void`
- `drawInternal(Canvas canvas, boolean drawInBackground, long currentTime, int threadIndex)` -> `void`
- `estimateSizeInCache()` -> `int`
- `finalize()` -> `void`
- `getAnimatedBitmap()` -> `Bitmap`
- `getBackgroundBitmap()` -> `Bitmap`
- `getCurrentProgress()` -> `float`
- `getCurrentProgressMs()` -> `int`
- `getDurationMs()` -> `int`
- `getFilePath()` -> `File`
- `getFirstFrame(Bitmap bitmap)` -> `Bitmap`
- `getFps()` -> `int`
- `getFrameAtTime(long ms)` -> `Bitmap`
- `getFrameAtTime(long ms, boolean precise)` -> `Bitmap`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getLastFrameTimestamp()` -> `long`
- `getMinimumHeight()` -> `int`
- `getMinimumWidth()` -> `int`
- `getNextFrame(boolean loop)` -> `Bitmap`
- `getNextFrame(Bitmap bitmap)` -> `int`
- `getOpacity()` -> `int`
- `getOrientation()` -> `int`
- `getProgressMs()` -> `int`
- `getStartTime()` -> `long`
- `invalidateInternal()` -> `void`
- `isLoadingStream()` -> `boolean`
- `isRecycled()` -> `boolean`
- `isRunning()` -> `boolean`
- `makeCopy()` -> `AnimatedFileDrawable`
- `onBoundsChange(Rect bounds)` -> `void`
- `prepareForGenerateCache()` -> `void`
- `recycle()` -> `void`
- `releaseForGenerateCache()` -> `void`
- `replaceAnimatedBitmap(Bitmap b)` -> `void`
- `resetStream(boolean stop)` -> `void`
- `seekTo(long ms, boolean removeLoading)` -> `void`
- `seekTo(long ms, boolean removeLoading, boolean force)` -> `void`
- `seekToSync(long ms)` -> `void`
- `setActualDrawRect(float x, float y, float width, float height)` -> `void`
- `setAllowDecodeSingleFrame(boolean value)` -> `void`
- `setInvalidateParentViewWithSecond(boolean value)` -> `void`
- `setIsWebmSticker(boolean b)` -> `void`
- `setLimitFps(boolean limitFps)` -> `void`
- `setParentView(View view)` -> `void`
- `setRoundRadius(int[] value)` -> `void`
- `setStartEndTime(long startTime, long endTime)` -> `void`
- `setUseSharedQueue(boolean value)` -> `void`
- `skipNextFrame(boolean loop)` -> `void`
- `start()` -> `void`
- `stop()` -> `void`
- `updateCurrentFrame(long now, boolean b)` -> `void`

## `org.telegram.ui.Components.AnimatedFileNative`
- `static createDecoderFrom(String src, int[] params, int account, long streamFileSize, AnimatedFileDrawableStream readCallback, boolean preview)` -> `AnimatedFileNative`
- `finalize()` -> `void`
- `getDuration(TimeUnit timeUnit)` -> `int`
- `getFps()` -> `int`
- `getFrameAtTime(long ms, Bitmap bitmap)` -> `int`
- `getHeight()` -> `int`
- `getProgress(TimeUnit timeUnit)` -> `int`
- `getRotation()` -> `int`
- `getVideoFrame(Bitmap bitmap, boolean preview, float startTimeSeconds, float endTimeSeconds, boolean loop)` -> `int`
- `static getVideoInfo(String src, int[] params, long fileOffset)` -> `void`
- `getWidth()` -> `int`
- `prepareToSeek()` -> `void`
- `recycle()` -> `void`
- `seekToMs(long ms, boolean precise)` -> `void`
- `stopDecoder()` -> `void`

## `org.telegram.ui.Components.AnimatedFloat`
- `force(float value)` -> `void`
- `force(boolean value)` -> `void`
- `get()` -> `float`
- `getDuration()` -> `long`
- `getTargetValue()` -> `float`
- `getTransitionProgress()` -> `float`
- `getTransitionProgressInterpolated()` -> `float`
- `getValue()` -> `float`
- `set(float mustBe)` -> `float`
- `set(boolean mustBe)` -> `float`
- `set(boolean mustBe, boolean force)` -> `float`
- `set(float mustBe, boolean force)` -> `float`
- `setDelay(long delay)` -> `void`
- `setDuration(long duration)` -> `void`
- `setInvalidate(Runnable invalidate)` -> `void`
- `setParent(View parent)` -> `void`

## `org.telegram.ui.Components.AnimatedLinearLayout`
- `calculateTotalSizesAfterMeasure()` -> `void`
- `getAnimatedHeightWithPadding(float padding)` -> `float`
- `getAnimatedHeightWithPadding()` -> `float`
- `getEntriesCount()` -> `int`
- `getEntry(int index)` -> `ListAnimator.Entry<Holder>`
- `getMetadata()` -> `ListAnimator.Metadata`
- `getSumHeightOfAllVisibleChild()` -> `int`
- `getSumWidthOfAllVisibleChild()` -> `int`
- `isViewVisible(View child)` -> `boolean`
- `onItemsChanged()` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onViewAdded(View child)` -> `void`
- `onViewRemoved(View child)` -> `void`
- `setChildVisibilityFactor(View view, float factor)` -> `void`
- `setDebugName(View child, String tag)` -> `void`
- `setOnAnimatedHeightChangedListener(Runnable onAnimatedHeightChanged)` -> `void`
- `setPriority(View child, int priority)` -> `void`
- `setViewVisible(View child, boolean visible)` -> `void`
- `setViewVisible(View child, boolean visible, boolean animated)` -> `void`

## `org.telegram.ui.Components.AnimatedLinearLayout$Holder`
- `equals(@Nullable Object obj)` -> `boolean`
- `getHeight()` -> `int`
- `getWidth()` -> `int`
- `performDestroy()` -> `void`

## `org.telegram.ui.Components.AnimatedNumberLayout`
- `draw(Canvas canvas)` -> `void`
- `getWidth()` -> `int`
- `setNumber(int number, boolean animated)` -> `void`

## `org.telegram.ui.Components.AnimatedPaint`
- `blendTo(int color, float t)` -> `AnimatedPaint`
- `force(int color)` -> `AnimatedPaint`
- `multAlpha(float alpha)` -> `AnimatedPaint`
- `set(int color)` -> `AnimatedPaint`
- `set(int color, float alpha)` -> `AnimatedPaint`
- `setByKey(int colorKey)` -> `AnimatedPaint`
- `setByKey(int colorKey, float alpha)` -> `AnimatedPaint`

## `org.telegram.ui.Components.AnimatedPhoneNumberEditText`
- `getHintText()` -> `String`
- `getProgress()` -> `float`
- `onDraw(Canvas canvas)` -> `void`
- `onPreDrawHintCharacter(int index, Canvas canvas, float pivotX, float pivotY)` -> `void`
- `onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter)` -> `void`
- `setHintText(String value)` -> `void`
- `setNewText(String text)` -> `void`
- `setProgress(float value)` -> `void`
- `setTextColor(int color)` -> `void`
- `setTextSize(int unit, float size)` -> `void`

## `org.telegram.ui.Components.AnimatedPhoneNumberEditText$HintFadeProperty`
- `getValue(Integer object)` -> `float`
- `setValue(Integer object, float value)` -> `void`

## `org.telegram.ui.Components.AnimatedTextView`
- `finalWidth()` -> `int`
- `getDrawable()` -> `AnimatedTextDrawable`
- `getPaint()` -> `TextPaint`
- `getRightPadding()` -> `float`
- `getSizeableBackground()` -> `Drawable`
- `getText()` -> `CharSequence`
- `getTextColor()` -> `int`
- `getTextHeight()` -> `int`
- `invalidateDrawable(@NonNull Drawable drawable)` -> `void`
- `isAnimating()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAllowCancel(boolean allow)` -> `void`
- `setAnimationProperties(float moveAmplitude, long startDelay, long duration, TimeInterpolator interpolator)` -> `void`
- `setAnimationProperties(float moveAmplitude, long startDelay, long duration, float wave, TimeInterpolator interpolator)` -> `void`
- `setEllipsizeByGradient(boolean enabled)` -> `void`
- `setEmojiCacheType(int cacheType)` -> `void`
- `setEmojiColor(int color)` -> `void`
- `setEmojiColor(int color, boolean animated)` -> `void`
- `setEmojiColorFilter(ColorFilter emojiColorFilter)` -> `void`
- `setGravity(int gravity)` -> `void`
- `setHideBackgroundIfEmpty(boolean hideBackgroundIfEmpty)` -> `void`
- `setIgnoreRTL(boolean value)` -> `void`
- `setIncludeFontPadding(boolean includeFontPadding)` -> `void`
- `setMaxWidth(int width)` -> `void`
- `setOnWidthUpdatedListener(Runnable listener)` -> `void`
- `setRightPadding(float rightPadding)` -> `void`
- `setScaleProperty(float scale)` -> `void`
- `setSizeableBackground(Drawable drawable)` -> `void`
- `setText(CharSequence text)` -> `void`
- `setText(CharSequence text, boolean animated)` -> `void`
- `setText(CharSequence text, boolean animated, boolean moveDown)` -> `void`
- `setTextColor(int color)` -> `void`
- `setTextColor(int color, boolean animated)` -> `void`
- `setTextSize(float textSizePx)` -> `void`
- `setTypeface(Typeface typeface)` -> `void`
- `width()` -> `int`

## `org.telegram.ui.Components.AnimatedTextView$AnimatedTextDrawable`
- `copyStylesFrom(TextPaint paint)` -> `void`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getAnimateToWidth()` -> `float`
- `getCurrentWidth()` -> `float`
- `getDirtyBounds()` -> `Rect`
- `getGravity()` -> `int`
- `getHeight()` -> `float`
- `getMaxWidth(AnimatedTextDrawable otherTextDrawable)` -> `float`
- `getOpacity()` -> `int`
- `getPaint()` -> `TextPaint`
- `getRightPadding()` -> `float`
- `getText()` -> `CharSequence`
- `getTextColor()` -> `int`
- `getTextSize()` -> `float`
- `getWidth()` -> `float`
- `isAnimating()` -> `boolean`
- `isNotEmpty()` -> `float`
- `static partEquals(CharSequence a, CharSequence b, int aIndex, int bIndex)` -> `boolean`
- `setAllowCancel(boolean allowCancel)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setAnimationProperties(float moveAmplitude, long startDelay, long duration, TimeInterpolator interpolator)` -> `void`
- `setAnimationProperties(float moveAmplitude, long startDelay, long duration, float wave, TimeInterpolator interpolator)` -> `void`
- `setBounds(@NonNull Rect bounds)` -> `void`
- `setBounds(@NonNull RectF bounds)` -> `void`
- `setBounds(int left, int top, int right, int bottom)` -> `void`
- `setBounds(float left, float top, float right, float bottom)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setEllipsizeByGradient(boolean enabled)` -> `void`
- `setEmojiCacheType(int cacheType)` -> `void`
- `setEmojiColor(int emojiColor)` -> `void`
- `setEmojiColor(int color, boolean animated)` -> `void`
- `setEmojiColorFilter(ColorFilter colorFilter)` -> `void`
- `setGravity(int gravity)` -> `void`
- `setHacks(boolean splitByWords, boolean preserveIndex, boolean startFromEnd)` -> `void`
- `setHacks(boolean splitByWords, boolean preserveIndex, boolean startFromEnd, boolean enforceByLetter)` -> `void`
- `setHacks(boolean splitByWords, boolean preserveIndex, boolean startFromEnd, boolean enforceByLetter, boolean startEndDiff)` -> `void`
- `setIncludeFontPadding(boolean includeFontPadding)` -> `void`
- `setOnAnimationFinishListener(Runnable listener)` -> `void`
- `setOnWidthUpdatedListener(Runnable listener)` -> `void`
- `setOverrideFullWidth(int value)` -> `void`
- `setRightPadding(float rightPadding)` -> `void`
- `setScaleProperty(float scale)` -> `void`
- `setShadowLayer(float radius, float dx, float dy, int shadowColor)` -> `void`
- `setSplitByWords(boolean b)` -> `void`
- `setText(CharSequence text)` -> `void`
- `setText(CharSequence text, boolean animated)` -> `void`
- `setText(CharSequence text, boolean animated, boolean moveDown)` -> `void`
- `setTextColor(int color)` -> `void`
- `setTextColor(int color, boolean animated)` -> `void`
- `setTextSize(float textSizePx)` -> `void`
- `setTypeface(Typeface typeface)` -> `void`

## `org.telegram.ui.Components.AnimatedTextView$AnimatedTextDrawable$Part`
- `detach()` -> `void`
- `draw(Canvas canvas, float alpha)` -> `void`
- `layout(float offset)` -> `void`

## `org.telegram.ui.Components.AnimatedTextView$AnimatedTextDrawable$WordSequence`
- `charAt(int i)` -> `char`
- `chars()` -> `IntStream`
- `codePoints()` -> `IntStream`
- `length()` -> `int`
- `subSequence(int from, int to)` -> `CharSequence`
- `toCharSequence()` -> `CharSequence`
- `toString()` -> `String`
- `wordAt(int i)` -> `CharSequence`

## `org.telegram.ui.Components.Bulletin$LottieLayoutWithReactions`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getMeasuredBackgroundHeight()` -> `int`
- `hideReactionsDialog()` -> `void`
- `init()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setBulletin(Bulletin b)` -> `void`

## `org.telegram.ui.Components.Bulletin$ProgressTwoLineAnimatedTitleLottieLayout`
- `getAccessibilityText()` -> `CharSequence`
- `hideImage()` -> `void`
- `onShow()` -> `void`
- `setAnimation(int resId, String... layers)` -> `void`
- `setAnimation(int resId, int w, int h, String... layers)` -> `void`
- `setAnimation(TLRPC.Document document, int w, int h, String... layers)` -> `void`
- `setProgress(float progress)` -> `void`

## `org.telegram.ui.Components.Bulletin$TwoLineAnimatedLottieLayout`
- `getAccessibilityText()` -> `CharSequence`
- `hideImage()` -> `void`
- `onShow()` -> `void`
- `setAnimation(int resId, String... layers)` -> `void`
- `setAnimation(int resId, int w, int h, String... layers)` -> `void`
- `setSubtitle(CharSequence text, boolean animated)` -> `void`

## `org.telegram.ui.Components.ClickableAnimatedTextView`
- `getClickBounds()` -> `Rect`
- `onDraw(Canvas canvas)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBackground(Drawable background)` -> `void`
- `setBackgroundDrawable(Drawable background)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Components.EditTextEmoji`
- `allowEmojisForNonPremium(boolean allow)` -> `void`
- `allowEntities()` -> `boolean`
- `allowSearch()` -> `boolean`
- `allowSearchAnimation()` -> `boolean`
- `bottomPanelTranslationY(float translation)` -> `void`
- `closeKeyboard()` -> `void`
- `closeParent()` -> `void`
- `collapseEmojiView()` -> `void`
- `createEmojiView()` -> `void`
- `customEmojiButtonDraw(Canvas canvas, View button, Drawable drawable)` -> `boolean`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `drawEmojiBackground(Canvas canvas, View view)` -> `void`
- `emojiCacheType()` -> `int`
- `extendActionMode(ActionMode actionMode, Menu menu)` -> `void`
- `getEditText()` -> `EditTextCaption`
- `getEmojiButton()` -> `View`
- `getEmojiPadding()` -> `int`
- `getEmojiPaddingShown()` -> `float`
- `getEmojiView()` -> `EmojiView`
- `getKeyboardHeight()` -> `int`
- `getText()` -> `Editable`
- `hideEmojiView()` -> `void`
- `hidePopup(boolean byBackButton)` -> `void`
- `isAnimatePopupClosing()` -> `boolean`
- `isKeyboardVisible()` -> `boolean`
- `isPopupShowing()` -> `boolean`
- `isPopupView(View view)` -> `boolean`
- `isPopupVisible()` -> `boolean`
- `isWaitingForKeyboardOpen()` -> `boolean`
- `length()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDestroy()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLineCountChanged(int oldLineCount, int newLineCount)` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onScrollYChange(int scrollY)` -> `boolean`
- `onSizeChanged(int height, boolean isWidthGreater)` -> `void`
- `onWaitingForKeyboard()` -> `void`
- `openKeyboard()` -> `void`
- `openKeyboardInternal()` -> `void`
- `setAdjustPanLayoutHelper(AdjustPanLayoutHelper adjustPanLayoutHelper)` -> `void`
- `setDelegate(EditTextEmojiDelegate editTextEmojiDelegate)` -> `void`
- `setEmojiViewCacheType(int cacheType)` -> `void`
- `setEnabled(boolean enabled)` -> `void`
- `setFilters(InputFilter[] filters)` -> `void`
- `setFocusable(boolean focusable)` -> `void`
- `setHint(CharSequence hint)` -> `void`
- `setMaxLines(int value)` -> `void`
- `setSelection(int selection)` -> `void`
- `setSelection(int from, int to)` -> `void`
- `setSizeNotifierLayout(SizeNotifierFrameLayout layout)` -> `void`
- `setSuggestionsEnabled(boolean enabled)` -> `void`
- `setText(CharSequence text)` -> `void`
- `showPopup(int show)` -> `void`
- `updateColors()` -> `void`
- `updatedEmojiExpanded()` -> `void`

## `org.telegram.ui.Components.EmojiPacksAlert`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `getContainerViewHeight()` -> `int`
- `highlight(int setIndex)` -> `void`
- `static installSet(BaseFragment fragment, TLObject set, boolean showBulletIn)` -> `void`
- `static installSet(BaseFragment fragment, TLObject obj, boolean showBulletIn, Utilities.Callback<Boolean> onDone, Runnable onStickersLoaded)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onBackPressed()` -> `void`
- `onButtonClicked(boolean install)` -> `void`
- `onCloseByLink()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setPreviewEmoji(TLRPC.Document document)` -> `void`
- `show()` -> `void`
- `showPremiumAlert()` -> `void`
- `static uninstallSet(BaseFragment fragment, TLRPC.TL_messages_stickerSet set, boolean showBulletin, Runnable onUndo, boolean forget)` -> `void`
- `static uninstallSet(Context context, TLRPC.TL_messages_stickerSet set, boolean showBulletin, Runnable onUndo)` -> `void`
- `updateInstallment()` -> `void`

## `org.telegram.ui.Components.EmojiPacksAlert$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `getSetEndPosition(int setIndex)` -> `int`
- `getSetHeaderPosition(int setIndex)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.EmojiPacksAlert$ContentView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `hidePreviewEmoji()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setPreviewEmoji(TLRPC.Document document)` -> `void`
- `updateEmojiDrawables()` -> `void`

## `org.telegram.ui.Components.EmojiPacksAlert$ContentView$DrawingInBackgroundLine`
- `draw(Canvas canvas, long time, int w, int h, float alpha)` -> `void`
- `drawInBackground(Canvas canvas)` -> `void`
- `drawInUiThread(Canvas canvas, float alpha)` -> `void`
- `onFrameReady()` -> `void`
- `prepareDraw(long time)` -> `void`

## `org.telegram.ui.Components.EmojiPacksAlert$EmojiImageView`
- `getDocument()` -> `TLRPC.Document`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `updatePressedProgress()` -> `void`

## `org.telegram.ui.Components.EmojiPacksAlert$EmojiPackHeader`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(TLRPC.TL_messages_stickerSet set, int size, boolean premium)` -> `void`

## `org.telegram.ui.Components.EmojiPacksAlert$EmojiPacksLoader`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `findEmoticon(long documentId)` -> `String`
- `findEmoticon(TLRPC.InputStickerSet inputStickerSet, long documentId)` -> `String`
- `findEmoticon(TLRPC.TL_messages_stickerSet stickerSet, long documentId)` -> `String`
- `getItemsCount()` -> `int`
- `getTitle(int index)` -> `String`
- `init()` -> `void`
- `recycle()` -> `void`
- `start()` -> `void`

## `org.telegram.ui.Components.EmojiPacksAlert$LinkMovementMethodMy`
- `onTouchEvent(TextView widget, Spannable buffer, MotionEvent event)` -> `boolean`

## `org.telegram.ui.Components.EmojiTabsStrip`
- `allowEmojisForNonPremium()` -> `boolean`
- `doIncludeFeatured()` -> `boolean`
- `getEmojiColorFilter()` -> `ColorFilter`
- `isGiftsVisible()` -> `boolean`
- `isInstalled(EmojiView.EmojiPack pack)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTabClick(int index)` -> `boolean`
- `onTabCreate(EmojiTabButton button)` -> `void`
- `select(int index)` -> `void`
- `select(int index, boolean animated)` -> `void`
- `setAnimatedEmojiCacheType(int cacheType)` -> `void`
- `setPaddingLeft(float paddingLeftDp)` -> `void`
- `showGifts(boolean show)` -> `void`
- `showRecent(boolean show)` -> `void`
- `showRecentTabStub(boolean show)` -> `void`
- `showSelected(boolean show)` -> `void`
- `updateClickListeners()` -> `void`
- `updateColors()` -> `void`
- `updateEmojiPacks(ArrayList<EmojiView.EmojiPack> emojiPacks)` -> `void`

## `org.telegram.ui.Components.EmojiTabsStrip$EmojiTabButton`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getDrawable()` -> `Drawable`
- `id()` -> `Long`
- `invalidate()` -> `void`
- `invalidate(int l, int t, int r, int b)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo info)` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `performClick()` -> `boolean`
- `setAnimatedEmojiDocument(TLRPC.Document document)` -> `void`
- `setAnimatedEmojiDocumentId(long documentId)` -> `void`
- `setDrawable(Drawable drawable)` -> `void`
- `setLock(Boolean lock, boolean animated)` -> `void`
- `setStickerThumb(EmojiView.EmojiPack set)` -> `void`
- `updateColor()` -> `void`
- `updateLockImageReceiver()` -> `void`
- `updateSelect(boolean selected, boolean animated)` -> `void`
- `updateVisibilityInbounds(boolean visible, boolean ignore)` -> `void`

## `org.telegram.ui.Components.EmojiTabsStrip$EmojiTabsView`
- `maxWidth()` -> `int`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `show(boolean show, boolean animated)` -> `void`

## `org.telegram.ui.Components.EmojiTabsStrip$StabDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.EmojiView`
- `allowEmojisForNonPremium(boolean allow)` -> `void`
- `applyInAppKeyboardAnimatedHeight(float height)` -> `void`
- `applyNavigationBarHeight(int height)` -> `void`
- `areThereAnyStickers()` -> `boolean`
- `clearRecentEmoji()` -> `void`
- `closeSearch(boolean animated)` -> `void`
- `closeSearch(boolean animated, long scrollToSet)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `forceHideBackspaceButton()` -> `void`
- `forceHideSettingsButton()` -> `void`
- `freeze(boolean freeze)` -> `void`
- `getCurrentPage()` -> `int`
- `getEmojipacks()` -> `ArrayList<EmojiPack>`
- `getListViewForType(@Type int type)` -> `RecyclerListView`
- `getRecentEmoji()` -> `ArrayList<String>`
- `getStickersExpandOffset()` -> `float`
- `getTabsForType(@Type int type)` -> `View`
- `hideBottomTabContainerBackground()` -> `void`
- `hideSearchKeyboard()` -> `void`
- `invalidateViews()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDestroy()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onFactorChangeFinished(int id, float finalFactor, FactorAnimator callee)` -> `void`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onMessageSend()` -> `void`
- `onOpen(boolean forceEmoji, boolean groupEmojiHintWasVisible)` -> `void`
- `openEmojiPackAlert(TLRPC.StickerSet set)` -> `void`
- `scrollEmojiToTop()` -> `void`
- `scrollEmojisToAnimated()` -> `void`
- `searchProgressChanged()` -> `void`
- `setAllow(boolean allowStickers, boolean allowGifs, boolean animated)` -> `void`
- `setAllow(boolean allowEmoji, boolean allowStickers, boolean allowGifs, boolean animated)` -> `void`
- `setBlurredBackgroundDrawableFactory(BlurredBackgroundDrawableViewFactory factory)` -> `void`
- `setBottomInset(int bottomInset)` -> `void`
- `setChatInfo(TLRPC.ChatFull chatInfo)` -> `void`
- `setDelegate(EmojiViewDelegate emojiViewDelegate)` -> `void`
- `setDisableStickerEditor()` -> `void`
- `setDragListener(DragListener listener)` -> `void`
- `setEnabled(boolean enabled)` -> `void`
- `setForseMultiwindowLayout(boolean value)` -> `void`
- `setShouldDrawBackground(boolean shouldDrawBackground)` -> `void`
- `setShowing(boolean showing)` -> `void`
- `setStickersBanned(boolean emojiBanned, boolean stickersBanned, long chatId)` -> `void`
- `setTranslationY(float translationY)` -> `void`
- `setVisibility(int visibility)` -> `void`
- `showSearchField(boolean show)` -> `void`
- `showStickerBanHint(boolean show, boolean emoji, boolean gif)` -> `void`
- `switchToGifRecent()` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.EmojiView$CustomEmoji`
- `getDocument()` -> `TLRPC.Document`

## `org.telegram.ui.Components.EmojiView$DraggableScrollSlidingTabStrip`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onTouchEvent(MotionEvent ev)` -> `boolean`

## `org.telegram.ui.Components.EmojiView$EmojiGridAdapter`
- `expand(int position, View expandButton)` -> `void`
- `getItemCount()` -> `int`
- `getItemId(int position)` -> `long`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `notifyDataSetChanged(boolean updateEmojipack)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `updateRows()` -> `void`

## `org.telegram.ui.Components.EmojiView$EmojiGridSpacing`
- `getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state)` -> `void`

## `org.telegram.ui.Components.EmojiView$EmojiGridView`
- `animateExpandAppearDuration()` -> `long`
- `animateExpandCrossfadeDuration()` -> `long`
- `animateExpandDuration()` -> `long`
- `captureChildren(Canvas canvas, RectF positionRect, long drawingTime)` -> `void`
- `clearAllTouches()` -> `void`
- `clearTouchesFor(View view)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawDashedOutlines(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onInterceptTouchEvent(MotionEvent event)` -> `boolean`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthSpec, int heightSpec)` -> `void`
- `onScrollStateChanged(int state)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `updateEmojiDrawables()` -> `void`

## `org.telegram.ui.Components.EmojiView$EmojiGridView$DrawingInBackgroundLine`
- `draw(Canvas canvas, long time, int w, int h, float alpha)` -> `void`
- `drawInBackground(Canvas canvas)` -> `void`
- `drawInUiThread(Canvas canvas, float alpha)` -> `void`
- `onFrameReady()` -> `void`
- `prepareDraw(long time)` -> `void`

## `org.telegram.ui.Components.EmojiView$EmojiPackButton`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(String title, boolean unlock, boolean installed, OnClickListener onClickListener)` -> `void`
- `updateInstall(boolean installed, boolean animated)` -> `void`

## `org.telegram.ui.Components.EmojiView$EmojiPackHeader`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setStickerSet(EmojiPack pack, boolean divider)` -> `void`
- `updateState(boolean animated)` -> `void`
- `updateState(int state, boolean animated)` -> `void`

## `org.telegram.ui.Components.EmojiView$EmojiPagesAdapter`
- `customOnDraw(Canvas canvas, View view, int position)` -> `void`
- `destroyItem(ViewGroup viewGroup, int position, Object object)` -> `void`
- `getCount()` -> `int`
- `getPageIconDrawable(int position)` -> `Drawable`
- `getPageTitle(int position)` -> `CharSequence`
- `getTabPadding(int position)` -> `int`
- `instantiateItem(ViewGroup viewGroup, int position)` -> `Object`

## `org.telegram.ui.Components.EmojiView$EmojiSearchAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `resetSelectedPackId()` -> `void`
- `search(String text)` -> `void`
- `search(String text, boolean delay)` -> `void`

## `org.telegram.ui.Components.EmojiView$EmojiViewDelegate`
- `getProgressToSearchOpened()` -> `default float`
- `getThreadId()` -> `default int`
- `invalidateEnterView()` -> `default void`
- `onAnimatedEmojiUnlockClick()` -> `default void`
- `onBackspace()` -> `default boolean`
- `onClearEmojiRecent()` -> `default void`
- `onCustomEmojiSelected(long documentId, TLRPC.Document document, String emoticon, boolean isRecent)` -> `default void`
- `onEmojiSelected(String emoji)` -> `default void`
- `onEmojiSettingsClick(ArrayList<TLRPC.TL_messages_stickerSet> frozenEmojiPacks)` -> `default void`
- `onGifSelected(View view, Object gif, String query, Object parent, boolean notify, int scheduleDate, int scheduleRepeatPeriod)` -> `default void`
- `onGifSelectedForAddCaption(View view, Object gif, String query, Object parent, boolean notify, int scheduleDate, int scheduleRepeatPeriod)` -> `default void`
- `onSearchOpenClose(int type)` -> `default void`
- `onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean edit)` -> `default void`
- `onStickerSelected(View view, TLRPC.Document sticker, String query, Object parent, MessageObject.SendAnimationData sendAnimationData, boolean notify, int scheduleDate, int scheduleRepeatPeriod)` -> `default void`
- `onStickerSetAdd(TLRPC.StickerSetCovered stickerSet)` -> `default void`
- `onStickerSetRemove(TLRPC.StickerSetCovered stickerSet)` -> `default void`
- `onStickersGroupClick(long chatId)` -> `default void`
- `onStickersSettingsClick()` -> `default void`
- `onTabOpened(int type)` -> `default void`
- `showTrendingStickersAlert(TrendingStickersLayout layout)` -> `default void`

## `org.telegram.ui.Components.EmojiView$ImageViewEmoji`
- `getSpan()` -> `AnimatedEmojiSpan`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setImageDrawable(Drawable drawable, boolean recent)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `setSpan(AnimatedEmojiSpan span)` -> `void`

## `org.telegram.ui.Components.EmojiView$SearchField`
- `hideKeyboard()` -> `void`
- `isCategorySelected()` -> `boolean`
- `isInProgress()` -> `boolean`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `search(String text, boolean delay)` -> `void`
- `showKeyboard()` -> `void`
- `showProgress(boolean progress)` -> `void`

## `org.telegram.ui.Components.EmojiView$TrendingAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.EmojiView$TrendingListView`
- `onInterceptTouchEvent(MotionEvent e)` -> `boolean`

## `org.telegram.ui.Components.EmojiView$TypedScrollListener`
- `onScrollStateChanged(RecyclerView recyclerView, int newState)` -> `void`
- `onScrolled(RecyclerView recyclerView, int dx, int dy)` -> `void`

## `org.telegram.ui.Components.LoadingAnimatedTextView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setText(CharSequence before, CharSequence after)` -> `void`
- `setText(CharSequence before, CharSequence loaded, CharSequence after)` -> `void`

## `org.telegram.ui.Components.MessageContainsEmojiButton`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Components.MessageContainsEmojiButton$BoldAndAccent`
- `updateDrawState(TextPaint textPaint)` -> `void`

## `org.telegram.ui.Components.Paint.ObjectDetectionEmojis`
- `static labelToEmoji(int labelId)` -> `String`

## `org.telegram.ui.Components.Paint.Views.ReactionWidgetEntityView`
- `allowHaptic()` -> `boolean`
- `allowLongPressOnSelected()` -> `boolean`
- `changeStyle(boolean animated)` -> `void`
- `createSelectionView()` -> `SelectionView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getCurrentReaction()` -> `ReactionsLayoutInBubble.VisibleReaction`
- `getMaxScale()` -> `float`
- `getMinScale()` -> `float`
- `getPadding()` -> `int`
- `getSelectionBounds()` -> `RectOld`
- `isDark()` -> `boolean`
- `isMirrored()` -> `boolean`
- `mirror(boolean animate)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setCurrentReaction(ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean animated)` -> `void`
- `setScaleX(float scaleX)` -> `void`
- `updatePosition()` -> `void`

## `org.telegram.ui.Components.Premium.ReactionDrawingObject`
- `draw(Canvas canvas, float cX, float cY, float globalScale)` -> `void`
- `hideAnimation()` -> `void`
- `onAttachToWindow(View parentView, int i)` -> `void`
- `onDetachFromWindow()` -> `void`
- `select()` -> `void`
- `set(TLRPC.TL_availableReaction reaction)` -> `void`

## `org.telegram.ui.Components.ReactionTabHolderView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `setCounter(int count)` -> `void`
- `setCounter(int currentAccount, TLRPC.ReactionCount counter)` -> `void`
- `setOutlineProgress(float outlineProgress)` -> `void`

## `org.telegram.ui.Components.Reactions.AddReactionsSpan`
- `draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float _x, int top, int _y, int bottom, @NonNull Paint paint)` -> `void`
- `getSize(@NonNull Paint paint, CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm)` -> `int`
- `hide(View parent, Runnable after)` -> `void`
- `makeLayout()` -> `void`
- `show(View parent)` -> `void`

## `org.telegram.ui.Components.Reactions.AnimatedEmojiEffect`
- `static createFrom(AnimatedEmojiDrawable animatedEmojiDrawable, boolean longAnimation, boolean showGeneric)` -> `AnimatedEmojiEffect`
- `draw(Canvas canvas)` -> `void`
- `setBounds(int l, int t, int r, int b)` -> `void`
- `setView(View view)` -> `void`

## `org.telegram.ui.Components.Reactions.AnimatedEmojiEffect$Particle`
- `draw(Canvas canvas)` -> `void`
- `generate()` -> `void`

## `org.telegram.ui.Components.Reactions.BackSpaceButtonView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setOnBackspace(Utilities.Callback<Boolean> onBackspace)` -> `void`

## `org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `toggleStarsEnabled()` -> `void`

## `org.telegram.ui.Components.Reactions.ChatSelectionReactionMenuOverlay`
- `invalidatePosition()` -> `void`
- `invalidatePosition(boolean animate)` -> `void`
- `isVisible()` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `setHiddenByScroll(boolean hiddenByScroll)` -> `void`
- `setSelectedMessages(List<MessageObject> messages)` -> `void`

## `org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow`
- `dismiss()` -> `void`
- `dismiss(boolean animated)` -> `void`
- `dismissWithAlpha()` -> `void`
- `onDismissListener(Runnable onDismiss)` -> `void`
- `setBackgroundFactory(BlurredBackgroundDrawableViewFactory backgroundFactory, BlurredBackgroundProvider backgroundColorProvider)` -> `void`
- `setLongPressEnabled(boolean isEnabled)` -> `void`
- `setRecentReactions(List<ReactionsLayoutInBubble.VisibleReaction> reactions)` -> `void`

## `org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow$ContainerView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `invalidate()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Components.Reactions.CustomReactionEditText`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `extendActionMode(ActionMode actionMode, Menu menu)` -> `void`
- `getEditTextSelectionEnd()` -> `int`
- `getEditTextSelectionStart()` -> `int`
- `getFontMetricsInt()` -> `Paint.FontMetricsInt`
- `getThemedColor(int key)` -> `int`
- `onSelectionChanged(int selStart, int selEnd)` -> `void`
- `setMaxLength(int maxLength)` -> `void`
- `setOnFocused(Runnable onFocused)` -> `void`

## `org.telegram.ui.Components.Reactions.HwEmojis`
- `static beforePreparing()` -> `void`
- `static disableHw()` -> `void`
- `static enableHw()` -> `void`
- `static exec()` -> `void`
- `static grab(View view)` -> `boolean`
- `static grabIfWeakDevice(View... views)` -> `boolean`
- `static prepare(Runnable runnable, boolean cascade)` -> `void`

## `org.telegram.ui.Components.Reactions.ReactionImageHolder`
- `draw(Canvas canvas)` -> `void`
- `onAttachedToWindow(boolean attached)` -> `void`
- `play()` -> `void`
- `static preload(int currentAccount, ReactionsLayoutInBubble.VisibleReaction reaction)` -> `void`
- `setAlpha(float alpha)` -> `void`
- `setBounds(Rect bounds)` -> `void`
- `setColor(int color)` -> `void`
- `setParent(View parentView)` -> `void`
- `setStatic()` -> `void`
- `setVisibleReaction(ReactionsLayoutInBubble.VisibleReaction currentReaction)` -> `void`

## `org.telegram.ui.Components.Reactions.ReactionsEffectOverlay`
- `static dismissAll()` -> `void`
- `static getFilterForAroundAnimation()` -> `String`
- `static onScrolled(int dy)` -> `void`
- `static show(BaseFragment baseFragment, ReactionsContainerLayout reactionsLayout, View cell, View fromAnimationView, float x, float y, ReactionsLayoutInBubble.VisibleReaction visibleReaction, int currentAccount, int animationType)` -> `void`
- `static sizeForAroundReaction()` -> `int`
- `static sizeForBigReaction()` -> `int`
- `static startAnimation()` -> `void`
- `static startShortAnimation()` -> `void`

## `org.telegram.ui.Components.Reactions.ReactionsEffectOverlay$AnimationView`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `setAnimatedEmojiEffect(AnimatedEmojiEffect effect)` -> `void`
- `setAnimatedReactionDrawable(AnimatedEmojiDrawable animatedEmojiDrawable)` -> `void`

## `org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble`
- `animateChange()` -> `boolean`
- `animateReaction(VisibleReaction reaction)` -> `void`
- `draw(Canvas canvas, float animationProgress, Integer drawOnlyReaction)` -> `void`
- `drawOverlay(Canvas canvas, float animationProgress)` -> `boolean`
- `drawPreview(View view, Canvas canvas, int offset, Integer drawOnlyReaction)` -> `void`
- `static equalsTLReaction(TLRPC.Reaction reaction, TLRPC.Reaction reaction1)` -> `boolean`
- `static fillTagPath(RectF bounds, Path path)` -> `void`
- `static fillTagPath(RectF bounds, RectF tempRect, Path path)` -> `void`
- `getCurrentTotalHeight(float transitionProgress)` -> `float`
- `getCurrentWidth(float transitionProgress)` -> `float`
- `getReactionButton(VisibleReaction visibleReaction)` -> `ReactionButton`
- `getReactionButton(String hash)` -> `ReactionButton`
- `hasOverlay()` -> `boolean`
- `static initPaints(Theme.ResourcesProvider resourcesProvider)` -> `void`
- `measure(int availableWidth, int gravity)` -> `void`
- `onAttachToWindow()` -> `void`
- `onDetachFromWindow()` -> `void`
- `static reactionsEqual(TLRPC.Reaction a, TLRPC.Reaction b)` -> `boolean`
- `recordDrawingState()` -> `void`
- `resetAnimation()` -> `void`
- `setScrimProgress(float scrimProgress)` -> `void`
- `setScrimProgress(float scrimProgress, boolean direction)` -> `void`
- `setScrimReaction(Integer scrimViewReaction)` -> `void`
- `verifyDrawable(Drawable drawable)` -> `boolean`

## `org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble$ButtonsComparator`
- `compare(ReactionButton o1, ReactionButton o2)` -> `int`

## `org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble$ReactionButton`
- `attach()` -> `void`
- `attachPreview(View view)` -> `void`
- `detach()` -> `void`
- `detachPreview()` -> `void`
- `draw(Canvas canvas, float x, float y, float progress, float alpha, boolean drawOverlayScrim, boolean scrimProgressDirection, float scrimProgress)` -> `void`
- `drawCounter()` -> `boolean`
- `drawOverlay(Canvas canvas, float x, float y, float progress, float alpha, boolean drawOverlayScrim)` -> `boolean`
- `drawPreview(View view, Canvas canvas, RectF rect, float alpha)` -> `void`
- `drawTagDot()` -> `boolean`
- `drawTextWithCounter()` -> `boolean`
- `getCacheType()` -> `int`
- `getDrawServiceShaderBackground()` -> `float`
- `getImageReceiver()` -> `ImageReceiver`
- `isOutOwner()` -> `boolean`
- `removeImageReceiver()` -> `void`
- `startAnimation()` -> `void`
- `stopAnimation()` -> `void`
- `supportsImageReceiverCache()` -> `boolean`
- `updateColors(float progress)` -> `void`

## `org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble$ReactionLayoutButton`
- `getDrawServiceShaderBackground()` -> `float`
- `getImageReceiver()` -> `ImageReceiver`
- `isOutOwner()` -> `boolean`
- `isPlaying()` -> `boolean`
- `supportsImageReceiverCache()` -> `boolean`

## `org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble$VisibleReaction`
- `static asStar()` -> `VisibleReaction`
- `equals(Object o)` -> `boolean`
- `flatten()` -> `VisibleReaction`
- `static fromCustomEmoji(Long documentId)` -> `VisibleReaction`
- `static fromEmojicon(TLRPC.TL_availableReaction reaction)` -> `VisibleReaction`
- `static fromEmojicon(String reaction)` -> `VisibleReaction`
- `static fromTL(TLRPC.Reaction reaction)` -> `VisibleReaction`
- `static fromTL(TLRPC.TL_availableEffect effect)` -> `VisibleReaction`
- `toCharSequence(Paint.FontMetricsInt fontMetrics, int cacheType)` -> `CharSequence`
- `toCharSequence(Paint.FontMetricsInt fontMetrics)` -> `CharSequence`
- `toCharSequence(int textSizeDp)` -> `CharSequence`
- `toString()` -> `String`
- `toTLReaction()` -> `TLRPC.Reaction`

## `org.telegram.ui.Components.Reactions.ReactionsUtils`
- `static applyForStoryViews(TLRPC.Reaction oldReaction, TLRPC.Reaction newReaction, TL_stories.StoryViews views)` -> `void`
- `static compare(TLRPC.Reaction reaction, ReactionsLayoutInBubble.VisibleReaction visibleReaction)` -> `boolean`
- `static compare(TLRPC.Reaction reaction, TLRPC.Reaction reaction2)` -> `boolean`
- `static createAnimatedEmojiSpan(TLRPC.Document document, Long documentId, Paint.FontMetricsInt fontMetricsInt)` -> `AnimatedEmojiSpan`
- `static createSpannableText(AnimatedEmojiSpan span, String key)` -> `SpannableString`
- `static reactionToCharSequence(TLRPC.Reaction reaction)` -> `CharSequence`
- `static showLimitReachedDialogForReactions(long dialogId, int lvl, TL_stories.TL_premium_boostsStatus boostsStatus)` -> `void`
- `static startPreloadReactions(TLRPC.Chat currentChat, TLRPC.ChatFull chatFull)` -> `List<AnimatedEmojiDrawable>`
- `static stopPreloadReactions(List<AnimatedEmojiDrawable> list)` -> `void`
- `static toTLReaction(ReactionsLayoutInBubble.VisibleReaction visibleReaction)` -> `TLRPC.Reaction`

## `org.telegram.ui.Components.Reactions.UpdateReactionsButton`
- `setDefaultState()` -> `void`
- `setLvlRequiredState(int lvl)` -> `void`

## `org.telegram.ui.Components.ReactionsContainerLayout`
- `static allowSmoothEnterTransition()` -> `boolean`
- `clearRecentReactions()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismissParent(boolean animated)` -> `void`
- `dismissWindow()` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawBubbles(Canvas canvas)` -> `void`
- `expandSize()` -> `float`
- `getDelegate()` -> `ReactionsContainerDelegate`
- `getHintTextWidth()` -> `int`
- `static getInclusiveReactions(ArrayList<MessageObject> messages)` -> `HashSet<ReactionsLayoutInBubble.VisibleReaction>`
- `getItemsCount()` -> `int`
- `getPullingLeftProgress()` -> `float`
- `getReactionsWindow()` -> `CustomEmojiReactionsWindow`
- `getSelectedEmoji()` -> `String`
- `getSelectedReactions()` -> `HashSet<ReactionsLayoutInBubble.VisibleReaction>`
- `getTopOffset()` -> `float`
- `getTotalWidth()` -> `int`
- `getVisibleReactionsList()` -> `List<ReactionsLayoutInBubble.VisibleReaction>`
- `getWindowType()` -> `int`
- `getWindowView()` -> `View`
- `invalidateLoopViews()` -> `void`
- `isFlippedVertically()` -> `boolean`
- `measureHint()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onCustomEmojiWindowClosing()` -> `void`
- `onCustomEmojiWindowOpened()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onReactionClicked(View emojiView, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean longpress)` -> `void`
- `onShownCustomEmojiReactionDialog()` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `prepareAnimation(boolean b)` -> `void`
- `reset()` -> `void`
- `setAlpha(float alpha)` -> `void`
- `setBackgroundFactory(BlurredBackgroundDrawableViewFactory backgroundFactory, BlurredBackgroundProvider backgroundColorProvider)` -> `void`
- `setBubbleOffset(float v)` -> `void`
- `setChatScrimView(ChatScrimPopupContainerLayout chatScrimPopupContainerLayout)` -> `void`
- `setCurrentAccount(int currentAccount)` -> `void`
- `setCustomEmojiEnterProgress(float progress)` -> `void`
- `setCustomEmojiReactionsBackground(boolean isNeed)` -> `void`
- `setDelegate(ReactionsContainerDelegate delegate)` -> `void`
- `setFlippedVertically(boolean flippedVertically)` -> `void`
- `setFragment(BaseFragment lastFragment)` -> `void`
- `setHint(CharSequence storyReactionsHint)` -> `void`
- `setMessage(MessageObject message, TLRPC.ChatFull chatFull, boolean animated)` -> `void`
- `setMiniBubblesOffset(float miniBubblesOffset)` -> `void`
- `setMirrorX(boolean mirrorX)` -> `void`
- `setOnSwitchedToLoopView(Runnable onSwitchedToLoopView)` -> `void`
- `setParentLayout(ChatScrimPopupContainerLayout layout)` -> `void`
- `setPaused(boolean paused, boolean exceptSelected)` -> `void`
- `setSelectedEmojis(ArrayList<String> emojis)` -> `void`
- `setSelectedReaction(ReactionsLayoutInBubble.VisibleReaction visibleReaction)` -> `void`
- `setSelectedReactionAnimated(ReactionsLayoutInBubble.VisibleReaction visibleReaction)` -> `void`
- `setSelectedReactionInclusive(ReactionsLayoutInBubble.VisibleReaction visibleReaction)` -> `void`
- `setSelectedReactions(ArrayList<MessageObject> messages)` -> `void`
- `setSelectedReactionsInclusive(ArrayList<MessageObject> messages)` -> `void`
- `setSkipDraw(boolean b)` -> `void`
- `setStoryItem(TL_stories.StoryItem storyItem)` -> `void`
- `setTop(boolean isTop)` -> `void`
- `setTransitionProgress(float transitionProgress)` -> `void`
- `setTranslationX(float translationX)` -> `void`
- `showCustomEmojiReaction()` -> `boolean`
- `showExpandableReactions()` -> `boolean`
- `startEnterAnimation(boolean animatePopup)` -> `void`

## `org.telegram.ui.Components.ReactionsContainerLayout$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder holder)` -> `void`
- `updateItems(boolean animated)` -> `void`

## `org.telegram.ui.Components.ReactionsContainerLayout$CustomReactionsContainer`
- `dispatchDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.Components.ReactionsContainerLayout$InnerItem`
- `equals(Object o)` -> `boolean`

## `org.telegram.ui.Components.ReactionsContainerLayout$InternalImageView`
- `play(int delay, boolean animated)` -> `void`
- `resetAnimation()` -> `void`

## `org.telegram.ui.Components.ReactionsContainerLayout$LeftRightShadowsListener`
- `onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy)` -> `void`

## `org.telegram.ui.Components.ReactionsContainerLayout$ReactionHolderView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `play(int delay)` -> `boolean`
- `resetAnimation()` -> `void`
- `updateSelected(ReactionsLayoutInBubble.VisibleReaction react, boolean animated)` -> `void`

## `org.telegram.ui.Components.ReactionsContainerLayout$ReactionsContainerDelegate`
- `allowLongPress()` -> `default boolean`
- `drawBackground()` -> `default boolean`
- `drawRoundRect(Canvas canvas, RectF rect, float radius, float offsetX, float offsetY, int alpha, boolean isWindow)` -> `default void`
- `hideMenu()` -> `default void`
- `needEnterText()` -> `default boolean`
- `onEmojiWindowDismissed()` -> `default void`

## `org.telegram.ui.Components.ScrollableHorizontalScrollView`
- `isScrolling()` -> `boolean`
- `isTouch()` -> `boolean`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onScrollChanged(int l, int t, int oldl, int oldt)` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `resetScrollTo()` -> `void`
- `scrollTo(int x)` -> `void`
- `scrollToVisible(int left, int right)` -> `boolean`
- `updateButtonsVisibility()` -> `void`

## `org.telegram.ui.Components.SuggestEmojiView`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawContainerEnd(Canvas canvas)` -> `void`
- `emojiCacheType()` -> `int`
- `fireUpdate()` -> `void`
- `forbidCopy()` -> `void`
- `forbidSetAsStatus()` -> `void`
- `forceClose()` -> `void`
- `getDelegate()` -> `AnchorViewDelegate`
- `getDirection()` -> `int`
- `invalidateContent()` -> `void`
- `isShown()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onTextSelectionChanged(int start, int end)` -> `void`
- `setDelegate(AnchorViewDelegate delegate)` -> `void`
- `setDirection(int direction)` -> `void`
- `setHorizontalPadding(int padding)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.SuggestEmojiView$Adapter`
- `getItemCount()` -> `int`
- `getItemId(int position)` -> `long`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.SuggestEmojiView$EmojiImageView`
- `attach()` -> `void`
- `detach()` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setDirection(int direction)` -> `void`
- `setImageDrawable(@Nullable Drawable drawable)` -> `void`
- `setPressed(boolean pressed)` -> `void`

## `org.telegram.ui.Components.emojiview.FoundEmojiPacksRecyclerView`
- `scrollOnSelect(View view)` -> `void`

## `org.telegram.ui.Components.inset.WindowAnimatedInsetsProvider`
- `static calculateWindowInsets(View view)` -> `WindowInsetsCompat`
- `static calculateWindowInsets(WindowInsetsCompat rootInsets, View view, View rootView)` -> `WindowInsetsCompat`
- `onEnd(@NonNull WindowInsetsAnimationCompat animation)` -> `void`
- `subscribeToWindowInsetsAnimation(Listener listener)` -> `void`
- `unsubscribeFromWindowInsetsAnimation(Listener listener)` -> `void`

## `org.telegram.ui.Components.inset.WindowAnimatedInsetsProvider$Listener`
- `onAnimatedInsetsFinished()` -> `default void`
- `onAnimatedInsetsStarted()` -> `default void`

## `org.telegram.ui.Components.poll.PollAddOptionFieldLayout$EmojiButton`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`

## `org.telegram.ui.EmojiAnimationsOverlay`
- `clear()` -> `void`
- `createDrawingObject(String emoji, int viewId, TLRPC.Document viewDocument, @Nullable MessageObject messageObject, int animation, boolean sendTap, boolean sendSeen, float imageW, float imageH, boolean isOutOwner)` -> `boolean`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `draw(Canvas canvas)` -> `void`
- `static getFilterWidth()` -> `int`
- `getProgress()` -> `float`
- `layoutObject(DrawingObject object)` -> `void`
- `onAllEffectsEnd()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onScrolled(int dy)` -> `void`
- `onTapItem(ChatMessageCell view, ChatActivity chatActivity, boolean userTapped)` -> `boolean`
- `preload(ReactionsLayoutInBubble.VisibleReaction visibleReaction)` -> `void`
- `preloadAnimation(ChatMessageCell cell)` -> `void`
- `setAccount(int currentAccount)` -> `void`
- `showAnimationForActionCell(ChatActionCell view, TLRPC.Document document, TLRPC.VideoSize videoSize)` -> `boolean`
- `showAnimationForCell(ChatMessageCell view, int animation, boolean sendTap, boolean sendSeen)` -> `boolean`
- `showAnimationForWidget(StoryReactionWidgetView widgetView)` -> `boolean`
- `supports(String emoticon)` -> `boolean`
- `static unwrapEmoji(String emoji)` -> `String`

## `org.telegram.ui.EmojiAnimationsOverlay$DrawingObject`
- `getProgress()` -> `float`

## `org.telegram.ui.ReactionsDoubleTapManageActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSupportEdgeToEdge()` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `showSelectStatusDialog(SetDefaultReactionCell cell)` -> `void`

## `org.telegram.ui.ReactionsDoubleTapManageActivity$SetDefaultReactionCell`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `update(boolean animated)` -> `void`
- `updateImageBounds()` -> `void`

## `org.telegram.ui.SelectAnimatedEmojiDialog`
- `animateEmojiSelect(ImageViewEmoji view, Runnable onDone)` -> `void`
- `animateExpandAppearDuration()` -> `long`
- `animateExpandCrossfadeDuration()` -> `long`
- `animateExpandDuration()` -> `long`
- `clearSelectedDocuments()` -> `void`
- `static clearState(int saveId)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawBigReaction(Canvas canvas, View view)` -> `void`
- `expand(int position, View expandButton)` -> `void`
- `static findSticker(TLRPC.TL_messages_stickerSet set, String emoji)` -> `TLRPC.Document`
- `getCollectionParticles()` -> `StarsReactionsSheet.Particles`
- `getDialogId()` -> `long`
- `getEffectDocument(long effectId)` -> `TLRPC.Document`
- `getScrimDrawableTranslationY()` -> `float`
- `invalidateParent()` -> `void`
- `invalidateSearchBox()` -> `void`
- `isBottom()` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDismiss(Runnable dismiss)` -> `void`
- `onEmojiClick(View view, AnimatedEmojiSpan span)` -> `void`
- `onEmojiSelected(View view, Long documentId, TLRPC.Document document, TL_stars.TL_starGiftUnique gift, Integer until)` -> `void`
- `onInputFocus()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onReactionClick(ImageViewEmoji emoji, ReactionsLayoutInBubble.VisibleReaction reaction)` -> `void`
- `onSettings()` -> `void`
- `onShow(Runnable dismiss)` -> `void`
- `preload(int type, int account)` -> `void`
- `static preload(int account)` -> `void`
- `prevWindowKeyboardVisible()` -> `boolean`
- `resetBackgroundBitmaps()` -> `void`
- `search(String query)` -> `void`
- `search(String query, boolean liftUp, boolean delay)` -> `void`
- `setAnimationsEnabled(boolean aniationsEnabled)` -> `void`
- `setBackgroundDelegate(BackgroundDelegate backgroundDelegate)` -> `void`
- `setDrawBackground(boolean drawBackground)` -> `void`
- `setEnterAnimationInProgress(boolean enterAnimationInProgress)` -> `void`
- `setExpireDateHint(int date)` -> `void`
- `setForUser(boolean forUser)` -> `void`
- `setForumIconDrawable(Drawable drawable)` -> `void`
- `setLongPressEnabled(boolean isEnabled)` -> `void`
- `setMultiSelected(Long documentId, boolean animated)` -> `void`
- `setOnLongPressedListener(onLongPressedListener l)` -> `void`
- `setOnRecentClearedListener(SelectAnimatedEmojiDialog.onRecentClearedListener onRecentClearedListener)` -> `void`
- `setPaused(boolean paused, boolean exceptSelected)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `setRecentReactions(List<ReactionsLayoutInBubble.VisibleReaction> reactions)` -> `void`
- `setSaveState(int saveId)` -> `void`
- `setScrimDrawable(AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable scrimDrawable, View drawableParent)` -> `void`
- `setSelected(Long documentId)` -> `void`
- `setSelectedReaction(ReactionsLayoutInBubble.VisibleReaction reaction)` -> `void`
- `setSelectedReactions(HashSet<ReactionsLayoutInBubble.VisibleReaction> selectedReactions)` -> `void`
- `setSelectedReactions(ArrayList<String> emojis)` -> `void`
- `switchGrids(boolean search)` -> `void`
- `switchGrids(boolean search, boolean liftUp)` -> `void`
- `switchSearchEmptyView(boolean empty)` -> `void`
- `unselect(Long documentId)` -> `boolean`
- `static updateSearchEmptyViewImage(int currentAccount, BackupImageView imageView)` -> `void`
- `willApplyEmoji(View view, Long documentId, TLRPC.Document document, TL_stars.TL_starGiftUnique gift, Integer until)` -> `boolean`

## `org.telegram.ui.SelectAnimatedEmojiDialog$Adapter`
- `getItemCount()` -> `int`
- `getItemId(int position)` -> `long`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.SelectAnimatedEmojiDialog$EmojiListView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `invalidate()` -> `void`
- `invalidate(int l, int t, int r, int b)` -> `void`
- `invalidateViews()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setAlpha(float alpha)` -> `void`

## `org.telegram.ui.SelectAnimatedEmojiDialog$EmojiListView$DrawingInBackgroundLine`
- `draw(Canvas canvas, long time, int w, int h, float alpha)` -> `void`
- `drawBitmap(Canvas canvas, Bitmap bitmap, Paint paint)` -> `void`
- `drawInBackground(Canvas canvas)` -> `void`
- `drawInUiThread(Canvas canvas, float alpha)` -> `void`
- `onFrameReady()` -> `void`
- `prepareDraw(long time)` -> `void`

## `org.telegram.ui.SelectAnimatedEmojiDialog$EmojiPackButton`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(String title, boolean unlock, boolean installed, OnClickListener onClickListener)` -> `void`
- `updateInstall(boolean installed, boolean animated)` -> `void`

## `org.telegram.ui.SelectAnimatedEmojiDialog$HeaderView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setText(String text, boolean lock)` -> `void`
- `setText(CharSequence text, String query, boolean lock)` -> `void`
- `updateLock(boolean lock, boolean animated)` -> `void`

## `org.telegram.ui.SelectAnimatedEmojiDialog$ImageViewEmoji`
- `createImageReceiver(View parent)` -> `void`
- `createPremiumLockView()` -> `void`
- `drawSelected(Canvas canvas, View view)` -> `void`
- `getAnimatedScale()` -> `float`
- `invalidate()` -> `void`
- `invalidate(int l, int t, int r, int b)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAnimatedScale(float scale)` -> `void`
- `setDrawable(Drawable drawable)` -> `void`
- `setEmojicon(String emojicon)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `setSticker(TLRPC.Document document, View parent)` -> `void`
- `setViewSelected(boolean selected, boolean animated)` -> `void`
- `setViewSelectedWithScale(boolean selected, boolean animated)` -> `void`
- `unselectWithScale()` -> `void`
- `update(long time)` -> `void`
- `updatePressedProgress()` -> `void`

## `org.telegram.ui.SelectAnimatedEmojiDialog$SearchAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `isSticker(int position)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `updateRows(boolean diff)` -> `void`

## `org.telegram.ui.SelectAnimatedEmojiDialog$SearchBox`
- `invalidate()` -> `void`
- `isInProgress()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setUseCustomBackground()` -> `void`
- `showProgress(boolean progress)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.SelectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow`
- `dimBehind()` -> `void`
- `dismiss()` -> `void`
- `showAsDropDown(View anchor)` -> `void`
- `showAsDropDown(View anchor, int xoff, int yoff)` -> `void`
- `showAsDropDown(View anchor, int xoff, int yoff, int gravity)` -> `void`
- `showAtLocation(View parent, int gravity, int x, int y)` -> `void`

## `org.telegram.ui.SelectAnimatedEmojiDialog$SelectStatusDurationDialog`
- `dismiss()` -> `void`
- `dispatchTouchEvent(@NonNull MotionEvent ev)` -> `boolean`
- `getOutBounds(Rect rect)` -> `boolean`
- `onEnd(Integer date)` -> `void`
- `onEndPartly(Integer date)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.SelectAnimatedEmojiDialog$SelectStatusDurationDialog$ContentView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Stars.StarReactionsOverlay`
- `clearEffects()` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `focusTo(float dst, Runnable whenDone)` -> `void`
- `getReactionsLayoutInBubble()` -> `ReactionsLayoutInBubble`
- `hide()` -> `void`
- `isShowing(MessageObject obj)` -> `boolean`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `playEffect()` -> `void`
- `setMessageCell(BaseCell cell)` -> `void`
- `show()` -> `void`
- `tap(float x, float y, boolean send, boolean ripple)` -> `void`

## `org.telegram.ui.Stars.StarsController$PendingPaidReactions`
- `apply()` -> `void`
- `close()` -> `void`
- `commit()` -> `void`
- `getPeerId()` -> `long`
- `getToastTitle()` -> `String`
- `setOverlay(StarReactionsOverlay overlay)` -> `void`

## `org.telegram.ui.Stars.StarsReactionsSheet`
- `appendOpenAnimator(boolean opening, ArrayList<Animator> animators)` -> `void`
- `canDismissWithSwipe()` -> `boolean`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `dismissInternal()` -> `void`
- `isTouchOutside(float x, float y)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setLiveCommentsView(LiveCommentsView commentsView)` -> `StarsReactionsSheet`
- `setMessageCell(ChatActivity chatActivity, int id, View cell)` -> `void`
- `setOnSend(Utilities.Callback2Return<Long, Long, Integer> listener)` -> `StarsReactionsSheet`
- `setValue(int value)` -> `void`
- `updateSenders(long my_stars)` -> `void`

## `org.telegram.ui.Stars.StarsReactionsSheet$Particles`
- `draw(Canvas canvas, int color)` -> `void`
- `draw(Canvas canvas, int color, float alpha)` -> `void`
- `gen(Particle p, final long now, boolean prefire)` -> `void`
- `generateGrid()` -> `void`
- `static insertPoint(PointF[][] grid, float cellsize, PointF point)` -> `void`
- `setBounds(RectF bounds)` -> `void`
- `setBounds(Rect bounds)` -> `void`
- `setBounds(int l, int t, int r, int b)` -> `void`
- `setLifetime(float lifetime)` -> `void`
- `setSpeed(float speed)` -> `void`
- `setVisible(float x)` -> `void`

## `org.telegram.ui.Stars.StarsReactionsSheet$Particles$Particle`
- `draw(Canvas canvas, int color, float alpha)` -> `void`

## `org.telegram.ui.Stars.StarsReactionsSheet$SenderData`
- `static of(boolean anonymous, boolean my, long did, long stars)` -> `SenderData`

## `org.telegram.ui.Stars.StarsReactionsSheet$StarsSlider`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `getProgress()` -> `float`
- `getProgress(int value)` -> `float`
- `getValue()` -> `int`
- `getValue(float progress)` -> `int`
- `isTracking()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTapCustom(float x, float y)` -> `boolean`
- `onValueChanged(int value)` -> `void`
- `setColor(int color1, int color2, boolean animated)` -> `void`
- `setCounterSubText(@Nullable String text, boolean animated)` -> `void`
- `setStarsTop(long top)` -> `void`
- `setSteps(int steps, int... stops)` -> `void`
- `setTopText(String text)` -> `void`
- `setValue(int value)` -> `void`
- `setValue(int value, boolean byScroll)` -> `void`
- `setValueAnimated(int value)` -> `void`
- `updateText(boolean animated)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Stars.StarsReactionsSheet$TopSendersView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setMyPrivacy(long peer)` -> `void`
- `setOnSenderClickListener(Utilities.Callback<Long> listener)` -> `void`
- `setSenders(ArrayList<SenderData> senders)` -> `void`

## `org.telegram.ui.Stars.StarsReactionsSheet$TopSendersView$Sender`
- `detach()` -> `void`
- `draw(Canvas canvas)` -> `void`
- `setAnonymous(boolean anonymous)` -> `void`
- `setPlace(int place)` -> `void`
- `setPrivacy(long peer)` -> `void`
- `setStars(long stars)` -> `void`

## `org.telegram.ui.bots.SetupEmojiStatusSheet`
- `static askPermission(int currentAccount, long botId, Utilities.Callback2<Boolean, String> whenDone)` -> `void`
- `static askPermission(int currentAccount, TLRPC.User bot, TLRPC.UserFull botFull, Utilities.Callback2<Boolean, String> whenDone)` -> `void`
- `static clear()` -> `void`
- `static getAccessRequested(Context context, int currentAccount, long botId)` -> `boolean`
- `static show(int currentAccount, TLRPC.User bot, long document_id, int duration, Utilities.Callback2<String, TLRPC.Document> whenDone)` -> `void`
- `static show(int currentAccount, TLRPC.User bot, TLRPC.Document document, int duration, Utilities.Callback<String> whenDone)` -> `void`

## `org.telegram.ui.bots.SetupEmojiStatusSheet$UserEmojiStatusDrawable`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `onAttachedToWindow(ImageReceiver parent)` -> `void`
- `onDetachedFromWindow(ImageReceiver parent)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setParent(View view)` -> `void`
- `setRandomStatus()` -> `void`
