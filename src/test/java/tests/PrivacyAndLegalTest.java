package tests;

import org.springframework.context.annotation.Description;
import org.testng.annotations.Test;
import screens.CategoryList;
import screens.DashBoardScreen;
import screens.MenuScreen;
import util.tests.BaseMobileTest;

public class PrivacyAndLegalTest extends BaseMobileTest {

    @Description(value = "Privacy And Legal ID:0003")
    @Test()
    public void failedLoginTest() throws InterruptedException {
        log.info("Starting Privacy And Legal Test");
        DashBoardScreen dashBoard = dismissTutorial();
        dashBoard.clickOnMenu();
        MenuScreen menuScreen = new MenuScreen(driver);
        menuScreen.scrollToPrivacyAndLegal();
        menuScreen.tapOnPrivacyAndLegal();
        menuScreen.isPrivacyPolicyAvailable();
        log.info("Test Finished!!!");
    }

}
