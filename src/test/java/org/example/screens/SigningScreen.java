package org.example.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.utils.screens.BaseScreen;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SigningScreen extends BaseScreen {
    private static final String SIGNIN_TITLE = "Sign in";

    @AndroidFindBy(uiAutomator = "UiSelector().textContains(\"WEBDRIVER\")")
    private WebElement textMain;
    /*UiSelector().className("android.view.View").description("Webview")*/
    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.View\").description(\"Webview\")")
    private WebElement webViewButton;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.View\").description(\"Login\")")
    private WebElement loginButton;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.View\").description(\"Forms\")")
    private WebElement formsButton;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.View\").description(\"Swipe\")")
    private WebElement swipeButton;

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.View\").description(\"Drag\")")
    private WebElement dragButton;

    public SigningScreen(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean verifySigningTitle() {
        return textMain.isDisplayed();
    }

    public boolean  verifyWebButton() {
        return webViewButton.isDisplayed();
    }

   /* public void clickWebViewButton() {
        webViewButton.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickFormsButton() {
        formsButton.click();
    }

    public void clickSwipeButton() {
        swipeButton.click();
    }

    public void clickDragButton() {
        dragButton.click();
    }*/

    public void waitSomeSeconds(int time) {
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
