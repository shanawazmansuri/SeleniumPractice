package com.driver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demos5 {
	
	@Test(dataProvider = "data",groups = {"Param"})
	public void test1(String userName, String password)
	{
		System.out.println("UserName is "+userName+ " Password is "+password);
	}
	
	@Test(groups = {"Simple"})
	public void test2()
	{
		System.out.println("Test 2");
	}
	
	@Test(groups = {"Simple.Normal"})
	public void test3()
	{
		System.out.println("Test 3");
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] data = {{"Shanawaz","Mansuri"},{"Noor","Mansuri"}};
		return data;
	}
	
	
}
