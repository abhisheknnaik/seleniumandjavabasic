package TestNGPac;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	@Test
	public void softAssert(){
		SoftAssert softAssertion= new SoftAssert();
		System.out.println("softAssert Method Was Started");
		softAssertion.assertEquals("a","A", "Failed to verify a and A is equal");
		System.out.println("softAssert equals");
		softAssertion.assertTrue(false,"Failed to verify true message");
		System.out.println("softAssert Method Was Executed");
		// if you forgot to write below line then test case will be always pass ,even after fail
		softAssertion.assertAll();
	}}
