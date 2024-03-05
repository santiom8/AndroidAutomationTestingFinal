package org.example.tests;

import org.example.data.DataProviderLogin;
import org.example.enums.MenuEnums;
import org.example.enums.ScreenTitleEnums;
import org.example.screens.HomeScreen;
import org.example.screens.LoginScreen;
import org.example.screens.SigningScreen;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.baseTest.BaseTest;

public class SuccessfulLoginTest extends BaseTest {

    @Test(dataProvider = "login-and-password-random", dataProviderClass = DataProviderLogin.class)
    public void testLogin(String email, String password) {
        logger.info("Starting the test to verify the successful login..........");
        //Home screen
        SigningScreen signingScreen = openSigningScreen();
        HomeScreen homeScreen = signingScreen.callTheHomeScreen();
        wait.until(ExpectedConditions.visibilityOf(homeScreen.getTitle()));
        Assert.assertTrue(verifyElementIsDisplayed(homeScreen.getTitle()));
        logger.info("Home screen is displayed.");

        //Login screen
        homeScreen.clickMenuItem(MenuEnums.LOGIN);
        LoginScreen loginScreen = homeScreen.callLoginScreen();
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getTitle()));
        logger.info("Login screen is displayed.");

        //Sign up option
        loginScreen.getHeaderLoginUpButton().click();
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getLoginRegisterButton()));
        logger.info("Sign up option is displayed.");
        loginScreen.fillFormSignUp(email, password, password);
        logger.info("Clicking on the SIGN UP button.");
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getMessageLoginMessageSuccessFromPopUp()));
        Assert.assertEquals(loginScreen.getMessageLoginMessageSuccessFromPopUp().getText(), ScreenTitleEnums.SIGN_UP_SUCCESS);
        logger.info("Sign up was successful.");
        clickElement(loginScreen.closeSignUpPopUpButtonClickOnOk);

        //Login option
        clickElement(loginScreen.getHeaderLoginInButton());
        logger.info("Login option is displayed.");
        loginScreen.fillFormLogin(email, password);
        logger.info("Clicking on the LOGIN button.");
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getMessageLoginMessageSuccessFromPopUp()));
        logger.info("Login was successful.");
        Assert.assertEquals(loginScreen.getMessageLoginMessageSuccessFromPopUp().getText(), ScreenTitleEnums.LOGIN_SUCCESS);
        logger.info("Login was successful.");
        clickElement(loginScreen.closeLoginPopUpButtonClickOnOk);
        //TODO: Add assertion for the successful login

    }
}
