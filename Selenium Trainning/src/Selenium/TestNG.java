package Selenium;

import org.testng.annotations.Test;

public class TestNG {
  @Test(enabled= true)
  public void Test1() {
	  System.out.println ("test1");
	  
  }
  @Test(enabled=true)
  public void Test2() {
	  System.out.println ("test2");
  }
  @Test(enabled=false)
  public void Test3() {
	  System.out.println ("test3");
  }
}
