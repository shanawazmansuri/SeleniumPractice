package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS {

	public static void main(String[] args) {
		
		//CSS Selector
		//or 
		//Xpath Path
		
		
		//Using Id = #
		//Using ClassName = .
		//Combination
		//using attribute = tagname[attribute='value']
		//multi attribute = tagname[attribute1='value1'][attribute2='value2']
		//Contains = *
		//Startswith = ^
		//Endswith = $
		
		//id = "456password"
		
		WebDriverManager.chromedriver().setup();
		
		//Compulsory
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("#lawson-cta-animated")).click();
		//driver.findElement(By.cssSelector(".gLFyf")).sendKeys("Automation");
		//driver.findElement(By.cssSelector("img[id*='lawson']")).click();
		//[class^="lawson"]#lawson-cta-animated
		
		

	}

}
