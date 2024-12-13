package screens;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;

public class SearchResultListScreen {
    ElementsCollection elementsCollection = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    @Step("Выбираем первую статью в списке")
    public void selectFirstItem() {
        elementsCollection.first().click();
    }

    @Step("Проверить, что полученный список больше чем 0")
    public void checkListIsNotEmpty() {
        elementsCollection.shouldHave(sizeGreaterThan(0));
    }
}
