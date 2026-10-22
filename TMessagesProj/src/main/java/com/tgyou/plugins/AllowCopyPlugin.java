package com.tgyou.plugins;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.Section;

/** Игнорирует флаг «запретить сохранение содержимого»: копирование, пересылка и сохранение работают. */
public final class AllowCopyPlugin implements Plugin {

    @Override
    public String id() {
        return "allow_copy";
    }

    @Override
    public String name() {
        return "Снять запрет копирования";
    }

    @Override
    public String description() {
        return "В каналах и чатах с защитой содержимого можно копировать текст, пересылать и сохранять медиа. "
                + "Флаг снимается на вашем устройстве при получении данных; сервер ничего не узнаёт. "
                + "Применяется к новым и заново загруженным сообщениям (перезапустите приложение). "
                + "В ваших собственных каналах настройка защиты в окне редактирования будет показана выключенной.";
    }

    @Override
    public boolean enabledByDefault() {
        return true;
    }

    @Override
    public Section section() {
        return Section.MESSAGES;
    }

    @Override
    public void onLoad(PluginContext context) {
        context.on(Hooks.ALLOW_COPY, (ignored, allow) -> true);
    }
}
