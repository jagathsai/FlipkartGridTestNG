package selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgConcepts {

    // Test method 1
    @Test
    public void testScenario1() {
        System.out.println("I am testScenario1");
    }

    // Test method 2
    @Test
    public void testCase() {
        System.out.println("I am a testCase");
    }

    // Test method 3
    @Test
    public void testCase2() {
        System.out.println("I am a testCase2");
    }

    // This method will run before each test method
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I am before method");
    }

    // This method will run after each test method
    @AfterMethod
    public void afterMethod() {
        System.out.println("I am after method");
    }

    // This method will run once before the first test method in the class
    @BeforeClass
    public void beforeClass() {
        System.out.println("I am before Class");
    }

    // This method will run once after all the test methods have finished executing in the class
    @AfterClass
    public void afterClass() {
        System.out.println("I am after Class");
    }
}
