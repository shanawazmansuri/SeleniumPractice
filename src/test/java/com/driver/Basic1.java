package com.driver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic1 {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		//WebDriverManager.chromedriver().browserVersion("12.5").setup();
		WebDriverManager.chromedriver().setup();
		
		//Compulsory
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.co.in");
		
		//driver.navigate().to("https://www.msn.co.in");
		
		//driver.navigate().back();
		
		//driver.navigate().forward();
		
		//driver.navigate().refresh();
		
		//driver.switchTo().newWindow(WindowType.TAB);
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		//driver.navigate().to("https://www.rediff.com");
		
		//driver.manage().window().setPosition(new Point(-2000, 0));
		
		//String url = driver.getCurrentUrl();
		//System.out.println(url);
		
	//	String ps = driver.getPageSource();
		//System.out.println(ps);
		
		//System.out.println(driver.getTitle());
		
		
		
		
		// To close opened tab
		//driver.close();
		// To close window
		//driver.quit();
		
		
		

	}

}
