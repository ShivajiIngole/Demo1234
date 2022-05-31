package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class saucedemo {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.saucedemo.com/");
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	String username=driver.findElement(By.cssSelector("div.login_credentials")).getText();
	System.out.println (username);
	String[] user=username.split("\n");
	//for(String s:user) {
		//System.out.println (s);	
//	}
	System.out.println (user[1]);
		driver.findElement(By.id("user-name")).sendKeys(user[1]);
		
		
		String password=driver.findElement(By.className("login_password")).getText();
		
		String []pass = password.split("\n");
		System.out.println (pass[1]);
		
	driver.findElement(By.cssSelector("#password")).sendKeys(pass[1]);
	
	
	
	
	
	
	}

}
