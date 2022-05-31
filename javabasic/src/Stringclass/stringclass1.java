package Stringclass;

import java.util.Scanner;

import javax.swing.Spring;

public class stringclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1 = "WELCOMEPUNE";
char c = str1.charAt(0);
System.out.println (c);
for (int i=0;i<str1.length();i++) {
	char c1=str1.charAt(i);
	System.out.println (c1);
	
}
System.out.println ("...................");
for (int i=str1.length()-1;i>=0;i--) {
//System.out.print (str1.length());
	System.out.println (str1.charAt(i));	
}
System.out.println ("...................");
String temp = "";
for (int i = str1.length()-1;i>=0;i--) {
	temp= temp+str1.charAt(i);
	System.out.println (temp);
	
}
System.out.println ("...................");
System.out.println (str1);
System.out.println (temp);
System.out.println ("...................");
System.out.println (reverseString ("PUNE"));
Scanner scn = new Scanner (System.in)	;
String s2 ;
s2 = scn.next();
System.out.println (reverseString(s2));
String s3;
s3=scn.next();
palinString (s3);
	}

	 static String reverseString (String str2) {
		// TODO Auto-generated method stub
		 String temp ="";
		for (int i=0;i<str2.length();i++) {
			temp = temp + str2.charAt (i);
			//System.out.println (str2.charAt(i));
		}
		return temp;
		
	}
	static void palinString (String str) {
		String s1 = str;
		String temp ="";
		for (int i = str.length()-1;i>=0;i--) {
			temp =temp+ str.charAt (i);
			
		}
		if (temp.equals(s1)) {
			System.out.println("Given string is a palindrome..." + str);
		} else {
			System.out.println("Given string is not a palindrome..." + str);
		}
		
	}



}
