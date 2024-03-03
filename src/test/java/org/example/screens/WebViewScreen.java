package org.example.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.basePage.BaseScreen;
import org.openqa.selenium.WebElement;

public class WebViewScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "UiSelector().textContains(\"Next-gen browser and mobile automation test framework for Node.js\")")
    public WebElement title;

    public WebViewScreen(AndroidDriver driver) {
        super(driver);
    }

    public WebElement getTitle() {
        return title;
    }
}
