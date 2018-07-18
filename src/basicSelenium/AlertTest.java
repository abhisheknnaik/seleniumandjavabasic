package basicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = DriverUtil.getWebDriver(DriverUtil.browserType);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));

		driver.findElement(By.tagName("button")).click();
		Thread.sleep(1000);
		// switch to alert
		Alert alert = driver.switchTo().alert();
		// get alert text
		System.out.println("Alert text : " + alert.getText());
		// alert dismiss
		alert.dismiss();

		System.out.println(driver.findElement(By.id("demo")).getText());
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(1000);
		// switch to alert
		alert = driver.switchTo().alert();
		alert.sendKeys("Abhishek");
		// alert accept
		alert.accept();

		System.out.println(driver.findElement(By.id("demo")).getText());
		driver.close();
	}
}
