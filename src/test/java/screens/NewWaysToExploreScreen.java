package screens;

import io.qameta.allure.Step;
import screens.components.EqualTextsComponent;

public class NewWaysToExploreScreen {
    EqualTextsComponent component = new EqualTextsComponent();

    @Step("Проверка страницы NewWaysToExplore")
    public void checkTextOnNewWaysToExplore() {
        component.compareTexts("org.wikipedia.alpha:id/primaryTextView",
                "New ways to explore");
    }
}
