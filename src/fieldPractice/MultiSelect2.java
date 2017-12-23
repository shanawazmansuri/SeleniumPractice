package fieldPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiSelect2 {
	WebDriver driver;

	@BeforeMethod
	public void start() {
		Basepage base = new Basepage();
		base.Browser("chrome", "http://toolsqa.com/automation-practice-form/");
		base.MaximizeBrowser();
		base.Implicitwait(10);

	}

	@Test(priority = 1)
	public void select() {

		WebElement slct = driver.findElement(By.cssSelector("#selenium_commands"));
		Select sel = new Select(slct);
		sel.selectByVisibleText("Wait Commands");
		boolean ismulsel = sel.isMultiple();
		if (ismulsel == true) {
			System.out.println("Element supports multi select function ");
		} else {
			System.out.println("Element does not supports multi select function ");
		}
	}

	@Test(priority = 2)
	public void ValuesandCount() {
		WebElement slct = driver.findElement(By.cssSelector("#selenium_commands"));
		Select sel = new Select(slct);
		List<WebElement> allopt = sel.getOptions();
		int elecount = allopt.size();
		System.out.println("No of options displayed are " + elecount);

		for (WebElement eachele : allopt) {
			String EachEleVal = eachele.getAttribute("innerHTML");
			System.out.println("Option in Elements are " + EachEleVal);

			if (EachEleVal.equalsIgnoreCase("Switch Commands")) {
				eachele.click();
			}
		}

	}
}
