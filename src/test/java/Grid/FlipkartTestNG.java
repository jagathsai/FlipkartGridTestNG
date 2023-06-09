package Grid;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class FlipkartTestNG {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Define the URL of the GRID hub
        URL gridUrl = null;
        try {
            gridUrl = new URL("http://192.168.1.5:4444/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        // Define Chrome options
        ChromeOptions options = new ChromeOptions();
        options.setCapability("browserName", "chrome");

        // Create a RemoteWebDriver instance using the GRID hub URL and Chrome options
        driver = new RemoteWebDriver(gridUrl, options);
    }


    @Test
    public void testMethod() {
        // Open Flipkart link
        driver.get("https://www.flipkart.com/");

        // Handle pop-up (if displayed)
        try {
            WebElement popUpCloseButton = driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z"));
            popUpCloseButton.click();
        } catch (Exception ignored) {
            // If pop-up is not displayed, ignore the exception
        }

        // Click on Mobile from top Menu
        WebElement mobileMenu = driver.findElement(By.linkText("Mobiles"));
        mobileMenu.click();

        // Add a delay of 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Select the checkbox from the left
        WebElement checkBox = null;
        try {
            checkBox = driver.findElement(By.xpath("//div[contains(@class, '_1p7h2j')]"));
            checkBox.click();
        } catch (NoSuchElementException e) {
            System.out.println("Checkbox not found");
        }
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
