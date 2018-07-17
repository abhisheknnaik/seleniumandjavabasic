package TestNGPac;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReRunSingleFailedScript {
	// Ref : http://toolsqa.com/selenium-webdriver/retry-failed-tests-testng/
	// bellow test will execute 5 time ,1 normal and 4 retry 
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}

	// following test will only execute once as it is not retried
	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}
}
