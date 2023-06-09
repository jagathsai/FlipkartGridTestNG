package TestNG;

import org.testng.annotations.Test;

public class DemoWebShopTestNG {
    @Test
    public void verifyHomePageElements() {
        HomePage homePage = new HomePage();
        homePage.verifyElements();
    }

    @Test(dependsOnMethods = "verifyHomePageElements")
    public void addToCartFirstProduct() {
        ProductPage productPage = new ProductPage();
        productPage.addToCart();
    }

    @Test(dependsOnMethods = "addToCartFirstProduct")
    public void verifyAddToCartPage() {
        AddToCartPage addToCartPage = new AddToCartPage();
        addToCartPage.verifyAddToCartButton();
    }
}
