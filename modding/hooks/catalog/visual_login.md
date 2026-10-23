# visual / login (253 методов)

## `org.telegram.messenger.RichMessageLayout$RichTextWithAuthorBlock`
- `forcesTimeToNewLine()` -> `boolean`
- `getLayout()` -> `Layout`
- `onDraw(Canvas canvas)` -> `void`

## `org.telegram.ui.ArticleViewer$BlockAuthorDateCell`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `getBoundLeft()` -> `int`
- `getBoundRight()` -> `int`
- `getLastLineBoundRight()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setBlock(TL_iv.pageBlockAuthorDate block)` -> `void`

## `org.telegram.ui.Cells.UnconfirmedAuthHintCell`
- `height()` -> `int`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `set(final BaseFragment fragment, int currentAccount)` -> `void`
- `showLoginPreventedSheet(ArrayList<UnconfirmedAuthController.UnconfirmedAuth> auths)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Cells.UnconfirmedAuthHintCell$TextViewWithLoading`
- `onDraw(Canvas canvas)` -> `void`
- `setLoading(boolean loading)` -> `void`
- `setLoading(boolean loading, boolean animated)` -> `void`
- `setPressed(boolean pressed)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.Components.LoginOrView`
- `onDraw(Canvas canvas)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setMeasureAfter(View measureAfter)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.Components.PasscodeView`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `isAppLock()` -> `boolean`
- `onAttachedToWindow()` -> `void`
- `onBackPressed()` -> `boolean`
- `onDetachedFromWindow()` -> `void`
- `onHidden()` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onShow(boolean fingerprint, boolean animated)` -> `void`
- `onShow(boolean fingerprint, boolean animated, int x, int y, Runnable onShow, Runnable onStart)` -> `void`
- `setDelegate(PasscodeViewDelegate delegate)` -> `void`

## `org.telegram.ui.Components.PasscodeView$AnimatingTextView`
- `appendCharacter(String c)` -> `void`
- `eraseLastCharacter()` -> `boolean`
- `getString()` -> `String`
- `length()` -> `int`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`

## `org.telegram.ui.Components.PasscodeView$PasscodeButton`
- `static letter(int num)` -> `String`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `setImage(int resId)` -> `void`
- `setNum(int num)` -> `void`

## `org.telegram.ui.Components.PasscodeViewDialog`
- `dismiss()` -> `void`
- `dispatchKeyEvent(@NonNull KeyEvent event)` -> `boolean`
- `onBackPressed()` -> `void`
- `onCreate(Bundle savedInstanceState)` -> `void`

## `org.telegram.ui.Components.TransformableLoginButtonView`
- `drawableHotspotChanged(float x, float y)` -> `void`
- `drawableStateChanged()` -> `void`
- `jumpDrawablesToCurrentState()` -> `void`
- `onDraw(@NonNull Canvas canvas)` -> `void`
- `setBackgroundColor(@ColorInt int color)` -> `void`
- `setButtonText(TextPaint textPaint, String buttonText)` -> `void`
- `setColor(@ColorInt int color)` -> `void`
- `setDrawBackground(boolean drawBackground)` -> `void`
- `setProgress(float p)` -> `void`
- `setRippleDrawable(Drawable d)` -> `void`
- `setTransformType(@TransformType int transformType)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.LoginActivity`
- `changeEmail(Runnable onFinishCallback)` -> `LoginActivity`
- `changeEmail(Runnable onFinishCallback, Runnable onSkipCallback, boolean isNonSkippable)` -> `LoginActivity`
- `changePhoneNumber()` -> `LoginActivity`
- `clearViews()` -> `void`
- `createView(Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `static errorString(Throwable e)` -> `String`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `isLightStatusBar()` -> `boolean`
- `isSwipeBackEnabled(MotionEvent event)` -> `boolean`
- `static needShowInvalidAlert(BaseFragment fragment, String phoneNumber, boolean banned)` -> `void`
- `static needShowInvalidAlert(BaseFragment fragment, String phoneNumber, PhoneInputData inputData, boolean banned)` -> `void`
- `onActivityResultFragment(int requestCode, int resultCode, Intent data)` -> `void`
- `onBackPressed(boolean invoked)` -> `boolean`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onCustomTransitionAnimation(boolean isOpen, Runnable callback)` -> `AnimatorSet`
- `onDialogDismiss(Dialog dialog)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onRequestPermissionsResultFragment(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `open(String phone, TLRPC.auth_SentCode res)` -> `void`
- `setIntroView(View intro, TextView startButton)` -> `LoginActivity`
- `setPage(@ViewNumber int page, boolean animated, Bundle params, boolean back)` -> `void`

## `org.telegram.ui.LoginActivity$LoadingTextView`
- `isResendingCode()` -> `boolean`
- `isRippleEnabled()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `setText(CharSequence text, BufferType type)` -> `void`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.LoginActivity$LoginActivityEmailCodeView`
- `getHeaderName()` -> `String`
- `needBackButton()` -> `boolean`
- `onDetachedFromWindow()` -> `void`
- `onHide()` -> `void`
- `onNextPressed(String code)` -> `void`
- `onShow()` -> `void`
- `restoreStateParams(Bundle bundle)` -> `void`
- `setParams(Bundle params, boolean restore)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.LoginActivity$LoginActivityNewPasswordView`
- `getHeaderName()` -> `String`
- `needBackButton()` -> `boolean`
- `onBackPressed(boolean force)` -> `boolean`
- `onCancelPressed()` -> `void`
- `onNextPressed(String code)` -> `void`
- `onShow()` -> `void`
- `restoreStateParams(Bundle bundle)` -> `void`
- `setParams(Bundle params, boolean restore)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.LoginActivity$LoginActivityPasswordView`
- `getHeaderName()` -> `String`
- `needBackButton()` -> `boolean`
- `onBackPressed(boolean force)` -> `boolean`
- `onCancelPressed()` -> `void`
- `onNextPressed(String code)` -> `void`
- `onShow()` -> `void`
- `restoreStateParams(Bundle bundle)` -> `void`
- `setParams(Bundle params, boolean restore)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.LoginActivity$LoginActivityPhraseView`
- `getHeaderName()` -> `String`
- `needBackButton()` -> `boolean`
- `onBackPressed(boolean force)` -> `boolean`
- `onCancelPressed()` -> `void`
- `onHide()` -> `void`
- `onNextPressed(String code)` -> `void`
- `onResume()` -> `void`
- `onShow()` -> `void`
- `restoreStateParams(Bundle bundle)` -> `void`
- `setParams(Bundle params, boolean restore)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.LoginActivity$LoginActivityRecoverView`
- `getHeaderName()` -> `String`
- `needBackButton()` -> `boolean`
- `onBackPressed(boolean force)` -> `boolean`
- `onCancelPressed()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onNextPressed(String code)` -> `void`
- `onShow()` -> `void`
- `restoreStateParams(Bundle bundle)` -> `void`
- `setParams(Bundle params, boolean restore)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.LoginActivity$LoginActivityRegisterView`
- `didUploadPhoto(final TLRPC.InputFile photo, final TLRPC.InputFile video, double videoStartTimestamp, String videoPath, final TLRPC.PhotoSize bigSize, final TLRPC.PhotoSize smallSize, boolean isVideo, TLRPC.VideoSize emojiMarkup)` -> `void`
- `getHeaderName()` -> `String`
- `needBackButton()` -> `boolean`
- `onBackPressed(boolean force)` -> `boolean`
- `onCancelPressed()` -> `void`
- `onNextPressed(String code)` -> `void`
- `onShow()` -> `void`
- `restoreStateParams(Bundle bundle)` -> `void`
- `setParams(Bundle params, boolean restore)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.LoginActivity$LoginActivityRegisterView$LinkSpan`
- `onClick(View widget)` -> `void`
- `updateDrawState(TextPaint ds)` -> `void`

## `org.telegram.ui.LoginActivity$LoginActivityResetWaitView`
- `getHeaderName()` -> `String`
- `needBackButton()` -> `boolean`
- `onBackPressed(boolean force)` -> `boolean`
- `restoreStateParams(Bundle bundle)` -> `void`
- `setParams(Bundle params, boolean restore)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.LoginActivity$LoginActivitySetupEmail`
- `getHeaderName()` -> `String`
- `needBackButton()` -> `boolean`
- `onNextPressed(String code)` -> `void`
- `onShow()` -> `void`
- `restoreStateParams(Bundle bundle)` -> `void`
- `setParams(Bundle params, boolean restore)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.LoginActivity$LoginActivitySmsView`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getHeaderName()` -> `String`
- `needBackButton()` -> `boolean`
- `onBackPressed(boolean force)` -> `boolean`
- `onCancelPressed()` -> `void`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onDestroyActivity()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onHide()` -> `void`
- `onNextPressed(String code)` -> `void`
- `onShow()` -> `void`
- `restoreStateParams(Bundle bundle)` -> `void`
- `setParams(Bundle params, boolean restore)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.LoginActivity$LoginPayView`
- `onHide()` -> `void`
- `setParams(Bundle params, boolean restore)` -> `void`

## `org.telegram.ui.LoginActivity$PhoneNumberConfirmView`
- `onLayout(boolean changed, int left, int top, int right, int bottom)` -> `void`

## `org.telegram.ui.LoginActivity$PhoneView`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `fillNumber()` -> `void`
- `getHeaderName()` -> `String`
- `onAttachedToWindow()` -> `void`
- `onCancelPressed()` -> `void`
- `onDestroyActivity()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onItemSelected(AdapterView<?> adapterView, View view, int i, long l)` -> `void`
- `onNextPressed(String code)` -> `void`
- `onNothingSelected(AdapterView<?> adapterView)` -> `void`
- `onShow()` -> `void`
- `restoreStateParams(Bundle bundle)` -> `void`
- `selectCountry(CountrySelectActivity.Country country)` -> `void`
- `updateColors()` -> `void`

## `org.telegram.ui.LoginActivity$ProgressView`
- `isProgressAnimationRunning()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onSizeChanged(int w, int h, int oldw, int oldh)` -> `void`
- `resetProgressAnimation()` -> `void`
- `startProgressAnimation(long duration)` -> `void`

## `org.telegram.ui.MessageAuthorView`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `openUser(long userId)` -> `void`

## `org.telegram.ui.OAuthSheet`
- `static getBulletinFactory()` -> `BulletinFactory`
- `static handle(boolean external, int currentAccount, TLRPC.TL_messages_requestUrlAuth request, TLRPC.UrlAuthResult result)` -> `void`
- `static handle(boolean external, int currentAccount, TLRPC.TL_messages_requestUrlAuth request, TLRPC.UrlAuthResult result, String originUrl, TLRPC.UrlAuthResult prevResult, String matchCode, boolean sentPhoneNumber, BotWebViewContainer webView)` -> `void`
- `static showMatchCodeSheet(Context context, int currentAccount, ArrayList<String> match_codes, String domain, Utilities.Callback<String> onSelected, boolean cancel, Runnable onCancel, Theme.ResourcesProvider resourcesProvider)` -> `BottomSheet`

## `org.telegram.ui.PasscodeActivity`
- `createView(Context context)` -> `View`
- `static determineOpenFragment()` -> `BaseFragment`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `getThemeDescriptions()` -> `ArrayList<ThemeDescription>`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `onTransitionAnimationEnd(boolean isOpen, boolean backward)` -> `void`
- `setOnEnteredCode(Runnable enteredCode)` -> `PasscodeActivity`
- `setOnOpenedSettings(Runnable openedSettings)` -> `void`

## `org.telegram.ui.PasscodeActivity$ListAdapter`
- `getItemCount()` -> `int`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.Wallet.GramWalletStorageAuth`
- `static authenticate(String walletId, boolean credentialOnly, Current isCurrent)` -> `String`
- `static onActivityDestroyed(Activity activity)` -> `void`
- `static onActivityResult(Activity activity, int requestCode, int resultCode)` -> `boolean`
- `static onActivityStopped(Activity activity)` -> `void`

## `org.telegram.ui.Wallet.GramWalletStorageAuth$Request`
- `finish(String error)` -> `void`
- `start(boolean credentialOnly)` -> `void`

## `org.telegram.ui.WearAuthSheet`
- `static onCancelReceived()` -> `void`
- `static onOfferReceived(byte[] data, String sourceNodeId)` -> `void`
- `static show()` -> `void`
- `static showEmojis(final int account, List<String> emojis)` -> `void`

## `org.telegram.ui.WearAuthSheet$AuthSession`
- `acceptAndBuildAnswer()` -> `byte[]`

## `org.telegram.ui.iv.RichQuoteAuthorCell`
- `bind(BlockRow row, Delegate delegate)` -> `void`
- `dispatchDraw(Canvas canvas)` -> `void`
- `fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> blocks)` -> `void`
- `getRow()` -> `BlockRow`
- `updateColors()` -> `void`

## `org.telegram.ui.iv.RichQuoteAuthorCell$Delegate`
- `onQuoteAuthorEnter(BlockRow row)` -> `default void`
- `onRequestWindowFocusable(RichEditText editText, boolean showKeyboard)` -> `default void`

## `org.telegram.ui.iv.RichQuoteAuthorCell$Factory`
- `bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView)` -> `void`
- `createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider)` -> `RichQuoteAuthorCell`
- `isClickable()` -> `boolean`
- `static of(BlockRow row, Delegate delegate)` -> `UItem`
