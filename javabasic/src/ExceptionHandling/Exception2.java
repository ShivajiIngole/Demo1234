package ExceptionHandling;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a= 20;
	int b=0;
	int k=a/b;
	System.out.println ("Exception: "+k);
}
catch (ArithmeticException obj ) {
	System.out.println ("Exception Handle:"+ obj);
	//obj.printStackTrace();
	System.out.println (obj.getMessage());
}
finally {
	System.out.println ("finally block is always excecuted");
}
System.out.println ("Program Ends");
	}

}
