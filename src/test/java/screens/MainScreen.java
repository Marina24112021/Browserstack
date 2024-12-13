package screens;

import io.qameta.allure.Step;
import screens.components.EqualTextsComponent;

public class MainScreen {
    EqualTextsComponent component = new EqualTextsComponent();

    @Step("Проверка на несоответствие текста на главной странице wiki")
    public void checkStaticTextIsIncorrect() {
        String expectedArticle = "Customize your Explore feed\n" +
                "\nYou can now choose what to show on your feed, and also prioritize your favorite types of content.";

        component.compareTexts("org.wikipedia.alpha:id/view_announcement_text", expectedArticle);
    }
}
