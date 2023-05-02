package com.testngtest;

import org.testng.Assert;
import org.testng.annotations.Test;

//Launch browser--
//Visibility
//Enability
//Clickability



public class Dependent {
	
	
	
	@Test(priority = -1,enabled = true,dependsOnMethods = {"launchBrowser","visibility"})
	public void Enability()
	{
		System.out.println("Login Enability");
	}
	
	
	
	
	@Test(priority = 1, dependsOnMethods = {"launchBrowser"} )
	public void visibility()
	{

		//Fail
		Assert.assertFalse(true);
		System.out.println("Login Visibility");
		
	}
	
	
	@Test(enabled = true, priority = 2)
	public void launchBrowser()
	{
		System.out.println("Launch Browser");
		
	
	}

}
