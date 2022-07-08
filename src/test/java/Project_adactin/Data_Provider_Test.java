package Project_adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Test {
	 Object [][] data = {
			 
			 {"admin", "admin@123"},
			 {"amrin", "amrin@123"},
			 {"armaan", "armaan@123"}
			 		 
	 };

	@DataProvider(name="login")
	private Object[][] CredentialsData() { 
      return data;
	}
	
	@Test(dataProvider = "login")
	private void loginScenario(String username , String password) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Adactin_Project_Test\\Driver\\chromedriver.exe" );
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://automationpractice.com/index.php");
	    driver.manage().window().maximize();
	    
	    WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
	    
		WebElement uname = driver.findElement(By.id("email"));
		uname.sendKeys("username");
		
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("password");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		
		
	

	}
	
	
	
	
	

}
