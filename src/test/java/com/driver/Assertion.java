package com.driver;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {

	// Validating actual with expected == Pass
	// Not Validating actual with expected == Fail
	//Hard Assertion

	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();

		// Compulsory
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");

		// Scenario 1
		/*
		 * String actualTitle = driver.getTitle();
		 * 
		 * String expectedTitle = "Googles";
		 * 
		 * Assert.assertEquals(actualTitle, expectedTitle,"Title does not match");
		 * 
		 * System.out.println("Test Completed");
		 */

		// Scenario 2
		// boolean status = driver.findElement(By.name("q")).isDisplayed();

		// Assert.assertTrue(status);

		// Test Case fail
		// Assert.assertFalse(status);

		// Scenario 3
		String actualTitle = driver.getTitle();

		String expectedTitle = "Google is the web services of google";

		//Assert.assertTrue(actualTitle.contains("Google"));
		
		Assert.assertTrue(actualTitle.equalsIgnoreCase("XYZ"));
		
		System.out.println("Test Completed");
	}

}
