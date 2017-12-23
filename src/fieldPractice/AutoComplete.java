package fieldPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoComplete extends Basepage {

	@BeforeTest
	public void Url() {

		Browser("chrome", "http://seleniumpractise.blogspot.in/2016/08/how-to-handle-autocomplete-feature-in.html");

	}

	@Test
	public void autocomplete() {

		driver.findElement(By.id("tags")).sendKeys("A");
		List<WebElement> Allopt = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div"));

		for (int i = 0; i < Allopt.size(); i++) {

			WebElement Option = Allopt.get(i);
			String Display_Opt = Option.getAttribute("innerHTML");
			System.out.println("Values displayed is" + Display_Opt);
			if (Display_Opt.equalsIgnoreCase("Asp")) {
				Option.click();
			}

		}

	}

}
