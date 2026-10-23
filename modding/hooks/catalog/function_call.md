# function / call (653 методов)

## `org.telegram.PhoneFormat.CallingCodeInfo`
- `format(String orig)` -> `String`
- `isValidPhoneNumber(String orig)` -> `boolean`
- `matchingAccessCode(String str)` -> `String`
- `matchingTrunkCode(String str)` -> `String`

## `org.telegram.messenger.CallReceiver`
- `static checkLastReceivedCall()` -> `void`
- `static clearLastCall()` -> `void`
- `static getLastReceivedCall()` -> `String`
- `onReceive(final Context context, Intent intent)` -> `void`

## `org.telegram.messenger.ChatObject$Call`
- `addInvitedUser(long uid)` -> `void`
- `addKickedUser(long uid)` -> `void`
- `addSelfDummyParticipant(boolean notify)` -> `void`
- `canRecordVideo()` -> `boolean`
- `clearVideFramesInfo()` -> `void`
- `createNoVideoParticipant()` -> `void`
- `createRtmpStreamParticipant(List<TL_phone.TL_groupCallStreamChannel> channels)` -> `void`
- `getInputGroupCall()` -> `TLRPC.InputGroupCall`
- `getInputGroupCall(boolean bySlug)` -> `TLRPC.InputGroupCall`
- `isScheduled()` -> `boolean`
- `loadMembers(boolean fromBegin)` -> `void`
- `migrateToChat(TLRPC.Chat chat)` -> `void`
- `processGroupCallUpdate(TL_update.TL_updateGroupCall update)` -> `void`
- `processGroupCallUpdate(TLRPC.GroupCall update)` -> `void`
- `processParticipantsUpdate(TL_update.TL_updateGroupCallParticipants update, boolean fromQueue)` -> `void`
- `processTypingsUpdate(AccountInstance accountInstance, ArrayList<Long> uids, int date)` -> `void`
- `processUnknownVideoParticipants(int[] ssrc, OnParticipantsLoad onLoad)` -> `void`
- `processVoiceLevelsUpdate(int[] ssrc, float[] levels, boolean[] voice)` -> `void`
- `reloadGroupCall()` -> `void`
- `removeInvitedUser(long uid)` -> `void`
- `saveActiveDates()` -> `void`
- `setCall(AccountInstance account, long chatId, TLRPC.GroupCall call)` -> `void`
- `setCall(AccountInstance account, long chatId, TL_phone.groupCall groupCall)` -> `void`
- `setSelfPeer(TLRPC.InputPeer peer)` -> `void`
- `setTitle(String title)` -> `void`
- `shouldShowPanel()` -> `boolean`
- `sortParticipants()` -> `void`
- `toggleRecord(String title, @RecordType int type)` -> `void`
- `updateVisibleParticipants()` -> `void`
- `static videoIsActive(TLRPC.GroupCallParticipant participant, boolean presentation, ChatObject.Call call)` -> `boolean`

## `org.telegram.messenger.NotificationCallbackReceiver`
- `onReceive(Context context, Intent intent)` -> `void`

## `org.telegram.messenger.TelegramMediaSession$SessionCallback`
- `onCustomAction(String action, Bundle extras)` -> `void`
- `onPause()` -> `void`
- `onPlay()` -> `void`
- `onPlayFromMediaId(String mediaId, Bundle extras)` -> `void`
- `onPlayFromSearch(String query, Bundle extras)` -> `void`
- `onPrepare()` -> `void`
- `onPrepareFromMediaId(String mediaId, Bundle extras)` -> `void`
- `onPrepareFromSearch(String query, Bundle extras)` -> `void`
- `onSeekTo(long pos)` -> `void`
- `onSetRepeatMode(int repeatMode)` -> `void`
- `onSetShuffleMode(int shuffleMode)` -> `void`
- `onSkipToNext()` -> `void`
- `onSkipToPrevious()` -> `void`
- `onSkipToQueueItem(long queueId)` -> `void`
- `onStop()` -> `void`

## `org.telegram.messenger.browser.Browser$NavigationCallback`
- `onNavigationEvent(int navigationEvent, Bundle extras)` -> `void`

## `org.telegram.messenger.car.HomeScreen$TelegramConversationCallback`
- `onMarkAsRead()` -> `void`
- `onTextReply(@NonNull String text)` -> `void`

## `org.telegram.messenger.support.customtabs.CustomTabsCallback`
- `extraCallback(String callbackName, Bundle args)` -> `void`
- `onMessageChannelReady(Bundle extras)` -> `void`
- `onNavigationEvent(int navigationEvent, Bundle extras)` -> `void`
- `onPostMessage(String message, Bundle extras)` -> `void`

## `org.telegram.messenger.support.customtabs.CustomTabsSessionToken$DummyCallback`
- `asBinder()` -> `IBinder`
- `extraCallback(String callbackName, Bundle args)` -> `void`
- `onMessageChannelReady(Bundle extras)` -> `void`
- `onNavigationEvent(int navigationEvent, Bundle extras)` -> `void`
- `onPostMessage(String message, Bundle extras)` -> `void`

## `org.telegram.messenger.support.customtabs.ICustomTabsCallback$Stub`
- `asBinder()` -> `IBinder`
- `static asInterface(IBinder obj)` -> `ICustomTabsCallback`
- `onTransact(int code, Parcel data, Parcel reply, int flags)` -> `boolean`

## `org.telegram.messenger.support.customtabs.ICustomTabsCallback$Stub$Proxy`
- `asBinder()` -> `IBinder`
- `extraCallback(String callbackName, Bundle args)` -> `void`
- `getInterfaceDescriptor()` -> `String`
- `onMessageChannelReady(Bundle extras)` -> `void`
- `onNavigationEvent(int navigationEvent, Bundle extras)` -> `void`
- `onPostMessage(String message, Bundle extras)` -> `void`

## `org.telegram.messenger.support.fingerprint.FingerprintManagerCompat$AuthenticationCallback`
- `onAuthenticationError(int errMsgId, CharSequence errString)` -> `void`
- `onAuthenticationFailed()` -> `void`
- `onAuthenticationHelp(int helpMsgId, CharSequence helpString)` -> `void`
- `onAuthenticationSucceeded(AuthenticationResult result)` -> `void`

## `org.telegram.messenger.support.fingerprint.FingerprintManagerCompatApi23$AuthenticationCallback`
- `onAuthenticationError(int errMsgId, CharSequence errString)` -> `void`
- `onAuthenticationFailed()` -> `void`
- `onAuthenticationHelp(int helpMsgId, CharSequence helpString)` -> `void`
- `onAuthenticationSucceeded(AuthenticationResultInternal result)` -> `void`

## `org.telegram.messenger.voip.CallNotificationSoundProvider`
- `delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs)` -> `int`
- `getType(@NonNull Uri uri)` -> `String`
- `insert(@NonNull Uri uri, @Nullable ContentValues values)` -> `Uri`
- `onCreate()` -> `boolean`
- `openFile(@NonNull Uri uri, @NonNull String mode)` -> `ParcelFileDescriptor`
- `query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder)` -> `Cursor`
- `update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs)` -> `int`

## `org.telegram.messenger.voip.ConferenceCall`
- `applyUpdate(Integer requested_offset, TL_update.TL_updateGroupCallChainBlocks update, boolean allowForcePoll, Long requestTime)` -> `boolean`
- `destroy()` -> `void`
- `forcePoll()` -> `void`
- `generateAddSelfBlock()` -> `byte[]`
- `getBlockchainParticipants()` -> `HashSet<Long>`
- `getCallId()` -> `long`
- `getEmojis()` -> `String[]`
- `getLastBlock()` -> `byte[]`
- `getMyPublicKey()` -> `byte[]`
- `getShadyJoiningParticipants(final ArrayList<TLRPC.GroupCallParticipant> participants)` -> `HashSet<Long>`
- `getShadyLeftParticipants(final ArrayList<TLRPC.GroupCallParticipant> participants)` -> `HashSet<Long>`
- `getVerificationState()` -> `CallVerificationState`
- `getVerificationWords()` -> `CallVerificationWords`
- `gotCallId(long call_id)` -> `void`
- `joined()` -> `void`
- `kick(long userId)` -> `void`
- `requestLastBlock(Runnable done)` -> `void`
- `reset()` -> `void`
- `updateParticipants(ArrayList<TLRPC.GroupCallParticipant> participants, boolean forcePoll)` -> `void`

## `org.telegram.messenger.voip.ConferenceCall$CallParticipant`
- `toString()` -> `String`

## `org.telegram.messenger.voip.ConferenceCall$CallState`
- `find(long user_id)` -> `CallParticipant`
- `toString()` -> `String`

## `org.telegram.messenger.voip.ConferenceCall$CallVerificationState`
- `toString()` -> `String`

## `org.telegram.messenger.voip.ConferenceCall$CallVerificationWords`
- `toString()` -> `String`

## `org.telegram.messenger.voip.EncryptionKeyEmojifier`
- `static emojify(byte[] sha256)` -> `String[]`
- `static emojifyForCall(byte[] sha256)` -> `String[]`

## `org.telegram.messenger.voip.GroupCallMessage`
- `isOut()` -> `boolean`
- `isSendConfirmed()` -> `boolean`
- `isSendDelayed()` -> `boolean`
- `isSendError()` -> `boolean`
- `notifyStateUpdate()` -> `void`
- `setIsOut(boolean isOut)` -> `void`
- `setIsSendConfirmed(boolean isConfirmed)` -> `void`
- `setIsSendDelayed(boolean isDelayed)` -> `void`
- `setIsSendError(boolean isError)` -> `void`
- `subscribeToStateUpdates(Runnable listener)` -> `void`
- `unsubscribeFromStateUpdates(Runnable listener)` -> `void`

## `org.telegram.messenger.voip.GroupCallMessagesController`
- `getCallMessages(long callId)` -> `List<GroupCallMessage>`
- `static getInstance(int num)` -> `GroupCallMessagesController`
- `processUpdate(TL_update.TL_updateGroupCallMessage update)` -> `void`
- `processUpdate(TL_update.TL_updateGroupCallEncryptedMessage update)` -> `void`
- `sendCallMessage(long sendAsPeerId, TLRPC.TL_textWithEntities message, long callId, TLRPC.InputGroupCall inputGroupCall)` -> `boolean`
- `subscribeToCallMessages(long callId, CallMessageListener listener)` -> `void`
- `unsubscribeFromCallMessages(long callId, CallMessageListener listener)` -> `void`

## `org.telegram.messenger.voip.GroupCallMessagesController$MessagesList`
- `isEmpty()` -> `boolean`
- `pop()` -> `void`
- `push(GroupCallMessage message)` -> `boolean`

## `org.telegram.messenger.voip.Instance`
- `static destroyInstance()` -> `void`
- `static getConnectionMaxLayer()` -> `int`
- `static getGlobalServerConfig()` -> `ServerConfig`
- `static makeInstance(String version, Config config, String persistentStateFilePath, Endpoint[] endpoints, Proxy proxy, int networkType, EncryptionKey encryptionKey, VideoSink remoteSink, long videoCapturer, NativeInstance.AudioLevelsCallback audioLevelsCallback)` -> `NativeInstance`
- `static setBufferSize(int size)` -> `void`
- `static setGlobalServerConfig(String serverConfigJson)` -> `void`

## `org.telegram.messenger.voip.Instance$Candidate`
- `toString()` -> `String`

## `org.telegram.messenger.voip.Instance$Config`
- `toString()` -> `String`

## `org.telegram.messenger.voip.Instance$EncryptionKey`
- `toString()` -> `String`

## `org.telegram.messenger.voip.Instance$Endpoint`
- `toString()` -> `String`

## `org.telegram.messenger.voip.Instance$FinalState`
- `toString()` -> `String`

## `org.telegram.messenger.voip.Instance$Fingerprint`
- `toString()` -> `String`

## `org.telegram.messenger.voip.Instance$Proxy`
- `toString()` -> `String`

## `org.telegram.messenger.voip.Instance$ServerConfig`
- `getString(String key)` -> `String`
- `getString(String key, String fallback)` -> `String`

## `org.telegram.messenger.voip.Instance$TrafficStats`
- `toString()` -> `String`

## `org.telegram.messenger.voip.NativeInstance`
- `getPeerCapabilities()` -> `int`
- `isGroup()` -> `boolean`
- `static make(String version, Instance.Config config, String path, Instance.Endpoint[] endpoints, Instance.Proxy proxy, int networkType, Instance.EncryptionKey encryptionKey, VideoSink remoteSink, long videoCapturer, AudioLevelsCallback audioLevelsCallback)` -> `NativeInstance`
- `static makeGroup(String logPath, long videoCapturer, boolean screencast, boolean noiseSupression, PayloadCallback payloadCallback, AudioLevelsCallback audioLevelsCallback, VideoSourcesCallback unknownParticipantsCallback, RequestBroadcastPartCallback requestBroadcastPartCallback, RequestBroadcastPartCallback cancelRequestBroadcastPartCallback, RequestCurrentTimeCallback requestCurrentTimeCallback, boolean isConference)` -> `NativeInstance`
- `setOnRemoteMediaStateUpdatedListener(Instance.OnRemoteMediaStateUpdatedListener listener)` -> `void`
- `setOnSignalBarsUpdatedListener(Instance.OnSignalBarsUpdatedListener listener)` -> `void`
- `setOnSignalDataListener(Instance.OnSignalingDataListener listener)` -> `void`
- `setOnStateUpdatedListener(Instance.OnStateUpdatedListener listener)` -> `void`
- `stop()` -> `Instance.FinalState`
- `stopGroup()` -> `void`

## `org.telegram.messenger.voip.TelegramConnectionService`
- `onCreate()` -> `void`
- `onCreateIncomingConnection(PhoneAccountHandle connectionManagerPhoneAccount, ConnectionRequest request)` -> `Connection`
- `onCreateIncomingConnectionFailed(PhoneAccountHandle connectionManagerPhoneAccount, ConnectionRequest request)` -> `void`
- `onCreateOutgoingConnection(PhoneAccountHandle connectionManagerPhoneAccount, ConnectionRequest request)` -> `Connection`
- `onCreateOutgoingConnectionFailed(PhoneAccountHandle connectionManagerPhoneAccount, ConnectionRequest request)` -> `void`
- `onDestroy()` -> `void`

## `org.telegram.messenger.voip.VideoCapturerDevice`
- `static checkScreenCapturerSize()` -> `void`
- `static getEglBase()` -> `EglBase`
- `static getMediaProjection()` -> `MediaProjection`

## `org.telegram.messenger.voip.VoIPActionsReceiver`
- `onReceive(Context context, Intent intent)` -> `void`

## `org.telegram.messenger.voip.VoIPDebugToSend`
- `done(long callId, boolean need_debug)` -> `void`
- `push(long callId, long access_hash, Instance.FinalState state, String logPath)` -> `void`

## `org.telegram.messenger.voip.VoIPGroupNotification`
- `static answer(Context context, int account, int msg_id)` -> `void`
- `static decline(Context context, int account, int msg_id)` -> `void`
- `static hide(Context context)` -> `void`
- `static hide(Context context, int currentAccount, int msg_id)` -> `void`
- `static hideByCallId(Context context, int currentAccount, long call_id)` -> `void`
- `static open(Context context, int account, int msg_id)` -> `void`
- `static request(Context context, int account, long dialogId, String names, long call_id, int msg_id, boolean video)` -> `void`

## `org.telegram.messenger.voip.VoIPGroupNotification$State`
- `acceptIncomingCall()` -> `void`
- `declineIncomingCall()` -> `void`
- `destroy()` -> `void`
- `getCallState()` -> `int`
- `getGroupCall()` -> `TLRPC.GroupCall`
- `getGroupParticipants()` -> `ArrayList<TLRPC.GroupCallParticipant>`
- `getPrivateCall()` -> `TL_phone.PhoneCall`
- `getUser()` -> `TLRPC.User`
- `isCallingVideo()` -> `boolean`
- `isConference()` -> `boolean`
- `isOutgoing()` -> `boolean`
- `stopRinging()` -> `void`

## `org.telegram.messenger.voip.VoIPMediaButtonReceiver`
- `onReceive(Context context, Intent intent)` -> `void`

## `org.telegram.messenger.voip.VoIPPendingCall`
- `release()` -> `void`
- `static startOrSchedule(Activity activity, long userId, boolean video, AccountInstance accountInstance)` -> `VoIPPendingCall`

## `org.telegram.messenger.voip.VoIPPreNotificationService`
- `static answer(Context context)` -> `void`
- `static decline(Context context, int reason)` -> `void`
- `static dismiss(Context context, boolean answered)` -> `void`
- `static getState()` -> `State`
- `static isVideo()` -> `boolean`
- `static open(Context context)` -> `boolean`
- `static show(Context context, Intent intent, TL_phone.PhoneCall call)` -> `void`
- `static startRinging(Context context, int account, long user_id)` -> `void`
- `static stopRinging()` -> `void`

## `org.telegram.messenger.voip.VoIPPreNotificationService$State`
- `acceptIncomingCall()` -> `void`
- `declineIncomingCall()` -> `void`
- `destroy()` -> `void`
- `getCallState()` -> `int`
- `getGroupCall()` -> `TLRPC.GroupCall`
- `getGroupParticipants()` -> `ArrayList<TLRPC.GroupCallParticipant>`
- `getPrivateCall()` -> `TL_phone.PhoneCall`
- `getUser()` -> `TLRPC.User`
- `isCallingVideo()` -> `boolean`
- `isConference()` -> `boolean`
- `isOutgoing()` -> `boolean`
- `stopRinging()` -> `void`

## `org.telegram.messenger.voip.VoIPService`
- `acceptIncomingCall()` -> `void`
- `addRemoteSink(TLRPC.GroupCallParticipant participant, boolean screencast, VideoSink remote, VideoSink background)` -> `ProxyVideoSink`
- `callFailedFromConnectionService()` -> `void`
- `checkVideoFrame(TLRPC.GroupCallParticipant participant, boolean screencast)` -> `void`
- `clearCamera()` -> `void`
- `clearRemoteSinks()` -> `void`
- `static convertStreamToString(InputStream is)` -> `String`
- `convertToConferenceCall(boolean video, HashSet<Long> inviteUserIds)` -> `void`
- `createCaptureDevice(boolean screencast)` -> `void`
- `declineIncomingCall(int reason, final Runnable onDone)` -> `void`
- `declineIncomingCall()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `editCallMember(TLObject object, Boolean mute, Boolean muteVideo, Integer volume, Boolean raiseHand, Runnable onComplete)` -> `void`
- `forceRating()` -> `void`
- `getAccount()` -> `int`
- `getCallDuration()` -> `long`
- `getCallID()` -> `long`
- `getCallState()` -> `int`
- `getCallerId()` -> `long`
- `getChat()` -> `TLRPC.Chat`
- `getConnectionAndStartCall()` -> `CallConnection`
- `getCurrentAudioRoute()` -> `int`
- `getDebugString()` -> `String`
- `getEncryptionKey()` -> `byte[]`
- `getGA()` -> `byte[]`
- `getGroupCall()` -> `TLRPC.GroupCall`
- `getGroupCallBottomSheetLatch()` -> `CountDownLatch`
- `getGroupCallID()` -> `long`
- `getGroupCallPeer()` -> `TLRPC.InputPeer`
- `getGroupParticipants()` -> `ArrayList<TLRPC.GroupCallParticipant>`
- `getLastError()` -> `String`
- `getPrivateCall()` -> `TL_phone.PhoneCall`
- `getRemoteAudioState()` -> `int`
- `getRemoteVideoState()` -> `int`
- `static getRoundAvatarBitmap(Context context, int currentAccount, TLObject userOrChat)` -> `Bitmap`
- `getSelfId()` -> `long`
- `static getSharedInstance()` -> `VoIPService`
- `static getSharedState()` -> `VoIPServiceState`
- `static getStringFromFile(String filePath)` -> `String`
- `getTitle()` -> `String`
- `getUser()` -> `TLRPC.User`
- `getVideoState(boolean screencast)` -> `int`
- `handleNotificationAction(Intent intent)` -> `void`
- `hangUp(int discard, Runnable onDone)` -> `void`
- `hangUp()` -> `void`
- `hangUp(int discard)` -> `void`
- `hangUp(Runnable onDone)` -> `void`
- `hasEarpiece()` -> `boolean`
- `hasRate()` -> `boolean`
- `static hasRtmpStream()` -> `boolean`
- `hasVideoCapturer()` -> `boolean`
- `static isAnyKindOfCallActive()` -> `boolean`
- `isBluetoothHeadsetConnected()` -> `boolean`
- `isBluetoothOn()` -> `boolean`
- `isBluetoothWillOn()` -> `boolean`
- `isCallingVideo()` -> `boolean`
- `isConference()` -> `boolean`
- `isConverting()` -> `boolean`
- `isFrontFaceCamera()` -> `boolean`
- `isFullscreen(TLRPC.GroupCallParticipant participant, boolean screencast)` -> `boolean`
- `isHangingUp()` -> `boolean`
- `isHeadsetPlugged()` -> `boolean`
- `isJoined()` -> `boolean`
- `isMicMute()` -> `boolean`
- `isOutgoing()` -> `boolean`
- `isScreencast()` -> `boolean`
- `isSpeakerphoneOn()` -> `boolean`
- `isSwitchingCamera()` -> `boolean`
- `isSwitchingStream()` -> `boolean`
- `isVideoAvailable()` -> `boolean`
- `migrateToChat(TLRPC.Chat newChat)` -> `void`
- `mutedByAdmin()` -> `boolean`
- `onAccuracyChanged(Sensor sensor, int accuracy)` -> `void`
- `onAudioFocusChange(int focusChange)` -> `void`
- `onBind(Intent intent)` -> `IBinder`
- `onCallUpdated(TL_phone.PhoneCall phoneCall)` -> `void`
- `onCameraFirstFrameAvailable()` -> `void`
- `onConnectionStateChanged(int newState, boolean inTransition)` -> `void`
- `onCreate()` -> `void`
- `onDestroy()` -> `void`
- `onGroupCallParticipantsUpdate(TL_update.TL_updateGroupCallParticipants update)` -> `void`
- `onGroupCallUpdated(TLRPC.GroupCall call)` -> `void`
- `onMediaButtonEvent(KeyEvent ev)` -> `void`
- `onSensorChanged(SensorEvent event)` -> `void`
- `onSignalBarCountChanged(int newCount)` -> `void`
- `onSignalingData(TL_update.TL_updatePhoneCallSignalingData data)` -> `void`
- `onSignalingData(byte[] data)` -> `void`
- `onStartCommand(Intent intent, int flags, int startId)` -> `int`
- `playAllowTalkSound()` -> `void`
- `playConnectedSound()` -> `void`
- `playStartRecordSound()` -> `void`
- `processMessageUpdate(MessageObject messageObject)` -> `void`
- `registerStateListener(StateListener l)` -> `void`
- `removeRemoteSink(TLRPC.GroupCallParticipant participant, boolean presentation)` -> `void`
- `requestFullScreen(TLRPC.GroupCallParticipant participant, boolean full, boolean screencast)` -> `void`
- `requestVideoCall(boolean screencast)` -> `void`
- `sendCallRating(int rating)` -> `void`
- `setAudioOutput(int which)` -> `void`
- `setAudioRoute(int route)` -> `void`
- `setBackgroundSinks(VideoSink local, VideoSink remote)` -> `void`
- `setGroupCallHash(String hash)` -> `void`
- `setGroupCallPeer(TLRPC.InputPeer peer)` -> `void`
- `setLocalSink(VideoSink local, boolean screencast)` -> `void`
- `setMicMute(boolean mute, boolean hold, boolean send)` -> `void`
- `setNoiseSupressionEnabled(boolean enabled)` -> `void`
- `setParticipantVolume(TLRPC.GroupCallParticipant participant, int volume)` -> `void`
- `setParticipantsVolume()` -> `void`
- `setRemoteSink(VideoSink remote, boolean screencast)` -> `void`
- `setSinks(VideoSink local, VideoSink remote)` -> `void`
- `setSinks(VideoSink local, boolean screencast, VideoSink remote)` -> `void`
- `setSwitchingCamera(boolean switching, boolean isFrontFace)` -> `void`
- `setVideoState(boolean screencast, int state)` -> `void`
- `setupCaptureDevice(boolean screencast, boolean micEnabled)` -> `void`
- `startRingtoneAndVibration()` -> `void`
- `stopRinging()` -> `void`
- `stopScreenCapture()` -> `void`
- `swapSinks()` -> `void`
- `switchCamera()` -> `void`
- `switchToSpeaker()` -> `void`
- `toggleSpeakerphoneOrShowRouteSheet(Context context, boolean fromOverlayWindow)` -> `void`
- `toggleSpeakerphoneOrShowRouteSheet(Context context, boolean fromOverlayWindow, Integer selectedPos)` -> `void`
- `unregisterStateListener(StateListener l)` -> `void`
- `updateCurrentForegroundType()` -> `void`
- `updateOutputGainControlState()` -> `void`

## `org.telegram.messenger.voip.VoIPService$CallConnection`
- `onAnswer()` -> `void`
- `onCallAudioStateChanged(CallAudioState state)` -> `void`
- `onCallEvent(String event, Bundle extras)` -> `void`
- `onDisconnect()` -> `void`
- `onReject()` -> `void`
- `onShowIncomingCallUi()` -> `void`
- `onSilence()` -> `void`
- `onStateChanged(int state)` -> `void`

## `org.telegram.messenger.voip.VoIPService$ProxyVideoSink`
- `onFrame(VideoFrame frame)` -> `void`
- `removeBackground(VideoSink background)` -> `void`
- `removeTarget(VideoSink target)` -> `void`
- `setBackground(VideoSink newBackground)` -> `void`
- `setTarget(VideoSink newTarget)` -> `void`
- `swap()` -> `void`

## `org.telegram.messenger.voip.VoIPService$StateListener`
- `onAudioSettingsChanged()` -> `default void`
- `onCameraFirstFrameAvailable()` -> `default void`
- `onCameraSwitch(boolean isFrontFace)` -> `default void`
- `onMediaStateUpdated(int audioState, int videoState)` -> `default void`
- `onScreenOnChange(boolean screenOn)` -> `default void`
- `onSignalBarsCountChanged(int count)` -> `default void`
- `onStateChanged(int state)` -> `default void`
- `onVideoAvailableChange(boolean isAvailable)` -> `default void`

## `org.telegram.messenger.voip.VoIPServiceState`
- `getCallDuration()` -> `default long`

## `org.telegram.tgnet.ResultCallback`
- `onError(TLRPC.TL_error error)` -> `default void`
- `onError(Throwable throwable)` -> `default void`

## `org.telegram.tgnet.TLRPC$GroupCall`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `GroupCall`

## `org.telegram.tgnet.TLRPC$GroupCallMessage`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `GroupCallMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$GroupCallParticipant`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `GroupCallParticipant`

## `org.telegram.tgnet.TLRPC$InputGroupCall`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputGroupCall`

## `org.telegram.tgnet.TLRPC$PhoneCallDiscardReason`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PhoneCallDiscardReason`

## `org.telegram.tgnet.TLRPC$TL_auth_codeTypeCall`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_codeTypeFlashCall`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_codeTypeMissedCall`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_sentCodeTypeCall`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_sentCodeTypeFlashCall`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_sentCodeTypeMissedCall`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionDiscardGroupCall`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionStartGroupCall`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionToggleGroupCallSetting`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_groupCall`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_groupCallDiscarded`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_groupCallMessage`
- `static TLJsonDeserialize(TLJsonParser parser)` -> `TL_groupCallMessage`

## `org.telegram.tgnet.TLRPC$TL_groupCallParticipant`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_groupCallParticipantVideo`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_groupCallParticipantVideo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_groupCallParticipantVideoSourceGroup`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_groupCallParticipantVideoSourceGroup`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_groupCallParticipant_layer216`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_groupCall_layer201`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_groupCall_layer201_2`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_groupCall_layer216`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputGroupCall`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputGroupCallInviteMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputGroupCallSlug`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputGroupCallStream`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessagesFilterPhoneCalls`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPhoneCall`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inputPhoneCall`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyPhoneCall`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionConferenceCall`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionGroupCall`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionGroupCallScheduled`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionInviteToGroupCall`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionInviteToGroupCall_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionPhoneCall`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_botCallbackAnswer`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_botCallbackAnswer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_deletePhoneCallHistory`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getBotCallbackAnswer`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_botCallbackAnswer`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_setBotCallbackAnswer`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_phoneCallDiscardReasonBusy`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_phoneCallDiscardReasonDisconnect`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_phoneCallDiscardReasonHangup`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_phoneCallDiscardReasonMigrateConferenceCall`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_phoneCallDiscardReasonMissed`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyKeyPhoneCall`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_speakingInGroupCallAction`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_topPeerCategoryPhoneCalls`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_ephemeral$TL_getCallbackAnswer`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.TL_messages_botCallbackAnswer`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inlineButtonTypeCallback`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonCallback_layer117`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonCallback_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonCallback_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$PhoneCall`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PhoneCall`

## `org.telegram.tgnet.tl.TL_phone$PhoneCallProtocol`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PhoneCallProtocol`

## `org.telegram.tgnet.tl.TL_phone$TL_groupCallStreamChannel`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_groupCallStreamChannel`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$TL_phoneCall`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$TL_phoneCallAccepted`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$TL_phoneCallDiscarded`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$TL_phoneCallEmpty`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$TL_phoneCallProtocol`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$TL_phoneCallProtocol_layer110`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$TL_phoneCallWaiting`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$TL_phoneCall_layer176`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$TL_phone_phoneCall`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_phone_phoneCall`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$acceptCall`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$checkGroupCall`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$confirmCall`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$createConferenceCall`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$createGroupCall`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$declineConferenceCallInvite`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$deleteConferenceCallParticipants`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$deleteGroupCallMessages`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$deleteGroupCallParticipantMessages`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$discardCall`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$discardGroupCall`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$editGroupCallParticipant`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$editGroupCallTitle`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$exportGroupCallInvite`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$exportedGroupCallInvite`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `exportedGroupCallInvite`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$getCallConfig`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$getGroupCall`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$getGroupCallChainBlocks`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$getGroupCallJoinAs`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$getGroupCallStars`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `groupCallStars`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$getGroupCallStreamChannels`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$getGroupCallStreamRtmpUrl`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$groupCall`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `groupCall`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$groupCallDonor`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `groupCallDonor`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$groupCallStars`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `groupCallStars`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$groupCallStreamChannels`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `groupCallStreamChannels`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$groupCallStreamRtmpUrl`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `groupCallStreamRtmpUrl`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$inviteConferenceCallParticipant`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$inviteToGroupCall`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$joinGroupCall`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$joinGroupCallPresentation`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$leaveGroupCall`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$leaveGroupCallPresentation`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$phoneCallRequested`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$receivedCall`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$requestCall`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$saveCallDebug`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$saveCallLog`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$saveDefaultGroupCallJoinAs`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$sendConferenceCallBroadcast`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$sendGroupCallEncryptedMessage`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$sendGroupCallMessage`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$setCallRating`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$startScheduledGroupCall`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$toggleGroupCallRecord`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$toggleGroupCallSettings`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$toggleGroupCallStartSubscription`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateDeleteGroupCallMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateEphemeralBotCallbackQuery`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateGroupCall`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateGroupCallChainBlocks`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateGroupCallConnection`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateGroupCallEncryptedMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateGroupCallMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateGroupCallParticipants`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateGroupCall_layer216`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updatePhoneCall`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updatePhoneCallSignalingData`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.ui.CallLogActivity`
- `canParentTabsSlide(MotionEvent ev, boolean forward)` -> `boolean`

## `org.telegram.ui.CallLogActivity$EmptyTextProgressView`
- `hasOverlappingRendering()` -> `boolean`

## `org.telegram.ui.Cells.GroupCallInvitedCell`
- `hasAvatarSet()` -> `boolean`

## `org.telegram.ui.Cells.GroupCallUserCell`
- `hasAvatarSet()` -> `boolean`

## `org.telegram.ui.ChangeUsernameActivity$TouchHelperCallback`
- `isLongPressDragEnabled()` -> `boolean`

## `org.telegram.ui.ChatEditTypeActivity$UsernamesListView$TouchHelperCallback`
- `isLongPressDragEnabled()` -> `boolean`

## `org.telegram.ui.Components.FilterTabsView$TouchHelperCallback`
- `isLongPressDragEnabled()` -> `boolean`

## `org.telegram.ui.Components.GroupCallFullscreenAdapter$GroupCallUserCell`
- `hasImage()` -> `boolean`

## `org.telegram.ui.Components.GroupCallRecordAlert$Adapter`
- `isViewFromObject(View view, Object object)` -> `boolean`
- `saveState()` -> `Parcelable`

## `org.telegram.ui.Components.GroupVoipInviteAlert`
- `loadChatParticipants(int offset, int count, boolean reset)` -> `void`

## `org.telegram.ui.Components.JoinCallAlert`
- `canDismissWithSwipe()` -> `boolean`
- `static checkFewUsers(Context context, long did, AccountInstance accountInstance, MessagesStorage.BooleanCallback callback)` -> `void`
- `static processDeletedChat(int account, long did)` -> `void`

## `org.telegram.ui.Components.SearchDownloadsContainer$TouchHelperCallback`
- `isLongPressDragEnabled()` -> `boolean`

## `org.telegram.ui.Components.UniversalRecyclerView$TouchHelperCallback`
- `isLongPressDragEnabled()` -> `boolean`

## `org.telegram.ui.Components.conference.GroupCallActivityButtonsLayout`
- `addButton(VoIPToggleButton view)` -> `void`
- `removeButton(VoIPToggleButton view)` -> `void`

## `org.telegram.ui.Components.conference.GroupCallActivityButtonsLayout$ButtonHolder`
- `cancel()` -> `void`

## `org.telegram.ui.Components.voip.GroupCallMiniTextureView`
- `hasImage()` -> `boolean`
- `saveThumb()` -> `void`

## `org.telegram.ui.Components.voip.GroupCallRenderersContainer`
- `canHideUI()` -> `boolean`
- `requestFullscreen(ChatObject.VideoParticipant videoParticipant)` -> `void`

## `org.telegram.ui.Components.voip.GroupCallStatusIcon`
- `isMutedByAdmin()` -> `boolean`
- `isMutedByMe()` -> `boolean`
- `isSpeaking()` -> `boolean`

## `org.telegram.ui.Components.voip.PrivateVideoPreviewDialog$Adapter`
- `isViewFromObject(View view, Object object)` -> `boolean`
- `saveState()` -> `Parcelable`

## `org.telegram.ui.Components.voip.VoIPFloatingLayout`
- `saveRelativePosition()` -> `void`

## `org.telegram.ui.Components.voip.VoIPHelper`
- `static canRateCall(TLRPC.TL_messageActionPhoneCall call)` -> `boolean`
- `static sendCallRating(final long callID, final long accessHash, final int account, int rating)` -> `void`

## `org.telegram.ui.Components.voip.VoIPNotificationsLayout`
- `addNotification(int iconRes, String text, String tag, boolean animated)` -> `void`
- `removeNotification(String tag)` -> `void`

## `org.telegram.ui.Components.voip.VoIPTextureView`
- `cancelAnimation()` -> `void`
- `requestLayout()` -> `void`
- `saveCameraLastBitmap()` -> `void`

## `org.telegram.ui.Components.voip.VoIPWindowView`
- `requestFullscreen(boolean request)` -> `void`

## `org.telegram.ui.EditWidgetActivity$TouchHelperCallback`
- `isLongPressDragEnabled()` -> `boolean`

## `org.telegram.ui.FiltersSetupActivity$TouchHelperCallback`
- `isLongPressDragEnabled()` -> `boolean`

## `org.telegram.ui.GroupCallActivity`
- `canDismissWithSwipe()` -> `boolean`
- `canDismissWithTouchOutside()` -> `boolean`
- `canManageCall()` -> `boolean`

## `org.telegram.ui.GroupCallActivity$ListAdapter`
- `addSelfToCounter()` -> `boolean`

## `org.telegram.ui.PollCreateActivity$TouchHelperCallback`
- `isLongPressDragEnabled()` -> `boolean`

## `org.telegram.ui.StatisticActivity$DiffUtilsCallback`
- `saveOldState()` -> `void`

## `org.telegram.ui.TopicsFragment$TouchHelperCallback`
- `isLongPressDragEnabled()` -> `boolean`

## `org.telegram.ui.VoIPFragment`
- `onMediaStateUpdated(int audioState, int videoState)` -> `void`
