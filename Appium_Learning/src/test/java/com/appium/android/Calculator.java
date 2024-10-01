package com.appium.android;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Calculator {
	



	public static void main(String[] args) {

DesiredCapabilities capabilities =new DesiredCapabilities();
capabilities.setCapability("platformName", "Android");
capabilities.setCapability("platformVersion", "10");
capabilities.setCapability("udid", "RZ8NA0EJHQP");
capabilities.setCapability("deviceName", "Android");
capabilities.setCapability("packageName", "com.sec.android.app.popupcalculator");
capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");


 driver = new AndroidDriver(capabilities);




	}

}
