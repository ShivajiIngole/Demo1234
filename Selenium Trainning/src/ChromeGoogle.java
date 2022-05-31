
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Path2 = "./Executable/chromedriver.exe";
System.setProperty("Webdriver.chrome.driver",Path2);

WebDriver driver = new ChromeDriver();

	}

}
