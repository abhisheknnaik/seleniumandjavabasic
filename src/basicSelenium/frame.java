package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class frame {

	public static void main(String[] args) throws Exception {

		WebDriver driver = DriverUtil.getWebDriver(DriverUtil.browserType);
		driver.manage().window().maximize();
		driver.get("http://selenium.googlecode.com/svn/trunk/docs/api/java/index.html");
		driver.switchTo().frame(driver.findElement(By.name("classFrame")));
		driver.findElement(By.linkText("Deprecated")).click();
		driver.close();

	}

}
