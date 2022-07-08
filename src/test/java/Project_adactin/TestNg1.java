package Project_adactin;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNg1 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforesuite");
	}
    @BeforeTest
    public void beforeTest() {
		System.out.println("beforeTest");

	}
    @BeforeClass
    public void beforeClass() {
		System.out.println("beforeClass");

	}
    @BeforeMethod
    public void beforeMethod() {
		System.out.println("beforeMethod");

	}
    @Test
    public void testCase1() {
    	System.out.println("testCase1");
		

	}
    @Test(priority = -3, invocationCount = 3)
    public void testCase2() {
		System.out.println("testCase2");

	}
    @AfterMethod
    public void afterMethod() {
		System.out.println("afterMethod");
		

	}
    @AfterClass
    public void afterClass() {
	    System.out.println("afterClass");

	}
    @AfterTest
    public void afterTest() {
		System.out.println("afterTest");

	}
	@AfterSuite
	private void afterSuite() {
		System.out.println("afterSuite");

	}
	
	
}
