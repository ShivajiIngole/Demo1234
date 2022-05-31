package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SwitchToWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	
	String currentpageid=driver.getWindowHandle();
	driver.findElement(By.id("loginButton")).click();
Set <String> handles=driver.getWindowHandles();
		List<String> list = new ArrayList <String>(handles);
		for(String id:list) {
			String tittle=driver.switchTo().window(id).getTitle();
			if (tittle.contains(" Enter Time-Track")) {
				System.out.println ("found right windows");
			}
		} 
		driver.switchTo().window(currentpageid);
		System.out.println ("not found window");
		
		
		
	}

}
