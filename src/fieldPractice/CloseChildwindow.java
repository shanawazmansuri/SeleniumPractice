package fieldPractice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CloseChildwindow extends Basepage {

	@BeforeMethod
	public void start() {

		Browser("chrome", "https://www.naukri.com/");
		MaximizeBrowser();
		Implicitwait(5);
	}

	// @AfterMethod
	// public void TearDown() {
	// CloseBrowser();
	// }

	@Test
	public void closewindow() {

		GetWindowHandlesCloseChildWindows();
	}

}
