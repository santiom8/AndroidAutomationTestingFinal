package org.example.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.example.utils.screens.BaseScreen;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "UiSelector().textContains(\"Login / Sign up Form\")")
    public WebElement title;

    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }

    public WebElement getTitle() {
        return title;
    }
}
