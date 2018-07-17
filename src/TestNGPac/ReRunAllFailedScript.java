package TestNGPac;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReRunAllFailedScript {
	// Ref : http://toolsqa.com/selenium-webdriver/retry-failed-tests-testng/
	//  Run this with testngRerun.xml all failing test will run 5 time 
	@Test
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}

	
	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test3()
	{
		Assert.assertEquals(true, true);
	}
}
