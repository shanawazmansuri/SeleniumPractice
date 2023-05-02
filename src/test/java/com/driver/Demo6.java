package com.driver;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Demo6 {
	
	@Test
	public void generateData(ITestContext context)
	{
		//String firstName = "Shanawaz";
		// Setting an attribute with name and its value
		context.setAttribute("FirstName", "Shanawaz");
	}
	
	
	@Test
	public void useData(ITestContext context)
	{
		//String lastName = "Mahajan";
		context.setAttribute("LastName", "Mansuri");
		System.out.println(context.getAttribute("FirstName"));
		// Retrieving attribute value set in ITestContext
		String FN = (String) context.getAttribute("FirstName");
		//String fullName = FN +" "+lastName;
		//System.out.println("Full Name is : "+fullName);
		//context.setAttribute("FullName", fullName);
	}

}
