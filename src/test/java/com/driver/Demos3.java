package com.driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demos3 {

	public static void main(String[] args) {
		
		//Compulsory
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2021/");
		
		List<WebElement> rows  =driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		List<WebElement> cols =driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody//tr/td[4]"));
		
																
		
		for(int i = 1; i<=cols.size();i++)
		{
				
				
				//System.out.println(driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText());
				
				System.out.println(driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody//tr/td["+i+"]")).getText());
				
			
		}

	}

}
