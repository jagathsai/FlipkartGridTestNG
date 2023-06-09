package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopTest {
    public static void main(String[] args) {
        // Set the path to chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C://Users//USER//Downloads//chromedriver_win32//chromedriver.exe//");
        
        // Launch the website
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        
        // Verify the visibility of the elements
        verifyElementVisibility(driver, By.className("header-logo"), "Demo Web Shop logo");
        verifyElementVisibility(driver, By.linkText("Register"), "Register");
        verifyElementVisibility(driver, By.linkText("Log in"), "Log in");
        verifyElementVisibility(driver, By.id("topcartlink"), "Shopping Cart");
        verifyElementVisibility(driver, By.className("wishlist-qty"), "Wishlist");
        
        // Go to Computers -> Desktop from the menu
        WebElement computersMenu = driver.findElement(By.linkText("Computers"));
        computersMenu.click();
        
        WebElement desktopSubMenu = driver.findElement(By.partialLinkText("Desktop"));
        desktopSubMenu.click();
        
        // Click on Add to Cart for the first product
        WebElement addToCartButton = driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"));
        addToCartButton.click();
        
        // Verify the next page for the presence of "Add to Cart" button
        verifyElementVisibility(driver, By.name("addtocartbutton"), "Add to Cart button");
        
        // Close the browser
        driver.quit();
    }
    
    private static void verifyElementVisibility(WebDriver driver, By locator, String elementName) {
        WebElement element = driver.findElement(locator);
        if (element.isDisplayed()) {
            System.out.println(elementName + " is visible on the screen.");
        } else {
            System.out.println(elementName + " is not visible on the screen.");
        }
    }
}
