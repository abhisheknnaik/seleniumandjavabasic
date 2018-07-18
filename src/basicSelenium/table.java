package basicSelenium;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class table {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 WebDriver driver = DriverUtil.getWebDriver(DriverUtil.browserType);
	        driver.get("http://newtours.demoaut.com/");
	       
	       // System.out.println(driver.findElement(By.xpath("//table[@width='270']//tr[2]/td[1]")).getText());
	        
	        List<WebElement> row=driver.findElements(By.xpath("//table[@width='270']//tr"));
	        List<WebElement> col=driver.findElements(By.xpath("//table[@width='270']//tr[1]/td"));
	        
	        for(int r=1;r<=row.size();r++)
	        {
	        	for (int c=1;c<=col.size();c++)
	        	{
	        		System.out.print(" "+driver.findElement(By.xpath("//table[@width='270']//tr["+r+"]/td["+c+"]")).getText());
	        		
	        	}
	        	System.out.println();
	        }
	   //     driver.close();
		

	}

}
