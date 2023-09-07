package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class fbloginpage {

	WebDriver driver;

	public void fbloginpage(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	@FindBy(id = "email")
	WebElement emailid;
	
	@FindBy(id = "pass")
	WebElement pswd;
	
	@FindBy(name = "login")
	WebElement button;
	
	public void loginTofb(String email, String password) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		emailid.sendKeys(email);
		pswd.sendKeys(password);
		button.click();
	}

}


	


