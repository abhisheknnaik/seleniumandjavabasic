package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class BrowserOptions {
	//@Test
	public void incognitoMode() {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				"G:/Selenium All in one/drivers/chromedriver_win32/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(dc);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void cleanCache()
	{
		WebDriver driver = null;
		System.setProperty("webdriver.ie.driver",
				"G:/Selenium All in one/drivers/IEDriverServer_Win32_3.8.0/IEDriverServer.exe");
		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();	
		dc.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		driver = new InternetExplorerDriver(dc);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	}
}
