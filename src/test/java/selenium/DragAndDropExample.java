package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {
    public static void main(String[] args) {
        
    	System.setProperty("webdriver.chrome.driver", "C://Users//USER//Downloads//chromedriver_win32//chromedriver.exe//");

        
        WebDriver driver = new ChromeDriver();

        
        driver.get("https://demo.guru99.com/test/drag_drop.html");

        
        driver.manage().window().maximize(); // Maximize the browser window

        
        WebElement sourceElement = driver.findElement(By.id("fourth")); // Locate the source element to be dragged

        
        WebElement targetElement = driver.findElement(By.id("amt8"));

        
        Actions actions = new Actions(driver);

        
        actions.dragAndDrop(sourceElement, targetElement).build().perform();

        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.quit();
    }
}
