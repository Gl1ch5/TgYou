# function / network (6363 методов)

## `org.telegram.messenger.MessagesController`
- `addDialogAction(long did, boolean clean)` -> `void`
- `addDialogToFolder(long dialogId, int folderId, int pinnedNum, long taskId)` -> `int`
- `addDialogToFolder(ArrayList<Long> dialogIds, int folderId, int pinnedNum, ArrayList<TLRPC.TL_inputFolderPeer> peers, long taskId)` -> `int`
- `addFilter(DialogFilter filter, boolean atBegin)` -> `void`
- `addOfferToSuggestedMessage(MessageObject msg, TLRPC.SuggestedPost suggestedPost)` -> `void`
- `addSupportUser()` -> `void`
- `addToPollsQueue(long dialogId, ArrayList<MessageObject> visibleObjects)` -> `void`
- `addToViewsQueue(MessageObject messageObject)` -> `void`
- `addUserToChat(long chatId, TLRPC.User user, int forwardCount, String botHash, BaseFragment fragment, Runnable onFinishRunnable)` -> `void`
- `addUserToChat(long chatId, TLRPC.User user, int forwardCount, String botHash, BaseFragment fragment, boolean ignoreIfAlreadyExists, Runnable onFinishRunnable, ErrorDelegate onError)` -> `void`
- `addUserToChat(long chatId, TLRPC.User user, int forwardCount, String botHash, BaseFragment fragment, boolean ignoreIfAlreadyExists, Runnable onFinishRunnable, ErrorDelegate onError, Utilities.Callback<TLRPC.TL_messages_invitedUsers> processInvitedUsers)` -> `void`
- `addUsersToChannel(long chatId, ArrayList<TLRPC.InputUser> users, BaseFragment fragment)` -> `void`
- `addUsersToChat(TLRPC.Chat currentChat, BaseFragment baseFragment, ArrayList<TLRPC.User> users, int fwdCount, Consumer<TLRPC.User> onAddUser, Consumer<TLRPC.User> onRestricted, Runnable onComplete)` -> `void`
- `addWebBrowserException(String url, boolean open_external_browser)` -> `void`
- `approveSuggestedMessage(long dialogId, int messageId, int scheduleDate)` -> `void`
- `blockPeer(long id)` -> `void`
- `buildCommunityPeers(long communityId)` -> `CommunityPeersDialog`
- `canAddToForward(TLRPC.Dialog d)` -> `boolean`
- `cancelLoadFullChat(long chatId)` -> `void`
- `cancelLoadFullUser(long userId)` -> `void`
- `cancelTyping(int action, long dialogId, long threadMsgId)` -> `void`
- `cancelUploadWallpaper()` -> `void`
- `changeChatAvatar(long chatId, TLRPC.TL_inputChatPhoto oldPhoto, TLRPC.InputFile inputPhoto, TLRPC.InputFile inputVideo, TLRPC.VideoSize emojiMarkup, double videoStartTimestamp, String videoPath, TLRPC.FileLocation smallSize, TLRPC.FileLocation bigSize, Runnable callback)` -> `void`
- `changeChatTitle(long chatId, String title)` -> `void`
- `changeChatTitle(long chatId, String title, Runnable callback)` -> `void`
- `checkArchiveFolder()` -> `void`
- `checkCanOpenChat(Bundle bundle, BaseFragment fragment)` -> `boolean`
- `checkCanOpenChat(Bundle bundle, BaseFragment fragment, MessageObject originalMessage)` -> `boolean`
- `checkCanOpenChat(Bundle bundle, BaseFragment fragment, MessageObject originalMessage, Browser.Progress progress)` -> `boolean`
- `checkChatInviter(long chatId, boolean _createMessage)` -> `void`
- `checkChatlistFolderUpdate(int filterId, boolean invalidate)` -> `void`
- `checkEmailSuggestion()` -> `int`
- `checkIfFolderEmpty(int folderId)` -> `void`
- `checkIsInChat(boolean tryCacheFirst, TLRPC.Chat chat, TLRPC.User user, IsInChatCheckedCallback callback)` -> `void`
- `checkLastDialogMessage(TLRPC.Dialog dialog, TLRPC.InputPeer peer, long taskId)` -> `void`
- `checkPeerColors(boolean force)` -> `void`
- `checkPromoInfo(final boolean reset)` -> `void`
- `checkSensitive(BaseFragment fragment, long did, Runnable done, Runnable canceled)` -> `void`
- `checkUnreadPollVotes(long dialogId, long topicId, SparseBooleanArray unreadPollVotes)` -> `void`
- `checkUnreadReactions(long dialogId, long topicId, SparseBooleanArray unreadReactions)` -> `void`
- `cleanup()` -> `void`
- `clearAllWebBrowserExceptions()` -> `void`
- `clearFullUsers()` -> `void`
- `clearQueryTime()` -> `void`
- `clearSendAsPeers()` -> `void`
- `completeDialogsReset(final TLRPC.messages_Dialogs dialogsRes, int messagesCount, int seq, int newPts, int date, int qts, LongSparseArray<TLRPC.Dialog> new_dialogs_dict, LongSparseArray<ArrayList<MessageObject>> new_dialogMessage, TLRPC.Message lastMessage)` -> `void`
- `convertToGigaGroup(final Context context, TLRPC.Chat chat, BaseFragment fragment, MessagesStorage.BooleanCallback convertRunnable)` -> `void`
- `convertToMegaGroup(Context context, long chatId, BaseFragment fragment, MessagesStorage.LongCallback convertRunnable)` -> `void`
- `convertToMegaGroup(Context context, long chatId, BaseFragment fragment, MessagesStorage.LongCallback convertRunnable, Runnable errorRunnable)` -> `void`
- `createChat(String title, ArrayList<Long> selectedContacts, String about, int type, boolean forImport, Location location, String locationAddress, int ttlPeriod, BaseFragment fragment)` -> `int`
- `createCommunity(String title, long dialogId, boolean hidden, Utilities.Callback2<TLRPC.Bool, TLRPC.TL_error> callback)` -> `int`
- `createDeleteShowOnceTask(long dialogId, int mid)` -> `long`
- `deleteAllReactionsFrom(long dialogId, long fromId)` -> `void`
- `deleteDialog(final long did, int onlyHistory)` -> `void`
- `deleteDialog(final long did, int onlyHistory, boolean revoke)` -> `void`
- `deleteDialog(long did, int first, int onlyHistory, int max_id, boolean revoke, TLRPC.InputPeer peer, long taskId)` -> `void`
- `deleteEphemeralMessage(long dialogId, int topicId, MessageObject ephemeralMessage)` -> `void`
- `deleteMessages(ArrayList<Integer> messages, ArrayList<Long> randoms, TLRPC.EncryptedChat encryptedChat, long dialogId, int topicId, boolean forAll, int mode)` -> `void`
- `deleteMessages(ArrayList<Integer> messages, ArrayList<Long> randoms, TLRPC.EncryptedChat encryptedChat, long dialogId, int topicId, boolean forAll, int mode, boolean cacheOnly)` -> `void`
- `deleteMessages(ArrayList<Integer> messages, ArrayList<Long> randoms, TLRPC.EncryptedChat encryptedChat, long dialogId, boolean forAll, int mode, boolean cacheOnly, long taskId, TLObject taskRequest, int topicId)` -> `void`
- `deleteMessages(ArrayList<Integer> messages, ArrayList<Long> randoms, TLRPC.EncryptedChat encryptedChat, long dialogId, boolean forAll, int mode, boolean cacheOnly, long taskId, TLObject taskRequest, int topicId, boolean movedToScheduled, int movedToScheduledMessageId)` -> `void`
- `deleteMessagesByPush(long dialogId, ArrayList<Integer> ids, long channelId)` -> `void`
- `deleteMessagesRange(long dialogId, long channelId, int minDate, int maxDate, boolean forAll, Runnable callback)` -> `void`
- `deleteParticipantFromChat(long chatId, TLRPC.User user)` -> `void`
- `deleteParticipantFromChat(long chatId, TLRPC.InputPeer peer)` -> `void`
- `deleteParticipantFromChat(long chatId, TLRPC.InputPeer peer, boolean forceDelete, boolean revoke)` -> `void`
- `deleteParticipantFromChat(long chatId, TLRPC.InputPeer peer, boolean forceDelete, boolean revoke, Runnable whenDone)` -> `void`
- `deleteParticipantFromChat(long chatId, TLRPC.User user, TLRPC.Chat chat, boolean forceDelete, boolean revoke)` -> `void`
- `deleteReactionsFromMessage(long dialogId, long fromId, int messageId)` -> `void`
- `deleteSavedDialog(long did)` -> `void`
- `deleteSavedDialog(long did, TLRPC.InputPeer monoForumPeer)` -> `void`
- `deleteSavedDialog(long did, int input_max_id, TLRPC.InputPeer monoForumPeer)` -> `void`
- `deleteUserChannelAllReactions(TLRPC.Chat currentChat, TLRPC.User fromUser, TLRPC.Chat fromChat)` -> `void`
- `deleteUserChannelHistory(TLRPC.Chat currentChat, TLRPC.User fromUser, TLRPC.Chat fromChat, int offset)` -> `void`
- `deleteUserPhoto(TLRPC.InputPhoto photo)` -> `void`
- `didAddedNewTask(int minDate, long dialogId, SparseArray<ArrayList<Integer>> mids)` -> `void`
- `didPressTranscribeButtonEnough()` -> `boolean`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `disableAds(boolean send)` -> `void`
- `doDeleteShowOnceTask(long taskId, long dialogId, int mid)` -> `void`
- `static emojiStatusCollectibleFromGift(TL_stars.TL_starGiftUnique gift)` -> `TLRPC.TL_emojiStatusCollectible`
- `ensureFolderDialogExists(int folderId, boolean[] folderCreated)` -> `TLRPC.TL_dialogFolder`
- `ensureMessagesLoaded(long dialogId, int messageId, MessagesLoadedCallback callback)` -> `Runnable`
- `static equals(TLRPC.MessageMedia a, TLRPC.MessageMedia b)` -> `boolean`
- `static extendChatsFromMessage(long dialogId, ArrayList<TLRPC.Chat> chats, ArrayList<TLRPC.Message> messages)` -> `void`
- `static extendUserChatFromMessage(long dialogId, TLObject userOrChat, ArrayList<TLRPC.Message> messages)` -> `void`
- `static extendUsersFromMessage(long dialogId, ArrayList<TLRPC.User> users, ArrayList<TLRPC.Message> messages)` -> `void`
- `fetchChatsToAddToCommunity(Utilities.Callback2<ArrayList<TLRPC.Chat>, TLRPC.TL_error> callback)` -> `int`
- `fetchCommunityJoinedChats(long communityId, long dialogId, Utilities.Callback2<TL_communities.ParticipantJoinedChats, TLRPC.TL_error> callback)` -> `int`
- `fetchCommunityPendingJoinRequests(long communityId, String nextOffset, Utilities.Callback2<TL_communities.PeerLinkRequests, TLRPC.TL_error> callback)` -> `void`
- `fetchJoinedCommunities(Utilities.Callback<ArrayList<TLRPC.Chat>> callback, int guid)` -> `void`
- `filterPremiumStickers(ArrayList<TLRPC.TL_messages_stickerSet> stickerSets)` -> `ArrayList<TLRPC.TL_messages_stickerSet>`
- `filterPremiumStickers(TLRPC.TL_messages_stickerSet stickerSet)` -> `TLRPC.TL_messages_stickerSet`
- `findCommunityLastMessage(long communityId)` -> `MessageObject`
- `static findUpdateFirst(TLRPC.Updates updates, Class<T> clazz)` -> `T`
- `static findUpdates(TLRPC.Updates updates, Class<T> clazz)` -> `ArrayList<T>`
- `static findUpdatesAndRemove(TLRPC.Updates updates, Class<T> clazz)` -> `ArrayList<T>`
- `forceNoReload(long dialogId, int mode)` -> `void`
- `forceResetDialogs()` -> `void`
- `generateJoinMessage(long chatId, boolean ignoreLeft)` -> `void`
- `getAboutLimit()` -> `int`
- `getActiveGroupCalls()` -> `ArrayList<Long>`
- `getAdminInChannel(long uid, long chatId)` -> `TLRPC.ChannelParticipant`
- `getAdminRank(long chatId, long uid)` -> `String`
- `getAllDialogs()` -> `ArrayList<TLRPC.Dialog>`
- `getAllFoldersDialogsCount()` -> `int`
- `getAvailableEffects()` -> `TLRPC.messages_AvailableEffects`
- `getBlockedPeers(boolean reset)` -> `void`
- `getBoostsController()` -> `ChannelBoostsController`
- `getCacheByChatsController()` -> `CacheByChatsController`
- `getCachedChannelRecommendations(long dialogId)` -> `ChannelRecommendations`
- `getCachedContactToken()` -> `TLRPC.TL_exportedContactToken`
- `getCaptionMaxLengthLimit()` -> `int`
- `getChannelDifference(long channelId, int newDialogType, long taskId, TLRPC.InputChannel inputChannel)` -> `void`
- `getChannelParticipant(TLRPC.Chat chat, TLRPC.User user, Utilities.Callback<TLRPC.ChannelParticipant> callback)` -> `void`
- `getChannelRecommendations(long dialogId)` -> `ChannelRecommendations`
- `getChat(Long id)` -> `TLRPC.Chat`
- `getChatAdminRightsCached(TLRPC.Chat chat, TLRPC.User user)` -> `TLRPC.TL_chatAdminRights`
- `getChatFull(long chatId)` -> `TLRPC.ChatFull`
- `getChatMaxUniqReactions(long dialogId)` -> `int`
- `getChatPendingRequestsOnClosed(long chatId)` -> `int`
- `getChatReactionsCount()` -> `int`
- `getChatlistFolderUpdates(int filterId)` -> `TL_chatlists.TL_chatlists_chatlistUpdates`
- `getChats()` -> `ConcurrentHashMap<Long, TLRPC.Chat>`
- `getCommonChats(long dialogId)` -> `CommonChatsList`
- `getCommonChats(long dialogId, boolean create)` -> `CommonChatsList`
- `getCommunityUnreadCount(long communityId)` -> `UnreadCounts`
- `getContentSettings()` -> `TL_account.contentSettings`
- `getContentSettings(Utilities.Callback<TL_account.contentSettings> whenReceived)` -> `void`
- `getDialog(long did)` -> `TLRPC.Dialog`
- `getDialogFilters()` -> `ArrayList<DialogFilter>`
- `getDialogPhotos(long dialogId)` -> `DialogPhotos`
- `getDialogUnreadCount(TLRPC.Dialog d)` -> `int`
- `getDialogs(int folderId)` -> `ArrayList<TLRPC.Dialog>`
- `getDialogsByCommunity(long communityId)` -> `ArrayList<TLRPC.Dialog>`
- `getDifference()` -> `void`
- `getDifference(int pts, int date, int qts, boolean slice)` -> `void`
- `getEffect(long id)` -> `TLRPC.TL_availableEffect`
- `getEffectDocument(long documentId)` -> `TLRPC.Document`
- `static getEmojiSettings(int account)` -> `SharedPreferences`
- `getEncryptedChat(Integer id)` -> `TLRPC.EncryptedChat`
- `getEncryptedChatDB(int chatId, boolean created)` -> `TLRPC.EncryptedChat`
- `getExportedInvite(long chatId)` -> `TLRPC.TL_chatInviteExported`
- `getFilterIdByDialogsType(int dialogsType)` -> `int`
- `getFirstWelcomeMessageText(long dialogId)` -> `String`
- `getForumLastTopicId(long chatId)` -> `long`
- `getFullName(long dialogId)` -> `String`
- `static getGlobalEmojiSettings()` -> `SharedPreferences`
- `static getGlobalMainSettings()` -> `SharedPreferences`
- `static getGlobalNotificationsSettings()` -> `SharedPreferences`
- `getGroupCall(long chatId, boolean load)` -> `ChatObject.Call`
- `getGroupCall(long chatId, boolean load, Runnable onLoad)` -> `ChatObject.Call`
- `static getInputChannel(TLRPC.Chat chat)` -> `TLRPC.InputChannel`
- `static getInputChannel(TLRPC.InputPeer peer)` -> `TLRPC.InputChannel`
- `getInputChannel(long chatId)` -> `TLRPC.InputChannel`
- `getInputDocument(TLRPC.Document document)` -> `TLRPC.InputDocument`
- `getInputPeer(TLRPC.Peer peer)` -> `TLRPC.InputPeer`
- `getInputPeer(long id)` -> `TLRPC.InputPeer`
- `static getInputPeer(TLRPC.Chat chat)` -> `TLRPC.InputPeer`
- `static getInputPeer(TLRPC.User user)` -> `TLRPC.InputPeer`
- `static getInputPeer(TLObject userOrChat)` -> `TLRPC.InputPeer`
- `getInputUser(TLRPC.User user)` -> `TLRPC.InputUser`
- `getInputUser(TLRPC.InputPeer peer)` -> `TLRPC.InputUser`
- `getInputUser(long userId)` -> `TLRPC.InputUser`
- `static getInputWallpaper(Theme.OverrideWallpaperInfo info)` -> `TLRPC.InputWallPaper`
- `static getInstance(int num)` -> `MessagesController`
- `getJoinedCommunities()` -> `ArrayList<TLRPC.Chat>`
- `getMainSettings()` -> `SharedPreferences`
- `static getMainSettings(int account)` -> `SharedPreferences`
- `getMaxMessageLength()` -> `int`
- `getMaxUserReactionsCount()` -> `int`
- `getMonoForumLinkedChat(long chatId)` -> `TLRPC.Chat`
- `getMutedString(long dialogId, long topicId)` -> `String`
- `getNewDeleteTask(LongSparseArray<ArrayList<Integer>> oldTask, LongSparseArray<ArrayList<Integer>> oldTaskMedia)` -> `void`
- `getNextPollVotesMention(long dialogId, long topicId, int count, Consumer<Integer> callback)` -> `void`
- `getNextReactionMention(long dialogId, long topicId, int count, Consumer<Integer> callback)` -> `void`
- `static getNotificationsSettings(int account)` -> `SharedPreferences`
- `getPaidReactionsDialogId()` -> `Long`
- `getParticipant(long chatId, long uid)` -> `TLObject`
- `getPeer(long id)` -> `TLRPC.Peer`
- `static getPeerFromInputPeer(TLRPC.InputPeer peer)` -> `TLRPC.Peer`
- `getPeerName(long dialogId)` -> `String`
- `getPeerName(long dialogId, boolean firstName)` -> `String`
- `getPeerSettings(long dialogId)` -> `TLRPC.PeerSettings`
- `getPrintingString(long dialogId, long threadId, boolean isDialog)` -> `CharSequence`
- `getPrintingStringType(long dialogId, long threadId)` -> `Integer`
- `getRestrictionReason(ArrayList<TLRPC.RestrictionReason> reasons)` -> `String`
- `getSavedMessagesController()` -> `SavedMessagesController`
- `getSavedMusicIds()` -> `SavedMusicIds`
- `getSavedReactionTags(long topic_id)` -> `TLRPC.TL_messages_savedReactionsTags`
- `getSavedReactionTags(long topic_id, boolean force)` -> `TLRPC.TL_messages_savedReactionsTags`
- `getSavedTagCount(long topic_id, ReactionsLayoutInBubble.VisibleReaction reaction)` -> `int`
- `getSavedTagName(ReactionsLayoutInBubble.VisibleReaction reaction)` -> `String`
- `getSavedTagName(TLRPC.Reaction reaction)` -> `String`
- `getSendAsPeers(long dialogId)` -> `TLRPC.TL_channels_sendAsPeers`
- `getSendAsPeers(long dialogId, boolean live_stories)` -> `TLRPC.TL_channels_sendAsPeers`
- `getSendAsSelectedPeer(long dialogId)` -> `TLRPC.Peer`
- `getSendPaidMessagesStars(long did)` -> `long`
- `getSponsoredMessages(long dialogId)` -> `SponsoredMessagesInfo`
- `getStoriesController()` -> `StoriesController`
- `getTonesController()` -> `AiTonesController`
- `getTopicsController()` -> `TopicsController`
- `getTotalDialogsCount()` -> `int`
- `getTranslateController()` -> `TranslateController`
- `getUnconfirmedAuthController()` -> `UnconfirmedAuthController`
- `static getUpdateChannelId(TLRPC.Update update)` -> `long`
- `getUpdatesStartTime(int type)` -> `long`
- `getUser(Long id)` -> `TLRPC.User`
- `getUser(String username)` -> `TLRPC.User`
- `getUserFull(long uid)` -> `TLRPC.UserFull`
- `getUserNameResolver()` -> `UserNameResolver`
- `getUserOrChat(long dialogId)` -> `TLObject`
- `getUserOrChat(String username)` -> `TLObject`
- `getUsers()` -> `ConcurrentHashMap<Long, TLRPC.User>`
- `static getWallpaperSetting(Theme.OverrideWallpaperInfo info)` -> `TLRPC.TL_wallPaperSettings`
- `getWebBrowserExceptionsList(boolean externalExceptions)` -> `List<TL_account.WebDomainException>`
- `giftAuctionUpdateWasRecently()` -> `boolean`
- `hasAvailableEffects()` -> `boolean`
- `hasHiddenArchive()` -> `boolean`
- `hasSetupEmailSuggestion()` -> `boolean`
- `hidePeerSettingsBar(final long dialogId, TLRPC.User currentUser, TLRPC.Chat currentChat)` -> `void`
- `hidePromoDialog()` -> `void`
- `incrementMoveCaptionHint()` -> `void`
- `installTheme(Theme.ThemeInfo themeInfo, Theme.ThemeAccent accent, boolean night)` -> `void`
- `isAdmin(long chatId, long uid)` -> `boolean`
- `isChannelAdminsLoaded(long chatId)` -> `boolean`
- `isChatNoForwards(TLRPC.Chat chat)` -> `boolean`
- `isChatNoForwards(long chatId)` -> `boolean`
- `isClearingDialog(long did)` -> `boolean`
- `isCommunity(long dialogId)` -> `boolean`
- `isDialogMuted(long dialogId, long topicId)` -> `boolean`
- `isDialogMuted(long dialogId, long topicId, TLRPC.Chat chat)` -> `boolean`
- `isDialogNotificationsSoundEnabled(long dialogId, long topicId)` -> `boolean`
- `isDialogVisible(long dialogId, boolean scheduled)` -> `boolean`
- `isDialogsEndReached(int folderId)` -> `boolean`
- `isForum(long dialogId)` -> `boolean`
- `isForum(MessageObject msg)` -> `boolean`
- `isForum(TLRPC.Message msg)` -> `boolean`
- `isFrozen()` -> `boolean`
- `isHiddenByUndo(long did)` -> `boolean`
- `isInChatCached(TLRPC.Chat chat, TLRPC.User user)` -> `boolean`
- `isJoiningChannel(long chatId)` -> `boolean`
- `isLoadingDialogs(int folderId)` -> `boolean`
- `isMonoForum(long dialogId)` -> `boolean`
- `isMonoForumWithManageRights(long dialogId)` -> `boolean`
- `isOwner(long chatId, long uid)` -> `boolean`
- `isPeerNoForwards(long dialogId)` -> `boolean`
- `isPremiumUser(TLRPC.User currentUser)` -> `boolean`
- `isPromoDialog(long did, boolean checkLeft)` -> `boolean`
- `isSendingSuggestedMessageApproval(long dialogId, int messageId, boolean isApprove)` -> `boolean`
- `isSensitive(ArrayList<TLRPC.RestrictionReason> reasons)` -> `boolean`
- `isServerDialogsEndReached(int folderId)` -> `boolean`
- `isSponsoredDisabled()` -> `boolean`
- `static isStoryQualityFull()` -> `boolean`
- `isStoryQualityFullOnAccount()` -> `boolean`
- `static isSupportUser(TLRPC.User user)` -> `boolean`
- `isTranslationsAutoEnabled()` -> `boolean`
- `isTranslationsManualEnabled()` -> `boolean`
- `isUserContactBlocked(long userId)` -> `TL_account.RequirementToContact`
- `isUserContactBlocked(long userId, boolean cache)` -> `TL_account.RequirementToContact`
- `isUserNoForwards(long userId)` -> `boolean`
- `isUserNoForwards(TLRPC.UserFull userFull)` -> `boolean`
- `isWebBrowserExceptionsLimitReached(boolean externalExceptions)` -> `boolean`
- `isWebBrowserInAppEnabled()` -> `boolean`
- `isWebBrowserOpenInApp(String url)` -> `boolean`
- `isWebBrowserUseCustomTabs()` -> `boolean`
- `linkCommunity(long dialogId, long communityId, boolean hidden, Utilities.Callback2<TLRPC.Bool, TLRPC.TL_error> callback)` -> `int`
- `loadAppConfig()` -> `void`
- `loadAppConfig(boolean force)` -> `void`
- `loadChannelAdmins(long chatId, boolean cache)` -> `void`
- `loadChannelParticipants(Long chatId)` -> `void`
- `loadChannelParticipants(Long chatId, Utilities.Callback<TLRPC.TL_channels_channelParticipants> whenDone, int count)` -> `void`
- `loadCurrentState()` -> `void`
- `loadDialogs(final int folderId, int offset, int count, boolean fromCache)` -> `void`
- `loadDialogs(final int folderId, int offset, int count, boolean fromCache, Runnable onEmptyCallback)` -> `void`
- `loadFilterPeers(HashMap<Long, TLRPC.InputPeer> dialogsToLoadMap, HashMap<Long, TLRPC.InputPeer> usersToLoadMap, HashMap<Long, TLRPC.InputPeer> chatsToLoadMap, TLRPC.messages_Dialogs pinnedDialogs, TLRPC.messages_Dialogs pinnedRemoteDialogs, ArrayList<TLRPC.User> users, ArrayList<TLRPC.Chat> chats, ArrayList<DialogFilter> filtersToSave, SparseArray<DialogFilter> filtersToDelete, ArrayList<Integer> filtersOrder, HashMap<Integer, HashSet<Long>> filterDialogRemovals, HashSet<Integer> filtersUnreadCounterReset, Runnable onDone)` -> `void`
- `loadFullChat(long chatId, int classGuid, boolean force)` -> `void`
- `loadFullUser(final TLRPC.User user, int classGuid, boolean force)` -> `void`
- `loadFullUser(final TLRPC.User user, int classGuid, boolean force, Utilities.Callback<TLRPC.UserFull> whenReceivedFullUser)` -> `void`
- `loadGlobalNotificationsSettings()` -> `void`
- `loadHintDialogs()` -> `void`
- `loadMessages(long dialogId, long mergeDialogId, boolean loadInfo, int count, int max_id, int offset_date, boolean fromCache, int midDate, int classGuid, int load_type, int last_message_id, int mode, long threadMessageId, int replyFirstUnread, int loadIndex, boolean isTopic)` -> `void`
- `loadMessages(long dialogId, long mergeDialogId, boolean loadInfo, int count, int max_id, int offset_date, boolean fromCache, int midDate, int classGuid, int load_type, int last_message_id, int mode, long threadMessageId, int loadIndex, int first_unread, int unread_count, int last_date, boolean queryFromServer, int mentionsCount, boolean isTopic)` -> `void`
- `loadPeerSettings(TLRPC.User currentUser, TLRPC.Chat currentChat)` -> `void`
- `loadPeerSettings(TLRPC.User currentUser, TLRPC.Chat currentChat, boolean force)` -> `void`
- `loadPinnedDialogs(final int folderId, long newDialogId, ArrayList<Long> order)` -> `void`
- `loadRemoteFilters(boolean force)` -> `void`
- `loadRemoteFilters(boolean force, Utilities.Callback<Boolean> whenDone)` -> `void`
- `loadSignUpNotificationsSettings()` -> `void`
- `loadStakeDiceInfo(Utilities.Callback<Boolean> isAvailable)` -> `void`
- `loadSuggestedFilters()` -> `void`
- `loadUnknownChannel(final TLRPC.Chat channel, long taskId)` -> `void`
- `loadUnknownDialog(final TLRPC.InputPeer peer, long taskId)` -> `void`
- `loadUnreadDialogs()` -> `void`
- `loadUserInfo(TLRPC.User user, boolean force, int classGuid)` -> `void`
- `loadUserInfo(TLRPC.User user, boolean force, int classGuid, int fromMessageId)` -> `void`
- `loadWebBrowserConfig()` -> `void`
- `loadWebBrowserConfig(boolean force)` -> `void`
- `lockFiltersInternal()` -> `void`
- `markAllTopicsAsRead(long did)` -> `void`
- `markDialogAsRead(long dialogId, int maxPositiveId, int maxNegativeId, int maxDate, boolean popup, long threadId, int countDiff, boolean readNow, int scheduledCount)` -> `void`
- `markDialogAsReadNow(long dialogId, long replyId)` -> `void`
- `markDialogAsUnread(long dialogId, TLRPC.InputPeer peer, long taskId)` -> `void`
- `markDialogMessageAsDeleted(long dialogId, ArrayList<Integer> messages)` -> `void`
- `markEmailSuggestionAsShown()` -> `void`
- `markMentionMessageAsRead(int mid, long channelId, long did)` -> `void`
- `markMentionsAsRead(long dialogId, long topicId)` -> `void`
- `markMessageAsRead(long dialogId, long randomId, int ttl)` -> `void`
- `markMessageAsRead2(long dialogId, int mid, TLRPC.InputChannel inputChannel, int ttl, long taskId)` -> `void`
- `markMessageAsRead2(long dialogId, int mid, TLRPC.InputChannel inputChannel, int ttl, long taskId, boolean createDeleteTask)` -> `void`
- `markMessageContentAsRead(MessageObject messageObject)` -> `void`
- `markPollVotesAsRead(long dialogId, long topicId)` -> `void`
- `markReactionsAsRead(long dialogId, long topicId)` -> `void`
- `markSponsoredAsRead(long dialog_id, MessageObject object)` -> `void`
- `matchesAdminRights(TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_chatAdminRights rights)` -> `boolean`
- `onFilterUpdate(DialogFilter filter)` -> `void`
- `onFolderEmpty(int folderId)` -> `void`
- `openApp(TLRPC.User bot, int classGuid)` -> `void`
- `openApp(BaseFragment _fragment, TLRPC.User bot, String param, int classGuid, Browser.Progress progress)` -> `void`
- `openApp(BaseFragment _fragment, TLRPC.User bot, String param, int classGuid, Browser.Progress progress, boolean botCompact, boolean botFullscreen)` -> `void`
- `openByUserName(String username, BaseFragment fragment, int type)` -> `void`
- `openByUserName(String username, BaseFragment fragment, int type, Browser.Progress progress)` -> `void`
- `openChatOrProfileWith(TLRPC.User user, TLRPC.Chat chat, BaseFragment fragment, int type, boolean closeLast)` -> `void`
- `performLogout(int type)` -> `void`
- `pinDialog(long dialogId, boolean pin, TLRPC.InputPeer peer, long taskId)` -> `boolean`
- `pinMessage(TLRPC.Chat chat, TLRPC.User user, int id, boolean unpin, boolean oneSide, boolean notify)` -> `void`
- `premiumFeaturesBlocked()` -> `boolean`
- `premiumPurchaseBlocked()` -> `boolean`
- `pressTranscribeButton()` -> `void`
- `processChatInfo(long chatId, TLRPC.ChatFull info, ArrayList<TLRPC.User> usersArr, ArrayList<TLRPC.Chat> chatsArr, boolean fromCache, boolean force, boolean byChannelUsers, ArrayList<Integer> pinnedMessages, HashMap<Integer, MessageObject> pinnedMessagesMap, int totalPinnedCount, boolean pinnedEndReached)` -> `void`
- `processDeletedReactionTags(TLRPC.Message message)` -> `boolean`
- `processDialogsUpdate(final TLRPC.messages_Dialogs dialogsRes, ArrayList<TLRPC.EncryptedChat> encChats, boolean fromCache)` -> `void`
- `processDialogsUpdateRead(final LongSparseIntArray dialogsToUpdate, LongSparseIntArray dialogsMentionsToUpdate)` -> `void`
- `processLoadedAdminsResponse(long chatId, TLRPC.TL_channels_channelParticipants participants)` -> `void`
- `processLoadedChannelAdmins(final LongSparseArray<TLRPC.ChannelParticipant> array, long chatId, boolean cache)` -> `void`
- `processLoadedDeleteTask(int taskTime, LongSparseArray<ArrayList<Integer>> task, LongSparseArray<ArrayList<Integer>> taskMedia)` -> `void`
- `processLoadedDialogFilters(ArrayList<DialogFilter> filters, TLRPC.messages_Dialogs pinnedDialogs, TLRPC.messages_Dialogs pinnedRemoteDialogs, ArrayList<TLRPC.User> users, ArrayList<TLRPC.Chat> chats, ArrayList<TLRPC.EncryptedChat> encryptedChats, int remote, Runnable onDone)` -> `void`
- `processLoadedDialogs(final TLRPC.messages_Dialogs dialogsRes, ArrayList<TLRPC.EncryptedChat> encChats, ArrayList<TLRPC.UserFull> fullUsers, int folderId, int offset, int count, int loadType, boolean resetEnd, boolean migrate, boolean fromCache)` -> `void`
- `processLoadedMessages(TLRPC.messages_Messages messagesRes, int resCount, long dialogId, long mergeDialogId, int count, int max_id, int offset_date, boolean isCache, int classGuid, int first_unread, int last_message_id, int unread_count, int last_date, int load_type, boolean isEnd, int mode, long threadMessageId, int loadIndex, boolean queryFromServer, int mentionsCount, boolean needProcess, boolean isTopic, Timer loaderLogger)` -> `void`
- `processNewChannelDifferenceParams(int pts, int pts_count, long channelId)` -> `void`
- `processNewDifferenceParams(int seq, int pts, int date, int pts_count)` -> `void`
- `processUpdateArray(ArrayList<TLRPC.Update> updates, ArrayList<TLRPC.User> usersArr, ArrayList<TLRPC.Chat> chatsArr, boolean fromGetDifference, int date)` -> `boolean`
- `processUpdates(final TLRPC.Updates updates, boolean fromQueue)` -> `void`
- `processUserInfo(TLRPC.User user, TLRPC.UserFull info, boolean fromCache, boolean force, int classGuid, ArrayList<Integer> pinnedMessages, HashMap<Integer, MessageObject> pinnedMessagesMap, int totalPinnedCount, boolean pinnedEndReached)` -> `void`
- `putAllNeededDraftDialogs()` -> `void`
- `putChat(final TLRPC.Chat chat, boolean fromCache)` -> `void`
- `putChatFull(TLRPC.ChatFull chatFull)` -> `void`
- `putChats(ArrayList<TLRPC.Chat> chats, boolean fromCache)` -> `void`
- `putDialogsEndReachedAfterRegistration()` -> `void`
- `putDraftDialogIfNeed(long dialogId, TLRPC.DraftMessage draftMessage)` -> `void`
- `putEncryptedChat(TLRPC.EncryptedChat encryptedChat, boolean fromCache)` -> `void`
- `putEncryptedChats(ArrayList<TLRPC.EncryptedChat> encryptedChats, boolean fromCache)` -> `void`
- `putGroupCall(long chatId, ChatObject.Call call)` -> `void`
- `putLastGiftAuctionUpdate()` -> `void`
- `putMonoForumLinkedChat(long chatId, long monoForumChatId)` -> `void`
- `putUser(TLRPC.User user, boolean fromCache)` -> `boolean`
- `putUser(TLRPC.User user, boolean fromCache, boolean force)` -> `boolean`
- `putUsers(ArrayList<TLRPC.User> users, boolean fromCache)` -> `void`
- `registerForPush(@PushListenerController.PushType int pushType, String regid)` -> `void`
- `rejectSuggestedMessage(long dialogId, int messageId, String reason)` -> `void`
- `reloadMentionsCountForChannel(TLRPC.InputPeer peer, long taskId)` -> `void`
- `reloadMentionsCountForChannels(final ArrayList<Long> arrayList)` -> `void`
- `reloadReactionsNotifySettings()` -> `void`
- `reloadUser(long userId)` -> `void`
- `reloadWebPages(final long dialogId, HashMap<String, ArrayList<MessageObject>> webpagesToReload, int mode)` -> `void`
- `removeDeletedMessagesFromArray(final long dialogId, ArrayList<TLRPC.Message> messages)` -> `void`
- `removeDialogAction(long did, boolean clean, boolean apply)` -> `void`
- `removeDraftDialogIfNeed(long dialogId)` -> `void`
- `removeFilter(DialogFilter filter)` -> `void`
- `removeFolderTemporarily(final int filterId, final ArrayList<Long> chats)` -> `Pair<Runnable, Runnable>`
- `removeSuggestion(long did, String suggestion)` -> `void`
- `removeWebBrowserException(String url)` -> `void`
- `renameSavedReactionTag(ReactionsLayoutInBubble.VisibleReaction reaction, String name)` -> `void`
- `reorderPinnedDialogs(int folderId, ArrayList<TLRPC.InputDialogPeer> order, long taskId)` -> `void`
- `reportMessageDelivery(long dialogId, int messageId, boolean push)` -> `void`
- `reportSpam(final long dialogId, TLRPC.User currentUser, TLRPC.Chat currentChat, TLRPC.EncryptedChat currentEncryptedChat, boolean geo)` -> `void`
- `requestContactToken(Utilities.Callback<TLRPC.TL_exportedContactToken> callback)` -> `void`
- `requestContactToken(long minDuration, Utilities.Callback<TLRPC.TL_exportedContactToken> callback)` -> `void`
- `resolveCommunityAllJoinPendingRequests(long communityId, boolean reject, Utilities.Callback2<TLRPC.Bool, TLRPC.TL_error> callback)` -> `int`
- `resolveCommunityJoinPendingRequest(long communityId, long dialogId, boolean reject, Utilities.Callback2<TLRPC.Bool, TLRPC.TL_error> callback)` -> `int`
- `revertWelcomeEphemeralMessage(MessageObject ephemeralMessage)` -> `void`
- `richEditorAllowed()` -> `boolean`
- `richEditorAvailable()` -> `boolean`
- `saveGif(Object parentObject, TLRPC.Document document)` -> `void`
- `saveRecentSticker(Object parentObject, TLRPC.Document document, boolean asMask)` -> `void`
- `saveTheme(Theme.ThemeInfo themeInfo, Theme.ThemeAccent accent, boolean night, boolean unsave)` -> `void`
- `saveThemeToServer(Theme.ThemeInfo themeInfo, Theme.ThemeAccent accent)` -> `void`
- `saveWallpaperToServer(File path, Theme.OverrideWallpaperInfo info, boolean install, long taskId)` -> `void`
- `selectDialogFilter(DialogFilter filter, int index)` -> `void`
- `sendBotStart(final TLRPC.User user, String botHash)` -> `void`
- `sendTyping(long dialogId, long threadMsgId, int action, int classGuid)` -> `boolean`
- `sendTyping(long dialogId, long threadMsgId, int action, String emojicon, int classGuid)` -> `boolean`
- `setBoostsToUnblockRestrictions(long chatId, int boosts)` -> `void`
- `setChannelSlowMode(long chatId, int seconds)` -> `void`
- `setChatPendingRequestsOnClose(long chatId, int count)` -> `void`
- `setChatReactions(long chatId, int type, List<String> reactions)` -> `void`
- `setContentSettings(boolean showSensitiveContent)` -> `void`
- `setCustomChatReactions(long chatId, int type, List<TLRPC.Reaction> reactions, int reactionsCount, Boolean allow_paid, Utilities.Callback<TLRPC.TL_error> onError, Runnable onSuccess)` -> `void`
- `setDefaultBannedRole(long chatId, TLRPC.TL_chatBannedRights rights, boolean isChannel, BaseFragment parentFragment)` -> `void`
- `setDefaultSendAs(long chatId, long newPeer)` -> `void`
- `setDialogHistoryTTL(long did, int ttl)` -> `void`
- `setDialogsInTransaction(boolean transaction)` -> `void`
- `setFolderTags(boolean value)` -> `void`
- `setForumLastTopicId(long chatId, long topicId)` -> `void`
- `setLastCreatedDialogId(final long dialogId, boolean scheduled, boolean set)` -> `void`
- `setLastVisibleDialogId(final long dialogId, boolean scheduled, boolean set)` -> `void`
- `setParticipantBannedRole(long chatId, TLRPC.User user, TLRPC.Chat chat, TLRPC.TL_chatBannedRights rights, boolean isChannel, BaseFragment parentFragment)` -> `void`
- `setParticipantBannedRole(long chatId, TLRPC.User user, TLRPC.Chat chat, TLRPC.TL_chatBannedRights rights, boolean isChannel, BaseFragment parentFragment, Runnable whenDone)` -> `void`
- `setReferer(String referer)` -> `void`
- `setSavedViewAs(boolean chats)` -> `void`
- `setStoryQuality(boolean full)` -> `void`
- `setUserAdminRole(long chatId, TLRPC.User user, TLRPC.TL_chatAdminRights rights, String rank, boolean isChannel, BaseFragment parentFragment, boolean addingNew, boolean forceAdmin, String botHash, Runnable onSuccess)` -> `void`
- `setUserAdminRole(long chatId, TLRPC.User user, TLRPC.TL_chatAdminRights rights, String rank, boolean isChannel, BaseFragment parentFragment, boolean addingNew, boolean forceAdmin, String botHash, Runnable onSuccess, ErrorDelegate onError)` -> `void`
- `shouldShowMoveCaptionHint()` -> `boolean`
- `static showCantOpenAlert(BaseFragment fragment, String reason)` -> `void`
- `showSensitiveContent()` -> `boolean`
- `sortDialogs(LongSparseArray<TLRPC.Chat> chatsDict)` -> `void`
- `sortDialogsList(ArrayList<TLRPC.Dialog> dialogs)` -> `void`
- `starsPurchaseAvailable()` -> `boolean`
- `startShortPoll(TLRPC.Chat chat, int guid, boolean stop)` -> `void`
- `startShortPoll(TLRPC.Chat chat, int guid, boolean stop, Consumer<Boolean> needPollConsumer)` -> `void`
- `storiesEnabled()` -> `boolean`
- `storyEntitiesAllowed()` -> `boolean`
- `storyEntitiesAllowed(TLRPC.User user)` -> `boolean`
- `static toInputDocument(TLRPC.Document document)` -> `TLRPC.InputDocument`
- `static toInputMedia(TLRPC.MessageMedia media)` -> `TLRPC.InputMedia`
- `toggleChannelForum(long chatId, boolean enabled, boolean tabsEnabled)` -> `void`
- `toggleChannelInvitesHistory(long chatId, boolean enabled)` -> `void`
- `toggleChannelSignatures(long chatId, boolean signaturesEnabled, boolean profilesEnabled)` -> `void`
- `toggleChatJoinRequest(long chatId, boolean enabled, Runnable onSuccess, Runnable onError)` -> `void`
- `toggleChatJoinRequest(long chatId, long guardBotId, boolean enabled, boolean applyToInvites, boolean applyGuardBot, Runnable onSuccess, Runnable onError)` -> `void`
- `toggleChatJoinToSend(long chatId, boolean enabled, Runnable onSuccess, Runnable onError)` -> `void`
- `toggleChatNoForwards(long dialogId, boolean enabled)` -> `void`
- `toggleChatNoForwards(long dialogId, int msgId, boolean enabled, Utilities.Callback2<Integer, TLRPC.TL_error> callback)` -> `void`
- `toggleCommunityCollapsedInDialogs(long communityId, boolean collapsed)` -> `int`
- `toggleCommunityParticipantBanned(long communityId, long dialogId, boolean banned, Utilities.Callback2<TLRPC.Bool, TLRPC.TL_error> callback)` -> `int`
- `toggleWebBrowserInAppEnabled()` -> `void`
- `toggleWebBrowserUseCustomTabs(boolean useCustomTabs)` -> `void`
- `unblockPeer(long id)` -> `void`
- `unblockPeer(long id, Runnable callback)` -> `void`
- `unlinkCommunity(long dialogId, long communityId, Utilities.Callback2<TLRPC.Bool, TLRPC.TL_error> callback)` -> `int`
- `unpinAllMessages(TLRPC.Chat chat, TLRPC.User user)` -> `void`
- `unregistedPush()` -> `void`
- `updateChannelUserName(BaseFragment fragment, long chatId, String userName, Runnable runnable, Runnable onError)` -> `void`
- `updateChatAbout(long chatId, String about, TLRPC.ChatFull info)` -> `void`
- `updateConfig(final TLRPC.TL_config config)` -> `void`
- `updateEmojiStatus(TLRPC.EmojiStatus newStatus)` -> `void`
- `updateEmojiStatus(TLRPC.EmojiStatus newStatus, TL_stars.StarGift gift)` -> `void`
- `updateEmojiStatus(long dialogId, TLRPC.EmojiStatus newStatus, TL_stars.StarGift gift)` -> `void`
- `updateEmojiStatusUntil()` -> `void`
- `updateEmojiStatusUntilUpdate(long dialogId, TLRPC.EmojiStatus status)` -> `void`
- `updateFilterDialogs(DialogFilter filter)` -> `void`
- `updateInterfaceWithMessages(long dialogId, ArrayList<MessageObject> messages, int mode)` -> `boolean`
- `updatePremium(boolean premium)` -> `void`
- `updateRank(long chatId, long uid, String rank)` -> `void`
- `updateSavedReactionTags(long topic_id, ReactionsLayoutInBubble.VisibleReaction reaction, boolean add, boolean update)` -> `boolean`
- `updateSavedReactionTags(HashSet<Long> topic_ids)` -> `void`
- `updateSavedReactionTags(long topic_id)` -> `void`
- `updateTimerProc()` -> `void`
- `updateTranscribeAudioTrialCooldownUntil(int until)` -> `void`
- `updateTranscribeAudioTrialCurrentNumber(int num)` -> `void`
- `updateUsernameActiveness(TLObject object, String username, boolean active)` -> `void`
- `uploadAndApplyUserAvatar(TLRPC.FileLocation location)` -> `void`

## `org.telegram.messenger.MessagesController$ChannelRecommendations`
- `static hasRecommendations(ChannelRecommendations rec)` -> `boolean`
- `static hasRecommendations(int currentAccount, long dialogId)` -> `boolean`

## `org.telegram.messenger.MessagesController$CommonChatsList`
- `cancel()` -> `void`
- `getCount()` -> `int`
- `load()` -> `void`

## `org.telegram.messenger.MessagesController$CommunityPeersDialog`
- `getDialogsCount()` -> `int`

## `org.telegram.messenger.MessagesController$DialogFilter`
- `alwaysShow(int currentAccount, TLRPC.Dialog dialog)` -> `boolean`
- `includesDialog(AccountInstance accountInstance, long dialogId)` -> `boolean`
- `includesDialog(AccountInstance accountInstance, long dialogId, TLRPC.Dialog d)` -> `boolean`
- `isChatlist()` -> `boolean`
- `isDefault()` -> `boolean`
- `isMyChatlist()` -> `boolean`

## `org.telegram.messenger.MessagesController$DialogPhotos`
- `addPhotoAtStart(TLRPC.Photo photo)` -> `void`
- `getCount()` -> `int`
- `load(int offset, int count)` -> `void`
- `loadAfter(int position, boolean after)` -> `void`
- `loadCache()` -> `void`
- `moveToStart(int index)` -> `void`
- `removePhoto(long photoId)` -> `void`
- `reset()` -> `void`

## `org.telegram.messenger.MessagesController$DiceFrameSuccess`
- `equals(Object obj)` -> `boolean`

## `org.telegram.messenger.MessagesController$EmojiSound`
- `equals(Object obj)` -> `boolean`

## `org.telegram.messenger.MessagesController$FaqSearchResult`
- `equals(Object obj)` -> `boolean`
- `toString()` -> `String`

## `org.telegram.messenger.MessagesController$SavedMusicIds`
- `load()` -> `void`
- `update(long doc_id, boolean saved)` -> `void`

## `org.telegram.messenger.MessagesController$SavedMusicList`
- `add(TLRPC.Document document)` -> `void`
- `getFirstDocument()` -> `TLRPC.Document`
- `load()` -> `void`
- `move(int fromPosition, int toPosition)` -> `void`
- `remove(MessageObject messageObject)` -> `void`
- `setup(TLRPC.Document document)` -> `void`
- `toMessageObject(TLRPC.Document document)` -> `MessageObject`
- `updateFirstMusic()` -> `void`

## `org.telegram.messenger.MessagesStorage`
- `static addLoadPeerInfo(TLRPC.Peer peer, ArrayList<Long> usersToLoad, ArrayList<Long> chatsToLoad)` -> `void`
- `addRecentLocalFile(String imageUrl, String localUrl, TLRPC.Document document)` -> `void`
- `static addReplyMessages(TLRPC.Message message, LongSparseArray<SparseArray<ArrayList<TLRPC.Message>>> replyMessageOwners, LongSparseArray<ArrayList<Integer>> dialogReplyMessagesIds)` -> `void`
- `static addUsersAndChatsFromMessage(TLRPC.Message message, ArrayList<Long> usersToLoad, ArrayList<Long> chatsToLoad, ArrayList<Long> emojiToLoad)` -> `void`
- `applyPhoneBookUpdates(String adds, String deletes)` -> `void`
- `cancelTasksForGuid(int guid)` -> `void`
- `checkIfFolderEmpty(int folderId)` -> `void`
- `checkLoadedRemoteFilters(ArrayList<TLRPC.DialogFilter> vector, Runnable onDone)` -> `void`
- `checkMessageByRandomId(long random_id)` -> `boolean`
- `checkMessageId(long dialogId, int mid)` -> `boolean`
- `checkSQLException(Throwable e)` -> `void`
- `cleanup(boolean isLogin)` -> `void`
- `clearDatabaseValues()` -> `void`
- `clearDownloadQueue(int type)` -> `void`
- `clearLocalDatabase()` -> `void`
- `clearSentMedia()` -> `void`
- `clearUserPhoto(long dialogId, long pid)` -> `void`
- `clearUserPhotos(long dialogId)` -> `void`
- `clearWidgetDialogs(int widgetId)` -> `void`
- `closeHolesInMedia(long did, int minId, int maxId, int type, long topicId)` -> `void`
- `completeTaskForGuid(Runnable runnable, int guid)` -> `void`
- `containsLocalDialog(long did)` -> `boolean`
- `static createFirstHoles(long did, SQLitePreparedStatement state5, SQLitePreparedStatement state6, int messageId, long topicId)` -> `void`
- `createLoadStoriesCursor(long dialogId, int albumId, int type)` -> `SQLiteCursor`
- `createPendingTask(NativeByteBuffer data)` -> `long`
- `static createTables(SQLiteDatabase database)` -> `void`
- `createTaskForMid(long dialogId, int messageId, int time, int readTime, int ttl, boolean inner)` -> `void`
- `createTaskForSecretChat(int chatId, int time, int readTime, int isOut, ArrayList<Long> random_ids)` -> `void`
- `deleteAllReactionsFromChat(long dialogId, long fromId, int msgId)` -> `void`
- `deleteAllStoryPushMessages()` -> `void`
- `deleteAllStoryReactionPushMessages()` -> `void`
- `deleteContacts(ArrayList<Long> uids)` -> `void`
- `deleteDialog(long did, int messagesOnly)` -> `void`
- `deleteDialogFilter(MessagesController.DialogFilter filter)` -> `void`
- `deleteEphemeralMessages(long dialogId, int messageId)` -> `void`
- `deleteEphemeralMessages(LongSparseArray<ArrayList<Integer>> messages, boolean withTransaction)` -> `void`
- `deletePushMessages(long dialogId, ArrayList<Integer> messages)` -> `void`
- `deleteSavedDialog(long did)` -> `void`
- `deleteStoryPushMessage(long dialogId)` -> `void`
- `deleteUserChatHistory(long dialogId, long fromId)` -> `void`
- `deleteWallpaper(long id)` -> `void`
- `doneHolesInMedia(long did, int max_id, int type, long thread_message_id)` -> `void`
- `emptyMessagesMedia(long dialogId, ArrayList<Integer> mids)` -> `void`
- `fixNotificationSettings()` -> `void`
- `fullReset()` -> `void`
- `getAnimatedEmoji(String join, ArrayList<TLRPC.Document> documents)` -> `void`
- `getArchiveUnreadCount()` -> `int`
- `getBotCache(String key, RequestDelegate requestDelegate)` -> `void`
- `getCachedMessagesInRange(long dialogId, int minDate, int maxDate)` -> `ArrayList<Integer>`
- `getCachedPhoneBook(boolean byError)` -> `void`
- `getChannelPtsSync(long channelId)` -> `int`
- `getChat(long chatId)` -> `TLRPC.Chat`
- `getChatSync(long chatId)` -> `TLRPC.Chat`
- `getChats(ArrayList<Long> dids)` -> `ArrayList<TLRPC.Chat>`
- `getChatsInternal(String chatsToLoad, ArrayList<TLRPC.Chat> result)` -> `void`
- `getChatsInternal(String chatsToLoad, ArrayList<TLRPC.Chat> result, boolean parseFullData)` -> `void`
- `getContacts()` -> `void`
- `getDatabase()` -> `SQLiteDatabase`
- `getDatabaseFiles()` -> `ArrayList<File>`
- `getDatabaseSize()` -> `long`
- `getDialogFolderId(long dialogId, IntCallback callback)` -> `void`
- `getDialogMaxMessageId(long dialog_id, IntCallback callback)` -> `void`
- `getDialogReadMax(boolean outbox, long dialog_id)` -> `int`
- `getDialogReadMaxSync(boolean outbox, long dialog_id)` -> `int`
- `getDialogs(int folderId, int offset, int count, boolean loadDraftsPeersAndFolders)` -> `void`
- `getDownloadQueue(int type)` -> `void`
- `getEncryptedChat(long chatId, CountDownLatch countDownLatch, ArrayList<TLObject> result)` -> `void`
- `getEncryptedChat(long chatId)` -> `TLRPC.EncryptedChat`
- `getEncryptedChatsInternal(String chatsToLoad, ArrayList<TLRPC.EncryptedChat> result, ArrayList<Long> usersToLoad)` -> `void`
- `getEphemeralMessages(long dialogId, long topicId, Utilities.Callback<ArrayList<TL_ephemeral.EphemeralMessage>> callback)` -> `void`
- `getEphemeralMessagesInternal(long dialogId, ArrayList<Integer> ids)` -> `ArrayList<TL_ephemeral.EphemeralMessage>`
- `getForumTypeFlags(long dialogId)` -> `int`
- `static getInstance(int num)` -> `MessagesStorage`
- `getLastDateValue()` -> `int`
- `getLastPtsValue()` -> `int`
- `getLastQtsValue()` -> `int`
- `getLastSecretVersion()` -> `int`
- `getLastSeqValue()` -> `int`
- `getMainUnreadCount()` -> `int`
- `getMessage(long dialogId, long msgId)` -> `TLRPC.Message`
- `getMessageMediaType(TLRPC.Message message)` -> `int`
- `getMessageWithCustomParamsOnlyInternal(int messageId, long dialogId)` -> `TLRPC.Message`
- `getMessages(long dialogId, long mergeDialogId, boolean loadInfo, int count, int max_id, int offset_date, int minDate, int classGuid, int load_type, int mode, long replyMessageId, int loadIndex, boolean processMessages, boolean isTopic, Timer loaderLogger)` -> `void`
- `getMessagesCount(long dialog_id, IntCallback callback)` -> `void`
- `getMessagesInternal(long dialogId, long mergeDialogId, int count, int max_id, int offset_date, int minDate, int classGuid, int load_type, int mode, long threadMessageId, int loadIndex, boolean processMessages, boolean isTopic, Timer loaderLogger)` -> `Runnable`
- `getNewTask(LongSparseArray<ArrayList<Integer>> oldTask, LongSparseArray<ArrayList<Integer>> oldTaskMedia)` -> `void`
- `getSavedDialogMaxMessageId(long dialog_id, IntCallback callback)` -> `void`
- `getSecretG()` -> `int`
- `getSecretPBytes()` -> `byte[]`
- `getSentFile(String path, int type)` -> `Object[]`
- `getSmallGroupsParticipantsCount()` -> `HashMap<Long, Integer>`
- `getStorageQueue()` -> `DispatchQueue`
- `getUnreadMention(long dialog_id, long topicId, IntCallback callback)` -> `void`
- `getUnsentMessages(int count)` -> `void`
- `getUser(long userId)` -> `TLRPC.User`
- `getUserSync(long userId)` -> `TLRPC.User`
- `getUsers(ArrayList<Long> uids)` -> `ArrayList<TLRPC.User>`
- `getUsersInternal(ArrayList<Long> userIds, ArrayList<TLRPC.User> result)` -> `void`
- `getUsersInternal(ArrayList<Long> userIds, ArrayList<TLRPC.User> result, boolean putUnknown)` -> `void`
- `getUsersInternal(HashSet<Long> userIds, ArrayList<TLRPC.User> result)` -> `void`
- `getWallpapers()` -> `void`
- `getWidgetDialogIds(int widgetId, int type, ArrayList<Long> dids, ArrayList<TLRPC.User> users, ArrayList<TLRPC.Chat> chats, boolean edit)` -> `void`
- `getWidgetDialogs(int widgetId, int type, ArrayList<Long> dids, LongSparseArray<TLRPC.Dialog> dialogs, LongSparseArray<TLRPC.Message> messages, ArrayList<TLRPC.User> users, ArrayList<TLRPC.Chat> chats)` -> `void`
- `hasAuthMessage(int date)` -> `boolean`
- `hasInviteMeMessage(long chatId)` -> `boolean`
- `isDatabaseMigrationInProgress()` -> `boolean`
- `isDialogHasTopMessage(long did, Runnable onDontExist)` -> `void`
- `isForum(long dialogId, int type)` -> `boolean`
- `isMigratedChat(long chatId)` -> `boolean`
- `isMonoForum(long dialogId)` -> `boolean`
- `static isValidKeyboardToSave(TLRPC.Message message)` -> `boolean`
- `loadChannelAdmins(long chatId)` -> `void`
- `loadChatInfo(long chatId, boolean isChannel, CountDownLatch countDownLatch, boolean force, boolean byChannelUsers)` -> `TLRPC.ChatFull`
- `loadChatInfo(long chatId, boolean isChannel, CountDownLatch countDownLatch, boolean force, boolean byChannelUsers, int fromMessageId)` -> `TLRPC.ChatFull`
- `loadChatInfoInQueue(long chatId, boolean isChannel, boolean force, boolean byChannelUsers, int fromMessageId)` -> `TLRPC.ChatFull`
- `loadGiftChatTheme(Utilities.Callback<List<TLRPC.TL_chatThemeUniqueGift>> callback)` -> `void`
- `loadGroupedMessagesForTopicUpdates(ArrayList<TopicsController.TopicUpdate> topics)` -> `void`
- `loadGroupedMessagesForTopics(long dialogId, ArrayList<TLRPC.TL_forumTopic> topics)` -> `void`
- `loadMessageAttachPaths(ArrayList<MessageObject> messageObjects, Runnable done)` -> `void`
- `loadReplyMessages(LongSparseArray<SparseArray<ArrayList<TLRPC.Message>>> replyMessageOwners, LongSparseArray<ArrayList<Integer>> dialogReplyMessagesIds, ArrayList<Long> usersToLoad, ArrayList<Long> chatsToLoad, int mode)` -> `void`
- `loadStoryAlbumsCache(long dialogId, Consumer<List<StoriesController.StoryAlbum>> callback)` -> `void`
- `loadTopics(long dialogId, Consumer<ArrayList<TLRPC.TL_forumTopic>> callback)` -> `void`
- `loadUnreadMessages()` -> `void`
- `loadUserInfo(TLRPC.User user, boolean force, int classGuid, int fromMessageId)` -> `void`
- `loadUserInfos(HashSet<Long> uids)` -> `ArrayList<TLRPC.UserFull>`
- `localSearch(int dialogsType, String query, ArrayList<Object> resultArray, ArrayList<CharSequence> resultArrayNames, ArrayList<TLRPC.User> encUsers, ArrayList<Long> onlyDialogIds, int folderId)` -> `void`
- `markMentionMessageAsRead(long dialogId, int messageId, long did)` -> `void`
- `markMessageAsMention(long dialogId, int mid)` -> `void`
- `markMessageAsSendError(TLRPC.Message message, int _mode)` -> `void`
- `markMessageAsSendErrorWithParams(TLRPC.Message msg, long errorAllowedPriceStars, long errorNewPriceStars)` -> `void`
- `markMessagePollVotesAsRead(long dialogId, long topicId, int messageId)` -> `void`
- `markMessageReactionsAsRead(long dialogId, long topicId, int messageId)` -> `void`
- `markMessagesAsDeleted(long dialogId, ArrayList<Integer> messages, boolean useQueue, boolean deleteFiles, int mode, int topicId)` -> `ArrayList<Long>`
- `markMessagesAsDeleted(long channelId, int mid, boolean useQueue, boolean deleteFiles)` -> `ArrayList<Long>`
- `markMessagesAsDeletedByRandoms(ArrayList<Long> messages)` -> `void`
- `markMessagesAsRead(LongSparseIntArray inbox, LongSparseIntArray outbox, SparseIntArray encryptedMessages, boolean useQueue)` -> `void`
- `markMessagesContentAsRead(long dialogId, ArrayList<Integer> mids, int currentDate, int readDate)` -> `void`
- `markVoiceMessageContentAsRead(long dialogId, ArrayList<Integer> mids)` -> `void`
- `onDeleteQueryComplete(long did)` -> `void`
- `openDatabase(int openTries)` -> `void`
- `overwriteChannel(long channelId, TLRPC.TL_updates_channelDifferenceTooLong difference, int newDialogType, Runnable onDone)` -> `void`
- `processAnchoredEphemeralMessages(ArrayList<TL_ephemeral.EphemeralMessage> messages, Runnable callback)` -> `void`
- `processEphemeralEditedMessages(ArrayList<TL_ephemeral.EphemeralMessage> messages, Runnable callback)` -> `void`
- `processEphemeralMessages(ArrayList<TL_ephemeral.EphemeralMessage> messages, Runnable callback)` -> `void`
- `processLoadedFilterPeers(TLRPC.messages_Dialogs pinnedDialogs, TLRPC.messages_Dialogs pinnedRemoteDialogs, ArrayList<TLRPC.User> users, ArrayList<TLRPC.Chat> chats, ArrayList<MessagesController.DialogFilter> filtersToSave, SparseArray<MessagesController.DialogFilter> filtersToDelete, ArrayList<Integer> filtersOrder, HashMap<Integer, HashSet<Long>> filterDialogRemovals, HashSet<Integer> filtersUnreadCounterReset, Runnable onDone)` -> `void`
- `processPendingRead(long dialogId, int maxPositiveId, int maxNegativeId, int scheduledCount)` -> `void`
- `putCachedPhoneBook(HashMap<String, ContactsController.Contact> contactHashMap, boolean migrate, boolean delete)` -> `void`
- `putChannelAdmins(long chatId, LongSparseArray<TLRPC.ChannelParticipant> ids)` -> `void`
- `putChannelViews(LongSparseArray<SparseIntArray> channelViews, LongSparseArray<SparseIntArray> channelForwards, LongSparseArray<SparseArray<TLRPC.MessageReplies>> channelReplies, boolean addReply)` -> `void`
- `putContacts(ArrayList<TLRPC.TL_contact> contacts, boolean deleteAll)` -> `void`
- `putDialogs(TLRPC.messages_Dialogs dialogs, int check)` -> `void`
- `putEncryptedChat(TLRPC.EncryptedChat chat, TLRPC.User user, TLRPC.Dialog dialog)` -> `void`
- `putEphemeralMessages(ArrayList<TL_ephemeral.EphemeralMessage> messages, boolean withTransaction)` -> `void`
- `putGiftChatTheme(TLRPC.ChatTheme theme)` -> `void`
- `putGiftChatThemes(List<TLRPC.ChatTheme> themes)` -> `void`
- `putMessages(ArrayList<TLRPC.Message> messages, boolean withTransaction, boolean useQueue, boolean doNotUpdateDialogDate, int downloadMask, int mode, long threadMessageId)` -> `void`
- `putMessages(ArrayList<TLRPC.Message> messages, boolean withTransaction, boolean useQueue, boolean doNotUpdateDialogDate, int downloadMask, boolean ifNoLastMessage, int mode, long threadMessageId)` -> `void`
- `putMessages(TLRPC.messages_Messages messages, long dialogId, int load_type, int max_id, boolean createDialog, int mode, long threadMessageId)` -> `void`
- `putPushMessage(MessageObject message)` -> `void`
- `putSentFile(String path, TLObject file, int type, String parent)` -> `void`
- `putStoryPushMessage(NotificationsController.StoryNotification push)` -> `void`
- `putUsersAndChats(List<TLRPC.User> users, List<TLRPC.Chat> chats, boolean withTransaction, boolean useQueue)` -> `void`
- `putWallpapers(ArrayList<TLRPC.WallPaper> wallPapers, int action)` -> `void`
- `putWebPages(LongSparseArray<TLRPC.WebPage> webPages)` -> `void`
- `putWidgetDialogs(int widgetId, ArrayList<TopicKey> dids)` -> `void`
- `readAllDialogs(int folderId)` -> `void`
- `removeAllTopics(long dialogId)` -> `void`
- `removeFromDownloadQueue(long id, int type, boolean move)` -> `void`
- `removePendingTask(long id)` -> `void`
- `removeTopic(long dialogId, long topicId)` -> `void`
- `removeTopics(long dialogId, ArrayList<Long> topicIds)` -> `void`
- `replaceMessageIfExists(TLRPC.Message message, ArrayList<TLRPC.User> users, ArrayList<TLRPC.Chat> chats, boolean broadcast)` -> `void`
- `reset()` -> `void`
- `resetAllUnreadCounters(boolean muted)` -> `void`
- `resetDialogs(TLRPC.messages_Dialogs dialogsRes, int messagesCount, int seq, int newPts, int date, int qts, LongSparseArray<TLRPC.Dialog> new_dialogs_dict, LongSparseArray<ArrayList<MessageObject>> new_dialogMessage, TLRPC.Message lastMessage, int dialogsCount)` -> `void`
- `resetMentionsCount(long did, long topicId, int count)` -> `void`
- `saveBotCache(String key, TLObject result)` -> `void`
- `saveChannelPts(long channelId, int pts)` -> `void`
- `saveChatInviter(long chatId, long inviterId)` -> `void`
- `saveChatLinksCount(long chatId, int linksCount)` -> `void`
- `saveDialogFilter(MessagesController.DialogFilter filter, boolean atBegin, boolean peers)` -> `void`
- `saveDialogFiltersOrder()` -> `void`
- `saveDialogFiltersOrderInternal()` -> `void`
- `saveDiffParams(int seq, int pts, int date, int qts)` -> `void`
- `saveSecretParams(int lsv, int sg, byte[] pbytes)` -> `void`
- `saveStoryAlbumsCache(long dialog_id, List<StoriesController.StoryAlbum> albums)` -> `void`
- `saveTopics(long dialogId, List<TLRPC.TL_forumTopic> topics, boolean replace, boolean useQueue, int date)` -> `void`
- `searchSavedByTag(TLRPC.Reaction tag, long topic_id, String query, int limit, int offset, Utilities.Callback4<ArrayList<MessageObject>, ArrayList<TLRPC.User>, ArrayList<TLRPC.Chat>, ArrayList<TLRPC.Document>> done, boolean includeGroups)` -> `void`
- `setDialogFlags(long did, long flags)` -> `void`
- `setDialogPinned(long did, int pinned)` -> `void`
- `setDialogTtl(long did, int ttl)` -> `void`
- `setDialogUnread(long did, boolean unread)` -> `void`
- `setDialogViewThreadAsMessages(long did, boolean enabled)` -> `void`
- `setDialogsFolderId(ArrayList<TLRPC.TL_folderPeer> peers, ArrayList<TLRPC.TL_inputFolderPeer> inputPeers, long dialogId, int folderId)` -> `void`
- `setDialogsPinned(ArrayList<Long> dids, ArrayList<Integer> pinned)` -> `void`
- `setLastDateValue(int value)` -> `void`
- `setLastPtsValue(int value)` -> `void`
- `setLastQtsValue(int value)` -> `void`
- `setLastSecretVersion(int value)` -> `void`
- `setLastSeqValue(int value)` -> `void`
- `setMessageSeq(int mid, int seq_in, int seq_out)` -> `void`
- `setSecretG(int value)` -> `void`
- `setSecretPBytes(byte[] value)` -> `void`
- `toggleTodo(long dialogId, int messageId, int taskId, boolean enable, long send_as)` -> `void`
- `unpinAllDialogsExceptNew(ArrayList<Long> dids, int folderId)` -> `void`
- `updateChannelUsers(long channelId, ArrayList<TLRPC.ChannelParticipant> participants)` -> `void`
- `updateChatDefaultBannedRights(long chatId, TLRPC.TL_chatBannedRights rights, int version)` -> `void`
- `updateChatInfo(TLRPC.ChatFull info, boolean ifExist)` -> `void`
- `updateChatInfo(long chatId, long userId, int what, long invited_id, int version)` -> `void`
- `updateChatOnlineCount(long channelId, int onlineCount)` -> `void`
- `updateChatParticipants(TLRPC.ChatParticipants participants)` -> `void`
- `updateDialogData(TLRPC.Dialog dialog)` -> `void`
- `updateDialogUnreadPollVotes(long dialogId, long topicId, int newUnreadCount, boolean increment)` -> `void`
- `updateDialogUnreadReactions(long dialogId, long topicId, int newUnreadCount, boolean increment)` -> `void`
- `updateDialogsWithDeletedMessages(long dialogId, long channelId, ArrayList<Integer> messages, ArrayList<Long> additionalDialogsToUpdate)` -> `void`
- `updateDialogsWithReadMessages(LongSparseIntArray inbox, LongSparseIntArray outbox, LongSparseArray<ArrayList<Integer>> mentions, LongSparseIntArray stillUnread, boolean useQueue)` -> `void`
- `updateEncryptedChat(TLRPC.EncryptedChat chat)` -> `void`
- `updateEncryptedChatLayer(TLRPC.EncryptedChat chat)` -> `void`
- `updateEncryptedChatSeq(TLRPC.EncryptedChat chat, boolean cleanup)` -> `void`
- `updateEncryptedChatTTL(TLRPC.EncryptedChat chat)` -> `void`
- `updateMessageCustomParams(long dialogId, TLRPC.Message saveFromMessage)` -> `void`
- `updateMessagePollResults(long pollId, TLRPC.Poll poll, TLRPC.PollResults results)` -> `void`
- `updateMessageReactions(long dialogId, int msgId, TLRPC.TL_messageReactions reactions)` -> `void`
- `updateMessageStateAndId(long random_id, long dialogId, Integer _oldId, int newId, int date, boolean useQueue, int scheduled, int topicId)` -> `long[]`
- `updateMessageTopicId(long dialogId, long messageId, int newTopicId)` -> `void`
- `updateMessageVerifyFlags(ArrayList<TLRPC.Message> messages)` -> `void`
- `updateMessageVoiceTranscription(long dialogId, int messageId, String text, long transcriptionId, boolean isFinal)` -> `void`
- `updateMessageVoiceTranscription(long dialogId, int messageId, String text, TLRPC.Message saveFromMessage)` -> `void`
- `updateMessageVoiceTranscriptionOpen(long dialogId, int msgId, TLRPC.Message saveFromMessage)` -> `void`
- `updateMutedDialogsFiltersCounters()` -> `void`
- `updatePinnedMessages(long dialogId, ArrayList<Integer> ids, boolean pin, int totalCount, int maxId, boolean end, HashMap<Integer, MessageObject> messages)` -> `void`
- `updateRanksInLastMessages(long dialogId, long userId, String rank)` -> `void`
- `updateRepliesCount(long chatId, int mid, ArrayList<TLRPC.Peer> repliers, int maxId, int count)` -> `void`
- `updateRepliesMaxReadId(long chatId, long mid, int readMaxId, int unreadCount, boolean useQueue)` -> `void`
- `updateTopicData(long dialogId, TLRPC.TL_forumTopic fromTopic, int flags)` -> `void`
- `updateTopicData(long dialogId, TLRPC.TL_forumTopic fromTopic, int flags, int date)` -> `void`
- `updateTopicsWithReadMessages(HashMap<TopicKey, Integer> topicsReadOutbox)` -> `void`
- `updateUnreadPollVotesCount(long dialogId, long topicId, int count)` -> `void`
- `updateUnreadPollVotesCount(long dialogId, long topicId, int count, boolean increment)` -> `void`
- `updateUnreadReactionsCount(long dialogId, long topicId, int count)` -> `void`
- `updateUnreadReactionsCount(long dialogId, long topicId, int count, boolean increment)` -> `void`
- `updateUserInfo(TLRPC.UserFull info, boolean ifExist)` -> `void`
- `updateUserInfoContactBlocked(long userId, TL_account.RequirementToContact value)` -> `void`
- `updateUsers(ArrayList<TLRPC.User> users, boolean onlyStatus, boolean withTransaction, boolean useQueue)` -> `void`

## `org.telegram.messenger.MessagesStorage$TopicKey`
- `equals(Object o)` -> `boolean`
- `hashCode()` -> `int`
- `static of(long dialogId, long topicId)` -> `TopicKey`
- `toString()` -> `String`

## `org.telegram.messenger.SavedMessagesController`
- `checkSavedDialogCount(long dialogId)` -> `void`
- `cleanup()` -> `void`
- `containsDialog(long dialogId)` -> `boolean`
- `deleteAllDialogs()` -> `void`
- `deleteDialog(long did)` -> `void`
- `deleteDialogs(ArrayList<Long> dids)` -> `void`
- `findSavedDialog(long did)` -> `SavedDialog`
- `findSavedDialog(ArrayList<SavedDialog> dialogs, long did)` -> `SavedDialog`
- `getAllCount()` -> `int`
- `getLoadedCount()` -> `int`
- `getMessagesCount(long dialogId)` -> `int`
- `getPinnedCount()` -> `int`
- `hasDialogs()` -> `boolean`
- `hasSavedMessages(long did, Utilities.Callback<Boolean> whenDone)` -> `void`
- `isLoading()` -> `boolean`
- `loadDialogs(boolean onlyCache)` -> `void`
- `static openSavedMessages()` -> `void`
- `static openSavedMessagesReminders()` -> `void`
- `preloadDialogs(boolean cache)` -> `void`
- `processUpdate(TLRPC.Update update)` -> `void`
- `searchDialogs(String q)` -> `ArrayList<SavedDialog>`
- `update(long dialogId, TLRPC.messages_Messages messagesRes)` -> `void`
- `update()` -> `void`
- `updateDeleted(LongSparseArray<ArrayList<Integer>> messageIds)` -> `void`
- `updatePinned(ArrayList<Long> dialogIds, boolean pin, boolean toServer)` -> `boolean`
- `updatePinnedOrder(ArrayList<Long> newOrder)` -> `boolean`
- `updateSavedDialog(TLRPC.Message message)` -> `boolean`
- `updateSavedDialogs(ArrayList<TLRPC.Message> inputMessages)` -> `boolean`
- `updatedDialogCount(long dialogId, int messagesCount)` -> `boolean`
- `updatedDialogCount(long dialogId, int messagesCount, boolean forceIfCountNotLoaded)` -> `boolean`

## `org.telegram.messenger.SavedMessagesController$SavedDialog`
- `static fromMessage(int currentAccount, TLRPC.Message message, boolean isSavedMessage)` -> `SavedDialog`
- `static fromTL(int currentAccount, TLRPC.savedDialog tl, ArrayList<TLRPC.Message> messages, boolean isSavedMessage)` -> `SavedDialog`
- `getDate()` -> `int`
- `isHidden()` -> `boolean`

## `org.telegram.tgnet.AbstractSerializedData`
- `getDataSourceType()` -> `TLDataSourceType`
- `setDataSourceType(TLDataSourceType dataSourceType)` -> `void`

## `org.telegram.tgnet.ConnectionsManager`
- `applyDatacenterAddress(int datacenterId, String ipAddress, int port)` -> `void`
- `cancelRequest(int token, boolean notifyServer)` -> `void`
- `cancelRequest(int token, boolean notifyServer, Runnable onCancelled)` -> `void`
- `cancelRequestsForGuid(int guid)` -> `void`
- `checkConnection()` -> `void`
- `checkProxy(ProxySettings settings, RequestTimeDelegate requestTimeDelegate)` -> `long`
- `cleanup(boolean resetKeys)` -> `void`
- `discardConnection(int dcId, int connectionType)` -> `void`
- `failNotRunningRequest(int requestToken)` -> `void`
- `static generateClassGuid()` -> `int`
- `getConnectionState()` -> `int`
- `getCurrentAuthKeyId()` -> `long`
- `getCurrentDatacenterId()` -> `int`
- `getCurrentTime()` -> `int`
- `getCurrentTimeMillis()` -> `long`
- `static getHostByName(String hostName, long address)` -> `void`
- `static getInitFlags()` -> `int`
- `static getInstance(int num)` -> `ConnectionsManager`
- `getIpStrategy()` -> `byte`
- `getPauseTime()` -> `long`
- `getTimeDifference()` -> `int`
- `init(int version, int layer, int apiId, String deviceModel, String systemVersion, String appVersion, String langCode, String systemLangCode, String configPath, String logPath, String regId, String cFingerprint, int timezoneOffset, long userId, boolean userPremium, boolean enablePushConnection)` -> `void`
- `isPushConnectionEnabled()` -> `boolean`
- `isTestBackend()` -> `boolean`
- `static onBytesReceived(int amount, int networkType, final int currentAccount)` -> `void`
- `static onBytesSent(int amount, int networkType, final int currentAccount)` -> `void`
- `static onCaptchaCheck(final int currentAccount, final int requestToken, final String action, final String key_id)` -> `void`
- `static onConnectionStateChanged(final int state, final int currentAccount)` -> `void`
- `static onIntegrityCheckClassic(final int currentAccount, final int requestToken, final String project, final String nonce)` -> `void`
- `static onInternalPushReceived(final int currentAccount)` -> `void`
- `static onLogout(final int currentAccount)` -> `void`
- `static onPremiumFloodWait(final int currentAccount, final int requestToken, boolean isUpload)` -> `void`
- `static onProxyError()` -> `void`
- `static onRequestClear(int currentAccount, int requestToken, boolean cancelled)` -> `void`
- `static onRequestComplete(int currentAccount, int requestToken, long response, int errorCode, String errorText, int networkType, long timestamp, long requestMsgId, int dcId)` -> `void`
- `static onRequestNewServerIpAndPort(final int second, final int currentAccount)` -> `void`
- `static onRequestQuickAck(int currentAccount, int requestToken)` -> `void`
- `static onRequestWriteToSocket(int currentAccount, int requestToken)` -> `void`
- `static onSessionCreated(final int currentAccount)` -> `void`
- `static onUnparsedMessageReceived(long address, final int currentAccount, long messageId)` -> `void`
- `static onUpdate(final int currentAccount)` -> `void`
- `static onUpdateConfig(long address, final int currentAccount)` -> `void`
- `resumeNetworkMaybe()` -> `void`
- `sendRequest(TLObject object, RequestDelegate completionBlock)` -> `int`
- `sendRequest(TLObject object, RequestDelegate completionBlock, int flags)` -> `int`
- `sendRequest(TLObject object, RequestDelegate completionBlock, int flags, int connectionType)` -> `int`
- `sendRequest(TLObject object, RequestDelegateTimestamp completionBlock, int flags, int connectionType, int datacenterId)` -> `int`
- `sendRequest(TLObject object, RequestDelegate completionBlock, QuickAckDelegate quickAckBlock, int flags)` -> `int`
- `sendRequest(final TLObject object, final RequestDelegate onComplete, final QuickAckDelegate onQuickAck, final WriteToSocketDelegate onWriteToSocket, final int flags, final int datacenterId, final int connectionType, final boolean immediate)` -> `int`
- `sendRequest(final TLObject object, final RequestDelegate onComplete, final RequestDelegateTimestamp onCompleteTimestamp, final QuickAckDelegate onQuickAck, final WriteToSocketDelegate onWriteToSocket, final int flags, final int datacenterId, final int connectionType, final boolean immediate)` -> `int`
- `sendRequestSync(final TLObject object, final RequestDelegate onComplete, final QuickAckDelegate onQuickAck, final WriteToSocketDelegate onWriteToSocket, final int flags, final int datacenterId, final int connectionType, final boolean immediate)` -> `int`
- `sendRequestTyped(TLMethod<T> method, Utilities.Callback2<T, TLRPC.TL_error> completionBlock)` -> `int`
- `sendRequestTyped(TLMethod<T> method, Executor executor, Utilities.Callback2<T, TLRPC.TL_error> completionBlock)` -> `int`
- `sendRequestTyped(TLMethod<T> method, Executor executor, Utilities.Callback2<T, TLRPC.TL_error> completionBlock, int requestFlags)` -> `int`
- `sendRequestTyped(TLMethod<T> method, Executor executor, Utilities.Callback2<T, TLRPC.TL_error> completionBlock, int dcId, int requestFlags)` -> `int`
- `sendRequestTypedAndProcessUpdates(TLMethod<TLRPC.Updates> method, Executor executor, Utilities.Callback2<TLRPC.Updates, TLRPC.TL_error> completionBlock)` -> `int`
- `sendRequestTypedAndProcessUpdates(TLMethod<TLRPC.Updates> method, Executor executor, Utilities.Callback2<TLRPC.Updates, TLRPC.TL_error> completionBlock, int dcId, int requestFlags)` -> `int`
- `setAppPaused(final boolean value, final boolean byScreenState)` -> `void`
- `setDefaultDatacenterId(int dcId)` -> `void`
- `setForceTryIpV6(boolean forceTryIpV6)` -> `void`
- `setIsUpdating(final boolean value)` -> `void`
- `static setLangCode(String langCode)` -> `void`
- `static setProxySettings(boolean enabled, ProxySettings settings)` -> `void`
- `setPushConnectionEnabled(boolean value)` -> `void`
- `static setRegId(String regId, @PushListenerController.PushType int type, String status)` -> `void`
- `static setSystemLangCode(String langCode)` -> `void`
- `setUserId(long id)` -> `void`
- `switchBackend(boolean restart)` -> `void`
- `static testNativeTlScheme(NativeByteBuffer buffer, INativeTlTest test)` -> `boolean`
- `updateDcSettings()` -> `void`

## `org.telegram.tgnet.ConnectionsManager$GoogleDnsLoadTask`
- `doInBackground(Void... voids)` -> `NativeByteBuffer`
- `onPostExecute(final NativeByteBuffer result)` -> `void`

## `org.telegram.tgnet.ConnectionsManager$MozillaDnsLoadTask`
- `doInBackground(Void... voids)` -> `NativeByteBuffer`
- `onPostExecute(final NativeByteBuffer result)` -> `void`

## `org.telegram.tgnet.ConnectionsManager$ResolveHostByNameTask`
- `addAddress(long address)` -> `void`
- `doInBackground(Void... voids)` -> `ResolvedDomain`
- `onPostExecute(final ResolvedDomain result)` -> `void`

## `org.telegram.tgnet.ConnectionsManager$ResolvedDomain`
- `getAddress()` -> `String`

## `org.telegram.tgnet.NativeByteBuffer`
- `capacity()` -> `int`
- `compact()` -> `void`
- `finalize()` -> `void`
- `getIntFromByte(byte b)` -> `int`
- `getPosition()` -> `int`
- `hasRemaining()` -> `boolean`
- `hex()` -> `String`
- `length()` -> `int`
- `limit()` -> `int`
- `limit(int limit)` -> `void`
- `position()` -> `int`
- `position(int position)` -> `void`
- `put(ByteBuffer buff)` -> `void`
- `readBool(boolean exception)` -> `boolean`
- `readByte(boolean exception)` -> `byte`
- `readByteArray(boolean exception)` -> `byte[]`
- `readByteBuffer(boolean exception)` -> `NativeByteBuffer`
- `readBytes(byte[] b, boolean exception)` -> `void`
- `readBytes(byte[] b, int offset, int count, boolean exception)` -> `void`
- `readData(int count, boolean exception)` -> `byte[]`
- `readDouble(boolean exception)` -> `double`
- `readFloat(boolean exception)` -> `float`
- `readInt32(boolean exception)` -> `int`
- `readInt64(boolean exception)` -> `long`
- `readString(boolean exception)` -> `String`
- `remaining()` -> `int`
- `reuse()` -> `void`
- `rewind()` -> `void`
- `skip(int count)` -> `void`
- `static wrap(long address)` -> `NativeByteBuffer`
- `writeBool(boolean value)` -> `void`
- `writeByte(int i)` -> `void`
- `writeByte(byte b)` -> `void`
- `writeByteArray(byte[] b, int offset, int count)` -> `void`
- `writeByteArray(byte[] b)` -> `void`
- `writeByteBuffer(NativeByteBuffer b)` -> `void`
- `writeBytes(byte[] b)` -> `void`
- `writeBytes(byte[] b, int offset, int count)` -> `void`
- `writeBytes(NativeByteBuffer b)` -> `void`
- `writeDouble(double d)` -> `void`
- `writeFloat(float f)` -> `void`
- `writeInt32(int x)` -> `void`
- `writeInt64(long x)` -> `void`
- `writeString(String s)` -> `void`

## `org.telegram.tgnet.SerializedData`
- `cleanup()` -> `void`
- `getPosition()` -> `int`
- `length()` -> `int`
- `readBool(boolean exception)` -> `boolean`
- `readByte(boolean exception)` -> `byte`
- `readByteArray(boolean exception)` -> `byte[]`
- `readByteBuffer(boolean exception)` -> `NativeByteBuffer`
- `readBytes(byte[] b, boolean exception)` -> `void`
- `readData(int count, boolean exception)` -> `byte[]`
- `readDouble(boolean exception)` -> `double`
- `readFloat(boolean exception)` -> `float`
- `readInt32(boolean exception)` -> `int`
- `readInt64(boolean exception)` -> `long`
- `readString(boolean exception)` -> `String`
- `remaining()` -> `int`
- `set(byte[] newData)` -> `void`
- `skip(int count)` -> `void`
- `toByteArray()` -> `byte[]`
- `writeBool(boolean value)` -> `void`
- `writeByte(int i)` -> `void`
- `writeByte(byte b)` -> `void`
- `writeByteArray(byte[] b)` -> `void`
- `writeByteArray(byte[] b, int offset, int count)` -> `void`
- `writeByteBuffer(NativeByteBuffer buffer)` -> `void`
- `writeBytes(byte[] b)` -> `void`
- `writeBytes(byte[] b, int offset, int count)` -> `void`
- `writeDouble(double d)` -> `void`
- `writeFloat(float d)` -> `void`
- `writeInt32(int x)` -> `void`
- `writeInt64(long i)` -> `void`
- `writeString(String s)` -> `void`

## `org.telegram.tgnet.TLClassStore`
- `static Instance()` -> `TLClassStore`
- `TLdeserialize(NativeByteBuffer stream, int constructor, boolean exception)` -> `TLObject`

## `org.telegram.tgnet.TLMethod`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`

## `org.telegram.tgnet.TLObject`
- `static TLdeserialize(Class<T> tClass, T object, InputSerializedData stream, int constructor, boolean exception)` -> `T`
- `static deepCopy(T tlObject, Vector.TLDeserializer<T> deserializer)` -> `T`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `freeResources()` -> `void`
- `getObjectSize()` -> `int`
- `static hasFlag(int flags, int flag)` -> `boolean`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`
- `static setFlag(int flags, int flag, boolean value)` -> `int`

## `org.telegram.tgnet.TLParseException`
- `static doThrowOrLog(InputSerializedData stream, String tlTypeName, int constructorId, boolean throwEnabled)` -> `void`

## `org.telegram.tgnet.TLRPC`
- `static deserialize(T object, InputSerializedData stream, boolean exception)` -> `T`

## `org.telegram.tgnet.TLRPC$AttachMenuBot`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_attachMenuBot`

## `org.telegram.tgnet.TLRPC$AttachMenuBots`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `AttachMenuBots`

## `org.telegram.tgnet.TLRPC$AttachMenuPeerType`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `AttachMenuPeerType`

## `org.telegram.tgnet.TLRPC$Bool`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Bool`

## `org.telegram.tgnet.TLRPC$BotApp`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `BotApp`

## `org.telegram.tgnet.TLRPC$BotCommand`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `BotCommand`

## `org.telegram.tgnet.TLRPC$BotInlineMessage`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `BotInlineMessage`
- `static fromConstructor(int constructor)` -> `BotInlineMessage`

## `org.telegram.tgnet.TLRPC$BotInlineResult`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `BotInlineResult`

## `org.telegram.tgnet.TLRPC$BroadcastRevenueBalances`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `BroadcastRevenueBalances`

## `org.telegram.tgnet.TLRPC$ChannelAdminLogEventAction`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ChannelAdminLogEventAction`

## `org.telegram.tgnet.TLRPC$ChannelLocation`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ChannelLocation`

## `org.telegram.tgnet.TLRPC$ChannelMessagesFilter`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ChannelMessagesFilter`

## `org.telegram.tgnet.TLRPC$ChannelParticipant`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ChannelParticipant`

## `org.telegram.tgnet.TLRPC$ChannelParticipantsFilter`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ChannelParticipantsFilter`

## `org.telegram.tgnet.TLRPC$Chat`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Chat`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception, boolean ignoreAllowStrippedThumb)` -> `Chat`
- `static mergeAdminRights(TL_channelAdminRights_layer92 rights)` -> `TL_chatAdminRights`
- `static mergeBannedRights(TL_channelBannedRights_layer92 rights)` -> `TL_chatBannedRights`

## `org.telegram.tgnet.TLRPC$ChatFull`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ChatFull`

## `org.telegram.tgnet.TLRPC$ChatInvite`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ChatInvite`

## `org.telegram.tgnet.TLRPC$ChatInviteJoinResult`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ChatInviteJoinResult`

## `org.telegram.tgnet.TLRPC$ChatParticipant`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ChatParticipant`
- `setRank(long userId, String rank)` -> `void`

## `org.telegram.tgnet.TLRPC$ChatParticipants`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ChatParticipants`

## `org.telegram.tgnet.TLRPC$ChatPhoto`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ChatPhoto`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception, boolean allowStripedThumb)` -> `ChatPhoto`

## `org.telegram.tgnet.TLRPC$ChatReactions`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ChatReactions`

## `org.telegram.tgnet.TLRPC$ContactLink_layer101`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ContactLink_layer101`

## `org.telegram.tgnet.TLRPC$DecryptedMessage`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `DecryptedMessage`

## `org.telegram.tgnet.TLRPC$DecryptedMessageAction`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `DecryptedMessageAction`

## `org.telegram.tgnet.TLRPC$DecryptedMessageMedia`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `DecryptedMessageMedia`

## `org.telegram.tgnet.TLRPC$Dialog`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Dialog`

## `org.telegram.tgnet.TLRPC$DialogFilter`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `DialogFilter`

## `org.telegram.tgnet.TLRPC$DialogPeer`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `DialogPeer`

## `org.telegram.tgnet.TLRPC$Document`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Document`

## `org.telegram.tgnet.TLRPC$DocumentAttribute`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `DocumentAttribute`

## `org.telegram.tgnet.TLRPC$DraftMessage`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `DraftMessage`

## `org.telegram.tgnet.TLRPC$EmailVerification`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `EmailVerification`

## `org.telegram.tgnet.TLRPC$EmailVerifyPurpose`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `EmailVerifyPurpose`

## `org.telegram.tgnet.TLRPC$EmojiGameInfo`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `EmojiGameInfo`

## `org.telegram.tgnet.TLRPC$EmojiGroup`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `EmojiGroup`

## `org.telegram.tgnet.TLRPC$EmojiKeyword`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `EmojiKeyword`

## `org.telegram.tgnet.TLRPC$EmojiList`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `EmojiList`

## `org.telegram.tgnet.TLRPC$EmojiStatus`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `EmojiStatus`

## `org.telegram.tgnet.TLRPC$EncryptedChat`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `EncryptedChat`

## `org.telegram.tgnet.TLRPC$EncryptedFile`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `EncryptedFile`

## `org.telegram.tgnet.TLRPC$EncryptedMessage`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `EncryptedMessage`

## `org.telegram.tgnet.TLRPC$ExportedChatInvite`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_chatInviteExported`

## `org.telegram.tgnet.TLRPC$FileLocation`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `FileLocation`

## `org.telegram.tgnet.TLRPC$ForumTopic`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_forumTopic`
- `static fromConstructor(int constructor)` -> `TL_forumTopic`

## `org.telegram.tgnet.TLRPC$GeoPoint`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `GeoPoint`

## `org.telegram.tgnet.TLRPC$InlineQueryPeerType`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InlineQueryPeerType`

## `org.telegram.tgnet.TLRPC$InputBotApp`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputBotApp`

## `org.telegram.tgnet.TLRPC$InputChannel`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputChannel`

## `org.telegram.tgnet.TLRPC$InputChatPhoto`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputChatPhoto`

## `org.telegram.tgnet.TLRPC$InputCheckPasswordSRP`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputCheckPasswordSRP`

## `org.telegram.tgnet.TLRPC$InputDialogPeer`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputDialogPeer`

## `org.telegram.tgnet.TLRPC$InputDocument`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputDocument`

## `org.telegram.tgnet.TLRPC$InputEncryptedFile`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputEncryptedFile`

## `org.telegram.tgnet.TLRPC$InputFile`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputFile`

## `org.telegram.tgnet.TLRPC$InputFileLocation`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputFileLocation`

## `org.telegram.tgnet.TLRPC$InputGame`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputGame`

## `org.telegram.tgnet.TLRPC$InputGeoPoint`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputGeoPoint`

## `org.telegram.tgnet.TLRPC$InputMedia`
- `static TLdeserialize(InputSerializedData stream, boolean exception)` -> `InputMedia`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputMedia`

## `org.telegram.tgnet.TLRPC$InputNotifyPeer`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputNotifyPeer`

## `org.telegram.tgnet.TLRPC$InputPaymentCredentials`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputPaymentCredentials`

## `org.telegram.tgnet.TLRPC$InputPeer`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputPeer`

## `org.telegram.tgnet.TLRPC$InputPhoto`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputPhoto`

## `org.telegram.tgnet.TLRPC$InputPrivacyKey`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputPrivacyKey`

## `org.telegram.tgnet.TLRPC$InputPrivacyRule`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputPrivacyRule`

## `org.telegram.tgnet.TLRPC$InputQuickReplyShortcut`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputQuickReplyShortcut`

## `org.telegram.tgnet.TLRPC$InputReplyTo`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputReplyTo`

## `org.telegram.tgnet.TLRPC$InputSecureFile`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputSecureFile`

## `org.telegram.tgnet.TLRPC$InputStorePaymentPurpose`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputStorePaymentPurpose`

## `org.telegram.tgnet.TLRPC$InputUser`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputUser`

## `org.telegram.tgnet.TLRPC$InputWallPaper`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputWallPaper`

## `org.telegram.tgnet.TLRPC$InputWebFileLocation`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputWebFileLocation`

## `org.telegram.tgnet.TLRPC$JSONValue`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `JSONValue`

## `org.telegram.tgnet.TLRPC$JoinChatBotResult`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `JoinChatBotResult`

## `org.telegram.tgnet.TLRPC$LangPackString`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `LangPackString`

## `org.telegram.tgnet.TLRPC$Message`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Message`
- `readAttachPath(InputSerializedData stream, long currentUserId)` -> `void`
- `writeAttachPath(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$MessageAction`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `MessageAction`

## `org.telegram.tgnet.TLRPC$MessageEntity`
- `static TLJsonDeserialize(TLJsonParser parser)` -> `MessageEntity`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `MessageEntity`

## `org.telegram.tgnet.TLRPC$MessageExtendedMedia`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `MessageExtendedMedia`

## `org.telegram.tgnet.TLRPC$MessageFwdHeader`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `MessageFwdHeader`

## `org.telegram.tgnet.TLRPC$MessageMedia`
- `static TLdeserialize(InputSerializedData stream, boolean exception)` -> `MessageMedia`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `MessageMedia`
- `getDocument()` -> `Document`

## `org.telegram.tgnet.TLRPC$MessagePeerReaction`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `MessagePeerReaction`

## `org.telegram.tgnet.TLRPC$MessagePeerVote`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `MessagePeerVote`

## `org.telegram.tgnet.TLRPC$MessageReactions`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messageReactions`

## `org.telegram.tgnet.TLRPC$MessageReactor`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `MessageReactor`

## `org.telegram.tgnet.TLRPC$MessageReplies`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `MessageReplies`

## `org.telegram.tgnet.TLRPC$MessageReplyHeader`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `MessageReplyHeader`

## `org.telegram.tgnet.TLRPC$MessagesFilter`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `MessagesFilter`

## `org.telegram.tgnet.TLRPC$NotificationSound`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `NotificationSound`

## `org.telegram.tgnet.TLRPC$NotifyPeer`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `NotifyPeer`

## `org.telegram.tgnet.TLRPC$PasswordKdfAlgo`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PasswordKdfAlgo`

## `org.telegram.tgnet.TLRPC$PaymentForm`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PaymentForm`

## `org.telegram.tgnet.TLRPC$PaymentReceipt`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PaymentReceipt`

## `org.telegram.tgnet.TLRPC$Peer`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Peer`

## `org.telegram.tgnet.TLRPC$PeerLocated`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PeerLocated`

## `org.telegram.tgnet.TLRPC$PhoneConnection`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PhoneConnection`

## `org.telegram.tgnet.TLRPC$Photo`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Photo`

## `org.telegram.tgnet.TLRPC$PhotoSize`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PhotoSize`
- `static TLdeserialize(long photo_id, long document_id, long sticker_set_id, InputSerializedData stream, int constructor, boolean exception)` -> `PhotoSize`

## `org.telegram.tgnet.TLRPC$Poll`
- `static TLdeserialize(InputSerializedData stream, boolean exception)` -> `Poll`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Poll`

## `org.telegram.tgnet.TLRPC$PollAnswer`
- `static TLdeserialize(InputSerializedData stream, boolean exception)` -> `PollAnswer`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PollAnswer`

## `org.telegram.tgnet.TLRPC$PollAnswerVoters`
- `static TLdeserialize(InputSerializedData stream, boolean exception)` -> `PollAnswerVoters`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PollAnswerVoters`

## `org.telegram.tgnet.TLRPC$PollResults`
- `static TLdeserialize(InputSerializedData stream, boolean exception)` -> `PollResults`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PollResults`

## `org.telegram.tgnet.TLRPC$PrivacyKey`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PrivacyKey`

## `org.telegram.tgnet.TLRPC$PrivacyRule`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PrivacyRule`

## `org.telegram.tgnet.TLRPC$Reaction`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Reaction`
- `equals(@Nullable Reaction other)` -> `boolean`

## `org.telegram.tgnet.TLRPC$ReactionCount`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ReactionCount`

## `org.telegram.tgnet.TLRPC$RecentMeUrl`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `RecentMeUrl`

## `org.telegram.tgnet.TLRPC$ReplyMarkup`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ReplyMarkup`

## `org.telegram.tgnet.TLRPC$ReportReason`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ReportReason`

## `org.telegram.tgnet.TLRPC$ReportResult`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ReportResult`

## `org.telegram.tgnet.TLRPC$RequestPeerType`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `RequestPeerType`

## `org.telegram.tgnet.TLRPC$RestrictionReason`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `RestrictionReason`

## `org.telegram.tgnet.TLRPC$SavedMusic`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `SavedMusic`

## `org.telegram.tgnet.TLRPC$SearchPostsFlood`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `SearchPostsFlood`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$SecureFile`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `SecureFile`

## `org.telegram.tgnet.TLRPC$SecurePasswordKdfAlgo`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `SecurePasswordKdfAlgo`

## `org.telegram.tgnet.TLRPC$SecurePlainData`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `SecurePlainData`

## `org.telegram.tgnet.TLRPC$SecureRequiredType`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `SecureRequiredType`

## `org.telegram.tgnet.TLRPC$SecureValueError`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `SecureValueError`

## `org.telegram.tgnet.TLRPC$SecureValueType`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `SecureValueType`

## `org.telegram.tgnet.TLRPC$SendMessageAction`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `SendMessageAction`

## `org.telegram.tgnet.TLRPC$SuggestedPost`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `SuggestedPost`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_accountDaysTTL`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_accountDaysTTL`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_account_saveMusic`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_appWebViewResultUrl`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_appWebViewResultUrl`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_attachMenuBot`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_attachMenuBotIcon`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_attachMenuBotIcon`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_attachMenuBot_layer140`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_attachMenuBot`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_attachMenuBot_layer162`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_attachMenuBots`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_attachMenuBotsBot`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_attachMenuBotsBot`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_attachMenuBotsNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_attachMenuPeerTypeBotPM`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_attachMenuPeerTypeBroadcast`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_attachMenuPeerTypeChat`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_attachMenuPeerTypePM`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_attachMenuPeerTypeSameBotPM`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_acceptLoginToken`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_authorization`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_authorizationSignUpRequired`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_cancelCode`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_checkPassword`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_checkRecoveryPassword`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_codeTypeFragmentSms`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_codeTypeSms`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_exportAuthorization`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_exportLoginToken`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_exportedAuthorization`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_auth_exportedAuthorization`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_importAuthorization`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_importLoginToken`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_logOut`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_loggedOut`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_auth_loggedOut`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_loginToken`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_loginTokenMigrateTo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_loginTokenSuccess`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_passwordRecovery`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_auth_passwordRecovery`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_recoverPassword`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_reportMissingCode`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_requestFirebaseSms`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_requestPasswordRecovery`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_resendCode`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_resetAuthorizations`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_resetLoginEmail`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_sendCode`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_sentCode`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_sentCodePaymentRequired`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_sentCodeSuccess`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_sentCodeTypeApp`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_sentCodeTypeEmailCode`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_sentCodeTypeFirebaseSms`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_sentCodeTypeFragmentSms`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_sentCodeTypeSetUpEmailRequired`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_sentCodeTypeSms`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_sentCodeTypeSmsPhrase`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_sentCodeTypeSmsWord`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_signIn`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_signInOld`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_auth_signUp`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_authorization`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_authorization`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_availableEffect`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_availableEffect`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_availableReaction`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_availableReaction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_bankCardOpenUrl`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_bankCardOpenUrl`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_boolFalse`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_boolTrue`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_botApp`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_botAppNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_botCommand`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_botCommand_layer227`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_botInlineMediaResult`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_botInlineMessageMediaAuto`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_botInlineMessageMediaAuto_layer74`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_botInlineMessageMediaContact`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_botInlineMessageMediaContact_layer81`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_botInlineMessageMediaGeo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_botInlineMessageMediaGeo_layer119`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_botInlineMessageMediaGeo_layer71`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_botInlineMessageMediaVenue`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_botInlineMessageMediaVenue_layer77`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_botInlineMessageMediaWebPage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_botInlineMessageRichMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_botInlineMessageText`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_botInlineResult`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_broadcastRevenueBalances`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_broadcastRevenueBalances_layer186`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_businessLocation`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_businessLocation`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channel`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEvent`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_channelAdminLogEvent`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionChangeAbout`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionChangeAvailableReactions`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionChangeBackgroundEmoji`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionChangeEmojiStatus`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionChangeHistoryTTL`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionChangeLinkedChat`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionChangeLocation`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionChangePhoto`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionChangeTitle`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionChangeUsername`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionChangeUsernames`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionChangeWallpaper`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionCreateTopic`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionDefaultBannedRights`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionDeleteMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionDeleteTopic`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionEditMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionEditTopic`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionExportedInviteDelete`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionExportedInviteEdit`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionExportedInviteRevoke`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionParticipantEditRank`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionParticipantInvite`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionParticipantJoin`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionParticipantJoinByInvite`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionParticipantJoinByRequest`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionParticipantLeave`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionParticipantMute`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionParticipantSubExtend`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionParticipantToggleAdmin`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionParticipantToggleBan`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionParticipantUnmute`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionParticipantVolume`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionPinTopic`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionSendMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionStopPoll`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionToggleAntiSpam`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionToggleAutotranslation`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionToggleForum`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionToggleInvites`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionToggleNoForwards`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionTogglePreHistoryHidden`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionToggleSignatures`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionToggleSlowMode`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionUpdatePinned`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventsFilter`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_channelAdminLogEventsFilter`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminRights_layer92`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_channelAdminRights_layer92`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelBannedRights_layer92`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_channelBannedRights_layer92`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelForbidden`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelForbidden_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelForbidden_layer52`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelForbidden_layer67`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer101`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer103`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer110`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer121`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer122`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer123`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer124`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer132`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer133`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer134`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer135`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer139`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer144`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer162`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer167`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer173`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer176`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer177`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer195`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer197`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer204`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer212`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer225`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer48`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer52`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer67`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer70`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer71`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer72`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer89`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer98`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_layer99`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelFull_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelLocation`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelLocationEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelMessagesFilter`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelMessagesFilterEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipant`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantAdmin`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantAdmin_layer103`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantAdmin_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantAdmin_layer92`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantBanned`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantBanned_layer125`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantBanned_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantBanned_layer222`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantBanned_layer92`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantCreator`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantCreator_layer103`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantCreator_layer118`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantCreator_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantEditor_layer67`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantKicked_layer67`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantLeft`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantLeft_layer125`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantModerator_layer67`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantSelf`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantSelf_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantSelf_layer133`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantSelf_layer185`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantSelf_layer222`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipant_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipant_layer185`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipant_layer222`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantsAdmins`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantsBanned`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantsBots`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantsContacts`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantsKicked`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantsMentions`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantsRecent`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelParticipantsSearch`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channel_layer104`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channel_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channel_layer147`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channel_layer161`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `readParams(InputSerializedData stream, boolean exception, boolean allowStrippedThumb)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channel_layer165`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channel_layer166`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channel_layer167`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channel_layer185`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channel_layer195`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channel_layer199`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channel_layer203`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channel_layer216`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channel_layer227`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channel_layer48`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channel_layer67`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channel_layer72`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channel_layer77`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channel_layer92`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channel_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_adminLogResults`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_channels_adminLogResults`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_channelParticipant`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_channels_channelParticipant`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_channelParticipants`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_channelParticipantsNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_checkSearchPostsFlood`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_checkUsername`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_convertToGigagroup`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_createChannel`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_deactivateAllUsernames`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_deleteChannel`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_deleteHistory`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_deleteMessages`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_channels_deleteMessages`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_affectedMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_deleteParticipantHistory`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_editAdmin`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_editBanned`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_editCreator`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_editLocation`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_editPhoto`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_editTitle`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_exportMessageLink`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_getAdminLog`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_getAdminedPublicChannels`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `messages_Chats`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_getChannelRecommendations`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_getChannels`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_getFullChannel`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_getFutureCreatorAfterLeave`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `User`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_getGroupsForDiscussion`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_getInactiveChannels`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_getMessageAuthor`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_getMessages`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_getParticipant`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_channels_channelParticipant`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_getParticipants`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `channels_ChannelParticipants`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_getSendAs`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_inviteToChannel`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_joinChannel`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `ChatInviteJoinResult`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_leaveChannel`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_readHistory`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_readMessageContents`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_reorderUsernames`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_reportAntiSpamFalsePositive`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_reportSpam`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_restrictSponsoredMessages`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_searchPosts`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_sendAsPeers`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_channels_sendAsPeers`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_setBoostsToUnblockRestrictions`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_setDiscussionGroup`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_sponsoredMessageReportResultAdsHidden`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_sponsoredMessageReportResultChooseOption`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_sponsoredMessageReportResultReported`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_toggleAntiSpam`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_toggleAutotranslation`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_toggleForum`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_toggleJoinRequest`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_toggleJoinToSend`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_toggleParticipantsHidden`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_togglePreHistoryHidden`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_toggleSignatures`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_toggleSlowMode`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_toggleUsername`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_toggleViewForumAsMessages`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_updateEmojiStatus`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_updateUsername`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chat`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `readParams(InputSerializedData stream, boolean exception, boolean allowStrippedThumb)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatAdminRights`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_chatAdminRights`
- `static clone(TL_chatAdminRights rights)` -> `TL_chatAdminRights`
- `equals(@Nullable Object obj)` -> `boolean`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatAdminWithInvites`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_chatAdminWithInvites`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatBannedRights`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_chatBannedRights`
- `static clone(TL_chatBannedRights rights)` -> `TL_chatBannedRights`
- `equals(@Nullable Object obj)` -> `boolean`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatEmpty`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatEmpty_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatForbidden`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatForbidden_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatForbidden_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatFull`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatFull_layer121`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatFull_layer122`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatFull_layer123`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatFull_layer124`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatFull_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatFull_layer132`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatFull_layer133`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatFull_layer135`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatFull_layer144`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatFull_layer177`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatFull_layer87`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatFull_layer92`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatFull_layer98`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatInvite`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatInviteAlready`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatInviteEmpty_layer122`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatInviteExported`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatInviteExported_layer122`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatInviteExported_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatInviteExported_layer133`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatInviteExported_layer185`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatInviteImporter`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_chatInviteImporter`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatInviteJoinResultOk`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatInviteJoinResultWebView`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatInvitePeek`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatInvitePublicJoinRequests`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatInvite_layer165`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatInvite_layer185`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatInvite_layer195`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatOnlines`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_chatOnlines`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatParticipant`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatParticipantAdmin`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatParticipantAdmin_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatParticipantAdmin_layer222`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatParticipantCreator`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatParticipantCreator_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatParticipantCreator_layer222`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatParticipant_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatParticipant_layer222`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatParticipants`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatParticipantsForbidden`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatParticipantsForbidden_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatParticipantsForbidden_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatParticipants_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatParticipants_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatPhoto`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `readParams(InputSerializedData stream, boolean exception, boolean allowStripedThumbs)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatPhotoEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatPhoto_layer115`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatPhoto_layer126`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatPhoto_layer127`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatPhoto_layer97`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatReactionsAll`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatReactionsNone`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatReactionsSome`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chat_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chat_layer92`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chat_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chat_old2`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_checkPaidAuth`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_community`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_communityForbidden`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_communityFull`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_composedMessageWithAI`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_composedMessageWithAI`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_composedRichMessageWithAI`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_composedRichMessageWithAI`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_config`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_config`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contact`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_contact`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contactLinkContact`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contactLinkNone`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contactLinkUnknown`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contactStatus`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_contactStatus`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_acceptContact`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_addContact`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_block`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_blockFromReplies`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_blocked`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_blockedSlice`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_contacts`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_contactsNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_deleteByPhones`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_deleteContacts`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_exportContactToken`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_found`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_contacts_found`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_getBlocked`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_getContacts`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_getSponsoredPeers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_getStatuses`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_getTopPeers`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `contacts_TopPeers`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_importCard`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_importContactToken`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_importContacts`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_importedContacts`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_contacts_importedContacts`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_link_layer101`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_contacts_link_layer101`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_resetSaved`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_resetTopPeerRating`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_resolvePhone`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_resolveUsername`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_resolvedPeer`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_contacts_resolvedPeer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_search`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_contacts_found`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_setBlocked`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_sponsoredPeers`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_sponsoredPeersEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_toggleTopPeers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_topPeers`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_topPeersDisabled`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_topPeersNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_contacts_unblock`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dataJSON`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_dataJSON`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dcOption`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_dcOption`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageActionAbortKey`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageActionAcceptKey`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageActionCommitKey`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageActionDeleteMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageActionFlushHistory`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageActionNoop`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageActionNotifyLayer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageActionReadMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageActionRequestKey`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageActionResend`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageActionScreenshotMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageActionSetMessageTTL`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageActionTyping`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageLayer`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_decryptedMessageLayer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageMediaContact`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageMediaDocument`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageMediaDocument_layer101`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageMediaDocument_layer8`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageMediaEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageMediaExternalDocument`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageMediaGeoPoint`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageMediaPhoto`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageMediaPhoto_layer8`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageMediaVenue`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageMediaVideo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageMediaVideo_layer17`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageMediaVideo_layer8`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageMediaWebPage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageService`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessageService_layer8`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessage_layer17`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessage_layer45`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_decryptedMessage_layer8`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_defaultHistoryTTL`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_defaultHistoryTTL`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_deleteFactCheck`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialog`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialogCommunity`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialogFilter`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialogFilterChatlist`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialogFilterChatlist_layer175`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialogFilterChatlist_layer195`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialogFilterSuggested`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_dialogFilterSuggested`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialogFilter_layer175`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialogFilter_layer195`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialogFolder`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialogPeer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialogPeerCommunity`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialogPeerFolder`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialog_layer149`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialog_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_document`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_documentAttributeAnimated`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_documentAttributeCustomEmoji`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_documentAttributeFilename`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_documentAttributeImageSize`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_documentAttributeVideo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_documentAttributeVideo_layer159`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_documentAttributeVideo_layer184`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_documentAttributeVideo_layer187`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_documentAttributeVideo_layer65`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_documentEmpty`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_documentEncrypted`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_documentEncrypted_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_document_layer113`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_document_layer142`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_document_layer53`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_document_layer82`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_document_layer92`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_document_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_draftMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_draftMessageEmpty`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_draftMessageEmpty_layer81`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_draftMessage_layer165`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_draftMessage_layer181`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_draftMessage_layer205`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_draftMessage_layer226`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_editCloseFriends`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_editFactCheck`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emailVerificationApple`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emailVerificationCode`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emailVerificationGoogle`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emailVerifyPurposeLoginChange`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emailVerifyPurposeLoginSetup`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emailVerifyPurposePassport`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emojiGameDiceInfo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emojiGameUnavailable`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emojiGroup`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emojiGroupGreeting`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emojiGroupPremium`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emojiKeyword`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emojiKeywordDeleted`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emojiKeywordsDifference`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_emojiKeywordsDifference`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emojiLanguage`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_emojiLanguage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emojiList`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emojiListNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emojiStatus`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emojiStatusCollectible`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emojiStatusEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emojiStatusUntil_layer197`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emojiStatus_layer197`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_emojiURL`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_emojiURL`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_encryptedChat`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_encryptedChatDiscarded`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_encryptedChatDiscarded_layer122`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_encryptedChatEmpty`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_encryptedChatRequested`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_encryptedChatRequested_layer115`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_encryptedChatRequested_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_encryptedChatRequested_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_encryptedChatWaiting`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_encryptedChatWaiting_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_encryptedChat_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_encryptedChat_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_encryptedFile`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_encryptedFileEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_encryptedFile_layer142`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_encryptedMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_encryptedMessageService`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_error`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_error`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_exportedContactToken`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_exportedContactToken`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_exportedMessageLink`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_exportedMessageLink`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_factCheck`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_factCheck`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_fileEncryptedLocation`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_fileHash`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_fileHash`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_fileLocationToBeDeprecated`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_fileLocationUnavailable`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_fileLocation_layer82`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_fileLocation_layer97`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_folder`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_folder`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_folderPeer`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_folderPeer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_folders_deleteFolder`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_folders_editPeerFolders`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_forumTopic`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_forumTopic`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_forumTopicDeleted`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_forumTopic_layer147`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_forumTopic_layer215`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_forumTopic_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_game`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_game`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_geoPoint`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_geoPointEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_geoPoint_layer119`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_geoPoint_layer81`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_getFactCheck`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_getSavedMusic`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_acceptTermsOfService`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_appConfig`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_appConfigNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_appUpdate`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_countriesList`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_countriesListNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_country`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_help_country`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_countryCode`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_help_countryCode`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_deepLinkInfo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_deepLinkInfoEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_dismissSuggestion`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_editUserInfo`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_getAppChangelog`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_getAppConfig`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_getAppUpdate`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_getConfig`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_getCountriesList`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `help_CountriesList`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_getDeepLinkInfo`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_getInviteText`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_getNearestDc`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_getPassportConfig`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_getPremiumPromo`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_getPromoData`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_getRecentMeUrls`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_getSupport`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_getSupportName`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_getTermsOfServiceUpdate`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_getTimezonesList`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_getUserInfo`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_hidePromoData`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_inviteText`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_help_inviteText`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_noAppUpdate`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_passportConfig`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_passportConfigNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_premiumPromo`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_help_premiumPromo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_premiumPromo_layer140`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_premiumPromo_layer144`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_promoData`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_promoDataEmpty`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_promoData_layer202`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_recentMeUrls`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_help_recentMeUrls`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_saveAppLog`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_setBotUpdatesStatus`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_support`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_help_support`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_supportName`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_help_supportName`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_termsOfService`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_help_termsOfService`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_termsOfServiceUpdate`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_termsOfServiceUpdateEmpty`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_timezonesList`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_timezonesListNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_userInfo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_userInfoEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_highScore`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_highScore`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_importedContact`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_importedContact`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inlineBotSwitchPM`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inlineBotSwitchPM`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inlineBotWebView`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inlineBotWebView`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inlineQueryPeerTypeBotPM`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inlineQueryPeerTypeBroadcast`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inlineQueryPeerTypeChat`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inlineQueryPeerTypeMegagroup`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inlineQueryPeerTypePM`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inlineQueryPeerTypeSameBotPM`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputAppEvent`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inputAppEvent`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputBotAppID`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputBotAppShortName`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputBotInlineMessageID`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inputBotInlineMessageID`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputChannel`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputChannelEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputChannelFromMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputChannelFromMessage_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputChannel_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputChatPhoto`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputChatPhotoEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputChatUploadedPhoto`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputCheckPasswordEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputCheckPasswordSRP`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputDialogPeer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputDialogPeerCommunity`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputDialogPeerFolder`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputDocument`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputDocumentEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputDocumentFileLocation`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputEmojiStatusCollectible`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputEncryptedChat`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inputEncryptedChat`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputEncryptedFile`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputEncryptedFileBigUploaded`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputEncryptedFileEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputEncryptedFileLocation`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputEncryptedFileUploaded`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputFile`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputFileBig`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputFileLocation`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputFileStoryDocument`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputFolderPeer`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inputFolderPeer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputGameID`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputGameShortName`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputGeoPoint`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputGeoPointEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaContact`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaDice`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaDocument`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaDocumentExternal`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaGame`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaGeoLive`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaGeoPoint`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaPaidMedia`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaPaidMedia_layer186`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaPhoto`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaPhotoExternal`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaPhoto_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaPoll`
- `static deserializeLegacyCorrectAnswers(InputSerializedData stream, boolean exception)` -> `ArrayList<Integer>`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `static serializeLegacyCorrectAnswers(OutputSerializedData stream, ArrayList<Integer> answers)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaPoll_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaStakeDice`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaStory`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaTodo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaUploadedDocument`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaUploadedPhoto`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaVenue`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMediaWebPage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessageEntityMentionName`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessageReadMetric`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inputMessageReadMetric`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessagesFilterChatPhotos`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessagesFilterContacts`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessagesFilterDocument`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessagesFilterEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessagesFilterGeo`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessagesFilterMusic`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessagesFilterMyMentions`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessagesFilterPhotoVideo`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessagesFilterPhotoVideoDocuments`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessagesFilterPhotos`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessagesFilterPinned`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessagesFilterPoll`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessagesFilterRoundVideo`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessagesFilterUrl`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputMessagesFilterVideo`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputNotifyBroadcasts`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputNotifyChats`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputNotifyCommunity`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputNotifyForumTopic`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputNotifyPeer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputNotifyUsers`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPaymentCredentials`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPaymentCredentialsGooglePay`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPaymentCredentialsSaved`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPeerChannel`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPeerChannelFromMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPeerChannelFromMessage_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPeerChannel_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPeerChat`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPeerChat_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPeerEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPeerPhotoFileLocation`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPeerSelf`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPeerUser`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPeerUserFromMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPeerUserFromMessage_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPeerUser_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPhoneContact`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inputPhoneContact`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPhoto`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPhotoEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPhotoFileLocation`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPollAnswer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyAbout`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyAddedByPhone`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyBirthday`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyChatInvite`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyForwards`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyNoPaidMessages`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyPhoneNumber`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyPhoneP2P`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyKeySavedMusic`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyStatusTimestamp`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyValueAllowAll`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyValueAllowBots`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyValueAllowChatParticipants`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyValueAllowCloseFriends`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyValueAllowContacts`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyValueAllowPremium`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyValueAllowUsers`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyValueDisallowAll`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyValueDisallowBots`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyValueDisallowChatParticipants`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyValueDisallowContacts`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPrivacyValueDisallowUsers`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputQuickReplyShortcut`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputQuickReplyShortcutId`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputReplyToEphemeralMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputReplyToMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputReplyToMessage_layer166`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputReplyToMessage_layer203`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputReplyToMessage_layer207`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputReplyToMessage_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputReplyToMonoForum`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputReplyToStory`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputReplyToStory_layer173`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputReportReasonChildAbuse`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputReportReasonCopyright`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputReportReasonFake`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputReportReasonGeoIrrelevant`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputReportReasonIllegalDrugs`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputReportReasonOther`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputReportReasonPersonalDetails`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputReportReasonPornography`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputReportReasonSpam`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputReportReasonViolence`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputSecureFile`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputSecureFileLocation`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputSecureFileUploaded`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputSecureValue`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inputSecureValue`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputSingleMedia`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inputSingleMedia`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStorePaymentAuthCode`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStorePaymentPremiumGiveaway`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStorePaymentPremiumSubscription`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStorePaymentStarsGiveaway`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStorePaymentStarsTopup`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputStorePaymentStarsTopup_layer212`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputUser`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputUserEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputUserFromMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputUserFromMessage_layer132`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputUserSelf`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputUser_layer132`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputWallPaper`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputWallPaperNoFile`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputWallPaperSlug`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputWebDocument`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inputWebDocument`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputWebFileGeoPointLocation`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputWebFileLocation`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_joinChatBotResultApproved`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_joinChatBotResultDeclined`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_joinChatBotResultQueued`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_joinChatBotResultWebView`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_jsonArray`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_jsonBool`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_jsonNull`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_jsonNumber`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_jsonObject`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_jsonObjectValue`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_jsonObjectValue`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_jsonString`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_labeledPrice`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_labeledPrice`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_langPackDifference`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_langPackDifference`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_langPackLanguage`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_langPackLanguage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_langPackString`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_langPackStringDeleted`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_langPackStringPluralized`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_langpack_getDifference`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_langpack_getLangPack`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_langpack_getLanguage`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_langpack_getLanguages`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_langpack_getStrings`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_maskCoords`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_maskCoords`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_message`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionAttachMenuBotAllowed`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionBoostApply`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionBotAllowed`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionBotAllowed_layer153`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChangeCommunity`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChangeCreator`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChannelCreate`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChannelMigrateFrom`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChannelMigrateFrom_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChatAddUser`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChatAddUser_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChatAddUser_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChatCreate`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChatCreate_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChatDeletePhoto`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChatDeleteUser`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChatDeleteUser_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChatEditPhoto`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChatEditTitle`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChatJoinedByLink`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChatJoinedByLink_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChatJoinedByRequest`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChatJoinedViaCommunity`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChatMigrateTo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionChatMigrateTo_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionContactSignUp`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionCreatedBroadcastList`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionCustomAction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionGameScore`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionGeoProximityReached`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionGiveawayLaunch`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionGiveawayLaunch_layer186`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionGiveawayResults`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionGiveawayResults_layer186`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionGramTransfer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionHistoryClear`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionLoginUnknownLocation`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionManagedBotCreated`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionNewCreatorPending`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionNoForwardsRequest`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionNoForwardsToggle`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionPaidMessagesPrice`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionPaidMessagesPrice_layer203`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionPaidMessagesRefunded`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionPaymentRefunded`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionPaymentSent`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionPaymentSentMe`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionPaymentSentMe_layer193`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionPaymentSent_layer140`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionPaymentSent_layer193`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionPhoneNumberRequest`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionPinMessage`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionPollAppendAnswer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionPollDeleteAnswer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionPrizeStars`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionRequestedPeer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionRequestedPeer_layer168`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionScreenshotTaken`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionSecureValuesSent`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionSetChatWallPaper`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionSetChatWallPaper_layer166`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionSetMessagesTTL`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionSetMessagesTTL_layer149`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionSetSameChatWallPaper`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionSuggestBirthday`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionSuggestedPostApproval`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionSuggestedPostRefund`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionSuggestedPostSuccess`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionTTLChange`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionTodoAppendTasks`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionTodoCompletions`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionTopicCreate`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionTopicEdit`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionTopicEdit_layer149`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionUserJoined`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionUserUpdatedPhoto`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionWalletTonConnectRequest`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionWebViewDataSent`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionWebViewDataSentMe`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEmpty`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEmpty_layer122`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEncryptedAction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityBankCard`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityBlockquote`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityBlockquote_layer180`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityBold`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityBotCommand`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityCashtag`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityCode`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityCustomEmoji`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityDiffDelete`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityDiffInsert`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityDiffReplace`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityEmail`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityFormattedDate`
- `applyFlags()` -> `void`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityHashtag`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityItalic`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityMention`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityMentionName`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityMentionName_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityPhone`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityPre`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntitySpoiler`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityStrike`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityTextUrl`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityTonAddress`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityUnderline`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityUnknown`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageEntityUrl`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageExtendedMedia`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageExtendedMediaPreview`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageForwarded_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageForwarded_old2`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageFwdHeader`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageFwdHeader_layer112`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageFwdHeader_layer118`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageFwdHeader_layer169`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageFwdHeader_layer68`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageFwdHeader_layer72`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageFwdHeader_layer96`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaContact`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaContact_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaContact_layer81`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaDice`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaDice_layer111`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaDice_layer220`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaDocument`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaDocument_layer159`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaDocument_layer187`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaDocument_layer197`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaDocument_layer197_2`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaDocument_layer68`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaDocument_layer74`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaDocument_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaGame`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaGeo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaGeoLive`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaGeoLive_layer119`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaGiveaway`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaGiveawayResults`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaGiveawayResults_layer186`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaGiveaway_layer167`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaGiveaway_layer186`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaPaidMedia`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaPhoto`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaPhoto_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaPhoto_layer68`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaPhoto_layer74`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaPhoto_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaPoll`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaPoll_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaStory`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaStory_layer162`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaToDo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaUnsupported`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaUnsupported_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaVenue`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaVenue_layer71`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaVideoStream`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaVideo_layer45`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaVideo_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaWebPage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageMediaWebPage_layer165`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messagePeerReaction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messagePeerReaction_layer137`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messagePeerReaction_layer144`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messagePeerReaction_layer154`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messagePeerVote`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messagePeerVoteInputOption`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messagePeerVoteMultiple`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageRange`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messageRange`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageReactions`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageReactionsOld`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageReactions_layer137`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageReactions_layer185`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageReactor`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageReactor_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageReplies`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageReplies_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageReplyHeader`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageReplyHeader_layer165`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageReplyHeader_layer165_2`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageReplyHeader_layer166`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageReplyHeader_layer207`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageReplyHeader_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageReplyStoryHeader`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageReplyStoryHeader_layer174`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageReportOption`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messageReportOption`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageService`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageService_layer118`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageService_layer123`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageService_layer195`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageService_layer204`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageService_layer48`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageService_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageService_old2`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageViews`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messageViews`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_message_layer104`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_message_layer117`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_message_layer47`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_message_layer68`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_message_layer72`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_message_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_message_old2`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_message_old3`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_message_old4`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_message_old5`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_message_old6`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_message_old7`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_message_secret`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_message_secret_layer72`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_message_secret_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_acceptEncryption`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_acceptUrlAuth`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `UrlAuthResult`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_addChatUser`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_addPollAnswer`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_affectedFoundMessages`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_affectedFoundMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_affectedHistory`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_affectedHistory`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_affectedMessages`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_affectedMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_appendTodoList`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_availableEffects`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_availableEffectsNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_availableReactions`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_availableReactionsNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_botApp`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_botApp`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_botResults`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_botResults`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_botResults_layer153`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_botResults_layer71`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_channelMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_chatAdminsWithInvites`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_chatAdminsWithInvites`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_chatFull`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_chatFull`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_chatInviteImporters`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_chats`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_chatsSlice`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_checkChatInvite`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_checkHistoryImport`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_checkHistoryImportPeer`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_checkQuickReplyShortcut`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_checkUrlAuthMatchCode`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_checkedHistoryImportPeer`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_checkedHistoryImportPeer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_clearAllDrafts`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_clearRecentReactions`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_clickSponsoredMessage`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_composeMessageWithAI`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_composedMessageWithAI`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_composeRichMessageWithAI`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_composedRichMessageWithAI`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_createChat`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_declineUrlAuth`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_deleteChat`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_deleteChatUser`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_deleteExportedChatInvite`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_deleteHistory`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_deleteMessages`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_deleteMessages`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_affectedMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_deleteParticipantReaction`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_deleteParticipantReactions`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_deletePollAnswer`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_deleteQuickReplyMessages`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_deleteQuickReplyShortcut`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_deleteRevokedExportedChatInvites`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_deleteSavedHistory`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_deleteScheduledMessages`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_deleteScheduledMessages`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_dhConfig`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_dhConfigNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_dialogFilters`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_dialogFilters`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_dialogs`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_dialogsNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_dialogsSlice`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_discardEncryption`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_discussionMessage`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_discussionMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_editChatAbout`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_editChatAdmin`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_editChatDefaultBannedRights`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_editChatParticipantRank`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_editChatPhoto`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_editChatTitle`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_editExportedChatInvite`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_editInlineBotMessage`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_editMessage`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_editMessage_layer226`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_editQuickReplyShortcut`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_emojiGameOutcome`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_emojiGameOutcome`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_emojiGroups`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_emojiGroupsNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_exportChatInvite`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_exportedChatInvite`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_exportedChatInviteReplaced`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_exportedChatInvites`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_exportedChatInvites`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_forumTopics`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_forumTopics`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_forwardMessage`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_forwardMessages`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getAdminsWithInvites`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getAllChats`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getAllDrafts`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getAttachMenuBot`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getAttachMenuBots`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getAvailableEffects`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getAvailableReactions`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getBotApp`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getChatInviteImporters`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getChats`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getCommonChats`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getCustomEmojiDocuments`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getDefaultHistoryTTL`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getDefaultTagReactions`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getDhConfig`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getDialogFilters`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getDialogUnreadMarks`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getDialogs`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getDocumentByHash`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getEmojiGameInfo`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `EmojiGameInfo`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getEmojiGroups`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getEmojiKeywords`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getEmojiKeywordsDifference`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getEmojiKeywordsLanguages`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getEmojiStatusGroups`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getEmojiURL`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getExportedChatInvite`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getExportedChatInvites`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getExtendedMedia`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getFullChat`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getGameHighScores`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getHistory`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getInlineBotResults`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `messages_BotResults`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getInlineGameHighScores`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getMessageEditData`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getMessageReactionsList`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getMessageReadParticipants`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getMessages`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getMessagesReactions`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getMessagesViews`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getOnlines`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getOutboxReadDate`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getPaidReactionPrivacy`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getPeerDialogs`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getPinnedDialogs`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getPinnedSavedDialogs`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getPollResults`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getPollVotes`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_votesList`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getPreparedInlineMessage`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getQuickReplies`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getQuickReplyMessages`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getRecentLocations`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getRecentReactions`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getReplies`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getSavedDialogs`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getSavedDialogsByID`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getSavedHistory`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getSavedReactionTags`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getScheduledHistory`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getScheduledMessages`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getSearchCounters`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getSearchResultsCalendar`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getSearchResultsPositions`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getSponsoredMessages`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getStatsURL`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getSuggestedDialogFilters`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getTopReactions`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getUnreadMentions`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getUnreadPollVotes`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `messages_Messages`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getUnreadReactions`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `messages_Messages`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getWebPage`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getWebViewResult`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_hideAllChatJoinRequests`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_hideChatJoinRequest`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_highScores`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_highScores`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_historyImport`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_historyImport`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_historyImportParsed`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_historyImportParsed`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_importChatInvite`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `ChatInviteJoinResult`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_inactiveChats`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_inactiveChats`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_initHistoryImport`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_invitedUsers`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_invitedUsers`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_markDialogUnread`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_messageEditData`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_messageEditData`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_messageEmpty`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_messageEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_messageReactionsList`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_messageReactionsList`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_messageViews`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_messageViews`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_messages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_messagesNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_messagesSlice`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_messagesSlice_layer210`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_messagesSlice_layer215`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_messages_layer215`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_migrateChat`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_peerDialogs`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_peerDialogs`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_preparedInlineMessage`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_preparedInlineMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_prolongWebView`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_quickReplies`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_quickRepliesNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_reactions`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_reactionsNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_readDiscussion`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_readEncryptedHistory`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_readHistory`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_readMentions`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_readMessageContents`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_readPollVotes`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_affectedHistory`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_readReactions`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_affectedHistory`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_readSavedHistory`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_receivedQueue`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_reorderPinnedDialogs`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_reorderPinnedSavedDialogs`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_reorderQuickReplies`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_report`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `ReportResult`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_reportEncryptedSpam`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_reportMusicListen`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_reportReaction`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_reportReadMetrics`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_reportSpam`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_reportSponsoredMessage`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_requestAppWebView`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_requestEncryption`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_requestMainWebView`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_requestSimpleWebView`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_requestUrlAuth`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `UrlAuthResult`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_requestWebView`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_saveDefaultSendAs`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_saveDraft`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_savedDialogs`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_savedDialogsNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_savedDialogsSlice`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_savedReactionsTags`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_savedReactionsTagsNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_search`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `messages_Messages`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_searchCounter`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_searchCounter`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_searchCustomEmoji`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_searchGlobal`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `messages_Messages`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_searchResultsCalendar`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_searchResultsCalendar`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_searchResultsPositions`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_searchResultsPositions`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sendBotRequestedPeer`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sendEncrypted`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `freeResources()` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sendEncryptedFile`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `freeResources()` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sendEncryptedMultiMedia`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `freeResources()` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sendEncryptedService`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `freeResources()` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sendInlineBotResult`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sendInlineBotResult_layer199`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sendMedia`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sendMessage`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sendMultiMedia`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sendMultiMedia_layer199`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sendPaidReaction`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sendQuickReplyMessages`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sendReaction`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sendScheduledMessages`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sendScreenshotNotification`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sendVote`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sendWebViewData`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sendWebViewResultMessage`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sentEncryptedFile`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sentEncryptedMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_setChatAvailableReactions`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_setChatWallPaper`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_setDefaultHistoryTTL`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_setDefaultReaction`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_setEncryptedTyping`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_setGameScore`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_setHistoryTTL`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_setInlineGameScore`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_setTyping`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_setWebViewResult`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sponsoredMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_sponsoredMessagesEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_startBot`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_startHistoryImport`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_summarizeText`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_textWithEntities`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_toggleBotInAttachMenu`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_toggleDialogFilterTags`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_toggleDialogPin`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_toggleNoForwards`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_togglePaidReactionPrivacy`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_togglePeerTranslations`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_toggleSavedDialogPin`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_toggleSuggestedPostApproval`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_toggleTodoCompleted`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_translateResult`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_translateResult`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_translateRichMessage`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_translatedRichMessage`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_translateText`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_translateResult`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_translatedRichMessage`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_translatedRichMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_unpinAllMessages`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_affectedHistory`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_updateDialogFilter`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_updateDialogFiltersOrder`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_updatePinnedMessage`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_updateSavedReactionTag`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_uploadEncryptedFile`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_uploadImportedMedia`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_uploadMedia`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_viewSponsoredMessage`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_votesList`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_votesList`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_webPage`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_webPage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_webViewResult`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_webViewResult`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_missingInvitee`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_missingInvitee`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_monoForumDialog`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_nearestDc`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_nearestDc`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_notificationSoundDefault`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_notificationSoundLocal`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_notificationSoundNone`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_notificationSoundRingtone`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_notifyBroadcasts`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_notifyChats`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_notifyCommunity`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_notifyForumTopic`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_notifyPeer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_notifyUsers`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_null`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_null`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_outboxReadDate`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_outboxReadDate`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_passwordKdfAlgoUnknown`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_paymentCharge`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_paymentCharge`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_paymentFormMethod`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_paymentFormMethod`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_paymentRequestedInfo`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_paymentRequestedInfo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_paymentSavedCredentialsCard`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_paymentSavedCredentialsCard`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_assignPlayMarketTransaction`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_bankCardData`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_payments_bankCardData`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_canPurchaseStore`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_clearSavedInfo`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_getBankCardData`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_getGiveawayInfo`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_getPaymentForm`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `PaymentForm`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_getPaymentReceipt`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_getSavedInfo`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_getStarsRevenueAdsAccountUrl`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_getStarsRevenueStats`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_getStarsRevenueWithdrawalUrl`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_giveawayInfo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_giveawayInfoResults`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_giveawayInfoResults_layer186`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_launchPrepaidGiveaway`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_paymentForm`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_paymentReceipt`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_paymentReceiptStars`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_paymentResult`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_paymentVerificationNeeded`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_requestRecurringPayment`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_savedInfo`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_payments_savedInfo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_sendPaymentForm`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_starsRevenueAdsAccountUrl`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_payments_starsRevenueAdsAccountUrl`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_starsRevenueStats`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_payments_starsRevenueStats`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_starsRevenueWithdrawalUrl`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_payments_starsRevenueWithdrawalUrl`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_validateRequestedInfo`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_payments_validatedRequestedInfo`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_payments_validatedRequestedInfo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_peerBlocked`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_peerBlocked`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_peerChannel`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_peerChannel_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_peerChat`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_peerChat_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_peerLocated`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_peerSelfLocated`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_peerUser`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_peerUser_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_pendingSuggestion`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_pendingSuggestion`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_phoneConnection`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_phoneConnectionWebrtc`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photoCachedSize`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photoCachedSize_layer127`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photoEmpty`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photoPathSize`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photoSize`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photoSizeEmpty`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photoSizeProgressive`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photoSizeProgressive_layer127`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photoSize_layer127`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photoStrippedSize`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photo_layer115`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photo_layer55`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photo_layer82`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photo_layer97`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photo_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photo_old2`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photos_deletePhotos`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photos_getUserPhotos`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photos_photo`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_photos_photo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photos_photos`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_photos_photosSlice`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_poll`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_pollAnswer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_pollAnswerVoters`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_pollAnswerVoters_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_pollAnswer_layer178`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_pollAnswer_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_pollResults`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_pollResults_layer108`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_pollResults_layer111`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_pollResults_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_pollResults_layer158`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_pollResults_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_poll_layer111`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_poll_layer178`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_poll_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_poll_layer224`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_poll_toDelete`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_popularContact`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_popularContact`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_postAddress`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_postAddress`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_premiumSubscriptionOption`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_premiumSubscriptionOption`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_premiumSubscriptionOption_layer151`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyKeyAbout`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyKeyAddedByPhone`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyKeyBirthday`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyKeyChatInvite`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyKeyForwards`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyKeyNoPaidMessages`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyKeyPhoneNumber`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyKeyPhoneP2P`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyKeySavedMusic`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyKeyStatusTimestamp`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyValueAllowAll`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyValueAllowBots`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyValueAllowChatParticipants`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyValueAllowCloseFriends`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyValueAllowContacts`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyValueAllowPremium`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyValueAllowUsers`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyValueDisallowAll`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyValueDisallowBots`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyValueDisallowChatParticipants`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyValueDisallowContacts`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_privacyValueDisallowUsers`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_quickReply`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_quickReply`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_reactionCount`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_reactionCount_layer144`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_reactionCustomEmoji`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_reactionEmoji`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_reactionEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_reactionPaid`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_readParticipantDate`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_readParticipantDate`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_reastrictionReason`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_receivedNotifyMessage`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_receivedNotifyMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_recentMeUrlChat`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_recentMeUrlChatInvite`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_recentMeUrlUnknown`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_recentMeUrlUser`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_recentStory`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_recentStory`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_replyInlineMarkup`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_replyInlineMarkup_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_replyInlineMarkup_layer228_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_replyKeyboardForceReply`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_replyKeyboardForceReply_layer129`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_replyKeyboardHide`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup_layer129`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_reportMessagesDelivery`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_reportResultAddComment`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_reportResultChooseOption`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_reportResultReported`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_requestPeerTypeBroadcast`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_requestPeerTypeChat`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_requestPeerTypeCreateBot`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_requestPeerTypeUser`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_savedDialog`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_savedMusic`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_savedMusicNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_savedReactionTag`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_savedReactionTag`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_searchResultPosition`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_searchResultPosition`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_searchResultsCalendarPeriod`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_searchResultsCalendarPeriod`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureCredentialsEncrypted`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_secureCredentialsEncrypted`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureData`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_secureData`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureFile`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureFileEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureFile_layer142`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_securePasswordKdfAlgoSHA512`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_securePasswordKdfAlgoUnknown`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_securePlainEmail`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_securePlainPhone`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureRequiredType`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureRequiredTypeOneOf`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValue`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_secureValue`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueError`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueErrorData`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueErrorFile`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueErrorFiles`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueErrorFrontSide`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueErrorReverseSide`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueErrorSelfie`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueErrorTranslationFile`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueErrorTranslationFiles`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueHash`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_secureValueHash`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueTypeAddress`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueTypeBankStatement`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueTypeDriverLicense`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueTypeEmail`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueTypeIdentityCard`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueTypeInternalPassport`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueTypePassport`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueTypePassportRegistration`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueTypePersonalDetails`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueTypePhone`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueTypeRentalAgreement`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueTypeTemporaryRegistration`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureValueTypeUtilityBill`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendAsPeer`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_sendAsPeer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageCancelAction`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageChooseContactAction`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageEmojiInteraction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageEmojiInteractionSeen`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageGamePlayAction`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageGeoLocationAction`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageHistoryImportAction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageRecordRoundAction`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageRecordVideoAction`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageRichMessageDraftAction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageStopDraftAction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageTextDraftAction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageTypingAction`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageUploadDocumentAction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageUploadDocumentAction_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageUploadPhotoAction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageUploadPhotoAction_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageUploadRoundAction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageUploadRoundAction_layer66`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageUploadVideoAction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sendMessageUploadVideoAction_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_shippingOption`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_shippingOption`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_simpleWebViewResultUrl`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_simpleWebViewResultUrl`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sponsoredMessage`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_sponsoredMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sponsoredMessageReportOption`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_sponsoredMessageReportOption`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_sponsoredPeer`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_sponsoredPeer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_starsRevenueStatus`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_starsRevenueStatus`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_statsURL`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_statsURL`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_storage_fileJpeg`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_storage_fileMov`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_storage_fileMp3`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_storage_fileMp4`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_storage_filePartial`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_storage_filePdf`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_storage_filePng`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_storage_fileUnknown`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_storage_fileWebp`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_textWithEntities`
- `static TLJsonDeserialize(TLJsonParser parser)` -> `TL_textWithEntities`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_textWithEntities`
- `equals(@Nullable Object obj)` -> `boolean`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_timezone`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_timezone`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_todoCompletion`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_todoCompletion_layer216`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_topPeer`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_topPeer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_topPeerCategoryBotsApp`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_topPeerCategoryBotsGuestChat`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_topPeerCategoryBotsInline`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_topPeerCategoryBotsPM`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_topPeerCategoryChannels`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_topPeerCategoryCorrespondents`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_topPeerCategoryForwardChats`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_topPeerCategoryForwardUsers`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_topPeerCategoryGroups`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_topPeerCategoryPeers`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_topPeerCategoryPeers`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_updateContactNote`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_updateShort`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_updateShortChatMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_updateShortMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_updateShortSentMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_updates`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_updatesCombined`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_updatesTooLong`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_updates_channelDifference`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_updates_channelDifferenceEmpty`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_updates_channelDifferenceTooLong`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_updates_difference`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_updates_differenceEmpty`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_updates_differenceSlice`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_updates_differenceTooLong`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_updates_getChannelDifference`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_updates_getDifference`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_updates_getState`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_updates_state`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_updates_state`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_upload_cdnFile`
- `freeResources()` -> `void`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_upload_cdnFileReuploadNeeded`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_upload_file`
- `freeResources()` -> `void`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_upload_fileCdnRedirect`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_upload_getCdnFile`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_upload_getCdnFileHashes`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_upload_getFile`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_upload_getFileHashes`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_upload_getWebFile`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_upload_reuploadCdnFile`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_upload_saveBigFilePart`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `freeResources()` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_upload_saveFilePart`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `freeResources()` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_upload_webFile`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_upload_webFile`
- `freeResources()` -> `void`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_urlAuthResultAccepted`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_urlAuthResultDefault`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_urlAuthResultRequest`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_user`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userContact_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userContact_old2`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userDeleted_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userDeleted_old2`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userEmpty`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userEmpty_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userForeign_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userForeign_old2`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer101`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer123`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer134`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer139`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer143`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer150`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer156`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer159`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer162`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer175`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer176`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer188`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer194`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer195`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer199`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer200`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer209`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer210`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer212`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer213`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer215`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer230`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userFull_layer98`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userRequest_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userRequest_old2`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userSelf_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userSelf_old2`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userSelf_old3`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userStatusEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userStatusHidden`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userStatusLastMonth`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userStatusLastMonth_layer171`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userStatusLastWeek`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userStatusLastWeek_layer171`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userStatusOffline`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userStatusOnline`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userStatusRecently`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_userStatusRecently_layer171`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_user_layer104`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_user_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_user_layer144`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_user_layer147`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_user_layer159`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_user_layer165`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_user_layer166`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_user_layer184`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_user_layer185`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_user_layer195`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_user_layer199`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_user_layer216`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_user_layer218`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_user_layer65`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_user_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_username`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_username`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_users`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_usersSlice`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_users_getFullUser`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_users_getUsers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_users_suggestBirthday`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_users_userFull`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_users_userFull`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_videoEmpty_layer45`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_videoEncrypted`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_videoSize`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_videoSizeEmojiMarkup`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_videoSize_layer115`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_videoSize_layer127`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_video_layer45`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_video_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_video_old2`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_video_old3`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_wallPaper`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_wallPaperNoFile`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_wallPaperNoFile_layer128`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_wallPaper_layer94`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webAuthorization`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_webAuthorization`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webDocument`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webDocumentNoProxy`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webDocument_layer81`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPageAttributeAiComposeTone`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPageAttributeStory`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPageAttributeStory_layer162`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPageEmpty`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPageEmpty_layer165`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPageNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPageNotModified_layer110`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPagePending`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPagePending_layer165`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPageUrlPending`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPage_layer104`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPage_layer107`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPage_layer58`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPage_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webViewMessageSent`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_webViewMessageSent`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webViewResultUrl`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_webViewResultUrl`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TodoCompletion`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TodoCompletion`

## `org.telegram.tgnet.TLRPC$TodoItem`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TodoItem`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TodoList`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TodoList`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TopPeerCategory`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TopPeerCategory`

## `org.telegram.tgnet.TLRPC$Update`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Update`
- `static fromConstructor(int constructor)` -> `TLRPC.Update`

## `org.telegram.tgnet.TLRPC$Updates`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Updates`

## `org.telegram.tgnet.TLRPC$UrlAuthResult`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `UrlAuthResult`

## `org.telegram.tgnet.TLRPC$User`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `User`

## `org.telegram.tgnet.TLRPC$UserFull`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `UserFull`
- `getTheme_emoticon()` -> `String`

## `org.telegram.tgnet.TLRPC$UserStatus`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `UserStatus`

## `org.telegram.tgnet.TLRPC$Users`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Users`

## `org.telegram.tgnet.TLRPC$Video`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Video`

## `org.telegram.tgnet.TLRPC$VideoSize`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `VideoSize`
- `static TLdeserialize(long photo_id, long document_id, InputSerializedData stream, int constructor, boolean exception)` -> `VideoSize`

## `org.telegram.tgnet.TLRPC$WallPaper`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `WallPaper`

## `org.telegram.tgnet.TLRPC$WebDocument`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `WebDocument`

## `org.telegram.tgnet.TLRPC$WebPage`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `WebPage`

## `org.telegram.tgnet.TLRPC$WebPageAttribute`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `WebPageAttribute`

## `org.telegram.tgnet.TLRPC$auth_Authorization`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `auth_Authorization`

## `org.telegram.tgnet.TLRPC$auth_CodeType`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `auth_CodeType`

## `org.telegram.tgnet.TLRPC$auth_LoginToken`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `auth_LoginToken`

## `org.telegram.tgnet.TLRPC$auth_SentCode`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `auth_SentCode`

## `org.telegram.tgnet.TLRPC$auth_SentCodeType`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `auth_SentCodeType`

## `org.telegram.tgnet.TLRPC$channels_ChannelParticipants`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `channels_ChannelParticipants`

## `org.telegram.tgnet.TLRPC$channels_SponsoredMessageReportResult`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `channels_SponsoredMessageReportResult`

## `org.telegram.tgnet.TLRPC$contacts_Blocked`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `contacts_Blocked`

## `org.telegram.tgnet.TLRPC$contacts_Contacts`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `contacts_Contacts`

## `org.telegram.tgnet.TLRPC$contacts_SponsoredPeers`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `contacts_SponsoredPeers`

## `org.telegram.tgnet.TLRPC$contacts_TopPeers`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `contacts_TopPeers`

## `org.telegram.tgnet.TLRPC$help_AppConfig`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `help_AppConfig`

## `org.telegram.tgnet.TLRPC$help_AppUpdate`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `help_AppUpdate`

## `org.telegram.tgnet.TLRPC$help_CountriesList`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `help_CountriesList`

## `org.telegram.tgnet.TLRPC$help_DeepLinkInfo`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `help_DeepLinkInfo`

## `org.telegram.tgnet.TLRPC$help_PassportConfig`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `help_PassportConfig`

## `org.telegram.tgnet.TLRPC$help_PromoData`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `help_PromoData`

## `org.telegram.tgnet.TLRPC$help_TermsOfServiceUpdate`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `help_TermsOfServiceUpdate`

## `org.telegram.tgnet.TLRPC$help_UserInfo`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `help_UserInfo`

## `org.telegram.tgnet.TLRPC$help_timezonesList`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `help_timezonesList`

## `org.telegram.tgnet.TLRPC$messages_AvailableEffects`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_AvailableEffects`

## `org.telegram.tgnet.TLRPC$messages_AvailableReactions`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_AvailableReactions`

## `org.telegram.tgnet.TLRPC$messages_BotResults`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_BotResults`

## `org.telegram.tgnet.TLRPC$messages_Chats`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_Chats`

## `org.telegram.tgnet.TLRPC$messages_DhConfig`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_DhConfig`

## `org.telegram.tgnet.TLRPC$messages_Dialogs`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_Dialogs`

## `org.telegram.tgnet.TLRPC$messages_EmojiGroups`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_EmojiGroups`

## `org.telegram.tgnet.TLRPC$messages_ExportedChatInvite`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_ExportedChatInvite`

## `org.telegram.tgnet.TLRPC$messages_Messages`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_Messages`

## `org.telegram.tgnet.TLRPC$messages_Reactions`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_Reactions`

## `org.telegram.tgnet.TLRPC$messages_SavedDialogs`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_SavedDialogs`

## `org.telegram.tgnet.TLRPC$messages_SavedReactionTags`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_SavedReactionTags`

## `org.telegram.tgnet.TLRPC$messages_SentEncryptedMessage`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_SentEncryptedMessage`

## `org.telegram.tgnet.TLRPC$messages_SponsoredMessages`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_SponsoredMessages`

## `org.telegram.tgnet.TLRPC$messages_quickReplies`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `messages_quickReplies`

## `org.telegram.tgnet.TLRPC$payments_GiveawayInfo`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `payments_GiveawayInfo`

## `org.telegram.tgnet.TLRPC$payments_PaymentResult`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `payments_PaymentResult`

## `org.telegram.tgnet.TLRPC$photos_Photos`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `photos_Photos`

## `org.telegram.tgnet.TLRPC$savedDialog`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `savedDialog`

## `org.telegram.tgnet.TLRPC$storage_FileType`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `storage_FileType`

## `org.telegram.tgnet.TLRPC$updates_ChannelDifference`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `updates_ChannelDifference`

## `org.telegram.tgnet.TLRPC$updates_Difference`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `updates_Difference`

## `org.telegram.tgnet.TLRPC$upload_CdnFile`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `upload_CdnFile`

## `org.telegram.tgnet.TLRPC$upload_File`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `upload_File`

## `org.telegram.tgnet.Vector`
- `static TLDeserialize(InputSerializedData stream, int constructor, boolean exception, TLDeserializer<T> deserializer)` -> `Vector<T>`
- `static TLDeserializeInt(InputSerializedData stream, int constructor, boolean exception)` -> `Vector<Int>`
- `static TLDeserializeLong(InputSerializedData stream, int constructor, boolean exception)` -> `Vector<Int>`
- `static deserialize(InputSerializedData stream, TLDeserializer<T> deserializer, boolean exception)` -> `ArrayList<T>`
- `static deserializeByteArray(InputSerializedData stream, boolean exception)` -> `ArrayList<byte[]>`
- `static deserializeInt(InputSerializedData stream, boolean exception)` -> `ArrayList<java.lang.Integer>`
- `static deserializeLong(InputSerializedData stream, boolean exception)` -> `ArrayList<java.lang.Long>`
- `static deserializeString(InputSerializedData stream, boolean exception)` -> `ArrayList<java.lang.String>`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `static serialize(OutputSerializedData stream, final ArrayList<T> objects)` -> `void`
- `static serialize(OutputSerializedData stream, Utilities.Callback<T> write, final ArrayList<T> objects)` -> `void`
- `static serializeByteArray(OutputSerializedData stream, final ArrayList<byte[]> objects)` -> `void`
- `static serializeInt(OutputSerializedData stream, final ArrayList<java.lang.Integer> objects)` -> `void`
- `static serializeLong(OutputSerializedData stream, final ArrayList<java.lang.Long> objects)` -> `void`
- `static serializeString(OutputSerializedData stream, final ArrayList<String> objects)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`
- `toIntArray()` -> `ArrayList<Integer>`

## `org.telegram.tgnet.Vector$Int`
- `static TLDeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Int`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.Vector$Long`
- `static TLDeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Long`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.VectorLegacy`
- `static deserialize_IntAsLong(InputSerializedData stream, boolean exception)` -> `ArrayList<Long>`
- `static deserialize_IntUserIdAsPeer(InputSerializedData stream, boolean exception)` -> `ArrayList<TLRPC.Peer>`
- `static deserialize_LongUserIdAsPeer(InputSerializedData stream, boolean exception)` -> `ArrayList<TLRPC.Peer>`
- `static serialize_LongAsInt(OutputSerializedData stream, ArrayList<Long> objects)` -> `void`
- `static serialize_PeerAsIntUserId(OutputSerializedData stream, ArrayList<TLRPC.Peer> objects)` -> `void`
- `static serialize_PeerAsLongUserId(OutputSerializedData stream, ArrayList<TLRPC.Peer> objects)` -> `void`

## `org.telegram.tgnet.json.TLJsonBuilder`
- `static serialize(@Nullable Serializable serializable)` -> `JSONObject`
- `writeBoolean(String key, boolean value)` -> `void`
- `writeInt32(String key, int value)` -> `void`
- `writeInt64(String key, long value)` -> `void`
- `writeObject(String key, Serializable obj)` -> `void`
- `writeString(String key, String value)` -> `void`
- `writeVector(String key, List<T> objects)` -> `void`

## `org.telegram.tgnet.json.TLJsonParser`
- `readBoolean(String key, boolean defaultValue)` -> `boolean`
- `readInt32(String key, int defaultValue)` -> `int`
- `readInt64(String key, int defaultValue)` -> `long`
- `readObject(String key, Utilities.CallbackReturn<TLJsonParser, T> reader)` -> `T`
- `readString(String key)` -> `String`
- `readString(String key, String defaultValue)` -> `String`
- `readVector(String key, Utilities.CallbackReturn<TLJsonParser, T> reader)` -> `ArrayList<T>`

## `org.telegram.tgnet.tl.TL_account$BusinessAwayMessageSchedule`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `BusinessAwayMessageSchedule`

## `org.telegram.tgnet.tl.TL_account$EmailVerified`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `EmailVerified`

## `org.telegram.tgnet.tl.TL_account$EmojiStatuses`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `EmojiStatuses`

## `org.telegram.tgnet.tl.TL_account$InputPasskeyResponse`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputPasskeyResponse`

## `org.telegram.tgnet.tl.TL_account$Passkey`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Passkey`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$Passkeys`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Passkeys`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$Password`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Password`

## `org.telegram.tgnet.tl.TL_account$ReactionNotificationsFrom`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ReactionNotificationsFrom`

## `org.telegram.tgnet.tl.TL_account$RequirementToContact`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `RequirementToContact`

## `org.telegram.tgnet.tl.TL_account$ResetPasswordResult`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ResetPasswordResult`

## `org.telegram.tgnet.tl.TL_account$SavedMusicIds`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `SavedMusicIds`

## `org.telegram.tgnet.tl.TL_account$SavedRingtone`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `SavedRingtone`

## `org.telegram.tgnet.tl.TL_account$SavedRingtones`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `SavedRingtones`

## `org.telegram.tgnet.tl.TL_account$TL_birthday`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_birthday`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_businessAwayMessage`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_businessAwayMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_businessAwayMessageScheduleAlways`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_businessAwayMessageScheduleCustom`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_businessAwayMessageScheduleOutsideWorkHours`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_businessBotRecipients`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_businessBotRecipients`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_businessBotRights`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_businessBotRights`
- `static all()` -> `TL_businessBotRights`
- `static clone(TL_businessBotRights a)` -> `TL_businessBotRights`
- `equals(@Nullable Object obj)` -> `boolean`
- `static makeDefault()` -> `TL_businessBotRights`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_businessChatLink`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_businessChatLink`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_businessGreetingMessage`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_businessGreetingMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_businessIntro`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_businessIntro`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_businessRecipients`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_businessRecipients`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_businessWeeklyOpen`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_businessWeeklyOpen`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_businessWorkHours`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_businessWorkHours`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_connectedBot`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_connectedBot`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_contactBirthday`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_contactBirthday`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_emailVerified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_emailVerifiedLogin`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_emojiStatuses`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_emojiStatusesNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_inputBusinessAwayMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_inputBusinessBotRecipients`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inputBusinessBotRecipients`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_inputBusinessChatLink`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inputBusinessChatLink`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_inputBusinessGreetingMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_inputBusinessIntro`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inputBusinessIntro`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_inputBusinessRecipients`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inputBusinessRecipients`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_password`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_password_layer144`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_reactionNotificationsFromAll`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_reactionNotificationsFromContacts`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_savedMusicIds`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_savedMusicIdsNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_savedRingtone`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_savedRingtoneConverted`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_savedRingtones`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_savedRingtonesNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_wallPapers`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_wallPapersNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$WallPapers`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `WallPapers`

## `org.telegram.tgnet.tl.TL_account$WebDomainException`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `WebDomainException`
- `static equalsByDomain(WebDomainException a, WebDomainException b)` -> `boolean`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$acceptAuthorization`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$authorizationForm`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `authorizationForm`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$authorizations`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_account.authorizations`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$businessChatLinks`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `businessChatLinks`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$cancelPasswordEmail`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$changePhone`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$checkUsername`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$clearRecentEmojiStatuses`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$confirmBotConnection`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$confirmPasswordEmail`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$confirmPhone`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$connectedBots`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `connectedBots`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$contactBirthdays`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `contactBirthdays`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$createBusinessChatLink`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$declinePasswordReset`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$deleteAccount`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$deleteBusinessChatLink`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$deletePasskey`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$deleteSecureValue`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$disablePeerConnectedBot`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$editBusinessChatLink`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$finishPasskeyLogin`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.auth_Authorization`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getAccountTTL`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getAllSecureValues`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getAuthorizationForm`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getAuthorizations`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getBirthdays`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getBusinessChatLinks`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getChannelDefaultEmojiStatuses`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getChannelRestrictedStatusEmojis`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getConnectedBots`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getContactSignUpNotification`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getDefaultBackgroundEmojis`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getDefaultEmojiStatuses`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getDefaultGroupPhotoEmojis`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getMultiWallPapers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getNotifyExceptions`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getPaidMessagesRevenue`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getPasskeys`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Passkeys`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getPassword`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Password`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getPrivacy`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getRecentEmojiStatuses`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getRequirementsToContact`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getSavedMusicByID`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getSavedMusicIds`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getSavedRingtones`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getSecureValue`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getTmpPassword`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getWallPaper`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getWallPapers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getWebAuthorizations`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getWebPagePreview`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `webPagePreview`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$initPasskeyLogin`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `passkeyLoginOptions`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$initPasskeyRegistration`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `passkeyRegistrationOptions`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$inputPasskeyCredentialPublicKey`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `inputPasskeyCredentialPublicKey`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$inputPasskeyResponseLogin`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$inputPasskeyResponseRegister`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$installWallPaper`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$paidMessagesRevenue`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `paidMessagesRevenue`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$passkeyLoginOptions`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `passkeyLoginOptions`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$passkeyRegistrationOptions`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `passkeyRegistrationOptions`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$privacyRules`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `privacyRules`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$registerDevice`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$registerPasskey`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Passkey`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$reorderUsernames`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$reportPeer`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$requirementToContactEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$requirementToContactPaidMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$requirementToContactPremium`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$resendPasswordEmail`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$resetAuthorization`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$resetPassword`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$resetPasswordFailedWait`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$resetPasswordOk`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$resetPasswordRequestedWait`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$resetWallPapers`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$resetWebAuthorization`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$resetWebAuthorizations`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$resolveBusinessChatLink`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$resolvedBusinessChatLinks`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `resolvedBusinessChatLinks`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$saveRingtone`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$saveSecureValue`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$saveWallPaper`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$sendChangePhoneCode`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$sendConfirmPhoneCode`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$sendVerifyEmailCode`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$sendVerifyPhoneCode`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$sentEmailCode`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `sentEmailCode`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$setAccountTTL`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$setAuthorizationTTL`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$setContactSignUpNotification`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$setPrivacy`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$tmpPassword`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `tmpPassword`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$toggleConnectedBotPaused`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$toggleNoPaidMessagesException`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$toggleSponsoredMessages`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$toggleUsername`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$unregisterDevice`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$updateBirthday`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$updateBusinessAwayMessage`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$updateBusinessGreetingMessage`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$updateBusinessIntro`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$updateBusinessLocation`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$updateBusinessWorkHours`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$updateConnectedBot`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$updateDeviceLocked`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$updateEmojiStatus`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$updatePersonalChannel`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$updateStatus`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$updateUsername`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$uploadRingtone`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$uploadWallPaper`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$verifyEmail`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$verifyPhone`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$webAuthorizations`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `webAuthorizations`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$webPagePreview`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `webPagePreview`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_aicompose$AiComposeTone`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `AiComposeTone`

## `org.telegram.tgnet.tl.TL_aicompose$InputAiComposeTone`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputAiComposeTone`
- `static equals(InputAiComposeTone a, InputAiComposeTone b)` -> `boolean`
- `static from(AiComposeTone tone)` -> `InputAiComposeTone`
- `static fromDefault(String tone)` -> `inputAiComposeToneDefault`

## `org.telegram.tgnet.tl.TL_aicompose$TL_aiComposeTone`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_aicompose$TL_aiComposeToneDefault`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_aicompose$TL_tones`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_aicompose$TL_tonesNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_aicompose$Tones`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Tones`

## `org.telegram.tgnet.tl.TL_aicompose$aiComposeToneExample`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `aiComposeToneExample`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_aicompose$createTone`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `AiComposeTone`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_aicompose$deleteTone`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_aicompose$getTone`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Tones`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_aicompose$getToneExample`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `aiComposeToneExample`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_aicompose$getTones`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Tones`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_aicompose$inputAiComposeToneDefault`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_aicompose$inputAiComposeToneID`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_aicompose$inputAiComposeToneSingleUse`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_aicompose$inputAiComposeToneSlug`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_aicompose$saveTone`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_aicompose$updateTone`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `AiComposeTone`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$BotInfo`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `BotInfo`

## `org.telegram.tgnet.tl.TL_bots$BotMenuButton`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `BotMenuButton`

## `org.telegram.tgnet.tl.TL_bots$BotVerification`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `BotVerification`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$TL_botInfo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$TL_botInfoEmpty_layer48`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$TL_botInfo_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$TL_botInfo_layer139`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$TL_botInfo_layer140`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$TL_botInfo_layer185`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$TL_botInfo_layer192`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$TL_botInfo_layer195`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$TL_botInfo_layer48`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$TL_botMenuButton`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$TL_bots_addUsername`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$TL_bots_removeUsername`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$TL_updateBotMenuButton`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$addPreviewMedia`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$allowSendMessage`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$botPreviewMedia`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `botPreviewMedia`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$botVerification_layer229`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$canSendMessage`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$checkDownloadFileParams`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$checkUsername`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$createBot`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.User`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$deletePreviewMedia`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$editPreviewMedia`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$exportBotToken`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `exportedBotToken`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$exportedBotToken`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `exportedBotToken`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$getAdminedBots`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$getBotInfo`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$getBotMenuButton`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$getBotRecommendations`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$getPopularAppBots`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$getPreviewInfo`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$getPreviewMedias`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$invokeWebViewCustomMethod`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$popularAppBots`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `popularAppBots`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$previewInfo`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `previewInfo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$reorderPreviewMedias`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$reorderUsernames`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$requestedButton`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `requestedButton`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$setBotInfo`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$setBotMenuButton`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$setCustomVerification`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$toggleUserEmojiStatusPermission`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$toggleUsername`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$updateStarRefProgram`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_chatlistInvite`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_chatlistInviteAlready`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_chatlistInvite_layer195`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_chatlistUpdates`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_chatlists_chatlistUpdates`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_checkChatlistInvite`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_deleteExportedInvite`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_editExportedInvite`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_exportChatlistInvite`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_exportedChatlistInvite`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_chatlists_exportedChatlistInvite`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_exportedInvites`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_chatlists_exportedInvites`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_getChatlistUpdates`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_getExportedInvites`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_getLeaveChatlistSuggestions`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_hideChatlistUpdates`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_joinChatlistInvite`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_joinChatlistUpdates`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_leaveChatlist`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_chatlists$TL_exportedChatlistInvite`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_exportedChatlistInvite`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_chatlists$TL_inputChatlistDialogFilter`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inputChatlistDialogFilter`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_chatlists$chatlist_ChatlistInvite`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `chatlist_ChatlistInvite`

## `org.telegram.tgnet.tl.TL_communities$CommunityPeer`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `CommunityPeer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_communities$CommunityPeerRequest`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `CommunityPeerRequest`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_communities$ParticipantJoinedChats`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ParticipantJoinedChats`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_communities$PeerLinkRequests`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PeerLinkRequests`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_communities$TL_communities_create`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_communities$TL_communities_getJoinedCommunities`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.messages_Chats`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_communities$TL_communities_getParticipantJoinedChats`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `ParticipantJoinedChats`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_communities$TL_communities_getPeerLinkRequests`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `PeerLinkRequests`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_communities$TL_communities_toggleAllPeerLinkRequestApproval`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_communities$TL_communities_toggleCommunityCollapsedInDialogs`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_communities$TL_communities_toggleParticipantBanned`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_communities$TL_communities_togglePeerLink`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_communities$TL_communities_togglePeerLinkRequestApproval`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_ephemeral$EphemeralMessage`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `EphemeralMessage`

## `org.telegram.tgnet.tl.TL_ephemeral$TL_deleteAllWelcomeMessages`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_ephemeral$TL_deleteMessage`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_ephemeral$TL_deleteWelcomeMessage`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_ephemeral$TL_editMessage`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_ephemeral$TL_ephemeralMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_ephemeral$TL_ephemeralMessage_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_ephemeral$TL_ephemeralMessage_layer229_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_ephemeral$TL_getWelcomeMessages`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `WelcomeMessages`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_ephemeral$TL_reportMessage`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.ReportResult`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_ephemeral$TL_sendMessage`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_ephemeral$TL_welcomeMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_ephemeral$TL_welcomeMessagesNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_ephemeral$WelcomeMessages`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `WelcomeMessages`

## `org.telegram.tgnet.tl.TL_forum$TL_messages_createForumTopic`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_forum$TL_messages_deleteTopicHistory`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.TL_messages_affectedHistory`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_forum$TL_messages_editForumTopic`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_forum$TL_messages_getForumTopics`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.TL_messages_forumTopics`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_forum$TL_messages_getForumTopicsByID`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.TL_messages_forumTopics`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_forum$TL_messages_reorderPinnedForumTopics`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_forum$TL_messages_updatePinnedForumTopic`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_fragment$InputCollectible`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputCollectible`

## `org.telegram.tgnet.tl.TL_fragment$TL_collectibleInfo`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_collectibleInfo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_fragment$TL_getCollectibleInfo`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_fragment$TL_inputCollectiblePhone`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_fragment$TL_inputCollectibleUsername`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$Page`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Page`

## `org.telegram.tgnet.tl.TL_iv$PageBlock`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PageBlock`

## `org.telegram.tgnet.tl.TL_iv$PageCaption`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PageCaption`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$PageListItem`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PageListItem`

## `org.telegram.tgnet.tl.TL_iv$PageListOrderedItem`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PageListOrderedItem`

## `org.telegram.tgnet.tl.TL_iv$RichMessage`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `RichMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$RichText`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `RichText`

## `org.telegram.tgnet.tl.TL_iv$TL_inputRichMessage`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inputRichMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$TL_page`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$TL_pageFull_layer67`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$TL_pageFull_layer82`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$TL_pageListItemBlocks`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$TL_pageListItemBlocks_226`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$TL_pageListItemText`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$TL_pageListItemText_layer226`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$TL_pageListOrderedItemBlocks`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$TL_pageListOrderedItemBlocks_layer226`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$TL_pageListOrderedItemText`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$TL_pageListOrderedItemText_layer226`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$TL_pagePart_layer67`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$TL_pagePart_layer82`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$TL_page_layer110`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$TL_page_layer88`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$getRichMessage`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.messages_Messages`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$inputPageBlockMap`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockAnchor`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockAuthorDate`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockAuthorDate_layer60`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockBlockquote`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockBlockquoteBlocks`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockBlockquote_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockButtonRow`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockChannel`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockCollage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockCollage_layer82`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockCover`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockDetails`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockDivider`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockDocument`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockEmbed`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockEmbedPost`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockEmbedPost_layer82`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockEmbed_layer60`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockEmbed_layer82`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockFooter`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockHeader`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockHeading1`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockHeading2`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockHeading3`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockHeading4`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockHeading5`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockHeading6`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockKicker`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockList`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockList_layer82`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockMap`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockMath`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockOrderedList`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockOrderedList_layer226`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockParagraph`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockPhoto`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockPhoto_layer82`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockPreformatted`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockPullquote`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockRelatedArticles`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockSlideshow`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockSlideshow_layer82`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockSubheader`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockSubtitle`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockTable`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockThinking`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockTitle`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockUnsupported`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockVideo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageBlockVideo_layer82`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageRelatedArticle`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `pageRelatedArticle`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageTableCell`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `pageTableCell`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$pageTableRow`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `pageTableRow`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textAnchor`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textAutoEmail`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textAutoPhone`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textAutoUrl`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textBankCard`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textBold`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textBotCommand`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textButton`
- `getText()` -> `String`
- `getType()` -> `TL_keyboard.ButtonTypeProto`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textCashtag`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textConcat`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textCustomEmoji`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textDate`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textDiff`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textEmail`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textEmpty`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textFixed`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textHashtag`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textImage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textItalic`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textMarked`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textMath`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textMention`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textMentionName`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textPhone`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textPlain`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textSpoiler`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textStrike`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textSubscript`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textSuperscript`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textTonAddress`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textUnderline`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_iv$textUrl`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$KeyboardButton`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `KeyboardButton`
- `static fromConstructor(int constructor)` -> `KeyboardButton`

## `org.telegram.tgnet.tl.TL_keyboard$KeyboardButtonProto`
- `getData()` -> `default byte[]`
- `getUrl()` -> `default String`

## `org.telegram.tgnet.tl.TL_keyboard$KeyboardButtonRow`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `KeyboardButtonRow`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$KeyboardButtonStyle`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `KeyboardButtonStyle`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$KeyboardInlineButton`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `KeyboardInlineButton`
- `static fromConstructor(int constructor)` -> `KeyboardInlineButton`

## `org.telegram.tgnet.tl.TL_keyboard$KeyboardInlineButtonRow`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `KeyboardInlineButtonRow`
- `static fromConstructor(int constructor)` -> `KeyboardInlineButtonRow`

## `org.telegram.tgnet.tl.TL_keyboard$PageButton`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PageButton`
- `getText()` -> `String`
- `getType()` -> `InlineButtonType`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$RichButtonStyle`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `RichButtonStyle`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_buttonTypeDefault`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_buttonTypeRequestGeoLocation`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_buttonTypeRequestPeer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_buttonTypeRequestPhone`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_buttonTypeRequestPoll`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_buttonTypeSimpleWebView`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inlineButtonTypeBuy`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inlineButtonTypeCopy`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inlineButtonTypeDisabled`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inlineButtonTypeGame`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inlineButtonTypeSwitchInline`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inlineButtonTypeUrl`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inlineButtonTypeUrlAuth`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inlineButtonTypeWebView`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inputButtonTypeRequestPeer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inputInlineButtonTypeUrlAuth`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inputKeyboardButtonRequestPeer_layer221`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inputKeyboardButtonRequestPeer_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inputKeyboardButtonUrlAuth_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inputKeyboardButtonUrlAuth_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButton`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonBuy_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonBuy_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonCopy_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonCopy_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonGame_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonGame_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonRequestGeoLocation_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonRequestGeoLocation_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonRequestPeer_layer168`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonRequestPeer_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonRequestPeer_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonRequestPhone_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonRequestPhone_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonRequestPoll_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonRequestPoll_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonSimpleWebView_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonSimpleWebView_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonSwitchInline_layer157`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonSwitchInline_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonSwitchInline_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonUrlAuth_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonUrlAuth_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonUrl_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonUrl_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonWebView_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonWebView_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButton_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButton_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardInlineButton`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardInlineButtonRow`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardInlineButtonRow_layer228`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardInlineButton_legacy`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_payments$connectStarRefBot`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_payments$connectedBotStarRef`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `connectedBotStarRef`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_payments$connectedStarRefBots`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `connectedStarRefBots`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_payments$editConnectedStarRefBot`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_payments$getConnectedStarRefBot`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_payments$getConnectedStarRefBots`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_payments$getSuggestedStarRefBots`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_payments$starRefProgram`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `starRefProgram`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_payments$suggestedStarRefBots`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `suggestedStarRefBots`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$getGroupParticipants`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$groupParticipants`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `groupParticipants`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$joinAsPeers`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `joinAsPeers`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$saveDefaultSendAs`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_phone$sendSignalingData`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$PaidReactionPrivacy`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PaidReactionPrivacy`
- `getDialogId()` -> `long`

## `org.telegram.tgnet.tl.TL_stars$StarsAmount`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StarsAmount`
- `equals(TL_stars.StarsAmount amount)` -> `boolean`
- `negative()` -> `boolean`
- `static ofStars(long stars)` -> `StarsAmount`
- `positive()` -> `boolean`
- `toDouble()` -> `double`

## `org.telegram.tgnet.tl.TL_stars$StarsStatus`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StarsStatus`

## `org.telegram.tgnet.tl.TL_stars$StarsSubscription`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StarsSubscription`

## `org.telegram.tgnet.tl.TL_stars$StarsTransaction`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StarsTransaction`

## `org.telegram.tgnet.tl.TL_stars$StarsTransactionPeer`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StarsTransactionPeer`

## `org.telegram.tgnet.tl.TL_stars$TL_AuctionBidLevel`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_AuctionBidLevel`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_changeStarsSubscription`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_fulfillStarsSubscription`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_getStarsSubscriptions`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_payments_getStarsGiveawayOptions`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_payments_getStarsStatus`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_payments_getStarsTopupOptions`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_payments_getStarsTransactions`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_payments_sendStarsForm`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.payments_PaymentResult`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_payments_starsStatus`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_payments_starsStatus_layer194`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsAmount`
- `getCurrency()` -> `AmountUtils.Currency`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsGiveawayOption`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_starsGiveawayOption`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsGiveawayWinnersOption`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_starsGiveawayWinnersOption`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsSubscription`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsSubscriptionPricing`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_starsSubscriptionPricing`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsSubscription_layer193`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsSubscription_old`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTonAmount`
- `getCurrency()` -> `AmountUtils.Currency`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTopupOption`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_starsTopupOption`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTransaction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTransactionPeer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTransactionPeerAPI`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTransactionPeerAds`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTransactionPeerAppStore`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTransactionPeerFragment`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTransactionPeerPlayMarket`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTransactionPeerPremiumBot`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTransactionPeerUnsupported`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTransaction_layer181`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTransaction_layer182`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTransaction_layer185`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTransaction_layer186`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTransaction_layer188`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTransaction_layer191`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTransaction_layer194`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTransaction_layer199`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTransaction_layer199_2`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$TL_starsTransaction_layer205`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$Tl_starsRating`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Tl_starsRating`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$paidReactionPrivacyAnonymous`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$paidReactionPrivacyDefault`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$paidReactionPrivacyPeer`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stars$updatePaidMessagesPrice`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$BroadcastRevenueTransaction`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `BroadcastRevenueTransaction`

## `org.telegram.tgnet.tl.TL_stats$PostInteractionCounters`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PostInteractionCounters`

## `org.telegram.tgnet.tl.TL_stats$PublicForward`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PublicForward`

## `org.telegram.tgnet.tl.TL_stats$StatsGraph`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StatsGraph`

## `org.telegram.tgnet.tl.TL_stats$TL_broadcastRevenueStats`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_broadcastRevenueStats`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_broadcastRevenueTransactionProceeds`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_broadcastRevenueTransactionRefund`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_broadcastRevenueTransactionWithdrawal`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_broadcastRevenueTransactions`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_broadcastRevenueTransactions`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_broadcastRevenueWithdrawalUrl`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_broadcastRevenueWithdrawalUrl`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_broadcastStats`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_broadcastStats`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_getBroadcastStats`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_getMegagroupStats`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_getMessagePublicForwards`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_getMessageStats`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_getStoryPublicForwards`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_loadAsyncGraph`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_megagroupStats`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_megagroupStats`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_messageStats`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messageStats`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_postInteractionCountersMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_postInteractionCountersStory`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_publicForwardMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_publicForwards`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_publicForwards`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_statsAbsValueAndPrev`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_statsAbsValueAndPrev`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_statsDateRangeDays`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_statsDateRangeDays`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_statsGetPollStats`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_statsPollStats`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_statsGraph`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_statsGraphAsync`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_statsGraphError`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_statsGroupTopAdmin`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_statsGroupTopAdmin`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_statsGroupTopInviter`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_statsGroupTopInviter`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_statsGroupTopPoster`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_statsGroupTopPoster`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_statsPercentValue`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_statsPercentValue`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stats$TL_statsPollStats`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_statsPollStats`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$Albums`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Albums`

## `org.telegram.tgnet.tl.TL_stories$Boost`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Boost`

## `org.telegram.tgnet.tl.TL_stories$MediaArea`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `MediaArea`

## `org.telegram.tgnet.tl.TL_stories$MediaAreaCoordinates`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `MediaAreaCoordinates`

## `org.telegram.tgnet.tl.TL_stories$PeerStories`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PeerStories`

## `org.telegram.tgnet.tl.TL_stories$PrepaidGiveaway`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PrepaidGiveaway`

## `org.telegram.tgnet.tl.TL_stories$StoryFwdHeader`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StoryFwdHeader`

## `org.telegram.tgnet.tl.TL_stories$StoryItem`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StoryItem`

## `org.telegram.tgnet.tl.TL_stories$StoryReaction`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StoryReaction`

## `org.telegram.tgnet.tl.TL_stories$StoryView`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StoryView`

## `org.telegram.tgnet.tl.TL_stories$StoryViews`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StoryViews`

## `org.telegram.tgnet.tl.TL_stories$StoryViewsList`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `StoryViewsList`

## `org.telegram.tgnet.tl.TL_stories$TL_albums`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_albumsNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_boost`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_boost_layer186`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_createAlbum`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_storyAlbum`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_deleteAlbum`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_exportedStoryLink`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_exportedStoryLink`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_foundStories`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_foundStories`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_foundStory`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_foundStory`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_geoPointAddress`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_geoPointAddress`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`
- `toString()` -> `String`

## `org.telegram.tgnet.tl.TL_stories$TL_getAlbums`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Albums`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_getStoryReactionsList`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_inputMediaAreaChannelPost`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_inputMediaAreaVenue`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_mediaAreaChannelPost`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_mediaAreaCoordinates`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_mediaAreaCoordinates_layer181`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_mediaAreaGeoPoint`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_mediaAreaGeoPoint_layer181`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_mediaAreaSuggestedReaction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_mediaAreaUrl`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_mediaAreaVenue`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_mediaAreaWeather`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_mediaAreaWeather2`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_mediaAreaWeatherOld`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_myBoost`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_myBoost`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_peerStories`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_peerStories_layer162`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_premium_applyBoost`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_premium_boostsList`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_premium_boostsList`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_premium_boostsStatus`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_premium_boostsStatus`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_premium_getBoostsList`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_premium_getBoostsStatus`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_premium_getMyBoosts`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_premium_myBoosts`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_premium_myBoosts`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_prepaidGiveaway`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_prepaidStarsGiveaway`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_publicForwardStory`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_reorderAlbums`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_startLive`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stats_getStoryStats`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stats_storyStats`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_stats_storyStats`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storiesStealthMode`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_storiesStealthMode`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_activateStealthMode`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_allStories`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_allStoriesNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_canSendStory`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_deleteStories`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_editStory`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_exportStoryLink`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_getAlbumStories`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_stories_stories`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_getAllReadPeerStories`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_getAllStories`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_getChatsToSend`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_getPeerMaxIDs`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Vector<TLRPC.TL_recentStory>`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_getPeerStories`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_getPinnedStories`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_getStoriesArchive`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_getStoriesByID`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_getStoriesViews`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_getStoryViewsList`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_incrementStoryViews`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_peerStories`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_stories_peerStories`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_readStories`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_report`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.ReportResult`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_searchPosts`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_sendReaction`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_sendStory`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_stories`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_stories_stories`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_storyViews`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_stories_storyViews`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_stories_togglePeerStoriesHidden`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyAlbum`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_storyAlbum`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyFwdHeader`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyItem`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyItemDeleted`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyItemSkipped`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyItem_layer160`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyItem_layer166`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyItem_layer174`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyItem_layer210`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyItem_layer223`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyReaction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyReactionPublicForward`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyReactionPublicRepost`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyReactionsList`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_storyReactionsList`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyView`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyViewPublicForward`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyViewPublicRepost`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyViews`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyViewsList`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyViewsList_layer167`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyViews_layer160`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyViews_layer161`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_togglePinnedToTop`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_updateAlbum`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_storyAlbum`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_updateReadStories`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_updateStoriesStealthMode`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_updateStory`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$canSendStoryCount`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `canSendStoryCount`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$stories_AllStories`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `stories_AllStories`

## `org.telegram.tgnet.tl.TL_stories$togglePinned`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_toncenter$apiResponse`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `apiResponse`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_toncenter$createOnrampSession`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `onrampSession`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_toncenter$getOnrampAvailability`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `onrampAvailability`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_toncenter$getOnrampBaseCurrencies`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `onrampBaseCurrencies`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_toncenter$getOnrampLimits`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `onrampLimits`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_toncenter$getOnrampProviders`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Vector<onrampProviderInfo>`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_toncenter$getOnrampQuote`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `onrampQuote`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_toncenter$getStreamingUrl`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `streamingUrl`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_toncenter$onrampAvailability`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `onrampAvailability`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_toncenter$onrampBaseCurrencies`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `onrampBaseCurrencies`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_toncenter$onrampLimits`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `onrampLimits`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_toncenter$onrampMethodAvailability`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `onrampMethodAvailability`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_toncenter$onrampProviderInfo`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `onrampProviderInfo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_toncenter$onrampQuote`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `onrampQuote`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_toncenter$onrampSession`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `onrampSession`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_toncenter$performApiRequest`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `apiResponse`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_toncenter$streamingUrl`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `streamingUrl`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateAiComposeTones`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateAttachMenuBots`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateBotCommands`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateBotPurchasedPaidMedia`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateBotSubscriptionExpire`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateChannel`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateChannelAvailableMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateChannelMessageForwards`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateChannelMessageViews`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateChannelParticipant`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateChannelReadMessagesContents`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateChannelTooLong`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateChannelUserTyping`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateChannelViewForumAsMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateChannelWebPage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateChat`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateChatDefaultBannedRights`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateChatParticipantAdd`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateChatParticipantAdmin`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateChatParticipantDelete`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateChatParticipantRank`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateChatParticipants`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateChatUserTyping`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateConfig`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateContactsReset`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateDcOptions`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateDeleteChannelMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateDeleteEphemeralMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateDeleteMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateDeleteQuickReply`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateDeleteQuickReplyMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateDeleteScheduledMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateDialogFilter`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateDialogFilterOrder`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateDialogFilters`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateDialogPinned`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateDialogUnreadMark`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateDraftMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateEditChannelMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateEditEphemeralMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateEditMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateEmojiGameInfo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateEncryptedChatTyping`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateEncryptedMessagesRead`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateEncryption`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateFolderPeers`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateGeoLiveViewed`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateJoinChatWebViewDecision`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateLangPack`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateLangPackTooLong`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateLoginToken`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateManagedBot`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateMessageExtendedMedia`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateMessageID`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateMessagePoll`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateMessagePollVote`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateMessageReactions`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateMonoForumNoPaidException`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateNewAuthorization`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateNewBotConnection`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateNewChannelMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateNewEncryptedMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateNewEphemeralMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateNewMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateNewQuickReply`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateNewScheduledMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateNewStoryReaction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updatePaidReactionPrivacy`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updatePeerBlocked`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updatePeerHistoryTTL`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updatePeerLocated`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updatePeerWallpaper`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updatePendingJoinRequests`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updatePinnedChannelMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updatePinnedDialogs`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updatePinnedForumTopic`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updatePinnedForumTopics`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updatePinnedMessages`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updatePinnedSavedDialogs`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updatePrivacy`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateQuickReplies`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateQuickReplyMessage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateReadChannelDiscussionInbox`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateReadChannelDiscussionOutbox`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateReadChannelInbox`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateReadChannelOutbox`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateReadHistoryInbox`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateReadHistoryOutbox`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateReadMessagesContents`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateReadMonoForumInbox`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateReadMonoForumOutbox`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateRecentEmojiStatuses`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateRecentReactions`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateSavedDialogPinned`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateSavedReactionTags`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateSavedRingtones`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateSentPhoneCode`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateSentStoryReaction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateSentWalletTransaction`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateServiceNotification`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateStarsBalance`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateStarsRevenueStatus`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateStoryID`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateUser`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateUserEmojiStatus`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateUserName`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateUserPhone`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateUserPhoto`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateUserStatus`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateUserTyping`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateWalletGaslessInfo`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateWalletState`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateWalletTonConnectPendingDisconnect`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateWalletTonConnectSession`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateWebBrowserException`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateWebPage`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateWebViewResultSent`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$InputWalletReplacement`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputWalletReplacement`

## `org.telegram.tgnet.tl.TL_wallet$TL_walletState`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$TL_walletStateEmpty`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$WalletState`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `WalletState`

## `org.telegram.tgnet.tl.TL_wallet$WalletTransactionPeer`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `WalletTransactionPeer`
- `equals(@Nullable Object obj)` -> `boolean`

## `org.telegram.tgnet.tl.TL_wallet$currencyRate`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `currencyRate`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$currencyRates`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `currencyRates`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$disableBackup`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `WalletState`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$enableBackup`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `WalletState`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$encryptedSecretPhrasePart`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `encryptedSecretPhrasePart`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$existingBalance`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `existingBalance`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$exportSecretPhrase`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `secretPhraseParts`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$fetchEncryptedSecretPhrasePart`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `encryptedSecretPhrasePart`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$getBackupHolderDcs`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Vector<holderDc>`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$getCurrencyRates`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `currencyRates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$getExistingWaltBalance`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `existingBalance`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$getGaslessInfo`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$getNfts`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `nftItems`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$getProofChallenge`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `proofChallenge`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$getState`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `WalletState`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$getTransactions`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `walletTransactions`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$getTransactionsByIDs`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `walletTransactions`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$getTransactionsByMsgHash`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `walletTransactions`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$getUserAddresses`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `userAddresses`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$holderDc`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `holderDc`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$inputTonConnectOauthSession`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `inputTonConnectOauthSession`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$inputWalletImported`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$inputWalletNew`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$mnemonic_decryptedKeyPart`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `mnemonic_decryptedKeyPart`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$nftAttribute`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `nftAttribute`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$nftItem`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `nftItem`
- `isGift()` -> `boolean`
- `isPhoneNumber()` -> `boolean`
- `isUsername()` -> `boolean`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$nftItems`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `nftItems`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$proofChallenge`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `proofChallenge`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$replaceWallet`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `WalletState`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$secretPhraseParts`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `secretPhraseParts`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$sendTransfer`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$tonConnectChallenge`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `tonConnectChallenge`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$tonConnectClaimRequest`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$tonConnectCloseSession`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$tonConnectCreateSession`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `tonConnectSession`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$tonConnectGetNextEventId`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `tonConnectNextEventId`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$tonConnectGetPending`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `tonConnectPending`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$tonConnectGetSessions`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `tonConnectSessions`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$tonConnectManifest`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `tonConnectManifest`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$tonConnectNextEventId`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `tonConnectNextEventId`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$tonConnectPending`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `tonConnectPending`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$tonConnectRegisterKey`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `tonConnectChallenge`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$tonConnectRequest`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `tonConnectRequest`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$tonConnectSession`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `tonConnectSession`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$tonConnectSessions`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `tonConnectSessions`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$tonConnectSubmitConnectResult`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$tonConnectSubmitResponse`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Bool`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$userAddresses`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `userAddresses`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$walletOwnershipProof`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `walletOwnershipProof`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$walletTransaction`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `walletTransaction`
- `equals(@Nullable Object obj)` -> `boolean`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`
- `set(walletTransaction t)` -> `boolean`

## `org.telegram.tgnet.tl.TL_wallet$walletTransactionPeerAddress`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$walletTransactionPeerOnramp`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$walletTransactionPeerUnsupported`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$walletTransactionPeerUser`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$walletTransactions`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `walletTransactions`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_wallet$walletUserAddress`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `walletUserAddress`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.legacy.TL_legacy_message$TL_message_layer118`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.legacy.TL_legacy_message$TL_message_layer123`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.legacy.TL_legacy_message$TL_message_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.legacy.TL_legacy_message$TL_message_layer135`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.legacy.TL_legacy_message$TL_message_layer169`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.legacy.TL_legacy_message$TL_message_layer173`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.legacy.TL_legacy_message$TL_message_layer175`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.legacy.TL_legacy_message$TL_message_layer176`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.legacy.TL_legacy_message$TL_message_layer179`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.legacy.TL_legacy_message$TL_message_layer180`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.legacy.TL_legacy_message$TL_message_layer195`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.legacy.TL_legacy_message$TL_message_layer199`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.legacy.TL_legacy_message$TL_message_layer205`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.legacy.TL_legacy_message$TL_message_layer216`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.legacy.TL_legacy_message$TL_message_layer220`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.legacy.TL_legacy_message$TL_message_layer222`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.legacy.TL_legacy_message$TL_message_layer224`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.legacy.TL_legacy_message$TL_message_layer226`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`
