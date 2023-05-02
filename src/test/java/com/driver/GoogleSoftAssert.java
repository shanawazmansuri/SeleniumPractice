package com.driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSoftAssert {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");

		// Compulsory
		driver = new ChromeDriver(opt);

		driver.manage().window().maximize();

		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		SoftAssert sa = new SoftAssert();
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		List<WebElement> elems = driver.findElements(By.xpath("//div[@jsname='B34EJ']"));
		
		String error1 = elems.get(0).getText();
		String error2 = elems.get(1).getText();
		String error3 = elems.get(2).getText();
		
		sa.assertEquals(error1, "InvalidName");
		sa.assertEquals(error2, "InvalidEmail");
		sa.assertEquals(error3, "InvalidPwd");
		

		
		System.out.println("Completed Tests will Soft assert Failing");
		
		sa.assertAll();
		driver.quit();
		
		
	}
}