package Systemclass;

class training {
	void method () {
		System.out.println(" I am from method");
	}
	void manualTesting () {
		System.out.println("I am from manual testing");
	}
	void Automation () {
		System.out.println ("I am from Automation");
	}
}



public class Systemclass1 {
static training t1 = new training ();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Systemclass1.t1.method();
Systemclass1.t1.manualTesting();

training  s1 = new training ();
s1.method();

	}

}
