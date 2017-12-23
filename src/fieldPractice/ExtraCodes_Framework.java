package fieldPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExtraCodes_Framework {
	WebDriver driver;

	public WebElement id(String Locator) {
		WebElement element = driver.findElement(By.id(Locator));
		return element;
	}

	public WebElement CssSelector(String Locator) {
		WebElement element = driver.findElement(By.cssSelector(Locator));
		return element;
	}

	public WebElement TagName(String Locator) {
		WebElement element = driver.findElement(By.tagName(Locator));
		return element;
	}

	public WebElement Name(String Locator) {
		WebElement element = driver.findElement(By.name(Locator));
		return element;
	}

	public WebElement Partialtext(String Locator) {
		WebElement element = driver.findElement(By.partialLinkText(Locator));
		return element;
	}

	public WebElement Xpath(String Locator) {
		WebElement element = driver.findElement(By.xpath(Locator));
		return element;
	}

	public WebElement className(String Locator) {
		WebElement element = driver.findElement(By.className(Locator));
		return element;
	}

}
