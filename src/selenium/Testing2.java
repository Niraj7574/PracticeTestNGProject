package selenium;

import org.testng.annotations.Test;

public class Testing2 {
  @Test (priority = 2)
  public void test1() {
	  System.out.println("test1");
  }
  
  @Test (priority = 1, groups = "smoke")
  public void test2() {
	  System.out.println("test2");
  }
  
}
