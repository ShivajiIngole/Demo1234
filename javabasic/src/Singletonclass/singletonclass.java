package Singletonclass;

class singleobject {
	
	private singleobject () {
		System.out.println ("I am constructor of single class");
	}
	static singleobject ref = new singleobject ();
	String name = "ABCD";
	static singleobject singlemethod () {
		return ref;
	}
	void print () {
		System.out.println ("print method am from singleton class");
	}
}


public class singletonclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		singleobject XYZ = singleobject.singlemethod ();
		XYZ.print();
		System.out.println (XYZ.name);
		XYZ.name = "PUNE";
		System.out.println (XYZ.name);
		singleobject ABC = singleobject.singlemethod();
		ABC.name = "TALEGAON";
		System.out.println (ABC.name);
		

		
		
		
	}

}
