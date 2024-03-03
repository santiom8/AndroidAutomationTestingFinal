package org.example.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.example.utils.screens.BaseScreen;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "UiSelector().textContains(\"Login / Sign up Form\")")
    public WebElement title;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"Sign up\")")
    public WebElement loginUpButton;

    @AndroidFindBy(accessibility = "input-email")
    public WebElement emailField;

    @AndroidFindBy(accessibility = "input-password")
    public WebElement passwordField;

    @AndroidFindBy(accessibility = "input-repeat-password")
    public WebElement repeatPasswordField;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.TextView\").text(\"SIGN UP\")")
    public WebElement loginRegisterButton;
    @AndroidFindBy(uiAutomator = "UiSelector().resourceId(\"android:id/message\")")
    public WebElement messageLoginMessageSuccessFromPopUp;

    //android:id/button1
    @AndroidFindBy(id = "android:id/button1")
    public WebElement closePopUpButtonClickOnOk;

    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }

    public WebElement getTitle() {
        return title;
    }

    public WebElement getLoginUpButton() {
        return loginUpButton;
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

    public WebElement getMessageLoginMessageSuccessFromPopUp() {
        return messageLoginMessageSuccessFromPopUp;
    }

    public void closePopUpButtonClickOnOk() {
        closePopUpButtonClickOnOk.click();
    }
}
