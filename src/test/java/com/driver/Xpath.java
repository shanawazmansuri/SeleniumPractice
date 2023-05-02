package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
		
		//Compulsory
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		
		//2 types of xpaths
		//a) Absolute
		// /html to desired element
		///html/body/div/div/form/div/div/style/
		
		
		//b) Relative
		
		//TageName[@attribute='value']
		//*[@attribute='value'] // * means all
		
		//TageName[@attribute1='value1'][@attribute2='value2']
		//input[@name='q'][@class="gLFyf"]
		//input[@name='q' and @class='gLFyf']
		//input[@name='jcjkcjkacnjaskcn' or @class='gLFyf']
		
		
		//contains has 2 parameters
		//TageName[contains(@attribute,'value')]
		//input[contains(@class,'gL')]
		//a[contains(text(),'out')]
		
		
		//text
		//TagName[text()='value']
		//a[text()='Business']
		
		
		
		//Starts with
		//Tag[starts-with(@Para,'value')]
		//input[starts-with(@title,'Sea')]
		//div[starts-with(text(),'Ind')]
		
		
		
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation");

	}

}
