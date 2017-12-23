package fieldPractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Setup {

	public WebDriver driver;

	@BeforeMethod
	public void start() {
		String baseurl = "http://toolsqa.com/automation-practice-form/";
		Basepage bspage = new Basepage();

		bspage.Browser("Chrome", baseurl);
		bspage.MaximizeBrowser();
		bspage.Implicitwait(10);
	}

	@AfterMethod
	public void Close() {

		Basepage bsPage = new Basepage();
		bsPage.CloseBrowser();

	}

}
