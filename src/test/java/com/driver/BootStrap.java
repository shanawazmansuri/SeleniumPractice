package com.driver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrap {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		//Compulsory
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		WebElement bs = driver.findElement(By.id("menu1"));
		
		//Scroll to particular element
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", bs);
		
		
		bs.click();
	
		
		
		
		WebDriverWait wait  =new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='dropdown-menu']/li/a")));
		
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		
		for(WebElement ele:list)
		{
			String text = ele.getText();
			System.out.println(text);
			
			  if(text.equals("JavaScript")) 
			  { 
				  ele.click(); 
			  
			  }
			 
		}
		
		
		////////////////////////////////////////////////
		
		//Auto Suggestion Textbox
		
		
		

	}

}
