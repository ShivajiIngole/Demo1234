package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList ();
		list.add("Shivaji");
		list.add("Yogesh");
		list.add("1234");
		list.add("Ranjana");
		list.add("INgole");
		list.add(new Arraylist1() );
		list.add(null);
		list.add("Shivaji");
				System.out.println (list);
				System.out.println (list.size());
				list.set(1,"Rutuja");
				System.out.println (list);
			for (int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
			System.out.println (".............");
			for (Object obj:list) {
				System.out.println(obj);
			}
			System.out.println ("***********");
			list.forEach(i ->{
				System.out.println (i);
			});
			System.out.println("&&&&&&&&&&&&&&&&&&&&");
			Iterator itr=list.iterator();
			System.out.println (itr.hasNext());
			System.out.println (itr.next());
			System.out.println (itr.next());
			System.out.println (itr.next());
			System.out.println (itr.next());
			System.out.println (itr.next());
			System.out.println (itr.next());
			System.out.println (itr.next());
			System.out.println (itr.next());
		//	System.out.println (itr.next());
			while (itr.hasNext()) {
				System.out.println (itr.next());
			}
			Iterator itr2 =list.iterator();
			while (itr2.hasNext()) {
				System.out.println (itr2.next());
			}
	}

}
