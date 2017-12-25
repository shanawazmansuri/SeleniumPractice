package fieldPractice;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class iFrame extends Basepage {

	@BeforeTest
	public void Start() {

		Browser("chrome", "http://seleniumpractise.blogspot.in/2017/01/frames-in-selenium-webdriver.html");
		MaximizeBrowser();
		Implicitwait(10);
	}

	@Test
	public void testfrane() {
		FramebyIndex(0);
		WebElement text = Id("sendx-button-T10kP5lglPMgxr20t3do6h");
		text.click();
	}

}
