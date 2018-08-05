package fieldPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParentChildElements extends Basepage {

	@BeforeMethod()
	public void StartUp() {

		Browser("chrome", "https://www.freecrm.com/index.html");
		MaximizeBrowser();
		DeleteCookies();
		WaitPageLoadTimeout(50);
		Implicitwait(50);
	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void ParentChildrelation() {

		driver.findElement(By.name("username")).sendKeys("shanawazmansuri");
		driver.findElement(By.name("password")).sendKeys("Aalahazrat@25");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Wait(9000);
		FramebyName("mainpanel");
		WebElement parent = driver.findElement(By.className("mlddm"));
		WebElement child = parent.findElement(By.xpath("//a[@title='Contacts']"));
		child.click();
		Wait(9000);

	}

}
