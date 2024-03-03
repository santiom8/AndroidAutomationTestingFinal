package org.example.utils.tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.example.utils.screens.BaseScreen;
import org.openqa.selenium.WebElement;

public class SwipeScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "UiSelector().textContains(\"Swipe horizontal\")")
    public WebElement title;

    public SwipeScreen(AndroidDriver driver) {
        super(driver);
    }

    public WebElement getTitle() {
        return title;
    }
}
