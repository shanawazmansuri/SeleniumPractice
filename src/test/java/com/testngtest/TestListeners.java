package com.testngtest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//Listeners will listen the run time execution status of program 
//Right click on class-->sources-->Override implement method
//Implement above class
// Listeners class will be 1 time activity

//@Listeners({NgListeners.class})
public class TestListeners {
	
	@Test(retryAnalyzer = Retrying.class)
	public void test1()
	{
		Assert.assertTrue(true);
	}
	
	
	@Test(retryAnalyzer = Retrying.class)
	public void test2()
	{
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"test2"},retryAnalyzer = Retrying.class)
	public void test3()
	{
		Assert.assertTrue(true);
	}

}
