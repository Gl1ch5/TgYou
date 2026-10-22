package com.tgyou.plugins;

import com.tgyou.core.Hooks;
import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.Section;

/** Временные фото и видео открываются как обычные и не исчезают из чата после просмотра. */
public final class TtlMediaPlugin implements Plugin {

    @Override
    public String id() {
        return "ttl_media";
    }

    @Override
    public String name() {
        return "Сохранять временные фото";
    }

    @Override
    public String description() {
        return "Фото и видео с таймером самоуничтожения в обычных чатах показываются как обычные: без размытия, "
                + "без стирания после просмотра. Сервер при этом не узнаёт, что вы их открыли. "
                + "Уже истёкшие на сервере медиа вернуть нельзя.";
    }

    @Override
    public Section section() {
        return Section.MESSAGES;
    }

    @Override
    public void onLoad(PluginContext context) {
        context.on(Hooks.KEEP_TTL_MEDIA, (ignored, keep) -> true);
    }
}
