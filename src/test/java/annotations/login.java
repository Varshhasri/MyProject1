package annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {

	
	@BeforeMethod
	
	public void test1()
	{
		int a = 4; int b = 5;
		int c = a+b;
	
	System.out.println("This execution is before test:"+c);
	
	}
	@AfterMethod
	
	public void test2()
	{
		int a = 45; int b = 23;
		int c =a-b;
		System.out.println("This execution is after test:"+c);
	}

   @Test
   
   public void test3()
   {
	   int a = 5, b= 6;
	   int c = a*b;
	   System.out.println("This execution is in test:"+c);
	   
   }

}