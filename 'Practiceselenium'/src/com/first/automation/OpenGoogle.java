package com.first.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class OpenGoogle {

	public static void main(String[] args)  {

		//1.browser name and browser location
		//2.chrome open pannanum

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rathi\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		driver.findElement(By.name("q")).sendKeys("Playstation 5"+Keys.ENTER);

	}

} 
