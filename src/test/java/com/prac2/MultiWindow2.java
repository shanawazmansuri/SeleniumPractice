package com.prac2;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultiWindow2 {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Codes\\SeleniumPractice\\Drivers\\chromedriver.exe");

		// Compulsory
		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/windows");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		driver.switchTo().newWindow(WindowType.TAB);

		driver.navigate().to("https://www.msn.co.in");

		String homePg = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {
			String win = it.next();
			driver.switchTo().window(win);

			String title = driver.getTitle();
			if (title.contains("New Window")) {
				System.out.println("Closing 1st window " + driver.getTitle());
				driver.close();
			}

			else if (title.contains("MSN")) {
				System.out.println("Closing 2nd window " + driver.getTitle());
				driver.close();
			}
			
			else
			{

				driver.switchTo().defaultContent();
				System.out.println(driver.getTitle());
			}
			
		}
		

		
		

		

	}

}
