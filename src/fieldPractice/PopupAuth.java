package fieldPractice;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PopupAuth extends Basepage {

	@BeforeTest
	public void startUp() {
		Browser("chrome", "https://admin:admin@the-internet.herokuapp.com/");
		MaximizeBrowser();
	}

	@Test
	public void authPopup() {

		driver.findElement(By.xpath("//a[@href='/basic_auth']")).click();
		String title = GetTitle();
		System.out.println("Title is " + title);
	}

	public void tearDown() {
		driver.quit();
	}

}
