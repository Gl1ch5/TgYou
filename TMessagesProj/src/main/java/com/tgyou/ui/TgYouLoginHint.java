package com.tgyou.ui;

import android.text.SpannableStringBuilder;

/** Tells on the login code screen how the code was sent and what Telegram offers next. */
public final class TgYouLoginHint {

    private TgYouLoginHint() {
    }

    public static CharSequence append(CharSequence text, int type, int next) {
        SpannableStringBuilder result = new SpannableStringBuilder(text == null ? "" : text);
        result.append("\n\nКод отправлен: ").append(name(type));
        result.append(next == 0 ? ". Других способов Telegram не предлагает." : ". Дальше можно: " + name(next) + ".");
        if (type == 1) {
            result.append(" Код приходит в Telegram на другое устройство, где вы уже вошли (в том числе на удалённую установку). Нажмите «Не получили код?»: приложение запросит у Telegram другой способ, например почту.");
        }
        return result;
    }

    /** Code went to a Telegram session and no next method is listed: ask the server for another one anyway (email, SMS). */
    public static boolean forceResend(int type) {
        return type == 1;
    }

    private static String name(int type) {
        switch (type) {
            case 1:
                return "в приложение Telegram";
            case 2:
                return "SMS";
            case 3:
                return "звонок со сбросом";
            case 4:
                return "голосовой звонок";
            case 11:
                return "пропущенный звонок";
            case 15:
                return "Fragment";
            case 16:
                return "SMS со словом";
            case 17:
                return "SMS с фразой";
            default:
                return "тип " + type;
        }
    }
}
