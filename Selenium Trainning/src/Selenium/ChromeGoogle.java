package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.................
	
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.findElement(By.linkText("Forgot your password?")).click();
driver.navigate().back();
String userDetails=driver.findElement(By.tagName("span")).getText();

//userDetails=userDetails.replace("( Username : ", "");
//userDetails=userDetails.replace(" | Password : ", " ");
//userDetails=userDetails.replace(" )", " ");
System.out.println (userDetails);
//String []LoginDetails=userDetails.split(" ");
//driver.findElement(By.id("txtUsername")).sendKeys(LoginDetails[0]);
//driver.findElement(By.id("txtPassword")).sendKeys(LoginDetails[1]);

String []LoginDetails=userDetails.split(" ");
driver.findElement(By.id("txtUsername")).sendKeys(LoginDetails[3]);
driver.findElement(By.id("txtPassword")).sendKeys(LoginDetails[7]);


driver.findElement(By.id("btnLogin")).click();
System.out.println (driver.getTitle());
WebDriverWait wait =new WebDriverWait(driver,20);
List <WebElement> option = driver.findElements(By.cssSelector("ul#mainMenuFirstLevelUnorderedList>li"));

option.get(2).click();

driver.findElement(By.cssSelector("div>div>div>form>fieldset>ol>li>img.ui-datepicker-trigger")).click();
WebElement opt=driver.findElement(By.cssSelector("div#ui-datepicker-div>table>tbody>tr:nth-of-type(4)>td:nth-of-type(3)"));
wait.until(ExpectedConditions.elementToBeClickable(opt));
opt.click();

driver.findElement(By.xpath("//li[2]/img[@class='ui-datepicker-trigger']")).click();

driver.findElement(By.cssSelector("body>div>table>tbody>*:nth-of-type(3)>*:nth-of-type(4)")).click();
	}

}
