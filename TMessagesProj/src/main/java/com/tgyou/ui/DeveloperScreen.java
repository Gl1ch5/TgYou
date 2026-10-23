package com.tgyou.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;

import com.tgyou.core.Plugin;
import com.tgyou.core.PluginHost;
import com.tgyou.core.TgYouDebug;
import com.tgyou.mods.ModLog;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.ActionBar.AlertDialog;

/** «Для разработчиков»: режим отладки поверх окон, сведения о сборке, журналы модов. */
public class DeveloperScreen extends TgYouScreen {

    private static final String CATALOG_URL = "https://raw.githubusercontent.com/Gl1ch5/TgYou/main/modding/hooks/catalog/README.md";

    @Override
    protected String screenTitle() {
        return "Для разработчиков";
    }

    @Override
    protected void build() {
        header("Режим отладки");
        toggle(TgYouDebug.PREF, "Режим отладки", "Поверх окон появляется панель: «Выбрать» — тапните любой элемент и узнайте его класс, id, текст, "
                + "обработчик нажатия и данные чата или сообщения; «Границы» — рамки всех элементов.", false, v -> TgYouDebug.set((Boolean) v));
        info("Панель можно перетаскивать, выключается кнопкой «Выкл» на ней или здесь. Диалоги и всплывающие окна Android (отдельные окна) не проверяются, "
                + "только основное окно приложения. Найденное имя вставляйте в мод «Скрыть кнопки» или в свой мод.");
        gap();
        header("Сведения");
        value("Текущий экран", TgYouDebug::currentScreen, () -> { });
        value("Сборка", () -> TgYouVersion.beta() + " · Telegram " + BuildVars.BUILD_VERSION_STRING.replaceAll("-tgyou.*$", ""), () -> { });
        button("Скопировать сведения о системе", false, () -> {
            String text = "TgYou " + TgYouVersion.beta() + " (" + BuildVars.BUILD_VERSION_STRING + ")\n"
                    + "Android " + Build.VERSION.RELEASE + " (API " + Build.VERSION.SDK_INT + "), " + Build.MANUFACTURER + " " + Build.MODEL + "\n"
                    + "ABI: " + String.join(", ", Build.SUPPORTED_ABIS) + "\n"
                    + "Экран: " + TgYouDebug.currentScreen() + "\n"
                    + "Плагинов: " + (PluginHost.get() == null ? 0 : PluginHost.get().plugins().size());
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService(Context.CLIPBOARD_SERVICE))
                    .setPrimaryClip(ClipData.newPlainText("TgYou", text));
            toast("Скопировано");
        });
        gap();
        header("Моды");
        button("Журналы модов", false, this::showLogs);
        button("Каталог мест для хуков (GitHub)", false, () -> org.telegram.messenger.browser.Browser.openUrl(getParentActivity(), CATALOG_URL));
        info("Журнал показывает ошибки и сообщения api.log каждого мода. Полный каталог методов Telegram, куда можно поставить хук, лежит в репозитории, папка modding/hooks/catalog.");
    }

    private void showLogs() {
        if (getParentActivity() == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        PluginHost host = PluginHost.get();
        if (host != null) {
            for (Plugin p : host.plugins()) {
                if (p.isMod()) {
                    String log = ModLog.text(p.id());
                    sb.append("— ").append(p.id()).append(" —\n").append(log.isEmpty() ? "(пусто)" : log).append("\n\n");
                }
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle("Журналы модов");
        builder.setMessage(sb.length() == 0 ? "Модов нет." : sb.toString().trim());
        builder.setPositiveButton("Закрыть", null);
        showDialog(builder.create());
    }
}
