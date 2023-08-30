package com.varshha;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;               //check box//


public class checkbox {                                                       //checkbox//

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		
		System.out.println(ele.size());
		
		for(WebElement checkbox:ele) {
			
			Thread.sleep(2000);
			
			checkbox.click();

			Thread.sleep(2000);
			
			driver.close();
		}
		
		

	}

}
