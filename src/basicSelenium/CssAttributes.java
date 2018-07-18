package basicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssAttributes {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		driver = DriverUtil.getWebDriver(DriverUtil.browserType);
		driver.manage().window().maximize();
		//font_color_BGcolor_Size_Family();
		
		// fontcolorSizeFamily();
		gettoolTip();
	}

	static void font_color_BGcolor_Size_Family() {
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_labels");
		driver.switchTo().frame("iframeResult");
		List<WebElement> plist = driver.findElements(By.tagName("span"));
		for (WebElement p : plist) {
			System.out.println("text: " + p.getText());
			System.out.println("color: " + p.getCssValue("color"));
			System.out.println("background-color: "
					+ p.getCssValue("background-color"));
			System.out.println("font-size: " + p.getCssValue("font-size"));
			System.out.println("font-family: " + p.getCssValue("font-family"));

		}
	}

	static void gettoolTip() {

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_global_title");
		driver.switchTo().frame("iframeResult");
		System.out.println(driver.findElement(By.xpath("//p/abbr"))
				.getAttribute("title"));
	}
}
