package fieldPractice;

import org.openqa.selenium.WebElement;
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
		WebElement Heading = Xpath("id(\"content\")/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h1[1]");

		AssertTrueEqualsIgnoreCase("practicE automatioN forM", Heading);

	}

	@AfterMethod
	public void Close() {
		CloseBrowser();
	}

}
