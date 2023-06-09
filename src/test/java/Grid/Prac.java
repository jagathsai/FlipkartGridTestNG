package Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Prac {

    WebDriver driver;
    String nodeURL;

    @Parameters({"browser", "hubURL"})
    @BeforeMethod()
    public void setUp(String browser, String hubURL) throws MalformedURLException {
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("Chrome Browser Initiated");
            ChromeOptions options = new ChromeOptions();
            options.setCapability("browserName", "chrome");
            options.setCapability("platform", Platform.WINDOWS);

            driver = new RemoteWebDriver(new URL(hubURL), options);

            driver.get("https://www.apple.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }

    @Test
    public void appleSite() throws InterruptedException {
        try {
            driver.findElement(By.xpath("//*[@id='ac-globalnav']/div/ul[2]/li[3]")).click();
            Thread.sleep(2000);

            driver.findElement(By.cssSelector("#chapternav > div > ul > li.chapternav-item.chapternav-item-ipad-air > a > figure")).click();
            Thread.sleep(2000);

            driver.findElement(By.linkText("Why iPad")).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @AfterMethod()
    public void tearDown() {
        driver.quit();
        System.out.println("Browser Closed");
    }
}
