package testdemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel {
	
	public ThreadLocal<WebDriver>driver = new ThreadLocal<WebDriver>();
	
	public void setDriver(WebDriver driver)
	{
		this.driver.set(driver);
	}
	
	public WebDriver getDriver()
	{
		return this.driver.get();
	}
	
	
	
	@BeforeMethod
	@Parameters({"browserName"})
	public void setUp(String browser)
	{
		browserSetUp(browser);
	
	}
	
	@Test
	public void test1()
	{
		getDriver().manage().window().maximize();
		getDriver().get("https://www.google.co.in");
	}
	
	
	public void browserSetUp(String BrowserName)
	{
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
			//Compulsory
			setDriver(new ChromeDriver()) ;
			
		}
			else if(BrowserName.equalsIgnoreCase("Edge"))
			{
				
				WebDriverManager.edgedriver().setup();
				
				//Compulsory
				setDriver(new EdgeDriver()) ;
				
			}
			
		
	}

}
