package tests;

import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.CategoryList;
import screens.DashBoardScreen;
import screens.LoginScreen;
import util.tests.BaseMobileTest;

public class CategoryListTest extends BaseMobileTest {

    @Description(value = "Category List Test ID:0002")
    @Test()
    public void failedLoginTest() throws InterruptedException {
        log.info("Starting Category List Test");
        DashBoardScreen dashBoard = dismissTutorial();
        dashBoard.clickOnMap();
        CategoryList categoryList = new CategoryList(driver);
        categoryList.tapOnAttractionsList();
        categoryList.tapOptionHotel();
        categoryList.isHotelOptionAvailable();
        log.info("Test Finished!");
    }
}
