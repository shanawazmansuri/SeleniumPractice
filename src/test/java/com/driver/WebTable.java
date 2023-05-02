package com.driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/2021/");

		// Header
		// List<WebElement> head =
		// driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		
		//Columns
		
		//List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
		
		for (WebElement ele : rows) 
		
		{ String text = ele.getText();
		  
		  System.out.println(text);
		  
			/*
			 * if (text.equals("Amazon")) { System.out.println("Value is available");
			 * 
			 * break; }
			 */
		  
		  }
		

		// AllData
		/*
		 * List<WebElement> data =
		 * driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		 *
		 * 
		 * 
		 * 
		 * for (WebElement ele : data) { String text = ele.getText();
		 * 
		 * System.out.println(text);
		 * 
		 * if (text.equals("Amazon")) { System.out.println("Value is available");
		 * 
		 * break; }
		 * 
		 * }
		 */
		
		
		//checkbox for particular value
		//driver.findElement(By.xpath("//td[text()='Ola']/preceding-sibling::td/input")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//td[text()='Ola']/following-sibling::td[3]/a")).click();
		
		
		
		
		

	}

}
