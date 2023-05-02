package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(
				"https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26adgrpid%3D58355126069%26ext_vrnc%3Dhi%26hvadid%3D486458755421%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062263%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3De%26hvrand%3D8128140236021739024%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2154373%26ref%3Dpd_sl_7hz2t19t5c_e%26tag%3Dgooghydrabk1-21%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

		WebElement following = driver.findElement(By.xpath("//input[@id='ap_phone_number']/following::div"));
		WebElement followingSiblings = driver
				.findElement(By.xpath("//input[@id='ap_phone_number']/following-sibling::div"));
		WebElement preceding = driver.findElement(By.xpath("//input[@id='ap_phone_number']/preceding::div"));
		WebElement precedingSiblings = driver
				.findElement(By.xpath("//div[@class='a-alert-content']/preceding-sibling::i"));
		WebElement ancestor = driver.findElement(By.xpath("//div[@class='a-alert-content']/ancestor::div"));

	}

}
