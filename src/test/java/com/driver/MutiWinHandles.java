package com.driver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutiWinHandles {

	public static void main(String[] args) throws InterruptedException {

		// Compulsory
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//driver.get("http://seleniumpractise.blogspot.com/2017/05/blog-post.html");
		
		

		List<WebElement> links = driver.findElements(By.xpath("//div[@id='post-body-3980379804063727309']/a"));

		for (WebElement li : links) {
			li.click();
		}

		// Parent/HomePage id is generated with getWindowHandle
		// CDwindow-106A30CEA8A9207C7EC8054DCA0E033E
		String parent = driver.getWindowHandle();
		System.out.println(parent);

		// System.out.println(driver.getTitle());
		int sizeofwindow = driver.getWindowHandles().size();
		System.out.println(sizeofwindow);

		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);

		
		//COnvert Set of String to Array List
		List<String> ls = new ArrayList<String>(allWindow);
		
		

		
		  for (String s : ls) {
		  
		  String title = driver.switchTo().window(s).getTitle();
		  System.out.println("All windows title is " + title);
		  
		  if (title.equals("Facebook – log in or sign up")) {
		  driver.switchTo().window(s); System.out.println(driver.getTitle() + " " +
		  driver.getCurrentUrl()); driver.close();
		  
		  break;
		  
		  } }
		 

		/*
		 * Iterator<String> it = allWindow.iterator();
		 * 
		 * while (it.hasNext()) { String child = it.next(); if (!(parent.equals(child)))
		 * { driver.switchTo().window(child); driver.close(); }
		 * 
		 * }
		 * 
		 * 
		 */
		
		/*
		 * driver.switchTo().window(parent); System.out.println(driver.getTitle());
		 */
	}

}
