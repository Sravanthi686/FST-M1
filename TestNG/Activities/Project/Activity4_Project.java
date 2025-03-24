package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the ChromeDriver path (ensure the correct path is specified)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        driver = new FirefoxDriver();
        }

    @Test
    public void testLogin() {
        // Open the browser and navigate to the URL
        driver.get("https://alchemy.hguy.co/crm");

        // Find and select the username and password fields
        WebElement usernameField = driver.findElement(By.id("user_name")); // Use appropriate selector
        WebElement passwordField = driver.findElement(By.id("username_password")); // Use appropriate selector

        // Enter login credentials into the respective fields
        usernameField.sendKeys("admin"); // Replace with actual username
        passwordField.sendKeys("pa$$w0rd"); // Replace with actual password

        //  Click login
        WebElement loginButton = driver.findElement(By.id("bigbutton")); // Replace with actual button ID or selector
        loginButton.click();

        //  Verify that the homepage has opened
        String pageTitle = driver.getTitle();
        
    }

    @AfterClass
    public void tearDown() {
        //  Close the browser
       // driver.quit();
    }
}
