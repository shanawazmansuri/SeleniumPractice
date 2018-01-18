package fieldPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandle extends Basepage {

	@BeforeMethod
	public void start() {

		Browser("chrome", "http://toolsqa.com/automation-practice-switch-windows/");
		MaximizeBrowser();
		Implicitwait(5);

	}

	@Test(priority = 1)
	public void Windows() {
		driver.findElement(By.id("button1")).click();
		String Homepg = driver.getWindowHandle();
		System.out.println("Home page id is " + Homepg);
		Set<String> windows = driver.getWindowHandles();
		int no_windows = windows.size();
		System.out.println("Number of window opened is " + no_windows);
		Iterator iter = windows.iterator();
		String Parentwindow = iter.next().toString();
		String childwindows = iter.next().toString();
		System.out.println("current window id is " + Parentwindow);
		System.out.println("current window id is " + childwindows);
		driver.switchTo().window(childwindows);
		String title = GetTitle();
		System.out.println("Title of window is " + title);
		driver.close();
	}

}
