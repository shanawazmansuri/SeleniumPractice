package com.testngtest;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

	@Test
	@Parameters({ "fN", "lN" })
	public void firstName(@Optional("Noor") String fname, @Optional("Mansuri") String lName) {

		System.out.println("My First Name is " + fname);
		System.out.println("My Last Name is " + lName);
	}

}
