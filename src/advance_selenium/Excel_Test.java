package advance_selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import fieldPractice.Basepage;

public class Excel_Test extends Basepage {
	@BeforeMethod
	public void start() {

		Browser("chrome",
				"http://seleniumpractise.blogspot.in/search?updated-max=2016-12-16T21:13:00-08:00&max-results=7");
		MaximizeBrowser();
		Implicitwait(5);

	}

	@AfterMethod
	public void Close() {
		CloseBrowser();
	}

	@Test(dataProvider = "BasicForm")
	public void ExcelTests(String fName, String lName, String Pwd, String Desc, String Chk, String Rdio, String Drop,
			String Path) {
		Excel_Elements elem = new Excel_Elements(driver);
		highLightElement(driver, elem.Firstname());
		enterText(elem.Firstname(), fName);
		highLightElement(driver, elem.Lastname());
		enterText(elem.Lastname(), lName);
		highLightElement(driver, elem.Password());
		enterText(elem.Password(), Pwd);
		highLightElement(driver, elem.Description());
		Click(elem.Description());
		ClearText(elem.Description());
		enterText(elem.Description(), Desc);
		Checkboxes(elem.Checkboxes(), Chk, "name");
		Radiobuttons(elem.Radiobutton(), Rdio, "value");
		highLightElement(driver, elem.Dropdown());
		Dropbyvisibletext(elem.Dropdown(), Drop);
		highLightElement(driver, elem.FileUpload());
		UploadFile(elem.FileUpload(), Path);
		highLightElement(driver, elem.SubmitBtn());
		Click(elem.SubmitBtn());
		Wait(2000);
		Screenshot(driver);
		System.out.println("Data Entry Done");
	}

	@DataProvider(name = "BasicForm")
	public Object[][] passData() {
		String xlPath = "D:\\Selenium\\ExcelData\\ExcelData.xlsx";
		ExcelDataConfig excl = new ExcelDataConfig(xlPath);
		int rows = excl.getRowCount(0);

		Object[][] data = new Object[rows][8];
		for (int i = 0; i < rows; i++) {

			data[i][0] = excl.getData(0, i + 1, 0);
			data[i][1] = excl.getData(0, i + 1, 1);
			data[i][2] = excl.getData(0, i + 1, 2);
			data[i][3] = excl.getData(0, i + 1, 3);
			data[i][4] = excl.getData(0, i + 1, 4);
			data[i][5] = excl.getData(0, i + 1, 5);
			data[i][6] = excl.getData(0, i + 1, 6);
			data[i][7] = excl.getData(0, i + 1, 7);

		}
		return data;

	}

}
