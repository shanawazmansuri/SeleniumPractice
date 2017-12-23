package advance_selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import fieldPractice.Basepage;

public class ExcelDataProviderTest {

	public WebDriver driver;

	@BeforeMethod
	public void StartUp() {
		Basepage base = new Basepage();
		driver = base.Browser("chrome", "http://toolsqa.com/automation-practice-form/");
	}

	@AfterMethod
	public void TearDown() {
		System.out.println("End of Test!!");
		driver.quit();
	}

	@Test(dataProvider = "personalData")
	public void ExcelTest1(String fName, String lName, String gen, String prof, String cont, String selCmnds)
			throws InterruptedException, IOException {

		ElementsOnPage elm = new ElementsOnPage(this.driver);
		elm.MainPageElements(fName, lName, Boolean.parseBoolean(gen), Boolean.parseBoolean(prof), cont, selCmnds);
		System.out.println("Data Entry Done");
		Basepage base = new Basepage();
		base.Screenshot(driver);

	}

	@DataProvider(name = "personalData")
	public Object[][] passData() {
		String xlPath = "D:\\Selenium\\ExcelData\\TestData.xlsx";
		ExcelDataConfig excl = new ExcelDataConfig(xlPath);
		int rows = excl.getRowCount(0);

		Object[][] data = new Object[rows][6];
		for (int i = 0; i < rows; i++) {

			data[i][0] = excl.getData(0, i + 1, 0);
			data[i][1] = excl.getData(0, i + 1, 1);
			data[i][2] = excl.getData(0, i + 1, 2);
			data[i][3] = excl.getData(0, i + 1, 3);
			data[i][4] = excl.getData(0, i + 1, 4);
			data[i][5] = excl.getData(0, i + 1, 5);

		}
		return data;

	}

}
