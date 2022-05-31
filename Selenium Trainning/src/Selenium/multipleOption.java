package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleOption {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");

		WebDriver chrom=new ChromeDriver();

		chrom.get("https://www.flipkart.com/");
		
		chrom.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		List<WebElement> Alloption=chrom.findElements(By.cssSelector("div._37M3Pb>div"));
		
		System.out.println(Alloption.size());
		for(int i=0;i<Alloption.size();i++) {
			WebElement element= Alloption.get(i);
			System.out.println (element.getText());
		}
		
		
	}

}
