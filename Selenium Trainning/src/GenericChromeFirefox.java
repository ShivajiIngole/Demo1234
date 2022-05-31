import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericChromeFirefox {

	public static void main(String[] args) {
String ChromeBrowser ="./Executable/chromedriver.exe";
	String geckobrowser =".\\Executable\\geckodriver.exe";	
		OpenBrowser (ChromeBrowser,"Chrome");
		OpenBrowser (geckobrowser,"Firefox");
			
	//System.getProperty("webdriver.chrome.driver","./Executable/chromedriver.exe");
	
	//WebDriver chro=new ChromeDriver();
	}
static void OpenBrowser(String driverpath,String browsername) {
	if (browsername.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver",driverpath);
		WebDriver chro=new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver",driverpath);
		WebDriver gecko = new FirefoxDriver();
	}
}
}
