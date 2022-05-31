package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingAlertPopupConfirmation {

	public static void main(String[] args) {
	
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.switchTo().frame(0);
		
		WebElement Alert=driver.findElement(By.xpath("//button[text()='Try it']"));
		
		Alert.click();
		String GetText=driver.switchTo().alert().getText();
		System.out.println ("get text from confirmstion popup"+GetText);
		
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		
	}

}
