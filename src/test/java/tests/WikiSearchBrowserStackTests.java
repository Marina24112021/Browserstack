package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.DetailErrorScreen;
import screens.SearchResultListScreen;
import screens.components.SearchInputComponent;

@Tag("browserstack")
public class WikiSearchBrowserStackTests extends TestBase {

    final SearchInputComponent searchInputComponent = new SearchInputComponent();
    final SearchResultListScreen searchResultListScreen = new SearchResultListScreen();
    final DetailErrorScreen detailErrorScreen = new DetailErrorScreen();

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