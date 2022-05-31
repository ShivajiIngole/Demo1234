package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleAutoSuugestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys("Selenium");
		Thread.sleep(2000);
		List <WebElement> googlesuggestion=driver.findElements(By.xpath(".//*ul[@class='G43f7e']/li"));
		
		/*for (int i=0;i<googlesuggestion.size();i++) {
		WebElement suggestion1=	googlesuggestion.get(i);
		wait.until(ExpectedConditions.elementToBeClickable(suggestion1));
		String suggestion=suggestion1.getText();
		System.out.println (suggestion);
		Thread.sleep(1000);
		}*/
		for (WebElement web:googlesuggestion) {
			if (web.getText().trim().equals("ide")) {
				
				web.click();
				break;
			}
		}

		
	}

}
