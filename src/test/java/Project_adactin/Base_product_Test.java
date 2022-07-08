package Project_adactin;

import org.testng.annotations.Test;

public class Base_product_Test {
	
	@Test
	private void CharoenPokphand() {
		System.out.println("Charoen Pokphand");

	}
	@Test
	private void Shenglong() {
		System.out.println("Shenglong");

	}
	@Test (priority = -1,invocationCount = 2)
	private void Waterbase() {
		System.out.println("Water Base");

	}
	@Test (priority = -2,invocationCount = 3)
	private void Avantifeeds() {
		System.out.println("Avanti Feeds");

	}
    @Test
    private void cargillfeeds() {
		System.out.println("Cargill Feeds");

	}
	

}
