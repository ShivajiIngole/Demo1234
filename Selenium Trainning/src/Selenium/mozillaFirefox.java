package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mozillaFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// get driver executable path
		String Path1 = "C:\\Users\\dell\\eclipse-workspace\\Selenium Trainning\\Executable\\geckodriver.exe";
		String Path2 = ".\\Executable\\geckodriver.exe";
		String Path3 = System.getProperty("user.dir")+"\\Executable\\geckodriver.exe";
	
		//set driver executable path
		System.setProperty("webdriver.gecko.driver","Executable\\geckodriver.exe");
		
	//	create instance of webdriver (firefox browser)
		FirefoxDriver cdriver = new FirefoxDriver();
	//WebDriver webd = new FirefoxDriver();----->Generic ways 
	}

}
