package fieldPractice;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RadioButton {
	
	WebDriver driver;
	String geturl = "http://toolsqa.com/automation-practice-form/"; 
	
	@Test(priority = 1)
	public void checkdefaulttick() {
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Setup\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(geturl);
		
		WebElement Radio6 = driver.findElement(By.cssSelector("#exp-5"));
		boolean Rad6;
		Rad6 = driver.findElement(By.cssSelector("#exp-5")).isSelected();
		if (Rad6==false){
			
			System.out.println("Radio button 6 is "+Rad6);
			Radio6.click();
		}
		else
			System.out.println("Radio button 6 is "+Rad6);
		
	}
	
	public void TickRadiobyValue () {
		
		List<WebElement> ListRadioEle= driver.findElements(By.xpath("//input[@name='exp']"));
		for (int i=0; i<ListRadioEle.size();i++) {
			WebElement EachRadioele = ListRadioEle.get(i);
			String NameEachRadioEle = EachRadioele.getAttribute("value");
			System.out.println("Values of each element is "+NameEachRadioEle);
			if (NameEachRadioEle.equalsIgnoreCase("5")) {
				EachRadioele.click(); 
			}
		}
		
	}

}
