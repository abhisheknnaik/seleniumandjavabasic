package TestNGPac;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestXMLParameters {
	// Using xml for paremeter TestNGParamter.xml
	@Parameters({"browser"})
  @Test
  public void oneParemeter(String browser) {
		System.out.println("Browser is "+browser);
  }
	
	@Parameters({"userName","password"})
	  @Test
	  public void twoParemeters(String user,String pass) {
			System.out.println("UserName  is "+user+" pass is "+ pass);
	  }
}
