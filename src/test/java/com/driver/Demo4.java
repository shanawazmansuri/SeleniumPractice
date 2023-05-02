package com.driver;

import java.time.Duration;
import java.time.Month;
import java.time.Year;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		

		driver.get("https://jqueryui.com/datepicker/#dropdown-month-year");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(0);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("datepicker")).click();
		

		
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		
		
		
	
		
		
		
		String expectedYear = "2021";
		String expectedMonth = "Nov";
		String expectedDay = "6";
		int currentyear = Year.now().getValue();
		String newcurrentyear = String.valueOf(currentyear);
		
		Select sel = new Select(year);
		sel.selectByVisibleText(expectedYear);
		
		
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		
		  Select sele = new Select(month); 
		  sele.selectByVisibleText("Nov");
		  
		 
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[text()='"+expectedDay+"']")).click();
		
		
		
		//System.out.println(newcurrentyear);

		
		
			}

}
