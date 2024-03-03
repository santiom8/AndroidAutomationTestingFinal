package org.example.utils.tests;

import org.example.data.DataProviderLogin;
import org.example.enums.MenuEnums;
import org.example.screens.HomeScreen;
import org.example.screens.LoginScreen;
import org.example.screens.SigningScreen;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessfulSignUpTest extends BaseTest {

    /*   @BeforeTest
       public void setUp() {
           SigningScreen signingScreen = openSigningScreen();
           HomeScreen homeScreen = new HomeScreen(driver);
           signingScreen.waitSomeSeconds(20);
   *//*        wait.until(ExpectedConditions.visibilityOf(homeScreen.getTitle()));*//*
        signingScreen.clickMenuItem(MenuEnums.LOGIN);
    }
*/
    @Test(dataProvider = "login-and-password-random", dataProviderClass = DataProviderLogin.class, description = "Test to verify the successful sign up.")
    public void testSuccessfulSignUp(String email, String password) {
        //Define before the test
        SigningScreen signingScreen = openSigningScreen();
        HomeScreen homeScreen = signingScreen.callTheHomeScreen();
        wait.until(ExpectedConditions.visibilityOf(homeScreen.getTitle()));
        homeScreen.clickMenuItem(MenuEnums.LOGIN);

        LoginScreen loginScreen = new LoginScreen(driver);
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getTitle()));
        loginScreen.getLoginUpButton().click();
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getLoginRegisterButton()));
        loginScreen.fillFormSignUp("test@gmail.com", "12345678", "12345678");
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getMessageLoginMessageSuccessFromPopUp()));
        Assert.assertEquals(loginScreen.getMessageLoginMessageSuccessFromPopUp().getText(), "You successfully signed up!");
        loginScreen.closePopUpButtonClickOnOk.click();

 /*       Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getTitle()));
        loginScreen.getLoginUpButton().click();
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getLoginRegisterButton()));
        loginScreen.fillFormSignUp("esto@gmail.com", "wrfesrf2", "wrfesrf2");
        Assert.assertTrue(verifyElementIsDisplayed(loginScreen.getMessageLoginMessageSuccessFromPopUp()));
        Assert.assertEquals(loginScreen.getMessageLoginMessageSuccessFromPopUp().getText(), "You successfully signed up!");
        loginScreen.closePopUpButtonClickOnOk.click();*/
    }
}

