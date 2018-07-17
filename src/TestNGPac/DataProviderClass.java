package TestNGPac;

import org.testng.annotations.DataProvider;

public class DataProviderClass {


	@DataProvider
	public static Object[][] country() {
		return new Object[][] { { "India" }, { "Australia" }, { "Sri Lanka" } };
	}
}
