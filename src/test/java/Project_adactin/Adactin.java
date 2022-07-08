package Project_adactin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	
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
		
		WebElement index = driver.findElement(By.id("location"));
		Select s = new Select (index);
		s.selectByIndex(5);
		
		WebElement value = driver.findElement(By.id("hotels"));
        Select v = new Select (value);
        v.selectByValue("Hotel Hervey");
        
        WebElement text = driver.findElement(By.id("room_type"));
        Select t = new Select (text);
        t.selectByVisibleText("Deluxe");
        
        WebElement index1 = driver.findElement(By.id("room_nos"));
        Select n = new Select (index1);
        n.selectByIndex(4);
        
        WebElement indate = driver.findElement(By.xpath("//input[@class=\'date_pick\']"));
        indate.sendKeys("25/05/2022");
      
        
        WebElement outdate = driver.findElement(By.id("datepick_out"));
        outdate.sendKeys("27/05/2022");
    
        
        WebElement adultrooms = driver.findElement(By.id("adult_room"));
        Select rooms = new Select(adultrooms);
        rooms.selectByIndex(2);
        
        WebElement kidsroom = driver.findElement(By.id("child_room"));
        Select room = new Select(kidsroom);
        room.selectByIndex(2);
        
        WebElement search = driver.findElement(By.xpath("//input[@type=\'submit\']"));        search.click();
        
       WebElement radio = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
       radio.click();
       
       WebElement continue1 = driver.findElement(By.id("continue"));
       continue1.click();
       
       WebElement nameone = driver.findElement(By.name("first_name"));
       nameone.sendKeys("AJAS");
       
       WebElement nametwo = driver.findElement(By.name("last_name"));
       nametwo.sendKeys("HUSSAIN");
       
       WebElement address = driver.findElement(By.name("address"));
       address.sendKeys("CHENNAI");
       
       WebElement ccnum = driver.findElement(By.id("cc_num"));
       ccnum.sendKeys("9876543210123456");
       
       WebElement cctype = driver.findElement(By.id("cc_type"));
       cctype.sendKeys("VISA");
       
       WebElement expirydate = driver.findElement(By.id("cc_exp_month"));
       expirydate.sendKeys("February");
       
       WebElement expiryyear = driver.findElement(By.name("cc_exp_year"));
       expiryyear.sendKeys("2021");
       
       WebElement cardcvv = driver.findElement(By.name("cc_cvv"));
       cardcvv.sendKeys("099");
       
       WebElement booking = driver.findElement(By.name("book_now"));
       booking.click();
       
       Thread.sleep(6000);
       WebElement myitinerary = driver.findElement(By.id("my_itinerary"));
       myitinerary.click();
       
      WebElement radio1 = driver.findElement(By.name("ids[]"));
      radio1.click();
      
      WebElement cancel = driver.findElement(By.name("cancelall"));
      cancel.click();
      
      Alert alert1 = driver.switchTo().alert();
      alert1.accept();
      
      WebElement radio2 = driver.findElement(By.id("logout"));
      radio2.click();
    
      
      
       
      driver.close();
       
       	
	}

}
