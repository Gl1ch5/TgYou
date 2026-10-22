package com.tgyou.ui;

import com.tgyou.core.TgYouListTweaks;
import com.tgyou.core.TgYouPrefs;
import com.tgyou.core.TgYouTweaks;

import org.telegram.ui.RestrictedLanguagesSelectActivity;

/** «Основные». */
public class BasicScreen extends TgYouScreen {

    @Override
    protected String screenTitle() {
        return "Основные";
    }

    @Override
    protected void build() {
        header("Общие");
        toggle(TgYouTweaks.NO_ROUND, "Отключить округление чисел", "Просмотры и счётчики показываются полностью: 1234567 вместо 1,2M.", false);
        toggle(TgYouTweaks.SECONDS, "Секунды в сообщениях", "Время в пузыре сообщения с секундами: 14:05:32.", false);
        toggle(TgYouTweaks.VIBRATION, "Вибрация", "Выключите, чтобы убрать вибрацию в интерфейсе. Часть системных вибраций обойти нельзя.", true);
        toggle(TgYouTweaks.NO_NOTIFY_DELAY, "Отключить задержку уведомлений", "Уведомления приходят сразу, без ожидания возможного прочтения на другом устройстве.", false);
        toggle(TgYouTweaks.ZALGO, "Убирать Zalgo", "Лишние комбинируемые символы в именах и сообщениях убираются, текст становится читаемым.", false);
        gap();

        header("Скорость загрузки");
        slider(TgYouTweaks.DOWNLOAD_BOOST, 0, null, "Откл.", "Быстро", "Ультра");
        header("Скорость отправки");
        slider(TgYouTweaks.UPLOAD_BOOST, 0, null, "Откл.", "Быстро", "Ультра");
        info("Ультра ускоряет загрузку, увеличивая число параллельных запросов. Это может нагрузить сеть и привести к временным ограничениям от Telegram. На слабом интернете отправка не ускоряется.");

        header("Хранилище");
        value("Папка для сохранения", () -> TgYouTweaks.saveFolder(), () -> askText("Папка для сохранения", TgYouTweaks.saveFolder(), false, text -> {
            String clean = text.replaceAll("[\\\\/:*?\"<>|]", "").trim();
            TgYouPrefs.setStr(TgYouTweaks.SAVE_FOLDER, clean.isEmpty() ? "TgYou" : clean);
            refresh();
        }));
        info("Сохранённые в галерею и загрузки попадают в эту папку вместо «Telegram».");

        header("Профиль");
        toggle(TgYouTweaks.RELATIVE_ONLINE, "Относительный онлайн", "«был(а) 5 минут назад» вместо «был(а) в 14:05».", false);
        toggle(TgYouTweaks.HIDE_PHONE, "Скрывать номер телефона", "Номер показывается в виде +7 *** ***-**-45.", false);
        choice(TgYouTweaks.SHOW_ID, "Показывать ID и DC", null, 1, "Отключено", "Telegram API", "Bot API");
        info("Строка с ID в профиле. Формат Bot API отличается для групп и каналов (-100…).");

        header("Архив");
        toggle(TgYouListTweaks.HIDE_ARCHIVE, "Скрывать архив", "Папка архива пропадает из списка чатов.", false);
        toggle(TgYouListTweaks.PULL_ARCHIVE, "Открывать архив при подтягивании", "Потяните список вниз, чтобы открыть архив.", false);
        toggle(TgYouListTweaks.NO_SWIPE_BACK, "Отключить жест «Вернуть»", "Свайп вправо в списке чатов не возвращает назад.", false);

        header("Перевод");
        value("Не переводить", () -> "", () -> presentFragment(new RestrictedLanguagesSelectActivity()));
        gap();
    }
}
