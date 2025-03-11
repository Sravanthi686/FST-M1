package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		
	driver.get("https://training-support.net");

	//print the title of the homepage
	System.out.println("Current page title: " +driver.getTitle());
	
	//find the about us link
	driver.findElement(By.linkText("About Us")).click();
	
	//find the title of the about page
	System.out.println("Current page title: " +driver.getTitle());
	driver.quit();
	
	}
	

}
