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
        logger.info("First swipe card is displayed FULLY OPEN SOURCE");
        swipeScreen.swipeHorizontal(swipeScreen.getSwipeHorizontalZero(), SwipeDirection.LEFT.getValue());
        logger.info("Swipe right to the first card GREAT COMMUNITY");
        swipeScreen.swipeHorizontal(swipeScreen.getSwipeHorizontalOne(), SwipeDirection.LEFT.getValue());
        logger.info("Swipe right to the second card JS.FOUNDATION");
        swipeScreen.swipeHorizontal(swipeScreen.getSwipeHorizontalTwo(), SwipeDirection.LEFT.getValue());
        logger.info("Swipe left to the third card SUPPORT VIDEOS");
        swipeScreen.swipeHorizontal(swipeScreen.getSwipeHorizontalThree(), SwipeDirection.LEFT.getValue());
        logger.info("Swipe left to the fourth card EXTENDABLE");
        swipeScreen.swipeHorizontal(swipeScreen.getSwipeHorizontalFour(), SwipeDirection.LEFT.getValue());
        logger.info("Swipe left to the fifth card COMPATIBLE");
        Assert.assertTrue(verifyElementIsDisplayed(swipeScreen.getSwipeHorizontalFive()));
        logger.info("Fifth swipe card is displayed.");
        Assert.assertTrue(verifyElementIsNotDisplayed(swipeScreen.getSwipeHorizontalFour()));
        logger.info("Fourth swipe card is not displayed.");
        logger.info("COMPATIBLE card is displayed and the test is completed.");
        swipeScreen.swipeVerticalUp(swipeScreen.titleSwipeScreen);
        Assert.assertTrue(verifyElementIsDisplayed(swipeScreen.theLastElementVerticalSwipe));
        logger.info("The element is displayed after vertical swipe.");


    }
}
