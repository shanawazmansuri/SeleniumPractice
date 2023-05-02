package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderResize {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		//Compulsory
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		
		driver.manage().window().fullscreen();
		
	
		
		driver.switchTo().frame(0);
		
		//WebElement ele = driver.findElement(By.xpath("//div[@id='slider']/span"));
		
		Actions ac = new Actions(driver);
		/*
		 * ac.dragAndDropBy(ele, 300, 16).perform(); ac.dragAndDropBy(ele, -75,
		 * 16).perform();
		 */	
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		
		ac.dragAndDropBy(ele, 300, 100).perform();


	}

}
