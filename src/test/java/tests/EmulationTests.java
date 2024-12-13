package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.*;
import screens.components.ButtonContinueComponent;
import screens.components.SearchInputComponent;

import static com.codeborne.selenide.Selenide.back;

@Tag("emulation")
public class EmulationTests extends TestBase {
    SearchInputComponent searchInputComponent = new SearchInputComponent();
    SearchResultListScreen searchResultListScreen = new SearchResultListScreen();
    MainScreen mainScreen = new MainScreen();
    DetailItemScreen detailItemScreen = new DetailItemScreen();
    PreviewArticleScreen previewArticleScreen = new PreviewArticleScreen();
    LanguageScreen languageScreen = new LanguageScreen();
    ButtonContinueComponent continueComponent = new ButtonContinueComponent();
    NewWaysToExploreScreen exploreScreen = new NewWaysToExploreScreen();
    ReadingListsWithSyncScreen readingListsWithSyncScreen = new ReadingListsWithSyncScreen();
    DataAndPrivacyScreen dataAndPrivacyScreen = new DataAndPrivacyScreen();

    @Test
    void negativeTitleOfBottomsheetAfterClickOnLinkOfDetailPageTest() {
        back();
        mainScreen.checkStaticTextIsIncorrect();
        searchInputComponent.setSearchValue("Algebra");
        searchResultListScreen.selectFirstItem();
        detailItemScreen.clickOnLink("mathematics");
        previewArticleScreen.checkTitleOfLinkIsIncorrect("mathematics");
    }

    @Test
    void positiveCheckOnboardingScreensTest() {
        languageScreen.checkTextOnLanguage();
        continueComponent.clickOnContinueButton();
        exploreScreen.checkTextOnNewWaysToExplore();
        continueComponent.clickOnContinueButton();
        readingListsWithSyncScreen.checkTextOnReadingListsWithSync();
        continueComponent.clickOnContinueButton();
        dataAndPrivacyScreen.checkTextOnDataAndPrivacy();
    }
}
