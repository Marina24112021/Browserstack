package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class ProfilePage {

    final SelenideElement accessibilityIdStr = $(accessibilityId("Search Wikipedia")),
            search_src_text = $(id("org.wikipedia.alpha:id/search_src_text")),
            view_wiki_error_text = $(id("org.wikipedia.alpha:id/view_wiki_error_text"));
    ElementsCollection elementsCollection = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    @Step("Напечатать слово [{searchValue}]")
    public void setSearchValue(String searchValue) {
        accessibilityIdStr.click();
        search_src_text.sendKeys(searchValue);
    }

    @Step("Выбираем первую статью в списке")
    public void selectFirstItem() {
        elementsCollection.first().click();
    }

    @Step("Проверить, что отображается сообщение об ошибке")
    public void checkErrorMessageIsVisible() {
        view_wiki_error_text.shouldBe(Condition.visible);
    }

    @Step("Проверить, что полученный список больше чем 0")
    public void checkListIsNotEmpty() {
        elementsCollection.shouldHave(sizeGreaterThan(0));
    }
}
