package fieldPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class EnterCharacter extends Basepage {

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

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
