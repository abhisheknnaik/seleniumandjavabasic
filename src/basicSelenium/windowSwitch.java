package basicSelenium;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class windowSwitch {
	WebDriver driver;

	@Test
	public void test() {
		driver = new FirefoxDriver();

		// Put an Implicit wait, this means that any search for elements on the
		// page could take the time the implicit wait is set for before throwing
		// exception
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Launch the URL
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
		// Store and Print the name of the First window on the console
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window : " + parentWindow);

		// Click on the Button "New Browser Window"
		driver.findElement(By.id("button1")).click();

		// Store and Print the name of all the windows open
		Set<String> handles = driver.getWindowHandles();
		System.out.println("All windows :" + handles);

		// Pass a window handle to the other window
		for (String currentHandle : handles) {
			if (!currentHandle.equals(parentWindow)) {
				driver.switchTo().window(currentHandle);
				System.out.println("Switched to window :"+ currentHandle);
				break;
			}
		}
Assert.assertEquals(driver.getCurrentUrl(), "http://toolsqa.com/");
		// Closing Pop Up window
		driver.close();

		// Close Original window
		driver.quit();
	}
}
