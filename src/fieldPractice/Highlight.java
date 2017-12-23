package fieldPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Highlight extends Basepage {

	@BeforeTest
	public void Url() {

		Browser("chrome", "http://www.facebook.com");
	}

	@Test
	public void AA() {

		WebElement username = driver.findElement(By.id("email"));
		highLightElement(driver, username);
		username.sendKeys("shanawazqadriattari@yahoo.co.in");
		Screenshot(driver);

		WebElement Pwd = driver.findElement(By.id("pass"));
		highLightElement(driver, Pwd);
		Pwd.sendKeys("Aalahazrat25");
		Screenshot(driver);

		WebElement Btn = driver.findElement(By.id("loginbutton"));
		highLightElement(driver, Btn);
		Btn.click();
		Screenshot(driver);

		// Basepage.QuitBrowser();
	}

}
