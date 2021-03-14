package Sample;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyTest {
	@Test
	public void UserRegisteration() {	
		System.out.println("This is for Registeration");
	}
	@Test(dependsOnMethods = "UserRegisteration",alwaysRun=true)
	public void UserSearch() {	
		System.out.println("This is for Search");
	}

}
