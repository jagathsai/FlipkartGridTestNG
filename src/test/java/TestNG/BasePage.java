package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        System.setProperty("webdriver.chrome.driver", "C://Users//USER//Downloads//chromedriver_win32//chromedriver.exe//");
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
    }

    protected void verifyElementVisibility(String xpathExpression, String elementName) {
        WebElement element = driver.findElement(By.xpath(xpathExpression));
        Assert.assertTrue(element.isDisplayed(), elementName + " is visible on the screen.");
    }

    public void quitDriver() {
        driver.quit();
    }
}

