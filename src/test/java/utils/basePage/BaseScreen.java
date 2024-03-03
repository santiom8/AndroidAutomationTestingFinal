package utils.basePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.enums.MenuEnums;
import org.example.screens.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BaseScreen {

    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.View\").description(\"Home\")")
    private WebElement homeButton;

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

    protected AndroidDriver driver;

    public BaseScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickMenuItem(String menuDescription) {
        WebElement menuItem = null;
        switch (menuDescription) {
            case MenuEnums.HOME:
                menuItem = homeButton;
                break;
            case MenuEnums.WEBVIEW:
                menuItem = webViewButton;
                break;
            case MenuEnums.LOGIN:
                menuItem = loginButton;
                break;
            case MenuEnums.FORMS:
                menuItem = formsButton;
                break;
            case MenuEnums.SWIPE:
                menuItem = swipeButton;
                break;
            case MenuEnums.DRAG:
                menuItem = dragButton;
                break;
        }
        menuItem.click();
    }

    //pass between screen
    public DragScreen callDragScreen(){
        return new DragScreen(driver);
    }

    public FormsScreen callHomeScreen(){
        return new FormsScreen(driver);
    }

    public LoginScreen callLoginScreen(){
        return new LoginScreen(driver);
    }

    public SwipeScreen callSwipeScreen(){
        return new SwipeScreen(driver);
    }

    public FormsScreen callFormScreen(){
        return new FormsScreen(driver);
    }

    public WebViewScreen callWebViewScreen(){
        return new WebViewScreen(driver);
    }


}
