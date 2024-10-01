package com.first.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertExample {

	public static void main(String[] args) {

		System.setProperty("Webdriver.gecko.driver","C:\\Users\\rathi\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/alerts");
		
		WebElement Alertbox = driver.findElement(By.xpath("//*[@id='alertButton']"));
		Alertbox.click();
		Alert normalalert = driver.switchTo().alert();
		normalalert.accept();
		
		WebElement Confirmbox = driver.findElement(By.xpath("//*[@id='confirmButton']"));
		Confirmbox.click();
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.dismiss();
		
		WebElement Promptbox = driver.findElement(By.xpath("//*[@id='promtButton']"));
		Promptbox.click();
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("Lavanya Rathinamoorthy");
		promptalert.accept();
		
		
		

	}

}
