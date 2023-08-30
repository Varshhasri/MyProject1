package com.varshha;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class fileupload {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("file-upload")).sendKeys("C\\Users\\Hello india\\Program Files\\dt.xml");
		Thread.sleep(2000);
		
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(2000);                                           //FILE UPLOAD//
		driver.close();
		
	}

}
