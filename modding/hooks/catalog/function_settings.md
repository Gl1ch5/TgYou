# function / settings (322 методов)

## `org.telegram.messenger.GoogleMapsProvider$GoogleUISettings`
- `setCompassEnabled(boolean enabled)` -> `void`
- `setMyLocationButtonEnabled(boolean enabled)` -> `void`
- `setZoomControlsEnabled(boolean enabled)` -> `void`

## `org.telegram.messenger.NotificationsSettingsFacade`
- `applyDialogNotificationsSettings(long dialogId, long topicId, TLRPC.PeerNotifySettings notify_settings)` -> `void`
- `applySoundSettings(TLRPC.NotificationSound settings, SharedPreferences.Editor editor, long dialogId, long topicId, int globalType, boolean serverUpdate)` -> `void`
- `clearPreference(long dialogId, long topicId)` -> `void`
- `getProperty(String property, long dialogId, long topicId, int defaultValue)` -> `int`
- `getProperty(String property, long dialogId, long topicId, long defaultValue)` -> `long`
- `getProperty(String property, long dialogId, long topicId, boolean defaultValue)` -> `boolean`
- `getPropertyString(String property, long dialogId, long topicId, String defaultValue)` -> `String`
- `isDefault(long dialogId, long topicId)` -> `boolean`
- `removeProperty(String property, long dialogId, long topicId)` -> `void`
- `setSettingsForDialog(SharedPreferences.Editor editor, TLRPC.Dialog dialog, TLRPC.PeerNotifySettings notify_settings)` -> `void`

## `org.telegram.messenger.SharedConfig`
- `static addProxy(ProxyInfo proxyInfo)` -> `ProxyInfo`
- `static allowPreparingHevcPlayers()` -> `boolean`
- `static animationsEnabled()` -> `boolean`
- `static buildVersion()` -> `int`
- `static canBlurChat()` -> `boolean`
- `static chatBlurEnabled()` -> `boolean`
- `static checkLogsToDelete()` -> `void`
- `static checkPasscode(String passcode)` -> `boolean`
- `static checkSaveToGalleryFiles()` -> `void`
- `static checkSdCard(File file)` -> `void`
- `static clearConfig()` -> `void`
- `static deleteProxy(ProxyInfo proxyInfo)` -> `void`
- `static deviceIsAboveAverage()` -> `boolean`
- `static deviceIsAverage()` -> `boolean`
- `static deviceIsHigh()` -> `boolean`
- `static deviceIsLow()` -> `boolean`
- `static enabledRaiseTo(boolean speak)` -> `boolean`
- `static findGoodHevcEncoder()` -> `String`
- `static forwardingOptionsHintHintShowed()` -> `void`
- `static getChatSwipeAction(int currentAccount)` -> `int`
- `static getCountryLangs()` -> `HashMap<String, String>`
- `static getDevicePerformanceClass()` -> `int`
- `static getLastLocalId()` -> `int`
- `static getLegacyDevicePerformanceClass()` -> `int`
- `static getPreferences()` -> `SharedPreferences`
- `static increaseBadPasscodeTries()` -> `void`
- `static increaseDayNightWallpaperSiwtchHint()` -> `void`
- `static increaseLockRecordAudioVideoHintShowed()` -> `void`
- `static increaseScheduledHintShowed()` -> `void`
- `static increaseScheduledOrNoSoundHintShowed()` -> `void`
- `static increaseTextSelectionHintShowed()` -> `void`
- `static incrementCallEncryptionHintDisplayed(int count)` -> `void`
- `static isAppUpdateAvailable()` -> `boolean`
- `static isAutoplayGifs()` -> `boolean`
- `static isAutoplayVideo()` -> `boolean`
- `static isPassportConfigLoaded()` -> `boolean`
- `static isProxyEnabled()` -> `boolean`
- `static isSecretMapPreviewSet()` -> `boolean`
- `static isUsingCamera2(int currentAccount)` -> `boolean`
- `static loadConfig()` -> `void`
- `static loadProxyList()` -> `void`
- `static loopStickers()` -> `boolean`
- `static overrideDevicePerformanceClass(int performanceClass)` -> `void`
- `static performanceClassName(int perfClass)` -> `String`
- `static removeLockRecordAudioVideoHint()` -> `void`
- `static removeScheduledHint()` -> `void`
- `static removeScheduledOrNoSoundHint()` -> `void`
- `static removeTextSelectionHint()` -> `void`
- `static replyingOptionsHintHintShowed()` -> `void`
- `static saveConfig()` -> `void`
- `static saveDebugConfig()` -> `void`
- `static saveProxyList()` -> `void`
- `static setAnimationsEnabled(boolean b)` -> `void`
- `static setDistanceSystemType(int type)` -> `void`
- `static setDontAskManageStorage(boolean b)` -> `void`
- `static setFastScrollHintCount(int count)` -> `void`
- `static setKeepMedia(int value)` -> `void`
- `static setMediaColumnsCount(int count)` -> `void`
- `static setMultipleReactionsPromoShowed(boolean val)` -> `void`
- `static setNewAppVersionAvailable(TLRPC.TL_help_appUpdate update)` -> `boolean`
- `static setNoSoundHintShowed(boolean value)` -> `void`
- `static setPassportConfig(String json, int hash)` -> `void`
- `static setPlaybackOrderType(int type)` -> `void`
- `static setRepeatMode(int mode)` -> `void`
- `static setSearchEngineType(int value)` -> `void`
- `static setSearchMessagesAsListUsed(boolean value)` -> `void`
- `static setSecretMapPreviewType(int value)` -> `void`
- `static setStickersReorderingHintUsed(boolean value)` -> `void`
- `static setStoriesColumnsCount(int count)` -> `void`
- `static setStoriesIntroShown(boolean isShown)` -> `void`
- `static setStoriesReactionsLongPressHintUsed(boolean value)` -> `void`
- `static setSuggestStickers(int type)` -> `void`
- `static setUseThreeLinesLayout(boolean value)` -> `void`
- `static toggleArchiveHidden()` -> `void`
- `static toggleAutoplayGifs()` -> `void`
- `static toggleAutoplayVideo()` -> `void`
- `static toggleBigEmoji()` -> `void`
- `static toggleBrowserAdaptableColors()` -> `void`
- `static toggleChatBlur()` -> `void`
- `static toggleDebugVideoQualities()` -> `void`
- `static toggleDebugWebView()` -> `void`
- `static toggleDirectShare()` -> `void`
- `static toggleDisableVoiceAudioEffects()` -> `void`
- `static toggleFastWallpaperDisabled()` -> `void`
- `static toggleForceDisableTabletMode()` -> `void`
- `static toggleForceForumTabs()` -> `void`
- `static toggleFrameMetricsEnabled()` -> `void`
- `static toggleInappCamera()` -> `void`
- `static toggleLocalInstantView()` -> `void`
- `static toggleLoopStickers()` -> `void`
- `static toggleNextMediaTap()` -> `void`
- `static toggleNoiseSupression()` -> `void`
- `static togglePauseMusicOnMedia()` -> `void`
- `static togglePauseMusicOnRecord()` -> `void`
- `static togglePaymentByInvoice()` -> `void`
- `static togglePhotoViewerBlur()` -> `void`
- `static toggleRaiseToListen()` -> `void`
- `static toggleRaiseToSpeak()` -> `void`
- `static toggleRoundCamera()` -> `void`
- `static toggleRoundCamera16to9()` -> `void`
- `static toggleSaveStreamMedia()` -> `void`
- `static toggleSortContactsByName()` -> `void`
- `static toggleSortFilesByName()` -> `void`
- `static toggleStreamAllVideo()` -> `void`
- `static toggleStreamMedia()` -> `void`
- `static toggleStreamMkv()` -> `void`
- `static toggleSuggestAnimatedEmoji()` -> `void`
- `static toggleSurfaceInStories()` -> `void`
- `static toggleUpdateStickersOrderOnSend()` -> `void`
- `static toggleUseCamera2(int currentAccount)` -> `void`
- `static toggleUseNewBlur()` -> `void`
- `static toggleUseSystemBoldFont()` -> `void`
- `static updateChatListSwipeSetting(int newAction)` -> `void`
- `static updateEmojiInteractionsHintCount(int count)` -> `void`
- `static updateMessageSeenHintCount(int count)` -> `void`
- `static updateStealthModeSendMessageConfirm(int count)` -> `void`
- `static updateTabletConfig()` -> `void`
- `static versionBiggerOrEqual(String a, String b)` -> `boolean`

## `org.telegram.messenger.SharedConfig$BackgroundActivityPrefs`
- `static getDismissedCount()` -> `int`
- `static getLastCheckedBackgroundActivity()` -> `long`
- `static increaseDismissedCount()` -> `void`
- `static setLastCheckedBackgroundActivity(long l)` -> `void`

## `org.telegram.tgnet.TLRPC$GlobalPrivacySettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `GlobalPrivacySettings`

## `org.telegram.tgnet.TLRPC$PeerNotifySettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PeerNotifySettings`

## `org.telegram.tgnet.TLRPC$PeerSettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PeerSettings`

## `org.telegram.tgnet.TLRPC$TL_autoDownloadSettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_autoDownloadSettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_codeSettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_codeSettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_globalPrivacySettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_globalPrivacySettings_layer200`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPeerNotifySettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inputPeerNotifySettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputThemeSettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_inputThemeSettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_getPeerSettings`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_hidePeerSettingsBar`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_peerSettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_messages_peerSettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_peerNotifySettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_peerNotifySettingsEmpty_layer77`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_peerNotifySettings_layer139`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_peerNotifySettings_layer156`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_peerNotifySettings_layer47`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_peerNotifySettings_layer77`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_peerSettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_peerSettings_layer176`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_peerSettings_layer199`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_secureSecretSettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_secureSecretSettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_themeSettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_themeSettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_themeSettings_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_themeSettings_layer132`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_wallPaperSettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_wallPaperSettings_layer106`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_wallPaperSettings_layer128`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_wallPaperSettings_layer167`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$ThemeSettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ThemeSettings`

## `org.telegram.tgnet.TLRPC$WallPaperSettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `WallPaperSettings`

## `org.telegram.tgnet.tl.TL_account$TL_reactionsNotifySettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_reactionsNotifySettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_webBrowserSettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_webBrowserSettingsNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$WebBrowserSettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `WebBrowserSettings`

## `org.telegram.tgnet.tl.TL_account$autoDownloadSettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `autoDownloadSettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$changeAuthorizationSettings`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$contentSettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `contentSettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$deleteWebBrowserSettingsExceptions`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `WebBrowserSettings`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getAutoDownloadSettings`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getContentSettings`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getGlobalPrivacySettings`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getNotifySettings`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getPasswordSettings`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getReactionsNotifySettings`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getWebBrowserSettings`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `WebBrowserSettings`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$passwordInputSettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `passwordInputSettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$passwordSettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `passwordSettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$resetNotifySettings`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$saveAutoDownloadSettings`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$setContentSettings`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$setGlobalPrivacySettings`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$setReactionsNotifySettings`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$toggleWebBrowserSettingsException`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `TLRPC.Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$updateNotifySettings`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$updatePasswordSettings`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$updateWebBrowserSettings`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `WebBrowserSettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$BotVerifierSettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `BotVerifierSettings`

## `org.telegram.tgnet.tl.TL_bots$TL_botVerifierSettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$TL_botVerifierSettings_layer229`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_bots$botAppSettings`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `botAppSettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateNotifySettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updatePeerSettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateWebBrowserSettings`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.ui.ArchiveSettingsActivity$ListAdapter`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.Cells.EditTextSettingsCell`
- `addTextWatcher(TextWatcher watcher)` -> `void`

## `org.telegram.ui.Components.RoundVideoSettings`
- `static isCompositionEnabled()` -> `boolean`
- `static isEnabled()` -> `boolean`

## `org.telegram.ui.LiteModeSettingsActivity$Adapter`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.NotificationsCustomSettingsActivity$ListAdapter`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.NotificationsSettingsActivity`
- `loadExceptions(Runnable onDone)` -> `void`

## `org.telegram.ui.SettingsActivity`
- `canParentTabsSlide(MotionEvent ev, boolean forward)` -> `boolean`

## `org.telegram.ui.ThemeActivity`
- `checkCurrentDayNight()` -> `void`

## `org.telegram.ui.TopicsNotifySettingsFragments$Adapter`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.web.WebBrowserSettings`
- `isLightStatusBar()` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`

## `org.telegram.utils.proxy.ProxySettings`
- `static builder()` -> `Builder`
- `equals(Object o)` -> `boolean`
- `static fromSharedPreferences(SharedPreferences preferences)` -> `ProxySettings`
- `static fromUri(Uri uri)` -> `ProxySettings`
- `getAddress()` -> `String`
- `getLink()` -> `String`
- `getPassword()` -> `String`
- `getPort()` -> `int`
- `getSecret()` -> `String`
- `getType()` -> `Type`
- `getUser()` -> `String`
- `hashCode()` -> `int`
- `static intToType(int type)` -> `Type`
- `isValid()` -> `boolean`
- `toSharedPreferences(SharedPreferences.Editor editor)` -> `void`
- `static typeToInt(Type type)` -> `int`

## `org.telegram.utils.proxy.ProxySettings$Builder`
- `build()` -> `ProxySettings`
- `setAddress(String address)` -> `Builder`
- `setPassword(String password)` -> `Builder`
- `setPort(int port)` -> `Builder`
- `setSecret(String secret)` -> `Builder`
- `setType(Type type)` -> `Builder`
- `setUser(String user)` -> `Builder`

## `org.telegram.utils.settings.BooleanSetting`
- `get()` -> `boolean`
- `isSet()` -> `boolean`
- `static of(String name, boolean defaultValue)` -> `BooleanSetting`
- `set(boolean value)` -> `void`
- `toggle()` -> `boolean`

## `org.telegram.utils.settings.EnumSetting`
- `set(@NonNull T value)` -> `void`

## `org.telegram.utils.settings.FloatSetting`
- `get()` -> `float`
- `static of(String name, float defaultValue)` -> `FloatSetting`
- `set(float value)` -> `void`

## `org.telegram.utils.settings.IntSetting`
- `get()` -> `int`
- `static of(String name, int defaultValue)` -> `IntSetting`
- `set(int value)` -> `void`

## `org.telegram.utils.settings.LongSetting`
- `get()` -> `long`
- `static of(String name, long defaultValue)` -> `LongSetting`
- `set(long value)` -> `void`

## `org.telegram.utils.settings.SettingsPreferences`
- `static get()` -> `SharedPreferences`

## `org.telegram.utils.settings.StringSetting`
- `static of(String name, @Nullable String defaultValue)` -> `StringSetting`
- `set(@Nullable String value)` -> `void`
