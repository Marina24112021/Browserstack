package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.DetailErrorScreen;
import screens.SearchResultListScreen;
import screens.components.SearchInputComponent;

@Tag("browserstack")
public class WikiSearchBrowserStackTests extends TestBase {

    SearchInputComponent searchInputComponent = new SearchInputComponent();
    SearchResultListScreen searchResultListScreen = new SearchResultListScreen();
    DetailErrorScreen detailErrorScreen = new DetailErrorScreen();

    @Test
    void defaultDriverSuccessfulSearchTest() {
        searchInputComponent.setSearchValue("Appium");
        searchResultListScreen.checkListIsNotEmpty();
    }

    @Test
    void negativeSearchTestForDetailPageTest() {
        searchInputComponent.setSearchValue("Uzbekistan");
        searchResultListScreen.selectFirstItem();
        detailErrorScreen.checkErrorMessageIsVisible();
    }


}