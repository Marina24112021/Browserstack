package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.DetailItemScreen;
import screens.MainScreen;
import screens.PreviewArticleScreen;
import screens.SearchResultListScreen;
import screens.components.SearchInputComponent;

import static com.codeborne.selenide.Selenide.back;

@Tag("emulation")
public class EmulationTests extends TestBase {
    SearchInputComponent searchInputComponent = new SearchInputComponent();
    SearchResultListScreen searchResultListScreen = new SearchResultListScreen();
    MainScreen mainScreen = new MainScreen();
    DetailItemScreen detailItemScreen = new DetailItemScreen();
    PreviewArticleScreen previewArticleScreen = new PreviewArticleScreen();

    @Test
    void positiveLinkOnDetailPageTest() {
        back();
        mainScreen.checkStaticText();
        searchInputComponent.setSearchValue("Algebra");
        searchResultListScreen.selectFirstItem();
        detailItemScreen.clickOnLink("mathematics");
        previewArticleScreen.checkTitleLink("Mathematics");
    }
}
