package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseOps2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		
		Actions act=new Actions(driver);
		
		List<WebElement> sourceElements=driver.findElements(By.cssSelector("ul#gallery>li"));
		WebElement target=driver.findElement(By.id("trash"));
		
		
		act.dragAndDrop(sourceElements.get(0), target).build().perform();
		Thread.sleep(1500);
		act.dragAndDrop(sourceElements.get(1), target).build().perform();
		
		
		
		
	}

}
