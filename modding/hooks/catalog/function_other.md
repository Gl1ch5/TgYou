# function / other (5339 методов)

## `org.telegram.DispatchQueuePriority`
- `cancelRunnable(Runnable runnable)` -> `void`
- `pause()` -> `void`
- `postRunnable(Runnable runnable)` -> `void`
- `postRunnable(Runnable runnable, int priority)` -> `Runnable`
- `resume()` -> `void`
- `static wrap(Runnable runnable, int priority)` -> `Runnable`

## `org.telegram.DispatchQueuePriority$PriorityRunnable`
- `run()` -> `void`

## `org.telegram.PhoneFormat.PhoneFormat`
- `callingCodeForCountryCode(String countryCode)` -> `String`
- `callingCodeInfo(String callingCode)` -> `CallingCodeInfo`
- `countriesForCallingCode(String callingCode)` -> `ArrayList`
- `defaultCallingCode()` -> `String`
- `findCallingCodeInfo(String str)` -> `CallingCodeInfo`
- `format(String orig)` -> `String`
- `static getInstance()` -> `PhoneFormat`
- `init(String countryCode)` -> `void`
- `isPhoneNumberValid(String phoneNumber)` -> `boolean`
- `parseDataHeader()` -> `void`
- `static strip(String str)` -> `String`
- `static stripExceptNumbers(String str, boolean includePlus)` -> `String`
- `static stripExceptNumbers(String str)` -> `String`
- `value16(int offset)` -> `short`
- `value32(int offset)` -> `int`
- `valueString(int offset)` -> `String`

## `org.telegram.PhoneFormat.PhoneRule`
- `format(String str, String intlPrefix, String trunkPrefix)` -> `String`
- `hasIntlPrefix()` -> `boolean`
- `hasTrunkPrefix()` -> `boolean`

## `org.telegram.PhoneFormat.RuleSet`
- `format(String str, String intlPrefix, String trunkPrefix, boolean prefixRequired)` -> `String`
- `isValid(String str, String intlPrefix, String trunkPrefix, boolean prefixRequired)` -> `boolean`

## `org.telegram.SQLite.SQLiteCursor`
- `byteArrayValue(int columnIndex)` -> `byte[]`
- `byteBufferValue(int columnIndex)` -> `NativeByteBuffer`
- `checkRow()` -> `void`
- `dispose()` -> `void`
- `doubleValue(int columnIndex)` -> `double`
- `getColumnCount()` -> `int`
- `getPreparedStatement()` -> `SQLitePreparedStatement`
- `getStatementHandle()` -> `long`
- `getTypeOf(int columnIndex)` -> `int`
- `intValue(int columnIndex)` -> `int`
- `isNull(int columnIndex)` -> `boolean`
- `longValue(int columnIndex)` -> `long`
- `next()` -> `boolean`
- `stringValue(int columnIndex)` -> `String`
- `tlObjectValue(int columnIndex, Vector.TLDeserializer<T> deserializer, boolean exception)` -> `T`

## `org.telegram.SQLite.SQLiteDatabase`
- `beginTransaction()` -> `void`
- `checkOpened()` -> `void`
- `close()` -> `void`
- `commitTransaction()` -> `void`
- `executeFast(String sql)` -> `SQLitePreparedStatement`
- `executeInt(String sql, Object... args)` -> `Integer`
- `explainQuery(String sql, Object... args)` -> `void`
- `finalize()` -> `void`
- `getSQLiteHandle()` -> `long`
- `queryFinalized(String sql, Object... args)` -> `SQLiteCursor`
- `tableExists(String tableName)` -> `boolean`

## `org.telegram.SQLite.SQLitePreparedStatement`
- `checkFinalized()` -> `void`
- `dispose()` -> `void`
- `finalizeQuery()` -> `void`
- `getStatementHandle()` -> `long`
- `query(Object[] args)` -> `SQLiteCursor`
- `requery()` -> `void`
- `step()` -> `int`
- `stepThis()` -> `SQLitePreparedStatement`

## `org.telegram.messenger.ANRDetector`
- `destroy()` -> `void`
- `onBecameBackground()` -> `void`
- `onBecameForeground()` -> `void`

## `org.telegram.messenger.AccountInstance`
- `getColorPalette()` -> `PersistColorPalette`
- `getConnectionsManager()` -> `ConnectionsManager`
- `getContactsController()` -> `ContactsController`
- `getCurrentAccount()` -> `int`
- `getDownloadController()` -> `DownloadController`
- `getFileLoader()` -> `FileLoader`
- `getFileRefController()` -> `FileRefController`
- `getGiftAuctionsController()` -> `GiftAuctionController`
- `static getInstance(int num)` -> `AccountInstance`
- `getLocationController()` -> `LocationController`
- `getMediaDataController()` -> `MediaDataController`
- `getMemberRequestsController()` -> `MemberRequestsController`
- `getMessagesController()` -> `MessagesController`
- `getMessagesStorage()` -> `MessagesStorage`
- `getNotificationCenter()` -> `NotificationCenter`
- `getNotificationsController()` -> `NotificationsController`
- `getNotificationsSettings()` -> `SharedPreferences`
- `getSecretChatHelper()` -> `SecretChatHelper`
- `getSendMessagesHelper()` -> `SendMessagesHelper`
- `getStatsController()` -> `StatsController`
- `getUserConfig()` -> `UserConfig`

## `org.telegram.messenger.AiTonesController`
- `add(TL_aicompose.AiComposeTone tone)` -> `void`
- `cancel()` -> `void`
- `edit(TL_aicompose.TL_aiComposeTone tone)` -> `void`
- `getSavedTonesCount()` -> `int`
- `isLoading()` -> `boolean`
- `load()` -> `void`
- `notifyUpdate()` -> `void`
- `remove(TL_aicompose.AiComposeTone tone)` -> `void`
- `request()` -> `void`
- `unsave(TL_aicompose.AiComposeTone tone)` -> `void`

## `org.telegram.messenger.AndroidUtilities`
- `static HSBtoRGB(float hue, float saturation, float brightness)` -> `int`
- `static RGBtoHSB(int r, int g, int b)` -> `float[]`
- `static addLinks(Spannable text, int mask)` -> `boolean`
- `static addLinks(Spannable text, int mask, boolean internalOnly)` -> `boolean`
- `static addLinks(Spannable text, int mask, boolean internalOnly, boolean removeOldReplacements)` -> `boolean`
- `static addLinksSafe(Spannable text, int mask, boolean internalOnly, boolean removeOldReplacements)` -> `boolean`
- `static addMediaToGallery(String fromPath)` -> `void`
- `static addMediaToGallery(File file)` -> `void`
- `static addToClipboard(CharSequence plain, String html)` -> `boolean`
- `static addToClipboard(CharSequence str)` -> `boolean`
- `static adjustBrightnessColorMatrix(ColorMatrix colorMatrix, float brightness)` -> `void`
- `static adjustHueColorMatrix(ColorMatrix cm, float value)` -> `void`
- `static adjustSaturationColorMatrix(ColorMatrix colorMatrix, float saturation)` -> `void`
- `static allGlobalViews()` -> `List<View>`
- `static allowScreenCapture()` -> `boolean`
- `static appCenterLog(Throwable e)` -> `void`
- `static applyColorMatrix(int argb, ColorMatrix matrix)` -> `int`
- `static applyEdgeToEdgeLayoutParams(WindowManager.LayoutParams windowLayoutParams)` -> `void`
- `static applySpring(Animator anim, double stiffness, double damping)` -> `void`
- `static applySpring(Animator anim, double stiffness, double damping, double mass)` -> `void`
- `static applySpring(Animator anim, double stiffness, double damping, double mass, double initialVelocity)` -> `void`
- `static applySpring(Animator anim, float stiffness, float damping, float mass, long overrideDuration)` -> `void`
- `static bold()` -> `Typeface`
- `static calcAuthKeyHash(byte[] auth_key)` -> `byte[]`
- `static calcBitmapColor(Bitmap bitmap)` -> `int`
- `static calcDrawableColor(Drawable drawable)` -> `int[]`
- `static cancelRunOnUIThread(Runnable runnable)` -> `void`
- `static cascade(float fullAnimationT, float position, float count, float waveLength)` -> `float`
- `static charSequenceContains(CharSequence cs, CharSequence needle)` -> `boolean`
- `static charSequenceIndexOf(CharSequence cs, CharSequence needle, int fromIndex)` -> `int`
- `static charSequenceIndexOf(CharSequence cs, CharSequence needle)` -> `int`
- `static checkAndroidTheme(Context context, boolean open)` -> `void`
- `static checkDisplaySize(Context context, Configuration newConfiguration)` -> `void`
- `static checkHostForPunycode(String url)` -> `boolean`
- `static checkInlinePermissions(Context context)` -> `boolean`
- `static checkPhonePattern(String pattern, String phone)` -> `boolean`
- `static checkPipPermissions(Context context)` -> `boolean`
- `static cleanValue(float p_val, float p_limit)` -> `float`
- `static clearDrawableAnimation(View view)` -> `void`
- `static cloneByteBuffer(ByteBuffer original)` -> `ByteBuffer`
- `static compare(int lhs, int rhs)` -> `int`
- `static compare(long lhs, long rhs)` -> `int`
- `static computeDampingRatio(float tension , float friction , float mass)` -> `float`
- `static computePerceivedBrightness(int color)` -> `float`
- `static concat(CharSequence... text)` -> `CharSequence`
- `static copyFile(InputStream sourceFile, File destFile)` -> `boolean`
- `static copyFile(InputStream sourceFile, OutputStream out)` -> `boolean`
- `static copyFile(File sourceFile, File destFile)` -> `boolean`
- `static copyFileSafe(File sourceFile, File destFile)` -> `boolean`
- `static createCalendarEvent(Activity activity, long timestampMillis, String title, String description, boolean allDay)` -> `void`
- `static createEmptyFile(File f)` -> `void`
- `static decodeQuotedPrintable(final byte[] bytes)` -> `byte[]`
- `static distance(float x1, float y1, float x2, float y2)` -> `float`
- `static distanceInfluenceForSnapDuration(float f)` -> `float`
- `static doOnLayout(View view, Runnable runnable)` -> `void`
- `static doOnPreDraw(@NonNull View view, @NonNull Runnable action)` -> `void`
- `static doSafe(Utilities.Callback0Return<Boolean> runnable)` -> `boolean`
- `static doSafe(Utilities.Callback0Return<Boolean> runnable, int timeout)` -> `boolean`
- `static dp(float value)` -> `int`
- `static dp2(float value)` -> `int`
- `static dpf2(float value)` -> `float`
- `static dpr(float value)` -> `int`
- `static dumpStackTrace()` -> `StackTraceElement[]`
- `static ellipsizeCenterEnd(CharSequence str, String query, int availableWidth, TextPaint textPaint, int maxSymbols)` -> `CharSequence`
- `static emptyMotionEvent()` -> `MotionEvent`
- `static enableEdgeToEdge(Activity activity)` -> `void`
- `static enableEdgeToEdge(@NonNull Window window)` -> `void`
- `static endIncomingCall()` -> `void`
- `static escape(String str)` -> `String`
- `static executeOnUIThread(Runnable runnable)` -> `void`
- `static fillStatusBarHeight(Context context, boolean force)` -> `void`
- `static find(List<A> array, Class<B> clazz)` -> `B`
- `static findActivity(Context context)` -> `Activity`
- `static findChildViewUnder(ViewGroup parent, float x, float y)` -> `View`
- `static findClickableView(ViewGroup container, float x, float y)` -> `boolean`
- `static findClickableView(ViewGroup container, float x, float y, View onlyThisView)` -> `boolean`
- `static findDocument(List<TLRPC.Document> array, long id)` -> `TLRPC.Document`
- `static findLast(List<A> array, Class<B> clazz)` -> `B`
- `static findPhoto(List<TLRPC.Photo> array, long id)` -> `TLRPC.Photo`
- `static fixGoogleMapsBug()` -> `void`
- `static fixLocationCoord(double value)` -> `double`
- `static fixedDispatchApplyWindowInsets(@NonNull WindowInsets insets, ViewGroup view)` -> `WindowInsets`
- `static forEachViews(View view, Utilities.Callback<View> consumer)` -> `void`
- `static forEachViews(RecyclerView recyclerView, Utilities.Callback<View> consumer)` -> `void`
- `static formapMapUrl(int account, double lat, double lon, int width, int height, boolean marker, int zoom, int provider)` -> `String`
- `static formatCount(int count)` -> `String`
- `static formatDuration(int duration, boolean isLong)` -> `String`
- `static formatDuration(int duration, boolean isLong, boolean noSecondsIfHours)` -> `String`
- `static formatDuration(int progress, int duration, boolean isLong)` -> `String`
- `static formatDurationNoHours(int duration, boolean isLong)` -> `String`
- `static formatFileSize(long size)` -> `String`
- `static formatFileSize(long size, boolean removeZero, boolean makeShort)` -> `String`
- `static formatFullDuration(int duration)` -> `String`
- `static formatLongDuration(int duration)` -> `String`
- `static formatLongDuration(int progress, int duration)` -> `String`
- `static formatShortDuration(int duration)` -> `String`
- `static formatShortDuration(int progress, int duration)` -> `String`
- `static formatSpannable(CharSequence format, CharSequence... cs)` -> `SpannableStringBuilder`
- `static formatSpannable(CharSequence format, GenericProvider<Integer, String> keysProvider, CharSequence... cs)` -> `SpannableStringBuilder`
- `static formatSpannableSimple(CharSequence format, CharSequence... cs)` -> `SpannableStringBuilder`
- `static formatTimerDurationFast(long seconds, int ms)` -> `String`
- `static formatTimestamp(int duration)` -> `String`
- `static formatVideoDuration(int progress, int duration)` -> `String`
- `static formatVideoDurationFast(int minutes, int seconds)` -> `String`
- `static formatWholeNumber(int v, int dif)` -> `String`
- `static generateFileName(int type, String ext)` -> `String`
- `static generatePicturePath()` -> `File`
- `static generatePicturePath(boolean secretChat, String ext)` -> `File`
- `static generateSearchName(String name, String name2, String q)` -> `CharSequence`
- `static generateVideoPath()` -> `File`
- `static generateVideoPath(boolean secretChat)` -> `File`
- `static getAccountInProduction()` -> `int`
- `static getActivity()` -> `Activity`
- `static getActivity(Context context)` -> `Activity`
- `static getAnimatorDurationScale()` -> `float`
- `static getAverageColor(int color1, int color2)` -> `int`
- `static getBitmapFromRaw(@RawRes int rawRes)` -> `Bitmap`
- `static getBitmapFromSurface(SurfaceView surfaceView, Bitmap surfaceBitmap)` -> `void`
- `static getBitmapFromSurface(SurfaceView surfaceView, Bitmap surfaceBitmap, Runnable done)` -> `void`
- `static getBitmapFromSurface(Surface surface, Bitmap surfaceBitmap)` -> `void`
- `static getBitmapFromWindow(Window window)` -> `Bitmap`
- `static getBitmapShareUri(Bitmap bitmap, String fileName, Bitmap.CompressFormat format)` -> `Uri`
- `static getBuildVersionInfo()` -> `String`
- `static getCacheDir()` -> `File`
- `static getCertificateSHA1Fingerprint()` -> `String`
- `static getCertificateSHA256Fingerprint()` -> `String`
- `static getColorDistance(int color1, int color2)` -> `int`
- `static getCoordinateInParent(ViewGroup parentView, View view)` -> `float[]`
- `static getCurrentKeyboardLanguage()` -> `String[]`
- `static getDataColumn(Context context, Uri uri, String selection, String[] selectionArgs)` -> `String`
- `static getDataDirs()` -> `ArrayList<File>`
- `static getDefaultWindowInsets(WindowInsetsCompat insets, boolean withIme)` -> `Insets`
- `static getDominantColor(Bitmap bitmap)` -> `int`
- `static getHelloWorld()` -> `String`
- `static getHostAuthority(String uri)` -> `String`
- `static getHostAuthority(String uri, boolean removeWWW)` -> `String`
- `static getHostAuthority(Uri uri)` -> `String`
- `static getHostAuthority(Uri uri, boolean removeWWW)` -> `String`
- `static getImageOrientation(InputStream is)` -> `Pair<Integer, Integer>`
- `static getImageOrientation(File file)` -> `Pair<Integer, Integer>`
- `static getImageOrientation(String path)` -> `Pair<Integer, Integer>`
- `static getImageOrientation(ExifInterface exif)` -> `Pair<Integer, Integer>`
- `static getLightNavigationBar(Window window)` -> `boolean`
- `static getLogsDir()` -> `File`
- `static getMinTabletSide()` -> `int`
- `static getMyLayerVersion(int layer)` -> `int`
- `static getOffsetColor(int color1, int color2, float offset, float alpha)` -> `int`
- `static getPath(final Uri uri)` -> `String`
- `static getPatternColor(int color)` -> `int`
- `static getPatternColor(int color, boolean alwaysDark)` -> `int`
- `static getPatternSideColor(int color)` -> `int`
- `static getPeerLayerVersion(int layer)` -> `int`
- `static getPhotoSize()` -> `int`
- `static getPhotoSize(boolean highQuality)` -> `int`
- `static getPixelsInCM(float cm, boolean isX)` -> `float`
- `static getPrefIntOrLong(SharedPreferences preferences, String key, long defaultValue)` -> `long`
- `static getRealScreenSize()` -> `Point`
- `static getRootDirs()` -> `ArrayList<File>`
- `static getRootView(View v)` -> `View`
- `static getScaledBitmap(float w, float h, String path, String streamPath, int streamOffset)` -> `Bitmap`
- `static getShadowHeight()` -> `int`
- `static getSharingDirectory()` -> `File`
- `static getStatusBarHeight(Context context)` -> `int`
- `static getStringBytes(String src)` -> `byte[]`
- `static getSysInfoLong(String path)` -> `Long`
- `static getSysInfoString(String path)` -> `String`
- `static getSystemProperty(String key)` -> `String`
- `static getTabletLeftFragmentSize(final int fullWidth, final int insetLeft, final int insetRight)` -> `int`
- `static getThumbForNameOrMime(String name, String mime, boolean media)` -> `int`
- `static getTrimmedString(CharSequence src)` -> `CharSequence`
- `static getTypeface(String assetPath)` -> `Typeface`
- `static getURIParsePattern()` -> `Pattern`
- `static getVibrator()` -> `Vibrator`
- `static getViewInset(View view)` -> `int`
- `static getViewPositionInParent(View view, ViewGroup parent, float[] pointPosition)` -> `void`
- `static getWallPaperUrl(Object object)` -> `String`
- `static getWallpaperRotation(int angle, boolean iOS)` -> `int`
- `static getWasTablet()` -> `Boolean`
- `static googleVoiceClientService_performAction(Intent intent, boolean isVerified, Bundle options)` -> `void`
- `static gzip(File input, File output)` -> `boolean`
- `static handleProxyIntent(Activity activity, Intent intent, boolean invoked)` -> `boolean`
- `static hasDialogOnTop(BaseFragment fragment)` -> `boolean`
- `static hideKeyboard(View view)` -> `void`
- `static highlightText(CharSequence str, ArrayList<String> query, Theme.ResourcesProvider resourcesProvider)` -> `CharSequence`
- `static highlightText(CharSequence str, String query, Theme.ResourcesProvider resourcesProvider)` -> `CharSequence`
- `static hsvToColor(double h, double s, double v)` -> `int`
- `static hsvToRgb(double h, double s, double v)` -> `int[]`
- `static ilerp(int x, int a, int b)` -> `float`
- `static ilerp(float x, float a, float b)` -> `float`
- `static indexOfIgnoreCase(final String origin, final String searchStr)` -> `int`
- `static intersect1d(int x1, int x2, int y1, int y2)` -> `boolean`
- `static intersect1d(float x1, float x2, float y1, float y2)` -> `boolean`
- `static intersect1dInclusive(int x1, int x2, int y1, int y2)` -> `boolean`
- `static isAccessibilityScreenReaderEnabled()` -> `boolean`
- `static isAccessibilityTouchExplorationEnabled()` -> `boolean`
- `static isActivityRunning(Activity activity)` -> `boolean`
- `static isAirplaneModeOn()` -> `boolean`
- `static isBannedForever(TLRPC.TL_chatBannedRights rights)` -> `boolean`
- `static isContextSafe(Context context)` -> `boolean`
- `static isDarkColor(int color)` -> `boolean`
- `static isDownloadsDocument(Uri uri)` -> `boolean`
- `static isENOSPC(Exception e)` -> `boolean`
- `static isEROFS(Exception e)` -> `boolean`
- `static isExternalStorageDocument(Uri uri)` -> `boolean`
- `static isFilNotFoundException(Throwable e)` -> `boolean`
- `static isFold()` -> `boolean`
- `static isHonor()` -> `boolean`
- `static isInAirplaneMode(Context context)` -> `boolean`
- `static isInPictureInPictureMode(Activity activity)` -> `boolean`
- `static isInternalUri(Uri uri)` -> `boolean`
- `static isInternalUri(int fd)` -> `boolean`
- `static isKeyguardSecure()` -> `boolean`
- `static isMapsInstalled(BaseFragment fragment)` -> `boolean`
- `static isMediaDocument(Uri uri)` -> `boolean`
- `static isNumeric(String str)` -> `boolean`
- `static isProxyLink(Uri data)` -> `boolean`
- `static isPunctuationCharacter(char ch)` -> `boolean`
- `static isRTL(CharSequence text)` -> `boolean`
- `static isSafeToShow(Context context)` -> `boolean`
- `static isSimAvailable()` -> `boolean`
- `static isSmallScreen()` -> `boolean`
- `static isSmallTablet()` -> `boolean`
- `static isTablet()` -> `boolean`
- `static isTabletForce()` -> `boolean`
- `static isTabletInternal()` -> `boolean`
- `static isValidWallChar(char ch)` -> `boolean`
- `static isWaitingForCall()` -> `boolean`
- `static isWaitingForSms()` -> `boolean`
- `static isWhitespace(char c)` -> `boolean`
- `static isWifiEnabled(Context context)` -> `boolean`
- `static lerp(int a, int b, float f)` -> `int`
- `static lerp(float a, float b, float f)` -> `float`
- `static lerp(float a, float b, float c, float f)` -> `float`
- `static lerp(float a, float b, float c, float middle, float f)` -> `float`
- `static lerp(boolean a, boolean b, float f)` -> `float`
- `static lerp(double a, double b, float f)` -> `double`
- `static lerp(float[] ab, float f)` -> `float`
- `static lerp(Rect a, RectF b, float f, RectF to)` -> `void`
- `static lerp(RectF a, Rect b, float f, RectF to)` -> `void`
- `static lerp(RectF a, RectF b, float f, RectF to)` -> `void`
- `static lerp(Rect a, Rect b, float f, Rect to)` -> `void`
- `static lerp(int[] a, int[] b, float f, int[] to)` -> `void`
- `static lerp(float[] a, float[] b, float f, float[] to)` -> `void`
- `static lerp(Matrix a, Matrix b, float t, Matrix to)` -> `void`
- `static lerp3(float atMinusOne, float atZero, float atPlusOne, float t)` -> `float`
- `static lerpAngle(float a, float b, float f)` -> `float`
- `static lerpCentered(RectF a, RectF b, float f, RectF to)` -> `void`
- `static lerpCentered(Rect a, Rect b, float f, Rect to)` -> `void`
- `static lerpColor(int a, int b, float t)` -> `int`
- `static lerpColor3(int atMinusOne, int atZero, int atPlusOne, float t)` -> `int`
- `static loadVCardFromStream(Uri uri, int currentAccount, boolean asset, ArrayList<VcardItem> items, String name)` -> `ArrayList<TLRPC.User>`
- `static lockOrientation(Activity activity)` -> `void`
- `static lockOrientation(Activity activity, int orientation)` -> `void`
- `static logFlagSecure()` -> `void`
- `static makeAccessibilityAnnouncement(CharSequence what)` -> `void`
- `static makeClickable(CharSequence str, int type, Runnable runnable, Theme.ResourcesProvider resourcesProvider)` -> `SpannableStringBuilder`
- `static makeClickable(CharSequence str, Runnable runnable)` -> `SpannableStringBuilder`
- `static makeGlobalBlurBitmap(Utilities.Callback<Bitmap> onBitmapDone, float amount)` -> `void`
- `static makeGlobalBlurBitmap(Utilities.Callback<Bitmap> onBitmapDone, float downscale, int amount, View forView, List<View> exclude)` -> `void`
- `static multiplyAlphaComponent(int color, float k)` -> `int`
- `static multiplyBrightnessColorMatrix(ColorMatrix colorMatrix, float v)` -> `void`
- `static needShowPasscode()` -> `boolean`
- `static needShowPasscode(boolean reset)` -> `boolean`
- `static normalizeTimePart(StringBuilder stringBuilder, int time)` -> `void`
- `static normalizeTimePart(StringBuilder stringBuilder, long time)` -> `void`
- `static notifyDataSetChanged(RecyclerView listView)` -> `void`
- `static obtainLoginPhoneCall(String pattern)` -> `String`
- `static openDocument(MessageObject message, Activity activity, BaseFragment parentFragment)` -> `void`
- `static openForView(File f, String fileName, String mimeType, final Activity activity, Theme.ResourcesProvider resourcesProvider, boolean restrict)` -> `boolean`
- `static openForView(MessageObject message, Activity activity, Theme.ResourcesProvider resourcesProvider, boolean restrict)` -> `boolean`
- `static openForView(TLRPC.Document document, boolean forceCache, Activity activity)` -> `boolean`
- `static openForView(TLObject media, Activity activity)` -> `boolean`
- `static openSharing(BaseFragment fragment, String url)` -> `void`
- `static pack(int a, int b)` -> `long`
- `static premiumText(String str, Runnable runnable)` -> `SpannableStringBuilder`
- `static printLayoutRequestedChain(View view)` -> `void`
- `static printStackTrace(String tag)` -> `void`
- `static printStackTrace(StackTraceElement[] elements, String tag)` -> `void`
- `static quietSleep(long millis)` -> `void`
- `static randomOf(ArrayList<T> array)` -> `T`
- `static readRes(int rawRes)` -> `String`
- `static readRes(File path)` -> `String`
- `static readRes(File path, int rawRes)` -> `String`
- `static recycleBitmap(Bitmap image)` -> `void`
- `static recycleBitmaps(List<Bitmap> bitmapToRecycle)` -> `void`
- `static removeAdjustResize(Activity activity, int classGuid)` -> `void`
- `static removeAltFocusable(Activity activity, int classGuid)` -> `void`
- `static removeDiacritics(String str)` -> `String`
- `static removeFromParent(View child)` -> `void`
- `static removeRTL(String str)` -> `String`
- `static removeSpans(CharSequence text, Class spanClass)` -> `CharSequence`
- `static replaceArrows(CharSequence text, boolean link)` -> `CharSequence`
- `static replaceArrows(CharSequence text, boolean link, float translateX, float translateY)` -> `CharSequence`
- `static replaceArrows(CharSequence text, boolean link, float translateX, float translateY, float scale)` -> `CharSequence`
- `static replaceArrows(CharSequence text, boolean link, float translateX, float translateY, float scale, @DrawableRes int icon)` -> `CharSequence`
- `static replaceCharSequence(String what, CharSequence from, CharSequence obj)` -> `SpannableStringBuilder`
- `static replaceLinks(String str, Theme.ResourcesProvider resourcesProvider)` -> `SpannableStringBuilder`
- `static replaceLinks(String str, Theme.ResourcesProvider resourcesProvider, Runnable onLinkClick)` -> `SpannableStringBuilder`
- `static replaceMultipleCharSequence(String what, CharSequence from, CharSequence obj)` -> `CharSequence`
- `static replaceMultipleTags(String str, Runnable ...runnables)` -> `SpannableStringBuilder`
- `static replaceNewLines(CharSequence original)` -> `CharSequence`
- `static replaceSingleLink(String str, int color)` -> `SpannableStringBuilder`
- `static replaceSingleLink(String str, int color, Runnable onClick)` -> `SpannableStringBuilder`
- `static replaceSingleLinkBold(String str, int color)` -> `SpannableStringBuilder`
- `static replaceSingleLinkBold(String str, int color, Runnable onClick)` -> `SpannableStringBuilder`
- `static replaceSingleTag(String str, Runnable runnable)` -> `SpannableStringBuilder`
- `static replaceSingleTag(String str, int colorKey, int type, Runnable runnable)` -> `SpannableStringBuilder`
- `static replaceSingleTag(String str, int colorKey, int type, Runnable runnable, Theme.ResourcesProvider resourcesProvider)` -> `SpannableStringBuilder`
- `static replaceTags(String str)` -> `SpannableStringBuilder`
- `static replaceTags(String str, int flag, Object... args)` -> `SpannableStringBuilder`
- `static replaceTags(CharSequence cs)` -> `CharSequence`
- `static replaceTags(SpannableStringBuilder stringBuilder)` -> `SpannableStringBuilder`
- `static replaceTwoNewLinesToOne(CharSequence original)` -> `CharSequence`
- `static requestAdjustNothing(Activity activity, int classGuid)` -> `void`
- `static requestAdjustResize(Activity activity, int classGuid)` -> `void`
- `static requestAdjustResize(Window window, int classGuid)` -> `void`
- `static requestAltFocusable(Activity activity, int classGuid)` -> `void`
- `static resetPictureInPictureParams(Activity activity)` -> `void`
- `static resetTabletFlag()` -> `void`
- `static resetWasTabletFlag()` -> `void`
- `static rgbToHsv(int color)` -> `double[]`
- `static rgbToHsv(int r, int g, int b)` -> `double[]`
- `static roundPercents(float[] percents, int[] output)` -> `int[]`
- `static roundPlayingMessageSize(boolean withSidemenu)` -> `int`
- `static runOnUIThread(Runnable runnable)` -> `void`
- `static runOnUIThread(Runnable runnable, long delay)` -> `void`
- `static scaleRect(RectF rect, float scale)` -> `void`
- `static scaleRect(RectF rect, float scale, float px, float py)` -> `void`
- `static scrollToFragmentRow(INavigationLayout parentLayout, String rowName)` -> `void`
- `static setAdjustResizeToNothing(Activity activity, int classGuid)` -> `void`
- `static setEnabled(View view, boolean enabled)` -> `void`
- `static setLightNavigationBar(Dialog dialog, boolean enable)` -> `void`
- `static setLightNavigationBar(Activity activity, boolean enable)` -> `void`
- `static setLightNavigationBar(View view, boolean enable)` -> `void`
- `static setLightStatusBar(Activity activity, boolean enable)` -> `void`
- `static setLightStatusBar(Dialog dialog, boolean enable)` -> `void`
- `static setLightStatusBar(Window window, boolean enable)` -> `void`
- `static setLightStatusBar(View view, boolean enable)` -> `void`
- `static setMyLayerVersion(int layer, int version)` -> `int`
- `static setPeerLayerVersion(int layer, int version)` -> `int`
- `static setPictureInPictureParams(Activity activity, PictureInPictureParams params)` -> `void`
- `static setPreferredMaxRefreshRate(Window window)` -> `void`
- `static setPreferredMaxRefreshRate(Window window, float rate)` -> `void`
- `static setPreferredMaxRefreshRate(WindowManager wm, View windowView, WindowManager.LayoutParams params)` -> `void`
- `static setRectD(RectF rect, float cx, float cy, float d)` -> `void`
- `static setRectR(RectF rect, float cx, float cy, float r)` -> `void`
- `static setRectToRect(Matrix matrix, RectF src, RectF dst, int rotation, int invert, boolean translate)` -> `void`
- `static setViewLayoutMargins(View v, int l, int t, int r, int b)` -> `void`
- `static setWaitingForCall(boolean value)` -> `void`
- `static setWaitingForSms(boolean value)` -> `void`
- `static shakeView(final View view)` -> `void`
- `static shakeViewSpring(View view)` -> `void`
- `static shakeViewSpring(View view, float shiftDp)` -> `void`
- `static shakeViewSpring(View view, Runnable endCallback)` -> `void`
- `static shakeViewSpring(View view, float shiftDp, Runnable endCallback)` -> `void`
- `static shouldEnableAnimation()` -> `boolean`
- `static shouldShowClipboardToast()` -> `boolean`
- `static shouldShowUrlInAlert(String url)` -> `boolean`
- `static showKeyboard(View view)` -> `boolean`
- `static showProxyAlert(Activity activity, final ProxySettings settings)` -> `void`
- `static superTrim(CharSequence text)` -> `CharSequence`
- `static toIntArray(List<Integer> integers)` -> `int[]`
- `static translitSafe(String str)` -> `String`
- `static trim(CharSequence text, int[] newStart)` -> `CharSequence`
- `static unlockOrientation(Activity activity)` -> `void`
- `static unpackA(long packed)` -> `int`
- `static unpackB(long packed)` -> `int`
- `static updateVisibleRow(RecyclerListView listView, int position)` -> `void`
- `static updateVisibleRows(RecyclerListView listView)` -> `void`
- `static vibrate(View view)` -> `void`
- `static vibrateCursor(View view)` -> `void`

## `org.telegram.messenger.AndroidUtilities$LinkMovementMethodMy`
- `onTouchEvent(TextView widget, Spannable buffer, MotionEvent event)` -> `boolean`

## `org.telegram.messenger.AndroidUtilities$VcardItem`
- `getRawType(boolean first)` -> `String`
- `getRawValue()` -> `String[]`
- `getType()` -> `String`
- `getValue(boolean format)` -> `String`

## `org.telegram.messenger.AppGlobalConfig`
- `apply(SharedPreferences.Editor editor, TLRPC.TL_jsonObject object)` -> `boolean`
- `static getInstance(int num)` -> `AppGlobalConfig`
- `load(SharedPreferences preferences)` -> `void`

## `org.telegram.messenger.AppGlobalConfig$ConfigBoolean`
- `get()` -> `boolean`

## `org.telegram.messenger.AppGlobalConfig$ConfigBoolean$Internal`
- `apply(SharedPreferences.Editor editor, TLRPC.JSONValue tlValue)` -> `boolean`
- `load(SharedPreferences preferences)` -> `void`

## `org.telegram.messenger.AppGlobalConfig$ConfigDouble`
- `get()` -> `double`

## `org.telegram.messenger.AppGlobalConfig$ConfigDouble$Internal`
- `apply(SharedPreferences.Editor editor, TLRPC.JSONValue tlValue)` -> `boolean`
- `load(SharedPreferences preferences)` -> `void`

## `org.telegram.messenger.AppGlobalConfig$ConfigInt`
- `get()` -> `int`

## `org.telegram.messenger.AppGlobalConfig$ConfigInt$Internal`
- `apply(SharedPreferences.Editor editor, TLRPC.JSONValue tlValue)` -> `boolean`
- `load(SharedPreferences preferences)` -> `void`

## `org.telegram.messenger.AppGlobalConfig$ConfigLong`
- `get()` -> `long`

## `org.telegram.messenger.AppGlobalConfig$ConfigLong$Internal`
- `apply(SharedPreferences.Editor editor, TLRPC.JSONValue tlValue)` -> `boolean`
- `load(SharedPreferences preferences)` -> `void`

## `org.telegram.messenger.AppGlobalConfig$ConfigString`
- `get()` -> `String`
- `is(String value)` -> `boolean`

## `org.telegram.messenger.AppGlobalConfig$ConfigString$Internal`
- `apply(SharedPreferences.Editor editor, TLRPC.JSONValue tlValue)` -> `boolean`
- `load(SharedPreferences preferences)` -> `void`

## `org.telegram.messenger.AppGlobalConfig$ConfigStringSet`
- `get()` -> `Set<String>`

## `org.telegram.messenger.AppGlobalConfig$ConfigStringSet$Internal`
- `apply(SharedPreferences.Editor editor, TLRPC.JSONValue tlValue)` -> `boolean`
- `load(SharedPreferences preferences)` -> `void`

## `org.telegram.messenger.AppGlobalConfig$ConfigTime`
- `get(TimeUnit timeUnit)` -> `long`

## `org.telegram.messenger.AppStartReceiver`
- `onReceive(Context context, Intent intent)` -> `void`

## `org.telegram.messenger.ApplicationLoader`
- `addItemOptions(ItemOptions itemOptions)` -> `void`
- `static appCenterLog(Throwable e)` -> `void`
- `appCenterLogInternal(Throwable e)` -> `void`
- `attachBaseContext(Context base)` -> `void`
- `cancelDownloadingUpdate()` -> `void`
- `checkApkInstallPermissions(final Context context)` -> `boolean`
- `static checkForUpdates()` -> `void`
- `checkForUpdatesInternal()` -> `void`
- `checkRequestPermissionResult(int requestCode, String[] permissions, int[] grantResults)` -> `boolean`
- `checkUpdate(boolean force, Runnable whenDone)` -> `void`
- `consumePush(int account, JSONObject json)` -> `boolean`
- `downloadUpdate()` -> `void`
- `static getApplicationId()` -> `String`
- `static getAutodownloadNetworkType()` -> `int`
- `static getCurrentNetworkType()` -> `int`
- `getDownloadedUpdateFile()` -> `File`
- `getDownloadingUpdateProgress()` -> `float`
- `static getFilesDirFixed()` -> `File`
- `static getFilesDirFixed(String child)` -> `File`
- `static getLocationServiceProvider()` -> `ILocationServiceProvider`
- `static getMapsProvider()` -> `IMapsProvider`
- `static getPushProvider()` -> `PushListenerController.IPushListenerServiceProvider`
- `getResources()` -> `android.content.res.Resources`
- `getUpdate()` -> `BetaUpdate`
- `isAndroidTestEnv()` -> `boolean`
- `static isAndroidTestEnvironment()` -> `boolean`
- `isBeta()` -> `boolean`
- `static isBetaBuild()` -> `boolean`
- `static isConnectedOrConnectingToWiFi()` -> `boolean`
- `static isConnectedToWiFi()` -> `boolean`
- `static isConnectionSlow()` -> `boolean`
- `isCustomUpdate()` -> `boolean`
- `isDownloadingUpdate()` -> `boolean`
- `isHuaweiBuild()` -> `boolean`
- `static isHuaweiStoreBuild()` -> `boolean`
- `static isNetworkOnline()` -> `boolean`
- `static isNetworkOnlineFast()` -> `boolean`
- `static isNetworkOnlineRealtime()` -> `boolean`
- `static isRoaming()` -> `boolean`
- `isStandalone()` -> `boolean`
- `static isStandaloneBuild()` -> `boolean`
- `static logDualCamera(boolean success, boolean vendor)` -> `void`
- `logDualCameraInternal(boolean success, boolean vendor)` -> `void`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onCreate()` -> `void`
- `onCreateLocationServiceProvider()` -> `ILocationServiceProvider`
- `onCreateMapsProvider()` -> `IMapsProvider`
- `onCreatePushProvider()` -> `PushListenerController.IPushListenerServiceProvider`
- `onGetApplicationId()` -> `String`
- `onPause()` -> `boolean`
- `onResume()` -> `void`
- `onSuggestionClick(String suggestion)` -> `boolean`
- `onSuggestionFill(String suggestion, CharSequence[] output, boolean[] closeable)` -> `boolean`
- `openApkInstall(Activity activity, TLRPC.Document document)` -> `boolean`
- `openSettings(int n)` -> `BaseFragment`
- `parseTLUpdate(int constructor)` -> `TLRPC.Update`
- `static postInitApplication()` -> `void`
- `processUpdate(int currentAccount, TLRPC.Update update)` -> `void`
- `showCustomUpdateAppPopup(Context context, BetaUpdate update, int account)` -> `boolean`
- `showUpdateAppPopup(Context context, TLRPC.TL_help_appUpdate update, int account)` -> `boolean`
- `static startAppCenter(Activity context)` -> `void`
- `startAppCenterInternal(Activity context)` -> `void`
- `static startPushService()` -> `void`
- `takeUpdateLayout(Activity activity, ViewGroup sideMenuContainer)` -> `IUpdateLayout`

## `org.telegram.messenger.AutoDeleteMediaTask`
- `static lockFile(File file)` -> `void`
- `static lockFile(String file)` -> `void`
- `static run()` -> `void`
- `static unlockFile(File file)` -> `void`
- `static unlockFile(String file)` -> `void`

## `org.telegram.messenger.AutoMessageHeardReceiver`
- `onReceive(Context context, Intent intent)` -> `void`

## `org.telegram.messenger.BackupAgent`
- `onCreate()` -> `void`
- `static requestBackup()` -> `void`

## `org.telegram.messenger.BaseController`
- `getAccountInstance()` -> `AccountInstance`
- `getAppGlobalConfig()` -> `AppGlobalConfig`
- `getColorPalette()` -> `PersistColorPalette`
- `getConnectionsManager()` -> `ConnectionsManager`
- `getContactsController()` -> `ContactsController`
- `getDownloadController()` -> `DownloadController`
- `getFileLoader()` -> `FileLoader`
- `getFileRefController()` -> `FileRefController`
- `getLocationController()` -> `LocationController`
- `getMediaDataController()` -> `MediaDataController`
- `getMemberRequestsController()` -> `MemberRequestsController`
- `getMessagesController()` -> `MessagesController`
- `getMessagesStorage()` -> `MessagesStorage`
- `getNotificationCenter()` -> `NotificationCenter`
- `getNotificationsController()` -> `NotificationsController`
- `getSecretChatHelper()` -> `SecretChatHelper`
- `getSendMessagesHelper()` -> `SendMessagesHelper`
- `getStatsController()` -> `StatsController`
- `getUserConfig()` -> `UserConfig`

## `org.telegram.messenger.BetaUpdate`
- `higherThan(BetaUpdate update)` -> `boolean`

## `org.telegram.messenger.BillingController`
- `addResultListener(String productId, Consumer<BillingResult> listener)` -> `void`
- `consumeGiftPurchase(Purchase purchase, TLRPC.InputStorePaymentPurpose purpose, Runnable onDone)` -> `void`
- `formatCurrency(long amount, String currency)` -> `String`
- `formatCurrency(long amount, String currency, int exp)` -> `String`
- `formatCurrency(long amount, String currency, int exp, boolean rounded)` -> `String`
- `getCurrencyExp(String currency)` -> `int`
- `static getInstance()` -> `BillingController`
- `getLastPremiumToken()` -> `String`
- `getLastPremiumTransaction()` -> `String`
- `static getResponseCodeString(int code)` -> `String`
- `isReady()` -> `boolean`
- `launchBillingFlow(Activity activity, AccountInstance accountInstance, TLRPC.InputStorePaymentPurpose paymentPurpose, List<BillingFlowParams.ProductDetailsParams> productDetails)` -> `void`
- `launchBillingFlow(Activity activity, AccountInstance accountInstance, TLRPC.InputStorePaymentPurpose paymentPurpose, List<BillingFlowParams.ProductDetailsParams> productDetails, BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParams, boolean checkedConsume)` -> `void`
- `onBillingServiceDisconnected()` -> `void`
- `onBillingSetupFinished(@NonNull BillingResult setupBillingResult)` -> `void`
- `onPurchasesUpdated(@NonNull BillingResult billing, @Nullable List<Purchase> list)` -> `void`
- `onPurchasesUpdatedInternal(@NonNull BillingResult billing, @Nullable List<Purchase> list, @Nullable Runnable onDone)` -> `void`
- `queryProductDetails(List<QueryProductDetailsParams.Product> products, ProductDetailsResponseListenerLegacy responseListener)` -> `void`
- `queryPurchases(String productType, PurchasesResponseListener responseListener)` -> `void`
- `setOnCanceled(Runnable onCanceled)` -> `void`
- `startConnection()` -> `void`
- `startManageSubscription(Context ctx, String productId)` -> `boolean`
- `whenSetuped(Runnable listener)` -> `void`

## `org.telegram.messenger.BirthdayController`
- `check()` -> `void`
- `contains()` -> `boolean`
- `contains(long dialogId)` -> `boolean`
- `static getInstance(int num)` -> `BirthdayController`
- `getState()` -> `BirthdayState`
- `hide()` -> `void`
- `isToday(long userId)` -> `boolean`
- `static isToday(TLRPC.UserFull userFull)` -> `boolean`
- `static isToday(TL_account.TL_birthday birthday)` -> `boolean`

## `org.telegram.messenger.BirthdayController$BirthdayState`
- `contains(long did)` -> `boolean`
- `static from(TL_account.contactBirthdays tl)` -> `BirthdayState`
- `isTodayEmpty()` -> `boolean`

## `org.telegram.messenger.BirthdayController$TL_birthdays`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_birthdays`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.messenger.Bitmaps`
- `static createBitmap(int width, int height, Bitmap.Config config)` -> `Bitmap`

## `org.telegram.messenger.BotForumHelper`
- `static applyTypingAnimationSpan(CharSequence text)` -> `CharSequence`
- `beforeSendingFinalRequest(TLObject req, MessageObject msg, Runnable send)` -> `boolean`
- `beforeSendingFinalRequest(TLObject req, List<MessageObject> messages, Runnable send)` -> `boolean`
- `static getInstance(final int num)` -> `BotForumHelper`
- `getStreamingSendButtonState(long userId, int topicId)` -> `SteamingSendButtonState`
- `hasBotForumDrafts(long userId, int topicId)` -> `boolean`
- `static isBotForum(int currentAccount, long dialogId)` -> `boolean`
- `isStreamingTopic(long dialogId, long topicId)` -> `boolean`
- `onBotForumDraftCheckNewMessages(long userId, int topicId, int messageId, String message)` -> `MessageObject`
- `onBotForumDraftUpdate(long userId, int topicId, TLRPC.TL_sendMessageTextDraftAction action)` -> `void`
- `onBotForumDraftUpdate(long userId, int topicId, TLRPC.TL_sendMessageRichMessageDraftAction action)` -> `void`
- `removeAllMarkedAsRemovedMessages(long userId, int topicId)` -> `void`
- `saveIsStreamingTopic(long dialogId, long topicId, boolean isStreaming)` -> `void`
- `stopStreaming(long userId, long topicId)` -> `void`

## `org.telegram.messenger.BotForumHelper$BotDraftAnimationsPool`
- `getAnimator(long dialogId, int messageId, boolean allowCreate)` -> `MultiLayoutTypingAnimator`
- `removeAnimator(long dialogId, int messageId)` -> `void`

## `org.telegram.messenger.BotForumHelper$DialogTopicIdKeyMap`
- `get(long dialogId, long topicId)` -> `LongSparseArray<T>`
- `get(long dialogId, long topicId, long messageId)` -> `T`
- `put(long dialogId, long topicId, long messageId, T value)` -> `T`
- `remove(long dialogId, long topicId, long messageId)` -> `T`
- `removeAll(long dialogId, long topicId)` -> `LongSparseArray<T>`

## `org.telegram.messenger.BotGuardHelper`
- `closeGuardBotWebApp(long dialogId, long queryId, TLRPC.JoinChatBotResult result)` -> `void`
- `static getInstance(final int num)` -> `BotGuardHelper`
- `openGuardBotWebApp(long dialogId, long guardBotId, long queryId)` -> `void`

## `org.telegram.messenger.BotInlineKeyboard$Builder`
- `addBotKeyboard(TLRPC.TL_replyInlineMarkup replyInlineMarkup)` -> `void`
- `addContinueThreadKeyboard()` -> `void`
- `addGiftOfferKeyboard()` -> `void`
- `addKeyboardSource(Source source)` -> `void`
- `addSeparator()` -> `void`
- `addSharingOfferKeyboard()` -> `void`
- `addSuggestionKeyboard()` -> `void`
- `build()` -> `Source`
- `isEmpty()` -> `boolean`
- `isNotEmpty()` -> `boolean`

## `org.telegram.messenger.BotInlineKeyboard$Button`
- `getIconEmoji()` -> `long`
- `getIconRes()` -> `int`

## `org.telegram.messenger.BotInlineKeyboard$KeyboardSourceArray`
- `getButton(int row, int column)` -> `Button`
- `getColumnsCount(int row)` -> `int`
- `getRowsCount()` -> `int`
- `hasSeparator(int row)` -> `boolean`

## `org.telegram.messenger.BotInlineKeyboard$Source`
- `isEmpty()` -> `default boolean`

## `org.telegram.messenger.BotWebViewVibrationEffect`
- `getVibrationEffectForOreo()` -> `VibrationEffect`
- `vibrate()` -> `void`

## `org.telegram.messenger.BringAppForegroundService`
- `onHandleIntent(Intent intent)` -> `void`

## `org.telegram.messenger.BuildVars`
- `static getSmsHash()` -> `String`
- `static isBetaApp()` -> `boolean`
- `static isHuaweiStoreApp()` -> `boolean`
- `static useInvoiceBilling()` -> `boolean`

## `org.telegram.messenger.CacheByChatsController`
- `static getDaysInSeconds(int keepMedia)` -> `long`
- `static getDefault(int type)` -> `int`
- `getKeepMedia(int type)` -> `int`
- `getKeepMediaExceptions(int type)` -> `ArrayList<KeepMediaException>`
- `getKeepMediaExceptionsByDialogs()` -> `LongSparseArray<KeepMediaException>`
- `static getKeepMediaString(int keepMedia)` -> `String`
- `lookupFiles(ArrayList<? extends KeepMediaFile> keepMediaFiles)` -> `void`
- `saveKeepMediaExceptions(int type, ArrayList<KeepMediaException> exceptions)` -> `void`
- `setKeepMedia(int type, int keepMedia)` -> `void`

## `org.telegram.messenger.CacheFetcher`
- `emitLocal(Args arguments)` -> `boolean`
- `fetch(int currentAccount, Args arguments, Utilities.Callback<R> onResult)` -> `void`
- `forceRequest(int currentAccount, Args args)` -> `void`
- `getLocal(int currentAccount, Args arguments, Utilities.Callback2<Long, R> onResult)` -> `void`
- `getRemote(int currentAccount, Args arguments, long hash, Utilities.Callback4<Boolean, R, Long, Boolean> onResult)` -> `void`
- `getSavedLastTimeRequested(int hashCode)` -> `long`
- `saveLastTimeRequested()` -> `boolean`
- `setLocal(int currentAccount, Args arguments, R data, long hash)` -> `void`
- `setSavedLastTimeRequested(int hashCode, long time)` -> `void`
- `useCache(Args arguments)` -> `boolean`

## `org.telegram.messenger.CaptchaController`
- `static request(int currentAccount, int requestToken, String action, String key_id)` -> `void`

## `org.telegram.messenger.CaptchaController$Request`
- `done(String token)` -> `void`
- `hashCode()` -> `int`

## `org.telegram.messenger.ChannelBoostsController`
- `applyBoost(long dialogId, int slot, Utilities.Callback<TL_stories.TL_premium_myBoosts> onDone, Utilities.Callback<TLRPC.TL_error> onError)` -> `void`
- `getBoostsStats(long dialogId, Utilities.Callback<TL_stories.TL_premium_boostsStatus> consumer)` -> `void`
- `userCanBoostChannel(long dialogId, TL_stories.TL_premium_boostsStatus boostsStatus, Utilities.Callback<CanApplyBoost> consumer)` -> `void`

## `org.telegram.messenger.ChannelBoostsController$CanApplyBoost`
- `copy()` -> `CanApplyBoost`
- `setMyBoosts(TL_stories.TL_premium_myBoosts myBoosts)` -> `void`

## `org.telegram.messenger.CharacterCompat`
- `static highSurrogate(int codePoint)` -> `char`
- `static lowSurrogate(int codePoint)` -> `char`

## `org.telegram.messenger.ChatMessageSharedResources`
- `getAvatarLiveLocation()` -> `Drawable`
- `getRedLocationIcon()` -> `Drawable`

## `org.telegram.messenger.ChatMessagesMetadataController`
- `checkMessages(ChatActivity.ChatActivityAdapter chatAdapter, int maxAdapterPosition, int minAdapterPosition, long currentTime)` -> `void`
- `loadExtendedMediaForMessages(long dialogId, ArrayList<MessageObject> visibleObjects)` -> `void`
- `loadReactionsForMessages(long dialogId, ArrayList<MessageObject> visibleObjects)` -> `void`
- `onFragmentDestroy()` -> `void`

## `org.telegram.messenger.ChatObject`
- `static areTabsEnabled(TLRPC.Chat chat)` -> `boolean`
- `static canAddAdmins(TLRPC.Chat chat)` -> `boolean`
- `static canAddBotsToChat(TLRPC.Chat chat)` -> `boolean`
- `static canAddChatToCommunity(TLRPC.Chat community)` -> `boolean`
- `static canAddUsers(TLRPC.Chat chat)` -> `boolean`
- `static canBlockUsers(TLRPC.Chat chat)` -> `boolean`
- `static canChangeChatInfo(TLRPC.Chat chat)` -> `boolean`
- `static canCreateTopic(TLRPC.Chat chat)` -> `boolean`
- `static canDeleteTopic(int currentAccount, TLRPC.Chat chat, long topicId)` -> `boolean`
- `static canDeleteTopic(int currentAccount, TLRPC.Chat chat, TLRPC.TL_forumTopic topic)` -> `boolean`
- `static canManageCalls(TLRPC.Chat chat)` -> `boolean`
- `static canManageMonoForum(int currentAccount, long dialogId)` -> `boolean`
- `static canManageMonoForum(int currentAccount, TLRPC.Chat chat)` -> `boolean`
- `static canManageMyTag(TLRPC.Chat chat)` -> `boolean`
- `static canManageTags(TLRPC.Chat chat)` -> `boolean`
- `static canManageTopic(int currentAccount, TLRPC.Chat chat, TLRPC.TL_forumTopic topic)` -> `boolean`
- `static canManageTopic(int currentAccount, TLRPC.Chat chat, long topicId)` -> `boolean`
- `static canManageTopics(TLRPC.Chat chat)` -> `boolean`
- `static canPinMessages(TLRPC.Chat chat)` -> `boolean`
- `static canPost(TLRPC.Chat chat)` -> `boolean`
- `static canRemoveBotFromCommunity(TLRPC.User user, TLRPC.Chat community)` -> `boolean`
- `static canRemoveChatFromCommunity(TLRPC.Chat chat, TLRPC.Chat community)` -> `boolean`
- `static canSendAnyMedia(TLRPC.Chat currentChat)` -> `boolean`
- `static canSendAsPeers(TLRPC.Chat chat)` -> `boolean`
- `static canSendDocument(TLRPC.Chat chat)` -> `boolean`
- `static canSendEmbed(TLRPC.Chat chat)` -> `boolean`
- `static canSendMessages(TLRPC.Chat chat)` -> `boolean`
- `static canSendMusic(TLRPC.Chat chat)` -> `boolean`
- `static canSendPhoto(TLRPC.Chat chat)` -> `boolean`
- `static canSendPlain(TLRPC.Chat chat)` -> `boolean`
- `static canSendPolls(TLRPC.Chat chat)` -> `boolean`
- `static canSendRoundVideo(TLRPC.Chat chat)` -> `boolean`
- `static canSendStickers(TLRPC.Chat chat)` -> `boolean`
- `static canSendVideo(TLRPC.Chat chat)` -> `boolean`
- `static canSendVoice(TLRPC.Chat chat)` -> `boolean`
- `static canUserDoAction(TLRPC.Chat chat, TLRPC.ChannelParticipant participant, int action)` -> `boolean`
- `static canUserDoAction(TLRPC.Chat chat, int action)` -> `boolean`
- `static canUserDoAdminAction(TLRPC.TL_chatAdminRights admin_rights, int action)` -> `boolean`
- `static canUserDoAdminAction(TLRPC.Chat chat, int action)` -> `boolean`
- `static canUserDoChannelDirectAdminAction(int currentAccount, long dialogId, int action)` -> `boolean`
- `static canUserDoChannelDirectAdminAction(int currentAccount, TLRPC.Chat chat, int action)` -> `boolean`
- `static canWriteToChat(TLRPC.Chat chat)` -> `boolean`
- `static getAllowedSendString(TLRPC.Chat chat)` -> `String`
- `static getBannedRightsString(TLRPC.TL_chatBannedRights bannedRights)` -> `String`
- `static getColorId(TLRPC.Chat chat)` -> `int`
- `static getEmojiId(TLRPC.Chat chat)` -> `long`
- `static getOnlyProfileEmojiId(TLRPC.Chat chat)` -> `long`
- `static getParticipantVolume(TLRPC.GroupCallParticipant participant)` -> `int`
- `static getPeerColorForAvatar(int currentAccount, TLRPC.Chat chat)` -> `MessagesController.PeerColor`
- `static getPhoto(TLRPC.Chat chat)` -> `TLRPC.ChatPhoto`
- `static getProfileCollectibleId(TLRPC.Chat chat)` -> `long`
- `static getProfileColorId(TLRPC.Chat chat)` -> `int`
- `static getProfileEmojiId(TLRPC.Chat chat)` -> `long`
- `static getPublicUsername(TLRPC.Chat chat)` -> `String`
- `static getPublicUsername(TLRPC.Chat chat, boolean editable)` -> `String`
- `static getRequirementToContact(TLRPC.Chat chat)` -> `TL_account.RequirementToContact`
- `static getRestrictedErrorText(TLRPC.Chat chat, int action)` -> `String`
- `static getSendAsPeerId(TLRPC.Chat chat, TLRPC.ChatFull chatFull)` -> `long`
- `static getSendAsPeerId(TLRPC.Chat chat, TLRPC.ChatFull chatFull, boolean invertChannel)` -> `long`
- `static hasAdminRights(TLRPC.Chat chat)` -> `boolean`
- `static hasPhoto(TLRPC.Chat chat)` -> `boolean`
- `static hasPublicLink(TLRPC.Chat chat, String username)` -> `boolean`
- `static hasStories(TLRPC.Chat chat)` -> `boolean`
- `static isActionBanned(TLRPC.Chat chat, int action)` -> `boolean`
- `static isActionBannedByDefault(TLRPC.Chat chat, int action)` -> `boolean`
- `static isBoostSupported(TLRPC.Chat chat)` -> `boolean`
- `static isBoosted(TLRPC.ChatFull chatFull)` -> `boolean`
- `static isCanWriteToChannel(long chatId, int currentAccount)` -> `boolean`
- `static isChannel(TLRPC.Chat chat)` -> `boolean`
- `static isChannel(long chatId, int currentAccount)` -> `boolean`
- `static isChannelAndNotMegaGroup(TLRPC.Chat chat)` -> `boolean`
- `static isChannelAndNotMegaGroup(long chatId, int currentAccount)` -> `boolean`
- `static isChannelOrGiga(TLRPC.Chat chat)` -> `boolean`
- `static isChatCollapsedInCommunity(LongSparseArray<TLRPC.Chat> chats, TLRPC.Chat chat)` -> `boolean`
- `static isChatCollapsedInCommunity(int currentAccount, TLRPC.Chat chat)` -> `boolean`
- `static isCollapsedInCommunity(int currentAccount, long dialogId)` -> `boolean`
- `static isCommunity(TLRPC.Chat chat)` -> `boolean`
- `static isCommunity(int currentAccount, long dialogId)` -> `boolean`
- `static isCommunity(long chatId, int currentAccount)` -> `boolean`
- `static isCommunityPeerHidden(TL_communities.CommunityPeer communityPeer)` -> `boolean`
- `static isCreator(TLRPC.Chat chat)` -> `boolean`
- `static isDiscussionGroup(int currentAccount, long chatId)` -> `boolean`
- `static isDiscussionGroup(TLRPC.Chat chat, TLRPC.ChatFull chatFull)` -> `boolean`
- `static isForum(int currentAccount, long dialogId)` -> `boolean`
- `static isForum(TLRPC.Chat chat)` -> `boolean`
- `static isHiddenInCommunity(int currentAccount, long dialogId)` -> `boolean`
- `static isHiddenInCommunity(int currentAccount, TLRPC.User user)` -> `boolean`
- `static isHiddenInCommunity(int currentAccount, TLRPC.Chat chat)` -> `boolean`
- `static isIgnoredChatRestrictionsForBoosters(TLRPC.ChatFull chatFull)` -> `boolean`
- `static isIgnoredChatRestrictionsForBoosters(TLRPC.Chat chat)` -> `boolean`
- `static isInChat(TLRPC.Chat chat)` -> `boolean`
- `static isKickedFromChat(TLRPC.Chat chat)` -> `boolean`
- `static isLeftFromChat(TLRPC.Chat chat)` -> `boolean`
- `static isMegagroup(TLRPC.Chat chat)` -> `boolean`
- `static isMegagroup(int currentAccount, long chatId)` -> `boolean`
- `static isMonoForum(int currentAccount, long dialogId)` -> `boolean`
- `static isMonoForum(TLRPC.Chat chat)` -> `boolean`
- `static isMyTopic(int currentAccount, TLRPC.TL_forumTopic topic)` -> `boolean`
- `static isMyTopic(int currentAccount, TLRPC.Chat chat, long topicId)` -> `boolean`
- `static isMyTopic(int currentAccount, long chatId, long topicId)` -> `boolean`
- `static isNotInChat(TLRPC.Chat chat)` -> `boolean`
- `static isPossibleRemoveChatRestrictionsByBoosts(TLRPC.Chat chat)` -> `boolean`
- `static isPossibleRemoveChatRestrictionsByBoosts(TLRPC.ChatFull chatFull)` -> `boolean`
- `static isPublic(TLRPC.Chat chat)` -> `boolean`
- `static isUserCollapsedInCommunity(LongSparseArray<TLRPC.Chat> chats, TLRPC.User user)` -> `boolean`
- `static isUserCollapsedInCommunity(int currentAccount, TLRPC.User user)` -> `boolean`
- `static reactionIsAvailable(TLRPC.ChatFull chatInfo, String reaction)` -> `boolean`
- `static shouldSendAnonymously(TLRPC.Chat chat)` -> `boolean`

## `org.telegram.messenger.ChatObject$Call$InvitedUser`
- `isCalling()` -> `boolean`
- `static make(int msg_id)` -> `InvitedUser`

## `org.telegram.messenger.ChatObject$VideoParticipant`
- `equals(Object o)` -> `boolean`
- `setAspectRatio(int width, int height, Call call)` -> `void`

## `org.telegram.messenger.ChatsRemoteViewsFactory`
- `getCount()` -> `int`
- `getItemId(int position)` -> `long`
- `getLoadingView()` -> `RemoteViews`
- `getViewAt(int position)` -> `RemoteViews`
- `getViewTypeCount()` -> `int`
- `hasStableIds()` -> `boolean`
- `onCreate()` -> `void`
- `onDataSetChanged()` -> `void`
- `onDestroy()` -> `void`

## `org.telegram.messenger.ChatsWidgetProvider`
- `onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int appWidgetId, Bundle newOptions)` -> `void`
- `onDeleted(Context context, int[] appWidgetIds)` -> `void`
- `onReceive(Context context, Intent intent)` -> `void`
- `onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds)` -> `void`
- `static updateWidget(Context context, AppWidgetManager appWidgetManager, int appWidgetId)` -> `void`

## `org.telegram.messenger.ContactsController`
- `addContact(TLRPC.User user, boolean exception)` -> `void`
- `addContact(TLRPC.User user, TLRPC.TL_textWithEntities note, boolean exception)` -> `void`
- `addContactToPhoneBook(TLRPC.User user, boolean check)` -> `long`
- `checkAppAccount()` -> `void`
- `checkContacts()` -> `void`
- `checkInviteText()` -> `void`
- `cleanup()` -> `void`
- `createOrUpdateConnectionServiceContact(long id, String firstName, String lastName)` -> `void`
- `deleteAllContacts(final Runnable runnable)` -> `void`
- `deleteConnectionServiceContact()` -> `void`
- `deleteContact(final ArrayList<TLRPC.User> users, boolean showBulletin)` -> `void`
- `deleteContactsUndoable(Context context, BaseFragment fragment, final ArrayList<TLRPC.User> users)` -> `void`
- `deleteUnknownAppAccounts()` -> `void`
- `static findRule(ArrayList<TLRPC.PrivacyRule> rules, Class<T> clazz)` -> `T`
- `forceImportContacts()` -> `void`
- `static formatName(TLObject object)` -> `String`
- `static formatName(TLRPC.User user)` -> `String`
- `static formatName(String firstName, String lastName)` -> `String`
- `static formatName(String firstName, String lastName, int maxLength)` -> `String`
- `getContactsCopy(HashMap<String, Contact> original)` -> `HashMap<String, Contact>`
- `getDeleteAccountTTL()` -> `int`
- `getGlobalPrivacySettings()` -> `TLRPC.GlobalPrivacySettings`
- `static getInstance(int num)` -> `ContactsController`
- `getInviteText(int contacts)` -> `String`
- `getLoadingDeleteInfo()` -> `boolean`
- `getLoadingGlobalSettings()` -> `boolean`
- `getLoadingPrivacyInfo(int type)` -> `boolean`
- `static getLocaleCollator()` -> `Collator`
- `getPrivacyRules(int type)` -> `ArrayList<TLRPC.PrivacyRule>`
- `static hasContactsPermission()` -> `boolean`
- `static hasContactsWritePermission()` -> `boolean`
- `isContact(long userId)` -> `boolean`
- `isLoadingContacts()` -> `boolean`
- `loadContacts(boolean fromCache, final long hash)` -> `void`
- `loadGlobalPrivacySetting()` -> `void`
- `loadPrivacySettings()` -> `void`
- `loadPrivacySettings(boolean force)` -> `void`
- `markAsContacted(final String contactId)` -> `void`
- `migratePhoneBookToV7(final SparseArray<Contact> contactHashMap)` -> `void`
- `performSyncPhoneBook(final HashMap<String, Contact> contactHashMap, final boolean request, final boolean first, final boolean schedule, final boolean force, final boolean checkCount, final boolean canceled)` -> `void`
- `processContactsUpdates(ArrayList<Long> ids, ConcurrentHashMap<Long, TLRPC.User> userDict)` -> `void`
- `processLoadedContacts(final ArrayList<TLRPC.TL_contact> contactsArr, final ArrayList<TLRPC.User> usersArr, final int from)` -> `void`
- `readContacts()` -> `void`
- `readContactsFromPhoneBook()` -> `HashMap<String, Contact>`
- `reloadContactsStatusesMaybe(boolean force)` -> `void`
- `resetImportedContacts()` -> `void`
- `setDeleteAccountTTL(int ttl)` -> `void`
- `setPrivacyRules(ArrayList<TLRPC.PrivacyRule> rules, int type)` -> `void`
- `syncPhoneBookByAlert(final HashMap<String, Contact> contacts, final boolean first, final boolean schedule, final boolean cancel)` -> `void`

## `org.telegram.messenger.ContactsController$Contact`
- `getLetter()` -> `String`
- `static getLetter(String first_name, String last_name)` -> `String`

## `org.telegram.messenger.ContactsController$MyContentObserver`
- `deliverSelfNotifications()` -> `boolean`
- `onChange(boolean selfChange)` -> `void`

## `org.telegram.messenger.ContactsLoadingObserver`
- `static observe(Callback callback, long expirationTime)` -> `void`
- `release()` -> `void`
- `start(long expirationTime)` -> `void`

## `org.telegram.messenger.ContactsRemoteViewsFactory`
- `getCount()` -> `int`
- `getItemId(int position)` -> `long`
- `getLoadingView()` -> `RemoteViews`
- `getViewAt(int position)` -> `RemoteViews`
- `getViewTypeCount()` -> `int`
- `hasStableIds()` -> `boolean`
- `onCreate()` -> `void`
- `onDataSetChanged()` -> `void`
- `onDestroy()` -> `void`

## `org.telegram.messenger.ContactsSyncAdapterService`
- `onBind(Intent intent)` -> `IBinder`

## `org.telegram.messenger.ContactsSyncAdapterService$SyncAdapterImpl`
- `onPerformSync(Account account, Bundle extras, String authority, ContentProviderClient provider, SyncResult syncResult)` -> `void`

## `org.telegram.messenger.ContactsWidgetProvider`
- `onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int appWidgetId, Bundle newOptions)` -> `void`
- `onDeleted(Context context, int[] appWidgetIds)` -> `void`
- `onReceive(Context context, Intent intent)` -> `void`
- `onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds)` -> `void`
- `static updateWidget(Context context, AppWidgetManager appWidgetManager, int appWidgetId)` -> `void`

## `org.telegram.messenger.CopyCodeReceiver`
- `onReceive(Context context, Intent intent)` -> `void`

## `org.telegram.messenger.CustomTabsCopyReceiver`
- `onReceive(Context context, Intent intent)` -> `void`

## `org.telegram.messenger.DatabaseMigrationHelper`
- `static migrate(MessagesStorage messagesStorage, int version)` -> `int`
- `static migrate(MessagesStorage messagesStorage, SQLiteDatabase database, int version)` -> `int`
- `static recoverDatabase(File oldDatabaseFile, File oldDatabaseWall, File oldDatabaseShm, int currentAccount)` -> `boolean`

## `org.telegram.messenger.DialogObject`
- `static editDistance(String s1, String s2)` -> `int`
- `static emojiStatusesEqual(TLRPC.EmojiStatus a, TLRPC.EmojiStatus b)` -> `boolean`
- `static filterEmojiStatus(TLRPC.EmojiStatus emojiStatus)` -> `TLRPC.EmojiStatus`
- `static findUsername(String username, TLRPC.User user)` -> `TLRPC.TL_username`
- `static findUsername(String username, TLRPC.Chat chat)` -> `TLRPC.TL_username`
- `static findUsername(String username, ArrayList<TLRPC.TL_username> usernames)` -> `TLRPC.TL_username`
- `static getBotVerification(TLObject object)` -> `TL_bots.BotVerification`
- `static getBotVerificationIcon(TLObject object)` -> `long`
- `static getDialogId(TLObject obj)` -> `long`
- `static getDialogTitle(TLObject dialog)` -> `String`
- `static getEmojiStatusCollectibleId(TLRPC.EmojiStatus emojiStatus)` -> `long`
- `static getEmojiStatusDocumentId(long dialogId)` -> `long`
- `static getEmojiStatusDocumentId(TLRPC.EmojiStatus emojiStatus)` -> `long`
- `static getEmojiStatusUntil(TLRPC.EmojiStatus emojiStatus)` -> `int`
- `static getEncryptedChatId(long dialogId)` -> `int`
- `static getFolderId(long dialogId)` -> `int`
- `static getLastMessageOrDraftDate(TLRPC.Dialog dialog, TLRPC.DraftMessage draftMessage)` -> `long`
- `static getMessagesStarsPrice(TL_account.RequirementToContact value)` -> `long`
- `static getName(long dialogId)` -> `String`
- `static getName(int currentAccount, long dialogId)` -> `String`
- `static getName(TLObject obj)` -> `String`
- `static getPeerDialogId(TLRPC.Peer peer)` -> `long`
- `static getPeerDialogId(TLRPC.InputPeer peer)` -> `long`
- `static getPublicUsername(TLObject dialog)` -> `String`
- `static getPublicUsername(TLObject dialog, String query)` -> `String`
- `static getPublicUsername(String username, ArrayList<TLRPC.TL_username> usernames, boolean editable)` -> `String`
- `static getShortName(int currentAccount, long dialogId)` -> `String`
- `static getShortName(long dialogId)` -> `String`
- `static getShortName(TLObject obj)` -> `String`
- `static getShortTitle(TLObject dialog)` -> `String`
- `static getSimilarPublicUsername(String obj_username, ArrayList<TLRPC.TL_username> obj_usernames, String query)` -> `String`
- `static getStatus(long dialogId)` -> `String`
- `static getStatus(int currentAccount, long dialogId)` -> `String`
- `static getStatus(int currentAccount, TLObject obj)` -> `String`
- `static hasPhoto(TLObject obj)` -> `boolean`
- `static initDialog(TLRPC.Dialog dialog)` -> `void`
- `static isChannel(TLRPC.Dialog dialog)` -> `boolean`
- `static isChatDialog(long dialogId)` -> `boolean`
- `static isEmojiStatusCollectible(long dialogId)` -> `boolean`
- `static isEmojiStatusCollectible(TLRPC.EmojiStatus emojiStatus)` -> `boolean`
- `static isEmpty(TL_account.RequirementToContact value)` -> `boolean`
- `static isEncryptedDialog(long dialogId)` -> `boolean`
- `static isFolderDialogId(long dialogId)` -> `boolean`
- `static isPremiumBlocked(TL_account.RequirementToContact value)` -> `boolean`
- `static isUserDialog(long dialogId)` -> `boolean`
- `static makeEncryptedDialogId(long chatId)` -> `long`
- `static makeFolderDialogId(int folderId)` -> `long`
- `static setDialogPhotoTitle(ImageReceiver imageReceiver, AvatarDrawable avatarDrawable, TLObject dialog)` -> `String`
- `static setDialogPhotoTitle(BackupImageView imageView, TLObject dialog)` -> `String`
- `static similarity(String s1, String s2)` -> `double`

## `org.telegram.messenger.DispatchQueue`
- `cancelRunnable(Runnable runnable)` -> `void`
- `cancelRunnables(Runnable[] runnables)` -> `void`
- `cleanupQueue()` -> `void`
- `getHandler()` -> `Handler`
- `getLastTaskTime()` -> `long`
- `handleMessage(Message inputMessage)` -> `void`
- `isReady()` -> `boolean`
- `postRunnable(Runnable runnable)` -> `boolean`
- `postRunnable(Runnable runnable, long delay)` -> `boolean`
- `postToFrontRunnable(Runnable runnable)` -> `boolean`
- `recycle()` -> `void`
- `run()` -> `void`
- `sendMessage(Message msg, int delay)` -> `void`

## `org.telegram.messenger.DispatchQueuePoolBackground`
- `static execute(Runnable runnable)` -> `void`
- `static execute(Runnable runnable, boolean now)` -> `void`

## `org.telegram.messenger.DocumentObject`
- `static containsPhotoSizeType(ArrayList<TLRPC.PhotoSize> sizes, String type)` -> `boolean`
- `static getCircleThumb(float radius, int colorKey, float alpha)` -> `SvgHelper.SvgDrawable`
- `static getCircleThumb(float radius, int colorKey, Theme.ResourcesProvider resourcesProvider, float alpha)` -> `SvgHelper.SvgDrawable`
- `static getSvgRectThumb(int colorKey, float alpha)` -> `SvgHelper.SvgDrawable`
- `static getSvgThumb(ArrayList<TLRPC.PhotoSize> sizes, int colorKey, float alpha)` -> `SvgHelper.SvgDrawable`
- `static getSvgThumb(ArrayList<TLRPC.PhotoSize> sizes, int colorKey, float alpha, boolean usePhotoSize)` -> `SvgHelper.SvgDrawable`
- `static getSvgThumb(TLRPC.Document document, int colorKey, float alpha)` -> `SvgHelper.SvgDrawable`
- `static getSvgThumb(TLRPC.Document document, int colorKey, float alpha, float zoom, Theme.ResourcesProvider resourcesProvider)` -> `SvgHelper.SvgDrawable`
- `static getSvgThumb(int resourceId, int colorKey, float alpha)` -> `SvgHelper.SvgDrawable`

## `org.telegram.messenger.DownloadController`
- `addLoadingFileObserver(String fileName, FileDownloadProgressListener observer)` -> `void`
- `addLoadingFileObserver(String fileName, MessageObject messageObject, FileDownloadProgressListener observer)` -> `void`
- `canDownloadMedia(MessageObject messageObject)` -> `boolean`
- `canDownloadMedia(int type, long size)` -> `boolean`
- `canDownloadMedia(TLRPC.Message message)` -> `int`
- `canDownloadMedia(TLRPC.Message message, TLRPC.MessageMedia media)` -> `int`
- `canDownloadMediaType(MessageObject messageObject)` -> `int`
- `canDownloadMediaType(MessageObject messageObject, long overrideSize)` -> `int`
- `canDownloadNextTrack()` -> `boolean`
- `canPreloadStories()` -> `boolean`
- `cancelDownloading(ArrayList<Pair<Long, Integer>> arrayList)` -> `void`
- `checkAutodownloadSettings()` -> `void`
- `checkUnviewedDownloads(int messageId, long dialogId)` -> `void`
- `cleanup()` -> `void`
- `clearRecentDownloadedFiles()` -> `void`
- `clearUnviewedDownloads()` -> `void`
- `deleteRecentFiles(ArrayList<MessageObject> messageObjects)` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `generateObserverTag()` -> `int`
- `getAutodownloadMask()` -> `int`
- `getAutodownloadMaskAll()` -> `int`
- `getCurrentDownloadMask()` -> `int`
- `getCurrentMobilePreset()` -> `Preset`
- `getCurrentRoamingPreset()` -> `Preset`
- `getCurrentWiFiPreset()` -> `Preset`
- `static getInstance(int num)` -> `DownloadController`
- `getMaxVideoBitrate()` -> `int`
- `static getProgress(long[] progressSizes)` -> `float`
- `hasUnviewedDownloads()` -> `boolean`
- `isDownloading(int messageId)` -> `boolean`
- `loadAutoDownloadConfig(boolean force)` -> `void`
- `loadDownloadingFiles()` -> `void`
- `newDownloadObjectsAvailable(int downloadMask)` -> `void`
- `onDownloadComplete(MessageObject parentObject)` -> `void`
- `onDownloadFail(MessageObject parentObject, int reason)` -> `void`
- `processDownloadObjects(int type, ArrayList<DownloadObject> objects)` -> `void`
- `removeLoadingFileObserver(FileDownloadProgressListener observer)` -> `void`
- `savePresetToServer(int type)` -> `void`
- `startDownloadFile(TLRPC.Document document, MessageObject parentObject)` -> `void`
- `swapLoadingPriority(MessageObject o1, MessageObject o2)` -> `void`
- `static typeToIndex(int type)` -> `int`
- `updateFilesLoadingPriority()` -> `void`

## `org.telegram.messenger.DownloadController$Preset`
- `equals(Preset obj)` -> `boolean`
- `isEnabled()` -> `boolean`
- `set(Preset preset)` -> `void`
- `set(TLRPC.TL_autoDownloadSettings settings)` -> `void`
- `toString()` -> `String`

## `org.telegram.messenger.DownloadRequestPacer`
- `onRequestSent(long now)` -> `void`
- `remainingDelay(long now)` -> `long`

## `org.telegram.messenger.EmuDetector`
- `addPackageName(String pPackageName)` -> `EmuDetector`
- `addPackageName(List<String> pListPackageName)` -> `EmuDetector`
- `detect()` -> `boolean`
- `isCheckPackage()` -> `boolean`
- `isCheckTelephony()` -> `boolean`
- `setCheckPackage(boolean chkPackage)` -> `EmuDetector`
- `setCheckTelephony(boolean telephony)` -> `EmuDetector`
- `static with(Context pContext)` -> `EmuDetector`

## `org.telegram.messenger.EmuInputDevicesDetector`
- `static detect()` -> `boolean`

## `org.telegram.messenger.FactCheckController`
- `applyFactCheck(MessageObject messageObject, TLRPC.TL_textWithEntities text, boolean created)` -> `void`
- `getFactCheck(MessageObject messageObject)` -> `TLRPC.TL_factCheck`
- `static getInstance(int num)` -> `FactCheckController`
- `openFactCheckEditor(Context context, Theme.ResourcesProvider resourcesProvider, MessageObject messageObject, boolean forceNotAdaptive)` -> `void`

## `org.telegram.messenger.FactCheckController$Key`
- `hashCode()` -> `int`
- `static of(MessageObject msg)` -> `Key`

## `org.telegram.messenger.FeedRemoteViewsFactory`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getCount()` -> `int`
- `getItemId(int position)` -> `long`
- `getLoadingView()` -> `RemoteViews`
- `getViewAt(int position)` -> `RemoteViews`
- `getViewTypeCount()` -> `int`
- `grantUriAccessToWidget(Context context, Uri uri)` -> `void`
- `hasStableIds()` -> `boolean`
- `onCreate()` -> `void`
- `onDataSetChanged()` -> `void`
- `onDestroy()` -> `void`

## `org.telegram.messenger.FeedWidgetProvider`
- `onDeleted(Context context, int[] appWidgetIds)` -> `void`
- `onReceive(Context context, Intent intent)` -> `void`
- `onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds)` -> `void`
- `static updateWidget(Context context, AppWidgetManager appWidgetManager, int appWidgetId)` -> `void`

## `org.telegram.messenger.FileLoadOperation`
- `cancel()` -> `void`
- `checkPrefixPreloadFinished()` -> `boolean`
- `static floorDiv(long x, long y)` -> `long`
- `getCacheFileFinal()` -> `File`
- `getCurrentFile()` -> `File`
- `getCurrentFileFast()` -> `File`
- `getCurrentType()` -> `int`
- `getDatacenterId()` -> `int`
- `getDocumentId()` -> `long`
- `getDownloadedLengthFromOffset(final float progress)` -> `float`
- `getDownloadedLengthFromOffset(final long offset, final long length)` -> `long[]`
- `getFileName()` -> `String`
- `getPositionInQueue()` -> `int`
- `getPriority()` -> `int`
- `getQueue()` -> `FileLoaderPriorityQueue`
- `isFinished()` -> `boolean`
- `isForceRequest()` -> `boolean`
- `isPaused()` -> `boolean`
- `isPreloadFinished()` -> `boolean`
- `isPreloadVideoOperation()` -> `boolean`
- `onFail(boolean thread, final int reason)` -> `void`
- `pause()` -> `void`
- `processRequestResult(RequestInfo requestInfo, TLRPC.TL_error error)` -> `boolean`
- `removeStreamListener(final FileLoadOperationStream operation)` -> `void`
- `setDelegate(FileLoadOperationDelegate delegate)` -> `void`
- `setEncryptFile(boolean value)` -> `void`
- `setForceRequest(boolean forceRequest)` -> `void`
- `setIsPreloadVideoOperation(boolean value)` -> `void`
- `setPaths(int instance, String name, FileLoaderPriorityQueue priorityQueue, File store, File temp, String finalName)` -> `void`
- `setPriority(int value)` -> `void`
- `setStream(FileLoadOperationStream stream, boolean streamPriority, long streamOffset)` -> `void`
- `start()` -> `boolean`
- `start(final FileLoadOperationStream stream, final long streamOffset, final boolean streamPriority)` -> `boolean`
- `startDownloadRequest(int useConnectionType)` -> `void`
- `updateProgress()` -> `void`
- `wasStarted()` -> `boolean`

## `org.telegram.messenger.FileLoadOperation$Range`
- `toString()` -> `String`

## `org.telegram.messenger.FileLoader`
- `static bytesToLong(byte[] bytes)` -> `long`
- `static canSaveAsFile(Object parentObject)` -> `boolean`
- `cancel(FileLoadOperation operation)` -> `void`
- `cancelFileUpload(final String location, final boolean enc)` -> `void`
- `cancelLoadAllFiles()` -> `void`
- `cancelLoadFile(TLRPC.Document document)` -> `void`
- `cancelLoadFile(TLRPC.Document document, boolean deleteFile)` -> `void`
- `cancelLoadFile(SecureDocument document)` -> `void`
- `cancelLoadFile(WebFile document)` -> `void`
- `cancelLoadFile(TLRPC.PhotoSize photo)` -> `void`
- `cancelLoadFile(TLRPC.PhotoSize photo, boolean deleteFile)` -> `void`
- `cancelLoadFile(TLRPC.FileLocation location, String ext)` -> `void`
- `cancelLoadFile(TLRPC.FileLocation location, String ext, boolean deleteFile)` -> `void`
- `cancelLoadFile(String fileName)` -> `void`
- `cancelLoadFiles(ArrayList<String> fileNames)` -> `void`
- `changePriority(int priority, final TLRPC.Document document, final SecureDocument secureDocument, final WebFile webDocument, final TLRPC.FileLocation location, final String locationExt, String name)` -> `void`
- `checkCurrentDownloadsFiles()` -> `void`
- `static checkDirectory(int type)` -> `File`
- `checkLoadCaughtPremiumFloodWait(final String filename)` -> `boolean`
- `checkMediaExistance(ArrayList<MessageObject> messageObjects)` -> `void`
- `checkUploadCaughtPremiumFloodWait(final String filename)` -> `boolean`
- `static checkUploadFileSize(int currentAccount, long length)` -> `boolean`
- `checkUploadNewDataAvailable(final String location, final boolean encrypted, final long newAvailableSize, final long finalSize)` -> `void`
- `checkUploadNewDataAvailable(final String location, final boolean encrypted, final long newAvailableSize, final long finalSize, final Float progress)` -> `void`
- `clearFilePaths()` -> `void`
- `clearRecentDownloadedFiles()` -> `void`
- `static copyFile(InputStream sourceFile, File destFile)` -> `boolean`
- `static copyFile(InputStream sourceFile, File destFile, int maxSize)` -> `boolean`
- `deleteFiles(final ArrayList<File> files, final int type)` -> `void`
- `dumpFilesQueue()` -> `void`
- `findLoadOperationByRequestToken(final int requestToken)` -> `FileLoadOperation`
- `findUploadOperationByRequestToken(final int requestToken)` -> `FileUploadOperation`
- `static fixFileName(String fileName)` -> `String`
- `static getAttachFileName(TLObject attach)` -> `String`
- `static getAttachFileName(TLObject attach, String ext)` -> `String`
- `static getAttachFileName(TLObject attach, String size, String ext)` -> `String`
- `getBufferedProgressFromPosition(final float position, final String fileName)` -> `float`
- `static getClosestPhotoSizeWithSize(ArrayList<TLRPC.PhotoSize> sizes, int side)` -> `TLRPC.PhotoSize`
- `static getClosestPhotoSizeWithSize(ArrayList<TLRPC.PhotoSize> sizes, int side, boolean byMinSide)` -> `TLRPC.PhotoSize`
- `static getClosestPhotoSizeWithSize(ArrayList<TLRPC.PhotoSize> sizes, int side, boolean byMinSide, TLRPC.PhotoSize toIgnore, boolean ignoreStripped)` -> `TLRPC.PhotoSize`
- `static getClosestVideoSizeWithSize(ArrayList<TLRPC.VideoSize> sizes, int side)` -> `TLRPC.VideoSize`
- `static getClosestVideoSizeWithSize(ArrayList<TLRPC.VideoSize> sizes, int side, boolean byMinSide)` -> `TLRPC.VideoSize`
- `static getClosestVideoSizeWithSize(ArrayList<TLRPC.VideoSize> sizes, int side, boolean byMinSide, boolean ignoreStripped)` -> `TLRPC.VideoSize`
- `getCurrentLoadingFiles(ArrayList<MessageObject> currentLoadingFiles)` -> `void`
- `static getDirectory(int type)` -> `File`
- `static getDocumentExtension(TLRPC.Document document)` -> `String`
- `static getDocumentFileName(TLRPC.Document document)` -> `String`
- `static getEmojiMarkup(ArrayList<TLRPC.VideoSize> video_sizes)` -> `TLRPC.VideoSize`
- `static getExtensionByMimeType(String mime)` -> `String`
- `getFileDatabase()` -> `FilePathDatabase`
- `static getFileExtension(File file)` -> `String`
- `getFileLoaderQueue()` -> `DispatchQueue`
- `static getFileMetadataFromParent(int currentAccount, Object parentObject)` -> `FilePathDatabase.FileMeta`
- `getFileReference(Object parentObject)` -> `int`
- `static getInstance(int num)` -> `FileLoader`
- `static getInternalCacheDir()` -> `File`
- `getLocalFile(ImageLocation imageLocation)` -> `File`
- `static getMessageFileName(TLRPC.Message message)` -> `String`
- `static getMimeTypePart(String mime)` -> `String`
- `getParentObject(int reference)` -> `Object`
- `static getPathPhotoSize(ArrayList<TLRPC.PhotoSize> sizes)` -> `TLRPC.TL_photoPathSize`
- `getPathToAttach(TLObject attach)` -> `File`
- `getPathToAttach(TLObject attach, boolean forceCache)` -> `File`
- `getPathToAttach(TLObject attach, String ext, boolean forceCache)` -> `File`
- `getPathToAttach(TLObject attach, String ext, boolean forceCache, boolean useFileDatabaseQueue)` -> `File`
- `getPathToAttach(TLObject attach, String size, String ext, boolean forceCache, boolean useFileDatabaseQueue)` -> `File`
- `getPathToMessage(TLRPC.Message message)` -> `File`
- `getPathToMessage(TLRPC.Message message, boolean useFileDatabaseQueue)` -> `File`
- `getPathToMessage(TLRPC.Message message, boolean forceCache, boolean useFileDatabaseQueue)` -> `File`
- `static getPhotoId(TLObject object)` -> `long`
- `getRecentLoadingFiles(ArrayList<MessageObject> recentLoadingFiles)` -> `void`
- `static getStrippedPhotoSize(ArrayList<TLRPC.PhotoSize> sizes)` -> `TLRPC.TL_photoStrippedSize`
- `static getVectorMarkupVideoSize(TLRPC.Photo photo)` -> `TLRPC.VideoSize`
- `isLoadingFile(final String fileName)` -> `boolean`
- `isLoadingVideo(TLRPC.Document document, boolean player)` -> `boolean`
- `isLoadingVideoAny(TLRPC.Document document)` -> `boolean`
- `static isSamePhoto(TLObject photo1, TLObject photo2)` -> `boolean`
- `static isSamePhoto(TLRPC.FileLocation location, TLRPC.Photo photo)` -> `boolean`
- `static isVideoMimeType(String mime)` -> `boolean`
- `loadFile(ImageLocation imageLocation, Object parentObject, String ext, int priority, int cacheType)` -> `void`
- `loadFile(SecureDocument secureDocument, int priority)` -> `void`
- `loadFile(TLRPC.Document document, Object parentObject, int priority, int cacheType)` -> `void`
- `loadFile(WebFile document, int priority, int cacheType)` -> `void`
- `loadStreamFile(final FileLoadOperationStream stream, final TLRPC.Document document, final ImageLocation location, final Object parentObject, final long offset, final boolean priority, int loadingPriority)` -> `FileLoadOperation`
- `loadStreamFile(final FileLoadOperationStream stream, final TLRPC.Document document, final ImageLocation location, final Object parentObject, final long offset, final boolean priority, int loadingPriority, int cacheType)` -> `FileLoadOperation`
- `static longToBytes(long x)` -> `byte[]`
- `onNetworkChanged(final boolean slow)` -> `void`
- `removeLoadingVideo(TLRPC.Document document, boolean player, boolean schedule)` -> `void`
- `setDelegate(FileLoaderDelegate fileLoaderDelegate)` -> `void`
- `setForceStreamLoadingFile(TLRPC.FileLocation location, String ext)` -> `void`
- `setLoadingVideo(TLRPC.Document document, boolean player, boolean schedule)` -> `void`
- `setLoadingVideoForPlayer(TLRPC.Document document, boolean player)` -> `void`
- `setLoadingVideoInternal(TLRPC.Document document, boolean player)` -> `void`
- `setLocalPathTo(TLObject attach, String attachPath)` -> `void`
- `static setMediaDirs(SparseArray<File> dirs)` -> `void`
- `uploadFile(final String location, final boolean encrypted, final boolean small, final int type)` -> `void`
- `uploadFile(final String location, final boolean encrypted, final boolean small, final long estimatedSize, final int type, boolean forceSmallFile)` -> `void`
- `uploadFile(final String path, Utilities.Callback<TLRPC.InputFile> done)` -> `void`

## `org.telegram.messenger.FileLoaderPriorityQueue`
- `add(FileLoadOperation operation)` -> `void`
- `cancel(FileLoadOperation operation)` -> `void`
- `checkLoadingOperations()` -> `void`
- `checkLoadingOperations(boolean immediate)` -> `void`
- `getCount()` -> `int`
- `getPosition(FileLoadOperation fileLoadOperation)` -> `int`
- `remove(FileLoadOperation operation)` -> `boolean`

## `org.telegram.messenger.FileLog`
- `static cleanupLogs()` -> `void`
- `static d(final String message)` -> `void`
- `static disableGson(boolean disable)` -> `void`
- `static dumpANR()` -> `void`
- `dumpMemory(boolean force)` -> `void`
- `static dumpResponseAndRequest(int account, TLObject request, TLObject response, TLRPC.TL_error error, long requestMsgId, long startRequestTimeInMillis, int requestToken)` -> `void`
- `static dumpUnparsedMessage(TLObject message, long messageId, int account)` -> `void`
- `static e(final String message, final Throwable exception)` -> `void`
- `static e(final String message)` -> `void`
- `static e(final Throwable e)` -> `void`
- `static e(final Throwable e, boolean logToAppCenter)` -> `void`
- `static ensureInitied()` -> `void`
- `static fatal(final Throwable e)` -> `void`
- `static fatal(final Throwable e, boolean logToAppCenter)` -> `void`
- `static getInstance()` -> `FileLog`
- `static getNetworkLogPath()` -> `String`
- `static getTonlibLogPath()` -> `String`
- `static w(final String message)` -> `void`

## `org.telegram.messenger.FileLog$ByteArrayHexAdapter`
- `read(JsonReader in)` -> `byte[]`
- `write(JsonWriter out, byte[] value)` -> `void`

## `org.telegram.messenger.FileLog$TLObjectDeserializer`
- `serialize(TLObject src, Type typeOfSrc, JsonSerializationContext context)` -> `JsonElement`

## `org.telegram.messenger.FilePathDatabase`
- `checkMediaExistance(ArrayList<MessageObject> messageObjects)` -> `void`
- `clear()` -> `void`
- `createDatabase(int tryCount, boolean fromBackup)` -> `void`
- `ensureDatabaseCreated()` -> `void`
- `getFileDialogId(File file, FileMeta metaTmp)` -> `FileMeta`
- `getPath(long documentId, int dc, int type, boolean useQueue)` -> `String`
- `getQueue()` -> `DispatchQueue`
- `hasAnotherRefOnFile(String path)` -> `boolean`
- `isLocallyCreated(String path)` -> `boolean`
- `lookupFiles(ArrayList<? extends CacheByChatsController.KeepMediaFile> keepMediaFiles)` -> `LongSparseArray<ArrayList<CacheByChatsController.KeepMediaFile>>`
- `putPath(long id, int dc, int type, int flags, String path)` -> `void`
- `removeFiles(List<CacheModel.FileInfo> filesToRemove)` -> `void`
- `saveFileDialogId(File file, FileMeta fileMeta)` -> `void`

## `org.telegram.messenger.FileRefController`
- `applyCachedFileReference(Object parentObject, Object... args)` -> `boolean`
- `static getFileRefErrorIndex(String error)` -> `int`
- `static getInstance(int num)` -> `FileRefController`
- `static getKeyForParentObject(Object parentObject)` -> `String`
- `getLocationAndKey(Object parentObject, Object... args)` -> `Pair<TLRPC.InputFileLocation, String>`
- `static isFileRefError(String error)` -> `boolean`
- `static isFileRefErrorCover(String error)` -> `boolean`
- `requestReference(Object parentObject, Object... args)` -> `void`

## `org.telegram.messenger.FileStreamLoadOperation`
- `addTransferListener(TransferListener transferListener)` -> `void`
- `bytesTransferred(int bytesTransferred)` -> `void`
- `close()` -> `void`
- `static getStreamPrioriy(TLRPC.Document document)` -> `int`
- `getUri()` -> `Uri`
- `newDataAvailable()` -> `void`
- `open(DataSpec dataSpec)` -> `long`
- `static prepareUri(int currentAccount, TLRPC.Document document, Object parent)` -> `Uri`
- `read(byte[] buffer, int offset, int readLength)` -> `int`
- `static setPriorityForDocument(TLRPC.Document document, int priority)` -> `void`
- `transferEnded()` -> `void`
- `transferInitializing(DataSpec dataSpec)` -> `void`
- `transferStarted(DataSpec dataSpec)` -> `void`

## `org.telegram.messenger.FileUploadOperation`
- `cancel()` -> `void`
- `checkNewDataAvailable(final long newAvailableSize, final long finalSize, final Float progress)` -> `void`
- `getTotalFileSize()` -> `long`
- `onNetworkChanged(final boolean slow)` -> `void`
- `setDelegate(FileUploadOperationDelegate fileUploadOperationDelegate)` -> `void`
- `setForceSmallFile()` -> `void`
- `start()` -> `void`

## `org.telegram.messenger.FilesMigrationService`
- `static checkBottomSheet(BaseFragment fragment)` -> `void`
- `migrateOldFolder()` -> `void`
- `onBind(Intent intent)` -> `IBinder`
- `onStartCommand(Intent intent, int flags, int startId)` -> `int`
- `static start()` -> `void`

## `org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet`
- `canDismissWithSwipe()` -> `boolean`
- `canDismissWithTouchOutside()` -> `boolean`

## `org.telegram.messenger.FingerprintController`
- `static checkDeviceFingerprintsChanged()` -> `boolean`
- `static checkKeyReady()` -> `void`
- `static checkKeyReady(boolean notifyCheckFingerprint)` -> `void`
- `static deleteInvalidKey()` -> `void`
- `static isKeyReady()` -> `boolean`

## `org.telegram.messenger.FlagSecureReason`
- `attach()` -> `void`
- `detach()` -> `void`
- `static isSecuredNow(Window window)` -> `boolean`

## `org.telegram.messenger.FourierTransform`
- `calcAvg(float lowFreq, float hiFreq)` -> `float`
- `fillSpectrum()` -> `void`
- `forward(float[] buffer, int startAt)` -> `void`
- `freqToIndex(float freq)` -> `int`
- `getBand(int i)` -> `float`
- `getBandWidth()` -> `float`
- `getSpectrumImaginary()` -> `float[]`
- `getSpectrumReal()` -> `float[]`
- `indexToFreq(int i)` -> `float`
- `inverse(float[] freqReal, float[] freqImag, float[] buffer)` -> `void`
- `linAverages(int numAvg)` -> `void`
- `logAverages(int minBandwidth, int bandsPerOctave)` -> `void`
- `noAverages()` -> `void`
- `setComplex(float[] r, float[] i)` -> `void`
- `specSize()` -> `int`
- `timeSize()` -> `int`

## `org.telegram.messenger.FourierTransform$FFT`
- `allocateArrays()` -> `void`
- `forward(float[] buffer)` -> `void`
- `forward(float[] buffer, int startAt)` -> `void`
- `forward(float[] buffReal, float[] buffImag)` -> `void`
- `inverse(float[] buffer)` -> `void`
- `scaleBand(int i, float s)` -> `void`
- `setBand(int i, float a)` -> `void`

## `org.telegram.messenger.GcmPushListenerService`
- `onMessageReceived(RemoteMessage message)` -> `void`
- `onNewToken(@NonNull String token)` -> `void`

## `org.telegram.messenger.GoogleLocationProvider`
- `checkLocationSettings(ILocationRequest request, Consumer<Integer> callback)` -> `void`
- `checkServices()` -> `boolean`
- `getLastLocation(Consumer<Location> callback)` -> `void`
- `init(Context context)` -> `void`
- `onCreateLocationRequest()` -> `ILocationRequest`
- `onCreateLocationServicesAPI(Context context, IAPIConnectionCallbacks connectionCallbacks, IAPIOnConnectionFailedListener failedListener)` -> `IMapApiClient`
- `removeLocationUpdates(ILocationListener locationListener)` -> `void`
- `requestLocationUpdates(ILocationRequest request, ILocationListener locationListener)` -> `void`

## `org.telegram.messenger.GoogleLocationProvider$GoogleApiClientImpl`
- `connect()` -> `void`
- `disconnect()` -> `void`

## `org.telegram.messenger.GoogleLocationProvider$GoogleLocationRequest`
- `setFastestInterval(long interval)` -> `void`
- `setInterval(long interval)` -> `void`
- `setPriority(int priority)` -> `void`

## `org.telegram.messenger.GoogleMapsProvider`
- `getInstallMapsString()` -> `int`
- `getMapsAppPackageName()` -> `String`
- `initializeMaps(Context context)` -> `void`
- `loadRawResourceStyle(Context context, int resId)` -> `IMapStyleOptions`
- `newCameraUpdateLatLng(LatLng latLng)` -> `ICameraUpdate`
- `newCameraUpdateLatLngBounds(ILatLngBounds bounds, int padding)` -> `ICameraUpdate`
- `newCameraUpdateLatLngZoom(LatLng latLng, float zoom)` -> `ICameraUpdate`
- `onCreateCircleOptions()` -> `ICircleOptions`
- `onCreateLatLngBoundsBuilder()` -> `ILatLngBoundsBuilder`
- `onCreateMapView(Context context)` -> `IMapView`
- `onCreateMarkerOptions()` -> `IMarkerOptions`

## `org.telegram.messenger.GoogleMapsProvider$GoogleCircleOptions`
- `center(LatLng latLng)` -> `ICircleOptions`
- `fillColor(int color)` -> `ICircleOptions`
- `radius(double radius)` -> `ICircleOptions`
- `strokeColor(int color)` -> `ICircleOptions`
- `strokePattern(List<PatternItem> patternItems)` -> `ICircleOptions`
- `strokeWidth(int width)` -> `ICircleOptions`

## `org.telegram.messenger.GoogleMapsProvider$GoogleLatLngBounds`
- `getCenter()` -> `LatLng`

## `org.telegram.messenger.GoogleMapsProvider$GoogleLatLngBoundsBuilder`
- `build()` -> `ILatLngBounds`
- `include(LatLng latLng)` -> `ILatLngBoundsBuilder`

## `org.telegram.messenger.GoogleMapsProvider$GoogleMapImpl`
- `addCircle(ICircleOptions circleOptions)` -> `ICircle`
- `addMarker(IMarkerOptions markerOptions)` -> `IMarker`
- `getCameraPosition()` -> `CameraPosition`
- `getMaxZoomLevel()` -> `float`
- `getMinZoomLevel()` -> `float`
- `getProjection()` -> `IProjection`
- `getUiSettings()` -> `IUISettings`
- `moveCamera(ICameraUpdate update)` -> `void`
- `setMapStyle(IMapStyleOptions style)` -> `void`
- `setMapType(int mapType)` -> `void`
- `setMyLocationEnabled(boolean enabled)` -> `void`
- `setOnCameraIdleListener(Runnable callback)` -> `void`
- `setOnCameraMoveListener(Runnable callback)` -> `void`
- `setOnCameraMoveStartedListener(OnCameraMoveStartedListener onCameraMoveStartedListener)` -> `void`
- `setOnMapLoadedCallback(Runnable callback)` -> `void`
- `setOnMarkerClickListener(OnMarkerClickListener markerClickListener)` -> `void`
- `setOnMyLocationChangeListener(Consumer<Location> callback)` -> `void`
- `setPadding(int left, int top, int right, int bottom)` -> `void`

## `org.telegram.messenger.GoogleMapsProvider$GoogleMapImpl$GoogleCircle`
- `getRadius()` -> `double`
- `remove()` -> `void`
- `setCenter(LatLng latLng)` -> `void`
- `setRadius(double radius)` -> `void`

## `org.telegram.messenger.GoogleMapsProvider$GoogleMapImpl$GoogleMarker`
- `getPosition()` -> `LatLng`
- `getTag()` -> `Object`
- `remove()` -> `void`
- `setIcon(Bitmap bitmap)` -> `void`
- `setIcon(int resId)` -> `void`
- `setPosition(LatLng latLng)` -> `void`
- `setRotation(int rotation)` -> `void`
- `setTag(Object tag)` -> `void`

## `org.telegram.messenger.GoogleMapsProvider$GoogleMapView`
- `getGlSurfaceView()` -> `GLSurfaceView`
- `getMapAsync(Consumer<IMap> callback)` -> `void`
- `getView()` -> `View`
- `onCreate(Bundle savedInstance)` -> `void`
- `onDestroy()` -> `void`
- `onLowMemory()` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `setOnDispatchTouchEventInterceptor(ITouchInterceptor touchInterceptor)` -> `void`
- `setOnInterceptTouchEventInterceptor(ITouchInterceptor touchInterceptor)` -> `void`
- `setOnLayoutListener(Runnable callback)` -> `void`

## `org.telegram.messenger.GoogleMapsProvider$GoogleMarkerOptions`
- `anchor(float lat, float lng)` -> `IMarkerOptions`
- `flat(boolean flat)` -> `IMarkerOptions`
- `icon(Bitmap bitmap)` -> `IMarkerOptions`
- `icon(int resId)` -> `IMarkerOptions`
- `position(LatLng latLng)` -> `IMarkerOptions`
- `snippet(String snippet)` -> `IMarkerOptions`
- `title(String title)` -> `IMarkerOptions`

## `org.telegram.messenger.GoogleMapsProvider$GoogleProjection`
- `toScreenLocation(LatLng latLng)` -> `Point`

## `org.telegram.messenger.HashtagSearchController`
- `clearHistory()` -> `void`
- `clearSearchResults()` -> `void`
- `clearSearchResults(int searchType)` -> `void`
- `getCount(int searchType)` -> `int`
- `static getInstance(int num)` -> `HashtagSearchController`
- `getMessages(int searchType)` -> `ArrayList<MessageObject>`
- `getSearchResult(int searchType)` -> `SearchResult`
- `isEndReached(int searchType)` -> `boolean`
- `jumpToMessage(int guid, int index, int searchType)` -> `void`
- `putToHistory(String hashtag)` -> `void`
- `removeHashtagFromHistory(String hashtag)` -> `void`
- `searchHashtag(String _query, int guid, int searchType, int loadIndex)` -> `void`

## `org.telegram.messenger.HashtagSearchController$MessageCompositeID`
- `equals(Object o)` -> `boolean`
- `hashCode()` -> `int`

## `org.telegram.messenger.HashtagSearchController$SearchResult`
- `clear()` -> `void`
- `getMask()` -> `int`

## `org.telegram.messenger.IMapsProvider$IMapView`
- `getGlSurfaceView()` -> `default GLSurfaceView`

## `org.telegram.messenger.ImageLoader`
- `addTestWebFile(String url, WebFile webFile)` -> `void`
- `cancelForceLoadingForImageReceiver(final ImageReceiver imageReceiver)` -> `void`
- `cancelLoadHttpFile(String url)` -> `void`
- `cancelLoadingForImageReceiver(final ImageReceiver imageReceiver, final boolean cancelAll)` -> `void`
- `changeFileLoadingPriorityForImageReceiver(ImageReceiver imageReceiver)` -> `void`
- `checkMediaPaths()` -> `void`
- `checkMediaPaths(Runnable after)` -> `void`
- `clearMemory()` -> `void`
- `createMediaPaths()` -> `SparseArray<File>`
- `static createStripedBitmap(ArrayList<TLRPC.PhotoSize> thumbs)` -> `Drawable`
- `static decompressGzip(File file)` -> `String`
- `decrementUseCount(String key)` -> `boolean`
- `static fileToSize(String path, boolean forceCacheDir)` -> `TLRPC.PhotoSize`
- `static fillPhotoSizeWithBytes(TLRPC.PhotoSize photoSize)` -> `void`
- `static generateMessageThumb(TLRPC.Message message)` -> `MessageThumb`
- `getCacheOutQueue()` -> `DispatchQueuePriority`
- `getFileProgress(String location)` -> `Float`
- `getFileProgressSizes(String location)` -> `long[]`
- `getFromMemCache(String key)` -> `BitmapDrawable`
- `static getHttpFileName(String url)` -> `String`
- `static getHttpFilePath(String url, String defaultExt)` -> `File`
- `static getHttpUrlExtension(String url, String defaultExt)` -> `String`
- `getImageFromMemory(TLObject fileLocation, String httpUrl, String filter)` -> `BitmapDrawable`
- `static getInstance()` -> `ImageLoader`
- `getLottieMemCahce()` -> `LruCache<BitmapDrawable>`
- `getReplacedKey(String oldKey)` -> `String`
- `static getStrippedPhotoBitmap(byte[] photoBytes, String filter)` -> `Bitmap`
- `static hasAutoplayFilter(String s)` -> `boolean`
- `hasLottieMemCache(String key)` -> `boolean`
- `incrementUseCount(String key)` -> `void`
- `isInMemCache(String key, boolean animated)` -> `boolean`
- `isLoadingHttpFile(String url)` -> `boolean`
- `static isSdCardPath(File videoFile)` -> `boolean`
- `static loadBitmap(String path, Uri uri, float maxWidth, float maxHeight, boolean useMaxScale)` -> `Bitmap`
- `loadHttpFile(String url, String defaultExt, int currentAccount)` -> `void`
- `loadImageForImageReceiver(ImageReceiver imageReceiver)` -> `void`
- `loadImageForImageReceiver(ImageReceiver imageReceiver, List<ImageReceiver> preloadReceiver)` -> `void`
- `moveToFront(String key)` -> `void`
- `onFragmentStackChanged()` -> `void`
- `preloadArtwork(String athumbUrl)` -> `void`
- `putImageToCache(BitmapDrawable bitmap, String key, boolean smallImage)` -> `void`
- `putThumbsToCache(ArrayList<MessageThumb> updateMessageThumbs)` -> `void`
- `removeImage(String key)` -> `void`
- `removeTestWebFile(String url)` -> `void`
- `replaceImageInCache(final String oldKey, final String newKey, final ImageLocation newLocation, boolean post)` -> `void`
- `static saveMessageThumbs(TLRPC.Message message)` -> `void`
- `static saveMessageThumbs(TLRPC.Message message, TLRPC.MessageMedia media)` -> `void`
- `static saveMessagesThumbs(ArrayList<TLRPC.Message> messages)` -> `void`
- `static scaleAndSaveImage(Bitmap bitmap, float maxWidth, float maxHeight, int quality, boolean cache)` -> `TLRPC.PhotoSize`
- `static scaleAndSaveImage(TLRPC.PhotoSize photoSize, Bitmap bitmap, float maxWidth, float maxHeight, int quality, boolean cache, boolean forceCacheDir)` -> `TLRPC.PhotoSize`
- `static scaleAndSaveImage(Bitmap bitmap, float maxWidth, float maxHeight, int quality, boolean cache, int minWidth, int minHeight)` -> `TLRPC.PhotoSize`
- `static scaleAndSaveImage(Bitmap bitmap, float maxWidth, float maxHeight, boolean progressive, int quality, boolean cache, int minWidth, int minHeight)` -> `TLRPC.PhotoSize`
- `static scaleAndSaveImage(Bitmap bitmap, Bitmap.CompressFormat compressFormat, float maxWidth, float maxHeight, int quality, boolean cache, int minWidth, int minHeight)` -> `TLRPC.PhotoSize`
- `static scaleAndSaveImage(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean progressive, float maxWidth, float maxHeight, int quality, boolean cache, int minWidth, int minHeight, boolean forceCacheDir)` -> `TLRPC.PhotoSize`
- `static shouldSendImageAsDocument(String path, Uri uri)` -> `boolean`

## `org.telegram.messenger.ImageLoader$ArtworkLoadTask`
- `doInBackground(Void... voids)` -> `String`
- `onCancelled()` -> `void`
- `onPostExecute(final String result)` -> `void`

## `org.telegram.messenger.ImageLoader$CacheImage`
- `addImageReceiver(ImageReceiver imageReceiver, String key, String filter, int type, int guid)` -> `void`
- `changePriority(int newFileLoaderPriority)` -> `void`
- `removeImageReceiver(ImageReceiver imageReceiver)` -> `void`
- `replaceImageReceiver(ImageReceiver imageReceiver, String key, String filter, int type, int guid)` -> `void`
- `setImageAndClear(final Drawable image, String decrementKey)` -> `void`
- `setImageReceiverGuid(ImageReceiver imageReceiver, int guid)` -> `void`

## `org.telegram.messenger.ImageLoader$CacheOutTask`
- `cancel()` -> `void`
- `run()` -> `void`

## `org.telegram.messenger.ImageLoader$HttpFileTask`
- `doInBackground(Void... voids)` -> `Boolean`
- `onCancelled()` -> `void`
- `onPostExecute(Boolean result)` -> `void`

## `org.telegram.messenger.ImageLoader$HttpImageTask`
- `doInBackground(Void... voids)` -> `Boolean`
- `onCancelled()` -> `void`
- `onPostExecute(final Boolean result)` -> `void`

## `org.telegram.messenger.ImageLoader$ThumbGenerateTask`
- `run()` -> `void`

## `org.telegram.messenger.ImageLocation`
- `static getForChat(TLRPC.Chat chat, int type)` -> `ImageLocation`
- `static getForChat(int currentAccount, TLRPC.Chat chat, int type)` -> `ImageLocation`
- `static getForDocument(TLRPC.Document document)` -> `ImageLocation`
- `static getForDocument(TLRPC.VideoSize videoSize, TLRPC.Document document)` -> `ImageLocation`
- `static getForDocument(TLRPC.PhotoSize photoSize, TLRPC.Document document)` -> `ImageLocation`
- `static getForInstantFile(WebInstantView.WebPhoto instantFile)` -> `ImageLocation`
- `static getForLocal(TLRPC.FileLocation location)` -> `ImageLocation`
- `static getForMessage(TLRPC.PhotoSize photoSize, TLRPC.Message message)` -> `ImageLocation`
- `static getForObject(TLRPC.PhotoSize photoSize, TLObject object)` -> `ImageLocation`
- `static getForPath(String path)` -> `ImageLocation`
- `static getForPhoto(TLRPC.PhotoSize photoSize, TLRPC.Photo photo)` -> `ImageLocation`
- `static getForPhoto(TLRPC.VideoSize videoSize, TLRPC.Photo photo)` -> `ImageLocation`
- `static getForSecureDocument(SecureDocument secureDocument)` -> `ImageLocation`
- `static getForSticker(TLRPC.PhotoSize photoSize, TLRPC.Document sticker, int thumbVersion)` -> `ImageLocation`
- `static getForStickerSet(TLRPC.StickerSet set)` -> `ImageLocation`
- `static getForUser(TLRPC.User user, int type)` -> `ImageLocation`
- `static getForUser(int currentAccount, TLRPC.User user, int type)` -> `ImageLocation`
- `static getForUserOrChat(TLObject object, int type)` -> `ImageLocation`
- `static getForUserOrChat(int currentAccount, TLObject object, int type)` -> `ImageLocation`
- `static getForVideoPath(String path)` -> `ImageLocation`
- `static getForWebFile(WebFile webFile)` -> `ImageLocation`
- `getKey(Object parentObject, Object fullObject, boolean url)` -> `String`
- `getSize()` -> `long`
- `static getStrippedKey(Object parentObject, Object fullObject, Object strippedObject)` -> `String`
- `isEncrypted()` -> `boolean`

## `org.telegram.messenger.ImageReceiver`
- `addDecorator(Decorator decorator)` -> `void`
- `addLoadingImageRunnable(Runnable loadOperationRunnable)` -> `void`
- `bumpPriority()` -> `void`
- `canInvertBitmap()` -> `boolean`
- `cancelLoadImage()` -> `void`
- `clearDecorators()` -> `void`
- `clearImage()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getAllowStartAnimation()` -> `boolean`
- `getAlpha()` -> `float`
- `getAnimatedEmojiDrawable()` -> `AnimatedEmojiDrawable`
- `getAnimatedOrientation()` -> `int`
- `getAnimation()` -> `AnimatedFileDrawable`
- `getAutoRepeat()` -> `int`
- `static getAvatarLocalFile(int currentAccount, TLObject obj)` -> `File`
- `getBitmap()` -> `Bitmap`
- `getBitmapHeight()` -> `int`
- `getBitmapSafe()` -> `BitmapHolder`
- `getBitmapWidth()` -> `int`
- `getCacheType()` -> `int`
- `getCenterX()` -> `float`
- `getCenterY()` -> `float`
- `getCurrentAccount()` -> `int`
- `getCurrentAlpha()` -> `float`
- `getDrawRegion()` -> `RectF`
- `getDrawable()` -> `Drawable`
- `getDrawableSafe()` -> `BitmapHolder`
- `getExt()` -> `String`
- `getFileLoadingPriority()` -> `int`
- `getImageAspectRatio()` -> `float`
- `getImageDrawable()` -> `Drawable`
- `getImageFilter()` -> `String`
- `getImageHeight()` -> `float`
- `getImageKey()` -> `String`
- `getImageLocation()` -> `ImageLocation`
- `getImageWidth()` -> `float`
- `getImageX()` -> `float`
- `getImageX2()` -> `float`
- `getImageY()` -> `float`
- `getImageY2()` -> `float`
- `getInvert()` -> `int`
- `getLoadingOperations()` -> `ArrayList<Runnable>`
- `getLottieAnimation()` -> `RLottieDrawable`
- `getMark()` -> `Object`
- `getMediaDrawable()` -> `Drawable`
- `getMediaFilter()` -> `String`
- `getMediaKey()` -> `String`
- `getMediaLocation()` -> `ImageLocation`
- `getNewGuid()` -> `int`
- `getOrientation()` -> `int`
- `getParam()` -> `int`
- `getParentObject()` -> `Object`
- `getParentPosition(int[] position)` -> `void`
- `getParentView()` -> `View`
- `getPressed()` -> `boolean`
- `getQualityThumbDocument()` -> `TLRPC.Document`
- `getRoundRadius()` -> `int[]`
- `getRoundRadius(boolean includingEmpty)` -> `int[]`
- `getSize()` -> `long`
- `getStaticThumb()` -> `Drawable`
- `getStrippedLocation()` -> `ImageLocation`
- `getTag(int type)` -> `int`
- `getThumb()` -> `Drawable`
- `getThumbBitmap()` -> `Bitmap`
- `getThumbBitmapSafe()` -> `BitmapHolder`
- `getThumbFilter()` -> `String`
- `getThumbKey()` -> `String`
- `getThumbLocation()` -> `ImageLocation`
- `getUniqKeyPrefix()` -> `String`
- `getVisible()` -> `boolean`
- `hasBitmapImage()` -> `boolean`
- `hasImageLoaded()` -> `boolean`
- `hasImageSet()` -> `boolean`
- `hasMediaSet()` -> `boolean`
- `hasNotThumb()` -> `boolean`
- `hasNotThumbOrOnlyStaticThumb()` -> `boolean`
- `hasStaticThumb()` -> `boolean`
- `isAllowStartAnimation()` -> `boolean`
- `isAnimationRunning()` -> `boolean`
- `isAspectFit()` -> `boolean`
- `isAttachedToWindow()` -> `boolean`
- `isCrossfadingWithOldImage()` -> `boolean`
- `isCurrentKeyQuality()` -> `boolean`
- `isForceLoding()` -> `boolean`
- `isForcePreview()` -> `boolean`
- `isInsideImage(float x, float y)` -> `boolean`
- `isLottieRunning()` -> `boolean`
- `isNeedsQualityThumb()` -> `boolean`
- `isShouldGenerateQualityThumb()` -> `boolean`
- `moveImageToFront()` -> `void`
- `moveLottieToFront()` -> `void`
- `onAttachedToWindow()` -> `boolean`
- `onDetachedFromWindow()` -> `void`
- `recycleBitmap(String newKey, int type)` -> `void`
- `setAllowDecodeSingleFrame(boolean value)` -> `void`
- `setAllowDrawWhileCacheGenerating(boolean allow)` -> `void`
- `setAllowLoadingOnAttachedOnly(boolean b)` -> `void`
- `setAllowLottieVibration(boolean allow)` -> `void`
- `setAllowStartAnimation(boolean value)` -> `void`
- `setAllowStartLottieAnimation(boolean value)` -> `void`
- `setAspectFit(boolean value)` -> `void`
- `setAutoRepeat(int value)` -> `void`
- `setAutoRepeatCount(int count)` -> `void`
- `setAutoRepeatTimeout(long timeout)` -> `void`
- `setBackupImage()` -> `boolean`
- `setBlendMode(Object mode)` -> `void`
- `setCrossfadeByScale(float value)` -> `void`
- `setCrossfadeDuration(int duration)` -> `void`
- `setCrossfadeWithOldImage(boolean value)` -> `void`
- `setCurrentAccount(int value)` -> `void`
- `setCurrentTime(long time)` -> `void`
- `setDelegate(ImageReceiverDelegate delegate)` -> `void`
- `setDrawInBackgroundThread(BackgroundThreadDrawHolder holder, int threadIndex)` -> `BackgroundThreadDrawHolder`
- `setEmojiPaused(boolean paused)` -> `void`
- `setFileLoadingPriority(int fileLoadingPriority)` -> `void`
- `setForUserOrChat(TLObject object, Drawable avatarDrawable)` -> `void`
- `setForUserOrChat(TLObject object, Drawable avatarDrawable, Object parentObject)` -> `void`
- `setForUserOrChat(TLObject object, Drawable avatarDrawable, Object parentObject, boolean animationEnabled, int vectorType, boolean big)` -> `void`
- `setForceCrossfade(boolean value)` -> `void`
- `setForceLoading(boolean value)` -> `void`
- `setForceNotMedia(boolean value)` -> `void`
- `setForcePreview(boolean value)` -> `void`
- `setGradientBitmap(Bitmap bitmap)` -> `void`
- `setIgnoreImageSet(boolean value)` -> `void`
- `setImage(ImageLocation imageLocation, String imageFilter, Drawable thumb, String ext, Object parentObject, int cacheType)` -> `void`
- `setImage(ImageLocation imageLocation, String imageFilter, Drawable thumb, long size, String ext, Object parentObject, int cacheType)` -> `void`
- `setImage(String imagePath, String imageFilter, Drawable thumb, String ext, long size)` -> `void`
- `setImage(ImageLocation imageLocation, String imageFilter, ImageLocation thumbLocation, String thumbFilter, String ext, Object parentObject, int cacheType)` -> `void`
- `setImage(ImageLocation imageLocation, String imageFilter, ImageLocation thumbLocation, String thumbFilter, long size, String ext, Object parentObject, int cacheType)` -> `void`
- `setImage(ImageLocation fileLocation, String fileFilter, ImageLocation thumbLocation, String thumbFilter, Drawable thumb, Object parentObject, int cacheType)` -> `void`
- `setImage(ImageLocation fileLocation, String fileFilter, ImageLocation thumbLocation, String thumbFilter, Drawable thumb, long size, String ext, Object parentObject, int cacheType)` -> `void`
- `setImage(ImageLocation mediaLocation, String mediaFilter, ImageLocation imageLocation, String imageFilter, ImageLocation thumbLocation, String thumbFilter, Drawable thumb, long size, String ext, Object parentObject, int cacheType)` -> `void`
- `setImageBitmap(Bitmap bitmap)` -> `void`
- `setImageBitmap(Drawable bitmap)` -> `void`
- `setImageBitmapByKey(Drawable drawable, String key, int type, boolean memCache, int guid)` -> `boolean`
- `setImageCoords(float x, float y, float width, float height)` -> `void`
- `setImageCoords(Rect bounds)` -> `void`
- `setImageCoords(RectF bounds)` -> `void`
- `setImageWidth(int width)` -> `void`
- `setImageX(float x)` -> `void`
- `setImageY(float y)` -> `void`
- `setInvalidateAll(boolean value)` -> `void`
- `setLayerNum(int value)` -> `void`
- `setManualAlphaAnimator(boolean value)` -> `void`
- `setMark(Object mark)` -> `void`
- `setMediaStartEndTime(long startTime, long endTime)` -> `void`
- `setNeedsQualityThumb(boolean value)` -> `void`
- `setOrientation(int angle, boolean center)` -> `void`
- `setOrientation(int angle, int invert, boolean center)` -> `void`
- `setParam(int value)` -> `void`
- `setParentView(View view)` -> `void`
- `setPreloadingReceivers(List<ImageReceiver> preloadReceivers)` -> `void`
- `setPressed(int value)` -> `void`
- `setQualityThumbDocument(TLRPC.Document document)` -> `void`
- `setRoundRadius(int value)` -> `void`
- `setRoundRadius(int tl, int tr, int br, int bl)` -> `void`
- `setRoundRadius(int[] value)` -> `void`
- `setRoundRadiusEnabled(boolean enabled)` -> `void`
- `setShouldGenerateQualityThumb(boolean value)` -> `void`
- `setSideClip(float value)` -> `void`
- `setSkipUpdateFrame(boolean skipUpdateFrame)` -> `void`
- `setStrippedLocation(ImageLocation location)` -> `void`
- `setTag(int value, int type)` -> `void`
- `setUniqKeyPrefix(String prefix)` -> `void`
- `setUseSharedAnimationQueue(boolean value)` -> `void`
- `setVideoThumbIsSame(boolean b)` -> `void`
- `setVisible(boolean value, boolean invalidate)` -> `void`
- `setVisibleInvalidate(Runnable invalidate)` -> `void`
- `startAnimation()` -> `void`
- `startAnimation(boolean force)` -> `void`
- `startCrossfadeFromStaticThumb(Bitmap thumb)` -> `void`
- `startCrossfadeFromStaticThumb(Drawable thumb)` -> `void`
- `stopAnimation()` -> `void`
- `updateStaticDrawableThump(Bitmap bitmap)` -> `void`
- `updateThumbShaderMatrix()` -> `boolean`

## `org.telegram.messenger.ImageReceiver$BackgroundThreadDrawHolder`
- `getBounds(RectF out)` -> `void`
- `getBounds(Rect out)` -> `void`
- `release()` -> `void`
- `setBounds(Rect bounds)` -> `void`

## `org.telegram.messenger.ImageReceiver$BitmapHolder`
- `getHeight()` -> `int`
- `getKey()` -> `String`
- `getWidth()` -> `int`
- `isRecycled()` -> `boolean`
- `release()` -> `void`

## `org.telegram.messenger.ImageReceiver$Decorator`
- `onAttachedToWindow(ImageReceiver imageReceiver)` -> `void`
- `onDetachedFromWidnow()` -> `void`

## `org.telegram.messenger.ImageReceiver$ImageReceiverDelegate`
- `didSetImageBitmap(int type, String key, Drawable drawable)` -> `default void`
- `onAnimationReady(ImageReceiver imageReceiver)` -> `default void`

## `org.telegram.messenger.ImportingService`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onBind(Intent arg2)` -> `IBinder`
- `onDestroy()` -> `void`
- `onStartCommand(Intent intent, int flags, int startId)` -> `int`

## `org.telegram.messenger.KeepAliveJob`
- `static finishJob()` -> `void`
- `onHandleWork(Intent intent)` -> `void`
- `static startJob()` -> `void`

## `org.telegram.messenger.LanguageDetector`
- `static detectLanguage(String text, StringCallback onSuccess, ExceptionCallback onFail)` -> `void`
- `static detectLanguage(String text, StringCallback onSuccess, ExceptionCallback onFail, boolean initializeFirst)` -> `void`
- `static hasSupport()` -> `boolean`

## `org.telegram.messenger.LiteMode`
- `static addOnPowerSaverAppliedListener(Utilities.Callback<Boolean> listener)` -> `void`
- `static getBatteryLevel()` -> `int`
- `static getPowerSaverLevel()` -> `int`
- `static getValue()` -> `int`
- `static getValue(boolean ignorePowerSaving)` -> `int`
- `static isEnabled(int flag)` -> `boolean`
- `static isEnabledSetting(int flag)` -> `boolean`
- `static isPowerSaverApplied()` -> `boolean`
- `static loadPreference()` -> `void`
- `static removeOnPowerSaverAppliedListener(Utilities.Callback<Boolean> listener)` -> `void`
- `static savePreference()` -> `void`
- `static setAllFlags(int flags)` -> `void`
- `static setPowerSaverLevel(int value)` -> `void`
- `static toggleFlag(int flag)` -> `void`
- `static toggleFlag(int flag, boolean enabled)` -> `void`
- `static updatePresets(TLRPC.TL_jsonObject json)` -> `void`

## `org.telegram.messenger.LiteMode$BatteryReceiver`
- `onReceive(Context context, Intent intent)` -> `void`

## `org.telegram.messenger.LocaleController`
- `static addNbsp(String src)` -> `String`
- `applyLanguage(LocaleInfo localeInfo, boolean override, boolean init, final int currentAccount)` -> `int`
- `applyLanguage(final LocaleInfo localeInfo, boolean override, boolean init, boolean fromFile, boolean force, final int currentAccount, Runnable onDone)` -> `int`
- `applyLanguageFile(File file, int currentAccount)` -> `boolean`
- `static bold(CharSequence text)` -> `CharSequence`
- `calculateTranslatedCount(HashMap<String, String> map)` -> `int`
- `checkForcePatchLangpack(int currentAccount, Runnable ifDone)` -> `void`
- `checkPatchLangpack(int currentAccount)` -> `void`
- `checkUpdateForCurrentRemoteLocale(int currentAccount, int version, int baseVersion)` -> `void`
- `deleteLanguage(LocaleInfo localeInfo, int currentAccount)` -> `boolean`
- `static ensureImperialSystemInit()` -> `void`
- `static fixNumbers(CharSequence numbers)` -> `String`
- `static formatCallDuration(int duration)` -> `String`
- `formatCurrencyDecimalString(long amount, String type, boolean inludeType)` -> `String`
- `formatCurrencyString(long amount, String type)` -> `String`
- `formatCurrencyString(long amount, boolean fixAnything, boolean withExp, boolean editText, String type)` -> `String`
- `static formatDate(long date)` -> `String`
- `static formatDate(long date, boolean withToday)` -> `String`
- `static formatDateAudio(long date, boolean shortFormat)` -> `String`
- `static formatDateCallLog(long date)` -> `String`
- `static formatDateChat(long date)` -> `String`
- `static formatDateChat(long date, boolean checkYear)` -> `String`
- `static formatDateForBan(long date)` -> `String`
- `static formatDateOnline(long date, boolean[] madeShorter)` -> `String`
- `static formatDateTime(long date, boolean useToday)` -> `String`
- `static formatDistance(float distance, int type)` -> `String`
- `static formatDistance(float distance, int type, Boolean useImperial)` -> `String`
- `static formatDuration(int duration)` -> `String`
- `static formatEntityFormattedDate(TLRPC.TL_messageEntityFormattedDate e)` -> `String`
- `static formatEntityFormattedDate(TLRPC.TL_messageEntityFormattedDate e, boolean forceFull)` -> `String`
- `static formatImportedDate(long date)` -> `String`
- `static formatJoined(long date)` -> `String`
- `static formatLocationLeftTime(int time)` -> `String`
- `static formatLocationUpdateDate(long date)` -> `String`
- `static formatNumber(long count, char symbol)` -> `String`
- `static formatNumberWithMillion(long count, char symbol)` -> `String`
- `static formatPluralSpannable(String key, int plural, CharSequence... args)` -> `CharSequence`
- `static formatPluralString(String key, int plural, Object... args)` -> `String`
- `static formatPluralStringComma(String key, int plural)` -> `String`
- `static formatPluralStringComma(String key, int plural, Object... args)` -> `String`
- `static formatPluralStringComma(String key, int plural, char symbol)` -> `String`
- `static formatPluralStringComma(String key, int plural, char symbol, Object... args)` -> `String`
- `static formatPluralStringSpaced(String key, int plural)` -> `String`
- `static formatPluralStringSpaced(String key, int plural, Object... args)` -> `String`
- `static formatPmEditedDate(long date)` -> `String`
- `static formatPmFwdDate(long date)` -> `String`
- `static formatPmSeenDate(long date)` -> `String`
- `static formatPmSentDate(long date)` -> `String`
- `static formatPollEndTime(int seconds, boolean resultsHidden)` -> `String`
- `static formatRelativeDate(long dateDiffSeconds)` -> `String`
- `static formatSectionDate(long date)` -> `String`
- `static formatSeenDate(long date)` -> `String`
- `static formatShortDate(long date)` -> `String`
- `static formatShortDateTime(long date)` -> `String`
- `static formatShortDuration(int duration)` -> `String`
- `static formatShortDuration2(int time)` -> `String`
- `static formatShortNumber(int number, int[] rounded)` -> `String`
- `static formatSmallDateChat(long date)` -> `String`
- `static formatSmallDateChat(long date, boolean full)` -> `String`
- `static formatSpannable(@StringRes int res, Object... args)` -> `CharSequence`
- `static formatSpannable(String key, int res, Object... args)` -> `CharSequence`
- `static formatStartsTime(long date, int type)` -> `String`
- `static formatStartsTime(long date, int type, boolean needToday)` -> `String`
- `static formatStatusExpireDateTime(long date)` -> `String`
- `static formatStoryDate(long date)` -> `String`
- `static formatString(@StringRes int res, Object... args)` -> `String`
- `static formatString(String key, int res, Object... args)` -> `String`
- `static formatStringSimple(String string, Object... args)` -> `String`
- `static formatTTLString(int ttl)` -> `String`
- `static formatTodoCompletedDate(long date)` -> `String`
- `static formatUserStatus(int currentAccount, TLRPC.User user)` -> `String`
- `static formatUserStatus(int currentAccount, TLRPC.User user, boolean[] isOnline)` -> `String`
- `static formatUserStatus(int currentAccount, TLRPC.User user, boolean[] isOnline, boolean[] madeShorter)` -> `String`
- `static formatYearMont(long date, boolean alwaysShowYear)` -> `String`
- `static formatYearMonthDay(long date, boolean alwaysShowYear)` -> `String`
- `getBuiltinLanguageByPlural(String plural)` -> `LocaleInfo`
- `getChatDate()` -> `FastDateFormat`
- `getChatDateShort()` -> `FastDateFormat`
- `getChatFullDate()` -> `FastDateFormat`
- `static getCountryName(String code)` -> `String`
- `static getCountryName(String code, int fragmentResId)` -> `String`
- `static getCountryWithFlag(String code, int textSizeDp)` -> `CharSequence`
- `static getCountryWithFlag(String code, int textSizeDp, int fragmentResId)` -> `CharSequence`
- `static getCurrencyExpDivider(String type)` -> `int`
- `static getCurrentLanguageName()` -> `String`
- `getCurrentLocale()` -> `Locale`
- `getCurrentLocaleInfo()` -> `LocaleInfo`
- `getFormatterBannedUntil()` -> `FastDateFormat`
- `getFormatterBannedUntilThisYear()` -> `FastDateFormat`
- `getFormatterBoostExpired()` -> `FastDateFormat`
- `getFormatterConstDay()` -> `FastDateFormat`
- `getFormatterDay()` -> `FastDateFormat`
- `getFormatterDayMonth()` -> `FastDateFormat`
- `getFormatterDayWithSeconds()` -> `FastDateFormat`
- `getFormatterGiveawayCard()` -> `FastDateFormat`
- `getFormatterGiveawayMonthDay()` -> `FastDateFormat`
- `getFormatterGiveawayMonthDayYear()` -> `FastDateFormat`
- `getFormatterMonthOnly()` -> `FastDateFormat`
- `getFormatterMonthYear()` -> `FastDateFormat`
- `getFormatterScheduleDay()` -> `FastDateFormat`
- `getFormatterScheduleSend(int n)` -> `FastDateFormat`
- `getFormatterScheduleYear()` -> `FastDateFormat`
- `getFormatterStats()` -> `FastDateFormat`
- `getFormatterWeek()` -> `FastDateFormat`
- `getFormatterWeekLong()` -> `FastDateFormat`
- `getFormatterYear()` -> `FastDateFormat`
- `getFormatterYearMax()` -> `FastDateFormat`
- `static getInstance()` -> `LocaleController`
- `static getLanguageFlag(String countryCode)` -> `String`
- `getLanguageFromDict(String key)` -> `LocaleInfo`
- `static getLocaleAlias(String code)` -> `String`
- `static getLocaleStringIso639()` -> `String`
- `static getPluralString(String key, int plural)` -> `String`
- `static getServerString(String key)` -> `String`
- `static getString(@StringRes int res)` -> `String`
- `static getString(String key, @StringRes int res)` -> `String`
- `static getString(String key)` -> `String`
- `static getStringParamForNumber(int number)` -> `String`
- `getSystemDefaultLocale()` -> `Locale`
- `static getSystemLocaleStringIso639()` -> `String`
- `static getTimeZoneName(String timeZoneId, boolean full)` -> `String`
- `getTranslitString(String src)` -> `String`
- `getTranslitString(String src, boolean onlyEnglish)` -> `String`
- `getTranslitString(String src, boolean ru, boolean onlyEnglish)` -> `String`
- `static getUseImperialSystemType()` -> `boolean`
- `isCurrentLocalLocale()` -> `boolean`
- `static isRTLCharacter(char ch)` -> `boolean`
- `loadRemoteLanguages(final int currentAccount)` -> `void`
- `loadRemoteLanguages(final int currentAccount, boolean applyCurrent)` -> `void`
- `static nullable(String val)` -> `String`
- `onDeviceConfigurationChange(Configuration newConfig)` -> `void`
- `recreateFormatters()` -> `void`
- `reloadCurrentRemoteLocale(int currentAccount, String langCode, boolean force, Runnable onDone)` -> `void`
- `static resetImperialSystemType()` -> `void`
- `saveRemoteLocaleStrings(LocaleInfo localeInfo, final TLRPC.TL_langPackDifference difference, int currentAccount, Runnable onDone)` -> `void`
- `saveRemoteLocaleStringsForCurrentLocale(final TLRPC.TL_langPackDifference difference, int currentAccount)` -> `void`
- `static stringForMessageListDate(long date)` -> `String`

## `org.telegram.messenger.LocaleController$LocaleInfo`
- `static createWithString(String string)` -> `LocaleInfo`
- `getBaseLangCode()` -> `String`
- `getKey()` -> `String`
- `getLangCode()` -> `String`
- `getPathToBaseFile()` -> `File`
- `getPathToFile()` -> `File`
- `getSaveString()` -> `String`
- `hasBaseLang()` -> `boolean`
- `isBuiltIn()` -> `boolean`
- `isLocal()` -> `boolean`
- `isRemote()` -> `boolean`
- `isUnofficial()` -> `boolean`

## `org.telegram.messenger.LocaleController$PluralRules_Arabic`
- `quantityForNumber(int count)` -> `int`

## `org.telegram.messenger.LocaleController$PluralRules_Balkan`
- `quantityForNumber(int count)` -> `int`

## `org.telegram.messenger.LocaleController$PluralRules_Breton`
- `quantityForNumber(int count)` -> `int`

## `org.telegram.messenger.LocaleController$PluralRules_Czech`
- `quantityForNumber(int count)` -> `int`

## `org.telegram.messenger.LocaleController$PluralRules_French`
- `quantityForNumber(int count)` -> `int`

## `org.telegram.messenger.LocaleController$PluralRules_Langi`
- `quantityForNumber(int count)` -> `int`

## `org.telegram.messenger.LocaleController$PluralRules_Latvian`
- `quantityForNumber(int count)` -> `int`

## `org.telegram.messenger.LocaleController$PluralRules_Lithuanian`
- `quantityForNumber(int count)` -> `int`

## `org.telegram.messenger.LocaleController$PluralRules_Macedonian`
- `quantityForNumber(int count)` -> `int`

## `org.telegram.messenger.LocaleController$PluralRules_Maltese`
- `quantityForNumber(int count)` -> `int`

## `org.telegram.messenger.LocaleController$PluralRules_None`
- `quantityForNumber(int count)` -> `int`

## `org.telegram.messenger.LocaleController$PluralRules_One`
- `quantityForNumber(int count)` -> `int`

## `org.telegram.messenger.LocaleController$PluralRules_Polish`
- `quantityForNumber(int count)` -> `int`

## `org.telegram.messenger.LocaleController$PluralRules_Romanian`
- `quantityForNumber(int count)` -> `int`

## `org.telegram.messenger.LocaleController$PluralRules_Serbian`
- `quantityForNumber(int count)` -> `int`

## `org.telegram.messenger.LocaleController$PluralRules_Slovenian`
- `quantityForNumber(int count)` -> `int`

## `org.telegram.messenger.LocaleController$PluralRules_Tachelhit`
- `quantityForNumber(int count)` -> `int`

## `org.telegram.messenger.LocaleController$PluralRules_Two`
- `quantityForNumber(int count)` -> `int`

## `org.telegram.messenger.LocaleController$PluralRules_Welsh`
- `quantityForNumber(int count)` -> `int`

## `org.telegram.messenger.LocaleController$PluralRules_Zero`
- `quantityForNumber(int count)` -> `int`

## `org.telegram.messenger.LocaleController$RelativeIcu`
- `static format(long diffMillis, Locale locale)` -> `String`

## `org.telegram.messenger.LocaleController$TimeZoneChangedReceiver`
- `onReceive(Context context, Intent intent)` -> `void`

## `org.telegram.messenger.LocationController`
- `addSharingLocation(TLRPC.Message message)` -> `void`
- `cleanup()` -> `void`
- `static countryCodeToEmoji(String code)` -> `String`
- `static detectOcean(double x, double y)` -> `String`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static fetchLocationAddress(Location location, LocationFetchCallback callback)` -> `void`
- `static fetchLocationAddress(Location location, int type, LocationFetchCallback callback)` -> `void`
- `static getHeading(Location location)` -> `int`
- `static getInstance(int num)` -> `LocationController`
- `getLastKnownLocation()` -> `Location`
- `static getLocationsCount()` -> `int`
- `getSharingLocationInfo(long did)` -> `SharingLocationInfo`
- `isSharingLocation(long did)` -> `boolean`
- `loadLiveLocations(long did)` -> `void`
- `markLiveLoactionsAsRead(long dialogId)` -> `void`
- `onConnected(Bundle bundle)` -> `void`
- `onConnectionFailed()` -> `void`
- `onConnectionSuspended(int i)` -> `void`
- `removeAllLocationSharings()` -> `void`
- `removeSharingLocation(final long did)` -> `void`
- `setMapLocation(Location location, boolean first)` -> `void`
- `setNewLocationEndWatchTime()` -> `void`
- `setProximityLocation(long did, int meters, boolean broadcast)` -> `boolean`
- `startFusedLocationRequest(boolean permissionsGranted)` -> `void`
- `update()` -> `void`

## `org.telegram.messenger.LocationController$FusedLocationListener`
- `onLocationChanged(Location location)` -> `void`

## `org.telegram.messenger.LocationController$GpsLocationListener`
- `onLocationChanged(Location location)` -> `void`
- `onProviderDisabled(String provider)` -> `void`
- `onProviderEnabled(String provider)` -> `void`
- `onStatusChanged(String provider, int status, Bundle extras)` -> `void`

## `org.telegram.messenger.LocationSharingService`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onBind(Intent arg2)` -> `IBinder`
- `onCreate()` -> `void`
- `onDestroy()` -> `void`
- `onStartCommand(Intent intent, int flags, int startId)` -> `int`

## `org.telegram.messenger.LruCache`
- `contains(String key)` -> `boolean`
- `entryRemoved(boolean evicted, String key, T oldValue, T newValue)` -> `void`
- `entrySet()` -> `Set<Map.Entry<String, T>>`
- `evictAll()` -> `void`
- `get(String key)` -> `T`
- `getFilterKeys(String key)` -> `ArrayList<String>`
- `maxSize()` -> `int`
- `moveToFront(String key)` -> `void`
- `put(String key, T value)` -> `T`
- `remove(String key)` -> `T`
- `size()` -> `int`
- `sizeOf(String key, T value)` -> `int`

## `org.telegram.messenger.MediaDataController`
- `static addAnimatedEmojiSpans(ArrayList<TLRPC.MessageEntity> entities, CharSequence messageText, Paint.FontMetricsInt fontMetricsInt)` -> `void`
- `addNewStickerSet(TLRPC.TL_messages_stickerSet set)` -> `void`
- `addRecentGif(TLRPC.Document document, int date, boolean showReplaceBulletin)` -> `void`
- `addRecentSticker(int type, Object parentObject, TLRPC.Document document, int date, boolean remove)` -> `void`
- `addStyle(int flags, int spanStart, int spanEnd, ArrayList<TLRPC.MessageEntity> entities)` -> `void`
- `static addStyleToText(TextStyleSpan span, int start, int end, Spannable editable, boolean allowIntersection)` -> `void`
- `static addTextStyleRuns(MessageObject msg, Spannable text)` -> `void`
- `static addTextStyleRuns(TLRPC.DraftMessage msg, Spannable text, int allowedFlags)` -> `void`
- `static addTextStyleRuns(MessageObject msg, Spannable text, int allowedFlags)` -> `void`
- `static addTextStyleRuns(ArrayList<TLRPC.MessageEntity> entities, CharSequence messageText, Spannable text)` -> `void`
- `static addTextStyleRuns(ArrayList<TLRPC.MessageEntity> entities, CharSequence messageText, Spannable text, int allowedFlags)` -> `void`
- `applyAttachMenuBot(TLRPC.TL_attachMenuBotsBot attachMenuBot)` -> `void`
- `areAllTrendingStickerSetsUnread(boolean emoji)` -> `boolean`
- `areStickersLoaded(int type)` -> `boolean`
- `beginTransaction()` -> `void`
- `botInAttachMenu(long id)` -> `boolean`
- `buildShortcuts()` -> `void`
- `static calcDocumentsHash(ArrayList<TLRPC.Document> arrayList)` -> `long`
- `static calcDocumentsHash(ArrayList<TLRPC.Document> arrayList, int maxCount)` -> `long`
- `static calcHash(long hash, long id)` -> `long`
- `calcNewHash(int type)` -> `void`
- `static canAddMessageToMedia(TLRPC.Message message)` -> `boolean`
- `canAddStickerToFavorites()` -> `boolean`
- `canCreateAttachedMenuBotShortcut(long botId)` -> `boolean`
- `static canShowAttachMenuBot(TLRPC.TL_attachMenuBot bot, TLObject peer)` -> `boolean`
- `static canShowAttachMenuBotForTarget(TLRPC.TL_attachMenuBot bot, String target)` -> `boolean`
- `cancelRemovingStickerSet(long id)` -> `boolean`
- `cancelSearchStickers(SearchStickersKey key)` -> `void`
- `checkAllMedia(boolean force)` -> `void`
- `checkDefaultTopicIcons()` -> `void`
- `checkFeaturedEmoji()` -> `void`
- `checkFeaturedStickers()` -> `void`
- `checkGenericAnimations()` -> `void`
- `checkMenuBots(boolean atStart)` -> `void`
- `checkPremiumGiftStickers()` -> `void`
- `checkPremiumPromo()` -> `void`
- `checkReactions()` -> `void`
- `checkRingtones(boolean force)` -> `void`
- `checkStickers(int type)` -> `void`
- `checkTonGiftStickers()` -> `void`
- `cleanDraft(long dialogId, long threadId, boolean replyOnly)` -> `void`
- `cleanup()` -> `void`
- `clearAllDrafts(boolean notify)` -> `void`
- `clearBotKeyboard(MessagesStorage.TopicKey topicKey, ArrayList<Integer> messages)` -> `void`
- `clearBotKeyboard(long dialogId)` -> `void`
- `clearDraftsFolderIds()` -> `void`
- `clearFoundMessageObjects()` -> `void`
- `clearRecentEmojiStatuses()` -> `ArrayList<TLRPC.EmojiStatus>`
- `clearRecentReactions()` -> `void`
- `clearRecentStickers()` -> `void`
- `clearTopPeers()` -> `void`
- `containsTopPeer(long uid)` -> `boolean`
- `endTransaction()` -> `void`
- `static entitiesEqual(TLRPC.MessageEntity entity1, TLRPC.MessageEntity entity2)` -> `boolean`
- `static entitiesEqual(ArrayList<TLRPC.MessageEntity> entities1, ArrayList<TLRPC.MessageEntity> entities2)` -> `boolean`
- `fetchEmojiStatuses(int type, boolean cache)` -> `void`
- `fetchNewEmojiKeywords(String[] langCodes)` -> `void`
- `fetchNewEmojiKeywords(String[] langCodes, boolean doNotFetchTwice)` -> `void`
- `fillWithAnimatedEmoji(ArrayList<KeywordResult> result, Integer maxAnimatedPerEmojiInput, boolean allowTopicIcons, boolean forcePremium, boolean includeOnlyTextColor, Runnable onDone)` -> `void`
- `findBotInAttachMenu(long id)` -> `TLRPC.TL_attachMenuBot`
- `findStickerSetByNameInCache(String name, Utilities.Callback<TLRPC.TL_messages_stickerSet> whenFound)` -> `void`
- `generateEmojiPreviewThemes(final ArrayList<TLRPC.TL_theme> emojiPreviewThemes, int currentAccount)` -> `void`
- `getAllStickers()` -> `HashMap<String, ArrayList<TLRPC.Document>>`
- `getAllStickersFeatured()` -> `HashMap<String, ArrayList<TLRPC.Document>>`
- `static getAnimatedAttachMenuBotIcon(@NonNull TLRPC.TL_attachMenuBot bot, boolean selected)` -> `TLRPC.TL_attachMenuBotIcon`
- `getAnimatedEmojiByKeywords(String query, Utilities.Callback<ArrayList<Long>> onResult)` -> `void`
- `getArchivedStickersCount(int type)` -> `int`
- `getAttachMenuBots()` -> `TLRPC.TL_attachMenuBots`
- `getBotInfoCached(long uid, long dialogId)` -> `TL_bots.BotInfo`
- `getDefaultChannelEmojiStatuses()` -> `ArrayList<TLRPC.EmojiStatus>`
- `getDefaultEmojiStatuses()` -> `ArrayList<TLRPC.EmojiStatus>`
- `getDoubleTapReaction()` -> `String`
- `getDraft(long dialogId, long threadId)` -> `TLRPC.DraftMessage`
- `getDraftFolderId(long dialogId)` -> `int`
- `getDraftMessage(long dialogId, long threadId)` -> `TLRPC.Message`
- `getDraftVoice(long dialog_id, long topic_id)` -> `DraftVoice`
- `getDrafts()` -> `LongSparseArray<LongSparseArray<TLRPC.DraftMessage>>`
- `getEmojiAnimatedSticker(CharSequence message)` -> `TLRPC.Document`
- `getEmojiForSticker(long id)` -> `String`
- `getEmojiNames(String[] langCodes, String emoji, Utilities.Callback<ArrayList<String>> whenDone)` -> `void`
- `getEmojiSuggestions(String[] langCodes, String keyword, boolean fullMatch, KeywordResultCallback callback, boolean allowAnimated)` -> `void`
- `getEmojiSuggestions(String[] langCodes, String keyword, boolean fullMatch, KeywordResultCallback callback, final CountDownLatch sync, boolean allowAnimated)` -> `void`
- `getEmojiSuggestions(String[] langCodes, String keyword, boolean fullMatch, KeywordResultCallback callback, final CountDownLatch sync, boolean allowAnimated, boolean allowTopicIcons, boolean includeSingleEmoji, Integer maxAnimatedPerEmoji)` -> `void`
- `getEmojiSuggestions(String[] langCodes, String keyword, boolean fullMatch, KeywordResultCallback callback, final CountDownLatch sync, boolean allowAnimated, boolean allowTopicIcons, boolean includeSingleEmoji, boolean forcePremium, Integer maxAnimatedPerEmoji, boolean includeOnlyTextColor)` -> `void`
- `getEnabledReactionsList()` -> `List<TLRPC.TL_availableReaction>`
- `getEntities(CharSequence[] message, boolean allowStrike)` -> `ArrayList<TLRPC.MessageEntity>`
- `getEntities(CharSequence[] message, boolean allowStrike, boolean parseMarkdown)` -> `ArrayList<TLRPC.MessageEntity>`
- `getFeaturedEmojiSets()` -> `ArrayList<TLRPC.StickerSetCovered>`
- `getFeaturedStickerSets()` -> `ArrayList<TLRPC.StickerSetCovered>`
- `getFeaturedStickersHashWithoutUnread(boolean emoji)` -> `long`
- `getFoundMessageObjects()` -> `ArrayList<MessageObject>`
- `getGreetingsSticker()` -> `TLRPC.Document`
- `getGroupStickerSetById(TLRPC.StickerSet stickerSet)` -> `TLRPC.TL_messages_stickerSet`
- `static getInputStickerSet(TLRPC.StickerSet set)` -> `TLRPC.InputStickerSet`
- `static getInputStickerSet(TLRPC.Document document)` -> `TLRPC.InputStickerSet`
- `static getInputStickerSetItem(TLRPC.Document document, String emoji)` -> `TLRPC.TL_inputStickerSetItem`
- `static getInstance(int num)` -> `MediaDataController`
- `getLastSearchQuery()` -> `String`
- `getMask()` -> `int`
- `getMediaCount(long dialogId, long topicId, int type, int classGuid, boolean fromCache)` -> `void`
- `getMediaCounts(long dialogId, long topicId, int classGuid)` -> `void`
- `static getMediaType(TLRPC.Message message)` -> `int`
- `getOneThreadDraft(long dialogId)` -> `Pair<Long, TLRPC.DraftMessage>`
- `static getPlaceholderStaticAttachMenuBotIcon(@NonNull TLRPC.TL_attachMenuBot bot)` -> `TLRPC.TL_attachMenuBotIcon`
- `getPremiumHintAnnualDiscount(boolean checkTransaction)` -> `Integer`
- `getPremiumPromo()` -> `TLRPC.TL_help_premiumPromo`
- `getReactionsList()` -> `List<TLRPC.TL_availableReaction>`
- `getReactionsMap()` -> `HashMap<String, TLRPC.TL_availableReaction>`
- `getRecentEmojiStatuses()` -> `ArrayList<TLRPC.EmojiStatus>`
- `getRecentGifs()` -> `ArrayList<TLRPC.Document>`
- `getRecentReactions()` -> `ArrayList<TLRPC.Reaction>`
- `getRecentStickers(int type)` -> `ArrayList<TLRPC.Document>`
- `getRecentStickers(int type, boolean firstEmpty)` -> `ArrayList<TLRPC.Document>`
- `getRecentStickersNoCopy(int type)` -> `ArrayList<TLRPC.Document>`
- `getSavedReactions()` -> `ArrayList<TLRPC.Reaction>`
- `getSearchCount()` -> `int`
- `getSearchPosition()` -> `int`
- `static getSideAttachMenuBotIcon(@NonNull TLRPC.TL_attachMenuBot bot)` -> `TLRPC.TL_attachMenuBotIcon`
- `static getSideMenuBotIcon(@NonNull TLRPC.TL_attachMenuBot bot)` -> `TLRPC.TL_attachMenuBotIcon`
- `static getStaticAttachMenuBotIcon(@NonNull TLRPC.TL_attachMenuBot bot)` -> `TLRPC.TL_attachMenuBotIcon`
- `getStickerByIds(int type)` -> `LongSparseArray<TLRPC.Document>`
- `getStickerSet(TLRPC.StickerSet set, boolean cacheOnly)` -> `TLRPC.TL_messages_stickerSet`
- `getStickerSet(TLRPC.InputStickerSet inputStickerSet, boolean cacheOnly)` -> `TLRPC.TL_messages_stickerSet`
- `getStickerSet(TLRPC.InputStickerSet inputStickerSet, Integer hash, boolean cacheOnly)` -> `TLRPC.TL_messages_stickerSet`
- `getStickerSet(TLRPC.InputStickerSet inputStickerSet, Integer hash, boolean cacheOnly, Utilities.Callback<TLRPC.TL_messages_stickerSet> onResponse)` -> `TLRPC.TL_messages_stickerSet`
- `getStickerSet(TLRPC.InputStickerSet inputStickerSet, Integer hash, boolean cacheOnly, boolean runWhenRemote, Utilities.Callback<TLRPC.TL_messages_stickerSet> onResponse)` -> `TLRPC.TL_messages_stickerSet`
- `getStickerSetByEmojiOrName(String emoji)` -> `TLRPC.TL_messages_stickerSet`
- `getStickerSetById(long id)` -> `TLRPC.TL_messages_stickerSet`
- `getStickerSetByName(String name)` -> `TLRPC.TL_messages_stickerSet`
- `static getStickerSetId(TLRPC.Document document)` -> `long`
- `getStickerSetName(long setId)` -> `String`
- `getStickerSets(int type)` -> `ArrayList<TLRPC.TL_messages_stickerSet>`
- `static getTextStyleRuns(ArrayList<TLRPC.MessageEntity> entities, CharSequence text, int allowedFlags)` -> `ArrayList<TextStyleSpan.TextStyleRun>`
- `getTopReactions()` -> `ArrayList<TLRPC.Reaction>`
- `getUnreadEmojiSets()` -> `ArrayList<Long>`
- `getUnreadStickerSets()` -> `ArrayList<Long>`
- `hasRecentGif(TLRPC.Document document)` -> `boolean`
- `increaseGuestRating(long uid)` -> `void`
- `increaseInlineRating(long uid)` -> `void`
- `increasePeerRaiting(long dialogId)` -> `void`
- `increaseWebappRating(long uid)` -> `void`
- `static inputSetKey(TLRPC.InputStickerSet i)` -> `String`
- `installShortcut(long dialogId, int type)` -> `void`
- `installShortcut(long dialogId, int type, Utilities.Callback<Boolean> callback)` -> `void`
- `isLoadingStickers(int type)` -> `boolean`
- `isMenuBotsUpdatedLocal()` -> `boolean`
- `isMessageFound(int messageId, boolean mergeDialog)` -> `boolean`
- `isSearchLoading()` -> `boolean`
- `isShortcutAdded(long dialogId, int type)` -> `boolean`
- `isStickerInFavorites(TLRPC.Document document)` -> `boolean`
- `isStickerPackInstalled(long id)` -> `boolean`
- `isStickerPackInstalled(long id, boolean countForced)` -> `boolean`
- `isStickerPackInstalled(String name)` -> `boolean`
- `isStickerPackUnread(boolean emoji, long id)` -> `boolean`
- `jumpToSearchedMessage(int guid, int index)` -> `void`
- `loadArchivedStickersCount(int type, boolean cache)` -> `void`
- `loadAttachMenuBots(boolean cache, boolean force)` -> `void`
- `loadAttachMenuBots(boolean cache, boolean force, Runnable onDone)` -> `void`
- `loadBotInfo(long uid, long dialogId, boolean cache, int classGuid)` -> `void`
- `loadBotInfo(long uid, long dialogId, boolean cache, int classGuid, Utilities.Callback<TL_bots.BotInfo> whenReceived)` -> `void`
- `loadBotKeyboard(MessagesStorage.TopicKey topicKey)` -> `void`
- `loadBotKeyboard(MessagesStorage.TopicKey topicKey, boolean postNotificationIfNotFound)` -> `void`
- `loadDraftsIfNeed()` -> `void`
- `loadEmojiThemes()` -> `void`
- `loadFeaturedStickers(boolean emoji, boolean cache)` -> `void`
- `loadHints(boolean cache)` -> `void`
- `loadMedia(long dialogId, int count, int max_id, int min_id, int type, long topicId, int fromCache, int classGuid, int requestIndex, ReactionsLayoutInBubble.VisibleReaction tag, String query)` -> `void`
- `loadMoreSearchMessages(boolean fromList)` -> `void`
- `loadMusic(long dialogId, long maxId, long minId)` -> `void`
- `loadPinnedMessages(long dialogId, int maxId, int fallback)` -> `void`
- `loadPinnedMessages(long dialogId, long channelId, ArrayList<Integer> mids, boolean useQueue)` -> `ArrayList<MessageObject>`
- `loadPremiumPromo(boolean cache)` -> `void`
- `loadReactions(boolean cache, Integer lastHash)` -> `void`
- `static loadReactionsFromPref(SharedPreferences preferences)` -> `ArrayList<TLRPC.Reaction>`
- `loadRecentAndTopReactions(boolean force)` -> `void`
- `loadRecents(int type, boolean gif, boolean cache, boolean force)` -> `void`
- `loadReplyIcons()` -> `void`
- `loadReplyMessagesForMessages(ArrayList<MessageObject> messages, long dialogId, int mode, long threadMessageId, Runnable callback, int classGuid, Timer logLogger)` -> `void`
- `loadRestrictedStatusEmojis()` -> `void`
- `loadSavedReactions(boolean force)` -> `void`
- `loadStickers(int type, boolean cache, boolean useHash)` -> `void`
- `loadStickers(int type, boolean cache, boolean force, boolean scheduleIfLoading)` -> `void`
- `loadStickers(int type, boolean cache, boolean force, boolean scheduleIfLoading, Utilities.Callback<ArrayList<TLRPC.TL_messages_stickerSet>> onFinish)` -> `void`
- `loadStickersByEmojiOrName(String name, boolean isEmoji, boolean cache)` -> `void`
- `markFeaturedStickersAsRead(boolean emoji, boolean query)` -> `void`
- `markFeaturedStickersByIdAsRead(boolean emoji, long id)` -> `void`
- `markSetInstalling(long id, boolean installing)` -> `void`
- `markSetUninstalling(long id, boolean uninstalling)` -> `void`
- `moveStickerSetToTop(long setId, boolean emojis, boolean masks)` -> `void`
- `static offsetEntities(ArrayList<TLRPC.MessageEntity> entities, int offset)` -> `void`
- `onRingtoneUploaded(String filePath, TLRPC.Document document, boolean error)` -> `void`
- `portSavedSearchResults(int guid, ReactionsLayoutInBubble.VisibleReaction reaction, String query, ArrayList<MessageObject> local, ArrayList<MessageObject> loaded, int num, int count, boolean reached)` -> `void`
- `preloadDefaultReactions()` -> `void`
- `preloadImage(ImageLocation location, int priority)` -> `void`
- `preloadImage(ImageReceiver imageReceiver, ImageLocation location, String filter)` -> `void`
- `preloadPremiumPreviewStickers()` -> `void`
- `preloadStickerSetThumb(TLRPC.TL_messages_stickerSet stickerSet)` -> `void`
- `preloadStickerSetThumb(TLRPC.StickerSetCovered stickerSet)` -> `void`
- `processDeletedMessage(int id, long[] topic_id)` -> `boolean`
- `processLoadedMenuBots(TLRPC.TL_attachMenuBots bots, long hash, int date, boolean cache)` -> `void`
- `processLoadedPremiumPromo(TLRPC.TL_help_premiumPromo premiumPromo, int date, boolean cache)` -> `void`
- `processLoadedReactions(List<TLRPC.TL_availableReaction> reactions, int hash, int date, boolean cache)` -> `void`
- `processLoadedRecentDocuments(int type, ArrayList<TLRPC.Document> documents, boolean gif, int date, boolean replace)` -> `void`
- `processStickerSetInstallResultArchive(BaseFragment baseFragment, boolean showSettings, int type, TLRPC.TL_messages_stickerSetInstallResultArchive response)` -> `void`
- `pushDraftVoiceMessage(long dialog_id, long topic_id, DraftVoice draft)` -> `void`
- `pushRecentEmojiStatus(TLRPC.EmojiStatus status)` -> `void`
- `putBotInfo(long dialogId, TL_bots.BotInfo botInfo)` -> `void`
- `putBotKeyboard(MessagesStorage.TopicKey topicKey, TLRPC.Message message)` -> `void`
- `putGroupStickerSet(TLRPC.TL_messages_stickerSet stickerSet)` -> `void`
- `putStickerSet(TLRPC.TL_messages_stickerSet set)` -> `void`
- `putStickerSet(TLRPC.TL_messages_stickerSet set, boolean notify)` -> `void`
- `removeInline(long dialogId)` -> `void`
- `removeMessageFromResults(int id)` -> `void`
- `removeMultipleStickerSets(Context context, BaseFragment fragment, ArrayList<TLRPC.TL_messages_stickerSet> sets)` -> `void`
- `removePeer(long uid)` -> `void`
- `removeRecentGif(TLRPC.Document document)` -> `void`
- `removeWebapp(long dialogId)` -> `void`
- `reorderStickers(int type, ArrayList<Long> order, boolean forceUpdateUi)` -> `void`
- `replaceStickerSet(TLRPC.TL_messages_stickerSet set)` -> `void`
- `saveDraft(long dialogId, int threadId, CharSequence message, ArrayList<TLRPC.MessageEntity> entities, TLRPC.Message replyToMessage, boolean noWebpage, long effectId)` -> `void`
- `saveDraft(long dialogId, long threadId, CharSequence message, ArrayList<TLRPC.MessageEntity> entities, TLRPC.Message replyToMessage, ChatActivity.ReplyQuote quote, TLRPC.SuggestedPost suggestedPost, long effectId, boolean noWebpage, boolean clean)` -> `void`
- `saveDraft(long dialogId, long threadId, CharSequence message, ArrayList<TLRPC.MessageEntity> entities, TLRPC.Message replyToMessage, ChatActivity.ReplyQuote quote, TLRPC.SuggestedPost suggestedPost, long effectId, boolean noWebpage, boolean clean, TL_iv.RichMessage richMessage)` -> `void`
- `saveDraft(long dialogId, long threadId, TLRPC.DraftMessage draft, TLRPC.Message replyToMessage, boolean fromServer)` -> `void`
- `static saveReactionsToPref(SharedPreferences preferences, long hash, ArrayList<? extends TLObject> object)` -> `void`
- `saveToRingtones(TLRPC.Document document)` -> `boolean`
- `searchEndReached()` -> `boolean`
- `searchMessagesInChat(String query, long dialogId, long mergeDialogId, int guid, int direction, long replyMessageId, TLRPC.User user, TLRPC.Chat chat, ReactionsLayoutInBubble.VisibleReaction reaction)` -> `void`
- `searchMessagesInChat(String query, long dialogId, long mergeDialogId, int guid, int direction, long replyMessageId, boolean internal, TLRPC.User user, TLRPC.Chat chat, boolean jumpToMessage, ReactionsLayoutInBubble.VisibleReaction reaction)` -> `void`
- `searchStickerSets(boolean emojis, String query, Utilities.Callback<ArrayList<TLRPC.StickerSetCovered>> callback)` -> `void`
- `searchStickers(boolean emojis, String lang_code, String q, Utilities.Callback<ArrayList<TLRPC.Document>> whenDone)` -> `SearchStickersKey`
- `searchStickers(boolean emojis, String lang_code, String q, Utilities.Callback<ArrayList<TLRPC.Document>> whenDone, boolean next)` -> `SearchStickersKey`
- `setDoubleTapReaction(String reaction)` -> `void`
- `setDraftFolderId(long dialogId, int folderId)` -> `void`
- `setDraftVoiceRegion(long dialog_id, long topic_id, float left, float right)` -> `void`
- `setPlaceholderImage(BackupImageView imageView, String setName, String emoji, String filter)` -> `void`
- `setSearchedPosition(int index)` -> `void`
- `static sortEntities(ArrayList<TLRPC.MessageEntity> entities)` -> `void`
- `storeTempStickerSet(TLRPC.TL_messages_stickerSet set)` -> `void`
- `static stringsEqual(CharSequence a, CharSequence b)` -> `boolean`
- `substring(CharSequence source, int start, int end)` -> `CharSequence`
- `toggleDraftVoiceOnce(long dialog_id, long topic_id, boolean once)` -> `void`
- `toggleStickerSet(Context context, TLObject stickerSetObject, int toggle, BaseFragment baseFragment, boolean showSettings, boolean showTooltip)` -> `void`
- `toggleStickerSet(Context context, TLObject stickerSetObject, int toggle, BaseFragment baseFragment, boolean showSettings, boolean showTooltip, Runnable onUndo, boolean forget)` -> `void`
- `toggleStickerSet(Context context, TLObject stickerSetObject, int toggle, BaseFragment baseFragment, FrameLayout bulletinContainer, boolean showSettings, boolean showTooltip, Runnable onUndo, boolean forget)` -> `void`
- `toggleStickerSet(Context context, TLObject stickerSetObject, TLRPC.Document sticker, int toggle, BaseFragment baseFragment, FrameLayout bulletinContainer, boolean showSettings, boolean showTooltip, Runnable onUndo, boolean forget)` -> `void`
- `toggleStickerSets(ArrayList<TLRPC.StickerSet> stickerSetList, int type, int toggle, BaseFragment baseFragment, boolean showSettings)` -> `void`
- `uninstallShortcut(long dialogId, int type)` -> `void`
- `updateAttachMenuBotsInCache()` -> `void`
- `updateBotInfo(long dialogId, TL_update.TL_updateBotCommands update)` -> `void`
- `uploadRingtone(String filePath)` -> `void`
- `verifyAnimatedStickerMessage(TLRPC.Message message)` -> `void`
- `verifyAnimatedStickerMessage(TLRPC.Message message, boolean safe)` -> `void`

## `org.telegram.messenger.MemberRequestsController`
- `getCachedImporters(long chatId)` -> `TLRPC.TL_messages_chatInviteImporters`
- `getImporters(final long chatId, final String query, TLRPC.TL_chatInviteImporter lastImporter, LongSparseArray<TLRPC.User> users, RequestDelegate onComplete)` -> `int`
- `static getInstance(int accountNum)` -> `MemberRequestsController`
- `onPendingRequestsUpdated(TL_update.TL_updatePendingJoinRequests update)` -> `void`

## `org.telegram.messenger.MessageCustomParamsHelper`
- `static copyParams(TLRPC.Message fromMessage, TLRPC.Message toMessage)` -> `void`
- `static isEmpty(TLRPC.Message message)` -> `boolean`
- `static readLocalParams(TLRPC.Message message, NativeByteBuffer byteBuffer)` -> `void`
- `static writeLocalParams(TLRPC.Message message)` -> `NativeByteBuffer`

## `org.telegram.messenger.MessageCustomParamsHelper$Params_v1`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.messenger.MessageKeyData`
- `static generateMessageKeyData(byte[] authKey, byte[] messageKey, boolean incoming, int version)` -> `MessageKeyData`

## `org.telegram.messenger.MessagePreviewParams`
- `static areUrlsEqual(String url1, String url2)` -> `boolean`
- `attach(MessagePreviewView previewView)` -> `void`
- `checkCurrentLink(MessageObject msg)` -> `void`
- `checkEdits(ArrayList<MessageObject> replaceMessageObjects)` -> `void`
- `getForwardedMessagesCount()` -> `int`
- `hasLink(CharSequence text, String url)` -> `boolean`
- `isEmpty()` -> `boolean`
- `updateForward(ArrayList<MessageObject> forwardMessages, long dialogId)` -> `void`
- `updateLink(int currentAccount, TLRPC.WebPage foundWebpage, CharSequence messageText, MessageObject replyMessageObject, ChatActivity.ReplyQuote replyQuote, MessageObject inherit)` -> `void`
- `updateLinkInvertMedia(boolean invertMedia)` -> `void`
- `updateReply(MessageObject replyMessageObject, MessageObject.GroupedMessages group, long dialogId, ChatActivity.ReplyQuote replyQuote)` -> `void`

## `org.telegram.messenger.MessagePreviewParams$Messages`
- `checkEdits(ArrayList<MessageObject> replaceMessageObjects)` -> `Messages`
- `getSelectedMessages(ArrayList<MessageObject> messagesToForward)` -> `void`

## `org.telegram.messenger.MessageSuggestionParams`
- `static empty()` -> `MessageSuggestionParams`
- `isEmpty()` -> `boolean`
- `static of(TLRPC.SuggestedPost suggestedPost)` -> `MessageSuggestionParams`
- `static of(TLRPC.TL_messageActionSuggestedPostApproval approval)` -> `MessageSuggestionParams`
- `static of(AmountUtils.Amount amount, long time)` -> `MessageSuggestionParams`

## `org.telegram.messenger.MrzRecognizer`
- `static recognize(Bitmap bitmap, boolean tryDriverLicenseFirst)` -> `Result`
- `static recognize(byte[] yuvData, int width, int height, int rotation)` -> `Result`

## `org.telegram.messenger.MusicBrowserService`
- `onCreate()` -> `void`
- `onDestroy()` -> `void`
- `onGetRoot(String clientPackageName, int clientUid, Bundle rootHints)` -> `BrowserRoot`
- `onLoadChildren(@NonNull String parentMediaId, @NonNull Result<List<MediaBrowser.MediaItem>> result)` -> `void`

## `org.telegram.messenger.MusicPlayerReceiver`
- `onReceive(Context context, Intent intent)` -> `void`

## `org.telegram.messenger.MusicPlayerService`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onBind(Intent intent)` -> `IBinder`
- `onCreate()` -> `void`
- `onDestroy()` -> `void`
- `onStartCommand(Intent intent, int flags, int startId)` -> `int`
- `setListeners(RemoteViews view)` -> `void`

## `org.telegram.messenger.NativeLoader`
- `static getAbiFolder()` -> `String`
- `static initNativeLibs(Context context)` -> `void`
- `static loaded()` -> `boolean`

## `org.telegram.messenger.NotchInfoUtils`
- `static getInfo(Context ctx)` -> `NotchInfo`

## `org.telegram.messenger.OneUIUtilities`
- `static getOneUIEncodedVersion()` -> `int`
- `static getOneUIMajorVersion()` -> `int`
- `static getOneUIMinorVersion()` -> `float`
- `static hasBuiltInClipboardToasts()` -> `boolean`
- `static isOneUI()` -> `boolean`

## `org.telegram.messenger.OpenAttachedMenuBotReceiver`
- `onCreate(Bundle savedInstanceState)` -> `void`

## `org.telegram.messenger.OpenChatReceiver`
- `onCreate(Bundle savedInstanceState)` -> `void`

## `org.telegram.messenger.PackageValidator`
- `static isKnownCaller(Context context, String callerPackageName, int callerUid)` -> `boolean`

## `org.telegram.messenger.PasskeysController`
- `static bytesToHex(byte[] bytes)` -> `String`
- `static create(Context context, int currentAccount, Utilities.Callback2<TL_account.Passkey, String> done)` -> `void`
- `static ktxCallback(Utilities.Callback2<T, Throwable> done)` -> `Continuation<T>`
- `static ktxCallback(CoroutineContext ctx, Utilities.Callback2<T, Throwable> done)` -> `Continuation<T>`
- `static login(Context context, int currentAccount, boolean clickedButton, Utilities.Callback3<Long, TLRPC.auth_Authorization, String> done)` -> `Runnable`

## `org.telegram.messenger.PopupReplyReceiver`
- `onReceive(Context context, Intent intent)` -> `void`

## `org.telegram.messenger.ProxyRotationController`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static init()` -> `void`

## `org.telegram.messenger.PushListenerController`
- `static processRemoteMessage(@PushType int pushType, String data, long time)` -> `void`
- `static sendRegistrationToServer(@PushType int pushType, String token)` -> `void`

## `org.telegram.messenger.PushListenerController$GooglePushListenerServiceProvider`
- `getLogTitle()` -> `String`
- `getPushType()` -> `int`
- `hasServices()` -> `boolean`
- `onRequestPushToken()` -> `void`

## `org.telegram.messenger.RefererReceiver`
- `onReceive(Context context, Intent intent)` -> `void`

## `org.telegram.messenger.ResLottieMeta`
- `static find(@RawRes int resId)` -> `long`
- `static fpsOf(long packed)` -> `int`
- `static frameCountOf(long packed)` -> `int`
- `static isMonoColorOf(long packed)` -> `boolean`
- `static resIdOf(long packed)` -> `int`

## `org.telegram.messenger.RichMessageLayout`
- `attach(View view)` -> `void`
- `checkQuoteLine(TLRPC.User currentUser, TLRPC.Chat currentChat)` -> `void`
- `collectMediaBlocks(List<TL_iv.PageBlock> out)` -> `void`
- `static computeGrouped(float[] ratios)` -> `MessageObject.GroupedMessagePosition[]`
- `static createEditorButtonSpan(int currentAccount, int maxWidth, Theme.ResourcesProvider resourcesProvider, TL_iv.textButton textButton)` -> `RichButtonSpan`
- `static createEditorPageButton(int currentAccount, int maxWidth, Theme.ResourcesProvider resourcesProvider, TL_keyboard.PageButton pageButton, Runnable invalidateRunnable)` -> `RichButton`
- `detach(View view)` -> `void`
- `findLink(CharacterStyle link)` -> `FoundLink`
- `findMediaImageReceiver(TL_iv.PageBlock target, int[] outOffset)` -> `ImageReceiver`
- `forceNewLineForTime()` -> `boolean`
- `formatText(TL_iv.RichText text)` -> `CharSequence`
- `formatText(TL_iv.RichText text, int flags)` -> `CharSequence`
- `formatText(TL_iv.RichText text, SpannableStringBuilder out, int flags)` -> `CharSequence`
- `getAnimatorBlocks()` -> `List<MultiLayoutTypingAnimator.Block>`
- `getCell()` -> `ChatMessageCell`
- `getDelegate()` -> `ChatMessageCell.ChatMessageCellDelegate`
- `getDocument(long documentId)` -> `TLRPC.Document`
- `getGap()` -> `int`
- `getHeight()` -> `int`
- `getLastLineWidth()` -> `int`
- `getMediaSpoilerEffect()` -> `SpoilerEffect2`
- `getMinWidth()` -> `int`
- `getPhoto(long photoId)` -> `TLRPC.Photo`
- `getSelectionHtml(int selStart, int selEnd)` -> `String`
- `static getString(TL_iv.RichText text)` -> `String`
- `static getString(TL_iv.RichText text, StringBuilder out)` -> `void`
- `getUnsupportedHoles()` -> `ArrayList<RichUnsupportedBlock>`
- `getUnsupportedHolesRoot()` -> `ArrayList<RichUnsupportedBlock>`
- `hasNameOffset()` -> `boolean`
- `hasOverlay()` -> `boolean`
- `hasRootUnsupportedBlocks()` -> `boolean`
- `hasUnsupportedBlocks()` -> `boolean`
- `isAttached()` -> `boolean`
- `isHorizontallyDragging()` -> `boolean`
- `isOut()` -> `boolean`
- `isOverlayActive()` -> `boolean`
- `isPinnedTop()` -> `boolean`
- `isPressingLink()` -> `boolean`
- `isRtl()` -> `boolean`
- `isTranslating()` -> `boolean`
- `needsUpdate(TL_iv.RichMessage newRichMessage, int maxWidth)` -> `boolean`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `reposition()` -> `void`
- `static setBlockFlags(int textFlags, int blockFlags)` -> `int`
- `setChatMessageCellDelegate(ChatMessageCell cell, ChatMessageCell.ChatMessageCellDelegate delegate)` -> `void`
- `setResourcesProvider(Theme.ResourcesProvider resourcesProvider)` -> `void`
- `setSlideshowPage(TL_iv.PageBlock target)` -> `boolean`
- `setTypingAnimator(MultiLayoutTypingAnimator animator)` -> `void`
- `snapshotForBlockquoteAnimation()` -> `void`
- `snapshotForDetailsAnimation()` -> `void`
- `startsWithMedia()` -> `boolean`
- `updateAnimatedEmojis(int cacheType)` -> `void`

## `org.telegram.messenger.RichMessageLayout$AnchorSpan`
- `updateDrawState(TextPaint tp)` -> `void`

## `org.telegram.messenger.RichMessageLayout$MediaCell`
- `attach(View view)` -> `void`
- `detach()` -> `void`
- `ensureProgress(View view)` -> `void`
- `fileExists()` -> `boolean`
- `static forPageBlock(RichMessageLayout root, TL_iv.PageBlock pageBlock)` -> `MediaCell`
- `getAccessibilityText()` -> `CharSequence`
- `getFileName()` -> `String`
- `isInside(float lx, float ly)` -> `boolean`
- `onAccessibilityClick(View view)` -> `boolean`
- `onTouchEvent(MotionEvent event, View view)` -> `boolean`
- `setRect(int x, int y, int w, int h)` -> `void`
- `updateButtonState(View view, boolean animated)` -> `void`

## `org.telegram.messenger.RichMessageLayout$PreviewView$PaddedTextLayoutBlock`
- `getLayout()` -> `Layout`
- `getPrefix()` -> `CharSequence`
- `getRow()` -> `int`
- `getText()` -> `CharSequence`
- `getX()` -> `int`
- `getY()` -> `int`

## `org.telegram.messenger.RichMessageLayout$RichBlock`
- `appendAccessibilityText(SpannableStringBuilder sb)` -> `void`
- `static appendText(SpannableStringBuilder sb, Text single, Text[] arr)` -> `void`
- `attach(View view)` -> `void`
- `detach(View view)` -> `void`
- `findLink(CharacterStyle link, int blockY, FoundLink out)` -> `boolean`
- `getAccessibilityElementBounds(int element, Rect out)` -> `void`
- `getAccessibilityElementCount()` -> `int`
- `getAccessibilityElementStateDescription(int element)` -> `CharSequence`
- `getAccessibilityElementText(int element)` -> `CharSequence`
- `getAccessibilityLabel()` -> `CharSequence`
- `getAccessibilityListMarker()` -> `CharSequence`
- `getBlockAccessibilityElementBounds(int element, Rect out)` -> `void`
- `getBlockAccessibilityElementCount()` -> `int`
- `getBlockAccessibilityElementStateDescription(int element)` -> `CharSequence`
- `getBlockAccessibilityElementText(int element)` -> `CharSequence`
- `getContentPaddingTop()` -> `int`
- `getText()` -> `TextSelectionHelper.TextLayoutBlock[]`
- `isAccessibilityElementCheckbox(int element)` -> `boolean`
- `isAccessibilityElementChecked(int element)` -> `boolean`
- `isAccessibilityElementClickable(int element)` -> `boolean`
- `isAccessibilityElementText(int element)` -> `boolean`
- `isAttachedToWindow()` -> `boolean`
- `isBlockAccessibilityElementText(int element)` -> `boolean`
- `isHorizontallyDragging()` -> `boolean`
- `isInQuote()` -> `boolean`
- `isPressingLink()` -> `boolean`
- `isVisible()` -> `boolean`
- `onAccessibilityElementClick(int element, View host)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onBlockAccessibilityElementClick(int element, View host)` -> `boolean`
- `onDetachedFromWindow()` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `placeTexts(int blockX, int blockY, int row)` -> `void`
- `requestDisallowParentIntercept(boolean disallow)` -> `void`
- `setCheckbox(boolean checked)` -> `void`
- `setCheckbox(boolean checked, TLObject sourceItem)` -> `void`
- `setListMarkerWidth(int width)` -> `void`
- `setNum(String num)` -> `void`
- `snapshot()` -> `void`
- `touchEvent(MotionEvent event)` -> `boolean`
- `updateListMarkerY()` -> `void`
- `static withReplacements(CharSequence cs)` -> `CharSequence`

## `org.telegram.messenger.RichMessageLayout$RichButton`
- `attach(View view)` -> `void`
- `contains(float x)` -> `boolean`
- `detach(View view)` -> `void`
- `getHeight()` -> `int`
- `getIconReserve()` -> `int`
- `getPaddingLeft()` -> `int`
- `getPaddingRight()` -> `int`
- `getPressScale()` -> `float`
- `getTextWidth()` -> `int`
- `getTextX()` -> `float`
- `isLoading()` -> `boolean`
- `setLoading(boolean loading)` -> `void`
- `setPressed(boolean pressed)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichButtonRowBlock`
- `getHeight()` -> `int`
- `getMinWidth()` -> `int`
- `isHorizontallyDragging()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.messenger.RichMessageLayout$RichButtonSpan`
- `attach(View view)` -> `void`
- `contains(float x, float y)` -> `boolean`
- `contains(float x, float y, float padding)` -> `boolean`
- `detach(View view)` -> `void`
- `didPress(ChatMessageCell cell, ChatMessageCell.ChatMessageCellDelegate delegate, boolean longPress)` -> `void`
- `getSize(@NonNull Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm)` -> `int`
- `isDisabled()` -> `boolean`
- `setPressed(boolean pressed)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichCaptionBlock`
- `appendAccessibilityText(SpannableStringBuilder sb)` -> `void`
- `getHeight()` -> `int`
- `getLastLineWidth()` -> `int`
- `getMinWidth()` -> `int`
- `getText()` -> `TextSelectionHelper.TextLayoutBlock[]`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `placeTexts(int blockX, int blockY, int row)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichCollageBlock`
- `getBlockAccessibilityElementBounds(int element, Rect out)` -> `void`
- `getBlockAccessibilityElementCount()` -> `int`
- `getBlockAccessibilityElementText(int element)` -> `CharSequence`
- `onBlockAccessibilityElementClick(int element, View host)` -> `boolean`
- `onTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.messenger.RichMessageLayout$RichDetailsBlock`
- `appendAccessibilityText(SpannableStringBuilder sb)` -> `void`
- `findLink(CharacterStyle link, int blockY, FoundLink out)` -> `boolean`
- `getBlockAccessibilityElementBounds(int element, Rect out)` -> `void`
- `getBlockAccessibilityElementCount()` -> `int`
- `getBlockAccessibilityElementStateDescription(int element)` -> `CharSequence`
- `getBlockAccessibilityElementText(int element)` -> `CharSequence`
- `getHeight()` -> `int`
- `getLastLineWidth()` -> `int`
- `getMinWidth()` -> `int`
- `getText()` -> `TextSelectionHelper.TextLayoutBlock[]`
- `isBlockAccessibilityElementText(int element)` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `placeTexts(int blockX, int blockY, int row)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock`
- `getHeight()` -> `int`
- `getMinWidth()` -> `int`

## `org.telegram.messenger.RichMessageLayout$RichDividerBlock`
- `getHeight()` -> `int`
- `getMinWidth()` -> `int`

## `org.telegram.messenger.RichMessageLayout$RichDocumentBlock`
- `updateButtonState(boolean animated)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichMapBlock`
- `getHeight()` -> `int`
- `getLastLineWidth()` -> `int`
- `getMinWidth()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.messenger.RichMessageLayout$RichMathBlock`
- `appendAccessibilityText(SpannableStringBuilder sb)` -> `void`
- `getHeight()` -> `int`
- `getLastLineWidth()` -> `int`
- `getMinWidth()` -> `int`
- `isHorizontallyDragging()` -> `boolean`
- `onTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.messenger.RichMessageLayout$RichMediaBlock`
- `allowAutoplay()` -> `boolean`
- `computeAutoDownload()` -> `boolean`
- `finishLayout()` -> `void`
- `getBlockAccessibilityElementBounds(int element, Rect out)` -> `void`
- `getBlockAccessibilityElementCount()` -> `int`
- `getBlockAccessibilityElementText(int element)` -> `CharSequence`
- `getHeight()` -> `int`
- `getImageLeft()` -> `int`
- `getLastLineWidth()` -> `int`
- `getMinWidth()` -> `int`
- `isAnimatedContent()` -> `boolean`
- `isRealVideo()` -> `boolean`
- `isSpoiler()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onBlockAccessibilityElementClick(int element, View host)` -> `boolean`
- `onDetachedFromWindow()` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `updateButtonState(boolean animated)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichPhotoBlock`
- `applyImage(boolean allowMedia)` -> `void`
- `fileExists()` -> `boolean`
- `getBlock()` -> `TL_iv.PageBlock`
- `getFileName()` -> `String`
- `isSpoiler()` -> `boolean`

## `org.telegram.messenger.RichMessageLayout$RichPreformattedBlock`
- `appendAccessibilityText(SpannableStringBuilder sb)` -> `void`
- `findLink(CharacterStyle link, int blockY, FoundLink out)` -> `boolean`
- `getAccessibilityLabel()` -> `CharSequence`
- `getHeight()` -> `int`
- `getLastLineWidth()` -> `int`
- `getLayout()` -> `Layout`
- `getMinWidth()` -> `int`
- `getText()` -> `TextSelectionHelper.TextLayoutBlock[]`
- `isHorizontallyDragging()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDrawFaded(Canvas canvas, int lineIndex, float xPosition)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `placeTexts(int blockX, int blockY, int row)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichSlideshowBlock`
- `getBlockAccessibilityElementBounds(int element, Rect out)` -> `void`
- `getBlockAccessibilityElementCount()` -> `int`
- `getBlockAccessibilityElementText(int element)` -> `CharSequence`
- `getCurrentPage()` -> `int`
- `isHorizontallyDragging()` -> `boolean`
- `onBlockAccessibilityElementClick(int element, View host)` -> `boolean`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setCurrentPage(int page)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichTableBlock`
- `appendAccessibilityText(SpannableStringBuilder sb)` -> `void`
- `createTextLayout(TL_iv.pageTableCell cell, int maxWidth)` -> `Text`
- `findLink(CharacterStyle link, int blockY, FoundLink out)` -> `boolean`
- `getText()` -> `TextSelectionHelper.TextLayoutBlock[]`
- `isHorizontallyDragging()` -> `boolean`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `placeTexts(int blockX, int blockY, int row)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichTextBlock`
- `appendAccessibilityText(SpannableStringBuilder sb)` -> `void`
- `findLink(CharacterStyle link, int blockY, FoundLink out)` -> `boolean`
- `forcesTimeToNewLine()` -> `boolean`
- `getContentPaddingTop()` -> `int`
- `getHeight()` -> `int`
- `getLastLineWidth()` -> `int`
- `getLayout()` -> `Layout`
- `getMinWidth()` -> `int`
- `getText()` -> `TextSelectionHelper.TextLayoutBlock[]`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDrawFaded(Canvas canvas, int lineIndex, float xPosition)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `placeTexts(int blockX, int blockY, int row)` -> `void`
- `setContentPadding(int top, int bottom)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichTextBlockQuote`
- `getBackgroundScale()` -> `float`
- `getCollapsedHeight()` -> `int`
- `getHeight()` -> `int`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `snapshot()` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichThinkingBlock`
- `findLink(CharacterStyle link, int blockY, FoundLink out)` -> `boolean`
- `getHeight()` -> `int`
- `getLastLineWidth()` -> `int`
- `getLayout()` -> `Layout`
- `getMinWidth()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDrawFaded(Canvas canvas, int lineIndex, float xPosition)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.messenger.RichMessageLayout$RichUnsupportedBlock`
- `getHeight(ChatMessageCell.TransitionParams tp)` -> `float`
- `getY(ChatMessageCell.TransitionParams tp)` -> `float`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `scheduleDrawable(@NonNull Drawable who, @NonNull Runnable what, long when)` -> `void`
- `unscheduleDrawable(@NonNull Drawable who, @NonNull Runnable what)` -> `void`

## `org.telegram.messenger.RichMessageLayout$RichVideoBlock`
- `allowAutoplay()` -> `boolean`
- `applyImage(boolean allowMedia)` -> `void`
- `computeAutoDownload()` -> `boolean`
- `fileExists()` -> `boolean`
- `getBlock()` -> `TL_iv.PageBlock`
- `getFileName()` -> `String`
- `isAnimatedContent()` -> `boolean`
- `isRealVideo()` -> `boolean`
- `isSpoiler()` -> `boolean`

## `org.telegram.messenger.RichMessageLayout$SpoilerReveal`
- `clipOut(Canvas canvas)` -> `void`
- `fullyRevealed()` -> `boolean`
- `isRevealing()` -> `boolean`
- `start(View view, float cx, float cy, float w, float h)` -> `void`

## `org.telegram.messenger.RichMessageLayout$StyleSpan`
- `applyStyle(TextPaint p)` -> `void`
- `getTextColor()` -> `int`
- `getTextSize()` -> `int`
- `getTypeface()` -> `Typeface`
- `updateDrawState(TextPaint paint)` -> `void`

## `org.telegram.messenger.RichMessageLayout$Text`
- `attach(View view)` -> `void`
- `detach(View view)` -> `void`
- `fillFoundLink(CharacterStyle link, FoundLink out)` -> `boolean`
- `getHeight()` -> `int`
- `getLastLineWidth()` -> `int`
- `getLayout()` -> `Layout`
- `getMinWidth()` -> `int`
- `getRow()` -> `int`
- `getX()` -> `int`
- `getY()` -> `int`
- `isAttached()` -> `boolean`
- `isPressingLink()` -> `boolean`
- `offset(int x, int y)` -> `Text`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `refreshAnimatedEmoji(int cacheType)` -> `void`
- `setBlockX(int x)` -> `void`
- `setBlockY(int y)` -> `void`
- `setDrawAtOrigin(boolean value)` -> `void`
- `setRow(int row)` -> `void`
- `setX(int x)` -> `void`
- `setY(int y)` -> `void`

## `org.telegram.messenger.RuntimeClassNameTypeAdapterFactory`
- `create(Gson gson, TypeToken<R> type)` -> `TypeAdapter<R>`
- `static of(Class<T> baseType, String typeFieldName, ExclusionStrategy exclusionStrategy)` -> `RuntimeClassNameTypeAdapterFactory<T>`
- `static of(Class<T> baseType)` -> `RuntimeClassNameTypeAdapterFactory<T>`
- `registerSubtype(Class<? extends T> type, String label)` -> `RuntimeClassNameTypeAdapterFactory<T>`
- `registerSubtype(Class<? extends T> type)` -> `RuntimeClassNameTypeAdapterFactory<T>`

## `org.telegram.messenger.SRPHelper`
- `static getBigIntegerBytes(BigInteger value)` -> `byte[]`
- `static getV(byte[] passwordBytes, TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow algo)` -> `BigInteger`
- `static getVBytes(byte[] passwordBytes, TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow algo)` -> `byte[]`
- `static getX(byte[] passwordBytes, TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow algo)` -> `byte[]`
- `static startCheck(byte[] x_bytes, long srp_id, byte[] srp_B, TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow algo)` -> `TLRPC.TL_inputCheckPasswordSRP`

## `org.telegram.messenger.ScreenReceiver`
- `onReceive(Context context, Intent intent)` -> `void`

## `org.telegram.messenger.SecretChatHelper`
- `acceptSecretChat(TLRPC.EncryptedChat encryptedChat)` -> `void`
- `checkSecretHoles(TLRPC.EncryptedChat chat, ArrayList<TLRPC.Message> messages)` -> `void`
- `cleanup()` -> `void`
- `declineSecretChat(int chat_id, boolean revoke)` -> `void`
- `declineSecretChat(int chat_id, boolean revoke, long taskId)` -> `void`
- `decryptMessage(TLRPC.EncryptedMessage message)` -> `ArrayList<TLRPC.Message>`
- `static getInstance(int num)` -> `SecretChatHelper`
- `static isSecretInvisibleMessage(TLRPC.Message message)` -> `boolean`
- `static isSecretVisibleMessage(TLRPC.Message message)` -> `boolean`
- `performSendEncryptedRequest(TLRPC.TL_messages_sendEncryptedMultiMedia req, SendMessagesHelper.DelayedMessage message)` -> `void`
- `performSendEncryptedRequest(TLRPC.DecryptedMessage req, TLRPC.Message newMsgObj, TLRPC.EncryptedChat chat, TLRPC.InputEncryptedFile encryptedFile, String originalPath, MessageObject newMsg)` -> `void`
- `processAcceptedSecretChat(TLRPC.EncryptedChat encryptedChat)` -> `void`
- `processDecryptedObject(TLRPC.EncryptedChat chat, TLRPC.EncryptedFile file, int date, TLObject object, boolean new_key_used)` -> `TLRPC.Message`
- `processPendingEncMessages()` -> `void`
- `processUpdateEncryption(TL_update.TL_updateEncryption update, ConcurrentHashMap<Long, TLRPC.User> usersDict)` -> `void`
- `requestNewSecretChatKey(TLRPC.EncryptedChat encryptedChat)` -> `void`
- `sendAbortKeyMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message resendMessage, long excange_id)` -> `void`
- `sendAcceptKeyMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message resendMessage)` -> `void`
- `sendClearHistoryMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message resendMessage)` -> `void`
- `sendCommitKeyMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message resendMessage)` -> `void`
- `sendMessagesDeleteMessage(TLRPC.EncryptedChat encryptedChat, ArrayList<Long> random_ids, TLRPC.Message resendMessage)` -> `void`
- `sendMessagesReadMessage(TLRPC.EncryptedChat encryptedChat, ArrayList<Long> random_ids, TLRPC.Message resendMessage)` -> `void`
- `sendNoopMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message resendMessage)` -> `void`
- `sendNotifyLayerMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message resendMessage)` -> `void`
- `sendRequestKeyMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message resendMessage)` -> `void`
- `sendResendMessage(TLRPC.EncryptedChat encryptedChat, int start, int end, TLRPC.Message resendMessage)` -> `void`
- `sendScreenshotMessage(TLRPC.EncryptedChat encryptedChat, ArrayList<Long> random_ids, TLRPC.Message resendMessage)` -> `void`
- `sendTTLMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message resendMessage)` -> `void`
- `startSecretChat(Context context, TLRPC.User user)` -> `void`

## `org.telegram.messenger.SecretChatHelper$TL_decryptedMessageHolder`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.messenger.SegmentTree`
- `rMaxQ(int from, int to)` -> `long`
- `rMinQ(int from, int to)` -> `long`

## `org.telegram.messenger.SegmentTree$Node`
- `size()` -> `int`

## `org.telegram.messenger.SendMessageChatArguments$Builder`
- `build()` -> `SendMessageChatArguments`
- `setQuickReplyShortcut(String quickReplyShortcut, int quickReplyShortcutId)` -> `void`
- `setWelcomeMessageChatId(long welcomeMessageChatId)` -> `void`

## `org.telegram.messenger.SendMessagesHelper`
- `addPollOption(MessageObject messageObject, CharSequence caption, PollAttachedMedia attachedMedia)` -> `void`
- `static canSendMessageToChat(TLRPC.Chat chat, MessageObject msgObj)` -> `int`
- `cancelSendingMessage(MessageObject object)` -> `void`
- `cancelSendingMessage(ArrayList<MessageObject> objects)` -> `void`
- `checkUnsentMessages()` -> `void`
- `static checkUpdateStickersOrder(CharSequence text)` -> `boolean`
- `cleanup()` -> `void`
- `completeSendingGramTransfer(MessageObject object, TLRPC.Updates updates, boolean success)` -> `void`
- `createReplyInput(TL_stories.StoryItem storyItem)` -> `TLRPC.InputReplyTo`
- `createReplyInput(int replyToMsgId)` -> `TLRPC.InputReplyTo`
- `createReplyInput(TLRPC.InputPeer sendToPeer, int replyToMsgId, int topMessageId, ChatActivity.ReplyQuote replyQuote)` -> `TLRPC.InputReplyTo`
- `createReplyInput(TLRPC.TL_messageReplyHeader replyHeader)` -> `TLRPC.InputReplyTo`
- `createSendingGramTransfer(TLRPC.User user, String address, long amount, String comment, boolean commentEncrypted, boolean commentEncryptedPreparing, long randomId)` -> `MessageObject`
- `static createVideoThumbnail(String filePath, int kind)` -> `Bitmap`
- `static createVideoThumbnailAtTime(String filePath, long time)` -> `Bitmap`
- `static createVideoThumbnailAtTime(String filePath, long time, int[] orientation, boolean precise)` -> `Bitmap`
- `deletePollOption(MessageObject messageObject, byte[] option)` -> `void`
- `didReceivedNotification(int id, int account, final Object... args)` -> `void`
- `editMessage(MessageObject messageObject, TLRPC.TL_photo photo, VideoEditedInfo videoEditedInfo, TLRPC.TL_document document, String path, TLRPC.PhotoSize cover, HashMap<String, String> params, boolean retry, boolean hasMediaSpoilers, Object parentObject)` -> `void`
- `editMessage(MessageObject messageObject, TLRPC.TL_inputPollAnswer pollToAddOptionMessageObject, TLRPC.TL_photo photo, VideoEditedInfo videoEditedInfo, TLRPC.TL_document document, String path, TLRPC.PhotoSize cover, HashMap<String, String> params, boolean retry, boolean hasMediaSpoilers, Object parentObject)` -> `void`
- `editMessage(MessageObject messageObject, String message, boolean searchLinks, final BaseFragment fragment, ArrayList<TLRPC.MessageEntity> entities, int scheduleDate, int scheduleRepeatPeriod)` -> `int`
- `editRichMessage(MessageObject messageObject, TL_iv.RichMessage rich, ArrayList<TLRPC.InputUser> users, final BaseFragment fragment, boolean onlyCheckbox)` -> `int`
- `static ensureMediaThumbExists(AccountInstance accountInstance, boolean isEncrypted, TLObject object, String path, Uri uri, long startTime)` -> `void`
- `static ensureMediaThumbExists(AccountInstance accountInstance, boolean isEncrypted, TLObject object, String path, Uri uri, long startTime, boolean highQuality)` -> `void`
- `static fillVideoAttribute(String videoPath, TLRPC.TL_documentAttributeVideo attributeVideo, VideoEditedInfo videoEditedInfo)` -> `void`
- `generatePhotoSizes(String path, Uri imageUri)` -> `TLRPC.TL_photo`
- `generatePhotoSizes(TLRPC.TL_photo photo, String path, Uri imageUri, boolean highQuality)` -> `TLRPC.TL_photo`
- `getDelayedMessages(String location)` -> `ArrayList<DelayedMessage>`
- `getImportingHistory(long dialogId)` -> `ImportingHistory`
- `getImportingStickers(String shortName)` -> `ImportingStickers`
- `static getInstance(int num)` -> `SendMessagesHelper`
- `static getKeyForPhotoSize(AccountInstance accountInstance, TLRPC.PhotoSize photoSize, Bitmap[] bitmap, boolean blur, boolean forceCache)` -> `String`
- `getNextRandomId()` -> `long`
- `getSendingMessageId(long did)` -> `int`
- `getSendingTodoValue(final MessageObject messageObject, final TLRPC.TodoItem task)` -> `Boolean`
- `static getTrimmedString(String src)` -> `String`
- `static getTrimmedString(CharSequence src)` -> `CharSequence`
- `getVoteSendTime(long pollId)` -> `long`
- `isImportingHistory()` -> `boolean`
- `isImportingStickers()` -> `boolean`
- `isSendingCallback(MessageObject messageObject, TL_keyboard.KeyboardButtonProto button)` -> `boolean`
- `isSendingCurrentLocation(MessageObject messageObject, TL_keyboard.KeyboardButtonProto button)` -> `boolean`
- `isSendingMessage(int mid)` -> `boolean`
- `isSendingMessageIdDialog(long did)` -> `boolean`
- `isSendingPaidMessage(int mid, int index)` -> `boolean`
- `isSendingVote(MessageObject messageObject)` -> `byte[]`
- `isUploadingMessageIdDialog(long did)` -> `boolean`
- `onMessageEdited(TLRPC.Message message)` -> `void`
- `performSendMessageRequest(final TLObject req, final MessageObject msgObj, final String originalPath, DelayedMessage parentMessage, boolean check, DelayedMessage delayedMessage, Object parentObject, HashMap<String, String> params, boolean scheduled)` -> `void`
- `performSendMessageRequestMulti(final TLObject request, final ArrayList<MessageObject> msgObjs, final ArrayList<String> originalPaths, final ArrayList<Object> parentObjects, DelayedMessage delayedMessage, boolean scheduled)` -> `void`
- `static prepareEditingArticle(AccountInstance accountInstance, MessageObject editingMessageObject, ArrayList<TL_iv.PageBlock> blocks, ArrayList<TLRPC.Photo> photos, ArrayList<TLRPC.Document> documents, ArrayList<TLRPC.InputUser> users, boolean rtl, BaseFragment fragment)` -> `void`
- `prepareImportHistory(long dialogId, Uri uri, ArrayList<Uri> mediaUris, MessagesStorage.LongCallback onStartImport)` -> `void`
- `prepareImportStickers(String title, String shortName, String sofrware, ArrayList<ImportingSticker> paths, MessagesStorage.StringCallback onStartImport)` -> `void`
- `static prepareSendingArticle(AccountInstance accountInstance, ArrayList<TL_iv.PageBlock> blocks, boolean rtl, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, boolean notify, int scheduleDate, int scheduleRepeatPeriod, SendMessageChatArguments sendMessageChatArguments, long effectId, long monoForumPeerId, long payStars)` -> `void`
- `static prepareSendingArticle(AccountInstance accountInstance, ArrayList<TL_iv.PageBlock> blocks, ArrayList<TLRPC.Photo> photos, ArrayList<TLRPC.Document> documents, ArrayList<TLRPC.InputUser> users, boolean rtl, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, boolean notify, int scheduleDate, int scheduleRepeatPeriod, SendMessageChatArguments sendMessageChatArguments, long effectId, long monoForumPeerId, long payStars)` -> `void`
- `static prepareSendingAudioDocuments(AccountInstance accountInstance, ArrayList<MessageObject> messageObjects, CharSequence caption, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, boolean notify, int scheduleDate, int scheduledRepeatPeriod, MessageObject editingMessageObject, SendMessageChatArguments sendMessageChatArguments, long effectId, boolean invertMedia, long payStars)` -> `void`
- `static prepareSendingAudioDocuments(AccountInstance accountInstance, ArrayList<MessageObject> messageObjects, CharSequence caption, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, boolean notify, int scheduleDate, int scheduledRepeatPeriod, MessageObject editingMessageObject, SendMessageChatArguments sendMessageChatArguments, long effectId, boolean invertMedia, long payStars, PollSendParams pollSendParams, ArrayList<Integer> pollSendIndexes, boolean forcedPollDoNotSendFinal, Runnable afterCommandsDone)` -> `void`
- `static prepareSendingBotContextResult(BaseFragment fragment, AccountInstance accountInstance, TLRPC.BotInlineResult result, HashMap<String, String> params, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote quote, boolean notify, int scheduleDate, int scheduleRepeatPeriod, SendMessageChatArguments sendMessageChatArguments, long stars)` -> `void`
- `static prepareSendingBotContextResult(BaseFragment fragment, AccountInstance accountInstance, TLRPC.BotInlineResult result, HashMap<String, String> params, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote quote, boolean notify, int scheduleDate, int scheduleRepeatPeriod, SendMessageChatArguments sendMessageChatArguments, long stars, long monoForumPeerId)` -> `void`
- `static prepareSendingDocument(AccountInstance accountInstance, String path, String originalPath, Uri uri, String caption, String mine, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote quote, MessageObject editingMessageObject, boolean notify, int scheduleDate, InputContentInfoCompat inputContent, SendMessageChatArguments sendMessageChatArguments, boolean invertMedia)` -> `void`
- `static prepareSendingDocuments(AccountInstance accountInstance, ArrayList<String> paths, ArrayList<String> originalPaths, ArrayList<Uri> uris, String caption, String mime, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote quote, MessageObject editingMessageObject, boolean notify, int scheduleDate, InputContentInfoCompat inputContent, SendMessageChatArguments sendMessageChatArguments, long effectId, boolean invertMedia, long payStars)` -> `void`
- `static prepareSendingDocuments(AccountInstance accountInstance, ArrayList<String> paths, ArrayList<String> originalPaths, ArrayList<Uri> uris, CharSequence caption, String mime, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote quote, MessageObject editingMessageObject, boolean notify, int scheduleDate, InputContentInfoCompat inputContent, SendMessageChatArguments sendMessageChatArguments, long effectId, boolean invertMedia, long payStars)` -> `void`
- `static prepareSendingDocuments(AccountInstance accountInstance, ArrayList<String> paths, ArrayList<String> originalPaths, ArrayList<Uri> uris, String caption, ArrayList<TLRPC.MessageEntity> captionEntities, String mime, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote quote, MessageObject editingMessageObject, boolean notify, int scheduleDate, int scheduleRepeatPeriod, InputContentInfoCompat inputContent, SendMessageChatArguments sendMessageChatArguments, long effectId, boolean invertMedia, long payStars, long monoForumPeerId, MessageSuggestionParams suggestionParams)` -> `void`
- `static prepareSendingDocuments(AccountInstance accountInstance, ArrayList<String> paths, ArrayList<String> originalPaths, ArrayList<Uri> uris, String caption, ArrayList<TLRPC.MessageEntity> captionEntities, String mime, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote quote, MessageObject editingMessageObject, boolean notify, int scheduleDate, int scheduleRepeatPeriod, InputContentInfoCompat inputContent, SendMessageChatArguments sendMessageChatArguments, long effectId, boolean invertMedia, long payStars, long monoForumPeerId, MessageSuggestionParams suggestionParams, PollSendParams pollSendParams, ArrayList<Integer> pollSendIndexes, ArrayList<Integer> pollSendUriIndexes, boolean forcedPollDoNotSendFinal)` -> `void`
- `static prepareSendingMedia(AccountInstance accountInstance, ArrayList<SendingMediaInfo> media, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote quote, boolean forceDocument, boolean groupMedia, MessageObject editingMessageObject, boolean notify, int scheduleDate, int scheduleRepeatPeriod, int mode, boolean updateStikcersOrder, InputContentInfoCompat inputContent, SendMessageChatArguments sendMessageChatArguments, long effectId, boolean invertMedia, long payStars, long monoForumPeerId, MessageSuggestionParams suggestionParams)` -> `void`
- `static prepareSendingMedia(AccountInstance accountInstance, ArrayList<SendingMediaInfo> media, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote quote, boolean forceDocument, boolean groupMedia, MessageObject editingMessageObject, TLRPC.TL_inputPollAnswer pollToAddOptionMessageObject, boolean notify, int scheduleDate, int scheduleRepeatPeriod, int mode, boolean updateStikcersOrder, InputContentInfoCompat inputContent, SendMessageChatArguments sendMessageChatArguments, long effectId, boolean invertMedia, long payStars, long monoForumPeerId, MessageSuggestionParams suggestionParams)` -> `void`
- `static prepareSendingMedia(AccountInstance accountInstance, ArrayList<SendingMediaInfo> media, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote quote, boolean forceDocument, boolean groupMedia, MessageObject editingMessageObject, TLRPC.TL_inputPollAnswer pollToAddOptionMessageObject, boolean notify, int scheduleDate, int scheduleRepeatPeriod, int mode, boolean updateStikcersOrder, InputContentInfoCompat inputContent, SendMessageChatArguments sendMessageChatArguments, long effectId, boolean invertMedia, long payStars, long monoForumPeerId, MessageSuggestionParams suggestionParams, PollSendParams pollSendParams, boolean forcedPollDoNotSendFinal)` -> `void`
- `static prepareSendingPhoto(AccountInstance accountInstance, String imageFilePath, Uri imageUri, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, ChatActivity.ReplyQuote quote, CharSequence caption, ArrayList<TLRPC.MessageEntity> entities, ArrayList<TLRPC.InputDocument> stickers, InputContentInfoCompat inputContent, int ttl, MessageObject editingMessageObject, boolean notify, int scheduleDate, int mode, SendMessageChatArguments sendMessageChatArguments)` -> `void`
- `static prepareSendingPhoto(AccountInstance accountInstance, String imageFilePath, String thumbFilePath, Uri imageUri, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote quote, ArrayList<TLRPC.MessageEntity> entities, ArrayList<TLRPC.InputDocument> stickers, InputContentInfoCompat inputContent, int ttl, MessageObject editingMessageObject, VideoEditedInfo videoEditedInfo, boolean notify, int scheduleDate, int mode, boolean forceDocument, CharSequence caption, SendMessageChatArguments sendMessageChatArguments, long effectId, long payStars)` -> `void`
- `static prepareSendingPhoto(AccountInstance accountInstance, String imageFilePath, String thumbFilePath, Uri imageUri, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote quote, ArrayList<TLRPC.MessageEntity> entities, ArrayList<TLRPC.InputDocument> stickers, InputContentInfoCompat inputContent, int ttl, MessageObject editingMessageObject, VideoEditedInfo videoEditedInfo, boolean notify, int scheduleDate, int scheduleRepeatPeriod, int mode, boolean forceDocument, CharSequence caption, SendMessageChatArguments sendMessageChatArguments, long effectId, long payStars, long monoForumPeerId, MessageSuggestionParams suggestionParams)` -> `void`
- `static prepareSendingPoll(AccountInstance accountInstance, @NonNull PollSendParams pollSendParams, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote quote, boolean notify, int scheduleDate, SendMessageChatArguments sendMessageChatArguments, long payStars, long monoForumPeerId, MessageSuggestionParams suggestionParams)` -> `void`
- `static prepareSendingText(AccountInstance accountInstance, CharSequence text, long dialogId, boolean notify, int scheduleDate, int scheduleRepeatPeriod, long effectId)` -> `void`
- `static prepareSendingText(AccountInstance accountInstance, CharSequence text, long dialogId, long topicId, boolean notify, int scheduleDate, int scheduleRepeatPeriod, long effectId)` -> `void`
- `static prepareSendingVideo(AccountInstance accountInstance, String videoPath, VideoEditedInfo info, String coverPath, TLRPC.Photo coverPhoto, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote quote, ArrayList<TLRPC.MessageEntity> entities, int ttl, MessageObject editingMessageObject, boolean notify, int scheduleDate, int scheduleRepeatPeriod, boolean forceDocument, boolean hasMediaSpoilers, CharSequence caption, SendMessageChatArguments sendMessageChatArguments, long effectId, long stars)` -> `void`
- `static prepareSendingVideo(AccountInstance accountInstance, String videoPath, VideoEditedInfo info, String coverPath, TLRPC.Photo coverPhoto, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote quote, ArrayList<TLRPC.MessageEntity> entities, int ttl, MessageObject editingMessageObject, boolean notify, int scheduleDate, int scheduleRepeatPeriod, boolean forceDocument, boolean hasMediaSpoilers, CharSequence caption, SendMessageChatArguments sendMessageChatArguments, long effectId, long stars, long monoForumPeerId, MessageSuggestionParams suggestionParams)` -> `void`
- `static prepareSendingVideo(AccountInstance accountInstance, String videoPath, VideoEditedInfo info, String coverPath, TLRPC.Photo coverPhoto, long dialogId, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote quote, ArrayList<TLRPC.MessageEntity> entities, int ttl, MessageObject editingMessageObject, boolean notify, int scheduleDate, int scheduleRepeatPeriod, boolean forceDocument, boolean hasMediaSpoilers, CharSequence caption, SendMessageChatArguments sendMessageChatArguments, long effectId, long stars, long monoForumPeerId, MessageSuggestionParams suggestionParams, boolean invertMedia)` -> `void`
- `processForwardFromMyName(MessageObject messageObject, long did, long payStars, long monoForumPeerId, MessageSuggestionParams suggestionParams)` -> `void`
- `processSentMessage(int id)` -> `void`
- `processUnsentMessages(final ArrayList<TLRPC.Message> messages, final ArrayList<TLRPC.Message> scheduledMessages, final ArrayList<TLRPC.User> users, final ArrayList<TLRPC.Chat> chats, final ArrayList<TLRPC.EncryptedChat> encryptedChats)` -> `void`
- `putToSendingMessages(TLRPC.Message message, boolean scheduled)` -> `void`
- `putToSendingMessages(TLRPC.Message message, boolean scheduled, boolean notify)` -> `void`
- `putToUploadingMessages(MessageObject obj)` -> `void`
- `removeFromSendingMessages(int mid, boolean scheduled)` -> `TLRPC.Message`
- `removeFromUploadingMessages(int mid, boolean scheduled)` -> `void`
- `requestUrlAuth(String url, ChatActivity parentFragment, boolean ask)` -> `void`
- `retrySendMessage(MessageObject messageObject, boolean unsent, long payStars)` -> `boolean`
- `sendCallback(final boolean cache, final MessageObject messageObject, final TL_keyboard.KeyboardButtonProto button, final ChatActivity parentFragment)` -> `void`
- `sendCallback(final boolean cache, final MessageObject messageObject, final TL_keyboard.KeyboardButtonProto button, TLRPC.InputCheckPasswordSRP srp, TwoStepVerificationActivity passwordFragment, final ChatActivity parentFragment)` -> `void`
- `sendCurrentLocation(final MessageObject messageObject, final TL_keyboard.KeyboardButtonProto button)` -> `void`
- `sendGame(TLRPC.InputPeer peer, TLRPC.TL_inputMediaGame game, long random_id, final long taskId)` -> `void`
- `sendMessage(ArrayList<MessageObject> messages, final long peer, boolean forwardFromMyName, boolean hideCaption, boolean notify, int scheduleDate, long payStars)` -> `int`
- `sendMessage(ArrayList<MessageObject> messages, final long peer, boolean forwardFromMyName, boolean hideCaption, boolean notify, int scheduleDate, MessageObject replyToTopMsg, int video_timestamp, long payStars)` -> `int`
- `sendMessage(ArrayList<MessageObject> messages, final long peer, boolean forwardFromMyName, boolean hideCaption, boolean notify, int scheduleDate, int scheduleRepeatPeriod, MessageObject replyToTopMsg, int video_timestamp, long payStars, long monoForumPeerId, MessageSuggestionParams suggestionParams)` -> `int`
- `sendMessage(SendMessageParams sendMessageParams)` -> `void`
- `sendNotificationCallback(long dialogId, int msgId, byte[] data)` -> `void`
- `sendReaction(MessageObject messageObject, ArrayList<ReactionsLayoutInBubble.VisibleReaction> visibleReactions, ReactionsLayoutInBubble.VisibleReaction addedReaction, boolean big, boolean addToRecent, BaseFragment parentFragment, Runnable callback)` -> `void`
- `sendScreenshotMessage(TLRPC.User user, int messageId, TLRPC.Message resendMessage)` -> `void`
- `sendSticker(TLRPC.Document document, String query, long peer, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote quote, MessageObject.SendAnimationData sendAnimationData, boolean notify, int scheduleDate, int scheduleRepeatPeriod, boolean updateStickersOrder, Object parentObject, SendMessageChatArguments sendMessageChatArguments, long stars, long monoForumPeerId, MessageSuggestionParams suggestionParams)` -> `void`
- `sendSticker(TLRPC.Document document, String query, long peer, CharSequence caption, VideoEditedInfo videoEditedInfo, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote quote, MessageObject.SendAnimationData sendAnimationData, boolean notify, int scheduleDate, int scheduleRepeatPeriod, boolean updateStickersOrder, Object parentObject, SendMessageChatArguments sendMessageChatArguments, long stars, long monoForumPeerId, MessageSuggestionParams suggestionParams)` -> `void`
- `sendSticker(TLRPC.Document document, String query, long peer, CharSequence caption, VideoEditedInfo videoEditedInfo, MessageObject replyToMsg, MessageObject replyToTopMsg, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote quote, MessageObject.SendAnimationData sendAnimationData, boolean notify, int scheduleDate, int scheduleRepeatPeriod, boolean updateStickersOrder, Object parentObject, SendMessageChatArguments sendMessageChatArguments, long stars, long monoForumPeerId, MessageSuggestionParams suggestionParams, boolean invertMedia)` -> `void`
- `sendVote(final MessageObject messageObject, final ArrayList<TLRPC.PollAnswer> answers, final Runnable finishRunnable)` -> `int`
- `static shouldSendWebPAsSticker(String path, Uri uri)` -> `boolean`
- `static toInputPageBlock(TL_iv.PageBlock block)` -> `TL_iv.PageBlock`
- `toggleTodo(final long send_as, final MessageObject messageObject, final TLRPC.TodoItem task, final boolean enabled, final Runnable finishRunnable)` -> `int`
- `updateSendingGramTransferComment(MessageObject object, String comment, boolean encrypted)` -> `void`

## `org.telegram.messenger.SendMessagesHelper$DelayedMessage`
- `addDelayedRequest(final TLObject req, final MessageObject msgObj, final String originalPath, Object parentObject, DelayedMessage delayedMessage, boolean scheduled)` -> `void`
- `addDelayedRequest(final TLObject req, final ArrayList<MessageObject> msgObjs, final ArrayList<String> originalPaths, ArrayList<Object> parentObjects, DelayedMessage delayedMessage, boolean scheduled)` -> `void`
- `getRetriedToSend(int index)` -> `boolean`
- `initForGroup(long id)` -> `void`
- `markAsError()` -> `void`
- `sendDelayedRequests()` -> `void`
- `setRetriedToSend(int index, boolean value)` -> `void`

## `org.telegram.messenger.SendMessagesHelper$LocationProvider`
- `setDelegate(LocationProviderDelegate locationProviderDelegate)` -> `void`
- `start()` -> `void`
- `stop()` -> `void`

## `org.telegram.messenger.SendMessagesHelper$LocationProvider$GpsLocationListener`
- `onLocationChanged(Location location)` -> `void`
- `onProviderDisabled(String provider)` -> `void`
- `onProviderEnabled(String provider)` -> `void`
- `onStatusChanged(String provider, int status, Bundle extras)` -> `void`

## `org.telegram.messenger.SendMessagesHelper$SendMessageParams`
- `static of(String string, long dialogId)` -> `SendMessageParams`
- `static of(MessageObject retryMessageObject)` -> `SendMessageParams`
- `static of(TLRPC.User user, long peer, MessageObject replyToMsg, MessageObject replyToTopMsg, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> params, boolean notify, int scheduleDate, int scheduleRepeatPeriod)` -> `SendMessageParams`
- `static of(TLRPC.TL_messageMediaInvoice invoice, long peer, MessageObject replyToMsg, MessageObject replyToTopMsg, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> params, boolean notify, int scheduleDate, int scheduleRepeatPeriod)` -> `SendMessageParams`
- `static of(TLRPC.TL_document document, VideoEditedInfo videoEditedInfo, String path, long peer, MessageObject replyToMsg, MessageObject replyToTopMsg, String caption, ArrayList<TLRPC.MessageEntity> entities, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> params, boolean notify, int scheduleDate, int scheduleRepeatPeriod, int ttl, Object parentObject, MessageObject.SendAnimationData sendAnimationData, boolean updateStickersOrder)` -> `SendMessageParams`
- `static of(TLRPC.TL_document document, VideoEditedInfo videoEditedInfo, String path, long peer, MessageObject replyToMsg, MessageObject replyToTopMsg, String caption, ArrayList<TLRPC.MessageEntity> entities, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> params, boolean notify, int scheduleDate, int scheduleRepeatPeriod, int ttl, Object parentObject, MessageObject.SendAnimationData sendAnimationData, boolean updateStickersOrder, boolean hasMediaSpoilers)` -> `SendMessageParams`
- `static of(String message, long peer, MessageObject replyToMsg, MessageObject replyToTopMsg, TLRPC.WebPage webPage, boolean searchLinks, ArrayList<TLRPC.MessageEntity> entities, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> params, boolean notify, int scheduleDate, int scheduleRepeatPeriod, MessageObject.SendAnimationData sendAnimationData, boolean updateStickersOrder)` -> `SendMessageParams`
- `static of(TLRPC.MessageMedia location, long peer, MessageObject replyToMsg, MessageObject replyToTopMsg, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> params, boolean notify, int scheduleDate, int scheduleRepeatPeriod)` -> `SendMessageParams`
- `static of(TLRPC.TL_messageMediaPoll poll, long peer, MessageObject replyToMsg, MessageObject replyToTopMsg, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> params, boolean notify, int scheduleDate, int scheduleRepeatPeriod)` -> `SendMessageParams`
- `static of(TLRPC.TL_game game, long peer, MessageObject replyToMsg, MessageObject replyToTopMsg, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> params, boolean notify, int scheduleDate, int scheduleRepeatPeriod)` -> `SendMessageParams`
- `static of(TLRPC.TL_photo photo, String path, long peer, MessageObject replyToMsg, MessageObject replyToTopMsg, String caption, ArrayList<TLRPC.MessageEntity> entities, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> params, boolean notify, int scheduleDate, int scheduleRepeatPeriod, int ttl, Object parentObject, boolean updateStickersOrder, boolean hasMediaSpoilers)` -> `SendMessageParams`
- `static of(TLRPC.TL_photo photo, String path, long peer, MessageObject replyToMsg, MessageObject replyToTopMsg, String caption, ArrayList<TLRPC.MessageEntity> entities, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> params, boolean notify, int scheduleDate, int scheduleRepeatPeriod, int ttl, Object parentObject, boolean updateStickersOrder)` -> `SendMessageParams`
- `static of(String message, String caption, TLRPC.MessageMedia location, TLRPC.TL_photo photo, VideoEditedInfo videoEditedInfo, TLRPC.User user, TLRPC.TL_document document, TLRPC.TL_game game, TLRPC.TL_messageMediaPoll poll, TLRPC.TL_messageMediaInvoice invoice, long peer, String path, MessageObject replyToMsg, MessageObject replyToTopMsg, TLRPC.WebPage webPage, boolean searchLinks, MessageObject retryMessageObject, ArrayList<TLRPC.MessageEntity> entities, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> messageParams, boolean notify, int scheduleDate, int scheduleRepeatPeriod, int ttl, Object parentObject, MessageObject.SendAnimationData sendAnimationData, boolean updateStickersOrder, boolean hasMediaSpoilers)` -> `SendMessageParams`
- `static ofRichMessage(TL_iv.RichMessage richMessage, long peer, MessageObject replyToMsg, MessageObject replyToTopMsg, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> params, boolean notify, int scheduleDate, int scheduleRepeatPeriod)` -> `SendMessageParams`

## `org.telegram.messenger.ShareBroadcastReceiver`
- `onReceive(Context context, Intent intent)` -> `void`

## `org.telegram.messenger.SharedPrefsHelper`
- `static cleanupAccount(int account)` -> `void`
- `static getWebViewBotsPrefs()` -> `SharedPreferences`
- `static init(Context ctx)` -> `void`
- `static isWebViewConfirmShown(int currentAccount, long botId)` -> `boolean`
- `static setWebViewConfirmShown(int currentAccount, long botId, boolean shown)` -> `void`

## `org.telegram.messenger.ShortcutResultReceiver`
- `onReceive(Context context, Intent intent)` -> `void`

## `org.telegram.messenger.SmsReceiver`
- `onReceive(Context context, Intent intent)` -> `void`

## `org.telegram.messenger.StatsController`
- `getCallsTotalTime(int networkType)` -> `int`
- `static getInstance(int num)` -> `StatsController`
- `getReceivedBytesCount(int networkType, int dataType)` -> `long`
- `getRecivedItemsCount(int networkType, int dataType)` -> `int`
- `getResetStatsDate(int networkType)` -> `long`
- `getSentBytesCount(int networkType, int dataType)` -> `long`
- `getSentItemsCount(int networkType, int dataType)` -> `int`
- `incrementReceivedBytesCount(int networkType, int dataType, long value)` -> `void`
- `incrementReceivedItemsCount(int networkType, int dataType, int value)` -> `void`
- `incrementSentBytesCount(int networkType, int dataType, long value)` -> `void`
- `incrementSentItemsCount(int networkType, int dataType, int value)` -> `void`
- `incrementTotalCallsTime(int networkType, int value)` -> `void`
- `resetStats(int networkType)` -> `void`

## `org.telegram.messenger.StopLiveLocationReceiver`
- `onReceive(Context context, Intent intent)` -> `void`

## `org.telegram.messenger.SvgHelper`
- `static decompress(byte[] encoded)` -> `String`
- `static doPath(String s)` -> `Path`
- `static getBitmap(int res, int width, int height, int color)` -> `Bitmap`
- `static getBitmap(int res, int width, int height, int color, float scale)` -> `Bitmap`
- `static getBitmap(int res, int width, int height, int color, float scale, ScaleMode scaleMode)` -> `Bitmap`
- `static getBitmap(InputStream stream, int width, int height, boolean white)` -> `Bitmap`
- `static getBitmap(File file, int width, int height, boolean white)` -> `Bitmap`
- `static getBitmap(File file, int width, int height, boolean white, ScaleMode scaleMode)` -> `Bitmap`
- `static getBitmap(String xml, int width, int height, boolean white)` -> `Bitmap`
- `static getDrawable(String xml)` -> `SvgDrawable`
- `static getDrawable(int resId, Integer color)` -> `SvgDrawable`
- `static getDrawableByPath(String pathString, int w, int h)` -> `SvgDrawable`
- `static getDrawableByPath(Path path, int w, int h)` -> `SvgDrawable`
- `static getSvgBitmap(File file, int width, int height, boolean white)` -> `SvgResult`
- `static parseTransform(String s)` -> `Matrix`

## `org.telegram.messenger.SvgHelper$NumberParse`
- `getNextCmd()` -> `int`
- `getNumber(int index)` -> `float`

## `org.telegram.messenger.SvgHelper$ParserHelper`
- `advance()` -> `void`
- `buildFloat(int mant, int exp)` -> `float`
- `nextFloat()` -> `float`
- `parseFloat()` -> `float`
- `skipNumberSeparator()` -> `void`
- `skipWhitespace()` -> `void`

## `org.telegram.messenger.SvgHelper$Properties`
- `getAttr(String name)` -> `String`
- `getFloat(String name, float defaultValue)` -> `Float`
- `getFloat(String name)` -> `Float`
- `getHex(String name)` -> `Integer`
- `getString(String name)` -> `String`

## `org.telegram.messenger.SvgHelper$SVGHandler`
- `characters(char[] ch, int start, int length)` -> `void`
- `endDocument()` -> `void`
- `endElement(String namespaceURI, String localName, String qName)` -> `void`
- `getBitmap()` -> `Bitmap`
- `getDrawable()` -> `SvgDrawable`
- `getGiftPatternPositions()` -> `List<WallpaperGiftPatternPosition>`
- `startDocument()` -> `void`
- `startElement(String namespaceURI, String localName, String qName, Attributes atts)` -> `void`

## `org.telegram.messenger.SvgHelper$StyleSet`
- `getStyle(String name)` -> `String`

## `org.telegram.messenger.TelegramMediaSession`
- `buildRootHints()` -> `Bundle`
- `ensureLoaded(Runnable onLoaded)` -> `void`
- `getAvailableActions()` -> `long`
- `getCurrentAccount()` -> `int`
- `getFrameworkSessionToken()` -> `android.media.session.MediaSession.Token`
- `static getInstance(Context context)` -> `TelegramMediaSession`
- `getMusicChat(long chatId)` -> `TLRPC.Chat`
- `getMusicDialogs()` -> `ArrayList<Long>`
- `getMusicDialogsSortedByVisibleOrder()` -> `ArrayList<Long>`
- `getMusicMessages(long dialogId)` -> `ArrayList<MessageObject>`
- `getMusicUser(long userId)` -> `TLRPC.User`
- `getRoundedAvatar(File path)` -> `Bitmap`
- `getSession()` -> `MediaSessionCompat`
- `getSessionToken()` -> `MediaSessionCompat.Token`
- `isChatsLoaded()` -> `boolean`
- `isPasscodeLocked()` -> `boolean`
- `loadBrowseChildren(String parentMediaId, BrowseChildrenCallback callback)` -> `void`
- `static peekInstance()` -> `TelegramMediaSession`
- `publishMetadata(MessageObject messageObject, @Nullable AudioInfo audioInfo, @Nullable Bitmap albumArt)` -> `void`
- `publishPlaybackState(PlaybackStateCompat state)` -> `void`
- `release()` -> `void`
- `updateRepeatMode()` -> `void`
- `updateShuffleMode()` -> `void`

## `org.telegram.messenger.TelegramQRCodeWriter`
- `encode(String contents, int width, int height, Map<EncodeHintType, ?> hints, Bitmap bitmap)` -> `Bitmap`
- `encode(String contents, int width, int height, Map<EncodeHintType, ?> hints, Bitmap bitmap, float radiusFactor, int backgroundColor, int color)` -> `Bitmap`
- `getImageSize()` -> `int`
- `getSideSize()` -> `int`

## `org.telegram.messenger.Timer`
- `static create(String name)` -> `Timer`
- `static done(Task task)` -> `void`
- `static finish(Timer logger)` -> `void`
- `static log(Timer logger, String log)` -> `void`
- `static start(Timer logger, String task)` -> `Task`

## `org.telegram.messenger.Timer$Log`
- `toString()` -> `String`

## `org.telegram.messenger.Timer$Task`
- `toString()` -> `String`

## `org.telegram.messenger.TopicsController`
- `applyPinnedOrder(long chatId, ArrayList<Integer> order)` -> `void`
- `applyPinnedOrder(long chatId, ArrayList<Integer> order, boolean notify)` -> `void`
- `static calculateHashSavedDialogs(ArrayList<TLRPC.TL_forumTopic> topics, int start, int limit)` -> `long`
- `clearLoadingOffset(long chatId)` -> `void`
- `databaseCleared()` -> `void`
- `deleteTopics(long chatId, ArrayList<Integer> topicIds)` -> `void`
- `endIsReached(long chatId)` -> `boolean`
- `findTopic(long chatId, long topicId)` -> `TLRPC.TL_forumTopic`
- `getCurrentPinnedOrder(long chatId)` -> `ArrayList<Integer>`
- `getForumUnreadCount(long chatId)` -> `int[]`
- `getLoadOffset(long chatId)` -> `TopicsLoadOffset`
- `getTopicIconName(TLRPC.Chat chat, MessageObject message, TextPaint paint, Drawable[] drawableToSet)` -> `CharSequence`
- `getTopicName(TLRPC.Chat chat, MessageObject message)` -> `String`
- `getTopicRepliesCount(long dialogId, long topicId)` -> `void`
- `getTopics(long chatId)` -> `ArrayList<TLRPC.TL_forumTopic>`
- `getTopicsCount(long chatId)` -> `int`
- `isLoading(long chatId)` -> `boolean`
- `loadTopic(long chatId, long topicId, Runnable runnable)` -> `void`
- `loadTopics(long chatId)` -> `void`
- `loadTopics(long chatId, boolean fromCache, int loadType)` -> `void`
- `markAllPollVotesAsRead(long chatId, long topicId)` -> `void`
- `markAllPollVotesAsRead(long chatId)` -> `void`
- `markAllReactionsAsRead(long chatId, long topicId)` -> `void`
- `markAllReactionsAsRead(long chatId)` -> `void`
- `onTopicCreated(long dialogId, TLRPC.TL_forumTopic forumTopic, boolean saveInDatabase)` -> `void`
- `onTopicEdited(long dialogId, TLRPC.TL_forumTopic forumTopic)` -> `void`
- `onTopicFragmentPause(long chatId)` -> `void`
- `onTopicFragmentResume(long chatId)` -> `void`
- `onTopicsDeletedServerSide(long chatId, long topicId)` -> `void`
- `onTopicsDeletedServerSide(ArrayList<MessagesStorage.TopicKey> topicsToDelete)` -> `void`
- `pinTopic(long chatId, int topicId, boolean pin, BaseFragment fragment)` -> `void`
- `preloadTopics(long chatId)` -> `void`
- `processEditedMessage(TLRPC.Message newMsg)` -> `void`
- `processEditedMessages(LongSparseArray<ArrayList<MessageObject>> editingMessagesFinal)` -> `void`
- `processTopics(long chatId, ArrayList<TLRPC.TL_forumTopic> newTopics, LongSparseArray<TLRPC.Message> messagesMap, boolean fromCache, int loadType, int totalCount)` -> `void`
- `processUpdate(List<TopicUpdate> topicUpdates)` -> `void`
- `reloadTopics(long chatId, ArrayList<TLRPC.TL_forumTopic> topicsToReload, Runnable callback)` -> `void`
- `reloadTopics(long chatId)` -> `void`
- `reloadTopics(long chatId, boolean fromCache)` -> `void`
- `reorderPinnedTopics(long chatId, ArrayList<Integer> topics)` -> `void`
- `saveLoadOffset(long chatId, int lastMessageId, int lastMessageDate, long lastTopicId)` -> `void`
- `saveTopics(long chatId)` -> `void`
- `sortTopics(long chatId, boolean notify)` -> `void`
- `toggleCloseTopic(long chatId, int topicId, boolean close)` -> `void`
- `toggleShowTopic(long chatId, int topicId, boolean show)` -> `void`
- `toggleViewForumAsMessages(long channelId, boolean enabled)` -> `void`
- `updateMaxReadId(long chatId, long topicId, int readMaxId, int unreadCount, int mentionsUnread)` -> `void`
- `updateMentionsUnread(long dialogId, long topicId, int topicMentionsCount)` -> `void`
- `updatePollVotesUnread(long dialogId, long topicId, int count, boolean increment)` -> `int`
- `updateReactionsUnread(long dialogId, long topicId, int count, boolean increment)` -> `int`
- `updateReadOutbox(HashMap<MessagesStorage.TopicKey, Integer> topicsReadOutbox)` -> `void`
- `updateTopicsWithDeletedMessages(long dialogId, ArrayList<Integer> messages)` -> `void`

## `org.telegram.messenger.TranslateController`
- `static analyzeSuggestedLanguageCodes()` -> `void`
- `canTranslatePhoto(MessageObject messageObject, String detectedLanguage)` -> `boolean`
- `canTranslateStory(TL_stories.StoryItem storyItem)` -> `boolean`
- `cancelAllTranslations()` -> `void`
- `cancelTranslations(long dialogId)` -> `void`
- `checkDialogMessage(long dialogId)` -> `void`
- `checkDialogMessageSure(long dialogId)` -> `void`
- `checkRestrictedLanguagesUpdate()` -> `void`
- `checkTranslation(MessageObject messageObject, boolean onScreen)` -> `void`
- `cleanup()` -> `void`
- `static currentLanguage()` -> `String`
- `detectPhotoLanguage(MessageObject messageObject, Utilities.Callback<String> done)` -> `void`
- `detectStoryLanguage(TL_stories.StoryItem storyItem)` -> `void`
- `findReplyMessageObject(long dialogId, int messageId)` -> `MessageObject`
- `getDialogDetectedLanguage(long dialogId)` -> `String`
- `getDialogTranslateTo(long dialogId)` -> `String`
- `static getLanguages()` -> `ArrayList<Language>`
- `static getLocales()` -> `ArrayList<LocaleController.LocaleInfo>`
- `static getSuggestedLanguages(String except)` -> `ArrayList<Language>`
- `isChatTranslateEnabled()` -> `boolean`
- `isContextTranslateEnabled()` -> `boolean`
- `isDialogTranslatable(long dialogId)` -> `boolean`
- `isFeatureAvailable()` -> `boolean`
- `isFeatureAvailable(long dialogId)` -> `boolean`
- `static isSummarizable(MessageObject messageObject)` -> `boolean`
- `static isTranslatable(MessageObject messageObject)` -> `boolean`
- `isTranslateDialogHidden(long dialogId)` -> `boolean`
- `isTranslating(MessageObject messageObject)` -> `boolean`
- `isTranslating(MessageObject messageObject, MessageObject.GroupedMessages group)` -> `boolean`
- `isTranslatingDialog(long dialogId)` -> `boolean`
- `isTranslatingStory(TL_stories.StoryItem storyItem)` -> `boolean`
- `static normalizeLanguage(String lng)` -> `String`
- `reset()` -> `void`
- `setChatTranslateEnabled(boolean enable)` -> `void`
- `setContextTranslateEnabled(boolean enable)` -> `void`
- `setDialogTranslateTo(long dialogId, String language)` -> `void`
- `setHideTranslateDialog(long dialogId, boolean hide)` -> `void`
- `setHideTranslateDialog(long dialogId, boolean hide, boolean doNotNotify)` -> `void`
- `toggleTranslatingDialog(long dialogId)` -> `void`
- `toggleTranslatingDialog(long dialogId, boolean value)` -> `boolean`
- `translatePhoto(MessageObject messageObject, Runnable done)` -> `void`
- `translateStory(TL_stories.StoryItem storyItem, Runnable done)` -> `void`
- `updateDialogFull(long dialogId)` -> `void`

## `org.telegram.messenger.TranslateController$PollText`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `PollText`
- `static fromMessage(MessageObject messageObject)` -> `PollText`
- `static fromPoll(TLRPC.TL_messageMediaPoll mediaPoll)` -> `PollText`
- `static isFullyTranslated(MessageObject messageObject, PollText b)` -> `boolean`
- `length()` -> `int`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.messenger.UserConfig`
- `checkSavedPassword()` -> `void`
- `clearConfig()` -> `void`
- `clearFilters()` -> `void`
- `clearPinnedDialogsLoaded()` -> `void`
- `static getActivatedAccountsCount()` -> `int`
- `getClientPhone()` -> `String`
- `getClientUserId()` -> `long`
- `getCurrentUser()` -> `TLRPC.User`
- `getDialogLoadOffsets(int folderId)` -> `long[]`
- `getEmojiStatus()` -> `Long`
- `getGlobalTTl()` -> `int`
- `static getInstance(int num)` -> `UserConfig`
- `static getMaxAccountCount()` -> `int`
- `getNewMessageId()` -> `int`
- `getPreferences()` -> `SharedPreferences`
- `static getProductionAccount()` -> `int`
- `getSaveGalleryExceptions(int type)` -> `LongSparseArray<SaveToGallerySettingsHelper.DialogException>`
- `getTotalDialogsCount(int folderId)` -> `int`
- `static hasPremiumOnAccounts()` -> `boolean`
- `isClientActivated()` -> `boolean`
- `isConfigLoaded()` -> `boolean`
- `isPinnedDialogsLoaded(int folderId)` -> `boolean`
- `isPremium()` -> `boolean`
- `static isValidAccount(int num)` -> `boolean`
- `loadGlobalTTl()` -> `void`
- `resetSavedPassword()` -> `void`
- `saveConfig(boolean withFile)` -> `void`
- `savePassword(byte[] hash, byte[] salted)` -> `void`
- `setCurrentUser(TLRPC.User user)` -> `void`
- `setDialogsLoadOffset(int folderId, int dialogsLoadOffsetId, int dialogsLoadOffsetDate, long dialogsLoadOffsetUserId, long dialogsLoadOffsetChatId, long dialogsLoadOffsetChannelId, long dialogsLoadOffsetAccess)` -> `void`
- `setGlobalTtl(int ttl)` -> `void`
- `setPinnedDialogsLoaded(int folderId, boolean loaded)` -> `void`
- `setShowCallsTab(boolean show)` -> `void`
- `setTotalDialogsCount(int folderId, int totalDialogsLoadCount)` -> `void`
- `updateSaveGalleryExceptions(int type, LongSparseArray<SaveToGallerySettingsHelper.DialogException> exceptions)` -> `void`

## `org.telegram.messenger.UserNameResolver`
- `resolve(String username, Utilities.Callback<Long> resolveConsumer)` -> `Runnable`
- `resolve(String username, String referrer, Utilities.Callback<Long> resolveConsumer)` -> `Runnable`
- `resolve(String username, String referrer, boolean force, Utilities.Callback<Long> resolveConsumer)` -> `Runnable`
- `update(TLRPC.User oldUser, TLRPC.User user)` -> `void`
- `update(TLRPC.Chat oldChat, TLRPC.Chat chat)` -> `void`

## `org.telegram.messenger.UserObject`
- `static applyRequirementToContact(TLRPC.User user, TL_account.RequirementToContact value)` -> `boolean`
- `static applyRequirementToContact(TLRPC.UserFull userFull, TL_account.RequirementToContact value)` -> `boolean`
- `static areGiftsDisabled(long userId)` -> `boolean`
- `static areGiftsDisabled(TLRPC.UserFull userFull)` -> `boolean`
- `static eq(TL_account.RequirementToContact a, TL_account.RequirementToContact b)` -> `boolean`
- `static getBotStatus(TLRPC.User user)` -> `String`
- `static getColorId(TLRPC.User user)` -> `int`
- `static getEmojiId(TLRPC.User user)` -> `long`
- `static getEmojiStatusDocumentId(TLRPC.User user)` -> `Long`
- `static getEmojiStatusDocumentId(TLRPC.EmojiStatus emojiStatus)` -> `Long`
- `static getFirstName(TLRPC.User user)` -> `String`
- `static getFirstName(TLRPC.User user, boolean allowShort)` -> `String`
- `static getForcedFirstName(TLRPC.User user)` -> `String`
- `static getOnlyProfileEmojiId(TLRPC.User user)` -> `long`
- `static getPeerColorForAvatar(int currentAccount, TLRPC.User user)` -> `MessagesController.PeerColor`
- `static getPhoto(TLRPC.User user)` -> `TLRPC.UserProfilePhoto`
- `static getProfileCollectibleId(TLRPC.User user)` -> `long`
- `static getProfileColorId(TLRPC.User user)` -> `int`
- `static getProfileEmojiId(TLRPC.User user)` -> `long`
- `static getPublicUsername(TLRPC.User user, boolean editable)` -> `String`
- `static getPublicUsername(TLRPC.User user)` -> `String`
- `static getRequirementToContact(TLRPC.User user)` -> `TL_account.RequirementToContact`
- `static getRequirementToContact(TLRPC.UserFull user)` -> `TL_account.RequirementToContact`
- `static getUserName(TLRPC.User user)` -> `String`
- `static hasFallbackPhoto(TLRPC.UserFull userInfo)` -> `boolean`
- `static hasPhoto(TLRPC.User user)` -> `boolean`
- `static hasPublicUsername(TLRPC.User user, String username)` -> `boolean`
- `static isAnonymous(TLRPC.User user)` -> `boolean`
- `static isBot(TLRPC.User user)` -> `boolean`
- `static isBotForum(int currentAccount, long userId)` -> `boolean`
- `static isBotForum(TLRPC.User user)` -> `boolean`
- `static isBotForumWithEditableTopics(int currentAccount, long userId)` -> `boolean`
- `static isBotForumWithEditableTopics(TLRPC.User user)` -> `boolean`
- `static isContact(TLRPC.User user)` -> `boolean`
- `static isDeleted(TLRPC.User user)` -> `boolean`
- `static isReplyUser(TLRPC.User user)` -> `boolean`
- `static isReplyUser(long did)` -> `boolean`
- `static isService(long user_id)` -> `boolean`
- `static isUserSelf(TLRPC.User user)` -> `boolean`

## `org.telegram.messenger.Utilities`
- `static MD5(String md5)` -> `String`
- `static SHA256(String x)` -> `String`
- `static aesCbcEncryptionByteArraySafe(byte[] buffer, byte[] key, byte[] iv, int offset, int length, int n, int encrypt)` -> `void`
- `static aesIgeEncryption(ByteBuffer buffer, byte[] key, byte[] iv, boolean encrypt, boolean changeIv, int offset, int length)` -> `void`
- `static aesIgeEncryptionByteArray(byte[] buffer, byte[] key, byte[] iv, boolean encrypt, boolean changeIv, int offset, int length)` -> `void`
- `static arraysEquals(byte[] arr1, int offset1, byte[] arr2, int offset2)` -> `boolean`
- `static blurWallpaper(Bitmap src)` -> `Bitmap`
- `static bytesToHex(byte[] bytes)` -> `String`
- `static bytesToInt(byte[] bytes)` -> `int`
- `static bytesToLong(byte[] bytes)` -> `long`
- `static clamp(int value, int maxValue, int minValue)` -> `int`
- `static clamp(long value, long maxValue, long minValue)` -> `long`
- `static clamp(float value, float maxValue, float minValue)` -> `float`
- `static clamp(double value, double maxValue, double minValue)` -> `double`
- `static clamp01(float value)` -> `float`
- `static computePBKDF2(byte[] password, byte[] salt)` -> `byte[]`
- `static computeSHA1(byte[] convertme, int offset, int len)` -> `byte[]`
- `static computeSHA1(ByteBuffer convertme, int offset, int len)` -> `byte[]`
- `static computeSHA1(ByteBuffer convertme)` -> `byte[]`
- `static computeSHA1(byte[] convertme)` -> `byte[]`
- `static computeSHA256(byte[] convertme)` -> `byte[]`
- `static computeSHA256(byte[] convertme, int offset, long len)` -> `byte[]`
- `static computeSHA256(byte[]... args)` -> `byte[]`
- `static computeSHA256(byte[] b1, int o1, int l1, ByteBuffer b2, int o2, int l2)` -> `byte[]`
- `static computeSHA512(byte[] convertme)` -> `byte[]`
- `static computeSHA512(byte[] convertme, byte[] convertme2)` -> `byte[]`
- `static computeSHA512(byte[] convertme, byte[] convertme2, byte[] convertme3)` -> `byte[]`
- `static dist(float x1, float y1, float x2, float y2)` -> `float`
- `static divCeil(int a, int b)` -> `int`
- `static doCallbacks(Utilities.Callback<Runnable> ...actions)` -> `void`
- `static generateRandomString()` -> `String`
- `static generateRandomString(int chars)` -> `String`
- `static getExtension(String fileName)` -> `String`
- `static getOrCreatePlayerQueue()` -> `DispatchQueue`
- `static getOrDefault(HashMap<Key, Value> map, Key key, Value defaultValue)` -> `Value`
- `static hexToBytes(String hex)` -> `byte[]`
- `static intToBytes(int value)` -> `byte[]`
- `static isGoodGaAndGb(BigInteger g_a, BigInteger p)` -> `boolean`
- `static isGoodPrime(byte[] prime, int g)` -> `boolean`
- `static isNullOrEmpty(final Collection<?> list)` -> `boolean`
- `static libyuvARGBSaleBitmap(Bitmap src, Bitmap dst, libyuv_ScaleFilter mode)` -> `boolean`
- `static parseInt(CharSequence value)` -> `Integer`
- `static parseIntToString(String value)` -> `String`
- `static parseLong(String value)` -> `Long`
- `static raceCallbacks(Runnable onFinish, Utilities.Callback<Runnable> ...actions)` -> `void`
- `static swapItems(List<T> list, int index1, int index2)` -> `void`
- `static tryParseLong(String str, long defaultValue)` -> `long`
- `static uriParseSafe(String link)` -> `Uri`

## `org.telegram.messenger.VideoEditedInfo`
- `canAutoPlaySourceVideo()` -> `boolean`
- `getString()` -> `String`
- `needConvert()` -> `boolean`
- `parseString(String string)` -> `boolean`

## `org.telegram.messenger.VideoEditedInfo$MediaEntity`
- `copy()` -> `MediaEntity`
- `serializeTo(AbstractSerializedData data, boolean full)` -> `void`

## `org.telegram.messenger.VideoEditedInfo$Part`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`
- `static toParts(StoryEntry collageEntry)` -> `ArrayList<Part>`
- `static toStoryEntries(ArrayList<Part> parts)` -> `ArrayList<StoryEntry>`

## `org.telegram.messenger.VideoEncodingService`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static isRunning()` -> `boolean`
- `onBind(Intent arg2)` -> `IBinder`
- `onDestroy()` -> `void`
- `onStartCommand(Intent intent, int flags, int startId)` -> `int`
- `static start(boolean cancelled)` -> `void`
- `static stop()` -> `void`

## `org.telegram.messenger.WearReplyReceiver`
- `onReceive(Context context, Intent intent)` -> `void`

## `org.telegram.messenger.WebFile`
- `static createWithGeoPoint(TLRPC.GeoPoint point, int w, int h, int zoom, int scale)` -> `WebFile`
- `static createWithGeoPoint(double lat, double _long, long access_hash, int w, int h, int zoom, int scale)` -> `WebFile`
- `static createWithWebDocument(TLRPC.WebDocument webDocument)` -> `WebFile`

## `org.telegram.messenger.XiaomiUtilities`
- `static getMIUIMajorVersion()` -> `int`
- `static getPermissionManagerIntent()` -> `Intent`
- `static isCustomPermissionGranted(int permission)` -> `boolean`
- `static isMIUI()` -> `boolean`

## `org.telegram.messenger.browser.Browser`
- `static IDN_toUnicode(String host)` -> `String`
- `static extractUsername(String link)` -> `String`
- `static getBrowserPackageName(String browser)` -> `String`
- `static hasAppToOpen(Context context, String url)` -> `boolean`
- `static isBrowserPackageName(String name)` -> `boolean`
- `static isInternalUri(Uri uri, boolean[] forceBrowser)` -> `boolean`
- `static isInternalUri(Uri uri, boolean all, boolean[] forceBrowser)` -> `boolean`
- `static isInternalUrl(String url, boolean[] forceBrowser)` -> `boolean`
- `static isInternalUrl(String url, boolean all, boolean[] forceBrowser)` -> `boolean`
- `static isPassportUrl(String url)` -> `boolean`
- `static isPunycodeAllowed(String host)` -> `boolean`
- `static isTMe(String url)` -> `boolean`
- `static isTelegraphUrl(String url, boolean equals)` -> `boolean`
- `static isTelegraphUrl(String url, boolean equals, boolean forceHttps)` -> `boolean`
- `static isTonsite(String url)` -> `boolean`
- `static isTonsitePunycode(String url)` -> `boolean`
- `static openAsInternalIntent(Context context, String url)` -> `boolean`
- `static openAsInternalIntent(Context context, String url, Browser.Progress progress)` -> `boolean`
- `static openAsInternalIntent(Context context, String url, boolean forceNotInternalForApps)` -> `boolean`
- `static openAsInternalIntent(Context context, String url, boolean forceNotInternalForApps, boolean forceRequest, Progress progress)` -> `boolean`
- `static openInExternalApp(Context context, String url, boolean allowIntent)` -> `boolean`
- `static openInExternalBrowser(Context context, String url, boolean allowIntent)` -> `boolean`
- `static openInExternalBrowser(Context context, String url, boolean allowIntent, String browser)` -> `boolean`
- `static openInTelegramBrowser(Context context, String url, Browser.Progress progress)` -> `boolean`
- `static openUrl(Context context, String url)` -> `void`
- `static openUrl(Context context, Uri uri)` -> `void`
- `static openUrl(Context context, String url, boolean allowCustom)` -> `void`
- `static openUrl(Context context, Uri uri, boolean allowCustom)` -> `void`
- `static openUrl(final Context context, final String url, final boolean allowCustom, boolean tryTelegraph)` -> `void`
- `static openUrl(final Context context, Uri uri, final boolean allowCustom, boolean tryTelegraph)` -> `void`
- `static openUrl(final Context context, Uri uri, final boolean allowCustom, boolean tryTelegraph, Progress inCaseLoading)` -> `void`
- `static openUrl(final Context context, Uri uri, boolean _allowCustom, boolean tryTelegraph, boolean forceNotInternalForApps, Progress inCaseLoading, String browser, boolean allowIntent, boolean allowInAppBrowser, boolean forceRequest)` -> `void`
- `static openUrlInSystemBrowser(Context context, String url)` -> `void`
- `static replace(Uri originalUri, String newScheme, String newUserInfo, String newHostname, String newPath)` -> `String`
- `static replaceHostname(Uri originalUri, String newHostname, String newScheme)` -> `String`
- `static unbindCustomTabsService(Activity activity)` -> `void`
- `static urlMustNotHaveConfirmation(String url)` -> `boolean`

## `org.telegram.messenger.browser.Browser$Progress`
- `cancel()` -> `void`
- `cancel(boolean replaced)` -> `void`
- `end()` -> `void`
- `end(boolean replaced)` -> `void`
- `init()` -> `void`
- `onCancel(Runnable onCancelListener)` -> `Progress`
- `onEnd(Runnable onEndListener)` -> `Progress`

## `org.telegram.messenger.car.HomeScreen`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onGetTemplate()` -> `Template`
- `onPause(@NonNull LifecycleOwner owner)` -> `void`
- `onResume(@NonNull LifecycleOwner owner)` -> `void`

## `org.telegram.messenger.car.MusicSongsScreen`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onGetTemplate()` -> `Template`
- `onPause(@NonNull LifecycleOwner owner)` -> `void`
- `onResume(@NonNull LifecycleOwner owner)` -> `void`

## `org.telegram.messenger.car.TelegramCarAppService`
- `createHostValidator()` -> `HostValidator`
- `onCreateSession()` -> `Session`

## `org.telegram.messenger.car.TelegramCarSession`
- `onCreateScreen(@NonNull Intent intent)` -> `Screen`

## `org.telegram.messenger.chromecast.ChromecastController`
- `static eq(ChromecastMediaVariations a, ChromecastMediaVariations b)` -> `boolean`
- `static eq(ChromecastMedia a, ChromecastMedia b)` -> `boolean`
- `static getInstance()` -> `ChromecastController`
- `isCasting()` -> `boolean`
- `isPlaying(ChromecastMediaVariations media)` -> `boolean`
- `onSessionEnded(@NonNull CastSession castSession, int i)` -> `void`
- `onSessionEnding(@NonNull CastSession castSession)` -> `void`
- `onSessionResumeFailed(@NonNull CastSession castSession, int i)` -> `void`
- `onSessionResumed(@NonNull CastSession castSession, boolean b)` -> `void`
- `onSessionResuming(@NonNull CastSession castSession, @NonNull String s)` -> `void`
- `onSessionStartFailed(@NonNull CastSession castSession, int i)` -> `void`
- `onSessionStarted(@NonNull CastSession castSession, @NonNull String s)` -> `void`
- `onSessionStarting(@NonNull CastSession castSession)` -> `void`
- `onSessionSuspended(@NonNull CastSession castSession, int i)` -> `void`
- `setCover(File file)` -> `String`
- `setCurrentMediaAndCastIfNeeded(ChromecastMediaVariations newMedia)` -> `void`

## `org.telegram.messenger.chromecast.ChromecastController$RemoteMediaClientHandler`
- `close()` -> `void`
- `load(ChromecastMediaVariations media)` -> `void`
- `onAdBreakStatusUpdated()` -> `void`
- `onMediaError(@NonNull MediaError mediaError)` -> `void`
- `onMetadataUpdated()` -> `void`
- `onPreloadStatusUpdated()` -> `void`
- `onQueueStatusUpdated()` -> `void`
- `onSendingRemoteMediaRequest()` -> `void`
- `onStatusUpdated()` -> `void`
- `register()` -> `void`
- `unregister()` -> `void`

## `org.telegram.messenger.chromecast.ChromecastControllerState`
- `getClient()` -> `ChromecastController.RemoteMediaClientHandler`
- `getMedia()` -> `ChromecastMediaVariations`
- `setClient(ChromecastController.RemoteMediaClientHandler c)` -> `void`
- `setCoverFile(File file)` -> `String`
- `setMedia(ChromecastMediaVariations m)` -> `void`

## `org.telegram.messenger.chromecast.ChromecastFileServer`
- `addFileToCast(ChromecastMedia file)` -> `void`
- `getCoverFile()` -> `File`
- `getCoverPath()` -> `String`
- `static getHost()` -> `String`
- `static getUrlToSource(String host, String path)` -> `String`
- `removeFileFromCast(ChromecastMedia file)` -> `void`
- `serve(IHTTPSession session)` -> `Response`
- `setCoverFile(String externalPath, File file)` -> `void`

## `org.telegram.messenger.chromecast.ChromecastFileServer$DataSourceInputStream`
- `available()` -> `int`
- `close()` -> `void`
- `read()` -> `int`
- `read(byte[] b, int off, int len)` -> `int`

## `org.telegram.messenger.chromecast.ChromecastMedia`
- `buildMediaInfo(String host, String options)` -> `MediaInfo`
- `getExternalUri(String host)` -> `String`

## `org.telegram.messenger.chromecast.ChromecastMedia$Builder`
- `build()` -> `ChromecastMedia`
- `static fromUri(Uri internalUri, String externalPath, String mimeType)` -> `Builder`
- `setMetadata(MediaMetadata metadata)` -> `Builder`
- `setSize(int width, int height)` -> `Builder`
- `setSubtitle(String subtitle)` -> `Builder`
- `setTitle(String title)` -> `Builder`

## `org.telegram.messenger.chromecast.ChromecastMediaVariations`
- `getVariation(int index)` -> `ChromecastMedia`
- `getVariationsCount()` -> `int`
- `static of(ChromecastMedia list)` -> `ChromecastMediaVariations`
- `static of(ArrayList<ChromecastMedia> list)` -> `ChromecastMediaVariations`

## `org.telegram.messenger.chromecast.ChromecastMediaVariations$Builder`
- `add(ChromecastMedia media)` -> `Builder`
- `build()` -> `ChromecastMediaVariations`
- `isEmpty()` -> `boolean`

## `org.telegram.messenger.chromecast.ChromecastOptionsProvider`
- `getAdditionalSessionProviders(@NonNull Context context)` -> `List<SessionProvider>`
- `getCastOptions(@NonNull Context context)` -> `CastOptions`

## `org.telegram.messenger.postdrawcompat.ViewOnPostDraw`
- `addOnPostDrawListener(OnPostDrawListener callback)` -> `void`
- `removeOnPostDrawListener(OnPostDrawListener callback)` -> `void`

## `org.telegram.messenger.postdrawcompat.ViewOnPostDrawListener`
- `static addListener(View view, OnPostDrawListener listener)` -> `void`
- `static removeListener(View view, OnPostDrawListener listener)` -> `void`

## `org.telegram.messenger.ringtone.RingtoneDataStore`
- `addTone(TLRPC.Document document)` -> `void`
- `addUploadingTone(String filePath)` -> `void`
- `checkRingtoneSoundsLoaded()` -> `void`
- `contains(long id)` -> `boolean`
- `getDocument(long id)` -> `TLRPC.Document`
- `getSoundPath(long id)` -> `String`
- `isLoaded()` -> `boolean`
- `loadUserRingtones(boolean force)` -> `void`
- `onRingtoneUploaded(String filePath, TLRPC.Document document, boolean error)` -> `void`
- `remove(TLRPC.Document document)` -> `void`
- `saveTones()` -> `void`

## `org.telegram.messenger.ringtone.RingtoneUploader`
- `cancel()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `error(TLRPC.TL_error error)` -> `void`

## `org.telegram.messenger.secretmedia.EncryptedFileDataSource`
- `close()` -> `void`
- `getUri()` -> `Uri`
- `open(DataSpec dataSpec)` -> `long`
- `read(byte[] buffer, int offset, int length)` -> `int`

## `org.telegram.messenger.secretmedia.EncryptedFileInputStream`
- `static decryptBytesWithKeyFile(byte[] bytes, int offset, int length, SecureDocumentKey secureDocumentKey)` -> `void`
- `static decryptBytesWithKeyFile(byte[] bytes, int offset, int length, File keyFile)` -> `void`
- `read(byte[] b, int off, int len)` -> `int`
- `skip(long n)` -> `long`

## `org.telegram.messenger.secretmedia.ExtendedDefaultDataSource`
- `addTransferListener(TransferListener transferListener)` -> `void`
- `close()` -> `void`
- `getResponseHeaders()` -> `Map<String, List<String>>`
- `open(DataSpec dataSpec)` -> `long`
- `read(byte[] buffer, int offset, int readLength)` -> `int`

## `org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory`
- `createDataSource()` -> `ExtendedDefaultDataSource`
- `putDocumentUri(long docId, Uri uri)` -> `void`

## `org.telegram.messenger.support.ArrayUtils`
- `static appendElement(Class<T> kind, T[] array, T element)` -> `T[]`
- `static appendInt(int[] cur, int val)` -> `int[]`
- `static contains(T[] array, T value)` -> `boolean`
- `static contains(int[] array, int value)` -> `boolean`
- `static emptyArray(Class<T> kind)` -> `T[]`
- `static equals(byte[] array1, byte[] array2, int length)` -> `boolean`
- `static idealBooleanArraySize(int need)` -> `int`
- `static idealByteArraySize(int need)` -> `int`
- `static idealCharArraySize(int need)` -> `int`
- `static idealFloatArraySize(int need)` -> `int`
- `static idealIntArraySize(int need)` -> `int`
- `static idealLongArraySize(int need)` -> `int`
- `static idealObjectArraySize(int need)` -> `int`
- `static idealShortArraySize(int need)` -> `int`
- `static indexOf(int[] array, int value)` -> `int`
- `static removeElement(Class<T> kind, T[] array, T element)` -> `T[]`
- `static removeInt(int[] cur, int val)` -> `int[]`
- `static total(long[] array)` -> `long`

## `org.telegram.messenger.support.JobIntentService`
- `dequeueWork()` -> `GenericWorkItem`
- `doStopCurrentWork()` -> `boolean`
- `static enqueueWork(@NonNull Context context, @NonNull Class cls, int jobId, @NonNull Intent work)` -> `void`
- `static enqueueWork(@NonNull Context context, @NonNull ComponentName component, int jobId, @NonNull Intent work)` -> `void`
- `ensureProcessorRunningLocked(boolean reportStarted)` -> `void`
- `static getWorkEnqueuer(Context context, ComponentName cn, boolean hasJobId, int jobId)` -> `WorkEnqueuer`
- `isStopped()` -> `boolean`
- `onBind(@NonNull Intent intent)` -> `IBinder`
- `onCreate()` -> `void`
- `onDestroy()` -> `void`
- `onStartCommand(@Nullable Intent intent, int flags, int startId)` -> `int`
- `onStopCurrentWork()` -> `boolean`
- `processorFinished()` -> `void`
- `setInterruptIfStopped(boolean interruptIfStopped)` -> `void`

## `org.telegram.messenger.support.JobIntentService$CommandProcessor`
- `doInBackground(Void... params)` -> `Void`
- `onCancelled(Void aVoid)` -> `void`
- `onPostExecute(Void aVoid)` -> `void`

## `org.telegram.messenger.support.JobIntentService$CompatWorkEnqueuer`
- `enqueueWork(Intent work)` -> `void`
- `serviceProcessingFinished()` -> `void`
- `serviceProcessingStarted()` -> `void`
- `serviceStartReceived()` -> `void`

## `org.telegram.messenger.support.JobIntentService$CompatWorkItem`
- `complete()` -> `void`
- `getIntent()` -> `Intent`

## `org.telegram.messenger.support.JobIntentService$JobServiceEngineImpl`
- `compatGetBinder()` -> `IBinder`
- `dequeueWork()` -> `GenericWorkItem`
- `onStartJob(JobParameters params)` -> `boolean`
- `onStopJob(JobParameters params)` -> `boolean`

## `org.telegram.messenger.support.JobIntentService$JobServiceEngineImpl$WrapperWorkItem`
- `complete()` -> `void`
- `getIntent()` -> `Intent`

## `org.telegram.messenger.support.JobIntentService$JobWorkEnqueuer`
- `enqueueWork(Intent work)` -> `void`

## `org.telegram.messenger.support.JobIntentService$WorkEnqueuer`
- `ensureJobId(int jobId)` -> `void`
- `serviceProcessingFinished()` -> `void`
- `serviceProcessingStarted()` -> `void`
- `serviceStartReceived()` -> `void`

## `org.telegram.messenger.support.LongSparseIntArray`
- `append(long key, int value)` -> `void`
- `clear()` -> `void`
- `clone()` -> `LongSparseIntArray`
- `delete(long key)` -> `void`
- `get(long key)` -> `int`
- `get(long key, int valueIfKeyNotFound)` -> `int`
- `indexOfKey(long key)` -> `int`
- `indexOfValue(long value)` -> `int`
- `keyAt(int index)` -> `long`
- `put(long key, int value)` -> `void`
- `removeAt(int index)` -> `void`
- `size()` -> `int`
- `valueAt(int index)` -> `int`

## `org.telegram.messenger.support.LongSparseLongArray`
- `append(long key, long value)` -> `void`
- `clear()` -> `void`
- `clone()` -> `LongSparseLongArray`
- `delete(long key)` -> `void`
- `get(long key)` -> `long`
- `get(long key, long valueIfKeyNotFound)` -> `long`
- `indexOfKey(long key)` -> `int`
- `indexOfValue(long value)` -> `int`
- `keyAt(int index)` -> `long`
- `put(long key, long value)` -> `void`
- `removeAt(int index)` -> `void`
- `size()` -> `int`
- `valueAt(int index)` -> `long`

## `org.telegram.messenger.support.SparseLongArray`
- `append(int key, long value)` -> `void`
- `clear()` -> `void`
- `clone()` -> `SparseLongArray`
- `delete(int key)` -> `void`
- `get(int key)` -> `long`
- `get(int key, long valueIfKeyNotFound)` -> `long`
- `indexOfKey(int key)` -> `int`
- `indexOfValue(long value)` -> `int`
- `keyAt(int index)` -> `int`
- `put(int key, long value)` -> `void`
- `removeAt(int index)` -> `void`
- `size()` -> `int`
- `valueAt(int index)` -> `long`

## `org.telegram.messenger.support.customtabs.CustomTabsClient`
- `static connectAndInitialize(Context context, String packageName)` -> `boolean`
- `extraCommand(String commandName, Bundle args)` -> `Bundle`
- `static getPackageName(Context context, @Nullable List<String> packages)` -> `String`
- `static getPackageName(Context context, @Nullable List<String> packages, boolean ignoreDefault)` -> `String`
- `newSession(final CustomTabsCallback callback)` -> `CustomTabsSession`
- `warmup(long flags)` -> `boolean`

## `org.telegram.messenger.support.customtabs.CustomTabsIntent`
- `static getMaxToolbarItems()` -> `int`
- `launchUrl(Context context, Uri url)` -> `void`
- `static setAlwaysUseBrowserUI(Intent intent)` -> `Intent`
- `setUseNewTask()` -> `void`
- `static shouldAlwaysUseBrowserUI(Intent intent)` -> `boolean`

## `org.telegram.messenger.support.customtabs.CustomTabsIntent$Builder`
- `addDefaultShareMenuItem()` -> `Builder`
- `addMenuItem(@NonNull String label, @NonNull PendingIntent pendingIntent)` -> `Builder`
- `addToolbarItem(int id, @NonNull Bitmap icon, @NonNull String description, PendingIntent pendingIntent)` -> `Builder`
- `build()` -> `CustomTabsIntent`
- `enableUrlBarHiding()` -> `Builder`
- `setActionButton(@NonNull Bitmap icon, @NonNull String description, @NonNull PendingIntent pendingIntent, boolean shouldTint)` -> `Builder`
- `setActionButton(@NonNull Bitmap icon, @NonNull String description, @NonNull PendingIntent pendingIntent)` -> `Builder`
- `setCloseButtonIcon(@NonNull Bitmap icon)` -> `Builder`
- `setExitAnimations(@NonNull Context context, @AnimRes int enterResId, @AnimRes int exitResId)` -> `Builder`
- `setInstantAppsEnabled(boolean enabled)` -> `Builder`
- `setSecondaryToolbarViews(@NonNull RemoteViews remoteViews, @Nullable int[] clickableIDs, @Nullable PendingIntent pendingIntent)` -> `Builder`
- `setShowTitle(boolean showTitle)` -> `Builder`
- `setStartAnimations(@NonNull Context context, @AnimRes int enterResId, @AnimRes int exitResId)` -> `Builder`

## `org.telegram.messenger.support.customtabs.CustomTabsService`
- `cleanUpSession(CustomTabsSessionToken sessionToken)` -> `boolean`
- `onBind(Intent intent)` -> `IBinder`

## `org.telegram.messenger.support.customtabs.CustomTabsServiceConnection`
- `onServiceConnected(ComponentName name, IBinder service)` -> `void`

## `org.telegram.messenger.support.customtabs.CustomTabsSession`
- `static createDummySessionForTesting(ComponentName componentName)` -> `CustomTabsSession`
- `getBinder()` -> `IBinder`
- `getComponentName()` -> `ComponentName`
- `mayLaunchUrl(Uri url, Bundle extras, List<Bundle> otherLikelyBundles)` -> `boolean`
- `postMessage(String message, Bundle extras)` -> `int`
- `requestPostMessageChannel(Uri postMessageOrigin)` -> `boolean`
- `setActionButton(@NonNull Bitmap icon, @NonNull String description)` -> `boolean`
- `setSecondaryToolbarViews(@Nullable RemoteViews remoteViews, @Nullable int[] clickableIDs, @Nullable PendingIntent pendingIntent)` -> `boolean`
- `setToolbarItem(int id, @NonNull Bitmap icon, @NonNull String description)` -> `boolean`

## `org.telegram.messenger.support.customtabs.CustomTabsSessionToken`
- `static createDummySessionTokenForTesting()` -> `CustomTabsSessionToken`
- `equals(Object o)` -> `boolean`
- `getCallback()` -> `CustomTabsCallback`
- `getCallbackBinder()` -> `IBinder`
- `static getSessionTokenFromIntent(Intent intent)` -> `CustomTabsSessionToken`
- `hashCode()` -> `int`
- `isAssociatedWith(CustomTabsSession session)` -> `boolean`

## `org.telegram.messenger.support.customtabs.ICustomTabsService$Stub`
- `asBinder()` -> `IBinder`
- `static asInterface(IBinder obj)` -> `ICustomTabsService`
- `onTransact(int code, Parcel data, Parcel reply, int flags)` -> `boolean`

## `org.telegram.messenger.support.customtabs.ICustomTabsService$Stub$Proxy`
- `asBinder()` -> `IBinder`
- `extraCommand(String commandName, Bundle args)` -> `Bundle`
- `getInterfaceDescriptor()` -> `String`
- `mayLaunchUrl(ICustomTabsCallback callback, Uri url, Bundle extras, List<Bundle> otherLikelyBundles)` -> `boolean`
- `newSession(ICustomTabsCallback callback)` -> `boolean`
- `postMessage(ICustomTabsCallback callback, String message, Bundle extras)` -> `int`
- `requestPostMessageChannel(ICustomTabsCallback callback, Uri postMessageOrigin)` -> `boolean`
- `updateVisuals(ICustomTabsCallback callback, Bundle bundle)` -> `boolean`
- `warmup(long flags)` -> `boolean`

## `org.telegram.messenger.support.customtabs.IPostMessageService$Stub`
- `asBinder()` -> `IBinder`
- `static asInterface(IBinder obj)` -> `IPostMessageService`
- `onTransact(int code, Parcel data, Parcel reply, int flags)` -> `boolean`

## `org.telegram.messenger.support.customtabs.IPostMessageService$Stub$Proxy`
- `asBinder()` -> `IBinder`
- `getInterfaceDescriptor()` -> `String`
- `onMessageChannelReady(ICustomTabsCallback callback, Bundle extras)` -> `void`
- `onPostMessage(ICustomTabsCallback callback, String message, Bundle extras)` -> `void`

## `org.telegram.messenger.support.customtabs.PostMessageService`
- `onBind(Intent intent)` -> `IBinder`

## `org.telegram.messenger.support.customtabs.PostMessageServiceConnection`
- `notifyMessageChannelReady(Bundle extras)` -> `boolean`
- `onPostMessageServiceConnected()` -> `void`
- `onPostMessageServiceDisconnected()` -> `void`
- `onServiceConnected(ComponentName name, IBinder service)` -> `void`
- `onServiceDisconnected(ComponentName name)` -> `void`
- `postMessage(String message, Bundle extras)` -> `boolean`
- `unbindFromContext(Context context)` -> `void`

## `org.telegram.messenger.support.customtabsclient.shared.CustomTabsHelper`
- `static addKeepAliveExtra(Context context, Intent intent)` -> `void`
- `static getPackageNameToUse(Context context)` -> `String`
- `static getPackages()` -> `String[]`

## `org.telegram.messenger.support.customtabsclient.shared.KeepAliveService`
- `onBind(Intent intent)` -> `IBinder`

## `org.telegram.messenger.support.customtabsclient.shared.ServiceConnection`
- `onCustomTabsServiceConnected(ComponentName name, CustomTabsClient client)` -> `void`
- `onServiceDisconnected(ComponentName name)` -> `void`

## `org.telegram.messenger.support.fingerprint.FingerprintManagerCompat`
- `authenticate(@Nullable CryptoObject crypto, int flags, @Nullable CancellationSignal cancel, @NonNull AuthenticationCallback callback, @Nullable Handler handler)` -> `void`
- `static from(Context context)` -> `FingerprintManagerCompat`
- `hasEnrolledFingerprints()` -> `boolean`
- `isHardwareDetected()` -> `boolean`

## `org.telegram.messenger.support.fingerprint.FingerprintManagerCompat$Api23FingerprintManagerCompatImpl`
- `authenticate(Context context, CryptoObject crypto, int flags, CancellationSignal cancel, AuthenticationCallback callback, Handler handler)` -> `void`
- `hasEnrolledFingerprints(Context context)` -> `boolean`
- `isHardwareDetected(Context context)` -> `boolean`
- `static unwrapCryptoObject(FingerprintManagerCompatApi23.CryptoObject cryptoObject)` -> `CryptoObject`

## `org.telegram.messenger.support.fingerprint.FingerprintManagerCompat$CryptoObject`
- `getCipher()` -> `Cipher`
- `getMac()` -> `Mac`
- `getSignature()` -> `Signature`

## `org.telegram.messenger.support.fingerprint.FingerprintManagerCompat$LegacyFingerprintManagerCompatImpl`
- `authenticate(Context context, CryptoObject crypto, int flags, CancellationSignal cancel, AuthenticationCallback callback, Handler handler)` -> `void`
- `hasEnrolledFingerprints(Context context)` -> `boolean`
- `isHardwareDetected(Context context)` -> `boolean`

## `org.telegram.messenger.support.fingerprint.FingerprintManagerCompatApi23`
- `static authenticate(Context context, CryptoObject crypto, int flags, Object cancel, AuthenticationCallback callback, Handler handler)` -> `void`
- `static hasEnrolledFingerprints(Context context)` -> `boolean`
- `static isHardwareDetected(Context context)` -> `boolean`

## `org.telegram.messenger.support.fingerprint.FingerprintManagerCompatApi23$CryptoObject`
- `getCipher()` -> `Cipher`
- `getMac()` -> `Mac`
- `getSignature()` -> `Signature`

## `org.telegram.messenger.time.FastDateFormat`
- `applyRules(final Calendar calendar, final StringBuffer buf)` -> `StringBuffer`
- `equals(final Object obj)` -> `boolean`
- `format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos)` -> `StringBuffer`
- `format(final long millis)` -> `String`
- `format(final Date date)` -> `String`
- `format(final Calendar calendar)` -> `String`
- `format(final long millis, final StringBuffer buf)` -> `StringBuffer`
- `format(final Date date, final StringBuffer buf)` -> `StringBuffer`
- `format(final Calendar calendar, final StringBuffer buf)` -> `StringBuffer`
- `static getDateInstance(final int style)` -> `FastDateFormat`
- `static getDateInstance(final int style, final Locale locale)` -> `FastDateFormat`
- `static getDateInstance(final int style, final TimeZone timeZone)` -> `FastDateFormat`
- `static getDateInstance(final int style, final TimeZone timeZone, final Locale locale)` -> `FastDateFormat`
- `static getDateTimeInstance(final int dateStyle, final int timeStyle)` -> `FastDateFormat`
- `static getDateTimeInstance(final int dateStyle, final int timeStyle, final Locale locale)` -> `FastDateFormat`
- `static getDateTimeInstance(final int dateStyle, final int timeStyle, final TimeZone timeZone)` -> `FastDateFormat`
- `static getDateTimeInstance(final int dateStyle, final int timeStyle, final TimeZone timeZone, final Locale locale)` -> `FastDateFormat`
- `static getInstance()` -> `FastDateFormat`
- `static getInstance(final String pattern)` -> `FastDateFormat`
- `static getInstance(final String pattern, final TimeZone timeZone)` -> `FastDateFormat`
- `static getInstance(final String pattern, final Locale locale)` -> `FastDateFormat`
- `static getInstance(final String pattern, final TimeZone timeZone, final Locale locale)` -> `FastDateFormat`
- `getLocale()` -> `Locale`
- `getMaxLengthEstimate()` -> `int`
- `getPattern()` -> `String`
- `static getTimeInstance(final int style)` -> `FastDateFormat`
- `static getTimeInstance(final int style, final Locale locale)` -> `FastDateFormat`
- `static getTimeInstance(final int style, final TimeZone timeZone)` -> `FastDateFormat`
- `static getTimeInstance(final int style, final TimeZone timeZone, final Locale locale)` -> `FastDateFormat`
- `getTimeZone()` -> `TimeZone`
- `hashCode()` -> `int`
- `parse(final String source)` -> `Date`
- `parse(final String source, final ParsePosition pos)` -> `Date`
- `parseObject(final String source, final ParsePosition pos)` -> `Object`
- `toString()` -> `String`

## `org.telegram.messenger.time.FastDateParser`
- `equals(final Object obj)` -> `boolean`
- `getFieldWidth()` -> `int`
- `getLocale()` -> `Locale`
- `getParsePattern()` -> `Pattern`
- `getPattern()` -> `String`
- `getTimeZone()` -> `TimeZone`
- `hashCode()` -> `int`
- `isNextNumber()` -> `boolean`
- `parse(final String source)` -> `Date`
- `parse(final String source, final ParsePosition pos)` -> `Date`
- `parseObject(final String source)` -> `Object`
- `parseObject(final String source, final ParsePosition pos)` -> `Object`
- `toString()` -> `String`

## `org.telegram.messenger.time.FastDateParser$CopyQuotedStrategy`
- `addRegex(final FastDateParser parser, final StringBuilder regex)` -> `boolean`
- `isNumber()` -> `boolean`

## `org.telegram.messenger.time.FastDateParser$NumberStrategy`
- `addRegex(final FastDateParser parser, final StringBuilder regex)` -> `boolean`
- `isNumber()` -> `boolean`
- `modify(final int iValue)` -> `int`
- `setCalendar(final FastDateParser parser, final Calendar cal, final String value)` -> `void`

## `org.telegram.messenger.time.FastDateParser$Strategy`
- `isNumber()` -> `boolean`
- `setCalendar(final FastDateParser parser, final Calendar cal, final String value)` -> `void`

## `org.telegram.messenger.time.FastDateParser$TextStrategy`
- `addRegex(final FastDateParser parser, final StringBuilder regex)` -> `boolean`
- `setCalendar(final FastDateParser parser, final Calendar cal, final String value)` -> `void`

## `org.telegram.messenger.time.FastDateParser$TimeZoneStrategy`
- `addRegex(final FastDateParser parser, final StringBuilder regex)` -> `boolean`
- `setCalendar(final FastDateParser parser, final Calendar cal, final String value)` -> `void`

## `org.telegram.messenger.time.FastDatePrinter`
- `applyRules(final Calendar calendar, final StringBuffer buf)` -> `StringBuffer`
- `equals(final Object obj)` -> `boolean`
- `format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos)` -> `StringBuffer`
- `format(final long millis)` -> `String`
- `format(final Date date)` -> `String`
- `format(final Calendar calendar)` -> `String`
- `format(final long millis, final StringBuffer buf)` -> `StringBuffer`
- `format(final Date date, final StringBuffer buf)` -> `StringBuffer`
- `format(final Calendar calendar, final StringBuffer buf)` -> `StringBuffer`
- `getLocale()` -> `Locale`
- `getMaxLengthEstimate()` -> `int`
- `getPattern()` -> `String`
- `getTimeZone()` -> `TimeZone`
- `static getTimeZoneDisplay(final TimeZone tz, final boolean daylight, final int style, final Locale locale)` -> `String`
- `hashCode()` -> `int`
- `parsePattern()` -> `List<Rule>`
- `parseToken(final String pattern, final int[] indexRef)` -> `String`
- `selectNumberRule(final int field, final int padding)` -> `NumberRule`
- `toString()` -> `String`

## `org.telegram.messenger.time.FastDatePrinter$CharacterLiteral`
- `appendTo(final StringBuffer buffer, final Calendar calendar)` -> `void`
- `estimateLength()` -> `int`

## `org.telegram.messenger.time.FastDatePrinter$PaddedNumberField`
- `appendTo(final StringBuffer buffer, final Calendar calendar)` -> `void`
- `appendTo(final StringBuffer buffer, final int value)` -> `void`
- `estimateLength()` -> `int`

## `org.telegram.messenger.time.FastDatePrinter$StringLiteral`
- `appendTo(final StringBuffer buffer, final Calendar calendar)` -> `void`
- `estimateLength()` -> `int`

## `org.telegram.messenger.time.FastDatePrinter$TextField`
- `appendTo(final StringBuffer buffer, final Calendar calendar)` -> `void`
- `estimateLength()` -> `int`

## `org.telegram.messenger.time.FastDatePrinter$TimeZoneDisplayKey`
- `equals(final Object obj)` -> `boolean`
- `hashCode()` -> `int`

## `org.telegram.messenger.time.FastDatePrinter$TimeZoneNameRule`
- `appendTo(final StringBuffer buffer, final Calendar calendar)` -> `void`
- `estimateLength()` -> `int`

## `org.telegram.messenger.time.FastDatePrinter$TimeZoneNumberRule`
- `appendTo(final StringBuffer buffer, final Calendar calendar)` -> `void`
- `estimateLength()` -> `int`

## `org.telegram.messenger.time.FastDatePrinter$TwelveHourField`
- `appendTo(final StringBuffer buffer, final Calendar calendar)` -> `void`
- `appendTo(final StringBuffer buffer, final int value)` -> `void`
- `estimateLength()` -> `int`

## `org.telegram.messenger.time.FastDatePrinter$TwentyFourHourField`
- `appendTo(final StringBuffer buffer, final Calendar calendar)` -> `void`
- `appendTo(final StringBuffer buffer, final int value)` -> `void`
- `estimateLength()` -> `int`

## `org.telegram.messenger.time.FastDatePrinter$TwoDigitMonthField`
- `appendTo(final StringBuffer buffer, final Calendar calendar)` -> `void`
- `appendTo(final StringBuffer buffer, final int value)` -> `void`
- `estimateLength()` -> `int`

## `org.telegram.messenger.time.FastDatePrinter$TwoDigitNumberField`
- `appendTo(final StringBuffer buffer, final Calendar calendar)` -> `void`
- `appendTo(final StringBuffer buffer, final int value)` -> `void`
- `estimateLength()` -> `int`

## `org.telegram.messenger.time.FastDatePrinter$TwoDigitYearField`
- `appendTo(final StringBuffer buffer, final Calendar calendar)` -> `void`
- `appendTo(final StringBuffer buffer, final int value)` -> `void`
- `estimateLength()` -> `int`

## `org.telegram.messenger.time.FastDatePrinter$UnpaddedMonthField`
- `appendTo(final StringBuffer buffer, final Calendar calendar)` -> `void`
- `appendTo(final StringBuffer buffer, final int value)` -> `void`
- `estimateLength()` -> `int`

## `org.telegram.messenger.time.FastDatePrinter$UnpaddedNumberField`
- `appendTo(final StringBuffer buffer, final Calendar calendar)` -> `void`
- `appendTo(final StringBuffer buffer, final int value)` -> `void`
- `estimateLength()` -> `int`

## `org.telegram.messenger.time.FormatCache`
- `getDateInstance(final int dateStyle, final TimeZone timeZone, Locale locale)` -> `F`
- `getDateTimeInstance(final int dateStyle, final int timeStyle, final TimeZone timeZone, Locale locale)` -> `F`
- `getInstance()` -> `F`
- `getInstance(final String pattern, TimeZone timeZone, Locale locale)` -> `F`
- `static getPatternForStyle(final Integer dateStyle, final Integer timeStyle, final Locale locale)` -> `String`
- `getTimeInstance(final int timeStyle, final TimeZone timeZone, Locale locale)` -> `F`

## `org.telegram.messenger.time.FormatCache$MultipartKey`
- `equals(final Object obj)` -> `boolean`
- `hashCode()` -> `int`

## `org.telegram.messenger.time.SunDate`
- `static calculateSunriseSunset(double lat, double lon)` -> `int[]`

## `org.telegram.messenger.utils.BillingUtilities`
- `static cleanupPurchase(Purchase purchase)` -> `void`
- `static clearPurpose(String data_hex)` -> `void`
- `static createDeveloperPayload(TLRPC.InputStorePaymentPurpose paymentPurpose, AccountInstance accountInstance)` -> `Pair<String, String>`
- `static extractCurrencyExp(Map<String, Integer> currencyExpMap)` -> `void`
- `static extractDeveloperPayload(Purchase purchase)` -> `Pair<AccountInstance, TLRPC.InputStorePaymentPurpose>`
- `static fillTitles(TL_wallet.currencyRates rates)` -> `void`
- `static getPurpose(String data_hex)` -> `TLRPC.InputStorePaymentPurpose`
- `static savePurpose(TLRPC.InputStorePaymentPurpose paymentPurpose)` -> `String`

## `org.telegram.messenger.utils.BillingUtilities$TL_savedPurpose`
- `static TLdeserialize(InputSerializedData stream, int constructor, boolean exception)` -> `TL_savedPurpose`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.messenger.utils.BitmapsCache`
- `cacheExist()` -> `boolean`
- `cancelCreate()` -> `void`
- `createCache()` -> `void`
- `static decrementTaskCounter()` -> `void`
- `getFrame(Bitmap bitmap, Metadata metadata)` -> `int`
- `getFrame(int index, Bitmap bitmap)` -> `int`
- `getFrameCount()` -> `int`
- `static incrementTaskCounter()` -> `void`
- `isCreated()` -> `boolean`
- `needGenCache()` -> `boolean`
- `recycle()` -> `void`

## `org.telegram.messenger.utils.BitmapsCache$CacheGeneratorSharedTools`
- `allocate(int h, int w)` -> `void`
- `release()` -> `void`

## `org.telegram.messenger.utils.Choreographer60FpsContent`
- `addFrameCallback(FrameCallback callback)` -> `void`
- `addFrameCallback(Runnable callback)` -> `void`
- `addFrameCallback(Runnable callback, int fps)` -> `void`
- `addFrameCallback(FrameCallback callback, int fps)` -> `void`
- `addFrameCallbackOnce(Runnable callback, int fps)` -> `void`
- `doFrame(long frameTimeNanos)` -> `void`
- `static getInstance()` -> `Choreographer60FpsContent`
- `post(FrameCallback callback)` -> `void`
- `postInvalidateDrawable(Drawable drawable)` -> `void`
- `postInvalidateDrawable30fps(Drawable drawable)` -> `void`
- `postInvalidateView(View view)` -> `void`
- `removeFrameCallback(Runnable callback)` -> `void`
- `removeFrameCallback(FrameCallback callback)` -> `void`
- `removeFrameCallbackOnce(Runnable callback)` -> `void`

## `org.telegram.messenger.utils.CopyUtilities`
- `static fromHTML(String html)` -> `Spannable`

## `org.telegram.messenger.utils.CopyUtilities$HTMLTagAttributesHandler`
- `characters(char[] ch, int start, int length)` -> `void`
- `endDocument()` -> `void`
- `endElement(String uri, String localName, String qName)` -> `void`
- `endPrefixMapping(String prefix)` -> `void`
- `static getValue(Attributes attributes, String name)` -> `String`
- `handleTag(boolean opening, String tag, Editable output, XMLReader xmlReader)` -> `void`
- `ignorableWhitespace(char[] ch, int start, int length)` -> `void`
- `processingInstruction(String target, String data)` -> `void`
- `setDocumentLocator(Locator locator)` -> `void`
- `skippedEntity(String name)` -> `void`
- `startDocument()` -> `void`
- `startElement(String uri, String localName, String qName, Attributes attributes)` -> `void`
- `startPrefixMapping(String prefix, String uri)` -> `void`

## `org.telegram.messenger.utils.CopyUtilities$HTMLTagHandler`
- `handleTag(boolean opening, String tag, Editable output, Attributes attributes)` -> `boolean`

## `org.telegram.messenger.utils.CountdownTimer`
- `isRunning()` -> `boolean`
- `start(long seconds)` -> `void`
- `stop()` -> `void`

## `org.telegram.messenger.utils.CustomHtml`
- `static toHtml(Spanned text)` -> `String`

## `org.telegram.messenger.utils.DebugRecordingCanvas`
- `clearCommands()` -> `void`
- `clipPath(@NonNull Path path)` -> `boolean`
- `clipPath(@NonNull Path path, @NonNull Region.Op op)` -> `boolean`
- `clipRect(@NonNull RectF rect)` -> `boolean`
- `clipRect(@NonNull RectF rect, @NonNull Region.Op op)` -> `boolean`
- `clipRect(@NonNull Rect rect)` -> `boolean`
- `clipRect(@NonNull Rect rect, @NonNull Region.Op op)` -> `boolean`
- `clipRect(float left, float top, float right, float bottom)` -> `boolean`
- `clipRect(float left, float top, float right, float bottom, @NonNull Region.Op op)` -> `boolean`
- `clipRect(int left, int top, int right, int bottom)` -> `boolean`
- `concat(@Nullable Matrix matrix)` -> `void`
- `getClipBounds(@NonNull Rect bounds)` -> `boolean`
- `getCommandCount()` -> `int`
- `getCommands()` -> `List<Command>`
- `logCommands()` -> `void`
- `quickReject(@NonNull RectF rect)` -> `boolean`
- `quickReject(@NonNull RectF rect, @NonNull Canvas.EdgeType type)` -> `boolean`
- `quickReject(float left, float top, float right, float bottom)` -> `boolean`
- `quickReject(float left, float top, float right, float bottom, @NonNull Canvas.EdgeType type)` -> `boolean`
- `quickReject(@NonNull Path path)` -> `boolean`
- `quickReject(@NonNull Path path, @NonNull Canvas.EdgeType type)` -> `boolean`
- `replayAll(@NonNull Canvas target)` -> `void`
- `replayCommands(@NonNull Canvas target, int n)` -> `void`
- `restore()` -> `void`
- `restoreToCount(int saveCount)` -> `void`
- `rotate(float degrees)` -> `void`
- `saveLayer(float left, float top, float right, float bottom, @Nullable Paint paint)` -> `int`
- `saveLayerAlpha(@Nullable RectF bounds, int alpha)` -> `int`
- `saveLayerAlpha(@Nullable RectF bounds, int alpha, int saveFlags)` -> `int`
- `saveLayerAlpha(float left, float top, float right, float bottom, int alpha)` -> `int`
- `saveLayerAlpha(float left, float top, float right, float bottom, int alpha, int saveFlags)` -> `int`
- `scale(float sx, float sy)` -> `void`
- `setDrawFilter(@Nullable DrawFilter filter)` -> `void`
- `setMatrix(@Nullable Matrix matrix)` -> `void`
- `skew(float sx, float sy)` -> `void`
- `translate(float dx, float dy)` -> `void`

## `org.telegram.messenger.utils.DebugRecordingCanvas$GetClipBoundsCmd`
- `replay(@NonNull Canvas c)` -> `void`
- `toString()` -> `String`

## `org.telegram.messenger.utils.DebugRecordingCanvas$QuickRejectCmd`
- `replay(@NonNull Canvas c)` -> `void`
- `toString()` -> `String`

## `org.telegram.messenger.utils.DrawableUtils`
- `static setBounds(Drawable drawable, float x, float y, int gravity)` -> `void`
- `static setBounds(ImageReceiver drawable, float x, float y, int width, int height, int gravity)` -> `void`
- `static setBounds(Drawable drawable, float x, float y, int width, int height, int gravity)` -> `void`
- `static setBounds(Rect rect, float x, float y, int width, int height, int gravity)` -> `void`
- `static setBoundsIncreasePadding(Drawable drawable, RectF bounds)` -> `void`
- `static setBoundsIncreasePadding(Drawable drawable, Rect bounds)` -> `void`
- `static setBoundsIncreasePadding(Drawable drawable, int left, int top, int right, int bottom)` -> `void`

## `org.telegram.messenger.utils.EphemeralMessagesHelper`
- `beforeSendingFinalRequest(TLObject req, MessageObject msg, Utilities.Callback<TLObject> send)` -> `boolean`
- `beforeSendingFinalRequest(TLObject req, List<MessageObject> messages, Utilities.Callback<TLObject> send)` -> `boolean`
- `static convertEphemeralToFakeDefault(TL_ephemeral.EphemeralMessage ephemeralMessage)` -> `TLRPC.TL_message`
- `static convertFakeDefaultToEphemeral(TLRPC.Message message, int topicId)` -> `TL_ephemeral.EphemeralMessage`
- `getEphemeralCommandBotId(String text, long dialogId)` -> `long`
- `getEphemeralCommandBotId(String text, List<TL_bots.BotInfo> botInfo)` -> `long`
- `getEphemeralCommandBotId(String text, LongSparseArray<TL_bots.BotInfo> botInfo)` -> `long`
- `static getInstance(final int num)` -> `EphemeralMessagesHelper`
- `isEphemeralCommand(String text, LongSparseArray<TL_bots.BotInfo> botInfo)` -> `boolean`

## `org.telegram.messenger.utils.EphemeralMessagesHelper$EphemeralUpdates`
- `apply(TL_update.TL_updateNewEphemeralMessage update, int currentAccount, AbstractMap<Long, TLRPC.User> usersDict, AbstractMap<Long, TLRPC.Chat> chatsDict)` -> `void`
- `apply(TL_update.TL_updateEditEphemeralMessage update, int currentAccount, AbstractMap<Long, TLRPC.User> usersDict, AbstractMap<Long, TLRPC.Chat> chatsDict)` -> `void`
- `apply(TL_update.TL_updateDeleteEphemeralMessages update)` -> `void`

## `org.telegram.messenger.utils.EphemeralMessagesHelper$EphemeralUpdates$StructBuilder`
- `build(int currentAccount, AbstractMap<Long, TLRPC.User> usersDict, AbstractMap<Long, TLRPC.Chat> chatsDict, int editDate)` -> `void`
- `isEmpty()` -> `boolean`
- `put(TL_ephemeral.EphemeralMessage ephemeralMessage)` -> `void`

## `org.telegram.messenger.utils.EphemeralMessagesHelper$WelcomeAnchorsState`
- `getAnchorBindings(long dialogId)` -> `SparseIntArray`
- `put(long dialogId, int messageId, int ephemeralMessageId)` -> `void`
- `remove(long dialogId, int messageId, int ephemeralMessageId)` -> `void`

## `org.telegram.messenger.utils.FrameMetricsOverlayView$Metric`
- `isAvailable()` -> `boolean`

## `org.telegram.messenger.utils.ImmutableByteArrayOutputStream`
- `count()` -> `int`
- `reset()` -> `void`
- `write(int b)` -> `void`
- `write(byte b[], int off, int len)` -> `void`
- `writeInt(int value)` -> `void`
- `writeLong(long value)` -> `void`
- `writeTo(OutputStream out)` -> `void`

## `org.telegram.messenger.utils.LeakDetector`
- `add(@NonNull T object)` -> `void`
- `static getInstance()` -> `LeakDetector`
- `start()` -> `void`
- `stop()` -> `void`

## `org.telegram.messenger.utils.PhotoUtilities`
- `static applyPhotoToUser(TLRPC.Photo photo, TLRPC.User user, boolean personal)` -> `void`
- `static applyPhotoToUser(TLRPC.PhotoSize smallSize, TLRPC.PhotoSize bigSize, boolean hasVideo, TLRPC.User user, boolean personal)` -> `void`
- `static replacePhotoImagesInCache(int currentAccount, TLRPC.Photo photo, TLRPC.Photo photoToReplace)` -> `void`
- `static setImageAsAvatar(MediaController.PhotoEntry entry, BaseFragment baseFragment, Runnable onDone)` -> `void`
- `static showAvatartConstructorForUpdateUserPhoto(ChatActivity chatActivity, TLRPC.VideoSize emojiMarkup)` -> `void`

## `org.telegram.messenger.utils.RadiiUtils`
- `static radiiAreSame(float[] radii)` -> `boolean`

## `org.telegram.messenger.utils.RectFMergeBounding`
- `static mergeOverlapping(List<RectF> positions, int count, List<RectF> output)` -> `int`

## `org.telegram.messenger.utils.RefreshRateController`
- `start()` -> `void`
- `stop()` -> `void`

## `org.telegram.messenger.utils.RenderNodeEffects`
- `static createSaturationXRenderEffect(float x)` -> `RenderEffect`
- `static getSaturationX2RenderEffect()` -> `RenderEffect`
- `static getSaturationX3RenderEffect()` -> `RenderEffect`
- `static getSaturationX4RenderEffect()` -> `RenderEffect`

## `org.telegram.messenger.utils.SearchTextWatcher`
- `afterTextChanged(Editable s)` -> `void`
- `beforeTextChanged(CharSequence s, int start, int count, int after)` -> `void`
- `isSearchExpanded()` -> `boolean`
- `onTextChanged(CharSequence s, int start, int before, int count)` -> `void`
- `setDoNotCloseAfterFieldEmpty()` -> `void`
- `toggleSearch(boolean expand)` -> `boolean`

## `org.telegram.messenger.utils.TextWatcherImpl`
- `afterTextChanged(Editable s)` -> `default void`
- `beforeTextChanged(CharSequence s, int start, int count, int after)` -> `default void`
- `onTextChanged(CharSequence s, int start, int before, int count)` -> `default void`

## `org.telegram.messenger.utils.ViewOutlineProviderImpl`
- `static boundsWithPaddingFromViewAndRoundRect(float radius)` -> `ViewOutlineProvider`
- `static boundsWithPaddingRoundRect(int padding, float radius)` -> `ViewOutlineProvider`
- `static boundsWithPaddingRoundRect(int padding)` -> `ViewOutlineProvider`
- `static fromDrawable(Drawable drawable)` -> `ViewOutlineProvider`

## `org.telegram.messenger.utils.WindowVisibilityManager`
- `obtainController()` -> `Controller`

## `org.telegram.messenger.utils.WindowVisibilityManager$ControllerImpl`
- `destroy()` -> `void`
- `setHidden(boolean hidden)` -> `void`

## `org.telegram.messenger.utils.tlutils.AmountUtils$Amount`
- `applyPerMille(int perMille)` -> `Amount`
- `asDecimal()` -> `long`
- `asDecimalString()` -> `String`
- `asDouble()` -> `double`
- `asFormatString()` -> `String`
- `asFormatString(char thousandsSeparator)` -> `String`
- `asNano()` -> `long`
- `convertTo(Currency currency)` -> `Amount`
- `convertToUsd()` -> `double`
- `equals(Object o)` -> `boolean`
- `static equals(TL_stars.StarsAmount a, TL_stars.StarsAmount b)` -> `boolean`
- `static equals(Amount a, Amount b)` -> `boolean`
- `formatAsDecimalSpaced()` -> `String`
- `static fromDecimal(long decimal, Currency currency)` -> `Amount`
- `static fromDecimal(double decimal, Currency currency)` -> `Amount`
- `static fromDecimal(String string, Currency currency)` -> `Amount`
- `static fromNano(long nanos, Currency currency)` -> `Amount`
- `static fromUsd(double usd, AmountUtils.Currency currency)` -> `Amount`
- `isRound()` -> `boolean`
- `isZero()` -> `boolean`
- `static of(TL_stars.StarsAmount amount)` -> `Amount`
- `static ofSafe(TL_stars.StarsAmount amount)` -> `Amount`
- `round(int decimals)` -> `Amount`
- `toTl()` -> `TL_stars.StarsAmount`

## `org.telegram.messenger.utils.tlutils.AmountUtils$AmountLimits`
- `check(Amount amount)` -> `int`
- `getMax(Currency currency)` -> `Amount`
- `getMin(Currency currency)` -> `Amount`
- `set(Amount min, Amount max)` -> `void`
- `setAsDecimal(Currency currency, long decimalMin, long decimalMax)` -> `void`
- `setAsNano(Currency currency, long nanoMin, long nanoMax)` -> `void`

## `org.telegram.messenger.utils.tlutils.TLKeyboardHelper`
- `static getType(TL_keyboard.KeyboardButtonProto button, Class<T> tClass)` -> `T`
- `static isButtonWebView(TL_keyboard.KeyboardButtonProto button)` -> `boolean`
- `static isForceReply(TLRPC.ReplyMarkup replyMarkup)` -> `boolean`
- `static isType(TL_keyboard.KeyboardButtonProto button, Class<T> tClass)` -> `boolean`

## `org.telegram.messenger.utils.tlutils.TlUtils`
- `static applyGroupCallUpdate(TLRPC.GroupCall oldGroupCall, TLRPC.GroupCall newGroupCall)` -> `TLRPC.GroupCall`
- `static calculateAnswerShuffleHash(TLRPC.Poll poll, long userId)` -> `void`
- `static findAllInstances(List<?> list, Class<T> tClass)` -> `ArrayList<T>`
- `static findFirstInstance(List<?> list, Class<T> tClass)` -> `T`
- `static getGiftDocument(TL_stars.StarGift gift)` -> `TLRPC.Document`
- `static getGiftDocumentPattern(TL_stars.StarGift gift)` -> `TLRPC.Document`
- `static getInputPeerFromSendMessageRequest(TLObject request)` -> `TLRPC.InputPeer`
- `static getInputReplyToFromSendMessageRequest(TLObject request)` -> `TLRPC.InputReplyTo`
- `static getMessageFromSendMessageRequest(TLObject request)` -> `String`
- `static getOrCalculateRandomIdFromSendMessageRequest(TLObject request)` -> `long`
- `static getThemeEmoticonOrGiftTitle(TLRPC.ChatTheme chatTheme)` -> `String`
- `static isInstance(Object obj, final Class<?>... classes)` -> `boolean`
- `static setInputReplyToFromSendMessageRequest(TLObject request, TLRPC.InputReplyTo replyTo)` -> `void`
- `static tlEquals(TLObject object1, TLObject object2)` -> `boolean`
- `static toInputMediaGeo(TLRPC.MessageMedia location)` -> `TLRPC.InputMedia`
- `static validateEntities(ArrayList<TLRPC.MessageEntity> entities, String text)` -> `void`

## `org.telegram.messenger.video.HevcConfigurationBox`
- `_parseDetails(ByteBuffer content)` -> `void`
- `equals(Object o)` -> `boolean`
- `getArrays()` -> `List<HevcDecoderConfigurationRecord.Array>`
- `getAvgFrameRate()` -> `int`
- `getBitDepthChromaMinus8()` -> `int`
- `getBitDepthLumaMinus8()` -> `int`
- `getChromaFormat()` -> `int`
- `getConfigurationVersion()` -> `int`
- `getConstantFrameRate()` -> `int`
- `getContent(ByteBuffer byteBuffer)` -> `void`
- `getContentSize()` -> `long`
- `getGeneral_constraint_indicator_flags()` -> `long`
- `getGeneral_level_idc()` -> `int`
- `getGeneral_profile_compatibility_flags()` -> `long`
- `getGeneral_profile_idc()` -> `int`
- `getGeneral_profile_space()` -> `int`
- `getHevcDecoderConfigurationRecord()` -> `HevcDecoderConfigurationRecord`
- `getLengthSizeMinusOne()` -> `int`
- `getMin_spatial_segmentation_idc()` -> `int`
- `getNumTemporalLayers()` -> `int`
- `getParallelismType()` -> `int`
- `hashCode()` -> `int`
- `isGeneral_tier_flag()` -> `boolean`
- `isTemporalIdNested()` -> `boolean`
- `setHevcDecoderConfigurationRecord(HevcDecoderConfigurationRecord hevcDecoderConfigurationRecord)` -> `void`

## `org.telegram.messenger.video.HevcDecoderConfigurationRecord`
- `equals(Object o)` -> `boolean`
- `getArrays()` -> `List<Array>`
- `getAvgFrameRate()` -> `int`
- `getBitDepthChromaMinus8()` -> `int`
- `getBitDepthLumaMinus8()` -> `int`
- `getChromaFormat()` -> `int`
- `getConfigurationVersion()` -> `int`
- `getConstantFrameRate()` -> `int`
- `getGeneral_constraint_indicator_flags()` -> `long`
- `getGeneral_level_idc()` -> `int`
- `getGeneral_profile_compatibility_flags()` -> `long`
- `getGeneral_profile_idc()` -> `int`
- `getGeneral_profile_space()` -> `int`
- `getLengthSizeMinusOne()` -> `int`
- `getMin_spatial_segmentation_idc()` -> `int`
- `getNumTemporalLayers()` -> `int`
- `getParallelismType()` -> `int`
- `getSize()` -> `int`
- `hashCode()` -> `int`
- `isFrame_only_constraint_flag()` -> `boolean`
- `isGeneral_tier_flag()` -> `boolean`
- `isInterlaced_source_flag()` -> `boolean`
- `isNon_packed_constraint_flag()` -> `boolean`
- `isProgressive_source_flag()` -> `boolean`
- `isTemporalIdNested()` -> `boolean`
- `parse(ByteBuffer content)` -> `void`
- `static parseFromCsd(List<ByteBuffer> csd)` -> `VisualSampleEntry`
- `setArrays(List<Array> arrays)` -> `void`
- `setAvgFrameRate(int avgFrameRate)` -> `void`
- `setBitDepthChromaMinus8(int bitDepthChromaMinus8)` -> `void`
- `setBitDepthLumaMinus8(int bitDepthLumaMinus8)` -> `void`
- `setChromaFormat(int chromaFormat)` -> `void`
- `setConfigurationVersion(int configurationVersion)` -> `void`
- `setConstantFrameRate(int constantFrameRate)` -> `void`
- `setFrame_only_constraint_flag(boolean frame_only_constraint_flag)` -> `void`
- `setGeneral_constraint_indicator_flags(long general_constraint_indicator_flags)` -> `void`
- `setGeneral_level_idc(int general_level_idc)` -> `void`
- `setGeneral_profile_compatibility_flags(long general_profile_compatibility_flags)` -> `void`
- `setGeneral_profile_idc(int general_profile_idc)` -> `void`
- `setGeneral_profile_space(int general_profile_space)` -> `void`
- `setGeneral_tier_flag(boolean general_tier_flag)` -> `void`
- `setInterlaced_source_flag(boolean interlaced_source_flag)` -> `void`
- `setLengthSizeMinusOne(int lengthSizeMinusOne)` -> `void`
- `setMin_spatial_segmentation_idc(int min_spatial_segmentation_idc)` -> `void`
- `setNon_packed_constraint_flag(boolean non_packed_constraint_flag)` -> `void`
- `setNumTemporalLayers(int numTemporalLayers)` -> `void`
- `setParallelismType(int parallelismType)` -> `void`
- `setProgressive_source_flag(boolean progressive_source_flag)` -> `void`
- `setTemporalIdNested(boolean temporalIdNested)` -> `void`
- `toString()` -> `String`
- `write(ByteBuffer byteBuffer)` -> `void`

## `org.telegram.messenger.video.HevcDecoderConfigurationRecord$Array`
- `equals(Object o)` -> `boolean`
- `hashCode()` -> `int`
- `toString()` -> `String`

## `org.telegram.messenger.video.InputSurface`
- `getSurface()` -> `Surface`
- `makeCurrent()` -> `void`
- `release()` -> `void`
- `setPresentationTime(long nsecs)` -> `void`
- `swapBuffers()` -> `boolean`

## `org.telegram.messenger.video.MP4Builder`
- `addTrack(MediaFormat mediaFormat, boolean isAudio)` -> `int`
- `createCtts(Track track, SampleTableBox stbl)` -> `void`
- `createFileTypeBox(boolean hevc)` -> `FileTypeBox`
- `createMovie(Mp4Movie mp4Movie, boolean split, boolean hevc)` -> `MP4Builder`
- `createMovieBox(Mp4Movie movie)` -> `MovieBox`
- `createSidx(Track track, SampleTableBox stbl)` -> `void`
- `createStbl(Track track)` -> `Box`
- `createStco(Track track, SampleTableBox stbl)` -> `void`
- `createStsc(Track track, SampleTableBox stbl)` -> `void`
- `createStsd(Track track, SampleTableBox stbl)` -> `void`
- `createStss(Track track, SampleTableBox stbl)` -> `void`
- `createStsz(Track track, SampleTableBox stbl)` -> `void`
- `createStts(Track track, SampleTableBox stbl)` -> `void`
- `createTrackBox(Track track, Mp4Movie movie)` -> `TrackBox`
- `finishMovie()` -> `void`
- `finishMovie(File into)` -> `void`
- `static gcd(long a, long b)` -> `long`
- `getLastFrameTimestamp(int trackIndex)` -> `long`
- `getTimescale(Mp4Movie mp4Movie)` -> `long`
- `setAllowSyncFiles(boolean allowSyncFiles)` -> `void`
- `writeSampleData(int trackIndex, ByteBuffer byteBuf, MediaCodec.BufferInfo bufferInfo, boolean writeLength)` -> `long`

## `org.telegram.messenger.video.MP4Builder$InterleaveChunkMdat`
- `getBox(WritableByteChannel writableByteChannel)` -> `void`
- `getContentSize()` -> `long`
- `getOffset()` -> `long`
- `getParent()` -> `Container`
- `getSize()` -> `long`
- `getType()` -> `String`
- `parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser)` -> `void`
- `setContentSize(long contentSize)` -> `void`
- `setDataOffset(long offset)` -> `void`
- `setParent(Container parent)` -> `void`

## `org.telegram.messenger.video.MediaCodecPlayer`
- `ensure(long ms)` -> `boolean`
- `getHeight()` -> `int`
- `getOrientation()` -> `int`
- `getOrientedHeight()` -> `int`
- `getOrientedWidth()` -> `int`
- `getWidth()` -> `int`
- `release()` -> `void`

## `org.telegram.messenger.video.MediaCodecVideoConvertor`
- `convertVideo(ConvertVideoParams convertVideoParams)` -> `boolean`
- `static cutOfNalData(String outputMimeType, ByteBuffer encodedData, MediaCodec.BufferInfo info)` -> `void`
- `getLastFrameTimestamp()` -> `long`

## `org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams`
- `static of(String videoPath, File cacheFile, long videoOffset, int rotationValue, boolean isSecret, int originalWidth, int originalHeight, int resultWidth, int resultHeight, int framerate, int bitrate, int originalBitrate, long startTime, long endTime, long avatarStartTime, boolean needCompress, long duration, MediaController.VideoConvertorListener callback, VideoEditedInfo info)` -> `ConvertVideoParams`

## `org.telegram.messenger.video.MediaCodecVideoConvertor$Muxer`
- `addTrack(MediaFormat format, boolean isAudio)` -> `int`
- `finishMovie()` -> `void`
- `getLastFrameTimestamp(int trackIndex, MediaCodec.BufferInfo bufferInfo)` -> `long`
- `start()` -> `void`
- `writeSampleData(int trackIndex, ByteBuffer byteBuf, MediaCodec.BufferInfo bufferInfo, boolean writeLength)` -> `long`

## `org.telegram.messenger.video.Mp4Movie`
- `addSample(int trackIndex, long offset, MediaCodec.BufferInfo bufferInfo)` -> `void`
- `addTrack(MediaFormat mediaFormat, boolean isAudio)` -> `int`
- `getCacheFile()` -> `File`
- `getHeight()` -> `int`
- `getLastFrameTimestamp(int trackIndex)` -> `long`
- `getMatrix()` -> `Matrix`
- `getTracks()` -> `ArrayList<Track>`
- `getWidth()` -> `int`
- `setCacheFile(File file)` -> `void`
- `setRotation(int angle)` -> `void`
- `setSize(int w, int h)` -> `void`

## `org.telegram.messenger.video.OutputSurface`
- `awaitNewImage()` -> `void`
- `changeFragmentShader(String fragmentExternalShader, String fragmentShader, boolean is300)` -> `void`
- `getSurface()` -> `Surface`
- `onFrameAvailable(SurfaceTexture st)` -> `void`
- `release()` -> `void`
- `supportsEXTYUV()` -> `boolean`

## `org.telegram.messenger.video.Sample`
- `getOffset()` -> `long`
- `getSize()` -> `long`

## `org.telegram.messenger.video.TextureRenderer`
- `changeFragmentShader(String fragmentExternalShader, String fragmentShader, boolean is300)` -> `void`
- `getTextureId()` -> `int`
- `release()` -> `void`
- `setBreakStrategy(EditTextOutline editText)` -> `void`
- `surfaceCreated()` -> `void`

## `org.telegram.messenger.video.Track`
- `addSample(long offset, MediaCodec.BufferInfo bufferInfo)` -> `void`
- `getCreationTime()` -> `Date`
- `getDuration()` -> `long`
- `getHandler()` -> `String`
- `getHeight()` -> `int`
- `getLastFrameTimestamp()` -> `long`
- `getMediaHeaderBox()` -> `AbstractMediaHeaderBox`
- `getSampleCompositions()` -> `int[]`
- `getSampleDescriptionBox()` -> `SampleDescriptionBox`
- `getSampleDurations()` -> `long[]`
- `getSamples()` -> `ArrayList<Sample>`
- `getSyncSamples()` -> `long[]`
- `getTimeScale()` -> `int`
- `getTrackId()` -> `long`
- `getVolume()` -> `float`
- `getWidth()` -> `int`
- `isAudio()` -> `boolean`
- `prepare()` -> `void`

## `org.telegram.messenger.video.VUIParameters`
- `toString()` -> `String`

## `org.telegram.messenger.video.VUIParameters$BitstreamRestriction`
- `toString()` -> `String`

## `org.telegram.messenger.video.VideoAds`
- `static dropCache()` -> `void`
- `isPopupShown()` -> `boolean`
- `logSponsoredClicked(TLRPC.TL_sponsoredMessage ad)` -> `void`
- `logSponsoredShown(TLRPC.TL_sponsoredMessage ad)` -> `void`
- `static make(int currentAccount, long dialogId, int msg_id, BulletinFactory bulletinFactory)` -> `VideoAds`
- `setPauseOnPopupCallback(Runnable onPopupCallback)` -> `void`
- `setWaitingPaused(boolean paused)` -> `void`
- `stop()` -> `void`

## `org.telegram.messenger.video.VideoAds$VideoAdsLocation`
- `equals(Object o)` -> `boolean`
- `hashCode()` -> `int`

## `org.telegram.messenger.video.VideoFramesRewinder`
- `clearCurrent()` -> `void`
- `isReady()` -> `boolean`
- `release()` -> `void`
- `seek(long position, float currentSpeed)` -> `void`
- `setParentView(View view)` -> `void`
- `setup(File file)` -> `void`

## `org.telegram.messenger.video.WebmEncoder`
- `static convert(MediaCodecVideoConvertor.ConvertVideoParams params, int triesLeft)` -> `boolean`

## `org.telegram.messenger.video.WebmEncoder$FrameDrawer`
- `setBreakStrategy(EditTextOutline editText)` -> `void`

## `org.telegram.messenger.wallpaper.pgm.PGMImage`
- `static read(InputStream in)` -> `Bitmap`
- `static read(InputStream in, List<String> comments)` -> `Bitmap`
- `static write(Bitmap bmp, OutputStream out)` -> `void`
- `static write(Bitmap bmp, OutputStream out, List<String> comments)` -> `void`

## `org.telegram.ui.AccountFrozenAlert`
- `static isSpamBot(int currentAccount, TLRPC.User user)` -> `boolean`

## `org.telegram.ui.Adapters.BaseLocationAdapter`
- `isSearching()` -> `boolean`

## `org.telegram.ui.Adapters.DialogsSearchAdapter`
- `addHashtagsFromMessage(CharSequence message)` -> `void`
- `hasRecentSearch()` -> `boolean`
- `loadMoreSearchMessages()` -> `void`
- `loadRecentSearch()` -> `void`
- `static loadRecentSearch(int currentAccount, int dialogsType, OnRecentSearchLoaded callback)` -> `void`
- `putRecentSearch(final long did, TLObject object)` -> `void`
- `static putRecentSearch(int currentAccount, long did)` -> `void`
- `removeAd(TLRPC.TL_sponsoredPeer peer)` -> `void`
- `removeAllAds()` -> `void`
- `removeRecentSearch(long did)` -> `void`

## `org.telegram.ui.Adapters.LocationActivityAdapter`
- `fetchLocationAddress()` -> `void`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `setChatLocation(TLRPC.TL_channelLocation location)` -> `void`
- `setMessageObject(MessageObject messageObject)` -> `void`

## `org.telegram.ui.Adapters.LocationActivitySearchAdapter`
- `isEmpty()` -> `boolean`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.Adapters.MentionsAdapter`
- `addHashtagsFromMessage(CharSequence message)` -> `void`

## `org.telegram.ui.Adapters.SearchAdapterHelper`
- `addGroupMembers(ArrayList<TLObject> participants)` -> `void`
- `addHashtagsFromMessage(CharSequence message)` -> `void`
- `getLastFoundUsername()` -> `String`
- `isSearchInProgress()` -> `boolean`
- `loadRecentHashtags()` -> `boolean`
- `removeUserId(long userId)` -> `void`

## `org.telegram.ui.Adapters.SearchAdapterHelper$SearchAdapterHelperDelegate`
- `canApplySearchResults(int searchId)` -> `default boolean`
- `getExcludeUsers()` -> `default LongSparseArray<TLRPC.User>`

## `org.telegram.ui.ArticleViewer`
- `static addBookmark(String url, int currentAccount, FrameLayout container, Sheet sheet, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `cancelCheckLongPress()` -> `void`
- `static checkLayoutForLinks(IArticleViewer parent, WebpageAdapter adapter, MotionEvent event, View parentView, DrawingText drawingText, int layoutX, int layoutY)` -> `boolean`
- `checkLayoutForLinks(MotionEvent event, View parentView)` -> `void`
- `static hasInstance()` -> `boolean`
- `static loadChannel(IArticleViewer parent, final BlockChannelCell cell, WebpageAdapter adapter, TLRPC.Chat channel)` -> `void`

## `org.telegram.ui.ArticleViewer$PageLayout`
- `addProgress(float delta)` -> `void`
- `forward()` -> `void`
- `hasBackButton()` -> `boolean`
- `hasForwardButton()` -> `boolean`
- `loadInstant()` -> `WebInstantView.Loader`

## `org.telegram.ui.ArticleViewer$RealPageBlocksAdapter`
- `isHardwarePlayer(int index)` -> `boolean`
- `isVideo(int index)` -> `boolean`

## `org.telegram.ui.ArticleViewer$Sheet`
- `checkFullyVisible()` -> `void`
- `checkNavColor()` -> `void`
- `isAttachedLightStatusBar()` -> `boolean`
- `isFullSize()` -> `boolean`
- `isFullyVisible()` -> `boolean`
- `isShown()` -> `boolean`
- `saveState()` -> `BottomSheetTabs.WebTabData`

## `org.telegram.ui.ArticleViewer$WebPageUtils`
- `static isVideo(TLObject page, long id)` -> `boolean`
- `static isVideo(TL_iv.RichMessage richMessage, TL_iv.PageBlock block)` -> `boolean`
- `static isVideo(TLRPC.WebPage page, TL_iv.PageBlock block)` -> `boolean`

## `org.telegram.ui.ArticleViewer$WindowView`
- `requestDisallowInterceptTouchEvent(boolean disallowIntercept)` -> `void`

## `org.telegram.ui.AvatarPreviewPagerIndicator`
- `saveCurrentPageProgress()` -> `void`

## `org.telegram.ui.AvatarPreviewer`
- `static canPreview(Data data)` -> `boolean`
- `static hasVisibleInstance()` -> `boolean`
- `isVisible()` -> `boolean`

## `org.telegram.ui.AvatarPreviewer$ChatInfoLoadTask`
- `load()` -> `void`

## `org.telegram.ui.AvatarPreviewer$InfoLoadTask`
- `cancel()` -> `void`
- `load(Consumer<B> onResult)` -> `void`

## `org.telegram.ui.AvatarPreviewer$UserInfoLoadTask`
- `load()` -> `void`

## `org.telegram.ui.AvatarSpan`
- `static checkSpansParent(CharSequence cs, View parent)` -> `void`
- `setChat(TLRPC.Chat chat)` -> `void`
- `setUser(TLRPC.User user)` -> `void`

## `org.telegram.ui.BasePermissionsActivity`
- `checkPermissionsResult(int requestCode, String[] permissions, int[] grantResults)` -> `boolean`

## `org.telegram.ui.BoostsActivity$ItemInternal`
- `hashCode()` -> `int`

## `org.telegram.ui.Business.AwayMessagesActivity`
- `hasChanges()` -> `boolean`

## `org.telegram.ui.Business.BusinessChatbotController`
- `load(Utilities.Callback<TL_account.connectedBots> callback)` -> `void`

## `org.telegram.ui.Business.BusinessIntroActivity`
- `hasChanges()` -> `boolean`
- `isEmpty()` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`

## `org.telegram.ui.Business.BusinessLinksController`
- `canAddNew()` -> `boolean`
- `deleteLinkUndoable(BaseFragment fragment, String slug)` -> `void`
- `editLinkMessage(String slug, String message, ArrayList<TLRPC.MessageEntity> entities, Runnable onDone)` -> `void`
- `editLinkTitle(String slug, String title)` -> `void`
- `load(boolean forceReload)` -> `void`

## `org.telegram.ui.Business.BusinessRecipientsHelper`
- `hasChanges()` -> `boolean`

## `org.telegram.ui.Business.ChatbotSheet`
- `canDismissWithSwipe()` -> `boolean`
- `canDismissWithTouchOutside()` -> `boolean`

## `org.telegram.ui.Business.ChatbotsActivity`
- `hasChanges()` -> `boolean`

## `org.telegram.ui.Business.GreetMessagesActivity`
- `hasChanges()` -> `boolean`

## `org.telegram.ui.Business.LocationActivity`
- `hasChanges()` -> `boolean`

## `org.telegram.ui.Business.OpeningHoursActivity`
- `hasChanges()` -> `boolean`

## `org.telegram.ui.Business.QuickRepliesController`
- `canAddNew()` -> `boolean`
- `checkLocalMessages(ArrayList<MessageObject> messages)` -> `void`
- `deleteLocalMessage(int messageId)` -> `void`
- `deleteLocalMessages(ArrayList<Integer> messages)` -> `void`
- `deleteLocalReply(String name)` -> `void`
- `deleteReplies(ArrayList<Integer> ids)` -> `void`
- `hasReplies()` -> `boolean`
- `isNameBusy(String name, int exceptId)` -> `boolean`
- `static isSpecial(String name)` -> `boolean`
- `load()` -> `void`
- `processUpdate(TLRPC.Update update, String quick_reply_shortcut, int quick_reply_shortcut_id)` -> `boolean`
- `removeReply(long topicId)` -> `void`
- `sendQuickReplyTo(long dialogId, QuickRepliesController.QuickReply reply)` -> `void`

## `org.telegram.ui.Business.QuickRepliesController$QuickReply`
- `getMessagesCount()` -> `int`
- `getTopMessageId()` -> `int`
- `isSpecial()` -> `boolean`

## `org.telegram.ui.Business.TimezonesController`
- `load()` -> `void`

## `org.telegram.ui.CacheChatsExceptionsFragment$Adapter`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.CacheControlActivity$DialogFileEntities`
- `addFile(CacheModel.FileInfo file, int type)` -> `void`
- `isEmpty()` -> `boolean`
- `removeFile(CacheModel.FileInfo fileInfo)` -> `void`

## `org.telegram.ui.CacheControlActivity$ListAdapter`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.CachedMediaLayout$BaseFilesAdapter`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.CachedMediaLayout$MediaAdapter`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.CastSync`
- `static check(int type)` -> `void`
- `static isActive()` -> `boolean`
- `static isPlaying()` -> `boolean`
- `static isUpdatePending()` -> `boolean`

## `org.telegram.ui.Cells.AboutLinkCell`
- `processColor(int color)` -> `int`

## `org.telegram.ui.Cells.AdminedChannelCell`
- `hasOverlappingRendering()` -> `boolean`

## `org.telegram.ui.Cells.ArchiveHintCell$Adapter`
- `isViewFromObject(View view, Object object)` -> `boolean`
- `saveState()` -> `Parcelable`

## `org.telegram.ui.Cells.BaseCell`
- `cancelCheckLongPress()` -> `void`
- `hasOverlappingRendering()` -> `boolean`

## `org.telegram.ui.Cells.BotButton`
- `hasPositionFlag(int flag)` -> `boolean`

## `org.telegram.ui.Cells.ChannelRecommendationsCell`
- `checkTouchEvent(MotionEvent ev)` -> `boolean`
- `isExpanded()` -> `boolean`
- `setMessageObject(MessageObject messageObject)` -> `void`

## `org.telegram.ui.Cells.ChatActionCell`
- `canSwipeGramTransferReply(float x, float y)` -> `boolean`
- `checkUnreadReactions(float clipTop, int clipBottom)` -> `boolean`
- `hasButton()` -> `boolean`
- `hasStarGiftLayout()` -> `boolean`
- `markReactionsAsRead()` -> `void`

## `org.telegram.ui.Cells.ChatActionCell$ChatActionCellDelegate`
- `canDrawOutboundsContent()` -> `default boolean`
- `getDialogId()` -> `default long`

## `org.telegram.ui.Cells.ChatLoadingCell`
- `hasGradientService()` -> `boolean`

## `org.telegram.ui.Cells.CheckBoxCell`
- `hasIcon()` -> `boolean`

## `org.telegram.ui.Cells.DialogMeUrlCell`
- `hasOverlappingRendering()` -> `boolean`

## `org.telegram.ui.Cells.GroupMedia`
- `checkBlurBitmap()` -> `void`
- `setMessageObject(MessageObject messageObject, boolean pinnedBottom, boolean pinnedTop)` -> `void`

## `org.telegram.ui.Cells.IMessageCell`
- `shouldDrawAlphaLayer()` -> `default boolean`

## `org.telegram.ui.Cells.PhotoAttachPhotoCell`
- `canRevealSpoiler()` -> `boolean`

## `org.telegram.ui.Cells.PollEditTextCell`
- `addAttachView()` -> `View`
- `addTextChangedListener(TextWatcher watcher)` -> `void`
- `shouldShowCheckBox()` -> `boolean`

## `org.telegram.ui.Cells.SharedDocumentCell`
- `requestLayout()` -> `void`

## `org.telegram.ui.Cells.SharedLinkCell`
- `cancelCheckLongPress()` -> `void`

## `org.telegram.ui.Cells.SharedPhotoVideoCell`
- `requestLayout()` -> `void`

## `org.telegram.ui.Cells.SharedPhotoVideoCell2`
- `canRevealSpoiler()` -> `boolean`

## `org.telegram.ui.Cells.TextCell`
- `processColor(int color)` -> `int`

## `org.telegram.ui.Cells.TextDetailCell`
- `hasImage()` -> `boolean`
- `processColor(int color)` -> `int`

## `org.telegram.ui.Cells.TextSelectionHelper`
- `canCopy()` -> `boolean`
- `canCut()` -> `boolean`
- `canPaste()` -> `boolean`
- `canSelect(int newSelection)` -> `boolean`
- `canShowActions()` -> `boolean`
- `canShowQuote()` -> `boolean`
- `cancelTextSelectionRunnable()` -> `void`
- `checkSelectionCancel(MotionEvent e)` -> `void`
- `isInSelectionMode()` -> `boolean`
- `isSelectable(View child)` -> `boolean`
- `isSelected(MessageObject messageObject)` -> `boolean`
- `isTryingSelect()` -> `boolean`

## `org.telegram.ui.Cells.TextSelectionHelper$ArticleTextSelectionHelper`
- `canSelect(int newSelection)` -> `boolean`
- `canShowActions()` -> `boolean`

## `org.telegram.ui.Cells.TextSelectionHelper$ChatListTextSelectionHelper`
- `cancelAllAnimators()` -> `void`
- `checkDataChanged(MessageObject messageObject)` -> `void`

## `org.telegram.ui.Cells.TextSelectionHelper$PathCopyTo`
- `addRect(float left, float top, float right, float bottom, @NonNull Direction dir)` -> `void`

## `org.telegram.ui.Cells.TextSelectionHelper$PathWithSavedBottom`
- `addRect(float left, float top, float right, float bottom, Direction dir)` -> `void`

## `org.telegram.ui.Cells.TextSelectionHelper$ScalablePath`
- `addRect(float left, float top, float right, float bottom, Direction dir)` -> `void`

## `org.telegram.ui.Cells.TextSelectionHelper$TextSelectionOverlay`
- `checkCancel(float lastMotionX, float lastMotionY, boolean inParent)` -> `void`
- `checkCancelAction(MotionEvent ev)` -> `void`
- `checkOnTap(MotionEvent event)` -> `boolean`

## `org.telegram.ui.Cells.UserInfoCell`
- `hasGradientService()` -> `boolean`

## `org.telegram.ui.ChannelAdminLogActivity`
- `saveScrollPosition(boolean fromTop)` -> `void`

## `org.telegram.ui.ChannelBoostLayout$ItemInternal`
- `hashCode()` -> `int`

## `org.telegram.ui.ChannelCreateActivity`
- `saveSelfArgs(Bundle args)` -> `void`

## `org.telegram.ui.ChannelMonetizationLayout$ChannelTransactionsView`
- `hasTransactions()` -> `boolean`
- `hasTransactions(int type)` -> `boolean`

## `org.telegram.ui.ChannelMonetizationLayout$ChannelTransactionsView$Page`
- `checkMore()` -> `void`

## `org.telegram.ui.Charts.BaseChartView`
- `requestLayout()` -> `void`
- `saveState(Bundle outState)` -> `void`

## `org.telegram.ui.ChatBackgroundDrawable`
- `static hash(TLRPC.WallPaperSettings settings)` -> `String`

## `org.telegram.ui.ChatEditActivity`
- `saveSelfArgs(Bundle args)` -> `void`

## `org.telegram.ui.ChatEditTypeActivity`
- `hasActiveLink()` -> `boolean`

## `org.telegram.ui.ChatPullingDownDrawable`
- `static getNextUnreadDialog(long currentDialogId, int folderId, int filterId)` -> `TLRPC.Dialog`
- `static getNextUnreadDialog(long currentDialogId, int folderId, int filterId, boolean searchNext, int[] params)` -> `TLRPC.Dialog`

## `org.telegram.ui.ChatUsersActivity`
- `canBeginSlide()` -> `boolean`
- `hasSelectType()` -> `boolean`
- `saveState()` -> `DiffCallback`

## `org.telegram.ui.ChatUsersActivity$SearchAdapter`
- `removeUserId(long userId)` -> `void`

## `org.telegram.ui.CodeFieldContainer`
- `processNextPressed()` -> `void`

## `org.telegram.ui.CodeNumberField`
- `requestFocus(int direction, Rect previouslyFocusedRect)` -> `boolean`

## `org.telegram.ui.Components.AIEditorAlert$Tabs`
- `addTab(int iconResId, CharSequence text, Utilities.Callback<Integer> onClick)` -> `Tab`
- `addTab(String emoji, CharSequence text, Long documentId, Utilities.Callback<Integer> onClick)` -> `Tab`
- `addTab(TL_aicompose.AiComposeTone tone, Utilities.Callback<TL_aicompose.AiComposeTone> onClick)` -> `Tab`

## `org.telegram.ui.Components.AdminLogFilterAlert2`
- `canDismissWithSwipe()` -> `boolean`

## `org.telegram.ui.Components.AlertsCreator`
- `static checkFormattedDateInput(ButtonWithCounterView button, NumberPicker dayPicker, NumberPicker monthPicker, NumberPicker hourPicker, NumberPicker minutePicker)` -> `long`
- `static checkPollCloseCustomDeadline(TextView button, NumberPicker dayPicker, NumberPicker hourPicker, NumberPicker minutePicker)` -> `void`
- `static checkRestrictedInviteUsers(int currentAccount, TLRPC.Chat currentChat, TLRPC.TL_messages_invitedUsers invitedUsers)` -> `void`
- `static checkScheduleDate(TextView button, TextView infoText, int type, NumberPicker dayPicker, NumberPicker hourPicker, NumberPicker minutePicker)` -> `boolean`
- `static checkScheduleDate(TextView button, TextView infoText, long maxDate, int type, NumberPicker dayPicker, NumberPicker hourPicker, NumberPicker minutePicker)` -> `boolean`
- `static checkScheduleDate(TextView button, TextView infoText, long minDateSeconds, long maxDate, int type, NumberPicker dayPicker, NumberPicker hourPicker, NumberPicker minutePicker)` -> `boolean`
- `static checkSlowMode(Context context, int currentAccount, long did, boolean few)` -> `boolean`
- `static processError(int currentAccount, TLRPC.TL_error error, BaseFragment fragment, TLObject request, Object... args)` -> `Dialog`

## `org.telegram.ui.Components.AvatarConstructorFragment`
- `cancelExpandAnimator()` -> `void`

## `org.telegram.ui.Components.AvatarConstructorFragment$BackgroundGradient`
- `hashCode()` -> `int`

## `org.telegram.ui.Components.AvatarConstructorFragment$PreviewView`
- `hasAnimation()` -> `boolean`

## `org.telegram.ui.Components.AvatarsDrawable`
- `setShowSavedMessages(boolean showSavedMessages)` -> `void`

## `org.telegram.ui.Components.BackButtonMenu`
- `static addToPulledDialogs(BaseFragment thisFragment, int stackIndex, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic topic, long dialogId, int folderId, int filterId)` -> `void`
- `static getStackedHistoryDialogs(BaseFragment thisFragment, long ignoreDialogId)` -> `ArrayList<PulledDialog>`

## `org.telegram.ui.Components.BottomSheetWithRecyclerListView`
- `canDismissWithSwipe()` -> `boolean`
- `canHighlightChildAt(View child, float x, float y)` -> `boolean`
- `saveScrollPosition()` -> `void`

## `org.telegram.ui.Components.BottomSheetWithRecyclerListView$Params$Builder`
- `hasFixedSize(boolean hasFixedSize)` -> `Builder`

## `org.telegram.ui.Components.BubbleCounterPath`
- `static addBubbleRect(Path path, RectF bounds, float radius)` -> `void`

## `org.telegram.ui.Components.Bulletin`
- `static addDelegate(BaseFragment fragment, @NonNull Delegate delegate)` -> `void`
- `static addDelegate(FrameLayout containerLayout, @NonNull Delegate delegate)` -> `void`
- `isShowing()` -> `boolean`
- `static removeDelegate(BaseFragment fragment)` -> `void`
- `static removeDelegate(FrameLayout containerLayout)` -> `void`

## `org.telegram.ui.Components.Bulletin$BulletinWindow$BulletinWindowLayout`
- `addView(View child)` -> `void`
- `removeView(View child)` -> `void`

## `org.telegram.ui.Components.Bulletin$Layout`
- `addCallback(@NonNull Callback callback)` -> `void`
- `removeCallback(@NonNull Callback callback)` -> `void`

## `org.telegram.ui.Components.BulletinFactory`
- `static canShowBulletin(BaseFragment fragment)` -> `boolean`

## `org.telegram.ui.Components.ButtonBounce`
- `isPressed()` -> `boolean`
- `isPressedProgress()` -> `float`

## `org.telegram.ui.Components.ButtonSpan$TextViewButtons`
- `addButton(ButtonSpan span)` -> `void`

## `org.telegram.ui.Components.CanvasButton`
- `addRect(RectF rectF)` -> `void`
- `cancelRipple()` -> `void`
- `checkTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.ui.Components.ChatAvatarContainer`
- `canSearch()` -> `boolean`
- `checkAndUpdateAvatar()` -> `void`
- `hasVisibleAvatar()` -> `boolean`

## `org.telegram.ui.Components.ChatGreetingsView`
- `requestLayout()` -> `void`

## `org.telegram.ui.Components.ChatSearchTabs`
- `onShownUpdate(boolean finish)` -> `void`

## `org.telegram.ui.Components.CheckBox2`
- `hasIcon()` -> `boolean`

## `org.telegram.ui.Components.CheckBoxBase`
- `cancelCheckAnimator()` -> `void`
- `isChecked()` -> `boolean`

## `org.telegram.ui.Components.CornerPath`
- `addRect(@NonNull RectF rect, @NonNull Direction dir)` -> `void`
- `addRect(float left, float top, float right, float bottom, @NonNull Direction dir)` -> `void`

## `org.telegram.ui.Components.Crop.CropGestureDetector`
- `isDragging()` -> `boolean`
- `isScaling()` -> `boolean`

## `org.telegram.ui.Components.Crop.CropTransform`
- `hasViewTransform()` -> `boolean`
- `isMirrored()` -> `boolean`

## `org.telegram.ui.Components.Crop.CropView`
- `static editBitmap(Context context, String path, Bitmap b, Canvas canvas, Bitmap canvasBitmap, Bitmap.CompressFormat format, Matrix stateMatrix, int contentWidth, int contentHeight, float stateScale, float rotation, float orientationOnly, float scale, boolean mirror, ArrayList<VideoEditedInfo.MediaEntity> entities, boolean clear)` -> `void`

## `org.telegram.ui.Components.CustomPhoneKeyboardView`
- `canScrollHorizontally(int direction)` -> `boolean`
- `checkFindEditText()` -> `void`

## `org.telegram.ui.Components.CustomPopupMenu`
- `isShowing()` -> `boolean`

## `org.telegram.ui.Components.DeleteMessagesBottomSheet`
- `static bannedRightsOr(TLRPC.TL_chatBannedRights left, TLRPC.TL_chatBannedRights right)` -> `TLRPC.TL_chatBannedRights`
- `canHighlightChildAt(View child, float x, float y)` -> `boolean`

## `org.telegram.ui.Components.DeleteMessagesBottomSheet$Action`
- `isExpandable()` -> `boolean`
- `isOneSelected()` -> `boolean`
- `isPresent()` -> `boolean`

## `org.telegram.ui.Components.DialogsBotsAdapter`
- `checkBottom()` -> `void`

## `org.telegram.ui.Components.DialogsBotsAdapter$PopularBots`
- `load()` -> `void`

## `org.telegram.ui.Components.DialogsChannelsAdapter`
- `checkBottom()` -> `void`
- `getChat(int position)` -> `TLRPC.Chat`

## `org.telegram.ui.Components.DialogsItemAnimator`
- `canReuseUpdatedViewHolder(ViewHolder viewHolder, List<Object> payloads)` -> `boolean`
- `cancelAll(List<ViewHolder> viewHolders)` -> `void`
- `isRunning()` -> `boolean`

## `org.telegram.ui.Components.EarListener`
- `isRaised()` -> `boolean`

## `org.telegram.ui.Components.EdgeEffectTrackerFactory`
- `addEdgeEffectListener(OnEdgeEffectListener listener)` -> `void`
- `hasVisibleEdges()` -> `boolean`
- `removeEdgeEffectListener(OnEdgeEffectListener listener)` -> `void`

## `org.telegram.ui.Components.EdgeEffectTrackerFactory$TrackingEdgeEffect`
- `isVisible()` -> `boolean`

## `org.telegram.ui.Components.EditTextBoldCursor`
- `addTextChangedListener(TextWatcher watcher)` -> `void`
- `hasErrorText()` -> `boolean`
- `removeCallbacks(Runnable action)` -> `boolean`
- `removeTextChangedListener(TextWatcher watcher)` -> `void`

## `org.telegram.ui.Components.EditTextCaption`
- `addStyle(int flag, int start, int end)` -> `void`
- `removeStyle(int flag, int start, int end)` -> `void`

## `org.telegram.ui.Components.EllipsizeSpanAnimator`
- `addView(View view)` -> `void`
- `removeView(View view)` -> `void`

## `org.telegram.ui.Components.EmbedBottomSheet`
- `canDismissWithSwipe()` -> `boolean`
- `canDismissWithTouchOutside()` -> `boolean`
- `checkInlinePermissions()` -> `boolean`

## `org.telegram.ui.Components.EmptyTextProgressView`
- `hasOverlappingRendering()` -> `boolean`
- `requestLayout()` -> `void`

## `org.telegram.ui.Components.FillLastGridLayoutManager`
- `canScrollVertically()` -> `boolean`
- `onItemsUpdated(RecyclerView recyclerView, int positionStart, int itemCount)` -> `void`
- `onItemsUpdated(RecyclerView recyclerView, int positionStart, int itemCount, Object payload)` -> `void`
- `shouldCalcLastItemHeight()` -> `boolean`

## `org.telegram.ui.Components.FillLastLinearLayoutManager`
- `canScrollVertically()` -> `boolean`
- `onItemsUpdated(RecyclerView recyclerView, int positionStart, int itemCount)` -> `void`
- `onItemsUpdated(RecyclerView recyclerView, int positionStart, int itemCount, Object payload)` -> `void`

## `org.telegram.ui.Components.FilterGLThread`
- `requestRender(final boolean updateBlur)` -> `void`
- `requestRender(final boolean updateBlur, final boolean force, boolean surface)` -> `void`

## `org.telegram.ui.Components.FilterShaders`
- `static loadShader(int type, String shaderCode)` -> `int`
- `onVideoFrameUpdate(float[] m)` -> `void`
- `requestUpdateBlurTexture()` -> `void`

## `org.telegram.ui.Components.FilterTabsView`
- `addTab(int id, int stableId, String text, ArrayList<TLRPC.MessageEntity> entities, boolean noanimate, boolean isDefault, boolean isLocked)` -> `void`
- `addTab(int id, int stableId, CharSequence text, boolean noanimate, boolean isDefault, boolean isLocked)` -> `void`
- `checkTabsCounter()` -> `void`
- `hasTab(int id)` -> `boolean`
- `removeTabs()` -> `void`
- `requestLayout()` -> `void`

## `org.telegram.ui.Components.FiltersListBottomSheet`
- `canDismissWithSwipe()` -> `boolean`

## `org.telegram.ui.Components.FloatSeekBarAccessibilityDelegate`
- `canScrollBackward(View host)` -> `boolean`
- `canScrollForward(View host)` -> `boolean`

## `org.telegram.ui.Components.FloatingDebug.FloatingDebugController`
- `static isActive()` -> `boolean`

## `org.telegram.ui.Components.FloatingDebug.FloatingDebugView`
- `saveConfig()` -> `void`

## `org.telegram.ui.Components.ForegroundDetector`
- `addListener(Listener listener)` -> `void`
- `isBackground()` -> `boolean`
- `isForeground()` -> `boolean`
- `isWasInBackground(boolean reset)` -> `boolean`
- `removeListener(Listener listener)` -> `void`

## `org.telegram.ui.Components.Forum.ForumBubbleDrawable`
- `addParent(View view)` -> `void`

## `org.telegram.ui.Components.Forum.ForumUtilities`
- `static getChatActivityForTopic(BaseFragment baseFragment, long chatId, TLRPC.TL_forumTopic topic, int fromMessageId, Bundle args)` -> `ChatActivity`
- `static isTopicCreateMessage(MessageObject message)` -> `boolean`

## `org.telegram.ui.Components.Forum.MessageTopicButton`
- `checkTouchEvent(MotionEvent event)` -> `boolean`

## `org.telegram.ui.Components.FragmentContextView`
- `checkCall(boolean create)` -> `void`
- `checkImport(boolean create)` -> `void`
- `onPanTranslationUpdate(float y)` -> `void`

## `org.telegram.ui.Components.FragmentContextViewWavesDrawable`
- `addParent(View parent)` -> `void`
- `removeParent(View parent)` -> `void`

## `org.telegram.ui.Components.FragmentContextViewWavesDrawable$WeavingState`
- `checkColor()` -> `void`

## `org.telegram.ui.Components.FragmentFloatingButton`
- `addAdditionalView(View view)` -> `void`

## `org.telegram.ui.Components.FragmentSearchField`
- `addSearchFilter(FiltersView.MediaFilterData filter)` -> `void`
- `removeSearchFilter(FiltersView.MediaFilterData filter)` -> `void`

## `org.telegram.ui.Components.FragmentSpansContainer`
- `addSpan(final GroupCreateSpan span)` -> `void`
- `removeAllSpans(boolean animated)` -> `void`
- `removeSpan(final GroupCreateSpan span)` -> `void`
- `requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate)` -> `boolean`

## `org.telegram.ui.Components.FragmentSpansContainer$SpansContainer`
- `addSpan(final GroupCreateSpan span)` -> `void`
- `removeAllSpans(boolean animated)` -> `void`
- `removeSpan(final GroupCreateSpan span)` -> `void`

## `org.telegram.ui.Components.GestureDetector2`
- `isLongpressEnabled()` -> `boolean`

## `org.telegram.ui.Components.GestureDetector2$OnDoubleTapListener`
- `canDoubleTap(MotionEvent e)` -> `default boolean`

## `org.telegram.ui.Components.GestureDetectorFixDoubleTap`
- `isLongpressEnabled()` -> `boolean`

## `org.telegram.ui.Components.GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase`
- `isLongpressEnabled()` -> `boolean`

## `org.telegram.ui.Components.GestureDetectorFixDoubleTap$OnGestureListener`
- `hasDoubleTap(MotionEvent e)` -> `boolean`

## `org.telegram.ui.Components.GroupCreateSpan`
- `cancelDeleteAnimation()` -> `void`

## `org.telegram.ui.Components.GroupedPhotosListView`
- `hasPhotos()` -> `boolean`

## `org.telegram.ui.Components.HashtagsSearchAdapter`
- `cancel()` -> `void`
- `checkBottom()` -> `void`

## `org.telegram.ui.Components.ImageUpdater`
- `cancel()` -> `void`
- `isCanceled()` -> `boolean`
- `isUploadingImage()` -> `boolean`
- `processEntry(MediaController.PhotoEntry photoEntry)` -> `void`
- `setUser(TLRPC.User user)` -> `void`

## `org.telegram.ui.Components.ImageUpdater$ImageUpdaterDelegate`
- `canFinishFragment()` -> `default boolean`

## `org.telegram.ui.Components.IntSeekBarAccessibilityDelegate`
- `canScrollBackward(View host)` -> `boolean`
- `canScrollForward(View host)` -> `boolean`

## `org.telegram.ui.Components.IntSize`
- `hashCode()` -> `int`

## `org.telegram.ui.Components.InviteLinkBottomSheet`
- `canDismissWithSwipe()` -> `boolean`
- `loadUsers()` -> `void`

## `org.telegram.ui.Components.InviteLinkBottomSheet$TimerPrivacyCell`
- `cancelTimer()` -> `void`

## `org.telegram.ui.Components.InviteMembersBottomSheet`
- `canGenerateLink()` -> `boolean`
- `hasLink()` -> `boolean`

## `org.telegram.ui.Components.InviteMembersBottomSheet$SpansContainer`
- `addSpan(final GroupCreateSpan span, boolean animated)` -> `void`
- `removeSpan(final GroupCreateSpan span)` -> `void`

## `org.telegram.ui.Components.ItemOptions`
- `add(CharSequence text, Runnable onClickListener)` -> `ItemOptions`
- `add(int iconResId, CharSequence text, Runnable onClickListener)` -> `ItemOptions`
- `add(int iconResId, CharSequence text, CharSequence subtext, Runnable onClickListener)` -> `ItemOptions`
- `add(Drawable icon, CharSequence text, Runnable onClickListener)` -> `ItemOptions`
- `add(int iconResId, CharSequence text, boolean isRed, Runnable onClickListener)` -> `ItemOptions`
- `add(int iconResId, CharSequence text, int color, Runnable onClickListener)` -> `ItemOptions`
- `add(int iconResId, CharSequence text, int iconColorKey, int textColorKey, Runnable onClickListener)` -> `ItemOptions`
- `add(int iconResId, Drawable iconDrawable, CharSequence text, int iconColorKey, int textColorKey, Runnable onClickListener)` -> `ItemOptions`
- `add(int iconResId, Drawable iconDrawable, CharSequence text, CharSequence subtext, int iconColorKey, int textColorKey, Runnable onClickListener)` -> `ItemOptions`
- `add()` -> `ActionBarMenuSubItem`
- `add(ActionBarMenuSubItem subItem)` -> `void`
- `add(CharSequence text, CharSequence subtext, Runnable onClickListener)` -> `ItemOptions`
- `addAccount(int account, boolean checked, Runnable onClickListener)` -> `ItemOptions`
- `static addAlbumsItemOptions(ItemOptions options, StoriesController.StoriesCollections collections, HashSet<Integer> checkedSet, boolean canAddNewAlbum, Runnable onAlbumAdd, Utilities.Callback<StoriesController.StoryAlbum> onChange)` -> `void`
- `addBot(TLRPC.TL_attachMenuBot bot, Runnable onClickListener, Runnable onLongClickRunnable)` -> `ItemOptions`
- `addChat(TLObject obj, boolean checked, Runnable onClickListener)` -> `ItemOptions`
- `addChecked(boolean checked, CharSequence text, Runnable onClickListener)` -> `ItemOptions`
- `addChecked(boolean checked, int iconResId, CharSequence text, Runnable onClickListener)` -> `ItemOptions`
- `addChecked(boolean checked, Drawable icon, CharSequence text, Runnable onClickListener)` -> `ItemOptions`
- `addChecked(boolean checked, CharSequence text, Runnable onClickListener, Runnable onLongClickRunnable)` -> `ItemOptions`
- `addChecked(boolean checked, int iconResId, CharSequence text, Runnable onClickListener, Runnable onLongClickRunnable)` -> `ItemOptions`
- `addChecked(boolean checked, int iconResId, Drawable icon, CharSequence text, Runnable onClickListener, Runnable onLongClickRunnable)` -> `ItemOptions`
- `addChecked()` -> `ActionBarMenuSubItem`
- `addCheckedIf(boolean condition, boolean checked, CharSequence text, Runnable onClickListener)` -> `ItemOptions`
- `addCheckedIf(boolean condition, boolean checked, CharSequence text, Runnable onClickListener, Runnable onLongClickRunnable)` -> `ItemOptions`
- `addDialog(int currentAccount, long dialogId, Runnable onClickListener)` -> `ItemOptions`
- `addFrom(ActionBarPopupWindow.ActionBarPopupWindowLayout popupLayout, ActionBar.ActionBarMenuOnItemClick clickListener)` -> `ItemOptions`
- `addGap()` -> `ItemOptions`
- `addGapIf(boolean condition)` -> `ItemOptions`
- `addIf(boolean condition, int iconResId, CharSequence text, boolean isRed, Runnable onClickListener)` -> `ItemOptions`
- `addIf(boolean condition, int iconResId, CharSequence text, Runnable onClickListener)` -> `ItemOptions`
- `addIf(boolean condition, int iconResId, Drawable iconDrawable, CharSequence text, Runnable onClickListener)` -> `ItemOptions`
- `addProfile(TLObject obj, CharSequence subtitle, Runnable onClickListener)` -> `ItemOptions`
- `addProfileCustom(TLObject obj, CharSequence text, Runnable onClickListener)` -> `ItemOptions`
- `addSpaceGap()` -> `ItemOptions`
- `addSpaceGap(boolean vertical)` -> `ItemOptions`
- `addText(CharSequence text, int textSizeDp)` -> `ItemOptions`
- `addText(CharSequence text, int textSizeDp, int maxWidth)` -> `ItemOptions`
- `addText(CharSequence text, int textSizeDp, Typeface typeface, int maxWidth)` -> `ItemOptions`
- `addView(View view)` -> `ItemOptions`
- `addView(View view, LinearLayout.LayoutParams lp)` -> `ItemOptions`
- `isShown()` -> `boolean`
- `putCheck()` -> `ItemOptions`
- `putPremiumLock(Runnable onLockClick)` -> `ItemOptions`

## `org.telegram.ui.Components.LinkActionView`
- `loadUsers(TLRPC.TL_chatInviteExported invite, long chatId)` -> `void`

## `org.telegram.ui.Components.LinkActionView$Delegate`
- `editLink()` -> `default void`
- `removeLink()` -> `default void`

## `org.telegram.ui.Components.LinkPath`
- `addRect(float left, float top, float right, float bottom, @NonNull Direction dir)` -> `void`
- `isUsingRoundRect()` -> `boolean`

## `org.telegram.ui.Components.LinkSpanDrawable$LinkCollector`
- `addLink(LinkSpanDrawable link)` -> `void`
- `addLink(LinkSpanDrawable link, Object obj)` -> `void`
- `addLoading(LoadingDrawable loadingDrawable)` -> `void`
- `addLoading(LoadingDrawable loadingDrawable, Object obj)` -> `void`
- `isEmpty()` -> `boolean`
- `removeLink(LinkSpanDrawable link)` -> `void`
- `removeLink(LinkSpanDrawable link, boolean animated)` -> `void`
- `removeLoading(LoadingDrawable loadingDrawable, boolean animated)` -> `void`

## `org.telegram.ui.Components.LinkSpanDrawable$LinksTextView`
- `hasLinks()` -> `boolean`
- `processColor(int color)` -> `int`

## `org.telegram.ui.Components.MarkdownParser`
- `static isExtensionMarkdown(String ext)` -> `boolean`
- `static isMarkdown(MessageObject msg)` -> `boolean`
- `static isMarkdown(ArrayList<TL_iv.PageBlock> blocks)` -> `boolean`
- `static isMimeMarkdown(String mime)` -> `boolean`

## `org.telegram.ui.Components.MediaActivity`
- `canBeginSlide()` -> `boolean`

## `org.telegram.ui.Components.MemberRequestsBottomSheet`
- `isNeedRestoreDialog()` -> `boolean`

## `org.telegram.ui.Components.MentionsContainerView`
- `canOpen()` -> `boolean`
- `onPanTransitionUpdate(float translationY)` -> `void`
- `requestLayout()` -> `void`

## `org.telegram.ui.Components.MentionsContainerView$Delegate`
- `addEmojiToRecent(String code)` -> `default void`
- `sendBotInlineResult(TLRPC.BotInlineResult botInlineResult, boolean notify, int scheduleDate)` -> `default void`

## `org.telegram.ui.Components.MentionsContainerView$MentionsListView`
- `requestLayout()` -> `void`

## `org.telegram.ui.Components.MenuToItemOptions`
- `add(int groupId, int itemId, int order, CharSequence title)` -> `MenuItem`
- `add(int groupId, int itemId, int order, int titleRes)` -> `MenuItem`
- `add(CharSequence title)` -> `MenuItem`
- `add(int titleRes)` -> `MenuItem`
- `addIntentOptions(int groupId, int itemId, int order, ComponentName caller, Intent[] specifics, Intent intent, int flags, MenuItem[] outSpecificItems)` -> `int`
- `addSubMenu(CharSequence title)` -> `SubMenu`
- `addSubMenu(int titleRes)` -> `SubMenu`
- `addSubMenu(int groupId, int itemId, int order, CharSequence title)` -> `SubMenu`
- `addSubMenu(int groupId, int itemId, int order, int titleRes)` -> `SubMenu`
- `hasVisibleItems()` -> `boolean`
- `isShortcutKey(int keyCode, KeyEvent event)` -> `boolean`
- `removeGroup(int groupId)` -> `void`
- `removeItem(int id)` -> `void`

## `org.telegram.ui.Components.MessagePreviewView`
- `removeForward()` -> `void`
- `removeLink()` -> `void`
- `removeQuote()` -> `void`
- `removeReply()` -> `void`

## `org.telegram.ui.Components.MessagePreviewView$TabsView`
- `addTab(int id, String text)` -> `void`

## `org.telegram.ui.Components.MotionBackgroundDrawable`
- `hasPattern()` -> `boolean`

## `org.telegram.ui.Components.NoClipCanvas`
- `isOpaque()` -> `boolean`
- `save()` -> `int`
- `saveLayer(@Nullable RectF bounds, @Nullable Paint paint, int saveFlags)` -> `int`
- `saveLayerAlpha(@Nullable RectF bounds, int alpha, int saveFlags)` -> `int`
- `saveLayerAlpha(float left, float top, float right, float bottom, int alpha)` -> `int`
- `saveLayerAlpha(float left, float top, float right, float bottom, int alpha, int saveFlags)` -> `int`

## `org.telegram.ui.Components.NumberPicker$PressedStateHelper`
- `cancel()` -> `void`

## `org.telegram.ui.Components.OtherDocumentPlaceholderDrawable`
- `checkFileExist()` -> `void`

## `org.telegram.ui.Components.Paint.Brush`
- `isEraser()` -> `boolean`

## `org.telegram.ui.Components.Paint.Brush$Eraser`
- `isEraser()` -> `boolean`

## `org.telegram.ui.Components.Paint.Input`
- `process(MotionEvent event, float scale)` -> `void`

## `org.telegram.ui.Components.Paint.PaintTypeface$NameRecord`
- `read(RandomAccessFile reader, int offset)` -> `String`

## `org.telegram.ui.Components.Paint.Painting`
- `isPaused()` -> `boolean`

## `org.telegram.ui.Components.Paint.PhotoFace`
- `isSufficient()` -> `boolean`

## `org.telegram.ui.Components.Paint.Point`
- `add(Point point)` -> `Point`

## `org.telegram.ui.Components.Paint.RenderState`
- `addPoint(PointF point, float size, float angle, float alpha, int index)` -> `boolean`
- `read()` -> `float`

## `org.telegram.ui.Components.Paint.RenderView`
- `shouldDraw()` -> `boolean`

## `org.telegram.ui.Components.Paint.RenderView$CanvasInternal`
- `requestRender()` -> `void`

## `org.telegram.ui.Components.Paint.ShapeDetector`
- `static isLearning(Context context)` -> `boolean`

## `org.telegram.ui.Components.Paint.ShapeInput`
- `process(MotionEvent event, float scale)` -> `void`

## `org.telegram.ui.Components.Paint.UndoStore`
- `canUndo()` -> `boolean`

## `org.telegram.ui.Components.Paint.Views.EntityView`
- `hasPanned()` -> `boolean`
- `hasTouchDown()` -> `boolean`

## `org.telegram.ui.Components.Paint.Views.EntityView$EntityViewDelegate`
- `isEntityDeletable()` -> `default boolean`

## `org.telegram.ui.Components.Paint.Views.LPhotoPaintView`
- `requestLayout()` -> `void`

## `org.telegram.ui.Components.Paint.Views.LinkPreview$WebPagePreview`
- `isPreviewEmpty()` -> `boolean`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.ui.Components.Paint.Views.LinkView`
- `hasColor()` -> `boolean`

## `org.telegram.ui.Components.Paint.Views.LocationView`
- `hasColor()` -> `boolean`

## `org.telegram.ui.Components.Paint.Views.MaskPaintView`
- `canUndo()` -> `boolean`
- `onRenderViewAlphaUpdate(ValueAnimator animation)` -> `void`

## `org.telegram.ui.Components.Paint.Views.PhotoView`
- `deleteSegmentedFile()` -> `void`
- `hasSegmentedImage()` -> `boolean`
- `saveSegmentedImage(int currentAccount)` -> `File`

## `org.telegram.ui.Components.Paint.Views.WeatherView`
- `hasColor()` -> `boolean`

## `org.telegram.ui.Components.PaintingOverlay`
- `requestLayout()` -> `void`

## `org.telegram.ui.Components.PathAnimator`
- `addSvgKeyFrame(String svg, float ms)` -> `void`

## `org.telegram.ui.Components.PermissionRequest`
- `static canAskPermission(String permission)` -> `boolean`
- `static hasPermission(String permission)` -> `boolean`
- `static requestPermission(String permission, Utilities.Callback<Boolean> whenDone)` -> `void`
- `static requestPermissions(String[] permissions, Utilities.Callback<int[]> whenDone)` -> `void`

## `org.telegram.ui.Components.PhonebookShareAlert`
- `canDismissWithSwipe()` -> `boolean`

## `org.telegram.ui.Components.PhotoCropView`
- `cancelThumbAnimation()` -> `void`

## `org.telegram.ui.Components.PhotoFilterView`
- `hasChanges()` -> `boolean`
- `shouldDrawCurvesPass()` -> `boolean`
- `shouldShowOriginal()` -> `boolean`

## `org.telegram.ui.Components.PhotoFilterView$CurvesToolValue`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `shouldBeSkipped()` -> `boolean`

## `org.telegram.ui.Components.PhotoFilterView$CurvesValue`
- `isDefault()` -> `boolean`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`
- `saveValues()` -> `void`

## `org.telegram.ui.Components.PollVotesAlert`
- `canDismissWithSwipe()` -> `boolean`

## `org.telegram.ui.Components.PostRunnableHolder`
- `cancel(Runnable runnable)` -> `void`

## `org.telegram.ui.Components.PostsSearchContainer`
- `requestLayout()` -> `void`

## `org.telegram.ui.Components.Premium.CarouselView$DrawingObject`
- `checkTap(float x, float y)` -> `boolean`

## `org.telegram.ui.Components.Premium.GLIcon.CoolDiamondIcon`
- `isReady()` -> `boolean`

## `org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer`
- `static checkGlError(String glOperation, int program)` -> `void`
- `static loadShader(int type, String shaderSrc)` -> `int`

## `org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView`
- `cancelAnimatons()` -> `void`
- `cancelIdleAnimation()` -> `void`
- `onSurfaceTextureUpdated(SurfaceTexture surface)` -> `void`

## `org.telegram.ui.Components.Premium.GLIcon.Icon3D`
- `loadFromAsset(Context context, String name)` -> `String`

## `org.telegram.ui.Components.Premium.GLIcon.WalletDiamondTextureView$Engine`
- `add(Target target)` -> `void`
- `remove(Target target)` -> `void`
- `requestFrame()` -> `void`

## `org.telegram.ui.Components.Premium.PremiumButtonView`
- `checkCounterView()` -> `void`

## `org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet`
- `canDismissWithSwipe()` -> `boolean`
- `checkTopOffset()` -> `void`

## `org.telegram.ui.Components.Premium.PremiumGradient`
- `checkIconColors()` -> `void`

## `org.telegram.ui.Components.Premium.boosts.BoostDialogs`
- `static checkReduceQuantity(List<Integer> sliderValues, Context context, Theme.ResourcesProvider resourcesProvider, List<TLRPC.TL_premiumGiftCodeOption> list, TLRPC.TL_premiumGiftCodeOption selected, Utilities.Callback<TLRPC.TL_premiumGiftCodeOption> onSuccess)` -> `boolean`
- `static checkReduceUsers(Context context, Theme.ResourcesProvider resourcesProvider, List<TLRPC.TL_premiumGiftCodeOption> list, TLRPC.TL_premiumGiftCodeOption selected)` -> `boolean`
- `static processApplyGiftCodeError(TLRPC.TL_error error, FrameLayout containerLayout, Theme.ResourcesProvider resourcesProvider, Runnable share)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.BoostPagerBottomSheet`
- `canDismissWithSwipe()` -> `boolean`

## `org.telegram.ui.Components.Premium.boosts.BoostRepository`
- `static checkGiftCode(String slug, Utilities.Callback<TLRPC.TL_payments_checkedGiftCode> onDone, Utilities.Callback<TLRPC.TL_error> onError)` -> `void`
- `static isGoogleBillingAvailable()` -> `boolean`
- `static isMultiBoostsAvailable()` -> `boolean`
- `static loadChatParticipants(long chatId, int guid, String query, int offset, int count, Utilities.Callback<List<TLRPC.InputPeer>> onDone)` -> `void`
- `static loadCountries(Utilities.Callback<Pair<Map<String, List<TLRPC.TL_help_country>>, List<String>>> onDone)` -> `void`
- `static loadCountriesForPolls(Utilities.Callback<Pair<Map<String, List<TLRPC.TL_help_country>>, List<String>>> onDone)` -> `void`
- `static loadGiftOptions(int currentAccount, TLRPC.Chat chat, Utilities.Callback<List<TLRPC.TL_premiumGiftCodeOption>> onDone)` -> `int`
- `static loadParticipantsCount(Utilities.Callback<HashMap<Long, Integer>> callback)` -> `void`
- `static saveGiftOptionsToCache(int currentAccount, List<TLRPC.TL_premiumGiftCodeOption> options)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet`
- `hasChanges()` -> `boolean`

## `org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet`
- `addTONOption(int days)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.adapters.BoostAdapter`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.Components.Premium.boosts.adapters.SelectorAdapter`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.Components.Premium.boosts.adapters.SelectorAdapter$Item`
- `getDialogId()` -> `long`

## `org.telegram.ui.Components.Premium.boosts.cells.BaseCell`
- `markChecked(RecyclerListView recyclerListView)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.msg.GiveawayMessageCell`
- `checkMotionEvent(MotionEvent event)` -> `boolean`
- `setMessageContent(MessageObject messageObject, int parentWidth, int forwardedNameWidth)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.msg.GiveawayResultsMessageCell`
- `checkMotionEvent(MotionEvent event)` -> `boolean`
- `setMessageContent(MessageObject messageObject, int parentWidth, int forwardedNameWidth)` -> `void`

## `org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorSearchCell`
- `requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate)` -> `boolean`

## `org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorSearchCell$SpansContainer`
- `removeAllSpans(boolean animated)` -> `void`
- `removeSpan(final GroupCreateSpan span)` -> `void`

## `org.telegram.ui.Components.ProximitySheet`
- `hasOverlappingRendering()` -> `boolean`
- `processTouchEvent(MotionEvent ev, boolean intercept)` -> `boolean`
- `requestDisallowInterceptTouchEvent(boolean disallowIntercept)` -> `void`

## `org.telegram.ui.Components.PullForegroundDrawable`
- `isDraw()` -> `boolean`

## `org.telegram.ui.Components.QuoteCollapseButton`
- `isPressed()` -> `boolean`

## `org.telegram.ui.Components.QuoteHighlight`
- `addRect(float left, float top, float right, float bottom, @NonNull Direction dir)` -> `void`
- `addRect(float left, float top, float right, float bottom)` -> `void`

## `org.telegram.ui.Components.QuoteSpan`
- `isMyNewlineHack(CharSequence cs)` -> `boolean`
- `static putQuote(Spannable spannable, int start, int end, boolean collapse)` -> `int`
- `static putQuoteToEditable(Editable editable, int start, int end, boolean collapsed)` -> `int`

## `org.telegram.ui.Components.QuoteSpan$Block`
- `hasButton()` -> `boolean`

## `org.telegram.ui.Components.RLottieDiceDrawable`
- `hasBaseDice()` -> `boolean`
- `loadFrameRunnableImpl(Bitmap bitmap, boolean needClearBitmap)` -> `int`

## `org.telegram.ui.Components.RLottieDrawable`
- `addParentView(ImageReceiver parent)` -> `void`
- `checkCacheCancel()` -> `void`
- `checkChoreographer()` -> `void`
- `checkRunningTasks()` -> `void`
- `hasBitmap()` -> `boolean`
- `hasParentView()` -> `boolean`
- `hasVibrationPattern()` -> `boolean`
- `loadFrameRunnableImpl(Bitmap bitmap, boolean needClearBitmap)` -> `int`
- `removeParentView(ImageReceiver parent)` -> `void`

## `org.telegram.ui.Components.RLottieNative`
- `isRecycled()` -> `boolean`

## `org.telegram.ui.Components.RadialProgress`
- `isDrawCheckDrawable()` -> `boolean`

## `org.telegram.ui.Components.ReactedHeaderView`
- `requestLayout()` -> `void`

## `org.telegram.ui.Components.RecyclerAnimationScrollHelper`
- `cancel()` -> `void`

## `org.telegram.ui.Components.RecyclerItemsEnterAnimator`
- `cancel()` -> `void`

## `org.telegram.ui.Components.RecyclerListView`
- `addEdgeEffectListener(Runnable listener)` -> `void`
- `addOverlayView(View view, FrameLayout.LayoutParams layoutParams)` -> `void`
- `canHighlightChildAt(View child, float x, float y)` -> `boolean`
- `canScrollVertically(int direction)` -> `boolean`
- `cancelClickRunnables(boolean uncheck)` -> `void`
- `checkIfEmpty()` -> `void`
- `checkSection(boolean force)` -> `void`
- `hasActiveEdgeEffects()` -> `boolean`
- `hasOverlappingRendering()` -> `boolean`
- `hasSections()` -> `boolean`
- `removeHighlightRow()` -> `void`
- `removeOverlayView(View view)` -> `void`
- `requestLayout()` -> `void`

## `org.telegram.ui.Components.RecyclerListView$OnItemClickListenerExtended`
- `hasDoubleTap(View view, int position)` -> `default boolean`

## `org.telegram.ui.Components.RecyclerListView$SectionsAdapter`
- `isEnabled(ViewHolder holder)` -> `boolean`

## `org.telegram.ui.Components.ReplaceableIconDrawable`
- `addView(View view)` -> `void`
- `removeView(View view)` -> `void`

## `org.telegram.ui.Components.ReplyMessageLine`
- `check(MessageObject messageObject, TLRPC.User currentUser, TLRPC.Chat currentChat, Theme.ResourcesProvider resourcesProvider, final int type)` -> `int`
- `hasSticker()` -> `boolean`

## `org.telegram.ui.Components.ScamDrawable`
- `checkText()` -> `void`

## `org.telegram.ui.Components.ScrollSlidingTabStrip`
- `addEmojiTab(int id, Emoji.EmojiDrawable emojiDrawable, TLRPC.Document emojiSticker)` -> `View`
- `addIconTab(int id, Drawable drawable)` -> `FrameLayout`
- `addStickerIconTab(int id, Drawable drawable)` -> `StickerTabView`
- `addStickerTab(TLRPC.Chat chat)` -> `void`
- `addStickerTab(TLObject thumb, TLRPC.Document sticker, TLRPC.TL_messages_stickerSet parentObject)` -> `View`
- `cancelLongPress()` -> `void`
- `cancelPositionAnimation()` -> `void`
- `checkLongPress(MotionEvent ev)` -> `boolean`
- `removeTabs()` -> `void`

## `org.telegram.ui.Components.ScrollSlidingTextTabStrip`
- `addTextTab(final int id, CharSequence text)` -> `void`
- `addTextTab(final int id, CharSequence text, SparseArray<View> viewsCache)` -> `void`
- `hasTab(int id)` -> `boolean`
- `processColor(int color)` -> `int`
- `removeTabs()` -> `SparseArray<View>`

## `org.telegram.ui.Components.ScrollSlidingTextTabStrip$ScrollSlidingTabStripDelegate`
- `canReorder(int page)` -> `default boolean`

## `org.telegram.ui.Components.Scroller`
- `isFinished()` -> `boolean`
- `isScrollingInDirection(float xvel, float yvel)` -> `boolean`

## `org.telegram.ui.Components.SearchDownloadsContainer`
- `checkItemsFloodWait()` -> `void`
- `requestLayout()` -> `void`

## `org.telegram.ui.Components.SearchField`
- `processTouchEvent(MotionEvent event)` -> `void`
- `requestDisallowInterceptTouchEvent(boolean disallowIntercept)` -> `void`

## `org.telegram.ui.Components.SearchTagsList`
- `hasFilters()` -> `boolean`
- `onShownUpdate(boolean finish)` -> `void`

## `org.telegram.ui.Components.SearchTagsList$Item`
- `hash()` -> `long`

## `org.telegram.ui.Components.SearchViewPager`
- `addSearchFilter(FiltersView.MediaFilterData filter)` -> `boolean`
- `cancelEnterAnimation()` -> `void`
- `removeSearchFilter(FiltersView.MediaFilterData filterData)` -> `void`

## `org.telegram.ui.Components.SeekBar`
- `isDragging()` -> `boolean`
- `onTimestampUpdate(URLSpanNoUnderline link)` -> `void`

## `org.telegram.ui.Components.SeekBarWaveform`
- `isDragging()` -> `boolean`
- `isStartDraging()` -> `boolean`
- `setMessageObject(MessageObject object)` -> `void`

## `org.telegram.ui.Components.ShareAlert`
- `canDismissWithSwipe()` -> `boolean`
- `sendInternal(boolean withSound)` -> `void`

## `org.telegram.ui.Components.ShareTopView`
- `hasLink()` -> `boolean`

## `org.telegram.ui.Components.SharedMediaLayout`
- `addActionButtons()` -> `boolean`
- `canClickButtonInside()` -> `boolean`
- `canEditStories()` -> `boolean`
- `canShowSearchItem()` -> `boolean`
- `canZoomIn()` -> `boolean`
- `canZoomOut()` -> `boolean`
- `checkPinchToZoom(MotionEvent ev)` -> `boolean`
- `checkTabsAnimationInProgress()` -> `boolean`
- `hasInternet()` -> `boolean`
- `onActionModeSelectedUpdate(SparseArray<MessageObject> messageObjects)` -> `void`
- `processColor(int color)` -> `int`
- `saveAndStopAlbumsReorder()` -> `void`
- `sendTabsOrder()` -> `void`

## `org.telegram.ui.Components.SharedMediaLayout$EmptyStubView`
- `requestLayout()` -> `void`

## `org.telegram.ui.Components.SharedMediaLayout$GroupUsersSearchAdapter`
- `removeUserId(long userId)` -> `void`

## `org.telegram.ui.Components.SharedMediaLayout$SavedMessagesSearchAdapter`
- `loadMore()` -> `void`

## `org.telegram.ui.Components.SharedMediaLayout$SharedMediaData`
- `addMessage(MessageObject messageObject, int loadIndex, boolean isNew, boolean enc)` -> `boolean`
- `deleteMessage(int mid, int loadIndex)` -> `MessageObject`
- `getMessages()` -> `ArrayList<MessageObject>`

## `org.telegram.ui.Components.SharedMediaLayout$SharedMediaPreloader`
- `addDelegate(SharedMediaPreloaderDelegate delegate)` -> `void`
- `getMergeDialogId()` -> `long`
- `hasSharedMedia()` -> `boolean`
- `isMediaWasLoaded()` -> `boolean`
- `removeDelegate(SharedMediaPreloaderDelegate delegate)` -> `void`

## `org.telegram.ui.Components.SharingLocationsAlert`
- `canDismissWithSwipe()` -> `boolean`

## `org.telegram.ui.Components.SizeNotifierFrameLayout`
- `addDelegate(SizeNotifierFrameLayoutDelegate delegate)` -> `void`
- `onUpdateBackgroundDrawable(Drawable drawable)` -> `void`
- `removeDelegate(SizeNotifierFrameLayoutDelegate delegate)` -> `void`

## `org.telegram.ui.Components.SlideView`
- `hasCustomKeyboard()` -> `boolean`
- `saveStateParams(Bundle bundle)` -> `void`

## `org.telegram.ui.Components.SlidingTabView`
- `addTextTab(final int position, String title)` -> `void`

## `org.telegram.ui.Components.SlotsDrawable`
- `loadFrameRunnableImpl(Bitmap bitmap, boolean needClearBitmap)` -> `int`

## `org.telegram.ui.Components.SpannableStringLight`
- `static isFieldsAvailable()` -> `boolean`
- `removeSpan(Object what)` -> `void`

## `org.telegram.ui.Components.StableAnimator`
- `addUpdateListener(AnimatorUpdateListener listener)` -> `void`

## `org.telegram.ui.Components.SubstringLayoutAnimator`
- `cancel()` -> `void`

## `org.telegram.ui.Components.Switch`
- `processColor(int color)` -> `int`

## `org.telegram.ui.Components.TableLayout`
- `addChild(int x, int y, int colspan, int rowspan)` -> `void`
- `addChild(TL_iv.pageTableCell cell, int x, int y, int colspan)` -> `void`
- `static canStretch(int flexibility)` -> `boolean`
- `removeAllChildrens()` -> `void`
- `requestLayout()` -> `void`

## `org.telegram.ui.Components.TableLayout$Assoc`
- `put(K key, V value)` -> `void`

## `org.telegram.ui.Components.TableLayout$Axis`
- `isOrderPreserved()` -> `boolean`

## `org.telegram.ui.Components.TableLayout$Interval`
- `hashCode()` -> `int`

## `org.telegram.ui.Components.TableLayout$LayoutParams`
- `hashCode()` -> `int`

## `org.telegram.ui.Components.TableLayout$Spec`
- `hashCode()` -> `int`

## `org.telegram.ui.Components.TableView`
- `addFullRow(CharSequence text)` -> `TableRowFullContent`
- `addFullRow(CharSequence text, ArrayList<TLRPC.MessageEntity> entities)` -> `void`
- `addRow(CharSequence title, View content)` -> `TableRow`
- `addRow(CharSequence title, CharSequence text)` -> `TableRow`
- `addRow(CharSequence title, CharSequence text, ButtonSpan.TextViewButtons[] textViewRef)` -> `TableRow`
- `addRow(CharSequence title, CharSequence text, TableRowTitle[] titleRef, ButtonSpan.TextViewButtons[] textViewRef)` -> `TableRow`
- `addRow(CharSequence title, CharSequence text, CharSequence buttonText, Runnable buttonOnClick)` -> `TableRow`
- `addRow(CharSequence title, CharSequence text, CharSequence buttonText, Runnable buttonOnClick, Integer buttonColor)` -> `TableRow`
- `addRowDateTime(CharSequence title, int date)` -> `TableRow`
- `addRowLink(CharSequence title, CharSequence value, Runnable onClick)` -> `TableRow`
- `addRowLink(CharSequence title, CharSequence value, Runnable onClick, CharSequence buttonText, Runnable buttonOnClick)` -> `TableRow`
- `addRowMonospaced(CharSequence title, CharSequence text, int textFontSizeDp, Runnable copyButton)` -> `TableRow`
- `addRowMonospaced(CharSequence title, CharSequence text, int textFontSizeDp, Runnable copyButton, CharSequence buttonText, Runnable buttonOnClick)` -> `TableRow`
- `addRowUnpadded(CharSequence title, View content)` -> `TableRow`
- `addRowUser(CharSequence title, final int currentAccount, final long did, Runnable onClick)` -> `TableRow`
- `addRowUser(CharSequence title, final int currentAccount, final long did, Runnable onClick, CharSequence buttonText, Runnable buttonOnClick)` -> `TableRow`
- `addRowUserWithEmojiStatus(CharSequence title, final int currentAccount, final long did, Runnable onClick)` -> `TableRow`
- `addWalletAddressRow(CharSequence title, CharSequence text, Runnable onCopy)` -> `TableRow`

## `org.telegram.ui.Components.Text`
- `isEmpty()` -> `boolean`
- `isMultiline()` -> `boolean`

## `org.telegram.ui.Components.TextStyleSpan`
- `isMono()` -> `boolean`
- `isSpoiler()` -> `boolean`
- `isSpoilerRevealed()` -> `boolean`

## `org.telegram.ui.Components.TextViewSwitcher`
- `addView(View child, int index, ViewGroup.LayoutParams params)` -> `void`

## `org.telegram.ui.Components.ThanosEffect`
- `cancel(View view)` -> `void`

## `org.telegram.ui.Components.ThanosEffect$DrawingThread`
- `cancel(View view)` -> `void`
- `requestDraw()` -> `void`

## `org.telegram.ui.Components.ThanosEffect$DrawingThread$Animation`
- `isDead()` -> `boolean`

## `org.telegram.ui.Components.TranscribeButton`
- `static canTranscribeTrial(MessageObject messageObject)` -> `boolean`
- `static isFreeTranscribeInChat(MessageObject messageObject)` -> `boolean`
- `static isTranscribing(MessageObject messageObject)` -> `boolean`
- `static isVideoTranscriptionOpen(MessageObject messageObject)` -> `boolean`

## `org.telegram.ui.Components.TranslateAlert2`
- `canDismissWithSwipe()` -> `boolean`

## `org.telegram.ui.Components.TranslateAlert3$Header$Factory`
- `isClickable()` -> `boolean`

## `org.telegram.ui.Components.TranslateAlert3$Text$Factory`
- `isClickable()` -> `boolean`

## `org.telegram.ui.Components.UItem$UItemFactory`
- `isClickable()` -> `boolean`
- `isShadow()` -> `boolean`

## `org.telegram.ui.Components.UndoView`
- `canUndo()` -> `boolean`

## `org.telegram.ui.Components.UniversalAdapter`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `isReorderItem(int position)` -> `boolean`
- `static isShadow(int viewType)` -> `boolean`
- `shouldApplyBackground(int viewType)` -> `boolean`

## `org.telegram.ui.Components.UniversalFragment`
- `saveScrollPosition()` -> `void`

## `org.telegram.ui.Components.UniversalRecyclerView`
- `onLayoutUpdate()` -> `void`

## `org.telegram.ui.Components.UsersAlertBase`
- `canDismissWithSwipe()` -> `boolean`

## `org.telegram.ui.Components.VerticalPositionAutoAnimator`
- `addUpdateListener(DynamicAnimation.OnAnimationUpdateListener onAnimationUpdateListener)` -> `void`

## `org.telegram.ui.Components.VideoEditTextureView`
- `onSurfaceTextureUpdated(SurfaceTexture surface)` -> `void`

## `org.telegram.ui.Components.VideoForwardDrawable`
- `addTime(long time)` -> `void`

## `org.telegram.ui.Components.ViewPagerFixed`
- `addMoreTabs()` -> `void`
- `canScroll(MotionEvent e)` -> `boolean`
- `canScrollBackward(MotionEvent e)` -> `boolean`
- `canScrollForward(MotionEvent e)` -> `boolean`
- `canScrollHorizontally(int direction)` -> `boolean`
- `cancelTouches()` -> `void`
- `checkTabsAnimationInProgress()` -> `boolean`
- `onTabAnimationUpdate(boolean manual)` -> `void`
- `requestDisallowInterceptTouchEvent(boolean disallowIntercept)` -> `void`

## `org.telegram.ui.Components.ViewPagerFixed$Adapter`
- `canReorder(int position)` -> `boolean`
- `canScrollTo(int position)` -> `boolean`
- `hasStableId()` -> `boolean`

## `org.telegram.ui.Components.ViewPagerFixed$TabsView`
- `addTab(int id, CharSequence text)` -> `void`
- `removeTabs()` -> `void`
- `requestLayout()` -> `void`

## `org.telegram.ui.Components.ViewPagerFixed$TabsView$TabsViewDelegate`
- `canPerformActions()` -> `default boolean`
- `canReorder(int position)` -> `default boolean`

## `org.telegram.ui.Components.WebPagePreviewView`
- `static hasPreview(TLRPC.WebPage webPage)` -> `boolean`

## `org.telegram.ui.Components.WebPlayerView`
- `canHandleUrl(String url)` -> `boolean`
- `loadVideo(String url, TLRPC.Photo thumb, Object parentObject, String originalUrl, boolean autoplay)` -> `boolean`
- `onSurfaceTextureUpdated(SurfaceTexture surfaceTexture)` -> `void`

## `org.telegram.ui.Components.WebPlayerView$ControlsView`
- `requestDisallowInterceptTouchEvent(boolean disallowIntercept)` -> `void`

## `org.telegram.ui.Components.chat.ChatInputViewsContainer`
- `checkInsets()` -> `void`

## `org.telegram.ui.Components.dialogs.DialogMediaIconsHelper`
- `static addDialogMediaSpan(CharSequence charSequence, @DrawableRes int iconRes, boolean biDiIsolate)` -> `CharSequence`

## `org.telegram.ui.Components.inset.WindowInsetsInAppController`
- `requestInAppKeyboardHeightIncludeNavbar(int inAppKeyboardHeight)` -> `default void`

## `org.telegram.ui.Components.inset.WindowInsetsStateHolder`
- `requestInAppKeyboardHeight(int inAppKeyboardHeight)` -> `void`

## `org.telegram.ui.Components.poll.FileState`
- `checkState()` -> `void`
- `isExists()` -> `boolean`
- `isLoading()` -> `boolean`

## `org.telegram.ui.Components.poll.PollAttachedMediaPack`
- `static hasWrongInputMediaTypes(TLRPC.TL_inputMediaPoll inputMediaPoll)` -> `boolean`
- `remove(int index)` -> `void`
- `removeAnswerAndShift(int index)` -> `void`
- `static removeInputMedia(TLRPC.TL_inputMediaPoll inputMediaPoll, int index)` -> `void`
- `static setMessageMedia(TLRPC.TL_messageMediaPoll mediaPoll, int index, TLRPC.MessageMedia media)` -> `void`

## `org.telegram.ui.Components.poll.PollContentDrawable`
- `checkColors(boolean isOut)` -> `void`
- `checkFileState()` -> `void`

## `org.telegram.ui.Components.poll.RecentVotersCell$VotesList`
- `load()` -> `void`

## `org.telegram.ui.Components.poll.WebPageLoader`
- `isLoading(String url)` -> `boolean`

## `org.telegram.ui.Components.poll.buttons.PollAddButtonDrawable`
- `checkMotionPressed(int x, int y)` -> `int`

## `org.telegram.ui.Components.poll.sheets.PollStatisticsBottomSheet`
- `static loadStatistics(int currentAccount, long dialogId, int messageId, Utilities.Callback<TL_stats.TL_statsPollStats> onResult)` -> `int`

## `org.telegram.ui.Components.quickforward.QuickShareAvatarCell`
- `onAnimationUpdate(@NonNull ValueAnimator animation)` -> `void`

## `org.telegram.ui.Components.spoilers.SpoilerEffect`
- `addPoints(SpoilerEffectBitmapFactory.PointsBuffer[] buffers, Rect clipRegion)` -> `void`
- `static addSpoilers(TextView tv, @Nullable Stack<SpoilerEffect> spoilersPool, List<SpoilerEffect> spoilers)` -> `void`
- `static addSpoilers(TextView tv, @Nullable Stack<SpoilerEffect> spoilersPool, List<SpoilerEffect> spoilers, ArrayList<QuoteSpan.Block> quoteBlocks)` -> `void`
- `static addSpoilers(@Nullable View v, Layout textLayout, @Nullable Stack<SpoilerEffect> spoilersPool, List<SpoilerEffect> spoilers)` -> `void`
- `static addSpoilers(@Nullable View v, Layout textLayout, int left, int right, @Nullable Stack<SpoilerEffect> spoilersPool, List<SpoilerEffect> spoilers)` -> `void`
- `static addSpoilers(@Nullable View v, Layout textLayout, Spanned spannable, @Nullable Stack<SpoilerEffect> spoilersPool, List<SpoilerEffect> spoilers)` -> `void`
- `static addSpoilers(@Nullable View v, Layout textLayout, int layoutLeft, int layoutRight, Spanned spannable, @Nullable Stack<SpoilerEffect> spoilersPool, List<SpoilerEffect> spoilers, ArrayList<QuoteSpan.Block> quoteBlocks)` -> `void`
- `hasColor()` -> `boolean`
- `hasRipplePath()` -> `boolean`
- `shouldInvalidateColor()` -> `boolean`

## `org.telegram.ui.Components.spoilers.SpoilerEffectBitmapFactory`
- `checkUpdate(Rect region)` -> `void`

## `org.telegram.ui.ComposeDrawable`
- `addView(View view)` -> `void`

## `org.telegram.ui.ContactAddActivity`
- `canFinishFragment()` -> `boolean`

## `org.telegram.ui.ContactsActivity`
- `addOrRemoveSelectedContact(UserCell cell)` -> `boolean`
- `addOrRemoveSelectedContact(ProfileSearchCell cell)` -> `boolean`
- `canParentTabsSlide(MotionEvent ev, boolean forward)` -> `boolean`

## `org.telegram.ui.ContentPreviewViewer`
- `static hasInstance()` -> `boolean`
- `isVisible()` -> `boolean`

## `org.telegram.ui.ContentPreviewViewer$ContentPreviewViewerDelegate`
- `addCaptionToGif(Object gif, Object parent, boolean notify, int scheduleDate, int scheduleRepeatPeriod)` -> `default void`
- `addToFavoriteSelected(String emoji)` -> `default void`
- `canAddCaption(TLRPC.Document document)` -> `default boolean`
- `canDeleteSticker(TLRPC.Document document)` -> `default boolean`
- `canEditSticker()` -> `default boolean`
- `canSchedule()` -> `default boolean`
- `canSendSticker()` -> `default boolean`
- `canSetAsStatus(TLRPC.Document document)` -> `default Boolean`
- `deleteSticker(TLRPC.Document document)` -> `default void`
- `editSticker(TLRPC.Document document)` -> `default void`
- `getPollMessageObject()` -> `default MessageObject`
- `isInScheduleMode()` -> `default boolean`
- `isPhotoEditor()` -> `default boolean`
- `isReplacedSticker()` -> `default boolean`
- `isSettingIntroSticker()` -> `default boolean`
- `isStickerEditor()` -> `default boolean`
- `remove(SendMessagesHelper.ImportingSticker sticker)` -> `default void`
- `removeFromRecent(TLRPC.Document document)` -> `default void`
- `sendEmoji(TLRPC.Document emoji)` -> `default void`
- `sendGif(Object gif, Object parent, boolean notify, int scheduleDate, int scheduleRepeatPeriod)` -> `default void`
- `sendIntroSticker()` -> `default void`
- `sendSticker(String emoji)` -> `default void`
- `sendSticker(TLRPC.Document sticker, String query, Object parent, boolean notify, int scheduleDate, int scheduleRepeatPeriod)` -> `default void`

## `org.telegram.ui.CountrySelectActivity$Country`
- `hashCode()` -> `int`

## `org.telegram.ui.DataUsage2Activity$ListView$Adapter`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.Delegates.MemberRequestsDelegate`
- `hasAllImporters()` -> `boolean`
- `loadMembers()` -> `void`

## `org.telegram.ui.Delegates.MemberRequestsDelegate$Adapter`
- `removeItem(TLRPC.TL_chatInviteImporter item)` -> `void`

## `org.telegram.ui.DialogCacheBottomSheet`
- `canDismissWithSwipe()` -> `boolean`

## `org.telegram.ui.ExternalActionActivity`
- `checkPasscode(final Intent intent, final boolean isNew, final boolean restore, final boolean fromPassword, final int intentAccount, int state)` -> `boolean`

## `org.telegram.ui.FilterChatlistActivity`
- `canBeginSlide()` -> `boolean`

## `org.telegram.ui.FilterChatlistActivity$InviteLinkCell`
- `deleteLink()` -> `void`
- `editname()` -> `void`

## `org.telegram.ui.FilterCreateActivity`
- `static canAddToFolder(TLRPC.Chat chat)` -> `boolean`
- `canBeginSlide()` -> `boolean`
- `hasAnimatedEmojis(CharSequence cs)` -> `boolean`
- `loadInvites()` -> `void`
- `static processErrors(TLRPC.TL_error err, BaseFragment fragment, BulletinFactory factory)` -> `boolean`
- `static saveFilterToServer(MessagesController.DialogFilter filter, int newFilterFlags, String newFilterName, ArrayList<TLRPC.MessageEntity> newFilterNameEntities, boolean newFilterNoanimate, int newFilterColor, ArrayList<Long> newAlwaysShow, ArrayList<Long> newNeverShow, LongSparseIntArray newPinned, boolean creatingNew, boolean atBegin, boolean hasUserChanged, boolean resetUnreadCounter, boolean progress, BaseFragment fragment, Runnable onFinish)` -> `void`

## `org.telegram.ui.FilterCreateActivity$ItemInner`
- `isShadow()` -> `boolean`

## `org.telegram.ui.FilterCreateActivity$LinkCell`
- `deleteLink()` -> `void`

## `org.telegram.ui.FilterCreateActivity$ListAdapter`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.FilteredSearchView`
- `requestLayout()` -> `void`

## `org.telegram.ui.FilteredSearchView$MessageHashId`
- `hashCode()` -> `int`

## `org.telegram.ui.FiltersSetupActivity$ListAdapter`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.GradientHeaderActivity`
- `saveScrollPosition()` -> `void`

## `org.telegram.ui.GroupCreateActivity`
- `canBeginSlide()` -> `boolean`

## `org.telegram.ui.GroupCreateFinalActivity`
- `saveSelfArgs(Bundle args)` -> `void`

## `org.telegram.ui.IArticleViewer`
- `canStartSelection(View block)` -> `boolean`
- `checkLayoutForLinks(MotionEvent event, View parentView)` -> `void`

## `org.telegram.ui.IntroActivity`
- `hasForceLightStatusBar()` -> `boolean`

## `org.telegram.ui.IntroActivity$IntroAdapter`
- `isViewFromObject(View view, @NonNull Object object)` -> `boolean`
- `saveState()` -> `Parcelable`

## `org.telegram.ui.InviteContactsActivity$SpansContainer`
- `addSpan(final GroupCreateSpan span)` -> `void`
- `removeSpan(final GroupCreateSpan span)` -> `void`

## `org.telegram.ui.KeepMediaPopupView$ExceptionsView`
- `requestLayout()` -> `void`

## `org.telegram.ui.LaunchActivity`
- `addOnUserLeaveHintListener(Runnable callback)` -> `void`
- `addOverlayPasscodeView(PasscodeView overlay)` -> `void`
- `canSelectStories()` -> `boolean`
- `checkAppUpdate(boolean force, Browser.Progress progress)` -> `void`
- `checkFrameMetrics()` -> `void`
- `static checkFreeDiscSpaceStatic(final int force)` -> `void`
- `checkSystemBarColors(boolean useCurrentFragment, boolean checkStatusBar, boolean checkNavigationBar)` -> `void`
- `getVisibleDialog()` -> `Dialog`
- `isLightNavigationBar()` -> `boolean`
- `removeOnUserLeaveHintListener(Runnable callback)` -> `void`
- `removeOverlayPasscodeView(PasscodeView overlay)` -> `void`

## `org.telegram.ui.LauncherIconController`
- `static isEnabled(LauncherIcon icon)` -> `boolean`

## `org.telegram.ui.LinkManager`
- `getMessagesController()` -> `MessagesController`
- `getUserConfig()` -> `UserConfig`
- `static isWebAppLink(String url)` -> `boolean`

## `org.telegram.ui.LocationActivity$MapOverlayView`
- `addInfoView(IMapsProvider.IMarker marker)` -> `void`
- `removeInfoView(IMapsProvider.IMarker marker)` -> `void`

## `org.telegram.ui.MainTabsActivity`
- `canBeginSlide()` -> `boolean`
- `canScrollBackward(MotionEvent ev)` -> `boolean`
- `canScrollForward(MotionEvent ev)` -> `boolean`
- `onViewPagerTabAnimationUpdate(boolean manual)` -> `void`

## `org.telegram.ui.MainTabsActivity$TabFragmentDelegate`
- `canParentTabsSlide(MotionEvent ev, boolean forward)` -> `default boolean`

## `org.telegram.ui.MainTabsLayout`
- `addTabToIgnoreClick(View v)` -> `void`

## `org.telegram.ui.ManageLinksActivity`
- `deleteLink(TLRPC.TL_chatInviteExported invite)` -> `void`
- `editLink(TLRPC.TL_chatInviteExported invite)` -> `void`

## `org.telegram.ui.MessageSeenView`
- `requestLayout()` -> `void`

## `org.telegram.ui.MultiLayoutTypingAnimator`
- `isFadeBlock(Block block)` -> `boolean`
- `isFinished()` -> `boolean`
- `isRunning()` -> `boolean`

## `org.telegram.ui.NewContactBottomSheet`
- `static saveContact(Context context, String phone, String firstName, String lastName, String notes, AccountInfo into)` -> `boolean`

## `org.telegram.ui.PasskeysActivity`
- `added(TL_account.Passkey passkey)` -> `void`

## `org.telegram.ui.PassportActivity`
- `static checkSecret(byte[] secret, Long id)` -> `boolean`
- `saveSelfArgs(Bundle args)` -> `void`

## `org.telegram.ui.PhotoPickerActivity`
- `onPanTranslationUpdate(float y)` -> `void`

## `org.telegram.ui.PhotoPickerActivity$PhotoPickerActivityDelegate`
- `canFinishFragment()` -> `default boolean`

## `org.telegram.ui.PinchToZoomHelper`
- `checkPinchToZoom(MotionEvent ev, View child, ImageReceiver image, View textureViewContainer, View textureView, MessageObject messageObject)` -> `boolean`
- `checkPinchToZoom(MotionEvent ev, View child, ImageReceiver image, View textureViewContainer, View textureView, MessageObject messageObject, int spoilerEffect2Index)` -> `boolean`
- `isInOverlayMode()` -> `boolean`
- `isInOverlayModeFor(View child)` -> `boolean`

## `org.telegram.ui.PollCreateActivity`
- `deleteItem(View v)` -> `void`

## `org.telegram.ui.PremiumPreviewFragment`
- `canBeginSlide()` -> `boolean`

## `org.telegram.ui.PrivacyControlActivity`
- `canBeginSlide()` -> `boolean`

## `org.telegram.ui.PrivacyUsersActivity`
- `loadBlocked()` -> `PrivacyUsersActivity`

## `org.telegram.ui.RecyclerListViewScroller`
- `cancel()` -> `void`
- `isRunning()` -> `boolean`

## `org.telegram.ui.ReportBottomSheet`
- `canDismissWithSwipe()` -> `boolean`

## `org.telegram.ui.RestrictedLanguagesSelectActivity`
- `static checkRestrictedLanguages(boolean accountsChanged)` -> `void`

## `org.telegram.ui.RightSlidingDialogContainer`
- `hasFragment()` -> `boolean`
- `removeView(View view)` -> `void`
- `removeViewInLayout(View view)` -> `void`

## `org.telegram.ui.SecretMediaViewer`
- `getCurrentMessageObject()` -> `MessageObject`
- `static hasInstance()` -> `boolean`
- `isShowingImage(MessageObject object)` -> `boolean`
- `isVisible()` -> `boolean`

## `org.telegram.ui.SelectChatUserSheet$ParticipantsList`
- `cancel()` -> `void`
- `load()` -> `void`

## `org.telegram.ui.SessionsActivity`
- `loadSessions(boolean silent)` -> `void`

## `org.telegram.ui.Stars.BotStarsController`
- `hasTransactions(long did)` -> `boolean`
- `hasTransactions(long did, int type)` -> `boolean`
- `isLoadingTransactions(long did, int type)` -> `boolean`
- `isStarsBalanceAvailable(long did)` -> `boolean`
- `isTONBalanceAvailable(long did)` -> `boolean`
- `loadAdminedBots()` -> `void`
- `loadAdminedChannels()` -> `void`
- `loadTransactions(long did, int type)` -> `void`
- `onUpdate(TL_update.TL_updateStarsRevenueStatus update)` -> `void`

## `org.telegram.ui.Stars.BotStarsController$ChannelConnectedBots`
- `cancel()` -> `void`
- `check()` -> `void`
- `isLoading()` -> `boolean`
- `load()` -> `void`

## `org.telegram.ui.Stars.BotStarsController$ChannelSuggestedBots`
- `cancel()` -> `void`
- `check()` -> `void`
- `isLoading()` -> `boolean`
- `load()` -> `void`
- `remove(long did)` -> `void`

## `org.telegram.ui.Stars.StarsController`
- `canBuy(TLRPC.InputPeer purposePeer)` -> `boolean`
- `canUseTon()` -> `boolean`
- `getPaidReactionsDialogId(MessageObject messageObject)` -> `long`
- `getPaidReactionsDialogId(MessageId id, TLRPC.MessageReactions reactions)` -> `long`
- `getUserStarGift(TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback<TL_stars.SavedStarGift> got)` -> `void`
- `hasInsufficientSubscriptions()` -> `boolean`
- `hasPendingPaidReactions(MessageObject messageObject)` -> `boolean`
- `hasSubscriptions()` -> `boolean`
- `hasTransactions()` -> `boolean`
- `hasTransactions(int type)` -> `boolean`
- `static isEnoughAmount(int currentAccount, AmountUtils.Amount amount)` -> `boolean`
- `isLoadingSubscriptions()` -> `boolean`
- `isLoadingTransactions(int type)` -> `boolean`
- `loadInsufficientSubscriptions()` -> `void`
- `loadStarGifts()` -> `void`
- `loadSubscriptions()` -> `void`
- `loadTransactions(int type)` -> `void`
- `processUpdateMonoForumNoPaidException(long channelId, long userId, boolean nopaidMessagesException)` -> `void`
- `sendPaidReaction(MessageObject messageObject, ChatActivity chatActivity)` -> `StarsController.PendingPaidReactions`
- `sendPaidReaction(MessageObject messageObject, ChatActivity chatActivity, long amount, boolean affect, boolean checkBalance, Long peer)` -> `StarsController.PendingPaidReactions`

## `org.telegram.ui.Stars.StarsController$MessageId`
- `hashCode()` -> `int`

## `org.telegram.ui.Stars.StarsController$PaidMessagesToast`
- `isUndoRunning()` -> `boolean`
- `isVisible()` -> `boolean`
- `send()` -> `void`

## `org.telegram.ui.Stars.StarsIntroActivity`
- `static addAvailabilityRow(TableView tableView, int currentAccount, TL_stars.StarGift gift, Theme.ResourcesProvider resourcesProvider)` -> `void`
- `static addStatusRow(TableView tableView, int currentAccount, long user_id, int msg_id, Theme.ResourcesProvider resourcesProvider, Runnable openUpgrade)` -> `void`

## `org.telegram.ui.StatisticActivity`
- `static putColorFromData(ChartViewData chartViewData, ArrayList<ThemeDescription> arrayList, ThemeDescription.ThemeDescriptionDelegate themeDelegate)` -> `void`

## `org.telegram.ui.StatisticActivity$ChartCell`
- `loadData(ChartViewData viewData)` -> `void`

## `org.telegram.ui.StatisticActivity$ChartViewData`
- `load(int accountId, int classGuid, int dc, Utilities.Callback0Return<BaseChartCell> findMe)` -> `void`

## `org.telegram.ui.StatisticActivity$RecentPostInfo`
- `isStory()` -> `boolean`

## `org.telegram.ui.StatisticActivity$UniversalChartCell`
- `loadData(ChartViewData data)` -> `void`

## `org.telegram.ui.Storage.CacheModel`
- `add(int addToType, FileInfo fileInfo)` -> `void`
- `isEmpty()` -> `boolean`
- `isSelected(FileInfo file)` -> `boolean`
- `isSelected(long dialogId)` -> `boolean`
- `remove(CacheControlActivity.DialogFileEntities dialogEntities)` -> `void`
- `removeSelectedFiles()` -> `CacheControlActivity.DialogFileEntities`

## `org.telegram.ui.TooManyCommunitiesActivity$SearchAdapter`
- `processSearch(String query, int id)` -> `void`

## `org.telegram.ui.TopicsFragment`
- `checkUi_listViewPadding()` -> `void`
- `sendReorder()` -> `void`

## `org.telegram.ui.TopicsFragment$Adapter`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`

## `org.telegram.ui.TopicsFragment$TopicsRecyclerView`
- `addView(View child, int index, ViewGroup.LayoutParams params)` -> `void`
- `requestLayout()` -> `void`

## `org.telegram.ui.TwoStepVerificationActivity`
- `static canHandleCurrentPassword(TL_account.Password password, boolean login)` -> `boolean`

## `org.telegram.ui.TwoStepVerificationSetupActivity`
- `addFragmentToClose(BaseFragment fragment)` -> `void`
- `hasForceLightStatusBar()` -> `boolean`

## `org.telegram.ui.UserInfoActivity`
- `hasChanges()` -> `boolean`
- `isSupportEdgeToEdge()` -> `boolean`

## `org.telegram.ui.UserInfoActivity$AdminedChannelsFetcher`
- `fetch()` -> `void`

## `org.telegram.ui.UsersSelectActivity$SpansContainer`
- `addSpan(final GroupCreateSpan span, boolean animated)` -> `void`
- `removeSpan(final GroupCreateSpan span)` -> `void`

## `org.telegram.ui.ViewPagerActivity`
- `canScrollBackward(MotionEvent ev)` -> `boolean`
- `canScrollForward(MotionEvent ev)` -> `boolean`
- `onViewPagerTabAnimationUpdate(boolean manual)` -> `void`
- `putFragmentAtPosition(int position, BaseFragment fragment)` -> `void`

## `org.telegram.ui.ViewPagerActivity$ViewPagerActivityPagerLayout`
- `canScrollBackward(MotionEvent e)` -> `boolean`
- `canScrollForward(MotionEvent e)` -> `boolean`
- `onTabAnimationUpdate(boolean manual)` -> `void`

## `org.telegram.ui.Wallet.GramWallet`
- `static addressEquals(String first, String second)` -> `boolean`
- `canEnableBackup()` -> `boolean`
- `canExportPhrase()` -> `boolean`
- `canSend()` -> `boolean`
- `cantAccessWallet()` -> `boolean`
- `hasWaltBalance()` -> `boolean`
- `isBackupEnabled()` -> `boolean`
- `isGaslessAvailable()` -> `boolean`
- `isReady()` -> `boolean`
- `onUpdate(TL_update.TL_updateWalletState update)` -> `void`
- `onUpdate(TL_update.TL_updateWalletGaslessInfo update)` -> `void`
- `onUpdate(TL_update.TL_updateSentWalletTransaction update)` -> `void`
- `send(String address, long amount, String comment, Utilities.Callback<String> whenSent)` -> `void`
- `send(String address, long amount, String comment, byte[] comment_recipient_public_key, Utilities.Callback<String> whenSent)` -> `void`
- `send(TLRPC.User user, String address, long amount, Utilities.Callback<String> whenSent)` -> `void`
- `send(TLRPC.User user, String address, long amount, String comment, Utilities.Callback<String> whenSent)` -> `void`
- `send(TLRPC.User user, String address, long amount, String comment, byte[] comment_recipient_public_key, Utilities.Callback<String> whenSent)` -> `void`
- `send(TLRPC.User user, String address, long amount, String comment, byte[] commentPublicKey, String domain, Utilities.Callback<String> whenSent)` -> `void`
- `send(TLRPC.User user, String address, long amount, String comment, byte[] commentPublicKey, String domain, Utilities.Callback<String> whenSent, Utilities.Callback<TL_wallet.walletTransaction> whenQueued)` -> `void`
- `sendNFT(String address, TL_wallet.nftItem collectible, Utilities.Callback<String> whenSent)` -> `void`
- `sendNFT(TLRPC.User user, String address, TL_wallet.nftItem collectible, Utilities.Callback<String> whenSent)` -> `void`
- `sendNFT(TLRPC.User user, String address, TL_wallet.nftItem collectible, String comment, Utilities.Callback<String> whenSent)` -> `void`

## `org.telegram.ui.Wallet.GramWallet$CollectiblesList`
- `cancel()` -> `void`
- `isEndReached()` -> `boolean`
- `isLoaded()` -> `boolean`
- `isLoading()` -> `boolean`
- `load()` -> `void`

## `org.telegram.ui.Wallet.GramWallet$EmulationRequest`
- `cancel()` -> `void`
- `cancel()` -> `void`

## `org.telegram.ui.Wallet.GramWallet$SecretPhrase`
- `isEmpty()` -> `boolean`

## `org.telegram.ui.Wallet.GramWallet$TransactionsList`
- `cancel()` -> `void`
- `hasEndReached()` -> `boolean`
- `isEndReached()` -> `boolean`
- `isLoading()` -> `boolean`
- `load()` -> `void`

## `org.telegram.ui.Wallet.GramWalletPolling`
- `isRunning()` -> `boolean`

## `org.telegram.ui.Wallet.GramWalletStorage`
- `static addChangeListener(Runnable listener)` -> `void`
- `isProtectedByFingerprint()` -> `boolean`
- `static removeChangeListener(Runnable listener)` -> `void`

## `org.telegram.ui.Wallet.GramWalletStreaming`
- `isRunning()` -> `boolean`

## `org.telegram.ui.Wallet.GramWalletTonConnect`
- `isLoadingSessions()` -> `boolean`
- `load(long sessionId, int messageId, Utilities.Callback2<Pending, String> callback)` -> `void`
- `markProcessed(long sessionId, int messageId)` -> `void`
- `onSessionUpdate(TL_wallet.tonConnectSession session)` -> `void`
- `requestsProof(ConnectRequest context)` -> `boolean`

## `org.telegram.ui.Wallet.GramWalletTonConnect$Pending`
- `isBusy()` -> `boolean`
- `isProcessed()` -> `boolean`

## `org.telegram.ui.Wallet.NavBottomSheet`
- `addPage(View page)` -> `NavBottomSheet`
- `canDismissWithSwipe()` -> `boolean`
- `canSwipeToBack(MotionEvent event)` -> `boolean`

## `org.telegram.ui.Wallet.TransactionCell$SmartWalletAddressFormatter`
- `add(String address)` -> `void`

## `org.telegram.ui.Wallet.WalletActionLayout`
- `isDiamondDragging()` -> `boolean`
- `isDiamondTouch(float x, float y)` -> `boolean`

## `org.telegram.ui.Wallet.WalletActivity`
- `isSupportEdgeToEdge()` -> `boolean`

## `org.telegram.ui.Wallet.WalletActivity$WalletHeaderSnapHelper`
- `cancelGesture()` -> `void`

## `org.telegram.ui.Wallet.WalletCardView$WalletCardTextureView`
- `onSurfaceTextureUpdated(SurfaceTexture surface)` -> `void`

## `org.telegram.ui.Wallet.WalletChatSendTransition`
- `cancel()` -> `void`

## `org.telegram.ui.Wallet.WalletDiamondView`
- `canAnimateFlight()` -> `boolean`
- `canAnimateIntro()` -> `boolean`

## `org.telegram.ui.Wallet.WalletEngine2`
- `static isEncryptedComment(JSONObject message)` -> `boolean`
- `static isFailedPhase(SendPhase phase)` -> `boolean`
- `static isFinalPhase(SendPhase phase)` -> `boolean`
- `static isPendingPhase(SendPhase phase)` -> `boolean`
- `static isTgWalletSecretPhrase(@Nullable SecretPhrase secretPhrase)` -> `boolean`
- `static isValidAddress(@Nullable String address)` -> `boolean`
- `static isValidRecipientAddress(@Nullable String address)` -> `boolean`

## `org.telegram.ui.Wallet.WalletEngine2$HttpTransport`
- `cancel(long id)` -> `void`

## `org.telegram.ui.Wallet.WalletKeysBackupFragment`
- `isSupportEdgeToEdge()` -> `boolean`

## `org.telegram.ui.Wallet.WalletSendEnterAmount`
- `isSupportEdgeToEdge()` -> `boolean`
- `setAllowOpenChat()` -> `WalletSendEnterAmount`

## `org.telegram.ui.Wallet.WalletSendSelectSender`
- `isSupportEdgeToEdge()` -> `boolean`

## `org.telegram.ui.Wallet.WalletSendTransition`
- `cancel()` -> `void`

## `org.telegram.ui.Wallet.WalletTonConnectSessionsFragment`
- `isSupportEdgeToEdge()` -> `boolean`

## `org.telegram.ui.Wallet.WalletWordCell`
- `hasError()` -> `boolean`
- `requestFieldFocus()` -> `void`

## `org.telegram.ui.WallpapersListActivity`
- `saveSelfArgs(Bundle args)` -> `void`

## `org.telegram.ui.WallpapersListActivity$SearchAdapter`
- `loadMoreResults()` -> `void`

## `org.telegram.ui.WrappedResourceProvider`
- `hasGradientService()` -> `boolean`

## `org.telegram.ui.bots.AffiliateProgramFragment`
- `isSupportEdgeToEdge()` -> `boolean`

## `org.telegram.ui.bots.BotBiometry`
- `load()` -> `void`
- `static removeBot(Context context, int currentAccount, long botId)` -> `void`
- `requestToken(String reason, Utilities.Callback2<Boolean, String> whenDecrypted)` -> `void`
- `save()` -> `void`

## `org.telegram.ui.bots.BotDownloads`
- `cancel(FileDownload file)` -> `void`
- `hasFiles()` -> `boolean`
- `isDownloading()` -> `boolean`
- `save()` -> `void`

## `org.telegram.ui.bots.BotDownloads$FileDownload`
- `cancel()` -> `void`
- `isDownloaded()` -> `boolean`
- `isDownloading()` -> `boolean`
- `isOver()` -> `boolean`

## `org.telegram.ui.bots.BotLocation`
- `checkObject()` -> `JSONObject`
- `load()` -> `void`
- `request(Utilities.Callback2<Boolean, Boolean> whenDone)` -> `void`
- `requestObject(Utilities.Callback<JSONObject> whenDone)` -> `void`
- `save()` -> `void`

## `org.telegram.ui.bots.BotShareSheet`
- `static loadWebPagePreview(int currentAccount, String url, Utilities.Callback<TLRPC.WebPage> whenLoaded)` -> `Runnable`

## `org.telegram.ui.bots.BotStorage`
- `static isSecuredSupported()` -> `boolean`

## `org.telegram.ui.bots.BotWebViewAttachedSheet`
- `checkNavBarColor()` -> `void`
- `static deleteBot(int currentAccount, long botId, Runnable onDone)` -> `void`
- `static hasPrivacy(int currentAccount, long botId, Utilities.Callback<Boolean> whenDone)` -> `void`
- `static hasPrivacy(TLRPC.UserFull userFull)` -> `boolean`
- `static hasPrivacyCommand(TLRPC.UserFull userFull)` -> `boolean`
- `isAttachedLightStatusBar()` -> `boolean`
- `isFullSize()` -> `boolean`
- `isShown()` -> `boolean`
- `requestWebView(BaseFragment fragment, WebViewRequestProps props)` -> `void`
- `saveState()` -> `BottomSheetTabs.WebTabData`

## `org.telegram.ui.bots.BotWebViewMenuContainer`
- `hasSavedText()` -> `boolean`
- `saveState()` -> `BottomSheetTabs.WebTabData`

## `org.telegram.ui.bots.BotWebViewSheet`
- `checkNavBarColor()` -> `void`
- `static deleteBot(int currentAccount, long botId, Runnable onDone)` -> `void`
- `requestWebView(BaseFragment fragment, WebViewRequestProps props)` -> `void`
- `requestWebView(BaseFragment fragment, int currentAccount, String name, String url)` -> `void`
- `saveState()` -> `BottomSheetTabs.WebTabData`

## `org.telegram.ui.community.CommunityEditActivity`
- `saveSelfArgs(Bundle args)` -> `void`

## `org.telegram.ui.community.CommunitySheet`
- `canClickButtonInside()` -> `boolean`
- `canDismissWithSwipe()` -> `boolean`

## `org.telegram.ui.community.CommunityUtils`
- `static getCommunityChatType(int currentAccount, long dialogId)` -> `CommunityChatType`
- `static getCommunityChatType(TLRPC.Chat chat, TLRPC.User user, TLRPC.Dialog dialog, TL_communities.CommunityPeer peer)` -> `CommunityChatType`

## `org.telegram.ui.community.CommunityUtils$PendingRequests`
- `checkLoadNext(UniversalRecyclerView listView)` -> `void`
- `isEmpty()` -> `boolean`
- `isFinished()` -> `boolean`
- `isLoading()` -> `boolean`
- `isSingle()` -> `boolean`
- `loadNext()` -> `void`
- `markAsViewed()` -> `void`

## `org.telegram.ui.iv.BlockRow`
- `isChecklist()` -> `boolean`
- `isInList()` -> `boolean`
- `isInQuote()` -> `boolean`
- `isOrdered()` -> `boolean`

## `org.telegram.ui.iv.MediaUploadState`
- `isPending()` -> `boolean`
- `isReady()` -> `boolean`

## `org.telegram.ui.iv.RichCaptionController`
- `isPressOnCaption(int localX, int localY)` -> `boolean`
- `requestFocus()` -> `void`

## `org.telegram.ui.iv.RichContainer`
- `isDetails()` -> `boolean`
- `isList()` -> `boolean`
- `isQuote()` -> `boolean`

## `org.telegram.ui.iv.RichDetailsCell`
- `requestEditFocus()` -> `void`

## `org.telegram.ui.iv.RichEditText`
- `addStyle(int flag, int start, int end)` -> `void`
- `deleteToEndSilently(int from)` -> `void`
- `removeStyle(int flag, int start, int end)` -> `void`
- `requestEditFocus()` -> `void`
- `requestEditFocusRebuild()` -> `void`

## `org.telegram.ui.iv.RichEditorLimits`
- `isWithin(AppGlobalConfig config)` -> `boolean`

## `org.telegram.ui.iv.RichEditorListView`
- `addBlock(TL_iv.PageBlock block)` -> `void`
- `addMediaToRow(BlockRow row, MediaController.PhotoEntry entry)` -> `void`
- `addRichMessage(TL_iv.RichMessage richMessage)` -> `void`
- `canCreateInlineButtonOnSelection()` -> `boolean`
- `canIndentRow(int idx)` -> `boolean`
- `canIndentSelection()` -> `boolean`
- `canIndentTarget(BlockRow row)` -> `boolean`
- `canOutdentRow(int idx)` -> `boolean`
- `canOutdentSelection()` -> `boolean`
- `canOutdentTarget(BlockRow row)` -> `boolean`
- `canRedo()` -> `boolean`
- `canUndo()` -> `boolean`
- `hasAnyText()` -> `boolean`
- `hasPendingUploads()` -> `boolean`
- `loadHtml(String html)` -> `void`
- `loadHtml(CharSequence before, String html, CharSequence after)` -> `void`
- `loadRichMessage(TL_iv.RichMessage richMessage)` -> `void`
- `onLayoutUpdate()` -> `void`

## `org.telegram.ui.iv.RichEditorListView$BlockButtonEdit`
- `delete()` -> `void`
- `getUserId()` -> `long`

## `org.telegram.ui.iv.RichInlineButtonSpan`
- `static isSupported(TL_keyboard.InlineButtonType type)` -> `boolean`
- `removeNestedReplacementSpans(Spannable text)` -> `void`

## `org.telegram.ui.iv.RichMapCell`
- `static hasGeo(TL_iv.pageBlockMap map)` -> `boolean`

## `org.telegram.ui.iv.RichMediaConverter`
- `cancel()` -> `void`
- `static hasAnimatedMediaEntities(MediaController.PhotoEntry entry)` -> `boolean`
- `isFinished()` -> `boolean`

## `org.telegram.ui.iv.RichMediaItem`
- `hasImage()` -> `boolean`
- `isEmpty()` -> `boolean`

## `org.telegram.ui.iv.RichMediaUploader`
- `cancel()` -> `void`
- `isCancelled()` -> `boolean`
- `isFinished()` -> `boolean`
- `isVideo()` -> `boolean`

## `org.telegram.ui.iv.RichMessageConvert`
- `static isLossy(List<BlockRow> rows)` -> `boolean`
- `static isLossy(List<BlockRow> rows, Map<Long, TL_iv.RichText> quoteAuthors)` -> `boolean`

## `org.telegram.ui.iv.RichTableCell`
- `addCellToSelection(TL_iv.pageTableCell cell)` -> `void`
- `addColumn()` -> `void`
- `addRow()` -> `void`
- `editTextForChildPos(int childPos)` -> `RichEditText`
- `hasCellSelection()` -> `boolean`

## `org.telegram.ui.iv.RichTextCell`
- `static readAuthorPlain(TL_iv.PageBlock block)` -> `String`
- `static readAuthorStyled(TL_iv.PageBlock block)` -> `CharSequence`
- `static readPlainText(TL_iv.PageBlock block)` -> `String`
- `static readStyledText(TL_iv.PageBlock block)` -> `CharSequence`
- `requestEditFocus()` -> `void`

## `org.telegram.ui.iv.RichTextStyle`
- `static hasDate(CharSequence cs, int from, int to)` -> `boolean`
- `static hasLink(CharSequence cs, int from, int to)` -> `boolean`
- `static hasStyle(CharSequence cs, int from, int to, int flag)` -> `boolean`
- `static isEmpty(TL_iv.RichText rt)` -> `boolean`
- `static removeDate(android.text.Spannable sb, int from, int to)` -> `void`
- `static removeLink(android.text.Spannable sb, int from, int to)` -> `void`

## `org.telegram.ui.iv.TableModel`
- `addColumn()` -> `void`
- `addRow()` -> `void`
- `deleteColumns(java.util.Set<Integer> colsToDelete)` -> `boolean`
- `deleteRows(java.util.Set<Integer> rowsToDelete)` -> `boolean`
- `isAnchor(int r, int c)` -> `boolean`
- `static readPlainText(TL_iv.pageTableCell cell)` -> `String`
- `static readStyledText(TL_iv.pageTableCell cell)` -> `CharSequence`

## `org.telegram.ui.web.AddressBarList$BookmarksList`
- `delete(ArrayList<Integer> ids)` -> `void`
- `load()` -> `void`

## `org.telegram.ui.web.BookmarksFragment`
- `deleteSelectedMessages()` -> `void`
- `isLightStatusBar()` -> `boolean`
- `isSelected(MessageObject msg)` -> `boolean`

## `org.telegram.ui.web.BotWebViewContainer`
- `checkCreateWebView()` -> `void`
- `hasUserPermissions()` -> `boolean`
- `loadFlickerAndSettingsItem(int currentAccount, long botId, ActionBarMenuSubItem settingsItem)` -> `void`
- `loadUrl(int currentAccount, String url)` -> `void`
- `loadUrl(int currentAccount, String url, boolean sameOrigin)` -> `void`
- `onInvoiceStatusUpdate(String slug, String status)` -> `void`
- `onInvoiceStatusUpdate(String slug, String status, boolean ignoreCurrentCheck)` -> `void`

## `org.telegram.ui.web.BotWebViewContainer$Delegate`
- `isClipboardAvailable()` -> `default boolean`

## `org.telegram.ui.web.BotWebViewContainer$MyWebView`
- `canGoBack()` -> `boolean`
- `checkCachedMetaProperties(String url)` -> `void`
- `loadData(@NonNull String data, @Nullable String mimeType, @Nullable String encoding)` -> `void`
- `loadDataWithBaseURL(@Nullable String baseUrl, @NonNull String data, @Nullable String mimeType, @Nullable String encoding, @Nullable String historyUrl)` -> `void`
- `loadUrl(@NonNull String url)` -> `void`
- `loadUrl(@NonNull String url, @NonNull Map<String, String> additionalHttpHeaders)` -> `void`
- `loadUrl(String url, WebMetadataCache.WebMetadata meta)` -> `void`

## `org.telegram.ui.web.MHTML$BoundedInputStream`
- `read()` -> `int`
- `read(byte[] b, int off, int len)` -> `int`

## `org.telegram.ui.web.MHTML$QuotedPrintableInputStream`
- `read()` -> `int`
- `read(byte[] b, int off, int len)` -> `int`

## `org.telegram.ui.web.WebInstantView`
- `static addLastSpace(TL_iv.RichText text)` -> `TL_iv.RichText`
- `static addNewLine(TL_iv.RichText text)` -> `TL_iv.RichText`
- `static cancelLoadPhoto(ImageReceiver imageReceiver)` -> `void`
- `isInline(JSONArray content)` -> `boolean`
- `static loadPhoto(WebPhoto photo, ImageReceiver imageReceiver, Runnable receivedSize)` -> `void`
- `readHTML(String url, InputStream stream, Utilities.Callback<JSONObject> whenDone)` -> `void`

## `org.telegram.ui.web.WebInstantView$Loader`
- `cancel()` -> `void`
- `isDone()` -> `boolean`

## `org.telegram.ui.web.WebMetadataCache`
- `load()` -> `void`
- `save(WebMetadata meta)` -> `void`
- `save()` -> `void`

## `org.telegram.ui.web.WebMetadataCache$MetadataFile`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.ui.web.WebMetadataCache$WebMetadata`
- `readParams(InputSerializedData stream, boolean exception)` -> `void`

## `org.telegram.utils.code.highlight.CodeHighlighting`
- `static getHighlighted(CharSequence text, String language)` -> `SpannableString`
- `static getLanguages()` -> `Set<String>`
- `static getTextSizeDecrement(int codeLength)` -> `int`
- `static highlight(Spannable text, int start, int end, String language, int type, TextStyleSpan.TextStyleRun style, boolean smallerSize)` -> `void`
- `static highlightEditable(CharSequence text, String language, Utilities.Callback<SpannableString> whenDone)` -> `void`
- `static prepare()` -> `void`

## `org.telegram.utils.code.highlight.CodeHighlighting$CacheKey`
- `equals(Object object)` -> `boolean`
- `hashCode()` -> `int`

## `org.telegram.utils.code.highlight.CodeHighlighting$LockedSpannableString`
- `getSpanEnd(Object what)` -> `int`
- `getSpanFlags(Object what)` -> `int`
- `getSpanStart(Object what)` -> `int`
- `getSpans(int queryStart, int queryEnd, Class<T> kind)` -> `T[]`
- `nextSpanTransition(int start, int limit, Class kind)` -> `int`
- `unlock()` -> `void`

## `org.telegram.utils.code.highlight.CodeHighlighting$LockedWithFallbackSpannableString`
- `getSpanEnd(Object what)` -> `int`
- `getSpanFlags(Object what)` -> `int`
- `getSpanStart(Object what)` -> `int`
- `getSpans(int queryStart, int queryEnd, Class<T> kind)` -> `T[]`
- `nextSpanTransition(int start, int limit, Class kind)` -> `int`

## `org.telegram.utils.code.highlight.CodeHighlighting$Span`
- `updateDrawState(TextPaint p)` -> `void`

## `org.telegram.utils.code.highlight.CodeHighlighting$SyntaxFontSpan`
- `updateMeasureState(TextPaint paint)` -> `void`

## `org.telegram.utils.code.highlight.PrismaHighlighter`
- `close()` -> `void`
- `getLanguages()` -> `String[]`
- `highlight(String text, String language)` -> `int[]`
- `tokenize(String text, String language)` -> `Tokenization`

## `org.telegram.utils.code.highlight.PrismaHighlighter$Tokenization`
- `alias(int index)` -> `String`
- `aliasId(int index)` -> `int`
- `copyStyledRanges()` -> `int[]`
- `end(int index)` -> `int`
- `estimatedBytes()` -> `long`
- `legacyRanges()` -> `int[]`
- `parent(int index)` -> `int`
- `size()` -> `int`
- `start(int index)` -> `int`
- `styledRanges()` -> `int[]`
- `type(int index)` -> `String`
- `typeId(int index)` -> `int`

## `org.telegram.utils.code.highlight.PrismaHighlightingService`
- `close()` -> `void`
- `getLanguages()` -> `Set<String>`
- `static normalizeLanguage(String language)` -> `String`
- `prepare()` -> `void`
- `request(String text, String language, Callback callback)` -> `Request`

## `org.telegram.utils.code.highlight.PrismaHighlightingService$Key`
- `equals(Object other)` -> `boolean`
- `hashCode()` -> `int`

## `org.telegram.utils.code.highlight.PrismaHighlightingService$Request`
- `cancel()` -> `void`
- `deliver(Result result)` -> `void`
- `isCancelled()` -> `boolean`

## `org.telegram.utils.code.highlight.PrismaTokenStyles`
- `static legacyGroup(int style)` -> `int`
- `resolve(PrismaHighlighter.Tokenization tokens)` -> `int[]`

## `org.telegram.utils.code.highlight.PrismaTokenStyles$RangeBuilder`
- `add(int start, int end, int style)` -> `void`
- `finish()` -> `int[]`

## `org.telegram.utils.localization.Localization`
- `get(int resNameHash)` -> `String`
- `getByResId(Context context, @StringRes int resId)` -> `String`
- `getByResName(String resName)` -> `String`
- `getByResNameOrResId(Context context, String resName, @StringRes int resId)` -> `String`

## `org.telegram.utils.localization.Localization$Builder`
- `addLocalization(HashMap<String, String> localization)` -> `Builder`
- `addLocalization(Localization localization)` -> `Builder`
- `addResLocalization(Context context, String localizationAssetPath)` -> `Builder`
- `build()` -> `Localization`

## `org.telegram.utils.proxy.WebProxyConnectionTester`
- `checkProxy(ProxySettings settings, RequestTimeDelegate delegate, TestImplementation testImplementation)` -> `void`
- `static getInstance()` -> `WebProxyConnectionTester`

## `org.telegram.utils.proxy.WebProxyTransport`
- `static isSupported()` -> `boolean`
- `static isValidSecret(String value)` -> `boolean`
- `static normalizeHost(String value)` -> `String`
- `onBecameBackground()` -> `void`
- `onBecameForeground()` -> `void`
- `static start(String address, String secret)` -> `int`
- `static startConnectionCheck(String address, String secret, ReadyCallback readyCallback)` -> `int`
- `static stop()` -> `void`
- `static stopConnectionCheck()` -> `void`

## `org.telegram.utils.recorder.round.RoundVideoCodecRecorder`
- `getTimeOriginNs()` -> `long`
- `isStarted()` -> `boolean`
- `onFrameSubmitted(long presentationTimeUs, long submittedNs)` -> `void`
- `prepare()` -> `Surface`
- `requestStop()` -> `long`
- `startRecording(@NonNull Runnable audioReadyListener, @NonNull Runnable videoReadyListener)` -> `void`
- `stop()` -> `void`

## `org.telegram.utils.recorder.round.RoundVideoDiagnostics`
- `error(@NonNull String message, @NonNull Throwable error)` -> `void`
- `getSessionId()` -> `long`
- `isEnabled()` -> `boolean`
- `log(@NonNull String message)` -> `void`

## `org.telegram.utils.recorder.round.RoundVideoGlProcessor`
- `beginCameraSwitch(@NonNull RoundVideoSession.CameraFacing from, @NonNull RoundVideoSession.CameraFacing to)` -> `void`
- `configureSecondaryInput(@NonNull Size size, int cropSize, boolean timestampRealtime)` -> `void`
- `getCameraSurface()` -> `Surface`
- `getSecondaryCameraSurface()` -> `Surface`
- `onCameraSessionConfigured()` -> `void`
- `setFirstFrameListener(@Nullable Runnable listener)` -> `void`
- `setSecondaryInputActive(boolean secondary)` -> `void`
- `setSecondaryInputActive(boolean secondary, @Nullable Runnable firstSelectedFrameListener)` -> `void`
- `start()` -> `Surface`
- `startRecording(long timeOriginNs)` -> `void`
- `stop()` -> `void`
- `stopRecordingAt(long presentationTimeUs)` -> `void`
- `updateInputConfiguration(@NonNull Size size, int cropSize, boolean timestampRealtime)` -> `void`

## `org.telegram.utils.recorder.round.RoundVideoMp4Writer`
- `closeForReplacement()` -> `void`
- `createPreview(@NonNull File previewFile)` -> `void`
- `finish()` -> `void`
- `getFile()` -> `File`
- `setTrackFormat(boolean video, @NonNull MediaFormat format)` -> `void`
- `writeSample(boolean video, @NonNull ByteBuffer source, @NonNull MediaCodec.BufferInfo sourceInfo, long timelineOffsetUs)` -> `void`

## `org.telegram.utils.recorder.round.RoundVideoMp4Writer$TrackTimeline`
- `add(long sourcePresentationTimeUs, long outputPresentationTimeUs)` -> `void`
- `nextPresentationTimeUs()` -> `long`
- `startSegment()` -> `void`

## `org.telegram.utils.recorder.round.RoundVideoOverlayRenderer`
- `captureSwitchFrame(int cameraTexture, @NonNull float[] textureMatrix, boolean newFrame)` -> `void`
- `finishCameraSwitch(long frameTimeNs)` -> `void`
- `getSwitchTargetBlurRadiusPx()` -> `float`
- `release()` -> `void`
- `render(int cameraTexture, @NonNull float[] textureMatrix, long frameTimeNs, int outputWidth, int outputHeight)` -> `void`
- `renderPreview(int cameraTexture, @NonNull float[] textureMatrix, int outputWidth, int outputHeight)` -> `void`
- `renderSwitch(float oldBlurRadius, float newBlur, float mix, int outputWidth, int outputHeight)` -> `void`
- `updateInputConfiguration(@NonNull Size inputSize, int sourceCropSize)` -> `void`

## `org.telegram.utils.recorder.round.RoundVideoOverlayRenderer$Program`
- `release()` -> `void`

## `org.telegram.utils.recorder.round.RoundVideoRemuxer`
- `static copyRange(@NonNull File source, @NonNull RoundVideoMp4Writer writer, long requestedStartMs, long requestedEndMs, boolean includeAudio)` -> `Result`
- `static erase(@NonNull File file)` -> `void`
- `static getDurationMs(@NonNull File file)` -> `long`

## `org.telegram.utils.recorder.round.RoundVideoSession`
- `cancel()` -> `boolean`
- `finish(boolean includeAudio)` -> `boolean`
- `getRecordedDurationMs()` -> `long`
- `getVideoBitrate()` -> `int`
- `pausePreview()` -> `boolean`
- `pauseRecording()` -> `boolean`
- `playPreview()` -> `boolean`
- `release()` -> `void`
- `resumeRecording()` -> `boolean`
- `seekPreview(long positionMs)` -> `boolean`
- `setCameraFacing(@NonNull CameraFacing facing)` -> `boolean`
- `setFlashEnabled(boolean enabled)` -> `boolean`
- `setPreviewMuted(boolean muted)` -> `boolean`
- `setTrimRange(long startMs, long endMs)` -> `boolean`
- `setZoom(float progress)` -> `boolean`
- `start()` -> `boolean`

## `org.telegram.utils.recorder.round.RoundVideoSession$FrameRate`
- `getValue()` -> `int`

## `org.telegram.utils.recorder.round.RoundVideoSession$Listener`
- `onCameraCapabilitiesChanged(@NonNull CameraCapabilities capabilities)` -> `default void`
- `onCameraSwitchCompleted(@NonNull CameraFacing facing)` -> `default void`
- `onCameraSwitchFirstFrame()` -> `default void`
- `onCameraSwitchStarted(@NonNull CameraFacing facing)` -> `default void`
- `onCompleted(@NonNull Result result)` -> `default void`
- `onError(@NonNull Exception error)` -> `default void`
- `onPreviewFirstFrame()` -> `default void`
- `onPreviewPlaybackChanged(boolean playing)` -> `default void`
- `onPreviewProgress(long positionMs, long durationMs)` -> `default void`
- `onPreviewReady(long durationMs, long trimStartMs, long trimEndMs)` -> `default void`
- `onStateChanged(@NonNull StateInfo stateInfo)` -> `default void`

## `org.telegram.utils.recorder.round.RoundVideoSession$OutputListener`
- `onBytesAvailable(long outputId, @NonNull File file, long offset, long length)` -> `default void`
- `onOutputCompleted(long outputId, @NonNull File file, long finalSize, long durationMs, boolean hasAudio)` -> `default void`
- `onOutputError(long outputId, @NonNull Exception error)` -> `default void`
- `onOutputInvalidated(long outputId, @NonNull OutputInvalidationReason reason)` -> `default void`
- `onOutputStarted(long outputId, @NonNull File file)` -> `default void`

## `org.telegram.utils.recorder.round.RoundVideoSession$OutputResolution`
- `getSize()` -> `int`

## `org.telegram.utils.recorder.round.RoundVideoSession$Result`
- `getDurationMs()` -> `long`
- `getOutputId()` -> `long`
- `hasAudio()` -> `boolean`

## `org.telegram.utils.recorder.round.RoundVideoSession$StateInfo`
- `canControlCamera()` -> `boolean`
- `canControlPreview()` -> `boolean`
- `canFinish()` -> `boolean`
- `canPauseRecording()` -> `boolean`
- `canResumeRecording()` -> `boolean`
- `getMaximumDurationMs()` -> `long`
- `getRecordedDurationMs()` -> `long`
- `getRecordingStartedAtRealtimeMs()` -> `long`
- `getTrimEndMs()` -> `long`
- `getTrimStartMs()` -> `long`
- `getZoomProgress()` -> `float`
- `isCameraSwitching()` -> `boolean`
- `isFlashEnabled()` -> `boolean`
- `isPreviewPlaying()` -> `boolean`

## `org.telegram.utils.recorder.round.RoundVideoSwitchTimingStore`
- `static getAverageMs(@NonNull RoundVideoSession.CameraFacing from, @NonNull RoundVideoSession.CameraFacing to)` -> `int`
- `static recordAndGetAverageMs(@NonNull RoundVideoSession.CameraFacing from, @NonNull RoundVideoSession.CameraFacing to, int durationMs)` -> `int`
