package Project_adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_adactin_project {
	
	public static void main(String [] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Seleniumjavaautomation\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("AJASHUSSAIN");
	
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("2HWWY4");
		
		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		login.click();
		
	 }

}