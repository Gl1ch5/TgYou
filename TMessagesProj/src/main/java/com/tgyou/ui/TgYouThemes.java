package com.tgyou.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

import java.util.ArrayList;

/**
 * Список «Цветовая тема» в настройках чатов строится из account.getThemes("android"), и сервер может
 * вернуть его пустым. Тогда берём цветовые темы из account.getChatThemes (те же, что в выборе темы чата).
 */
public final class TgYouThemes {
    private TgYouThemes() {}

    /** @return true, если запрос запущен и список будет собран позже */
    public static boolean fallback(int account) {
        TL_account.getChatThemes request = new TL_account.getChatThemes();
        ConnectionsManager.getInstance(account).sendRequestTyped(request, (response, error) -> {
            if (!(response instanceof TL_account.TL_themes)) {
                return;
            }
            ArrayList<TLRPC.TL_theme> list = new ArrayList<>(((TL_account.TL_themes) response).themes);
            if (list.isEmpty()) {
                return;
            }
            AndroidUtilities.runOnUIThread(() -> MediaDataController.getInstance(account).generateEmojiPreviewThemes(list, account));
        });
        return true;
    }
}
