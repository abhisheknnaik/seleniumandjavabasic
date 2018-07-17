package basicSelenium;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NavigationEx {
	WebDriver driver = new FirefoxDriver();
	String url = "http://newtours.demoaut.com/";

	@Test
	public void nevigationTest() throws InterruptedException {
		driver.navigate().to(url);
		driver.manage().window().maximize();

		driver.findElement(By.linkText("REGISTER")).click();
		System.out.println(driver.getCurrentUrl());
		// Navigate Back
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		// Navigate forward
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
	}
}
