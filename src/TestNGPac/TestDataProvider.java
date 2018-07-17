package TestNGPac;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestDataProvider {
	// data provider from same class
	@Test(dataProvider = "UserData")
	public void testProviderFromSameClass(String un, String ps) {
		System.out.println("User Name " + un + " password " + ps);
	}

	@DataProvider(name = "UserData")
	public Object[][] userNamePass() {
		return new Object[][] { new Object[] { "user1", "password1" },
				new Object[] { "user2", "password2" },
				new Object[] { "user3", "password3" } };
	}

	@DataProvider(name = "threeParameter")
	public Object[][] threeParameter() {
		return new Object[][] { { "user1", "password1", "abc" },
				{ "user2", "password2", "ccc" },
				{ "user3", "password3", "ddd" } };
	}

	@Test(dataProvider = "threeParameter")
	public void test3ProviderFromSameClass(String un, String ps, String otp) {
		System.out
				.println("User Name " + un + " password " + ps + " otp" + otp);
	}

	// use data provider from other class
	@Test(dataProvider = "country", dataProviderClass = DataProviderClass.class)
	public void testProviderFromOtherClass(String countryName) {
		System.out.println("Contry Name : " + countryName);
	}

	// use data provider from other class
	@Test(dataProvider = "language", dataProviderClass = LanguageDataProviderClass.class)
	public void testProviderFromOtherClassLan(String langauage) {
		System.out.println("Language : " + langauage);
	}
}
