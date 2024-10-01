package com.pageobject.program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginTestcase {
	
	@Test
 public void login() {
	System.setProperty("Webdriver.gecko.driver","C:\\Users\\rathi\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();

	PageFactory.initElements(driver,LoginPage.class);
	LoginPage.email.sendKeys("rathinamoorthy24@gmail.com");
	LoginPage.continuebutton.click();
	
}
}