# function / chat (758 методов)

## `org.telegram.messenger.MessageObject`
- `addEntitiesToText(CharSequence text, boolean photoViewer, boolean useManualParse)` -> `boolean`
- `static addEntitiesToText(CharSequence text, ArrayList<TLRPC.MessageEntity> entities, boolean out, boolean usernames, boolean photoViewer, boolean useManualParse)` -> `boolean`
- `static addEntitiesToText(CharSequence text, ArrayList<TLRPC.MessageEntity> entities, boolean out, boolean usernames, boolean photoViewer, boolean useManualParse, int allowed)` -> `boolean`
- `static addLinks(boolean isOut, CharSequence messageText)` -> `void`
- `static addLinks(boolean isOut, CharSequence messageText, boolean botCommands, boolean check)` -> `void`
- `static addLinks(boolean isOut, CharSequence messageText, boolean botCommands, boolean check, boolean internalOnly)` -> `void`
- `addPaidReactions(int amount, boolean chosen, long peer)` -> `void`
- `static addPaidReactions(int currentAccount, TLRPC.MessageReactions reactions, int amount, long peer, boolean chosen)` -> `void`
- `static addPhoneLinks(CharSequence messageText)` -> `void`
- `static addUrlsByPattern(boolean isOut, CharSequence charSequence, boolean botCommands, int patternType, int duration, boolean check)` -> `void`
- `applyMediaExistanceFlags(int flags)` -> `void`
- `applyNewText()` -> `void`
- `applyNewText(CharSequence text)` -> `void`
- `applyQuickReply(String name, int id)` -> `void`
- `applyTimestampsHighlightForReplyMsg()` -> `void`
- `applyTimestampsHighlightForReplyMsg(CharSequence text)` -> `void`
- `areTags()` -> `boolean`
- `canAppendToTodo()` -> `boolean`
- `static canAutoplayAnimatedSticker(TLRPC.Document document)` -> `boolean`
- `canBeSensitive()` -> `boolean`
- `canCompleteTodo()` -> `boolean`
- `static canCreateStripedThubms()` -> `boolean`
- `canDeleteMessage(boolean inScheduleMode, TLRPC.Chat chat)` -> `boolean`
- `static canDeleteMessage(int currentAccount, boolean inScheduleMode, TLRPC.Message message, TLRPC.Chat chat)` -> `boolean`
- `canEditMedia()` -> `boolean`
- `canEditMessage(TLRPC.Chat chat)` -> `boolean`
- `static canEditMessage(int currentAccount, TLRPC.Message message, TLRPC.Chat chat, boolean scheduled)` -> `boolean`
- `canEditMessageAnytime(TLRPC.Chat chat)` -> `boolean`
- `static canEditMessageAnytime(int currentAccount, TLRPC.Message message, TLRPC.Chat chat)` -> `boolean`
- `canEditMessageScheduleTime(TLRPC.Chat chat)` -> `boolean`
- `static canEditMessageScheduleTime(int currentAccount, TLRPC.Message message, TLRPC.Chat chat)` -> `boolean`
- `canForwardMessage()` -> `boolean`
- `canPreviewDocument()` -> `boolean`
- `static canPreviewDocument(TLRPC.Document document)` -> `boolean`
- `canSetReaction()` -> `boolean`
- `static canShowVotersList(TLRPC.TL_messageMediaPoll mediaPoll)` -> `boolean`
- `canStreamVideo()` -> `boolean`
- `canUnvote()` -> `boolean`
- `static canUnvote(TLRPC.TL_messageMediaPoll mediaPoll)` -> `boolean`
- `canViewThread()` -> `boolean`
- `static channelSpan()` -> `CharSequence`
- `checkBigAnimatedEmoji()` -> `void`
- `checkForScam()` -> `void`
- `checkLayout()` -> `boolean`
- `checkMediaExistance()` -> `void`
- `checkMediaExistance(boolean useFileDatabaseQueue)` -> `void`
- `static checkboxSpan(boolean enabled)` -> `SpannableStringBuilder`
- `static containsUrls(CharSequence message)` -> `boolean`
- `copyStableParams(MessageObject old)` -> `void`
- `createMediaThumbs()` -> `void`
- `createMessageSendInfo()` -> `void`
- `createMessageSendInfo(boolean force)` -> `void`
- `createStrippedThumb()` -> `void`
- `static cutIntoRanges(CharSequence text, ArrayList<TextRange> ranges)` -> `void`
- `didSpoilLoginCode()` -> `boolean`
- `doesPaidReactionExist()` -> `boolean`
- `ensurePaidReactionsExist(boolean chosen)` -> `boolean`
- `static ephemeralMessageIdPack(int id)` -> `int`
- `static ephemeralMessageIdUnpack(int id)` -> `int`
- `equals(MessageObject obj)` -> `boolean`
- `expandChannelRecommendations(boolean expand)` -> `void`
- `static expandedQuotesEquals(HashSet<Integer> a, HashSet<Integer> b)` -> `boolean`
- `static findAnimatedEmojiEmoticon(TLRPC.Document document)` -> `String`
- `static findAnimatedEmojiEmoticon(TLRPC.Document document, String fallback)` -> `String`
- `static findAnimatedEmojiEmoticon(TLRPC.Document document, String fallback, Integer currentAccountForFull)` -> `String`
- `static findAudio(TL_iv.RichMessage rich_message)` -> `TLRPC.Document`
- `static findAudio(ArrayList<TL_iv.PageBlock> blocks, TL_iv.RichMessage rich_message)` -> `TLRPC.Document`
- `static findPhoto(TL_iv.RichMessage rich_message)` -> `TLRPC.Photo`
- `static findPhoto(ArrayList<TL_iv.PageBlock> blocks, TL_iv.RichMessage rich_message)` -> `TLRPC.Photo`
- `static findPollItem(MessageObject messageObject, byte[] task_id)` -> `TLRPC.PollAnswer`
- `static findQuoteStart(String text, String quote, int quote_offset)` -> `int`
- `static findStickerEmoticons(TLRPC.Document document, Integer currentAccountForFull)` -> `ArrayList<String>`
- `static findTodoItem(MessageObject messageObject, int task_id)` -> `TLRPC.TodoItem`
- `static findVideo(TL_iv.RichMessage rich_message)` -> `TLRPC.Document`
- `static findVideo(ArrayList<TL_iv.PageBlock> blocks, TL_iv.RichMessage rich_message)` -> `TLRPC.Document`
- `static fixMessagePeer(ArrayList<TLRPC.Message> messages, long channelId)` -> `void`
- `static formatRichBlock(TL_iv.PageBlock block, boolean isOut, boolean photoViewer, int maxLength, SpannableStringBuilder out, TL_iv.RichMessage richMessage)` -> `CharSequence`
- `static formatRichMessage(TL_iv.RichMessage richMessage, boolean isOut)` -> `CharSequence`
- `static formatRichMessage(TL_iv.RichMessage richMessage, boolean isOut, boolean photoViewer, int maxLength)` -> `CharSequence`
- `static formatRichText(TL_iv.RichText text, boolean isOut, boolean photoViewer, int maxLength, SpannableStringBuilder out, int flags)` -> `CharSequence`
- `static formatTextWithEntities(TLRPC.TL_textWithEntities text, boolean out, boolean photoViewer, TextPaint paint)` -> `CharSequence`
- `generateCaption()` -> `void`
- `generateExplanation()` -> `void`
- `generateGameMessageText(TLRPC.User fromUser)` -> `void`
- `generateLayout(TLRPC.User fromUser)` -> `void`
- `generateLinkDescription()` -> `void`
- `generatePaymentSentMessageText(TLRPC.User fromUser, boolean me)` -> `void`
- `generatePinMessageText(TLRPC.User fromUser, TLRPC.Chat chat)` -> `void`
- `generateSuggestionApprovalMessageText()` -> `void`
- `generateThumbs(boolean update)` -> `void`
- `getApproximateHeight()` -> `int`
- `getApproximateHeight(boolean fast)` -> `int`
- `getApproximateHeightCached()` -> `int`
- `getArtworkUrl(boolean small)` -> `String`
- `static getArtworkUrl(TLRPC.Document document, boolean small)` -> `String`
- `getChannelId()` -> `long`
- `static getChannelId(TLRPC.Message message)` -> `long`
- `getChatId()` -> `long`
- `static getChatId(TLRPC.Message message)` -> `long`
- `getChatMode()` -> `int`
- `getChoosenReactions()` -> `ArrayList<ReactionsLayoutInBubble.VisibleReaction>`
- `static getCompletionsCount(TLRPC.TL_messageMediaToDo media)` -> `int`
- `getDialogId()` -> `long`
- `static getDialogId(TLRPC.Message message)` -> `long`
- `getDiceEmoji()` -> `String`
- `getDiceEmoji(TLRPC.TL_messageMediaDice dice)` -> `String`
- `getDiceValue()` -> `int`
- `getDisplayRichMessage()` -> `TL_iv.RichMessage`
- `getDocument()` -> `TLRPC.Document`
- `static getDocument(TLRPC.Message message)` -> `TLRPC.Document`
- `static getDocumentDuration(TLRPC.Document document)` -> `double`
- `getDocumentFast()` -> `TLRPC.Document`
- `getDocumentName()` -> `String`
- `static getDocumentVideoThumb(TLRPC.Document document)` -> `TLRPC.VideoSize`
- `getDuration()` -> `double`
- `getEditedSuggestionFlags()` -> `int`
- `getEffect()` -> `TLRPC.TL_availableEffect`
- `getEffectId()` -> `long`
- `static getEmoji(TLRPC.Document document)` -> `String`
- `getEmojiOnlyCount()` -> `int`
- `getEntities()` -> `ArrayList<TLRPC.MessageEntity>`
- `getEphemeralId()` -> `int`
- `getEphemeralReceiverBotId()` -> `long`
- `getExtension()` -> `String`
- `getFactCheck()` -> `TLRPC.TL_factCheck`
- `getFactCheckText()` -> `CharSequence`
- `getFileName()` -> `String`
- `static getFileName(TLRPC.Message messageOwner)` -> `String`
- `static getFileName(TLRPC.Document document)` -> `String`
- `static getFileName(TLRPC.MessageMedia media)` -> `String`
- `getFileNameFast()` -> `String`
- `getForwardedFromId()` -> `Long`
- `getForwardedFromPeerObject()` -> `TLObject`
- `getForwardedName()` -> `String`
- `static getFromChatId(TLRPC.Message message)` -> `long`
- `getFromChatId()` -> `long`
- `getFromPeer()` -> `TLRPC.Peer`
- `getFromPeerObject()` -> `TLObject`
- `getGroupId()` -> `long`
- `getGroupIdForUse()` -> `long`
- `getId()` -> `int`
- `getInlineBotButtons()` -> `BotInlineKeyboard.Source`
- `static getInlineResultDuration(TLRPC.BotInlineResult inlineResult)` -> `int`
- `static getInlineResultWidthAndHeight(TLRPC.BotInlineResult inlineResult)` -> `int[]`
- `static getInputStickerSet(TLRPC.Message message)` -> `TLRPC.InputStickerSet`
- `static getInputStickerSet(TLRPC.Document document)` -> `TLRPC.InputStickerSet`
- `getInputStickerSet()` -> `TLRPC.InputStickerSet`
- `getLastLineWidth()` -> `int`
- `static getMedia(MessageObject messageObject)` -> `TLRPC.MessageMedia`
- `static getMedia(TLRPC.Message messageOwner)` -> `TLRPC.MessageMedia`
- `static getMedia(TLRPC.Message messageOwner, Class<T> tClass)` -> `T`
- `getMediaExistanceFlags()` -> `int`
- `static getMediaSize(TLRPC.MessageMedia media)` -> `long`
- `getMediaTitle(TLRPC.MessageMedia media)` -> `CharSequence`
- `getMediaType()` -> `int`
- `static getMessageSize(TLRPC.Message message)` -> `long`
- `getMessageTextToTranslate(GroupedMessages groupedMessages, int[] messageIdToTranslate)` -> `CharSequence`
- `getMimeType()` -> `String`
- `getMonoForumTopicId()` -> `long`
- `static getMonoForumTopicId(TLRPC.Message message)` -> `long`
- `getMusicAuthor()` -> `String`
- `getMusicAuthor(boolean unknown)` -> `String`
- `static getMusicAuthor(TLRPC.Document document, boolean unknown)` -> `String`
- `getMusicTitle()` -> `String`
- `getMusicTitle(boolean unknown)` -> `String`
- `static getMusicTitle(TLRPC.Document document, boolean unknown)` -> `String`
- `getMyPaidReactionPeer()` -> `Long`
- `static getMyPaidReactionPeer(TLRPC.MessageReactions reactions)` -> `Long`
- `static getObjectPeerId(TLObject peer)` -> `long`
- `static getPeerId(TLRPC.Peer peer)` -> `long`
- `getPeerObject()` -> `TLObject`
- `static getPeerObjectName(TLObject object)` -> `String`
- `getPhoto()` -> `TLRPC.Photo`
- `static getPhoto(TLRPC.Message message)` -> `TLRPC.Photo`
- `getPollHash()` -> `long`
- `getPollId()` -> `long`
- `static getPollResult(TLRPC.TL_messageMediaPoll mediaPoll, byte[] option)` -> `TLRPC.PollAnswerVoters`
- `getPremiumStickerAnimation()` -> `TLRPC.VideoSize`
- `static getPremiumStickerAnimation(TLRPC.Document document)` -> `TLRPC.VideoSize`
- `getProgress()` -> `float`
- `getQuickReplyDisplayName()` -> `String`
- `static getQuickReplyId(TLRPC.Message message)` -> `int`
- `static getQuickReplyId(int currentAccount, TLRPC.Message message)` -> `int`
- `getQuickReplyId()` -> `int`
- `static getQuickReplyName(TLRPC.Message message)` -> `String`
- `getQuickReplyName()` -> `String`
- `getRandomUnreadReaction()` -> `TLRPC.MessagePeerReaction`
- `getRealId()` -> `int`
- `getRepliesCount()` -> `int`
- `getReplyAnyMsgId()` -> `int`
- `getReplyMsgId()` -> `int`
- `getReplyQuoteNameWithIcon()` -> `CharSequence`
- `static getReplyToDialogId(TLRPC.Message message)` -> `long`
- `getReplyTopMsgId()` -> `int`
- `getReplyTopMsgId(boolean sureIsForum)` -> `int`
- `getSavedDialogId()` -> `long`
- `static getSavedDialogId(long self, TLRPC.Message message)` -> `long`
- `static getSavedDialogPeer(long self, TLRPC.Message message)` -> `TLRPC.Peer`
- `getSecretTimeLeft()` -> `int`
- `getSecretTimeString()` -> `CharSequence`
- `getSenderId()` -> `long`
- `getSize()` -> `long`
- `getStakedDiceAmount()` -> `long`
- `static getStakedDiceWinAmount(TLRPC.TL_messageMediaDice media)` -> `long`
- `getStakedDiceWinAmount()` -> `long`
- `getStickerChar()` -> `String`
- `getStickerEmoji()` -> `String`
- `static getStickerSetId(TLRPC.Document document)` -> `long`
- `static getStickerSetName(TLRPC.Document document)` -> `String`
- `getStoryMentionWebpage()` -> `TLRPC.WebPage`
- `getTextPaint()` -> `TextPaint`
- `getTopicId()` -> `long`
- `static getTopicId(int currentAccount, TLRPC.Message message, int sureIsForumTypeFlags)` -> `long`
- `static getTopicId(int currentAccount, TLRPC.Message message, boolean sureIsForum)` -> `long`
- `static getUnreadFlags(TLRPC.Message message)` -> `int`
- `static getVideoCodec(TLRPC.Document document)` -> `String`
- `getVideoCover()` -> `TLRPC.Photo`
- `static getVideoHeight(TLRPC.Document document)` -> `int`
- `getVideoSavedProgress()` -> `float`
- `getVideoStartsTimestamp()` -> `int`
- `static getVideoWidth(TLRPC.Document document)` -> `int`
- `getVoiceTranscription()` -> `CharSequence`
- `getWaveform()` -> `byte[]`
- `static getWebDocumentDuration(TLRPC.WebDocument document)` -> `double`
- `static getWebDocumentWidthAndHeight(TLRPC.WebDocument document)` -> `int[]`
- `getWebPagePhotos(ArrayList<MessageObject> array, ArrayList<TL_iv.PageBlock> blocksToSearch)` -> `ArrayList<MessageObject>`
- `static groupSpan()` -> `CharSequence`
- `hasAttachedStickers()` -> `boolean`
- `hasChosenReaction(ReactionsLayoutInBubble.VisibleReaction reaction)` -> `boolean`
- `hasEntitiesFromServer()` -> `boolean`
- `hasExtendedMedia()` -> `boolean`
- `hasExtendedMediaPreview()` -> `boolean`
- `hasHighlightedWords()` -> `boolean`
- `hasInlineBotButtons()` -> `boolean`
- `hasLinkMediaToMakeSmall()` -> `boolean`
- `hasMediaSpoilers()` -> `boolean`
- `hasPaidMediaPreview()` -> `boolean`
- `hasReaction(ReactionsLayoutInBubble.VisibleReaction reaction)` -> `boolean`
- `hasReactions()` -> `boolean`
- `hasReplies()` -> `boolean`
- `hasRevealedExtendedMedia()` -> `boolean`
- `hasSuggestionInlineButtons()` -> `boolean`
- `static hasUnreadReactions(TLRPC.Message message)` -> `boolean`
- `static hasUnreadReactions(TLRPC.TL_messageReactions reactions)` -> `boolean`
- `hasValidGroupId()` -> `boolean`
- `hasValidGroupIdFast()` -> `boolean`
- `hasValidReplyMessageObject()` -> `boolean`
- `hasVideoCover()` -> `boolean`
- `hasVideoQualities()` -> `boolean`
- `hasVideoQualities(boolean useFileDatabaseQueue)` -> `boolean`
- `hasVoteResults()` -> `boolean`
- `isAlbumSingle()` -> `boolean`
- `isAndroidTheme()` -> `boolean`
- `isAnimatedAnimatedEmoji()` -> `boolean`
- `static isAnimatedEmoji(TLRPC.Document document)` -> `boolean`
- `isAnimatedEmoji()` -> `boolean`
- `isAnimatedEmojiStickerSingle()` -> `boolean`
- `isAnimatedEmojiStickers()` -> `boolean`
- `isAnimatedSticker()` -> `boolean`
- `static isAnimatedStickerDocument(TLRPC.Document document)` -> `boolean`
- `static isAnimatedStickerDocument(TLRPC.Document document, boolean allowWithoutSet)` -> `boolean`
- `static isAnimatedStickerMessage(TLRPC.Message message)` -> `boolean`
- `isAnyGift()` -> `boolean`
- `isAnyKindOfSticker()` -> `boolean`
- `static isAnyKindOfStickerOrEmoji(TLRPC.Document document)` -> `boolean`
- `static isBlueBlock(TL_iv.PageBlock block)` -> `boolean`
- `isBotPreview()` -> `boolean`
- `isComments()` -> `boolean`
- `static isCompleted(MessageObject messageObject, int taskId)` -> `boolean`
- `static isCompleted(TLRPC.TL_messageMediaToDo mediaTodo, int taskId)` -> `boolean`
- `isConferenceCall()` -> `boolean`
- `isContentUnread()` -> `boolean`
- `static isContentUnread(TLRPC.Message message)` -> `boolean`
- `isCurrentWallpaper()` -> `boolean`
- `isDice()` -> `boolean`
- `isDocument()` -> `boolean`
- `static isDocumentHasAttachedStickers(TLRPC.Document document)` -> `boolean`
- `static isDocumentHasThumb(TLRPC.Document document)` -> `boolean`
- `isEdited()` -> `boolean`
- `isEditedSuggestionOffer()` -> `boolean`
- `isEditing()` -> `boolean`
- `isEditingMedia()` -> `boolean`
- `isEmbedVideo()` -> `boolean`
- `isEphemeral()` -> `boolean`
- `static isEphemeral(TLRPC.Message message)` -> `boolean`
- `isEphemeralAndNotWelcome()` -> `boolean`
- `static isEphemeralAndNotWelcome(TLRPC.Message message)` -> `boolean`
- `static isEphemeralMessageId(int id)` -> `boolean`
- `isExpiredLiveLocation(int date)` -> `boolean`
- `isExpiredStory()` -> `boolean`
- `static isExtendedVideo(TLRPC.MessageExtendedMedia em)` -> `boolean`
- `isFactCheckable()` -> `boolean`
- `isFcmMessage()` -> `boolean`
- `isForwarded()` -> `boolean`
- `isForwardedChannelPost()` -> `boolean`
- `static isForwardedMessage(TLRPC.Message message)` -> `boolean`
- `static isFreeEmoji(TLRPC.Document document)` -> `boolean`
- `isFromChannel()` -> `boolean`
- `isFromChat()` -> `boolean`
- `isFromGroup()` -> `boolean`
- `isFromUser()` -> `boolean`
- `isGame()` -> `boolean`
- `static isGameMessage(TLRPC.Message message)` -> `boolean`
- `isGif()` -> `boolean`
- `static isGifDocument(WebFile document)` -> `boolean`
- `static isGifDocument(TLRPC.Document document)` -> `boolean`
- `static isGifDocument(TLRPC.Document document, boolean hasGroup)` -> `boolean`
- `static isGifMessage(TLRPC.Message message)` -> `boolean`
- `isGiveaway()` -> `boolean`
- `isGiveawayOrGiveawayResults()` -> `boolean`
- `isGiveawayResults()` -> `boolean`
- `isHiddenSensitive()` -> `boolean`
- `static isImageWebDocument(WebFile webDocument)` -> `boolean`
- `isImportedForward()` -> `boolean`
- `isInvoice()` -> `boolean`
- `static isInvoiceMessage(TLRPC.Message message)` -> `boolean`
- `isLinkMediaSmall()` -> `boolean`
- `isLinkedToChat(long chatId)` -> `boolean`
- `isLiveLocation()` -> `boolean`
- `static isLiveLocationMessage(TLRPC.Message message)` -> `boolean`
- `isLivePhoto()` -> `boolean`
- `isLocation()` -> `boolean`
- `static isLocationMessage(TLRPC.Message message)` -> `boolean`
- `isMask()` -> `boolean`
- `static isMaskDocument(TLRPC.Document document)` -> `boolean`
- `static isMaskMessage(TLRPC.Message message)` -> `boolean`
- `isMediaEmpty()` -> `boolean`
- `isMediaEmpty(boolean webpageIsEmpty)` -> `boolean`
- `static isMediaEmpty(TLRPC.Message message)` -> `boolean`
- `static isMediaEmpty(TLRPC.Message message, boolean allowWebpageIsEmpty)` -> `boolean`
- `isMediaEmptyWebpage()` -> `boolean`
- `static isMediaEmptyWebpage(TLRPC.Message message)` -> `boolean`
- `isMusic()` -> `boolean`
- `static isMusicDocument(TLRPC.Document document)` -> `boolean`
- `static isMusicMessage(TLRPC.Message message)` -> `boolean`
- `isNewGif()` -> `boolean`
- `static isNewGifDocument(WebFile document)` -> `boolean`
- `static isNewGifDocument(TLRPC.Document document)` -> `boolean`
- `static isNewGifMessage(TLRPC.Message message)` -> `boolean`
- `isOut()` -> `boolean`
- `static isOut(TLRPC.Message message)` -> `boolean`
- `isOutOwner()` -> `boolean`
- `isPaid()` -> `boolean`
- `isPaidReactionChosen()` -> `boolean`
- `isPaidSuggestedPost()` -> `boolean`
- `isPaidSuggestedPostProtected()` -> `boolean`
- `static isPaidVideo(TLRPC.MessageMedia m)` -> `boolean`
- `static isPhoto(TLRPC.Message message)` -> `boolean`
- `isPhoto()` -> `boolean`
- `isPoll()` -> `boolean`
- `isPollClosed()` -> `boolean`
- `static isPremiumEmojiPack(TLRPC.TL_messages_stickerSet set)` -> `boolean`
- `static isPremiumEmojiPack(TLRPC.StickerSetCovered covered)` -> `boolean`
- `static isPremiumSticker(TLRPC.Document document)` -> `boolean`
- `isPremiumSticker()` -> `boolean`
- `isPrivateForward()` -> `boolean`
- `isPublicPoll()` -> `boolean`
- `static isQuickReply(TLRPC.Message message)` -> `boolean`
- `isQuickReply()` -> `boolean`
- `isQuiz()` -> `boolean`
- `isReactionsAvailable()` -> `boolean`
- `isReply()` -> `boolean`
- `isReplyToStory()` -> `boolean`
- `isRoundOnce()` -> `boolean`
- `isRoundVideo()` -> `boolean`
- `static isRoundVideoDocument(TLRPC.Document document)` -> `boolean`
- `static isRoundVideoMessage(TLRPC.Message message)` -> `boolean`
- `isSavedFromMegagroup()` -> `boolean`
- `isSecret()` -> `boolean`
- `static isSecretMedia(TLRPC.Message message)` -> `boolean`
- `isSecretMedia()` -> `boolean`
- `static isSecretPhotoOrVideo(TLRPC.Message message)` -> `boolean`
- `isSendError()` -> `boolean`
- `isSending()` -> `boolean`
- `isSensitive()` -> `boolean`
- `isSent()` -> `boolean`
- `isSponsored()` -> `boolean`
- `isStakeableDice()` -> `boolean`
- `isStakedDice()` -> `boolean`
- `isStarGiftAction()` -> `boolean`
- `static isStaticStickerDocument(TLRPC.Document document)` -> `boolean`
- `isSticker()` -> `boolean`
- `static isStickerDocument(TLRPC.Document document)` -> `boolean`
- `static isStickerHasSet(TLRPC.Document document)` -> `boolean`
- `static isStickerMessage(TLRPC.Message message)` -> `boolean`
- `isStory()` -> `boolean`
- `isStoryMedia()` -> `boolean`
- `isStoryMention()` -> `boolean`
- `isSupergroup()` -> `boolean`
- `static isSystemSignUp(MessageObject message)` -> `boolean`
- `static isTextColorEmoji(TLRPC.Document document)` -> `boolean`
- `static isTextColorSet(TLRPC.TL_messages_stickerSet set)` -> `boolean`
- `isTheme()` -> `boolean`
- `isTodo()` -> `boolean`
- `static isTopicActionMessage(MessageObject message)` -> `boolean`
- `isUnread()` -> `boolean`
- `static isUnread(TLRPC.Message message)` -> `boolean`
- `isUnsupported()` -> `boolean`
- `static isV(String ext)` -> `boolean`
- `isVideo()` -> `boolean`
- `isVideoAvatar()` -> `boolean`
- `isVideoCall()` -> `boolean`
- `static isVideoDocument(TLRPC.Document document)` -> `boolean`
- `static isVideoMessage(TLRPC.Message message)` -> `boolean`
- `static isVideoSticker(TLRPC.Document document)` -> `boolean`
- `isVideoSticker()` -> `boolean`
- `static isVideoStickerDocument(TLRPC.Document document)` -> `boolean`
- `isVideoStory()` -> `boolean`
- `static isVideoWebDocument(WebFile webDocument)` -> `boolean`
- `isVoice()` -> `boolean`
- `static isVoiceDocument(TLRPC.Document document)` -> `boolean`
- `static isVoiceMessage(TLRPC.Message message)` -> `boolean`
- `isVoiceOnce()` -> `boolean`
- `isVoiceTranscriptionOpen()` -> `boolean`
- `static isVoiceWebDocument(WebFile webDocument)` -> `boolean`
- `static isVoteResultsIsNotEmpty(TLRPC.TL_messageMediaPoll mediaPoll)` -> `boolean`
- `static isVoted(TLRPC.TL_messageMediaPoll mediaPoll)` -> `boolean`
- `isVoted()` -> `boolean`
- `isVotedButResultsHiddenUntilClose()` -> `boolean`
- `static isVotedButResultsHiddenUntilClose(TLRPC.TL_messageMediaPoll mediaPoll)` -> `boolean`
- `isWallpaper()` -> `boolean`
- `isWallpaperAction()` -> `boolean`
- `isWallpaperForBoth()` -> `boolean`
- `static isWebM(TLRPC.Document document)` -> `boolean`
- `isWebpage()` -> `boolean`
- `isWebpageDocument()` -> `boolean`
- `isWelcomeAnchored()` -> `boolean`
- `static isWelcomeAnchored(TLRPC.Message message)` -> `boolean`
- `isWelcomeMessage()` -> `boolean`
- `static isWelcomeMessage(TLRPC.Message message)` -> `boolean`
- `isYouTubeVideo()` -> `boolean`
- `loadAnimatedEmojiDocument()` -> `void`
- `static makeStaticLayout(CharSequence text_, TextPaint paint, int width, float lineSpacingMult, float lineSpacingAdd, boolean dontIncludePad, Layout.Alignment alignment)` -> `StaticLayout`
- `markPollVotesAsRead()` -> `void`
- `markReactionsAsRead()` -> `void`
- `mediaExists()` -> `boolean`
- `needDrawAvatar()` -> `boolean`
- `needDrawBluredPreview()` -> `boolean`
- `needDrawForwarded()` -> `boolean`
- `needDrawShareButton()` -> `boolean`
- `needResendWhenEdit()` -> `boolean`
- `static normalizeFlags(TLRPC.Message message)` -> `void`
- `obtainSuggestionOffer()` -> `MessageSuggestionParams`
- `obtainSuggestionOfferFromReply()` -> `MessageSuggestionParams`
- `static peerNameWithIcon(int currentAccount, TLRPC.Peer peer)` -> `CharSequence`
- `static peerNameWithIcon(int currentAccount, TLRPC.Peer peer, boolean anotherChat)` -> `CharSequence`
- `static peerNameWithIcon(int currentAccount, long did)` -> `CharSequence`
- `static peerNameWithIcon(int currentAccount, long did, boolean anotherChat)` -> `CharSequence`
- `static peersEqual(TLRPC.InputPeer a, TLRPC.InputPeer b)` -> `boolean`
- `static peersEqual(TLRPC.InputPeer a, TLRPC.Peer b)` -> `boolean`
- `static peersEqual(TLRPC.Peer a, TLRPC.Peer b)` -> `boolean`
- `static peersEqual(TLRPC.Chat a, TLRPC.Peer b)` -> `boolean`
- `probablyRingtone()` -> `boolean`
- `static removeLinks(TLRPC.TL_textWithEntities text)` -> `TLRPC.TL_textWithEntities`
- `replaceAnimatedEmoji(CharSequence text, Paint.FontMetricsInt fontMetricsInt)` -> `Spannable`
- `static replaceAnimatedEmoji(CharSequence text, ArrayList<TLRPC.MessageEntity> entities, Paint.FontMetricsInt fontMetricsInt)` -> `Spannable`
- `static replaceAnimatedEmoji(CharSequence text, ArrayList<TLRPC.MessageEntity> entities, Paint.FontMetricsInt fontMetricsInt, boolean top)` -> `Spannable`
- `static replaceAnimatedEmoji(CharSequence text, ArrayList<TLRPC.MessageEntity> entities, Paint.FontMetricsInt fontMetricsInt, boolean top, float scale, int minusLimit)` -> `Spannable`
- `replaceEmojiToLottieFrame(CharSequence text, int[] emojiOnly)` -> `void`
- `replaceWithLink(CharSequence source, String param, ArrayList<Long> uids, AbstractMap<Long, TLRPC.User> usersDict, LongSparseArray<TLRPC.User> sUsersDict)` -> `CharSequence`
- `static replaceWithLink(CharSequence source, String param, CharSequence object)` -> `CharSequence`
- `static replaceWithLink(CharSequence source, String param, TLObject object)` -> `CharSequence`
- `static replaceWithLink(CharSequence source, String param, TLObject object, boolean makeShort)` -> `CharSequence`
- `resetLayout()` -> `void`
- `resetPlayingProgress()` -> `void`
- `selectReaction(ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean big, boolean fromDoubleTap)` -> `boolean`
- `setContentIsRead()` -> `void`
- `setIsRead()` -> `void`
- `setMyPaidReactionDialogId(long dialogId)` -> `void`
- `setQuery(String query)` -> `void`
- `setQuery(String query, boolean cut)` -> `void`
- `setType()` -> `void`
- `static setUnreadFlags(TLRPC.Message message, int flag)` -> `void`
- `shouldAnimateSending()` -> `boolean`
- `shouldDrawReactions()` -> `boolean`
- `shouldDrawReactionsInLayout()` -> `boolean`
- `shouldDrawWithoutBackground()` -> `boolean`
- `static shouldEncryptPhotoOrVideo(int currentAccount, TLRPC.Message message)` -> `boolean`
- `shouldEncryptPhotoOrVideo()` -> `boolean`
- `static span(String str, int icon)` -> `SpannableStringBuilder`
- `spoilLoginCode()` -> `void`
- `textHeight()` -> `int`
- `textHeight(ChatMessageCell.TransitionParams tp)` -> `int`
- `textHeightCached()` -> `int`
- `toggleChannelRecommendations()` -> `void`
- `static toggleTodo(int currentAccount, long dialogId, TLRPC.TL_messageMediaToDo mediaTodo, int taskId, boolean enable, int currentDate)` -> `void`
- `updateMessageText()` -> `void`
- `static updatePollResults(TLRPC.TL_messageMediaPoll media, TLRPC.PollResults results)` -> `void`
- `updateQualitiesCached(boolean useFileDatabaseQueue)` -> `void`
- `static updateReactions(TLRPC.Message message, TLRPC.TL_messageReactions reactions)` -> `void`
- `updateSideMenuEnabled(boolean enabled)` -> `boolean`
- `updateTranslation()` -> `boolean`
- `updateTranslation(boolean force)` -> `boolean`
- `static userSpan()` -> `CharSequence`
- `static userSpan(int a)` -> `CharSequence`

## `org.telegram.messenger.MessageObject$GroupedMessagePosition`
- `set(int minX, int maxX, int minY, int maxY, int w, float h, int flags)` -> `void`

## `org.telegram.messenger.MessageObject$GroupedMessages`
- `calculate()` -> `void`
- `contains(int messageId)` -> `boolean`
- `findCaptionMessageObject()` -> `MessageObject`
- `findMessageWithFlags(int flags)` -> `MessageObject`
- `findPrimaryMessageObject()` -> `MessageObject`
- `getMaxEditDate()` -> `int`
- `getPosition(MessageObject msg)` -> `GroupedMessagePosition`

## `org.telegram.messenger.MessageObject$GroupedMessages$TransitionParams`
- `reset()` -> `void`

## `org.telegram.messenger.MessageObject$TextLayoutBlock`
- `static capitalizeLanguage(String lng)` -> `String`
- `collapsed(ChatMessageCell.TransitionParams tp)` -> `float`
- `collapsed()` -> `boolean`
- `getLayout()` -> `Layout`
- `getParentView()` -> `View`
- `height()` -> `int`
- `height(ChatMessageCell.TransitionParams tp)` -> `int`
- `heightCollapsed()` -> `int`
- `isRtl()` -> `boolean`
- `textYOffset(ArrayList<TextLayoutBlock> blocks)` -> `float`
- `textYOffset(ArrayList<TextLayoutBlock> blocks, ChatMessageCell.TransitionParams tp)` -> `float`

## `org.telegram.messenger.MessageObject$TextLayoutBlocks`
- `textHeight()` -> `int`
- `textHeight(ChatMessageCell.TransitionParams tp)` -> `int`

## `org.telegram.messenger.MessageObject$VCardData`
- `static parse(String data)` -> `CharSequence`

## `org.telegram.ui.Business.ChatAttachAlertQuickRepliesLayout`
- `sendSelectedItems(boolean notify, int scheduleDate, int scheduleRepeatPeriod, long effectId, boolean invertMedia)` -> `boolean`

## `org.telegram.ui.Cells.ChatMessageCell`
- `checkLoadCaughtPremiumFloodWait()` -> `boolean`
- `checkNeedDrawShareButton(MessageObject messageObject)` -> `boolean`
- `checkPollFileState()` -> `void`
- `checkPollVoteSendingStatus(boolean animated)` -> `void`
- `checkSpoilersMotionEvent(MotionEvent event, int n)` -> `boolean`
- `checkUnreadPollVotes()` -> `boolean`
- `checkUnreadReactions(float clipTop, int clipBottom)` -> `boolean`
- `checkUploadCaughtPremiumFloodWait()` -> `boolean`
- `checkVideoPlayback(boolean allowStart, Bitmap thumb)` -> `void`
- `hasCaptionLayout()` -> `boolean`
- `hasCommentLayout()` -> `boolean`
- `hasGradientService()` -> `boolean`
- `hasNameLayout()` -> `boolean`
- `hasOutboundsContent()` -> `boolean`
- `hasSpoilers()` -> `boolean`
- `markPollVotesAsRead()` -> `void`
- `markReactionsAsRead()` -> `void`
- `requestLayout()` -> `void`
- `shouldDrawAlphaLayer()` -> `boolean`
- `shouldDrawSelectionOverlay()` -> `boolean`
- `shouldDrawTimeOnMedia()` -> `boolean`

## `org.telegram.ui.Cells.ChatMessageCell$ChatMessageCellDelegate`
- `canDrawOutboundsContent()` -> `default boolean`
- `canPerformActions()` -> `default boolean`
- `canPerformReply()` -> `default boolean`
- `canSaveRichDocument(ChatMessageCell cell)` -> `default boolean`
- `canToggleRichMessageCheckbox(ChatMessageCell cell)` -> `default boolean`
- `getChatMode()` -> `default int`
- `getDraftMessageMeasureController()` -> `default ChatActivityDraftMessageMeasureController`
- `hasSelectedMessages()` -> `default boolean`
- `isAdmin(long uid)` -> `default boolean`
- `isLandscape()` -> `default boolean`
- `isOwner(long uid)` -> `default boolean`
- `isProgressLoading(ChatMessageCell cell, int type)` -> `default boolean`
- `isReplyOrSelf()` -> `default boolean`
- `shouldDrawThreadProgress(ChatMessageCell cell, boolean delayed)` -> `default boolean`
- `shouldRepeatSticker(MessageObject message)` -> `default boolean`
- `shouldShowDialogButton(ChatMessageCell cell)` -> `default boolean`
- `shouldShowTopicButton(ChatMessageCell cell)` -> `default boolean`

## `org.telegram.ui.ChatActivity`
- `canBeginSlide()` -> `boolean`
- `canScheduleMessage()` -> `boolean`
- `canSendMessage()` -> `boolean`
- `checkAdjustResize()` -> `void`
- `checkAndUpdateAvatar()` -> `void`
- `checkCanRemoveRestrictionsByBoosts()` -> `boolean`
- `checkEditLinkRemoved(final CharSequence charSequence)` -> `void`
- `checkRecordLocked(boolean invoked, boolean forceCloseOnDiscard)` -> `boolean`
- `checkSlowMode(View view)` -> `boolean`
- `checkSlowModeAlert()` -> `boolean`
- `checkStarsNeedSheet(Runnable runnable, AmountUtils.Amount amountRequired, boolean needCheck)` -> `void`
- `deleteHistory(int dateSelectedStart, int dateSelectedEnd, boolean forAll)` -> `void`
- `hasReportSpam()` -> `boolean`
- `hasSelectedMessages()` -> `boolean`
- `hasTextSelection()` -> `boolean`
- `onSearchLoadingUpdate(boolean loading)` -> `void`
- `processInlineBotContextPM(TLRPC.TL_inlineBotSwitchPM object)` -> `void`
- `processInlineBotWebView(TLRPC.TL_inlineBotWebView object)` -> `void`
- `processSwitchButton(TL_keyboard.TL_inlineButtonTypeSwitchInline button)` -> `boolean`
- `removeFromSponsored(MessageObject message)` -> `void`
- `removeKeyboardPositionBeforeTransition()` -> `void`
- `removeMessageWithThanos(MessageObject messageObject)` -> `void`
- `saveDraft()` -> `void`
- `saveKeyboardPositionBeforeTransition()` -> `void`
- `savePositionForTopicChange(long intoTopic)` -> `void`
- `saveSelfArgs(Bundle args)` -> `void`
- `sendAnimatedEmoji(TLRPC.Document emoji, boolean notify, int scheduleDate)` -> `void`
- `sendAudio(ArrayList<MessageObject> audios, CharSequence caption, boolean notify, int scheduleDate, int scheduleRepeatPeriod, long effectId, boolean invertMedia, long payStars)` -> `void`
- `sendContact(TLRPC.User user, boolean notify, int scheduleDate, long effectId, boolean invertMedia, long payStars)` -> `void`
- `sendContacts(ArrayList<TLRPC.User> users, String caption, boolean notify, int scheduleDate, long effectId, boolean invertMedia, long payStars)` -> `void`
- `sendMedia(MediaController.PhotoEntry photoEntry, VideoEditedInfo videoEditedInfo, boolean notify, int scheduleDate, int scheduleRepeatPeriod, boolean forceDocument, long stars)` -> `void`
- `sendPoll(TLRPC.TL_messageMediaPoll poll, CharSequence caption, PollAttachedMediaPack media, ArrayList<Integer> correctAnswers, boolean notify, int scheduleDate, long payStars)` -> `void`
- `sendTodo(TLRPC.TL_messageMediaToDo todo, boolean notify, int scheduleDate, long payStars)` -> `void`
- `shouldShowImport()` -> `boolean`

## `org.telegram.ui.ChatActivity$ChatActivityAdapter`
- `checkRemoveBotForumRowsStartThreadRow(boolean afterSend)` -> `void`
- `getMessages()` -> `ArrayList<MessageObject>`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.ChatActivity$ChatActivityEnterViewDelegate`
- `checkCanRemoveRestrictionsByBoosts()` -> `boolean`
- `hasForwardingMessages()` -> `boolean`
- `hasScheduledMessages()` -> `boolean`
- `isVideoRecordingPaused()` -> `boolean`
- `onAudioVideoInterfaceUpdated()` -> `void`
- `onUpdateSlowModeButton(View button, boolean show, CharSequence time)` -> `void`

## `org.telegram.ui.ChatActivity$ChatActivityFragmentView`
- `addView(View child, int index, ViewGroup.LayoutParams params)` -> `void`
- `onUpdateBackgroundDrawable(Drawable drawable)` -> `void`
- `requestLayout()` -> `void`

## `org.telegram.ui.ChatActivity$ChatActivityTextSelectionHelper`
- `canCopy()` -> `boolean`
- `canShowQuote()` -> `boolean`
- `setChatActivity(ChatActivity chatActivity)` -> `void`

## `org.telegram.ui.ChatActivity$ChatArticlePageBlocksAdapter`
- `isHardwarePlayer(int index)` -> `boolean`
- `isVideo(int index)` -> `boolean`

## `org.telegram.ui.ChatActivity$ChatMessageCellDelegate`
- `canDrawOutboundsContent()` -> `boolean`
- `canPerformActions()` -> `boolean`
- `canPerformReply()` -> `boolean`
- `canSaveRichDocument(ChatMessageCell cell)` -> `boolean`
- `canToggleRichMessageCheckbox(ChatMessageCell cell)` -> `boolean`
- `getChatMode()` -> `int`
- `getDraftMessageMeasureController()` -> `ChatActivityDraftMessageMeasureController`
- `hasSelectedMessages()` -> `boolean`
- `isAdmin(long uid)` -> `boolean`
- `isLandscape()` -> `boolean`
- `isOwner(long uid)` -> `boolean`
- `isProgressLoading(ChatMessageCell cell, int type)` -> `boolean`
- `isReplyOrSelf()` -> `boolean`
- `shouldDrawThreadProgress(ChatMessageCell cell, boolean delayed)` -> `boolean`
- `shouldRepeatSticker(MessageObject message)` -> `boolean`
- `shouldShowDialogButton(ChatMessageCell cell)` -> `boolean`
- `shouldShowTopicButton(ChatMessageCell cell)` -> `boolean`

## `org.telegram.ui.ChatActivity$ReplyQuote`
- `checkEdit(MessageObject message)` -> `boolean`
- `isValid()` -> `boolean`

## `org.telegram.ui.ChatActivity$SearchItemListener`
- `canClearCaption()` -> `boolean`
- `canCollapseSearch()` -> `boolean`

## `org.telegram.ui.ChatActivity$ThemeDelegate`
- `isGiftTheme()` -> `boolean`
- `isThemeChangeAvailable(boolean canEdit)` -> `boolean`
- `isWallpaperMotion()` -> `boolean`

## `org.telegram.ui.ChatActivityContainer`
- `onSearchLoadingUpdate(boolean loading)` -> `void`

## `org.telegram.ui.Components.ChatActivityEnterTopView`
- `addEditView(EditView editView, LayoutParams layoutParams)` -> `void`
- `addReplyView(View replyView, LayoutParams layoutParams)` -> `void`

## `org.telegram.ui.Components.ChatActivityEnterTopView$EditView`
- `addButton(EditViewButton button, LayoutParams layoutParams)` -> `void`

## `org.telegram.ui.Components.ChatActivityEnterTopView$EditViewButton`
- `addImageView(ImageView imageView, LayoutParams layoutParams)` -> `void`
- `addSpaceView(Space space, LayoutParams layoutParams)` -> `void`
- `addTextView(TextView textView, LayoutParams layoutParams)` -> `void`

## `org.telegram.ui.Components.ChatActivityEnterView`
- `addEmojiToRecent(String code)` -> `void`
- `addRecentGif(TLRPC.Document searchImage)` -> `void`
- `addStickerToRecent(TLRPC.Document sticker)` -> `void`
- `addTextChangedListener(TextWatcher textWatcher)` -> `void`
- `addTopView(View view, int height)` -> `void`
- `canHidePopupByBackButton()` -> `boolean`
- `canSchedule()` -> `boolean`
- `canShowMessageTransition()` -> `boolean`
- `cancelRecordingAudioVideo()` -> `void`
- `checkChannelRights()` -> `void`
- `static checkPremiumAnimatedEmoji(int currentAccount, long dialogId, BaseFragment parentFragment, FrameLayout container, CharSequence message)` -> `boolean`
- `checkReactionsButton(boolean visible)` -> `void`
- `checkRoundVideo()` -> `void`
- `checkSendButton(boolean animated)` -> `void`
- `checkStickresExpandHeight()` -> `void`
- `hasAudioToSend()` -> `boolean`
- `hasBotWebView()` -> `boolean`
- `hasOverlappingRendering()` -> `boolean`
- `hasRecordVideo()` -> `boolean`
- `hasText()` -> `boolean`
- `onAdjustPanTransitionUpdate(float y, float progress, boolean keyboardVisible)` -> `void`
- `processSendingText(CharSequence text, boolean notify, int scheduleDate, int scheduleRepeatPeriod, long payStars)` -> `boolean`
- `saveRichDraft(TL_iv.RichMessage rich)` -> `void`
- `sendConvertedRichAsSimple(CharSequence simpleText, boolean notify, int scheduleDate, int scheduleRepeatPeriod)` -> `void`
- `sendMessage()` -> `boolean`
- `sendMessageInternal(boolean notify, int scheduleDate, int scheduleRepeatPeriod, long payStars, boolean allowConfirm)` -> `boolean`

## `org.telegram.ui.Components.ChatActivityEnterView$ChatActivityEditTextCaption`
- `requestFocus(int direction, Rect previouslyFocusedRect)` -> `boolean`
- `requestRectangleOnScreen(Rect rectangle)` -> `boolean`

## `org.telegram.ui.Components.ChatActivityEnterView$ChatActivityEnterViewDelegate`
- `checkCanRemoveRestrictionsByBoosts()` -> `default boolean`
- `hasForwardingMessages()` -> `default boolean`
- `hasScheduledMessages()` -> `default boolean`

## `org.telegram.ui.Components.ChatActivityEnterView$RecordCircle`
- `canceledByGesture()` -> `void`

## `org.telegram.ui.Components.ChatActivityEnterView$SendButton`
- `shouldDrawBackground()` -> `boolean`

## `org.telegram.ui.Components.ChatActivityInterface`
- `checkAndUpdateAvatar()` -> `default void`
- `getCurrentChat()` -> `default TLRPC.Chat`
- `getCurrentUser()` -> `default TLRPC.User`
- `getMergeDialogId()` -> `default long`
- `isRightFragment()` -> `default boolean`
- `shouldShowImport()` -> `default boolean`

## `org.telegram.ui.Components.ChatAttachAlert`
- `canDismiss()` -> `boolean`
- `canDismissWithSwipe()` -> `boolean`
- `canDismissWithTouchOutside()` -> `boolean`
- `cancelSheetAnimation()` -> `void`
- `checkCanRemoveRestrictionsByBoosts()` -> `boolean`
- `checkCaption(CharSequence text)` -> `boolean`
- `checkColors()` -> `void`
- `checkUi_moveCaptionButtonVisibility()` -> `void`
- `hasCaption()` -> `boolean`
- `shouldOverlayCameraViewOverNavBar()` -> `boolean`

## `org.telegram.ui.Components.ChatAttachAlert$AttachAlertLayout`
- `canDismissWithSwipe()` -> `boolean`
- `canDismissWithTouchOutside()` -> `boolean`
- `canScheduleMessages()` -> `boolean`
- `checkColors()` -> `void`
- `hasCustomActionBarBackground()` -> `boolean`
- `hasCustomBackground()` -> `boolean`
- `hasDoneItem()` -> `boolean`
- `onButtonsTranslationYUpdated()` -> `void`
- `onContainerTranslationUpdated(float currentPanTranslationY)` -> `void`
- `onContainerTranslationUpdated(float currentPanTranslationY, float progress, boolean keyboardVisible)` -> `void`
- `sendSelectedItems(boolean notify, int scheduleDate, int scheduleRepeatPeriod, long effectId, boolean invertMedia)` -> `boolean`
- `shouldHideBottomButtons()` -> `boolean`
- `shouldRestoreKeyboardOnDismiss()` -> `boolean`

## `org.telegram.ui.Components.ChatAttachAlert$AttachButton`
- `hasOverlappingRendering()` -> `boolean`

## `org.telegram.ui.Components.ChatAttachAlert$ChatAttachViewDelegate`
- `sendAudio(ArrayList<MessageObject> audios, CharSequence caption, boolean notify, int scheduleDate, int scheduleRepeatPeriod, long effectId, boolean invertMedia, long payStars)` -> `default void`

## `org.telegram.ui.Components.ChatAttachAlertAudioLayout`
- `onContainerTranslationUpdated(float currentPanTranslationY)` -> `void`
- `sendSelectedItems(boolean notify, int scheduleDate, int scheduleRepeatPeriod, long effectId, boolean invertMedia)` -> `boolean`

## `org.telegram.ui.Components.ChatAttachAlertContactsLayout`
- `addOrRemoveSelectedContact(UserCell cell, Object object)` -> `void`
- `sendSelectedItems(boolean notify, int scheduleDate, int scheduleRepeatPeriod, long effectId, boolean invertMedia)` -> `boolean`

## `org.telegram.ui.Components.ChatAttachAlertContactsLayout$ListItemID`
- `hashCode()` -> `int`

## `org.telegram.ui.Components.ChatAttachAlertDocumentLayout`
- `loadRecentFiles()` -> `void`
- `sendSelectedItems(boolean notify, int scheduleDate, int scheduleRepeatPeriod, long effectId, boolean invertMedia)` -> `boolean`

## `org.telegram.ui.Components.ChatAttachAlertDocumentLayout$SearchAdapter`
- `loadMore()` -> `void`
- `removeSearchFilter(FiltersView.MediaFilterData filterData)` -> `void`

## `org.telegram.ui.Components.ChatAttachAlertGramLayout`
- `hasCustomBackground()` -> `boolean`
- `hasQueuedSend()` -> `boolean`
- `onContainerTranslationUpdated(float currentPanTranslationY, float progress, boolean keyboardVisible)` -> `void`
- `shouldRestoreKeyboardOnDismiss()` -> `boolean`

## `org.telegram.ui.Components.ChatAttachAlertLocationLayout`
- `shouldHideBottomButtons()` -> `boolean`

## `org.telegram.ui.Components.ChatAttachAlertLocationLayout$MapOverlayView`
- `addInfoView(IMapsProvider.IMarker marker)` -> `void`
- `removeInfoView(IMapsProvider.IMarker marker)` -> `void`

## `org.telegram.ui.Components.ChatAttachAlertPhotoLayout`
- `canDismissWithTouchOutside()` -> `boolean`
- `canScheduleMessages()` -> `boolean`
- `checkCamera(boolean request)` -> `void`
- `checkCameraViewPosition()` -> `void`
- `checkColors()` -> `void`
- `checkStorage()` -> `void`
- `hasLivePhotos()` -> `boolean`
- `loadGalleryPhotos()` -> `void`
- `onButtonsTranslationYUpdated()` -> `void`
- `onContainerTranslationUpdated(float currentPanTranslationY)` -> `void`
- `requestLayout()` -> `void`

## `org.telegram.ui.Components.ChatAttachAlertPhotoLayoutPreview`
- `shouldHideBottomButtons()` -> `boolean`

## `org.telegram.ui.Components.ChatAttachAlertPhotoLayoutPreview$PreviewGroupsView`
- `saveDeletedImageId(MediaController.PhotoEntry photo)` -> `void`

## `org.telegram.ui.Components.ChatAttachAlertPhotoLayoutPreview$PreviewGroupsView$GroupingPhotoViewerProvider`
- `cancelButtonPressed()` -> `boolean`

## `org.telegram.ui.Components.ChatAttachAlertPollLayout`
- `hasDoneItem()` -> `boolean`
- `requestLayout()` -> `void`

## `org.telegram.ui.Components.ChatAttachAlertPollLayout$ToggleRow`
- `addRows(int count)` -> `void`
- `removeRows(int count)` -> `void`

## `org.telegram.ui.Components.ChatAttachAlertPollLayout$TouchHelperCallback`
- `isLongPressDragEnabled()` -> `boolean`

## `org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController`
- `hasAdditionalHeight()` -> `boolean`
- `setMessageIdToOverride(int messageIdToOverride, long groupIdToOverride)` -> `boolean`
- `setPreviousMessageHeight(int previousMessageHeight)` -> `void`

## `org.telegram.ui.Components.chat.buttons.ChatActivityBlurredRoundPageDownButton`
- `addButtonView(ChatActivityBlurredRoundButton button, int size)` -> `void`

## `org.telegram.ui.Components.chat.layouts.ChatActivitySideControlsButtonsLayout`
- `hasOverlappingRendering()` -> `boolean`

## `org.telegram.ui.Delegates.ChatActivityMemberRequestsDelegate`
- `setChatInfo(@Nullable TLRPC.ChatFull chatInfo, boolean animated)` -> `void`

## `org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout`
- `canExpandByRequest()` -> `boolean`
- `hasCustomActionBarBackground()` -> `boolean`
- `hasCustomBackground()` -> `boolean`
- `requestLayout()` -> `void`
- `requestWebView(int currentAccount, long peerId, long botId, boolean silent, int replyToMsgId)` -> `void`
- `requestWebView(int currentAccount, long peerId, long botId, boolean silent, int replyToMsgId, String startCommand, long monoforumTopicId)` -> `void`
- `shouldHideBottomButtons()` -> `boolean`

## `org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout$WebViewSwipeContainer`
- `cancelStickTo()` -> `void`
- `requestDisallowInterceptTouchEvent(boolean disallowIntercept)` -> `void`

## `org.telegram.ui.iv.ChatAttachAlertRichLayout`
- `onContainerTranslationUpdated(float currentPanTranslationY)` -> `void`
- `requestLayout()` -> `void`
- `sendSelectedItems(boolean notify, int scheduleDate, int scheduleRepeatPeriod, long effectId, boolean invertMedia)` -> `boolean`
- `shouldHideBottomButtons()` -> `boolean`

## `org.telegram.ui.recyclerview.ChatListItemAnimator`
- `setOnSnapMessage(Utilities.Callback0Return<Boolean> supportsThanosEffectContainer, Utilities.Callback0Return<ThanosEffect> getThanosEffectContainer)` -> `void`
