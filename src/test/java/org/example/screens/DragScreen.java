package org.example.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.basePage.BaseScreen;
import org.openqa.selenium.WebElement;

public class DragScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "UiSelector().textContains(\"Drag and Drop\")")
    public WebElement title;

    public DragScreen(AndroidDriver driver) {
        super(driver);
    }

    public  WebElement getTitle() {
        return title;
    }
}
