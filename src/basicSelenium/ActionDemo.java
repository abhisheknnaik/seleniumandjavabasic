package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionDemo {
	@Test
	public void dragAndDrop() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
	}

	//@Test
	public void mouserOver() throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://store.demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		WebElement productCategoryLink = driver.findElement(By
				.linkText("Product Category"));
		action.moveToElement(productCategoryLink).build().perform();
		driver.findElement(By.linkText("iPads")).click();
		
		Assert.assertEquals("Failed to verify title","iPads1",driver.findElement(By.className("entry-title")).getText());
	}
	
	@Test
	public void keyEvent()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		WebElement userName=driver.findElement(By.name("userName"));
		action.moveToElement(userName).click().keyDown(Keys.SHIFT).sendKeys("admin").
		keyUp( Keys.SHIFT).build().perform();

	}
}
