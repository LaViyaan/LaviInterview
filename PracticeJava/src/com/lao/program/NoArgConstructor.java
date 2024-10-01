package com.lao.program;
//Example of No Argument Constructor / Non parameterized constructor

public class NoArgConstructor {
	
	int employeeID;
	String employeeName;
	
// We created a constructor below,
// Here the class name should be same as that of constructor	
	
	NoArgConstructor(){
		employeeID = 1;
	  employeeName = "lavi";
		System.out.println("Employee object is created");
	}

	public static void main(String[] args) {
		
		NoArgConstructor objname = new NoArgConstructor();
         System.out.println("The employee name is "+objname.employeeName);
	}

}
