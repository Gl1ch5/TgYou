package com.tgyou.core;

/** Tabs of the TgYou settings screen. A plugin picks the one it belongs to. */
public enum Section {
    PRIVACY("Приватность", "Режим призрака, статусы, чтение"),
    MESSAGES("Сообщения", "История, удалённые и изменённые, пометки"),
    FILTERS("Фильтры", "Реклама и скрытие лишнего"),
    INTERFACE("Интерфейс", "Оформление, шрифты, камера, плеер"),
    AI("ИИ и голос", "Распознавание голосовых, перевод"),
    MISC("Прочее", "Premium и остальное");

    public final String title;
    public final String description;

    Section(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
