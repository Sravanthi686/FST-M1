package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity1 {

     WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Set up the WebDriver (Make sure you have the correct path to chromedriver)
       // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver"); // Update the path
        driver = new FirefoxDriver();
    }

    @Test
    public void testTitle() {
        // Step b: Navigate to the URL
        driver.get("http://alchemy.hguy.co/crm");

        // Step c: Get the title of the website
        String title = driver.getTitle();

        // Step d: Make sure the title matches "SuiteCRM" exactly
        Assert.assertEquals(title, "SuiteCRF", "Title does not match!");
    }

    @AfterTest
    public void tearDown() {
        // Step e: Close the browser after the test
       // driver.quit();
    }
}
