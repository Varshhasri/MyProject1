package websites;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl();
		
		System.out.println("The url of this page is=:"+url);
		
		String title = driver.getTitle();
		                                                               //LOGIN //navigate() back() forward()
		System.out.println("the title of this page is=:"+title);
		Thread.sleep(3000);
	}

}
