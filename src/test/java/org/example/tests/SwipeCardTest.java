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
        logger.info("Starting the test to verify the swipe card..........");
        SigningScreen signingScreen = openSigningScreen();
        HomeScreen homeScreen = signingScreen.callTheHomeScreen();
        wait.until(ExpectedConditions.visibilityOf(homeScreen.getTitle()));
        logger.info("Home screen is displayed.");

        //Swipe card
        homeScreen.clickMenuItem(MenuEnums.SWIPE);
        SwipeScreen swipeScreen = homeScreen.callSwipeScreen();
        Assert.assertTrue(verifyElementIsDisplayed(swipeScreen.getTitle()));
        logger.info("Swipe screen is displayed.");
        Assert.assertTrue(verifyElementIsDisplayed(swipeScreen.getSwipeHorizontalZero()));
        logger.info("First swipe card is displayed.");
        swipeScreen.swipeHorizontal(swipeScreen.getSwipeHorizontalZero(), SwipeDirection.LEFT.getValue());
        logger.info("Swipe left.");
        Assert.assertTrue(verifyElementIsNotDisplayed(swipeScreen.getSwipeHorizontalZero()));
        logger.info("First swipe card is not displayed.");
        Assert.assertTrue(verifyElementIsDisplayed(swipeScreen.getSwipeHorizontalOne()));
        logger.info("Second swipe card is displayed.");
        swipeScreen.swipeHorizontal(swipeScreen.getSwipeHorizontalOne(), SwipeDirection.RIGHT.getValue());
        logger.info("Swipe right.");

    }
}
