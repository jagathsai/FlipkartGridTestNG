package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IDAndNameLocator {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement username = driver.findElement(By.name("Username"));
        username.sendKeys("student");
        driver.findElement(By.name("Password")).sendKeys("Password123");
        driver.findElement(By.name("Submit")).click();
        
        driver.quit();
    }
}

