package basicSelenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverUtil {

	static WebDriver driver;

	static WebDriver getWebDriver(String browser) throws Exception {
		// Check if parameter passed from TestNG is 'firefox'
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"\\src\\dirvers\\geckodriver.exe");
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
		return driver;
	}
}
