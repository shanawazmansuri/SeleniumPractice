package com.driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Forms {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		//Compulsory
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		//Auth Popup
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//File Upload
		//Search Upload button element and perform send keys of file path
	//	driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Admin\\Desktop\\Test.txt");
		//driver.findElement(By.id("file-submit")).click();
		
	/*
	 * //File Download List <WebElement> links =
	 * driver.findElements(By.xpath("//h3/following-sibling::a")); for(WebElement
	 * ele:links) { ele.click(); Thread.sleep(3000); }
	 */
		
		
		//checkboxes
		
		List<WebElement> cb = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(cb.get(0).isDisplayed());
		System.out.println(cb.get(0).isEnabled());
		System.out.println(cb.get(0).isSelected());
		
		//check box 1
		if(cb.get(0).isSelected()==false)
		{
			cb.get(0).click();
		}
		else
		{
			System.out.println("Checkbox already selected");
		}
		
		
		//check box 2
		if(cb.get(1).isSelected()==false)
		{
			cb.get(1).click();
		}
		else
		{
			System.out.println("Checkbox 2 already selected");
		}
		
		
		//To click all check boxes
		for(WebElement ele:cb)
		{
			ele.click();
		}

		
	}

}
