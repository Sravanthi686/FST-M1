package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity13 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
       
        // Open the page
        driver.get("https://training-support.net/webelements/tables");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());
        
        //print the number the columns
        List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
        System.out.println("Number of columns: " + cols.size());
        
        //print the number the rows
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("Number of rows: " + rows.size());
        
        
        //Print the cell values of the third rows
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));  
        for(WebElement cell : thirdRow) {
        	 System.out.println(cell.getText());
             
        }
        //Print the cell values of the second row and column
        System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]")).getText());
    
        
        //close the broswer
        driver.quit();
        
	}

}
