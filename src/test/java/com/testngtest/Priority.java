package com.testngtest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class Priority {
	
	//Login visibility (1)
	//enable (2)
	//clickable (3)
	//after click it should open the login window (4)
	// user should able to enter proper uId and Pwd and click on Login button(5)
	//After login it should access to application(6)
	
	//Ignore
	//1) Method/Test case level
	//2) Class Level
	//3) Package==> All class files with package will be ignored
	
	//No priority set method will be executed first then it will execute priority set methods
	
	
	@Test(priority = 3)
	public void test1()
	{
		System.out.println("Login Clickability");
	}
	
	@Test(priority = 2,enabled = true)
	public void test2()
	{
		System.out.println("Login Enability");
	}
	
	@Test(priority = -1)
	public void test3()
	{
		System.out.println("Login Visibility");
	}
	
	
	@Test(enabled = true)
	public void test4()
	{
		System.out.println("Launch Browser");
	}

}
