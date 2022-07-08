package Project_adactin;

import org.testng.annotations.Test;

public class Expected_exception {
	
	@Test (expectedExceptions = ArithmeticException.class)
	private void arithmatic_operation() {
         
		
		int a =1/10;
		System.out.println("a");
		
	}
	
	
	
	

}
