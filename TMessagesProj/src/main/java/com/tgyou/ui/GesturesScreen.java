package com.tgyou.ui;

import com.tgyou.core.TgYouGestures;

/** «Жесты»: свайп по пузырю и двойной тап в чате. */
public class GesturesScreen extends TgYouScreen {

    @Override
    protected String screenTitle() {
        return "Жесты";
    }

    @Override
    protected void build() {
        header("Свайп по пузырю");
        master("swipe", "Быстрый переход свайпом", TgYouGestures.SWIPE_KEYS, new String[]{
                "Свайп по пузырю: ответ",
                "Свайп по пузырю: в избранное"}, new boolean[]{true, false});
        info("Если выключены оба пункта, пузырь не двигается. Если включены оба, свайп по чужому сообщению отвечает, а по своему отправляет в Избранное.");
        gap();

        header("Двойной тап");
        choice(TgYouGestures.DOUBLE_OTHER, "По чужому сообщению", null, 0, TgYouGestures.DOUBLE_LABELS);
        choice(TgYouGestures.DOUBLE_OWN, "По своему сообщению", null, 0, TgYouGestures.DOUBLE_LABELS);
        info("«Реакция» оставляет стандартное поведение Telegram (реакция из настроек быстрой реакции).");
        gap();
    }
}
