# visual / network (100 методов)

## `org.telegram.messenger.MessagesController`
- `invalidateChatlistFolderUpdate(int filterId)` -> `void`
- `invalidateContentSettings()` -> `void`
- `invalidateUserPremiumBlocked(long userId, int classGuid)` -> `void`

## `org.telegram.messenger.MessagesController$CommonChatsList`
- `invalidate(boolean load)` -> `void`

## `org.telegram.messenger.MessagesStorage`
- `bindTaskToGuid(Runnable task, int guid)` -> `void`

## `org.telegram.tgnet.ConnectionsManager`
- `bindRequestToGuid(int requestToken, int guid)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialog`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialogCommunity`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialogFilter`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialogFilterChatlist`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialogFilterDefault`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialogFolder`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialogPeer`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialogPeerCommunity`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_dialogPeerFolder`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputDialogPeer`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputDialogPeerCommunity`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputDialogPeerFolder`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_dialogs`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_dialogsNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_dialogsSlice`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_requestChatJoinWebView`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_webViewResultUrl`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_savedDialogs`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_savedDialogsNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_savedDialogsSlice`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_monoForumDialog`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_savedDialog`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$TL_botMenuButton`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$TL_botMenuButtonCommands`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$TL_botMenuButtonDefault`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$getRequestedWebViewButton`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TL_keyboard.KeyboardButton`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$ButtonType`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ButtonType`

## `org.telegram.tgnet.tl.TL_keyboard$InlineButtonType`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InlineButtonType`

## `org.telegram.tgnet.tl.TL_keyboard$TL_buttonTypeDefault`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_buttonTypeRequestGeoLocation`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_buttonTypeRequestPeer`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_buttonTypeRequestPhone`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_buttonTypeRequestPoll`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_buttonTypeSimpleWebView`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inlineButtonTypeBuy`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inlineButtonTypeCopy`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inlineButtonTypeDisabled`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inlineButtonTypeGame`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inlineButtonTypeSwitchInline`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inlineButtonTypeUrl`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inlineButtonTypeUrlAuth`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inlineButtonTypeWebView`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inputButtonTypeRequestPeer`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inputInlineButtonTypeUrlAuth`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inputKeyboardButtonRequestPeer_layer221`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inputKeyboardButtonRequestPeer_layer228`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inputKeyboardButtonUrlAuth_layer223`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_inputKeyboardButtonUrlAuth_layer228`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButton`
- `getText()` -> `String`
- `getType()` -> `ButtonTypeProto`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonBuy_layer223`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonBuy_layer228`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonCopy_layer223`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonCopy_layer228`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonGame_layer223`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonGame_layer228`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonRequestGeoLocation_layer223`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonRequestGeoLocation_layer228`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonRequestPeer_layer168`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonRequestPeer_layer223`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonRequestPeer_layer228`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonRequestPhone_layer223`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonRequestPhone_layer228`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonRequestPoll_layer223`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonRequestPoll_layer228`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonSimpleWebView_layer223`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonSimpleWebView_layer228`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonSwitchInline_layer157`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonSwitchInline_layer223`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonSwitchInline_layer228`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonUrlAuth_layer223`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonUrlAuth_layer228`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonUrl_layer223`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonUrl_layer228`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonWebView_layer223`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButtonWebView_layer228`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButton_layer223`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardButton_layer228`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardInlineButton`
- `getText()` -> `String`
- `getType()` -> `ButtonTypeProto`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardInlineButtonRow`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardInlineButtonRow_layer228`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_keyboard$TL_keyboardInlineButton_legacy`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyView`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyViewPublicForward`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyViewPublicRepost`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyViews`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyViewsList`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyViewsList_layer167`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyViews_layer160`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_stories$TL_storyViews_layer161`
- `serializeToStream(OutputSerializedData stream)` -> `void`
