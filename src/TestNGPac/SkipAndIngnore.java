package TestNGPac;

import org.testng.SkipException;
import org.testng.annotations.Test;
// ref http://www.seleniumeasy.com/testng-tutorials/skip-test-in-testng
public class SkipAndIngnore {
	@Test(enabled = false)
	public void testCaseEnabling() {
		System.out.println("I'm Not Ready, please don't execute me");
	}

	@Test
	public void testCaseSkipException() {
		System.out.println("Im in skip exception");
		throw new SkipException("Skipping this exception");
	}

	@Test
	public void testCaseConditionalSkipException() {
		Boolean DataAvailable = false;
		System.out.println("Im in Conditional Skip");
		if (!DataAvailable)
			throw new SkipException("Skipping this exception");
		System.out.println("Executed Successfully");
	}
}
