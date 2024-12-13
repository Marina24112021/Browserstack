package screens.components;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EqualTextsComponent {
    public void compareTexts(String selector, String expectedText) {
        String textInArticle = $(id(selector)).getText();
        assertEquals(expectedText, textInArticle);
    }
}
