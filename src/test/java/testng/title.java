package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class title {
	
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
	   
	   public void testtitle() {
		   
		   String expectedtitle = "Swag Labs";
		   
		   String actualtitle = driver.getTitle();
		   
		   if(actualtitle.equals(actualtitle)) {
			   System.out.println("Your title is correct");
			   
		   }
		   else {
			   System.out.println("Checkn your title");
		   }
	   }
	   
	   @AfterMethod
	   
	   public void teardown() throws InterruptedException {
		   Thread.sleep(2000);
		   driver.close();
	   }
}
