package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing3 {
  @Test (priority = 1, groups = "smoke")
  public void createUser() {
	  System.out.println("createUser");
	  Assert.fail();
  }
  
  @Test (priority = 2, dependsOnMethods = "createUser")
  public void modifyUser() {
	  System.out.println("modifyUser");
  }
  
  @Test (priority = 3, dependsOnMethods = "createUser")
  public void deleteUser() {
	  System.out.println("deleteUser");
  }
}
