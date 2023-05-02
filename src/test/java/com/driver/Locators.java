package com.driver;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
		
		//Compulsory
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		
		//1st Method
		/*By search = By.name("q");	
		driver.findElement(search).sendKeys("Automation");*/
		
		//2nd Method
		/*driver.findElement(By.name("q")).sendKeys("Automation");*/
		
		
		//3rd Method
		WebElement seachTxt = driver.findElement(By.name("q"));
		//seachTxt.sendKeys("Automation");
		//seachTxt.sendKeys(Keys.ENTER);
		
	//WebElement india = driver.findElement(By.className("uU7dJb"));
	//String country = india.getText();
	//String classText = india.getAttribute("innerHTML");
	
	
	//System.out.println(classText);
		
		
	//List<WebElement> links = driver.findElements(By.tagName("tr"));
		
	//driver.findElement(By.tagName("a")).click();
		
	//driver.findElement(By.linkText("About")).click();
		
	//driver.findElement(By.partialLinkText("work")).click();
		
	List<WebElement> textLinks = driver.findElements(By.className("pHiOh"));
	Iterator<WebElement> it= textLinks.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next().getText());
	}
	
	
	//System.out.println(textLinks.get(5).getText());
	//textLinks.get(1).click();
	
	/*
	 * for(WebElement ele:textLinks) { System.out.println(ele.getText()); }
	 */
	
	
	
	
		
		
		
		
		
		//HTML DOM
		
		//Locators
		
		// ID - Unique 1st Priority (Direct and Fast)
		// Name - Unique 2nd Priority (Direct and Fast)
		// ClassName - Ignore if possible (Duplication)(Direct and Fast)
		
		//Xpath - Create Xpath (Indirect Method)(Indirect)
		//CSS Selector - Create CSS (Indirect Method)
		//TagName - 
		//LinkText - 
		// Partial LinkText - About myself (Dangerous)

	}

}
