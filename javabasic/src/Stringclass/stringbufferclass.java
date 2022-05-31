package Stringclass;

import java.nio.ShortBuffer;

public class stringbufferclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer s1 = new StringBuffer ("Hello ");
s1.append("JAVA");
System.out.println (s1);
s1.insert(5, "Pune");
System.out.println (s1);
s1.replace(1, 3, "sss");
System.out.println (s1);
s1.delete(5, 8);
System.out.println (s1);
StringBuffer s2 = new StringBuffer ("pune is called for IT Hub");
s2.reverse();
System.out.println (s2);
System.out.println (s2.capacity());
s2.append("hello moto         ");
System.out.println (s2);
System.out.println (s2.capacity());
	}

}
