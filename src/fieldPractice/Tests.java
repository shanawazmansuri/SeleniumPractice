package fieldPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import advance_selenium.Excel_Elements;

@Listeners(fieldPractice.TestngListners.class)
public class Tests extends Basepage {

	@BeforeMethod
	public void start() {

		Browser("chrome",
				"http://seleniumpractise.blogspot.in/search?updated-max=2016-12-16T21:13:00-08:00&max-results=7");
		MaximizeBrowser();
		Implicitwait(5);

	}

	@Test(priority = 1)
	public void Form1() {

		Excel_Elements elem = new Excel_Elements(driver);
		highLightElement(driver, elem.Firstname());
		enterText(elem.Firstname(), "Shanawaz");
		highLightElement(driver, elem.Lastname());
		enterText(elem.Lastname(), "Mansuri");
		highLightElement(driver, elem.Password());
		enterText(elem.Password(), "Aalahazrat");
		highLightElement(driver, elem.Description());
		Click(elem.Description());
		ClearText(elem.Description());
		enterText(elem.Description(), "This site is tested by Shanawaz Mansuri");
		Checkboxes(elem.Checkboxes(), "Maths,Physics");
		Radiobuttons(elem.Radiobutton(), "Physics");
		highLightElement(driver, elem.Dropdown());
		Dropbyvisibletext(elem.Dropdown(), "Physics");
		highLightElement(driver, elem.FileUpload());
		UploadFile(elem.FileUpload(), "C:\\Users\\USER\\Desktop\\Shanawaz_Resume.doc");
		highLightElement(driver, elem.SubmitBtn());
		Click(elem.SubmitBtn());
		Wait(4000);
		Screenshot(driver);
	}

	@AfterMethod
	public void Close() {
		CloseBrowser();
	}

}
