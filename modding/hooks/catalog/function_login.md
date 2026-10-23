# function / login (64 методов)

## `org.telegram.messenger.AuthTokensHelper`
- `static addLogOutToken(TLRPC.TL_auth_loggedOut response)` -> `void`
- `static clearLogInTokens()` -> `void`
- `static getSavedLogInTokens()` -> `ArrayList<TLRPC.TL_auth_authorization>`
- `static getSavedLogOutTokens()` -> `ArrayList<TLRPC.TL_auth_loggedOut>`
- `static saveLogInToken(TLRPC.TL_auth_authorization token)` -> `void`
- `static saveLogOutTokens(ArrayList<TLRPC.TL_auth_loggedOut> tokens)` -> `void`

## `org.telegram.messenger.AuthenticatorService`
- `getAuthenticator()` -> `Authenticator`
- `onBind(Intent intent)` -> `IBinder`

## `org.telegram.messenger.AuthenticatorService$Authenticator`
- `confirmCredentials(AccountAuthenticatorResponse response, Account account, Bundle options)` -> `Bundle`
- `editProperties(AccountAuthenticatorResponse response, String accountType)` -> `Bundle`
- `getAccountRemovalAllowed(AccountAuthenticatorResponse response, Account account)` -> `Bundle`
- `getAuthTokenLabel(String authTokenType)` -> `String`

## `org.telegram.messenger.RichMessageLayout$RichTextWithAuthorBlock`
- `appendAccessibilityText(SpannableStringBuilder sb)` -> `void`
- `findLink(CharacterStyle link, int blockY, FoundLink out)` -> `boolean`
- `getHeight()` -> `int`
- `getLastLineWidth()` -> `int`
- `getMinWidth()` -> `int`
- `getText()` -> `TextSelectionHelper.TextLayoutBlock[]`
- `getTextWidth()` -> `int`
- `onAttachedToWindow()` -> `void`
- `onDetachedFromWindow()` -> `void`
- `onTouchEvent(MotionEvent event)` -> `boolean`
- `placeTexts(int blockX, int blockY, int row)` -> `void`

## `org.telegram.messenger.UnconfirmedAuthController`
- `cleanup()` -> `void`
- `confirm(ArrayList<UnconfirmedAuth> list, Utilities.Callback<ArrayList<UnconfirmedAuth>> whenDone)` -> `void`
- `deny(ArrayList<UnconfirmedAuth> list, Utilities.Callback<ArrayList<UnconfirmedAuth>> whenDone)` -> `void`
- `processUpdate(TL_update.TL_updateNewAuthorization update)` -> `void`
- `processUpdate(TL_update.TL_updateNewBotConnection update)` -> `void`
- `putDebug()` -> `void`
- `readCache()` -> `void`
- `saveCache()` -> `void`

## `org.telegram.messenger.UnconfirmedAuthController$UnconfirmedAuth`
- `confirm(Utilities.Callback<Boolean> whenDone)` -> `void`
- `deny(Utilities.Callback<Boolean> whenDone)` -> `void`
- `expired()` -> `boolean`
- `expiresAfter()` -> `long`
- `serializeToStream(OutputSerializedData stream)` -> `void`

## `org.telegram.messenger.WearAuthListenerService`
- `onMessageReceived(@NonNull MessageEvent event)` -> `void`

## `org.telegram.messenger.support.fingerprint.FingerprintManagerCompat$AuthenticationResult`
- `getCryptoObject()` -> `CryptoObject`

## `org.telegram.messenger.support.fingerprint.FingerprintManagerCompatApi23$AuthenticationResultInternal`
- `getCryptoObject()` -> `CryptoObject`

## `org.telegram.ui.Components.PasscodeView`
- `checkFingerprint()` -> `void`
- `hasFingerprint()` -> `boolean`
- `onAnimationUpdate(float open)` -> `void`
- `processDone(boolean fingerprint)` -> `void`

## `org.telegram.ui.LoginActivity`
- `cancelAccountDeletion(String phone, Bundle params, TLRPC.TL_auth_sentCode sentCode)` -> `LoginActivity`
- `static loadCurrentState(boolean newAccount, int currentAccount)` -> `Bundle`
- `saveSelfArgs(Bundle outState)` -> `void`

## `org.telegram.ui.LoginActivity$LoginActivityEmailCodeView`
- `hasCustomKeyboard()` -> `boolean`
- `saveStateParams(Bundle bundle)` -> `void`

## `org.telegram.ui.LoginActivity$LoginActivityNewPasswordView`
- `saveStateParams(Bundle bundle)` -> `void`

## `org.telegram.ui.LoginActivity$LoginActivityPasswordView`
- `saveStateParams(Bundle bundle)` -> `void`

## `org.telegram.ui.LoginActivity$LoginActivityPhraseView`
- `saveStateParams(Bundle bundle)` -> `void`

## `org.telegram.ui.LoginActivity$LoginActivityRecoverView`
- `hasCustomKeyboard()` -> `boolean`
- `saveStateParams(Bundle bundle)` -> `void`

## `org.telegram.ui.LoginActivity$LoginActivityRegisterView`
- `saveStateParams(Bundle bundle)` -> `void`

## `org.telegram.ui.LoginActivity$LoginActivityResetWaitView`
- `saveStateParams(Bundle bundle)` -> `void`

## `org.telegram.ui.LoginActivity$LoginActivitySetupEmail`
- `saveStateParams(Bundle bundle)` -> `void`

## `org.telegram.ui.LoginActivity$LoginActivitySmsView`
- `hasCustomKeyboard()` -> `boolean`
- `saveStateParams(Bundle bundle)` -> `void`

## `org.telegram.ui.LoginActivity$PhoneView`
- `hasCustomKeyboard()` -> `boolean`
- `saveStateParams(Bundle bundle)` -> `void`

## `org.telegram.ui.MessageAuthorView`
- `requestLayout()` -> `void`

## `org.telegram.ui.PasscodeActivity`
- `hasForceLightStatusBar()` -> `boolean`

## `org.telegram.ui.Wallet.GramWalletStorageAuth`
- `static cancel(String walletId)` -> `void`

## `org.telegram.ui.WearAuthSheet`
- `static cancel()` -> `void`
