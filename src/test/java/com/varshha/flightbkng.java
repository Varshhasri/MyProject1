package com.varshha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;


public class flightbkng {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://blazedemo.com");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
		
		Select drp = new Select(ele);
		
		drp.selectByValue("Paris");
		
		Thread.sleep(2000);
		
		WebElement ele1 = driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));
		
		Select drp1 = new Select(ele1);
		
		drp1.selectByValue("London");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input")).click();
		
		Thread.sleep(2000);
		
		WebElement name = driver.findElement(By.id("inputName"));
		
		name.sendKeys("Varshha");
		
		Thread.sleep(1000);
		
		WebElement add = driver.findElement(By.id("address"));
		
		add.sendKeys("Omaxe R2");
		Thread.sleep(1000);
		
		WebElement city = driver.findElement(By.id("city"));
		
		city.sendKeys("Lucknow");
		Thread.sleep(1000);
		
		WebElement state = driver.findElement(By.id("state"));
		state.sendKeys("Uttar Pradesh");
		Thread.sleep(1000);
		                                                   //drop down//
		WebElement pin = driver.findElement(By.id("zipCode"));
		pin.sendKeys("226002");
		Thread.sleep(1000);
		
		WebElement ctype = driver.findElement(By.id("cardType"));
		
		Select drp2 = new Select(ctype);
		
		drp2.selectByValue("amex");
		Thread.sleep(1000);
		
		WebElement cno = driver.findElement(By.id("creditCardNumber"));
		
		cno.sendKeys("1234-5678-9876");
		Thread.sleep(1000);
		
		WebElement cmonth = driver.findElement(By.id("creditCardMonth"));
		   cmonth.clear();
		  cmonth.sendKeys("2");
		  
		  Thread.sleep(1000);
		  
		  
		  WebElement cyear = driver.findElement(By.id("creditCardYear"));
		  cyear.clear();
		  cyear.sendKeys("2029");
		  Thread.sleep(1000);
		  
		  WebElement name1 = driver.findElement(By.id("nameOnCard"));
		  
		  name1.sendKeys("Varshha Srivastava");
		  
		  Thread.sleep(1000);
		  
		  driver.findElement(By.id("rememberMe")).click();
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input"));
		  
		  driver.close();
		  	
		  
		
		                                             
	}

}
