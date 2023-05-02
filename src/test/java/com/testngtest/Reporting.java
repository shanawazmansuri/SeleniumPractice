package com.testngtest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporting {
	
	//Refresh Project
	//test-out-->emailable-report.html
	//Right Click--> Show-In-->System Explorer
	// Run Test from .xml file with Test Suite name and Test name, It will create a folder in test-out which contains test report and failed.xml
	
	@Test
	public void test1()
	{
		Reporter.log("Initialized Driver as Chrome");
		//Pass
		Assert.assertTrue(true);
		Reporter.log("Asserted value as True");
	}
	
	@Test
	public void test2()
	{
		//Fail
		Assert.assertTrue(true);
		Reporter.log("Asserted value as True and validated successfully",true);
	}
	
	
	@Test(dependsOnMethods = {"test2"})
	public void test3()
	{
		//Skip
		System.out.println("Test 3");
		Reporter.log("Entered Username",true);
		Reporter.log("Entered Password",true);
		Reporter.log("Clicked on Login Button",true);
		Reporter.log("Validted message",true);
	}

}
