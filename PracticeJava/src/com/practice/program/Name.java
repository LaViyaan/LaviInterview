package com.practice.program;

public class Name {
	
static String husbandName = "Rathinamoorthy";
static String dadName = "Rathinamoorthy";
	
	
	public static String nameCall(String PersonName) {
		
		switch(PersonName)
		{
		case "Lavanya":
		{
			return husbandName;
	   
		}
		case "Viyaan":
		{
			return dadName;
		
		}
		default :
		{
			return "invalid";
		}
	}}
	
	

	public static void main(String[] args) {
		
String returnedName = nameCall("Lavanya");
System.out.println(returnedName);
	

	}

}
