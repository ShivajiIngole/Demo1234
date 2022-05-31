package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingWindow {

	public static void main(String[] args) {

		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://etrain.info/in");
		
		String ActiveWindowId=driver.getWindowHandle();
		System.out.println (ActiveWindowId);
//driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);

WebElement nextwind=driver.findElement(By.xpath("//div[p[text()='Connect With Us']]/div/a[4]"));

nextwind.click();
Set <String> listOfWindID=driver.getWindowHandles();

System.out.println (listOfWindID);
listOfWindID.remove(ActiveWindowId);

Iterator <String> allwind=listOfWindID.iterator();

String childwind = allwind.next();

driver.switchTo().window(childwind);

//driver.findElement(By.cssSelector("#email-or-phone")).sendKeys("8149136155",Keys.TAB);

//driver.switchTo().activeElement().sendKeys("Shivaji@1234");

System.out.println("Linkedin page title: " + driver.getTitle());
System.out.println("Linkedin page ulr: " + driver.getCurrentUrl());

// close current instance of browser
 driver.close();
//driver.quit();//comment below code


// switch back to home page window in order to perform any required operation on that
driver.switchTo().window(ActiveWindowId);



	}

}
