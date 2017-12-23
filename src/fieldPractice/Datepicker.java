package fieldPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker extends Basepage {

	@BeforeTest
	public void Url() {

		Browser("chrome",
				"http://seleniumpractise.blogspot.in/search?updated-max=2016-11-25T02:09:00-08:00&max-results=7&reverse-paginate=true");
	}

	@Test(enabled = false)
	public void SelectingDateSimple() throws InterruptedException {
		driver.findElement(By.cssSelector("#datepicker")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[3]/a")).click();

	}

	@Test(description = "Advance", enabled = true)
	public void SelectingDateAdvance() throws InterruptedException {
		driver.findElement(By.cssSelector("#datepicker")).click();
		Thread.sleep(2000);
		List<WebElement> Dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement ele : Dates) {
			String eachdate = ele.getText();
			if (eachdate.equalsIgnoreCase("17")) {
				ele.click();
			}
		}
	}

}