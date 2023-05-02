package com.prac2;

import java.awt.Window;
import java.time.Duration;
import java.util.Set;

import javax.management.openmbean.CompositeDataView;
import javax.swing.text.TabableView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiWindow {

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

		System.out.println(windows);

		for (String win : windows) {

			driver.switchTo().window(win);

			String title = driver.getTitle();

			if (title.contains("MSN")) {
				driver.close();

			}

			else if (title.contains("The Internet")) {
				System.out.println(driver.getTitle());
				driver.close();
			}

		}

		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());

	}

}
