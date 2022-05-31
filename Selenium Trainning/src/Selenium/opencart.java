package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class opencart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.opencart.com/index.php?route=account/register");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		
		
	driver.findElement(By.cssSelector("#input-username")).sendKeys("Shivaji");
	
	}

}
