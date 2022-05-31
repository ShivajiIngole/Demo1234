package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {
  @Test
  public void Assertion() {
	  
	  SeleniumUtility utility = new SeleniumUtility();
		WebDriver driver = utility.setUp("chrome", "https://demo.actitime.com/login.do");
		System.out.println("Before login page title: " + driver.getTitle());
		String Title = driver.getTitle();
		System.out.println (Title);
		Assert.assertEquals(driver.getTitle(), Title);
		WebElement usernameInputField = driver.findElement(By.id("username"));
		
		Assert.assertTrue(usernameInputField.isDisplayed());
		Assert.assertTrue(usernameInputField.isEnabled());
		Assert.assertFalse(usernameInputField.isSelected(),"username is selected");
		Assert.assertEquals(usernameInputField.getAttribute("placeholder"), "Username");
	  
  }
}
