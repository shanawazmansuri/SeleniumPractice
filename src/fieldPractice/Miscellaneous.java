package fieldPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Miscellaneous extends Basepage {

	@BeforeMethod
	public void Url() {

		headlessBrowser("firefox", "http://toolsqa.com/automation-practice-form/");
	}

	@org.testng.annotations.Test
	public void Test() {

		WebElement aa = driver.findElement(By.name("firstname"));
		String str = "ShanawazMansuri";

		for (char c : str.toCharArray()) {
			aa.sendKeys(Character.toString(c));
		}

		Basepage b1 = new Basepage();

		String title = b1.GetTitle();

		String url = b1.GetCurrentURL();

		System.out.println("Title is " + title);
		System.out.println("URL is " + url);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
