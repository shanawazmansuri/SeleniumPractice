package com.driver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		//Compulsory
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/autocomplete/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("tags")).sendKeys("A");
		
		WebDriverWait wait  =new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='ui-id-1']/li/div")));
		
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div"));
		
		for(WebElement ele:list)
		{
			String text = ele.getText();
			System.out.println(text);
			
			  if(text.equals("AppleScript")) 
			  { 
				  ele.click(); 
			  
			  }
			 
		}
		
		

	}

}
