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

		Browser("chrome", "http://toolsqa.com/iframe-practice-page/");
		MaximizeBrowser();
		Implicitwait(5);

	}

	@Test(priority = 1)
	public void Form1() {

		WebElement head = driver.findElement(By.xpath("//h1[@class='entry-title']"));
		String heading = Gettext(head);
		System.out.println("Text is " + heading);
	}

	@AfterMethod
	public void Close() {
		CloseBrowser();
	}

}
