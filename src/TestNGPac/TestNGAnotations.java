package TestNGPac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnotations {
	String baseUrl = "http://newtours.demoaut.com/";
	String expectedTitle;
	String actualTitle;
	WebDriver driver = new FirefoxDriver();

	@BeforeTest
	public void launchBrowser() {
		driver.get(baseUrl);
		System.out.println("In Before test");
	}

	@BeforeMethod
	public void testHomePageTitle() {
		System.out.println("In Before method");
		expectedTitle= "Welcome: Mercury Tours";
		actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Test
	public void register() {
		System.out.println("In Test 1");
		expectedTitle= "Register: Mercury Tours";
		driver.findElement(By.linkText("REGISTER")).click();
		actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle+"1");
	}

	@Test()
	// (priority =1,enabled=false)
	public void support() {
		System.out.println("In Test 2");
		expectedTitle="Under Construction: Mercury Tours";
		driver.findElement(By.linkText("SUPPORT")).click();
		actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@AfterMethod
	public void goBackToHomePage() {
		System.out.println("In After method");
		driver.findElement(By.linkText("Home")).click();
	}

	@AfterTest
	public void terminateBrowser() {
		System.out.println("In After test");
	}
}
