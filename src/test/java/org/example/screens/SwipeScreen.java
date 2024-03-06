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

    //JS.FOUNDATION
    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"JS.FOUNDATION\")")
    public WebElement swipeHorizontalTwo;

    //SUPPORT VIDEOS
    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"SUPPORT VIDEOS\")")
    public WebElement swipeHorizontalThree;

    //EXTENDABLE
    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"EXTENDABLE\")")
    public WebElement swipeHorizontalFour;

    //COMPATIBLE
    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"COMPATIBLE\")")
    public WebElement swipeHorizontalFive;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Swipe horizontal\")")
    public WebElement titleSwipeScreen;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"You found me!!!\")")
    public WebElement theLastElementVerticalSwipe;

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

    public WebElement getSwipeHorizontalTwo() {
        return swipeHorizontalTwo;
    }

    public WebElement getSwipeHorizontalThree() {
        return swipeHorizontalThree;
    }

    public WebElement getSwipeHorizontalFour() {
        return swipeHorizontalFour;
    }

    public WebElement getSwipeHorizontalFive() {
        return swipeHorizontalFive;
    }

    public WebElement getTitleSwipeScreen() {
        return titleSwipeScreen;
    }

    public WebElement getTheLastElementVerticalSwipe() {
        return theLastElementVerticalSwipe;
    }

}
