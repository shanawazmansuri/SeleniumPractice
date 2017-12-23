package fieldPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Checkbox {

	WebDriver driver;
	String Url = "http://toolsqa.com/automation-practice-form/";

	@Test(priority = 1)
	public void clickifnotticked() {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Setup\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(Url);
		driver.manage().window().maximize();

		WebElement Chkbox1 = driver.findElement(By.cssSelector("#profession-0"));
		boolean Chk1 = Chkbox1.isSelected();
		if (Chk1 == false)

		{
			Chkbox1.click();
		}
	}

	@Test(priority = 2)
	public void clickifticked() {

		WebElement Chkbox1 = driver.findElement(By.cssSelector("#profession-0"));
		boolean chk1 = Chkbox1.isSelected();
		if (chk1 == true) {
			Chkbox1.click();
		}

	}

	@Test(priority = 3)
	public void SelectAllcheckbox() {

		List<WebElement> Checkname = driver.findElements(By.xpath("//input[@type='checkbox' and @name ='tool']"));
		for (int i = 0; i < Checkname.size(); i++) {
			WebElement eachcheckele = Checkname.get(i);
			eachcheckele.click();
		}

	}

	@Test(priority = 4)
	public void selectdeselectcomin() {

		List<WebElement> allchkbx = driver.findElements(By.name("profession"));
		boolean chkstus = allchkbx.get(1).isSelected();
		System.out.println("Status of checkbox 1 is" + allchkbx);

		if (chkstus == false) {
			allchkbx.get(1).click();

		}

		else {
			allchkbx.get(0).click();
		}
	}

}
