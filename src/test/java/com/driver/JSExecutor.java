package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JSExecutor {

	public static void main(String[] args) {
	
		
		//Compulsory
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		//WebElement fn = driver.findElement(By.name("first_name"));
		
		WebElement male = driver.findElement(By.id("gender-radio-1"));
		
		/*
		 * Actions act= new Actions(driver); act.click(male).perform();
		 */
		
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true);", fn);
		
		//js.executeScript("arguments[0].click();", male);
		
		//js.executeScript("document.getElementById('firstName').value='Shanawaz';");
		

	}

}
