package TestNGPac;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiLanguageTest {
	
	public static final String language="language";
	// data provider is not allowed with beforeTest method
  @BeforeTest// (dataProvider = "language") 
  public void f() {
  }
  
  @Test(dataProvider = language)
  public void test1(String lan)
  {
	  System.out.println(" in test1"+ lan);
  }

  @Test(dataProvider = language)
  public void test2(String lan)
  {
	  System.out.println(" in test2"+ lan);
  }

  
  @DataProvider
	public static Object[][] language() {
		return new Object[][] { { "EN" }, { "DE" }, { "Marathi" } };
	}

  
  
}
