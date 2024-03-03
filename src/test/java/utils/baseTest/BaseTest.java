package utils.baseTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.example.screens.SigningScreen;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    private static final String PROPERTY_FILE = "src/test/resources/config.properties";
    private static Properties properties = new Properties();

    public static AndroidDriver driver;

    public static WebDriverWait wait;

    @BeforeMethod(alwaysRun = true)
    public void environmentSetUp() {
        loadProperties();
        UiAutomator2Options capabilities = new UiAutomator2Options();
        setUpCapabilities(capabilities);
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
            wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void loadProperties() {
        try {
            FileInputStream fileInputStream = new FileInputStream(PROPERTY_FILE);
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public boolean verifyElementIsDisplayed(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.isDisplayed();
    }

    public void clickElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static void setUpCapabilities(UiAutomator2Options capabilities) {
        capabilities.setCapability("platformName", properties.getProperty("platformName"));
        capabilities.setCapability("deviceName", properties.getProperty("deviceName"));
        capabilities.setCapability("appPackage", properties.getProperty("appPackage"));
        capabilities.setCapability("appActivity", properties.getProperty("appActivity"));
        capabilities.setCapability("automationName", properties.getProperty("automationName"));
        //capabilities.setCapability("app", "C:\\Users\\santiago.correa03\\Downloads\\android.wdio.native.app.v1.0.8.apk");
    }
    public SigningScreen openSigningScreen() {
        return new SigningScreen(driver);
    }

    @AfterMethod()
    public void afterMethodFinishTesting() {
       driver.quit();
    }
}
