package com.driver;

import org.testng.annotations.Test;

import com.testngtest.DataDriver;

//Provide the class name where dataprovider exists
//Provide the dataprovider name where data exists

public class DataProv2 {
	
	@Test(dataProviderClass = DataDriver.class, dataProvider = "data")
	public void test123(String un, String pwd)
	{
		System.out.println("UserName is "+un);
		System.out.println("Password is "+pwd);
	}

}
