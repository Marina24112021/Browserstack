package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ProfilePage;

public class WikiSearchTests extends TestBase {
    ProfilePage obj = new ProfilePage();

    @Test
    void defaultDriverSuccessfulSearchTest() {
        obj.setSearchValue("Appium");
        obj.checkListIsNotEmpty();
    }

    @Test
    void negativeSearchTestForDetailPage() {
        obj.setSearchValue("Uzbekistan");
        obj.selectFirstItem();
        obj.checkErrorMessageIsVisible();
    }
}