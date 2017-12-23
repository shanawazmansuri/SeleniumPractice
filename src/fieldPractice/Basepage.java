package fieldPractice;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Basepage {

	public WebDriver driver;

	public WebDriver Browser(String BrowserName, String url) {

		if (BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Setup\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (BrowserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (BrowserName.equalsIgnoreCase("IE")) {

			System.setProperty("webdriver.ie.driver", "D:\\Selenium\\Setup\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.get(url);
		return driver;

	}

	// Quiting the Browser//
	public void QuitBrowser() {

		driver.quit();
	}

	// Closing the Browser Tab//
	public void CloseBrowser() {
		driver.close();

	}

	// Maximize Browser//
	public void MaximizeBrowser() {
		driver.manage().window().maximize();
	}

	// Minimize Browser//
	public void MinimizeBrowser() {
		driver.manage().window().setPosition(new Point(-2000, 0));
	}

	// ResizeBrowser Browser//
	public void ResizeBrowser() {
		Dimension d = new Dimension(800, 480);
		driver.manage().window().setSize(d);
	}

	// Full Screen//
	public void FullScreen() {
		driver.manage().window().fullscreen();
	}

	// Back//
	public void Back() {
		driver.navigate().back();
	}

	// Forward//
	public void Forward() {
		driver.navigate().forward();
	}

	// Open Tab in Browser//
	public void OpenTab() {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");

	}

	// SwitchtoNextTab//
	public void SwitchtoNextTab() {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");

	}

	// Open New Window//
	public void OpenNewwindow() {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "n");

	}

	// Accept Alert//
	public void AlertAccept() {
		driver.switchTo().alert().accept();

	}

	// Dismiss Alert//
	public void AlertDismiss() {
		driver.switchTo().alert().dismiss();

	}

	// Alert getText//
	public void AlertGetText() {
		String Alerttext = driver.switchTo().alert().getText();
		System.out.println("Alert Text is " + Alerttext);

	}

	// Alert EnterText //
	public void AlertEnterText(String Values) {
		driver.switchTo().alert().sendKeys(Values);

	}

	// Refresing Browser

	public void Refresh() {
		driver.navigate().refresh();
	}

	// ClearText Browser//

	public void ClearText(WebElement Element) {
		Element.clear();
	}

	// Enter Key//
	public void EnterKey(WebElement Element) {
		Element.sendKeys(Keys.ENTER);

	}

	// click on Element//
	public void Click(WebElement Element) {
		Element.click();
	}

	// Element Displayed//
	public void ElementDisplayed(WebElement Element) {
		if (Element.isDisplayed()) {
			System.out.println("Element is Displayed");
		} else {
			System.out.println("Element is not Available");
		}

	}

	// Element Enabled//
	public void ElementEnabled(WebElement Element) {
		if (Element.isEnabled()) {
			System.out.println("Element is enabled");
		} else {
			System.out.println("Element is disabled");
		}
	}

	// Element Selected//
	public void ElemenSelected(WebElement Element) {
		if (Element.isSelected()) {
			System.out.println("Element is selected");
		} else {
			System.out.println("Element is not selected");
		}
	}

	// Locator///
	public WebElement WebElementLocator(String locatorTpye, String value) {
		By by;
		WebElement element;
		switch (locatorTpye) {
		case "id":
			by = By.id(value);
			element = driver.findElement(by);

			break;
		case "name":
			by = By.name(value);
			element = driver.findElement(by);

			break;
		case "xpath":
			by = By.xpath(value);
			element = driver.findElement(by);
			break;
		case "css":
			by = By.cssSelector(value);
			element = driver.findElement(by);
			break;
		case "linkText":
			by = By.linkText(value);
			element = driver.findElement(by);
			break;
		case "partialLinkText":
			by = By.partialLinkText(value);
			element = driver.findElement(by);
			break;
		case "tagName":
			by = By.tagName(value);
			element = driver.findElement(by);
			break;
		default:
			by = null;
			element = null;
			break;
		}
		return element;

	}

	// GetTitle///
	public void GetTitle() {

		String Title = driver.getTitle();
		System.out.println("Title is " + Title);

	}

	// Get Current URL///
	public void GetCurrentURL() {

		String CurrentUrl = driver.getCurrentUrl();
		System.out.println("Window URL is " + CurrentUrl);

	}

	// Gettext//

	public void Gettext(String Stringtext, WebElement ele) {
		Stringtext = ele.getText();
	}

	// Implicit Wait///
	public void Implicitwait(int time) {

		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}

	// Explicit Wait//
	public void explicitlyWaitToClick(WebElement ele, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public void explicitlyWaitTovisibleElement(WebElement ele, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public void explicitlyWaitAlertPresent(int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void explicitlyWaitcontainTitle(int time, String title) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.titleContains(title));

	}

	public void explicitlyWaitcontaTitleIs(int time, String title) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.titleIs(title));

	}

	public void explicitlyWaitPageLoadTimeout(int time) {
		driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);

	}

	// Thread. Sleep///
	public void Wait(long wait) {
		try {
			Thread.sleep(wait);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void Screenshot(WebDriver driver) {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;

			File src = ts.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(src, new File("D:\\Selenium\\Screenshots\\" + System.currentTimeMillis() + ".png"));

			System.out.println("Screenshot taken");
		} catch (Exception e) {

			System.out.println("Exception while taking screenshot " + e.getMessage());
		}
	}

	// Highlight Elements///
	public void highLightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);
	}

	// Enter text//

	public void enterText(WebElement ele, String values) {
		ele.sendKeys(values);

	}

	// /Mouse Hover///
	public void MouseOver(WebElement ele) {
		Actions actObj = new Actions(driver);
		actObj.moveToElement(ele).build().perform();
	}

	public void Assertequal(WebElement act, String Expected) {
		String actual = act.getText();
		Assert.assertEquals(actual, Expected);

	}

	public void Asserttruecontains(String Expected, WebElement Act) {
		String Actual = Act.getText();
		Assert.assertTrue(Actual.contains(Expected), "Text not matched");
	}

	public void Asserttrueequals(String Expected, WebElement Act) {
		String Actual = Act.getText();
		Assert.assertTrue(Actual.equalsIgnoreCase(Expected), "Text not matched");

	}

	// select the dropdown using "select by visible text"//
	public void Dropbyvisibletext(WebElement ele, String VisibleText) {
		Select selObj = new Select(ele);
		selObj.selectByVisibleText(VisibleText);
	}

	// select the dropdown using "select by index"//
	public void DropbyIndex(WebElement ele, int IndexValue) {
		Select selObj = new Select(ele);
		selObj.selectByIndex(IndexValue);
	}

	// select the dropdown using "select by value", //
	public void Dropbyvalue(WebElement ele, String Value) {
		Select selObj = new Select(ele);
		selObj.selectByValue(Value);

	}

	// Enter Date
	public void DateEnter(WebElement ele, String value) {
		ele.sendKeys(value);
		ele.sendKeys(Keys.TAB);

	}

	// Mouse Hover //
	public void Mousehover(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
	}

	// DragandDrop//
	public void DragandDrop(WebElement WE_Src, WebElement WE_Trg) {
		Actions act = new Actions(driver);
		act.dragAndDrop(WE_Src, WE_Trg).build().perform();
	}

	// Radio button//
	public void Radiobuttons(List<WebElement> ele, String value) {
		for (WebElement element : ele) {
			String Radios = element.getAttribute("value");
			System.out.println("Values of Radio Buttons are " + ele);
			if (Radios.equalsIgnoreCase(value)) {
				element.click();
			}
		}
	}

	// check boxes//
	public void Checkboxes(List<WebElement> ele, String value) {
		List<String> list = new ArrayList<String>(Arrays.asList(value.split(",")));
		for (String check : list) {
			System.out.println("Values of Checkboxes is " + check);
			for (WebElement chk : ele) {
				if (chk.getAttribute("value").equalsIgnoreCase(check))
					chk.click();
			}
		}
	}

	// Multi select dropndown//
	public void MultiSelect(WebElement ele, String Values) {
		Select slct = new Select(ele);

		List<String> list = new ArrayList<String>(Arrays.asList(Values.split(",")));
		for (String check : list) {
			slct.selectByVisibleText(check);
		}
	}

	// AutoComplete//
	public void AutoComplete(WebElement ele, String Values) {
		ele.click();
		ele.sendKeys(Values);
		ele.sendKeys(Keys.TAB);
	}

	// UploadFile//
	public void UploadFile(WebElement ele, String Values) {
		ele.sendKeys(Values);

	}

}