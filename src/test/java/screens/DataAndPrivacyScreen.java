package screens;

import io.qameta.allure.Step;
import screens.components.EqualTextsComponent;

public class DataAndPrivacyScreen {
    EqualTextsComponent component = new EqualTextsComponent();

    @Step("Проверка страницы DataAndPrivacy")
    public void checkTextOnDataAndPrivacy() {
        component.compareTexts("org.wikipedia.alpha:id/primaryTextView",
                "Data & Privacy");
    }
}
