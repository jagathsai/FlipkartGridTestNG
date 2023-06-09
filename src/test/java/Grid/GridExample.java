package Grid;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class GridExample {
    public static void main(String[] args) {
        try {
            // Define the URL of the GRID hub
            URL gridUrl = new URL("http://192.168.1.5:4444/wd/hub");

            // Define Chrome options and capabilities
            ChromeOptions options = new ChromeOptions();
            options.setCapability("browserName", "chrome");
            options.setCapability("platformName", Platform.ANY);

            // Create a RemoteWebDriver instance using the GRID hub URL and capabilities
            WebDriver driver = new RemoteWebDriver(gridUrl, options);

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
            

            // Select the checkbox from the left
            WebElement checkBox = driver.findElement(By.cssSelector("div._1p7h2j"));
            checkBox.click();

            // Close the browser
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
