package Selenium;

import org.testng.annotations.Test;

public class TestNG1 {
  @Test(dependsOnMethods="Test3",enabled=true)
  public void Test1() {
	  System.out.println ("Test1");
	  
  }
  @Test(dependsOnMethods="Test1",enabled=true)
  public void Test2() {
	  System.out.println ("Test2");
  }
  @Test(enabled=true,expectedExceptions= ArithmeticException.class)
  public void Test3() {
	  System.out.println ("Test3");
	  int i=10/0;
  }
}
