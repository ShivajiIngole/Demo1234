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
	}

}
