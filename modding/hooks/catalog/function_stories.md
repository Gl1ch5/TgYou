# function / stories (284 методов)

## `org.telegram.messenger.SendMessagesHelper$ImportingHistory`
- `getTotalCount()` -> `long`
- `getUploadedCount()` -> `long`
- `setImportProgress(int value)` -> `void`

## `org.telegram.ui.Components.ClearHistoryAlert`
- `canDismissWithSwipe()` -> `boolean`

## `org.telegram.ui.Components.SharedMediaLayout$StoriesAdapter`
- `canReorder(int position)` -> `boolean`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `isSelectedAll()` -> `boolean`
- `load(boolean force)` -> `void`

## `org.telegram.ui.Stories.DialogStoriesCell$Adapter`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.Stories.DialogStoriesCell$Item`
- `hashCode()` -> `int`

## `org.telegram.ui.Stories.HwFrameLayout`
- `checkHwAcceleration(float progress)` -> `void`

## `org.telegram.ui.Stories.LiveCommentsView`
- `cancelStars()` -> `void`
- `delete(int id)` -> `void`
- `deleteAllFrom(long peer)` -> `void`
- `onMessagesCountUpdated()` -> `void`
- `onStarsCountUpdated()` -> `void`
- `saveHistory()` -> `void`
- `send(TLRPC.TL_textWithEntities text, long stars)` -> `int`
- `send(long send_as, TLRPC.TL_textWithEntities text, long stars)` -> `int`
- `sendStars(long stars, boolean withEffects)` -> `void`

## `org.telegram.ui.Stories.LiveCommentsView$TopSender`
- `isExpired(int now)` -> `boolean`

## `org.telegram.ui.Stories.LivePlayer`
- `canContinueEmptyStream()` -> `boolean`
- `getSendPaidMessagesStars()` -> `long`
- `isAdmin()` -> `boolean`
- `isAdmin(int action)` -> `boolean`
- `isConnected()` -> `boolean`
- `isCreator()` -> `boolean`
- `isEmptyStream()` -> `boolean`
- `isMuted()` -> `boolean`
- `sendAsDisabled()` -> `boolean`

## `org.telegram.ui.Stories.MessageMediaStoryFull`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.ui.Stories.MessageMediaStoryFull_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.ui.Stories.PaidReactionButton$PaidReactionButtonEffectsView`
- `removeChipsFrom(long dialogId)` -> `void`

## `org.telegram.ui.Stories.PeerStoriesView`
- `cancelTextSelection()` -> `void`
- `cancelTouch()` -> `void`
- `checkPinchToZoom(MotionEvent ev)` -> `void`
- `checkReactionEvent(MotionEvent ev)` -> `boolean`
- `checkReactionsLayout()` -> `void`
- `checkReactionsLayoutForLike()` -> `void`
- `checkRecordLocked(boolean forceCloseOnDiscard)` -> `boolean`
- `checkTextSelectionEvent(MotionEvent ev)` -> `boolean`

## `org.telegram.ui.Stories.PeerStoriesView$StoryItemHolder`
- `cancelOrDelete()` -> `void`
- `checkSendView()` -> `void`
- `hasSound()` -> `boolean`
- `isEmpty()` -> `boolean`
- `isLive()` -> `boolean`
- `isThisCall(long callId)` -> `boolean`
- `isVideo()` -> `boolean`

## `org.telegram.ui.Stories.SelfStoryViewsPage$FiltersState`
- `hashCode()` -> `int`
- `isDefault()` -> `boolean`

## `org.telegram.ui.Stories.SelfStoryViewsPage$ViewsModel`
- `addListener(SelfStoryViewsPage listener)` -> `void`
- `loadNext()` -> `void`
- `removeListener(SelfStoryViewsPage listener)` -> `void`

## `org.telegram.ui.Stories.StoriesController`
- `static addOrRemoveStoryItemAlbum(TL_stories.StoryItem item, int albumId, boolean remove)` -> `boolean`
- `addStoriesToAlbum(long dialogId, int albumId, ArrayList<TL_stories.StoryItem> storyItems)` -> `void`
- `addStoryToAlbum(long dialogId, int albumId, TL_stories.StoryItem storyItem)` -> `void`
- `canCreateNewAlbum(long dialogId)` -> `boolean`
- `canDeleteStory(TL_stories.StoryItem storyItem)` -> `boolean`
- `canEditStories(long dialogId)` -> `boolean`
- `canEditStories(TLRPC.Chat chat)` -> `boolean`
- `canEditStory(TL_stories.StoryItem storyItem)` -> `boolean`
- `canEditStoryAlbums(long dialogId)` -> `boolean`
- `canPostStories(TLRPC.Chat chat)` -> `boolean`
- `canPostStories(long dialogId)` -> `boolean`
- `canSendStoryFor(long dialogId, Utilities.Callback<Boolean> consumer, boolean showLimitsBottomSheet, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `checkExpiredStories()` -> `void`
- `checkExpiredStories(long dialogId)` -> `void`
- `checkStoryError(TLRPC.TL_error err)` -> `boolean`
- `checkStoryLimit()` -> `StoryLimit`
- `checkUnsupportedStory(long dialogId, int storyId)` -> `void`
- `deleteStories(long dialogId, ArrayList<TL_stories.StoryItem> storyItems)` -> `void`
- `deleteStory(long dialogId, TL_stories.StoryItem storyItem)` -> `void`
- `getDialogListStories()` -> `ArrayList<TL_stories.PeerStories>`
- `hasHiddenStories()` -> `boolean`
- `hasLiveStory(long dialogId)` -> `boolean`
- `hasLoadingStories()` -> `boolean`
- `hasOnlySelfStories()` -> `boolean`
- `hasSelfStories()` -> `boolean`
- `hasStories(long dialogId)` -> `boolean`
- `hasStories()` -> `boolean`
- `hasStoryLimit()` -> `boolean`
- `hasStoryLimit(int count)` -> `boolean`
- `hasUnreadStories(long dialogId)` -> `boolean`
- `hasUnreadStoriesLive(long dialogId)` -> `int`
- `hasUploadingStories(long dialogId)` -> `boolean`
- `isBlocked(TL_stories.StoryView storyView)` -> `boolean`
- `isBlocked(long did)` -> `boolean`
- `isLastUploadingFailed(long dialogId)` -> `boolean`
- `isLoading(long dialogId)` -> `boolean`
- `loadAllStories()` -> `void`
- `loadBlocklist(boolean reset)` -> `void`
- `loadBlocklistAtFirst()` -> `void`
- `loadHiddenStories()` -> `void`
- `loadNextStories(boolean hidden)` -> `void`
- `loadSendAs()` -> `void`
- `loadSkippedStories(long dialogId)` -> `void`
- `loadSkippedStories(TL_stories.PeerStories userStories, boolean profile)` -> `void`
- `loadStories()` -> `void`
- `markStoriesAsReadFromServer(long dialogId, int maxStoryId)` -> `void`
- `markStoryAsRead(long dialogId, TL_stories.StoryItem storyItem)` -> `boolean`
- `markStoryAsRead(TL_stories.PeerStories userStories, TL_stories.StoryItem storyItem, boolean profile)` -> `boolean`
- `processUpdate(TL_stories.TL_updateStory updateStory)` -> `void`
- `putStories(long dialogId, TL_stories.PeerStories stories)` -> `void`
- `putUploadingDrafts(ArrayList<StoryEntry> entries)` -> `void`
- `removeAlbum(long dialogId, int albumId)` -> `void`
- `removeContact(long dialogId)` -> `void`
- `removeStoriesFromAlbum(long dialogId, int albumId, ArrayList<TL_stories.StoryItem> storyItems)` -> `void`
- `removeStoryFromAlbum(long dialogId, int albumId, TL_stories.StoryItem storyItem)` -> `void`

## `org.telegram.ui.Stories.StoriesController$BotPreviewsList`
- `delete(ArrayList<TLRPC.MessageMedia> medias)` -> `void`
- `delete(TLRPC.MessageMedia media)` -> `void`
- `edit(TLRPC.InputMedia old_media, TL_bots.botPreviewMedia new_media)` -> `void`
- `isLoading()` -> `boolean`
- `isOnlyCache()` -> `boolean`
- `load(boolean force, int count, List<Integer> ids)` -> `boolean`
- `loadInternal(Runnable callback)` -> `boolean`
- `markAsRead(int storyId)` -> `boolean`
- `requestReference(BotPreview story, Utilities.Callback<BotPreview> whenUpdated)` -> `void`
- `saveCache()` -> `void`

## `org.telegram.ui.Stories.StoriesController$SearchStoriesList`
- `cancel()` -> `void`
- `isLoading()` -> `boolean`
- `isOnlyCache()` -> `boolean`
- `load(boolean force, int count, List<Integer> ids)` -> `boolean`
- `markAsRead(int storyId)` -> `boolean`
- `saveCache()` -> `void`

## `org.telegram.ui.Stories.StoriesController$StoriesCollections`
- `addStories(int album_id, ArrayList<TL_stories.StoryItem> storyItems)` -> `void`
- `canCreateNewAlbum()` -> `boolean`
- `load()` -> `void`
- `removeCollection(int id)` -> `void`
- `removeStories(int album_id, ArrayList<TL_stories.StoryItem> storyItems)` -> `void`
- `sendOrder()` -> `void`

## `org.telegram.ui.Stories.StoriesController$StoriesList`
- `canLoad()` -> `boolean`
- `isError()` -> `boolean`
- `isFull()` -> `boolean`
- `isLoading()` -> `boolean`
- `isOnlyCache()` -> `boolean`
- `isPinned(int storyId)` -> `boolean`
- `load(boolean force, final int count)` -> `boolean`
- `load(List<Integer> ids)` -> `boolean`
- `load(boolean force, final int count, List<Integer> ids)` -> `boolean`
- `markAsRead(int storyId)` -> `boolean`
- `saveCache()` -> `void`

## `org.telegram.ui.Stories.StoriesController$StoryRepostsList`
- `isLoading()` -> `boolean`
- `isOnlyCache()` -> `boolean`
- `load(boolean force, int count, List<Integer> ids)` -> `boolean`
- `markAsRead(int storyId)` -> `boolean`
- `saveCache()` -> `void`

## `org.telegram.ui.Stories.StoriesController$UploadingStory`
- `cancel()` -> `void`
- `isCloseFriends()` -> `boolean`

## `org.telegram.ui.Stories.StoriesListPlaceProvider`
- `addBottomClip(int x)` -> `StoriesListPlaceProvider`
- `loadNext(boolean forward)` -> `void`

## `org.telegram.ui.Stories.StoriesStorage`
- `static checkExpiredStateLocal(int currentAccount, long dialogId, TL_stories.StoryItem storyItem)` -> `TL_stories.StoryItem`
- `deleteAllUserStories(long dialogId)` -> `void`
- `deleteStories(long dialogId, ArrayList<Integer> storyIds)` -> `void`
- `deleteStory(long dialogId, int storyId)` -> `void`
- `processUpdate(TL_stories.TL_updateStory updateStory)` -> `void`
- `putPeerStories(TL_stories.PeerStories userStories)` -> `void`
- `putStoriesInternal(long dialogId, TL_stories.PeerStories userStories)` -> `void`
- `putStoryInternal(long dialogId, TL_stories.StoryItem storyItem)` -> `void`
- `saveAllStories(ArrayList<TL_stories.PeerStories> user_stories, boolean isNext, boolean hidden, Runnable callback)` -> `void`

## `org.telegram.ui.Stories.StoriesUtilities`
- `static hasExpiredViews(TL_stories.StoryItem storyItem)` -> `boolean`
- `static isExpired(int currentAccount, TL_stories.StoryItem storyItem)` -> `boolean`

## `org.telegram.ui.Stories.StoriesUtilities$AvatarStoryParams`
- `checkOnTouchEvent(MotionEvent event, View view)` -> `boolean`
- `isAvatarClickable(long dialogId, TLRPC.Chat chat, TLRPC.User user)` -> `boolean`

## `org.telegram.ui.Stories.StoriesUtilities$EnsureStoryFileLoadedObject`
- `cancel()` -> `void`

## `org.telegram.ui.Stories.StoriesUtilities$StoryGradientTools`
- `setChat(TLRPC.Chat chat, boolean animated)` -> `void`
- `setUser(TLRPC.User user, boolean animated)` -> `void`

## `org.telegram.ui.Stories.StoriesUtilities$UserStoriesLoadOperation`
- `cancel()` -> `void`
- `load(long dialogId, View view, AvatarStoryParams params)` -> `void`

## `org.telegram.ui.Stories.StoriesViewPager`
- `canScroll(float dx)` -> `boolean`
- `checkAllowScreenshots()` -> `void`
- `checkPageVisibility()` -> `void`
- `requestDisallowInterceptTouchEvent(boolean disallowIntercept)` -> `void`

## `org.telegram.ui.Stories.StoryCaptionView`
- `cancelTouch()` -> `void`
- `hasScroll()` -> `boolean`

## `org.telegram.ui.Stories.StoryCaptionView$Panel`
- `load()` -> `void`

## `org.telegram.ui.Stories.StoryContainsEmojiButton`
- `load(int currentAccount, boolean requestStickers, TLObject obj, ArrayList<TLRPC.InputStickerSet> additionalEmojiSets, Object parentObject)` -> `void`

## `org.telegram.ui.Stories.StoryCustomParamsHelper`
- `static isEmpty(TL_stories.StoryItem storyItem)` -> `boolean`
- `static readLocalParams(TL_stories.StoryItem storyItem, NativeByteBuffer byteBuffer)` -> `void`

## `org.telegram.ui.Stories.StoryCustomParamsHelper$Params_v1`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.ui.Stories.StoryMediaAreasView`
- `hasAreaAboveAt(float x, float y)` -> `boolean`
- `hasClickableViews(float x, float y)` -> `boolean`
- `hasSelected()` -> `boolean`
- `hasSelectedForScale()` -> `boolean`
- `onStoryItemUpdated(TL_stories.StoryItem storyItem, boolean animated)` -> `void`

## `org.telegram.ui.Stories.StoryViewer`
- `cancelSwipeToReply()` -> `void`
- `cancelSwipeToViews(boolean open)` -> `void`
- `checkNavBarColor()` -> `void`
- `checkSelfStoriesView()` -> `void`
- `isAttachedLightStatusBar()` -> `boolean`
- `isFullyVisible()` -> `boolean`
- `isPaused()` -> `boolean`
- `static isShowingImage(MessageObject messageObject)` -> `boolean`
- `isShown()` -> `boolean`
- `saveDraft(long dialogId, TL_stories.StoryItem storyItem, CharSequence text)` -> `void`

## `org.telegram.ui.Stories.StoryWaveEffectView`
- `onSurfaceTextureUpdated(@NonNull SurfaceTexture surface)` -> `void`

## `org.telegram.ui.Stories.UserListPoller`
- `checkList(RecyclerListView recyclerListView)` -> `void`

## `org.telegram.ui.Stories.bots.BotPreviewsEditContainer`
- `addTranslation()` -> `void`
- `canScroll(boolean forward)` -> `boolean`
- `checkPinchToZoom(MotionEvent ev)` -> `boolean`
- `deleteLang(String lang)` -> `void`
- `static edit(int currentAccount, long did, String lang_code, TLRPC.InputMedia old_media, TL_bots.botPreviewMedia media)` -> `void`

## `org.telegram.ui.Stories.bots.BotPreviewsEditContainer$BotPreviewsEditLangContainer`
- `checkPinchToZoom(MotionEvent ev)` -> `boolean`

## `org.telegram.ui.Stories.bots.BotPreviewsEditContainer$BotPreviewsEditLangContainer$StoriesAdapter`
- `canReorder(int position)` -> `boolean`
- `load(boolean force)` -> `void`

## `org.telegram.ui.Stories.recorder.CaptionContainerView`
- `additionalKeyboardHeight()` -> `int`
- `additionalRightMargin()` -> `int`
- `onUpdateShowKeyboard(float keyboardT)` -> `void`

## `org.telegram.ui.Stories.recorder.CaptionStory`
- `additionalRightMargin()` -> `int`
- `canRecord()` -> `boolean`
- `onUpdateShowKeyboard(float keyboardT)` -> `void`
- `putRecorder(RoundVideoRecorder recorder)` -> `void`

## `org.telegram.ui.Stories.recorder.CollageLayout`
- `delete(int index)` -> `CollageLayout`

## `org.telegram.ui.Stories.recorder.CollageLayoutView2`
- `cancelTouch()` -> `boolean`
- `delete(Part part)` -> `void`
- `hasContent()` -> `boolean`
- `hasLayout()` -> `boolean`
- `hasVideo()` -> `boolean`
- `onLayoutUpdate(CollageLayout layout)` -> `void`

## `org.telegram.ui.Stories.recorder.CollageLayoutView2$Part`
- `hasContent()` -> `boolean`
- `isEmpty()` -> `boolean`

## `org.telegram.ui.Stories.recorder.DraftsController`
- `delete(StoryEntry entry)` -> `void`
- `delete(ArrayList<StoryEntry> entries)` -> `void`
- `deleteExpired()` -> `void`
- `deleteForEdit(TL_stories.StoryItem storyItem)` -> `void`
- `deleteForEdit(long peerId, int storyId)` -> `void`
- `edit(StoryEntry entry)` -> `void`
- `load()` -> `void`
- `saveForEdit(StoryEntry entry, long dialogId, TL_stories.StoryItem storyItem)` -> `void`

## `org.telegram.ui.Stories.recorder.EmojiBottomSheet`
- `canClickWidget(Integer id)` -> `boolean`
- `canDismissWithSwipe()` -> `boolean`
- `canShowWidget(Integer id)` -> `boolean`
- `checkAudioPermission(Runnable granted)` -> `boolean`
- `hasWidgets()` -> `boolean`

## `org.telegram.ui.Stories.recorder.EmojiBottomSheet$SearchField`
- `checkCategoriesView(int type, boolean greeting)` -> `void`

## `org.telegram.ui.Stories.recorder.FlashViews`
- `add(Invertable view)` -> `void`
- `remove(Invertable view)` -> `void`

## `org.telegram.ui.Stories.recorder.LivePlayerView`
- `requestLayout()` -> `void`

## `org.telegram.ui.Stories.recorder.PaintView`
- `checkAudioPermission(Runnable granted)` -> `boolean`
- `deleteRound()` -> `void`
- `editSelectedTextEntity()` -> `void`
- `hasBlur()` -> `boolean`
- `hasChanges()` -> `boolean`
- `removeCurrentEntity()` -> `void`
- `requestLayout()` -> `void`

## `org.telegram.ui.Stories.recorder.PreviewView`
- `additionalTouchEvent(MotionEvent ev)` -> `boolean`
- `checkVolumes()` -> `void`

## `org.telegram.ui.Stories.recorder.QRScanner`
- `isPaused()` -> `boolean`

## `org.telegram.ui.Stories.recorder.QRScanner$QrRegionDrawer`
- `hasNoDraw()` -> `boolean`

## `org.telegram.ui.Stories.recorder.RecordControl`
- `hasCheck()` -> `boolean`

## `org.telegram.ui.Stories.recorder.RoundVideoRecorder`
- `cancel()` -> `void`

## `org.telegram.ui.Stories.recorder.ScannedLinkPreview`
- `cancel()` -> `void`

## `org.telegram.ui.Stories.recorder.StoryEntry`
- `static canRepostMessage(MessageObject messageObject)` -> `boolean`
- `cancelCheckStickers()` -> `void`
- `checkStickers(TL_stories.StoryItem storyItem)` -> `void`
- `static getRepostDialogId(MessageObject messageObject)` -> `long`
- `static getRepostMessageId(MessageObject messageObject)` -> `int`
- `hasVideo()` -> `boolean`
- `isCollage()` -> `boolean`

## `org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet`
- `canDismissWithSwipe()` -> `boolean`
- `canSwipeToBack(MotionEvent event)` -> `boolean`

## `org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$ChoosePeerSheet`
- `canDismissWithSwipe()` -> `boolean`

## `org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$Page$Adapter`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$SearchUsersCell`
- `requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate)` -> `boolean`

## `org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$SearchUsersCell$SpansContainer`
- `removeAllSpans(boolean animated)` -> `void`
- `removeSpan(final GroupCreateSpan span)` -> `void`

## `org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$StoryPrivacy`
- `isCloseFriends()` -> `boolean`
- `isNone()` -> `boolean`
- `isShare()` -> `boolean`

## `org.telegram.ui.Stories.recorder.StoryPrivacySelector`
- `static save(int currentAccount, StoryPrivacyBottomSheet.StoryPrivacy privacy)` -> `void`

## `org.telegram.ui.Stories.recorder.StoryRecorder`
- `addNotificationObservers()` -> `void`
- `canChangePeer(boolean b)` -> `StoryRecorder`
- `static isVisible()` -> `boolean`
- `removeNotificationObservers()` -> `void`

## `org.telegram.ui.Stories.recorder.StoryRecorder$WindowView`
- `cancelGestures()` -> `void`

## `org.telegram.ui.Stories.recorder.StoryRecorder$WindowView$GestureListener`
- `hasDoubleTap(MotionEvent e)` -> `boolean`

## `org.telegram.ui.Stories.recorder.Weather`
- `static fetch(boolean withProgress, Utilities.Callback<State> whenFetched)` -> `void`
- `static fetch(double lat, double lng, Utilities.Callback<State> whenFetched)` -> `Runnable`
- `static getUserLocation(boolean withProgress, Utilities.Callback<Location> whenGot)` -> `void`
- `static isDefaultCelsius()` -> `boolean`

## `org.telegram.ui.iv.RichEditorHistory`
- `canRedo()` -> `boolean`
- `canUndo()` -> `boolean`

## `org.telegram.ui.web.BrowserHistory$Entry`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.ui.web.HistoryFragment`
- `isLightStatusBar()` -> `boolean`
- `isSelected(MessageObject msg)` -> `boolean`
