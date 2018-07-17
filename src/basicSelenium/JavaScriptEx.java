package basicSelenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptEx {

	WebDriver driver;
	String URL = "https://www.linkedin.com/";
	
	@Before 
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get(URL);
		driver.manage().window().maximize();
	}
	@Test
	public void scrollingToBottomofAPage() {
JavascriptExecutor executer=(JavascriptExecutor)driver;
executer.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	@Test
	public void scrollingToElementofAPage() {
		driver.navigate().to(URL+"directory/people-h/");
		WebElement element = driver.findElement(By.linkText("Heba El-bohy - Hector Nandin"));
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
	}
	
	@After
	public void tearDown()
	{
		//driver.quit();
	}
}
