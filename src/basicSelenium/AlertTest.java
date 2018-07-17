package basicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("G:\\DemoSite\\alertDemo.html");
		driver.findElement(By.id("tryBtn")).click();

		// switch to alert
		Alert alert = driver.switchTo().alert();
		// get alert text
		System.out.println(alert.getText());

		alert.accept();
		System.out.println(driver.findElement(By.id("label")).getText());
		driver.findElement(By.id("tryBtn")).click();
		// switch to alert
		alert = driver.switchTo().alert();

		alert.dismiss();
		System.out.println(driver.findElement(By.id("label")).getText());
		driver.close();
	}
}
// driver.get("http://jsbin.com/usidix/1");
// driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
// switch to alert
// Alert alert = driver.switchTo().alert();
// get alert text
// System.out.println(alert.getText());
