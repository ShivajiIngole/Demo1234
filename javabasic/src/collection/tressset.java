package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class tressset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> s1 = new TreeSet<String>();
s1.add("Nishant");
s1.add("Mrunal");
s1.add("Suraj");
s1.add("Nishant");
s1.add("Shivaji");
//s1.add(null);
Iterator <String> itr = s1.iterator();
while (itr.hasNext()) {
	System.out.println(itr.next());
}
System.out.println (".....................");
Iterator itr1 = s1.descendingIterator();
while (itr1.hasNext()) {
	System.out.println(itr1.next());
}
System.out.println("Treefirst element are ="+s1.pollFirst());
System.out.println("TreeSet element are ="+s1);
System.out.println("polllast element are ="+s1.pollLast());
System.out.println("headset element are ="+s1.headSet("Suraj"));
System.out.println("TreeSet element are ="+s1);
System.out.println("subset element are ="+s1.subSet("Mrunal","Shivaji"));
System.out.println("TreeSet element are ="+s1);
System.out.println("TreeSet element are ="+s1.tailSet("Mruanl"));
System.out.println("TreeSet element are ="+s1);

	}

}
