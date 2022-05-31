package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list1 = new ArrayList ();
System.out.println (list1);

list1.add("Pune");
list1.add("Mumbai");
list1.add("3463");
list1.add("Maharashtra");
list1.add("Kolkata");
list1.add("null");
System.out.println (list1);
System.out.println ("...............");
for (Object obj:list1) {
	System.out.println (obj);
}
System.out.println ("********");
list1.forEach(shiv -> {
	System.out.println (shiv);
});
System.out.println ("%%%%%%%%%%%%");
Iterator itr = list1.iterator();
while (itr.hasNext()) {
	System.out.println (itr.next());
}
Collections.sort(list1);
System.out.println (list1);
System.out.println (list1.size());
ArrayList a12 = new ArrayList();

a12.add("Goa");
a12.add("talegaon");
list1.addAll(2,a12);
System.out.println (list1);
System.out.println (a12.size());
	}

}
