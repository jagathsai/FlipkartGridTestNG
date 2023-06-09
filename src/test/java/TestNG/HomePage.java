package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public void verifyElements() {
        verifyElementVisibility("//a[@class='logo']", "Demo Web Shop logo");
        verifyElementVisibility("//a[text()='Register']", "Register");
        verifyElementVisibility("//a[text()='Log in']", "Log in");
        verifyElementVisibility("//span[@id='topcartlink']", "Shopping Cart");
        verifyElementVisibility("//span[@class='wishlist-qty']", "Wishlist");
    }
}
