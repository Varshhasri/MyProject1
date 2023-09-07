package testng;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class orangedemo {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	}
	
	@Test
	
	public void vrfylogin() throws InterruptedException {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.name("firstName")).sendKeys("Varshha");
		Thread.sleep(2000);
		
		driver.findElement(By.name("middleName")).sendKeys("Deepak");
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastName")).sendKeys("Srivastava");
		Thread.sleep(2000);
		
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));
		
	    ele.clear();
	    ele.sendKeys("12345");
	    Thread.sleep(2000);
	}	
		
	@AfterMethod
	
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
		
		


	

}
