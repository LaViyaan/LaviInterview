package appiumtests;





import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;

public class Calculator {

	public static AndroidDriver driver;
	
	
	
	public static void main(String[] args) throws MalformedURLException{
		
	
		
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "10");
			capabilities.setCapability("udid", "RZ8NA0EJHQP");
			capabilities.setCapability("deviceName", "Android");
			capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
			capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
			
		
		 URL  url = new URL("http://192.168.1.16:4723/");
			driver= new AndroidDriver(url, capabilities);
			

	}
	

}
