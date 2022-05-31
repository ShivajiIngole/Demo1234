package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	driver.findElement(By.id("loginButton")).click();
	WebDriverWait wait = new WebDriverWait (driver,30);
	
	WebElement task=driver.findElement(By.id("container_tasks"));
	wait.until(ExpectedConditions.elementToBeClickable(task));
	task.click();
	driver.findElement(By.cssSelector(".plusIcon")).click();
	
	WebElement newtask=driver.findElement(By.cssSelector("div[class='item createNewTasks']"));
	wait.until(ExpectedConditions.elementToBeClickable(newtask));
	newtask.click();
	
	//WebElement new1=driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[1]/div[1]"));
	//wait.until(ExpectedConditions.elementToBeClickable(new1));
	//new1.click();

	//WebElement new2=driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[2]/div/div[1]/div/div[5]\r\n" 
		//	));
	//wait.until(ExpectedConditions.elementToBeClickable(new2));
	//new1.click();
	Thread.sleep(2000);
	
	//WebElement option=driver.findElement(By.xpath("//div[@class='searchItemList']/div[2]"));
	//driver.findElement(By.cssSelector("div[class='searchItemList']>div:nth-child(4)")).click();
	//wait.until(ExpectedConditions.elementToBeClickable(option));
	//option.click();
	
	//WebElement OpenOption=driver.findElement(By.xpath("//div[@class='selectCustomerAndProject']//tr[@class='selectCustomerRow']//div[@class='dropdownButton']"));
	//wait.until(ExpectedConditions.elementToBeClickable(OpenOption));
//	OpenOption.click();
	
	//List<WebElement> AllOpen = driver.findElements(By.xpath("//tr[@class='selectCustomerRow']//div[@class='scrollableDropdownView']/div/div/div/div"));
//int All=AllOpen.size();
		
				//wait.until(ExpectedConditions.elementToBeClickable(AllOpen.get(3)));
				//AllOpen.get(3).click();
				//AllOpen.get(3).click();
				driver.findElement(By.xpath("//tr/td/input[@class='inputFieldWithPlaceholder']")).sendKeys("MyProject");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//table[@class='createTasksTable']//tr/td[3]/input[1][@maxlength='6']")).sendKeys("30");
				Thread.sleep(2000);
				WebElement web=driver.findElement(By.xpath("//table[@class='createTasksTable']//tr/td[4]"));
				web.click();
				Thread.sleep(2000);
				web.sendKeys(Keys.END);
				Thread.sleep(2000);
				//driver.findElement(By.id("ext-gen188")).click();
				
			/*	driver.findElement(By.xpath("//table[@id='ext-gen257']//tr[3]/td[@class='x-date-mp-month']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//table[@id='ext-gen257']//tr[2]/td/a[text()='2023']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//tr[1]/td[@class='billingTypeCell']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//tr[1]/td[@class='billingTypeCell']//div[@class='typeOfWorkList']/div[11]")).click();
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("div.commitButtonPlaceHolder")).click();
			*/
				//driver.findElement(By.xpath("//button[starts-with(@id,'ext-gen')][contains(text(),'OK')]")).click();
				
				driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();
				
				
			}
		}
		
		
	
	
	

