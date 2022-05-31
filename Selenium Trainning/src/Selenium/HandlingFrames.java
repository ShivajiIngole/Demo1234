package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://jqueryui.com/droppable/");

		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame);
		
		//driver.switchTo().frame("//iframe[contains(@class,'demo-frame')]");
		
		Actions act =new Actions(driver);
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement source = driver.findElement(By.cssSelector("div#draggable"));
		WebElement target=driver.findElement(By.cssSelector("#droppable>p"));
		
		wait.until(ExpectedConditions.elementToBeClickable(target));
		act.dragAndDrop(source, target ).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector(".logo>a")).click();
	}

}
