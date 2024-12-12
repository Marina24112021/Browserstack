package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static org.assertj.core.api.Assertions.assertThat;

public class MainScreen {
    @Step("Найти статичный текст на главной странице")
    public void checkStaticText() {
        final SelenideElement view_announcement_text = $(id("org.wikipedia.alpha:id/view_announcement_text"));
        assertThat(view_announcement_text.getText().contains(
                "Customize your Explore feed \n" +
                        "\n You can now choose what to show on your feed, and also prioritize your favorite types of content."));

    }
}
