package org.example.screens;

import io.appium.java_client.android.AndroidDriver;
import org.example.utils.screens.BaseScreen;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeScreen extends BaseScreen {
    @FindBy(xpath = "//android.widget.TextView[@text=\"\uDB81\uDD9F\"]")
    public WebElement worldButton;
    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }

    public void clickWorldButton() {
        worldButton.click();
    }
}
