package com.driver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://seleniumpractise.blogspot.com/2016/");

		WebElement dating = driver.findElement(By.id("datepicker"));
		dating.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", dating);

		String MonYear = driver.findElement(By.className("ui-datepicker-title")).getText();

		String expectedDay = "6";
		String expectedMonth = "November";
		String expectedYear = "2023";

		String month = MonYear.split(" ")[0].trim();
		String year = MonYear.split(" ")[1].trim();

		while (!(month.equals(expectedMonth) && year.equals(expectedYear))) {

			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();

			MonYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			month = MonYear.split(" ")[0].trim();
			year = MonYear.split(" ")[1].trim();

		}

		driver.findElement(By.xpath("//a[text()='" + expectedDay + "']")).click();

	}
	
	////div[contains(@aria-label,'Jan')]//p[text()='22']

}
