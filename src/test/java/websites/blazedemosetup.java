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


public class blazedemosetup {

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
	public void findflights() throws InterruptedException
	{
		WebElement e1 = driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
		Select drp1 = new Select(e1);
		
		drp1.selectByValue("Philadelphia");
		
		Thread.sleep(2000); 
		
		WebElement e2 = driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));
		Select drp2 = new Select(e2);
		drp2.selectByValue("Berlin");
		Thread.sleep(2000); 
		
		 ((WebElement) driver.findElements(By.xpath("/html/body/div[3]/form/div/input"))).click();
	}
@AfterMethod
	
	public void teardown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
}

