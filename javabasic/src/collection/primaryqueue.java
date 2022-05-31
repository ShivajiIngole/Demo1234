package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class primaryqueue {

	public static void main(String[] args) {

		PriorityQueue<String> queue = new <String>PriorityQueue();
		System.out.println ("list the element"+queue.isEmpty());

		queue.add("ABCD");
		queue.add("XYZ");
		queue.add("MNOP");
		queue.add("ABCD");
		queue.add ("SHIVAJI");
		System.out.println ("list the element"+queue);
		System.out.println ("list the no of element ="+queue.size());
		PriorityQueue <String>que = new <String>PriorityQueue();
		que.add("NEW");
		que.add("Pune");
		que.add("1234");
		System.out.println ("list the element"+que);
		queue.addAll(que);
		System.out.println ("list the element"+queue);
         queue.add("Yogesh");
System.out.println ("list the element"+queue);

System.out.println ("list the element="+queue.hashCode());
System.out.println ("list the element="+queue.toString());
System.out.println ("list the element"+queue.element());
System.out.println ("list the element"+queue.isEmpty());
System.out.println ("list the element"+queue.iterator());
System.out.println ("list the element"+queue.peek());
System.out.println ("list the element"+queue.poll());
System.out.println ("list the element"+queue.remove("XYZ"));

queue.removeIf(r1 -> r1.contains("SHIVAJI"));
System.out.println ("list the element"+queue);
Iterator itr = queue.iterator();
while (itr.hasNext()) {
	System.out.println ("list the element"+itr.next());
System.out.println("............................");
queue.forEach(obj -> {
	System.out.println (obj);
});
}






	}
}
