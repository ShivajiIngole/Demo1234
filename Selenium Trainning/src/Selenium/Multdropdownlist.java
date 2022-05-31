package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multdropdownlist {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://omayo.blogspot.com/");
		
	WebElement option=	driver.findElement(By.id("multiselect1"));
		Select multi= new Select(option);
		System.out.println (multi.isMultiple());
		List <WebElement> alloption=multi.getOptions();
		System.out.println (alloption.size());
		for (int i=0;i<alloption.size();i++){
			WebElement opt=alloption.get(i);
			String drop= opt.getText();
			System.out.println(drop);
		}
		multi.selectByIndex(0);
		multi.selectByValue("swiftx");
		multi.selectByVisibleText("Hyundai");
		multi.selectByIndex(3);
		
		multi.deselectByIndex(1);
		multi.deselectByValue("swiftx");
		multi.deselectByVisibleText("Hyundai");
multi.deselectAll();
	}

}
