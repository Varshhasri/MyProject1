package websites;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class chooseflight {

	public WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		 driver.get("https://blazedemo.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000); 

	}
	
	
	@Test
	public void flights()
	{
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input")).click();
	}
@AfterMethod
	
	public void teardown() throws InterruptedException 
	
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	
		
	}


