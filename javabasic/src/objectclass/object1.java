package objectclass;

class object {
	void display() {
		System.out.println ("i am display ()");
	}
}

public class object1 extends object {
	static int rollno =34;
	int salaray;
	object1 (){
		salaray = rollno;
		rollno++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
object1 s1 = new object1();
System.out.println(s1);
System.out.println(s1.toString());
System.out.println(s1.hashCode());
object a1 = new object ();
System.out.println(a1);
System.out.println(a1.toString());
System.out.println(a1.hashCode());
System.out.println(s1.equals(a1));

	}

}
