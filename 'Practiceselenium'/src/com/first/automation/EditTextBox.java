package com.first.automation;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EditTextBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rathi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fna.primevideo.com%2Fregion%2Fna%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_t%3Dsg1gGCT59oU9XbnWQ4U3QK8p_WRgcE3m83AieU5SQrU2kAAAAAQAAAABk9X8rcmF3AAAAAPgWC9WfHH8iB-olH_E9xQ%26location%3D%2Fregion%2Fna%2F%3Fref_%253Datv_auth_pre&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_sso_ca&openid.mode=checkid_setup&siteState=131-6316897-2848443&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		WebElement emailBox = driver.findElement(By.xpath("//*[@id='ap_email']"));
		emailBox.sendKeys("lavanya071195@gmail.com" +Keys.ENTER);
	} 

} 
