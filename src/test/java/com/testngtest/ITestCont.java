package com.testngtest;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ITestCont {

	// It is used to share the test data within class

	@Test(priority = 1)
	public void laptopName(ITestContext context) {
		context.setAttribute("Laptop1", "Dell");
	

		context.setAttribute("Laptop2", "Lenovo");
	

	}

	@Test(priority = 2)
	public void LaptopModels(ITestContext context) {

		String obj1 = (String) context.getAttribute("Laptop1");
		System.out.println(context.getAttribute("Laptop1"));

		String obj2 = (String) context.getAttribute("Laptop2");// Lenove
		System.out.println(obj2);


		System.out.println(obj1 + " Latest model is DL145");
		System.out.println(obj2 + " Latest model is LV655");

	}

}
