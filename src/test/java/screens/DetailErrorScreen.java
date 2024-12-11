package screens;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class DetailErrorScreen {
    final SelenideElement view_wiki_error_text = $(id("org.wikipedia.alpha:id/view_wiki_error_text"));

    @Step("Проверить, что отображается сообщение об ошибке")
    public void checkErrorMessageIsVisible() {
        view_wiki_error_text.shouldBe(Condition.visible);
    }
}
