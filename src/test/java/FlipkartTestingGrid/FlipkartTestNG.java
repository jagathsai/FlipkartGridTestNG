package FlipkartTestingGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FlipkartTestN extends BaseTest {
    @Test
    public void testMethod() {
        driver.get("https://www.flipkart.com/");

        try {
            WebElement popUpCloseButton = driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z"));
            popUpCloseButton.click();
        } catch (NoSuchElementException ignored) {

        }

        WebElement mobileMenu = driver.findElement(By.linkText("Mobiles"));
        mobileMenu.click();

        sleep(2000);

        applyBrandFilter("Samsung", "//div[text()='SAMSUNG']");
        applyBrandFilter("Apple", "//div[text()='APPLE']");
        applyBrandFilter("Realme", "//div[text()='realme']");
    }

    private void applyBrandFilter(String brand, String xpath) {
        try {
            WebElement brandFilter = driver.findElement(By.xpath(xpath));
            brandFilter.click();
            // Wait for the filter to be applied
            sleep(2000);
        } catch (NoSuchElementException e) {
            System.out.println(brand + " filter not found");
        }
    }

    private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
