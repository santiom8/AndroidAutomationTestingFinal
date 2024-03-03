package org.example.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.utils.screens.BaseScreen;
import org.openqa.selenium.support.PageFactory;

public class SigningScreen extends BaseScreen {
    private static final String SIGNIN_TITLE = "Sign in";


    public SigningScreen(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public HomeScreen callTheHomeScreen() {
        return new HomeScreen(driver);
    }

    public void waitSomeSeconds(int time) {
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
