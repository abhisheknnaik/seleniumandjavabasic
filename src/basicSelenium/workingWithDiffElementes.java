package basicSelenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class workingWithDiffElementes {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = DriverUtil.getWebDriver(DriverUtil.browserType);
		// TODO Auto-generated method stub
		// checkMultiChkBox();
		selectExample();

	}

	public static void checkMultiChkBox() throws InterruptedException {
		// WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/Html/tryit.asp?filename=tryhtml_checkbox");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		List<WebElement> elm = driver.findElements(By
				.xpath("//input[@type='checkbox']"));
		List<String> lst = new ArrayList<String>();
		lst.add("Bike");
		lst.add("Car");
		System.out.println("Size" + elm.size());
		for (WebElement el : elm) {
			System.out.println(el.getAttribute("value").toString());
			if (lst.contains(el.getAttribute("value").toString())) {

				el.click();
			}
		}

	}

	public static void selectExample() throws InterruptedException {
		String baseUrl = "http://newtours.demoaut.com/";
		String expectedTitle = "Welcome: Mercury Tours", actualTitle;
		driver.get(baseUrl);
		actualTitle = driver.getTitle();

		if (!expectedTitle.equals(actualTitle)) {
			System.out.println("Failed to verify title");
		}

		else {
			System.out.println("Successfully verified title");
		}
		// input text
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		// click on button
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		// select radio button
		driver.findElement(By.xpath("//input[@name='tripType'][2]")).click();

		// select by value
		Select select = new Select(driver.findElement(By.name("passCount")));
		select.selectByValue("2");

		// select by visible text
		Select selectFrom = new Select(driver.findElement(By.name("fromPort")));
		selectFrom.selectByVisibleText("Frankfurt");

		// Select by index 0 base index
		Select selectTo = new Select(driver.findElement(By.name("toPort")));
		selectTo.selectByIndex(2);

		// click on button
		driver.findElement(By.name("findFlights")).click();
		Thread.sleep(1000);
		// Click on Link
		driver.findElement(By.linkText("Home")).click();
		System.out.println("End");
		// close driver
		driver.close();
	}
}
