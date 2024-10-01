package com.lao.program; //Example of default constructor,here we dint assign any value
//for the String name, but it displayed the value null.

public class ConstructorStudy {
	 static String name; 

	public static void main(String[] args) {

//      We created an object and we called the variable using the object.
//      So in syso we gave (objectname.variable name).
//      We can only call the immediate variables of the class.		
		
		ConstructorStudy learn = new ConstructorStudy();
        System.out.println(learn.name);
        
        
    		
//		Here,without creating a object we used static keyword and in syso we used
//      (ClassName.Variable name)		
		
//        System.out.println(ConstructorStudy.name);
        
        
 
	}

}
