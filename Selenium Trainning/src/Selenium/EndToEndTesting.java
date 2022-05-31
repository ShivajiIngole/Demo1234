package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEndTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
	WebElement first=driver.findElement(By.cssSelector("input[ng-model='FirstName']"));
		first.sendKeys("Shivaji",Keys.TAB);
		
		driver.switchTo().activeElement().sendKeys("Ingole",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Samta Colony, Talegaon Dabhade",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Shivai.ingole43@gmail.com",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("8149136155",Keys.TAB);
		driver.switchTo().activeElement().click();
		driver.switchTo().activeElement().click();
		driver.findElement(By.id("msdd")).click();
		List <WebElement> dropdown=driver.findElements(By.cssSelector("div[style='display: block;']>ul>li"));
		System.out.println (dropdown.get(3).getText());
		dropdown.get(3).click();
		dropdown.get(5).click();
		
		
		driver.findElement(By.id("checkbox1")).click();
		WebElement skills=driver.findElement(By.cssSelector("#Skills"));
		skills.sendKeys(Keys.PAGE_DOWN);
		Select s=new Select (skills);
		s.selectByIndex(6);
		WebElement country=driver.findElement(By.id("countries"));
		
		Select country1 = new Select(country);
		country1.selectByIndex(0);
		WebElement SelectCountry=driver.findElement(By.cssSelector("span[role='combobox']"));
		SelectCountry.click();
		driver.findElement(By.cssSelector("ul[id='select2-country-results']>li:nth-of-type(5)")).click();
		
		WebElement year=driver.findElement(By.id("yearbox"));
		
		Select s1= new Select (year);
		s1.selectByVisibleText("2015");
		
		WebElement month=driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		
		
		Select s2= new Select (month);
		s2.selectByVisibleText("August");
		
		WebElement day=driver.findElement(By.id("daybox"));
		
		Select s3= new Select (day);
		s3.selectByVisibleText("29");
		
		driver.findElement(By.cssSelector("#firstpassword")).sendKeys("Shivaji@Ingole",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Shivaji@Ingole",Keys.TAB);
		driver.switchTo().activeElement().click();
		
		
		
		
		
		
		
		
	}

}
