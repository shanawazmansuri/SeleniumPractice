package com.testngtest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriver {
	
	//Login window
	//Multi data input
	//DataDriven
	
	//Step 1 Store all data with 2 D Array
	//Data utilization by creating parameters of columns in other methods
	//Link Dataprovider with method where you need to supply data
	// Test will run as per interation provided
	
	
	
	//url = https://the-internet.herokuapp.com/login
	//Before Method=> Driver Initialization, url and maximaxation
	//@Dataprovider
	//@Test => element search uname and password and assert
	//After Method => driver.quit
	
	
	@DataProvider
	public static Object[][] data()
	{
		//3 Rows and 2 Column
		Object[][] td = {{"Shanawaz","Mansuri"},{"Noor","123"},{"Nawaz","Password"}};
		return td;
		
	}
	
	@DataProvider
	public static Object[][] data2()
	{
		//3 Rows and 2 Column
		Object[][] td = {{"XYZ","Mansuri"},{"ABC","123"},{"DEF","Password"}};
		return td;
		
	}
	
	
	@Test(dataProvider = "data")
	public void test1(String userName, String Password)
	{
		//username.send(userName)
		//password.send(Password)
		//Login Button click
		System.out.println("UserName is "+userName);
		System.out.println("Password is "+Password);
	}
	

}
