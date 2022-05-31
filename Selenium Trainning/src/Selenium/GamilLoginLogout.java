package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GamilLoginLogout {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");


WebDriver driver = new ChromeDriver();

driver.get("https://demosite.executeautomation.com/Login.html");

driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

driver.findElement(By.name("UserName")).sendKeys("admin");
driver.findElement(By.name("Password")).sendKeys("manager");
//WebDriverWait wait=new WebDriverWait(driver,20);
//wait.until(ExpectedConditions.elementToBeClickable(loginButton));
driver.findElement(By.name("Login")).click();


	}

}
