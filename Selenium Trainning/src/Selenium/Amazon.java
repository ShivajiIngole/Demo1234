package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
//System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		//ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector("div#nav-xshop>a:nth-of-type(1)")).click();
		driver.navigate().back();
		List<WebElement> AllOption=driver.findElements(By.cssSelector("#nav-xshop>a"));
		System.out.println ("count of all option"+AllOption.size());
		for (int i=0;i<AllOption.size();i++) {
			WebElement option=AllOption.get(i);
			String name=option.getText();
			System.out.println ("option matched"+name);
			if(name.equals("Watches")) {
				option.click();
				break;
			}else {
				System.out.println ("option not matched");
			}
		}
		
	//	driver.navigate().back();
		
		
		
		
	}

}
