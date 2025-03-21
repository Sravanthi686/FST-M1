package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the ChromeDriver path (ensure the correct path is specified)
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        driver = new FirefoxDriver();
    }

    @Test
    public void testNavigationMenuColor() {
        // Step a: Open the browser and navigate to the URL
        driver.get("http://alchemy.hguy.co/crm");

        // Step b: Login using provided credentials
        WebElement usernameField = driver.findElement(By.id("user_name")); // Use the correct ID
        WebElement passwordField = driver.findElement(By.id("username_password")); // Use the correct ID
        WebElement loginButton = driver.findElement(By.id("bigbutton")); // Use the correct ID

        // Enter login credentials
        usernameField.sendKeys("admin"); // Replace with actual username
        passwordField.sendKeys("pa$$w0rd"); // Replace with actual password
        loginButton.click();

        // Wait for the page to load (you may want to add a wait here if needed)

        // Step c: Get the color of the navigation menu and print it to the console
        WebElement navigationMenu = driver.findElement(By.id("toolbar")); // Use the correct ID or another selector for the navigation menu
        String menuColor = navigationMenu.getCssValue("background-color");

        // Print the color of the navigation menu to the console
        System.out.println("The color of the navigation menu is: " + menuColor);

        // Step d: Close the browser
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        // driver.quit();
    }
}
