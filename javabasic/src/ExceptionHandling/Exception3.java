package ExceptionHandling;

import java.util.Scanner;

public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println ("program Start");
Scanner sc =new Scanner(System.in);
try {
	int size = sc.nextInt();
	System.out.println (size);
	
	int array []= new int [size];
	array [5] = 300;
	System.out.println (array [5] );
}
catch (ArithmeticException Art) {
	System.out.println ("Arithmetic Exception Handle "+Art);
}
catch (ArrayIndexOutOfBoundsException e) {
	System.out.println ("Arrayindexoutofbounds Exception Handle "+e);
}
catch (Exception Ex ) {
	System.out.println ("Exception handle "+ Ex);
}
finally {
	System.out.println("I am inside finally block");
	int k=10/0;
	System.out.println("finally block is always executed");
}System.out.println ("Progrm ends");
}

}
}