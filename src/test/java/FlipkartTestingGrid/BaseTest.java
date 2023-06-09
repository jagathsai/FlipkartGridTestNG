package FlipkartTestingGrid;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    protected WebDriver driver;

    public BaseTest() {
        // Default constructor
    }

    @BeforeTest
    public void setUp() {
        // Default grid URL and browser capability
        String gridUrlString = "http://192.168.1.5:4444/wd/hub";
        String browserName = "chrome";

        URL gridUrl = null;
        try {
            gridUrl = new URL(gridUrlString);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        // Initialize WebDriver using the provided grid URL and browser capability
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browserName);
        ChromeOptions options = new ChromeOptions();
        options.merge(capabilities);

        driver = new RemoteWebDriver(gridUrl, options);
    }


    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
