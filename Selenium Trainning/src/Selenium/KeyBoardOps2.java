package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyBoardOps2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			SeleniumUtility s1 = new SeleniumUtility();
			WebDriver driver = s1.setUp("chrome", "https://www.flipkart.com/");
			
			WebElement popup=driver.findElement(By.xpath("//body"));
			popup.sendKeys(Keys.ESCAPE);
		//	popup.sendKeys(Keys.PAGE_DOWN);
		
			for (int i=0;i<10;i++) {
				popup.sendKeys(Keys.PAGE_DOWN);
				Thread.sleep(1500);
			}
			popup.sendKeys(Keys.chord(Keys.CONTROL.END));
			Thread.sleep(1500);
			popup.sendKeys(Keys.chord(Keys.CONTROL.HOME));
			Thread.sleep(1500);
			popup.sendKeys(Keys.F5);
			driver.navigate().refresh();
	}

}
