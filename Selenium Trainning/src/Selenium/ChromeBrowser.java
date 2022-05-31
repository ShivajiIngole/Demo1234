package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Path1="C:\\Users\\dell\\eclipse-workspace\\Selenium Trainning\\Executable\\chromedriver.exe";
		String Path2 = "./Executable/chromedriver.exe";
		String Path3 = System.getProperty ("user.dir")+"/Executable/chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",Path2);
		
		WebDriver cdriver = new ChromeDriver();
		
		cdriver.get("https://www.google.com/");
	
		String Source=cdriver.getPageSource();
		System.out.println (Source);
		System.out.println (Source.length());
		System.out.println(	cdriver.getTitle());
		System.out.println(cdriver.getCurrentUrl());
		
		if (cdriver.getTitle().equals("Google")) {
			System.out.println ("google search page open succesfully");
		}else {
				System.out.println ("Either google search page not opened or its title got changed");
			}
		}
		
		
		
		
		//cdriver.close();
	}

