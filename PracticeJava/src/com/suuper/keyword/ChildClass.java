package com.suuper.keyword;

public class ChildClass extends ParentClass {
	
	ChildClass(){
//		super(); this keyword will not be visible for naked eye and this comes in inheritance concept when we use parent and child class.
		// here we dint create object for parent class, we only created object for child class but in output we got the syso of parent class first 
		
		System.out.println("Childclass");
	}

	public static void main(String[] args) {
		
		ChildClass objname = new ChildClass();
		
	}

}
//Example for super keyword.
//Super keyword will be invoked if we extend the parent class in the child class and that super keyword will not be for naked eye.