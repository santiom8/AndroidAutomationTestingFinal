package org.example.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.basePage.BaseScreen;
import org.openqa.selenium.WebElement;

public class SwipeScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "UiSelector().textContains(\"Swipe horizontal\")")
    public WebElement title;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text( \"FULLY OPEN SOURCE\")")
    public WebElement swipeHorizontalZero;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"GREAT COMMUNITY\")")
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
