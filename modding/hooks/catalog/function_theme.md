# function / theme (421 методов)

## `org.telegram.messenger.ChatThemeController`
- `clearCache()` -> `void`
- `clearWallpaper(long dialogId, boolean notify)` -> `void`
- `clearWallpaper(long dialogId, boolean notify, boolean onlyRevert)` -> `void`
- `clearWallpaperImages()` -> `void`
- `clearWallpaperThumbImages()` -> `void`
- `static equals(TLRPC.WallPaper wallPaper, TLRPC.WallPaper oldWallpaper)` -> `boolean`
- `getDialogTheme(long dialogId)` -> `EmojiThemes`
- `getDialogWallpaper(long dialogId)` -> `TLRPC.WallPaper`
- `getEmojiThemes(int flags)` -> `List<EmojiThemes>`
- `getGiftThemeUser(String slug)` -> `long`
- `static getInstance(int accountNum)` -> `ChatThemeController`
- `getTheme(ThemeKey themeKey)` -> `EmojiThemes`
- `static getWallpaperEmoticon(TLRPC.WallPaper a)` -> `String`
- `getWallpaperThumbBitmap(long themeId)` -> `Bitmap`
- `isAllThemesFullyLoaded()` -> `boolean`
- `isGiftThemesFullyLoaded()` -> `boolean`
- `static isNotEmoticonWallpaper(TLRPC.WallPaper a)` -> `boolean`
- `loadNextChatThemes(ResultCallback<Void> callback)` -> `void`
- `loadWallpaperBitmap(long wallpaperId, int mode, Utilities.Callback<WallpaperBitmapHolder> callback)` -> `void`
- `preloadAllWallpaperImages(boolean isDark)` -> `void`
- `preloadAllWallpaperThumbs(boolean isDark)` -> `void`
- `processUpdate(TL_update.TL_updatePeerWallpaper update)` -> `void`
- `putThemeIfNeeded(TLRPC.ChatTheme theme)` -> `void`
- `requestAllChatThemes(final ResultCallback<List<EmojiThemes>> callback, boolean withDefault)` -> `void`
- `requestChatTheme(final ThemeKey key, final ResultCallback<EmojiThemes> callback)` -> `void`
- `saveChatWallpaper(long dialogId, TLRPC.WallPaper wallPaper)` -> `void`
- `saveWallpaperBitmap(WallpaperBitmapHolder wallpaper, long wallpaperId)` -> `void`
- `setDialogTheme(final long dialogId, final @Nullable TLRPC.ChatTheme theme, final boolean sendRequest)` -> `void`
- `setDialogTheme(final long dialogId, final @Nullable ThemeKey themeKey)` -> `void`
- `setWallpaperToPeer(long dialogId, String wallpaperLocalPath, Theme.OverrideWallpaperInfo wallpaperInfo, MessageObject serverWallpaper, Runnable callback)` -> `int`
- `static wallpaperEquals(TLRPC.WallPaper a, TLRPC.WallPaper b)` -> `boolean`

## `org.telegram.messenger.MessagesController$PeerColor`
- `appendString(StringBuilder sb)` -> `void`
- `static fromCollectible(TLRPC.EmojiStatus status)` -> `PeerColor`
- `static fromPeerCollectible(TLRPC.PeerColor peer_color)` -> `PeerColor`
- `static fromString(String string)` -> `PeerColor`
- `static fromTL(TLRPC.TL_help_peerColorOption tl)` -> `PeerColor`
- `getAvatarColor1()` -> `int`
- `getAvatarColor2()` -> `int`
- `getBgColor1(boolean isDark)` -> `int`
- `getBgColor2(boolean isDark)` -> `int`
- `getColor1(boolean isDark)` -> `int`
- `getColor1()` -> `int`
- `getColor2(boolean isDark)` -> `int`
- `getColor2()` -> `int`
- `getColor3(boolean isDark)` -> `int`
- `getColor3()` -> `int`
- `getColor4(boolean isDark)` -> `int`
- `getColor4()` -> `int`
- `getColor5(boolean isDark)` -> `int`
- `getColor5()` -> `int`
- `getColor6(boolean isDark)` -> `int`
- `getLvl(boolean isGroup)` -> `int`
- `getStoryColor1(boolean isDark)` -> `int`
- `getStoryColor2(boolean isDark)` -> `int`
- `hasColor2()` -> `boolean`
- `hasColor2(boolean isDark)` -> `boolean`
- `hasColor3()` -> `boolean`
- `hasColor3(boolean isDark)` -> `boolean`
- `hasColor6(boolean isDark)` -> `boolean`
- `static optionToColors(TLRPC.help_PeerColorSet set)` -> `int[]`

## `org.telegram.messenger.MessagesController$PeerColors`
- `colorsAvailable(int lvl, boolean isGroup)` -> `int`
- `static fromJSON(int type, TLRPC.TL_jsonObject peer_colors, TLRPC.TL_jsonObject dark_peer_colors, TLRPC.TL_jsonArray peer_colors_available)` -> `PeerColors`
- `static fromString(int type, String str)` -> `PeerColors`
- `static fromTL(int type, TLRPC.TL_help_peerColors tl)` -> `PeerColors`
- `maxLevel()` -> `int`
- `maxLevel(boolean isGroup)` -> `int`
- `minLevel()` -> `int`
- `minLevel(boolean isGroup)` -> `int`
- `needUpdate()` -> `boolean`
- `toString()` -> `String`

## `org.telegram.tgnet.TLRPC$BaseTheme`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `BaseTheme`

## `org.telegram.tgnet.TLRPC$ChatTheme`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ChatTheme`
- `static ofEmoticon(String emoticon)` -> `ChatTheme`

## `org.telegram.tgnet.TLRPC$InputChatTheme`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputChatTheme`

## `org.telegram.tgnet.TLRPC$InputTheme`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `InputTheme`

## `org.telegram.tgnet.TLRPC$PeerColor`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PeerColor`

## `org.telegram.tgnet.TLRPC$TL_attachMenuBotIconColor`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_attachMenuBotIconColor`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_baseThemeArctic`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_baseThemeClassic`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_baseThemeDay`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_baseThemeNight`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_baseThemeTinted`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionChangeColor`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionChangePeerColor`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionChangeTheme`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_channels_updateColor`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_chatTheme`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_getPeerColors`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_peerColorOption`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_help_peerColorOption`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_peerColorSet`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_peerColors`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_help_peerColorsNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputPeerColorCollectible`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputTheme`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_inputThemeSlug`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionSetChatTheme`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messageActionSetChatTheme_layer213`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_messages_setChatTheme`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Updates`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_peerColor`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_peerColorCollectible`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_theme`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_themeDocumentNotModified_layer106`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_theme_layer106`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_theme_layer131`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_theme_layer133`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$TL_webPageAttributeTheme`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$Theme`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_theme`

## `org.telegram.tgnet.TLRPC$Tl_inputChatTheme`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$Tl_inputChatThemeEmpty`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.TLRPC$help_PeerColorSet`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `help_PeerColorSet`

## `org.telegram.tgnet.TLRPC$help_PeerColors`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `help_PeerColors`

## `org.telegram.tgnet.tl.TL_account$ChatThemes`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `ChatThemes`

## `org.telegram.tgnet.tl.TL_account$TL_chatThemesNotModified`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_themes`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$TL_themesNotModified`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$Themes`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `Themes`

## `org.telegram.tgnet.tl.TL_account$Tl_chatThemes`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$createTheme`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getChatThemes`
- `deserializeResponseT(InputSerializedData stream, int constructor, boolean exception)` -> `Themes`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getTheme`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$getThemes`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$installTheme`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$saveTheme`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$updateColor`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$updateTheme`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_account$uploadTheme`
- `deserializeResponse(InputSerializedData stream, int constructor, boolean exception)` -> `TLObject`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.tgnet.tl.TL_update$TL_updateTheme`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.ui.ActionBar.ActionBar`
- `checkAvatarContainerWidth(boolean animated)` -> `void`
- `checkMenuItemsWidth()` -> `void`
- `hasOverlappingRendering()` -> `boolean`
- `requestLayout()` -> `void`
- `shouldAddToContainer()` -> `boolean`

## `org.telegram.ui.ActionBar.ActionBar$ActionBarMenuOnItemClick`
- `canOpenMenu()` -> `boolean`

## `org.telegram.ui.ActionBar.ActionBarLayout`
- `addFragmentToStack(BaseFragment fragment, int position)` -> `boolean`
- `addView(View child, int index, ViewGroup.LayoutParams params)` -> `void`
- `checkBlackScreen(String action)` -> `void`
- `checkTransitionAnimation()` -> `boolean`
- `hasOverlappingRendering()` -> `boolean`
- `removeAllFragments()` -> `void`
- `removeFragmentFromStack(BaseFragment fragment, boolean immediate)` -> `void`
- `requestDisallowInterceptTouchEvent(boolean disallowIntercept)` -> `void`

## `org.telegram.ui.ActionBar.ActionBarLayout$LayoutContainer`
- `addView(View child, int index, ViewGroup.LayoutParams params)` -> `void`
- `processMenuButtonsTouch(MotionEvent event)` -> `void`

## `org.telegram.ui.ActionBar.ActionBarMenu`
- `addItem(int id, Drawable drawable)` -> `ActionBarMenuItem`
- `addItem(int id, int icon)` -> `ActionBarMenuItem`
- `addItem(int id, int icon, Theme.ResourcesProvider resourcesProvider)` -> `ActionBarMenuItem`
- `addItem(int id, CharSequence text)` -> `ActionBarMenuItem`
- `addItem(int id, int icon, int backgroundColor)` -> `ActionBarMenuItem`
- `addItem(int id, int icon, int backgroundColor, Theme.ResourcesProvider resourcesProvider)` -> `ActionBarMenuItem`
- `addItem(int id, int icon, CharSequence text, int backgroundColor, Drawable drawable, int width, CharSequence title)` -> `ActionBarMenuItem`
- `addItem(int id, int icon, CharSequence text, int backgroundColor, Drawable drawable, int width, CharSequence title, Theme.ResourcesProvider resourcesProvider)` -> `ActionBarMenuItem`
- `addItemAt(int index, int id, int icon, CharSequence text, int backgroundColor, Drawable drawable, int width, CharSequence title, Theme.ResourcesProvider resourcesProvider)` -> `ActionBarMenuItem`
- `addItemWithWidth(int id, int icon, int width)` -> `ActionBarMenuItem`
- `addItemWithWidth(int id, Drawable drawable, int width, CharSequence title)` -> `ActionBarMenuItem`
- `addItemWithWidth(int id, int icon, int width, CharSequence title)` -> `ActionBarMenuItem`

## `org.telegram.ui.ActionBar.ActionBarMenu$LazyItem`
- `add()` -> `void`

## `org.telegram.ui.ActionBar.ActionBarMenuItem`
- `addColoredGap()` -> `ActionBarPopupWindow.GapView`
- `addColoredGap(int id)` -> `ActionBarPopupWindow.GapView`
- `addDivider(int color)` -> `View`
- `addGap(int id)` -> `View`
- `static addGap(int id, ActionBarPopupWindow.ActionBarPopupWindowLayout popupLayout)` -> `View`
- `static addItem(ViewGroup windowLayout, int icon, CharSequence text, boolean needCheck, Theme.ResourcesProvider resourcesProvider)` -> `ActionBarMenuSubItem`
- `static addItem(boolean first, boolean last, ViewGroup windowLayout, int icon, CharSequence text, boolean needCheck, Theme.ResourcesProvider resourcesProvider)` -> `ActionBarMenuSubItem`
- `addSearchFilter(FiltersView.MediaFilterData filter)` -> `void`
- `addSubItem(View view, int width, int height)` -> `void`
- `addSubItem(int id, View view, int width, int height)` -> `void`
- `addSubItem(int id, CharSequence text)` -> `TextView`
- `addSubItem(int id, int icon, CharSequence text)` -> `ActionBarMenuSubItem`
- `addSubItem(int id, int icon, CharSequence text, Theme.ResourcesProvider resourcesProvider)` -> `ActionBarMenuSubItem`
- `addSubItem(int id, int icon, CharSequence text, boolean needCheck)` -> `ActionBarMenuSubItem`
- `addSubItem(int id, int icon, Drawable iconDrawable, CharSequence text, boolean dismiss, boolean needCheck)` -> `ActionBarMenuSubItem`
- `addSubItem(int id, int icon, Drawable iconDrawable, CharSequence text, boolean dismiss, boolean needCheck, Theme.ResourcesProvider resourcesProvider)` -> `ActionBarMenuSubItem`
- `addSubItem(int id, View cell)` -> `View`
- `addSwipeBackItem(int icon, Drawable iconDrawable, String text, View viewToSwipeBack)` -> `ActionBarMenuSubItem`
- `static addText(ActionBarPopupWindow.ActionBarPopupWindowLayout popupLayout, String text, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `checkHideMenuItem()` -> `void`
- `static checkRtl(String string)` -> `boolean`
- `hasSubItem(int id)` -> `boolean`
- `hasSubMenu()` -> `boolean`
- `removeAllSubItems()` -> `void`
- `removeSearchFilter(FiltersView.MediaFilterData filter)` -> `void`
- `requestFocusOnSearchView()` -> `void`

## `org.telegram.ui.ActionBar.ActionBarMenuItem$ActionBarMenuItemSearchListener`
- `canClearCaption()` -> `boolean`
- `canCollapseSearch()` -> `boolean`
- `canToggleSearch()` -> `boolean`

## `org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout`
- `addView(View child)` -> `void`
- `addView(View child, LinearLayout.LayoutParams layoutParams)` -> `void`
- `addViewToSwipeBack(View v)` -> `int`
- `removeInnerViews()` -> `void`

## `org.telegram.ui.ActionBar.AdjustPanLayoutHelper`
- `onPanTranslationUpdate(float y, float progress, boolean keyboardVisible)` -> `void`

## `org.telegram.ui.ActionBar.AlertDialog$Builder`
- `addBottomView(View view)` -> `Builder`
- `setMessage(CharSequence message)` -> `Builder`
- `setMessageTextViewClickable(boolean value)` -> `Builder`

## `org.telegram.ui.ActionBar.BaseFragment`
- `addSheet(BaseFragment.AttachedSheet sheet)` -> `void`
- `canBeginSlide()` -> `boolean`
- `checkSystemBarColors()` -> `void`
- `getMessagesController()` -> `MessagesController`
- `getMessagesStorage()` -> `MessagesStorage`
- `getSecretChatHelper()` -> `SecretChatHelper`
- `getSendMessagesHelper()` -> `SendMessagesHelper`
- `getUserConfig()` -> `UserConfig`
- `getVisibleDialog()` -> `Dialog`
- `hasForceLightStatusBar()` -> `boolean`
- `static hasFullyVisibleSheets(BaseFragment fragment)` -> `boolean`
- `hasOwnBackground()` -> `boolean`
- `hasSheet()` -> `boolean`
- `static hasSheets(BaseFragment fragment)` -> `boolean`
- `hasShownFullyVisibleSheet()` -> `boolean`
- `hasShownSheet()` -> `boolean`
- `hasStoryViewer()` -> `boolean`
- `isActionBarCrossfadeEnabled()` -> `boolean`
- `isBeginToShow()` -> `boolean`
- `isBotView(View child)` -> `boolean`
- `isFinishing()` -> `boolean`
- `isInBubbleMode()` -> `boolean`
- `isInPreviewMode()` -> `boolean`
- `isLastFragment()` -> `boolean`
- `isLightStatusBar()` -> `boolean`
- `isPaused()` -> `boolean`
- `isRemovingFromStack()` -> `boolean`
- `isStoryViewer(View child)` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `onPanTranslationUpdate(float y)` -> `void`
- `removeSelfFromStack()` -> `void`
- `removeSelfFromStack(boolean immediate)` -> `void`
- `removeSheet(BaseFragment.AttachedSheet sheet)` -> `void`
- `saveKeyboardPositionBeforeTransition()` -> `void`
- `saveSelfArgs(Bundle args)` -> `void`
- `shouldOverrideSlideTransition(boolean topFragment, boolean backAnimation)` -> `boolean`

## `org.telegram.ui.ActionBar.BottomSheet`
- `canDismissWithSwipe()` -> `boolean`
- `canDismissWithTouchOutside()` -> `boolean`
- `canSwipeToBack(MotionEvent event)` -> `boolean`
- `cancelSheetAnimation()` -> `void`
- `processLegacyContainerInsets(WindowInsets insets)` -> `void`
- `shouldOverlayCameraViewOverNavBar()` -> `boolean`

## `org.telegram.ui.ActionBar.BottomSheet$BottomSheetDelegate`
- `canDismiss()` -> `boolean`

## `org.telegram.ui.ActionBar.BottomSheet$ContainerView`
- `processTouchEvent(MotionEvent ev, boolean intercept)` -> `boolean`

## `org.telegram.ui.ActionBar.BottomSheetTabDialog`
- `static checkSheet(BottomSheetTabsOverlay.Sheet sheet)` -> `BottomSheetTabsOverlay.Sheet`

## `org.telegram.ui.ActionBar.BottomSheetTabDialog$WindowView`
- `putView()` -> `void`

## `org.telegram.ui.ActionBar.BottomSheetTabs`
- `removeAll()` -> `boolean`
- `removeTab(WebTabData tab, Utilities.Callback<Boolean> callback)` -> `void`
- `removeTab(WebTabData tab, boolean destroy)` -> `boolean`
- `removeTab(int currentAccount, WebTabData tab, boolean destroy)` -> `boolean`

## `org.telegram.ui.ActionBar.BottomSheetTabs$WebTabData`
- `isArticle()` -> `boolean`

## `org.telegram.ui.ActionBar.BottomSheetTabsOverlay`
- `canScroll()` -> `boolean`
- `canScroll(boolean animated)` -> `boolean`

## `org.telegram.ui.ActionBar.BottomSheetTabsOverlay$TabPreview`
- `cancelDismissAnimator()` -> `void`
- `isPressed()` -> `boolean`

## `org.telegram.ui.ActionBar.DrawerLayoutContainer`
- `addView(View child, int index, ViewGroup.LayoutParams params)` -> `void`
- `requestLayout()` -> `void`

## `org.telegram.ui.ActionBar.EmojiThemes`
- `getBusyByUserId()` -> `long`
- `getChatTheme()` -> `TLRPC.ChatTheme`
- `isAnyStub()` -> `boolean`
- `isGiftTheme()` -> `boolean`
- `loadPreviewColors(int currentAccount)` -> `void`
- `loadWallpaper(int index, ResultCallback<Pair<Long, WallpaperBitmapHolder>> callback)` -> `void`
- `loadWallpaperGiftPattern(int index, ResultCallback<Pair<Long, Bitmap>> callback)` -> `void`
- `static loadWallpaperGiftPattern(int currentAccount, long hash, TL_stars.StarGift gift, ResultCallback<Pair<Long, Bitmap>> callback)` -> `void`
- `static loadWallpaperImage(int currentAccount, long hash, TLRPC.WallPaper wallPaper, Utilities.Callback<WallpaperBitmapHolder> callback)` -> `void`
- `loadWallpaperThumb(int index, ResultCallback<Pair<Long, Bitmap>> callback)` -> `void`
- `static saveCustomTheme(Theme.ThemeInfo themeInfo, int accentId)` -> `void`

## `org.telegram.ui.ActionBar.FloatingToolbar`
- `isHidden()` -> `boolean`
- `isShowing()` -> `boolean`

## `org.telegram.ui.ActionBar.FloatingToolbar$FloatingToolbarPopup`
- `isHidden()` -> `boolean`
- `isShowing()` -> `boolean`

## `org.telegram.ui.ActionBar.INavigationLayout`
- `addFragmentToStack(BaseFragment fragment)` -> `default boolean`
- `hasIntegratedBlurInPreview()` -> `default boolean`
- `isActionBarInCrossfade()` -> `default boolean`
- `removeAllFragments()` -> `default void`
- `removeFragmentFromStack(BaseFragment fragment)` -> `default void`
- `removeFragmentFromStack(int i)` -> `default void`

## `org.telegram.ui.ActionBar.INavigationLayout$StartColorsProvider`
- `saveColors(Theme.ResourcesProvider fragmentResourceProvider)` -> `void`

## `org.telegram.ui.ActionBar.MessageDrawable`
- `hasGradient()` -> `boolean`

## `org.telegram.ui.ActionBar.SimpleTextView`
- `hasOverlappingRendering()` -> `boolean`

## `org.telegram.ui.ActionBar.Theme`
- `static canStartHolidayAnimation()` -> `boolean`
- `static cancelAutoNightThemeCallbacks()` -> `void`
- `static checkAutoNightThemeConditions()` -> `void`
- `static checkAutoNightThemeConditions(boolean force)` -> `void`
- `static checkCurrentRemoteTheme(boolean force)` -> `void`
- `static deleteTheme(ThemeInfo themeInfo)` -> `boolean`
- `static deleteThemeAccent(ThemeInfo theme, ThemeAccent accent, boolean save)` -> `boolean`
- `static getChatStatusDrawable(int type)` -> `StatusDrawable`
- `static getServiceMessageColor()` -> `int`
- `static hasCustomWallpaper()` -> `boolean`
- `static hasGradientService()` -> `boolean`
- `static hasHue(int color)` -> `boolean`
- `static hasThemeKey(int key)` -> `boolean`
- `static hasWallpaperFromTheme()` -> `boolean`
- `static isAnimatingColor()` -> `boolean`
- `static isCurrentThemeDark()` -> `boolean`
- `static isCurrentThemeDay()` -> `boolean`
- `static isCurrentThemeNight()` -> `boolean`
- `static isCustomTheme()` -> `boolean`
- `static isCustomWallpaperColor()` -> `boolean`
- `static isHome(ThemeAccent accent)` -> `boolean`
- `static isPatternWallpaper()` -> `boolean`
- `static isThemeInstalled(ThemeInfo themeInfo)` -> `boolean`
- `static isThemeWallpaperPublic()` -> `boolean`
- `static isWallpaperMotion()` -> `boolean`
- `static loadRemoteThemes(final int currentAccount, boolean force)` -> `void`
- `static loadWallpaper(boolean async)` -> `void`
- `static onUpdateThemeAccents()` -> `void`
- `static saveAutoNightThemeConfig()` -> `void`
- `static saveCurrentTheme(ThemeInfo themeInfo, boolean finalSave, boolean newTheme, boolean upload)` -> `void`
- `static saveThemeAccents(ThemeInfo theme, boolean save, boolean remove, boolean indexOnly, boolean upload)` -> `void`
- `static saveThemeAccents(ThemeInfo theme, boolean save, boolean remove, boolean indexOnly, boolean upload, boolean migration)` -> `void`

## `org.telegram.ui.ActionBar.Theme$OverrideWallpaperInfo`
- `isColor()` -> `boolean`
- `isDefault()` -> `boolean`
- `isTheme()` -> `boolean`
- `saveOverrideWallpaper()` -> `void`

## `org.telegram.ui.ActionBar.Theme$ResourcesProvider`
- `hasGradientService()` -> `default boolean`
- `isDark()` -> `default boolean`

## `org.telegram.ui.ActionBar.Theme$ThemeAccent`
- `saveToFile()` -> `File`

## `org.telegram.ui.ActionBar.Theme$ThemeInfo`
- `hasAccentColors()` -> `boolean`
- `isDark()` -> `boolean`
- `isLight()` -> `boolean`

## `org.telegram.ui.ActionBar.theme.ThemeKey`
- `hashCode()` -> `int`
- `isEmpty()` -> `boolean`

## `org.telegram.ui.ChannelColorActivity`
- `hasUnsavedChanged()` -> `boolean`

## `org.telegram.ui.ChannelColorActivity$ThemeDelegate`
- `isDark()` -> `boolean`

## `org.telegram.ui.Components.BlurBehindDrawable`
- `checkSizes()` -> `void`
- `isFullyDrawing()` -> `boolean`

## `org.telegram.ui.Components.BlurringShader$BlurManager`
- `hasRenderNode()` -> `boolean`

## `org.telegram.ui.Components.ColorPicker$ColorPickerDelegate`
- `deleteTheme()` -> `default void`
- `hasChanges()` -> `default boolean`

## `org.telegram.ui.Components.EmojiColorPickerWindow`
- `isCompound()` -> `boolean`

## `org.telegram.ui.Components.OverlayActionBarLayoutDialog`
- `addFragment(BaseFragment fragment)` -> `void`

## `org.telegram.ui.Components.Paint.PersistColorPalette`
- `saveColors()` -> `void`

## `org.telegram.ui.Components.SimpleThemeDescription`
- `static add(ArrayList<ThemeDescription> descriptions, Runnable upd, int... keys)` -> `void`

## `org.telegram.ui.Components.ThemeEditorView$EditorAlert`
- `canDismissWithSwipe()` -> `boolean`

## `org.telegram.ui.Components.blur3.Blur3HashImpl`
- `add(long value)` -> `void`
- `isUnsupported()` -> `boolean`

## `org.telegram.ui.Components.blur3.capture.IBlur3Hash`
- `add(View v)` -> `default void`
- `add(boolean value)` -> `default void`
- `add(ColorMatrix colorMatrix)` -> `default void`
- `add(float[] arr)` -> `default void`
- `addF(float value)` -> `default void`

## `org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable`
- `hasDisplayList()` -> `boolean`

## `org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed`
- `isDark()` -> `boolean`

## `org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl`
- `static checkBlurEnabled(Theme.ResourcesProvider resourcesProvider)` -> `boolean`
- `static checkBlurEnabled(int currentAccount, Theme.ResourcesProvider resourcesProvider)` -> `boolean`

## `org.telegram.ui.Components.blur3.utils.BitmapChangeTracker`
- `isInvalidated(Bitmap bitmap)` -> `boolean`

## `org.telegram.ui.Components.blur3.utils.Blur3Utils`
- `static checkBitmapSourceMatrixScale(@Nullable BlurredBackgroundSourceBitmap source, @Nullable View view)` -> `boolean`

## `org.telegram.ui.Components.quickforward.BlurVisibilityDrawable`
- `hasBitmap()` -> `boolean`

## `org.telegram.ui.GroupColorActivity`
- `getMessagePreviewType()` -> `int`
- `isForum()` -> `boolean`

## `org.telegram.ui.PeerColorActivity`
- `hasUnsavedChanged()` -> `boolean`

## `org.telegram.ui.PeerColorActivity$Page`
- `checkResetColorButton()` -> `void`
- `hasUnsavedChanged()` -> `boolean`

## `org.telegram.ui.PeerColorActivity$PeerColorGrid$ColorButton`
- `isPressed()` -> `boolean`

## `org.telegram.ui.ThemePreviewActivity$ThemeDelegate`
- `hasGradientService()` -> `boolean`
- `isDark()` -> `boolean`

## `org.telegram.ui.web.WebActionBar`
- `onColorsUpdated()` -> `void`
- `onSearchUpdated(String s)` -> `void`

## `org.telegram.utils.code.highlight.CodeHighlighting$ColorSpan`
- `getColorKey()` -> `int`
- `updateDrawState(TextPaint tp)` -> `void`

## `org.telegram.utils.glass.GlassEngine`
- `addAdditionalInvalidationCondition(InvalidationCondition condition)` -> `void`
- `addColorSource(BlurredBackgroundSourceColor sourceColor, ThemedColorDelegate delegate)` -> `void`
- `addScrolledView(ViewPager viewPager)` -> `void`
- `addScrolledView(RecyclerListView recyclerListView)` -> `void`
- `getAllVisibleDrawablesWithDisplayListPositionsMerged()` -> `GlassPositionsArray`
- `registerDrawable(@NonNull View view, @NonNull BlurredBackgroundDrawable drawable)` -> `void`
- `setGlassInvalidationListener(GlassInvalidationListener glassInvalidationListener)` -> `void`
- `setPositionsMerger(GlassPositionsMerger positionsMerger)` -> `void`
- `setRoot(View root)` -> `void`

## `org.telegram.utils.glass.positions.GlassPositionsArray`
- `add(@NonNull RectF rect)` -> `RectF`
- `add(float left, float top, float right, float bottom)` -> `RectF`
- `capacity()` -> `int`
- `clear()` -> `void`
- `clip(float left, float top, float right, float bottom)` -> `void`
- `equals(Object obj)` -> `boolean`
- `get(int index)` -> `RectF`
- `hashCode()` -> `int`
- `isEmpty()` -> `boolean`
- `outset(float dx, float dy)` -> `void`
- `removeUnordered(int index)` -> `void`
- `set(GlassPositionsArray other)` -> `void`
- `size()` -> `int`

## `org.telegram.utils.glass.positions.GlassPositionsMerger`
- `merge(GlassPositionsArray positions, GlassPositionsArray output)` -> `void`
