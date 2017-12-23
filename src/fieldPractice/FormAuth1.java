package fieldPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormAuth1{
	WebDriver driver;
	By Menu = By.xpath(".//*[@id='content']/ul/li[18]/a");
	By User =By.cssSelector("#username");
	By Pass = By.cssSelector("#password");
	By lgnbtn = By.cssSelector(".radius");
	By logoutbutton = By.cssSelector(".radius");
	By InvalidLoginmsg = By.cssSelector("#flash");
	By Loginmsg = By.xpath(".//*[@id='flash']");
	By Logoutmsg = By.xpath(".//*[@id='flash']");
	
	
	public FormAuth1(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void menuclick() {
		driver.findElement(Menu).click();		
	}
	
	
	public void Auth1(String UserId, String Pwd )
	{	
		
		driver.findElement(User).sendKeys(UserId);
		driver.findElement(Pass).sendKeys(Pwd);
		driver.findElement(lgnbtn).click();
		driver.findElement(logoutbutton).click();
	}
	
	public void Auth2(String UserId, String Pwd )
	{	
		driver.findElement(User).sendKeys(UserId);
		driver.findElement(Pass).sendKeys(Pwd);
		driver.findElement(lgnbtn).click();
	}

	

}
