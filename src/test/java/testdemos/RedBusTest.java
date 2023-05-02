package testdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusTest {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");

		// Compulsory
		driver = new ChromeDriver(opt);

		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");

		driver.findElement(By.id("onward_cal")).click();

		String currDate = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();

		

		while (!currDate.equals("Jun 2023")) {

			driver.findElement(By.xpath("//tbody/tr[1]/td[3]/button")).click();
			currDate = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
			
			if(currDate.equals("Jun 2023"))
			{
				driver.findElement(By.xpath("//td[text()='24']")).click();
			}

			}

		}

	}

