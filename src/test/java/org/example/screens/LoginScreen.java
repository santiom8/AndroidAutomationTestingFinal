package org.example.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.basePage.BaseScreen;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "UiSelector().textContains(\"Login / Sign up Form\")")
    public WebElement title;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Sign up\")")
    public WebElement HeaderLoginUpButton;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Login\")")
    public WebElement HeaderLoginInButton;

    //Sign up form
    @AndroidFindBy(accessibility = "input-email")
    public WebElement emailField;

    @AndroidFindBy(accessibility = "input-password")
    public WebElement passwordField;

    @AndroidFindBy(accessibility = "input-repeat-password")
    public WebElement repeatPasswordField;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"SIGN UP\")")
    public WebElement loginRegisterButton;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"LOGIN\")")
    public WebElement loginButton;

    @AndroidFindBy(uiAutomator = "UiSelector().resourceId(\"android:id/message\")")
    public WebElement messageLoginMessageSuccessFromPopUp;

    @AndroidFindBy(uiAutomator = "UiSelector().resourceId(\"android:id/contentPanel\")")
    public WebElement messageLoginMessageErrorFromPopUp;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement closeSignUpPopUpButtonClickOnOk;

    @AndroidFindBy(id = "android:id/contentPanel")
    public WebElement closeLoginPopUpButtonClickOnOk;


    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }

    public WebElement getTitle() {
        return title;
    }

    public WebElement getHeaderLoginUpButton() {
        return HeaderLoginUpButton;
    }

    public WebElement getHeaderLoginInButton() {
        return HeaderLoginInButton;
    }

    public WebElement getLoginRegisterButton() {
        return loginRegisterButton;
    }

    public void fillFormSignUp(String email, String password, String repeatPassword) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        repeatPasswordField.sendKeys(repeatPassword);
        loginRegisterButton.click();
    }

    public void fillFormLogin(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public WebElement getMessageLoginMessageSuccessFromPopUp() {
        return messageLoginMessageSuccessFromPopUp;
    }

    public void closePopUpButtonClickOnOk() {
        closeSignUpPopUpButtonClickOnOk.click();
    }
}
