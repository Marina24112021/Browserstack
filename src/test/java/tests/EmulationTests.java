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
    final SearchInputComponent searchInputComponent = new SearchInputComponent();
    final SearchResultListScreen searchResultListScreen = new SearchResultListScreen();
    final MainScreen mainScreen = new MainScreen();
    final DetailItemScreen detailItemScreen = new DetailItemScreen();
    final PreviewArticleScreen previewArticleScreen = new PreviewArticleScreen();

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
