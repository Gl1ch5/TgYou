package com.tgyou.plugins;

import com.tgyou.core.Plugin;
import com.tgyou.core.PluginContext;
import com.tgyou.core.Section;
import com.tgyou.core.SettingField;

import java.util.Arrays;
import java.util.List;

/** Выбор шрифта для жирного и курсивного текста (заголовки, имена, кнопки). Читается при запуске приложения. */
public final class FontsPlugin implements Plugin {

    @Override
    public String id() {
        return "fonts";
    }

    @Override
    public String name() {
        return "Шрифты";
    }

    @Override
    public String description() {
        return "Заменяет шрифт заголовков, имён, кнопок и курсива: системный, с засечками, рукописный, узкий, моноширинный "
                + "или ваш файл .ttf/.otf. Обычный текст остаётся системным. Применяется после перезапуска приложения.";
    }

    @Override
    public Section section() {
        return Section.INTERFACE;
    }

    @Override
    public List<SettingField> fields() {
        return Arrays.asList(
                SettingField.choice("family", "Шрифт", "Системный", "Системный", "С засечками", "Рукописный", "Узкий", "Моноширинный", "Свой файл"),
                SettingField.text("path", "Путь к файлу шрифта (для «Свой файл»)", "")
        );
    }

    @Override
    public void onLoad(PluginContext context) {
        // Шрифты читаются напрямую из настроек при первом обращении (TgYouFonts), до запуска плагинов.
    }
}
