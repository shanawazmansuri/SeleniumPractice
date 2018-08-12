package fieldPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(fieldPractice.TestngListners.class)
public class Tests extends Basepage {

	@BeforeMethod
	public void start() {

		driver = sslHandlingBrowser("firefox", "https://www.cacert.org/");
		MaximizeBrowser();
		Implicitwait(5);

	}

	@Test(priority = 1)
	public void Form1() {

		String title = GetTitle();
		System.out.println("Title is " + title);

	}

	@AfterMethod
	public void Close() {
		CloseBrowser();
	}

}
