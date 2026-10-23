# visual / media (2575 методов)

## `org.telegram.messenger.MediaController`
- `setTextureView(TextureView textureView, AspectRatioFrameLayout aspectRatioFrameLayout, FrameLayout container, boolean set)` -> `void`
- `setTextureView(TextureView textureView, AspectRatioFrameLayout aspectRatioFrameLayout, FrameLayout container, boolean set, Runnable afterPip)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichAudioBlock`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.messenger.camera.CameraView`
- `destroy(boolean async, final Runnable beforeDestroyRunnable)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `dualToggleShape()` -> `void`
- `focusToPoint(int x, int y, boolean visible)` -> `void`
- `focusToPoint(int i, int x, int y, int vx, int vy, boolean visible)` -> `void`
- `focusToPoint(int x, int y)` -> `void`
- `getBlurRenderNode()` -> `Object`
- `getCameraSession()` -> `CameraSessionWrapper`
- `getCameraSession(int i)` -> `CameraSessionWrapper`
- `getCameraSessionObject()` -> `Object`
- `getCameraSessionRecording()` -> `CameraSessionWrapper`
- `getDualPosition()` -> `Matrix`
- `getDualShape()` -> `int`
- `getMatrix()` -> `Matrix`
- `getPreviewSize()` -> `Size`
- `getTextureHeight(float width, float height)` -> `float`
- `getTextureView()` -> `TextureView`
- `getVideoHeight()` -> `int`
- `getVideoWidth()` -> `int`
- `initTexture()` -> `void`
- `invalidate()` -> `void`
- `invalidate(Rect dirty)` -> `void`
- `invalidate(int l, int t, int r, int b)` -> `void`
- `static isCameraAllowed()` -> `boolean`
- `isDual()` -> `boolean`
- `isFrontface()` -> `boolean`
- `isInited()` -> `boolean`
- `listenDraw(Runnable listener)` -> `void`
- `makeBlurTextureView()` -> `TextureView`
- `onAttachedToWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onDualCameraSuccess()` -> `void`
- `onError(int errorId, Camera camera, CameraSessionWrapper cameraSession)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height)` -> `void`
- `onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture)` -> `boolean`
- `onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int surfaceW, int surfaceH)` -> `void`
- `pauseAsTakingPicture()` -> `void`
- `receivedAmplitude(double amplitude)` -> `void`
- `resetCamera()` -> `void`
- `runHaptic()` -> `void`
- `setClipBottom(int value)` -> `void`
- `setClipTop(int value)` -> `void`
- `setDelegate(CameraViewDelegate cameraViewDelegate)` -> `void`
- `setFpsLimit(int fpsLimit)` -> `void`
- `setMirror(boolean value)` -> `void`
- `setOptimizeForBarcode(boolean value)` -> `void`
- `setRecordFile(File generateVideoPath)` -> `void`
- `setThumbDrawable(Drawable drawable)` -> `void`
- `setUseMaxPreview(boolean value)` -> `void`
- `setZoom(float value)` -> `void`
- `showTexture(boolean show, boolean animated)` -> `void`
- `square()` -> `boolean`
- `startRecording(File path, Runnable onFinished)` -> `boolean`
- `startSwitchingAnimation()` -> `void`
- `startTakePictureAnimation(boolean haptic)` -> `void`
- `stopRecording()` -> `void`
- `switchCamera()` -> `void`
- `toggleDual()` -> `void`
- `toggleDual(boolean force)` -> `void`
- `unlistenDraw(Runnable listener)` -> `void`
- `updateDualPosition()` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.messenger.pip.PipActivityContentLayout`
- `isViewInPip()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.messenger.pip.PipSource`
- `invalidateActions()` -> `void`
- `invalidateAvailability()` -> `void`
- `invalidatePosition()` -> `void`

## `org.telegram.messenger.pip.PipSourceContentView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.messenger.pip.source.IPipSourceDelegate`
- `pipRenderBackground(Canvas canvas)` -> `default void`

## `org.telegram.messenger.pip.source.PipSourceHandlerState2`
- `draw(Canvas canvas, Utilities.Callback<Canvas> content)` -> `void`
- `updatePositionViewRect(int width, int height, boolean isInPipMode)` -> `void`

## `org.telegram.messenger.pip.source.PipSourcePlaceholder$PlaceholderDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setBounds(int left, int top, int right, int bottom)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.messenger.pip.source.PipSourceSnapshot`
- `draw(Canvas canvas, float alpha)` -> `void`

## `org.telegram.messenger.video.OldVideoPlayerRewinder`
- `updateRewindProgressUi(long timeDiff, float progress, boolean rewindByBackSeek)` -> `void`

## `org.telegram.messenger.video.VideoPlayerHolderBase`
- `prepareStub()` -> `void`

## `org.telegram.messenger.video.VideoPlayerRewinder`
- `updateRewindProgressUi(long timeDiff, float progress, boolean rewindByBackSeek)` -> `void`

## `org.telegram.messenger.wallpaper.WallpaperGiftBitmapDrawable`
- `static create(Bitmap bitmap, List<WallpaperGiftPatternPosition> positions)` -> `BitmapDrawable`

## `org.telegram.ui.Adapters.StickersAdapter`
- `clearSearch()` -> `void`
- `didReceivedNotification(int id, int account, final Object... args)` -> `void`
- `getItem(int i)` -> `Object`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `getQuery()` -> `String`
- `hide()` -> `void`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `isShowingKeywords()` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup viewGroup, int viewType)` -> `RecyclerView.ViewHolder`
- `onDestroy()` -> `void`
- `searchEmojiByKeyword(CharSequence emoji)` -> `void`

## `org.telegram.ui.Adapters.StickersSearchAdapter`
- `getItem(int i)` -> `Object`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `getSetForPosition(int position)` -> `TLRPC.StickerSetCovered`
- `getSpanSize(int position)` -> `int`
- `getThemeDescriptions(List<ThemeDescription> descriptions, RecyclerListView listView, ThemeDescription.ThemeDescriptionDelegate delegate)` -> `void`
- `installStickerSet(TLRPC.InputStickerSet inputSet)` -> `void`
- `installStickerSet(TLRPC.StickerSetCovered pack, FeaturedStickerSetInfoCell cell)` -> `void`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position, @NonNull List payloads)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `search(String text)` -> `void`
- `updateColors(RecyclerListView listView)` -> `void`

## `org.telegram.ui.ArchivedStickersActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSupportEdgeToEdge()` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `onTransitionAnimationStart(boolean isOpen, boolean backward)` -> `void`

## `org.telegram.ui.ArchivedStickersActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.ArticleViewer$BlockAudioCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `getMessageObject()` -> `MessageObject`
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
- `setBlock(TL_iv.pageBlockAudio block, boolean first, boolean last)` -> `void`
- `updateButtonState(boolean animated)` -> `void`
- `updatePlayingMessageProgress()` -> `void`

## `org.telegram.ui.ArticleViewer$PageBlocksPhotoViewerProvider`
- `getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int index, boolean needPreview, boolean closing)` -> `PhotoViewer.PlaceProviderObject`
- `onClose()` -> `void`
- `onReleasePlayerBeforeClose(int photoIndex)` -> `void`

## `org.telegram.ui.AudioRecorderSettingsActivity`
- `createView(Context context)` -> `View`

## `org.telegram.ui.AudioRecorderSettingsActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.CachedMediaLayout$VoiceAdapter`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.CameraScanActivity`
- `static createThresholdMatrix(int threshold)` -> `ColorMatrix`
- `createView(Context context)` -> `View`
- `destroy(boolean async, final Runnable beforeDestroyRunnable)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onActivityResultFragment(int requestCode, int resultCode, Intent data)` -> `void`
- `onFragmentDestroy()` -> `void`
- `setDelegate(CameraScanActivityDelegate cameraScanActivityDelegate)` -> `void`
- `static showAsSheet(BaseFragment parentFragment, boolean gallery, int type, CameraScanActivityDelegate cameraDelegate)` -> `BottomSheet`
- `static showAsSheet(Activity parentActivity, boolean gallery, int type, CameraScanActivityDelegate cameraDelegate)` -> `BottomSheet`

## `org.telegram.ui.CameraScanActivity$CameraScanActivityDelegate`
- `didFindMrzInfo(MrzRecognizer.Result result)` -> `default void`
- `didFindQr(String text)` -> `default void`
- `getSubtitleText()` -> `default String`
- `onDismiss()` -> `default void`

## `org.telegram.ui.Cells.ActiveGiftAuctionsHintCell`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Cells.ActiveGiftAuctionsHintCell$CountDown`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `start(int endTime)` -> `void`
- `stop()` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Cells.ArchivedStickerSetCell`
- `getStickersSet()` -> `TLRPC.StickerSetCovered`
- `isChecked()` -> `boolean`
- `measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed)` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setChecked(boolean checked, boolean animated, boolean notify)` -> `void`
- `setDrawProgress(boolean drawProgress, boolean animated)` -> `void`
- `setOnCheckedChangeListener(OnCheckedChangeListener listener)` -> `void`
- `setStickersSet(TLRPC.StickerSetCovered set, boolean divider)` -> `void`
- `toggle()` -> `void`

## `org.telegram.ui.Cells.AudioPlayerCell`
- `didPressedButton()` -> `void`
- `getMessageObject()` -> `MessageObject`
- `getObserverTag()` -> `int`
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
- `setMessageObject(MessageObject messageObject, boolean reorder, View.OnClickListener onOptions, boolean needDivider, View.OnTouchListener onReorderTouchListener)` -> `void`
- `updateButtonState(boolean ifSame, boolean animated)` -> `void`

## `org.telegram.ui.Cells.FeaturedStickerSetCell`
- `getStickerSet()` -> `TLRPC.StickerSetCovered`
- `isInstalled()` -> `boolean`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAddOnClickListener(OnClickListener onClickListener)` -> `void`
- `setDrawProgress(boolean value, boolean animated)` -> `void`
- `setStickersSet(TLRPC.StickerSetCovered set, boolean divider, boolean unread)` -> `void`

## `org.telegram.ui.Cells.FeaturedStickerSetCell2`
- `static createThemeDescriptions(List<ThemeDescription> descriptions, RecyclerListView listView, ThemeDescription.ThemeDescriptionDelegate delegate)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getImageView()` -> `BackupImageView`
- `getStickerSet()` -> `TLRPC.StickerSetCovered`
- `getTextView()` -> `TextView`
- `isInstalled()` -> `boolean`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onPremiumButtonClick()` -> `void`
- `setAddOnClickListener(OnClickListener onClickListener)` -> `void`
- `setDrawProgress(boolean value, boolean animated)` -> `void`
- `setStickersSet(TLRPC.StickerSetCovered set, boolean divider, boolean unread, boolean forceInstalled, boolean animated)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Cells.FeaturedStickerSetCell2$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `FeaturedStickerSetCell2`
- `static of(TLRPC.StickerSetCovered set)` -> `UItem`

## `org.telegram.ui.Cells.FeaturedStickerSetInfoCell`
- `static createThemeDescriptions(List<ThemeDescription> descriptions, RecyclerListView listView, ThemeDescription.ThemeDescriptionDelegate delegate)` -> `void`
- `getStickerSet()` -> `TLRPC.StickerSetCovered`
- `isInstalled()` -> `boolean`
- `isNeedDivider()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAddDrawProgress(boolean drawProgress, boolean animated)` -> `void`
- `setAddOnClickListener(OnClickListener onClickListener)` -> `void`
- `setNeedDivider(boolean needDivider)` -> `void`
- `setStickerSet(TLRPC.StickerSetCovered stickerSet, boolean unread)` -> `void`
- `setStickerSet(TLRPC.StickerSetCovered stickerSet, boolean unread, boolean animated)` -> `void`
- `setStickerSet(TLRPC.StickerSetCovered stickerSet, boolean unread, boolean animated, int index, int searchLength)` -> `void`
- `setStickerSet(TLRPC.StickerSetCovered stickerSet, boolean unread, boolean animated, int index, int searchLength, boolean forceInstalled)` -> `void`
- `setUrl(CharSequence text, int searchLength)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Cells.PhotoAttachCameraCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setItemSize(int size)` -> `void`

## `org.telegram.ui.Cells.SharedAudioCell`
- `didPressedButton()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getMessage()` -> `MessageObject`
- `getObserverTag()` -> `int`
- `initStreamingIcons()` -> `void`
- `isDownloaded()` -> `boolean`
- `needPlayMessage(MessageObject messageObject)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onFailedDownload(String fileName, boolean canceled)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onProgressDownload(String fileName, long downloadSize, long totalSize)` -> `void`
- `onProgressUpload(String fileName, long uploadedSize, long totalSize, boolean isEncrypted)` -> `void`
- `onSuccessDownload(String fileName)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `performAccessibilityAction(int action, Bundle arguments)` -> `boolean`
- `setCheckForButtonPress(boolean value)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setEnterAnimationAlpha(float alpha)` -> `void`
- `setGlobalGradientView(FlickerLoadingView globalGradientView)` -> `void`
- `setMessageObject(MessageObject messageObject, boolean divider)` -> `void`
- `setNeedPlayMessageListener(Utilities.CallbackReturn<MessageObject, Boolean> listener)` -> `void`
- `showName(boolean show, boolean animated)` -> `void`
- `showReorderIcon(boolean show, boolean animated)` -> `void`
- `updateButtonState(boolean ifSame, boolean animated)` -> `void`

## `org.telegram.ui.Cells.SharedAudioCell$Factory`
- `static as(MessageObject messageObject, Utilities.CallbackReturn<MessageObject, Boolean> playAudio)` -> `UItem`
- `static as(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn<MessageObject, Boolean> playAudio)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `contentsEquals(UItem a, UItem b)` -> `boolean`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `SharedAudioCell`
- `equals(UItem a, UItem b)` -> `boolean`

## `org.telegram.ui.Cells.StickerCell`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getParentObject()` -> `Object`
- `getSendAnimationData()` -> `MessageObject.SendAnimationData`
- `getSticker()` -> `TLRPC.Document`
- `isClearsInputField()` -> `boolean`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setClearsInputField(boolean value)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `setScaled(boolean value)` -> `void`
- `setSticker(TLRPC.Document document, Object parent)` -> `void`
- `showingBitmap()` -> `boolean`

## `org.telegram.ui.Cells.StickerEmojiCell`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `disable()` -> `void`
- `disableEditMode(boolean animate)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `enableEditMode(boolean animate)` -> `void`
- `getEmoji()` -> `String`
- `getImageView()` -> `ImageReceiver`
- `getParentObject()` -> `Object`
- `getSendAnimationData()` -> `MessageObject.SendAnimationData`
- `getSticker()` -> `TLRPC.Document`
- `getStickerPath()` -> `SendMessagesHelper.ImportingSticker`
- `invalidate()` -> `void`
- `isDisabled()` -> `boolean`
- `isRecent()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `preDraw(View view, Canvas canvas)` -> `void`
- `setRecent(boolean value)` -> `void`
- `setScaled(boolean value)` -> `void`
- `setSticker(TLRPC.Document document, Object parent, boolean showEmoji)` -> `void`
- `setSticker(SendMessagesHelper.ImportingSticker path)` -> `void`
- `setSticker(TLRPC.Document document, SendMessagesHelper.ImportingSticker path, Object parent, String emoji, boolean showEmoji)` -> `void`
- `setSticker(TLRPC.Document document, SendMessagesHelper.ImportingSticker path, Object parent, String emoji, boolean showEmoji, boolean editModeEnabled)` -> `void`
- `showRequirePremiumAnimation()` -> `void`
- `showingBitmap()` -> `boolean`

## `org.telegram.ui.Cells.StickerSetCell`
- `getStickersSet()` -> `TLRPC.TL_messages_stickerSet`
- `isChecked()` -> `boolean`
- `onAddButtonClick()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onPremiumButtonClick()` -> `void`
- `onRemoveButtonClick()` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setChecked(boolean checked)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setDeleteAction(OnClickListener action)` -> `void`
- `setNeedDivider(boolean needDivider)` -> `void`
- `setOnOptionsClick(OnClickListener listener)` -> `void`
- `setOnReorderButtonTouchListener(OnTouchListener listener)` -> `void`
- `setReorderable(boolean reorderable)` -> `void`
- `setReorderable(boolean reorderable, boolean animated)` -> `void`
- `setSearchQuery(TLRPC.TL_messages_stickerSet tlSet, String query, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `setStickersSet(TLRPC.TL_messages_stickerSet set, boolean divider)` -> `void`
- `setStickersSet(TLRPC.TL_messages_stickerSet set, boolean divider, boolean search)` -> `void`
- `setText(String title, String subtitle, int icon, boolean divider)` -> `void`
- `updateButtonState(int state, boolean animated)` -> `void`
- `updateRightMargin()` -> `void`

## `org.telegram.ui.Cells.StickerSetCell$Factory`
- `attachedView(RecyclerListView listView, View view, UItem item)` -> `void`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `StickerSetCell`
- `static of(TLRPC.TL_messages_stickerSet set)` -> `UItem`

## `org.telegram.ui.Cells.StickerSetGroupInfoCell`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAddOnClickListener(OnClickListener onClickListener)` -> `void`
- `setIsLast(boolean last)` -> `void`

## `org.telegram.ui.Cells.StickerSetNameCell`
- `static createThemeDescriptions(List<ThemeDescription> descriptions, RecyclerListView listView, ThemeDescription.ThemeDescriptionDelegate delegate)` -> `void`
- `getTextView()` -> `TextView`
- `invalidate()` -> `void`
- `measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setEdit(View.OnClickListener whenClickedEdit)` -> `void`
- `setHeaderOnClick(View.OnClickListener listener)` -> `void`
- `setOnIconClickListener(OnClickListener onIconClickListener)` -> `void`
- `setText(CharSequence text, int resId)` -> `void`
- `setText(CharSequence text, int resId, CharSequence iconAccDescr)` -> `void`
- `setText(CharSequence text, int resId, int index, int searchLength)` -> `void`
- `setText(CharSequence text, int resId, CharSequence iconAccDescr, int index, int searchLength)` -> `void`
- `setTitleColor(int color)` -> `void`
- `setUrl(CharSequence text, int searchLength)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.AudioPlayerAlert`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `getContainerViewHeight()` -> `int`
- `getObserverTag()` -> `int`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isTouchOutside(float x, float y)` -> `boolean`
- `onBackPressed()` -> `void`
- `onCustomLayout(View view, int left, int top, int right, int bottom)` -> `boolean`
- `onCustomMeasure(View view, int width, int height)` -> `boolean`
- `onFailedDownload(String fileName, boolean canceled)` -> `void`
- `onProgressDownload(String fileName, long downloadedSize, long totalSize)` -> `void`
- `onProgressUpload(String fileName, long uploadedSize, long totalSize, boolean isEncrypted)` -> `void`
- `onSuccessDownload(String fileName)` -> `void`
- `show()` -> `void`
- `updateColors()` -> `void`
- `updateRepeatButton()` -> `void`

## `org.telegram.ui.Components.AudioPlayerAlert$ClippingTextViewSwitcher`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getCustomPaddingRight()` -> `int`
- `getNextTextView()` -> `TextView`
- `getTextView()` -> `TextView`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `setCustomPaddingRight(int padding)` -> `void`
- `setIsCenter()` -> `void`
- `setText(CharSequence text)` -> `void`
- `setText(CharSequence text, boolean animated)` -> `void`

## `org.telegram.ui.Components.AudioPlayerAlert$CoverContainer`
- `getImageReceiver()` -> `ImageReceiver`
- `getImageView()` -> `BackupImageView`
- `getNextImageView()` -> `BackupImageView`
- `switchImageViews()` -> `void`

## `org.telegram.ui.Components.AudioPlayerAlert$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `search(final String query)` -> `void`
- `setup()` -> `void`

## `org.telegram.ui.Components.AudioVisualizerDrawable`
- `draw(Canvas canvas, float cx, float cy, int color, float alpha, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `draw(Canvas canvas, float cx, float cy, boolean outOwner, float alpha, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `draw(Canvas canvas, float cx, float cy, boolean outOwner, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `draw(Canvas canvas, float cx, float cy)` -> `void`
- `getParentView()` -> `View`
- `setColor(int color)` -> `void`
- `setParentView(View parentView)` -> `void`
- `setWaveform(boolean playing, boolean animate, float[] waveform)` -> `void`

## `org.telegram.ui.Components.CaptionPhotoViewer`
- `afterUpdateShownKeyboard(boolean show)` -> `void`
- `beforeUpdateShownKeyboard(boolean show)` -> `void`
- `clear()` -> `void`
- `clipChild(View child)` -> `boolean`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent event)` -> `boolean`
- `expandMoveButton()` -> `void`
- `getCaptionDefaultLimit()` -> `int`
- `getCaptionLimit()` -> `int`
- `getCaptionPremiumLimit()` -> `int`
- `getEditTextHeight()` -> `int`
- `getEditTextLeft()` -> `int`
- `getEditTextStyle()` -> `int`
- `onEditHeightChange(int height)` -> `void`
- `onLineCountChanged(int oldLineCount, int newLineCount)` -> `void`
- `onMoveButtonClick()` -> `void`
- `onTextChange()` -> `void`
- `openedKeyboard()` -> `void`
- `setAddPhotoVisible(boolean visible, boolean animated)` -> `void`
- `setIsVideo(boolean isVideo)` -> `void`
- `setOnAddPhotoClick(View.OnClickListener listener)` -> `void`
- `setOnTimerChange(Utilities.Callback<Integer> onTTLChange)` -> `void`
- `setShowMoveButtonVisible(boolean visible, boolean animated)` -> `void`
- `setText(CharSequence text)` -> `void`
- `setTimer(int value)` -> `void`
- `setTimerVisible(boolean visible, boolean animated)` -> `void`
- `setupMentionContainer()` -> `void`
- `showMoveButton()` -> `boolean`
- `updateColors(Theme.ResourcesProvider resourcesProvider)` -> `void`
- `updateKeyboard(int keyboardHeight)` -> `void`

## `org.telegram.ui.Components.ChoosingStickerStatusDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `setAlpha(int i)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setIsChat(boolean value)` -> `void`
- `start()` -> `void`
- `stop()` -> `void`

## `org.telegram.ui.Components.EmojiView$ChooseStickerActionTracker`
- `doSomeAction()` -> `void`

## `org.telegram.ui.Components.EmojiView$FoundStickerPackFactory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `contentsEquals(UItem a, UItem b)` -> `boolean`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `FoundStickerPackCell`
- `equals(UItem a, UItem b)` -> `boolean`
- `static of(TLRPC.TL_messages_stickerSet pack, boolean isSelected)` -> `UItem`
- `static of(TLRPC.StickerSetCovered pack, EmojiPackInfo emojiPackInfo, boolean isSelected)` -> `UItem`

## `org.telegram.ui.Components.EmojiView$GifAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `search(String text)` -> `void`
- `search(String text, boolean delay)` -> `void`
- `search(final String query, final String offset, boolean searchUser)` -> `void`
- `search(final String query, final String offset, boolean searchUser, boolean isEmoji, boolean cache)` -> `void`
- `searchEmoji(String emoji)` -> `void`

## `org.telegram.ui.Components.EmojiView$GifLayoutManager`
- `getFlowItemCount()` -> `int`
- `getSizeForItem(int i)` -> `Size`
- `getSizeForItem(TLRPC.Document document)` -> `Size`
- `getSizeForItem(TLRPC.Document document, List<TLRPC.DocumentAttribute> attributes)` -> `Size`

## `org.telegram.ui.Components.EmojiView$GifProgressEmptyView`
- `isLoadingState()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setLoadingState(boolean loadingState)` -> `void`

## `org.telegram.ui.Components.EmojiView$GifSearchPreloader`
- `preload(final String query)` -> `void`

## `org.telegram.ui.Components.EmojiView$StickersGridAdapter`
- `getItem(int i)` -> `Object`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `getPositionForPack(Object pack)` -> `int`
- `getTabForPosition(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `notifyItemRangeRemoved(int positionStart, int itemCount)` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.EmojiView$StickersSearchGridAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `resetSelectedPackId()` -> `void`
- `search(String text)` -> `void`
- `search(String text, boolean delay)` -> `void`

## `org.telegram.ui.Components.GalleryEmptyView`
- `doOnCameraAccess(Runnable listener)` -> `void`
- `doOnEmojiButton(Utilities.Callback<Long> listener)` -> `void`
- `doOnGalleryAccessClick(Runnable listener)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setColors()` -> `void`
- `setUseAnEmojiVisible(boolean visible)` -> `void`

## `org.telegram.ui.Components.GroupCallPip`
- `static clearForce()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static finish()` -> `void`
- `static getInstance()` -> `GroupCallPip`
- `static onBackPressed()` -> `boolean`
- `prepareToRemove(boolean prepare)` -> `void`
- `static show(Context context, int account)` -> `void`
- `showRemoveTooltip(boolean show)` -> `void`
- `static updateVisibility(Context context)` -> `void`

## `org.telegram.ui.Components.GroupCallPipAlertView`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onAudioSettingsChanged()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onStateChanged(int state)` -> `void`
- `setPosition(int position, float cx, float cy)` -> `void`

## `org.telegram.ui.Components.GroupCallPipButton`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onAudioSettingsChanged()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onStateChanged(int state)` -> `void`
- `prepareToRemove(boolean prepare)` -> `void`
- `setPinnedProgress(float pinnedProgress)` -> `void`
- `setPressedState(boolean pressedState)` -> `void`
- `setRemoveAngle(double angle)` -> `void`
- `setState(int state)` -> `void`

## `org.telegram.ui.Components.GroupCallPipButton$WeavingState`
- `setToPaint(Paint paint)` -> `void`
- `update(long dt, float amplitude)` -> `void`

## `org.telegram.ui.Components.InstantCameraVideoEncoderOverlayHelper`
- `bind()` -> `void`
- `destroy()` -> `void`
- `render()` -> `void`

## `org.telegram.ui.Components.InstantCameraVideoEncoderOverlayHelper$Program`
- `destroy()` -> `void`

## `org.telegram.ui.Components.InstantCameraView`
- `static allowBigSizeCameraDebug()` -> `boolean`
- `changeVideoPreviewState(int state, float progress)` -> `void`
- `destroy(boolean async)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `finishZoom()` -> `void`
- `getButtonsLayout()` -> `View`
- `getCameraContainer()` -> `InstantViewCameraContainer`
- `getCameraRect()` -> `RectF`
- `getMuteImageView()` -> `View`
- `getPaint()` -> `Paint`
- `getTextureView()` -> `TextureView`
- `hideCamera(boolean async)` -> `void`
- `isPaused()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `resetCameraFile()` -> `void`
- `setButtonsBackground(BlurredBackgroundDrawableViewFactory factory, BlurredBackgroundColorProvider colorProvider)` -> `void`
- `setInternalPadding(int padding)` -> `void`
- `setIsMessageTransition(boolean isMessageTransition)` -> `void`
- `setVisibility(int visibility)` -> `void`
- `showCamera(boolean fromPaused)` -> `void`
- `startAnimation(boolean open, boolean fromPaused)` -> `void`
- `togglePause()` -> `void`

## `org.telegram.ui.Components.InstantCameraView$CameraGLThread`
- `finish()` -> `void`
- `flipSurfaces()` -> `void`
- `handleMessage(Message inputMessage)` -> `void`
- `reinitForNewCamera()` -> `void`
- `run()` -> `void`
- `setCurrentSession(CameraSession session)` -> `void`
- `setCurrentSession(Camera2Session session)` -> `void`
- `shutdown(int send, boolean notify, int scheduleDate, int scheduleRepeatPeriod, int ttl, long effectId)` -> `void`

## `org.telegram.ui.Components.InstantCameraView$EncoderHandler`
- `exit()` -> `void`
- `handleMessage(Message inputMessage)` -> `void`

## `org.telegram.ui.Components.InstantCameraView$InstantViewCameraContainer`
- `dispatchDraw(Canvas canvas)` -> `void`
- `setImageReceiver(ImageReceiver imageReceiver)` -> `void`

## `org.telegram.ui.Components.InstantCameraView$VideoRecorder`
- `drainEncoder(boolean endOfStream)` -> `void`
- `finalize()` -> `void`
- `frameAvailable(SurfaceTexture st, Integer cameraId, long timestampInternal)` -> `void`
- `getInputSurface()` -> `Surface`
- `pause()` -> `void`
- `resume()` -> `void`
- `run()` -> `void`
- `startRecording(File outputFile, android.opengl.EGLContext sharedContext)` -> `void`
- `stopRecording(int send, SendOptions options)` -> `void`

## `org.telegram.ui.Components.InstantCameraView$VideoRecorder$GenerateKeyframeThumbTask`
- `run()` -> `void`

## `org.telegram.ui.Components.InstantCameraView2`
- `changeVideoPreviewState(int state, float progress)` -> `void`
- `destroy(boolean async)` -> `void`
- `getButtonsLayout()` -> `View`
- `getCameraContainer()` -> `InstantCameraViewBase.InstantViewCameraContainer`
- `getCameraRect()` -> `RectF`
- `getMuteImageView()` -> `View`
- `getPaint()` -> `Paint`
- `getTextureView()` -> `TextureView`
- `hideCamera(boolean async)` -> `void`
- `isPaused()` -> `boolean`
- `onInterceptTouchEvent(MotionEvent event)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `resetCameraFile()` -> `void`
- `setButtonsBackground(BlurredBackgroundDrawableViewFactory factory, BlurredBackgroundColorProvider colorProvider)` -> `void`
- `setInternalPadding(int padding)` -> `void`
- `setIsMessageTransition(boolean messageTransition)` -> `void`
- `setVisibility(int visibility)` -> `void`
- `showCamera(boolean fromPaused)` -> `void`
- `startAnimation(boolean open, boolean fromPaused)` -> `void`
- `togglePause()` -> `void`

## `org.telegram.ui.Components.InstantCameraView2$CameraContainer`
- `dispatchDraw(Canvas canvas)` -> `void`
- `setImageReceiver(ImageReceiver imageReceiver)` -> `void`

## `org.telegram.ui.Components.InstantCameraViewBase`
- `static create(Context context, InstantCameraView.Delegate delegate, Theme.ResourcesProvider resourcesProvider, boolean isNewDesign)` -> `InstantCameraViewBase`
- `dispatchAnimationState(boolean open, boolean fromPaused)` -> `void`
- `dispatchRecordingUiFrame(long durationMs)` -> `void`
- `dispatchRecordingUiFrameClockActive(boolean active)` -> `void`
- `dispatchTrimRange(float start, float end)` -> `void`
- `setAnimationCallback(AnimationCallback animationCallback)` -> `void`
- `setRecordingUiFrameCallback(RecordingUiFrameCallback callback)` -> `void`
- `setTrimCallback(TrimCallback trimCallback)` -> `void`

## `org.telegram.ui.Components.LoadingStickerDrawable`
- `draw(Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int i)` -> `void`
- `setColorFilter(ColorFilter colorFilter)` -> `void`
- `setColors(int key1, int key2)` -> `void`

## `org.telegram.ui.Components.Paint.Views.PipettePickerView`
- `animateDisappear(boolean saveColor)` -> `void`
- `animateShow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `onStartPipette()` -> `void`
- `onStopPipette()` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setColorListener(Consumer<Integer> colorListener)` -> `void`

## `org.telegram.ui.Components.Paint.Views.ReactionWidgetEntityView$StickerViewSelectionView`
- `onDraw(Canvas canvas)` -> `void`
- `pointInsideHandle(float x, float y)` -> `int`

## `org.telegram.ui.Components.Paint.Views.StickerCutOutBtn`
- `clean()` -> `void`
- `invalidateBlur()` -> `void`
- `isCancelState()` -> `boolean`
- `isCutOutState()` -> `boolean`
- `isUndoCutState()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAlpha(float alpha)` -> `void`
- `setCancelState(boolean animated)` -> `void`
- `setCutOutState(boolean animated)` -> `void`
- `setEraseState(boolean animated)` -> `void`
- `setOutlineState(boolean animated)` -> `void`
- `setRad(int rad)` -> `void`
- `setRestoreState(boolean animated)` -> `void`
- `setUndoCutState(boolean animated)` -> `void`
- `setUndoState(boolean animated)` -> `void`
- `setVisibility(int visibility)` -> `void`
- `wrapContent()` -> `void`

## `org.telegram.ui.Components.Paint.Views.StickerMakerBackgroundView`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.Components.Paint.Views.StickerMakerView`
- `clean()` -> `void`
- `cutSegmentInFilteredBitmap(Bitmap filteredBitmap, int orientation)` -> `Bitmap`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `disableClippingMode()` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawOutline(Canvas canvas, boolean after, ViewGroup parent, boolean hide)` -> `void`
- `drawSegmentBorderPath(Canvas canvas, ImageReceiver imageReceiver, Matrix matrix, ViewGroup parent)` -> `void`
- `enableClippingMode(Utilities.Callback<SegmentedObject> onClickListener)` -> `void`
- `getSegmentBorderImageHeight()` -> `float`
- `getSegmentBorderImageWidth()` -> `float`
- `getSegmentedDarkMaskImage()` -> `Bitmap`
- `getSegmentedImage(Bitmap filteredBitmap, boolean hasFilters, int orientation)` -> `Bitmap`
- `getSourceBitmap()` -> `Bitmap`
- `getSourceBitmap(boolean hasFilters)` -> `Bitmap`
- `getThanosEffect()` -> `ThanosEffect`
- `getThanosImage(MediaController.PhotoEntry photoEntry, int orientation)` -> `Bitmap`
- `isSegmentedState()` -> `boolean`
- `static isWaitingMlKitError(Exception e)` -> `boolean`
- `objectBehind(float tx, float ty)` -> `SegmentedObject`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `overriddenPaths()` -> `boolean`
- `resetPaths()` -> `void`
- `segmentImage(Bitmap source, int orientation, int containerWidth, int containerHeight, Utilities.Callback<SegmentedObject> whenEmpty)` -> `void`
- `setCurrentAccount(int account)` -> `void`
- `setOutlineVisible(boolean visible)` -> `void`
- `setOutlineWidth(float width)` -> `void`
- `setSegmentedState(boolean segmentedState, SegmentedObject selectedObject)` -> `void`
- `setStickerCutOutBtn(StickerCutOutBtn stickerCutOutBtn)` -> `void`
- `updateOutlineBounds(boolean set)` -> `void`
- `updateOutlinePath(Bitmap newMaskBitmap)` -> `void`
- `uploadStickerFile(String path, VideoEditedInfo videoEditedInfo, String emoji, CharSequence stickerPackName, boolean addToFavorite, long dialogId, TLRPC.StickerSet stickerSet, TLRPC.Document replacedSticker, TLRPC.Document uploadedSticker, String thumbPath, Utilities.Callback<Boolean> whenDone, Utilities.Callback2<String, TLRPC.InputDocument> customStickerHandler)` -> `void`

## `org.telegram.ui.Components.Paint.Views.StickerMakerView$SegmentedObject`
- `drawAnimationBorders(Canvas canvas, float progress, float alpha, View parent)` -> `void`
- `drawOutline(Canvas canvas, boolean after, float width, float alpha)` -> `void`
- `getDarkMaskImage()` -> `Bitmap`
- `getImage()` -> `Bitmap`
- `initPoints()` -> `void`
- `makeDarkMaskImage()` -> `Bitmap`
- `recycle()` -> `void`

## `org.telegram.ui.Components.Paint.Views.StickerMakerView$StickerUploader`
- `destroy(boolean all)` -> `void`
- `getProgress()` -> `float`
- `setupFiles()` -> `void`

## `org.telegram.ui.Components.Paint.Views.StickerMakerView$SubjectMock`
- `static mock(Bitmap source)` -> `SubjectMock`
- `static of(Subject subject)` -> `SubjectMock`

## `org.telegram.ui.Components.Paint.Views.StickerView`
- `createSelectionView()` -> `SelectionView`
- `didSetAnimatedSticker(RLottieDrawable drawable)` -> `void`
- `getAnchor()` -> `int`
- `getBaseSize()` -> `Size`
- `getDuration()` -> `long`
- `getParentObject()` -> `Object`
- `getSelectionBounds()` -> `RectOld`
- `getSticker()` -> `TLRPC.Document`
- `isMirrored()` -> `boolean`
- `mirror()` -> `void`
- `mirror(boolean animated)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `stickerDraw(Canvas canvas)` -> `void`
- `updatePosition()` -> `void`

## `org.telegram.ui.Components.Paint.Views.StickerView$FrameLayoutDrawer`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.Components.Paint.Views.StickerView$StickerViewSelectionView`
- `onDraw(Canvas canvas)` -> `void`
- `pointInsideHandle(float x, float y)` -> `int`

## `org.telegram.ui.Components.PhotoViewerCaptionEnterView`
- `closeKeyboard()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `extendActionMode(ActionMode actionMode, Menu menu)` -> `void`
- `getCaptionLimitOffset()` -> `int`
- `getCodePointCount()` -> `int`
- `getCursorPosition()` -> `int`
- `getEmojiPadding()` -> `int`
- `getFieldCharSequence()` -> `CharSequence`
- `getMessageEditText()` -> `EditTextCaption`
- `getResourcesProvider()` -> `Theme.ResourcesProvider`
- `getSelectionLength()` -> `int`
- `hideActionMode()` -> `boolean`
- `hidePopup()` -> `void`
- `isKeyboardVisible()` -> `boolean`
- `isPopupAnimating()` -> `boolean`
- `isPopupShowing()` -> `boolean`
- `isPopupView(View view)` -> `boolean`
- `onCreate()` -> `void`
- `onDestroy()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onSizeChanged(int height, boolean isWidthGreater)` -> `void`
- `openKeyboard()` -> `void`
- `replaceWithText(int start, int len, CharSequence text, boolean parseEmoji)` -> `void`
- `setAllowTextEntitiesIntersection(boolean value)` -> `void`
- `setDelegate(PhotoViewerCaptionEnterViewDelegate delegate)` -> `void`
- `setFieldFocused(boolean focus)` -> `void`
- `setFieldText(CharSequence text)` -> `void`
- `setForceFloatingEmoji(boolean value)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.PhotoViewerCaptionEnterView$DarkTheme`
- `getColor(int key)` -> `int`

## `org.telegram.ui.Components.PhotoViewerCoverEditor`
- `closeGallery()` -> `void`
- `destroy()` -> `void`
- `getTime()` -> `long`
- `set(MediaController.PhotoEntry entry, VideoPlayer player, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `setOnClose(Runnable listener)` -> `void`
- `setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> listener)` -> `void`

## `org.telegram.ui.Components.PhotoViewerPollAttachButtons`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Components.PhotoViewerWebView`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawBlackBackground(Canvas canvas, int w, int h)` -> `void`
- `exitFromPip()` -> `void`
- `getBufferedPosition()` -> `float`
- `getCurrentPosition()` -> `int`
- `getVideoDuration()` -> `int`
- `getWebView()` -> `WebView`
- `getYoutubeStoryboard(int position)` -> `String`
- `getYoutubeStoryboardImageCount(int position)` -> `int`
- `getYoutubeStoryboardImageIndex(int position)` -> `int`
- `hideControls()` -> `void`
- `init(int seekTime, TLRPC.WebPage webPage)` -> `void`
- `isControllable()` -> `boolean`
- `isInAppOnly()` -> `boolean`
- `isLoaded()` -> `boolean`
- `isPlaying()` -> `boolean`
- `isYouTube()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `openInPip()` -> `boolean`
- `pauseVideo()` -> `void`
- `playVideo()` -> `void`
- `release()` -> `void`
- `seekTo(long seekTo)` -> `void`
- `seekTo(long seekTo, boolean seekAhead)` -> `void`
- `setPlaybackSpeed(float speed)` -> `void`
- `setTouchDisabled(boolean touchDisabled)` -> `void`
- `showControls()` -> `void`

## `org.telegram.ui.Components.PhotoViewerWebView$YoutubeProxy`
- `onPlayerError(String error)` -> `void`
- `onPlayerLoaded()` -> `void`
- `onPlayerNotifyBufferedPosition(float position)` -> `void`
- `onPlayerNotifyCurrentPosition(int position)` -> `void`
- `onPlayerNotifyDuration(int duration)` -> `void`
- `onPlayerStateChange(String state)` -> `void`

## `org.telegram.ui.Components.PipRoundVideoView`
- `close(boolean animated)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static getInstance()` -> `PipRoundVideoView`
- `getTextureView()` -> `TextureView`
- `getX()` -> `int`
- `getY()` -> `int`
- `onConfigurationChanged()` -> `void`
- `setX(int value)` -> `void`
- `setY(int value)` -> `void`
- `show(Activity activity, Runnable closeRunnable)` -> `void`
- `showTemporary(boolean show)` -> `void`

## `org.telegram.ui.Components.PipVideoOverlay`
- `static dismiss()` -> `void`
- `static dismiss(boolean animate)` -> `void`
- `static dismiss(boolean animate, boolean immediate)` -> `void`
- `static dismissAndDestroy()` -> `void`
- `static getInnerView()` -> `View`
- `static getPipRect(boolean inAnimation, float aspectRatio)` -> `RectOld`
- `static getPipSource()` -> `PipSource`
- `static getPipTextureView()` -> `TextureView`
- `onLongClick()` -> `void`
- `static onRewindCanceled()` -> `void`
- `static onRewindStart(boolean rewindForward)` -> `void`
- `static onVideoCompleted()` -> `void`
- `pipCreatePictureInPictureView()` -> `View`
- `pipCreatePictureInPictureViewBitmap()` -> `Bitmap`
- `pipCreatePrimaryWindowViewBitmap()` -> `Bitmap`
- `pipHidePrimaryWindowView(Runnable firstFrameCallback)` -> `void`
- `pipIsAvailable()` -> `boolean`
- `pipShowPrimaryWindowView(Runnable firstFrameCallback)` -> `void`
- `static setBufferedProgress(float progress)` -> `void`
- `static setParentSheet(EmbedBottomSheet parentSheet)` -> `void`
- `static setPhotoViewer(PhotoViewer photoViewer)` -> `void`
- `static show(boolean inAppOnly, Activity activity, View pipContentView, int videoWidth, int videoHeight)` -> `boolean`
- `static show(boolean inAppOnly, Activity activity, View pipContentView, int videoWidth, int videoHeight, boolean animate)` -> `boolean`
- `static show(boolean inAppOnly, Activity activity, PhotoViewerWebView viewerWebView, View pipContentView, int videoWidth, int videoHeight, boolean animate)` -> `boolean`
- `static updatePlayButton()` -> `void`

## `org.telegram.ui.Components.PipVideoOverlay$PipVideoViewGroup`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`

## `org.telegram.ui.Components.PipVideoOverlay$VideoProgressView`
- `onDraw(@NonNull Canvas canvas)` -> `void`

## `org.telegram.ui.Components.PopupAudioView`
- `downloadAudioIfNeed()` -> `void`
- `getMessageObject()` -> `MessageObject`
- `getObserverTag()` -> `int`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onFailedDownload(String fileName, boolean canceled)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onProgressDownload(String fileName, long downloadedSize, long totalSize)` -> `void`
- `onProgressUpload(String fileName, long uploadedSize, long totalSize, boolean isEncrypted)` -> `void`
- `onSeekBarDrag(float progress)` -> `void`
- `onSuccessDownload(String fileName)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setMessageObject(MessageObject messageObject)` -> `void`
- `updateButtonState()` -> `void`
- `updateProgress()` -> `void`

## `org.telegram.ui.Components.Premium.GiftPremiumBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `getTitle()` -> `CharSequence`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `onPreMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onViewCreated(FrameLayout containerView)` -> `void`

## `org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier`
- `getCurrency()` -> `String`
- `getDiscount()` -> `int`
- `getFormattedPrice()` -> `String`
- `getFormattedPricePerMonth()` -> `String`
- `getGooglePlayProductDetails()` -> `ProductDetails`
- `getMonths()` -> `int`
- `getPrice()` -> `long`
- `getPricePerMonth()` -> `long`
- `getStarsOption()` -> `Object`
- `getStarsPrice()` -> `long`
- `getStoreProduct()` -> `String`
- `setGooglePlayProductDetails(ProductDetails googlePlayProductDetails)` -> `void`
- `setPricePerMonthRegular(long pricePerMonthRegular)` -> `void`

## `org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$LinkSpan`
- `onClick(View widget)` -> `void`
- `updateDrawState(TextPaint p)` -> `void`

## `org.telegram.ui.Components.Premium.PremiumGiftHeaderCell`
- `bind(TLRPC.User user)` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`

## `org.telegram.ui.Components.Premium.PremiumGiftTierCell`
- `bind(GiftPremiumBottomSheet.GiftTier tier)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setChecked(boolean checked, boolean animate)` -> `void`
- `setCirclePaintProvider(GenericProvider<Void, Paint> circlePaintProvider)` -> `void`
- `setGlobalGradientView(PremiumGiftTierCell globalGradientView)` -> `void`
- `setParentSize(int parentWidth, int parentHeight, float parentXOffset)` -> `void`
- `setParentXOffset(float parentXOffset)` -> `void`
- `setProgressDelegate(CheckBoxBase.ProgressDelegate delegate)` -> `void`
- `updateColors()` -> `void`
- `updateGradient()` -> `void`

## `org.telegram.ui.Components.Premium.PremiumStickersPreviewRecycler`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthSpec, int heightSpec)` -> `void`
- `setAutoPlayEnabled(boolean b)` -> `void`
- `setOffset(float translationX)` -> `void`

## `org.telegram.ui.Components.Premium.PremiumStickersPreviewRecycler$Adapter`
- `getItemCount()` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.Premium.PremiumStickersPreviewRecycler$StickerView`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setDrawImage(boolean animateImage, boolean drawEffect, boolean animated)` -> `void`
- `setSticker(TLRPC.Document document)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `getSelectedStarsOption()` -> `TL_stars.TL_starsGiveawayOption`
- `getSelectedStarsOption(long stars)` -> `TL_stars.TL_starsGiveawayOption`
- `getTitle()` -> `CharSequence`
- `getTop()` -> `int`
- `needPaddingShadow()` -> `boolean`
- `onChatsSelected(List<TLRPC.Chat> chats, boolean animated)` -> `void`
- `onCountrySelected(List<TLRPC.TL_help_country> countries)` -> `void`
- `onPreDraw(Canvas canvas, int top, float progressToFullView)` -> `void`
- `onUsersSelected(List<TLRPC.User> users)` -> `void`
- `setActionListener(ActionListener actionListener)` -> `void`
- `setOnCloseClick(Runnable onCloseClick)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `getTitle()` -> `CharSequence`
- `static handleIntent(Intent intent, Browser.Progress progress)` -> `boolean`
- `onViewCreated(FrameLayout containerView)` -> `void`
- `static show(BaseFragment fragment, String slug, Browser.Progress progress)` -> `void`
- `static show(BaseFragment fragment, String slug)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftLinkBottomSheet`
- `dismissInternal()` -> `void`
- `getAdditionItemViewType(int position)` -> `int`
- `onBindAdditionCell(View view, int pos)` -> `void`
- `onCreateAdditionCell(int viewType, Context context)` -> `View`
- `setTitle(boolean animated)` -> `void`
- `static show(String slug, Browser.Progress progress)` -> `void`
- `static show(String slug, TLRPC.TL_premiumGiftOption giftOption, TLRPC.User user, boolean isUsed)` -> `void`
- `updateRows()` -> `void`

## `org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftSentBottomSheet`
- `afterCellCreated(int viewType, View view)` -> `void`
- `attachIconContainer(LinearLayout container)` -> `void`
- `needDefaultPremiumBtn()` -> `boolean`
- `setTitle(boolean animated)` -> `void`
- `static show(List<TLRPC.User> selectedUsers)` -> `void`
- `updateRows()` -> `void`

## `org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftSentBottomSheet$AdditionalCounterView`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftSentBottomSheet$AvatarHolderView`
- `static createAvatarsContainer(Context context, List<TLRPC.User> selectedUsers)` -> `View`
- `dispatchDraw(Canvas canvas)` -> `void`
- `setUser(TLRPC.User user)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.adapters.GiftInfoAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `init(BaseFragment baseFragment, TLRPC.TL_payments_checkedGiftCode giftCode, String slug, FrameLayout container)` -> `void`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.Premium.boosts.cells.statistics.GiftedUserCell`
- `getBoost()` -> `TL_stories.Boost`
- `onDraw(Canvas canvas)` -> `void`
- `setStatus(TL_stories.Boost boost)` -> `void`

## `org.telegram.ui.Components.ProfileGalleryBlurView`
- `destroy()` -> `void`
- `draw(Canvas canvas, ProfileActivity.AvatarImageView avatarImageView, float width, float height, boolean translate, float fraction, float alpha)` -> `void`
- `drawOpeningRenderNode(ProfileActivity.AvatarImageView avatarImageView, Canvas canvas, float width, float height, float fraction, float alpha)` -> `void`
- `drawRenderNode(Canvas canvas, float width)` -> `void`
- `isUsingRenderNode()` -> `boolean`
- `notifyUpdateSize()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `restartAlpha()` -> `void`
- `setActionsView(ProfileActionsView actionsView)` -> `void`
- `setAlpha(float alpha)` -> `void`
- `setMusicView(ProfileMusicView musicView)` -> `void`
- `setSize(int size)` -> `void`
- `setSuggestionView(ProfileSuggestionView suggestionView)` -> `void`
- `setView(ProfileGalleryView view)` -> `void`

## `org.telegram.ui.Components.ProfileGalleryView`
- `clearPrevImages()` -> `void`
- `commitMoveToBegin()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `findVideoActiveView()` -> `View`
- `finishSettingMainPhoto()` -> `void`
- `getBlurDrawer()` -> `ProfileGalleryBlurView`
- `getCurrentItemProgress()` -> `float`
- `getCurrentItemView()` -> `BackupImageView`
- `getCurrentVideoLocation(ImageLocation thumbLocation, ImageLocation imageLocation)` -> `ImageLocation`
- `getDialogId()` -> `long`
- `getImageLocation(int index)` -> `ImageLocation`
- `getItemViewAt(int index)` -> `View`
- `getPhoto(int index)` -> `TLRPC.Photo`
- `getRealCount()` -> `int`
- `getRealImageLocation(int index)` -> `ImageLocation`
- `getRealPosition(int position)` -> `int`
- `getRealPosition()` -> `int`
- `getThumbLocation(int index)` -> `ImageLocation`
- `initIfEmpty(VectorAvatarThumbDrawable vectorAvatar, ImageLocation imageLocation, ImageLocation thumbLocation, boolean reload)` -> `boolean`
- `isCurrentItemVideo()` -> `boolean`
- `isLoadingCurrentVideo()` -> `boolean`
- `isZooming()` -> `boolean`
- `onDestroy()` -> `void`
- `onInterceptTouchEvent(MotionEvent e)` -> `boolean`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `replaceFirstPhoto(TLRPC.Photo oldPhoto, TLRPC.Photo photo)` -> `void`
- `resetCurrentItem()` -> `void`
- `scrollToLastItem()` -> `void`
- `setAlpha(float alpha)` -> `void`
- `setAnimatedFileMaybe(AnimatedFileDrawable drawable)` -> `void`
- `setChatInfo(TLRPC.ChatFull chatFull)` -> `void`
- `setCreateThumbFromParent(boolean createThumbFromParent)` -> `void`
- `setCurrentRealPosition(int realPosition, boolean smooth)` -> `void`
- `setCustomAvatarProgress(float progress)` -> `void`
- `setData(long dialogId)` -> `void`
- `setData(long dialogId, boolean forceReset)` -> `void`
- `setHasActiveVideo(boolean hasActiveVideo)` -> `void`
- `setImagesLayerNum(int value)` -> `void`
- `setInvalidateWithParent(boolean invalidateWithParent)` -> `void`
- `setParentAvatarImage(BackupImageView parentImageView)` -> `void`
- `setPinchToZoomHelper(PinchToZoomHelper pinchToZoomHelper)` -> `void`
- `setRoundRadius(int topRadius, int bottomRadius)` -> `void`
- `setUploadProgress(ImageLocation imageLocation, float p)` -> `void`
- `setVisibility(int visibility)` -> `void`
- `startMovePhotoToBegin(int index)` -> `void`

## `org.telegram.ui.Components.ProfileGalleryView$AvatarImageView`
- `invalidate(int l, int t, int r, int b)` -> `void`
- `invalidate(Rect dirty)` -> `void`
- `invalidate()` -> `void`
- `listenInvalidate(Runnable callback)` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`

## `org.telegram.ui.Components.ProfileGalleryView$ViewPagerAdapter`
- `destroyItem(ViewGroup container, int position, Object object)` -> `void`
- `getCount()` -> `int`
- `getExtraCount()` -> `int`
- `getItemPosition(Object object)` -> `int`
- `getPageTitle(int position)` -> `CharSequence`
- `instantiateItem(ViewGroup container, int position)` -> `Item`
- `notifyDataSetChanged()` -> `void`

## `org.telegram.ui.Components.RecordedAudioPlayerView`
- `destroy()` -> `void`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent e)` -> `boolean`
- `drawIn(Canvas canvas, RectF rect, float transitionProgress)` -> `void`
- `getAudioLeft()` -> `float`
- `getAudioLeftMs()` -> `long`
- `getAudioRight()` -> `float`
- `getAudioRightMs()` -> `long`
- `getDuration()` -> `long`
- `getNewDuration()` -> `double`
- `init(String audioPath, double duration, byte[] waveform, float left, float right)` -> `void`
- `isPlaying()` -> `boolean`
- `needsCut()` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAllowDraw(boolean allow)` -> `void`
- `setPlaying(boolean play)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Components.SharedMediaLayout$GifAdapter`
- `getItemCount()` -> `int`
- `getItemId(int i)` -> `long`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.Components.StickerCategoriesListView`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `draw(Canvas canvas)` -> `void`
- `getCategoryIndex()` -> `int`
- `getSelectedCategory()` -> `EmojiCategory`
- `isCategoriesShown()` -> `boolean`
- `isScrolledIntoOccupiedWidth()` -> `boolean`
- `isTabIconsAnimationEnabled(boolean loaded)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onScrolled(int dx, int dy)` -> `void`
- `static preload(int account, @CategoriesType int type)` -> `void`
- `preprocessCategories(StickerCategoriesListView.EmojiCategory[] categories)` -> `EmojiCategory[]`
- `scrollToSelected()` -> `void`
- `scrollToStart()` -> `void`
- `selectCategory(EmojiCategory category)` -> `void`
- `selectCategory(int categoryIndex)` -> `void`
- `setBackgroundColor(int color)` -> `void`
- `setDontOccupyWidth(int dontOccupyWidth)` -> `void`
- `setOnCategoryClick(Utilities.Callback<EmojiCategory> onCategoryClick)` -> `void`
- `setOnScrollFully(Utilities.Callback<Boolean> onScrollFully)` -> `void`
- `setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> onScrollIntoOccupiedWidth)` -> `void`
- `setShownButtonsAtStart(float buttonsCount)` -> `void`
- `updateCategoriesShown(boolean show, boolean animated)` -> `void`

## `org.telegram.ui.Components.StickerCategoriesListView$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `ViewHolder`
- `onViewAttachedToWindow(@NonNull ViewHolder holder)` -> `void`

## `org.telegram.ui.Components.StickerCategoriesListView$CategoryButton`
- `draw(Canvas canvas)` -> `void`
- `getScale()` -> `float`
- `onLoaded()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `play(boolean force)` -> `void`
- `set(EmojiCategory category, int index, boolean selected)` -> `void`
- `setImageColor(int color)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `setSelected(boolean selected, boolean animated)` -> `void`
- `updatePressedProgress()` -> `void`

## `org.telegram.ui.Components.StickerCategoriesListView$EmojiCategory`
- `static remote(TLRPC.EmojiGroup group)` -> `EmojiCategory`
- `static withAnimatedIcon(int animatedIconResId, String emojis)` -> `EmojiCategory`
- `static withIcon(int iconResId, String emojis)` -> `EmojiCategory`

## `org.telegram.ui.Components.StickerCategoriesListView$EmojiGroupFetcher`
- `getLocal(int currentAccount, Integer type, Utilities.Callback2<Long, TLRPC.TL_messages_emojiGroups> onResult)` -> `void`
- `getRemote(int currentAccount, @CategoriesType Integer type, long hash, Utilities.Callback4<Boolean, TLRPC.TL_messages_emojiGroups, Long, Boolean> onResult)` -> `void`
- `setLocal(int currentAccount, Integer type, TLRPC.TL_messages_emojiGroups data, long hash)` -> `void`

## `org.telegram.ui.Components.StickerCategoriesListView$EmojiSearch`
- `getRemote(int currentAccount, String query, long hash, Utilities.Callback4<Boolean, TLRPC.TL_emojiList, Long, Boolean> onResult)` -> `void`

## `org.telegram.ui.Components.StickerEmptyView`
- `createButtonLayout(CharSequence sting, Runnable action)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getVisibilityFactor()` -> `float`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onVisibilityChange(float factor)` -> `void`
- `setAnimateLayoutChange(boolean animate)` -> `void`
- `setColors(int titleKey, int subtitleKey, int key1, int key2)` -> `void`
- `setKeyboardHeight(int keyboardSize, boolean animated)` -> `void`
- `setPreventMoving(boolean preventMoving)` -> `void`
- `setStickerType(int stickerType)` -> `void`
- `setSubtitle(CharSequence text)` -> `void`
- `setVisibility(int visibility)` -> `void`
- `setVisibility(int visibility, boolean animated)` -> `void`
- `showProgress(boolean show)` -> `void`
- `showProgress(boolean show, boolean animated)` -> `void`

## `org.telegram.ui.Components.StickerImageView`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setSticker()` -> `void`
- `setStickerNum(int stickerNum)` -> `void`
- `setStickerPackName(String stickerPackName)` -> `void`

## `org.telegram.ui.Components.StickerMasksAlert`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismissInternal()` -> `void`
- `setDelegate(StickerMasksAlertDelegate stickerMasksAlertDelegate)` -> `void`
- `setImageReceiverNumLevel(int playingImages, int onShowing)` -> `void`

## `org.telegram.ui.Components.StickerMasksAlert$DrawingInBackgroundLine`
- `draw(Canvas canvas, long time, int w, int h, float alpha)` -> `void`
- `drawInBackground(Canvas canvas)` -> `void`
- `drawInUiThread(Canvas canvas, float alpha)` -> `void`
- `onFrameReady()` -> `void`
- `prepareDraw(long time)` -> `void`

## `org.telegram.ui.Components.StickerMasksAlert$ImageViewEmoji`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setPressed(boolean pressed)` -> `void`

## `org.telegram.ui.Components.StickerMasksAlert$SearchField`
- `hideKeyboard()` -> `void`

## `org.telegram.ui.Components.StickerMasksAlert$StickersGridAdapter`
- `getItem(int i)` -> `Object`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `getPositionForPack(Object pack)` -> `int`
- `getTabForPosition(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.StickerMasksAlert$StickersSearchGridAdapter`
- `getItem(int i)` -> `Object`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `search(String text)` -> `void`

## `org.telegram.ui.Components.StickerSetLinkIcon`
- `attach(View parentView)` -> `void`
- `detach(View parentView)` -> `void`
- `die()` -> `boolean`
- `draw(@NonNull Canvas canvas)` -> `void`
- `equals(ArrayList<TLRPC.Document> documents)` -> `boolean`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `getOpacity()` -> `int`
- `keepAlive()` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Components.StickerTabView`
- `animateIfPositionChanged(ViewGroup parent)` -> `void`
- `getTextWidth()` -> `float`
- `setExpanded(boolean expanded)` -> `void`
- `setRoundImage()` -> `void`
- `updateExpandProgress(float expandProgress)` -> `void`

## `org.telegram.ui.Components.StickersAlert`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `disableEditMode()` -> `void`
- `dismiss()` -> `void`
- `enableEditMode()` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isClearsInputField()` -> `boolean`
- `isShowTooltipWhenToggle()` -> `boolean`
- `onBackPressed()` -> `void`
- `onStart()` -> `void`
- `onStop()` -> `void`
- `setClearsInputField(boolean value)` -> `void`
- `setCustomButtonDelegate(StickersAlertCustomButtonDelegate customButtonDelegate)` -> `void`
- `setInstallDelegate(StickersAlertInstallDelegate stickersAlertInstallDelegate)` -> `void`
- `setOnDismissListener(Runnable onDismissListener)` -> `void`
- `setOnMasterDismiss(Runnable listener)` -> `void`
- `setShowTooltipWhenToggle(boolean showTooltipWhenToggle)` -> `void`
- `show()` -> `void`
- `updateColors()` -> `void`
- `updateColors(boolean applyDescriptions)` -> `void`
- `updateStickerSet(TLRPC.TL_messages_stickerSet set)` -> `void`

## `org.telegram.ui.Components.StickersAlert$GridAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `getThemeDescriptions(List<ThemeDescription> descriptions, ThemeDescription.ThemeDescriptionDelegate delegate)` -> `void`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `notifyDataSetChanged()` -> `void`
- `notifyItemRemoved(int position)` -> `void`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.StickersAlert$StickersShaker`
- `getRotationValueForPos(int pos)` -> `float`
- `getTranslateXValueForPos(int pos)` -> `float`
- `getTranslateYValueForPos(int pos)` -> `float`
- `startShake()` -> `void`
- `stopShake(boolean animate)` -> `void`

## `org.telegram.ui.Components.StickersArchiveAlert$ListAdapter`
- `getItemCount()` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Components.StickersDialogs`
- `static showAddStickerDialog(TLRPC.TL_messages_stickerSet stickerSet, View view, BaseFragment fragment, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static showDeleteForEveryOneDialog(TLRPC.StickerSet set, Theme.ResourcesProvider resourcesProvider, Context context, Runnable callback)` -> `void`
- `static showNameEditorDialog(TLRPC.StickerSet set, Theme.ResourcesProvider resourcesProvider, Context context, Utilities.Callback2<CharSequence, Utilities.Callback<Boolean>> callback)` -> `void`

## `org.telegram.ui.Components.StickersRecyclerListView`
- `setItems(ArrayList<Item> newItems)` -> `void`
- `setSpanCount(int spanCount)` -> `void`

## `org.telegram.ui.Components.StickersRecyclerListView$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `onBindViewHolder(@NonNull ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `ViewHolder`

## `org.telegram.ui.Components.StickersRecyclerListView$StickerHeaderItem`
- `equals(@Nullable Object obj)` -> `boolean`

## `org.telegram.ui.Components.StickersRecyclerListView$StickerItem`
- `equals(@Nullable Object obj)` -> `boolean`

## `org.telegram.ui.Components.TrendingStickersAlert`
- `dismiss()` -> `void`
- `getLayout()` -> `TrendingStickersLayout`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `setAllowNestedScroll(boolean allowNestedScroll)` -> `void`
- `setHeavyOperationsEnabled(boolean enabled)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.Components.TrendingStickersAlert$AlertContainerView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `getTranslationY()` -> `float`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent e)` -> `boolean`
- `requestLayout()` -> `void`
- `setTranslationY(float translationY)` -> `void`

## `org.telegram.ui.Components.TrendingStickersLayout`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `getContentTopOffset()` -> `int`
- `getThemeDescriptions(List<ThemeDescription> descriptions, ThemeDescription.ThemeDescriptionDelegate delegate)` -> `void`
- `glueToTop(boolean glue)` -> `void`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onLayout(boolean changed, int l, int t, int r, int b)` -> `void`
- `recycle()` -> `void`
- `setContentViewPaddingTop(int paddingTop)` -> `void`
- `setOnScrollListener(RecyclerListView.OnScrollListener onScrollListener)` -> `void`
- `setParentFragment(BaseFragment parentFragment)` -> `void`
- `showStickerSet(TLRPC.StickerSet pack, TLRPC.InputStickerSet inputStickerSet)` -> `void`
- `update()` -> `boolean`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.TrendingStickersLayout$Delegate`
- `getLastSearchKeyboardLanguage()` -> `String[]`
- `onListViewInterceptTouchEvent(RecyclerListView listView, MotionEvent event)` -> `boolean`
- `onListViewTouchEvent(RecyclerListView listView, RecyclerListView.OnItemClickListener onItemClickListener, MotionEvent event)` -> `boolean`
- `onStickerSelected(TLRPC.Document sticker, Object parent, boolean clearsInputField, boolean notify, int scheduleDate)` -> `void`
- `onStickerSetAdd(TLRPC.StickerSetCovered stickerSet, boolean primary)` -> `void`
- `onStickerSetRemove(TLRPC.StickerSetCovered stickerSet)` -> `void`
- `setLastSearchKeyboardLanguage(String[] language)` -> `void`

## `org.telegram.ui.Components.TrendingStickersLayout$TrendingStickersAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `getThemeDescriptions(List<ThemeDescription> descriptions, RecyclerListView listView, ThemeDescription.ThemeDescriptionDelegate delegate)` -> `void`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position, @NonNull List payloads)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `refreshStickerSets()` -> `void`
- `updateColors(RecyclerListView listView)` -> `void`

## `org.telegram.ui.Components.URLSpanUserMentionPhotoViewer`
- `updateDrawState(TextPaint ds)` -> `void`

## `org.telegram.ui.Components.VideoPlayer`
- `createdWithAudioTrack()` -> `boolean`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getBufferedPercentage()` -> `int`
- `getBufferedPosition()` -> `long`
- `static getCachedQuality(ArrayList<Quality> qualities)` -> `VideoUri`
- `getCurrentChromecastMedia(String defaultId, String title, String subtitle)` -> `ChromecastMediaVariations`
- `getCurrentDocument()` -> `TLRPC.Document`
- `getCurrentPosition()` -> `long`
- `getCurrentQuality()` -> `Quality`
- `getCurrentQualityIndex()` -> `int`
- `getCurrentUri()` -> `Uri`
- `static getDocumentForThumb(int currentAccount, TLRPC.MessageMedia media)` -> `TLRPC.Document`
- `getDuration()` -> `long`
- `getFile()` -> `File`
- `getHDRStaticInfo(StoryEntry.HDRInfo hdrInfo)` -> `StoryEntry.HDRInfo`
- `getHighestQuality(Boolean original)` -> `Quality`
- `getHighestQualityIndex(Boolean original)` -> `int`
- `static getLooping(MessageObject messageObject)` -> `Boolean`
- `getLowestFile()` -> `File`
- `getLowestQuality()` -> `Quality`
- `getOriginalQuality()` -> `Quality`
- `getPlayWhenReady()` -> `boolean`
- `getPlaybackSpeed()` -> `float`
- `getPlaybackState()` -> `int`
- `static getQualities(int currentAccount, TLRPC.Document original, ArrayList<TLRPC.Document> alt_documents, int reference, boolean forThumb)` -> `ArrayList<Quality>`
- `static getQualities(int currentAccount, TLRPC.Document original, ArrayList<TLRPC.Document> alt_documents, int reference, boolean forThumb, boolean useFileDatabaseQueue)` -> `ArrayList<Quality>`
- `static getQualities(int currentAccount, TLRPC.MessageMedia media, boolean useFileDatabaseQueue)` -> `ArrayList<Quality>`
- `getQualitiesCount()` -> `int`
- `getQuality(int index)` -> `Quality`
- `static getQualityForPlayer(ArrayList<Quality> qualities)` -> `VideoUri`
- `static getQualityForThumb(ArrayList<Quality> qualities)` -> `VideoUri`
- `getRepeatCount()` -> `int`
- `static getSavedQuality(ArrayList<Quality> qualities, MessageObject messageObject)` -> `Quality`
- `static getSavedQuality(ArrayList<Quality> qualities, long did, int mid)` -> `Quality`
- `getSelectedQuality()` -> `int`
- `getVideoSize()` -> `VideoSize`
- `getVolume()` -> `float`
- `handleAudioFocus(boolean handleAudioFocus)` -> `void`
- `makeManifest(ArrayList<Quality> qualities)` -> `Uri`
- `onPlaybackParametersChanged(PlaybackParameters playbackParameters)` -> `void`
- `onPlayerError(PlaybackException error)` -> `void`
- `onPlayerStateChanged(boolean playWhenReady, int playbackState)` -> `void`
- `onPositionDiscontinuity(EventTime eventTime, Player.PositionInfo oldPosition, Player.PositionInfo newPosition, int reason)` -> `void`
- `onPositionDiscontinuity(Player.PositionInfo oldPosition, Player.PositionInfo newPosition, @Player.DiscontinuityReason int reason)` -> `void`
- `onRenderedFirstFrame(EventTime eventTime, Object output, long renderTimeMs)` -> `void`
- `onRenderedFirstFrame()` -> `void`
- `onRepeatModeChanged(int repeatMode)` -> `void`
- `onSeekStarted(EventTime eventTime)` -> `void`
- `onSurfaceDestroyed(SurfaceTexture surfaceTexture)` -> `boolean`
- `onTrackSelectionParametersChanged(TrackSelectionParameters parameters)` -> `void`
- `onTracksChanged(Tracks tracks)` -> `void`
- `onVideoSizeChanged(VideoSize videoSize)` -> `void`
- `pause()` -> `void`
- `play()` -> `void`
- `preparePlayer(Uri uri, String type)` -> `void`
- `preparePlayer(Uri uri, String type, int priority, long videoByteOffset)` -> `void`
- `preparePlayer(ArrayList<Quality> qualities, Quality select)` -> `void`
- `preparePlayerLoop(Uri videoUri, String videoType, Uri audioUri, String audioType)` -> `void`
- `releasePlayer(boolean async)` -> `void`
- `seekTo(long positionMs)` -> `void`
- `seekTo(long positionMs, boolean fast)` -> `void`
- `seekTo(long positionMs, boolean fast, Runnable whenDone)` -> `void`
- `seekToBack(long positionMs, boolean fast, Runnable whenDone)` -> `void`
- `seekToForward(long positionMs, boolean fast, Runnable whenDone)` -> `void`
- `setAudioVisualizerDelegate(AudioVisualizerDelegate audioVisualizerDelegate)` -> `void`
- `setDelegate(VideoPlayerDelegate videoPlayerDelegate)` -> `void`
- `setIsStory()` -> `void`
- `setLooper(Looper looper)` -> `void`
- `setLooping(boolean looping)` -> `void`
- `setMute(boolean value)` -> `void`
- `setOnQualityChangeListener(Runnable listener)` -> `void`
- `setPlayWhenReady(boolean playWhenReady)` -> `void`
- `setPlaybackSpeed(float speed)` -> `void`
- `setSelectedQuality(int index)` -> `void`
- `setStreamType(int type)` -> `void`
- `setSurface(Surface s)` -> `void`
- `setSurfaceView(SurfaceView surfaceView)` -> `void`
- `setTextureView(TextureView texture)` -> `void`
- `setVolume(float volume)` -> `void`
- `setWorkerQueue(DispatchQueue dispatchQueue)` -> `void`
- `static supportsHardwareDecoder(String codec)` -> `boolean`
- `static toMime(String codec)` -> `String`

## `org.telegram.ui.Components.VideoPlayer$AudioVisualizerRenderersFactory`
- `buildAudioSink(@NonNull Context context, boolean enableFloatOutput, boolean enableAudioTrackPlaybackParams)` -> `AudioSink`

## `org.telegram.ui.Components.VideoPlayer$OffsetDataSource`
- `close()` -> `void`
- `getResponseHeaders()` -> `Map<String, List<String>>`
- `getUri()` -> `Uri`
- `open(DataSpec dataSpec)` -> `long`

## `org.telegram.ui.Components.VideoPlayer$Quality`
- `static filterByCodec(ArrayList<Quality> qualities)` -> `ArrayList<Quality>`
- `getDownloadDocument()` -> `TLRPC.Document`
- `getDownloadUri()` -> `VideoUri`
- `static group(ArrayList<VideoUri> uris)` -> `ArrayList<Quality>`
- `p()` -> `int`
- `toString()` -> `String`

## `org.telegram.ui.Components.VideoPlayer$VideoPlayerDelegate`
- `onRenderedFirstFrame(EventTime eventTime)` -> `default void`
- `onSeekFinished(AnalyticsListener.EventTime eventTime)` -> `default void`
- `onSeekStarted(EventTime eventTime)` -> `default void`
- `onSurfaceDestroyed(SurfaceTexture surfaceTexture)` -> `default boolean`

## `org.telegram.ui.Components.VideoPlayer$VideoUri`
- `getMediaItem()` -> `MediaItem`
- `static getUri(int currentAccount, TLRPC.Document document, int reference)` -> `Uri`
- `static of(int currentAccount, TLRPC.Document document, TLRPC.Document manifest, int reference, boolean useFileDatabaseQueue)` -> `VideoUri`
- `updateCached(boolean useFileDatabaseQueue)` -> `void`

## `org.telegram.ui.Components.VideoPlayer$VisualizerBufferSink`
- `flush(int sampleRateHz, int channelCount, int encoding)` -> `void`
- `handleBuffer(ByteBuffer buffer)` -> `void`

## `org.telegram.ui.Components.VideoPlayerSeekBar`
- `clearTimestamps()` -> `void`
- `draw(Canvas canvas, View view)` -> `void`
- `getHorizontalPadding()` -> `int`
- `getProgress()` -> `float`
- `getThumbX()` -> `int`
- `getTransitionProgress()` -> `float`
- `getWidth()` -> `int`
- `onTouch(int action, float x, float y)` -> `boolean`
- `setBufferedProgress(float value)` -> `void`
- `setColors(int background, int cache, int progress, int circle, int selected, int smallLineColor)` -> `void`
- `setDelegate(SeekBarDelegate seekBarDelegate)` -> `void`
- `setHorizontalPadding(int horizontalPadding)` -> `void`
- `setProgress(float progress, boolean animated)` -> `void`
- `setProgress(float progress)` -> `void`
- `setSelected(boolean value)` -> `void`
- `setSize(int w, int h)` -> `void`
- `setTransitionProgress(float transitionProgress)` -> `void`
- `updateTimestamps(MessageObject messageObject, long videoDuration)` -> `void`

## `org.telegram.ui.Components.VideoPlayerSeekBar$SeekBarDelegate`
- `onSeekBarContinuousDrag(float progress)` -> `default void`

## `org.telegram.ui.Components.emojiview.FoundStickerPackButton`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `setIsPrimary(boolean isPrimary, boolean animated)` -> `void`

## `org.telegram.ui.Components.emojiview.FoundStickerPackButtonContainer`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`

## `org.telegram.ui.Components.emojiview.FoundStickerPackCell`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `isSelected()` -> `boolean`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `setPack(TLRPC.TL_messages_stickerSet pack)` -> `void`
- `setPack(TLRPC.StickerSetCovered pack, TLRPC.Document document)` -> `void`
- `setSelected(boolean isSelected, boolean animated)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.emojiview.FoundStickerPacksHeaderCell`
- `setOnBackClickListener(OnClickListener listener)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.poll.attached.PollAttachedMediaGallery`
- `draw(Canvas canvas, int w, int h)` -> `void`

## `org.telegram.ui.Components.poll.attached.PollAttachedMediaSticker`
- `draw(Canvas canvas, int w, int h)` -> `void`

## `org.telegram.ui.Components.voip.RTMPStreamPipOverlay`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static dismiss()` -> `void`
- `pipCreatePictureInPictureView()` -> `View`
- `pipCreatePictureInPictureViewBitmap()` -> `Bitmap`
- `pipCreatePrimaryWindowViewBitmap()` -> `Bitmap`
- `pipHidePrimaryWindowView(Runnable firstFrameCallback)` -> `void`
- `pipShowPrimaryWindowView(Runnable firstFrameCallback)` -> `void`
- `static show(Activity activity)` -> `void`

## `org.telegram.ui.Components.voip.VoIPPiPView`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static finish()` -> `void`
- `static getInstance()` -> `VoIPPiPView`
- `onAudioSettingsChanged()` -> `void`
- `onCameraSwitch(boolean isFrontFace)` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onScreenOnChange(boolean screenOn)` -> `void`
- `onSignalBarsCountChanged(int count)` -> `void`
- `onStateChanged(int state)` -> `void`
- `onTransitionEnd()` -> `void`
- `onVideoAvailableChange(boolean isAvailable)` -> `void`
- `pipCreatePictureInPictureView()` -> `View`
- `pipCreatePictureInPictureViewBitmap()` -> `Bitmap`
- `pipCreatePrimaryWindowViewBitmap()` -> `Bitmap`
- `pipHidePrimaryWindowView(Runnable firstFrameCallback)` -> `void`
- `pipShowPrimaryWindowView(Runnable firstFrameCallback)` -> `void`
- `static prepareForTransition()` -> `void`
- `static show(Activity activity, int account, int parentWidth, int parentHeight, int animationType)` -> `void`

## `org.telegram.ui.Components.voip.VoIPPiPView$FloatingView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.ui.ContentPreviewViewer$StickerPackNameView`
- `bind(TLRPC.StickerSetCovered cover)` -> `void`
- `getCover()` -> `TLRPC.StickerSetCovered`

## `org.telegram.ui.FeaturedStickersActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onResume()` -> `void`

## `org.telegram.ui.FeaturedStickersActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Gifts.AcquiredGiftsSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `getTitle()` -> `CharSequence`

## `org.telegram.ui.Gifts.AcquiredGiftsSheet$AcquiredGiftsCell$Factory`
- `static as(TL_stars.TL_StarGiftAuctionAcquiredGift gift, GiftAuctionController.Auction auction, OnClickListener listener)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `AcquiredGiftsCell`
- `isClickable()` -> `boolean`

## `org.telegram.ui.Gifts.ActiveAuctionsSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `dismiss()` -> `void`
- `getTitle()` -> `CharSequence`
- `onOpenAnimationEnd()` -> `void`

## `org.telegram.ui.Gifts.ActiveAuctionsSheet$ActiveAuctionCell`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `updateStatus(boolean animated)` -> `void`

## `org.telegram.ui.Gifts.AuctionBidSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `dismiss()` -> `void`
- `static formatDuration(long diff)` -> `String`
- `getTitle()` -> `CharSequence`
- `onContainerTranslationYChanged(float translationY)` -> `void`
- `onDismissAnimationStart()` -> `void`
- `onOpenAnimationEnd()` -> `void`
- `setCloseParentSheet(@Nullable Runnable closeParentSheet)` -> `void`

## `org.telegram.ui.Gifts.AuctionBidSheet$BidderCell`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setBid(long bid, boolean animated)` -> `void`
- `setPlace(int place, boolean useEmoji, boolean animated)` -> `void`
- `setUser(TLRPC.User user, boolean animated)` -> `void`

## `org.telegram.ui.Gifts.AuctionJoinSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `dismiss()` -> `void`
- `getTitle()` -> `CharSequence`
- `static initActionBar(ActionBar actionBar, Context context, Theme.ResourcesProvider resourcesProvider, int currentAccount, TL_stars.StarGift starGift)` -> `void`
- `static show(Context context, Theme.ResourcesProvider resourcesProvider, int currentAccount, long dialogId, long giftId, Runnable closeParentSheet)` -> `void`
- `static showMoreInfo(Context context, Theme.ResourcesProvider resourcesProvider, TL_stars.StarGift starGift)` -> `void`

## `org.telegram.ui.Gifts.AuctionWearingSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `dismiss()` -> `void`
- `getTitle()` -> `CharSequence`

## `org.telegram.ui.Gifts.GiftMessageBottomSheet`
- `getThemedPaint(String paintKey)` -> `Paint`
- `isLoading()` -> `boolean`
- `onBackPressed()` -> `void`
- `onOpenAnimationEnd()` -> `void`
- `setCallback(Callback callback)` -> `void`
- `setLoading(boolean loading)` -> `void`

## `org.telegram.ui.Gifts.GiftMessageDrawable`
- `attach()` -> `void`
- `detach()` -> `void`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getLineCount()` -> `int`
- `getMinimumHeight()` -> `int`
- `getMinimumWidth()` -> `int`
- `getOpacity()` -> `int`
- `getTextPaint()` -> `TextPaint`
- `measure(int maxWidth)` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setAvatarVisible(boolean visible, boolean animated)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setMessage(CharSequence text)` -> `void`
- `setParentView(View view)` -> `void`
- `setUseAvatarAnimator(boolean alwaysUseAvatarAnimator)` -> `void`
- `setUser(TLObject user)` -> `void`

## `org.telegram.ui.Gifts.GiftMessageView`
- `getDrawable()` -> `GiftMessageDrawable`
- `getTextPaint()` -> `TextPaint`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setMessage(CharSequence text)` -> `void`
- `setUser(TLObject user)` -> `void`

## `org.telegram.ui.Gifts.GiftSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getStarGiftDocument(String emoji)` -> `TLRPC.Document`
- `getTitle()` -> `CharSequence`
- `setBirthday()` -> `GiftSheet`
- `setBirthday(boolean b)` -> `GiftSheet`
- `setShowCollectiblesInfo(boolean show)` -> `void`
- `static setStarGiftImage(View view, ImageReceiver imageReceiver, String emoji)` -> `Runnable`
- `show()` -> `void`

## `org.telegram.ui.Gifts.GiftSheet$CardBackground`
- `draw(@NonNull Canvas canvas)` -> `void`
- `draw(@NonNull Canvas canvas, float largerParticlesAlpha)` -> `void`
- `getOpacity()` -> `int`
- `getPadding(@NonNull Rect padding)` -> `boolean`
- `invalidate()` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setBackdrop(TL_stars.starGiftAttributeBackdrop backdrop)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setPadding(boolean pad)` -> `void`
- `setPattern(TL_stars.starGiftAttributePattern pattern)` -> `void`
- `setRoundRadius(float r)` -> `void`
- `setSelected(boolean selected, boolean animated)` -> `void`
- `setStrokeColors(int[] colors)` -> `void`

## `org.telegram.ui.Gifts.GiftSheet$GiftCell`
- `customDraw(View view, Canvas canvas, float width, float height, float progress)` -> `void`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `getGift()` -> `TL_stars.StarGift`
- `getGiftId()` -> `long`
- `getPremiumTier()` -> `GiftPremiumBottomSheet.GiftTier`
- `getSavedGift()` -> `TL_stars.SavedStarGift`
- `hidePrice()` -> `void`
- `invalidateCustom()` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `setChecked(boolean checked, boolean animated)` -> `void`
- `setImageLayer(int l)` -> `void`
- `setImageSize(int size)` -> `void`
- `setPinned(boolean pin, boolean animated)` -> `void`
- `setPremiumGift(GiftPremiumBottomSheet.GiftTier tier)` -> `boolean`
- `setPriorityAuction()` -> `void`
- `setReordering(boolean reordering, boolean animated)` -> `void`
- `setRibbonColor(int color)` -> `void`
- `setRibbonText(String text)` -> `void`
- `setRibbonTextOneOf(int total)` -> `void`
- `setSelected(boolean selected, boolean animated)` -> `void`
- `setShowPinIcon(boolean pinIcon, boolean animated)` -> `void`
- `setStarsGift(TL_stars.StarGift gift, boolean mine, boolean includeUpgradeInPrice, boolean allowResaleInGifts, boolean inResalePage, boolean inCrafting)` -> `boolean`
- `setStarsGift(TL_stars.SavedStarGift userGift, boolean noprice, boolean inCollection)` -> `boolean`

## `org.telegram.ui.Gifts.GiftSheet$GiftCell$Factory`
- `static asPremiumGift(GiftPremiumBottomSheet.GiftTier tier)` -> `UItem`
- `static asStarGift(int tab, TL_stars.StarGift gift, boolean mine, boolean includeUpgradeInPrice, boolean allowResaleInGifts, boolean inResalePage, boolean inCrafting)` -> `UItem`
- `static asStarGift(int tab, TL_stars.SavedStarGift gift)` -> `UItem`
- `static asStarGift(int tab, TL_stars.SavedStarGift gift, boolean noprice)` -> `UItem`
- `static asStarGift(int tab, TL_stars.SavedStarGift gift, boolean noprice, boolean checkable, boolean inCollection)` -> `UItem`
- `attachedView(RecyclerListView listView, View view, UItem item)` -> `void`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `GiftCell`
- `equals(UItem a, UItem b)` -> `boolean`

## `org.telegram.ui.Gifts.GiftSheet$Ribbon`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `getText()` -> `CharSequence`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setBackdrop(TL_stars.starGiftAttributeBackdrop backdrop)` -> `void`
- `setColor(int color)` -> `void`
- `setColors(int color1, int color2)` -> `void`
- `setStrokeColor(int strokeColor)` -> `void`
- `setText(CharSequence text, boolean bold)` -> `void`
- `setText(int textSizeDp, CharSequence text, boolean bold)` -> `void`
- `setTextAnimated(CharSequence text, boolean bold)` -> `void`
- `setTextAnimated(int textSizeDp, CharSequence text, boolean bold)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Gifts.GiftSheet$RibbonDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `static fillRibbonPath(Path path, float s, boolean left)` -> `void`
- `setBackdrop(TL_stars.starGiftAttributeBackdrop backdrop, boolean swap, boolean darken)` -> `void`
- `setColor(int color)` -> `void`
- `setColors(int color1, int color2)` -> `void`
- `setLeft(boolean left)` -> `void`
- `setParticles(boolean p)` -> `void`
- `setStrokeColor(int color)` -> `void`
- `setText(int textSizeDp, CharSequence text, boolean bold)` -> `void`
- `setTextAnimated(int textSizeDp, CharSequence text, boolean bold)` -> `void`
- `setTextColor(int textColor)` -> `void`

## `org.telegram.ui.Gifts.GiftSheet$SharedBackgroundDrawables`
- `getOrCreateFilledNinePatch(int fillingColor)` -> `Drawable`
- `getOrCreateFilledWithShadowNinePatch(int fillingColor, int shadowColor)` -> `Drawable`
- `getOrCreateShadowNinePatch(int shadowColor)` -> `Drawable`

## `org.telegram.ui.Gifts.GiftSheet$StarsBackground`
- `attach()` -> `void`
- `detach()` -> `void`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `onBoundsChange(@NonNull Rect bounds)` -> `void`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Gifts.GiftSheet$StarsBackgroundView`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setBackground(Drawable background)` -> `void`

## `org.telegram.ui.Gifts.GiftSheet$Tabs`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(int id, ArrayList<CharSequence> tabs, int selected, Utilities.Callback<Integer> whenTabSelected)` -> `void`
- `setSelected(int selected, boolean animated)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Gifts.GiftSheet$Tabs$Factory`
- `static asTabs(int id, ArrayList<CharSequence> tabs, int selected, Utilities.Callback<Integer> whenTabSelected)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `contentsEquals(UItem a, UItem b)` -> `boolean`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `Tabs`
- `equals(UItem a, UItem b)` -> `boolean`

## `org.telegram.ui.Gifts.ProfileGiftsContainer`
- `createCollection()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getBottomOffset()` -> `int`
- `getCurrentList()` -> `StarsController.GiftsList`
- `getCurrentListView()` -> `RecyclerListView`
- `getCurrentPage()` -> `Page`
- `getGiftsCount()` -> `int`
- `getLastEmojis(Paint.FontMetricsInt fontMetricsInt)` -> `CharSequence`
- `getLastEmojisHash()` -> `long`
- `getTabsHeight()` -> `float`
- `getTabsVisibility()` -> `float`
- `initBlurCapture(ViewGroup parent)` -> `void`
- `isReordering()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `resetReordering()` -> `void`
- `scrollToCollectionId(int collectionId)` -> `void`
- `setButtonOffset(int offset)` -> `void`
- `static setGiftFilterOptionsClickListeners(View view, StarsController.GiftsList list, Runnable update, int flag)` -> `void`
- `setPaddingTop(int paddingTop)` -> `void`
- `setReordering(boolean reordering)` -> `void`
- `setReorderingCollections(boolean reordering)` -> `void`
- `setVisibleHeight(int height)` -> `void`
- `updateButton()` -> `void`
- `updateColors()` -> `void`
- `updateTabsShown(boolean animated)` -> `void`
- `updateTabsY()` -> `void`
- `updatedReordering(boolean reordering)` -> `void`

## `org.telegram.ui.Gifts.ProfileGiftsContainer$Page`
- `bind(boolean isCollection, StarsController.GiftsList list)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTabsHeight()` -> `float`
- `isReordering()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onItemClick(UItem item, View view, int position, float x, float y)` -> `void`
- `onItemLongPress(UItem item, View view, int position, float x, float y)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `resetReordering()` -> `void`
- `setHasTabs(boolean hasTabs)` -> `void`
- `setVisibleHeight(int height)` -> `void`
- `update(boolean animated)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Gifts.ProfileGiftsContainer$TextFactory`
- `static asBoldText(int color, int gravity, float textSizeDp, CharSequence text)` -> `UItem`
- `static asText(int color, int gravity, float textSizeDp, CharSequence text)` -> `UItem`
- `static asText(int color, int gravity, float textSizeDp, CharSequence text, boolean bold, int padding, int bottomPadding)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `LinkSpanDrawable.LinksTextView`

## `org.telegram.ui.Gifts.ResaleGiftsFragment`
- `createView(Context context)` -> `View`
- `isLightStatusBar()` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `setCloseParentSheet(Utilities.Callback<Boolean> closeParentSheet)` -> `ResaleGiftsFragment`

## `org.telegram.ui.Gifts.ResaleGiftsFragment$BackdropItem`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(TL_stars.starGiftAttributeBackdrop backdrop, int counter, String query, boolean checked)` -> `void`

## `org.telegram.ui.Gifts.ResaleGiftsFragment$BackdropItem$Factory`
- `static asBackdrop(TL_stars.starGiftAttributeBackdrop backdrop, int counter, String query)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `BackdropItem`

## `org.telegram.ui.Gifts.ResaleGiftsFragment$EmptyView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(CharSequence text)` -> `void`

## `org.telegram.ui.Gifts.ResaleGiftsFragment$EmptyView$Factory`
- `static asEmptyView(CharSequence text)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `EmptyView`

## `org.telegram.ui.Gifts.ResaleGiftsFragment$Filter`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setSorting(ResaleGiftsList.Sorting sorting)` -> `void`
- `setValue(CharSequence text)` -> `void`

## `org.telegram.ui.Gifts.ResaleGiftsFragment$ModelItem`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(TL_stars.starGiftAttributeModel pattern, int counter, String query, boolean checked)` -> `void`

## `org.telegram.ui.Gifts.ResaleGiftsFragment$ModelItem$Factory`
- `static asModel(TL_stars.starGiftAttributeModel model, int counter, String query)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `ModelItem`

## `org.telegram.ui.Gifts.ResaleGiftsFragment$PatternItem`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(TL_stars.starGiftAttributePattern pattern, int counter, String query, boolean checked)` -> `void`

## `org.telegram.ui.Gifts.ResaleGiftsFragment$PatternItem$Factory`
- `static asPattern(TL_stars.starGiftAttributePattern backdrop, int counter, String query)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `PatternItem`

## `org.telegram.ui.Gifts.ResaleGiftsFragment$ResaleGiftsList`
- `findGiftToUpgrade(int from)` -> `int`
- `forCraft()` -> `ResaleGiftsList`
- `get(int index)` -> `Object`
- `getLoadedCount()` -> `int`
- `getSorting()` -> `Sorting`
- `getTotalCount()` -> `int`
- `indexOf(Object o)` -> `int`
- `notifyUpdate()` -> `void`
- `reload()` -> `void`
- `set(int index, Object obj)` -> `void`
- `setSorting(Sorting newSorting)` -> `void`

## `org.telegram.ui.Gifts.ResaleGiftsFragment$SelectGiftSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `getTitle()` -> `CharSequence`
- `onSheetTop(float top)` -> `void`
- `setActionText(CharSequence text)` -> `SelectGiftSheet`
- `setOnSelect(Utilities.Callback<TL_stars.StarGift> onSelect)` -> `SelectGiftSheet`
- `setWillBeFirst(boolean willBeFirst)` -> `SelectGiftSheet`
- `without(HashSet<Long> ids)` -> `SelectGiftSheet`

## `org.telegram.ui.Gifts.ResaleGiftsFragment$SelectGiftSheet$State`
- `attach()` -> `void`
- `detach()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `listen(Runnable listener)` -> `void`

## `org.telegram.ui.Gifts.SelectGiftsBottomSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `getTitle()` -> `CharSequence`
- `onApplyWindowInsetsToRoot(@NonNull View v, @NonNull WindowInsetsCompat insets)` -> `WindowInsetsCompat`

## `org.telegram.ui.Gifts.SendGiftSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getParentBulletinFactory()` -> `BulletinFactory`
- `getTitle()` -> `CharSequence`
- `onAttachedToWindow()` -> `void`
- `onBackPressed()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onOpenAnimationEnd()` -> `void`
- `show()` -> `void`

## `org.telegram.ui.Gifts.StarGiftUniqueActionView`
- `getLayout()` -> `StarGiftUniqueActionLayout`
- `getThemedPaint(String paintKey)` -> `Paint`
- `hasGradientService()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `set(TL_stars.TL_starGiftUnique gift, long fromId, TLRPC.TL_textWithEntities message, String button, boolean animated)` -> `void`
- `setLayoutBackground(Drawable background)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.GroupStickersActivity`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `setInfo(TLRPC.ChatFull chatFull)` -> `void`

## `org.telegram.ui.GroupStickersActivity$AddEmojiCell`
- `bind(boolean needDivider, TLRPC.TL_messages_stickerSet selectedStickerSe)` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `setNeedDivider(boolean needDivider)` -> `void`

## `org.telegram.ui.GroupStickersActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.GroupStickersActivity$SearchAdapter`
- `getItemCount()` -> `int`
- `getItemId(int position)` -> `long`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.PeerColorActivity$GiftCell`
- `getGiftId()` -> `long`
- `set(int index, TL_stars.TL_starGiftUnique gift)` -> `void`
- `set(int index, TL_stars.SavedStarGift g)` -> `void`
- `setSelected(boolean selected, boolean animated)` -> `void`

## `org.telegram.ui.PhotoViewer`
- `BLUR_RENDERNODE()` -> `boolean`
- `closePhoto(boolean animated, boolean fromEditMode)` -> `void`
- `static createCroppedBitmap(Bitmap bitmap, MediaController.CropState cropState, int[] extraTransform, boolean mirror)` -> `Bitmap`
- `destroyPhotoViewer()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `drawCaptionBlur(Canvas canvas, BlurringShader.StoryBlurDrawer drawer, int bgColor, int overlayColor, boolean clip, boolean allowTransparent, boolean allowCrossfade)` -> `void`
- `drawCaptionBlur(Canvas canvas, BlurringShader.StoryBlurDrawer drawer, int bgColor, int overlayColor, boolean clip, boolean allowTransparent, boolean allowCrossfade, boolean glass)` -> `void`
- `enableStickerMode(TLRPC.Document originalDocument, TLRPC.Document document, boolean empty, Utilities.Callback2<String, TLRPC.InputDocument> customHandler)` -> `void`
- `exitFromPip()` -> `void`
- `getAnimationValue()` -> `float`
- `getClassGuid()` -> `int`
- `getCurrentCaptionText()` -> `CharSequence`
- `getCurrentIndex()` -> `int`
- `getCurrentPosition()` -> `long`
- `getCurrentVideoSpeed()` -> `float`
- `static getFileLocation(ImageLocation location)` -> `TLRPC.FileLocation`
- `static getFileLocationExt(ImageLocation location)` -> `String`
- `getImagesArrLocals()` -> `List<Object>`
- `static getInstance()` -> `PhotoViewer`
- `static getInstance2()` -> `PhotoViewer`
- `getOriginalSticker()` -> `TLRPC.Document`
- `getParentActivity()` -> `Activity`
- `getParentAlert()` -> `ChatAttachAlert`
- `static getPipInstance()` -> `PhotoViewer`
- `static getSavedProgress(MessageObject msg)` -> `float`
- `static getSavedProgressFast(MessageObject msg)` -> `float`
- `getSelectionLength()` -> `int`
- `static getTempFileAbsolutePath()` -> `String`
- `getVideoPlayer()` -> `VideoPlayer`
- `getVideoPlayerRewinder()` -> `VideoPlayerRewinder`
- `getVideoSurfaceView()` -> `SurfaceView`
- `getVideoTextureView()` -> `TextureView`
- `injectVideoPlayer(VideoPlayer player)` -> `void`
- `injectVideoPlayerSurface(SurfaceTexture surface)` -> `void`
- `injectVideoPlayerToMediaController()` -> `void`
- `invalidateAllGlassAttachedViews()` -> `void`
- `mergeImages(String finalPath, String thumbPath, Bitmap thumb, Bitmap bitmap, float size, boolean reverse)` -> `void`
- `static mergeImages(String finalPath, String thumbPath, Bitmap thumb, Bitmap bitmap, Bitmap.CompressFormat format, float size, boolean reverse)` -> `void`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onDoubleTap(MotionEvent e)` -> `boolean`
- `onDoubleTapEvent(MotionEvent e)` -> `boolean`
- `onDown(MotionEvent e)` -> `boolean`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY)` -> `boolean`
- `onLongPress(MotionEvent ev)` -> `void`
- `onLongPress()` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY)` -> `boolean`
- `onShowPress(MotionEvent e)` -> `void`
- `onSingleTapConfirmed(MotionEvent e)` -> `boolean`
- `onSingleTapUp(MotionEvent e)` -> `boolean`
- `onUp(MotionEvent e)` -> `void`
- `openAdsMenu()` -> `void`
- `openKeyboard()` -> `void`
- `openPhoto(final MessageObject messageObject, ChatActivity chatActivity, long dialogId, long mergeDialogId, long topicId, final PhotoViewerProvider provider)` -> `boolean`
- `openPhoto(final MessageObject messageObject, int embedSeekTime, ChatActivity chatActivity, long dialogId, long mergeDialogId, long topicId, final PhotoViewerProvider provider)` -> `boolean`
- `openPhoto(final MessageObject messageObject, long dialogId, long mergeDialogId, long topicId, final PhotoViewerProvider provider, boolean fullScreenVideo)` -> `boolean`
- `openPhoto(final TLRPC.FileLocation fileLocation, final PhotoViewerProvider provider)` -> `boolean`
- `openPhoto(final TLRPC.FileLocation fileLocation, final ImageLocation imageLocation, final PhotoViewerProvider provider)` -> `boolean`
- `openPhoto(final ArrayList<MessageObject> messages, final int index, long dialogId, long mergeDialogId, long topicId, final PhotoViewerProvider provider)` -> `boolean`
- `openPhoto(final ArrayList<SecureDocument> documents, final int index, final PhotoViewerProvider provider)` -> `boolean`
- `openPhoto(int index, PageBlocksAdapter pageBlocksAdapter, PhotoViewerProvider provider)` -> `boolean`
- `openPhoto(final MessageObject messageObject, final TLRPC.FileLocation fileLocation, final ImageLocation imageLocation, final ImageLocation videoLocation, final ArrayList<MessageObject> messages, final ArrayList<SecureDocument> documents, final ArrayList<Object> photos, final int index, final PhotoViewerProvider provider, ChatActivity chatActivity, long dialogId, long mDialogId, long topicId, boolean fullScreenVideo, PageBlocksAdapter pageBlocksAdapter, Integer embedSeekTime)` -> `boolean`
- `openPhotoForSelect(final ArrayList<Object> photos, final int index, int type, boolean documentsPicker, final PhotoViewerProvider provider, ChatActivity chatActivity)` -> `boolean`
- `openPhotoForSelect(final TLRPC.FileLocation fileLocation, final ImageLocation imageLocation, final ArrayList<Object> photos, final int index, int type, boolean documentsPicker, final PhotoViewerProvider provider, ChatActivity chatActivity)` -> `boolean`
- `openPhotoWithVideo(final TLRPC.FileLocation fileLocation, ImageLocation videoLocation, final PhotoViewerProvider provider)` -> `boolean`
- `openPhotoWithVideo(final TLRPC.FileLocation fileLocation, ImageLocation imageLocation, ImageLocation videoLocation, final PhotoViewerProvider provider)` -> `boolean`
- `pipCreatePictureInPictureView()` -> `View`
- `pipCreatePictureInPictureViewBitmap()` -> `Bitmap`
- `pipCreatePrimaryWindowViewBitmap()` -> `Bitmap`
- `pipHidePrimaryWindowView(Runnable firstFrameCallback)` -> `void`
- `pipIsAvailable()` -> `boolean`
- `pipRenderBackground(Canvas canvas)` -> `void`
- `pipRenderForeground(Canvas canvas)` -> `void`
- `pipShowPrimaryWindowView(Runnable firstFrameCallback)` -> `void`
- `prepareSegmentImage()` -> `void`
- `setAnimationValue(float value)` -> `void`
- `setAvatarFor(ImageUpdater.AvatarFor avatarFor)` -> `void`
- `setCaption(CharSequence caption)` -> `void`
- `setMaxSelectedPhotos(int value, boolean order)` -> `void`
- `setParentActivity(Activity activity)` -> `void`
- `setParentActivity(Activity activity, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `setParentActivity(BaseFragment fragment)` -> `void`
- `setParentActivity(BaseFragment fragment, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `setParentActivity(Activity inActivity, BaseFragment fragment, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `setParentAlert(ChatAttachAlert alert)` -> `void`
- `setSelectionDisabled(boolean disabled)` -> `void`
- `setTitle(CharSequence title)` -> `void`
- `showAlertDialog(AlertDialog.Builder builder)` -> `void`
- `showCaptionLimitBulletin(FrameLayout view)` -> `boolean`
- `showChromecastBulletin(String uri, String deviceName)` -> `void`
- `switchToEditMode(final int mode)` -> `void`
- `syncCastedPlayer()` -> `void`
- `updateColors()` -> `void`
- `updateMuteButton()` -> `void`
- `updateWebPlayerState(boolean playWhenReady, int playbackState)` -> `void`
- `zoomOut()` -> `void`

## `org.telegram.ui.PhotoViewer$ActionBarToggleParams`
- `animationDuration(int val)` -> `ActionBarToggleParams`
- `animationInterpolator(Interpolator val)` -> `ActionBarToggleParams`
- `enableStatusBarAnimation(boolean val)` -> `ActionBarToggleParams`
- `enableTranslationAnimation(boolean val)` -> `ActionBarToggleParams`

## `org.telegram.ui.PhotoViewer$BackgroundDrawable`
- `draw(Canvas canvas)` -> `void`
- `setAlpha(int alpha)` -> `void`

## `org.telegram.ui.PhotoViewer$BlurButton`
- `isActive()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onDrawForeground(Canvas canvas)` -> `void`
- `setActive(boolean active, boolean animated)` -> `void`

## `org.telegram.ui.PhotoViewer$CaptionScrollView`
- `applyPendingTopMargin()` -> `void`
- `calculateNewContainerMarginTop(int width, int height)` -> `int`
- `computeScroll()` -> `void`
- `dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow, int type)` -> `boolean`
- `dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, @Nullable int[] offsetInWindow, int type, @NonNull int[] consumed)` -> `void`
- `draw(Canvas canvas)` -> `void`
- `fling(int velocityY)` -> `void`
- `getBottomFadingEdgeStrength()` -> `float`
- `getPendingMarginTopDiff()` -> `int`
- `getTopFadingEdgeStrength()` -> `float`
- `isStatusBarVisible()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onScrollEnd()` -> `void`
- `onScrollStart()` -> `void`
- `onScrollUpdate()` -> `void`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
- `reset()` -> `void`
- `startNestedScroll(int axes, int type)` -> `boolean`
- `stopNestedScroll(int type)` -> `void`
- `stopScrolling()` -> `void`
- `updateTopMargin()` -> `void`

## `org.telegram.ui.PhotoViewer$CaptionTextView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter)` -> `void`
- `setLoading(boolean loading)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.PhotoViewer$CaptionTextViewSwitcher`
- `getAlpha()` -> `float`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `setAlpha(float alpha)` -> `void`
- `setContainer(FrameLayout container)` -> `void`
- `setScrollView(NestedScrollView scrollView)` -> `void`
- `setTranslationY(float translationY)` -> `void`
- `setVisibility(int visibility)` -> `void`
- `setVisibility(int visibility, boolean withScrollView)` -> `void`

## `org.telegram.ui.PhotoViewer$CounterView`
- `getRotationX()` -> `float`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setCount(int value)` -> `void`
- `setRotationX(float rotationX)` -> `void`
- `setScaleX(float scaleX)` -> `void`

## `org.telegram.ui.PhotoViewer$EditState`
- `reset()` -> `void`

## `org.telegram.ui.PhotoViewer$EmptyPhotoViewerProvider`
- `allowCaption()` -> `boolean`
- `allowSendingSubmenu()` -> `boolean`
- `closeKeyboard()` -> `boolean`
- `getPhotoIndex(int index)` -> `int`
- `getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int index, boolean needPreview, boolean closing)` -> `PlaceProviderObject`
- `getSelectedCount()` -> `int`
- `getSelectedPhotos()` -> `HashMap<Object, Object>`
- `getSelectedPhotosOrder()` -> `ArrayList<Object>`
- `getSubtitleFor(int i)` -> `CharSequence`
- `getThumbForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int index)` -> `ImageReceiver.BitmapHolder`
- `getTitleFor(int i)` -> `CharSequence`
- `getTotalImageCount()` -> `int`
- `needAddMorePhotos()` -> `void`
- `onApplyCaption(CharSequence caption)` -> `void`
- `onCaptionChanged(CharSequence caption)` -> `void`
- `onClose()` -> `void`
- `onOpen()` -> `void`
- `openPhotoForEdit(String file, String thumb, boolean isVideo)` -> `void`
- `replaceButtonPressed(int index, VideoEditedInfo videoEditedInfo)` -> `void`
- `scaleToFill()` -> `boolean`
- `setPhotoChecked(int index, VideoEditedInfo videoEditedInfo)` -> `int`
- `setPhotoUnchecked(Object photoEntry)` -> `int`
- `updatePhotoAtIndex(int index)` -> `void`
- `validateGroupId(long groupId)` -> `boolean`
- `willHidePhotoViewer()` -> `void`
- `willSwitchFromPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int index)` -> `void`

## `org.telegram.ui.PhotoViewer$FirstFrameView`
- `clear()` -> `void`
- `containsFrame()` -> `boolean`

## `org.telegram.ui.PhotoViewer$FrameLayoutDrawer`
- `dispatchDraw(Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `draw(Canvas canvas)` -> `void`
- `drawChild(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `drawChildInternal(Canvas canvas, View child, long drawingTime)` -> `boolean`
- `getBottomPadding()` -> `int`
- `notifyHeightChanged()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int _l, int t, int _r, int _b)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `updateExclusionRects()` -> `void`

## `org.telegram.ui.PhotoViewer$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int i)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.PhotoViewer$PhotoCountView`
- `isShown()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(int left, int right)` -> `void`
- `set(int left, int right, boolean animated)` -> `void`
- `updateShow(boolean show, boolean animated)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.PhotoViewer$PhotoProgressView`
- `getX()` -> `int`
- `getY()` -> `int`
- `onDraw(Canvas canvas)` -> `void`
- `onVisibilityChanged(boolean visible)` -> `void`
- `resetAlphas()` -> `void`
- `setAlpha(float value)` -> `void`
- `setBackgroundState(int state, boolean animated, boolean animateIcon)` -> `void`
- `setIndexedAlpha(int index, float alpha, boolean animated)` -> `void`
- `setProgress(float value, boolean animated)` -> `void`
- `setScale(float value)` -> `void`

## `org.telegram.ui.PhotoViewer$PhotoViewerActionBarContainer`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getTitle()` -> `CharSequence`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setSubtitle(CharSequence subtitle)` -> `void`
- `setSubtitle(CharSequence subtitle, boolean animated)` -> `void`
- `setTextShadows(boolean applyShadows)` -> `void`
- `setTitle(CharSequence title)` -> `void`
- `setTitleAnimated(CharSequence title, boolean axis, boolean direction)` -> `void`
- `updateOrientation()` -> `void`
- `updateRightPadding(int rightPadding)` -> `void`
- `updateRightPadding(float rightPadding, boolean animated)` -> `void`

## `org.telegram.ui.PhotoViewer$PhotoViewerProvider`
- `allowLivePhotos()` -> `default boolean`
- `forceAllInGroup()` -> `default boolean`
- `isEditingMessageResend()` -> `default boolean`
- `moveCaptionAbove(boolean above)` -> `default void`
- `onDeletePhoto(int index)` -> `default boolean`
- `onEditModeChanged(boolean isEditMode)` -> `default void`
- `onPollAttachDelete()` -> `default void`
- `onPollAttachReplace()` -> `default void`
- `onPreClose()` -> `default void`
- `onPreOpen()` -> `default void`
- `onReleasePlayerBeforeClose(int currentIndex)` -> `default void`
- `updatedLivePhotos()` -> `default void`

## `org.telegram.ui.PhotoViewer$PhotoViewerWindowView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `dispatchKeyEvent(KeyEvent event)` -> `boolean`
- `dispatchKeyEventPreIme(KeyEvent event)` -> `boolean`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `draw(@NonNull Canvas canvas)` -> `void`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.ui.PhotoViewer$QualityChooseView`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.ui.PhotoViewer$SavedState`
- `restore()` -> `void`

## `org.telegram.ui.PhotoViewer$SelectedPhotosListView`
- `onDraw(Canvas c)` -> `void`

## `org.telegram.ui.PhotoViewer$VideoPlayerControlFrameLayout`
- `getProgress()` -> `float`
- `isSeekBarTransitionEnabled()` -> `boolean`
- `onDetachedFromWindow()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setProgress(float progress)` -> `void`
- `setSeekBarTransitionEnabled(boolean seekBarTransitionEnabled)` -> `void`
- `setTranslationYAnimationEnabled(boolean translationYAnimationEnabled)` -> `void`

## `org.telegram.ui.SaveToGallerySettingsActivity`
- `createView(Context context)` -> `View`
- `getSettings()` -> `SaveToGallerySettingsHelper.Settings`
- `onFragmentCreate()` -> `boolean`
- `onResume()` -> `void`

## `org.telegram.ui.SaveToGallerySettingsActivity$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.SaveToGallerySettingsActivity$Item`
- `equals(Object o)` -> `boolean`

## `org.telegram.ui.SaveToGallerySettingsActivity$SelectableAnimatedTextView`
- `dispatchDraw(Canvas canvas)` -> `void`
- `setSelectedInternal(boolean selected, boolean animated)` -> `void`

## `org.telegram.ui.SecretMediaViewer$VideoPlayerControlFrameLayout`
- `getProgress()` -> `float`
- `isSeekBarTransitionEnabled()` -> `boolean`
- `onDetachedFromWindow()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setProgress(float progress)` -> `void`
- `setSeekBarTransitionEnabled(boolean seekBarTransitionEnabled)` -> `void`
- `setTranslationYAnimationEnabled(boolean translationYAnimationEnabled)` -> `void`

## `org.telegram.ui.SecretVoicePlayer`
- `dismiss()` -> `void`
- `isShown()` -> `boolean`
- `onBackPressed()` -> `void`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `setCell(ChatMessageCell messageCell, Runnable openAction, Runnable closeAction)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.Stars.CraftGiftSheet$Background`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Stars.GiftOfferSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `getTitle()` -> `CharSequence`
- `isTouchOutside(float x, float y)` -> `boolean`
- `onContainerTranslationYChanged(float translationY)` -> `void`
- `onOpenAnimationEnd()` -> `void`
- `static openOfferAcceptAlert(BaseFragment fragment, Context context, Theme.ResourcesProvider resourcesProvider, int currentAccount, long dialogId, int msgId, TLRPC.TL_messageActionStarGiftPurchaseOffer offer)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.Stars.ProfileGiftsView`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `getGiftUnder(float x, float y)` -> `Gift`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onGiftClick(Gift gift)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setActionBarActionMode(float progress)` -> `void`
- `setActive(boolean f)` -> `void`
- `setBounds(float left, float right, float cy, boolean animated, int maxExpandY)` -> `void`
- `setCollapseProgress(float progress, boolean isOpening)` -> `void`
- `setExpandCoords(float y)` -> `void`
- `setExpandProgress(float progress)` -> `void`
- `setProgressToStoriesInsets(float progressToInsets)` -> `void`
- `update()` -> `void`

## `org.telegram.ui.Stars.ProfileGiftsView$Gift`
- `copy(Gift b)` -> `void`
- `draw(Canvas canvas, float cx, float cy, float ascale, float rotate, float alpha, float gradientAlpha)` -> `void`
- `equals(Gift b)` -> `boolean`

## `org.telegram.ui.Stars.SellGiftEnterPriceSheet`
- `show()` -> `void`

## `org.telegram.ui.Stars.StarGiftPatterns`
- `static drawPattern(Canvas canvas, Drawable pattern, float w, float h, float alpha, float scale)` -> `void`
- `static drawPattern(Canvas canvas, int type, Drawable pattern, float w, float h, float alpha, float scale)` -> `void`
- `static drawPatternBatch(Canvas canvas, int type, Paint paint, Bitmap bitmap, float w, float h, float alpha, float scale)` -> `void`
- `static drawProfileAnimatedPattern(Canvas canvas, Drawable pattern, int w, float maxExpandY, float diff, View avatarContainer, float _alpha)` -> `void`
- `static drawProfileAnimatedPattern(Canvas canvas, Drawable pattern, int w, float maxExpandY, float diff, RectF avatarContainer, float _alpha)` -> `void`
- `static drawProfilePattern(Canvas canvas, Drawable pattern, float w, float h, float alpha, float full)` -> `void`

## `org.telegram.ui.Stars.StarGiftPreviewSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `createRecyclerView(Context context)` -> `RecyclerListView`
- `getTitle()` -> `CharSequence`
- `isTouchOutside(float x, float y)` -> `boolean`
- `mainContainerDispatchDraw(Canvas canvas)` -> `void`
- `onInsetsChanged()` -> `void`
- `onOpenAnimationEnd()` -> `void`

## `org.telegram.ui.Stars.StarGiftPreviewSheet$GiftAttributeCell`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `setSelected(boolean isSelected, boolean animated)` -> `void`

## `org.telegram.ui.Stars.StarGiftPreviewSheet$GiftAttributeCell$Factory`
- `static asAttribute(int tab, Attributes attributes)` -> `UItem`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `GiftAttributeCell`

## `org.telegram.ui.Stars.StarGiftPreviewSheet$TabsSelectorView`
- `getSelectedTab()` -> `int`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `doTransfer(long dialogId, Utilities.Callback<TLRPC.TL_error> done)` -> `void`
- `eq(TL_stars.TL_starGiftUnique a, TL_stars.TL_starGiftUnique b)` -> `boolean`
- `eq(TL_stars.SavedStarGift a, TL_stars.SavedStarGift b)` -> `boolean`
- `eq(TL_stars.SavedStarGift a, TL_stars.InputSavedStarGift input)` -> `boolean`
- `eq(TL_stars.StarGift a, TL_stars.SavedStarGift b)` -> `boolean`
- `getActionBarProgressHeight()` -> `int`
- `getBulletinFactory()` -> `BulletinFactory`
- `getGift()` -> `TL_stars.StarGift`
- `getGiftName()` -> `String`
- `static getGiftName(TL_stars.StarGift gift)` -> `String`
- `static getInputStarGift(long dialogId, TL_stars.SavedStarGift g)` -> `TL_stars.InputSavedStarGift`
- `static getRarityName(TL_stars.StarGiftAttributeRarity rarity)` -> `CharSequence`
- `static getRarityName(TL_stars.StarGiftAttributeRarity rarity, Integer[] color)` -> `CharSequence`
- `getTitle()` -> `CharSequence`
- `getUniqueGift()` -> `TL_stars.TL_starGiftUnique`
- `static isMine(int currentAccount, long dialogId)` -> `boolean`
- `static isMineWithActions(int currentAccount, long dialogId)` -> `boolean`
- `isSaved()` -> `boolean`
- `static isWorn(int currentAccount, TL_stars.TL_starGiftUnique gift)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onBackPressed()` -> `void`
- `onBuyPressed()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onResellPressed(View btn)` -> `void`
- `onSharePressed(View btn)` -> `void`
- `onSwipeStarts()` -> `void`
- `onTransferClick(View view)` -> `void`
- `openAsLearnMore(long gift_id, String username)` -> `void`
- `openTransfer()` -> `void`
- `openTransferAlert(long dialogId, Utilities.Callback<Browser.Progress> confirmed)` -> `void`
- `static replaceSingleTagToLink(String str, Runnable click)` -> `SpannableStringBuilder`
- `static replaceUnderstood(CharSequence cs)` -> `CharSequence`
- `static replaceUnderstood(CharSequence cs, ColoredImageSpan[] cache)` -> `CharSequence`
- `set(String slug, TL_stars.TL_starGiftUnique gift, StarsController.IGiftsList list)` -> `StarGiftSheet`
- `set(TL_stars.TL_starGiftUnique gift, boolean refunded)` -> `void`
- `set(TL_stars.TL_starGiftUnique gift, boolean refunded, TLObject fromObject, TLRPC.TL_textWithEntities message)` -> `void`
- `set(TL_stars.SavedStarGift savedStarGift, StarsController.IGiftsList list)` -> `StarGiftSheet`
- `set(MessageObject messageObject)` -> `StarGiftSheet`
- `set(MessageObject messageObject, StarsController.IGiftsList list)` -> `StarGiftSheet`
- `setCloseParentSheet(Utilities.Callback<Boolean> closeParentSheet)` -> `StarGiftSheet`
- `setOnBoughtGift(BoughtGiftCallback boughtGift)` -> `StarGiftSheet`
- `setOnGiftUpdatedListener(Runnable listener)` -> `StarGiftSheet`
- `setupWearPage()` -> `StarGiftSheet`
- `show()` -> `void`
- `showCraft()` -> `boolean`
- `showHint(CharSequence hintText, View textView, boolean onRightDrawable)` -> `void`
- `switchPage(int page, boolean animated)` -> `void`
- `switchPage(int page, boolean animated, Runnable done)` -> `void`
- `toggleWear()` -> `void`
- `toggleWear(boolean checkedLevel)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$ActionView`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `prepareBlur(View parentDecorView)` -> `void`
- `set(MessageObject messageObject)` -> `void`
- `set(int currentAccount, TL_stars.SavedStarGift gift)` -> `void`
- `set(CharSequence text)` -> `void`
- `setFullRect(boolean b)` -> `void`
- `setPadding(int x, int y)` -> `void`
- `setRoundRadius(float r)` -> `void`
- `setTranslationY(float translationY)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$Adapter`
- `getItemCount()` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `setHeights(int top, int bottom)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$ContainerView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `dispatchTouchEvent(MotionEvent ev)` -> `boolean`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `height()` -> `float`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setDimAlpha(float dimAlpha)` -> `void`
- `setTranslationY(float translationY)` -> `void`
- `top()` -> `float`
- `updateTranslations()` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$CraftTopView`
- `getFirstGift()` -> `TL_stars.StarGift`
- `getGiftsSelectedCount()` -> `int`
- `getGiftsSuccessChance()` -> `int`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `playAnimation()` -> `void`
- `selectGift(TL_stars.StarGift gift)` -> `void`
- `setOnAddGift(Utilities.Callback2<Utilities.Callback<TL_stars.StarGift>, Boolean> onAddGift)` -> `void`
- `setOnClose(Runnable onClose)` -> `void`
- `setOnCraft(Utilities.Callback3<ArrayList<TL_stars.StarGift>, Utilities.Callback2<TL_stars.StarGift, Runnable>, Runnable> onCraft)` -> `void`
- `setup()` -> `void`
- `setup(int currentAccount, long gift_id, TLRPC.Document document, String collection)` -> `void`
- `showHint(AttributeView view)` -> `void`
- `showHint(View view, CharSequence text)` -> `void`
- `updateCounts()` -> `void`
- `updateCounts(boolean animated)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$CraftTopView$AttributeView`
- `setBackdrop(TL_stars.starGiftAttributeBackdrop backdrop)` -> `void`
- `setIcon(TL_stars.starGiftAttributePattern pattern)` -> `void`
- `setProgress(float p, boolean animated)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$CraftTopView$ButtonBackground`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColor(int leftColor, int rightColor)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$CraftTopView$Cube3D`
- `drawChild(@NonNull Canvas canvas, View child, long drawingTime)` -> `boolean`
- `fling(float forceX, float forceY)` -> `void`
- `getChildDrawingOrder(int childCount, int drawingPosition)` -> `int`
- `getClosestFace()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `pullFace(SelectGiftView view, float force, long delay, Runnable whenDone)` -> `void`
- `reset()` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$CraftTopView$Cube3D$AnimSequence`
- `delay(int frames)` -> `AnimSequence`
- `fling(float x, float y)` -> `AnimSequence`
- `friction(boolean enable)` -> `AnimSequence`
- `onPullComplete()` -> `void`
- `run(Runnable r)` -> `AnimSequence`
- `start(Runnable onComplete)` -> `void`
- `steerTo(int face, int frames)` -> `AnimSequence`
- `steerTo(int face, int frames, float rotation)` -> `AnimSequence`
- `tick()` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$CraftTopView$Face`
- `setChance(float percents, boolean animated)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$CraftTopView$ProgressView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `setProgress(float p, boolean animated)` -> `void`
- `setRadius(float r)` -> `void`
- `setStrokeWidth(float sw)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$CraftTopView$RaysView`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `setColor(int leftColor, int rightColor)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$CraftTopView$SelectGiftView`
- `getGift()` -> `TL_stars.StarGift`
- `getSavedGift()` -> `TL_stars.SavedStarGift`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setGift(TL_stars.SavedStarGift gift, boolean animated)` -> `void`
- `setGift(TL_stars.StarGift gift, boolean animated)` -> `void`
- `setGiftVisible(boolean visible, boolean animated)` -> `void`
- `setHideButtons(float t)` -> `void`
- `setReplaceIcon(boolean replaceIcon)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$CraftTopView$SwitchGradientDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`
- `setColors(int color1, int color2)` -> `void`
- `setIcon(Drawable icon)` -> `void`
- `setRoundRadius(float r)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$GiftThemeReuseTopView`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$GiftTransferTopView`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$PageTransition`
- `at(int page)` -> `float`
- `at(int page1, int page2)` -> `float`
- `at(int page1, int page2, int page3)` -> `float`
- `contains(int page)` -> `boolean`
- `is(int page)` -> `boolean`
- `setProgress(float t)` -> `void`
- `to(int page)` -> `boolean`

## `org.telegram.ui.Stars.StarGiftSheet$ResaleBuyTransferAlert`
- `show()` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$Roller`
- `detach()` -> `void`
- `invalidate()` -> `void`
- `preload(ArrayList<TL_stars.StarGiftAttribute> sampleAttributes)` -> `void`
- `set(TL_stars.TL_starGiftUnique toGift, boolean roll, Runnable whenDone, Runnable whenDone2)` -> `boolean`
- `skip()` -> `void`
- `stopPreload()` -> `void`
- `update()` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$Roller$Attr`
- `attach()` -> `void`
- `detach()` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$Roller$AttrRoller`
- `detach()` -> `void`
- `next(boolean allowFinish)` -> `T`
- `skip()` -> `void`
- `step(float deltaTime, boolean allowFinish)` -> `float`

## `org.telegram.ui.Stars.StarGiftSheet$Roller$Sticker`
- `attach()` -> `void`
- `detach()` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$RoundRectStrokeDrawable`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getOpacity()` -> `int`
- `setAlpha(int alpha)` -> `void`
- `setColor(int color)` -> `void`
- `setColorFilter(@Nullable ColorFilter colorFilter)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$StarGiftDrawableIcon`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedToWindow()` -> `void`
- `setAuctionStateTextColor(int textColor)` -> `void`
- `setCountdownRemainingTime(int startTime, int endTime)` -> `void`
- `setGradient(int centerColor, int edgeColor)` -> `void`
- `setPatternsType(int type)` -> `StarGiftDrawableIcon`
- `setRounding(int r)` -> `StarGiftDrawableIcon`

## `org.telegram.ui.Stars.StarGiftSheet$StickersRollView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `drawBackgrounds(Canvas canvas, float width, float height, int[] textColors, int[] backgroundColors, int[] patternColors)` -> `void`
- `hasBackgrounds()` -> `boolean`
- `resetDrawing()` -> `void`
- `setDrawing(Roller.Sticker a, float aT, boolean aIsFinish, Roller.Sticker b, float bT, boolean bIsFinish, Roller.Sticker c, float cT, boolean cIsFinish, Roller.Background bgA, float bgAT, boolean bgAIsFinish, Roller.Background bgB, float bgBT, boolean bgBIsFinish, Roller.Background bgC, float bgCT, boolean bgCIsFinish)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$TextViewRoll`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `isRolling()` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `update(Roller.Attr prev, float prevT, boolean isPrevFinish, Roller.Attr current, float currentT, boolean isCurrentFinish, Roller.Attr next, float nextT, boolean isNextFinish)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$TextViewRoll$TextView`
- `set(String name, int rarity_permille, Utilities.Callback3<CharSequence, View, Boolean> showHint)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$TopView`
- `dispatchDraw(@NonNull Canvas canvas)` -> `void`
- `drawBackground(Canvas canvas, float cx, float cy, float width, float height)` -> `int`
- `drawPattern(Canvas canvas, float cx, float cy, float width, float height)` -> `void`
- `getFinalHeight()` -> `int`
- `getRealHeight()` -> `float`
- `getUpgradeBackdropAttribute()` -> `TL_stars.starGiftAttributeBackdrop`
- `getUpgradeImageView()` -> `BackupImageView`
- `getUpgradeImageViewAttribute()` -> `TL_stars.starGiftAttributeModel`
- `getUpgradePatternAttribute()` -> `TL_stars.starGiftAttributePattern`
- `hideCloseButton()` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onSwitchPage(PageTransition p)` -> `void`
- `prepareSwitchPage(final PageTransition t)` -> `void`
- `setGift(TL_stars.StarGift gift, boolean isOwner, boolean isHost, boolean worn, boolean hasLink, boolean rolling)` -> `void`
- `setPattern(int p, TL_stars.starGiftAttributePattern pattern, boolean animated)` -> `void`
- `setPreviewAttributes(StarGiftPreviewSheet.Attributes attributes)` -> `void`
- `setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> sampleAttributes)` -> `void`
- `setResellPrice(AmountUtils.Amount price)` -> `void`
- `setText(int page, CharSequence title, CharSequence subtitle, CharSequence releasedSubtitle, CharSequence released)` -> `void`
- `setText(int page, CharSequence title, CharSequence subtitle, CharSequence releasedSubtitle, CharSequence released, TLObject fromObject, CharSequence message)` -> `void`
- `setWearPreview(TLObject object)` -> `void`
- `updateButtonsBackgrounds(int color)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$TopView$Button`
- `set(int iconResId, CharSequence text, boolean animated)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$UpgradeIcon`
- `draw(@NonNull Canvas canvas)` -> `void`
- `getIntrinsicHeight()` -> `int`
- `getIntrinsicWidth()` -> `int`
- `setAlpha(int alpha)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$UpgradePricesSheet`
- `setCurrentPrice(long price)` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet$UserToUserTransferTopView`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.Stars.StarGiftUniqueActionLayout`
- `attach()` -> `void`
- `detach()` -> `void`
- `draw(Canvas canvas)` -> `void`
- `drawOutbounds(Canvas canvas)` -> `void`
- `getHeight()` -> `float`
- `getWidth()` -> `float`
- `has()` -> `boolean`
- `onTouchEvent(float ox, float oy, MotionEvent e)` -> `boolean`
- `set(MessageObject messageObject, boolean animated)` -> `void`
- `set(TL_stars.TL_starGiftUnique gift, long fromId, TLRPC.TL_textWithEntities message, String button, boolean animated)` -> `void`
- `setOnButtonClickListener(Runnable onButtonClick)` -> `void`

## `org.telegram.ui.Stars.StarGiftUniqueActionLayout$Row`
- `getHeight()` -> `float`

## `org.telegram.ui.Stars.StarsController$GiftsCollections`
- `createCollection(String title, Utilities.Callback<TL_stars.TL_starGiftCollection> created)` -> `void`
- `findById(int id)` -> `TL_stars.TL_starGiftCollection`
- `getCollections()` -> `ArrayList<TL_stars.TL_starGiftCollection>`
- `getListById(int collection_id)` -> `GiftsList`
- `getListByIndex(int index)` -> `GiftsList`
- `indexOf(int id)` -> `int`
- `invalidate(boolean load)` -> `void`
- `rename(int id, String newName)` -> `void`
- `reorder(ArrayList<Integer> collectionIds)` -> `void`
- `updateGiftsCollections(TL_stars.SavedStarGift gift, int collection_id, boolean included)` -> `void`
- `updateGiftsUnsaved(TL_stars.SavedStarGift gift, boolean unsaved)` -> `void`
- `updateIcon(int id)` -> `void`

## `org.telegram.ui.Stars.StarsController$GiftsList`
- `contains(final TL_stars.SavedStarGift gift)` -> `boolean`
- `eq(ArrayList<TL_stars.SavedStarGift> a, ArrayList<TL_stars.SavedStarGift> b)` -> `boolean`
- `findGiftToUpgrade(int fromIndex)` -> `int`
- `forCrafting(long gift_id)` -> `void`
- `forceTypeIncludeFlag(int flag, boolean invalidate)` -> `void`
- `get(int index)` -> `Object`
- `getCount()` -> `int`
- `getInput(TL_stars.SavedStarGift gift)` -> `TL_stars.InputSavedStarGift`
- `getLoadedCount()` -> `int`
- `getPinned()` -> `ArrayList<TL_stars.SavedStarGift>`
- `getTotalCount()` -> `int`
- `indexOf(Object object)` -> `int`
- `invalidate(boolean load)` -> `void`
- `notifyUpdate()` -> `void`
- `reorder(int fromPosition, int toPosition)` -> `void`
- `reorderDone()` -> `void`
- `reorderPinned(int fromPosition, int toPosition)` -> `void`
- `resetFilters()` -> `void`
- `set(int index, Object obj)` -> `void`
- `setCollectionId(int collection_id)` -> `void`
- `setFilters(int flags)` -> `void`
- `setPinned(ArrayList<TL_stars.SavedStarGift> newPinned)` -> `void`
- `togglePinned(TL_stars.SavedStarGift gift, boolean pin, boolean fixLimit)` -> `boolean`
- `toggleTypeIncludeFlag(int flag)` -> `void`
- `updateGiftsCollections(TL_stars.SavedStarGift gift, int collection_id, boolean included)` -> `void`
- `updateGiftsUnsaved(TL_stars.SavedStarGift gift, boolean unsaved)` -> `void`

## `org.telegram.ui.Stars.StarsIntroActivity$GiftStarsSheet`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `dismissInternal()` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getTitle()` -> `CharSequence`
- `onItemClick(UItem item, UniversalAdapter adapter)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.StickersActivity`
- `clearSelected()` -> `void`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getSelectedCount()` -> `int`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isSupportEdgeToEdge()` -> `boolean`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onResume()` -> `void`

## `org.telegram.ui.Stories.LiveStoryPipOverlay`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static dismiss()` -> `void`
- `static dismiss(boolean destroyPlayer)` -> `void`
- `static getLivePlayer()` -> `LivePlayer`
- `pipCreatePictureInPictureView()` -> `View`
- `pipCreatePictureInPictureViewBitmap()` -> `Bitmap`
- `pipCreatePrimaryWindowViewBitmap()` -> `Bitmap`
- `pipHidePrimaryWindowView(Runnable firstFrameCallback)` -> `void`
- `pipShowPrimaryWindowView(Runnable firstFrameCallback)` -> `void`
- `static show(Activity activity, LivePlayer livePlayer)` -> `void`
- `static takeLivePlayer()` -> `LivePlayer`

## `org.telegram.ui.Stories.PeerStoriesView$VideoPlayerSharedScope`
- `invalidate()` -> `void`

## `org.telegram.ui.Stories.StoryViewer$VideoPlayerHolder`
- `needRepeat()` -> `boolean`
- `onRenderedFirstFrame()` -> `void`
- `onStateChanged(boolean playWhenReady, int playbackState)` -> `void`

## `org.telegram.ui.Stories.recorder.DualCameraView`
- `allowToTapFocus()` -> `void`
- `applyCameraRotation()` -> `boolean`
- `clearTapFocus()` -> `void`
- `destroy(boolean async, Runnable beforeDestroyRunnable)` -> `void`
- `dualAvailable()` -> `boolean`
- `static dualAvailableDefault(Context context, boolean withWhitelist)` -> `boolean`
- `static dualAvailableStatic(Context context)` -> `boolean`
- `isAtDual(float x, float y)` -> `boolean`
- `isDualTouch()` -> `boolean`
- `isPointInsideDual(Matrix matrix, float x, float y)` -> `boolean`
- `isSavedDual()` -> `boolean`
- `onCameraError()` -> `void`
- `onDualCameraSuccess()` -> `void`
- `onEntityDraggedBottom(boolean value)` -> `void`
- `onEntityDraggedTop(boolean value)` -> `void`
- `onError(int error, Camera camera, CameraSessionWrapper session)` -> `void`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onSavedDualCameraSuccess()` -> `void`
- `onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `resetSaved()` -> `void`
- `static roundDualAvailableDefault(Context context)` -> `boolean`
- `static roundDualAvailableStatic(Context context)` -> `boolean`
- `toggleDual()` -> `void`

## `org.telegram.ui.Stories.recorder.EmojiBottomSheet$GifPage`
- `bind(int type)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `top()` -> `float`
- `updateTops()` -> `void`

## `org.telegram.ui.Stories.recorder.EmojiBottomSheet$GifPage$GifAdapter`
- `getItem(int position)` -> `Object`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `updateItems(String query)` -> `void`

## `org.telegram.ui.Stories.recorder.EmojiBottomSheet$GifPage$GifLayoutManager`
- `getFlowItemCount()` -> `int`
- `getSizeForItem(int i)` -> `Size`
- `getSizeForItem(TLRPC.Document document, List<TLRPC.DocumentAttribute> attributes)` -> `Size`

## `org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader`
- `destroy()` -> `void`

## `org.telegram.ui.Stories.recorder.GalleryListView`
- `allowSearch(boolean allow)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `firstLayout()` -> `void`
- `getPadding()` -> `int`
- `getSelectedAlbum()` -> `MediaController.AlbumEntry`
- `getTitle()` -> `String`
- `isMultiple()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onBackPressed()` -> `boolean`
- `onDetachedFromWindow()` -> `void`
- `onFullScreen(boolean isFullscreen)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onScroll()` -> `void`
- `openSearch()` -> `void`
- `setMaxCount(int maxCount)` -> `void`
- `setMultipleOnClick(boolean multiple)` -> `void`
- `setOnBackClickListener(Runnable onBackClickListener)` -> `void`
- `setOnSelectListener(Utilities.Callback2<Object, Bitmap> listener)` -> `void`
- `setOnSelectMultipleListener(Utilities.Callback3<Boolean, ArrayList<MediaController.PhotoEntry>, ArrayList<Bitmap>> listener)` -> `void`
- `top()` -> `int`
- `updateDrafts()` -> `void`
- `updateSelectButtonVisible()` -> `void`

## `org.telegram.ui.Stories.recorder.GalleryListView$Adapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `getLetter(int position)` -> `String`
- `getPositionForScrollProgress(RecyclerListView listView, float progress, int[] position)` -> `void`
- `getScrollProgress(RecyclerListView listView)` -> `float`
- `getTotalItemsCount()` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`
- `onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder holder)` -> `void`

## `org.telegram.ui.Stories.recorder.GalleryListView$Cell`
- `static cleanupQueues()` -> `void`
- `draw(Canvas canvas)` -> `void`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `performAccessibilityAction(int action, Bundle arguments)` -> `boolean`
- `set(StoryEntry storyEntry, int draftsCount)` -> `void`
- `set(MediaController.PhotoEntry photoEntry)` -> `void`
- `setCheckbox(boolean visible, int checked, boolean animated)` -> `void`
- `setRounding(boolean topLeft, boolean topRight)` -> `void`

## `org.telegram.ui.Stories.recorder.GalleryListView$EmptyView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setHeight(int height)` -> `void`

## `org.telegram.ui.Stories.recorder.GalleryListView$SearchAdapter`
- `getItemCount()` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Stories.recorder.GallerySheet`
- `dismiss()` -> `void`
- `dispatchTouchEvent(@NonNull MotionEvent ev)` -> `boolean`
- `setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> listener)` -> `void`
- `show()` -> `void`

## `org.telegram.ui.Stories.recorder.SelectAudioAlert`
- `blur3_InvalidateBlur()` -> `void`
- `createAdapter(RecyclerListView listView)` -> `RecyclerListView.SelectionAdapter`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `fillItems(ArrayList<UItem> items, UniversalAdapter adapter)` -> `void`
- `getObserverTag()` -> `int`
- `getTitle()` -> `CharSequence`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onFactorChanged(int id, float factor, float fraction, FactorAnimator callee)` -> `void`
- `onFailedDownload(String fileName, boolean canceled)` -> `void`
- `onProgressDownload(String fileName, long downloadSize, long totalSize)` -> `void`
- `onProgressUpload(String fileName, long downloadSize, long totalSize, boolean isEncrypted)` -> `void`
- `onSuccessDownload(String fileName)` -> `void`
- `preDrawInternal(Canvas canvas, View parent)` -> `void`
- `withoutSavedMusic()` -> `SelectAudioAlert`

## `org.telegram.ui.Stories.recorder.TestCameraFragment`
- `createView(Context context)` -> `View`

## `org.telegram.ui.Stories.recorder.TimelineView$AudioWaveformLoader`
- `destroy()` -> `void`
- `getBar(int index)` -> `short`
- `getCount()` -> `int`
- `getLoadedCount()` -> `int`
- `getMaxBar()` -> `short`

## `org.telegram.ui.VoiceMessageEnterTransition`
- `onDraw(Canvas canvas)` -> `void`
- `start()` -> `void`

## `org.telegram.ui.iv.RichAudioCell`
- `bind(BlockRow row, Delegate delegate)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> out)` -> `void`
- `getCaptionEditText()` -> `RichEditText`
- `getRow()` -> `BlockRow`
- `isPressOnCaption(int localX, int localY)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onBlockInsetChanged(int px)` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `persistCaption()` -> `void`
- `updateButtonState(boolean animated)` -> `void`
- `updateColors()` -> `void`
- `updatePlayingMessageProgress()` -> `void`

## `org.telegram.ui.iv.RichAudioCell$Delegate`
- `onCaptionChanged(BlockRow row)` -> `default void`
- `onCaptionEnter(BlockRow row)` -> `default void`
- `onCaptionLockedInsert(CharSequence text)` -> `default void`
- `onCaptionSelectAll(BlockRow row)` -> `default boolean`
- `onCaptionSpansChanged(BlockRow row)` -> `default void`
- `onCaptionWillChange(BlockRow row, int removed, int added)` -> `default void`
- `onRequestWindowFocusable(RichEditText et, boolean showKeyboard)` -> `default void`

## `org.telegram.ui.iv.RichAudioCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `RichAudioCell`
- `isClickable()` -> `boolean`
- `static of(BlockRow row, Delegate delegate)` -> `UItem`
