package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssPositionValidation {

	public static void main(String[] args) {

		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver =s1.setUp("Chrome","https://demo.actitime.com/login.do");
		WebElement UserNamePositon=driver.findElement(By.id("username"));
		Point Position=UserNamePositon.getLocation();
		int UserName_X=Position.getX();
		int UserName_Y=Position.getY();
		System.out.println("UserName_X = "+UserName_X);
		System.out.println("UserName_Y = "+UserName_Y);
		WebElement PasswordPositon=driver.findElement(By.name("pwd"));
		Point Password=PasswordPositon.getLocation();
		int Password_X=Password.getX();
		int Password_Y=Password.getY();
		System.out.println ("Password_X = "+Password_X);
		System.out.println ("Password_Y = "+Password_Y);
	System.out.println ("validate username and password position=" +( UserName_Y<Password_Y));
	
	WebElement Button = driver.findElement(By.id("loginButton"));
	Point LoginButton=Button.getLocation();
	int LoginButton_X=LoginButton.getX();
	int LoginButton_Y=LoginButton.getY();
	System.out.println ("LoginButton_X = "+ LoginButton_X);
	System.out.println ("LoginButton_X = "+ LoginButton_Y);
	
	System.out.println ("validate Password and LoginButton Position = "+(Password_Y<LoginButton_Y));
	
	
	
	
	
	
	
	
	
	
	}

}
