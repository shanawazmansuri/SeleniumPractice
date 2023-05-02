package com.driver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demos2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		// Compulsory
		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");

		driver.manage().window().maximize();
		
		String parent = driver.getWindowHandle();

		/*driver.findElement(By.xpath("//div[@id='post-body-6170641642826198246']/a[1]")).click();
		driver.findElement(By.xpath("//div[@id='post-body-6170641642826198246']/a[2]")).click();
		driver.findElement(By.xpath("//div[@id='post-body-6170641642826198246']/a[3]")).click();
		driver.findElement(By.xpath("//div[@id='post-body-6170641642826198246']/a[4]")).click();

		String parent = driver.getWindowHandle();

		System.out.println(parent);

		Set<String> totWin = driver.getWindowHandles();

		int noOfWin = totWin.size();

		System.out.println(noOfWin);

		System.out.println(totWin);

		Iterator iter = totWin.iterator();

		while (iter.hasNext()) {
			String childWindow = (String) iter.next();
			if (!(parent.equals(childWindow))) {
				driver.switchTo().window(childWindow);
				driver.close();

			}

		}

		driver.switchTo().window(parent);
		driver.close();
		*/
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.msn.co.in");
		
		Set<String> totalWin = driver.getWindowHandles();
		
		Iterator it = totalWin.iterator();
		
		while(it.hasNext())
		{
			
			String child = (String) it.next();
			
			if(!(parent.equals(child)))
			{
				driver.switchTo().window(child);
				
				driver.close();
				
				
			}
		
		}
		
		
		driver.switchTo().window(parent);
		
		System.out.println(driver.getTitle());
		
		
		
		

	}

}
