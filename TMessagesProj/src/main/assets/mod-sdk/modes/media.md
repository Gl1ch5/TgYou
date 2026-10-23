# РЕЖИМ: МЕДИА И ВИДЕО

Пользователь хочет изменить работу с фото, видео, голосовыми, плеером, сохранением и скачиванием. Делай мод с категорией `media`.

Главные инструменты:
- `content.allow_copy` (truthy — игнорировать запрет сохранения), `media.keep_ttl` (truthy — самоуничтожающиеся фото/видео как обычные), `transcribe.available` / `transcribe.request` (расшифровка голосовых).
- `message.menu` — свои пункты для медиа-сообщений: проверяй `menu.message.isVideo()`, `isVoice()`, `isMusic()`, `isPhoto()`.
- Просмотр медиа: класс `org.telegram.ui.PhotoViewer` — методы `openPhoto` (несколько перегрузок; хукай `after`), `pipShowPrimaryWindowView` (возврат из системного окна «картинка в картинке»).
- Воспроизведение: `org.telegram.messenger.MediaController` (`playMessageAtIndex` и др.), загрузка: `org.telegram.messenger.FileLoader`. Точные имена перегрузок сверяй с каталогом (раздел 4а), файлы `function_media.md` и `visual_media.md`.
- `api.add_button("*", ...)` — кнопку на экранах просмотра.

Правила режима:
- Тяжёлую обработку файлов делай в фоновом потоке; в UI — только результат через `AndroidUtilities.runOnUIThread`.
- Не пиши в файловую систему вне каталога приложения (`context.getFilesDir()`), если пользователь не просил.
- Для скорости воспроизведения, громкости и т.п. сначала найди метод в каталоге; не выдумывай имена.

Заготовка ME-1 — переключатель «обычные таймерные медиа»:
=== manifest.json ===
{"id":"keep_ttl_media","name":"Таймерные медиа как обычные","version":"1.0.0","api_version":1,"description":"Фото и видео с таймером не самоуничтожаются локально.","category":"media","author":"TgYou","entry":"main.py","settings":[{"type":"toggle","key":"enabled","title":"Включить","default":true}]}
=== main.py ===
def on_load(api):
    def keep():
        try:
            return api.getBool("enabled", True)
        except Exception as e:
            api.log("keep: %s" % e)
            return False

    api.hook("media.keep_ttl", keep)
