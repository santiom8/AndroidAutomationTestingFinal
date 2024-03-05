package org.example.tests;

import org.example.enums.MenuEnums;
import org.example.screens.*;
import utils.baseTest.BaseTest;
import org.example.screens.SwipeScreen;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationMenuBarTest extends BaseTest {

    @Test(description = "Test to verify the navigation bar.")
    public void tryTermsOfUse() {
        logger.info("Starting the test to verify the navigation bar..........");
        //Home screen
        SigningScreen signingScreen = openSigningScreen();
        HomeScreen homeScreen = signingScreen.callTheHomeScreen();
        wait.until(ExpectedConditions.visibilityOf(homeScreen.getTitle()));
        Assert.assertTrue(verifyElementIsDisplayed(homeScreen.getTitle()));
        logger.info("Home screen is displayed.");
        homeScreen.clickMenuItem(MenuEnums.WEBVIEW);

        //Webview screen
        WebViewScreen webViewScreen = homeScreen.callWebViewScreen();
        Assert.assertTrue(verifyElementIsDisplayed(webViewScreen.getTitle()));
        logger.info("Webview screen is displayed.");
        webViewScreen.clickMenuItem(MenuEnums.LOGIN);

        //Login screen
        LoginScreen loginScreen = homeScreen.callLoginScreen();
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getTitle()));
        logger.info("Login screen is displayed.");
        homeScreen.clickMenuItem(MenuEnums.FORMS);

        //Forms screen
        FormsScreen formsScreen = homeScreen.callFormScreen();
        Assert.assertTrue(verifyElementIsDisplayed(formsScreen.getTitle()));
        logger.info("Forms screen is displayed.");
        homeScreen.clickMenuItem(MenuEnums.SWIPE);

        //Swipe screen
        SwipeScreen swipeScreen = homeScreen.callSwipeScreen();
        Assert.assertTrue(verifyElementIsDisplayed(swipeScreen.getTitle()));
        logger.info("Swipe screen is displayed.");
        homeScreen.clickMenuItem(MenuEnums.DRAG);

        //Drag screen
        DragScreen dragScreen = homeScreen.callDragScreen();
        Assert.assertTrue(verifyElementIsDisplayed(dragScreen.getTitle()));
        logger.info("Drag screen is displayed.");

    }

}
