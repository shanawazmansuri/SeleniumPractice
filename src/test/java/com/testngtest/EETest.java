package com.testngtest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EETest{

	@Test
	public void acceptCookies() {

		WebDriverManager.chromedriver().setup();
		// Compulsory
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ee.co.uk/security/home-security");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		/*
		 * int size = driver.findElements(By.tagName("iframe")).size(); String parent =
		 * driver.getWindowHandle(); Set<String> windows = driver.getWindowHandles();
		 		
		System.out.println("Parent Widnow is "+parent);
		System.out.println("Total no. of windows are "+windows);
		System.out.println("Frames are "+size);
 		*/
		
		
		
		//driver.switchTo().frame("defaultpreferencemanager");
		
		//__gwt_historyFrame
		//gwt-Frame
		//defaultpreferencemanager
		//pop-frame0626509339037759
		  //pop-frame0626509339037759
		
		
		
		/*
		 * String iframeName =
		 * driver.findElement(By.tagName("iframe")).getAttribute("title");
		 * System.out.println(iframeName);
		 */
		//driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='pop-frame0626509339037759']")));
		//WebElement frame = driver.findElement(By.xpath("//iframe[@class='gwt-Frame']"));
		//driver.switchTo().frame(frame);
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='gwt-Frame']")));
		
		
		/*
		 * WebElement fr = driver.findElement(By.className("truste_popframe"));
		 * driver.switchTo().frame(fr);
		 */
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@id,'pop-frame')]")));
		driver.findElement(By.xpath("//a[@class='call']")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[text()='Log in for Home Security plans']")).click();
		driver.findElement(By.id("signInName")).sendKeys("Dummy");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("password")).sendKeys("DummyPwd");
		driver.findElement(By.id("next")).click();
		

	}

}
