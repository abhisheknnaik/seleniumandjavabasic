package basicSelenium;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot {
	WebDriver driver;
	@Test
	public void screenShotEx() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		getScreenShot();
	}

	public void getScreenShot() throws Exception {
		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		// The below method will save the screen shot in C drive
		String fileName="C:\\screenShot"+getCurrentTimeStamp()+".png";
		FileUtils.copyFile(scrFile, new File(fileName));
	}
	public static String getCurrentTimeStamp() {
	    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd_HHmmss");
	    Date now = new Date();
	    String strDate = sdfDate.format(now);
	    return strDate;
	}
}
