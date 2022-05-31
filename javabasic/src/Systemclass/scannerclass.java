package Systemclass;

import java.util.Scanner;

public class scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "hello, This is basic java";
Scanner Scan = new Scanner (s);
System.out.println("Boolean Result: " + Scan.hasNext());
//Print the string
		System.out.println("String: " + Scan.nextLine());
		Scan.close();
		System.out.println("--------Enter Your Details-------- ");
		Scanner in = new Scanner (System.in);
		System.out.println("Enter your name: ");
		String name = in.next();
		System.out.println("Name: " + name);
		System.out.print("Enter your age: ");
		int i = in.nextInt();
		System.out.println("Age: " + i);
		System.out.print("Enter your salary: ");
		double d = in.nextDouble();
		System.out.println("Salary: " + d);
		in.close();
	}

}
