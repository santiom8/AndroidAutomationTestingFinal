package org.example.utils.tests;

import org.example.enums.MenuEnums;
import org.example.screens.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationMenuBarTest extends BaseTest {

    @Test
    public void tryTermsOfUse() {
        //Home screen
        SigningScreen signingScreen = openSigningScreen();
        signingScreen.waitSomeSeconds(20);
        HomeScreen homeScreen = signingScreen.callTheHomeScreen();
        Assert.assertTrue(verifyElementIsDisplayed(homeScreen.getTitle()));
        homeScreen.clickMenuItem(MenuEnums.WEBVIEW);

        //Webview screen
        WebViewScreen webViewScreen = new WebViewScreen(driver);
        Assert.assertTrue(verifyElementIsDisplayed(webViewScreen.getTitle()));
        webViewScreen.clickMenuItem(MenuEnums.LOGIN);

        //Login screen
        LoginScreen loginScreen = new LoginScreen(driver);
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getTitle()));
        homeScreen.clickMenuItem(MenuEnums.FORMS);

        //Forms screen
        FormsScreen formsScreen = new FormsScreen(driver);
        Assert.assertTrue(verifyElementIsDisplayed(formsScreen.getTitle()));
        homeScreen.clickMenuItem(MenuEnums.SWIPE);

        //Swipe screen
        SwipeScreen swipeScreen = new SwipeScreen(driver);
        Assert.assertTrue(verifyElementIsDisplayed(swipeScreen.getTitle()));
        homeScreen.clickMenuItem(MenuEnums.DRAG);

        //Drag screen
        DragScreen dragScreen = new DragScreen(driver);
        Assert.assertTrue(verifyElementIsDisplayed(dragScreen.getTitle()));

    }

}
