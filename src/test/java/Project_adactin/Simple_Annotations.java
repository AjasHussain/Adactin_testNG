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

public class Simple_Annotations {
	
	@BeforeSuite
	private void setproperty() {
		System.out.println("Property Set");

	}
	@BeforeTest
	private void browserlaunch() {
		System.out.println("Chrome");

	} 
	@BeforeClass
	private void LaunchUrl() {
		System.out.println("Launch Url");

	}
	@BeforeMethod
	private void loginpage() {
		System.out.println("*****loginpage*****");

	}
	@Test
     private void mobilesearch() {
		System.out.println("Mobile Search");

	}
	@Test
	private void LaptopSearch() {
		System.out.println("Laptop Search");

	}
	@AfterMethod
	private void logoutpage() {
		System.out.println("Logout Page");

	}
	@AfterClass
	private void homepage() {
		System.out.println("Home Page");

	}
	@AfterTest
	private void closebrowser() {
		System.out.println("Close Browser");

	}
	@AfterSuite
	private void deleteallcookies() {
		System.out.println("Delete cookies");

	}
	
	
}