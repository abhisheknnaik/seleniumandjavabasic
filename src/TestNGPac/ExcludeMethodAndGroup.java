package TestNGPac;

import org.testng.annotations.Test;

public class ExcludeMethodAndGroup {
	@Test
	public void addLocationTestCase() {
		System.out.println("Im in add location test case");
	}

	@Test
	public void addDepartmentTestCase() {
		System.out.println("Im in add department test case");
	}

	@Test
	public void addEmployeeTestCase() {
		System.out.println("Im in add employee test case");
	}
	
	@Test(groups="excludeTest")
	public void excludeGroup() {
		System.out.println("Im in add employee test case");
	}
}
