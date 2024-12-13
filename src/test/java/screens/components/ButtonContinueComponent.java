package screens.components;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class ButtonContinueComponent {
    @Step("надать на кнопку Вперед")
    public void clickOnContinueButton() {
        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
    }
}
