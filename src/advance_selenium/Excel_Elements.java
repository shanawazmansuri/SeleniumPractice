package advance_selenium;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import fieldPractice.Basepage;

public class Excel_Elements extends Basepage {

	public Excel_Elements(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement Firstname() {
		WebElement firstname = Name("first_name");
		return firstname;

	}

	public WebElement Lastname() {
		WebElement lastname = Name("last_name");
		return lastname;

	}

	public WebElement Password() {
		WebElement Password = Name("password");
		return Password;

	}

	public WebElement Description() {
		WebElement Description = Name("description");
		return Description;
	}

	public List<WebElement> Checkboxes() {
		List<WebElement> chkboxes = Elements("//input[@type='checkbox']");
		return chkboxes;

	}

	public List<WebElement> Radiobutton() {
		List<WebElement> radiobtn = Elements("//input[@type='radio']");
		return radiobtn;

	}

	public WebElement Dropdown() {
		WebElement dropdown = Name("dropdown");
		return dropdown;

	}

	public WebElement FileUpload() {
		WebElement fileupld = Name("fileupload");
		return fileupld;

	}

	public WebElement SubmitBtn() {
		WebElement Submtbtn = Xpath("//input[10]");
		return Submtbtn;

	}

}
