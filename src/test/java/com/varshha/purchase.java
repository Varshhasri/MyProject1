package com.varshha;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;


public class purchase {

	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();

		String url = driver.getCurrentUrl();
		
		System.out.println("The url of this page is=:"+url);
		
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		
		System.out.println("The title of this page is=:"+title);
		Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("cartur")).click();
		
		Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		
		 Thread.sleep(2000);

			WebElement ele = driver.findElement(By.id("name"));	
		ele.sendKeys("Varshha");
		Thread.sleep(2000);

		
		WebElement ele2 = driver.findElement(By.id("country"));
		ele2.sendKeys("India");
		Thread.sleep(2000);

		
		WebElement ele3 = driver.findElement(By.id("city"));
		ele3.sendKeys("lucknow");
		Thread.sleep(2000);

		
		WebElement ele4 = driver.findElement(By.id("card"));
		ele4.sendKeys("1234-5678-9876");
		Thread.sleep(2000);

		
		WebElement ele5 = driver.findElement(By.id("month"));
		ele5.sendKeys("February");
		Thread.sleep(2000);

		
		WebElement ele6 = driver.findElement(By.id("year"));
		ele6.sendKeys("2029");
		Thread.sleep(2000);
                                                       //PURCHASE//
		
		
				
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
