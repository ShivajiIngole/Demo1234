package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//step2: create an instance of Chrome Browser
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		WebDriverWait wait = new WebDriverWait(driver,20);
         WebElement option=driver.findElement(By.id("bsd1-button"));
		wait.until(ExpectedConditions.elementToBeClickable(option));
		option.click();
	List<WebElement> alloption=	driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
		Thread.sleep(2000);
	System.out.println (alloption.size());
		
		for (int i=0;i<alloption.size();i++) {
			
			System.out.println (alloption.get(i).getText());
			
		}
		alloption.get(5).click();
		
		
	}

}
