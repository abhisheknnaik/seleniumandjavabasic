package TestNGPac;

import org.testng.annotations.DataProvider;

public class LanguageDataProviderClass {

	
	@DataProvider
	public static Object[][] language() {
		return new Object[][] { { "EN" }, { "DE" }, { "AUS" } };
	}
}
