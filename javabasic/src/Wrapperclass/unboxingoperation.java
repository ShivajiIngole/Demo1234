package Wrapperclass;

public class unboxingoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer refsalary = (30000);//autoboxing
Integer salary = refsalary.intValue();
System.out.println(salary);
System.out.println(salary==refsalary);
System.out.println(salary.equals(refsalary));

	}

}
