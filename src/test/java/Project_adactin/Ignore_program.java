package Project_adactin;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_program {
	
	@Test (invocationCount = 3) 
	private void urllaunch() {
		System.out.println("Url Launch");
	}
		

	
	@Test (enabled=false)
	private void Homepage() {
		System.out.println("Home Page");

	}
	@Ignore
	@Test (priority = -2)
	private void loginpage() {
        System.out.println("Login page");
	}
	
	@Test
	private void uname() {
		System.out.println("Username");

	}
	
	@Test
	private void upassword() {
		System.out.println("Password");
	}
	
	@Test
	private void logoutpage() {
         System.out.println("Logout Page");
	}
	
	
	
	
	
	
	
	
	
	
	
}
