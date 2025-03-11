package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		//create the wait object
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//open the page
		driver.get("https://training-support.net/webelements/dynamic-content");
		
		//print the title of the page
		System.out.println("Page title: " + driver.getTitle());
		
		//find and click the button
		driver.findElement(By.id("genButton")).click();
		
		//wait for release to appear
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"), "release"));
		
		//Print the text
		System.out.println("word found: " + driver.findElement(By.id("word")).getText());
		
		driver.quit();
	}

}
