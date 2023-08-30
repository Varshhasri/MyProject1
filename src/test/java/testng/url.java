package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class url {

	public WebDriver driver;
	
	@BeforeMethod
	
	public void setup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.saucedemo.com");
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
	}
	
	@Test
	
	public void testurl() {
		
		String expectedurl = ("https://www.saucedemo.com");
		String actualurl = driver.getCurrentUrl();
		
		if(actualurl.equals(expectedurl)) {
			
			System.out.println("URL is correct");
		}
		else {
			System.out.println("Check your URL");
		}
		
		
	}
	
	@AfterMethod
	
	public void teardown() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.close();
	}

}
