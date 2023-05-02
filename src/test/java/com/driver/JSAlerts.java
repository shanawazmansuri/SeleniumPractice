package com.driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		//Compulsory
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert al = driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		Thread.sleep(2000);
		//Accept will click on OK button
		//al.accept();
		
		al.sendKeys("I am learning JS Alerts");
		
		//Click on Cancel button
		//al.dismiss();
		
		al.accept();
		
		

	}

}
