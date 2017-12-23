package fieldPractice;



import org.openqa.grid.web.servlet.handler.SeleniumBasedRequest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(fieldPractice.TestngListners.class)
public class SetGecoDriver {

	@Test
	public void Gecko()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Setup\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();		 
        driver.get("http://www.facebook.com");
        

        System.out.println("Application title is ============="+driver.getTitle());
        

        driver.quit();


	}

}
