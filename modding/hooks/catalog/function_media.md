# function / media (1673 методов)

## `org.telegram.messenger.AudioRecorderV2Controller`
- `cancel()` -> `void`
- `detachPreviewOutput()` -> `boolean`
- `finishWhenReady()` -> `void`
- `isPreviewing()` -> `boolean`
- `release()` -> `void`
- `setTrimRange(long startMs, long endMs)` -> `boolean`
- `start()` -> `boolean`
- `togglePause()` -> `boolean`

## `org.telegram.messenger.GiftAuctionController`
- `static filterAttributes(ArrayList<TL_stars.StarGiftAttribute> attrs, boolean crafting)` -> `ArrayList<TL_stars.StarGiftAttribute>`
- `getActiveAuctions()` -> `ArrayList<Auction>`
- `getAuction(long giftId)` -> `Auction`
- `static getInstance(int num)` -> `GiftAuctionController`
- `getOrRequestAcquiredGifts(long giftId, Utilities.Callback<List<TL_stars.TL_StarGiftAuctionAcquiredGift>> callback)` -> `void`
- `getOrRequestAuction(long giftId, Utilities.Callback2<Auction, TLRPC.TL_error> callback)` -> `void`
- `hasActiveAuctions()` -> `boolean`
- `static hasAllAttributes(ArrayList<TL_stars.StarGiftAttribute> attrs)` -> `boolean`
- `processUpdate(TL_update.TL_updateStarGiftAuctionState update)` -> `void`
- `processUpdate(TL_update.TL_updateStarGiftAuctionUserState update)` -> `void`
- `requestAuctionUpgrades(long giftId, Utilities.Callback<ArrayList<TL_stars.StarGiftAttribute>> callback)` -> `void`
- `requestGiftAuctionById(long giftId, Utilities.Callback2<TL_payments.TL_StarGiftAuctionState, TLRPC.TL_error> callback)` -> `int`
- `requestGiftAuctionBySlug(String slug, Utilities.Callback2<TL_payments.TL_StarGiftAuctionState, TLRPC.TL_error> callback)` -> `int`
- `requestUserAuctions()` -> `void`
- `sendBid(long giftId, AuctionBidSheet.Params params, long amount, Utilities.Callback2<Boolean, String> whenDone)` -> `void`
- `subscribeToActiveAuctionsUpdates(OnActiveAuctionsUpdateListeners listener)` -> `void`
- `subscribeToGiftAuction(long giftId, OnAuctionUpdateListener listener)` -> `Auction`
- `unsubscribeFromActiveAuctionsUpdates(OnActiveAuctionsUpdateListeners listener)` -> `void`
- `unsubscribeFromGiftAuction(long giftId, OnAuctionUpdateListener listener)` -> `void`

## `org.telegram.messenger.GiftAuctionController$Auction`
- `approximateBidAmountFromPlace(int place)` -> `long`
- `approximatePlaceFromStars(long bidAmount)` -> `int`
- `approximatePlaceFromStars(long bidAmount, int bidDate)` -> `int`
- `getApproximatedMyPlace()` -> `int`
- `getBidStatus()` -> `BidStatus`
- `getCurrentMyBid()` -> `long`
- `getCurrentTopBid()` -> `long`
- `getMaximumBid()` -> `long`
- `getMinimumBid()` -> `long`
- `isFinished()` -> `boolean`
- `isUpcoming()` -> `boolean`
- `isUpcoming(int currentTime)` -> `boolean`

## `org.telegram.messenger.GiftAuctionController$Auction$BidStatus`
- `isOutbid()` -> `boolean`

## `org.telegram.messenger.GiftAuctionController$AuctionInternal`
- `getVersion()` -> `int`
- `hasBid()` -> `boolean`

## `org.telegram.messenger.MediaController`
- `cancelVideoConvert(MessageObject messageObject)` -> `void`
- `static checkGallery()` -> `void`
- `checkIsNextMediaFileDownloaded()` -> `void`
- `checkVolumeBarUI()` -> `void`
- `cleanRecording(boolean delete)` -> `void`
- `cleanup()` -> `void`
- `cleanupPlayer(boolean notify, boolean stopService)` -> `void`
- `cleanupPlayer(boolean notify, boolean stopService, boolean byVoiceEnd, boolean transferPlayerToPhotoViewer)` -> `void`
- `static copyFileToCache(Uri uri, String ext)` -> `String`
- `static copyFileToCache(Uri uri, String ext, long sizeLimit)` -> `String`
- `static createFileInCache(String name, String ext)` -> `File`
- `currentPlaylistIsGlobalSearch()` -> `boolean`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static extractRealEncoderBitrate(int width, int height, int bitrate, boolean tryHevc)` -> `int`
- `findMessageInPlaylistAndPlay(MessageObject messageObject)` -> `boolean`
- `static findTrack(MediaExtractor extractor, boolean audio)` -> `int`
- `generateWaveform(MessageObject messageObject)` -> `void`
- `getAudioInfo()` -> `AudioInfo`
- `getCurrentChromecastMedia()` -> `ChromecastMediaVariations`
- `getCurrentForegroundConverMessage()` -> `VideoConvertMessage`
- `getCurrentPosition()` -> `long`
- `getDuration()` -> `long`
- `getFastPlaybackSpeed(boolean music)` -> `float`
- `static getFileName(Uri uri)` -> `String`
- `static getInstance()` -> `MediaController`
- `getMusicList()` -> `MessagesController.SavedMusicList`
- `getPlaybackSpeed(boolean music)` -> `float`
- `getPlayingMessageObject()` -> `MessageObject`
- `getPlayingMessageObjectNum()` -> `int`
- `getPlaylist()` -> `ArrayList<MessageObject>`
- `getProgressMs(MessageObject messageObject)` -> `long`
- `static getStickerExt(Uri uri)` -> `String`
- `static getVideoBitrate(String path)` -> `int`
- `getVideoPlayer()` -> `VideoPlayer`
- `hasNoNextVoiceOrRoundVideoMessage()` -> `boolean`
- `injectVideoPlayer(VideoPlayer player, MessageObject messageObject)` -> `void`
- `isBuffering()` -> `boolean`
- `isCurrentPlayer(VideoPlayer player)` -> `boolean`
- `isDownloadingCurrentMessage()` -> `boolean`
- `static isGif(Uri uri)` -> `boolean`
- `isGoingToShowMessageObject(MessageObject messageObject)` -> `boolean`
- `static isH264Video(String videoPath)` -> `boolean`
- `isMessagePaused()` -> `boolean`
- `isPiPShown()` -> `boolean`
- `isPlayingMessage(MessageObject messageObject)` -> `boolean`
- `isPlayingMessageAndReadyToDraw(MessageObject messageObject)` -> `boolean`
- `isRecordingAudio()` -> `boolean`
- `isRecordingOrListeningByProximity()` -> `boolean`
- `isRecordingPaused()` -> `boolean`
- `isStreamingCurrentAudio()` -> `boolean`
- `isVideoDrawingReady()` -> `boolean`
- `static isWebp(Uri uri)` -> `boolean`
- `static loadGalleryPhotosAlbums(final int guid)` -> `void`
- `loadMoreMusic()` -> `void`
- `static makeVideoBitrate(int originalHeight, int originalWidth, int originalBitrate, int height, int width)` -> `int`
- `onAccuracyChanged(Sensor sensor, int accuracy)` -> `void`
- `onAudioFocusChange(int focusChange)` -> `void`
- `onSensorChanged(SensorEvent event)` -> `void`
- `pauseByRewind()` -> `void`
- `pauseMessage(MessageObject messageObject)` -> `boolean`
- `pauseMessage(MessageObject messageObject, boolean smoothFade)` -> `boolean`
- `playEmojiSound(AccountInstance accountInstance, String emoji, MessagesController.EmojiSound sound, boolean loadOnly)` -> `void`
- `playMessage(final MessageObject messageObject)` -> `boolean`
- `playMessage(final MessageObject messageObject, boolean silent)` -> `boolean`
- `playMessageAtIndex(int index)` -> `void`
- `playNextMessage()` -> `void`
- `playPreviousMessage()` -> `void`
- `prepareResumedRecording(int currentAccount, MediaDataController.DraftVoice draft, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem replyStory, int guid, SendMessageChatArguments sendMessageChatArguments, long monoForumPeerId, MessageSuggestionParams suggestionParams)` -> `void`
- `requestRecordAudioFocus(boolean request)` -> `void`
- `resetGoingToShowMessageObject()` -> `void`
- `resumeByRewind()` -> `void`
- `static saveFile(String fullPath, Context context, final int type, final String name, final String mime)` -> `void`
- `static saveFile(String fullPath, Context context, final int type, final String name, final String mime, final Utilities.Callback<Uri> onSaved)` -> `void`
- `static saveFile(String fullPath, Context context, final int type, final String name, final String mime, final Utilities.Callback<Uri> onSaved, boolean showProgress)` -> `void`
- `static saveFile(String fullPath, String liveVideoPath, Context context, final Utilities.Callback<Uri> onSaved)` -> `void`
- `static saveFilesFromMessages(Context context, AccountInstance accountInstance, ArrayList<MessageObject> messageObjects, final MessagesStorage.IntCallback onSaved)` -> `void`
- `scheduleVideoConvert(MessageObject messageObject)` -> `void`
- `scheduleVideoConvert(MessageObject messageObject, VideoEditedInfo videoEditedInfo)` -> `void`
- `scheduleVideoConvert(MessageObject messageObject, boolean isEmpty, boolean withForeground, boolean forConversion)` -> `boolean`
- `scheduleVideoConvert(MessageObject messageObject, VideoEditedInfo videoEditedInfo, boolean isEmpty, boolean withForeground, boolean forConversion)` -> `boolean`
- `seekToProgress(MessageObject messageObject, float progress)` -> `boolean`
- `seekToProgressMs(MessageObject messageObject, long progressMs)` -> `boolean`
- `static selectCodec(String mimeType)` -> `MediaCodecInfo`
- `static selectColorFormat(MediaCodecInfo codecInfo, String mimeType)` -> `int`
- `setAllowStartRecord(boolean value)` -> `void`
- `setBaseActivity(Activity activity, boolean set)` -> `void`
- `setCurrentVideoVisible(boolean visible)` -> `void`
- `setFeedbackView(View view, boolean set)` -> `void`
- `setInputFieldHasText(boolean value)` -> `void`
- `setLastVisibleMessageIds(int account, long enterTime, long leaveTime, TLRPC.User user, TLRPC.EncryptedChat encryptedChat, ArrayList<Long> visibleMessages, int visibleMessage)` -> `void`
- `setPlaybackOrderType(int type)` -> `void`
- `setPlaybackSpeed(boolean music, float speed)` -> `void`
- `setPlaylist(ArrayList<MessageObject> messageObjects, MessageObject current, long mergeDialogId, PlaylistGlobalSearchParams globalSearchParams)` -> `boolean`
- `setPlaylist(ArrayList<MessageObject> messageObjects, MessageObject current, long mergeDialogId)` -> `boolean`
- `setPlaylist(ArrayList<MessageObject> messageObjects, MessageObject current, long mergeDialogId, boolean loadMusic, PlaylistGlobalSearchParams params)` -> `boolean`
- `setReplyingMessage(MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem)` -> `void`
- `setVoiceMessagesPlaylist(ArrayList<MessageObject> playlist, boolean unread)` -> `void`
- `startMediaObserver()` -> `void`
- `startRaiseToEarSensors(ChatActivity chatActivity)` -> `void`
- `startRecording(int currentAccount, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem replyStory, int guid, boolean manual, SendMessageChatArguments sendMessageChatArguments, long monoForumPeerId, MessageSuggestionParams suggestionParams)` -> `void`
- `startRecordingIfFromSpeaker()` -> `void`
- `stopMediaObserver()` -> `void`
- `stopRaiseToEarSensors(ChatActivity chatActivity, boolean fromChat, boolean stopRecording)` -> `void`
- `stopRecording(final int send, boolean notify, int scheduleDate, boolean once, long payStars)` -> `void`
- `syncCastedPlayer()` -> `void`
- `toggleRecordingPause(boolean voiceOnce)` -> `void`
- `trimCurrentRecording(long startMs, long endMs, Runnable done)` -> `void`
- `tryResumePausedAudio()` -> `void`
- `updateSilent(boolean value)` -> `void`

## `org.telegram.messenger.MediaController$AlbumEntry`
- `addPhoto(PhotoEntry photoEntry)` -> `void`

## `org.telegram.messenger.MediaController$CropState`
- `clone()` -> `CropState`
- `isEmpty()` -> `boolean`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.messenger.MediaController$ExternalObserver`
- `onChange(boolean selfChange)` -> `void`

## `org.telegram.messenger.MediaController$GalleryObserverExternal`
- `onChange(boolean selfChange)` -> `void`

## `org.telegram.messenger.MediaController$GalleryObserverInternal`
- `onChange(boolean selfChange)` -> `void`

## `org.telegram.messenger.MediaController$InternalObserver`
- `onChange(boolean selfChange)` -> `void`

## `org.telegram.messenger.MediaController$MediaEditState`
- `copyFrom(MediaEditState state)` -> `void`
- `getPath()` -> `String`
- `hasVideoEditsLostAsDocument()` -> `boolean`
- `isHighQuality()` -> `boolean`
- `isLivePhoto()` -> `boolean`
- `reset()` -> `void`

## `org.telegram.messenger.MediaController$MediaLoader`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `start()` -> `void`

## `org.telegram.messenger.MediaController$MusicListenReporter`
- `destroy()` -> `void`
- `getPlayerListener(ExoPlayer player)` -> `Player.Listener`
- `setup(TLRPC.InputDocument document)` -> `void`

## `org.telegram.messenger.MediaController$PhotoEntry`
- `clone()` -> `PhotoEntry`
- `copyFrom(MediaEditState state)` -> `void`
- `deleteAll()` -> `void`
- `getPath()` -> `String`
- `isLivePhoto()` -> `boolean`
- `isUnalivePhoto()` -> `boolean`
- `rebuildPhoto(boolean highQuality)` -> `void`
- `reset()` -> `void`
- `setOrientation(Pair<Integer, Integer> rotationAndInvert)` -> `PhotoEntry`
- `setOrientation(int rotation, int invert)` -> `PhotoEntry`

## `org.telegram.messenger.MediaController$SavedFilterState`
- `isEmpty()` -> `boolean`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.messenger.MediaController$SearchImage`
- `clone()` -> `SearchImage`
- `getAttachName()` -> `String`
- `getPath()` -> `String`
- `getPathToAttach()` -> `String`
- `reset()` -> `void`

## `org.telegram.messenger.MediaController$StopMediaObserverRunnable`
- `run()` -> `void`

## `org.telegram.messenger.MediaController$VideoConvertRunnable`
- `run()` -> `void`
- `static runConversion(final VideoConvertMessage obj)` -> `void`

## `org.telegram.messenger.MediaDataController$DraftVoice`
- `static fromString(String string)` -> `DraftVoice`
- `static of(MediaController mediaController, String path, boolean once, float left, float right)` -> `DraftVoice`
- `toString()` -> `String`

## `org.telegram.messenger.MediaDataController$SearchStickersKey`
- `equals(Object o)` -> `boolean`
- `hashCode()` -> `int`

## `org.telegram.messenger.MediaDataController$SearchStickersResult`
- `apply(TLRPC.TL_messages_foundStickers r)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichAudioBlock`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getHeight()` -> `int`
- `getLastLineWidth()` -> `int`
- `isHorizontallyDragging()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `updateButtonState(boolean animated)` -> `void`
- `updatePlayingMessageProgress()` -> `void`

## `org.telegram.messenger.SaveToGallerySettingsHelper`
- `static getSettings(int type)` -> `Settings`
- `static load(SharedPreferences preferences)` -> `void`
- `static loadExceptions(SharedPreferences sharedPreferences)` -> `LongSparseArray<DialogException>`
- `static needSave(int flag, FilePathDatabase.FileMeta metaData, MessageObject messageObject, int currentAccount)` -> `boolean`
- `static saveExceptions(SharedPreferences sharedPreferences, LongSparseArray<DialogException> exceptions)` -> `void`
- `static saveSettings(int type)` -> `void`

## `org.telegram.messenger.SaveToGallerySettingsHelper$DialogException`
- `createDescription(int currentAccount)` -> `CharSequence`

## `org.telegram.messenger.SaveToGallerySettingsHelper$Settings`
- `enabled()` -> `boolean`
- `toggle()` -> `void`

## `org.telegram.messenger.SaveToGallerySettingsHelper$SharedSettings`
- `createDescription(int currentAccount)` -> `CharSequence`
- `toggle()` -> `void`

## `org.telegram.messenger.SendMessagesHelper$ImportingSticker`
- `uploadMedia(int account, TLRPC.InputFile inputFile, Runnable onFinish)` -> `void`

## `org.telegram.messenger.SendMessagesHelper$ImportingStickers`
- `getTotalCount()` -> `long`
- `getUploadedCount()` -> `long`
- `setImportProgress(int value)` -> `void`

## `org.telegram.messenger.audioinfo.AudioInfo`
- `getAlbum()` -> `String`
- `getAlbumArtist()` -> `String`
- `getArtist()` -> `String`
- `static getAudioInfo(File file)` -> `AudioInfo`
- `getBrand()` -> `String`
- `getComment()` -> `String`
- `getComposer()` -> `String`
- `getCopyright()` -> `String`
- `getCover()` -> `Bitmap`
- `getCoverFile()` -> `File`
- `getDisc()` -> `short`
- `getDiscs()` -> `short`
- `getDuration()` -> `long`
- `getGenre()` -> `String`
- `getGrouping()` -> `String`
- `getLyrics()` -> `String`
- `getSmallCover()` -> `Bitmap`
- `getTitle()` -> `String`
- `getTrack()` -> `short`
- `getTracks()` -> `short`
- `getVersion()` -> `String`
- `getYear()` -> `short`
- `isCompilation()` -> `boolean`
- `setCoverFile(File file)` -> `void`

## `org.telegram.messenger.audioinfo.m4a.M4AInfo`
- `data(MP4Atom atom)` -> `void`
- `ftyp(MP4Atom atom)` -> `void`
- `getRating()` -> `byte`
- `getSpeed()` -> `BigDecimal`
- `getTempo()` -> `short`
- `getVolume()` -> `BigDecimal`
- `ilst(MP4Atom atom)` -> `void`
- `mdhd(MP4Atom atom)` -> `void`
- `mdia(MP4Atom atom)` -> `void`
- `meta(MP4Atom atom)` -> `void`
- `moov(MP4Atom atom)` -> `void`
- `mvhd(MP4Atom atom)` -> `void`
- `trak(MP4Atom atom)` -> `void`
- `udta(MP4Atom atom)` -> `void`

## `org.telegram.messenger.audioinfo.m4a.MP4Atom`
- `getLength()` -> `long`
- `getOffset()` -> `long`
- `getPath()` -> `String`
- `getRemaining()` -> `long`
- `hasMoreChildren()` -> `boolean`
- `nextChildUpTo(String expectedTypeExpression)` -> `MP4Atom`
- `readBoolean()` -> `boolean`
- `readByte()` -> `byte`
- `readBytes(int len)` -> `byte[]`
- `readBytes()` -> `byte[]`
- `readInt()` -> `int`
- `readIntegerFixedPoint()` -> `BigDecimal`
- `readLong()` -> `long`
- `readShort()` -> `short`
- `readShortFixedPoint()` -> `BigDecimal`
- `readString(int len, String enc)` -> `String`
- `readString(String enc)` -> `String`
- `skip(int len)` -> `void`
- `skip()` -> `void`
- `toString()` -> `String`

## `org.telegram.messenger.audioinfo.m4a.MP4Box`
- `getChild()` -> `MP4Atom`
- `getInput()` -> `I`
- `getParent()` -> `MP4Box<?>`
- `getPosition()` -> `long`
- `getType()` -> `String`
- `nextChild()` -> `MP4Atom`
- `nextChild(String expectedTypeExpression)` -> `MP4Atom`

## `org.telegram.messenger.audioinfo.m4a.MP4Input`
- `nextChildUpTo(String expectedTypeExpression)` -> `MP4Atom`
- `toString()` -> `String`

## `org.telegram.messenger.audioinfo.mp3.ID3v1Genre`
- `getDescription()` -> `String`
- `static getGenre(int id)` -> `ID3v1Genre`
- `getId()` -> `int`

## `org.telegram.messenger.audioinfo.mp3.ID3v1Info`
- `extractString(byte[] bytes, int offset, int length)` -> `String`
- `static isID3v1StartPosition(InputStream input)` -> `boolean`
- `readBytes(InputStream input, int len)` -> `byte[]`

## `org.telegram.messenger.audioinfo.mp3.ID3v2DataInput`
- `readByte()` -> `byte`
- `readFully(byte b[], int off, int len)` -> `void`
- `readFully(int len)` -> `byte[]`
- `readInt()` -> `int`
- `readSyncsafeInt()` -> `int`
- `skipFully(long len)` -> `void`

## `org.telegram.messenger.audioinfo.mp3.ID3v2Encoding`
- `getCharset()` -> `Charset`
- `getZeroBytes()` -> `int`

## `org.telegram.messenger.audioinfo.mp3.ID3v2FrameBody`
- `getData()` -> `ID3v2DataInput`
- `getFrameHeader()` -> `ID3v2FrameHeader`
- `getPosition()` -> `long`
- `getRemainingLength()` -> `long`
- `getTagHeader()` -> `ID3v2TagHeader`
- `readEncoding()` -> `ID3v2Encoding`
- `readFixedLengthString(int length, ID3v2Encoding encoding)` -> `String`
- `readZeroTerminatedString(int maxLength, ID3v2Encoding encoding)` -> `String`
- `toString()` -> `String`

## `org.telegram.messenger.audioinfo.mp3.ID3v2FrameBody$Buffer`
- `bytes(int minLength)` -> `byte[]`

## `org.telegram.messenger.audioinfo.mp3.ID3v2FrameHeader`
- `getBodySize()` -> `int`
- `getDataLengthIndicator()` -> `int`
- `getFrameId()` -> `String`
- `getHeaderSize()` -> `int`
- `isCompression()` -> `boolean`
- `isEncryption()` -> `boolean`
- `isPadding()` -> `boolean`
- `isUnsynchronization()` -> `boolean`
- `isValid()` -> `boolean`
- `toString()` -> `String`

## `org.telegram.messenger.audioinfo.mp3.ID3v2Info`
- `static isID3v2StartPosition(InputStream input)` -> `boolean`
- `parseAttachedPictureFrame(ID3v2FrameBody data)` -> `AttachedPicture`
- `parseCommentOrUnsynchronizedLyricsFrame(ID3v2FrameBody data)` -> `CommentOrUnsynchronizedLyrics`
- `parseFrame(ID3v2FrameBody frame)` -> `void`
- `parseTextFrame(ID3v2FrameBody frame)` -> `String`

## `org.telegram.messenger.audioinfo.mp3.ID3v2TagBody`
- `frameBody(ID3v2FrameHeader frameHeader)` -> `ID3v2FrameBody`
- `getData()` -> `ID3v2DataInput`
- `getPosition()` -> `long`
- `getRemainingLength()` -> `long`
- `getTagHeader()` -> `ID3v2TagHeader`
- `toString()` -> `String`

## `org.telegram.messenger.audioinfo.mp3.ID3v2TagHeader`
- `getFooterSize()` -> `int`
- `getHeaderSize()` -> `int`
- `getPaddingSize()` -> `int`
- `getRevision()` -> `int`
- `getTotalTagSize()` -> `int`
- `getVersion()` -> `int`
- `isCompression()` -> `boolean`
- `isUnsynchronization()` -> `boolean`
- `tagBody(InputStream input)` -> `ID3v2TagBody`
- `toString()` -> `String`

## `org.telegram.messenger.audioinfo.mp3.MP3Frame`
- `getHeader()` -> `Header`
- `getNumberOfFrames()` -> `int`
- `getSize()` -> `int`
- `isChecksumError()` -> `boolean`
- `isVBRIFrame()` -> `boolean`
- `isXingFrame()` -> `boolean`

## `org.telegram.messenger.audioinfo.mp3.MP3Frame$CRC16`
- `getValue()` -> `short`
- `reset()` -> `void`
- `update(int value, int length)` -> `void`
- `update(byte value)` -> `void`

## `org.telegram.messenger.audioinfo.mp3.MP3Frame$Header`
- `getBitrate()` -> `int`
- `getChannelMode()` -> `int`
- `getDuration()` -> `int`
- `getFrameSize()` -> `int`
- `getFrequency()` -> `int`
- `getLayer()` -> `int`
- `getProtection()` -> `int`
- `getSampleCount()` -> `int`
- `getSideInfoSize()` -> `int`
- `getTotalDuration(long totalSize)` -> `long`
- `getVBRIOffset()` -> `int`
- `getVersion()` -> `int`
- `getXingOffset()` -> `int`
- `isCompatible(Header header)` -> `boolean`

## `org.telegram.messenger.audioinfo.mp3.MP3Info`
- `calculateDuration(MP3Input data, long totalLength, StopReadCondition stopCondition)` -> `long`
- `readFirstFrame(MP3Input data, StopReadCondition stopCondition)` -> `MP3Frame`
- `readNextFrame(MP3Input data, StopReadCondition stopCondition, MP3Frame previousFrame)` -> `MP3Frame`

## `org.telegram.messenger.audioinfo.mp3.MP3Input`
- `readFully(byte b[], int off, int len)` -> `void`
- `skipFully(long len)` -> `void`
- `toString()` -> `String`

## `org.telegram.messenger.audioinfo.util.PositionInputStream`
- `getPosition()` -> `long`
- `mark(int readlimit)` -> `void`
- `read()` -> `int`
- `read(byte[] b, int off, int len)` -> `int`
- `read(byte[] b)` -> `int`
- `reset()` -> `void`
- `skip(long n)` -> `long`

## `org.telegram.messenger.audioinfo.util.RangeInputStream`
- `getRemainingLength()` -> `long`
- `read()` -> `int`
- `read(byte[] b, int off, int len)` -> `int`
- `skip(long n)` -> `long`

## `org.telegram.messenger.camera.Camera2Session`
- `static chooseOptimalSize(Size[] choices, int width, int height, boolean notBigger)` -> `Size`
- `static create(boolean front, int viewWidth, int viewHeight)` -> `Camera2Session`
- `destroy(boolean async)` -> `void`
- `destroy(boolean async, Runnable afterCallback)` -> `void`
- `getCurrentOrientation()` -> `int`
- `getDisplayOrientation()` -> `int`
- `getFlash()` -> `boolean`
- `getMaxZoom()` -> `float`
- `getMinZoom()` -> `float`
- `getPreviewHeight()` -> `int`
- `getPreviewWidth()` -> `int`
- `getWorldAngle()` -> `int`
- `getZoom()` -> `float`
- `isInitiated()` -> `boolean`
- `open(SurfaceTexture surfaceTexture)` -> `void`
- `setFlash(boolean flash)` -> `void`
- `setNightMode(boolean enable)` -> `void`
- `setRecordingVideo(boolean recording)` -> `void`
- `setScanningBarcode(boolean scanning)` -> `void`
- `setZoom(float value)` -> `void`
- `takePicture(final File file, Utilities.Callback<Integer> whenDone)` -> `boolean`
- `whenDone(Runnable doneCallback)` -> `void`

## `org.telegram.messenger.camera.Camera2Session$CompareSizesByArea`
- `compare(Size lhs, Size rhs)` -> `int`

## `org.telegram.messenger.camera.CameraController`
- `addOnErrorListener(ErrorCallback callback)` -> `void`
- `cancelOnInitRunnable(final Runnable onInitRunnable)` -> `void`
- `static chooseOptimalSize(List<Size> choices, int width, int height, Size aspectRatio, boolean notBigger)` -> `Size`
- `close(final CameraSession session, final CountDownLatch countDownLatch, final Runnable beforeDestroyRunnable)` -> `void`
- `close(final CameraSession session, final CountDownLatch countDownLatch, final Runnable beforeDestroyRunnable, final Runnable afterDestroyRunnable)` -> `void`
- `getCameras()` -> `ArrayList<CameraInfo>`
- `getErrorListener(CameraSession session)` -> `Camera.ErrorCallback`
- `static getInstance()` -> `CameraController`
- `initCamera(final Runnable onInitRunnable)` -> `void`
- `isCameraInitied()` -> `boolean`
- `onInfo(MediaRecorder mediaRecorder, int what, int extra)` -> `void`
- `open(final CameraSession session, final SurfaceTexture texture, final Runnable callback, final Runnable prestartCallback)` -> `void`
- `openRound(final CameraSession session, final SurfaceTexture texture, final Runnable callback, final Runnable configureCallback)` -> `void`
- `recordVideo(final Object session, final File path, boolean mirror, final VideoTakeCallback callback, final Runnable onVideoStartRecord, ICameraView cameraView)` -> `void`
- `recordVideo(final Object sessionObject, final File path, boolean mirror, final VideoTakeCallback callback, final Runnable onVideoStartRecord, ICameraView cameraView, boolean createThumbnail)` -> `void`
- `removeOnErrorListener(ErrorCallback callback)` -> `void`
- `startPreview(final Object sessionObject)` -> `void`
- `stopPreview(final Object sessionObject)` -> `void`
- `stopVideoRecording(final Object sessionObject, final boolean abandon)` -> `void`
- `stopVideoRecording(final Object sessionObject, final boolean abandon, final boolean createThumbnail)` -> `void`
- `takePicture(final File path, final boolean ignoreOrientation, final Object sessionObject, final Utilities.Callback<Integer> callback)` -> `boolean`

## `org.telegram.messenger.camera.CameraController$CompareSizesByArea`
- `compare(Size lhs, Size rhs)` -> `int`

## `org.telegram.messenger.camera.CameraController$ErrorCallback`
- `onError(int errorId, Camera camera, CameraSessionWrapper cameraSession)` -> `default void`

## `org.telegram.messenger.camera.CameraInfo`
- `getCameraId()` -> `int`
- `getPictureSizes()` -> `ArrayList<Size>`
- `getPreviewSizes()` -> `ArrayList<Size>`
- `isFrontface()` -> `boolean`

## `org.telegram.messenger.camera.CameraSession`
- `checkFlashMode(String mode)` -> `void`
- `configurePhotoCamera()` -> `void`
- `configureRecorder(int quality, MediaRecorder recorder)` -> `void`
- `configureRoundCamera(boolean initial)` -> `boolean`
- `destroy()` -> `void`
- `focusToRect(Rect focusRect, Rect meteringRect)` -> `void`
- `getCurrentFlashMode()` -> `String`
- `getCurrentOrientation()` -> `int`
- `getCurrentPictureSize()` -> `Camera.Size`
- `getCurrentPreviewSize()` -> `Camera.Size`
- `getDisplayOrientation()` -> `int`
- `getMaxZoom()` -> `int`
- `getNextFlashMode()` -> `String`
- `getWorldAngle()` -> `int`
- `isFlipFront()` -> `boolean`
- `isInitied()` -> `boolean`
- `isSameTakePictureOrientation()` -> `boolean`
- `onStartRecord()` -> `void`
- `setCurrentFlashMode(String mode)` -> `void`
- `setFlipFront(boolean value)` -> `void`
- `setInitied()` -> `void`
- `setOneShotPreviewCallback(Camera.PreviewCallback callback)` -> `void`
- `setOptimizeForBarcode(boolean value)` -> `void`
- `setPreviewCallback(Camera.PreviewCallback callback)` -> `void`
- `setTorchEnabled(boolean enabled)` -> `void`
- `setZoom(float value)` -> `void`
- `stopVideoRecording()` -> `void`
- `updateRotation()` -> `void`

## `org.telegram.messenger.camera.CameraSessionWrapper`
- `destroy(boolean async, Runnable before, Runnable after)` -> `void`
- `equals(@Nullable Object obj)` -> `boolean`
- `focusToRect(android.graphics.Rect focusRect, android.graphics.Rect meteringRect)` -> `void`
- `getCameraId()` -> `int`
- `getCurrentFlashMode()` -> `String`
- `getCurrentOrientation()` -> `int`
- `getDisplayOrientation()` -> `int`
- `getNextFlashMode()` -> `String`
- `getObject()` -> `Object`
- `getWorldAngle()` -> `int`
- `hasFlashModes()` -> `boolean`
- `isInitiated()` -> `boolean`
- `isSameTakePictureOrientation()` -> `boolean`
- `static of(CameraSession session)` -> `CameraSessionWrapper`
- `static of(Camera2Session session)` -> `CameraSessionWrapper`
- `setCurrentFlashMode(String flashMode)` -> `void`
- `setFlipFront(boolean flip)` -> `void`
- `setOptimizeForBarcode(boolean optimize)` -> `void`
- `setZoom(float zoom)` -> `void`
- `stopVideoRecording()` -> `void`
- `updateRotation()` -> `void`

## `org.telegram.messenger.camera.CameraView`
- `hasFrontFaceCamera()` -> `boolean`
- `onSurfaceTextureUpdated(SurfaceTexture surface)` -> `void`

## `org.telegram.messenger.camera.CameraView$CameraGLThread`
- `finish()` -> `void`
- `finishBlur()` -> `void`
- `handleMessage(Message inputMessage)` -> `void`
- `pause(long duration)` -> `void`
- `reinitForNewCamera()` -> `void`
- `requestRender(boolean updateTexImage1, boolean updateTexImage2)` -> `void`
- `run()` -> `void`
- `setBlurSurfaceTexture(SurfaceTexture blurSurfaceTexture)` -> `void`
- `setCurrentSession(CameraSessionWrapper session, int i)` -> `void`
- `shutdown(int send)` -> `void`
- `startRecording(File path)` -> `boolean`
- `stopRecording()` -> `void`

## `org.telegram.messenger.camera.CameraView$EncoderHandler`
- `exit()` -> `void`
- `handleMessage(Message inputMessage)` -> `void`

## `org.telegram.messenger.camera.CameraView$VideoRecorder`
- `drainEncoder(boolean endOfStream)` -> `void`
- `finalize()` -> `void`
- `frameAvailable(SurfaceTexture st, Integer cameraId, long timestampInternal)` -> `void`
- `getInputSurface()` -> `Surface`
- `run()` -> `void`
- `startRecording(File outputFile, android.opengl.EGLContext sharedContext)` -> `void`
- `stopRecording(int send)` -> `void`

## `org.telegram.messenger.camera.Size`
- `equals(final Object obj)` -> `boolean`
- `getHeight()` -> `int`
- `getWidth()` -> `int`
- `hashCode()` -> `int`
- `static parseSize(String string)` -> `Size`
- `toString()` -> `String`

## `org.telegram.messenger.pip.PipActivityController`
- `addActionListener(String sourceId, IPipActivityActionListener listener)` -> `void`
- `addAnimationListener(IPipActivityAnimationListener listener)` -> `void`
- `addPipListener(IPipActivityListener listener)` -> `void`
- `dispatchSourceAvailabilityChanged(PipSource source)` -> `void`
- `dispatchSourceParamsChanged(PipSource source)` -> `void`
- `dispatchSourceRegister(PipSource source)` -> `void`
- `dispatchSourceUnregister(PipSource source)` -> `void`
- `getHandler()` -> `IPipActivityHandler`
- `getPipContentView()` -> `ViewGroup`
- `hasContentForPictureInPictureMode()` -> `boolean`
- `removeActionListener(String sourceId, IPipActivityActionListener listener)` -> `void`
- `removeAnimationListener(IPipActivityAnimationListener listener)` -> `void`
- `removePipListener(IPipActivityListener listener)` -> `void`

## `org.telegram.messenger.pip.PipActivityHandler`
- `addActionListener(String sourceId, IPipActivityActionListener listener)` -> `void`
- `addAnimationListener(IPipActivityAnimationListener listener)` -> `void`
- `addPipListener(IPipActivityListener listener)` -> `void`
- `onConfigurationChanged(Configuration ignoredNewConfig)` -> `void`
- `onDestroy()` -> `void`
- `onPause()` -> `void`
- `onPictureInPictureModeChanged(boolean isInPictureInPictureMode, @NonNull Configuration ignoredNewConfig)` -> `void`
- `onPictureInPictureRequested()` -> `void`
- `onPictureInPictureUiStateChanged(@NonNull PictureInPictureUiState pipState)` -> `void`
- `onResume()` -> `void`
- `onStart()` -> `void`
- `onStop()` -> `void`
- `onUserLeaveHint()` -> `void`
- `removeActionListener(String sourceId, IPipActivityActionListener listener)` -> `void`
- `removeAnimationListener(IPipActivityAnimationListener listener)` -> `void`
- `removePipListener(IPipActivityListener listener)` -> `void`
- `setPictureInPictureParams(PictureInPictureParams params)` -> `void`

## `org.telegram.messenger.pip.PipSource`
- `buildPictureInPictureParams()` -> `PictureInPictureParams`
- `destroy()` -> `void`
- `getPlayer()` -> `Player`
- `isAvailable()` -> `boolean`
- `setContentRatio(int width, int height)` -> `void`
- `setContentView(View contentView)` -> `void`
- `setPlaceholderView(View placeholderView)` -> `void`
- `setPlayer(Player player)` -> `void`

## `org.telegram.messenger.pip.PipSource$Builder`
- `build()` -> `PipSource`
- `setActionListener(IPipActivityActionListener actionListener)` -> `Builder`
- `setContentLocationView(View contentLocationView)` -> `Builder`
- `setContentRatio(int width, int height)` -> `Builder`
- `setContentView(View contentView)` -> `Builder`
- `setCornerRadius(int cornerRadius)` -> `Builder`
- `setNeedMediaSession(boolean needMediaSession)` -> `Builder`
- `setPlaceholderView(View placeholderView)` -> `Builder`
- `setPlayer(Player player)` -> `Builder`
- `setPriority(int priority)` -> `Builder`
- `setTagPrefix(String tagPrefix)` -> `Builder`

## `org.telegram.messenger.pip.activity.IPipActivityAnimationListener`
- `onEnterAnimationEnd(long duration)` -> `default void`
- `onEnterAnimationStart(long estimatedDuration)` -> `default void`
- `onLeaveAnimationEnd(long duration)` -> `default void`
- `onLeaveAnimationStart(long estimatedDuration)` -> `default void`
- `onTransitionAnimationFrame()` -> `default void`
- `onTransitionAnimationProgress(float estimatedProgress)` -> `default void`

## `org.telegram.messenger.pip.activity.IPipActivityListener`
- `onCompleteEnterToPip()` -> `default void`
- `onCompleteExitFromPip(boolean byActivityStop)` -> `default void`
- `onPipStashEnd()` -> `default void`
- `onPipStashStart()` -> `default void`
- `onStartEnterToPip()` -> `default void`
- `onStartExitFromPip(boolean byActivityStop)` -> `default void`

## `org.telegram.messenger.pip.source.IPipSourceDelegate`
- `pipCreateActionsList(ArrayList<RemoteAction> output, String sourceId, int maxActions)` -> `default void`
- `pipIsAvailable()` -> `default boolean`
- `pipRenderForeground(Canvas canvas)` -> `default void`

## `org.telegram.messenger.pip.source.PipSourceHandlerState2`
- `isAttachedToPip()` -> `boolean`
- `onCompleteExitFromPip(boolean byActivityStop)` -> `void`
- `onLoseMaxPriority()` -> `void`
- `onPipStashEnd()` -> `void`
- `onPipStashStart()` -> `void`
- `onReceiveMaxPriority()` -> `void`
- `onStartEnterToPip()` -> `void`
- `onTransitionAnimationFrame()` -> `void`
- `onTransitionAnimationProgress(float estimatedProgress)` -> `void`

## `org.telegram.messenger.pip.source.PipSourcePlaceholder`
- `clear()` -> `void`
- `setPlaceholder(Bitmap bitmap)` -> `void`
- `stopPlaceholderForActivity()` -> `void`
- `stopPlaceholderForSource()` -> `void`

## `org.telegram.messenger.pip.source.PipSourceSnapshot`
- `release()` -> `void`

## `org.telegram.messenger.pip.utils.PipActions`
- `static getActionId(Intent intent)` -> `int`
- `static getSourceId(Intent intent)` -> `String`
- `static isPipIntent(Intent intent)` -> `boolean`

## `org.telegram.messenger.pip.utils.PipDuration`
- `end()` -> `long`
- `estimated()` -> `long`
- `isStarted()` -> `boolean`
- `progress()` -> `float`
- `start()` -> `void`

## `org.telegram.messenger.pip.utils.PipPositionObserver`
- `start(View v)` -> `void`
- `stop()` -> `void`

## `org.telegram.messenger.pip.utils.PipSourceParams`
- `build()` -> `PictureInPictureParams.Builder`
- `getHeight()` -> `int`
- `getPosition(Rect outRect)` -> `void`
- `getWidth()` -> `int`
- `isValid()` -> `boolean`
- `set(Rect position, Point ratio)` -> `boolean`
- `setPosition(Rect position)` -> `boolean`
- `setPosition(int left, int top, int right, int bottom)` -> `boolean`
- `setRatio(int width, int height)` -> `boolean`
- `setRatio(Point ratio)` -> `boolean`

## `org.telegram.messenger.pip.utils.PipUtils`
- `static applyPictureInPictureParams(Activity activity, PipSource source)` -> `void`
- `static checkAnyPipPermissions(Context context)` -> `boolean`
- `static createWindowLayoutParams(Context context, boolean inAppOnly)` -> `WindowManager.LayoutParams`
- `static getPipSourceRectHintPosition(Activity activity, View view, Rect out)` -> `void`
- `static getWindowLayoutParamsType(Context context, boolean inAppOnly)` -> `int`
- `static useAutoEnterInPictureInPictureMode()` -> `boolean`

## `org.telegram.messenger.pip.utils.Trigger`
- `cancel()` -> `void`
- `static run(Callback action, long timeoutMs)` -> `Trigger`
- `static run(Handler handler, Callback action, long timeoutMs)` -> `Trigger`
- `run()` -> `void`

## `org.telegram.messenger.video.AudioConversions`
- `static shortsToUs(int shorts, int sampleRate, int channels)` -> `long`
- `static usToBytes(long us, int sampleRate, int channels)` -> `int`
- `static usToShorts(long us, int sampleRate, int channels)` -> `int`

## `org.telegram.messenger.video.AudioDecoder`
- `decode()` -> `DecodedBufferData`
- `getBitrateRate()` -> `int`
- `getChannelCount()` -> `int`
- `getDurationUs()` -> `long`
- `getEndTimeUs()` -> `long`
- `getInputMediaFormat()` -> `MediaFormat`
- `getMediaFormat()` -> `MediaFormat`
- `getOutputMediaFormat()` -> `MediaFormat`
- `getSampleRate()` -> `int`
- `getStartTimeUs()` -> `long`
- `isDecodingDone()` -> `boolean`
- `isLoopingEnabled()` -> `boolean`
- `release()` -> `void`
- `releaseOutputBuffer(int index)` -> `void`
- `setEndTimeUs(long endTimeUs)` -> `void`
- `setLoopingEnabled(boolean loopingEnabled)` -> `void`
- `setStartTimeUs(long startTimeUs)` -> `void`
- `start()` -> `void`
- `stop()` -> `void`

## `org.telegram.messenger.video.AudioRecoder`
- `release()` -> `void`
- `step(MediaCodecVideoConvertor.Muxer muxer, int audioTrackIndex)` -> `boolean`

## `org.telegram.messenger.video.OldVideoPlayerRewinder`
- `cancelRewind()` -> `void`
- `getVideoProgress()` -> `float`
- `onRewindCanceled()` -> `void`
- `onRewindStart(boolean rewindForward)` -> `void`
- `startRewind(PhotoViewerWebView webView, boolean forward, float playbackSpeed)` -> `void`
- `startRewind(VideoPlayer videoPlayer, boolean forward, float playbackSpeed)` -> `void`

## `org.telegram.messenger.video.VideoPlayerHolderBase`
- `allowMultipleInstances(boolean allow)` -> `void`
- `getCurrentPosition()` -> `long`
- `getCurrentUri()` -> `Uri`
- `getDuration()` -> `long`
- `getPlaybackProgress(long totalDuration)` -> `float`
- `isBuffering()` -> `boolean`
- `isPlaying()` -> `boolean`
- `loopBack()` -> `void`
- `needRepeat()` -> `boolean`
- `onRenderedFirstFrame()` -> `void`
- `onStateChanged(boolean playWhenReady, int playbackState)` -> `void`
- `onVideoSizeChanged(int width, int height, int unappliedRotationDegrees, float pixelWidthHeightRatio)` -> `void`
- `pause()` -> `void`
- `play()` -> `void`
- `play(float speed)` -> `void`
- `preparePlayer(Uri uri, boolean audioDisabled, float speed)` -> `void`
- `release(Runnable whenReleased)` -> `boolean`
- `seek(float delta, final long duration)` -> `float`
- `seekTo(long position)` -> `void`
- `seekTo(long position, boolean fast, Runnable done)` -> `void`
- `setAudioEnabled(boolean enabled, boolean prepared)` -> `void`
- `setOnErrorListener(Runnable listener)` -> `void`
- `setOnReadyListener(Runnable listener)` -> `void`
- `setOnSeekUpdate(Runnable onSeekUpdate)` -> `void`
- `setSeeking(boolean seeking)` -> `void`
- `setSpeed(float speed)` -> `void`
- `setVolume(float v)` -> `void`
- `start(boolean attach, boolean paused, Uri uri, long position, boolean audioDisabled, float speed)` -> `void`
- `with(SurfaceView surfaceView)` -> `VideoPlayerHolderBase`
- `with(TextureView textureView)` -> `VideoPlayerHolderBase`
- `with(Surface surface)` -> `VideoPlayerHolderBase`

## `org.telegram.messenger.video.VideoPlayerRewinder`
- `cancelRewind()` -> `void`
- `getRewindSpeed()` -> `float`
- `getValueBySpeed(float speed)` -> `float`
- `getVideoProgress()` -> `float`
- `onRewindCanceled()` -> `void`
- `onRewindStart(boolean rewindForward)` -> `void`
- `setX(float x)` -> `void`
- `startRewind(PhotoViewerWebView webView, boolean forward, float initialX, float playbackSpeed, SeekSpeedDrawable seekSpeedDrawable)` -> `void`
- `startRewind(VideoPlayer videoPlayer, boolean forward, float initialX, float playbackSpeed, SeekSpeedDrawable seekSpeedDrawable)` -> `void`
- `updateRewindSpeed()` -> `void`

## `org.telegram.messenger.video.audio_input.AudioInput`
- `getVolume()` -> `float`
- `isLoopingEnabled()` -> `boolean`
- `setLoopingEnabled(boolean loopingEnabled)` -> `void`
- `setVolume(float volume)` -> `void`

## `org.telegram.messenger.video.audio_input.BlankAudioInput`
- `getBitrate()` -> `int`
- `getChannelCount()` -> `int`
- `getDurationUs()` -> `long`
- `getEndTimeUs()` -> `long`
- `getNext()` -> `short`
- `getSampleRate()` -> `int`
- `getStartTimeUs()` -> `long`
- `hasRemaining()` -> `boolean`
- `release()` -> `void`
- `setEndTimeUs(long timeUs)` -> `void`
- `setStartTimeUs(long timeUs)` -> `void`
- `start(int outputSampleRate, int outputChannelCount)` -> `void`

## `org.telegram.messenger.video.audio_input.GeneralAudioInput`
- `getBitrate()` -> `int`
- `getChannelCount()` -> `int`
- `getDurationUs()` -> `long`
- `getEndTimeUs()` -> `long`
- `getNext()` -> `short`
- `getSampleRate()` -> `int`
- `getStartOffsetUs()` -> `long`
- `getStartTimeUs()` -> `long`
- `hasRemaining()` -> `boolean`
- `release()` -> `void`
- `setEndTimeUs(long timeUs)` -> `void`
- `setLoopingEnabled(boolean loopingEnabled)` -> `void`
- `setStartOffsetUs(long startOffsetUs)` -> `void`
- `setStartTimeUs(long timeUs)` -> `void`
- `start(int outputSampleRate, int outputChannelCount)` -> `void`

## `org.telegram.messenger.video.remix.DefaultAudioRemixer`
- `getRemixedSize(int inputSize, int inputChannelCount, int outputChannelCount)` -> `int`
- `remix(@NonNull ShortBuffer inputBuffer, int inputChannelCount, @NonNull ShortBuffer outputBuffer, int outputChannelCount)` -> `void`

## `org.telegram.messenger.video.remix.DownMixAudioRemixer`
- `getRemixedSize(int inputSize, int inputChannelCount, int outputChannelCount)` -> `int`
- `static mix(short input1, short input2)` -> `short`
- `remix(@NonNull ShortBuffer inputBuffer, int inputChannelCount, @NonNull ShortBuffer outputBuffer, int outputChannelCount)` -> `void`

## `org.telegram.messenger.video.remix.PassThroughAudioRemixer`
- `getRemixedSize(int inputSize, int inputChannelCount, int outputChannelCount)` -> `int`
- `remix(@NonNull ShortBuffer inputBuffer, int inputChannelCount, @NonNull ShortBuffer outputBuffer, int outputChannelCount)` -> `void`

## `org.telegram.messenger.video.remix.SurroundAudioRemixer`
- `getRemixedSize(int inputSize, int inputChannelCount, int outputChannelCount)` -> `int`
- `remix(@NonNull ShortBuffer inputBuffer, int inputChannelCount, @NonNull ShortBuffer outputBuffer, int outputChannelCount)` -> `void`

## `org.telegram.messenger.video.remix.UpMixAudioRemixer`
- `getRemixedSize(int inputSize, int inputChannelCount, int outputChannelCount)` -> `int`
- `remix(@NonNull ShortBuffer inputBuffer, int inputChannelCount, @NonNull ShortBuffer outputBuffer, int outputChannelCount)` -> `void`

## `org.telegram.messenger.video.resample.DefaultAudioResampler`
- `resample(@NonNull ShortBuffer inputBuffer, int inputSampleRate, @NonNull ShortBuffer outputBuffer, int outputSampleRate, int channels)` -> `void`

## `org.telegram.messenger.video.resample.DownsampleAudioResampler`
- `resample(@NonNull ShortBuffer inputBuffer, int inputSampleRate, @NonNull ShortBuffer outputBuffer, int outputSampleRate, int channels)` -> `void`

## `org.telegram.messenger.video.resample.UpsampleAudioResampler`
- `resample(@NonNull ShortBuffer inputBuffer, int inputSampleRate, @NonNull ShortBuffer outputBuffer, int outputSampleRate, int channels)` -> `void`

## `org.telegram.messenger.voip.VoipAudioManager`
- `findBluetoothDevice()` -> `AudioDeviceInfo`
- `static get()` -> `VoipAudioManager`
- `isBluetoothAndSpeakerOnAsync(Utilities.Callback2<Boolean, Boolean> onDone)` -> `void`
- `static isBluetoothDevice(AudioDeviceInfo device)` -> `boolean`
- `isBluetoothOn()` -> `boolean`
- `isSpeakerphoneOn()` -> `boolean`
- `setBluetoothOn(boolean on)` -> `void`
- `setSpeakerphoneOn(boolean on)` -> `void`
- `startBluetooth()` -> `void`
- `stopBluetooth()` -> `void`

## `org.telegram.messenger.wallpaper.WallpaperGiftPatternPosition`
- `static create(Attributes attributes, float scale)` -> `WallpaperGiftPatternPosition`
- `static deserialize(InputSerializedData data)` -> `WallpaperGiftPatternPosition`
- `serialize(OutputSerializedData data)` -> `void`

## `org.telegram.tgnet.TLRPC$Audio`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Audio`

## `org.telegram.tgnet.TLRPC$DisallowedGiftsSettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `DisallowedGiftsSettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$InputInvoice`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputInvoice`

## `org.telegram.tgnet.TLRPC$InputStickerSet`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputStickerSet`

## `org.telegram.tgnet.TLRPC$InputStickeredMedia`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputStickeredMedia`

## `org.telegram.tgnet.TLRPC$StickerSet`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StickerSet`

## `org.telegram.tgnet.TLRPC$StickerSetCovered`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StickerSetCovered`

## `org.telegram.tgnet.TLRPC$TL_audioEmpty_layer45`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_audioEncrypted`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_audio_layer45`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_audio_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_audio_old2`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_botInlineMessageMediaInvoice`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionChangeEmojiStickerSet`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionChangeStickerSet`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_setEmojiStickers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_setStickers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatThemeUniqueGift`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageMediaAudio`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageMediaAudio_layer8`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_documentAttributeAudio`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_documentAttributeAudio_layer45`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_documentAttributeAudio_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_documentAttributeHasStickers`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_documentAttributeSticker`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_documentAttributeSticker_layer55`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_documentAttributeSticker_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_documentAttributeSticker_old2`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputInvoiceChatInviteSubscription`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputInvoiceMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputInvoicePremiumAuthCode`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputInvoicePremiumGiftCode`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputInvoicePremiumGiftStars`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputInvoiceSlug`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputInvoiceStarGift`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputInvoiceStarGiftAuctionBid`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputInvoiceStarGiftDropOriginalDetails`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputInvoiceStarGiftPrepaidUpgrade`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputInvoiceStarGiftResale`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputInvoiceStarGiftTransfer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputInvoiceStarGiftUpgrade`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputInvoiceStars`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaInvoice`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessagesFilterGif`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessagesFilterRoundVoice`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessagesFilterVoice`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyStarGiftsAutoSave`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyVoiceMessages`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStickerSetAnimatedEmoji`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStickerSetDice`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStickerSetDice_layer111`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStickerSetEmojiChannelDefaultStatuses`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStickerSetEmojiDefaultStatuses`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStickerSetEmojiDefaultTopicIcons`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStickerSetEmojiGenericAnimations`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStickerSetEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStickerSetID`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStickerSetItem`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inputStickerSetItem`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStickerSetPremiumGifts`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStickerSetShortName`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStickerSetThumb`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStickerSetTonGifts`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStickeredMediaDocument`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStickeredMediaPhoto`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStorePaymentGiftPremium`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStorePaymentPremiumGiftCode`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStorePaymentStarsGift`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_invoice`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_invoice`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_invoice_layer163`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_invoice_layer193`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionGiftCode`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionGiftCode_layer167`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionGiftCode_layer189`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionGiftCode_layer216`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionGiftPremium`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionGiftPremium_layer189`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionGiftPremium_layer216`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionGiftStars`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionGiftTon`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionStarGift`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionStarGiftPurchaseOffer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionStarGiftPurchaseOfferDeclined`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionStarGiftUnique`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionStarGiftUnique_layer197`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionStarGiftUnique_layer202`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionStarGiftUnique_layer210`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionStarGiftUnique_layer214`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionStarGiftUnique_layer221`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionStarGiftUnique_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionStarGift_layer192`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionStarGift_layer195`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionStarGift_layer197`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionStarGift_layer211`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionStarGift_layer217`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionStarGift_layer219`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaAudio_layer45`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaInvoice`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaInvoice_layer145`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_allStickers`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_allStickersNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_archivedStickers`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_archivedStickers`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_clearRecentStickers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_faveSticker`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_favedStickers`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_favedStickersNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_featuredStickers`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_featuredStickersNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_foundStickerSets`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_foundStickerSetsNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_foundStickers`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_foundStickersNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getAllStickers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getArchivedStickers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getAttachedStickers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getEmojiStickerGroups`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getEmojiStickers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getFavedStickers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getFeaturedEmojiStickers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getFeaturedStickers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getMaskStickers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getMyStickers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getOldFeaturedStickers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getRecentStickers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getSavedGifs`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getStickerSet`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getStickers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_installStickerSet`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `messages_StickerSetInstallResult`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_myStickers`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_myStickers`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_rateTranscribedAudio`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_readFeaturedStickers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_recentStickers`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_recentStickersNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_reorderStickerSets`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_saveGif`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_saveRecentSticker`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_savedGifs`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_savedGifsNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_searchEmojiStickerSets`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `messages_FoundStickerSets`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_searchStickerSets`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `messages_FoundStickerSets`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_searchStickers`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `messages_FoundStickers`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_stickerSet`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_stickerSetInstallResultArchive`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_stickerSetInstallResultSuccess`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_stickerSetNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_stickerSet_layer146`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_stickers`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_stickersNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_toggleStickerSets`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_transcribeAudio`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_transcribedAudio`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_transcribedAudio`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_uninstallStickerSet`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_applyGiftCode`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_checkGiftCode`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_checkedGiftCode`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_payments_checkedGiftCode`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_exportInvoice`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_exportedInvoice`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_payments_exportedInvoice`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_getPremiumGiftCodeOptions`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_paymentFormStarGift`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_premiumGiftCodeOption`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_premiumGiftCodeOption`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_premiumGiftOption`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_premiumGiftOption`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_premiumGiftOption_layer199`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyKeyStarGiftsAutoSave`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyKeyVoiceMessages`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_profileTabGifs`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_profileTabGifts`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_profileTabVoice`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_recentMeUrlStickerSet`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageChooseStickerAction`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageRecordAudioAction`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageUploadAudioAction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageUploadAudioAction_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickerKeyword`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_stickerKeyword`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickerPack`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_stickerPack`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickerSet`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickerSetCovered`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickerSetFullCovered`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickerSetFullCovered_layer146`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickerSetMultiCovered`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickerSetNoCovered`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickerSet_layer121`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickerSet_layer126`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickerSet_layer143`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickerSet_layer75`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickerSet_layer96`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickerSet_layer97`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickerSet_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickers_addStickerToSet`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickers_changeSticker`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickers_changeStickerPosition`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickers_checkShortName`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickers_createStickerSet`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickers_deleteStickerSet`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickers_removeStickerFromSet`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickers_renameStickerSet`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickers_replaceSticker`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickers_setStickerSetThumb`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickers_suggestShortName`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_stickers_suggestedShortName`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_stickers_suggestedShortName`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_storage_fileGif`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_videoSizeStickerMarkup`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPageAttributeStarGiftAuction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPageAttributeStarGiftAuction_layer219`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPageAttributeStarGiftCollection`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPageAttributeStickerSet`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPageAttributeUniqueStarGift`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$Tl_inputChatThemeUniqueGift`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$messages_AllStickers`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_AllStickers`

## `org.telegram.tgnet.TLRPC$messages_FavedStickers`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_FavedStickers`

## `org.telegram.tgnet.TLRPC$messages_FeaturedStickers`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_FeaturedStickers`

## `org.telegram.tgnet.TLRPC$messages_FoundStickerSets`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_FoundStickerSets`

## `org.telegram.tgnet.TLRPC$messages_FoundStickers`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_FoundStickers`

## `org.telegram.tgnet.TLRPC$messages_RecentStickers`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_RecentStickers`

## `org.telegram.tgnet.TLRPC$messages_SavedGifs`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_SavedGifs`

## `org.telegram.tgnet.TLRPC$messages_StickerSet`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_stickerSet`

## `org.telegram.tgnet.TLRPC$messages_StickerSetInstallResult`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_StickerSetInstallResult`

## `org.telegram.tgnet.TLRPC$messages_Stickers`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_Stickers`

## `org.telegram.tgnet.tl.TL_account$Tl_getUniqueGiftChatThemes`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `ChatThemes`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockAudio`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockAudio_layer82`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_payments$StarGiftActiveAuctions`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StarGiftActiveAuctions`

## `org.telegram.tgnet.tl.TL_payments$TL_StarGiftAuctionAcquiredGifts`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_StarGiftAuctionAcquiredGifts`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_payments$TL_StarGiftAuctionState`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_StarGiftAuctionState`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_payments$TL_getStarGiftActiveAuctions`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `StarGiftActiveAuctions`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_payments$TL_getStarGiftAuctionAcquiredGifts`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_StarGiftAuctionAcquiredGifts`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_payments$TL_getStarGiftAuctionState`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_StarGiftAuctionState`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_payments$TL_resolveStarGiftOffer`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_payments$TL_sendStarGiftOffer`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_payments$TL_starGiftActiveAuctions`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_payments$TL_starGiftActiveAuctionsNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$CheckCanSendGiftResult`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `CheckCanSendGiftResult`

## `org.telegram.tgnet.tl.TL_stars$InputSavedStarGift`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputSavedStarGift`

## `org.telegram.tgnet.tl.TL_stars$InputStarGiftAuction`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputStarGiftAuction`

## `org.telegram.tgnet.tl.TL_stars$SavedStarGift`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `SavedStarGift`

## `org.telegram.tgnet.tl.TL_stars$StarGift`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StarGift`
- `getDocument()` -> `TLRPC.Document`
- `getResellAmount(AmountUtils.Currency currency)` -> `AmountUtils.Amount`
- `getResellStars()` -> `long`

## `org.telegram.tgnet.tl.TL_stars$StarGiftAttribute`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StarGiftAttribute`
- `getRarityPermille()` -> `int`

## `org.telegram.tgnet.tl.TL_stars$StarGiftAttributeId`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StarGiftAttributeId`

## `org.telegram.tgnet.tl.TL_stars$StarGiftAttributeRarity`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StarGiftAttributeRarity`

## `org.telegram.tgnet.tl.TL_stars$StarGiftAuctionRound`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StarGiftAuctionRound`

## `org.telegram.tgnet.tl.TL_stars$StarGiftAuctionState`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StarGiftAuctionState`

## `org.telegram.tgnet.tl.TL_stars$StarGiftCollections`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StarGiftCollections`

## `org.telegram.tgnet.tl.TL_stars$StarGiftUpgradePrice`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StarGiftUpgradePrice`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$StarGifts`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StarGifts`

## `org.telegram.tgnet.tl.TL_stars$TL_StarGiftActiveAuctionState`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_StarGiftActiveAuctionState`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_StarGiftAuctionAcquiredGift`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_StarGiftAuctionAcquiredGift`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_StarGiftAuctionUserState`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_StarGiftAuctionUserState`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_inputSavedStarGiftChat`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_inputSavedStarGiftSlug`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_inputSavedStarGiftUser`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_inputStarGiftAuction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_inputStarGiftAuctionSlug`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_payments_getStarsGiftOptions`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_payments_savedStarGifts`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_payments_savedStarGifts`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_payments_uniqueStarGift`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_payments_uniqueStarGift`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_savedStarGift`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_savedStarGift_layer202`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_savedStarGift_layer209`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_savedStarGift_layer211`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_savedStarGift_layer214`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_savedStarGift_layer219`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_savedStarGift_layer221`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_savedStarGift_layer221_2`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGift`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftAttributeRarity`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftAttributeRarityEpic`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftAttributeRarityLegendary`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftAttributeRarityRare`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftAttributeRarityUncommon`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftAuctionRound`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftAuctionRoundExtendable`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftAuctionState`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftAuctionStateFinished`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftAuctionStateNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftBackground`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_starGiftBackground`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftCollection`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_starGiftCollection`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftCollections`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftCollectionsNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique_layer196`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique_layer197`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique_layer198`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique_layer202`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique_layer206`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique_layer210`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique_layer211`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique_layer213`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique_layer214`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique_layer215`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique_layer219`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique_layer221`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGift_layer190`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGift_layer195`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGift_layer202`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGift_layer206`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGift_layer209`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGift_layer212`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGift_layer217`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGift_layer219`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGifts`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starGiftsNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsGiftOption`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_starsGiftOption`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$UniqueStarGiftValueInfo`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `UniqueStarGiftValueInfo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$checkCanSendGift`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$checkCanSendGiftResultFail`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$checkCanSendGiftResultOk`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$convertStarGift`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$craftStarGift`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$createStarGiftCollection`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$deleteStarGiftCollection`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$getCraftStarGifts`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_payments_savedStarGifts`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$getResaleStarGifts`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$getSavedStarGift`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$getSavedStarGifts`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_payments_savedStarGifts`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$getStarGiftCollections`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$getStarGiftUpgradeAttributes`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `starGiftUpgradeAttributes`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$getStarGiftUpgradePreview`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$getStarGiftWithdrawalUrl`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$getStarGifts`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$getUniqueStarGift`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$getUniqueStarGiftValueInfo`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$reorderStarGiftCollections`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$resaleStarGifts`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `resaleStarGifts`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$saveStarGift`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$starGiftAttributeBackdrop`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$starGiftAttributeBackdrop_layer202`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$starGiftAttributeBackdrop_layer221`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$starGiftAttributeCounter`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `starGiftAttributeCounter`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$starGiftAttributeIdBackdrop`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$starGiftAttributeIdModel`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$starGiftAttributeIdPattern`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$starGiftAttributeModel`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$starGiftAttributeModel_layer221`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$starGiftAttributeOriginalDetails`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$starGiftAttributeOriginalDetails_layer197`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$starGiftAttributePattern`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$starGiftAttributePattern_layer221`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$starGiftUpgradeAttributes`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `starGiftUpgradeAttributes`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$starGiftUpgradePreview`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `starGiftUpgradePreview`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$starGiftWithdrawalUrl`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `starGiftWithdrawalUrl`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$toggleChatStarGiftNotifications`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$toggleStarGiftsPinnedToTop`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$transferStarGift`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$updateStarGiftCollection`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$updateStarGiftPrice`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$upgradeStarGift`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_mediaAreaStarGift`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateFavedStickers`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateMoveStickerSetToTop`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateNewStickerSet`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateReadFeaturedEmojiStickers`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateReadFeaturedStickers`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateRecentStickers`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateSavedGifs`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateStarGiftAuctionState`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateStarGiftAuctionUserState`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateStarGiftCraftFail`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateStickerSets`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateStickerSetsOrder`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateTranscribeAudio`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateTranscribedAudio`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.ui.CameraScanActivity`
- `processShot(Bitmap bitmap)` -> `void`

## `org.telegram.ui.CameraScanActivity$CameraScanActivityDelegate`
- `processQr(String text, Runnable onLoadEnd)` -> `default boolean`

## `org.telegram.ui.Cells.ActiveGiftAuctionsHintCell`
- `onActiveAuctionsUpdate(List<GiftAuctionController.Auction> auctions)` -> `void`

## `org.telegram.ui.Components.AudioPlayerAlert`
- `canDismissWithSwipe()` -> `boolean`

## `org.telegram.ui.Components.CaptionPhotoViewer`
- `additionalKeyboardHeight()` -> `int`
- `hasTimer()` -> `boolean`
- `onUpdateShowKeyboard(float keyboardT)` -> `void`

## `org.telegram.ui.Components.EmojiView$ChooseStickerActionTracker`
- `checkVisibility()` -> `void`

## `org.telegram.ui.Components.EmojiView$GifAdapter`
- `loadTrendingGifs()` -> `void`

## `org.telegram.ui.Components.EmojiView$GifSearchPreloader`
- `isLoading(String key)` -> `boolean`

## `org.telegram.ui.Components.GroupCallPip`
- `static checkInlinePermissions()` -> `boolean`
- `static isShowing()` -> `boolean`
- `pinnedToCenter(boolean pinned)` -> `void`

## `org.telegram.ui.Components.InstantCameraView`
- `cancel(boolean byGesture)` -> `void`
- `onPanTranslationUpdate(float y)` -> `void`
- `send(int state, boolean notify, int scheduleDate, int scheduleRepeatPeriod, int ttl, long effectId, long stars)` -> `void`

## `org.telegram.ui.Components.InstantCameraView$CameraGLThread`
- `requestRender(boolean updateTexImage1, boolean updateTexImage2)` -> `void`

## `org.telegram.ui.Components.InstantCameraView$Delegate`
- `isInScheduleMode()` -> `default boolean`
- `isSecretChat()` -> `default boolean`

## `org.telegram.ui.Components.InstantCameraView2`
- `cancel(boolean byGesture)` -> `void`
- `onPanTranslationUpdate(float translationY)` -> `void`

## `org.telegram.ui.Components.Paint.Views.StickerMakerView`
- `hasSegmentedBitmap()` -> `boolean`
- `static removeUnnecessaryPoints(List<Point> points)` -> `List<Point>`

## `org.telegram.ui.Components.PhotoViewerCaptionEnterView`
- `addEmojiToRecent(String code)` -> `void`

## `org.telegram.ui.Components.PhotoViewerWebView`
- `checkInlinePermissions()` -> `boolean`
- `hasError()` -> `boolean`
- `hasYoutubeStoryboards()` -> `boolean`
- `processTouch(MotionEvent event)` -> `void`

## `org.telegram.ui.Components.PipVideoOverlay`
- `static isPipSurfaceTexture(SurfaceTexture texture)` -> `boolean`
- `static isVisible()` -> `boolean`
- `static onUpdateRewindProgressUi(long timeDiff, float progress, boolean rewindByBackSeek)` -> `void`

## `org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier`
- `isStarsPaymentAvailable()` -> `boolean`

## `org.telegram.ui.Components.ProfileGalleryView`
- `addUploadingImage(ImageLocation imageLocation, ImageLocation thumbLocation)` -> `void`
- `hasImages()` -> `boolean`
- `removePhotoAtIndex(int index)` -> `boolean`
- `removeUploadingImage(ImageLocation imageLocation)` -> `void`

## `org.telegram.ui.Components.ProfileGalleryView$ViewPagerAdapter`
- `isViewFromObject(View view, Object object)` -> `boolean`

## `org.telegram.ui.Components.RecordedAudioPlayerView`
- `checkWaveform()` -> `void`

## `org.telegram.ui.Components.StickerMasksAlert`
- `addRecentSticker(TLRPC.Document document)` -> `void`
- `canDismissWithSwipe()` -> `boolean`

## `org.telegram.ui.Components.StickerSetLinkIcon`
- `readyToDie()` -> `void`

## `org.telegram.ui.Components.StickerTabView`
- `saveXPosition()` -> `void`

## `org.telegram.ui.Components.StickersAlert`
- `canDismissWithSwipe()` -> `boolean`
- `static editSticker(BaseFragment parentFragment, TLRPC.TL_messages_stickerSet stickerSet, TLRPC.Document document)` -> `void`
- `loadStickerSet(boolean force)` -> `void`

## `org.telegram.ui.Components.StickersRecyclerListView$Adapter`
- `isEnabled(ViewHolder holder)` -> `boolean`

## `org.telegram.ui.Components.TrendingStickersAlert`
- `canDismissWithSwipe()` -> `boolean`

## `org.telegram.ui.Components.TrendingStickersLayout$Delegate`
- `canSchedule()` -> `boolean`
- `canSendSticker()` -> `boolean`
- `isInScheduleMode()` -> `boolean`

## `org.telegram.ui.Components.TrendingStickersLayout$TrendingStickersAdapter`
- `loadMoreStickerSets()` -> `void`

## `org.telegram.ui.Components.VideoPlayer`
- `static hasQualities(int currentAccount, TLRPC.MessageMedia media)` -> `boolean`
- `isBuffering()` -> `boolean`
- `isHDR()` -> `boolean`
- `isLooping()` -> `boolean`
- `isMuted()` -> `boolean`
- `isPlayerPrepared()` -> `boolean`
- `isPlaying()` -> `boolean`
- `isStreaming()` -> `boolean`
- `onSurfaceTextureUpdated(SurfaceTexture surfaceTexture)` -> `void`
- `static saveLooping(boolean looping, MessageObject messageObject)` -> `void`
- `static saveQuality(Quality q, MessageObject messageObject)` -> `void`
- `static saveQuality(Quality q, long did, int mid)` -> `void`

## `org.telegram.ui.Components.VideoPlayer$OffsetDataSource`
- `addTransferListener(TransferListener transferListener)` -> `void`
- `read(byte[] buffer, int offset, int length)` -> `int`

## `org.telegram.ui.Components.VideoPlayer$VideoPlayerDelegate`
- `onSurfaceTextureUpdated(SurfaceTexture surfaceTexture)` -> `default void`

## `org.telegram.ui.Components.VideoPlayer$VideoUri`
- `isCached()` -> `boolean`
- `isManifestCached()` -> `boolean`

## `org.telegram.ui.Components.VideoPlayerSeekBar`
- `isDragging()` -> `boolean`

## `org.telegram.ui.Components.voip.RTMPStreamPipOverlay`
- `static isVisible()` -> `boolean`

## `org.telegram.ui.Components.voip.VoIPPiPView`
- `static isExpanding()` -> `boolean`
- `onMediaStateUpdated(int audioState, int videoState)` -> `void`

## `org.telegram.ui.Gifts.ActiveAuctionsSheet`
- `onActiveAuctionsUpdate(List<GiftAuctionController.Auction> auctions)` -> `void`

## `org.telegram.ui.Gifts.AuctionBidSheet`
- `onUpdate(GiftAuctionController.Auction auction)` -> `void`

## `org.telegram.ui.Gifts.AuctionJoinSheet`
- `onUpdate(GiftAuctionController.Auction auction)` -> `void`

## `org.telegram.ui.Gifts.AuctionWearingSheet`
- `onUpdate(GiftAuctionController.Auction auction)` -> `void`

## `org.telegram.ui.Gifts.GiftMessageBottomSheet`
- `canDismissWithSwipe()` -> `boolean`

## `org.telegram.ui.Gifts.GiftSheet$GiftCell`
- `removeImage()` -> `void`

## `org.telegram.ui.Gifts.ProfileGiftsContainer`
- `addGifts()` -> `void`
- `canAdd()` -> `boolean`
- `canFilter()` -> `boolean`
- `canFilterHidden()` -> `boolean`
- `canReorder()` -> `boolean`
- `canScroll(boolean forward)` -> `boolean`
- `canSwitchNotify()` -> `boolean`
- `processColor(int color)` -> `int`

## `org.telegram.ui.Gifts.ResaleGiftsFragment$ResaleGiftsList`
- `cancel()` -> `void`
- `load()` -> `void`
- `load(boolean force)` -> `void`

## `org.telegram.ui.Gifts.SendGiftSheet`
- `onUpdate(GiftAuctionController.Auction auction)` -> `void`

## `org.telegram.ui.PhotoViewer`
- `addPhoto(MessageObject message, int classGuid)` -> `void`
- `canDoubleTap(MotionEvent e)` -> `boolean`
- `checkCurrentImageVisibility()` -> `void`
- `checkFullscreenButton()` -> `void`
- `getCurrentMessageObject()` -> `MessageObject`
- `static hasInstance()` -> `boolean`
- `isInjectingVideoPlayer()` -> `boolean`
- `isOpenedFullScreenVideo()` -> `boolean`
- `static isPlayingMessage(MessageObject object)` -> `boolean`
- `static isPlayingMessageInPip(MessageObject object)` -> `boolean`
- `static isShowingImage(MessageObject object)` -> `boolean`
- `static isShowingImage(TLRPC.FileLocation object)` -> `boolean`
- `static isShowingImage(TLRPC.BotInlineResult object)` -> `boolean`
- `static isShowingImage(String object)` -> `boolean`
- `isVisible()` -> `boolean`
- `isVisibleOrAnimating()` -> `boolean`
- `setParentChatActivity(ChatActivity chatActivity)` -> `void`

## `org.telegram.ui.PhotoViewer$EmptyPhotoViewerProvider`
- `canCaptureMorePhotos()` -> `boolean`
- `canEdit(int index)` -> `boolean`
- `canReplace(int index)` -> `boolean`
- `canScrollAway()` -> `boolean`
- `cancelButtonPressed()` -> `boolean`
- `deleteImageAtIndex(int index)` -> `void`
- `getDeleteMessageString()` -> `String`
- `getEditingMessageObject()` -> `MessageObject`
- `isPhotoChecked(int index)` -> `boolean`
- `loadMore()` -> `boolean`
- `sendButtonPressed(int index, VideoEditedInfo videoEditedInfo, boolean notify, int scheduleDate, int scheduleRepeatPeriod, boolean forceDocument)` -> `void`

## `org.telegram.ui.PhotoViewer$FirstFrameView`
- `checkFromPlayer(VideoPlayer videoPlayer)` -> `void`

## `org.telegram.ui.PhotoViewer$FrameLayoutDrawer`
- `requestLayout()` -> `void`

## `org.telegram.ui.PhotoViewer$PhotoProgressView`
- `isVisible()` -> `boolean`
- `onBackgroundStateUpdated(int state)` -> `void`

## `org.telegram.ui.PhotoViewer$PhotoViewerProvider`
- `canLoadMoreAvatars()` -> `default boolean`
- `canMoveCaptionAbove()` -> `default boolean`
- `canSchedule()` -> `default boolean`
- `canSendAsFile()` -> `default boolean`
- `canSetTimer()` -> `default boolean`
- `getDialogId()` -> `default long`
- `isCaptionAbove()` -> `default boolean`
- `isEditingMessage()` -> `default boolean`
- `isEditingSticker()` -> `default boolean`

## `org.telegram.ui.PhotoViewer$VideoPlayerControlFrameLayout`
- `requestLayout()` -> `void`

## `org.telegram.ui.SaveToGallerySettingsActivity$Adapter`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.SecretMediaViewer$VideoPlayerControlFrameLayout`
- `requestLayout()` -> `void`

## `org.telegram.ui.Stars.StarGiftSheet`
- `static addAttributeRow(TableView tableView, TL_stars.StarGiftAttribute attr)` -> `void`
- `canCraft()` -> `boolean`
- `canDismissWithSwipe()` -> `boolean`
- `canDismissWithTouchOutside()` -> `boolean`
- `canResellAt()` -> `int`
- `canSwipeToBack(MotionEvent event)` -> `boolean`
- `canTransfer()` -> `boolean`
- `canTransferAt()` -> `int`
- `onUpdatePriceClick(View btn)` -> `void`
- `shouldDrawBackground()` -> `boolean`

## `org.telegram.ui.Stars.StarGiftSheet$CraftTopView$Cube3D`
- `putView(int face, View view)` -> `int`

## `org.telegram.ui.Stars.StarGiftSheet$CraftTopView$Cube3D$AnimSequence`
- `cancel()` -> `void`
- `put(View view, int face, int frames)` -> `AnimSequence`
- `put(View view, int face, int frames, float rotation)` -> `AnimSequence`

## `org.telegram.ui.Stars.StarGiftSheet$Roller`
- `isRolling()` -> `boolean`

## `org.telegram.ui.Stars.StarGiftSheet$Roller$Attr`
- `isLoaded()` -> `boolean`

## `org.telegram.ui.Stars.StarGiftSheet$Roller$AttrRoller`
- `isAlmostFinished()` -> `boolean`
- `isAlmostFinished(float offset)` -> `boolean`
- `isFinished()` -> `boolean`

## `org.telegram.ui.Stars.StarGiftSheet$Roller$Sticker`
- `isLoaded()` -> `boolean`

## `org.telegram.ui.Stars.StarGiftUniqueActionLayout`
- `getMessageDrawable()` -> `GiftMessageDrawable`

## `org.telegram.ui.Stars.StarsController$GiftsCollections`
- `addGift(int id, TL_stars.SavedStarGift gift, boolean insert)` -> `void`
- `addGifts(int id, ArrayList<TL_stars.SavedStarGift> gifts, boolean insert)` -> `void`
- `isMine()` -> `boolean`
- `load()` -> `void`
- `removeCollection(int id)` -> `void`
- `removeGift(int id, final TL_stars.SavedStarGift gift)` -> `void`
- `removeGifts(int id, final ArrayList<TL_stars.SavedStarGift> gifts)` -> `void`
- `sendOrder()` -> `void`

## `org.telegram.ui.Stars.StarsController$GiftsList`
- `cancel()` -> `void`
- `hasFilters()` -> `boolean`
- `isInclude_displayed()` -> `boolean`
- `isInclude_hidden()` -> `boolean`
- `isInclude_limited()` -> `boolean`
- `isInclude_unique()` -> `boolean`
- `isInclude_unlimited()` -> `boolean`
- `isInclude_upgradable()` -> `boolean`
- `load()` -> `void`
- `processCrafting(ArrayList<TL_stars.StarGift> giftsToRemove, TL_stars.StarGift giftToAdd)` -> `void`
- `sendPinnedOrder()` -> `void`

## `org.telegram.ui.StickersActivity`
- `hasSelected()` -> `boolean`

## `org.telegram.ui.Stories.LiveStoryPipOverlay`
- `static isVisible()` -> `boolean`
- `static isVisible(LivePlayer livePlayer)` -> `boolean`

## `org.telegram.ui.Stories.PeerStoriesView$VideoPlayerSharedScope`
- `isBuffering()` -> `boolean`

## `org.telegram.ui.Stories.recorder.GalleryListView$SearchAdapter`
- `load(String query)` -> `void`
- `onLoadingUpdate(boolean loading)` -> `void`

## `org.telegram.ui.Stories.recorder.GallerySheet`
- `canDismissWithSwipe()` -> `boolean`

## `org.telegram.utils.recorder.audio.AudioCapture`
- `start()` -> `void`
- `stop()` -> `void`

## `org.telegram.utils.recorder.audio.AudioNoiseSuppressor`
- `finalize()` -> `void`
- `process(@NonNull ByteBuffer pcm, int sampleCount)` -> `boolean`
- `recycle()` -> `void`

## `org.telegram.utils.recorder.audio.AudioRecorderDiagnostics`
- `error(@NonNull String message, @NonNull Throwable error)` -> `void`
- `log(@NonNull String message)` -> `void`

## `org.telegram.utils.recorder.audio.AudioRecorderNative`
- `finalize()` -> `void`
- `finish()` -> `boolean`
- `flush()` -> `long`
- `recycle()` -> `void`
- `writeFrame(@NonNull ByteBuffer frame, int length)` -> `int`

## `org.telegram.utils.recorder.audio.AudioRecordingSession`
- `cancel()` -> `boolean`
- `finish()` -> `boolean`
- `getRecordedDurationMs()` -> `long`
- `pausePreview()` -> `boolean`
- `pauseRecording()` -> `boolean`
- `playPreview()` -> `boolean`
- `release()` -> `void`
- `resumeRecording()` -> `boolean`
- `seekPreview(long positionMs)` -> `boolean`
- `setPreviewVolume(float volume)` -> `boolean`
- `setTrimRange(long startMs, long endMs)` -> `boolean`
- `start()` -> `boolean`

## `org.telegram.utils.recorder.audio.AudioRecordingSession$Listener`
- `onCompleted(@NonNull Result result)` -> `default void`
- `onError(@NonNull Exception error)` -> `default void`
- `onMaximumDurationReached()` -> `default void`
- `onPreviewPlaybackChanged(boolean playing)` -> `default void`
- `onPreviewProgress(long positionMs, long durationMs)` -> `default void`
- `onRecordingProgress(long durationMs, double amplitude)` -> `default void`
- `onRecordingTooShort(long durationMs)` -> `default void`
- `onStateChanged(@NonNull StateInfo stateInfo)` -> `default void`

## `org.telegram.utils.recorder.audio.AudioRecordingSession$OutputListener`
- `onOutputError(long outputId, @NonNull Exception error)` -> `default void`
- `onOutputStarted(long outputId, @NonNull File file)` -> `default void`

## `org.telegram.utils.recorder.audio.AudioRecordingSession$Result`
- `getDurationMs()` -> `long`
- `getOutputId()` -> `long`
- `getSampleRate()` -> `int`

## `org.telegram.utils.recorder.audio.AudioRecordingSession$StateInfo`
- `canControlPreview()` -> `boolean`
- `canFinish()` -> `boolean`
- `canPauseRecording()` -> `boolean`
- `canResumeRecording()` -> `boolean`
- `getMaximumDurationMs()` -> `long`
- `getMinimumDurationMs()` -> `long`
- `getRecordedDurationMs()` -> `long`
- `getRecordingStartedAtRealtimeMs()` -> `long`
- `getTrimEndMs()` -> `long`
- `getTrimStartMs()` -> `long`
- `isPreviewPlaying()` -> `boolean`

## `org.telegram.utils.recorder.round.RoundVideoCameraController`
- `release()` -> `void`
- `setCameraFacing(@NonNull RoundVideoSession.CameraFacing facing)` -> `boolean`
- `setTorchEnabled(boolean enabled)` -> `boolean`
- `setZoom(float progress)` -> `boolean`
- `stopSegment()` -> `boolean`

## `org.telegram.utils.recorder.round.RoundVideoSession$CameraCapabilities`
- `getMaximumZoomRatio()` -> `float`
- `isZoomSupported()` -> `boolean`
