package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NameAndPassword {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Users//USER//Downloads//chromedriver_win32//chromedriver.exe//");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement Firstname = driver.findElement(By.name("First_Name"));
        Firstname.sendKeys("Jagathsai"); //First name
        
        WebElement Lastname = driver.findElement(By.name("Last_Name"));
        Lastname.sendKeys("Madhagani"); // Last Name
        
        WebElement Phone = driver.findElement(By.name("Phone"));
        Phone.sendKeys("7780119909");  // Phone number
        
        WebElement Email = driver.findElement(By.name("Email"));
        Email.sendKeys("jagathsai039@gmail.com"); 
        
        WebElement address = driver.findElement(By.name("Address"));
        address.sendKeys("LB nagar");
        
        WebElement City = driver.findElement(By.name("City"));
        City.sendKeys("Hyderabad");
        
        WebElement State = driver.findElement(By.name("State/Province"));
        State.sendKeys("Telangana");
        
        Select sel=new Select(driver.findElement(By.name("country")));
        sel.selectByValue("INDIA"); 
        
        sel.selectByVisibleText("India");


        driver.quit();
    }
}