package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import util.screens.BaseScreen;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

public class CategoryList extends BaseScreen {


    /**
     * Constructor method for standard screens object.
     *
     * @param driver
     * @author Arley.Bolivar, Hans.Marquez
     */
    public CategoryList(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }


    @AndroidFindBy(id = "com.disney.wdpro.dlr:id/categoryTitle")
    private AndroidElement clickOnAtractionsList;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Hotels, Category, 11of12, button\"]")
    private AndroidElement optionHotel;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Hotels, Category, Collapsed, 11of12, button\"]/android.widget.TextView")
    private AndroidElement optionHotelSelected;

    public void tapOnAttractionsList(){
        click(clickOnAtractionsList);
    }

    public void tapOptionHotel(){
        click(optionHotel);
    }

    public void isHotelOptionAvailable(){
        isElementAvailable(optionHotelSelected);
    }

    @Override
    public void alertControl() {

    }
}
