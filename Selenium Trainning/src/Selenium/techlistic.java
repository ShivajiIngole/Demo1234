package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class techlistic {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

//WebElement element= driver.findElement(By.cssSelector("input#txtUsername"));
//element.sendKeys("Admin");
//driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
//driver.findElement(By.cssSelector("input#btnLogin")).click();

driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("admin123");
driver.findElement(By.cssSelector("input#btnLogin")).click();

List<WebElement>Alloption=driver.findElements(By.cssSelector("#mainMenu>ul>li>a"));
WebDriverWait wait = new WebDriverWait(driver,70);

System.out.println (Alloption.size());

for (int i=0;i<Alloption.size();i++) {
	wait.until(ExpectedConditions.elementToBeClickable(Alloption.get(i)));
	Alloption.get(i).click();
	System.out.println(driver.getCurrentUrl());
	driver.navigate().back();
	driver.findElements(By.cssSelector("#mainMenu>ul>li>a"));
}
	}

}
