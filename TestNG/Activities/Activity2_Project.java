package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Set the path for the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver (using Chrome in this case)
        driver = new FirefoxDriver();
        }

    @Test
    public void getHeaderImageURL() {
        // Step 1: Open the browser and navigate to the URL
        driver.get("http://alchemy.hguy.co/crm");

        // Step 2: Find the header image element (usually an <img> tag in HTML)
        WebElement headerImage = driver.findElement(By.cssSelector("div.companylogo img[alt='SuiteCRM']\r\n"
        		+ "")); // You may need to adjust the selector if necessary

        // Step 3: Get the 'src' attribute which contains the image URL
        String imageURL = headerImage.getAttribute("src");

        // Step 4: Print the URL to the console
        System.out.println("Header image URL: " + imageURL);
    }

    @AfterTest
    public void tearDown() {
        // Step 5: Close the browser
      //  driver.quit();
    }
}
