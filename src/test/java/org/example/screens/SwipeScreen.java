package org.example.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.basePage.BaseScreen;
import org.openqa.selenium.WebElement;

public class SwipeScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "UiSelector().textContains(\"Swipe horizontal\")")
    public WebElement title;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").textContains(\"WebdriverIO is fully open source and can be found on GitHub\")")
    public WebElement swipeHorizontalZero;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").textContains(\"WebdriverIO has a great community that supports all members.\")")
    public WebElement swipeHorizontalOne;

    public SwipeScreen(AndroidDriver driver) {
        super(driver);
    }

    public WebElement getTitle() {
        return title;
    }

    public WebElement getSwipeHorizontalZero() {
        return swipeHorizontalZero;
    }

    public WebElement getSwipeHorizontalOne() {
        return swipeHorizontalOne;
    }
}
