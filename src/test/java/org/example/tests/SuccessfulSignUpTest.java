package org.example.tests;

import org.example.data.DataProviderLogin;
import org.example.enums.MenuEnums;
import org.example.screens.HomeScreen;
import org.example.screens.LoginScreen;
import org.example.screens.SigningScreen;
import utils.baseTest.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class SuccessfulSignUpTest extends BaseTest {

      /* @BeforeClass
    public void setUpClass() {
        SigningScreen signingScreen = openSigningScreen();
        HomeScreen homeScreen = signingScreen.callTheHomeScreen();
        wait.until(ExpectedConditions.visibilityOf(homeScreen.getTitle()));
        homeScreen.clickMenuItem(MenuEnums.LOGIN);
    }*/

    private static int testIterationCount = 0;

    @Test(
            dataProvider = "login-and-password-random",
            dataProviderClass = DataProviderLogin.class,
            description = "Test to verify the successful sign up.",
            invocationCount = 3
    )
    public void testSuccessfulSignUp(String email, String password) {
        testIterationCount++;
        logger.info("Starting test iteration: " + testIterationCount + " to verify the successful sign up..........");
        //Home screen
        SigningScreen signingScreen = openSigningScreen();
        HomeScreen homeScreen = signingScreen.callTheHomeScreen();
        wait.until(ExpectedConditions.visibilityOf(homeScreen.getTitle()));
        logger.info("Home screen is displayed.");

        //Login screen
        homeScreen.clickMenuItem(MenuEnums.LOGIN);
        LoginScreen loginScreen = homeScreen.callLoginScreen();
        logger.info("Login screen is displayed.");
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getTitle()));
        loginScreen.getHeaderLoginUpButton().click();
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getLoginRegisterButton()));
        logger.info("Sign up option is displayed.");
        loginScreen.fillFormSignUp(email, password, password);
        logger.info("Clicking on the SIGN UP button.");
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getMessageLoginMessageSuccessFromPopUp()));
        Assert.assertEquals(loginScreen.getMessageLoginMessageSuccessFromPopUp().getText(), "You successfully signed up!");
        loginScreen.closeSignUpPopUpButtonClickOnOk.click();
        Logger.getGlobal().info("Sign up was successful.");
        logger.info("Sign up was successful in test iteration: " + testIterationCount);
    }
}

