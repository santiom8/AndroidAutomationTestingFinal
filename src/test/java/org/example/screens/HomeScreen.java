package org.example.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.basePage.BaseScreen;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BaseScreen {
    @AndroidFindBy(uiAutomator = "UiSelector().textContains(\"WEBDRIVER\")")
    public WebElement title;

    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }

    public WebElement getTitle() {
        return title;
    }
}
