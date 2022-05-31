package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.switchTo().frame(0);
		
		WebElement click=driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		
		click.click();
		String AlertText=driver.switchTo().alert().getText();
		System.out.println ("Print text of alert popup "+AlertText);
		Thread.sleep(1500);
		driver.switchTo().alert().accept();
		
	}

}
