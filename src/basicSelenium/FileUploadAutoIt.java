package basicSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUploadAutoIt {
	String url="http://www.toolsqa.com/automation-practice-form/";
	WebDriver driver=new FirefoxDriver();
  @Test
  public void fileUpload() throws IOException {
	  driver.get(url);
	  //click on upload button
	  driver.findElement(By.id("photo")).click();
	  // execute file upload exe
	  Runtime.getRuntime().exec("F:\\autoit\\FileUploadTest.exe");
  }
}
