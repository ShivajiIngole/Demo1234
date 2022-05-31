package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseOps1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.globalsqa.com/demo-site/");
		//identify all the elements of main menu
	
	List <WebElement>AllOption=driver.findElements(By.cssSelector("div#menu>ul>li"));
		
	Actions act =new Actions (driver);
	
	for (int i=0;i<AllOption.size();i++) {
		WebElement option = AllOption.get(i);
		act.moveToElement(option).build().perform();
		Thread.sleep(2000);
	}
		
		//	div#menu>ul>li:nth-of-type()
		
		
		
	}

}
