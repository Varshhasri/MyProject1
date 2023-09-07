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


public class purchaseflight {
	
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
    public void customerdetail() throws InterruptedException
    {
	 WebElement name = driver.findElement(By.id("inputName"));
	 name.sendKeys("Varshha");
	 Thread.sleep(2000);
	 
	 WebElement address = driver.findElement(By.id("address"));
	 address.sendKeys("Omaxe R2");
	 Thread.sleep(2000);
	 
	 WebElement city = driver.findElement(By.id("city"));
	 city.sendKeys("lucknow");
	 Thread.sleep(2000);
	 
	 Thread.sleep(2000);
	 
	 WebElement state = driver.findElement(By.id("state"));
	 state.sendKeys("Uttar Pradesh");
	 Thread.sleep(2000);
	 
	 WebElement zipcode = driver.findElement(By.id("zipCode"));
	 zipcode.clear();
	 zipcode.sendKeys("226002");
	 Thread.sleep(2000);
	 
	 WebElement card = driver.findElement(By.id("cardType"));
	   Select drp3 = new Select(card);
	   drp3.selectByValue("amex");
	   Thread.sleep(2000);
		 
	   WebElement cardno = driver.findElement(By.id("creditCardNumber"));
	   cardno.sendKeys("1234-5678-9876");
	   Thread.sleep(2000);
	   
	   WebElement cardmonth = driver.findElement(By.id("creditCardMonth"));
	   cardmonth.clear();
	   cardmonth.sendKeys("2");
	   Thread.sleep(2000);
	   
	   WebElement cardyear = driver.findElement(By.id("creditCardYear"));
	   cardyear.clear();
	   card.sendKeys("2029");
	   Thread.sleep(2000);
	   
	   WebElement nameoncard = driver.findElement(By.id("nameOnCard"));
	   nameoncard.sendKeys("Varshha Srivastava");
	   Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();    
}
 @AfterMethod
	
	public void teardown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
}