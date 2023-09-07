package com.page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.utility.Browserfactory;



public class Baseclass {
	
	public WebDriver driver;

     @BeforeClass
         public void setup() {
	        driver = Browserfactory.startApplication(driver, "Chrome", "https://www.saucedemo.com/");
}

     @AfterClass
         public void teardown() {
	        Browserfactory.quitBrowser(driver);
}

}
 


