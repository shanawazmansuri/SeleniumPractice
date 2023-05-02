package com.driver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) throws InterruptedException {

		// Compulsory
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/2021/");

		//Column
		List<WebElement> company = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));

		for (WebElement li : company) {
			String comTxt = li.getText();
			System.out.println(comTxt);
			if (comTxt.equals("Ola")) {
				System.out.println(comTxt + " Company is available");

			}
			
			

		}
		
		//Rows
		////table[@id='customers']/tbody/tr[2]/td
		
		
		
	}
}