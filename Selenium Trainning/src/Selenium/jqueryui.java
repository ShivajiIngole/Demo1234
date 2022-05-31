package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class jqueryui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		
		WebDriver driver=s1.setUp("chrome", "https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		
		
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		//driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
		
		Actions act = new Actions(driver);
		
	//	List<WebElement> AllOption=driver.findElements(By.xpath("//li[@class='ui-state-default ui-sortable-handle"));
		
		WebElement drag1 = driver.findElement(By.xpath("//li[1][@class='ui-state-default ui-sortable-handle']"));
		WebElement target1 = driver.findElement(By.xpath("//li[4][@class='ui-state-default ui-sortable-handle']"));
		
		Point item1=drag1.getLocation();
		int item1_Y=item1.getY();
		System.out.println (item1_Y);

		Point location=target1.getLocation();
		int target1_Y=location.getY();
		System.out.println (target1_Y);
		
		
		act.dragAndDropBy(drag1, 0, 122).build().perform();
		
		
		
		
	}

}
