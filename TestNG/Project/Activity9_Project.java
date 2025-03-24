package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity1{

     WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
    }

    @Test
    public void testTitle() {
        // Navigate to the URL
        driver.get("http://alchemy.hguy.co/crm");

        // Get the title of the website
        String title = driver.getTitle();

        // Make sure the title matches "SuiteCRM" exactly
        Assert.assertEquals(title, "SuiteCRF", "Title does not match!");
    }

    @AfterTest
    public void tearDown() {
        // Close the browser after the test
       // driver.quit();
    }
}
