package com.varshha;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;                                                                    //FACEBOOK LOGIN//
import org.openqa.selenium.Alert;


public class facebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		
		System.out.println("The url of this page is=:"+url);
		
		String title = driver.getTitle();
		
		System.out.println("The title of the page is=:"+title);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.id("email"));
		
		ele.sendKeys("srivastavavarsha@yahoo.com");
		
		Thread.sleep(2000);
		
		WebElement ele1 = driver.findElement(By.id("pass"));
		
		ele1.sendKeys("iloveyoujaan");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		//driver.close();
	}

}
