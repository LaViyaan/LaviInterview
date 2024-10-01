package com.first.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rathi\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.testleaf.com/");
	//	driver.findElement(By.xpath("//li[@class='nav-item']//a[text()='About']")).click();
		driver.findElement(By.xpath("//li[@class='nav-item']//a[text()='Courses']")).click();
	}

}
 