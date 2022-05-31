package Selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingActiveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
		
		WebElement activeObject=driver.switchTo().activeElement();
		
		String activeObjectPlaceholder=activeObject.getAttribute("placeholder");
		String ExpectedObject = "Username";
		if (ExpectedObject.equals(activeObjectPlaceholder)) {
			System.out.println("curson pointer validation is sucessful");
		}else {
			System.out.println("curson pointer validation is Unsucessful");
		}
		activeObject.sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("manager",Keys.TAB,Keys.ENTER);
		
	}

}
