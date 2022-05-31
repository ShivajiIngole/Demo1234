package collection;

import java.util.ArrayList;

public class Arraylist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> ref= new ArrayList<Integer> ();
System.out.println ("list of integer element"+ref);
ref.add(12);
ref.add(null);
ref.add(24);
ref.add(46);
System.out.println ("list of integer element"+ref);
ref.remove(1);
System.out.println ("list of integer element"+ref);
if(ref.contains(24)) {
	ref.remove(24);
}
System.out.println ("list of integer element"+ref);
//ref.removeIf(r1 -> r1.contains(24));

	}

}
