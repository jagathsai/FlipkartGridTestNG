package FlipkartTestingGrid;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    protected WebDriver driver;

    @BeforeTest
    public void setUp() {     
        URL gridUrl = null;
        try {
            gridUrl = new URL("http://192.168.1.5:4444/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }     
        ChromeOptions options = new ChromeOptions();
        options.setCapability("browserName", "chrome");
        driver = new RemoteWebDriver(gridUrl, options);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}