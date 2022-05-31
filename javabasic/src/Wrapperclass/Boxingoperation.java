package Wrapperclass;

public class Boxingoperation {

	public static void main(String[] args) {
		Boxingoperation ref = new Boxingoperation();
		System.out.println (ref);
		System.out.println (ref.hashCode());
int age =20;

Integer refobj = 30;//implicit or autoboxing 
Integer refobj1 = new Integer (age);

System.out.println (refobj);
System.out.println (refobj1);
System.out.println (age==refobj1);
 

char c1 ='S';
Character chr = 'i';
System.out.println (chr);
 Character chr1 = new Character (c1);
 System.out.println (chr1);
 System.out.println (chr);

	}

}
