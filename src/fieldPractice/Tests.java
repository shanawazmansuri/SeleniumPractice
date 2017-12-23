package fieldPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(fieldPractice.TestngListners.class)
public class Tests extends Basepage {

	@BeforeMethod
	public void start() {

		Browser("chrome",
				"http://seleniumpractise.blogspot.in/search?updated-max=2016-12-16T21:13:00-08:00&max-results=7");
		MaximizeBrowser();
		Implicitwait(5);

	}

	@Test(priority = 1)
	public void testing() {

		By Alt = By.xpath("id(\"datepicker\")");
		WebElement ale = driver.findElement(Alt);

		WebElement nawazh = WebElementLocator("Id", "ss");
		ExtraCodes_Framework elem = new ExtraCodes_Framework();
		WebElement shanawaz = elem.id("aaasdsdsds");

		Wait(9000);
		DateEnter(ale, "12/21/2017");
		Wait(9000);

	}

	@AfterMethod
	public void Close() {
		CloseBrowser();
	}

}
