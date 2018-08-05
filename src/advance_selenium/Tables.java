package advance_selenium;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fieldPractice.Basepage;

public class Tables extends Basepage {

	@BeforeMethod()
	public void StartUp() {

		Browser("chrome", "http://toolsqa.com/automation-practice-table/");
		MaximizeBrowser();
		DeleteCookies();
		WaitPageLoadTimeout(10);
		Implicitwait(10);
	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

	@Test(priority = 1, enabled = false)
	public void selectCheckboxGrid() {

		String beforexpath = "//*[@id=\"content\"]/table/tbody/tr[";
		String afterxpath = "]/td[5]";

		for (int i = 1; i <= 4; i++) {

			String values = driver.findElement(By.xpath(beforexpath + i + afterxpath)).getText();

			System.out.println(values);
			if (values.equalsIgnoreCase("2")) {
				driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[" + i + "]/td[6]/a")).click();
				Wait(2000);
				break;

			}

		}

	}

	@Test(priority = 2)
	public void selectCheckboxGridbyxpath() {

		driver.findElement(By.xpath("//td[text()='2']/following-sibling::td/a")).click();
		Wait(2000);

	}

}
