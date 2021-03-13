package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsDemo {
	@Test(groups="regression")
	public void atest1()
	{
		System.out.println("test1");
	}
	@Test(groups="smoke")
	public void btest2()
	{
		System.out.println("test2");
	}
	@Test(groups= {"regression","smoke"})
	public void ctest3()
	{
		System.out.println("test3");
		Assert.assertTrue(false);
	}

}
