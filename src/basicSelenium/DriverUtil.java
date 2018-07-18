package basicSelenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverUtil {

	static WebDriver driver;
	//chrome ie firefox
	static String browserType = "firefox";

	static WebDriver getWebDriver(String browser) throws Exception {
		// Check if parameter passed from TestNG is 'firefox'
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Java\\MySeleniumProjectAllInOne\\drivers\\geckodriver.exe");
			// C:\\Users\\an00542992\\AppData\\Local\\Mozilla
			// Firefox\\firefox.exe
			File pathBinary = new File("C:\\Mozilla Firefox\\firefox.exe");
			FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
			DesiredCapabilities desired = DesiredCapabilities.firefox();
			FirefoxOptions options = new FirefoxOptions();
			desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS,
					options.setBinary(firefoxBinary));
			driver = new FirefoxDriver(options);

		}
		if (browser.equalsIgnoreCase("ie")) {
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
//			// cap.setProxy(p);
//			 InternetExplorerOptions options = new InternetExplorerOptions();
//			// cap.setCapability(InternetExplorerOptions.,
//			// options.setBinary(firefoxBinary));
//			options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
//					true);
//			options.setCapability("ignoreProtectedModeSettings", true);
//	//		options.setCapability("initialBrowserUrl", "www.google.co.in");
//			options.setCapability("InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION",
//					true);
//			options.setCapability("ignoreZoomSetting", true);
			// with options IE driver is not working ,it is working with capabilities only
			driver = new InternetExplorerDriver(cap);
		}
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions chromeOptions = new ChromeOptions();

			// String userhome = "an00542992";// Advapi32Util.getUserName(); //
			// System.getProperty("user.home");
			// chromeOptions.setBinary("C:\\Users\\" + userhome
			// + "\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
			System.setProperty("webdriver.chrome.driver",
					"D:\\Java\\MySeleniumProjectAllInOne\\drivers\\\\chromedriver.exe");

			chromeOptions.setBinary("C:\\PortableChrome\\chrome.exe");
			chromeOptions.addArguments("--incognito");
			driver = new ChromeDriver(chromeOptions);
		}
		return driver;
	}
}
