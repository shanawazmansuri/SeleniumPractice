package fieldPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropdownBox {

	String baseurl = "http://toolsqa.com/automation-practice-form/";
	WebDriver driver;

	@BeforeTest
	public void Url() {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Setup\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(baseurl);
	}

	@Test(priority = 1, enabled = false)
	public void Defaultvalue() {
		WebElement Dropdown = driver.findElement(By.id("continents"));
		Select DropValues = new Select(Dropdown);
		WebElement DefaultValue = DropValues.getFirstSelectedOption();
		System.out.println("Default Value is " + DefaultValue.getText());
		Assert.assertTrue(DefaultValue.getText().equalsIgnoreCase("Asia"));
		boolean multi = DropValues.isMultiple();
		if (multi) {

			System.out.println("System allows multiple option to select");
		} else {
			System.out.println("System does not allows multiple option to select");
		}

	}

	@Test(priority = 2, enabled = false)
	public void VerifyValues() {
		WebElement dropdown = driver.findElement(By.id("continents"));
		Select DropdownValues = new Select(dropdown);
		java.util.List<WebElement> DropList = DropdownValues.getOptions();
		int DropValueCount = DropList.size();
		System.out.println("Count of Drop Down List is " + DropValueCount);
		for (WebElement ele : DropList) {
			String EachValue_Drop = ele.getText();
			System.out.println("Values in Drop Down box is " + EachValue_Drop);
		}

	}

	@Test(priority = 3, enabled = false)
	public void SelectValue() {
		WebElement dropdown = driver.findElement(By.id("continents"));
		Select DropValues = new Select(dropdown);
		DropValues.selectByIndex(3);
		DropValues.selectByVisibleText("Africa");

	}

	@Test(priority = 4, enabled = false)
	public void SelectValuesbyLoop() {

		driver.findElement(By.id("continents")).click();
		java.util.List<WebElement> DropList = driver.findElements(By.xpath("//select[@name='continents']//option"));
		for (int i = 0; i < DropList.size(); i++) {
			WebElement Drop_menu = DropList.get(i);
			String innerHTML = Drop_menu.getAttribute("innerHTML");
			if (innerHTML.contains("Australia"))
				;
			{
				Drop_menu.click();
				break;
			}

		}

	}

	@Test(priority = 5)
	public void AssertDropDownValues() {
		WebElement Dropdown = driver.findElement(By.id("continents"));
		Select DropValues = new Select(Dropdown);
		java.util.List<WebElement> DefaultValue = DropValues.getOptions();
		String Cont = "Asia;Europe;Africa;Australia;South America;North America;Antartica";
		String[] ArrCont = Cont.split(";");

		for (String str : ArrCont) {
			boolean found = false;
			for (WebElement ele : DefaultValue) {
				if (str.equals(ele.getText())) {
					found = true;
					System.out.println(str + " Value Exists");
					break;
				}
			}
			if (!found) {
				System.out.println(str + " Value does not Exists");
			}
		}
	}
}
