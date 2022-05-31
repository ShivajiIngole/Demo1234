package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActimeLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");

WebDriver chrom=new ChromeDriver();
chrom.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
chrom.get("https://demosite.executeautomation.com/Login.html");
System.out.println(chrom.getTitle());
String title=chrom.getTitle();
System.out.println(chrom.getCurrentUrl());
System.out.println(title.length());
if(chrom.getCurrentUrl().equals("https://demosite.executeautomation.com/Login.html")) {
	System.out.println ("System login is successfully");
	
}else {
	System.out.println ("System login is not successfully");
}
	JavascriptExecutor js = (JavascriptExecutor)chrom;
	WebElement userNameInputFeild= chrom .findElement(By.name("UserName"));
	//js.executeScript("document.getelementByName('UserName').value='admin';");
	userNameInputFeild.sendKeys("admin");
	
	WebElement UserPasswordFeild=chrom.findElement(By.name("Password"));
	//js.executeScript("document.getelementByName('Password').value='Manager';");
	UserPasswordFeild.sendKeys("Manager");
	
	WebElement element=chrom.findElement(By.name("Login"));
	element.click();
	//js.executeScript("document.getelementByName('Login').click();");
	//OR
	//js.executeScript("arguments[0].click();", element);
//	String gettitle=js.executeScript("return document.Title;").toString();
	//System.out.println (gettitle);
	Thread.sleep(2000); 
	js.executeScript("window.scrollBy(0,500)");
	
	//to refresh page
	js.executeScript("history.go(0)");
	
}
}
