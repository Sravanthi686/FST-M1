package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the ChromeDriver path (ensure the correct path is specified)
      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        driver = new FirefoxDriver();
    }

    @Test
    public void testNavigationMenuColor() {
        // Open the browser and navigate to the URL
        driver.get("http://alchemy.hguy.co/crm");

        //  Login using provided credentials
        WebElement usernameField = driver.findElement(By.id("user_name")); // Use the correct ID
        WebElement passwordField = driver.findElement(By.id("username_password")); // Use the correct ID
        WebElement loginButton = driver.findElement(By.id("bigbutton")); // Use the correct ID

        // Enter login credentials
        usernameField.sendKeys("admin"); // Replace with actual username
        passwordField.sendKeys("pa$$w0rd"); // Replace with actual password
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("toolbar")));
        //  Locate the navigation menu
        WebElement navigationMenu = driver.findElement(By.id("toolbar")); // Adjust if needed based on actual page structure

        //  Ensure that the "Activities" menu item exists
        boolean activitiesMenuExists = false;
        try {
            WebElement activitiesMenu = driver.findElement(By.xpath("//a[@id='grouptab_3']"));
            activitiesMenuExists = activitiesMenu.isDisplayed();
        } catch (Exception e) {
            // If element not found, it will catch the exception and set the flag to false
            activitiesMenuExists = false;
        }

        // Output result
        if (activitiesMenuExists) {
            System.out.println("Activities menu item exists.");
        } else {
            System.out.println("Activities menu item does not exist.");
        }
    }

    @AfterClass
    public void tearDown() {
        // Close the browser after the test
        //driver.quit();
    }
}
