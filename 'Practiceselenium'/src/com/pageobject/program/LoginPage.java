package com.pageobject.program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public static class LoginPage {
	
	@FindBy(name = "email")
	public static WebElement email;
	
	@FindBy(id="continue")
	public static WebElement continuebutton;

}
