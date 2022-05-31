package Map;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String filepath = System.getProperty("user.dir") + "\\Shivaji\\Ingole.Properties";
System.out.println("Current dire= "+filepath);
FileInputStream f1= new FileInputStream(filepath);
Properties p1 = new Properties ();
p1.load(f1);
 System.out.println (p1.getProperty("username"));
 System.out.println (p1.getProperty("lastname"));
 System.out.println (p1.getProperty("Mobile"));
 System.out.println (p1.getProperty("emailid"));
	}

}
