package screens.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchInputComponent {
    final SelenideElement accessibilityIdStr = $(accessibilityId("Search Wikipedia")),
            search_src_text = $(id("org.wikipedia.alpha:id/search_src_text"));

    @Step("Напечатать слово [{searchValue}]")
    public void setSearchValue(String searchValue) {
        accessibilityIdStr.click();
        search_src_text.sendKeys(searchValue);
    }
}
