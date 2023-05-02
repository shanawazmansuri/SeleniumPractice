package com.driver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Act {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		//Compulsory
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/jqueryui/menu");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebElement box = driver.findElement(By.id("hot-spot"));
		
		Actions act = new Actions(driver);
		
		//Perform method is compulsory to perform any single action
		//Build is optional for single action
		//build and perform both are compusory for performing multi actions
		
		//act.contextClick(box).build().perform();
		
	//	WebElement src = driver.findElement(By.id("draggable"));
		//WebElement trg = driver.findElement(By.id("droppable"));
		
		//act.clickAndHold(src).moveToElement(trg).release().perform();
		
		//act.dragAndDrop(src, trg).perform();
		
		///////////////////////////////
		
		//Menus
		
		
		WebElement enabled = driver.findElement(By.xpath("//a[text()='Enabled']"));
		act.moveToElement(enabled).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement download = driver.findElement(By.xpath("//a[text()='Downloads']"));
		wait.until(ExpectedConditions.elementToBeClickable(download));
		act.moveToElement(download).perform();
		
		WebElement Excel = driver.findElement(By.xpath("//a[text()='Excel']"));
		wait.until(ExpectedConditions.elementToBeClickable(Excel));
		act.moveToElement(Excel).click().perform();
		
		
		
		
		
		
		
		

	}

}
