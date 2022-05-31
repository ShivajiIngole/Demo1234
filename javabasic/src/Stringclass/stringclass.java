package Stringclass;

public class stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
stringclass s1 = new stringclass ();
System.out.println (s1.toString());
 String s2 = "ABCDEF";
 String s3 ="ABCDEF";
 String s4 = "Pune";
 
 System.out.println (s2);
 System.out.println (s3);
 System.out.println (s4);
 System.out.println (s2.hashCode());
 System.out.println (s2.length());
 System.out.println (s3.length());
 System.out.println (s4.length());
 System.out.println (s2.equals(s3));
 System.out.println(s2==s3);
 System.out.println (s3.equals(s4));
 System.out.println(s3==s4);
 
 String s5 = new String ("Mumbai");
 System.out.println (s5);
 System.out.println (s2.equals(s5));
 System.out.println (s2==s5);
 

}
	}


