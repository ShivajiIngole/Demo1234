package Map;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map m1=new HashMap();
m1.put(1, "Shivaji");
m1.put(2, "Ingole");
m1.put(3,"Mahesh");
m1.put(2, "boss");
m1.put(null, "rahute");
System.out.println("print all key and value= "+m1);
System.out.println("print all key and value"+m1.get(3));
System.out.println("print all key and value= "+m1.keySet());
System.out.println("print all key and value= "+m1.values());
System.out.println("print all key and value= "+m1.remove(2));
System.out.println("print all key and value= "+m1.replace(3, "raut"));
System.out.println("print all key and value= "+m1.replace(1, "the"));
System.out.println("print all key and value= "+m1);
	}

}
