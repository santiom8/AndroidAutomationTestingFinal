package org.example.tests;

import org.example.data.DataProviderLogin;
import org.example.enums.MenuEnums;
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
        //Home screen
        SigningScreen signingScreen = openSigningScreen();
        HomeScreen homeScreen = signingScreen.callTheHomeScreen();
        wait.until(ExpectedConditions.visibilityOf(homeScreen.getTitle()));
        Assert.assertTrue(verifyElementIsDisplayed(homeScreen.getTitle()));

        //Login screen
        homeScreen.clickMenuItem(MenuEnums.LOGIN);
        LoginScreen loginScreen = homeScreen.callLoginScreen();
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getTitle()));

        //Sign up option
        loginScreen.getHeaderLoginUpButton().click();
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getLoginRegisterButton()));
        loginScreen.fillFormSignUp(email, password, password);
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getMessageLoginMessageSuccessFromPopUp()));
        Assert.assertEquals(loginScreen.getMessageLoginMessageSuccessFromPopUp().getText(), "You successfully signed up!");
        clickElement(loginScreen.closeSignUpPopUpButtonClickOnOk);

        //Login option
        clickElement(loginScreen.getHeaderLoginInButton());
        loginScreen.fillFormLogin(email, password);
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getMessageLoginMessageSuccessFromPopUp()));
        Assert.assertEquals(loginScreen.getMessageLoginMessageSuccessFromPopUp().getText(), "You are logged in!");
        clickElement(loginScreen.closeLoginPopUpButtonClickOnOk);

    }
}
