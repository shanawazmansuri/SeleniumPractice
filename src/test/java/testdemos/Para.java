package testdemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Para {
	
	WebDriver driver; 

	@Test
	public void test1()
	{
		WebDriverManager.chromedriver().setup();
		
		//Compulsory
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/");
	}
	
	@Test
	public void test2()
	{
		WebDriverManager.chromedriver().setup();
		
		//Compulsory
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.co.in");
	}

}
