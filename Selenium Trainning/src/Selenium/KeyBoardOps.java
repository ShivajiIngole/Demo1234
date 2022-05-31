package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyBoardOps {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1= new SeleniumUtility();
		WebDriver driver=s1.setUp("Chrome","https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	//	driver.findElement(By.className(".loginPage")).sendKeys(Keys.ESCAPE);
		WebElement username =driver.findElement(By.cssSelector("input[placeholder='Username']"));
		username.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
		username.sendKeys(Keys.chord(Keys.CONTROL,"c"));
	
		driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		//password.sendKeys(Keys.TAB);
	//	WebElement loginBtn=driver.findElement(By.id("loginButton"));
	//	loginBtn.click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
