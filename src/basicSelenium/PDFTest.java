package basicSelenium;

import static org.junit.Assert.*;


import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import junit.framework.Assert;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PDFTest {

static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		driver = new FirefoxDriver();
	}
	
	/**
	 * To verify PDF content in the pdf document
	 */
	@Test
	public void testVerifyPDFTextInBrowser() {
		
		driver.get("http://www.princexml.com/samples/");
		driver.findElement(By.linkText("PDF flyer")).click();
		assertTrue(verifyPDFContent(driver.getCurrentUrl(), "Prince Cascading"));
	}

	/**
	 * To verify pdf in the URL 
	 */
	//@Test
	public void testVerifyPDFInURL() {
		driver.get("http://www.princexml.com/samples/");
		driver.findElement(By.linkText("PDF flyer")).click();
		String getURL = driver.getCurrentUrl();
		assertTrue(getURL.contains(".pdf"));
	}

	
	public boolean verifyPDFContent(String strURL, String reqTextInPDF) {
		
		boolean flag = false;
		
//		PDFTextStripper pdfStripper = null;
//		PDDocument pdDoc = null;
//		COSDocument cosDoc = null;
		String parsedText = null;

		try {
			URL url = new URL(strURL);
			BufferedInputStream file = new BufferedInputStream(url.openStream());
//			PDFParser parser = new PDFParser((RandomAccessRead) file);
//			
//			parser.parse();
//			cosDoc = parser.getDocument();
//			pdfStripper = new PDFTextStripper();
//			pdfStripper.setStartPage(1);
//			pdfStripper.setEndPage(1);
//			
//			pdDoc = new PDDocument(cosDoc);
//			parsedText = pdfStripper.getText(pdDoc);
		} catch (MalformedURLException e2) {
			System.err.println("URL string could not be parsed "+e2.getMessage());
		} catch (IOException e) {
			System.err.println("Unable to open PDF Parser. " + e.getMessage());
			try {
//				if (cosDoc != null)
//					cosDoc.close();
//				if (pdDoc != null)
//					pdDoc.close();
			} catch (Exception e1) {
				e.printStackTrace();
			}
		}
		
		System.out.println("+++++++++++++++++");
		System.out.println(parsedText);
		System.out.println("+++++++++++++++++");

		if(parsedText.contains(reqTextInPDF)) {
			flag=true;
		}
		
		return flag;
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
