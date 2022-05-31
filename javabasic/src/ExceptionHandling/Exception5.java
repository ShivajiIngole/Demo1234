package ExceptionHandling;

public class Exception5 {

	public static void excpetionhandling(int age) throws  ArithmeticException{
		
		if (age<18) {
			
			throw new ArithmeticException ("Person is not eligible to vote");
			
		}
		else {
			System.out.println ("Person is eligible for voting");
		}
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	excpetionhandling(19);
	try {
		excpetionhandling(19);
	}
	catch (ArithmeticException arth) {
		System.out.println ("Exception Handle"+ arth);
	}
	System.out.println ("program ends");
	
	}

}
