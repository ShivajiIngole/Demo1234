package Selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeActitime1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(500,700));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");

		WebElement userinputfeild=driver.findElement(By.id("username"));
		System.out.println (userinputfeild.isDisplayed());
		System.out.println (userinputfeild.isEnabled());
		String actualDefaultTextOnUsernameField=userinputfeild.getAttribute("placeholder");
		System.out.println(actualDefaultTextOnUsernameField.equals("Username"));
		System.out.println ("*********************");
		userinputfeild.sendKeys("admin");
		
		WebElement passinputfeild=driver.findElement(By.name("pwd"));
		System.out.println (passinputfeild.isDisplayed());
		System.out.println (passinputfeild.isEnabled());
		String actualDefaultTextOnPasswordField = passinputfeild.getAttribute("placeholder");
		System.out.println (passinputfeild.getAttribute("placeholder"));
		System.out.println(actualDefaultTextOnPasswordField.equals("Password"));
		passinputfeild.sendKeys("manager");
		System.out.println ("&&&&&&&&&&&&&&&&&&&&&&&");
		WebElement checkbox = driver.findElement(By.name("remember"));
		System.out.println (passinputfeild.isDisplayed());
		System.out.println (passinputfeild.isEnabled());
		System.out.println(checkbox.isSelected());
		checkbox.click();
		System.out.println(checkbox.isSelected());

		
		WebElement loginbutton=driver.findElement(By.id("loginButton"));
		loginbutton.click();
		System.out.println (loginbutton.getTagName());
		System.out.println (passinputfeild.isDisplayed());
		System.out.println (passinputfeild.isEnabled());
		String ActualbuttonName=loginbutton.getText();
		System.out.println (ActualbuttonName.equals("Login"));
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
         WebElement logoutButton =driver.findElement(By.id("logoutLink"));
       	WebDriverWait wait = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
		driver.findElement(By.id("logoutLink")).click();
		//driver.close();
	}

}
