package Systemclass;

public class systemclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(System.getProperty("user.home"));
System.out.println(System.getProperty("user.dir"));
System.clearProperty("user.home");
System.out.println (System.getProperty("user.home"));
System.setProperty("user.country","India");
System.out.println (System.getProperty("user.country"));
	}

}
