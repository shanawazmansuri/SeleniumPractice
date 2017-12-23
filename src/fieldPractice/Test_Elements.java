package fieldPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_Elements {

	WebDriver driver;

	public Test_Elements(WebDriver driver) {
		this.driver = driver;

	}

	public void Elements() {
		WebElement mousehover = driver.findElement(By.tagName("strong"));
		WebElement Lastname = driver.findElement(By.name("lastname"));
		WebElement Firstname = driver.findElement(By.name("firstname"));
		WebElement drop = driver.findElement(By.id("continents"));
		List<WebElement> Checknames = driver.findElements(By.xpath("//input[@type='checkbox' and @name ='tool']"));
		List<WebElement> Radiobtnsnames = driver.findElements(By.xpath("//input[@name='exp']"));
		WebElement MultiSelect = driver.findElement(By.cssSelector("#selenium_commands"));
		WebElement UploadFile = driver.findElement(By.id("photo"));
		WebElement Heading = driver.findElement(By.tagName("h1"));
	}

	public WebElement firstName() {
		WebElement firstName = driver.findElement(By.name("firstname"));
		return firstName;

	}

	public WebElement lastName() {
		WebElement Lastname = driver.findElement(By.name("lastname"));
		return Lastname;

	}

}
