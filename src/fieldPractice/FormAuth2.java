package fieldPractice;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FormAuth2 extends Basepage {

	@BeforeTest
	public void Url() {

		Browser("chrome", "http://the-internet.herokuapp.com/");
	}

	@Test(priority = 1)
	public void Auth() {

		FormAuth1 mnuclk = new FormAuth1(driver);
		mnuclk.menuclick();
		FormAuth1 log = new FormAuth1(driver);
		log.Auth1("tomsmith", "SuperSecretPassword!");
		FormAuth1 log2 = new FormAuth1(driver);
		log2.Auth2("sa", "admin123");
		log.Auth1("tomsmith", "SuperSecretPassword!");

	}

}
