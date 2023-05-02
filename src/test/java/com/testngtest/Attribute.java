package com.testngtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Attribute {
	
	String name;
	
	//Description will help you to describe the logic written into function
	//ExpectedException will pass the test if same exception is expected in testng attribute (expectedExceptions)
	// Invocation Count will execute your test as per set in count parameter
	// Timeout will check the performance of test, if its with expected time then test case will fail
	//Always run will always execute the test
	
	
	
	@Test(enabled = false, description =  "This method will return you result after substration",expectedExceptions = {NullPointerException.class})
	public void test1()
	{
		char a = name.charAt(0);
		
		System.out.println(a);
		
		
	}
	
	@Test(invocationCount = 3,timeOut = 2000,threadPoolSize = 3,alwaysRun = true, groups = {"Negative"} )
	public void test2() throws InterruptedException
	{
		//System.out.println(Thread.currentThread().getId());
		
		Assert.assertTrue(false);
		
		
	}
	
	@Test(dependsOnGroups  = {"Negative"},alwaysRun = true)
	public void test3()
	{
		System.out.println("Test 3");
	}


}
