package com.driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertion {
	
	@Test
	public void test1()
	{
		WebDriverManager.chromedriver().setup();

		// Compulsory
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.msn.com/en-in?AR=3");
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='title-container']"));
		
		for(WebElement ele: links)
		{
			String news = ele.getText();
			
			System.out.println(news);
		}

		
	}
	

}
