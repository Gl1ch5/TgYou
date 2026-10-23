package com.tgyou.ui;

import android.content.Intent;
import android.net.Uri;

import com.tgyou.core.TgYouDb;
import com.tgyou.core.TgYouPrefs;
import com.tgyou.core.TgYouSpy;
import com.tgyou.plugins.AntiRecallPlugin;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.DialogsActivity;

import java.io.File;
import java.io.InputStream;
import java.util.Locale;

/** «Шпион»: что сохранять, пока собеседник удаляет, правит и читает. */
public class SpyScreen extends TgYouScreen {

    private static final int REQUEST_IMPORT = 7301;

    @Override
    protected String screenTitle() {
        return "Шпион";
    }

    private static String size(long bytes) {
        if (bytes >= 1024L * 1024 * 1024) {
            return String.format(Locale.US, "%.1f ГБ", bytes / 1024.0 / 1024 / 1024);
        }
        return String.format(Locale.US, "%.1f МБ", bytes / 1024.0 / 1024);
    }

    @Override
    protected void build() {
        tab("Сохранение");
        toggle(AntiRecallPlugin.KEEP_DELETED, "Сохранять удалённые сообщения", "Удалённое собеседником остаётся в чате с пометкой.", true);
        toggle(AntiRecallPlugin.KEEP_EDITS, "Сохранять историю правок", "Все прежние версии изменённого сообщения доступны из его меню.", true);
        toggle(AntiRecallPlugin.KEEP_READS, "Сохранять дату чтения", "Запоминает, когда собеседник прочитал ваше сообщение, и показывает это в меню сообщения. Работает с момента включения.", true);
        toggle(TgYouSpy.SAVE_LAST_ONLINE, "Сохранять последний онлайн", "Показывает последний известный онлайн, даже если пользователь скрыл его.", false);
        gap();
        tab("Вложения");
        toggle(TgYouSpy.SAVE_ATTACHMENTS, "Сохранять вложения", "Копирует скачанные вложения в отдельную папку, чтобы они не пропали вместе с сообщением.", false);
        header("Размер папки вложений");
        slider(TgYouSpy.LIMIT, 1, null, TgYouSpy.LIMIT_LABELS);
        value("Занято", () -> size(TgYouSpy.usedBytes()), () -> confirm("Очистить папку?", "Сохранённые вложения будут удалены.", "Очистить", () -> {
            TgYouSpy.clearFolder();
            refresh();
        }));
        info("Папка: Android/data/<приложение>/files/Saved Attachments. Сохраняются документы, фото и видео, которые уже скачаны приложением; стикеры и миниатюры пропускаются.");
        gap();
        tab("Исключения");
        value("Исключения", () -> String.valueOf(TgYouPrefs.list(AntiRecallPlugin.EXCEPTIONS).size()),
                () -> presentFragment(new ListEditScreen("Исключения", AntiRecallPlugin.EXCEPTIONS, true,
                        "В этих чатах сохранение удалённых и изменённых сообщений отключено. Удалённые сообщения обычных групп и личных чатов Telegram присылает без указания чата, поэтому для них исключения действуют только на правки.")));
        gap();
        tab("База");
        header("База данных");
        button("Экспортировать базу", false, this::exportDb);
        button("Импортировать базу", false, () -> {
            Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.setType("*/*");
            startActivityForResult(Intent.createChooser(intent, "База TgYou"), REQUEST_IMPORT);
        });
        button("Очистить базу", true, () -> confirm("Очистить базу?", "Удалённые сообщения, правки и даты прочтения будут стёрты.", "Очистить", () -> {
            TgYouDb.get().clearAll();
            toast("База очищена");
        }));
        info("В базе лежат удалённые сообщения, история правок и даты чтения.");
    }

    private void exportDb() {
        try {
            File dir = ApplicationLoader.applicationContext.getExternalFilesDir(null);
            if (dir == null) {
                dir = ApplicationLoader.applicationContext.getFilesDir();
            }
            File target = new File(dir, "tgyou-backup.db");
            TgYouDb.get().exportTo(target);
            toast("Сохранено: " + target.getAbsolutePath());
        } catch (Throwable t) {
            toast("Не удалось экспортировать: " + t.getMessage());
        }
    }

    @Override
    public void onActivityResultFragment(int requestCode, int resultCode, Intent data) {
        if (requestCode != REQUEST_IMPORT || resultCode != android.app.Activity.RESULT_OK || data == null || data.getData() == null) {
            return;
        }
        Uri uri = data.getData();
        try (InputStream in = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri)) {
            TgYouDb.importFrom(in);
            toast("База импортирована. Перезапустите приложение.");
        } catch (Throwable t) {
            toast("Не удалось импортировать: " + t.getMessage());
        }
    }
}
