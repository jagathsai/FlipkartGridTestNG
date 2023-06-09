package org.Manipal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Manipal.Axis_010623.BaseConfigurations;

public class TestCase1 extends BaseConfigurations {

    // Declare page objects
    public Homepage homeObj;
    public MenuPage menuObj;
    WebDriver driver;

    @BeforeClass
    public void initialiSetup() {
        driver = getDriver();
        homeObj = new Homepage(driver);
        menuObj = new MenuPage(driver);
    }

    @Test
    public void scenario() {
        homeObj.verifyHomeLaunchSuccess();
        menuObj.menuNavigation();
    }
}
