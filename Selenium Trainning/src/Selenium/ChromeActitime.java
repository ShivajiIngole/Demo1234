package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeActitime {


	private static final TimeUnit SECONDS = null;

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		System.out.println(driver.getTitle());
		//System.out.println(driver.getlength());
		System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().equals("https://www.actitime.com/")) {
			System.out.println("verify successfully");
		}
		else {
			System.out.println("verify unsuccessfully");
		}
	String str=	driver.getPageSource();
		System.out.println(str.length());
		
	//	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		//driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		//driver.findElement(By.id("loginButton")).click();
	
	driver.findElement(By.cssSelector("#loginButton")).click();
	WebElement logoutbutton=driver.findElement(By.id("logoutLink"));
	//	WebDriverWait wait = new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.elementToBeClickable(logoutbutton));
		//or
		Wait wait = new FluentWait(driver)
	      .withTimeout(60,SECONDS)
	      .pollingEvery(5,SECONDS)
	      .ignoring(Exception.class);
		
		String actualpagetitle = driver.getCurrentUrl();
		String expectedpagetitle = "https://demo.actitime.com/user/submit_tt.do";
		if (actualpagetitle.equals(expectedpagetitle)) {
			System.out.println ("System identified url successfully");
		}
		else {
			System.out.println ("System identified url unsuccessfully");
		}
		driver.findElement(By.id("logoutLink")).click();
		
	
	}

}
