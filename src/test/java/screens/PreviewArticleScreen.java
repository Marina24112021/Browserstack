package screens;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PreviewArticleScreen {
    @Step("Проверка названия заголовка {expectedTitle} согласно нажатой ссылке в статье. Тест негатиный - заголовок неверный")
    public void checkTitleOfLinkIsIncorrect(String expectedTitle) {
        String actualTitle = $(id("org.wikipedia.alpha:id/link_preview_title")).getText();
        assertNotEquals(expectedTitle, actualTitle);
    }
}
