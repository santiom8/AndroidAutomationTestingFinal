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

public class SuccessfulSignUpTest extends BaseTest {

      /* @BeforeClass
    public void setUpClass() {
        SigningScreen signingScreen = openSigningScreen();
        HomeScreen homeScreen = signingScreen.callTheHomeScreen();
        wait.until(ExpectedConditions.visibilityOf(homeScreen.getTitle()));
        homeScreen.clickMenuItem(MenuEnums.LOGIN);
    }*/


    @Test(dataProvider = "login-and-password-random", dataProviderClass = DataProviderLogin.class, description = "Test to verify the successful sign up.")
    public void testSuccessfulSignUp(String email, String password) {
        //Home screen
        SigningScreen signingScreen = openSigningScreen();
        HomeScreen homeScreen = signingScreen.callTheHomeScreen();
        wait.until(ExpectedConditions.visibilityOf(homeScreen.getTitle()));

        //Login screen
        homeScreen.clickMenuItem(MenuEnums.LOGIN);
        LoginScreen loginScreen = homeScreen.callLoginScreen();
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getTitle()));
        loginScreen.getHeaderLoginUpButton().click();
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getLoginRegisterButton()));
        loginScreen.fillFormSignUp(email, password, password);
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getMessageLoginMessageSuccessFromPopUp()));
        Assert.assertEquals(loginScreen.getMessageLoginMessageSuccessFromPopUp().getText(), "You successfully signed up!");
        loginScreen.closeSignUpPopUpButtonClickOnOk.click();
    }
}

