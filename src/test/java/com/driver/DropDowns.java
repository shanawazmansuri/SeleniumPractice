package com.driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		//Compulsory
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		WebElement dd = driver.findElement(By.id("dropdown"));
		
		Select sel = new Select(dd);
		//sel.selectByIndex(1);
		sel.selectByVisibleText("Option 2");
		sel.selectByVisibleText("Option 3");
		//sel.selectByValue("2");
		
	/*	List<WebElement> opt = sel.getOptions();
		for(WebElement ele:opt)
		{
			System.out.println(ele.getText());
		}
		*/
		
		//System.out.println(sel.getFirstSelectedOption().getText());
		
		System.out.println(sel.isMultiple());
		
		
		
		
		
		

	}

}
