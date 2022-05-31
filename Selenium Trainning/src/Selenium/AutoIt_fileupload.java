package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt_fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.cssSelector("input#imagesrc")).sendKeys("D:\\Automation");
		
		//OR
		
		
		
	}

}
