package FlipkartTestingGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FlipkartTestNG extends BaseTest {
    @Test
    public void testMethod() {       
        driver.get("https://www.flipkart.com/");

        try {
            WebElement popUpCloseButton = driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z"));
            popUpCloseButton.click();
        } catch (Exception ignored) {
            
        }
        
        WebElement mobileMenu = driver.findElement(By.linkText("Mobiles"));
        mobileMenu.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement checkBox = null;
        try {
            checkBox = driver.findElement(By.xpath("//div[contains(@class, '_1p7h2j')]"));
            checkBox.click();
        } catch (NoSuchElementException e) {
            System.out.println("Checkbox not found");
        }
    }
}
