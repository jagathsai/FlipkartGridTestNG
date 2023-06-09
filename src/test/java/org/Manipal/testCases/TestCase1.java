package org.Manipal.testCases;

import Manipal.Axis_010623.BaseConfigurations;
import org.Manipal.pageObjects.Homepage;
import org.Manipal.pageObjects.MenuPage;
import org.Manipal.pageObjects.MobilePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 extends BaseConfigurations {

    public Homepage homeObj;
    public MenuPage menuObj;
    public MobilePage mobileObj;
    WebDriver driver;

    @BeforeClass
    public void initialSetup() {
        driver = getDriver();
        homeObj = new Homepage(driver);
        menuObj = new MenuPage(driver);
        mobileObj = new MobilePage(driver);
    }

    @BeforeMethod
    public void initializePageObjects() {
        driver.get("https://www.amazon.in"); // Updated URL
    }

    @Test
    public void scenario1() {
        homeObj.verifyHomeLaunchSuccess();
        menuObj.menuNavigation();
        mobileObj.verifyMobileHeader();
    }
}
