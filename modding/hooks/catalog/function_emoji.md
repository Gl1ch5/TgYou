# function / emoji (161 методов)

## `org.telegram.messenger.AnimatedFileDrawableStream`
- `cancel()` -> `void`
- `cancel(boolean removeLoading)` -> `void`
- `getCurrentAccount()` -> `int`
- `getDocument()` -> `TLRPC.Document`
- `getFinishedFilePath()` -> `String`
- `getLocation()` -> `ImageLocation`
- `getParentObject()` -> `Object`
- `isCanceled()` -> `boolean`
- `isFinishedLoadingFile()` -> `boolean`
- `isPreview()` -> `boolean`
- `isWaitingForLoad()` -> `boolean`
- `newDataAvailable()` -> `void`
- `read(int offset, int readLength)` -> `int`
- `reset()` -> `void`

## `org.telegram.messenger.CompoundEmoji`
- `static applyColor(String code, String color)` -> `String`
- `static getCompoundEmojiDrawable(String string)` -> `CompoundEmojiDrawable`
- `static getCompoundEmojiDrawable(String string, Integer overrideSkinTone1, Integer overrideSkinTone2)` -> `CompoundEmojiDrawable`
- `static getSkinTone(String string)` -> `int`
- `static isCompound(String string)` -> `boolean`
- `static isHandshake(String code)` -> `Pair<Integer, Integer>`

## `org.telegram.messenger.CompoundEmoji$DrawableInfo`
- `hashCode()` -> `int`
- `isLoaded()` -> `boolean`
- `load()` -> `void`
- `updateSkin(int newSkin)` -> `DrawableInfo`

## `org.telegram.messenger.Emoji`
- `static addRecentEmoji(String code)` -> `void`
- `static clearRecentEmoji()` -> `void`
- `static endsWithRightArrow(CharSequence code)` -> `boolean`
- `static fixEmoji(String emoji)` -> `String`
- `static fullyConsistsOfEmojis(CharSequence cs)` -> `boolean`
- `static getEmojiBigDrawable(String code)` -> `Drawable`
- `static getEmojiDrawable(CharSequence code)` -> `EmojiDrawable`
- `static isValidEmoji(CharSequence code)` -> `boolean`
- `static loadBitmap(String path)` -> `Bitmap`
- `static loadRecentEmoji()` -> `void`
- `static parseEmojis(CharSequence cs)` -> `ArrayList<EmojiSpanRange>`
- `static parseEmojis(CharSequence cs, int[] emojiOnly)` -> `ArrayList<EmojiSpanRange>`
- `static preloadEmoji(CharSequence code)` -> `void`
- `static removeRecentEmoji(String code)` -> `void`
- `static replaceEmoji(CharSequence cs, Paint.FontMetricsInt fontMetrics, boolean createNew)` -> `CharSequence`
- `static replaceEmoji(CharSequence cs, Paint.FontMetricsInt fontMetrics, boolean createNew, float scale)` -> `CharSequence`
- `static replaceEmoji(CharSequence cs, Paint.FontMetricsInt fontMetrics, boolean createNew, int[] emojiOnly)` -> `CharSequence`
- `static replaceEmoji(CharSequence cs, Paint.FontMetricsInt fontMetrics, boolean createNew, int[] emojiOnly, int alignment)` -> `CharSequence`
- `static replaceEmoji(CharSequence cs, Paint.FontMetricsInt fontMetrics, boolean createNew, int[] emojiOnly, int alignment, float scale, int minusLimit)` -> `CharSequence`
- `static replaceWithRestrictedEmoji(CharSequence cs, TextView textView, Runnable update)` -> `CharSequence`
- `static replaceWithRestrictedEmoji(CharSequence cs, Paint.FontMetricsInt fontMetrics, Runnable update)` -> `CharSequence`
- `static replaceWithRestrictedEmoji(CharSequence cs, Paint.FontMetricsInt fontMetrics, int cacheType, Runnable update)` -> `CharSequence`
- `static saveEmojiColors()` -> `void`
- `static saveRecentEmoji()` -> `void`
- `static sortEmoji()` -> `void`

## `org.telegram.messenger.Emoji$EmojiSpan`
- `equals(Object o)` -> `boolean`
- `getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm)` -> `int`
- `replaceFontMetrics(Paint.FontMetricsInt newMetrics, int newSize)` -> `void`
- `replaceFontMetrics(Paint.FontMetricsInt newMetrics)` -> `void`
- `updateDrawState(TextPaint ds)` -> `void`

## `org.telegram.messenger.EmojiData`
- `static hasEmojiSupportVibration(String emoji)` -> `boolean`
- `static isCofinEmoji(String emoji)` -> `boolean`
- `static isHeartEmoji(String emoji)` -> `boolean`
- `static isPeachEmoji(String emoji)` -> `boolean`

## `org.telegram.messenger.EmojiPack`
- `clearCache()` -> `void`
- `getEmoji(int x, int y)` -> `Bitmap`
- `static getInstance()` -> `EmojiPack`

## `org.telegram.messenger.VideoEditedInfo$EmojiEntity`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.ui.Components.AnimatedEmojiDrawable`
- `addView(View callback)` -> `void`
- `addView(AnimatedEmojiSpan.InvalidateHolder holder)` -> `void`
- `addViewListening(View view)` -> `void`
- `canOverrideColor()` -> `boolean`
- `removeView(AnimatedEmojiSpan.InvalidateHolder holder)` -> `void`
- `removeView(View view)` -> `void`

## `org.telegram.ui.Components.AnimatedEmojiDrawable$EmojiDocumentFetcher`
- `fetchDocument(long id, ReceivedDocument onDone)` -> `void`
- `processDocuments(ArrayList<?> documents)` -> `void`
- `putDocument(TLRPC.Document document)` -> `void`
- `putDocuments(ArrayList<TLRPC.Document> documents)` -> `void`

## `org.telegram.ui.Components.AnimatedEmojiDrawable$SwapAnimatedEmojiDrawable`
- `removeOldDrawable()` -> `void`

## `org.telegram.ui.Components.AnimatedEmojiSpan$EmojiGroupedSpans`
- `add(Layout layout, AnimatedEmojiHolder holder)` -> `void`
- `hasLayout(Layout layout)` -> `boolean`
- `isEmpty()` -> `boolean`
- `remove(Layout layout, AnimatedEmojiHolder holder)` -> `void`
- `remove(int i)` -> `void`

## `org.telegram.ui.Components.AnimatedEmojiSpan$SpansChunk`
- `add(AnimatedEmojiHolder holder)` -> `void`
- `remove(AnimatedEmojiHolder holder)` -> `void`

## `org.telegram.ui.Components.AnimatedFileDrawable`
- `addParent(ImageReceiver imageReceiver)` -> `void`
- `addSecondParentView(View view)` -> `void`
- `checkCacheCancel()` -> `void`
- `checkRepeat()` -> `void`
- `hasBitmap()` -> `boolean`
- `hasParents()` -> `boolean`
- `removeParent(ImageReceiver imageReceiver)` -> `void`
- `removeSecondParentView(View view)` -> `void`

## `org.telegram.ui.Components.AnimatedFileNative`
- `isDestroyed()` -> `boolean`
- `isLastFrameOpaque()` -> `boolean`
- `isStaticVideoDetected()` -> `boolean`

## `org.telegram.ui.Components.AnimatedFloat`
- `isInProgress()` -> `boolean`

## `org.telegram.ui.Components.AnimatedLinearLayout$Holder`
- `hashCode()` -> `int`

## `org.telegram.ui.Components.AnimatedTextView`
- `cancelAnimation()` -> `void`

## `org.telegram.ui.Components.AnimatedTextView$AnimatedTextDrawable`
- `cancelAnimation()` -> `void`

## `org.telegram.ui.Components.EditTextEmoji`
- `onEmojiKeyboardUpdate()` -> `void`

## `org.telegram.ui.Components.EmojiPacksAlert`
- `canDismissWithSwipe()` -> `boolean`

## `org.telegram.ui.Components.EmojiPacksAlert$EmojiPacksLoader`
- `onUpdate()` -> `void`

## `org.telegram.ui.Components.EmojiView`
- `static addColorToCode(String code, String color)` -> `String`
- `addEmojiToRecent(String code)` -> `void`
- `addRecentGif(TLRPC.Document document)` -> `void`
- `addRecentSticker(TLRPC.Document document)` -> `void`
- `requestLayout()` -> `void`

## `org.telegram.ui.Components.EmojiView$EmojiGridAdapter`
- `processEmoji(boolean updateEmojipacks)` -> `void`

## `org.telegram.ui.Components.EmojiView$EmojiGridView`
- `requestLayout()` -> `void`

## `org.telegram.ui.Components.EmojiView$EmojiPagesAdapter`
- `canScrollToTab(int position)` -> `boolean`
- `isViewFromObject(View view, Object object)` -> `boolean`

## `org.telegram.ui.Components.EmojiView$EmojiViewDelegate`
- `canAddCaptionToGif(TLRPC.Document document)` -> `default boolean`
- `canSchedule()` -> `default boolean`
- `getDialogId()` -> `default long`
- `isExpanded()` -> `default boolean`
- `isInScheduleMode()` -> `default boolean`
- `isSearchOpened()` -> `default boolean`
- `isUserSelf()` -> `default boolean`

## `org.telegram.ui.Components.Premium.ReactionDrawingObject`
- `checkTap(float x, float y)` -> `boolean`

## `org.telegram.ui.Components.Reactions.AnimatedEmojiEffect`
- `isDone()` -> `boolean`
- `removeView(View view)` -> `void`

## `org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity`
- `canBeginSlide()` -> `boolean`

## `org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow`
- `getSelectAnimatedEmojiDialog()` -> `SelectAnimatedEmojiDialog`
- `isShowing()` -> `boolean`
- `removeView()` -> `void`

## `org.telegram.ui.Components.Reactions.CustomReactionEditText`
- `addReactionsSpan()` -> `void`
- `removeReactionsSpan(boolean animate)` -> `void`

## `org.telegram.ui.Components.Reactions.HwEmojis`
- `static isCascade()` -> `boolean`
- `static isFirstOpen()` -> `boolean`
- `static isHwEnabled()` -> `boolean`
- `static isHwEnabledOrPreparing()` -> `boolean`
- `static isPreparing()` -> `boolean`

## `org.telegram.ui.Components.Reactions.ReactionImageHolder`
- `isLoaded()` -> `boolean`

## `org.telegram.ui.Components.Reactions.ReactionsEffectOverlay`
- `static isPlaying(int messageId, long groupId, ReactionsLayoutInBubble.VisibleReaction reaction)` -> `boolean`
- `static removeCurrent(boolean instant)` -> `void`

## `org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble`
- `checkTouchEvent(MotionEvent event)` -> `boolean`
- `setMessage(MessageObject messageObject, boolean isSmall, boolean isTag, Theme.ResourcesProvider resourcesProvider)` -> `void`

## `org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble$ReactionButton`
- `isPlaying()` -> `boolean`
- `setUsers(ArrayList<TLObject> users)` -> `void`

## `org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble$ReactionLayoutButton`
- `removeImageReceiver()` -> `void`

## `org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble$VisibleReaction`
- `hashCode()` -> `int`
- `isSame(TLRPC.Reaction reaction)` -> `boolean`

## `org.telegram.ui.Components.Reactions.ReactionsUtils`
- `static addReactionToEditText(TLRPC.TL_availableReaction availableReaction, HashMap<Long, AnimatedEmojiSpan> selectedEmojis, List<Long> selectedEmojisIds, Editable editText, SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, Paint.FontMetricsInt fontMetricsInt)` -> `void`
- `static addReactionToEditText(TLRPC.TL_reactionCustomEmoji customEmoji, HashMap<Long, AnimatedEmojiSpan> selectedEmojis, List<Long> selectedEmojisIds, Editable editText, SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, Paint.FontMetricsInt fontMetricsInt)` -> `void`

## `org.telegram.ui.Components.Reactions.UpdateReactionsButton`
- `removeLvlRequiredState()` -> `void`

## `org.telegram.ui.Components.ReactionsContainerLayout$Adapter`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.Components.ReactionsContainerLayout$ReactionHolderView`
- `checkPlayLoopImage()` -> `void`

## `org.telegram.ui.Components.inset.WindowAnimatedInsetsProvider`
- `hasActiveAnimations()` -> `boolean`

## `org.telegram.ui.EmojiAnimationsOverlay`
- `cancelAllAnimations()` -> `void`
- `cancelHintRunnable()` -> `void`
- `checkPosition(ChatMessageCell messageCell, float chatListViewPaddingTop, int bottom)` -> `boolean`
- `checkStickerPack()` -> `void`
- `hasPlaying()` -> `boolean`
- `isIdle()` -> `boolean`

## `org.telegram.ui.EmojiAnimationsOverlay$DrawingObject`
- `isPlaying()` -> `boolean`

## `org.telegram.ui.SelectAnimatedEmojiDialog`
- `putAnimatedEmojiToCache(AnimatedEmojiDrawable animatedEmojiDrawable)` -> `void`

## `org.telegram.ui.SelectAnimatedEmojiDialog$EmojiListView`
- `canHighlightChildAt(View child, float x, float y)` -> `boolean`

## `org.telegram.ui.SelectAnimatedEmojiDialog$SearchBox`
- `checkInitialization()` -> `void`

## `org.telegram.ui.Stars.StarsController$PendingPaidReactions`
- `add(long amount, boolean affect)` -> `void`
- `cancel()` -> `void`
- `isAnonymous()` -> `boolean`

## `org.telegram.ui.Stars.StarsReactionsSheet$Particles`
- `process()` -> `boolean`
- `removeParticlesOutside()` -> `void`

## `org.telegram.ui.bots.SetupEmojiStatusSheet`
- `static saveAccessRequested(Context context, int currentAccount, long botId)` -> `void`
