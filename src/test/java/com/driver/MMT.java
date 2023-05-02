package com.driver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MMT {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.makemytrip.com/flights/?gclid=Cj0KCQiAtICdBhCLARIsALUBFcHdC51Fw34KtVLLv89PDMFbtbQ1MfnSDG5a6ezrHmOnTN_elYC_XSIaArdMEALw_wcB&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Flight_Exact|Expanded|544716708174&s_kwcid=AL!1631!3!544716708174!e!!g!!mmt&ef_id=Cj0KCQiAtICdBhCLARIsALUBFcHdC51Fw34KtVLLv89PDMFbtbQ1MfnSDG5a6ezrHmOnTN_elYC_XSIaArdMEALw_wcB:G:s");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element = driver.findElement(By.xpath("//div[@class=\"makeFlex column flexOne whiteText latoBold\"]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		
		WebElement wb = driver.findElement(By.id("departure"));
		Actions act = new Actions(driver);
		act.click(wb).perform();

	}

}
