package org.example.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.utils.screens.BaseScreen;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.utils.tests.BaseTest.wait;

public class SigningScreen extends BaseScreen {
    private static final String SIGNIN_TITLE = "Sign in";

    /*    @AndroidFindBy()
        public WebElement worldButton;*/
    @AndroidFindBy(uiAutomator = "UiSelector().textContains(\"WEBDRIVER\")")
    private WebElement textMain;

    private WebElement termsButton;

    public SigningScreen(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean verifySigninTitle() {
        return textMain.isDisplayed();
    }

    public void waitSomeSeconds(int time) {
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
