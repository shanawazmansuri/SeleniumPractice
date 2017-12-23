package fieldPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandles extends Basepage {

	@BeforeTest
	public void Url() {
		Browser("chrome", "http://www.seleniumframework.com/Practiceform/");
		MaximizeBrowser();
		Implicitwait(20);
	}

	@Test(priority = 1)
	public void Alert() throws InterruptedException {

		driver.findElement(By.id("alert")).click();
		Thread.sleep(3000);
		String Popupmsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertTrue(Popupmsg.contains("Please share this website with your friends and in your organization."));
	}

	@Test(priority = 2)
	public void SwitchTab() throws InterruptedException {

		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div[1]/div/p[4]/button")).click();
		String Home_Page = driver.getWindowHandle();
		System.out.println(Home_Page);
		Set<String> windows = driver.getWindowHandles();
		System.out.println("No. of windows opened is " + windows.size());
		Iterator Iterate = windows.iterator();
		while (Iterate.hasNext()) {
			String CurrentwindowsId = Iterate.next().toString();
			System.out.println(CurrentwindowsId);
			if (!CurrentwindowsId.equals(Home_Page)) {

				driver.switchTo().window(CurrentwindowsId);
				driver.findElement(By.xpath(".//*[@id='main-nav']/li[8]/a/span")).click();
				driver.close();
			}
		}

	}

}
