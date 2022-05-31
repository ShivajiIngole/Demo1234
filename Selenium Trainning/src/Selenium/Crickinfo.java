package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Crickinfo {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		driver.manage().window().maximize();
		
		//WebElement element=driver.findElement(By.className("nav-pages"));
		Thread.sleep(2000);
		
		//WebDriverWait wait = new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.elementToBeClickable(element));
		WebElement samsung=driver.findElement(By.cssSelector(".brandmenu-v2>ul>li>a:nth-of-type(1)"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(samsung));
	samsung.click();
		
		List <WebElement> option=driver.findElements(By.cssSelector(".makers>ul>li>a"));
		System.out.println (option.size());
		Thread.sleep(2000);
		for (int i=0;i<option.size();i++) {
			wait.until(ExpectedConditions.elementToBeClickable(option.get(i)));
			option.get(i).click();
			System.out.println (driver.getCurrentUrl());
			driver.navigate().back();
			Thread.sleep(2000);
			option=driver.findElements(By.cssSelector(".makers>ul>li>a"));
		}
		
		
	}

}
