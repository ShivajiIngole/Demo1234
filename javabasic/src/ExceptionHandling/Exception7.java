package ExceptionHandling;

public class Exception7 {

	public static void main(String[] args) throws InterruptedException, UserDefinedException {
		// TODO Auto-generated method stub
setSleep(2000);
checkNumber (-5);
	}
public static void setSleep (long time) throws InterruptedException {
	
		Thread.sleep(time);
	//throw new InterruptedException("time is in milisecond");
}
public static void checkNumber (int num) throws UserDefinedException {
	if (num<0) {
		throw new UserDefinedException ("number is less than zero");
	}
	System.out.println ("Program ends");
}
}
