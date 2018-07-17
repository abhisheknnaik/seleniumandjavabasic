package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver = new FirefoxDriver();
	        driver.get("http://selenium.googlecode.com/svn/trunk/docs/api/java/index.html");
	        driver.switchTo().frame(driver.findElement(By.name("classFrame")));
	        driver.findElement(By.linkText("Deprecated")).click();
	        driver.close();
		
	}

}
