package com.varshha;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class navigatepage {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl();
		
		System.out.println("The url of this page is=:"+url);
		
		String title = driver.getTitle();
		                                                               //LOGIN //navigate() back() forward()
		System.out.println("the title of this page is=:"+title);
		
		
		WebElement ele = driver.findElement(By.id("user-name"));
		
		ele.sendKeys("standard_user");
		Thread.sleep(3000);
		
		WebElement ele1 = driver.findElement(By.id("password"));
		
		ele1.sendKeys("secret_sauce");
		Thread.sleep(3000);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click()
;				
		Thread.sleep(3000);
		
		
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
	
		driver.close();
		

	}

}
