package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
       
        // Open the page
        driver.get("https://training-support.net/webelements/selects");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());
        
        //find the dropdown
        WebElement selectElement = driver.findElement(By.cssSelector("select.h-10"));
        Select dropDown = new Select(selectElement);
        
        //Select the second option  using visible text
        dropDown.selectByVisibleText("One");
        //print the selected option
        System.out.println(dropDown.getFirstSelectedOption().getText());
        //select third option using index
        dropDown.selectByIndex(2);
        //print the selected option
        System.out.println(dropDown.getFirstSelectedOption().getText());
        //Select the fourth option using value
        dropDown.selectByValue("three");
        //print the selected option
        System.out.println(dropDown.getFirstSelectedOption().getText());
        //print the all the options
        System.out.println("Options in select are: ");
        for (WebElement option : dropDown.getOptions()) {
        	System.out.println(option.getText());
        	
        }
        //close the browser
        driver.quit();
        
        
        
        
       
	}

}
