package fieldPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultiSelect {
	WebDriver Driver;
	
	@BeforeTest
	public void Start ()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Setup\\geckodriver.exe");
		Driver = new FirefoxDriver();
		Driver.get("http://toolsqa.com/automation-practice-form/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

	@Test(priority=1)
	public void selectSamples()
	{
		WebElement multiele = Driver.findElement(By.cssSelector("#selenium_commands"));
		Select multislct = new Select(multiele);
		multislct.selectByIndex(0);
		multislct.selectByVisibleText("Wait Commands");
		
		boolean Ismul = multislct.isMultiple(); 
		if (Ismul==true)
		{
			System.out.println("Multiple option is selected");
			
		}
		else
		{
			System.out.println("Multiple option is not selected");
		}
		
		
		List <WebElement> allopt = multislct.getOptions();
		int Alloptcount = allopt.size();
		System.out.println("No of values displayed in multiselect fields are "+Alloptcount);
		for (WebElement eachopt:allopt)
		{
			System.out.println("options displayed in multiselect fields are "+eachopt.getText());
		}
			List <WebElement> allsltopt = multislct.getAllSelectedOptions();
			for(int i=0;i<allsltopt.size();i++) {
			
			WebElement eachele = allsltopt.get(i);	
			String Indhele = eachele.getAttribute("innerHTML");
			System.out.println("Values selected are "+eachele.getText());
			
			if(Indhele.equalsIgnoreCase("switch commands"))
			{
				eachele.click();
				
				break;
			}
			}	
		}
	}