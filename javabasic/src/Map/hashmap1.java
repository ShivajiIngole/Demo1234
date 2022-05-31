package Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap <Integer,String> m2=new HashMap<Integer,String>();
m2.put(1,"My");
m2.put(2, "name");
m2.put(3, "is");
m2.put(4,"Shiavji");
m2.put(null, "none");
System.out.println("print all key and value= "+m2);

HashMap <Integer,String> m3=new HashMap<Integer,String>();
m3.put(1, "Ingole");
m3.put(5,"yogesh");
System.out.println("print all key and value= "+m3);
m3.putIfAbsent(3,"hmm");
System.out.println("print all key and value= "+m3);
m2.putAll(m3);
System.out.println("print all key and value= "+m2);
for(Entry<Integer, String> m :m3.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
}

	}

}
