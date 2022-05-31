package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
driver.get("https://demoblaze.com/");

List<WebElement> Alloption=driver.findElements(By.cssSelector(".list-group>a"));

System.out.println (Alloption.size());

List<String> Option =new ArrayList <String> ();
Option.add("CATEGORIES");
Option.add("Phones");
Option.add("Laptops");
Option.add("Monitors");

for (int i=0;i<Alloption.size();i++) {
	WebElement opt= Alloption.get(i);
	System.out.println (opt.getText());
	System.out.println (opt.isDisplayed());
	System.out.println (opt.isEnabled());
	System.out.println (opt.getText().equals(Option.get(i)));
}

WebElement categories = driver.findElement(By.xpath("//a[text()='CATEGORIES']"));
categories.click();
WebElement categ = driver.findElement(By.xpath("//a[contains(@id,'itemc')]"));
categ.click();




	}

}
