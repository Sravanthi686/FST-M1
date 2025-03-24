package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		//intilize the firefox driver
		WebDriver driver = new FirefoxDriver();
;
		//Open the page
		driver.get("https://training-support.net/webelements/login-form");
		
		//print the title of the page
		System.out.println("Page title: "+ driver.getTitle());
	
			
		
		//Print the username field and enter the username
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		//Print the Password field and enter the Password
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password");
		//find the login button and click on it
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		//Print the confirmation message
		String message = driver.findElement(By.xpath("//h1[contains(text(), 'Success')]")).getText();
	System.out.println("Login message "+ message);
	driver.quit();
		
	}

}
