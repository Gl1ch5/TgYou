# function / notifications (160 методов)

## `org.telegram.messenger.AnimationNotificationsLocker`
- `disable()` -> `void`
- `lock()` -> `void`
- `unlock()` -> `void`

## `org.telegram.messenger.NotificationBadge`
- `static applyCount(int badgeCount)` -> `boolean`
- `static close(Cursor cursor)` -> `void`
- `static closeQuietly(Closeable closeable)` -> `void`

## `org.telegram.messenger.NotificationBadge$AdwHomeBadger`
- `executeBadge(int badgeCount)` -> `void`
- `getSupportLaunchers()` -> `List<String>`

## `org.telegram.messenger.NotificationBadge$ApexHomeBadger`
- `executeBadge(int badgeCount)` -> `void`
- `getSupportLaunchers()` -> `List<String>`

## `org.telegram.messenger.NotificationBadge$AsusHomeBadger`
- `executeBadge(int badgeCount)` -> `void`
- `getSupportLaunchers()` -> `List<String>`

## `org.telegram.messenger.NotificationBadge$DefaultBadger`
- `executeBadge(int badgeCount)` -> `void`
- `getSupportLaunchers()` -> `List<String>`

## `org.telegram.messenger.NotificationBadge$HuaweiHomeBadger`
- `executeBadge(int badgeCount)` -> `void`
- `getSupportLaunchers()` -> `List<String>`

## `org.telegram.messenger.NotificationBadge$NewHtcHomeBadger`
- `executeBadge(int badgeCount)` -> `void`
- `getSupportLaunchers()` -> `List<String>`

## `org.telegram.messenger.NotificationBadge$NovaHomeBadger`
- `executeBadge(int badgeCount)` -> `void`
- `getSupportLaunchers()` -> `List<String>`

## `org.telegram.messenger.NotificationBadge$OPPOHomeBader`
- `executeBadge(int badgeCount)` -> `void`
- `getSupportLaunchers()` -> `List<String>`

## `org.telegram.messenger.NotificationBadge$SamsungHomeBadger`
- `executeBadge(int badgeCount)` -> `void`
- `getSupportLaunchers()` -> `List<String>`

## `org.telegram.messenger.NotificationBadge$SonyHomeBadger`
- `executeBadge(int badgeCount)` -> `void`
- `getSupportLaunchers()` -> `List<String>`

## `org.telegram.messenger.NotificationBadge$VivoHomeBadger`
- `executeBadge(int badgeCount)` -> `void`
- `getSupportLaunchers()` -> `List<String>`

## `org.telegram.messenger.NotificationBadge$XiaomiHomeBadger`
- `executeBadge(int badgeCount)` -> `void`
- `getSupportLaunchers()` -> `List<String>`

## `org.telegram.messenger.NotificationBadge$ZukHomeBadger`
- `executeBadge(int badgeCount)` -> `void`
- `getSupportLaunchers()` -> `List<String>`

## `org.telegram.messenger.NotificationCenter`
- `addObserver(NotificationCenterDelegate observer, int id)` -> `void`
- `addPostponeNotificationsCallback(PostponeNotificationCallback callback)` -> `void`
- `createObserversGroup(NotificationCenterDelegate delegate)` -> `ObserversGroup`
- `createWeakObserversGroup(NotificationCenterDelegate delegate)` -> `ObserversGroup`
- `static diffObserverDumps(SparseArray<Integer> before, SparseArray<Integer> after)` -> `void`
- `doOnIdle(Runnable runnable)` -> `void`
- `dumpObservers()` -> `SparseArray<Integer>`
- `getCurrentHeavyOperationFlags()` -> `int`
- `static getGlobalInstance()` -> `NotificationCenter`
- `static getInstance(int num)` -> `NotificationCenter`
- `getObservers(int id)` -> `ArrayList<NotificationCenterDelegate>`
- `getObserversSize()` -> `int`
- `hasObservers(int id)` -> `boolean`
- `isAnimationInProgress()` -> `boolean`
- `listen(View view, final int id, final Utilities.Callback<Object[]> callback)` -> `Runnable`
- `static listenEmojiLoading(View view)` -> `void`
- `onAnimationFinish(int index)` -> `void`
- `postNotificationName(final int id, Object... args)` -> `void`
- `postNotificationNameInternal(int id, boolean allowDuringAnimation, Object... args)` -> `void`
- `postNotificationNameOnUIThread(final int id, final Object... args)` -> `void`
- `removeDelayed(Runnable runnable)` -> `void`
- `removeObserver(NotificationCenterDelegate observer, int id)` -> `void`
- `removePostponeNotificationsCallback(PostponeNotificationCallback callback)` -> `void`
- `runDelayedNotifications()` -> `void`
- `static sanitize()` -> `void`
- `setAnimationInProgress(int oldIndex, int[] allowedNotifications)` -> `int`
- `setAnimationInProgress(int oldIndex, int[] allowedNotifications, boolean stopHeavyOperations)` -> `int`
- `updateAllowedNotifications(int transitionAnimationIndex, int[] allowedNotifications)` -> `void`
- `updateObserver(boolean add, NotificationCenterDelegate observer, int id)` -> `void`

## `org.telegram.messenger.NotificationCenter$ObserversGroupImpl`
- `add(int id)` -> `ObserversGroup`
- `addGlobal(int id)` -> `ObserversGroup`
- `removeAllObservers()` -> `void`

## `org.telegram.messenger.NotificationCenter$UniqArrayList`
- `add(T t)` -> `boolean`
- `add(int index, T element)` -> `void`
- `addAll(@NonNull Collection<? extends T> c)` -> `boolean`
- `addAll(int index, @NonNull Collection<? extends T> c)` -> `boolean`
- `clear()` -> `void`
- `contains(@Nullable Object o)` -> `boolean`
- `remove(int index)` -> `T`
- `remove(@Nullable Object o)` -> `boolean`
- `removeAll(@NonNull Collection<?> c)` -> `boolean`

## `org.telegram.messenger.NotificationCenter$WeakObserversGroupImpl`
- `add(int id)` -> `ObserversGroup`
- `addGlobal(int id)` -> `ObserversGroup`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `removeAllObservers()` -> `void`

## `org.telegram.messenger.NotificationDismissReceiver`
- `onReceive(Context context, Intent intent)` -> `void`

## `org.telegram.messenger.NotificationImageProvider`
- `delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs)` -> `int`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static getAuthority()` -> `String`
- `getStreamTypes(@NonNull Uri uri, @NonNull String mimeTypeFilter)` -> `String[]`
- `getType(@NonNull Uri uri)` -> `String`
- `insert(@NonNull Uri uri, @Nullable ContentValues values)` -> `Uri`
- `onCreate()` -> `boolean`
- `openFile(@NonNull Uri uri, @NonNull String mode)` -> `ParcelFileDescriptor`
- `query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder)` -> `Cursor`
- `shutdown()` -> `void`
- `update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs)` -> `int`

## `org.telegram.messenger.NotificationRepeat`
- `onHandleIntent(Intent intent)` -> `void`

## `org.telegram.messenger.NotificationsController`
- `static checkOtherNotificationsChannel()` -> `void`
- `cleanup()` -> `void`
- `clearDialogNotificationsSettings(long did, long topicId)` -> `void`
- `deleteAllNotificationChannels()` -> `void`
- `deleteNotificationChannel(long dialogId, long topicId)` -> `void`
- `deleteNotificationChannel(long dialogId, long topicId, int what)` -> `void`
- `deleteNotificationChannelGlobal(int type)` -> `void`
- `deleteNotificationChannelGlobal(int type, int what)` -> `void`
- `deleteNotificationChannelGlobalInternal(int type, int what)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `ensureGroupsCreated()` -> `void`
- `forceShowPopupForReply()` -> `void`
- `static getGlobalNotificationsKey(int type)` -> `String`
- `static getInstance(int num)` -> `NotificationsController`
- `getNotificationsSettingsFacade()` -> `NotificationsSettingsFacade`
- `getPushMessagesSnapshot()` -> `ArrayList<MessageObject>`
- `static getSharedPrefKey(long dialog_id, long topicId)` -> `String`
- `static getSharedPrefKey(long dialog_id, long topicId, boolean backgroundThread)` -> `String`
- `getShortStringForMessage(MessageObject messageObject, String[] userName, boolean[] preview)` -> `String`
- `getTotalUnreadCount()` -> `int`
- `hasMessagesToReply()` -> `boolean`
- `hideNotifications()` -> `void`
- `isGlobalNotificationsEnabled(long dialogId, boolean isReaction, boolean isStoryReaction)` -> `boolean`
- `isGlobalNotificationsEnabled(long dialogId, Boolean forceChannel, boolean isReaction, boolean isStoryReaction)` -> `boolean`
- `isGlobalNotificationsEnabled(int type)` -> `boolean`
- `static loadRoundAvatar(long dialogId, File avatar, Person.Builder personBuilder)` -> `Person.Builder`
- `loadTopicsNotificationsExceptions(long dialogId, Consumer<HashSet<Integer>> consumer)` -> `void`
- `muteDialog(long dialog_id, long topicId, boolean mute)` -> `void`
- `muteUntil(long did, long topicId, int selectedTimeInSeconds)` -> `void`
- `playOutChatSound()` -> `void`
- `processDeleteStory(long dialogId, int storyId)` -> `void`
- `processDialogsUpdateRead(LongSparseIntArray dialogsToUpdate)` -> `void`
- `processEditedMessages(LongSparseArray<ArrayList<MessageObject>> editedMessages)` -> `void`
- `processIgnoreStories()` -> `void`
- `processIgnoreStories(long dialogId)` -> `void`
- `processIgnoreStoryReactions()` -> `void`
- `processLoadedUnreadMessages(LongSparseArray<Integer> dialogs, ArrayList<TLRPC.Message> messages, ArrayList<MessageObject> push, ArrayList<TLRPC.User> users, ArrayList<TLRPC.Chat> chats, ArrayList<TLRPC.EncryptedChat> encryptedChats, Collection<StoryNotification> storyPushes)` -> `void`
- `processNewMessages(ArrayList<MessageObject> messageObjects, boolean isLast, boolean isFcm, CountDownLatch countDownLatch)` -> `void`
- `processReadMessages(LongSparseIntArray inbox, long dialogId, int maxDate, int maxId, boolean isPopup)` -> `void`
- `processReadStories(long dialogId, int maxId)` -> `void`
- `processReadStories()` -> `void`
- `processSeenStoryReactions(long dialogId, int storyId)` -> `void`
- `removeDeletedHisoryFromNotifications(LongSparseIntArray deletedMessages)` -> `void`
- `removeDeletedMessagesFromNotifications(LongSparseArray<ArrayList<Integer>> deletedMessages, boolean isReactions)` -> `void`
- `removeNotificationsForDialog(long did)` -> `void`
- `repeatNotificationMaybe()` -> `void`
- `setDialogNotificationsSettings(long dialog_id, long topicId, int setting)` -> `void`
- `setGlobalNotificationsEnabled(int type, int time)` -> `void`
- `setInChatSoundEnabled(boolean value)` -> `void`
- `setLastOnlineFromOtherDevice(int time)` -> `void`
- `setOpenedDialogId(long dialog_id, long topicId)` -> `void`
- `setOpenedInBubble(long dialogId, boolean opened)` -> `void`
- `showNotifications()` -> `void`
- `showTonConnectNotification(String dapp, long time)` -> `void`
- `updateBadge()` -> `void`
- `updateServerNotificationsSettings(long dialog_id, long topicId)` -> `void`
- `updateServerNotificationsSettings(long dialogId, long topicId, boolean post)` -> `void`
- `updateServerNotificationsSettings(int type)` -> `void`

## `org.telegram.messenger.NotificationsController$NotificationHolder`
- `call()` -> `void`

## `org.telegram.messenger.NotificationsController$StoryNotification`
- `getLeastDate()` -> `long`

## `org.telegram.messenger.NotificationsDisabledReceiver`
- `onReceive(Context context, Intent intent)` -> `void`

## `org.telegram.messenger.NotificationsService`
- `onBind(Intent intent)` -> `IBinder`
- `onCreate()` -> `void`
- `onDestroy()` -> `void`
- `onStartCommand(Intent intent, int flags, int startId)` -> `int`

## `org.telegram.ui.Cells.NotificationsCheckCell`
- `processColor(int color)` -> `int`

## `org.telegram.ui.Components.ChatNotificationsPopupWrapper`
- `static addAsItemOptions(BaseFragment fragment, ItemOptions o, long dialogId, long topicId)` -> `ItemOptions`

## `org.telegram.ui.NotificationPermissionDialog`
- `static shouldAsk(Activity activity)` -> `boolean`

## `org.telegram.ui.PopupNotificationActivity`
- `checkTransitionAnimation()` -> `boolean`

## `org.telegram.ui.PopupNotificationActivity$FrameLayoutTouch`
- `requestDisallowInterceptTouchEvent(boolean disallowIntercept)` -> `void`
