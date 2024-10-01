package com.first.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonExample {
	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.gecko.driver","C:\\Users\\rathi\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https"
				+ "%3A%2F%2Fwww.amazon.ca%2Fs%3Fk%3Damazon%2Blogin%2Bto%2Bmy%2Baccount%26hvad"
				+ "id%3D556129898822%26hvdev%3Dc%26hvlocphy%3D9001502%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3"
				+ "D13579107090358153524%26hvtargid%3Dkwd-364435124097%26hydadcr%3D3321_10311071%26"
				+ "tag%3Dgoogcana-20%26ref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%"
				+ "2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_se"
				+ "tup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fiden"
				+ "tifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("lavanya071195@gmail.com" +Keys.ENTER);
		
//Here we are finding the xyposition of continue button
//1st line we are finding the element 
//To find the position there is a function called getLocation() and there is a class to store it called Point  		
		
		
		  WebElement continuebuttonposition  =driver.findElement(By.xpath("//*[@id='continue']"));
		       Point xypoint =continuebuttonposition.getLocation();
		         int xValue  = xypoint.getX();
		         int yValue  = xypoint.getY();
		         
		         System.out.println("X value is:"+xValue +" Y value is:" +yValue);
		
// To find the outlinecolor of the textbox  =getcssvalue();
		         WebElement boxcolor = driver.findElement(By.xpath("//*[@id='ap_email']"));
		              String color   = boxcolor.getCssValue("border-color");
		              System.out.println("The Email text box color is:"+color);
		
//To find the size of the button

		    WebElement buttonsize  =driver.findElement(By.xpath("//*[@id='continue']")); 
		        int height         = buttonsize.getSize().getHeight();
		        int width          = buttonsize.getSize().getWidth();
		        System.out.println("The height of the button is:"+ height + "The width of the button is:"+width);
		              
//To click the button
		        WebElement button  =driver.findElement(By.xpath("//*[@id='continue']")); 
		                                 button.click();
		        
}
}