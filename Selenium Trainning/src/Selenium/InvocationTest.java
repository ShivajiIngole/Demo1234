package Selenium;

import org.testng.annotations.Test;

public class InvocationTest {
  @Test(invocationCount=5)
  public void invocation() {
	  System.out.println ("hi i am from invocationtest class");
	  
	  
  }
  
  @Test (priority=1)
  public void Test1() {
	  System.out.println ("test1");
  }
  @Test(priority=2)
  public void Test2() {
	  System.out.println ("test2");
  }
  @Test(priority=3)
  public void Test3() {
	  System.out.println ("test3");
  }
}
