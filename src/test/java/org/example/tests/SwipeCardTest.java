package org.example.tests;

import org.example.enums.MenuEnums;
import org.example.enums.SwipeDirection;
import org.example.screens.HomeScreen;
import org.example.screens.SigningScreen;
import org.example.screens.SwipeScreen;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.baseTest.BaseTest;

public class SwipeCardTest extends BaseTest {

    @Test(description = "Swipe card test")
    public void swipeCardTest() {
        SigningScreen signingScreen = openSigningScreen();
        HomeScreen homeScreen = signingScreen.callTheHomeScreen();
        wait.until(ExpectedConditions.visibilityOf(homeScreen.getTitle()));

        //Swipe card
        homeScreen.clickMenuItem(MenuEnums.SWIPE);
        SwipeScreen swipeScreen = homeScreen.callSwipeScreen();
        Assert.assertTrue(verifyElementIsDisplayed(swipeScreen.getTitle()));
        Assert.assertTrue(verifyElementIsDisplayed(swipeScreen.getSwipeHorizontalZero()));
        swipeScreen.swipeHorizontal(swipeScreen.getSwipeHorizontalZero(), SwipeDirection.LEFT.getValue());
        Assert.assertTrue(verifyElementIsNotDisplayed(swipeScreen.getSwipeHorizontalZero()));
        Assert.assertTrue(verifyElementIsDisplayed(swipeScreen.getSwipeHorizontalOne()));
        swipeScreen.swipeHorizontal(swipeScreen.getSwipeHorizontalOne(), SwipeDirection.RIGHT.getValue());
        Assert.assertTrue(verifyElementIsNotDisplayed(swipeScreen.getSwipeHorizontalOne()));
    }
}
