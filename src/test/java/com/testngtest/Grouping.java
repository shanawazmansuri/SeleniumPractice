package com.testngtest;

import org.testng.annotations.Test;

public class Grouping {
	
	//Grouping of test cases
	
	//Sanity Suite
	//Regression Suite
	// Smoke Suite
	//Positive Suite
	//Negative Suite
	
	/*
	 * <groups>
	 *  <run> 
	 *  <include name="Positive"> 
	 *  </include> 
	 *  </run> 
	 *  
	 *	</groups>
	 */
	
	@Test(groups = {"Windows.Positive","Windows.Sanity"})
	public void test1()
	{
		System.out.println("Test case 1");
	}
	
	@Test(groups = {"Linux.Negative"}) 
	public void test2()
	{
		System.out.println("Test case 2");
	}
	
	@Test(groups = {"Windows.Sanity", "Linux.Smoke"})
	public void test3()
	{
		System.out.println("Test case 3");
	}
	
	@Test(groups = {"Linux.Smoke","Linux.Negative"})
	public void test4()
	{
		System.out.println("Test case 4");
	}
	
	
	

}
