package DemoSite;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestMakaMytrip {

	/**
	 * @param args
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public static void main(String[] args) throws InterruptedException,
			IOException {
		// Create a new instance of the Firefox driver
		// String abc="abhishek";
		// System.out.println(abc.charAt(0));
		// System.out.println(abc.charAt(4));

		setBrowserLanguage();

	}

	public static void remoteExecuion() throws IOException {

		URL url = new URL("http", "localhost", 4444, "/wd/hub");

		DesiredCapabilities capabilities = DesiredCapabilities
				.internetExplorer();

		System.out.println("1");

		capabilities.setJavascriptEnabled(true);

		System.out.println("2");

		WebDriver driver = new RemoteWebDriver(url, capabilities);

		System.out.println("4");

		driver.get("http://www.google.com");

		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);

	FileUtils.copyFile(scrFile, new File(
				"c:\\googlesearch-webdriverapi.png"));

		driver.quit();
	}

	public static void login() throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		// -----------------
		// login to make my trip
		// -----------------
		driver.get("http://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ssologinlink")).click();
		driver.findElement(By.id("username")).sendKeys(
				"abhishek.naik@gmail.com");
		driver.findElement(By.id("password_text")).sendKeys("Abhi");
		driver.findElement(By.id("login_btn")).click();
		Thread.sleep(1000);

		String msg = driver.findElement(
				By.xpath("//span[@style='']//span[@id='errormsg_password']"))
				.getText();
		if (msg.equals("The password should be minimum of 6 characters.")) {
			System.out.println("Sucessfully verified msg " + msg);
		} else {
			System.out.print("Fail to verify ");
		}
		driver.findElement(By.id("password")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Abhieshe");
		driver.findElement(By.id("login_btn")).click();

		msg = driver
				.findElement(
						By.xpath("//span[@id='unregistered_email_span']/span[@id='errormsg_password']"))
				.getText();
		if (msg.contains("EMail-ID not registered.")) {
			System.out.println("Sucessfully verified msg " + msg);
		} else {
			System.out.print("Fail to verify ");
		}
	}

	public static void bookTicket() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		// -----------------
		// Book flight
		// -----------------

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// And now use this to visit Google
		driver.get("http://www.makemytrip.com/");
		driver.manage().window().maximize();

		// Click on InterNational tab
		driver.findElement(By.xpath("//span[text()='International']")).click();
		Thread.sleep(5000);
		// Set from
		// from.
		// driver.findElement(By.id("from")).sendKeys("Mumbai, India (BOM)");
		driver.findElement(
				By.xpath("//div[contains(@class,'from_field_city')]//a"))
				.click();
		driver.findElement(By.linkText("Mumbai, India (BOM)")).click();

		// "//div[contains(@class,'from_field_city')]/span[@class='ui-combobox lightTxt']//input"));//.sendKeys("Mumbai, India (BOM)");
		// JavascriptExecutor executor= (JavascriptExecutor)driver;
		// executor.executeScript("arguments[0].value=arguments[1];",
		// from,"Mumbai, India (BOM)");

		// Select sc=new Select(from);
		// sc.selectByVisibleText("Mumbai, India (BOM)");
		Thread.sleep(3000);
		// Set To
		WebElement to = driver
				.findElement(By
						.xpath("//div[contains(@class,'flL span4 field_info make_relative')]//a"));
		to.click();
		driver.findElement(By.linkText("New Delhi, India (DEL)")).click();

		Thread.sleep(1000);
		// click on Search button
		driver.findElement(By.name("submit_name")).click();
		// click on search flight
		driver.findElement(
				By.xpath("//div[@class='grenBttn' and text()='Search Flight']"))
				.click();
		// Count no of available flight
		List<WebElement> flightList = driver.findElements(By
				.xpath("//a[text()='Book']"));
		System.out.print("Total No available of Flight " + flightList.size());
		flightList.get(2).click();
		// Close the browser
		// driver.close();
		driver.quit();
	}

	public static void dragAndDrop() {

		WebDriver driver = new FirefoxDriver();
		// -----------------
		// drag and drop
		// -----------------
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		WebElement draggable = driver.findElement(By
				.xpath("//*[@id='draggable']"));
		WebElement droppable = driver.findElement(By
				.xpath("//*[@id='droppable']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(draggable, droppable).perform();

	}

	public static void setBrowserLanguage() {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("intl.accept_languages", "ja");
		profile.setAcceptUntrustedCertificates(true);

		WebDriver driver =new FirefoxDriver();// new FirefoxDriver(profile);
		driver.get("http://www.makemytrip.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// get browser name
		System.out.println(js.executeScript("return navigator.appCodeName"));
		System.out.println(js.executeScript("return navigator.userAgent;"));
		driver.quit();
	}

}
