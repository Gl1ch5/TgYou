# visual / notifications (64 методов)

## `org.telegram.messenger.NotificationsController`
- `static loadMultipleAvatars(ArrayList<Object> avatars)` -> `Bitmap`

## `org.telegram.ui.Cells.NotificationsCheckCell`
- `getCheckBox()` -> `Switch`
- `isChecked()` -> `boolean`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`
- `setAnimationsEnabled(boolean animationsEnabled)` -> `void`
- `setChecked(boolean checked)` -> `void`
- `setChecked(boolean checked, int iconType)` -> `void`
- `setDrawLine(boolean value)` -> `void`
- `setMultiline(boolean multiline)` -> `void`
- `setTextAndValueAndCheck(CharSequence text, CharSequence value, boolean checked, boolean divider)` -> `void`
- `setTextAndValueAndCheck(CharSequence text, CharSequence value, boolean checked, int iconType, boolean divider)` -> `void`
- `setTextAndValueAndCheck(CharSequence text, CharSequence value, boolean checked, int iconType, boolean multiline, boolean divider)` -> `void`
- `setTextAndValueAndIconAndCheck(CharSequence text, CharSequence value, int iconResId, boolean checked, int iconType, boolean multiline, boolean divider)` -> `void`
- `setTextAndValueAndIconAndCheck(CharSequence text, CharSequence value, int iconResId, boolean checked, int iconType, boolean multiline, boolean divider, boolean animated)` -> `void`
- `setValue(CharSequence value)` -> `void`

## `org.telegram.ui.Components.ChatNotificationsPopupWrapper`
- `showAsOptions(BaseFragment parentFragment, View anchorView, float touchedX, float touchedY, boolean fromProfileActions)` -> `void`
- `update(long dialogId, long topicId, HashSet<Integer> topicExceptions)` -> `void`

## `org.telegram.ui.NotificationPermissionDialog`
- `static askLater()` -> `void`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `dismiss()` -> `void`
- `show()` -> `void`
- `updateCounter()` -> `void`

## `org.telegram.ui.NotificationPermissionDialog$CounterView`
- `onDraw(Canvas canvas)` -> `void`
- `setCount(int count)` -> `boolean`
- `verifyDrawable(@NonNull Drawable who)` -> `boolean`

## `org.telegram.ui.NotificationsSoundActivity`
- `createView(final Context context)` -> `View`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `didSelectFiles(ArrayList<String> files, String caption, ArrayList<TLRPC.MessageEntity> captionEntities, ArrayList<MessageObject> fmessages, boolean notify, int scheduleDate, int scheduleRepeatPeriod, long effectId, boolean invertMedia, long payStars)` -> `void`
- `static findRingtonePathByName(String title)` -> `String`
- `getResourceProvider()` -> `Theme.ResourcesProvider`
- `isSupportEdgeToEdge()` -> `boolean`
- `onActivityResultFragment(int requestCode, int resultCode, Intent data)` -> `void`
- `onFragmentCreate()` -> `boolean`
- `onFragmentDestroy()` -> `void`
- `onInsets(int left, int top, int right, int bottom)` -> `void`
- `onPause()` -> `void`
- `onResume()` -> `void`
- `startDocumentSelectActivity()` -> `void`
- `static trimTitle(TLRPC.Document document, String title)` -> `String`

## `org.telegram.ui.NotificationsSoundActivity$Adapter`
- `getItemCount()` -> `int`
- `getItemId(int position)` -> `long`
- `getItemViewType(int position)` -> `int`
- `isEnabled(RecyclerView.ViewHolder holder)` -> `boolean`
- `onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)` -> `void`
- `onCreateViewHolder(@NonNull ViewGroup parent, int viewType)` -> `RecyclerView.ViewHolder`

## `org.telegram.ui.NotificationsSoundActivity$Tone`
- `getUriForShare(int currentAccount)` -> `Uri`

## `org.telegram.ui.NotificationsSoundActivity$ToneCell`
- `onDraw(Canvas canvas)` -> `void`
- `onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info)` -> `void`
- `onMeasure(int widthMeasureSpec, int heightMeasureSpec)` -> `void`

## `org.telegram.ui.PopupNotificationActivity`
- `didReceivedNotification(int id, int account, Object... args)` -> `void`
- `onBackPressed()` -> `void`
- `onConfigurationChanged(Configuration newConfig)` -> `void`
- `onCreate(Bundle savedInstanceState)` -> `void`
- `onDestroy()` -> `void`
- `onFinish()` -> `void`
- `onNewIntent(Intent intent)` -> `void`
- `onPause()` -> `void`
- `onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults)` -> `void`
- `onResume()` -> `void`
- `onTouchEventMy(MotionEvent motionEvent)` -> `boolean`

## `org.telegram.ui.PopupNotificationActivity$FrameLayoutTouch`
- `onInterceptTouchEvent(MotionEvent ev)` -> `boolean`
- `onTouchEvent(MotionEvent ev)` -> `boolean`
