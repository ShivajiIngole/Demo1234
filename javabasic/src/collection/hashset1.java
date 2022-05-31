package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class hashset1 {
	public static void main(String[] args) {
		ArrayList <String> list = new  ArrayList<String>();
		list.add("Kiran");
		list.add("Rahul");
		list.add("Rohan");
		list.add("Kiran");
		System.out.println ("list of integer element"+);

		System.out.println ("list the element"+list);
list.removeIf(r1 -> r1.contains("Rahul"));
System.out.println ("list of integer element"+list);

	
		
	HashSet<String>set = new HashSet<String>(list);
	System.out.println("Set the element="+set);
	set.add("SHivaji");
	set.add("Yogesh");
System.out.println(set.size());
	}

}
