package Grid;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridEx {
	WebDriver driver;
	String baseUrl, nodeUrl;

	@BeforeTest
	public void setUp() throws IOException, InterruptedException {

		// set up host by command
		// C:\>java -jar selenium-server-standalone-2.48.2.jar -role hub
		// set up nod by command
		// C:\>java -jar selenium-server-standalone-2.48.2.jar -role webdriver
		// -hub http://192.168.43.185:4444/grid/register -port 5566
		// here 192.168.43.185 is ip address of host
//		Process child = Runtime.getRuntime().exec("cmd /c start hub.bat");
//		child.wait(200000);
//		sleep(50000);
//		Process child1 = Runtime.getRuntime().exec("cmd /c start node.bat");
//		child1.wait(200000);
//		sleep(100000);
		baseUrl = "http://newtours.demoaut.com/";
		nodeUrl = "http://192.168.43.185:5566/wd/hub";// here ip address
														// 192.168.223.1 is ip
														// address of node
		DesiredCapabilities capability = new DesiredCapabilities().firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.VISTA);
		driver = new RemoteWebDriver(new URL(nodeUrl), capability);
	}

	private void sleep(int i) {
		// TODO Auto-generated method stub

	}

	@Test
	public void gridTest() {
		driver.get(baseUrl);
		Assert.assertEquals("Failed to verify title", "Welcome: Mercury Tours",
				driver.getTitle());
	}

	@AfterTest()
	public void afterTest() {
		driver.quit();
	}
}
