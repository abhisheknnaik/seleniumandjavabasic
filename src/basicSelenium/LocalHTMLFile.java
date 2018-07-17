package basicSelenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalHTMLFile {

	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "G:\\DemoSite\\OnlineBookingForm.htm";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public enum Month {
		JANUARY, FEBRUARY, March, April, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	}

	@Test
	public void testCalenderDateSelection() throws Exception {
		int expectedDay = 18, expmonth = 12, expYear = 2019;
		driver.get(baseUrl);
		driver.manage().window().maximize();
		// click on calendar button
		driver.findElement(By.id("input_15_pick")).click();
		// get value of selected month and year (eg. August 2016)
		String selectedVal = driver
				.findElement(
						By.xpath("//div[@class='calendar popup'][3]//td[@class='title']"))
				.getText();
		int actualMonth = getMonthNumber(selectedVal.split("\\s+")[0]);
		int actualYear = Integer.parseInt(selectedVal.split("\\s+")[1]);
		// select expected month
		while (actualMonth > expmonth) {
			driver.findElement(
					By.xpath("//div[@class='calendar popup'][3]//td[@class='button previousMonth']"))
					.click();
			selectedVal = driver
					.findElement(
							By.xpath("//div[@class='calendar popup'][3]//td[@class='title']"))
					.getText();
			actualMonth = getMonthNumber(selectedVal.split("\\s+")[0]);
		}
		while (actualMonth < expmonth) {
			driver.findElement(
					By.xpath("//div[@class='calendar popup'][3]//td[@class='button nextMonth']"))
					.click();
			selectedVal = driver
					.findElement(
							By.xpath("//div[@class='calendar popup'][3]//td[@class='title']"))
					.getText();
			actualMonth = getMonthNumber(selectedVal.split("\\s+")[0]);
		}
		// select expected year
		while (actualYear > expYear) {
			driver.findElement(
					By.xpath("//div[@class='calendar popup'][3]//td[@class='button previousYear']"))
					.click();
			selectedVal = driver
					.findElement(
							By.xpath("//div[@class='calendar popup'][3]//td[@class='title']"))
					.getText();
			actualYear = Integer.parseInt(selectedVal.split("\\s+")[1]);
		}

		while (actualYear < expYear) {
			driver.findElement(
					By.xpath("//div[@class='calendar popup'][3]//td[@class='button nextYear']"))
					.click();
			selectedVal = driver
					.findElement(
							By.xpath("//div[@class='calendar popup'][3]//td[@class='title']"))
					.getText();
			actualYear = Integer.parseInt(selectedVal.split("\\s+")[1]);
		}
		// click on expected date
		driver.findElement(
				By.xpath("//div[@class='calendar popup'][3]//td[text()='"
						+ expectedDay + "']")).click();

	}

	@After
	public void tearDown() throws Exception {
		// driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	public static int getMonthNumber(String month) {

		int monthNumber = 0;

		if (month == null) {
			return monthNumber;
		}

		switch (month.toLowerCase()) {
		case "january":
			monthNumber = 1;
			break;
		case "february":
			monthNumber = 2;
			break;
		case "march":
			monthNumber = 3;
			break;
		case "april":
			monthNumber = 4;
			break;
		case "may":
			monthNumber = 5;
			break;
		case "june":
			monthNumber = 6;
			break;
		case "july":
			monthNumber = 7;
			break;
		case "august":
			monthNumber = 8;
			break;
		case "september":
			monthNumber = 9;
			break;
		case "october":
			monthNumber = 10;
			break;
		case "november":
			monthNumber = 11;
			break;
		case "december":
			monthNumber = 12;
			break;
		default:
			monthNumber = 0;
			break;
		}

		return monthNumber;
	}

	@Test
	public void fillValueOnPage() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.findElement(By.id("day_15")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("nextMonth")).click();
		driver.findElement(By.xpath("//td[text()='3']")).click();

		driver.findElement(By.id("first_29")).clear();
		driver.findElement(By.id("first_29")).sendKeys("abhishek");
		driver.findElement(By.id("last_29")).clear();
		driver.findElement(By.id("last_29")).sendKeys("naik");
		driver.findElement(By.id("input_30")).clear();
		driver.findElement(By.id("input_30")).sendKeys(
				"abhishekn.naik@gmail.com");
		driver.findElement(By.id("input_31_area")).clear();
		driver.findElement(By.id("input_31_area")).sendKeys("91");
		driver.findElement(By.id("input_31_phone")).clear();
		driver.findElement(By.id("input_31_phone")).sendKeys("8390567681");
		driver.findElement(By.id("input_15_pick")).click();
		driver.findElement(By.id("input_28_pick")).click();
		driver.findElement(By.id("input_11")).clear();
		driver.findElement(By.id("input_11")).sendKeys("185 old bazaar khadki");
		driver.findElement(By.id("input_12")).clear();
		driver.findElement(By.id("input_12")).sendKeys("delhi");

		driver.findElement(By.id("input_24")).clear();
		driver.findElement(By.id("input_24")).sendKeys("thanks");
		driver.findElement(By.id("input_1")).click();
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}

}
