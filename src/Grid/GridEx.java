package Grid;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
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
		nodeUrl = "http://10.20.228.39:5566/wd/hub";// here ip address
														// 192.168.223.1 is ip
														// address of node
		//DesiredCapabilities capability = new DesiredCapabilities().firefox();
		
		
//		System.setProperty("webdriver.gecko.driver",
//				"D:\\Java\\MySeleniumProjectAllInOne\\drivers\\geckodriver.exe");
		// C:\\Users\\an00542992\\AppData\\Local\\Mozilla
		// Firefox\\firefox.exe
	/*	File pathBinary = new File("C:\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		FirefoxOptions options = new FirefoxOptions();
		capability.setCapability(FirefoxOptions.FIREFOX_OPTIONS,
				options.setBinary(firefoxBinary));
		capability.setAcceptInsecureCerts(true);
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.WIN8_1);
		//driver = new FirefoxDriver(options);
		*/
	
		System.setProperty("webdriver.ie.driver",
				"D:\\Java\\MySeleniumProjectAllInOne\\drivers\\IEDriverServer.exe");
		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();

		cap.setCapability(
				InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
				true);
		cap.setCapability("ignoreProtectedModeSettings", true);
		cap.setCapability("initialBrowserUrl", "www.google.co.in");
		cap.setCapability("InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION",
				true);
		cap.setCapability("ignoreZoomSetting", true);
		cap.setAcceptInsecureCerts(true);
	//	cap.setBrowserName("internet explorer");
		cap.setPlatform(Platform.WIN8_1);
		driver = new RemoteWebDriver(new URL(nodeUrl), cap);
		driver.get(baseUrl);
		Assert.assertEquals("Failed to verify title", "Welcome: Mercury Tours",
				driver.getTitle());
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
