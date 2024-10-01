package com.conditional.statements;

public class CustomerDetails {

	static String homePageURL = "https://www.amazon.com/";
	static String loginPageURL = "https://www.amazon.com/loginPage";

	public static void main(String[] args) 
	{
       		String returnedURL = getTo("HomePage");

		System.out.println("The url link is " + returnedURL);
	}
	public static String getTo(String pageName) {


		switch(pageName) 
		{
		case "HomePage": 
		{
			System.out.println("Taking the customer to HomePage");
			return homePageURL;
		}
		case "LoginPage": 
		{
			System.out.println("Taking the customer to HomePage");
			return loginPageURL;
		}
		default: 
		{
			System.out.println("Invalid Page Name!");
			return "URL Empty!";
		}
		}

		/*	public static void navigateTo(String pageName) {


		switch(pageName) 
		{
		case "HomePage": 
		{
			System.out.println("Taking the customer to HomePage");
//			driver.get("https://www.amazon.com/");
			break;
		}
		case "LoginPage": 
		{
			System.out.println("Taking the customer to HomePage");
//			driver.get("https://www.amazon.com/");
			break;
		}
		default: 
		{
			System.out.println("Invalid Page Name!");
			break;
		}
	}*/


		//		if(pageName == "HomePage") 	
		//		{
		//			System.out.println("Taking the customer to HomePage");
		////			driver.get("https://www.amazon.com/");
		//		}
		//		else if(pageName == "LoginPage")
		//		{
		//			System.out.println("Taking the customer to LoginPage");
		////			driver.get("https://www.amazon.com/loginPage");
		//		}
		//		else
		//		{
		//			System.out.println("Invalid Page Name!");
		//		}
	}
}