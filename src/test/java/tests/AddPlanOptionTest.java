package tests;

import org.springframework.context.annotation.Description;
import org.testng.annotations.Test;
import screens.AddPlansScreen;
import screens.CategoryList;
import screens.DashBoardScreen;
import util.tests.BaseMobileTest;

public class AddPlanOptionTest extends BaseMobileTest {

    @Description(value = "Add Plan Option ID:0004")
    @Test()
    public void failedLoginTest() throws InterruptedException {
        log.info("Starting Add Plan Option");
        DashBoardScreen dashBoard = dismissTutorial();
        dashBoard.clickOnAddPlans();
        AddPlansScreen addPlansScreen = new AddPlansScreen(driver);
        addPlansScreen.isReserveDiningOptionAvailable();
        log.info("Test Finished!!!");

    }


}
