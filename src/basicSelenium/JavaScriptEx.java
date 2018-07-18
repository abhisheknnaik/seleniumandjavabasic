package basicSelenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptEx {

	WebDriver driver;
	String URL = "https://www.makemytrip.com/";

	@Before
	public void setUp() throws Exception {
		driver = DriverUtil.getWebDriver(DriverUtil.browserType);
		driver.get(URL);
		driver.manage().window().maximize();
	}

	@Test
	public void scrollingToBottomofAPage() {
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	@Test
	public void scrollingToElementofAPage() {
		driver.navigate().to(URL);
		WebElement element = driver.findElement(By
				.linkText("LOAD MORE"));
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView();", element);
	}

	@After
	public void tearDown() {
		// driver.quit();
	}
}
