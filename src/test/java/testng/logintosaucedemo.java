package testng;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class logintosaucedemo {
	
	public WebDriver driver;
	
	@BeforeMethod
	
	public void setup() throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("https://ww.saucedemo.com");
	   driver.manage().window().maximize();
	   
	   Thread.sleep(2000);
	
	}
	
	@Test
	
	public void testlogin() throws InterruptedException {
	
	
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	
	Thread.sleep(2000);
	
	
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
	}
	
	@AfterMethod
	
	public void teardown() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.close();
	}
	
}

