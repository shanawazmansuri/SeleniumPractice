package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		//Compulsory
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("http://seleniumpractise.blogspot.com/2016/");
		
		//WebElement fn = driver.findElement(By.name("first_name"));
		
		Actions ac = new Actions(driver);
		
		//ac.click(fn).keyDown(Keys.SHIFT).sendKeys("shanawaz").keyUp(Keys.SHIFT).build().perform();
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		
		driver.get("https://the-internet.herokuapp.com/inputs");
		
		WebElement ky = driver.findElement(By.xpath("//input[@type='number']"));
		
		ac.click(ky).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_UP).build().perform();
		
		

	}

}
