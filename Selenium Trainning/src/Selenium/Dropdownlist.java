package Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement drop=driver.findElement(By.id("Skills"));
		
		Select dropdown = new Select(drop);
		System.out.println(dropdown.isMultiple());
		dropdown.selectByIndex(3);
	//	dropdown.
	    dropdown.selectByValue("Backup Management");
		dropdown.selectByVisibleText("Android");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		System.out.println (dropdown.getOptions().size());
		
		List<WebElement> option =dropdown.getOptions();
		System.out.println (option.size());
List<String> actualList = new ArrayList<String>();
		for (int i=0;i<option.size();i++) {
			
			//System.out.println (option.get(i).getText());
			actualList.add(dropdown.getOptions().get(i).getText());
		}
		System.out.println (" Actual list"+actualList);
		List<String>DupliList = new ArrayList<String>();
		DupliList.addAll(actualList);
		Collections.sort(DupliList);
		System.out.println ("After Sorting Duplicate list"+DupliList);
		
		System.out.println ("validate list is sort or not= "+DupliList.equals(actualList));
		
		
	}

}
