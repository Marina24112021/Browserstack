package screens;

import io.qameta.allure.Step;
import screens.components.EqualTextsComponent;

public class ReadingListsWithSyncScreen {
    EqualTextsComponent component = new EqualTextsComponent();

    @Step("Проверка страницы ReadingListsWithSync")
    public void checkTextOnReadingListsWithSync() {
        component.compareTexts("org.wikipedia.alpha:id/primaryTextView",
                "Reading lists with sync");
    }
}
