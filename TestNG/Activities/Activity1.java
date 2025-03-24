package Activity;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity1 {
	//Declare class objetcs
	WebDriver driver;
	
	
	
  @BeforeClass //setup function
  public void setup() {
	  //driver initilization
	  driver = new FirefoxDriver();
	  
	  
	  //open the browser
	  driver.get("https://training-support.net/");
  }
@Test(priority=1)
public void pageTitleTest() {
	//verifying page title
	assertEquals(driver.getTitle(), "Training Support");
	
}

@Test(priority=2)
public void aboutLinkText() {
	//find the about page link and click it
	driver.findElement(By.linkText("About Us")).click();
	
	//verify page redirect
	assertEquals(driver.getTitle(), "About Training Support");
	
}
  
  @AfterClass //teardown function
  public void teardown() {
  //close the browser
	 driver.quit();
  }
  

}
