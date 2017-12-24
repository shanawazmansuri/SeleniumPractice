package fieldPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(fieldPractice.TestngListners.class)
public class Tests extends Basepage {

	@BeforeMethod
	public void start() {

		Browser("chrome", "http://toolsqa.com/automation-practice-form/");
		MaximizeBrowser();
		Implicitwait(5);

	}

	@Test(priority = 1)
	public void testing() {

		// Test_Elements elem = new Test_Elements(driver);
		WebElement slct = driver.findElement(By.cssSelector("#selenium_commands"));
		Select sel = new Select(slct);
		List<WebElement> allopt = sel.getOptions();

		for (WebElement ele : allopt) {
			ele.click();
			IsSelected(ele);
		}

		// WebElement text = Locator("id", "tags");
		// driver.findElement(By.id("tags")).sendKeys("A");
		// List<WebElement> listele =
		// driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div"));
		// for (WebElement ele : listele) {
		// String perelement = ele.getAttribute("innerHTML");
		// if (perelement.equalsIgnoreCase("Asp")) {

		// ele.click();
		// Wait(2000);
		// }

		// }

	}

	@AfterMethod
	public void Close() {
		CloseBrowser();
	}

}
