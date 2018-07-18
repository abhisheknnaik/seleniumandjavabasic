package basicSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowSwitch {
	WebDriver driver;

	@Test
	public void test() throws Exception {
		driver = DriverUtil.getWebDriver(DriverUtil.browserType);

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
				System.out.println("Switched to window :" + currentHandle);
				break;
			}
		}
		System.out.println(driver.getCurrentUrl());
		// Assert.assertEquals(driver.getCurrentUrl(), "http://toolsqa.com/");
		// Closing Pop Up window
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.id("button1")).getText());
		// Close Original window
		driver.quit();
	}
	
	
	
	
	@Test
	public void testSwichToNewTab() throws Exception {
		driver = DriverUtil.getWebDriver(DriverUtil.browserType);

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
		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();

		// Store and Print the name of all the windows open
		Set<String> handles = driver.getWindowHandles();
		System.out.println("All windows :" + handles);

		// Pass a window handle to the other window
		for (String currentHandle : handles) {
			if (!currentHandle.equals(parentWindow)) {
				driver.switchTo().window(currentHandle);
				System.out.println("Switched to window :" + currentHandle);
				break;
			}
		}
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// Assert.assertEquals(driver.getCurrentUrl(), "http://toolsqa.com/");
		// Closing Pop Up window
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.id("button1")).getText());
		// Close Original window
		driver.quit();
	}
}
