package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssAttributeValidation {

	public static void main(String[] args) {
	SeleniumUtility s1 = new SeleniumUtility();
		
		WebDriver driver = s1.setUp("Chrome","https://demo.actitime.com/login.do");
		
		WebElement LoginButton=driver.findElement(By.id("loginButton"));
	String color=LoginButton.getCssValue("color");
		System.out.println ("font color "+color);
		
		String font_Size=LoginButton.getCssValue("font-size");
		System.out.println ("font size "+ font_Size);
		String backgroungColor=LoginButton.getCssValue("background-image");
System.out.println ("backgroungColor "+backgroungColor);

WebElement ForgetPasswordLink = driver.findElement(By.id("toPasswordRecoveryPageLink"));
String ForgetPasswordLinkColor=ForgetPasswordLink.getCssValue("color");
System.out.println ("ForgetPasswordLink "+ForgetPasswordLinkColor);
	}

}
