package Selenium;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
List <WebElement> links=driver.findElements(By.tagName("a"));
System.out.println (links.size());
List <String > array = new ArrayList( );
for (WebElement element:links) {
	System.out.println(element.getAttribute("href"));
	array.add(element.getAttribute("href"));

}

System.out.println ("get 5 no of link ="+array.get(5));
	}

}
