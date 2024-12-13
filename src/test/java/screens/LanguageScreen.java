package screens;

import io.qameta.allure.Step;
import screens.components.EqualTextsComponent;

public class LanguageScreen {
    EqualTextsComponent component = new EqualTextsComponent();

    @Step("Проверить страницы Language")
    public void checkTextOnLanguage() {
        component.compareTexts("org.wikipedia.alpha:id/secondaryTextView",
                "We’ve found the following on your device:");

    }
}
