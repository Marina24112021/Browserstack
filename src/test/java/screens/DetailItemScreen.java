package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class DetailItemScreen {
    @Step("Найти в статье {linkVal} и перейти по ней")
    public void clickOnLink(String linkVal) {
        SelenideElement xpathLink = $x("//android.view.View[@content-desc='" + linkVal + "']");
        xpathLink.click();
    }
}
