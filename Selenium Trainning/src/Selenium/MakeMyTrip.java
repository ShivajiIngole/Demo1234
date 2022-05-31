package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();

WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.makemytrip.com/");

driver.findElement(By.cssSelector("li[data-cy='account']")).click();
WebDriverWait wait = new WebDriverWait(driver,20);


WebElement popup=driver.findElement(By.cssSelector("span.langCardClose"));
wait.until(ExpectedConditions.elementToBeClickable(popup));
popup.click();

WebElement element=driver.findElement(By.cssSelector("label[for='departure']"));
wait.until(ExpectedConditions.elementToBeClickable(element));
element.click();

WebElement ele=driver.findElement(By.cssSelector(".DayPicker-Months>*:nth-of-type(2)>:nth-child(3)>:nth-child(3)>:nth-child(3)>div>p"));
wait.until(ExpectedConditions.elementToBeClickable(ele));
ele.click();

	}

}
