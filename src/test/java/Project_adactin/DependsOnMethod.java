package Project_adactin;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	
	
	@Test (dependsOnMethods = "offers")
	private void mobileoffers() {
		System.out.println("50%off");

	}
	
	@Test
	private void laptopnoOff() {
		System.out.println("no offer for laptop");

	}

}
