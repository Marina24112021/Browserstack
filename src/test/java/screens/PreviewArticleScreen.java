package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static org.assertj.core.api.Assertions.assertThat;

public class PreviewArticleScreen {
    @Step("Проверка названия заголовка {title} согласно нажатой ссылке")
    public void checkTitleLink(String title) {
        final SelenideElement link_preview_title = $(id("org.wikipedia.alpha:id/link_preview_title"));
        assertThat(link_preview_title.getText().contains(title));
    }
}
