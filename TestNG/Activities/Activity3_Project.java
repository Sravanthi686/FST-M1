package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Set the path for the ChromeDriver executable
      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver (using Chrome in this case)
        driver = new FirefoxDriver();
    }

    @Test
    public void getFooterCopyrightText() {
        // Step 1: Open the browser and navigate to the URL
        driver.get("http://alchemy.hguy.co/crm");

        // Step 2: Get the first copyright text in the footer
        WebElement copyrightText = driver.findElement(By.xpath("//a[text()='© Supercharged by SuiteCRM']"));

        // Step 3: Print the copyright text to the console
        System.out.println("Copyright Text: " + copyrightText.getText());
    }

    @AfterTest
    public void tearDown() {
        // Step 4: Close the browser
       // driver.quit();
    }
}
