package com.testngtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	//TestNG
	
	//Test new generation
	
	//Third party framework which is inspired from Junit and used to customize, manage and design test and its execution
	
	//2 steps to install
	
	//testng dependencies
	
	//testng maven dependency = Google search
	
	//Help--> MarketPlace-->Testng
	
	//Testcase and atleast 1 test is required to run testng test

	
		//@Before Suite // Only 1 time
		//@Before Test   // Only 1 time
		//@Before Class  // Only 1 time 
		//@Before Method // Will execute multiple time execution before every @test
		//@Test // Test case
		//@After Method // Will execute multiple time execution after every @test
		//@After Class  // Only 1 time
		//@After Test   // Only 1 time
		//@After Suite  // Only 1 time
		
		
		//Class make a right click
		//Testng
		//Convert to testng
		//Give any name and click on finish
	
		@Test
		public void aestcase1()
		{
			System.out.println("Test case 1");
		}
		
		@Test
		public void aastcase2()
		{
			System.out.println("Test case 2");
		}
		
		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("Before Method");
		}
		
		@AfterMethod
		public void AfterMethod()
		{
			System.out.println("After Method");
		}
	
		@BeforeSuite
		public void beforeSuite()
		{
			System.out.println("Before Suite");
		}
		
		
		//Shortcut Ctrl+Shift+O
		@AfterSuite
		public void afterSuite()
		{
			System.out.println("After Suite");
		}
		
		
		@BeforeTest
		public void beforeTest()
		{
			System.out.println("Before Test");
		}
		
		
		//Shortcut Ctrl+Shift+O
		@AfterTest
		public void afterTest()
		{
			System.out.println("After Test");
		}
		
		
		@BeforeClass
		public void beforeClass()
		{
			System.out.println("Before Class");
		}
		
		
		//Shortcut Ctrl+Shift+O
		@AfterClass
		public void afterClass()
		{
			System.out.println("After Class");
		}
	

}
