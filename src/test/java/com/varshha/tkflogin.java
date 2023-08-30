package com.varshha;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;

public class tkflogin {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.thekickfactory.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		
		System.out.println("The url of this page is:"+url);
		Thread.sleep(2000);
		
		String Title = driver.getTitle();
		
		System.out.println("The title of this page is:"+Title);
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"mc4wp-form-1\"]/div[1]/div/div[1]/input"));
		
		email.sendKeys("srivarshha@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"mc4wp-form-1\"]/div[1]/div/div[2]/button/span")).click();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
