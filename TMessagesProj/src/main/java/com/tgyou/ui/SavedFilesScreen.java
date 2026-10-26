package com.tgyou.ui;

import android.content.Intent;

import com.tgyou.core.TgYouSpy;

import org.telegram.messenger.ApplicationLoader;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/** Список сохранённых вложений из закрытой папки: открыть по тапу, удалить по кнопке. */
public class SavedFilesScreen extends TgYouScreen {

    @Override
    protected String screenTitle() {
        return "Сохранённые вложения";
    }

    @Override
    protected void build() {
        List<File> files = TgYouSpy.files();
        if (files.isEmpty()) {
            info("Пока ничего не сохранено.");
            return;
        }
        info("Всего файлов: " + files.size() + ". Нажмите на файл, чтобы открыть; «Личный» — из личного чата.");
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
        for (File f : files) {
            String sub = String.format(Locale.US, "%s%.1f МБ · %s", TgYouSpy.isPrivate(f) ? "Личный · " : "", f.length() / 1024.0 / 1024, df.format(new Date(f.lastModified())));
            value(TgYouSpy.displayName(f), () -> sub, () -> open(f));
        }
        gap();
        button("Удалить все вложения", true, () -> confirm("Удалить все вложения?", "Все сохранённые вложения будут удалены.", "Удалить", () -> {
            TgYouSpy.clearFolder();
            refresh();
        }));
    }

    private void open(File f) {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            android.net.Uri uri = androidx.core.content.FileProvider.getUriForFile(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", f);
            String ext = android.webkit.MimeTypeMap.getFileExtensionFromUrl(TgYouSpy.displayName(f));
            String mime = ext == null ? null : android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(ext.toLowerCase(Locale.ROOT));
            intent.setDataAndType(uri, mime != null ? mime : "*/*");
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            getParentActivity().startActivity(intent);
        } catch (Throwable t) {
            confirm("Удалить файл?", "Не удалось открыть файл. Удалить его?", "Удалить", () -> {
                f.delete();
                refresh();
            });
        }
    }
}
