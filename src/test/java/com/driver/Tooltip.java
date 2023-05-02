package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		//Compulsory
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2019/09/");
		
		WebElement tt = driver.findElement(By.xpath("//a[@data-toggle='tooltip']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(tt).perform();
		
		String text = driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
		
		System.out.println(text);
		
		


	}

}
