package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyBoardOps1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		//identify first name input field
		WebElement firstName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		firstName.sendKeys("Shivaji",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
	WebElement	LastName=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		LastName.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		LastName.sendKeys(Keys.TAB);
		WebElement Address=driver.findElement(By.cssSelector("textarea[ng-model='Adress']"));
		Address.sendKeys("Ingole");
		
	}

}
