package Testng_Listeners;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Testng_Listeners.listener.class)
public class Basic_class {

	

	@BeforeSuite
	void beforeSuite()
	{
		System.out.println("Before Suite");;
		
	}
	
	@AfterSuite
	void AfterSuite()
	{
		System.out.println("After Suite");;
		
	}

	@BeforeTest
	void beforetest()
	{
		System.out.println("Before test");;
		
	}
	
	@AfterTest
	void Aftertest()
	{
		System.out.println("After test");;
		
	}
	
	@BeforeClass
	void beforeClass()
	{
		System.out.println("Before Class");;
		
	}
	
	@AfterClass
	void AfterClass()
	{
		System.out.println("After Class");;
		
	}

	@BeforeMethod
	void beforeMethod()
	{
		System.out.println("Before Method");;
		
	}
	
	@AfterMethod
	void AfterMethod()
	{
		System.out.println("After Method");;
		
	}
	
	@Test(priority=1)
	void Test1()
	{
		
		int a,b;
		a=0;
		b=1;
		if(a==b)
	    {
	    	System.out.println("Test pass");
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	System.out.println("Test fail");
	    	Assert.assertTrue(false);
	    }
		
	}
	
	@Test(priority=0)
	
	void Test2()
	{
		int c,d;
		c=1;
		d=1;
		if(c==d)
	    {
	    	System.out.println("Test pass");
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	System.out.println("Test fail");
	    	Assert.assertTrue(false);
	    }
		
	}
}
