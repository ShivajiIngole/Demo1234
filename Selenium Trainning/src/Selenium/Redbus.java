package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	driver.get("https://www.redbus.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.cssSelector("button[class='sc-jTzLTM bfMZDh']")).click();
	
	WebDriverWait wait = new WebDriverWait(driver,20);
	
	WebElement element=driver.findElement(By.id("src"));
	wait.until(ExpectedConditions.elementToBeClickable(element));
	
	element.click();
	element.sendKeys("pune");
	
	WebElement ele=driver.findElement(By.id("dest"));
	ele.click();
	ele.sendKeys("Mumbai");
	
	
	    WebElement date=driver.findElement(By.cssSelector("label[for='onward_cal']"));
		wait.until(ExpectedConditions.elementToBeClickable(date));
		

	date.click();
	
	  WebElement select=driver.findElement(By.xpath("//div[5]/table/tbody/tr[1]/td[3]"));
			wait.until(ExpectedConditions.elementToBeClickable(select));
			select.click();
			
	
			  WebElement select1=driver.findElement(By.xpath("//div[5]/table/tbody/tr[5]/td[3]"));
				wait.until(ExpectedConditions.elementToBeClickable(select1));
				select1.click();
	
				WebElement Table=driver.findElement(By.id("search_btn"));
				wait.until(ExpectedConditions.elementToBeClickable(Table));
				Table.click();
				// driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
				 //driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
				// driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_UP);
	
	}

}
