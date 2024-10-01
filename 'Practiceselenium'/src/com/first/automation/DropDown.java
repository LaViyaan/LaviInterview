package com.first.automation;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("Webdriver.gecko.driver","C:\\Users\\rathi\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
	WebElement Dropbox = driver.findElement(By.xpath("//*[@id='post-2646']/div[2]/div/div/div/p/select"));
	
	 Select selectbox =new Select(Dropbox);
	  selectbox.selectByIndex(0);
	  selectbox.selectByValue("VAT");
	  selectbox.selectByVisibleText("Hong Kong");
	  
	  java.util.List<WebElement> boxsize =selectbox.getOptions();
	              int size = boxsize.size();
	              System.out.println("The dropdown size is"+size);
	  
	  Dropbox.sendKeys("Aruba");

	}

}
