package com.driver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demos {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		// Compulsory
		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2021/");

		driver.manage().window().maximize();

		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));

		// driver.findElement(By.xpath("//td[text()='Amazon']/preceding-sibling::td/input")).click();

		// driver.findElement(By.xpath("//td[text()='Amazon']/following-sibling::td/a")).click();

		for (WebElement ele : row) {
			String txt = ele.getText();
			System.out.println(txt);

			if (txt.equals("Amazon")) {
				driver.findElement(By.xpath("//td[text()='" + txt + "']/preceding-sibling::td/input")).click();
				driver.findElement(By.xpath("//td[text()='" + txt + "']/following-sibling::td/a")).click();

				break;
			}

		}

	}

}
