package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleOption1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");

		WebDriver chrom=new ChromeDriver();

		chrom.get("https://www.gsmarena.com/");
		
		chrom.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		List<WebElement> AllOption=chrom.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
		
		chrom.manage().window().maximize();
		
		System.out.println (AllOption.size());
		
		for (int i=0;i<AllOption.size();i++) {
			WebElement option = AllOption.get(i);
			String Mobilename = option.getText();
			System.out.println (Mobilename);
			
		}
		WebElement samsung=chrom.findElement(By.cssSelector(".brandmenu-v2>ul>li>a:nth-of-type(1)"));
		WebDriverWait wait = new WebDriverWait(chrom,20);
		wait.until(ExpectedConditions.elementToBeClickable(samsung));
	samsung.click();

	List<WebElement> AllSamsung=chrom.findElements(By.cssSelector(".makers>ul>li>a>strong>span"));
	
	System.out.println (AllSamsung.size());
	for (int j=0;j<AllSamsung.size();j++) {
		WebElement SamsungMoblie= AllSamsung.get(j);
		String SamsungName= SamsungMoblie.getText();
		System.out.println (SamsungName);
	}
//	wait.until(ExpectedConditions.elementToBeClickable(option));
	chrom.navigate().back();
	List <WebElement> option=chrom.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));

	for(int j=0;j<option.size();j++) {
		wait.until(ExpectedConditions.elementToBeClickable(option.get(j)));
		option.get(j).click();
		System.out.println (chrom.getCurrentUrl());
		Thread.sleep(2000);
		chrom.navigate().back();
		chrom.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
		
	}
	
	
	
	
	}

}
