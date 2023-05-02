package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		//Compulsory
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		//index
		//Id or name
		//WebElement
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("mce_0_ifr");		
		//driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
		
		/*
		 * WebElement txt = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
		 * 
		 * Thread.sleep(2000); txt.clear();
		 * 
		 * Thread.sleep(2000); txt.sendKeys("Testing Selenium");
		 */
		
		//Nested iframe
		
		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-left");
		System.out.println(driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText());
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.cssSelector("#content")).getText());
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-right");
		System.out.println(driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText());
		
		//to come out of all frames
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		System.out.println(driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText());
		
		driver.switchTo().defaultContent();
		
		
		
		

	}

}
