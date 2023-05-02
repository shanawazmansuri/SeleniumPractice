package com.testngtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	
	public ThreadLocal<WebDriver>driver= new ThreadLocal<WebDriver>();
	
	
	public void setDriver(WebDriver driver)
	{
		this.driver.set(driver);
	}
	
	public WebDriver getDriver()
	{
		return this.driver.get();
	}
	
	@BeforeMethod
	@Parameters({"bName"})
	public void setUp(String BrowserName)
	{
		browserSetup(BrowserName);
	}
	
	/*
	 * @AfterMethod public void tearDown() { getDriver().quit(); }
	 */
	
	
	@Test
	public void test1()
	{
		getDriver().get("https://www.google.co.in");
		getDriver().manage().window().maximize();
		System.out.println(getDriver().getTitle());
	}
	
	//Cross Browser testing with parallel execution
	
	
	public void browserSetup(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
			//Compulsory
			setDriver(new ChromeDriver());
			
			
		}
		
		else if (browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			
			//Compulsory
			setDriver(new EdgeDriver());
			
			
		}
	}

}
