package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.page.fbbaseclass;
import com.page.fbloginpage;
import com.utility.Browserfactory;

       public class fblogin extends fbbaseclass

       {
         @Test
    	   public void userdetail()
    	   {
    	   fbloginpage fbpg = PageFactory.initElements(driver, fbloginpage.class);
	       fbpg.loginTofb("srivarshavarsha@yahoo.com", "Aditya@16");
		
	}

}
