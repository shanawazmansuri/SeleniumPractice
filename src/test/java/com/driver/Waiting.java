package com.driver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waiting {

	public static void main(String[] args) {
		
//		2 Types
		//a) Implicit - 
		//Dynamic throughout sessions
		//10 
		//applies only 1 time
		
		//b) Explicit
		//Wait for Particular condition
		//Dynamic throughout sessions
		//10
		//You can apply multiple time as per element condition
		
		
		//Page Load Wait
		
		
		//Fluent Wait	
		//50
		//5 polling 
		
				
		
		WebDriverManager.chromedriver().setup();
		
		//Compulsory
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement hw = driver.findElement(By.xpath("//div[@id='finish']/h4"));
		
		wait.until(ExpectedConditions.visibilityOf(hw));
		
		System.out.println(hw.getText());
		
		
		
		

	}

}
