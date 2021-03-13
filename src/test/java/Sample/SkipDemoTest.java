package Sample;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {
	
	Boolean datasetup = false;
	@Test(enabled=true)
	public void Skiptest1()
	{
		System.out.println("Skiptest1");
	}
	@Test
	public void Skiptest2()
	{
		System.out.println("Skiptest2");
		throw new SkipException("Skip this test2");
	}
	
	@Test
	public void Skiptest3()
	{
		if(datasetup==true)
		{
			System.out.println("Execute SkipTest3");
		}
		else
		{
		System.out.println("Do not execute Skiptest3");
		throw new SkipException("Skip this test3");
		}
	}
}
