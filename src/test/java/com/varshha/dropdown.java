package com.varshha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.blazedemo.com");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
		
		Select drp = new Select(ele);
		
		//ele.sendKeys("Mexico Cityk");
		drp.selectByValue("Mexico City");
		Thread.sleep(2000);
		
		WebElement ele1 = driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));
		
		Select drp1 = new Select(ele1);
		
		//ele1.sendKeys("New York");
		drp1.selectByValue("New York");                            //USE OF DROPDOWN//
		Thread.sleep(2000); 
		
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[5]/td[1]/input")).click();
		Thread.sleep(2000);
		
		WebElement ele2 = driver.findElement(By.id("inputName"));
		
		ele2.sendKeys("Varshha");
		Thread.sleep(2000);
		
		WebElement ele3 = driver.findElement(By.id("address"));
		
		ele3.sendKeys("omaxe R2");
		Thread.sleep(2000);
		
		WebElement ele4 = driver.findElement(By.id("city"));
		ele4.sendKeys("Lucknow");
		Thread.sleep(2000);
		
		WebElement ele5 = driver.findElement(By.id("state"));
		ele5.sendKeys("Uttar Pradesh");
		Thread.sleep(2000);
		
		WebElement ele6 = driver.findElement(By.id("zipCode"));
		ele6.sendKeys("226002");
		Thread.sleep(2000);
		
		WebElement ele7 = driver.findElement(By.id("cardType"));
		
		Select drp2 = new Select(ele7);
		//ele7.sendKeys("Visa");
		drp2.selectByValue("amex");
		Thread.sleep(2000);
		
		WebElement ele8 = driver.findElement(By.id("creditCardNumber"));
			ele8.sendKeys("1234-5678-9876");
		Thread.sleep(2000);
		
		WebElement ele9 = driver.findElement(By.id("creditCardMonth"));
		ele9.clear();
		ele9.sendKeys("2");
		Thread.sleep(2000);
		
		WebElement ele10 = driver.findElement(By.id("creditCardYear"));
		ele10.clear();
		ele10.sendKeys("2029");
		Thread.sleep(2000);
		
		WebElement ele11 = driver.findElement(By.id("nameOnCard"));
		ele11.sendKeys("Varshha Srivastava");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
