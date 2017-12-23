package fieldPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;

public class Miscellaneous extends Basepage {

	@BeforeTest
	public void Url() {

		Browser("chrome", "http://toolsqa.com/automation-practice-form/");
	}

	@org.testng.annotations.Test
	public void Test() {

		WebElement aa = driver.findElement(By.name("firstname"));
		String str = "ShanawazMansuri";

		for (char c : str.toCharArray()) {
			aa.sendKeys(Character.toString(c));
		}

		Basepage b1 = new Basepage();

		b1.GetTitle();
		b1.GetCurrentURL();

	}

}
