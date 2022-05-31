package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingPromptAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		
	WebElement	prompt=driver.findElement(By.cssSelector("button[onclick='myFunction()']"));
	prompt.click();
	String getText=driver.switchTo().alert().getText();
	
		System.out.println (getText);
		Thread.sleep(1500);
		driver.switchTo().alert().sendKeys("Shivaji");
	
		driver.switchTo().alert().accept();
		
		
		
		
		
	}

}
