package TestNGPac;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleDependencyTest {
	
	@Test(dependsOnMethods = { "start" })
	public void init() {
		Assert.assertEquals("Google", "hhjj");
		System.out.println("Initializing the data for processing!");
	}

	@Test(dependsOnMethods = { "start", "init" })
	public void process() {
		System.out.println("Processing the data!");
	}

	@Test(dependsOnMethods = { "process" })
	public void stop() {
		System.out.println("Stopping the server");
	}
	
	@Test
	public void start() {
		//Assert.assertEquals("Google", "hhjj");
		System.out.println("Starting the server");
	}

}
