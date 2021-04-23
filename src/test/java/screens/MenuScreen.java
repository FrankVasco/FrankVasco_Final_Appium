package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

public class MenuScreen extends BaseScreen {


    /**
     * Constructor method for standard screens object.
     *
     * @param driver
     * @author Arley.Bolivar, Hans.Marquez
     */
    public MenuScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }


    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"Privacy & Legal button\"]/android.widget.TextView[2]")
    private AndroidElement privacyAndLegal;


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").textContains(\"Privacy Policy\")")
    private AndroidElement privacyPolicyOption;


    public void scrollToPrivacyAndLegal(){
        scrollDown(5);
    }


    public void tapOnPrivacyAndLegal(){
        click(privacyAndLegal);
    }

    public void isPrivacyPolicyAvailable(){
        isElementAvailable(privacyPolicyOption);
    }

    @Override
    public void alertControl() {

    }
}
