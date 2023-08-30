package com.varshha;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

                                                       //finding window id//
public class windowid {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		
		Thread.sleep(2000);
		
		Set<String> windowid = driver.getWindowHandles();
		
		List<String> windowlist = new ArrayList<String> (windowid);
		
		String firstwindow = windowlist.get(0);
		
		System.out.println("The id of 1st window is=:"+firstwindow);
		
		String secondwindow = windowlist.get(1);
		System.out.println("The id of 2nd window is=:"+secondwindow);
		Thread.sleep(2000);
		
		driver.switchTo().window(firstwindow);
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.name("username"));
		   ele.sendKeys("Admin");
		      Thread.sleep(3000);
		      
		 WebElement ele1 = driver.findElement(By.name("password"));
		       ele1.sendKeys("admin123");
		       Thread.sleep(3000);
		       
		       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		       Thread.sleep(3000);
		       
		       driver.switchTo().window(secondwindow);
		       Thread.sleep(3000);
                  driver.quit();
          
          

	}

}
