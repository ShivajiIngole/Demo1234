package ExceptionHandling;

public class Exception4 {

	public static void main(String[] args) {
		
		try {
			int [] array = new int [5];
			array [5] = 20/0;
			System.out.println ("Exception"+ array[5]);
		}
		catch (Exception e) {
			System.out.println ("Exception handle "+ e);
			//* unreachable code: a block of code which never executes by JVM
		}
		catch (ArithmeticException Ex) {
			System.out.println ("Arithmatic exception Handling"+Ex);		
		}
catch (NullPointerException np) {
	System.out.println ("Nullpointexception exception Handling"+Ex);
}
		System.out.println ("program end");
	}

}
